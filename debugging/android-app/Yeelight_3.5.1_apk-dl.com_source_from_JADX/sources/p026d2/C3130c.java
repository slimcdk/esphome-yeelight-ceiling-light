package p026d2;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2549b;

/* renamed from: d2.c */
public final class C3130c extends C3133f {
    /* renamed from: c */
    public C2549b mo23617c(C2549b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        C2549b bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        return mo23618d(bVar, i, i2, C3135h.m8380b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* renamed from: d */
    public C2549b mo23618d(C2549b bVar, int i, int i2, C3135h hVar) {
        if (i <= 0 || i2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        C2549b bVar2 = new C2549b(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = ((float) i4) + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = ((float) (i5 / 2)) + 0.5f;
                fArr[i5 + 1] = f;
            }
            hVar.mo23623f(fArr);
            C3133f.m8370a(bVar, fArr);
            int i6 = 0;
            while (i6 < i3) {
                try {
                    if (bVar.mo19493d((int) fArr[i6], (int) fArr[i6 + 1])) {
                        bVar2.mo19503o(i6 / 2, i4);
                    }
                    i6 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
        }
        return bVar2;
    }
}
