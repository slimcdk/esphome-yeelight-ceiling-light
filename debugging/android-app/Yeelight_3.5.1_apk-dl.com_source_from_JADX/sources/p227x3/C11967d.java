package p227x3;

import com.miot.service.manager.timer.TimerCodec;

/* renamed from: x3.d */
public class C11967d extends C11968e {
    public C11967d(String str, Object[] objArr) {
        this.f21861a = str;
        this.f21862b = objArr;
    }

    /* renamed from: a */
    public String mo42537a() {
        String str = this.f21861a;
        for (Object obj : this.f21862b) {
            str = str + obj.toString();
        }
        while (str.length() < 36) {
            str = str + TimerCodec.DISENABLE;
        }
        return str;
    }
}
