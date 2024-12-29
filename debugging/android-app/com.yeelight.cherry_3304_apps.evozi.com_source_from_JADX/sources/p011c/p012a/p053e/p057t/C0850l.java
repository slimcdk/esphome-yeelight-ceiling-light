package p011c.p012a.p053e.p057t;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.nio.charset.Charset;
import java.util.Map;
import p011c.p012a.p053e.C0818e;

/* renamed from: c.a.e.t.l */
public final class C0850l {

    /* renamed from: a */
    private static final String f836a;

    /* renamed from: b */
    private static final boolean f837b;

    static {
        String name = Charset.defaultCharset().name();
        f836a = name;
        f837b = "SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(f836a);
    }

    /* renamed from: a */
    public static String m1258a(byte[] bArr, Map<C0818e, ?> map) {
        byte[] bArr2 = bArr;
        Map<C0818e, ?> map2 = map;
        if (map2 != null && map2.containsKey(C0818e.CHARACTER_SET)) {
            return map2.get(C0818e.CHARACTER_SET).toString();
        }
        int length = bArr2.length;
        boolean z = true;
        int i = 0;
        boolean z2 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        int i2 = 0;
        boolean z3 = true;
        boolean z4 = true;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length && (z || z3 || z4)) {
            byte b = bArr2[i3] & 255;
            if (z4) {
                byte b2 = b & 128;
                if (i4 > 0) {
                    if (b2 != 0) {
                        i4--;
                    }
                } else if (b2 != 0) {
                    if ((b & 64) != 0) {
                        i4++;
                        if ((b & 32) == 0) {
                            i6++;
                        } else {
                            i4++;
                            if ((b & ParameterInitDefType.ExternalSamplerInit) == 0) {
                                i7++;
                            } else {
                                i4++;
                                if ((b & 8) == 0) {
                                    i8++;
                                }
                            }
                        }
                    }
                }
                z4 = false;
            }
            if (z) {
                if (b > Byte.MAX_VALUE && b < 160) {
                    z = false;
                } else if (b > 159 && (b < 192 || b == 215 || b == 247)) {
                    i10++;
                }
            }
            if (z3) {
                if (i5 > 0) {
                    if (b >= 64 && b != Byte.MAX_VALUE && b <= 252) {
                        i5--;
                    }
                } else if (!(b == 128 || b == 160 || b > 239)) {
                    if (b <= 160 || b >= 224) {
                        if (b > Byte.MAX_VALUE) {
                            i5++;
                            int i13 = i11 + 1;
                            if (i13 > i) {
                                i = i13;
                                i11 = i;
                            } else {
                                i11 = i13;
                            }
                        } else {
                            i11 = 0;
                        }
                        i12 = 0;
                    } else {
                        i2++;
                        int i14 = i12 + 1;
                        if (i14 > i9) {
                            i9 = i14;
                            i12 = i9;
                        } else {
                            i12 = i14;
                        }
                        i11 = 0;
                    }
                }
                z3 = false;
            }
            i3++;
            bArr2 = bArr;
        }
        if (z4 && i4 > 0) {
            z4 = false;
        }
        if (z3 && i5 > 0) {
            z3 = false;
        }
        return (!z4 || (!z2 && (i6 + i7) + i8 <= 0)) ? (!z3 || (!f837b && i9 < 3 && i < 3)) ? (!z || !z3) ? z ? "ISO8859_1" : z3 ? "SJIS" : z4 ? "UTF8" : f836a : (!(i9 == 2 && i2 == 2) && i10 * 10 < length) ? "ISO8859_1" : "SJIS" : "SJIS" : "UTF8";
    }
}
