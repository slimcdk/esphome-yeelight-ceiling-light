package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C1520d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1564e;
import com.google.android.gms.common.util.p106s.C1665a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p037d.C0603a;
import p011c.p012a.p019b.p028b.p037d.C0607e;

/* renamed from: com.google.android.gms.common.api.internal.k2 */
public final class C1459k2 implements C1424d1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<C1382a.C1385c<?>, C1455j2<?>> f2749a = new HashMap();

    /* renamed from: b */
    private final Map<C1382a.C1385c<?>, C1455j2<?>> f2750b = new HashMap();

    /* renamed from: c */
    private final Map<C1382a<?>, Boolean> f2751c;

    /* renamed from: d */
    private final C1426e f2752d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1453j0 f2753e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Lock f2754f;

    /* renamed from: g */
    private final Looper f2755g;

    /* renamed from: h */
    private final C1520d f2756h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Condition f2757i;

    /* renamed from: j */
    private final C1564e f2758j;

    /* renamed from: k */
    private final boolean f2759k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final boolean f2760l;

    /* renamed from: m */
    private final Queue<C1418c<?, ?>> f2761m = new LinkedList();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: n */
    public boolean f2762n;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: o */
    public Map<C1503y1<?>, ConnectionResult> f2763o;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: p */
    public Map<C1503y1<?>, ConnectionResult> f2764p;
    @GuardedBy("mLock")

    /* renamed from: q */
    private C1471o f2765q;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: r */
    public ConnectionResult f2766r;

    public C1459k2(Context context, Lock lock, Looper looper, C1520d dVar, Map<C1382a.C1385c<?>, C1382a.C1390f> map, C1564e eVar, Map<C1382a<?>, Boolean> map2, C1382a.C1383a<? extends C0607e, C0603a> aVar, ArrayList<C1425d2> arrayList, C1453j0 j0Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f2754f = lock;
        this.f2755g = looper;
        this.f2757i = lock.newCondition();
        this.f2756h = dVar;
        this.f2753e = j0Var;
        this.f2751c = map2;
        this.f2758j = eVar;
        this.f2759k = z;
        HashMap hashMap = new HashMap();
        for (C1382a next : map2.keySet()) {
            hashMap.put(next.mo10782a(), next);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1425d2 d2Var = arrayList.get(i);
            i++;
            C1425d2 d2Var2 = d2Var;
            hashMap2.put(d2Var2.f2627a, d2Var2);
        }
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        for (Map.Entry next2 : map.entrySet()) {
            C1382a aVar2 = (C1382a) hashMap.get(next2.getKey());
            C1382a.C1390f fVar = (C1382a.C1390f) next2.getValue();
            if (fVar.mo10799m()) {
                z3 = z6;
                if (!this.f2751c.get(aVar2).booleanValue()) {
                    z4 = true;
                    z2 = true;
                } else {
                    z2 = z7;
                    z4 = true;
                }
            } else {
                z4 = z5;
                z2 = z7;
                z3 = false;
            }
            C1455j2 j2Var = r1;
            C1455j2 j2Var2 = new C1455j2(context, aVar2, looper, fVar, (C1425d2) hashMap2.get(aVar2), eVar, aVar);
            this.f2749a.put((C1382a.C1385c) next2.getKey(), j2Var);
            if (fVar.mo10803r()) {
                this.f2750b.put((C1382a.C1385c) next2.getKey(), j2Var);
            }
            z5 = z4;
            z6 = z3;
            z7 = z2;
        }
        this.f2760l = z5 && !z6 && !z7;
        this.f2752d = C1426e.m3748l();
    }

    @Nullable
    /* renamed from: c */
    private final ConnectionResult m3925c(@NonNull C1382a.C1385c<?> cVar) {
        this.f2754f.lock();
        try {
            C1455j2 j2Var = this.f2749a.get(cVar);
            if (this.f2763o != null && j2Var != null) {
                return this.f2763o.get(j2Var.mo10823m());
            }
            this.f2754f.unlock();
            return null;
        } finally {
            this.f2754f.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m3929j(C1455j2<?> j2Var, ConnectionResult connectionResult) {
        return !connectionResult.mo10749V() && !connectionResult.mo10748T() && this.f2751c.get(j2Var.mo10818g()).booleanValue() && j2Var.mo10975n().mo10799m() && this.f2756h.mo11046m(connectionResult.mo10745Q());
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: m */
    public final void m3932m() {
        if (this.f2758j == null) {
            this.f2753e.f2722q = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.f2758j.mo11199h());
        Map<C1382a<?>, C1564e.C1566b> e = this.f2758j.mo11196e();
        for (C1382a next : e.keySet()) {
            ConnectionResult a = mo10984a(next);
            if (a != null && a.mo10749V()) {
                hashSet.addAll(e.get(next).f3034a);
            }
        }
        this.f2753e.f2722q = hashSet;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: n */
    public final void m3933n() {
        while (!this.f2761m.isEmpty()) {
            mo10901f(this.f2761m.remove());
        }
        this.f2753e.mo10942b((Bundle) null);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable
    /* renamed from: o */
    public final ConnectionResult m3934o() {
        int i = 0;
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i2 = 0;
        for (C1455j2 next : this.f2749a.values()) {
            C1382a g = next.mo10818g();
            ConnectionResult connectionResult3 = this.f2763o.get(next.mo10823m());
            if (!connectionResult3.mo10749V() && (!this.f2751c.get(g).booleanValue() || connectionResult3.mo10748T() || this.f2756h.mo11046m(connectionResult3.mo10745Q()))) {
                if (connectionResult3.mo10745Q() != 4 || !this.f2759k) {
                    int b = g.mo10784c().mo10789b();
                    if (connectionResult == null || i > b) {
                        connectionResult = connectionResult3;
                        i = b;
                    }
                } else {
                    int b2 = g.mo10784c().mo10789b();
                    if (connectionResult2 == null || i2 > b2) {
                        connectionResult2 = connectionResult3;
                        i2 = b2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }

    /* renamed from: p */
    private final <T extends C1418c<? extends C1507j, ? extends C1382a.C1384b>> boolean m3935p(@NonNull T t) {
        C1382a.C1385c u = t.mo10891u();
        ConnectionResult c = m3925c(u);
        if (c == null || c.mo10745Q() != 4) {
            return false;
        }
        t.mo10894y(new Status(4, (String) null, this.f2752d.mo10905a(this.f2749a.get(u).mo10823m(), System.identityHashCode(this.f2753e))));
        return true;
    }

    @Nullable
    /* renamed from: a */
    public final ConnectionResult mo10984a(@NonNull C1382a<?> aVar) {
        return m3925c(aVar.mo10782a());
    }

    /* renamed from: b */
    public final void mo10897b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final void connect() {
        this.f2754f.lock();
        try {
            if (!this.f2762n) {
                this.f2762n = true;
                this.f2763o = null;
                this.f2764p = null;
                this.f2765q = null;
                this.f2766r = null;
                this.f2752d.mo10915y();
                this.f2752d.mo10908e(this.f2749a.values()).mo8642c(new C1665a(this.f2755g), new C1467m2(this));
            }
        } finally {
            this.f2754f.unlock();
        }
    }

    /* renamed from: d */
    public final void mo10899d() {
    }

    public final void disconnect() {
        this.f2754f.lock();
        try {
            this.f2762n = false;
            this.f2763o = null;
            this.f2764p = null;
            if (this.f2765q == null) {
                this.f2766r = null;
                while (!this.f2761m.isEmpty()) {
                    C1418c remove = this.f2761m.remove();
                    remove.mo10849m((C1488t1) null);
                    remove.mo10843d();
                }
                this.f2757i.signalAll();
                return;
            }
            this.f2765q.mo10996a();
            throw null;
        } finally {
            this.f2754f.unlock();
        }
    }

    /* renamed from: f */
    public final <A extends C1382a.C1384b, T extends C1418c<? extends C1507j, A>> T mo10901f(@NonNull T t) {
        C1382a.C1385c u = t.mo10891u();
        if (this.f2759k && m3935p(t)) {
            return t;
        }
        this.f2753e.f2730y.mo11009b(t);
        this.f2749a.get(u).mo10817f(t);
        return t;
    }

    /* renamed from: g */
    public final <A extends C1382a.C1384b, R extends C1507j, T extends C1418c<R, A>> T mo10902g(@NonNull T t) {
        if (this.f2759k && m3935p(t)) {
            return t;
        }
        if (!isConnected()) {
            this.f2761m.add(t);
            return t;
        }
        this.f2753e.f2730y.mo11009b(t);
        this.f2749a.get(t.mo10891u()).mo10814c(t);
        return t;
    }

    public final boolean isConnected() {
        this.f2754f.lock();
        try {
            return this.f2763o != null && this.f2766r == null;
        } finally {
            this.f2754f.unlock();
        }
    }
}
