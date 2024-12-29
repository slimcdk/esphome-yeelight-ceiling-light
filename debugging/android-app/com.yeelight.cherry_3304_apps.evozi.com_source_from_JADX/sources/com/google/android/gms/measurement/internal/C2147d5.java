package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
final class C2147d5 {

    /* renamed from: A */
    private long f4021A;

    /* renamed from: B */
    private long f4022B;

    /* renamed from: C */
    private long f4023C;

    /* renamed from: D */
    private String f4024D;

    /* renamed from: E */
    private boolean f4025E;

    /* renamed from: F */
    private long f4026F;

    /* renamed from: G */
    private long f4027G;

    /* renamed from: a */
    private final C2111a5 f4028a;

    /* renamed from: b */
    private final String f4029b;

    /* renamed from: c */
    private String f4030c;

    /* renamed from: d */
    private String f4031d;

    /* renamed from: e */
    private String f4032e;

    /* renamed from: f */
    private String f4033f;

    /* renamed from: g */
    private long f4034g;

    /* renamed from: h */
    private long f4035h;

    /* renamed from: i */
    private long f4036i;

    /* renamed from: j */
    private String f4037j;

    /* renamed from: k */
    private long f4038k;

    /* renamed from: l */
    private String f4039l;

    /* renamed from: m */
    private long f4040m;

    /* renamed from: n */
    private long f4041n;

    /* renamed from: o */
    private boolean f4042o;

    /* renamed from: p */
    private long f4043p;

    /* renamed from: q */
    private boolean f4044q;

    /* renamed from: r */
    private boolean f4045r;

    /* renamed from: s */
    private String f4046s;

    /* renamed from: t */
    private Boolean f4047t;

    /* renamed from: u */
    private long f4048u;

    /* renamed from: v */
    private List<String> f4049v;

    /* renamed from: w */
    private String f4050w;

    /* renamed from: x */
    private long f4051x;

    /* renamed from: y */
    private long f4052y;

    /* renamed from: z */
    private long f4053z;

    @WorkerThread
    C2147d5(C2111a5 a5Var, String str) {
        C1609u.m4475k(a5Var);
        C1609u.m4471g(str);
        this.f4028a = a5Var;
        this.f4029b = str;
        a5Var.mo12426a().mo12567h();
    }

