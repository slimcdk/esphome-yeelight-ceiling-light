package p011c.p012a.p053e.p073y;

import java.util.List;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0816c;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0825l;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.C0828o;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0840b;
import p011c.p012a.p053e.p057t.C0843e;
import p011c.p012a.p053e.p057t.C0845g;
import p011c.p012a.p053e.p073y.p074b.C0957e;
import p011c.p012a.p053e.p073y.p074b.C0961i;
import p011c.p012a.p053e.p073y.p075c.C0967c;

/* renamed from: c.a.e.y.a */
public class C0944a implements C0825l {

    /* renamed from: b */
    private static final C0829p[] f1083b = new C0829p[0];

    /* renamed from: a */
    private final C0957e f1084a = new C0957e();

    /* renamed from: b */
    private static C0840b m1697b(C0840b bVar) {
        int[] l = bVar.mo9066l();
        int[] e = bVar.mo9060e();
        if (l == null || e == null) {
            throw C0823j.m1126a();
        }
        float c = m1698c(l, bVar);
        int i = l[1];
        int i2 = e[1];
        int i3 = l[0];
        int i4 = e[0];
        if (i3 >= i4 || i >= i2) {
            throw C0823j.m1126a();
        }
        int i5 = i2 - i;
        if (i5 == i4 - i3 || (i4 = i3 + i5) < bVar.mo9067m()) {
            int round = Math.round(((float) ((i4 - i3) + 1)) / c);
            int round2 = Math.round(((float) (i5 + 1)) / c);
            if (round <= 0 || round2 <= 0) {
                throw C0823j.m1126a();
            } else if (round2 == round) {
                int i6 = (int) (c / 2.0f);
                int i7 = i + i6;
                int i8 = i3 + i6;
                int i9 = (((int) (((float) (round - 1)) * c)) + i8) - i4;
                if (i9 > 0) {
                    if (i9 <= i6) {
                        i8 -= i9;
                    } else {
                        throw C0823j.m1126a();
                    }
                }
                int i10 = (((int) (((float) (round2 - 1)) * c)) + i7) - i2;
                if (i10 > 0) {
                    if (i10 <= i6) {
                        i7 -= i10;
                    } else {
                        throw C0823j.m1126a();
                    }
                }
                C0840b bVar2 = new C0840b(round, round2);
                for (int i11 = 0; i11 < round2; i11++) {
                    int i12 = ((int) (((float) i11) * c)) + i7;
                    for (int i13 = 0; i13 < round; i13++) {
                        if (bVar.mo9059d(((int) (((float) i13) * c)) + i8, i12)) {
                            bVar2.mo9069p(i13, i11);
                        }
                    }
                }
                return bVar2;
            } else {
                throw C0823j.m1126a();
            }
        } else {
            throw C0823j.m1126a();
        }
    }

    /* renamed from: c */
    private static float m1698c(int[] iArr, C0840b bVar) {
        int j = bVar.mo9064j();
        int m = bVar.mo9067m();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < m && i2 < j) {
            if (z != bVar.mo9059d(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != m && i2 != j) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: a */
    public final C0827n mo9003a(C0816c cVar, Map<C0818e, ?> map) {
        C0829p[] pVarArr;
        C0843e eVar;
        if (map == null || !map.containsKey(C0818e.PURE_BARCODE)) {
            C0845g e = new C0967c(cVar.mo8988a()).mo9336e(map);
            C0843e b = this.f1084a.mo9310b(e.mo9094a(), map);
            pVarArr = e.mo9095b();
            eVar = b;
        } else {
            eVar = this.f1084a.mo9310b(m1697b(cVar.mo8988a()), map);
            pVarArr = f1083b;
        }
        if (eVar.mo9082d() instanceof C0961i) {
            ((C0961i) eVar.mo9082d()).mo9318a(pVarArr);
        }
        C0827n nVar = new C0827n(eVar.mo9086h(), eVar.mo9083e(), pVarArr, C0814a.QR_CODE);
        List<byte[]> a = eVar.mo9079a();
        if (a != null) {
            nVar.mo9018h(C0828o.BYTE_SEGMENTS, a);
        }
        String b2 = eVar.mo9080b();
        if (b2 != null) {
            nVar.mo9018h(C0828o.ERROR_CORRECTION_LEVEL, b2);
        }
        if (eVar.mo9087i()) {
            nVar.mo9018h(C0828o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.mo9085g()));
            nVar.mo9018h(C0828o.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.mo9084f()));
        }
        return nVar;
    }

    public void reset() {
    }
}
