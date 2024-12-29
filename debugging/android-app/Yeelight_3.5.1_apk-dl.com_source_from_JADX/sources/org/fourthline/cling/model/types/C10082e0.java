package org.fourthline.cling.model.types;

/* renamed from: org.fourthline.cling.model.types.e0 */
public class C10082e0 extends C10073a<C10080d0> {
    /* renamed from: i */
    public C10080d0 mo40561f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return new C10080d0(str);
        } catch (NumberFormatException e) {
            throw new InvalidValueException("Can't convert string to number or not in range: " + str, e);
        }
    }
}
