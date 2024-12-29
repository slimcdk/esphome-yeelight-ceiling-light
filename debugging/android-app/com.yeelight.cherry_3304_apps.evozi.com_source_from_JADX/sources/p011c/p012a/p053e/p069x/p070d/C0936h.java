package p011c.p012a.p053e.p069x.p070d;

import p011c.p012a.p053e.C0829p;

/* renamed from: c.a.e.x.d.h */
final class C0936h extends C0935g {

    /* renamed from: c */
    private final boolean f1065c;

    C0936h(C0929c cVar, boolean z) {
        super(cVar);
        this.f1065c = z;
    }

    /* renamed from: h */
    private void m1629h(C0927a aVar) {
        C0929c a = mo9265a();
        C0829p i = this.f1065c ? a.mo9243i() : a.mo9244j();
        C0829p c = this.f1065c ? a.mo9237c() : a.mo9238d();
        int e = mo9269e((int) c.mo9021d());
        C0930d[] d = mo9268d();
        int i2 = -1;
        int i3 = 0;
        int i4 = 1;
        for (int e2 = mo9269e((int) i.mo9021d()); e2 < e; e2++) {
            if (d[e2] != null) {
                C0930d dVar = d[e2];
                dVar.mo9254j();
                int c2 = dVar.mo9247c() - i2;
                if (c2 == 0) {
                    i3++;
                } else {
                    if (c2 == 1) {
                        i4 = Math.max(i4, i3);
                    } else if (dVar.mo9247c() >= aVar.mo9231c()) {
                        d[e2] = null;
                    }
                    i2 = dVar.mo9247c();
                    i3 = 1;
                }
            }
        }
    }

    /* renamed from: l */
    private void m1630l(C0930d[] dVarArr, C0927a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C0930d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int e = dVar.mo9249e() % 30;
                int c = dVar.mo9247c();
                if (c > aVar.mo9231c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f1065c) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != aVar.mo9229a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e / 3 != aVar.mo9230b() || e % 3 != aVar.mo9232d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != aVar.mo9233e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m1631m() {
        for (C0930d dVar : mo9268d()) {
            if (dVar != null) {
                dVar.mo9254j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9272g(C0927a aVar) {
        C0930d[] d = mo9268d();
        m1631m();
        m1630l(d, aVar);
        C0929c a = mo9265a();
        C0829p i = this.f1065c ? a.mo9243i() : a.mo9244j();
        C0829p c = this.f1065c ? a.mo9237c() : a.mo9238d();
        int e = mo9269e((int) i.mo9021d());
        int e2 = mo9269e((int) c.mo9021d());
        int i2 = -1;
        int i3 = 0;
        int i4 = 1;
        while (e < e2) {
            if (d[e] != null) {
                C0930d dVar = d[e];
                int c2 = dVar.mo9247c() - i2;
                if (c2 == 0) {
                    i3++;
                } else {
                    if (c2 == 1) {
                        i4 = Math.max(i4, i3);
                    } else if (c2 < 0 || dVar.mo9247c() >= aVar.mo9231c() || c2 > e) {
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
                    i2 = dVar.mo9247c();
                    i3 = 1;
                }
            }
            e++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0927a mo9273i() {
        C0930d[] d = mo9268d();
        C0928b bVar = new C0928b();
        C0928b bVar2 = new C0928b();
        C0928b bVar3 = new C0928b();
        C0928b bVar4 = new C0928b();
        for (C0930d dVar : d) {
            if (dVar != null) {
                dVar.mo9254j();
                int e = dVar.mo9249e() % 30;
                int c = dVar.mo9247c();
                if (!this.f1065c) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    bVar2.mo9235b((e * 3) + 1);
                } else if (i == 1) {
                    bVar4.mo9235b(e / 3);
                    bVar3.mo9235b(e % 3);
                } else if (i == 2) {
                    bVar.mo9235b(e + 1);
                }
            }
        }
        if (bVar.mo9234a().length == 0 || bVar2.mo9234a().length == 0 || bVar3.mo9234a().length == 0 || bVar4.mo9234a().length == 0 || bVar.mo9234a()[0] <= 0 || bVar2.mo9234a()[0] + bVar3.mo9234a()[0] < 3 || bVar2.mo9234a()[0] + bVar3.mo9234a()[0] > 90) {
            return null;
        }
        C0927a aVar = new C0927a(bVar.mo9234a()[0], bVar2.mo9234a()[0], bVar3.mo9234a()[0], bVar4.mo9234a()[0]);
        m1630l(d, aVar);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] mo9274j() {
        int c;
        C0927a i = mo9273i();
        if (i == null) {
            return null;
        }
        m1629h(i);
        int c2 = i.mo9231c();
        int[] iArr = new int[c2];
        for (C0930d dVar : mo9268d()) {
            if (dVar != null && (c = dVar.mo9247c()) < c2) {
                iArr[c] = iArr[c] + 1;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo9275k() {
        return this.f1065c;
    }

    public String toString() {
        return "IsLeft: " + this.f1065c + 10 + super.toString();
    }
}
