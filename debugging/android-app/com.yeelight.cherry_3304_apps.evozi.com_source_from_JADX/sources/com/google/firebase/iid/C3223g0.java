package com.google.firebase.iid;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.stats.C2410a;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.g0 */
public final class C3223g0 {

    /* renamed from: a */
    private static final long f6241a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f6242b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")

    /* renamed from: c */
    private static C2410a f6243c;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m10073a(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull android.content.Intent r5) {
        /*
            java.lang.Object r0 = f6242b
            monitor-enter(r0)
            com.google.android.gms.stats.a r1 = f6243c     // Catch:{ all -> 0x0032 }
            r2 = 1
            if (r1 != 0) goto L_0x0014
            com.google.android.gms.stats.a r1 = new com.google.android.gms.stats.a     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "wake:com.google.firebase.iid.WakeLockHolder"
            r1.<init>(r4, r2, r3)     // Catch:{ all -> 0x0032 }
            f6243c = r1     // Catch:{ all -> 0x0032 }
            r1.mo13183b(r2)     // Catch:{ all -> 0x0032 }
        L_0x0014:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x0032 }
            m10074b(r5, r2)     // Catch:{ all -> 0x0032 }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x0032 }
            if (r4 != 0) goto L_0x0027
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r4
        L_0x0027:
            if (r1 != 0) goto L_0x0030
            com.google.android.gms.stats.a r5 = f6243c     // Catch:{ all -> 0x0032 }
            long r1 = f6241a     // Catch:{ all -> 0x0032 }
            r5.mo13182a(r1)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r4
        L_0x0032:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C3223g0.m10073a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: b */
    private static void m10074b(@NonNull Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }
}
