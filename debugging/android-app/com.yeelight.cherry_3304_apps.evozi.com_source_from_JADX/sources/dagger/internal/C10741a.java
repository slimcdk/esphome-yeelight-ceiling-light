package dagger.internal;

import javax.inject.C11584a;

/* renamed from: dagger.internal.a */
public final class C10741a<T> implements C11584a<T> {

    /* renamed from: c */
    private static final Object f20617c = new Object();

    /* renamed from: a */
    private volatile C11584a<T> f20618a;

    /* renamed from: b */
    private volatile Object f20619b = f20617c;

    private C10741a(C11584a<T> aVar) {
        this.f20618a = aVar;
    }

    /* renamed from: a */
    public static <P extends C11584a<T>, T> C11584a<T> m26601a(P p) {
        C10744d.m26605b(p);
        return p instanceof C10741a ? p : new C10741a(p);
    }

    /* renamed from: b */
    public static Object m26602b(Object obj, Object obj2) {
        if (!(obj != f20617c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f20619b;
        if (t == f20617c) {
            synchronized (this) {
                t = this.f20619b;
                if (t == f20617c) {
                    t = this.f20618a.get();
                    m26602b(this.f20619b, t);
                    this.f20619b = t;
                    this.f20618a = null;
                }
            }
        }
        return t;
    }
}
