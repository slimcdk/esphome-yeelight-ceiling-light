package p011c.p012a.p053e.p069x.p070d.p071k;

/* renamed from: c.a.e.x.d.k.c */
final class C0941c {

    /* renamed from: a */
    private final C0940b f1075a;

    /* renamed from: b */
    private final int[] f1076b;

    C0941c(C0940b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f1075a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f1076b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f1076b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f1076b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0941c mo9287a(C0941c cVar) {
        if (!this.f1075a.equals(cVar.f1075a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo9291e()) {
            return cVar;
        } else {
            if (cVar.mo9291e()) {
                return this;
            }
            int[] iArr = this.f1076b;
            int[] iArr2 = cVar.f1076b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = this.f1075a.mo9277a(iArr2[i - length], iArr[i]);
            }
            return new C0941c(this.f1075a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9288b(int i) {
        if (i == 0) {
            return mo9289c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f1076b) {
                i2 = this.f1075a.mo9277a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f1076b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            C0940b bVar = this.f1075a;
            i3 = bVar.mo9277a(bVar.mo9285i(i, i3), this.f1076b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9289c(int i) {
        int[] iArr = this.f1076b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo9290d() {
        return this.f1076b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9291e() {
        return this.f1076b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0941c mo9292f(int i) {
        if (i == 0) {
            return this.f1075a.mo9282f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f1076b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f1075a.mo9285i(this.f1076b[i2], i);
        }
        return new C0941c(this.f1075a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0941c mo9293g(C0941c cVar) {
        if (!this.f1075a.equals(cVar.f1075a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo9291e() || cVar.mo9291e()) {
            return this.f1075a.mo9282f();
        } else {
            int[] iArr = this.f1076b;
            int length = iArr.length;
            int[] iArr2 = cVar.f1076b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C0940b bVar = this.f1075a;
                    iArr3[i4] = bVar.mo9277a(iArr3[i4], bVar.mo9285i(i2, iArr2[i3]));
                }
            }
            return new C0941c(this.f1075a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0941c mo9294h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f1075a.mo9282f();
        } else {
            int length = this.f1076b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f1075a.mo9285i(this.f1076b[i3], i2);
            }
            return new C0941c(this.f1075a, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0941c mo9295i() {
        int length = this.f1076b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f1075a.mo9286j(0, this.f1076b[i]);
        }
        return new C0941c(this.f1075a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0941c mo9296j(C0941c cVar) {
        if (this.f1075a.equals(cVar.f1075a)) {
            return cVar.mo9291e() ? this : mo9287a(cVar.mo9295i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo9290d() * 8);
        for (int d = mo9290d(); d >= 0; d--) {
            int c = mo9289c(d);
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
