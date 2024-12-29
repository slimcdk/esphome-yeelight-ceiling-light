package p011c.p012a.p053e.p065w.p066r;

import p011c.p012a.p053e.C0829p;

/* renamed from: c.a.e.w.r.c */
public final class C0896c {

    /* renamed from: a */
    private final int f967a;

    /* renamed from: b */
    private final int[] f968b;

    /* renamed from: c */
    private final C0829p[] f969c;

    public C0896c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f967a = i;
        this.f968b = iArr;
        float f = (float) i4;
        this.f969c = new C0829p[]{new C0829p((float) i2, f), new C0829p((float) i3, f)};
    }

    /* renamed from: a */
    public C0829p[] mo9170a() {
        return this.f969c;
    }

    /* renamed from: b */
    public int[] mo9171b() {
        return this.f968b;
    }

    /* renamed from: c */
    public int mo9172c() {
        return this.f967a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0896c) && this.f967a == ((C0896c) obj).f967a;
    }

    public int hashCode() {
        return this.f967a;
    }
}
