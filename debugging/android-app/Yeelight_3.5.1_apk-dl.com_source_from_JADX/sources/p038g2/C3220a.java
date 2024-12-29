package p038g2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2546b;
import com.google.zxing.C2562f;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C2549b;
import com.google.zxing.datamatrix.decoder.C2554c;
import com.google.zxing.datamatrix.detector.Detector;
import java.util.List;
import java.util.Map;
import p026d2.C3129b;
import p026d2.C3131d;

/* renamed from: g2.a */
public final class C3220a implements C2562f {

    /* renamed from: b */
    private static final C2564h[] f5198b = new C2564h[0];

    /* renamed from: a */
    private final C2554c f5199a = new C2554c();

    /* renamed from: b */
    private static C2549b m8665b(C2549b bVar) {
        int[] i = bVar.mo19500i();
        int[] e = bVar.mo19494e();
        if (i == null || e == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int c = m8666c(i, bVar);
        int i2 = i[1];
        int i3 = e[1];
        int i4 = i[0];
        int i5 = ((e[0] - i4) + 1) / c;
        int i6 = ((i3 - i2) + 1) / c;
        if (i5 <= 0 || i6 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i7 = c / 2;
        int i8 = i2 + i7;
        int i9 = i4 + i7;
        C2549b bVar2 = new C2549b(i5, i6);
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = (i10 * c) + i8;
            for (int i12 = 0; i12 < i5; i12++) {
                if (bVar.mo19493d((i12 * c) + i9, i11)) {
                    bVar2.mo19503o(i12, i10);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: c */
    private static int m8666c(int[] iArr, C2549b bVar) {
        int j = bVar.mo19501j();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < j && bVar.mo19493d(i, i2)) {
            i++;
        }
        if (i != j) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: a */
    public C2563g mo10969a(C2546b bVar, Map<DecodeHintType, ?> map) {
        C2564h[] hVarArr;
        C3129b bVar2;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            C3131d c = new Detector(bVar.mo19454a()).mo19527c();
            C3129b b = this.f5199a.mo19514b(c.mo23619a());
            hVarArr = c.mo23620b();
            bVar2 = b;
        } else {
            bVar2 = this.f5199a.mo19514b(m8665b(bVar.mo19454a()));
            hVarArr = f5198b;
        }
        C2563g gVar = new C2563g(bVar2.mo23611h(), bVar2.mo23608e(), hVarArr, BarcodeFormat.DATA_MATRIX);
        List<byte[]> a = bVar2.mo23604a();
        if (a != null) {
            gVar.mo19544h(ResultMetadataType.BYTE_SEGMENTS, a);
        }
        String b2 = bVar2.mo23605b();
        if (b2 != null) {
            gVar.mo19544h(ResultMetadataType.ERROR_CORRECTION_LEVEL, b2);
        }
        return gVar;
    }

    public void reset() {
    }
}
