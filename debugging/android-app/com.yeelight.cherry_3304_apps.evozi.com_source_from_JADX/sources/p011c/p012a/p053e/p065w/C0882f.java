package p011c.p012a.p053e.p065w;

import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.f */
public final class C0882f extends C0892p {

    /* renamed from: h */
    private final int[] f930h = new int[4];

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo9150k(C0839a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f930h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m = aVar.mo9047m();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < m; i2++) {
            sb.append((char) (C0892p.m1422i(aVar, iArr2, i, C0892p.f951f) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = C0892p.m1423m(aVar, i, true, C0892p.f950e)[1];
        for (int i5 = 0; i5 < 4 && i4 < m; i5++) {
            sb.append((char) (C0892p.m1422i(aVar, iArr2, i4, C0892p.f951f) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0814a mo9151p() {
        return C0814a.EAN_8;
    }
}
