package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.XMJobService;

/* renamed from: com.xiaomi.push.eu */
public final class C4673eu {

    /* renamed from: a */
    private static int f8019a = 0;

    /* renamed from: a */
    private static C4674a f8020a;

    /* renamed from: a */
    private static final String f8021a = XMJobService.class.getCanonicalName();

    /* renamed from: com.xiaomi.push.eu$a */
    interface C4674a {
        /* renamed from: a */
        void mo29085a();

        /* renamed from: a */
        void mo29086a(boolean z);

        /* renamed from: a */
        boolean m13760a();
    }

    /* renamed from: a */
    public static synchronized void m13753a() {
        synchronized (C4673eu.class) {
            if (f8020a != null) {
                C4408b.m12464a("[Alarm] stop alarm.");
                f8020a.mo29085a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r7.equals(com.xiaomi.push.C4994v.m15735a(r9, r6.name).getSuperclass().getCanonicalName()) != false) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13754a(android.content.Context r9) {
        /*
            java.lang.String r0 = "android.permission.BIND_JOB_SERVICE"
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r2 = "com.xiaomi.xmsf"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x001b
            com.xiaomi.push.ev r0 = new com.xiaomi.push.ev
            r0.<init>(r9)
        L_0x0017:
            f8020a = r0
            goto L_0x00d0
        L_0x001b:
            android.content.pm.PackageManager r1 = r9.getPackageManager()
            r2 = 0
            java.lang.String r3 = r9.getPackageName()     // Catch:{ Exception -> 0x007d }
            r4 = 4
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r4)     // Catch:{ Exception -> 0x007d }
            android.content.pm.ServiceInfo[] r1 = r1.services     // Catch:{ Exception -> 0x007d }
            r3 = 1
            if (r1 == 0) goto L_0x0096
            int r4 = r1.length     // Catch:{ Exception -> 0x007d }
            r5 = 0
        L_0x0030:
            if (r2 >= r4) goto L_0x007b
            r6 = r1[r2]     // Catch:{ Exception -> 0x0078 }
            java.lang.String r7 = r6.permission     // Catch:{ Exception -> 0x0078 }
            boolean r7 = r0.equals(r7)     // Catch:{ Exception -> 0x0078 }
            if (r7 == 0) goto L_0x0061
            java.lang.String r7 = f8021a     // Catch:{ Exception -> 0x0078 }
            java.lang.String r8 = r6.name     // Catch:{ Exception -> 0x0078 }
            boolean r8 = r7.equals(r8)     // Catch:{ Exception -> 0x0078 }
            if (r8 == 0) goto L_0x0048
        L_0x0046:
            r5 = 1
            goto L_0x005e
        L_0x0048:
            java.lang.String r8 = r6.name     // Catch:{ Exception -> 0x005d }
            java.lang.Class r8 = com.xiaomi.push.C4994v.m15735a(r9, r8)     // Catch:{ Exception -> 0x005d }
            java.lang.Class r8 = r8.getSuperclass()     // Catch:{ Exception -> 0x005d }
            java.lang.String r8 = r8.getCanonicalName()     // Catch:{ Exception -> 0x005d }
            boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x005d }
            if (r7 == 0) goto L_0x005e
            goto L_0x0046
        L_0x005d:
        L_0x005e:
            if (r5 != r3) goto L_0x0061
            goto L_0x007b
        L_0x0061:
            java.lang.String r7 = f8021a     // Catch:{ Exception -> 0x0078 }
            java.lang.String r8 = r6.name     // Catch:{ Exception -> 0x0078 }
            boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x0078 }
            if (r7 == 0) goto L_0x0075
            java.lang.String r6 = r6.permission     // Catch:{ Exception -> 0x0078 }
            boolean r6 = r0.equals(r6)     // Catch:{ Exception -> 0x0078 }
            if (r6 == 0) goto L_0x0075
            r2 = 1
            goto L_0x0096
        L_0x0075:
            int r2 = r2 + 1
            goto L_0x0030
        L_0x0078:
            r1 = move-exception
            r2 = r5
            goto L_0x007e
        L_0x007b:
            r2 = r5
            goto L_0x0096
        L_0x007d:
            r1 = move-exception
        L_0x007e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "check service err : "
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r1)
        L_0x0096:
            if (r2 != 0) goto L_0x00c5
            boolean r1 = com.xiaomi.push.C4994v.m15737a((android.content.Context) r9)
            if (r1 != 0) goto L_0x009f
            goto L_0x00c5
        L_0x009f:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Should export service: "
            r1.append(r2)
            java.lang.String r2 = f8021a
            r1.append(r2)
            java.lang.String r2 = " with permission "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " in AndroidManifest.xml file"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L_0x00c5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            com.xiaomi.push.ev r0 = new com.xiaomi.push.ev
            r0.<init>(r9)
            goto L_0x0017
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4673eu.m13754a(android.content.Context):void");
    }

    /* renamed from: a */
    public static synchronized void m13755a(Context context, int i) {
        synchronized (C4673eu.class) {
            int i2 = f8019a;
            if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
                if (i == 2) {
                    f8019a = 2;
                } else {
                    f8019a = 0;
                }
            }
            int i3 = f8019a;
            if (i2 != i3 && i3 == 2) {
                m13753a();
                f8020a = new C4677ex(context);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m13756a(boolean z) {
        synchronized (C4673eu.class) {
            if (f8020a == null) {
                C4408b.m12464a("timer is not initialized");
                return;
            }
            C4408b.m12464a("[Alarm] register alarm. (" + z + ")");
            f8020a.mo29086a(z);
        }
    }

    /* renamed from: a */
    public static synchronized boolean m13757a() {
        synchronized (C4673eu.class) {
            C4674a aVar = f8020a;
            if (aVar == null) {
                return false;
            }
            boolean a = aVar.mo29085a();
            return a;
        }
    }
}
