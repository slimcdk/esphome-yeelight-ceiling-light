package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s4 */
public final class C1298s4 extends C1174k8 implements C1207m9 {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final C1298s4 zze;
    private boolean zzA;
    private String zzB = "";
    private long zzC;
    private int zzD;
    private String zzE = "";
    private String zzF = "";
    private boolean zzG;
    /* access modifiers changed from: private */
    public C1254p8 zzH = C1174k8.m2150r();
    private String zzI = "";
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM = "";
    private long zzN;
    private long zzO;
    private String zzP = "";
    private String zzQ = "";
    private int zzR;
    private String zzS = "";
    private C1344v4 zzT;
    private C1222n8 zzU = C1174k8.m2147o();
    private long zzV;
    private long zzW;
    private String zzX = "";
    private String zzY = "";
    private int zzZ;
    private boolean zzaa;
    private String zzab = "";
    private boolean zzac;
    private C1218n4 zzad;
    private String zzae = "";
    private C1254p8 zzaf = C1174k8.m2150r();
    private String zzag = "";
    private int zzf;
    private int zzg;
    private int zzh;
    /* access modifiers changed from: private */
    public C1254p8 zzi = C1174k8.m2150r();
    private C1254p8 zzj = C1174k8.m2150r();
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private int zzt;
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private long zzx;
    private long zzy;
    private String zzz = "";

    static {
        C1298s4 s4Var = new C1298s4();
        zze = s4Var;
        C1174k8.m2154v(C1298s4.class, s4Var);
    }

    private C1298s4() {
    }

    /* renamed from: A0 */
    static /* synthetic */ void m2772A0(C1298s4 s4Var, String str) {
        s4Var.zzg |= 128;
        s4Var.zzY = str;
    }

    /* renamed from: B0 */
    static /* synthetic */ void m2773B0(C1298s4 s4Var, Iterable iterable) {
        s4Var.m2814c1();
        C1391y6.m3298h(iterable, s4Var.zzi);
    }

    /* renamed from: C0 */
    static /* synthetic */ void m2774C0(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzg |= 8192;
        s4Var.zzae = str;
    }

    /* renamed from: D0 */
    static /* synthetic */ void m2775D0(C1298s4 s4Var) {
        s4Var.zzg &= -8193;
        s4Var.zzae = zze.zzae;
    }

    /* renamed from: E0 */
    static /* synthetic */ void m2776E0(C1298s4 s4Var, Iterable iterable) {
        C1254p8 p8Var = s4Var.zzaf;
        if (!p8Var.mo13072E()) {
            s4Var.zzaf = C1174k8.m2151s(p8Var);
        }
        C1391y6.m3298h(iterable, s4Var.zzaf);
    }

    /* renamed from: G0 */
    static /* synthetic */ void m2778G0(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzg |= 16384;
        s4Var.zzag = str;
    }

    /* renamed from: H0 */
    static /* synthetic */ void m2779H0(C1298s4 s4Var, int i) {
        s4Var.m2814c1();
        s4Var.zzi.remove(i);
    }

    /* renamed from: I0 */
    static /* synthetic */ void m2780I0(C1298s4 s4Var, int i, C1027b5 b5Var) {
        b5Var.getClass();
        s4Var.m2816d1();
        s4Var.zzj.set(i, b5Var);
    }

    /* renamed from: J0 */
    static /* synthetic */ void m2781J0(C1298s4 s4Var, C1027b5 b5Var) {
        b5Var.getClass();
        s4Var.m2816d1();
        s4Var.zzj.add(b5Var);
    }

    /* renamed from: K0 */
    static /* synthetic */ void m2782K0(C1298s4 s4Var, Iterable iterable) {
        s4Var.m2816d1();
        C1391y6.m3298h(iterable, s4Var.zzj);
    }

    /* renamed from: L0 */
    static /* synthetic */ void m2783L0(C1298s4 s4Var, int i) {
        s4Var.m2816d1();
        s4Var.zzj.remove(i);
    }

