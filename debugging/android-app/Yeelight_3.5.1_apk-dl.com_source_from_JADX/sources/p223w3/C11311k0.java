package p223w3;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.LampService;
import com.yeelight.yeelib.device.xiaomi.YeelightLampDevice;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import p219v3.C10543a;
import p232y3.C12041e;
import p232y3.C12046i;
import p232y3.C12047j;

/* renamed from: w3.k0 */
public class C11311k0 extends WifiDeviceBase implements C10543a {

    /* renamed from: C */
    public static final String f20883C = "k0";

    /* renamed from: A */
    CompletionHandler f20884A = new C11319h(this);

    /* renamed from: B */
    LampService.C7693w0 f20885B = new C11320i();

    /* renamed from: z */
    CompletionHandler f20886z = new C11318g(this);

    /* renamed from: w3.k0$a */
    class C11312a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20887a;

        C11312a(C8327s sVar) {
            this.f20887a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31557P0(this.f20887a);
        }
    }

    /* renamed from: w3.k0$b */
    class C11313b implements CompletionHandler {
        C11313b(C11311k0 k0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k0$c */
    class C11314c implements CompletionHandler {
        C11314c() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.k0$d */
    class C11315d implements CompletionHandler {
        C11315d(C11311k0 k0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k0$e */
    class C11316e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20890a;

        C11316e(boolean z) {
            this.f20890a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31555O0(this.f20890a);
        }
    }

    /* renamed from: w3.k0$f */
    class C11317f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20892a;

        C11317f(int i) {
            this.f20892a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31551M0(true);
            C11311k0 k0Var = C11311k0.this;
            k0Var.mo23165w1(k0Var.mo23247j1(this.f20892a));
        }
    }

    /* renamed from: w3.k0$g */
    class C11318g implements CompletionHandler {
        C11318g(C11311k0 k0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k0$h */
    class C11319h implements CompletionHandler {
        C11319h(C11311k0 k0Var) {
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

    /* renamed from: w3.k0$i */
    class C11320i implements LampService.C7693w0 {
        C11320i() {
        }

        /* renamed from: a */
        public void mo34211a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11311k0.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo34212b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11311k0.this.mo23221d0().mo31611r(2) == null) {
                C11311k0.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11311k0.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo34213c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11311k0.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo34214d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11311k0.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo34215e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11311k0.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo34216f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l.intValue());
            C11311k0.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo34217g(LampService.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11329r.f20906a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11311k0.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11311k0.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: h */
        public void mo34218h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l.intValue());
            C11311k0.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo34219i(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onKidModeChanged: ");
            sb.append(l);
            C11311k0.this.mo23221d0().mo31620v0(l.longValue() == 1);
        }

        /* renamed from: j */
        public void mo34220j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPdoBreakTimeChanged: ");
            sb.append(l.intValue());
            if (C11311k0.this.mo23221d0().mo31611r(11) != null) {
                ((C12046i) C11311k0.this.mo23221d0().mo31611r(11)).mo42727f(l.intValue());
                C11311k0.this.mo23221d0().mo31575Y0();
            }
        }

        /* renamed from: k */
        public void mo34221k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPdoWorkTimeChanged: ");
            sb.append(l.intValue());
            if (C11311k0.this.mo23221d0().mo31611r(11) != null) {
                ((C12046i) C11311k0.this.mo23221d0().mo31611r(11)).mo42731j(l.intValue());
                C11311k0.this.mo23221d0().mo31575Y0();
            }
        }

        /* renamed from: l */
        public void mo34222l(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPdoStatusChanged: ");
            sb.append(l.intValue());
            C11311k0.this.mo42208g();
            boolean z = true;
            if (C11311k0.this.mo23221d0().mo31611r(11) == null) {
                DeviceStatusBase d0 = C11311k0.this.mo23221d0();
                if (l.longValue() != 1) {
                    z = false;
                }
                d0.mo31579b(11, new C12046i(z, 45, 15));
            } else {
                C12046i iVar = (C12046i) C11311k0.this.mo23221d0().mo31611r(11);
                if (l.longValue() != 1) {
                    z = false;
                }
                iVar.mo42728g(z);
            }
            C11311k0.this.mo23221d0().mo31575Y0();
        }
    }

    /* renamed from: w3.k0$j */
    class C11321j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f20895a;

        C11321j(String str) {
            this.f20895a = str;
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.sendPomodoroCmd --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            if (Integer.valueOf(this.f20895a.split("\\|")[0]).intValue() == 0 && C11311k0.this.mo23221d0().mo31611r(11) != null) {
                ((C12046i) C11311k0.this.mo23221d0().mo31611r(11)).mo42728g(false);
                ((C12046i) C11311k0.this.mo23221d0().mo31611r(11)).mo42730i(0);
                ((C12046i) C11311k0.this.mo23221d0().mo31611r(11)).mo42729h(0);
                C11311k0.this.mo23221d0().mo31575Y0();
            }
        }
    }

    /* renamed from: w3.k0$k */
    class C11322k implements LampService.C7683r0 {
        C11322k() {
        }

        /* renamed from: a */
        public void mo34201a(LampService.Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, Long l8, Long l9, Long l10, String str2, Long l11) {
            StringBuilder sb = new StringBuilder();
            sb.append("bright: ");
            sb.append(l);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ct: ");
            sb2.append(l2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("pdoBreakTime: ");
            sb3.append(l5);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("pdoStatus: ");
            sb4.append(l3);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            sb5.append(l6);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("pdoWorkTime: ");
            sb6.append(l4);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("power: ");
            sb7.append(power != null ? power.name() : "null");
            StringBuilder sb8 = new StringBuilder();
            sb8.append("kidMode: ");
            Long l12 = l7;
            sb8.append(l12);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("shortkey action: ");
            Long l13 = l10;
            sb9.append(l13);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("shortkey scene name: ");
            String str3 = str2;
            sb10.append(str3);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("flowing : ");
            sb11.append(l11);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("onFromPower: ");
            sb12.append(l9);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("saveState: ");
            sb13.append(l8);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("flowParams: ");
            sb14.append(str);
            C11311k0.this.m28745a2(power, l, l2, l3, l4, l5, l6, l12, str, l8, l9, l13, str3, l11);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.k0$l */
    class C11323l implements LampService.C7665i0 {
        C11323l() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.getData --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("MangoDevice.getData, response: ");
            sb.append(str);
            String[] split = str.split("\\|");
            boolean z = false;
            int intValue = Integer.valueOf(split[0]).intValue();
            int intValue2 = Integer.valueOf(split[1]).intValue();
            int i = intValue2 / 1000;
            int i2 = intValue2 % 1000;
            int intValue3 = Integer.valueOf(split[2]).intValue();
            int i3 = intValue3 / 10000;
            int i4 = intValue3 % 10000;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MangoDevice.getData, enabled: ");
            sb2.append(intValue);
            sb2.append(", worktime : ");
            sb2.append(i);
            sb2.append(", resttime : ");
            sb2.append(i2);
            sb2.append(", workremain : ");
            sb2.append(i3);
            sb2.append(", restRemain : ");
            sb2.append(i4);
            if (C11311k0.this.mo23221d0().mo31611r(11) != null) {
                C12046i iVar = (C12046i) C11311k0.this.mo23221d0().mo31611r(11);
                if (intValue == 1) {
                    z = true;
                }
                iVar.mo42728g(z);
                ((C12046i) C11311k0.this.mo23221d0().mo31611r(11)).mo42731j(i);
                ((C12046i) C11311k0.this.mo23221d0().mo31611r(11)).mo42727f(i2);
                ((C12046i) C11311k0.this.mo23221d0().mo31611r(11)).mo42730i(i3);
                ((C12046i) C11311k0.this.mo23221d0().mo31611r(11)).mo42729h(i4);
                C11311k0.this.mo23221d0().mo31575Y0();
            }
        }
    }

    /* renamed from: w3.k0$m */
    class C11324m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20899a;

        C11324m(boolean z) {
            this.f20899a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31620v0(this.f20899a);
        }
    }

    /* renamed from: w3.k0$n */
    class C11325n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20901a;

        C11325n(boolean z) {
            this.f20901a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31583d(this.f20901a);
        }
    }

    /* renamed from: w3.k0$o */
    class C11326o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20903a;

        C11326o(int i) {
            this.f20903a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31547K0(this.f20903a);
        }
    }

    /* renamed from: w3.k0$p */
    class C11327p implements CompletionHandler {
        C11327p(C11311k0 k0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("setShortKeyCmd --> onFailed, i = ");
            sb.append(i);
            sb.append(" , s = ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.k0$q */
    class C11328q implements WifiDeviceBase.C6080i {
        C11328q() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11311k0.this.f20885B.mo34211a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11311k0.this.f20885B.mo34218h(l);
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
            C11311k0.this.f20885B.mo34217g(LampService.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.k0$r */
    static /* synthetic */ class C11329r {

        /* renamed from: a */
        static final /* synthetic */ int[] f20906a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.LampService$Power[] r0 = com.yeelight.yeelib.device.xiaomi.LampService.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20906a = r0
                com.yeelight.yeelib.device.xiaomi.LampService$Power r1 = com.yeelight.yeelib.device.xiaomi.LampService.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20906a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.LampService$Power r1 = com.yeelight.yeelib.device.xiaomi.LampService.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11311k0.C11329r.<clinit>():void");
        }
    }

    /* renamed from: w3.k0$s */
    class C11330s implements CompletionHandler {
        C11330s() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.open --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.k0$t */
    class C11331t implements CompletionHandler {
        C11331t() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.k0$u */
    class C11332u implements CompletionHandler {
        C11332u() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.k0$v */
    class C11333v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20910a;

        C11333v(long j) {
            this.f20910a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31600l0(this.f20910a);
        }
    }

    /* renamed from: w3.k0$w */
    class C11334w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20912a;

        C11334w(int i) {
            this.f20912a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31610q0(this.f20912a);
        }
    }

    /* renamed from: w3.k0$x */
    class C11335x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20914a;

        C11335x(C8327s sVar) {
            this.f20914a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31557P0(this.f20914a);
        }
    }

    /* renamed from: w3.k0$y */
    class C11336y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20916a;

        C11336y(C8327s sVar) {
            this.f20916a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31557P0(this.f20916a);
        }
    }

    /* renamed from: w3.k0$z */
    class C11337z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20918a;

        C11337z(C8327s sVar) {
            this.f20918a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11311k0.this.mo23221d0().mo31557P0(this.f20918a);
        }
    }

    public C11311k0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public void m28745a2(LampService.Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, Long l8, Long l9, Long l10, String str2, Long l11) {
        String str3;
        int i;
        LampService.Power power2 = power;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == LampService.Power.on);
        }
        if (l != null) {
            mo23221d0().mo31600l0(l.longValue());
        }
        if (l2 != null) {
            mo23221d0().mo31610q0(l2.intValue());
        }
        if (l9 != null) {
            mo23221d0().mo31547K0(l9.intValue());
        }
        if (l6 != null) {
            if (mo23221d0().mo31611r(2) == null) {
                mo23221d0().mo31577a(new C12041e(l6.intValue(), l6.intValue()));
            } else {
                mo23221d0().mo31573X0(l6.intValue());
            }
        }
        boolean z2 = l3 != null && l3.longValue() == 1;
        int i2 = 45;
        int intValue = l4 != null ? l4.intValue() : 45;
        int i3 = 15;
        int intValue2 = l5 != null ? l5.intValue() : 15;
        if (mo23221d0().mo31611r(11) == null) {
            DeviceStatusBase d0 = mo23221d0();
            if (intValue != 0) {
                i2 = intValue;
            }
            if (intValue2 != 0) {
                i3 = intValue2;
            }
            d0.mo31579b(11, new C12046i(z2, i2, i3));
        } else {
            ((C12046i) mo23221d0().mo31611r(11)).mo42728g(z2);
            ((C12046i) mo23221d0().mo31611r(11)).mo42731j(intValue);
            ((C12046i) mo23221d0().mo31611r(11)).mo42727f(intValue2);
            mo23221d0().mo31575Y0();
        }
        mo23221d0().mo31620v0(l7 != null && l7.longValue() == 1);
        if (mo23221d0().mo31611r(19) == null) {
            DeviceStatusBase d02 = mo23221d0();
            if (l10 != null) {
                i = l10.intValue();
                str3 = str2;
            } else {
                str3 = str2;
                i = 0;
            }
            d02.mo31579b(19, new C12047j(i, str3));
        }
        mo23221d0().mo31555O0(l8 != null && l8.longValue() == 1);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        DeviceStatusBase d03 = mo23221d0();
        if (l11.longValue() == 0) {
            z = false;
        }
        d03.mo31618u0(z);
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11332u());
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
        return R$drawable.icon_yeelight_device_badge_mango_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_mango_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11328q();
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
            mo31477F1().sendCmd(LampService.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11325n(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: O1 */
    public boolean mo31486O1(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("setKidMode --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(LampService.CmdKey.cfg_kidmode, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11324m(z));
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
            mo31477F1().sendCmd(LampService.CmdKey.cfg_init_power, String.valueOf(i), new C11326o(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(LampService.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11316e(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: T1 */
    public boolean mo31491T1(int i, int i2, int i3, String str) {
        String str2;
        int b;
        StringBuilder sb = new StringBuilder();
        sb.append("setShortKeyCmd --> Invoke, action : ");
        sb.append(i);
        if (i == 0) {
            str2 = TimerCodec.DISENABLE;
        } else if (i == 1) {
            int i4 = 15;
            if (mo23221d0().mo31611r(2) != null && (b = ((C12041e) mo23221d0().mo31611r(2)).mo42678b()) > 0) {
                i4 = b;
            }
            str2 = String.format("1|%03d", new Object[]{Integer.valueOf(i4)});
        } else if (i != 2) {
            str2 = "";
        } else {
            str2 = String.format("2|%03d|%03d|%s", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2), str});
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" param : ");
        sb2.append(str2);
        try {
            mo31477F1().sendCmd(LampService.CmdKey.cfg_shortkey, str2, new C11327p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42312c2(this.f20884A, this.f20885B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20886z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20883C, "Invalid handler!");
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
    public LampService mo31477F1() {
        return ((YeelightLampDevice) this.f4749n).mDeviceService;
    }

    /* renamed from: Z1 */
    public boolean mo42310Z1(LampService.CmdKey cmdKey, String str) {
        try {
            mo31477F1().getData(cmdKey, str, new C11323l());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo42206a(int i, int i2) {
        return mo42311b2(LampService.CmdKey.cfg_pomodoro, String.format("01|%03d%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        if (super.mo23140b1()) {
            return true;
        }
        try {
            mo31477F1().setPower(LampService.Power.off, new C11331t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: b2 */
    public boolean mo42311b2(LampService.CmdKey cmdKey, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("MangoDevice.sendPomodoroCmd --> Invoke, cmd: ");
        sb.append(cmdKey.name());
        sb.append(", param: ");
        sb.append(str);
        try {
            mo31477F1().sendCmd(cmdKey, str, new C11321j(str));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo42207c() {
        return mo42311b2(LampService.CmdKey.cfg_pomodoro, "00");
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11314c());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: c2 */
    public boolean mo42312c2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof LampService.C7693w0)) {
            AppUtils.m8300u(f20883C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (LampService.C7693w0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: g */
    public boolean mo42208g() {
        return mo42310Z1(LampService.CmdKey.cfg_pomodoro, "00");
    }

    /* renamed from: h */
    public boolean mo42209h(int i, int i2) {
        return mo42311b2(LampService.CmdKey.cfg_pomodoro, String.format("02|%03d%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(LampService.Power.on, new C11330s());
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
            mo31477F1().openWithMode(LampService.Power.on, LampService.Effect.smooth, 500L, Long.valueOf((long) i), new C11317f(i));
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
            mo31477F1().setBright(Long.valueOf(j), LampService.Effect.smooth, 500L, new C11333v(j));
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
            mo31477F1().setCt(Long.valueOf((long) i), LampService.Effect.smooth, 500L, new C11334w(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11315d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11313b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20886z);
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
                AppUtils.m8300u("BATCH_RPC", "MangoDevice, Invalid length of batch rpc result: " + str2);
            }
            m28745a2(LampService.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), jSONArray.getString(12), Long.valueOf(jSONArray.getLong(13)));
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
                mo31477F1().getProperties(new C11322k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11335x(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11336y(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11337z(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11312a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f20883C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("PdoStatus").getInternalName(), mo31477F1().getService().getProperty("PdoWorkTime").getInternalName(), mo31477F1().getService().getProperty("PdoBreakTime").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("KidMode").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("ShortKeyAction").getInternalName(), mo31477F1().getService().getProperty("ShortKeySceneName").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName()};
    }
}
