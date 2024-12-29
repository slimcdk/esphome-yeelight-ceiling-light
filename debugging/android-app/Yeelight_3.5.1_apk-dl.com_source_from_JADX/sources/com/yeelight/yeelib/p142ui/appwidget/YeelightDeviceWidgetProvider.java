package com.yeelight.yeelib.p142ui.appwidget;

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
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.data.AppConfigurationProvider;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6100g;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8263d;
import com.yeelight.yeelib.managers.LocalActionExecutor;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p051j4.C3278f;
import p051j4.C3279g;
import p051j4.C3284x;
import p051j4.C9205u;
import p223w3.C11911z;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightDeviceWidgetProvider */
public class YeelightDeviceWidgetProvider extends AppWidgetProvider {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f15522d = YeelightDeviceWidgetProvider.class.getSimpleName();

    /* renamed from: e */
    private static boolean f15523e = AppConfigurationProvider.m17575g();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static int[] f15524f = new int[0];

    /* renamed from: g */
    private static ConcurrentHashMap<String, Integer> f15525g = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static ConcurrentHashMap<String, Boolean> f15526h = new ConcurrentHashMap<>();

    /* renamed from: a */
    private Handler f15527a = new C8752a(Looper.getMainLooper());

    /* renamed from: b */
    private C12143c f15528b = new C8753b();

    /* renamed from: c */
    private C12145e f15529c = new C8754c();

