package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.b */
final class C2586b extends C2590f {
    C2586b(C2548a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo19574h(StringBuilder sb, int i) {
        sb.append(i < 10000 ? "(3202)" : "(3203)");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo19575i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
