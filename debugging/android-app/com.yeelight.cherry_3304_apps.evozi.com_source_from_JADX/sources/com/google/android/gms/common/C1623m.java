package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.C1598r0;
import com.google.android.gms.common.internal.C1601s0;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.dynamite.DynamiteModule;
import javax.annotation.CheckReturnValue;
import p011c.p012a.p019b.p028b.p031b.C0564b;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.m */
final class C1623m {

    /* renamed from: a */
    private static volatile C1598r0 f3100a;

    /* renamed from: b */
    private static final Object f3101b = new Object();

    /* renamed from: c */
    private static Context f3102c;

    /* renamed from: a */
    static C1672v m4504a(String str, C1625o oVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m4507d(str, oVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ String m4505b(boolean z, String str, C1625o oVar) {
        boolean z2 = true;
        if (z || !m4507d(str, oVar, true, false).f3195a) {
            z2 = false;
        }
        return C1672v.m4638e(str, oVar, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m4506c(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.m> r0 = com.google.android.gms.common.C1623m.class
            monitor-enter(r0)
            android.content.Context r1 = f3102c     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0011
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0013 }
            f3102c = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)
            return
        L_0x0011:
            monitor-exit(r0)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C1623m.m4506c(android.content.Context):void");
    }

    /* renamed from: d */
    private static C1672v m4507d(String str, C1625o oVar, boolean z, boolean z2) {
        try {
            if (f3100a == null) {
                C1609u.m4475k(f3102c);
                synchronized (f3101b) {
                    if (f3100a == null) {
                        f3100a = C1601s0.m4392c(DynamiteModule.m4646d(f3102c, DynamiteModule.f3211j, "com.google.android.gms.googlecertificates").mo11388c("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C1609u.m4475k(f3102c);
            try {
                return f3100a.mo11271F(new zzk(str, oVar, z, z2), C0564b.m335f(f3102c.getPackageManager())) ? C1672v.m4639f() : C1672v.m4636c(new C1624n(z, str, oVar));
            } catch (RemoteException e) {
                return C1672v.m4635b("module call", e);
            }
        } catch (DynamiteModule.C1675a e2) {
            String valueOf = String.valueOf(e2.getMessage());
            return C1672v.m4635b(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }
}
