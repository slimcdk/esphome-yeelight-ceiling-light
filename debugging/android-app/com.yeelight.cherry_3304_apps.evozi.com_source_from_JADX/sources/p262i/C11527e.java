package p262i;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p011c.p083d.p084a.C0988a0;
import p011c.p083d.p084a.C1147y;

/* renamed from: i.e */
public interface C11527e<F, T> {

    /* renamed from: i.e$a */
    public static abstract class C11528a {
        public C11527e<C0988a0, ?> fromResponseBody(Type type, Annotation[] annotationArr) {
            return null;
        }

        public C11527e<?, C1147y> toRequestBody(Type type, Annotation[] annotationArr) {
            return null;
        }
    }

    T convert(F f);
}
