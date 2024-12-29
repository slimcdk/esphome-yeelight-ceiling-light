package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.internal.C1426e;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.android.gms.common.api.internal.w1 */
public final class C1497w1 extends C1491u1<Void> {

    /* renamed from: b */
    private final C1456k<C1382a.C1384b, ?> f2827b;

    /* renamed from: c */
    private final C1468n<C1382a.C1384b, ?> f2828c;

    public C1497w1(C1439g1 g1Var, C0620i<Void> iVar) {
        super(3, iVar);
        this.f2827b = g1Var.f2693a;
        this.f2828c = g1Var.f2694b;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10988d(@NonNull C1474p pVar, boolean z) {
    }

    @Nullable
    /* renamed from: g */
    public final Feature[] mo10946g(C1426e.C1427a<?> aVar) {
        return this.f2827b.mo10978c();
    }

    /* renamed from: h */
    public final boolean mo10947h(C1426e.C1427a<?> aVar) {
        return this.f2827b.mo10980e();
    }

    /* renamed from: i */
    public final void mo11018i(C1426e.C1427a<?> aVar) {
        this.f2827b.mo10979d(aVar.mo10929p(), this.f2820a);
        if (this.f2827b.mo10977b() != null) {
            aVar.mo10932y().put(this.f2827b.mo10977b(), new C1439g1(this.f2827b, this.f2828c));
        }
    }
}
