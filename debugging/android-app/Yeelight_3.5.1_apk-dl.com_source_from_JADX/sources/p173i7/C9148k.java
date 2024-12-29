package p173i7;

import com.squareup.okhttp.C4321y;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: i7.k */
final class C9148k<T> {

    /* renamed from: a */
    private final C9173s f16916a;

    /* renamed from: b */
    private final C9170p f16917b;

    /* renamed from: c */
    private final C9136d<T> f16918c;

    /* renamed from: d */
    private final C9138e<C4321y, T> f16919d;

    private C9148k(C9173s sVar, C9170p pVar, C9136d<T> dVar, C9138e<C4321y, T> eVar) {
        this.f16916a = sVar;
        this.f16917b = pVar;
        this.f16918c = dVar;
        this.f16919d = eVar;
    }

    /* renamed from: a */
    static C9148k<?> m21975a(C9173s sVar, Method method) {
        C9136d<?> b = m21976b(method, sVar);
        Type responseType = b.responseType();
        return new C9148k<>(sVar, C9171q.m22028c(method, responseType, sVar), b, m21977c(method, sVar, responseType));
    }

    /* renamed from: b */
    private static C9136d<?> m21976b(Method method, C9173s sVar) {
        Type genericReturnType = method.getGenericReturnType();
        if (C9177t.m22065f(genericReturnType)) {
            throw C9177t.m22068i(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            try {
                return sVar.mo37253b(genericReturnType, method.getAnnotations());
            } catch (RuntimeException e) {
                throw C9177t.m22067h(e, method, "Unable to create call adapter for %s", genericReturnType);
            }
        } else {
            throw C9177t.m22068i(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* renamed from: c */
    private static C9138e<C4321y, ?> m21977c(Method method, C9173s sVar, Type type) {
        try {
            return sVar.mo37259i(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw C9177t.m22067h(e, method, "Unable to create converter for %s", type);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo37229d(Object... objArr) {
        return this.f16918c.adapt(new C9149l(this.f16916a, this.f16917b, this.f16919d, objArr));
    }
}
