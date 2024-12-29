package com.google.zxing.qrcode.detector;

import com.google.zxing.C2564h;

/* renamed from: com.google.zxing.qrcode.detector.d */
public final class C2634d extends C2564h {

    /* renamed from: c */
    private final float f4503c;

    /* renamed from: d */
    private final int f4504d;

    C2634d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private C2634d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f4503c = f3;
        this.f4504d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo19689f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo19547d()) > f || Math.abs(f3 - mo19546c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f4503c);
        return abs <= 1.0f || abs <= this.f4503c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2634d mo19690g(float f, float f2, float f3) {
        int i = this.f4504d;
        int i2 = i + 1;
        float c = (((float) i) * mo19546c()) + f2;
        float f4 = (float) i2;
        return new C2634d(c / f4, ((((float) this.f4504d) * mo19547d()) + f) / f4, ((((float) this.f4504d) * this.f4503c) + f3) / f4, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo19691h() {
        return this.f4504d;
    }

    /* renamed from: i */
    public float mo19692i() {
        return this.f4503c;
    }
}
