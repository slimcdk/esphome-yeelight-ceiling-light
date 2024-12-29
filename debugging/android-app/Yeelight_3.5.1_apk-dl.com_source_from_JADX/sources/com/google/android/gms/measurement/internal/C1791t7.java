package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1114gc;
import com.google.android.gms.internal.measurement.C1258pc;
import com.google.android.gms.internal.measurement.C1338ud;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.t7 */
public final class C1791t7 extends C1561b4 {
    @VisibleForTesting

    /* renamed from: c */
    protected C1779s7 f2679c;

    /* renamed from: d */
    private C1730o6 f2680d;

    /* renamed from: e */
    private final Set f2681e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f2682f;

    /* renamed from: g */
    private final AtomicReference f2683g = new AtomicReference();

    /* renamed from: h */
    private final Object f2684h = new Object();
    @GuardedBy("consentLock")

    /* renamed from: i */
    private C1634h f2685i = new C1634h((Boolean) null, (Boolean) null);
    @GuardedBy("consentLock")

    /* renamed from: j */
    private int f2686j = 100;

    /* renamed from: k */
    private final AtomicLong f2687k = new AtomicLong(0);

    /* renamed from: l */
    private long f2688l = -1;

    /* renamed from: m */
    private int f2689m = 100;

    /* renamed from: n */
    final C1607eb f2690n;
    @VisibleForTesting

    /* renamed from: o */
    protected boolean f2691o = true;

    /* renamed from: p */
    private final C1842xa f2692p = new C1642h7(this);

