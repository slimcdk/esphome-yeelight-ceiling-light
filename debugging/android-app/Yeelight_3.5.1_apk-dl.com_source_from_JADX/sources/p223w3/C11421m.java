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
import com.yeelight.yeelib.device.xiaomi.Ceiling5Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling5Device;
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

/* renamed from: w3.m */
public class C11421m extends C10333b {

    /* renamed from: C */
    public static final String f21043C = "m";

    /* renamed from: A */
    CompletionHandler f21044A = new C11432h(this);

    /* renamed from: B */
    Ceiling5Service.C6786s0 f21045B = new C11433i();

    /* renamed from: z */
    CompletionHandler f21046z = new C11431g(this);

    /* renamed from: w3.m$a */
    class C11422a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21047a;

        C11422a(C8327s sVar) {
            this.f21047a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31557P0(this.f21047a);
        }
    }

    /* renamed from: w3.m$a0 */
    class C11423a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21049a;

        C11423a0(C8327s sVar) {
            this.f21049a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31557P0(this.f21049a);
        }
    }

    /* renamed from: w3.m$b */
    class C11424b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21051a;

        C11424b(C8327s sVar) {
            this.f21051a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31557P0(this.f21051a);
        }
    }

    /* renamed from: w3.m$b0 */
    class C11425b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21053a;

        C11425b0(C8327s sVar) {
            this.f21053a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31557P0(this.f21053a);
        }
    }

    /* renamed from: w3.m$c */
    class C11426c implements CompletionHandler {
        C11426c(C11421m mVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.m$c0 */
    class C11427c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21055a;

        C11427c0(C8327s sVar) {
            this.f21055a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31557P0(this.f21055a);
        }
    }

    /* renamed from: w3.m$d */
    class C11428d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21057a;

        C11428d(boolean z) {
            this.f21057a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31555O0(this.f21057a);
        }
    }

    /* renamed from: w3.m$e */
    class C11429e implements CompletionHandler {
        C11429e(C11421m mVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.m$f */
    class C11430f implements CompletionHandler {
        C11430f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.m$g */
    class C11431g implements CompletionHandler {
        C11431g(C11421m mVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.m$h */
    class C11432h implements CompletionHandler {
        C11432h(C11421m mVar) {
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

    /* renamed from: w3.m$i */
    class C11433i implements Ceiling5Service.C6786s0 {
        C11433i() {
        }

        /* renamed from: a */
        public void mo32836a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11421m.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo32837b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11421m.this.mo23221d0().mo31611r(2) == null) {
                C11421m.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11421m.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo32838c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11421m.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo32839d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11421m.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo32840e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11421m.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo32841f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11421m.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo32842g(Ceiling5Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11446v.f21083a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11421m.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11421m.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: h */
        public void mo32843h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C11421m.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo32844i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C11421m.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C11421m.this.mo23221d0().mo31543I0(true);
                }
                C11421m.this.mo23221d0().mo31541H0(split[1]);
                C11421m.this.mo23221d0().mo31539G0(split[2]);
                C11421m.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C11421m.f21043C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C11421m.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C11421m.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C11421m.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: k */
        public void mo32845k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNLBrightChanged: ");
            sb.append(l);
            if (l.longValue() != 0) {
                C11421m.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
                C11421m.this.mo23221d0().mo31545J0(l.longValue());
                return;
            }
            C11421m.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo32846m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("c: ");
            sb.append(l);
            C11421m.this.mo23221d0().mo31591h(l.longValue() == 1);
        }

        /* renamed from: o */
        public void mo32847o(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("deviceId:");
            sb.append(C11421m.this.mo23185G());
            sb.append("       smartSwitch: ");
            sb.append(l);
            C11421m.this.mo23221d0().mo31597k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: w3.m$j */
    class C11434j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21061a;

        C11434j(boolean z) {
            this.f21061a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31583d(this.f21061a);
        }
    }

    /* renamed from: w3.m$k */
    class C11435k implements Ceiling5Service.C6778o0 {
        C11435k() {
        }

        /* renamed from: a */
        public void mo32828a(Ceiling5Service.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, String str2, Long l7, Long l8, Long l9) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power != null ? power.name() : "null");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            sb2.append(l);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ct: ");
            Long l10 = l2;
            sb3.append(l10);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("saveState: ");
            Long l11 = l4;
            sb4.append(l11);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            Long l12 = l3;
            sb5.append(l12);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowParams: ");
            String str3 = str;
            sb6.append(str3);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("nLBright: ");
            Long l13 = l6;
            sb7.append(l13);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("nightTimeInfo : ");
            String str4 = str2;
            sb8.append(str4);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("miBandSleep : ");
            Long l14 = l7;
            sb9.append(l14);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("flowing : ");
            Long l15 = l8;
            sb10.append(l15);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("onFromPower : ");
            Long l16 = l5;
            sb11.append(l16);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("deviceId:");
            sb12.append(C11421m.this.mo23185G());
            sb12.append("       smartSwitch: ");
            Long l17 = l9;
            sb12.append(l17);
            C11421m.this.m29020k2(power, l, l10, l12, str3, l11, l16, l13, str4, l14, l15, l17);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.m$l */
    class C11436l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21064a;

        C11436l(int i) {
            this.f21064a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31547K0(this.f21064a);
        }
    }

    /* renamed from: w3.m$m */
    class C11437m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21066a;

        C11437m(boolean z) {
            this.f21066a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31543I0(this.f21066a);
        }
    }

    /* renamed from: w3.m$n */
    class C11438n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21068a;

        /* renamed from: b */
        final /* synthetic */ String f21069b;

        /* renamed from: c */
        final /* synthetic */ String f21070c;

        /* renamed from: d */
        final /* synthetic */ int f21071d;

        C11438n(boolean z, String str, String str2, int i) {
            this.f21068a = z;
            this.f21069b = str;
            this.f21070c = str2;
            this.f21071d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31543I0(this.f21068a);
            C11421m.this.mo23221d0().mo31541H0(this.f21069b);
            C11421m.this.mo23221d0().mo31539G0(this.f21070c);
            C11421m.this.mo23221d0().mo31537F0(this.f21071d);
        }
    }

    /* renamed from: w3.m$o */
    class C11439o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f21073a;

        /* renamed from: b */
        final /* synthetic */ String f21074b;

        /* renamed from: c */
        final /* synthetic */ int f21075c;

        C11439o(String str, String str2, int i) {
            this.f21073a = str;
            this.f21074b = str2;
            this.f21075c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31541H0(this.f21073a);
            C11421m.this.mo23221d0().mo31539G0(this.f21074b);
            C11421m.this.mo23221d0().mo31537F0(this.f21075c);
        }
    }

    /* renamed from: w3.m$p */
    class C11440p implements CompletionHandler {
        C11440p(C11421m mVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.m$q */
    class C11441q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21077a;

        C11441q(int i) {
            this.f21077a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31551M0(true);
            C11421m mVar = C11421m.this;
            mVar.mo23165w1(mVar.mo23247j1(this.f21077a));
        }
    }

    /* renamed from: w3.m$r */
    class C11442r implements CompletionHandler {
        C11442r(C11421m mVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.m$s */
    class C11443s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21079a;

        C11443s(boolean z) {
            this.f21079a = z;
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("sendRemoteKey cfg_smart_switch --> onFailed code: ");
            sb.append(i);
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31597k(this.f21079a);
        }
    }

    /* renamed from: w3.m$t */
    class C11444t implements CompletionHandler {
        C11444t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.m$u */
    class C11445u implements WifiDeviceBase.C6080i {
        C11445u() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11421m.this.f21045B.mo32836a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11421m.this.f21045B.mo32843h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
            C11421m.this.f21045B.mo32845k(l);
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C11421m.this.f21045B.mo32842g(Ceiling5Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.m$v */
    static /* synthetic */ class C11446v {

        /* renamed from: a */
        static final /* synthetic */ int[] f21083a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling5Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21083a = r0
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling5Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21083a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling5Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11421m.C11446v.<clinit>():void");
        }
    }

    /* renamed from: w3.m$w */
    class C11447w implements CompletionHandler {
        C11447w() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.m$x */
    class C11448x implements CompletionHandler {
        C11448x() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.m$y */
    class C11449y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21086a;

        C11449y(long j) {
            this.f21086a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31600l0(this.f21086a);
        }
    }

    /* renamed from: w3.m$z */
    class C11450z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21088a;

        C11450z(int i) {
            this.f21088a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11421m.this.mo23221d0().mo31610q0(this.f21088a);
        }
    }

    public C11421m(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m29020k2(Ceiling5Service.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, String str2, Long l7, Long l8, Long l9) {
        Ceiling5Service.Power power2 = power;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == Ceiling5Service.Power.on);
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
        if (l6.longValue() == 0) {
            mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        } else {
            mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
            mo23221d0().mo31545J0(l6.longValue());
        }
        if (l5 != null) {
            mo23221d0().mo31547K0(l5.intValue());
        }
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
        mo23221d0().mo31591h(l7 != null && l7.longValue() == 1);
        mo23221d0().mo31555O0(l4 != null && l4.longValue() == 1);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        mo23221d0().mo31618u0(l8.longValue() != 0);
        DeviceStatusBase d0 = mo23221d0();
        if (l9 == null || l9.longValue() != 1) {
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
            mo31477F1().toggle(new C11448x());
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
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_cycle_small;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -1462015159:
                if (T.equals("yeelink.light.ceiling21")) {
                    c = 0;
                    break;
                }
                break;
            case -1462015158:
                if (T.equals("yeelink.light.ceiling22")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015157:
                if (T.equals("yeelink.light.ceiling23")) {
                    c = 2;
                    break;
                }
                break;
            case 922669547:
                if (T.equals("yeelink.light.ceiling5")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_ceiling21_small;
            case 1:
                return R$drawable.icon_yeelight_device_badge_ceiling22_small;
            case 2:
                return R$drawable.icon_yeelight_device_badge_ceiling23_small;
            case 3:
                return R$drawable.icon_yeelight_device_badge_cycle_small;
            default:
                return R$drawable.icon_yeelight_device_badge_cycle_small;
        }
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_cycle_big;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -1462015159:
                if (T.equals("yeelink.light.ceiling21")) {
                    c = 0;
                    break;
                }
                break;
            case -1462015158:
                if (T.equals("yeelink.light.ceiling22")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015157:
                if (T.equals("yeelink.light.ceiling23")) {
                    c = 2;
                    break;
                }
                break;
            case 922669547:
                if (T.equals("yeelink.light.ceiling5")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_ceiling21_big;
            case 1:
                return R$drawable.icon_yeelight_device_badge_ceiling22_big;
            case 2:
                return R$drawable.icon_yeelight_device_badge_ceiling23_big;
            case 3:
                return R$drawable.icon_yeelight_device_badge_cycle_big;
            default:
                return R$drawable.icon_yeelight_device_badge_cycle_big;
        }
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11445u();
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
            mo31477F1().sendCmd(Ceiling5Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11434j(z));
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
            Ceiling5Service j2 = mo31477F1();
            Ceiling5Service.CmdKey cmdKey = Ceiling5Service.CmdKey.nighttime;
            j2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C11439o(str, str2, i));
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
            mo31477F1().sendCmd(Ceiling5Service.CmdKey.cfg_init_power, String.valueOf(i), new C11436l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Ceiling5Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11428d(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23210U() {
        String U = super.mo23210U();
        return (U == null || U.isEmpty()) ? C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_ceiling) : U;
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42322l2(this.f21044A, this.f21045B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21046z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21043C, "Invalid handler!");
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
            mo31477F1().sendCmd(Ceiling5Service.CmdKey.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11440p(this));
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
            mo31477F1().setPower(Ceiling5Service.Power.off, new C11447w());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11430f());
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
            mo31477F1().sendCmd(Ceiling5Service.CmdKey.nighttime, z ? "enable" : "disable", new C11437m(z));
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
            mo31477F1().sendCmd(Ceiling5Service.CmdKey.pseudo_beacon, "4097|" + i, new C11442r(this));
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
            Ceiling5Service j2 = mo31477F1();
            Ceiling5Service.CmdKey cmdKey = Ceiling5Service.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            j2.sendCmd(cmdKey, sb2.toString(), new C11438n(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Ceiling5Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeiling5Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Ceiling5Service.Power.on, new C11444t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42322l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling5Service.C6786s0)) {
            AppUtils.m8300u(f21043C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Ceiling5Service.C6786s0) obj2);
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
            mo31477F1().openWithMode(Ceiling5Service.Power.on, Ceiling5Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11441q(i));
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
            mo31477F1().setBright(Long.valueOf(j), Ceiling5Service.Effect.smooth, 500L, new C11449y(j));
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
            mo31477F1().setCt(Long.valueOf((long) i), Ceiling5Service.Effect.smooth, 500L, new C11450z(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11426c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11429e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        try {
            mo31477F1().sendCmd(Ceiling5Service.CmdKey.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11443s(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21046z);
    }

    /* renamed from: v1 */
    public boolean mo23249v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        String str2 = str;
        try {
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() != 12) {
                AppUtils.m8300u("BATCH_RPC", "Ceiling5Device, Invalid length of batch rpc result: " + str2);
            }
            Ceiling5Service.Power valueOf = Ceiling5Service.Power.valueOf(jSONArray.getString(0));
            Long valueOf2 = Long.valueOf(jSONArray.getLong(1));
            Long valueOf3 = Long.valueOf(jSONArray.getLong(2));
            Long valueOf4 = Long.valueOf(jSONArray.getLong(3));
            String string = jSONArray.getString(4);
            Long valueOf5 = Long.valueOf(jSONArray.getLong(5));
            Long valueOf6 = Long.valueOf(jSONArray.getLong(6));
            Long valueOf7 = Long.valueOf(jSONArray.getLong(7));
            String string2 = jSONArray.getString(8);
            Long valueOf8 = Long.valueOf(jSONArray.getLong(9));
            Long valueOf9 = Long.valueOf(jSONArray.getLong(10));
            Long valueOf10 = Long.valueOf(jSONArray.getLong(11));
            StringBuilder sb = new StringBuilder();
            sb.append("deviceId:");
            sb.append(mo23185G());
            sb.append("       smartSwitch: ");
            sb.append(valueOf10);
            m29020k2(valueOf, valueOf2, valueOf3, valueOf4, string, valueOf5, valueOf6, valueOf7, string2, valueOf8, valueOf9, valueOf10);
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
                mo31477F1().getProperties(new C11435k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11423a0(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11425b0(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11427c0(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11422a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C11424b(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f21043C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("NLBright").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty("MiBandSleep").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("SmartSwitch").getInternalName()};
    }
}
