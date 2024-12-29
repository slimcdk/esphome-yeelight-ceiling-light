package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;
import com.google.android.gms.internal.measurement.C2056x0;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w0 */
public final class C2041w0 extends C1889m4<C2041w0, C2042a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C2041w0 zzd;
    private static volatile C1813h6<C2041w0> zze;
    private C1999t4<C2056x0> zzc = C1889m4.m5471x();

    /* renamed from: com.google.android.gms.internal.measurement.w0$a */
    public static final class C2042a extends C1889m4.C1891b<C2041w0, C2042a> implements C2094z5 {
        private C2042a() {
            super(C2041w0.zzd);
        }

        /* synthetic */ C2042a(C1733c1 c1Var) {
            this();
        }

        /* renamed from: u */
        public final C2042a mo12165u(C2056x0.C2057a aVar) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2041w0) this.f3567b).m6247B((C2056x0) ((C1889m4) aVar.mo11851I()));
            return this;
        }

        /* renamed from: v */
        public final C2056x0 mo12166v(int i) {
            return ((C2041w0) this.f3567b).mo12163y(0);
        }
    }

    static {
        C2041w0 w0Var = new C2041w0();
        zzd = w0Var;
        C1889m4.m5467r(C2041w0.class, w0Var);
    }

    private C2041w0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m6247B(C2056x0 x0Var) {
        x0Var.getClass();
        C1999t4<C2056x0> t4Var = this.zzc;
        if (!t4Var.mo12091C()) {
            this.zzc = C1889m4.m5463m(t4Var);
        }
        this.zzc.add(x0Var);
    }

    /* renamed from: D */
    public static C2042a m6248D() {
        return (C2042a) zzd.mo11848t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1733c1.f3288a[i - 1]) {
            case 1:
                return new C2041w0();
            case 2:
                return new C2042a((C1733c1) null);
            case 3:
                return C1889m4.m5465p(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C2056x0.class});
            case 4:
                return zzd;
            case 5:
                C1813h6<C2041w0> h6Var = zze;
                if (h6Var == null) {
                    synchronized (C2041w0.class) {
                        h6Var = zze;
                        if (h6Var == null) {
                            h6Var = new C1889m4.C1890a<>(zzd);
                            zze = h6Var;
                        }
                    }
                }
                return h6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: y */
    public final C2056x0 mo12163y(int i) {
        return this.zzc.get(0);
    }

    /* renamed from: z */
    public final List<C2056x0> mo12164z() {
        return this.zzc;
    }
}
