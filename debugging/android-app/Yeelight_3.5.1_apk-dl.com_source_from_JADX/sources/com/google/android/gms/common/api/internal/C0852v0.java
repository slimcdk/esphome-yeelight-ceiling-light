package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0721a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.api.C0744h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0904d;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.C0923n;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p014c0.C0615d;
import p109w.C3858r;

/* renamed from: com.google.android.gms.common.api.internal.v0 */
public final class C0852v0 extends C0736d implements C0828p1 {

    /* renamed from: b */
    private final Lock f809b;

    /* renamed from: c */
    private final C0923n f810c;
    @Nullable

    /* renamed from: d */
    private C0836r1 f811d = null;

    /* renamed from: e */
    private final int f812e;

    /* renamed from: f */
    private final Context f813f;

    /* renamed from: g */
    private final Looper f814g;
    @VisibleForTesting

    /* renamed from: h */
    final Queue f815h = new LinkedList();

    /* renamed from: i */
    private volatile boolean f816i;

    /* renamed from: j */
    private long f817j;

    /* renamed from: k */
    private long f818k;

    /* renamed from: l */
    private final C0844t0 f819l;

    /* renamed from: m */
    private final C0721a f820m;
    @Nullable
    @VisibleForTesting

    /* renamed from: n */
    C0823o1 f821n;

    /* renamed from: o */
    final Map f822o;

    /* renamed from: p */
    Set f823p;

    /* renamed from: q */
    final C0904d f824q;

    /* renamed from: r */
    final Map f825r;

    /* renamed from: s */
    final C0722a.C0723a f826s;

    /* renamed from: t */
    private final C0800k f827t;

    /* renamed from: u */
    private final ArrayList f828u;

    /* renamed from: v */
    private Integer f829v;
    @Nullable

    /* renamed from: w */
    Set f830w;

    /* renamed from: x */
    final C0833q2 f831x;

    /* renamed from: y */
    private final C3858r f832y;

