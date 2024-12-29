package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.measurement.v1 */
public abstract class C2026v1<T> {

    /* renamed from: f */
    private static final Object f3752f = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: g */
    private static Context f3753g;

    /* renamed from: h */
    private static C1854k2<C1840j2<C1965r1>> f3754h;

    /* renamed from: i */
    private static final AtomicInteger f3755i = new AtomicInteger();

    /* renamed from: a */
    private final C1717b2 f3756a;

    /* renamed from: b */
    private final String f3757b;

    /* renamed from: c */
    private final T f3758c;

    /* renamed from: d */
    private volatile int f3759d;

    /* renamed from: e */
    private volatile T f3760e;

    private C2026v1(C1717b2 b2Var, String str, T t, boolean z) {
        this.f3759d = -1;
        if (b2Var.f3235a != null) {
            this.f3756a = b2Var;
            this.f3757b = str;
            this.f3758c = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* synthetic */ C2026v1(C1717b2 b2Var, String str, Object obj, boolean z, C2058x1 x1Var) {
        this(b2Var, str, obj, z);
    }

    /* renamed from: f */
    private final String m6107f(String str) {
        if (str != null && str.isEmpty()) {
            return this.f3757b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f3757b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: g */
    static void m6108g() {
        f3755i.incrementAndGet();
    }

    /* renamed from: h */
    public static void m6109h(Context context) {
        synchronized (f3752f) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f3753g != context) {
                C1808h1.m5184e();
                C1763e2.m5013c();
                C1950q1.m5828c();
                f3755i.incrementAndGet();
                f3753g = context;
                f3754h = C1908n2.m5581a(C2074y1.f3823a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static C2026v1<Double> m6110i(C1717b2 b2Var, String str, double d, boolean z) {
        return new C2090z1(b2Var, str, Double.valueOf(d), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static C2026v1<Long> m6111j(C1717b2 b2Var, String str, long j, boolean z) {
        return new C2058x1(b2Var, str, Long.valueOf(j), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static C2026v1<String> m6112k(C1717b2 b2Var, String str, String str2, boolean z) {
        return new C1734c2(b2Var, str, str2, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static C2026v1<Boolean> m6113l(C1717b2 b2Var, String str, boolean z, boolean z2) {
        return new C1702a2(b2Var, str, Boolean.valueOf(z), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract T mo11421e(Object obj);

    /* renamed from: m */
    public final String mo12124m() {
        return m6107f(this.f3756a.f3237c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo12125n() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f3755i
            int r0 = r0.get()
            int r1 = r6.f3759d
            if (r1 >= r0) goto L_0x00f1
            monitor-enter(r6)
            int r1 = r6.f3759d     // Catch:{ all -> 0x00ee }
            if (r1 >= r0) goto L_0x00ec
            android.content.Context r1 = f3753g     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00e4
            android.content.Context r1 = f3753g     // Catch:{ all -> 0x00ee }
            com.google.android.gms.internal.measurement.q1 r1 = com.google.android.gms.internal.measurement.C1950q1.m5827b(r1)     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r1 = r1.mo11597a(r2)     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x0031
            java.util.regex.Pattern r2 = com.google.android.gms.internal.measurement.C1792g1.f3361c     // Catch:{ all -> 0x00ee }
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.matches()     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            r2 = 0
            if (r1 != 0) goto L_0x006f
            com.google.android.gms.internal.measurement.b2 r1 = r6.f3756a     // Catch:{ all -> 0x00ee }
            android.net.Uri r1 = r1.f3235a     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x0058
            android.content.Context r1 = f3753g     // Catch:{ all -> 0x00ee }
            com.google.android.gms.internal.measurement.b2 r3 = r6.f3756a     // Catch:{ all -> 0x00ee }
            android.net.Uri r3 = r3.f3235a     // Catch:{ all -> 0x00ee }
            boolean r1 = com.google.android.gms.internal.measurement.C1996t1.m6006b(r1, r3)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x0056
            android.content.Context r1 = f3753g     // Catch:{ all -> 0x00ee }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x00ee }
            com.google.android.gms.internal.measurement.b2 r3 = r6.f3756a     // Catch:{ all -> 0x00ee }
            android.net.Uri r3 = r3.f3235a     // Catch:{ all -> 0x00ee }
            com.google.android.gms.internal.measurement.h1 r1 = com.google.android.gms.internal.measurement.C1808h1.m5183b(r1, r3)     // Catch:{ all -> 0x00ee }
            goto L_0x005e
        L_0x0056:
            r1 = r2
            goto L_0x005e
        L_0x0058:
            android.content.Context r1 = f3753g     // Catch:{ all -> 0x00ee }
            com.google.android.gms.internal.measurement.e2 r1 = com.google.android.gms.internal.measurement.C1763e2.m5012b(r1, r2)     // Catch:{ all -> 0x00ee }
        L_0x005e:
            if (r1 == 0) goto L_0x0091
            java.lang.String r3 = r6.mo12124m()     // Catch:{ all -> 0x00ee }
            java.lang.Object r1 = r1.mo11597a(r3)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x0091
            java.lang.Object r1 = r6.mo11421e(r1)     // Catch:{ all -> 0x00ee }
            goto L_0x0092
        L_0x006f:
            java.lang.String r1 = "PhenotypeFlag"
            r3 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r3)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = "Bypass reading Phenotype values for flag: "
            java.lang.String r3 = r6.mo12124m()     // Catch:{ all -> 0x00ee }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00ee }
            int r4 = r3.length()     // Catch:{ all -> 0x00ee }
            if (r4 == 0) goto L_0x008c
            r1.concat(r3)     // Catch:{ all -> 0x00ee }
            goto L_0x0091
        L_0x008c:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x00ee }
            r3.<init>(r1)     // Catch:{ all -> 0x00ee }
        L_0x0091:
            r1 = r2
        L_0x0092:
            if (r1 == 0) goto L_0x0095
            goto L_0x00b4
        L_0x0095:
            android.content.Context r1 = f3753g     // Catch:{ all -> 0x00ee }
            com.google.android.gms.internal.measurement.q1 r1 = com.google.android.gms.internal.measurement.C1950q1.m5827b(r1)     // Catch:{ all -> 0x00ee }
            com.google.android.gms.internal.measurement.b2 r3 = r6.f3756a     // Catch:{ all -> 0x00ee }
            java.lang.String r3 = r3.f3236b     // Catch:{ all -> 0x00ee }
            java.lang.String r3 = r6.m6107f(r3)     // Catch:{ all -> 0x00ee }
            java.lang.Object r1 = r1.mo11597a(r3)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00ae
            java.lang.Object r1 = r6.mo11421e(r1)     // Catch:{ all -> 0x00ee }
            goto L_0x00af
        L_0x00ae:
            r1 = r2
        L_0x00af:
            if (r1 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            T r1 = r6.f3758c     // Catch:{ all -> 0x00ee }
        L_0x00b4:
            com.google.android.gms.internal.measurement.k2<com.google.android.gms.internal.measurement.j2<com.google.android.gms.internal.measurement.r1>> r3 = f3754h     // Catch:{ all -> 0x00ee }
            java.lang.Object r3 = r3.mo11429C()     // Catch:{ all -> 0x00ee }
            com.google.android.gms.internal.measurement.j2 r3 = (com.google.android.gms.internal.measurement.C1840j2) r3     // Catch:{ all -> 0x00ee }
            boolean r4 = r3.mo11699b()     // Catch:{ all -> 0x00ee }
            if (r4 == 0) goto L_0x00df
            java.lang.Object r1 = r3.mo11700c()     // Catch:{ all -> 0x00ee }
            com.google.android.gms.internal.measurement.r1 r1 = (com.google.android.gms.internal.measurement.C1965r1) r1     // Catch:{ all -> 0x00ee }
            com.google.android.gms.internal.measurement.b2 r3 = r6.f3756a     // Catch:{ all -> 0x00ee }
            android.net.Uri r3 = r3.f3235a     // Catch:{ all -> 0x00ee }
            com.google.android.gms.internal.measurement.b2 r4 = r6.f3756a     // Catch:{ all -> 0x00ee }
            java.lang.String r4 = r4.f3237c     // Catch:{ all -> 0x00ee }
            java.lang.String r5 = r6.f3757b     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = r1.mo11977a(r3, r2, r4, r5)     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00db
            T r1 = r6.f3758c     // Catch:{ all -> 0x00ee }
            goto L_0x00df
        L_0x00db:
            java.lang.Object r1 = r6.mo11421e(r1)     // Catch:{ all -> 0x00ee }
        L_0x00df:
            r6.f3760e = r1     // Catch:{ all -> 0x00ee }
            r6.f3759d = r0     // Catch:{ all -> 0x00ee }
            goto L_0x00ec
        L_0x00e4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch:{ all -> 0x00ee }
            throw r0     // Catch:{ all -> 0x00ee }
        L_0x00ec:
            monitor-exit(r6)     // Catch:{ all -> 0x00ee }
            goto L_0x00f1
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00ee }
            throw r0
        L_0x00f1:
            T r0 = r6.f3760e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2026v1.mo12125n():java.lang.Object");
    }
}
