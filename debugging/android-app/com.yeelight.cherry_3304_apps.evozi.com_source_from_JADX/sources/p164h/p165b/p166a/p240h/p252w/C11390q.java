package p164h.p165b.p166a.p240h.p252w;

import androidx.appcompat.widget.ActivityChooserView;
import com.miot.service.connection.wifi.step.SmartConfigStep;

/* renamed from: h.b.a.h.w.q */
public class C11390q extends C11356a<Integer> {

    /* renamed from: b */
    private int f22644b;

    public C11390q(int i) {
        this.f22644b = i;
    }

    /* renamed from: b */
    public boolean mo36042b(Class cls) {
        return cls == Integer.TYPE || Integer.class.isAssignableFrom(cls);
    }

    /* renamed from: i */
    public int mo36115i() {
        return this.f22644b;
    }

    /* renamed from: j */
    public int mo36116j() {
        int i = mo36115i();
        if (i == 1) {
            return SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT;
        }
        if (i == 2) {
            return 32767;
        }
        if (i == 4) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        throw new IllegalArgumentException("Invalid integer byte size: " + mo36115i());
    }

    /* renamed from: k */
    public int mo36117k() {
        int i = mo36115i();
        if (i == 1) {
            return -128;
        }
        if (i == 2) {
            return -32768;
        }
        if (i == 4) {
            return Integer.MIN_VALUE;
        }
        throw new IllegalArgumentException("Invalid integer byte size: " + mo36115i());
    }

    /* renamed from: l */
    public boolean mo36043c(Integer num) {
        return num == null || (num.intValue() >= mo36117k() && num.intValue() <= mo36116j());
    }

    /* renamed from: m */
    public Integer mo36049f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(str.trim()));
            if (mo36043c(valueOf)) {
                return valueOf;
            }
            throw new C11391r("Not a " + mo36115i() + " byte(s) integer: " + str);
        } catch (NumberFormatException e) {
            if (str.equals("NOT_IMPLEMENTED")) {
                return Integer.valueOf(mo36116j());
            }
            throw new C11391r("Can't convert string to number: " + str, e);
        }
    }
}
