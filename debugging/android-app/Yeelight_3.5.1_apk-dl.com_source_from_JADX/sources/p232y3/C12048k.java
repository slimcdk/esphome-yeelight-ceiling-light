package p232y3;

import android.graphics.Color;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import java.util.ArrayList;
import p051j4.C9188d;
import p232y3.C12043g;

/* renamed from: y3.k */
public class C12048k extends DeviceStatusBase {

    /* renamed from: K */
    private DeviceStatusBase.DeviceMode f22114K;

    /* renamed from: L */
    private String f22115L;

    public C12048k(String str) {
        super(str);
        DeviceStatusBase.DeviceMode deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE;
        this.f22114K = deviceMode;
        mo31531C0(deviceMode);
        mo42735a1();
    }

    /* renamed from: C0 */
    public void mo31531C0(DeviceStatusBase.DeviceMode deviceMode) {
        DeviceStatusBase.DeviceMode deviceMode2 = DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW;
        if (deviceMode == deviceMode2 && this.f12466e.mo42696j() != deviceMode2) {
            this.f22114K = this.f12466e.mo42696j();
        }
        super.mo31531C0(deviceMode);
    }

    /* renamed from: Z0 */
    public String mo42734Z0() {
        return this.f22115L;
    }

    /* renamed from: a1 */
    public void mo42735a1() {
        ArrayList arrayList = new ArrayList();
        float[] fArr = {10.0f, 1.0f, C9188d.m22130a(this.f12466e.mo42687a())};
        arrayList.add(new C12043g.C12044a(Color.HSVToColor(fArr), 2000));
        fArr[0] = 70.0f;
        arrayList.add(new C12043g.C12044a(Color.HSVToColor(fArr), 2000));
        fArr[0] = 160.0f;
        arrayList.add(new C12043g.C12044a(Color.HSVToColor(fArr), 2000));
        fArr[0] = 270.0f;
        arrayList.add(new C12043g.C12044a(Color.HSVToColor(fArr), 2000));
        mo31604n0(arrayList);
    }

    /* renamed from: b1 */
    public void mo42736b1() {
        mo31531C0(this.f22114K);
    }

    /* renamed from: c1 */
    public void mo42737c1(String str) {
        this.f22115L = str;
    }
}
