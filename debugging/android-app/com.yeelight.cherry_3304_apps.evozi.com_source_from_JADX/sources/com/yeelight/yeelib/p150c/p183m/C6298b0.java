package com.yeelight.yeelib.p150c.p183m;

import com.miot.service.manager.timer.TimerCodec;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.handler.CompletedHandler;
import com.p146mi.iot.common.instance.Property;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7638m0;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.device.xiaomi.base.C9765c;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6033g;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.utils.C10555s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yeelight.yeelib.c.m.b0 */
public class C6298b0 extends C6033g {

    /* renamed from: com.yeelight.yeelib.c.m.b0$a */
    class C6299a implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13312a;

        C6299a(C9856y yVar) {
            this.f13312a = yVar;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
            "setscene ct onFailed: " + iotError.toString();
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            C6298b0.this.mo23408d0().mo27707p0(this.f13312a.mo31876h());
            C6298b0.this.mo23408d0().mo27697k0((long) this.f13312a.mo31874f());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$b */
    class C6300b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13314a;

        C6300b(C9856y yVar) {
            this.f13314a = yVar;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            C6298b0.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
            C6298b0.this.mo23408d0().mo27697k0((long) this.f13314a.mo31874f());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$c */
    class C6301c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13316a;

        /* renamed from: b */
        final /* synthetic */ String f13317b;

        /* renamed from: c */
        final /* synthetic */ String f13318c;

        /* renamed from: d */
        final /* synthetic */ int f13319d;

        C6301c(boolean z, String str, String str2, int i) {
            this.f13316a = z;
            this.f13317b = str;
            this.f13318c = str2;
            this.f13319d = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
            "enableNightTime onFailed: " + iotError;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            C6298b0.this.mo23408d0().mo27640G0(this.f13316a);
            C6298b0.this.mo23408d0().mo27638F0(this.f13317b);
            C6298b0.this.mo23408d0().mo27636E0(this.f13318c);
            C6298b0.this.mo23408d0().mo27634D0(this.f13319d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$d */
    class C6302d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13321a;

        C6302d(int i) {
            this.f13321a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
            "setDelayOff onFailed: " + this.f13321a;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            "setDelayOff onSucceed: " + this.f13321a;
            boolean unused = C6298b0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$e */
    class C6303e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13323a;

        C6303e(int i) {
            this.f13323a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
            "PROPERTY_ON fan onFailed: true" + iotError;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            C6298b0.this.mo27756v2().mo27648K0(true);
            C6298b0.this.m18979Q2(this.f13323a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$f */
    class C6304f implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13325a;

        C6304f(int i) {
            this.f13325a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
            "setDelayOff onFailed: " + this.f13325a;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            "setDelayOff onSucceed: " + this.f13325a;
            boolean unused = C6298b0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$g */
    class C6305g implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13327a;

        C6305g(int i) {
            this.f13327a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            "light setOnFromPower onSucceed: " + this.f13327a;
            C6298b0.this.mo23408d0().mo27644I0(this.f13327a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$h */
    class C6306h implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13329a;

        C6306h(int i) {
            this.f13329a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            "fan setOnFromPower onSucceed: " + this.f13329a;
            C6298b0.this.mo27756v2().mo27644I0(this.f13329a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$i */
    class C6307i implements CompletedHandler {
        C6307i() {
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            C6298b0.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
            boolean unused = C6298b0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$j */
    class C6308j implements CompletedHandler {
        C6308j() {
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            C6298b0.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$k */
    class C6309k implements CompletedHandler {
        C6309k() {
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
            "PROPERTY_ON fan onFailed: true" + iotError;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            C6298b0.this.mo27756v2().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$l */
    class C6310l implements CompletedHandler {
        C6310l() {
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
            "PROPERTY_ON fan onFailed: true" + iotError;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            C6298b0.this.mo27756v2().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$m */
    class C6311m implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13335a;

        C6311m(int i) {
            this.f13335a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
            "setLevel onFailed: " + this.f13335a;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            "setLevel onSucceed: " + this.f13335a;
            boolean unused = C6298b0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$n */
    class C6312n implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13337a;

        C6312n(int i) {
            this.f13337a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
            "setFanSpeed onFailed: " + this.f13337a;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            "setFanSpeed onSucceed: " + this.f13337a;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$o */
    class C6313o implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13339a;

        C6313o(int i) {
            this.f13339a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
            "setFanMode onFailed mode: " + this.f13339a;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            "setFanMode onSucceed mode: " + this.f13339a;
            C6298b0.this.mo27756v2().mo27770Z0(this.f13339a);
            boolean unused = C6298b0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$p */
    class C6314p implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13341a;

        C6314p(boolean z) {
            this.f13341a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
            "enableFlexSwitch onFailed: " + this.f13341a;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            "enableFlexSwitch onFailed: " + this.f13341a;
            boolean unused = C6298b0.this.f12867y = true;
            C6298b0.this.mo23408d0().mo27696k(this.f13341a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$q */
    class C6315q implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13343a;

        C6315q(boolean z) {
            this.f13343a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
            "enableFanFlexSwitch onFailed: " + this.f13343a;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            "enableFanFlexSwitch onFailed: " + this.f13343a;
            boolean unused = C6298b0.this.f12867y = true;
            C6298b0.this.mo27756v2().mo27696k(this.f13343a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$r */
    class C6316r implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ long f13345a;

        C6316r(long j) {
            this.f13345a = j;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            C6298b0.this.mo23408d0().mo27697k0(this.f13345a);
            boolean unused = C6298b0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b0$s */
    class C6317s implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13347a;

        C6317s(int i) {
            this.f13347a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6298b0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6298b0.this.f7260v;
            C6298b0.this.mo23408d0().mo27658P0(this.f13347a);
            boolean unused = C6298b0.this.f12867y = true;
        }
    }

    public C6298b0(String str, String str2, String str3, String str4) {
        super(str, str2, str3, 1634, str4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, new C6033g.C6036c(0, 100, R$string.fancl_fan_style_standard, 1));
        linkedHashMap.put(1, new C6033g.C6036c(1, 3, R$string.fancl_fan_style_nature));
        linkedHashMap.put(2, new C6033g.C6036c(2, 3, R$string.fancl_fan_style_loop, true));
        linkedHashMap.put(5, new C6033g.C6036c(5, 3, R$string.fancl_fan_style_sleep));
        mo27744C2(linkedHashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public void m18979Q2(int i) {
        mo27843b2(3, 11, Integer.valueOf(i), new C6304f(i));
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        return false;
    }

    /* renamed from: B2 */
    public void mo27743B2(int i) {
        mo27843b2(3, 7, Integer.valueOf(i), new C6313o(i));
    }

    /* renamed from: D2 */
    public void mo27745D2(C6033g.C6036c cVar, int i) {
        mo27842a2(new C9765c[]{new C9765c(5, 4, Integer.valueOf(i)), new C9765c(3, 1, Boolean.TRUE)}, new C6312n(i));
    }

    /* renamed from: E2 */
    public void mo27746E2(int i) {
        mo27842a2(new C9765c[]{new C9765c(3, 2, Integer.valueOf(i)), new C9765c(3, 1, Boolean.TRUE)}, new C6311m(i));
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_fancl2_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_fancl2_big;
    }

    /* renamed from: I1 */
    public List<Property> mo27826I1() {
        ArrayList arrayList = new ArrayList();
        List<Property> J1 = mo27827J1(2, new int[]{1, 3, 2, 5, 8});
        if (J1 != null) {
            arrayList.addAll(J1);
        }
        List<Property> J12 = mo27827J1(3, new int[]{1, 2, 7, 12});
        if (J12 != null) {
            arrayList.addAll(J12);
        }
        List<Property> J13 = mo27827J1(4, new int[]{1, 2, 4});
        if (J13 != null) {
            arrayList.addAll(J13);
        }
        List<Property> J14 = mo27827J1(5, new int[]{1, 2, 4, 3});
        if (J14 != null) {
            arrayList.addAll(J14);
        }
        return arrayList;
    }

    /* renamed from: L1 */
    public List<YeelightTimer> mo27829L1() {
        List<YeelightTimer> list = (List) mo23408d0().mo27710r(1);
        ArrayList arrayList = new ArrayList();
        int i = this.f12821H == 0 ? 2 : 3;
        if (list != null) {
            for (YeelightTimer yeelightTimer : list) {
                if ((yeelightTimer.mo29034j() != null && yeelightTimer.mo29034j().length > 0 && yeelightTimer.mo29034j()[0].mo29085c() == i) || (yeelightTimer.mo29029c() != null && yeelightTimer.mo29029c().length > 0 && yeelightTimer.mo29029c()[0].mo29085c() == i)) {
                    arrayList.add(yeelightTimer);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: N1 */
    public C7638m0[] mo27830N1(C9856y yVar) {
        if (yVar == null) {
            return null;
        }
        if (yVar.mo31893y()) {
            return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.TRUE, mo27828K1(yVar)), new C7638m0(mo27788M1(), 2, 3, Integer.valueOf(yVar.mo31874f()))};
        } else if (yVar.mo31855D()) {
            "newSpecAction: bright: " + yVar.mo31874f();
            if (yVar.mo31874f() > 1) {
                return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.TRUE), new C7638m0(mo27788M1(), 2, 2, 0), new C7638m0(mo27788M1(), 2, 5, Integer.valueOf(yVar.mo31876h())), new C7638m0(mo27788M1(), 2, 3, Integer.valueOf(yVar.mo31874f()))};
            }
            return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.TRUE, mo27828K1(yVar)), new C7638m0(mo27788M1(), 2, 2, 0), new C7638m0(mo27788M1(), 2, 5, Integer.valueOf(yVar.mo31876h()))};
        } else if (!yVar.mo31857F()) {
            return null;
        } else {
            return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.TRUE, mo27828K1(yVar)), new C7638m0(mo27788M1(), 2, 2, 1), new C7638m0(mo27788M1(), 2, 3, Integer.valueOf(yVar.mo31874f()))};
        }
    }

    /* renamed from: O1 */
    public C7638m0[] mo27831O1(boolean z) {
        if (this.f12821H == 0) {
            return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.valueOf(z))};
        }
        return new C7638m0[]{new C7638m0(mo27788M1(), 3, 1, Boolean.valueOf(z))};
    }

    /* renamed from: P1 */
    public void mo27832P1(int i, int i2, Object obj) {
        C6024e d0;
        C6024e.C6028d dVar;
        int intValue;
        C6024e d02;
        C6024e d03;
        C7554e eVar;
        C6024e eVar2;
        C6024e eVar3;
        if (obj != null) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (i2 == 1) {
                                eVar2 = mo27756v2();
                                eVar2.mo27644I0(((Integer) obj).intValue());
                                return;
                            } else if (i2 == 2) {
                                byte[] g = C10555s.m25796g(((Integer) obj).intValue());
                                Map<Integer, C6033g.C6036c> u2 = mo27755u2();
                                u2.get(1).mo27767f(g[1]);
                                u2.get(2).mo27767f(g[2]);
                                u2.get(5).mo27767f(g[3]);
                                return;
                            } else if (i2 == 3) {
                                eVar3 = mo27756v2();
                            } else if (i2 == 4) {
                                mo27755u2().get(0).mo27767f(((Integer) obj).intValue());
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (i2 == 1) {
                        eVar2 = mo23408d0();
                        eVar2.mo27644I0(((Integer) obj).intValue());
                        return;
                    } else if (i2 == 2) {
                        mo28119P2((Long) obj);
                        return;
                    } else if (i2 == 4) {
                        eVar3 = mo23408d0();
                    } else {
                        return;
                    }
                    eVar3.mo27696k(((Boolean) obj).booleanValue());
                    return;
                } else if (i2 == 1) {
                    d0 = mo27756v2();
                    d0.mo27648K0(((Boolean) obj).booleanValue());
                    return;
                } else if (i2 == 2) {
                    mo27756v2().mo27769Y0(((Integer) obj).intValue());
                    return;
                } else if (i2 == 7) {
                    mo27756v2().mo27770Z0(((Integer) obj).intValue());
                    return;
                } else if (i2 == 12) {
                    intValue = ((Integer) obj).intValue();
                    if (mo27756v2().mo27710r(2) == null) {
                        d03 = mo27756v2();
                        eVar = new C7554e(intValue, intValue);
                    } else {
                        d02 = mo27756v2();
                        d02.mo27670V0(intValue);
                        return;
                    }
                } else {
                    return;
                }
            } else if (i2 == 1) {
                d0 = mo23408d0();
                d0.mo27648K0(((Boolean) obj).booleanValue());
                return;
            } else if (i2 == 2) {
                int intValue2 = ((Integer) obj).intValue();
                if (intValue2 == 0) {
                    dVar = C6024e.C6028d.DEVICE_MODE_SUNSHINE;
                } else if (intValue2 == 1) {
                    dVar = C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT;
                } else {
                    return;
                }
                mo23352w1(dVar);
                return;
            } else if (i2 == 3) {
                Integer num = (Integer) obj;
                mo23408d0().mo27697k0((long) num.intValue());
                mo23408d0().mo27642H0((long) num.intValue());
                return;
            } else if (i2 == 5) {
                mo23408d0().mo27707p0(((Integer) obj).intValue());
                return;
            } else if (i2 == 8) {
                intValue = ((Integer) obj).intValue();
                if (mo23408d0().mo27710r(2) == null) {
                    d03 = mo23408d0();
                    eVar = new C7554e(intValue, intValue);
                } else {
                    d02 = mo23408d0();
                    d02.mo27670V0(intValue);
                    return;
                }
            } else {
                return;
            }
            d03.mo27676a(eVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public void mo28119P2(Long l) {
        Object obj;
        Object obj2;
        byte[] h = C10555s.m25797h(l == null ? 0 : l.longValue());
        C6024e d0 = mo23408d0();
        boolean z = true;
        if (h[5] != 1) {
            z = false;
        }
        d0.mo27640G0(z);
        byte b = h[0];
        C6024e d02 = mo23408d0();
        StringBuilder sb = new StringBuilder();
        if (b < 10) {
            obj = TimerCodec.DISENABLE + b;
        } else {
            obj = Byte.valueOf(b);
        }
        sb.append(obj);
        sb.append("0000");
        d02.mo27638F0(sb.toString());
        byte b2 = h[2];
        C6024e d03 = mo23408d0();
        StringBuilder sb2 = new StringBuilder();
        if (b2 < 10) {
            obj2 = TimerCodec.DISENABLE + b2;
        } else {
            obj2 = Byte.valueOf(b2);
        }
        sb2.append(obj2);
        sb2.append("0000");
        d03.mo27636E0(sb2.toString());
        mo23408d0().mo27634D0(h[4]);
    }

    /* renamed from: V */
    public boolean mo23398V() {
        return this.f12821H == 0 ? super.mo23398V() : this.f12820G.mo27641H() == 1;
    }

    /* renamed from: Y1 */
    public boolean mo27840Y1(int i) {
        CompletedHandler completedHandler;
        Integer num;
        int i2;
        if (this.f12821H == 0) {
            i2 = 4;
            num = Integer.valueOf(i == 1 ? 1 : 2);
            completedHandler = new C6305g(i);
        } else {
            i2 = 5;
            num = Integer.valueOf(i);
            completedHandler = new C6306h(i);
        }
        mo27843b2(i2, 1, num, completedHandler);
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        return mo27821C1(2, 1);
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
        return false;
    }

    /* renamed from: g0 */
    public int mo23329g0() {
        return 0;
    }

    /* renamed from: g1 */
    public boolean mo23431g1(boolean z, String str, String str2, int i) {
        mo27843b2(4, 2, Long.valueOf(C10555s.m25793d(Byte.valueOf(str.substring(0, 2)).byteValue(), Byte.valueOf(str2.substring(0, 2)).byteValue(), (byte) i, z)), new C6301c(z, str, str2, i));
        return false;
    }

    /* renamed from: l0 */
    public boolean mo23333l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        return mo27833Q1(2, 1);
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        if (i == 1) {
            mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 2, 0)}, new C6307i());
        } else if (i == 5) {
            mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 2, 1)}, new C6308j());
        }
        return false;
    }

    /* renamed from: n */
    public void mo23337n() {
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
        mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 3, Long.valueOf(j))}, new C6316r(j));
        return true;
    }

    /* renamed from: p2 */
    public void mo27750p2() {
        mo27843b2(3, 1, Boolean.FALSE, new C6310l());
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        return false;
    }

    /* renamed from: q2 */
    public void mo27751q2(boolean z) {
        mo27843b2(5, 3, Boolean.valueOf(z), new C6315q(z));
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

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 5, Integer.valueOf(i))}, new C6317s(i));
        return true;
    }

    /* renamed from: s2 */
    public C6033g.C6036c mo27753s2() {
        return mo27755u2().get(Integer.valueOf(mo27756v2().mo27768X0()));
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        return false;
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        int i2 = this.f12821H;
        if (i2 == 0) {
            mo27843b2(2, 7, Integer.valueOf(i), new C6302d(i));
        } else if (i2 == 1) {
            if (mo27758y2()) {
                m18979Q2(i);
            } else {
                mo27843b2(3, 1, Boolean.TRUE, new C6303e(i));
            }
        }
        return true;
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
        mo27843b2(4, 4, Boolean.valueOf(z), new C6314p(z));
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        C6024e v2;
        super.mo23353x(i, obj);
        if (i == 5) {
            mo23356y0();
        } else if (i == 7) {
            mo23317U0();
        } else if (i == 10) {
            C7554e eVar = (C7554e) obj;
            mo23348u1(eVar.mo28881b());
            int i2 = this.f12821H;
            if (i2 == 0) {
                v2 = mo23408d0();
            } else if (i2 == 1) {
                v2 = mo27756v2();
            }
            v2.mo27676a(eVar);
        } else if (i == 14) {
            mo23327c1();
        }
        return true;
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        if (yVar.mo31893y()) {
            mo23340p1((long) yVar.mo31874f());
        } else if (yVar.mo31855D()) {
            if (yVar.mo31874f() > 1) {
                mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 2, 0), new C9765c(2, 3, Integer.valueOf(yVar.mo31874f())), new C9765c(2, 5, Integer.valueOf(yVar.mo31876h()))}, new C6299a(yVar));
            } else {
                mo23345s1(yVar.mo31876h());
            }
        } else if (yVar.mo31857F()) {
            mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 2, 1), new C9765c(2, 3, Integer.valueOf(yVar.mo31874f()))}, new C6300b(yVar));
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }

    /* renamed from: z2 */
    public void mo27759z2() {
        mo27843b2(3, 1, Boolean.TRUE, new C6309k());
    }
}
