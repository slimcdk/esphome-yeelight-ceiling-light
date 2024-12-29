package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1808h1;
import com.google.android.gms.internal.measurement.C2043w1;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.r */
public final class C2302r {

    /* renamed from: A */
    public static C2284p3<Long> f4457A = m7437a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C2214j0.f4211a);

    /* renamed from: A0 */
    public static C2284p3<Boolean> f4458A0;

    /* renamed from: B */
    public static C2284p3<Long> f4459B = m7437a("measurement.upload.retry_time", 1800000L, 1800000L, C2248m0.f4354a);

    /* renamed from: B0 */
    public static C2284p3<Boolean> f4460B0;

    /* renamed from: C */
    public static C2284p3<Integer> f4461C = m7437a("measurement.upload.retry_count", 6, 6, C2236l0.f4291a);

    /* renamed from: C0 */
    public static C2284p3<Boolean> f4462C0;

    /* renamed from: D */
    public static C2284p3<Long> f4463D = m7437a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C2270o0.f4394a);

    /* renamed from: D0 */
    public static C2284p3<Boolean> f4464D0;

    /* renamed from: E */
    public static C2284p3<Integer> f4465E = m7437a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C2259n0.f4375a);

    /* renamed from: E0 */
    public static C2284p3<Boolean> f4466E0;

    /* renamed from: F */
    public static C2284p3<Integer> f4467F = m7437a("measurement.audience.filter_result_max_count", 200, 200, C2281p0.f4416a);

    /* renamed from: F0 */
    public static C2284p3<Boolean> f4468F0;

    /* renamed from: G */
    public static C2284p3<Integer> f4469G = m7437a("measurement.upload.max_public_user_properties", 25, 25, (C2262n3) null);

    /* renamed from: G0 */
    public static C2284p3<Boolean> f4470G0;

    /* renamed from: H */
    public static C2284p3<Integer> f4471H = m7437a("measurement.upload.max_event_name_cardinality", 500, 500, (C2262n3) null);

    /* renamed from: H0 */
    public static C2284p3<Boolean> f4472H0;

    /* renamed from: I */
    public static C2284p3<Integer> f4473I = m7437a("measurement.upload.max_public_event_params", 25, 25, (C2262n3) null);

    /* renamed from: I0 */
    public static C2284p3<Boolean> f4474I0;

    /* renamed from: J */
    public static C2284p3<Long> f4475J = m7437a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C2314s0.f4573a);

    /* renamed from: J0 */
    public static C2284p3<Boolean> f4476J0;

    /* renamed from: K */
    public static C2284p3<Boolean> f4477K;

    /* renamed from: K0 */
    public static C2284p3<Boolean> f4478K0;

    /* renamed from: L */
    public static C2284p3<String> f4479L = m7437a("measurement.test.string_flag", "---", "---", C2336u0.f4632a);

    /* renamed from: L0 */
    public static C2284p3<Boolean> f4480L0;

    /* renamed from: M */
    public static C2284p3<Long> f4481M = m7437a("measurement.test.long_flag", -1L, -1L, C2325t0.f4599a);

    /* renamed from: M0 */
    public static C2284p3<Boolean> f4482M0;

    /* renamed from: N */
    public static C2284p3<Integer> f4483N = m7437a("measurement.test.int_flag", -2, -2, C2358w0.f4674a);

    /* renamed from: N0 */
    public static C2284p3<Boolean> f4484N0;

    /* renamed from: O */
    public static C2284p3<Double> f4485O;

    /* renamed from: O0 */
    public static C2284p3<Boolean> f4486O0;

    /* renamed from: P */
    public static C2284p3<Integer> f4487P = m7437a("measurement.experiment.max_ids", 50, 50, C2380y0.f4724a);

    /* renamed from: P0 */
    public static C2284p3<Boolean> f4488P0;

    /* renamed from: Q */
    public static C2284p3<Integer> f4489Q = m7437a("measurement.max_bundles_per_iteration", 2, 2, C2369x0.f4702a);

    /* renamed from: Q0 */
    public static C2284p3<Boolean> f4490Q0;

    /* renamed from: R */
    public static C2284p3<Boolean> f4491R;

    /* renamed from: R0 */
    public static C2284p3<Long> f4492R0 = m7437a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C2239l3.f4294a);

    /* renamed from: S */
    public static C2284p3<Boolean> f4493S;

    /* renamed from: T */
    public static C2284p3<Boolean> f4494T;

    /* renamed from: U */
    public static C2284p3<Boolean> f4495U;

    /* renamed from: V */
    public static C2284p3<Boolean> f4496V;

    /* renamed from: W */
    public static C2284p3<Boolean> f4497W;

    /* renamed from: X */
    public static C2284p3<Boolean> f4498X;

    /* renamed from: Y */
    public static C2284p3<Boolean> f4499Y;

    /* renamed from: Z */
    public static C2284p3<Boolean> f4500Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static List<C2284p3<?>> f4501a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static C2284p3<Boolean> f4502a0;

    /* renamed from: b */
    public static C2284p3<Long> f4503b = m7437a("measurement.ad_id_cache_time", 10000L, 10000L, C2291q.f4440a);

    /* renamed from: b0 */
    public static C2284p3<Boolean> f4504b0;

    /* renamed from: c */
    public static C2284p3<Long> f4505c;

    /* renamed from: c0 */
    public static C2284p3<Boolean> f4506c0;

    /* renamed from: d */
    public static C2284p3<Long> f4507d;

    /* renamed from: d0 */
    public static C2284p3<Boolean> f4508d0;

    /* renamed from: e */
    public static C2284p3<String> f4509e = m7437a("measurement.config.url_scheme", "https", "https", C2292q0.f4441a);

    /* renamed from: e0 */
    public static C2284p3<Boolean> f4510e0;

    /* renamed from: f */
    public static C2284p3<String> f4511f = m7437a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C2391z0.f4743a);

    /* renamed from: f0 */
    public static C2284p3<Boolean> f4512f0;

    /* renamed from: g */
    public static C2284p3<Integer> f4513g = m7437a("measurement.upload.max_bundles", 100, 100, C2260n1.f4376a);

    /* renamed from: g0 */
    public static C2284p3<Boolean> f4514g0;

    /* renamed from: h */
    public static C2284p3<Integer> f4515h = m7437a("measurement.upload.max_batch_size", 65536, 65536, C2359w1.f4675a);

    /* renamed from: h0 */
    public static C2284p3<Boolean> f4516h0;

    /* renamed from: i */
    public static C2284p3<Integer> f4517i = m7437a("measurement.upload.max_bundle_size", 65536, 65536, C2227k2.f4261a);

    /* renamed from: i0 */
    public static C2284p3<Boolean> f4518i0;

    /* renamed from: j */
    public static C2284p3<Integer> f4519j = m7437a("measurement.upload.max_events_per_bundle", 1000, 1000, C2327t2.f4601a);

    /* renamed from: j0 */
    public static C2284p3<Boolean> f4520j0;

    /* renamed from: k */
    public static C2284p3<Integer> f4521k = m7437a("measurement.upload.max_events_per_day", 100000, 100000, C2193h3.f4149a);

    /* renamed from: k0 */
    public static C2284p3<Boolean> f4522k0;

    /* renamed from: l */
    public static C2284p3<Integer> f4523l = m7437a("measurement.upload.max_error_events_per_day", 1000, 1000, C2313s.f4572a);

    /* renamed from: l0 */
    public static C2284p3<Boolean> f4524l0;

    /* renamed from: m */
    public static C2284p3<Integer> f4525m = m7437a("measurement.upload.max_public_events_per_day", 50000, 50000, C2346v.f4652a);

    /* renamed from: m0 */
    public static C2284p3<Boolean> f4526m0;

    /* renamed from: n */
    public static C2284p3<Integer> f4527n = m7437a("measurement.upload.max_conversions_per_day", 10000, 10000, C2335u.f4631a);

    /* renamed from: n0 */
    public static C2284p3<Boolean> f4528n0;

    /* renamed from: o */
    public static C2284p3<Integer> f4529o = m7437a("measurement.upload.max_realtime_events_per_day", 10, 10, C2368x.f4701a);

    /* renamed from: o0 */
    public static C2284p3<Boolean> f4530o0;

    /* renamed from: p */
    public static C2284p3<Integer> f4531p = m7437a("measurement.store.max_stored_events_per_app", 100000, 100000, C2357w.f4673a);

    /* renamed from: p0 */
    public static C2284p3<Boolean> f4532p0;

    /* renamed from: q */
    public static C2284p3<String> f4533q = m7437a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C2106a0.f3901a);

    /* renamed from: q0 */
    public static C2284p3<Boolean> f4534q0;

    /* renamed from: r */
    public static C2284p3<Long> f4535r = m7437a("measurement.upload.backoff_period", 43200000L, 43200000L, C2379y.f4723a);

    /* renamed from: r0 */
    public static C2284p3<Boolean> f4536r0;

    /* renamed from: s */
    public static C2284p3<Long> f4537s = m7437a("measurement.upload.window_interval", 3600000L, 3600000L, C2130c0.f3991a);

    /* renamed from: s0 */
    public static C2284p3<Boolean> f4538s0;

    /* renamed from: t */
    public static C2284p3<Long> f4539t = m7437a("measurement.upload.interval", 3600000L, 3600000L, C2118b0.f3959a);

    /* renamed from: t0 */
    public static C2284p3<Boolean> f4540t0;

    /* renamed from: u */
    public static C2284p3<Long> f4541u = m7437a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C2154e0.f4077a);

    /* renamed from: u0 */
    public static C2284p3<Boolean> f4542u0;

    /* renamed from: v */
    public static C2284p3<Long> f4543v = m7437a("measurement.upload.debug_upload_interval", 1000L, 1000L, C2178g0.f4125a);

    /* renamed from: v0 */
    public static C2284p3<Boolean> f4544v0;

    /* renamed from: w */
    public static C2284p3<Long> f4545w = m7437a("measurement.upload.minimum_delay", 500L, 500L, C2166f0.f4106a);

    /* renamed from: w0 */
    public static C2284p3<Boolean> f4546w0;

    /* renamed from: x */
    public static C2284p3<Long> f4547x;

    /* renamed from: x0 */
    public static C2284p3<Boolean> f4548x0;

    /* renamed from: y */
    public static C2284p3<Long> f4549y;

    /* renamed from: y0 */
    public static C2284p3<Boolean> f4550y0;

    /* renamed from: z */
    public static C2284p3<Long> f4551z = m7437a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C2225k0.f4259a);

    /* renamed from: z0 */
    public static C2284p3<Boolean> f4552z0;

    static {
        Collections.synchronizedSet(new HashSet());
        Long valueOf = Long.valueOf(MiStatInterface.MAX_UPLOAD_INTERVAL);
        f4505c = m7437a("measurement.monitoring.sample_period_millis", valueOf, valueOf, C2324t.f4598a);
        f4507d = m7437a("measurement.config.cache_time", valueOf, 3600000L, C2142d0.f4017a);
        Long valueOf2 = Long.valueOf(MiStatInterface.MIN_UPLOAD_INTERVAL);
        f4547x = m7437a("measurement.alarm_manager.minimum_interval", valueOf2, valueOf2, C2202i0.f4181a);
        f4549y = m7437a("measurement.upload.stale_data_deletion_interval", valueOf, valueOf, C2190h0.f4146a);
        Boolean bool = Boolean.FALSE;
        f4477K = m7437a("measurement.test.boolean_flag", bool, bool, C2303r0.f4553a);
        Double valueOf3 = Double.valueOf(-3.0d);
        f4485O = m7437a("measurement.test.double_flag", valueOf3, valueOf3, C2347v0.f4653a);
        Boolean bool2 = Boolean.FALSE;
        f4491R = m7437a("measurement.validation.internal_limits_internal_event_params", bool2, bool2, C2119b1.f3960a);
        Boolean bool3 = Boolean.TRUE;
        f4493S = m7437a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", bool3, bool3, C2143d1.f4018a);
        Boolean bool4 = Boolean.TRUE;
        f4494T = m7437a("measurement.collection.firebase_global_collection_flag_enabled", bool4, bool4, C2131c1.f3992a);
        Boolean bool5 = Boolean.TRUE;
        f4495U = m7437a("measurement.collection.efficient_engagement_reporting_enabled_2", bool5, bool5, C2167f1.f4107a);
        Boolean bool6 = Boolean.FALSE;
        f4496V = m7437a("measurement.collection.redundant_engagement_removal_enabled", bool6, bool6, C2155e1.f4078a);
        Boolean bool7 = Boolean.TRUE;
        f4497W = m7437a("measurement.client.freeride_engagement_fix", bool7, bool7, C2191h1.f4147a);
        Boolean bool8 = Boolean.TRUE;
        f4498X = m7437a("measurement.experiment.enable_experiment_reporting", bool8, bool8, C2179g1.f4126a);
        Boolean bool9 = Boolean.TRUE;
        f4499Y = m7437a("measurement.collection.log_event_and_bundle_v2", bool9, bool9, C2215j1.f4212a);
        Boolean bool10 = Boolean.FALSE;
        f4500Z = m7437a("measurement.quality.checksum", bool10, bool10, (C2262n3) null);
        Boolean bool11 = Boolean.TRUE;
        f4502a0 = m7437a("measurement.sdk.dynamite.use_dynamite3", bool11, bool11, C2203i1.f4182a);
        Boolean bool12 = Boolean.FALSE;
        f4504b0 = m7437a("measurement.sdk.dynamite.allow_remote_dynamite", bool12, bool12, C2237l1.f4292a);
        Boolean bool13 = Boolean.TRUE;
        f4506c0 = m7437a("measurement.sdk.collection.validate_param_names_alphabetical", bool13, bool13, C2226k1.f4260a);
        Boolean bool14 = Boolean.TRUE;
        f4508d0 = m7437a("measurement.collection.event_safelist", bool14, bool14, C2249m1.f4355a);
        Boolean bool15 = Boolean.TRUE;
        m7437a("measurement.service.audience.invalidate_config_cache_after_app_unisntall", bool15, bool15, C2282p1.f4417a);
        Boolean bool16 = Boolean.TRUE;
        f4510e0 = m7437a("measurement.service.audience.fix_skip_audience_with_failed_filters", bool16, bool16, C2271o1.f4395a);
        Boolean bool17 = Boolean.FALSE;
        f4512f0 = m7437a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool17, bool17, C2304r1.f4554a);
        Boolean bool18 = Boolean.FALSE;
        f4514g0 = m7437a("measurement.audience.refresh_event_count_filters_timestamp", bool18, bool18, C2293q1.f4442a);
        Boolean bool19 = Boolean.FALSE;
        f4516h0 = m7437a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool19, bool19, C2326t1.f4600a);
        Boolean bool20 = Boolean.TRUE;
        f4518i0 = m7437a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool20, bool20, C2315s1.f4574a);
        Boolean bool21 = Boolean.TRUE;
        f4520j0 = m7437a("measurement.sdk.collection.last_deep_link_referrer2", bool21, bool21, C2348v1.f4654a);
        Boolean bool22 = Boolean.FALSE;
        f4522k0 = m7437a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool22, bool22, C2337u1.f4633a);
        Boolean bool23 = Boolean.FALSE;
        f4524l0 = m7437a("measurement.sdk.collection.last_gclid_from_referrer2", bool23, bool23, C2370x1.f4703a);
        Boolean bool24 = Boolean.TRUE;
        f4526m0 = m7437a("measurement.sdk.collection.enable_extend_user_property_size", bool24, bool24, C2392z1.f4744a);
        Boolean bool25 = Boolean.FALSE;
        f4528n0 = m7437a("measurement.upload.file_lock_state_check", bool25, bool25, C2381y1.f4725a);
        Boolean bool26 = Boolean.TRUE;
        f4530o0 = m7437a("measurement.sampling.calculate_bundle_timestamp_before_sampling", bool26, bool26, C2132c2.f3993a);
        Boolean bool27 = Boolean.FALSE;
        f4532p0 = m7437a("measurement.ga.ga_app_id", bool27, bool27, C2108a2.f3904a);
        Boolean bool28 = Boolean.TRUE;
        f4534q0 = m7437a("measurement.lifecycle.app_backgrounded_tracking", bool28, bool28, C2156e2.f4079a);
        Boolean bool29 = Boolean.FALSE;
        f4536r0 = m7437a("measurement.lifecycle.app_in_background_parameter", bool29, bool29, C2144d2.f4019a);
        Boolean bool30 = Boolean.FALSE;
        f4538s0 = m7437a("measurement.integration.disable_firebase_instance_id", bool30, bool30, C2180g2.f4127a);
        Boolean bool31 = Boolean.FALSE;
        f4540t0 = m7437a("measurement.lifecycle.app_backgrounded_engagement", bool31, bool31, C2168f2.f4108a);
        Boolean bool32 = Boolean.FALSE;
        f4542u0 = m7437a("measurement.collection.service.update_with_analytics_fix", bool32, bool32, C2204i2.f4183a);
        Boolean bool33 = Boolean.FALSE;
        f4544v0 = m7437a("measurement.service.use_appinfo_modified", bool33, bool33, C2192h2.f4148a);
        Boolean bool34 = Boolean.TRUE;
        f4546w0 = m7437a("measurement.client.firebase_feature_rollout.v1.enable", bool34, bool34, C2216j2.f4213a);
        Boolean bool35 = Boolean.TRUE;
        f4548x0 = m7437a("measurement.client.sessions.check_on_reset_and_enable2", bool35, bool35, C2250m2.f4356a);
        Boolean bool36 = Boolean.TRUE;
        f4550y0 = m7437a("measurement.config.string.always_update_disk_on_set", bool36, bool36, C2238l2.f4293a);
        Boolean bool37 = Boolean.FALSE;
        f4552z0 = m7437a("measurement.scheduler.task_thread.cleanup_on_exit", bool37, bool37, C2272o2.f4396a);
        Boolean bool38 = Boolean.FALSE;
        f4458A0 = m7437a("measurement.upload.file_truncate_fix", bool38, bool38, C2261n2.f4377a);
        Boolean bool39 = Boolean.TRUE;
        f4460B0 = m7437a("measurement.engagement_time_main_thread", bool39, bool39, C2294q2.f4443a);
        Boolean bool40 = Boolean.FALSE;
        f4462C0 = m7437a("measurement.sdk.referrer.delayed_install_referrer_api", bool40, bool40, C2283p2.f4418a);
        Boolean bool41 = Boolean.TRUE;
        f4464D0 = m7437a("measurement.sdk.screen.disabling_automatic_reporting", bool41, bool41, C2316s2.f4575a);
        Boolean bool42 = Boolean.TRUE;
        f4466E0 = m7437a("measurement.sdk.screen.manual_screen_view_logging", bool42, bool42, C2305r2.f4555a);
        Boolean bool43 = Boolean.FALSE;
        f4468F0 = m7437a("measurement.gold.enhanced_ecommerce.format_logs", bool43, bool43, C2338u2.f4634a);
        Boolean bool44 = Boolean.FALSE;
        f4470G0 = m7437a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", bool44, bool44, C2360w2.f4676a);
        Boolean bool45 = Boolean.FALSE;
        f4472H0 = m7437a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", bool45, bool45, C2349v2.f4655a);
        Boolean bool46 = Boolean.FALSE;
        f4474I0 = m7437a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", bool46, bool46, C2382y2.f4726a);
        Boolean bool47 = Boolean.FALSE;
        f4476J0 = m7437a("measurement.gold.enhanced_ecommerce.updated_schema.client", bool47, bool47, C2371x2.f4704a);
        Boolean bool48 = Boolean.FALSE;
        f4478K0 = m7437a("measurement.gold.enhanced_ecommerce.updated_schema.service", bool48, bool48, C2109a3.f3905a);
        Boolean bool49 = Boolean.FALSE;
        m7437a("measurement.collection.synthetic_data_mitigation", bool49, bool49, C2393z2.f4745a);
        Boolean bool50 = Boolean.FALSE;
        f4480L0 = m7437a("measurement.service.configurable_service_limits", bool50, bool50, C2145d3.f4020a);
        Boolean bool51 = Boolean.FALSE;
        f4482M0 = m7437a("measurement.client.configurable_service_limits", bool51, bool51, C2121b3.f3964a);
        Boolean bool52 = Boolean.TRUE;
        f4484N0 = m7437a("measurement.androidId.delete_feature", bool52, bool52, C2169f3.f4109a);
        Boolean bool53 = Boolean.FALSE;
        f4486O0 = m7437a("measurement.client.global_params.dev", bool53, bool53, C2157e3.f4080a);
        Boolean bool54 = Boolean.FALSE;
        m7437a("measurement.service.global_params", bool54, bool54, C2181g3.f4128a);
        Boolean bool55 = Boolean.TRUE;
        f4488P0 = m7437a("measurement.client.string_reader", bool55, bool55, C2217j3.f4214a);
        Boolean bool56 = Boolean.TRUE;
        f4490Q0 = m7437a("measurement.sdk.attribution.cache", bool56, bool56, C2205i3.f4184a);
    }

    @VisibleForTesting
    /* renamed from: a */
    private static <V> C2284p3<V> m7437a(@Nullable String str, @Nullable V v, @Nullable V v2, @Nullable C2262n3<V> n3Var) {
        C2284p3 p3Var = new C2284p3(str, v, v2, n3Var);
        f4501a.add(p3Var);
        return p3Var;
    }

    /* renamed from: c */
    public static Map<String, String> m7441c(Context context) {
        C1808h1 b = C1808h1.m5183b(context.getContentResolver(), C2043w1.m6255a("com.google.android.gms.measurement"));
        return b == null ? Collections.emptyMap() : b.mo11696c();
    }
}
