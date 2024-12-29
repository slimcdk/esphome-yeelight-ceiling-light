package p164h.p165b.p166a.p240h.p252w;

/* renamed from: h.b.a.h.w.y */
public class C11398y extends C11356a<Short> {
    /* renamed from: b */
    public boolean mo36042b(Class cls) {
        return cls == Short.TYPE || Short.class.isAssignableFrom(cls);
    }

    /* renamed from: i */
    public Short mo36049f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            Short valueOf = Short.valueOf(Short.parseShort(str.trim()));
            if (mo36043c(valueOf)) {
                return valueOf;
            }
            throw new C11391r("Not a valid short: " + str);
        } catch (NumberFormatException e) {
            throw new C11391r("Can't convert string to number: " + str, e);
        }
    }
}
