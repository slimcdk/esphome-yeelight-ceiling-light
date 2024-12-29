package p223w3;

import android.text.TextUtils;
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
import com.yeelight.yeelib.device.xiaomi.CtaService;
import com.yeelight.yeelib.device.xiaomi.YeelightCtaDevice;
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

/* renamed from: w3.y */
public class C11864y extends WifiDeviceBase {

    /* renamed from: C */
    public static final String f21710C = "y";

    /* renamed from: A */
    CompletionHandler f21711A = new C11872h(this);

    /* renamed from: B */
    CtaService.C7338n0 f21712B = new C11873i();

    /* renamed from: z */
    CompletionHandler f21713z = new C11871g(this);

    /* renamed from: w3.y$a */
    class C11865a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21714a;

        C11865a(C8327s sVar) {
            this.f21714a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31557P0(this.f21714a);
        }
    }

    /* renamed from: w3.y$b */
    class C11866b implements CompletionHandler {
        C11866b(C11864y yVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.y$c */
    class C11867c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21716a;

        C11867c(boolean z) {
            this.f21716a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31555O0(this.f21716a);
        }
    }

    /* renamed from: w3.y$d */
    class C11868d implements CompletionHandler {
        C11868d(C11864y yVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.y$e */
    class C11869e implements CompletionHandler {
        C11869e() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.y$f */
    class C11870f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21719a;

        C11870f(int i) {
            this.f21719a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31551M0(true);
            C11864y yVar = C11864y.this;
            yVar.mo23165w1(yVar.mo23247j1(this.f21719a));
        }
    }

    /* renamed from: w3.y$g */
    class C11871g implements CompletionHandler {
        C11871g(C11864y yVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.y$h */
    class C11872h implements CompletionHandler {
        C11872h(C11864y yVar) {
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

    /* renamed from: w3.y$i */
    class C11873i implements CtaService.C7338n0 {
        C11873i() {
        }

        /* renamed from: a */
        public void mo33687a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11864y.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo33688b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDelayOffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11864y.this.mo23221d0().mo31611r(2) == null) {
                C11864y.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11864y.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo33689c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11864y.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo33690d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11864y.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo33691e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11864y.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo33692f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11864y.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo33693g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11864y.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo33694h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtChanged: ");
            sb.append(l);
            C11864y.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo33695i(CtaService.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerChanged: ");
            sb.append(power.name());
            int i = C11879o.f21730a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11864y.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11864y.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: p */
        public void mo33696p(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onTransIntervalDfltChanged: ");
            sb.append(l);
            if (l != null) {
                C11864y.this.mo23221d0().mo31565T0(l.longValue());
            }
        }
    }

    /* renamed from: w3.y$j */
    class C11874j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21722a;

        C11874j(boolean z) {
            this.f21722a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31583d(this.f21722a);
        }
    }

    /* renamed from: w3.y$k */
    class C11875k implements CtaService.C7330j0 {
        C11875k() {
        }

        /* renamed from: a */
        public void mo33679a(CtaService.Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8) {
            StringBuilder sb = new StringBuilder();
            sb.append("bright: ");
            Long l9 = l;
            sb.append(l);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lanMode: ");
            sb2.append(l5);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ct: ");
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
            Long l12 = l8;
            sb7.append(l12);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("onFromPower : ");
            Long l13 = l7;
            sb8.append(l13);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("transIntervalDflt : ");
            Long l14 = l6;
            sb9.append(l14);
            C11864y.this.m30271Z1(power, l, l2, l10, l11, str, l5, l13, l12, l14);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.y$l */
    class C11876l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21725a;

        C11876l(long j) {
            this.f21725a = j;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31565T0(this.f21725a);
        }
    }

    /* renamed from: w3.y$m */
    class C11877m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21727a;

        C11877m(int i) {
            this.f21727a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31547K0(this.f21727a);
        }
    }

    /* renamed from: w3.y$n */
    class C11878n implements WifiDeviceBase.C6080i {
        C11878n() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11864y.this.f21712B.mo33687a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11864y.this.f21712B.mo33694h(l);
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
            C11864y.this.f21712B.mo33695i(CtaService.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.y$o */
    static /* synthetic */ class C11879o {

        /* renamed from: a */
        static final /* synthetic */ int[] f21730a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.CtaService$Power[] r0 = com.yeelight.yeelib.device.xiaomi.CtaService.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21730a = r0
                com.yeelight.yeelib.device.xiaomi.CtaService$Power r1 = com.yeelight.yeelib.device.xiaomi.CtaService.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21730a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.CtaService$Power r1 = com.yeelight.yeelib.device.xiaomi.CtaService.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11864y.C11879o.<clinit>():void");
        }
    }

    /* renamed from: w3.y$p */
    class C11880p implements CompletionHandler {
        C11880p() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.y$q */
    class C11881q implements CompletionHandler {
        C11881q() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.y$r */
    class C11882r implements CompletionHandler {
        C11882r() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.y$s */
    class C11883s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21734a;

        C11883s(long j) {
            this.f21734a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31600l0(this.f21734a);
        }
    }

    /* renamed from: w3.y$t */
    class C11884t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21736a;

        C11884t(int i) {
            this.f21736a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31610q0(this.f21736a);
        }
    }

    /* renamed from: w3.y$u */
    class C11885u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21738a;

        C11885u(C8327s sVar) {
            this.f21738a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31557P0(this.f21738a);
        }
    }

    /* renamed from: w3.y$v */
    class C11886v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21740a;

        C11886v(C8327s sVar) {
            this.f21740a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31557P0(this.f21740a);
        }
    }

    /* renamed from: w3.y$w */
    class C11887w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21742a;

        C11887w(C8327s sVar) {
            this.f21742a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11864y.this.mo23221d0().mo31557P0(this.f21742a);
        }
    }

    public C11864y(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m30271Z1(CtaService.Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8) {
        boolean z = true;
        if (power != null) {
            mo23221d0().mo31551M0(power == CtaService.Power.on);
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
        if (l8 != null) {
            mo23221d0().mo31565T0(l8.longValue());
        }
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11882r());
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
        this.f12430x = new C11878n();
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
            mo31477F1().sendCmd(CtaService.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11874j(z));
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
            mo31477F1().sendCmd(CtaService.CmdKey.cfg_init_power, String.valueOf(i), new C11877m(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(CtaService.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11867c(z));
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
        return mo42389a2(this.f21711A, this.f21712B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21713z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21710C, "Invalid handler!");
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
    public CtaService mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCtaDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo42389a2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof CtaService.C7338n0)) {
            AppUtils.m8300u(f21710C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (CtaService.C7338n0) obj2);
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
            mo31477F1().setPower(CtaService.Power.off, new C11881q());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11869e());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23138Y1()) {
            return true;
        }
        try {
            mo31477F1().setPower(CtaService.Power.on, new C11880p());
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
            mo31477F1().openWithMode(CtaService.Power.on, CtaService.Effect.smooth, Long.valueOf(mo23221d0().mo31554O()), Long.valueOf((long) i), new C11870f(i));
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
            mo31477F1().setBright(Long.valueOf(j), new C11883s(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23123K2(i)) {
            return true;
        }
        try {
            mo31477F1().setCt(Long.valueOf((long) i), new C11884t(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11866b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11868d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21713z);
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
            m30271Z1(CtaService.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)));
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
                mo31477F1().getProperties(new C11875k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11885u(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11886v(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene2("bright", Long.valueOf((long) sVar.mo35439f()), new C11887w(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11865a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f21710C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: y1 */
    public boolean mo23250y1(long j) {
        try {
            CtaService Y1 = mo31477F1();
            CtaService.CmdKey cmdKey = CtaService.CmdKey.trans_default;
            Y1.sendCmd(cmdKey, j + ",1", new C11876l(j));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("TransIntervalDflt").getInternalName()};
    }
}
