package p164h.p165b.p166a.p240h.p243r.p247n;

import com.miot.service.manager.timer.TimerCodec;
import p164h.p165b.p166a.p240h.p252w.C11369g0;

/* renamed from: h.b.a.h.r.n.h */
public class C11301h extends C11296f0<C11369g0> {
    public C11301h() {
    }

    public C11301h(long j) {
        mo35846e(new C11369g0(j));
    }

    /* renamed from: a */
    public String mo35841a() {
        return ((C11369g0) mo35845b()).toString();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        if (!TimerCodec.DISENABLE.equals(str)) {
            while (str.startsWith(TimerCodec.DISENABLE)) {
                str = str.substring(1);
            }
        }
        try {
            mo35846e(new C11369g0(str));
        } catch (NumberFormatException e) {
            throw new C11304k("Invalid event sequence, " + e.getMessage());
        }
    }
}
