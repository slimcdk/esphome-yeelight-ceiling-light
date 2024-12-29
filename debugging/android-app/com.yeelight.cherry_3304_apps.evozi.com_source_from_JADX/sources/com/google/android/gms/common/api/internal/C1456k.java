package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1382a.C1384b;
import com.google.android.gms.common.api.internal.C1445i;
import p011c.p012a.p019b.p028b.p038e.C0620i;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.k */
public abstract class C1456k<A extends C1382a.C1384b, L> {

    /* renamed from: a */
    private final C1445i<L> f2744a;

    /* renamed from: b */
    private final Feature[] f2745b = null;

    /* renamed from: c */
    private final boolean f2746c = false;

    @KeepForSdk
    protected C1456k(C1445i<L> iVar) {
        this.f2744a = iVar;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo10976a() {
        this.f2744a.mo10948a();
    }

    @KeepForSdk
    /* renamed from: b */
    public C1445i.C1446a<L> mo10977b() {
        return this.f2744a.mo10949b();
    }

    @KeepForSdk
    @Nullable
    /* renamed from: c */
    public Feature[] mo10978c() {
        return this.f2745b;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: d */
    public abstract void mo10979d(A a, C0620i<Void> iVar);

    /* renamed from: e */
    public final boolean mo10980e() {
        return this.f2746c;
    }
}
