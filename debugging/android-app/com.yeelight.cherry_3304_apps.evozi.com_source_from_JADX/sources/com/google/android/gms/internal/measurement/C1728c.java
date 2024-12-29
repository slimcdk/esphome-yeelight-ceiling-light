package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.C1613w;
import com.google.android.gms.common.p105j.C1620c;
import com.google.android.gms.common.util.C1651e;
import com.google.android.gms.common.util.C1654h;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C2172f6;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.measurement.c */
public class C1728c {

    /* renamed from: h */
    private static volatile C1728c f3265h = null;

    /* renamed from: i */
    private static Boolean f3266i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static Boolean f3267j = null;

    /* renamed from: k */
    private static boolean f3268k = false;

    /* renamed from: l */
    private static Boolean f3269l = null;
    @VisibleForTesting

    /* renamed from: m */
    private static String f3270m = "use_dynamite_api";
    @VisibleForTesting

    /* renamed from: n */
    private static String f3271n = "allow_remote_dynamite";

    /* renamed from: o */
    private static boolean f3272o = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f3273a;

    /* renamed from: b */
    protected final C1651e f3274b;

    /* renamed from: c */
    private final ExecutorService f3275c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<Pair<C2172f6, C1730b>> f3276d;

    /* renamed from: e */
    private int f3277e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f3278f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1977rc f3279g;

    /* renamed from: com.google.android.gms.internal.measurement.c$a */
    abstract class C1729a implements Runnable {

        /* renamed from: a */
        final long f3280a;

        /* renamed from: b */
        final long f3281b;

        /* renamed from: c */
        private final boolean f3282c;

        C1729a(C1728c cVar) {
            this(true);
        }

