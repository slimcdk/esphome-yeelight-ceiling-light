package p173i7;

import com.squareup.okhttp.C4315w;
import com.squareup.okhttp.C4321y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p173i7.C9138e;
import retrofit.http.Streaming;

/* renamed from: i7.b */
final class C9131b extends C9138e.C9139a {

    /* renamed from: i7.b$a */
    static final class C9132a implements C9138e<C4315w, C4315w> {
        C9132a() {
        }

        /* renamed from: a */
        public C4315w convert(C4315w wVar) {
            return wVar;
        }
    }

    /* renamed from: i7.b$b */
    static final class C9133b implements C9138e<C4321y, C4321y> {

        /* renamed from: a */
        private final boolean f16901a;

        C9133b(boolean z) {
            this.f16901a = z;
        }

        /* renamed from: a */
        public C4321y convert(C4321y yVar) {
            if (this.f16901a) {
                return yVar;
            }
            try {
                return C9177t.m22069j(yVar);
            } finally {
                C9177t.m22061b(yVar);
            }
        }
    }

    /* renamed from: i7.b$c */
    static final class C9134c implements C9138e<C4321y, Void> {
        C9134c() {
        }

        /* renamed from: a */
        public Void convert(C4321y yVar) {
            yVar.close();
            return null;
        }
    }

    C9131b() {
    }

    public C9138e<C4321y, ?> fromResponseBody(Type type, Annotation[] annotationArr) {
        if (C4321y.class.equals(type)) {
            return new C9133b(C9177t.m22066g(annotationArr, Streaming.class));
        }
        if (Void.class.equals(type)) {
            return new C9134c();
        }
        return null;
    }

    public C9138e<?, C4315w> toRequestBody(Type type, Annotation[] annotationArr) {
        if (!(type instanceof Class) || !C4315w.class.isAssignableFrom((Class) type)) {
            return null;
        }
        return new C9132a();
    }
}
