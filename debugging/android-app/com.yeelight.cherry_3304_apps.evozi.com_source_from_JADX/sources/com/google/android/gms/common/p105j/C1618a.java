package com.google.android.gms.common.p105j;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: com.google.android.gms.common.j.a */
public class C1618a {

    /* renamed from: a */
    private static Context f3095a;

    /* renamed from: b */
    private static Boolean f3096b;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0041 */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m4492a(android.content.Context r3) {
        /*
            java.lang.Class<com.google.android.gms.common.j.a> r0 = com.google.android.gms.common.p105j.C1618a.class
            monitor-enter(r0)
            android.content.Context r1 = r3.getApplicationContext()     // Catch:{ all -> 0x004e }
            android.content.Context r2 = f3095a     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x001b
            java.lang.Boolean r2 = f3096b     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x001b
            android.content.Context r2 = f3095a     // Catch:{ all -> 0x004e }
            if (r2 != r1) goto L_0x001b
            java.lang.Boolean r3 = f3096b     // Catch:{ all -> 0x004e }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x004e }
            monitor-exit(r0)
            return r3
        L_0x001b:
            r2 = 0
            f3096b = r2     // Catch:{ all -> 0x004e }
            boolean r2 = com.google.android.gms.common.util.C1660n.m4609i()     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x0033
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch:{ all -> 0x004e }
            boolean r3 = r3.isInstantApp()     // Catch:{ all -> 0x004e }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x004e }
        L_0x0030:
            f3096b = r3     // Catch:{ all -> 0x004e }
            goto L_0x0044
        L_0x0033:
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r3.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0041 }
            f3096b = r3     // Catch:{ ClassNotFoundException -> 0x0041 }
            goto L_0x0044
        L_0x0041:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004e }
            goto L_0x0030
        L_0x0044:
            f3095a = r1     // Catch:{ all -> 0x004e }
            java.lang.Boolean r3 = f3096b     // Catch:{ all -> 0x004e }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x004e }
            monitor-exit(r0)
            return r3
        L_0x004e:
            r3 = move-exception
            monitor-exit(r0)
            goto L_0x0052
        L_0x0051:
            throw r3
        L_0x0052:
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.p105j.C1618a.m4492a(android.content.Context):boolean");
    }
}
