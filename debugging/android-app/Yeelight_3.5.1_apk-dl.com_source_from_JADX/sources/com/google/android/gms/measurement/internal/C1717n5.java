package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1066dc;
import com.google.android.gms.internal.measurement.C1252p6;
import com.google.android.gms.internal.measurement.zzcl;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
import p014c0.C0616e;
import p014c0.C0619h;
import p028e0.C3144c;

/* renamed from: com.google.android.gms.measurement.internal.n5 */
public final class C1717n5 implements C1667j6 {

    /* renamed from: H */
    private static volatile C1717n5 f2333H;

    /* renamed from: A */
    private volatile Boolean f2334A;
    @VisibleForTesting

    /* renamed from: B */
    protected Boolean f2335B;
    @VisibleForTesting

    /* renamed from: C */
    protected Boolean f2336C;

    /* renamed from: D */
    private volatile boolean f2337D;

    /* renamed from: E */
    private int f2338E;

    /* renamed from: F */
    private final AtomicInteger f2339F = new AtomicInteger(0);
    @VisibleForTesting

    /* renamed from: G */
    final long f2340G;

    /* renamed from: a */
    private final Context f2341a;

    /* renamed from: b */
    private final String f2342b;

    /* renamed from: c */
    private final String f2343c;

    /* renamed from: d */
    private final String f2344d;

    /* renamed from: e */
    private final boolean f2345e;

    /* renamed from: f */
    private final C1569c f2346f;

    /* renamed from: g */
    private final C1621g f2347g;

    /* renamed from: h */
    private final C1764r4 f2348h;

    /* renamed from: i */
    private final C1574c4 f2349i;

    /* renamed from: j */
    private final C1679k5 f2350j;

    /* renamed from: k */
    private final C1865z9 f2351k;

    /* renamed from: l */
    private final C1854ya f2352l;

    /* renamed from: m */
    private final C1823w3 f2353m;

    /* renamed from: n */
    private final C0616e f2354n;

    /* renamed from: o */
    private final C1669j8 f2355o;

    /* renamed from: p */
    private final C1791t7 f2356p;

    /* renamed from: q */
    private final C1857z1 f2357q;

    /* renamed from: r */
    private final C1839x7 f2358r;

    /* renamed from: s */
    private final String f2359s;

    /* renamed from: t */
    private C1799u3 f2360t;

    /* renamed from: u */
    private C1670j9 f2361u;

    /* renamed from: v */
    private C1735p f2362v;

    /* renamed from: w */
    private C1775s3 f2363w;

    /* renamed from: x */
    private boolean f2364x = false;

    /* renamed from: y */
    private Boolean f2365y;

    /* renamed from: z */
    private long f2366z;

    C1717n5(C1766r6 r6Var) {
        String str;
        C1859z3 z3Var;
        Bundle bundle;
        boolean z = false;
        C0917i.m1419j(r6Var);
        Context context = r6Var.f2586a;
        C1569c cVar = new C1569c(context);
        this.f2346f = cVar;
        C1690l3.f2262a = cVar;
        this.f2341a = context;
        this.f2342b = r6Var.f2587b;
        this.f2343c = r6Var.f2588c;
        this.f2344d = r6Var.f2589d;
        this.f2345e = r6Var.f2593h;
        this.f2334A = r6Var.f2590e;
        this.f2359s = r6Var.f2595j;
        this.f2337D = true;
        zzcl zzcl = r6Var.f2592g;
        if (!(zzcl == null || (bundle = zzcl.f1752g) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f2335B = (Boolean) obj;
            }
            Object obj2 = zzcl.f1752g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f2336C = (Boolean) obj2;
            }
        }
        C1252p6.m2452e(context);
        C0616e d = C0619h.m208d();
        this.f2354n = d;
        Long l = r6Var.f2594i;
        this.f2340G = l != null ? l.longValue() : d.mo11029a();
        this.f2347g = new C1621g(this);
        C1764r4 r4Var = new C1764r4(this);
        r4Var.mo14242l();
        this.f2348h = r4Var;
        C1574c4 c4Var = new C1574c4(this);
        c4Var.mo14242l();
        this.f2349i = c4Var;
        C1854ya yaVar = new C1854ya(this);
        yaVar.mo14242l();
        this.f2352l = yaVar;
        this.f2353m = new C1823w3(new C1754q6(r6Var, this));
        this.f2357q = new C1857z1(this);
        C1669j8 j8Var = new C1669j8(this);
        j8Var.mo14021j();
        this.f2355o = j8Var;
        C1791t7 t7Var = new C1791t7(this);
        t7Var.mo14021j();
        this.f2356p = t7Var;
        C1865z9 z9Var = new C1865z9(this);
        z9Var.mo14021j();
        this.f2351k = z9Var;
        C1839x7 x7Var = new C1839x7(this);
        x7Var.mo14242l();
        this.f2358r = x7Var;
        C1679k5 k5Var = new C1679k5(this);
        k5Var.mo14242l();
        this.f2350j = k5Var;
        zzcl zzcl2 = r6Var.f2592g;
        z = (zzcl2 == null || zzcl2.f1747b == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            C1791t7 I = mo14377I();
            if (I.f2143a.f2341a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f2143a.f2341a.getApplicationContext();
                if (I.f2679c == null) {
                    I.f2679c = new C1779s7(I, (C1767r7) null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(I.f2679c);
                    application.registerActivityLifecycleCallbacks(I.f2679c);
                    z3Var = I.f2143a.mo14228b().mo14039v();
                    str = "Registered activity lifecycle callback";
                }
            }
            k5Var.mo14310z(new C1705m5(this, r6Var));
        }
        z3Var = mo14228b().mo14040w();
        str = "Application context is not an Application";
        z3Var.mo14693a(str);
        k5Var.mo14310z(new C1705m5(this, r6Var));
    }

