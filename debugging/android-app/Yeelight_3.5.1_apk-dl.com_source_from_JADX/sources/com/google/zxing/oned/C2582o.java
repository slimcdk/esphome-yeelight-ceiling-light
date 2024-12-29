package com.google.zxing.oned;

import com.google.zxing.C2563g;
import com.google.zxing.ReaderException;
import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.o */
final class C2582o {

    /* renamed from: c */
    private static final int[] f4390c = {1, 1, 2};

    /* renamed from: a */
    private final C2580m f4391a = new C2580m();

    /* renamed from: b */
    private final C2581n f4392b = new C2581n();

    C2582o() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2563g mo19563a(int i, C2548a aVar, int i2) {
        int[] m = C2583p.m7071m(aVar, i2, false, f4390c);
        try {
            return this.f4392b.mo19562b(i, aVar, m);
        } catch (ReaderException unused) {
            return this.f4391a.mo19561b(i, aVar, m);
        }
    }
}
