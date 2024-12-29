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
import com.yeelight.yeelib.device.xiaomi.Ceiling2Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling2Device;
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

/* renamed from: w3.j */
public class C11195j extends C10333b {

    /* renamed from: C */
    public static final String f20707C = "j";

    /* renamed from: A */
    CompletionHandler f20708A = new C11203g(this);

    /* renamed from: B */
    Ceiling2Service.C6618p0 f20709B = new C11204h();

    /* renamed from: z */
    CompletionHandler f20710z = new C11202f(this);

    /* renamed from: w3.j$a */
    class C11196a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20711a;

        C11196a(C8327s sVar) {
            this.f20711a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31557P0(this.f20711a);
        }
    }

    /* renamed from: w3.j$a0 */
    class C11197a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20713a;

        C11197a0(C8327s sVar) {
            this.f20713a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31557P0(this.f20713a);
        }
    }

    /* renamed from: w3.j$b */
    class C11198b implements CompletionHandler {
        C11198b(C11195j jVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.j$c */
    class C11199c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20715a;

        C11199c(boolean z) {
            this.f20715a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31555O0(this.f20715a);
        }
    }

    /* renamed from: w3.j$d */
    class C11200d implements CompletionHandler {
        C11200d(C11195j jVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.j$e */
    class C11201e implements CompletionHandler {
        C11201e() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.j$f */
    class C11202f implements CompletionHandler {
        C11202f(C11195j jVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.j$g */
    class C11203g implements CompletionHandler {
        C11203g(C11195j jVar) {
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

    /* renamed from: w3.j$h */
    class C11204h implements Ceiling2Service.C6618p0 {
        C11204h() {
        }

        /* renamed from: a */
        public void mo32583a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11195j.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo32584b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11195j.this.mo23221d0().mo31611r(2) == null) {
                C11195j.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11195j.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo32585c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11195j.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo32586d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11195j.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo32587e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11195j.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo32588f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11195j.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo32589g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11195j.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo32590h(Ceiling2Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11215s.f20738a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11195j.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11195j.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: i */
        public void mo32591i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C11195j.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C11195j.this.mo23221d0().mo31543I0(true);
                }
                C11195j.this.mo23221d0().mo31541H0(split[1]);
                C11195j.this.mo23221d0().mo31539G0(split[2]);
                C11195j.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C11195j.f20707C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C11195j.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C11195j.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C11195j.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: k */
        public void mo32592k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNLBrightChanged: ");
            sb.append(l);
            if (l.longValue() != 0) {
                C11195j.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
                C11195j.this.mo23221d0().mo31545J0(l.longValue());
                return;
            }
            C11195j.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo32593m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onMiBandSleepChanged: ");
            sb.append(l);
            C11195j.this.mo23221d0().mo31591h(l.longValue() == 1);
        }
    }

    /* renamed from: w3.j$i */
    class C11205i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20719a;

        C11205i(boolean z) {
            this.f20719a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31583d(this.f20719a);
        }
    }

    /* renamed from: w3.j$j */
    class C11206j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20721a;

        C11206j(int i) {
            this.f20721a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31547K0(this.f20721a);
        }
    }

    /* renamed from: w3.j$k */
    class C11207k implements Ceiling2Service.C6612m0 {
        C11207k() {
        }

        /* renamed from: a */
        public void mo32577a(Ceiling2Service.Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, String str2, Long l7, Long l8) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power != null ? power.name() : "null");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            sb2.append(l);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lanMode: ");
            Long l9 = l3;
            sb3.append(l9);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("saveState: ");
            Long l10 = l4;
            sb4.append(l10);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            Long l11 = l2;
            sb5.append(l11);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowParams: ");
            String str3 = str;
            sb6.append(str3);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("nLBright: ");
            Long l12 = l6;
            sb7.append(l12);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("nightTimeInfo : ");
            String str4 = str2;
            sb8.append(str4);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("miBandSleep : ");
            Long l13 = l7;
            sb9.append(l13);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("flowing : ");
            Long l14 = l8;
            sb10.append(l14);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("onFromPower : ");
            Long l15 = l5;
            sb11.append(l15);
            C11195j.this.m28509k2(power, l, l11, str3, l9, l10, l15, l12, str4, l13, l14);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.j$l */
    class C11208l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20724a;

        C11208l(boolean z) {
            this.f20724a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31543I0(this.f20724a);
        }
    }

    /* renamed from: w3.j$m */
    class C11209m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20726a;

        /* renamed from: b */
        final /* synthetic */ String f20727b;

        /* renamed from: c */
        final /* synthetic */ String f20728c;

        /* renamed from: d */
        final /* synthetic */ int f20729d;

        C11209m(boolean z, String str, String str2, int i) {
            this.f20726a = z;
            this.f20727b = str;
            this.f20728c = str2;
            this.f20729d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31543I0(this.f20726a);
            C11195j.this.mo23221d0().mo31541H0(this.f20727b);
            C11195j.this.mo23221d0().mo31539G0(this.f20728c);
            C11195j.this.mo23221d0().mo31537F0(this.f20729d);
        }
    }

    /* renamed from: w3.j$n */
    class C11210n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f20731a;

        /* renamed from: b */
        final /* synthetic */ String f20732b;

        /* renamed from: c */
        final /* synthetic */ int f20733c;

        C11210n(String str, String str2, int i) {
            this.f20731a = str;
            this.f20732b = str2;
            this.f20733c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31541H0(this.f20731a);
            C11195j.this.mo23221d0().mo31539G0(this.f20732b);
            C11195j.this.mo23221d0().mo31537F0(this.f20733c);
        }
    }

    /* renamed from: w3.j$o */
    class C11211o implements CompletionHandler {
        C11211o(C11195j jVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.j$p */
    class C11212p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20735a;

        C11212p(int i) {
            this.f20735a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31551M0(true);
            C11195j jVar = C11195j.this;
            jVar.mo23165w1(jVar.mo23247j1(this.f20735a));
        }
    }

    /* renamed from: w3.j$q */
    class C11213q implements CompletionHandler {
        C11213q(C11195j jVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.j$r */
    class C11214r implements WifiDeviceBase.C6080i {
        C11214r() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11195j.this.f20709B.mo32583a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
            C11195j.this.f20709B.mo32592k(l);
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C11195j.this.f20709B.mo32590h(Ceiling2Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.j$s */
    static /* synthetic */ class C11215s {

        /* renamed from: a */
        static final /* synthetic */ int[] f20738a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling2Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20738a = r0
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling2Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20738a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling2Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11195j.C11215s.<clinit>():void");
        }
    }

    /* renamed from: w3.j$t */
    class C11216t implements CompletionHandler {
        C11216t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.j$u */
    class C11217u implements CompletionHandler {
        C11217u() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.j$v */
    class C11218v implements CompletionHandler {
        C11218v() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.j$w */
    class C11219w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20742a;

        C11219w(long j) {
            this.f20742a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31600l0(this.f20742a);
        }
    }

    /* renamed from: w3.j$x */
    class C11220x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20744a;

        C11220x(C8327s sVar) {
            this.f20744a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31557P0(this.f20744a);
        }
    }

    /* renamed from: w3.j$y */
    class C11221y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20746a;

        C11221y(C8327s sVar) {
            this.f20746a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31557P0(this.f20746a);
        }
    }

    /* renamed from: w3.j$z */
    class C11222z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20748a;

        C11222z(C8327s sVar) {
            this.f20748a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11195j.this.mo23221d0().mo31557P0(this.f20748a);
        }
    }

    public C11195j(String str, String str2, Device.Ownership ownership) {
        super(str, str2, "yeelink.light.ceiling2", ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public void m28509k2(Ceiling2Service.Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, String str2, Long l7, Long l8) {
        Ceiling2Service.Power power2 = power;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == Ceiling2Service.Power.on);
        }
        if (l != null) {
            mo23221d0().mo31600l0(l.longValue());
        }
        if (l2 != null) {
            if (mo23221d0().mo31611r(2) == null) {
                mo23221d0().mo31577a(new C12041e(l2.intValue(), l2.intValue()));
            } else {
                mo23221d0().mo31573X0(l2.intValue());
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
        mo23221d0().mo31583d(l3 != null && l3.longValue() == 1);
        mo23221d0().mo31591h(l7 != null && l7.longValue() == 1);
        mo23221d0().mo31555O0(l4 != null && l4.longValue() == 1);
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
            mo31477F1().toggle(new C11218v());
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
        return R$drawable.icon_yeelight_device_badge_luna_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_luna_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11214r();
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
            mo31477F1().sendCmd(Ceiling2Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11205i(z));
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
            Ceiling2Service j2 = mo31477F1();
            Ceiling2Service.CmdKey cmdKey = Ceiling2Service.CmdKey.nighttime;
            j2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C11210n(str, str2, i));
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
            mo31477F1().sendCmd(Ceiling2Service.CmdKey.cfg_init_power, String.valueOf(i), new C11206j(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Ceiling2Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11199c(z));
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
        return mo42302l2(this.f20708A, this.f20709B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20710z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20707C, "Invalid handler!");
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
            mo31477F1().sendCmd(Ceiling2Service.CmdKey.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11211o(this));
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
            mo31477F1().setPower(Ceiling2Service.Power.off, new C11217u());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11201e());
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
            mo31477F1().sendCmd(Ceiling2Service.CmdKey.nighttime, z ? "enable" : "disable", new C11208l(z));
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
            mo31477F1().sendCmd(Ceiling2Service.CmdKey.pseudo_beacon, "4097|" + i, new C11213q(this));
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
            Ceiling2Service j2 = mo31477F1();
            Ceiling2Service.CmdKey cmdKey = Ceiling2Service.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            j2.sendCmd(cmdKey, sb2.toString(), new C11209m(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Ceiling2Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeiling2Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Ceiling2Service.Power.on, new C11216t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42302l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling2Service.C6618p0)) {
            AppUtils.m8300u(f20707C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Ceiling2Service.C6618p0) obj2);
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
            mo31477F1().openWithMode(Ceiling2Service.Power.on, Ceiling2Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11212p(i));
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
            mo31477F1().setBright(Long.valueOf(j), Ceiling2Service.Effect.smooth, 500L, new C11219w(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        AppUtils.m8300u(f20707C, "should not be here! fix me!");
        return false;
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        AppUtils.m8300u(f20707C, "should not be here! fix me!");
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11198b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11200d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20710z);
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
                AppUtils.m8300u("BATCH_RPC", "Ceiling2Device, Invalid length of batch rpc result: " + str);
            }
            m28509k2(Ceiling2Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), jSONArray.getString(3), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)));
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
                mo31477F1().getProperties(new C11207k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11220x(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11221y(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11222z(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11197a0(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C11196a(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f20707C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("NLBright").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty("MiBandSleep").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName()};
    }
}
