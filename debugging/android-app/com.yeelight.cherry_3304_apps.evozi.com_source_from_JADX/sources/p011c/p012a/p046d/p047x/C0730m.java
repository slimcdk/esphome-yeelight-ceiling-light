package p011c.p012a.p046d.p047x;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: c.a.d.x.m */
public abstract class C0730m {

    /* renamed from: c.a.d.x.m$a */
    static class C0731a extends C0730m {

        /* renamed from: a */
        final /* synthetic */ Method f482a;

        /* renamed from: b */
        final /* synthetic */ Object f483b;

        C0731a(Method method, Object obj) {
            this.f482a = method;
            this.f483b = obj;
        }

        /* renamed from: c */
        public <T> T mo8848c(Class<T> cls) {
            C0730m.m787a(cls);
            return this.f482a.invoke(this.f483b, new Object[]{cls});
        }
    }

    /* renamed from: c.a.d.x.m$b */
    static class C0732b extends C0730m {

        /* renamed from: a */
        final /* synthetic */ Method f484a;

        /* renamed from: b */
        final /* synthetic */ int f485b;

        C0732b(Method method, int i) {
            this.f484a = method;
            this.f485b = i;
        }

        /* renamed from: c */
        public <T> T mo8848c(Class<T> cls) {
            C0730m.m787a(cls);
            return this.f484a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f485b)});
        }
    }

    /* renamed from: c.a.d.x.m$c */
    static class C0733c extends C0730m {

        /* renamed from: a */
        final /* synthetic */ Method f486a;

        C0733c(Method method) {
            this.f486a = method;
        }

        /* renamed from: c */
        public <T> T mo8848c(Class<T> cls) {
            C0730m.m787a(cls);
            return this.f486a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: c.a.d.x.m$d */
    static class C0734d extends C0730m {
        C0734d() {
        }

        /* renamed from: c */
        public <T> T mo8848c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    static void m787a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: b */
    public static C0730m m788b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C0731a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C0732b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C0733c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C0734d();
                }
            }
        }
    }

    /* renamed from: c */
    public abstract <T> T mo8848c(Class<T> cls);
}
