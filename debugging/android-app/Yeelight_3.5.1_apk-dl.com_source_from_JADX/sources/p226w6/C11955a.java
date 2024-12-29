package p226w6;

import java.lang.reflect.Field;
import org.seamless.util.C10247d;

/* renamed from: w6.a */
public class C11955a extends C11957c {

    /* renamed from: a */
    protected Field f21842a;

    public C11955a(Field field) {
        this.f21842a = field;
    }

    /* renamed from: a */
    public Class<?> mo42502a() {
        return mo42504d().getType();
    }

    /* renamed from: b */
    public Object mo42503b(Object obj) {
        return C10247d.m25764b(this.f21842a, obj);
    }

    /* renamed from: d */
    public Field mo42504d() {
        return this.f21842a;
    }

    public String toString() {
        return super.toString() + " Field: " + mo42504d();
    }
}
