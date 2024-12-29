package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C1426e;
import com.google.android.gms.common.api.internal.C1445i;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.android.gms.common.api.internal.x1 */
public final class C1500x1 extends C1491u1<Boolean> {

    /* renamed from: b */
    private final C1445i.C1446a<?> f2851b;

    public C1500x1(C1445i.C1446a<?> aVar, C0620i<Boolean> iVar) {
        super(4, iVar);
        this.f2851b = aVar;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10988d(@NonNull C1474p pVar, boolean z) {
    }

    @Nullable
    /* renamed from: g */
    public final Feature[] mo10946g(C1426e.C1427a<?> aVar) {
        C1439g1 g1Var = aVar.mo10932y().get(this.f2851b);
        if (g1Var == null) {
            return null;
        }
        return g1Var.f2693a.mo10978c();
    }

    /* renamed from: h */
    public final boolean mo10947h(C1426e.C1427a<?> aVar) {
        C1439g1 g1Var = aVar.mo10932y().get(this.f2851b);
        return g1Var != null && g1Var.f2693a.mo10980e();
    }

    /* renamed from: i */
    public final void mo11018i(C1426e.C1427a<?> aVar) {
        C1439g1 remove = aVar.mo10932y().remove(this.f2851b);
        if (remove != null) {
            remove.f2694b.mo10993b(aVar.mo10929p(), this.f2820a);
            remove.f2693a.mo10976a();
            return;
        }
        this.f2820a.mo8670e(Boolean.FALSE);
    }
}
