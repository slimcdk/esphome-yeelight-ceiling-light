package p156f.p157g0.p162k;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: f.g0.k.e */
class C10820e<T> {

    /* renamed from: a */
    private final Class<?> f20863a;

    /* renamed from: b */
    private final String f20864b;

    /* renamed from: c */
    private final Class[] f20865c;

    C10820e(Class<?> cls, String str, Class... clsArr) {
        this.f20863a = cls;
        this.f20864b = str;
        this.f20865c = clsArr;
    }

    /* renamed from: a */
    private Method m26936a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f20864b;
        if (str == null) {
            return null;
        }
        Method b = m26937b(cls, str, this.f20865c);
        if (b == null || (cls2 = this.f20863a) == null || cls2.isAssignableFrom(b.getReturnType())) {
            return b;
        }
        return null;
    }

    /* renamed from: b */
    private static Method m26937b(Class<?> cls, String str, Class[] clsArr) {
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
    public Object mo34139c(T t, Object... objArr) {
        Method a = m26936a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f20864b + " not supported for object " + t);
        }
    }

    /* renamed from: d */
    public Object mo34140d(T t, Object... objArr) {
        Method a = m26936a(t.getClass());
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
    public Object mo34141e(T t, Object... objArr) {
        try {
            return mo34140d(t, objArr);
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
    public Object mo34142f(T t, Object... objArr) {
        try {
            return mo34139c(t, objArr);
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
    public boolean mo34143g(T t) {
        return m26936a(t.getClass()) != null;
    }
}
