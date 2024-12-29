package org.fourthline.cling.model.types;

import androidx.appcompat.widget.ActivityChooserView;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import javax.jmdns.impl.constants.DNSRecordClass;

/* renamed from: org.fourthline.cling.model.types.n */
public class C10093n extends C10073a<Integer> {

    /* renamed from: b */
    private int f18618b;

    public C10093n(int i) {
        this.f18618b = i;
    }

    /* renamed from: b */
    public boolean mo40557b(Class cls) {
        return cls == Integer.TYPE || Integer.class.isAssignableFrom(cls);
    }

    /* renamed from: i */
    public int mo40622i() {
        return this.f18618b;
    }

    /* renamed from: j */
    public int mo40623j() {
        int i = mo40622i();
        if (i == 1) {
            return SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT;
        }
        if (i == 2) {
            return DNSRecordClass.CLASS_MASK;
        }
        if (i == 4) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        throw new IllegalArgumentException("Invalid integer byte size: " + mo40622i());
    }

    /* renamed from: k */
    public int mo40624k() {
        int i = mo40622i();
        if (i == 1) {
            return -128;
        }
        if (i == 2) {
            return -32768;
        }
        if (i == 4) {
            return Integer.MIN_VALUE;
        }
        throw new IllegalArgumentException("Invalid integer byte size: " + mo40622i());
    }

    /* renamed from: l */
    public boolean mo40558c(Integer num) {
        return num == null || (num.intValue() >= mo40624k() && num.intValue() <= mo40623j());
    }

    /* renamed from: m */
    public Integer mo40561f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(str.trim()));
            if (mo40558c(valueOf)) {
                return valueOf;
            }
            throw new InvalidValueException("Not a " + mo40622i() + " byte(s) integer: " + str);
        } catch (NumberFormatException e) {
            if (str.equals("NOT_IMPLEMENTED")) {
                return Integer.valueOf(mo40623j());
            }
            throw new InvalidValueException("Can't convert string to number: " + str, e);
        }
    }
}
