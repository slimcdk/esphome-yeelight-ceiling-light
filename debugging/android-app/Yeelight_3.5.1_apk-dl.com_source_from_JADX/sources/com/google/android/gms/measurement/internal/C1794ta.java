package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.internal.measurement.C1011a5;
import com.google.android.gms.internal.measurement.C1027b5;
import com.google.android.gms.internal.measurement.C1058d4;
import com.google.android.gms.internal.measurement.C1073e3;
import com.google.android.gms.internal.measurement.C1090f4;
import com.google.android.gms.internal.measurement.C1099fd;
import com.google.android.gms.internal.measurement.C1105g3;
import com.google.android.gms.internal.measurement.C1106g4;
import com.google.android.gms.internal.measurement.C1122h4;
import com.google.android.gms.internal.measurement.C1170k4;
import com.google.android.gms.internal.measurement.C1175k9;
import com.google.android.gms.internal.measurement.C1185l3;
import com.google.android.gms.internal.measurement.C1186l4;
import com.google.android.gms.internal.measurement.C1266q4;
import com.google.android.gms.internal.measurement.C1282r4;
import com.google.android.gms.internal.measurement.C1298s4;
import com.google.android.gms.internal.measurement.C1338ud;
import com.google.android.gms.internal.measurement.C1372x2;
import com.google.android.gms.internal.measurement.C1374x4;
import com.google.android.gms.internal.measurement.C1377x7;
import com.google.android.gms.internal.measurement.C1402z2;
import com.google.android.gms.internal.measurement.C1404z4;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.p194io.IOUtils;

/* renamed from: com.google.android.gms.measurement.internal.ta */
public final class C1794ta extends C1606ea {
    C1794ta(C1770ra raVar) {
        super(raVar);
    }

    /* renamed from: C */
    static C1175k9 m4742C(C1175k9 k9Var, byte[] bArr) {
        C1377x7 b = C1377x7.m3247b();
        return b != null ? k9Var.mo12920z0(bArr, b) : k9Var.mo12918B(bArr);
    }

    /* renamed from: H */
    static List m4743H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
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

    /* renamed from: L */
    static boolean m4744L(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
    }

    /* renamed from: N */
    static boolean m4745N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: P */
    static final void m4746P(C1106g4 g4Var, String str, Object obj) {
        List U = g4Var.mo12819U();
        int i = 0;
        while (true) {
            if (i >= U.size()) {
                i = -1;
                break;
            } else if (str.equals(((C1186l4) U.get(i)).mo12953E())) {
                break;
            } else {
                i++;
            }
        }
        C1170k4 C = C1186l4.m2202C();
        C.mo12899L(str);
        if (obj instanceof Long) {
            C.mo12898K(((Long) obj).longValue());
        }
        if (i >= 0) {
            g4Var.mo12813L(i, C);
        } else {
            g4Var.mo12825y(C);
        }
    }

    @WorkerThread
    /* renamed from: m */
    static final boolean m4747m(zzaw zzaw, zzq zzq) {
        C0917i.m1419j(zzaw);
        C0917i.m1419j(zzq);
        return !TextUtils.isEmpty(zzq.f2867b) || !TextUtils.isEmpty(zzq.f2882q);
    }

    /* renamed from: n */
    static final C1186l4 m4748n(C1122h4 h4Var, String str) {
        for (C1186l4 l4Var : h4Var.mo12855G()) {
            if (l4Var.mo12953E().equals(str)) {
                return l4Var;
            }
        }
        return null;
    }

