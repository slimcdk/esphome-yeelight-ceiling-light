package p156f.p157g0.p160g;

/* renamed from: f.g0.g.f */
public final class C10772f {
    /* renamed from: a */
    public static boolean m26700a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m26701b(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    /* renamed from: c */
    public static boolean m26702c(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: d */
    public static boolean m26703d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m26704e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
