package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.p105j.C1620c;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.u0 */
public final class C1610u0 {

    /* renamed from: a */
    private static Object f3082a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f3083b;

    /* renamed from: c */
    private static String f3084c;

    /* renamed from: d */
    private static int f3085d;

    /* renamed from: a */
    public static String m4481a(Context context) {
        m4483c(context);
        return f3084c;
    }

    /* renamed from: b */
    public static int m4482b(Context context) {
        m4483c(context);
        return f3085d;
    }

    /* renamed from: c */
    private static void m4483c(Context context) {
        synchronized (f3082a) {
            if (!f3083b) {
                f3083b = true;
                try {
                    Bundle bundle = C1620c.m4502a(context).mo11301c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f3084c = bundle.getString("com.google.app.id");
                        f3085d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
