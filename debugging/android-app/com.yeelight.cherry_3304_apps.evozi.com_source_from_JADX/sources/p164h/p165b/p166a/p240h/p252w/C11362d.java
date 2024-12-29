package p164h.p165b.p166a.p240h.p252w;

import com.miot.service.manager.timer.TimerCodec;
import java.util.Locale;

/* renamed from: h.b.a.h.w.d */
public class C11362d extends C11356a<Boolean> {
    /* renamed from: b */
    public boolean mo36042b(Class cls) {
        return cls == Boolean.TYPE || Boolean.class.isAssignableFrom(cls);
    }

    /* renamed from: i */
    public String mo36041a(Boolean bool) {
        return bool == null ? "" : bool.booleanValue() ? TimerCodec.ENABLE : TimerCodec.DISENABLE;
    }

    /* renamed from: j */
    public Boolean mo36049f(String str) {
        if (str.equals("")) {
            return null;
        }
        if (str.equals(TimerCodec.ENABLE) || str.toUpperCase(Locale.ROOT).equals("YES") || str.toUpperCase(Locale.ROOT).equals("TRUE")) {
            return Boolean.TRUE;
        }
        if (str.equals(TimerCodec.DISENABLE) || str.toUpperCase(Locale.ROOT).equals("NO") || str.toUpperCase(Locale.ROOT).equals("FALSE")) {
            return Boolean.FALSE;
        }
        throw new C11391r("Invalid boolean value string: " + str);
    }
}
