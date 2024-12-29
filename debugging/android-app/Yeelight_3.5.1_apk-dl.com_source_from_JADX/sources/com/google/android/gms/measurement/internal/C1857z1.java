package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C0917i;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.z1 */
public final class C1857z1 extends C1547a3 {

    /* renamed from: b */
    private final Map f2812b = new ArrayMap();

    /* renamed from: c */
    private final Map f2813c = new ArrayMap();

    /* renamed from: d */
    private long f2814d;

    public C1857z1(C1717n5 n5Var) {
        super(n5Var);
    }

    /* renamed from: i */
    static /* synthetic */ void m4894i(C1857z1 z1Var, String str, long j) {
        z1Var.mo14009h();
        C0917i.m1415f(str);
        if (z1Var.f2813c.isEmpty()) {
            z1Var.f2814d = j;
        }
        Integer num = (Integer) z1Var.f2813c.get(str);
        if (num != null) {
            z1Var.f2813c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (z1Var.f2813c.size() >= 100) {
            z1Var.f2143a.mo14228b().mo14040w().mo14693a("Too many ads visible");
        } else {
            z1Var.f2813c.put(str, 1);
            z1Var.f2812b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m4895j(C1857z1 z1Var, String str, long j) {
        z1Var.mo14009h();
        C0917i.m1415f(str);
        Integer num = (Integer) z1Var.f2813c.get(str);
        if (num != null) {
            C1552a8 t = z1Var.f2143a.mo14379K().mo14265t(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                z1Var.f2813c.remove(str);
                Long l = (Long) z1Var.f2812b.get(str);
                if (l == null) {
                    z1Var.f2143a.mo14228b().mo14035r().mo14693a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    z1Var.f2812b.remove(str);
                    z1Var.m4898p(str, j - longValue, t);
                }
                if (z1Var.f2813c.isEmpty()) {
                    long j2 = z1Var.f2814d;
                    if (j2 == 0) {
                        z1Var.f2143a.mo14228b().mo14035r().mo14693a("First ad exposure time was never set");
                        return;
                    }
                    z1Var.m4897o(j - j2, t);
                    z1Var.f2814d = 0;
                    return;
                }
                return;
            }
            z1Var.f2813c.put(str, Integer.valueOf(intValue));
            return;
        }
        z1Var.f2143a.mo14228b().mo14035r().mo14694b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    @WorkerThread
    /* renamed from: o */
    private final void m4897o(long j, C1552a8 a8Var) {
        if (a8Var == null) {
            this.f2143a.mo14228b().mo14039v().mo14693a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f2143a.mo14228b().mo14039v().mo14694b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C1854ya.m4845y(a8Var, bundle, true);
            this.f2143a.mo14377I().mo14570v("am", "_xa", bundle);
        }
    }

    @WorkerThread
    /* renamed from: p */
    private final void m4898p(String str, long j, C1552a8 a8Var) {
        if (a8Var == null) {
            this.f2143a.mo14228b().mo14039v().mo14693a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f2143a.mo14228b().mo14039v().mo14694b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C1854ya.m4845y(a8Var, bundle, true);
            this.f2143a.mo14377I().mo14570v("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: q */
    public final void m4899q(long j) {
        for (String put : this.f2812b.keySet()) {
            this.f2812b.put(put, Long.valueOf(j));
        }
        if (!this.f2812b.isEmpty()) {
            this.f2814d = j;
        }
    }

    /* renamed from: l */
    public final void mo14690l(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f2143a.mo14228b().mo14035r().mo14693a("Ad unit id must be a non-empty string");
        } else {
            this.f2143a.mo14227a().mo14310z(new C1543a(this, str, j));
        }
    }

    /* renamed from: m */
    public final void mo14691m(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f2143a.mo14228b().mo14035r().mo14693a("Ad unit id must be a non-empty string");
        } else {
            this.f2143a.mo14227a().mo14310z(new C1831x(this, str, j));
        }
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo14692n(long j) {
        C1552a8 t = this.f2143a.mo14379K().mo14265t(false);
        for (String str : this.f2812b.keySet()) {
            m4898p(str, j - ((Long) this.f2812b.get(str)).longValue(), t);
        }
        if (!this.f2812b.isEmpty()) {
            m4897o(j - this.f2814d, t);
        }
        m4899q(j);
    }
}
