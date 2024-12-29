package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ob */
public final class C1932ob implements C1881lb {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3654a;

    /* renamed from: b */
    private static final C2026v1<Double> f3655b;

    /* renamed from: c */
    private static final C2026v1<Long> f3656c;

    /* renamed from: d */
    private static final C2026v1<Long> f3657d;

    /* renamed from: e */
    private static final C2026v1<String> f3658e;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3654a = b2Var.mo11455d("measurement.test.boolean_flag", false);
        f3655b = b2Var.mo11452a("measurement.test.double_flag", -3.0d);
        f3656c = b2Var.mo11453b("measurement.test.int_flag", -2);
        f3657d = b2Var.mo11453b("measurement.test.long_flag", -1);
        f3658e = b2Var.mo11454c("measurement.test.string_flag", "---");
    }

    /* renamed from: C */
    public final boolean mo11818C() {
        return f3654a.mo12125n().booleanValue();
    }

    /* renamed from: D */
    public final double mo11819D() {
        return f3655b.mo12125n().doubleValue();
    }

    /* renamed from: E */
    public final long mo11820E() {
        return f3656c.mo12125n().longValue();
    }

    /* renamed from: F */
    public final long mo11821F() {
        return f3657d.mo12125n().longValue();
    }

    /* renamed from: G */
    public final String mo11822G() {
        return f3658e.mo12125n();
    }
}
