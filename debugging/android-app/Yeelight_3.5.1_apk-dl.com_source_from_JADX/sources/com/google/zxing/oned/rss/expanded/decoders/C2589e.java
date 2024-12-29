package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.e */
final class C2589e extends C2593i {

    /* renamed from: c */
    private final String f4405c;

    /* renamed from: d */
    private final String f4406d;

    C2589e(C2548a aVar, String str, String str2) {
        super(aVar);
        this.f4405c = str2;
        this.f4406d = str;
    }

    /* renamed from: k */
    private void m7100k(StringBuilder sb, int i) {
        int f = mo19580b().mo19596f(i, 16);
        if (f != 38400) {
            sb.append('(');
            sb.append(this.f4405c);
            sb.append(')');
            int i2 = f % 32;
            int i3 = f / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }

    /* renamed from: d */
    public String mo19576d() {
        if (mo19581c().mo19481j() == 84) {
            StringBuilder sb = new StringBuilder();
            mo19577f(sb, 8);
            mo19579j(sb, 48, 20);
            m7100k(sb, 68);
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo19574h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f4406d);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo19575i(int i) {
        return i % 100000;
    }
}
