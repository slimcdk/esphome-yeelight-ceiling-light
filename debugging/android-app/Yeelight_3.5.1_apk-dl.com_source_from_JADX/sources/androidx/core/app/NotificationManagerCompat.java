package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.provider.Settings;
import android.support.p004v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    @GuardedBy("sEnabledNotificationListenersLock")
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    @GuardedBy("sEnabledNotificationListenersLock")
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static final Object sLock = new Object();
    @GuardedBy("sLock")
    private static SideChannelManager sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;

    private static class CancelTask implements Task {
        final boolean all;

        /* renamed from: id */
        final int f80id;
        final String packageName;
        final String tag;

        CancelTask(String str) {
            this.packageName = str;
            this.f80id = 0;
            this.tag = null;
            this.all = true;
        }

        CancelTask(String str, int i, String str2) {
            this.packageName = str;
            this.f80id = i;
            this.tag = str2;
            this.all = false;
        }

        public void send(INotificationSideChannel iNotificationSideChannel) {
            if (this.all) {
                iNotificationSideChannel.cancelAll(this.packageName);
            } else {
                iNotificationSideChannel.cancel(this.packageName, this.f80id, this.tag);
            }
        }

        @NonNull
        public String toString() {
            return "CancelTask[" + "packageName:" + this.packageName + ", id:" + this.f80id + ", tag:" + this.tag + ", all:" + this.all + "]";
        }
    }

    private static class NotifyTask implements Task {

        /* renamed from: id */
        final int f81id;
        final Notification notif;
        final String packageName;
        final String tag;

        NotifyTask(String str, int i, String str2, Notification notification) {
            this.packageName = str;
            this.f81id = i;
            this.tag = str2;
            this.notif = notification;
        }

        public void send(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.notify(this.packageName, this.f81id, this.tag, this.notif);
        }

        @NonNull
        public String toString() {
            return "NotifyTask[" + "packageName:" + this.packageName + ", id:" + this.f81id + ", tag:" + this.tag + "]";
        }
    }

    private static class ServiceConnectedEvent {
        final ComponentName componentName;
        final IBinder iBinder;

        ServiceConnectedEvent(ComponentName componentName2, IBinder iBinder2) {
            this.componentName = componentName2;
            this.iBinder = iBinder2;
        }
    }

    private static class SideChannelManager implements Handler.Callback, ServiceConnection {
        private static final int MSG_QUEUE_TASK = 0;
        private static final int MSG_RETRY_LISTENER_QUEUE = 3;
        private static final int MSG_SERVICE_CONNECTED = 1;
        private static final int MSG_SERVICE_DISCONNECTED = 2;
        private Set<String> mCachedEnabledPackages = new HashSet();
        private final Context mContext;
        private final Handler mHandler;
        private final HandlerThread mHandlerThread;
        private final Map<ComponentName, ListenerRecord> mRecordMap = new HashMap();

        private static class ListenerRecord {
            boolean bound = false;
            final ComponentName componentName;
            int retryCount = 0;
            INotificationSideChannel service;
            ArrayDeque<Task> taskQueue = new ArrayDeque<>();

            ListenerRecord(ComponentName componentName2) {
                this.componentName = componentName2;
            }
        }

        SideChannelManager(Context context) {
            this.mContext = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper(), this);
        }

        private boolean ensureServiceBound(ListenerRecord listenerRecord) {
            if (listenerRecord.bound) {
                return true;
            }
            boolean bindService = this.mContext.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(listenerRecord.componentName), this, 33);
            listenerRecord.bound = bindService;
            if (bindService) {
                listenerRecord.retryCount = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to bind to listener ");
                sb.append(listenerRecord.componentName);
                this.mContext.unbindService(this);
            }
            return listenerRecord.bound;
        }

        private void ensureServiceUnbound(ListenerRecord listenerRecord) {
            if (listenerRecord.bound) {
                this.mContext.unbindService(this);
                listenerRecord.bound = false;
            }
            listenerRecord.service = null;
        }

        private void handleQueueTask(Task task) {
            updateListenerMap();
            for (ListenerRecord next : this.mRecordMap.values()) {
                next.taskQueue.add(task);
                processListenerQueue(next);
            }
        }

        private void handleRetryListenerQueue(ComponentName componentName) {
            ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceConnected(ComponentName componentName, IBinder iBinder) {
            ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                listenerRecord.service = INotificationSideChannel.Stub.asInterface(iBinder);
                listenerRecord.retryCount = 0;
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceDisconnected(ComponentName componentName) {
            ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                ensureServiceUnbound(listenerRecord);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void processListenerQueue(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r6) {
            /*
                r5 = this;
                java.lang.String r0 = "NotifManCompat"
                r1 = 3
                boolean r2 = android.util.Log.isLoggable(r0, r1)
                if (r2 == 0) goto L_0x002b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Processing component "
                r2.append(r3)
                android.content.ComponentName r3 = r6.componentName
                r2.append(r3)
                java.lang.String r3 = ", "
                r2.append(r3)
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r3 = r6.taskQueue
                int r3 = r3.size()
                r2.append(r3)
                java.lang.String r3 = " queued tasks"
                r2.append(r3)
            L_0x002b:
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r6.taskQueue
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0034
                return
            L_0x0034:
                boolean r2 = r5.ensureServiceBound(r6)
                if (r2 == 0) goto L_0x0093
                android.support.v4.app.INotificationSideChannel r2 = r6.service
                if (r2 != 0) goto L_0x003f
                goto L_0x0093
            L_0x003f:
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r6.taskQueue
                java.lang.Object r2 = r2.peek()
                androidx.core.app.NotificationManagerCompat$Task r2 = (androidx.core.app.NotificationManagerCompat.Task) r2
                if (r2 != 0) goto L_0x004a
                goto L_0x0087
            L_0x004a:
                boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ DeadObjectException -> 0x0078, RemoteException -> 0x0068 }
                if (r3 == 0) goto L_0x005d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ DeadObjectException -> 0x0078, RemoteException -> 0x0068 }
                r3.<init>()     // Catch:{ DeadObjectException -> 0x0078, RemoteException -> 0x0068 }
                java.lang.String r4 = "Sending task "
                r3.append(r4)     // Catch:{ DeadObjectException -> 0x0078, RemoteException -> 0x0068 }
                r3.append(r2)     // Catch:{ DeadObjectException -> 0x0078, RemoteException -> 0x0068 }
            L_0x005d:
                android.support.v4.app.INotificationSideChannel r3 = r6.service     // Catch:{ DeadObjectException -> 0x0078, RemoteException -> 0x0068 }
                r2.send(r3)     // Catch:{ DeadObjectException -> 0x0078, RemoteException -> 0x0068 }
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r6.taskQueue     // Catch:{ DeadObjectException -> 0x0078, RemoteException -> 0x0068 }
                r2.remove()     // Catch:{ DeadObjectException -> 0x0078, RemoteException -> 0x0068 }
                goto L_0x003f
            L_0x0068:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "RemoteException communicating with "
            L_0x006f:
                r0.append(r1)
                android.content.ComponentName r1 = r6.componentName
                r0.append(r1)
                goto L_0x0087
            L_0x0078:
                boolean r0 = android.util.Log.isLoggable(r0, r1)
                if (r0 == 0) goto L_0x0087
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Remote service has died: "
                goto L_0x006f
            L_0x0087:
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r0 = r6.taskQueue
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0092
                r5.scheduleListenerRetry(r6)
            L_0x0092:
                return
            L_0x0093:
                r5.scheduleListenerRetry(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationManagerCompat.SideChannelManager.processListenerQueue(androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord):void");
        }

        private void scheduleListenerRetry(ListenerRecord listenerRecord) {
            if (!this.mHandler.hasMessages(3, listenerRecord.componentName)) {
                int i = listenerRecord.retryCount + 1;
                listenerRecord.retryCount = i;
                if (i > 6) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Giving up on delivering ");
                    sb.append(listenerRecord.taskQueue.size());
                    sb.append(" tasks to ");
                    sb.append(listenerRecord.componentName);
                    sb.append(" after ");
                    sb.append(listenerRecord.retryCount);
                    sb.append(" retries");
                    listenerRecord.taskQueue.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Scheduling retry for ");
                    sb2.append(i2);
                    sb2.append(" ms");
                }
                this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(3, listenerRecord.componentName), (long) i2);
            }
        }

        private void updateListenerMap() {
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.mContext);
            if (!enabledListenerPackages.equals(this.mCachedEnabledPackages)) {
                this.mCachedEnabledPackages = enabledListenerPackages;
                List<ResolveInfo> queryIntentServices = this.mContext.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (enabledListenerPackages.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.mRecordMap.containsKey(componentName2)) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Adding listener record for ");
                            sb2.append(componentName2);
                        }
                        this.mRecordMap.put(componentName2, new ListenerRecord(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, ListenerRecord>> it = this.mRecordMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Removing listener record for ");
                            sb3.append(next2.getKey());
                        }
                        ensureServiceUnbound((ListenerRecord) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                handleQueueTask((Task) message.obj);
                return true;
            } else if (i == 1) {
                ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                handleServiceConnected(serviceConnectedEvent.componentName, serviceConnectedEvent.iBinder);
                return true;
            } else if (i == 2) {
                handleServiceDisconnected((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                handleRetryListenerQueue((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
            }
            this.mHandler.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
            }
            this.mHandler.obtainMessage(2, componentName).sendToTarget();
        }

        public void queueTask(Task task) {
            this.mHandler.obtainMessage(0, task).sendToTarget();
        }
    }

    private interface Task {
        void send(INotificationSideChannel iNotificationSideChannel);
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    @NonNull
    public static NotificationManagerCompat from(@NonNull Context context) {
        return new NotificationManagerCompat(context);
    }

    @NonNull
    public static Set<String> getEnabledListenerPackages(@NonNull Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                if (!string.equals(sEnabledNotificationListeners)) {
                    String[] split = string.split(Constants.COLON_SEPARATOR, -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    sEnabledNotificationListenerPackages = hashSet;
                    sEnabledNotificationListeners = string;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(Task task) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new SideChannelManager(this.mContext.getApplicationContext());
            }
            sSideChannelManager.queueTask(task);
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public boolean areNotificationsEnabled() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.mNotificationManager.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.mContext.getSystemService("appops");
        ApplicationInfo applicationInfo = this.mContext.getApplicationInfo();
        String packageName = this.mContext.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod(CHECK_OP_NO_THROW, new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField(OP_POST_NOTIFICATION).get(Integer.class)).intValue()), Integer.valueOf(i2), packageName})).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void cancel(int i) {
        cancel((String) null, i);
    }

    public void cancel(@Nullable String str, int i) {
        this.mNotificationManager.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            pushSideChannelQueue(new CancelTask(this.mContext.getPackageName(), i, str));
        }
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
        if (Build.VERSION.SDK_INT <= 19) {
            pushSideChannelQueue(new CancelTask(this.mContext.getPackageName()));
        }
    }

    public void createNotificationChannel(@NonNull NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void createNotificationChannel(@NonNull NotificationChannelCompat notificationChannelCompat) {
        createNotificationChannel(notificationChannelCompat.getNotificationChannel());
    }

    public void createNotificationChannelGroup(@NonNull NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public void createNotificationChannelGroup(@NonNull NotificationChannelGroupCompat notificationChannelGroupCompat) {
        createNotificationChannelGroup(notificationChannelGroupCompat.getNotificationChannelGroup());
    }

    public void createNotificationChannelGroups(@NonNull List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroups(list);
        }
    }

    public void createNotificationChannelGroupsCompat(@NonNull List<NotificationChannelGroupCompat> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (NotificationChannelGroupCompat notificationChannelGroup : list) {
                arrayList.add(notificationChannelGroup.getNotificationChannelGroup());
            }
            this.mNotificationManager.createNotificationChannelGroups(arrayList);
        }
    }

    public void createNotificationChannels(@NonNull List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannels(list);
        }
    }

    public void createNotificationChannelsCompat(@NonNull List<NotificationChannelCompat> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (NotificationChannelCompat notificationChannel : list) {
                arrayList.add(notificationChannel.getNotificationChannel());
            }
            this.mNotificationManager.createNotificationChannels(arrayList);
        }
    }

    public void deleteNotificationChannel(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannel(str);
        }
    }

    public void deleteNotificationChannelGroup(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannelGroup(str);
        }
    }

    public void deleteUnlistedNotificationChannels(@NonNull Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (NotificationChannel next : this.mNotificationManager.getNotificationChannels()) {
                if (!collection.contains(next.getId()) && (Build.VERSION.SDK_INT < 30 || !collection.contains(next.getParentChannelId()))) {
                    this.mNotificationManager.deleteNotificationChannel(next.getId());
                }
            }
        }
    }

    public int getImportance() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.mNotificationManager.getImportance();
        }
        return -1000;
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannel(str);
        }
        return null;
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String str, @NonNull String str2) {
        return Build.VERSION.SDK_INT >= 30 ? this.mNotificationManager.getNotificationChannel(str, str2) : getNotificationChannel(str);
    }

    @Nullable
    public NotificationChannelCompat getNotificationChannelCompat(@NonNull String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new NotificationChannelCompat(notificationChannel);
    }

    @Nullable
    public NotificationChannelCompat getNotificationChannelCompat(@NonNull String str, @NonNull String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new NotificationChannelCompat(notificationChannel);
    }

    @Nullable
    public NotificationChannelGroup getNotificationChannelGroup(@NonNull String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return this.mNotificationManager.getNotificationChannelGroup(str);
        }
        if (i >= 26) {
            for (NotificationChannelGroup next : getNotificationChannelGroups()) {
                if (next.getId().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    @Nullable
    public NotificationChannelGroupCompat getNotificationChannelGroupCompat(@NonNull String str) {
        NotificationChannelGroup notificationChannelGroup;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new NotificationChannelGroupCompat(notificationChannelGroup2);
            }
            return null;
        } else if (i < 26 || (notificationChannelGroup = getNotificationChannelGroup(str)) == null) {
            return null;
        } else {
            return new NotificationChannelGroupCompat(notificationChannelGroup, getNotificationChannels());
        }
    }

    @NonNull
    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return Build.VERSION.SDK_INT >= 26 ? this.mNotificationManager.getNotificationChannelGroups() : Collections.emptyList();
    }

    @NonNull
    public List<NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                List<NotificationChannel> emptyList = i >= 28 ? Collections.emptyList() : getNotificationChannels();
                ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
                for (NotificationChannelGroup next : notificationChannelGroups) {
                    arrayList.add(Build.VERSION.SDK_INT >= 28 ? new NotificationChannelGroupCompat(next) : new NotificationChannelGroupCompat(next, emptyList));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @NonNull
    public List<NotificationChannel> getNotificationChannels() {
        return Build.VERSION.SDK_INT >= 26 ? this.mNotificationManager.getNotificationChannels() : Collections.emptyList();
    }

    @NonNull
    public List<NotificationChannelCompat> getNotificationChannelsCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                ArrayList arrayList = new ArrayList(notificationChannels.size());
                for (NotificationChannel notificationChannelCompat : notificationChannels) {
                    arrayList.add(new NotificationChannelCompat(notificationChannelCompat));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public void notify(int i, @NonNull Notification notification) {
        notify((String) null, i, notification);
    }

    public void notify(@Nullable String str, int i, @NonNull Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new NotifyTask(this.mContext.getPackageName(), i, str, notification));
            this.mNotificationManager.cancel(str, i);
            return;
        }
        this.mNotificationManager.notify(str, i, notification);
    }
}
