package com.google.android.gms.internal.measurement;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.connection.wifi.step.SmartConfigStep;

/* renamed from: com.google.android.gms.internal.measurement.b3 */
final class C1718b3 {
    /* renamed from: a */
    static int m4768a(int i, byte[] bArr, int i2, int i3, C1764e3 e3Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m4778k(bArr, i2, e3Var);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m4776i(bArr, i2, e3Var) + e3Var.f3321a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m4776i(bArr, i2, e3Var);
                    i6 = e3Var.f3321a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m4768a(i6, bArr, i2, i3, e3Var);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C2046w4.m6269e();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C2046w4.m6267c();
            }
        } else {
            throw C2046w4.m6267c();
        }
    }

    /* renamed from: b */
    static int m4769b(int i, byte[] bArr, int i2, int i3, C1999t4<?> t4Var, C1764e3 e3Var) {
        C1939p4 p4Var = (C1939p4) t4Var;
        int i4 = m4776i(bArr, i2, e3Var);
        while (true) {
            p4Var.mo11940f(e3Var.f3321a);
            if (i4 >= i3) {
                break;
            }
            int i5 = m4776i(bArr, i4, e3Var);
            if (i != e3Var.f3321a) {
                break;
            }
            i4 = m4776i(bArr, i5, e3Var);
        }
        return i4;
    }

    /* renamed from: c */
    static int m4770c(int i, byte[] bArr, int i2, int i3, C1814h7 h7Var, C1764e3 e3Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int k = m4778k(bArr, i2, e3Var);
                h7Var.mo11715c(i, Long.valueOf(e3Var.f3322b));
                return k;
            } else if (i4 == 1) {
                h7Var.mo11715c(i, Long.valueOf(m4779l(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int i5 = m4776i(bArr, i2, e3Var);
                int i6 = e3Var.f3321a;
                if (i6 < 0) {
                    throw C2046w4.m6266b();
                } else if (i6 <= bArr.length - i5) {
                    h7Var.mo11715c(i, i6 == 0 ? C1779f3.f3341b : C1779f3.m5074h(bArr, i5, i6));
                    return i5 + i6;
                } else {
                    throw C2046w4.m6265a();
                }
            } else if (i4 == 3) {
                C1814h7 g = C1814h7.m5207g();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int i9 = m4776i(bArr, i2, e3Var);
                    int i10 = e3Var.f3321a;
                    i8 = i10;
                    if (i10 == i7) {
                        i2 = i9;
                        break;
                    }
                    int c = m4770c(i8, bArr, i9, i3, g, e3Var);
                    i8 = i10;
                    i2 = c;
                }
                if (i2 > i3 || i8 != i7) {
                    throw C2046w4.m6269e();
                }
                h7Var.mo11715c(i, g);
                return i2;
            } else if (i4 == 5) {
                h7Var.mo11715c(i, Integer.valueOf(m4775h(bArr, i2)));
                return i2 + 4;
            } else {
                throw C2046w4.m6267c();
            }
        } else {
            throw C2046w4.m6267c();
        }
    }

    /* renamed from: d */
    static int m4771d(int i, byte[] bArr, int i2, C1764e3 e3Var) {
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
                            if (bArr[i8] >= 0) {
                                e3Var.f3321a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            e3Var.f3321a = i7 | i3;
            return i8;
        }
        e3Var.f3321a = i5 | i4;
        return i6;
    }

    /* renamed from: e */
    static int m4772e(C1912n6<?> n6Var, int i, byte[] bArr, int i2, int i3, C1999t4<?> t4Var, C1764e3 e3Var) {
        int g = m4774g(n6Var, bArr, i2, i3, e3Var);
        while (true) {
            t4Var.add(e3Var.f3323c);
            if (g >= i3) {
                break;
            }
            int i4 = m4776i(bArr, g, e3Var);
            if (i != e3Var.f3321a) {
                break;
            }
            g = m4774g(n6Var, bArr, i4, i3, e3Var);
        }
        return g;
    }

    /* renamed from: f */
    static int m4773f(C1912n6 n6Var, byte[] bArr, int i, int i2, int i3, C1764e3 e3Var) {
        C1721b6 b6Var = (C1721b6) n6Var;
        Object C = b6Var.mo11461C();
        int n = b6Var.mo11470n(C, bArr, i, i2, i3, e3Var);
        b6Var.mo11464c(C);
        e3Var.f3323c = C;
        return n;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m4774g(com.google.android.gms.internal.measurement.C1912n6 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.C1764e3 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m4771d(r8, r7, r0, r10)
            int r8 = r10.f3321a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo11461C()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo11468g(r1, r2, r3, r4, r5)
            r6.mo11464c(r9)
            r10.f3323c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.w4 r6 = com.google.android.gms.internal.measurement.C2046w4.m6265a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1718b3.m4774g(com.google.android.gms.internal.measurement.n6, byte[], int, int, com.google.android.gms.internal.measurement.e3):int");
    }

    /* renamed from: h */
    static int m4775h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << ParameterInitDefType.ExternalSamplerInit);
    }

    /* renamed from: i */
    static int m4776i(byte[] bArr, int i, C1764e3 e3Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m4771d(b, bArr, i2, e3Var);
        }
        e3Var.f3321a = b;
        return i2;
    }

    /* renamed from: j */
    static int m4777j(byte[] bArr, int i, C1999t4<?> t4Var, C1764e3 e3Var) {
        C1939p4 p4Var = (C1939p4) t4Var;
        int i2 = m4776i(bArr, i, e3Var);
        int i3 = e3Var.f3321a + i2;
        while (i2 < i3) {
            i2 = m4776i(bArr, i2, e3Var);
            p4Var.mo11940f(e3Var.f3321a);
        }
        if (i2 == i3) {
            return i2;
        }
        throw C2046w4.m6265a();
    }

    /* renamed from: k */
    static int m4778k(byte[] bArr, int i, C1764e3 e3Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            e3Var.f3322b = j;
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
        e3Var.f3322b = j2;
        return i3;
    }

    /* renamed from: l */
    static long m4779l(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: m */
    static double m4780m(byte[] bArr, int i) {
        return Double.longBitsToDouble(m4779l(bArr, i));
    }

    /* renamed from: n */
    static int m4781n(byte[] bArr, int i, C1764e3 e3Var) {
        int i2 = m4776i(bArr, i, e3Var);
        int i3 = e3Var.f3321a;
        if (i3 < 0) {
            throw C2046w4.m6266b();
        } else if (i3 == 0) {
            e3Var.f3323c = "";
            return i2;
        } else {
            e3Var.f3323c = new String(bArr, i2, i3, C1925o4.f3609a);
            return i2 + i3;
        }
    }

    /* renamed from: o */
    static float m4782o(byte[] bArr, int i) {
        return Float.intBitsToFloat(m4775h(bArr, i));
    }

    /* renamed from: p */
    static int m4783p(byte[] bArr, int i, C1764e3 e3Var) {
        int i2 = m4776i(bArr, i, e3Var);
        int i3 = e3Var.f3321a;
        if (i3 < 0) {
            throw C2046w4.m6266b();
        } else if (i3 == 0) {
            e3Var.f3323c = "";
            return i2;
        } else {
            e3Var.f3323c = C1913n7.m5608k(bArr, i2, i3);
            return i2 + i3;
        }
    }

    /* renamed from: q */
    static int m4784q(byte[] bArr, int i, C1764e3 e3Var) {
        int i2 = m4776i(bArr, i, e3Var);
        int i3 = e3Var.f3321a;
        if (i3 < 0) {
            throw C2046w4.m6266b();
        } else if (i3 > bArr.length - i2) {
            throw C2046w4.m6265a();
        } else if (i3 == 0) {
            e3Var.f3323c = C1779f3.f3341b;
            return i2;
        } else {
            e3Var.f3323c = C1779f3.m5074h(bArr, i2, i3);
            return i2 + i3;
        }
    }
}
