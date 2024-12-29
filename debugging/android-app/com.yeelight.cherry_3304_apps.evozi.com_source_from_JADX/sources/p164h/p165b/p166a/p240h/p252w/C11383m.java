package p164h.p165b.p166a.p240h.p252w;

/* renamed from: h.b.a.h.w.m */
public class C11383m extends C11356a<Double> {
    /* renamed from: b */
    public boolean mo36042b(Class cls) {
        return cls == Double.TYPE || Double.class.isAssignableFrom(cls);
    }

    /* renamed from: i */
    public Double mo36049f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException e) {
            throw new C11391r("Can't convert string to number: " + str, e);
        }
    }
}
