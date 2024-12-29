package p011c.p012a.p053e.p065w;

import androidx.appcompat.widget.ActivityChooserView;
import com.miot.bluetooth.BluetoothConstants;
import java.util.Arrays;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0817d;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.c */
public final class C0879c extends C0887k {

    /* renamed from: e */
    static final int[] f917e;

    /* renamed from: f */
    static final int f918f;

    /* renamed from: a */
    private final boolean f919a;

    /* renamed from: b */
    private final boolean f920b;

    /* renamed from: c */
    private final StringBuilder f921c;

    /* renamed from: d */
    private final int[] f922d;

    static {
        int[] iArr = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, BluetoothConstants.GATT_ERROR, 388, 196, 148, 168, 162, 138, 42};
        f917e = iArr;
        f918f = iArr[39];
    }

    public C0879c() {
        this(false);
    }

    public C0879c(boolean z) {
        this(z, false);
    }

    public C0879c(boolean z, boolean z2) {
        this.f919a = z;
        this.f920b = z2;
        this.f921c = new StringBuilder(20);
        this.f922d = new int[9];
    }

    /* renamed from: g */
    private static String m1369g(CharSequence charSequence) {
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
                                throw C0820g.m1114a();
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw C0820g.m1114a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 < 'F' || charAt2 > 'W') {
                        throw C0820g.m1114a();
                    } else {
                        i = charAt2 - 11;
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw C0820g.m1114a();
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
    private static int[] m1370h(C0839a aVar, int[] iArr) {
        int m = aVar.mo9047m();
        int k = aVar.mo9045k(0);
        int length = iArr.length;
        int i = k;
        boolean z = false;
        int i2 = 0;
        while (k < m) {
            if (aVar.mo9042f(k) ^ z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                int i3 = length - 1;
                if (i2 != i3) {
                    i2++;
                } else if (m1372j(iArr) != f918f || !aVar.mo9049p(Math.max(0, i - ((k - i) / 2)), i, false)) {
                    i += iArr[0] + iArr[1];
                    int i4 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i2--;
                } else {
                    return new int[]{i, k};
                }
                iArr[i2] = 1;
                z = !z;
            }
            k++;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: i */
    private static char m1371i(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f917e;
            if (i2 >= iArr.length) {
                throw C0823j.m1126a();
            } else if (iArr[i2] == i) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".charAt(i2);
            } else {
                i2++;
            }
        }
    }

    /* renamed from: j */
    private static int m1372j(int[] iArr) {
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
    public C0827n mo9149b(int i, C0839a aVar, Map<C0818e, ?> map) {
        int[] iArr = this.f922d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f921c;
        sb.setLength(0);
        int[] h = m1370h(aVar, iArr);
        int k = aVar.mo9045k(h[1]);
        int m = aVar.mo9047m();
        while (true) {
            C0887k.m1401e(aVar, k, iArr);
            int j = m1372j(iArr);
            if (j >= 0) {
                char i2 = m1371i(j);
                sb.append(i2);
                int i3 = k;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int k2 = aVar.mo9045k(i3);
                if (i2 == '*') {
                    sb.setLength(sb.length() - 1);
                    int i5 = 0;
                    for (int i6 : iArr) {
                        i5 += i6;
                    }
                    int i7 = (k2 - k) - i5;
                    if (k2 == m || (i7 << 1) >= i5) {
                        if (this.f919a) {
                            int length = sb.length() - 1;
                            int i8 = 0;
                            for (int i9 = 0; i9 < length; i9++) {
                                i8 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f921c.charAt(i9));
                            }
                            if (sb.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i8 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw C0817d.m1112a();
                            }
                        }
                        if (sb.length() != 0) {
                            float f = (float) i;
                            return new C0827n(this.f920b ? m1369g(sb) : sb.toString(), (byte[]) null, new C0829p[]{new C0829p(((float) (h[1] + h[0])) / 2.0f, f), new C0829p(((float) k) + (((float) i5) / 2.0f), f)}, C0814a.CODE_39);
                        }
                        throw C0823j.m1126a();
                    }
                    throw C0823j.m1126a();
                }
                k = k2;
            } else {
                throw C0823j.m1126a();
            }
        }
    }
}
