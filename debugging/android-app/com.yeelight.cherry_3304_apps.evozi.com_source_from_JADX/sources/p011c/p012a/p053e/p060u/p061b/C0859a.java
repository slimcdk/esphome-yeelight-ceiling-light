package p011c.p012a.p053e.p060u.p061b;

import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.p057t.C0840b;

/* renamed from: c.a.e.u.b.a */
final class C0859a {

    /* renamed from: a */
    private final C0840b f867a;

    /* renamed from: b */
    private final C0840b f868b;

    /* renamed from: c */
    private final C0865e f869c;

    C0859a(C0840b bVar) {
        int j = bVar.mo9064j();
        if (j < 8 || j > 144 || (j & 1) != 0) {
            throw C0820g.m1114a();
        }
        this.f869c = m1303j(bVar);
        C0840b a = m1296a(bVar);
        this.f867a = a;
        this.f868b = new C0840b(a.mo9067m(), this.f867a.mo9064j());
    }

    /* renamed from: a */
    private C0840b m1296a(C0840b bVar) {
        int f = this.f869c.mo9132f();
        int e = this.f869c.mo9131e();
        if (bVar.mo9064j() == f) {
            int c = this.f869c.mo9129c();
            int b = this.f869c.mo9128b();
            int i = f / c;
            int i2 = e / b;
            C0840b bVar2 = new C0840b(i2 * b, i * c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b;
                    for (int i7 = 0; i7 < c; i7++) {
                        int i8 = ((c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b; i10++) {
                            if (bVar.mo9059d(((b + 2) * i5) + 1 + i10, i8)) {
                                bVar2.mo9069p(i6 + i10, i9);
                            }
                        }
                        C0840b bVar3 = bVar;
                    }
                    C0840b bVar4 = bVar;
                }
                C0840b bVar5 = bVar;
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
    }

    /* renamed from: d */
    private int m1297d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m1301h(i3, 0, i, i2) ? 1 : 0) << true;
        if (m1301h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m1301h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m1301h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m1301h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m1301h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m1301h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return m1301h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* renamed from: e */
    private int m1298e(int i, int i2) {
        int i3 = (m1301h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m1301h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m1301h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m1301h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m1301h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m1301h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m1301h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return m1301h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: f */
    private int m1299f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m1301h(i3, 0, i, i2) ? 1 : 0) << true;
        int i5 = i2 - 1;
        if (m1301h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m1301h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m1301h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m1301h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m1301h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m1301h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return m1301h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* renamed from: g */
    private int m1300g(int i, int i2) {
        int i3 = (m1301h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m1301h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m1301h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m1301h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m1301h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m1301h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m1301h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return m1301h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: h */
    private boolean m1301h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f868b.mo9069p(i2, i);
        return this.f867a.mo9059d(i2, i);
    }

    /* renamed from: i */
    private int m1302i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m1301h(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (m1301h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m1301h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m1301h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m1301h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m1301h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m1301h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return m1301h(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    /* renamed from: j */
    private static C0865e m1303j(C0840b bVar) {
        return C0865e.m1321h(bVar.mo9064j(), bVar.mo9067m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0865e mo9123b() {
        return this.f869c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo9124c() {
        byte[] bArr = new byte[this.f869c.mo9133g()];
        int j = this.f867a.mo9064j();
        int m = this.f867a.mo9067m();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == j && i == 0 && !z) {
                bArr[i2] = (byte) m1297d(j, m);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = j - 2;
                if (i3 == i4 && i == 0 && (m & 3) != 0 && !z2) {
                    bArr[i2] = (byte) m1298e(j, m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == j + 4 && i == 2 && (m & 7) == 0 && !z3) {
                    bArr[i2] = (byte) m1299f(j, m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (m & 7) == 4 && !z4) {
                    bArr[i2] = (byte) m1300g(j, m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < j && i >= 0 && !this.f868b.mo9059d(i, i3)) {
                            bArr[i2] = (byte) m1302i(i3, i, j, m);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < m);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < m && !this.f868b.mo9059d(i6, i5)) {
                            bArr[i2] = (byte) m1302i(i5, i6, j, m);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= j) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= j && i >= m) {
                break;
            }
        }
        if (i2 == this.f869c.mo9133g()) {
            return bArr;
        }
        throw C0820g.m1114a();
    }
}
