package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t3 */
public final class C1313t3 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1313t3 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private C1254p8 zzi = C1174k8.m2150r();
    private C1254p8 zzj = C1174k8.m2150r();
    /* access modifiers changed from: private */
    public C1254p8 zzk = C1174k8.m2150r();
    private String zzl = "";
    private boolean zzm;
    private C1254p8 zzn = C1174k8.m2150r();
    private C1254p8 zzo = C1174k8.m2150r();
    private String zzp = "";

    static {
        C1313t3 t3Var = new C1313t3();
        zza = t3Var;
        C1174k8.m2154v(C1313t3.class, t3Var);
    }

    private C1313t3() {
    }

    /* renamed from: C */
    public static C1297s3 m2984C() {
        return (C1297s3) zza.mo12915k();
    }

    /* renamed from: E */
    public static C1313t3 m2986E() {
        return zza;
    }

    /* renamed from: L */
    static /* synthetic */ void m2987L(C1313t3 t3Var, int i, C1281r3 r3Var) {
        r3Var.getClass();
        C1254p8 p8Var = t3Var.zzj;
        if (!p8Var.mo13072E()) {
            t3Var.zzj = C1174k8.m2151s(p8Var);
        }
        t3Var.zzj.set(i, r3Var);
    }

    /* renamed from: A */
    public final C1281r3 mo13369A(int i) {
        return (C1281r3) this.zzj.get(i);
    }

    /* renamed from: F */
    public final String mo13370F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String mo13371G() {
        return this.zzp;
    }

    /* renamed from: H */
    public final List mo13372H() {
        return this.zzk;
    }

    /* renamed from: I */
    public final List mo13373I() {
        return this.zzo;
    }

    /* renamed from: J */
    public final List mo13374J() {
        return this.zzn;
    }

    /* renamed from: K */
    public final List mo13375K() {
        return this.zzi;
    }

    /* renamed from: N */
    public final boolean mo13376N() {
        return this.zzm;
    }

    /* renamed from: O */
    public final boolean mo13377O() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: P */
    public final boolean mo13378P() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C1373x3.class, "zzj", C1281r3.class, "zzk", C1342v2.class, "zzl", "zzm", "zzn", C1139i5.class, "zzo", C1249p3.class, "zzp"});
        } else if (i2 == 3) {
            return new C1313t3();
        } else {
            if (i2 == 4) {
                return new C1297s3((C1201m3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo13379x() {
        return this.zzn.size();
    }

    /* renamed from: y */
    public final int mo13380y() {
        return this.zzj.size();
    }

    /* renamed from: z */
    public final long mo13381z() {
        return this.zzf;
    }
}
