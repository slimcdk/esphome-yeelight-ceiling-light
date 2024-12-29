package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.d6 */
final class C1589d6 {

    /* renamed from: A */
    private long f2004A;

    /* renamed from: B */
    private long f2005B;
    @Nullable

    /* renamed from: C */
    private String f2006C;

    /* renamed from: D */
    private boolean f2007D;

    /* renamed from: E */
    private long f2008E;

    /* renamed from: F */
    private long f2009F;

    /* renamed from: a */
    private final C1717n5 f2010a;

    /* renamed from: b */
    private final String f2011b;
    @Nullable

    /* renamed from: c */
    private String f2012c;
    @Nullable

    /* renamed from: d */
    private String f2013d;
    @Nullable

    /* renamed from: e */
    private String f2014e;
    @Nullable

    /* renamed from: f */
    private String f2015f;

    /* renamed from: g */
    private long f2016g;

    /* renamed from: h */
    private long f2017h;

    /* renamed from: i */
    private long f2018i;
    @Nullable

    /* renamed from: j */
    private String f2019j;

    /* renamed from: k */
    private long f2020k;
    @Nullable

    /* renamed from: l */
    private String f2021l;

    /* renamed from: m */
    private long f2022m;

    /* renamed from: n */
    private long f2023n;

    /* renamed from: o */
    private boolean f2024o;

    /* renamed from: p */
    private long f2025p;

    /* renamed from: q */
    private boolean f2026q;
    @Nullable

    /* renamed from: r */
    private String f2027r;
    @Nullable

    /* renamed from: s */
    private Boolean f2028s;

    /* renamed from: t */
    private long f2029t;
    @Nullable

    /* renamed from: u */
    private List f2030u;
    @Nullable

    /* renamed from: v */
    private String f2031v;

    /* renamed from: w */
    private long f2032w;

    /* renamed from: x */
    private long f2033x;

    /* renamed from: y */
    private long f2034y;

    /* renamed from: z */
    private long f2035z;

    @WorkerThread
    C1589d6(C1717n5 n5Var, String str) {
        C0917i.m1419j(n5Var);
        C0917i.m1415f(str);
        this.f2010a = n5Var;
        this.f2011b = str;
        n5Var.mo14227a().mo14009h();
    }

