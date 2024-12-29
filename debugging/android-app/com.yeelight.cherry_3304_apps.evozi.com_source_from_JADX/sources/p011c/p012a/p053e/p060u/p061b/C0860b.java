package p011c.p012a.p053e.p060u.p061b;

import p011c.p012a.p053e.p060u.p061b.C0865e;

/* renamed from: c.a.e.u.b.b */
final class C0860b {

    /* renamed from: a */
    private final int f870a;

    /* renamed from: b */
    private final byte[] f871b;

    private C0860b(int i, byte[] bArr) {
        this.f870a = i;
        this.f871b = bArr;
    }

    /* renamed from: b */
    static C0860b[] m1306b(byte[] bArr, C0865e eVar) {
        C0865e.C0868c d = eVar.mo9130d();
        C0865e.C0867b[] a = d.mo9138a();
        int i = 0;
        for (C0865e.C0867b a2 : a) {
            i += a2.mo9136a();
        }
        C0860b[] bVarArr = new C0860b[i];
        int i2 = 0;
        for (C0865e.C0867b bVar : a) {
            int i3 = 0;
            while (i3 < bVar.mo9136a()) {
                int b = bVar.mo9137b();
                bVarArr[i2] = new C0860b(b, new byte[(d.mo9139b() + b)]);
                i3++;
                i2++;
            }
        }
        int length = bVarArr[0].f871b.length - d.mo9139b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                bVarArr[i7].f871b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = eVar.mo9134i() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            bVarArr[i9].f871b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = bVarArr[0].f871b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                bVarArr[i11].f871b[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo9125a() {
        return this.f871b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9126c() {
        return this.f870a;
    }
}
