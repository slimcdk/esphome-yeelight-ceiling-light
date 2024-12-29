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
import com.yeelight.yeelib.device.xiaomi.BhfLightService;
import com.yeelight.yeelib.device.xiaomi.YeelightBhfLightDevice;
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

/* renamed from: w3.a */
public class C10566a extends C10333b {

    /* renamed from: C */
    public static final String f19729C = "a";

    /* renamed from: A */
    CompletionHandler f19730A = new C10576h(this);

    /* renamed from: B */
    BhfLightService.C6232s0 f19731B = new C10577i();

    /* renamed from: z */
    CompletionHandler f19732z = new C10575g(this);

    /* renamed from: w3.a$a */
    class C10567a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19733a;

        C10567a(C8327s sVar) {
            this.f19733a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31557P0(this.f19733a);
        }
    }

    /* renamed from: w3.a$a0 */
    class C10568a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19735a;

        C10568a0(C8327s sVar) {
            this.f19735a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31557P0(this.f19735a);
        }
    }

    /* renamed from: w3.a$b */
    class C10569b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19737a;

        C10569b(C8327s sVar) {
            this.f19737a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31557P0(this.f19737a);
        }
    }

    /* renamed from: w3.a$b0 */
    class C10570b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19739a;

        C10570b0(C8327s sVar) {
            this.f19739a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31557P0(this.f19739a);
        }
    }

    /* renamed from: w3.a$c */
    class C10571c implements CompletionHandler {
        C10571c(C10566a aVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a$d */
    class C10572d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19741a;

        C10572d(boolean z) {
            this.f19741a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31555O0(this.f19741a);
        }
    }

    /* renamed from: w3.a$e */
    class C10573e implements CompletionHandler {
        C10573e(C10566a aVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a$f */
    class C10574f implements CompletionHandler {
        C10574f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.a$g */
    class C10575g implements CompletionHandler {
        C10575g(C10566a aVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a$h */
    class C10576h implements CompletionHandler {
        C10576h(C10566a aVar) {
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

    /* renamed from: w3.a$i */
    class C10577i implements BhfLightService.C6232s0 {
        C10577i() {
        }

        /* renamed from: a */
        public void mo31986a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C10566a.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo31987b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C10566a.this.mo23221d0().mo31611r(2) == null) {
                C10566a.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C10566a.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo31988c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C10566a.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo31989d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C10566a.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo31990e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C10566a.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo31991f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C10566a.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo31992g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C10566a.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo31993h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C10566a.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo31994i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C10566a.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C10566a.this.mo23221d0().mo31543I0(true);
                }
                C10566a.this.mo23221d0().mo31541H0(split[1]);
                C10566a.this.mo23221d0().mo31539G0(split[2]);
                C10566a.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C10566a.f19729C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C10566a.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C10566a.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C10566a.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: k */
        public void mo31995k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNLBrightChanged: ");
            sb.append(l);
            if (l.longValue() != 0) {
                C10566a.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
                C10566a.this.mo23221d0().mo31545J0(l.longValue());
                return;
            }
            C10566a.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo31996m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("c: ");
            sb.append(l);
            C10566a.this.mo23221d0().mo31591h(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo31997n(BhfLightService.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C10589u.f19765a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C10566a.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C10566a.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }
    }

    /* renamed from: w3.a$j */
    class C10578j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19745a;

        C10578j(boolean z) {
            this.f19745a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31583d(this.f19745a);
        }
    }

    /* renamed from: w3.a$k */
    class C10579k implements BhfLightService.C6226p0 {
        C10579k() {
        }

        /* renamed from: a */
        public void mo31980a(BhfLightService.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power != null ? power.name() : "null");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            Long l10 = l;
            sb2.append(l);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ct: ");
            sb3.append(l2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("delayoff: ");
            sb4.append(l3);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("nLBright: ");
            Long l11 = l7;
            sb5.append(l11);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("nightTimeInfo : ");
            String str3 = str2;
            sb6.append(str3);
            C10566a.this.m26926k2(power, l, l2, l3, l11, str3);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.a$l */
    class C10580l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19748a;

        C10580l(int i) {
            this.f19748a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31547K0(this.f19748a);
        }
    }

    /* renamed from: w3.a$m */
    class C10581m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19750a;

        C10581m(boolean z) {
            this.f19750a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31543I0(this.f19750a);
        }
    }

    /* renamed from: w3.a$n */
    class C10582n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19752a;

        /* renamed from: b */
        final /* synthetic */ String f19753b;

        /* renamed from: c */
        final /* synthetic */ String f19754c;

        /* renamed from: d */
        final /* synthetic */ int f19755d;

        C10582n(boolean z, String str, String str2, int i) {
            this.f19752a = z;
            this.f19753b = str;
            this.f19754c = str2;
            this.f19755d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31543I0(this.f19752a);
            C10566a.this.mo23221d0().mo31541H0(this.f19753b);
            C10566a.this.mo23221d0().mo31539G0(this.f19754c);
            C10566a.this.mo23221d0().mo31537F0(this.f19755d);
        }
    }

    /* renamed from: w3.a$o */
    class C10583o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f19757a;

        /* renamed from: b */
        final /* synthetic */ String f19758b;

        /* renamed from: c */
        final /* synthetic */ int f19759c;

        C10583o(String str, String str2, int i) {
            this.f19757a = str;
            this.f19758b = str2;
            this.f19759c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31541H0(this.f19757a);
            C10566a.this.mo23221d0().mo31539G0(this.f19758b);
            C10566a.this.mo23221d0().mo31537F0(this.f19759c);
        }
    }

    /* renamed from: w3.a$p */
    class C10584p implements CompletionHandler {
        C10584p(C10566a aVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a$q */
    class C10585q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19761a;

        C10585q(int i) {
            this.f19761a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31551M0(true);
            C10566a aVar = C10566a.this;
            aVar.mo23165w1(aVar.mo23247j1(this.f19761a));
        }
    }

    /* renamed from: w3.a$r */
    class C10586r implements CompletionHandler {
        C10586r(C10566a aVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.a$s */
    class C10587s implements WifiDeviceBase.C6080i {
        C10587s() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C10566a.this.f19731B.mo31986a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C10566a.this.f19731B.mo31993h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
            C10566a.this.f19731B.mo31995k(l);
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C10566a.this.f19731B.mo31997n(BhfLightService.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.a$t */
    class C10588t implements CompletionHandler {
        C10588t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.a$u */
    static /* synthetic */ class C10589u {

        /* renamed from: a */
        static final /* synthetic */ int[] f19765a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.BhfLightService$Power[] r0 = com.yeelight.yeelib.device.xiaomi.BhfLightService.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19765a = r0
                com.yeelight.yeelib.device.xiaomi.BhfLightService$Power r1 = com.yeelight.yeelib.device.xiaomi.BhfLightService.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19765a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.BhfLightService$Power r1 = com.yeelight.yeelib.device.xiaomi.BhfLightService.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C10566a.C10589u.<clinit>():void");
        }
    }

    /* renamed from: w3.a$v */
    class C10590v implements CompletionHandler {
        C10590v() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.a$w */
    class C10591w implements CompletionHandler {
        C10591w() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.a$x */
    class C10592x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f19768a;

        C10592x(long j) {
            this.f19768a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31600l0(this.f19768a);
        }
    }

    /* renamed from: w3.a$y */
    class C10593y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19770a;

        C10593y(int i) {
            this.f19770a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31610q0(this.f19770a);
        }
    }

    /* renamed from: w3.a$z */
    class C10594z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19772a;

        C10594z(C8327s sVar) {
            this.f19772a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10566a.this.mo23221d0().mo31557P0(this.f19772a);
        }
    }

    public C10566a(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m26926k2(BhfLightService.Power power, Long l, Long l2, Long l3, Long l4, String str) {
        if (power != null) {
            mo23221d0().mo31551M0(power == BhfLightService.Power.on);
        }
        mo23221d0().mo31610q0(l2.intValue());
        if (l != null) {
            mo23221d0().mo31600l0(l.longValue());
        }
        if (l3 != null) {
            if (mo23221d0().mo31611r(2) == null) {
                mo23221d0().mo31577a(new C12041e(l3.intValue(), l3.intValue()));
            } else {
                mo23221d0().mo31573X0(l3.intValue());
            }
        }
        if (l4.longValue() == 0) {
            mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        } else {
            mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
            mo23221d0().mo31545J0(l4.longValue());
        }
        String[] split = str.split("\\|");
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
            mo31477F1().toggle(new C10591w());
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
        return R$drawable.icon_yeelight_default_avata;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_default_avata;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C10587s();
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
            mo31477F1().sendCmd(BhfLightService.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10578j(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: Q1 */
    public boolean mo31488Q1(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("setNightTime --> Invoke, startTime : ");
        sb.append(str);
        sb.append(" , endTime : ");
        sb.append(str2);
        sb.append(" , delayTime : ");
        sb.append(i);
        try {
            BhfLightService j2 = mo31477F1();
            BhfLightService.CmdKey cmdKey = BhfLightService.CmdKey.nighttime;
            j2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C10583o(str, str2, i));
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
            mo31477F1().sendCmd(BhfLightService.CmdKey.cfg_init_power, String.valueOf(i), new C10580l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(BhfLightService.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10572d(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23210U() {
        String U = super.mo23210U();
        return (U == null || U.isEmpty()) ? C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_bhf) : U;
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42223l2(this.f19730A, this.f19731B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f19732z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f19729C, "Invalid handler!");
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
        StringBuilder sb = new StringBuilder();
        sb.append("enableMiBandSleep --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(BhfLightService.CmdKey.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10584p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        if (super.mo23140b1()) {
            return true;
        }
        try {
            mo31477F1().setPower(BhfLightService.Power.off, new C10590v());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C10574f());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: f1 */
    public boolean mo23142f1(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("enableNightTime --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(BhfLightService.CmdKey.nighttime, z ? "enable" : "disable", new C10581m(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: f2 */
    public boolean mo41885f2(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendRemoteKey --> Invoke, enable : ");
        sb.append(i);
        try {
            mo31477F1().sendCmd(BhfLightService.CmdKey.pseudo_beacon, "4097|" + i, new C10586r(this));
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
            BhfLightService j2 = mo31477F1();
            BhfLightService.CmdKey cmdKey = BhfLightService.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            j2.sendCmd(cmdKey, sb2.toString(), new C10582n(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public BhfLightService mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightBhfLightDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(BhfLightService.Power.on, new C10588t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42223l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof BhfLightService.C6232s0)) {
            AppUtils.m8300u(f19729C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (BhfLightService.C6232s0) obj2);
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
            mo31477F1().openWithMode(BhfLightService.Power.on, BhfLightService.Effect.smooth, 500L, Long.valueOf((long) i), new C10585q(i));
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
            mo31477F1().setBright(Long.valueOf(j), BhfLightService.Effect.smooth, 500L, new C10592x(j));
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
            mo31477F1().setCt(Long.valueOf((long) i), BhfLightService.Effect.smooth, 500L, new C10593y(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C10571c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C10573e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f19732z);
    }

    /* renamed from: v1 */
    public boolean mo23249v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 6) {
                AppUtils.m8300u("BATCH_RPC", "CeilingDevice, Invalid length of batch rpc result: " + str);
            }
            m26926k2(BhfLightService.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5));
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
                mo31477F1().getProperties(new C10579k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C10594z(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C10568a0(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C10570b0(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C10567a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C10569b(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f19729C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("NLBright").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName()};
    }
}
