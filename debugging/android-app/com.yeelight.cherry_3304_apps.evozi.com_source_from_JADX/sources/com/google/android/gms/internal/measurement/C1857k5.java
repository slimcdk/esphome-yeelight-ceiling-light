package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;

/* renamed from: com.google.android.gms.internal.measurement.k5 */
final class C1857k5 implements C1941p6 {

    /* renamed from: b */
    private static final C2015u5 f3516b = new C1911n5();

    /* renamed from: a */
    private final C2015u5 f3517a;

    public C1857k5() {
        this(new C1896m5(C1910n4.m5584c(), m5309b()));
    }

    private C1857k5(C2015u5 u5Var) {
        C1925o4.m5644f(u5Var, "messageInfoFactory");
        this.f3517a = u5Var;
    }

    /* renamed from: b */
    private static C2015u5 m5309b() {
        try {
            return (C2015u5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f3516b;
        }
    }

    /* renamed from: c */
    private static boolean m5310c(C2032v5 v5Var) {
        return v5Var.mo11471C() == C1889m4.C1894e.f3577i;
    }

    /* renamed from: a */
    public final <T> C1912n6<T> mo11772a(Class<T> cls) {
        Class<C1889m4> cls2 = C1889m4.class;
        C1927o6.m5694p(cls);
        C2032v5 b = this.f3517a.mo11864b(cls);
        if (b.mo11472D()) {
            return cls2.isAssignableFrom(cls) ? C1752d6.m4970i(C1927o6.m5650B(), C1719b4.m4785a(), b.mo11473E()) : C1752d6.m4970i(C1927o6.m5684f(), C1719b4.m4786b(), b.mo11473E());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean c = m5310c(b);
            C1797g6 b2 = C1828i6.m5248b();
            C1812h5 c2 = C1812h5.m5201c();
            C1768e7<?, ?> B = C1927o6.m5650B();
            if (c) {
                return C1721b6.m4818p(cls, b, b2, c2, B, C1719b4.m4785a(), C1985s5.m5944b());
            }
            return C1721b6.m4818p(cls, b, b2, c2, B, (C1704a4<?>) null, C1985s5.m5944b());
        }
        boolean c3 = m5310c(b);
        C1797g6 a = C1828i6.m5247a();
        C1812h5 a2 = C1812h5.m5200a();
        if (c3) {
            return C1721b6.m4818p(cls, b, a, a2, C1927o6.m5684f(), C1719b4.m4786b(), C1985s5.m5943a());
        }
        return C1721b6.m4818p(cls, b, a, a2, C1927o6.m5700v(), (C1704a4<?>) null, C1985s5.m5943a());
    }
}
