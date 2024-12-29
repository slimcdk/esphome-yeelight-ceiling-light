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
import com.yeelight.yeelib.device.xiaomi.Stripe6Service;
import com.yeelight.yeelib.device.xiaomi.YeelightStripe6Device;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import p207s3.C10333b;
import p227x3.C11969f;
import p227x3.C11972i;
import p232y3.C12041e;
import p232y3.C12043g;
import p232y3.C12048k;

/* renamed from: w3.i1 */
public class C11165i1 extends C10333b {

    /* renamed from: C */
    public static final String f20666C = C11842x0.class.getSimpleName();

    /* renamed from: A */
    CompletionHandler f20667A = new C11185q(this);

    /* renamed from: B */
    Stripe6Service.C8093y0 f20668B = new C11186r();

    /* renamed from: z */
    CompletionHandler f20669z = new C11184p(this);

    /* renamed from: w3.i1$a */
    class C11166a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20670a;

        C11166a(C8327s sVar) {
            this.f20670a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31557P0(this.f20670a);
        }
    }

    /* renamed from: w3.i1$a0 */
    class C11167a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20672a;

        C11167a0(long j) {
            this.f20672a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31600l0(this.f20672a);
        }
    }

    /* renamed from: w3.i1$b */
    class C11168b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20674a;

        C11168b(C8327s sVar) {
            this.f20674a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31557P0(this.f20674a);
        }
    }

    /* renamed from: w3.i1$b0 */
    class C11169b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20676a;

        C11169b0(int i) {
            this.f20676a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31602m0(this.f20676a);
        }
    }

    /* renamed from: w3.i1$c */
    class C11170c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20678a;

        C11170c(C8327s sVar) {
            this.f20678a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31557P0(this.f20678a);
        }
    }

    /* renamed from: w3.i1$c0 */
    class C11171c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f20680a;

        /* renamed from: b */
        final /* synthetic */ int f20681b;

        C11171c0(int[] iArr, int i) {
            this.f20680a = iArr;
            this.f20681b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f20680a) {
                arrayList.add(new C12043g.C12044a(aVar, this.f20681b));
            }
            C11165i1.this.mo23221d0().mo31604n0(arrayList);
        }
    }

    /* renamed from: w3.i1$d */
    class C11172d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20683a;

        C11172d(C8327s sVar) {
            this.f20683a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31557P0(this.f20683a);
        }
    }

    /* renamed from: w3.i1$e */
    class C11173e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20685a;

        C11173e(C8327s sVar) {
            this.f20685a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31557P0(this.f20685a);
        }
    }

    /* renamed from: w3.i1$f */
    class C11174f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20687a;

        C11174f(C8327s sVar) {
            this.f20687a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31557P0(this.f20687a);
        }
    }

    /* renamed from: w3.i1$g */
    class C11175g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20689a;

        C11175g(boolean z) {
            this.f20689a = z;
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("setLedIndicatorEnable --> onFailed: ");
            sb.append(str);
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31624x0(this.f20689a);
        }
    }

    /* renamed from: w3.i1$h */
    class C11176h implements CompletionHandler {
        C11176h(C11165i1 i1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.i1$i */
    class C11177i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20691a;

        C11177i(boolean z) {
            this.f20691a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31555O0(this.f20691a);
        }
    }

    /* renamed from: w3.i1$j */
    class C11178j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20693a;

        C11178j(boolean z) {
            this.f20693a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31583d(this.f20693a);
        }
    }

    /* renamed from: w3.i1$k */
    class C11179k implements CompletionHandler {
        C11179k(C11165i1 i1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.i1$l */
    class C11180l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20695a;

        C11180l(int i) {
            this.f20695a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31547K0(this.f20695a);
        }
    }

    /* renamed from: w3.i1$m */
    class C11181m implements CompletionHandler {
        C11181m(C11165i1 i1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.i1$n */
    class C11182n implements CompletionHandler {
        C11182n() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.i1$o */
    class C11183o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20698a;

        C11183o(int i) {
            this.f20698a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31551M0(true);
            C11165i1 i1Var = C11165i1.this;
            i1Var.mo23165w1(i1Var.mo23247j1(this.f20698a));
        }
    }

    /* renamed from: w3.i1$p */
    class C11184p implements CompletionHandler {
        C11184p(C11165i1 i1Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.i1$q */
    class C11185q implements CompletionHandler {
        C11185q(C11165i1 i1Var) {
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

    /* renamed from: w3.i1$r */
    class C11186r implements Stripe6Service.C8093y0 {
        C11186r() {
        }

        /* renamed from: a */
        public void mo34796a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11165i1.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo34797b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDelayOffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11165i1.this.mo23221d0().mo31611r(2) == null) {
                C11165i1.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11165i1.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo34798c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11165i1.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo34799d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            DeviceStatusBase d0 = C11165i1.this.mo23221d0();
            if (i != 0) {
                d0.mo31531C0(DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW);
            } else if (d0.mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW) {
                ((C12048k) C11165i1.this.mo23221d0()).mo42736b1();
            }
            C11165i1.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo34800e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11165i1.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo34801f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11165i1.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo34802g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11165i1.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo34803h(Stripe6Service.Power power) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerChanged: ");
            sb.append(power.name());
            int i = C11191w.f20703a[power.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    z = false;
                    C11165i1.this.mo23221d0().mo31551M0(false);
                } else {
                    return;
                }
            }
            C11165i1.this.mo23221d0().mo31551M0(z);
        }

        /* renamed from: i */
        public void mo34804i(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onIndicatorOnChanged = ");
            sb.append(l);
            C11165i1.this.mo23221d0().mo31624x0(l.longValue() == 1);
        }

        /* renamed from: j */
        public void mo34805j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRgbChanged: ");
            sb.append(l);
            C11165i1.this.mo23221d0().mo31602m0(l.intValue());
        }

        /* renamed from: k */
        public void mo34806k(Long l) {
            C11165i1.this.mo23221d0().mo31608p0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo34807l(Long l) {
            DeviceStatusBase d0;
            DeviceStatusBase.DeviceMode deviceMode;
            StringBuilder sb = new StringBuilder();
            sb.append("onColorModeChanged: ");
            sb.append(l);
            if (l.longValue() == 1) {
                d0 = C11165i1.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C11165i1.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C11165i1.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo31531C0(deviceMode);
        }

        /* renamed from: m */
        public void mo34808m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onMusicEnableChanged = ");
            sb.append(l);
            C11165i1.this.mo23221d0().mo31593i(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo34809n(Long l) {
            C11165i1.this.mo23221d0().mo31606o0((long) l.intValue());
        }
    }

    /* renamed from: w3.i1$s */
    class C11187s implements CompletionHandler {
        C11187s(C11165i1 i1Var) {
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

    /* renamed from: w3.i1$t */
    class C11188t implements CompletionHandler {
        C11188t(C11165i1 i1Var) {
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

    /* renamed from: w3.i1$u */
    class C11189u implements WifiDeviceBase.C6080i {
        C11189u() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11165i1.this.f20668B.mo34796a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
            C11165i1.this.f20668B.mo34805j(l);
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
            C11165i1.this.f20668B.mo34807l(l);
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C11165i1.this.f20668B.mo34803h(Stripe6Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.i1$v */
    class C11190v implements Stripe6Service.C8083t0 {
        C11190v() {
        }

        /* renamed from: a */
        public void mo34786a(Stripe6Service.Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, Long l11, Long l12) {
            Long l13 = l11;
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power != null ? power.name() : "null");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rgb: ");
            Long l14 = l6;
            sb2.append(l14);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bright: ");
            Long l15 = l;
            sb3.append(l15);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("mode: ");
            Long l16 = l5;
            sb4.append(l16);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("flowing: ");
            Long l17 = l4;
            sb5.append(l17);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("hue: ");
            Long l18 = l2;
            sb6.append(l18);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("sat: ");
            Long l19 = l3;
            sb7.append(l19);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("delayoff: ");
            Long l20 = l7;
            sb8.append(l20);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("musicEnable: ");
            sb9.append(l13);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("lanMode: ");
            Long l21 = l9;
            sb10.append(l21);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("onFromPower: ");
            Long l22 = l10;
            sb11.append(l22);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("saveState: ");
            Long l23 = l8;
            sb12.append(l23);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("flowParams: ");
            String str2 = str;
            sb13.append(str2);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("indicatorOn: ");
            Long l24 = l12;
            sb14.append(l24);
            StringBuilder sb15 = new StringBuilder();
            sb15.append("music_mode: ");
            sb15.append(l13);
            C11165i1.this.m28449k2(power, l15, l18, l19, l17, l16, l14, l20, l23, str2, l21, l22, l11, l24);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.i1$w */
    static /* synthetic */ class C11191w {

        /* renamed from: a */
        static final /* synthetic */ int[] f20703a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Stripe6Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20703a = r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Stripe6Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20703a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Stripe6Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11165i1.C11191w.<clinit>():void");
        }
    }

    /* renamed from: w3.i1$x */
    class C11192x implements CompletionHandler {
        C11192x() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.i1$y */
    class C11193y implements CompletionHandler {
        C11193y() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.i1$z */
    class C11194z implements CompletionHandler {
        C11194z() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11165i1.this.mo23221d0().mo31567U0();
        }
    }

    public C11165i1(String str, String str2, String str3, Device.Ownership ownership) {
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
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: k2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m28449k2(com.yeelight.yeelib.device.xiaomi.Stripe6Service.Power r11, java.lang.Long r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.String r20, java.lang.Long r21, java.lang.Long r22, java.lang.Long r23, java.lang.Long r24) {
        /*
            r10 = this;
            r0 = r11
            r1 = 2
            r2 = 1
            if (r15 == 0) goto L_0x0015
            int r3 = r15.intValue()
            if (r3 != r2) goto L_0x0015
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW
        L_0x0011:
            r3.mo31531C0(r4)
            goto L_0x0030
        L_0x0015:
            if (r16 == 0) goto L_0x0030
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            int r4 = r16.intValue()
            if (r4 != r2) goto L_0x0024
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR
            goto L_0x0011
        L_0x0024:
            int r4 = r16.intValue()
            if (r4 != r1) goto L_0x002d
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE
            goto L_0x0011
        L_0x002d:
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV
            goto L_0x0011
        L_0x0030:
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            long r4 = r15.longValue()
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
            if (r17 == 0) goto L_0x0052
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            int r4 = r17.intValue()
            r3.mo31602m0(r4)
        L_0x0052:
            if (r12 == 0) goto L_0x005f
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            long r4 = r12.longValue()
            r3.mo31600l0(r4)
        L_0x005f:
            if (r0 == 0) goto L_0x006f
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            com.yeelight.yeelib.device.xiaomi.Stripe6Service$Power r4 = com.yeelight.yeelib.device.xiaomi.Stripe6Service.Power.on
            if (r0 != r4) goto L_0x006b
            r0 = 1
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            r3.mo31551M0(r0)
        L_0x006f:
            if (r13 == 0) goto L_0x007c
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            long r3 = r13.longValue()
            r0.mo31606o0(r3)
        L_0x007c:
            if (r14 == 0) goto L_0x0089
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            long r3 = r14.longValue()
            r0.mo31608p0(r3)
        L_0x0089:
            if (r22 == 0) goto L_0x0096
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            int r3 = r22.intValue()
            r0.mo31547K0(r3)
        L_0x0096:
            if (r18 == 0) goto L_0x00c6
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.mo31611r(r1)
            if (r0 != 0) goto L_0x00bb
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            y3.e r1 = new y3.e
            int r3 = r18.intValue()
            int r4 = r18.intValue()
            r1.<init>(r3, r4)
            r0.mo31577a(r1)
            goto L_0x00c6
        L_0x00bb:
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            int r1 = r18.intValue()
            r0.mo31573X0(r1)
        L_0x00c6:
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            r3 = 1
            if (r19 == 0) goto L_0x00d8
            long r5 = r19.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00d8
            r1 = 1
            goto L_0x00d9
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            r0.mo31555O0(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            if (r21 == 0) goto L_0x00ec
            long r5 = r21.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00ec
            r1 = 1
            goto L_0x00ed
        L_0x00ec:
            r1 = 0
        L_0x00ed:
            r0.mo31583d(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            if (r23 == 0) goto L_0x0100
            long r5 = r23.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0100
            r1 = 1
            goto L_0x0101
        L_0x0100:
            r1 = 0
        L_0x0101:
            r0.mo31593i(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            if (r24 == 0) goto L_0x0113
            long r5 = r24.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r2 = 0
        L_0x0114:
            r0.mo31624x0(r2)
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x0128
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            com.yeelight.yeelib.models.a r1 = com.yeelight.yeelib.models.C8308a.m19688b(r20)
            r0.mo31616t0(r1)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223w3.C11165i1.m28449k2(com.yeelight.yeelib.device.xiaomi.Stripe6Service$Power, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long):void");
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11194z());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo31474C1() {
        try {
            mo31477F1().disableMusic(0L, new C11188t(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo31476E1(String str, int i) {
        try {
            mo31477F1().enableMusic(1L, str, Long.valueOf((long) i), new C11187s(this));
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

    /* renamed from: J0 */
    public void mo23191J0(C11969f fVar) {
        super.mo23191J0(fVar);
        mo23201P0(C11972i.m30710h(this.f4736a, this));
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11189u();
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
            mo31477F1().sendCmd(Stripe6Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11178j(z));
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
            mo31477F1().sendCmd(Stripe6Service.CmdKey.cfg_init_power, String.valueOf(i), new C11180l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Stripe6Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11177i(z));
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
        return mo42300l2(this.f20667A, this.f20668B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20669z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20666C, "Invalid handler!");
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
        return false;
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        if (super.mo23140b1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Stripe6Service.Power.off, new C11193y());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11182n());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: f2 */
    public boolean mo41885f2(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendRemoteKey --> Invoke, enable : ");
        sb.append(i);
        try {
            mo31477F1().sendCmd(Stripe6Service.CmdKey.pseudo_beacon, "4097|" + i, new C11179k(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Stripe6Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightStripe6Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Stripe6Service.Power.on, new C11192x());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42300l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Stripe6Service.C8093y0)) {
            AppUtils.m8300u(f20666C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Stripe6Service.C8093y0) obj2);
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
            mo31477F1().openWithMode(Stripe6Service.Power.on, Stripe6Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11183o(i));
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
            mo31477F1().setBright(Long.valueOf(j), Stripe6Service.Effect.smooth, 500L, new C11167a0(j));
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
            mo31477F1().setRgb(Long.valueOf((long) i2), Stripe6Service.Effect.smooth, 500L, new C11169b0(i2));
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
            mo31477F1().start_cf(0L, 0L, sb.toString(), new C11171c0(iArr, i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11176h(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11181m(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20669z);
    }

    /* renamed from: v1 */
    public boolean mo23249v1(boolean z) {
        try {
            mo31477F1().setLEDIndicator(z ? Stripe6Service.IndicatorParams.on : Stripe6Service.IndicatorParams.off, new C11175g(z));
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
            if (jSONArray.length() != 14) {
                AppUtils.m8300u("BATCH_RPC", "StripDevice, Invalid length of batch rpc result: " + str2);
            }
            Stripe6Service.Power valueOf = Stripe6Service.Power.valueOf(jSONArray.getString(0));
            Long valueOf2 = Long.valueOf(jSONArray.getLong(1));
            Long valueOf3 = Long.valueOf(jSONArray.getLong(2));
            Long valueOf4 = Long.valueOf(jSONArray.getLong(3));
            Long valueOf5 = Long.valueOf(jSONArray.getLong(4));
            Long valueOf6 = Long.valueOf(jSONArray.getLong(5));
            Long valueOf7 = Long.valueOf(jSONArray.getLong(6));
            Long valueOf8 = Long.valueOf(jSONArray.getLong(7));
            Long valueOf9 = Long.valueOf(jSONArray.getLong(8));
            String string = jSONArray.getString(9);
            Long valueOf10 = Long.valueOf(jSONArray.getLong(10));
            long j = 0L;
            if (!jSONArray.getString(11).isEmpty()) {
                j = Long.valueOf(jSONArray.getLong(11));
            }
            m28449k2(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, string, valueOf10, j, Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)));
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
            mo31477F1().getProperties(new C11190v());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11166a(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11168b(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11170c(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11172d(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35417B()) {
            try {
                mo31477F1().setScene("color", Long.valueOf((long) (sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) sVar.mo35439f()), new C11173e(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (sVar.mo35456w()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35444k()), Long.valueOf((long) sVar.mo35445l()), sVar.mo35447n(), new C11174f(sVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str = f20666C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Hue").getInternalName(), mo31477F1().getService().getProperty("Sat").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("ColorMode").getInternalName(), mo31477F1().getService().getProperty("Rgb").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("MusicEnable").getInternalName(), mo31477F1().getService().getProperty("IndicatorOn").getInternalName()};
    }
}
