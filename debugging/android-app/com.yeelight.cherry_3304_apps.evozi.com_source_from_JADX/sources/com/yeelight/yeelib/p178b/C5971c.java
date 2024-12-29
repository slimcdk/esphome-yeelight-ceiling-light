package com.yeelight.yeelib.p178b;

import com.yeelight.yeelib.p178b.C5969b;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.b.c */
public class C5971c extends C5969b {
    /* renamed from: a */
    public void mo27468a(int i) {
        C5969b.C5970a aVar;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (!(i == 6 || i == 7)) {
                            C4308b.m12139r("WifiAuthority", "invalid auth notify: " + i);
                            mo27470b();
                        }
                    }
                }
                aVar = C5969b.C5970a.AUTH_FAIL;
            }
            aVar = C5969b.C5970a.AUTH_SUC;
        } else {
            aVar = C5969b.C5970a.AUTH_IP;
        }
        this.f12649a = aVar;
        mo27470b();
    }

    /* renamed from: d */
    public boolean mo27469d() {
        this.f12649a = C5969b.C5970a.AUTH_IP;
        mo27470b();
        return true;
    }
}
