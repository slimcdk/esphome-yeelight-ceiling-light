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
import com.yeelight.yeelib.device.xiaomi.Ceiling6Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling6Device;
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

/* renamed from: w3.n */
public class C11480n extends C10333b {

    /* renamed from: C */
    public static final String f21133C = "n";

    /* renamed from: A */
    CompletionHandler f21134A = new C11491h(this);

    /* renamed from: B */
    Ceiling6Service.C6835u0 f21135B = new C11492i();

    /* renamed from: z */
    CompletionHandler f21136z = new C11490g(this);

    /* renamed from: w3.n$a */
    class C11481a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21137a;

        C11481a(C8327s sVar) {
            this.f21137a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31557P0(this.f21137a);
        }
    }

    /* renamed from: w3.n$a0 */
    class C11482a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21139a;

        C11482a0(C8327s sVar) {
            this.f21139a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31557P0(this.f21139a);
        }
    }

    /* renamed from: w3.n$b */
    class C11483b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21141a;

        C11483b(C8327s sVar) {
            this.f21141a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31557P0(this.f21141a);
        }
    }

    /* renamed from: w3.n$b0 */
    class C11484b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21143a;

        C11484b0(C8327s sVar) {
            this.f21143a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31557P0(this.f21143a);
        }
    }

    /* renamed from: w3.n$c */
    class C11485c implements CompletionHandler {
        C11485c(C11480n nVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.n$c0 */
    class C11486c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21145a;

        C11486c0(C8327s sVar) {
            this.f21145a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31557P0(this.f21145a);
        }
    }

    /* renamed from: w3.n$d */
    class C11487d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21147a;

        C11487d(boolean z) {
            this.f21147a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31555O0(this.f21147a);
        }
    }

    /* renamed from: w3.n$e */
    class C11488e implements CompletionHandler {
        C11488e(C11480n nVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.n$f */
    class C11489f implements CompletionHandler {
        C11489f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.n$g */
    class C11490g implements CompletionHandler {
        C11490g(C11480n nVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.n$h */
    class C11491h implements CompletionHandler {
        C11491h(C11480n nVar) {
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

    /* renamed from: w3.n$i */
    class C11492i implements Ceiling6Service.C6835u0 {
        C11492i() {
        }

        /* renamed from: a */
        public void mo32907a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11480n.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo32908b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11480n.this.mo23221d0().mo31611r(2) == null) {
                C11480n.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11480n.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo32909c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11480n.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo32910d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11480n.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo32911e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11480n.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo32912f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11480n.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo32913g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11480n.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo32914h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C11480n.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo32915i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C11480n.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C11480n.this.mo23221d0().mo31543I0(true);
                }
                C11480n.this.mo23221d0().mo31541H0(split[1]);
                C11480n.this.mo23221d0().mo31539G0(split[2]);
                C11480n.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C11480n.f21133C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C11480n.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C11480n.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C11480n.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo32916j(Ceiling6Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11505v.f21173a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11480n.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11480n.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: k */
        public void mo32917k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNLBrightChanged: ");
            sb.append(l);
            if (l.longValue() != 0) {
                C11480n.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
                C11480n.this.mo23221d0().mo31545J0(l.longValue());
                return;
            }
            C11480n.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo32918m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("c: ");
            sb.append(l);
            C11480n.this.mo23221d0().mo31591h(l.longValue() == 1);
        }

        /* renamed from: o */
        public void mo32919o(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("deviceId:");
            sb.append(C11480n.this.mo23185G());
            sb.append("       smartSwitch: ");
            sb.append(l);
            C11480n.this.mo23221d0().mo31597k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: w3.n$j */
    class C11493j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21151a;

        C11493j(boolean z) {
            this.f21151a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31583d(this.f21151a);
        }
    }

    /* renamed from: w3.n$k */
    class C11494k implements Ceiling6Service.C6827q0 {
        C11494k() {
        }

        /* renamed from: a */
        public void mo32899a(Ceiling6Service.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power != null ? power.name() : "null");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            sb2.append(l);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ct: ");
            Long l11 = l2;
            sb3.append(l11);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("lanMode: ");
            Long l12 = l4;
            sb4.append(l12);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("saveState: ");
            Long l13 = l5;
            sb5.append(l13);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("delayoff: ");
            Long l14 = l3;
            sb6.append(l14);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowParams: ");
            String str3 = str;
            sb7.append(str3);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("nLBright: ");
            Long l15 = l7;
            sb8.append(l15);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("nightTimeInfo : ");
            String str4 = str2;
            sb9.append(str4);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("miBandSleep : ");
            Long l16 = l8;
            sb10.append(l16);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("flowing : ");
            Long l17 = l9;
            sb11.append(l17);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("onFromPower : ");
            Long l18 = l6;
            sb12.append(l18);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("deviceId:");
            sb13.append(C11480n.this.mo23185G());
            sb13.append("       smartSwitch: ");
            sb13.append(l10);
            C11480n.this.m29173k2(power, l, l11, l14, str3, l12, l13, l18, l15, str4, l16, l17, l10);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.n$l */
    class C11495l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21154a;

        C11495l(int i) {
            this.f21154a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31547K0(this.f21154a);
        }
    }

    /* renamed from: w3.n$m */
    class C11496m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21156a;

        C11496m(boolean z) {
            this.f21156a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31543I0(this.f21156a);
        }
    }

    /* renamed from: w3.n$n */
    class C11497n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21158a;

        /* renamed from: b */
        final /* synthetic */ String f21159b;

        /* renamed from: c */
        final /* synthetic */ String f21160c;

        /* renamed from: d */
        final /* synthetic */ int f21161d;

        C11497n(boolean z, String str, String str2, int i) {
            this.f21158a = z;
            this.f21159b = str;
            this.f21160c = str2;
            this.f21161d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31543I0(this.f21158a);
            C11480n.this.mo23221d0().mo31541H0(this.f21159b);
            C11480n.this.mo23221d0().mo31539G0(this.f21160c);
            C11480n.this.mo23221d0().mo31537F0(this.f21161d);
        }
    }

    /* renamed from: w3.n$o */
    class C11498o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f21163a;

        /* renamed from: b */
        final /* synthetic */ String f21164b;

        /* renamed from: c */
        final /* synthetic */ int f21165c;

        C11498o(String str, String str2, int i) {
            this.f21163a = str;
            this.f21164b = str2;
            this.f21165c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31541H0(this.f21163a);
            C11480n.this.mo23221d0().mo31539G0(this.f21164b);
            C11480n.this.mo23221d0().mo31537F0(this.f21165c);
        }
    }

    /* renamed from: w3.n$p */
    class C11499p implements CompletionHandler {
        C11499p(C11480n nVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.n$q */
    class C11500q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21167a;

        C11500q(int i) {
            this.f21167a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31551M0(true);
            C11480n nVar = C11480n.this;
            nVar.mo23165w1(nVar.mo23247j1(this.f21167a));
        }
    }

    /* renamed from: w3.n$r */
    class C11501r implements CompletionHandler {
        C11501r(C11480n nVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.n$s */
    class C11502s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21169a;

        C11502s(boolean z) {
            this.f21169a = z;
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("sendRemoteKey cfg_smart_switch --> onFailed code: ");
            sb.append(i);
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31597k(this.f21169a);
        }
    }

    /* renamed from: w3.n$t */
    class C11503t implements CompletionHandler {
        C11503t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.n$u */
    class C11504u implements WifiDeviceBase.C6080i {
        C11504u() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11480n.this.f21135B.mo32907a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11480n.this.f21135B.mo32914h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
            C11480n.this.f21135B.mo32917k(l);
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C11480n.this.f21135B.mo32916j(Ceiling6Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.n$v */
    static /* synthetic */ class C11505v {

        /* renamed from: a */
        static final /* synthetic */ int[] f21173a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling6Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21173a = r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling6Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21173a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling6Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11480n.C11505v.<clinit>():void");
        }
    }

    /* renamed from: w3.n$w */
    class C11506w implements CompletionHandler {
        C11506w() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.n$x */
    class C11507x implements CompletionHandler {
        C11507x() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.n$y */
    class C11508y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21176a;

        C11508y(long j) {
            this.f21176a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31600l0(this.f21176a);
        }
    }

    /* renamed from: w3.n$z */
    class C11509z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21178a;

        C11509z(int i) {
            this.f21178a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11480n.this.mo23221d0().mo31610q0(this.f21178a);
        }
    }

    public C11480n(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m29173k2(Ceiling6Service.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10) {
        Ceiling6Service.Power power2 = power;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == Ceiling6Service.Power.on);
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
        if (l7.longValue() == 0) {
            mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        } else {
            mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
            mo23221d0().mo31545J0(l7.longValue());
        }
        if (l6 != null) {
            mo23221d0().mo31547K0(l6.intValue());
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
        mo23221d0().mo31583d(l4 != null && l4.longValue() == 1);
        mo23221d0().mo31591h(l8 != null && l8.longValue() == 1);
        mo23221d0().mo31555O0(l5 != null && l5.longValue() == 1);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        mo23221d0().mo31618u0(l9.longValue() != 0);
        DeviceStatusBase d0 = mo23221d0();
        if (l10 == null || l10.longValue() != 1) {
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
            mo31477F1().toggle(new C11507x());
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
            case -1462015190:
                if (T.equals("yeelink.light.ceiling11")) {
                    c = 0;
                    break;
                }
                break;
            case -1462015189:
                if (T.equals("yeelink.light.ceiling12")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015188:
                if (T.equals("yeelink.light.ceiling13")) {
                    c = 2;
                    break;
                }
                break;
            case -1462015187:
                if (T.equals("yeelink.light.ceiling14")) {
                    c = 3;
                    break;
                }
                break;
            case -1462015183:
                if (T.equals("yeelink.light.ceiling18")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015156:
                if (T.equals("yeelink.light.ceiling24")) {
                    c = 5;
                    break;
                }
                break;
            case -1317475940:
                if (T.equals("yeelink.light.ceil26")) {
                    c = 6;
                    break;
                }
                break;
            case -1317475939:
                if (T.equals("yeelink.light.ceil27")) {
                    c = 7;
                    break;
                }
                break;
            case -1317475937:
                if (T.equals("yeelink.light.ceil29")) {
                    c = 8;
                    break;
                }
                break;
            case -1317475915:
                if (T.equals("yeelink.light.ceil30")) {
                    c = 9;
                    break;
                }
                break;
            case -1317475913:
                if (T.equals("yeelink.light.ceil32")) {
                    c = 10;
                    break;
                }
                break;
            case -1317475912:
                if (T.equals("yeelink.light.ceil33")) {
                    c = 11;
                    break;
                }
                break;
            case -1317475910:
                if (T.equals("yeelink.light.ceil35")) {
                    c = 12;
                    break;
                }
                break;
            case -458141175:
                if (T.equals("yeelink.light.ceila")) {
                    c = 13;
                    break;
                }
                break;
            case 922669548:
                if (T.equals("yeelink.light.ceiling6")) {
                    c = 14;
                    break;
                }
                break;
            case 922669549:
                if (T.equals("yeelink.light.ceiling7")) {
                    c = 15;
                    break;
                }
                break;
            case 922669550:
                if (T.equals("yeelink.light.ceiling8")) {
                    c = 16;
                    break;
                }
                break;
            case 922669551:
                if (T.equals("yeelink.light.ceiling9")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_ceiling11_small;
            case 1:
                return R$drawable.icon_yeelight_device_badge_ceiling12_small;
            case 2:
            case 3:
                return R$drawable.icon_yeelight_device_badge_ceiling13_small;
            case 4:
                return R$drawable.icon_yeelight_device_badge_ceiling18_small;
            case 5:
                return R$drawable.icon_yeelight_device_badge_ceiling24_small;
            case 6:
                return R$drawable.icon_yeelight_device_badge_ceiling26_small;
            case 7:
                return R$drawable.icon_yeelight_device_badge_ceiling27_small;
            case 8:
                return R$drawable.icon_yeelight_device_badge_ceiling29_small;
            case 9:
                return R$drawable.icon_yeelight_device_badge_ceiling30_small;
            case 10:
                return R$drawable.icon_yeelight_device_badge_ceiling32_small;
            case 11:
                return R$drawable.icon_yeelight_device_badge_ceiling33_small;
            case 12:
                return R$drawable.icon_yeelight_device_badge_ceiling35_small;
            case 13:
                return R$drawable.icon_yeelight_device_badge_luna_small;
            case 14:
            case 17:
                return R$drawable.icon_yeelight_device_badge_nox_pro_small;
            case 15:
                return R$drawable.icon_yeelight_device_badge_nox_small;
            case 16:
                return R$drawable.icon_yeelight_device_badge_nox_plus_small;
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
            case -1462015190:
                if (T.equals("yeelink.light.ceiling11")) {
                    c = 0;
                    break;
                }
                break;
            case -1462015189:
                if (T.equals("yeelink.light.ceiling12")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015188:
                if (T.equals("yeelink.light.ceiling13")) {
                    c = 2;
                    break;
                }
                break;
            case -1462015187:
                if (T.equals("yeelink.light.ceiling14")) {
                    c = 3;
                    break;
                }
                break;
            case -1462015183:
                if (T.equals("yeelink.light.ceiling18")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015156:
                if (T.equals("yeelink.light.ceiling24")) {
                    c = 5;
                    break;
                }
                break;
            case -1317475940:
                if (T.equals("yeelink.light.ceil26")) {
                    c = 6;
                    break;
                }
                break;
            case -1317475939:
                if (T.equals("yeelink.light.ceil27")) {
                    c = 7;
                    break;
                }
                break;
            case -1317475937:
                if (T.equals("yeelink.light.ceil29")) {
                    c = 8;
                    break;
                }
                break;
            case -1317475915:
                if (T.equals("yeelink.light.ceil30")) {
                    c = 9;
                    break;
                }
                break;
            case -1317475913:
                if (T.equals("yeelink.light.ceil32")) {
                    c = 10;
                    break;
                }
                break;
            case -1317475912:
                if (T.equals("yeelink.light.ceil33")) {
                    c = 11;
                    break;
                }
                break;
            case -1317475910:
                if (T.equals("yeelink.light.ceil35")) {
                    c = 12;
                    break;
                }
                break;
            case -458141175:
                if (T.equals("yeelink.light.ceila")) {
                    c = 13;
                    break;
                }
                break;
            case 922669548:
                if (T.equals("yeelink.light.ceiling6")) {
                    c = 14;
                    break;
                }
                break;
            case 922669549:
                if (T.equals("yeelink.light.ceiling7")) {
                    c = 15;
                    break;
                }
                break;
            case 922669550:
                if (T.equals("yeelink.light.ceiling8")) {
                    c = 16;
                    break;
                }
                break;
            case 922669551:
                if (T.equals("yeelink.light.ceiling9")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_ceiling11_big;
            case 1:
                return R$drawable.icon_yeelight_device_badge_ceiling12_big;
            case 2:
            case 3:
                return R$drawable.icon_yeelight_device_badge_ceiling13_big;
            case 4:
                return R$drawable.icon_yeelight_device_badge_ceiling18_big;
            case 5:
                return R$drawable.icon_yeelight_device_badge_ceiling24_big;
            case 6:
                return R$drawable.icon_yeelight_device_badge_ceiling26_big;
            case 7:
                return R$drawable.icon_yeelight_device_badge_ceiling27_big;
            case 8:
                return R$drawable.icon_yeelight_device_badge_ceiling29_big;
            case 9:
                return R$drawable.icon_yeelight_device_badge_ceiling30_big;
            case 10:
                return R$drawable.icon_yeelight_device_badge_ceiling32_big;
            case 11:
                return R$drawable.icon_yeelight_device_badge_ceiling33_big;
            case 12:
                return R$drawable.icon_yeelight_device_badge_ceiling35_big;
            case 13:
                return R$drawable.icon_yeelight_device_badge_luna_big;
            case 14:
            case 17:
                return R$drawable.icon_yeelight_device_badge_nox_pro_big;
            case 15:
                return R$drawable.icon_yeelight_device_badge_nox_big;
            case 16:
                return R$drawable.icon_yeelight_device_badge_nox_plus_big;
            default:
                return R$drawable.icon_yeelight_device_badge_cycle_big;
        }
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11504u();
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
            mo31477F1().sendCmd(Ceiling6Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11493j(z));
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
            Ceiling6Service j2 = mo31477F1();
            Ceiling6Service.CmdKey cmdKey = Ceiling6Service.CmdKey.nighttime;
            j2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C11498o(str, str2, i));
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
            mo31477F1().sendCmd(Ceiling6Service.CmdKey.cfg_init_power, String.valueOf(i), new C11495l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Ceiling6Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11487d(z));
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
        return mo42326l2(this.f21134A, this.f21135B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21136z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21133C, "Invalid handler!");
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
            mo31477F1().sendCmd(Ceiling6Service.CmdKey.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11499p(this));
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
            mo31477F1().setPower(Ceiling6Service.Power.off, new C11506w());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11489f());
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
            mo31477F1().sendCmd(Ceiling6Service.CmdKey.nighttime, z ? "enable" : "disable", new C11496m(z));
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
            mo31477F1().sendCmd(Ceiling6Service.CmdKey.pseudo_beacon, "4097|" + i, new C11501r(this));
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
            Ceiling6Service j2 = mo31477F1();
            Ceiling6Service.CmdKey cmdKey = Ceiling6Service.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            j2.sendCmd(cmdKey, sb2.toString(), new C11497n(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Ceiling6Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeiling6Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Ceiling6Service.Power.on, new C11503t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42326l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling6Service.C6835u0)) {
            AppUtils.m8300u(f21133C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Ceiling6Service.C6835u0) obj2);
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
            mo31477F1().openWithMode(Ceiling6Service.Power.on, Ceiling6Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11500q(i));
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
            mo31477F1().setBright(Long.valueOf(j), Ceiling6Service.Effect.smooth, 500L, new C11508y(j));
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
            mo31477F1().setCt(Long.valueOf((long) i), Ceiling6Service.Effect.smooth, 500L, new C11509z(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11485c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11488e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        try {
            mo31477F1().sendCmd(Ceiling6Service.CmdKey.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11502s(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21136z);
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
            if (jSONArray.length() != 13) {
                AppUtils.m8300u("BATCH_RPC", "Ceiling5Device, Invalid length of batch rpc result: " + str2);
            }
            Ceiling6Service.Power valueOf = Ceiling6Service.Power.valueOf(jSONArray.getString(0));
            Long valueOf2 = Long.valueOf(jSONArray.getLong(1));
            Long valueOf3 = Long.valueOf(jSONArray.getLong(2));
            Long valueOf4 = Long.valueOf(jSONArray.getLong(3));
            String string = jSONArray.getString(4);
            Long valueOf5 = Long.valueOf(jSONArray.getLong(5));
            Long valueOf6 = Long.valueOf(jSONArray.getLong(6));
            Long valueOf7 = Long.valueOf(jSONArray.getLong(7));
            Long valueOf8 = Long.valueOf(jSONArray.getLong(8));
            String string2 = jSONArray.getString(9);
            Long valueOf9 = Long.valueOf(jSONArray.getLong(10));
            Long valueOf10 = Long.valueOf(jSONArray.getLong(11));
            Long valueOf11 = Long.valueOf(jSONArray.getLong(12));
            StringBuilder sb = new StringBuilder();
            sb.append("deviceId:");
            sb.append(mo23185G());
            sb.append("       smartSwitch: ");
            sb.append(valueOf11);
            m29173k2(valueOf, valueOf2, valueOf3, valueOf4, string, valueOf5, valueOf6, valueOf7, valueOf8, string2, valueOf9, valueOf10, valueOf11);
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
                mo31477F1().getProperties(new C11494k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11482a0(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11484b0(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11486c0(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11481a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C11483b(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f21133C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("NLBright").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty("MiBandSleep").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("SmartSwitch").getInternalName()};
    }
}
