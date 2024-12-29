package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.internal.C1433f;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.p105j.C1620c;
import com.google.android.gms.common.util.C1651e;
import com.google.android.gms.common.util.C1654h;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1770e9;
import com.google.android.gms.internal.measurement.C2026v1;
import com.google.android.gms.internal.measurement.zzaa;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
public class C2111a5 implements C2385y5 {

    /* renamed from: G */
    private static volatile C2111a5 f3910G;

    /* renamed from: A */
    private volatile Boolean f3911A;
    @VisibleForTesting

    /* renamed from: B */
    private Boolean f3912B;
    @VisibleForTesting

    /* renamed from: C */
    private Boolean f3913C;

    /* renamed from: D */
    private int f3914D;

    /* renamed from: E */
    private AtomicInteger f3915E = new AtomicInteger(0);
    @VisibleForTesting

    /* renamed from: F */
    final long f3916F;

    /* renamed from: a */
    private final Context f3917a;

    /* renamed from: b */
    private final String f3918b;

    /* renamed from: c */
    private final String f3919c;

    /* renamed from: d */
    private final String f3920d;

    /* renamed from: e */
    private final boolean f3921e;

    /* renamed from: f */
    private final C2176fa f3922f;

    /* renamed from: g */
    private final C2117b f3923g;

    /* renamed from: h */
    private final C2218j4 f3924h;

    /* renamed from: i */
    private final C2361w3 f3925i;

    /* renamed from: j */
    private final C2373x4 f3926j;

    /* renamed from: k */
    private final C2366w8 f3927k;

    /* renamed from: l */
    private final C2323s9 f3928l;

    /* renamed from: m */
    private final C2339u3 f3929m;

    /* renamed from: n */
    private final C1651e f3930n;

    /* renamed from: o */
    private final C2243l7 f3931o;

    /* renamed from: p */
    private final C2196h6 f3932p;

    /* renamed from: q */
    private final C2390z f3933q;

    /* renamed from: r */
    private final C2185g7 f3934r;

    /* renamed from: s */
    private C2317s3 f3935s;

    /* renamed from: t */
    private C2310r7 f3936t;

    /* renamed from: u */
    private C2235l f3937u;

    /* renamed from: v */
    private C2328t3 f3938v;

    /* renamed from: w */
    private C2318s4 f3939w;

    /* renamed from: x */
    private boolean f3940x = false;

    /* renamed from: y */
    private Boolean f3941y;

    /* renamed from: z */
    private long f3942z;

