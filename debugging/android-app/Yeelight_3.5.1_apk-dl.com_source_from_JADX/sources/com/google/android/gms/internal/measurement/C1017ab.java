package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ab */
final class C1017ab extends C1410za {
    C1017ab() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo12545a(int i, byte[] bArr, int i2, int i3) {
        while (r9 < i3 && bArr[r9] >= 0) {
            i2 = r9 + 1;
        }
        if (r9 >= i3) {
            return 0;
        }
        while (r9 < i3) {
            int i4 = r9 + 1;
            byte b = bArr[r9];
            if (b < 0) {
                if (b >= -32) {
                    if (b < -16) {
                        if (i4 < i3 - 1) {
                            int i5 = i4 + 1;
                            byte b2 = bArr[i4];
                            if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                r9 = i5 + 1;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                    } else if (i4 < i3 - 2) {
                        int i6 = i4 + 1;
                        byte b3 = bArr[i4];
                        if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                            int i7 = i6 + 1;
                            if (bArr[i6] <= -65) {
                                i4 = i7 + 1;
                                if (bArr[i7] > -65) {
                                }
                            }
                        }
                    }
                    return C1049cb.m1774a(bArr, i4, i3);
                } else if (i4 >= i3) {
                    return b;
                } else {
                    if (b >= -62) {
                        r9 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                }
                return -1;
            }
            r9 = i4;
        }
        return 0;
    }
}