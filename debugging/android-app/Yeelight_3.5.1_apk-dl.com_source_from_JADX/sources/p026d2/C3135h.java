package p026d2;

/* renamed from: d2.h */
public final class C3135h {

    /* renamed from: a */
    private final float f5025a;

    /* renamed from: b */
    private final float f5026b;

    /* renamed from: c */
    private final float f5027c;

    /* renamed from: d */
    private final float f5028d;

    /* renamed from: e */
    private final float f5029e;

    /* renamed from: f */
    private final float f5030f;

    /* renamed from: g */
    private final float f5031g;

    /* renamed from: h */
    private final float f5032h;

    /* renamed from: i */
    private final float f5033i;

    private C3135h(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f5025a = f;
        this.f5026b = f4;
        this.f5027c = f7;
        this.f5028d = f2;
        this.f5029e = f5;
        this.f5030f = f8;
        this.f5031g = f3;
        this.f5032h = f6;
        this.f5033i = f9;
    }

    /* renamed from: b */
    public static C3135h m8380b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m8382d(f9, f10, f11, f12, f13, f14, f15, f16).mo23622e(m8381c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: c */
    public static C3135h m8381c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m8382d(f, f2, f3, f4, f5, f6, f7, f8).mo23621a();
    }

    /* renamed from: d */
    public static C3135h m8382d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C3135h(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C3135h((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3135h mo23621a() {
        float f = this.f5029e;
        float f2 = this.f5033i;
        float f3 = this.f5030f;
        float f4 = this.f5032h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f5031g;
        float f7 = this.f5028d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f5027c;
        float f11 = this.f5026b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f5025a;
        return new C3135h(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C3135h mo23622e(C3135h hVar) {
        C3135h hVar2 = hVar;
        float f = this.f5025a;
        float f2 = hVar2.f5025a;
        float f3 = this.f5028d;
        float f4 = hVar2.f5026b;
        float f5 = this.f5031g;
        float f6 = hVar2.f5027c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = hVar2.f5028d;
        float f9 = hVar2.f5029e;
        float f10 = hVar2.f5030f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = hVar2.f5031g;
        float f13 = hVar2.f5032h;
        float f14 = hVar2.f5033i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f5026b;
        float f17 = f15;
        float f18 = this.f5029e;
        float f19 = f11;
        float f20 = this.f5032h;
        float f21 = (f16 * f2) + (f18 * f4) + (f20 * f6);
        float f22 = (f20 * f14) + (f16 * f12) + (f18 * f13);
        float f23 = this.f5027c;
        float f24 = this.f5030f;
        float f25 = (f2 * f23) + (f4 * f24);
        float f26 = this.f5033i;
        float f27 = (f23 * f12) + (f24 * f13) + (f26 * f14);
        return new C3135h(f7, f19, f17, f21, (f16 * f8) + (f18 * f9) + (f20 * f10), f22, (f6 * f26) + f25, (f8 * f23) + (f9 * f24) + (f10 * f26), f27);
    }

    /* renamed from: f */
    public void mo23623f(float[] fArr) {
        float[] fArr2 = fArr;
        int length = fArr2.length;
        float f = this.f5025a;
        float f2 = this.f5026b;
        float f3 = this.f5027c;
        float f4 = this.f5028d;
        float f5 = this.f5029e;
        float f6 = this.f5030f;
        float f7 = this.f5031g;
        float f8 = this.f5032h;
        float f9 = this.f5033i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr2[i];
            int i2 = i + 1;
            float f11 = fArr2[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr2[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr2[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }
}
