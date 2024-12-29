package p011c.p012a.p053e.p057t.p059n;

/* renamed from: c.a.e.t.n.c */
public final class C0855c {

    /* renamed from: a */
    private final C0853a f862a;

    public C0855c(C0853a aVar) {
        this.f862a = aVar;
    }

    /* renamed from: b */
    private int[] m1287b(C0854b bVar) {
        int f = bVar.mo9115f();
        int i = 0;
        if (f == 1) {
            return new int[]{bVar.mo9113d(1)};
        }
        int[] iArr = new int[f];
        for (int i2 = 1; i2 < this.f862a.mo9104f() && i < f; i2++) {
            if (bVar.mo9112c(i2) == 0) {
                iArr[i] = this.f862a.mo9106h(i2);
                i++;
            }
        }
        if (i == f) {
            return iArr;
        }
        throw new C0857e("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    private int[] m1288c(C0854b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int h = this.f862a.mo9106h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int j = this.f862a.mo9108j(iArr[i3], h);
                    i2 = this.f862a.mo9108j(i2, (j & 1) == 0 ? j | 1 : j & -2);
                }
            }
            iArr2[i] = this.f862a.mo9108j(bVar.mo9112c(h), this.f862a.mo9106h(i2));
            if (this.f862a.mo9102d() != 0) {
                iArr2[i] = this.f862a.mo9108j(iArr2[i], h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    private C0854b[] m1289d(C0854b bVar, C0854b bVar2, int i) {
        if (bVar.mo9115f() < bVar2.mo9115f()) {
            C0854b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        C0854b g = this.f862a.mo9105g();
        C0854b e = this.f862a.mo9103e();
        do {
            C0854b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            C0854b bVar5 = e;
            C0854b bVar6 = g;
            g = bVar5;
            if (bVar.mo9115f() < i / 2) {
                int d = g.mo9113d(0);
                if (d != 0) {
                    int h = this.f862a.mo9106h(d);
                    return new C0854b[]{g.mo9117h(h), bVar.mo9117h(h)};
                }
                throw new C0857e("sigmaTilde(0) was zero");
            } else if (!bVar.mo9116g()) {
                C0854b g2 = this.f862a.mo9105g();
                int h2 = this.f862a.mo9106h(bVar.mo9113d(bVar.mo9115f()));
                while (r11.mo9115f() >= bVar.mo9115f() && !r11.mo9116g()) {
                    int f = r11.mo9115f() - bVar.mo9115f();
                    int j = this.f862a.mo9108j(r11.mo9113d(r11.mo9115f()), h2);
                    g2 = g2.mo9110a(this.f862a.mo9100b(f, j));
                    r11 = r11.mo9110a(bVar.mo9119j(f, j));
                }
                e = g2.mo9118i(g).mo9110a(bVar6);
            } else {
                throw new C0857e("r_{i-1} was zero");
            }
        } while (r11.mo9115f() < bVar.mo9115f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    public void mo9121a(int[] iArr, int i) {
        C0854b bVar = new C0854b(this.f862a, iArr);
        int[] iArr2 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            C0853a aVar = this.f862a;
            int c = bVar.mo9112c(aVar.mo9101c(aVar.mo9102d() + i3));
            iArr2[(i - 1) - i3] = c;
            if (c != 0) {
                z = false;
            }
        }
        if (!z) {
            C0854b[] d = m1289d(this.f862a.mo9100b(i, 1), new C0854b(this.f862a, iArr2), i);
            C0854b bVar2 = d[0];
            C0854b bVar3 = d[1];
            int[] b = m1287b(bVar2);
            int[] c2 = m1288c(bVar3, b);
            while (i2 < b.length) {
                int length = (iArr.length - 1) - this.f862a.mo9107i(b[i2]);
                if (length >= 0) {
                    iArr[length] = C0853a.m1267a(iArr[length], c2[i2]);
                    i2++;
                } else {
                    throw new C0857e("Bad error location");
                }
            }
        }
    }
}
