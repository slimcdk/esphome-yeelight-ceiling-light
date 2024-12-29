package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C1533g;
import com.google.android.gms.common.C1534h;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.C1663q;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.g5 */
public final class C2183g5 extends C2306r3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2245l9 f4129a;

    /* renamed from: b */
    private Boolean f4130b;
    @Nullable

    /* renamed from: c */
    private String f4131c;

    public C2183g5(C2245l9 l9Var) {
        this(l9Var, (String) null);
    }

    private C2183g5(C2245l9 l9Var, @Nullable String str) {
        C1609u.m4475k(l9Var);
        this.f4129a = l9Var;
        this.f4131c = null;
    }

    @BinderThread
    /* renamed from: P0 */
    private final void m7031P0(zzm zzm, boolean z) {
        C1609u.m4475k(zzm);
        m7034f(zzm.f4777a, false);
        this.f4129a.mo12824a0().mo12970g0(zzm.f4778b, zzm.f4794r, zzm.f4798v);
    }

    @VisibleForTesting
    /* renamed from: e */
    private final void m7033e(Runnable runnable) {
        C1609u.m4475k(runnable);
        if (this.f4129a.mo12426a().mo13119G()) {
            runnable.run();
        } else {
            this.f4129a.mo12426a().mo13122y(runnable);
        }
    }

    @BinderThread
    /* renamed from: f */
    private final void m7034f(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f4130b == null) {
                        if (!"com.google.android.gms".equals(this.f4131c) && !C1663q.m4615a(this.f4129a.mo12428c(), Binder.getCallingUid())) {
                            if (!C1534h.m4161a(this.f4129a.mo12428c()).mo11095c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f4130b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f4130b = Boolean.valueOf(z2);
                    }
                    if (this.f4130b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f4129a.mo12427b().mo13096F().mo13131b("Measurement Service called with invalid calling package. appId", C2361w3.m7696w(str));
                    throw e;
                }
            }
            if (this.f4131c == null && C1533g.m4159l(this.f4129a.mo12428c(), Binder.getCallingUid(), str)) {
                this.f4131c = str;
            }
            if (!str.equals(this.f4131c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f4129a.mo12427b().mo13096F().mo13130a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @BinderThread
    /* renamed from: I0 */
    public final void mo12665I0(zzm zzm) {
        m7031P0(zzm, false);
        m7033e(new C2308r5(this, zzm));
    }

    @BinderThread
    /* renamed from: K */
    public final void mo12666K(zzm zzm) {
        m7034f(zzm.f4777a, false);
        m7033e(new C2241l5(this, zzm));
    }

    @BinderThread
    /* renamed from: K0 */
    public final void mo12667K0(zzaq zzaq, zzm zzm) {
        C1609u.m4475k(zzaq);
        m7031P0(zzm, false);
        m7033e(new C2275o5(this, zzaq, zzm));
    }

    @BinderThread
    /* renamed from: N */
    public final List<zzy> mo12668N(String str, String str2, zzm zzm) {
        m7031P0(zzm, false);
        try {
            return (List) this.f4129a.mo12426a().mo13121v(new C2219j5(this, zzm, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f4129a.mo12427b().mo13096F().mo13131b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: O0 */
    public final zzaq mo12669O0(zzaq zzaq, zzm zzm) {
        zzal zzal;
        boolean z = false;
        if (!(!"_cmp".equals(zzaq.f4766a) || (zzal = zzaq.f4767b) == null || zzal.mo13149Q() == 0)) {
            String X = zzaq.f4767b.mo13154X("_cis");
            if (!TextUtils.isEmpty(X) && (("referrer broadcast".equals(X) || "referrer API".equals(X)) && this.f4129a.mo12810G().mo12456B(zzm.f4777a, C2302r.f4493S))) {
                z = true;
            }
        }
        if (!z) {
            return zzaq;
        }
        this.f4129a.mo12427b().mo13102M().mo13131b("Event has been filtered ", zzaq.toString());
        return new zzaq("_cmpx", zzaq.f4767b, zzaq.f4768c, zzaq.f4769d);
    }

    @BinderThread
    /* renamed from: S */
    public final void mo12670S(zzy zzy) {
        C1609u.m4475k(zzy);
        C1609u.m4475k(zzy.f4801c);
        m7034f(zzy.f4799a, true);
        m7033e(new C2207i5(this, new zzy(zzy)));
    }

    @BinderThread
    /* renamed from: U */
    public final List<zzkn> mo12671U(String str, String str2, boolean z, zzm zzm) {
        m7031P0(zzm, false);
        try {
            List<C2334t9> list = (List) this.f4129a.mo12426a().mo13121v(new C2195h5(this, zzm, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2334t9 t9Var : list) {
                if (z || !C2323s9.m7550A0(t9Var.f4628c)) {
                    arrayList.add(new zzkn(t9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f4129a.mo12427b().mo13096F().mo13132c("Failed to query user properties. appId", C2361w3.m7696w(zzm.f4777a), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: X */
    public final void mo12672X(long j, String str, String str2, String str3) {
        m7033e(new C2341u5(this, str2, str3, str, j));
    }

    @BinderThread
    /* renamed from: Z */
    public final List<zzy> mo12673Z(String str, String str2, String str3) {
        m7034f(str, true);
        try {
            return (List) this.f4129a.mo12426a().mo13121v(new C2253m5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f4129a.mo12427b().mo13096F().mo13131b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: f0 */
    public final void mo12674f0(zzkn zzkn, zzm zzm) {
        C1609u.m4475k(zzkn);
        m7031P0(zzm, false);
        m7033e(new C2286p5(this, zzkn, zzm));
    }

    @BinderThread
    /* renamed from: k */
    public final byte[] mo12675k(zzaq zzaq, String str) {
        C1609u.m4471g(str);
        C1609u.m4475k(zzaq);
        m7034f(str, true);
        this.f4129a.mo12427b().mo13103N().mo13131b("Log and bundle. event", this.f4129a.mo12823Z().mo12995v(zzaq.f4766a));
        long c = this.f4129a.mo12429f().mo11380c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f4129a.mo12426a().mo13117A(new C2297q5(this, zzaq, str)).get();
            if (bArr == null) {
                this.f4129a.mo12427b().mo13096F().mo13131b("Log and bundle returned null. appId", C2361w3.m7696w(str));
                bArr = new byte[0];
            }
            this.f4129a.mo12427b().mo13103N().mo13133d("Log and bundle processed. event, size, time_ms", this.f4129a.mo12823Z().mo12995v(zzaq.f4766a), Integer.valueOf(bArr.length), Long.valueOf((this.f4129a.mo12429f().mo11380c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f4129a.mo12427b().mo13096F().mo13133d("Failed to log and bundle. appId, event, error", C2361w3.m7696w(str), this.f4129a.mo12823Z().mo12995v(zzaq.f4766a), e);
            return null;
        }
    }

    @BinderThread
    /* renamed from: k0 */
    public final void mo12676k0(zzm zzm) {
        m7031P0(zzm, false);
        m7033e(new C2171f5(this, zzm));
    }

    @BinderThread
    /* renamed from: u0 */
    public final String mo12677u0(zzm zzm) {
        m7031P0(zzm, false);
        return this.f4129a.mo12818T(zzm);
    }

    @BinderThread
    /* renamed from: w */
    public final List<zzkn> mo12678w(zzm zzm, boolean z) {
        m7031P0(zzm, false);
        try {
            List<C2334t9> list = (List) this.f4129a.mo12426a().mo13121v(new C2319s5(this, zzm)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2334t9 t9Var : list) {
                if (z || !C2323s9.m7550A0(t9Var.f4628c)) {
                    arrayList.add(new zzkn(t9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f4129a.mo12427b().mo13096F().mo13132c("Failed to get user properties. appId", C2361w3.m7696w(zzm.f4777a), e);
            return null;
        }
    }

    @BinderThread
    /* renamed from: x */
    public final void mo12679x(zzaq zzaq, String str, String str2) {
        C1609u.m4475k(zzaq);
        C1609u.m4471g(str);
        m7034f(str, true);
        m7033e(new C2264n5(this, zzaq, str));
    }

    @BinderThread
    /* renamed from: y */
    public final List<zzkn> mo12680y(String str, String str2, String str3, boolean z) {
        m7034f(str, true);
        try {
            List<C2334t9> list = (List) this.f4129a.mo12426a().mo13121v(new C2230k5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2334t9 t9Var : list) {
                if (z || !C2323s9.m7550A0(t9Var.f4628c)) {
                    arrayList.add(new zzkn(t9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f4129a.mo12427b().mo13096F().mo13132c("Failed to get user properties as. appId", C2361w3.m7696w(str), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: z */
    public final void mo12681z(zzy zzy, zzm zzm) {
        C1609u.m4475k(zzy);
        C1609u.m4475k(zzy.f4801c);
        m7031P0(zzm, false);
        zzy zzy2 = new zzy(zzy);
        zzy2.f4799a = zzm.f4777a;
        m7033e(new C2330t5(this, zzy2, zzm));
    }
}
