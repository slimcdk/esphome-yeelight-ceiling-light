package p164h.p165b.p166a.p240h.p252w;

/* renamed from: h.b.a.h.w.l0 */
public class C11382l0 extends C11356a<C11380k0> {
    /* renamed from: i */
    public C11380k0 mo36049f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return new C11380k0(str);
        } catch (NumberFormatException e) {
            throw new C11391r("Can't convert string to number or not in range: " + str, e);
        }
    }
}
