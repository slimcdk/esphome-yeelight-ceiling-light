package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.C1613w;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1944p9;
import com.google.android.gms.internal.measurement.C2051w9;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.h6 */
public final class C2196h6 extends C2133c3 {
    @VisibleForTesting

    /* renamed from: c */
    protected C2113a7 f4157c;

    /* renamed from: d */
    private C2124b6 f4158d;

    /* renamed from: e */
    private final Set<C2172f6> f4159e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f4160f;

    /* renamed from: g */
    private final AtomicReference<String> f4161g = new AtomicReference<>();

    /* renamed from: h */
    final C2378x9 f4162h;
    @VisibleForTesting

    /* renamed from: i */
    protected boolean f4163i = true;

    protected C2196h6(C2111a5 a5Var) {
        super(a5Var);
        this.f4162h = new C2378x9(a5Var);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: A0 */
    public final void m7069A0(Bundle bundle) {
        Bundle bundle2 = bundle;
        mo12567h();
        mo12537x();
        C1609u.m4475k(bundle);
        C1609u.m4471g(bundle2.getString("name"));
        if (!this.f4689a.mo12436p()) {
            mo12427b().mo13104O().mo13130a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzkn zzkn = new zzkn(bundle2.getString("name"), 0, (Object) null, (String) null);
        try {
            zzaq D = mo13110k().mo12948D(bundle2.getString(Constants.APP_ID), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString("origin"), bundle2.getLong("creation_timestamp"), true, false);
            zzkn zzkn2 = zzkn;
            mo12572r().mo12916Q(new zzy(bundle2.getString(Constants.APP_ID), bundle2.getString("origin"), zzkn2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), (zzaq) null, bundle2.getLong("trigger_timeout"), (zzaq) null, bundle2.getLong("time_to_live"), D));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: B0 */
    public final void m7070B0(boolean z) {
        mo12567h();
        mo12566d();
        mo12537x();
        mo12427b().mo13103N().mo13131b("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        mo13111l().mo12768x(z);
        m7075l0();
    }

    /* renamed from: R */
    private final void m7074R(String str, String str2, long j, Object obj) {
        mo12426a().mo13122y(new C2254m6(this, str, str2, obj, j));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: l0 */
    public final void m7075l0() {
        mo12567h();
        String a = mo13111l().f4236s.mo12869a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo12712V("app", "_npa", (Object) null, mo12429f().mo11378a());
            } else {
                mo12712V("app", "_npa", Long.valueOf("true".equals(a) ? 1 : 0), mo12429f().mo11378a());
            }
        }
        if (!this.f4689a.mo12436p() || !this.f4163i) {
            mo12427b().mo13103N().mo13130a("Updating Scion state (FE)");
            mo12572r().mo12921W();
            return;
        }
        mo12427b().mo13103N().mo13130a("Recording app launch after enabling measurement for the first time (FE)");
        mo12724h0();
        if (C2051w9.m6284a() && mo13112m().mo12474s(C2302r.f4548x0)) {
            mo12575u().f4696d.mo12662a();
        }
        if (C1944p9.m5815a() && mo13112m().mo12474s(C2302r.f4462C0)) {
            if (!(this.f4689a.mo12409D().f4578a.mo12406A().f4228k.mo12849a() > 0)) {
                C2318s4 D = this.f4689a.mo12409D();
                D.f4578a.mo12438r();
                D.mo12939b(D.f4578a.mo12428c().getPackageName());
            }
        }
        if (mo13112m().mo12474s(C2302r.f4490Q0)) {
            mo12426a().mo13122y(new C2386y6(this));
        }
    }

    @VisibleForTesting
    /* renamed from: m0 */
    private final ArrayList<Bundle> m7076m0(String str, String str2, String str3) {
        if (mo12426a().mo13119G()) {
            mo12427b().mo13096F().mo13130a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (C2176fa.m7021a()) {
            mo12427b().mo13096F().mo13130a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f4689a.mo12426a().mo13120u(atomicReference, 5000, "get conditional user properties", new C2331t6(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return C2323s9.m7573p0(list);
            }
            mo12427b().mo13096F().mo13131b("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    @VisibleForTesting
    /* renamed from: n0 */
    private final Map<String, Object> m7077n0(String str, String str2, String str3, boolean z) {
        C2383y3 F;
        String str4;
        if (mo12426a().mo13119G()) {
            F = mo12427b().mo13096F();
            str4 = "Cannot get user properties from analytics worker thread";
        } else if (C2176fa.m7021a()) {
            F = mo12427b().mo13096F();
            str4 = "Cannot get user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f4689a.mo12426a().mo13120u(atomicReference, 5000, "get user properties", new C2320s6(this, atomicReference, str, str2, str3, z));
            List<zzkn> list = (List) atomicReference.get();
            if (list == null) {
                mo12427b().mo13096F().mo13131b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = new ArrayMap(list.size());
            for (zzkn zzkn : list) {
                arrayMap.put(zzkn.f4771b, zzkn.mo13160Q());
            }
            return arrayMap;
        }
        F.mo13130a(str4);
        return Collections.emptyMap();
    }

    /* renamed from: q0 */
    private final void m7078q0(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C1609u.m4475k(bundle);
        C2374x5.m7762a(bundle, Constants.APP_ID, cls2, null);
        C2374x5.m7762a(bundle, "origin", cls2, null);
        C2374x5.m7762a(bundle, "name", cls2, null);
        C2374x5.m7762a(bundle, "value", Object.class, null);
        C2374x5.m7762a(bundle, "trigger_event_name", cls2, null);
        C2374x5.m7762a(bundle, "trigger_timeout", cls, 0L);
        C2374x5.m7762a(bundle, "timed_out_event_name", cls2, null);
        C2374x5.m7762a(bundle, "timed_out_event_params", Bundle.class, null);
        C2374x5.m7762a(bundle, "triggered_event_name", cls2, null);
        C2374x5.m7762a(bundle, "triggered_event_params", Bundle.class, null);
        C2374x5.m7762a(bundle, "time_to_live", cls, 0L);
        C2374x5.m7762a(bundle, "expired_event_name", cls2, null);
        C2374x5.m7762a(bundle, "expired_event_params", Bundle.class, null);
        C1609u.m4471g(bundle.getString("name"));
        C1609u.m4471g(bundle.getString("origin"));
        C1609u.m4475k(bundle.get("value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (mo13110k().mo12976v0(string) != 0) {
            mo12427b().mo13096F().mo13131b("Invalid conditional user property name", mo13109j().mo12997z(string));
        } else if (mo13110k().mo12973n0(string, obj) != 0) {
            mo12427b().mo13096F().mo13132c("Invalid conditional user property value", mo13109j().mo12997z(string), obj);
        } else {
            Object w0 = mo13110k().mo12978w0(string, obj);
            if (w0 == null) {
                mo12427b().mo13096F().mo13132c("Unable to normalize conditional user property value", mo13109j().mo12997z(string), obj);
                return;
            }
            C2374x5.m7763b(bundle, w0);
            long j2 = bundle.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle.getString("trigger_event_name")) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle.getLong("time_to_live");
                if (j3 > 15552000000L || j3 < 1) {
                    mo12427b().mo13096F().mo13132c("Invalid conditional user property time to live", mo13109j().mo12997z(string), Long.valueOf(j3));
                } else {
                    mo12426a().mo13122y(new C2276o6(this, bundle));
                }
            } else {
                mo12427b().mo13096F().mo13132c("Invalid conditional user property timeout", mo13109j().mo12997z(string), Long.valueOf(j2));
            }
        }
    }

    /* renamed from: t0 */
    private final void m7080t0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        mo12426a().mo13122y(new C2231k6(this, str, str2, j, C2323s9.m7572o0(bundle), z, z2, z3, str3));
    }

    /* renamed from: v0 */
    private final void m7081v0(String str, String str2, String str3, Bundle bundle) {
        long a = mo12429f().mo11378a();
        C1609u.m4471g(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString(Constants.APP_ID, str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", a);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        mo12426a().mo13122y(new C2309r6(this, bundle2));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: x0 */
    public final void m7082x0(Bundle bundle) {
        Bundle bundle2 = bundle;
        mo12567h();
        mo12537x();
        C1609u.m4475k(bundle);
        C1609u.m4471g(bundle2.getString("name"));
        C1609u.m4471g(bundle2.getString("origin"));
        C1609u.m4475k(bundle2.get("value"));
        if (!this.f4689a.mo12436p()) {
            mo12427b().mo13104O().mo13130a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkn zzkn = new zzkn(bundle2.getString("name"), bundle2.getLong("triggered_timestamp"), bundle2.get("value"), bundle2.getString("origin"));
        try {
            zzaq D = mo13110k().mo12948D(bundle2.getString(Constants.APP_ID), bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), bundle2.getString("origin"), 0, true, false);
            mo12572r().mo12916Q(new zzy(bundle2.getString(Constants.APP_ID), bundle2.getString("origin"), zzkn, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), mo13110k().mo12948D(bundle2.getString(Constants.APP_ID), bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), bundle2.getString("origin"), 0, true, false), bundle2.getLong("trigger_timeout"), D, bundle2.getLong("time_to_live"), mo13110k().mo12948D(bundle2.getString(Constants.APP_ID), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString("origin"), 0, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo12534A() {
        return false;
    }

    /* renamed from: B */
    public final ArrayList<Bundle> mo12697B(String str, String str2) {
        mo12566d();
        return m7076m0((String) null, str, str2);
    }

    /* renamed from: C */
    public final ArrayList<Bundle> mo12698C(String str, String str2, String str3) {
        C1609u.m4471g(str);
        mo12568n();
        throw null;
    }

    /* renamed from: D */
    public final Map<String, Object> mo12699D(String str, String str2, String str3, boolean z) {
        C1609u.m4471g(str);
        mo12568n();
        throw null;
    }

    /* renamed from: E */
    public final Map<String, Object> mo12700E(String str, String str2, boolean z) {
        mo12566d();
        return m7077n0((String) null, str, str2, z);
    }

    /* renamed from: F */
    public final void mo12701F(long j) {
        mo12566d();
        mo12426a().mo13122y(new C2125b7(this, j));
    }

    /* renamed from: G */
    public final void mo12702G(Bundle bundle) {
        mo12703H(bundle, mo12429f().mo11378a());
    }

    /* renamed from: H */
    public final void mo12703H(Bundle bundle, long j) {
        C1609u.m4475k(bundle);
        mo12566d();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(Constants.APP_ID))) {
            mo12427b().mo13099J().mo13130a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(Constants.APP_ID);
        m7078q0(bundle2, j);
    }

    @WorkerThread
    /* renamed from: J */
    public final void mo12704J(C2124b6 b6Var) {
        C2124b6 b6Var2;
        mo12567h();
        mo12566d();
        mo12537x();
        if (!(b6Var == null || b6Var == (b6Var2 = this.f4158d))) {
            C1609u.m4479o(b6Var2 == null, "EventInterceptor already set.");
        }
        this.f4158d = b6Var;
    }

    /* renamed from: K */
    public final void mo12705K(C2172f6 f6Var) {
        mo12566d();
        mo12537x();
        C1609u.m4475k(f6Var);
        if (!this.f4159e.add(f6Var)) {
            mo12427b().mo13099J().mo13130a("OnEventListener already registered");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo12706O(@Nullable String str) {
        this.f4161g.set(str);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: P */
    public final void mo12707P(String str, String str2, long j, Bundle bundle) {
        mo12566d();
        mo12567h();
        mo12708Q(str, str2, j, bundle, true, this.f4158d == null || C2323s9.m7550A0(str2), false, (String) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12708Q(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            r15 = r29
            r13 = r30
            r12 = r32
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.common.internal.C1609u.m4471g(r28)
            com.google.android.gms.common.internal.C1609u.m4475k(r32)
            r27.mo12567h()
            r27.mo12537x()
            com.google.android.gms.measurement.internal.a5 r1 = r7.f4689a
            boolean r1 = r1.mo12436p()
            if (r1 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.w3 r0 = r27.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13103N()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo13130a(r1)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.b r1 = r27.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2302r.f4508d0
            boolean r1 = r1.mo12474s(r2)
            if (r1 == 0) goto L_0x0058
            com.google.android.gms.measurement.internal.t3 r1 = r27.mo12571q()
            java.util.List r1 = r1.mo12988J()
            if (r1 == 0) goto L_0x0058
            boolean r1 = r1.contains(r15)
            if (r1 != 0) goto L_0x0058
            com.google.android.gms.measurement.internal.w3 r0 = r27.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13103N()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo13132c(r1, r15, r8)
            return
        L_0x0058:
            boolean r1 = r7.f4160f
            r11 = 0
            r10 = 0
            r9 = 1
            if (r1 != 0) goto L_0x00ae
            r7.f4160f = r9
            com.google.android.gms.measurement.internal.a5 r1 = r7.f4689a     // Catch:{ ClassNotFoundException -> 0x00a1 }
            boolean r1 = r1.mo12420O()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            if (r1 != 0) goto L_0x0076
            android.content.Context r1 = r27.mo12428c()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r9, r1)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            goto L_0x007a
        L_0x0076:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
        L_0x007a:
            java.lang.String r1 = "initialize"
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0092 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3     // Catch:{ Exception -> 0x0092 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x0092 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0092 }
            android.content.Context r2 = r27.mo12428c()     // Catch:{ Exception -> 0x0092 }
            r1[r10] = r2     // Catch:{ Exception -> 0x0092 }
            r0.invoke(r11, r1)     // Catch:{ Exception -> 0x0092 }
            goto L_0x00ae
        L_0x0092:
            r0 = move-exception
            com.google.android.gms.measurement.internal.w3 r1 = r27.mo12427b()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13099J()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo13131b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            goto L_0x00ae
        L_0x00a1:
            com.google.android.gms.measurement.internal.w3 r0 = r27.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13102M()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo13130a(r1)
        L_0x00ae:
            com.google.android.gms.measurement.internal.b r0 = r27.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C2302r.f4520j0
            boolean r0 = r0.mo12474s(r1)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00df
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.common.util.e r0 = r27.mo12429f()
            long r5 = r0.mo11378a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r27
            r1.mo12712V(r2, r3, r4, r5)
        L_0x00df:
            boolean r0 = com.google.android.gms.internal.measurement.C1916na.m5614a()
            if (r0 == 0) goto L_0x0132
            com.google.android.gms.measurement.internal.b r0 = r27.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C2302r.f4486O0
            boolean r0 = r0.mo12474s(r1)
            if (r0 == 0) goto L_0x0132
            r27.mo12414I()
            if (r33 == 0) goto L_0x0132
            boolean r0 = com.google.android.gms.measurement.internal.C2323s9.m7552D0(r29)
            if (r0 == 0) goto L_0x0132
            com.google.android.gms.measurement.internal.s9 r0 = r27.mo13110k()
            com.google.android.gms.measurement.internal.j4 r1 = r27.mo13111l()
            com.google.android.gms.measurement.internal.o4 r1 = r1.f4219D
            android.os.Bundle r1 = r1.mo12858a()
            if (r1 == 0) goto L_0x0132
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0114:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0132
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r12.containsKey(r3)
            if (r4 != 0) goto L_0x0114
            com.google.android.gms.measurement.internal.s9 r4 = r0.mo13110k()
            java.lang.Object r5 = r1.get(r3)
            r4.mo12956M(r12, r3, r5)
            goto L_0x0114
        L_0x0132:
            r0 = 40
            if (r35 == 0) goto L_0x0196
            r27.mo12414I()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0196
            com.google.android.gms.measurement.internal.a5 r1 = r7.f4689a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo12412G()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo12968e0(r2, r15)
            r4 = 2
            if (r3 != 0) goto L_0x0151
            goto L_0x0164
        L_0x0151:
            java.lang.String[] r3 = com.google.android.gms.measurement.internal.C2112a6.f3943a
            boolean r3 = r1.mo12971j0(r2, r3, r15)
            if (r3 != 0) goto L_0x015c
            r4 = 13
            goto L_0x0164
        L_0x015c:
            boolean r1 = r1.mo12967d0(r2, r0, r15)
            if (r1 != 0) goto L_0x0163
            goto L_0x0164
        L_0x0163:
            r4 = 0
        L_0x0164:
            if (r4 == 0) goto L_0x0196
            com.google.android.gms.measurement.internal.w3 r1 = r27.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13098H()
            com.google.android.gms.measurement.internal.u3 r2 = r27.mo13109j()
            java.lang.String r2 = r2.mo12995v(r15)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo13131b(r3, r2)
            com.google.android.gms.measurement.internal.a5 r1 = r7.f4689a
            r1.mo12412G()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C2323s9.m7555G(r15, r0, r9)
            if (r15 == 0) goto L_0x018a
            int r10 = r29.length()
        L_0x018a:
            com.google.android.gms.measurement.internal.a5 r1 = r7.f4689a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo12412G()
            java.lang.String r2 = "_ev"
            r1.mo12953J(r4, r2, r0, r10)
            return
        L_0x0196:
            r27.mo12414I()
            com.google.android.gms.measurement.internal.l7 r1 = r27.mo12573s()
            com.google.android.gms.measurement.internal.m7 r1 = r1.mo12799D(r10)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x01ad
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01ad
            r1.f4370d = r9
        L_0x01ad:
            if (r33 == 0) goto L_0x01b3
            if (r35 == 0) goto L_0x01b3
            r3 = 1
            goto L_0x01b4
        L_0x01b3:
            r3 = 0
        L_0x01b4:
            com.google.android.gms.measurement.internal.C2243l7.m7203M(r1, r12, r3)
            java.lang.String r3 = "am"
            boolean r16 = r3.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.C2323s9.m7550A0(r29)
            if (r33 == 0) goto L_0x01f6
            com.google.android.gms.measurement.internal.b6 r4 = r7.f4158d
            if (r4 == 0) goto L_0x01f6
            if (r3 != 0) goto L_0x01f6
            if (r16 != 0) goto L_0x01f6
            com.google.android.gms.measurement.internal.w3 r0 = r27.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13103N()
            com.google.android.gms.measurement.internal.u3 r1 = r27.mo13109j()
            java.lang.String r1 = r1.mo12995v(r15)
            com.google.android.gms.measurement.internal.u3 r2 = r27.mo13109j()
            java.lang.String r2 = r2.mo12993t(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo13132c(r3, r1, r2)
            com.google.android.gms.measurement.internal.b6 r1 = r7.f4158d
            r2 = r28
            r3 = r29
            r4 = r32
            r5 = r30
            r1.mo12400a(r2, r3, r4, r5)
            return
        L_0x01f6:
            com.google.android.gms.measurement.internal.a5 r3 = r7.f4689a
            boolean r3 = r3.mo12441u()
            if (r3 != 0) goto L_0x01ff
            return
        L_0x01ff:
            com.google.android.gms.measurement.internal.s9 r3 = r27.mo13110k()
            int r3 = r3.mo12972m0(r15)
            if (r3 == 0) goto L_0x0243
            com.google.android.gms.measurement.internal.w3 r1 = r27.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13098H()
            com.google.android.gms.measurement.internal.u3 r2 = r27.mo13109j()
            java.lang.String r2 = r2.mo12995v(r15)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r1.mo13131b(r4, r2)
            r27.mo13110k()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C2323s9.m7555G(r15, r0, r9)
            if (r15 == 0) goto L_0x022b
            int r10 = r29.length()
        L_0x022b:
            com.google.android.gms.measurement.internal.a5 r1 = r7.f4689a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo12412G()
            java.lang.String r2 = "_ev"
            r28 = r1
            r29 = r36
            r30 = r3
            r31 = r2
            r32 = r0
            r33 = r10
            r28.mo12965U(r29, r30, r31, r32, r33)
            return
        L_0x0243:
            java.lang.String r0 = "_o"
            java.lang.String r3 = "_sn"
            java.lang.String r4 = "_si"
            java.lang.String[] r5 = new java.lang.String[]{r0, r3, r2, r4}
            java.util.List r17 = com.google.android.gms.common.util.C1652f.m4584c(r5)
            com.google.android.gms.measurement.internal.s9 r5 = r27.mo13110k()
            r6 = 1
            r9 = r5
            r5 = 0
            r10 = r36
            r19 = r11
            r11 = r29
            r12 = r32
            r13 = r17
            r14 = r35
            r15 = r6
            android.os.Bundle r15 = r9.mo12945B(r10, r11, r12, r13, r14, r15)
            if (r15 == 0) goto L_0x0292
            boolean r6 = r15.containsKey(r2)
            if (r6 == 0) goto L_0x0292
            boolean r6 = r15.containsKey(r4)
            if (r6 != 0) goto L_0x0278
            goto L_0x0292
        L_0x0278:
            java.lang.String r3 = r15.getString(r3)
            java.lang.String r2 = r15.getString(r2)
            long r9 = r15.getLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            com.google.android.gms.measurement.internal.m7 r11 = new com.google.android.gms.measurement.internal.m7
            long r9 = r4.longValue()
            r11.<init>(r3, r2, r9)
            goto L_0x0294
        L_0x0292:
            r11 = r19
        L_0x0294:
            if (r11 != 0) goto L_0x0298
            r14 = r1
            goto L_0x0299
        L_0x0298:
            r14 = r11
        L_0x0299:
            com.google.android.gms.measurement.internal.b r1 = r27.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2302r.f4495U
            boolean r1 = r1.mo12474s(r2)
            java.lang.String r13 = "_ae"
            r9 = 0
            if (r1 == 0) goto L_0x02d4
            r27.mo12414I()
            com.google.android.gms.measurement.internal.l7 r1 = r27.mo12573s()
            com.google.android.gms.measurement.internal.m7 r1 = r1.mo12799D(r5)
            if (r1 == 0) goto L_0x02d4
            r12 = r29
            boolean r1 = r13.equals(r12)
            if (r1 == 0) goto L_0x02d6
            com.google.android.gms.measurement.internal.w8 r1 = r27.mo12575u()
            com.google.android.gms.measurement.internal.c9 r1 = r1.f4697e
            long r1 = r1.mo12560e()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d6
            com.google.android.gms.measurement.internal.s9 r3 = r27.mo13110k()
            r3.mo12954L(r15, r1)
            goto L_0x02d6
        L_0x02d4:
            r12 = r29
        L_0x02d6:
            boolean r1 = com.google.android.gms.internal.measurement.C1770e9.m5039a()
            if (r1 == 0) goto L_0x0358
            com.google.android.gms.measurement.internal.b r1 = r27.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2302r.f4546w0
            boolean r1 = r1.mo12474s(r2)
            if (r1 == 0) goto L_0x0358
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x033b
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x033b
            com.google.android.gms.measurement.internal.s9 r1 = r27.mo13110k()
            java.lang.String r2 = r15.getString(r2)
            boolean r3 = com.google.android.gms.common.util.C1662p.m4614a(r2)
            if (r3 == 0) goto L_0x030b
            r11 = r19
            goto L_0x030f
        L_0x030b:
            java.lang.String r11 = r2.trim()
        L_0x030f:
            com.google.android.gms.measurement.internal.j4 r2 = r1.mo13111l()
            com.google.android.gms.measurement.internal.p4 r2 = r2.f4216A
            java.lang.String r2 = r2.mo12869a()
            boolean r2 = com.google.android.gms.measurement.internal.C2323s9.m7583y0(r11, r2)
            if (r2 == 0) goto L_0x032e
            com.google.android.gms.measurement.internal.w3 r1 = r1.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13103N()
            java.lang.String r2 = "Not logging duplicate session_start_with_rollout event"
            r1.mo13130a(r2)
            r1 = 0
            goto L_0x0338
        L_0x032e:
            com.google.android.gms.measurement.internal.j4 r1 = r1.mo13111l()
            com.google.android.gms.measurement.internal.p4 r1 = r1.f4216A
            r1.mo12870b(r11)
            r1 = 1
        L_0x0338:
            if (r1 != 0) goto L_0x0358
            return
        L_0x033b:
            boolean r1 = r13.equals(r12)
            if (r1 == 0) goto L_0x0358
            com.google.android.gms.measurement.internal.s9 r1 = r27.mo13110k()
            com.google.android.gms.measurement.internal.j4 r1 = r1.mo13111l()
            com.google.android.gms.measurement.internal.p4 r1 = r1.f4216A
            java.lang.String r1 = r1.mo12869a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0358
            r15.putString(r2, r1)
        L_0x0358:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r11.add(r15)
            com.google.android.gms.measurement.internal.s9 r1 = r27.mo13110k()
            java.security.SecureRandom r1 = r1.mo12950F0()
            long r3 = r1.nextLong()
            com.google.android.gms.measurement.internal.j4 r1 = r27.mo13111l()
            com.google.android.gms.measurement.internal.n4 r1 = r1.f4239v
            long r1 = r1.mo12849a()
            int r6 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x03dc
            com.google.android.gms.measurement.internal.j4 r1 = r27.mo13111l()
            r9 = r30
            boolean r1 = r1.mo12766v(r9)
            if (r1 == 0) goto L_0x03de
            com.google.android.gms.measurement.internal.j4 r1 = r27.mo13111l()
            com.google.android.gms.measurement.internal.l4 r1 = r1.f4241x
            boolean r1 = r1.mo12796b()
            if (r1 == 0) goto L_0x03de
            com.google.android.gms.measurement.internal.w3 r1 = r27.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13104O()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo13130a(r2)
            r6 = 0
            com.google.android.gms.common.util.e r1 = r27.mo12429f()
            long r19 = r1.mo11378a()
            java.lang.String r2 = "auto"
            java.lang.String r21 = "_sid"
            r1 = r27
            r22 = r3
            r3 = r21
            r4 = r6
            r5 = r19
            r1.mo12712V(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.common.util.e r1 = r27.mo12429f()
            long r5 = r1.mo11378a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r27
            r1.mo12712V(r2, r3, r4, r5)
            com.google.android.gms.common.util.e r1 = r27.mo12429f()
            long r5 = r1.mo11378a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r27
            r1.mo12712V(r2, r3, r4, r5)
            goto L_0x03e0
        L_0x03dc:
            r9 = r30
        L_0x03de:
            r22 = r3
        L_0x03e0:
            java.lang.String r1 = "extend_session"
            r2 = 0
            long r1 = r15.getLong(r1, r2)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0408
            com.google.android.gms.measurement.internal.w3 r1 = r27.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13104O()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo13130a(r2)
            com.google.android.gms.measurement.internal.a5 r1 = r7.f4689a
            com.google.android.gms.measurement.internal.w8 r1 = r1.mo12408C()
            com.google.android.gms.measurement.internal.f9 r1 = r1.f4696d
            r5 = 1
            r1.mo12663b(r9, r5)
            goto L_0x0409
        L_0x0408:
            r5 = 1
        L_0x0409:
            java.util.Set r1 = r15.keySet()
            int r2 = r15.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.Arrays.sort(r1)
            boolean r2 = com.google.android.gms.internal.measurement.C2065x8.m6570a()
            if (r2 == 0) goto L_0x045b
            com.google.android.gms.measurement.internal.b r2 = r27.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C2302r.f4474I0
            boolean r2 = r2.mo12474s(r3)
            if (r2 == 0) goto L_0x045b
            com.google.android.gms.measurement.internal.b r2 = r27.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C2302r.f4472H0
            boolean r2 = r2.mo12474s(r3)
            if (r2 == 0) goto L_0x045b
            int r2 = r1.length
            r3 = 0
        L_0x043c:
            if (r3 >= r2) goto L_0x0453
            r4 = r1[r3]
            r27.mo13110k()
            java.lang.Object r6 = r15.get(r4)
            android.os.Bundle[] r6 = com.google.android.gms.measurement.internal.C2323s9.m7578u0(r6)
            if (r6 == 0) goto L_0x0450
            r15.putParcelableArray(r4, r6)
        L_0x0450:
            int r3 = r3 + 1
            goto L_0x043c
        L_0x0453:
            r10 = r11
            r11 = r12
            r26 = r13
            r24 = 1
            goto L_0x0517
        L_0x045b:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x045e:
            java.lang.String r6 = "_eid"
            if (r3 >= r2) goto L_0x0504
            r5 = r1[r3]
            java.lang.Object r19 = r15.get(r5)
            r27.mo13110k()
            r32 = r1
            android.os.Bundle[] r1 = com.google.android.gms.measurement.internal.C2323s9.m7578u0(r19)
            r19 = r2
            if (r1 == 0) goto L_0x04e3
            int r2 = r1.length
            r15.putInt(r5, r2)
            r2 = 0
        L_0x047a:
            int r9 = r1.length
            if (r2 >= r9) goto L_0x04d5
            r10 = r1[r2]
            r9 = 1
            com.google.android.gms.measurement.internal.C2243l7.m7203M(r14, r10, r9)
            com.google.android.gms.measurement.internal.s9 r18 = r27.mo13110k()
            r20 = 0
            java.lang.String r21 = "_ep"
            r24 = 1
            r9 = r18
            r18 = r10
            r10 = r36
            r25 = r11
            r11 = r21
            r12 = r18
            r26 = r13
            r13 = r17
            r18 = r14
            r14 = r35
            r7 = r15
            r15 = r20
            android.os.Bundle r9 = r9.mo12945B(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = "_en"
            r11 = r29
            r9.putString(r10, r11)
            r12 = r22
            r9.putLong(r6, r12)
            java.lang.String r10 = "_gn"
            r9.putString(r10, r5)
            int r10 = r1.length
            java.lang.String r14 = "_ll"
            r9.putInt(r14, r10)
            java.lang.String r10 = "_i"
            r9.putInt(r10, r2)
            r10 = r25
            r10.add(r9)
            int r2 = r2 + 1
            r15 = r7
            r14 = r18
            r13 = r26
            r7 = r27
            r12 = r11
            r11 = r10
            goto L_0x047a
        L_0x04d5:
            r10 = r11
            r11 = r12
            r26 = r13
            r18 = r14
            r7 = r15
            r12 = r22
            r24 = 1
            int r1 = r1.length
            int r4 = r4 + r1
            goto L_0x04ee
        L_0x04e3:
            r10 = r11
            r11 = r12
            r26 = r13
            r18 = r14
            r7 = r15
            r12 = r22
            r24 = 1
        L_0x04ee:
            int r3 = r3 + 1
            r1 = r32
            r15 = r7
            r22 = r12
            r14 = r18
            r2 = r19
            r13 = r26
            r5 = 1
            r7 = r27
            r12 = r11
            r11 = r10
            r9 = r30
            goto L_0x045e
        L_0x0504:
            r10 = r11
            r11 = r12
            r26 = r13
            r7 = r15
            r12 = r22
            r24 = 1
            if (r4 == 0) goto L_0x0517
            r7.putLong(r6, r12)
            java.lang.String r1 = "_epc"
            r7.putInt(r1, r4)
        L_0x0517:
            r7 = 0
        L_0x0518:
            int r1 = r10.size()
            if (r7 >= r1) goto L_0x0580
            java.lang.Object r1 = r10.get(r7)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r7 == 0) goto L_0x0528
            r2 = 1
            goto L_0x0529
        L_0x0528:
            r2 = 0
        L_0x0529:
            if (r2 == 0) goto L_0x052e
            java.lang.String r2 = "_ep"
            goto L_0x052f
        L_0x052e:
            r2 = r11
        L_0x052f:
            r1.putString(r0, r8)
            if (r34 == 0) goto L_0x053c
            com.google.android.gms.measurement.internal.s9 r3 = r27.mo13110k()
            android.os.Bundle r1 = r3.mo12944A(r1)
        L_0x053c:
            r9 = r1
            com.google.android.gms.measurement.internal.zzaq r12 = new com.google.android.gms.measurement.internal.zzaq
            com.google.android.gms.measurement.internal.zzal r3 = new com.google.android.gms.measurement.internal.zzal
            r3.<init>(r9)
            r1 = r12
            r4 = r28
            r13 = 1
            r5 = r30
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.r7 r1 = r27.mo12572r()
            r14 = r36
            r1.mo12911K(r12, r14)
            r12 = r27
            if (r16 != 0) goto L_0x057b
            java.util.Set<com.google.android.gms.measurement.internal.f6> r1 = r12.f4159e
            java.util.Iterator r15 = r1.iterator()
        L_0x0560:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x057b
            java.lang.Object r1 = r15.next()
            com.google.android.gms.measurement.internal.f6 r1 = (com.google.android.gms.measurement.internal.C2172f6) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r9)
            r2 = r28
            r3 = r29
            r5 = r30
            r1.mo12401a(r2, r3, r4, r5)
            goto L_0x0560
        L_0x057b:
            int r7 = r7 + 1
            r24 = 1
            goto L_0x0518
        L_0x0580:
            r12 = r27
            r13 = 1
            r27.mo12414I()
            com.google.android.gms.measurement.internal.l7 r0 = r27.mo12573s()
            r1 = 0
            com.google.android.gms.measurement.internal.m7 r0 = r0.mo12799D(r1)
            if (r0 == 0) goto L_0x05a8
            r0 = r26
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x05a8
            com.google.android.gms.measurement.internal.w8 r0 = r27.mo12575u()
            com.google.android.gms.common.util.e r1 = r27.mo12429f()
            long r1 = r1.mo11379b()
            r0.mo13115E(r13, r13, r1)
        L_0x05a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2196h6.mo12708Q(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: S */
    public final void mo12709S(String str, String str2, Bundle bundle) {
        mo12711U(str, str2, bundle, true, true, mo12429f().mo11378a());
    }

    /* renamed from: T */
    public final void mo12710T(String str, String str2, Bundle bundle, boolean z) {
        mo12711U(str, str2, bundle, false, true, mo12429f().mo11378a());
    }

    /* renamed from: U */
    public final void mo12711U(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        mo12566d();
        m7080t0(str == null ? "app" : str, str2, j, bundle == null ? new Bundle() : bundle, z2, !z2 || this.f4158d == null || C2323s9.m7550A0(str2), !z, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    @androidx.annotation.WorkerThread
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12712V(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C1609u.m4471g(r9)
            com.google.android.gms.common.internal.C1609u.m4471g(r10)
            r8.mo12567h()
            r8.mo12566d()
            r8.mo12537x()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0063
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0053
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0053
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0038
            r4 = r2
            goto L_0x003a
        L_0x0038:
            r4 = 0
        L_0x003a:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.j4 r0 = r8.mo13111l()
            com.google.android.gms.measurement.internal.p4 r0 = r0.f4236s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004e
            java.lang.String r11 = "true"
        L_0x004e:
            r0.mo12870b(r11)
            r6 = r10
            goto L_0x0061
        L_0x0053:
            if (r11 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.j4 r10 = r8.mo13111l()
            com.google.android.gms.measurement.internal.p4 r10 = r10.f4236s
            java.lang.String r0 = "unset"
            r10.mo12870b(r0)
            r6 = r11
        L_0x0061:
            r3 = r1
            goto L_0x0065
        L_0x0063:
            r3 = r10
            r6 = r11
        L_0x0065:
            com.google.android.gms.measurement.internal.a5 r10 = r8.f4689a
            boolean r10 = r10.mo12436p()
            if (r10 != 0) goto L_0x007b
            com.google.android.gms.measurement.internal.w3 r9 = r8.mo12427b()
            com.google.android.gms.measurement.internal.y3 r9 = r9.mo13104O()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo13130a(r10)
            return
        L_0x007b:
            com.google.android.gms.measurement.internal.a5 r10 = r8.f4689a
            boolean r10 = r10.mo12441u()
            if (r10 != 0) goto L_0x0084
            return
        L_0x0084:
            com.google.android.gms.measurement.internal.zzkn r10 = new com.google.android.gms.measurement.internal.zzkn
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.r7 r9 = r8.mo12572r()
            r9.mo12915P(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2196h6.mo12712V(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: W */
    public final void mo12713W(String str, String str2, Object obj, boolean z) {
        mo12714X(str, str2, obj, z, mo12429f().mo11378a());
    }

    /* renamed from: X */
    public final void mo12714X(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = mo13110k().mo12976v0(str2);
        } else {
            C2323s9 k = mo13110k();
            if (k.mo12968e0("user property", str2)) {
                if (!k.mo12971j0("user property", C2136c6.f3997a, str2)) {
                    i = 15;
                } else if (k.mo12967d0("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            mo13110k();
            String G = C2323s9.m7555G(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f4689a.mo12412G().mo12953J(i, "_ev", G, i2);
        } else if (obj != null) {
            int n0 = mo13110k().mo12973n0(str2, obj);
            if (n0 != 0) {
                mo13110k();
                String G2 = C2323s9.m7555G(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f4689a.mo12412G().mo12953J(n0, "_ev", G2, i2);
                return;
            }
            Object w0 = mo13110k().mo12978w0(str2, obj);
            if (w0 != null) {
                m7074R(str3, str2, j, w0);
            }
        } else {
            m7074R(str3, str2, j, (Object) null);
        }
    }

    /* renamed from: Y */
    public final void mo12715Y(String str, String str2, String str3, Bundle bundle) {
        C1609u.m4471g(str);
        mo12568n();
        throw null;
    }

    /* renamed from: Z */
    public final void mo12716Z(boolean z) {
        mo12537x();
        mo12566d();
        mo12426a().mo13122y(new C2364w6(this, z));
    }

    /* renamed from: a0 */
    public final void mo12717a0() {
        if (mo12428c().getApplicationContext() instanceof Application) {
            ((Application) mo12428c().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f4157c);
        }
    }

    /* renamed from: b0 */
    public final Boolean mo12718b0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) mo12426a().mo13120u(atomicReference, 15000, "boolean test flag value", new C2208i6(this, atomicReference));
    }

    /* renamed from: c0 */
    public final String mo12719c0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) mo12426a().mo13120u(atomicReference, 15000, "String test flag value", new C2298q6(this, atomicReference));
    }

    /* renamed from: d0 */
    public final Long mo12720d0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) mo12426a().mo13120u(atomicReference, 15000, "long test flag value", new C2353v6(this, atomicReference));
    }

    /* renamed from: e0 */
    public final Integer mo12721e0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) mo12426a().mo13120u(atomicReference, 15000, "int test flag value", new C2342u6(this, atomicReference));
    }

    /* renamed from: f0 */
    public final Double mo12722f0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) mo12426a().mo13120u(atomicReference, 15000, "double test flag value", new C2375x6(this, atomicReference));
    }

    @Nullable
    /* renamed from: g0 */
    public final String mo12723g0() {
        mo12566d();
        return this.f4161g.get();
    }

    @WorkerThread
    /* renamed from: h0 */
    public final void mo12724h0() {
        mo12567h();
        mo12566d();
        mo12537x();
        if (this.f4689a.mo12441u()) {
            if (mo13112m().mo12474s(C2302r.f4518i0)) {
                C2117b m = mo13112m();
                m.mo12414I();
                Boolean x = m.mo12479x("google_analytics_deferred_deep_link_enabled");
                if (x != null && x.booleanValue()) {
                    mo12427b().mo13103N().mo13130a("Deferred Deep Link feature enabled.");
                    mo12426a().mo13122y(new C2220j6(this));
                }
            }
            mo12572r().mo12923Y();
            this.f4163i = false;
            String H = mo13111l().mo12761H();
            if (!TextUtils.isEmpty(H)) {
                mo13108i().mo13079o();
                if (!H.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", H);
                    mo12709S("auto", "_ou", bundle);
                }
            }
        }
    }

    @Nullable
    /* renamed from: i0 */
    public final String mo12725i0() {
        C2255m7 Q = this.f4689a.mo12421P().mo12804Q();
        if (Q != null) {
            return Q.f4367a;
        }
        return null;
    }

    @Nullable
    /* renamed from: j0 */
    public final String mo12726j0() {
        C2255m7 Q = this.f4689a.mo12421P().mo12804Q();
        if (Q != null) {
            return Q.f4368b;
        }
        return null;
    }

    @Nullable
    /* renamed from: k0 */
    public final String mo12727k0() {
        if (this.f4689a.mo12417L() != null) {
            return this.f4689a.mo12417L();
        }
        try {
            return new C1613w(mo12428c()).mo11290a("google_app_id");
        } catch (IllegalStateException e) {
            this.f4689a.mo12427b().mo13096F().mo13131b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: o0 */
    public final void mo12728o0(long j) {
        mo12566d();
        mo12426a().mo13122y(new C2242l6(this, j));
    }

    /* renamed from: p0 */
    public final void mo12729p0(Bundle bundle) {
        C1609u.m4475k(bundle);
        C1609u.m4471g(bundle.getString(Constants.APP_ID));
        mo12568n();
        throw null;
    }

    /* renamed from: r0 */
    public final void mo12730r0(C2172f6 f6Var) {
        mo12566d();
        mo12537x();
        C1609u.m4475k(f6Var);
        if (!this.f4159e.remove(f6Var)) {
            mo12427b().mo13099J().mo13130a("OnEventListener had not been registered");
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: u0 */
    public final void mo12731u0(String str, String str2, Bundle bundle) {
        mo12566d();
        mo12567h();
        mo12707P(str, str2, mo12429f().mo11378a(), bundle);
    }

    /* renamed from: w0 */
    public final void mo12732w0(boolean z) {
        mo12537x();
        mo12566d();
        mo12426a().mo13122y(new C2397z6(this, z));
    }

    /* renamed from: y0 */
    public final void mo12733y0(String str, String str2, Bundle bundle) {
        mo12566d();
        m7081v0((String) null, str, str2, bundle);
    }

    /* renamed from: z0 */
    public final void mo12734z0(long j) {
        mo12706O((String) null);
        mo12426a().mo13122y(new C2265n6(this, j));
    }
}
