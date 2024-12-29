package p011c.p012a.p053e.p073y.p075c;

import java.util.Map;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.C0830q;
import p011c.p012a.p053e.p057t.C0840b;
import p011c.p012a.p053e.p057t.C0845g;
import p011c.p012a.p053e.p057t.C0847i;
import p011c.p012a.p053e.p057t.C0849k;
import p011c.p012a.p053e.p057t.p058m.C0851a;
import p011c.p012a.p053e.p073y.p074b.C0962j;

/* renamed from: c.a.e.y.c.c */
public class C0967c {

    /* renamed from: a */
    private final C0840b f1146a;

    /* renamed from: b */
    private C0830q f1147b;

    public C0967c(C0840b bVar) {
        this.f1146a = bVar;
    }

    /* renamed from: b */
    private float m1765b(C0829p pVar, C0829p pVar2) {
        float j = m1770j((int) pVar.mo9020c(), (int) pVar.mo9021d(), (int) pVar2.mo9020c(), (int) pVar2.mo9021d());
        float j2 = m1770j((int) pVar2.mo9020c(), (int) pVar2.mo9021d(), (int) pVar.mo9020c(), (int) pVar.mo9021d());
        return Float.isNaN(j) ? j2 / 7.0f : Float.isNaN(j2) ? j / 7.0f : (j + j2) / 14.0f;
    }

    /* renamed from: c */
    private static int m1766c(C0829p pVar, C0829p pVar2, C0829p pVar3, float f) {
        int c = ((C0851a.m1261c(C0829p.m1143b(pVar, pVar2) / f) + C0851a.m1261c(C0829p.m1143b(pVar, pVar3) / f)) / 2) + 7;
        int i = c & 3;
        if (i == 0) {
            return c + 1;
        }
        if (i == 2) {
            return c - 1;
        }
        if (i != 3) {
            return c;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: d */
    private static C0849k m1767d(C0829p pVar, C0829p pVar2, C0829p pVar3, C0829p pVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (pVar4 != null) {
            f2 = pVar4.mo9020c();
            f = pVar4.mo9021d();
            f3 = f4 - 3.0f;
        } else {
            f2 = (pVar2.mo9020c() - pVar.mo9020c()) + pVar3.mo9020c();
            f = (pVar2.mo9021d() - pVar.mo9021d()) + pVar3.mo9021d();
            f3 = f4;
        }
        return C0849k.m1252b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, pVar.mo9020c(), pVar.mo9021d(), pVar2.mo9020c(), pVar2.mo9021d(), f2, f, pVar3.mo9020c(), pVar3.mo9021d());
    }

    /* renamed from: h */
    private static C0840b m1768h(C0840b bVar, C0849k kVar, int i) {
        return C0847i.m1244b().mo9093d(bVar, i, i, kVar);
    }

    /* renamed from: i */
    private float m1769i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        C0967c cVar;
        boolean z2;
        int i10 = 1;
        boolean z3 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z3) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = i8 < i6 ? 1 : -1;
        if (i7 < i5) {
            i12 = 1;
        }
        int i14 = i6 + i13;
        int i15 = i8;
        int i16 = i7;
        int i17 = 0;
        while (true) {
            if (i15 == i14) {
                i9 = i14;
                break;
            }
            int i18 = z3 ? i16 : i15;
            int i19 = z3 ? i15 : i16;
            if (i17 == i10) {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = true;
            } else {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = false;
            }
            if (z2 == cVar.f1146a.mo9059d(i18, i19)) {
                if (i17 == 2) {
                    return C0851a.m1260b(i15, i16, i8, i7);
                }
                i17++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i16 == i5) {
                    break;
                }
                i16 += i12;
                i11 -= abs;
            }
            i15 += i13;
            i14 = i9;
            z3 = z;
            i10 = 1;
        }
        if (i17 == 2) {
            return C0851a.m1260b(i9, i5, i8, i7);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    private float m1770j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float i5 = m1769i(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i) / ((float) (i - i6));
            i6 = 0;
        } else if (i6 >= this.f1146a.mo9067m()) {
            f = ((float) ((this.f1146a.mo9067m() - 1) - i)) / ((float) (i6 - i));
            i6 = this.f1146a.mo9067m() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i8 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i8 < 0) {
            f2 = f3 / ((float) (i2 - i8));
        } else if (i8 >= this.f1146a.mo9064j()) {
            f2 = ((float) ((this.f1146a.mo9064j() - 1) - i2)) / ((float) (i8 - i2));
            i7 = this.f1146a.mo9064j() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (i5 + m1769i(i, i2, (int) (((float) i) + (((float) (i6 - i)) * f2)), i7)) - 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo9335a(C0829p pVar, C0829p pVar2, C0829p pVar3) {
        return (m1765b(pVar, pVar2) + m1765b(pVar, pVar3)) / 2.0f;
    }

    /* renamed from: e */
    public final C0845g mo9336e(Map<C0818e, ?> map) {
        C0830q qVar = map == null ? null : (C0830q) map.get(C0818e.NEED_RESULT_POINT_CALLBACK);
        this.f1147b = qVar;
        return mo9338g(new C0969e(this.f1146a, qVar).mo9343e(map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C0965a mo9337f(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f1146a.mo9067m() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f1146a.mo9064j() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                return new C0966b(this.f1146a, max, max2, min, min2, f, this.f1147b).mo9334c();
            }
            throw C0823j.m1126a();
        }
        throw C0823j.m1126a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C0845g mo9338g(C0973f fVar) {
        C0829p[] pVarArr;
        C0968d b = fVar.mo9350b();
        C0968d c = fVar.mo9351c();
        C0968d a = fVar.mo9349a();
        float a2 = mo9335a(b, c, a);
        if (a2 >= 1.0f) {
            int c2 = m1766c(b, c, a, a2);
            C0962j g = C0962j.m1744g(c2);
            int e = g.mo9321e() - 7;
            C0965a aVar = null;
            if (g.mo9320d().length > 0) {
                float c3 = (c.mo9020c() - b.mo9020c()) + a.mo9020c();
                float d = (c.mo9021d() - b.mo9021d()) + a.mo9021d();
                float f = 1.0f - (3.0f / ((float) e));
                int c4 = (int) (b.mo9020c() + ((c3 - b.mo9020c()) * f));
                int d2 = (int) (b.mo9021d() + (f * (d - b.mo9021d())));
                int i = 4;
                while (true) {
                    if (i > 16) {
                        break;
                    }
                    try {
                        aVar = mo9337f(a2, c4, d2, (float) i);
                        break;
                    } catch (C0823j unused) {
                        i <<= 1;
                    }
                }
            }
            C0840b h = m1768h(this.f1146a, m1767d(b, c, a, aVar, c2), c2);
            if (aVar == null) {
                pVarArr = new C0829p[]{a, b, c};
            } else {
                pVarArr = new C0829p[]{a, b, c, aVar};
            }
            return new C0845g(h, pVarArr);
        }
        throw C0823j.m1126a();
    }
}
