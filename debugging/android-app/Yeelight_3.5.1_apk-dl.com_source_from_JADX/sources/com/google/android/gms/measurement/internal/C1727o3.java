package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1092f6;
import com.google.android.gms.internal.measurement.C1345v5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.o3 */
public final class C1727o3 {

    /* renamed from: A */
    public static final C1715n3 f2390A = m4535a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C1596e0.f2047a);

    /* renamed from: A0 */
    public static final C1715n3 f2391A0;

    /* renamed from: B */
    public static final C1715n3 f2392B = m4535a("measurement.upload.retry_time", 1800000L, 1800000L, C1609f0.f2070a);

    /* renamed from: B0 */
    public static final C1715n3 f2393B0;

    /* renamed from: C */
    public static final C1715n3 f2394C = m4535a("measurement.upload.retry_count", 6, 6, C1622g0.f2100a);

    /* renamed from: C0 */
    public static final C1715n3 f2395C0;

    /* renamed from: D */
    public static final C1715n3 f2396D = m4535a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C1648i0.f2154a);

    /* renamed from: D0 */
    public static final C1715n3 f2397D0;

    /* renamed from: E */
    public static final C1715n3 f2398E = m4535a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C1661j0.f2180a);

    /* renamed from: E0 */
    public static final C1715n3 f2399E0;

    /* renamed from: F */
    public static final C1715n3 f2400F = m4535a("measurement.audience.filter_result_max_count", 200, 200, C1687l0.f2259a);

    /* renamed from: F0 */
    public static final C1715n3 f2401F0;

    /* renamed from: G */
    public static final C1715n3 f2402G = m4535a("measurement.upload.max_public_user_properties", 25, 25, (C1677k3) null);

    /* renamed from: G0 */
    public static final C1715n3 f2403G0;

    /* renamed from: H */
    public static final C1715n3 f2404H = m4535a("measurement.upload.max_event_name_cardinality", 500, 500, (C1677k3) null);

    /* renamed from: H0 */
    public static final C1715n3 f2405H0;

    /* renamed from: I */
    public static final C1715n3 f2406I = m4535a("measurement.upload.max_public_event_params", 25, 25, (C1677k3) null);

    /* renamed from: I0 */
    public static final C1715n3 f2407I0;

    /* renamed from: J */
    public static final C1715n3 f2408J = m4535a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C1700m0.f2294a);

    /* renamed from: J0 */
    public static final C1715n3 f2409J0;

    /* renamed from: K */
    public static final C1715n3 f2410K;

    /* renamed from: K0 */
    public static final C1715n3 f2411K0;

    /* renamed from: L */
    public static final C1715n3 f2412L = m4535a("measurement.test.string_flag", "---", "---", C1724o0.f2387a);

    /* renamed from: L0 */
    public static final C1715n3 f2413L0;

    /* renamed from: M */
    public static final C1715n3 f2414M = m4535a("measurement.test.long_flag", -1L, -1L, C1736p0.f2505a);

    /* renamed from: M0 */
    public static final C1715n3 f2415M0;

    /* renamed from: N */
    public static final C1715n3 f2416N = m4535a("measurement.test.int_flag", -2, -2, C1748q0.f2526a);

    /* renamed from: O */
    public static final C1715n3 f2417O;

    /* renamed from: P */
    public static final C1715n3 f2418P = m4535a("measurement.experiment.max_ids", 50, 50, C1784t0.f2667a);

    /* renamed from: Q */
    public static final C1715n3 f2419Q = m4535a("measurement.max_bundles_per_iteration", 100, 100, C1796u0.f2698a);

    /* renamed from: R */
    public static final C1715n3 f2420R = m4535a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C1808v0.f2715a);

    /* renamed from: S */
    public static final C1715n3 f2421S = m4535a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, C1832x0.f2757a);

    /* renamed from: T */
    public static final C1715n3 f2422T;

    /* renamed from: U */
    public static final C1715n3 f2423U;

    /* renamed from: V */
    public static final C1715n3 f2424V;

    /* renamed from: W */
    public static final C1715n3 f2425W;

    /* renamed from: X */
    public static final C1715n3 f2426X;

    /* renamed from: Y */
    public static final C1715n3 f2427Y;

    /* renamed from: Z */
    public static final C1715n3 f2428Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final List f2429a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final C1715n3 f2430a0;

    /* renamed from: b */
    public static final C1715n3 f2431b = m4535a("measurement.ad_id_cache_time", 10000L, 10000L, C1807v.f2714a);

    /* renamed from: b0 */
    public static final C1715n3 f2432b0;

    /* renamed from: c */
    public static final C1715n3 f2433c = m4535a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C1843y.f2774a);

    /* renamed from: c0 */
    public static final C1715n3 f2434c0;

    /* renamed from: d */
    public static final C1715n3 f2435d = m4535a("measurement.config.cache_time", 86400000L, 3600000L, C1674k0.f2214a);

    /* renamed from: d0 */
    public static final C1715n3 f2436d0;

    /* renamed from: e */
    public static final C1715n3 f2437e = m4535a("measurement.config.url_scheme", "https", "https", C1820w0.f2736a);

    /* renamed from: e0 */
    public static final C1715n3 f2438e0;

    /* renamed from: f */
    public static final C1715n3 f2439f = m4535a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C1662j1.f2181a);

    /* renamed from: f0 */
    public static final C1715n3 f2440f0;

    /* renamed from: g */
    public static final C1715n3 f2441g = m4535a("measurement.upload.max_bundles", 100, 100, C1809v1.f2716a);

    /* renamed from: g0 */
    public static final C1715n3 f2442g0;

    /* renamed from: h */
    public static final C1715n3 f2443h = m4535a("measurement.upload.max_batch_size", 65536, 65536, C1650i2.f2156a);

    /* renamed from: h0 */
    public static final C1715n3 f2444h0;

    /* renamed from: i */
    public static final C1715n3 f2445i = m4535a("measurement.upload.max_bundle_size", 65536, 65536, C1798u2.f2700a);

    /* renamed from: i0 */
    public static final C1715n3 f2446i0 = m4535a("measurement.service.storage_consent_support_version", 203600, 203600, C1761r1.f2558a);

    /* renamed from: j */
    public static final C1715n3 f2447j = m4535a("measurement.upload.max_events_per_bundle", 1000, 1000, C1625g3.f2103a);

    /* renamed from: j0 */
    public static final C1715n3 f2448j0;

    /* renamed from: k */
    public static final C1715n3 f2449k = m4535a("measurement.upload.max_events_per_day", 100000, 100000, C1638h3.f2134a);

    /* renamed from: k0 */
    public static final C1715n3 f2450k0;

    /* renamed from: l */
    public static final C1715n3 f2451l = m4535a("measurement.upload.max_error_events_per_day", 1000, 1000, C1635h0.f2131a);

    /* renamed from: l0 */
    public static final C1715n3 f2452l0;

    /* renamed from: m */
    public static final C1715n3 f2453m = m4535a("measurement.upload.max_public_events_per_day", 50000, 50000, C1772s0.f2635a);

    /* renamed from: m0 */
    public static final C1715n3 f2454m0;

    /* renamed from: n */
    public static final C1715n3 f2455n = m4535a("measurement.upload.max_conversions_per_day", 10000, 10000, C1597e1.f2048a);

    /* renamed from: n0 */
    public static final C1715n3 f2456n0;

    /* renamed from: o */
    public static final C1715n3 f2457o = m4535a("measurement.upload.max_realtime_events_per_day", 10, 10, C1737p1.f2506a);

    /* renamed from: o0 */
    public static final C1715n3 f2458o0;

    /* renamed from: p */
    public static final C1715n3 f2459p = m4535a("measurement.store.max_stored_events_per_app", 100000, 100000, C1559b2.f1945a);

    /* renamed from: p0 */
    public static final C1715n3 f2460p0;

    /* renamed from: q */
    public static final C1715n3 f2461q = m4535a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C1702m2.f2296a);

    /* renamed from: q0 */
    public static final C1715n3 f2462q0;

    /* renamed from: r */
    public static final C1715n3 f2463r = m4535a("measurement.upload.backoff_period", 43200000L, 43200000L, C1834x2.f2759a);

    /* renamed from: r0 */
    public static final C1715n3 f2464r0;

    /* renamed from: s */
    public static final C1715n3 f2465s = m4535a("measurement.upload.window_interval", 3600000L, 3600000L, C1651i3.f2157a);

    /* renamed from: s0 */
    public static final C1715n3 f2466s0;

    /* renamed from: t */
    public static final C1715n3 f2467t = m4535a("measurement.upload.interval", 3600000L, 3600000L, C1664j3.f2183a);

    /* renamed from: t0 */
    public static final C1715n3 f2468t0;

    /* renamed from: u */
    public static final C1715n3 f2469u = m4535a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C1819w.f2735a);

    /* renamed from: u0 */
    public static final C1715n3 f2470u0;

    /* renamed from: v */
    public static final C1715n3 f2471v = m4535a("measurement.upload.debug_upload_interval", 1000L, 1000L, C1855z.f2810a);

    /* renamed from: v0 */
    public static final C1715n3 f2472v0;

    /* renamed from: w */
    public static final C1715n3 f2473w = m4535a("measurement.upload.minimum_delay", 500L, 500L, C1544a0.f1913a);

    /* renamed from: w0 */
    public static final C1715n3 f2474w0;

    /* renamed from: x */
    public static final C1715n3 f2475x = m4535a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C1557b0.f1943a);

    /* renamed from: x0 */
    public static final C1715n3 f2476x0;

    /* renamed from: y */
    public static final C1715n3 f2477y = m4535a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C1570c0.f1963a);

    /* renamed from: y0 */
    public static final C1715n3 f2478y0;

    /* renamed from: z */
    public static final C1715n3 f2479z = m4535a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C1583d0.f1996a);

    /* renamed from: z0 */
    public static final C1715n3 f2480z0;

    static {
        Collections.synchronizedSet(new HashSet());
        Boolean bool = Boolean.FALSE;
        f2410K = m4535a("measurement.test.boolean_flag", bool, bool, C1712n0.f2317a);
        Double valueOf = Double.valueOf(-3.0d);
        f2417O = m4535a("measurement.test.double_flag", valueOf, valueOf, C1760r0.f2557a);
        Boolean bool2 = Boolean.TRUE;
        f2422T = m4535a("measurement.validation.internal_limits_internal_event_params", bool2, bool2, C1856z0.f2811a);
        f2423U = m4535a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C1545a1.f1914a);
        f2424V = m4535a("measurement.quality.checksum", bool, bool, (C1677k3) null);
        f2425W = m4535a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C1558b1.f1944a);
        f2426X = m4535a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C1571c1.f1964a);
        f2427Y = m4535a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C1584d1.f1997a);
        f2428Z = m4535a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C1610f1.f2071a);
        f2430a0 = m4535a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C1623g1.f2101a);
        f2432b0 = m4535a("measurement.lifecycle.app_in_background_parameter", bool, bool, C1636h1.f2132a);
        f2434c0 = m4535a("measurement.integration.disable_firebase_instance_id", bool, bool, C1649i1.f2155a);
        f2436d0 = m4535a("measurement.collection.service.update_with_analytics_fix", bool, bool, C1675k1.f2215a);
        f2438e0 = m4535a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C1688l1.f2260a);
        f2440f0 = m4535a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C1701m1.f2295a);
        f2442g0 = m4535a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, C1713n1.f2318a);
        m4535a("measurement.collection.synthetic_data_mitigation", bool, bool, C1725o1.f2388a);
        f2444h0 = m4535a("measurement.androidId.delete_feature", bool2, bool2, C1749q1.f2527a);
        m4535a("measurement.client.click_identifier_control.dev", bool, bool, C1773s1.f2636a);
        m4535a("measurement.service.click_identifier_control", bool, bool, C1785t1.f2668a);
        f2448j0 = m4535a("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, C1797u1.f2699a);
        f2450k0 = m4535a("measurement.module.pixie.fix_array", bool2, bool2, C1821w1.f2737a);
        f2452l0 = m4535a("measurement.adid_zero.service", bool2, bool2, C1833x1.f2758a);
        f2454m0 = m4535a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, C1845y1.f2777a);
        f2456n0 = m4535a("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, C1546a2.f1915a);
        f2458o0 = m4535a("measurement.adid_zero.remove_lair_on_id_value_change_only", bool2, bool2, C1572c2.f1965a);
        f2460p0 = m4535a("measurement.adid_zero.adid_uid", bool2, bool2, C1585d2.f1998a);
        f2462q0 = m4535a("measurement.adid_zero.app_instance_id_fix", bool2, bool2, C1598e2.f2049a);
        f2464r0 = m4535a("measurement.service.refactor.package_side_screen", bool2, bool2, C1611f2.f2072a);
        f2466s0 = m4535a("measurement.enhanced_campaign.service", bool2, bool2, C1624g2.f2102a);
        f2468t0 = m4535a("measurement.enhanced_campaign.client", bool2, bool2, C1637h2.f2133a);
        f2470u0 = m4535a("measurement.enhanced_campaign.srsltid.client", bool2, bool2, C1663j2.f2182a);
        f2472v0 = m4535a("measurement.enhanced_campaign.srsltid.service", bool2, bool2, C1676k2.f2216a);
        f2474w0 = m4535a("measurement.service.store_null_safelist", bool2, bool2, C1689l2.f2261a);
        f2476x0 = m4535a("measurement.service.store_safelist", bool2, bool2, C1714n2.f2319a);
        f2478y0 = m4535a("measurement.redaction.no_aiid_in_config_request", bool2, bool2, C1726o2.f2389a);
        f2480z0 = m4535a("measurement.redaction.config_redacted_fields", bool2, bool2, C1738p2.f2507a);
        f2391A0 = m4535a("measurement.redaction.upload_redacted_fields", bool2, bool2, C1750q2.f2528a);
        f2393B0 = m4535a("measurement.redaction.upload_subdomain_override", bool2, bool2, C1762r2.f2559a);
        f2395C0 = m4535a("measurement.redaction.device_info", bool2, bool2, C1774s2.f2637a);
        f2397D0 = m4535a("measurement.redaction.user_id", bool2, bool2, C1786t2.f2669a);
        f2399E0 = m4535a("measurement.redaction.google_signals", bool2, bool2, C1810v2.f2717a);
        f2401F0 = m4535a("measurement.collection.enable_session_stitching_token.service", bool, bool, C1822w2.f2738a);
        f2403G0 = m4535a("measurement.collection.enable_session_stitching_token.client.dev", bool, bool, C1846y2.f2778a);
        f2405H0 = m4535a("measurement.redaction.app_instance_id", bool2, bool2, C1858z2.f2815a);
        f2407I0 = m4535a("measurement.redaction.populate_ephemeral_app_instance_id", bool2, bool2, C1560b3.f1946a);
        f2409J0 = m4535a("measurement.redaction.enhanced_uid", bool2, bool2, C1573c3.f1966a);
        f2411K0 = m4535a("measurement.redaction.e_tag", bool, bool, C1586d3.f1999a);
        f2413L0 = m4535a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, C1599e3.f2050a);
        f2415M0 = m4535a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, C1612f3.f2073a);
    }

    @VisibleForTesting
    /* renamed from: a */
    static C1715n3 m4535a(String str, Object obj, Object obj2, C1677k3 k3Var) {
        C1715n3 n3Var = new C1715n3(str, obj, obj2, k3Var, (C1703m3) null);
        f2429a.add(n3Var);
        return n3Var;
    }

    /* renamed from: c */
    public static Map m4537c(Context context) {
        C1345v5 b = C1345v5.m3112b(context.getContentResolver(), C1092f6.m1948a("com.google.android.gms.measurement"));
        return b == null ? Collections.emptyMap() : b.mo13428c();
    }
}
