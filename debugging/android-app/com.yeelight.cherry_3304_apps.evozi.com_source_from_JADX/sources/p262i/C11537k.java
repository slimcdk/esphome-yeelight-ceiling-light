package p262i;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p011c.p083d.p084a.C0988a0;

/* renamed from: i.k */
final class C11537k<T> {

    /* renamed from: a */
    private final C11562s f22904a;

    /* renamed from: b */
    private final C11559p f22905b;

    /* renamed from: c */
    private final C11525d<T> f22906c;

    /* renamed from: d */
    private final C11527e<C0988a0, T> f22907d;

    private C11537k(C11562s sVar, C11559p pVar, C11525d<T> dVar, C11527e<C0988a0, T> eVar) {
        this.f22904a = sVar;
        this.f22905b = pVar;
        this.f22906c = dVar;
        this.f22907d = eVar;
    }

    /* renamed from: a */
    static C11537k<?> m30267a(C11562s sVar, Method method) {
        C11525d<?> b = m30268b(method, sVar);
        Type responseType = b.responseType();
        return new C11537k<>(sVar, C11560q.m30320c(method, responseType, sVar), b, m30269c(method, sVar, responseType));
    }

    /* renamed from: b */
    private static C11525d<?> m30268b(Method method, C11562s sVar) {
        Type genericReturnType = method.getGenericReturnType();
        if (C11566t.m30357f(genericReturnType)) {
            throw C11566t.m30360i(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            try {
                return sVar.mo36477b(genericReturnType, method.getAnnotations());
            } catch (RuntimeException e) {
                throw C11566t.m30359h(e, method, "Unable to create call adapter for %s", genericReturnType);
            }
        } else {
            throw C11566t.m30360i(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* renamed from: c */
    private static C11527e<C0988a0, ?> m30269c(Method method, C11562s sVar, Type type) {
        try {
            return sVar.mo36483i(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw C11566t.m30359h(e, method, "Unable to create converter for %s", type);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo36453d(Object... objArr) {
        return this.f22906c.adapt(new C11538l(this.f22904a, this.f22905b, this.f22907d, objArr));
    }
}
