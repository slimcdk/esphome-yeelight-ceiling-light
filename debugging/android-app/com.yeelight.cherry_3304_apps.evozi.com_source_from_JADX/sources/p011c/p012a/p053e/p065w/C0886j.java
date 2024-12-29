package p011c.p012a.p053e.p065w;

import java.util.Collection;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0826m;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.j */
public final class C0886j extends C0887k {

    /* renamed from: a */
    private final C0892p[] f939a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0886j(java.util.Map<p011c.p012a.p053e.C0818e, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L_0x0007
            r3 = 0
            goto L_0x000f
        L_0x0007:
            c.a.e.e r0 = p011c.p012a.p053e.C0818e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L_0x0055
            c.a.e.a r1 = p011c.p012a.p053e.C0814a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0027
            c.a.e.w.e r1 = new c.a.e.w.e
            r1.<init>()
        L_0x0023:
            r0.add(r1)
            goto L_0x0035
        L_0x0027:
            c.a.e.a r1 = p011c.p012a.p053e.C0814a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0035
            c.a.e.w.l r1 = new c.a.e.w.l
            r1.<init>()
            goto L_0x0023
        L_0x0035:
            c.a.e.a r1 = p011c.p012a.p053e.C0814a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0045
            c.a.e.w.f r1 = new c.a.e.w.f
            r1.<init>()
            r0.add(r1)
        L_0x0045:
            c.a.e.a r1 = p011c.p012a.p053e.C0814a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0055
            c.a.e.w.q r3 = new c.a.e.w.q
            r3.<init>()
            r0.add(r3)
        L_0x0055:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0073
            c.a.e.w.e r3 = new c.a.e.w.e
            r3.<init>()
            r0.add(r3)
            c.a.e.w.f r3 = new c.a.e.w.f
            r3.<init>()
            r0.add(r3)
            c.a.e.w.q r3 = new c.a.e.w.q
            r3.<init>()
            r0.add(r3)
        L_0x0073:
            int r3 = r0.size()
            c.a.e.w.p[] r3 = new p011c.p012a.p053e.p065w.C0892p[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            c.a.e.w.p[] r3 = (p011c.p012a.p053e.p065w.C0892p[]) r3
            r2.f939a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p065w.C0886j.<init>(java.util.Map):void");
    }

    /* renamed from: b */
    public C0827n mo9149b(int i, C0839a aVar, Map<C0818e, ?> map) {
        int[] o = C0892p.m1425o(aVar);
        C0892p[] pVarArr = this.f939a;
        boolean z = false;
        int i2 = 0;
        while (i2 < pVarArr.length) {
            try {
                C0827n l = pVarArr[i2].mo9153l(i, aVar, o, map);
                boolean z2 = l.mo9012b() == C0814a.EAN_13 && l.mo9016f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(C0818e.POSSIBLE_FORMATS);
                if (collection == null || collection.contains(C0814a.UPC_A)) {
                    z = true;
                }
                if (!z2 || !z) {
                    return l;
                }
                C0827n nVar = new C0827n(l.mo9016f().substring(1), l.mo9013c(), l.mo9015e(), C0814a.UPC_A);
                nVar.mo9017g(l.mo9014d());
                return nVar;
            } catch (C0826m unused) {
                i2++;
            }
        }
        throw C0823j.m1126a();
    }

    public void reset() {
        for (C0892p reset : this.f939a) {
            reset.reset();
        }
    }
}
