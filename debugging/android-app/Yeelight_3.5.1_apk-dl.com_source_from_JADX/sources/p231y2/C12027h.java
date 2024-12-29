package p231y2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: y2.h */
class C12027h<T> {

    /* renamed from: a */
    private final Class<?> f22046a;

    /* renamed from: b */
    private final String f22047b;

    /* renamed from: c */
    private final Class[] f22048c;

    public C12027h(Class<?> cls, String str, Class... clsArr) {
        this.f22046a = cls;
        this.f22047b = str;
        this.f22048c = clsArr;
    }

    /* renamed from: a */
    private Method m31010a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f22047b;
        if (str == null) {
            return null;
        }
        Method b = m31011b(cls, str, this.f22048c);
        if (b == null || (cls2 = this.f22046a) == null || cls2.isAssignableFrom(b.getReturnType())) {
            return b;
        }
        return null;
    }

    /* renamed from: b */
    private static Method m31011b(Class<?> cls, String str, Class[] clsArr) {
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
    public Object mo42644c(T t, Object... objArr) {
        Method a = m31010a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f22047b + " not supported for object " + t);
        }
    }

    /* renamed from: d */
    public Object mo42645d(T t, Object... objArr) {
        Method a = m31010a(t.getClass());
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
    public Object mo42646e(T t, Object... objArr) {
        try {
            return mo42645d(t, objArr);
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
    public Object mo42647f(T t, Object... objArr) {
        try {
            return mo42644c(t, objArr);
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
    public boolean mo42648g(T t) {
        return m31010a(t.getClass()) != null;
    }
}
