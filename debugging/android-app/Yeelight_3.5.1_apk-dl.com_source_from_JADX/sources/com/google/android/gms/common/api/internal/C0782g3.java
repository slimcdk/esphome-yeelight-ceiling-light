package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.common.api.internal.g3 */
public final class C0782g3 implements C0736d.C0738b, C0736d.C0739c {

    /* renamed from: a */
    public final C0722a f639a;

    /* renamed from: b */
    private final boolean f640b;
    @Nullable

    /* renamed from: c */
    private C0787h3 f641c;

    public C0782g3(C0722a aVar, boolean z) {
        this.f639a = aVar;
        this.f640b = z;
    }

    /* renamed from: b */
    private final C0787h3 m835b() {
        C0917i.m1420k(this.f641c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f641c;
    }

    /* renamed from: a */
    public final void mo11971a(C0787h3 h3Var) {
        this.f641c = h3Var;
    }

    /* renamed from: c */
    public final void mo11948c(int i) {
        m835b().mo11948c(i);
    }

    /* renamed from: e */
    public final void mo11972e(@NonNull ConnectionResult connectionResult) {
        m835b().mo11989T(connectionResult, this.f639a, this.f640b);
    }

    /* renamed from: f */
    public final void mo11949f(@Nullable Bundle bundle) {
        m835b().mo11949f(bundle);
    }
}
