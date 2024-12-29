package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d9 */
final class C1063d9 implements C1159j9 {

    /* renamed from: a */
    private final C1159j9[] f1288a;

    C1063d9(C1159j9... j9VarArr) {
        this.f1288a = j9VarArr;
    }

    /* renamed from: a */
    public final C1143i9 mo12583a(Class cls) {
        C1159j9[] j9VarArr = this.f1288a;
        for (int i = 0; i < 2; i++) {
            C1159j9 j9Var = j9VarArr[i];
            if (j9Var.mo12584b(cls)) {
                return j9Var.mo12583a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: b */
    public final boolean mo12584b(Class cls) {
        C1159j9[] j9VarArr = this.f1288a;
        for (int i = 0; i < 2; i++) {
            if (j9VarArr[i].mo12584b(cls)) {
                return true;
            }
        }
        return false;
    }
}
