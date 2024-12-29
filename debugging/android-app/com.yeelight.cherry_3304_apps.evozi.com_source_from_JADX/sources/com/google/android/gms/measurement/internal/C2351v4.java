package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1884m0;
import com.google.android.gms.internal.measurement.C1889m4;
import com.google.android.gms.internal.measurement.C1905n0;
import com.google.android.gms.internal.measurement.C1920o0;
import com.google.android.gms.internal.measurement.C2046w4;
import com.google.android.gms.internal.measurement.C2065x8;
import com.miot.service.manager.timer.TimerCodec;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
public final class C2351v4 extends C2211i9 implements C2141d {
    @VisibleForTesting

    /* renamed from: j */
    private static int f4657j = 65535;
    @VisibleForTesting

    /* renamed from: k */
    private static int f4658k = 2;

    /* renamed from: d */
    private final Map<String, Map<String, String>> f4659d = new ArrayMap();

    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f4660e = new ArrayMap();

    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f4661f = new ArrayMap();

    /* renamed from: g */
    private final Map<String, C1905n0> f4662g = new ArrayMap();

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f4663h = new ArrayMap();

    /* renamed from: i */
    private final Map<String, String> f4664i = new ArrayMap();

    C2351v4(C2245l9 l9Var) {
        super(l9Var);
    }

    @WorkerThread
    /* renamed from: K */
    private final void m7661K(String str) {
        mo12749r();
        mo12567h();
        C1609u.m4471g(str);
        if (this.f4662g.get(str) == null) {
            byte[] p0 = mo12779o().mo12518p0(str);
            if (p0 == null) {
                this.f4659d.put(str, (Object) null);
                this.f4660e.put(str, (Object) null);
                this.f4661f.put(str, (Object) null);
                this.f4662g.put(str, (Object) null);
                this.f4664i.put(str, (Object) null);
                this.f4663h.put(str, (Object) null);
                return;
            }
            C1905n0.C1906a aVar = (C1905n0.C1906a) m7662v(str, p0).mo11850u();
            m7664x(str, aVar);
            this.f4659d.put(str, m7663w((C1905n0) ((C1889m4) aVar.mo11851I())));
            this.f4662g.put(str, (C1905n0) ((C1889m4) aVar.mo11851I()));
            this.f4664i.put(str, (Object) null);
        }
    }

    @WorkerThread
    /* renamed from: v */
    private final C1905n0 m7662v(String str, byte[] bArr) {
        if (bArr == null) {
            return C1905n0.m5561O();
        }
        try {
            C1905n0.C1906a N = C1905n0.m5560N();
            C2290p9.m7352y(N, bArr);
            C1905n0 n0Var = (C1905n0) ((C1889m4) N.mo11851I());
            C2383y3 O = mo12427b().mo13104O();
            String str2 = null;
            Long valueOf = n0Var.mo11875D() ? Long.valueOf(n0Var.mo11876E()) : null;
            if (n0Var.mo11877F()) {
                str2 = n0Var.mo11878G();
            }
            O.mo13132c("Parsed config. version, gmp_app_id", valueOf, str2);
            return n0Var;
        } catch (C2046w4 | RuntimeException e) {
            mo12427b().mo13099J().mo13132c("Unable to merge remote config. appId", C2361w3.m7696w(str), e);
            return C1905n0.m5561O();
        }
    }

    /* renamed from: w */
    private static Map<String, String> m7663w(C1905n0 n0Var) {
        ArrayMap arrayMap = new ArrayMap();
        if (n0Var != null) {
            for (C1920o0 next : n0Var.mo11879H()) {
                arrayMap.put(next.mo11890y(), next.mo11891z());
            }
        }
        return arrayMap;
    }

