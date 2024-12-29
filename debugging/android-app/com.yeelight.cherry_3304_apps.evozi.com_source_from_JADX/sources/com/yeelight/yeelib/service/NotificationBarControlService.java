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
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$mipmap;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10559w;
import com.yeelight.yeelib.utils.C4308b;

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

    public class NotificationBarController extends Binder implements C9768c, C9770e {
        private ContentObserver mDeviceObserver = new ContentObserver(new Handler()) {
            public void onChange(boolean z) {
                super.onChange(z);
                if (C4201a.m11610z()) {
                    NotificationBarController.this.update();
                }
            }
        };
        private int mPosition = -1;

        public NotificationBarController() {
            NotificationBarControlService.this.getContentResolver().registerContentObserver(C7579c.C7580a.f15368a, false, this.mDeviceObserver);
            if (C4257w.m11947l0().mo23644E0().size() != 0) {
                this.mPosition = 0;
                registerDeviceListener();
            }
        }

        private C4198d getTargetDevice() {
            if (C4257w.m11947l0().mo23644E0().size() == 0) {
                NotificationBarControlService.mNotificationManager.cancel(1);
                return null;
            }
            if (this.mPosition >= C4257w.m11947l0().mo23644E0().size()) {
                this.mPosition = 0;
            }
            return C4257w.m11947l0().mo23644E0().get(this.mPosition);
        }

        private void registerDeviceListener() {
            int i = this.mPosition;
            if (i >= 0 && i < C4257w.m11947l0().mo23644E0().size()) {
                C4198d dVar = C4257w.m11947l0().mo23644E0().get(this.mPosition);
                dVar.mo23358z0(this);
                dVar.mo23365B0(this);
            }
        }

        private void unregisterDeviceListener() {
            for (C4198d next : C4257w.m11947l0().mo23644E0()) {
                next.mo23319V0(this);
                next.mo23400W0(this);
            }
        }

        /* access modifiers changed from: private */
        public void update() {
            if (C4257w.m11947l0().mo23644E0().size() == 0) {
                NotificationBarControlService.mNotificationManager.cancel(1);
                return;
            }
            int i = this.mPosition;
            if (i < 0 || i >= C4257w.m11947l0().mo23644E0().size()) {
                this.mPosition = 0;
            }
            NotificationBarControlService.this.updateRemoteView(C4257w.m11947l0().mo23644E0().get(this.mPosition));
        }

        public void connect(String str) {
            C4198d targetDevice = getTargetDevice();
            if (targetDevice == null || !(targetDevice instanceof C4200i) || !str.equals(targetDevice.mo23372G())) {
                update();
            } else {
                targetDevice.mo23337n();
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
                C10559w.m25820p(NotificationBarControlService.bEnabled);
            }
        }

        public void launch(String str) {
            Intent intent;
            NotificationBarControlService notificationBarControlService;
            C4198d targetDevice = getTargetDevice();
            if (targetDevice instanceof C5980c) {
                try {
                    intent = new Intent(NotificationBarControlService.this, Class.forName("com.yeelight.cherry.ui.activity.MainActivity"));
                    intent.putExtra("com.yeelight.cherry.device_id", targetDevice.mo23372G());
                    intent.addFlags(335544320);
                    notificationBarControlService = NotificationBarControlService.this;
                } catch (ClassNotFoundException unused) {
                    C4308b.m12139r(NotificationBarControlService.TAG, "MainActivity, class not found!");
                    return;
                }
            } else if (!(targetDevice instanceof C4200i)) {
                return;
            } else {
                if (targetDevice == null || !str.equals(targetDevice.mo23372G()) || !targetDevice.mo23331k0()) {
                    try {
                        Intent intent2 = new Intent(NotificationBarControlService.this, Class.forName("com.yeelight.cherry.ui.activity.MainActivity"));
                        intent2.addFlags(335544320);
                        NotificationBarControlService.this.startActivity(intent2);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                        C4308b.m12139r(NotificationBarControlService.TAG, "MainActivity, class not found!");
                    }
                    update();
                    return;
                }
                intent = new Intent(NotificationBarControlService.this, Class.forName("com.yeelight.cherry.ui.activity.MainActivity"));
                intent.putExtra("com.yeelight.cherry.device_id", targetDevice.mo23372G());
                intent.addFlags(335544320);
                notificationBarControlService = NotificationBarControlService.this;
            }
            notificationBarControlService.startActivity(intent);
        }

        public void nextDevice() {
            unregisterDeviceListener();
            int i = this.mPosition + 1;
            this.mPosition = i;
            if (i >= C4257w.m11947l0().mo23644E0().size()) {
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

        public void onStatusChange(int i, C6024e eVar) {
            update();
        }

        public void previousDevice() {
            unregisterDeviceListener();
            int i = this.mPosition - 1;
            this.mPosition = i;
            if (i < 0) {
                this.mPosition = C4257w.m11947l0().mo23644E0().size() - 1;
            }
            registerDeviceListener();
        }

        public void toggle(String str) {
            C4198d targetDevice = getTargetDevice();
            if (targetDevice == null || !(targetDevice instanceof C4200i) || !targetDevice.mo23331k0() || !str.equals(targetDevice.mo23372G())) {
                update();
            } else {
                ((C4200i) targetDevice).mo23300A1();
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
        bEnabled = C10559w.m25812h();
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
        mNotification.contentView.setOnClickPendingIntent(R$id.notification_prev, PendingIntent.getBroadcast(this, 0, intent, 0));
        Intent intent2 = new Intent(this, NotificationReceiver.class);
        intent2.setAction(ACTION_NOTIFICATION_NEXT);
        mNotification.contentView.setOnClickPendingIntent(R$id.notification_next, PendingIntent.getBroadcast(this, 0, intent2, 0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateRemoteView(com.yeelight.yeelib.p150c.p151i.C4198d r7) {
        /*
            r6 = this;
            android.app.Notification r0 = mNotification
            android.widget.RemoteViews r0 = r0.contentView
            int r1 = com.yeelight.yeelib.R$id.notification_device_name
            java.lang.String r2 = r7.mo23397U()
            r0.setTextViewText(r1, r2)
            boolean r1 = r7.mo23331k0()
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
            com.yeelight.yeelib.c.i.e r3 = r7.mo23408d0()
            boolean r3 = r3.mo27681c0()
            if (r3 == 0) goto L_0x0038
            android.content.res.Resources r3 = r6.getResources()
            int r4 = com.yeelight.yeelib.R$string.common_text_status_on
            goto L_0x007a
        L_0x0038:
            android.content.res.Resources r3 = r6.getResources()
            int r4 = com.yeelight.yeelib.R$string.common_text_status_off
            goto L_0x007a
        L_0x003f:
            boolean r1 = r7.mo23333l0()
            if (r1 == 0) goto L_0x0082
            boolean r1 = r7.mo23339p0()
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
            boolean r1 = r7.mo23335m0()
            if (r1 == 0) goto L_0x00c2
            boolean r1 = r7 instanceof com.yeelight.yeelib.p150c.C5972a
            if (r1 == 0) goto L_0x009d
            boolean r1 = r7.mo23416o0()
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
            boolean r3 = r7.mo23416o0()
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
            java.lang.String r1 = r7.mo23372G()
            java.lang.String r3 = "com.yeelight.cherry.device_id"
            r0.putExtra(r3, r1)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r6, r2, r0, r1)
            android.app.Notification r4 = mNotification
            android.widget.RemoteViews r4 = r4.contentView
            int r5 = com.yeelight.yeelib.R$id.notification_device_switch
            r4.setOnClickPendingIntent(r5, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.yeelight.yeelib.service.NotificationReceiver> r4 = com.yeelight.yeelib.service.NotificationReceiver.class
            r0.<init>(r6, r4)
            java.lang.String r4 = "com.yeelight.notification.connect"
            r0.setAction(r4)
            java.lang.String r4 = r7.mo23372G()
            r0.putExtra(r3, r4)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r6, r2, r0, r1)
            android.app.Notification r4 = mNotification
            android.widget.RemoteViews r4 = r4.contentView
            int r5 = com.yeelight.yeelib.R$id.notification_device_connect
            r4.setOnClickPendingIntent(r5, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.yeelight.yeelib.service.NotificationReceiver> r4 = com.yeelight.yeelib.service.NotificationReceiver.class
            r0.<init>(r6, r4)
            java.lang.String r4 = "com.yeelight.notification.launch"
            r0.setAction(r4)
            java.lang.String r7 = r7.mo23372G()
            r0.putExtra(r3, r7)
            android.app.PendingIntent r7 = android.app.PendingIntent.getBroadcast(r6, r2, r0, r1)
            android.app.Notification r0 = mNotification
            android.widget.RemoteViews r0 = r0.contentView
            int r1 = com.yeelight.yeelib.R$id.notification_launch_app_area
            r0.setOnClickPendingIntent(r1, r7)
            boolean r7 = bEnabled
            if (r7 == 0) goto L_0x0132
            android.app.NotificationManager r7 = mNotificationManager
            r0 = 1
            android.app.Notification r1 = mNotification
            r7.notify(r0, r1)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.service.NotificationBarControlService.updateRemoteView(com.yeelight.yeelib.c.i.d):void");
    }
}
