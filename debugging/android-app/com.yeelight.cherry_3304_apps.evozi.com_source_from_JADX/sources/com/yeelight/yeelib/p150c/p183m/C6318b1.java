package com.yeelight.yeelib.p150c.p183m;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.handler.CompletedHandler;
import com.p146mi.iot.common.instance.Property;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7638m0;
import com.yeelight.yeelib.device.xiaomi.base.C9763a;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6067o;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p152f.C9820v;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p194ui.activity.DeviceOfflinePromptActivity;
import java.util.List;
import java.util.Map;

/* renamed from: com.yeelight.yeelib.c.m.b1 */
public class C6318b1 extends C6067o {

    /* renamed from: com.yeelight.yeelib.c.m.b1$a */
    class C6319a implements C9763a<Map<Integer, Object>> {
        C6319a() {
        }

        /* renamed from: a */
        public void onSucceed(Map<Integer, Object> map) {
            Boolean bool = (Boolean) map.get(1);
            Integer num = (Integer) map.get(2);
            Integer num2 = (Integer) map.get(3);
            String str = C6318b1.this.f7260v;
            "get properties1 onSucceed: on: " + bool + "   defaultStatus: " + num + "  delayOff: " + num2;
            if (num != null) {
                C6318b1.this.mo23408d0().mo27644I0(num.intValue());
            }
            if (bool != null) {
                C6318b1.this.mo23408d0().mo27648K0(bool.booleanValue());
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
            if (C6318b1.this.mo23408d0().mo27710r(2) == null) {
                C6318b1.this.mo23408d0().mo27676a(new C7554e(valueOf.intValue(), valueOf.intValue()));
            } else {
                C6318b1.this.mo23408d0().mo27670V0(valueOf.intValue());
            }
        }

        public void onFailed(IotError iotError) {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b1$b */
    class C6320b implements CompletedHandler {
        C6320b() {
        }

        public void onFailed(IotError iotError) {
            String str = C6318b1.this.f7260v;
            "PROPERTY_ON onFailed: true" + iotError;
        }

        public void onSucceed() {
            String str = C6318b1.this.f7260v;
            C6318b1.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b1$c */
    class C6321c implements CompletedHandler {
        C6321c() {
        }

        public void onFailed(IotError iotError) {
            String str = C6318b1.this.f7260v;
            "PROPERTY_ON onFailed: false" + iotError;
        }

        public void onSucceed() {
            String str = C6318b1.this.f7260v;
            C6318b1.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b1$d */
    class C6322d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13352a;

        C6322d(int i) {
            this.f13352a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6318b1.this.f7260v;
        }

        public void onSucceed() {
            String str = C6318b1.this.f7260v;
            "setOnFromPower onSucceed: " + this.f13352a;
            C6318b1.this.mo23408d0().mo27644I0(this.f13352a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b1$e */
    class C6323e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13354a;

        C6323e(int i) {
            this.f13354a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6318b1.this.f7260v;
        }

        public void onSucceed() {
            String str = C6318b1.this.f7260v;
            boolean unused = C6318b1.this.f12867y = true;
            if (C6318b1.this.mo23408d0().mo27710r(2) == null) {
                C6024e d0 = C6318b1.this.mo23408d0();
                int i = this.f13354a;
                d0.mo27676a(new C7554e(i, i));
                return;
            }
            C6318b1.this.mo23408d0().mo27670V0(this.f13354a);
        }
    }

    public C6318b1(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str3, str2, 2676, str);
        mo23386O0(ownership);
        mo23376I0("wifi");
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        return false;
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_plug_small;
    }

    /* renamed from: G */
    public String mo23372G() {
        if (this.f7251n == null && (mo23399W() == Device.Ownership.MINE || mo23399W() == Device.Ownership.OTHERS)) {
            return this.f7255r;
        }
        AbstractDevice abstractDevice = this.f7251n;
        return (abstractDevice == null || abstractDevice.getDeviceId() == null || this.f7251n.getDeviceId().isEmpty()) ? mo23389Q(mo23393S().getAddress()) : this.f7251n.getDeviceId();
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_plug_big;
    }

    /* renamed from: I1 */
    public List<Property> mo27826I1() {
        return null;
    }

    /* renamed from: M0 */
    public void mo23383M0(AbstractDevice abstractDevice) {
        super.mo23383M0(abstractDevice);
        mo23386O0(this.f7251n.getOwnership());
        mo23408d0().mo27646J0(abstractDevice.isOnline());
        mo23371F0(mo23331k0() ? 11 : 0);
    }

    /* renamed from: N1 */
    public C7638m0[] mo27830N1(C9856y yVar) {
        return null;
    }

    /* renamed from: O1 */
    public C7638m0[] mo27831O1(boolean z) {
        return new C7638m0[]{new C7638m0(mo27788M1(), 3, 1, Boolean.valueOf(z))};
    }

    /* renamed from: P1 */
    public void mo27832P1(int i, int i2, Object obj) {
    }

    /* renamed from: R */
    public String mo23391R() {
        return mo23393S().getAddress();
    }

    /* renamed from: U0 */
    public boolean mo23317U0() {
        super.mo23317U0();
        mo27847h2();
        return true;
    }

    /* renamed from: Y1 */
    public boolean mo27840Y1(int i) {
        mo27841Z1(3, 2, Integer.valueOf(i), new C6322d(i));
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        mo27841Z1(3, 1, Boolean.FALSE, new C6321c());
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        return mo23348u1(0);
    }

    /* renamed from: f1 */
    public boolean mo23328f1(boolean z) {
        return false;
    }

    /* renamed from: f2 */
    public boolean mo27845f2() {
        if (mo23335m0()) {
            return false;
        }
        mo27823F1(3, new int[]{1, 2, 3}, new C6319a());
        return true;
    }

    /* renamed from: g0 */
    public int mo23329g0() {
        return 0;
    }

    /* renamed from: k0 */
    public boolean mo23331k0() {
        AbstractDevice abstractDevice = this.f7251n;
        return abstractDevice != null && abstractDevice.isOnline();
    }

    /* renamed from: l0 */
    public boolean mo23333l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        mo27841Z1(3, 1, Boolean.TRUE, new C6320b());
        return false;
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        return false;
    }

    /* renamed from: n */
    public void mo23337n() {
    }

    /* renamed from: o0 */
    public boolean mo23416o0() {
        return mo23331k0();
    }

    /* renamed from: o1 */
    public boolean mo23338o1(C6024e.C6028d dVar) {
        return false;
    }

    /* renamed from: p0 */
    public boolean mo23339p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        return false;
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        return false;
    }

    /* renamed from: r */
    public void mo23342r() {
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s */
    public boolean mo23344s(C7563a aVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23421s0(int i, int i2) {
        if (i2 == 11) {
            mo23356y0();
        }
        if (i2 == 11 && this.f7251n.getOwnership() == Device.Ownership.MINE) {
            C9820v.m23868a(this);
        } else if (i2 == 0) {
            mo23370E0(-1);
        }
        for (C9768c onConnectionStateChanged : this.f7242e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        return false;
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
        if (!C9784e.m23711b().mo31628d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23331k0()) {
            Class<?> cls = null;
            try {
                cls = Class.forName("com.yeelight.cherry.ui.activity.PlugControlActivity");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (cls != null && mo23331k0()) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23372G());
                view.getContext().startActivity(intent);
            }
        } else {
            Intent intent2 = new Intent();
            intent2.setClass(view.getContext(), DeviceOfflinePromptActivity.class);
            intent2.putExtra("com.yeelight.cherry.device_id", this.f7255r);
            view.getContext().startActivity(intent2);
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        mo27841Z1(3, 3, Integer.valueOf(i * 60), new C6323e(i));
        return true;
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23352w1(C6024e.C6028d dVar) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        super.mo23353x(i, obj);
        if (i == 5) {
            mo23356y0();
            return true;
        } else if (i == 7) {
            mo23317U0();
            return true;
        } else if (i == 10) {
            C7554e eVar = (C7554e) obj;
            mo23348u1(eVar.mo28881b());
            mo23408d0().mo27676a(eVar);
            return true;
        } else if (i != 14) {
            return true;
        } else {
            mo23327c1();
            return true;
        }
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        return false;
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }
}
