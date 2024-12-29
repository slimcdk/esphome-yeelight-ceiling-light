package p223w3;

import android.text.TextUtils;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.Lamp7Service;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp7Device;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONArray;
import org.json.JSONException;
import p232y3.C12039d;
import p232y3.C12041e;

/* renamed from: w3.i0 */
public class C11138i0 extends WifiDeviceBase {

    /* renamed from: Q */
    public static final String f20627Q = "i0";

    /* renamed from: A */
    CompletionHandler f20628A = new C11145g(this);

    /* renamed from: B */
    CompletionHandler f20629B = new C11146h(this);

    /* renamed from: C */
    Lamp7Service.C7597t0 f20630C = new C11147i();

    /* renamed from: z */
    public int f20631z;

    /* renamed from: w3.i0$a */
    class C11139a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20632a;

        C11139a(C8327s sVar) {
            this.f20632a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31557P0(this.f20632a);
        }
    }

    /* renamed from: w3.i0$b */
    class C11140b implements CompletionHandler {
        C11140b(C11138i0 i0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.i0$c */
    class C11141c implements CompletionHandler {
        C11141c() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.i0$d */
    class C11142d implements CompletionHandler {
        C11142d(C11138i0 i0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.i0$e */
    class C11143e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20635a;

        C11143e(boolean z) {
            this.f20635a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31555O0(this.f20635a);
        }
    }

    /* renamed from: w3.i0$f */
    class C11144f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20637a;

        C11144f(int i) {
            this.f20637a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31551M0(true);
            C11138i0 i0Var = C11138i0.this;
            i0Var.mo23165w1(i0Var.mo23247j1(this.f20637a));
        }
    }

    /* renamed from: w3.i0$g */
    class C11145g implements CompletionHandler {
        C11145g(C11138i0 i0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.i0$h */
    class C11146h implements CompletionHandler {
        C11146h(C11138i0 i0Var) {
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

    /* renamed from: w3.i0$i */
    class C11147i implements Lamp7Service.C7597t0 {
        C11147i() {
        }

        /* renamed from: a */
        public void mo34070a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11138i0.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo34071b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11138i0.this.mo23221d0().mo31611r(2) == null) {
                C11138i0.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11138i0.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo34072c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11138i0.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo34073d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11138i0.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo34074e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11138i0.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo34075f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l.intValue());
            C11138i0.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo34076g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11138i0.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo34077h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l.intValue());
            C11138i0.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo34078i(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onKidModeChanged: ");
            sb.append(l);
            C11138i0.this.mo23221d0().mo31622w0(l != null && l.longValue() == 1);
        }

        /* renamed from: j */
        public void mo34079j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSensorPirEnableChanged: ");
            sb.append(l);
            C11138i0.this.mo23221d0().mo31595j(l != null && l.longValue() == 1);
        }

        /* renamed from: k */
        public void mo34080k(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDefaultPomodoroChanged: ");
            sb.append(str);
            C11138i0.this.m28390f2(str);
        }

        /* renamed from: l */
        public void mo34081l(Lamp7Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11156r.f20652a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11138i0.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11138i0.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }
    }

    /* renamed from: w3.i0$j */
    class C11148j implements Lamp7Service.C7589p0 {
        C11148j() {
        }

        /* renamed from: a */
        public void mo34062a(Lamp7Service.Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, Long l9, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append("bright: ");
            sb.append(l);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ct: ");
            sb2.append(l2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("delayoff: ");
            sb3.append(l3);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("power: ");
            sb4.append(power != null ? power.name() : "null");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("kidMode: ");
            Long l10 = l4;
            sb5.append(l10);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowing : ");
            Long l11 = l8;
            sb6.append(l11);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("lanMode: ");
            Long l12 = l5;
            sb7.append(l12);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("onFromPower: ");
            Long l13 = l7;
            sb8.append(l13);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("saveState: ");
            Long l14 = l6;
            sb9.append(l14);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("flowParams: ");
            String str3 = str;
            sb10.append(str3);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("sensorPirEnable: ");
            Long l15 = l9;
            sb11.append(l15);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("defaultPomodoro: ");
            String str4 = str2;
            sb12.append(str4);
            C11138i0.this.m28388c2(power, l, l2, l3, l10, str3, l12, l14, l13, l11, l15, str4);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.i0$k */
    class C11149k implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C12039d f20641a;

        C11149k(C12039d dVar) {
            this.f20641a = dVar;
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("setDefaultSchedule onFailed code: ");
            sb.append(i);
        }

        public void onSucceed() {
            C11138i0.this.m28389e2(this.f20641a.mo42674c());
        }
    }

    /* renamed from: w3.i0$l */
    class C11150l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20643a;

        C11150l(boolean z) {
            this.f20643a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31622w0(this.f20643a);
        }
    }

    /* renamed from: w3.i0$m */
    class C11151m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20645a;

        C11151m(boolean z) {
            this.f20645a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31583d(this.f20645a);
        }
    }

    /* renamed from: w3.i0$n */
    class C11152n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20647a;

        C11152n(boolean z) {
            this.f20647a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31587f(this.f20647a);
        }
    }

    /* renamed from: w3.i0$o */
    class C11153o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20649a;

        C11153o(int i) {
            this.f20649a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31547K0(this.f20649a);
        }
    }

    /* renamed from: w3.i0$p */
    class C11154p implements CompletionHandler {
        C11154p(C11138i0 i0Var) {
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

    /* renamed from: w3.i0$q */
    class C11155q implements WifiDeviceBase.C6080i {
        C11155q() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11138i0.this.f20630C.mo34070a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11138i0.this.f20630C.mo34077h(l);
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
            C11138i0.this.f20630C.mo34081l(Lamp7Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.i0$r */
    static /* synthetic */ class C11156r {

        /* renamed from: a */
        static final /* synthetic */ int[] f20652a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Lamp7Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20652a = r0
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp7Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20652a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp7Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11138i0.C11156r.<clinit>():void");
        }
    }

    /* renamed from: w3.i0$s */
    class C11157s implements CompletionHandler {
        C11157s() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.open --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.i0$t */
    class C11158t implements CompletionHandler {
        C11158t() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.i0$u */
    class C11159u implements CompletionHandler {
        C11159u() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.i0$v */
    class C11160v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20656a;

        C11160v(long j) {
            this.f20656a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31600l0(this.f20656a);
        }
    }

    /* renamed from: w3.i0$w */
    class C11161w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20658a;

        C11161w(int i) {
            this.f20658a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31610q0(this.f20658a);
        }
    }

    /* renamed from: w3.i0$x */
    class C11162x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20660a;

        C11162x(C8327s sVar) {
            this.f20660a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31557P0(this.f20660a);
        }
    }

    /* renamed from: w3.i0$y */
    class C11163y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20662a;

        C11163y(C8327s sVar) {
            this.f20662a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31557P0(this.f20662a);
        }
    }

    /* renamed from: w3.i0$z */
    class C11164z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20664a;

        C11164z(C8327s sVar) {
            this.f20664a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11138i0.this.mo23221d0().mo31557P0(this.f20664a);
        }
    }

    public C11138i0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public void m28388c2(Lamp7Service.Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, Long l9, String str2) {
        Lamp7Service.Power power2 = power;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == Lamp7Service.Power.on);
        }
        if (l != null) {
            mo23221d0().mo31600l0(l.longValue());
        }
        if (l2 != null) {
            mo23221d0().mo31610q0(l2.intValue());
        }
        if (l7 != null) {
            mo23221d0().mo31547K0(l7.intValue());
        }
        if (l3 != null) {
            if (mo23221d0().mo31611r(2) == null) {
                mo23221d0().mo31577a(new C12041e(l3.intValue(), l3.intValue()));
            } else {
                mo23221d0().mo31573X0(l3.intValue());
            }
        }
        mo23221d0().mo31622w0(l4 != null && l4.longValue() == 1);
        mo23221d0().mo31583d(l5 != null && l5.longValue() == 1);
        mo23221d0().mo31555O0(l6 != null && l6.longValue() == 1);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        mo23221d0().mo31618u0(l8.longValue() != 0);
        DeviceStatusBase d0 = mo23221d0();
        if (l9 == null || l9.longValue() != 1) {
            z = false;
        }
        d0.mo31587f(z);
        m28390f2(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public void m28389e2(int i) {
        this.f20631z = i;
        mo23221d0().mo31592h0(4096);
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public void m28390f2(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            if (split.length >= 1 && !TextUtils.isEmpty(split[0])) {
                m28389e2(Integer.valueOf(split[0]).intValue());
            }
        }
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11159u());
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
            return R$drawable.icon_yeelight_device_badge_lamp7_small;
        }
        String T = mo23208T();
        T.hashCode();
        return !T.equals("yeelink.light.lamp7") ? !T.equals("yeelink.light.lamp8") ? R$drawable.icon_yeelight_device_badge_lamp7_small : R$drawable.icon_yeelight_device_badge_lamp8_small : R$drawable.icon_yeelight_device_badge_lamp7_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_lamp7_big;
        }
        String T = mo23208T();
        T.hashCode();
        return !T.equals("yeelink.light.lamp7") ? !T.equals("yeelink.light.lamp8") ? R$drawable.icon_yeelight_device_badge_lamp7_big : R$drawable.icon_yeelight_device_badge_lamp8_big : R$drawable.icon_yeelight_device_badge_lamp7_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11155q();
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
            mo31477F1().sendCmd(Lamp7Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11151m(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: P1 */
    public void mo31487P1(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("setKidModeSelect --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(Lamp7Service.CmdKey.kid_mode, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11150l(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: R1 */
    public boolean mo31489R1(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("setOnFromPower --> Invoke, value : ");
        sb.append(i);
        try {
            mo31477F1().sendCmd(Lamp7Service.CmdKey.cfg_init_power, String.valueOf(i), new C11153o(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Lamp7Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11143e(z));
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
            mo31477F1().sendCmd(Lamp7Service.CmdKey.cfg_shortkey, str2, new C11154p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42298g2(this.f20629B, this.f20630C);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20628A);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20627Q, "Invalid handler!");
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
    public Lamp7Service mo31477F1() {
        return ((YeelightLamp7Device) this.f4749n).mDeviceService;
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        if (super.mo23140b1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Lamp7Service.Power.off, new C11158t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: b2 */
    public int mo42296b2() {
        return this.f20631z;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11141c());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: d2 */
    public void mo42297d2(C12039d dVar) {
        if (dVar != null) {
            try {
                mo31477F1().setTime(Lamp7Service.CmdKey.pomodoro, "default", dVar.mo42672a(), new C11149k(dVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e1 */
    public void mo23244e1(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("enableHumanInduction --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(Lamp7Service.CmdKey.sensor_pir_enable, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11152n(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g2 */
    public boolean mo42298g2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Lamp7Service.C7597t0)) {
            AppUtils.m8300u(f20627Q, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Lamp7Service.C7597t0) obj2);
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
            mo31477F1().setPower(Lamp7Service.Power.on, new C11157s());
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
            mo31477F1().openWithMode(Lamp7Service.Power.on, Lamp7Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11144f(i));
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
            mo31477F1().setBright(Long.valueOf(j), Lamp7Service.Effect.smooth, 500L, new C11160v(j));
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
            mo31477F1().setCt(Long.valueOf((long) i), Lamp7Service.Effect.smooth, 500L, new C11161w(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11142d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11140b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20628A);
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
                AppUtils.m8300u("BATCH_RPC", "MangoDevice, Invalid length of batch rpc result: " + str2);
            }
            m28388c2(Lamp7Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)), jSONArray.getString(11));
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
                mo31477F1().getProperties(new C11148j());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11162x(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11163y(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11164z(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11139a(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f20627Q;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("KidMode").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty(Lamp7Service.PROPERTY_SensorPirEnable).getInternalName(), mo31477F1().getService().getProperty(Lamp7Service.PROPERTY_DefaultPomodoro).getInternalName()};
    }
}
