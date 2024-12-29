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
import com.yeelight.yeelib.device.xiaomi.Lamp3Service;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp3Device;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import p232y3.C12041e;

/* renamed from: w3.z0 */
public class C11913z0 extends WifiDeviceBase {

    /* renamed from: C */
    public static final String f21776C = "z0";

    /* renamed from: A */
    CompletionHandler f21777A = new C11920g(this);

    /* renamed from: B */
    Lamp3Service.C7541j0 f21778B = new C11921h();

    /* renamed from: z */
    CompletionHandler f21779z = new C11919f(this);

    /* renamed from: w3.z0$a */
    class C11914a implements CompletionHandler {
        C11914a(C11913z0 z0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.z0$b */
    class C11915b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21780a;

        C11915b(boolean z) {
            this.f21780a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31555O0(this.f21780a);
        }
    }

    /* renamed from: w3.z0$c */
    class C11916c implements CompletionHandler {
        C11916c(C11913z0 z0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.z0$d */
    class C11917d implements CompletionHandler {
        C11917d() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.z0$e */
    class C11918e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21783a;

        C11918e(int i) {
            this.f21783a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31551M0(true);
            C11913z0 z0Var = C11913z0.this;
            z0Var.mo23165w1(z0Var.mo23247j1(this.f21783a));
        }
    }

    /* renamed from: w3.z0$f */
    class C11919f implements CompletionHandler {
        C11919f(C11913z0 z0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.z0$g */
    class C11920g implements CompletionHandler {
        C11920g(C11913z0 z0Var) {
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

    /* renamed from: w3.z0$h */
    class C11921h implements Lamp3Service.C7541j0 {
        C11921h() {
        }

        /* renamed from: a */
        public void mo34001a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11913z0.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo34002b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11913z0.this.mo23221d0().mo31611r(2) == null) {
                C11913z0.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11913z0.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo34003c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11913z0.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo34004d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11913z0.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo34005e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11913z0.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo34006f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11913z0.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo34007g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11913z0.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo34008h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onKidLockChanged: ");
            sb.append(l);
            C11913z0.this.mo23221d0().mo31589g(l.longValue() == 1);
        }

        /* renamed from: i */
        public void mo34009i(Lamp3Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11927n.f21794a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11913z0.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11913z0.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }
    }

    /* renamed from: w3.z0$i */
    class C11922i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21786a;

        C11922i(boolean z) {
            this.f21786a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31583d(this.f21786a);
        }
    }

    /* renamed from: w3.z0$j */
    class C11923j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21788a;

        C11923j(boolean z) {
            this.f21788a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31589g(this.f21788a);
        }
    }

    /* renamed from: w3.z0$k */
    class C11924k implements Lamp3Service.C7535g0 {
        C11924k() {
        }

        /* renamed from: a */
        public void mo33995a(Lamp3Service.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7) {
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
            Long l10 = l5;
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
            Long l12 = l6;
            sb8.append(l12);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("kidLock: ");
            Long l13 = l7;
            sb9.append(l13);
            C11913z0.this.m30425Z1(power, l, l2, l11, str2, l9, l10, l12, l13);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.z0$l */
    class C11925l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21791a;

        C11925l(int i) {
            this.f21791a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31547K0(this.f21791a);
        }
    }

    /* renamed from: w3.z0$m */
    class C11926m implements WifiDeviceBase.C6080i {
        C11926m() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11913z0.this.f21778B.mo34001a(l);
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
            C11913z0.this.f21778B.mo34009i(Lamp3Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.z0$n */
    static /* synthetic */ class C11927n {

        /* renamed from: a */
        static final /* synthetic */ int[] f21794a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Lamp3Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Lamp3Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21794a = r0
                com.yeelight.yeelib.device.xiaomi.Lamp3Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp3Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21794a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Lamp3Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp3Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11913z0.C11927n.<clinit>():void");
        }
    }

    /* renamed from: w3.z0$o */
    class C11928o implements CompletionHandler {
        C11928o() {
        }

        public void onFailed(int i, String str) {
            String.format("Lamp3Device.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.z0$p */
    class C11929p implements CompletionHandler {
        C11929p() {
        }

        public void onFailed(int i, String str) {
            String.format("Lamp3Device.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.z0$q */
    class C11930q implements CompletionHandler {
        C11930q() {
        }

        public void onFailed(int i, String str) {
            String.format("Lamp3Device.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.z0$r */
    class C11931r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21798a;

        C11931r(long j) {
            this.f21798a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31600l0(this.f21798a);
        }
    }

    /* renamed from: w3.z0$s */
    class C11932s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21800a;

        C11932s(C8327s sVar) {
            this.f21800a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31557P0(this.f21800a);
        }
    }

    /* renamed from: w3.z0$t */
    class C11933t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21802a;

        C11933t(C8327s sVar) {
            this.f21802a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31557P0(this.f21802a);
        }
    }

    /* renamed from: w3.z0$u */
    class C11934u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21804a;

        C11934u(C8327s sVar) {
            this.f21804a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31557P0(this.f21804a);
        }
    }

    /* renamed from: w3.z0$v */
    class C11935v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21806a;

        C11935v(C8327s sVar) {
            this.f21806a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11913z0.this.mo23221d0().mo31557P0(this.f21806a);
        }
    }

    public C11913z0(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m30425Z1(Lamp3Service.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7) {
        boolean z = true;
        if (power != null) {
            mo23221d0().mo31551M0(power == Lamp3Service.Power.on);
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
        mo23221d0().mo31589g(l7 != null && l7.longValue() == 1);
        DeviceStatusBase d0 = mo23221d0();
        if (l6.longValue() == 0) {
            z = false;
        }
        d0.mo31618u0(z);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11930q());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: F */
    public int mo23116F() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_luna_big;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -1063384687:
                if (T.equals("yeelink.light.lamp17")) {
                    c = 0;
                    break;
                }
                break;
            case -449944728:
                if (T.equals("yeelink.light.lamp3")) {
                    c = 1;
                    break;
                }
                break;
            case -449944726:
                if (T.equals("yeelink.light.lamp5")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_lamp17_small;
            case 1:
                return R$drawable.icon_yeelight_device_badge_muse_small;
            case 2:
                return R$drawable.icon_yeelight_device_badge_muse_le_small;
            default:
                return R$drawable.icon_yeelight_device_badge_muse_small;
        }
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_luna_big;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -1063384687:
                if (T.equals("yeelink.light.lamp17")) {
                    c = 0;
                    break;
                }
                break;
            case -449944728:
                if (T.equals("yeelink.light.lamp3")) {
                    c = 1;
                    break;
                }
                break;
            case -449944726:
                if (T.equals("yeelink.light.lamp5")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_lamp17_big;
            case 1:
                return R$drawable.icon_yeelight_device_badge_muse_big;
            case 2:
                return R$drawable.icon_yeelight_device_badge_muse_le_big;
            default:
                return R$drawable.icon_yeelight_device_badge_muse_big;
        }
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11926m();
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
            mo31477F1().sendCmd(Lamp3Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11922i(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: N1 */
    public boolean mo31485N1(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("setKidLock --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(Lamp3Service.CmdKey.cfg_kid_lock, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11923j(z));
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
            mo31477F1().sendCmd(Lamp3Service.CmdKey.cfg_init_power, String.valueOf(i), new C11925l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Lamp3Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11915b(z));
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
        return mo42403a2(this.f21777A, this.f21778B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21779z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21776C, "Invalid handler!");
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
    public Lamp3Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightLamp3Device) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo42403a2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Lamp3Service.C7541j0)) {
            AppUtils.m8300u(f21776C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Lamp3Service.C7541j0) obj2);
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
            mo31477F1().setPower(Lamp3Service.Power.off, new C11929p());
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
            mo31477F1().delCron(0L, new C11917d());
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
            mo31477F1().setPower(Lamp3Service.Power.on, new C11928o());
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
            mo31477F1().openWithMode(Lamp3Service.Power.on, Lamp3Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11918e(i));
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
            mo31477F1().setBright(Long.valueOf(j), Lamp3Service.Effect.smooth, 500L, new C11931r(j));
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
            mo31477F1().setDefault(new C11914a(this));
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
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11916c(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21779z);
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
                AppUtils.m8300u("BATCH_RPC", "Lamp3Device, Invalid length of batch rpc result: " + str);
            }
            m30425Z1(Lamp3Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), jSONArray.getString(4), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)));
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
                mo31477F1().getProperties(new C11924k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11932s(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11933t(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11934u(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11935v(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f21776C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty(Lamp3Service.PROPERTY_KidLock).getInternalName()};
    }
}
