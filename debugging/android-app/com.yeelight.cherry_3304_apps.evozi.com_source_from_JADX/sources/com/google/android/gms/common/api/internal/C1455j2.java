package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1382a.C1386d;
import com.google.android.gms.common.api.C1396e;
import com.google.android.gms.common.api.internal.C1426e;
import com.google.android.gms.common.internal.C1564e;
import p011c.p012a.p019b.p028b.p037d.C0603a;
import p011c.p012a.p019b.p028b.p037d.C0607e;

/* renamed from: com.google.android.gms.common.api.internal.j2 */
public final class C1455j2<O extends C1382a.C1386d> extends C1396e<O> {

    /* renamed from: i */
    private final C1382a.C1390f f2740i;

    /* renamed from: j */
    private final C1425d2 f2741j;

    /* renamed from: k */
    private final C1564e f2742k;

    /* renamed from: l */
    private final C1382a.C1383a<? extends C0607e, C0603a> f2743l;

    public C1455j2(@NonNull Context context, C1382a<O> aVar, Looper looper, @NonNull C1382a.C1390f fVar, @NonNull C1425d2 d2Var, C1564e eVar, C1382a.C1383a<? extends C0607e, C0603a> aVar2) {
        super(context, aVar, looper);
        this.f2740i = fVar;
        this.f2741j = d2Var;
        this.f2742k = eVar;
        this.f2743l = aVar2;
        this.f2564h.mo10910g(this);
    }

    /* renamed from: j */
    public final C1382a.C1390f mo10821j(Looper looper, C1426e.C1427a<O> aVar) {
        this.f2741j.mo10904b(aVar);
        return this.f2740i;
    }

    /* renamed from: l */
    public final C1454j1 mo10822l(Context context, Handler handler) {
        return new C1454j1(context, handler, this.f2742k, this.f2743l);
    }

    /* renamed from: n */
    public final C1382a.C1390f mo10975n() {
        return this.f2740i;
    }
}
