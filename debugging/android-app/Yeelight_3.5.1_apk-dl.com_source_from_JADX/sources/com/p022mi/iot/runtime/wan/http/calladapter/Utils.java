package com.p022mi.iot.runtime.wan.http.calladapter;

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
import p173i7.C9172r;

/* renamed from: com.mi.iot.runtime.wan.http.calladapter.Utils */
final class Utils {
    private Utils() {
    }

    static <T> T checkNotNull(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    static Type getCallResponseType(Type type) {
        if (type instanceof ParameterizedType) {
            Type singleParameterUpperBound = getSingleParameterUpperBound((ParameterizedType) type);
            if (getRawType(singleParameterUpperBound) != C9172r.class) {
                return singleParameterUpperBound;
            }
            throw new IllegalArgumentException("Call<T> cannot use Response as its generic parameter. Specify the response body type only (e.g., Call<TweetResponse>).");
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    public static Class<?> getRawType(Type type) {
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
            return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return getRawType(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static Type getSingleParameterUpperBound(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            Type type = actualTypeArguments[0];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Expected one type argument but got: " + Arrays.toString(actualTypeArguments));
    }

    public static boolean hasUnresolvableType(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type hasUnresolvableType : ((ParameterizedType) type).getActualTypeArguments()) {
                if (hasUnresolvableType(hasUnresolvableType)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return hasUnresolvableType(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    static boolean isAnnotationPresent(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    static RuntimeException methodError(Throwable th, Method method, String str, Object... objArr) {
        String format = String.format(str, objArr);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(format + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName());
        illegalArgumentException.initCause(th);
        return illegalArgumentException;
    }

    static RuntimeException methodError(Method method, String str, Object... objArr) {
        return methodError((Throwable) null, method, str, objArr);
    }

    static C4321y readBodyToBytesIfNecessary(C4321y yVar) {
        if (yVar == null) {
            return null;
        }
        C9838e m = yVar.mo26481m();
        C3564c cVar = new C3564c();
        cVar.mo24781s0(m);
        m.close();
        return C4321y.m12221k(yVar.mo26480i(), yVar.mo26479h(), cVar);
    }

    static <T> void validateServiceInterface(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }
}
