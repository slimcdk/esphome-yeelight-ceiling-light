package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import p011c.p012a.p019b.p028b.p029a.p030a.C0556a;

/* renamed from: com.google.android.gms.measurement.internal.j4 */
final class C2218j4 extends C2352v5 {
    @VisibleForTesting

    /* renamed from: E */
    static final Pair<String, Long> f4215E = new Pair<>("", 0L);

    /* renamed from: A */
    public final C2285p4 f4216A = new C2285p4(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: B */
    public final C2285p4 f4217B = new C2285p4(this, "deferred_attribution_cache", (String) null);

    /* renamed from: C */
    public final C2263n4 f4218C = new C2263n4(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: D */
    public final C2274o4 f4219D = new C2274o4(this, "default_event_parameters", (Bundle) null);

    /* renamed from: c */
    private SharedPreferences f4220c;

    /* renamed from: d */
    public C2296q4 f4221d;

    /* renamed from: e */
    public final C2263n4 f4222e = new C2263n4(this, "last_upload", 0);

    /* renamed from: f */
    public final C2263n4 f4223f = new C2263n4(this, "last_upload_attempt", 0);

    /* renamed from: g */
    public final C2263n4 f4224g = new C2263n4(this, "backoff", 0);

    /* renamed from: h */
    public final C2263n4 f4225h = new C2263n4(this, "last_delete_stale", 0);

    /* renamed from: i */
    public final C2263n4 f4226i = new C2263n4(this, "midnight_offset", 0);

    /* renamed from: j */
    public final C2263n4 f4227j = new C2263n4(this, "first_open_time", 0);

    /* renamed from: k */
    public final C2263n4 f4228k = new C2263n4(this, "app_install_time", 0);

    /* renamed from: l */
    public final C2285p4 f4229l = new C2285p4(this, "app_instance_id", (String) null);

    /* renamed from: m */
    private String f4230m;

    /* renamed from: n */
    private boolean f4231n;

    /* renamed from: o */
    private long f4232o;

    /* renamed from: p */
    public final C2263n4 f4233p = new C2263n4(this, "time_before_start", 10000);

    /* renamed from: q */
    public final C2263n4 f4234q = new C2263n4(this, "session_timeout", 1800000);

    /* renamed from: r */
    public final C2240l4 f4235r = new C2240l4(this, "start_new_session", true);

    /* renamed from: s */
    public final C2285p4 f4236s = new C2285p4(this, "non_personalized_ads", (String) null);

    /* renamed from: t */
    public final C2240l4 f4237t = new C2240l4(this, "use_dynamite_api", false);

    /* renamed from: u */
    public final C2240l4 f4238u = new C2240l4(this, "allow_remote_dynamite", false);

    /* renamed from: v */
    public final C2263n4 f4239v = new C2263n4(this, "last_pause_time", 0);

    /* renamed from: w */
    public boolean f4240w;

    /* renamed from: x */
    public C2240l4 f4241x = new C2240l4(this, "app_backgrounded", false);

    /* renamed from: y */
    public C2240l4 f4242y = new C2240l4(this, "deep_link_retrieval_complete", false);

    /* renamed from: z */
    public C2263n4 f4243z = new C2263n4(this, "deep_link_retrieval_attempts", 0);

    C2218j4(C2111a5 a5Var) {
        super(a5Var);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: A */
    public final void mo12754A(String str) {
        mo12567h();
        SharedPreferences.Editor edit = mo12755B().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: B */
    public final SharedPreferences mo12755B() {
        mo12567h();
        mo13079o();
        return this.f4220c;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: C */
    public final String mo12756C() {
        mo12567h();
        return mo12755B().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: D */
    public final String mo12757D() {
        mo12567h();
        return mo12755B().getString("admob_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: E */
    public final Boolean mo12758E() {
        mo12567h();
        if (!mo12755B().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(mo12755B().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: F */
    public final void mo12759F() {
        mo12567h();
        Boolean G = mo12760G();
        SharedPreferences.Editor edit = mo12755B().edit();
        edit.clear();
        edit.apply();
        if (G != null) {
            mo12768x(G.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: G */
    public final Boolean mo12760G() {
        mo12567h();
        if (mo12755B().contains("measurement_enabled")) {
            return Boolean.valueOf(mo12755B().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: H */
    public final String mo12761H() {
        mo12567h();
        String string = mo12755B().getString("previous_os_version", (String) null);
        mo13108i().mo13079o();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = mo12755B().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: J */
    public final boolean mo12762J() {
        return this.f4220c.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: n */
    public final void mo12763n() {
        SharedPreferences sharedPreferences = mo12428c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f4220c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f4240w = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f4220c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f4221d = new C2296q4(this, "health_monitor", Math.max(0, C2302r.f4505c.mo12867a(null).longValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo12683r() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @NonNull
    /* renamed from: t */
    public final Pair<String, Boolean> mo12764t(String str) {
        mo12567h();
        long b = mo12429f().mo11379b();
        if (this.f4230m != null && b < this.f4232o) {
            return new Pair<>(this.f4230m, Boolean.valueOf(this.f4231n));
        }
        this.f4232o = b + mo13112m().mo12471p(str, C2302r.f4503b);
        C0556a.m319d(true);
        try {
            C0556a.C0557a b2 = C0556a.m318b(mo12428c());
            if (b2 != null) {
                this.f4230m = b2.mo8532a();
                this.f4231n = b2.mo8533b();
            }
            if (this.f4230m == null) {
                this.f4230m = "";
            }
        } catch (Exception e) {
            mo12427b().mo13103N().mo13131b("Unable to get advertising id", e);
            this.f4230m = "";
        }
        C0556a.m319d(false);
        return new Pair<>(this.f4230m, Boolean.valueOf(this.f4231n));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: u */
    public final void mo12765u(boolean z) {
        mo12567h();
        SharedPreferences.Editor edit = mo12755B().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo12766v(long j) {
        return j - this.f4234q.mo12849a() > this.f4239v.mo12849a();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final String mo12767w(String str) {
        mo12567h();
        String str2 = (String) mo12764t(str).first;
        MessageDigest H0 = C2323s9.m7557H0();
        if (H0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, H0.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: x */
    public final void mo12768x(boolean z) {
        mo12567h();
        SharedPreferences.Editor edit = mo12755B().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: y */
    public final void mo12769y(String str) {
        mo12567h();
        SharedPreferences.Editor edit = mo12755B().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: z */
    public final void mo12770z(boolean z) {
        mo12567h();
        mo12427b().mo13104O().mo13131b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo12755B().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }
}
