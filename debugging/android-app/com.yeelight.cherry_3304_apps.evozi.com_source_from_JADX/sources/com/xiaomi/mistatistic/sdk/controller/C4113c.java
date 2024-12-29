package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.c */
public abstract class C4113c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Context f7037a;

    /* renamed from: b */
    private static String f7038b;

    /* renamed from: c */
    private static String f7039c;

    /* renamed from: d */
    private static String f7040d;

    /* renamed from: e */
    private static String f7041e;

    /* renamed from: f */
    private static String f7042f;

    /* renamed from: g */
    private static String f7043g;

    /* renamed from: a */
    public static Context m11105a() {
        return f7037a;
    }

    /* renamed from: a */
    public static void m11106a(Context context, String str, String str2, String str3) {
        f7037a = context;
        f7038b = str;
        f7039c = str2;
        f7040d = str3;
        f7043g = String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: a */
    public static void m11107a(String str) {
        f7041e = str;
    }

    /* renamed from: b */
    public static String m11108b() {
        return f7038b;
    }

    /* renamed from: b */
    public static void m11109b(String str) {
        f7042f = str;
    }

    /* renamed from: c */
    public static String m11110c() {
        return f7039c;
    }

    /* renamed from: d */
    public static String m11111d() {
        return f7040d;
    }

    /* renamed from: e */
    public static String m11112e() {
        if (!TextUtils.isEmpty(f7041e)) {
            return f7041e;
        }
        try {
            final PackageManager packageManager = f7037a.getPackageManager();
            FutureTask futureTask = new FutureTask(new Callable<String>() {
                /* renamed from: a */
                public String call() {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(C4113c.f7037a.getPackageName(), 16384);
                        if (packageInfo != null) {
                            return packageInfo.versionName;
                        }
                        return null;
                    } catch (Exception e) {
                        C4130h.m11176a("getPackageInfo exception: ", (Throwable) e);
                        return null;
                    }
                }
            });
            new Thread(futureTask).start();
            f7041e = (String) futureTask.get(1000, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            C4130h.m11176a("getVersion exception: ", (Throwable) e);
        }
        return f7041e;
    }

    /* renamed from: f */
    public static String m11113f() {
        return f7043g;
    }

    /* renamed from: g */
    public static String m11114g() {
        if (!TextUtils.isEmpty(f7042f)) {
            return f7042f;
        }
        String packageName = f7037a.getPackageName();
        f7042f = packageName;
        return packageName;
    }
}
