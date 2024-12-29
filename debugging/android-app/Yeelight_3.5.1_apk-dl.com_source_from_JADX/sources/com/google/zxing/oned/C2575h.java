package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;
import java.util.Map;

/* renamed from: com.google.zxing.oned.h */
public final class C2575h extends C2578k {

    /* renamed from: b */
    private static final int[] f4377b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f4378c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[] f4379d = {1, 1, 3};

    /* renamed from: e */
    static final int[][] f4380e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f4381a = -1;

    /* renamed from: g */
    private static int m7037g(int[] iArr) {
        int length = f4380e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float d = C2578k.m7048d(iArr, f4380e[i2], 0.78f);
            if (d < f) {
                i = i2;
                f = d;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: h */
    private int[] m7038h(C2548a aVar) {
        aVar.mo19484q();
        try {
            int[] k = m7041k(aVar, m7042l(aVar), f4379d);
            m7043m(aVar, k[0]);
            int i = k[0];
            k[0] = aVar.mo19481j() - k[1];
            k[1] = aVar.mo19481j() - i;
            return k;
        } finally {
            aVar.mo19484q();
        }
    }

    /* renamed from: i */
    private static void m7039i(C2548a aVar, int i, int i2, StringBuilder sb) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            C2578k.m7049e(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m7037g(iArr2) + 48));
            sb.append((char) (m7037g(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: j */
    private int[] m7040j(C2548a aVar) {
        int[] k = m7041k(aVar, m7042l(aVar), f4378c);
        this.f4381a = (k[1] - k[0]) / 4;
        m7043m(aVar, k[0]);
        return k;
    }

    /* renamed from: k */
    private static int[] m7041k(C2548a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int j = aVar.mo19481j();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < j) {
            if (aVar.mo19476f(i) ^ z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else if (C2578k.m7048d(iArr2, iArr, 0.78f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: l */
    private static int m7042l(C2548a aVar) {
        int j = aVar.mo19481j();
        int h = aVar.mo19478h(0);
        if (h != j) {
            return h;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: m */
    private void m7043m(C2548a aVar, int i) {
        int i2 = this.f4381a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i - 1;
        while (i2 > 0 && i3 >= 0 && !aVar.mo19476f(i3)) {
            i2--;
            i3--;
        }
        if (i2 != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* renamed from: b */
    public C2563g mo19556b(int i, C2548a aVar, Map<DecodeHintType, ?> map) {
        boolean z;
        int[] j = m7040j(aVar);
        int[] h = m7038h(aVar);
        StringBuilder sb = new StringBuilder(20);
        m7039i(aVar, j[1], h[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f4377b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new C2563g(sb2, (byte[]) null, new C2564h[]{new C2564h((float) j[1], f), new C2564h((float) h[0], f)}, BarcodeFormat.ITF);
        }
        throw FormatException.getFormatInstance();
    }
}
