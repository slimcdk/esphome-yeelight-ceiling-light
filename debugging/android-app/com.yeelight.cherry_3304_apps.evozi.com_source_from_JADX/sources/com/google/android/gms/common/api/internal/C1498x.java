package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C1520d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1564e;
import com.google.android.gms.common.internal.C1584m;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zaj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p037d.C0603a;
import p011c.p012a.p019b.p028b.p037d.C0607e;

/* renamed from: com.google.android.gms.common.api.internal.x */
public final class C1498x implements C1472o0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1475p0 f2829a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f2830b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f2831c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1520d f2832d;

    /* renamed from: e */
    private ConnectionResult f2833e;

    /* renamed from: f */
    private int f2834f;

    /* renamed from: g */
    private int f2835g = 0;

    /* renamed from: h */
    private int f2836h;

    /* renamed from: i */
    private final Bundle f2837i = new Bundle();

    /* renamed from: j */
    private final Set<C1382a.C1385c> f2838j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C0607e f2839k;

    /* renamed from: l */
    private boolean f2840l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f2841m;

    /* renamed from: n */
    private boolean f2842n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C1584m f2843o;

    /* renamed from: p */
    private boolean f2844p;

    /* renamed from: q */
    private boolean f2845q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1564e f2846r;

    /* renamed from: s */
    private final Map<C1382a<?>, Boolean> f2847s;

    /* renamed from: t */
    private final C1382a.C1383a<? extends C0607e, C0603a> f2848t;

    /* renamed from: u */
    private ArrayList<Future<?>> f2849u = new ArrayList<>();

    public C1498x(C1475p0 p0Var, C1564e eVar, Map<C1382a<?>, Boolean> map, C1520d dVar, C1382a.C1383a<? extends C0607e, C0603a> aVar, Lock lock, Context context) {
        this.f2829a = p0Var;
        this.f2846r = eVar;
        this.f2847s = map;
        this.f2832d = dVar;
        this.f2848t = aVar;
        this.f2830b = lock;
        this.f2831c = context;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: A */
    public final boolean m4040A(ConnectionResult connectionResult) {
        return this.f2840l && !connectionResult.mo10748T();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: B */
    public final void m4041B(ConnectionResult connectionResult) {
        m4060q();
        m4064u(!connectionResult.mo10748T());
        this.f2829a.mo11006n(connectionResult);
        this.f2829a.f2798o.mo10941a(connectionResult);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: k */
    public final void m4054k(zaj zaj) {
        if (m4067x(0)) {
            ConnectionResult Q = zaj.mo13179Q();
            if (Q.mo10749V()) {
                ResolveAccountResponse R = zaj.mo13180R();
                ConnectionResult R2 = R.mo11127R();
                if (!R2.mo10749V()) {
                    String valueOf = String.valueOf(R2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    m4041B(R2);
                    return;
                }
                this.f2842n = true;
                this.f2843o = R.mo11126Q();
                this.f2844p = R.mo11128S();
                this.f2845q = R.mo11129T();
                m4057n();
            } else if (m4040A(Q)) {
                m4059p();
                m4057n();
            } else {
                m4041B(Q);
            }
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: m */
    public final boolean m4056m() {
        ConnectionResult connectionResult;
        int i = this.f2836h - 1;
        this.f2836h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.f2829a.f2797n.mo10971u();
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            connectionResult = new ConnectionResult(8, (PendingIntent) null);
        } else {
            connectionResult = this.f2833e;
            if (connectionResult == null) {
                return true;
            }
            this.f2829a.f2796m = this.f2834f;
        }
        m4041B(connectionResult);
        return false;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: n */
    public final void m4057n() {
        if (this.f2836h == 0) {
            if (!this.f2841m || this.f2842n) {
                ArrayList arrayList = new ArrayList();
                this.f2835g = 1;
                this.f2836h = this.f2829a.f2789f.size();
                for (C1382a.C1385c next : this.f2829a.f2789f.keySet()) {
                    if (!this.f2829a.f2790g.containsKey(next)) {
                        arrayList.add(this.f2829a.f2789f.get(next));
                    } else if (m4056m()) {
                        m4058o();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f2849u.add(C1484s0.m4010a().submit(new C1423d0(this, arrayList)));
                }
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: o */
    private final void m4058o() {
        this.f2829a.mo11005m();
        C1484s0.m4010a().execute(new C1501y(this));
        C0607e eVar = this.f2839k;
        if (eVar != null) {
            if (this.f2844p) {
                eVar.mo8630a(this.f2843o, this.f2845q);
            }
            m4064u(false);
        }
        for (C1382a.C1385c<?> cVar : this.f2829a.f2790g.keySet()) {
            this.f2829a.f2789f.get(cVar).disconnect();
        }
        this.f2829a.f2798o.mo10942b(this.f2837i.isEmpty() ? null : this.f2837i);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: p */
    public final void m4059p() {
        this.f2841m = false;
        this.f2829a.f2797n.f2722q = Collections.emptySet();
        for (C1382a.C1385c next : this.f2838j) {
            if (!this.f2829a.f2790g.containsKey(next)) {
                this.f2829a.f2790g.put(next, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    /* renamed from: q */
    private final void m4060q() {
        ArrayList<Future<?>> arrayList = this.f2849u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Future<?> future = arrayList.get(i);
            i++;
            future.cancel(true);
        }
        this.f2849u.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final Set<Scope> m4061r() {
        if (this.f2846r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f2846r.mo11199h());
        Map<C1382a<?>, C1564e.C1566b> e = this.f2846r.mo11196e();
        for (C1382a next : e.keySet()) {
            if (!this.f2829a.f2790g.containsKey(next.mo10782a())) {
                hashSet.addAll(e.get(next).f3034a);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if ((r5.mo10748T() || r4.f2832d.mo11057c(r5.mo10745Q()) != null) != false) goto L_0x0024;
     */
    @javax.annotation.concurrent.GuardedBy("mLock")
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m4063t(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.C1382a<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.a$e r0 = r6.mo10784c()
            int r0 = r0.mo10789b()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.mo10748T()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = 1
            goto L_0x0022
        L_0x0014:
            com.google.android.gms.common.d r7 = r4.f2832d
            int r3 = r5.mo10745Q()
            android.content.Intent r7 = r7.mo11057c(r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            com.google.android.gms.common.ConnectionResult r7 = r4.f2833e
            if (r7 == 0) goto L_0x002c
            int r7 = r4.f2834f
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.f2833e = r5
            r4.f2834f = r0
        L_0x0033:
            com.google.android.gms.common.api.internal.p0 r7 = r4.f2829a
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.f2790g
            com.google.android.gms.common.api.a$c r6 = r6.mo10782a()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C1498x.m4063t(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, boolean):void");
    }

    @GuardedBy("mLock")
    /* renamed from: u */
    private final void m4064u(boolean z) {
        C0607e eVar = this.f2839k;
        if (eVar != null) {
            if (eVar.isConnected() && z) {
                this.f2839k.mo8632g();
            }
            this.f2839k.disconnect();
            if (this.f2846r.mo11201j()) {
                this.f2839k = null;
            }
            this.f2843o = null;
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: x */
    public final boolean m4067x(int i) {
        if (this.f2835g == i) {
            return true;
        }
        this.f2829a.f2797n.mo10971u();
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        sb.toString();
        int i2 = this.f2836h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        sb2.toString();
        String z = m4069z(this.f2835g);
        String z2 = m4069z(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(z).length() + 70 + String.valueOf(z2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(z);
        sb3.append(" but received callback for step ");
        sb3.append(z2);
        Log.wtf("GoogleApiClientConnecting", sb3.toString(), new Exception());
        m4041B(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }

    /* renamed from: z */
    private static String m4069z(int i) {
        return i != 0 ? i != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10957a(int i) {
        m4041B(new ConnectionResult(8, (PendingIntent) null));
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo10958c(Bundle bundle) {
        if (m4067x(1)) {
            if (bundle != null) {
                this.f2837i.putAll(bundle);
            }
            if (m4056m()) {
                m4058o();
            }
        }
    }

    public final void connect() {
    }

    @GuardedBy("mLock")
    public final boolean disconnect() {
        m4060q();
        m4064u(true);
        this.f2829a.mo11006n((ConnectionResult) null);
        return true;
    }

    @GuardedBy("mLock")
    /* renamed from: e */
    public final void mo10961e(ConnectionResult connectionResult, C1382a<?> aVar, boolean z) {
        if (m4067x(1)) {
            m4063t(connectionResult, aVar, z);
            if (m4056m()) {
                m4058o();
            }
        }
    }

    /* renamed from: f */
    public final <A extends C1382a.C1384b, T extends C1418c<? extends C1507j, A>> T mo10962f(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: g */
    public final <A extends C1382a.C1384b, R extends C1507j, T extends C1418c<R, A>> T mo10963g(T t) {
        this.f2829a.f2797n.f2714i.add(t);
        return t;
    }

    @GuardedBy("mLock")
    /* renamed from: h */
    public final void mo10964h() {
        this.f2829a.f2790g.clear();
        this.f2841m = false;
        this.f2833e = null;
        this.f2835g = 0;
        this.f2840l = true;
        this.f2842n = false;
        this.f2844p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C1382a next : this.f2847s.keySet()) {
            C1382a.C1390f fVar = this.f2829a.f2789f.get(next.mo10782a());
            z |= next.mo10784c().mo10789b() == 1;
            boolean booleanValue = this.f2847s.get(next).booleanValue();
            if (fVar.mo10803r()) {
                this.f2841m = true;
                if (booleanValue) {
                    this.f2838j.add(next.mo10782a());
                } else {
                    this.f2840l = false;
                }
            }
            hashMap.put(fVar, new C1504z(this, next, booleanValue));
        }
        if (z) {
            this.f2841m = false;
        }
        if (this.f2841m) {
            this.f2846r.mo11202k(Integer.valueOf(System.identityHashCode(this.f2829a.f2797n)));
            C1438g0 g0Var = new C1438g0(this, (C1501y) null);
            C1382a.C1383a<? extends C0607e, C0603a> aVar = this.f2848t;
            Context context = this.f2831c;
            Looper g = this.f2829a.f2797n.mo10828g();
            C1564e eVar = this.f2846r;
            this.f2839k = (C0607e) aVar.mo8629c(context, g, eVar, eVar.mo11200i(), g0Var, g0Var);
        }
        this.f2836h = this.f2829a.f2789f.size();
        this.f2849u.add(C1484s0.m4010a().submit(new C1410a0(this, hashMap)));
    }
}
