package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.g1 */
final class C1446g1 implements C1476m1 {

    /* renamed from: a */
    private final C1476m1[] f1777a;

    C1446g1(C1476m1... m1VarArr) {
        this.f1777a = m1VarArr;
    }

    /* renamed from: a */
    public final boolean mo13625a(Class<?> cls) {
        C1476m1[] m1VarArr = this.f1777a;
        for (int i = 0; i < 2; i++) {
            if (m1VarArr[i].mo13625a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C1471l1 mo13626b(Class<?> cls) {
        C1476m1[] m1VarArr = this.f1777a;
        for (int i = 0; i < 2; i++) {
            C1476m1 m1Var = m1VarArr[i];
            if (m1Var.mo13625a(cls)) {
                return m1Var.mo13626b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
