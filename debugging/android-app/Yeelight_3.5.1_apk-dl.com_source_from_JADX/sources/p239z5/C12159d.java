package p239z5;

import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import p208s4.C10364p;

/* renamed from: z5.d */
public interface C12159d {

    /* renamed from: M */
    public static final C12159d f22392M = new C12160a();

    /* renamed from: N */
    public static final C12159d f22393N = new C12161b();

    /* renamed from: O */
    public static final C12159d f22394O = new C12162c();

    /* renamed from: P */
    public static final C12159d f22395P = new C12163d();

    /* renamed from: z5.d$a */
    static class C12160a implements C12159d {
        C12160a() {
        }

        public String toString() {
            return "UNAUTHENTICATED";
        }
    }

    /* renamed from: z5.d$b */
    static class C12161b implements C12159d {
        C12161b() {
        }

        public String toString() {
            return "NOT CHECKED";
        }
    }

    /* renamed from: z5.d$c */
    static class C12162c implements C12166g {
        C12162c() {
        }

        public String toString() {
            return "CHALLENGE";
        }
    }

    /* renamed from: z5.d$d */
    static class C12163d implements C12166g {
        C12163d() {
        }

        public String toString() {
            return "FAILURE";
        }
    }

    /* renamed from: z5.d$e */
    static class C12164e implements C12166g {
        C12164e() {
        }

        public String toString() {
            return "SEND_SUCCESS";
        }
    }

    /* renamed from: z5.d$f */
    public interface C12165f extends C12159d {
        /* renamed from: a */
        C12159d mo39903a(C10364p pVar);
    }

    /* renamed from: z5.d$g */
    public interface C12166g extends C12159d {
    }

    /* renamed from: z5.d$h */
    public interface C12167h extends C12159d {
        String getAuthMethod();

        C12193w getUserIdentity();
    }

    /* renamed from: z5.d$i */
    public interface C12168i extends C12159d {
        /* renamed from: e */
        C9279c mo43036e();

        /* renamed from: p */
        C9277a mo43037p();
    }

    static {
        new C12164e();
    }
}
