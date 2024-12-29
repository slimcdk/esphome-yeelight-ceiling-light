package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x8 */
final class C1378x8 extends C1408z8 {
    /* synthetic */ C1378x8(C1363w8 w8Var) {
        super((C1393y8) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13432a(Object obj, long j) {
        ((C1254p8) C1380xa.m3267k(obj, j)).mo13071D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13433b(Object obj, Object obj2, long j) {
        C1254p8 p8Var = (C1254p8) C1380xa.m3267k(obj, j);
        C1254p8 p8Var2 = (C1254p8) C1380xa.m3267k(obj2, j);
        int size = p8Var.size();
        int size2 = p8Var2.size();
        if (size > 0 && size2 > 0) {
            if (!p8Var.mo13072E()) {
                p8Var = p8Var.mo12539s(size2 + size);
            }
            p8Var.addAll(p8Var2);
        }
        if (size > 0) {
            p8Var2 = p8Var;
        }
        C1380xa.m3280x(obj, j, p8Var2);
    }
}
