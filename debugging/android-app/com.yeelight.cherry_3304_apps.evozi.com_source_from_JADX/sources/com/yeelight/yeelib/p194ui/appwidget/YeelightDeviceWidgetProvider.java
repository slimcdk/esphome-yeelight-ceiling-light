package com.yeelight.yeelib.p194ui.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.RemoteViews;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.data.AppConfigurationProvider;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9775d;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
import com.yeelight.yeelib.utils.C4311i;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightDeviceWidgetProvider */
public class YeelightDeviceWidgetProvider extends AppWidgetProvider {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f19257d = YeelightDeviceWidgetProvider.class.getSimpleName();

    /* renamed from: e */
    private static boolean f19258e = AppConfigurationProvider.m22354g();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static int[] f19259f = new int[0];

    /* renamed from: g */
    private static ConcurrentHashMap<String, Integer> f19260g = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static ConcurrentHashMap<String, Boolean> f19261h = new ConcurrentHashMap<>();

    /* renamed from: a */
    private Handler f19262a = new C10371a(Looper.getMainLooper());

    /* renamed from: b */
    private C9768c f19263b = new C10372b();

    /* renamed from: c */
    private C9770e f19264c = new C10373c();

    /* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightDeviceWidgetProvider$a */
    class C10371a extends Handler {
        C10371a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                String unused = YeelightDeviceWidgetProvider.f19257d;
                YeelightDeviceWidgetProvider.this.m25014i(C4297y.f7456e, message.arg1, new RemoteViews(C4297y.f7456e.getPackageName(), R$layout.device_widget_layout));
            } else if (i == 2) {
                YeelightDeviceWidgetProvider.f19261h.put(String.valueOf(message.arg1), Boolean.FALSE);
            } else if (i == 3) {
                String unused2 = YeelightDeviceWidgetProvider.f19257d;
                YeelightDeviceWidgetProvider.this.m25012g(C4297y.f7456e, message.arg1);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightDeviceWidgetProvider$b */
    class C10372b implements C9768c {
        C10372b() {
        }

        public void onConnectionStateChanged(int i, int i2) {
            String unused = YeelightDeviceWidgetProvider.f19257d;
            if (i2 == 0 || i2 == 2 || i2 == 8 || i2 == 11) {
                for (int f : YeelightDeviceWidgetProvider.f19259f) {
                    YeelightDeviceWidgetProvider.this.m25013h(500, f);
                }
            }
        }

        public void onLocalConnected() {
        }

        public void onLocalDisconnected() {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightDeviceWidgetProvider$c */
    class C10373c implements C9770e {
        C10373c() {
        }

        public void onStatusChange(int i, C6024e eVar) {
            String unused = YeelightDeviceWidgetProvider.f19257d;
            for (int f : YeelightDeviceWidgetProvider.f19259f) {
                YeelightDeviceWidgetProvider.this.m25013h(500, f);
            }
        }
    }

    public YeelightDeviceWidgetProvider() {
        C9775d.m23684t();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m25012g(Context context, int i) {
        int i2;
        int i3;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.device_widget_layout);
        remoteViews.setRemoteAdapter(R$id.app_widget_lv, new Intent(context, UpdateService.class));
        Intent intent = new Intent();
        intent.setClass(context, YeelightDeviceWidgetProvider.class);
        intent.putExtra("extra_name_widget_id", i);
        remoteViews.setPendingIntentTemplate(R$id.app_widget_lv, PendingIntent.getBroadcast(context, i, intent, 134217728));
        Intent intent2 = new Intent();
        intent2.setAction("widget_on_click");
        intent2.setClass(context, YeelightDeviceWidgetProvider.class);
        intent2.putExtra("extra_name_widget_action", "widget_refresh");
        intent2.putExtra("extra_name_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.widget_image_refresh, PendingIntent.getBroadcast(context, i * 2, intent2, 134217728));
        Intent intent3 = new Intent();
        intent3.setAction("widget_on_click");
        intent3.setClass(context, YeelightDeviceWidgetProvider.class);
        intent3.putExtra("extra_name_widget_action", "list_view_change_skin");
        intent3.putExtra("extra_name_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.device_widget_skin, PendingIntent.getBroadcast(context, i * 3, intent3, 134217728));
        Intent intent4 = new Intent(context, UpdateService.class);
        intent4.setAction("widget_on_click");
        intent4.setClass(context, YeelightDeviceWidgetProvider.class);
        intent4.putExtra("extra_name_widget_action", "launch_on_click");
        intent4.putExtra("extra_name_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.widget_image_logo_view, PendingIntent.getBroadcast(context, i * 4, intent4, 134217728));
        if (f19258e) {
            i3 = R$id.device_widget_layout;
            i2 = R$color.black_40_transparent;
        } else {
            i3 = R$id.device_widget_layout;
            i2 = R$color.black_00_transparent;
        }
        remoteViews.setInt(i3, "setBackgroundColor", ContextCompat.getColor(context, i2));
        m25015j();
        m25014i(context, i, remoteViews);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m25013h(int i, int i2) {
        Boolean bool = f19261h.get(String.valueOf(i2));
        if (bool != null && !bool.booleanValue()) {
            f19261h.put(String.valueOf(i2), Boolean.TRUE);
            m25016k(i, i2);
            this.f19262a.removeMessages(2);
            Message obtainMessage = this.f19262a.obtainMessage();
            obtainMessage.arg1 = i2;
            obtainMessage.what = 2;
            this.f19262a.sendMessageDelayed(obtainMessage, 500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m25014i(Context context, int i, RemoteViews remoteViews) {
        Integer num;
        if (!C4201a.m11610z() && (num = f19260g.get(String.valueOf(i))) != null && num.intValue() < 20) {
            f19260g.put(String.valueOf(i), Integer.valueOf(num.intValue() + 1));
            remoteViews.setViewVisibility(R$id.widget_progress_refresh, 0);
            remoteViews.setViewVisibility(R$id.widget_image_refresh, 8);
            Message obtainMessage = this.f19262a.obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.what = 3;
            this.f19262a.sendMessageDelayed(obtainMessage, 500);
        } else {
            remoteViews.setViewVisibility(R$id.widget_progress_refresh, 8);
            remoteViews.setViewVisibility(R$id.widget_image_refresh, 0);
        }
        UpdateService.f19241b = null;
        AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i, R$id.app_widget_lv);
        AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
    }

    /* renamed from: j */
    private void m25015j() {
        List<C4198d> v0 = C4257w.m11947l0().mo23692v0();
        "registerDeviceListener, device list size: " + v0.size();
        for (C4198d next : v0) {
            next.mo23363A0(this.f19263b, false);
            next.mo23367C0(this.f19264c, false);
        }
    }

    /* renamed from: k */
    private void m25016k(int i, int i2) {
        Message obtainMessage = this.f19262a.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.arg1 = i2;
        this.f19262a.sendMessageDelayed(obtainMessage, (long) i);
    }

    /* renamed from: l */
    private void m25017l() {
        List<C4198d> v0 = C4257w.m11947l0().mo23692v0();
        "unregisterDeviceListener, device list size: " + v0.size();
        for (C4198d next : v0) {
            next.mo23319V0(this.f19263b);
            next.mo23400W0(this.f19264c);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25018m(android.content.Context r7, int r8, java.lang.String r9, java.lang.String r10) {
        /*
            r6 = this;
            android.widget.RemoteViews r0 = new android.widget.RemoteViews
            java.lang.String r1 = r7.getPackageName()
            int r2 = com.yeelight.yeelib.R$layout.device_widget_layout
            r0.<init>(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "action = "
            r1.append(r2)
            r1.append(r9)
            r1.toString()
            int r1 = r9.hashCode()
            r2 = 2
            r3 = 4
            r4 = 0
            r5 = 1
            switch(r1) {
                case -134067486: goto L_0x0063;
                case -24616045: goto L_0x0059;
                case 127683680: goto L_0x004f;
                case 315595316: goto L_0x0045;
                case 410849248: goto L_0x003b;
                case 1509164979: goto L_0x0031;
                case 2091594461: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x006d
        L_0x0027:
            java.lang.String r1 = "connect_on_click"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x006d
            r9 = 3
            goto L_0x006e
        L_0x0031:
            java.lang.String r1 = "toggle_on_click"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x006d
            r9 = 0
            goto L_0x006e
        L_0x003b:
            java.lang.String r1 = "widget_refresh"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x006d
            r9 = 4
            goto L_0x006e
        L_0x0045:
            java.lang.String r1 = "launch_on_click"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x006d
            r9 = 5
            goto L_0x006e
        L_0x004f:
            java.lang.String r1 = "toggle_curtain_close"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x006d
            r9 = 2
            goto L_0x006e
        L_0x0059:
            java.lang.String r1 = "list_view_change_skin"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x006d
            r9 = 6
            goto L_0x006e
        L_0x0063:
            java.lang.String r1 = "toggle_curtain_open"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x006d
            r9 = 1
            goto L_0x006e
        L_0x006d:
            r9 = -1
        L_0x006e:
            r1 = 3000(0xbb8, float:4.204E-42)
            switch(r9) {
                case 0: goto L_0x0125;
                case 1: goto L_0x0116;
                case 2: goto L_0x0107;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00a5;
                case 5: goto L_0x009c;
                case 6: goto L_0x0075;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x01bc
        L_0x0075:
            boolean r9 = f19258e
            r9 = r9 ^ r5
            f19258e = r9
            com.yeelight.yeelib.data.AppConfigurationProvider.m22359l(r9)
            boolean r9 = f19258e
            java.lang.String r10 = "setBackgroundColor"
            if (r9 == 0) goto L_0x0088
            int r9 = com.yeelight.yeelib.R$id.device_widget_layout
            int r1 = com.yeelight.yeelib.R$color.black_40_transparent
            goto L_0x008c
        L_0x0088:
            int r9 = com.yeelight.yeelib.R$id.device_widget_layout
            int r1 = com.yeelight.yeelib.R$color.black_00_transparent
        L_0x008c:
            int r1 = androidx.core.content.ContextCompat.getColor(r7, r1)
            r0.setInt(r9, r10, r1)
            android.appwidget.AppWidgetManager r7 = android.appwidget.AppWidgetManager.getInstance(r7)
            r7.updateAppWidget(r8, r0)
            goto L_0x01bc
        L_0x009c:
            com.yeelight.yeelib.f.k r7 = com.yeelight.yeelib.p152f.C9794k.m23749e()
            r7.mo31652f(r10)
            goto L_0x01bc
        L_0x00a5:
            int r9 = com.yeelight.yeelib.R$id.widget_progress_refresh
            r0.setViewVisibility(r9, r4)
            int r9 = com.yeelight.yeelib.R$id.widget_image_refresh
            r0.setViewVisibility(r9, r3)
            android.appwidget.AppWidgetManager r9 = android.appwidget.AppWidgetManager.getInstance(r7)
            r9.updateAppWidget(r8, r0)
            android.appwidget.AppWidgetManager r7 = android.appwidget.AppWidgetManager.getInstance(r7)
            int r9 = com.yeelight.yeelib.R$id.app_widget_lv
            r7.notifyAppWidgetViewDataChanged(r8, r9)
            r7 = 2000(0x7d0, float:2.803E-42)
            r6.m25016k(r7, r8)
            goto L_0x01bc
        L_0x00c6:
            r6.m25015j()
            com.yeelight.yeelib.c.i.d r9 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r10)
            if (r9 == 0) goto L_0x01b0
            boolean r10 = r9 instanceof com.yeelight.yeelib.p150c.C5972a
            if (r10 == 0) goto L_0x01b0
            boolean r10 = r9.mo23416o0()
            if (r10 != 0) goto L_0x00df
            boolean r10 = r9.mo23420r0()
            if (r10 == 0) goto L_0x01b0
        L_0x00df:
            boolean r10 = r9.mo23331k0()
            if (r10 != 0) goto L_0x00f1
            boolean r10 = r9.mo23420r0()
            if (r10 == 0) goto L_0x00ec
            goto L_0x00f1
        L_0x00ec:
            r9.mo23337n()
            goto L_0x01b0
        L_0x00f1:
            com.yeelight.yeelib.c.i.e r10 = r9.mo23408d0()
            boolean r10 = r10.mo27681c0()
            com.yeelight.yeelib.c.a r9 = (com.yeelight.yeelib.p150c.C5972a) r9
            if (r10 == 0) goto L_0x0102
            r9.mo23326b1()
            goto L_0x01b0
        L_0x0102:
            r9.mo23334l1()
            goto L_0x01b0
        L_0x0107:
            com.yeelight.yeelib.c.i.d r7 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r10)
            boolean r8 = r7 instanceof com.yeelight.yeelib.p150c.p183m.C7472y
            if (r8 == 0) goto L_0x01bc
            com.yeelight.yeelib.c.m.y r7 = (com.yeelight.yeelib.p150c.p183m.C7472y) r7
            r7.mo27624x2(r2)
            goto L_0x01bc
        L_0x0116:
            com.yeelight.yeelib.c.i.d r7 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r10)
            boolean r8 = r7 instanceof com.yeelight.yeelib.p150c.p183m.C7472y
            if (r8 == 0) goto L_0x01bc
            com.yeelight.yeelib.c.m.y r7 = (com.yeelight.yeelib.p150c.p183m.C7472y) r7
            r7.mo27624x2(r5)
            goto L_0x01bc
        L_0x0125:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "command toggle, device id = "
            r9.append(r0)
            r9.append(r10)
            r9.toString()
            r6.m25015j()
            com.yeelight.yeelib.c.i.d r9 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r10)
            if (r9 == 0) goto L_0x01ae
            boolean r0 = r9 instanceof com.yeelight.yeelib.p150c.C6006h
            if (r0 != 0) goto L_0x0196
            boolean r0 = r9 instanceof com.yeelight.yeelib.p150c.p151i.C6050n
            if (r0 == 0) goto L_0x0147
            goto L_0x0196
        L_0x0147:
            boolean r0 = r9 instanceof com.yeelight.yeelib.p150c.C5972a
            if (r0 == 0) goto L_0x017c
            boolean r0 = r9.mo23416o0()
            if (r0 != 0) goto L_0x0157
            boolean r0 = r9.mo23420r0()
            if (r0 == 0) goto L_0x01ae
        L_0x0157:
            boolean r0 = r9.mo23331k0()
            if (r0 != 0) goto L_0x0168
            boolean r0 = r9.mo23420r0()
            if (r0 == 0) goto L_0x0164
            goto L_0x0168
        L_0x0164:
            r9.mo23337n()
            goto L_0x01ae
        L_0x0168:
            com.yeelight.yeelib.c.i.e r0 = r9.mo23408d0()
            boolean r0 = r0.mo27681c0()
            com.yeelight.yeelib.c.a r9 = (com.yeelight.yeelib.p150c.C5972a) r9
            if (r0 == 0) goto L_0x0178
            r9.mo23326b1()
            goto L_0x01ab
        L_0x0178:
            r9.mo23334l1()
            goto L_0x01ab
        L_0x017c:
            boolean r0 = r9 instanceof com.yeelight.yeelib.p150c.C5980c
            if (r0 == 0) goto L_0x01ae
            boolean r0 = r9.mo23331k0()
            if (r0 == 0) goto L_0x01ae
            com.yeelight.yeelib.c.c r9 = (com.yeelight.yeelib.p150c.C5980c) r9
            boolean r0 = r9.mo23332k1()
            if (r0 == 0) goto L_0x0192
            r9.mo23326b1()
            goto L_0x01ab
        L_0x0192:
            r9.mo23334l1()
            goto L_0x01ab
        L_0x0196:
            boolean r0 = r9.mo23331k0()
            if (r0 == 0) goto L_0x01ab
            com.yeelight.yeelib.c.i.i r9 = (com.yeelight.yeelib.p150c.p151i.C4200i) r9
            boolean r0 = r9.mo23332k1()
            if (r0 == 0) goto L_0x01a8
            r9.mo23326b1()
            goto L_0x01ab
        L_0x01a8:
            r9.mo23334l1()
        L_0x01ab:
            com.yeelight.yeelib.utils.C4315y.m12185b()
        L_0x01ae:
            com.yeelight.yeelib.p194ui.appwidget.UpdateService.f19241b = r10
        L_0x01b0:
            android.appwidget.AppWidgetManager r7 = android.appwidget.AppWidgetManager.getInstance(r7)
            int r9 = com.yeelight.yeelib.R$id.app_widget_lv
            r7.notifyAppWidgetViewDataChanged(r8, r9)
            r6.m25016k(r1, r8)
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.appwidget.YeelightDeviceWidgetProvider.m25018m(android.content.Context, int, java.lang.String, java.lang.String):void");
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        m25018m(context, i, "widget_refresh", "");
    }

    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        f19259f = iArr;
    }

    public void onDisabled(Context context) {
        super.onDisabled(context);
        m25017l();
        f19261h.clear();
        f19260g.clear();
    }

    public void onEnabled(Context context) {
        super.onEnabled(context);
        C4201a.m11607r();
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        String action = intent.getAction();
        "onReceive !!! + action = " + action;
        if (action == null) {
            C4310h.m12146b(new C4308b.C4309a(f19257d, "Invalid action for App Widget Service! Fix me!"));
            return;
        }
        char c = 65535;
        if (action.hashCode() == -1898498365 && action.equals("widget_on_click")) {
            c = 0;
        }
        if (c == 0) {
            String stringExtra = intent.getStringExtra("extra_name_widget_action");
            int intExtra = intent.getIntExtra("extra_name_widget_id", 0);
            String stringExtra2 = intent.getStringExtra("com.yeelight.cherry.device_id");
            "onReceive !!! + command = " + stringExtra + " , widgetId = " + intExtra;
            if (stringExtra != null) {
                C4311i.m12163n(action);
                m25018m(context, intExtra, stringExtra, stringExtra2);
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        f19259f = iArr;
        for (int i : iArr) {
            f19261h.put(String.valueOf(i), Boolean.FALSE);
            f19260g.put(String.valueOf(i), 0);
            m25012g(context, i);
        }
    }
}
