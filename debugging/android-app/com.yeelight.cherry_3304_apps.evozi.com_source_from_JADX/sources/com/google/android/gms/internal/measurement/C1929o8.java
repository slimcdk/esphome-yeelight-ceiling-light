package com.google.android.gms.internal.measurement;

import android.support.p002v4.media.session.PlaybackStateCompat;
import com.xiaomi.mistatistic.sdk.MiStatInterface;

/* renamed from: com.google.android.gms.internal.measurement.o8 */
public final class C1929o8 implements C1943p8 {

    /* renamed from: A */
    private static final C2026v1<Long> f3619A;

    /* renamed from: B */
    private static final C2026v1<Long> f3620B;

    /* renamed from: C */
    private static final C2026v1<Long> f3621C;

    /* renamed from: D */
    private static final C2026v1<Long> f3622D;

    /* renamed from: E */
    private static final C2026v1<Long> f3623E;

    /* renamed from: F */
    private static final C2026v1<String> f3624F;

    /* renamed from: G */
    private static final C2026v1<Long> f3625G;

    /* renamed from: a */
    private static final C2026v1<Long> f3626a;

    /* renamed from: b */
    private static final C2026v1<Long> f3627b;

    /* renamed from: c */
    private static final C2026v1<String> f3628c;

    /* renamed from: d */
    private static final C2026v1<String> f3629d;

    /* renamed from: e */
    private static final C2026v1<Long> f3630e;

    /* renamed from: f */
    private static final C2026v1<Long> f3631f;

    /* renamed from: g */
    private static final C2026v1<Long> f3632g;

    /* renamed from: h */
    private static final C2026v1<Long> f3633h;

    /* renamed from: i */
    private static final C2026v1<Long> f3634i;

    /* renamed from: j */
    private static final C2026v1<Long> f3635j;

    /* renamed from: k */
    private static final C2026v1<Long> f3636k;

    /* renamed from: l */
    private static final C2026v1<Long> f3637l;

    /* renamed from: m */
    private static final C2026v1<Long> f3638m;

    /* renamed from: n */
    private static final C2026v1<Long> f3639n;

    /* renamed from: o */
    private static final C2026v1<Long> f3640o;

    /* renamed from: p */
    private static final C2026v1<Long> f3641p;

    /* renamed from: q */
    private static final C2026v1<Long> f3642q;

    /* renamed from: r */
    private static final C2026v1<Long> f3643r;

    /* renamed from: s */
    private static final C2026v1<Long> f3644s;

    /* renamed from: t */
    private static final C2026v1<Long> f3645t;

    /* renamed from: u */
    private static final C2026v1<Long> f3646u;

    /* renamed from: v */
    private static final C2026v1<Long> f3647v;

    /* renamed from: w */
    private static final C2026v1<Long> f3648w;

    /* renamed from: x */
    private static final C2026v1<Long> f3649x;

    /* renamed from: y */
    private static final C2026v1<Long> f3650y;