    /* renamed from: M0 */
    static /* synthetic */ void m2784M0(C1298s4 s4Var, long j) {
        s4Var.zzf |= 2;
        s4Var.zzk = j;
    }

    /* renamed from: N0 */
    static /* synthetic */ void m2785N0(C1298s4 s4Var, long j) {
        s4Var.zzf |= 4;
        s4Var.zzl = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m2786O(C1298s4 s4Var, long j) {
        s4Var.zzf |= BasicMeasure.EXACTLY;
        s4Var.zzO = j;
    }

    /* renamed from: O0 */
    static /* synthetic */ void m2787O0(C1298s4 s4Var, long j) {
        s4Var.zzf |= 8;
        s4Var.zzm = j;
    }

    /* renamed from: P */
    static /* synthetic */ void m2788P(C1298s4 s4Var) {
        s4Var.zzf &= ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        s4Var.zzP = zze.zzP;
    }

    /* renamed from: P0 */
    static /* synthetic */ void m2789P0(C1298s4 s4Var, long j) {
        s4Var.zzf |= 16;
        s4Var.zzn = j;
    }

    /* renamed from: P1 */
    public static C1282r4 m2790P1() {
        return (C1282r4) zze.mo12915k();
    }

    /* renamed from: Q */
    static /* synthetic */ void m2791Q(C1298s4 s4Var, int i) {
        s4Var.zzg |= 2;
        s4Var.zzR = i;
    }

    /* renamed from: Q0 */
    static /* synthetic */ void m2792Q0(C1298s4 s4Var) {
        s4Var.zzf &= -17;
        s4Var.zzn = 0;
    }

    /* renamed from: R */
    static /* synthetic */ void m2794R(C1298s4 s4Var, int i, C1122h4 h4Var) {
        h4Var.getClass();
        s4Var.m2814c1();
        s4Var.zzi.set(i, h4Var);
    }

    /* renamed from: R0 */
    static /* synthetic */ void m2795R0(C1298s4 s4Var, long j) {
        s4Var.zzf |= 32;
        s4Var.zzo = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m2796S(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzg |= 4;
        s4Var.zzS = str;
    }

    /* renamed from: S0 */
    static /* synthetic */ void m2797S0(C1298s4 s4Var) {
        s4Var.zzf &= -33;
        s4Var.zzo = 0;
    }

    /* renamed from: T */
    static /* synthetic */ void m2798T(C1298s4 s4Var, C1344v4 v4Var) {
        v4Var.getClass();
        s4Var.zzT = v4Var;
        s4Var.zzg |= 8;
    }

    /* renamed from: T0 */
    static /* synthetic */ void m2799T0(C1298s4 s4Var, String str) {
        s4Var.zzf |= 64;
        s4Var.zzp = "android";
    }

    /* renamed from: U */
    static /* synthetic */ void m2800U(C1298s4 s4Var, Iterable iterable) {
        C1222n8 n8Var = s4Var.zzU;
        if (!n8Var.mo13072E()) {
            int size = n8Var.size();
            s4Var.zzU = n8Var.mo12970p(size == 0 ? 10 : size + size);
        }
        C1391y6.m3298h(iterable, s4Var.zzU);
    }

    /* renamed from: U0 */
    static /* synthetic */ void m2801U0(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 128;
        s4Var.zzq = str;
    }

    /* renamed from: V */
    static /* synthetic */ void m2802V(C1298s4 s4Var, C1122h4 h4Var) {
        h4Var.getClass();
        s4Var.m2814c1();
        s4Var.zzi.add(h4Var);
    }

    /* renamed from: W */
    static /* synthetic */ void m2803W(C1298s4 s4Var, long j) {
        s4Var.zzg |= 16;
        s4Var.zzV = j;
    }

    /* renamed from: W0 */
    static /* synthetic */ void m2804W0(C1298s4 s4Var) {
        s4Var.zzf &= -129;
        s4Var.zzq = zze.zzq;
    }

    /* renamed from: X */
    static /* synthetic */ void m2805X(C1298s4 s4Var, long j) {
        s4Var.zzg |= 32;
        s4Var.zzW = j;
    }

    /* renamed from: X0 */
    static /* synthetic */ void m2806X0(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 256;
        s4Var.zzr = str;
    }

    /* renamed from: Y0 */
    static /* synthetic */ void m2807Y0(C1298s4 s4Var) {
        s4Var.zzf &= -257;
        s4Var.zzr = zze.zzr;
    }

    /* renamed from: Z */
    static /* synthetic */ void m2808Z(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 2048;
        s4Var.zzu = str;
    }

    /* renamed from: Z0 */
    static /* synthetic */ void m2809Z0(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 512;
        s4Var.zzs = str;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m2810a0(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 4096;
        s4Var.zzv = str;
    }

    /* renamed from: a1 */
    static /* synthetic */ void m2811a1(C1298s4 s4Var, int i) {
        s4Var.zzf |= 1024;
        s4Var.zzt = i;
    }

    /* renamed from: b0 */
    static /* synthetic */ void m2812b0(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 8192;
        s4Var.zzw = str;
    }

    /* renamed from: c0 */
    static /* synthetic */ void m2813c0(C1298s4 s4Var, long j) {
        s4Var.zzf |= 16384;
        s4Var.zzx = j;
    }

    /* renamed from: c1 */
    private final void m2814c1() {
        C1254p8 p8Var = this.zzi;
        if (!p8Var.mo13072E()) {
            this.zzi = C1174k8.m2151s(p8Var);
        }
    }

    /* renamed from: d0 */
    static /* synthetic */ void m2815d0(C1298s4 s4Var, long j) {
        s4Var.zzf |= 32768;
        s4Var.zzy = 64000;
    }

    /* renamed from: d1 */
    private final void m2816d1() {
        C1254p8 p8Var = this.zzj;
        if (!p8Var.mo13072E()) {
            this.zzj = C1174k8.m2151s(p8Var);
        }
    }

    /* renamed from: e0 */
    static /* synthetic */ void m2817e0(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 65536;
        s4Var.zzz = str;
    }

    /* renamed from: f0 */
    static /* synthetic */ void m2818f0(C1298s4 s4Var) {
        s4Var.zzf &= -65537;
        s4Var.zzz = zze.zzz;
    }

    /* renamed from: g0 */
    static /* synthetic */ void m2819g0(C1298s4 s4Var, boolean z) {
        s4Var.zzf |= 131072;
        s4Var.zzA = z;
    }

    /* renamed from: h0 */
    static /* synthetic */ void m2820h0(C1298s4 s4Var) {
        s4Var.zzf &= -131073;
        s4Var.zzA = false;
    }

    /* renamed from: i0 */
    static /* synthetic */ void m2821i0(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 262144;
        s4Var.zzB = str;
    }

    /* renamed from: j0 */
    static /* synthetic */ void m2822j0(C1298s4 s4Var) {
        s4Var.zzf &= -262145;
        s4Var.zzB = zze.zzB;
    }

    /* renamed from: k0 */
    static /* synthetic */ void m2823k0(C1298s4 s4Var, long j) {
        s4Var.zzf |= 524288;
        s4Var.zzC = j;
    }

    /* renamed from: l0 */
    static /* synthetic */ void m2824l0(C1298s4 s4Var, int i) {
        s4Var.zzf |= 1048576;
        s4Var.zzD = i;
    }

    /* renamed from: m0 */
    static /* synthetic */ void m2825m0(C1298s4 s4Var, String str) {
        s4Var.zzf |= 2097152;
        s4Var.zzE = str;
    }

    /* renamed from: n0 */
    static /* synthetic */ void m2826n0(C1298s4 s4Var) {
        s4Var.zzf &= -2097153;
        s4Var.zzE = zze.zzE;
    }

    /* renamed from: o0 */
    static /* synthetic */ void m2827o0(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 4194304;
        s4Var.zzF = str;
    }

    /* renamed from: p0 */
    static /* synthetic */ void m2828p0(C1298s4 s4Var, boolean z) {
        s4Var.zzf |= 8388608;
        s4Var.zzG = z;
    }

    /* renamed from: q0 */
    static /* synthetic */ void m2829q0(C1298s4 s4Var, Iterable iterable) {
        C1254p8 p8Var = s4Var.zzH;
        if (!p8Var.mo13072E()) {
            s4Var.zzH = C1174k8.m2151s(p8Var);
        }
        C1391y6.m3298h(iterable, s4Var.zzH);
    }

    /* renamed from: s0 */
    static /* synthetic */ void m2831s0(C1298s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 16777216;
        s4Var.zzI = str;
    }

    /* renamed from: t0 */
    static /* synthetic */ void m2832t0(C1298s4 s4Var, int i) {
        s4Var.zzf |= 33554432;
        s4Var.zzJ = i;
    }

    /* renamed from: u0 */
    static /* synthetic */ void m2833u0(C1298s4 s4Var, int i) {
        s4Var.zzf |= 1;
        s4Var.zzh = 1;
    }

    /* renamed from: v0 */
    static /* synthetic */ void m2834v0(C1298s4 s4Var) {
        s4Var.zzf &= -268435457;
        s4Var.zzM = zze.zzM;
    }

    /* renamed from: w0 */
    static /* synthetic */ void m2835w0(C1298s4 s4Var, long j) {
        s4Var.zzf |= 536870912;
        s4Var.zzN = j;
    }

    /* renamed from: A */
    public final String mo13281A() {
        return this.zzr;
    }

    /* renamed from: A1 */
    public final int mo13282A1() {
        return this.zzR;
    }

    /* renamed from: B1 */
    public final int mo13283B1() {
        return this.zzt;
    }

    /* renamed from: C */
    public final String mo13284C() {
        return this.zzP;
    }

    /* renamed from: C1 */
    public final int mo13285C1() {
        return this.zzj.size();
    }

    /* renamed from: D */
    public final String mo13286D() {
        return this.zzI;
    }

    /* renamed from: D1 */
    public final long mo13287D1() {
        return this.zzO;
    }

    /* renamed from: E */
    public final String mo13288E() {
        return this.zzF;
    }

    /* renamed from: E1 */
    public final long mo13289E1() {
        return this.zzN;
    }

    /* renamed from: F */
    public final String mo13290F() {
        return this.zzE;
    }

    /* renamed from: F1 */
    public final long mo13291F1() {
        return this.zzC;
    }

    /* renamed from: G */
    public final String mo13292G() {
        return this.zzq;
    }

    /* renamed from: G1 */
    public final long mo13293G1() {
        return this.zzV;
    }

    /* renamed from: H */
    public final String mo13294H() {
        return this.zzp;
    }

    /* renamed from: H1 */
    public final long mo13295H1() {
        return this.zzm;
    }

    /* renamed from: I */
    public final String mo13296I() {
        return this.zzz;
    }

    /* renamed from: I1 */
    public final long mo13297I1() {
        return this.zzx;
    }

    /* renamed from: J */
    public final String mo13298J() {
        return this.zzae;
    }

    /* renamed from: J1 */
    public final long mo13299J1() {
        return this.zzo;
    }

    /* renamed from: K */
    public final String mo13300K() {
        return this.zzs;
    }

    /* renamed from: K1 */
    public final long mo13301K1() {
        return this.zzn;
    }

    /* renamed from: L */
    public final List mo13302L() {
        return this.zzH;
    }

    /* renamed from: L1 */
    public final long mo13303L1() {
        return this.zzl;
    }

    /* renamed from: M */
    public final List mo13304M() {
        return this.zzi;
    }

    /* renamed from: M1 */
    public final long mo13305M1() {
        return this.zzk;
    }

    /* renamed from: N */
    public final List mo13306N() {
        return this.zzj;
    }

    /* renamed from: N1 */
    public final long mo13307N1() {
        return this.zzy;
    }

    /* renamed from: O1 */
    public final C1122h4 mo13308O1(int i) {
        return (C1122h4) this.zzi.get(i);
    }

    /* renamed from: R1 */
    public final C1027b5 mo13309R1(int i) {
        return (C1027b5) this.zzj.get(i);
    }

    /* renamed from: S1 */
    public final String mo13310S1() {
        return this.zzS;
    }

    /* renamed from: T1 */
    public final String mo13311T1() {
        return this.zzv;
    }

    /* renamed from: U1 */
    public final String mo13312U1() {
        return this.zzB;
    }

    /* renamed from: Y */
    public final int mo13313Y() {
        return this.zzJ;
    }

    /* renamed from: b1 */
    public final int mo13314b1() {
        return this.zzD;
    }

    /* renamed from: e1 */
    public final boolean mo13315e1() {
        return (this.zzf & BasicMeasure.EXACTLY) != 0;
    }

    /* renamed from: f1 */
    public final boolean mo13316f1() {
        return (this.zzf & 33554432) != 0;
    }

    /* renamed from: g1 */
    public final boolean mo13317g1() {
        return (this.zzf & 1048576) != 0;
    }

    /* renamed from: h1 */
    public final boolean mo13318h1() {
        return (this.zzf & 536870912) != 0;
    }

    /* renamed from: i1 */
    public final boolean mo13319i1() {
        return (this.zzg & 128) != 0;
    }

    /* renamed from: j1 */
    public final boolean mo13320j1() {
        return (this.zzf & 524288) != 0;
    }

    /* renamed from: k1 */
    public final boolean mo13321k1() {
        return (this.zzg & 16) != 0;
    }

    /* renamed from: l1 */
    public final boolean mo13322l1() {
        return (this.zzf & 8) != 0;
    }

    /* renamed from: m1 */
    public final boolean mo13323m1() {
        return (this.zzf & 16384) != 0;
    }

    /* renamed from: n1 */
    public final boolean mo13324n1() {
        return (this.zzf & 131072) != 0;
    }

    /* renamed from: o1 */
    public final boolean mo13325o1() {
        return (this.zzf & 32) != 0;
    }

    /* renamed from: p1 */
    public final boolean mo13326p1() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: q1 */
    public final boolean mo13327q1() {
        return (this.zzf & 1) != 0;
    }

    /* renamed from: r1 */
    public final boolean mo13328r1() {
        return (this.zzg & 2) != 0;
    }

    /* renamed from: s1 */
    public final boolean mo13329s1() {
        return (this.zzf & 8388608) != 0;
    }

    /* renamed from: t1 */
    public final boolean mo13330t1() {
        return (this.zzg & 8192) != 0;
    }

    /* renamed from: u1 */
    public final boolean mo13331u1() {
        return (this.zzf & 4) != 0;
    }

    /* renamed from: v1 */
    public final boolean mo13332v1() {
        return (this.zzf & 1024) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", C1122h4.class, "zzj", C1027b5.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", C1058d4.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", C1403z3.f1739a, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        } else if (i2 == 3) {
            return new C1298s4();
        } else {
            if (i2 == 4) {
                return new C1282r4((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: w1 */
    public final boolean mo13333w1() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: x */
    public final String mo13334x() {
        return this.zzu;
    }

    /* renamed from: x0 */
    public final boolean mo13335x0() {
        return this.zzA;
    }

    /* renamed from: x1 */
    public final boolean mo13336x1() {
        return (this.zzf & 32768) != 0;
    }

    /* renamed from: y */
    public final String mo13337y() {
        return this.zzw;
    }

    /* renamed from: y0 */
    public final boolean mo13338y0() {
        return this.zzG;
    }

    /* renamed from: y1 */
    public final int mo13339y1() {
        return this.zzi.size();
    }

    /* renamed from: z */
    public final String mo13340z() {
        return this.zzY;
    }

    /* renamed from: z1 */
    public final int mo13341z1() {
        return this.zzh;
    }
}
