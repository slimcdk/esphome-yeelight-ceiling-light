package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.d */
final class C2588d extends C2592h {
    C2588d(C2548a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo19576d() {
        if (mo19581c().mo19481j() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo19577f(sb, 8);
            int f = mo19580b().mo19596f(48, 2);
            sb.append("(393");
            sb.append(f);
            sb.append(')');
            int f2 = mo19580b().mo19596f(50, 10);
            if (f2 / 100 == 0) {
                sb.append('0');
            }
            if (f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f2);
            sb.append(mo19580b().mo19595c(60, (String) null).mo19586b());
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
