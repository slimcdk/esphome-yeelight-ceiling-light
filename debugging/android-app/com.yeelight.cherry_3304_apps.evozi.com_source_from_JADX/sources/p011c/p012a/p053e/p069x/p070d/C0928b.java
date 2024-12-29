package p011c.p012a.p053e.p069x.p070d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p011c.p012a.p053e.p069x.C0924a;

/* renamed from: c.a.e.x.d.b */
final class C0928b {

    /* renamed from: a */
    private final Map<Integer, Integer> f1032a = new HashMap();

    C0928b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo9234a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.f1032a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
            } else if (((Integer) next.getValue()).intValue() != i) {
            }
            arrayList.add(next.getKey());
        }
        return C0924a.m1559b(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9235b(int i) {
        Integer num = this.f1032a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f1032a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
