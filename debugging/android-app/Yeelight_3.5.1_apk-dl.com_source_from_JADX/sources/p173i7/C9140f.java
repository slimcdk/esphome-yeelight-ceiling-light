package p173i7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p173i7.C9136d;

/* renamed from: i7.f */
final class C9140f implements C9136d<C9135c<?>> {

    /* renamed from: b */
    static final C9136d.C9137a f16902b = new C9141a();

    /* renamed from: a */
    private final Type f16903a;

    /* renamed from: i7.f$a */
    static class C9141a implements C9136d.C9137a {
        C9141a() {
        }

        public C9136d<?> get(Type type, Annotation[] annotationArr, C9173s sVar) {
            if (C9177t.m22063d(type) != C9135c.class) {
                return null;
            }
            return new C9140f(C9177t.m22062c(type));
        }
    }

    C9140f(Type type) {
        this.f16903a = type;
    }

    /* renamed from: a */
    public <R> C9135c<R> adapt(C9135c<R> cVar) {
        return cVar;
    }

    public Type responseType() {
        return this.f16903a;
    }
}
