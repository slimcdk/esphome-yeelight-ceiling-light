package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C3505a0;
import okhttp3.C3518c0;
import retrofit2.C10319c;
import retrofit2.http.Streaming;

/* renamed from: retrofit2.a */
final class C10312a extends C10319c.C3638a {

    /* renamed from: retrofit2.a$a */
    static final class C10313a implements C10319c<C3518c0, C3518c0> {

        /* renamed from: a */
        static final C10313a f19382a = new C10313a();

        C10313a() {
        }

        /* renamed from: a */
        public C3518c0 convert(C3518c0 c0Var) {
            try {
                return C3672m.m10494a(c0Var);
            } finally {
                c0Var.close();
            }
        }
    }

    /* renamed from: retrofit2.a$b */
    static final class C10314b implements C10319c<C3505a0, C3505a0> {

        /* renamed from: a */
        static final C10314b f19383a = new C10314b();

        C10314b() {
        }

        /* renamed from: a */
        public C3505a0 convert(C3505a0 a0Var) {
            return a0Var;
        }
    }

    /* renamed from: retrofit2.a$c */
    static final class C10315c implements C10319c<C3518c0, C3518c0> {

        /* renamed from: a */
        static final C10315c f19384a = new C10315c();

        C10315c() {
        }

        /* renamed from: a */
        public C3518c0 convert(C3518c0 c0Var) {
            return c0Var;
        }
    }

    /* renamed from: retrofit2.a$d */
    static final class C10316d implements C10319c<Object, String> {

        /* renamed from: a */
        static final C10316d f19385a = new C10316d();

        C10316d() {
        }

        /* renamed from: a */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: retrofit2.a$e */
    static final class C10317e implements C10319c<C3518c0, Void> {

        /* renamed from: a */
        static final C10317e f19386a = new C10317e();

        C10317e() {
        }

        /* renamed from: a */
        public Void convert(C3518c0 c0Var) {
            c0Var.close();
            return null;
        }
    }

    C10312a() {
    }

    /* renamed from: a */
    public C10319c<?, C3505a0> mo25981a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C3667k kVar) {
        if (C3505a0.class.isAssignableFrom(C3672m.m10502i(type))) {
            return C10314b.f19383a;
        }
        return null;
    }

    /* renamed from: b */
    public C10319c<C3518c0, ?> mo25982b(Type type, Annotation[] annotationArr, C3667k kVar) {
        if (type == C3518c0.class) {
            return C3672m.m10506m(annotationArr, Streaming.class) ? C10315c.f19384a : C10313a.f19382a;
        }
        if (type == Void.class) {
            return C10317e.f19386a;
        }
        return null;
    }
}
