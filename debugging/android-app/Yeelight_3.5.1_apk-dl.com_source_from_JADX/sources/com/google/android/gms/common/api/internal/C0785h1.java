package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0733c;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.tasks.C1872a;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p014c0.C0613b;
import p117y.C3908e;

/* renamed from: com.google.android.gms.common.api.internal.h1 */
public final class C0785h1 implements C0736d.C0738b, C0736d.C0739c, C0787h3 {

    /* renamed from: a */
    private final Queue f644a = new LinkedList();
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: b */
    public final C0722a.C0730f f645b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0752b f646c;

    /* renamed from: d */
    private final C0859x f647d;

    /* renamed from: e */
    private final Set f648e = new HashSet();

    /* renamed from: f */
    private final Map f649f = new HashMap();

    /* renamed from: g */
    private final int f650g;
    @Nullable

    /* renamed from: h */
    private final C0791i2 f651h;

    /* renamed from: i */
    private boolean f652i;

    /* renamed from: j */
    private final List f653j = new ArrayList();
    @Nullable

    /* renamed from: k */
    private ConnectionResult f654k = null;

    /* renamed from: l */
    private int f655l = 0;

    /* renamed from: m */
    final /* synthetic */ C0778g f656m;

    @WorkerThread
    public C0785h1(C0778g gVar, C0733c cVar) {
        this.f656m = gVar;
        C0722a.C0730f m = cVar.mo11857m(gVar.f632p.getLooper(), this);
        this.f645b = m;
        this.f646c = cVar.mo11846b();
        this.f647d = new C0859x();
        this.f650g = cVar.mo11856l();
        if (m.mo11845q()) {
            this.f651h = cVar.mo11858n(gVar.f623g, gVar.f632p);
        } else {
            this.f651h = null;
        }
    }

    /* renamed from: B */
    static /* bridge */ /* synthetic */ void m846B(C0785h1 h1Var, C0797j1 j1Var) {
        if (!h1Var.f653j.contains(j1Var) || h1Var.f652i) {
            return;
        }
        if (!h1Var.f645b.isConnected()) {
            h1Var.mo11978E();
        } else {
            h1Var.m853i();
        }
    }