    private C2111a5(C2148d6 d6Var) {
        String str;
        C2383y3 y3Var;
        Bundle bundle;
        boolean z = false;
        C1609u.m4475k(d6Var);
        C2176fa faVar = new C2176fa(d6Var.f4054a);
        this.f3922f = faVar;
        C2251m3.f4357a = faVar;
        this.f3917a = d6Var.f4054a;
        this.f3918b = d6Var.f4055b;
        this.f3919c = d6Var.f4056c;
        this.f3920d = d6Var.f4057d;
        this.f3921e = d6Var.f4061h;
        this.f3911A = d6Var.f4058e;
        zzaa zzaa = d6Var.f4060g;
        if (!(zzaa == null || (bundle = zzaa.f3884g) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f3912B = (Boolean) obj;
            }
            Object obj2 = zzaa.f3884g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f3913C = (Boolean) obj2;
            }
        }
        C2026v1.m6109h(this.f3917a);
        C1651e d = C1654h.m4587d();
        this.f3930n = d;
        Long l = d6Var.f4062i;
        this.f3916F = l != null ? l.longValue() : d.mo11378a();
        this.f3923g = new C2117b(this);
        C2218j4 j4Var = new C2218j4(this);
        j4Var.mo13080p();
        this.f3924h = j4Var;
        C2361w3 w3Var = new C2361w3(this);
        w3Var.mo13080p();
        this.f3925i = w3Var;
        C2323s9 s9Var = new C2323s9(this);
        s9Var.mo13080p();
        this.f3928l = s9Var;
        C2339u3 u3Var = new C2339u3(this);
        u3Var.mo13080p();
        this.f3929m = u3Var;
        this.f3933q = new C2390z(this);
        C2243l7 l7Var = new C2243l7(this);
        l7Var.mo12538y();
        this.f3931o = l7Var;
        C2196h6 h6Var = new C2196h6(this);
        h6Var.mo12538y();
        this.f3932p = h6Var;
        C2366w8 w8Var = new C2366w8(this);
        w8Var.mo12538y();
        this.f3927k = w8Var;
        C2185g7 g7Var = new C2185g7(this);
        g7Var.mo13080p();
        this.f3934r = g7Var;
        C2373x4 x4Var = new C2373x4(this);
        x4Var.mo13080p();
        this.f3926j = x4Var;
        zzaa zzaa2 = d6Var.f4060g;
        if (!(zzaa2 == null || zzaa2.f3879b == 0)) {
            z = true;
        }
        boolean z2 = !z;
        if (this.f3917a.getApplicationContext() instanceof Application) {
            C2196h6 F = mo12411F();
            if (F.mo12428c().getApplicationContext() instanceof Application) {
                Application application = (Application) F.mo12428c().getApplicationContext();
                if (F.f4157c == null) {
                    F.f4157c = new C2113a7(F, (C2208i6) null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(F.f4157c);
                    application.registerActivityLifecycleCallbacks(F.f4157c);
                    y3Var = F.mo12427b().mo13104O();
                    str = "Registered activity lifecycle callback";
                }
            }
            this.f3926j.mo13122y(new C2135c5(this, d6Var));
        }
        y3Var = mo12427b().mo13099J();
        str = "Application context is not an Application";
        y3Var.mo13130a(str);
        this.f3926j.mo13122y(new C2135c5(this, d6Var));
    }

