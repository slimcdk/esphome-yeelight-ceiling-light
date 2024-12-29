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
import com.yeelight.yeelib.device.xiaomi.BsLamp3Service;
import com.yeelight.yeelib.device.xiaomi.YeelightBsLamp3Device;
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

/* renamed from: w3.e */
public class C10803e extends C10333b {

    /* renamed from: C */
    public static final String f20088C = "e";

    /* renamed from: A */
    CompletionHandler f20089A = new C10825n(this);

    /* renamed from: B */
    BsLamp3Service.C6295c1 f20090B = new C10826o();

    /* renamed from: z */
    CompletionHandler f20091z = new C10824m(this);

    /* renamed from: w3.e$a */
    class C10804a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20092a;

        C10804a(C8327s sVar) {
            this.f20092a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31557P0(this.f20092a);
        }
    }

    /* renamed from: w3.e$a0 */
    class C10805a0 implements WifiDeviceBase.C6080i {
        C10805a0() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C10803e.this.f20090B.mo32109a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C10803e.this.f20090B.mo32115h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
            C10803e.this.f20090B.mo32117j(l);
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
            C10803e.this.f20090B.mo32119l(l);
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C10803e.this.f20090B.mo32123p(BsLamp3Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.e$b */
    class C10806b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20095a;

        C10806b(C8327s sVar) {
            this.f20095a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31557P0(this.f20095a);
        }
    }

    /* renamed from: w3.e$b0 */
    static /* synthetic */ class C10807b0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20097a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.BsLamp3Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20097a = r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$Power r1 = com.yeelight.yeelib.device.xiaomi.BsLamp3Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20097a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$Power r1 = com.yeelight.yeelib.device.xiaomi.BsLamp3Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C10803e.C10807b0.<clinit>():void");
        }
    }

    /* renamed from: w3.e$c */
    class C10808c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20098a;

        C10808c(C8327s sVar) {
            this.f20098a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31557P0(this.f20098a);
        }
    }

    /* renamed from: w3.e$c0 */
    class C10809c0 implements CompletionHandler {
        C10809c0() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.e$d */
    class C10810d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20101a;

        C10810d(C8327s sVar) {
            this.f20101a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31557P0(this.f20101a);
        }
    }

    /* renamed from: w3.e$d0 */
    class C10811d0 implements CompletionHandler {
        C10811d0() {
        }

        public void onFailed(int i, String str) {
            String.format("BsLampDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.e$e */
    class C10812e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20104a;

        C10812e(C8327s sVar) {
            this.f20104a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31557P0(this.f20104a);
        }
    }

    /* renamed from: w3.e$e0 */
    class C10813e0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20106a;

        C10813e0(long j) {
            this.f20106a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31600l0(this.f20106a);
        }
    }

    /* renamed from: w3.e$f */
    class C10814f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20108a;

        C10814f(C8327s sVar) {
            this.f20108a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31557P0(this.f20108a);
        }
    }

    /* renamed from: w3.e$f0 */
    class C10815f0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20110a;

        C10815f0(int i) {
            this.f20110a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31610q0(this.f20110a);
        }
    }

    /* renamed from: w3.e$g */
    class C10816g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20112a;

        C10816g(C8327s sVar) {
            this.f20112a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31557P0(this.f20112a);
        }
    }

    /* renamed from: w3.e$g0 */
    class C10817g0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20114a;

        C10817g0(int i) {
            this.f20114a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31602m0(this.f20114a);
        }
    }

    /* renamed from: w3.e$h */
    class C10818h implements CompletionHandler {
        C10818h(C10803e eVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.e$h0 */
    class C10819h0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f20116a;

        /* renamed from: b */
        final /* synthetic */ int f20117b;

        C10819h0(int[] iArr, int i) {
            this.f20116a = iArr;
            this.f20117b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f20116a) {
                arrayList.add(new C12043g.C12044a(aVar, this.f20117b));
            }
            C10803e.this.mo23221d0().mo31604n0(arrayList);
        }
    }

    /* renamed from: w3.e$i */
    class C10820i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20119a;

        C10820i(boolean z) {
            this.f20119a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31555O0(this.f20119a);
        }
    }

    /* renamed from: w3.e$j */
    class C10821j implements CompletionHandler {
        C10821j(C10803e eVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.e$k */
    class C10822k implements BsLamp3Service.C6339y0 {
        C10822k() {
        }

        /* renamed from: a */
        public void mo32148a(BsLamp3Service.Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, Long l11, String str2, Long l12) {
            StringBuilder sb = new StringBuilder();
            sb.append("mode: ");
            sb.append(l6);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rgb: ");
            Long l13 = l7;
            sb2.append(l13);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bright: ");
            Long l14 = l;
            sb3.append(l14);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("lanMode: ");
            Long l15 = l9;
            sb4.append(l15);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("flowing: ");
            Long l16 = l5;
            sb5.append(l16);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("ct: ");
            Long l17 = l2;
            sb6.append(l17);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("power: ");
            sb7.append(power.name());
            StringBuilder sb8 = new StringBuilder();
            sb8.append("hue: ");
            Long l18 = l3;
            sb8.append(l18);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("sat: ");
            Long l19 = l4;
            sb9.append(l19);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("delayoff: ");
            Long l20 = l8;
            sb10.append(l20);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("flowParams: ");
            String str3 = str;
            sb11.append(str3);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("music_mode: ");
            Long l21 = l11;
            sb12.append(l21);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("nightTimeInfo : ");
            sb13.append(str2);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("saveState: ");
            sb14.append(l10);
            StringBuilder sb15 = new StringBuilder();
            sb15.append("knockEnable: ");
            sb15.append(l12);
            C10803e.this.m27567k2(power, l14, l17, l18, l19, l16, l6, l13, l20, str3, l15, l10, l21, str2, l12);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.e$l */
    class C10823l implements CompletionHandler {
        C10823l() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.e$m */
    class C10824m implements CompletionHandler {
        C10824m(C10803e eVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.e$n */
    class C10825n implements CompletionHandler {
        C10825n(C10803e eVar) {
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

    /* renamed from: w3.e$o */
    class C10826o implements BsLamp3Service.C6295c1 {
        C10826o() {
        }

        /* renamed from: a */
        public void mo32109a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C10803e.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo32110b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDelayOffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C10803e.this.mo23221d0().mo31611r(2) == null) {
                C10803e.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C10803e.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo32111c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C10803e.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo32112d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            DeviceStatusBase d0 = C10803e.this.mo23221d0();
            if (i != 0) {
                d0.mo31531C0(DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW);
            } else if (d0.mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW) {
                ((C12048k) C10803e.this.mo23221d0()).mo42736b1();
            }
            C10803e.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo32113e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C10803e.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: g */
        public void mo32114g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C10803e.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo32115h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C10803e.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo32116i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C10803e.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C10803e.this.mo23221d0().mo31543I0(true);
                }
                C10803e.this.mo23221d0().mo31541H0(split[1]);
                C10803e.this.mo23221d0().mo31539G0(split[2]);
                C10803e.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C10803e.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C10803e.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C10803e.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo32117j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRgbChanged: ");
            sb.append(l);
            C10803e.this.mo23221d0().mo31602m0(l.intValue());
        }

        /* renamed from: k */
        public void mo32118k(Long l) {
            C10803e.this.mo23221d0().mo31608p0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo32119l(Long l) {
            DeviceStatusBase d0;
            DeviceStatusBase.DeviceMode deviceMode;
            StringBuilder sb = new StringBuilder();
            sb.append("onColorModeChanged: ");
            sb.append(l);
            if (l.longValue() == 1) {
                d0 = C10803e.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C10803e.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C10803e.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo31531C0(deviceMode);
        }

        /* renamed from: m */
        public void mo32120m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onMusicEnableChanged = ");
            sb.append(l);
            C10803e.this.mo23221d0().mo31593i(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo32121n(Long l) {
            C10803e.this.mo23221d0().mo31606o0((long) l.intValue());
        }

        /* renamed from: o */
        public void mo32122o(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onKnockEnableChanged =");
            sb.append(l);
            C10803e.this.mo23221d0().mo31585e(l != null && l.longValue() == 1);
        }

        /* renamed from: p */
        public void mo32123p(BsLamp3Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerChanged: ");
            sb.append(power.name());
            int i = C10807b0.f20097a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C10803e.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C10803e.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }
    }

    /* renamed from: w3.e$p */
    class C10827p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20124a;

        C10827p(boolean z) {
            this.f20124a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31583d(this.f20124a);
        }
    }

    /* renamed from: w3.e$q */
    class C10828q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20126a;

        C10828q(int i) {
            this.f20126a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31547K0(this.f20126a);
        }
    }

    /* renamed from: w3.e$r */
    class C10829r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20128a;

        /* renamed from: b */
        final /* synthetic */ String f20129b;

        /* renamed from: c */
        final /* synthetic */ String f20130c;

        /* renamed from: d */
        final /* synthetic */ int f20131d;

        C10829r(boolean z, String str, String str2, int i) {
            this.f20128a = z;
            this.f20129b = str;
            this.f20130c = str2;
            this.f20131d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31543I0(this.f20128a);
            C10803e.this.mo23221d0().mo31541H0(this.f20129b);
            C10803e.this.mo23221d0().mo31539G0(this.f20130c);
            C10803e.this.mo23221d0().mo31537F0(this.f20131d);
        }
    }

    /* renamed from: w3.e$s */
    class C10830s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20133a;

        C10830s(boolean z) {
            this.f20133a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31585e(this.f20133a);
        }
    }

    /* renamed from: w3.e$t */
    class C10831t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f20135a;

        /* renamed from: b */
        final /* synthetic */ String f20136b;

        /* renamed from: c */
        final /* synthetic */ int f20137c;

        C10831t(String str, String str2, int i) {
            this.f20135a = str;
            this.f20136b = str2;
            this.f20137c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31541H0(this.f20135a);
            C10803e.this.mo23221d0().mo31539G0(this.f20136b);
            C10803e.this.mo23221d0().mo31537F0(this.f20137c);
        }
    }

    /* renamed from: w3.e$u */
    class C10832u implements CompletionHandler {
        C10832u() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.e$v */
    class C10833v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20140a;

        C10833v(boolean z) {
            this.f20140a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31543I0(this.f20140a);
        }
    }

    /* renamed from: w3.e$w */
    class C10834w implements CompletionHandler {
        C10834w(C10803e eVar) {
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

    /* renamed from: w3.e$x */
    class C10835x implements CompletionHandler {
        C10835x(C10803e eVar) {
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

    /* renamed from: w3.e$y */
    class C10836y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20142a;

        C10836y(int i) {
            this.f20142a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10803e.this.mo23221d0().mo31551M0(true);
            C10803e eVar = C10803e.this;
            eVar.mo23165w1(eVar.mo23247j1(this.f20142a));
        }
    }

    /* renamed from: w3.e$z */
    class C10837z implements CompletionHandler {
        C10837z(C10803e eVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    public C10803e(String str, String str2, String str3, Device.Ownership ownership) {
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
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0190  */
    /* renamed from: k2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m27567k2(com.yeelight.yeelib.device.xiaomi.BsLamp3Service.Power r11, java.lang.Long r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.String r20, java.lang.Long r21, java.lang.Long r22, java.lang.Long r23, java.lang.String r24, java.lang.Long r25) {
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
            com.yeelight.yeelib.device.xiaomi.BsLamp3Service$Power r5 = com.yeelight.yeelib.device.xiaomi.BsLamp3Service.Power.on
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
            r4 = r24
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
            if (r22 == 0) goto L_0x015e
            long r6 = r22.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x015e
            r1 = 1
            goto L_0x015f
        L_0x015e:
            r1 = 0
        L_0x015f:
            r0.mo31555O0(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            if (r21 == 0) goto L_0x0172
            long r6 = r21.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0172
            r1 = 1
            goto L_0x0173
        L_0x0172:
            r1 = 0
        L_0x0173:
            r0.mo31583d(r1)
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            if (r23 == 0) goto L_0x0186
            long r6 = r23.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0186
            r1 = 1
            goto L_0x0187
        L_0x0186:
            r1 = 0
        L_0x0187:
            r0.mo31593i(r1)
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x019b
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            com.yeelight.yeelib.models.a r1 = com.yeelight.yeelib.models.C8308a.m19688b(r20)
            r0.mo31616t0(r1)
        L_0x019b:
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            if (r25 == 0) goto L_0x01aa
            long r6 = r25.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x01aa
            goto L_0x01ab
        L_0x01aa:
            r2 = 0
        L_0x01ab:
            r0.mo31585e(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223w3.C10803e.m27567k2(com.yeelight.yeelib.device.xiaomi.BsLamp3Service$Power, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long):void");
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C10811d0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo31474C1() {
        try {
            mo31477F1().disableMusic(0L, new C10835x(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo31476E1(String str, int i) {
        try {
            mo31477F1().enableMusic(1L, str, Long.valueOf((long) i), new C10834w(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: F */
    public int mo23116F() {
        String T = mo23208T();
        T.hashCode();
        return (T.equals("yeelink.light.lamp19") || T.equals("yeelink.light.bslamp3")) ? R$drawable.icon_yeelight_device_badge_dysis_le_small : R$drawable.icon_yeelight_device_badge_cherry1s_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        String T = mo23208T();
        T.hashCode();
        return (T.equals("yeelink.light.lamp19") || T.equals("yeelink.light.bslamp3")) ? R$drawable.icon_yeelight_device_badge_dysis_le_big : R$drawable.icon_yeelight_device_badge_cherry1s_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C10805a0();
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
            mo31477F1().sendCmd(BsLamp3Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10827p(z));
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
            BsLamp3Service j2 = mo31477F1();
            BsLamp3Service.CmdKey cmdKey = BsLamp3Service.CmdKey.nighttime;
            j2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C10831t(str, str2, i));
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
            mo31477F1().sendCmd(BsLamp3Service.CmdKey.cfg_init_power, String.valueOf(i), new C10828q(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(BsLamp3Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10820i(z));
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
        return mo42244l2(this.f20089A, this.f20090B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20091z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20088C, "Invalid handler!");
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
            mo31477F1().setPower(BsLamp3Service.Power.off, new C10809c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C10823l());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: d1 */
    public void mo23243d1(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("enableGestureSwitch --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(BsLamp3Service.CmdKey.knock_enable, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C10830s(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f1 */
    public boolean mo23142f1(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("enableNightTime --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(BsLamp3Service.CmdKey.nighttime, z ? "enable" : "disable", new C10833v(z));
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
            mo31477F1().sendCmd(BsLamp3Service.CmdKey.pseudo_beacon, "4097|" + i, new C10837z(this));
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
            BsLamp3Service j2 = mo31477F1();
            BsLamp3Service.CmdKey cmdKey = BsLamp3Service.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            j2.sendCmd(cmdKey, sb2.toString(), new C10829r(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public BsLamp3Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightBsLamp3Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(BsLamp3Service.Power.on, new C10832u());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo42244l2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof BsLamp3Service.C6295c1)) {
            AppUtils.m8300u(f20088C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (BsLamp3Service.C6295c1) obj2);
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
            mo31477F1().openWithMode(BsLamp3Service.Power.on, BsLamp3Service.Effect.smooth, 500L, Long.valueOf((long) i), new C10836y(i));
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
                mo31477F1().setBright(Long.valueOf(j), BsLamp3Service.Effect.smooth, 500L, new C10813e0(j));
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
            mo31477F1().setRgb(Long.valueOf((long) i2), BsLamp3Service.Effect.smooth, 500L, new C10817g0(i2));
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
            mo31477F1().start_cf(0L, 0L, sb.toString(), new C10819h0(iArr, i));
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
            mo31477F1().setCt(Long.valueOf((long) i), BsLamp3Service.Effect.smooth, 500L, new C10815f0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C10818h(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C10821j(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20091z);
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
            if (jSONArray.length() != 15) {
                AppUtils.m8300u("BATCH_RPC", "BsLampDevice, Invalid length of batch rpc result: " + str2);
            }
            m27567k2(BsLamp3Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)), jSONArray.getString(13), Long.valueOf(jSONArray.getLong(14)));
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
                mo31477F1().getProperties(new C10822k());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C10804a(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C10806b(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C10808c(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C10810d(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35417B()) {
            try {
                mo31477F1().setScene("color", Long.valueOf((long) (sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) sVar.mo35439f()), new C10812e(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (sVar.mo35456w()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35444k()), Long.valueOf((long) sVar.mo35445l()), sVar.mo35447n(), new C10814f(sVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C10816g(sVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f20088C;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("Hue").getInternalName(), mo31477F1().getService().getProperty("Sat").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("ColorMode").getInternalName(), mo31477F1().getService().getProperty("Rgb").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("MusicEnable").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty(BsLamp3Service.PROPERTY_KnockEnable).getInternalName()};
    }
}
