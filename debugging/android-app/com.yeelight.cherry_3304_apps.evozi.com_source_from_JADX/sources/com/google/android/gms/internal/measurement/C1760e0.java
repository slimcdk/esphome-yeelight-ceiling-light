package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1775f0;
import com.google.android.gms.internal.measurement.C1821i0;
import com.google.android.gms.internal.measurement.C1889m4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
public final class C1760e0 extends C1889m4<C1760e0, C1761a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1760e0 zzi;
    private static volatile C1813h6<C1760e0> zzj;
    private int zzc;
    private int zzd;
    private C1999t4<C1821i0> zze = C1889m4.m5471x();
    private C1999t4<C1775f0> zzf = C1889m4.m5471x();
    private boolean zzg;
    private boolean zzh;

    /* renamed from: com.google.android.gms.internal.measurement.e0$a */
    public static final class C1761a extends C1889m4.C1891b<C1760e0, C1761a> implements C2094z5 {
        private C1761a() {
            super(C1760e0.zzi);
        }

        /* synthetic */ C1761a(C1852k0 k0Var) {
            this();
        }

        /* renamed from: u */
        public final int mo11588u() {
            return ((C1760e0) this.f3567b).mo11584J();
        }

        /* renamed from: v */
        public final C1761a mo11589v(int i, C1775f0.C1776a aVar) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1760e0) this.f3567b).m4995z(i, (C1775f0) ((C1889m4) aVar.mo11851I()));
            return this;
        }

        /* renamed from: w */
        public final C1761a mo11590w(int i, C1821i0.C1822a aVar) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1760e0) this.f3567b).m4991A(i, (C1821i0) ((C1889m4) aVar.mo11851I()));
            return this;
        }

        /* renamed from: x */
        public final C1821i0 mo11591x(int i) {
            return ((C1760e0) this.f3567b).mo11587y(i);
        }

        /* renamed from: y */
        public final int mo11592y() {
            return ((C1760e0) this.f3567b).mo11586L();
        }

        /* renamed from: z */
        public final C1775f0 mo11593z(int i) {
            return ((C1760e0) this.f3567b).mo11582G(i);
        }
    }

    static {
        C1760e0 e0Var = new C1760e0();
        zzi = e0Var;
        C1889m4.m5467r(C1760e0.class, e0Var);
    }

    private C1760e0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m4991A(int i, C1821i0 i0Var) {
        i0Var.getClass();
        C1999t4<C1821i0> t4Var = this.zze;
        if (!t4Var.mo12091C()) {
            this.zze = C1889m4.m5463m(t4Var);
        }
        this.zze.set(i, i0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m4995z(int i, C1775f0 f0Var) {
        f0Var.getClass();
        C1999t4<C1775f0> t4Var = this.zzf;
        if (!t4Var.mo12091C()) {
            this.zzf = C1889m4.m5463m(t4Var);
        }
        this.zzf.set(i, f0Var);
    }

    /* renamed from: E */
    public final boolean mo11580E() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: F */
    public final int mo11581F() {
        return this.zzd;
    }

    /* renamed from: G */
    public final C1775f0 mo11582G(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: H */
    public final List<C1821i0> mo11583H() {
        return this.zze;
    }

    /* renamed from: J */
    public final int mo11584J() {
        return this.zze.size();
    }

    /* renamed from: K */
    public final List<C1775f0> mo11585K() {
        return this.zzf;
    }

    /* renamed from: L */
    public final int mo11586L() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1852k0.f3512a[i - 1]) {
            case 1:
                return new C1760e0();
            case 2:
                return new C1761a((C1852k0) null);
            case 3:
                return C1889m4.m5465p(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", C1821i0.class, "zzf", C1775f0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                C1813h6<C1760e0> h6Var = zzj;
                if (h6Var == null) {
                    synchronized (C1760e0.class) {
                        h6Var = zzj;
                        if (h6Var == null) {
                            h6Var = new C1889m4.C1890a<>(zzi);
                            zzj = h6Var;
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
    public final C1821i0 mo11587y(int i) {
        return this.zze.get(i);
    }
}
