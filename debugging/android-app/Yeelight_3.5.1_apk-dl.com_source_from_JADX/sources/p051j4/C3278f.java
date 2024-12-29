package p051j4;

import android.content.Context;
import com.google.firebase.C2406d;
import com.google.firebase.crashlytics.C2200a;
import com.yeelight.yeelib.managers.C8281l;

/* renamed from: j4.f */
public class C3278f {

    /* renamed from: a */
    private static boolean f5284a = false;

    /* renamed from: a */
    public static void m8796a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("initCrashWithCustomKeys params isInit: ");
        sb.append(f5284a);
        sb.append("   process: ");
        sb.append(str);
        if (!f5284a) {
            f5284a = true;
            C2406d.m6396p(context);
            m8799d("Country", context.getResources().getConfiguration().locale.getDisplayCountry());
            m8799d("Language", context.getResources().getConfiguration().locale.getDisplayLanguage());
            m8799d("Process", str);
            m8798c("LaunchTime", System.currentTimeMillis());
            if (!"Miot".equals(str)) {
                m8799d("Server", C8281l.m19542b().mo35223a());
            }
        }
    }

    /* renamed from: b */
    public static void m8797b(Throwable th) {
        if (f5284a) {
            C2200a.m5521a().mo18504c(th);
        }
    }

    /* renamed from: c */
    private static void m8798c(String str, long j) {
        C2200a.m5521a().mo18505d(str, j);
    }

    /* renamed from: d */
    private static void m8799d(String str, String str2) {
        C2200a.m5521a().mo18506e(str, str2);
    }

    /* renamed from: e */
    public static void m8800e(String str) {
        if (f5284a) {
            C2200a.m5521a().mo18507f(str);
        }
    }
}
