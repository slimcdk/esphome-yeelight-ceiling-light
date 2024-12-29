package org.fourthline.cling.model.types;

/* renamed from: org.fourthline.cling.model.types.t */
public class C10099t extends C10073a<Short> {
    /* renamed from: b */
    public boolean mo40557b(Class cls) {
        return cls == Short.TYPE || Short.class.isAssignableFrom(cls);
    }

    /* renamed from: i */
    public Short mo40561f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            Short valueOf = Short.valueOf(Short.parseShort(str.trim()));
            if (mo40558c(valueOf)) {
                return valueOf;
            }
            throw new InvalidValueException("Not a valid short: " + str);
        } catch (NumberFormatException e) {
            throw new InvalidValueException("Can't convert string to number: " + str, e);
        }
    }
}
