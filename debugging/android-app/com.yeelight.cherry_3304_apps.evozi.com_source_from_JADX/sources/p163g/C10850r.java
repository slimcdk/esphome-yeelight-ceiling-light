package p163g;

import java.util.Arrays;

/* renamed from: g.r */
final class C10850r extends C4411f {

    /* renamed from: f */
    final transient byte[][] f20928f;

    /* renamed from: g */
    final transient int[] f20929g;

    C10850r(C4406c cVar, int i) {
        super((byte[]) null);
        C10851v.m27080b(cVar.f7949b, 0, (long) i);
        C4413p pVar = cVar.f7948a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = pVar.f7960c;
            int i6 = pVar.f7959b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                pVar = pVar.f7963f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f20928f = new byte[i4][];
        this.f20929g = new int[(i4 * 2)];
        C4413p pVar2 = cVar.f7948a;
        int i7 = 0;
        while (i2 < i) {
            this.f20928f[i7] = pVar2.f7958a;
            i2 += pVar2.f7960c - pVar2.f7959b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f20929g;
            iArr[i7] = i2;
            iArr[this.f20928f.length + i7] = pVar2.f7959b;
            pVar2.f7961d = true;
            i7++;
            pVar2 = pVar2.f7963f;
        }
    }

    /* renamed from: x */
    private int m27063x(int i) {
        int binarySearch = Arrays.binarySearch(this.f20929g, 0, this.f20928f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    /* renamed from: y */
    private C4411f m27064y() {
        return new C4411f(mo24302u());
    }

    /* renamed from: a */
    public String mo24285a() {
        return m27064y().mo24285a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4411f) {
            C4411f fVar = (C4411f) obj;
            return fVar.mo24297q() == mo24297q() && mo24293m(0, fVar, 0, mo24297q());
        }
    }

    public int hashCode() {
        int i = this.f7955b;
        if (i != 0) {
            return i;
        }
        int length = this.f20928f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f20928f[i2];
            int[] iArr = this.f20929g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f7955b = i4;
        return i4;
    }

    /* renamed from: i */
    public byte mo24290i(int i) {
        C10851v.m27080b((long) this.f20929g[this.f20928f.length - 1], (long) i, 1);
        int x = m27063x(i);
        int i2 = x == 0 ? 0 : this.f20929g[x - 1];
        int[] iArr = this.f20929g;
        byte[][] bArr = this.f20928f;
        return bArr[x][(i - i2) + iArr[bArr.length + x]];
    }

    /* renamed from: j */
    public String mo24291j() {
        return m27064y().mo24291j();
    }

    /* renamed from: k */
    public C4411f mo24292k() {
        return m27064y().mo24292k();
    }

    /* renamed from: m */
    public boolean mo24293m(int i, C4411f fVar, int i2, int i3) {
        if (i < 0 || i > mo24297q() - i3) {
            return false;
        }
        int x = m27063x(i);
        while (i3 > 0) {
            int i4 = x == 0 ? 0 : this.f20929g[x - 1];
            int min = Math.min(i3, ((this.f20929g[x] - i4) + i4) - i);
            int[] iArr = this.f20929g;
            byte[][] bArr = this.f20928f;
            if (!fVar.mo24294n(i2, bArr[x], (i - i4) + iArr[bArr.length + x], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            x++;
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo24294n(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo24297q() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int x = m27063x(i);
        while (i3 > 0) {
            int i4 = x == 0 ? 0 : this.f20929g[x - 1];
            int min = Math.min(i3, ((this.f20929g[x] - i4) + i4) - i);
            int[] iArr = this.f20929g;
            byte[][] bArr2 = this.f20928f;
            if (!C10851v.m27079a(bArr2[x], (i - i4) + iArr[bArr2.length + x], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            x++;
        }
        return true;
    }

    /* renamed from: o */
    public C4411f mo24295o() {
        return m27064y().mo24295o();
    }

    /* renamed from: p */
    public C4411f mo24296p() {
        return m27064y().mo24296p();
    }

    /* renamed from: q */
    public int mo24297q() {
        return this.f20929g[this.f20928f.length - 1];
    }

    /* renamed from: s */
    public C4411f mo24299s(int i, int i2) {
        return m27064y().mo24299s(i, i2);
    }

    /* renamed from: t */
    public C4411f mo24300t() {
        return m27064y().mo24300t();
    }

    public String toString() {
        return m27064y().toString();
    }

    /* renamed from: u */
    public byte[] mo24302u() {
        int[] iArr = this.f20929g;
        byte[][] bArr = this.f20928f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f20929g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f20928f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* renamed from: v */
    public String mo24303v() {
        return m27064y().mo24303v();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo24304w(C4406c cVar) {
        int length = this.f20928f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f20929g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C4413p pVar = new C4413p(this.f20928f[i], i3, (i3 + i4) - i2, true, false);
            C4413p pVar2 = cVar.f7948a;
            if (pVar2 == null) {
                pVar.f7964g = pVar;
                pVar.f7963f = pVar;
                cVar.f7948a = pVar;
            } else {
                pVar2.f7964g.mo24307c(pVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f7949b += (long) i2;
    }
}
