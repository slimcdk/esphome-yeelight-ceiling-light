package p262i;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p262i.C11525d;

/* renamed from: i.f */
final class C11529f implements C11525d<C11524c<?>> {

    /* renamed from: b */
    static final C11525d.C11526a f22890b = new C11530a();

    /* renamed from: a */
    private final Type f22891a;

    /* renamed from: i.f$a */
    static class C11530a implements C11525d.C11526a {
        C11530a() {
        }

        public C11525d<?> get(Type type, Annotation[] annotationArr, C11562s sVar) {
            if (C11566t.m30355d(type) != C11524c.class) {
                return null;
            }
            return new C11529f(C11566t.m30354c(type));
        }
    }

    C11529f(Type type) {
        this.f22891a = type;
    }

    /* renamed from: a */
    public <R> C11524c<R> mo36448a(C11524c<R> cVar) {
        return cVar;
    }

    public /* bridge */ /* synthetic */ Object adapt(C11524c cVar) {
        mo36448a(cVar);
        return cVar;
    }

    public Type responseType() {
        return this.f22891a;
    }
}
