package com.yeelight.yeelib.device.base;

import com.miot.common.device.Device;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.ProductModelBase;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.models.C8327s;
import p207s3.C10333b;

/* renamed from: com.yeelight.yeelib.device.base.a */
public abstract class C6091a extends C10333b {

    /* renamed from: z */
    private C6092b f12495z = new C6092b();

    public C6091a(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
    }

    /* renamed from: i2 */
    public abstract boolean mo31655i2();

    /* renamed from: j2 */
    public C8321m mo31656j2() {
        int i;
        int i2;
        int a = mo31657k2().mo31662a();
        boolean g = mo31657k2().mo31668g();
        C8308a d = mo31657k2().mo31665d();
        if (!g || d == null) {
            int i3 = 1;
            if (mo31657k2().mo31666e() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR || mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV) {
                i = mo31657k2().mo31663b();
                i3 = 2;
                i2 = -1;
            } else {
                if ((mo31657k2().mo31666e() == DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE || mo31657k2().mo31666e() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COMPUTER || mo31657k2().mo31666e() == DeviceStatusBase.DeviceMode.DEVICE_MODE_READ) && this.f4743h.mo31881b(ProductModelBase.CapabilityType.CT_TAB)) {
                    i2 = mo31657k2().mo31664c();
                    i3 = 3;
                } else {
                    i2 = -1;
                }
                i = -1;
            }
            return new C8321m("", i3, a, i2, i, (C8327s.C8328a[]) null);
        }
        C8309b bVar = new C8309b("", -1, d.mo35335d());
        bVar.mo35425J(d);
        return bVar;
    }

    /* renamed from: k2 */
    public C6092b mo31657k2() {
        return this.f12495z;
    }

    /* renamed from: l2 */
    public abstract boolean mo31658l2();

    /* renamed from: m2 */
    public abstract boolean mo31659m2(int i);

    /* renamed from: n2 */
    public abstract boolean mo31660n2(boolean z);

    /* renamed from: o2 */
    public abstract boolean mo31661o2(C8327s sVar);
}
