package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.internal.measurement.C1700a1;
import com.google.android.gms.internal.measurement.C1715b1;
import com.google.android.gms.internal.measurement.C1775f0;
import com.google.android.gms.internal.measurement.C1790g0;
import com.google.android.gms.internal.measurement.C1805h0;
import com.google.android.gms.internal.measurement.C1821i0;
import com.google.android.gms.internal.measurement.C1836j0;
import com.google.android.gms.internal.measurement.C1889m4;
import com.google.android.gms.internal.measurement.C1963r0;
import com.google.android.gms.internal.measurement.C1979s0;
import com.google.android.gms.internal.measurement.C1994t0;
import com.google.android.gms.internal.measurement.C2024v0;
import com.google.android.gms.internal.measurement.C2041w0;
import com.google.android.gms.internal.measurement.C2047w5;
import com.google.android.gms.internal.measurement.C2056x0;
import com.google.android.gms.internal.measurement.C2065x8;
import com.google.android.gms.internal.measurement.C2076y3;
import com.google.android.gms.internal.measurement.C2088z0;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.p271io.IOUtils;

/* renamed from: com.google.android.gms.measurement.internal.p9 */
public final class C2290p9 extends C2211i9 {
    C2290p9(C2245l9 l9Var) {
        super(l9Var);
    }

