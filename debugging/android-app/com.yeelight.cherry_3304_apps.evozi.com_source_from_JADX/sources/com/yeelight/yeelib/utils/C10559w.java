package com.yeelight.yeelib.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.yeelight.yeelib.utils.w */
public class C10559w {

    /* renamed from: a */
    private static SharedPreferences f20175a;

    /* renamed from: b */
    private static Context f20176b;

    /* renamed from: a */
    public static String m25805a() {
        if (f20175a == null) {
            f20175a = f20176b.getSharedPreferences("AppInfo", 0);
        }
        return f20175a.getString("KEY_APP_UID", (String) null);
    }

    /* renamed from: b */
    public static boolean m25806b(String str, boolean z) {
        return f20175a.getBoolean(str, z);
    }

    /* renamed from: c */
    public static int m25807c(String str, int i) {
        return f20175a.getInt(str, i);
    }

    /* renamed from: d */
    public static int m25808d() {
        if (f20175a == null) {
            f20175a = f20176b.getSharedPreferences("AppInfo", 0);
        }
        return f20175a.getInt("KEY_MUSIC_MODE_AUDIO_TYPE", 0);
    }

    /* renamed from: e */
    public static boolean m25809e() {
        if (f20175a == null) {
            f20175a = f20176b.getSharedPreferences("AppInfo", 0);
        }
        return f20175a.getBoolean("KEY_ENABLE_MUSIC_MODE", true);
    }

    /* renamed from: f */
    public static String m25810f(String str, String str2) {
        return f20175a.getString(str, str2);
    }

    /* renamed from: g */
    public static void m25811g(Context context) {
        f20176b = context;
        context.getSharedPreferences("HOT_FIX_RANDOM_VALUE_" + String.valueOf(C4308b.m12124c()), 0);
    }

    /* renamed from: h */
    public static boolean m25812h() {
        if (f20175a == null) {
            f20175a = f20176b.getSharedPreferences("AppInfo", 0);
        }
        return f20175a.getBoolean("KEY_ENABLE_NOTIFICATION", true);
    }

    /* renamed from: i */
    public static boolean m25813i() {
        if (f20175a == null) {
            f20175a = f20176b.getSharedPreferences("AppInfo", 0);
        }
        return f20175a.getBoolean("KEY_ENABLE_SHARE_BLE", false);
    }

    /* renamed from: j */
    public static void m25814j(String str, boolean z) {
        f20175a.edit().putBoolean(str, z).commit();
    }

    /* renamed from: k */
    public static void m25815k(String str, int i) {
        f20175a.edit().putInt(str, i).commit();
    }

    /* renamed from: l */
    public static void m25816l(String str, String str2) {
        f20175a.edit().putString(str, str2).commit();
    }

    /* renamed from: m */
    public static void m25817m(String str) {
        f20175a.edit().putString("KEY_APP_UID", str).apply();
    }

    /* renamed from: n */
    public static void m25818n(int i) {
        f20175a.edit().putInt("KEY_MUSIC_MODE_AUDIO_TYPE", i).apply();
    }

    /* renamed from: o */
    public static void m25819o(boolean z) {
        f20175a.edit().putBoolean("KEY_ENABLE_MUSIC_MODE", z).apply();
    }

    /* renamed from: p */
    public static void m25820p(boolean z) {
        f20175a.edit().putBoolean("KEY_ENABLE_NOTIFICATION", z).apply();
    }
}