    public C0852v0(Context context, Lock lock, Looper looper, C0904d dVar, C0721a aVar, C0722a.C0723a aVar2, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        Looper looper2 = looper;
        int i3 = i;
        this.f817j = true != C0615d.m200a() ? 120000 : 10000;
        this.f818k = 5000;
        this.f823p = new HashSet();
        this.f827t = new C0800k();
        this.f829v = null;
        this.f830w = null;
        C0840s0 s0Var = new C0840s0(this);
        this.f832y = s0Var;
        this.f813f = context;
        this.f809b = lock;
        this.f810c = new C0923n(looper, s0Var);
        this.f814g = looper2;
        this.f819l = new C0844t0(this, looper);
        this.f820m = aVar;
        this.f812e = i3;
        if (i3 >= 0) {
            this.f829v = Integer.valueOf(i2);
        }
        this.f825r = map;
        this.f822o = map2;
        this.f828u = arrayList;
        this.f831x = new C0833q2();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f810c.mo12291f((C0736d.C0738b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f810c.mo12292g((C0736d.C0739c) it2.next());
        }
        this.f824q = dVar;
        this.f826s = aVar2;
    }

    /* renamed from: o */
    public static int m1115o(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            C0722a.C0730f fVar = (C0722a.C0730f) it.next();
            z2 |= fVar.mo11845q();
            z3 |= fVar.mo11829a();
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    /* renamed from: q */
    static String m1116q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: r */
    static /* bridge */ /* synthetic */ void m1117r(C0852v0 v0Var) {
        v0Var.f809b.lock();
        try {
            if (v0Var.f816i) {
                v0Var.m1120v();
            }
        } finally {
            v0Var.f809b.unlock();
        }
    }

    /* renamed from: s */
    static /* bridge */ /* synthetic */ void m1118s(C0852v0 v0Var) {
        v0Var.f809b.lock();
        try {
            if (v0Var.mo12085t()) {
                v0Var.m1120v();
            }
        } finally {
            v0Var.f809b.unlock();
        }
    }

    /* JADX WARNING: type inference failed for: r13v11, types: [com.google.android.gms.common.api.internal.u] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1119u(int r13) {
        /*
            r12 = this;
            java.lang.Integer r0 = r12.f829v
            if (r0 != 0) goto L_0x000b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.f829v = r13
            goto L_0x0011
        L_0x000b:
            int r0 = r0.intValue()
            if (r0 != r13) goto L_0x0091
        L_0x0011:
            com.google.android.gms.common.api.internal.r1 r13 = r12.f811d
            if (r13 == 0) goto L_0x0016
            return
        L_0x0016:
            java.util.Map r13 = r12.f822o
            java.util.Collection r13 = r13.values()
            java.util.Iterator r13 = r13.iterator()
            r0 = 0
            r1 = 0
        L_0x0022:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r13.next()
            com.google.android.gms.common.api.a$f r2 = (com.google.android.gms.common.api.C0722a.C0730f) r2
            boolean r3 = r2.mo11845q()
            r0 = r0 | r3
            boolean r2 = r2.mo11829a()
            r1 = r1 | r2
            goto L_0x0022
        L_0x0039:
            java.lang.Integer r13 = r12.f829v
            int r13 = r13.intValue()
            r2 = 1
            if (r13 == r2) goto L_0x0062
            r1 = 2
            if (r13 == r1) goto L_0x0046
            goto L_0x0066
        L_0x0046:
            if (r0 == 0) goto L_0x0066
            android.content.Context r2 = r12.f813f
            java.util.concurrent.locks.Lock r4 = r12.f809b
            android.os.Looper r5 = r12.f814g
            com.google.android.gms.common.a r6 = r12.f820m
            java.util.Map r7 = r12.f822o
            com.google.android.gms.common.internal.d r8 = r12.f824q
            java.util.Map r9 = r12.f825r
            com.google.android.gms.common.api.a$a r10 = r12.f826s
            java.util.ArrayList r11 = r12.f828u
            r3 = r12
            com.google.android.gms.common.api.internal.u r13 = com.google.android.gms.common.api.internal.C0847u.m1090n(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x005f:
            r12.f811d = r13
            return
        L_0x0062:
            if (r0 == 0) goto L_0x0089
            if (r1 != 0) goto L_0x0081
        L_0x0066:
            com.google.android.gms.common.api.internal.z0 r13 = new com.google.android.gms.common.api.internal.z0
            android.content.Context r1 = r12.f813f
            java.util.concurrent.locks.Lock r3 = r12.f809b
            android.os.Looper r4 = r12.f814g
            com.google.android.gms.common.a r5 = r12.f820m
            java.util.Map r6 = r12.f822o
            com.google.android.gms.common.internal.d r7 = r12.f824q
            java.util.Map r8 = r12.f825r
            com.google.android.gms.common.api.a$a r9 = r12.f826s
            java.util.ArrayList r10 = r12.f828u
            r0 = r13
            r2 = r12
            r11 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x005f
        L_0x0081:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            r13.<init>(r0)
            throw r13
        L_0x0089:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            r13.<init>(r0)
            throw r13
        L_0x0091:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Integer r1 = r12.f829v
            int r1 = r1.intValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot use sign-in mode: "
            r2.append(r3)
            java.lang.String r13 = m1116q(r13)
            r2.append(r13)
            java.lang.String r13 = ". Mode was already set to "
            r2.append(r13)
            java.lang.String r13 = m1116q(r1)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r0.<init>(r13)
            goto L_0x00bf
        L_0x00be:
            throw r0
        L_0x00bf:
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0852v0.m1119u(int):void");
    }

    @GuardedBy("mLock")
    /* renamed from: v */
    private final void m1120v() {
        this.f810c.mo12287b();
        ((C0836r1) C0917i.m1419j(this.f811d)).mo12064a();
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo12018a(@Nullable Bundle bundle) {
        while (!this.f815h.isEmpty()) {
            mo11864h((C0763d) this.f815h.remove());
        }
        this.f810c.mo12289d(bundle);
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final void mo12019b(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.f816i) {
                this.f816i = true;
                if (this.f821n == null && !C0615d.m200a()) {
                    try {
                        this.f821n = this.f820m.mo11782u(this.f813f.getApplicationContext(), new C0848u0(this));
                    } catch (SecurityException unused) {
                    }
                }
                C0844t0 t0Var = this.f819l;
                t0Var.sendMessageDelayed(t0Var.obtainMessage(1), this.f817j);
                C0844t0 t0Var2 = this.f819l;
                t0Var2.sendMessageDelayed(t0Var2.obtainMessage(2), this.f818k);
            }
            i = 1;
        }
        for (BasePendingResult f : (BasePendingResult[]) this.f831x.f763a.toArray(new BasePendingResult[0])) {
            f.mo11882f(C0833q2.f762c);
        }
        this.f810c.mo12290e(i);
        this.f810c.mo12286a();
        if (i == 2) {
            m1120v();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo12020c(ConnectionResult connectionResult) {
        if (!this.f820m.mo12122k(this.f813f, connectionResult.mo11751V())) {
            mo12085t();
        }
        if (!this.f816i) {
            this.f810c.mo12288c(connectionResult);
            this.f810c.mo12286a();
        }
    }

    /* renamed from: d */
    public final void mo11860d() {
        this.f809b.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.f812e >= 0) {
                C0917i.m1424o(this.f829v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f829v;
                if (num == null) {
                    this.f829v = Integer.valueOf(m1115o(this.f822o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) C0917i.m1419j(this.f829v)).intValue();
            this.f809b.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                C0917i.m1411b(z, "Illegal sign-in mode: " + i);
                m1119u(i);
                m1120v();
            }
            z = true;
            C0917i.m1411b(z, "Illegal sign-in mode: " + i);
            m1119u(i);
            m1120v();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f809b.unlock();
        }
    }

    /* renamed from: e */
    public final void mo11861e() {
        this.f809b.lock();
        try {
            this.f831x.mo12063b();
            C0836r1 r1Var = this.f811d;
            if (r1Var != null) {
                r1Var.mo12069h();
            }
            this.f827t.mo12021b();
            for (C0763d dVar : this.f815h) {
                dVar.mo11888p((C0829p2) null);
                dVar.mo11880d();
            }
            this.f815h.clear();
            if (this.f811d != null) {
                mo12085t();
                this.f810c.mo12286a();
            }
        } finally {
            this.f809b.unlock();
        }
    }

    /* renamed from: f */
    public final void mo11862f(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f813f);
        printWriter.append(str).append("mResuming=").print(this.f816i);
        printWriter.append(" mWorkQueue.size()=").print(this.f815h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f831x.f763a.size());
        C0836r1 r1Var = this.f811d;
        if (r1Var != null) {
            r1Var.mo12070i(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: g */
    public final <A extends C0722a.C0724b, R extends C0744h, T extends C0763d<R, A>> T mo11863g(@NonNull T t) {
        C0722a<?> r = t.mo11930r();
        boolean containsKey = this.f822o.containsKey(t.mo11931s());
        String d = r != null ? r.mo11822d() : "the API";
        C0917i.m1411b(containsKey, "GoogleApiClient is not configured to use " + d + " required for this call.");
        this.f809b.lock();
        try {
            C0836r1 r1Var = this.f811d;
            if (r1Var == null) {
                this.f815h.add(t);
            } else {
                t = r1Var.mo12065b(t);
            }
            return t;
        } finally {
            this.f809b.unlock();
        }
    }

    /* renamed from: h */
    public final <A extends C0722a.C0724b, T extends C0763d<? extends C0744h, A>> T mo11864h(@NonNull T t) {
        C0722a<?> r = t.mo11930r();
        boolean containsKey = this.f822o.containsKey(t.mo11931s());
        String d = r != null ? r.mo11822d() : "the API";
        C0917i.m1411b(containsKey, "GoogleApiClient is not configured to use " + d + " required for this call.");
        this.f809b.lock();
        try {
            C0836r1 r1Var = this.f811d;
            if (r1Var != null) {
                if (this.f816i) {
                    this.f815h.add(t);
                    while (!this.f815h.isEmpty()) {
                        C0763d dVar = (C0763d) this.f815h.remove();
                        this.f831x.mo12062a(dVar);
                        dVar.mo11934w(Status.RESULT_INTERNAL_ERROR);
                    }
                } else {
                    t = r1Var.mo12067e(t);
                }
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f809b.unlock();
        }
    }

    /* renamed from: i */
    public final Looper mo11865i() {
        return this.f814g;
    }

    /* renamed from: j */
    public final boolean mo11866j() {
        C0836r1 r1Var = this.f811d;
        return r1Var != null && r1Var.mo12066d();
    }

    /* renamed from: k */
    public final void mo11867k(@NonNull C0736d.C0739c cVar) {
        this.f810c.mo12292g(cVar);
    }

    /* renamed from: l */
    public final void mo11868l(@NonNull C0736d.C0739c cVar) {
        this.f810c.mo12293h(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (r3 == false) goto L_0x0040;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11869m(com.google.android.gms.common.api.internal.C0824o2 r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f809b
            r0.lock()
            java.util.Set r0 = r2.f830w     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L_0x0016
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
        L_0x0012:
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0054 }
            goto L_0x0047
        L_0x0016:
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0024
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            goto L_0x0012
        L_0x0024:
            java.util.concurrent.locks.Lock r3 = r2.f809b     // Catch:{ all -> 0x0054 }
            r3.lock()     // Catch:{ all -> 0x0054 }
            java.util.Set r3 = r2.f830w     // Catch:{ all -> 0x004d }
            if (r3 != 0) goto L_0x0033
            java.util.concurrent.locks.Lock r3 = r2.f809b     // Catch:{ all -> 0x0054 }
            r3.unlock()     // Catch:{ all -> 0x0054 }
            goto L_0x0040
        L_0x0033:
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x004d }
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.f809b     // Catch:{ all -> 0x0054 }
            r0.unlock()     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0047
        L_0x0040:
            com.google.android.gms.common.api.internal.r1 r3 = r2.f811d     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0047
            r3.mo12068g()     // Catch:{ all -> 0x0054 }
        L_0x0047:
            java.util.concurrent.locks.Lock r3 = r2.f809b
            r3.unlock()
            return
        L_0x004d:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f809b     // Catch:{ all -> 0x0054 }
            r0.unlock()     // Catch:{ all -> 0x0054 }
            throw r3     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f809b
            r0.unlock()
            goto L_0x005c
        L_0x005b:
            throw r3
        L_0x005c:
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0852v0.mo11869m(com.google.android.gms.common.api.internal.o2):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final String mo12084p() {
        StringWriter stringWriter = new StringWriter();
        mo11862f("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    /* access modifiers changed from: package-private */
    @GuardedBy("mLock")
    /* renamed from: t */
    public final boolean mo12085t() {
        if (!this.f816i) {
            return false;
        }
        this.f816i = false;
        this.f819l.removeMessages(2);
        this.f819l.removeMessages(1);
        C0823o1 o1Var = this.f821n;
        if (o1Var != null) {
            o1Var.mo12053b();
            this.f821n = null;
        }
        return true;
    }
}
