package p223w3;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.LanDevice;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.MonobService;
import com.yeelight.yeelib.device.xiaomi.YeelightMonobDevice;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import p232y3.C12041e;

/* renamed from: w3.y0 */
public class C11888y0 extends WifiDeviceBase {

    /* renamed from: C */
    public static final String f21744C = "y0";

    /* renamed from: A */
    CompletionHandler f21745A = new C11895g(this);

    /* renamed from: B */
    MonobService.C7807k0 f21746B = new C11896h();

    /* renamed from: z */
    CompletionHandler f21747z = new C11894f(this);

    /* renamed from: w3.y0$a */
    class C11889a implements CompletionHandler {
        C11889a(C11888y0 y0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.y0$b */
    class C11890b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21748a;

        C11890b(boolean z) {
            this.f21748a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31555O0(this.f21748a);
        }
    }

    /* renamed from: w3.y0$c */
    class C11891c implements CompletionHandler {
        C11891c(C11888y0 y0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.y0$d */
    class C11892d implements CompletionHandler {
        C11892d() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.y0$e */
    class C11893e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21751a;

        C11893e(int i) {
            this.f21751a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31551M0(true);
            C11888y0 y0Var = C11888y0.this;
            y0Var.mo23165w1(y0Var.mo23247j1(this.f21751a));
        }
    }

    /* renamed from: w3.y0$f */
    class C11894f implements CompletionHandler {
        C11894f(C11888y0 y0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.y0$g */
    class C11895g implements CompletionHandler {
        C11895g(C11888y0 y0Var) {
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

    /* renamed from: w3.y0$h */
    class C11896h implements MonobService.C7807k0 {
        C11896h() {
        }

        /* renamed from: a */
        public void mo34394a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11888y0.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo34395b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11888y0.this.mo23221d0().mo31611r(2) == null) {
                C11888y0.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11888y0.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo34396c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11888y0.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo34397d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11888y0.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo34398e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11888y0.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo34399f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11888y0.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo34400g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11888y0.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo34401h(MonobService.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11902n.f21762a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11888y0.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11888y0.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: p */
        public void mo34402p(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onTransIntervalDfltChanged: ");
            sb.append(l);
            C11888y0.this.mo23221d0().mo31565T0(l.longValue());
        }
    }

    /* renamed from: w3.y0$i */
    class C11897i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21754a;

        C11897i(boolean z) {
            this.f21754a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31583d(this.f21754a);
        }
    }

    /* renamed from: w3.y0$j */
    class C11898j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21756a;

        C11898j(long j) {
            this.f21756a = j;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31565T0(this.f21756a);
        }
    }

    /* renamed from: w3.y0$k */
    class C11899k implements MonobService.C7799g0 {
        C11899k() {
        }

        /* renamed from: a */
        public void mo34386a(MonobService.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power != null ? power.name() : "null");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            Long l8 = l;
            sb2.append(l);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lanMode: ");
            Long l9 = l4;
            sb3.append(l9);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onFromPower: ");
            Long l10 = l6;
            sb4.append(l10);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            sb5.append(l2);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("saveState: ");
            Long l11 = l3;
            sb6.append(l11);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowParams: ");
            String str2 = str;
            sb7.append(str2);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("flowing: ");
            Long l12 = l7;
            sb8.append(l12);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("transIntervalDflt: ");
            Long l13 = l5;
            sb9.append(l13);
            C11888y0.this.m30322Z1(power, l, l2, l11, str2, l9, l10, l12, l13);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.y0$l */
    class C11900l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21759a;

        C11900l(int i) {
            this.f21759a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31547K0(this.f21759a);
        }
    }

    /* renamed from: w3.y0$m */
    class C11901m implements WifiDeviceBase.C6080i {
        C11901m() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11888y0.this.f21746B.mo34394a(l);
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
            C11888y0.this.f21746B.mo34401h(MonobService.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.y0$n */
    static /* synthetic */ class C11902n {

        /* renamed from: a */
        static final /* synthetic */ int[] f21762a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.MonobService$Power[] r0 = com.yeelight.yeelib.device.xiaomi.MonobService.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21762a = r0
                com.yeelight.yeelib.device.xiaomi.MonobService$Power r1 = com.yeelight.yeelib.device.xiaomi.MonobService.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21762a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.MonobService$Power r1 = com.yeelight.yeelib.device.xiaomi.MonobService.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11888y0.C11902n.<clinit>():void");
        }
    }

    /* renamed from: w3.y0$o */
    class C11903o implements CompletionHandler {
        C11903o() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.y0$p */
    class C11904p implements CompletionHandler {
        C11904p() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.y0$q */
    class C11905q implements CompletionHandler {
        C11905q() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.y0$r */
    class C11906r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21766a;

        C11906r(long j) {
            this.f21766a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31600l0(this.f21766a);
        }
    }

    /* renamed from: w3.y0$s */
    class C11907s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21768a;

        C11907s(C8327s sVar) {
            this.f21768a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31557P0(this.f21768a);
        }
    }

    /* renamed from: w3.y0$t */
    class C11908t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21770a;

        C11908t(C8327s sVar) {
            this.f21770a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31557P0(this.f21770a);
        }
    }

    /* renamed from: w3.y0$u */
    class C11909u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21772a;

        C11909u(C8327s sVar) {
            this.f21772a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31557P0(this.f21772a);
        }
    }

    /* renamed from: w3.y0$v */
    class C11910v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21774a;

        C11910v(C8327s sVar) {
            this.f21774a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11888y0.this.mo23221d0().mo31557P0(this.f21774a);
        }
    }

    public C11888y0(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m30322Z1(MonobService.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7) {
        boolean z = true;
        if (power != null) {
            mo23221d0().mo31551M0(power == MonobService.Power.on);
        }
        if (l != null) {
            mo23221d0().mo31600l0(l.longValue());
        }
        if (l2 != null) {
            if (mo23221d0().mo31611r(2) == null) {
                mo23221d0().mo31577a(new C12041e(l2.intValue(), l2.intValue()));
            } else {
                mo23221d0().mo31573X0(l2.intValue());
            }
        }
        if (l5 != null) {
            mo23221d0().mo31547K0(l5.intValue());
        }
        mo23221d0().mo31555O0(l3 != null && l3.longValue() == 1);
        mo23221d0().mo31583d(l4 != null && l4.longValue() == 1);
        DeviceStatusBase d0 = mo23221d0();
        if (l6.longValue() == 0) {
            z = false;
        }
        d0.mo31618u0(z);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        if (l7 != null) {
            mo23221d0().mo31565T0(l7.longValue());
        }
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11905q());
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
            case -448603157:
                if (T.equals("yeelink.light.monoa")) {
                    c = 3;
                    break;
                }
                break;
            case -448603156:
                if (T.equals("yeelink.light.monob")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_panel_small;
            case 1:
                return R$drawable.icon_yeelight_device_badge_mono4_small;
            case 2:
                return R$drawable.icon_yeelight_device_badge_mono5_small;
            case 3:
                return R$drawable.icon_yeelight_device_badge_dolphin_small;
            case 4:
                return R$drawable.icon_yeelight_device_badge_monob_small;
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
            case -448603157:
                if (T.equals("yeelink.light.monoa")) {
                    c = 3;
                    break;
                }
                break;
            case -448603156:
                if (T.equals("yeelink.light.monob")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_panel_big;
            case 1:
                return R$drawable.icon_yeelight_device_badge_mono4_big;
            case 2:
                return R$drawable.icon_yeelight_device_badge_mono5_big;
            case 3:
                return R$drawable.icon_yeelight_device_badge_dolphin_big;
            case 4:
                return R$drawable.icon_yeelight_device_badge_monob_big;
            default:
                return R$drawable.icon_yeelight_device_badge_mono4_big;
        }
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11901m();
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
            mo31477F1().sendCmd(MonobService.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11897i(z));
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
            mo31477F1().sendCmd(MonobService.CmdKey.cfg_init_power, String.valueOf(i), new C11900l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(MonobService.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11890b(z));
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
        return mo42391a2(this.f21745A, this.f21746B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21747z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21744C, "Invalid handler!");
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
    public MonobService mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightMonobDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo42391a2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof MonobService.C7807k0)) {
            AppUtils.m8300u(f21744C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (MonobService.C7807k0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23127O1()) {
            return true;
        }
        try {
            mo31477F1().setPower(MonobService.Power.off, new C11904p());
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
            mo31477F1().delCron(0L, new C11892d());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23138Y1()) {
            return true;
        }
        try {
            mo31477F1().setPower(MonobService.Power.on, new C11903o());
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
            mo31477F1().openWithMode(MonobService.Power.on, MonobService.Effect.smooth, Long.valueOf(mo23221d0().mo31554O()), Long.valueOf((long) i), new C11893e(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23121I2(j)) {
            return true;
        }
        try {
            mo31477F1().setBright(Long.valueOf(j), new C11906r(j));
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
            mo31477F1().setDefault(new C11889a(this));
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
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11891c(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21747z);
    }

    /* renamed from: v1 */
    public boolean mo23249v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 9) {
                AppUtils.m8300u("BATCH_RPC", "Mono4Device, Invalid length of batch rpc result: " + str);
            }
            m30322Z1(MonobService.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), jSONArray.getString(4), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)));
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
                mo31477F1().getProperties(new C11899k());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23124L2(sVar)) {
            return true;
        }
        if (sVar.mo35455v()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11907s(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11908t(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene2("bright", Long.valueOf((long) sVar.mo35439f()), new C11909u(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11910v(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f21744C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: y1 */
    public boolean mo23250y1(long j) {
        try {
            MonobService Y1 = mo31477F1();
            MonobService.CmdKey cmdKey = MonobService.CmdKey.trans_default;
            Y1.sendCmd(cmdKey, j + ",1", new C11898j(j));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("TransIntervalDflt").getInternalName()};
    }
}
