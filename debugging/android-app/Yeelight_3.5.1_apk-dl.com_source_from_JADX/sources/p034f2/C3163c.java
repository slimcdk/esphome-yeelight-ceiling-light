package p034f2;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* renamed from: f2.c */
public final class C3163c {

    /* renamed from: a */
    private final C3161a f5086a;

    public C3163c(C3161a aVar) {
        this.f5086a = aVar;
    }

    /* renamed from: b */
    private int[] m8504b(C3162b bVar) {
        int f = bVar.mo23685f();
        int i = 0;
        if (f == 1) {
            return new int[]{bVar.mo23683d(1)};
        }
        int[] iArr = new int[f];
        for (int i2 = 1; i2 < this.f5086a.mo23674f() && i < f; i2++) {
            if (bVar.mo23682c(i2) == 0) {
                iArr[i] = this.f5086a.mo23676h(i2);
                i++;
            }
        }
        if (i == f) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    private int[] m8505c(C3162b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int h = this.f5086a.mo23676h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int j = this.f5086a.mo23678j(iArr[i3], h);
                    i2 = this.f5086a.mo23678j(i2, (j & 1) == 0 ? j | 1 : j & -2);
                }
            }
            iArr2[i] = this.f5086a.mo23678j(bVar.mo23682c(h), this.f5086a.mo23676h(i2));
            if (this.f5086a.mo23672d() != 0) {
                iArr2[i] = this.f5086a.mo23678j(iArr2[i], h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    private C3162b[] m8506d(C3162b bVar, C3162b bVar2, int i) {
        if (bVar.mo23685f() < bVar2.mo23685f()) {
            C3162b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        C3162b g = this.f5086a.mo23675g();
        C3162b e = this.f5086a.mo23673e();
        do {
            C3162b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            C3162b bVar5 = e;
            C3162b bVar6 = g;
            g = bVar5;
            if (bVar.mo23685f() < i / 2) {
                int d = g.mo23683d(0);
                if (d != 0) {
                    int h = this.f5086a.mo23676h(d);
                    return new C3162b[]{g.mo23687h(h), bVar.mo23687h(h)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            } else if (!bVar.mo23686g()) {
                C3162b g2 = this.f5086a.mo23675g();
                int h2 = this.f5086a.mo23676h(bVar.mo23683d(bVar.mo23685f()));
                while (r11.mo23685f() >= bVar.mo23685f() && !r11.mo23686g()) {
                    int f = r11.mo23685f() - bVar.mo23685f();
                    int j = this.f5086a.mo23678j(r11.mo23683d(r11.mo23685f()), h2);
                    g2 = g2.mo23680a(this.f5086a.mo23670b(f, j));
                    r11 = r11.mo23680a(bVar.mo23689j(f, j));
                }
                e = g2.mo23688i(g).mo23680a(bVar6);
            } else {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
        } while (r11.mo23685f() < bVar.mo23685f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    public void mo23691a(int[] iArr, int i) {
        C3162b bVar = new C3162b(this.f5086a, iArr);
        int[] iArr2 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            C3161a aVar = this.f5086a;
            int c = bVar.mo23682c(aVar.mo23671c(aVar.mo23672d() + i3));
            iArr2[(i - 1) - i3] = c;
            if (c != 0) {
                z = false;
            }
        }
        if (!z) {
            C3162b[] d = m8506d(this.f5086a.mo23670b(i, 1), new C3162b(this.f5086a, iArr2), i);
            C3162b bVar2 = d[0];
            C3162b bVar3 = d[1];
            int[] b = m8504b(bVar2);
            int[] c2 = m8505c(bVar3, b);
            while (i2 < b.length) {
                int length = (iArr.length - 1) - this.f5086a.mo23677i(b[i2]);
                if (length >= 0) {
                    iArr[length] = C3161a.m8484a(iArr[length], c2[i2]);
                    i2++;
                } else {
                    throw new ReedSolomonException("Bad error location");
                }
            }
        }
    }
}
