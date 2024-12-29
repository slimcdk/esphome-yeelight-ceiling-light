package p011c.p012a.p053e.p073y.p075c;

import p011c.p012a.p053e.C0829p;

/* renamed from: c.a.e.y.c.d */
public final class C0968d extends C0829p {

    /* renamed from: c */
    private final float f1148c;

    /* renamed from: d */
    private final int f1149d;

    C0968d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private C0968d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f1148c = f3;
        this.f1149d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo9339f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo9021d()) > f || Math.abs(f3 - mo9020c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f1148c);
        return abs <= 1.0f || abs <= this.f1148c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0968d mo9340g(float f, float f2, float f3) {
        int i = this.f1149d;
        int i2 = i + 1;
        float c = (((float) i) * mo9020c()) + f2;
        float f4 = (float) i2;
        return new C0968d(c / f4, ((((float) this.f1149d) * mo9021d()) + f) / f4, ((((float) this.f1149d) * this.f1148c) + f3) / f4, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo9341h() {
        return this.f1149d;
    }

    /* renamed from: i */
    public float mo9342i() {
        return this.f1148c;
    }
}