    /* renamed from: H */
    public static C1717n5 m4485H(Context context, zzcl zzcl, Long l) {
        Bundle bundle;
        if (zzcl != null && (zzcl.f1750e == null || zzcl.f1751f == null)) {
            zzcl = new zzcl(zzcl.f1746a, zzcl.f1747b, zzcl.f1748c, zzcl.f1749d, (String) null, (String) null, zzcl.f1752g, (String) null);
        }
        C0917i.m1419j(context);
        C0917i.m1419j(context.getApplicationContext());
        if (f2333H == null) {
            synchronized (C1717n5.class) {
                if (f2333H == null) {
                    f2333H = new C1717n5(new C1766r6(context, zzcl, l));
                }
            }
        } else if (!(zzcl == null || (bundle = zzcl.f1752g) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            C0917i.m1419j(f2333H);
            f2333H.f2334A = Boolean.valueOf(zzcl.f1752g.getBoolean("dataCollectionDefaultEnabled"));
        }
        C0917i.m1419j(f2333H);
        return f2333H;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ void m4486e(C1717n5 n5Var, C1766r6 r6Var) {
        n5Var.mo14227a().mo14009h();
        n5Var.f2347g.mo14182w();
        C1735p pVar = new C1735p(n5Var);
        pVar.mo14242l();
        n5Var.f2362v = pVar;
        C1775s3 s3Var = new C1775s3(n5Var, r6Var.f2591f);
        s3Var.mo14021j();
        n5Var.f2363w = s3Var;
        C1799u3 u3Var = new C1799u3(n5Var);
        u3Var.mo14021j();
        n5Var.f2360t = u3Var;
        C1670j9 j9Var = new C1670j9(n5Var);
        j9Var.mo14021j();
        n5Var.f2361u = j9Var;
        n5Var.f2352l.mo14243m();
        n5Var.f2348h.mo14243m();
        n5Var.f2363w.mo14022k();
        C1859z3 u = n5Var.mo14228b().mo14038u();
        n5Var.f2347g.mo14176q();
        u.mo14694b("App measurement initialized, version", 64000L);
        n5Var.mo14228b().mo14038u().mo14693a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s = s3Var.mo14508s();
        if (TextUtils.isEmpty(n5Var.f2342b)) {
            if (n5Var.mo14382N().mo14663T(s)) {
                n5Var.mo14228b().mo14038u().mo14693a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                n5Var.mo14228b().mo14038u().mo14693a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(s)));
            }
        }
        n5Var.mo14228b().mo14034q().mo14693a("Debug-level message logging enabled");
        if (n5Var.f2338E != n5Var.f2339F.get()) {
            n5Var.mo14228b().mo14035r().mo14695c("Not all components initialized", Integer.valueOf(n5Var.f2338E), Integer.valueOf(n5Var.f2339F.get()));
        }
        n5Var.f2364x = true;
    }

