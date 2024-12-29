package p011c.p012a.p053e.p057t;

import p011c.p012a.p053e.C0823j;

/* renamed from: c.a.e.t.f */
public final class C0844f extends C0847i {
    /* renamed from: c */
    public C0840b mo9092c(C0840b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        C0840b bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        return mo9093d(bVar, i, i2, C0849k.m1252b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* renamed from: d */
    public C0840b mo9093d(C0840b bVar, int i, int i2, C0849k kVar) {
        if (i <= 0 || i2 <= 0) {
            throw C0823j.m1126a();
        }
        C0840b bVar2 = new C0840b(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = ((float) i4) + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = ((float) (i5 / 2)) + 0.5f;
                fArr[i5 + 1] = f;
            }
            kVar.mo9098f(fArr);
            C0847i.m1243a(bVar, fArr);
            int i6 = 0;
            while (i6 < i3) {
                try {
                    if (bVar.mo9059d((int) fArr[i6], (int) fArr[i6 + 1])) {
                        bVar2.mo9069p(i6 / 2, i4);
                    }
                    i6 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C0823j.m1126a();
                }
            }
        }
        return bVar2;
    }
}
