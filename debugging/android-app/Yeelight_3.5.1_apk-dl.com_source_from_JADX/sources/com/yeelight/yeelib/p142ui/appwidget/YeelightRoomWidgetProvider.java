package com.yeelight.yeelib.p142ui.appwidget;

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
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8263d;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.LocalActionExecutor;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.concurrent.ConcurrentHashMap;
import p051j4.C3278f;
import p051j4.C3279g;
import p051j4.C9205u;

/* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightRoomWidgetProvider */
public class YeelightRoomWidgetProvider extends AppWidgetProvider {

    /* renamed from: d */
    public static final String f15533d = YeelightRoomWidgetProvider.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static int[] f15534e = new int[0];

    /* renamed from: f */
    private static ConcurrentHashMap<String, Integer> f15535f = new ConcurrentHashMap<>();

    /* renamed from: a */
    private boolean f15536a = AppConfigurationProvider.m17576h();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Handler f15537b = new C8755a(Looper.getMainLooper());

    /* renamed from: c */
    private C8293t.C8300g f15538c = new C8756b();

    /* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightRoomWidgetProvider$a */
    class C8755a extends Handler {
        C8755a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                String str = YeelightRoomWidgetProvider.f15533d;
                YeelightRoomWidgetProvider.this.m20630g(C3108x.f4951e, message.arg1, "room_widget_view_refresh_silent");
            } else if (i == 2) {
                String str2 = YeelightRoomWidgetProvider.f15533d;
                YeelightRoomWidgetProvider.this.m20628e(C3108x.f4951e, message.arg1);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightRoomWidgetProvider$b */
    class C8756b implements C8293t.C8300g {
        C8756b() {
        }

        /* renamed from: d */
        public void mo31299d() {
        }

        /* renamed from: e */
        public void mo31300e() {
            for (int i : YeelightRoomWidgetProvider.f15534e) {
                String str = YeelightRoomWidgetProvider.f15533d;
                StringBuilder sb = new StringBuilder();
                sb.append("onRoomInfoLoaded appWidgetId = ");
                sb.append(i);
                sb.append(" mAppWidgetIds size = ");
                sb.append(YeelightRoomWidgetProvider.f15534e.length);
                Message obtainMessage = YeelightRoomWidgetProvider.this.f15537b.obtainMessage();
                obtainMessage.arg1 = i;
                obtainMessage.what = 1;
                YeelightRoomWidgetProvider.this.f15537b.sendMessageDelayed(obtainMessage, 500);
                YeelightRoomWidgetProvider.this.f15537b.removeMessages(3);
                Message obtainMessage2 = YeelightRoomWidgetProvider.this.f15537b.obtainMessage();
                obtainMessage2.arg1 = i;
                obtainMessage2.what = 3;
                YeelightRoomWidgetProvider.this.f15537b.sendMessageDelayed(obtainMessage2, 500);
            }
        }
    }

    public YeelightRoomWidgetProvider() {
        C8263d.m19484t();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m20628e(Context context, int i) {
        int i2;
        int i3;
        StringBuilder sb = new StringBuilder();
        sb.append("initeAppWidget appWidgetId = ");
        sb.append(i);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.room_widget_layout);
        Intent intent = new Intent(context, YeelightRoomWidgetProvider.class);
        intent.setAction("widget_on_click_room");
        intent.putExtra("extra_name_widget_action", "room_widget_add_room");
        intent.putExtra("room_widget_extra_key_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.room_weiget_add, PendingIntent.getBroadcast(context, i, intent, C9205u.m22205b(134217728)));
        Intent intent2 = new Intent(context, YeelightRoomWidgetProvider.class);
        intent2.setAction("widget_on_click_room");
        intent2.putExtra("extra_name_widget_action", "room_widget_view_refresh");
        intent2.putExtra("room_widget_extra_key_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.room_widget_refesh_layout, PendingIntent.getBroadcast(context, i * 2, intent2, C9205u.m22205b(134217728)));
        Intent intent3 = new Intent(context, YeelightRoomWidgetProvider.class);
        intent3.setAction("widget_on_click_room");
        intent3.putExtra("extra_name_widget_action", "widget_change_skin");
        intent3.putExtra("room_widget_extra_key_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.room_widget_skin_layout, PendingIntent.getBroadcast(context, i * 3, intent3, C9205u.m22205b(134217728)));
        Intent intent4 = new Intent(context, YeelightRoomWidgetProvider.class);
        intent4.setAction("widget_on_click_room");
        intent4.putExtra("extra_name_widget_action", "launch_on_click");
        intent4.putExtra("room_widget_extra_key_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.room_widget_logo_layout, PendingIntent.getBroadcast(context, i * 4, intent4, C9205u.m22205b(134217728)));
        Intent intent5 = new Intent(context, YeelightRoomWidgetProvider.class);
        intent5.setAction("widget_on_click_room");
        intent5.putExtra("extra_name_widget_action", "toggle_on_click");
        intent5.putExtra("room_widget_extra_key_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.widget_room_switch, PendingIntent.getBroadcast(context, i * 6, intent5, C9205u.m22205b(134217728)));
        Intent intent6 = new Intent(context, YeelightRoomWidgetProvider.class);
        intent6.setAction("widget_on_click_room");
        intent6.putExtra("extra_name_widget_action", "detail_on_click");
        intent6.putExtra("room_widget_extra_key_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.room_weight_title_layout, PendingIntent.getBroadcast(context, i * 5, intent6, C9205u.m22205b(134217728)));
        if (this.f15536a) {
            i3 = R$id.room_widget_layout;
            i2 = R$color.black_40_transparent;
        } else {
            i3 = R$id.room_widget_layout;
            i2 = R$color.black_00_transparent;
        }
        remoteViews.setInt(i3, "setBackgroundColor", ContextCompat.getColor(context, i2));
        m20629f(context, remoteViews, i, true);
    }

    /* renamed from: f */
    private void m20629f(Context context, RemoteViews remoteViews, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        Resources resources;
        if (C3051a.m7928z()) {
            String R = DeviceDataProvider.m17605R(String.valueOf(i));
            StringBuilder sb = new StringBuilder();
            sb.append("showRoomInfo widgetId = ");
            sb.append(i);
            sb.append(" ,roomId = ");
            sb.append(R);
            if (!TextUtils.isEmpty(R)) {
                if (!z) {
                    remoteViews.setViewVisibility(R$id.room_widget_refresh_progress, 8);
                    C6169f J0 = YeelightDeviceManager.m7800o0().mo23268J0(R);
                    if (J0 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("device is ");
                        sb2.append(J0.mo23210U());
                        remoteViews.setViewVisibility(R$id.room_widget_refesh, 0);
                        remoteViews.setViewVisibility(R$id.room_weiget_add, 8);
                        remoteViews.setViewVisibility(R$id.room_weight_card, 0);
                        remoteViews.setViewVisibility(R$id.widget_room_progress_bar, 8);
                        int i5 = R$id.widget_room_switch;
                        remoteViews.setViewVisibility(i5, 0);
                        remoteViews.setImageViewResource(R$id.widget_room_card_icon, J0.mo31874b2());
                        remoteViews.setTextViewText(R$id.widget_room_main_title, J0.mo23210U());
                        if (J0.mo23145k0()) {
                            if (J0.mo23146k1()) {
                                i3 = R$id.widget_room_sub_title;
                                resources = context.getResources();
                                i4 = R$string.common_text_status_on;
                            } else {
                                i3 = R$id.widget_room_sub_title;
                                resources = context.getResources();
                                i4 = R$string.common_text_status_off;
                            }
                            remoteViews.setTextViewText(i3, resources.getString(i4));
                            remoteViews.setViewVisibility(i5, 0);
                        } else {
                            remoteViews.setTextViewText(R$id.widget_room_sub_title, context.getResources().getString(R$string.common_text_status_offline));
                            remoteViews.setViewVisibility(i5, 4);
                        }
                    }
                } else {
                    C8293t.m19620n().mo35263z(this.f15538c);
                    C8293t.m19620n().mo35257s();
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
            Integer num = f15535f.get(String.valueOf(i));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("queryCount = ");
            sb3.append(num);
            if (num == null || num.intValue() >= 20) {
                remoteViews.setViewVisibility(R$id.room_widget_refesh, 0);
                i2 = R$id.room_widget_refresh_progress;
            } else {
                remoteViews.setViewVisibility(R$id.room_widget_refesh, 8);
                remoteViews.setViewVisibility(R$id.room_widget_refresh_progress, 0);
                f15535f.put(String.valueOf(i), Integer.valueOf(num.intValue() + 1));
                Message obtainMessage = this.f15537b.obtainMessage();
                obtainMessage.arg1 = i;
                obtainMessage.what = 2;
                this.f15537b.sendMessageDelayed(obtainMessage, 500);
                AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
            }
        }
        remoteViews.setViewVisibility(i2, 8);
        AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m20630g(Context context, int i, String str) {
        C6169f J0;
        int i2;
        int i3;
        StringBuilder sb = new StringBuilder();
        sb.append("action = ");
        sb.append(str);
        sb.append(" ,widgetId = ");
        sb.append(i);
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1898123272:
                if (str.equals("room_widget_view_refresh")) {
                    c = 0;
                    break;
                }
                break;
            case -949684394:
                if (str.equals("detail_on_click")) {
                    c = 1;
                    break;
                }
                break;
            case 315595316:
                if (str.equals("launch_on_click")) {
                    c = 2;
                    break;
                }
                break;
            case 1509164979:
                if (str.equals("toggle_on_click")) {
                    c = 3;
                    break;
                }
                break;
            case 1642908465:
                if (str.equals("widget_change_skin")) {
                    c = 4;
                    break;
                }
                break;
            case 1937957360:
                if (str.equals("room_widget_add_room")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.room_widget_layout);
                remoteViews.setViewVisibility(R$id.room_widget_refresh_progress, 0);
                remoteViews.setViewVisibility(R$id.room_widget_refesh, 8);
                AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
                break;
            case 1:
                LocalActionExecutor.m19455e().mo35168g(DeviceDataProvider.m17605R(String.valueOf(i)));
                return;
            case 2:
                LocalActionExecutor.m19455e().mo35167f("");
                return;
            case 3:
                String R = DeviceDataProvider.m17605R(String.valueOf(i));
                if (!TextUtils.isEmpty(R) && (J0 = YeelightDeviceManager.m7800o0().mo23268J0(R)) != null && J0.mo23145k0()) {
                    RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R$layout.room_widget_layout);
                    remoteViews2.setViewVisibility(R$id.widget_room_progress_bar, 0);
                    remoteViews2.setViewVisibility(R$id.widget_room_switch, 8);
                    AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews2);
                    J0.mo23114A1();
                    break;
                } else {
                    return;
                }
                break;
            case 4:
                RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), R$layout.room_widget_layout);
                boolean z = !this.f15536a;
                this.f15536a = z;
                AppConfigurationProvider.m17581m(z);
                if (this.f15536a) {
                    i3 = R$id.room_widget_layout;
                    i2 = R$color.black_40_transparent;
                } else {
                    i3 = R$id.room_widget_layout;
                    i2 = R$color.black_00_transparent;
                }
                remoteViews3.setInt(i3, "setBackgroundColor", ContextCompat.getColor(context, i2));
                AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews3);
                return;
            case 5:
                LocalActionExecutor.m19455e().mo35169h(i);
                return;
            default:
                m20629f(context, new RemoteViews(context.getPackageName(), R$layout.room_widget_layout), i, false);
                return;
        }
        C8293t.m19620n().mo35263z(this.f15538c);
        C8293t.m19620n().mo35257s();
        Message obtainMessage = this.f15537b.obtainMessage();
        obtainMessage.arg1 = i;
        obtainMessage.what = 1;
        this.f15537b.sendMessageDelayed(obtainMessage, 3000);
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("onAppWidgetOptionChanged appWidgetId = ");
        sb.append(i);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        m20628e(context, i);
    }

    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        f15534e = iArr;
    }

    public void onDisabled(Context context) {
        super.onDisabled(context);
        int[] iArr = f15534e;
        if (iArr != null) {
            for (int valueOf : iArr) {
                DeviceDataProvider.m17632n(String.valueOf(valueOf));
            }
        }
        f15535f.clear();
        C8293t.m19620n().mo35263z((C8293t.C8300g) null);
    }

    public void onEnabled(Context context) {
        super.onEnabled(context);
    }

    public void onReceive(Context context, Intent intent) {
        String str = f15533d;
        StringBuilder sb = new StringBuilder();
        sb.append("onReceive, intent action: ");
        sb.append(intent.getAction());
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (action == null) {
            C3278f.m8797b(new AppUtils.SuicideException(str, "Invalid action for App Widget Service! Fix me!"));
            return;
        }
        String stringExtra = intent.getStringExtra("extra_name_widget_action");
        int intExtra = intent.getIntExtra("room_widget_extra_key_widget_id", 0);
        if (action.equals("widget_on_click_room")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onReceive sub action = ");
            sb2.append(stringExtra);
            sb2.append(" ,appWidgetId = ");
            sb2.append(intExtra);
            if (stringExtra != null) {
                C3279g.m8814n(action);
                m20630g(context, intExtra, stringExtra);
            }
        } else if (action.equals("widget_on_init_room") && "room_widget_view_init_widget".equals(stringExtra)) {
            m20628e(context, intExtra);
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("onUpdate appWidgetIds size = ");
        sb.append(iArr.length);
        super.onUpdate(context, appWidgetManager, iArr);
        f15534e = iArr;
        for (int i : iArr) {
            f15535f.put(String.valueOf(i), 0);
            m20628e(context, i);
        }
    }
}
