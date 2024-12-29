package p164h.p165b.p166a.p240h.p251v;

import java.lang.reflect.Field;
import p164h.p257c.p259b.C11499d;

/* renamed from: h.b.a.h.v.a */
public class C11351a extends C11353c {

    /* renamed from: a */
    protected Field f22532a;

    public C11351a(Field field) {
        this.f22532a = field;
    }

    /* renamed from: a */
    public Class<?> mo36034a() {
        return mo36036d().getType();
    }

    /* renamed from: b */
    public Object mo36035b(Object obj) {
        return C11499d.m30184b(this.f22532a, obj);
    }

    /* renamed from: d */
    public Field mo36036d() {
        return this.f22532a;
    }

    public String toString() {
        return super.toString() + " Field: " + mo36036d();
    }
}
