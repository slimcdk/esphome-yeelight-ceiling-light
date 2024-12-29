package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p177j7.C9216a;

/* renamed from: retrofit2.b */
public interface C10318b<R, T> {

    /* renamed from: retrofit2.b$a */
    public static abstract class C3637a {
        /* renamed from: b */
        protected static Class<?> m10383b(Type type) {
            return C3672m.m10502i(type);
        }

        @Nullable
        /* renamed from: a */
        public abstract C10318b<?, ?> mo25980a(Type type, Annotation[] annotationArr, C3667k kVar);
    }

    /* renamed from: a */
    T mo41861a(C9216a<R> aVar);

    Type responseType();
}
