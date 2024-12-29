package p052k;

import android.os.Build;
import android.util.Log;

/* renamed from: k.a */
public final class C3285a {
    /* renamed from: a */
    private static String m8853a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m8854b(String str, String str2, Object obj) {
        if (Log.isLoggable(m8857e(str), 3)) {
            String.format(str2, new Object[]{obj});
        }
    }

    /* renamed from: c */
    public static void m8855c(String str, String str2, Object... objArr) {
        if (Log.isLoggable(m8857e(str), 3)) {
            String.format(str2, objArr);
        }
    }

    /* renamed from: d */
    public static void m8856d(String str, String str2, Throwable th) {
        m8857e(str);
    }

    /* renamed from: e */
    private static String m8857e(String str) {
        if (Build.VERSION.SDK_INT < 24) {
            return m8853a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m8858f(String str, String str2, Object obj) {
        if (Log.isLoggable(m8857e(str), 4)) {
            String.format(str2, new Object[]{obj});
        }
    }

    /* renamed from: g */
    public static void m8859g(String str, String str2, Object obj) {
        if (Log.isLoggable(m8857e(str), 5)) {
            String.format(str2, new Object[]{obj});
        }
    }
}
