package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p177j7.C9216a;
import retrofit2.C10318b;

/* renamed from: retrofit2.d */
final class C10320d extends C10318b.C3637a {

    /* renamed from: a */
    static final C10318b.C3637a f19387a = new C10320d();

    /* renamed from: retrofit2.d$a */
    class C10321a implements C10318b<Object, C9216a<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f19388a;

        C10321a(C10320d dVar, Type type) {
            this.f19388a = type;
        }

        /* renamed from: b */
        public C9216a<Object> mo41861a(C9216a<Object> aVar) {
            return aVar;
        }

        public Type responseType() {
            return this.f19388a;
        }
    }

    C10320d() {
    }

    /* renamed from: a */
    public C10318b<?, ?> mo25980a(Type type, Annotation[] annotationArr, C3667k kVar) {
        if (C10318b.C3637a.m10383b(type) != C9216a.class) {
            return null;
        }
        return new C10321a(this, C3672m.m10499f(type));
    }
}
