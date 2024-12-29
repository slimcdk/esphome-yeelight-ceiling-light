package org.fourthline.cling.model.types;

/* renamed from: org.fourthline.cling.model.types.f */
public class C10083f extends C10073a<Character> {
    /* renamed from: b */
    public boolean mo40557b(Class cls) {
        return cls == Character.TYPE || Character.class.isAssignableFrom(cls);
    }

    /* renamed from: i */
    public Character mo40561f(String str) {
        if (str.equals("")) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }
}
