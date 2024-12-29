package p119y1;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.C2496a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: y1.a */
public class C3918a<T> {

    /* renamed from: a */
    final Class<? super T> f6559a;

    /* renamed from: b */
    final Type f6560b;

    /* renamed from: c */
    final int f6561c;

    protected C3918a() {
        Type d = m11209d(C3918a.class);
        this.f6560b = d;
        this.f6559a = C$Gson$Types.m6723k(d);
        this.f6561c = d.hashCode();
    }

    C3918a(Type type) {
        Type b = C$Gson$Types.m6714b((Type) C2496a.m6750b(type));
        this.f6560b = b;
        this.f6559a = C$Gson$Types.m6723k(b);
        this.f6561c = b.hashCode();
    }

    /* renamed from: a */
    public static <T> C3918a<T> m11207a(Class<T> cls) {
        return new C3918a<>(cls);
    }

    /* renamed from: b */
    public static C3918a<?> m11208b(Type type) {
        return new C3918a<>(type);
    }

    /* renamed from: d */
    static Type m11209d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C$Gson$Types.m6714b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: c */
    public final Class<? super T> mo26409c() {
        return this.f6559a;
    }

    /* renamed from: e */
    public final Type mo26410e() {
        return this.f6560b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3918a) && C$Gson$Types.m6718f(this.f6560b, ((C3918a) obj).f6560b);
    }

    public final int hashCode() {
        return this.f6561c;
    }

    public final String toString() {
        return C$Gson$Types.m6733u(this.f6560b);
    }
}
