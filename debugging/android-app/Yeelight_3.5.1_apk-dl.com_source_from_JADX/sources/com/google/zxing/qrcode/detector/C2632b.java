package com.google.zxing.qrcode.detector;

import com.google.zxing.C2565i;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2549b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.qrcode.detector.b */
final class C2632b {

    /* renamed from: a */
    private final C2549b f4492a;

    /* renamed from: b */
    private final List<C2631a> f4493b = new ArrayList(5);

    /* renamed from: c */
    private final int f4494c;

    /* renamed from: d */
    private final int f4495d;

    /* renamed from: e */
    private final int f4496e;

    /* renamed from: f */
    private final int f4497f;

    /* renamed from: g */
    private final float f4498g;

    /* renamed from: h */
    private final int[] f4499h;

    /* renamed from: i */
    private final C2565i f4500i;

    C2632b(C2549b bVar, int i, int i2, int i3, int i4, float f, C2565i iVar) {
        this.f4492a = bVar;
        this.f4494c = i;
        this.f4495d = i2;
        this.f4496e = i3;
        this.f4497f = i4;
        this.f4498g = f;
        this.f4499h = new int[3];
        this.f4500i = iVar;
    }

    /* renamed from: a */
    private static float m7299a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: b */
    private float m7300b(int i, int i2, int i3, int i4) {
        C2549b bVar = this.f4492a;
        int g = bVar.mo19497g();
        int[] iArr = this.f4499h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bVar.mo19493d(i2, i5) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !bVar.mo19493d(i2, i5) && iArr[0] <= i3) {
                iArr[0] = iArr[0] + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < g && bVar.mo19493d(i2, i6) && iArr[1] <= i3) {
                iArr[1] = iArr[1] + 1;
                i6++;
            }
            if (i6 != g && iArr[1] <= i3) {
                while (i6 < g && !bVar.mo19493d(i2, i6) && iArr[2] <= i3) {
                    iArr[2] = iArr[2] + 1;
                    i6++;
                }
                if (iArr[2] <= i3 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 < i4 * 2 && m7301d(iArr)) {
                    return m7299a(iArr, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private boolean m7301d(int[] iArr) {
        float f = this.f4498g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private C2631a m7302e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m7299a(iArr, i2);
        float b = m7300b(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(b)) {
            return null;
        }
        float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (C2631a next : this.f4493b) {
            if (next.mo19682f(f, b, a)) {
                return next.mo19683g(b, a, f);
            }
        }
        C2631a aVar = new C2631a(a, b, f);
        this.f4493b.add(aVar);
        C2565i iVar = this.f4500i;
        if (iVar == null) {
            return null;
        }
        iVar.foundPossibleResultPoint(aVar);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2631a mo19684c() {
        C2631a e;
        C2631a e2;
        int i = this.f4494c;
        int i2 = this.f4497f;
        int i3 = this.f4496e + i;
        int i4 = this.f4495d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f4492a.mo19493d(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f4492a.mo19493d(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else if (m7301d(iArr) && (e2 = m7302e(iArr, i6, i7)) != null) {
                    return e2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (m7301d(iArr) && (e = m7302e(iArr, i6, i3)) != null) {
                return e;
            }
        }
        if (!this.f4493b.isEmpty()) {
            return this.f4493b.get(0);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
