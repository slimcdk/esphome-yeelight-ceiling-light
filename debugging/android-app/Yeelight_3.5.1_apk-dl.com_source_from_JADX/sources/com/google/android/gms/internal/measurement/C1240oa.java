package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.oa */
public final class C1240oa {

    /* renamed from: f */
    private static final C1240oa f1478f = new C1240oa(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f1479a;

    /* renamed from: b */
    private int[] f1480b;

    /* renamed from: c */
    private Object[] f1481c;

    /* renamed from: d */
    private int f1482d;

    /* renamed from: e */
    private boolean f1483e;

    private C1240oa() {
        this(0, new int[8], new Object[8], true);
    }

    private C1240oa(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f1482d = -1;
        this.f1479a = i;
        this.f1480b = iArr;
        this.f1481c = objArr;
        this.f1483e = z;
    }

    /* renamed from: c */
    public static C1240oa m2413c() {
        return f1478f;
    }

    /* renamed from: d */
    static C1240oa m2414d(C1240oa oaVar, C1240oa oaVar2) {
        int i = oaVar.f1479a + oaVar2.f1479a;
        int[] copyOf = Arrays.copyOf(oaVar.f1480b, i);
        System.arraycopy(oaVar2.f1480b, 0, copyOf, oaVar.f1479a, oaVar2.f1479a);
        Object[] copyOf2 = Arrays.copyOf(oaVar.f1481c, i);
        System.arraycopy(oaVar2.f1481c, 0, copyOf2, oaVar.f1479a, oaVar2.f1479a);
        return new C1240oa(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    static C1240oa m2415e() {
        return new C1240oa(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo13050a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f1482d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f1479a; i6++) {
            int i7 = this.f1480b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f1481c[i6]).longValue();
                    i = C1301s7.m2904a(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int a = C1301s7.m2904a(i8 << 3);
                    int zzd = ((zzjb) this.f1481c[i6]).zzd();
                    i5 += a + C1301s7.m2904a(zzd) + zzd;
                } else if (i9 == 3) {
                    int D = C1301s7.m2903D(i8);
                    i3 = D + D;
                    i2 = ((C1240oa) this.f1481c[i6]).mo13050a();
                } else if (i9 == 5) {
                    ((Integer) this.f1481c[i6]).intValue();
                    i = C1301s7.m2904a(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzkm.zza());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f1481c[i6]).longValue();
                i3 = C1301s7.m2904a(i8 << 3);
                i2 = C1301s7.m2905b(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f1482d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo13051b() {
        int i = this.f1482d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f1479a; i3++) {
            int i4 = this.f1480b[i3];
            int a = C1301s7.m2904a(8);
            int zzd = ((zzjb) this.f1481c[i3]).zzd();
            i2 += a + a + C1301s7.m2904a(16) + C1301s7.m2904a(i4 >>> 3) + C1301s7.m2904a(24) + C1301s7.m2904a(zzd) + zzd;
        }
        this.f1482d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1240oa)) {
            return false;
        }
        C1240oa oaVar = (C1240oa) obj;
        int i = this.f1479a;
        if (i == oaVar.f1479a) {
            int[] iArr = this.f1480b;
            int[] iArr2 = oaVar.f1480b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f1481c;
                    Object[] objArr2 = oaVar.f1481c;
                    int i3 = this.f1479a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo13053f() {
        this.f1483e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo13054g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f1479a; i2++) {
            C1223n9.m2325b(sb, i, String.valueOf(this.f1480b[i2] >>> 3), this.f1481c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo13055h(int i, Object obj) {
        if (this.f1483e) {
            int i2 = this.f1479a;
            int[] iArr = this.f1480b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f1480b = Arrays.copyOf(iArr, i3);
                this.f1481c = Arrays.copyOf(this.f1481c, i3);
            }
            int[] iArr2 = this.f1480b;
            int i4 = this.f1479a;
            iArr2[i4] = i;
            this.f1481c[i4] = obj;
            this.f1479a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f1479a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f1480b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f1481c;
        int i7 = this.f1479a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo13057i(C1065db dbVar) {
        if (this.f1479a != 0) {
            for (int i = 0; i < this.f1479a; i++) {
                int i2 = this.f1480b[i];
                Object obj = this.f1481c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    dbVar.mo12686j(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    dbVar.mo12672F(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    dbVar.mo12683g(i3, (zzjb) obj);
                } else if (i4 == 3) {
                    dbVar.mo12670D(i3);
                    ((C1240oa) obj).mo13057i(dbVar);
                    dbVar.mo12676J(i3);
                } else if (i4 == 5) {
                    dbVar.mo12681e(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkm.zza());
                }
            }
        }
    }
}
