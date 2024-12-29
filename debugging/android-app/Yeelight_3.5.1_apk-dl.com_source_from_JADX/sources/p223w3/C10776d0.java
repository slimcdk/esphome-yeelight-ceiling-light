package p223w3;

import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.p022mi.iot.common.instance.Property;
import com.xiaomi.mipush.sdk.Constants;
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
import p207s3.C10337c;
import p227x3.C11980p;
import p232y3.C12041e;

/* renamed from: w3.d0 */
public class C10776d0 extends C10337c {

    /* renamed from: w3.d0$a */
    class C10777a implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20042a;

        C10777a(int i) {
            this.f20042a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            C10776d0.this.mo23221d0().mo31561R0(this.f20042a);
            boolean unused = C10776d0.this.f12526y = true;
        }
    }

    /* renamed from: w3.d0$b */
    class C10778b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20044a;

        C10778b(C8327s sVar) {
            this.f20044a = sVar;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setscene ct onFailed: ");
            sb.append(iotError.toString());
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            C10776d0.this.mo23221d0().mo31610q0(this.f20044a.mo35441h());
            C10776d0.this.mo23221d0().mo31600l0((long) this.f20044a.mo35439f());
        }
    }

    /* renamed from: w3.d0$c */
    class C10779c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20046a;

        C10779c(C8327s sVar) {
            this.f20046a = sVar;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            C10776d0.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
            C10776d0.this.mo23221d0().mo31600l0((long) this.f20046a.mo35439f());
        }
    }

    /* renamed from: w3.d0$d */
    class C10780d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20048a;

        /* renamed from: b */
        final /* synthetic */ String f20049b;

        /* renamed from: c */
        final /* synthetic */ String f20050c;

        /* renamed from: d */
        final /* synthetic */ int f20051d;

        C10780d(boolean z, String str, String str2, int i) {
            this.f20048a = z;
            this.f20049b = str;
            this.f20050c = str2;
            this.f20051d = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableNightTime onFailed: ");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            C10776d0.this.mo23221d0().mo31543I0(this.f20048a);
            C10776d0.this.mo23221d0().mo31541H0(this.f20049b);
            C10776d0.this.mo23221d0().mo31539G0(this.f20050c);
            C10776d0.this.mo23221d0().mo31537F0(this.f20051d);
        }
    }

    /* renamed from: w3.d0$e */
    class C10781e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20053a;

        C10781e(int i) {
            this.f20053a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onFailed: ");
            sb.append(this.f20053a);
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onSucceed: ");
            sb.append(this.f20053a);
            boolean unused = C10776d0.this.f12526y = true;
        }
    }

    /* renamed from: w3.d0$f */
    class C10782f implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20055a;

        C10782f(int i) {
            this.f20055a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON fan onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            C10776d0.this.mo41904v2().mo31551M0(true);
            C10776d0.this.m27478S2(this.f20055a);
        }
    }

    /* renamed from: w3.d0$g */
    class C10783g implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20057a;

        C10783g(int i) {
            this.f20057a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onFailed: ");
            sb.append(this.f20057a);
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onSucceed: ");
            sb.append(this.f20057a);
            boolean unused = C10776d0.this.f12526y = true;
        }
    }

    /* renamed from: w3.d0$h */
    class C10784h implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20059a;

        C10784h(int i) {
            this.f20059a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("light setOnFromPower onSucceed: ");
            sb.append(this.f20059a);
            C10776d0.this.mo23221d0().mo31547K0(this.f20059a);
        }
    }

    /* renamed from: w3.d0$i */
    class C10785i implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20061a;

        C10785i(int i) {
            this.f20061a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("fan setOnFromPower onSucceed: ");
            sb.append(this.f20061a);
            C10776d0.this.mo41904v2().mo31547K0(this.f20061a);
        }
    }

    /* renamed from: w3.d0$j */
    class C10786j implements CompletedHandler {
        C10786j() {
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            C10776d0.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
            boolean unused = C10776d0.this.f12526y = true;
        }
    }

    /* renamed from: w3.d0$k */
    class C10787k implements CompletedHandler {
        C10787k() {
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON fan onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            C10776d0.this.mo41904v2().mo31551M0(true);
        }
    }

    /* renamed from: w3.d0$l */
    class C10788l implements CompletedHandler {
        C10788l() {
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            C10776d0.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
        }
    }

    /* renamed from: w3.d0$m */
    class C10789m implements CompletedHandler {
        C10789m() {
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON fan onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            C10776d0.this.mo41904v2().mo31551M0(false);
        }
    }

    /* renamed from: w3.d0$n */
    class C10790n implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20067a;

        C10790n(int i) {
            this.f20067a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setLevel onFailed: ");
            sb.append(this.f20067a);
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setLevel onSucceed: ");
            sb.append(this.f20067a);
            boolean unused = C10776d0.this.f12526y = true;
        }
    }

    /* renamed from: w3.d0$o */
    class C10791o implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20069a;

        C10791o(int i) {
            this.f20069a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanSpeed onFailed speed: ");
            sb.append(this.f20069a);
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanSpeed onSucceed speed: ");
            sb.append(this.f20069a);
            C10776d0.this.mo41903u2().get(0).mo41915f(this.f20069a);
            boolean unused = C10776d0.this.f12526y = true;
        }
    }

    /* renamed from: w3.d0$p */
    class C10792p implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20071a;

        C10792p(int i) {
            this.f20071a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanSpeed onFailed speed: ");
            sb.append(this.f20071a);
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanSpeed onSucceed speed: ");
            sb.append(this.f20071a);
            C10776d0.this.mo41903u2().get(1).mo41915f(this.f20071a);
            boolean unused = C10776d0.this.f12526y = true;
        }
    }

    /* renamed from: w3.d0$q */
    class C10793q implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20073a;

        C10793q(int i) {
            this.f20073a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanMode onFailed mode: ");
            sb.append(this.f20073a);
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanMode onSucceed mode: ");
            sb.append(this.f20073a);
            C10776d0.this.mo41904v2().mo41918b1(this.f20073a);
            boolean unused = C10776d0.this.f12526y = true;
        }
    }

    /* renamed from: w3.d0$r */
    class C10794r implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20075a;

        C10794r(boolean z) {
            this.f20075a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableFlexSwitch onFailed: ");
            sb.append(this.f20075a);
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableFlexSwitch onFailed: ");
            sb.append(this.f20075a);
            boolean unused = C10776d0.this.f12526y = true;
            C10776d0.this.mo23221d0().mo31597k(this.f20075a);
        }
    }

    /* renamed from: w3.d0$s */
    class C10795s implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20077a;

        C10795s(boolean z) {
            this.f20077a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableFanFlexSwitch onFailed: ");
            sb.append(this.f20077a);
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableFanFlexSwitch onFailed: ");
            sb.append(this.f20077a);
            boolean unused = C10776d0.this.f12526y = true;
            C10776d0.this.mo41904v2().mo31597k(this.f20077a);
        }
    }

    /* renamed from: w3.d0$t */
    class C10796t implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ long f20079a;

        C10796t(long j) {
            this.f20079a = j;
        }

        public void onFailed(IotError iotError) {
            String str = C10776d0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10776d0.this.f4758v;
            C10776d0.this.mo23221d0().mo31600l0(this.f20079a);
            boolean unused = C10776d0.this.f12526y = true;
        }
    }

    public C10776d0(String str, String str2, String str3, int i, String str4) {
        super(str, str2, str3, i, str4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, new C10337c.C10340c(0, 100, R$string.fancl_fan_style_standard, 1));
        linkedHashMap.put(1, new C10337c.C10340c(1, 100, R$string.fancl_fan_style_loop, true));
        mo41892C2(linkedHashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public void m27478S2(int i) {
        mo31729b2(3, 10, Integer.valueOf(i), new C10783g(i));
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        return false;
    }

    /* renamed from: B2 */
    public void mo41891B2(int i) {
        mo31729b2(3, 4, Integer.valueOf(i), new C10793q(i));
    }

    /* renamed from: D2 */
    public void mo41893D2(C10337c.C10340c cVar, int i) {
        int i2;
        CompletedHandler completedHandler;
        Integer num;
        if (cVar != null) {
            int a = cVar.mo41910a();
            if (a == 0) {
                i2 = 7;
                num = Integer.valueOf(i);
                completedHandler = new C10791o(i);
            } else if (a == 1) {
                i2 = 8;
                num = Integer.valueOf(i);
                completedHandler = new C10792p(i);
            } else {
                return;
            }
            mo31729b2(5, i2, num, completedHandler);
        }
    }

    /* renamed from: E2 */
    public void mo41894E2(int i) {
        mo31728a2(new C8253c[]{new C8253c(3, 2, Integer.valueOf(i)), new C8253c(3, 1, Boolean.TRUE)}, new C10790n(i));
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_fancl6_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_fancl6_big;
    }

    /* renamed from: I1 */
    public List<Property> mo31712I1() {
        ArrayList arrayList = new ArrayList();
        List<Property> J1 = mo31713J1(2, new int[]{1, 3, 7, 5});
        if (J1 != null) {
            arrayList.addAll(J1);
        }
        List<Property> J12 = mo31713J1(3, new int[]{1, 2, 4});
        if (J12 != null) {
            arrayList.addAll(J12);
        }
        List<Property> J13 = mo31713J1(4, new int[]{1, 3, 6, 5, 7, 8});
        if (J13 != null) {
            arrayList.addAll(J13);
        }
        List<Property> J14 = mo31713J1(5, new int[]{5, 4, 6, 7, 8});
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
                return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.TRUE), new C11980p(mo31698M1(), 2, 7, 0), new C11980p(mo31698M1(), 2, 5, Integer.valueOf(sVar.mo35441h())), new C11980p(mo31698M1(), 2, 3, Integer.valueOf(sVar.mo35439f()))};
            }
            return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.TRUE, mo31714K1(sVar)), new C11980p(mo31698M1(), 2, 7, 0), new C11980p(mo31698M1(), 2, 5, Integer.valueOf(sVar.mo35441h()))};
        } else if (!sVar.mo35421F()) {
            return null;
        } else {
            return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.TRUE, mo31714K1(sVar)), new C11980p(mo31698M1(), 2, 7, 1), new C11980p(mo31698M1(), 2, 3, Integer.valueOf(sVar.mo35439f()))};
        }
    }

    /* renamed from: O1 */
    public C11980p[] mo31717O1(boolean z) {
        if (this.f19422Q == 0) {
            return new C11980p[]{new C11980p(mo31698M1(), 2, 1, Boolean.valueOf(z))};
        }
        return new C11980p[]{new C11980p(mo31698M1(), 3, 1, Boolean.valueOf(z))};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        ((p207s3.C10337c.C10340c) r7).mo41915f(((java.lang.Integer) r9).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* renamed from: P1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31718P1(int r7, int r8, java.lang.Object r9) {
        /*
            r6 = this;
            r0 = 7
            r1 = 5
            r2 = 2
            r3 = 1
            if (r7 == r2) goto L_0x0120
            r4 = 4
            r5 = 3
            if (r7 == r5) goto L_0x00f8
            if (r7 == r4) goto L_0x0078
            if (r7 == r1) goto L_0x0010
            goto L_0x0155
        L_0x0010:
            r7 = 0
            switch(r8) {
                case 4: goto L_0x0055;
                case 5: goto L_0x004f;
                case 6: goto L_0x003c;
                case 7: goto L_0x0023;
                case 8: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0155
        L_0x0016:
            java.util.Map r7 = r6.mo41903u2()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object r7 = r7.get(r8)
            goto L_0x002f
        L_0x0023:
            java.util.Map r8 = r6.mo41903u2()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r8.get(r7)
        L_0x002f:
            s3.c$c r7 = (p207s3.C10337c.C10340c) r7
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo41915f(r8)
            goto L_0x0155
        L_0x003c:
            s3.c$d r8 = r6.mo41904v2()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 != r3) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            r8.mo31597k(r3)
            goto L_0x0155
        L_0x004f:
            s3.c$d r7 = r6.mo41904v2()
            goto L_0x00ee
        L_0x0055:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r7 = r9.intValue()
            s3.c$d r8 = r6.mo41904v2()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.Object r8 = r8.mo31611r(r9)
            if (r8 != 0) goto L_0x0073
            s3.c$d r8 = r6.mo41904v2()
            y3.e r9 = new y3.e
            r9.<init>(r7, r7)
            goto L_0x00cd
        L_0x0073:
            s3.c$d r8 = r6.mo41904v2()
            goto L_0x00d6
        L_0x0078:
            if (r8 == r3) goto L_0x00ea
            if (r8 == r5) goto L_0x00db
            if (r8 == r1) goto L_0x00b0
            r7 = 6
            if (r8 == r7) goto L_0x00a9
            if (r8 == r0) goto L_0x0099
            r7 = 8
            if (r8 == r7) goto L_0x0089
            goto L_0x0155
        L_0x0089:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            long r8 = (long) r8
            r7.mo31545J0(r8)
            goto L_0x0155
        L_0x0099:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            long r8 = (long) r8
            r7.mo31600l0(r8)
            goto L_0x0155
        L_0x00a9:
            java.lang.String r9 = (java.lang.String) r9
            r6.mo42241R2(r9)
            goto L_0x0155
        L_0x00b0:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r7 = r9.intValue()
            com.yeelight.yeelib.device.base.DeviceStatusBase r8 = r6.mo23221d0()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.Object r8 = r8.mo31611r(r9)
            if (r8 != 0) goto L_0x00d2
            com.yeelight.yeelib.device.base.DeviceStatusBase r8 = r6.mo23221d0()
            y3.e r9 = new y3.e
            r9.<init>(r7, r7)
        L_0x00cd:
            r8.mo31577a(r9)
            goto L_0x0155
        L_0x00d2:
            com.yeelight.yeelib.device.base.DeviceStatusBase r8 = r6.mo23221d0()
        L_0x00d6:
            r8.mo31573X0(r7)
            goto L_0x0155
        L_0x00db:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            r7.mo31597k(r8)
            goto L_0x0155
        L_0x00ea:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()
        L_0x00ee:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo31547K0(r8)
            goto L_0x0155
        L_0x00f8:
            if (r8 == r3) goto L_0x011b
            if (r8 == r2) goto L_0x010d
            if (r8 == r4) goto L_0x00ff
            goto L_0x0155
        L_0x00ff:
            s3.c$d r7 = r6.mo41904v2()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo41918b1(r8)
            goto L_0x0155
        L_0x010d:
            s3.c$d r7 = r6.mo41904v2()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo41917a1(r8)
            goto L_0x0155
        L_0x011b:
            s3.c$d r7 = r6.mo41904v2()
            goto L_0x014c
        L_0x0120:
            if (r8 == r3) goto L_0x0148
            if (r8 == r1) goto L_0x013a
            if (r8 == r0) goto L_0x0127
            goto L_0x0155
        L_0x0127:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r7 = r9.intValue()
            if (r7 != 0) goto L_0x0135
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r7 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE
        L_0x0131:
            r6.mo23165w1(r7)
            goto L_0x0155
        L_0x0135:
            if (r7 != r3) goto L_0x0155
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r7 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT
            goto L_0x0131
        L_0x013a:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo31610q0(r8)
            goto L_0x0155
        L_0x0148:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()
        L_0x014c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            r7.mo31551M0(r8)
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223w3.C10776d0.mo31718P1(int, int, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: R2 */
    public void mo42241R2(String str) {
        if (str != null) {
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    mo23221d0().mo31543I0(true);
                }
                mo23221d0().mo31541H0(split[1]);
                mo23221d0().mo31539G0(split[2]);
                mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                StringBuilder sb = new StringBuilder();
                sb.append("start = ");
                sb.append(mo23221d0().mo31534E());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(mo23221d0().mo31532D());
                sb.append(", ");
                sb.append(mo23221d0().mo31530C());
            }
        }
    }

    /* renamed from: V */
    public boolean mo23211V() {
        return this.f19422Q == 0 ? super.mo23211V() : this.f19421C.mo31542I() == 1;
    }

    /* renamed from: Y1 */
    public boolean mo31726Y1(int i) {
        if (this.f19422Q == 0) {
            mo31729b2(4, 1, Integer.valueOf(i == 1 ? 1 : 2), new C10784h(i));
        } else {
            mo31729b2(5, 5, Integer.valueOf(i), new C10785i(i));
        }
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
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "enable" : "disable");
        sb.append("|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        sb.append("|");
        sb.append(i);
        mo31729b2(4, 6, sb.toString(), new C10780d(z, str, str2, i));
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
            mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 7, 0)}, new C10786j());
        } else if (i == 5) {
            mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 7, 1)}, new C10788l());
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
        mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 3, Long.valueOf(j))}, new C10796t(j));
        return true;
    }

    /* renamed from: p2 */
    public void mo41898p2() {
        mo31729b2(3, 1, Boolean.FALSE, new C10789m());
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        return false;
    }

    /* renamed from: q2 */
    public void mo41899q2(boolean z) {
        mo31729b2(5, 6, Integer.valueOf(z ? 1 : 0), new C10795s(z));
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
        mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 5, Integer.valueOf(i))}, new C10777a(i));
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
            mo31729b2(4, 4, Integer.valueOf(i), new C10781e(i));
        } else if (i2 == 1) {
            if (mo41906y2()) {
                m27478S2(i);
            } else {
                mo31729b2(3, 1, Boolean.TRUE, new C10782f(i));
            }
        }
        return true;
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        mo31729b2(4, 3, Boolean.valueOf(z), new C10794r(z));
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
                mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 7, 0), new C8253c(2, 3, Integer.valueOf(sVar.mo35439f())), new C8253c(2, 5, Integer.valueOf(sVar.mo35441h()))}, new C10778b(sVar));
            } else {
                mo23159s1(sVar.mo35441h());
            }
        } else if (sVar.mo35421F()) {
            mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 7, 1), new C8253c(2, 3, Integer.valueOf(sVar.mo35439f()))}, new C10779c(sVar));
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }

    /* renamed from: z2 */
    public void mo41907z2() {
        mo31729b2(3, 1, Boolean.TRUE, new C10787k());
    }
}
