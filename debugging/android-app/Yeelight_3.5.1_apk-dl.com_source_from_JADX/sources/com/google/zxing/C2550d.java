package com.google.zxing;

import com.google.zxing.oned.C2576i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p012b2.C0600b;
import p038g2.C3220a;
import p042h2.C3245a;
import p062l2.C3315b;
import p078o2.C3503a;

/* renamed from: com.google.zxing.d */
public final class C2550d implements C2562f {

    /* renamed from: a */
    private Map<DecodeHintType, ?> f4311a;

    /* renamed from: b */
    private C2562f[] f4312b;

    /* renamed from: b */
    private C2563g m6935b(C2546b bVar) {
        C2562f[] fVarArr = this.f4312b;
        if (fVarArr != null) {
            int length = fVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return fVarArr[i].mo10969a(bVar, this.f4311a);
                } catch (ReaderException unused) {
                    i++;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: a */
    public C2563g mo10969a(C2546b bVar, Map<DecodeHintType, ?> map) {
        mo19509d(map);
        return m6935b(bVar);
    }

    /* renamed from: c */
    public C2563g mo19508c(C2546b bVar) {
        if (this.f4312b == null) {
            mo19509d((Map<DecodeHintType, ?>) null);
        }
        return m6935b(bVar);
    }

    /* renamed from: d */
    public void mo19509d(Map<DecodeHintType, ?> map) {
        this.f4311a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(BarcodeFormat.UPC_A) && !collection.contains(BarcodeFormat.UPC_E) && !collection.contains(BarcodeFormat.EAN_13) && !collection.contains(BarcodeFormat.EAN_8) && !collection.contains(BarcodeFormat.CODABAR) && !collection.contains(BarcodeFormat.CODE_39) && !collection.contains(BarcodeFormat.CODE_93) && !collection.contains(BarcodeFormat.CODE_128) && !collection.contains(BarcodeFormat.ITF) && !collection.contains(BarcodeFormat.RSS_14) && !collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new C2576i(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new C3503a());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new C3220a());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new C0600b());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new C3315b());
            }
            if (collection.contains(BarcodeFormat.MAXICODE)) {
                arrayList.add(new C3245a());
            }
            if (z && z2) {
                arrayList.add(new C2576i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C2576i(map));
            }
            arrayList.add(new C3503a());
            arrayList.add(new C3220a());
            arrayList.add(new C0600b());
            arrayList.add(new C3315b());
            arrayList.add(new C3245a());
            if (z2) {
                arrayList.add(new C2576i(map));
            }
        }
        this.f4312b = (C2562f[]) arrayList.toArray(new C2562f[arrayList.size()]);
    }

    public void reset() {
        C2562f[] fVarArr = this.f4312b;
        if (fVarArr != null) {
            for (C2562f reset : fVarArr) {
                reset.reset();
            }
        }
    }
}
