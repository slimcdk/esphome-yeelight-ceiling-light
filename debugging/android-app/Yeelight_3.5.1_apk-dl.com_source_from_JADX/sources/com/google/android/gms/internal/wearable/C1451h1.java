package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.h1 */
final class C1451h1 implements C1422b2 {

    /* renamed from: b */
    private static final C1476m1 f1787b = new C1441f1();

    /* renamed from: a */
    private final C1476m1 f1788a;

    public C1451h1() {
        C1476m1 m1Var;
        C1476m1[] m1VarArr = new C1476m1[2];
        m1VarArr[0] = C1460j0.m3573c();
        try {
            m1Var = (C1476m1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            m1Var = f1787b;
        }
        m1VarArr[1] = m1Var;
        C1446g1 g1Var = new C1446g1(m1VarArr);
        C1524w0.m3858b(g1Var, "messageInfoFactory");
        this.f1788a = g1Var;
    }

    /* renamed from: b */
    private static boolean m3544b(C1471l1 l1Var) {
        return l1Var.mo13704E() == 1;
    }

    /* renamed from: a */
    public final <T> C1417a2<T> mo13594a(Class<T> cls) {
        C1461j1 j1Var;
        C1430d0<?> d0Var;
        C1482n2<?, ?> n2Var;
        C1431d1 d1Var;
        C1516u1 u1Var;
        C1430d0<?> d0Var2;
        C1482n2<?, ?> a;
        C1430d0<?> b;
        Class<C1480n0> cls2 = C1480n0.class;
        C1427c2.m3439A(cls);
        C1471l1 b2 = this.f1788a.mo13626b(cls);
        if (b2.zza()) {
            if (cls2.isAssignableFrom(cls)) {
                a = C1427c2.m3469c();
                b = C1440f0.m3526a();
            } else {
                a = C1427c2.m3465a();
                b = C1440f0.m3527b();
            }
            return C1511t1.m3804i(a, b, b2.mo13703D());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean b3 = m3544b(b2);
            u1Var = C1521v1.m3848b();
            d1Var = C1431d1.m3505d();
            n2Var = C1427c2.m3469c();
            d0Var = b3 ? C1440f0.m3526a() : null;
            j1Var = C1466k1.m3593b();
        } else {
            boolean b4 = m3544b(b2);
            u1Var = C1521v1.m3847a();
            d1Var = C1431d1.m3504c();
            if (b4) {
                n2Var = C1427c2.m3465a();
                d0Var2 = C1440f0.m3527b();
            } else {
                n2Var = C1427c2.m3467b();
                d0Var2 = null;
            }
            j1Var = C1466k1.m3592a();
        }
        return C1506s1.m3753E(cls, b2, u1Var, d1Var, n2Var, d0Var, j1Var);
    }
}
