package p011c.p012a.p053e.p069x.p070d.p071k;

import p011c.p012a.p053e.C0817d;

/* renamed from: c.a.e.x.d.k.a */
public final class C0939a {

    /* renamed from: a */
    private final C0940b f1068a = C0940b.f1069f;

    /* renamed from: b */
    private int[] m1664b(C0941c cVar) {
        int d = cVar.mo9290d();
        int[] iArr = new int[d];
        int i = 0;
        for (int i2 = 1; i2 < this.f1068a.mo9281e() && i < d; i2++) {
            if (cVar.mo9288b(i2) == 0) {
                iArr[i] = this.f1068a.mo9283g(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw C0817d.m1112a();
    }

    /* renamed from: c */
    private int[] m1665c(C0941c cVar, C0941c cVar2, int[] iArr) {
        int d = cVar2.mo9290d();
        int[] iArr2 = new int[d];
        for (int i = 1; i <= d; i++) {
            iArr2[d - i] = this.f1068a.mo9285i(i, cVar2.mo9289c(i));
        }
        C0941c cVar3 = new C0941c(this.f1068a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.f1068a.mo9283g(iArr[i2]);
            iArr3[i2] = this.f1068a.mo9285i(this.f1068a.mo9286j(0, cVar.mo9288b(g)), this.f1068a.mo9283g(cVar3.mo9288b(g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    private C0941c[] m1666d(C0941c cVar, C0941c cVar2, int i) {
        if (cVar.mo9290d() < cVar2.mo9290d()) {
            C0941c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        C0941c f = this.f1068a.mo9282f();
        C0941c d = this.f1068a.mo9280d();
        while (true) {
            C0941c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            C0941c cVar5 = d;
            C0941c cVar6 = f;
            f = cVar5;
            if (cVar.mo9290d() < i / 2) {
                int c = f.mo9289c(0);
                if (c != 0) {
                    int g = this.f1068a.mo9283g(c);
                    return new C0941c[]{f.mo9292f(g), cVar.mo9292f(g)};
                }
                throw C0817d.m1112a();
            } else if (!cVar.mo9291e()) {
                C0941c f2 = this.f1068a.mo9282f();
                int g2 = this.f1068a.mo9283g(cVar.mo9289c(cVar.mo9290d()));
                while (r11.mo9290d() >= cVar.mo9290d() && !r11.mo9291e()) {
                    int d2 = r11.mo9290d() - cVar.mo9290d();
                    int i2 = this.f1068a.mo9285i(r11.mo9289c(r11.mo9290d()), g2);
                    f2 = f2.mo9287a(this.f1068a.mo9278b(d2, i2));
                    r11 = r11.mo9296j(cVar.mo9294h(d2, i2));
                }
                d = f2.mo9293g(f).mo9296j(cVar6).mo9295i();
            } else {
                throw C0817d.m1112a();
            }
        }
    }

    /* renamed from: a */
    public int mo9276a(int[] iArr, int i, int[] iArr2) {
        C0941c cVar = new C0941c(this.f1068a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int b = cVar.mo9288b(this.f1068a.mo9279c(i3));
            iArr3[i - i3] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C0941c d = this.f1068a.mo9280d();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int c = this.f1068a.mo9279c((iArr.length - 1) - length);
                C0940b bVar = this.f1068a;
                d = d.mo9293g(new C0941c(bVar, new int[]{bVar.mo9286j(0, c), 1}));
            }
        }
        C0941c[] d2 = m1666d(this.f1068a.mo9278b(i, 1), new C0941c(this.f1068a, iArr3), i);
        C0941c cVar2 = d2[0];
        C0941c cVar3 = d2[1];
        int[] b2 = m1664b(cVar2);
        int[] c2 = m1665c(cVar3, cVar2, b2);
        while (i2 < b2.length) {
            int length2 = (iArr.length - 1) - this.f1068a.mo9284h(b2[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f1068a.mo9286j(iArr[length2], c2[i2]);
                i2++;
            } else {
                throw C0817d.m1112a();
            }
        }
        return b2.length;
    }
}
