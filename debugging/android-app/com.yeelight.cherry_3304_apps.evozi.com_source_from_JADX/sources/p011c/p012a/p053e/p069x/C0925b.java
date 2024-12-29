package p011c.p012a.p053e.p069x;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0816c;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0825l;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.C0828o;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0843e;
import p011c.p012a.p053e.p069x.p070d.C0938j;
import p011c.p012a.p053e.p069x.p072e.C0942a;
import p011c.p012a.p053e.p069x.p072e.C0943b;

/* renamed from: c.a.e.x.b */
public final class C0925b implements C0825l {
    /* renamed from: b */
    private static C0827n[] m1560b(C0816c cVar, Map<C0818e, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList();
        C0943b b = C0942a.m1689b(cVar, map, z);
        for (C0829p[] next : b.mo9299b()) {
            C0843e i = C0938j.m1649i(b.mo9298a(), next[4], next[5], next[6], next[7], m1563e(next), m1561c(next));
            C0827n nVar = new C0827n(i.mo9086h(), i.mo9083e(), next, C0814a.PDF_417);
            nVar.mo9018h(C0828o.ERROR_CORRECTION_LEVEL, i.mo9080b());
            C0926c cVar2 = (C0926c) i.mo9082d();
            if (cVar2 != null) {
                nVar.mo9018h(C0828o.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(nVar);
        }
        return (C0827n[]) arrayList.toArray(new C0827n[arrayList.size()]);
    }

    /* renamed from: c */
    private static int m1561c(C0829p[] pVarArr) {
        return Math.max(Math.max(m1562d(pVarArr[0], pVarArr[4]), (m1562d(pVarArr[6], pVarArr[2]) * 17) / 18), Math.max(m1562d(pVarArr[1], pVarArr[5]), (m1562d(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    /* renamed from: d */
    private static int m1562d(C0829p pVar, C0829p pVar2) {
        if (pVar == null || pVar2 == null) {
            return 0;
        }
        return (int) Math.abs(pVar.mo9020c() - pVar2.mo9020c());
    }

    /* renamed from: e */
    private static int m1563e(C0829p[] pVarArr) {
        return Math.min(Math.min(m1564f(pVarArr[0], pVarArr[4]), (m1564f(pVarArr[6], pVarArr[2]) * 17) / 18), Math.min(m1564f(pVarArr[1], pVarArr[5]), (m1564f(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    /* renamed from: f */
    private static int m1564f(C0829p pVar, C0829p pVar2) {
        return (pVar == null || pVar2 == null) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) Math.abs(pVar.mo9020c() - pVar2.mo9020c());
    }

    /* renamed from: a */
    public C0827n mo9003a(C0816c cVar, Map<C0818e, ?> map) {
        C0827n[] b = m1560b(cVar, map, false);
        if (b != null && b.length != 0 && b[0] != null) {
            return b[0];
        }
        throw C0823j.m1126a();
    }

    public void reset() {
    }
}
