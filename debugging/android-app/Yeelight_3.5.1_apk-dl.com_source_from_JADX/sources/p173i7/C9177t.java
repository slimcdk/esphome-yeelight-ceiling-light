package p173i7;

import com.squareup.okhttp.C4321y;
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
import java.util.Objects;
import okio.C3564c;
import okio.C9838e;

/* renamed from: i7.t */
final class C9177t {
    /* renamed from: a */
    static <T> T m22060a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: b */
    static void m22061b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    static Type m22062c(Type type) {
        if (type instanceof ParameterizedType) {
            Type e = m22064e((ParameterizedType) type);
            if (m22063d(e) != C9172r.class) {
                return e;
            }
            throw new IllegalArgumentException("Call<T> cannot use Response as its generic parameter. Specify the response body type only (e.g., Call<TweetResponse>).");
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    /* renamed from: d */
    public static Class<?> m22063d(Type type) {
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
            return Array.newInstance(m22063d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m22063d(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: e */
    public static Type m22064e(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            Type type = actualTypeArguments[0];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Expected one type argument but got: " + Arrays.toString(actualTypeArguments));
    }

    /* renamed from: f */
    public static boolean m22065f(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type f : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m22065f(f)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return m22065f(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    /* renamed from: g */
    static boolean m22066g(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    static RuntimeException m22067h(Throwable th, Method method, String str, Object... objArr) {
        String format = String.format(str, objArr);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(format + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName());
        illegalArgumentException.initCause(th);
        return illegalArgumentException;
    }

    /* renamed from: i */
    static RuntimeException m22068i(Method method, String str, Object... objArr) {
        return m22067h((Throwable) null, method, str, objArr);
    }

    /* renamed from: j */
    static C4321y m22069j(C4321y yVar) {
        if (yVar == null) {
            return null;
        }
        C9838e m = yVar.mo26481m();
        C3564c cVar = new C3564c();
        cVar.mo24781s0(m);
        m.close();
        return C4321y.m12221k(yVar.mo26480i(), yVar.mo26479h(), cVar);
    }

    /* renamed from: k */
    static <T> void m22070k(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }
}
