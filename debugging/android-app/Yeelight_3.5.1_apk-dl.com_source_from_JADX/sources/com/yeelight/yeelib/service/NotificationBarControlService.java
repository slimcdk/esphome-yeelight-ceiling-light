package com.yeelight.yeelib.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.yeelight.cherry.p141ui.activity.MainActivity;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$mipmap;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C3283v;
import p051j4.C9205u;
import p237z3.C12143c;
import p237z3.C12145e;

public class NotificationBarControlService extends Service {
    public static final String ACTION_NOTIFICATION_CONNECT = "com.yeelight.notification.connect";
    public static final String ACTION_NOTIFICATION_LAUNCH = "com.yeelight.notification.launch";
    public static final String ACTION_NOTIFICATION_NEXT = "com.yeelight.notification.next";
    public static final String ACTION_NOTIFICATION_PREV = "com.yeelight.notification.prev";
    public static final String ACTION_NOTIFICATION_TOGGLE = "com.yeelight.notification.toggle";
    /* access modifiers changed from: private */
    public static final String TAG = NotificationBarControlService.class.getSimpleName();
    /* access modifiers changed from: private */
    public static boolean bEnabled = true;
    /* access modifiers changed from: private */
    public static Notification mNotification;
    /* access modifiers changed from: private */
    public static NotificationManager mNotificationManager;
    private final String COLOR_SEARCH_TEXT = "SEARCH_COLOR_TEXT";
    private final String COLOR_SEARCH_TITLE = "SEARCH_COLOR_TITLE";
    private Integer notification_text_color = -10066330;
    private float notification_text_size = 12.0f;
    private Integer notification_title_color = -13421773;
    private float notification_title_size = 16.0f;
    private int notificaton_title;

    public class NotificationBarController extends Binder implements C12143c, C12145e {
        private ContentObserver mDeviceObserver = new ContentObserver(new Handler()) {
            public void onChange(boolean z) {
                super.onChange(z);
                if (C3051a.m7928z()) {
                    NotificationBarController.this.update();
                }
            }
        };
        private int mPosition = -1;

        public NotificationBarController() {
            NotificationBarControlService.this.getContentResolver().registerContentObserver(C6043b.C6044a.f12327a, false, this.mDeviceObserver);
            if (YeelightDeviceManager.m7800o0().mo23263H0().size() != 0) {
                this.mPosition = 0;
                registerDeviceListener();
            }
        }

        private C3010c getTargetDevice() {
            if (YeelightDeviceManager.m7800o0().mo23263H0().size() == 0) {
                NotificationBarControlService.mNotificationManager.cancel(1);
                return null;
            }
            if (this.mPosition >= YeelightDeviceManager.m7800o0().mo23263H0().size()) {
                this.mPosition = 0;
            }
            return YeelightDeviceManager.m7800o0().mo23263H0().get(this.mPosition);
        }

        private void registerDeviceListener() {
            int i = this.mPosition;
            if (i >= 0 && i < YeelightDeviceManager.m7800o0().mo23263H0().size()) {
                C3010c cVar = YeelightDeviceManager.m7800o0().mo23263H0().get(this.mPosition);
                cVar.mo23171z0(this);
                cVar.mo23178B0(this);
            }
        }

        private void unregisterDeviceListener() {
            for (C3010c next : YeelightDeviceManager.m7800o0().mo23263H0()) {
                next.mo23133V0(this);
                next.mo23213W0(this);
            }
        }

        /* access modifiers changed from: private */
        public void update() {
            if (YeelightDeviceManager.m7800o0().mo23263H0().size() == 0) {
                NotificationBarControlService.mNotificationManager.cancel(1);
                return;
            }
            int i = this.mPosition;
            if (i < 0 || i >= YeelightDeviceManager.m7800o0().mo23263H0().size()) {
                this.mPosition = 0;
            }
            NotificationBarControlService.this.updateRemoteView(YeelightDeviceManager.m7800o0().mo23263H0().get(this.mPosition));
        }

        public void connect(String str) {
            C3010c targetDevice = getTargetDevice();
            if (targetDevice == null || !(targetDevice instanceof C3012e) || !str.equals(targetDevice.mo23185G())) {
                update();
            } else {
                targetDevice.mo23151n();
            }
        }

        public void enableNotification(boolean z) {
            if (NotificationBarControlService.bEnabled != z) {
                boolean unused = NotificationBarControlService.bEnabled = z;
                if (NotificationBarControlService.bEnabled) {
                    NotificationBarControlService.mNotificationManager.notify(1, NotificationBarControlService.mNotification);
                } else {
                    NotificationBarControlService.mNotificationManager.cancel(1);
                }
                C3283v.m8850p(NotificationBarControlService.bEnabled);
            }
        }

