package p051j4;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: j4.v */
public class C3283v {

    /* renamed from: a */
    private static SharedPreferences f5297a;

    /* renamed from: b */
    private static Context f5298b;

    /* renamed from: a */
    public static String m8835a() {
        if (f5297a == null) {
            f5297a = f5298b.getSharedPreferences("AppInfo", 0);
        }
        return f5297a.getString("KEY_APP_UID", (String) null);
    }

    /* renamed from: b */
    public static boolean m8836b(String str, boolean z) {
        return f5297a.getBoolean(str, z);
    }

    /* renamed from: c */
    public static int m8837c(String str, int i) {
        return f5297a.getInt(str, i);
    }

    /* renamed from: d */
    public static int m8838d() {
        if (f5297a == null) {
            f5297a = f5298b.getSharedPreferences("AppInfo", 0);
        }
        return f5297a.getInt("KEY_MUSIC_MODE_AUDIO_TYPE", 0);
    }

    /* renamed from: e */
    public static boolean m8839e() {
        if (f5297a == null) {
            f5297a = f5298b.getSharedPreferences("AppInfo", 0);
        }
        return f5297a.getBoolean("KEY_ENABLE_MUSIC_MODE", true);
    }

    /* renamed from: f */
    public static String m8840f(String str, String str2) {
        return f5297a.getString(str, str2);
    }

    /* renamed from: g */
    public static void m8841g(Context context) {
        f5298b = context;
        if (f5297a == null) {
            f5297a = context.getSharedPreferences("AppInfo", 0);
        }
    }

    /* renamed from: h */
    public static boolean m8842h() {
        if (f5297a == null) {
            f5297a = f5298b.getSharedPreferences("AppInfo", 0);
        }
        return f5297a.getBoolean("KEY_ENABLE_NOTIFICATION", true);
    }

    /* renamed from: i */
    public static boolean m8843i() {
        if (f5297a == null) {
            f5297a = f5298b.getSharedPreferences("AppInfo", 0);
        }
        return f5297a.getBoolean("KEY_ENABLE_SHARE_BLE", false);
    }

    /* renamed from: j */
    public static void m8844j(String str, boolean z) {
        f5297a.edit().putBoolean(str, z).commit();
    }

    /* renamed from: k */
    public static void m8845k(String str, int i) {
        f5297a.edit().putInt(str, i).commit();
    }

    /* renamed from: l */
    public static void m8846l(String str, String str2) {
        f5297a.edit().putString(str, str2).commit();
    }

    /* renamed from: m */
    public static void m8847m(String str) {
        f5297a.edit().putString("KEY_APP_UID", str).apply();
    }

    /* renamed from: n */
    public static void m8848n(int i) {
        f5297a.edit().putInt("KEY_MUSIC_MODE_AUDIO_TYPE", i).apply();
    }

    /* renamed from: o */
    public static void m8849o(boolean z) {
        f5297a.edit().putBoolean("KEY_ENABLE_MUSIC_MODE", z).apply();
    }

    /* renamed from: p */
    public static void m8850p(boolean z) {
        f5297a.edit().putBoolean("KEY_ENABLE_NOTIFICATION", z).apply();
    }
}
