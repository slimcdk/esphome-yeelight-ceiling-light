package org.fourthline.cling.model.types;

/* renamed from: org.fourthline.cling.model.types.k */
public class C10090k extends C10073a<Double> {
    /* renamed from: b */
    public boolean mo40557b(Class cls) {
        return cls == Double.TYPE || Double.class.isAssignableFrom(cls);
    }

    /* renamed from: i */
    public Double mo40561f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException e) {
            throw new InvalidValueException("Can't convert string to number: " + str, e);
        }
    }
}
