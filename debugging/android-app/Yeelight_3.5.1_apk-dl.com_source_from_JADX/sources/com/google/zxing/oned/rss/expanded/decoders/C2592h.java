package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.h */
abstract class C2592h extends C2594j {
    C2592h(C2548a aVar) {
        super(aVar);
    }

    /* renamed from: e */
    private static void m7106e(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo19577f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        mo19578g(sb, i, length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo19578g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f = mo19580b().mo19596f((i3 * 10) + i, 10);
            if (f / 100 == 0) {
                sb.append('0');
            }
            if (f / 10 == 0) {
                sb.append('0');
            }
            sb.append(f);
        }
        m7106e(sb, i2);
    }
}
