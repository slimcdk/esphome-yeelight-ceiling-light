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
import java.util.HashMap;
import java.util.List;
import p051j4.C9201q;
import p207s3.C10337c;
import p227x3.C11980p;
import p232y3.C12041e;

/* renamed from: w3.b0 */
public class C10650b0 extends C10337c {

    /* renamed from: w3.b0$a */
    class C10651a implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19852a;

        C10651a(int i) {
            this.f19852a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onFailed: ");
            sb.append(this.f19852a);
        }

        public void onSucceed() {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onSucceed: ");
            sb.append(this.f19852a);
            boolean unused = C10650b0.this.f12526y = true;
        }
    }

    /* renamed from: w3.b0$b */
    class C10652b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19854a;

        C10652b(int i) {
            this.f19854a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10650b0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("light setOnFromPower onSucceed: ");
            sb.append(this.f19854a);
            C10650b0.this.mo23221d0().mo31547K0(this.f19854a);
        }
    }

    /* renamed from: w3.b0$c */
    class C10653c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19856a;

        C10653c(int i) {
            this.f19856a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10650b0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("fan setOnFromPower onSucceed: ");
            sb.append(this.f19856a);
            C10650b0.this.mo41904v2().mo31547K0(this.f19856a);
        }
    }

    /* renamed from: w3.b0$d */
    class C10654d implements CompletedHandler {
        C10654d() {
        }

        public void onFailed(IotError iotError) {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON fan onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10650b0.this.f4758v;
            C10650b0.this.mo41904v2().mo31551M0(true);
        }
    }

    /* renamed from: w3.b0$e */
    class C10655e implements CompletedHandler {
        C10655e() {
        }

        public void onFailed(IotError iotError) {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON fan onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10650b0.this.f4758v;
            C10650b0.this.mo41904v2().mo31551M0(false);
        }
    }

    /* renamed from: w3.b0$f */
    class C10656f implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19860a;

        C10656f(int i) {
            this.f19860a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setLevel onFailed: ");
            sb.append(this.f19860a);
        }

        public void onSucceed() {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setLevel onSucceed: ");
            sb.append(this.f19860a);
        }
    }

    /* renamed from: w3.b0$g */
    class C10657g implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ long f19862a;

        C10657g(long j) {
            this.f19862a = j;
        }

        public void onFailed(IotError iotError) {
            String str = C10650b0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10650b0.this.f4758v;
            C10650b0.this.mo23221d0().mo31600l0(this.f19862a);
            boolean unused = C10650b0.this.f12526y = true;
        }
    }

    /* renamed from: w3.b0$h */
    class C10658h implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19864a;

        C10658h(int i) {
            this.f19864a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10650b0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10650b0.this.f4758v;
            C10650b0.this.mo23221d0().mo31561R0(this.f19864a);
            boolean unused = C10650b0.this.f12526y = true;
        }
    }

    /* renamed from: w3.b0$i */
    class C10659i implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19866a;

        C10659i(C8327s sVar) {
            this.f19866a = sVar;
        }

        public void onFailed(IotError iotError) {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setscene ct onFailed: ");
            sb.append(iotError.toString());
        }

        public void onSucceed() {
            String str = C10650b0.this.f4758v;
            C10650b0.this.mo23221d0().mo31610q0(this.f19866a.mo35441h());
            C10650b0.this.mo23221d0().mo31600l0((long) this.f19866a.mo35439f());
        }
    }

    /* renamed from: w3.b0$j */
    class C10660j implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19868a;

        /* renamed from: b */
        final /* synthetic */ String f19869b;

        /* renamed from: c */
        final /* synthetic */ String f19870c;

        /* renamed from: d */
        final /* synthetic */ int f19871d;

        C10660j(boolean z, String str, String str2, int i) {
            this.f19868a = z;
            this.f19869b = str;
            this.f19870c = str2;
            this.f19871d = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableNightTime onFailed: ");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10650b0.this.f4758v;
            C10650b0.this.mo23221d0().mo31543I0(this.f19868a);
            C10650b0.this.mo23221d0().mo31541H0(this.f19869b);
            C10650b0.this.mo23221d0().mo31539G0(this.f19870c);
            C10650b0.this.mo23221d0().mo31537F0(this.f19871d);
        }
    }

    /* renamed from: w3.b0$k */
    class C10661k implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19873a;

        C10661k(int i) {
            this.f19873a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onFailed: ");
            sb.append(this.f19873a);
        }

        public void onSucceed() {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onSucceed: ");
            sb.append(this.f19873a);
            boolean unused = C10650b0.this.f12526y = true;
        }
    }

    /* renamed from: w3.b0$l */
    class C10662l implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19875a;

        C10662l(int i) {
            this.f19875a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10650b0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON fan onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10650b0.this.f4758v;
            C10650b0.this.mo41904v2().mo31551M0(true);
            C10650b0.this.m27136L2(this.f19875a);
        }
    }

    public C10650b0(String str, String str2, String str3, String str4) {
        super(str, str2, str3, 1568, str4);
        HashMap hashMap = new HashMap();
        hashMap.put(0, new C10337c.C10340c(0, 3, R$string.fancl_fan_style_standard));
        mo41892C2(hashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public void m27136L2(int i) {
        mo31729b2(3, 10, Integer.valueOf(i), new C10651a(i));
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        return false;
    }

    /* renamed from: B2 */
    public void mo41891B2(int i) {
    }

    /* renamed from: D2 */
    public void mo41893D2(C10337c.C10340c cVar, int i) {
    }

    /* renamed from: E2 */
    public void mo41894E2(int i) {
        mo31728a2(new C8253c[]{new C8253c(3, 2, Integer.valueOf(i)), new C8253c(3, 1, Boolean.TRUE)}, new C10656f(i));
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_fancl1_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_fancl1_big;
    }

    /* renamed from: I1 */
    public List<Property> mo31712I1() {
        ArrayList arrayList = new ArrayList();
        List<Property> J1 = mo31713J1(2, new int[]{1, 3, 5, 7});
        if (J1 != null) {
            arrayList.addAll(J1);
        }
        List<Property> J12 = mo31713J1(3, new int[]{1, 2, 7, 10});
        if (J12 != null) {
            arrayList.addAll(J12);
        }
        List<Property> J13 = mo31713J1(4, new int[]{1, 2});
        if (J13 != null) {
            arrayList.addAll(J13);
        }
        List<Property> J14 = mo31713J1(5, new int[]{1});
        if (J14 != null) {
            arrayList.addAll(J14);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K2 */
    public void mo42232K2(Long l) {
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
            return new C11980p[]{new C11980p(mo31698M1(), 2, 3, Integer.valueOf(sVar.mo35439f()), mo31714K1(sVar))};
        } else if (!sVar.mo35419D()) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("newSpecAction: bright: ");
            sb.append(sVar.mo35439f());
            if (sVar.mo35439f() > 1) {
                return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.TRUE, mo31714K1(sVar)), new C11980p(mo31698M1(), 2, 5, Integer.valueOf(sVar.mo35441h())), new C11980p(mo31698M1(), 2, 3, Integer.valueOf(sVar.mo35439f()))};
            }
            return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.TRUE, mo31714K1(sVar)), new C11980p(mo31698M1(), 2, 5, Integer.valueOf(sVar.mo35441h()))};
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
        DeviceStatusBase deviceStatusBase;
        DeviceStatusBase deviceStatusBase2;
        int i3;
        C12041e eVar;
        DeviceStatusBase deviceStatusBase3;
        DeviceStatusBase deviceStatusBase4;
        if (obj != null) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5 && i2 == 1) {
                            deviceStatusBase4 = mo41904v2();
                        } else {
                            return;
                        }
                    } else if (i2 == 1) {
                        deviceStatusBase4 = mo23221d0();
                    } else if (i2 == 2) {
                        mo42232K2((Long) obj);
                        return;
                    } else {
                        return;
                    }
                    deviceStatusBase4.mo31547K0(((Integer) obj).intValue());
                    return;
                } else if (i2 == 1) {
                    deviceStatusBase = mo41904v2();
                    deviceStatusBase.mo31551M0(((Boolean) obj).booleanValue());
                    return;
                } else if (i2 == 2) {
                    Integer num = (Integer) obj;
                    mo41904v2().mo41917a1(num.intValue());
                    mo41903u2().get(0).mo41915f(num.intValue());
                    return;
                } else if (i2 == 7) {
                    mo41904v2().mo41918b1(((Integer) obj).intValue());
                    return;
                } else if (i2 == 10) {
                    i3 = ((Integer) obj).intValue();
                    if (mo41904v2().mo31611r(2) == null) {
                        deviceStatusBase3 = mo41904v2();
                        eVar = new C12041e(i3, i3);
                    } else {
                        deviceStatusBase2 = mo41904v2();
                        deviceStatusBase2.mo31573X0(i3);
                        return;
                    }
                } else {
                    return;
                }
            } else if (i2 == 1) {
                deviceStatusBase = mo23221d0();
                deviceStatusBase.mo31551M0(((Boolean) obj).booleanValue());
                return;
            } else if (i2 == 3) {
                mo23221d0().mo31600l0((long) ((Integer) obj).intValue());
                return;
            } else if (i2 == 5) {
                mo23221d0().mo31610q0(((Integer) obj).intValue());
                return;
            } else if (i2 == 7) {
                i3 = ((Integer) obj).intValue();
                if (mo23221d0().mo31611r(2) == null) {
                    deviceStatusBase3 = mo23221d0();
                    eVar = new C12041e(i3, i3);
                } else {
                    deviceStatusBase2 = mo23221d0();
                    deviceStatusBase2.mo31573X0(i3);
                    return;
                }
            } else {
                return;
            }
            deviceStatusBase3.mo31577a(eVar);
        }
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
            completedHandler = new C10652b(i);
        } else {
            i2 = 5;
            num = Integer.valueOf(i);
            completedHandler = new C10653c(i);
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
        mo31729b2(4, 2, Long.valueOf(C9201q.m22192d(Byte.valueOf(str.substring(0, 2)).byteValue(), Byte.valueOf(str2.substring(0, 2)).byteValue(), (byte) i, z)), new C10660j(z, str, str2, i));
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
        if (i != 1) {
            return false;
        }
        mo31719Q1(2, 1);
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
        mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 3, Long.valueOf(j))}, new C10657g(j));
        return true;
    }

    /* renamed from: p2 */
    public void mo41898p2() {
        mo31729b2(3, 1, Boolean.FALSE, new C10655e());
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        return false;
    }

    /* renamed from: q2 */
    public void mo41899q2(boolean z) {
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
        mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 5, Integer.valueOf(i))}, new C10658h(i));
        return true;
    }

    /* renamed from: s2 */
    public C10337c.C10340c mo41901s2() {
        return mo41903u2().get(0);
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        return false;
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        int i2 = this.f19422Q;
        if (i2 == 0) {
            mo31729b2(2, 7, Integer.valueOf(i), new C10661k(i));
        } else if (i2 == 1) {
            if (mo41906y2()) {
                m27136L2(i);
            } else {
                mo31729b2(3, 1, Boolean.TRUE, new C10662l(i));
            }
        }
        return true;
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
                mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 3, Integer.valueOf(sVar.mo35439f())), new C8253c(2, 5, Integer.valueOf(sVar.mo35441h()))}, new C10659i(sVar));
            } else {
                mo23159s1(sVar.mo35441h());
            }
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }

    /* renamed from: z2 */
    public void mo41907z2() {
        mo31729b2(3, 1, Boolean.TRUE, new C10654d());
    }
}
