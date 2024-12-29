package p073n5;

/* renamed from: n5.f */
public final class C9733f {
    /* renamed from: a */
    public static boolean m23370a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m23371b(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    /* renamed from: c */
    public static boolean m23372c(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: d */
    public static boolean m23373d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m23374e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
