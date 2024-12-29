package p164h.p165b.p166a.p240h.p243r;

/* renamed from: h.b.a.h.r.j */
public class C11252j extends C11248h {

    /* renamed from: b */
    private int f22376b;

    /* renamed from: c */
    private String f22377c;

    /* renamed from: h.b.a.h.r.j$a */
    public enum C11253a {
        OK(200, "OK"),
        BAD_REQUEST(400, "Bad Request"),
        NOT_FOUND(404, "Not Found"),
        METHOD_NOT_SUPPORTED(405, "Method Not Supported"),
        PRECONDITION_FAILED(412, "Precondition Failed"),
        UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
        NOT_IMPLEMENTED(501, "Not Implemented");
        

        /* renamed from: a */
        private int f22387a;

        /* renamed from: b */
        private String f22388b;

        private C11253a(int i, String str) {
            this.f22387a = i;
            this.f22388b = str;
        }

        /* renamed from: a */
        public static C11253a m29438a(int i) {
            for (C11253a aVar : values()) {
                if (aVar.mo35800b() == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: b */
        public int mo35800b() {
            return this.f22387a;
        }

        /* renamed from: c */
        public String mo35801c() {
            return this.f22388b;
        }
    }

    public C11252j(int i, String str) {
        this.f22376b = i;
        this.f22377c = str;
    }

    public C11252j(C11253a aVar) {
        this.f22376b = aVar.mo35800b();
        this.f22377c = aVar.mo35801c();
    }

    /* renamed from: c */
    public String mo35795c() {
        return mo35796d() + " " + mo35797e();
    }

    /* renamed from: d */
    public int mo35796d() {
        return this.f22376b;
    }

    /* renamed from: e */
    public String mo35797e() {
        return this.f22377c;
    }

    /* renamed from: f */
    public boolean mo35798f() {
        return this.f22376b >= 300;
    }

    public String toString() {
        return mo35795c();
    }
}
