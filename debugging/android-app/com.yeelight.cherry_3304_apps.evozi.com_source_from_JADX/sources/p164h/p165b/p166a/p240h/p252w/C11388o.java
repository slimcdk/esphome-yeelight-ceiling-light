package p164h.p165b.p166a.p240h.p252w;

/* renamed from: h.b.a.h.w.o */
public class C11388o extends C11356a<Float> {
    /* renamed from: b */
    public boolean mo36042b(Class cls) {
        return cls == Float.TYPE || Float.class.isAssignableFrom(cls);
    }

    /* renamed from: i */
    public Float mo36049f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str.trim()));
        } catch (NumberFormatException e) {
            throw new C11391r("Can't convert string to number: " + str, e);
        }
    }
}
