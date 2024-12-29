package p173j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p173j.C11573c;

/* renamed from: j.f */
final class C11576f extends C11573c.C4447a {

    /* renamed from: a */
    static final C11573c.C4447a f22994a = new C11576f();

    /* renamed from: j.f$a */
    class C11577a implements C11573c<Object, C4446b<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f22995a;

        C11577a(C11576f fVar, Type type) {
            this.f22995a = type;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo36498a(C4446b bVar) {
            mo36500b(bVar);
            return bVar;
        }

        /* renamed from: b */
        public C4446b<Object> mo36500b(C4446b<Object> bVar) {
            return bVar;
        }

        public Type responseType() {
            return this.f22995a;
        }
    }

    C11576f() {
    }

    /* renamed from: a */
    public C11573c<?, ?> mo24529a(Type type, Annotation[] annotationArr, C4477m mVar) {
        if (C11573c.C4447a.m13118b(type) != C4446b.class) {
            return null;
        }
        return new C11577a(this, C4482o.m13234f(type));
    }
}
