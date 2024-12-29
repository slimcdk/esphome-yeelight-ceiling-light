package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.tasks.C1872a;

/* renamed from: com.google.android.gms.common.api.internal.s2 */
public final class C0842s2 extends C0818n2 {

    /* renamed from: c */
    public final C0865y1 f777c;

    public C0842s2(C0865y1 y1Var, C1872a aVar) {
        super(3, aVar);
        this.f777c = y1Var;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12071d(@NonNull C0859x xVar, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo12060f(C0785h1 h1Var) {
        return this.f777c.f853a.mo12034f();
    }

    @Nullable
    /* renamed from: g */
    public final Feature[] mo12061g(C0785h1 h1Var) {
        return this.f777c.f853a.mo12032c();
    }

    /* renamed from: h */
    public final void mo12038h(C0785h1 h1Var) {
        this.f777c.f853a.mo11901d(h1Var.mo11994v(), this.f712b);
        C0793j.C0794a b = this.f777c.f853a.mo12031b();
        if (b != null) {
            h1Var.mo11995x().put(b, this.f777c);
        }
    }
}
