package org.fourthline.cling.model.types;

/* renamed from: org.fourthline.cling.model.types.g0 */
public class C10086g0 extends C10073a<C10084f0> {
    /* renamed from: i */
    public C10084f0 mo40561f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return new C10084f0(str);
        } catch (NumberFormatException e) {
            throw new InvalidValueException("Can't convert string to number or not in range: " + str, e);
        }
    }
}
