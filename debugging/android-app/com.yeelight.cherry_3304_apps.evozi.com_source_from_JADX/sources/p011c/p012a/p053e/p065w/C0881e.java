package p011c.p012a.p053e.p065w;

import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.e */
public final class C0881e extends C0892p {

    /* renamed from: i */
    static final int[] f928i = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: h */
    private final int[] f929h = new int[4];

    /* renamed from: q */
    private static void m1381q(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f928i[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw C0823j.m1126a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo9150k(C0839a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f929h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m = aVar.mo9047m();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < m; i3++) {
            int i4 = C0892p.m1422i(aVar, iArr2, i, C0892p.f952g);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m1381q(sb, i2);
        int i6 = C0892p.m1423m(aVar, i, true, C0892p.f950e)[1];
        for (int i7 = 0; i7 < 6 && i6 < m; i7++) {
            sb.append((char) (C0892p.m1422i(aVar, iArr2, i6, C0892p.f951f) + 48));
            for (int i8 : iArr2) {
                i6 += i8;
            }
        }
        return i6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0814a mo9151p() {
        return C0814a.EAN_13;
    }
}
