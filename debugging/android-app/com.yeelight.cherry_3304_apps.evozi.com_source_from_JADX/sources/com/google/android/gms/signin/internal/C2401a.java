package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C1379b;
import com.google.android.gms.common.C1533g;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.internal.C1550d;
import com.google.android.gms.common.internal.C1564e;
import com.google.android.gms.common.internal.C1572h;
import com.google.android.gms.common.internal.C1584m;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import p011c.p012a.p019b.p028b.p037d.C0603a;
import p011c.p012a.p019b.p028b.p037d.C0607e;

@KeepForSdk
/* renamed from: com.google.android.gms.signin.internal.a */
public class C2401a extends C1572h<C2406f> implements C0607e {

    /* renamed from: D */
    private final boolean f4811D;

    /* renamed from: E */
    private final C1564e f4812E;

    /* renamed from: F */
    private final Bundle f4813F;

    /* renamed from: G */
    private Integer f4814G;

    private C2401a(Context context, Looper looper, boolean z, C1564e eVar, Bundle bundle, C1399f.C1401b bVar, C1399f.C1402c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.f4811D = true;
        this.f4812E = eVar;
        this.f4813F = bundle;
        this.f4814G = eVar.mo11195d();
    }

    public C2401a(Context context, Looper looper, boolean z, C1564e eVar, C0603a aVar, C1399f.C1401b bVar, C1399f.C1402c cVar) {
        this(context, looper, true, eVar, m7807n0(eVar), bVar, cVar);
    }

    @KeepForSdk
    /* renamed from: n0 */
    public static Bundle m7807n0(C1564e eVar) {
        C0603a i = eVar.mo11200i();
        Integer d = eVar.mo11195d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.mo11192a());
        if (d != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", d.intValue());
        }
        if (i != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", i.mo8627g());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", i.mo8626f());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", i.mo8624d());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", i.mo8625e());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", i.mo8622b());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", i.mo8628h());
            if (i.mo8621a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", i.mo8621a().longValue());
            }
            if (i.mo8623c() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", i.mo8623c().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public Bundle mo11141B() {
        if (!mo11140A().getPackageName().equals(this.f4812E.mo11198g())) {
            this.f4813F.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f4812E.mo11198g());
        }
        return this.f4813F;
    }

    /* renamed from: a */
    public final void mo8630a(C1584m mVar, boolean z) {
        try {
            ((C2406f) mo11144E()).mo13170R(mVar, this.f4814G.intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    public final void connect() {
        mo11161h(new C1550d.C1554d());
    }

    /* renamed from: g */
    public final void mo8632g() {
        try {
            ((C2406f) mo11144E()).mo13172t(this.f4814G.intValue());
        } catch (RemoteException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo11164k() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public /* synthetic */ IInterface mo11165l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C2406f ? (C2406f) queryLocalInterface : new C2407g(iBinder);
    }

    /* renamed from: n */
    public int mo11167n() {
        return C1533g.f2900a;
    }

    /* renamed from: o */
    public final void mo8633o(C2404d dVar) {
        C1609u.m4476l(dVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f4812E.mo11193b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = C1379b.m3594a(mo11140A()).mo10742b();
            }
            ((C2406f) mo11144E()).mo13171Y(new zah(new ResolveAccountRequest(b, this.f4814G.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e) {
            try {
                dVar.mo10940r(new zaj(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: r */
    public boolean mo11170r() {
        return this.f4811D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo11172t() {
        return "com.google.android.gms.signin.service.START";
    }
}
