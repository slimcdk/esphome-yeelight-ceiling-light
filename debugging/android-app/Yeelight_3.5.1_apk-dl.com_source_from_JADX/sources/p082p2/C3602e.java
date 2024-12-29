package p082p2;

import com.google.zxing.WriterException;
import com.google.zxing.common.C2548a;
import com.google.zxing.qrcode.decoder.C2627g;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import org.apache.commons.p194io.IOUtils;

/* renamed from: p2.e */
final class C3602e {

    /* renamed from: a */
    private static final int[][] f6005a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f6006b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f6007c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f6008d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: a */
    static void m10229a(C2548a aVar, ErrorCorrectionLevel errorCorrectionLevel, C2627g gVar, int i, C3598b bVar) {
        m10231c(bVar);
        m10232d(gVar, bVar);
        m10240l(errorCorrectionLevel, i, bVar);
        m10247s(gVar, bVar);
        m10234f(aVar, i, bVar);
    }

    /* renamed from: b */
    static int m10230b(int i, int i2) {
        if (i2 != 0) {
            int n = m10242n(i2);
            int i3 = i << (n - 1);
            while (m10242n(i3) >= n) {
                i3 ^= i2 << (m10242n(i3) - n);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: c */
    static void m10231c(C3598b bVar) {
        bVar.mo25898a((byte) -1);
    }

    /* renamed from: d */
    static void m10232d(C2627g gVar, C3598b bVar) {
        m10238j(bVar);
        m10233e(bVar);
        m10246r(gVar, bVar);
        m10239k(bVar);
    }

    /* renamed from: e */
    private static void m10233e(C3598b bVar) {
        if (bVar.mo25899b(8, bVar.mo25901d() - 8) != 0) {
            bVar.mo25903f(8, bVar.mo25901d() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    /* renamed from: f */
    static void m10234f(C2548a aVar, int i, C3598b bVar) {
        boolean z;
        int e = bVar.mo25902e() - 1;
        int d = bVar.mo25901d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (e > 0) {
            if (e == 6) {
                e--;
            }
            while (d >= 0 && d < bVar.mo25901d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = e - i4;
                    if (m10243o(bVar.mo25899b(i5, d))) {
                        if (i2 < aVar.mo19481j()) {
                            z = aVar.mo19476f(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C3601d.m10226f(i, i5, d)) {
                            z = !z;
                        }
                        bVar.mo25904g(i5, d, z);
                    }
                }
                d += i3;
            }
            i3 = -i3;
            d += i3;
            e -= 2;
        }
        if (i2 != aVar.mo19481j()) {
            throw new WriterException("Not all bits consumed: " + i2 + IOUtils.DIR_SEPARATOR_UNIX + aVar.mo19481j());
        }
    }

    /* renamed from: g */
    private static void m10235g(int i, int i2, C3598b bVar) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m10243o(bVar.mo25899b(i4, i2))) {
                bVar.mo25903f(i4, i2, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: h */
    private static void m10236h(int i, int i2, C3598b bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.mo25903f(i + i4, i2 + i3, f6006b[i3][i4]);
            }
        }
    }

    /* renamed from: i */
    private static void m10237i(int i, int i2, C3598b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.mo25903f(i + i4, i2 + i3, f6005a[i3][i4]);
            }
        }
    }

    /* renamed from: j */
    private static void m10238j(C3598b bVar) {
        int length = f6005a[0].length;
        m10237i(0, 0, bVar);
        m10237i(bVar.mo25902e() - length, 0, bVar);
        m10237i(0, bVar.mo25902e() - length, bVar);
        m10235g(0, 7, bVar);
        m10235g(bVar.mo25902e() - 8, 7, bVar);
        m10235g(0, bVar.mo25902e() - 8, bVar);
        m10241m(7, 0, bVar);
        m10241m((bVar.mo25901d() - 7) - 1, 0, bVar);
        m10241m(7, bVar.mo25901d() - 7, bVar);
    }

    /* renamed from: k */
    private static void m10239k(C3598b bVar) {
        int i = 8;
        while (i < bVar.mo25902e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m10243o(bVar.mo25899b(i, 6))) {
                bVar.mo25903f(i, 6, i3);
            }
            if (m10243o(bVar.mo25899b(6, i))) {
                bVar.mo25903f(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: l */
    static void m10240l(ErrorCorrectionLevel errorCorrectionLevel, int i, C3598b bVar) {
        C2548a aVar = new C2548a();
        m10244p(errorCorrectionLevel, i, aVar);
        for (int i2 = 0; i2 < aVar.mo19481j(); i2++) {
            boolean f = aVar.mo19476f((aVar.mo19481j() - 1) - i2);
            int[][] iArr = f6008d;
            bVar.mo25904g(iArr[i2][0], iArr[i2][1], f);
            if (i2 < 8) {
                bVar.mo25904g((bVar.mo25902e() - i2) - 1, 8, f);
            } else {
                bVar.mo25904g(8, (bVar.mo25901d() - 7) + (i2 - 8), f);
            }
        }
    }

    /* renamed from: m */
    private static void m10241m(int i, int i2, C3598b bVar) {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m10243o(bVar.mo25899b(i, i4))) {
                bVar.mo25903f(i, i4, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: n */
    static int m10242n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: o */
    private static boolean m10243o(int i) {
        return i == -1;
    }

    /* renamed from: p */
    static void m10244p(ErrorCorrectionLevel errorCorrectionLevel, int i, C2548a aVar) {
        if (C3603f.m10248b(i)) {
            int bits = (errorCorrectionLevel.getBits() << 3) | i;
            aVar.mo19471c(bits, 5);
            aVar.mo19471c(m10230b(bits, 1335), 10);
            C2548a aVar2 = new C2548a();
            aVar2.mo19471c(21522, 15);
            aVar.mo19489u(aVar2);
            if (aVar.mo19481j() != 15) {
                throw new WriterException("should not happen but we got: " + aVar.mo19481j());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    /* renamed from: q */
    static void m10245q(C2627g gVar, C2548a aVar) {
        aVar.mo19471c(gVar.mo19668j(), 6);
        aVar.mo19471c(m10230b(gVar.mo19668j(), 7973), 12);
        if (aVar.mo19481j() != 18) {
            throw new WriterException("should not happen but we got: " + aVar.mo19481j());
        }
    }

    /* renamed from: r */
    private static void m10246r(C2627g gVar, C3598b bVar) {
        if (gVar.mo19668j() >= 2) {
            int j = gVar.mo19668j() - 1;
            int[][] iArr = f6007c;
            int[] iArr2 = iArr[j];
            int length = iArr[j].length;
            for (int i = 0; i < length; i++) {
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr2[i];
                    int i4 = iArr2[i2];
                    if (!(i4 == -1 || i3 == -1 || !m10243o(bVar.mo25899b(i4, i3)))) {
                        m10236h(i4 - 2, i3 - 2, bVar);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    static void m10247s(C2627g gVar, C3598b bVar) {
        if (gVar.mo19668j() >= 7) {
            C2548a aVar = new C2548a();
            m10245q(gVar, aVar);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean f = aVar.mo19476f(i);
                    i--;
                    bVar.mo25904g(i2, (bVar.mo25901d() - 11) + i3, f);
                    bVar.mo25904g((bVar.mo25901d() - 11) + i3, i2, f);
                }
            }
        }
    }
}
