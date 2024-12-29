package com.google.android.gms.internal.measurement;

import android.support.p004v4.media.session.PlaybackStateCompat;

/* renamed from: com.google.android.gms.internal.measurement.sb */
public final class C1305sb implements C1289rb {

    /* renamed from: A */
    public static final C1252p6 f1603A;

    /* renamed from: B */
    public static final C1252p6 f1604B;

    /* renamed from: C */
    public static final C1252p6 f1605C;

    /* renamed from: D */
    public static final C1252p6 f1606D;

    /* renamed from: E */
    public static final C1252p6 f1607E;

    /* renamed from: F */
    public static final C1252p6 f1608F;

    /* renamed from: G */
    public static final C1252p6 f1609G;

    /* renamed from: H */
    public static final C1252p6 f1610H;

    /* renamed from: I */
    public static final C1252p6 f1611I;

    /* renamed from: J */
    public static final C1252p6 f1612J;

    /* renamed from: a */
    public static final C1252p6 f1613a;

    /* renamed from: b */
    public static final C1252p6 f1614b;

    /* renamed from: c */
    public static final C1252p6 f1615c;

    /* renamed from: d */
    public static final C1252p6 f1616d;

    /* renamed from: e */
    public static final C1252p6 f1617e;

    /* renamed from: f */
    public static final C1252p6 f1618f;

    /* renamed from: g */
    public static final C1252p6 f1619g;

    /* renamed from: h */
    public static final C1252p6 f1620h;

    /* renamed from: i */
    public static final C1252p6 f1621i;

    /* renamed from: j */
    public static final C1252p6 f1622j;

    /* renamed from: k */
    public static final C1252p6 f1623k;

    /* renamed from: l */
    public static final C1252p6 f1624l;

    /* renamed from: m */
    public static final C1252p6 f1625m;

    /* renamed from: n */
    public static final C1252p6 f1626n;

    /* renamed from: o */
    public static final C1252p6 f1627o;

    /* renamed from: p */
    public static final C1252p6 f1628p;

    /* renamed from: q */
    public static final C1252p6 f1629q;

    /* renamed from: r */
    public static final C1252p6 f1630r;

    /* renamed from: s */
    public static final C1252p6 f1631s;

    /* renamed from: t */
    public static final C1252p6 f1632t;

    /* renamed from: u */
    public static final C1252p6 f1633u;

    /* renamed from: v */
    public static final C1252p6 f1634v;

    /* renamed from: w */
    public static final C1252p6 f1635w;

    /* renamed from: x */
    public static final C1252p6 f1636x;

    /* renamed from: y */
    public static final C1252p6 f1637y;

