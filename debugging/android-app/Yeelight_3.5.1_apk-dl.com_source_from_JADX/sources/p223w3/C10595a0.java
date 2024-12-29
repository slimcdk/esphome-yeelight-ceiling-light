package p223w3;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.Lamp2Service;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp2Device;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import p219v3.C10543a;
import p232y3.C12041e;
import p232y3.C12046i;
import p232y3.C12047j;

/* renamed from: w3.a0 */
public class C10595a0 extends WifiDeviceBase implements C10543a {

    /* renamed from: C */
    public static final String f19774C = "a0";

    /* renamed from: A */
    CompletionHandler f19775A = new C10603h(this);

    /* renamed from: B */
    Lamp2Service.C7518w0 f19776B = new C10604i();

    /* renamed from: z */
    CompletionHandler f19777z = new C10602g(this);

    /* renamed from: w3.a0$a */
    class C10596a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19778a;

        C10596a(C8327s sVar) {
            this.f19778a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31557P0(this.f19778a);
        }
    }

    /* renamed from: w3.a0$b */
    class C10597b implements CompletionHandler {
        C10597b(C10595a0 a0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a0$c */
    class C10598c implements CompletionHandler {
        C10598c() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.a0$d */
    class C10599d implements CompletionHandler {
        C10599d(C10595a0 a0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a0$e */
    class C10600e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19781a;

        C10600e(boolean z) {
            this.f19781a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31555O0(this.f19781a);
        }
    }

    /* renamed from: w3.a0$f */
    class C10601f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19783a;

        C10601f(int i) {
            this.f19783a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31551M0(true);
            C10595a0 a0Var = C10595a0.this;
            a0Var.mo23165w1(a0Var.mo23247j1(this.f19783a));
        }
    }

    /* renamed from: w3.a0$g */
    class C10602g implements CompletionHandler {
        C10602g(C10595a0 a0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a0$h */
    class C10603h implements CompletionHandler {
        C10603h(C10595a0 a0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("subscribe: onFailed, error: ");
            sb.append(i);
            sb.append(", desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a0$i */
    class C10604i implements Lamp2Service.C7518w0 {
        C10604i() {
        }

        /* renamed from: a */
        public void mo33947a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C10595a0.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo33948b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C10595a0.this.mo23221d0().mo31611r(2) == null) {
                C10595a0.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C10595a0.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo33949c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C10595a0.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo33950d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C10595a0.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo33951e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C10595a0.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo33952f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l.intValue());
            C10595a0.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: h */
        public void mo33953h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l.intValue());
            C10595a0.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo33954i(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onKidModeChanged: ");
            sb.append(l);
            C10595a0.this.mo23221d0().mo31620v0(l.longValue() == 1);
        }

        /* renamed from: j */
        public void mo33955j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPdoBreakTimeChanged: ");
            sb.append(l.intValue());
            if (C10595a0.this.mo23221d0().mo31611r(11) != null) {
                ((C12046i) C10595a0.this.mo23221d0().mo31611r(11)).mo42727f(l.intValue());
                C10595a0.this.mo23221d0().mo31575Y0();
            }
        }

        /* renamed from: k */
        public void mo33956k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPdoWorkTimeChanged: ");
            sb.append(l.intValue());
            if (C10595a0.this.mo23221d0().mo31611r(11) != null) {
                ((C12046i) C10595a0.this.mo23221d0().mo31611r(11)).mo42731j(l.intValue());
                C10595a0.this.mo23221d0().mo31575Y0();
            }
        }

        /* renamed from: l */
        public void mo33957l(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPdoStatusChanged: ");
            sb.append(l.intValue());
            C10595a0.this.mo42208g();
            boolean z = true;
            if (C10595a0.this.mo23221d0().mo31611r(11) == null) {
                DeviceStatusBase d0 = C10595a0.this.mo23221d0();
                if (l.longValue() != 1) {
                    z = false;
                }
                d0.mo31579b(11, new C12046i(z, 45, 15));
            } else {
                C12046i iVar = (C12046i) C10595a0.this.mo23221d0().mo31611r(11);
                if (l.longValue() != 1) {
                    z = false;
                }
                iVar.mo42728g(z);
            }
            C10595a0.this.mo23221d0().mo31575Y0();
        }

        /* renamed from: m */
        public void mo33958m(Lamp2Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C10613r.f19797a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C10595a0.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C10595a0.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }
    }

    /* renamed from: w3.a0$j */
    class C10605j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f19786a;

        C10605j(String str) {
            this.f19786a = str;
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.sendPomodoroCmd --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            if (Integer.valueOf(this.f19786a.split("\\|")[0]).intValue() == 0 && C10595a0.this.mo23221d0().mo31611r(11) != null) {
                ((C12046i) C10595a0.this.mo23221d0().mo31611r(11)).mo42728g(false);
                ((C12046i) C10595a0.this.mo23221d0().mo31611r(11)).mo42730i(0);
                ((C12046i) C10595a0.this.mo23221d0().mo31611r(11)).mo42729h(0);
                C10595a0.this.mo23221d0().mo31575Y0();
            }
        }
    }

    /* renamed from: w3.a0$k */
    class C10606k implements Lamp2Service.C7508r0 {
        C10606k() {
        }

        /* renamed from: a */
        public void mo33937a(Lamp2Service.Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, Long l8, Long l9, Long l10, String str2, Long l11) {
            StringBuilder sb = new StringBuilder();
            sb.append("bright: ");
            sb.append(l);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ct: ");
            sb2.append(l2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("pdoStatus: ");
            sb3.append(l3);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("pdoWorkTime: ");
            sb4.append(l4);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("pdoBreakTime: ");
            sb5.append(l5);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("delayoff: ");
            sb6.append(l6);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("power: ");
            sb7.append(power != null ? power.name() : "null");
            StringBuilder sb8 = new StringBuilder();
            sb8.append("kidMode: ");
            Long l12 = l7;
            sb8.append(l12);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("shortkey action: ");
            Long l13 = l10;
            sb9.append(l13);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("shortkey scene name: ");
            String str3 = str2;
            sb10.append(str3);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("flowing : ");
            sb11.append(l11);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("onFromPower: ");
            sb12.append(l9);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("saveState: ");
            sb13.append(l8);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("flowParams: ");
            sb14.append(str);
            C10595a0.this.m26986a2(power, l, l2, l6, l3, l4, l4, l12, str, l8, l9, l13, str3, l11);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.a0$l */
    class C10607l implements Lamp2Service.C7490i0 {
        C10607l() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.getData --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("MangoDevice.getData, response: ");
            sb.append(str);
            String[] split = str.split("\\|");
            boolean z = false;
            int intValue = Integer.valueOf(split[0]).intValue();
            int intValue2 = Integer.valueOf(split[1]).intValue();
            int i = intValue2 / 1000;
            int i2 = intValue2 % 1000;
            int intValue3 = Integer.valueOf(split[2]).intValue();
            int i3 = intValue3 / 10000;
            int i4 = intValue3 % 10000;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MangoDevice.getData, enabled: ");
            sb2.append(intValue);
            sb2.append(", worktime : ");
            sb2.append(i);
            sb2.append(", resttime : ");
            sb2.append(i2);
            sb2.append(", workremain : ");
            sb2.append(i3);
            sb2.append(", restRemain : ");
            sb2.append(i4);
            if (C10595a0.this.mo23221d0().mo31611r(11) != null) {
                C12046i iVar = (C12046i) C10595a0.this.mo23221d0().mo31611r(11);
                if (intValue == 1) {
                    z = true;
                }
                iVar.mo42728g(z);
                ((C12046i) C10595a0.this.mo23221d0().mo31611r(11)).mo42731j(i);
                ((C12046i) C10595a0.this.mo23221d0().mo31611r(11)).mo42727f(i2);
                ((C12046i) C10595a0.this.mo23221d0().mo31611r(11)).mo42730i(i3);
                ((C12046i) C10595a0.this.mo23221d0().mo31611r(11)).mo42729h(i4);
                C10595a0.this.mo23221d0().mo31575Y0();
            }
        }
    }

    /* renamed from: w3.a0$m */
    class C10608m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19790a;

        C10608m(boolean z) {
            this.f19790a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31620v0(this.f19790a);
        }
    }

    /* renamed from: w3.a0$n */
    class C10609n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19792a;

        C10609n(boolean z) {
            this.f19792a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31583d(this.f19792a);
        }
    }

    /* renamed from: w3.a0$o */
    class C10610o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19794a;

        C10610o(int i) {
            this.f19794a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31547K0(this.f19794a);
        }
    }

    /* renamed from: w3.a0$p */
    class C10611p implements CompletionHandler {
        C10611p(C10595a0 a0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("setShortKeyCmd --> onFailed, i = ");
            sb.append(i);
            sb.append(" , s = ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a0$q */
    class C10612q implements WifiDeviceBase.C6080i {
        C10612q() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C10595a0.this.f19776B.mo33947a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C10595a0.this.f19776B.mo33953h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C10595a0.this.f19776B.mo33958m(Lamp2Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.a0$r */
    static /* synthetic */ class C10613r {

        /* renamed from: a */
        static final /* synthetic */ int[] f19797a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Lamp2Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19797a = r0
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp2Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19797a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp2Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C10595a0.C10613r.<clinit>():void");
        }
    }

    /* renamed from: w3.a0$s */
    class C10614s implements CompletionHandler {
        C10614s() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.open --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.a0$t */
    class C10615t implements CompletionHandler {
        C10615t() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.a0$u */
    class C10616u implements CompletionHandler {
        C10616u() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.a0$v */
    class C10617v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f19801a;

        C10617v(long j) {
            this.f19801a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31600l0(this.f19801a);
        }
    }

    /* renamed from: w3.a0$w */
    class C10618w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19803a;

        C10618w(int i) {
            this.f19803a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31610q0(this.f19803a);
        }
    }

    /* renamed from: w3.a0$x */
    class C10619x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19805a;

        C10619x(C8327s sVar) {
            this.f19805a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31557P0(this.f19805a);
        }
    }

    /* renamed from: w3.a0$y */
    class C10620y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19807a;

        C10620y(C8327s sVar) {
            this.f19807a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31557P0(this.f19807a);
        }
    }

    /* renamed from: w3.a0$z */
    class C10621z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19809a;

        C10621z(C8327s sVar) {
            this.f19809a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10595a0.this.mo23221d0().mo31557P0(this.f19809a);
        }
    }

    public C10595a0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public void m26986a2(Lamp2Service.Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, Long l8, Long l9, Long l10, String str2, Long l11) {
        String str3;
        int i;
        Lamp2Service.Power power2 = power;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == Lamp2Service.Power.on);
        }
        if (l != null) {
            mo23221d0().mo31600l0(l.longValue());
        }
        if (l2 != null) {
            mo23221d0().mo31610q0(l2.intValue());
        }
        if (l9 != null) {
            mo23221d0().mo31547K0(l9.intValue());
        }
        if (l3 != null) {
            if (mo23221d0().mo31611r(2) == null) {
                mo23221d0().mo31577a(new C12041e(l3.intValue(), l3.intValue()));
            } else {
                mo23221d0().mo31573X0(l3.intValue());
            }
        }
        boolean z2 = l4 != null && l4.longValue() == 1;
        int i2 = 45;
        int intValue = l5 != null ? l5.intValue() : 45;
        int i3 = 15;
        int intValue2 = l6 != null ? l6.intValue() : 15;
        if (mo23221d0().mo31611r(11) == null) {
            DeviceStatusBase d0 = mo23221d0();
            if (intValue != 0) {
                i2 = intValue;
            }
            if (intValue2 != 0) {
                i3 = intValue2;
            }
            d0.mo31579b(11, new C12046i(z2, i2, i3));
        } else {
            ((C12046i) mo23221d0().mo31611r(11)).mo42728g(z2);
            ((C12046i) mo23221d0().mo31611r(11)).mo42731j(intValue);
            ((C12046i) mo23221d0().mo31611r(11)).mo42727f(intValue2);
            mo23221d0().mo31575Y0();
        }
        mo23221d0().mo31620v0(l7 != null && l7.longValue() == 1);
        if (mo23221d0().mo31611r(19) == null) {
            DeviceStatusBase d02 = mo23221d0();
            if (l10 != null) {
                i = l10.intValue();
                str3 = str2;
            } else {
                str3 = str2;
                i = 0;
            }
            d02.mo31579b(19, new C12047j(i, str3));
        }
        mo23221d0().mo31555O0(l8 != null && l8.longValue() == 1);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        DeviceStatusBase d03 = mo23221d0();
        if (l11.longValue() == 0) {
            z = false;
        }
        d03.mo31618u0(z);
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C10616u());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo31474C1() {
        return false;
    }

    /* renamed from: E1 */
    public boolean mo31476E1(String str, int i) {
        return false;
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_elf_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_elf_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C10612q();
    }

    /* renamed from: M0 */
    public void mo23196M0(AbstractDevice abstractDevice) {
        super.mo23196M0(abstractDevice);
        if (abstractDevice.isOnline()) {
            mo31492U1();
        } else {
            mo31493V1();
        }
    }

    /* renamed from: M1 */
    public boolean mo31484M1(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("setGeekMode --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(Lamp2Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10609n(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: O1 */
    public boolean mo31486O1(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("setKidMode --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(Lamp2Service.CmdKey.cfg_kidmode, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10608m(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: R1 */
    public boolean mo31489R1(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("setOnFromPower --> Invoke, value : ");
        sb.append(i);
        try {
            mo31477F1().sendCmd(Lamp2Service.CmdKey.cfg_init_power, String.valueOf(i), new C10610o(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Lamp2Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10600e(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: T1 */
    public boolean mo31491T1(int i, int i2, int i3, String str) {
        String str2;
        int b;
        StringBuilder sb = new StringBuilder();
        sb.append("setShortKeyCmd --> Invoke, action : ");
        sb.append(i);
        if (i == 0) {
            str2 = TimerCodec.DISENABLE;
        } else if (i == 1) {
            int i4 = 15;
            if (mo23221d0().mo31611r(2) != null && (b = ((C12041e) mo23221d0().mo31611r(2)).mo42678b()) > 0) {
                i4 = b;
            }
            str2 = String.format("1|%03d", new Object[]{Integer.valueOf(i4)});
        } else if (i != 2) {
            str2 = "";
        } else {
            str2 = String.format("2|%03d|%03d|%s", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2), str});
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" param : ");
        sb2.append(str2);
        try {
            mo31477F1().sendCmd(Lamp2Service.CmdKey.cfg_shortkey, str2, new C10611p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42227c2(this.f19775A, this.f19776B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f19777z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f19774C, "Invalid handler!");
        }
        if (this.f4749n == null) {
            return true;
        }
        try {
            mo31477F1().unsubscribeNotifications((CompletionHandler) obj);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: Y1 */
    public Lamp2Service mo31477F1() {
        return ((YeelightLamp2Device) this.f4749n).mDeviceService;
    }

    /* renamed from: Z1 */
    public boolean mo42225Z1(Lamp2Service.CmdKey cmdKey, String str) {
        try {
            mo31477F1().getData(cmdKey, str, new C10607l());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo42206a(int i, int i2) {
        return mo42226b2(Lamp2Service.CmdKey.cfg_pomodoro, String.format("01|%03d%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        if (super.mo23140b1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Lamp2Service.Power.off, new C10615t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: b2 */
    public boolean mo42226b2(Lamp2Service.CmdKey cmdKey, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("MangoDevice.sendPomodoroCmd --> Invoke, cmd: ");
        sb.append(cmdKey.name());
        sb.append(", param: ");
        sb.append(str);
        try {
            mo31477F1().sendCmd(cmdKey, str, new C10605j(str));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo42207c() {
        return mo42226b2(Lamp2Service.CmdKey.cfg_pomodoro, "00");
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C10598c());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: c2 */
    public boolean mo42227c2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Lamp2Service.C7518w0)) {
            AppUtils.m8300u(f19774C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Lamp2Service.C7518w0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: g */
    public boolean mo42208g() {
        return mo42225Z1(Lamp2Service.CmdKey.cfg_pomodoro, "00");
    }

    /* renamed from: h */
    public boolean mo42209h(int i, int i2) {
        return mo42226b2(Lamp2Service.CmdKey.cfg_pomodoro, String.format("02|%03d%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Lamp2Service.Power.on, new C10614s());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        if (super.mo23150m1(i)) {
            return true;
        }
        try {
            mo31477F1().openWithMode(Lamp2Service.Power.on, Lamp2Service.Effect.smooth, 500L, Long.valueOf((long) i), new C10601f(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        if (super.mo23154p1(j)) {
            return true;
        }
        try {
            mo31477F1().setBright(Long.valueOf(j), Lamp2Service.Effect.smooth, 500L, new C10617v(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        return false;
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        if (super.mo23159s1(i)) {
            return true;
        }
        try {
            mo31477F1().setCt(Long.valueOf((long) i), Lamp2Service.Effect.smooth, 500L, new C10618w(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C10599d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C10597b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f19777z);
    }

    /* renamed from: v1 */
    public boolean mo23249v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        String str2 = str;
        try {
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() != 14) {
                AppUtils.m8300u("BATCH_RPC", "MangoDevice, Invalid length of batch rpc result: " + str2);
            }
            m26986a2(Lamp2Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        boolean x = super.mo23166x(i, obj);
        if (i == 5) {
            mo23169y0();
        } else if (i == 7) {
            mo23131U0();
        } else if (i == 10) {
            C12041e eVar = (C12041e) obj;
            mo23162u1(eVar.mo42678b());
            mo23221d0().mo31577a(eVar);
        } else if (i == 14) {
            mo23141c1();
        }
        return x;
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        if (super.mo23167x0()) {
            return true;
        }
        if (this.f4749n.getOwnership() == Device.Ownership.MINE || this.f4749n.getOwnership() == Device.Ownership.OTHERS) {
            try {
                mo31477F1().getProperties(new C10606k());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        if (super.mo23168x1(sVar)) {
            return true;
        }
        if (sVar.mo35455v()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C10619x(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C10620y(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C10621z(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C10596a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f19774C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("KidMode").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("ShortKeyAction").getInternalName(), mo31477F1().getService().getProperty("ShortKeySceneName").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("PdoStatus").getInternalName(), mo31477F1().getService().getProperty("PdoWorkTime").getInternalName(), mo31477F1().getService().getProperty("PdoBreakTime").getInternalName()};
    }
}
