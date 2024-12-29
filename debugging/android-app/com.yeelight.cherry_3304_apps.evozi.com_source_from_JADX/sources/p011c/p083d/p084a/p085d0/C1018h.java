package p011c.p083d.p084a.p085d0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c.d.a.d0.h */
class C1018h<T> {

    /* renamed from: a */
    private final Class<?> f1324a;

    /* renamed from: b */
    private final String f1325b;

    /* renamed from: c */
    private final Class[] f1326c;

    public C1018h(Class<?> cls, String str, Class... clsArr) {
        this.f1324a = cls;
        this.f1325b = str;
        this.f1326c = clsArr;
    }

    /* renamed from: a */
    private Method m2059a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f1325b;
        if (str == null) {
            return null;
        }
        Method b = m2060b(cls, str, this.f1326c);
        if (b == null || (cls2 = this.f1324a) == null || cls2.isAssignableFrom(b.getReturnType())) {
            return b;
        }
        return null;
    }

    /* renamed from: b */
    private static Method m2060b(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public Object mo9468c(T t, Object... objArr) {
        Method a = m2059a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f1325b + " not supported for object " + t);
        }
    }

    /* renamed from: d */
    public Object mo9469d(T t, Object... objArr) {
        Method a = m2059a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public Object mo9470e(T t, Object... objArr) {
        try {
            return mo9469d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: f */
    public Object mo9471f(T t, Object... objArr) {
        try {
            return mo9468c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: g */
    public boolean mo9472g(T t) {
        return m2059a(t.getClass()) != null;
    }
}
