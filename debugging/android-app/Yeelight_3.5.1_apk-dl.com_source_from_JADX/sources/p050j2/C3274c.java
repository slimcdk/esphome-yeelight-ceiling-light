package p050j2;

import com.google.zxing.C2564h;

/* renamed from: j2.c */
public final class C3274c {

    /* renamed from: a */
    private final int f5270a;

    /* renamed from: b */
    private final int[] f5271b;

    /* renamed from: c */
    private final C2564h[] f5272c;

    public C3274c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f5270a = i;
        this.f5271b = iArr;
        float f = (float) i4;
        this.f5272c = new C2564h[]{new C2564h((float) i2, f), new C2564h((float) i3, f)};
    }

    /* renamed from: a */
    public C2564h[] mo23848a() {
        return this.f5272c;
    }

    /* renamed from: b */
    public int[] mo23849b() {
        return this.f5271b;
    }

    /* renamed from: c */
    public int mo23850c() {
        return this.f5270a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3274c) && this.f5270a == ((C3274c) obj).f5270a;
    }

    public int hashCode() {
        return this.f5270a;
    }
}
