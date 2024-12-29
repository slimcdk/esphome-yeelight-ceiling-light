package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0877b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.internal.C0904d;
import com.google.android.gms.common.internal.C0911g;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p053k0.C3291f;
import p109w.C3854n;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
public final class C0831q0 implements C0856w0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0868z0 f741a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f742b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f743c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0877b f744d;
    @Nullable

    /* renamed from: e */
    private ConnectionResult f745e;

    /* renamed from: f */
    private int f746f;

    /* renamed from: g */
    private int f747g = 0;

    /* renamed from: h */
    private int f748h;

    /* renamed from: i */
    private final Bundle f749i = new Bundle();

    /* renamed from: j */
    private final Set f750j = new HashSet();
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: k */
    public C3291f f751k;

    /* renamed from: l */
    private boolean f752l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f753m;

    /* renamed from: n */
    private boolean f754n;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: o */
    public C0911g f755o;

    /* renamed from: p */
    private boolean f756p;

    /* renamed from: q */
    private boolean f757q;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: r */
    public final C0904d f758r;

    /* renamed from: s */
    private final Map f759s;
    @Nullable

    /* renamed from: t */
    private final C0722a.C0723a f760t;

    /* renamed from: u */
    private final ArrayList f761u = new ArrayList();

    public C0831q0(C0868z0 z0Var, @Nullable C0904d dVar, Map map, C0877b bVar, @Nullable C0722a.C0723a aVar, Lock lock, Context context) {
        this.f741a = z0Var;
        this.f758r = dVar;
        this.f759s = map;
        this.f744d = bVar;
        this.f760t = aVar;
        this.f742b = lock;
        this.f743c = context;
    }

    /* renamed from: B */
    static /* bridge */ /* synthetic */ void m1000B(C0831q0 q0Var, zak zak) {
        if (q0Var.m1015o(0)) {
            ConnectionResult V = zak.mo14733V();
            if (V.mo11756f0()) {
                zav zav = (zav) C0917i.m1419j(zak.mo14734W());
                ConnectionResult V2 = zav.mo12335V();
                if (!V2.mo11756f0()) {
                    String valueOf = String.valueOf(V2);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    q0Var.m1012l(V2);
                    return;
                }
                q0Var.f754n = true;
                q0Var.f755o = (C0911g) C0917i.m1419j(zav.mo12336W());
                q0Var.f756p = zav.mo12337c0();
                q0Var.f757q = zav.mo12338d0();
                q0Var.m1014n();
            } else if (q0Var.m1017q(V)) {
                q0Var.m1009i();
                q0Var.m1014n();
            } else {
                q0Var.m1012l(V);
            }
        }
    }

    /* renamed from: J */
    private final void m1008J() {
        ArrayList arrayList = this.f761u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.f761u.clear();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: i */
    public final void m1009i() {
        this.f753m = false;
        this.f741a.f875m.f823p = Collections.emptySet();
        for (C0722a.C0725c cVar : this.f750j) {
            if (!this.f741a.f869g.containsKey(cVar)) {
                this.f741a.f869g.put(cVar, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: j */
    private final void m1010j(boolean z) {
        C3291f fVar = this.f751k;
        if (fVar != null) {
            if (fVar.isConnected() && z) {
                fVar.mo14719n();
            }
            fVar.disconnect();
            C0904d dVar = (C0904d) C0917i.m1419j(this.f758r);
            this.f755o = null;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: k */
    private final void m1011k() {
        this.f741a.mo12102l();
        C0749a1.m745a().execute(new C0769e0(this));
        C3291f fVar = this.f751k;
        if (fVar != null) {
            if (this.f756p) {
                fVar.mo14718m((C0911g) C0917i.m1419j(this.f755o), this.f757q);
            }
            m1010j(false);
        }
        for (C0722a.C0725c cVar : this.f741a.f869g.keySet()) {
            ((C0722a.C0730f) C0917i.m1419j((C0722a.C0730f) this.f741a.f868f.get(cVar))).disconnect();
        }
        this.f741a.f876n.mo12018a(this.f749i.isEmpty() ? null : this.f749i);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: l */
    public final void m1012l(ConnectionResult connectionResult) {
        m1008J();
        m1010j(!connectionResult.mo11754d0());
        this.f741a.mo12104n(connectionResult);
        this.f741a.f876n.mo12020c(connectionResult);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: m */
    public final void m1013m(ConnectionResult connectionResult, C0722a aVar, boolean z) {
        int b = aVar.mo11821c().mo11828b();
        if ((!z || connectionResult.mo11754d0() || this.f744d.mo12120c(connectionResult.mo11751V()) != null) && (this.f745e == null || b < this.f746f)) {
            this.f745e = connectionResult;
            this.f746f = b;
        }
        this.f741a.f869g.put(aVar.mo11820b(), connectionResult);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: n */
    public final void m1014n() {
        if (this.f748h == 0) {
            if (!this.f753m || this.f754n) {
                ArrayList arrayList = new ArrayList();
                this.f747g = 1;
                this.f748h = this.f741a.f868f.size();
                for (C0722a.C0725c cVar : this.f741a.f868f.keySet()) {
                    if (!this.f741a.f869g.containsKey(cVar)) {
                        arrayList.add((C0722a.C0730f) this.f741a.f868f.get(cVar));
                    } else if (m1016p()) {
                        m1011k();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f761u.add(C0749a1.m745a().submit(new C0796j0(this, arrayList)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: o */
    public final boolean m1015o(int i) {
        if (this.f747g == i) {
            return true;
        }
        this.f741a.f875m.mo12084p();
        "Unexpected callback in ".concat(toString());
        int i2 = this.f748h;
        StringBuilder sb = new StringBuilder();
        sb.append("mRemainingConnections=");
        sb.append(i2);
        int i3 = this.f747g;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(m1018r(i3));
        sb2.append(" but received callback for step ");
        sb2.append(m1018r(i));
        new Exception();
        m1012l(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: p */
    public final boolean m1016p() {
        ConnectionResult connectionResult;
        int i = this.f748h - 1;
        this.f748h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.f741a.f875m.mo12084p();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            connectionResult = new ConnectionResult(8, (PendingIntent) null);
        } else {
            connectionResult = this.f745e;
            if (connectionResult == null) {
                return true;
            }
            this.f741a.f874l = this.f746f;
        }
        m1012l(connectionResult);
        return false;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: q */
    public final boolean m1017q(ConnectionResult connectionResult) {
        return this.f752l && !connectionResult.mo11754d0();
    }

    /* renamed from: r */
    private static final String m1018r(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ Set m1025y(C0831q0 q0Var) {
        C0904d dVar = q0Var.f758r;
        if (dVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(dVar.mo12248e());
        Map i = q0Var.f758r.mo12252i();
        for (C0722a aVar : i.keySet()) {
            if (!q0Var.f741a.f869g.containsKey(aVar.mo11820b())) {
                hashSet.addAll(((C3854n) i.get(aVar)).f6469a);
            }
        }
        return hashSet;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo11935a(@Nullable Bundle bundle) {
        if (m1015o(1)) {
            if (bundle != null) {
                this.f749i.putAll(bundle);
            }
            if (m1016p()) {
                m1011k();
            }
        }
    }

    /* renamed from: b */
    public final void mo11936b() {
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo11937c(ConnectionResult connectionResult, C0722a aVar, boolean z) {
        if (m1015o(1)) {
            m1013m(connectionResult, aVar, z);
            if (m1016p()) {
                m1011k();
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: d */
    public final void mo11938d(int i) {
        m1012l(new ConnectionResult(8, (PendingIntent) null));
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.google.android.gms.common.api.a$f, k0.f] */
    @GuardedBy("mLock")
    /* renamed from: e */
    public final void mo11939e() {
        this.f741a.f869g.clear();
        this.f753m = false;
        this.f745e = null;
        this.f747g = 0;
        this.f752l = true;
        this.f754n = false;
        this.f756p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C0722a aVar : this.f759s.keySet()) {
            C0722a.C0730f fVar = (C0722a.C0730f) C0917i.m1419j((C0722a.C0730f) this.f741a.f868f.get(aVar.mo11820b()));
            z |= aVar.mo11821c().mo11828b() == 1;
            boolean booleanValue = ((Boolean) this.f759s.get(aVar)).booleanValue();
            if (fVar.mo11845q()) {
                this.f753m = true;
                if (booleanValue) {
                    this.f750j.add(aVar.mo11820b());
                } else {
                    this.f752l = false;
                }
            }
            hashMap.put(fVar, new C0774f0(this, aVar, booleanValue));
        }
        if (z) {
            this.f753m = false;
        }
        if (this.f753m) {
            C0917i.m1419j(this.f758r);
            C0917i.m1419j(this.f760t);
            this.f758r.mo12253j(Integer.valueOf(System.identityHashCode(this.f741a.f875m)));
            C0816n0 n0Var = new C0816n0(this, (C0811m0) null);
            C0722a.C0723a aVar2 = this.f760t;
            Context context = this.f743c;
            Looper i = this.f741a.f875m.mo11865i();
            C0904d dVar = this.f758r;
            this.f751k = aVar2.mo11823c(context, i, dVar, dVar.mo12249f(), n0Var, n0Var);
        }
        this.f748h = this.f741a.f868f.size();
        this.f761u.add(C0749a1.m745a().submit(new C0789i0(this, hashMap)));
    }

    /* renamed from: f */
    public final C0763d mo11940f(C0763d dVar) {
        this.f741a.f875m.f815h.add(dVar);
        return dVar;
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    public final boolean mo11941g() {
        m1008J();
        m1010j(true);
        this.f741a.mo12104n((ConnectionResult) null);
        return true;
    }

    /* renamed from: h */
    public final C0763d mo11942h(C0763d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
