package p011c.p012a.p053e.p073y.p075c;

import java.util.ArrayList;
import java.util.List;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0830q;
import p011c.p012a.p053e.p057t.C0840b;

/* renamed from: c.a.e.y.c.b */
final class C0966b {

    /* renamed from: a */
    private final C0840b f1137a;

    /* renamed from: b */
    private final List<C0965a> f1138b = new ArrayList(5);

    /* renamed from: c */
    private final int f1139c;

    /* renamed from: d */
    private final int f1140d;

    /* renamed from: e */
    private final int f1141e;

    /* renamed from: f */
    private final int f1142f;

    /* renamed from: g */
    private final float f1143g;

    /* renamed from: h */
    private final int[] f1144h;

    /* renamed from: i */
    private final C0830q f1145i;

    C0966b(C0840b bVar, int i, int i2, int i3, int i4, float f, C0830q qVar) {
        this.f1137a = bVar;
        this.f1139c = i;
        this.f1140d = i2;
        this.f1141e = i3;
        this.f1142f = i4;
        this.f1143g = f;
        this.f1144h = new int[3];
        this.f1145i = qVar;
    }

    /* renamed from: a */
    private static float m1760a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: b */
    private float m1761b(int i, int i2, int i3, int i4) {
        C0840b bVar = this.f1137a;
        int j = bVar.mo9064j();
        int[] iArr = this.f1144h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bVar.mo9059d(i2, i5) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !bVar.mo9059d(i2, i5) && iArr[0] <= i3) {
                iArr[0] = iArr[0] + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < j && bVar.mo9059d(i2, i6) && iArr[1] <= i3) {
                iArr[1] = iArr[1] + 1;
                i6++;
            }
            if (i6 != j && iArr[1] <= i3) {
                while (i6 < j && !bVar.mo9059d(i2, i6) && iArr[2] <= i3) {
                    iArr[2] = iArr[2] + 1;
                    i6++;
                }
                if (iArr[2] <= i3 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 < i4 * 2 && m1762d(iArr)) {
                    return m1760a(iArr, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private boolean m1762d(int[] iArr) {
        float f = this.f1143g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private C0965a m1763e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m1760a(iArr, i2);
        float b = m1761b(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(b)) {
            return null;
        }
        float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (C0965a next : this.f1138b) {
            if (next.mo9332f(f, b, a)) {
                return next.mo9333g(b, a, f);
            }
        }
        C0965a aVar = new C0965a(a, b, f);
        this.f1138b.add(aVar);
        C0830q qVar = this.f1145i;
        if (qVar == null) {
            return null;
        }
        qVar.foundPossibleResultPoint(aVar);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0965a mo9334c() {
        C0965a e;
        C0965a e2;
        int i = this.f1139c;
        int i2 = this.f1142f;
        int i3 = this.f1141e + i;
        int i4 = this.f1140d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f1137a.mo9059d(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f1137a.mo9059d(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else if (m1762d(iArr) && (e2 = m1763e(iArr, i6, i7)) != null) {
                    return e2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (m1762d(iArr) && (e = m1763e(iArr, i6, i3)) != null) {
                return e;
            }
        }
        if (!this.f1138b.isEmpty()) {
            return this.f1138b.get(0);
        }
        throw C0823j.m1126a();
    }
}
