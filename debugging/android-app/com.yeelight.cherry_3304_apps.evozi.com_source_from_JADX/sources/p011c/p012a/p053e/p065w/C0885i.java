package p011c.p012a.p053e.p065w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0826m;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.p057t.C0839a;
import p011c.p012a.p053e.p065w.p066r.C0898e;
import p011c.p012a.p053e.p065w.p066r.p067g.C0903d;

/* renamed from: c.a.e.w.i */
public final class C0885i extends C0887k {

    /* renamed from: a */
    private final C0887k[] f938a;

    public C0885i(Map<C0818e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(C0818e.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(C0818e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C0814a.EAN_13) || collection.contains(C0814a.UPC_A) || collection.contains(C0814a.EAN_8) || collection.contains(C0814a.UPC_E)) {
                arrayList.add(new C0886j(map));
            }
            if (collection.contains(C0814a.CODE_39)) {
                arrayList.add(new C0879c(z));
            }
            if (collection.contains(C0814a.CODE_93)) {
                arrayList.add(new C0880d());
            }
            if (collection.contains(C0814a.CODE_128)) {
                arrayList.add(new C0878b());
            }
            if (collection.contains(C0814a.ITF)) {
                arrayList.add(new C0884h());
            }
            if (collection.contains(C0814a.CODABAR)) {
                arrayList.add(new C0877a());
            }
            if (collection.contains(C0814a.RSS_14)) {
                arrayList.add(new C0898e());
            }
            if (collection.contains(C0814a.RSS_EXPANDED)) {
                arrayList.add(new C0903d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C0886j(map));
            arrayList.add(new C0879c());
            arrayList.add(new C0877a());
            arrayList.add(new C0880d());
            arrayList.add(new C0878b());
            arrayList.add(new C0884h());
            arrayList.add(new C0898e());
            arrayList.add(new C0903d());
        }
        this.f938a = (C0887k[]) arrayList.toArray(new C0887k[arrayList.size()]);
    }

    /* renamed from: b */
    public C0827n mo9149b(int i, C0839a aVar, Map<C0818e, ?> map) {
        C0887k[] kVarArr = this.f938a;
        int i2 = 0;
        while (i2 < kVarArr.length) {
            try {
                return kVarArr[i2].mo9149b(i, aVar, map);
            } catch (C0826m unused) {
                i2++;
            }
        }
        throw C0823j.m1126a();
    }

    public void reset() {
        for (C0887k reset : this.f938a) {
            reset.reset();
        }
    }
}
