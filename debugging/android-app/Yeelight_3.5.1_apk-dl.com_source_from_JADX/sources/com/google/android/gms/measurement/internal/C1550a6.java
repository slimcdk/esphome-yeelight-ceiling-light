package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.internal.measurement.C1011a5;
import com.google.android.gms.internal.measurement.C1027b5;
import com.google.android.gms.internal.measurement.C1106g4;
import com.google.android.gms.internal.measurement.C1122h4;
import com.google.android.gms.internal.measurement.C1138i4;
import com.google.android.gms.internal.measurement.C1154j4;
import com.google.android.gms.internal.measurement.C1170k4;
import com.google.android.gms.internal.measurement.C1186l4;
import com.google.android.gms.internal.measurement.C1234o4;
import com.google.android.gms.internal.measurement.C1266q4;
import com.google.android.gms.internal.measurement.C1282r4;
import com.google.android.gms.internal.measurement.C1298s4;
import com.google.android.gms.internal.measurement.C1314t4;
import com.google.android.gms.internal.measurement.C1338ud;
import com.google.android.gms.internal.measurement.C1344v4;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.a6 */
final class C1550a6 implements Callable {

    /* renamed from: a */
    final /* synthetic */ zzaw f1918a;

    /* renamed from: b */
    final /* synthetic */ String f1919b;

    /* renamed from: c */
    final /* synthetic */ C1628g6 f1920c;

