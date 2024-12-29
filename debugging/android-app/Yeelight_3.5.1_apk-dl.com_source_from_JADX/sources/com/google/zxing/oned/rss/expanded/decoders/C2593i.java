package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.i */
abstract class C2593i extends C2592h {
    C2593i(C2548a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo19574h(StringBuilder sb, int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo19575i(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo19579j(StringBuilder sb, int i, int i2) {
        int f = mo19580b().mo19596f(i, i2);
        mo19574h(sb, f);
        int i3 = mo19575i(f);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}
