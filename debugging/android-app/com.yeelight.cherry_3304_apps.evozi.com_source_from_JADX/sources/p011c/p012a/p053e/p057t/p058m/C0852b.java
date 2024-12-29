package p011c.p012a.p053e.p057t.p058m;

import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0840b;

/* renamed from: c.a.e.t.m.b */
public final class C0852b {

    /* renamed from: a */
    private final C0840b f838a;

    /* renamed from: b */
    private final int f839b;

    /* renamed from: c */
    private final int f840c;

    /* renamed from: d */
    private final int f841d;

    /* renamed from: e */
    private final int f842e;

    /* renamed from: f */
    private final int f843f;

    /* renamed from: g */
    private final int f844g;

    public C0852b(C0840b bVar) {
        this(bVar, 10, bVar.mo9067m() / 2, bVar.mo9064j() / 2);
    }

    public C0852b(C0840b bVar, int i, int i2, int i3) {
        this.f838a = bVar;
        this.f839b = bVar.mo9064j();
        int m = bVar.mo9067m();
        this.f840c = m;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f841d = i5;
        int i6 = i2 + i4;
        this.f842e = i6;
        int i7 = i3 - i4;
        this.f844g = i7;
        int i8 = i3 + i4;
        this.f843f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= this.f839b || i6 >= m) {
            throw C0823j.m1126a();
        }
    }

    /* renamed from: a */
    private C0829p[] m1263a(C0829p pVar, C0829p pVar2, C0829p pVar3, C0829p pVar4) {
        float c = pVar.mo9020c();
        float d = pVar.mo9021d();
        float c2 = pVar2.mo9020c();
        float d2 = pVar2.mo9021d();
        float c3 = pVar3.mo9020c();
        float d3 = pVar3.mo9021d();
        float c4 = pVar4.mo9020c();
        float d4 = pVar4.mo9021d();
        if (c < ((float) this.f840c) / 2.0f) {
            return new C0829p[]{new C0829p(c4 - 1.0f, d4 + 1.0f), new C0829p(c2 + 1.0f, d2 + 1.0f), new C0829p(c3 - 1.0f, d3 - 1.0f), new C0829p(c + 1.0f, d - 1.0f)};
        }
        return new C0829p[]{new C0829p(c4 + 1.0f, d4 + 1.0f), new C0829p(c2 + 1.0f, d2 - 1.0f), new C0829p(c3 - 1.0f, d3 + 1.0f), new C0829p(c - 1.0f, d - 1.0f)};
    }

    /* renamed from: b */
    private boolean m1264b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f838a.mo9059d(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f838a.mo9059d(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: d */
    private C0829p m1265d(float f, float f2, float f3, float f4) {
        int c = C0851a.m1261c(C0851a.m1259a(f, f2, f3, f4));
        float f5 = (float) c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < c; i++) {
            float f8 = (float) i;
            int c2 = C0851a.m1261c((f8 * f6) + f);
            int c3 = C0851a.m1261c((f8 * f7) + f2);
            if (this.f838a.mo9059d(c2, c3)) {
                return new C0829p((float) c2, (float) c3);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C0829p[] mo9099c() {
        int i = this.f841d;
        int i2 = this.f842e;
        int i3 = this.f844g;
        int i4 = this.f843f;
        boolean z = false;
        int i5 = 1;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (true) {
            if (!z2) {
                break;
            }
            boolean z8 = true;
            boolean z9 = false;
            while (true) {
                if ((z8 || !z3) && i2 < this.f840c) {
                    z8 = m1264b(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z3 = true;
                        z9 = true;
                    } else if (!z3) {
                        i2++;
                    }
                }
            }
            if (i2 >= this.f840c) {
                break;
            }
            boolean z10 = true;
            while (true) {
                if ((z10 || !z4) && i4 < this.f839b) {
                    z10 = m1264b(i, i2, i4, true);
                    if (z10) {
                        i4++;
                        z4 = true;
                        z9 = true;
                    } else if (!z4) {
                        i4++;
                    }
                }
            }
            if (i4 >= this.f839b) {
                break;
            }
            boolean z11 = true;
            while (true) {
                if ((z11 || !z5) && i >= 0) {
                    z11 = m1264b(i3, i4, i, false);
                    if (z11) {
                        i--;
                        z5 = true;
                        z9 = true;
                    } else if (!z5) {
                        i--;
                    }
                }
            }
            if (i < 0) {
                break;
            }
            z2 = z9;
            boolean z12 = true;
            while (true) {
                if ((z12 || !z7) && i3 >= 0) {
                    z12 = m1264b(i, i2, i3, true);
                    if (z12) {
                        i3--;
                        z2 = true;
                        z7 = true;
                    } else if (!z7) {
                        i3--;
                    }
                }
            }
            if (i3 < 0) {
                break;
            } else if (z2) {
                z6 = true;
            }
        }
        z = true;
        if (z || !z6) {
            throw C0823j.m1126a();
        }
        int i6 = i2 - i;
        C0829p pVar = null;
        C0829p pVar2 = null;
        int i7 = 1;
        while (pVar2 == null && i7 < i6) {
            pVar2 = m1265d((float) i, (float) (i4 - i7), (float) (i + i7), (float) i4);
            i7++;
        }
        if (pVar2 != null) {
            C0829p pVar3 = null;
            int i8 = 1;
            while (pVar3 == null && i8 < i6) {
                pVar3 = m1265d((float) i, (float) (i3 + i8), (float) (i + i8), (float) i3);
                i8++;
            }
            if (pVar3 != null) {
                C0829p pVar4 = null;
                int i9 = 1;
                while (pVar4 == null && i9 < i6) {
                    pVar4 = m1265d((float) i2, (float) (i3 + i9), (float) (i2 - i9), (float) i3);
                    i9++;
                }
                if (pVar4 != null) {
                    while (pVar == null && i5 < i6) {
                        pVar = m1265d((float) i2, (float) (i4 - i5), (float) (i2 - i5), (float) i4);
                        i5++;
                    }
                    if (pVar != null) {
                        return m1263a(pVar, pVar2, pVar4, pVar3);
                    }
                    throw C0823j.m1126a();
                }
                throw C0823j.m1126a();
            }
            throw C0823j.m1126a();
        }
        throw C0823j.m1126a();
    }
}