    @WorkerThread
    /* renamed from: A */
    public final String mo12576A() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4031d;
    }

    @WorkerThread
    /* renamed from: B */
    public final void mo12577B(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4041n != j;
        this.f4041n = j;
    }

    @WorkerThread
    /* renamed from: C */
    public final void mo12578C(String str) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= !C2323s9.m7583y0(this.f4032e, str);
        this.f4032e = str;
    }

    @WorkerThread
    /* renamed from: D */
    public final String mo12579D() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4046s;
    }

    @WorkerThread
    /* renamed from: E */
    public final void mo12580E(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4048u != j;
        this.f4048u = j;
    }

    @WorkerThread
    /* renamed from: F */
    public final void mo12581F(String str) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= !C2323s9.m7583y0(this.f4033f, str);
        this.f4033f = str;
    }

    @WorkerThread
    /* renamed from: G */
    public final String mo12582G() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4050w;
    }

    @WorkerThread
    /* renamed from: H */
    public final void mo12583H(long j) {
        boolean z = true;
        C1609u.m4465a(j >= 0);
        this.f4028a.mo12426a().mo12567h();
        boolean z2 = this.f4025E;
        if (this.f4034g == j) {
            z = false;
        }
        this.f4025E = z | z2;
        this.f4034g = j;
    }

    @WorkerThread
    /* renamed from: I */
    public final void mo12584I(String str) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= !C2323s9.m7583y0(this.f4037j, str);
        this.f4037j = str;
    }

    @WorkerThread
    /* renamed from: J */
    public final String mo12585J() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4032e;
    }

    @WorkerThread
    /* renamed from: K */
    public final void mo12586K(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4026F != j;
        this.f4026F = j;
    }

    @WorkerThread
    /* renamed from: L */
    public final void mo12587L(String str) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= !C2323s9.m7583y0(this.f4039l, str);
        this.f4039l = str;
    }

    @WorkerThread
    /* renamed from: M */
    public final String mo12588M() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4033f;
    }

    @WorkerThread
    /* renamed from: N */
    public final void mo12589N(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4027G != j;
        this.f4027G = j;
    }

    @WorkerThread
    /* renamed from: O */
    public final void mo12590O(String str) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= !C2323s9.m7583y0(this.f4024D, str);
        this.f4024D = str;
    }

    @WorkerThread
    /* renamed from: P */
    public final long mo12591P() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4035h;
    }

    @WorkerThread
    /* renamed from: Q */
    public final void mo12592Q(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4051x != j;
        this.f4051x = j;
    }

    @WorkerThread
    /* renamed from: R */
    public final long mo12593R() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4036i;
    }

    @WorkerThread
    /* renamed from: S */
    public final void mo12594S(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4052y != j;
        this.f4052y = j;
    }

    @WorkerThread
    /* renamed from: T */
    public final String mo12595T() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4037j;
    }

    @WorkerThread
    /* renamed from: U */
    public final void mo12596U(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4053z != j;
        this.f4053z = j;
    }

    @WorkerThread
    /* renamed from: V */
    public final long mo12597V() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4038k;
    }

    @WorkerThread
    /* renamed from: W */
    public final void mo12598W(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4021A != j;
        this.f4021A = j;
    }

    @WorkerThread
    /* renamed from: X */
    public final String mo12599X() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4039l;
    }

    @WorkerThread
    /* renamed from: Y */
    public final void mo12600Y(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4023C != j;
        this.f4023C = j;
    }

    @WorkerThread
    /* renamed from: Z */
    public final long mo12601Z() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4040m;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo12602a(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4035h != j;
        this.f4035h = j;
    }

    @WorkerThread
    /* renamed from: a0 */
    public final void mo12603a0(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4022B != j;
        this.f4022B = j;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo12604b(Boolean bool) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= !C2323s9.m7565Z(this.f4047t, bool);
        this.f4047t = bool;
    }

    @WorkerThread
    /* renamed from: b0 */
    public final long mo12605b0() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4041n;
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo12606c(String str) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= !C2323s9.m7583y0(this.f4030c, str);
        this.f4030c = str;
    }

    @WorkerThread
    /* renamed from: c0 */
    public final void mo12607c0(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4043p != j;
        this.f4043p = j;
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo12608d(@Nullable List<String> list) {
        this.f4028a.mo12426a().mo12567h();
        if (!C2323s9.m7570k0(this.f4049v, list)) {
            this.f4025E = true;
            this.f4049v = list != null ? new ArrayList(list) : null;
        }
    }

    @WorkerThread
    /* renamed from: d0 */
    public final long mo12609d0() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4048u;
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo12610e(boolean z) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4042o != z;
        this.f4042o = z;
    }

    @WorkerThread
    /* renamed from: e0 */
    public final boolean mo12611e0() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4042o;
    }

    @WorkerThread
    /* renamed from: f */
    public final boolean mo12612f() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4025E;
    }

    @WorkerThread
    /* renamed from: f0 */
    public final long mo12613f0() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4034g;
    }

    @WorkerThread
    /* renamed from: g */
    public final long mo12614g() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4023C;
    }

    @WorkerThread
    /* renamed from: g0 */
    public final long mo12615g0() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4026F;
    }

    @WorkerThread
    /* renamed from: h */
    public final long mo12616h() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4022B;
    }

    @WorkerThread
    /* renamed from: h0 */
    public final long mo12617h0() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4027G;
    }

    @WorkerThread
    /* renamed from: i */
    public final String mo12618i() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4024D;
    }

    @WorkerThread
    /* renamed from: i0 */
    public final void mo12619i0() {
        this.f4028a.mo12426a().mo12567h();
        long j = this.f4034g + 1;
        if (j > 2147483647L) {
            this.f4028a.mo12427b().mo13099J().mo13131b("Bundle index overflow. appId", C2361w3.m7696w(this.f4029b));
            j = 0;
        }
        this.f4025E = true;
        this.f4034g = j;
    }

    @WorkerThread
    /* renamed from: j */
    public final String mo12620j() {
        this.f4028a.mo12426a().mo12567h();
        String str = this.f4024D;
        mo12590O((String) null);
        return str;
    }

    @WorkerThread
    /* renamed from: j0 */
    public final long mo12621j0() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4051x;
    }

    @WorkerThread
    /* renamed from: k */
    public final long mo12622k() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4043p;
    }

    @WorkerThread
    /* renamed from: k0 */
    public final long mo12623k0() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4052y;
    }

    @WorkerThread
    /* renamed from: l */
    public final boolean mo12624l() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4044q;
    }

    @WorkerThread
    /* renamed from: l0 */
    public final long mo12625l0() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4053z;
    }

    @WorkerThread
    /* renamed from: m */
    public final boolean mo12626m() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4045r;
    }

    @WorkerThread
    /* renamed from: m0 */
    public final long mo12627m0() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4021A;
    }

    @WorkerThread
    /* renamed from: n */
    public final Boolean mo12628n() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4047t;
    }

    @WorkerThread
    @Nullable
    /* renamed from: o */
    public final List<String> mo12629o() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4049v;
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo12630p() {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E = false;
    }

    @WorkerThread
    /* renamed from: q */
    public final void mo12631q(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4036i != j;
        this.f4036i = j;
    }

    @WorkerThread
    /* renamed from: r */
    public final void mo12632r(String str) {
        this.f4028a.mo12426a().mo12567h();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f4025E |= !C2323s9.m7583y0(this.f4031d, str);
        this.f4031d = str;
    }

    @WorkerThread
    /* renamed from: s */
    public final void mo12633s(boolean z) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4044q != z;
        this.f4044q = z;
    }

    @WorkerThread
    /* renamed from: t */
    public final String mo12634t() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4029b;
    }

    @WorkerThread
    /* renamed from: u */
    public final void mo12635u(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4038k != j;
        this.f4038k = j;
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo12636v(String str) {
        this.f4028a.mo12426a().mo12567h();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f4025E |= !C2323s9.m7583y0(this.f4046s, str);
        this.f4046s = str;
    }

    @WorkerThread
    /* renamed from: w */
    public final void mo12637w(boolean z) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4045r != z;
        this.f4045r = z;
    }

    @WorkerThread
    /* renamed from: x */
    public final String mo12638x() {
        this.f4028a.mo12426a().mo12567h();
        return this.f4030c;
    }

    @WorkerThread
    /* renamed from: y */
    public final void mo12639y(long j) {
        this.f4028a.mo12426a().mo12567h();
        this.f4025E |= this.f4040m != j;
        this.f4040m = j;
    }

    @WorkerThread
    /* renamed from: z */
    public final void mo12640z(String str) {
        this.f4028a.mo12426a().mo12567h();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f4025E |= !C2323s9.m7583y0(this.f4050w, str);
        this.f4050w = str;
    }
}
