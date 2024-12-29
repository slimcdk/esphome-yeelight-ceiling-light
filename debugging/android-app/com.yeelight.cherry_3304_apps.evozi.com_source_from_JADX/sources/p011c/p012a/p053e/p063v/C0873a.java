package p011c.p012a.p053e.p063v;

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
import p011c.p012a.p053e.p063v.p064b.C0876c;

/* renamed from: c.a.e.v.a */
public final class C0873a implements C0825l {

    /* renamed from: b */
    private static final C0829p[] f904b = new C0829p[0];

    /* renamed from: a */
    private final C0876c f905a = new C0876c();

    /* renamed from: b */
    private static C0840b m1345b(C0840b bVar) {
        int[] f = bVar.mo9062f();
        if (f != null) {
            int i = f[0];
            int i2 = f[1];
            int i3 = f[2];
            int i4 = f[3];
            C0840b bVar2 = new C0840b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (bVar.mo9059d(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        bVar2.mo9069p(i7, i5);
                    }
                }
            }
            return bVar2;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: a */
    public C0827n mo9003a(C0816c cVar, Map<C0818e, ?> map) {
        if (map == null || !map.containsKey(C0818e.PURE_BARCODE)) {
            throw C0823j.m1126a();
        }
        C0843e b = this.f905a.mo9148b(m1345b(cVar.mo8988a()), map);
        C0827n nVar = new C0827n(b.mo9086h(), b.mo9083e(), f904b, C0814a.MAXICODE);
        String b2 = b.mo9080b();
        if (b2 != null) {
            nVar.mo9018h(C0828o.ERROR_CORRECTION_LEVEL, b2);
        }
        return nVar;
    }

    public void reset() {
    }
}
