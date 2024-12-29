package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.q */
public final class C2584q extends C2583p {

    /* renamed from: i */
    private static final int[] f4400i = {1, 1, 1, 1, 1, 1};

    /* renamed from: j */
    private static final int[][] f4401j = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: h */
    private final int[] f4402h = new int[4];

    /* renamed from: q */
    public static String m7080q(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        sb.append(str.charAt(7));
        return sb.toString();
    }

    /* renamed from: r */
    private static void m7081r(StringBuilder sb, int i) {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f4401j[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo19564g(String str) {
        return super.mo19564g(m7080q(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int[] mo19565j(C2548a aVar, int i) {
        return C2583p.m7071m(aVar, i, true, f4400i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo19557k(C2548a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f4402h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.mo19481j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < j; i3++) {
            int i4 = C2583p.m7070i(aVar, iArr2, i, C2583p.f4396g);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m7081r(sb, i2);
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public BarcodeFormat mo19558p() {
        return BarcodeFormat.UPC_E;
    }
}