    /* renamed from: z */
    public static final C1252p6 f1638z;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12977a();
        f1613a = a.mo12980d("measurement.ad_id_cache_time", 10000);
        f1614b = a.mo12980d("measurement.max_bundles_per_iteration", 100);
        f1615c = a.mo12980d("measurement.config.cache_time", 86400000);
        a.mo12981e("measurement.log_tag", "FA");
        f1616d = a.mo12981e("measurement.config.url_authority", "app-measurement.com");
        f1617e = a.mo12981e("measurement.config.url_scheme", "https");
        f1618f = a.mo12980d("measurement.upload.debug_upload_interval", 1000);
        f1619g = a.mo12980d("measurement.lifetimevalue.max_currency_tracked", 4);
        f1620h = a.mo12980d("measurement.store.max_stored_events_per_app", 100000);
        f1621i = a.mo12980d("measurement.experiment.max_ids", 50);
        f1622j = a.mo12980d("measurement.audience.filter_result_max_count", 200);
        f1623k = a.mo12980d("measurement.alarm_manager.minimum_interval", 60000);
        f1624l = a.mo12980d("measurement.upload.minimum_delay", 500);
        f1625m = a.mo12980d("measurement.monitoring.sample_period_millis", 86400000);
        f1626n = a.mo12980d("measurement.upload.realtime_upload_interval", 10000);
        f1627o = a.mo12980d("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        a.mo12980d("measurement.config.cache_time.service", 3600000);
        f1628p = a.mo12980d("measurement.service_client.idle_disconnect_millis", 5000);
        a.mo12981e("measurement.log_tag.service", "FA-SVC");
        f1629q = a.mo12980d("measurement.upload.stale_data_deletion_interval", 86400000);
        f1630r = a.mo12980d("measurement.sdk.attribution.cache.ttl", 604800000);
        f1631s = a.mo12980d("measurement.redaction.app_instance_id.ttl", 7200000);
        f1632t = a.mo12980d("measurement.upload.backoff_period", 43200000);
        f1633u = a.mo12980d("measurement.upload.initial_upload_delay_time", 15000);
        f1634v = a.mo12980d("measurement.upload.interval", 3600000);
        f1635w = a.mo12980d("measurement.upload.max_bundle_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        f1636x = a.mo12980d("measurement.upload.max_bundles", 100);
        f1637y = a.mo12980d("measurement.upload.max_conversions_per_day", 500);
        f1638z = a.mo12980d("measurement.upload.max_error_events_per_day", 1000);
        f1603A = a.mo12980d("measurement.upload.max_events_per_bundle", 1000);
        f1604B = a.mo12980d("measurement.upload.max_events_per_day", 100000);
        f1605C = a.mo12980d("measurement.upload.max_public_events_per_day", 50000);
        f1606D = a.mo12980d("measurement.upload.max_queue_time", 2419200000L);
        f1607E = a.mo12980d("measurement.upload.max_realtime_events_per_day", 10);
        f1608F = a.mo12980d("measurement.upload.max_batch_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        f1609G = a.mo12980d("measurement.upload.retry_count", 6);
        f1610H = a.mo12980d("measurement.upload.retry_time", 1800000);
        f1611I = a.mo12981e("measurement.upload.url", "https://app-measurement.com/a");
        f1612J = a.mo12980d("measurement.upload.window_interval", 3600000);
    }

    /* renamed from: D */
    public final long mo13215D() {
        return ((Long) f1614b.mo13069b()).longValue();
    }

    /* renamed from: E */
    public final long mo13216E() {
        return ((Long) f1615c.mo13069b()).longValue();
    }

    /* renamed from: G */
    public final long mo13217G() {
        return ((Long) f1637y.mo13069b()).longValue();
    }

    /* renamed from: H */
    public final long mo13218H() {
        return ((Long) f1627o.mo13069b()).longValue();
    }

    /* renamed from: K */
    public final String mo13219K() {
        return (String) f1616d.mo13069b();
    }

    /* renamed from: L */
    public final long mo13220L() {
        return ((Long) f1630r.mo13069b()).longValue();
    }

    /* renamed from: M */
    public final long mo13221M() {
        return ((Long) f1610H.mo13069b()).longValue();
    }

    /* renamed from: N */
    public final long mo13222N() {
        return ((Long) f1603A.mo13069b()).longValue();
    }

    /* renamed from: O */
    public final long mo13223O() {
        return ((Long) f1631s.mo13069b()).longValue();
    }

    /* renamed from: P */
    public final long mo13224P() {
        return ((Long) f1604B.mo13069b()).longValue();
    }

    /* renamed from: Q */
    public final long mo13225Q() {
        return ((Long) f1612J.mo13069b()).longValue();
    }

    /* renamed from: R */
    public final long mo13226R() {
        return ((Long) f1632t.mo13069b()).longValue();
    }

    /* renamed from: S */
    public final long mo13227S() {
        return ((Long) f1628p.mo13069b()).longValue();
    }

    /* renamed from: T */
    public final long mo13228T() {
        return ((Long) f1608F.mo13069b()).longValue();
    }

    /* renamed from: U */
    public final long mo13229U() {
        return ((Long) f1629q.mo13069b()).longValue();
    }

    /* renamed from: V */
    public final long mo13230V() {
        return ((Long) f1609G.mo13069b()).longValue();
    }

    /* renamed from: W */
    public final long mo13231W() {
        return ((Long) f1638z.mo13069b()).longValue();
    }

    /* renamed from: X */
    public final String mo13232X() {
        return (String) f1611I.mo13069b();
    }

    /* renamed from: Y */
    public final long mo13233Y() {
        return ((Long) f1606D.mo13069b()).longValue();
    }

    /* renamed from: Z */
    public final long mo13234Z() {
        return ((Long) f1635w.mo13069b()).longValue();
    }

    /* renamed from: a */
    public final long mo13235a() {
        return ((Long) f1619g.mo13069b()).longValue();
    }

    /* renamed from: a0 */
    public final long mo13236a0() {
        return ((Long) f1636x.mo13069b()).longValue();
    }

    /* renamed from: b */
    public final long mo13237b() {
        return ((Long) f1618f.mo13069b()).longValue();
    }

    /* renamed from: b0 */
    public final long mo13238b0() {
        return ((Long) f1607E.mo13069b()).longValue();
    }

    /* renamed from: c */
    public final long mo13239c() {
        return ((Long) f1622j.mo13069b()).longValue();
    }

    /* renamed from: c0 */
    public final long mo13240c0() {
        return ((Long) f1633u.mo13069b()).longValue();
    }

    /* renamed from: d */
    public final long mo13241d() {
        return ((Long) f1623k.mo13069b()).longValue();
    }

    /* renamed from: d0 */
    public final String mo13242d0() {
        return (String) f1617e.mo13069b();
    }

    /* renamed from: e */
    public final long mo13243e() {
        return ((Long) f1621i.mo13069b()).longValue();
    }

    /* renamed from: e0 */
    public final long mo13244e0() {
        return ((Long) f1605C.mo13069b()).longValue();
    }

    /* renamed from: f */
    public final long mo13245f() {
        return ((Long) f1620h.mo13069b()).longValue();
    }

    /* renamed from: f0 */
    public final long mo13246f0() {
        return ((Long) f1634v.mo13069b()).longValue();
    }

    /* renamed from: g */
    public final long mo13247g() {
        return ((Long) f1626n.mo13069b()).longValue();
    }

    /* renamed from: h */
    public final long mo13248h() {
        return ((Long) f1624l.mo13069b()).longValue();
    }

    /* renamed from: i */
    public final long mo13249i() {
        return ((Long) f1625m.mo13069b()).longValue();
    }

    public final long zza() {
        return ((Long) f1613a.mo13069b()).longValue();
    }
}
