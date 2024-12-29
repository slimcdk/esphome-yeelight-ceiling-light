package p262i;

import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import p011c.p083d.p084a.C0988a0;
import p163g.C4406c;
import p163g.C4410e;

/* renamed from: i.t */
final class C11566t {
    /* renamed from: a */
    static <T> T m30352a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: b */
    static void m30353b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    static Type m30354c(Type type) {
        if (type instanceof ParameterizedType) {
            Type e = m30356e((ParameterizedType) type);
            if (m30355d(e) != C11561r.class) {
                return e;
            }
            throw new IllegalArgumentException("Call<T> cannot use Response as its generic parameter. Specify the response body type only (e.g., Call<TweetResponse>).");
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    /* renamed from: d */
    public static Class<?> m30355d(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m30355d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m30355d(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: e */
    public static Type m30356e(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            Type type = actualTypeArguments[0];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Expected one type argument but got: " + Arrays.toString(actualTypeArguments));
    }

    /* renamed from: f */
    public static boolean m30357f(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type f : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m30357f(f)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return m30357f(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    /* renamed from: g */
    static boolean m30358g(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    static RuntimeException m30359h(Throwable th, Method method, String str, Object... objArr) {
        String format = String.format(str, objArr);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(format + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName());
        illegalArgumentException.initCause(th);
        return illegalArgumentException;
    }

    /* renamed from: i */
    static RuntimeException m30360i(Method method, String str, Object... objArr) {
        return m30359h((Throwable) null, method, str, objArr);
    }

    /* renamed from: j */
    static C0988a0 m30361j(C0988a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        C4410e s = a0Var.mo9390s();
        C4406c cVar = new C4406c();
        cVar.mo24261s0(s);
        s.close();
        return C0988a0.m1900n(a0Var.mo9389j(), a0Var.mo9388i(), cVar);
    }

    /* renamed from: k */
    static <T> void m30362k(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }
}