    /* renamed from: x */
    private final void m7664x(String str, C1905n0.C1906a aVar) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (aVar != null) {
            for (int i = 0; i < aVar.mo11884u(); i++) {
                C1884m0.C1885a aVar2 = (C1884m0.C1885a) aVar.mo11885v(i).mo11850u();
                if (TextUtils.isEmpty(aVar2.mo11829v())) {
                    mo12427b().mo13099J().mo13130a("EventConfig contained null event name");
                } else {
                    String b = C2112a6.m6754b(aVar2.mo11829v());
                    if (!TextUtils.isEmpty(b)) {
                        aVar2.mo11828u(b);
                        aVar.mo11886w(i, aVar2);
                    }
                    arrayMap.put(aVar2.mo11829v(), Boolean.valueOf(aVar2.mo11830w()));
                    arrayMap2.put(aVar2.mo11829v(), Boolean.valueOf(aVar2.mo11831x()));
                    if (aVar2.mo11832y()) {
                        if (aVar2.mo11833z() < f4658k || aVar2.mo11833z() > f4657j) {
                            mo12427b().mo13099J().mo13132c("Invalid sampling rate. Event name, sample rate", aVar2.mo11829v(), Integer.valueOf(aVar2.mo11833z()));
                        } else {
                            arrayMap3.put(aVar2.mo11829v(), Integer.valueOf(aVar2.mo11833z()));
                        }
                    }
                }
            }
        }
        this.f4660e.put(str, arrayMap);
        this.f4661f.put(str, arrayMap2);
        this.f4663h.put(str, arrayMap3);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: A */
    public final boolean mo13067A(String str, String str2) {
        Boolean bool;
        mo12567h();
        m7661K(str);
        if (mo13074H(str) && C2323s9.m7550A0(str2)) {
            return true;
        }
        if (mo13075J(str) && C2323s9.m7567b0(str2)) {
            return true;
        }
        Map map = this.f4660e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: B */
    public final void mo13068B(String str) {
        mo12567h();
        this.f4664i.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: C */
    public final boolean mo13069C(String str, String str2) {
        Boolean bool;
        mo12567h();
        m7661K(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (C2065x8.m6570a() && mo13112m().mo12474s(C2302r.f4478K0) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map map = this.f4661f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: D */
    public final int mo13070D(String str, String str2) {
        Integer num;
        mo12567h();
        m7661K(str);
        Map map = this.f4663h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: E */
    public final void mo13071E(String str) {
        mo12567h();
        this.f4662g.remove(str);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: F */
    public final boolean mo13072F(String str) {
        mo12567h();
        C1905n0 u = mo13076u(str);
        if (u == null) {
            return false;
        }
        return u.mo11882L();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: G */
    public final long mo13073G(String str) {
        String e = mo12565e(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(e)) {
            return 0;
        }
        try {
            return Long.parseLong(e);
        } catch (NumberFormatException e2) {
            mo12427b().mo13099J().mo13132c("Unable to parse timezone offset. appId", C2361w3.m7696w(str), e2);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final boolean mo13074H(String str) {
        return TimerCodec.ENABLE.equals(mo12565e(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean mo13075J(String str) {
        return TimerCodec.ENABLE.equals(mo12565e(str, "measurement.upload.blacklist_public"));
    }

    @WorkerThread
    /* renamed from: e */
    public final String mo12565e(String str, String str2) {
        mo12567h();
        m7661K(str);
        Map map = this.f4659d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo12453t() {
        return false;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: u */
    public final C1905n0 mo13076u(String str) {
        mo12749r();
        mo12567h();
        C1609u.m4471g(str);
        m7661K(str);
        return this.f4662g.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: y */
    public final boolean mo13077y(String str, byte[] bArr, String str2) {
        mo12749r();
        mo12567h();
        C1609u.m4471g(str);
        C1905n0.C1906a aVar = (C1905n0.C1906a) m7662v(str, bArr).mo11850u();
        if (aVar == null) {
            return false;
        }
        m7664x(str, aVar);
        this.f4662g.put(str, (C1905n0) ((C1889m4) aVar.mo11851I()));
        this.f4664i.put(str, str2);
        this.f4659d.put(str, m7663w((C1905n0) ((C1889m4) aVar.mo11851I())));
        mo12779o().mo12504O(str, new ArrayList(aVar.mo11887x()));
        try {
            aVar.mo11888y();
            bArr = ((C1905n0) ((C1889m4) aVar.mo11851I())).mo12168h();
        } catch (RuntimeException e) {
            mo12427b().mo13099J().mo13132c("Unable to serialize reduced-size config. Storing full config instead. appId", C2361w3.m7696w(str), e);
        }
        C2129c o = mo12779o();
        C1609u.m4471g(str);
        o.mo12567h();
        o.mo12749r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) o.mo12525v().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                o.mo12427b().mo13096F().mo13131b("Failed to update remote config (got 0). appId", C2361w3.m7696w(str));
            }
        } catch (SQLiteException e2) {
            o.mo12427b().mo13096F().mo13132c("Error storing remote config. appId", C2361w3.m7696w(str), e2);
        }
        this.f4662g.put(str, (C1905n0) ((C1889m4) aVar.mo11851I()));
        return true;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: z */
    public final String mo13078z(String str) {
        mo12567h();
        return this.f4664i.get(str);
    }
}
