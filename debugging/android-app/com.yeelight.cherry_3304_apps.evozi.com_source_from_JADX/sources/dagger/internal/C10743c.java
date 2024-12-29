package dagger.internal;

/* renamed from: dagger.internal.c */
public final class C10743c<T> implements C10742b<T> {

    /* renamed from: a */
    private final T f20620a;

    private C10743c(T t) {
        this.f20620a = t;
    }

    /* renamed from: a */
    public static <T> C10742b<T> m26603a(T t) {
        C10744d.m26606c(t, "instance cannot be null");
        return new C10743c(t);
    }

    public T get() {
        return this.f20620a;
    }
}
