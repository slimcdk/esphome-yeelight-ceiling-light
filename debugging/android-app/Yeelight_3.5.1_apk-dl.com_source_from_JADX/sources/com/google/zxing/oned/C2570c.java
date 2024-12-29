package com.google.zxing.oned;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;
import com.miot.bluetooth.BluetoothConstants;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.oned.c */
public final class C2570c extends C2578k {

    /* renamed from: e */
    static final int[] f4361e;

    /* renamed from: f */
    static final int f4362f;

    /* renamed from: a */
    private final boolean f4363a;

    /* renamed from: b */
    private final boolean f4364b;

    /* renamed from: c */
    private final StringBuilder f4365c;

    /* renamed from: d */
    private final int[] f4366d;

    static {
        int[] iArr = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, BluetoothConstants.GATT_ERROR, 388, 196, 148, 168, 162, 138, 42};
        f4361e = iArr;
        f4362f = iArr[39];
    }

    public C2570c() {
        this(false);
    }

    public C2570c(boolean z) {
        this(z, false);
    }

    public C2570c(boolean z, boolean z2) {
        this.f4363a = z;
        this.f4364b = z2;
        this.f4365c = new StringBuilder(20);
        this.f4366d = new int[9];
    }

    /* renamed from: g */
    private static String m7017g(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt != '/') {
                                charAt = 0;
                            } else if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i = charAt2 - ' ';
                            } else if (charAt2 == 'Z') {
                                charAt = ':';
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw FormatException.getFormatInstance();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 < 'F' || charAt2 > 'W') {
                        throw FormatException.getFormatInstance();
                    } else {
                        i = charAt2 - 11;
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw FormatException.getFormatInstance();
                } else {
                    i = charAt2 - '@';
                }
                charAt = (char) i;
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: h */
    private static int[] m7018h(C2548a aVar, int[] iArr) {
        int j = aVar.mo19481j();
        int h = aVar.mo19478h(0);
        int length = iArr.length;
        int i = h;
        boolean z = false;
        int i2 = 0;
        while (h < j) {
            if (aVar.mo19476f(h) ^ z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                int i3 = length - 1;
                if (i2 != i3) {
                    i2++;
                } else if (m7020j(iArr) != f4362f || !aVar.mo19483o(Math.max(0, i - ((h - i) / 2)), i, false)) {
                    i += iArr[0] + iArr[1];
                    int i4 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i2--;
                } else {
                    return new int[]{i, h};
                }
                iArr[i2] = 1;
                z = !z;
            }
            h++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: i */
    private static char m7019i(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f4361e;
            if (i2 >= iArr.length) {
                throw NotFoundException.getNotFoundInstance();
            } else if (iArr[i2] == i) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".charAt(i2);
            } else {
                i2++;
            }
        }
    }

    /* renamed from: j */
    private static int m7020j(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: b */
    public C2563g mo19556b(int i, C2548a aVar, Map<DecodeHintType, ?> map) {
        int[] iArr = this.f4366d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f4365c;
        sb.setLength(0);
        int[] h = m7018h(aVar, iArr);
        int h2 = aVar.mo19478h(h[1]);
        int j = aVar.mo19481j();
        while (true) {
            C2578k.m7049e(aVar, h2, iArr);
            int j2 = m7020j(iArr);
            if (j2 >= 0) {
                char i2 = m7019i(j2);
                sb.append(i2);
                int i3 = h2;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int h3 = aVar.mo19478h(i3);
                if (i2 == '*') {
                    sb.setLength(sb.length() - 1);
                    int i5 = 0;
                    for (int i6 : iArr) {
                        i5 += i6;
                    }
                    int i7 = (h3 - h2) - i5;
                    if (h3 == j || (i7 << 1) >= i5) {
                        if (this.f4363a) {
                            int length = sb.length() - 1;
                            int i8 = 0;
                            for (int i9 = 0; i9 < length; i9++) {
                                i8 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f4365c.charAt(i9));
                            }
                            if (sb.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i8 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw ChecksumException.getChecksumInstance();
                            }
                        }
                        if (sb.length() != 0) {
                            float f = (float) i;
                            return new C2563g(this.f4364b ? m7017g(sb) : sb.toString(), (byte[]) null, new C2564h[]{new C2564h(((float) (h[1] + h[0])) / 2.0f, f), new C2564h(((float) h2) + (((float) i5) / 2.0f), f)}, BarcodeFormat.CODE_39);
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                h2 = h3;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }
}
