package org.fourthline.cling.model.types;

import com.miot.service.manager.timer.TimerCodec;
import java.util.Locale;

/* renamed from: org.fourthline.cling.model.types.d */
public class C10079d extends C10073a<Boolean> {
    /* renamed from: b */
    public boolean mo40557b(Class cls) {
        return cls == Boolean.TYPE || Boolean.class.isAssignableFrom(cls);
    }

    /* renamed from: i */
    public String mo40556a(Boolean bool) {
        return bool == null ? "" : bool.booleanValue() ? TimerCodec.ENABLE : TimerCodec.DISENABLE;
    }

    /* renamed from: j */
    public Boolean mo40561f(String str) {
        if (str.equals("")) {
            return null;
        }
        if (!str.equals(TimerCodec.ENABLE)) {
            Locale locale = Locale.ROOT;
            if (!str.toUpperCase(locale).equals("YES") && !str.toUpperCase(locale).equals("TRUE")) {
                if (str.equals(TimerCodec.DISENABLE) || str.toUpperCase(locale).equals("NO") || str.toUpperCase(locale).equals("FALSE")) {
                    return Boolean.FALSE;
                }
                throw new InvalidValueException("Invalid boolean value string: " + str);
            }
        }
        return Boolean.TRUE;
    }
}
