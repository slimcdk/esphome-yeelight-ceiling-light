package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.C1518c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1396e;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.C1512o;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1445i;
import com.google.android.gms.common.internal.C1550d;
import com.google.android.gms.common.internal.C1582l;
import com.google.android.gms.common.internal.C1584m;
import com.google.android.gms.common.internal.C1599s;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.C1611v;
import com.google.android.gms.common.util.C1648b;
import com.google.android.gms.common.util.C1660n;
import com.google.android.gms.internal.base.C1697h;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.BaseService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p037d.C0607e;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0620i;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.e */
public class C1426e implements Handler.Callback {

    /* renamed from: n */
    public static final Status f2630n = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final Status f2631o = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final Object f2632p = new Object();
    @GuardedBy("lock")

    /* renamed from: q */
    private static C1426e f2633q;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f2634a = 5000;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f2635b = 120000;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f2636c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f2637d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1518c f2638e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1582l f2639f;

    /* renamed from: g */
    private final AtomicInteger f2640g = new AtomicInteger(1);

    /* renamed from: h */
    private final AtomicInteger f2641h = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Map<C1503y1<?>, C1427a<?>> f2642i = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: j */
    public C1480r f2643j = null;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: k */
    public final Set<C1503y1<?>> f2644k = new ArraySet();

    /* renamed from: l */
    private final Set<C1503y1<?>> f2645l = new ArraySet();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Handler f2646m;

    /* renamed from: com.google.android.gms.common.api.internal.e$a */
    public class C1427a<O extends C1382a.C1386d> implements C1399f.C1401b, C1399f.C1402c, C1432e2 {

        /* renamed from: a */
        private final Queue<C1461l0> f2647a = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1382a.C1390f f2648b;

        /* renamed from: c */
        private final C1382a.C1384b f2649c;

        /* renamed from: d */
        private final C1503y1<O> f2650d;

        /* renamed from: e */
        private final C1474p f2651e;

        /* renamed from: f */
        private final Set<C1412a2> f2652f = new HashSet();

        /* renamed from: g */
        private final Map<C1445i.C1446a<?>, C1439g1> f2653g = new HashMap();

        /* renamed from: h */
        private final int f2654h;

        /* renamed from: i */
        private final C1454j1 f2655i;

        /* renamed from: j */
        private boolean f2656j;

        /* renamed from: k */
        private final List<C1428b> f2657k = new ArrayList();

        /* renamed from: l */
        private ConnectionResult f2658l = null;

        @WorkerThread
        public C1427a(C1396e<O> eVar) {
            C1382a.C1390f j = eVar.mo10821j(C1426e.this.f2646m.getLooper(), this);
            this.f2648b = j;
            this.f2649c = j instanceof C1611v ? ((C1611v) j).mo11289n0() : j;
            this.f2650d = eVar.mo10823m();
            this.f2651e = new C1474p();
            this.f2654h = eVar.mo10819h();
            if (this.f2648b.mo10803r()) {
                this.f2655i = eVar.mo10822l(C1426e.this.f2637d, C1426e.this.f2646m);
            } else {
                this.f2655i = null;
            }
        }

        @WorkerThread
        /* renamed from: B */
        private final void m3769B() {
            if (this.f2656j) {
                C1426e.this.f2646m.removeMessages(11, this.f2650d);
                C1426e.this.f2646m.removeMessages(9, this.f2650d);
                this.f2656j = false;
            }
        }

        /* renamed from: C */
        private final void m3770C() {
            C1426e.this.f2646m.removeMessages(12, this.f2650d);
            C1426e.this.f2646m.sendMessageDelayed(C1426e.this.f2646m.obtainMessage(12, this.f2650d), C1426e.this.f2636c);
        }

