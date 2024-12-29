package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m5 */
final class C1896m5 implements C2015u5 {

    /* renamed from: a */
    private C2015u5[] f3581a;

    C1896m5(C2015u5... u5VarArr) {
        this.f3581a = u5VarArr;
    }

    /* renamed from: a */
    public final boolean mo11863a(Class<?> cls) {
        for (C2015u5 a : this.f3581a) {
            if (a.mo11863a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C2032v5 mo11864b(Class<?> cls) {
        for (C2015u5 u5Var : this.f3581a) {
            if (u5Var.mo11863a(cls)) {
                return u5Var.mo11864b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