        C1729a(boolean z) {
            this.f3280a = C1728c.this.f3274b.mo11378a();
            this.f3281b = C1728c.this.f3274b.mo11379b();
            this.f3282c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo11412b();

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo11538c() {
        }

        public void run() {
            if (C1728c.this.f3278f) {
                mo11538c();
                return;
            }
            try {
                mo11412b();
            } catch (Exception e) {
                C1728c.this.m4910n(e, false, this.f3282c);
                mo11538c();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.c$b */
    static class C1730b extends C2054wc {

        /* renamed from: a */
        private final C2172f6 f3284a;

        C1730b(C2172f6 f6Var) {
            this.f3284a = f6Var;
        }

        /* renamed from: C */
        public final int mo11540C() {
            return System.identityHashCode(this.f3284a);
        }

        /* renamed from: p0 */
        public final void mo11541p0(String str, String str2, Bundle bundle, long j) {
            this.f3284a.mo12401a(str, str2, bundle, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.c$c */
    class C1731c implements Application.ActivityLifecycleCallbacks {
        C1731c() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C1728c.this.m4907j(new C2055x(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            C1728c.this.m4907j(new C1732c0(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            C1728c.this.m4907j(new C1714b0(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            C1728c.this.m4907j(new C2070y(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C1947pc pcVar = new C1947pc();
            C1728c.this.m4907j(new C1746d0(this, activity, pcVar));
            Bundle f = pcVar.mo11950f(50);
            if (f != null) {
                bundle.putAll(f);
            }
        }

        public final void onActivityStarted(Activity activity) {
            C1728c.this.m4907j(new C2087z(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            C1728c.this.m4907j(new C1699a0(this, activity));
        }
    }

    private C1728c(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f3273a = (str == null || !m4893E(str2, str3)) ? "FA" : str;
        this.f3274b = C1654h.m4587d();
        this.f3275c = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        boolean z = false;
        if (!(!m4897M(context) || m4902S())) {
            this.f3278f = true;
            return;
        }
        if (!m4893E(str2, str3) && (str2 == null || str3 == null)) {
            boolean z2 = (str2 == null) ^ (str3 == null ? true : z);
        }
        m4907j(new C1774f(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new C1731c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static boolean m4893E(String str, String str2) {
        return (str2 == null || str == null || m4902S()) ? false : true;
    }

    /* renamed from: M */
    private static boolean m4897M(Context context) {
        try {
            return new C1613w(context).mo11290a("google_app_id") != null;
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static int m4898N(Context context) {
        return DynamiteModule.m4645b(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static int m4899P(Context context) {
        return DynamiteModule.m4644a(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:18|19|20|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0058 */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4900Q(android.content.Context r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.c> r0 = com.google.android.gms.internal.measurement.C1728c.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f3266i     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x000d
            java.lang.Boolean r1 = f3267j     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x000d:
            java.lang.String r1 = "app_measurement_internal_disable_startup_flags"
            boolean r1 = m4912r(r4, r1)     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x0023
            boolean r4 = f3272o     // Catch:{ Exception -> 0x0058 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0058 }
            f3266i = r4     // Catch:{ Exception -> 0x0058 }
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0058 }
            f3267j = r4     // Catch:{ Exception -> 0x0058 }
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0023:
            java.lang.String r1 = "com.google.android.gms.measurement.prefs"
            r2 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = f3270m     // Catch:{ Exception -> 0x0058 }
            boolean r3 = f3272o     // Catch:{ Exception -> 0x0058 }
            boolean r1 = r4.getBoolean(r1, r3)     // Catch:{ Exception -> 0x0058 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0058 }
            f3266i = r1     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = f3271n     // Catch:{ Exception -> 0x0058 }
            boolean r1 = r4.getBoolean(r1, r2)     // Catch:{ Exception -> 0x0058 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0058 }
            f3267j = r1     // Catch:{ Exception -> 0x0058 }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = f3270m     // Catch:{ Exception -> 0x0058 }
            r4.remove(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = f3271n     // Catch:{ Exception -> 0x0058 }
            r4.remove(r1)     // Catch:{ Exception -> 0x0058 }
            r4.apply()     // Catch:{ Exception -> 0x0058 }
            goto L_0x0064
        L_0x0056:
            r4 = move-exception
            goto L_0x0066
        L_0x0058:
            boolean r4 = f3272o     // Catch:{ all -> 0x0056 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0056 }
            f3266i = r4     // Catch:{ all -> 0x0056 }
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0056 }
            f3267j = r4     // Catch:{ all -> 0x0056 }
        L_0x0064:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0066:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1728c.m4900Q(android.content.Context):void");
    }

    /* renamed from: S */
    private static boolean m4902S() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static C1728c m4903a(@NonNull Context context) {
        return m4904b(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    /* renamed from: b */
    public static C1728c m4904b(Context context, String str, String str2, String str3, Bundle bundle) {
        C1609u.m4475k(context);
        if (f3265h == null) {
            synchronized (C1728c.class) {
                if (f3265h == null) {
                    f3265h = new C1728c(context, str, str2, str3, bundle);
                }
            }
        }
        return f3265h;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m4907j(C1729a aVar) {
        this.f3275c.execute(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m4910n(Exception exc, boolean z, boolean z2) {
        this.f3278f |= z;
        if (!z && z2) {
            mo11528g(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
    }

    /* renamed from: q */
    private final void m4911q(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m4907j(new C2023v(this, l, str, str2, bundle, z, z2));
    }

    /* renamed from: r */
    private static boolean m4912r(Context context, @Size(min = 1) String str) {
        C1609u.m4471g(str);
        try {
            ApplicationInfo c = C1620c.m4502a(context).mo11301c(context.getPackageName(), 128);
            if (c != null) {
                if (c.metaData != null) {
                    return c.metaData.getBoolean(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        f3269l = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        f3268k = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m4916z(android.content.Context r8) {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            m4900Q(r8)
            java.lang.Class<com.google.android.gms.internal.measurement.c> r8 = com.google.android.gms.internal.measurement.C1728c.class
            monitor-enter(r8)
            boolean r1 = f3268k     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x000e
        L_0x000c:
            monitor-exit(r8)     // Catch:{ all -> 0x0064 }
            goto L_0x0056
        L_0x000e:
            r1 = 0
            r2 = 1
            java.lang.String r3 = "android.os.SystemProperties"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r4 = "get"
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0053 }
            r7 = 0
            r6[r7] = r0     // Catch:{ Exception -> 0x0053 }
            r6[r2] = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.reflect.Method r0 = r3.getMethod(r4, r6)     // Catch:{ Exception -> 0x0053 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0053 }
            java.lang.String r4 = "measurement.dynamite.enabled"
            r3[r7] = r4     // Catch:{ Exception -> 0x0053 }
            java.lang.String r4 = ""
            r3[r2] = r4     // Catch:{ Exception -> 0x0053 }
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "true"
            boolean r3 = r3.equals(r0)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x0041
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0053 }
        L_0x003e:
            f3269l = r0     // Catch:{ Exception -> 0x0053 }
            goto L_0x004e
        L_0x0041:
            java.lang.String r3 = "false"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0053 }
            if (r0 == 0) goto L_0x004c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0053 }
            goto L_0x003e
        L_0x004c:
            f3269l = r1     // Catch:{ Exception -> 0x0053 }
        L_0x004e:
            f3268k = r2     // Catch:{ all -> 0x0064 }
            goto L_0x000c
        L_0x0051:
            r0 = move-exception
            goto L_0x0061
        L_0x0053:
            f3269l = r1     // Catch:{ all -> 0x0051 }
            goto L_0x004e
        L_0x0056:
            java.lang.Boolean r8 = f3269l
            if (r8 != 0) goto L_0x005c
            java.lang.Boolean r8 = f3266i
        L_0x005c:
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0061:
            f3268k = r2     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0067:
            throw r0
        L_0x0068:
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1728c.m4916z(android.content.Context):boolean");
    }

    /* renamed from: B */
    public final String mo11519B() {
        C1947pc pcVar = new C1947pc();
        m4907j(new C1869l(this, pcVar));
        return pcVar.mo11949e(500);
    }

    /* renamed from: D */
    public final void mo11520D(String str) {
        m4907j(new C1835j(this, str));
    }

    /* renamed from: G */
    public final int mo11521G(String str) {
        C1947pc pcVar = new C1947pc();
        m4907j(new C1962r(this, str, pcVar));
        Integer num = (Integer) C1947pc.m5822c(pcVar.mo11950f(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: H */
    public final String mo11522H() {
        C1947pc pcVar = new C1947pc();
        m4907j(new C1851k(this, pcVar));
        return pcVar.mo11949e(50);
    }

    /* renamed from: K */
    public final long mo11523K() {
        C1947pc pcVar = new C1947pc();
        m4907j(new C1904n(this, pcVar));
        Long l = (Long) C1947pc.m5822c(pcVar.mo11950f(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f3274b.mo11378a()).nextLong();
        int i = this.f3277e + 1;
        this.f3277e = i;
        return nextLong + ((long) i);
    }

    /* renamed from: L */
    public final String mo11524L() {
        C1947pc pcVar = new C1947pc();
        m4907j(new C1883m(this, pcVar));
        return pcVar.mo11949e(500);
    }

    /* renamed from: O */
    public final String mo11525O() {
        C1947pc pcVar = new C1947pc();
        m4907j(new C1934p(this, pcVar));
        return pcVar.mo11949e(500);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C1977rc mo11526c(Context context, boolean z) {
        DynamiteModule.C1676b bVar;
        if (z) {
            try {
                bVar = DynamiteModule.f3212k;
            } catch (DynamiteModule.C1675a e) {
                m4910n(e, true, false);
                return null;
            }
        } else {
            bVar = DynamiteModule.f3210i;
        }
        return C1961qc.asInterface(DynamiteModule.m4646d(context, bVar, ModuleDescriptor.MODULE_ID).mo11388c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    /* renamed from: f */
    public final Map<String, Object> mo11527f(String str, String str2, boolean z) {
        C1947pc pcVar = new C1947pc();
        m4907j(new C1919o(this, str, str2, z, pcVar));
        Bundle f = pcVar.mo11950f(5000);
        if (f == null || f.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(f.size());
        for (String str3 : f.keySet()) {
            Object obj = f.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: g */
    public final void mo11528g(int i, String str, Object obj, Object obj2, Object obj3) {
        m4907j(new C1948q(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* renamed from: h */
    public final void mo11529h(Activity activity, String str, String str2) {
        m4907j(new C1804h(this, activity, str, str2));
    }

    /* renamed from: i */
    public final void mo11530i(Bundle bundle) {
        m4907j(new C2040w(this, bundle));
    }

    /* renamed from: m */
    public final void mo11531m(C2172f6 f6Var) {
        C1609u.m4475k(f6Var);
        m4907j(new C1993t(this, f6Var));
    }

    /* renamed from: o */
    public final void mo11532o(@NonNull String str, Bundle bundle) {
        m4911q((String) null, str, bundle, false, true, (Long) null);
    }

    /* renamed from: p */
    public final void mo11533p(String str, String str2, Bundle bundle) {
        m4911q(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: v */
    public final List<Bundle> mo11534v(String str, String str2) {
        C1947pc pcVar = new C1947pc();
        m4907j(new C1789g(this, str, str2, pcVar));
        List<Bundle> list = (List) C1947pc.m5822c(pcVar.mo11950f(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: w */
    public final void mo11535w(String str) {
        m4907j(new C1820i(this, str));
    }

    /* renamed from: x */
    public final void mo11536x(String str, String str2, Bundle bundle) {
        m4907j(new C1759e(this, str, str2, bundle));
    }

    /* renamed from: y */
    public final void mo11537y(boolean z) {
        m4907j(new C2008u(this, z));
    }
}
