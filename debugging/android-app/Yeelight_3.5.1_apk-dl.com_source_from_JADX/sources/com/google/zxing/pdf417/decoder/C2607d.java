package com.google.zxing.pdf417.decoder;

/* renamed from: com.google.zxing.pdf417.decoder.d */
final class C2607d {

    /* renamed from: a */
    private final int f4446a;

    /* renamed from: b */
    private final int f4447b;

    /* renamed from: c */
    private final int f4448c;

    /* renamed from: d */
    private final int f4449d;

    /* renamed from: e */
    private int f4450e = -1;

    C2607d(int i, int i2, int i3, int i4) {
        this.f4446a = i;
        this.f4447b = i2;
        this.f4448c = i3;
        this.f4449d = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo19613a() {
        return this.f4448c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo19614b() {
        return this.f4447b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo19615c() {
        return this.f4450e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo19616d() {
        return this.f4446a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo19617e() {
        return this.f4449d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo19618f() {
        return this.f4447b - this.f4446a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo19619g() {
        return mo19620h(this.f4450e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo19620h(int i) {
        return i != -1 && this.f4448c == (i % 3) * 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo19621i(int i) {
        this.f4450e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo19622j() {
        this.f4450e = ((this.f4449d / 30) * 3) + (this.f4448c / 3);
    }

    public String toString() {
        return this.f4450e + "|" + this.f4449d;
    }
}
