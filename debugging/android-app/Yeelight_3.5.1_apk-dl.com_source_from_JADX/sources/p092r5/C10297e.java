package p092r5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: r5.e */
class C10297e<T> {

    /* renamed from: a */
    private final Class<?> f19379a;

    /* renamed from: b */
    private final String f19380b;

    /* renamed from: c */
    private final Class[] f19381c;

    C10297e(Class<?> cls, String str, Class... clsArr) {
        this.f19379a = cls;
        this.f19380b = str;
        this.f19381c = clsArr;
    }

    /* renamed from: a */
    private Method m25970a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f19380b;
        if (str == null) {
            return null;
        }
        Method b = m25971b(cls, str, this.f19381c);
        if (b == null || (cls2 = this.f19379a) == null || cls2.isAssignableFrom(b.getReturnType())) {
            return b;
        }
        return null;
    }

    /* renamed from: b */
    private static Method m25971b(Class<?> cls, String str, Class[] clsArr) {
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
    public Object mo41833c(T t, Object... objArr) {
        Method a = m25970a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f19380b + " not supported for object " + t);
        }
    }

    /* renamed from: d */
    public Object mo41834d(T t, Object... objArr) {
        Method a = m25970a(t.getClass());
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
    public Object mo41835e(T t, Object... objArr) {
        try {
            return mo41834d(t, objArr);
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
    public Object mo41836f(T t, Object... objArr) {
        try {
            return mo41833c(t, objArr);
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
    public boolean mo41837g(T t) {
        return m25970a(t.getClass()) != null;
    }
}
