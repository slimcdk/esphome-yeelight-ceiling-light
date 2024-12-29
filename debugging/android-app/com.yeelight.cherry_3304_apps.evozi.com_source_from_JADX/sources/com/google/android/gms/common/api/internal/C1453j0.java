package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C1518c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1564e;
import com.google.android.gms.common.internal.C1574i;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.C1650d;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p037d.C0603a;
import p011c.p012a.p019b.p028b.p037d.C0607e;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
public final class C1453j0 extends C1399f implements C1431e1 {

    /* renamed from: b */
    private final Lock f2707b;

    /* renamed from: c */
    private boolean f2708c;

    /* renamed from: d */
    private final C1574i f2709d;

    /* renamed from: e */
    private C1424d1 f2710e = null;

    /* renamed from: f */
    private final int f2711f;

    /* renamed from: g */
    private final Context f2712g;

    /* renamed from: h */
    private final Looper f2713h;
    @VisibleForTesting

    /* renamed from: i */
    final Queue<C1418c<?, ?>> f2714i = new LinkedList();

    /* renamed from: j */
    private volatile boolean f2715j;

    /* renamed from: k */
    private long f2716k;

    /* renamed from: l */
    private long f2717l;

    /* renamed from: m */
    private final C1465m0 f2718m;

    /* renamed from: n */
    private final C1518c f2719n;
    @VisibleForTesting

    /* renamed from: o */
    private C1416b1 f2720o;

    /* renamed from: p */
    final Map<C1382a.C1385c<?>, C1382a.C1390f> f2721p;

    /* renamed from: q */
    Set<Scope> f2722q;

    /* renamed from: r */
    private final C1564e f2723r;

    /* renamed from: s */
    private final Map<C1382a<?>, Boolean> f2724s;

    /* renamed from: t */
    private final C1382a.C1383a<? extends C0607e, C0603a> f2725t;

    /* renamed from: u */
    private final C1452j f2726u;

    /* renamed from: v */
    private final ArrayList<C1425d2> f2727v;

    /* renamed from: w */
    private Integer f2728w;

    /* renamed from: x */
    Set<C1470n1> f2729x;

    /* renamed from: y */
    final C1479q1 f2730y;

    /* renamed from: z */
    private final C1574i.C1575a f2731z;

