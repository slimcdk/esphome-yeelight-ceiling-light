package p223w3;

import androidx.core.view.ViewCompat;
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
import com.yeelight.yeelib.device.xiaomi.Lamp10Service;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp10Device;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import p051j4.C3278f;
import p232y3.C12041e;
import p232y3.C12043g;
import p232y3.C12048k;

/* renamed from: w3.g0 */
public class C10965g0 extends WifiDeviceBase {

    /* renamed from: C */
    public static final String f20360C = "g0";

    /* renamed from: A */
    CompletionHandler f20361A = new C10985o(this);

    /* renamed from: B */
    Lamp10Service.C7368f1 f20362B = new C10986p();

    /* renamed from: z */
    CompletionHandler f20363z = new C10984n(this);

    /* renamed from: w3.g0$a */
    class C10966a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20364a;

        C10966a(C8327s sVar) {
            this.f20364a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31557P0(this.f20364a);
        }
    }

    /* renamed from: w3.g0$a0 */
    class C10967a0 implements CompletionHandler {
        C10967a0() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.g0$b */
    class C10968b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20367a;

        C10968b(C8327s sVar) {
            this.f20367a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31557P0(this.f20367a);
        }
    }

    /* renamed from: w3.g0$b0 */
    class C10969b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20369a;

        C10969b0(long j) {
            this.f20369a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31600l0(this.f20369a);
        }
    }

    /* renamed from: w3.g0$c */
    class C10970c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20371a;

        C10970c(C8327s sVar) {
            this.f20371a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31557P0(this.f20371a);
        }
    }

    /* renamed from: w3.g0$c0 */
    class C10971c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20373a;

        C10971c0(int i) {
            this.f20373a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31610q0(this.f20373a);
        }
    }

    /* renamed from: w3.g0$d */
    class C10972d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20375a;

        C10972d(C8327s sVar) {
            this.f20375a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31557P0(this.f20375a);
        }
    }

    /* renamed from: w3.g0$d0 */
    class C10973d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20377a;

        C10973d0(int i) {
            this.f20377a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31602m0(this.f20377a);
        }
    }

    /* renamed from: w3.g0$e */
    class C10974e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20379a;

        C10974e(C8327s sVar) {
            this.f20379a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31557P0(this.f20379a);
        }
    }

    /* renamed from: w3.g0$e0 */
    class C10975e0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f20381a;

        /* renamed from: b */
        final /* synthetic */ int f20382b;

        C10975e0(int[] iArr, int i) {
            this.f20381a = iArr;
            this.f20382b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f20381a) {
                arrayList.add(new C12043g.C12044a(aVar, this.f20382b));
            }
            C10965g0.this.mo23221d0().mo31604n0(arrayList);
        }
    }

    /* renamed from: w3.g0$f */
    class C10976f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20384a;

        C10976f(C8327s sVar) {
            this.f20384a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31557P0(this.f20384a);
        }
    }

    /* renamed from: w3.g0$g */
    class C10977g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20386a;

        C10977g(C8327s sVar) {
            this.f20386a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31557P0(this.f20386a);
        }
    }

    /* renamed from: w3.g0$h */
    class C10978h implements CompletionHandler {
        C10978h(C10965g0 g0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.g0$i */
    class C10979i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20388a;

        C10979i(boolean z) {
            this.f20388a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31555O0(this.f20388a);
        }
    }

    /* renamed from: w3.g0$j */
    class C10980j implements CompletionHandler {
        C10980j(C10965g0 g0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.g0$k */
    class C10981k implements Lamp10Service.C7408z0 {
        C10981k() {
        }

        /* renamed from: a */
        public void mo33785a(Lamp10Service.Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13, String str2, String str3) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power.name());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            sb2.append(l);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ct: ");
            sb3.append(l2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("temperature: ");
            sb4.append(l3);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("mode: ");
            sb5.append(l7);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("rgb: ");
            sb6.append(l8);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("lanMode: ");
            sb7.append(l11);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("flowing: ");
            sb8.append(l6);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("hue: ");
            sb9.append(l4);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("sat: ");
            sb10.append(l5);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("delayoff: ");
            sb11.append(l9);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("saveState: ");
            sb12.append(l10);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("flowParams: ");
            sb13.append(str);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("music_mode: ");
            sb14.append(l13);
            StringBuilder sb15 = new StringBuilder();
            sb15.append("onFromPower: ");
            sb15.append(l12);
            StringBuilder sb16 = new StringBuilder();
            sb16.append("indicator: ");
            sb16.append(str2);
            StringBuilder sb17 = new StringBuilder();
            sb17.append("nightTimeInfo: ");
            sb17.append(str3);
            C10965g0.this.m28022Z1(power, l, l2, l3, l4, l5, l6, l7, l8, l9, l10, str, l11, l12, l13, str2, str3);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.g0$l */
    class C10982l implements CompletionHandler {
        C10982l() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.g0$m */
    class C10983m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20392a;

        C10983m(int i) {
            this.f20392a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31551M0(true);
            C10965g0 g0Var = C10965g0.this;
            g0Var.mo23165w1(g0Var.mo23247j1(this.f20392a));
        }
    }

    /* renamed from: w3.g0$n */
    class C10984n implements CompletionHandler {
        C10984n(C10965g0 g0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.g0$o */
    class C10985o implements CompletionHandler {
        C10985o(C10965g0 g0Var) {
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

    /* renamed from: w3.g0$p */
    class C10986p implements Lamp10Service.C7368f1 {
        C10986p() {
        }

        /* renamed from: a */
        public void mo33745a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C10965g0.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo33746b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDelayOffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C10965g0.this.mo23221d0().mo31611r(2) == null) {
                C10965g0.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C10965g0.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo33747c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C10965g0.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo33748d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            DeviceStatusBase d0 = C10965g0.this.mo23221d0();
            if (i != 0) {
                d0.mo31531C0(DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW);
            } else if (d0.mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW) {
                ((C12048k) C10965g0.this.mo23221d0()).mo42736b1();
            }
            C10965g0.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo33749e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C10965g0.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo33750f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C10965g0.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo33751g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C10965g0.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo33752h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C10965g0.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo33753i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C10965g0.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C10965g0.this.mo23221d0().mo31543I0(true);
                }
                C10965g0.this.mo23221d0().mo31541H0(split[1]);
                C10965g0.this.mo23221d0().mo31539G0(split[2]);
                C10965g0.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C10965g0.f20360C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C10965g0.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C10965g0.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C10965g0.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo33754j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRgbChanged: ");
            sb.append(l);
            C10965g0.this.mo23221d0().mo31602m0(l.intValue());
        }

        /* renamed from: k */
        public void mo33755k(Long l) {
            C10965g0.this.mo23221d0().mo31608p0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo33756l(Long l) {
            DeviceStatusBase d0;
            DeviceStatusBase.DeviceMode deviceMode;
            StringBuilder sb = new StringBuilder();
            sb.append("onColorModeChanged: ");
            sb.append(l);
            if (l.longValue() == 1) {
                d0 = C10965g0.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C10965g0.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C10965g0.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo31531C0(deviceMode);
        }

        /* renamed from: m */
        public void mo33757m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onMusicEnableChanged = ");
            sb.append(l);
            C10965g0.this.mo23221d0().mo31593i(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo33758n(Long l) {
            C10965g0.this.mo23221d0().mo31606o0((long) l.intValue());
        }

        /* renamed from: o */
        public void mo33759o(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onIndicatorEnableChanged = ");
            sb.append(str);
            if (str != null) {
                String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                if (split.length != 0) {
                    C10965g0.this.mo23221d0().mo31595j(TimerCodec.ENABLE.equals(split[0]));
                }
            }
        }

        /* renamed from: p */
        public void mo33760p(Lamp10Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerChanged: ");
            sb.append(power.name());
            int i = C10995y.f20408a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C10965g0.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C10965g0.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }
    }

    /* renamed from: w3.g0$q */
    class C10987q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20395a;

        C10987q(boolean z) {
            this.f20395a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31583d(this.f20395a);
        }
    }

    /* renamed from: w3.g0$r */
    class C10988r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20397a;

        C10988r(int i) {
            this.f20397a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31547K0(this.f20397a);
        }
    }

    /* renamed from: w3.g0$s */
    class C10989s implements CompletionHandler {
        C10989s(C10965g0 g0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("enableMusicMode onFailed code = ");
            sb.append(i);
            sb.append(" msg = ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.g0$t */
    class C10990t implements CompletionHandler {
        C10990t(C10965g0 g0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("disableMusicMode onFailed code = ");
            sb.append(i);
            sb.append(" msg = ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.g0$u */
    class C10991u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20399a;

        /* renamed from: b */
        final /* synthetic */ String f20400b;

        /* renamed from: c */
        final /* synthetic */ String f20401c;

        /* renamed from: d */
        final /* synthetic */ int f20402d;

        C10991u(boolean z, String str, String str2, int i) {
            this.f20399a = z;
            this.f20400b = str;
            this.f20401c = str2;
            this.f20402d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31543I0(this.f20399a);
            C10965g0.this.mo23221d0().mo31541H0(this.f20400b);
            C10965g0.this.mo23221d0().mo31539G0(this.f20401c);
            C10965g0.this.mo23221d0().mo31537F0(this.f20402d);
        }
    }

    /* renamed from: w3.g0$v */
    class C10992v implements CompletionHandler {
        C10992v() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.g0$w */
    class C10993w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20405a;

        C10993w(boolean z) {
            this.f20405a = z;
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("enableTouchPanelIndicator onFailed code = ");
            sb.append(i);
            sb.append(" msg = ");
            sb.append(str);
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31595j(this.f20405a);
        }
    }

    /* renamed from: w3.g0$x */
    class C10994x implements WifiDeviceBase.C6080i {
        C10994x() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C10965g0.this.f20362B.mo33745a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C10965g0.this.f20362B.mo33752h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
            C10965g0.this.f20362B.mo33754j(l);
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
            C10965g0.this.f20362B.mo33756l(l);
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C10965g0.this.f20362B.mo33760p(Lamp10Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.g0$y */
    static /* synthetic */ class C10995y {

        /* renamed from: a */
        static final /* synthetic */ int[] f20408a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Lamp10Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20408a = r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp10Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20408a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp10Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C10965g0.C10995y.<clinit>():void");
        }
    }

    /* renamed from: w3.g0$z */
    class C10996z implements CompletionHandler {
        C10996z() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10965g0.this.mo23221d0().mo31551M0(false);
        }
    }

    public C10965g0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m28022Z1(com.yeelight.yeelib.device.xiaomi.Lamp10Service.Power r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.Long r20, java.lang.Long r21, java.lang.Long r22, java.lang.String r23, java.lang.Long r24, java.lang.Long r25, java.lang.Long r26, java.lang.String r27, java.lang.String r28) {
        /*
            r11 = this;
            r0 = r12
            r1 = r27
            r2 = 2
            r3 = 1
            if (r18 == 0) goto L_0x0017
            int r4 = r18.intValue()
            if (r4 != r3) goto L_0x0017
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r11.mo23221d0()
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r5 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW
        L_0x0013:
            r4.mo31531C0(r5)
            goto L_0x0032
        L_0x0017:
            if (r19 == 0) goto L_0x0032
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r11.mo23221d0()
            int r5 = r19.intValue()
            if (r5 != r3) goto L_0x0026
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r5 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR
            goto L_0x0013
        L_0x0026:
            int r5 = r19.intValue()
            if (r5 != r2) goto L_0x002f
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r5 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE
            goto L_0x0013
        L_0x002f:
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r5 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV
            goto L_0x0013
        L_0x0032:
            r4 = 0
            if (r18 == 0) goto L_0x0049
            com.yeelight.yeelib.device.base.DeviceStatusBase r5 = r11.mo23221d0()
            long r6 = r18.longValue()
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0045
            r6 = 1
            goto L_0x0046
        L_0x0045:
            r6 = 0
        L_0x0046:
            r5.mo31618u0(r6)
        L_0x0049:
            if (r25 == 0) goto L_0x0056
            com.yeelight.yeelib.device.base.DeviceStatusBase r5 = r11.mo23221d0()
            int r6 = r25.intValue()
            r5.mo31547K0(r6)
        L_0x0056:
            if (r20 == 0) goto L_0x0063
            com.yeelight.yeelib.device.base.DeviceStatusBase r5 = r11.mo23221d0()
            int r6 = r20.intValue()
            r5.mo31602m0(r6)
        L_0x0063:
            if (r13 == 0) goto L_0x0070
            com.yeelight.yeelib.device.base.DeviceStatusBase r5 = r11.mo23221d0()
            long r6 = r13.longValue()
            r5.mo31600l0(r6)
        L_0x0070:
            if (r14 == 0) goto L_0x007d
            com.yeelight.yeelib.device.base.DeviceStatusBase r5 = r11.mo23221d0()
            int r6 = r14.intValue()
            r5.mo31610q0(r6)
        L_0x007d:
            if (r15 == 0) goto L_0x008a
            com.yeelight.yeelib.device.base.DeviceStatusBase r5 = r11.mo23221d0()
            int r6 = r15.intValue()
            r5.mo31561R0(r6)
        L_0x008a:
            if (r0 == 0) goto L_0x009a
            com.yeelight.yeelib.device.base.DeviceStatusBase r5 = r11.mo23221d0()
            com.yeelight.yeelib.device.xiaomi.Lamp10Service$Power r6 = com.yeelight.yeelib.device.xiaomi.Lamp10Service.Power.on
            if (r0 != r6) goto L_0x0096
            r0 = 1
            goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            r5.mo31551M0(r0)
        L_0x009a:
            if (r16 == 0) goto L_0x00a7
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r11.mo23221d0()
            long r5 = r16.longValue()
            r0.mo31606o0(r5)
        L_0x00a7:
            if (r17 == 0) goto L_0x00b4
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r11.mo23221d0()
            long r5 = r17.longValue()
            r0.mo31608p0(r5)
        L_0x00b4:
            if (r21 == 0) goto L_0x00e4
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r11.mo23221d0()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.mo31611r(r5)
            if (r0 != 0) goto L_0x00d9
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r11.mo23221d0()
            y3.e r5 = new y3.e
            int r6 = r21.intValue()
            int r7 = r21.intValue()
            r5.<init>(r6, r7)
            r0.mo31577a(r5)
            goto L_0x00e4
        L_0x00d9:
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r11.mo23221d0()
            int r5 = r21.intValue()
            r0.mo31573X0(r5)
        L_0x00e4:
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r11.mo23221d0()
            r5 = 1
            if (r22 == 0) goto L_0x00f6
            long r7 = r22.longValue()
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x00f6
            r7 = 1
            goto L_0x00f7
        L_0x00f6:
            r7 = 0
        L_0x00f7:
            r0.mo31555O0(r7)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r11.mo23221d0()
            if (r24 == 0) goto L_0x010a
            long r7 = r24.longValue()
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x010a
            r7 = 1
            goto L_0x010b
        L_0x010a:
            r7 = 0
        L_0x010b:
            r0.mo31583d(r7)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r11.mo23221d0()
            if (r26 == 0) goto L_0x011e
            long r7 = r26.longValue()
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x011e
            r5 = 1
            goto L_0x011f
        L_0x011e:
            r5 = 0
        L_0x011f:
            r0.mo31593i(r5)
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x0133
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r11.mo23221d0()
            com.yeelight.yeelib.models.a r5 = com.yeelight.yeelib.models.C8308a.m19688b(r23)
            r0.mo31616t0(r5)
        L_0x0133:
            java.lang.String r0 = ","
            if (r1 == 0) goto L_0x014d
            java.lang.String[] r1 = r1.split(r0)
            int r5 = r1.length
            if (r5 == 0) goto L_0x014d
            com.yeelight.yeelib.device.base.DeviceStatusBase r5 = r11.mo23221d0()
            r1 = r1[r4]
            java.lang.String r6 = "1"
            boolean r1 = r6.equals(r1)
            r5.mo31595j(r1)
        L_0x014d:
            java.lang.String r1 = "\\|"
            r5 = r28
            java.lang.String[] r1 = r5.split(r1)
            int r5 = r1.length
            r6 = 4
            if (r5 != r6) goto L_0x01cf
            r5 = r1[r4]
            java.lang.String r6 = "disable"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x016b
            com.yeelight.yeelib.device.base.DeviceStatusBase r5 = r11.mo23221d0()
            r5.mo31543I0(r4)
            goto L_0x017c
        L_0x016b:
            r4 = r1[r4]
            java.lang.String r5 = "enable"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x017c
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r11.mo23221d0()
            r4.mo31543I0(r3)
        L_0x017c:
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r11.mo23221d0()
            r3 = r1[r3]
            r4.mo31541H0(r3)
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r11.mo23221d0()
            r2 = r1[r2]
            r3.mo31539G0(r2)
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r11.mo23221d0()
            r3 = 3
            r1 = r1[r3]
            int r1 = java.lang.Integer.parseInt(r1)
            r2.mo31537F0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "start = "
            r1.append(r2)
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r11.mo23221d0()
            java.lang.String r2 = r2.mo31534E()
            r1.append(r2)
            r1.append(r0)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r11.mo23221d0()
            java.lang.String r0 = r0.mo31532D()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r11.mo23221d0()
            int r0 = r0.mo31530C()
            r1.append(r0)
        L_0x01cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223w3.C10965g0.m28022Z1(com.yeelight.yeelib.device.xiaomi.Lamp10Service$Power, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String):void");
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C10967a0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo31474C1() {
        try {
            mo31477F1().disableMusic(0L, new C10990t(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo31476E1(String str, int i) {
        try {
            mo31477F1().enableMusic(1L, str, Long.valueOf((long) i), new C10989s(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_lamp10_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_lamp10_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C10994x();
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
            mo31477F1().sendCmd(Lamp10Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10987q(z));
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
            mo31477F1().sendCmd(Lamp10Service.CmdKey.cfg_init_power, String.valueOf(i), new C10988r(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Lamp10Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10979i(z));
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
        return mo42286a2(this.f20361A, this.f20362B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20363z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20360C, "Invalid handler!");
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
    public Lamp10Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightLamp10Device) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo42286a2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Lamp10Service.C7368f1)) {
            AppUtils.m8300u(f20360C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Lamp10Service.C7368f1) obj2);
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
            mo31477F1().setPower(Lamp10Service.Power.off, new C10996z());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C10982l());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
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
            Lamp10Service Y1 = mo31477F1();
            Lamp10Service.CmdKey cmdKey = Lamp10Service.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            Y1.sendCmd(cmdKey, sb2.toString(), new C10991u(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: h1 */
    public void mo23246h1(boolean z) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(z ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
            sb.append(",10");
            mo31477F1().sendCmd(Lamp10Service.CmdKey.cfg_indicator, sb.toString(), new C10993w(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Lamp10Service.Power.on, new C10992v());
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
            String str = f20360C;
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
            mo31477F1().openWithMode(Lamp10Service.Power.on, Lamp10Service.Effect.smooth, 500L, Long.valueOf((long) i), new C10983m(i));
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
            mo31477F1().setBright(Long.valueOf(j), Lamp10Service.Effect.smooth, 500L, new C10969b0(j));
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
            mo31477F1().setRgb(Long.valueOf((long) i2), Lamp10Service.Effect.smooth, 500L, new C10973d0(i2));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        if (i < 50) {
            i = 50;
        }
        if (i > 3600000) {
            i = 3600000;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(i);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(1);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(iArr[i3] & ViewCompat.MEASURED_SIZE_MASK);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(i2);
        }
        try {
            mo31477F1().start_cf(0L, 0L, sb.toString(), new C10975e0(iArr, i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        if (super.mo23159s1(i)) {
            return true;
        }
        try {
            mo31477F1().setCt(Long.valueOf((long) i), Lamp10Service.Effect.smooth, 500L, new C10971c0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C10978h(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C10980j(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20363z);
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
            if (jSONArray.length() != 17) {
                AppUtils.m8300u("BATCH_RPC", "ColorDevice, Invalid length of batch rpc result: " + str2);
            }
            m28022Z1(Lamp10Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)), jSONArray.getString(11), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), Long.valueOf(jSONArray.getLong(14)), jSONArray.getString(15), jSONArray.getString(16));
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
                mo31477F1().getProperties(new C10981k());
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
            String str = f20360C;
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
        } else if (sVar.mo35455v()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C10966a(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C10968b(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C10970c(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C10972d(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35417B()) {
            try {
                mo31477F1().setScene("color", Long.valueOf((long) (sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) sVar.mo35439f()), new C10974e(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (sVar.mo35456w()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35444k()), Long.valueOf((long) sVar.mo35445l()), sVar.mo35447n(), new C10976f(sVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C10977g(sVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str2 = f20360C;
            AppUtils.m8300u(str2, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("Temperature").getInternalName(), mo31477F1().getService().getProperty("Hue").getInternalName(), mo31477F1().getService().getProperty("Sat").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("ColorMode").getInternalName(), mo31477F1().getService().getProperty("Rgb").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("MusicEnable").getInternalName(), mo31477F1().getService().getProperty(Lamp10Service.PROPERTY_IndicatorEnable).getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName()};
    }
}
