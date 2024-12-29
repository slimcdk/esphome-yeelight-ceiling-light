package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0736d;

/* renamed from: com.google.android.gms.common.api.internal.w2 */
final class C0858w2 implements C0736d.C0739c {

    /* renamed from: a */
    public final int f839a;

    /* renamed from: b */
    public final C0736d f840b;
    @Nullable

    /* renamed from: c */
    public final C0736d.C0739c f841c;

    /* renamed from: d */
    final /* synthetic */ C0862x2 f842d;

    public C0858w2(C0862x2 x2Var, int i, @Nullable C0736d dVar, C0736d.C0739c cVar) {
        this.f842d = x2Var;
        this.f839a = i;
        this.f840b = dVar;
        this.f841c = cVar;
    }

    /* renamed from: e */
    public final void mo11972e(@NonNull ConnectionResult connectionResult) {
        "beginFailureResolution for ".concat(String.valueOf(connectionResult));
        this.f842d.mo11927s(connectionResult, this.f839a);
    }
}
