package p026d2;

import com.google.zxing.common.C2549b;

/* renamed from: d2.f */
public abstract class C3133f {

    /* renamed from: a */
    private static C3133f f5023a = new C3130c();

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0075  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m8370a(com.google.zxing.common.C2549b r9, float[] r10) {
        /*
            int r0 = r9.mo19501j()
            int r9 = r9.mo19497g()
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 1
        L_0x000c:
            int r5 = r10.length
            r6 = 0
            r7 = -1
            if (r3 >= r5) goto L_0x0048
            if (r4 == 0) goto L_0x0048
            r4 = r10[r3]
            int r4 = (int) r4
            int r5 = r3 + 1
            r8 = r10[r5]
            int r8 = (int) r8
            if (r4 < r7) goto L_0x0043
            if (r4 > r0) goto L_0x0043
            if (r8 < r7) goto L_0x0043
            if (r8 > r9) goto L_0x0043
            if (r4 != r7) goto L_0x0029
            r10[r3] = r6
        L_0x0027:
            r4 = 1
            goto L_0x0032
        L_0x0029:
            if (r4 != r0) goto L_0x0031
            int r4 = r0 + -1
            float r4 = (float) r4
            r10[r3] = r4
            goto L_0x0027
        L_0x0031:
            r4 = 0
        L_0x0032:
            if (r8 != r7) goto L_0x0038
            r10[r5] = r6
        L_0x0036:
            r4 = 1
            goto L_0x0040
        L_0x0038:
            if (r8 != r9) goto L_0x0040
            int r4 = r9 + -1
            float r4 = (float) r4
            r10[r5] = r4
            goto L_0x0036
        L_0x0040:
            int r3 = r3 + 2
            goto L_0x000c
        L_0x0043:
            com.google.zxing.NotFoundException r9 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r9
        L_0x0048:
            int r3 = r10.length
            int r3 = r3 + -2
            r4 = 1
        L_0x004c:
            if (r3 < 0) goto L_0x0085
            if (r4 == 0) goto L_0x0085
            r4 = r10[r3]
            int r4 = (int) r4
            int r5 = r3 + 1
            r8 = r10[r5]
            int r8 = (int) r8
            if (r4 < r7) goto L_0x0080
            if (r4 > r0) goto L_0x0080
            if (r8 < r7) goto L_0x0080
            if (r8 > r9) goto L_0x0080
            if (r4 != r7) goto L_0x0066
            r10[r3] = r6
        L_0x0064:
            r4 = 1
            goto L_0x006f
        L_0x0066:
            if (r4 != r0) goto L_0x006e
            int r4 = r0 + -1
            float r4 = (float) r4
            r10[r3] = r4
            goto L_0x0064
        L_0x006e:
            r4 = 0
        L_0x006f:
            if (r8 != r7) goto L_0x0075
            r10[r5] = r6
        L_0x0073:
            r4 = 1
            goto L_0x007d
        L_0x0075:
            if (r8 != r9) goto L_0x007d
            int r4 = r9 + -1
            float r4 = (float) r4
            r10[r5] = r4
            goto L_0x0073
        L_0x007d:
            int r3 = r3 + -2
            goto L_0x004c
        L_0x0080:
            com.google.zxing.NotFoundException r9 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r9
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p026d2.C3133f.m8370a(com.google.zxing.common.b, float[]):void");
    }

    /* renamed from: b */
    public static C3133f m8371b() {
        return f5023a;
    }

    /* renamed from: c */
    public abstract C2549b mo23617c(C2549b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16);

    /* renamed from: d */
    public abstract C2549b mo23618d(C2549b bVar, int i, int i2, C3135h hVar);
}
