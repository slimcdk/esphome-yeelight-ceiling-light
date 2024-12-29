package p223w3;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.LanDevice;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.CeilingDService;
import com.yeelight.yeelib.device.xiaomi.YeelightCeilingDDevice;
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

/* renamed from: w3.o */
public class C11511o extends C10333b {

    /* renamed from: C */
    public static final String f21180C = "o";

    /* renamed from: A */
    CompletionHandler f21181A = new C11523i(this);

    /* renamed from: B */
    CeilingDService.C6882u0 f21182B = new C11524j();

    /* renamed from: z */
    CompletionHandler f21183z = new C11522h(this);

    /* renamed from: w3.o$a */
    class C11512a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21184a;

        C11512a(C8327s sVar) {
            this.f21184a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31557P0(this.f21184a);
        }
    }

    /* renamed from: w3.o$a0 */
    class C11513a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21186a;

        C11513a0(C8327s sVar) {
            this.f21186a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31557P0(this.f21186a);
        }
    }

    /* renamed from: w3.o$b */
    class C11514b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21188a;

        C11514b(C8327s sVar) {
            this.f21188a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31557P0(this.f21188a);
        }
    }

    /* renamed from: w3.o$b0 */
    class C11515b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21190a;

        C11515b0(C8327s sVar) {
            this.f21190a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31557P0(this.f21190a);
        }
    }

    /* renamed from: w3.o$c */
    class C11516c implements CompletionHandler {
        C11516c(C11511o oVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.o$c0 */
    class C11517c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21192a;

        C11517c0(C8327s sVar) {
            this.f21192a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31557P0(this.f21192a);
        }
    }

    /* renamed from: w3.o$d */
    class C11518d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21194a;

        C11518d(boolean z) {
            this.f21194a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31555O0(this.f21194a);
        }
    }

    /* renamed from: w3.o$e */
    class C11519e implements CompletionHandler {
        C11519e(C11511o oVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.o$f */
    class C11520f implements CompletionHandler {
        C11520f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.o$g */
    class C11521g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21197a;

        C11521g(long j) {
            this.f21197a = j;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31565T0(this.f21197a);
        }
    }

    /* renamed from: w3.o$h */
    class C11522h implements CompletionHandler {
        C11522h(C11511o oVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.o$i */
    class C11523i implements CompletionHandler {
        C11523i(C11511o oVar) {
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

    /* renamed from: w3.o$j */
    class C11524j implements CeilingDService.C6882u0 {
        C11524j() {
        }

        /* renamed from: a */
        public void mo32979a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11511o.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo32980b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11511o.this.mo23221d0().mo31611r(2) == null) {
                C11511o.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11511o.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo32981c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11511o.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo32982d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11511o.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo32983e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11511o.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo32984f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11511o.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo32985g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11511o.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo32986h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C11511o.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo32987i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C11511o.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C11511o.this.mo23221d0().mo31543I0(true);
                }
                C11511o.this.mo23221d0().mo31541H0(split[1]);
                C11511o.this.mo23221d0().mo31539G0(split[2]);
                C11511o.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C11511o.f21180C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C11511o.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C11511o.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C11511o.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo32988j(CeilingDService.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11536v.f21220a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11511o.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11511o.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: k */
        public void mo32989k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNLBrightChanged: ");
            sb.append(l);
            if (l.longValue() != 0) {
                C11511o.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
                C11511o.this.mo23221d0().mo31545J0(l.longValue());
                return;
            }
            C11511o.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo32990m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("c: ");
            sb.append(l);
            C11511o.this.mo23221d0().mo31591h(l.longValue() == 1);
        }

        /* renamed from: p */
        public void mo32991p(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onTransIntervalDfltChanged: ");
            sb.append(l);
            if (l != null) {
                C11511o.this.mo23221d0().mo31565T0(l.longValue());
            }
        }
    }

    /* renamed from: w3.o$k */
    class C11525k implements CeilingDService.C6874q0 {
        C11525k() {
        }

        /* renamed from: a */
        public void mo32971a(CeilingDService.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10) {
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
            sb13.append("transIntervalDflt: ");
            Long l19 = l10;
            sb13.append(l19);
            C11511o.this.m29268k2(power, l, l11, l14, str3, l12, l13, l18, l15, str4, l16, l17, l19);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.o$l */
    class C11526l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21201a;

        C11526l(boolean z) {
            this.f21201a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31583d(this.f21201a);
        }
    }

    /* renamed from: w3.o$m */
    class C11527m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21203a;

        C11527m(int i) {
            this.f21203a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31547K0(this.f21203a);
        }
    }

    /* renamed from: w3.o$n */
    class C11528n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21205a;

        C11528n(boolean z) {
            this.f21205a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31543I0(this.f21205a);
        }
    }

    /* renamed from: w3.o$o */
    class C11529o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21207a;

        /* renamed from: b */
        final /* synthetic */ String f21208b;

        /* renamed from: c */
        final /* synthetic */ String f21209c;

        /* renamed from: d */
        final /* synthetic */ int f21210d;

        C11529o(boolean z, String str, String str2, int i) {
            this.f21207a = z;
            this.f21208b = str;
            this.f21209c = str2;
            this.f21210d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31543I0(this.f21207a);
            C11511o.this.mo23221d0().mo31541H0(this.f21208b);
            C11511o.this.mo23221d0().mo31539G0(this.f21209c);
            C11511o.this.mo23221d0().mo31537F0(this.f21210d);
        }
    }

    /* renamed from: w3.o$p */
    class C11530p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f21212a;

        /* renamed from: b */
        final /* synthetic */ String f21213b;

        /* renamed from: c */
        final /* synthetic */ int f21214c;

        C11530p(String str, String str2, int i) {
            this.f21212a = str;
            this.f21213b = str2;
            this.f21214c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31541H0(this.f21212a);
            C11511o.this.mo23221d0().mo31539G0(this.f21213b);
            C11511o.this.mo23221d0().mo31537F0(this.f21214c);
        }
    }

    /* renamed from: w3.o$q */
    class C11531q implements CompletionHandler {
        C11531q(C11511o oVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.o$r */
    class C11532r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21216a;

        C11532r(int i) {
            this.f21216a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31551M0(true);
            C11511o oVar = C11511o.this;
            oVar.mo23165w1(oVar.mo23247j1(this.f21216a));
        }
    }

    /* renamed from: w3.o$s */
    class C11533s implements CompletionHandler {
        C11533s(C11511o oVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.o$t */
    class C11534t implements CompletionHandler {
        C11534t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.o$u */
    class C11535u implements WifiDeviceBase.C6080i {
        C11535u() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11511o.this.f21182B.mo32979a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11511o.this.f21182B.mo32986h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
            C11511o.this.f21182B.mo32989k(l);
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C11511o.this.f21182B.mo32988j(CeilingDService.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.o$v */
    static /* synthetic */ class C11536v {

        /* renamed from: a */
        static final /* synthetic */ int[] f21220a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.CeilingDService$Power[] r0 = com.yeelight.yeelib.device.xiaomi.CeilingDService.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21220a = r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$Power r1 = com.yeelight.yeelib.device.xiaomi.CeilingDService.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21220a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.CeilingDService$Power r1 = com.yeelight.yeelib.device.xiaomi.CeilingDService.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11511o.C11536v.<clinit>():void");
        }
    }

    /* renamed from: w3.o$w */
    class C11537w implements CompletionHandler {
        C11537w() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.o$x */
    class C11538x implements CompletionHandler {
        C11538x() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.o$y */
    class C11539y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21223a;

        C11539y(long j) {
            this.f21223a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31600l0(this.f21223a);
        }
    }

    /* renamed from: w3.o$z */
    class C11540z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21225a;

        C11540z(int i) {
            this.f21225a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11511o.this.mo23221d0().mo31610q0(this.f21225a);
        }
    }

    public C11511o(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m29268k2(CeilingDService.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10) {
        CeilingDService.Power power2 = power;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == CeilingDService.Power.on);
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
        DeviceStatusBase d0 = mo23221d0();
        if (l9.longValue() == 0) {
            z = false;
        }
        d0.mo31618u0(z);
        if (l10 != null) {
            mo23221d0().mo31565T0(l10.longValue());
        }
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11538x());
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
        return R$drawable.icon_yeelight_device_badge_ceilingc_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_ceilingc_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11535u();
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
            mo31477F1().sendCmd(CeilingDService.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11526l(z));
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
            CeilingDService j2 = mo31477F1();
            CeilingDService.CmdKey cmdKey = CeilingDService.CmdKey.nighttime;
            j2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C11530p(str, str2, i));
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
            mo31477F1().sendCmd(CeilingDService.CmdKey.cfg_init_power, String.valueOf(i), new C11527m(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(CeilingDService.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11518d(z));
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
        return mo42328l2(this.f21181A, this.f21182B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21183z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21180C, "Invalid handler!");
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
            mo31477F1().sendCmd(CeilingDService.CmdKey.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11531q(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23127O1()) {
            return true;
        }
        try {
            mo31477F1().setPower(CeilingDService.Power.off, new C11537w());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11520f());
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
            mo31477F1().sendCmd(CeilingDService.CmdKey.nighttime, z ? "enable" : "disable", new C11528n(z));
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
            mo31477F1().sendCmd(CeilingDService.CmdKey.pseudo_beacon, "4097|" + i, new C11533s(this));
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
            CeilingDService j2 = mo31477F1();
            CeilingDService.CmdKey cmdKey = CeilingDService.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            j2.sendCmd(cmdKey, sb2.toString(), new C11529o(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public CeilingDService mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeilingDDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23138Y1()) {
            return true;
        }
        try {
            mo31477F1().setPower(CeilingDService.Power.on, new C11534t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42328l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof CeilingDService.C6882u0)) {
            AppUtils.m8300u(f21180C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (CeilingDService.C6882u0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23139Z1(mo23221d0().mo31554O(), i)) {
            return true;
        }
        try {
            mo31477F1().openWithMode(CeilingDService.Power.on, CeilingDService.Effect.smooth, Long.valueOf(mo23221d0().mo31554O()), Long.valueOf((long) i), new C11532r(i));
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
            mo31477F1().setBright(Long.valueOf(j), new C11539y(j));
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
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23123K2(i)) {
            return true;
        }
        try {
            mo31477F1().setCt(Long.valueOf((long) i), new C11540z(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11516c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11519e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21183z);
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
                AppUtils.m8300u("BATCH_RPC", "CeilingDDevice, Invalid length of batch rpc result: " + str2);
            }
            m29268k2(CeilingDService.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), jSONArray.getString(4), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)));
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
                mo31477F1().getProperties(new C11525k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11513a0(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11515b0(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11517c0(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11512a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C11514b(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f21180C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: y1 */
    public boolean mo23250y1(long j) {
        try {
            CeilingDService j2 = mo31477F1();
            CeilingDService.CmdKey cmdKey = CeilingDService.CmdKey.trans_default;
            j2.sendCmd(cmdKey, j + ",1", new C11521g(j));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("NLBright").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty("MiBandSleep").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("TransIntervalDflt").getInternalName()};
    }
}
