package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.x0 */
public class C1528x0 {

    /* renamed from: a */
    protected volatile C1486o1 f1872a;

    /* renamed from: b */
    private volatile zzau f1873b;

    static {
        C1425c0.m3435a();
    }

    /* renamed from: a */
    public final int mo13838a() {
        if (this.f1873b != null) {
            return ((zzas) this.f1873b).zza.length;
        }
        if (this.f1872a != null) {
            return this.f1872a.mo13711b();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzau mo13839b() {
        if (this.f1873b != null) {
            return this.f1873b;
        }
        synchronized (this) {
            if (this.f1873b != null) {
                zzau zzau = this.f1873b;
                return zzau;
            }
            this.f1873b = this.f1872a == null ? zzau.zzb : this.f1872a.mo13621K();
            zzau zzau2 = this.f1873b;
            return zzau2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13840c(com.google.android.gms.internal.wearable.C1486o1 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.wearable.o1 r0 = r1.f1872a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.wearable.o1 r0 = r1.f1872a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f1872a = r2     // Catch:{ zzcc -> 0x0011 }
            com.google.android.gms.internal.wearable.zzau r0 = com.google.android.gms.internal.wearable.zzau.zzb     // Catch:{ zzcc -> 0x0011 }
            r1.f1873b = r0     // Catch:{ zzcc -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f1872a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.wearable.zzau r2 = com.google.android.gms.internal.wearable.zzau.zzb     // Catch:{ all -> 0x001b }
            r1.f1873b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1528x0.mo13840c(com.google.android.gms.internal.wearable.o1):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1528x0)) {
            return false;
        }
        C1528x0 x0Var = (C1528x0) obj;
        C1486o1 o1Var = this.f1872a;
        C1486o1 o1Var2 = x0Var.f1872a;
        if (o1Var == null && o1Var2 == null) {
            return mo13839b().equals(x0Var.mo13839b());
        }
        if (o1Var != null && o1Var2 != null) {
            return o1Var.equals(o1Var2);
        }
        if (o1Var != null) {
            x0Var.mo13840c(o1Var.mo13680a());
            return o1Var.equals(x0Var.f1872a);
        }
        mo13840c(o1Var2.mo13680a());
        return this.f1872a.equals(o1Var2);
    }

    public int hashCode() {
        return 1;
    }
}
