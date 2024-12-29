package org.fourthline.cling.model.message.header;

import com.miot.service.manager.timer.TimerCodec;
import org.fourthline.cling.model.types.C10076b0;

/* renamed from: org.fourthline.cling.model.message.header.h */
public class C10047h extends UpnpHeader<C10076b0> {
    public C10047h() {
    }

    public C10047h(long j) {
        mo40451e(new C10076b0(j));
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((C10076b0) mo40449b()).toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        if (!TimerCodec.DISENABLE.equals(str)) {
            while (str.startsWith(TimerCodec.DISENABLE)) {
                str = str.substring(1);
            }
        }
        try {
            mo40451e(new C10076b0(str));
        } catch (NumberFormatException e) {
            throw new InvalidHeaderException("Invalid event sequence, " + e.getMessage());
        }
    }
}
