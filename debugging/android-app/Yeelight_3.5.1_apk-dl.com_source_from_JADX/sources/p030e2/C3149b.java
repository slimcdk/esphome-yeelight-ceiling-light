package p030e2;

import com.google.zxing.C2564h;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2549b;

/* renamed from: e2.b */
public final class C3149b {

    /* renamed from: a */
    private final C2549b f5046a;

    /* renamed from: b */
    private final int f5047b;

    /* renamed from: c */
    private final int f5048c;

    /* renamed from: d */
    private final int f5049d;

    /* renamed from: e */
    private final int f5050e;

    /* renamed from: f */
    private final int f5051f;

    /* renamed from: g */
    private final int f5052g;

    public C3149b(C2549b bVar) {
        this(bVar, 10, bVar.mo19501j() / 2, bVar.mo19497g() / 2);
    }

    public C3149b(C2549b bVar, int i, int i2, int i3) {
        this.f5046a = bVar;
        int g = bVar.mo19497g();
        this.f5047b = g;
        int j = bVar.mo19501j();
        this.f5048c = j;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f5049d = i5;
        int i6 = i2 + i4;
        this.f5050e = i6;
        int i7 = i3 - i4;
        this.f5052g = i7;
        int i8 = i3 + i4;
        this.f5051f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= g || i6 >= j) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* renamed from: a */
    private C2564h[] m8417a(C2564h hVar, C2564h hVar2, C2564h hVar3, C2564h hVar4) {
        float c = hVar.mo19546c();
        float d = hVar.mo19547d();
        float c2 = hVar2.mo19546c();
        float d2 = hVar2.mo19547d();
        float c3 = hVar3.mo19546c();
        float d3 = hVar3.mo19547d();
        float c4 = hVar4.mo19546c();
        float d4 = hVar4.mo19547d();
        if (c < ((float) this.f5048c) / 2.0f) {
            return new C2564h[]{new C2564h(c4 - 1.0f, d4 + 1.0f), new C2564h(c2 + 1.0f, d2 + 1.0f), new C2564h(c3 - 1.0f, d3 - 1.0f), new C2564h(c + 1.0f, d - 1.0f)};
        }
        return new C2564h[]{new C2564h(c4 + 1.0f, d4 + 1.0f), new C2564h(c2 + 1.0f, d2 - 1.0f), new C2564h(c3 - 1.0f, d3 + 1.0f), new C2564h(c - 1.0f, d - 1.0f)};
    }

    /* renamed from: b */
    private boolean m8418b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f5046a.mo19493d(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f5046a.mo19493d(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: d */
    private C2564h m8419d(float f, float f2, float f3, float f4) {
        int c = C3148a.m8415c(C3148a.m8413a(f, f2, f3, f4));
        float f5 = (float) c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < c; i++) {
            float f8 = (float) i;
            int c2 = C3148a.m8415c((f8 * f6) + f);
            int c3 = C3148a.m8415c((f8 * f7) + f2);
            if (this.f5046a.mo19493d(c2, c3)) {
                return new C2564h((float) c2, (float) c3);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C2564h[] mo23638c() {
        int i = this.f5049d;
        int i2 = this.f5050e;
        int i3 = this.f5052g;
        int i4 = this.f5051f;
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
                if ((z8 || !z3) && i2 < this.f5048c) {
                    z8 = m8418b(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z3 = true;
                        z9 = true;
                    } else if (!z3) {
                        i2++;
                    }
                }
            }
            if (i2 >= this.f5048c) {
                break;
            }
            boolean z10 = true;
            while (true) {
                if ((z10 || !z4) && i4 < this.f5047b) {
                    z10 = m8418b(i, i2, i4, true);
                    if (z10) {
                        i4++;
                        z4 = true;
                        z9 = true;
                    } else if (!z4) {
                        i4++;
                    }
                }
            }
            if (i4 >= this.f5047b) {
                break;
            }
            boolean z11 = true;
            while (true) {
                if ((z11 || !z5) && i >= 0) {
                    z11 = m8418b(i3, i4, i, false);
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
                    z12 = m8418b(i, i2, i3, true);
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
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = i2 - i;
        C2564h hVar = null;
        C2564h hVar2 = null;
        int i7 = 1;
        while (hVar2 == null && i7 < i6) {
            hVar2 = m8419d((float) i, (float) (i4 - i7), (float) (i + i7), (float) i4);
            i7++;
        }
        if (hVar2 != null) {
            C2564h hVar3 = null;
            int i8 = 1;
            while (hVar3 == null && i8 < i6) {
                hVar3 = m8419d((float) i, (float) (i3 + i8), (float) (i + i8), (float) i3);
                i8++;
            }
            if (hVar3 != null) {
                C2564h hVar4 = null;
                int i9 = 1;
                while (hVar4 == null && i9 < i6) {
                    hVar4 = m8419d((float) i2, (float) (i3 + i9), (float) (i2 - i9), (float) i3);
                    i9++;
                }
                if (hVar4 != null) {
                    while (hVar == null && i5 < i6) {
                        hVar = m8419d((float) i2, (float) (i4 - i5), (float) (i2 - i5), (float) i4);
                        i5++;
                    }
                    if (hVar != null) {
                        return m8417a(hVar, hVar2, hVar4, hVar3);
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                throw NotFoundException.getNotFoundInstance();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