    public C1453j0(Context context, Lock lock, Looper looper, C1564e eVar, C1518c cVar, C1382a.C1383a<? extends C0607e, C0603a> aVar, Map<C1382a<?>, Boolean> map, List<C1399f.C1401b> list, List<C1399f.C1402c> list2, Map<C1382a.C1385c<?>, C1382a.C1390f> map2, int i, int i2, ArrayList<C1425d2> arrayList, boolean z) {
        Looper looper2 = looper;
        int i3 = i;
        this.f2716k = C1650d.m4577a() ? 10000 : 120000;
        this.f2717l = 5000;
        this.f2722q = new HashSet();
        this.f2726u = new C1452j();
        this.f2728w = null;
        this.f2729x = null;
        C1457k0 k0Var = new C1457k0(this);
        this.f2731z = k0Var;
        this.f2712g = context;
        this.f2707b = lock;
        this.f2708c = false;
        this.f2709d = new C1574i(looper, k0Var);
        this.f2713h = looper2;
        this.f2718m = new C1465m0(this, looper);
        this.f2719n = cVar;
        this.f2711f = i3;
        if (i3 >= 0) {
            this.f2728w = Integer.valueOf(i2);
        }
        this.f2724s = map;
        this.f2721p = map2;
        this.f2727v = arrayList;
        this.f2730y = new C1479q1(this.f2721p);
        for (C1399f.C1401b f : list) {
            this.f2709d.mo11224f(f);
        }
        for (C1399f.C1402c g : list2) {
            this.f2709d.mo11225g(g);
        }
        this.f2723r = eVar;
        this.f2725t = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m3882n() {
        this.f2707b.lock();
        try {
            if (this.f2715j) {
                m3885q();
            }
        } finally {
            this.f2707b.unlock();
        }
    }

    /* renamed from: o */
    public static int m3883o(Iterable<C1382a.C1390f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C1382a.C1390f next : iterable) {
            if (next.mo10803r()) {
                z2 = true;
            }
            if (next.mo10791c()) {
                z3 = true;
            }
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    @GuardedBy("mLock")
    /* renamed from: q */
    private final void m3885q() {
        this.f2709d.mo11220b();
        this.f2710e.connect();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m3886r() {
        this.f2707b.lock();
        try {
            if (mo10969s()) {
                m3885q();
            }
        } finally {
            this.f2707b.unlock();
        }
    }

    /* renamed from: w */
    private final void m3888w(int i) {
        Integer num = this.f2728w;
        if (num == null) {
            this.f2728w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String x = m3889x(i);
            String x2 = m3889x(this.f2728w.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(x).length() + 51 + String.valueOf(x2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(x);
            sb.append(". Mode was already set to ");
            sb.append(x2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f2710e == null) {
            boolean z = false;
            boolean z2 = false;
            for (C1382a.C1390f next : this.f2721p.values()) {
                if (next.mo10803r()) {
                    z = true;
                }
                if (next.mo10791c()) {
                    z2 = true;
                }
            }
            int intValue = this.f2728w.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    if (this.f2708c) {
                        this.f2710e = new C1459k2(this.f2712g, this.f2707b, this.f2713h, this.f2719n, this.f2721p, this.f2723r, this.f2724s, this.f2725t, this.f2727v, this, true);
                        return;
                    }
                    this.f2710e = C1436f2.m3830c(this.f2712g, this, this.f2707b, this.f2713h, this.f2719n, this.f2721p, this.f2723r, this.f2724s, this.f2725t, this.f2727v);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            if (!this.f2708c || z2) {
                this.f2710e = new C1475p0(this.f2712g, this, this.f2707b, this.f2713h, this.f2719n, this.f2721p, this.f2723r, this.f2724s, this.f2725t, this.f2727v, this);
                return;
            }
            this.f2710e = new C1459k2(this.f2712g, this.f2707b, this.f2713h, this.f2719n, this.f2721p, this.f2723r, this.f2724s, this.f2725t, this.f2727v, this, false);
        }
    }

    /* renamed from: x */
    private static String m3889x(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10941a(ConnectionResult connectionResult) {
        if (!this.f2719n.mo11059k(this.f2712g, connectionResult.mo10745Q())) {
            mo10969s();
        }
        if (!this.f2715j) {
            this.f2709d.mo11221c(connectionResult);
            this.f2709d.mo11219a();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final void mo10942b(Bundle bundle) {
        while (!this.f2714i.isEmpty()) {
            mo10968m(this.f2714i.remove());
        }
        this.f2709d.mo11222d(bundle);
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo10943c(int i, boolean z) {
        if (i == 1 && !z && !this.f2715j) {
            this.f2715j = true;
            if (this.f2720o == null && !C1650d.m4577a()) {
                this.f2720o = this.f2719n.mo11051u(this.f2712g.getApplicationContext(), new C1469n0(this));
            }
            C1465m0 m0Var = this.f2718m;
            m0Var.sendMessageDelayed(m0Var.obtainMessage(1), this.f2716k);
            C1465m0 m0Var2 = this.f2718m;
            m0Var2.sendMessageDelayed(m0Var2.obtainMessage(2), this.f2717l);
        }
        this.f2730y.mo11010c();
        this.f2709d.mo11223e(i);
        this.f2709d.mo11219a();
        if (i == 2) {
            m3885q();
        }
    }

    /* renamed from: d */
    public final void mo10825d() {
        this.f2707b.lock();
        try {
            boolean z = false;
            if (this.f2711f >= 0) {
                if (this.f2728w != null) {
                    z = true;
                }
                C1609u.m4479o(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f2728w == null) {
                this.f2728w = Integer.valueOf(m3883o(this.f2721p.values(), false));
            } else if (this.f2728w.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo10966k(this.f2728w.intValue());
        } finally {
            this.f2707b.unlock();
        }
    }

    /* renamed from: e */
    public final void mo10826e() {
        this.f2707b.lock();
        try {
            this.f2730y.mo11008a();
            if (this.f2710e != null) {
                this.f2710e.disconnect();
            }
            this.f2726u.mo10965b();
            for (C1418c cVar : this.f2714i) {
                cVar.mo10849m((C1488t1) null);
                cVar.mo10843d();
            }
            this.f2714i.clear();
            if (this.f2710e != null) {
                mo10969s();
                this.f2709d.mo11219a();
            }
        } finally {
            this.f2707b.unlock();
        }
    }

    /* renamed from: f */
    public final <A extends C1382a.C1384b, R extends C1507j, T extends C1418c<R, A>> T mo10827f(@NonNull T t) {
        C1609u.m4466b(t.mo10891u() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f2721p.containsKey(t.mo10891u());
        String b = t.mo10890t() != null ? t.mo10890t().mo10783b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b);
        sb.append(" required for this call.");
        C1609u.m4466b(containsKey, sb.toString());
        this.f2707b.lock();
        try {
            if (this.f2710e == null) {
                this.f2714i.add(t);
            } else {
                t = this.f2710e.mo10902g(t);
            }
            return t;
        } finally {
            this.f2707b.unlock();
        }
    }

    /* renamed from: g */
    public final Looper mo10828g() {
        return this.f2713h;
    }

    /* renamed from: h */
    public final boolean mo10829h() {
        C1424d1 d1Var = this.f2710e;
        return d1Var != null && d1Var.isConnected();
    }

    /* renamed from: i */
    public final void mo10830i(C1470n1 n1Var) {
        String str;
        Exception exc;
        this.f2707b.lock();
        try {
            if (this.f2729x == null) {
                str = "Attempted to remove pending transform when no transforms are registered.";
                exc = new Exception();
            } else if (!this.f2729x.remove(n1Var)) {
                str = "Failed to remove pending transform - this may lead to memory leaks!";
                exc = new Exception();
            } else {
                if (!mo10970t()) {
                    this.f2710e.mo10899d();
                }
            }
            Log.wtf("GoogleApiClientImpl", str, exc);
        } finally {
            this.f2707b.unlock();
        }
    }

    /* renamed from: k */
    public final void mo10966k(int i) {
        this.f2707b.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            C1609u.m4466b(z, sb.toString());
            m3888w(i);
            m3885q();
        } finally {
            this.f2707b.unlock();
        }
    }

    /* renamed from: l */
    public final void mo10967l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f2712g);
        printWriter.append(str).append("mResuming=").print(this.f2715j);
        printWriter.append(" mWorkQueue.size()=").print(this.f2714i.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f2730y.f2804a.size());
        C1424d1 d1Var = this.f2710e;
        if (d1Var != null) {
            d1Var.mo10897b(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: m */
    public final <A extends C1382a.C1384b, T extends C1418c<? extends C1507j, A>> T mo10968m(@NonNull T t) {
        C1609u.m4466b(t.mo10891u() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f2721p.containsKey(t.mo10891u());
        String b = t.mo10890t() != null ? t.mo10890t().mo10783b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b);
        sb.append(" required for this call.");
        C1609u.m4466b(containsKey, sb.toString());
        this.f2707b.lock();
        try {
            if (this.f2710e != null) {
                if (this.f2715j) {
                    this.f2714i.add(t);
                    while (!this.f2714i.isEmpty()) {
                        C1418c remove = this.f2714i.remove();
                        this.f2730y.mo11009b(remove);
                        remove.mo10894y(Status.RESULT_INTERNAL_ERROR);
                    }
                } else {
                    t = this.f2710e.mo10901f(t);
                }
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f2707b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    @GuardedBy("mLock")
    /* renamed from: s */
    public final boolean mo10969s() {
        if (!this.f2715j) {
            return false;
        }
        this.f2715j = false;
        this.f2718m.removeMessages(2);
        this.f2718m.removeMessages(1);
        C1416b1 b1Var = this.f2720o;
        if (b1Var != null) {
            b1Var.mo10884a();
            this.f2720o = null;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo10970t() {
        this.f2707b.lock();
        try {
            if (this.f2729x == null) {
                this.f2707b.unlock();
                return false;
            }
            boolean z = !this.f2729x.isEmpty();
            this.f2707b.unlock();
            return z;
        } catch (Throwable th) {
            this.f2707b.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final String mo10971u() {
        StringWriter stringWriter = new StringWriter();
        mo10967l("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }
}
