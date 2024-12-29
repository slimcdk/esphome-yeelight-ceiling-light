package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j0 */
public final class C1836j0 extends C1889m4<C1836j0, C1837a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1836j0 zzh;
    private static volatile C1813h6<C1836j0> zzi;
    private int zzc;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private C1999t4<String> zzg = C1889m4.m5471x();

    /* renamed from: com.google.android.gms.internal.measurement.j0$a */
    public static final class C1837a extends C1889m4.C1891b<C1836j0, C1837a> implements C2094z5 {
        private C1837a() {
            super(C1836j0.zzh);
        }

        /* synthetic */ C1837a(C1852k0 k0Var) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.j0$b */
    public enum C1838b implements C1953q4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        

        /* renamed from: a */
        private final int f3497a;

        private C1838b(int i) {
            this.f3497a = i;
        }

        /* renamed from: a */
        public static C1838b m5273a(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static C1984s4 m5274b() {
            return C1935p0.f3661a;
        }

        /* renamed from: C */
        public final int mo11694C() {
            return this.f3497a;
        }

        public final String toString() {
            return "<" + C1838b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3497a + " name=" + name() + '>';
        }
    }

    static {
        C1836j0 j0Var = new C1836j0();
        zzh = j0Var;
        C1889m4.m5467r(C1836j0.class, j0Var);
    }

    private C1836j0() {
    }

    /* renamed from: H */
    public static C1836j0 m5262H() {
        return zzh;
    }

    /* renamed from: A */
    public final boolean mo11750A() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: B */
    public final String mo11751B() {
        return this.zze;
    }

    /* renamed from: D */
    public final boolean mo11752D() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: E */
    public final boolean mo11753E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final List<String> mo11754F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final int mo11755G() {
        return this.zzg.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1852k0.f3512a[i - 1]) {
            case 1:
                return new C1836j0();
            case 2:
                return new C1837a((C1852k0) null);
            case 3:
                return C1889m4.m5465p(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", C1838b.m5274b(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C1813h6<C1836j0> h6Var = zzi;
                if (h6Var == null) {
                    synchronized (C1836j0.class) {
                        h6Var = zzi;
                        if (h6Var == null) {
                            h6Var = new C1889m4.C1890a<>(zzh);
                            zzi = h6Var;
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
    public final boolean mo11756y() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: z */
    public final C1838b mo11757z() {
        C1838b a = C1838b.m5273a(this.zzd);
        return a == null ? C1838b.UNKNOWN_MATCH_TYPE : a;
    }
}
