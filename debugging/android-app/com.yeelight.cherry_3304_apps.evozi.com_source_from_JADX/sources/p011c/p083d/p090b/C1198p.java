package p011c.p083d.p090b;

/* renamed from: c.d.b.p */
public enum C1198p {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: a */
    final int f2045a;

    private C1198p(int i) {
        this.f2045a = i;
    }

    /* renamed from: a */
    static boolean m3091a(int i) {
        return (i & NO_CACHE.f2045a) == 0;
    }

    /* renamed from: b */
    static boolean m3092b(int i) {
        return (i & NO_STORE.f2045a) == 0;
    }
}