    /* renamed from: d */
    public static C2111a5 m6707d(Context context, zzaa zzaa, Long l) {
        Bundle bundle;
        if (zzaa != null && (zzaa.f3882e == null || zzaa.f3883f == null)) {
            zzaa = new zzaa(zzaa.f3878a, zzaa.f3879b, zzaa.f3880c, zzaa.f3881d, (String) null, (String) null, zzaa.f3884g);
        }
        C1609u.m4475k(context);
        C1609u.m4475k(context.getApplicationContext());
        if (f3910G == null) {
            synchronized (C2111a5.class) {
                if (f3910G == null) {
                    f3910G = new C2111a5(new C2148d6(context, zzaa, l));
                }
            }
        } else if (!(zzaa == null || (bundle = zzaa.f3884g) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            f3910G.mo12434n(zzaa.f3884g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f3910G;
    }

    @VisibleForTesting
    /* renamed from: e */
    public static C2111a5 m6708e(Context context, String str, String str2, Bundle bundle) {
        return m6707d(context, new zzaa(0, 0, true, (String) null, (String) null, (String) null, bundle), (Long) null);
    }

    /* renamed from: k */
    private static void m6710k(C2363w5 w5Var) {
        if (w5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: l */
    public final void m6711l(C2148d6 d6Var) {
        C2383y3 y3Var;
        String str;
        mo12426a().mo12567h();
        C2235l lVar = new C2235l(this);
        lVar.mo13080p();
        this.f3937u = lVar;
        C2328t3 t3Var = new C2328t3(this, d6Var.f4059f);
        t3Var.mo12538y();
        this.f3938v = t3Var;
        C2317s3 s3Var = new C2317s3(this);
        s3Var.mo12538y();
        this.f3935s = s3Var;
        C2310r7 r7Var = new C2310r7(this);
        r7Var.mo12538y();
        this.f3936t = r7Var;
        this.f3928l.mo13081q();
        this.f3924h.mo13081q();
        this.f3939w = new C2318s4(this);
        this.f3938v.mo12539z();
        mo12427b().mo13102M().mo13131b("App measurement initialized, version", Long.valueOf(this.f3923g.mo12457C()));
        mo12427b().mo13102M().mo13130a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String C = t3Var.mo12982C();
        if (TextUtils.isEmpty(this.f3918b)) {
            if (mo12412G().mo12946B0(C)) {
                y3Var = mo12427b().mo13102M();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                C2383y3 M = mo12427b().mo13102M();
                String valueOf = String.valueOf(C);
                C2383y3 y3Var2 = M;
                str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                y3Var = y3Var2;
            }
            y3Var.mo13130a(str);
        }
        mo12427b().mo13103N().mo13130a("Debug-level message logging enabled");
        if (this.f3914D != this.f3915E.get()) {
            mo12427b().mo13096F().mo13132c("Not all components initialized", Integer.valueOf(this.f3914D), Integer.valueOf(this.f3915E.get()));
        }
        this.f3940x = true;
    }

    /* renamed from: w */
    private final C2185g7 m6712w() {
        m6714z(this.f3934r);
        return this.f3934r;
    }

    /* renamed from: y */
    private static void m6713y(C2133c3 c3Var) {
        if (c3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!c3Var.mo12536w()) {
            String valueOf = String.valueOf(c3Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: z */
    private static void m6714z(C2352v5 v5Var) {
        if (v5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!v5Var.mo13082s()) {
            String valueOf = String.valueOf(v5Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: A */
    public final C2218j4 mo12406A() {
        m6710k(this.f3924h);
        return this.f3924h;
    }

    /* renamed from: B */
    public final C2361w3 mo12407B() {
        C2361w3 w3Var = this.f3925i;
        if (w3Var == null || !w3Var.mo13082s()) {
            return null;
        }
        return this.f3925i;
    }

    /* renamed from: C */
    public final C2366w8 mo12408C() {
        m6713y(this.f3927k);
        return this.f3927k;
    }

    /* renamed from: D */
    public final C2318s4 mo12409D() {
        return this.f3939w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final C2373x4 mo12410E() {
        return this.f3926j;
    }

    /* renamed from: F */
    public final C2196h6 mo12411F() {
        m6713y(this.f3932p);
        return this.f3932p;
    }

    /* renamed from: G */
    public final C2323s9 mo12412G() {
        m6710k(this.f3928l);
        return this.f3928l;
    }

    /* renamed from: H */
    public final C2339u3 mo12413H() {
        m6710k(this.f3929m);
        return this.f3929m;
    }

    /* renamed from: I */
    public final C2176fa mo12414I() {
        return this.f3922f;
    }

    /* renamed from: J */
    public final C2317s3 mo12415J() {
        m6713y(this.f3935s);
        return this.f3935s;
    }

    /* renamed from: K */
    public final boolean mo12416K() {
        return TextUtils.isEmpty(this.f3918b);
    }

    /* renamed from: L */
    public final String mo12417L() {
        return this.f3918b;
    }

    /* renamed from: M */
    public final String mo12418M() {
        return this.f3919c;
    }

    /* renamed from: N */
    public final String mo12419N() {
        return this.f3920d;
    }

    /* renamed from: O */
    public final boolean mo12420O() {
        return this.f3921e;
    }

    /* renamed from: P */
    public final C2243l7 mo12421P() {
        m6713y(this.f3931o);
        return this.f3931o;
    }

    /* renamed from: Q */
    public final C2310r7 mo12422Q() {
        m6713y(this.f3936t);
        return this.f3936t;
    }

    /* renamed from: R */
    public final C2235l mo12423R() {
        m6714z(this.f3937u);
        return this.f3937u;
    }

    /* renamed from: S */
    public final C2328t3 mo12424S() {
        m6713y(this.f3938v);
        return this.f3938v;
    }

    /* renamed from: T */
    public final C2390z mo12425T() {
        C2390z zVar = this.f3933q;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: a */
    public final C2373x4 mo12426a() {
        m6714z(this.f3926j);
        return this.f3926j;
    }

    /* renamed from: b */
    public final C2361w3 mo12427b() {
        m6714z(this.f3925i);
        return this.f3925i;
    }

    /* renamed from: c */
    public final Context mo12428c() {
        return this.f3917a;
    }

    /* renamed from: f */
    public final C1651e mo12429f() {
        return this.f3930n;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: g */
    public final void mo12430g() {
        mo12426a().mo12567h();
        if (mo12406A().f4222e.mo12849a() == 0) {
            mo12406A().f4222e.mo12850b(this.f3930n.mo11378a());
        }
        if (Long.valueOf(mo12406A().f4227j.mo12849a()).longValue() == 0) {
            mo12427b().mo13104O().mo13131b("Persisting first open", Long.valueOf(this.f3916F));
            mo12406A().f4227j.mo12850b(this.f3916F);
        }
        if (this.f3923g.mo12474s(C2302r.f4490Q0)) {
            mo12411F().f4162h.mo13129c();
        }
        if (mo12441u()) {
            if (!TextUtils.isEmpty(mo12424S().mo12983D()) || !TextUtils.isEmpty(mo12424S().mo12984E())) {
                mo12412G();
                if (C2323s9.m7568h0(mo12424S().mo12983D(), mo12406A().mo12756C(), mo12424S().mo12984E(), mo12406A().mo12757D())) {
                    mo12427b().mo13102M().mo13130a("Rechecking which service to use due to a GMP App Id change");
                    mo12406A().mo12759F();
                    mo12415J().mo12935H();
                    this.f3936t.mo12926b0();
                    this.f3936t.mo12924Z();
                    mo12406A().f4227j.mo12850b(this.f3916F);
                    mo12406A().f4229l.mo12870b((String) null);
                }
                mo12406A().mo12769y(mo12424S().mo12983D());
                mo12406A().mo12754A(mo12424S().mo12984E());
            }
            mo12411F().mo12706O(mo12406A().f4229l.mo12869a());
            if (C1770e9.m5039a() && this.f3923g.mo12474s(C2302r.f4546w0) && !mo12412G().mo12957M0() && !TextUtils.isEmpty(mo12406A().f4216A.mo12869a())) {
                mo12427b().mo13099J().mo13130a("Remote config removed with active feature rollouts");
                mo12406A().f4216A.mo12870b((String) null);
            }
            if (!TextUtils.isEmpty(mo12424S().mo12983D()) || !TextUtils.isEmpty(mo12424S().mo12984E())) {
                boolean p = mo12436p();
                if (!mo12406A().mo12762J() && !this.f3923g.mo12461G()) {
                    mo12406A().mo12770z(!p);
                }
                if (p) {
                    mo12411F().mo12724h0();
                }
                mo12408C().f4696d.mo12662a();
                mo12422Q().mo12917S(new AtomicReference());
            }
        } else if (mo12436p()) {
            if (!mo12412G().mo12980z0("android.permission.INTERNET")) {
                mo12427b().mo13096F().mo13130a("App is missing INTERNET permission");
            }
            if (!mo12412G().mo12980z0("android.permission.ACCESS_NETWORK_STATE")) {
                mo12427b().mo13096F().mo13130a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C1620c.m4502a(this.f3917a).mo11305g() && !this.f3923g.mo12468Q()) {
                if (!C2329t4.m7638b(this.f3917a)) {
                    mo12427b().mo13096F().mo13130a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C2323s9.m7562W(this.f3917a, false)) {
                    mo12427b().mo13096F().mo13130a("AppMeasurementService not registered/enabled");
                }
            }
            mo12427b().mo13096F().mo13130a("Uploading is not possible. App measurement disabled");
        }
        mo12406A().f4237t.mo12795a(this.f3923g.mo12474s(C2302r.f4502a0));
        mo12406A().f4238u.mo12795a(this.f3923g.mo12474s(C2302r.f4504b0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo12431h(C2133c3 c3Var) {
        this.f3914D++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo12432j(C2352v5 v5Var) {
        this.f3914D++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo12433m(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z = true;
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            mo12427b().mo13099J().mo13132c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        mo12406A().f4242y.mo12795a(true);
        if (bArr.length == 0) {
            mo12427b().mo13103N().mo13130a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                mo12427b().mo13103N().mo13130a("Deferred Deep Link is empty.");
                return;
            }
            C2323s9 G = mo12412G();
            G.mo12566d();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = G.mo12428c().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                mo12427b().mo13099J().mo13132c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.f3932p.mo12709S("auto", "_cmp", bundle);
            C2323s9 G2 = mo12412G();
            if (!TextUtils.isEmpty(optString) && G2.mo12966c0(optString, optDouble)) {
                G2.mo12428c().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (JSONException e) {
            mo12427b().mo13096F().mo13131b("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: n */
    public final void mo12434n(boolean z) {
        this.f3911A = Boolean.valueOf(z);
    }

    @WorkerThread
    /* renamed from: o */
    public final boolean mo12435o() {
        return this.f3911A != null && this.f3911A.booleanValue();
    }

    @WorkerThread
    /* renamed from: p */
    public final boolean mo12436p() {
        return mo12437q() == 0;
    }

    @WorkerThread
    /* renamed from: q */
    public final int mo12437q() {
        mo12426a().mo12567h();
        if (this.f3923g.mo12461G()) {
            return 1;
        }
        Boolean bool = this.f3913C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean G = mo12406A().mo12760G();
        if (G != null) {
            return G.booleanValue() ? 0 : 3;
        }
        C2117b bVar = this.f3923g;
        bVar.mo12414I();
        Boolean x = bVar.mo12479x("firebase_analytics_collection_enabled");
        if (x != null) {
            return x.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f3912B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        if (C1433f.m3827d()) {
            return 6;
        }
        return (!this.f3923g.mo12474s(C2302r.f4494T) || this.f3911A == null || this.f3911A.booleanValue()) ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo12438r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo12439s() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo12440t() {
        this.f3915E.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: u */
    public final boolean mo12441u() {
        if (this.f3940x) {
            mo12426a().mo12567h();
            Boolean bool = this.f3941y;
            if (bool == null || this.f3942z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f3930n.mo11379b() - this.f3942z) > 1000)) {
                this.f3942z = this.f3930n.mo11379b();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(mo12412G().mo12980z0("android.permission.INTERNET") && mo12412G().mo12980z0("android.permission.ACCESS_NETWORK_STATE") && (C1620c.m4502a(this.f3917a).mo11305g() || this.f3923g.mo12468Q() || (C2329t4.m7638b(this.f3917a) && C2323s9.m7562W(this.f3917a, false))));
                this.f3941y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo12412G().mo12970g0(mo12424S().mo12983D(), mo12424S().mo12984E(), mo12424S().mo12985F()) && TextUtils.isEmpty(mo12424S().mo12984E())) {
                        z = false;
                    }
                    this.f3941y = Boolean.valueOf(z);
                }
            }
            return this.f3941y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo12442v() {
        mo12426a().mo12567h();
        m6714z(m6712w());
        String C = mo12424S().mo12982C();
        Pair<String, Boolean> t = mo12406A().mo12764t(C);
        if (!this.f3923g.mo12463J().booleanValue() || ((Boolean) t.second).booleanValue() || TextUtils.isEmpty((CharSequence) t.first)) {
            mo12427b().mo13103N().mo13130a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!m6712w().mo12685w()) {
            mo12427b().mo13099J().mo13130a("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            C2323s9 G = mo12412G();
            URL H = G.mo12951H(mo12424S().mo13112m().mo12457C(), C, (String) t.first, mo12406A().f4243z.mo12849a() - 1);
            C2185g7 w = m6712w();
            C2159e5 e5Var = new C2159e5(this);
            w.mo12567h();
            w.mo13079o();
            C1609u.m4475k(H);
            C1609u.m4475k(e5Var);
            w.mo12426a().mo13118B(new C2209i7(w, C, H, (byte[]) null, (Map<String, String>) null, e5Var));
        }
    }

    /* renamed from: x */
    public final C2117b mo12443x() {
        return this.f3923g;
    }
}
