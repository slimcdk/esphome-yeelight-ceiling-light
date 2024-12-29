package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.f */
abstract class C2590f extends C2593i {
    C2590f(C2548a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo19576d() {
        if (mo19581c().mo19481j() == 60) {
            StringBuilder sb = new StringBuilder();
            mo19577f(sb, 5);
            mo19579j(sb, 45, 15);
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
