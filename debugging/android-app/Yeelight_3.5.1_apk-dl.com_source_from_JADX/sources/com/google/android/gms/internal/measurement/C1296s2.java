package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C1627g5;
import com.google.android.gms.measurement.internal.C1863z7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p014c0.C0616e;
import p014c0.C0619h;
import p048j0.C3262a;

/* renamed from: com.google.android.gms.internal.measurement.s2 */
public final class C1296s2 {

    /* renamed from: i */
    private static volatile C1296s2 f1586i;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f1587a;

    /* renamed from: b */
    protected final C0616e f1588b;

    /* renamed from: c */
    protected final ExecutorService f1589c;

    /* renamed from: d */
    private final C3262a f1590d;
    @GuardedBy("listenerList")

    /* renamed from: e */
    private final List f1591e;

    /* renamed from: f */
    private int f1592f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f1593g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile C1071e1 f1594h;

    protected C1296s2(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f1587a = (str == null || !m2740l(str2, str3)) ? "FA" : str;
        this.f1588b = C0619h.m208d();
        C1385y0.m3291a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1040c2(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f1589c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f1590d = new C3262a(this);
        this.f1591e = new ArrayList();
        try {
            if (C1863z7.m4908b(context, "google_app_id", C1627g5.m4241a(context)) != null && !m2736h()) {
                this.f1593g = true;
                return;
            }
        } catch (IllegalStateException unused) {
        }
        boolean l = m2740l(str2, str3);
        m2739k(new C1295s1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new C1280r2(this));
        }
    }

    /* renamed from: h */
    protected static final boolean m2736h() {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m2737i(Exception exc, boolean z, boolean z2) {
        this.f1593g |= z;
        if (!z && z2) {
            mo13259a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
    }

    /* renamed from: j */
    private final void m2738j(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m2739k(new C1104g2(this, l, str, str2, bundle, z, z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m2739k(C1120h2 h2Var) {
        this.f1589c.execute(h2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final boolean m2740l(String str, String str2) {
        return (str2 == null || str == null || m2736h()) ? false : true;
    }

    /* renamed from: r */
    public static C1296s2 m2742r(Context context, String str, String str2, String str3, Bundle bundle) {
        C0917i.m1419j(context);
        if (f1586i == null) {
            synchronized (C1296s2.class) {
                if (f1586i == null) {
                    f1586i = new C1296s2(context, str, str2, str3, bundle);
                }
            }
        }
        return f1586i;
    }

    /* renamed from: C */
    public final void mo13254C(String str) {
        m2739k(new C1311t1(this, str));
    }

    /* renamed from: D */
    public final void mo13255D(String str, String str2, Bundle bundle) {
        m2739k(new C1247p1(this, str, str2, bundle));
    }

    /* renamed from: E */
    public final void mo13256E(String str) {
        m2739k(new C1326u1(this, str));
    }

    /* renamed from: F */
    public final void mo13257F(@NonNull String str, Bundle bundle) {
        m2738j((String) null, str, bundle, false, true, (Long) null);
    }

    /* renamed from: G */
    public final void mo13258G(String str, String str2, Bundle bundle) {
        m2738j(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: a */
    public final void mo13259a(int i, String str, Object obj, Object obj2, Object obj3) {
        m2739k(new C1024b2(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4.f1594h == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f1594h.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        m2739k(new com.google.android.gms.internal.measurement.C1088f2(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13260b(com.google.android.gms.measurement.internal.C1742p6 r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.C0917i.m1419j(r5)
            java.util.List r0 = r4.f1591e
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List r2 = r4.f1591e     // Catch:{ all -> 0x0047 }
            int r2 = r2.size()     // Catch:{ all -> 0x0047 }
            if (r1 >= r2) goto L_0x0024
            java.util.List r2 = r4.f1591e     // Catch:{ all -> 0x0047 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0047 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0047 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0047 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x0021:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0024:
            com.google.android.gms.internal.measurement.i2 r1 = new com.google.android.gms.internal.measurement.i2     // Catch:{ all -> 0x0047 }
            r1.<init>(r5)     // Catch:{ all -> 0x0047 }
            java.util.List r2 = r4.f1591e     // Catch:{ all -> 0x0047 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0047 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0047 }
            r2.add(r3)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.measurement.e1 r5 = r4.f1594h
            if (r5 == 0) goto L_0x003e
            com.google.android.gms.internal.measurement.e1 r5 = r4.f1594h     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x003e }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x003e }
            return
        L_0x003e:
            com.google.android.gms.internal.measurement.f2 r5 = new com.google.android.gms.internal.measurement.f2
            r5.<init>(r4, r1)
            r4.m2739k(r5)
            return
        L_0x0047:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x004b
        L_0x004a:
            throw r5
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1296s2.mo13260b(com.google.android.gms.measurement.internal.p6):void");
    }

    /* renamed from: c */
    public final void mo13261c(Bundle bundle) {
        m2739k(new C1231o1(this, bundle));
    }

    /* renamed from: d */
    public final void mo13262d(Activity activity, String str, String str2) {
        m2739k(new C1279r1(this, activity, str, str2));
    }

    /* renamed from: e */
    public final void mo13263e(boolean z) {
        m2739k(new C1072e2(this, z));
    }

    /* renamed from: m */
    public final int mo13264m(String str) {
        C1007a1 a1Var = new C1007a1();
        m2739k(new C1056d2(this, str, a1Var));
        Integer num = (Integer) C1007a1.m1667T(a1Var.mo12513e(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: n */
    public final long mo13265n() {
        C1007a1 a1Var = new C1007a1();
        m2739k(new C1371x1(this, a1Var));
        Long l = (Long) C1007a1.m1667T(a1Var.mo12513e(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f1588b.mo11029a()).nextLong();
        int i = this.f1592f + 1;
        this.f1592f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: o */
    public final C3262a mo13266o() {
        return this.f1590d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C1071e1 mo13267q(Context context, boolean z) {
        try {
            return C1055d1.asInterface(DynamiteModule.m1606d(context, DynamiteModule.f1193b, ModuleDescriptor.MODULE_ID).mo12441c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            m2737i(e, true, false);
            return null;
        }
    }

    /* renamed from: t */
    public final String mo13268t() {
        C1007a1 a1Var = new C1007a1();
        m2739k(new C1356w1(this, a1Var));
        return a1Var.mo12514f(50);
    }

    /* renamed from: u */
    public final String mo13269u() {
        C1007a1 a1Var = new C1007a1();
        m2739k(new C1401z1(this, a1Var));
        return a1Var.mo12514f(500);
    }

    /* renamed from: v */
    public final String mo13270v() {
        C1007a1 a1Var = new C1007a1();
        m2739k(new C1386y1(this, a1Var));
        return a1Var.mo12514f(500);
    }

    /* renamed from: w */
    public final String mo13271w() {
        C1007a1 a1Var = new C1007a1();
        m2739k(new C1341v1(this, a1Var));
        return a1Var.mo12514f(500);
    }

    /* renamed from: x */
    public final List mo13272x(String str, String str2) {
        C1007a1 a1Var = new C1007a1();
        m2739k(new C1263q1(this, str, str2, a1Var));
        List list = (List) C1007a1.m1667T(a1Var.mo12513e(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: y */
    public final Map mo13273y(String str, String str2, boolean z) {
        C1007a1 a1Var = new C1007a1();
        m2739k(new C1008a2(this, str, str2, z, a1Var));
        Bundle e = a1Var.mo12513e(5000);
        if (e == null || e.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(e.size());
        for (String str3 : e.keySet()) {
            Object obj = e.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }
}
