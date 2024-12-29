package com.google.zxing.qrcode.detector;

import com.google.zxing.C2564h;

/* renamed from: com.google.zxing.qrcode.detector.a */
public final class C2631a extends C2564h {

    /* renamed from: c */
    private final float f4491c;

    C2631a(float f, float f2, float f3) {
        super(f, f2);
        this.f4491c = f3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo19682f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo19547d()) > f || Math.abs(f3 - mo19546c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f4491c);
        return abs <= 1.0f || abs <= this.f4491c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2631a mo19683g(float f, float f2, float f3) {
        return new C2631a((mo19546c() + f2) / 2.0f, (mo19547d() + f) / 2.0f, (this.f4491c + f3) / 2.0f);
    }
}
