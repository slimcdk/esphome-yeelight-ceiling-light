package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0722a.C0724b;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.tasks.C1872a;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.n */
public abstract class C0815n<A extends C0722a.C0724b, L> {

    /* renamed from: a */
    private final C0793j f707a;
    @Nullable

    /* renamed from: b */
    private final Feature[] f708b;

    /* renamed from: c */
    private final boolean f709c;

    /* renamed from: d */
    private final int f710d;

    @KeepForSdk
    protected C0815n(@NonNull C0793j<L> jVar, @Nullable Feature[] featureArr, boolean z, int i) {
        this.f707a = jVar;
        this.f708b = featureArr;
        this.f709c = z;
        this.f710d = i;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo12030a() {
        this.f707a.mo12006a();
    }

    @KeepForSdk
    @Nullable
    /* renamed from: b */
    public C0793j.C0794a<L> mo12031b() {
        return this.f707a.mo12007b();
    }

    @KeepForSdk
    @Nullable
    /* renamed from: c */
    public Feature[] mo12032c() {
        return this.f708b;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: d */
    public abstract void mo11901d(@NonNull A a, @NonNull C1872a<Void> aVar);

    /* renamed from: e */
    public final int mo12033e() {
        return this.f710d;
    }

    /* renamed from: f */
    public final boolean mo12034f() {
        return this.f709c;
    }
}
