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
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.internal.C0904d;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import p053k0.C3290e;
import p053k0.C3291f;
import p060l0.C3306a;

/* renamed from: com.google.android.gms.common.api.internal.i2 */
public final class C0791i2 extends C3306a implements C0736d.C0738b, C0736d.C0739c {

    /* renamed from: h */
    private static final C0722a.C0723a f659h = C3290e.f5312c;

    /* renamed from: a */
    private final Context f660a;

    /* renamed from: b */
    private final Handler f661b;

    /* renamed from: c */
    private final C0722a.C0723a f662c;

    /* renamed from: d */
    private final Set f663d;

    /* renamed from: e */
    private final C0904d f664e;

    /* renamed from: f */
    private C3291f f665f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C0786h2 f666g;

    @WorkerThread
    public C0791i2(Context context, Handler handler, @NonNull C0904d dVar) {
        C0722a.C0723a aVar = f659h;
        this.f660a = context;
        this.f661b = handler;
        this.f664e = (C0904d) C0917i.m1420k(dVar, "ClientSettings must not be null");
        this.f663d = dVar.mo12248e();
        this.f662c = aVar;
    }

    /* renamed from: F0 */
    static /* bridge */ /* synthetic */ void m896F0(C0791i2 i2Var, zak zak) {
        ConnectionResult V = zak.mo14733V();
        if (V.mo11756f0()) {
            zav zav = (zav) C0917i.m1419j(zak.mo14734W());
            V = zav.mo12335V();
            if (!V.mo11756f0()) {
                String valueOf = String.valueOf(V);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            } else {
                i2Var.f666g.mo11997c(zav.mo12336W(), i2Var.f663d);
                i2Var.f665f.disconnect();
            }
        }
        i2Var.f666g.mo11996b(V);
        i2Var.f665f.disconnect();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, k0.f] */
    @WorkerThread
    /* renamed from: G0 */
    public final void mo12003G0(C0786h2 h2Var) {
        C3291f fVar = this.f665f;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.f664e.mo12253j(Integer.valueOf(System.identityHashCode(this)));
        C0722a.C0723a aVar = this.f662c;
        Context context = this.f660a;
        Looper looper = this.f661b.getLooper();
        C0904d dVar = this.f664e;
        this.f665f = aVar.mo11823c(context, looper, dVar, dVar.mo12249f(), this, this);
        this.f666g = h2Var;
        Set set = this.f663d;
        if (set == null || set.isEmpty()) {
            this.f661b.post(new C0776f2(this));
        } else {
            this.f665f.mo14720r();
        }
    }

    /* renamed from: H0 */
    public final void mo12004H0() {
        C3291f fVar = this.f665f;
        if (fVar != null) {
            fVar.disconnect();
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo11948c(int i) {
        this.f665f.disconnect();
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo11972e(@NonNull ConnectionResult connectionResult) {
        this.f666g.mo11996b(connectionResult);
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo11949f(@Nullable Bundle bundle) {
        this.f665f.mo14717j(this);
    }

    @BinderThread
    /* renamed from: v */
    public final void mo12005v(zak zak) {
        this.f661b.post(new C0781g2(this, zak));
    }
}
