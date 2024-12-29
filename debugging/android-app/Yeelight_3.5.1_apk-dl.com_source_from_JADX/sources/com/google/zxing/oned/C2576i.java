package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.C2548a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p050j2.C3276e;
import p055k2.C3298d;

/* renamed from: com.google.zxing.oned.i */
public final class C2576i extends C2578k {

    /* renamed from: a */
    private final C2578k[] f4382a;

    public C2576i(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new C2577j(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39)) {
                arrayList.add(new C2570c(z));
            }
            if (collection.contains(BarcodeFormat.CODE_93)) {
                arrayList.add(new C2571d());
            }
            if (collection.contains(BarcodeFormat.CODE_128)) {
                arrayList.add(new C2569b());
            }
            if (collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new C2575h());
            }
            if (collection.contains(BarcodeFormat.CODABAR)) {
                arrayList.add(new C2568a());
            }
            if (collection.contains(BarcodeFormat.RSS_14)) {
                arrayList.add(new C3276e());
            }
            if (collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                arrayList.add(new C3298d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C2577j(map));
            arrayList.add(new C2570c());
            arrayList.add(new C2568a());
            arrayList.add(new C2571d());
            arrayList.add(new C2569b());
            arrayList.add(new C2575h());
            arrayList.add(new C3276e());
            arrayList.add(new C3298d());
        }
        this.f4382a = (C2578k[]) arrayList.toArray(new C2578k[arrayList.size()]);
    }

    /* renamed from: b */
    public C2563g mo19556b(int i, C2548a aVar, Map<DecodeHintType, ?> map) {
        C2578k[] kVarArr = this.f4382a;
        int i2 = 0;
        while (i2 < kVarArr.length) {
            try {
                return kVarArr[i2].mo19556b(i, aVar, map);
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public void reset() {
        for (C2578k reset : this.f4382a) {
            reset.reset();
        }
    }
}
