package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0722a;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
public final class C0835r0 implements C0856w0 {
    @NotOnlyInitialized

    /* renamed from: a */
    private final C0868z0 f765a;

    public C0835r0(C0868z0 z0Var) {
        this.f765a = z0Var;
    }

    /* renamed from: a */
    public final void mo11935a(@Nullable Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo11936b() {
        this.f765a.mo12103m();
    }

    /* renamed from: c */
    public final void mo11937c(ConnectionResult connectionResult, C0722a aVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo11938d(int i) {
    }

    /* renamed from: e */
    public final void mo11939e() {
        for (C0722a.C0730f disconnect : this.f765a.f868f.values()) {
            disconnect.disconnect();
        }
        this.f765a.f875m.f823p = Collections.emptySet();
    }

    /* renamed from: f */
    public final C0763d mo11940f(C0763d dVar) {
        this.f765a.f875m.f815h.add(dVar);
        return dVar;
    }

    /* renamed from: g */
    public final boolean mo11941g() {
        return true;
    }

    /* renamed from: h */
    public final C0763d mo11942h(C0763d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
