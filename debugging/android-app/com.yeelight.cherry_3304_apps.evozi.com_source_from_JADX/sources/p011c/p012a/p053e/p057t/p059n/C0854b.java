package p011c.p012a.p053e.p057t.p059n;

/* renamed from: c.a.e.t.n.b */
final class C0854b {

    /* renamed from: a */
    private final C0853a f860a;

    /* renamed from: b */
    private final int[] f861b;

    C0854b(C0853a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f860a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f861b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f861b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f861b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0854b mo9110a(C0854b bVar) {
        if (!this.f860a.equals(bVar.f860a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo9116g()) {
            return bVar;
        } else {
            if (bVar.mo9116g()) {
                return this;
            }
            int[] iArr = this.f861b;
            int[] iArr2 = bVar.f861b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = C0853a.m1267a(iArr2[i - length], iArr[i]);
            }
            return new C0854b(this.f860a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0854b[] mo9111b(C0854b bVar) {
        if (!this.f860a.equals(bVar.f860a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.mo9116g()) {
            C0854b g = this.f860a.mo9105g();
            int h = this.f860a.mo9106h(bVar.mo9113d(bVar.mo9115f()));
            C0854b bVar2 = this;
            while (bVar2.mo9115f() >= bVar.mo9115f() && !bVar2.mo9116g()) {
                int f = bVar2.mo9115f() - bVar.mo9115f();
                int j = this.f860a.mo9108j(bVar2.mo9113d(bVar2.mo9115f()), h);
                C0854b j2 = bVar.mo9119j(f, j);
                g = g.mo9110a(this.f860a.mo9100b(f, j));
                bVar2 = bVar2.mo9110a(j2);
            }
            return new C0854b[]{g, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9112c(int i) {
        if (i == 0) {
            return mo9113d(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f861b) {
                i2 = C0853a.m1267a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f861b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            i3 = C0853a.m1267a(this.f860a.mo9108j(i, i3), this.f861b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo9113d(int i) {
        int[] iArr = this.f861b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo9114e() {
        return this.f861b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo9115f() {
        return this.f861b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo9116g() {
        return this.f861b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0854b mo9117h(int i) {
        if (i == 0) {
            return this.f860a.mo9105g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f861b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f860a.mo9108j(this.f861b[i2], i);
        }
        return new C0854b(this.f860a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0854b mo9118i(C0854b bVar) {
        if (!this.f860a.equals(bVar.f860a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo9116g() || bVar.mo9116g()) {
            return this.f860a.mo9105g();
        } else {
            int[] iArr = this.f861b;
            int length = iArr.length;
            int[] iArr2 = bVar.f861b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C0853a.m1267a(iArr3[i4], this.f860a.mo9108j(i2, iArr2[i3]));
                }
            }
            return new C0854b(this.f860a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0854b mo9119j(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f860a.mo9105g();
        } else {
            int length = this.f861b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f860a.mo9108j(this.f861b[i3], i2);
            }
            return new C0854b(this.f860a, iArr);
        }
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(mo9115f() * 8);
        for (int f = mo9115f(); f >= 0; f--) {
            int d = mo9113d(f);
            if (d != 0) {
                if (d < 0) {
                    sb.append(" - ");
                    d = -d;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (f == 0 || d != 1) {
                    int i = this.f860a.mo9107i(d);
                    if (i == 0) {
                        c = '1';
                    } else if (i == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                    sb.append(c);
                }
                if (f != 0) {
                    if (f == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(f);
                    }
                }
            }
        }
        return sb.toString();
    }
}
