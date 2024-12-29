package p042h2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2546b;
import com.google.zxing.C2562f;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C2549b;
import java.util.Map;
import p026d2.C3129b;
import p046i2.C3251c;

/* renamed from: h2.a */
public final class C3245a implements C2562f {

    /* renamed from: b */
    private static final C2564h[] f5229b = new C2564h[0];

    /* renamed from: a */
    private final C3251c f5230a = new C3251c();

    /* renamed from: b */
    private static C2549b m8701b(C2549b bVar) {
        int[] f = bVar.mo19496f();
        if (f != null) {
            int i = f[0];
            int i2 = f[1];
            int i3 = f[2];
            int i4 = f[3];
            C2549b bVar2 = new C2549b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (bVar.mo19493d(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        bVar2.mo19503o(i7, i5);
                    }
                }
            }
            return bVar2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: a */
    public C2563g mo10969a(C2546b bVar, Map<DecodeHintType, ?> map) {
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            throw NotFoundException.getNotFoundInstance();
        }
        C3129b b = this.f5230a.mo23795b(m8701b(bVar.mo19454a()), map);
        C2563g gVar = new C2563g(b.mo23611h(), b.mo23608e(), f5229b, BarcodeFormat.MAXICODE);
        String b2 = b.mo23605b();
        if (b2 != null) {
            gVar.mo19544h(ResultMetadataType.ERROR_CORRECTION_LEVEL, b2);
        }
        return gVar;
    }

    public void reset() {
    }
}