    /* renamed from: C */
    static /* bridge */ /* synthetic */ void m847C(C0785h1 h1Var, C0797j1 j1Var) {
        Feature[] g;
        if (h1Var.f653j.remove(j1Var)) {
            h1Var.f656m.f632p.removeMessages(15, j1Var);
            h1Var.f656m.f632p.removeMessages(16, j1Var);
            Feature a = j1Var.f675b;
            ArrayList arrayList = new ArrayList(h1Var.f644a.size());
            for (C0854v2 v2Var : h1Var.f644a) {
                if ((v2Var instanceof C0832q1) && (g = ((C0832q1) v2Var).mo12061g(h1Var)) != null && C0613b.m189c(g, a)) {
                    arrayList.add(v2Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0854v2 v2Var2 = (C0854v2) arrayList.get(i);
                h1Var.f644a.remove(v2Var2);
                v2Var2.mo12036b(new UnsupportedApiCallException(a));
            }
        }
    }

    @WorkerThread
    @Nullable
    /* renamed from: b */
    private final Feature m849b(@Nullable Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] l = this.f645b.mo11842l();
            if (l == null) {
                l = new Feature[0];
            }
            ArrayMap arrayMap = new ArrayMap(r3);
            for (Feature feature : l) {
                arrayMap.put(feature.getName(), Long.valueOf(feature.mo11760V()));
            }
            for (Feature feature2 : featureArr) {
                Long l2 = (Long) arrayMap.get(feature2.getName());
                if (l2 == null || l2.longValue() < feature2.mo11760V()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @WorkerThread
    /* renamed from: d */
    private final void m850d(ConnectionResult connectionResult) {
        for (C0866y2 b : this.f648e) {
            b.mo12099b(this.f646c, connectionResult, C0914h.m1402a(connectionResult, ConnectionResult.RESULT_SUCCESS) ? this.f645b.mo11835e() : null);
        }
        this.f648e.clear();
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: g */
    public final void m851g(Status status) {
        C0917i.m1412c(this.f656m.f632p);
        m852h(status, (Exception) null, false);
    }

    @WorkerThread
    /* renamed from: h */
    private final void m852h(@Nullable Status status, @Nullable Exception exc, boolean z) {
        C0917i.m1412c(this.f656m.f632p);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.f644a.iterator();
            while (it.hasNext()) {
                C0854v2 v2Var = (C0854v2) it.next();
                if (!z || v2Var.f834a == 2) {
                    if (status != null) {
                        v2Var.mo12035a(status);
                    } else {
                        v2Var.mo12036b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    @WorkerThread
    /* renamed from: i */
    private final void m853i() {
        ArrayList arrayList = new ArrayList(this.f644a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C0854v2 v2Var = (C0854v2) arrayList.get(i);
            if (this.f645b.isConnected()) {
                if (m859o(v2Var)) {
                    this.f644a.remove(v2Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: j */
    public final void m854j() {
        mo11977D();
        m850d(ConnectionResult.RESULT_SUCCESS);
        m858n();
        Iterator it = this.f649f.values().iterator();
        while (it.hasNext()) {
            C0865y1 y1Var = (C0865y1) it.next();
            if (m849b(y1Var.f853a.mo12032c()) == null) {
                try {
                    y1Var.f853a.mo11901d(this.f645b, new C1872a());
                } catch (DeadObjectException unused) {
                    mo11948c(3);
                    this.f645b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                }
            }
            it.remove();
        }
        m853i();
        m856l();
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: k */
    public final void m855k(int i) {
        mo11977D();
        this.f652i = true;
        this.f647d.mo12090e(i, this.f645b.mo11843o());
        C0778g gVar = this.f656m;
        gVar.f632p.sendMessageDelayed(Message.obtain(gVar.f632p, 9, this.f646c), this.f656m.f617a);
        C0778g gVar2 = this.f656m;
        gVar2.f632p.sendMessageDelayed(Message.obtain(gVar2.f632p, 11, this.f646c), this.f656m.f618b);
        this.f656m.f625i.mo26330c();
        for (C0865y1 y1Var : this.f649f.values()) {
            y1Var.f855c.run();
        }
    }

    /* renamed from: l */
    private final void m856l() {
        this.f656m.f632p.removeMessages(12, this.f646c);
        C0778g gVar = this.f656m;
        gVar.f632p.sendMessageDelayed(gVar.f632p.obtainMessage(12, this.f646c), this.f656m.f619c);
    }

    @WorkerThread
    /* renamed from: m */
    private final void m857m(C0854v2 v2Var) {
        v2Var.mo12071d(this.f647d, mo11988P());
        try {
            v2Var.mo12037c(this);
        } catch (DeadObjectException unused) {
            mo11948c(1);
            this.f645b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @WorkerThread
    /* renamed from: n */
    private final void m858n() {
        if (this.f652i) {
            this.f656m.f632p.removeMessages(11, this.f646c);
            this.f656m.f632p.removeMessages(9, this.f646c);
            this.f652i = false;
        }
    }

    @WorkerThread
    /* renamed from: o */
    private final boolean m859o(C0854v2 v2Var) {
        if (!(v2Var instanceof C0832q1)) {
            m857m(v2Var);
            return true;
        }
        C0832q1 q1Var = (C0832q1) v2Var;
        Feature b = m849b(q1Var.mo12061g(this));
        if (b == null) {
            m857m(v2Var);
            return true;
        }
        String name = this.f645b.getClass().getName();
        String name2 = b.getName();
        long V = b.mo11760V();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(name2);
        sb.append(", ");
        sb.append(V);
        sb.append(").");
        if (!this.f656m.f633q || !q1Var.mo12060f(this)) {
            q1Var.mo12036b(new UnsupportedApiCallException(b));
            return true;
        }
        C0797j1 j1Var = new C0797j1(this.f646c, b, (C0790i1) null);
        int indexOf = this.f653j.indexOf(j1Var);
        if (indexOf >= 0) {
            C0797j1 j1Var2 = (C0797j1) this.f653j.get(indexOf);
            this.f656m.f632p.removeMessages(15, j1Var2);
            C0778g gVar = this.f656m;
            gVar.f632p.sendMessageDelayed(Message.obtain(gVar.f632p, 15, j1Var2), this.f656m.f617a);
            return false;
        }
        this.f653j.add(j1Var);
        C0778g gVar2 = this.f656m;
        gVar2.f632p.sendMessageDelayed(Message.obtain(gVar2.f632p, 15, j1Var), this.f656m.f617a);
        C0778g gVar3 = this.f656m;
        gVar3.f632p.sendMessageDelayed(Message.obtain(gVar3.f632p, 16, j1Var), this.f656m.f618b);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (m860p(connectionResult)) {
            return false;
        }
        this.f656m.mo11964g(connectionResult, this.f650g);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m860p(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C0778g.f615t
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.g r1 = r3.f656m     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.y r2 = r1.f629m     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f630n     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.b r2 = r3.f646c     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.g r1 = r3.f656m     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.y r1 = r1.f629m     // Catch:{ all -> 0x002a }
            int r2 = r3.f650g     // Catch:{ all -> 0x002a }
            r1.mo11927s(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0785h1.m860p(com.google.android.gms.common.ConnectionResult):boolean");
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: q */
    public final boolean m861q(boolean z) {
        C0917i.m1412c(this.f656m.f632p);
        if (!this.f645b.isConnected() || this.f649f.size() != 0) {
            return false;
        }
        if (this.f647d.mo12092g()) {
            if (z) {
                m856l();
            }
            return false;
        }
        this.f645b.disconnect("Timing out service connection.");
        return true;
    }

    @WorkerThread
    /* renamed from: D */
    public final void mo11977D() {
        C0917i.m1412c(this.f656m.f632p);
        this.f654k = null;
    }

    @WorkerThread
    /* renamed from: E */
    public final void mo11978E() {
        ConnectionResult connectionResult;
        C0917i.m1412c(this.f656m.f632p);
        if (!this.f645b.isConnected() && !this.f645b.mo11832d()) {
            try {
                C0778g gVar = this.f656m;
                int b = gVar.f625i.mo26329b(gVar.f623g, this.f645b);
                if (b != 0) {
                    ConnectionResult connectionResult2 = new ConnectionResult(b, (PendingIntent) null);
                    String name = this.f645b.getClass().getName();
                    String obj = connectionResult2.toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    mo11981H(connectionResult2, (Exception) null);
                    return;
                }
                C0778g gVar2 = this.f656m;
                C0722a.C0730f fVar = this.f645b;
                C0807l1 l1Var = new C0807l1(gVar2, fVar, this.f646c);
                if (fVar.mo11845q()) {
                    ((C0791i2) C0917i.m1419j(this.f651h)).mo12003G0(l1Var);
                }
                try {
                    this.f645b.mo11836f(l1Var);
                } catch (SecurityException e) {
                    e = e;
                    connectionResult = new ConnectionResult(10);
                    mo11981H(connectionResult, e);
                }
            } catch (IllegalStateException e2) {
                e = e2;
                connectionResult = new ConnectionResult(10);
                mo11981H(connectionResult, e);
            }
        }
    }

    @WorkerThread
    /* renamed from: F */
    public final void mo11979F(C0854v2 v2Var) {
        C0917i.m1412c(this.f656m.f632p);
        if (!this.f645b.isConnected()) {
            this.f644a.add(v2Var);
            ConnectionResult connectionResult = this.f654k;
            if (connectionResult == null || !connectionResult.mo11754d0()) {
                mo11978E();
            } else {
                mo11981H(this.f654k, (Exception) null);
            }
        } else if (m859o(v2Var)) {
            m856l();
        } else {
            this.f644a.add(v2Var);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: G */
    public final void mo11980G() {
        this.f655l++;
    }

    @WorkerThread
    /* renamed from: H */
    public final void mo11981H(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        C0917i.m1412c(this.f656m.f632p);
        C0791i2 i2Var = this.f651h;
        if (i2Var != null) {
            i2Var.mo12004H0();
        }
        mo11977D();
        this.f656m.f625i.mo26330c();
        m850d(connectionResult);
        if ((this.f645b instanceof C3908e) && connectionResult.mo11751V() != 24) {
            this.f656m.f620d = true;
            C0778g gVar = this.f656m;
            gVar.f632p.sendMessageDelayed(gVar.f632p.obtainMessage(19), Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL);
        }
        if (connectionResult.mo11751V() == 4) {
            m851g(C0778g.f614s);
        } else if (this.f644a.isEmpty()) {
            this.f654k = connectionResult;
        } else if (exc != null) {
            C0917i.m1412c(this.f656m.f632p);
            m852h((Status) null, exc, false);
        } else if (this.f656m.f633q) {
            m852h(C0778g.m803h(this.f646c, connectionResult), (Exception) null, true);
            if (!this.f644a.isEmpty() && !m860p(connectionResult) && !this.f656m.mo11964g(connectionResult, this.f650g)) {
                if (connectionResult.mo11751V() == 18) {
                    this.f652i = true;
                }
                if (this.f652i) {
                    C0778g gVar2 = this.f656m;
                    gVar2.f632p.sendMessageDelayed(Message.obtain(gVar2.f632p, 9, this.f646c), this.f656m.f617a);
                    return;
                }
                m851g(C0778g.m803h(this.f646c, connectionResult));
            }
        } else {
            m851g(C0778g.m803h(this.f646c, connectionResult));
        }
    }

    @WorkerThread
    /* renamed from: I */
    public final void mo11982I(@NonNull ConnectionResult connectionResult) {
        C0917i.m1412c(this.f656m.f632p);
        C0722a.C0730f fVar = this.f645b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        fVar.disconnect("onSignInFailed for " + name + " with " + valueOf);
        mo11981H(connectionResult, (Exception) null);
    }

    @WorkerThread
    /* renamed from: J */
    public final void mo11983J(C0866y2 y2Var) {
        C0917i.m1412c(this.f656m.f632p);
        this.f648e.add(y2Var);
    }

    @WorkerThread
    /* renamed from: K */
    public final void mo11984K() {
        C0917i.m1412c(this.f656m.f632p);
        if (this.f652i) {
            mo11978E();
        }
    }

    @WorkerThread
    /* renamed from: L */
    public final void mo11985L() {
        C0917i.m1412c(this.f656m.f632p);
        m851g(C0778g.f613r);
        this.f647d.mo12091f();
        for (C0793j.C0794a u2Var : (C0793j.C0794a[]) this.f649f.keySet().toArray(new C0793j.C0794a[0])) {
            mo11979F(new C0850u2(u2Var, new C1872a()));
        }
        m850d(new ConnectionResult(4));
        if (this.f645b.isConnected()) {
            this.f645b.mo11837g(new C0780g1(this));
        }
    }

    @WorkerThread
    /* renamed from: M */
    public final void mo11986M() {
        C0917i.m1412c(this.f656m.f632p);
        if (this.f652i) {
            m858n();
            C0778g gVar = this.f656m;
            m851g(gVar.f624h.mo11773i(gVar.f623g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f645b.disconnect("Timing out connection while resuming.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final boolean mo11987O() {
        return this.f645b.isConnected();
    }

    /* renamed from: P */
    public final boolean mo11988P() {
        return this.f645b.mo11845q();
    }

    /* renamed from: T */
    public final void mo11989T(ConnectionResult connectionResult, C0722a aVar, boolean z) {
        throw null;
    }

    @WorkerThread
    /* renamed from: a */
    public final boolean mo11990a() {
        return m861q(true);
    }

    /* renamed from: c */
    public final void mo11948c(int i) {
        if (Looper.myLooper() == this.f656m.f632p.getLooper()) {
            m855k(i);
        } else {
            this.f656m.f632p.post(new C0770e1(this, i));
        }
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo11972e(@NonNull ConnectionResult connectionResult) {
        mo11981H(connectionResult, (Exception) null);
    }

    /* renamed from: f */
    public final void mo11949f(@Nullable Bundle bundle) {
        if (Looper.myLooper() == this.f656m.f632p.getLooper()) {
            m854j();
        } else {
            this.f656m.f632p.post(new C0765d1(this));
        }
    }

    /* renamed from: r */
    public final int mo11991r() {
        return this.f650g;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final int mo11992s() {
        return this.f655l;
    }

    @WorkerThread
    @Nullable
    /* renamed from: t */
    public final ConnectionResult mo11993t() {
        C0917i.m1412c(this.f656m.f632p);
        return this.f654k;
    }

    /* renamed from: v */
    public final C0722a.C0730f mo11994v() {
        return this.f645b;
    }

    /* renamed from: x */
    public final Map mo11995x() {
        return this.f649f;
    }
}
