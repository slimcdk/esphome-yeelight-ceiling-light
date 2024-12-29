package p026d2;

import com.google.zxing.C2544a;
import com.google.zxing.C2547c;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;
import com.google.zxing.common.C2549b;

/* renamed from: d2.e */
public class C3132e extends C2544a {

    /* renamed from: d */
    private static final byte[] f5020d = new byte[0];

    /* renamed from: b */
    private byte[] f5021b = f5020d;

    /* renamed from: c */
    private final int[] f5022c = new int[32];

    public C3132e(C2547c cVar) {
        super(cVar);
    }

    /* renamed from: g */
    private static int m8366g(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 > length / 16) {
            int i11 = i3 - 1;
            int i12 = i11;
            int i13 = -1;
            while (i11 > i5) {
                int i14 = i11 - i5;
                int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
                if (i15 > i13) {
                    i12 = i11;
                    i13 = i15;
                }
                i11--;
            }
            return i12 << 3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: h */
    private void m8367h(int i) {
        if (this.f5021b.length < i) {
            this.f5021b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f5022c[i2] = 0;
        }
    }

    /* renamed from: b */
    public C2549b mo19448b() {
        C2547c e = mo19451e();
        int d = e.mo19464d();
        int a = e.mo19461a();
        C2549b bVar = new C2549b(d, a);
        m8367h(d);
        int[] iArr = this.f5022c;
        for (int i = 1; i < 5; i++) {
            byte[] c = e.mo19463c((a * i) / 5, this.f5021b);
            int i2 = (d << 2) / 5;
            for (int i3 = d / 5; i3 < i2; i3++) {
                int i4 = (c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int g = m8366g(iArr);
        byte[] b = e.mo19462b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * d;
            for (int i7 = 0; i7 < d; i7++) {
                if ((b[i6 + i7] & 255) < g) {
                    bVar.mo19503o(i7, i5);
                }
            }
        }
        return bVar;
    }

    /* renamed from: c */
    public C2548a mo19449c(int i, C2548a aVar) {
        C2547c e = mo19451e();
        int d = e.mo19464d();
        if (aVar == null || aVar.mo19481j() < d) {
            aVar = new C2548a(d);
        } else {
            aVar.clear();
        }
        m8367h(d);
        byte[] c = e.mo19463c(i, this.f5021b);
        int[] iArr = this.f5022c;
        for (int i2 = 0; i2 < d; i2++) {
            int i3 = (c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int g = m8366g(iArr);
        if (d < 3) {
            for (int i4 = 0; i4 < d; i4++) {
                if ((c[i4] & 255) < g) {
                    aVar.mo19485r(i4);
                }
            }
        } else {
            int i5 = 1;
            byte b = c[1] & 255;
            byte b2 = c[0] & 255;
            byte b3 = b;
            while (i5 < d - 1) {
                int i6 = i5 + 1;
                byte b4 = c[i6] & 255;
                if ((((b3 << 2) - b2) - b4) / 2 < g) {
                    aVar.mo19485r(i5);
                }
                b2 = b3;
                i5 = i6;
                b3 = b4;
            }
        }
        return aVar;
    }
}
