package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n7 */
final class C1913n7 {

    /* renamed from: a */
    private static final C1928o7 f3594a = ((!(C1859k7.m5339m() && C1859k7.m5344r()) || C1735c3.m4943b()) ? new C1972r7() : new C2002t7());

    /* renamed from: d */
    static int m5601d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C1956q7(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    static int m5602e(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f3594a.mo11897b(charSequence, bArr, i, i2);
    }

    /* renamed from: f */
    public static boolean m5603f(byte[] bArr) {
        return f3594a.mo11898c(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static boolean m5604g(byte[] bArr, int i, int i2) {
        return f3594a.mo11898c(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static int m5605h(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static int m5606i(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static int m5607j(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: k */
    static String m5608k(byte[] bArr, int i, int i2) {
        return f3594a.mo11899d(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static int m5610m(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m5605h(b);
        }
        if (i3 == 1) {
            return m5606i(b, bArr[i]);
        }
        if (i3 == 2) {
            return m5607j(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
