package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.C2565i;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C2548a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.oned.p */
public abstract class C2583p extends C2578k {

    /* renamed from: d */
    static final int[] f4393d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f4394e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[][] f4395f;

    /* renamed from: g */
    static final int[][] f4396g;

    /* renamed from: a */
    private final StringBuilder f4397a = new StringBuilder(20);

    /* renamed from: b */
    private final C2582o f4398b = new C2582o();

    /* renamed from: c */
    private final C2574g f4399c = new C2574g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f4395f = iArr;
        int[][] iArr2 = new int[20][];
        f4396g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f4395f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f4396g[i] = iArr4;
        }
    }

    protected C2583p() {
    }

    /* renamed from: h */
    static boolean m7069h(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i3 += charAt2;
        }
        return i3 % 10 == 0;
    }

    /* renamed from: i */
    static int m7070i(C2548a aVar, int[] iArr, int i, int[][] iArr2) {
        C2578k.m7049e(aVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float d = C2578k.m7048d(iArr, iArr2[i3], 0.7f);
            if (d < f) {
                i2 = i3;
                f = d;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: m */
    static int[] m7071m(C2548a aVar, int i, boolean z, int[] iArr) {
        return m7072n(aVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: n */
    private static int[] m7072n(C2548a aVar, int i, boolean z, int[] iArr, int[] iArr2) {
        int j = aVar.mo19481j();
        int i2 = z ? aVar.mo19480i(i) : aVar.mo19478h(i);
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = i2;
        while (i2 < j) {
            if (aVar.mo19476f(i2) ^ z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i5 = length - 1;
                if (i3 != i5) {
                    i3++;
                } else if (C2578k.m7048d(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i4, i2};
                } else {
                    i4 += iArr2[0] + iArr2[1];
                    int i6 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i6);
                    iArr2[i6] = 0;
                    iArr2[i5] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: o */
    static int[] m7073o(C2548a aVar) {
        int[] iArr = new int[f4393d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f4393d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m7072n(aVar, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.mo19483o(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: b */
    public C2563g mo19556b(int i, C2548a aVar, Map<DecodeHintType, ?> map) {
        return mo19560l(i, aVar, m7073o(aVar), map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo19564g(String str) {
        return m7069h(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] mo19565j(C2548a aVar, int i) {
        return m7071m(aVar, i, false, f4393d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo19557k(C2548a aVar, int[] iArr, StringBuilder sb);

    /* renamed from: l */
    public C2563g mo19560l(int i, C2548a aVar, int[] iArr, Map<DecodeHintType, ?> map) {
        int i2;
        String c;
        int[] iArr2 = null;
        C2565i iVar = map == null ? null : (C2565i) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (iVar != null) {
            iVar.foundPossibleResultPoint(new C2564h(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f4397a;
        sb.setLength(0);
        int k = mo19557k(aVar, iArr, sb);
        if (iVar != null) {
            iVar.foundPossibleResultPoint(new C2564h((float) k, (float) i));
        }
        int[] j = mo19565j(aVar, k);
        if (iVar != null) {
            iVar.foundPossibleResultPoint(new C2564h(((float) (j[0] + j[1])) / 2.0f, (float) i));
        }
        int i3 = j[1];
        int i4 = (i3 - j[0]) + i3;
        if (i4 >= aVar.mo19481j() || !aVar.mo19483o(i3, i4, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw FormatException.getFormatInstance();
        } else if (mo19564g(sb2)) {
            BarcodeFormat p = mo19558p();
            float f = (float) i;
            C2563g gVar = new C2563g(sb2, (byte[]) null, new C2564h[]{new C2564h(((float) (iArr[1] + iArr[0])) / 2.0f, f), new C2564h(((float) (j[1] + j[0])) / 2.0f, f)}, p);
            try {
                C2563g a = this.f4398b.mo19563a(i, aVar, j[1]);
                gVar.mo19544h(ResultMetadataType.UPC_EAN_EXTENSION, a.mo19542f());
                gVar.mo19543g(a.mo19540d());
                gVar.mo19537a(a.mo19541e());
                i2 = a.mo19542f().length();
            } catch (ReaderException unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            if ((p == BarcodeFormat.EAN_13 || p == BarcodeFormat.UPC_A) && (c = this.f4399c.mo19559c(sb2)) != null) {
                gVar.mo19544h(ResultMetadataType.POSSIBLE_COUNTRY, c);
            }
            return gVar;
        } else {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract BarcodeFormat mo19558p();
}
