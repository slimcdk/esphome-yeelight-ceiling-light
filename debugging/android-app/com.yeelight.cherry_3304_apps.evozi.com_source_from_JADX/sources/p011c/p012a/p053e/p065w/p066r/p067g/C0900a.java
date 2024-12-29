package p011c.p012a.p053e.p065w.p066r.p067g;

import java.util.List;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.r.g.a */
final class C0900a {
    /* renamed from: a */
    static C0839a m1467a(List<C0901b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).mo9180d() == null) {
            size--;
        }
        C0839a aVar = new C0839a(size * 12);
        int i = 0;
        int b = list.get(0).mo9180d().mo9166b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                aVar.mo9051s(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C0901b bVar = list.get(i3);
            int b2 = bVar.mo9179c().mo9166b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    aVar.mo9051s(i);
                }
                i++;
            }
            if (bVar.mo9180d() != null) {
                int b3 = bVar.mo9180d().mo9166b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        aVar.mo9051s(i);
                    }
                    i++;
                }
            }
        }
        return aVar;
    }
}
