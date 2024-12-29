package p062l2;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2546b;
import com.google.zxing.C2562f;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.pdf417.decoder.C2612i;
import java.util.ArrayList;
import java.util.Map;
import p026d2.C3129b;
import p071n2.C3378a;
import p071n2.C3379b;

/* renamed from: l2.b */
public final class C3315b implements C2562f {
    /* renamed from: b */
    private static C2563g[] m9008b(C2546b bVar, Map<DecodeHintType, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList();
        C3379b c = C3378a.m9217c(bVar, map, z);
        for (C2564h[] next : c.mo24146b()) {
            C3129b i = C2612i.m7228i(c.mo24145a(), next[4], next[5], next[6], next[7], m9011e(next), m9009c(next));
            C2563g gVar = new C2563g(i.mo23611h(), i.mo23608e(), next, BarcodeFormat.PDF_417);
            gVar.mo19544h(ResultMetadataType.ERROR_CORRECTION_LEVEL, i.mo23605b());
            C3316c cVar = (C3316c) i.mo23607d();
            if (cVar != null) {
                gVar.mo19544h(ResultMetadataType.PDF417_EXTRA_METADATA, cVar);
            }
            arrayList.add(gVar);
        }
        return (C2563g[]) arrayList.toArray(new C2563g[arrayList.size()]);
    }

    /* renamed from: c */
    private static int m9009c(C2564h[] hVarArr) {
        return Math.max(Math.max(m9010d(hVarArr[0], hVarArr[4]), (m9010d(hVarArr[6], hVarArr[2]) * 17) / 18), Math.max(m9010d(hVarArr[1], hVarArr[5]), (m9010d(hVarArr[7], hVarArr[3]) * 17) / 18));
    }

    /* renamed from: d */
    private static int m9010d(C2564h hVar, C2564h hVar2) {
        if (hVar == null || hVar2 == null) {
            return 0;
        }
        return (int) Math.abs(hVar.mo19546c() - hVar2.mo19546c());
    }

    /* renamed from: e */
    private static int m9011e(C2564h[] hVarArr) {
        return Math.min(Math.min(m9012f(hVarArr[0], hVarArr[4]), (m9012f(hVarArr[6], hVarArr[2]) * 17) / 18), Math.min(m9012f(hVarArr[1], hVarArr[5]), (m9012f(hVarArr[7], hVarArr[3]) * 17) / 18));
    }

    /* renamed from: f */
    private static int m9012f(C2564h hVar, C2564h hVar2) {
        return (hVar == null || hVar2 == null) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) Math.abs(hVar.mo19546c() - hVar2.mo19546c());
    }

    /* renamed from: a */
    public C2563g mo10969a(C2546b bVar, Map<DecodeHintType, ?> map) {
        C2563g[] b = m9008b(bVar, map, false);
        if (b != null && b.length != 0 && b[0] != null) {
            return b[0];
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public void reset() {
    }
}
