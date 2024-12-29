package p173j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p156f.C4322b0;
import p156f.C4336d0;
import p173j.C11575e;
import retrofit2.http.Streaming;

/* renamed from: j.a */
final class C11567a extends C11575e.C4448a {

    /* renamed from: j.a$a */
    static final class C11568a implements C11575e<C4336d0, C4336d0> {

        /* renamed from: a */
        static final C11568a f22989a = new C11568a();

        C11568a() {
        }

        /* renamed from: a */
        public C4336d0 convert(C4336d0 d0Var) {
            try {
                return C4482o.m13229a(d0Var);
            } finally {
                d0Var.close();
            }
        }
    }

    /* renamed from: j.a$b */
    static final class C11569b implements C11575e<C4322b0, C4322b0> {

        /* renamed from: a */
        static final C11569b f22990a = new C11569b();

        C11569b() {
        }

        /* renamed from: a */
        public C4322b0 mo36494a(C4322b0 b0Var) {
            return b0Var;
        }

        public /* bridge */ /* synthetic */ Object convert(Object obj) {
            C4322b0 b0Var = (C4322b0) obj;
            mo36494a(b0Var);
            return b0Var;
        }
    }

    /* renamed from: j.a$c */
    static final class C11570c implements C11575e<C4336d0, C4336d0> {

        /* renamed from: a */
        static final C11570c f22991a = new C11570c();

        C11570c() {
        }

        /* renamed from: a */
        public C4336d0 mo36495a(C4336d0 d0Var) {
            return d0Var;
        }

        public /* bridge */ /* synthetic */ Object convert(Object obj) {
            C4336d0 d0Var = (C4336d0) obj;
            mo36495a(d0Var);
            return d0Var;
        }
    }

    /* renamed from: j.a$d */
    static final class C11571d implements C11575e<Object, String> {

        /* renamed from: a */
        static final C11571d f22992a = new C11571d();

        C11571d() {
        }

        /* renamed from: a */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: j.a$e */
    static final class C11572e implements C11575e<C4336d0, Void> {

        /* renamed from: a */
        static final C11572e f22993a = new C11572e();

        C11572e() {
        }

        /* renamed from: a */
        public Void convert(C4336d0 d0Var) {
            d0Var.close();
            return null;
        }
    }

    C11567a() {
    }

    /* renamed from: a */
    public C11575e<?, C4322b0> mo24530a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C4477m mVar) {
        if (C4322b0.class.isAssignableFrom(C4482o.m13237i(type))) {
            return C11569b.f22990a;
        }
        return null;
    }

    /* renamed from: b */
    public C11575e<C4336d0, ?> mo24531b(Type type, Annotation[] annotationArr, C4477m mVar) {
        if (type == C4336d0.class) {
            return C4482o.m13241m(annotationArr, Streaming.class) ? C11570c.f22991a : C11568a.f22989a;
        }
        if (type == Void.class) {
            return C11572e.f22993a;
        }
        return null;
    }
}
