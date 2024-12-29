package p011c.p012a.p053e.p073y.p074b;

import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.p057t.C0840b;

/* renamed from: c.a.e.y.b.a */
final class C0945a {

    /* renamed from: a */
    private final C0840b f1085a;

    /* renamed from: b */
    private C0962j f1086b;

    /* renamed from: c */
    private C0959g f1087c;

    /* renamed from: d */
    private boolean f1088d;

    C0945a(C0840b bVar) {
        int j = bVar.mo9064j();
        if (j < 21 || (j & 3) != 1) {
            throw C0820g.m1114a();
        }
        this.f1085a = bVar;
    }

    /* renamed from: a */
    private int m1700a(int i, int i2, int i3) {
        return this.f1088d ? this.f1085a.mo9059d(i2, i) : this.f1085a.mo9059d(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9300b() {
        int i = 0;
        while (i < this.f1085a.mo9067m()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f1085a.mo9064j(); i3++) {
                if (this.f1085a.mo9059d(i, i3) != this.f1085a.mo9059d(i3, i)) {
                    this.f1085a.mo9057c(i3, i);
                    this.f1085a.mo9057c(i, i3);
                }
            }
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo9301c() {
        C0959g d = mo9302d();
        C0962j e = mo9303e();
        C0947c cVar = C0947c.values()[d.mo9312c()];
        int j = this.f1085a.mo9064j();
        cVar.mo9309b(this.f1085a, j);
        C0840b a = e.mo9319a();
        byte[] bArr = new byte[e.mo9323h()];
        int i = j - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < j; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!a.mo9059d(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f1085a.mo9059d(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == e.mo9323h()) {
            return bArr;
        }
        throw C0820g.m1114a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0959g mo9302d() {
        C0959g gVar = this.f1087c;
        if (gVar != null) {
            return gVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m1700a(i3, 8, i2);
        }
        int a = m1700a(8, 7, m1700a(8, 8, m1700a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = m1700a(8, i4, a);
        }
        int j = this.f1085a.mo9064j();
        int i5 = j - 7;
        for (int i6 = j - 1; i6 >= i5; i6--) {
            i = m1700a(8, i6, i);
        }
        for (int i7 = j - 8; i7 < j; i7++) {
            i = m1700a(i7, 8, i);
        }
        C0959g a2 = C0959g.m1733a(a, i);
        this.f1087c = a2;
        if (a2 != null) {
            return a2;
        }
        throw C0820g.m1114a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0962j mo9303e() {
        C0962j jVar = this.f1086b;
        if (jVar != null) {
            return jVar;
        }
        int j = this.f1085a.mo9064j();
        int i = (j - 17) / 4;
        if (i <= 6) {
            return C0962j.m1745i(i);
        }
        int i2 = j - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = j - 9; i6 >= i2; i6--) {
                i4 = m1700a(i6, i5, i4);
            }
        }
        C0962j c = C0962j.m1743c(i4);
        if (c == null || c.mo9321e() != j) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = j - 9; i8 >= i2; i8--) {
                    i3 = m1700a(i7, i8, i3);
                }
            }
            C0962j c2 = C0962j.m1743c(i3);
            if (c2 == null || c2.mo9321e() != j) {
                throw C0820g.m1114a();
            }
            this.f1086b = c2;
            return c2;
        }
        this.f1086b = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9304f() {
        if (this.f1087c != null) {
            C0947c.values()[this.f1087c.mo9312c()].mo9309b(this.f1085a, this.f1085a.mo9064j());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9305g(boolean z) {
        this.f1086b = null;
        this.f1087c = null;
        this.f1088d = z;
    }
}
