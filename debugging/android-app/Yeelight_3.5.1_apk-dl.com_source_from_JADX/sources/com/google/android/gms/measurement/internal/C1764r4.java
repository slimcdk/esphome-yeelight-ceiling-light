package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p093s.C3676a;

/* renamed from: com.google.android.gms.measurement.internal.r4 */
final class C1764r4 extends C1654i6 {
    @VisibleForTesting

    /* renamed from: x */
    static final Pair f2560x = new Pair("", 0L);

    /* renamed from: c */
    private SharedPreferences f2561c;

    /* renamed from: d */
    public C1740p4 f2562d;

    /* renamed from: e */
    public final C1716n4 f2563e = new C1716n4(this, "first_open_time", 0);

    /* renamed from: f */
    public final C1716n4 f2564f = new C1716n4(this, "app_install_time", 0);

    /* renamed from: g */
    public final C1752q4 f2565g = new C1752q4(this, "app_instance_id", (String) null);

    /* renamed from: h */
    private String f2566h;

    /* renamed from: i */
    private boolean f2567i;

    /* renamed from: j */
    private long f2568j;

    /* renamed from: k */
    public final C1716n4 f2569k = new C1716n4(this, "session_timeout", 1800000);

    /* renamed from: l */
    public final C1691l4 f2570l = new C1691l4(this, "start_new_session", true);

    /* renamed from: m */
    public final C1752q4 f2571m = new C1752q4(this, "non_personalized_ads", (String) null);

    /* renamed from: n */
    public final C1691l4 f2572n = new C1691l4(this, "allow_remote_dynamite", false);

    /* renamed from: o */
    public final C1716n4 f2573o = new C1716n4(this, "last_pause_time", 0);

    /* renamed from: p */
    public boolean f2574p;

    /* renamed from: q */
    public final C1691l4 f2575q = new C1691l4(this, "app_backgrounded", false);

    /* renamed from: r */
    public final C1691l4 f2576r = new C1691l4(this, "deep_link_retrieval_complete", false);

    /* renamed from: s */
    public final C1716n4 f2577s = new C1716n4(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: t */
    public final C1752q4 f2578t = new C1752q4(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: u */
    public final C1752q4 f2579u = new C1752q4(this, "deferred_attribution_cache", (String) null);

    /* renamed from: v */
    public final C1716n4 f2580v = new C1716n4(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: w */
    public final C1704m4 f2581w = new C1704m4(this, "default_event_parameters", (Bundle) null);

    C1764r4(C1717n5 n5Var) {
        super(n5Var);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    /* renamed from: i */
    public final void mo14240i() {
        SharedPreferences sharedPreferences = this.f2143a.mo14231f().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f2561c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f2574p = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f2561c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f2143a.mo14402z();
        this.f2562d = new C1740p4(this, "health_monitor", Math.max(0, ((Long) C1727o3.f2433c.mo14366a((Object) null)).longValue()), (C1728o4) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo14033j() {
        return true;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: o */
    public final SharedPreferences mo14445o() {
        mo14009h();
        mo14241k();
        C0917i.m1419j(this.f2561c);
        return this.f2561c;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: p */
    public final Pair mo14446p(String str) {
        mo14009h();
        long b = this.f2143a.mo14229c().mo11030b();
        String str2 = this.f2566h;
        if (str2 != null && b < this.f2568j) {
            return new Pair(str2, Boolean.valueOf(this.f2567i));
        }
        this.f2568j = b + this.f2143a.mo14402z().mo14177r(str, C1727o3.f2431b);
        C3676a.m10513b(true);
        try {
            C3676a.C3677a a = C3676a.m10512a(this.f2143a.mo14231f());
            this.f2566h = "";
            String a2 = a.mo26085a();
            if (a2 != null) {
                this.f2566h = a2;
            }
            this.f2567i = a.mo26086b();
        } catch (Exception e) {
            this.f2143a.mo14228b().mo14034q().mo14694b("Unable to get advertising id", e);
            this.f2566h = "";
        }
        C3676a.m10513b(false);
        return new Pair(this.f2566h, Boolean.valueOf(this.f2567i));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: q */
    public final C1634h mo14447q() {
        mo14009h();
        return C1634h.m4273b(mo14445o().getString("consent_settings", "G1"));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final Boolean mo14448r() {
        mo14009h();
        if (mo14445o().contains("measurement_enabled")) {
            return Boolean.valueOf(mo14445o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final void mo14449s(Boolean bool) {
        mo14009h();
        SharedPreferences.Editor edit = mo14445o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: t */
    public final void mo14450t(boolean z) {
        mo14009h();
        this.f2143a.mo14228b().mo14039v().mo14694b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo14445o().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: u */
    public final boolean mo14451u() {
        SharedPreferences sharedPreferences = this.f2561c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo14452v(long j) {
        return j - this.f2569k.mo14368a() > this.f2573o.mo14368a();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final boolean mo14453w(int i) {
        return C1634h.m4275j(i, mo14445o().getInt("consent_source", 100));
    }
}
