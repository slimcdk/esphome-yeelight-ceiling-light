package p011c.p012a.p053e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p011c.p012a.p053e.p054s.C0833b;
import p011c.p012a.p053e.p060u.C0858a;
import p011c.p012a.p053e.p063v.C0873a;
import p011c.p012a.p053e.p065w.C0885i;
import p011c.p012a.p053e.p069x.C0925b;
import p011c.p012a.p053e.p073y.C0944a;

/* renamed from: c.a.e.i */
public final class C0822i implements C0825l {

    /* renamed from: a */
    private Map<C0818e, ?> f716a;

    /* renamed from: b */
    private C0825l[] f717b;

    /* renamed from: b */
    private C0827n m1122b(C0816c cVar) {
        C0825l[] lVarArr = this.f717b;
        if (lVarArr != null) {
            int length = lVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return lVarArr[i].mo9003a(cVar, this.f716a);
                } catch (C0826m unused) {
                    i++;
                }
            }
        }
        throw C0823j.m1126a();
    }

    /* renamed from: a */
    public C0827n mo9003a(C0816c cVar, Map<C0818e, ?> map) {
        mo9005d(map);
        return m1122b(cVar);
    }

    /* renamed from: c */
    public C0827n mo9004c(C0816c cVar) {
        if (this.f717b == null) {
            mo9005d((Map<C0818e, ?>) null);
        }
        return m1122b(cVar);
    }

    /* renamed from: d */
    public void mo9005d(Map<C0818e, ?> map) {
        this.f716a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(C0818e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(C0818e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(C0814a.UPC_A) && !collection.contains(C0814a.UPC_E) && !collection.contains(C0814a.EAN_13) && !collection.contains(C0814a.EAN_8) && !collection.contains(C0814a.CODABAR) && !collection.contains(C0814a.CODE_39) && !collection.contains(C0814a.CODE_93) && !collection.contains(C0814a.CODE_128) && !collection.contains(C0814a.ITF) && !collection.contains(C0814a.RSS_14) && !collection.contains(C0814a.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new C0885i(map));
            }
            if (collection.contains(C0814a.QR_CODE)) {
                arrayList.add(new C0944a());
            }
            if (collection.contains(C0814a.DATA_MATRIX)) {
                arrayList.add(new C0858a());
            }
            if (collection.contains(C0814a.AZTEC)) {
                arrayList.add(new C0833b());
            }
            if (collection.contains(C0814a.PDF_417)) {
                arrayList.add(new C0925b());
            }
            if (collection.contains(C0814a.MAXICODE)) {
                arrayList.add(new C0873a());
            }
            if (z && z2) {
                arrayList.add(new C0885i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C0885i(map));
            }
            arrayList.add(new C0944a());
            arrayList.add(new C0858a());
            arrayList.add(new C0833b());
            arrayList.add(new C0925b());
            arrayList.add(new C0873a());
            if (z2) {
                arrayList.add(new C0885i(map));
            }
        }
        this.f717b = (C0825l[]) arrayList.toArray(new C0825l[arrayList.size()]);
    }

    public void reset() {
        C0825l[] lVarArr = this.f717b;
        if (lVarArr != null) {
            for (C0825l reset : lVarArr) {
                reset.reset();
            }
        }
    }
}