        public void launch(String str) {
            Intent intent;
            NotificationBarControlService notificationBarControlService;
            Class<MainActivity> cls = MainActivity.class;
            C3010c targetDevice = getTargetDevice();
            if (targetDevice instanceof C6119c) {
                try {
                    NotificationBarControlService notificationBarControlService2 = NotificationBarControlService.this;
                    int i = MainActivity.f10688y;
                    intent = new Intent(notificationBarControlService2, cls);
                    intent.putExtra("com.yeelight.cherry.device_id", targetDevice.mo23185G());
                    intent.addFlags(335544320);
                    notificationBarControlService = NotificationBarControlService.this;
                } catch (ClassNotFoundException unused) {
                    AppUtils.m8300u(NotificationBarControlService.TAG, "MainActivity, class not found!");
                    return;
                }
            } else if (!(targetDevice instanceof C3012e)) {
                return;
            } else {
                if (targetDevice == null || !str.equals(targetDevice.mo23185G()) || !targetDevice.mo23145k0()) {
                    try {
                        NotificationBarControlService notificationBarControlService3 = NotificationBarControlService.this;
                        int i2 = MainActivity.f10688y;
                        Intent intent2 = new Intent(notificationBarControlService3, cls);
                        intent2.addFlags(335544320);
                        NotificationBarControlService.this.startActivity(intent2);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                        AppUtils.m8300u(NotificationBarControlService.TAG, "MainActivity, class not found!");
                    }
                    update();
                    return;
                }
                NotificationBarControlService notificationBarControlService4 = NotificationBarControlService.this;
                int i3 = MainActivity.f10688y;
                intent = new Intent(notificationBarControlService4, cls);
                intent.putExtra("com.yeelight.cherry.device_id", targetDevice.mo23185G());
                intent.addFlags(335544320);
                notificationBarControlService = NotificationBarControlService.this;
            }
            notificationBarControlService.startActivity(intent);
        }

        public void nextDevice() {
            unregisterDeviceListener();
            int i = this.mPosition + 1;
            this.mPosition = i;
            if (i >= YeelightDeviceManager.m7800o0().mo23263H0().size()) {
                this.mPosition = 0;
            }
            registerDeviceListener();
        }

        public void onConnected() {
        }

        public void onConnecting() {
        }

        public void onConnectionStateChanged(int i, int i2) {
            if (i2 == 0 || i2 == 2 || i2 == 8 || i2 == 11) {
                update();
            }
        }

        public void onDisconnected() {
        }

        public void onDiscovered() {
        }

        public void onLocalConnected() {
        }

        public void onLocalDisconnected() {
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            update();
        }

        public void previousDevice() {
            unregisterDeviceListener();
            int i = this.mPosition - 1;
            this.mPosition = i;
            if (i < 0) {
                this.mPosition = YeelightDeviceManager.m7800o0().mo23263H0().size() - 1;
            }
            registerDeviceListener();
        }

        public void toggle(String str) {
            C3010c targetDevice = getTargetDevice();
            if (targetDevice == null || !(targetDevice instanceof C3012e) || !targetDevice.mo23145k0() || !str.equals(targetDevice.mo23185G())) {
                update();
            } else {
                ((C3012e) targetDevice).mo23114A1();
            }
        }
    }

    private void extractColors() {
        if (this.notification_text_color == null) {
            try {
                Notification build = new Notification.Builder(this).setSmallIcon(R$mipmap.ic_launcher).setContentTitle("SEARCH_COLOR_TITLE").setContentText("SEARCH_COLOR_TEXT").setPriority(-2).build();
                LinearLayout linearLayout = new LinearLayout(this);
                recurseGroup((ViewGroup) build.contentView.apply(this, linearLayout));
                linearLayout.removeAllViews();
            } catch (Exception unused) {
                this.notification_text_color = 17170444;
            }
        }
    }

