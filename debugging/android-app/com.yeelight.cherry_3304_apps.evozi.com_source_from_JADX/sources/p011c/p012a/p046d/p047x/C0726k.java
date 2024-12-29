package p011c.p012a.p046d.p047x;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.a.d.x.k */
public final class C0726k {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f478a;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m781a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m781a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m781a(hashMap, hashMap2, Character.TYPE, Character.class);
        m781a(hashMap, hashMap2, Double.TYPE, Double.class);
        m781a(hashMap, hashMap2, Float.TYPE, Float.class);
        m781a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m781a(hashMap, hashMap2, Long.TYPE, Long.class);
        m781a(hashMap, hashMap2, Short.TYPE, Short.class);
        m781a(hashMap, hashMap2, Void.TYPE, Void.class);
        f478a = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m781a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: b */
    public static boolean m782b(Type type) {
        return f478a.containsKey(type);
    }

    /* renamed from: c */
    public static <T> Class<T> m783c(Class<T> cls) {
        Map<Class<?>, Class<?>> map = f478a;
        C0691a.m700b(cls);
        Class<T> cls2 = map.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
