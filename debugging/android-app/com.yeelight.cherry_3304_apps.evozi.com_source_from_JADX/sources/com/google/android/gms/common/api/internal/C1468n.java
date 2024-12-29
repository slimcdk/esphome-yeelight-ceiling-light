package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1382a.C1384b;
import com.google.android.gms.common.api.internal.C1445i;
import p011c.p012a.p019b.p028b.p038e.C0620i;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.n */
public abstract class C1468n<A extends C1382a.C1384b, L> {

    /* renamed from: a */
    private final C1445i.C1446a<L> f2771a;

    @KeepForSdk
    protected C1468n(C1445i.C1446a<L> aVar) {
        this.f2771a = aVar;
    }

    @KeepForSdk
    /* renamed from: a */
    public C1445i.C1446a<L> mo10992a() {
        return this.f2771a;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public abstract void mo10993b(A a, C0620i<Boolean> iVar);
}