    private void recurseGroup(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) instanceof TextView) {
                TextView textView = (TextView) viewGroup.getChildAt(i);
                String charSequence = textView.getText().toString();
                if ("SEARCH_COLOR_TITLE".equals(charSequence)) {
                    this.notification_title_color = Integer.valueOf(textView.getTextColors().getDefaultColor());
                    this.notification_title_size = textView.getTextSize();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    ((WindowManager) getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                    this.notification_title_size /= displayMetrics.scaledDensity;
                } else if ("SEARCH_COLOR_TEXT".equals(charSequence)) {
                    this.notification_text_color = Integer.valueOf(textView.getTextColors().getDefaultColor());
                    this.notification_text_size = textView.getTextSize();
                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    ((WindowManager) getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics2);
                    this.notification_text_size /= displayMetrics2.scaledDensity;
                }
            } else if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                recurseGroup((ViewGroup) viewGroup.getChildAt(i));
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return new NotificationBarController();
    }

    public void onCreate() {
        super.onCreate();
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        mNotificationManager = notificationManager;
        notificationManager.cancel(1);
        bEnabled = C3283v.m8842h();
        extractColors();
        setupNotificationBar();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    public boolean onUnbind(Intent intent) {
        super.onUnbind(intent);
        return false;
    }

    public void setupNotificationBar() {
        Notification.Builder builder;
        if (Build.VERSION.SDK_INT >= 26) {
            mNotificationManager.createNotificationChannel(new NotificationChannel("yeelight_notification_channel", "yeelight", 2));
            builder = new Notification.Builder(this, "yeelight_notification_channel");
        } else {
            builder = new Notification.Builder(this);
        }
        builder.setSmallIcon(R$mipmap.ic_launcher).setContent(new RemoteViews(getPackageName(), R$layout.item_notification_transparent)).setPriority(-2);
        Notification build = builder.build();
        mNotification = build;
        Integer num = this.notification_title_color;
        if (num != null) {
            build.contentView.setTextColor(R$id.notification_device_name, num.intValue());
        }
        Integer num2 = this.notification_text_color;
        if (num2 != null) {
            mNotification.contentView.setTextColor(R$id.notification_device_status, num2.intValue());
        }
        mNotification.contentView.setTextViewTextSize(R$id.notification_device_name, 2, this.notification_title_size);
        mNotification.contentView.setTextViewTextSize(R$id.notification_device_status, 2, this.notification_text_size);
        Intent intent = new Intent(this, NotificationReceiver.class);
        intent.setAction(ACTION_NOTIFICATION_PREV);
        mNotification.contentView.setOnClickPendingIntent(R$id.notification_prev, PendingIntent.getBroadcast(this, 0, intent, C9205u.m22205b(0)));
        Intent intent2 = new Intent(this, NotificationReceiver.class);
        intent2.setAction(ACTION_NOTIFICATION_NEXT);
        mNotification.contentView.setOnClickPendingIntent(R$id.notification_next, PendingIntent.getBroadcast(this, 0, intent2, C9205u.m22205b(0)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateRemoteView(com.yeelight.yeelib.device.base.C3010c r7) {
        /*
            r6 = this;
            android.app.Notification r0 = mNotification
            android.widget.RemoteViews r0 = r0.contentView
            int r1 = com.yeelight.yeelib.R$id.notification_device_name
            java.lang.String r2 = r7.mo23210U()
            r0.setTextViewText(r1, r2)
            boolean r1 = r7.mo23145k0()
            r2 = 0
            r3 = 8
            if (r1 == 0) goto L_0x003f
            int r1 = com.yeelight.yeelib.R$id.notification_device_switch
            r0.setViewVisibility(r1, r2)
            int r1 = com.yeelight.yeelib.R$id.notification_device_connect
            r0.setViewVisibility(r1, r3)
            int r1 = com.yeelight.yeelib.R$id.notification_device_connect_progress_bar
            r0.setViewVisibility(r1, r3)
            int r1 = com.yeelight.yeelib.R$id.notification_device_status
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r7.mo23221d0()
            boolean r3 = r3.mo31584d0()
            if (r3 == 0) goto L_0x0038
            android.content.res.Resources r3 = r6.getResources()
            int r4 = com.yeelight.yeelib.R$string.common_text_status_on
            goto L_0x007a
        L_0x0038:
            android.content.res.Resources r3 = r6.getResources()
            int r4 = com.yeelight.yeelib.R$string.common_text_status_off
            goto L_0x007a
        L_0x003f:
            boolean r1 = r7.mo23147l0()
            if (r1 == 0) goto L_0x0082
            boolean r1 = r7.mo23153p0()
            if (r1 == 0) goto L_0x0063
            int r1 = com.yeelight.yeelib.R$id.notification_device_switch
            r0.setViewVisibility(r1, r3)
            int r1 = com.yeelight.yeelib.R$id.notification_device_connect
            r0.setViewVisibility(r1, r3)
            int r1 = com.yeelight.yeelib.R$id.notification_device_connect_progress_bar
            r0.setViewVisibility(r1, r2)
            int r1 = com.yeelight.yeelib.R$id.notification_device_status
            android.content.res.Resources r3 = r6.getResources()
            int r4 = com.yeelight.yeelib.R$string.common_text_status_upgrade
            goto L_0x007a
        L_0x0063:
            int r1 = com.yeelight.yeelib.R$id.notification_device_switch
            r0.setViewVisibility(r1, r3)
            int r1 = com.yeelight.yeelib.R$id.notification_device_connect
            r0.setViewVisibility(r1, r3)
            int r1 = com.yeelight.yeelib.R$id.notification_device_connect_progress_bar
            r0.setViewVisibility(r1, r2)
            int r1 = com.yeelight.yeelib.R$id.notification_device_status
            android.content.res.Resources r3 = r6.getResources()
            int r4 = com.yeelight.yeelib.R$string.common_text_status_connecting
        L_0x007a:
            java.lang.String r3 = r3.getString(r4)
            r0.setTextViewText(r1, r3)
            goto L_0x00c2
        L_0x0082:
            boolean r1 = r7.mo23149m0()
            if (r1 == 0) goto L_0x00c2
            boolean r1 = r7 instanceof com.yeelight.yeelib.device.C6081a
            if (r1 == 0) goto L_0x009d
            boolean r1 = r7.mo23230o0()
            if (r1 == 0) goto L_0x009d
            int r1 = com.yeelight.yeelib.R$id.notification_device_switch
            r0.setViewVisibility(r1, r3)
            int r1 = com.yeelight.yeelib.R$id.notification_device_connect
            r0.setViewVisibility(r1, r2)
            goto L_0x00a7
        L_0x009d:
            int r1 = com.yeelight.yeelib.R$id.notification_device_switch
            r0.setViewVisibility(r1, r3)
            int r1 = com.yeelight.yeelib.R$id.notification_device_connect
            r0.setViewVisibility(r1, r3)
        L_0x00a7:
            int r1 = com.yeelight.yeelib.R$id.notification_device_connect_progress_bar
            r0.setViewVisibility(r1, r3)
            int r1 = com.yeelight.yeelib.R$id.notification_device_status
            boolean r3 = r7.mo23230o0()
            if (r3 == 0) goto L_0x00bb
            android.content.res.Resources r3 = r6.getResources()
            int r4 = com.yeelight.yeelib.R$string.common_text_status_online
            goto L_0x007a
        L_0x00bb:
            android.content.res.Resources r3 = r6.getResources()
            int r4 = com.yeelight.yeelib.R$string.common_text_status_offline
            goto L_0x007a
        L_0x00c2:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.yeelight.yeelib.service.NotificationReceiver> r1 = com.yeelight.yeelib.service.NotificationReceiver.class
            r0.<init>(r6, r1)
            java.lang.String r1 = "com.yeelight.notification.toggle"
            r0.setAction(r1)
            java.lang.String r1 = r7.mo23185G()
            java.lang.String r3 = "com.yeelight.cherry.device_id"
            r0.putExtra(r3, r1)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            int r4 = p051j4.C9205u.m22205b(r1)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r6, r2, r0, r4)
            android.app.Notification r4 = mNotification
            android.widget.RemoteViews r4 = r4.contentView
            int r5 = com.yeelight.yeelib.R$id.notification_device_switch
            r4.setOnClickPendingIntent(r5, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.yeelight.yeelib.service.NotificationReceiver> r4 = com.yeelight.yeelib.service.NotificationReceiver.class
            r0.<init>(r6, r4)
            java.lang.String r4 = "com.yeelight.notification.connect"
            r0.setAction(r4)
            java.lang.String r4 = r7.mo23185G()
            r0.putExtra(r3, r4)
            int r4 = p051j4.C9205u.m22205b(r1)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r6, r2, r0, r4)
            android.app.Notification r4 = mNotification
            android.widget.RemoteViews r4 = r4.contentView
            int r5 = com.yeelight.yeelib.R$id.notification_device_connect
            r4.setOnClickPendingIntent(r5, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.yeelight.yeelib.service.NotificationReceiver> r4 = com.yeelight.yeelib.service.NotificationReceiver.class
            r0.<init>(r6, r4)
            java.lang.String r4 = "com.yeelight.notification.launch"
            r0.setAction(r4)
            java.lang.String r7 = r7.mo23185G()
            r0.putExtra(r3, r7)
            int r7 = p051j4.C9205u.m22205b(r1)
            android.app.PendingIntent r7 = android.app.PendingIntent.getBroadcast(r6, r2, r0, r7)
            android.app.Notification r0 = mNotification
            android.widget.RemoteViews r0 = r0.contentView
            int r1 = com.yeelight.yeelib.R$id.notification_launch_app_area
            r0.setOnClickPendingIntent(r1, r7)
            boolean r7 = bEnabled
            if (r7 == 0) goto L_0x013e
            android.app.NotificationManager r7 = mNotificationManager
            r0 = 1
            android.app.Notification r1 = mNotification
            r7.notify(r0, r1)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.service.NotificationBarControlService.updateRemoteView(com.yeelight.yeelib.device.base.c):void");
    }
}
