package p011c.p012a.p053e.p057t;

import p011c.p012a.p053e.C0815b;
import p011c.p012a.p053e.C0821h;
import p011c.p012a.p053e.C0823j;

/* renamed from: c.a.e.t.h */
public class C0846h extends C0815b {

    /* renamed from: d */
    private static final byte[] f822d = new byte[0];

    /* renamed from: b */
    private byte[] f823b = f822d;

    /* renamed from: c */
    private final int[] f824c = new int[32];

    public C0846h(C0821h hVar) {
        super(hVar);
    }

    /* renamed from: f */
    private static int m1239f(int[] iArr) {
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
        throw C0823j.m1126a();
    }

    /* renamed from: g */
    private void m1240g(int i) {
        if (this.f823b.length < i) {
            this.f823b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f824c[i2] = 0;
        }
    }

    /* renamed from: a */
    public C0840b mo8983a() {
        C0821h d = mo8986d();
        int d2 = d.mo8999d();
        int a = d.mo8996a();
        C0840b bVar = new C0840b(d2, a);
        m1240g(d2);
        int[] iArr = this.f824c;
        for (int i = 1; i < 5; i++) {
            byte[] c = d.mo8998c((a * i) / 5, this.f823b);
            int i2 = (d2 << 2) / 5;
            for (int i3 = d2 / 5; i3 < i2; i3++) {
                int i4 = (c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int f = m1239f(iArr);
        byte[] b = d.mo8997b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * d2;
            for (int i7 = 0; i7 < d2; i7++) {
                if ((b[i6 + i7] & 255) < f) {
                    bVar.mo9069p(i7, i5);
                }
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public C0839a mo8984b(int i, C0839a aVar) {
        C0821h d = mo8986d();
        int d2 = d.mo8999d();
        if (aVar == null || aVar.mo9047m() < d2) {
            aVar = new C0839a(d2);
        } else {
            aVar.clear();
        }
        m1240g(d2);
        byte[] c = d.mo8998c(i, this.f823b);
        int[] iArr = this.f824c;
        for (int i2 = 0; i2 < d2; i2++) {
            int i3 = (c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int f = m1239f(iArr);
        if (d2 < 3) {
            for (int i4 = 0; i4 < d2; i4++) {
                if ((c[i4] & 255) < f) {
                    aVar.mo9051s(i4);
                }
            }
        } else {
            int i5 = 1;
            byte b = c[1] & 255;
            byte b2 = c[0] & 255;
            byte b3 = b;
            while (i5 < d2 - 1) {
                int i6 = i5 + 1;
                byte b4 = c[i6] & 255;
                if ((((b3 << 2) - b2) - b4) / 2 < f) {
                    aVar.mo9051s(i5);
                }
                b2 = b3;
                i5 = i6;
                b3 = b4;
            }
        }
        return aVar;
    }
}
