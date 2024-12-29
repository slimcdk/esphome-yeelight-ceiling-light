package org.fourthline.cling.model.types;

/* renamed from: org.fourthline.cling.model.types.c0 */
public class C10078c0 extends C10073a<C10076b0> {
    /* renamed from: i */
    public C10076b0 mo40561f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return new C10076b0(str);
        } catch (NumberFormatException e) {
            throw new InvalidValueException("Can't convert string to number or not in range: " + str, e);
        }
    }
}
