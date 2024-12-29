package com.google.zxing.oned.rss.expanded.decoders;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.n */
final class C2598n extends C2600p {

    /* renamed from: b */
    private final String f4412b;

    /* renamed from: c */
    private final int f4413c;

    /* renamed from: d */
    private final boolean f4414d;

    C2598n(int i, String str) {
        super(i);
        this.f4412b = str;
        this.f4414d = false;
        this.f4413c = 0;
    }

    C2598n(int i, String str, int i2) {
        super(i);
        this.f4414d = true;
        this.f4413c = i2;
        this.f4412b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo19586b() {
        return this.f4412b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo19587c() {
        return this.f4413c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo19588d() {
        return this.f4414d;
    }
}
