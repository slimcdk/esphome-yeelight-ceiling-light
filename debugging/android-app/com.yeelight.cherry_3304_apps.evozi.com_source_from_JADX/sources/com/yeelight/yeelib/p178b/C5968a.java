package com.yeelight.yeelib.p178b;

import com.yeelight.yeelib.p150c.p180k.C6106b;
import com.yeelight.yeelib.p178b.C5969b;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.b.a */
public class C5968a extends C5969b {

    /* renamed from: c */
    protected C6106b f12648c;

    public C5968a(C6106b bVar) {
        this.f12648c = bVar;
    }

    /* renamed from: a */
    public void mo27468a(int i) {
        C5969b.C5970a aVar;
        switch (i) {
            case 1:
                aVar = C5969b.C5970a.AUTH_IP;
                break;
            case 2:
            case 4:
                aVar = C5969b.C5970a.AUTH_SUC;
                break;
            case 3:
            case 5:
            case 6:
            case 7:
                aVar = C5969b.C5970a.AUTH_FAIL;
                break;
            default:
                C4308b.m12139r("BleAuthority", "invalid auth notify: " + i);
                return;
        }
        mo27472e(aVar);
    }

    /* renamed from: d */
    public boolean mo27469d() {
        if (this.f12649a != C5969b.C5970a.AUTH_UNKNOWN) {
            return true;
        }
        this.f12648c.mo27939A();
        return true;
    }
}