    protected C1791t7(C1717n5 n5Var) {
        super(n5Var);
        this.f2690n = new C1607eb(n5Var);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: Q */
    public final void mo14565q(Bundle bundle, long j) {
        if (TextUtils.isEmpty(this.f2143a.mo14371B().mo14509t())) {
            mo14541G(bundle, 0, j);
        } else {
            this.f2143a.mo14228b().mo14041x().mo14693a("Using developer consent only; google app id found");
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: R */
    public final void m4695R(Boolean bool, boolean z) {
        mo14009h();
        mo14020i();
        this.f2143a.mo14228b().mo14034q().mo14694b("Setting app measurement enabled (FE)", bool);
        this.f2143a.mo14375F().mo14449s(bool);
        if (z) {
            C1764r4 F = this.f2143a.mo14375F();
            C1717n5 n5Var = F.f2143a;
            F.mo14009h();
            SharedPreferences.Editor edit = F.mo14445o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f2143a.mo14396p() || (bool != null && !bool.booleanValue())) {
            m4696S();
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: S */
    public final void m4696S() {
        Long valueOf;
        mo14009h();
        String a = this.f2143a.mo14375F().f2571m.mo14426a();
        if (a != null) {
            if ("unset".equals(a)) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(true != "true".equals(a) ? 0 : 1);
            }
            mo14549O("app", "_npa", valueOf, this.f2143a.mo14229c().mo11029a());
        }
        if (!this.f2143a.mo14395o() || !this.f2691o) {
            this.f2143a.mo14228b().mo14034q().mo14693a("Updating Scion state (FE)");
            this.f2143a.mo14380L().mo14288w();
            return;
        }
        this.f2143a.mo14228b().mo14034q().mo14693a("Recording app launch after enabling measurement for the first time (FE)");
        mo14562i0();
        C1258pc.m2480b();
        if (this.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2440f0)) {
            this.f2143a.mo14381M().f2836d.mo14641a();
        }
        this.f2143a.mo14227a().mo14310z(new C1826w6(this));
    }

    /* renamed from: e0 */
    static /* bridge */ /* synthetic */ void m4697e0(C1791t7 t7Var, C1634h hVar, C1634h hVar2) {
        boolean z;
        zzah[] zzahArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            zzah zzah = zzahArr[i];
            if (!hVar2.mo14221i(zzah) && hVar.mo14221i(zzah)) {
                z = true;
                break;
            }
            i++;
        }
        boolean l = hVar.mo14223l(hVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z || l) {
            t7Var.f2143a.mo14371B().mo14511v();
        }
    }

    /* renamed from: f0 */
    static /* synthetic */ void m4698f0(C1791t7 t7Var, C1634h hVar, int i, long j, boolean z, boolean z2) {
        t7Var.mo14009h();
        t7Var.mo14020i();
        if (j > t7Var.f2688l || !C1634h.m4275j(t7Var.f2689m, i)) {
            C1764r4 F = t7Var.f2143a.mo14375F();
            C1717n5 n5Var = F.f2143a;
            F.mo14009h();
            if (F.mo14453w(i)) {
                SharedPreferences.Editor edit = F.mo14445o().edit();
                edit.putString("consent_settings", hVar.mo14219h());
                edit.putInt("consent_source", i);
                edit.apply();
                t7Var.f2688l = j;
                t7Var.f2689m = i;
                t7Var.f2143a.mo14380L().mo14285t(z);
                if (z2) {
                    t7Var.f2143a.mo14380L().mo14275S(new AtomicReference());
                    return;
                }
                return;
            }
            t7Var.f2143a.mo14228b().mo14038u().mo14694b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        t7Var.f2143a.mo14228b().mo14038u().mo14694b("Dropped out-of-date consent setting, proposed settings", hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo14535A(long j, boolean z) {
        mo14009h();
        mo14020i();
        this.f2143a.mo14228b().mo14034q().mo14693a("Resetting analytics data (FE)");
        C1865z9 M = this.f2143a.mo14381M();
        M.mo14009h();
        M.f2837e.mo14631a();
        C1338ud.m3082b();
        if (this.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2403G0)) {
            this.f2143a.mo14371B().mo14511v();
        }
        boolean o = this.f2143a.mo14395o();
        C1764r4 F = this.f2143a.mo14375F();
        F.f2563e.mo14369b(j);
        if (!TextUtils.isEmpty(F.f2143a.mo14375F().f2578t.mo14426a())) {
            F.f2578t.mo14427b((String) null);
        }
        C1258pc.m2480b();
        C1621g z2 = F.f2143a.mo14402z();
        C1715n3 n3Var = C1727o3.f2440f0;
        if (z2.mo14163B((String) null, n3Var)) {
            F.f2573o.mo14369b(0);
        }
        if (!F.f2143a.mo14402z().mo14166E()) {
            F.mo14450t(!o);
        }
        F.f2579u.mo14427b((String) null);
        F.f2580v.mo14369b(0);
        F.f2581w.mo14360b((Bundle) null);
        if (z) {
            this.f2143a.mo14380L().mo14282q();
        }
        C1258pc.m2480b();
        if (this.f2143a.mo14402z().mo14163B((String) null, n3Var)) {
            this.f2143a.mo14381M().f2836d.mo14641a();
        }
        this.f2691o = !o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo14536B(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f2143a.mo14227a().mo14310z(new C1850y6(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo14537C(String str, String str2, long j, Object obj) {
        this.f2143a.mo14227a().mo14310z(new C1862z6(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo14538D(String str) {
        this.f2683g.set(str);
    }

    /* renamed from: E */
    public final void mo14539E(Bundle bundle) {
        mo14540F(bundle, this.f2143a.mo14229c().mo11029a());
    }

    /* renamed from: F */
    public final void mo14540F(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C0917i.m1419j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(Constants.APP_ID))) {
            this.f2143a.mo14228b().mo14040w().mo14693a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(Constants.APP_ID);
        C0917i.m1419j(bundle2);
        C1680k6.m4403a(bundle2, Constants.APP_ID, cls2, (Object) null);
        C1680k6.m4403a(bundle2, "origin", cls2, (Object) null);
        C1680k6.m4403a(bundle2, "name", cls2, (Object) null);
        C1680k6.m4403a(bundle2, "value", Object.class, (Object) null);
        C1680k6.m4403a(bundle2, "trigger_event_name", cls2, (Object) null);
        C1680k6.m4403a(bundle2, "trigger_timeout", cls, 0L);
        C1680k6.m4403a(bundle2, "timed_out_event_name", cls2, (Object) null);
        C1680k6.m4403a(bundle2, "timed_out_event_params", Bundle.class, (Object) null);
        C1680k6.m4403a(bundle2, "triggered_event_name", cls2, (Object) null);
        C1680k6.m4403a(bundle2, "triggered_event_params", Bundle.class, (Object) null);
        C1680k6.m4403a(bundle2, "time_to_live", cls, 0L);
        C1680k6.m4403a(bundle2, "expired_event_name", cls2, (Object) null);
        C1680k6.m4403a(bundle2, "expired_event_params", Bundle.class, (Object) null);
        C0917i.m1415f(bundle2.getString("name"));
        C0917i.m1415f(bundle2.getString("origin"));
        C0917i.m1419j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f2143a.mo14382N().mo14672n0(string) != 0) {
            this.f2143a.mo14228b().mo14035r().mo14694b("Invalid conditional user property name", this.f2143a.mo14373D().mo14619f(string));
        } else if (this.f2143a.mo14382N().mo14668j0(string, obj) == 0) {
            Object p = this.f2143a.mo14382N().mo14675p(string, obj);
            if (p == null) {
                this.f2143a.mo14228b().mo14035r().mo14695c("Unable to normalize conditional user property value", this.f2143a.mo14373D().mo14619f(string), obj);
                return;
            }
            C1680k6.m4404b(bundle2, p);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f2143a.mo14402z();
                if (j2 > 15552000000L || j2 < 1) {
                    this.f2143a.mo14228b().mo14035r().mo14695c("Invalid conditional user property timeout", this.f2143a.mo14373D().mo14619f(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            this.f2143a.mo14402z();
            if (j3 > 15552000000L || j3 < 1) {
                this.f2143a.mo14228b().mo14035r().mo14695c("Invalid conditional user property time to live", this.f2143a.mo14373D().mo14619f(string), Long.valueOf(j3));
            } else {
                this.f2143a.mo14227a().mo14310z(new C1564b7(this, bundle2));
            }
        } else {
            this.f2143a.mo14228b().mo14035r().mo14695c("Invalid conditional user property value", this.f2143a.mo14373D().mo14619f(string), obj);
        }
    }

    /* renamed from: G */
    public final void mo14541G(Bundle bundle, int i, long j) {
        mo14020i();
        String g = C1634h.m4274g(bundle);
        if (g != null) {
            this.f2143a.mo14228b().mo14041x().mo14694b("Ignoring invalid consent setting", g);
            this.f2143a.mo14228b().mo14041x().mo14693a("Valid consent values are 'granted', 'denied'");
        }
        mo14542H(C1634h.m4272a(bundle), i, j);
    }

    /* renamed from: H */
    public final void mo14542H(C1634h hVar, int i, long j) {
        C1634h hVar2;
        boolean z;
        boolean z2;
        boolean z3;
        C1634h hVar3 = hVar;
        int i2 = i;
        mo14020i();
        if (i2 != -10 && hVar.mo14216e() == null && hVar.mo14218f() == null) {
            this.f2143a.mo14228b().mo14041x().mo14693a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f2684h) {
            hVar2 = this.f2685i;
            z = true;
            z2 = false;
            if (C1634h.m4275j(i2, this.f2686j)) {
                boolean k = hVar3.mo14222k(this.f2685i);
                zzah zzah = zzah.ANALYTICS_STORAGE;
                if (hVar3.mo14221i(zzah) && !this.f2685i.mo14221i(zzah)) {
                    z2 = true;
                }
                hVar3 = hVar3.mo14215d(this.f2685i);
                this.f2685i = hVar3;
                this.f2686j = i2;
                z3 = z2;
                z2 = k;
            } else {
                z = false;
                z3 = false;
            }
        }
        if (!z) {
            this.f2143a.mo14228b().mo14038u().mo14694b("Ignoring lower-priority consent settings, proposed settings", hVar3);
            return;
        }
        long andIncrement = this.f2687k.getAndIncrement();
        if (z2) {
            this.f2683g.set((Object) null);
            this.f2143a.mo14227a().mo14304A(new C1719n7(this, hVar3, j, i, andIncrement, z3, hVar2));
            return;
        }
        C1731o7 o7Var = new C1731o7(this, hVar3, i, andIncrement, z3, hVar2);
        if (i2 == 30 || i2 == -10) {
            this.f2143a.mo14227a().mo14304A(o7Var);
        } else {
            this.f2143a.mo14227a().mo14310z(o7Var);
        }
    }

    /* renamed from: I */
    public final void mo14543I(Bundle bundle, long j) {
        C1114gc.m2025b();
        if (this.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2448j0)) {
            this.f2143a.mo14227a().mo14304A(new C1778s6(this, bundle, j));
        } else {
            mo14565q(bundle, j);
        }
    }

    @WorkerThread
    /* renamed from: J */
    public final void mo14544J(C1730o6 o6Var) {
        C1730o6 o6Var2;
        mo14009h();
        mo14020i();
        if (!(o6Var == null || o6Var == (o6Var2 = this.f2680d))) {
            C0917i.m1424o(o6Var2 == null, "EventInterceptor already set.");
        }
        this.f2680d = o6Var;
    }

    /* renamed from: K */
    public final void mo14545K(Boolean bool) {
        mo14020i();
        this.f2143a.mo14227a().mo14310z(new C1707m7(this, bool));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: L */
    public final void mo14546L(C1634h hVar) {
        mo14009h();
        boolean z = (hVar.mo14221i(zzah.ANALYTICS_STORAGE) && hVar.mo14221i(zzah.AD_STORAGE)) || this.f2143a.mo14380L().mo14268A();
        if (z != this.f2143a.mo14396p()) {
            this.f2143a.mo14392l(z);
            C1764r4 F = this.f2143a.mo14375F();
            C1717n5 n5Var = F.f2143a;
            F.mo14009h();
            Boolean valueOf = F.mo14445o().contains("measurement_enabled_from_api") ? Boolean.valueOf(F.mo14445o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                m4695R(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: M */
    public final void mo14547M(String str, String str2, Object obj, boolean z) {
        mo14548N("auto", "_ldl", obj, true, this.f2143a.mo14229c().mo11029a());
    }

    /* renamed from: N */
    public final void mo14548N(String str, String str2, Object obj, boolean z, long j) {
        int i;
        String str3 = str2;
        Object obj2 = obj;
        String str4 = str == null ? "app" : str;
        if (z) {
            i = this.f2143a.mo14382N().mo14672n0(str3);
        } else {
            C1854ya N = this.f2143a.mo14382N();
            if (N.mo14661R("user property", str3)) {
                if (!N.mo14657N("user property", C1718n6.f2367a, (String[]) null, str3)) {
                    i = 15;
                } else {
                    N.f2143a.mo14402z();
                    if (N.mo14656M("user property", 24, str3)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        if (i != 0) {
            C1854ya N2 = this.f2143a.mo14382N();
            this.f2143a.mo14402z();
            this.f2143a.mo14382N().mo14645B(this.f2692p, (String) null, i, "_ev", N2.mo14678r(str3, 24, true), str3 != null ? str2.length() : 0);
        } else if (obj2 != null) {
            int j0 = this.f2143a.mo14382N().mo14668j0(str3, obj2);
            if (j0 != 0) {
                C1854ya N3 = this.f2143a.mo14382N();
                this.f2143a.mo14402z();
                this.f2143a.mo14382N().mo14645B(this.f2692p, (String) null, j0, "_ev", N3.mo14678r(str3, 24, true), ((obj2 instanceof String) || (obj2 instanceof CharSequence)) ? obj.toString().length() : 0);
                return;
            }
            Object p = this.f2143a.mo14382N().mo14675p(str3, obj2);
            if (p != null) {
                mo14537C(str4, str2, j, p);
            }
        } else {
            mo14537C(str4, str2, j, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    @androidx.annotation.WorkerThread
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14549O(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C0917i.m1415f(r9)
            com.google.android.gms.common.internal.C0917i.m1415f(r10)
            r8.mo14009h()
            r8.mo14020i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0061
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x004f
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x004f
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L_0x0037
            r10 = 0
            goto L_0x0038
        L_0x0037:
            r10 = r2
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.n5 r10 = r8.f2143a
            com.google.android.gms.measurement.internal.r4 r10 = r10.mo14375F()
            com.google.android.gms.measurement.internal.q4 r10 = r10.f2571m
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x005b
            java.lang.String r0 = "true"
            goto L_0x005b
        L_0x004f:
            if (r11 != 0) goto L_0x0061
            com.google.android.gms.measurement.internal.n5 r10 = r8.f2143a
            com.google.android.gms.measurement.internal.r4 r10 = r10.mo14375F()
            com.google.android.gms.measurement.internal.q4 r10 = r10.f2571m
            java.lang.String r0 = "unset"
        L_0x005b:
            r10.mo14427b(r0)
            r6 = r11
            r3 = r1
            goto L_0x0063
        L_0x0061:
            r3 = r10
            r6 = r11
        L_0x0063:
            com.google.android.gms.measurement.internal.n5 r10 = r8.f2143a
            boolean r10 = r10.mo14395o()
            if (r10 != 0) goto L_0x007b
            com.google.android.gms.measurement.internal.n5 r9 = r8.f2143a
            com.google.android.gms.measurement.internal.c4 r9 = r9.mo14228b()
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo14039v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo14693a(r10)
            return
        L_0x007b:
            com.google.android.gms.measurement.internal.n5 r10 = r8.f2143a
            boolean r10 = r10.mo14398r()
            if (r10 != 0) goto L_0x0084
            return
        L_0x0084:
            com.google.android.gms.measurement.internal.zzlo r10 = new com.google.android.gms.measurement.internal.zzlo
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.n5 r9 = r8.f2143a
            com.google.android.gms.measurement.internal.j9 r9 = r9.mo14380L()
            r9.mo14290y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1791t7.mo14549O(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: P */
    public final void mo14550P(C1742p6 p6Var) {
        mo14020i();
        C0917i.m1419j(p6Var);
        if (!this.f2681e.remove(p6Var)) {
            this.f2143a.mo14228b().mo14040w().mo14693a("OnEventListener had not been registered");
        }
    }

    /* renamed from: T */
    public final int mo14551T(String str) {
        C0917i.m1415f(str);
        this.f2143a.mo14402z();
        return 25;
    }

    /* renamed from: U */
    public final Boolean mo14552U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f2143a.mo14227a().mo14306r(atomicReference, 15000, "boolean test flag value", new C1616f7(this, atomicReference));
    }

    /* renamed from: V */
    public final Double mo14553V() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f2143a.mo14227a().mo14306r(atomicReference, 15000, "double test flag value", new C1694l7(this, atomicReference));
    }

    /* renamed from: W */
    public final Integer mo14554W() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f2143a.mo14227a().mo14306r(atomicReference, 15000, "int test flag value", new C1681k7(this, atomicReference));
    }

    /* renamed from: X */
    public final Long mo14555X() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f2143a.mo14227a().mo14306r(atomicReference, 15000, "long test flag value", new C1668j7(this, atomicReference));
    }

    /* renamed from: Y */
    public final String mo14556Y() {
        return (String) this.f2683g.get();
    }

    /* renamed from: Z */
    public final String mo14557Z() {
        C1552a8 s = this.f2143a.mo14379K().mo14264s();
        if (s != null) {
            return s.f1924b;
        }
        return null;
    }

    /* renamed from: a0 */
    public final String mo14558a0() {
        C1552a8 s = this.f2143a.mo14379K().mo14264s();
        if (s != null) {
            return s.f1923a;
        }
        return null;
    }

    /* renamed from: b0 */
    public final String mo14559b0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f2143a.mo14227a().mo14306r(atomicReference, 15000, "String test flag value", new C1655i7(this, atomicReference));
    }

    /* renamed from: c0 */
    public final ArrayList mo14560c0(String str, String str2) {
        if (this.f2143a.mo14227a().mo14305C()) {
            this.f2143a.mo14228b().mo14035r().mo14693a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f2143a.mo14230d();
        if (C1569c.m4075a()) {
            this.f2143a.mo14228b().mo14035r().mo14693a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f2143a.mo14227a().mo14306r(atomicReference, 5000, "get conditional user properties", new C1603e7(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C1854ya.m4844v(list);
        }
        this.f2143a.mo14228b().mo14035r().mo14694b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    /* renamed from: d0 */
    public final Map mo14561d0(String str, String str2, boolean z) {
        C1859z3 r;
        String str3;
        if (this.f2143a.mo14227a().mo14305C()) {
            r = this.f2143a.mo14228b().mo14035r();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            this.f2143a.mo14230d();
            if (C1569c.m4075a()) {
                r = this.f2143a.mo14228b().mo14035r();
                str3 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                this.f2143a.mo14227a().mo14306r(atomicReference, 5000, "get user properties", new C1629g7(this, atomicReference, (String) null, str, str2, z));
                List<zzlo> list = (List) atomicReference.get();
                if (list == null) {
                    this.f2143a.mo14228b().mo14035r().mo14694b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                ArrayMap arrayMap = new ArrayMap(list.size());
                for (zzlo zzlo : list) {
                    Object V = zzlo.mo14714V();
                    if (V != null) {
                        arrayMap.put(zzlo.f2860b, V);
                    }
                }
                return arrayMap;
            }
        }
        r.mo14693a(str3);
        return Collections.emptyMap();
    }

    @WorkerThread
    /* renamed from: i0 */
    public final void mo14562i0() {
        mo14009h();
        mo14020i();
        if (this.f2143a.mo14398r()) {
            if (this.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2428Z)) {
                C1621g z = this.f2143a.mo14402z();
                z.f2143a.mo14230d();
                Boolean t = z.mo14179t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    this.f2143a.mo14228b().mo14034q().mo14693a("Deferred Deep Link feature enabled.");
                    this.f2143a.mo14227a().mo14310z(new C1814v6(this));
                }
            }
            this.f2143a.mo14380L().mo14271O();
            this.f2691o = false;
            C1764r4 F = this.f2143a.mo14375F();
            F.mo14009h();
            String string = F.mo14445o().getString("previous_os_version", (String) null);
            F.f2143a.mo14370A().mo14241k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.mo14445o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f2143a.mo14370A().mo14241k();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo14570v("auto", "_ou", bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo14025n() {
        return false;
    }

    /* renamed from: o */
    public final void mo14563o(String str, String str2, Bundle bundle) {
        long a = this.f2143a.mo14229c().mo11029a();
        C0917i.m1415f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f2143a.mo14227a().mo14310z(new C1577c7(this, bundle2));
    }

    /* renamed from: p */
    public final void mo14564p() {
        if ((this.f2143a.mo14231f().getApplicationContext() instanceof Application) && this.f2679c != null) {
            ((Application) this.f2143a.mo14231f().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f2679c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo14566r(Bundle bundle) {
        if (bundle == null) {
            this.f2143a.mo14375F().f2581w.mo14360b(new Bundle());
            return;
        }
        Bundle a = this.f2143a.mo14375F().f2581w.mo14359a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f2143a.mo14382N().mo14664U(obj)) {
                    this.f2143a.mo14382N().mo14645B(this.f2692p, (String) null, 27, (String) null, (String) null, 0);
                }
                this.f2143a.mo14228b().mo14041x().mo14695c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C1854ya.m4831W(str)) {
                this.f2143a.mo14228b().mo14041x().mo14694b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else {
                C1854ya N = this.f2143a.mo14382N();
                this.f2143a.mo14402z();
                if (N.mo14659P("param", str, 100, obj)) {
                    this.f2143a.mo14382N().mo14646C(a, str, obj);
                }
            }
        }
        this.f2143a.mo14382N();
        int m = this.f2143a.mo14402z().mo14172m();
        if (a.size() > m) {
            int i = 0;
            for (String str2 : new TreeSet(a.keySet())) {
                i++;
                if (i > m) {
                    a.remove(str2);
                }
            }
            this.f2143a.mo14382N().mo14645B(this.f2692p, (String) null, 26, (String) null, (String) null, 0);
            this.f2143a.mo14228b().mo14041x().mo14693a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f2143a.mo14375F().f2581w.mo14360b(a);
        this.f2143a.mo14380L().mo14287v(a);
    }

    /* renamed from: s */
    public final void mo14567s(String str, String str2, Bundle bundle) {
        mo14568t(str, str2, bundle, true, true, this.f2143a.mo14229c().mo11029a());
    }

    /* renamed from: t */
    public final void mo14568t(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str2;
        String str4 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str3 == "screen_view" || (str3 != null && str2.equals("screen_view"))) {
            this.f2143a.mo14379K().mo14262F(bundle2, j);
        } else {
            mo14536B(str4, str2, j, bundle2, z2, !z2 || this.f2680d == null || C1854ya.m4831W(str2), z, (String) null);
        }
    }

    /* renamed from: u */
    public final void mo14569u(String str, String str2, Bundle bundle, String str3) {
        C1717n5.m4487t();
        mo14536B("auto", str2, this.f2143a.mo14229c().mo11029a(), bundle, false, true, true, str3);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: v */
    public final void mo14570v(String str, String str2, Bundle bundle) {
        mo14009h();
        mo14571w(str, str2, this.f2143a.mo14229c().mo11029a(), bundle);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final void mo14571w(String str, String str2, long j, Bundle bundle) {
        mo14009h();
        mo14572x(str, str2, j, bundle, true, this.f2680d == null || C1854ya.m4831W(str2), true, (String) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: android.os.Bundle[]} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a5, code lost:
        if (r27 == false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c3, code lost:
        if (r27 == false) goto L_0x01c5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0222  */
    @androidx.annotation.WorkerThread
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14572x(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.common.internal.C0917i.m1415f(r20)
            com.google.android.gms.common.internal.C0917i.m1419j(r24)
            r19.mo14009h()
            r19.mo14020i()
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            boolean r1 = r1.mo14395o()
            if (r1 == 0) goto L_0x0509
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo14371B()
            java.util.List r1 = r1.mo14510u()
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0033
            goto L_0x0043
        L_0x0033:
            com.google.android.gms.measurement.internal.n5 r0 = r7.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14034q()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo14695c(r1, r9, r8)
            return
        L_0x0043:
            boolean r1 = r7.f2682f
            r13 = 0
            r14 = 0
            r15 = 1
            if (r1 != 0) goto L_0x00a1
            r7.f2682f = r15
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r1 = r1.mo14399s()     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r1 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r1 = r1.mo14231f()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            com.google.android.gms.measurement.internal.n5 r2 = r7.f2143a     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.mo14231f()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo14228b()     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14040w()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo14694b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            com.google.android.gms.measurement.internal.n5 r0 = r7.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14038u()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo14693a(r1)
        L_0x00a1:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00cd
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            r1.mo14230d()
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.n5 r0 = r7.f2143a
            c0.e r0 = r0.mo14229c()
            long r5 = r0.mo11029a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r19
            r1.mo14549O(r2, r3, r4, r5)
        L_0x00cd:
            com.google.android.gms.measurement.internal.n5 r0 = r7.f2143a
            r0.mo14230d()
            if (r25 == 0) goto L_0x00ef
            boolean r0 = com.google.android.gms.measurement.internal.C1854ya.m4835a0(r21)
            if (r0 == 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.n5 r0 = r7.f2143a
            com.google.android.gms.measurement.internal.ya r0 = r0.mo14382N()
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.r4 r1 = r1.mo14375F()
            com.google.android.gms.measurement.internal.m4 r1 = r1.f2581w
            android.os.Bundle r1 = r1.mo14359a()
            r0.mo14689z(r12, r1)
        L_0x00ef:
            r0 = 40
            if (r27 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            r1.mo14230d()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.ya r1 = r1.mo14382N()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo14661R(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            java.lang.String[] r3 = com.google.android.gms.measurement.internal.C1693l6.f2269a
            java.lang.String[] r5 = com.google.android.gms.measurement.internal.C1693l6.f2270b
            boolean r3 = r1.mo14657N(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x011d
            r4 = 13
            goto L_0x012a
        L_0x011d:
            com.google.android.gms.measurement.internal.n5 r3 = r1.f2143a
            r3.mo14402z()
            boolean r1 = r1.mo14656M(r2, r0, r9)
            if (r1 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r4 = 0
        L_0x012a:
            if (r4 == 0) goto L_0x0177
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo14228b()
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14036s()
            com.google.android.gms.measurement.internal.n5 r2 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo14373D()
            java.lang.String r2 = r2.mo14617d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo14694b(r3, r2)
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.ya r1 = r1.mo14382N()
            com.google.android.gms.measurement.internal.n5 r2 = r7.f2143a
            r2.mo14402z()
            java.lang.String r0 = r1.mo14678r(r9, r0, r15)
            if (r9 == 0) goto L_0x015a
            int r14 = r21.length()
        L_0x015a:
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.ya r1 = r1.mo14382N()
            com.google.android.gms.measurement.internal.xa r2 = r7.f2692p
            r3 = 0
            java.lang.String r5 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r14
            r20.mo14645B(r21, r22, r23, r24, r25, r26)
            return
        L_0x0177:
            com.google.android.gms.internal.measurement.C1291rd.m2726b()
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.g r1 = r1.mo14402z()
            com.google.android.gms.measurement.internal.n3 r2 = com.google.android.gms.measurement.internal.C1727o3.f2464r0
            boolean r1 = r1.mo14163B(r13, r2)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x01a8
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            r1.mo14230d()
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.j8 r1 = r1.mo14379K()
            com.google.android.gms.measurement.internal.a8 r1 = r1.mo14265t(r14)
            if (r1 == 0) goto L_0x01a3
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01a3
            r1.f1926d = r15
        L_0x01a3:
            if (r25 == 0) goto L_0x01c7
            if (r27 != 0) goto L_0x01c7
            goto L_0x01c5
        L_0x01a8:
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            r1.mo14230d()
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.j8 r1 = r1.mo14379K()
            com.google.android.gms.measurement.internal.a8 r1 = r1.mo14265t(r14)
            if (r1 == 0) goto L_0x01c1
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01c1
            r1.f1926d = r15
        L_0x01c1:
            if (r25 == 0) goto L_0x01c7
            if (r27 != 0) goto L_0x01c7
        L_0x01c5:
            r3 = 1
            goto L_0x01c8
        L_0x01c7:
            r3 = 0
        L_0x01c8:
            com.google.android.gms.measurement.internal.C1854ya.m4845y(r1, r12, r3)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.C1854ya.m4831W(r21)
            if (r25 == 0) goto L_0x0218
            com.google.android.gms.measurement.internal.o6 r4 = r7.f2680d
            if (r4 == 0) goto L_0x0218
            if (r3 != 0) goto L_0x0218
            if (r1 == 0) goto L_0x01e2
            r16 = 1
            goto L_0x021a
        L_0x01e2:
            com.google.android.gms.measurement.internal.n5 r0 = r7.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14034q()
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r1 = r1.mo14373D()
            java.lang.String r1 = r1.mo14617d(r9)
            com.google.android.gms.measurement.internal.n5 r2 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo14373D()
            java.lang.String r2 = r2.mo14615b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo14695c(r3, r1, r2)
            com.google.android.gms.measurement.internal.o6 r0 = r7.f2680d
            com.google.android.gms.common.internal.C0917i.m1419j(r0)
            com.google.android.gms.measurement.internal.o6 r1 = r7.f2680d
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.mo14030a(r2, r3, r4, r5)
            return
        L_0x0218:
            r16 = r1
        L_0x021a:
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            boolean r1 = r1.mo14398r()
            if (r1 == 0) goto L_0x0508
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.ya r1 = r1.mo14382N()
            int r1 = r1.mo14669k0(r9)
            if (r1 == 0) goto L_0x0278
            com.google.android.gms.measurement.internal.n5 r2 = r7.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14036s()
            com.google.android.gms.measurement.internal.n5 r3 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo14373D()
            java.lang.String r3 = r3.mo14617d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.mo14694b(r4, r3)
            com.google.android.gms.measurement.internal.n5 r2 = r7.f2143a
            com.google.android.gms.measurement.internal.ya r2 = r2.mo14382N()
            com.google.android.gms.measurement.internal.n5 r3 = r7.f2143a
            r3.mo14402z()
            java.lang.String r0 = r2.mo14678r(r9, r0, r15)
            if (r9 == 0) goto L_0x025c
            int r14 = r21.length()
        L_0x025c:
            com.google.android.gms.measurement.internal.n5 r2 = r7.f2143a
            com.google.android.gms.measurement.internal.ya r2 = r2.mo14382N()
            com.google.android.gms.measurement.internal.xa r3 = r7.f2692p
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r14
            r20.mo14645B(r21, r22, r23, r24, r25, r26)
            return
        L_0x0278:
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r3 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r5 = p014c0.C0617f.m206c(r1)
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.ya r1 = r1.mo14382N()
            r2 = r28
            r3 = r21
            r4 = r24
            r6 = r27
            android.os.Bundle r12 = r1.mo14685v0(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.C0917i.m1419j(r12)
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            r1.mo14230d()
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.j8 r1 = r1.mo14379K()
            com.google.android.gms.measurement.internal.a8 r1 = r1.mo14265t(r14)
            r5 = 0
            java.lang.String r4 = "_ae"
            if (r1 == 0) goto L_0x02dd
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x02dd
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.z9 r1 = r1.mo14381M()
            com.google.android.gms.measurement.internal.x9 r1 = r1.f2837e
            com.google.android.gms.measurement.internal.z9 r2 = r1.f2773d
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            c0.e r2 = r2.mo14229c()
            long r2 = r2.mo11030b()
            long r14 = r1.f2771b
            long r14 = r2 - r14
            r1.f2771b = r2
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x02dd
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.ya r1 = r1.mo14382N()
            r1.mo14686w(r12, r14)
        L_0x02dd:
            com.google.android.gms.internal.measurement.C1066dc.m1863b()
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.g r1 = r1.mo14402z()
            com.google.android.gms.measurement.internal.n3 r2 = com.google.android.gms.measurement.internal.C1727o3.f2438e0
            boolean r1 = r1.mo14163B(r13, r2)
            if (r1 == 0) goto L_0x0367
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0346
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0346
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.ya r1 = r1.mo14382N()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = com.google.android.gms.common.util.C0962c.m1590a(r2)
            if (r3 == 0) goto L_0x0312
            r2 = r13
            goto L_0x0318
        L_0x0312:
            if (r2 == 0) goto L_0x0318
            java.lang.String r2 = r2.trim()
        L_0x0318:
            com.google.android.gms.measurement.internal.n5 r3 = r1.f2143a
            com.google.android.gms.measurement.internal.r4 r3 = r3.mo14375F()
            com.google.android.gms.measurement.internal.q4 r3 = r3.f2578t
            java.lang.String r3 = r3.mo14426a()
            boolean r3 = com.google.android.gms.measurement.internal.C1830wa.m4815a(r2, r3)
            if (r3 != 0) goto L_0x0336
            com.google.android.gms.measurement.internal.n5 r1 = r1.f2143a
            com.google.android.gms.measurement.internal.r4 r1 = r1.mo14375F()
            com.google.android.gms.measurement.internal.q4 r1 = r1.f2578t
            r1.mo14427b(r2)
            goto L_0x0367
        L_0x0336:
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14034q()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo14693a(r1)
            return
        L_0x0346:
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x0367
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.ya r1 = r1.mo14382N()
            com.google.android.gms.measurement.internal.n5 r1 = r1.f2143a
            com.google.android.gms.measurement.internal.r4 r1 = r1.mo14375F()
            com.google.android.gms.measurement.internal.q4 r1 = r1.f2578t
            java.lang.String r1 = r1.mo14426a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0367
            r12.putString(r2, r1)
        L_0x0367:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.r4 r1 = r1.mo14375F()
            com.google.android.gms.measurement.internal.n4 r1 = r1.f2573o
            long r1 = r1.mo14368a()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x03e9
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.r4 r1 = r1.mo14375F()
            boolean r1 = r1.mo14452v(r10)
            if (r1 == 0) goto L_0x03e9
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.r4 r1 = r1.mo14375F()
            com.google.android.gms.measurement.internal.l4 r1 = r1.f2575q
            boolean r1 = r1.mo14351b()
            if (r1 == 0) goto L_0x03e9
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo14228b()
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14039v()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo14693a(r2)
            r15 = 0
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            c0.e r1 = r1.mo14229c()
            long r17 = r1.mo11029a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sid"
            r1 = r19
            r13 = r4
            r4 = r15
            r8 = r5
            r5 = r17
            r1.mo14549O(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            c0.e r1 = r1.mo14229c()
            long r5 = r1.mo11029a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r19
            r1.mo14549O(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            c0.e r1 = r1.mo14229c()
            long r5 = r1.mo11029a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r19
            r1.mo14549O(r2, r3, r4, r5)
            goto L_0x03eb
        L_0x03e9:
            r13 = r4
            r8 = r5
        L_0x03eb:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r8)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0412
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo14228b()
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14039v()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo14693a(r2)
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.z9 r1 = r1.mo14381M()
            com.google.android.gms.measurement.internal.y9 r1 = r1.f2836d
            r2 = 1
            r1.mo14642b(r10, r2)
        L_0x0412:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0423:
            if (r3 >= r2) goto L_0x046e
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x046b
            com.google.android.gms.measurement.internal.n5 r5 = r7.f2143a
            r5.mo14382N()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0443
            r6 = 1
            android.os.Bundle[] r8 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r8[r6] = r5
            goto L_0x0466
        L_0x0443:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x0454
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r8 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r8)
        L_0x0450:
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x0466
        L_0x0454:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x0465
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            goto L_0x0450
        L_0x0465:
            r8 = 0
        L_0x0466:
            if (r8 == 0) goto L_0x046b
            r12.putParcelableArray(r4, r8)
        L_0x046b:
            int r3 = r3 + 1
            goto L_0x0423
        L_0x046e:
            r8 = 0
        L_0x046f:
            int r1 = r14.size()
            if (r8 >= r1) goto L_0x04d8
            java.lang.Object r1 = r14.get(r8)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r8 == 0) goto L_0x0482
            java.lang.String r2 = "_ep"
            r9 = r20
            goto L_0x0486
        L_0x0482:
            r9 = r20
            r2 = r21
        L_0x0486:
            r1.putString(r0, r9)
            if (r26 == 0) goto L_0x0495
            com.google.android.gms.measurement.internal.n5 r3 = r7.f2143a
            com.google.android.gms.measurement.internal.ya r3 = r3.mo14382N()
            android.os.Bundle r1 = r3.mo14684u0(r1)
        L_0x0495:
            r12 = r1
            com.google.android.gms.measurement.internal.zzaw r15 = new com.google.android.gms.measurement.internal.zzaw
            com.google.android.gms.measurement.internal.zzau r3 = new com.google.android.gms.measurement.internal.zzau
            r3.<init>(r12)
            r1 = r15
            r4 = r20
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.j9 r1 = r1.mo14380L()
            r5 = r28
            r1.mo14280o(r15, r5)
            if (r16 != 0) goto L_0x04d5
            java.util.Set r1 = r7.f2681e
            java.util.Iterator r15 = r1.iterator()
        L_0x04b8:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x04d5
            java.lang.Object r1 = r15.next()
            com.google.android.gms.measurement.internal.p6 r1 = (com.google.android.gms.measurement.internal.C1742p6) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r12)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.mo14049a(r2, r3, r4, r5)
            r5 = r28
            goto L_0x04b8
        L_0x04d5:
            int r8 = r8 + 1
            goto L_0x046f
        L_0x04d8:
            com.google.android.gms.measurement.internal.n5 r0 = r7.f2143a
            r0.mo14230d()
            com.google.android.gms.measurement.internal.n5 r0 = r7.f2143a
            com.google.android.gms.measurement.internal.j8 r0 = r0.mo14379K()
            r1 = 0
            com.google.android.gms.measurement.internal.a8 r0 = r0.mo14265t(r1)
            if (r0 == 0) goto L_0x0508
            r1 = r21
            boolean r0 = r13.equals(r1)
            if (r0 == 0) goto L_0x0508
            com.google.android.gms.measurement.internal.n5 r0 = r7.f2143a
            com.google.android.gms.measurement.internal.z9 r0 = r0.mo14381M()
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            c0.e r1 = r1.mo14229c()
            long r1 = r1.mo11030b()
            com.google.android.gms.measurement.internal.x9 r0 = r0.f2837e
            r3 = 1
            r0.mo14634d(r3, r3, r1)
        L_0x0508:
            return
        L_0x0509:
            com.google.android.gms.measurement.internal.n5 r0 = r7.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14034q()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo14693a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1791t7.mo14572x(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: y */
    public final void mo14573y(C1742p6 p6Var) {
        mo14020i();
        C0917i.m1419j(p6Var);
        if (!this.f2681e.add(p6Var)) {
            this.f2143a.mo14228b().mo14040w().mo14693a("OnEventListener already registered");
        }
    }

    /* renamed from: z */
    public final void mo14574z(long j) {
        this.f2683g.set((Object) null);
        this.f2143a.mo14227a().mo14310z(new C1551a7(this, j));
    }
}
