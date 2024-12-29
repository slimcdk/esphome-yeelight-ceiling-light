package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r8 */
public class C1286r8 {

    /* renamed from: a */
    protected volatile C1191l9 f1570a;

    /* renamed from: b */
    private volatile zzjb f1571b;

    static {
        C1377x7.m3246a();
    }

    /* renamed from: a */
    public final int mo13207a() {
        if (this.f1571b != null) {
            return ((zziy) this.f1571b).zza.length;
        }
        if (this.f1570a != null) {
            return this.f1570a.mo12908c();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzjb mo13208b() {
        if (this.f1571b != null) {
            return this.f1571b;
        }
        synchronized (this) {
            if (this.f1571b != null) {
                zzjb zzjb = this.f1571b;
                return zzjb;
            }
            this.f1571b = this.f1570a == null ? zzjb.zzb : this.f1570a.mo12974f();
            zzjb zzjb2 = this.f1571b;
            return zzjb2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13209c(com.google.android.gms.internal.measurement.C1191l9 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.l9 r0 = r1.f1570a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.l9 r0 = r1.f1570a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f1570a = r2     // Catch:{ zzkm -> 0x0011 }
            com.google.android.gms.internal.measurement.zzjb r0 = com.google.android.gms.internal.measurement.zzjb.zzb     // Catch:{ zzkm -> 0x0011 }
            r1.f1571b = r0     // Catch:{ zzkm -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f1570a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.zzjb r2 = com.google.android.gms.internal.measurement.zzjb.zzb     // Catch:{ all -> 0x001b }
            r1.f1571b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1286r8.mo13209c(com.google.android.gms.internal.measurement.l9):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1286r8)) {
            return false;
        }
        C1286r8 r8Var = (C1286r8) obj;
        C1191l9 l9Var = this.f1570a;
        C1191l9 l9Var2 = r8Var.f1570a;
        if (l9Var == null && l9Var2 == null) {
            return mo13208b().equals(r8Var.mo13208b());
        }
        if (l9Var != null && l9Var2 != null) {
            return l9Var.equals(l9Var2);
        }
        if (l9Var != null) {
            r8Var.mo13209c(l9Var.mo12830a());
            return l9Var.equals(r8Var.f1570a);
        }
        mo13209c(l9Var2.mo12830a());
        return this.f1570a.equals(l9Var2);
    }

    public int hashCode() {
        return 1;
    }
}
