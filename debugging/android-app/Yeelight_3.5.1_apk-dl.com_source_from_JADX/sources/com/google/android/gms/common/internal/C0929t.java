package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;
import p028e0.C3144c;

/* renamed from: com.google.android.gms.common.internal.t */
public final class C0929t {

    /* renamed from: a */
    private static final Object f1061a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f1062b;

    /* renamed from: c */
    private static int f1063c;

    /* renamed from: a */
    public static int m1495a(Context context) {
        m1496b(context);
        return f1063c;
    }

    /* renamed from: b */
    private static void m1496b(Context context) {
        synchronized (f1061a) {
            if (!f1062b) {
                f1062b = true;
                try {
                    Bundle bundle = C3144c.m8403a(context).mo23627b(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        f1063c = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
