package com.yeelight.yeelib.utils;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.yeelight.yeelib.utils.i */
public class C4311i {

    /* renamed from: a */
    private static FirebaseAnalytics f7497a;

    /* renamed from: a */
    public static void m12150a(Context context) {
        f7497a = FirebaseAnalytics.getInstance(context);
    }

    /* renamed from: b */
    public static void m12151b(boolean z) {
        if (!C4308b.f7482a) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("Result", z);
            m12154e("add_wifi_device", bundle);
        }
    }

    /* renamed from: c */
    public static void m12152c(String str) {
        if (!C4308b.f7482a) {
            Bundle bundle = new Bundle();
            bundle.putString("Locale", str);
            m12154e("app_launched", bundle);
        }
    }

    /* renamed from: d */
    public static void m12153d(int i) {
        if (!C4308b.f7482a) {
            String str = i != 0 ? i != 1 ? "UNKNOWN" : "Extend" : "Collapse";
            Bundle bundle = new Bundle();
            bundle.putString("Status", str);
            m12154e("device_list", bundle);
        }
    }

    /* renamed from: e */
    private static void m12154e(String str, Bundle bundle) {
        FirebaseAnalytics firebaseAnalytics = f7497a;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.mo17048a(str, bundle);
        }
    }

    /* renamed from: f */
    public static void m12155f() {
        m12154e("google_seamless_deeplink", new Bundle());
    }

    /* renamed from: g */
    public static void m12156g() {
        m12154e("google_seamless_deeplink_set_up", new Bundle());
    }

    /* renamed from: h */
    public static void m12157h(int i) {
        if (!C4308b.f7482a) {
            String str = i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "Device" : "Room" : "Scene";
            Bundle bundle = new Bundle();
            bundle.putString("Tab", str);
            m12154e("main_tab", bundle);
        }
    }

    /* renamed from: i */
    public static void m12158i(int i) {
        if (!C4308b.f7482a) {
            Bundle bundle = new Bundle();
            bundle.putInt("Error", i);
            m12154e("miot_service_error", bundle);
        }
    }

    /* renamed from: j */
    public static void m12159j(String str) {
        if (!C4308b.f7482a) {
            Bundle bundle = new Bundle();
            bundle.putString("Action", str);
            m12154e("notification_action", bundle);
        }
    }

    /* renamed from: k */
    public static void m12160k(String str) {
        if (!C4308b.f7482a) {
            Bundle bundle = new Bundle();
            bundle.putString("Action", str);
            m12154e("shortcut_action", bundle);
        }
    }

    /* renamed from: l */
    public static void m12161l(int i) {
        String str;
        if (!C4308b.f7482a) {
            switch (i) {
                case -1:
                    str = "Accout Center";
                    break;
                case 0:
                    str = "Third Party Integration";
                    break;
                case 1:
                    str = "Customized Light";
                    break;
                case 2:
                    str = "Easy Control";
                    break;
                case 3:
                    str = "Firmware Update";
                    break;
                case 4:
                    str = "HELP & FAQ";
                    break;
                case 5:
                    str = "More";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            Bundle bundle = new Bundle();
            bundle.putString("Menu Item", str);
            m12154e("slide_menu", bundle);
        }
    }

    /* renamed from: m */
    public static void m12162m(String str) {
        if (!C4308b.f7482a) {
            Bundle bundle = new Bundle();
            bundle.putString("Action", str);
            m12154e("tasker_action", bundle);
        }
    }

    /* renamed from: n */
    public static void m12163n(String str) {
        if (!C4308b.f7482a) {
            Bundle bundle = new Bundle();
            bundle.putString("Action", str);
            m12154e("widget_action", bundle);
        }
    }
}