    C1550a6(C1628g6 g6Var, zzaw zzaw, String str) {
        this.f1920c = g6Var;
        this.f1918a = zzaw;
        this.f1919b = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        byte[] bArr;
        C1818va vaVar;
        C1234o4 o4Var;
        C1282r4 r4Var;
        Bundle bundle;
        String str;
        C1589d6 d6Var;
        long j;
        String str2;
        C1759r rVar;
        this.f1920c.f2110a.mo14474e();
        C1851y7 c0 = this.f1920c.f2110a.mo14472c0();
        zzaw zzaw = this.f1918a;
        String str3 = this.f1919b;
        c0.mo14009h();
        C1717n5.m4487t();
        C0917i.m1419j(zzaw);
        C0917i.m1415f(str3);
        if (!c0.f2143a.mo14402z().mo14163B(str3, C1727o3.f2423U)) {
            c0.f2143a.mo14228b().mo14034q().mo14694b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        } else if ("_iap".equals(zzaw.f2855a) || "_iapx".equals(zzaw.f2855a)) {
            C1234o4 x = C1266q4.m2503x();
            c0.f2045b.mo14466V().mo14334e0();
            try {
                C1589d6 R = c0.f2045b.mo14466V().mo14322R(str3);
                if (R == null) {
                    c0.f2143a.mo14228b().mo14034q().mo14694b("Log and bundle not available. package_name", str3);
                } else if (!R.mo14064K()) {
                    c0.f2143a.mo14228b().mo14034q().mo14694b("Log and bundle disabled. package_name", str3);
                } else {
                    C1282r4 P1 = C1298s4.m2790P1();
                    P1.mo13139C0(1);
                    P1.mo13189q0("android");
                    if (!TextUtils.isEmpty(R.mo14089e0())) {
                        P1.mo13204y(R.mo14089e0());
                    }
                    if (!TextUtils.isEmpty(R.mo14093g0())) {
                        P1.mo13141D((String) C0917i.m1419j(R.mo14093g0()));
                    }
                    if (!TextUtils.isEmpty(R.mo14095h0())) {
                        P1.mo13143E((String) C0917i.m1419j(R.mo14095h0()));
                    }
                    if (R.mo14066M() != -2147483648L) {
                        P1.mo13147K((int) R.mo14066M());
                    }
                    P1.mo13176i0(R.mo14077X());
                    P1.mo13162X(R.mo14075V());
                    String j0 = R.mo14099j0();
                    String c02 = R.mo14085c0();
                    if (!TextUtils.isEmpty(j0)) {
                        P1.mo13172e0(j0);
                    } else if (!TextUtils.isEmpty(c02)) {
                        P1.mo13200w(c02);
                    }
                    C1634h U = c0.f2045b.mo14465U(str3);
                    P1.mo13156R(R.mo14074U());
                    if (c0.f2143a.mo14395o() && c0.f2143a.mo14402z().mo14164C(P1.mo13165Y0()) && U.mo14221i(zzah.AD_STORAGE) && !TextUtils.isEmpty((CharSequence) null)) {
                        P1.mo13160U((String) null);
                    }
                    P1.mo13154Q(U.mo14219h());
                    if (U.mo14221i(zzah.AD_STORAGE)) {
                        Pair n = c0.f2045b.mo14473d0().mo14355n(R.mo14089e0(), U);
                        if (R.mo14063J() && !TextUtils.isEmpty((CharSequence) n.first)) {
                            P1.mo13144F0(C1851y7.m4826e((String) n.first, Long.toString(zzaw.f2858d)));
                            Object obj = n.second;
                            if (obj != null) {
                                P1.mo13181l0(((Boolean) obj).booleanValue());
                            }
                        }
                    }
                    c0.f2143a.mo14370A().mo14241k();
                    P1.mo13158S(Build.MODEL);
                    c0.f2143a.mo14370A().mo14241k();
                    P1.mo13183m0(Build.VERSION.RELEASE);
                    P1.mo13153P0((int) c0.f2143a.mo14370A().mo14415p());
                    P1.mo13161W0(c0.f2143a.mo14370A().mo14416q());
                    try {
                        if (U.mo14221i(zzah.ANALYTICS_STORAGE) && R.mo14091f0() != null) {
                            P1.mo13138C(C1851y7.m4826e((String) C0917i.m1419j(R.mo14091f0()), Long.toString(zzaw.f2858d)));
                        }
                        if (!TextUtils.isEmpty(R.mo14097i0())) {
                            P1.mo13169b0((String) C0917i.m1419j(R.mo14097i0()));
                        }
                        String e0 = R.mo14089e0();
                        List c03 = c0.f2045b.mo14466V().mo14332c0(e0);
                        Iterator it = c03.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                vaVar = null;
                                break;
                            }
                            vaVar = (C1818va) it.next();
                            if ("_lte".equals(vaVar.f2732c)) {
                                break;
                            }
                        }
                        if (vaVar == null || vaVar.f2734e == null) {
                            C1818va vaVar2 = new C1818va(e0, "auto", "_lte", c0.f2143a.mo14229c().mo11029a(), 0L);
                            c03.add(vaVar2);
                            c0.f2045b.mo14466V().mo14349x(vaVar2);
                        }
                        C1794ta f0 = c0.f2045b.mo14475f0();
                        f0.f2143a.mo14228b().mo14039v().mo14693a("Checking account type status for ad personalization signals");
                        if (f0.f2143a.mo14370A().mo14418s()) {
                            String e02 = R.mo14089e0();
                            C0917i.m1419j(e02);
                            if (R.mo14063J() && f0.f2045b.mo14470Z().mo14137B(e02)) {
                                f0.f2143a.mo14228b().mo14034q().mo14693a("Turning off ad personalization due to account type");
                                Iterator it2 = c03.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((C1818va) it2.next()).f2732c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                c03.add(new C1818va(e02, "auto", "_npa", f0.f2143a.mo14229c().mo11029a(), 1L));
                            }
                        }
                        C1027b5[] b5VarArr = new C1027b5[c03.size()];
                        for (int i = 0; i < c03.size(); i++) {
                            C1011a5 A = C1027b5.m1714A();
                            A.mo12517C(((C1818va) c03.get(i)).f2732c);
                            A.mo12518D(((C1818va) c03.get(i)).f2733d);
                            c0.f2045b.mo14475f0().mo14585K(A, ((C1818va) c03.get(i)).f2734e);
                            b5VarArr[i] = (C1027b5) A.mo12838q();
                        }
                        P1.mo13186n1(Arrays.asList(b5VarArr));
                        C1587d4 b = C1587d4.m4105b(zzaw);
                        c0.f2143a.mo14382N().mo14689z(b.f2003d, c0.f2045b.mo14466V().mo14321Q(str3));
                        c0.f2143a.mo14382N().mo14644A(b, c0.f2143a.mo14402z().mo14173n(str3));
                        Bundle bundle2 = b.f2003d;
                        bundle2.putLong("_c", 1);
                        c0.f2143a.mo14228b().mo14034q().mo14693a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1);
                        bundle2.putString("_o", zzaw.f2857c);
                        if (c0.f2143a.mo14382N().mo14663T(P1.mo13165Y0())) {
                            c0.f2143a.mo14382N().mo14646C(bundle2, "_dbg", 1L);
                            c0.f2143a.mo14382N().mo14646C(bundle2, "_r", 1L);
                        }
                        C1759r V = c0.f2045b.mo14466V().mo14326V(str3, zzaw.f2855a);
                        if (V == null) {
                            r4Var = P1;
                            d6Var = R;
                            o4Var = x;
                            str = str3;
                            bundle = bundle2;
                            str2 = null;
                            rVar = new C1759r(str3, zzaw.f2855a, 0, 0, 0, zzaw.f2858d, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                            j = 0;
                        } else {
                            d6Var = R;
                            o4Var = x;
                            str = str3;
                            bundle = bundle2;
                            r4Var = P1;
                            str2 = null;
                            long j2 = V.f2551f;
                            rVar = V.mo14444c(zzaw.f2858d);
                            j = j2;
                        }
                        c0.f2045b.mo14466V().mo14342q(rVar);
                        C1747q qVar = new C1747q(c0.f2143a, zzaw.f2857c, str, zzaw.f2855a, zzaw.f2858d, j, bundle);
                        C1106g4 C = C1122h4.m2041C();
                        C.mo12816Q(qVar.f2523d);
                        C.mo12812K(qVar.f2521b);
                        C.mo12815O(qVar.f2524e);
                        C1771s sVar = new C1771s(qVar.f2525f);
                        while (sVar.hasNext()) {
                            String a = sVar.next();
                            C1170k4 C2 = C1186l4.m2202C();
                            C2.mo12899L(a);
                            Object g0 = qVar.f2525f.mo14707g0(a);
                            if (g0 != null) {
                                c0.f2045b.mo14475f0().mo14584J(C2, g0);
                                C.mo12825y(C2);
                            }
                        }
                        C1282r4 r4Var2 = r4Var;
                        r4Var2.mo13187o1(C);
                        C1314t4 x2 = C1344v4.m3108x();
                        C1138i4 x3 = C1154j4.m2114x();
                        x3.mo12873t(rVar.f2548c);
                        x3.mo12874u(zzaw.f2855a);
                        x2.mo13382t(x3);
                        r4Var2.mo13192s0(x2);
                        r4Var2.mo13179j1(c0.f2045b.mo14463S().mo14019m(d6Var.mo14089e0(), Collections.emptyList(), r4Var2.mo13171d1(), Long.valueOf(C.mo12823w()), Long.valueOf(C.mo12823w())));
                        if (C.mo12820X()) {
                            r4Var2.mo13152O0(C.mo12823w());
                            r4Var2.mo13164Y(C.mo12823w());
                        }
                        long Y = d6Var.mo14078Y();
                        if (Y != 0) {
                            r4Var2.mo13195t0(Y);
                        }
                        long a0 = d6Var.mo14081a0();
                        if (a0 != 0) {
                            r4Var2.mo13136B0(a0);
                        } else if (Y != 0) {
                            r4Var2.mo13136B0(Y);
                        }
                        String b2 = d6Var.mo14082b();
                        C1338ud.m3082b();
                        if (c0.f2143a.mo14402z().mo14163B(str2, C1727o3.f2401F0) && b2 != null) {
                            r4Var2.mo13148K0(b2);
                        }
                        d6Var.mo14088e();
                        r4Var2.mo13149L((int) d6Var.mo14079Z());
                        c0.f2143a.mo14402z().mo14176q();
                        r4Var2.mo13157R0(64000);
                        r4Var2.mo13155Q0(c0.f2143a.mo14229c().mo11029a());
                        r4Var2.mo13146I0(true);
                        C1234o4 o4Var2 = o4Var;
                        o4Var2.mo13037t(r4Var2);
                        C1589d6 d6Var2 = d6Var;
                        d6Var2.mo14057D(r4Var2.mo13175h1());
                        d6Var2.mo14055B(r4Var2.mo13174f1());
                        c0.f2045b.mo14466V().mo14341p(d6Var2);
                        c0.f2045b.mo14466V().mo14340o();
                        c0.f2045b.mo14466V().mo14335f0();
                        try {
                            return c0.f2045b.mo14475f0().mo14587O(((C1266q4) o4Var2.mo12838q()).mo13507j());
                        } catch (IOException e) {
                            c0.f2143a.mo14228b().mo14035r().mo14695c("Data loss. Failed to bundle and serialize. appId", C1574c4.m4083z(str), e);
                            return str2;
                        }
                    } catch (SecurityException e2) {
                        c0.f2143a.mo14228b().mo14034q().mo14694b("app instance id encryption failed", e2.getMessage());
                        bArr = new byte[0];
                    }
                }
            } catch (SecurityException e3) {
                c0.f2143a.mo14228b().mo14034q().mo14694b("Resettable device id encryption failed", e3.getMessage());
            } catch (Throwable th) {
                c0.f2045b.mo14466V().mo14335f0();
                throw th;
            }
            bArr = new byte[0];
            c0.f2045b.mo14466V().mo14335f0();
            return bArr;
        } else {
            c0.f2143a.mo14228b().mo14034q().mo14695c("Generating a payload for this event is not available. package_name, event_name", str3, zzaw.f2855a);
            return null;
        }
    }
}
