package p163g;

import javax.annotation.Nullable;

/* renamed from: g.p */
final class C4413p {

    /* renamed from: a */
    final byte[] f7958a;

    /* renamed from: b */
    int f7959b;

    /* renamed from: c */
    int f7960c;

    /* renamed from: d */
    boolean f7961d;

    /* renamed from: e */
    boolean f7962e;

    /* renamed from: f */
    C4413p f7963f;

    /* renamed from: g */
    C4413p f7964g;

    C4413p() {
        this.f7958a = new byte[8192];
        this.f7962e = true;
        this.f7961d = false;
    }

    C4413p(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f7958a = bArr;
        this.f7959b = i;
        this.f7960c = i2;
        this.f7961d = z;
        this.f7962e = z2;
    }

    /* renamed from: a */
    public final void mo24305a() {
        C4413p pVar = this.f7964g;
        if (pVar == this) {
            throw new IllegalStateException();
        } else if (pVar.f7962e) {
            int i = this.f7960c - this.f7959b;
            if (i <= (8192 - pVar.f7960c) + (pVar.f7961d ? 0 : pVar.f7959b)) {
                mo24310f(this.f7964g, i);
                mo24306b();
                C4414q.m12894a(this);
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public final C4413p mo24306b() {
        C4413p pVar = this.f7963f;
        if (pVar == this) {
            pVar = null;
        }
        C4413p pVar2 = this.f7964g;
        pVar2.f7963f = this.f7963f;
        this.f7963f.f7964g = pVar2;
        this.f7963f = null;
        this.f7964g = null;
        return pVar;
    }

    /* renamed from: c */
    public final C4413p mo24307c(C4413p pVar) {
        pVar.f7964g = this;
        pVar.f7963f = this.f7963f;
        this.f7963f.f7964g = pVar;
        this.f7963f = pVar;
        return pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C4413p mo24308d() {
        this.f7961d = true;
        return new C4413p(this.f7958a, this.f7959b, this.f7960c, true, false);
    }

    /* renamed from: e */
    public final C4413p mo24309e(int i) {
        C4413p pVar;
        if (i <= 0 || i > this.f7960c - this.f7959b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            pVar = mo24308d();
        } else {
            pVar = C4414q.m12895b();
            System.arraycopy(this.f7958a, this.f7959b, pVar.f7958a, 0, i);
        }
        pVar.f7960c = pVar.f7959b + i;
        this.f7959b += i;
        this.f7964g.mo24307c(pVar);
        return pVar;
    }

    /* renamed from: f */
    public final void mo24310f(C4413p pVar, int i) {
        if (pVar.f7962e) {
            int i2 = pVar.f7960c;
            if (i2 + i > 8192) {
                if (!pVar.f7961d) {
                    int i3 = pVar.f7959b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = pVar.f7958a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        pVar.f7960c -= pVar.f7959b;
                        pVar.f7959b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f7958a, this.f7959b, pVar.f7958a, pVar.f7960c, i);
            pVar.f7960c += i;
            this.f7959b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
