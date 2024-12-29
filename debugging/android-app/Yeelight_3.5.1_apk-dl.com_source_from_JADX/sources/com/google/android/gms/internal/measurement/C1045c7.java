package com.google.android.gms.internal.measurement;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.connection.wifi.step.SmartConfigStep;

/* renamed from: com.google.android.gms.internal.measurement.c7 */
final class C1045c7 {
    /* renamed from: a */
    static int m1754a(byte[] bArr, int i, C1029b7 b7Var) {
        int j = m1763j(bArr, i, b7Var);
        int i2 = b7Var.f1252a;
        if (i2 < 0) {
            throw zzkm.zzd();
        } else if (i2 > bArr.length - j) {
            throw zzkm.zzf();
        } else if (i2 == 0) {
            b7Var.f1254c = zzjb.zzb;
            return j;
        } else {
            b7Var.f1254c = zzjb.zzl(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m1755b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << ParameterInitDefType.ExternalSamplerInit);
    }

    /* renamed from: c */
    static int m1756c(C1364w9 w9Var, byte[] bArr, int i, int i2, int i3, C1029b7 b7Var) {
        C1239o9 o9Var = (C1239o9) w9Var;
        Object a = o9Var.mo13041a();
        int D = o9Var.mo13040D(a, bArr, i, i2, i3, b7Var);
        o9Var.mo13042b(a);
        b7Var.f1254c = a;
        return D;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m1757d(com.google.android.gms.internal.measurement.C1364w9 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.C1029b7 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m1764k(r8, r7, r0, r10)
            int r8 = r10.f1252a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo13041a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo13043c(r1, r2, r3, r4, r5)
            r6.mo13042b(r9)
            r10.f1254c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzkm r6 = com.google.android.gms.internal.measurement.zzkm.zzf()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1045c7.m1757d(com.google.android.gms.internal.measurement.w9, byte[], int, int, com.google.android.gms.internal.measurement.b7):int");
    }

    /* renamed from: e */
    static int m1758e(C1364w9 w9Var, int i, byte[] bArr, int i2, int i3, C1254p8 p8Var, C1029b7 b7Var) {
        int d = m1757d(w9Var, bArr, i2, i3, b7Var);
        while (true) {
            p8Var.add(b7Var.f1254c);
            if (d >= i3) {
                break;
            }
            int j = m1763j(bArr, d, b7Var);
            if (i != b7Var.f1252a) {
                break;
            }
            d = m1757d(w9Var, bArr, j, i3, b7Var);
        }
        return d;
    }

    /* renamed from: f */
    static int m1759f(byte[] bArr, int i, C1254p8 p8Var, C1029b7 b7Var) {
        C1190l8 l8Var = (C1190l8) p8Var;
        int j = m1763j(bArr, i, b7Var);
        int i2 = b7Var.f1252a + j;
        while (j < i2) {
            j = m1763j(bArr, j, b7Var);
            l8Var.mo12969j(b7Var.f1252a);
        }
        if (j == i2) {
            return j;
        }
        throw zzkm.zzf();
    }

    /* renamed from: g */
    static int m1760g(byte[] bArr, int i, C1029b7 b7Var) {
        int j = m1763j(bArr, i, b7Var);
        int i2 = b7Var.f1252a;
        if (i2 < 0) {
            throw zzkm.zzd();
        } else if (i2 == 0) {
            b7Var.f1254c = "";
            return j;
        } else {
            b7Var.f1254c = new String(bArr, j, i2, C1270q8.f1555a);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m1761h(byte[] bArr, int i, C1029b7 b7Var) {
        int j = m1763j(bArr, i, b7Var);
        int i2 = b7Var.f1252a;
        if (i2 < 0) {
            throw zzkm.zzd();
        } else if (i2 == 0) {
            b7Var.f1254c = "";
            return j;
        } else {
            b7Var.f1254c = C1049cb.m1777d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m1762i(int i, byte[] bArr, int i2, int i3, C1240oa oaVar, C1029b7 b7Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m1766m(bArr, i2, b7Var);
                oaVar.mo13055h(i, Long.valueOf(b7Var.f1253b));
                return m;
            } else if (i4 == 1) {
                oaVar.mo13055h(i, Long.valueOf(m1767n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m1763j(bArr, i2, b7Var);
                int i5 = b7Var.f1252a;
                if (i5 < 0) {
                    throw zzkm.zzd();
                } else if (i5 <= bArr.length - j) {
                    oaVar.mo13055h(i, i5 == 0 ? zzjb.zzb : zzjb.zzl(bArr, j, i5));
                    return j + i5;
                } else {
                    throw zzkm.zzf();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C1240oa e = C1240oa.m2415e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m1763j(bArr, i2, b7Var);
                    int i8 = b7Var.f1252a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = j2;
                        break;
                    }
                    int i9 = m1762i(i7, bArr, j2, i3, e, b7Var);
                    i7 = i8;
                    i2 = i9;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzkm.zze();
                }
                oaVar.mo13055h(i, e);
                return i2;
            } else if (i4 == 5) {
                oaVar.mo13055h(i, Integer.valueOf(m1755b(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzkm.zzb();
            }
        } else {
            throw zzkm.zzb();
        }
    }

    /* renamed from: j */
    static int m1763j(byte[] bArr, int i, C1029b7 b7Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m1764k(b, bArr, i2, b7Var);
        }
        b7Var.f1252a = b;
        return i2;
    }

    /* renamed from: k */
    static int m1764k(int i, byte[] bArr, int i2, C1029b7 b7Var) {
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
                                b7Var.f1252a = i9;
                                return i10;
                            }
                        }
                    }
                }
            }
            b7Var.f1252a = i7 | i3;
            return i8;
        }
        b7Var.f1252a = i5 | i4;
        return i6;
    }

    /* renamed from: l */
    static int m1765l(int i, byte[] bArr, int i2, int i3, C1254p8 p8Var, C1029b7 b7Var) {
        C1190l8 l8Var = (C1190l8) p8Var;
        int j = m1763j(bArr, i2, b7Var);
        while (true) {
            l8Var.mo12969j(b7Var.f1252a);
            if (j >= i3) {
                break;
            }
            int j2 = m1763j(bArr, j, b7Var);
            if (i != b7Var.f1252a) {
                break;
            }
            j = m1763j(bArr, j2, b7Var);
        }
        return j;
    }

    /* renamed from: m */
    static int m1766m(byte[] bArr, int i, C1029b7 b7Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            b7Var.f1253b = j;
            return i2;
        }
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
        b7Var.f1253b = j2;
        return i3;
    }

    /* renamed from: n */
    static long m1767n(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
