package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.C0722a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
final class C0796j0 extends C0827p0 {

    /* renamed from: b */
    private final ArrayList f672b;

    /* renamed from: c */
    final /* synthetic */ C0831q0 f673c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0796j0(C0831q0 q0Var, ArrayList arrayList) {
        super(q0Var, (C0822o0) null);
        this.f673c = q0Var;
        this.f672b = arrayList;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo12002b() {
        C0831q0 q0Var = this.f673c;
        q0Var.f741a.f875m.f823p = C0831q0.m1025y(q0Var);
        ArrayList arrayList = this.f672b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0831q0 q0Var2 = this.f673c;
            ((C0722a.C0730f) arrayList.get(i)).mo11831c(q0Var2.f755o, q0Var2.f741a.f875m.f823p);
        }
    }
}
