package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.measurement.internal.j8 */
public final class C1669j8 extends C1561b4 {

    /* renamed from: c */
    private volatile C1552a8 f2192c;

    /* renamed from: d */
    private volatile C1552a8 f2193d;
    @VisibleForTesting

    /* renamed from: e */
    protected C1552a8 f2194e;

    /* renamed from: f */
    private final Map f2195f = new ConcurrentHashMap();
    @GuardedBy("activityLock")

    /* renamed from: g */
    private Activity f2196g;
    @GuardedBy("activityLock")

    /* renamed from: h */
    private volatile boolean f2197h;

    /* renamed from: i */
    private volatile C1552a8 f2198i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1552a8 f2199j;
    @GuardedBy("activityLock")

    /* renamed from: k */
    private boolean f2200k;

    /* renamed from: l */
    private final Object f2201l = new Object();
    @GuardedBy("this")

    /* renamed from: m */
    private String f2202m;

    public C1669j8(C1717n5 n5Var) {
        super(n5Var);
    }

    @MainThread
    /* renamed from: H */
    private final C1552a8 m4319H(@NonNull Activity activity) {
        C0917i.m1419j(activity);
        C1552a8 a8Var = (C1552a8) this.f2195f.get(activity);
        if (a8Var == null) {
            C1552a8 a8Var2 = new C1552a8((String) null, mo14266u(activity.getClass(), "Activity"), this.f2143a.mo14382N().mo14679r0());
            this.f2195f.put(activity, a8Var2);
            a8Var = a8Var2;
        }
        return this.f2198i != null ? this.f2198i : a8Var;
    }

