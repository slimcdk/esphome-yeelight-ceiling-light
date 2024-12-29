package p034f2;

/* renamed from: f2.b */
final class C3162b {

    /* renamed from: a */
    private final C3161a f5084a;

    /* renamed from: b */
    private final int[] f5085b;

    C3162b(C3161a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f5084a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f5085b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f5085b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f5085b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3162b mo23680a(C3162b bVar) {
        if (!this.f5084a.equals(bVar.f5084a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo23686g()) {
            return bVar;
        } else {
            if (bVar.mo23686g()) {
                return this;
            }
            int[] iArr = this.f5085b;
            int[] iArr2 = bVar.f5085b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = C3161a.m8484a(iArr2[i - length], iArr[i]);
            }
            return new C3162b(this.f5084a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3162b[] mo23681b(C3162b bVar) {
        if (!this.f5084a.equals(bVar.f5084a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.mo23686g()) {
            C3162b g = this.f5084a.mo23675g();
            int h = this.f5084a.mo23676h(bVar.mo23683d(bVar.mo23685f()));
            C3162b bVar2 = this;
            while (bVar2.mo23685f() >= bVar.mo23685f() && !bVar2.mo23686g()) {
                int f = bVar2.mo23685f() - bVar.mo23685f();
                int j = this.f5084a.mo23678j(bVar2.mo23683d(bVar2.mo23685f()), h);
                C3162b j2 = bVar.mo23689j(f, j);
                g = g.mo23680a(this.f5084a.mo23670b(f, j));
                bVar2 = bVar2.mo23680a(j2);
            }
            return new C3162b[]{g, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo23682c(int i) {
        if (i == 0) {
            return mo23683d(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f5085b) {
                i2 = C3161a.m8484a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f5085b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            i3 = C3161a.m8484a(this.f5084a.mo23678j(i, i3), this.f5085b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo23683d(int i) {
        int[] iArr = this.f5085b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo23684e() {
        return this.f5085b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo23685f() {
        return this.f5085b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo23686g() {
        return this.f5085b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C3162b mo23687h(int i) {
        if (i == 0) {
            return this.f5084a.mo23675g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f5085b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f5084a.mo23678j(this.f5085b[i2], i);
        }
        return new C3162b(this.f5084a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C3162b mo23688i(C3162b bVar) {
        if (!this.f5084a.equals(bVar.f5084a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo23686g() || bVar.mo23686g()) {
            return this.f5084a.mo23675g();
        } else {
            int[] iArr = this.f5085b;
            int length = iArr.length;
            int[] iArr2 = bVar.f5085b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C3161a.m8484a(iArr3[i4], this.f5084a.mo23678j(i2, iArr2[i3]));
                }
            }
            return new C3162b(this.f5084a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C3162b mo23689j(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f5084a.mo23675g();
        } else {
            int length = this.f5085b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f5084a.mo23678j(this.f5085b[i3], i2);
            }
            return new C3162b(this.f5084a, iArr);
        }
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(mo23685f() * 8);
        for (int f = mo23685f(); f >= 0; f--) {
            int d = mo23683d(f);
            if (d != 0) {
                if (d < 0) {
                    sb.append(" - ");
                    d = -d;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (f == 0 || d != 1) {
                    int i = this.f5084a.mo23677i(d);
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
