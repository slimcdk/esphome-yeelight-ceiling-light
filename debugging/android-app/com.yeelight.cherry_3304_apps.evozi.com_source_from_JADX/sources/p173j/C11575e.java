package p173j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p156f.C4322b0;
import p156f.C4336d0;

/* renamed from: j.e */
public interface C11575e<F, T> {

    /* renamed from: j.e$a */
    public static abstract class C4448a {
        @Nullable
        /* renamed from: a */
        public C11575e<?, C4322b0> mo24530a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C4477m mVar) {
            return null;
        }

        @Nullable
        /* renamed from: b */
        public C11575e<C4336d0, ?> mo24531b(Type type, Annotation[] annotationArr, C4477m mVar) {
            return null;
        }

        @Nullable
        /* renamed from: c */
        public C11575e<?, String> mo24532c(Type type, Annotation[] annotationArr, C4477m mVar) {
            return null;
        }
    }

    T convert(F f);
}
