package com.xiaomi.push;

import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.xiaomi.push.bk */
public class C4554bk {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f7654a;

    /* renamed from: com.xiaomi.push.bk$a */
    public static class C4555a<T> {

        /* renamed from: a */
        public final Class<? extends T> f7655a;

        /* renamed from: a */
        public final T f7656a;
    }

    static {
        HashMap hashMap = new HashMap();
        f7654a = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put(Boolean.class, cls);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        hashMap.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        hashMap.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        hashMap.put(Long.class, cls4);
        hashMap.put(Double.class, Double.TYPE);
        hashMap.put(cls, cls);
        Class cls5 = Byte.TYPE;
        hashMap.put(cls5, cls5);
        Class cls6 = Character.TYPE;
        hashMap.put(cls6, cls6);
        Class cls7 = Short.TYPE;
        hashMap.put(cls7, cls7);
        hashMap.put(cls2, cls2);
        hashMap.put(cls3, cls3);
        hashMap.put(cls4, cls4);
        Class cls8 = Double.TYPE;
        hashMap.put(cls8, cls8);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m13008a(java.lang.Class<? extends java.lang.Object> r2, java.lang.Object r3, java.lang.String r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4554bk.m13008a(java.lang.Class, java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* renamed from: a */
    public static <T> T m13009a(Class<? extends Object> cls, String str) {
        try {
            return m13008a(cls, (Object) null, str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call getStaticField '");
            sb.append(str);
            sb.append("' in ");
            sb.append(cls != null ? cls.getSimpleName() : "");
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m13010a(Class<?> cls, String str, Object... objArr) {
        return m13015a(cls, str, (Class<?>[]) m13019a(objArr)).invoke((Object) null, m13019a(objArr));
    }

    /* renamed from: a */
    public static <T> T m13011a(Object obj, String str) {
        try {
            return m13008a((Class<? extends Object>) obj.getClass(), obj, str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call getField '");
            sb.append(str);
            sb.append("' in ");
            sb.append(obj);
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m13012a(Object obj, String str, Object... objArr) {
        try {
            return m13021b(obj, str, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call Method '");
            sb.append(str);
            sb.append("' in ");
            sb.append(obj);
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m13013a(String str, String str2) {
        try {
            return m13008a((Class<? extends Object>) C4994v.m15735a((Context) null, str), (Object) null, str2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call getStaticField '");
            sb.append(str2);
            sb.append("' in ");
            sb.append(str);
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m13014a(String str, String str2, Object... objArr) {
        try {
            return m13010a(C4994v.m15735a((Context) null, str), str2, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call Method '");
            sb.append(str2);
            sb.append("' in ");
            sb.append(str);
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    /* renamed from: a */
    private static Method m13015a(Class<?> cls, String str, Class<?>... clsArr) {
        Method a = m13016a(cls.getDeclaredMethods(), str, clsArr);
        if (a != null) {
            a.setAccessible(true);
            return a;
        } else if (cls.getSuperclass() != null) {
            return m13015a((Class<?>) cls.getSuperclass(), str, clsArr);
        } else {
            throw new NoSuchMethodException();
        }
    }

    /* renamed from: a */
    private static Method m13016a(Method[] methodArr, String str, Class<?>[] clsArr) {
        Objects.requireNonNull(str, "Method name must not be null.");
        for (Method method : methodArr) {
            if (method.getName().equals(str) && m13018a((Class<?>[]) method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m13017a(Object obj, String str, Object obj2) {
        try {
            m13022b(obj, str, obj2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call setField '");
            sb.append(str);
            sb.append("' in ");
            sb.append(obj);
            sb.append(", ");
            sb.append(e);
        }
    }

    /* renamed from: a */
    private static boolean m13018a(Class<?>[] clsArr, Class<?>[] clsArr2) {
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
            if (clsArr2[i] != null && !clsArr[i].isAssignableFrom(clsArr2[i])) {
                Map<Class<?>, Class<?>> map = f7654a;
                if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Class<?>[] m13019a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C4555a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C4555a)) {
                clsArr[i] = aVar == null ? null : aVar.getClass();
            } else {
                clsArr[i] = aVar.f7655a;
            }
        }
        return clsArr;
    }

    /* renamed from: a */
    private static Object[] m13020a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C4555a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C4555a)) {
                objArr2[i] = aVar;
            } else {
                objArr2[i] = aVar.f7656a;
            }
        }
        return objArr2;
    }

    /* renamed from: b */
    public static <T> T m13021b(Object obj, String str, Object... objArr) {
        return m13015a(obj.getClass(), str, (Class<?>[]) m13019a(objArr)).invoke(obj, m13019a(objArr));
    }

    /* renamed from: b */
    public static void m13022b(Object obj, String str, Object obj2) {
        Class cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                continue;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
                continue;
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        field.set(obj, obj2);
    }
}
