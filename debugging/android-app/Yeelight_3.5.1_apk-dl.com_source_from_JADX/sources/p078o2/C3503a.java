package p078o2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2546b;
import com.google.zxing.C2562f;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C2549b;
import com.google.zxing.qrcode.decoder.C2624d;
import com.google.zxing.qrcode.decoder.C2626f;
import com.google.zxing.qrcode.detector.C2633c;
import java.util.List;
import java.util.Map;
import p026d2.C3129b;
import p026d2.C3131d;

/* renamed from: o2.a */
public class C3503a implements C2562f {

    /* renamed from: b */
    private static final C2564h[] f5604b = new C2564h[0];

    /* renamed from: a */
    private final C2624d f5605a = new C2624d();

    /* renamed from: b */
    private static C2549b m9555b(C2549b bVar) {
        int[] i = bVar.mo19500i();
        int[] e = bVar.mo19494e();
        if (i == null || e == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float c = m9556c(i, bVar);
        int i2 = i[1];
        int i3 = e[1];
        int i4 = i[0];
        int i5 = e[0];
        if (i4 >= i5 || i2 >= i3) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = i3 - i2;
        if (i6 == i5 - i4 || (i5 = i4 + i6) < bVar.mo19501j()) {
            int round = Math.round(((float) ((i5 - i4) + 1)) / c);
            int round2 = Math.round(((float) (i6 + 1)) / c);
            if (round <= 0 || round2 <= 0) {
                throw NotFoundException.getNotFoundInstance();
            } else if (round2 == round) {
                int i7 = (int) (c / 2.0f);
                int i8 = i2 + i7;
                int i9 = i4 + i7;
                int i10 = (((int) (((float) (round - 1)) * c)) + i9) - i5;
                if (i10 > 0) {
                    if (i10 <= i7) {
                        i9 -= i10;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                int i11 = (((int) (((float) (round2 - 1)) * c)) + i8) - i3;
                if (i11 > 0) {
                    if (i11 <= i7) {
                        i8 -= i11;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                C2549b bVar2 = new C2549b(round, round2);
                for (int i12 = 0; i12 < round2; i12++) {
                    int i13 = ((int) (((float) i12) * c)) + i8;
                    for (int i14 = 0; i14 < round; i14++) {
                        if (bVar.mo19493d(((int) (((float) i14) * c)) + i9, i13)) {
                            bVar2.mo19503o(i14, i12);
                        }
                    }
                }
                return bVar2;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        } else {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* renamed from: c */
    private static float m9556c(int[] iArr, C2549b bVar) {
        int g = bVar.mo19497g();
        int j = bVar.mo19501j();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < j && i2 < g) {
            if (z != bVar.mo19493d(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != j && i2 != g) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: a */
    public final C2563g mo10969a(C2546b bVar, Map<DecodeHintType, ?> map) {
        C2564h[] hVarArr;
        C3129b bVar2;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            C3131d e = new C2633c(bVar.mo19454a()).mo19686e(map);
            C3129b b = this.f5605a.mo19657b(e.mo23619a(), map);
            hVarArr = e.mo23620b();
            bVar2 = b;
        } else {
            bVar2 = this.f5605a.mo19657b(m9555b(bVar.mo19454a()), map);
            hVarArr = f5604b;
        }
        if (bVar2.mo23607d() instanceof C2626f) {
            ((C2626f) bVar2.mo23607d()).mo19662a(hVarArr);
        }
        C2563g gVar = new C2563g(bVar2.mo23611h(), bVar2.mo23608e(), hVarArr, BarcodeFormat.QR_CODE);
        List<byte[]> a = bVar2.mo23604a();
        if (a != null) {
            gVar.mo19544h(ResultMetadataType.BYTE_SEGMENTS, a);
        }
        String b2 = bVar2.mo23605b();
        if (b2 != null) {
            gVar.mo19544h(ResultMetadataType.ERROR_CORRECTION_LEVEL, b2);
        }
        if (bVar2.mo23612i()) {
            gVar.mo19544h(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(bVar2.mo23610g()));
            gVar.mo19544h(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(bVar2.mo23609f()));
        }
        return gVar;
    }

    public void reset() {
    }
}
