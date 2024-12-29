package p232y3;

import android.graphics.Color;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import java.util.ArrayList;
import p051j4.C9188d;
import p232y3.C12043g;

/* renamed from: y3.f */
public class C12042f extends DeviceStatusBase {
    public C12042f(String str) {
        super(str);
        mo42683Z0();
    }

    /* renamed from: Z0 */
    public void mo42683Z0() {
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
}
