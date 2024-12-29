package p156f.p157g0.p161i;

import java.io.IOException;
import p156f.p157g0.C4345c;
import p163g.C4411f;

/* renamed from: f.g0.i.e */
public final class C10792e {

    /* renamed from: a */
    static final C4411f f20758a = C4411f.m12868h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f20759b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    static final String[] f20760c = new String[64];

    /* renamed from: d */
    static final String[] f20761d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f20761d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C4345c.m12371r("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f20760c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            f20760c[i4 | 8] = f20760c[i4] + "|PADDED";
        }
        String[] strArr3 = f20760c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr4 = f20760c;
                int i9 = i8 | i6;
                strArr4[i9] = f20760c[i8] + '|' + f20760c[i6];
                f20760c[i9 | 8] = f20760c[i8] + '|' + f20760c[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr5 = f20760c;
            if (i < strArr5.length) {
                if (strArr5[i] == null) {
                    strArr5[i] = f20761d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private C10792e() {
    }

    /* renamed from: a */
    static String m26785a(byte b, byte b2) {
        if (b2 == 0) {
            return "";
        }
        if (!(b == 2 || b == 3)) {
            if (b == 4 || b == 6) {
                return b2 == 1 ? "ACK" : f20761d[b2];
            }
            if (!(b == 7 || b == 8)) {
                String[] strArr = f20760c;
                String str = b2 < strArr.length ? strArr[b2] : f20761d[b2];
                return (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f20761d[b2];
    }

    /* renamed from: b */
    static String m26786b(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f20759b;
        String r = b < strArr.length ? strArr[b] : C4345c.m12371r("0x%02x", Byte.valueOf(b));
        String a = m26785a(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = r;
        objArr[4] = a;
        return C4345c.m12371r("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: c */
    static IllegalArgumentException m26787c(String str, Object... objArr) {
        throw new IllegalArgumentException(C4345c.m12371r(str, objArr));
    }

    /* renamed from: d */
    static IOException m26788d(String str, Object... objArr) {
        throw new IOException(C4345c.m12371r(str, objArr));
    }
}
