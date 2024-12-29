package p055k2;

import com.google.zxing.common.C2548a;
import java.util.List;

/* renamed from: k2.a */
final class C3295a {
    /* renamed from: a */
    static C2548a m8868a(List<C3296b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).mo23910d() == null) {
            size--;
        }
        C2548a aVar = new C2548a(size * 12);
        int i = 0;
        int b = list.get(0).mo23910d().mo23844b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                aVar.mo19485r(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C3296b bVar = list.get(i3);
            int b2 = bVar.mo23909c().mo23844b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    aVar.mo19485r(i);
                }
                i++;
            }
            if (bVar.mo23910d() != null) {
                int b3 = bVar.mo23910d().mo23844b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        aVar.mo19485r(i);
                    }
                    i++;
                }
            }
        }
        return aVar;
    }
}
