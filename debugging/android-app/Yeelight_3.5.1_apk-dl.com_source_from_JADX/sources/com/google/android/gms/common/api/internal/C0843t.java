package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0722a.C0724b;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.tasks.C1872a;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.t */
public abstract class C0843t<A extends C0722a.C0724b, L> {

    /* renamed from: a */
    private final C0793j.C0794a f778a;

    @KeepForSdk
    protected C0843t(@NonNull C0793j.C0794a<L> aVar) {
        this.f778a = aVar;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public C0793j.C0794a<L> mo12081a() {
        return this.f778a;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public abstract void mo11908b(@NonNull A a, @NonNull C1872a<Boolean> aVar);
}
