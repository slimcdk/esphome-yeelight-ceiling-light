package com.xiaomi.mistatistic.sdk.controller;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.h */
public class C4130h {

    /* renamed from: a */
    private static boolean f7075a = false;

    /* renamed from: a */
    private static String m11168a(String str, Object... objArr) {
        try {
            return String.format(Locale.getDefault(), str, objArr);
        } catch (Exception e) {
            m11176a("log getMessage exception :", (Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m11169a() {
        f7075a = true;
    }

    /* renamed from: a */
    private static void m11170a(int i, Throwable th, String str, String str2) {
        m11185e(str);
    }

    /* renamed from: a */
    private static void m11171a(int i, Throwable th, String str, String str2, Object... objArr) {
        m11185e(str);
        m11168a(str2, objArr);
    }

    /* renamed from: a */
    public static void m11172a(String str) {
        if (f7075a) {
            m11170a(4, (Throwable) null, (String) null, str);
        }
    }

    /* renamed from: a */
    public static void m11173a(String str, String str2) {
        if (f7075a) {
            m11170a(4, (Throwable) null, str, str2);
        }
    }

    /* renamed from: a */
    public static void m11174a(String str, String str2, Throwable th) {
        if (f7075a) {
            m11170a(0, th, str, str2);
        }
    }

    /* renamed from: a */
    public static void m11175a(String str, String str2, Object... objArr) {
        if (f7075a) {
            m11171a(4, (Throwable) null, str, str2, objArr);
        }
    }

    /* renamed from: a */
    public static void m11176a(String str, Throwable th) {
        if (f7075a) {
            m11170a(0, th, (String) null, str);
        }
    }

    /* renamed from: b */
    public static void m11177b(String str) {
        if (f7075a) {
            m11170a(3, (Throwable) null, (String) null, str);
        }
    }

    /* renamed from: b */
    public static void m11178b(String str, String str2) {
        if (f7075a) {
            m11170a(3, (Throwable) null, str, str2);
        }
    }

    /* renamed from: b */
    public static void m11179b(String str, String str2, Throwable th) {
        if (f7075a) {
            m11170a(1, th, str, str2);
        }
    }

    /* renamed from: b */
    public static void m11180b(String str, String str2, Object... objArr) {
        if (f7075a) {
            m11171a(3, (Throwable) null, str, str2, objArr);
        }
    }

    /* renamed from: c */
    public static void m11181c(String str) {
        if (f7075a) {
            m11170a(2, (Throwable) null, (String) null, str);
        }
    }

    /* renamed from: c */
    public static void m11182c(String str, String str2) {
        if (f7075a) {
            m11170a(2, (Throwable) null, str, str2);
        }
    }

    /* renamed from: d */
    public static void m11183d(String str) {
        if (f7075a) {
            m11170a(1, (Throwable) null, (String) null, str);
        }
    }

    /* renamed from: d */
    public static void m11184d(String str, String str2) {
        if (f7075a) {
            m11170a(1, (Throwable) null, (String) null, str2);
        }
    }

    /* renamed from: e */
    private static String m11185e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "MI_STAT";
        }
        return "MI_STAT_" + str;
    }
}
