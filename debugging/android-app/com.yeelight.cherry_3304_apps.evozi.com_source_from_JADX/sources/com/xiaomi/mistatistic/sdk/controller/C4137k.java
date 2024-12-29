package com.xiaomi.mistatistic.sdk.controller;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.k */
public class C4137k {

    /* renamed from: a */
    public static String f7086a;

    /* renamed from: b */
    private static ExecutorService f7087b = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public static int m11202a(Context context, String str, int i) {
        return context.getSharedPreferences(m11204a(context), 0).getInt(str, i);
    }

    /* renamed from: a */
    public static long m11203a(Context context, String str, long j) {
        return context.getSharedPreferences(m11204a(context), 0).getLong(str, j);
    }

    /* renamed from: a */
    public static String m11204a(Context context) {
        if (!TextUtils.isEmpty(f7086a)) {
            return f7086a;
        }
        String c = m11214c(context);
        if (TextUtils.equals(c, context.getPackageName())) {
            f7086a = "mistat";
        } else {
            f7086a = "mistat" + C4162q.m11298c(c);
        }
        return f7086a;
    }

    /* renamed from: a */
    public static String m11205a(Context context, String str, String str2) {
        return context.getSharedPreferences(m11204a(context), 0).getString(str, str2);
    }

    /* renamed from: a */
    public static void m11206a(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences(m11204a(context), 0).edit();
        edit.putBoolean(str, z);
        m11207a(edit);
    }

    /* renamed from: a */
    private static void m11207a(final SharedPreferences.Editor editor) {
        f7087b.execute(new Runnable() {
            public void run() {
                editor.commit();
            }
        });
    }

    /* renamed from: a */
    public static boolean m11208a(Context context, String str) {
        return context.getSharedPreferences(m11204a(context), 0).getBoolean(str, false);
    }

    /* renamed from: b */
    public static void m11209b(Context context) {
        context.getSharedPreferences(m11204a(context), 0).edit().clear().commit();
    }

    /* renamed from: b */
    public static void m11210b(Context context, String str, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences(m11204a(context), 0).edit();
        edit.putInt(str, i);
        m11207a(edit);
    }

    /* renamed from: b */
    public static void m11211b(Context context, String str, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences(m11204a(context), 0).edit();
        edit.putLong(str, j);
        m11207a(edit);
    }

    /* renamed from: b */
    public static void m11212b(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(m11204a(context), 0).edit();
        edit.putString(str, str2);
        m11207a(edit);
    }

    /* renamed from: b */
    public static boolean m11213b(Context context, String str) {
        return context.getSharedPreferences(m11204a(context), 0).contains(str);
    }

    /* renamed from: c */
    private static String m11214c(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager.getRunningAppProcesses() == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
            if (next.pid == Process.myPid()) {
                return next.processName;
            }
        }
        return "";
    }

    /* renamed from: c */
    public static boolean m11215c(Context context, String str) {
        return context.getSharedPreferences(m11204a(context), 0).contains(str);
    }
}
