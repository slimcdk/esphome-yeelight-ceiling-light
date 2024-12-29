package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.google.gson.internal.j */
public abstract class C2522j {

    /* renamed from: com.google.gson.internal.j$a */
    static class C2523a extends C2522j {

        /* renamed from: a */
        final /* synthetic */ Method f4265a;

        /* renamed from: b */
        final /* synthetic */ Object f4266b;

        C2523a(Method method, Object obj) {
            this.f4265a = method;
            this.f4266b = obj;
        }

        /* renamed from: c */
        public <T> T mo19381c(Class<T> cls) {
            C2522j.m6801a(cls);
            return this.f4265a.invoke(this.f4266b, new Object[]{cls});
        }
    }

    /* renamed from: com.google.gson.internal.j$b */
    static class C2524b extends C2522j {

        /* renamed from: a */
        final /* synthetic */ Method f4267a;

        /* renamed from: b */
        final /* synthetic */ int f4268b;

        C2524b(Method method, int i) {
            this.f4267a = method;
            this.f4268b = i;
        }

        /* renamed from: c */
        public <T> T mo19381c(Class<T> cls) {
            C2522j.m6801a(cls);
            return this.f4267a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f4268b)});
        }
    }

    /* renamed from: com.google.gson.internal.j$c */
    static class C2525c extends C2522j {

        /* renamed from: a */
        final /* synthetic */ Method f4269a;

        C2525c(Method method) {
            this.f4269a = method;
        }

        /* renamed from: c */
        public <T> T mo19381c(Class<T> cls) {
            C2522j.m6801a(cls);
            return this.f4269a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: com.google.gson.internal.j$d */
    static class C2526d extends C2522j {
        C2526d() {
        }

        /* renamed from: c */
        public <T> T mo19381c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    static void m6801a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: b */
    public static C2522j m6802b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C2523a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C2524b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C2525c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C2526d();
                }
            }
        }
    }

    /* renamed from: c */
    public abstract <T> T mo19381c(Class<T> cls);
}
