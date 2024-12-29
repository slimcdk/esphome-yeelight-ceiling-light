package okhttp3.internal.http2;

import java.io.IOException;
import okio.ByteString;
import p056k5.C3300c;

/* renamed from: okhttp3.internal.http2.c */
public final class C9807c {

    /* renamed from: a */
    static final ByteString f17721a = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f17722b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    static final String[] f17723c = new String[64];

    /* renamed from: d */
    static final String[] f17724d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f17724d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C3300c.m8932q("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f17723c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f17723c;
            strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
        }
        String[] strArr4 = f17723c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f17723c;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = f17723c;
            if (i < strArr6.length) {
                if (strArr6[i] == null) {
                    strArr6[i] = f17724d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private C9807c() {
    }

    /* renamed from: a */
    static String m23536a(byte b, byte b2) {
        if (b2 == 0) {
            return "";
        }
        if (!(b == 2 || b == 3)) {
            if (b == 4 || b == 6) {
                return b2 == 1 ? "ACK" : f17724d[b2];
            }
            if (!(b == 7 || b == 8)) {
                String[] strArr = f17723c;
                String str = b2 < strArr.length ? strArr[b2] : f17724d[b2];
                return (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f17724d[b2];
    }

    /* renamed from: b */
    static String m23537b(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f17722b;
        String q = b < strArr.length ? strArr[b] : C3300c.m8932q("0x%02x", Byte.valueOf(b));
        String a = m23536a(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = q;
        objArr[4] = a;
        return C3300c.m8932q("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: c */
    static IllegalArgumentException m23538c(String str, Object... objArr) {
        throw new IllegalArgumentException(C3300c.m8932q(str, objArr));
    }

    /* renamed from: d */
    static IOException m23539d(String str, Object... objArr) {
        throw new IOException(C3300c.m8932q(str, objArr));
    }
}
