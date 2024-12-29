package p262i;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: i.d */
public interface C11525d<T> {

    /* renamed from: i.d$a */
    public interface C11526a {
        C11525d<?> get(Type type, Annotation[] annotationArr, C11562s sVar);
    }

    <R> T adapt(C11524c<R> cVar);

    Type responseType();
}
