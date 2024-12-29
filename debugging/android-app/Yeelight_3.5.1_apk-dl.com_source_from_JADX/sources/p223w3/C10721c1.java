package p223w3;

import androidx.core.view.ViewCompat;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.Plate2Service;
import com.yeelight.yeelib.device.xiaomi.YeelightPlate2Device;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import p051j4.C3278f;
import p232y3.C12041e;

/* renamed from: w3.c1 */
public class C10721c1 extends WifiDeviceBase {

    /* renamed from: C */
    public static final String f19956C = "c1";

    /* renamed from: A */
    CompletionHandler f19957A = new C10729h(this);

    /* renamed from: B */
    Plate2Service.C7933n0 f19958B = new C10730i();

    /* renamed from: z */
    CompletionHandler f19959z = new C10728g(this);

    /* renamed from: w3.c1$a */
    class C10722a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19960a;

        C10722a(C8327s sVar) {
            this.f19960a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31557P0(this.f19960a);
        }
    }

    /* renamed from: w3.c1$b */
    class C10723b implements CompletionHandler {
        C10723b(C10721c1 c1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.c1$c */
    class C10724c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19962a;

        C10724c(boolean z) {
            this.f19962a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31555O0(this.f19962a);
        }
    }

    /* renamed from: w3.c1$d */
    class C10725d implements CompletionHandler {
        C10725d(C10721c1 c1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.c1$e */
    class C10726e implements CompletionHandler {
        C10726e() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.c1$f */
    class C10727f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19965a;

        C10727f(int i) {
            this.f19965a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31551M0(true);
            C10721c1 c1Var = C10721c1.this;
            c1Var.mo23165w1(c1Var.mo23247j1(this.f19965a));
        }
    }

    /* renamed from: w3.c1$g */
    class C10728g implements CompletionHandler {
        C10728g(C10721c1 c1Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.c1$h */
    class C10729h implements CompletionHandler {
        C10729h(C10721c1 c1Var) {
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

    /* renamed from: w3.c1$i */
    class C10730i implements Plate2Service.C7933n0 {
        C10730i() {
        }

        /* renamed from: a */
        public void mo34577a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C10721c1.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo34578b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDelayOffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C10721c1.this.mo23221d0().mo31611r(2) == null) {
                C10721c1.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C10721c1.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo34579c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C10721c1.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo34580d(Plate2Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerChanged: ");
            sb.append(power.name());
            int i = C10735n.f19974a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C10721c1.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C10721c1.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: f */
        public void mo34581f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C10721c1.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo34582g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C10721c1.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: j */
        public void mo34583j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRgbChanged: ");
            sb.append(l);
            C10721c1.this.mo23221d0().mo31602m0(l.intValue());
        }

        /* renamed from: k */
        public void mo34584k(Long l) {
            C10721c1.this.mo23221d0().mo31608p0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo34585l(Long l) {
            DeviceStatusBase d0;
            DeviceStatusBase.DeviceMode deviceMode;
            StringBuilder sb = new StringBuilder();
            sb.append("onColorModeChanged: ");
            sb.append(l);
            if (l.longValue() == 1) {
                d0 = C10721c1.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C10721c1.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C10721c1.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo31531C0(deviceMode);
        }

        /* renamed from: n */
        public void mo34586n(Long l) {
            C10721c1.this.mo23221d0().mo31606o0((long) l.intValue());
        }
    }

    /* renamed from: w3.c1$j */
    class C10731j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19968a;

        C10731j(boolean z) {
            this.f19968a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31583d(this.f19968a);
        }
    }

    /* renamed from: w3.c1$k */
    class C10732k implements Plate2Service.C7921h0 {
        C10732k() {
        }

        /* renamed from: a */
        public void mo34565a(Plate2Service.Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power.name());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            sb2.append(l);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("temperature: ");
            Long l11 = l2;
            sb3.append(l11);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("mode: ");
            Long l12 = l5;
            sb4.append(l12);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("rgb: ");
            Long l13 = l6;
            sb5.append(l13);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("lanMode: ");
            Long l14 = l9;
            sb6.append(l14);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("hue: ");
            Long l15 = l3;
            sb7.append(l15);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("sat: ");
            Long l16 = l4;
            sb8.append(l16);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("delayoff: ");
            Long l17 = l7;
            sb9.append(l17);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("saveState: ");
            Long l18 = l8;
            sb10.append(l18);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("onFromPower: ");
            Long l19 = l10;
            sb11.append(l19);
            C10721c1.this.m27353Z1(power, l, l11, l15, l16, l12, l13, l17, l18, l14, l19);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.c1$l */
    class C10733l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19971a;

        C10733l(int i) {
            this.f19971a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31547K0(this.f19971a);
        }
    }

    /* renamed from: w3.c1$m */
    class C10734m implements WifiDeviceBase.C6080i {
        C10734m() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C10721c1.this.f19958B.mo34577a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
            C10721c1.this.f19958B.mo34583j(l);
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
            C10721c1.this.f19958B.mo34585l(l);
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C10721c1.this.f19958B.mo34580d(Plate2Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.c1$n */
    static /* synthetic */ class C10735n {

        /* renamed from: a */
        static final /* synthetic */ int[] f19974a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Plate2Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Plate2Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19974a = r0
                com.yeelight.yeelib.device.xiaomi.Plate2Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Plate2Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19974a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Plate2Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Plate2Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C10721c1.C10735n.<clinit>():void");
        }
    }

    /* renamed from: w3.c1$o */
    class C10736o implements CompletionHandler {
        C10736o() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.c1$p */
    class C10737p implements CompletionHandler {
        C10737p() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.c1$q */
    class C10738q implements CompletionHandler {
        C10738q() {
        }

        public void onFailed(int i, String str) {
            String.format("Color4Device.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.c1$r */
    class C10739r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f19978a;

        C10739r(long j) {
            this.f19978a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31600l0(this.f19978a);
        }
    }

    /* renamed from: w3.c1$s */
    class C10740s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f19980a;

        C10740s(int i) {
            this.f19980a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31602m0(this.f19980a);
        }
    }

    /* renamed from: w3.c1$t */
    class C10741t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19982a;

        C10741t(C8327s sVar) {
            this.f19982a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31557P0(this.f19982a);
        }
    }

    /* renamed from: w3.c1$u */
    class C10742u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19984a;

        C10742u(C8327s sVar) {
            this.f19984a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31557P0(this.f19984a);
        }
    }

    /* renamed from: w3.c1$v */
    class C10743v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f19986a;

        C10743v(C8327s sVar) {
            this.f19986a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10721c1.this.mo23221d0().mo31557P0(this.f19986a);
        }
    }

    public C10721c1(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public void m27353Z1(Plate2Service.Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10) {
        boolean z = true;
        mo23221d0().mo31531C0(l5.intValue() == 1 ? DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR : l5.intValue() == 2 ? DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE : DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV);
        if (l10 != null) {
            mo23221d0().mo31547K0(l10.intValue());
        }
        if (l6 != null) {
            mo23221d0().mo31602m0(l6.intValue());
        }
        if (l != null) {
            mo23221d0().mo31600l0(l.longValue());
        }
        if (l2 != null) {
            mo23221d0().mo31561R0(l2.intValue());
        }
        if (power != null) {
            mo23221d0().mo31551M0(power == Plate2Service.Power.on);
        }
        if (l3 != null) {
            mo23221d0().mo31606o0(l3.longValue());
        }
        if (l4 != null) {
            mo23221d0().mo31608p0(l4.longValue());
        }
        if (l7 != null) {
            if (mo23221d0().mo31611r(2) == null) {
                mo23221d0().mo31577a(new C12041e(l7.intValue(), l7.intValue()));
            } else {
                mo23221d0().mo31573X0(l7.intValue());
            }
        }
        mo23221d0().mo31555O0(l8 != null && l8.longValue() == 1);
        DeviceStatusBase d0 = mo23221d0();
        if (l9 == null || l9.longValue() != 1) {
            z = false;
        }
        d0.mo31583d(z);
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C10738q());
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
        return R$drawable.icon_yeelight_device_badge_plate2_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_plate2_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C10734m();
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
            mo31477F1().sendCmd(Plate2Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10731j(z));
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
            mo31477F1().sendCmd(Plate2Service.CmdKey.cfg_init_power, String.valueOf(i), new C10733l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Plate2Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10724c(z));
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
        return mo42238a2(this.f19957A, this.f19958B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f19959z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f19956C, "Invalid handler!");
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
    public Plate2Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightPlate2Device) abstractDevice).mPlate2Service;
    }

    /* renamed from: a2 */
    public boolean mo42238a2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Plate2Service.C7933n0)) {
            AppUtils.m8300u(f19956C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Plate2Service.C7933n0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        if (super.mo23140b1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Plate2Service.Power.off, new C10737p());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C10726e());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Plate2Service.Power.on, new C10736o());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        boolean z = true;
        if (super.mo23150m1(i)) {
            return true;
        }
        if (mo31477F1() == null) {
            String str = f19956C;
            StringBuilder sb = new StringBuilder();
            sb.append("AbstractService is null! Device: ");
            sb.append(mo23185G());
            sb.append(", mi device is null? ");
            if (mo23206S() != null) {
                z = false;
            }
            sb.append(z);
            C3278f.m8797b(new AppUtils.SuicideException(str, sb.toString()));
            return false;
        }
        try {
            mo31477F1().openWithMode(Plate2Service.Power.on, Plate2Service.Effect.smooth, 500L, Long.valueOf((long) i), new C10727f(i));
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
            mo31477F1().setBright(Long.valueOf(j), Plate2Service.Effect.smooth, 500L, new C10739r(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        int i2 = i & ViewCompat.MEASURED_SIZE_MASK;
        if (super.mo23155q1(i2)) {
            return true;
        }
        try {
            mo31477F1().setRgb(Long.valueOf((long) i2), Plate2Service.Effect.smooth, 500L, new C10740s(i2));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C10723b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C10725d(this));
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
        mo31494W1(this.f19959z);
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
                AppUtils.m8300u("BATCH_RPC", "Color4Device, Invalid length of batch rpc result: " + str);
            }
            m27353Z1(Plate2Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)));
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
                mo31477F1().getProperties(new C10732k());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        boolean z = true;
        if (super.mo23168x1(sVar)) {
            return true;
        }
        if (mo31477F1() == null) {
            String str = f19956C;
            StringBuilder sb = new StringBuilder();
            sb.append("AbstractService is null! Device: ");
            sb.append(mo23185G());
            sb.append(", mi device is null? ");
            if (mo23206S() != null) {
                z = false;
            }
            sb.append(z);
            C3278f.m8797b(new AppUtils.SuicideException(str, sb.toString()));
            return false;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C10741t(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C10742u(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C10743v(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35417B()) {
            try {
                mo31477F1().setScene("color", Long.valueOf((long) (sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) sVar.mo35439f()), new C10722a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str2 = f19956C;
            AppUtils.m8300u(str2, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Temperature").getInternalName(), mo31477F1().getService().getProperty("Hue").getInternalName(), mo31477F1().getService().getProperty("Sat").getInternalName(), mo31477F1().getService().getProperty("ColorMode").getInternalName(), mo31477F1().getService().getProperty("Rgb").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName()};
    }
}
