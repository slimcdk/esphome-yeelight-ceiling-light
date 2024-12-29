package org.fourthline.cling.model.types;

/* renamed from: org.fourthline.cling.model.types.l */
public class C10091l extends C10073a<Float> {
    /* renamed from: b */
    public boolean mo40557b(Class cls) {
        return cls == Float.TYPE || Float.class.isAssignableFrom(cls);
    }

    /* renamed from: i */
    public Float mo40561f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str.trim()));
        } catch (NumberFormatException e) {
            throw new InvalidValueException("Can't convert string to number: " + str, e);
        }
    }
}
