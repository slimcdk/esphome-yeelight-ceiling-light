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
import com.yeelight.yeelib.device.xiaomi.YilaiCeilingDevice;
import com.yeelight.yeelib.device.xiaomi.YilaiCeilingService;
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

/* renamed from: w3.m1 */
public class C11452m1 extends C10333b {

    /* renamed from: C */
    public static final String f21090C = "m1";

    /* renamed from: A */
    CompletionHandler f21091A = new C11460g(this);

    /* renamed from: B */
    YilaiCeilingService.C8233p0 f21092B = new C11461h();

    /* renamed from: z */
    CompletionHandler f21093z = new C11459f(this);

    /* renamed from: w3.m1$a */
    class C11453a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21094a;

        C11453a(C8327s sVar) {
            this.f21094a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31557P0(this.f21094a);
        }
    }

    /* renamed from: w3.m1$a0 */
    class C11454a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21096a;

        C11454a0(C8327s sVar) {
            this.f21096a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31557P0(this.f21096a);
        }
    }

    /* renamed from: w3.m1$b */
    class C11455b implements CompletionHandler {
        C11455b(C11452m1 m1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.m1$c */
    class C11456c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21098a;

        C11456c(boolean z) {
            this.f21098a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31555O0(this.f21098a);
        }
    }

    /* renamed from: w3.m1$d */
    class C11457d implements CompletionHandler {
        C11457d(C11452m1 m1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.m1$e */
    class C11458e implements CompletionHandler {
        C11458e() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.m1$f */
    class C11459f implements CompletionHandler {
        C11459f(C11452m1 m1Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.m1$g */
    class C11460g implements CompletionHandler {
        C11460g(C11452m1 m1Var) {
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

    /* renamed from: w3.m1$h */
    class C11461h implements YilaiCeilingService.C8233p0 {
        C11461h() {
        }

        /* renamed from: a */
        public void mo35131a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11452m1.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo35132b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11452m1.this.mo23221d0().mo31611r(2) == null) {
                C11452m1.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11452m1.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo35133c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11452m1.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo35134d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11452m1.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo35135e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11452m1.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo35136f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11452m1.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo35137g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11452m1.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo35138h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C11452m1.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo35139i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C11452m1.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C11452m1.this.mo23221d0().mo31543I0(true);
                }
                C11452m1.this.mo23221d0().mo31541H0(split[1]);
                C11452m1.this.mo23221d0().mo31539G0(split[2]);
                C11452m1.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C11452m1.f21090C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C11452m1.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C11452m1.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C11452m1.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo35140j(YilaiCeilingService.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11472s.f21121a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11452m1.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11452m1.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: m */
        public void mo35141m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("c: ");
            sb.append(l);
            C11452m1.this.mo23221d0().mo31591h(l.longValue() == 1);
        }
    }

    /* renamed from: w3.m1$i */
    class C11462i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21102a;

        C11462i(boolean z) {
            this.f21102a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31583d(this.f21102a);
        }
    }

    /* renamed from: w3.m1$j */
    class C11463j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21104a;

        C11463j(int i) {
            this.f21104a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31547K0(this.f21104a);
        }
    }

    /* renamed from: w3.m1$k */
    class C11464k implements YilaiCeilingService.C8227m0 {
        C11464k() {
        }

        /* renamed from: a */
        public void mo35125a(YilaiCeilingService.Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, String str2, Long l8) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power != null ? power.name() : "null");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            sb2.append(l);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ct: ");
            Long l9 = l2;
            sb3.append(l9);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("lanMode: ");
            Long l10 = l5;
            sb4.append(l10);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("saveState: ");
            Long l11 = l4;
            sb5.append(l11);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("delayoff: ");
            Long l12 = l3;
            sb6.append(l12);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowParams: ");
            String str3 = str;
            sb7.append(str3);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("nightTimeInfo : ");
            String str4 = str2;
            sb8.append(str4);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("miBandSleep : ");
            Long l13 = l8;
            sb9.append(l13);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("flowing : ");
            Long l14 = l7;
            sb10.append(l14);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("onFromPower : ");
            Long l15 = l6;
            sb11.append(l15);
            C11452m1.this.m29114k2(power, l, l9, l12, str3, l10, l11, l15, str4, l13, l14);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.m1$l */
    class C11465l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21107a;

        C11465l(boolean z) {
            this.f21107a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31543I0(this.f21107a);
        }
    }

    /* renamed from: w3.m1$m */
    class C11466m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21109a;

        /* renamed from: b */
        final /* synthetic */ String f21110b;

        /* renamed from: c */
        final /* synthetic */ String f21111c;

        /* renamed from: d */
        final /* synthetic */ int f21112d;

        C11466m(boolean z, String str, String str2, int i) {
            this.f21109a = z;
            this.f21110b = str;
            this.f21111c = str2;
            this.f21112d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31543I0(this.f21109a);
            C11452m1.this.mo23221d0().mo31541H0(this.f21110b);
            C11452m1.this.mo23221d0().mo31539G0(this.f21111c);
            C11452m1.this.mo23221d0().mo31537F0(this.f21112d);
        }
    }

    /* renamed from: w3.m1$n */
    class C11467n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f21114a;

        /* renamed from: b */
        final /* synthetic */ String f21115b;

        /* renamed from: c */
        final /* synthetic */ int f21116c;

        C11467n(String str, String str2, int i) {
            this.f21114a = str;
            this.f21115b = str2;
            this.f21116c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31541H0(this.f21114a);
            C11452m1.this.mo23221d0().mo31539G0(this.f21115b);
            C11452m1.this.mo23221d0().mo31537F0(this.f21116c);
        }
    }

    /* renamed from: w3.m1$o */
    class C11468o implements CompletionHandler {
        C11468o(C11452m1 m1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.m1$p */
    class C11469p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21118a;

        C11469p(int i) {
            this.f21118a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31551M0(true);
            C11452m1 m1Var = C11452m1.this;
            m1Var.mo23165w1(m1Var.mo23247j1(this.f21118a));
        }
    }

    /* renamed from: w3.m1$q */
    class C11470q implements CompletionHandler {
        C11470q(C11452m1 m1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.m1$r */
    class C11471r implements WifiDeviceBase.C6080i {
        C11471r() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11452m1.this.f21092B.mo35131a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11452m1.this.f21092B.mo35138h(l);
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
            C11452m1.this.f21092B.mo35140j(YilaiCeilingService.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.m1$s */
    static /* synthetic */ class C11472s {

        /* renamed from: a */
        static final /* synthetic */ int[] f21121a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$Power[] r0 = com.yeelight.yeelib.device.xiaomi.YilaiCeilingService.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21121a = r0
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$Power r1 = com.yeelight.yeelib.device.xiaomi.YilaiCeilingService.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21121a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$Power r1 = com.yeelight.yeelib.device.xiaomi.YilaiCeilingService.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11452m1.C11472s.<clinit>():void");
        }
    }

    /* renamed from: w3.m1$t */
    class C11473t implements CompletionHandler {
        C11473t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.m1$u */
    class C11474u implements CompletionHandler {
        C11474u() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.m1$v */
    class C11475v implements CompletionHandler {
        C11475v() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.m1$w */
    class C11476w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21125a;

        C11476w(long j) {
            this.f21125a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31600l0(this.f21125a);
        }
    }

    /* renamed from: w3.m1$x */
    class C11477x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21127a;

        C11477x(int i) {
            this.f21127a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31610q0(this.f21127a);
        }
    }

    /* renamed from: w3.m1$y */
    class C11478y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21129a;

        C11478y(C8327s sVar) {
            this.f21129a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31557P0(this.f21129a);
        }
    }

    /* renamed from: w3.m1$z */
    class C11479z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21131a;

        C11479z(C8327s sVar) {
            this.f21131a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11452m1.this.mo23221d0().mo31557P0(this.f21131a);
        }
    }

    public C11452m1(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m29114k2(YilaiCeilingService.Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, String str2, Long l7, Long l8) {
        boolean z = true;
        if (power != null) {
            mo23221d0().mo31551M0(power == YilaiCeilingService.Power.on);
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
        mo23221d0().mo31591h(l7 != null && l7.longValue() == 1);
        mo23221d0().mo31555O0(l5 != null && l5.longValue() == 1);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        DeviceStatusBase d0 = mo23221d0();
        if (l8.longValue() == 0) {
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
            mo31477F1().toggle(new C11475v());
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
            return R$drawable.icon_yeelight_device_badge_kaiyue_480_small;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -888668266:
                if (T.equals("yilai.light.ceiling1")) {
                    c = 0;
                    break;
                }
                break;
            case -888668265:
                if (T.equals("yilai.light.ceiling2")) {
                    c = 1;
                    break;
                }
                break;
            case -888668264:
                if (T.equals("yilai.light.ceiling3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_kaiyue_480_small;
            case 1:
                return R$drawable.icon_yeelight_device_badge_hefeng_430_small;
            case 2:
                return R$drawable.icon_yeelight_device_badge_hefeng_pro_small;
            default:
                return R$drawable.icon_yeelight_device_badge_kaiyue_480_small;
        }
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_kaiyue_480_big;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -888668266:
                if (T.equals("yilai.light.ceiling1")) {
                    c = 0;
                    break;
                }
                break;
            case -888668265:
                if (T.equals("yilai.light.ceiling2")) {
                    c = 1;
                    break;
                }
                break;
            case -888668264:
                if (T.equals("yilai.light.ceiling3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_kaiyue_480_big;
            case 1:
                return R$drawable.icon_yeelight_device_badge_hefeng_430_big;
            case 2:
                return R$drawable.icon_yeelight_device_badge_hefeng_pro_big;
            default:
                return R$drawable.icon_yeelight_device_badge_kaiyue_480_big;
        }
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11471r();
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
            mo31477F1().sendCmd(YilaiCeilingService.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11462i(z));
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
            YilaiCeilingService j2 = mo31477F1();
            YilaiCeilingService.CmdKey cmdKey = YilaiCeilingService.CmdKey.nighttime;
            j2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C11467n(str, str2, i));
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
            mo31477F1().sendCmd(YilaiCeilingService.CmdKey.cfg_init_power, String.valueOf(i), new C11463j(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(YilaiCeilingService.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11456c(z));
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
        return mo42324l2(this.f21091A, this.f21092B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21093z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21090C, "Invalid handler!");
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
            mo31477F1().sendCmd(YilaiCeilingService.CmdKey.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11468o(this));
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
            mo31477F1().setPower(YilaiCeilingService.Power.off, new C11474u());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11458e());
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
            mo31477F1().sendCmd(YilaiCeilingService.CmdKey.nighttime, z ? "enable" : "disable", new C11465l(z));
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
            mo31477F1().sendCmd(YilaiCeilingService.CmdKey.pseudo_beacon, "4097|" + i, new C11470q(this));
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
            YilaiCeilingService j2 = mo31477F1();
            YilaiCeilingService.CmdKey cmdKey = YilaiCeilingService.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            j2.sendCmd(cmdKey, sb2.toString(), new C11466m(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public YilaiCeilingService mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YilaiCeilingDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(YilaiCeilingService.Power.on, new C11473t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42324l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof YilaiCeilingService.C8233p0)) {
            AppUtils.m8300u(f21090C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (YilaiCeilingService.C8233p0) obj2);
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
            mo31477F1().openWithMode(YilaiCeilingService.Power.on, YilaiCeilingService.Effect.smooth, 500L, Long.valueOf((long) i), new C11469p(i));
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
            mo31477F1().setBright(Long.valueOf(j), YilaiCeilingService.Effect.smooth, 500L, new C11476w(j));
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
            mo31477F1().setCt(Long.valueOf((long) i), YilaiCeilingService.Effect.smooth, 500L, new C11477x(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11455b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11457d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21093z);
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
                AppUtils.m8300u("BATCH_RPC", "CeilingDevice, Invalid length of batch rpc result: " + str);
            }
            m29114k2(YilaiCeilingService.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), jSONArray.getString(4), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)));
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
                mo31477F1().getProperties(new C11464k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11478y(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11479z(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11454a0(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11453a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f21090C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty("MiBandSleep").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName()};
    }
}