package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.C3505a0;
import okhttp3.C3518c0;

/* renamed from: retrofit2.c */
public interface C10319c<F, T> {

    /* renamed from: retrofit2.c$a */
    public static abstract class C3638a {
        @Nullable
        /* renamed from: a */
        public C10319c<?, C3505a0> mo25981a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C3667k kVar) {
            return null;
        }

        @Nullable
        /* renamed from: b */
        public C10319c<C3518c0, ?> mo25982b(Type type, Annotation[] annotationArr, C3667k kVar) {
            return null;
        }

        @Nullable
        /* renamed from: c */
        public C10319c<?, String> mo25983c(Type type, Annotation[] annotationArr, C3667k kVar) {
            return null;
        }
    }

    T convert(F f);
}
