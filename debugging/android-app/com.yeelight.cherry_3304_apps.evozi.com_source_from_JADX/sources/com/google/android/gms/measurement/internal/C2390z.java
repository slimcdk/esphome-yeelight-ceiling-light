package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C1609u;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.z */
public final class C2390z extends C2146d4 {

    /* renamed from: b */
    private final Map<String, Long> f4740b = new ArrayMap();

    /* renamed from: c */
    private final Map<String, Integer> f4741c = new ArrayMap();

    /* renamed from: d */
    private long f4742d;

    public C2390z(C2111a5 a5Var) {
        super(a5Var);
    }

    @WorkerThread
    /* renamed from: A */
    private final void m7784A(String str, long j, C2255m7 m7Var) {
        if (m7Var == null) {
            mo12427b().mo13104O().mo13130a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo12427b().mo13104O().mo13131b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C2243l7.m7203M(m7Var, bundle, true);
            mo12570p().mo12709S("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: B */
    public final void m7785B(long j) {
        for (String put : this.f4740b.keySet()) {
            this.f4740b.put(put, Long.valueOf(j));
        }
        if (!this.f4740b.isEmpty()) {
            this.f4742d = j;
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: E */
    public final void m7787E(String str, long j) {
        mo12566d();
        mo12567h();
        C1609u.m4471g(str);
        if (this.f4741c.isEmpty()) {
            this.f4742d = j;
        }
        Integer num = this.f4741c.get(str);
        if (num != null) {
            this.f4741c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f4741c.size() >= 100) {
            mo12427b().mo13099J().mo13130a("Too many ads visible");
        } else {
            this.f4741c.put(str, 1);
            this.f4740b.put(str, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: F */
    public final void m7788F(String str, long j) {
        mo12566d();
        mo12567h();
        C1609u.m4471g(str);
        Integer num = this.f4741c.get(str);
        if (num != null) {
            C2255m7 D = mo12573s().mo12799D(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f4741c.remove(str);
                Long l = this.f4740b.get(str);
                if (l == null) {
                    mo12427b().mo13096F().mo13130a("First ad unit exposure time was never set");
                } else {
                    this.f4740b.remove(str);
                    m7784A(str, j - l.longValue(), D);
                }
                if (this.f4741c.isEmpty()) {
                    long j2 = this.f4742d;
                    if (j2 == 0) {
                        mo12427b().mo13096F().mo13130a("First ad exposure time was never set");
                        return;
                    }
                    m7789w(j - j2, D);
                    this.f4742d = 0;
                    return;
                }
                return;
            }
            this.f4741c.put(str, Integer.valueOf(intValue));
            return;
        }
        mo12427b().mo13096F().mo13131b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    @WorkerThread
    /* renamed from: w */
    private final void m7789w(long j, C2255m7 m7Var) {
        if (m7Var == null) {
            mo12427b().mo13104O().mo13130a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo12427b().mo13104O().mo13131b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C2243l7.m7203M(m7Var, bundle, true);
            mo12570p().mo12709S("am", "_xa", bundle);
        }
    }

    /* renamed from: D */
    public final void mo13141D(String str, long j) {
        if (str == null || str.length() == 0) {
            mo12427b().mo13096F().mo13130a("Ad unit id must be a non-empty string");
        } else {
            mo12426a().mo13122y(new C2120b2(this, str, j));
        }
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo13142v(long j) {
        C2255m7 D = mo12573s().mo12799D(false);
        for (String next : this.f4740b.keySet()) {
            m7784A(next, j - this.f4740b.get(next).longValue(), D);
        }
        if (!this.f4740b.isEmpty()) {
            m7789w(j - this.f4742d, D);
        }
        m7785B(j);
    }

    /* renamed from: z */
    public final void mo13143z(String str, long j) {
        if (str == null || str.length() == 0) {
            mo12427b().mo13096F().mo13130a("Ad unit id must be a non-empty string");
        } else {
            mo12426a().mo13122y(new C2105a(this, str, j));
        }
    }
}
