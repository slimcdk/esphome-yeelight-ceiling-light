package p223w3;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.Panel1Service;
import com.yeelight.yeelib.device.xiaomi.YeelightPanel1Device;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import p207s3.C10333b;
import p232y3.C12041e;

/* renamed from: w3.a1 */
public class C10622a1 extends C10333b {

    /* renamed from: C */
    public static final String f19811C = "a1";

    /* renamed from: A */
    CompletionHandler f19812A = new C10629g(this);

    /* renamed from: B */
    Panel1Service.C7852o0 f19813B = new C10630h();

    /* renamed from: z */
    CompletionHandler f19814z = new C10628f(this);

    /* renamed from: w3.a1$a */
    class C10623a implements CompletionHandler {
        C10623a(C10622a1 a1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a1$b */
    class C10624b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19815a;

        C10624b(boolean z) {
            this.f19815a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31555O0(this.f19815a);
        }
    }

    /* renamed from: w3.a1$c */
    class C10625c implements CompletionHandler {
        C10625c(C10622a1 a1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a1$d */
    class C10626d implements CompletionHandler {
        C10626d() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.a1$e */
    class C10627e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19818a;

        C10627e(int i) {
            this.f19818a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31551M0(true);
            C10622a1 a1Var = C10622a1.this;
            a1Var.mo23165w1(a1Var.mo23247j1(this.f19818a));
        }
    }

    /* renamed from: w3.a1$f */
    class C10628f implements CompletionHandler {
        C10628f(C10622a1 a1Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a1$g */
    class C10629g implements CompletionHandler {
        C10629g(C10622a1 a1Var) {
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

    /* renamed from: w3.a1$h */
    class C10630h implements Panel1Service.C7852o0 {
        C10630h() {
        }

        /* renamed from: a */
        public void mo34454a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C10622a1.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo34455b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C10622a1.this.mo23221d0().mo31611r(2) == null) {
                C10622a1.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C10622a1.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo34456c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C10622a1.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo34457d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C10622a1.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo34458e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C10622a1.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo34459f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C10622a1.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo34460g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C10622a1.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo34461h(Panel1Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C10638p.f19834a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C10622a1.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C10622a1.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: i */
        public void mo34462i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C10622a1.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C10622a1.this.mo23221d0().mo31543I0(true);
                }
                C10622a1.this.mo23221d0().mo31541H0(split[1]);
                C10622a1.this.mo23221d0().mo31539G0(split[2]);
                C10622a1.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C10622a1.f19811C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C10622a1.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C10622a1.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C10622a1.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: o */
        public void mo34463o(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSmartSwitchChanged: ");
            sb.append(l);
            C10622a1.this.mo23221d0().mo31597k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: w3.a1$i */
    class C10631i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19821a;

        C10631i(boolean z) {
            this.f19821a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31583d(this.f19821a);
        }
    }

    /* renamed from: w3.a1$j */
    class C10632j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19823a;

        C10632j(int i) {
            this.f19823a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31547K0(this.f19823a);
        }
    }

    /* renamed from: w3.a1$k */
    class C10633k implements Panel1Service.C7842j0 {
        C10633k() {
        }

        /* renamed from: a */
        public void mo34444a(Panel1Service.Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power != null ? power.name() : "null");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            sb2.append(l);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("temperature: ");
            Long l9 = l2;
            sb3.append(l9);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("lanMode: ");
            Long l10 = l5;
            sb4.append(l10);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("onFromPower: ");
            Long l11 = l6;
            sb5.append(l11);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("delayoff: ");
            Long l12 = l3;
            sb6.append(l12);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("saveState: ");
            Long l13 = l4;
            sb7.append(l13);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("flowParams: ");
            String str3 = str;
            sb8.append(str3);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("flowing: ");
            Long l14 = l7;
            sb9.append(l14);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("smartSwitch: ");
            Long l15 = l8;
            sb10.append(l15);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("nightTimeInfo: ");
            String str4 = str2;
            sb11.append(str4);
            C10622a1.this.m27048k2(power, l, l9, l12, l13, str3, l10, l11, l14, l15, str4);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.a1$l */
    class C10634l implements CompletionHandler {
        C10634l(C10622a1 a1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a1$m */
    class C10635m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19826a;

        C10635m(boolean z) {
            this.f19826a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31597k(this.f19826a);
        }
    }

    /* renamed from: w3.a1$n */
    class C10636n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19828a;

        /* renamed from: b */
        final /* synthetic */ String f19829b;

        /* renamed from: c */
        final /* synthetic */ String f19830c;

        /* renamed from: d */
        final /* synthetic */ int f19831d;

        C10636n(boolean z, String str, String str2, int i) {
            this.f19828a = z;
            this.f19829b = str;
            this.f19830c = str2;
            this.f19831d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31543I0(this.f19828a);
            C10622a1.this.mo23221d0().mo31541H0(this.f19829b);
            C10622a1.this.mo23221d0().mo31539G0(this.f19830c);
            C10622a1.this.mo23221d0().mo31537F0(this.f19831d);
        }
    }

    /* renamed from: w3.a1$o */
    class C10637o implements WifiDeviceBase.C6080i {
        C10637o() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C10622a1.this.f19813B.mo34454a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
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
            C10622a1.this.f19813B.mo34461h(Panel1Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.a1$p */
    static /* synthetic */ class C10638p {

        /* renamed from: a */
        static final /* synthetic */ int[] f19834a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Panel1Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Panel1Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19834a = r0
                com.yeelight.yeelib.device.xiaomi.Panel1Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Panel1Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19834a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Panel1Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Panel1Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C10622a1.C10638p.<clinit>():void");
        }
    }

    /* renamed from: w3.a1$q */
    class C10639q implements CompletionHandler {
        C10639q() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.a1$r */
    class C10640r implements CompletionHandler {
        C10640r() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.a1$s */
    class C10641s implements CompletionHandler {
        C10641s() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.a1$t */
    class C10642t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f19838a;

        C10642t(long j) {
            this.f19838a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31600l0(this.f19838a);
        }
    }

    /* renamed from: w3.a1$u */
    class C10643u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19840a;

        C10643u(C8327s sVar) {
            this.f19840a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31557P0(this.f19840a);
        }
    }

    /* renamed from: w3.a1$v */
    class C10644v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19842a;

        C10644v(C8327s sVar) {
            this.f19842a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31557P0(this.f19842a);
        }
    }

    /* renamed from: w3.a1$w */
    class C10645w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19844a;

        C10645w(C8327s sVar) {
            this.f19844a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31557P0(this.f19844a);
        }
    }

    /* renamed from: w3.a1$x */
    class C10646x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19846a;

        C10646x(C8327s sVar) {
            this.f19846a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10622a1.this.mo23221d0().mo31557P0(this.f19846a);
        }
    }

    public C10622a1(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public void m27048k2(Panel1Service.Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, String str2) {
        if (power != null) {
            mo23221d0().mo31551M0(power == Panel1Service.Power.on);
        }
        if (l != null) {
            mo23221d0().mo31600l0(l.longValue());
        }
        if (l2 != null) {
            mo23221d0().mo31561R0(l2.intValue());
        }
        if (l3 != null) {
            if (mo23221d0().mo31611r(2) == null) {
                mo23221d0().mo31577a(new C12041e(l3.intValue(), l3.intValue()));
            } else {
                mo23221d0().mo31573X0(l3.intValue());
            }
        }
        if (l6 != null) {
            mo23221d0().mo31547K0(l6.intValue());
        }
        mo23221d0().mo31555O0(l4 != null && l4.longValue() == 1);
        mo23221d0().mo31583d(l5 != null && l5.longValue() == 1);
        mo23221d0().mo31618u0(l7.longValue() != 0);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        mo23221d0().mo31597k(l8 != null && l8.longValue() == 1);
        String[] split = str2.split("\\|");
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

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C10641s());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: F */
    public int mo23116F() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_panel_small;
        }
        String T = mo23208T();
        T.hashCode();
        return !T.equals("yeelink.light.panel1") ? R$drawable.icon_yeelight_device_badge_panel_small : R$drawable.icon_yeelight_device_badge_panel_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_panel_big;
        }
        String T = mo23208T();
        T.hashCode();
        return !T.equals("yeelink.light.panel1") ? R$drawable.icon_yeelight_device_badge_panel_big : R$drawable.icon_yeelight_device_badge_panel_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C10637o();
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
            mo31477F1().sendCmd(Panel1Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10631i(z));
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
            mo31477F1().sendCmd(Panel1Service.CmdKey.cfg_init_power, String.valueOf(i), new C10632j(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Panel1Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10624b(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23210U() {
        String U = super.mo23210U();
        return (U == null || U.isEmpty()) ? C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_mono) : U;
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42229l2(this.f19812A, this.f19813B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f19814z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f19811C, "Invalid handler!");
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

    /* renamed from: a2 */
    public boolean mo41882a2(boolean z) {
        return false;
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        if (super.mo23140b1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Panel1Service.Power.off, new C10640r());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        if (super.mo23141c1()) {
            return true;
        }
        try {
            mo31477F1().delCron(0L, new C10626d());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: f2 */
    public boolean mo41885f2(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendRemoteKey --> Invoke, enable : ");
        sb.append(i);
        try {
            mo31477F1().sendCmd(Panel1Service.CmdKey.pseudo_beacon, "4097|" + i, new C10634l(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g1 */
    public boolean mo23245g1(boolean z, String str, String str2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("enableNightTime --> Invoke, enable : ");
        sb.append(z);
        sb.append(", startTime : ");
        sb.append(str);
        sb.append(" , endTime : ");
        sb.append(str2);
        sb.append(" , delayTime : ");
        sb.append(i);
        try {
            Panel1Service j2 = mo31477F1();
            Panel1Service.CmdKey cmdKey = Panel1Service.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            j2.sendCmd(cmdKey, sb2.toString(), new C10636n(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Panel1Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightPanel1Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Panel1Service.Power.on, new C10639q());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42229l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Panel1Service.C7852o0)) {
            AppUtils.m8300u(f19811C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Panel1Service.C7852o0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        if (super.mo23150m1(i)) {
            return true;
        }
        try {
            mo31477F1().openWithMode(Panel1Service.Power.on, Panel1Service.Effect.smooth, 500L, Long.valueOf((long) i), new C10627e(i));
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
            mo31477F1().setBright(Long.valueOf(j), Panel1Service.Effect.smooth, 500L, new C10642t(j));
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
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        if (super.mo23160t1()) {
            return true;
        }
        try {
            mo31477F1().setDefault(new C10623a(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        if (super.mo23162u1(i)) {
            return true;
        }
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C10625c(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        try {
            mo31477F1().sendCmd(Panel1Service.CmdKey.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10635m(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f19814z);
    }

    /* renamed from: v1 */
    public boolean mo23249v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 11) {
                AppUtils.m8300u("BATCH_RPC", "Mono4Device, Invalid length of batch rpc result: " + str);
            }
            m27048k2(Panel1Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), jSONArray.getString(10));
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
                mo31477F1().getProperties(new C10633k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C10643u(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C10644v(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C10645w(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C10646x(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f19811C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Temperature").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("SmartSwitch").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName()};
    }
}