package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.internal.C0719b;
import com.google.android.gms.common.C0879d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.internal.C0897c;
import com.google.android.gms.common.internal.C0904d;
import com.google.android.gms.common.internal.C0907e;
import com.google.android.gms.common.internal.C0911g;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import p053k0.C3291f;
import p060l0.C3308c;

@KeepForSdk
/* renamed from: com.google.android.gms.signin.internal.a */
public class C1867a extends C0907e<C1869c> implements C3291f {

    /* renamed from: W */
    public static final /* synthetic */ int f2890W = 0;

    /* renamed from: S */
    private final boolean f2891S = true;

    /* renamed from: T */
    private final C0904d f2892T;

    /* renamed from: U */
    private final Bundle f2893U;
    @Nullable

    /* renamed from: V */
    private final Integer f2894V;

    public C1867a(@NonNull Context context, @NonNull Looper looper, boolean z, @NonNull C0904d dVar, @NonNull Bundle bundle, @NonNull C0736d.C0738b bVar, @NonNull C0736d.C0739c cVar) {
        super(context, looper, 44, dVar, bVar, cVar);
        this.f2892T = dVar;
        this.f2893U = bundle;
        this.f2894V = dVar.mo12250g();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: n0 */
    public static Bundle m4923n0(@NonNull C0904d dVar) {
        dVar.mo12249f();
        Integer g = dVar.mo12250g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.mo12244a());
        if (g != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: C */
    public final Bundle mo12194C() {
        if (!mo12192A().getPackageName().equals(this.f2892T.mo12247d())) {
            this.f2893U.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f2892T.mo12247d());
        }
        return this.f2893U;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: G */
    public final String mo12198G() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: H */
    public final String mo12199H() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: j */
    public final void mo14717j(C3308c cVar) {
        C0917i.m1420k(cVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f2892T.mo12245b();
            ((C1869c) mo12197F()).mo14724E0(new zai(1, new zat(b, ((Integer) C0917i.m1419j(this.f2894V)).intValue(), "<<default account>>".equals(b.name) ? C0719b.m605a(mo12192A()).mo11747b() : null)), cVar);
        } catch (RemoteException e) {
            try {
                cVar.mo12005v(new zak(1, new ConnectionResult(8, (PendingIntent) null), (zav) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: k */
    public final int mo12226k() {
        return C0879d.f886a;
    }

    /* renamed from: m */
    public final void mo14718m(@NonNull C0911g gVar, boolean z) {
        try {
            ((C1869c) mo12197F()).mo14723D0(gVar, ((Integer) C0917i.m1419j(this.f2894V)).intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: n */
    public final void mo14719n() {
        try {
            ((C1869c) mo12197F()).mo14725T(((Integer) C0917i.m1419j(this.f2894V)).intValue());
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: q */
    public final boolean mo12230q() {
        return this.f2891S;
    }

    /* renamed from: r */
    public final void mo14720r() {
        mo12220f(new C0897c.C0901d());
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: u */
    public final /* synthetic */ IInterface mo12233u(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C1869c ? (C1869c) queryLocalInterface : new C1869c(iBinder);
    }
}
