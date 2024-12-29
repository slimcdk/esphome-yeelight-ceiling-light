package p011c.p012a.p053e.p065w.p066r.p067g.p068e;

import p011c.p012a.p053e.C0820g;

/* renamed from: c.a.e.w.r.g.e.p */
final class C0920p extends C0921q {

    /* renamed from: b */
    private final int f1013b;

    /* renamed from: c */
    private final int f1014c;

    C0920p(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw C0820g.m1114a();
        }
        this.f1013b = i2;
        this.f1014c = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9217b() {
        return this.f1013b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9218c() {
        return this.f1014c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9219d() {
        return this.f1013b == 10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9220e() {
        return this.f1014c == 10;
    }
}
