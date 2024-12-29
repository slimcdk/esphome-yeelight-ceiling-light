package p051j4;

import com.yeelight.yeelib.device.base.C3012e;
import java.util.Comparator;

/* renamed from: j4.j */
public class C9192j implements Comparator<C3012e> {
    /* renamed from: a */
    public int compare(C3012e eVar, C3012e eVar2) {
        boolean z = eVar == null;
        boolean z2 = eVar2 == null;
        if (z && z2) {
            return 0;
        }
        if (z) {
            return -1;
        }
        if (z2) {
            return 1;
        }
        if (eVar.mo23146k1()) {
            return -1;
        }
        if (!eVar2.mo23146k1() && eVar.mo23230o0()) {
            return !eVar2.mo23230o0() ? -1 : 0;
        }
        return 1;
    }
}
