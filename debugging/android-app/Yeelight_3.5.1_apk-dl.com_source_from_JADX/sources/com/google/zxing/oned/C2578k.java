package com.google.zxing.oned;

import com.google.zxing.C2546b;
import com.google.zxing.C2562f;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C2548a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.oned.k */
public abstract class C2578k implements C2562f {
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d A[Catch:{ ReaderException -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c5 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.zxing.C2563g m7047c(com.google.zxing.C2546b r22, java.util.Map<com.google.zxing.DecodeHintType, ?> r23) {
        /*
            r21 = this;
            r0 = r23
            int r1 = r22.mo19457d()
            int r2 = r22.mo19456c()
            com.google.zxing.common.a r3 = new com.google.zxing.common.a
            r3.<init>(r1)
            int r4 = r2 >> 1
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x001f
            com.google.zxing.DecodeHintType r7 = com.google.zxing.DecodeHintType.TRY_HARDER
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L_0x001f
            r7 = 1
            goto L_0x0020
        L_0x001f:
            r7 = 0
        L_0x0020:
            if (r7 == 0) goto L_0x0025
            r8 = 8
            goto L_0x0026
        L_0x0025:
            r8 = 5
        L_0x0026:
            int r8 = r2 >> r8
            int r8 = java.lang.Math.max(r6, r8)
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = 15
        L_0x0032:
            r9 = 0
        L_0x0033:
            if (r9 >= r7) goto L_0x00e1
            int r10 = r9 + 1
            int r11 = r10 / 2
            r9 = r9 & 1
            if (r9 != 0) goto L_0x003f
            r9 = 1
            goto L_0x0040
        L_0x003f:
            r9 = 0
        L_0x0040:
            if (r9 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            int r11 = -r11
        L_0x0044:
            int r11 = r11 * r8
            int r11 = r11 + r4
            if (r11 < 0) goto L_0x00e1
            if (r11 >= r2) goto L_0x00e1
            r9 = r22
            com.google.zxing.common.a r3 = r9.mo19455b(r11, r3)     // Catch:{ NotFoundException -> 0x00d5 }
            r12 = 0
        L_0x0052:
            r13 = 2
            if (r12 >= r13) goto L_0x00d5
            if (r12 != r6) goto L_0x0075
            r3.mo19484q()
            if (r0 == 0) goto L_0x0075
            com.google.zxing.DecodeHintType r13 = com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK
            boolean r14 = r0.containsKey(r13)
            if (r14 == 0) goto L_0x0075
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<com.google.zxing.DecodeHintType> r15 = com.google.zxing.DecodeHintType.class
            r14.<init>(r15)
            r14.putAll(r0)
            r14.remove(r13)
            r13 = r21
            r0 = r14
            goto L_0x0077
        L_0x0075:
            r13 = r21
        L_0x0077:
            com.google.zxing.g r14 = r13.mo19556b(r11, r3, r0)     // Catch:{ ReaderException -> 0x00c6 }
            if (r12 != r6) goto L_0x00c5
            com.google.zxing.ResultMetadataType r15 = com.google.zxing.ResultMetadataType.ORIENTATION     // Catch:{ ReaderException -> 0x00c6 }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)     // Catch:{ ReaderException -> 0x00c6 }
            r14.mo19544h(r15, r6)     // Catch:{ ReaderException -> 0x00c6 }
            com.google.zxing.h[] r6 = r14.mo19541e()     // Catch:{ ReaderException -> 0x00c6 }
            if (r6 == 0) goto L_0x00c5
            com.google.zxing.h r15 = new com.google.zxing.h     // Catch:{ ReaderException -> 0x00c6 }
            r16 = r0
            float r0 = (float) r1
            r18 = r6[r5]     // Catch:{ ReaderException -> 0x00c8 }
            float r18 = r18.mo19546c()     // Catch:{ ReaderException -> 0x00c8 }
            float r18 = r0 - r18
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = r1
            float r1 = r18 - r19
            r18 = r6[r5]     // Catch:{ ReaderException -> 0x00ca }
            float r5 = r18.mo19547d()     // Catch:{ ReaderException -> 0x00ca }
            r15.<init>(r1, r5)     // Catch:{ ReaderException -> 0x00ca }
            r1 = 0
            r6[r1] = r15     // Catch:{ ReaderException -> 0x00ca }
            com.google.zxing.h r5 = new com.google.zxing.h     // Catch:{ ReaderException -> 0x00ca }
            r15 = 1
            r17 = r6[r15]     // Catch:{ ReaderException -> 0x00cb }
            float r17 = r17.mo19546c()     // Catch:{ ReaderException -> 0x00cb }
            float r0 = r0 - r17
            float r0 = r0 - r19
            r17 = r6[r15]     // Catch:{ ReaderException -> 0x00cb }
            float r1 = r17.mo19547d()     // Catch:{ ReaderException -> 0x00cb }
            r5.<init>(r0, r1)     // Catch:{ ReaderException -> 0x00cb }
            r6[r15] = r5     // Catch:{ ReaderException -> 0x00cb }
        L_0x00c5:
            return r14
        L_0x00c6:
            r16 = r0
        L_0x00c8:
            r20 = r1
        L_0x00ca:
            r15 = 1
        L_0x00cb:
            int r12 = r12 + 1
            r0 = r16
            r1 = r20
            r5 = 0
            r6 = 1
            goto L_0x0052
        L_0x00d5:
            r13 = r21
            r20 = r1
            r15 = 1
            r9 = r10
            r1 = r20
            r5 = 0
            r6 = 1
            goto L_0x0033
        L_0x00e1:
            r13 = r21
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.getNotFoundInstance()
            goto L_0x00e9
        L_0x00e8:
            throw r0
        L_0x00e9:
            goto L_0x00e8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.C2578k.m7047c(com.google.zxing.b, java.util.Map):com.google.zxing.g");
    }

    /* renamed from: d */
    protected static float m7048d(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* renamed from: e */
    protected static void m7049e(C2548a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int j = aVar.mo19481j();
        if (i < j) {
            boolean z = !aVar.mo19476f(i);
            while (i < j) {
                if (!(aVar.mo19476f(i) ^ z)) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != j) {
                throw NotFoundException.getNotFoundInstance();
            }
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: f */
    protected static void m7050f(C2548a aVar, int i, int[] iArr) {
        int length = iArr.length;
        boolean f = aVar.mo19476f(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.mo19476f(i) != f) {
                length--;
                f = !f;
            }
        }
        if (length < 0) {
            m7049e(aVar, i + 1, iArr);
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: a */
    public C2563g mo10969a(C2546b bVar, Map<DecodeHintType, ?> map) {
        try {
            return m7047c(bVar, map);
        } catch (NotFoundException e) {
            if (!(map != null && map.containsKey(DecodeHintType.TRY_HARDER)) || !bVar.mo19458e()) {
                throw e;
            }
            C2546b f = bVar.mo19459f();
            C2563g c = m7047c(f, map);
            Map<ResultMetadataType, Object> d = c.mo19540d();
            int i = 270;
            if (d != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (d.containsKey(resultMetadataType)) {
                    i = (((Integer) d.get(resultMetadataType)).intValue() + 270) % 360;
                }
            }
            c.mo19544h(ResultMetadataType.ORIENTATION, Integer.valueOf(i));
            C2564h[] e2 = c.mo19541e();
            if (e2 != null) {
                int c2 = f.mo19456c();
                for (int i2 = 0; i2 < e2.length; i2++) {
                    e2[i2] = new C2564h((((float) c2) - e2[i2].mo19547d()) - 1.0f, e2[i2].mo19546c());
                }
            }
            return c;
        }
    }

    /* renamed from: b */
    public abstract C2563g mo19556b(int i, C2548a aVar, Map<DecodeHintType, ?> map);

    public void reset() {
    }
}
