package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.c */
final class C2587c extends C2592h {
    C2587c(C2548a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo19576d() {
        if (mo19581c().mo19481j() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo19577f(sb, 8);
            int f = mo19580b().mo19596f(48, 2);
            sb.append("(392");
            sb.append(f);
            sb.append(')');
            sb.append(mo19580b().mo19595c(50, (String) null).mo19586b());
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
