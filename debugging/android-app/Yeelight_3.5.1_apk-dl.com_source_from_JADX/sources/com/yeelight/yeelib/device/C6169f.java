package com.yeelight.yeelib.device;

import android.content.Intent;
import android.view.View;
import com.miot.common.device.Device;
import com.yeelight.cherry.p141ui.activity.RoomMainActivity;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import java.util.Iterator;
import p145d4.C8937a;
import p232y3.C12042f;

/* renamed from: com.yeelight.yeelib.device.f */
public class C6169f extends C6119c {

    /* renamed from: C */
    private C8937a f12700C;

    public C6169f(C8937a aVar) {
        super(aVar.mo36722n(), "yeelink.light.room", new C12042f(aVar.mo36723o()));
        this.f12700C = aVar;
        this.f12561x = aVar.mo36718i();
        mo23199O0(Device.Ownership.MINE);
        StringBuilder sb = new StringBuilder();
        sb.append("RoomDevice init : ");
        sb.append(aVar.toString());
        mo23178B0(this);
        mo31761S1();
        mo23187H0(aVar.mo36722n());
        mo23228j0();
        mo23221d0().mo31600l0((long) mo31750F1());
        mo31767Y1();
    }

    /* renamed from: D */
    public int mo23181D() {
        C8937a aVar = this.f12700C;
        if (aVar == null) {
            return 15;
        }
        return aVar.mo36717h();
    }

    /* renamed from: G0 */
    public void mo23186G0(int i) {
        C8937a aVar = this.f12700C;
        if (aVar != null) {
            aVar.mo36733x(i);
        }
    }

    /* renamed from: I1 */
    public int mo31751I1() {
        return this.f12561x.size();
    }

    /* renamed from: N0 */
    public void mo23198N0(String str) {
        super.mo23198N0(str);
        this.f12700C.mo36709A(str);
    }

    /* renamed from: U */
    public String mo23210U() {
        return this.f12700C.mo36723o();
    }

    /* renamed from: Z1 */
    public void mo31872Z1(C3012e eVar) {
        mo31753K1().add(eVar);
        eVar.mo23182D0(this);
        eVar.mo23171z0(this);
    }

    /* renamed from: a2 */
    public int mo31873a2() {
        return this.f12700C.mo36720l();
    }

    /* renamed from: b2 */
    public int mo31874b2() {
        return this.f12700C.mo36721m();
    }

    /* renamed from: c2 */
    public C8937a mo31875c2() {
        return this.f12700C;
    }

    /* renamed from: d2 */
    public int mo31876d2() {
        return this.f12700C.mo36726r();
    }

    /* renamed from: e2 */
    public void mo31877e2(C3012e eVar) {
        mo31753K1().remove(eVar);
        eVar.mo23215X0(this);
        eVar.mo23133V0(this);
    }

    /* renamed from: f2 */
    public void mo31878f2(C8937a aVar) {
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3012e next = it.next();
            next.mo23133V0(this);
            next.mo23215X0(this);
            next.mo23213W0(this);
        }
        this.f12700C = aVar;
        this.f12561x = aVar.mo36718i();
        mo23178B0(this);
        mo31761S1();
        mo31767Y1();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
        try {
            int i = RoomMainActivity.f11243d;
            Intent intent = new Intent(view.getContext(), RoomMainActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", mo23185G());
            view.getContext().startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
