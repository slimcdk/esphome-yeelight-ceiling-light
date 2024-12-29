package p011c.p012a.p053e.p065w.p066r.p067g.p068e;

import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.r.g.e.d */
final class C0907d extends C0911h {
    C0907d(C0839a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo9196d() {
        if (mo9201c().mo9047m() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo9197f(sb, 8);
            int f = mo9200b().mo9224f(48, 2);
            sb.append("(393");
            sb.append(f);
            sb.append(')');
            int f2 = mo9200b().mo9224f(50, 10);
            if (f2 / 100 == 0) {
                sb.append('0');
            }
            if (f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f2);
            sb.append(mo9200b().mo9223c(60, (String) null).mo9214b());
            return sb.toString();
        }
        throw C0823j.m1126a();
    }
}
