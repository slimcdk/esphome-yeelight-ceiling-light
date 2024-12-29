package p173i7;

import com.squareup.okhttp.C4315w;
import com.squareup.okhttp.C4321y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: i7.e */
public interface C9138e<F, T> {

    /* renamed from: i7.e$a */
    public static abstract class C9139a {
        public C9138e<C4321y, ?> fromResponseBody(Type type, Annotation[] annotationArr) {
            return null;
        }

        public C9138e<?, C4315w> toRequestBody(Type type, Annotation[] annotationArr) {
            return null;
        }
    }

    T convert(F f);
}