    /* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightDeviceWidgetProvider$a */
    class C8752a extends Handler {
        C8752a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    YeelightDeviceWidgetProvider.f15526h.put(String.valueOf(message.arg1), Boolean.FALSE);
                    return;
                } else if (i != 3) {
                    return;
                }
            }
            String unused = YeelightDeviceWidgetProvider.f15522d;
            YeelightDeviceWidgetProvider.this.m20617f(C3108x.f4951e, message.arg1);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightDeviceWidgetProvider$b */
    class C8753b implements C12143c {
        C8753b() {
        }

        public void onConnectionStateChanged(int i, int i2) {
            String unused = YeelightDeviceWidgetProvider.f15522d;
            if (i2 == 0 || i2 == 2 || i2 == 8 || i2 == 11) {
                for (int e : YeelightDeviceWidgetProvider.f15524f) {
                    YeelightDeviceWidgetProvider.this.m20618g(500, e);
                }
            }
        }

        public void onLocalConnected() {
        }

        public void onLocalDisconnected() {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.appwidget.YeelightDeviceWidgetProvider$c */
    class C8754c implements C12145e {
        C8754c() {
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            String unused = YeelightDeviceWidgetProvider.f15522d;
            for (int e : YeelightDeviceWidgetProvider.f15524f) {
                YeelightDeviceWidgetProvider.this.m20618g(500, e);
            }
        }
    }

    public YeelightDeviceWidgetProvider() {
        C8263d.m19484t();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m20617f(Context context, int i) {
        int i2;
        int i3;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.device_widget_layout);
        Intent intent = new Intent(context, UpdateService.class);
        int i4 = R$id.app_widget_lv;
        remoteViews.setRemoteAdapter(i4, intent);
        Intent intent2 = new Intent();
        intent2.setClass(context, YeelightDeviceWidgetProvider.class);
        intent2.putExtra("extra_name_widget_id", i);
        remoteViews.setPendingIntentTemplate(i4, PendingIntent.getBroadcast(context, i, intent2, C9205u.m22205b(134217728)));
        Intent intent3 = new Intent();
        intent3.setAction("widget_on_click");
        intent3.setClass(context, YeelightDeviceWidgetProvider.class);
        intent3.putExtra("extra_name_widget_action", "widget_refresh");
        intent3.putExtra("extra_name_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.widget_image_refresh, PendingIntent.getBroadcast(context, i * 2, intent3, C9205u.m22205b(134217728)));
        Intent intent4 = new Intent();
        intent4.setAction("widget_on_click");
        intent4.setClass(context, YeelightDeviceWidgetProvider.class);
        intent4.putExtra("extra_name_widget_action", "list_view_change_skin");
        intent4.putExtra("extra_name_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.device_widget_skin, PendingIntent.getBroadcast(context, i * 3, intent4, C9205u.m22205b(134217728)));
        Intent intent5 = new Intent(context, UpdateService.class);
        intent5.setAction("widget_on_click");
        intent5.setClass(context, YeelightDeviceWidgetProvider.class);
        intent5.putExtra("extra_name_widget_action", "launch_on_click");
        intent5.putExtra("extra_name_widget_id", i);
        remoteViews.setOnClickPendingIntent(R$id.widget_image_logo_view, PendingIntent.getBroadcast(context, i * 4, intent5, C9205u.m22205b(134217728)));
        if (f15523e) {
            i3 = R$id.device_widget_layout;
            i2 = R$color.black_40_transparent;
        } else {
            i3 = R$id.device_widget_layout;
            i2 = R$color.black_00_transparent;
        }
        remoteViews.setInt(i3, "setBackgroundColor", ContextCompat.getColor(context, i2));
        m20620i();
        m20619h(context, i, remoteViews);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m20618g(int i, int i2) {
        Boolean bool = f15526h.get(String.valueOf(i2));
        if (bool != null && !bool.booleanValue()) {
            f15526h.put(String.valueOf(i2), Boolean.TRUE);
            m20621j(i, i2);
            this.f15527a.removeMessages(2);
            Message obtainMessage = this.f15527a.obtainMessage();
            obtainMessage.arg1 = i2;
            obtainMessage.what = 2;
            this.f15527a.sendMessageDelayed(obtainMessage, 500);
        }
    }

    /* renamed from: h */
    private void m20619h(Context context, int i, RemoteViews remoteViews) {
        Integer num;
        if (!C3051a.m7928z() && (num = f15525g.get(String.valueOf(i))) != null && num.intValue() < 20) {
            f15525g.put(String.valueOf(i), Integer.valueOf(num.intValue() + 1));
            remoteViews.setViewVisibility(R$id.widget_progress_refresh, 0);
            remoteViews.setViewVisibility(R$id.widget_image_refresh, 8);
            Message obtainMessage = this.f15527a.obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.what = 3;
            this.f15527a.sendMessageDelayed(obtainMessage, 500);
        } else {
            remoteViews.setViewVisibility(R$id.widget_progress_refresh, 8);
            remoteViews.setViewVisibility(R$id.widget_image_refresh, 0);
        }
        UpdateService.f15506b = null;
        AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i, R$id.app_widget_lv);
        AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
    }

    /* renamed from: i */
    private void m20620i() {
        List<C3010c> y0 = YeelightDeviceManager.m7800o0().mo23324y0();
        StringBuilder sb = new StringBuilder();
        sb.append("registerDeviceListener, device list size: ");
        sb.append(y0.size());
        for (C3010c next : y0) {
            next.mo23176A0(this.f15528b, false);
            next.mo23180C0(this.f15529c, false);
        }
    }

    /* renamed from: j */
    private void m20621j(int i, int i2) {
        Message obtainMessage = this.f15527a.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.arg1 = i2;
        this.f15527a.sendMessageDelayed(obtainMessage, (long) i);
    }

    /* renamed from: k */
    private void m20622k() {
        List<C3010c> y0 = YeelightDeviceManager.m7800o0().mo23324y0();
        StringBuilder sb = new StringBuilder();
        sb.append("unregisterDeviceListener, device list size: ");
        sb.append(y0.size());
        for (C3010c next : y0) {
            next.mo23133V0(this.f15528b);
            next.mo23213W0(this.f15529c);
        }
    }

    /* renamed from: l */
    private void m20623l(Context context, int i, String str, String str2) {
        int i2;
        int i3;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.device_widget_layout);
        StringBuilder sb = new StringBuilder();
        sb.append("action = ");
        sb.append(str);
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -134067486:
                if (str.equals("toggle_curtain_open")) {
                    c = 0;
                    break;
                }
                break;
            case -24616045:
                if (str.equals("list_view_change_skin")) {
                    c = 1;
                    break;
                }
                break;
            case 127683680:
                if (str.equals("toggle_curtain_close")) {
                    c = 2;
                    break;
                }
                break;
            case 315595316:
                if (str.equals("launch_on_click")) {
                    c = 3;
                    break;
                }
                break;
            case 410849248:
                if (str.equals("widget_refresh")) {
                    c = 4;
                    break;
                }
                break;
            case 1509164979:
                if (str.equals("toggle_on_click")) {
                    c = 5;
                    break;
                }
                break;
            case 2091594461:
                if (str.equals("connect_on_click")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C3010c j0 = YeelightDeviceManager.m7794j0(str2);
                if (j0 instanceof C11911z) {
                    ((C11911z) j0).mo41877x2(1);
                    return;
                }
                return;
            case 1:
                boolean z = !f15523e;
                f15523e = z;
                AppConfigurationProvider.m17580l(z);
                if (f15523e) {
                    i2 = R$id.device_widget_layout;
                    i3 = R$color.black_40_transparent;
                } else {
                    i2 = R$id.device_widget_layout;
                    i3 = R$color.black_00_transparent;
                }
                remoteViews.setInt(i2, "setBackgroundColor", ContextCompat.getColor(context, i3));
                AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
                return;
            case 2:
                C3010c j02 = YeelightDeviceManager.m7794j0(str2);
                if (j02 instanceof C11911z) {
                    ((C11911z) j02).mo41877x2(2);
                    return;
                }
                return;
            case 3:
                LocalActionExecutor.m19455e().mo35167f(str2);
                return;
            case 4:
                remoteViews.setViewVisibility(R$id.widget_progress_refresh, 0);
                remoteViews.setViewVisibility(R$id.widget_image_refresh, 4);
                AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
                AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i, R$id.app_widget_lv);
                m20621j(2000, i);
                return;
            case 5:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("command toggle, device id = ");
                sb2.append(str2);
                m20620i();
                C3010c j03 = YeelightDeviceManager.m7794j0(str2);
                if (j03 != null) {
                    if ((j03 instanceof WifiDeviceBase) || (j03 instanceof C6100g)) {
                        if (j03.mo23145k0()) {
                            C3012e eVar = (C3012e) j03;
                            if (eVar.mo23146k1()) {
                                eVar.mo23140b1();
                            } else {
                                eVar.mo23148l1();
                            }
                        }
                    } else if (j03 instanceof C6081a) {
                        if (j03.mo23230o0() || j03.mo23234r0()) {
                            if (j03.mo23145k0() || j03.mo23234r0()) {
                                boolean d0 = j03.mo23221d0().mo31584d0();
                                C6081a aVar = (C6081a) j03;
                                if (d0) {
                                    aVar.mo23140b1();
                                } else {
                                    aVar.mo23148l1();
                                }
                            } else {
                                j03.mo23151n();
                            }
                        }
                    } else if ((j03 instanceof C6119c) && j03.mo23145k0()) {
                        C6119c cVar = (C6119c) j03;
                        if (cVar.mo23146k1()) {
                            cVar.mo23140b1();
                        } else {
                            cVar.mo23148l1();
                        }
                    }
                    C3284x.m8852b();
                }
                UpdateService.f15506b = str2;
                break;
            case 6:
                m20620i();
                C3010c j04 = YeelightDeviceManager.m7794j0(str2);
                if (j04 != null && (j04 instanceof C6081a) && (j04.mo23230o0() || j04.mo23234r0())) {
                    if (!j04.mo23145k0() && !j04.mo23234r0()) {
                        j04.mo23151n();
                        break;
                    } else {
                        boolean d02 = j04.mo23221d0().mo31584d0();
                        C6081a aVar2 = (C6081a) j04;
                        if (!d02) {
                            aVar2.mo23148l1();
                            break;
                        } else {
                            aVar2.mo23140b1();
                            break;
                        }
                    }
                }
                break;
            default:
                return;
        }
        AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i, R$id.app_widget_lv);
        m20621j(PathInterpolatorCompat.MAX_NUM_POINTS, i);
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        m20623l(context, i, "widget_refresh", "");
    }

    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        f15524f = iArr;
    }

    public void onDisabled(Context context) {
        super.onDisabled(context);
        m20622k();
        f15526h.clear();
        f15525g.clear();
    }

    public void onEnabled(Context context) {
        super.onEnabled(context);
        C3051a.m7925r();
    }

    public void onReceive(Context context, Intent intent) {
        String str = f15522d;
        super.onReceive(context, intent);
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder();
        sb.append("onReceive !!! + action = ");
        sb.append(action);
        if (action == null) {
            C3278f.m8797b(new AppUtils.SuicideException(str, "Invalid action for App Widget Service! Fix me!"));
        } else if (action.equals("widget_on_click")) {
            String stringExtra = intent.getStringExtra("extra_name_widget_action");
            int intExtra = intent.getIntExtra("extra_name_widget_id", 0);
            String stringExtra2 = intent.getStringExtra("com.yeelight.cherry.device_id");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onReceive !!! + command = ");
            sb2.append(stringExtra);
            sb2.append(" , widgetId = ");
            sb2.append(intExtra);
            if (stringExtra != null) {
                C3279g.m8814n(action);
                m20623l(context, intExtra, stringExtra, stringExtra2);
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        f15524f = iArr;
        for (int i : iArr) {
            f15526h.put(String.valueOf(i), Boolean.FALSE);
            f15525g.put(String.valueOf(i), 0);
            m20617f(context, i);
        }
    }
}
