package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1725ba;
import com.google.android.gms.internal.measurement.C1958q9;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.measurement.internal.l7 */
public final class C2243l7 extends C2133c3 {

    /* renamed from: c */
    private volatile C2255m7 f4304c;

    /* renamed from: d */
    private C2255m7 f4305d;
    @VisibleForTesting

    /* renamed from: e */
    protected C2255m7 f4306e;

    /* renamed from: f */
    private final Map<Activity, C2255m7> f4307f = new ConcurrentHashMap();

    /* renamed from: g */
    private Activity f4308g;

    /* renamed from: h */
    private volatile C2255m7 f4309h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2255m7 f4310i;

    /* renamed from: j */
    private final Object f4311j = new Object();

    /* renamed from: k */
    private String f4312k;

    public C2243l7(C2111a5 a5Var) {
        super(a5Var);
    }

    @VisibleForTesting
    /* renamed from: E */
    private static String m7199E(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    @MainThread
    /* renamed from: H */
    private final void m7200H(Activity activity, C2255m7 m7Var, boolean z) {
        C2255m7 m7Var2;
        C2255m7 m7Var3 = this.f4304c == null ? this.f4305d : this.f4304c;
        if (m7Var.f4368b == null) {
            m7Var2 = new C2255m7(m7Var.f4367a, activity != null ? m7199E(activity.getClass().getCanonicalName()) : null, m7Var.f4369c, m7Var.f4371e);
        } else {
            m7Var2 = m7Var;
        }
        this.f4305d = this.f4304c;
        this.f4304c = m7Var2;
        mo12426a().mo13122y(new C2277o7(this, m7Var2, m7Var3, mo12429f().mo11379b(), z));
    }

    /* renamed from: M */
    public static void m7203M(C2255m7 m7Var, Bundle bundle, boolean z) {
        if (bundle != null && m7Var != null && (!bundle.containsKey("_sc") || z)) {
            String str = m7Var.f4367a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = m7Var.f4368b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", m7Var.f4369c);
        } else if (bundle != null && m7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: N */
    public final void m7204N(C2255m7 m7Var, C2255m7 m7Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        C2255m7 m7Var3;
        mo12567h();
        boolean z3 = false;
        if (mo13112m().mo12474s(C2302r.f4495U)) {
            z2 = z && this.f4306e != null;
            if (z2) {
                m7205O(this.f4306e, true, j);
            }
        } else {
            if (z && (m7Var3 = this.f4306e) != null) {
                m7205O(m7Var3, true, j);
            }
            z2 = false;
        }
        if (m7Var2 == null || m7Var2.f4369c != m7Var.f4369c || !C2323s9.m7583y0(m7Var2.f4368b, m7Var.f4368b) || !C2323s9.m7583y0(m7Var2.f4367a, m7Var.f4367a)) {
            z3 = true;
        }
        if (z3) {
            Bundle bundle2 = new Bundle();
            if (mo13112m().mo12474s(C2302r.f4466E0)) {
                bundle2 = new Bundle();
            }
            m7203M(m7Var, bundle2, true);
            if (m7Var2 != null) {
                String str = m7Var2.f4367a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = m7Var2.f4368b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", m7Var2.f4369c);
            }
            if (mo13112m().mo12474s(C2302r.f4495U) && z2) {
                long e = (!C1725ba.m4884a() || !mo13112m().mo12474s(C2302r.f4497W) || !C1958q9.m5849a() || !mo13112m().mo12474s(C2302r.f4460B0)) ? mo12575u().f4697e.mo12560e() : mo12575u().f4697e.mo12562g(j);
                if (e > 0) {
                    mo13110k().mo12954L(bundle2, e);
                }
            }
            String str3 = "auto";
            if (mo13112m().mo12474s(C2302r.f4466E0)) {
                if (!mo13112m().mo12465L().booleanValue()) {
                    bundle2.putLong("_mt", 1);
                }
                if (m7Var.f4371e) {
                    str3 = "app";
                }
            }
            mo12570p().mo12731u0(str3, "_vs", bundle2);
        }
        this.f4306e = m7Var;
        if (mo13112m().mo12474s(C2302r.f4466E0) && m7Var.f4371e) {
            this.f4310i = m7Var;
        }
        mo12572r().mo12914N(m7Var);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: O */
    public final void m7205O(C2255m7 m7Var, boolean z, long j) {
        mo12569o().mo13142v(mo12429f().mo11379b());
        if (mo12575u().mo13115E(m7Var != null && m7Var.f4370d, z, j) && m7Var != null) {
            m7Var.f4370d = false;
        }
    }

    @MainThread
    /* renamed from: U */
    private final C2255m7 m7206U(@NonNull Activity activity) {
        C1609u.m4475k(activity);
        C2255m7 m7Var = this.f4307f.get(activity);
        if (m7Var == null) {
            C2255m7 m7Var2 = new C2255m7((String) null, m7199E(activity.getClass().getCanonicalName()), mo13110k().mo12947C0());
            this.f4307f.put(activity, m7Var2);
            m7Var = m7Var2;
        }
        boolean s = mo13112m().mo12474s(C2302r.f4466E0);
        return m7Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo12534A() {
        return false;
    }

    @WorkerThread
    /* renamed from: D */
    public final C2255m7 mo12799D(boolean z) {
        mo12537x();
        mo12567h();
        if (!mo13112m().mo12474s(C2302r.f4466E0) || !z) {
            return this.f4306e;
        }
        C2255m7 m7Var = this.f4306e;
        return m7Var != null ? m7Var : this.f4310i;
    }

    @MainThread
    /* renamed from: F */
    public final void mo12800F(Activity activity) {
        if (mo13112m().mo12474s(C2302r.f4466E0)) {
            synchronized (this.f4311j) {
                if (activity != this.f4308g) {
                    synchronized (this.f4311j) {
                        this.f4308g = activity;
                    }
                    if (mo13112m().mo12474s(C2302r.f4464D0) && mo13112m().mo12465L().booleanValue()) {
                        this.f4309h = null;
                        mo12426a().mo13122y(new C2321s7(this));
                    }
                }
            }
        }
        if (!mo13112m().mo12474s(C2302r.f4464D0) || mo13112m().mo12465L().booleanValue()) {
            m7200H(activity, m7206U(activity), false);
            C2390z o = mo12569o();
            o.mo12426a().mo13122y(new C2107a1(o, o.mo12429f().mo11379b()));
            return;
        }
        this.f4304c = this.f4309h;
        mo12426a().mo13122y(new C2266n7(this));
    }

    @MainThread
    /* renamed from: G */
    public final void mo12801G(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (mo13112m().mo12465L().booleanValue() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f4307f.put(activity, new C2255m7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @MainThread
    /* renamed from: J */
    public final void mo12802J(@NonNull Activity activity, @Size(max = 36, min = 1) @Nullable String str, @Size(max = 36, min = 1) @Nullable String str2) {
        if (!mo13112m().mo12465L().booleanValue()) {
            mo12427b().mo13101L().mo13130a("setCurrentScreen cannot be called while screen reporting is disabled.");
        } else if (this.f4304c == null) {
            mo12427b().mo13101L().mo13130a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f4307f.get(activity) == null) {
            mo12427b().mo13101L().mo13130a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m7199E(activity.getClass().getCanonicalName());
            }
            boolean y0 = C2323s9.m7583y0(this.f4304c.f4368b, str2);
            boolean y02 = C2323s9.m7583y0(this.f4304c.f4367a, str);
            if (y0 && y02) {
                mo12427b().mo13101L().mo13130a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                mo12427b().mo13101L().mo13131b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                mo12427b().mo13104O().mo13132c("Setting current screen to name, class", str == null ? "null" : str, str2);
                C2255m7 m7Var = new C2255m7(str, str2, mo13110k().mo12947C0());
                this.f4307f.put(activity, m7Var);
                m7200H(activity, m7Var, true);
            } else {
                mo12427b().mo13101L().mo13131b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    @WorkerThread
    /* renamed from: P */
    public final void mo12803P(String str, C2255m7 m7Var) {
        mo12567h();
        synchronized (this) {
            if (this.f4312k == null || this.f4312k.equals(str) || m7Var != null) {
                this.f4312k = str;
            }
        }
    }

    /* renamed from: Q */
    public final C2255m7 mo12804Q() {
        mo12566d();
        return this.f4304c;
    }

    @MainThread
    /* renamed from: R */
    public final void mo12805R(Activity activity) {
        if (mo13112m().mo12474s(C2302r.f4466E0)) {
            synchronized (this.f4311j) {
            }
        }
        if (!mo13112m().mo12474s(C2302r.f4464D0) || mo13112m().mo12465L().booleanValue()) {
            C2255m7 U = m7206U(activity);
            this.f4305d = this.f4304c;
            this.f4304c = null;
            mo12426a().mo13122y(new C2288p7(this, U, mo12429f().mo11379b()));
            return;
        }
        this.f4304c = null;
        mo12426a().mo13122y(new C2299q7(this));
    }

    @MainThread
    /* renamed from: S */
    public final void mo12806S(Activity activity, Bundle bundle) {
        C2255m7 m7Var;
        if (mo13112m().mo12465L().booleanValue() && bundle != null && (m7Var = this.f4307f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", m7Var.f4369c);
            bundle2.putString("name", m7Var.f4367a);
            bundle2.putString("referrer_name", m7Var.f4368b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    @MainThread
    /* renamed from: T */
    public final void mo12807T(Activity activity) {
        synchronized (this.f4311j) {
            if (activity == this.f4308g) {
                this.f4308g = null;
            }
        }
        if (mo13112m().mo12465L().booleanValue()) {
            this.f4307f.remove(activity);
        }
    }
}
