package p223w3;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.p022mi.iot.common.instance.Property;
import com.yeelight.cherry.p141ui.activity.PlugControlActivity;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.base.C8251a;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.C8301v;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.p142ui.activity.DeviceOfflinePromptActivity;
import java.util.List;
import java.util.Map;
import p207s3.C10344f;
import p227x3.C11980p;
import p232y3.C12041e;
import p237z3.C12143c;

/* renamed from: w3.d1 */
public class C10797d1 extends C10344f {

    /* renamed from: w3.d1$a */
    class C10798a implements C8251a<Map<Integer, Object>> {
        C10798a() {
        }

        /* renamed from: a */
        public void onSucceed(Map<Integer, Object> map) {
            Boolean bool = (Boolean) map.get(1);
            Integer num = (Integer) map.get(2);
            Integer num2 = (Integer) map.get(3);
            String str = C10797d1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("get properties1 onSucceed: on: ");
            sb.append(bool);
            sb.append("   defaultStatus: ");
            sb.append(num);
            sb.append("  delayOff: ");
            sb.append(num2);
            if (num != null) {
                C10797d1.this.mo23221d0().mo31547K0(num.intValue());
            }
            if (bool != null) {
                C10797d1.this.mo23221d0().mo31551M0(bool.booleanValue());
            }
            if (num2 == null) {
                num2 = 0;
            }
            int intValue = num2.intValue() % 60;
            int intValue2 = num2.intValue() / 60;
            if (intValue > 0) {
                intValue2++;
            }
            Integer valueOf = Integer.valueOf(intValue2);
            if (C10797d1.this.mo23221d0().mo31611r(2) == null) {
                C10797d1.this.mo23221d0().mo31577a(new C12041e(valueOf.intValue(), valueOf.intValue()));
            } else {
                C10797d1.this.mo23221d0().mo31573X0(valueOf.intValue());
            }
        }

        public void onFailed(IotError iotError) {
        }
    }

    /* renamed from: w3.d1$b */
    class C10799b implements CompletedHandler {
        C10799b() {
        }

        public void onFailed(IotError iotError) {
            String str = C10797d1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10797d1.this.f4758v;
            C10797d1.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.d1$c */
    class C10800c implements CompletedHandler {
        C10800c() {
        }

        public void onFailed(IotError iotError) {
            String str = C10797d1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON onFailed: false");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10797d1.this.f4758v;
            C10797d1.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.d1$d */
    class C10801d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20084a;

        C10801d(int i) {
            this.f20084a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10797d1.this.f4758v;
        }

        public void onSucceed() {
            String str = C10797d1.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setOnFromPower onSucceed: ");
            sb.append(this.f20084a);
            C10797d1.this.mo23221d0().mo31547K0(this.f20084a);
        }
    }

    /* renamed from: w3.d1$e */
    class C10802e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20086a;

        C10802e(int i) {
            this.f20086a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10797d1.this.f4758v;
        }

        public void onSucceed() {
            String str = C10797d1.this.f4758v;
            boolean unused = C10797d1.this.f12526y = true;
            if (C10797d1.this.mo23221d0().mo31611r(2) == null) {
                DeviceStatusBase d0 = C10797d1.this.mo23221d0();
                int i = this.f20086a;
                d0.mo31577a(new C12041e(i, i));
                return;
            }
            C10797d1.this.mo23221d0().mo31573X0(this.f20086a);
        }
    }

    public C10797d1(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str3, str2, 2676, str);
        mo23199O0(ownership);
        mo23189I0("wifi");
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        return false;
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_plug_small;
    }

    /* renamed from: G */
    public String mo23185G() {
        if (this.f4749n == null && (mo23212W() == Device.Ownership.MINE || mo23212W() == Device.Ownership.OTHERS)) {
            return this.f4753r;
        }
        AbstractDevice abstractDevice = this.f4749n;
        return (abstractDevice == null || abstractDevice.getDeviceId() == null || this.f4749n.getDeviceId().isEmpty()) ? mo23202Q(mo23206S().getAddress()) : this.f4749n.getDeviceId();
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_plug_big;
    }

    /* renamed from: I1 */
    public List<Property> mo31712I1() {
        return null;
    }

