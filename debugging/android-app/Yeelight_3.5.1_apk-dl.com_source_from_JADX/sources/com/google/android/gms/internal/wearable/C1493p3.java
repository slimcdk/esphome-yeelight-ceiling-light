package com.google.android.gms.internal.wearable;

import java.util.List;

/* renamed from: com.google.android.gms.internal.wearable.p3 */
public final class C1493p3 extends C1480n0<C1493p3, C1488o3> implements C1491p1 {
    /* access modifiers changed from: private */
    public static final C1493p3 zzt;
    private int zzb;
    private zzau zze = zzau.zzb;
    private String zzf = "";
    private double zzg;
    private float zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private C1515u0<C1503r3> zzm = C1480n0.m3625s();
    private C1515u0<C1498q3> zzn = C1480n0.m3625s();
    private C1515u0<String> zzo = C1480n0.m3625s();
    private C1510t0 zzp = C1480n0.m3623q();
    private C1505s0 zzq = C1480n0.m3624r();
    private long zzr;
    private byte zzs = 2;

    static {
        C1493p3 p3Var = new C1493p3();
        zzt = p3Var;
        C1480n0.m3620n(C1493p3.class, p3Var);
    }

    private C1493p3() {
    }

    /* renamed from: B */
    static /* synthetic */ void m3694B(C1493p3 p3Var, Iterable iterable) {
        C1505s0 s0Var = p3Var.zzq;
        if (!s0Var.zza()) {
            int size = s0Var.size();
            p3Var.zzq = s0Var.mo13656i(size == 0 ? 10 : size + size);
        }
        C1439f.m3521i(iterable, p3Var.zzq);
    }

    /* renamed from: C */
    static /* synthetic */ void m3695C(C1493p3 p3Var, long j) {
        p3Var.zzb |= 256;
        p3Var.zzr = j;
    }

    /* renamed from: U */
    public static C1488o3 m3696U() {
        return (C1488o3) zzt.mo13718k();
    }

    /* renamed from: V */
    public static C1493p3 m3697V() {
        return zzt;
    }

    /* renamed from: X */
    static /* synthetic */ void m3699X(C1493p3 p3Var, zzau zzau) {
        p3Var.zzb |= 1;
        p3Var.zze = zzau;
    }

    /* renamed from: Y */
    static /* synthetic */ void m3700Y(C1493p3 p3Var, String str) {
        p3Var.zzb |= 2;
        p3Var.zzf = str;
    }

    /* renamed from: Z */
    static /* synthetic */ void m3701Z(C1493p3 p3Var, double d) {
        p3Var.zzb |= 4;
        p3Var.zzg = d;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m3702a0(C1493p3 p3Var, float f) {
        p3Var.zzb |= 8;
        p3Var.zzh = f;
    }

    /* renamed from: b0 */
    static /* synthetic */ void m3703b0(C1493p3 p3Var, long j) {
        p3Var.zzb |= 16;
        p3Var.zzi = j;
    }

    /* renamed from: c0 */
    static /* synthetic */ void m3704c0(C1493p3 p3Var, int i) {
        p3Var.zzb |= 32;
        p3Var.zzj = i;
    }

    /* renamed from: d0 */
    static /* synthetic */ void m3705d0(C1493p3 p3Var, int i) {
        p3Var.zzb |= 64;
        p3Var.zzk = i;
    }

    /* renamed from: e0 */
    static /* synthetic */ void m3706e0(C1493p3 p3Var, boolean z) {
        p3Var.zzb |= 128;
        p3Var.zzl = z;
    }

    /* renamed from: w */
    static /* synthetic */ void m3707w(C1493p3 p3Var, Iterable iterable) {
        C1515u0<C1503r3> u0Var = p3Var.zzm;
        if (!u0Var.zza()) {
            p3Var.zzm = C1480n0.m3626t(u0Var);
        }
        C1439f.m3521i(iterable, p3Var.zzm);
    }

    /* renamed from: x */
    static /* synthetic */ void m3708x(C1493p3 p3Var, C1498q3 q3Var) {
        q3Var.getClass();
        C1515u0<C1498q3> u0Var = p3Var.zzn;
        if (!u0Var.zza()) {
            p3Var.zzn = C1480n0.m3626t(u0Var);
        }
        p3Var.zzn.add(q3Var);
    }

    /* renamed from: y */
    static /* synthetic */ void m3709y(C1493p3 p3Var, Iterable iterable) {
        C1515u0<String> u0Var = p3Var.zzo;
        if (!u0Var.zza()) {
            p3Var.zzo = C1480n0.m3626t(u0Var);
        }
        C1439f.m3521i(iterable, p3Var.zzo);
    }

    /* renamed from: z */
    static /* synthetic */ void m3710z(C1493p3 p3Var, Iterable iterable) {
        C1510t0 t0Var = p3Var.zzp;
        if (!t0Var.zza()) {
            int size = t0Var.size();
            p3Var.zzp = t0Var.mo13613k(size == 0 ? 10 : size + size);
        }
        C1439f.m3521i(iterable, p3Var.zzp);
    }

    /* renamed from: D */
    public final zzau mo13764D() {
        return this.zze;
    }

    /* renamed from: E */
    public final String mo13765E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final double mo13766F() {
        return this.zzg;
    }

    /* renamed from: H */
    public final float mo13767H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final long mo13768I() {
        return this.zzi;
    }

    /* renamed from: J */
    public final int mo13769J() {
        return this.zzj;
    }

    /* renamed from: L */
    public final int mo13770L() {
        return this.zzk;
    }

    /* renamed from: M */
    public final boolean mo13771M() {
        return this.zzl;
    }

    /* renamed from: N */
    public final List<C1503r3> mo13772N() {
        return this.zzm;
    }

    /* renamed from: O */
    public final List<C1498q3> mo13773O() {
        return this.zzn;
    }

    /* renamed from: P */
    public final int mo13774P() {
        return this.zzn.size();
    }

    /* renamed from: Q */
    public final List<String> mo13775Q() {
        return this.zzo;
    }

    /* renamed from: R */
    public final List<Long> mo13776R() {
        return this.zzp;
    }

    /* renamed from: S */
    public final List<Float> mo13777S() {
        return this.zzq;
    }

    /* renamed from: T */
    public final long mo13778T() {
        return this.zzr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo13717j(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzs);
        }
        byte b = 1;
        if (i2 == 2) {
            return C1480n0.m3621o(zzt, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", C1503r3.class, "zzn", C1498q3.class, "zzo", "zzp", "zzr", "zzq"});
        } else if (i2 == 3) {
            return new C1493p3();
        } else {
            if (i2 == 4) {
                return new C1488o3((C1458i3) null);
            }
            if (i2 == 5) {
                return zzt;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzs = b;
            return null;
        }
    }
}
