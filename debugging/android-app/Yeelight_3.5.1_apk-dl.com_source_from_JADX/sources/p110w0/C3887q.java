package p110w0;

/* renamed from: w0.q */
public final class C3887q {

    /* renamed from: a */
    private final Class<?> f6518a;

    /* renamed from: b */
    private final int f6519b;

    /* renamed from: c */
    private final int f6520c;

    private C3887q(Class<?> cls, int i, int i2) {
        this.f6518a = (Class) C3892z.m11087c(cls, "Null dependency anInterface.");
        this.f6519b = i;
        this.f6520c = i2;
    }

    /* renamed from: a */
    public static C3887q m11054a(Class<?> cls) {
        return new C3887q(cls, 0, 2);
    }

    /* renamed from: b */
    private static String m11055b(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    /* renamed from: h */
    public static C3887q m11056h(Class<?> cls) {
        return new C3887q(cls, 0, 1);
    }

    /* renamed from: i */
    public static C3887q m11057i(Class<?> cls) {
        return new C3887q(cls, 1, 0);
    }

    /* renamed from: j */
    public static C3887q m11058j(Class<?> cls) {
        return new C3887q(cls, 1, 1);
    }

    /* renamed from: k */
    public static C3887q m11059k(Class<?> cls) {
        return new C3887q(cls, 2, 0);
    }

    /* renamed from: c */
    public Class<?> mo26367c() {
        return this.f6518a;
    }

    /* renamed from: d */
    public boolean mo26368d() {
        return this.f6520c == 2;
    }

    /* renamed from: e */
    public boolean mo26369e() {
        return this.f6520c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3887q)) {
            return false;
        }
        C3887q qVar = (C3887q) obj;
        return this.f6518a == qVar.f6518a && this.f6519b == qVar.f6519b && this.f6520c == qVar.f6520c;
    }

    /* renamed from: f */
    public boolean mo26371f() {
        return this.f6519b == 1;
    }

    /* renamed from: g */
    public boolean mo26372g() {
        return this.f6519b == 2;
    }

    public int hashCode() {
        return ((((this.f6518a.hashCode() ^ 1000003) * 1000003) ^ this.f6519b) * 1000003) ^ this.f6520c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f6518a);
        sb.append(", type=");
        int i = this.f6519b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(m11055b(this.f6520c));
        sb.append("}");
        return sb.toString();
    }
}