    /* renamed from: M0 */
    public void mo23196M0(AbstractDevice abstractDevice) {
        super.mo23196M0(abstractDevice);
        mo23199O0(this.f4749n.getOwnership());
        mo23221d0().mo31549L0(abstractDevice.isOnline());
        mo23184F0(mo23145k0() ? 11 : 0);
    }

    /* renamed from: N1 */
    public C11980p[] mo31716N1(C8327s sVar) {
        return null;
    }

    /* renamed from: O1 */
    public C11980p[] mo31717O1(boolean z) {
        return new C11980p[]{new C11980p(mo31698M1(), 3, 1, Boolean.valueOf(z))};
    }

    /* renamed from: P1 */
    public void mo31718P1(int i, int i2, Object obj) {
    }

    /* renamed from: R */
    public String mo23204R() {
        return mo23206S().getAddress();
    }

    /* renamed from: U0 */
    public boolean mo23131U0() {
        super.mo23131U0();
        mo31733h2();
        return true;
    }

    /* renamed from: Y1 */
    public boolean mo31726Y1(int i) {
        mo31727Z1(3, 2, Integer.valueOf(i), new C10801d(i));
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        mo31727Z1(3, 1, Boolean.FALSE, new C10800c());
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        return mo23162u1(0);
    }

    /* renamed from: f1 */
    public boolean mo23142f1(boolean z) {
        return false;
    }

    /* renamed from: f2 */
    public boolean mo31731f2() {
        if (mo23149m0()) {
            return false;
        }
        mo31709F1(3, new int[]{1, 2, 3}, new C10798a());
        return true;
    }

    /* renamed from: g0 */
    public int mo23143g0() {
        return 0;
    }

    /* renamed from: k0 */
    public boolean mo23145k0() {
        AbstractDevice abstractDevice = this.f4749n;
        return abstractDevice != null && abstractDevice.isOnline();
    }

    /* renamed from: l0 */
    public boolean mo23147l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        mo31727Z1(3, 1, Boolean.TRUE, new C10799b());
        return false;
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        return false;
    }

    /* renamed from: n */
    public void mo23151n() {
    }

    /* renamed from: o0 */
    public boolean mo23230o0() {
        return mo23145k0();
    }

    /* renamed from: o1 */
    public boolean mo23152o1(DeviceStatusBase.DeviceMode deviceMode) {
        return false;
    }

    /* renamed from: p0 */
    public boolean mo23153p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        return false;
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        return false;
    }

    /* renamed from: r */
    public void mo23156r() {
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s */
    public boolean mo23158s(ActionType actionType) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23235s0(int i, int i2) {
        if (i2 == 11) {
            mo23169y0();
        }
        if (i2 == 11 && this.f4749n.getOwnership() == Device.Ownership.MINE) {
            C8301v.m19657a(this);
        } else if (i2 == 0) {
            mo23183E0(-1);
        }
        for (C12143c onConnectionStateChanged : this.f4740e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        return false;
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
        if (!C8272e.m19511b().mo35204d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23145k0()) {
            Class<PlugControlActivity> cls = null;
            Class<PlugControlActivity> cls2 = PlugControlActivity.class;
            try {
                int i = PlugControlActivity.f11133h;
                cls = cls2;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (cls != null && mo23145k0()) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23185G());
                view.getContext().startActivity(intent);
            }
        } else {
            Intent intent2 = new Intent();
            intent2.setClass(view.getContext(), DeviceOfflinePromptActivity.class);
            intent2.putExtra("com.yeelight.cherry.device_id", this.f4753r);
            view.getContext().startActivity(intent2);
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        mo31727Z1(3, 3, Integer.valueOf(i * 60), new C10802e(i));
        return true;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23165w1(DeviceStatusBase.DeviceMode deviceMode) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        super.mo23166x(i, obj);
        if (i == 5) {
            mo23169y0();
            return true;
        } else if (i == 7) {
            mo23131U0();
            return true;
        } else if (i == 10) {
            C12041e eVar = (C12041e) obj;
            mo23162u1(eVar.mo42678b());
            mo23221d0().mo31577a(eVar);
            return true;
        } else if (i != 14) {
            return true;
        } else {
            mo23141c1();
            return true;
        }
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        return false;
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }
}
