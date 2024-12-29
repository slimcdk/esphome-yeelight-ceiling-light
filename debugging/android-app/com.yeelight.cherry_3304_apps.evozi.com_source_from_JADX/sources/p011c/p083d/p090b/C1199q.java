package p011c.p083d.p090b;

/* renamed from: c.d.b.q */
public enum C1199q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: a */
    final int f2050a;

    private C1199q(int i) {
        this.f2050a = i;
    }

    /* renamed from: a */
    public static boolean m3093a(int i) {
        return (i & OFFLINE.f2050a) != 0;
    }

    /* renamed from: b */
    public static boolean m3094b(int i) {
        return (i & NO_CACHE.f2050a) == 0;
    }

    /* renamed from: c */
    public static boolean m3095c(int i) {
        return (i & NO_STORE.f2050a) == 0;
    }
}
