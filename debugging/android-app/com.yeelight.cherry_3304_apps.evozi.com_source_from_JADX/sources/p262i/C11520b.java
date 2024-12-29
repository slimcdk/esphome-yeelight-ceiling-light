package p262i;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p011c.p083d.p084a.C0988a0;
import p011c.p083d.p084a.C1147y;
import p262i.C11527e;
import retrofit.http.Streaming;

/* renamed from: i.b */
final class C11520b extends C11527e.C11528a {

    /* renamed from: i.b$a */
    static final class C11521a implements C11527e<C1147y, C1147y> {
        C11521a() {
        }

        /* renamed from: a */
        public C1147y mo36443a(C1147y yVar) {
            return yVar;
        }

        public /* bridge */ /* synthetic */ Object convert(Object obj) {
            C1147y yVar = (C1147y) obj;
            mo36443a(yVar);
            return yVar;
        }
    }

    /* renamed from: i.b$b */
    static final class C11522b implements C11527e<C0988a0, C0988a0> {

        /* renamed from: a */
        private final boolean f22889a;

        C11522b(boolean z) {
            this.f22889a = z;
        }

        /* renamed from: a */
        public C0988a0 convert(C0988a0 a0Var) {
            if (this.f22889a) {
                return a0Var;
            }
            try {
                return C11566t.m30361j(a0Var);
            } finally {
                C11566t.m30353b(a0Var);
            }
        }
    }

    /* renamed from: i.b$c */
    static final class C11523c implements C11527e<C0988a0, Void> {
        C11523c() {
        }

        /* renamed from: a */
        public Void convert(C0988a0 a0Var) {
            a0Var.close();
            return null;
        }
    }

    C11520b() {
    }

    public C11527e<C0988a0, ?> fromResponseBody(Type type, Annotation[] annotationArr) {
        if (C0988a0.class.equals(type)) {
            return new C11522b(C11566t.m30358g(annotationArr, Streaming.class));
        }
        if (Void.class.equals(type)) {
            return new C11523c();
        }
        return null;
    }

    public C11527e<?, C1147y> toRequestBody(Type type, Annotation[] annotationArr) {
        if (!(type instanceof Class) || !C1147y.class.isAssignableFrom((Class) type)) {
            return null;
        }
        return new C11521a();
    }
}
