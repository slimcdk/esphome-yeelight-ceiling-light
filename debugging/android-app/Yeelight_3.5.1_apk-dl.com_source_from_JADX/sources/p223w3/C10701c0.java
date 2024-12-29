package p223w3;

import com.miot.service.manager.timer.TimerCodec;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.p022mi.iot.common.instance.Property;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.device.xiaomi.base.C8253c;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.models.C8327s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p051j4.C9201q;
import p207s3.C10337c;
import p227x3.C11980p;
import p232y3.C12041e;

/* renamed from: w3.c0 */
public class C10701c0 extends C10337c {

    /* renamed from: w3.c0$a */
    class C10702a implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19919a;

        C10702a(C8327s sVar) {
            this.f19919a = sVar;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setscene ct onFailed: ");
            sb.append(iotError.toString());
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            C10701c0.this.mo23221d0().mo31610q0(this.f19919a.mo35441h());
            C10701c0.this.mo23221d0().mo31600l0((long) this.f19919a.mo35439f());
        }
    }

    /* renamed from: w3.c0$b */
    class C10703b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19921a;

        C10703b(C8327s sVar) {
            this.f19921a = sVar;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            C10701c0.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
            C10701c0.this.mo23221d0().mo31600l0((long) this.f19921a.mo35439f());
        }
    }

    /* renamed from: w3.c0$c */
    class C10704c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19923a;

        /* renamed from: b */
        final /* synthetic */ String f19924b;

        /* renamed from: c */
        final /* synthetic */ String f19925c;

        /* renamed from: d */
        final /* synthetic */ int f19926d;

        C10704c(boolean z, String str, String str2, int i) {
            this.f19923a = z;
            this.f19924b = str;
            this.f19925c = str2;
            this.f19926d = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableNightTime onFailed: ");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            C10701c0.this.mo23221d0().mo31543I0(this.f19923a);
            C10701c0.this.mo23221d0().mo31541H0(this.f19924b);
            C10701c0.this.mo23221d0().mo31539G0(this.f19925c);
            C10701c0.this.mo23221d0().mo31537F0(this.f19926d);
        }
    }

    /* renamed from: w3.c0$d */
    class C10705d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19928a;

        C10705d(int i) {
            this.f19928a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onFailed: ");
            sb.append(this.f19928a);
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onSucceed: ");
            sb.append(this.f19928a);
            boolean unused = C10701c0.this.f12526y = true;
        }
    }

    /* renamed from: w3.c0$e */
    class C10706e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19930a;

        C10706e(int i) {
            this.f19930a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON fan onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            C10701c0.this.mo41904v2().mo31551M0(true);
            C10701c0.this.m27307Q2(this.f19930a);
        }
    }

    /* renamed from: w3.c0$f */
    class C10707f implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19932a;

        C10707f(int i) {
            this.f19932a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onFailed: ");
            sb.append(this.f19932a);
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onSucceed: ");
            sb.append(this.f19932a);
            boolean unused = C10701c0.this.f12526y = true;
        }
    }

    /* renamed from: w3.c0$g */
    class C10708g implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19934a;

        C10708g(int i) {
            this.f19934a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("light setOnFromPower onSucceed: ");
            sb.append(this.f19934a);
            C10701c0.this.mo23221d0().mo31547K0(this.f19934a);
        }
    }

    /* renamed from: w3.c0$h */
    class C10709h implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19936a;

        C10709h(int i) {
            this.f19936a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("fan setOnFromPower onSucceed: ");
            sb.append(this.f19936a);
            C10701c0.this.mo41904v2().mo31547K0(this.f19936a);
        }
    }

    /* renamed from: w3.c0$i */
    class C10710i implements CompletedHandler {
        C10710i() {
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            C10701c0.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
            boolean unused = C10701c0.this.f12526y = true;
        }
    }

    /* renamed from: w3.c0$j */
    class C10711j implements CompletedHandler {
        C10711j() {
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            C10701c0.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
        }
    }

    /* renamed from: w3.c0$k */
    class C10712k implements CompletedHandler {
        C10712k() {
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON fan onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            C10701c0.this.mo41904v2().mo31551M0(true);
        }
    }

    /* renamed from: w3.c0$l */
    class C10713l implements CompletedHandler {
        C10713l() {
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON fan onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            C10701c0.this.mo41904v2().mo31551M0(false);
        }
    }

    /* renamed from: w3.c0$m */
    class C10714m implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19942a;

        C10714m(int i) {
            this.f19942a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setLevel onFailed: ");
            sb.append(this.f19942a);
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setLevel onSucceed: ");
            sb.append(this.f19942a);
            boolean unused = C10701c0.this.f12526y = true;
        }
    }

    /* renamed from: w3.c0$n */
    class C10715n implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19944a;

        C10715n(int i) {
            this.f19944a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanSpeed onFailed: ");
            sb.append(this.f19944a);
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanSpeed onSucceed: ");
            sb.append(this.f19944a);
        }
    }

    /* renamed from: w3.c0$o */
    class C10716o implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19946a;

        C10716o(int i) {
            this.f19946a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanMode onFailed mode: ");
            sb.append(this.f19946a);
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanMode onSucceed mode: ");
            sb.append(this.f19946a);
            C10701c0.this.mo41904v2().mo41918b1(this.f19946a);
            boolean unused = C10701c0.this.f12526y = true;
        }
    }

    /* renamed from: w3.c0$p */
    class C10717p implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19948a;

        C10717p(boolean z) {
            this.f19948a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableFlexSwitch onFailed: ");
            sb.append(this.f19948a);
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableFlexSwitch onFailed: ");
            sb.append(this.f19948a);
            boolean unused = C10701c0.this.f12526y = true;
            C10701c0.this.mo23221d0().mo31597k(this.f19948a);
        }
    }

    /* renamed from: w3.c0$q */
    class C10718q implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19950a;

        C10718q(boolean z) {
            this.f19950a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableFanFlexSwitch onFailed: ");
            sb.append(this.f19950a);
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableFanFlexSwitch onFailed: ");
            sb.append(this.f19950a);
            boolean unused = C10701c0.this.f12526y = true;
            C10701c0.this.mo41904v2().mo31597k(this.f19950a);
        }
    }

    /* renamed from: w3.c0$r */
    class C10719r implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ long f19952a;

        C10719r(long j) {
            this.f19952a = j;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            C10701c0.this.mo23221d0().mo31600l0(this.f19952a);
            boolean unused = C10701c0.this.f12526y = true;
        }
    }

    /* renamed from: w3.c0$s */
    class C10720s implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19954a;

        C10720s(int i) {
            this.f19954a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10701c0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10701c0.this.f4758v;
            C10701c0.this.mo23221d0().mo31561R0(this.f19954a);
            boolean unused = C10701c0.this.f12526y = true;
        }
    }

    public C10701c0(String str, String str2, String str3, String str4) {
        super(str, str2, str3, 1634, str4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, new C10337c.C10340c(0, 100, R$string.fancl_fan_style_standard, 1));
        linkedHashMap.put(1, new C10337c.C10340c(1, 3, R$string.fancl_fan_style_nature));
        linkedHashMap.put(2, new C10337c.C10340c(2, 3, R$string.fancl_fan_style_loop, true));
        linkedHashMap.put(5, new C10337c.C10340c(5, 3, R$string.fancl_fan_style_sleep));
        mo41892C2(linkedHashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public void m27307Q2(int i) {
        mo31729b2(3, 11, Integer.valueOf(i), new C10707f(i));
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        return false;
    }

    /* renamed from: B2 */
    public void mo41891B2(int i) {
        mo31729b2(3, 7, Integer.valueOf(i), new C10716o(i));
    }

    /* renamed from: D2 */
    public void mo41893D2(C10337c.C10340c cVar, int i) {
        mo31728a2(new C8253c[]{new C8253c(5, 4, Integer.valueOf(i)), new C8253c(3, 1, Boolean.TRUE)}, new C10715n(i));
    }

    /* renamed from: E2 */
    public void mo41894E2(int i) {
        mo31728a2(new C8253c[]{new C8253c(3, 2, Integer.valueOf(i)), new C8253c(3, 1, Boolean.TRUE)}, new C10714m(i));
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_fancl2_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_fancl2_big;
    }

    /* renamed from: I1 */
    public List<Property> mo31712I1() {
        ArrayList arrayList = new ArrayList();
        List<Property> J1 = mo31713J1(2, new int[]{1, 3, 2, 5, 8});
        if (J1 != null) {
            arrayList.addAll(J1);
        }
        List<Property> J12 = mo31713J1(3, new int[]{1, 2, 7, 12});
        if (J12 != null) {
            arrayList.addAll(J12);
        }
        List<Property> J13 = mo31713J1(4, new int[]{1, 2, 4});
        if (J13 != null) {
            arrayList.addAll(J13);
        }
        List<Property> J14 = mo31713J1(5, new int[]{1, 2, 4, 3});
        if (J14 != null) {
            arrayList.addAll(J14);
        }
        return arrayList;
    }

    /* renamed from: L1 */
    public List<YeelightTimer> mo31715L1() {
        List<YeelightTimer> list = (List) mo23221d0().mo31611r(1);
        ArrayList arrayList = new ArrayList();
        int i = this.f19422Q == 0 ? 2 : 3;
        if (list != null) {
            for (YeelightTimer yeelightTimer : list) {
                if ((yeelightTimer.mo31889j() != null && yeelightTimer.mo31889j().length > 0 && yeelightTimer.mo31889j()[0].mo42552c() == i) || (yeelightTimer.mo31884c() != null && yeelightTimer.mo31884c().length > 0 && yeelightTimer.mo31884c()[0].mo42552c() == i)) {
                    arrayList.add(yeelightTimer);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: N1 */
    public C11980p[] mo31716N1(C8327s sVar) {
        if (sVar == null) {
            return null;
        }
        if (sVar.mo35458y()) {
            return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.TRUE, mo31714K1(sVar)), new C11980p(mo31698M1(), 2, 3, Integer.valueOf(sVar.mo35439f()))};
        } else if (sVar.mo35419D()) {
            StringBuilder sb = new StringBuilder();
            sb.append("newSpecAction: bright: ");
            sb.append(sVar.mo35439f());
            if (sVar.mo35439f() > 1) {
                return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.TRUE), new C11980p(mo31698M1(), 2, 2, 0), new C11980p(mo31698M1(), 2, 5, Integer.valueOf(sVar.mo35441h())), new C11980p(mo31698M1(), 2, 3, Integer.valueOf(sVar.mo35439f()))};
            }
            return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.TRUE, mo31714K1(sVar)), new C11980p(mo31698M1(), 2, 2, 0), new C11980p(mo31698M1(), 2, 5, Integer.valueOf(sVar.mo35441h()))};
        } else if (!sVar.mo35421F()) {
            return null;
        } else {
            return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.TRUE, mo31714K1(sVar)), new C11980p(mo31698M1(), 2, 2, 1), new C11980p(mo31698M1(), 2, 3, Integer.valueOf(sVar.mo35439f()))};
        }
    }

    /* renamed from: O1 */
    public C11980p[] mo31717O1(boolean z) {
        if (this.f19422Q == 0) {
            return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.valueOf(z))};
        }
        return new C11980p[]{new C11980p(mo31698M1(), 3, 1, Boolean.valueOf(z))};
    }

    /* renamed from: P1 */
    public void mo31718P1(int i, int i2, Object obj) {
        DeviceStatusBase d0;
        DeviceStatusBase.DeviceMode deviceMode;
        int intValue;
        DeviceStatusBase d02;
        DeviceStatusBase d03;
        C12041e eVar;
        DeviceStatusBase deviceStatusBase;
        DeviceStatusBase deviceStatusBase2;
        if (obj != null) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (i2 == 1) {
                                deviceStatusBase = mo41904v2();
                                deviceStatusBase.mo31547K0(((Integer) obj).intValue());
                                return;
                            } else if (i2 == 2) {
                                byte[] g = C9201q.m22195g(((Integer) obj).intValue());
                                Map<Integer, C10337c.C10340c> u2 = mo41903u2();
                                u2.get(1).mo41915f(g[1]);
                                u2.get(2).mo41915f(g[2]);
                                u2.get(5).mo41915f(g[3]);
                                return;
                            } else if (i2 == 3) {
                                deviceStatusBase2 = mo41904v2();
                            } else if (i2 == 4) {
                                mo41903u2().get(0).mo41915f(((Integer) obj).intValue());
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (i2 == 1) {
                        deviceStatusBase = mo23221d0();
                        deviceStatusBase.mo31547K0(((Integer) obj).intValue());
                        return;
                    } else if (i2 == 2) {
                        mo42236P2((Long) obj);
                        return;
                    } else if (i2 == 4) {
                        deviceStatusBase2 = mo23221d0();
                    } else {
                        return;
                    }
                    deviceStatusBase2.mo31597k(((Boolean) obj).booleanValue());
                    return;
                } else if (i2 == 1) {
                    d0 = mo41904v2();
                    d0.mo31551M0(((Boolean) obj).booleanValue());
                    return;
                } else if (i2 == 2) {
                    mo41904v2().mo41917a1(((Integer) obj).intValue());
                    return;
                } else if (i2 == 7) {
                    mo41904v2().mo41918b1(((Integer) obj).intValue());
                    return;
                } else if (i2 == 12) {
                    intValue = ((Integer) obj).intValue();
                    if (mo41904v2().mo31611r(2) == null) {
                        d03 = mo41904v2();
                        eVar = new C12041e(intValue, intValue);
                    } else {
                        d02 = mo41904v2();
                        d02.mo31573X0(intValue);
                        return;
                    }
                } else {
                    return;
                }
            } else if (i2 == 1) {
                d0 = mo23221d0();
                d0.mo31551M0(((Boolean) obj).booleanValue());
                return;
            } else if (i2 == 2) {
                int intValue2 = ((Integer) obj).intValue();
                if (intValue2 == 0) {
                    deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE;
                } else if (intValue2 == 1) {
                    deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT;
                } else {
                    return;
                }
                mo23165w1(deviceMode);
                return;
            } else if (i2 == 3) {
                Integer num = (Integer) obj;
                mo23221d0().mo31600l0((long) num.intValue());
                mo23221d0().mo31545J0((long) num.intValue());
                return;
            } else if (i2 == 5) {
                mo23221d0().mo31610q0(((Integer) obj).intValue());
                return;
            } else if (i2 == 8) {
                intValue = ((Integer) obj).intValue();
                if (mo23221d0().mo31611r(2) == null) {
                    d03 = mo23221d0();
                    eVar = new C12041e(intValue, intValue);
                } else {
                    d02 = mo23221d0();
                    d02.mo31573X0(intValue);
                    return;
                }
            } else {
                return;
            }
            d03.mo31577a(eVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public void mo42236P2(Long l) {
        Object obj;
        Object obj2;
        byte[] h = C9201q.m22196h(l == null ? 0 : l.longValue());
        DeviceStatusBase d0 = mo23221d0();
        boolean z = true;
        if (h[5] != 1) {
            z = false;
        }
        d0.mo31543I0(z);
        byte b = h[0];
        DeviceStatusBase d02 = mo23221d0();
        StringBuilder sb = new StringBuilder();
        if (b < 10) {
            obj = TimerCodec.DISENABLE + b;
        } else {
            obj = Byte.valueOf(b);
        }
        sb.append(obj);
        sb.append("0000");
        d02.mo31541H0(sb.toString());
        byte b2 = h[2];
        DeviceStatusBase d03 = mo23221d0();
        StringBuilder sb2 = new StringBuilder();
        if (b2 < 10) {
            obj2 = TimerCodec.DISENABLE + b2;
        } else {
            obj2 = Byte.valueOf(b2);
        }
        sb2.append(obj2);
        sb2.append("0000");
        d03.mo31539G0(sb2.toString());
        mo23221d0().mo31537F0(h[4]);
    }

    /* renamed from: V */
    public boolean mo23211V() {
        return this.f19422Q == 0 ? super.mo23211V() : this.f19421C.mo31542I() == 1;
    }

    /* renamed from: Y1 */
    public boolean mo31726Y1(int i) {
        CompletedHandler completedHandler;
        Integer num;
        int i2;
        if (this.f19422Q == 0) {
            i2 = 4;
            num = Integer.valueOf(i == 1 ? 1 : 2);
            completedHandler = new C10708g(i);
        } else {
            i2 = 5;
            num = Integer.valueOf(i);
            completedHandler = new C10709h(i);
        }
        mo31729b2(i2, 1, num, completedHandler);
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        return mo31707C1(2, 1);
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
        return false;
    }

    /* renamed from: g0 */
    public int mo23143g0() {
        return 0;
    }

    /* renamed from: g1 */
    public boolean mo23245g1(boolean z, String str, String str2, int i) {
        mo31729b2(4, 2, Long.valueOf(C9201q.m22192d(Byte.valueOf(str.substring(0, 2)).byteValue(), Byte.valueOf(str2.substring(0, 2)).byteValue(), (byte) i, z)), new C10704c(z, str, str2, i));
        return false;
    }

    /* renamed from: l0 */
    public boolean mo23147l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        return mo31719Q1(2, 1);
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        if (i == 1) {
            mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 2, 0)}, new C10710i());
        } else if (i == 5) {
            mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 2, 1)}, new C10711j());
        }
        return false;
    }

    /* renamed from: n */
    public void mo23151n() {
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
        mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 3, Long.valueOf(j))}, new C10719r(j));
        return true;
    }

    /* renamed from: p2 */
    public void mo41898p2() {
        mo31729b2(3, 1, Boolean.FALSE, new C10713l());
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        return false;
    }

    /* renamed from: q2 */
    public void mo41899q2(boolean z) {
        mo31729b2(5, 3, Boolean.valueOf(z), new C10718q(z));
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

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 5, Integer.valueOf(i))}, new C10720s(i));
        return true;
    }

    /* renamed from: s2 */
    public C10337c.C10340c mo41901s2() {
        return mo41903u2().get(Integer.valueOf(mo41904v2().mo41916Z0()));
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        return false;
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        int i2 = this.f19422Q;
        if (i2 == 0) {
            mo31729b2(2, 7, Integer.valueOf(i), new C10705d(i));
        } else if (i2 == 1) {
            if (mo41906y2()) {
                m27307Q2(i);
            } else {
                mo31729b2(3, 1, Boolean.TRUE, new C10706e(i));
            }
        }
        return true;
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        mo31729b2(4, 4, Boolean.valueOf(z), new C10717p(z));
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        DeviceStatusBase v2;
        super.mo23166x(i, obj);
        if (i == 5) {
            mo23169y0();
        } else if (i == 7) {
            mo23131U0();
        } else if (i == 10) {
            C12041e eVar = (C12041e) obj;
            mo23162u1(eVar.mo42678b());
            int i2 = this.f19422Q;
            if (i2 == 0) {
                v2 = mo23221d0();
            } else if (i2 == 1) {
                v2 = mo41904v2();
            }
            v2.mo31577a(eVar);
        } else if (i == 14) {
            mo23141c1();
        }
        return true;
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        if (sVar.mo35458y()) {
            mo23154p1((long) sVar.mo35439f());
        } else if (sVar.mo35419D()) {
            if (sVar.mo35439f() > 1) {
                mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 2, 0), new C8253c(2, 3, Integer.valueOf(sVar.mo35439f())), new C8253c(2, 5, Integer.valueOf(sVar.mo35441h()))}, new C10702a(sVar));
            } else {
                mo23159s1(sVar.mo35441h());
            }
        } else if (sVar.mo35421F()) {
            mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 2, 1), new C8253c(2, 3, Integer.valueOf(sVar.mo35439f()))}, new C10703b(sVar));
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }

    /* renamed from: z2 */
    public void mo41907z2() {
        mo31729b2(3, 1, Boolean.TRUE, new C10712k());
    }
}
