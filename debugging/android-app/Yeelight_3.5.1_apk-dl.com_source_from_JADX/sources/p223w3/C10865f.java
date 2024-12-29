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
import com.yeelight.yeelib.device.xiaomi.BsLampService;
import com.yeelight.yeelib.device.xiaomi.YeelightBsLampDevice;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p207s3.C10333b;
import p232y3.C12041e;
import p232y3.C12043g;
import p232y3.C12048k;

/* renamed from: w3.f */
public class C10865f extends C10333b {

    /* renamed from: C */
    public static final String f20187C = "f";

    /* renamed from: A */
    CompletionHandler f20188A = new C10885n(this);

    /* renamed from: B */
    BsLampService.C6387w0 f20189B = new C10886o();

    /* renamed from: z */
    CompletionHandler f20190z = new C10884m(this);

    /* renamed from: w3.f$a */
    class C10866a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20191a;

        C10866a(C8327s sVar) {
            this.f20191a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31557P0(this.f20191a);
        }
    }

    /* renamed from: w3.f$a0 */
    class C10867a0 implements CompletionHandler {
        C10867a0() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.f$b */
    class C10868b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20194a;

        C10868b(C8327s sVar) {
            this.f20194a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31557P0(this.f20194a);
        }
    }

    /* renamed from: w3.f$b0 */
    class C10869b0 implements CompletionHandler {
        C10869b0() {
        }

        public void onFailed(int i, String str) {
            String.format("BsLampDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.f$c */
    class C10870c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20197a;

        C10870c(C8327s sVar) {
            this.f20197a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31557P0(this.f20197a);
        }
    }

    /* renamed from: w3.f$c0 */
    class C10871c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20199a;

        C10871c0(long j) {
            this.f20199a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31600l0(this.f20199a);
        }
    }

    /* renamed from: w3.f$d */
    class C10872d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20201a;

        C10872d(C8327s sVar) {
            this.f20201a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31557P0(this.f20201a);
        }
    }

    /* renamed from: w3.f$d0 */
    class C10873d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20203a;

        C10873d0(int i) {
            this.f20203a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31610q0(this.f20203a);
        }
    }

    /* renamed from: w3.f$e */
    class C10874e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20205a;

        C10874e(C8327s sVar) {
            this.f20205a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31557P0(this.f20205a);
        }
    }

    /* renamed from: w3.f$e0 */
    class C10875e0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20207a;

        C10875e0(int i) {
            this.f20207a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31602m0(this.f20207a);
        }
    }

    /* renamed from: w3.f$f */
    class C10876f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20209a;

        C10876f(C8327s sVar) {
            this.f20209a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31557P0(this.f20209a);
        }
    }

    /* renamed from: w3.f$f0 */
    class C10877f0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f20211a;

        /* renamed from: b */
        final /* synthetic */ int f20212b;

        C10877f0(int[] iArr, int i) {
            this.f20211a = iArr;
            this.f20212b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f20211a) {
                arrayList.add(new C12043g.C12044a(aVar, this.f20212b));
            }
            C10865f.this.mo23221d0().mo31604n0(arrayList);
        }
    }

    /* renamed from: w3.f$g */
    class C10878g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20214a;

        C10878g(C8327s sVar) {
            this.f20214a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31557P0(this.f20214a);
        }
    }

    /* renamed from: w3.f$h */
    class C10879h implements CompletionHandler {
        C10879h(C10865f fVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.f$i */
    class C10880i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20216a;

        C10880i(boolean z) {
            this.f20216a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31555O0(this.f20216a);
        }
    }

    /* renamed from: w3.f$j */
    class C10881j implements CompletionHandler {
        C10881j(C10865f fVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.f$k */
    class C10882k implements BsLampService.C6379s0 {
        C10882k() {
        }

        /* renamed from: a */
        public void mo32205a(BsLampService.Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, String str2, Long l10) {
            StringBuilder sb = new StringBuilder();
            sb.append("mode: ");
            sb.append(l6);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rgb: ");
            Long l11 = l7;
            sb2.append(l11);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bright: ");
            Long l12 = l;
            sb3.append(l12);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("flowing: ");
            Long l13 = l5;
            sb4.append(l13);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("ct: ");
            Long l14 = l2;
            sb5.append(l14);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("power: ");
            sb6.append(power.name());
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
            Long l17 = l8;
            sb9.append(l17);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("flowParams: ");
            String str3 = str;
            sb10.append(str3);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("nightTimeInfo : ");
            String str4 = str2;
            sb11.append(str4);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("saveState: ");
            Long l18 = l9;
            sb12.append(l18);
            C10865f.this.m27731k2(power, l12, l14, l15, l16, l13, l6, l11, l17, str3, l18, str4, l10);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.f$l */
    class C10883l implements CompletionHandler {
        C10883l() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.f$m */
    class C10884m implements CompletionHandler {
        C10884m(C10865f fVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.f$n */
    class C10885n implements CompletionHandler {
        C10885n(C10865f fVar) {
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

    /* renamed from: w3.f$o */
    class C10886o implements BsLampService.C6387w0 {
        C10886o() {
        }

        /* renamed from: a */
        public void mo32213a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C10865f.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo32214b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDelayOffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C10865f.this.mo23221d0().mo31611r(2) == null) {
                C10865f.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C10865f.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo32215c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C10865f.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo32216d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            DeviceStatusBase d0 = C10865f.this.mo23221d0();
            if (i != 0) {
                d0.mo31531C0(DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW);
            } else if (d0.mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW) {
                ((C12048k) C10865f.this.mo23221d0()).mo42736b1();
            }
            C10865f.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo32217e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C10865f.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo32218f(BsLampService.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerChanged: ");
            sb.append(power.name());
            int i = C10897z.f20240a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C10865f.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C10865f.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: h */
        public void mo32219h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C10865f.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo32220i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C10865f.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C10865f.this.mo23221d0().mo31543I0(true);
                }
                C10865f.this.mo23221d0().mo31541H0(split[1]);
                C10865f.this.mo23221d0().mo31539G0(split[2]);
                C10865f.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C10865f.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C10865f.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C10865f.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo32221j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRgbChanged: ");
            sb.append(l);
            C10865f.this.mo23221d0().mo31602m0(l.intValue());
        }

        /* renamed from: k */
        public void mo32222k(Long l) {
            C10865f.this.mo23221d0().mo31608p0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo32223l(Long l) {
            DeviceStatusBase d0;
            DeviceStatusBase.DeviceMode deviceMode;
            StringBuilder sb = new StringBuilder();
            sb.append("onColorModeChanged: ");
            sb.append(l);
            if (l.longValue() == 1) {
                d0 = C10865f.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C10865f.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C10865f.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo31531C0(deviceMode);
        }

        /* renamed from: m */
        public void mo32224m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onMiBandSleepChanged =");
            sb.append(l);
            C10865f.this.mo23221d0().mo31591h(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo32225n(Long l) {
            C10865f.this.mo23221d0().mo31606o0((long) l.intValue());
        }
    }

    /* renamed from: w3.f$p */
    class C10887p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20221a;

        C10887p(boolean z) {
            this.f20221a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31583d(this.f20221a);
        }
    }

    /* renamed from: w3.f$q */
    class C10888q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20223a;

        C10888q(int i) {
            this.f20223a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31547K0(this.f20223a);
        }
    }

    /* renamed from: w3.f$r */
    class C10889r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20225a;

        /* renamed from: b */
        final /* synthetic */ String f20226b;

        /* renamed from: c */
        final /* synthetic */ String f20227c;

        /* renamed from: d */
        final /* synthetic */ int f20228d;

        C10889r(boolean z, String str, String str2, int i) {
            this.f20225a = z;
            this.f20226b = str;
            this.f20227c = str2;
            this.f20228d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31543I0(this.f20225a);
            C10865f.this.mo23221d0().mo31541H0(this.f20226b);
            C10865f.this.mo23221d0().mo31539G0(this.f20227c);
            C10865f.this.mo23221d0().mo31537F0(this.f20228d);
        }
    }

    /* renamed from: w3.f$s */
    class C10890s implements CompletionHandler {
        C10890s(C10865f fVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.f$t */
    class C10891t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f20230a;

        /* renamed from: b */
        final /* synthetic */ String f20231b;

        /* renamed from: c */
        final /* synthetic */ int f20232c;

        C10891t(String str, String str2, int i) {
            this.f20230a = str;
            this.f20231b = str2;
            this.f20232c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31541H0(this.f20230a);
            C10865f.this.mo23221d0().mo31539G0(this.f20231b);
            C10865f.this.mo23221d0().mo31537F0(this.f20232c);
        }
    }

    /* renamed from: w3.f$u */
    class C10892u implements CompletionHandler {
        C10892u() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.f$v */
    class C10893v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20235a;

        C10893v(boolean z) {
            this.f20235a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31543I0(this.f20235a);
        }
    }

    /* renamed from: w3.f$w */
    class C10894w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20237a;

        C10894w(int i) {
            this.f20237a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10865f.this.mo23221d0().mo31551M0(true);
            C10865f fVar = C10865f.this;
            fVar.mo23165w1(fVar.mo23247j1(this.f20237a));
        }
    }

    /* renamed from: w3.f$x */
    class C10895x implements CompletionHandler {
        C10895x(C10865f fVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.f$y */
    class C10896y implements WifiDeviceBase.C6080i {
        C10896y() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C10865f.this.f20189B.mo32213a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C10865f.this.f20189B.mo32219h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
            C10865f.this.f20189B.mo32221j(l);
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
            C10865f.this.f20189B.mo32223l(l);
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C10865f.this.f20189B.mo32218f(BsLampService.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.f$z */
    static /* synthetic */ class C10897z {

        /* renamed from: a */
        static final /* synthetic */ int[] f20240a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.BsLampService$Power[] r0 = com.yeelight.yeelib.device.xiaomi.BsLampService.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20240a = r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$Power r1 = com.yeelight.yeelib.device.xiaomi.BsLampService.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20240a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.BsLampService$Power r1 = com.yeelight.yeelib.device.xiaomi.BsLampService.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C10865f.C10897z.<clinit>():void");
        }
    }

    public C10865f(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: k2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m27731k2(com.yeelight.yeelib.device.xiaomi.BsLampService.Power r11, java.lang.Long r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.String r20, java.lang.Long r21, java.lang.String r22, java.lang.Long r23) {
        /*
            r10 = this;
            r0 = r11
            r1 = 2
            r2 = 1
            if (r16 == 0) goto L_0x0015
            int r3 = r16.intValue()
            if (r3 != r2) goto L_0x0015
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW
        L_0x0011:
            r3.mo31531C0(r4)
            goto L_0x0030
        L_0x0015:
            if (r17 == 0) goto L_0x0030
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            int r4 = r17.intValue()
            if (r4 != r2) goto L_0x0024
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR
            goto L_0x0011
        L_0x0024:
            int r4 = r17.intValue()
            if (r4 != r1) goto L_0x002d
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE
            goto L_0x0011
        L_0x002d:
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV
            goto L_0x0011
        L_0x0030:
            r3 = 0
            if (r16 == 0) goto L_0x0047
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            long r5 = r16.longValue()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0043
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            r4.mo31618u0(r5)
        L_0x0047:
            if (r18 == 0) goto L_0x0054
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            int r5 = r18.intValue()
            r4.mo31602m0(r5)
        L_0x0054:
            if (r12 == 0) goto L_0x0061
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            long r5 = r12.longValue()
            r4.mo31600l0(r5)
        L_0x0061:
            if (r13 == 0) goto L_0x006e
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            int r5 = r13.intValue()
            r4.mo31610q0(r5)
        L_0x006e:
            if (r0 == 0) goto L_0x007e
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            com.yeelight.yeelib.device.xiaomi.BsLampService$Power r5 = com.yeelight.yeelib.device.xiaomi.BsLampService.Power.on
            if (r0 != r5) goto L_0x007a
            r0 = 1
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r4.mo31551M0(r0)
        L_0x007e:
            if (r14 == 0) goto L_0x008b
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            long r4 = r14.longValue()
            r0.mo31606o0(r4)
        L_0x008b:
            if (r15 == 0) goto L_0x0098
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            long r4 = r15.longValue()
            r0.mo31608p0(r4)
        L_0x0098:
            if (r19 == 0) goto L_0x00c8
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.mo31611r(r4)
            if (r0 != 0) goto L_0x00bd
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            y3.e r4 = new y3.e
            int r5 = r19.intValue()
            int r6 = r19.intValue()
            r4.<init>(r5, r6)
            r0.mo31577a(r4)
            goto L_0x00c8
        L_0x00bd:
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            int r4 = r19.intValue()
            r0.mo31573X0(r4)
        L_0x00c8:
            java.lang.String r0 = "\\|"
            r4 = r22
            java.lang.String[] r0 = r4.split(r0)
            int r4 = r0.length
            r5 = 4
            if (r4 != r5) goto L_0x014c
            r4 = r0[r3]
            java.lang.String r5 = "disable"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00e6
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            r4.mo31543I0(r3)
            goto L_0x00f7
        L_0x00e6:
            r4 = r0[r3]
            java.lang.String r5 = "enable"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00f7
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            r4.mo31543I0(r2)
        L_0x00f7:
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            r5 = r0[r2]
            r4.mo31541H0(r5)
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            r1 = r0[r1]
            r4.mo31539G0(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r1 = r10.mo23221d0()
            r4 = 3
            r0 = r0[r4]
            int r0 = java.lang.Integer.parseInt(r0)
            r1.mo31537F0(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "start = "
            r0.append(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r1 = r10.mo23221d0()
            java.lang.String r1 = r1.mo31534E()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r1 = r10.mo23221d0()
            java.lang.String r1 = r1.mo31532D()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r1 = r10.mo23221d0()
            int r1 = r1.mo31530C()
            r0.append(r1)
        L_0x014c:
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            r4 = 1
            if (r21 == 0) goto L_0x015e
            long r6 = r21.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x015e
            r1 = 1
            goto L_0x015f
        L_0x015e:
            r1 = 0
        L_0x015f:
            r0.mo31555O0(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            if (r23 == 0) goto L_0x0171
            long r6 = r23.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0171
            goto L_0x0172
        L_0x0171:
            r2 = 0
        L_0x0172:
            r0.mo31591h(r2)
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x0186
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            com.yeelight.yeelib.models.a r1 = com.yeelight.yeelib.models.C8308a.m19688b(r20)
            r0.mo31616t0(r1)
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223w3.C10865f.m27731k2(com.yeelight.yeelib.device.xiaomi.BsLampService$Power, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long):void");
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C10869b0());
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
        return !T.equals("yeelink.light.bslamp2") ? !T.equals("yeelink.light.bslamp3") ? R$drawable.icon_yeelight_device_badge_cherry1s_small : R$drawable.icon_yeelight_device_badge_dysis_le_small : R$drawable.icon_yeelight_device_badge_dysis_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        String T = mo23208T();
        T.hashCode();
        return !T.equals("yeelink.light.bslamp2") ? !T.equals("yeelink.light.bslamp3") ? R$drawable.icon_yeelight_device_badge_cherry1s_big : R$drawable.icon_yeelight_device_badge_dysis_le_big : R$drawable.icon_yeelight_device_badge_dysis_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C10896y();
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
            mo31477F1().sendCmd(BsLampService.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10887p(z));
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
            BsLampService j2 = mo31477F1();
            BsLampService.CmdKey cmdKey = BsLampService.CmdKey.nighttime;
            j2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C10891t(str, str2, i));
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
            mo31477F1().sendCmd(BsLampService.CmdKey.cfg_init_power, String.valueOf(i), new C10888q(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(BsLampService.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10880i(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23210U() {
        String U = super.mo23210U();
        return (U == null || U.isEmpty()) ? C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_bslamp) : super.mo23210U();
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42249l2(this.f20188A, this.f20189B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20190z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20187C, "Invalid handler!");
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
            mo31477F1().sendCmd(BsLampService.CmdKey.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10890s(this));
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
            mo31477F1().setPower(BsLampService.Power.off, new C10867a0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C10883l());
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
            mo31477F1().sendCmd(BsLampService.CmdKey.nighttime, z ? "enable" : "disable", new C10893v(z));
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
            mo31477F1().sendCmd(BsLampService.CmdKey.pseudo_beacon, "4097|" + i, new C10895x(this));
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
            BsLampService j2 = mo31477F1();
            BsLampService.CmdKey cmdKey = BsLampService.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            j2.sendCmd(cmdKey, sb2.toString(), new C10889r(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public BsLampService mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightBsLampDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(BsLampService.Power.on, new C10892u());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42249l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof BsLampService.C6387w0)) {
            AppUtils.m8300u(f20187C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (BsLampService.C6387w0) obj2);
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
            mo31477F1().openWithMode(BsLampService.Power.on, BsLampService.Effect.smooth, 500L, Long.valueOf((long) i), new C10894w(i));
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
        if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW) {
            List<C12043g.C12044a> o = mo23221d0().mo31605o();
            int[] iArr = new int[o.size()];
            for (int i = 0; i < o.size(); i++) {
                iArr[i] = o.get(i).mo42713a();
            }
            mo23157r1(o.get(0).mo42714b(), iArr, (int) j);
        } else {
            try {
                mo31477F1().setBright(Long.valueOf(j), BsLampService.Effect.smooth, 500L, new C10871c0(j));
            } catch (MiotException e) {
                e.printStackTrace();
            }
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
            mo31477F1().setRgb(Long.valueOf((long) i2), BsLampService.Effect.smooth, 500L, new C10875e0(i2));
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
            mo31477F1().start_cf(0L, 0L, sb.toString(), new C10877f0(iArr, i));
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
            mo31477F1().setCt(Long.valueOf((long) i), BsLampService.Effect.smooth, 500L, new C10873d0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C10879h(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C10881j(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20190z);
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
                AppUtils.m8300u("BATCH_RPC", "BsLampDevice, Invalid length of batch rpc result: " + str2);
            }
            m27731k2(BsLampService.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), jSONArray.getString(11), Long.valueOf(jSONArray.getLong(12)));
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
                mo31477F1().getProperties(new C10882k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C10866a(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C10868b(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C10870c(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C10872d(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35417B()) {
            try {
                mo31477F1().setScene("color", Long.valueOf((long) (sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) sVar.mo35439f()), new C10874e(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (sVar.mo35456w()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35444k()), Long.valueOf((long) sVar.mo35445l()), sVar.mo35447n(), new C10876f(sVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C10878g(sVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f20187C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("Hue").getInternalName(), mo31477F1().getService().getProperty("Sat").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("ColorMode").getInternalName(), mo31477F1().getService().getProperty("Rgb").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty("MiBandSleep").getInternalName()};
    }
}
