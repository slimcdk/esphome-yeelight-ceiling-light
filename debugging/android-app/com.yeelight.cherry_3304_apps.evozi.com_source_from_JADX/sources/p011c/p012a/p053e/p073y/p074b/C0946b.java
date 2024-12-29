package p011c.p012a.p053e.p073y.p074b;

import p011c.p012a.p053e.p073y.p074b.C0962j;

/* renamed from: c.a.e.y.b.b */
final class C0946b {

    /* renamed from: a */
    private final int f1089a;

    /* renamed from: b */
    private final byte[] f1090b;

    private C0946b(int i, byte[] bArr) {
        this.f1089a = i;
        this.f1090b = bArr;
    }

    /* renamed from: b */
    static C0946b[] m1707b(byte[] bArr, C0962j jVar, C0958f fVar) {
        if (bArr.length == jVar.mo9323h()) {
            C0962j.C0964b f = jVar.mo9322f(fVar);
            C0962j.C0963a[] a = f.mo9328a();
            int i = 0;
            for (C0962j.C0963a a2 : a) {
                i += a2.mo9326a();
            }
            C0946b[] bVarArr = new C0946b[i];
            int i2 = 0;
            for (C0962j.C0963a aVar : a) {
                int i3 = 0;
                while (i3 < aVar.mo9326a()) {
                    int b = aVar.mo9327b();
                    bVarArr[i2] = new C0946b(b, new byte[(f.mo9329b() + b)]);
                    i3++;
                    i2++;
                }
            }
            int length = bVarArr[0].f1090b.length;
            int i4 = i - 1;
            while (i4 >= 0 && bVarArr[i4].f1090b.length != length) {
                i4--;
            }
            int i5 = i4 + 1;
            int b2 = length - f.mo9329b();
            int i6 = 0;
            for (int i7 = 0; i7 < b2; i7++) {
                int i8 = 0;
                while (i8 < i2) {
                    bVarArr[i8].f1090b[i7] = bArr[i6];
                    i8++;
                    i6++;
                }
            }
            int i9 = i5;
            while (i9 < i2) {
                bVarArr[i9].f1090b[b2] = bArr[i6];
                i9++;
                i6++;
            }
            int length2 = bVarArr[0].f1090b.length;
            while (b2 < length2) {
                int i10 = 0;
                while (i10 < i2) {
                    bVarArr[i10].f1090b[i10 < i5 ? b2 : b2 + 1] = bArr[i6];
                    i10++;
                    i6++;
                }
                b2++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo9306a() {
        return this.f1090b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9307c() {
        return this.f1089a;
    }
}