    /* renamed from: t */
    static final void m4487t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    private static final void m4488u(C1641h6 h6Var) {
        if (h6Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    private static final void m4489v(C1561b4 b4Var) {
        if (b4Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!b4Var.mo14024m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b4Var.getClass())));
        }
    }

    /* renamed from: w */
    private static final void m4490w(C1654i6 i6Var) {
        if (i6Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!i6Var.mo14244n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(i6Var.getClass())));
        }
    }

    @Pure
    /* renamed from: A */
    public final C1735p mo14370A() {
        m4490w(this.f2362v);
        return this.f2362v;
    }

    @Pure
    /* renamed from: B */
    public final C1775s3 mo14371B() {
        m4489v(this.f2363w);
        return this.f2363w;
    }

    @Pure
    /* renamed from: C */
    public final C1799u3 mo14372C() {
        m4489v(this.f2360t);
        return this.f2360t;
    }

    @Pure
    /* renamed from: D */
    public final C1823w3 mo14373D() {
        return this.f2353m;
    }

    /* renamed from: E */
    public final C1574c4 mo14374E() {
        C1574c4 c4Var = this.f2349i;
        if (c4Var == null || !c4Var.mo14244n()) {
            return null;
        }
        return c4Var;
    }

    @Pure
    /* renamed from: F */
    public final C1764r4 mo14375F() {
        m4488u(this.f2348h);
        return this.f2348h;
    }

    /* access modifiers changed from: package-private */
    @SideEffectFree
    /* renamed from: G */
    public final C1679k5 mo14376G() {
        return this.f2350j;
    }

    @Pure
    /* renamed from: I */
    public final C1791t7 mo14377I() {
        m4489v(this.f2356p);
        return this.f2356p;
    }

    @Pure
    /* renamed from: J */
    public final C1839x7 mo14378J() {
        m4490w(this.f2358r);
        return this.f2358r;
    }

    @Pure
    /* renamed from: K */
    public final C1669j8 mo14379K() {
        m4489v(this.f2355o);
        return this.f2355o;
    }

    @Pure
    /* renamed from: L */
    public final C1670j9 mo14380L() {
        m4489v(this.f2361u);
        return this.f2361u;
    }

    @Pure
    /* renamed from: M */
    public final C1865z9 mo14381M() {
        m4489v(this.f2351k);
        return this.f2351k;
    }

    @Pure
    /* renamed from: N */
    public final C1854ya mo14382N() {
        m4488u(this.f2352l);
        return this.f2352l;
    }

    @Pure
    /* renamed from: O */
    public final String mo14383O() {
        return this.f2342b;
    }

    @Pure
    /* renamed from: P */
    public final String mo14384P() {
        return this.f2343c;
    }

    @Pure
    /* renamed from: Q */
    public final String mo14385Q() {
        return this.f2344d;
    }

    @Pure
    /* renamed from: R */
    public final String mo14386R() {
        return this.f2359s;
    }

    @Pure
    /* renamed from: a */
    public final C1679k5 mo14227a() {
        m4490w(this.f2350j);
        return this.f2350j;
    }

    @Pure
    /* renamed from: b */
    public final C1574c4 mo14228b() {
        m4490w(this.f2349i);
        return this.f2349i;
    }

    @Pure
    /* renamed from: c */
    public final C0616e mo14229c() {
        return this.f2354n;
    }

    @Pure
    /* renamed from: d */
    public final C1569c mo14230d() {
        return this.f2346f;
    }

    @Pure
    /* renamed from: f */
    public final Context mo14231f() {
        return this.f2341a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo14387g() {
        this.f2339F.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo14388h(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            mo14228b().mo14040w().mo14695c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            mo14375F().f2576r.mo14350a(true);
            if (bArr == null || bArr.length == 0) {
                mo14228b().mo14034q().mo14693a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    mo14228b().mo14034q().mo14693a("Deferred Deep Link is empty.");
                    return;
                }
                C1854ya N = mo14382N();
                C1717n5 n5Var = N.f2143a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = N.f2143a.f2341a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f2356p.mo14570v("auto", "_cmp", bundle);
                        C1854ya N2 = mo14382N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = N2.f2143a.f2341a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    N2.f2143a.f2341a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                N2.f2143a.mo14228b().mo14035r().mo14694b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo14228b().mo14040w().mo14695c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                mo14228b().mo14035r().mo14694b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        mo14228b().mo14040w().mo14695c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo14389i() {
        this.f2338E++;
    }

    @WorkerThread
    /* renamed from: j */
    public final void mo14390j() {
        mo14227a().mo14009h();
        m4490w(mo14378J());
        String s = mo14371B().mo14508s();
        Pair p = mo14375F().mo14446p(s);
        if (!this.f2347g.mo14162A() || ((Boolean) p.second).booleanValue() || TextUtils.isEmpty((CharSequence) p.first)) {
            mo14228b().mo14034q().mo14693a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        C1839x7 J = mo14378J();
        J.mo14241k();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f2143a.f2341a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo14228b().mo14040w().mo14693a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        C1854ya N = mo14382N();
        mo14371B().f2143a.f2347g.mo14176q();
        URL s2 = N.mo14680s(64000, s, (String) p.first, mo14375F().f2577s.mo14368a() - 1);
        if (s2 != null) {
            C1839x7 J2 = mo14378J();
            C1692l5 l5Var = new C1692l5(this);
            J2.mo14009h();
            J2.mo14241k();
            C0917i.m1419j(s2);
            C0917i.m1419j(l5Var);
            J2.f2143a.mo14227a().mo14309y(new C1827w7(J2, s, s2, (byte[]) null, (Map) null, l5Var, (byte[]) null));
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: k */
    public final void mo14391k(boolean z) {
        this.f2334A = Boolean.valueOf(z);
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo14392l(boolean z) {
        mo14227a().mo14009h();
        this.f2337D = z;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: m */
    public final void mo14393m(zzcl zzcl) {
        C1634h hVar;
        mo14227a().mo14009h();
        C1634h q = mo14375F().mo14447q();
        C1764r4 F = mo14375F();
        C1717n5 n5Var = F.f2143a;
        F.mo14009h();
        int i = 100;
        int i2 = F.mo14445o().getInt("consent_source", 100);
        C1621g gVar = this.f2347g;
        C1717n5 n5Var2 = gVar.f2143a;
        Boolean t = gVar.mo14179t("google_analytics_default_allow_ad_storage");
        C1621g gVar2 = this.f2347g;
        C1717n5 n5Var3 = gVar2.f2143a;
        Boolean t2 = gVar2.mo14179t("google_analytics_default_allow_analytics_storage");
        if (!(t == null && t2 == null) && mo14375F().mo14453w(-10)) {
            hVar = new C1634h(t, t2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(mo14371B().mo14509t()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                mo14377I().mo14542H(C1634h.f2129b, -10, this.f2340G);
            } else if (TextUtils.isEmpty(mo14371B().mo14509t()) && zzcl != null && zzcl.f1752g != null && mo14375F().mo14453w(30)) {
                hVar = C1634h.m4272a(zzcl.f1752g);
                if (!hVar.equals(C1634h.f2129b)) {
                    i = 30;
                }
            }
            hVar = null;
        }
        if (hVar != null) {
            mo14377I().mo14542H(hVar, i, this.f2340G);
            q = hVar;
        }
        mo14377I().mo14546L(q);
        if (mo14375F().f2563e.mo14368a() == 0) {
            mo14228b().mo14039v().mo14694b("Persisting first open", Long.valueOf(this.f2340G));
            mo14375F().f2563e.mo14369b(this.f2340G);
        }
        mo14377I().f2690n.mo14133c();
        if (mo14398r()) {
            if (!TextUtils.isEmpty(mo14371B().mo14509t()) || !TextUtils.isEmpty(mo14371B().mo14507r())) {
                C1854ya N = mo14382N();
                String t3 = mo14371B().mo14509t();
                C1764r4 F2 = mo14375F();
                F2.mo14009h();
                String string = F2.mo14445o().getString("gmp_app_id", (String) null);
                String r = mo14371B().mo14507r();
                C1764r4 F3 = mo14375F();
                F3.mo14009h();
                if (N.mo14666b0(t3, string, r, F3.mo14445o().getString("admob_app_id", (String) null))) {
                    mo14228b().mo14038u().mo14693a("Rechecking which service to use due to a GMP App Id change");
                    C1764r4 F4 = mo14375F();
                    F4.mo14009h();
                    Boolean r2 = F4.mo14448r();
                    SharedPreferences.Editor edit = F4.mo14445o().edit();
                    edit.clear();
                    edit.apply();
                    if (r2 != null) {
                        F4.mo14449s(r2);
                    }
                    mo14372C().mo14595q();
                    this.f2361u.mo14273Q();
                    this.f2361u.mo14272P();
                    mo14375F().f2563e.mo14369b(this.f2340G);
                    mo14375F().f2565g.mo14427b((String) null);
                }
                C1764r4 F5 = mo14375F();
                String t4 = mo14371B().mo14509t();
                F5.mo14009h();
                SharedPreferences.Editor edit2 = F5.mo14445o().edit();
                edit2.putString("gmp_app_id", t4);
                edit2.apply();
                C1764r4 F6 = mo14375F();
                String r3 = mo14371B().mo14507r();
                F6.mo14009h();
                SharedPreferences.Editor edit3 = F6.mo14445o().edit();
                edit3.putString("admob_app_id", r3);
                edit3.apply();
            }
            if (!mo14375F().mo14447q().mo14221i(zzah.ANALYTICS_STORAGE)) {
                mo14375F().f2565g.mo14427b((String) null);
            }
            mo14377I().mo14538D(mo14375F().f2565g.mo14426a());
            C1066dc.m1863b();
            if (this.f2347g.mo14163B((String) null, C1727o3.f2438e0)) {
                try {
                    mo14382N().f2143a.f2341a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(mo14375F().f2578t.mo14426a())) {
                        mo14228b().mo14040w().mo14693a("Remote config removed with active feature rollouts");
                        mo14375F().f2578t.mo14427b((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(mo14371B().mo14509t()) || !TextUtils.isEmpty(mo14371B().mo14507r())) {
                boolean o = mo14395o();
                if (!mo14375F().mo14451u() && !this.f2347g.mo14166E()) {
                    mo14375F().mo14450t(!o);
                }
                if (o) {
                    mo14377I().mo14562i0();
                }
                mo14381M().f2836d.mo14641a();
                mo14380L().mo14275S(new AtomicReference());
                mo14380L().mo14287v(mo14375F().f2581w.mo14359a());
            }
        } else if (mo14395o()) {
            if (!mo14382N().mo14662S("android.permission.INTERNET")) {
                mo14228b().mo14035r().mo14693a("App is missing INTERNET permission");
            }
            if (!mo14382N().mo14662S("android.permission.ACCESS_NETWORK_STATE")) {
                mo14228b().mo14035r().mo14693a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C3144c.m8403a(this.f2341a).mo23630e() && !this.f2347g.mo14168G()) {
                if (!C1854ya.m4833Y(this.f2341a)) {
                    mo14228b().mo14035r().mo14693a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C1854ya.m4834Z(this.f2341a, false)) {
                    mo14228b().mo14035r().mo14693a("AppMeasurementService not registered/enabled");
                }
            }
            mo14228b().mo14035r().mo14693a("Uploading is not possible. App measurement disabled");
        }
        mo14375F().f2572n.mo14350a(true);
    }

    @WorkerThread
    /* renamed from: n */
    public final boolean mo14394n() {
        return this.f2334A != null && this.f2334A.booleanValue();
    }

    @WorkerThread
    /* renamed from: o */
    public final boolean mo14395o() {
        return mo14400x() == 0;
    }

    @WorkerThread
    /* renamed from: p */
    public final boolean mo14396p() {
        mo14227a().mo14009h();
        return this.f2337D;
    }

    @Pure
    /* renamed from: q */
    public final boolean mo14397q() {
        return TextUtils.isEmpty(this.f2342b);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: r */
    public final boolean mo14398r() {
        if (this.f2364x) {
            mo14227a().mo14009h();
            Boolean bool = this.f2365y;
            if (bool == null || this.f2366z == 0 || (!bool.booleanValue() && Math.abs(this.f2354n.mo11030b() - this.f2366z) > 1000)) {
                this.f2366z = this.f2354n.mo11030b();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(mo14382N().mo14662S("android.permission.INTERNET") && mo14382N().mo14662S("android.permission.ACCESS_NETWORK_STATE") && (C3144c.m8403a(this.f2341a).mo23630e() || this.f2347g.mo14168G() || (C1854ya.m4833Y(this.f2341a) && C1854ya.m4834Z(this.f2341a, false))));
                this.f2365y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo14382N().mo14655L(mo14371B().mo14509t(), mo14371B().mo14507r()) && TextUtils.isEmpty(mo14371B().mo14507r())) {
                        z = false;
                    }
                    this.f2365y = Boolean.valueOf(z);
                }
            }
            return this.f2365y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    /* renamed from: s */
    public final boolean mo14399s() {
        return this.f2345e;
    }

    @WorkerThread
    /* renamed from: x */
    public final int mo14400x() {
        mo14227a().mo14009h();
        if (this.f2347g.mo14166E()) {
            return 1;
        }
        Boolean bool = this.f2336C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo14227a().mo14009h();
        if (!this.f2337D) {
            return 8;
        }
        Boolean r = mo14375F().mo14448r();
        if (r != null) {
            return r.booleanValue() ? 0 : 3;
        }
        C1621g gVar = this.f2347g;
        C1569c cVar = gVar.f2143a.f2346f;
        Boolean t = gVar.mo14179t("firebase_analytics_collection_enabled");
        if (t != null) {
            return t.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f2335B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f2334A == null || this.f2334A.booleanValue()) ? 0 : 7;
    }

    @Pure
    /* renamed from: y */
    public final C1857z1 mo14401y() {
        C1857z1 z1Var = this.f2357q;
        if (z1Var != null) {
            return z1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    /* renamed from: z */
    public final C1621g mo14402z() {
        return this.f2347g;
    }
}
