package com.google.zxing.pdf417.decoder;

import com.google.zxing.C2564h;

/* renamed from: com.google.zxing.pdf417.decoder.g */
final class C2610g extends C2609f {

    /* renamed from: c */
    private final boolean f4457c;

    C2610g(C2606c cVar, boolean z) {
        super(cVar);
        this.f4457c = z;
    }

    /* renamed from: h */
    private void m7208h(C2604a aVar) {
        C2606c a = mo19633a();
        C2564h i = this.f4457c ? a.mo19611i() : a.mo19612j();
        C2564h c = this.f4457c ? a.mo19605c() : a.mo19606d();
        int e = mo19637e((int) c.mo19547d());
        C2607d[] d = mo19636d();
        int i2 = -1;
        int i3 = 0;
        int i4 = 1;
        for (int e2 = mo19637e((int) i.mo19547d()); e2 < e; e2++) {
            if (d[e2] != null) {
                C2607d dVar = d[e2];
                dVar.mo19622j();
                int c2 = dVar.mo19615c() - i2;
                if (c2 == 0) {
                    i3++;
                } else {
                    if (c2 == 1) {
                        i4 = Math.max(i4, i3);
                    } else if (dVar.mo19615c() >= aVar.mo19599c()) {
                        d[e2] = null;
                    }
                    i2 = dVar.mo19615c();
                    i3 = 1;
                }
            }
        }
    }

    /* renamed from: l */
    private void m7209l(C2607d[] dVarArr, C2604a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C2607d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int e = dVar.mo19617e() % 30;
                int c = dVar.mo19615c();
                if (c > aVar.mo19599c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f4457c) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != aVar.mo19597a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e / 3 != aVar.mo19598b() || e % 3 != aVar.mo19600d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != aVar.mo19601e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m7210m() {
        for (C2607d dVar : mo19636d()) {
            if (dVar != null) {
                dVar.mo19622j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo19640g(C2604a aVar) {
        C2607d[] d = mo19636d();
        m7210m();
        m7209l(d, aVar);
        C2606c a = mo19633a();
        C2564h i = this.f4457c ? a.mo19611i() : a.mo19612j();
        C2564h c = this.f4457c ? a.mo19605c() : a.mo19606d();
        int e = mo19637e((int) i.mo19547d());
        int e2 = mo19637e((int) c.mo19547d());
        int i2 = -1;
        int i3 = 0;
        int i4 = 1;
        while (e < e2) {
            if (d[e] != null) {
                C2607d dVar = d[e];
                int c2 = dVar.mo19615c() - i2;
                if (c2 == 0) {
                    i3++;
                } else {
                    if (c2 == 1) {
                        i4 = Math.max(i4, i3);
                    } else if (c2 < 0 || dVar.mo19615c() >= aVar.mo19599c() || c2 > e) {
                        d[e] = null;
                    } else {
                        if (i4 > 2) {
                            c2 *= i4 - 2;
                        }
                        boolean z = c2 >= e;
                        for (int i5 = 1; i5 <= c2 && !z; i5++) {
                            z = d[e - i5] != null;
                        }
                        if (z) {
                            d[e] = null;
                        }
                    }
                    i2 = dVar.mo19615c();
                    i3 = 1;
                }
            }
            e++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C2604a mo19641i() {
        C2607d[] d = mo19636d();
        C2605b bVar = new C2605b();
        C2605b bVar2 = new C2605b();
        C2605b bVar3 = new C2605b();
        C2605b bVar4 = new C2605b();
        for (C2607d dVar : d) {
            if (dVar != null) {
                dVar.mo19622j();
                int e = dVar.mo19617e() % 30;
                int c = dVar.mo19615c();
                if (!this.f4457c) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    bVar2.mo19603b((e * 3) + 1);
                } else if (i == 1) {
                    bVar4.mo19603b(e / 3);
                    bVar3.mo19603b(e % 3);
                } else if (i == 2) {
                    bVar.mo19603b(e + 1);
                }
            }
        }
        if (bVar.mo19602a().length == 0 || bVar2.mo19602a().length == 0 || bVar3.mo19602a().length == 0 || bVar4.mo19602a().length == 0 || bVar.mo19602a()[0] <= 0 || bVar2.mo19602a()[0] + bVar3.mo19602a()[0] < 3 || bVar2.mo19602a()[0] + bVar3.mo19602a()[0] > 90) {
            return null;
        }
        C2604a aVar = new C2604a(bVar.mo19602a()[0], bVar2.mo19602a()[0], bVar3.mo19602a()[0], bVar4.mo19602a()[0]);
        m7209l(d, aVar);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] mo19642j() {
        int c;
        C2604a i = mo19641i();
        if (i == null) {
            return null;
        }
        m7208h(i);
        int c2 = i.mo19599c();
        int[] iArr = new int[c2];
        for (C2607d dVar : mo19636d()) {
            if (dVar != null && (c = dVar.mo19615c()) < c2) {
                iArr[c] = iArr[c] + 1;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo19643k() {
        return this.f4457c;
    }

    public String toString() {
        return "IsLeft: " + this.f4457c + 10 + super.toString();
    }
}
