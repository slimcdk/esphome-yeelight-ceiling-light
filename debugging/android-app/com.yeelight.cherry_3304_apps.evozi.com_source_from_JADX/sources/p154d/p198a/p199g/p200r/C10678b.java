package p154d.p198a.p199g.p200r;

/* renamed from: d.a.g.r.b */
public enum C10678b {
    Unknown("", 128),
    Standard("standard label", 0),
    Compressed("compressed label", 192),
    Extended("extended label", 64);
    

    /* renamed from: a */
    private final int f20467a;

    private C10678b(String str, int i) {
        this.f20467a = i;
    }

    /* renamed from: b */
    public static C10678b m26372b(int i) {
        int i2 = i & 192;
        for (C10678b bVar : values()) {
            if (bVar.f20467a == i2) {
                return bVar;
            }
        }
        return Unknown;
    }

    /* renamed from: c */
    public static int m26373c(int i) {
        return i & 63;
    }

    /* renamed from: a */
    public int mo33820a() {
        return this.f20467a;
    }

    public String toString() {
        return name() + " index " + mo33820a();
    }
}
