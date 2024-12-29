package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1507j;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
public final class C1449i0 implements C1472o0 {

    /* renamed from: a */
    private final C1475p0 f2703a;

    public C1449i0(C1475p0 p0Var) {
        this.f2703a = p0Var;
    }

    /* renamed from: a */
    public final void mo10957a(int i) {
    }

    /* renamed from: c */
    public final void mo10958c(Bundle bundle) {
    }

    public final void connect() {
        this.f2703a.mo11003j();
    }

    public final boolean disconnect() {
        return true;
    }

    /* renamed from: e */
    public final void mo10961e(ConnectionResult connectionResult, C1382a<?> aVar, boolean z) {
    }

    /* renamed from: f */
    public final <A extends C1382a.C1384b, T extends C1418c<? extends C1507j, A>> T mo10962f(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: g */
    public final <A extends C1382a.C1384b, R extends C1507j, T extends C1418c<R, A>> T mo10963g(T t) {
        this.f2703a.f2797n.f2714i.add(t);
        return t;
    }

    /* renamed from: h */
    public final void mo10964h() {
        for (C1382a.C1390f disconnect : this.f2703a.f2789f.values()) {
            disconnect.disconnect();
        }
        this.f2703a.f2797n.f2722q = Collections.emptySet();
    }
}
