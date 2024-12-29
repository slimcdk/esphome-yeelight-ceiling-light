package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import com.google.android.gms.common.C0879d;
import com.google.android.gms.common.C0884e;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1021b;
import com.google.android.gms.internal.measurement.C1023b1;
import com.google.android.gms.internal.measurement.zzd;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p014c0.C0625n;

/* renamed from: com.google.android.gms.measurement.internal.g6 */
public final class C1628g6 extends C1751q3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1770ra f2110a;

    /* renamed from: b */
    private Boolean f2111b;

    /* renamed from: c */
    private String f2112c = null;

    public C1628g6(C1770ra raVar, String str) {
        C0917i.m1419j(raVar);
        this.f2110a = raVar;
    }

    @BinderThread
    /* renamed from: G0 */
    private final void m4243G0(zzq zzq, boolean z) {
        C0917i.m1419j(zzq);
        C0917i.m1415f(zzq.f2866a);
        m4244H0(zzq.f2866a, false);
        this.f2110a.mo14477g0().mo14655L(zzq.f2867b, zzq.f2882q);
    }

    @BinderThread
    /* renamed from: H0 */
    private final void m4244H0(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f2111b == null) {
                        if (!"com.google.android.gms".equals(this.f2112c) && !C0625n.m233a(this.f2110a.mo14231f(), Binder.getCallingUid())) {
                            if (!C0884e.m1246a(this.f2110a.mo14231f()).mo12142c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f2111b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f2111b = Boolean.valueOf(z2);
                    }
                    if (this.f2111b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f2110a.mo14228b().mo14035r().mo14694b("Measurement Service called with invalid calling package. appId", C1574c4.m4083z(str));
                    throw e;
                }
            }
            if (this.f2112c == null && C0879d.m1235j(this.f2110a.mo14231f(), Binder.getCallingUid(), str)) {
                this.f2112c = str;
            }
            if (!str.equals(this.f2112c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f2110a.mo14228b().mo14035r().mo14693a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: e */
    private final void m4246e(zzaw zzaw, zzq zzq) {
        this.f2110a.mo14474e();
        this.f2110a.mo14480i(zzaw, zzq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public final void mo14187D0(zzaw zzaw, zzq zzq) {
        C1859z3 v;
        String str;
        String str2;
        if (!this.f2110a.mo14470Z().mo14138C(zzq.f2866a)) {
            m4246e(zzaw, zzq);
            return;
        }
        this.f2110a.mo14228b().mo14039v().mo14694b("EES config found for", zzq.f2866a);
        C1614f5 Z = this.f2110a.mo14470Z();
        String str3 = zzq.f2866a;
        C1023b1 b1Var = TextUtils.isEmpty(str3) ? null : (C1023b1) Z.f2080j.get(str3);
        if (b1Var != null) {
            try {
                Map I = this.f2110a.mo14475f0().mo14583I(zzaw.f2856b.mo14704c0(), true);
                String a = C1693l6.m4466a(zzaw.f2855a);
                if (a == null) {
                    a = zzaw.f2855a;
                }
                if (b1Var.mo12566e(new C1021b(a, zzaw.f2858d, I))) {
                    if (b1Var.mo12568g()) {
                        this.f2110a.mo14228b().mo14039v().mo14694b("EES edited event", zzaw.f2855a);
                        zzaw = this.f2110a.mo14475f0().mo14577A(b1Var.mo12562a().mo12593b());
                    }
                    m4246e(zzaw, zzq);
                    if (b1Var.mo12567f()) {
                        for (C1021b bVar : b1Var.mo12562a().mo12594c()) {
                            this.f2110a.mo14228b().mo14039v().mo14694b("EES logging created event", bVar.mo12554d());
                            m4246e(this.f2110a.mo14475f0().mo14577A(bVar), zzq);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f2110a.mo14228b().mo14035r().mo14695c("EES error. appId, eventName", zzq.f2867b, zzaw.f2855a);
            }
            v = this.f2110a.mo14228b().mo14039v();
            str = zzaw.f2855a;
            str2 = "EES was not applied to event";
        } else {
            v = this.f2110a.mo14228b().mo14039v();
            str = zzq.f2866a;
            str2 = "EES not loaded for";
        }
        v.mo14694b(str2, str);
        m4246e(zzaw, zzq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public final /* synthetic */ void mo14188E0(String str, Bundle bundle) {
        C1686l V = this.f2110a.mo14466V();
        V.mo14009h();
        V.mo14128i();
        byte[] j = V.f2045b.mo14475f0().mo14578B(new C1747q(V.f2143a, "", str, "dep", 0, 0, bundle)).mo13507j();
        V.f2143a.mo14228b().mo14039v().mo14695c("Saving default event parameters, appId, data size", V.f2143a.mo14373D().mo14617d(str), Integer.valueOf(j.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, str);
        contentValues.put("parameters", j);
        try {
            if (V.mo14320P().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                V.f2143a.mo14228b().mo14035r().mo14694b("Failed to insert default event parameters (got -1). appId", C1574c4.m4083z(str));
            }
        } catch (SQLiteException e) {
            V.f2143a.mo14228b().mo14035r().mo14695c("Error storing default event parameters. appId", C1574c4.m4083z(str), e);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: F0 */
    public final void mo14189F0(Runnable runnable) {
        C0917i.m1419j(runnable);
        if (this.f2110a.mo14227a().mo14305C()) {
            runnable.run();
        } else {
            this.f2110a.mo14227a().mo14310z(runnable);
        }
    }

    @BinderThread
    /* renamed from: N */
    public final void mo14190N(zzlo zzlo, zzq zzq) {
        C0917i.m1419j(zzlo);
        m4243G0(zzq, false);
        mo14189F0(new C1563b6(this, zzlo, zzq));
    }

    @BinderThread
    /* renamed from: Q */
    public final void mo14191Q(zzaw zzaw, zzq zzq) {
        C0917i.m1419j(zzaw);
        m4243G0(zzq, false);
        mo14189F0(new C1849y5(this, zzaw, zzq));
    }

    @BinderThread
    /* renamed from: V */
    public final void mo14192V(zzq zzq) {
        m4243G0(zzq, false);
        mo14189F0(new C1602e6(this, zzq));
    }

    @BinderThread
    /* renamed from: W */
    public final List mo14193W(String str, String str2, zzq zzq) {
        m4243G0(zzq, false);
        String str3 = zzq.f2866a;
        C0917i.m1419j(str3);
        try {
            return (List) this.f2110a.mo14227a().mo14307s(new C1789t5(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f2110a.mo14228b().mo14035r().mo14694b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: b0 */
    public final void mo14194b0(long j, String str, String str2, String str3) {
        mo14189F0(new C1615f6(this, str2, str3, str, j));
    }

    @BinderThread
    /* renamed from: e0 */
    public final void mo14195e0(zzaw zzaw, String str, String str2) {
        C0917i.m1419j(zzaw);
        C0917i.m1415f(str);
        m4244H0(str, true);
        mo14189F0(new C1861z5(this, zzaw, str));
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: f */
    public final zzaw mo14196f(zzaw zzaw, zzq zzq) {
        zzau zzau;
        if (!(!"_cmp".equals(zzaw.f2855a) || (zzau = zzaw.f2856b) == null || zzau.mo14703V() == 0)) {
            String h0 = zzaw.f2856b.mo14708h0("_cis");
            if ("referrer broadcast".equals(h0) || "referrer API".equals(h0)) {
                this.f2110a.mo14228b().mo14038u().mo14694b("Event has been filtered ", zzaw.toString());
                return new zzaw("_cmpx", zzaw.f2856b, zzaw.f2857c, zzaw.f2858d);
            }
        }
        return zzaw;
    }

    @BinderThread
    /* renamed from: i */
    public final void mo14197i(zzq zzq) {
        m4243G0(zzq, false);
        mo14189F0(new C1825w5(this, zzq));
    }

    @BinderThread
    /* renamed from: k */
    public final void mo14198k(Bundle bundle, zzq zzq) {
        m4243G0(zzq, false);
        String str = zzq.f2866a;
        C0917i.m1419j(str);
        mo14189F0(new C1729o5(this, str, bundle));
    }

    @BinderThread
    /* renamed from: k0 */
    public final void mo14199k0(zzq zzq) {
        C0917i.m1415f(zzq.f2866a);
        C0917i.m1419j(zzq.f2887v);
        C1837x5 x5Var = new C1837x5(this, zzq);
        C0917i.m1419j(x5Var);
        if (this.f2110a.mo14227a().mo14305C()) {
            x5Var.run();
        } else {
            this.f2110a.mo14227a().mo14304A(x5Var);
        }
    }

    @BinderThread
    /* renamed from: l */
    public final List mo14200l(String str, String str2, String str3, boolean z) {
        m4244H0(str, true);
        try {
            List<C1818va> list = (List) this.f2110a.mo14227a().mo14307s(new C1777s5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1818va vaVar : list) {
                if (z || !C1854ya.m4831W(vaVar.f2732c)) {
                    arrayList.add(new zzlo(vaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f2110a.mo14228b().mo14035r().mo14695c("Failed to get user properties as. appId", C1574c4.m4083z(str), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: l0 */
    public final List mo14201l0(String str, String str2, boolean z, zzq zzq) {
        m4243G0(zzq, false);
        String str3 = zzq.f2866a;
        C0917i.m1419j(str3);
        try {
            List<C1818va> list = (List) this.f2110a.mo14227a().mo14307s(new C1765r5(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1818va vaVar : list) {
                if (z || !C1854ya.m4831W(vaVar.f2732c)) {
                    arrayList.add(new zzlo(vaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f2110a.mo14228b().mo14035r().mo14695c("Failed to query user properties. appId", C1574c4.m4083z(zzq.f2866a), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: n */
    public final void mo14202n(zzac zzac) {
        C0917i.m1419j(zzac);
        C0917i.m1419j(zzac.f2845c);
        C0917i.m1415f(zzac.f2843a);
        m4244H0(zzac.f2843a, true);
        mo14189F0(new C1753q5(this, new zzac(zzac)));
    }

    @BinderThread
    /* renamed from: o */
    public final List mo14203o(zzq zzq, boolean z) {
        m4243G0(zzq, false);
        String str = zzq.f2866a;
        C0917i.m1419j(str);
        try {
            List<C1818va> list = (List) this.f2110a.mo14227a().mo14307s(new C1576c6(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1818va vaVar : list) {
                if (z || !C1854ya.m4831W(vaVar.f2732c)) {
                    arrayList.add(new zzlo(vaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f2110a.mo14228b().mo14035r().mo14695c("Failed to get user properties. appId", C1574c4.m4083z(zzq.f2866a), e);
            return null;
        }
    }

    @BinderThread
    /* renamed from: q */
    public final byte[] mo14204q(zzaw zzaw, String str) {
        C0917i.m1415f(str);
        C0917i.m1419j(zzaw);
        m4244H0(str, true);
        this.f2110a.mo14228b().mo14034q().mo14694b("Log and bundle. event", this.f2110a.mo14467W().mo14617d(zzaw.f2855a));
        long c = this.f2110a.mo14229c().mo11031c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f2110a.mo14227a().mo14308t(new C1550a6(this, zzaw, str)).get();
            if (bArr == null) {
                this.f2110a.mo14228b().mo14035r().mo14694b("Log and bundle returned null. appId", C1574c4.m4083z(str));
                bArr = new byte[0];
            }
            this.f2110a.mo14228b().mo14034q().mo14696d("Log and bundle processed. event, size, time_ms", this.f2110a.mo14467W().mo14617d(zzaw.f2855a), Integer.valueOf(bArr.length), Long.valueOf((this.f2110a.mo14229c().mo11031c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f2110a.mo14228b().mo14035r().mo14696d("Failed to log and bundle. appId, event, error", C1574c4.m4083z(str), this.f2110a.mo14467W().mo14617d(zzaw.f2855a), e);
            return null;
        }
    }

    @BinderThread
    /* renamed from: r0 */
    public final void mo14205r0(zzq zzq) {
        C0917i.m1415f(zzq.f2866a);
        m4244H0(zzq.f2866a, false);
        mo14189F0(new C1813v5(this, zzq));
    }

    @BinderThread
    /* renamed from: s0 */
    public final void mo14206s0(zzac zzac, zzq zzq) {
        C0917i.m1419j(zzac);
        C0917i.m1419j(zzac.f2845c);
        m4243G0(zzq, false);
        zzac zzac2 = new zzac(zzac);
        zzac2.f2843a = zzq.f2866a;
        mo14189F0(new C1741p5(this, zzac2, zzq));
    }

    @BinderThread
    /* renamed from: t */
    public final String mo14207t(zzq zzq) {
        m4243G0(zzq, false);
        return this.f2110a.mo14481i0(zzq);
    }

    @BinderThread
    /* renamed from: z */
    public final List mo14208z(String str, String str2, String str3) {
        m4244H0(str, true);
        try {
            return (List) this.f2110a.mo14227a().mo14307s(new C1801u5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f2110a.mo14228b().mo14035r().mo14694b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }
}
