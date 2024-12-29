package p011c.p012a.p046d.p051y;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p011c.p012a.p046d.p047x.C0691a;
import p011c.p012a.p046d.p047x.C0692b;

/* renamed from: c.a.d.y.a */
public class C0808a<T> {

    /* renamed from: a */
    final Class<? super T> f625a;

    /* renamed from: b */
    final Type f626b;

    /* renamed from: c */
    final int f627c = this.f626b.hashCode();

    protected C0808a() {
        Type d = m1034d(C0808a.class);
        this.f626b = d;
        this.f625a = C0692b.m711k(d);
    }

    C0808a(Type type) {
        C0691a.m700b(type);
        Type b = C0692b.m702b(type);
        this.f626b = b;
        this.f625a = C0692b.m711k(b);
    }

    /* renamed from: a */
    public static <T> C0808a<T> m1032a(Class<T> cls) {
        return new C0808a<>(cls);
    }

    /* renamed from: b */
    public static C0808a<?> m1033b(Type type) {
        return new C0808a<>(type);
    }

    /* renamed from: d */
    static Type m1034d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C0692b.m702b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: c */
    public final Class<? super T> mo8967c() {
        return this.f625a;
    }

    /* renamed from: e */
    public final Type mo8968e() {
        return this.f626b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0808a) && C0692b.m706f(this.f626b, ((C0808a) obj).f626b);
    }

    public final int hashCode() {
        return this.f627c;
    }

    public final String toString() {
        return C0692b.m721u(this.f626b);
    }
}
