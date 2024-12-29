package p173i7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: i7.d */
public interface C9136d<T> {

    /* renamed from: i7.d$a */
    public interface C9137a {
        C9136d<?> get(Type type, Annotation[] annotationArr, C9173s sVar);
    }

    <R> T adapt(C9135c<R> cVar);

    Type responseType();
}
