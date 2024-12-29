package p164h.p165b.p166a.p240h.p243r;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h.b.a.h.r.i */
public class C11249i extends C11248h {

    /* renamed from: b */
    private C11250a f22364b;

    /* renamed from: c */
    private URI f22365c;

    /* renamed from: h.b.a.h.r.i$a */
    public enum C11250a {
        GET("GET"),
        POST("POST"),
        NOTIFY("NOTIFY"),
        MSEARCH("M-SEARCH"),
        SUBSCRIBE("SUBSCRIBE"),
        UNSUBSCRIBE("UNSUBSCRIBE"),
        UNKNOWN("UNKNOWN");
        

        /* renamed from: i */
        private static Map<String, C11250a> f22373i;

        /* renamed from: a */
        private String f22375a;

        /* renamed from: h.b.a.h.r.i$a$a */
        static class C11251a extends HashMap<String, C11250a> {
            C11251a() {
                for (C11250a aVar : C11250a.values()) {
                    put(aVar.mo35794b(), aVar);
                }
            }
        }

        static {
            f22373i = new C11251a();
        }

        private C11250a(String str) {
            this.f22375a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
            r3 = f22373i.get(r3.toUpperCase(java.util.Locale.ROOT));
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p164h.p165b.p166a.p240h.p243r.C11249i.C11250a m29432a(java.lang.String r3) {
            /*
                h.b.a.h.r.i$a r0 = UNKNOWN
                if (r3 != 0) goto L_0x0005
                return r0
            L_0x0005:
                java.util.Map<java.lang.String, h.b.a.h.r.i$a> r1 = f22373i
                java.util.Locale r2 = java.util.Locale.ROOT
                java.lang.String r3 = r3.toUpperCase(r2)
                java.lang.Object r3 = r1.get(r3)
                h.b.a.h.r.i$a r3 = (p164h.p165b.p166a.p240h.p243r.C11249i.C11250a) r3
                if (r3 == 0) goto L_0x0016
                r0 = r3
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p240h.p243r.C11249i.C11250a.m29432a(java.lang.String):h.b.a.h.r.i$a");
        }

        /* renamed from: b */
        public String mo35794b() {
            return this.f22375a;
        }
    }

    public C11249i(C11250a aVar) {
        this.f22364b = aVar;
    }

    public C11249i(C11250a aVar, URI uri) {
        this.f22364b = aVar;
        this.f22365c = uri;
    }

    public C11249i(C11250a aVar, URL url) {
        this.f22364b = aVar;
        if (url != null) {
            try {
                this.f22365c = url.toURI();
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    /* renamed from: c */
    public String mo35789c() {
        return this.f22364b.mo35794b();
    }

    /* renamed from: d */
    public C11250a mo35790d() {
        return this.f22364b;
    }

    /* renamed from: e */
    public URI mo35791e() {
        return this.f22365c;
    }

    /* renamed from: f */
    public void mo35792f(URI uri) {
        this.f22365c = uri;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo35789c());
        if (mo35791e() != null) {
            str = " " + mo35791e();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
