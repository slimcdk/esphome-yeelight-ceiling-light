package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.c1 */
final class C1426c1 extends C1431d1 {
    /* synthetic */ C1426c1(C1416a1 a1Var) {
        super((C1416a1) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13592a(Object obj, long j) {
        ((C1515u0) C1534y2.m3995s(obj, j)).mo13628D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <E> void mo13593b(Object obj, Object obj2, long j) {
        C1515u0 u0Var = (C1515u0) C1534y2.m3995s(obj, j);
        C1515u0 u0Var2 = (C1515u0) C1534y2.m3995s(obj2, j);
        int size = u0Var.size();
        int size2 = u0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!u0Var.zza()) {
                u0Var = u0Var.mo13609h(size2 + size);
            }
            u0Var.addAll(u0Var2);
        }
        if (size > 0) {
            u0Var2 = u0Var;
        }
        C1534y2.m3996t(obj, j, u0Var2);
    }
}
