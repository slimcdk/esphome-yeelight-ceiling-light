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
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yeelight.yeelib.c.m.a0 */
public class C6256a0 extends C6033g {

    /* renamed from: com.yeelight.yeelib.c.m.a0$a */
    class C6257a implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13244a;

        C6257a(int i) {
            this.f13244a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6256a0.this.f7260v;
            "setDelayOff onFailed: " + this.f13244a;
        }

        public void onSucceed() {
            String str = C6256a0.this.f7260v;
            "setDelayOff onSucceed: " + this.f13244a;
            boolean unused = C6256a0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a0$b */
    class C6258b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13246a;

        C6258b(int i) {
            this.f13246a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6256a0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6256a0.this.f7260v;
            "light setOnFromPower onSucceed: " + this.f13246a;
            C6256a0.this.mo23408d0().mo27644I0(this.f13246a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a0$c */
    class C6259c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13248a;

        C6259c(int i) {
            this.f13248a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6256a0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6256a0.this.f7260v;
            "fan setOnFromPower onSucceed: " + this.f13248a;
            C6256a0.this.mo27756v2().mo27644I0(this.f13248a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a0$d */
    class C6260d implements CompletedHandler {
        C6260d() {
        }

        public void onFailed(IotError iotError) {
            String str = C6256a0.this.f7260v;
            "PROPERTY_ON fan onFailed: true" + iotError;
        }

        public void onSucceed() {
            String str = C6256a0.this.f7260v;
            C6256a0.this.mo27756v2().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a0$e */
    class C6261e implements CompletedHandler {
        C6261e() {
        }

        public void onFailed(IotError iotError) {
            String str = C6256a0.this.f7260v;
            "PROPERTY_ON fan onFailed: true" + iotError;
        }

        public void onSucceed() {
            String str = C6256a0.this.f7260v;
            C6256a0.this.mo27756v2().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a0$f */
    class C6262f implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13252a;

        C6262f(int i) {
            this.f13252a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6256a0.this.f7260v;
            "setLevel onFailed: " + this.f13252a;
        }

        public void onSucceed() {
            String str = C6256a0.this.f7260v;
            "setLevel onSucceed: " + this.f13252a;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a0$g */
    class C6263g implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ long f13254a;

        C6263g(long j) {
            this.f13254a = j;
        }

        public void onFailed(IotError iotError) {
            String str = C6256a0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6256a0.this.f7260v;
            C6256a0.this.mo23408d0().mo27697k0(this.f13254a);
            boolean unused = C6256a0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a0$h */
    class C6264h implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13256a;

        C6264h(int i) {
            this.f13256a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6256a0.this.f7260v;
        }

        public void onSucceed() {
            String str = C6256a0.this.f7260v;
            C6256a0.this.mo23408d0().mo27658P0(this.f13256a);
            boolean unused = C6256a0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a0$i */
    class C6265i implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13258a;

        C6265i(C9856y yVar) {
            this.f13258a = yVar;
        }

        public void onFailed(IotError iotError) {
            String str = C6256a0.this.f7260v;
            "setscene ct onFailed: " + iotError.toString();
        }

        public void onSucceed() {
            String str = C6256a0.this.f7260v;
            C6256a0.this.mo23408d0().mo27707p0(this.f13258a.mo31876h());
            C6256a0.this.mo23408d0().mo27697k0((long) this.f13258a.mo31874f());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a0$j */
    class C6266j implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13260a;

        /* renamed from: b */
        final /* synthetic */ String f13261b;

        /* renamed from: c */
        final /* synthetic */ String f13262c;

        /* renamed from: d */
        final /* synthetic */ int f13263d;

        C6266j(boolean z, String str, String str2, int i) {
            this.f13260a = z;
            this.f13261b = str;
            this.f13262c = str2;
            this.f13263d = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6256a0.this.f7260v;
            "enableNightTime onFailed: " + iotError;
        }

        public void onSucceed() {
            String str = C6256a0.this.f7260v;
            C6256a0.this.mo23408d0().mo27640G0(this.f13260a);
            C6256a0.this.mo23408d0().mo27638F0(this.f13261b);
            C6256a0.this.mo23408d0().mo27636E0(this.f13262c);
            C6256a0.this.mo23408d0().mo27634D0(this.f13263d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a0$k */
    class C6267k implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13265a;

        C6267k(int i) {
            this.f13265a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6256a0.this.f7260v;
            "setDelayOff onFailed: " + this.f13265a;
        }

        public void onSucceed() {
            String str = C6256a0.this.f7260v;
            "setDelayOff onSucceed: " + this.f13265a;
            boolean unused = C6256a0.this.f12867y = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a0$l */
    class C6268l implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f13267a;

        C6268l(int i) {
            this.f13267a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6256a0.this.f7260v;
            "PROPERTY_ON fan onFailed: true" + iotError;
        }

        public void onSucceed() {
            String str = C6256a0.this.f7260v;
            C6256a0.this.mo27756v2().mo27648K0(true);
            C6256a0.this.m18839L2(this.f13267a);
        }
    }

    public C6256a0(String str, String str2, String str3, String str4) {
        super(str, str2, str3, 1568, str4);
        HashMap hashMap = new HashMap();
        hashMap.put(0, new C6033g.C6036c(0, 3, R$string.fancl_fan_style_standard));
        mo27744C2(hashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public void m18839L2(int i) {
        mo27843b2(3, 10, Integer.valueOf(i), new C6257a(i));
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        return false;
    }

    /* renamed from: B2 */
    public void mo27743B2(int i) {
    }

    /* renamed from: D2 */
    public void mo27745D2(C6033g.C6036c cVar, int i) {
    }

    /* renamed from: E2 */
    public void mo27746E2(int i) {
        mo27842a2(new C9765c[]{new C9765c(3, 2, Integer.valueOf(i)), new C9765c(3, 1, Boolean.TRUE)}, new C6262f(i));
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_fancl1_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_fancl1_big;
    }

    /* renamed from: I1 */
    public List<Property> mo27826I1() {
        ArrayList arrayList = new ArrayList();
        List<Property> J1 = mo27827J1(2, new int[]{1, 3, 5, 7});
        if (J1 != null) {
            arrayList.addAll(J1);
        }
        List<Property> J12 = mo27827J1(3, new int[]{1, 2, 7, 10});
        if (J12 != null) {
            arrayList.addAll(J12);
        }
        List<Property> J13 = mo27827J1(4, new int[]{1, 2});
        if (J13 != null) {
            arrayList.addAll(J13);
        }
        List<Property> J14 = mo27827J1(5, new int[]{1});
        if (J14 != null) {
            arrayList.addAll(J14);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K2 */
    public void mo28101K2(Long l) {
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
            return new C7638m0[]{new C7638m0(mo27788M1(), 2, 3, Integer.valueOf(yVar.mo31874f()), mo27828K1(yVar))};
        } else if (!yVar.mo31855D()) {
            return null;
        } else {
            "newSpecAction: bright: " + yVar.mo31874f();
            if (yVar.mo31874f() > 1) {
                return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.TRUE, mo27828K1(yVar)), new C7638m0(mo27788M1(), 2, 5, Integer.valueOf(yVar.mo31876h())), new C7638m0(mo27788M1(), 2, 3, Integer.valueOf(yVar.mo31874f()))};
            }
            return new C7638m0[]{new C7638m0(mo27788M1(), 2, 1, Boolean.TRUE, mo27828K1(yVar)), new C7638m0(mo27788M1(), 2, 5, Integer.valueOf(yVar.mo31876h()))};
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
        C6024e eVar;
        C6024e eVar2;
        int i3;
        C7554e eVar3;
        C6024e eVar4;
        C6024e eVar5;
        if (obj != null) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5 && i2 == 1) {
                            eVar5 = mo27756v2();
                        } else {
                            return;
                        }
                    } else if (i2 == 1) {
                        eVar5 = mo23408d0();
                    } else if (i2 == 2) {
                        mo28101K2((Long) obj);
                        return;
                    } else {
                        return;
                    }
                    eVar5.mo27644I0(((Integer) obj).intValue());
                    return;
                } else if (i2 == 1) {
                    eVar = mo27756v2();
                    eVar.mo27648K0(((Boolean) obj).booleanValue());
                    return;
                } else if (i2 == 2) {
                    Integer num = (Integer) obj;
                    mo27756v2().mo27769Y0(num.intValue());
                    mo27755u2().get(0).mo27767f(num.intValue());
                    return;
                } else if (i2 == 7) {
                    mo27756v2().mo27770Z0(((Integer) obj).intValue());
                    return;
                } else if (i2 == 10) {
                    i3 = ((Integer) obj).intValue();
                    if (mo27756v2().mo27710r(2) == null) {
                        eVar4 = mo27756v2();
                        eVar3 = new C7554e(i3, i3);
                    } else {
                        eVar2 = mo27756v2();
                        eVar2.mo27670V0(i3);
                        return;
                    }
                } else {
                    return;
                }
            } else if (i2 == 1) {
                eVar = mo23408d0();
                eVar.mo27648K0(((Boolean) obj).booleanValue());
                return;
            } else if (i2 == 3) {
                mo23408d0().mo27697k0((long) ((Integer) obj).intValue());
                return;
            } else if (i2 == 5) {
                mo23408d0().mo27707p0(((Integer) obj).intValue());
                return;
            } else if (i2 == 7) {
                i3 = ((Integer) obj).intValue();
                if (mo23408d0().mo27710r(2) == null) {
                    eVar4 = mo23408d0();
                    eVar3 = new C7554e(i3, i3);
                } else {
                    eVar2 = mo23408d0();
                    eVar2.mo27670V0(i3);
                    return;
                }
            } else {
                return;
            }
            eVar4.mo27676a(eVar3);
        }
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
            completedHandler = new C6258b(i);
        } else {
            i2 = 5;
            num = Integer.valueOf(i);
            completedHandler = new C6259c(i);
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
        mo27843b2(4, 2, Long.valueOf(C10555s.m25793d(Byte.valueOf(str.substring(0, 2)).byteValue(), Byte.valueOf(str2.substring(0, 2)).byteValue(), (byte) i, z)), new C6266j(z, str, str2, i));
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
        if (i != 1) {
            return false;
        }
        mo27833Q1(2, 1);
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
        mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 3, Long.valueOf(j))}, new C6263g(j));
        return true;
    }

    /* renamed from: p2 */
    public void mo27750p2() {
        mo27843b2(3, 1, Boolean.FALSE, new C6261e());
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        return false;
    }

    /* renamed from: q2 */
    public void mo27751q2(boolean z) {
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
        mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 5, Integer.valueOf(i))}, new C6264h(i));
        return true;
    }

    /* renamed from: s2 */
    public C6033g.C6036c mo27753s2() {
        return mo27755u2().get(0);
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        return false;
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        int i2 = this.f12821H;
        if (i2 == 0) {
            mo27843b2(2, 7, Integer.valueOf(i), new C6267k(i));
        } else if (i2 == 1) {
            if (mo27758y2()) {
                m18839L2(i);
            } else {
                mo27843b2(3, 1, Boolean.TRUE, new C6268l(i));
            }
        }
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
                mo27842a2(new C9765c[]{new C9765c(2, 1, Boolean.TRUE), new C9765c(2, 3, Integer.valueOf(yVar.mo31874f())), new C9765c(2, 5, Integer.valueOf(yVar.mo31876h()))}, new C6265i(yVar));
            } else {
                mo23345s1(yVar.mo31876h());
            }
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }

    /* renamed from: z2 */
    public void mo27759z2() {
        mo27843b2(3, 1, Boolean.TRUE, new C6260d());
    }
}
