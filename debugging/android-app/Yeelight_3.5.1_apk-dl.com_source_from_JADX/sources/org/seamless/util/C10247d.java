package org.seamless.util;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.p194io.FilenameUtils;

/* renamed from: org.seamless.util.d */
public class C10247d {
    /* renamed from: a */
    public static String m25763a(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    /* renamed from: b */
    public static Object m25764b(Field field, Object obj) {
        boolean isAccessible = field.isAccessible();
        try {
            field.setAccessible(true);
            Object obj2 = field.get(obj);
            field.setAccessible(isAccessible);
            return obj2;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Could not get field value by reflection: " + m25775m(field) + " on: " + obj.getClass().getName(), e);
        } catch (Throwable th) {
            field.setAccessible(isAccessible);
            throw th;
        }
    }

    /* renamed from: c */
    public static Class<?> m25765c(Type type) {
        Class<?> c;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m25765c(((ParameterizedType) type).getRawType());
        }
        if (!(type instanceof GenericArrayType) || (c = m25765c(((GenericArrayType) type).getGenericComponentType())) == null) {
            return null;
        }
        return Array.newInstance(c, 0).getClass();
    }

    /* renamed from: d */
    public static Field m25766d(Class<? super Object> cls, String str) {
        while (cls != null && cls != Object.class) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* renamed from: e */
    public static List<Field> m25767e(Class<? super Object> cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(cls2)) {
                    arrayList.add(field);
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* renamed from: f */
    public static Method m25768f(Class<? super Object> cls, String str) {
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                String name = method.getName();
                if (method.getParameterTypes().length == 0) {
                    if (name.startsWith("get")) {
                        if (m25763a(name.substring(3)).equals(str)) {
                            return method;
                        }
                    } else if (name.startsWith("is") && m25763a(name.substring(2)).equals(str)) {
                        return method;
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* renamed from: g */
    public static Method m25769g(Class cls, String str) {
        Class cls2 = cls;
        while (cls2 != null && cls2 != Object.class) {
            try {
                return cls2.getDeclaredMethod(str, new Class[0]);
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new IllegalArgumentException("No such method: " + cls.getName() + FilenameUtils.EXTENSION_SEPARATOR + str);
    }

    /* renamed from: h */
    public static String m25770h(String str) {
        String substring;
        if (!str.startsWith("get")) {
            if (str.startsWith("is")) {
                substring = str.substring(2);
                return m25763a(substring);
            } else if (!str.startsWith("set")) {
                return null;
            }
        }
        substring = str.substring(3);
        return m25763a(substring);
    }

    /* renamed from: i */
    public static List<Method> m25771i(Class<? super Object> cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(cls2)) {
                    arrayList.add(method);
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* renamed from: j */
    public static <T> List<Class<?>> m25772j(Class<T> cls, Class<? extends T> cls2) {
        int i;
        Type type;
        HashMap hashMap = new HashMap();
        Type type2 = cls2;
        while (true) {
            i = 0;
            if (m25765c(type2).equals(cls)) {
                break;
            }
            if (type2 instanceof Class) {
                type = ((Class) type2).getGenericSuperclass();
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type2;
                Class cls3 = (Class) parameterizedType.getRawType();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                TypeVariable[] typeParameters = cls3.getTypeParameters();
                while (i < actualTypeArguments.length) {
                    hashMap.put(typeParameters[i], actualTypeArguments[i]);
                    i++;
                }
                type = !cls3.equals(cls) ? cls3.getGenericSuperclass() : type2;
            }
            type2 = type;
        }
        Type[] typeParameters2 = type2 instanceof Class ? ((Class) type2).getTypeParameters() : ((ParameterizedType) type2).getActualTypeArguments();
        ArrayList arrayList = new ArrayList();
        int length = typeParameters2.length;
        while (i < length) {
            Type type3 = typeParameters2[i];
            while (hashMap.containsKey(type3)) {
                type3 = (Type) hashMap.get(type3);
            }
            arrayList.add(m25765c(type3));
            i++;
        }
        return arrayList;
    }

    /* renamed from: k */
    public static Object m25773k(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalArgumentException e) {
            String str = "Could not invoke method by reflection: " + m25775m(method);
            if (objArr != null && objArr.length > 0) {
                str = str + " with parameters: (" + m25774l(", ", objArr) + ')';
            }
            throw new IllegalArgumentException(str + " on: " + obj.getClass().getName(), e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof Exception) {
                throw ((Exception) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: l */
    public static String m25774l(String str, Object... objArr) {
        if (objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            sb.append(str);
            sb.append(obj == null ? "null" : obj.getClass().getName());
        }
        return sb.substring(str.length());
    }

    /* renamed from: m */
    public static String m25775m(Member member) {
        return m25776n(member.getDeclaringClass().getName()) + FilenameUtils.EXTENSION_SEPARATOR + member.getName();
    }

    /* renamed from: n */
    public static String m25776n(String str) {
        return m25777o(str, FilenameUtils.EXTENSION_SEPARATOR);
    }

    /* renamed from: o */
    public static String m25777o(String str, char c) {
        return str.substring(str.lastIndexOf(c) + 1, str.length());
    }
}
