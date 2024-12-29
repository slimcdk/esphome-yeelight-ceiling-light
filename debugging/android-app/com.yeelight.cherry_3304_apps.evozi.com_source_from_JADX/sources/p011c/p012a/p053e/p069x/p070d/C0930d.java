package p011c.p012a.p053e.p069x.p070d;

/* renamed from: c.a.e.x.d.d */
final class C0930d {

    /* renamed from: a */
    private final int f1042a;

    /* renamed from: b */
    private final int f1043b;

    /* renamed from: c */
    private final int f1044c;

    /* renamed from: d */
    private final int f1045d;

    /* renamed from: e */
    private int f1046e = -1;

    C0930d(int i, int i2, int i3, int i4) {
        this.f1042a = i;
        this.f1043b = i2;
        this.f1044c = i3;
        this.f1045d = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9245a() {
        return this.f1044c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9246b() {
        return this.f1043b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9247c() {
        return this.f1046e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo9248d() {
        return this.f1042a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo9249e() {
        return this.f1045d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo9250f() {
        return this.f1043b - this.f1042a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo9251g() {
        return mo9252h(this.f1046e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9252h(int i) {
        return i != -1 && this.f1044c == (i % 3) * 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9253i(int i) {
        this.f1046e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9254j() {
        this.f1046e = ((this.f1045d / 30) * 3) + (this.f1044c / 3);
    }

    public String toString() {
        return this.f1046e + "|" + this.f1045d;
    }
}