    /* renamed from: z */
    private static final C2026v1<Long> f3651z;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3626a = b2Var.mo11453b("measurement.ad_id_cache_time", 10000);
        f3627b = b2Var.mo11453b("measurement.config.cache_time", MiStatInterface.MAX_UPLOAD_INTERVAL);
        b2Var.mo11454c("measurement.log_tag", "FA");
        f3628c = b2Var.mo11454c("measurement.config.url_authority", "app-measurement.com");
        f3629d = b2Var.mo11454c("measurement.config.url_scheme", "https");
        f3630e = b2Var.mo11453b("measurement.upload.debug_upload_interval", 1000);
        f3631f = b2Var.mo11453b("measurement.lifetimevalue.max_currency_tracked", 4);
        f3632g = b2Var.mo11453b("measurement.store.max_stored_events_per_app", 100000);
        f3633h = b2Var.mo11453b("measurement.experiment.max_ids", 50);
        f3634i = b2Var.mo11453b("measurement.audience.filter_result_max_count", 200);
        f3635j = b2Var.mo11453b("measurement.alarm_manager.minimum_interval", MiStatInterface.MIN_UPLOAD_INTERVAL);
        f3636k = b2Var.mo11453b("measurement.upload.minimum_delay", 500);
        f3637l = b2Var.mo11453b("measurement.monitoring.sample_period_millis", MiStatInterface.MAX_UPLOAD_INTERVAL);
        f3638m = b2Var.mo11453b("measurement.upload.realtime_upload_interval", 10000);
        f3639n = b2Var.mo11453b("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        b2Var.mo11453b("measurement.config.cache_time.service", 3600000);
        f3640o = b2Var.mo11453b("measurement.service_client.idle_disconnect_millis", 5000);
        b2Var.mo11454c("measurement.log_tag.service", "FA-SVC");
        f3641p = b2Var.mo11453b("measurement.upload.stale_data_deletion_interval", MiStatInterface.MAX_UPLOAD_INTERVAL);
        f3642q = b2Var.mo11453b("measurement.upload.backoff_period", 43200000);
        f3643r = b2Var.mo11453b("measurement.upload.initial_upload_delay_time", 15000);
        f3644s = b2Var.mo11453b("measurement.upload.interval", 3600000);
        f3645t = b2Var.mo11453b("measurement.upload.max_bundle_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        f3646u = b2Var.mo11453b("measurement.upload.max_bundles", 100);
        f3647v = b2Var.mo11453b("measurement.upload.max_conversions_per_day", 500);
        f3648w = b2Var.mo11453b("measurement.upload.max_error_events_per_day", 1000);
        f3649x = b2Var.mo11453b("measurement.upload.max_events_per_bundle", 1000);
        f3650y = b2Var.mo11453b("measurement.upload.max_events_per_day", 100000);
        f3651z = b2Var.mo11453b("measurement.upload.max_public_events_per_day", 50000);
        f3619A = b2Var.mo11453b("measurement.upload.max_queue_time", 2419200000L);
        f3620B = b2Var.mo11453b("measurement.upload.max_realtime_events_per_day", 10);
        f3621C = b2Var.mo11453b("measurement.upload.max_batch_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        f3622D = b2Var.mo11453b("measurement.upload.retry_count", 6);
        f3623E = b2Var.mo11453b("measurement.upload.retry_time", 1800000);
        f3624F = b2Var.mo11454c("measurement.upload.url", "https://app-measurement.com/a");
        f3625G = b2Var.mo11453b("measurement.upload.window_interval", 3600000);
    }

    /* renamed from: C */
    public final long mo11900C() {
        return f3626a.mo12125n().longValue();
    }

    /* renamed from: D */
    public final long mo11901D() {
        return f3627b.mo12125n().longValue();
    }

    /* renamed from: E */
    public final String mo11902E() {
        return f3628c.mo12125n();
    }

    /* renamed from: F */
    public final String mo11903F() {
        return f3629d.mo12125n();
    }

    /* renamed from: G */
    public final long mo11904G() {
        return f3630e.mo12125n().longValue();
    }

    /* renamed from: I */
    public final long mo11905I() {
        return f3646u.mo12125n().longValue();
    }

    /* renamed from: M */
    public final long mo11906M() {
        return f3645t.mo12125n().longValue();
    }

    /* renamed from: a */
    public final long mo11907a() {
        return f3642q.mo12125n().longValue();
    }

    /* renamed from: b */
    public final long mo11908b() {
        return f3643r.mo12125n().longValue();
    }

    /* renamed from: c */
    public final long mo11909c() {
        return f3639n.mo12125n().longValue();
    }

    /* renamed from: d */
    public final long mo11910d() {
        return f3631f.mo12125n().longValue();
    }

    /* renamed from: e */
    public final long mo11911e() {
        return f3632g.mo12125n().longValue();
    }

    /* renamed from: f */
    public final long mo11912f() {
        return f3638m.mo12125n().longValue();
    }

    /* renamed from: g */
    public final long mo11913g() {
        return f3641p.mo12125n().longValue();
    }

    /* renamed from: h */
    public final long mo11914h() {
        return f3650y.mo12125n().longValue();
    }

    /* renamed from: i */
    public final long mo11915i() {
        return f3633h.mo12125n().longValue();
    }

    /* renamed from: j */
    public final long mo11916j() {
        return f3625G.mo12125n().longValue();
    }

    /* renamed from: k */
    public final long mo11917k() {
        return f3651z.mo12125n().longValue();
    }

    /* renamed from: l */
    public final long mo11918l() {
        return f3634i.mo12125n().longValue();
    }

    /* renamed from: m */
    public final long mo11919m() {
        return f3648w.mo12125n().longValue();
    }

    /* renamed from: n */
    public final long mo11920n() {
        return f3623E.mo12125n().longValue();
    }

    /* renamed from: o */
    public final long mo11921o() {
        return f3640o.mo12125n().longValue();
    }

    /* renamed from: p */
    public final long mo11922p() {
        return f3649x.mo12125n().longValue();
    }

    /* renamed from: q */
    public final String mo11923q() {
        return f3624F.mo12125n();
    }

    /* renamed from: r */
    public final long mo11924r() {
        return f3637l.mo12125n().longValue();
    }

    /* renamed from: s */
    public final long mo11925s() {
        return f3621C.mo12125n().longValue();
    }

    /* renamed from: t */
    public final long mo11926t() {
        return f3647v.mo12125n().longValue();
    }

    /* renamed from: u */
    public final long mo11927u() {
        return f3622D.mo12125n().longValue();
    }

    /* renamed from: v */
    public final long mo11928v() {
        return f3635j.mo12125n().longValue();
    }

    /* renamed from: w */
    public final long mo11929w() {
        return f3619A.mo12125n().longValue();
    }

    /* renamed from: x */
    public final long mo11930x() {
        return f3644s.mo12125n().longValue();
    }

    /* renamed from: y */
    public final long mo11931y() {
        return f3636k.mo12125n().longValue();
    }

    /* renamed from: z */
    public final long mo11932z() {
        return f3620B.mo12125n().longValue();
    }
}
