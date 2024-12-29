package com.google.zxing.qrcode.detector;

import com.google.zxing.C2564h;
import com.google.zxing.C2565i;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2549b;
import com.google.zxing.qrcode.decoder.C2627g;
import java.util.Map;
import p026d2.C3131d;
import p026d2.C3133f;
import p026d2.C3135h;
import p030e2.C3148a;

/* renamed from: com.google.zxing.qrcode.detector.c */
public class C2633c {

    /* renamed from: a */
    private final C2549b f4501a;

    /* renamed from: b */
    private C2565i f4502b;

    public C2633c(C2549b bVar) {
        this.f4501a = bVar;
    }

    /* renamed from: b */
    private float m7304b(C2564h hVar, C2564h hVar2) {
        float j = m7309j((int) hVar.mo19546c(), (int) hVar.mo19547d(), (int) hVar2.mo19546c(), (int) hVar2.mo19547d());
        float j2 = m7309j((int) hVar2.mo19546c(), (int) hVar2.mo19547d(), (int) hVar.mo19546c(), (int) hVar.mo19547d());
        return Float.isNaN(j) ? j2 / 7.0f : Float.isNaN(j2) ? j / 7.0f : (j + j2) / 14.0f;
    }

    /* renamed from: c */
    private static int m7305c(C2564h hVar, C2564h hVar2, C2564h hVar3, float f) {
        int c = ((C3148a.m8415c(C2564h.m7003b(hVar, hVar2) / f) + C3148a.m8415c(C2564h.m7003b(hVar, hVar3) / f)) / 2) + 7;
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
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    private static C3135h m7306d(C2564h hVar, C2564h hVar2, C2564h hVar3, C2564h hVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (hVar4 != null) {
            f2 = hVar4.mo19546c();
            f = hVar4.mo19547d();
            f3 = f4 - 3.0f;
        } else {
            f2 = (hVar2.mo19546c() - hVar.mo19546c()) + hVar3.mo19546c();
            f = (hVar2.mo19547d() - hVar.mo19547d()) + hVar3.mo19547d();
            f3 = f4;
        }
        return C3135h.m8380b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, hVar.mo19546c(), hVar.mo19547d(), hVar2.mo19546c(), hVar2.mo19547d(), f2, f, hVar3.mo19546c(), hVar3.mo19547d());
    }

    /* renamed from: h */
    private static C2549b m7307h(C2549b bVar, C3135h hVar, int i) {
        return C3133f.m8371b().mo23618d(bVar, i, i, hVar);
    }

    /* renamed from: i */
    private float m7308i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        C2633c cVar;
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
            if (z2 == cVar.f4501a.mo19493d(i18, i19)) {
                if (i17 == 2) {
                    return C3148a.m8414b(i15, i16, i8, i7);
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
            return C3148a.m8414b(i9, i5, i8, i7);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    private float m7309j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float i5 = m7308i(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i) / ((float) (i - i6));
            i6 = 0;
        } else if (i6 >= this.f4501a.mo19501j()) {
            f = ((float) ((this.f4501a.mo19501j() - 1) - i)) / ((float) (i6 - i));
            i6 = this.f4501a.mo19501j() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i8 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i8 < 0) {
            f2 = f3 / ((float) (i2 - i8));
        } else if (i8 >= this.f4501a.mo19497g()) {
            f2 = ((float) ((this.f4501a.mo19497g() - 1) - i2)) / ((float) (i8 - i2));
            i7 = this.f4501a.mo19497g() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (i5 + m7308i(i, i2, (int) (((float) i) + (((float) (i6 - i)) * f2)), i7)) - 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo19685a(C2564h hVar, C2564h hVar2, C2564h hVar3) {
        return (m7304b(hVar, hVar2) + m7304b(hVar, hVar3)) / 2.0f;
    }

    /* renamed from: e */
    public final C3131d mo19686e(Map<DecodeHintType, ?> map) {
        C2565i iVar = map == null ? null : (C2565i) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.f4502b = iVar;
        return mo19688g(new FinderPatternFinder(this.f4501a, iVar).mo19676e(map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C2631a mo19687f(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f4501a.mo19501j() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f4501a.mo19497g() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                return new C2632b(this.f4501a, max, max2, min, min2, f, this.f4502b).mo19684c();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C3131d mo19688g(C2635e eVar) {
        C2564h[] hVarArr;
        C2634d b = eVar.mo19694b();
        C2634d c = eVar.mo19695c();
        C2634d a = eVar.mo19693a();
        float a2 = mo19685a(b, c, a);
        if (a2 >= 1.0f) {
            int c2 = m7305c(b, c, a, a2);
            C2627g g = C2627g.m7272g(c2);
            int e = g.mo19665e() - 7;
            C2631a aVar = null;
            if (g.mo19664d().length > 0) {
                float c3 = (c.mo19546c() - b.mo19546c()) + a.mo19546c();
                float d = (c.mo19547d() - b.mo19547d()) + a.mo19547d();
                float f = 1.0f - (3.0f / ((float) e));
                int c4 = (int) (b.mo19546c() + ((c3 - b.mo19546c()) * f));
                int d2 = (int) (b.mo19547d() + (f * (d - b.mo19547d())));
                int i = 4;
                while (true) {
                    if (i > 16) {
                        break;
                    }
                    try {
                        aVar = mo19687f(a2, c4, d2, (float) i);
                        break;
                    } catch (NotFoundException unused) {
                        i <<= 1;
                    }
                }
            }
            C2549b h = m7307h(this.f4501a, m7306d(b, c, a, aVar, c2), c2);
            if (aVar == null) {
                hVarArr = new C2564h[]{a, b, c};
            } else {
                hVarArr = new C2564h[]{a, b, c, aVar};
            }
            return new C3131d(h, hVarArr);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
