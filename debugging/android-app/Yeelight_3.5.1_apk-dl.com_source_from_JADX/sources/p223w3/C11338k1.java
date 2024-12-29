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
import com.yeelight.yeelib.device.xiaomi.Stripe4Service;
import com.yeelight.yeelib.device.xiaomi.YeelightStripe4Device;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import p207s3.C10333b;
import p227x3.C11969f;
import p232y3.C12041e;

/* renamed from: w3.k1 */
public class C11338k1 extends C10333b {

    /* renamed from: C */
    public static final String f20920C = "k1";

    /* renamed from: A */
    CompletionHandler f20921A = new C11347i(this);

    /* renamed from: B */
    Stripe4Service.C8030m0 f20922B = new C11348j();

    /* renamed from: z */
    CompletionHandler f20923z = new C11346h(this);

    /* renamed from: w3.k1$a */
    class C11339a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20924a;

        C11339a(C8327s sVar) {
            this.f20924a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31557P0(this.f20924a);
        }
    }

    /* renamed from: w3.k1$b */
    class C11340b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20926a;

        C11340b(C8327s sVar) {
            this.f20926a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31557P0(this.f20926a);
        }
    }

    /* renamed from: w3.k1$c */
    class C11341c implements CompletionHandler {
        C11341c(C11338k1 k1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k1$d */
    class C11342d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20928a;

        C11342d(boolean z) {
            this.f20928a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31555O0(this.f20928a);
        }
    }

    /* renamed from: w3.k1$e */
    class C11343e implements CompletionHandler {
        C11343e(C11338k1 k1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k1$f */
    class C11344f implements CompletionHandler {
        C11344f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.k1$g */
    class C11345g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20931a;

        C11345g(int i) {
            this.f20931a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31551M0(true);
            C11338k1 k1Var = C11338k1.this;
            k1Var.mo23165w1(k1Var.mo23247j1(this.f20931a));
        }
    }

    /* renamed from: w3.k1$h */
    class C11346h implements CompletionHandler {
        C11346h(C11338k1 k1Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k1$i */
    class C11347i implements CompletionHandler {
        C11347i(C11338k1 k1Var) {
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

    /* renamed from: w3.k1$j */
    class C11348j implements Stripe4Service.C8030m0 {
        C11348j() {
        }

        /* renamed from: a */
        public void mo34722a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11338k1.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo34723b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDelayOffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11338k1.this.mo23221d0().mo31611r(2) == null) {
                C11338k1.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11338k1.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo34724c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11338k1.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo34725d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11338k1.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo34726e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11338k1.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo34727f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11338k1.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo34728g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11338k1.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo34729h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtChanged: ");
            sb.append(l);
            C11338k1.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo34730i(Stripe4Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerChanged: ");
            sb.append(power.name());
            int i = C11354p.f20941a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11338k1.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11338k1.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: o */
        public void mo34731o(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSmartSwitchChanged: ");
            sb.append(l);
            C11338k1.this.mo23221d0().mo31597k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: w3.k1$k */
    class C11349k implements CompletionHandler {
        C11349k(C11338k1 k1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k1$l */
    class C11350l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20934a;

        C11350l(boolean z) {
            this.f20934a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31583d(this.f20934a);
        }
    }

    /* renamed from: w3.k1$m */
    class C11351m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20936a;

        C11351m(int i) {
            this.f20936a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31547K0(this.f20936a);
        }
    }

    /* renamed from: w3.k1$n */
    class C11352n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20938a;

        C11352n(boolean z) {
            this.f20938a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31597k(this.f20938a);
        }
    }

    /* renamed from: w3.k1$o */
    class C11353o implements WifiDeviceBase.C6080i {
        C11353o() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11338k1.this.f20922B.mo34722a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11338k1.this.f20922B.mo34729h(l);
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
            C11338k1.this.f20922B.mo34730i(Stripe4Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.k1$p */
    static /* synthetic */ class C11354p {

        /* renamed from: a */
        static final /* synthetic */ int[] f20941a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Stripe4Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20941a = r0
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Stripe4Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20941a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Stripe4Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11338k1.C11354p.<clinit>():void");
        }
    }

    /* renamed from: w3.k1$q */
    class C11355q implements Stripe4Service.C8022i0 {
        C11355q() {
        }

        /* renamed from: a */
        public void mo34714a(Stripe4Service.Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8) {
            StringBuilder sb = new StringBuilder();
            sb.append("bright: ");
            Long l9 = l;
            sb.append(l);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lanMode: ");
            Long l10 = l5;
            sb2.append(l10);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ct: ");
            Long l11 = l2;
            sb3.append(l11);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("power: ");
            sb4.append(power.name());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            Long l12 = l3;
            sb5.append(l12);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("saveState: ");
            Long l13 = l4;
            sb6.append(l13);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowing : ");
            Long l14 = l7;
            sb7.append(l14);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("onFromPower : ");
            Long l15 = l6;
            sb8.append(l15);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("smartSwitch : ");
            Long l16 = l8;
            sb9.append(l16);
            C11338k1.this.m28807k2(power, l, l11, l12, l13, str, l10, l15, l14, l16);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.k1$r */
    class C11356r implements CompletionHandler {
        C11356r() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.k1$s */
    class C11357s implements CompletionHandler {
        C11357s() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.k1$t */
    class C11358t implements CompletionHandler {
        C11358t() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.k1$u */
    class C11359u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20946a;

        C11359u(long j) {
            this.f20946a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31600l0(this.f20946a);
        }
    }

    /* renamed from: w3.k1$v */
    class C11360v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20948a;

        C11360v(int i) {
            this.f20948a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31610q0(this.f20948a);
        }
    }

    /* renamed from: w3.k1$w */
    class C11361w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20950a;

        C11361w(C8327s sVar) {
            this.f20950a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31557P0(this.f20950a);
        }
    }

    /* renamed from: w3.k1$x */
    class C11362x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20952a;

        C11362x(C8327s sVar) {
            this.f20952a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11338k1.this.mo23221d0().mo31557P0(this.f20952a);
        }
    }

    public C11338k1(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m28807k2(Stripe4Service.Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8) {
        boolean z = true;
        if (power != null) {
            mo23221d0().mo31551M0(power == Stripe4Service.Power.on);
        }
        if (l != null) {
            mo23221d0().mo31600l0(l.longValue());
        }
        if (l6 != null) {
            mo23221d0().mo31547K0(l6.intValue());
        }
        mo23221d0().mo31610q0(l2.intValue());
        if (l3 != null) {
            if (mo23221d0().mo31611r(2) == null) {
                mo23221d0().mo31577a(new C12041e(l3.intValue(), l3.intValue()));
            } else {
                mo23221d0().mo31573X0(l3.intValue());
            }
        }
        mo23221d0().mo31555O0(l4 != null && l4.longValue() == 1);
        mo23221d0().mo31583d(l5 != null && l5.longValue() == 1);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        mo23221d0().mo31618u0(l7.longValue() != 0);
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
            mo31477F1().toggle(new C11358t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: F */
    public int mo23116F() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_stripe4_small;
        }
        String T = mo23208T();
        T.hashCode();
        return !T.equals("yeelink.light.strip4") ? R$drawable.icon_yeelight_device_badge_stripe4_small : R$drawable.icon_yeelight_device_badge_stripe4_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_stripe4_big;
        }
        String T = mo23208T();
        T.hashCode();
        return !T.equals("yeelink.light.strip4") ? R$drawable.icon_yeelight_device_badge_stripe4_big : R$drawable.icon_yeelight_device_badge_stripe4_big;
    }

    /* renamed from: J0 */
    public void mo23191J0(C11969f fVar) {
        super.mo23191J0(fVar);
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11353o();
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
            mo31477F1().sendCmd(Stripe4Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11350l(z));
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
            mo31477F1().sendCmd(Stripe4Service.CmdKey.cfg_init_power, String.valueOf(i), new C11351m(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Stripe4Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11342d(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23210U() {
        String U = super.mo23210U();
        return (U == null || U.isEmpty()) ? C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_color) : super.mo23210U();
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42314l2(this.f20921A, this.f20922B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20923z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20920C, "Invalid handler!");
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
            mo31477F1().setPower(Stripe4Service.Power.off, new C11357s());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11344f());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: f2 */
    public boolean mo41885f2(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendRemoteKey --> Invoke, enable : ");
        sb.append(i);
        try {
            mo31477F1().sendCmd(Stripe4Service.CmdKey.pseudo_beacon, "4097|" + i, new C11349k(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Stripe4Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightStripe4Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Stripe4Service.Power.on, new C11356r());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42314l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Stripe4Service.C8030m0)) {
            AppUtils.m8300u(f20920C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Stripe4Service.C8030m0) obj2);
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
            mo31477F1().openWithMode(Stripe4Service.Power.on, Stripe4Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11345g(i));
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
            mo31477F1().setBright(Long.valueOf(j), Stripe4Service.Effect.smooth, 500L, new C11359u(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        if (super.mo23159s1(i)) {
            return true;
        }
        try {
            mo31477F1().setCt(Long.valueOf((long) i), Stripe4Service.Effect.smooth, 500L, new C11360v(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11341c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11343e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        try {
            mo31477F1().sendCmd(Stripe4Service.CmdKey.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11352n(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20923z);
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
                AppUtils.m8300u("BATCH_RPC", "CtDevice, Invalid length of batch rpc result: " + str);
            }
            m28807k2(Stripe4Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)));
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
                mo31477F1().getProperties(new C11355q());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11361w(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11362x(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11339a(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11340b(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f20920C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("SmartSwitch").getInternalName()};
    }
}
