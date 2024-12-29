package com.xiaomi.push;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.ba */
public class C4525ba {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f8213a;

    /* renamed from: com.xiaomi.push.ba$a */
    public static class C4526a<T> {

        /* renamed from: a */
        public final Class<? extends T> f8214a;

        /* renamed from: a */
        public final T f8215a;
    }

    static {
        HashMap hashMap = new HashMap();
        f8213a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f8213a.put(Byte.class, Byte.TYPE);
        f8213a.put(Character.class, Character.TYPE);
        f8213a.put(Short.class, Short.TYPE);
        f8213a.put(Integer.class, Integer.TYPE);
        f8213a.put(Float.class, Float.TYPE);
        f8213a.put(Long.class, Long.TYPE);
        f8213a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f8213a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f8213a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f8213a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f8213a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f8213a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f8213a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f8213a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f8213a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m13399a(java.lang.Class<? extends java.lang.Object> r2, java.lang.Object r3, java.lang.String r4) {
        /*
            r0 = 0
        L_0x0001:
            r1 = 1
            if (r0 != 0) goto L_0x0019
            java.lang.reflect.Field r0 = r2.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x000c }
            r0.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x000c }
            goto L_0x0010
        L_0x000c:
            java.lang.Class r2 = r2.getSuperclass()
        L_0x0010:
            if (r2 == 0) goto L_0x0013
            goto L_0x0001
        L_0x0013:
            java.lang.NoSuchFieldException r2 = new java.lang.NoSuchFieldException
            r2.<init>()
            throw r2
        L_0x0019:
            r0.setAccessible(r1)
            java.lang.Object r2 = r0.get(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4525ba.m13399a(java.lang.Class, java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* renamed from: a */
    public static <T> T m13400a(Class<? extends Object> cls, String str) {
        try {
            return m13399a(cls, (Object) null, str);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m13401a(Class<?> cls, String str, Object... objArr) {
        return m13406a(cls, str, (Class<?>[]) m13409a(objArr)).invoke((Object) null, m13409a(objArr));
    }

    /* renamed from: a */
    public static <T> T m13402a(Object obj, String str) {
        try {
            return m13399a((Class<? extends Object>) obj.getClass(), obj, str);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m13403a(Object obj, String str, Object... objArr) {
        try {
            return m13411b(obj, str, objArr);
        } catch (Exception unused) {
            "Meet exception when call Method '" + str + "' in " + obj;
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m13404a(String str, String str2) {
        try {
            return m13399a((Class<? extends Object>) C4937t.m15867a((Context) null, str), (Object) null, str2);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m13405a(String str, String str2, Object... objArr) {
        try {
            return m13401a(C4937t.m15867a((Context) null, str), str2, objArr);
        } catch (Exception unused) {
            "Meet exception when call Method '" + str2 + "' in " + str;
            return null;
        }
    }

    /* renamed from: a */
    private static Method m13406a(Class<?> cls, String str, Class<?>... clsArr) {
        Method a = m13407a(cls.getDeclaredMethods(), str, clsArr);
        if (a != null) {
            a.setAccessible(true);
            return a;
        } else if (cls.getSuperclass() != null) {
            return m13406a((Class<?>) cls.getSuperclass(), str, clsArr);
        } else {
            throw new NoSuchMethodException();
        }
    }

    /* renamed from: a */
    private static Method m13407a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m13408a((Class<?>[]) method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    /* renamed from: a */
    private static boolean m13408a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr2[i] != null && !clsArr[i].isAssignableFrom(clsArr2[i]) && (!f8213a.containsKey(clsArr[i]) || !f8213a.get(clsArr[i]).equals(f8213a.get(clsArr2[i])))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Class<?>[] m13409a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C4526a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C4526a)) {
                clsArr[i] = aVar == null ? null : aVar.getClass();
            } else {
                clsArr[i] = aVar.f8214a;
            }
        }
        return clsArr;
    }

    /* renamed from: a */
    private static Object[] m13410a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C4526a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C4526a)) {
                objArr2[i] = aVar;
            } else {
                objArr2[i] = aVar.f8215a;
            }
        }
        return objArr2;
    }

    /* renamed from: b */
    public static <T> T m13411b(Object obj, String str, Object... objArr) {
        return m13406a(obj.getClass(), str, (Class<?>[]) m13409a(objArr)).invoke(obj, m13409a(objArr));
    }
}
