package p223w3;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.Lamp9Service;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp9Device;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import p232y3.C12041e;

/* renamed from: w3.j0 */
public class C11223j0 extends WifiDeviceBase {

    /* renamed from: C */
    public static final String f20750C = "j0";

    /* renamed from: A */
    CompletionHandler f20751A = new C11232i(this);

    /* renamed from: B */
    Lamp9Service.C7639r0 f20752B = new C11233j();

    /* renamed from: z */
    CompletionHandler f20753z = new C11231h(this);

    /* renamed from: w3.j0$a */
    class C11224a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20754a;

        C11224a(C8327s sVar) {
            this.f20754a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31557P0(this.f20754a);
        }
    }

    /* renamed from: w3.j0$b */
    class C11225b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20756a;

        C11225b(C8327s sVar) {
            this.f20756a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31557P0(this.f20756a);
        }
    }

    /* renamed from: w3.j0$c */
    class C11226c implements CompletionHandler {
        C11226c(C11223j0 j0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.j0$d */
    class C11227d implements CompletionHandler {
        C11227d() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.j0$e */
    class C11228e implements CompletionHandler {
        C11228e(C11223j0 j0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.j0$f */
    class C11229f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20759a;

        C11229f(boolean z) {
            this.f20759a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31555O0(this.f20759a);
        }
    }

    /* renamed from: w3.j0$g */
    class C11230g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20761a;

        C11230g(int i) {
            this.f20761a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31551M0(true);
            C11223j0 j0Var = C11223j0.this;
            j0Var.mo23165w1(j0Var.mo23247j1(this.f20761a));
        }
    }

    /* renamed from: w3.j0$h */
    class C11231h implements CompletionHandler {
        C11231h(C11223j0 j0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.j0$i */
    class C11232i implements CompletionHandler {
        C11232i(C11223j0 j0Var) {
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

    /* renamed from: w3.j0$j */
    class C11233j implements Lamp9Service.C7639r0 {
        C11233j() {
        }

        /* renamed from: a */
        public void mo34137a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11223j0.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo34138b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11223j0.this.mo23221d0().mo31611r(2) == null) {
                C11223j0.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11223j0.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo34139c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11223j0.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo34140d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11223j0.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo34141e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11223j0.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo34142f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l.intValue());
            C11223j0.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo34143g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11223j0.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo34144h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l.intValue());
            C11223j0.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo34145i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C11223j0.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C11223j0.this.mo23221d0().mo31543I0(true);
                }
                C11223j0.this.mo23221d0().mo31541H0(split[1]);
                C11223j0.this.mo23221d0().mo31539G0(split[2]);
                C11223j0.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C11223j0.f20750C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C11223j0.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C11223j0.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C11223j0.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo34146j(Lamp9Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11241r.f20777a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11223j0.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11223j0.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: k */
        public void mo34147k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNLBrightChanged: ");
            sb.append(l);
            if (l.longValue() != 0) {
                C11223j0.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
                C11223j0.this.mo23221d0().mo31545J0(l.longValue());
                return;
            }
            C11223j0.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        }
    }

    /* renamed from: w3.j0$k */
    class C11234k implements Lamp9Service.C7633o0 {
        C11234k() {
        }

        /* renamed from: a */
        public void mo34131a(Lamp9Service.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8) {
            StringBuilder sb = new StringBuilder();
            sb.append("bright: ");
            sb.append(l);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ct: ");
            sb2.append(l2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("delayoff: ");
            sb3.append(l3);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("power: ");
            sb4.append(power != null ? power.name() : "null");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("flowing : ");
            Long l9 = l7;
            sb5.append(l9);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("lanMode: ");
            Long l10 = l4;
            sb6.append(l10);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("onFromPower: ");
            Long l11 = l6;
            sb7.append(l11);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("saveState: ");
            Long l12 = l5;
            sb8.append(l12);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("flowParams: ");
            String str3 = str;
            sb9.append(str3);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("nightTimeInfo: ");
            String str4 = str2;
            sb10.append(str4);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("nLBright: ");
            Long l13 = l8;
            sb11.append(l13);
            C11223j0.this.m28568Z1(power, l, l2, l3, str3, l10, l12, l11, l9, str4, l13);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.j0$l */
    class C11235l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20765a;

        C11235l(boolean z) {
            this.f20765a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31620v0(this.f20765a);
        }
    }

    /* renamed from: w3.j0$m */
    class C11236m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20767a;

        C11236m(boolean z) {
            this.f20767a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31583d(this.f20767a);
        }
    }

    /* renamed from: w3.j0$n */
    class C11237n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20769a;

        C11237n(int i) {
            this.f20769a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31547K0(this.f20769a);
        }
    }

    /* renamed from: w3.j0$o */
    class C11238o implements CompletionHandler {
        C11238o(C11223j0 j0Var) {
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

    /* renamed from: w3.j0$p */
    class C11239p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20771a;

        /* renamed from: b */
        final /* synthetic */ String f20772b;

        /* renamed from: c */
        final /* synthetic */ String f20773c;

        /* renamed from: d */
        final /* synthetic */ int f20774d;

        C11239p(boolean z, String str, String str2, int i) {
            this.f20771a = z;
            this.f20772b = str;
            this.f20773c = str2;
            this.f20774d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31543I0(this.f20771a);
            C11223j0.this.mo23221d0().mo31541H0(this.f20772b);
            C11223j0.this.mo23221d0().mo31539G0(this.f20773c);
            C11223j0.this.mo23221d0().mo31537F0(this.f20774d);
        }
    }

    /* renamed from: w3.j0$q */
    class C11240q implements WifiDeviceBase.C6080i {
        C11240q() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11223j0.this.f20752B.mo34137a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11223j0.this.f20752B.mo34144h(l);
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
            C11223j0.this.f20752B.mo34146j(Lamp9Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.j0$r */
    static /* synthetic */ class C11241r {

        /* renamed from: a */
        static final /* synthetic */ int[] f20777a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Lamp9Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20777a = r0
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp9Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20777a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp9Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11223j0.C11241r.<clinit>():void");
        }
    }

    /* renamed from: w3.j0$s */
    class C11242s implements CompletionHandler {
        C11242s() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.open --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.j0$t */
    class C11243t implements CompletionHandler {
        C11243t() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.j0$u */
    class C11244u implements CompletionHandler {
        C11244u() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.j0$v */
    class C11245v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20781a;

        C11245v(long j) {
            this.f20781a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31600l0(this.f20781a);
        }
    }

    /* renamed from: w3.j0$w */
    class C11246w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20783a;

        C11246w(int i) {
            this.f20783a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31610q0(this.f20783a);
        }
    }

    /* renamed from: w3.j0$x */
    class C11247x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20785a;

        C11247x(C8327s sVar) {
            this.f20785a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31557P0(this.f20785a);
        }
    }

    /* renamed from: w3.j0$y */
    class C11248y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20787a;

        C11248y(C8327s sVar) {
            this.f20787a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31557P0(this.f20787a);
        }
    }

    /* renamed from: w3.j0$z */
    class C11249z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20789a;

        C11249z(C8327s sVar) {
            this.f20789a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11223j0.this.mo23221d0().mo31557P0(this.f20789a);
        }
    }

    public C11223j0(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m28568Z1(Lamp9Service.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8) {
        if (power != null) {
            mo23221d0().mo31551M0(power == Lamp9Service.Power.on);
        }
        if (l != null) {
            mo23221d0().mo31600l0(l.longValue());
        }
        if (l2 != null) {
            mo23221d0().mo31610q0(l2.intValue());
        }
        if (l6 != null) {
            mo23221d0().mo31547K0(l6.intValue());
        }
        if (l3 != null) {
            if (mo23221d0().mo31611r(2) == null) {
                mo23221d0().mo31577a(new C12041e(l3.intValue(), l3.intValue()));
            } else {
                mo23221d0().mo31573X0(l3.intValue());
            }
        }
        mo23221d0().mo31583d(l4 != null && l4.longValue() == 1);
        mo23221d0().mo31555O0(l5 != null && l5.longValue() == 1);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        mo23221d0().mo31618u0(l7.longValue() != 0);
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
        if (l8.longValue() == 0) {
            mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
            return;
        }
        mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
        mo23221d0().mo31545J0(l8.longValue());
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11244u());
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
        return R$drawable.icon_yeelight_device_badge_lamp9_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_lamp9_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11240q();
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
            mo31477F1().sendCmd(Lamp9Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11236m(z));
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
            mo31477F1().sendCmd(Lamp9Service.CmdKey.cfg_kidmode, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11235l(z));
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
            mo31477F1().sendCmd(Lamp9Service.CmdKey.cfg_init_power, String.valueOf(i), new C11237n(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Lamp9Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11229f(z));
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
            mo31477F1().sendCmd(Lamp9Service.CmdKey.cfg_shortkey, str2, new C11238o(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42304a2(this.f20751A, this.f20752B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20753z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20750C, "Invalid handler!");
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
    public Lamp9Service mo31477F1() {
        return ((YeelightLamp9Device) this.f4749n).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo42304a2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Lamp9Service.C7639r0)) {
            AppUtils.m8300u(f20750C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Lamp9Service.C7639r0) obj2);
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
            mo31477F1().setPower(Lamp9Service.Power.off, new C11243t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11227d());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
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
            Lamp9Service Y1 = mo31477F1();
            Lamp9Service.CmdKey cmdKey = Lamp9Service.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            Y1.sendCmd(cmdKey, sb2.toString(), new C11239p(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Lamp9Service.Power.on, new C11242s());
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
            mo31477F1().openWithMode(Lamp9Service.Power.on, Lamp9Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11230g(i));
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
            mo31477F1().setBright(Long.valueOf(j), Lamp9Service.Effect.smooth, 500L, new C11245v(j));
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
            mo31477F1().setCt(Long.valueOf((long) i), Lamp9Service.Effect.smooth, 500L, new C11246w(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11228e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11226c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20753z);
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
                AppUtils.m8300u("BATCH_RPC", "MangoDevice, Invalid length of batch rpc result: " + str);
            }
            m28568Z1(Lamp9Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), jSONArray.getString(4), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)));
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
                mo31477F1().getProperties(new C11234k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11247x(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11248y(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11249z(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11224a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C11225b(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f20750C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty("NLBright").getInternalName()};
    }
}
