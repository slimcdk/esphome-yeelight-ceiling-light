package p067m2;

/* renamed from: m2.c */
final class C3347c {

    /* renamed from: a */
    private final C3346b f5441a;

    /* renamed from: b */
    private final int[] f5442b;

    C3347c(C3346b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f5441a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f5442b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f5442b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f5442b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3347c mo24082a(C3347c cVar) {
        if (!this.f5441a.equals(cVar.f5441a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo24086e()) {
            return cVar;
        } else {
            if (cVar.mo24086e()) {
                return this;
            }
            int[] iArr = this.f5442b;
            int[] iArr2 = cVar.f5442b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = this.f5441a.mo24072a(iArr2[i - length], iArr[i]);
            }
            return new C3347c(this.f5441a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo24083b(int i) {
        if (i == 0) {
            return mo24084c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f5442b) {
                i2 = this.f5441a.mo24072a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f5442b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            C3346b bVar = this.f5441a;
            i3 = bVar.mo24072a(bVar.mo24080i(i, i3), this.f5442b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24084c(int i) {
        int[] iArr = this.f5442b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo24085d() {
        return this.f5442b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo24086e() {
        return this.f5442b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C3347c mo24087f(int i) {
        if (i == 0) {
            return this.f5441a.mo24077f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f5442b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f5441a.mo24080i(this.f5442b[i2], i);
        }
        return new C3347c(this.f5441a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C3347c mo24088g(C3347c cVar) {
        if (!this.f5441a.equals(cVar.f5441a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo24086e() || cVar.mo24086e()) {
            return this.f5441a.mo24077f();
        } else {
            int[] iArr = this.f5442b;
            int length = iArr.length;
            int[] iArr2 = cVar.f5442b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C3346b bVar = this.f5441a;
                    iArr3[i4] = bVar.mo24072a(iArr3[i4], bVar.mo24080i(i2, iArr2[i3]));
                }
            }
            return new C3347c(this.f5441a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C3347c mo24089h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f5441a.mo24077f();
        } else {
            int length = this.f5442b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f5441a.mo24080i(this.f5442b[i3], i2);
            }
            return new C3347c(this.f5441a, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C3347c mo24090i() {
        int length = this.f5442b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f5441a.mo24081j(0, this.f5442b[i]);
        }
        return new C3347c(this.f5441a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C3347c mo24091j(C3347c cVar) {
        if (this.f5441a.equals(cVar.f5441a)) {
            return cVar.mo24086e() ? this : mo24082a(cVar.mo24090i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo24085d() * 8);
        for (int d = mo24085d(); d >= 0; d--) {
            int c = mo24084c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    sb.append(c);
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
