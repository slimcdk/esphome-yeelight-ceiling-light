package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b5 */
public class C1720b5 {

    /* renamed from: a */
    private volatile C2062x5 f3240a;

    /* renamed from: b */
    private volatile C1779f3 f3241b;

    static {
        C2076y3.m6600a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.C2062x5 m4788c(com.google.android.gms.internal.measurement.C2062x5 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.x5 r0 = r1.f3240a
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.x5 r0 = r1.f3240a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f3240a = r2     // Catch:{ w4 -> 0x0012 }
            com.google.android.gms.internal.measurement.f3 r0 = com.google.android.gms.internal.measurement.C1779f3.f3341b     // Catch:{ w4 -> 0x0012 }
            r1.f3241b = r0     // Catch:{ w4 -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f3240a = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.measurement.f3 r2 = com.google.android.gms.internal.measurement.C1779f3.f3341b     // Catch:{ all -> 0x0019 }
            r1.f3241b = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            com.google.android.gms.internal.measurement.x5 r2 = r1.f3240a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1720b5.m4788c(com.google.android.gms.internal.measurement.x5):com.google.android.gms.internal.measurement.x5");
    }

    /* renamed from: a */
    public final C2062x5 mo11456a(C2062x5 x5Var) {
        C2062x5 x5Var2 = this.f3240a;
        this.f3241b = null;
        this.f3240a = x5Var;
        return x5Var2;
    }

    /* renamed from: b */
    public final int mo11457b() {
        if (this.f3241b != null) {
            return this.f3241b.mo11638d();
        }
        if (this.f3240a != null) {
            return this.f3240a.mo11846j();
        }
        return 0;
    }

    /* renamed from: d */
    public final C1779f3 mo11458d() {
        if (this.f3241b != null) {
            return this.f3241b;
        }
        synchronized (this) {
            if (this.f3241b != null) {
                C1779f3 f3Var = this.f3241b;
                return f3Var;
            }
            this.f3241b = this.f3240a == null ? C1779f3.f3341b : this.f3240a.mo12167e();
            C1779f3 f3Var2 = this.f3241b;
            return f3Var2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1720b5)) {
            return false;
        }
        C1720b5 b5Var = (C1720b5) obj;
        C2062x5 x5Var = this.f3240a;
        C2062x5 x5Var2 = b5Var.f3240a;
        return (x5Var == null && x5Var2 == null) ? mo11458d().equals(b5Var.mo11458d()) : (x5Var == null || x5Var2 == null) ? x5Var != null ? x5Var.equals(b5Var.m4788c(x5Var.mo11841d())) : m4788c(x5Var2.mo11841d()).equals(x5Var2) : x5Var.equals(x5Var2);
    }

    public int hashCode() {
        return 1;
    }
}
