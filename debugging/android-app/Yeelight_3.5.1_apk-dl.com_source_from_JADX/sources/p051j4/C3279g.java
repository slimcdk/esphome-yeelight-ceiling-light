package p051j4;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yeelight.yeelib.utils.AppUtils;

/* renamed from: j4.g */
public class C3279g {

    /* renamed from: a */
    private static FirebaseAnalytics f5285a;

    /* renamed from: a */
    public static void m8801a(Context context) {
        f5285a = FirebaseAnalytics.getInstance(context);
    }

    /* renamed from: b */
    public static void m8802b(boolean z) {
        if (!AppUtils.f4977a) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("Result", z);
            m8805e("add_wifi_device", bundle);
        }
    }

    /* renamed from: c */
    public static void m8803c(String str) {
        if (!AppUtils.f4977a) {
            Bundle bundle = new Bundle();
            bundle.putString("Locale", str);
            m8805e("app_launched", bundle);
        }
    }

    /* renamed from: d */
    public static void m8804d(int i) {
        if (!AppUtils.f4977a) {
            String str = i != 0 ? i != 1 ? "UNKNOWN" : "Extend" : "Collapse";
            Bundle bundle = new Bundle();
            bundle.putString("Status", str);
            m8805e("device_list", bundle);
        }
    }

    /* renamed from: e */
    private static void m8805e(String str, Bundle bundle) {
        FirebaseAnalytics firebaseAnalytics = f5285a;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.mo18496a(str, bundle);
        }
    }

    /* renamed from: f */
    public static void m8806f() {
        m8805e("google_seamless_deeplink", new Bundle());
    }

    /* renamed from: g */
    public static void m8807g() {
        m8805e("google_seamless_deeplink_set_up", new Bundle());
    }

    /* renamed from: h */
    public static void m8808h(int i) {
        if (!AppUtils.f4977a) {
            String str = i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "Device" : "Room" : "Scene";
            Bundle bundle = new Bundle();
            bundle.putString("Tab", str);
            m8805e("main_tab", bundle);
        }
    }

    /* renamed from: i */
    public static void m8809i(int i) {
        if (!AppUtils.f4977a) {
            Bundle bundle = new Bundle();
            bundle.putInt("Error", i);
            m8805e("miot_service_error", bundle);
        }
    }

    /* renamed from: j */
    public static void m8810j(String str) {
        if (!AppUtils.f4977a) {
            Bundle bundle = new Bundle();
            bundle.putString("Action", str);
            m8805e("notification_action", bundle);
        }
    }

    /* renamed from: k */
    public static void m8811k(String str) {
        if (!AppUtils.f4977a) {
            Bundle bundle = new Bundle();
            bundle.putString("Action", str);
            m8805e("shortcut_action", bundle);
        }
    }

    /* renamed from: l */
    public static void m8812l(int i) {
        String str;
        if (!AppUtils.f4977a) {
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
            m8805e("slide_menu", bundle);
        }
    }

    /* renamed from: m */
    public static void m8813m(String str) {
        if (!AppUtils.f4977a) {
            Bundle bundle = new Bundle();
            bundle.putString("Action", str);
            m8805e("tasker_action", bundle);
        }
    }

    /* renamed from: n */
    public static void m8814n(String str) {
        if (!AppUtils.f4977a) {
            Bundle bundle = new Bundle();
            bundle.putString("Action", str);
            m8805e("widget_action", bundle);
        }
    }
}
