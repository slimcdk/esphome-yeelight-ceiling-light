package com.google.gson.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.internal.h */
public final class C2518h {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f4260a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f4261b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m6795a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m6795a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m6795a(hashMap, hashMap2, Character.TYPE, Character.class);
        m6795a(hashMap, hashMap2, Double.TYPE, Double.class);
        m6795a(hashMap, hashMap2, Float.TYPE, Float.class);
        m6795a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m6795a(hashMap, hashMap2, Long.TYPE, Long.class);
        m6795a(hashMap, hashMap2, Short.TYPE, Short.class);
        m6795a(hashMap, hashMap2, Void.TYPE, Void.class);
        f4260a = Collections.unmodifiableMap(hashMap);
        f4261b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m6795a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: b */
    public static boolean m6796b(Type type) {
        return f4260a.containsKey(type);
    }

    /* renamed from: c */
    public static <T> Class<T> m6797c(Class<T> cls) {
        Class<T> cls2 = f4260a.get(C2496a.m6750b(cls));
        return cls2 == null ? cls : cls2;
    }
}
