package com.yeelight.yeelib.p150c.p183m;

import android.content.Context;
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
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.device.xiaomi.base.C9763a;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6072p;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p152f.C9820v;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p194ui.activity.DeviceOfflinePromptActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yeelight.yeelib.c.m.j1 */
public class C6922j1 extends C6072p {

    /* renamed from: com.yeelight.yeelib.c.m.j1$a */
    class C6923a implements C9763a<String> {
        C6923a() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            String str2 = C6922j1.this.f7260v;
            "getRclist onSucceed: " + str;
            C6922j1.this.mo23408d0().mo27709q0(C6922j1.this.mo27747i2(str));
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$b */
    class C6924b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ String f14270a;

        C6924b(String str) {
            this.f14270a = str;
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
        }

        public void onSucceed() {
            String str = C6922j1.this.f7260v;
            "setRclistfordel onSucceed: " + this.f14270a;
            C6922j1.this.mo23408d0().mo27689g0(4096);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$c */
    class C6925c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14272a;

        C6925c(boolean z) {
            this.f14272a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
            "setSmartSwitch --> onFailed: " + this.f14272a;
        }

        public void onSucceed() {
            String str = C6922j1.this.f7260v;
            "setSmartSwitch --> onSucceed: " + this.f14272a;
            boolean unused = C6922j1.this.f12867y = true;
            C6922j1.this.mo23408d0().mo27696k(this.f14272a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$d */
    class C6926d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f14274a;

        C6926d(int i) {
            this.f14274a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
            "setDelayOff onFailed: " + this.f14274a;
        }

        public void onSucceed() {
            String str = C6922j1.this.f7260v;
            "setDelayOff onSucceed: " + this.f14274a;
            boolean unused = C6922j1.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$e */
    class C6927e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f14276a;

        C6927e(int i) {
            this.f14276a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
            "setDelayOff onFailed: " + this.f14276a;
        }

        public void onSucceed() {
            String str = C6922j1.this.f7260v;
            "setDelayOff onSucceed: " + this.f14276a;
            boolean unused = C6922j1.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$f */
    class C6928f implements CompletedHandler {
        C6928f() {
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
        }

        public void onSucceed() {
            boolean unused = C6922j1.this.f12867y = true;
            String str = C6922j1.this.f7260v;
            C6922j1.this.m20492F2().mo27866f(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$g */
    class C6929g implements CompletedHandler {
        C6929g() {
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
        }

        public void onSucceed() {
            boolean unused = C6922j1.this.f12867y = true;
            String str = C6922j1.this.f7260v;
            C6922j1.this.m20493G2().mo27866f(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$h */
    class C6930h implements CompletedHandler {
        C6930h() {
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
        }

        public void onSucceed() {
            boolean unused = C6922j1.this.f12867y = true;
            String str = C6922j1.this.f7260v;
            C6922j1.this.m20492F2().mo27866f(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$i */
    class C6931i implements CompletedHandler {
        C6931i() {
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
        }

        public void onSucceed() {
            boolean unused = C6922j1.this.f12867y = true;
            String str = C6922j1.this.f7260v;
            C6922j1.this.m20493G2().mo27866f(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$j */
    class C6932j implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f14282a;

        C6932j(int i) {
            this.f14282a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
        }

        public void onSucceed() {
            boolean unused = C6922j1.this.f12867y = true;
            C6922j1.this.m20492F2().mo27865e(this.f14282a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$k */
    class C6933k implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f14284a;

        C6933k(int i) {
            this.f14284a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
        }

        public void onSucceed() {
            boolean unused = C6922j1.this.f12867y = true;
            C6922j1.this.m20493G2().mo27865e(this.f14284a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$l */
    class C6934l implements C9763a<Map<Integer, Object>> {
        C6934l() {
        }

        /* renamed from: a */
        public void onSucceed(Map<Integer, Object> map) {
            Boolean bool = (Boolean) map.get(1);
            Integer num = (Integer) map.get(2);
            Integer num2 = (Integer) map.get(3);
            String str = C6922j1.this.f7260v;
            "get properties1 onSucceed: on: " + bool + "   defaultStatus: " + num + "  delay: " + num2;
            C6072p.C6073a u2 = C6922j1.this.m20492F2();
            u2.mo27866f(bool == null ? false : bool.booleanValue());
            u2.mo27865e(num == null ? 0 : num.intValue());
            if (num2 == null) {
                num2 = 0;
            }
            int intValue = num2.intValue() % 60;
            int intValue2 = num2.intValue() / 60;
            if (intValue > 0) {
                intValue2++;
            }
            Integer valueOf = Integer.valueOf(intValue2);
            if (C6922j1.this.mo23408d0().mo27710r(2) == null) {
                C6922j1.this.m20492F2().mo27861a(new C7554e(valueOf.intValue(), valueOf.intValue()));
            } else {
                C6922j1.this.m20492F2().mo27867g(valueOf.intValue());
            }
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
            "get properties1 onFailed: " + iotError;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$m */
    class C6935m implements C9763a<Map<Integer, Object>> {
        C6935m() {
        }

        /* renamed from: a */
        public void onSucceed(Map<Integer, Object> map) {
            Boolean bool = (Boolean) map.get(1);
            Integer num = (Integer) map.get(2);
            Integer num2 = (Integer) map.get(3);
            String str = C6922j1.this.f7260v;
            "get properties2 onSucceed: on" + bool + "   defaultStatus: " + num + "  delay: " + num2;
            C6072p.C6073a y2 = C6922j1.this.m20493G2();
            y2.mo27866f(bool == null ? false : bool.booleanValue());
            y2.mo27865e(num == null ? 0 : num.intValue());
            if (num2 == null) {
                num2 = 0;
            }
            int intValue = num2.intValue() % 60;
            int intValue2 = num2.intValue() / 60;
            if (intValue > 0) {
                intValue2++;
            }
            Integer valueOf = Integer.valueOf(intValue2);
            if (C6922j1.this.mo23408d0().mo27710r(2) == null) {
                C6922j1.this.m20493G2().mo27861a(new C7554e(valueOf.intValue(), valueOf.intValue()));
            } else {
                C6922j1.this.m20493G2().mo27867g(valueOf.intValue());
            }
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
            "get properties2 onFailed: " + iotError;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j1$n */
    class C6936n implements C9763a<Map<Integer, Object>> {
        C6936n() {
        }

        /* renamed from: a */
        public void onSucceed(Map<Integer, Object> map) {
            Integer num = (Integer) map.get(2);
            String str = C6922j1.this.f7260v;
            "get properties3 onSucceed: flexSwitch" + num;
            C6024e d0 = C6922j1.this.mo23408d0();
            boolean z = true;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            d0.mo27696k(z);
        }

        public void onFailed(IotError iotError) {
            String str = C6922j1.this.f7260v;
            "get properties3 onFailed: " + iotError;
        }
    }

    public C6922j1(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str3, str2, 2299, str, 2);
        mo23386O0(ownership);
        mo23376I0("wifi");
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public C6072p.C6073a m20492F2() {
        return mo27858q2(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public C6072p.C6073a m20493G2() {
        return mo27858q2(1);
    }

    /* renamed from: H2 */
    private void m20494H2(int i) {
        mo27841Z1(2, 2, Integer.valueOf(i), new C6932j(i));
    }

    /* renamed from: I2 */
    private void m20495I2(int i) {
        mo27841Z1(3, 2, Integer.valueOf(i), new C6933k(i));
    }

    /* renamed from: C */
    public C7554e mo23366C() {
        C6072p.C6073a G2;
        int i = this.f12899G;
        if (i == 0) {
            G2 = m20492F2();
        } else if (i != 1) {
            return null;
        } else {
            G2 = m20493G2();
        }
        return G2.mo27862b();
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_sw1_small;
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
        return R$drawable.icon_yeelight_device_badge_sw1_big;
    }

    /* renamed from: I1 */
    public List<Property> mo27826I1() {
        return null;
    }

    /* renamed from: L1 */
    public List<YeelightTimer> mo27829L1() {
        List<YeelightTimer> list = (List) mo23408d0().mo27710r(1);
        ArrayList arrayList = new ArrayList();
        int i = this.f12899G;
        int i2 = i == 0 ? 2 : i == 1 ? 3 : 0;
        if (list != null) {
            for (YeelightTimer yeelightTimer : list) {
                if ((yeelightTimer.mo29034j() != null && yeelightTimer.mo29034j().length > 0 && yeelightTimer.mo29034j()[0].mo29085c() == i2) || (yeelightTimer.mo29029c() != null && yeelightTimer.mo29029c().length > 0 && yeelightTimer.mo29029c()[0].mo29085c() == i2)) {
                    arrayList.add(yeelightTimer);
                }
            }
        }
        return arrayList;
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
        int i = this.f12899G;
        if (i == 0) {
            return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.valueOf(z))};
        } else if (i != 1) {
            return null;
        } else {
            return new C7638m0[]{new C7638m0(mo27788M1(), 3, 1, Boolean.valueOf(z))};
        }
    }

    /* renamed from: P1 */
    public void mo27832P1(int i, int i2, Object obj) {
    }

    /* renamed from: R */
    public String mo23391R() {
        return mo23393S().getAddress();
    }

    /* renamed from: V */
    public boolean mo23398V() {
        int i = this.f12899G;
        return i == 0 ? m20492F2().mo27863c() == 1 : i == 1 ? m20493G2().mo27863c() == 1 : super.mo23398V();
    }

    /* renamed from: Y1 */
    public boolean mo27840Y1(int i) {
        int i2 = this.f12899G;
        if (i2 == 0) {
            m20494H2(i);
        } else if (i2 == 1) {
            m20495I2(i);
        }
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        int i;
        Boolean bool;
        CompletedHandler iVar;
        int i2 = this.f12899G;
        if (i2 == 0) {
            i = 2;
            bool = Boolean.FALSE;
            iVar = new C6930h();
        } else if (i2 != 1) {
            return false;
        } else {
            i = 3;
            bool = Boolean.FALSE;
            iVar = new C6931i();
        }
        mo27841Z1(i, 1, bool, iVar);
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        return mo23348u1(0);
    }

    /* renamed from: e0 */
    public String mo23409e0() {
        Context context;
        int i;
        if (!mo23416o0()) {
            context = C4297y.f7456e;
            i = R$string.common_text_status_subtitle_offline;
        } else if (!mo23331k0()) {
            if (mo23333l0()) {
                context = C4297y.f7456e;
                i = R$string.common_text_status_connecting;
            } else {
                context = C4297y.f7456e;
                i = R$string.common_text_status_subtitle_online;
            }
        } else if (mo23339p0()) {
            context = C4297y.f7456e;
            i = R$string.common_text_status_upgrade;
        } else {
            context = C4297y.f7456e;
            i = R$string.common_text_status_subtitle_device_online;
        }
        return context.getString(i);
    }

    /* renamed from: f2 */
    public boolean mo27845f2() {
        if (mo23335m0()) {
            return false;
        }
        mo27823F1(2, new int[]{1, 2, 3}, new C6934l());
        mo27823F1(3, new int[]{1, 2, 3}, new C6935m());
        mo27823F1(4, new int[]{2}, new C6936n());
        return true;
    }

    /* renamed from: k1 */
    public boolean mo23332k1() {
        C6072p.C6073a G2;
        int i = this.f12899G;
        if (i == 0) {
            G2 = m20492F2();
        } else if (i != 1) {
            return false;
        } else {
            G2 = m20493G2();
        }
        return G2.mo27864d();
    }

    /* renamed from: k2 */
    public boolean mo27748k2() {
        return mo27853l2(4, 3);
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        int i;
        Boolean bool;
        CompletedHandler gVar;
        int i2 = this.f12899G;
        if (i2 == 0) {
            i = 2;
            bool = Boolean.TRUE;
            gVar = new C6928f();
        } else {
            if (i2 == 1) {
                i = 3;
                bool = Boolean.TRUE;
                gVar = new C6929g();
            }
            return true;
        }
        mo27841Z1(i, 1, bool, gVar);
        return true;
    }

    /* renamed from: l2 */
    public boolean mo27853l2(int i, int i2) {
        mo27824G1(i, i2, new C6923a());
        return true;
    }

    /* renamed from: n2 */
    public boolean mo27855n2(int i, int i2, String str) {
        mo27841Z1(i, i2, str, new C6924b(str));
        return true;
    }

    /* renamed from: o2 */
    public boolean mo27749o2(String str, int i, int i2) {
        "unbindRemote mac: " + str;
        return mo27855n2(4, 4, str);
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

    /* renamed from: u0 */
    public void mo23347u0(View view) {
        if (!C9784e.m23711b().mo31628d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23331k0()) {
            Class<?> cls = null;
            try {
                cls = Class.forName("com.yeelight.cherry.ui.activity.SwitchControlActivity");
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
        int i2 = this.f12899G;
        if (i2 == 0) {
            mo27841Z1(2, 3, Integer.valueOf(i * 60), new C6926d(i));
        } else if (i2 == 1) {
            mo27841Z1(3, 3, Integer.valueOf(i * 60), new C6927e(i));
        }
        return true;
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
        mo27841Z1(4, 2, Integer.valueOf(z ? 1 : 0), new C6925c(z));
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        C6072p.C6073a G2;
        super.mo23353x(i, obj);
        if (i == 5) {
            mo23356y0();
        } else if (i == 7) {
            mo23317U0();
        } else if (i == 10) {
            C7554e eVar = (C7554e) obj;
            mo23348u1(eVar.mo28881b());
            int i2 = this.f12899G;
            if (i2 == 0) {
                G2 = m20492F2();
            } else if (i2 == 1) {
                G2 = m20493G2();
            }
            G2.mo27861a(eVar);
        } else if (i == 14) {
            mo23327c1();
        }
        return true;
    }
}
