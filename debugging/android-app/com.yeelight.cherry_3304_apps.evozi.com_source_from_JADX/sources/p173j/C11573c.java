package p173j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: j.c */
public interface C11573c<R, T> {

    /* renamed from: j.c$a */
    public static abstract class C4447a {
        /* renamed from: b */
        protected static Class<?> m13118b(Type type) {
            return C4482o.m13237i(type);
        }

        @Nullable
        /* renamed from: a */
        public abstract C11573c<?, ?> mo24529a(Type type, Annotation[] annotationArr, C4477m mVar);
    }

    /* renamed from: a */
    T mo36498a(C4446b<R> bVar);

    Type responseType();
}
