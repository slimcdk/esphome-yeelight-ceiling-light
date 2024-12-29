package p223w3;

import androidx.core.view.ViewCompat;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.LanDevice;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C6091a;
import com.yeelight.yeelib.device.base.C6092b;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.Lamp15Service;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp15Device;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8312e;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p232y3.C12041e;

/* renamed from: w3.h0 */
public class C11041h0 extends C6091a {

    /* renamed from: Q */
    public static final String f20481Q = "h0";

    /* renamed from: A */
    CompletionHandler f20482A = new C11071t(this);

    /* renamed from: B */
    CompletionHandler f20483B = new C11072u(this);

    /* renamed from: C */
    Lamp15Service.C7444l1 f20484C = new C11073v();

    /* renamed from: w3.h0$a */
    class C11042a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20485a;

        C11042a(int i) {
            this.f20485a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31610q0(this.f20485a);
        }
    }

    /* renamed from: w3.h0$a0 */
    class C11043a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20487a;

        C11043a0(int i) {
            this.f20487a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openBgWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo31657k2().mo31671j(true);
            C11041h0.this.mo31657k2().mo31678q(C11041h0.this.mo23247j1(this.f20487a));
        }
    }

    /* renamed from: w3.h0$b */
    class C11044b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20489a;

        C11044b(C8327s sVar) {
            this.f20489a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31557P0(this.f20489a);
        }
    }

    /* renamed from: w3.h0$b0 */
    class C11045b0 implements CompletionHandler {
        C11045b0(C11041h0 h0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.h0$c */
    class C11046c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20491a;

        C11046c(C8327s sVar) {
            this.f20491a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31557P0(this.f20491a);
        }
    }

    /* renamed from: w3.h0$c0 */
    class C11047c0 implements CompletionHandler {
        C11047c0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31551M0(false);
            C11041h0.this.mo31657k2().mo31677p(false);
        }
    }

    /* renamed from: w3.h0$d */
    class C11048d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20494a;

        C11048d(C8327s sVar) {
            this.f20494a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31557P0(this.f20494a);
        }
    }

    /* renamed from: w3.h0$d0 */
    class C11049d0 implements WifiDeviceBase.C6080i {
        C11049d0() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11041h0.this.f20484C.mo33853a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11041h0.this.f20484C.mo33860h(l);
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
            C11041h0.this.f20484C.mo33863k(Lamp15Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.h0$e */
    class C11050e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20497a;

        C11050e(C8327s sVar) {
            this.f20497a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31557P0(this.f20497a);
        }
    }

    /* renamed from: w3.h0$e0 */
    class C11051e0 implements WifiDeviceBase.C6079h {
        C11051e0() {
        }

        /* renamed from: j */
        public void mo31495j(Long l) {
            C11041h0.this.f20484C.mo33862j(l);
        }

        /* renamed from: l */
        public void mo31496l(Long l) {
            C11041h0.this.f20484C.mo33864l(l);
        }

        /* renamed from: n */
        public void mo31497n(Long l) {
            C11041h0.this.f20484C.mo33866n(l);
        }

        /* renamed from: o */
        public void mo31498o(WifiDeviceBase.Power power) {
            C11041h0.this.f20484C.mo33861i(Lamp15Service.BgPower.valueOf(power.toString()));
        }

        /* renamed from: p */
        public void mo31499p(WifiDeviceBase.Power power) {
            C11041h0.this.f20484C.mo33865m(Lamp15Service.MainPower.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.h0$f */
    class C11052f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20500a;

        C11052f(C8327s sVar) {
            this.f20500a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31557P0(this.f20500a);
        }
    }

    /* renamed from: w3.h0$f0 */
    static /* synthetic */ class C11053f0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20502a;

        /* renamed from: b */
        static final /* synthetic */ int[] f20503b;

        /* renamed from: c */
        static final /* synthetic */ int[] f20504c;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$BgPower[] r0 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.BgPower.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20504c = r0
                r1 = 1
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$BgPower r2 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.BgPower.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f20504c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$BgPower r3 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.BgPower.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$Power[] r2 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.Power.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f20503b = r2
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$Power r3 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.Power.on     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f20503b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$Power r3 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.Power.off     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$MainPower[] r2 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.MainPower.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f20502a = r2
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$MainPower r3 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.MainPower.on     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f20502a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$MainPower r2 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.MainPower.off     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11041h0.C11053f0.<clinit>():void");
        }
    }

    /* renamed from: w3.h0$g */
    class C11054g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20505a;

        C11054g(C8327s sVar) {
            this.f20505a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo31657k2().mo31679r(this.f20505a);
        }
    }

    /* renamed from: w3.h0$g0 */
    class C11055g0 implements CompletionHandler {
        C11055g0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.openBg --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo31657k2().mo31671j(true);
        }
    }

    /* renamed from: w3.h0$h */
    class C11056h implements Lamp15Service.C7435i1 {
        C11056h() {
        }

        /* renamed from: a */
        public void mo33847a(Lamp15Service.MainPower mainPower, Lamp15Service.Power power, Lamp15Service.BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            String str3 = "null";
            sb.append(power != null ? power.name() : str3);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("main_power: ");
            sb2.append(mainPower != null ? mainPower.name() : str3);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bg_power: ");
            if (bgPower != null) {
                str3 = bgPower.name();
            }
            sb3.append(str3);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("bright: ");
            sb4.append(l);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("bg_bright: ");
            Long l13 = l2;
            sb5.append(l13);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("ct: ");
            Long l14 = l3;
            sb6.append(l14);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("bg_ct: ");
            Long l15 = l4;
            sb7.append(l15);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("lanMode: ");
            Long l16 = l6;
            sb8.append(l16);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("saveState: ");
            Long l17 = l7;
            sb9.append(l17);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("delayoff: ");
            Long l18 = l5;
            sb10.append(l18);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("flowParams: ");
            String str4 = str;
            sb11.append(str4);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("bg_flowParams: ");
            String str5 = str2;
            sb12.append(str5);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("flowing : ");
            sb13.append(l10);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("bg_flowing : ");
            sb14.append(l11);
            StringBuilder sb15 = new StringBuilder();
            sb15.append("onFromPower : ");
            sb15.append(l8);
            StringBuilder sb16 = new StringBuilder();
            sb16.append("bg_rgb: ");
            sb16.append(l9);
            StringBuilder sb17 = new StringBuilder();
            sb17.append("bg_proact: ");
            sb17.append(l12);
            C11041h0.this.m28191r2(mainPower, power, bgPower, l, l13, l14, l15, l18, str4, str5, l16, l17, l8, l9, l10, l11, l12);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.h0$h0 */
    class C11057h0 implements CompletionHandler {
        C11057h0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.closeBg --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo31657k2().mo31671j(false);
        }
    }

    /* renamed from: w3.h0$i */
    class C11058i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20510a;

        C11058i(C8327s sVar) {
            this.f20510a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31557P0(this.f20510a);
        }
    }

    /* renamed from: w3.h0$i0 */
    class C11059i0 implements CompletionHandler {
        C11059i0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.h0$j */
    class C11060j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20513a;

        C11060j(C8327s sVar) {
            this.f20513a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo31657k2().mo31679r(this.f20513a);
        }
    }

    /* renamed from: w3.h0$j0 */
    class C11061j0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20515a;

        C11061j0(long j) {
            this.f20515a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31600l0(this.f20515a);
        }
    }

    /* renamed from: w3.h0$k */
    class C11062k implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20517a;

        C11062k(C8327s sVar) {
            this.f20517a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo31657k2().mo31679r(this.f20517a);
        }
    }

    /* renamed from: w3.h0$l */
    class C11063l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20519a;

        C11063l(C8327s sVar) {
            this.f20519a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo31657k2().mo31679r(this.f20519a);
        }
    }

    /* renamed from: w3.h0$m */
    class C11064m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20521a;

        C11064m(C8327s sVar) {
            this.f20521a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo31657k2().mo31679r(this.f20521a);
        }
    }

    /* renamed from: w3.h0$n */
    class C11065n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20523a;

        C11065n(C8327s sVar) {
            this.f20523a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31557P0(this.f20523a);
        }
    }

    /* renamed from: w3.h0$o */
    class C11066o implements CompletionHandler {
        C11066o(C11041h0 h0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.h0$p */
    class C11067p implements CompletionHandler {
        C11067p() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31555O0(true);
        }
    }

    /* renamed from: w3.h0$q */
    class C11068q implements CompletionHandler {
        C11068q(C11041h0 h0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.h0$r */
    class C11069r implements CompletionHandler {
        C11069r() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.h0$s */
    class C11070s implements CompletionHandler {
        C11070s() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31551M0(true);
            C11041h0.this.mo31657k2().mo31677p(true);
        }
    }

    /* renamed from: w3.h0$t */
    class C11071t implements CompletionHandler {
        C11071t(C11041h0 h0Var) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.h0$u */
    class C11072u implements CompletionHandler {
        C11072u(C11041h0 h0Var) {
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

    /* renamed from: w3.h0$v */
    class C11073v implements Lamp15Service.C7444l1 {
        C11073v() {
        }

        /* renamed from: a */
        public void mo33853a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11041h0.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo33854b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11041h0.this.mo23221d0().mo31611r(2) == null) {
                C11041h0.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11041h0.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo33855c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11041h0.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo33856d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11041h0.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo33857e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11041h0.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo33858f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11041h0.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo33859g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11041h0.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo33860h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C11041h0.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo33861i(Lamp15Service.BgPower bgPower) {
            C6092b bVar;
            StringBuilder sb = new StringBuilder();
            sb.append("onBgPowerChanged: ");
            sb.append(bgPower.name());
            int i = C11053f0.f20504c[bgPower.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C11041h0.this.mo31657k2();
            } else if (i == 2) {
                bVar = C11041h0.this.mo31657k2();
                z = false;
            } else {
                return;
            }
            bVar.mo31671j(z);
        }

        /* renamed from: j */
        public void mo33862j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgCtChanged: ");
            sb.append(l);
            C11041h0.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: k */
        public void mo33863k(Lamp15Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11053f0.f20503b[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11041h0.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11041h0.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: l */
        public void mo33864l(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgBrightChanged: ");
            sb.append(l);
            C11041h0.this.mo31657k2().mo31672k(l.intValue());
        }

        /* renamed from: m */
        public void mo33865m(Lamp15Service.MainPower mainPower) {
            C6092b bVar;
            StringBuilder sb = new StringBuilder();
            sb.append("onMainPowerSwitched: ");
            sb.append(mainPower.name());
            int i = C11053f0.f20502a[mainPower.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C11041h0.this.mo31657k2();
            } else if (i == 2) {
                bVar = C11041h0.this.mo31657k2();
                z = false;
            } else {
                return;
            }
            bVar.mo31677p(z);
        }

        /* renamed from: n */
        public void mo33866n(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgRgbChanged: ");
            sb.append(l);
            C11041h0.this.mo31657k2().mo31673l(l.intValue());
        }

        /* renamed from: q */
        public void mo33867q(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11041h0.this.mo31657k2().mo31675n(C8308a.m19688b(str));
            }
        }

        /* renamed from: r */
        public void mo33868r(Long l) {
            if (l != null) {
                C11041h0.this.mo23221d0().mo31598k0(l.longValue() == 1);
            }
        }

        /* renamed from: s */
        public void mo33869s(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgFlowingChanged: ");
            sb.append(l);
            C11041h0.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }
    }

    /* renamed from: w3.h0$w */
    class C11074w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20529a;

        C11074w(boolean z) {
            this.f20529a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31583d(this.f20529a);
        }
    }

    /* renamed from: w3.h0$x */
    class C11075x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20531a;

        C11075x(int i) {
            this.f20531a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31547K0(this.f20531a);
        }
    }

    /* renamed from: w3.h0$y */
    class C11076y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20533a;

        C11076y(boolean z) {
            this.f20533a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31598k0(this.f20533a);
        }
    }

    /* renamed from: w3.h0$z */
    class C11077z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20535a;

        C11077z(int i) {
            this.f20535a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11041h0.this.mo23221d0().mo31551M0(true);
            C11041h0.this.mo31657k2().mo31677p(true);
            C11041h0.this.mo23165w1(DeviceStatusBase.DeviceMode.values()[this.f20535a]);
        }
    }

    public C11041h0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public void m28191r2(Lamp15Service.MainPower mainPower, Lamp15Service.Power power, Lamp15Service.BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12) {
        Lamp15Service.MainPower mainPower2 = mainPower;
        Lamp15Service.Power power2 = power;
        Lamp15Service.BgPower bgPower2 = bgPower;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == Lamp15Service.Power.on);
        }
        if (mainPower2 != null) {
            mo31657k2().mo31677p(mainPower2 == Lamp15Service.MainPower.on);
        }
        if (bgPower2 != null) {
            mo31657k2().mo31671j(bgPower2 == Lamp15Service.BgPower.on);
        }
        if (l3 != null) {
            mo23221d0().mo31610q0(l3.intValue());
        }
        if (l4 != null) {
            mo31657k2().mo31674m(l4.intValue());
        }
        if (l != null) {
            mo23221d0().mo31600l0(l.longValue());
        }
        if (l2 != null) {
            mo31657k2().mo31672k(l2.intValue());
        }
        if (l5 != null) {
            if (mo23221d0().mo31611r(2) == null) {
                mo23221d0().mo31577a(new C12041e(l5.intValue(), l5.intValue()));
            } else {
                mo23221d0().mo31573X0(l5.intValue());
            }
        }
        if (l8 != null) {
            mo23221d0().mo31547K0(l8.intValue());
        }
        mo23221d0().mo31583d(l6 != null && l6.longValue() == 1);
        mo23221d0().mo31555O0(l7 != null && l7.longValue() == 1);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        if (!str2.isEmpty()) {
            mo31657k2().mo31675n(C8308a.m19688b(str2));
        }
        if (l11 != null) {
            mo31657k2().mo31676o(l11.longValue() != 0);
        }
        if (l10 != null) {
            mo23221d0().mo31618u0(l10.longValue() != 0);
        }
        if (l9 != null) {
            mo31657k2().mo31673l(l9.intValue());
        }
        if (l12 != null) {
            DeviceStatusBase d0 = mo23221d0();
            if (l12.longValue() != 1) {
                z = false;
            }
            d0.mo31598k0(z);
        }
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11059i0());
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
        return R$drawable.icon_yeelight_device_badge_lamp15_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_lamp15_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11049d0();
        this.f12431y = new C11051e0();
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
            mo31477F1().sendCmd(Lamp15Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11074w(z));
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
            mo31477F1().sendCmd(Lamp15Service.CmdKey.cfg_init_power, String.valueOf(i), new C11075x(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Lamp15Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11067p());
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
        return mo42290s2(this.f20483B, this.f20484C);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20482A);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20481Q, "Invalid handler!");
        }
        if (this.f4749n == null) {
            return true;
        }
        try {
            if (mo31477F1() == null) {
                return true;
            }
            mo31477F1().unsubscribeNotifications((CompletionHandler) obj);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: X */
    public String mo23214X() {
        return "setDevPower";
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
            mo31477F1().setPower(Lamp15Service.Power.off, new C11047c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11069r());
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
            mo31477F1().sendCmd(Lamp15Service.CmdKey.pseudo_beacon, "4097|" + i, new C11045b0(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: i2 */
    public boolean mo31655i2() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23126N1();
        }
        try {
            mo31477F1().setBgPower(Lamp15Service.BgPower.off, new C11057h0());
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
            mo31477F1().setPower(Lamp15Service.Power.on, new C11070s());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo31658l2() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23132U1();
        }
        try {
            mo31477F1().setBgPower(Lamp15Service.BgPower.on, new C11055g0());
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
            mo31477F1().openWithMode(Lamp15Service.MainPower.on, Lamp15Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11077z(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: m2 */
    public boolean mo31659m2(int i) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23135W1(i);
        }
        try {
            mo31477F1().openBgWithMode(Lamp15Service.BgPower.on, Lamp15Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11043a0(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: n2 */
    public boolean mo31660n2(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("setBgProact --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(Lamp15Service.CmdKey.cfg_bg_proact, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11076y(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: o2 */
    public boolean mo31661o2(C8327s sVar) {
        if (sVar.mo35455v()) {
            try {
                mo31477F1().setBgFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11054g(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setBgScene("off", 0L, 0L, new C11058i(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setBgScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11060j(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setBgScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11062k(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35417B()) {
            try {
                mo31477F1().setBgScene("color", Long.valueOf((long) (sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) sVar.mo35439f()), new C11063l(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (sVar.mo35456w()) {
            try {
                mo31477F1().setBgFlowScene("cf", Long.valueOf((long) sVar.mo35444k()), Long.valueOf((long) sVar.mo35445l()), sVar.mo35447n(), new C11064m(sVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else if (sVar.mo35459z()) {
            List<C8321m> b0 = ((C8312e) sVar).mo35348b0();
            if (b0.size() != 2) {
                return false;
            }
            try {
                mo31477F1().setSceneBundle(b0.get(0).mo35345Z(), b0.get(1).mo35345Z(), new C11065n(sVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f20481Q;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        if (super.mo23154p1(j)) {
            return true;
        }
        try {
            mo31477F1().setBright(Long.valueOf(j), Lamp15Service.Effect.smooth, 500L, new C11061j0(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        return false;
    }

    /* renamed from: q2 */
    public Lamp15Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice != null && (abstractDevice instanceof YeelightLamp15Device)) {
            return ((YeelightLamp15Device) abstractDevice).mDeviceService;
        }
        return null;
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
            mo31477F1().setCt(Long.valueOf((long) i), Lamp15Service.Effect.smooth, 500L, new C11042a(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s2 */
    public boolean mo42290s2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Lamp15Service.C7444l1)) {
            AppUtils.m8300u(f20481Q, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Lamp15Service.C7444l1) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11066o(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11068q(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20482A);
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
                AppUtils.m8300u("BATCH_RPC", "CeilingDevice, Invalid length of batch rpc result: " + str2);
            }
            m28191r2(Lamp15Service.MainPower.valueOf(jSONArray.getString(0)), Lamp15Service.Power.valueOf(jSONArray.getString(1)), Lamp15Service.BgPower.valueOf(jSONArray.getString(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), Long.valueOf(jSONArray.getLong(14)), Long.valueOf(jSONArray.getLong(15)), Long.valueOf(jSONArray.getLong(16)));
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
                mo31477F1().getProperties(new C11056h());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        if (sVar.mo35455v()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11044b(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11046c(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11048d(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11050e(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35459z()) {
            List<C8321m> b0 = ((C8312e) sVar).mo35348b0();
            if (b0.size() != 2) {
                return false;
            }
            try {
                mo31477F1().setSceneBundle(b0.get(0).mo35345Z(), b0.get(1).mo35345Z(), new C11052f(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f20481Q;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("MainPower").getInternalName(), mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("BgPower").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("BgBright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("BgCt").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("BgFlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("BgRgb").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("BgFlowing").getInternalName(), mo31477F1().getService().getProperty("BgProact").getInternalName()};
    }
}
