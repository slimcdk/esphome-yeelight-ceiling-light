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

/* renamed from: w3.e0 */
public class C10838e0 extends C10337c {

    /* renamed from: w3.e0$a */
    class C10839a implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20144a;

        C10839a(int i) {
            this.f20144a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            C10838e0.this.mo23221d0().mo31561R0(this.f20144a);
            boolean unused = C10838e0.this.f12526y = true;
        }
    }

    /* renamed from: w3.e0$b */
    class C10840b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20146a;

        C10840b(C8327s sVar) {
            this.f20146a = sVar;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setscene ct onFailed: ");
            sb.append(iotError.toString());
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            C10838e0.this.mo23221d0().mo31610q0(this.f20146a.mo35441h());
            C10838e0.this.mo23221d0().mo31600l0((long) this.f20146a.mo35439f());
        }
    }

    /* renamed from: w3.e0$c */
    class C10841c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20148a;

        C10841c(C8327s sVar) {
            this.f20148a = sVar;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            C10838e0.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
            C10838e0.this.mo23221d0().mo31600l0((long) this.f20148a.mo35439f());
        }
    }

    /* renamed from: w3.e0$d */
    class C10842d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20150a;

        /* renamed from: b */
        final /* synthetic */ String f20151b;

        /* renamed from: c */
        final /* synthetic */ String f20152c;

        /* renamed from: d */
        final /* synthetic */ int f20153d;

        C10842d(boolean z, String str, String str2, int i) {
            this.f20150a = z;
            this.f20151b = str;
            this.f20152c = str2;
            this.f20153d = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableNightTime onFailed: ");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            C10838e0.this.mo23221d0().mo31543I0(this.f20150a);
            C10838e0.this.mo23221d0().mo31541H0(this.f20151b);
            C10838e0.this.mo23221d0().mo31539G0(this.f20152c);
            C10838e0.this.mo23221d0().mo31537F0(this.f20153d);
        }
    }

    /* renamed from: w3.e0$e */
    class C10843e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20155a;

        C10843e(int i) {
            this.f20155a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onFailed: ");
            sb.append(this.f20155a);
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onSucceed: ");
            sb.append(this.f20155a);
            boolean unused = C10838e0.this.f12526y = true;
        }
    }

    /* renamed from: w3.e0$f */
    class C10844f implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20157a;

        C10844f(int i) {
            this.f20157a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON fan onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            C10838e0.this.mo41904v2().mo31551M0(true);
            C10838e0.this.m27642S2(this.f20157a);
        }
    }

    /* renamed from: w3.e0$g */
    class C10845g implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20159a;

        C10845g(int i) {
            this.f20159a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onFailed: ");
            sb.append(this.f20159a);
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayOff onSucceed: ");
            sb.append(this.f20159a);
            boolean unused = C10838e0.this.f12526y = true;
        }
    }

    /* renamed from: w3.e0$h */
    class C10846h implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20161a;

        C10846h(int i) {
            this.f20161a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("light setOnFromPower onSucceed: ");
            sb.append(this.f20161a);
            C10838e0.this.mo23221d0().mo31547K0(this.f20161a);
        }
    }

    /* renamed from: w3.e0$i */
    class C10847i implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20163a;

        C10847i(int i) {
            this.f20163a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("fan setOnFromPower onSucceed: ");
            sb.append(this.f20163a);
            C10838e0.this.mo41904v2().mo31547K0(this.f20163a);
        }
    }

    /* renamed from: w3.e0$j */
    class C10848j implements CompletedHandler {
        C10848j() {
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            C10838e0.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
            boolean unused = C10838e0.this.f12526y = true;
        }
    }

    /* renamed from: w3.e0$k */
    class C10849k implements CompletedHandler {
        C10849k() {
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON fan onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            C10838e0.this.mo41904v2().mo31551M0(true);
        }
    }

    /* renamed from: w3.e0$l */
    class C10850l implements CompletedHandler {
        C10850l() {
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            C10838e0.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
        }
    }

    /* renamed from: w3.e0$m */
    class C10851m implements CompletedHandler {
        C10851m() {
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON fan onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            C10838e0.this.mo41904v2().mo31551M0(false);
        }
    }

    /* renamed from: w3.e0$n */
    class C10852n implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20169a;

        C10852n(int i) {
            this.f20169a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setLevel onFailed: ");
            sb.append(this.f20169a);
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setLevel onSucceed: ");
            sb.append(this.f20169a);
            boolean unused = C10838e0.this.f12526y = true;
        }
    }

    /* renamed from: w3.e0$o */
    class C10853o implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20171a;

        C10853o(int i) {
            this.f20171a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanSpeed onFailed speed: ");
            sb.append(this.f20171a);
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanSpeed onSucceed speed: ");
            sb.append(this.f20171a);
            C10838e0.this.mo41903u2().get(0).mo41915f(this.f20171a);
            boolean unused = C10838e0.this.f12526y = true;
        }
    }

    /* renamed from: w3.e0$p */
    class C10854p implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20173a;

        C10854p(int i) {
            this.f20173a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanSpeed onFailed speed: ");
            sb.append(this.f20173a);
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanSpeed onSucceed speed: ");
            sb.append(this.f20173a);
            C10838e0.this.mo41903u2().get(1).mo41915f(this.f20173a);
            boolean unused = C10838e0.this.f12526y = true;
        }
    }

    /* renamed from: w3.e0$q */
    class C10855q implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f20175a;

        C10855q(int i) {
            this.f20175a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanMode onFailed mode: ");
            sb.append(this.f20175a);
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setFanMode onSucceed mode: ");
            sb.append(this.f20175a);
            C10838e0.this.mo41904v2().mo41918b1(this.f20175a);
            boolean unused = C10838e0.this.f12526y = true;
        }
    }

    /* renamed from: w3.e0$r */
    class C10856r implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20177a;

        C10856r(boolean z) {
            this.f20177a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableFlexSwitch onFailed: ");
            sb.append(this.f20177a);
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableFlexSwitch onFailed: ");
            sb.append(this.f20177a);
            boolean unused = C10838e0.this.f12526y = true;
            C10838e0.this.mo23221d0().mo31597k(this.f20177a);
        }
    }

    /* renamed from: w3.e0$s */
    class C10857s implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20179a;

        C10857s(boolean z) {
            this.f20179a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableFanFlexSwitch onFailed: ");
            sb.append(this.f20179a);
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("enableFanFlexSwitch onFailed: ");
            sb.append(this.f20179a);
            boolean unused = C10838e0.this.f12526y = true;
            C10838e0.this.mo41904v2().mo31597k(this.f20179a);
        }
    }

    /* renamed from: w3.e0$t */
    class C10858t implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ long f20181a;

        C10858t(long j) {
            this.f20181a = j;
        }

        public void onFailed(IotError iotError) {
            String str = C10838e0.this.f4758v;
        }

        public void onSucceed() {
            String str = C10838e0.this.f4758v;
            C10838e0.this.mo23221d0().mo31600l0(this.f20181a);
            boolean unused = C10838e0.this.f12526y = true;
        }
    }

    public C10838e0(String str, String str2, String str3, int i, String str4) {
        super(str, str2, str3, i, str4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, new C10337c.C10340c(0, 100, R$string.fancl_fan_style_standard, 1));
        linkedHashMap.put(1, new C10337c.C10340c(1, 100, R$string.fancl_fan_style_loop, true));
        mo41892C2(linkedHashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public void m27642S2(int i) {
        mo31729b2(5, 9, Integer.valueOf(i), new C10845g(i));
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        return false;
    }

    /* renamed from: B2 */
    public void mo41891B2(int i) {
        mo31729b2(6, 7, Integer.valueOf(i), new C10855q(i));
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
                completedHandler = new C10853o(i);
            } else if (a == 1) {
                i2 = 8;
                num = Integer.valueOf(i);
                completedHandler = new C10854p(i);
            } else {
                return;
            }
            mo31729b2(5, i2, num, completedHandler);
        }
    }

    /* renamed from: E2 */
    public void mo41894E2(int i) {
        mo31728a2(new C8253c[]{new C8253c(6, 2, Integer.valueOf(i)), new C8253c(6, 1, Boolean.TRUE)}, new C10852n(i));
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
        List<Property> J12 = mo31713J1(6, new int[]{1, 2, 7});
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
        return new C11980p[]{new C11980p(mo31698M1(), 6, 1, Boolean.valueOf(z))};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        ((p207s3.C10337c.C10340c) r7).mo41915f(((java.lang.Integer) r9).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
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
            if (r7 == r2) goto L_0x0121
            r4 = 4
            r5 = 6
            if (r7 == r4) goto L_0x00a4
            if (r7 == r1) goto L_0x003c
            if (r7 == r5) goto L_0x0010
            goto L_0x0156
        L_0x0010:
            if (r8 == r3) goto L_0x0036
            if (r8 == r2) goto L_0x0027
            if (r8 == r0) goto L_0x0018
            goto L_0x0156
        L_0x0018:
            s3.c$d r7 = r6.mo41904v2()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo41918b1(r8)
            goto L_0x0156
        L_0x0027:
            s3.c$d r7 = r6.mo41904v2()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo41917a1(r8)
            goto L_0x0156
        L_0x0036:
            s3.c$d r7 = r6.mo41904v2()
            goto L_0x014d
        L_0x003c:
            r7 = 0
            switch(r8) {
                case 4: goto L_0x0081;
                case 5: goto L_0x007b;
                case 6: goto L_0x0068;
                case 7: goto L_0x004f;
                case 8: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0156
        L_0x0042:
            java.util.Map r7 = r6.mo41903u2()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object r7 = r7.get(r8)
            goto L_0x005b
        L_0x004f:
            java.util.Map r8 = r6.mo41903u2()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r8.get(r7)
        L_0x005b:
            s3.c$c r7 = (p207s3.C10337c.C10340c) r7
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo41915f(r8)
            goto L_0x0156
        L_0x0068:
            s3.c$d r8 = r6.mo41904v2()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 != r3) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r3 = 0
        L_0x0076:
            r8.mo31597k(r3)
            goto L_0x0156
        L_0x007b:
            s3.c$d r7 = r6.mo41904v2()
            goto L_0x0117
        L_0x0081:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r7 = r9.intValue()
            s3.c$d r8 = r6.mo41904v2()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.Object r8 = r8.mo31611r(r9)
            if (r8 != 0) goto L_0x009f
            s3.c$d r8 = r6.mo41904v2()
            y3.e r9 = new y3.e
            r9.<init>(r7, r7)
            goto L_0x00f9
        L_0x009f:
            s3.c$d r8 = r6.mo41904v2()
            goto L_0x0101
        L_0x00a4:
            if (r8 == r3) goto L_0x0113
            r7 = 3
            if (r8 == r7) goto L_0x0105
            if (r8 == r1) goto L_0x00dc
            if (r8 == r5) goto L_0x00d5
            if (r8 == r0) goto L_0x00c5
            r7 = 8
            if (r8 == r7) goto L_0x00b5
            goto L_0x0156
        L_0x00b5:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            long r8 = (long) r8
            r7.mo31545J0(r8)
            goto L_0x0156
        L_0x00c5:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            long r8 = (long) r8
            r7.mo31600l0(r8)
            goto L_0x0156
        L_0x00d5:
            java.lang.String r9 = (java.lang.String) r9
            r6.mo42245R2(r9)
            goto L_0x0156
        L_0x00dc:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r7 = r9.intValue()
            com.yeelight.yeelib.device.base.DeviceStatusBase r8 = r6.mo23221d0()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.Object r8 = r8.mo31611r(r9)
            if (r8 != 0) goto L_0x00fd
            com.yeelight.yeelib.device.base.DeviceStatusBase r8 = r6.mo23221d0()
            y3.e r9 = new y3.e
            r9.<init>(r7, r7)
        L_0x00f9:
            r8.mo31577a(r9)
            goto L_0x0156
        L_0x00fd:
            com.yeelight.yeelib.device.base.DeviceStatusBase r8 = r6.mo23221d0()
        L_0x0101:
            r8.mo31573X0(r7)
            goto L_0x0156
        L_0x0105:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            r7.mo31597k(r8)
            goto L_0x0156
        L_0x0113:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()
        L_0x0117:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo31547K0(r8)
            goto L_0x0156
        L_0x0121:
            if (r8 == r3) goto L_0x0149
            if (r8 == r1) goto L_0x013b
            if (r8 == r0) goto L_0x0128
            goto L_0x0156
        L_0x0128:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r7 = r9.intValue()
            if (r7 != 0) goto L_0x0136
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r7 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE
        L_0x0132:
            r6.mo23165w1(r7)
            goto L_0x0156
        L_0x0136:
            if (r7 != r3) goto L_0x0156
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r7 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT
            goto L_0x0132
        L_0x013b:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.mo31610q0(r8)
            goto L_0x0156
        L_0x0149:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()
        L_0x014d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            r7.mo31551M0(r8)
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223w3.C10838e0.mo31718P1(int, int, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: R2 */
    public void mo42245R2(String str) {
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
            mo31729b2(4, 1, Integer.valueOf(i == 1 ? 1 : 2), new C10846h(i));
        } else {
            mo31729b2(5, 5, Integer.valueOf(i), new C10847i(i));
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
        mo31729b2(4, 6, sb.toString(), new C10842d(z, str, str2, i));
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
            mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 7, 0)}, new C10848j());
        } else if (i == 5) {
            mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 7, 1)}, new C10850l());
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
        mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 3, Long.valueOf(j))}, new C10858t(j));
        return true;
    }

    /* renamed from: p2 */
    public void mo41898p2() {
        mo31729b2(6, 1, Boolean.FALSE, new C10851m());
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        return false;
    }

    /* renamed from: q2 */
    public void mo41899q2(boolean z) {
        mo31729b2(5, 6, Integer.valueOf(z ? 1 : 0), new C10857s(z));
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
        mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 5, Integer.valueOf(i))}, new C10839a(i));
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
            mo31729b2(4, 4, Integer.valueOf(i), new C10843e(i));
        } else if (i2 == 1) {
            if (mo41906y2()) {
                m27642S2(i);
            } else {
                mo31729b2(6, 1, Boolean.TRUE, new C10844f(i));
            }
        }
        return true;
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        mo31729b2(4, 3, Boolean.valueOf(z), new C10856r(z));
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
                mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 7, 0), new C8253c(2, 3, Integer.valueOf(sVar.mo35439f())), new C8253c(2, 5, Integer.valueOf(sVar.mo35441h()))}, new C10840b(sVar));
            } else {
                mo23159s1(sVar.mo35441h());
            }
        } else if (sVar.mo35421F()) {
            mo31728a2(new C8253c[]{new C8253c(2, 1, Boolean.TRUE), new C8253c(2, 7, 1), new C8253c(2, 3, Integer.valueOf(sVar.mo35439f()))}, new C10841c(sVar));
        }
        return true;
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }

    /* renamed from: z2 */
    public void mo41907z2() {
        mo31729b2(6, 1, Boolean.TRUE, new C10849k());
    }
}
