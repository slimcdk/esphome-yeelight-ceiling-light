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
import com.yeelight.yeelib.device.xiaomi.Ceiling35Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling35Device;
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

/* renamed from: w3.k */
public class C11280k extends C10333b {

    /* renamed from: C */
    public static final String f20834C = "k";

    /* renamed from: A */
    CompletionHandler f20835A = new C11293i(this);

    /* renamed from: B */
    Ceiling35Service.C6674w0 f20836B = new C11294j();

    /* renamed from: z */
    CompletionHandler f20837z = new C11292h(this);

    /* renamed from: w3.k$a */
    class C11281a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20838a;

        C11281a(C8327s sVar) {
            this.f20838a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31557P0(this.f20838a);
        }
    }

    /* renamed from: w3.k$a0 */
    class C11282a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20840a;

        C11282a0(int i) {
            this.f20840a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31610q0(this.f20840a);
        }
    }

    /* renamed from: w3.k$b */
    class C11283b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20842a;

        C11283b(C8327s sVar) {
            this.f20842a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31557P0(this.f20842a);
        }
    }

    /* renamed from: w3.k$b0 */
    class C11284b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20844a;

        C11284b0(C8327s sVar) {
            this.f20844a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31557P0(this.f20844a);
        }
    }

    /* renamed from: w3.k$c */
    class C11285c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20846a;

        C11285c(C8327s sVar) {
            this.f20846a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31557P0(this.f20846a);
        }
    }

    /* renamed from: w3.k$c0 */
    class C11286c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20848a;

        C11286c0(C8327s sVar) {
            this.f20848a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31557P0(this.f20848a);
        }
    }

    /* renamed from: w3.k$d */
    class C11287d implements CompletionHandler {
        C11287d(C11280k kVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k$d0 */
    class C11288d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20850a;

        C11288d0(C8327s sVar) {
            this.f20850a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31557P0(this.f20850a);
        }
    }

    /* renamed from: w3.k$e */
    class C11289e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20852a;

        C11289e(boolean z) {
            this.f20852a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31555O0(this.f20852a);
        }
    }

    /* renamed from: w3.k$f */
    class C11290f implements CompletionHandler {
        C11290f(C11280k kVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k$g */
    class C11291g implements CompletionHandler {
        C11291g() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.k$h */
    class C11292h implements CompletionHandler {
        C11292h(C11280k kVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k$i */
    class C11293i implements CompletionHandler {
        C11293i(C11280k kVar) {
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

    /* renamed from: w3.k$j */
    class C11294j implements Ceiling35Service.C6674w0 {
        C11294j() {
        }

        /* renamed from: a */
        public void mo32656a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11280k.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo32657b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11280k.this.mo23221d0().mo31611r(2) == null) {
                C11280k.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11280k.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo32658c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11280k.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo32659d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11280k.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo32660e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11280k.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo32661f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11280k.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo32662g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11280k.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo32663h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C11280k.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo32664i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C11280k.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C11280k.this.mo23221d0().mo31543I0(true);
                }
                C11280k.this.mo23221d0().mo31541H0(split[1]);
                C11280k.this.mo23221d0().mo31539G0(split[2]);
                C11280k.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C11280k.f20834C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C11280k.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C11280k.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C11280k.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo32665j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNlCtChanged: ");
            sb.append(l);
            C11280k.this.mo23221d0().mo31535E0(l.intValue());
        }

        /* renamed from: k */
        public void mo32666k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNLBrightChanged: ");
            sb.append(l);
            if (l.longValue() != 0) {
                C11280k.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
                C11280k.this.mo23221d0().mo31545J0(l.longValue());
                return;
            }
            C11280k.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: l */
        public void mo32667l(Ceiling35Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11307w.f20878a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11280k.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11280k.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: m */
        public void mo32668m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("c: ");
            sb.append(l);
            C11280k.this.mo23221d0().mo31591h(l.longValue() == 1);
        }

        /* renamed from: o */
        public void mo32669o(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("deviceId:");
            sb.append(C11280k.this.mo23185G());
            sb.append("       smartSwitch: ");
            sb.append(l);
            C11280k.this.mo23221d0().mo31597k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: w3.k$k */
    class C11295k implements Ceiling35Service.C6666s0 {
        C11295k() {
        }

        /* renamed from: a */
        public void mo32648a(Ceiling35Service.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10, Long l11) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power != null ? power.name() : "null");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            sb2.append(l);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ct: ");
            Long l12 = l2;
            sb3.append(l12);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("lanMode: ");
            Long l13 = l4;
            sb4.append(l13);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("saveState: ");
            Long l14 = l5;
            sb5.append(l14);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("delayoff: ");
            Long l15 = l3;
            sb6.append(l15);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowParams: ");
            String str3 = str;
            sb7.append(str3);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("nLBright: ");
            Long l16 = l7;
            sb8.append(l16);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("nightTimeInfo : ");
            String str4 = str2;
            sb9.append(str4);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("miBandSleep : ");
            Long l17 = l8;
            sb10.append(l17);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("flowing : ");
            Long l18 = l9;
            sb11.append(l18);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("onFromPower : ");
            Long l19 = l6;
            sb12.append(l19);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("nlCt : ");
            sb13.append(l10);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("deviceId:");
            sb14.append(C11280k.this.mo23185G());
            sb14.append("       smartSwitch: ");
            sb14.append(l11);
            C11280k.this.m28682k2(power, l, l12, l15, str3, l13, l14, l19, l16, str4, l17, l18, l10, l11);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.k$l */
    class C11296l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20857a;

        C11296l(boolean z) {
            this.f20857a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31583d(this.f20857a);
        }
    }

    /* renamed from: w3.k$m */
    class C11297m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20859a;

        C11297m(int i) {
            this.f20859a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31547K0(this.f20859a);
        }
    }

    /* renamed from: w3.k$n */
    class C11298n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20861a;

        C11298n(boolean z) {
            this.f20861a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31543I0(this.f20861a);
        }
    }

    /* renamed from: w3.k$o */
    class C11299o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20863a;

        /* renamed from: b */
        final /* synthetic */ String f20864b;

        /* renamed from: c */
        final /* synthetic */ String f20865c;

        /* renamed from: d */
        final /* synthetic */ int f20866d;

        C11299o(boolean z, String str, String str2, int i) {
            this.f20863a = z;
            this.f20864b = str;
            this.f20865c = str2;
            this.f20866d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31543I0(this.f20863a);
            C11280k.this.mo23221d0().mo31541H0(this.f20864b);
            C11280k.this.mo23221d0().mo31539G0(this.f20865c);
            C11280k.this.mo23221d0().mo31537F0(this.f20866d);
        }
    }

    /* renamed from: w3.k$p */
    class C11300p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f20868a;

        /* renamed from: b */
        final /* synthetic */ String f20869b;

        /* renamed from: c */
        final /* synthetic */ int f20870c;

        C11300p(String str, String str2, int i) {
            this.f20868a = str;
            this.f20869b = str2;
            this.f20870c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31541H0(this.f20868a);
            C11280k.this.mo23221d0().mo31539G0(this.f20869b);
            C11280k.this.mo23221d0().mo31537F0(this.f20870c);
        }
    }

    /* renamed from: w3.k$q */
    class C11301q implements CompletionHandler {
        C11301q(C11280k kVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k$r */
    class C11302r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20872a;

        C11302r(int i) {
            this.f20872a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31551M0(true);
            C11280k kVar = C11280k.this;
            kVar.mo23165w1(kVar.mo23247j1(this.f20872a));
        }
    }

    /* renamed from: w3.k$s */
    class C11303s implements CompletionHandler {
        C11303s(C11280k kVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k$t */
    class C11304t implements CompletionHandler {
        C11304t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.k$u */
    class C11305u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20875a;

        C11305u(boolean z) {
            this.f20875a = z;
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("sendRemoteKey cfg_smart_switch --> onFailed code: ");
            sb.append(i);
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31597k(this.f20875a);
        }
    }

    /* renamed from: w3.k$v */
    class C11306v implements WifiDeviceBase.C6080i {
        C11306v() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11280k.this.f20836B.mo32656a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11280k.this.f20836B.mo32663h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
            C11280k.this.f20836B.mo32666k(l);
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C11280k.this.f20836B.mo32667l(Ceiling35Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.k$w */
    static /* synthetic */ class C11307w {

        /* renamed from: a */
        static final /* synthetic */ int[] f20878a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling35Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling35Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20878a = r0
                com.yeelight.yeelib.device.xiaomi.Ceiling35Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling35Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20878a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling35Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling35Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11280k.C11307w.<clinit>():void");
        }
    }

    /* renamed from: w3.k$x */
    class C11308x implements CompletionHandler {
        C11308x() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.k$y */
    class C11309y implements CompletionHandler {
        C11309y() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.k$z */
    class C11310z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20881a;

        C11310z(long j) {
            this.f20881a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11280k.this.mo23221d0().mo31600l0(this.f20881a);
        }
    }

    public C11280k(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m28682k2(Ceiling35Service.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10, Long l11) {
        Ceiling35Service.Power power2 = power;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == Ceiling35Service.Power.on);
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
        mo23221d0().mo31535E0(l10 == null ? 0 : l10.intValue());
        DeviceStatusBase d0 = mo23221d0();
        if (l11 == null || l11.longValue() != 1) {
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
            mo31477F1().toggle(new C11309y());
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
        String T = mo23208T();
        T.hashCode();
        return !T.equals("yeelink.light.ceil35") ? !T.equals("yeelink.light.ceile") ? R$drawable.icon_yeelight_device_badge_ceiling35_small : R$drawable.icon_yeelight_device_badge_luna_small : R$drawable.icon_yeelight_device_badge_ceiling35_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        String T = mo23208T();
        T.hashCode();
        return !T.equals("yeelink.light.ceil35") ? !T.equals("yeelink.light.ceile") ? R$drawable.icon_yeelight_device_badge_ceiling35_big : R$drawable.icon_yeelight_device_badge_luna_big : R$drawable.icon_yeelight_device_badge_ceiling35_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11306v();
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
            mo31477F1().sendCmd(Ceiling35Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11296l(z));
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
            Ceiling35Service j2 = mo31477F1();
            Ceiling35Service.CmdKey cmdKey = Ceiling35Service.CmdKey.nighttime;
            j2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C11300p(str, str2, i));
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
            mo31477F1().sendCmd(Ceiling35Service.CmdKey.cfg_init_power, String.valueOf(i), new C11297m(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Ceiling35Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11289e(z));
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
        return mo42308l2(this.f20835A, this.f20836B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20837z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20834C, "Invalid handler!");
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
            mo31477F1().sendCmd(Ceiling35Service.CmdKey.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11301q(this));
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
            mo31477F1().setPower(Ceiling35Service.Power.off, new C11308x());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11291g());
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
            mo31477F1().sendCmd(Ceiling35Service.CmdKey.nighttime, z ? "enable" : "disable", new C11298n(z));
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
            mo31477F1().sendCmd(Ceiling35Service.CmdKey.pseudo_beacon, "4097|" + i, new C11303s(this));
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
            Ceiling35Service j2 = mo31477F1();
            Ceiling35Service.CmdKey cmdKey = Ceiling35Service.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            j2.sendCmd(cmdKey, sb2.toString(), new C11299o(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Ceiling35Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeiling35Device) abstractDevice).mCeiling35Service;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Ceiling35Service.Power.on, new C11304t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42308l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling35Service.C6674w0)) {
            AppUtils.m8300u(f20834C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Ceiling35Service.C6674w0) obj2);
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
            mo31477F1().openWithMode(Ceiling35Service.Power.on, Ceiling35Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11302r(i));
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
            mo31477F1().setBright(Long.valueOf(j), Ceiling35Service.Effect.smooth, 500L, new C11310z(j));
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
            mo31477F1().setCt(Long.valueOf((long) i), Ceiling35Service.Effect.smooth, 500L, new C11282a0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11287d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11290f(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        try {
            mo31477F1().sendCmd(Ceiling35Service.CmdKey.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11305u(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20837z);
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
            if (jSONArray.length() != 14) {
                AppUtils.m8300u("BATCH_RPC", "Ceiling5Device, Invalid length of batch rpc result: " + str2);
            }
            Ceiling35Service.Power valueOf = Ceiling35Service.Power.valueOf(jSONArray.getString(0));
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
            Long valueOf12 = Long.valueOf(jSONArray.getLong(13));
            StringBuilder sb = new StringBuilder();
            sb.append("deviceId:");
            sb.append(mo23185G());
            sb.append("       smartSwitch: ");
            sb.append(valueOf12);
            m28682k2(valueOf, valueOf2, valueOf3, valueOf4, string, valueOf5, valueOf6, valueOf7, valueOf8, string2, valueOf9, valueOf10, valueOf11, valueOf12);
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
                mo31477F1().getProperties(new C11295k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11284b0(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11286c0(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11288d0(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11281a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), -1L, new C11283b(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (sVar.mo35422G()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), Long.valueOf((long) sVar.mo35441h()), new C11285c(sVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str = f20834C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("NLBright").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty("MiBandSleep").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty(Ceiling35Service.PROPERTY_NlCt).getInternalName(), mo31477F1().getService().getProperty("SmartSwitch").getInternalName()};
    }
}
