package p223w3;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.Mono4Service;
import com.yeelight.yeelib.device.xiaomi.YeelightMono4Device;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import p232y3.C12041e;

/* renamed from: w3.w0 */
public class C11796w0 extends WifiDeviceBase {

    /* renamed from: C */
    public static final String f21616C = "w0";

    /* renamed from: A */
    CompletionHandler f21617A = new C11803g(this);

    /* renamed from: B */
    Mono4Service.C7735l0 f21618B = new C11804h();

    /* renamed from: z */
    CompletionHandler f21619z = new C11802f(this);

    /* renamed from: w3.w0$a */
    class C11797a implements CompletionHandler {
        C11797a(C11796w0 w0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.w0$b */
    class C11798b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21620a;

        C11798b(boolean z) {
            this.f21620a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31555O0(this.f21620a);
        }
    }

    /* renamed from: w3.w0$c */
    class C11799c implements CompletionHandler {
        C11799c(C11796w0 w0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.w0$d */
    class C11800d implements CompletionHandler {
        C11800d() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.w0$e */
    class C11801e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21623a;

        C11801e(int i) {
            this.f21623a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31551M0(true);
            C11796w0 w0Var = C11796w0.this;
            w0Var.mo23165w1(w0Var.mo23247j1(this.f21623a));
        }
    }

    /* renamed from: w3.w0$f */
    class C11802f implements CompletionHandler {
        C11802f(C11796w0 w0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.w0$g */
    class C11803g implements CompletionHandler {
        C11803g(C11796w0 w0Var) {
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

    /* renamed from: w3.w0$h */
    class C11804h implements Mono4Service.C7735l0 {
        C11804h() {
        }

        /* renamed from: a */
        public void mo34288a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11796w0.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo34289b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11796w0.this.mo23221d0().mo31611r(2) == null) {
                C11796w0.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11796w0.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo34290c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11796w0.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo34291d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11796w0.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo34292e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11796w0.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo34293f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11796w0.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo34294g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11796w0.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo34295h(Mono4Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11810n.f21634a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11796w0.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11796w0.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: o */
        public void mo34296o(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSmartSwitchChanged: ");
            sb.append(l);
            C11796w0.this.mo23221d0().mo31597k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: w3.w0$i */
    class C11805i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21626a;

        C11805i(boolean z) {
            this.f21626a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31583d(this.f21626a);
        }
    }

    /* renamed from: w3.w0$j */
    class C11806j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21628a;

        C11806j(int i) {
            this.f21628a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31547K0(this.f21628a);
        }
    }

    /* renamed from: w3.w0$k */
    class C11807k implements Mono4Service.C7725g0 {
        C11807k() {
        }

        /* renamed from: a */
        public void mo34278a(Mono4Service.Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power != null ? power.name() : "null");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            Long l9 = l;
            sb2.append(l);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("temperature: ");
            Long l10 = l2;
            sb3.append(l10);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("lanMode: ");
            Long l11 = l5;
            sb4.append(l11);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("onFromPower: ");
            Long l12 = l6;
            sb5.append(l12);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("delayoff: ");
            Long l13 = l3;
            sb6.append(l13);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("saveState: ");
            Long l14 = l4;
            sb7.append(l14);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("flowParams: ");
            String str2 = str;
            sb8.append(str2);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("flowing: ");
            Long l15 = l7;
            sb9.append(l15);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("smartSwitch: ");
            Long l16 = l8;
            sb10.append(l16);
            C11796w0.this.m30122Z1(power, l, l10, l13, l14, str2, l11, l12, l15, l16);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.w0$l */
    class C11808l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21631a;

        C11808l(boolean z) {
            this.f21631a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31597k(this.f21631a);
        }
    }

    /* renamed from: w3.w0$m */
    class C11809m implements WifiDeviceBase.C6080i {
        C11809m() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11796w0.this.f21618B.mo34288a(l);
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
            C11796w0.this.f21618B.mo34295h(Mono4Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.w0$n */
    static /* synthetic */ class C11810n {

        /* renamed from: a */
        static final /* synthetic */ int[] f21634a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Mono4Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Mono4Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21634a = r0
                com.yeelight.yeelib.device.xiaomi.Mono4Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Mono4Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21634a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Mono4Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Mono4Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11796w0.C11810n.<clinit>():void");
        }
    }

    /* renamed from: w3.w0$o */
    class C11811o implements CompletionHandler {
        C11811o() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.w0$p */
    class C11812p implements CompletionHandler {
        C11812p() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.w0$q */
    class C11813q implements CompletionHandler {
        C11813q() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.w0$r */
    class C11814r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21638a;

        C11814r(long j) {
            this.f21638a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31600l0(this.f21638a);
        }
    }

    /* renamed from: w3.w0$s */
    class C11815s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21640a;

        C11815s(C8327s sVar) {
            this.f21640a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31557P0(this.f21640a);
        }
    }

    /* renamed from: w3.w0$t */
    class C11816t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21642a;

        C11816t(C8327s sVar) {
            this.f21642a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31557P0(this.f21642a);
        }
    }

    /* renamed from: w3.w0$u */
    class C11817u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21644a;

        C11817u(C8327s sVar) {
            this.f21644a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31557P0(this.f21644a);
        }
    }

    /* renamed from: w3.w0$v */
    class C11818v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21646a;

        C11818v(C8327s sVar) {
            this.f21646a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11796w0.this.mo23221d0().mo31557P0(this.f21646a);
        }
    }

    public C11796w0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public void m30122Z1(Mono4Service.Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8) {
        boolean z = true;
        if (power != null) {
            mo23221d0().mo31551M0(power == Mono4Service.Power.on);
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
        DeviceStatusBase d0 = mo23221d0();
        if (l8 == null || l8.longValue() != 1) {
            z = false;
        }
        d0.mo31597k(z);
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11813q());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: F */
    public int mo23116F() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_mono4_small;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -948847040:
                if (T.equals("yeelink.light.panel1")) {
                    c = 0;
                    break;
                }
                break;
            case -448603202:
                if (T.equals("yeelink.light.mono4")) {
                    c = 1;
                    break;
                }
                break;
            case -448603201:
                if (T.equals("yeelink.light.mono5")) {
                    c = 2;
                    break;
                }
                break;
            case -448603156:
                if (T.equals("yeelink.light.monob")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_panel_small;
            case 1:
            case 3:
                return R$drawable.icon_yeelight_device_badge_mono4_small;
            case 2:
                return R$drawable.icon_yeelight_device_badge_mono5_small;
            default:
                return R$drawable.icon_yeelight_device_badge_mono4_small;
        }
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_mono4_big;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -948847040:
                if (T.equals("yeelink.light.panel1")) {
                    c = 0;
                    break;
                }
                break;
            case -448603202:
                if (T.equals("yeelink.light.mono4")) {
                    c = 1;
                    break;
                }
                break;
            case -448603201:
                if (T.equals("yeelink.light.mono5")) {
                    c = 2;
                    break;
                }
                break;
            case -448603156:
                if (T.equals("yeelink.light.monob")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_panel_big;
            case 1:
            case 3:
                return R$drawable.icon_yeelight_device_badge_mono4_big;
            case 2:
                return R$drawable.icon_yeelight_device_badge_mono5_big;
            default:
                return R$drawable.icon_yeelight_device_badge_mono4_big;
        }
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11809m();
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
            mo31477F1().sendCmd(Mono4Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11805i(z));
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
            mo31477F1().sendCmd(Mono4Service.CmdKey.cfg_init_power, String.valueOf(i), new C11806j(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Mono4Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11798b(z));
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
        return mo42383a2(this.f21617A, this.f21618B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21619z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21616C, "Invalid handler!");
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
    public Mono4Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightMono4Device) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo42383a2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Mono4Service.C7735l0)) {
            AppUtils.m8300u(f21616C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Mono4Service.C7735l0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        if (super.mo23140b1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Mono4Service.Power.off, new C11812p());
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
            mo31477F1().delCron(0L, new C11800d());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Mono4Service.Power.on, new C11811o());
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
            mo31477F1().openWithMode(Mono4Service.Power.on, Mono4Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11801e(i));
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
            mo31477F1().setBright(Long.valueOf(j), Mono4Service.Effect.smooth, 500L, new C11814r(j));
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
            mo31477F1().setDefault(new C11797a(this));
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
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11799c(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        try {
            mo31477F1().sendCmd(Mono4Service.CmdKey.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11808l(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21619z);
    }

    /* renamed from: v1 */
    public boolean mo23249v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 10) {
                AppUtils.m8300u("BATCH_RPC", "Mono4Device, Invalid length of batch rpc result: " + str);
            }
            m30122Z1(Mono4Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)));
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
                mo31477F1().getProperties(new C11807k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11815s(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11816t(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11817u(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11818v(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f21616C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Temperature").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("SmartSwitch").getInternalName()};
    }
}
