package p223w3;

import android.text.TextUtils;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.CtService;
import com.yeelight.yeelib.device.xiaomi.YeelightCtDevice;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import p227x3.C11969f;
import p232y3.C12041e;

/* renamed from: w3.x */
public class C11819x extends WifiDeviceBase {

    /* renamed from: C */
    public static final String f21648C = "x";

    /* renamed from: A */
    CompletionHandler f21649A = new C11827h(this);

    /* renamed from: B */
    CtService.C7295k0 f21650B = new C11828i();

    /* renamed from: z */
    CompletionHandler f21651z = new C11826g(this);

    /* renamed from: w3.x$a */
    class C11820a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21652a;

        C11820a(C8327s sVar) {
            this.f21652a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31557P0(this.f21652a);
        }
    }

    /* renamed from: w3.x$b */
    class C11821b implements CompletionHandler {
        C11821b(C11819x xVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.x$c */
    class C11822c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21654a;

        C11822c(boolean z) {
            this.f21654a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31555O0(this.f21654a);
        }
    }

    /* renamed from: w3.x$d */
    class C11823d implements CompletionHandler {
        C11823d(C11819x xVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.x$e */
    class C11824e implements CompletionHandler {
        C11824e() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.x$f */
    class C11825f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21657a;

        C11825f(int i) {
            this.f21657a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31551M0(true);
            C11819x xVar = C11819x.this;
            xVar.mo23165w1(xVar.mo23247j1(this.f21657a));
        }
    }

    /* renamed from: w3.x$g */
    class C11826g implements CompletionHandler {
        C11826g(C11819x xVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.x$h */
    class C11827h implements CompletionHandler {
        C11827h(C11819x xVar) {
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

    /* renamed from: w3.x$i */
    class C11828i implements CtService.C7295k0 {
        C11828i() {
        }

        /* renamed from: a */
        public void mo33629a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11819x.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo33630b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDelayOffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11819x.this.mo23221d0().mo31611r(2) == null) {
                C11819x.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11819x.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo33631c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11819x.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo33632d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11819x.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo33633e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11819x.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo33634f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11819x.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo33635g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11819x.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo33636h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtChanged: ");
            sb.append(l);
            C11819x.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo33637i(CtService.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerChanged: ");
            sb.append(power.name());
            int i = C11833n.f21666a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11819x.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11819x.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }
    }

    /* renamed from: w3.x$j */
    class C11829j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21660a;

        C11829j(boolean z) {
            this.f21660a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31583d(this.f21660a);
        }
    }

    /* renamed from: w3.x$k */
    class C11830k implements CtService.C7289h0 {
        C11830k() {
        }

        /* renamed from: a */
        public void mo33623a(CtService.Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7) {
            StringBuilder sb = new StringBuilder();
            sb.append("bright: ");
            Long l8 = l;
            sb.append(l);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lanMode: ");
            sb2.append(l5);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ct: ");
            Long l9 = l2;
            sb3.append(l2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("power: ");
            sb4.append(power == null ? "null" : power.name());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            Long l10 = l3;
            sb5.append(l10);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("saveState: ");
            Long l11 = l4;
            sb6.append(l11);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowing : ");
            Long l12 = l7;
            sb7.append(l12);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("onFromPower : ");
            Long l13 = l6;
            sb8.append(l13);
            C11819x.this.m30173Z1(power, l, l2, l10, l11, str, l5, l13, l12);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.x$l */
    class C11831l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21663a;

        C11831l(int i) {
            this.f21663a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31547K0(this.f21663a);
        }
    }

    /* renamed from: w3.x$m */
    class C11832m implements WifiDeviceBase.C6080i {
        C11832m() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11819x.this.f21650B.mo33629a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11819x.this.f21650B.mo33636h(l);
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
            C11819x.this.f21650B.mo33637i(CtService.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.x$n */
    static /* synthetic */ class C11833n {

        /* renamed from: a */
        static final /* synthetic */ int[] f21666a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.CtService$Power[] r0 = com.yeelight.yeelib.device.xiaomi.CtService.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21666a = r0
                com.yeelight.yeelib.device.xiaomi.CtService$Power r1 = com.yeelight.yeelib.device.xiaomi.CtService.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21666a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.CtService$Power r1 = com.yeelight.yeelib.device.xiaomi.CtService.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11819x.C11833n.<clinit>():void");
        }
    }

    /* renamed from: w3.x$o */
    class C11834o implements CompletionHandler {
        C11834o() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.x$p */
    class C11835p implements CompletionHandler {
        C11835p() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.x$q */
    class C11836q implements CompletionHandler {
        C11836q() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.x$r */
    class C11837r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21670a;

        C11837r(long j) {
            this.f21670a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31600l0(this.f21670a);
        }
    }

    /* renamed from: w3.x$s */
    class C11838s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21672a;

        C11838s(int i) {
            this.f21672a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31610q0(this.f21672a);
        }
    }

    /* renamed from: w3.x$t */
    class C11839t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21674a;

        C11839t(C8327s sVar) {
            this.f21674a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31557P0(this.f21674a);
        }
    }

    /* renamed from: w3.x$u */
    class C11840u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21676a;

        C11840u(C8327s sVar) {
            this.f21676a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31557P0(this.f21676a);
        }
    }

    /* renamed from: w3.x$v */
    class C11841v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21678a;

        C11841v(C8327s sVar) {
            this.f21678a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11819x.this.mo23221d0().mo31557P0(this.f21678a);
        }
    }

    public C11819x(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m30173Z1(CtService.Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7) {
        boolean z = true;
        if (power != null) {
            mo23221d0().mo31551M0(power == CtService.Power.on);
        }
        if (l != null) {
            mo23221d0().mo31600l0(l.longValue());
        }
        if (l6 != null) {
            mo23221d0().mo31547K0(l6.intValue());
        }
        if (l2 != null) {
            mo23221d0().mo31610q0(l2.intValue());
        }
        if (l3 != null) {
            if (mo23221d0().mo31611r(2) == null) {
                mo23221d0().mo31577a(new C12041e(l3.intValue(), l3.intValue()));
            } else {
                mo23221d0().mo31573X0(l3.intValue());
            }
        }
        mo23221d0().mo31555O0(l4 != null && l4.longValue() == 1);
        mo23221d0().mo31583d(l5 != null && l5.longValue() == 1);
        if (!TextUtils.isEmpty(str) && !"NULL".equalsIgnoreCase(str)) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        DeviceStatusBase d0 = mo23221d0();
        if (l7 == null || l7.longValue() == 0) {
            z = false;
        }
        d0.mo31618u0(z);
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11836q());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: F */
    public int mo23116F() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_lemon_ct_small;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -948847038:
                if (T.equals("yeelink.light.panel3")) {
                    c = 0;
                    break;
                }
                break;
            case -845289553:
                if (T.equals("yeelink.light.strip4")) {
                    c = 1;
                    break;
                }
                break;
            case 1201756974:
                if (T.equals("yeelink.light.ct2")) {
                    c = 2;
                    break;
                }
                break;
            case 1201757021:
                if (T.equals("yeelink.light.cta")) {
                    c = 3;
                    break;
                }
                break;
            case 1201757023:
                if (T.equals("yeelink.light.ctc")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_panel_small;
            case 1:
                return R$drawable.icon_yeelight_device_badge_stripe4_small;
            case 2:
            case 3:
                return R$drawable.icon_yeelight_device_badge_lemon_ct_small;
            case 4:
                return R$drawable.icon_yeelight_device_badge_lemon4_ct_small;
            default:
                return R$drawable.icon_yeelight_device_badge_lemon_ct_small;
        }
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_lemon_ct_big;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -948847038:
                if (T.equals("yeelink.light.panel3")) {
                    c = 0;
                    break;
                }
                break;
            case -845289553:
                if (T.equals("yeelink.light.strip4")) {
                    c = 1;
                    break;
                }
                break;
            case 1201756974:
                if (T.equals("yeelink.light.ct2")) {
                    c = 2;
                    break;
                }
                break;
            case 1201757021:
                if (T.equals("yeelink.light.cta")) {
                    c = 3;
                    break;
                }
                break;
            case 1201757023:
                if (T.equals("yeelink.light.ctc")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_panel_big;
            case 1:
                return R$drawable.icon_yeelight_device_badge_stripe4_big;
            case 2:
            case 3:
                return R$drawable.icon_yeelight_device_badge_lemon_ct_big;
            case 4:
                return R$drawable.icon_yeelight_device_badge_lemon4_ct_big;
            default:
                return R$drawable.icon_yeelight_device_badge_lemon_ct_big;
        }
    }

    /* renamed from: J0 */
    public void mo23191J0(C11969f fVar) {
        super.mo23191J0(fVar);
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11832m();
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
            mo31477F1().sendCmd(CtService.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11829j(z));
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
            mo31477F1().sendCmd(CtService.CmdKey.cfg_init_power, String.valueOf(i), new C11831l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(CtService.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11822c(z));
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
        return mo42385a2(this.f21649A, this.f21650B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21651z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21648C, "Invalid handler!");
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
    public CtService mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCtDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo42385a2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof CtService.C7295k0)) {
            AppUtils.m8300u(f21648C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (CtService.C7295k0) obj2);
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
            mo31477F1().setPower(CtService.Power.off, new C11835p());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11824e());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(CtService.Power.on, new C11834o());
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
            mo31477F1().openWithMode(CtService.Power.on, CtService.Effect.smooth, 500L, Long.valueOf((long) i), new C11825f(i));
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
            mo31477F1().setBright(Long.valueOf(j), CtService.Effect.smooth, 500L, new C11837r(j));
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
            mo31477F1().setCt(Long.valueOf((long) i), CtService.Effect.smooth, 500L, new C11838s(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11821b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11823d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21651z);
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
                AppUtils.m8300u("BATCH_RPC", "CtDevice, Invalid length of batch rpc result: " + str);
            }
            m30173Z1(CtService.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)));
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
                mo31477F1().getProperties(new C11830k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11839t(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11840u(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11841v(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11820a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f21648C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName()};
    }
}
