package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e9 */
final class C1079e9 implements C1379x9 {

    /* renamed from: b */
    private static final C1159j9 f1302b = new C1031b9();

    /* renamed from: a */
    private final C1159j9 f1303a;

    public C1079e9() {
        C1159j9 j9Var;
        C1159j9[] j9VarArr = new C1159j9[2];
        j9VarArr[0] = C1094f8.m1949c();
        try {
            j9Var = (C1159j9) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            j9Var = f1302b;
        }
        j9VarArr[1] = j9Var;
        C1063d9 d9Var = new C1063d9(j9VarArr);
        C1270q8.m2547f(d9Var, "messageInfoFactory");
        this.f1303a = d9Var;
    }

    /* renamed from: b */
    private static boolean m1896b(C1143i9 i9Var) {
        return i9Var.mo12879E() == 1;
    }

    /* renamed from: a */
    public final C1364w9 mo12745a(Class cls) {
        C1111g9 g9Var;
        C1392y7 y7Var;
        C1224na naVar;
        C1408z8 z8Var;
        C1271q9 q9Var;
        C1392y7 y7Var2;
        C1224na b0;
        C1392y7 a;
        Class<C1174k8> cls2 = C1174k8.class;
        C1394y9.m3340g(cls);
        C1143i9 a2 = this.f1303a.mo12583a(cls);
        if (a2.mo12878D()) {
            if (cls2.isAssignableFrom(cls)) {
                b0 = C1394y9.m3334b();
                a = C1014a8.m1684b();
            } else {
                b0 = C1394y9.m3335b0();
                a = C1014a8.m1683a();
            }
            return C1255p9.m2461j(b0, a, a2.zza());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean b = m1896b(a2);
            q9Var = C1287r9.m2689b();
            z8Var = C1408z8.m3407d();
            naVar = C1394y9.m3334b();
            y7Var = b ? C1014a8.m1684b() : null;
            g9Var = C1127h9.m2064b();
        } else {
            boolean b2 = m1896b(a2);
            q9Var = C1287r9.m2688a();
            z8Var = C1408z8.m3406c();
            if (b2) {
                naVar = C1394y9.m3335b0();
                y7Var2 = C1014a8.m1683a();
            } else {
                naVar = C1394y9.m3332a();
                y7Var2 = null;
            }
            g9Var = C1127h9.m2063a();
        }
        return C1239o9.m2371F(cls, a2, q9Var, z8Var, naVar, y7Var, g9Var);
    }
}
