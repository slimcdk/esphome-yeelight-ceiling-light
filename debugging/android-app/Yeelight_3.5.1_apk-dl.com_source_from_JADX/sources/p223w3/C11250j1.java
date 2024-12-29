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
import com.yeelight.yeelib.device.xiaomi.StripeService;
import com.yeelight.yeelib.device.xiaomi.YeelightStripeDevice;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import p232y3.C12041e;
import p232y3.C12043g;
import p232y3.C12048k;

/* renamed from: w3.j1 */
public class C11250j1 extends WifiDeviceBase {

    /* renamed from: C */
    public static final String f20791C = C11842x0.class.getSimpleName();

    /* renamed from: A */
    CompletionHandler f20792A = new C11270q(this);

    /* renamed from: B */
    StripeService.C8100b1 f20793B = new C11271r();

    /* renamed from: z */
    CompletionHandler f20794z = new C11269p(this);

    /* renamed from: w3.j1$a */
    class C11251a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20795a;

        C11251a(C8327s sVar) {
            this.f20795a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31557P0(this.f20795a);
        }
    }

    /* renamed from: w3.j1$a0 */
    class C11252a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20797a;

        C11252a0(int i) {
            this.f20797a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31610q0(this.f20797a);
        }
    }

    /* renamed from: w3.j1$b */
    class C11253b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20799a;

        C11253b(C8327s sVar) {
            this.f20799a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31557P0(this.f20799a);
        }
    }

    /* renamed from: w3.j1$b0 */
    class C11254b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20801a;

        C11254b0(int i) {
            this.f20801a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31602m0(this.f20801a);
        }
    }

    /* renamed from: w3.j1$c */
    class C11255c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20803a;

        C11255c(C8327s sVar) {
            this.f20803a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31557P0(this.f20803a);
        }
    }

    /* renamed from: w3.j1$c0 */
    class C11256c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f20805a;

        /* renamed from: b */
        final /* synthetic */ int f20806b;

        C11256c0(int[] iArr, int i) {
            this.f20805a = iArr;
            this.f20806b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f20805a) {
                arrayList.add(new C12043g.C12044a(aVar, this.f20806b));
            }
            C11250j1.this.mo23221d0().mo31604n0(arrayList);
        }
    }

    /* renamed from: w3.j1$d */
    class C11257d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20808a;

        C11257d(C8327s sVar) {
            this.f20808a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31557P0(this.f20808a);
        }
    }

    /* renamed from: w3.j1$e */
    class C11258e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20810a;

        C11258e(C8327s sVar) {
            this.f20810a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31557P0(this.f20810a);
        }
    }

    /* renamed from: w3.j1$f */
    class C11259f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20812a;

        C11259f(C8327s sVar) {
            this.f20812a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31557P0(this.f20812a);
        }
    }

    /* renamed from: w3.j1$g */
    class C11260g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20814a;

        C11260g(boolean z) {
            this.f20814a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31624x0(this.f20814a);
        }
    }

    /* renamed from: w3.j1$h */
    class C11261h implements CompletionHandler {
        C11261h(C11250j1 j1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.j1$i */
    class C11262i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20816a;

        C11262i(boolean z) {
            this.f20816a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31555O0(this.f20816a);
        }
    }

    /* renamed from: w3.j1$j */
    class C11263j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20818a;

        C11263j(boolean z) {
            this.f20818a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31583d(this.f20818a);
        }
    }

    /* renamed from: w3.j1$k */
    class C11264k implements StripeService.C8142w0 {
        C11264k() {
        }

        /* renamed from: a */
        public void mo34885a(StripeService.Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, String str, Long l10, Long l11, Long l12, Long l13) {
            Long l14 = l12;
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power != null ? power.name() : "null");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ct: ");
            Long l15 = l2;
            sb2.append(l15);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("rgb: ");
            Long l16 = l7;
            sb3.append(l16);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("bright: ");
            Long l17 = l;
            sb4.append(l17);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("mode: ");
            Long l18 = l6;
            sb5.append(l18);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowing: ");
            Long l19 = l5;
            sb6.append(l19);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("hue: ");
            Long l20 = l3;
            sb7.append(l20);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("sat: ");
            Long l21 = l4;
            sb8.append(l21);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("delayoff: ");
            Long l22 = l8;
            sb9.append(l22);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("musicEnable: ");
            sb10.append(l14);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("lanMode: ");
            Long l23 = l10;
            sb11.append(l23);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("onFromPower: ");
            Long l24 = l11;
            sb12.append(l24);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("saveState: ");
            Long l25 = l9;
            sb13.append(l25);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("flowParams: ");
            String str2 = str;
            sb14.append(str2);
            StringBuilder sb15 = new StringBuilder();
            sb15.append("indicatorOn: ");
            Long l26 = l13;
            sb15.append(l26);
            StringBuilder sb16 = new StringBuilder();
            sb16.append("music_mode: ");
            sb16.append(l14);
            C11250j1.this.m28624Z1(power, l17, l15, l20, l21, l19, l18, l16, l22, l25, str2, l23, l24, l12, l26);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.j1$l */
    class C11265l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20821a;

        C11265l(int i) {
            this.f20821a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31547K0(this.f20821a);
        }
    }

    /* renamed from: w3.j1$m */
    class C11266m implements CompletionHandler {
        C11266m(C11250j1 j1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.j1$n */
    class C11267n implements CompletionHandler {
        C11267n() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.j1$o */
    class C11268o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20824a;

        C11268o(int i) {
            this.f20824a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31551M0(true);
            C11250j1 j1Var = C11250j1.this;
            j1Var.mo23165w1(j1Var.mo23247j1(this.f20824a));
        }
    }

    /* renamed from: w3.j1$p */
    class C11269p implements CompletionHandler {
        C11269p(C11250j1 j1Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.j1$q */
    class C11270q implements CompletionHandler {
        C11270q(C11250j1 j1Var) {
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

    /* renamed from: w3.j1$r */
    class C11271r implements StripeService.C8100b1 {
        C11271r() {
        }

        /* renamed from: a */
        public void mo34848a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11250j1.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo34849b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDelayOffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11250j1.this.mo23221d0().mo31611r(2) == null) {
                C11250j1.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11250j1.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo34850c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11250j1.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo34851d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            DeviceStatusBase d0 = C11250j1.this.mo23221d0();
            if (i != 0) {
                d0.mo31531C0(DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW);
            } else if (d0.mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW) {
                ((C12048k) C11250j1.this.mo23221d0()).mo42736b1();
            }
            C11250j1.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo34852e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11250j1.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo34853f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11250j1.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo34854g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11250j1.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo34855h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C11250j1.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo34856i(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onIndicatorOnChanged = ");
            sb.append(l);
            C11250j1.this.mo23221d0().mo31624x0(l.longValue() == 1);
        }

        /* renamed from: j */
        public void mo34857j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRgbChanged: ");
            sb.append(l);
            C11250j1.this.mo23221d0().mo31602m0(l.intValue());
        }

        /* renamed from: k */
        public void mo34858k(Long l) {
            C11250j1.this.mo23221d0().mo31608p0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo34859l(Long l) {
            DeviceStatusBase d0;
            DeviceStatusBase.DeviceMode deviceMode;
            StringBuilder sb = new StringBuilder();
            sb.append("onColorModeChanged: ");
            sb.append(l);
            if (l.longValue() == 1) {
                d0 = C11250j1.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C11250j1.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C11250j1.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo31531C0(deviceMode);
        }

        /* renamed from: m */
        public void mo34860m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onMusicEnableChanged = ");
            sb.append(l);
            C11250j1.this.mo23221d0().mo31593i(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo34861n(Long l) {
            C11250j1.this.mo23221d0().mo31606o0((long) l.intValue());
        }

        /* renamed from: o */
        public void mo34862o(StripeService.Power power) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerChanged: ");
            sb.append(power.name());
            int i = C11276w.f20829a[power.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    z = false;
                    C11250j1.this.mo23221d0().mo31551M0(false);
                } else {
                    return;
                }
            }
            C11250j1.this.mo23221d0().mo31551M0(z);
        }
    }

    /* renamed from: w3.j1$s */
    class C11272s implements CompletionHandler {
        C11272s(C11250j1 j1Var) {
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

    /* renamed from: w3.j1$t */
    class C11273t implements CompletionHandler {
        C11273t(C11250j1 j1Var) {
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

    /* renamed from: w3.j1$u */
    class C11274u implements WifiDeviceBase.C6080i {
        C11274u() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11250j1.this.f20793B.mo34848a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11250j1.this.f20793B.mo34855h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
            C11250j1.this.f20793B.mo34857j(l);
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
            C11250j1.this.f20793B.mo34859l(l);
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C11250j1.this.f20793B.mo34862o(StripeService.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.j1$v */
    class C11275v implements CompletionHandler {
        C11275v() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.j1$w */
    static /* synthetic */ class C11276w {

        /* renamed from: a */
        static final /* synthetic */ int[] f20829a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.StripeService$Power[] r0 = com.yeelight.yeelib.device.xiaomi.StripeService.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20829a = r0
                com.yeelight.yeelib.device.xiaomi.StripeService$Power r1 = com.yeelight.yeelib.device.xiaomi.StripeService.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20829a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.StripeService$Power r1 = com.yeelight.yeelib.device.xiaomi.StripeService.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11250j1.C11276w.<clinit>():void");
        }
    }

    /* renamed from: w3.j1$x */
    class C11277x implements CompletionHandler {
        C11277x() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.j1$y */
    class C11278y implements CompletionHandler {
        C11278y() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.j1$z */
    class C11279z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20832a;

        C11279z(long j) {
            this.f20832a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11250j1.this.mo23221d0().mo31600l0(this.f20832a);
        }
    }

    public C11250j1(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m28624Z1(com.yeelight.yeelib.device.xiaomi.StripeService.Power r11, java.lang.Long r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.Long r20, java.lang.String r21, java.lang.Long r22, java.lang.Long r23, java.lang.Long r24, java.lang.Long r25) {
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
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            long r4 = r16.longValue()
            r6 = 0
            r8 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0041
            r4 = 1
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            r3.mo31618u0(r4)
            if (r18 == 0) goto L_0x0052
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            int r4 = r18.intValue()
            r3.mo31602m0(r4)
        L_0x0052:
            if (r12 == 0) goto L_0x005f
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            long r4 = r12.longValue()
            r3.mo31600l0(r4)
        L_0x005f:
            if (r13 == 0) goto L_0x006c
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            int r4 = r13.intValue()
            r3.mo31610q0(r4)
        L_0x006c:
            if (r0 == 0) goto L_0x007c
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            com.yeelight.yeelib.device.xiaomi.StripeService$Power r4 = com.yeelight.yeelib.device.xiaomi.StripeService.Power.on
            if (r0 != r4) goto L_0x0078
            r0 = 1
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            r3.mo31551M0(r0)
        L_0x007c:
            if (r14 == 0) goto L_0x0089
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            long r3 = r14.longValue()
            r0.mo31606o0(r3)
        L_0x0089:
            if (r15 == 0) goto L_0x0096
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            long r3 = r15.longValue()
            r0.mo31608p0(r3)
        L_0x0096:
            if (r23 == 0) goto L_0x00a3
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            int r3 = r23.intValue()
            r0.mo31547K0(r3)
        L_0x00a3:
            if (r19 == 0) goto L_0x00d3
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.mo31611r(r1)
            if (r0 != 0) goto L_0x00c8
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            y3.e r1 = new y3.e
            int r3 = r19.intValue()
            int r4 = r19.intValue()
            r1.<init>(r3, r4)
            r0.mo31577a(r1)
            goto L_0x00d3
        L_0x00c8:
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            int r1 = r19.intValue()
            r0.mo31573X0(r1)
        L_0x00d3:
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            r3 = 1
            if (r20 == 0) goto L_0x00e5
            long r5 = r20.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00e5
            r1 = 1
            goto L_0x00e6
        L_0x00e5:
            r1 = 0
        L_0x00e6:
            r0.mo31555O0(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            if (r22 == 0) goto L_0x00f9
            long r5 = r22.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00f9
            r1 = 1
            goto L_0x00fa
        L_0x00f9:
            r1 = 0
        L_0x00fa:
            r0.mo31583d(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            if (r24 == 0) goto L_0x010d
            long r5 = r24.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x010d
            r1 = 1
            goto L_0x010e
        L_0x010d:
            r1 = 0
        L_0x010e:
            r0.mo31593i(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            if (r25 == 0) goto L_0x0120
            long r5 = r25.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0120
            goto L_0x0121
        L_0x0120:
            r2 = 0
        L_0x0121:
            r0.mo31624x0(r2)
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x0135
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            com.yeelight.yeelib.models.a r1 = com.yeelight.yeelib.models.C8308a.m19688b(r21)
            r0.mo31616t0(r1)
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223w3.C11250j1.m28624Z1(com.yeelight.yeelib.device.xiaomi.StripeService$Power, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long):void");
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11278y());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo31474C1() {
        try {
            mo31477F1().disableMusic(0L, new C11273t(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo31476E1(String str, int i) {
        try {
            mo31477F1().enableMusic(1L, str, Long.valueOf((long) i), new C11272s(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_pitaya_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_pitaya_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11274u();
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
            mo31477F1().sendCmd(StripeService.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11263j(z));
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
            mo31477F1().sendCmd(StripeService.CmdKey.cfg_init_power, String.valueOf(i), new C11265l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(StripeService.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11262i(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23210U() {
        String U = super.mo23210U();
        return (U == null || U.isEmpty()) ? C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_strip) : super.mo23210U();
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42306a2(this.f20792A, this.f20793B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20794z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20791C, "Invalid handler!");
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
    public StripeService mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightStripeDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo42306a2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof StripeService.C8100b1)) {
            AppUtils.m8300u(f20791C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (StripeService.C8100b1) obj2);
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
            mo31477F1().setPower(StripeService.Power.off, new C11277x());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11267n());
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
            mo31477F1().setPower(StripeService.Power.on, new C11275v());
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
            mo31477F1().openWithMode(StripeService.Power.on, StripeService.Effect.smooth, 500L, Long.valueOf((long) i), new C11268o(i));
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
            mo31477F1().setBright(Long.valueOf(j), StripeService.Effect.smooth, 500L, new C11279z(j));
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
            mo31477F1().setRgb(Long.valueOf((long) i2), StripeService.Effect.smooth, 500L, new C11254b0(i2));
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
            mo31477F1().start_cf(0L, 0L, sb.toString(), new C11256c0(iArr, i));
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
            mo31477F1().setCt(Long.valueOf((long) i), StripeService.Effect.smooth, 500L, new C11252a0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11261h(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11266m(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20794z);
    }

    /* renamed from: v1 */
    public boolean mo23249v1(boolean z) {
        try {
            mo31477F1().setLEDIndicator(z ? StripeService.IndicatorParams.on : StripeService.IndicatorParams.off, new C11260g(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        String str2 = str;
        try {
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() != 15) {
                AppUtils.m8300u("BATCH_RPC", "StripDevice, Invalid length of batch rpc result: " + str2);
            }
            m28624Z1(StripeService.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), jSONArray.getString(10), Long.valueOf(jSONArray.getLong(11)), !jSONArray.getString(12).isEmpty() ? Long.valueOf(jSONArray.getLong(12)) : 0L, Long.valueOf(jSONArray.getLong(13)), Long.valueOf(jSONArray.getLong(14)));
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
        if (this.f4749n.getOwnership() != Device.Ownership.MINE && this.f4749n.getOwnership() != Device.Ownership.OTHERS) {
            return false;
        }
        try {
            mo31477F1().getProperties(new C11264k());
            return false;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        if (super.mo23168x1(sVar)) {
            return true;
        }
        if (sVar.mo35455v()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11251a(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11253b(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11255c(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11257d(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35417B()) {
            try {
                mo31477F1().setScene("color", Long.valueOf((long) (sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) sVar.mo35439f()), new C11258e(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (sVar.mo35456w()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35444k()), Long.valueOf((long) sVar.mo35445l()), sVar.mo35447n(), new C11259f(sVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str = f20791C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("Hue").getInternalName(), mo31477F1().getService().getProperty("Sat").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("ColorMode").getInternalName(), mo31477F1().getService().getProperty("Rgb").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("MusicEnable").getInternalName(), mo31477F1().getService().getProperty("IndicatorOn").getInternalName()};
    }
}
