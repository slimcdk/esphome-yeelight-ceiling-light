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
import com.yeelight.yeelib.device.xiaomi.CeilingService;
import com.yeelight.yeelib.device.xiaomi.YeelightCeilingDevice;
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

/* renamed from: w3.p */
public class C11542p extends C10333b {

    /* renamed from: C */
    public static final String f21227C = "p";

    /* renamed from: A */
    CompletionHandler f21228A = new C11552h(this);

    /* renamed from: B */
    CeilingService.C6925s0 f21229B = new C11553i();

    /* renamed from: z */
    CompletionHandler f21230z = new C11551g(this);

    /* renamed from: w3.p$a */
    class C11543a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21231a;

        C11543a(C8327s sVar) {
            this.f21231a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31557P0(this.f21231a);
        }
    }

    /* renamed from: w3.p$a0 */
    class C11544a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21233a;

        C11544a0(C8327s sVar) {
            this.f21233a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31557P0(this.f21233a);
        }
    }

    /* renamed from: w3.p$b */
    class C11545b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21235a;

        C11545b(C8327s sVar) {
            this.f21235a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31557P0(this.f21235a);
        }
    }

    /* renamed from: w3.p$b0 */
    class C11546b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21237a;

        C11546b0(C8327s sVar) {
            this.f21237a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31557P0(this.f21237a);
        }
    }

    /* renamed from: w3.p$c */
    class C11547c implements CompletionHandler {
        C11547c(C11542p pVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.p$d */
    class C11548d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21239a;

        C11548d(boolean z) {
            this.f21239a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31555O0(this.f21239a);
        }
    }

    /* renamed from: w3.p$e */
    class C11549e implements CompletionHandler {
        C11549e(C11542p pVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.p$f */
    class C11550f implements CompletionHandler {
        C11550f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.p$g */
    class C11551g implements CompletionHandler {
        C11551g(C11542p pVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.p$h */
    class C11552h implements CompletionHandler {
        C11552h(C11542p pVar) {
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

    /* renamed from: w3.p$i */
    class C11553i implements CeilingService.C6925s0 {
        C11553i() {
        }

        /* renamed from: a */
        public void mo33048a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11542p.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo33049b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11542p.this.mo23221d0().mo31611r(2) == null) {
                C11542p.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11542p.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo33050c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11542p.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo33051d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11542p.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo33052e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11542p.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo33053f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11542p.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo33054g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11542p.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo33055h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C11542p.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo33056i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C11542p.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C11542p.this.mo23221d0().mo31543I0(true);
                }
                C11542p.this.mo23221d0().mo31541H0(split[1]);
                C11542p.this.mo23221d0().mo31539G0(split[2]);
                C11542p.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C11542p.f21227C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C11542p.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C11542p.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C11542p.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo33057j(CeilingService.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11565u.f21263a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11542p.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11542p.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: k */
        public void mo33058k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNLBrightChanged: ");
            sb.append(l);
            if (l.longValue() != 0) {
                C11542p.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
                C11542p.this.mo23221d0().mo31545J0(l.longValue());
                return;
            }
            C11542p.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo33059m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("c: ");
            sb.append(l);
            C11542p.this.mo23221d0().mo31591h(l.longValue() == 1);
        }
    }

    /* renamed from: w3.p$j */
    class C11554j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21243a;

        C11554j(boolean z) {
            this.f21243a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31583d(this.f21243a);
        }
    }

    /* renamed from: w3.p$k */
    class C11555k implements CeilingService.C6919p0 {
        C11555k() {
        }

        /* renamed from: a */
        public void mo33042a(CeilingService.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9) {
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
            sb4.append("lanMode: ");
            Long l11 = l4;
            sb4.append(l11);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("saveState: ");
            Long l12 = l5;
            sb5.append(l12);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("delayoff: ");
            Long l13 = l3;
            sb6.append(l13);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowParams: ");
            String str3 = str;
            sb7.append(str3);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("nLBright: ");
            Long l14 = l7;
            sb8.append(l14);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("nightTimeInfo : ");
            String str4 = str2;
            sb9.append(str4);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("miBandSleep : ");
            Long l15 = l8;
            sb10.append(l15);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("flowing : ");
            Long l16 = l9;
            sb11.append(l16);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("onFromPower : ");
            Long l17 = l6;
            sb12.append(l17);
            C11542p.this.m29364k2(power, l, l10, l13, str3, l11, l12, l17, l14, str4, l15, l16);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.p$l */
    class C11556l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21246a;

        C11556l(int i) {
            this.f21246a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31547K0(this.f21246a);
        }
    }

    /* renamed from: w3.p$m */
    class C11557m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21248a;

        C11557m(boolean z) {
            this.f21248a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31543I0(this.f21248a);
        }
    }

    /* renamed from: w3.p$n */
    class C11558n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21250a;

        /* renamed from: b */
        final /* synthetic */ String f21251b;

        /* renamed from: c */
        final /* synthetic */ String f21252c;

        /* renamed from: d */
        final /* synthetic */ int f21253d;

        C11558n(boolean z, String str, String str2, int i) {
            this.f21250a = z;
            this.f21251b = str;
            this.f21252c = str2;
            this.f21253d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31543I0(this.f21250a);
            C11542p.this.mo23221d0().mo31541H0(this.f21251b);
            C11542p.this.mo23221d0().mo31539G0(this.f21252c);
            C11542p.this.mo23221d0().mo31537F0(this.f21253d);
        }
    }

    /* renamed from: w3.p$o */
    class C11559o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f21255a;

        /* renamed from: b */
        final /* synthetic */ String f21256b;

        /* renamed from: c */
        final /* synthetic */ int f21257c;

        C11559o(String str, String str2, int i) {
            this.f21255a = str;
            this.f21256b = str2;
            this.f21257c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31541H0(this.f21255a);
            C11542p.this.mo23221d0().mo31539G0(this.f21256b);
            C11542p.this.mo23221d0().mo31537F0(this.f21257c);
        }
    }

    /* renamed from: w3.p$p */
    class C11560p implements CompletionHandler {
        C11560p(C11542p pVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.p$q */
    class C11561q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21259a;

        C11561q(int i) {
            this.f21259a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31551M0(true);
            C11542p pVar = C11542p.this;
            pVar.mo23165w1(pVar.mo23247j1(this.f21259a));
        }
    }

    /* renamed from: w3.p$r */
    class C11562r implements CompletionHandler {
        C11562r(C11542p pVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.p$s */
    class C11563s implements WifiDeviceBase.C6080i {
        C11563s() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11542p.this.f21229B.mo33048a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11542p.this.f21229B.mo33055h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
            C11542p.this.f21229B.mo33058k(l);
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C11542p.this.f21229B.mo33057j(CeilingService.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.p$t */
    class C11564t implements CompletionHandler {
        C11564t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.p$u */
    static /* synthetic */ class C11565u {

        /* renamed from: a */
        static final /* synthetic */ int[] f21263a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.CeilingService$Power[] r0 = com.yeelight.yeelib.device.xiaomi.CeilingService.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21263a = r0
                com.yeelight.yeelib.device.xiaomi.CeilingService$Power r1 = com.yeelight.yeelib.device.xiaomi.CeilingService.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21263a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.CeilingService$Power r1 = com.yeelight.yeelib.device.xiaomi.CeilingService.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11542p.C11565u.<clinit>():void");
        }
    }

    /* renamed from: w3.p$v */
    class C11566v implements CompletionHandler {
        C11566v() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.p$w */
    class C11567w implements CompletionHandler {
        C11567w() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.p$x */
    class C11568x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21266a;

        C11568x(long j) {
            this.f21266a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31600l0(this.f21266a);
        }
    }

    /* renamed from: w3.p$y */
    class C11569y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21268a;

        C11569y(int i) {
            this.f21268a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31610q0(this.f21268a);
        }
    }

    /* renamed from: w3.p$z */
    class C11570z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21270a;

        C11570z(C8327s sVar) {
            this.f21270a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11542p.this.mo23221d0().mo31557P0(this.f21270a);
        }
    }

    public C11542p(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m29364k2(CeilingService.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9) {
        CeilingService.Power power2 = power;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == CeilingService.Power.on);
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
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11567w());
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
            return R$drawable.icon_yeelight_device_badge_luna_small;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -1462015185:
                if (T.equals("yeelink.light.ceiling16")) {
                    c = 0;
                    break;
                }
                break;
            case -1462015184:
                if (T.equals("yeelink.light.ceiling17")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015183:
                if (T.equals("yeelink.light.ceiling18")) {
                    c = 2;
                    break;
                }
                break;
            case -1462015159:
                if (T.equals("yeelink.light.ceiling21")) {
                    c = 3;
                    break;
                }
                break;
            case -1462015158:
                if (T.equals("yeelink.light.ceiling22")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015157:
                if (T.equals("yeelink.light.ceiling23")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015156:
                if (T.equals("yeelink.light.ceiling24")) {
                    c = 6;
                    break;
                }
                break;
            case -1317475915:
                if (T.equals("yeelink.light.ceil30")) {
                    c = 7;
                    break;
                }
                break;
            case -1317475914:
                if (T.equals("yeelink.light.ceil31")) {
                    c = 8;
                    break;
                }
                break;
            case 922669543:
                if (T.equals("yeelink.light.ceiling1")) {
                    c = 9;
                    break;
                }
                break;
            case 922669545:
                if (T.equals("yeelink.light.ceiling3")) {
                    c = 10;
                    break;
                }
                break;
            case 922669547:
                if (T.equals("yeelink.light.ceiling5")) {
                    c = 11;
                    break;
                }
                break;
            case 922669548:
                if (T.equals("yeelink.light.ceiling6")) {
                    c = 12;
                    break;
                }
                break;
            case 922669549:
                if (T.equals("yeelink.light.ceiling7")) {
                    c = 13;
                    break;
                }
                break;
            case 922669550:
                if (T.equals("yeelink.light.ceiling8")) {
                    c = 14;
                    break;
                }
                break;
            case 922669551:
                if (T.equals("yeelink.light.ceiling9")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_ceiling16_small;
            case 1:
                return R$drawable.icon_yeelight_device_badge_ceiling17_small;
            case 2:
                return R$drawable.icon_yeelight_device_badge_ceiling18_small;
            case 3:
                return R$drawable.icon_yeelight_device_badge_ceiling21_small;
            case 4:
                return R$drawable.icon_yeelight_device_badge_ceiling22_small;
            case 5:
                return R$drawable.icon_yeelight_device_badge_ceiling23_small;
            case 6:
                return R$drawable.icon_yeelight_device_badge_ceiling24_small;
            case 7:
                return R$drawable.icon_yeelight_device_badge_ceiling30_small;
            case 8:
                return R$drawable.icon_yeelight_device_badge_ceiling31_small;
            case 9:
                return R$drawable.icon_yeelight_device_badge_luna_small;
            case 10:
                return R$drawable.icon_yeelight_device_badge_eos_small;
            case 11:
                return R$drawable.icon_yeelight_device_badge_cycle_small;
            case 12:
            case 15:
                return R$drawable.icon_yeelight_device_badge_nox_pro_small;
            case 13:
                return R$drawable.icon_yeelight_device_badge_nox_small;
            case 14:
                return R$drawable.icon_yeelight_device_badge_nox_plus_small;
            default:
                return R$drawable.icon_yeelight_device_badge_luna_small;
        }
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_luna_big;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -1462015185:
                if (T.equals("yeelink.light.ceiling16")) {
                    c = 0;
                    break;
                }
                break;
            case -1462015184:
                if (T.equals("yeelink.light.ceiling17")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015183:
                if (T.equals("yeelink.light.ceiling18")) {
                    c = 2;
                    break;
                }
                break;
            case -1462015159:
                if (T.equals("yeelink.light.ceiling21")) {
                    c = 3;
                    break;
                }
                break;
            case -1462015158:
                if (T.equals("yeelink.light.ceiling22")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015157:
                if (T.equals("yeelink.light.ceiling23")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015156:
                if (T.equals("yeelink.light.ceiling24")) {
                    c = 6;
                    break;
                }
                break;
            case -1317475915:
                if (T.equals("yeelink.light.ceil30")) {
                    c = 7;
                    break;
                }
                break;
            case -1317475914:
                if (T.equals("yeelink.light.ceil31")) {
                    c = 8;
                    break;
                }
                break;
            case 922669543:
                if (T.equals("yeelink.light.ceiling1")) {
                    c = 9;
                    break;
                }
                break;
            case 922669545:
                if (T.equals("yeelink.light.ceiling3")) {
                    c = 10;
                    break;
                }
                break;
            case 922669547:
                if (T.equals("yeelink.light.ceiling5")) {
                    c = 11;
                    break;
                }
                break;
            case 922669548:
                if (T.equals("yeelink.light.ceiling6")) {
                    c = 12;
                    break;
                }
                break;
            case 922669549:
                if (T.equals("yeelink.light.ceiling7")) {
                    c = 13;
                    break;
                }
                break;
            case 922669550:
                if (T.equals("yeelink.light.ceiling8")) {
                    c = 14;
                    break;
                }
                break;
            case 922669551:
                if (T.equals("yeelink.light.ceiling9")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_ceiling16_big;
            case 1:
                return R$drawable.icon_yeelight_device_badge_ceiling17_big;
            case 2:
                return R$drawable.icon_yeelight_device_badge_ceiling18_big;
            case 3:
                return R$drawable.icon_yeelight_device_badge_ceiling21_big;
            case 4:
                return R$drawable.icon_yeelight_device_badge_ceiling22_big;
            case 5:
                return R$drawable.icon_yeelight_device_badge_ceiling23_big;
            case 6:
                return R$drawable.icon_yeelight_device_badge_ceiling24_big;
            case 7:
                return R$drawable.icon_yeelight_device_badge_ceiling30_big;
            case 8:
                return R$drawable.icon_yeelight_device_badge_ceiling31_big;
            case 9:
                return R$drawable.icon_yeelight_device_badge_luna_big;
            case 10:
                return R$drawable.icon_yeelight_device_badge_eos_big;
            case 11:
                return R$drawable.icon_yeelight_device_badge_cycle_big;
            case 12:
            case 15:
                return R$drawable.icon_yeelight_device_badge_nox_pro_big;
            case 13:
                return R$drawable.icon_yeelight_device_badge_nox_big;
            case 14:
                return R$drawable.icon_yeelight_device_badge_nox_plus_big;
            default:
                return R$drawable.icon_yeelight_device_badge_luna_big;
        }
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11563s();
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
            mo31477F1().sendCmd(CeilingService.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11554j(z));
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
            CeilingService j2 = mo31477F1();
            CeilingService.CmdKey cmdKey = CeilingService.CmdKey.nighttime;
            j2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C11559o(str, str2, i));
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
            mo31477F1().sendCmd(CeilingService.CmdKey.cfg_init_power, String.valueOf(i), new C11556l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(CeilingService.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11548d(z));
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
        return mo42330l2(this.f21228A, this.f21229B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21230z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21227C, "Invalid handler!");
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
            mo31477F1().sendCmd(CeilingService.CmdKey.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11560p(this));
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
            mo31477F1().setPower(CeilingService.Power.off, new C11566v());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11550f());
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
            mo31477F1().sendCmd(CeilingService.CmdKey.nighttime, z ? "enable" : "disable", new C11557m(z));
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
            mo31477F1().sendCmd(CeilingService.CmdKey.pseudo_beacon, "4097|" + i, new C11562r(this));
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
            CeilingService j2 = mo31477F1();
            CeilingService.CmdKey cmdKey = CeilingService.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            j2.sendCmd(cmdKey, sb2.toString(), new C11558n(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public CeilingService mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeilingDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(CeilingService.Power.on, new C11564t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42330l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof CeilingService.C6925s0)) {
            AppUtils.m8300u(f21227C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (CeilingService.C6925s0) obj2);
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
            mo31477F1().openWithMode(CeilingService.Power.on, CeilingService.Effect.smooth, 500L, Long.valueOf((long) i), new C11561q(i));
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
            mo31477F1().setBright(Long.valueOf(j), CeilingService.Effect.smooth, 500L, new C11568x(j));
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
            mo31477F1().setCt(Long.valueOf((long) i), CeilingService.Effect.smooth, 500L, new C11569y(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11547c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11549e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21230z);
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
                AppUtils.m8300u("BATCH_RPC", "CeilingDevice, Invalid length of batch rpc result: " + str2);
            }
            m29364k2(CeilingService.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), jSONArray.getString(4), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)));
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
                mo31477F1().getProperties(new C11555k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11570z(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11544a0(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11546b0(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11543a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C11545b(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f21227C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("NLBright").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty("MiBandSleep").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName()};
    }
}
