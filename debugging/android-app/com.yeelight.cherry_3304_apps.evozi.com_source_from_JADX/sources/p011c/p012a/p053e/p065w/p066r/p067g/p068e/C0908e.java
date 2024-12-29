package p011c.p012a.p053e.p065w.p066r.p067g.p068e;

import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.r.g.e.e */
final class C0908e extends C0912i {

    /* renamed from: c */
    private final String f997c;

    /* renamed from: d */
    private final String f998d;

    C0908e(C0839a aVar, String str, String str2) {
        super(aVar);
        this.f997c = str2;
        this.f998d = str;
    }

    /* renamed from: k */
    private void m1501k(StringBuilder sb, int i) {
        int f = mo9200b().mo9224f(i, 16);
        if (f != 38400) {
            sb.append('(');
            sb.append(this.f997c);
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
    public String mo9196d() {
        if (mo9201c().mo9047m() == 84) {
            StringBuilder sb = new StringBuilder();
            mo9197f(sb, 8);
            mo9199j(sb, 48, 20);
            m1501k(sb, 68);
            return sb.toString();
        }
        throw C0823j.m1126a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo9194h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f998d);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo9195i(int i) {
        return i % 100000;
    }
}
