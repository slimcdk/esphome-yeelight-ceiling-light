package p226w6;

import java.lang.reflect.Method;
import org.seamless.util.C10247d;

/* renamed from: w6.b */
public class C11956b extends C11957c {

    /* renamed from: a */
    private Method f21843a;

    public C11956b(Method method) {
        this.f21843a = method;
    }

    /* renamed from: a */
    public Class<?> mo42502a() {
        return mo42506d().getReturnType();
    }

    /* renamed from: b */
    public Object mo42503b(Object obj) {
        return C10247d.m25773k(mo42506d(), obj, new Object[0]);
    }

    /* renamed from: d */
    public Method mo42506d() {
        return this.f21843a;
    }

    public String toString() {
        return super.toString() + " Method: " + mo42506d();
    }
}
