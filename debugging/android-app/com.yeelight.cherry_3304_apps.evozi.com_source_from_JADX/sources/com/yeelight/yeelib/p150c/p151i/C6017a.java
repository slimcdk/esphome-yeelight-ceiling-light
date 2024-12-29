package com.yeelight.yeelib.p150c.p151i;

import com.miot.common.device.Device;
import com.yeelight.yeelib.device.models.C7628j;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9830b;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p153g.C9856y;

/* renamed from: com.yeelight.yeelib.c.i.a */
public abstract class C6017a extends C6029f {

    /* renamed from: z */
    private C6018b f12735z = new C6018b();

    public C6017a(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
    }

    /* renamed from: i2 */
    public abstract boolean mo27589i2();

    /* renamed from: j2 */
    public C9849r mo27590j2() {
        int i;
        int i2;
        int a = mo27591k2().mo27596a();
        boolean g = mo27591k2().mo27602g();
        C9827a d = mo27591k2().mo27599d();
        if (!g || d == null) {
            int i3 = 1;
            if (mo27591k2().mo27600e() == C6024e.C6028d.DEVICE_MODE_COLOR || mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COLOR_HSV) {
                i = mo27591k2().mo27597b();
                i3 = 2;
                i2 = -1;
            } else {
                if ((mo27591k2().mo27600e() == C6024e.C6028d.DEVICE_MODE_SUNSHINE || mo27591k2().mo27600e() == C6024e.C6028d.DEVICE_MODE_COMPUTER || mo27591k2().mo27600e() == C6024e.C6028d.DEVICE_MODE_READ) && this.f7245h.mo29076b(C7628j.C7630b.CT_TAB)) {
                    i2 = mo27591k2().mo27598c();
                    i3 = 3;
                } else {
                    i2 = -1;
                }
                i = -1;
            }
            return new C9849r("", i3, a, i2, i, (C9856y.C9857a[]) null);
        }
        C9830b bVar = new C9830b("", -1, d.mo31720d());
        bVar.mo31860I(d);
        return bVar;
    }

    /* renamed from: k2 */
    public C6018b mo27591k2() {
        return this.f12735z;
    }

    /* renamed from: l2 */
    public abstract boolean mo27592l2();

    /* renamed from: m2 */
    public abstract boolean mo27593m2(int i);

    /* renamed from: n2 */
    public abstract boolean mo27594n2(boolean z);

    /* renamed from: o2 */
    public abstract boolean mo27595o2(C9856y yVar);
}
