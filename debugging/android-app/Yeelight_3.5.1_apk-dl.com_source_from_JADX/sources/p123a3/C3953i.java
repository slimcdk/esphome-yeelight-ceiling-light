package p123a3;

/* renamed from: a3.i */
public final class C3953i {
    /* renamed from: a */
    public static boolean m11366a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE");
    }

    /* renamed from: b */
    public static boolean m11367b(String str) {
        return m11368c(str) || str.equals("DELETE");
    }

    /* renamed from: c */
    public static boolean m11368c(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH");
    }
}
