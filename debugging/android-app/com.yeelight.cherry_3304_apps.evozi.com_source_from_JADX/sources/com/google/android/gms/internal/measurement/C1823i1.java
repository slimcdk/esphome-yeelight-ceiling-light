package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;

/* renamed from: com.google.android.gms.internal.measurement.i1 */
public class C1823i1 {
    @GuardedBy("DirectBootUtils.class")

    /* renamed from: a */
    private static UserManager f3471a;

    /* renamed from: b */
    private static volatile boolean f3472b = (!m5238a());

    private C1823i1() {
    }

    /* renamed from: a */
    public static boolean m5238a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: b */
    public static boolean m5239b(Context context) {
        return !m5238a() || m5241d(context);
    }

    @RequiresApi(24)
    @TargetApi(24)
    @GuardedBy("DirectBootUtils.class")
    /* renamed from: c */
    private static boolean m5240c(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f3471a == null) {
                f3471a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f3471a;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
                z = z2;
            } catch (NullPointerException unused) {
                f3471a = null;
                i++;
            }
        }
        if (z) {
            f3471a = null;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        return r3;
     */
    @androidx.annotation.RequiresApi(24)
    @android.annotation.TargetApi(24)
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m5241d(android.content.Context r3) {
        /*
            boolean r0 = f3472b
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<com.google.android.gms.internal.measurement.i1> r0 = com.google.android.gms.internal.measurement.C1823i1.class
            monitor-enter(r0)
            boolean r2 = f3472b     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x000f:
            boolean r3 = m5240c(r3)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            f3472b = r3     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r3
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1823i1.m5241d(android.content.Context):boolean");
    }
}
