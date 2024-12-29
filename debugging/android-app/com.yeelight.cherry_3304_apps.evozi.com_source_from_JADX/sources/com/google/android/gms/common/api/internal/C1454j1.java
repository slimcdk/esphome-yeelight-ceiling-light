package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1564e;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.C2403c;
import com.google.android.gms.signin.internal.zaj;
import java.util.Set;
import p011c.p012a.p019b.p028b.p037d.C0603a;
import p011c.p012a.p019b.p028b.p037d.C0604b;
import p011c.p012a.p019b.p028b.p037d.C0607e;

/* renamed from: com.google.android.gms.common.api.internal.j1 */
public final class C1454j1 extends C2403c implements C1399f.C1401b, C1399f.C1402c {

    /* renamed from: h */
    private static C1382a.C1383a<? extends C0607e, C0603a> f2732h = C0604b.f297c;

    /* renamed from: a */
    private final Context f2733a;

    /* renamed from: b */
    private final Handler f2734b;

    /* renamed from: c */
    private final C1382a.C1383a<? extends C0607e, C0603a> f2735c;

    /* renamed from: d */
    private Set<Scope> f2736d;

    /* renamed from: e */
    private C1564e f2737e;

    /* renamed from: f */
    private C0607e f2738f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1466m1 f2739g;

    @WorkerThread
    public C1454j1(Context context, Handler handler, @NonNull C1564e eVar) {
        this(context, handler, eVar, f2732h);
    }

    @WorkerThread
    public C1454j1(Context context, Handler handler, @NonNull C1564e eVar, C1382a.C1383a<? extends C0607e, C0603a> aVar) {
        this.f2733a = context;
        this.f2734b = handler;
        C1609u.m4476l(eVar, "ClientSettings must not be null");
        this.f2737e = eVar;
        this.f2736d = eVar.mo11199h();
        this.f2735c = aVar;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: U0 */
    public final void m3907U0(zaj zaj) {
        ConnectionResult Q = zaj.mo13179Q();
        if (Q.mo10749V()) {
            ResolveAccountResponse R = zaj.mo13180R();
            Q = R.mo11127R();
            if (!Q.mo10749V()) {
                String valueOf = String.valueOf(Q);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                this.f2739g.mo10938b(R.mo11126Q(), this.f2736d);
                this.f2738f.disconnect();
            }
        }
        this.f2739g.mo10939c(Q);
        this.f2738f.disconnect();
    }

    @WorkerThread
    /* renamed from: R0 */
    public final void mo10972R0(C1466m1 m1Var) {
        C0607e eVar = this.f2738f;
        if (eVar != null) {
            eVar.disconnect();
        }
        this.f2737e.mo11202k(Integer.valueOf(System.identityHashCode(this)));
        C1382a.C1383a<? extends C0607e, C0603a> aVar = this.f2735c;
        Context context = this.f2733a;
        Looper looper = this.f2734b.getLooper();
        C1564e eVar2 = this.f2737e;
        this.f2738f = (C0607e) aVar.mo8629c(context, looper, eVar2, eVar2.mo11200i(), this, this);
        this.f2739g = m1Var;
        Set<Scope> set = this.f2736d;
        if (set == null || set.isEmpty()) {
            this.f2734b.post(new C1458k1(this));
        } else {
            this.f2738f.connect();
        }
    }

    /* renamed from: S0 */
    public final C0607e mo10973S0() {
        return this.f2738f;
    }

    /* renamed from: T0 */
    public final void mo10974T0() {
        C0607e eVar = this.f2738f;
        if (eVar != null) {
            eVar.disconnect();
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo10836a(int i) {
        this.f2738f.disconnect();
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo10837c(@Nullable Bundle bundle) {
        this.f2738f.mo8633o(this);
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo10838f(@NonNull ConnectionResult connectionResult) {
        this.f2739g.mo10939c(connectionResult);
    }

    @BinderThread
    /* renamed from: r */
    public final void mo10940r(zaj zaj) {
        this.f2734b.post(new C1462l1(this, zaj));
    }
}
