package p011c.p083d.p084a.p085d0.p087n;

/* renamed from: c.d.a.d0.n.i */
public final class C1094i {
    /* renamed from: a */
    public static boolean m2508a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE");
    }

    /* renamed from: b */
    public static boolean m2509b(String str) {
        return m2510c(str) || str.equals("DELETE");
    }

    /* renamed from: c */
    public static boolean m2510c(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH");
    }
}
