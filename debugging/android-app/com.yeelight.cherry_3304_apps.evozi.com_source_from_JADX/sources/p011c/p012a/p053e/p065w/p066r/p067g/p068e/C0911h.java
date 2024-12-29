package p011c.p012a.p053e.p065w.p066r.p067g.p068e;

import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.r.g.e.h */
abstract class C0911h extends C0913j {
    C0911h(C0839a aVar) {
        super(aVar);
    }

    /* renamed from: e */
    private static void m1507e(StringBuilder sb, int i) {
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
    public final void mo9197f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        mo9198g(sb, i, length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo9198g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f = mo9200b().mo9224f((i3 * 10) + i, 10);
            if (f / 100 == 0) {
                sb.append('0');
            }
            if (f / 10 == 0) {
                sb.append('0');
            }
            sb.append(f);
        }
        m1507e(sb, i2);
    }
}
