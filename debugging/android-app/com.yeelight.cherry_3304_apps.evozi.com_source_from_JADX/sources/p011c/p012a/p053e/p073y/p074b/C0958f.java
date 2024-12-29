package p011c.p012a.p053e.p073y.p074b;

/* renamed from: c.a.e.y.b.f */
public enum C0958f {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: f */
    private static final C0958f[] f1106f = null;

    /* renamed from: a */
    private final int f1108a;

    static {
        C0958f fVar;
        C0958f fVar2;
        C0958f fVar3;
        C0958f fVar4;
        f1106f = new C0958f[]{fVar3, fVar2, fVar, fVar4};
    }

    private C0958f(int i) {
        this.f1108a = i;
    }

    /* renamed from: a */
    public static C0958f m1731a(int i) {
        if (i >= 0) {
            C0958f[] fVarArr = f1106f;
            if (i < fVarArr.length) {
                return fVarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public int mo9311b() {
        return this.f1108a;
    }
}
