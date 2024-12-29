package p011c.p012a.p053e.p060u;

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
import p011c.p012a.p053e.p060u.p061b.C0864d;
import p011c.p012a.p053e.p060u.p062c.C0869a;

/* renamed from: c.a.e.u.a */
public final class C0858a implements C0825l {

    /* renamed from: b */
    private static final C0829p[] f865b = new C0829p[0];

    /* renamed from: a */
    private final C0864d f866a = new C0864d();

    /* renamed from: b */
    private static C0840b m1293b(C0840b bVar) {
        int[] l = bVar.mo9066l();
        int[] e = bVar.mo9060e();
        if (l == null || e == null) {
            throw C0823j.m1126a();
        }
        int c = m1294c(l, bVar);
        int i = l[1];
        int i2 = e[1];
        int i3 = l[0];
        int i4 = ((e[0] - i3) + 1) / c;
        int i5 = ((i2 - i) + 1) / c;
        if (i4 <= 0 || i5 <= 0) {
            throw C0823j.m1126a();
        }
        int i6 = c / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        C0840b bVar2 = new C0840b(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * c) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (bVar.mo9059d((i11 * c) + i8, i10)) {
                    bVar2.mo9069p(i11, i9);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: c */
    private static int m1294c(int[] iArr, C0840b bVar) {
        int m = bVar.mo9067m();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < m && bVar.mo9059d(i, i2)) {
            i++;
        }
        if (i != m) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw C0823j.m1126a();
        }
        throw C0823j.m1126a();
    }

    /* renamed from: a */
    public C0827n mo9003a(C0816c cVar, Map<C0818e, ?> map) {
        C0829p[] pVarArr;
        C0843e eVar;
        if (map == null || !map.containsKey(C0818e.PURE_BARCODE)) {
            C0845g c = new C0869a(cVar.mo8988a()).mo9140c();
            C0843e b = this.f866a.mo9127b(c.mo9094a());
            pVarArr = c.mo9095b();
            eVar = b;
        } else {
            eVar = this.f866a.mo9127b(m1293b(cVar.mo8988a()));
            pVarArr = f865b;
        }
        C0827n nVar = new C0827n(eVar.mo9086h(), eVar.mo9083e(), pVarArr, C0814a.DATA_MATRIX);
        List<byte[]> a = eVar.mo9079a();
        if (a != null) {
            nVar.mo9018h(C0828o.BYTE_SEGMENTS, a);
        }
        String b2 = eVar.mo9080b();
        if (b2 != null) {
            nVar.mo9018h(C0828o.ERROR_CORRECTION_LEVEL, b2);
        }
        return nVar;
    }

    public void reset() {
    }
}
