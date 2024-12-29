package com.yeelight.yeelib.p194ui.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.AppConfigurationProvider;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9775d;
import com.yeelight.yeelib.p152f.C9812t;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightRoomWidgetProvider */
public class YeelightRoomWidgetProvider extends AppWidgetProvider {

    /* renamed from: d */
    public static final String f19268d = YeelightRoomWidgetProvider.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static int[] f19269e = new int[0];

    /* renamed from: f */
    private static ConcurrentHashMap<String, Integer> f19270f = new ConcurrentHashMap<>();

    /* renamed from: a */
    private boolean f19271a = AppConfigurationProvider.m22355h();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Handler f19272b = new C10374a(Looper.getMainLooper());

    /* renamed from: c */
    private C9812t.C9819g f19273c = new C10375b();

    /* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightRoomWidgetProvider$a */
    class C10374a extends Handler {
        C10374a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                String str = YeelightRoomWidgetProvider.f19268d;
                YeelightRoomWidgetProvider.this.m25025g(C4297y.f7456e, message.arg1, "room_widget_view_refresh_silent");
            } else if (i == 2) {
                String str2 = YeelightRoomWidgetProvider.f19268d;
                YeelightRoomWidgetProvider.this.m25023e(C4297y.f7456e, message.arg1);
            } else if (i == 3) {
                int i2 = message.arg1;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightRoomWidgetProvider$b */
    class C10375b implements C9812t.C9819g {
        C10375b() {
        }

        /* renamed from: b */
        public void mo27347b() {
        }

        /* renamed from: d */
        public void mo27348d() {
            for (int i : YeelightRoomWidgetProvider.f19269e) {
                String str = YeelightRoomWidgetProvider.f19268d;
                "onRoomInfoLoaded appWidgetId = " + i + " mAppWidgetIds size = " + YeelightRoomWidgetProvider.f19269e.length;
                Message obtainMessage = YeelightRoomWidgetProvider.this.f19272b.obtainMessage();
                obtainMessage.arg1 = i;
                obtainMessage.what = 1;
                YeelightRoomWidgetProvider.this.f19272b.sendMessageDelayed(obtainMessage, 500);
                YeelightRoomWidgetProvider.this.f19272b.removeMessages(3);
                Message obtainMessage2 = YeelightRoomWidgetProvider.this.f19272b.obtainMessage();
                obtainMessage2.arg1 = i;
                obtainMessage2.what = 3;
                YeelightRoomWidgetProvider.this.f19272b.sendMessageDelayed(obtainMessage2, 500);
            }
        }
    }

    public YeelightRoomWidgetProvider() {
        C9775d.m23684t();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m25023e(Context context, int i) {
        int i2;
        int i3;
        "initeAppWidget appWidgetId = " + i;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.room_widget_layout);
        Intent intent = new Intent(context, YeelightRoomWidgetProvider.class);
        intent.setAction("widget_on_click_room");
        intent.putExtra("extra_name_widget_action", "room_widget_add_room");
        intent.putExtra("room_widget_extra_key_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.room_weiget_add, PendingIntent.getBroadcast(context, i, intent, 134217728));
        Intent intent2 = new Intent(context, YeelightRoomWidgetProvider.class);
        intent2.setAction("widget_on_click_room");
        intent2.putExtra("extra_name_widget_action", "room_widget_view_refresh");
        intent2.putExtra("room_widget_extra_key_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.room_widget_refesh_layout, PendingIntent.getBroadcast(context, i * 2, intent2, 134217728));
        Intent intent3 = new Intent(context, YeelightRoomWidgetProvider.class);
        intent3.setAction("widget_on_click_room");
        intent3.putExtra("extra_name_widget_action", "widget_change_skin");
        intent3.putExtra("room_widget_extra_key_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.room_widget_skin_layout, PendingIntent.getBroadcast(context, i * 3, intent3, 134217728));
        Intent intent4 = new Intent(context, YeelightRoomWidgetProvider.class);
        intent4.setAction("widget_on_click_room");
        intent4.putExtra("extra_name_widget_action", "launch_on_click");
        intent4.putExtra("room_widget_extra_key_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.room_widget_logo_layout, PendingIntent.getBroadcast(context, i * 4, intent4, 134217728));
        Intent intent5 = new Intent(context, YeelightRoomWidgetProvider.class);
        intent5.setAction("widget_on_click_room");
        intent5.putExtra("extra_name_widget_action", "toggle_on_click");
        intent5.putExtra("room_widget_extra_key_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.widget_room_switch, PendingIntent.getBroadcast(context, i * 6, intent5, 134217728));
        Intent intent6 = new Intent(context, YeelightRoomWidgetProvider.class);
        intent6.setAction("widget_on_click_room");
        intent6.putExtra("extra_name_widget_action", "detail_on_click");
        intent6.putExtra("room_widget_extra_key_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.room_weight_title_layout, PendingIntent.getBroadcast(context, i * 5, intent6, 134217728));
        if (this.f19271a) {
            i3 = R$id.room_widget_layout;
            i2 = R$color.black_40_transparent;
        } else {
            i3 = R$id.room_widget_layout;
            i2 = R$color.black_00_transparent;
        }
        remoteViews.setInt(i3, "setBackgroundColor", ContextCompat.getColor(context, i2));
        m25024f(context, remoteViews, i, true);
    }

    /* renamed from: f */
    private void m25024f(Context context, RemoteViews remoteViews, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        Resources resources;
        if (C4201a.m11610z()) {
            String R = DeviceDataProvider.m22383R(String.valueOf(i));
            "showRoomInfo widgetId = " + i + " ,roomId = " + R;
            if (!TextUtils.isEmpty(R)) {
                if (!z) {
                    remoteViews.setViewVisibility(R$id.room_widget_refresh_progress, 8);
                    C6005g G0 = C4257w.m11947l0().mo23647G0(R);
                    if (G0 != null) {
                        "device is " + G0.mo23397U();
                        remoteViews.setViewVisibility(R$id.room_widget_refesh, 0);
                        remoteViews.setViewVisibility(R$id.room_weiget_add, 8);
                        remoteViews.setViewVisibility(R$id.room_weight_card, 0);
                        remoteViews.setViewVisibility(R$id.widget_room_progress_bar, 8);
                        remoteViews.setViewVisibility(R$id.widget_room_switch, 0);
                        remoteViews.setImageViewResource(R$id.widget_room_card_icon, G0.mo27552b2());
                        remoteViews.setTextViewText(R$id.widget_room_main_title, G0.mo23397U());
                        if (G0.mo23331k0()) {
                            if (G0.mo23332k1()) {
                                i3 = R$id.widget_room_sub_title;
                                resources = context.getResources();
                                i4 = R$string.common_text_status_on;
                            } else {
                                i3 = R$id.widget_room_sub_title;
                                resources = context.getResources();
                                i4 = R$string.common_text_status_off;
                            }
                            remoteViews.setTextViewText(i3, resources.getString(i4));
                            remoteViews.setViewVisibility(R$id.widget_room_switch, 0);
                        } else {
                            remoteViews.setTextViewText(R$id.widget_room_sub_title, context.getResources().getString(R$string.common_text_status_offline));
                            remoteViews.setViewVisibility(R$id.widget_room_switch, 4);
                        }
                    }
                } else {
                    C9812t.m23832j().mo31693w(this.f19273c);
                    C9812t.m23832j().mo31687n();
                }
                AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
            }
            remoteViews.setViewVisibility(R$id.room_widget_refresh_progress, 8);
            remoteViews.setViewVisibility(R$id.room_widget_refesh, 8);
            remoteViews.setViewVisibility(R$id.room_weiget_add, 0);
            i2 = R$id.room_weight_card;
        } else {
            remoteViews.setViewVisibility(R$id.room_weiget_add, 8);
            remoteViews.setViewVisibility(R$id.room_weight_card, 8);
            Integer num = f19270f.get(String.valueOf(i));
            "queryCount = " + num;
            if (num == null || num.intValue() >= 20) {
                remoteViews.setViewVisibility(R$id.room_widget_refesh, 0);
                i2 = R$id.room_widget_refresh_progress;
            } else {
                remoteViews.setViewVisibility(R$id.room_widget_refesh, 8);
                remoteViews.setViewVisibility(R$id.room_widget_refresh_progress, 0);
                f19270f.put(String.valueOf(i), Integer.valueOf(num.intValue() + 1));
                Message obtainMessage = this.f19272b.obtainMessage();
                obtainMessage.arg1 = i;
                obtainMessage.what = 2;
                this.f19272b.sendMessageDelayed(obtainMessage, 500);
                AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
            }
        }
        remoteViews.setViewVisibility(i2, 8);
        AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m25025g(android.content.Context r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action = "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " ,widgetId = "
            r0.append(r1)
            r0.append(r11)
            r0.toString()
            int r0 = r12.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            switch(r0) {
                case -1898123272: goto L_0x0058;
                case -949684394: goto L_0x004e;
                case 315595316: goto L_0x0044;
                case 1509164979: goto L_0x003a;
                case 1642908465: goto L_0x0030;
                case 1937957360: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0062
        L_0x0026:
            java.lang.String r0 = "room_widget_add_room"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0062
            r12 = 5
            goto L_0x0063
        L_0x0030:
            java.lang.String r0 = "widget_change_skin"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0062
            r12 = 2
            goto L_0x0063
        L_0x003a:
            java.lang.String r0 = "toggle_on_click"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0062
            r12 = 4
            goto L_0x0063
        L_0x0044:
            java.lang.String r0 = "launch_on_click"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0062
            r12 = 0
            goto L_0x0063
        L_0x004e:
            java.lang.String r0 = "detail_on_click"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0062
            r12 = 1
            goto L_0x0063
        L_0x0058:
            java.lang.String r0 = "room_widget_view_refresh"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0062
            r12 = 3
            goto L_0x0063
        L_0x0062:
            r12 = -1
        L_0x0063:
            if (r12 == 0) goto L_0x0147
            if (r12 == r6) goto L_0x0137
            if (r12 == r4) goto L_0x0106
            r7 = 3000(0xbb8, double:1.482E-320)
            r0 = 8
            if (r12 == r3) goto L_0x00ca
            if (r12 == r2) goto L_0x008c
            if (r12 == r1) goto L_0x0083
            android.widget.RemoteViews r12 = new android.widget.RemoteViews
            java.lang.String r0 = r10.getPackageName()
            int r1 = com.yeelight.yeelib.R$layout.room_widget_layout
            r12.<init>(r0, r1)
            r9.m25024f(r10, r12, r11, r5)
            goto L_0x0150
        L_0x0083:
            com.yeelight.yeelib.f.k r10 = com.yeelight.yeelib.p152f.C9794k.m23749e()
            r10.mo31654h(r11)
            goto L_0x0150
        L_0x008c:
            java.lang.String r12 = java.lang.String.valueOf(r11)
            java.lang.String r12 = com.yeelight.yeelib.data.DeviceDataProvider.m22383R(r12)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x0150
            com.yeelight.yeelib.f.w r1 = com.yeelight.yeelib.p152f.C4257w.m11947l0()
            com.yeelight.yeelib.c.g r12 = r1.mo23647G0(r12)
            if (r12 == 0) goto L_0x0150
            boolean r1 = r12.mo23331k0()
            if (r1 == 0) goto L_0x0150
            android.widget.RemoteViews r1 = new android.widget.RemoteViews
            java.lang.String r2 = r10.getPackageName()
            int r3 = com.yeelight.yeelib.R$layout.room_widget_layout
            r1.<init>(r2, r3)
            int r2 = com.yeelight.yeelib.R$id.widget_room_progress_bar
            r1.setViewVisibility(r2, r5)
            int r2 = com.yeelight.yeelib.R$id.widget_room_switch
            r1.setViewVisibility(r2, r0)
            android.appwidget.AppWidgetManager r10 = android.appwidget.AppWidgetManager.getInstance(r10)
            r10.updateAppWidget(r11, r1)
            r12.mo23300A1()
            goto L_0x00e6
        L_0x00ca:
            android.widget.RemoteViews r12 = new android.widget.RemoteViews
            java.lang.String r1 = r10.getPackageName()
            int r2 = com.yeelight.yeelib.R$layout.room_widget_layout
            r12.<init>(r1, r2)
            int r1 = com.yeelight.yeelib.R$id.room_widget_refresh_progress
            r12.setViewVisibility(r1, r5)
            int r1 = com.yeelight.yeelib.R$id.room_widget_refesh
            r12.setViewVisibility(r1, r0)
            android.appwidget.AppWidgetManager r10 = android.appwidget.AppWidgetManager.getInstance(r10)
            r10.updateAppWidget(r11, r12)
        L_0x00e6:
            com.yeelight.yeelib.f.t r10 = com.yeelight.yeelib.p152f.C9812t.m23832j()
            com.yeelight.yeelib.f.t$g r12 = r9.f19273c
            r10.mo31693w(r12)
            com.yeelight.yeelib.f.t r10 = com.yeelight.yeelib.p152f.C9812t.m23832j()
            r10.mo31687n()
            android.os.Handler r10 = r9.f19272b
            android.os.Message r10 = r10.obtainMessage()
            r10.arg1 = r11
            r10.what = r6
            android.os.Handler r11 = r9.f19272b
            r11.sendMessageDelayed(r10, r7)
            goto L_0x0150
        L_0x0106:
            android.widget.RemoteViews r12 = new android.widget.RemoteViews
            java.lang.String r0 = r10.getPackageName()
            int r1 = com.yeelight.yeelib.R$layout.room_widget_layout
            r12.<init>(r0, r1)
            boolean r0 = r9.f19271a
            r0 = r0 ^ r6
            r9.f19271a = r0
            com.yeelight.yeelib.data.AppConfigurationProvider.m22360m(r0)
            boolean r0 = r9.f19271a
            java.lang.String r1 = "setBackgroundColor"
            if (r0 == 0) goto L_0x0124
            int r0 = com.yeelight.yeelib.R$id.room_widget_layout
            int r2 = com.yeelight.yeelib.R$color.black_40_transparent
            goto L_0x0128
        L_0x0124:
            int r0 = com.yeelight.yeelib.R$id.room_widget_layout
            int r2 = com.yeelight.yeelib.R$color.black_00_transparent
        L_0x0128:
            int r2 = androidx.core.content.ContextCompat.getColor(r10, r2)
            r12.setInt(r0, r1, r2)
            android.appwidget.AppWidgetManager r10 = android.appwidget.AppWidgetManager.getInstance(r10)
            r10.updateAppWidget(r11, r12)
            goto L_0x0150
        L_0x0137:
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r10 = com.yeelight.yeelib.data.DeviceDataProvider.m22383R(r10)
            com.yeelight.yeelib.f.k r11 = com.yeelight.yeelib.p152f.C9794k.m23749e()
            r11.mo31653g(r10)
            goto L_0x0150
        L_0x0147:
            com.yeelight.yeelib.f.k r10 = com.yeelight.yeelib.p152f.C9794k.m23749e()
            java.lang.String r11 = ""
            r10.mo31652f(r11)
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.appwidget.YeelightRoomWidgetProvider.m25025g(android.content.Context, int, java.lang.String):void");
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        "onAppWidgetOptionChanged appWidgetId = " + i;
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        m25023e(context, i);
    }

    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        f19269e = iArr;
    }

    public void onDisabled(Context context) {
        super.onDisabled(context);
        int[] iArr = f19269e;
        if (iArr != null) {
            for (int valueOf : iArr) {
                DeviceDataProvider.m22410n(String.valueOf(valueOf));
            }
        }
        f19270f.clear();
        C9812t.m23832j().mo31693w((C9812t.C9819g) null);
    }

    public void onEnabled(Context context) {
        super.onEnabled(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r0.equals("widget_on_click_room") != false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onReceive, intent action: "
            r0.append(r1)
            java.lang.String r1 = r9.getAction()
            r0.append(r1)
            r0.toString()
            super.onReceive(r8, r9)
            java.lang.String r0 = r9.getAction()
            if (r0 != 0) goto L_0x002a
            com.yeelight.yeelib.utils.b$a r8 = new com.yeelight.yeelib.utils.b$a
            java.lang.String r9 = f19268d
            java.lang.String r0 = "Invalid action for App Widget Service! Fix me!"
            r8.<init>(r9, r0)
            com.yeelight.yeelib.utils.C4310h.m12146b(r8)
            return
        L_0x002a:
            java.lang.String r1 = "extra_name_widget_action"
            java.lang.String r1 = r9.getStringExtra(r1)
            java.lang.String r2 = "room_widget_extra_key_widget_id"
            r3 = 0
            int r9 = r9.getIntExtra(r2, r3)
            r2 = -1
            int r4 = r0.hashCode()
            r5 = -1754544937(0xffffffff976bc4d7, float:-7.618104E-25)
            r6 = 1
            if (r4 == r5) goto L_0x0052
            r3 = -1259087259(0xffffffffb4f3da65, float:-4.542118E-7)
            if (r4 == r3) goto L_0x0048
            goto L_0x005b
        L_0x0048:
            java.lang.String r3 = "widget_on_init_room"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x005b
            r3 = 1
            goto L_0x005c
        L_0x0052:
            java.lang.String r4 = "widget_on_click_room"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r3 = -1
        L_0x005c:
            if (r3 == 0) goto L_0x006d
            if (r3 == r6) goto L_0x0061
            goto L_0x008e
        L_0x0061:
            java.lang.String r0 = "room_widget_view_init_widget"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008e
            r7.m25023e(r8, r9)
            goto L_0x008e
        L_0x006d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onReceive sub action = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = " ,appWidgetId = "
            r2.append(r3)
            r2.append(r9)
            r2.toString()
            if (r1 != 0) goto L_0x0088
            return
        L_0x0088:
            com.yeelight.yeelib.utils.C4311i.m12163n(r0)
            r7.m25025g(r8, r9, r1)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.appwidget.YeelightRoomWidgetProvider.onReceive(android.content.Context, android.content.Intent):void");
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        "onUpdate appWidgetIds size = " + iArr.length;
        super.onUpdate(context, appWidgetManager, iArr);
        f19269e = iArr;
        for (int i : iArr) {
            f19270f.put(String.valueOf(i), 0);
            m25023e(context, i);
        }
    }
}