        @WorkerThread
        /* renamed from: G */
        private final void m3771G(C1461l0 l0Var) {
            l0Var.mo10988d(this.f2651e, mo10925h());
            try {
                l0Var.mo10987c(this);
            } catch (DeadObjectException unused) {
                mo10836a(1);
                this.f2648b.disconnect();
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        /* renamed from: H */
        public final boolean m3772H(boolean z) {
            C1609u.m4468d(C1426e.this.f2646m);
            if (!this.f2648b.isConnected() || this.f2653g.size() != 0) {
                return false;
            }
            if (this.f2651e.mo10999d()) {
                if (z) {
                    m3770C();
                }
                return false;
            }
            this.f2648b.disconnect();
            return true;
        }

        @WorkerThread
        /* renamed from: M */
        private final boolean m3776M(@NonNull ConnectionResult connectionResult) {
            synchronized (C1426e.f2632p) {
                if (C1426e.this.f2643j == null || !C1426e.this.f2644k.contains(this.f2650d)) {
                    return false;
                }
                C1426e.this.f2643j.mo10887j(connectionResult, this.f2654h);
                return true;
            }
        }

        @WorkerThread
        /* renamed from: N */
        private final void m3777N(ConnectionResult connectionResult) {
            for (C1412a2 next : this.f2652f) {
                String str = null;
                if (C1599s.m4388a(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                    str = this.f2648b.mo10795f();
                }
                next.mo10867b(this.f2650d, connectionResult, str);
            }
            this.f2652f.clear();
        }

        @WorkerThread
        @Nullable
        /* renamed from: j */
        private final Feature m3778j(@Nullable Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] p = this.f2648b.mo10801p();
                if (p == null) {
                    p = new Feature[0];
                }
                ArrayMap arrayMap = new ArrayMap(p.length);
                for (Feature feature : p) {
                    arrayMap.put(feature.getName(), Long.valueOf(feature.mo10754Q()));
                }
                for (Feature feature2 : featureArr) {
                    if (!arrayMap.containsKey(feature2.getName()) || ((Long) arrayMap.get(feature2.getName())).longValue() < feature2.mo10754Q()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        @WorkerThread
        /* renamed from: l */
        public final void m3780l(C1428b bVar) {
            if (!this.f2657k.contains(bVar) || this.f2656j) {
                return;
            }
            if (!this.f2648b.isConnected()) {
                mo10921b();
            } else {
                m3787w();
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        /* renamed from: s */
        public final void m3783s(C1428b bVar) {
            Feature[] g;
            if (this.f2657k.remove(bVar)) {
                C1426e.this.f2646m.removeMessages(15, bVar);
                C1426e.this.f2646m.removeMessages(16, bVar);
                Feature b = bVar.f2661b;
                ArrayList arrayList = new ArrayList(this.f2647a.size());
                for (C1461l0 l0Var : this.f2647a) {
                    if ((l0Var instanceof C1443h1) && (g = ((C1443h1) l0Var).mo10946g(this)) != null && C1648b.m4566b(g, b)) {
                        arrayList.add(l0Var);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    C1461l0 l0Var2 = (C1461l0) obj;
                    this.f2647a.remove(l0Var2);
                    l0Var2.mo10989e(new C1512o(b));
                }
            }
        }

        @WorkerThread
        /* renamed from: t */
        private final boolean m3784t(C1461l0 l0Var) {
            if (!(l0Var instanceof C1443h1)) {
                m3771G(l0Var);
                return true;
            }
            C1443h1 h1Var = (C1443h1) l0Var;
            Feature j = m3778j(h1Var.mo10946g(this));
            if (j == null) {
                m3771G(l0Var);
                return true;
            } else if (h1Var.mo10947h(this)) {
                C1428b bVar = new C1428b(this.f2650d, j, (C1487t0) null);
                int indexOf = this.f2657k.indexOf(bVar);
                if (indexOf >= 0) {
                    C1428b bVar2 = this.f2657k.get(indexOf);
                    C1426e.this.f2646m.removeMessages(15, bVar2);
                    C1426e.this.f2646m.sendMessageDelayed(Message.obtain(C1426e.this.f2646m, 15, bVar2), C1426e.this.f2634a);
                    return false;
                }
                this.f2657k.add(bVar);
                C1426e.this.f2646m.sendMessageDelayed(Message.obtain(C1426e.this.f2646m, 15, bVar), C1426e.this.f2634a);
                C1426e.this.f2646m.sendMessageDelayed(Message.obtain(C1426e.this.f2646m, 16, bVar), C1426e.this.f2635b);
                ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
                if (m3776M(connectionResult)) {
                    return false;
                }
                C1426e.this.mo10914q(connectionResult, this.f2654h);
                return false;
            } else {
                h1Var.mo10989e(new C1512o(j));
                return false;
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        /* renamed from: u */
        public final void m3785u() {
            mo10933z();
            m3777N(ConnectionResult.RESULT_SUCCESS);
            m3769B();
            Iterator<C1439g1> it = this.f2653g.values().iterator();
            while (it.hasNext()) {
                C1439g1 next = it.next();
                if (m3778j(next.f2693a.mo10978c()) == null) {
                    try {
                        next.f2693a.mo10979d(this.f2649c, new C0620i());
                    } catch (DeadObjectException unused) {
                        mo10836a(1);
                        this.f2648b.disconnect();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            m3787w();
            m3770C();
        }

        /* access modifiers changed from: private */
        @WorkerThread
        /* renamed from: v */
        public final void m3786v() {
            mo10933z();
            this.f2656j = true;
            this.f2651e.mo11001f();
            C1426e.this.f2646m.sendMessageDelayed(Message.obtain(C1426e.this.f2646m, 9, this.f2650d), C1426e.this.f2634a);
            C1426e.this.f2646m.sendMessageDelayed(Message.obtain(C1426e.this.f2646m, 11, this.f2650d), C1426e.this.f2635b);
            C1426e.this.f2639f.mo11247a();
        }

        @WorkerThread
        /* renamed from: w */
        private final void m3787w() {
            ArrayList arrayList = new ArrayList(this.f2647a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C1461l0 l0Var = (C1461l0) obj;
                if (!this.f2648b.isConnected()) {
                    return;
                }
                if (m3784t(l0Var)) {
                    this.f2647a.remove(l0Var);
                }
            }
        }

        @WorkerThread
        /* renamed from: A */
        public final ConnectionResult mo10916A() {
            C1609u.m4468d(C1426e.this.f2646m);
            return this.f2658l;
        }

        @WorkerThread
        /* renamed from: D */
        public final boolean mo10917D() {
            return m3772H(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public final C0607e mo10918E() {
            C1454j1 j1Var = this.f2655i;
            if (j1Var == null) {
                return null;
            }
            return j1Var.mo10973S0();
        }

        @WorkerThread
        /* renamed from: F */
        public final void mo10919F(Status status) {
            C1609u.m4468d(C1426e.this.f2646m);
            for (C1461l0 b : this.f2647a) {
                b.mo10986b(status);
            }
            this.f2647a.clear();
        }

        @WorkerThread
        /* renamed from: L */
        public final void mo10920L(@NonNull ConnectionResult connectionResult) {
            C1609u.m4468d(C1426e.this.f2646m);
            this.f2648b.disconnect();
            mo10838f(connectionResult);
        }

        /* renamed from: a */
        public final void mo10836a(int i) {
            if (Looper.myLooper() == C1426e.this.f2646m.getLooper()) {
                m3786v();
            } else {
                C1426e.this.f2646m.post(new C1493v0(this));
            }
        }

        @WorkerThread
        /* renamed from: b */
        public final void mo10921b() {
            C1609u.m4468d(C1426e.this.f2646m);
            if (!this.f2648b.isConnected() && !this.f2648b.mo10794e()) {
                int b = C1426e.this.f2639f.mo11248b(C1426e.this.f2637d, this.f2648b);
                if (b != 0) {
                    mo10838f(new ConnectionResult(b, (PendingIntent) null));
                    return;
                }
                C1429c cVar = new C1429c(this.f2648b, this.f2650d);
                if (this.f2648b.mo10803r()) {
                    this.f2655i.mo10972R0(cVar);
                }
                this.f2648b.mo10796h(cVar);
            }
        }

        /* renamed from: c */
        public final void mo10837c(@Nullable Bundle bundle) {
            if (Looper.myLooper() == C1426e.this.f2646m.getLooper()) {
                m3785u();
            } else {
                C1426e.this.f2646m.post(new C1490u0(this));
            }
        }

        /* renamed from: d */
        public final int mo10922d() {
            return this.f2654h;
        }

        /* renamed from: e */
        public final void mo10923e(ConnectionResult connectionResult, C1382a<?> aVar, boolean z) {
            if (Looper.myLooper() == C1426e.this.f2646m.getLooper()) {
                mo10838f(connectionResult);
            } else {
                C1426e.this.f2646m.post(new C1496w0(this, connectionResult));
            }
        }

        @WorkerThread
        /* renamed from: f */
        public final void mo10838f(@NonNull ConnectionResult connectionResult) {
            C1609u.m4468d(C1426e.this.f2646m);
            C1454j1 j1Var = this.f2655i;
            if (j1Var != null) {
                j1Var.mo10974T0();
            }
            mo10933z();
            C1426e.this.f2639f.mo11247a();
            m3777N(connectionResult);
            if (connectionResult.mo10745Q() == 4) {
                mo10919F(C1426e.f2631o);
            } else if (this.f2647a.isEmpty()) {
                this.f2658l = connectionResult;
            } else if (!m3776M(connectionResult) && !C1426e.this.mo10914q(connectionResult, this.f2654h)) {
                if (connectionResult.mo10745Q() == 18) {
                    this.f2656j = true;
                }
                if (this.f2656j) {
                    C1426e.this.f2646m.sendMessageDelayed(Message.obtain(C1426e.this.f2646m, 9, this.f2650d), C1426e.this.f2634a);
                    return;
                }
                String c = this.f2650d.mo11024c();
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 38);
                sb.append("API: ");
                sb.append(c);
                sb.append(" is not available on this device.");
                mo10919F(new Status(17, sb.toString()));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final boolean mo10924g() {
            return this.f2648b.isConnected();
        }

        /* renamed from: h */
        public final boolean mo10925h() {
            return this.f2648b.mo10803r();
        }

        @WorkerThread
        /* renamed from: i */
        public final void mo10926i() {
            C1609u.m4468d(C1426e.this.f2646m);
            if (this.f2656j) {
                mo10921b();
            }
        }

        @WorkerThread
        /* renamed from: m */
        public final void mo10927m(C1461l0 l0Var) {
            C1609u.m4468d(C1426e.this.f2646m);
            if (!this.f2648b.isConnected()) {
                this.f2647a.add(l0Var);
                ConnectionResult connectionResult = this.f2658l;
                if (connectionResult == null || !connectionResult.mo10748T()) {
                    mo10921b();
                } else {
                    mo10838f(this.f2658l);
                }
            } else if (m3784t(l0Var)) {
                m3770C();
            } else {
                this.f2647a.add(l0Var);
            }
        }

        @WorkerThread
        /* renamed from: n */
        public final void mo10928n(C1412a2 a2Var) {
            C1609u.m4468d(C1426e.this.f2646m);
            this.f2652f.add(a2Var);
        }

        /* renamed from: p */
        public final C1382a.C1390f mo10929p() {
            return this.f2648b;
        }

        @WorkerThread
        /* renamed from: q */
        public final void mo10930q() {
            C1609u.m4468d(C1426e.this.f2646m);
            if (this.f2656j) {
                m3769B();
                mo10919F(C1426e.this.f2638e.mo11044i(C1426e.this.f2637d) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f2648b.disconnect();
            }
        }

        @WorkerThread
        /* renamed from: x */
        public final void mo10931x() {
            C1609u.m4468d(C1426e.this.f2646m);
            mo10919F(C1426e.f2630n);
            this.f2651e.mo11000e();
            for (C1445i.C1446a x1Var : (C1445i.C1446a[]) this.f2653g.keySet().toArray(new C1445i.C1446a[this.f2653g.size()])) {
                mo10927m(new C1500x1(x1Var, new C0620i()));
            }
            m3777N(new ConnectionResult(4));
            if (this.f2648b.isConnected()) {
                this.f2648b.mo10798j(new C1499x0(this));
            }
        }

        /* renamed from: y */
        public final Map<C1445i.C1446a<?>, C1439g1> mo10932y() {
            return this.f2653g;
        }

        @WorkerThread
        /* renamed from: z */
        public final void mo10933z() {
            C1609u.m4468d(C1426e.this.f2646m);
            this.f2658l = null;
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.e$b */
    private static class C1428b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1503y1<?> f2660a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Feature f2661b;

        private C1428b(C1503y1<?> y1Var, Feature feature) {
            this.f2660a = y1Var;
            this.f2661b = feature;
        }

        /* synthetic */ C1428b(C1503y1 y1Var, Feature feature, C1487t0 t0Var) {
            this(y1Var, feature);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C1428b)) {
                C1428b bVar = (C1428b) obj;
                return C1599s.m4388a(this.f2660a, bVar.f2660a) && C1599s.m4388a(this.f2661b, bVar.f2661b);
            }
        }

        public final int hashCode() {
            return C1599s.m4389b(this.f2660a, this.f2661b);
        }

        public final String toString() {
            C1599s.C1600a c = C1599s.m4390c(this);
            c.mo11272a(BaseService.KEY, this.f2660a);
            c.mo11272a("feature", this.f2661b);
            return c.toString();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.e$c */
    private class C1429c implements C1466m1, C1550d.C1553c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1382a.C1390f f2662a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1503y1<?> f2663b;

        /* renamed from: c */
        private C1584m f2664c = null;

        /* renamed from: d */
        private Set<Scope> f2665d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f2666e = false;

        public C1429c(C1382a.C1390f fVar, C1503y1<?> y1Var) {
            this.f2662a = fVar;
            this.f2663b = y1Var;
        }

        /* access modifiers changed from: private */
        @WorkerThread
        /* renamed from: g */
        public final void m3814g() {
            C1584m mVar;
            if (this.f2666e && (mVar = this.f2664c) != null) {
                this.f2662a.mo10792d(mVar, this.f2665d);
            }
        }

        /* renamed from: a */
        public final void mo10937a(@NonNull ConnectionResult connectionResult) {
            C1426e.this.f2646m.post(new C1505z0(this, connectionResult));
        }

        @WorkerThread
        /* renamed from: b */
        public final void mo10938b(C1584m mVar, Set<Scope> set) {
            if (mVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo10939c(new ConnectionResult(4));
                return;
            }
            this.f2664c = mVar;
            this.f2665d = set;
            m3814g();
        }

        @WorkerThread
        /* renamed from: c */
        public final void mo10939c(ConnectionResult connectionResult) {
            ((C1427a) C1426e.this.f2642i.get(this.f2663b)).mo10920L(connectionResult);
        }
    }

    @KeepForSdk
    private C1426e(Context context, Looper looper, C1518c cVar) {
        this.f2637d = context;
        this.f2646m = new C1697h(looper, this);
        this.f2638e = cVar;
        this.f2639f = new C1582l(cVar);
        Handler handler = this.f2646m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: j */
    public static C1426e m3746j(Context context) {
        C1426e eVar;
        synchronized (f2632p) {
            if (f2633q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f2633q = new C1426e(context.getApplicationContext(), handlerThread.getLooper(), C1518c.m4095q());
            }
            eVar = f2633q;
        }
        return eVar;
    }

    @WorkerThread
    /* renamed from: k */
    private final void m3747k(C1396e<?> eVar) {
        C1503y1<?> m = eVar.mo10823m();
        C1427a aVar = this.f2642i.get(m);
        if (aVar == null) {
            aVar = new C1427a(eVar);
            this.f2642i.put(m, aVar);
        }
        if (aVar.mo10925h()) {
            this.f2645l.add(m);
        }
        aVar.mo10921b();
    }

    /* renamed from: l */
    public static C1426e m3748l() {
        C1426e eVar;
        synchronized (f2632p) {
            C1609u.m4476l(f2633q, "Must guarantee manager is non-null before using getInstance");
            eVar = f2633q;
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent mo10905a(C1503y1<?> y1Var, int i) {
        C0607e E;
        C1427a aVar = this.f2642i.get(y1Var);
        if (aVar == null || (E = aVar.mo10918E()) == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f2637d, i, E.mo10802q(), 134217728);
    }

    /* renamed from: c */
    public final <O extends C1382a.C1386d> C0619h<Boolean> mo10906c(@NonNull C1396e<O> eVar, @NonNull C1445i.C1446a<?> aVar) {
        C0620i iVar = new C0620i();
        C1500x1 x1Var = new C1500x1(aVar, iVar);
        Handler handler = this.f2646m;
        handler.sendMessage(handler.obtainMessage(13, new C1435f1(x1Var, this.f2641h.get(), eVar)));
        return iVar.mo8666a();
    }

    /* renamed from: d */
    public final <O extends C1382a.C1386d> C0619h<Void> mo10907d(@NonNull C1396e<O> eVar, @NonNull C1456k<C1382a.C1384b, ?> kVar, @NonNull C1468n<C1382a.C1384b, ?> nVar) {
        C0620i iVar = new C0620i();
        C1497w1 w1Var = new C1497w1(new C1439g1(kVar, nVar), iVar);
        Handler handler = this.f2646m;
        handler.sendMessage(handler.obtainMessage(8, new C1435f1(w1Var, this.f2641h.get(), eVar)));
        return iVar.mo8666a();
    }

    /* renamed from: e */
    public final C0619h<Map<C1503y1<?>, String>> mo10908e(Iterable<? extends C1396e<?>> iterable) {
        C1412a2 a2Var = new C1412a2(iterable);
        Handler handler = this.f2646m;
        handler.sendMessage(handler.obtainMessage(2, a2Var));
        return a2Var.mo10866a();
    }

    /* renamed from: f */
    public final void mo10909f(ConnectionResult connectionResult, int i) {
        if (!mo10914q(connectionResult, i)) {
            Handler handler = this.f2646m;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: g */
    public final void mo10910g(C1396e<?> eVar) {
        Handler handler = this.f2646m;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    /* renamed from: h */
    public final <O extends C1382a.C1386d> void mo10911h(C1396e<O> eVar, int i, C1418c<? extends C1507j, C1382a.C1384b> cVar) {
        C1494v1 v1Var = new C1494v1(i, cVar);
        Handler handler = this.f2646m;
        handler.sendMessage(handler.obtainMessage(4, new C1435f1(v1Var, this.f2641h.get(), eVar)));
    }

    @WorkerThread
    public boolean handleMessage(Message message) {
        C0620i<Boolean> iVar;
        Boolean bool;
        int i = message.what;
        long j = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
        C1427a aVar = null;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f2636c = j;
                this.f2646m.removeMessages(12);
                for (C1503y1<?> obtainMessage : this.f2642i.keySet()) {
                    Handler handler = this.f2646m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f2636c);
                }
                break;
            case 2:
                C1412a2 a2Var = (C1412a2) message.obj;
                Iterator<C1503y1<?>> it = a2Var.mo10868c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C1503y1 next = it.next();
                        C1427a aVar2 = this.f2642i.get(next);
                        if (aVar2 == null) {
                            a2Var.mo10867b(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (aVar2.mo10924g()) {
                            a2Var.mo10867b(next, ConnectionResult.RESULT_SUCCESS, aVar2.mo10929p().mo10795f());
                        } else if (aVar2.mo10916A() != null) {
                            a2Var.mo10867b(next, aVar2.mo10916A(), (String) null);
                        } else {
                            aVar2.mo10928n(a2Var);
                            aVar2.mo10921b();
                        }
                    }
                }
            case 3:
                for (C1427a next2 : this.f2642i.values()) {
                    next2.mo10933z();
                    next2.mo10921b();
                }
                break;
            case 4:
            case 8:
            case 13:
                C1435f1 f1Var = (C1435f1) message.obj;
                C1427a aVar3 = this.f2642i.get(f1Var.f2678c.mo10823m());
                if (aVar3 == null) {
                    m3747k(f1Var.f2678c);
                    aVar3 = this.f2642i.get(f1Var.f2678c.mo10823m());
                }
                if (aVar3.mo10925h() && this.f2641h.get() != f1Var.f2677b) {
                    f1Var.f2676a.mo10986b(f2630n);
                    aVar3.mo10931x();
                    break;
                } else {
                    aVar3.mo10927m(f1Var.f2676a);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<C1427a<?>> it2 = this.f2642i.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C1427a next3 = it2.next();
                        if (next3.mo10922d() == i2) {
                            aVar = next3;
                        }
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String g = this.f2638e.mo11043g(connectionResult.mo10745Q());
                    String R = connectionResult.mo10746R();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(g).length() + 69 + String.valueOf(R).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(g);
                    sb2.append(": ");
                    sb2.append(R);
                    aVar.mo10919F(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (C1660n.m4601a() && (this.f2637d.getApplicationContext() instanceof Application)) {
                    C1413b.m3713c((Application) this.f2637d.getApplicationContext());
                    C1413b.m3712b().mo10869a(new C1487t0(this));
                    if (!C1413b.m3712b().mo10871f(true)) {
                        this.f2636c = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
                        break;
                    }
                }
                break;
            case 7:
                m3747k((C1396e) message.obj);
                break;
            case 9:
                if (this.f2642i.containsKey(message.obj)) {
                    this.f2642i.get(message.obj).mo10926i();
                    break;
                }
                break;
            case 10:
                for (C1503y1<?> remove : this.f2645l) {
                    this.f2642i.remove(remove).mo10931x();
                }
                this.f2645l.clear();
                break;
            case 11:
                if (this.f2642i.containsKey(message.obj)) {
                    this.f2642i.get(message.obj).mo10930q();
                    break;
                }
                break;
            case 12:
                if (this.f2642i.containsKey(message.obj)) {
                    this.f2642i.get(message.obj).mo10917D();
                    break;
                }
                break;
            case 14:
                C1483s sVar = (C1483s) message.obj;
                C1503y1<?> b = sVar.mo11014b();
                if (!this.f2642i.containsKey(b)) {
                    iVar = sVar.mo11013a();
                    bool = Boolean.FALSE;
                } else {
                    boolean o = this.f2642i.get(b).m3772H(false);
                    iVar = sVar.mo11013a();
                    bool = Boolean.valueOf(o);
                }
                iVar.mo8668c(bool);
                break;
            case 15:
                C1428b bVar = (C1428b) message.obj;
                if (this.f2642i.containsKey(bVar.f2660a)) {
                    this.f2642i.get(bVar.f2660a).m3780l(bVar);
                    break;
                }
                break;
            case 16:
                C1428b bVar2 = (C1428b) message.obj;
                if (this.f2642i.containsKey(bVar2.f2660a)) {
                    this.f2642i.get(bVar2.f2660a).m3783s(bVar2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                sb3.toString();
                return false;
        }
        return true;
    }

    /* renamed from: m */
    public final int mo10913m() {
        return this.f2640g.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo10914q(ConnectionResult connectionResult, int i) {
        return this.f2638e.mo11053y(this.f2637d, connectionResult, i);
    }

    /* renamed from: y */
    public final void mo10915y() {
        Handler handler = this.f2646m;
        handler.sendMessage(handler.obtainMessage(3));
    }
}
