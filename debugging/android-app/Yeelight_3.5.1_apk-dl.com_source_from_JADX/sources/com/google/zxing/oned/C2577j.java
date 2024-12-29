package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.C2548a;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.zxing.oned.j */
public final class C2577j extends C2578k {

    /* renamed from: a */
    private final C2583p[] f4383a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2577j(java.util.Map<com.google.zxing.DecodeHintType, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L_0x0007
            r3 = 0
            goto L_0x000f
        L_0x0007:
            com.google.zxing.DecodeHintType r0 = com.google.zxing.DecodeHintType.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L_0x0055
            com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0027
            com.google.zxing.oned.e r1 = new com.google.zxing.oned.e
            r1.<init>()
        L_0x0023:
            r0.add(r1)
            goto L_0x0035
        L_0x0027:
            com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0035
            com.google.zxing.oned.l r1 = new com.google.zxing.oned.l
            r1.<init>()
            goto L_0x0023
        L_0x0035:
            com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0045
            com.google.zxing.oned.f r1 = new com.google.zxing.oned.f
            r1.<init>()
            r0.add(r1)
        L_0x0045:
            com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0055
            com.google.zxing.oned.q r3 = new com.google.zxing.oned.q
            r3.<init>()
            r0.add(r3)
        L_0x0055:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0073
            com.google.zxing.oned.e r3 = new com.google.zxing.oned.e
            r3.<init>()
            r0.add(r3)
            com.google.zxing.oned.f r3 = new com.google.zxing.oned.f
            r3.<init>()
            r0.add(r3)
            com.google.zxing.oned.q r3 = new com.google.zxing.oned.q
            r3.<init>()
            r0.add(r3)
        L_0x0073:
            int r3 = r0.size()
            com.google.zxing.oned.p[] r3 = new com.google.zxing.oned.C2583p[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            com.google.zxing.oned.p[] r3 = (com.google.zxing.oned.C2583p[]) r3
            r2.f4383a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.C2577j.<init>(java.util.Map):void");
    }

    /* renamed from: b */
    public C2563g mo19556b(int i, C2548a aVar, Map<DecodeHintType, ?> map) {
        int[] o = C2583p.m7073o(aVar);
        C2583p[] pVarArr = this.f4383a;
        boolean z = false;
        int i2 = 0;
        while (i2 < pVarArr.length) {
            try {
                C2563g l = pVarArr[i2].mo19560l(i, aVar, o, map);
                boolean z2 = l.mo19538b() == BarcodeFormat.EAN_13 && l.mo19542f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                if (collection == null || collection.contains(BarcodeFormat.UPC_A)) {
                    z = true;
                }
                if (!z2 || !z) {
                    return l;
                }
                C2563g gVar = new C2563g(l.mo19542f().substring(1), l.mo19539c(), l.mo19541e(), BarcodeFormat.UPC_A);
                gVar.mo19543g(l.mo19540d());
                return gVar;
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public void reset() {
        for (C2583p reset : this.f4383a) {
            reset.reset();
        }
    }
}
