package p011c.p083d.p084a.p085d0.p087n;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c.d.a.d0.n.p */
public final class C1102p extends Exception {

    /* renamed from: b */
    private static final Method f1618b;

    /* renamed from: a */
    private IOException f1619a;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
            method = null;
        }
        f1618b = method;
    }

    public C1102p(IOException iOException) {
        super(iOException);
        this.f1619a = iOException;
    }

    /* renamed from: b */
    private void m2551b(IOException iOException, IOException iOException2) {
        Method method = f1618b;
        if (method != null) {
            try {
                method.invoke(iOException, new Object[]{iOException2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo9652a(IOException iOException) {
        m2551b(iOException, this.f1619a);
        this.f1619a = iOException;
    }

    /* renamed from: c */
    public IOException mo9653c() {
        return this.f1619a;
    }
}
