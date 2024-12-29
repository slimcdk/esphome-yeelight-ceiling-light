package okio;

import javax.annotation.Nullable;

/* renamed from: okio.o */
final class C3568o {

    /* renamed from: a */
    final byte[] f5937a;

    /* renamed from: b */
    int f5938b;

    /* renamed from: c */
    int f5939c;

    /* renamed from: d */
    boolean f5940d;

    /* renamed from: e */
    boolean f5941e;

    /* renamed from: f */
    C3568o f5942f;

    /* renamed from: g */
    C3568o f5943g;

    C3568o() {
        this.f5937a = new byte[8192];
        this.f5941e = true;
        this.f5940d = false;
    }

    C3568o(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f5937a = bArr;
        this.f5938b = i;
        this.f5939c = i2;
        this.f5940d = z;
        this.f5941e = z2;
    }

    /* renamed from: a */
    public final void mo24804a() {
        C3568o oVar = this.f5943g;
        if (oVar == this) {
            throw new IllegalStateException();
        } else if (oVar.f5941e) {
            int i = this.f5939c - this.f5938b;
            if (i <= (8192 - oVar.f5939c) + (oVar.f5940d ? 0 : oVar.f5938b)) {
                mo24809f(oVar, i);
                mo24805b();
                C3569p.m10054a(this);
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public final C3568o mo24805b() {
        C3568o oVar = this.f5942f;
        C3568o oVar2 = oVar != this ? oVar : null;
        C3568o oVar3 = this.f5943g;
        oVar3.f5942f = oVar;
        this.f5942f.f5943g = oVar3;
        this.f5942f = null;
        this.f5943g = null;
        return oVar2;
    }

    /* renamed from: c */
    public final C3568o mo24806c(C3568o oVar) {
        oVar.f5943g = this;
        oVar.f5942f = this.f5942f;
        this.f5942f.f5943g = oVar;
        this.f5942f = oVar;
        return oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C3568o mo24807d() {
        this.f5940d = true;
        return new C3568o(this.f5937a, this.f5938b, this.f5939c, true, false);
    }

    /* renamed from: e */
    public final C3568o mo24808e(int i) {
        C3568o oVar;
        if (i <= 0 || i > this.f5939c - this.f5938b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            oVar = mo24807d();
        } else {
            oVar = C3569p.m10055b();
            System.arraycopy(this.f5937a, this.f5938b, oVar.f5937a, 0, i);
        }
        oVar.f5939c = oVar.f5938b + i;
        this.f5938b += i;
        this.f5943g.mo24806c(oVar);
        return oVar;
    }

    /* renamed from: f */
    public final void mo24809f(C3568o oVar, int i) {
        if (oVar.f5941e) {
            int i2 = oVar.f5939c;
            if (i2 + i > 8192) {
                if (!oVar.f5940d) {
                    int i3 = oVar.f5938b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = oVar.f5937a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        oVar.f5939c -= oVar.f5938b;
                        oVar.f5938b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f5937a, this.f5938b, oVar.f5937a, oVar.f5939c, i);
            oVar.f5939c += i;
            this.f5938b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