    /* renamed from: C */
    private static String m7338C(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: D */
    static List<Long> m7339D(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: F */
    private static List<C2024v0> m7340F(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                C2024v0.C2025a d0 = C2024v0.m6072d0();
                for (String str : bundle.keySet()) {
                    C2024v0.C2025a d02 = C2024v0.m6072d0();
                    d02.mo12123z(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        d02.mo12120w(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        d02.mo12114B((String) obj);
                    } else if (obj instanceof Double) {
                        d02.mo12119v(((Double) obj).doubleValue());
                    }
                    d0.mo12121x(d02);
                }
                if (d0.mo12116E() > 0) {
                    arrayList.add((C2024v0) ((C1889m4) d0.mo11851I()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: K */
    private static void m7341K(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: L */
    private final void m7342L(StringBuilder sb, int i, C1790g0 g0Var) {
        if (g0Var != null) {
            m7341K(sb, i);
            sb.append("filter {\n");
            if (g0Var.mo11674F()) {
                m7345O(sb, i, "complement", Boolean.valueOf(g0Var.mo11675G()));
            }
            if (g0Var.mo11676H()) {
                m7345O(sb, i, "param_name", mo13109j().mo12996y(g0Var.mo11677J()));
            }
            if (g0Var.mo11670A()) {
                int i2 = i + 1;
                C1836j0 B = g0Var.mo11671B();
                if (B != null) {
                    m7341K(sb, i2);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (B.mo11756y()) {
                        m7345O(sb, i2, "match_type", B.mo11757z().name());
                    }
                    if (B.mo11750A()) {
                        m7345O(sb, i2, "expression", B.mo11751B());
                    }
                    if (B.mo11752D()) {
                        m7345O(sb, i2, "case_sensitive", Boolean.valueOf(B.mo11753E()));
                    }
                    if (B.mo11755G() > 0) {
                        m7341K(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : B.mo11754F()) {
                            m7341K(sb, i2 + 2);
                            sb.append(append);
                            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                        }
                        sb.append("}\n");
                    }
                    m7341K(sb, i2);
                    sb.append("}\n");
                }
            }
            if (g0Var.mo11672D()) {
                m7343M(sb, i + 1, "number_filter", g0Var.mo11673E());
            }
            m7341K(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: M */
    private final void m7343M(StringBuilder sb, int i, String str, C1805h0 h0Var) {
        if (h0Var != null) {
            m7341K(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (h0Var.mo11692y()) {
                m7345O(sb, i, "comparison_type", h0Var.mo11693z().name());
            }
            if (h0Var.mo11684A()) {
                m7345O(sb, i, "match_as_float", Boolean.valueOf(h0Var.mo11685B()));
            }
            if (h0Var.mo11686D()) {
                m7345O(sb, i, "comparison_value", h0Var.mo11687E());
            }
            if (h0Var.mo11688F()) {
                m7345O(sb, i, "min_comparison_value", h0Var.mo11689G());
            }
            if (h0Var.mo11690H()) {
                m7345O(sb, i, "max_comparison_value", h0Var.mo11691J());
            }
            m7341K(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: N */
    private static void m7344N(StringBuilder sb, int i, String str, C2088z0 z0Var, String str2) {
        if (z0Var != null) {
            m7341K(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (z0Var.mo12337Q() != 0) {
                m7341K(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long next : z0Var.mo12336N()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (z0Var.mo12334F() != 0) {
                m7341K(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long next2 : z0Var.mo12343z()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (z0Var.mo12339X() != 0) {
                m7341K(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C1979s0 next3 : z0Var.mo12338V()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next3.mo12046D() ? Integer.valueOf(next3.mo12047E()) : null);
                    sb.append(Constants.COLON_SEPARATOR);
                    sb.append(next3.mo12048F() ? Long.valueOf(next3.mo12049G()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (z0Var.mo12341Z() != 0) {
                m7341K(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C1700a1 next4 : z0Var.mo12340Y()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next4.mo11413D() ? Integer.valueOf(next4.mo11414E()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : next4.mo11415G()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m7341K(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: O */
    private static void m7345O(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m7341K(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: P */
    private final void m7346P(StringBuilder sb, int i, List<C2024v0> list) {
        if (list != null) {
            int i2 = i + 1;
            for (C2024v0 next : list) {
                if (next != null) {
                    m7341K(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (!C2065x8.m6570a() || !mo13112m().mo12474s(C2302r.f4468F0)) {
                        m7345O(sb, i2, "name", mo13109j().mo12996y(next.mo12104L()));
                        m7345O(sb, i2, "string_value", next.mo12106T());
                        m7345O(sb, i2, "int_value", next.mo12107W() ? Long.valueOf(next.mo12108X()) : null);
                        if (next.mo12109Y()) {
                            d = Double.valueOf(next.mo12110Z());
                        }
                        m7345O(sb, i2, "double_value", d);
                    } else {
                        m7345O(sb, i2, "name", next.mo12103K() ? mo13109j().mo12996y(next.mo12104L()) : null);
                        m7345O(sb, i2, "string_value", next.mo12105R() ? next.mo12106T() : null);
                        m7345O(sb, i2, "int_value", next.mo12107W() ? Long.valueOf(next.mo12108X()) : null);
                        if (next.mo12109Y()) {
                            d = Double.valueOf(next.mo12110Z());
                        }
                        m7345O(sb, i2, "double_value", d);
                        if (next.mo12112c0() > 0) {
                            m7346P(sb, i2, next.mo12111b0());
                        }
                    }
                    m7341K(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    @WorkerThread
    /* renamed from: R */
    static boolean m7347R(zzaq zzaq, zzm zzm) {
        C1609u.m4475k(zzaq);
        C1609u.m4475k(zzm);
        return !TextUtils.isEmpty(zzm.f4778b) || !TextUtils.isEmpty(zzm.f4794r);
    }

    /* renamed from: S */
    static boolean m7348S(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: T */
    static boolean m7349T(List<Long> list, int i) {
        if (i >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
    }

    /* renamed from: u */
    static int m7350u(C2056x0.C2057a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.mo12311s0(); i++) {
            if (str.equals(aVar.mo12306p0(i).mo11437P())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: x */
    static C2024v0 m7351x(C1994t0 t0Var, String str) {
        for (C2024v0 next : t0Var.mo12073z()) {
            if (next.mo12104L().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: y */
    static <Builder extends C2047w5> Builder m7352y(Builder builder, byte[] bArr) {
        C2076y3 c = C2076y3.m6601c();
        if (c != null) {
            builder.mo12179S(bArr, c);
            return builder;
        }
        builder.mo12180a0(bArr);
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final String mo12883A(C1821i0 i0Var) {
        if (i0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (i0Var.mo11725A()) {
            m7345O(sb, 0, "filter_id", Integer.valueOf(i0Var.mo11726B()));
        }
        m7345O(sb, 0, "property_name", mo13109j().mo12997z(i0Var.mo11727D()));
        String C = m7338C(i0Var.mo11729F(), i0Var.mo11730G(), i0Var.mo11732J());
        if (!C.isEmpty()) {
            m7345O(sb, 0, "filter_type", C);
        }
        m7342L(sb, 1, i0Var.mo11728E());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final String mo12884B(C2041w0 w0Var) {
        if (w0Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C2056x0 next : w0Var.mo12164z()) {
            if (next != null) {
                m7341K(sb, 1);
                sb.append("bundle {\n");
                if (next.mo12215V()) {
                    m7345O(sb, 1, "protocol_version", Integer.valueOf(next.mo12251x0()));
                }
                m7345O(sb, 1, "platform", next.mo12198B2());
                if (next.mo12210K2()) {
                    m7345O(sb, 1, "gmp_version", Long.valueOf(next.mo12217W()));
                }
                if (next.mo12218X()) {
                    m7345O(sb, 1, "uploading_gmp_version", Long.valueOf(next.mo12219Y()));
                }
                if (next.mo12209K0()) {
                    m7345O(sb, 1, "dynamite_version", Long.valueOf(next.mo12211L0()));
                }
                if (next.mo12243r0()) {
                    m7345O(sb, 1, "config_version", Long.valueOf(next.mo12245s0()));
                }
                m7345O(sb, 1, "gmp_app_id", next.mo12232j0());
                m7345O(sb, 1, "admob_app_id", next.mo12207J0());
                m7345O(sb, 1, Constants.APP_ID, next.mo12206I2());
                m7345O(sb, 1, Constants.EXTRA_KEY_APP_VERSION, next.mo12208J2());
                if (next.mo12239o0()) {
                    m7345O(sb, 1, "app_version_major", Integer.valueOf(next.mo12240p0()));
                }
                m7345O(sb, 1, "firebase_instance_id", next.mo12238n0());
                if (next.mo12226e0()) {
                    m7345O(sb, 1, "dev_cert_hash", Long.valueOf(next.mo12227f0()));
                }
                m7345O(sb, 1, "app_store", next.mo12204H2());
                if (next.mo12213M1()) {
                    m7345O(sb, 1, "upload_timestamp_millis", Long.valueOf(next.mo12214N1()));
                }
                if (next.mo12220Y1()) {
                    m7345O(sb, 1, "start_timestamp_millis", Long.valueOf(next.mo12222Z1()));
                }
                if (next.mo12233j2()) {
                    m7345O(sb, 1, "end_timestamp_millis", Long.valueOf(next.mo12235k2()));
                }
                if (next.mo12244r2()) {
                    m7345O(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.mo12246s2()));
                }
                if (next.mo12252x2()) {
                    m7345O(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.mo12256y2()));
                }
                m7345O(sb, 1, "app_instance_id", next.mo12225d0());
                m7345O(sb, 1, "resettable_device_id", next.mo12221Z());
                m7345O(sb, 1, "device_id", next.mo12241q0());
                m7345O(sb, 1, "ds_id", next.mo12249v0());
                if (next.mo12223b0()) {
                    m7345O(sb, 1, "limited_ad_tracking", Boolean.valueOf(next.mo12224c0()));
                }
                m7345O(sb, 1, "os_version", next.mo12199C2());
                m7345O(sb, 1, SmartConfigDataProvider.KEY_DEVICE_MODEL, next.mo12200D2());
                m7345O(sb, 1, "user_default_language", next.mo12201E2());
                if (next.mo12202F2()) {
                    m7345O(sb, 1, "time_zone_offset_minutes", Integer.valueOf(next.mo12203G2()));
                }
                if (next.mo12228g0()) {
                    m7345O(sb, 1, "bundle_sequential_index", Integer.valueOf(next.mo12230h0()));
                }
                if (next.mo12234k0()) {
                    m7345O(sb, 1, "service_upload", Boolean.valueOf(next.mo12236l0()));
                }
                m7345O(sb, 1, "health_monitor", next.mo12231i0());
                if (!mo13112m().mo12474s(C2302r.f4484N0) && next.mo12247t0() && next.mo12248u0() != 0) {
                    m7345O(sb, 1, "android_id", Long.valueOf(next.mo12248u0()));
                }
                if (next.mo12250w0()) {
                    m7345O(sb, 1, "retry_counter", Integer.valueOf(next.mo12205I0()));
                }
                List<C1715b1> q1 = next.mo12242q1();
                if (q1 != null) {
                    for (C1715b1 next2 : q1) {
                        if (next2 != null) {
                            m7341K(sb, 2);
                            sb.append("user_property {\n");
                            Double d = null;
                            m7345O(sb, 2, "set_timestamp_millis", next2.mo11435G() ? Long.valueOf(next2.mo11436H()) : null);
                            m7345O(sb, 2, "name", mo13109j().mo12997z(next2.mo11437P()));
                            m7345O(sb, 2, "string_value", next2.mo11439T());
                            m7345O(sb, 2, "int_value", next2.mo11440U() ? Long.valueOf(next2.mo11441V()) : null);
                            if (next2.mo11442W()) {
                                d = Double.valueOf(next2.mo11443X());
                            }
                            m7345O(sb, 2, "double_value", d);
                            m7341K(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C1963r0> m0 = next.mo12237m0();
                String I2 = next.mo12206I2();
                if (m0 != null) {
                    for (C1963r0 next3 : m0) {
                        if (next3 != null) {
                            m7341K(sb, 2);
                            sb.append("audience_membership {\n");
                            if (next3.mo11966F()) {
                                m7345O(sb, 2, "audience_id", Integer.valueOf(next3.mo11967G()));
                            }
                            if (next3.mo11971O()) {
                                m7345O(sb, 2, "new_audience", Boolean.valueOf(next3.mo11972P()));
                            }
                            m7344N(sb, 2, "current_data", next3.mo11968K(), I2);
                            if (next3.mo11969L()) {
                                m7344N(sb, 2, "previous_data", next3.mo11970N(), I2);
                            }
                            m7341K(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C1994t0> V0 = next.mo12216V0();
                if (V0 != null) {
                    for (C1994t0 next4 : V0) {
                        if (next4 != null) {
                            m7341K(sb, 2);
                            sb.append("event {\n");
                            m7345O(sb, 2, "name", mo13109j().mo12995v(next4.mo12065U()));
                            if (next4.mo12066V()) {
                                m7345O(sb, 2, "timestamp_millis", Long.valueOf(next4.mo12067W()));
                            }
                            if (next4.mo12068X()) {
                                m7345O(sb, 2, "previous_timestamp_millis", Long.valueOf(next4.mo12069Y()));
                            }
                            if (next4.mo12070Z()) {
                                m7345O(sb, 2, "count", Integer.valueOf(next4.mo12071b0()));
                            }
                            if (next4.mo12064P() != 0) {
                                m7346P(sb, 2, next4.mo12073z());
                            }
                            m7341K(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m7341K(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final List<Long> mo12885E(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                mo12427b().mo13099J().mo13131b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    mo12427b().mo13099J().mo13132c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (next.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo12886G(C1994t0.C1995a aVar, String str, Object obj) {
        List<C2024v0> D = aVar.mo12076D();
        int i = 0;
        while (true) {
            if (i >= D.size()) {
                i = -1;
                break;
            } else if (str.equals(D.get(i).mo12104L())) {
                break;
            } else {
                i++;
            }
        }
        C2024v0.C2025a d0 = C2024v0.m6072d0();
        d0.mo12123z(str);
        if (obj instanceof Long) {
            d0.mo12120w(((Long) obj).longValue());
        } else if (obj instanceof String) {
            d0.mo12114B((String) obj);
        } else if (obj instanceof Double) {
            d0.mo12119v(((Double) obj).doubleValue());
        } else if (C2065x8.m6570a() && mo13112m().mo12474s(C2302r.f4472H0) && (obj instanceof Bundle[])) {
            d0.mo12122y(m7340F((Bundle[]) obj));
        }
        if (i >= 0) {
            aVar.mo12084u(i, d0);
        } else {
            aVar.mo12087x(d0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo12887H(C2024v0.C2025a aVar, Object obj) {
        C1609u.m4475k(obj);
        aVar.mo12118u();
        aVar.mo12113A();
        aVar.mo12115D();
        aVar.mo12117F();
        if (obj instanceof String) {
            aVar.mo12114B((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo12120w(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo12119v(((Double) obj).doubleValue());
        } else if (!C2065x8.m6570a() || !mo13112m().mo12474s(C2302r.f4472H0) || !(obj instanceof Bundle[])) {
            mo12427b().mo13096F().mo13131b("Ignoring invalid (type) event param value", obj);
        } else {
            aVar.mo12122y(m7340F((Bundle[]) obj));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo12888J(C1715b1.C1716a aVar, Object obj) {
        C1609u.m4475k(obj);
        aVar.mo11446u();
        aVar.mo11450y();
        aVar.mo11445B();
        if (obj instanceof String) {
            aVar.mo11444A((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo11451z(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo11447v(((Double) obj).doubleValue());
        } else {
            mo12427b().mo13096F().mo13131b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean mo12889Q(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo12429f().mo11378a() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final Object mo12890U(C1994t0 t0Var, String str) {
        C2024v0 x = m7351x(t0Var, str);
        if (x == null) {
            return null;
        }
        if (x.mo12105R()) {
            return x.mo12106T();
        }
        if (x.mo12107W()) {
            return Long.valueOf(x.mo12108X());
        }
        if (x.mo12109Y()) {
            return Double.valueOf(x.mo12110Z());
        }
        if (!C2065x8.m6570a() || !mo13112m().mo12474s(C2302r.f4472H0) || x.mo12112c0() <= 0) {
            return null;
        }
        List<C2024v0> b0 = x.mo12111b0();
        ArrayList arrayList = new ArrayList();
        for (C2024v0 next : b0) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (C2024v0 next2 : next.mo12111b0()) {
                    if (next2.mo12105R()) {
                        bundle.putString(next2.mo12104L(), next2.mo12106T());
                    } else if (next2.mo12107W()) {
                        bundle.putLong(next2.mo12104L(), next2.mo12108X());
                    } else if (next2.mo12109Y()) {
                        bundle.putDouble(next2.mo12104L(), next2.mo12110Z());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final byte[] mo12891V(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo12427b().mo13096F().mo13131b("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final byte[] mo12892W(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo12427b().mo13096F().mo13131b("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: X */
    public final List<Integer> mo12893X() {
        Map<String, String> c = C2302r.m7441c(this.f4252b.mo12428c());
        if (c == null || c.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = C2302r.f4487P.mo12867a(null).intValue();
        Iterator<Map.Entry<String, String>> it = c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo12427b().mo13099J().mo13131b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo12427b().mo13099J().mo13131b("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo12453t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: v */
    public final long mo12894v(byte[] bArr) {
        C1609u.m4475k(bArr);
        mo13110k().mo12567h();
        MessageDigest H0 = C2323s9.m7557H0();
        if (H0 != null) {
            return C2323s9.m7582y(H0.digest(bArr));
        }
        mo12427b().mo13096F().mo13130a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo12427b().mo13096F().mo13130a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo12895w(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.w3 r5 = r4.mo12427b()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo13096F()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo13130a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2290p9.mo12895w(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final String mo12896z(C1775f0 f0Var) {
        if (f0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (f0Var.mo11619E()) {
            m7345O(sb, 0, "filter_id", Integer.valueOf(f0Var.mo11620F()));
        }
        m7345O(sb, 0, "event_name", mo13109j().mo12995v(f0Var.mo11621G()));
        String C = m7338C(f0Var.mo11626N(), f0Var.mo11627O(), f0Var.mo11629Q());
        if (!C.isEmpty()) {
            m7345O(sb, 0, "filter_type", C);
        }
        if (f0Var.mo11624K()) {
            m7343M(sb, 1, "event_count_filter", f0Var.mo11625L());
        }
        if (f0Var.mo11623J() > 0) {
            sb.append("  filters {\n");
            for (C1790g0 L : f0Var.mo11622H()) {
                m7342L(sb, 2, L);
            }
        }
        m7341K(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }
}
