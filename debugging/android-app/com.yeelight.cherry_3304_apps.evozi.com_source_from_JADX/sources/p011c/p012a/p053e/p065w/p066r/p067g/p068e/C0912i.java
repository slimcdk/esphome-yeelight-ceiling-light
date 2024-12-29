package p011c.p012a.p053e.p065w.p066r.p067g.p068e;

import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.r.g.e.i */
abstract class C0912i extends C0911h {
    C0912i(C0839a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo9194h(StringBuilder sb, int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo9195i(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo9199j(StringBuilder sb, int i, int i2) {
        int f = mo9200b().mo9224f(i, i2);
        mo9194h(sb, f);
        int i3 = mo9195i(f);
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
