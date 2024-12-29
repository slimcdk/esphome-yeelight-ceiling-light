package com.google.android.gms.internal.wearable;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.connection.wifi.step.SmartConfigStep;

/* renamed from: com.google.android.gms.internal.wearable.j */
final class C1459j {
    /* renamed from: a */
    static int m3559a(byte[] bArr, int i, C1454i iVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m3560b(b, bArr, i2, iVar);
        }
        iVar.f1792a = b;
        return i2;
    }

    /* renamed from: b */
    static int m3560b(int i, byte[] bArr, int i2, C1454i iVar) {
        int i3;
        int i4;
        int i5 = i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << ParameterInitDefType.IntVec4Init;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << ParameterInitDefType.IntVec4Init);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] < 0) {
                                i8 = i10;
                            } else {
                                iVar.f1792a = i9;
                                return i10;
                            }
                        }
                    }
                }
            }
            iVar.f1792a = i7 | i3;
            return i8;
        }
        iVar.f1792a = i5 | i4;
        return i6;
    }

    /* renamed from: c */
    static int m3561c(byte[] bArr, int i, C1454i iVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
            int i4 = 7;
            while (b < 0) {
                int i5 = i3 + 1;
                byte b2 = bArr[i3];
                i4 += 7;
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
                int i6 = i5;
                b = b2;
                i3 = i6;
            }
            iVar.f1793b = j2;
            return i3;
        }
        iVar.f1793b = j;
        return i2;
    }

    /* renamed from: d */
    static int m3562d(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << ParameterInitDefType.ExternalSamplerInit);
    }

    /* renamed from: e */
    static long m3563e(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: f */
    static int m3564f(byte[] bArr, int i, C1454i iVar) {
        int a = m3559a(bArr, i, iVar);
        int i2 = iVar.f1792a;
        if (i2 < 0) {
            throw zzcc.zzc();
        } else if (i2 == 0) {
            iVar.f1794c = "";
            return a;
        } else {
            iVar.f1794c = new String(bArr, a, i2, C1524w0.f1867a);
            return a + i2;
        }
    }

    /* renamed from: g */
    static int m3565g(byte[] bArr, int i, C1454i iVar) {
        int a = m3559a(bArr, i, iVar);
        int i2 = iVar.f1792a;
        if (i2 < 0) {
            throw zzcc.zzc();
        } else if (i2 == 0) {
            iVar.f1794c = "";
            return a;
        } else {
            iVar.f1794c = C1428c3.m3497e(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: h */
    static int m3566h(byte[] bArr, int i, C1454i iVar) {
        int a = m3559a(bArr, i, iVar);
        int i2 = iVar.f1792a;
        if (i2 < 0) {
            throw zzcc.zzc();
        } else if (i2 > bArr.length - a) {
            throw zzcc.zzb();
        } else if (i2 == 0) {
            iVar.f1794c = zzau.zzb;
            return a;
        } else {
            iVar.f1794c = zzau.zzk(bArr, a, i2);
            return a + i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m3567i(com.google.android.gms.internal.wearable.C1417a2 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.wearable.C1454i r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m3560b(r8, r7, r0, r10)
            int r8 = r10.f1792a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zza()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo13580b(r1, r2, r3, r4, r5)
            r6.mo13584f(r9)
            r10.f1794c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.wearable.zzcc r6 = com.google.android.gms.internal.wearable.zzcc.zzb()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1459j.m3567i(com.google.android.gms.internal.wearable.a2, byte[], int, int, com.google.android.gms.internal.wearable.i):int");
    }

    /* renamed from: j */
    static int m3568j(C1417a2 a2Var, byte[] bArr, int i, int i2, int i3, C1454i iVar) {
        C1506s1 s1Var = (C1506s1) a2Var;
        Object zza = s1Var.zza();
        int D = s1Var.mo13793D(zza, bArr, i, i2, i3, iVar);
        s1Var.mo13584f(zza);
        iVar.f1794c = zza;
        return D;
    }

    /* renamed from: k */
    static int m3569k(int i, byte[] bArr, int i2, int i3, C1515u0<?> u0Var, C1454i iVar) {
        C1485o0 o0Var = (C1485o0) u0Var;
        int a = m3559a(bArr, i2, iVar);
        while (true) {
            o0Var.mo13736g(iVar.f1792a);
            if (a >= i3) {
                break;
            }
            int a2 = m3559a(bArr, a, iVar);
            if (i != iVar.f1792a) {
                break;
            }
            a = m3559a(bArr, a2, iVar);
        }
        return a;
    }

    /* renamed from: l */
    static int m3570l(byte[] bArr, int i, C1515u0<?> u0Var, C1454i iVar) {
        C1485o0 o0Var = (C1485o0) u0Var;
        int a = m3559a(bArr, i, iVar);
        int i2 = iVar.f1792a + a;
        while (a < i2) {
            a = m3559a(bArr, a, iVar);
            o0Var.mo13736g(iVar.f1792a);
        }
        if (a == i2) {
            return a;
        }
        throw zzcc.zzb();
    }

    /* renamed from: m */
    static int m3571m(C1417a2<?> a2Var, int i, byte[] bArr, int i2, int i3, C1515u0<?> u0Var, C1454i iVar) {
        int i4 = m3567i(a2Var, bArr, i2, i3, iVar);
        while (true) {
            u0Var.add(iVar.f1794c);
            if (i4 >= i3) {
                break;
            }
            int a = m3559a(bArr, i4, iVar);
            if (i != iVar.f1792a) {
                break;
            }
            i4 = m3567i(a2Var, bArr, a, i3, iVar);
        }
        return i4;
    }

    /* renamed from: n */
    static int m3572n(int i, byte[] bArr, int i2, int i3, C1487o2 o2Var, C1454i iVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int c = m3561c(bArr, i2, iVar);
                o2Var.mo13747h(i, Long.valueOf(iVar.f1793b));
                return c;
            } else if (i4 == 1) {
                o2Var.mo13747h(i, Long.valueOf(m3563e(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = m3559a(bArr, i2, iVar);
                int i5 = iVar.f1792a;
                if (i5 < 0) {
                    throw zzcc.zzc();
                } else if (i5 <= bArr.length - a) {
                    o2Var.mo13747h(i, i5 == 0 ? zzau.zzb : zzau.zzk(bArr, a, i5));
                    return a + i5;
                } else {
                    throw zzcc.zzb();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C1487o2 b = C1487o2.m3662b();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = m3559a(bArr, i2, iVar);
                    int i8 = iVar.f1792a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = a2;
                        break;
                    }
                    int n = m3572n(i7, bArr, a2, i3, b, iVar);
                    i7 = i8;
                    i2 = n;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzcc.zzf();
                }
                o2Var.mo13747h(i, b);
                return i2;
            } else if (i4 == 5) {
                o2Var.mo13747h(i, Integer.valueOf(m3562d(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzcc.zzd();
            }
        } else {
            throw zzcc.zzd();
        }
    }
}
