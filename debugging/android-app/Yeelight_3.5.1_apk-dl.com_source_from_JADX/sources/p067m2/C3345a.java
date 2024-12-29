package p067m2;

import com.google.zxing.ChecksumException;

/* renamed from: m2.a */
public final class C3345a {

    /* renamed from: a */
    private final C3346b f5434a = C3346b.f5435f;

    /* renamed from: b */
    private int[] m9098b(C3347c cVar) {
        int d = cVar.mo24085d();
        int[] iArr = new int[d];
        int i = 0;
        for (int i2 = 1; i2 < this.f5434a.mo24076e() && i < d; i2++) {
            if (cVar.mo24083b(i2) == 0) {
                iArr[i] = this.f5434a.mo24078g(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* renamed from: c */
    private int[] m9099c(C3347c cVar, C3347c cVar2, int[] iArr) {
        int d = cVar2.mo24085d();
        int[] iArr2 = new int[d];
        for (int i = 1; i <= d; i++) {
            iArr2[d - i] = this.f5434a.mo24080i(i, cVar2.mo24084c(i));
        }
        C3347c cVar3 = new C3347c(this.f5434a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.f5434a.mo24078g(iArr[i2]);
            iArr3[i2] = this.f5434a.mo24080i(this.f5434a.mo24081j(0, cVar.mo24083b(g)), this.f5434a.mo24078g(cVar3.mo24083b(g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    private C3347c[] m9100d(C3347c cVar, C3347c cVar2, int i) {
        if (cVar.mo24085d() < cVar2.mo24085d()) {
            C3347c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        C3347c f = this.f5434a.mo24077f();
        C3347c d = this.f5434a.mo24075d();
        while (true) {
            C3347c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            C3347c cVar5 = d;
            C3347c cVar6 = f;
            f = cVar5;
            if (cVar.mo24085d() < i / 2) {
                int c = f.mo24084c(0);
                if (c != 0) {
                    int g = this.f5434a.mo24078g(c);
                    return new C3347c[]{f.mo24087f(g), cVar.mo24087f(g)};
                }
                throw ChecksumException.getChecksumInstance();
            } else if (!cVar.mo24086e()) {
                C3347c f2 = this.f5434a.mo24077f();
                int g2 = this.f5434a.mo24078g(cVar.mo24084c(cVar.mo24085d()));
                while (r11.mo24085d() >= cVar.mo24085d() && !r11.mo24086e()) {
                    int d2 = r11.mo24085d() - cVar.mo24085d();
                    int i2 = this.f5434a.mo24080i(r11.mo24084c(r11.mo24085d()), g2);
                    f2 = f2.mo24082a(this.f5434a.mo24073b(d2, i2));
                    r11 = r11.mo24091j(cVar.mo24089h(d2, i2));
                }
                d = f2.mo24088g(f).mo24091j(cVar6).mo24090i();
            } else {
                throw ChecksumException.getChecksumInstance();
            }
        }
    }

    /* renamed from: a */
    public int mo24071a(int[] iArr, int i, int[] iArr2) {
        C3347c cVar = new C3347c(this.f5434a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int b = cVar.mo24083b(this.f5434a.mo24074c(i3));
            iArr3[i - i3] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C3347c d = this.f5434a.mo24075d();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int c = this.f5434a.mo24074c((iArr.length - 1) - length);
                C3346b bVar = this.f5434a;
                d = d.mo24088g(new C3347c(bVar, new int[]{bVar.mo24081j(0, c), 1}));
            }
        }
        C3347c[] d2 = m9100d(this.f5434a.mo24073b(i, 1), new C3347c(this.f5434a, iArr3), i);
        C3347c cVar2 = d2[0];
        C3347c cVar3 = d2[1];
        int[] b2 = m9098b(cVar2);
        int[] c2 = m9099c(cVar3, cVar2, b2);
        while (i2 < b2.length) {
            int length2 = (iArr.length - 1) - this.f5434a.mo24079h(b2[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f5434a.mo24081j(iArr[length2], c2[i2]);
                i2++;
            } else {
                throw ChecksumException.getChecksumInstance();
            }
        }
        return b2.length;
    }
}
