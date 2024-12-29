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
import com.yeelight.yeelib.device.xiaomi.Panel3Service;
import com.yeelight.yeelib.device.xiaomi.YeelightPanel3Device;
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

/* renamed from: w3.b1 */
public class C10663b1 extends C10333b {

    /* renamed from: C */
    public static final String f19877C = "b1";

    /* renamed from: A */
    CompletionHandler f19878A = new C10671h(this);

    /* renamed from: B */
    Panel3Service.C7895p0 f19879B = new C10672i();

    /* renamed from: z */
    CompletionHandler f19880z = new C10670g(this);

    /* renamed from: w3.b1$a */
    class C10664a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19881a;

        C10664a(C8327s sVar) {
            this.f19881a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31557P0(this.f19881a);
        }
    }

    /* renamed from: w3.b1$b */
    class C10665b implements CompletionHandler {
        C10665b(C10663b1 b1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.b1$c */
    class C10666c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19883a;

        C10666c(boolean z) {
            this.f19883a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31555O0(this.f19883a);
        }
    }

    /* renamed from: w3.b1$d */
    class C10667d implements CompletionHandler {
        C10667d(C10663b1 b1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.b1$e */
    class C10668e implements CompletionHandler {
        C10668e() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.b1$f */
    class C10669f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19886a;

        C10669f(int i) {
            this.f19886a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31551M0(true);
            C10663b1 b1Var = C10663b1.this;
            b1Var.mo23165w1(b1Var.mo23247j1(this.f19886a));
        }
    }

    /* renamed from: w3.b1$g */
    class C10670g implements CompletionHandler {
        C10670g(C10663b1 b1Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.b1$h */
    class C10671h implements CompletionHandler {
        C10671h(C10663b1 b1Var) {
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

    /* renamed from: w3.b1$i */
    class C10672i implements Panel3Service.C7895p0 {
        C10672i() {
        }

        /* renamed from: a */
        public void mo34516a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C10663b1.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo34517b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDelayOffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C10663b1.this.mo23221d0().mo31611r(2) == null) {
                C10663b1.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C10663b1.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo34518c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C10663b1.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo34519d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C10663b1.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo34520e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C10663b1.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo34521f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C10663b1.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo34522g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C10663b1.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo34523h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtChanged: ");
            sb.append(l);
            C10663b1.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo34524i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C10663b1.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C10663b1.this.mo23221d0().mo31543I0(true);
                }
                C10663b1.this.mo23221d0().mo31541H0(split[1]);
                C10663b1.this.mo23221d0().mo31539G0(split[2]);
                C10663b1.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C10663b1.f19877C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C10663b1.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C10663b1.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C10663b1.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo34525j(Panel3Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerChanged: ");
            sb.append(power.name());
            int i = C10680q.f19902a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C10663b1.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C10663b1.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: o */
        public void mo34526o(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSmartSwitchChanged: ");
            sb.append(l);
            C10663b1.this.mo23221d0().mo31597k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: w3.b1$j */
    class C10673j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19889a;

        C10673j(boolean z) {
            this.f19889a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31583d(this.f19889a);
        }
    }

    /* renamed from: w3.b1$k */
    class C10674k implements Panel3Service.C7887l0 {
        C10674k() {
        }

        /* renamed from: a */
        public void mo34508a(Panel3Service.Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append("bright: ");
            sb.append(l);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lanMode: ");
            Long l9 = l5;
            sb2.append(l9);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ct: ");
            Long l10 = l2;
            sb3.append(l10);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("power: ");
            sb4.append(power.name());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            Long l11 = l3;
            sb5.append(l11);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("saveState: ");
            Long l12 = l4;
            sb6.append(l12);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowing : ");
            Long l13 = l7;
            sb7.append(l13);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("onFromPower : ");
            Long l14 = l6;
            sb8.append(l14);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("smartSwitch : ");
            Long l15 = l8;
            sb9.append(l15);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("nightTimeInfo : ");
            String str3 = str2;
            sb10.append(str3);
            C10663b1.this.m27181k2(power, l, l10, l11, l12, str, l9, l14, l13, l15, str3);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.b1$l */
    class C10675l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19892a;

        C10675l(int i) {
            this.f19892a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31547K0(this.f19892a);
        }
    }

    /* renamed from: w3.b1$m */
    class C10676m implements CompletionHandler {
        C10676m(C10663b1 b1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.b1$n */
    class C10677n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19894a;

        C10677n(boolean z) {
            this.f19894a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31597k(this.f19894a);
        }
    }

    /* renamed from: w3.b1$o */
    class C10678o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19896a;

        /* renamed from: b */
        final /* synthetic */ String f19897b;

        /* renamed from: c */
        final /* synthetic */ String f19898c;

        /* renamed from: d */
        final /* synthetic */ int f19899d;

        C10678o(boolean z, String str, String str2, int i) {
            this.f19896a = z;
            this.f19897b = str;
            this.f19898c = str2;
            this.f19899d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31543I0(this.f19896a);
            C10663b1.this.mo23221d0().mo31541H0(this.f19897b);
            C10663b1.this.mo23221d0().mo31539G0(this.f19898c);
            C10663b1.this.mo23221d0().mo31537F0(this.f19899d);
        }
    }

    /* renamed from: w3.b1$p */
    class C10679p implements WifiDeviceBase.C6080i {
        C10679p() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C10663b1.this.f19879B.mo34516a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C10663b1.this.f19879B.mo34523h(l);
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
            C10663b1.this.f19879B.mo34525j(Panel3Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.b1$q */
    static /* synthetic */ class C10680q {

        /* renamed from: a */
        static final /* synthetic */ int[] f19902a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Panel3Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Panel3Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19902a = r0
                com.yeelight.yeelib.device.xiaomi.Panel3Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Panel3Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19902a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Panel3Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Panel3Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C10663b1.C10680q.<clinit>():void");
        }
    }

    /* renamed from: w3.b1$r */
    class C10681r implements CompletionHandler {
        C10681r() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.b1$s */
    class C10682s implements CompletionHandler {
        C10682s() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.b1$t */
    class C10683t implements CompletionHandler {
        C10683t() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.b1$u */
    class C10684u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f19906a;

        C10684u(long j) {
            this.f19906a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31600l0(this.f19906a);
        }
    }

    /* renamed from: w3.b1$v */
    class C10685v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19908a;

        C10685v(int i) {
            this.f19908a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31610q0(this.f19908a);
        }
    }

    /* renamed from: w3.b1$w */
    class C10686w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19910a;

        C10686w(C8327s sVar) {
            this.f19910a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31557P0(this.f19910a);
        }
    }

    /* renamed from: w3.b1$x */
    class C10687x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19912a;

        C10687x(C8327s sVar) {
            this.f19912a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31557P0(this.f19912a);
        }
    }

    /* renamed from: w3.b1$y */
    class C10688y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19914a;

        C10688y(C8327s sVar) {
            this.f19914a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10663b1.this.mo23221d0().mo31557P0(this.f19914a);
        }
    }

    public C10663b1(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m27181k2(Panel3Service.Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, String str2) {
        if (power != null) {
            mo23221d0().mo31551M0(power == Panel3Service.Power.on);
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
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        mo23221d0().mo31618u0(l7.longValue() != 0);
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
            mo31477F1().toggle(new C10683t());
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
        return !T.equals("yeelink.light.panel3") ? R$drawable.icon_yeelight_device_badge_panel_small : R$drawable.icon_yeelight_device_badge_panel_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_panel_big;
        }
        String T = mo23208T();
        T.hashCode();
        return !T.equals("yeelink.light.panel3") ? R$drawable.icon_yeelight_device_badge_panel_big : R$drawable.icon_yeelight_device_badge_panel_big;
    }

    /* renamed from: J0 */
    public void mo23191J0(C11969f fVar) {
        super.mo23191J0(fVar);
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C10679p();
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
            mo31477F1().sendCmd(Panel3Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10673j(z));
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
            mo31477F1().sendCmd(Panel3Service.CmdKey.cfg_init_power, String.valueOf(i), new C10675l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Panel3Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10666c(z));
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
        return mo42234l2(this.f19878A, this.f19879B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f19880z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f19877C, "Invalid handler!");
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
            mo31477F1().setPower(Panel3Service.Power.off, new C10682s());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C10668e());
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
            mo31477F1().sendCmd(Panel3Service.CmdKey.pseudo_beacon, "4097|" + i, new C10676m(this));
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
            Panel3Service j2 = mo31477F1();
            Panel3Service.CmdKey cmdKey = Panel3Service.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            j2.sendCmd(cmdKey, sb2.toString(), new C10678o(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Panel3Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightPanel3Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Panel3Service.Power.on, new C10681r());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42234l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Panel3Service.C7895p0)) {
            AppUtils.m8300u(f19877C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Panel3Service.C7895p0) obj2);
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
            mo31477F1().openWithMode(Panel3Service.Power.on, Panel3Service.Effect.smooth, 500L, Long.valueOf((long) i), new C10669f(i));
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
            mo31477F1().setBright(Long.valueOf(j), Panel3Service.Effect.smooth, 500L, new C10684u(j));
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
            mo31477F1().setCt(Long.valueOf((long) i), Panel3Service.Effect.smooth, 500L, new C10685v(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C10665b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C10667d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        try {
            mo31477F1().sendCmd(Panel3Service.CmdKey.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10677n(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f19880z);
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
                AppUtils.m8300u("BATCH_RPC", "CtDevice, Invalid length of batch rpc result: " + str);
            }
            m27181k2(Panel3Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), jSONArray.getString(10));
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
                mo31477F1().getProperties(new C10674k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C10686w(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C10687x(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C10688y(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C10664a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f19877C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("SmartSwitch").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName()};
    }
}
