package okio;

import java.nio.charset.Charset;

/* renamed from: okio.t */
final class C9856t {

    /* renamed from: a */
    public static final Charset f17857a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static boolean m23804a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m23805b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    /* renamed from: c */
    public static int m23806c(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: d */
    public static short m23807d(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: e */
    public static void m23808e(Throwable th) {
        m23809f(th);
    }

    /* renamed from: f */
    private static <T extends Throwable> void m23809f(Throwable th) {
        throw th;
    }
}
