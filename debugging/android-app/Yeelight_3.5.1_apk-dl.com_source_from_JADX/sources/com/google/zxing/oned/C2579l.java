package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2546b;
import com.google.zxing.C2563g;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.C2548a;
import java.util.Map;

/* renamed from: com.google.zxing.oned.l */
public final class C2579l extends C2583p {

    /* renamed from: h */
    private final C2583p f4384h = new C2572e();

    /* renamed from: q */
    private static C2563g m7053q(C2563g gVar) {
        String f = gVar.mo19542f();
        if (f.charAt(0) == '0') {
            return new C2563g(f.substring(1), (byte[]) null, gVar.mo19541e(), BarcodeFormat.UPC_A);
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: a */
    public C2563g mo10969a(C2546b bVar, Map<DecodeHintType, ?> map) {
        return m7053q(this.f4384h.mo10969a(bVar, map));
    }

    /* renamed from: b */
    public C2563g mo19556b(int i, C2548a aVar, Map<DecodeHintType, ?> map) {
        return m7053q(this.f4384h.mo19556b(i, aVar, map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo19557k(C2548a aVar, int[] iArr, StringBuilder sb) {
        return this.f4384h.mo19557k(aVar, iArr, sb);
    }

    /* renamed from: l */
    public C2563g mo19560l(int i, C2548a aVar, int[] iArr, Map<DecodeHintType, ?> map) {
        return m7053q(this.f4384h.mo19560l(i, aVar, iArr, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public BarcodeFormat mo19558p() {
        return BarcodeFormat.UPC_A;
    }
}