    /* renamed from: o */
    static final Object m4749o(C1122h4 h4Var, String str) {
        C1186l4 n = m4748n(h4Var, str);
        if (n == null) {
            return null;
        }
        if (n.mo12960V()) {
            return n.mo12954F();
        }
        if (n.mo12958T()) {
            return Long.valueOf(n.mo12952A());
        }
        if (n.mo12956R()) {
            return Double.valueOf(n.mo12961x());
        }
        if (n.mo12963z() <= 0) {
            return null;
        }
        List<C1186l4> G = n.mo12955G();
        ArrayList arrayList = new ArrayList();
        for (C1186l4 l4Var : G) {
            if (l4Var != null) {
                Bundle bundle = new Bundle();
                for (C1186l4 l4Var2 : l4Var.mo12955G()) {
                    if (l4Var2.mo12960V()) {
                        bundle.putString(l4Var2.mo12953E(), l4Var2.mo12954F());
                    } else if (l4Var2.mo12958T()) {
                        bundle.putLong(l4Var2.mo12953E(), l4Var2.mo12952A());
                    } else if (l4Var2.mo12956R()) {
                        bundle.putDouble(l4Var2.mo12953E(), l4Var2.mo12961x());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: p */
    private final void m4750p(StringBuilder sb, int i, List list) {
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1186l4 l4Var = (C1186l4) it.next();
                if (l4Var != null) {
                    m4752r(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    m4755u(sb, i2, "name", l4Var.mo12959U() ? this.f2143a.mo14373D().mo14618e(l4Var.mo12953E()) : null);
                    m4755u(sb, i2, "string_value", l4Var.mo12960V() ? l4Var.mo12954F() : null);
                    m4755u(sb, i2, "int_value", l4Var.mo12958T() ? Long.valueOf(l4Var.mo12952A()) : null);
                    if (l4Var.mo12956R()) {
                        d = Double.valueOf(l4Var.mo12961x());
                    }
                    m4755u(sb, i2, "double_value", d);
                    if (l4Var.mo12963z() > 0) {
                        m4750p(sb, i2, l4Var.mo12955G());
                    }
                    m4752r(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: q */
    private final void m4751q(StringBuilder sb, int i, C1402z2 z2Var) {
        String str;
        if (z2Var != null) {
            m4752r(sb, i);
            sb.append("filter {\n");
            if (z2Var.mo13516F()) {
                m4755u(sb, i, "complement", Boolean.valueOf(z2Var.mo13515E()));
            }
            if (z2Var.mo13518H()) {
                m4755u(sb, i, "param_name", this.f2143a.mo14373D().mo14618e(z2Var.mo13514C()));
            }
            if (z2Var.mo13519I()) {
                int i2 = i + 1;
                C1185l3 A = z2Var.mo13513A();
                if (A != null) {
                    m4752r(sb, i2);
                    sb.append("string_filter {\n");
                    if (A.mo12949G()) {
                        switch (A.mo12950H()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        m4755u(sb, i2, "match_type", str);
                    }
                    if (A.mo12948F()) {
                        m4755u(sb, i2, "expression", A.mo12944A());
                    }
                    if (A.mo12947E()) {
                        m4755u(sb, i2, "case_sensitive", Boolean.valueOf(A.mo12946D()));
                    }
                    if (A.mo12951x() > 0) {
                        m4752r(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : A.mo12945C()) {
                            m4752r(sb, i2 + 2);
                            sb.append(append);
                            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                        }
                        sb.append("}\n");
                    }
                    m4752r(sb, i2);
                    sb.append("}\n");
                }
            }
            if (z2Var.mo13517G()) {
                m4756v(sb, i + 1, "number_filter", z2Var.mo13520z());
            }
            m4752r(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: r */
    private static final void m4752r(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: s */
    private static final String m4753s(boolean z, boolean z2, boolean z3) {
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

    /* renamed from: t */
    private static final void m4754t(StringBuilder sb, int i, String str, C1374x4 x4Var) {
        if (x4Var != null) {
            m4752r(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (x4Var.mo13492y() != 0) {
                m4752r(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : x4Var.mo13488I()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (x4Var.mo13484A() != 0) {
                m4752r(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : x4Var.mo13490K()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (x4Var.mo13491x() != 0) {
                m4752r(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C1090f4 f4Var : x4Var.mo13487H()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(f4Var.mo12784F() ? Integer.valueOf(f4Var.mo12785x()) : null);
                    sb.append(Constants.COLON_SEPARATOR);
                    sb.append(f4Var.mo12783E() ? Long.valueOf(f4Var.mo12786y()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (x4Var.mo13493z() != 0) {
                m4752r(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C1404z4 z4Var : x4Var.mo13489J()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(z4Var.mo13522G() ? Integer.valueOf(z4Var.mo13524y()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : z4Var.mo13521D()) {
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
            m4752r(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: u */
    private static final void m4755u(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m4752r(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: v */
    private static final void m4756v(StringBuilder sb, int i, String str, C1073e3 e3Var) {
        if (e3Var != null) {
            m4752r(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (e3Var.mo12733E()) {
                int J = e3Var.mo12738J();
                m4755u(sb, i, "comparison_type", J != 1 ? J != 2 ? J != 3 ? J != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (e3Var.mo12735G()) {
                m4755u(sb, i, "match_as_float", Boolean.valueOf(e3Var.mo12732D()));
            }
            if (e3Var.mo12734F()) {
                m4755u(sb, i, "comparison_value", e3Var.mo12739z());
            }
            if (e3Var.mo12737I()) {
                m4755u(sb, i, "min_comparison_value", e3Var.mo12731C());
            }
            if (e3Var.mo12736H()) {
                m4755u(sb, i, "max_comparison_value", e3Var.mo12730A());
            }
            m4752r(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: w */
    static int m4757w(C1282r4 r4Var, String str) {
        if (r4Var != null) {
            for (int i = 0; i < r4Var.mo13173e1(); i++) {
                if (str.equals(r4Var.mo13163X0(i).mo12570D())) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzaw mo14577A(com.google.android.gms.internal.measurement.C1021b r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.mo12555e()
            r1 = 1
            android.os.Bundle r0 = r8.mo14589y(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r9.mo12554d()
            java.lang.String r1 = com.google.android.gms.measurement.internal.C1693l6.m4467b(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r9.mo12554d()
        L_0x002d:
            r3 = r1
            com.google.android.gms.measurement.internal.zzaw r1 = new com.google.android.gms.measurement.internal.zzaw
            com.google.android.gms.measurement.internal.zzau r4 = new com.google.android.gms.measurement.internal.zzau
            r4.<init>(r0)
            long r6 = r9.mo12550a()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1794ta.mo14577A(com.google.android.gms.internal.measurement.b):com.google.android.gms.measurement.internal.zzaw");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final C1122h4 mo14578B(C1747q qVar) {
        C1106g4 C = C1122h4.m2041C();
        C.mo12815O(qVar.f2524e);
        C1771s sVar = new C1771s(qVar.f2525f);
        while (sVar.hasNext()) {
            String a = sVar.next();
            C1170k4 C2 = C1186l4.m2202C();
            C2.mo12899L(a);
            Object g0 = qVar.f2525f.mo14707g0(a);
            C0917i.m1419j(g0);
            mo14584J(C2, g0);
            C.mo12825y(C2);
        }
        return (C1122h4) C.mo12838q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final String mo14579D(C1266q4 q4Var) {
        if (q4Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C1298s4 s4Var : q4Var.mo13084A()) {
            if (s4Var != null) {
                m4752r(sb, 1);
                sb.append("bundle {\n");
                if (s4Var.mo13327q1()) {
                    m4755u(sb, 1, "protocol_version", Integer.valueOf(s4Var.mo13341z1()));
                }
                C1338ud.m3082b();
                if (this.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2401F0) && s4Var.mo13330t1()) {
                    m4755u(sb, 1, "session_stitching_token", s4Var.mo13298J());
                }
                m4755u(sb, 1, "platform", s4Var.mo13294H());
                if (s4Var.mo13323m1()) {
                    m4755u(sb, 1, "gmp_version", Long.valueOf(s4Var.mo13297I1()));
                }
                if (s4Var.mo13336x1()) {
                    m4755u(sb, 1, "uploading_gmp_version", Long.valueOf(s4Var.mo13307N1()));
                }
                if (s4Var.mo13321k1()) {
                    m4755u(sb, 1, "dynamite_version", Long.valueOf(s4Var.mo13293G1()));
                }
                if (s4Var.mo13318h1()) {
                    m4755u(sb, 1, "config_version", Long.valueOf(s4Var.mo13289E1()));
                }
                m4755u(sb, 1, "gmp_app_id", s4Var.mo13288E());
                m4755u(sb, 1, "admob_app_id", s4Var.mo13310S1());
                m4755u(sb, 1, Constants.APP_ID, s4Var.mo13311T1());
                m4755u(sb, 1, Constants.EXTRA_KEY_APP_VERSION, s4Var.mo13337y());
                if (s4Var.mo13316f1()) {
                    m4755u(sb, 1, "app_version_major", Integer.valueOf(s4Var.mo13313Y()));
                }
                m4755u(sb, 1, "firebase_instance_id", s4Var.mo13286D());
                if (s4Var.mo13320j1()) {
                    m4755u(sb, 1, "dev_cert_hash", Long.valueOf(s4Var.mo13291F1()));
                }
                m4755u(sb, 1, "app_store", s4Var.mo13334x());
                if (s4Var.mo13333w1()) {
                    m4755u(sb, 1, "upload_timestamp_millis", Long.valueOf(s4Var.mo13305M1()));
                }
                if (s4Var.mo13331u1()) {
                    m4755u(sb, 1, "start_timestamp_millis", Long.valueOf(s4Var.mo13303L1()));
                }
                if (s4Var.mo13322l1()) {
                    m4755u(sb, 1, "end_timestamp_millis", Long.valueOf(s4Var.mo13295H1()));
                }
                if (s4Var.mo13326p1()) {
                    m4755u(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(s4Var.mo13301K1()));
                }
                if (s4Var.mo13325o1()) {
                    m4755u(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(s4Var.mo13299J1()));
                }
                m4755u(sb, 1, "app_instance_id", s4Var.mo13312U1());
                m4755u(sb, 1, "resettable_device_id", s4Var.mo13296I());
                m4755u(sb, 1, "ds_id", s4Var.mo13284C());
                if (s4Var.mo13324n1()) {
                    m4755u(sb, 1, "limited_ad_tracking", Boolean.valueOf(s4Var.mo13335x0()));
                }
                m4755u(sb, 1, "os_version", s4Var.mo13292G());
                m4755u(sb, 1, SmartConfigDataProvider.KEY_DEVICE_MODEL, s4Var.mo13281A());
                m4755u(sb, 1, "user_default_language", s4Var.mo13300K());
                if (s4Var.mo13332v1()) {
                    m4755u(sb, 1, "time_zone_offset_minutes", Integer.valueOf(s4Var.mo13283B1()));
                }
                if (s4Var.mo13317g1()) {
                    m4755u(sb, 1, "bundle_sequential_index", Integer.valueOf(s4Var.mo13314b1()));
                }
                if (s4Var.mo13329s1()) {
                    m4755u(sb, 1, "service_upload", Boolean.valueOf(s4Var.mo13338y0()));
                }
                m4755u(sb, 1, "health_monitor", s4Var.mo13290F());
                if (!this.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2444h0) && s4Var.mo13315e1() && s4Var.mo13287D1() != 0) {
                    m4755u(sb, 1, "android_id", Long.valueOf(s4Var.mo13287D1()));
                }
                if (s4Var.mo13328r1()) {
                    m4755u(sb, 1, "retry_counter", Integer.valueOf(s4Var.mo13282A1()));
                }
                if (s4Var.mo13319i1()) {
                    m4755u(sb, 1, "consent_signals", s4Var.mo13340z());
                }
                List<C1027b5> N = s4Var.mo13306N();
                if (N != null) {
                    for (C1027b5 b5Var : N) {
                        if (b5Var != null) {
                            m4752r(sb, 2);
                            sb.append("user_property {\n");
                            m4755u(sb, 2, "set_timestamp_millis", b5Var.mo12574P() ? Long.valueOf(b5Var.mo12578z()) : null);
                            m4755u(sb, 2, "name", this.f2143a.mo14373D().mo14619f(b5Var.mo12570D()));
                            m4755u(sb, 2, "string_value", b5Var.mo12571E());
                            m4755u(sb, 2, "int_value", b5Var.mo12573O() ? Long.valueOf(b5Var.mo12577y()) : null);
                            m4755u(sb, 2, "double_value", b5Var.mo12572N() ? Double.valueOf(b5Var.mo12576x()) : null);
                            m4752r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C1058d4> L = s4Var.mo13302L();
                if (L != null) {
                    for (C1058d4 d4Var : L) {
                        if (d4Var != null) {
                            m4752r(sb, 2);
                            sb.append("audience_membership {\n");
                            if (d4Var.mo12645I()) {
                                m4755u(sb, 2, "audience_id", Integer.valueOf(d4Var.mo12648x()));
                            }
                            if (d4Var.mo12646J()) {
                                m4755u(sb, 2, "new_audience", Boolean.valueOf(d4Var.mo12644H()));
                            }
                            m4754t(sb, 2, "current_data", d4Var.mo12642A());
                            if (d4Var.mo12647K()) {
                                m4754t(sb, 2, "previous_data", d4Var.mo12643C());
                            }
                            m4752r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C1122h4> M = s4Var.mo13304M();
                if (M != null) {
                    for (C1122h4 h4Var : M) {
                        if (h4Var != null) {
                            m4752r(sb, 2);
                            sb.append("event {\n");
                            m4755u(sb, 2, "name", this.f2143a.mo14373D().mo14617d(h4Var.mo12854F()));
                            if (h4Var.mo12858R()) {
                                m4755u(sb, 2, "timestamp_millis", Long.valueOf(h4Var.mo12852A()));
                            }
                            if (h4Var.mo12857Q()) {
                                m4755u(sb, 2, "previous_timestamp_millis", Long.valueOf(h4Var.mo12861z()));
                            }
                            if (h4Var.mo12856P()) {
                                m4755u(sb, 2, "count", Integer.valueOf(h4Var.mo12859x()));
                            }
                            if (h4Var.mo12860y() != 0) {
                                m4750p(sb, 2, h4Var.mo12855G());
                            }
                            m4752r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m4752r(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo14580E(C1372x2 x2Var) {
        if (x2Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (x2Var.mo13478M()) {
            m4755u(sb, 0, "filter_id", Integer.valueOf(x2Var.mo13481y()));
        }
        m4755u(sb, 0, "event_name", this.f2143a.mo14373D().mo14617d(x2Var.mo13472E()));
        String s = m4753s(x2Var.mo13474I(), x2Var.mo13475J(), x2Var.mo13476K());
        if (!s.isEmpty()) {
            m4755u(sb, 0, "filter_type", s);
        }
        if (x2Var.mo13477L()) {
            m4756v(sb, 1, "event_count_filter", x2Var.mo13471D());
        }
        if (x2Var.mo13480x() > 0) {
            sb.append("  filters {\n");
            for (C1402z2 q : x2Var.mo13473F()) {
                m4751q(sb, 2, q);
            }
        }
        m4752r(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final String mo14581F(C1105g3 g3Var) {
        if (g3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (g3Var.mo12805H()) {
            m4755u(sb, 0, "filter_id", Integer.valueOf(g3Var.mo12807x()));
        }
        m4755u(sb, 0, "property_name", this.f2143a.mo14373D().mo14619f(g3Var.mo12801C()));
        String s = m4753s(g3Var.mo12802E(), g3Var.mo12803F(), g3Var.mo12804G());
        if (!s.isEmpty()) {
            m4755u(sb, 0, "filter_type", s);
        }
        m4751q(sb, 1, g3Var.mo12808y());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final List mo14582G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f2143a.mo14228b().mo14040w().mo14694b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f2143a.mo14228b().mo14040w().mo14695c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
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
    /* renamed from: I */
    public final Map mo14583I(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            C1099fd.m1959b();
            if (!this.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2450k0) ? (obj instanceof Bundle[]) || (obj instanceof ArrayList) || (obj instanceof Bundle) : (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (obj instanceof Parcelable[]) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(mo14583I((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(mo14583I((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(mo14583I((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo14584J(C1170k4 k4Var, Object obj) {
        C0917i.m1419j(obj);
        k4Var.mo12896D();
        k4Var.mo12905y();
        k4Var.mo12904x();
        k4Var.mo12895C();
        if (obj instanceof String) {
            k4Var.mo12900M((String) obj);
        } else if (obj instanceof Long) {
            k4Var.mo12898K(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            k4Var.mo12897E(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C1170k4 C = C1186l4.m2202C();
                    for (String str : bundle.keySet()) {
                        C1170k4 C2 = C1186l4.m2202C();
                        C2.mo12899L(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            C2.mo12898K(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            C2.mo12900M((String) obj2);
                        } else if (obj2 instanceof Double) {
                            C2.mo12897E(((Double) obj2).doubleValue());
                        }
                        C.mo12903w(C2);
                    }
                    if (C.mo12901t() > 0) {
                        arrayList.add((C1186l4) C.mo12838q());
                    }
                }
            }
            k4Var.mo12902u(arrayList);
        } else {
            this.f2143a.mo14228b().mo14035r().mo14694b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo14585K(C1011a5 a5Var, Object obj) {
        C0917i.m1419j(obj);
        a5Var.mo12522w();
        a5Var.mo12521u();
        a5Var.mo12520t();
        if (obj instanceof String) {
            a5Var.mo12519E((String) obj);
        } else if (obj instanceof Long) {
            a5Var.mo12524y(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            a5Var.mo12523x(((Double) obj).doubleValue());
        } else {
            this.f2143a.mo14228b().mo14035r().mo14694b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo14586M(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.f2143a.mo14229c().mo11029a() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final byte[] mo14587O(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f2143a.mo14228b().mo14035r().mo14694b("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo14018l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: x */
    public final long mo14588x(byte[] bArr) {
        C0917i.m1419j(bArr);
        this.f2143a.mo14382N().mo14009h();
        MessageDigest t = C1854ya.m4843t();
        if (t != null) {
            return C1854ya.m4842q0(t.digest(bArr));
        }
        this.f2143a.mo14228b().mo14035r().mo14693a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final Bundle mo14589y(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                C1099fd.m1959b();
                ArrayList arrayList = (ArrayList) obj;
                if (this.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2450k0)) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(mo14589y((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList3.add(mo14589y((Map) arrayList.get(i2), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList3);
                }
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f2143a.mo14228b().mo14035r().mo14693a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable mo14590z(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.n5 r5 = r4.f2143a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo14228b()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo14693a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1794ta.mo14590z(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}
