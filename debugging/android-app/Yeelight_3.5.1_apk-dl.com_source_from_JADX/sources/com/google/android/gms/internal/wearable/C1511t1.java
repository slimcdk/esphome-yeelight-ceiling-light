package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.t1 */
final class C1511t1<T> implements C1417a2<T> {

    /* renamed from: a */
    private final C1486o1 f1857a;

    /* renamed from: b */
    private final C1482n2<?, ?> f1858b;

    /* renamed from: c */
    private final boolean f1859c;

    /* renamed from: d */
    private final C1430d0<?> f1860d;

    private C1511t1(C1482n2<?, ?> n2Var, C1430d0<?> d0Var, C1486o1 o1Var) {
        this.f1858b = n2Var;
        this.f1859c = d0Var.mo13596a(o1Var);
        this.f1860d = d0Var;
        this.f1857a = o1Var;
    }

    /* renamed from: i */
    static <T> C1511t1<T> m3804i(C1482n2<?, ?> n2Var, C1430d0<?> d0Var, C1486o1 o1Var) {
        return new C1511t1<>(n2Var, d0Var, o1Var);
    }

    /* renamed from: a */
    public final int mo13579a(T t) {
        C1482n2<?, ?> n2Var = this.f1858b;
        int g = n2Var.mo13727g(n2Var.mo13724d(t));
        if (!this.f1859c) {
            return g;
        }
        this.f1860d.mo13597b(t);
        throw null;
    }

    /* renamed from: b */
    public final void mo13580b(T t, byte[] bArr, int i, int i2, C1454i iVar) {
        C1480n0 n0Var = (C1480n0) t;
        if (n0Var.zzc == C1487o2.m3661a()) {
            n0Var.zzc = C1487o2.m3662b();
        }
        C1470l0 l0Var = (C1470l0) t;
        throw null;
    }

    /* renamed from: c */
    public final void mo13581c(T t, T t2) {
        C1427c2.m3472f(this.f1858b, t, t2);
        if (this.f1859c) {
            C1427c2.m3471e(this.f1860d, t, t2);
        }
    }

    /* renamed from: d */
    public final int mo13582d(T t) {
        int hashCode = this.f1858b.mo13724d(t).hashCode();
        if (!this.f1859c) {
            return hashCode;
        }
        this.f1860d.mo13597b(t);
        throw null;
    }

    /* renamed from: e */
    public final boolean mo13583e(T t) {
        this.f1860d.mo13597b(t);
        throw null;
    }

    /* renamed from: f */
    public final void mo13584f(T t) {
        this.f1858b.mo13725e(t);
        this.f1860d.mo13598c(t);
    }

    /* renamed from: g */
    public final void mo13585g(T t, C1531y yVar) {
        this.f1860d.mo13597b(t);
        throw null;
    }

    /* renamed from: h */
    public final boolean mo13586h(T t, T t2) {
        if (!this.f1858b.mo13724d(t).equals(this.f1858b.mo13724d(t2))) {
            return false;
        }
        if (!this.f1859c) {
            return true;
        }
        this.f1860d.mo13597b(t);
        this.f1860d.mo13597b(t2);
        throw null;
    }

    public final T zza() {
        return this.f1857a.mo13714e().mo13679G();
    }
}
