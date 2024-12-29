package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.o */
final class C2599o extends C2600p {

    /* renamed from: b */
    private final int f4415b;

    /* renamed from: c */
    private final int f4416c;

    C2599o(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.f4415b = i2;
        this.f4416c = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo19589b() {
        return this.f4415b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo19590c() {
        return this.f4416c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo19591d() {
        return this.f4415b == 10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo19592e() {
        return this.f4416c == 10;
    }
}