    @WorkerThread
    /* renamed from: A */
    public final long mo14054A() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2025p;
    }

    @WorkerThread
    /* renamed from: B */
    public final void mo14055B(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2018i != j;
        this.f2018i = j;
    }

    @WorkerThread
    /* renamed from: C */
    public final void mo14056C(long j) {
        boolean z = true;
        C0917i.m1410a(j >= 0);
        this.f2010a.mo14227a().mo14009h();
        boolean z2 = this.f2007D;
        if (this.f2016g == j) {
            z = false;
        }
        this.f2007D = z | z2;
        this.f2016g = j;
    }

    @WorkerThread
    /* renamed from: D */
    public final void mo14057D(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2017h != j;
        this.f2017h = j;
    }

    @WorkerThread
    /* renamed from: E */
    public final void mo14058E(boolean z) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2024o != z;
        this.f2024o = z;
    }

    @WorkerThread
    /* renamed from: F */
    public final void mo14059F(@Nullable Boolean bool) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= !C1588d5.m4107a(this.f2028s, bool);
        this.f2028s = bool;
    }

    @WorkerThread
    /* renamed from: G */
    public final void mo14060G(@Nullable String str) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= !C1588d5.m4107a(this.f2014e, str);
        this.f2014e = str;
    }

    @WorkerThread
    /* renamed from: H */
    public final void mo14061H(@Nullable List list) {
        this.f2010a.mo14227a().mo14009h();
        if (!C1588d5.m4107a(this.f2030u, list)) {
            this.f2007D = true;
            this.f2030u = list != null ? new ArrayList(list) : null;
        }
    }

    @WorkerThread
    /* renamed from: I */
    public final void mo14062I(@Nullable String str) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= !C1588d5.m4107a(this.f2031v, str);
        this.f2031v = str;
    }

    @WorkerThread
    /* renamed from: J */
    public final boolean mo14063J() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2026q;
    }

    @WorkerThread
    /* renamed from: K */
    public final boolean mo14064K() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2024o;
    }

    @WorkerThread
    /* renamed from: L */
    public final boolean mo14065L() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2007D;
    }

    @WorkerThread
    /* renamed from: M */
    public final long mo14066M() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2020k;
    }

    @WorkerThread
    /* renamed from: N */
    public final long mo14067N() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2008E;
    }

    @WorkerThread
    /* renamed from: O */
    public final long mo14068O() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2035z;
    }

    @WorkerThread
    /* renamed from: P */
    public final long mo14069P() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2004A;
    }

    @WorkerThread
    /* renamed from: Q */
    public final long mo14070Q() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2034y;
    }

    @WorkerThread
    /* renamed from: R */
    public final long mo14071R() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2033x;
    }

    @WorkerThread
    /* renamed from: S */
    public final long mo14072S() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2005B;
    }

    @WorkerThread
    /* renamed from: T */
    public final long mo14073T() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2032w;
    }

    @WorkerThread
    /* renamed from: U */
    public final long mo14074U() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2023n;
    }

    @WorkerThread
    /* renamed from: V */
    public final long mo14075V() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2029t;
    }

    @WorkerThread
    /* renamed from: W */
    public final long mo14076W() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2009F;
    }

    @WorkerThread
    /* renamed from: X */
    public final long mo14077X() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2022m;
    }

    @WorkerThread
    /* renamed from: Y */
    public final long mo14078Y() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2018i;
    }

    @WorkerThread
    /* renamed from: Z */
    public final long mo14079Z() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2016g;
    }

    @WorkerThread
    @Nullable
    /* renamed from: a */
    public final String mo14080a() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2014e;
    }

    @WorkerThread
    /* renamed from: a0 */
    public final long mo14081a0() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2017h;
    }

    @WorkerThread
    @Nullable
    /* renamed from: b */
    public final String mo14082b() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2031v;
    }

    @WorkerThread
    @Nullable
    /* renamed from: b0 */
    public final Boolean mo14083b0() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2028s;
    }

    @WorkerThread
    @Nullable
    /* renamed from: c */
    public final List mo14084c() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2030u;
    }

    @WorkerThread
    @Nullable
    /* renamed from: c0 */
    public final String mo14085c0() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2027r;
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo14086d() {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D = false;
    }

    @WorkerThread
    @Nullable
    /* renamed from: d0 */
    public final String mo14087d0() {
        this.f2010a.mo14227a().mo14009h();
        String str = this.f2006C;
        mo14116z((String) null);
        return str;
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo14088e() {
        this.f2010a.mo14227a().mo14009h();
        long j = this.f2016g + 1;
        if (j > 2147483647L) {
            this.f2010a.mo14228b().mo14040w().mo14694b("Bundle index overflow. appId", C1574c4.m4083z(this.f2011b));
            j = 0;
        }
        this.f2007D = true;
        this.f2016g = j;
    }

    @WorkerThread
    /* renamed from: e0 */
    public final String mo14089e0() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2011b;
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo14090f(@Nullable String str) {
        this.f2010a.mo14227a().mo14009h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f2007D |= true ^ C1588d5.m4107a(this.f2027r, str);
        this.f2027r = str;
    }

    @WorkerThread
    @Nullable
    /* renamed from: f0 */
    public final String mo14091f0() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2012c;
    }

    @WorkerThread
    /* renamed from: g */
    public final void mo14092g(boolean z) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2026q != z;
        this.f2026q = z;
    }

    @WorkerThread
    @Nullable
    /* renamed from: g0 */
    public final String mo14093g0() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2021l;
    }

    @WorkerThread
    /* renamed from: h */
    public final void mo14094h(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2025p != j;
        this.f2025p = j;
    }

    @WorkerThread
    @Nullable
    /* renamed from: h0 */
    public final String mo14095h0() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2019j;
    }

    @WorkerThread
    /* renamed from: i */
    public final void mo14096i(@Nullable String str) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= !C1588d5.m4107a(this.f2012c, str);
        this.f2012c = str;
    }

    @WorkerThread
    @Nullable
    /* renamed from: i0 */
    public final String mo14097i0() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2015f;
    }

    @WorkerThread
    /* renamed from: j */
    public final void mo14098j(@Nullable String str) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= !C1588d5.m4107a(this.f2021l, str);
        this.f2021l = str;
    }

    @WorkerThread
    @Nullable
    /* renamed from: j0 */
    public final String mo14099j0() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2013d;
    }

    @WorkerThread
    /* renamed from: k */
    public final void mo14100k(@Nullable String str) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= !C1588d5.m4107a(this.f2019j, str);
        this.f2019j = str;
    }

    @WorkerThread
    @Nullable
    /* renamed from: k0 */
    public final String mo14101k0() {
        this.f2010a.mo14227a().mo14009h();
        return this.f2006C;
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo14102l(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2020k != j;
        this.f2020k = j;
    }

    @WorkerThread
    /* renamed from: m */
    public final void mo14103m(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2008E != j;
        this.f2008E = j;
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo14104n(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2035z != j;
        this.f2035z = j;
    }

    @WorkerThread
    /* renamed from: o */
    public final void mo14105o(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2004A != j;
        this.f2004A = j;
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo14106p(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2034y != j;
        this.f2034y = j;
    }

    @WorkerThread
    /* renamed from: q */
    public final void mo14107q(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2033x != j;
        this.f2033x = j;
    }

    @WorkerThread
    /* renamed from: r */
    public final void mo14108r(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2005B != j;
        this.f2005B = j;
    }

    @WorkerThread
    /* renamed from: s */
    public final void mo14109s(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2032w != j;
        this.f2032w = j;
    }

    @WorkerThread
    /* renamed from: t */
    public final void mo14110t(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2023n != j;
        this.f2023n = j;
    }

    @WorkerThread
    /* renamed from: u */
    public final void mo14111u(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2029t != j;
        this.f2029t = j;
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo14112v(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2009F != j;
        this.f2009F = j;
    }

    @WorkerThread
    /* renamed from: w */
    public final void mo14113w(@Nullable String str) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= !C1588d5.m4107a(this.f2015f, str);
        this.f2015f = str;
    }

    @WorkerThread
    /* renamed from: x */
    public final void mo14114x(@Nullable String str) {
        this.f2010a.mo14227a().mo14009h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f2007D |= true ^ C1588d5.m4107a(this.f2013d, str);
        this.f2013d = str;
    }

    @WorkerThread
    /* renamed from: y */
    public final void mo14115y(long j) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= this.f2022m != j;
        this.f2022m = j;
    }

    @WorkerThread
    /* renamed from: z */
    public final void mo14116z(@Nullable String str) {
        this.f2010a.mo14227a().mo14009h();
        this.f2007D |= !C1588d5.m4107a(this.f2006C, str);
        this.f2006C = str;
    }
}
