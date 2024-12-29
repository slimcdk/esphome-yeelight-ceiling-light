package p011c.p012a.p053e.p065w.p066r.p067g.p068e;

/* renamed from: c.a.e.w.r.g.e.m */
final class C0916m {

    /* renamed from: a */
    private int f1003a = 0;

    /* renamed from: b */
    private C0917a f1004b = C0917a.NUMERIC;

    /* renamed from: c.a.e.w.r.g.e.m$a */
    private enum C0917a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    C0916m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9204a() {
        return this.f1003a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9205b(int i) {
        this.f1003a += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9206c() {
        return this.f1004b == C0917a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9207d() {
        return this.f1004b == C0917a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9208e() {
        this.f1004b = C0917a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9209f() {
        this.f1004b = C0917a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9210g() {
        this.f1004b = C0917a.NUMERIC;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9211h(int i) {
        this.f1003a = i;
    }
}