    @MainThread
    /* renamed from: o */
    private final void m4320o(Activity activity, C1552a8 a8Var, boolean z) {
        C1552a8 a8Var2;
        C1552a8 a8Var3 = a8Var;
        C1552a8 a8Var4 = this.f2192c == null ? this.f2193d : this.f2192c;
        if (a8Var3.f1924b == null) {
            a8Var2 = new C1552a8(a8Var3.f1923a, activity != null ? mo14266u(activity.getClass(), "Activity") : null, a8Var3.f1925c, a8Var3.f1927e, a8Var3.f1928f);
        } else {
            a8Var2 = a8Var3;
        }
        this.f2193d = this.f2192c;
        this.f2192c = a8Var2;
        this.f2143a.mo14227a().mo14310z(new C1591d8(this, a8Var2, a8Var4, this.f2143a.mo14229c().mo11030b(), z));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: p */
    public final void m4321p(C1552a8 a8Var, C1552a8 a8Var2, long j, boolean z, Bundle bundle) {
        Bundle bundle2;
        long j2;
        C1552a8 a8Var3 = a8Var;
        C1552a8 a8Var4 = a8Var2;
        long j3 = j;
        Bundle bundle3 = bundle;
        mo14009h();
        boolean z2 = false;
        boolean z3 = a8Var4 == null || a8Var4.f1925c != a8Var3.f1925c || !C1565b8.m4072a(a8Var4.f1924b, a8Var3.f1924b) || !C1565b8.m4072a(a8Var4.f1923a, a8Var3.f1923a);
        if (z && this.f2194e != null) {
            z2 = true;
        }
        if (z3) {
            if (bundle3 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            C1854ya.m4845y(a8Var3, bundle4, true);
            if (a8Var4 != null) {
                String str = a8Var4.f1923a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = a8Var4.f1924b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", a8Var4.f1925c);
            }
            if (z2) {
                C1841x9 x9Var = this.f2143a.mo14381M().f2837e;
                long j4 = j3 - x9Var.f2771b;
                x9Var.f2771b = j3;
                if (j4 > 0) {
                    this.f2143a.mo14382N().mo14686w(bundle4, j4);
                }
            }
            if (!this.f2143a.mo14402z().mo14165D()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = true != a8Var3.f1927e ? "auto" : "app";
            long a = this.f2143a.mo14229c().mo11029a();
            if (a8Var3.f1927e) {
                long j5 = a8Var3.f1928f;
                if (j5 != 0) {
                    j2 = j5;
                    this.f2143a.mo14377I().mo14571w(str3, "_vs", j2, bundle4);
                }
            }
            j2 = a;
            this.f2143a.mo14377I().mo14571w(str3, "_vs", j2, bundle4);
        }
        if (z2) {
            m4322q(this.f2194e, true, j3);
        }
        this.f2194e = a8Var3;
        if (a8Var3.f1927e) {
            this.f2199j = a8Var3;
        }
        this.f2143a.mo14380L().mo14286u(a8Var3);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: q */
    public final void m4322q(C1552a8 a8Var, boolean z, long j) {
        this.f2143a.mo14401y().mo14692n(this.f2143a.mo14229c().mo11030b());
        if (this.f2143a.mo14381M().f2837e.mo14634d(a8Var != null && a8Var.f1926d, z, j) && a8Var != null) {
            a8Var.f1926d = false;
        }
    }

    /* renamed from: x */
    static /* bridge */ /* synthetic */ void m4326x(C1669j8 j8Var, Bundle bundle, C1552a8 a8Var, C1552a8 a8Var2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        j8Var.m4321p(a8Var, a8Var2, j, true, j8Var.f2143a.mo14382N().mo14685v0((String) null, "screen_view", bundle, (List) null, false));
    }

    @MainThread
    /* renamed from: A */
    public final void mo14257A(Activity activity) {
        synchronized (this.f2201l) {
            if (activity == this.f2196g) {
                this.f2196g = null;
            }
        }
        if (this.f2143a.mo14402z().mo14165D()) {
            this.f2195f.remove(activity);
        }
    }

    @MainThread
    /* renamed from: B */
    public final void mo14258B(Activity activity) {
        synchronized (this.f2201l) {
            this.f2200k = false;
            this.f2197h = true;
        }
        long b = this.f2143a.mo14229c().mo11030b();
        if (!this.f2143a.mo14402z().mo14165D()) {
            this.f2192c = null;
            this.f2143a.mo14227a().mo14310z(new C1630g8(this, b));
            return;
        }
        C1552a8 H = m4319H(activity);
        this.f2193d = this.f2192c;
        this.f2192c = null;
        this.f2143a.mo14227a().mo14310z(new C1643h8(this, H, b));
    }

    @MainThread
    /* renamed from: C */
    public final void mo14259C(Activity activity) {
        synchronized (this.f2201l) {
            this.f2200k = true;
            if (activity != this.f2196g) {
                synchronized (this.f2201l) {
                    this.f2196g = activity;
                    this.f2197h = false;
                }
                if (this.f2143a.mo14402z().mo14165D()) {
                    this.f2198i = null;
                    this.f2143a.mo14227a().mo14310z(new C1656i8(this));
                }
            }
        }
        if (!this.f2143a.mo14402z().mo14165D()) {
            this.f2192c = this.f2198i;
            this.f2143a.mo14227a().mo14310z(new C1617f8(this));
            return;
        }
        m4320o(activity, m4319H(activity), false);
        C1857z1 y = this.f2143a.mo14401y();
        y.f2143a.mo14227a().mo14310z(new C1844y0(y, y.f2143a.mo14229c().mo11030b()));
    }

    @MainThread
    /* renamed from: D */
    public final void mo14260D(Activity activity, Bundle bundle) {
        C1552a8 a8Var;
        if (this.f2143a.mo14402z().mo14165D() && bundle != null && (a8Var = (C1552a8) this.f2195f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", a8Var.f1925c);
            bundle2.putString("name", a8Var.f1923a);
            bundle2.putString("referrer_name", a8Var.f1924b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r5.length() <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r6.length() <= 100) goto L_0x00cf;
     */
    @java.lang.Deprecated
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14261E(@androidx.annotation.NonNull android.app.Activity r4, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r5, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.n5 r0 = r3.f2143a
            com.google.android.gms.measurement.internal.g r0 = r0.mo14402z()
            boolean r0 = r0.mo14165D()
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.measurement.internal.n5 r4 = r3.f2143a
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14041x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.mo14693a(r5)
            return
        L_0x001c:
            com.google.android.gms.measurement.internal.a8 r0 = r3.f2192c
            if (r0 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.n5 r4 = r3.f2143a
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14041x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.mo14693a(r5)
            return
        L_0x0030:
            java.util.Map r1 = r3.f2195f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.measurement.internal.n5 r4 = r3.f2143a
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14041x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.mo14693a(r5)
            return
        L_0x0048:
            if (r6 != 0) goto L_0x0054
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.mo14266u(r6, r1)
        L_0x0054:
            java.lang.String r1 = r0.f1924b
            boolean r1 = com.google.android.gms.measurement.internal.C1565b8.m4072a(r1, r6)
            java.lang.String r0 = r0.f1923a
            boolean r0 = com.google.android.gms.measurement.internal.C1565b8.m4072a(r0, r5)
            if (r1 == 0) goto L_0x0075
            if (r0 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            com.google.android.gms.measurement.internal.n5 r4 = r3.f2143a
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14041x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.mo14693a(r5)
            return
        L_0x0075:
            r0 = 100
            if (r5 == 0) goto L_0x00a3
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x008b
            com.google.android.gms.measurement.internal.n5 r1 = r3.f2143a
            r1.mo14402z()
            int r1 = r5.length()
            if (r1 > r0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            com.google.android.gms.measurement.internal.n5 r4 = r3.f2143a
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14041x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.mo14694b(r6, r5)
            return
        L_0x00a3:
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x00b7
            com.google.android.gms.measurement.internal.n5 r1 = r3.f2143a
            r1.mo14402z()
            int r1 = r6.length()
            if (r1 > r0) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            com.google.android.gms.measurement.internal.n5 r4 = r3.f2143a
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14041x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.mo14694b(r6, r5)
            return
        L_0x00cf:
            com.google.android.gms.measurement.internal.n5 r0 = r3.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14039v()
            if (r5 != 0) goto L_0x00de
            java.lang.String r1 = "null"
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.mo14695c(r2, r1, r6)
            com.google.android.gms.measurement.internal.a8 r0 = new com.google.android.gms.measurement.internal.a8
            com.google.android.gms.measurement.internal.n5 r1 = r3.f2143a
            com.google.android.gms.measurement.internal.ya r1 = r1.mo14382N()
            long r1 = r1.mo14679r0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f2195f
            r5.put(r4, r0)
            r5 = 1
            r3.m4320o(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1669j8.mo14261E(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 > 100) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r4 > 100) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r0 = r12.f2143a.mo14228b().mo14039v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r3 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        if (r4 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0.mo14695c("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r12.f2192c != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = r12.f2193d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r0 = r12.f2192c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r2 = new com.google.android.gms.measurement.internal.C1552a8(r3, r4, r12.f2143a.mo14382N().mo14679r0(), true, r14);
        r12.f2192c = r2;
        r12.f2193d = r0;
        r12.f2198i = r2;
        r12.f2143a.mo14227a().mo14310z(new com.google.android.gms.measurement.internal.C1578c8(r12, r13, r2, r0, r12.f2143a.mo14229c().mo11030b()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        return;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14262F(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f2201l
            monitor-enter(r0)
            boolean r1 = r12.f2200k     // Catch:{ all -> 0x011b }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.measurement.internal.n5 r13 = r12.f2143a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.c4 r13 = r13.mo14228b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.z3 r13 = r13.mo14041x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.mo14693a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x0018:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x011b }
            r1 = 100
            if (r3 == 0) goto L_0x004c
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            if (r2 <= 0) goto L_0x0033
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.n5 r4 = r12.f2143a     // Catch:{ all -> 0x011b }
            r4.mo14402z()     // Catch:{ all -> 0x011b }
            if (r2 <= r1) goto L_0x004c
        L_0x0033:
            com.google.android.gms.measurement.internal.n5 r13 = r12.f2143a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.c4 r13 = r13.mo14228b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.z3 r13 = r13.mo14041x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo14694b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x004c:
            java.lang.String r2 = "screen_class"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x007e
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            if (r4 <= 0) goto L_0x0065
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.n5 r5 = r12.f2143a     // Catch:{ all -> 0x011b }
            r5.mo14402z()     // Catch:{ all -> 0x011b }
            if (r4 <= r1) goto L_0x007e
        L_0x0065:
            com.google.android.gms.measurement.internal.n5 r13 = r12.f2143a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.c4 r13 = r13.mo14228b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.z3 r13 = r13.mo14041x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo14694b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x007e:
            if (r2 != 0) goto L_0x0093
            android.app.Activity r1 = r12.f2196g     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x008f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.mo14266u(r1, r2)     // Catch:{ all -> 0x011b }
            goto L_0x0091
        L_0x008f:
            java.lang.String r1 = "Activity"
        L_0x0091:
            r4 = r1
            goto L_0x0094
        L_0x0093:
            r4 = r2
        L_0x0094:
            com.google.android.gms.measurement.internal.a8 r1 = r12.f2192c     // Catch:{ all -> 0x011b }
            boolean r2 = r12.f2197h     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r2 = 0
            r12.f2197h = r2     // Catch:{ all -> 0x011b }
            java.lang.String r2 = r1.f1924b     // Catch:{ all -> 0x011b }
            boolean r2 = com.google.android.gms.measurement.internal.C1565b8.m4072a(r2, r4)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f1923a     // Catch:{ all -> 0x011b }
            boolean r1 = com.google.android.gms.measurement.internal.C1565b8.m4072a(r1, r3)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.n5 r13 = r12.f2143a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.c4 r13 = r13.mo14228b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.z3 r13 = r13.mo14041x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.mo14693a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.n5 r0 = r12.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14039v()
            if (r3 != 0) goto L_0x00d0
            java.lang.String r1 = "null"
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            if (r4 != 0) goto L_0x00d6
            java.lang.String r2 = "null"
            goto L_0x00d7
        L_0x00d6:
            r2 = r4
        L_0x00d7:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.mo14695c(r5, r1, r2)
            com.google.android.gms.measurement.internal.a8 r0 = r12.f2192c
            if (r0 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.a8 r0 = r12.f2193d
            goto L_0x00e5
        L_0x00e3:
            com.google.android.gms.measurement.internal.a8 r0 = r12.f2192c
        L_0x00e5:
            com.google.android.gms.measurement.internal.a8 r1 = new com.google.android.gms.measurement.internal.a8
            com.google.android.gms.measurement.internal.n5 r2 = r12.f2143a
            com.google.android.gms.measurement.internal.ya r2 = r2.mo14382N()
            long r5 = r2.mo14679r0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f2192c = r1
            r12.f2193d = r0
            r12.f2198i = r1
            com.google.android.gms.measurement.internal.n5 r14 = r12.f2143a
            c0.e r14 = r14.mo14229c()
            long r10 = r14.mo11030b()
            com.google.android.gms.measurement.internal.n5 r14 = r12.f2143a
            com.google.android.gms.measurement.internal.k5 r14 = r14.mo14227a()
            com.google.android.gms.measurement.internal.c8 r15 = new com.google.android.gms.measurement.internal.c8
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo14310z(r15)
            return
        L_0x011b:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1669j8.mo14262F(android.os.Bundle, long):void");
    }

    @WorkerThread
    /* renamed from: G */
    public final void mo14263G(String str, C1552a8 a8Var) {
        mo14009h();
        synchronized (this) {
            String str2 = this.f2202m;
            if (str2 == null || str2.equals(str) || a8Var != null) {
                this.f2202m = str;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo14025n() {
        return false;
    }

    /* renamed from: s */
    public final C1552a8 mo14264s() {
        return this.f2192c;
    }

    @WorkerThread
    /* renamed from: t */
    public final C1552a8 mo14265t(boolean z) {
        mo14020i();
        mo14009h();
        if (!z) {
            return this.f2194e;
        }
        C1552a8 a8Var = this.f2194e;
        return a8Var != null ? a8Var : this.f2199j;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: u */
    public final String mo14266u(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f2143a.mo14402z();
        if (length2 <= 100) {
            return str2;
        }
        this.f2143a.mo14402z();
        return str2.substring(0, 100);
    }

    @MainThread
    /* renamed from: z */
    public final void mo14267z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f2143a.mo14402z().mo14165D() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f2195f.put(activity, new C1552a8(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }
}
