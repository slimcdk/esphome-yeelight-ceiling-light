package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.tasks.C1872a;

/* renamed from: com.google.android.gms.common.api.internal.u2 */
public final class C0850u2 extends C0818n2 {

    /* renamed from: c */
    public final C0793j.C0794a f806c;

    public C0850u2(C0793j.C0794a aVar, C1872a aVar2) {
        super(4, aVar2);
        this.f806c = aVar;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12071d(@NonNull C0859x xVar, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo12060f(C0785h1 h1Var) {
        C0865y1 y1Var = (C0865y1) h1Var.mo11995x().get(this.f806c);
        return y1Var != null && y1Var.f853a.mo12034f();
    }

    @Nullable
    /* renamed from: g */
    public final Feature[] mo12061g(C0785h1 h1Var) {
        C0865y1 y1Var = (C0865y1) h1Var.mo11995x().get(this.f806c);
        if (y1Var == null) {
            return null;
        }
        return y1Var.f853a.mo12032c();
    }

    /* renamed from: h */
    public final void mo12038h(C0785h1 h1Var) {
        C0865y1 y1Var = (C0865y1) h1Var.mo11995x().remove(this.f806c);
        if (y1Var != null) {
            y1Var.f854b.mo11908b(h1Var.mo11994v(), this.f712b);
            y1Var.f853a.mo12030a();
            return;
        }
        this.f712b.mo14740e(Boolean.FALSE);
    }
}
