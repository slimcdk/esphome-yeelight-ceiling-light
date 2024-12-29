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
import com.yeelight.yeelib.device.LanDevice;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C6091a;
import com.yeelight.yeelib.device.base.C6092b;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.CeilingbService;
import com.yeelight.yeelib.device.xiaomi.YeelightCeilingbDevice;
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

/* renamed from: w3.q */
public class C11581q extends C6091a {

    /* renamed from: Q */
    public static final String f21284Q = "q";

    /* renamed from: A */
    CompletionHandler f21285A = new C11621v(this);

    /* renamed from: B */
    CompletionHandler f21286B = new C11622w(this);

    /* renamed from: C */
    CeilingbService.C7007y1 f21287C = new C11623x();

    /* renamed from: w3.q$a */
    class C11582a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21288a;

        C11582a(int i) {
            this.f21288a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31610q0(this.f21288a);
        }
    }

    /* renamed from: w3.q$a0 */
    class C11583a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21290a;

        C11583a0(boolean z) {
            this.f21290a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31598k0(this.f21290a);
        }
    }

    /* renamed from: w3.q$b */
    class C11584b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21292a;

        C11584b(C8327s sVar) {
            this.f21292a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31557P0(this.f21292a);
        }
    }

    /* renamed from: w3.q$b0 */
    class C11585b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21294a;

        C11585b0(boolean z) {
            this.f21294a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31543I0(this.f21294a);
        }
    }

    /* renamed from: w3.q$c */
    class C11586c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21296a;

        C11586c(C8327s sVar) {
            this.f21296a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31557P0(this.f21296a);
        }
    }

    /* renamed from: w3.q$c0 */
    class C11587c0 implements CompletionHandler {
        C11587c0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31551M0(false);
            C11581q.this.mo31657k2().mo31677p(false);
        }
    }

    /* renamed from: w3.q$d */
    class C11588d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21299a;

        C11588d(C8327s sVar) {
            this.f21299a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31557P0(this.f21299a);
        }
    }

    /* renamed from: w3.q$d0 */
    class C11589d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21301a;

        /* renamed from: b */
        final /* synthetic */ String f21302b;

        /* renamed from: c */
        final /* synthetic */ String f21303c;

        /* renamed from: d */
        final /* synthetic */ int f21304d;

        C11589d0(boolean z, String str, String str2, int i) {
            this.f21301a = z;
            this.f21302b = str;
            this.f21303c = str2;
            this.f21304d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31543I0(this.f21301a);
            C11581q.this.mo23221d0().mo31541H0(this.f21302b);
            C11581q.this.mo23221d0().mo31539G0(this.f21303c);
            C11581q.this.mo23221d0().mo31537F0(this.f21304d);
        }
    }

    /* renamed from: w3.q$e */
    class C11590e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21306a;

        C11590e(C8327s sVar) {
            this.f21306a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31557P0(this.f21306a);
        }
    }

    /* renamed from: w3.q$e0 */
    class C11591e0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f21308a;

        /* renamed from: b */
        final /* synthetic */ String f21309b;

        /* renamed from: c */
        final /* synthetic */ int f21310c;

        C11591e0(String str, String str2, int i) {
            this.f21308a = str;
            this.f21309b = str2;
            this.f21310c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31541H0(this.f21308a);
            C11581q.this.mo23221d0().mo31539G0(this.f21309b);
            C11581q.this.mo23221d0().mo31537F0(this.f21310c);
        }
    }

    /* renamed from: w3.q$f */
    class C11592f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21312a;

        C11592f(C8327s sVar) {
            this.f21312a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31557P0(this.f21312a);
        }
    }

    /* renamed from: w3.q$f0 */
    class C11593f0 implements CompletionHandler {
        C11593f0(C11581q qVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.q$g */
    class C11594g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21314a;

        C11594g(C8327s sVar) {
            this.f21314a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31557P0(this.f21314a);
        }
    }

    /* renamed from: w3.q$g0 */
    class C11595g0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21316a;

        C11595g0(int i) {
            this.f21316a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31551M0(true);
            C11581q.this.mo31657k2().mo31677p(true);
            C11581q.this.mo23165w1(DeviceStatusBase.DeviceMode.values()[this.f21316a]);
        }
    }

    /* renamed from: w3.q$h */
    class C11596h implements CeilingbService.C6992t1 {
        C11596h() {
        }

        /* renamed from: a */
        public void mo33148a(CeilingbService.MainPower mainPower, CeilingbService.Power power, CeilingbService.BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, String str3, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            String str4 = "null";
            sb.append(power != null ? power.name() : str4);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("main_power: ");
            sb2.append(mainPower != null ? mainPower.name() : str4);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bg_power: ");
            if (bgPower != null) {
                str4 = bgPower.name();
            }
            sb3.append(str4);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("bright: ");
            sb4.append(l);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("bg_bright: ");
            Long l17 = l2;
            sb5.append(l17);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("ct: ");
            Long l18 = l3;
            sb6.append(l18);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("bg_ct: ");
            Long l19 = l4;
            sb7.append(l19);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("lanMode: ");
            Long l20 = l6;
            sb8.append(l20);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("saveState: ");
            Long l21 = l7;
            sb9.append(l21);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("delayoff: ");
            Long l22 = l5;
            sb10.append(l22);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("flowParams: ");
            String str5 = str;
            sb11.append(str5);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("bg_flowParams: ");
            String str6 = str2;
            sb12.append(str6);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("nLBright: ");
            sb13.append(l10);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("nightTimeInfo : ");
            sb14.append(str3);
            StringBuilder sb15 = new StringBuilder();
            sb15.append("miBandSleep : ");
            sb15.append(l11);
            StringBuilder sb16 = new StringBuilder();
            sb16.append("flowing : ");
            sb16.append(l13);
            StringBuilder sb17 = new StringBuilder();
            sb17.append("bg_flowing : ");
            sb17.append(l14);
            StringBuilder sb18 = new StringBuilder();
            sb18.append("onFromPower : ");
            sb18.append(l9);
            StringBuilder sb19 = new StringBuilder();
            sb19.append("bg_rgb: ");
            sb19.append(l12);
            StringBuilder sb20 = new StringBuilder();
            sb20.append("bg_proact: ");
            sb20.append(l15);
            StringBuilder sb21 = new StringBuilder();
            sb21.append("smartSwitch: ");
            sb21.append(l16);
            StringBuilder sb22 = new StringBuilder();
            sb22.append("transIntervalDflt: ");
            sb22.append(l8);
            C11581q.this.m29462r2(mainPower, power, bgPower, l, l17, l18, l19, l22, str5, str6, l20, l21, l9, l10, str3, l11, l12, l13, l14, l15, l16, l8);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.q$h0 */
    class C11597h0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21319a;

        C11597h0(int i) {
            this.f21319a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openBgWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo31657k2().mo31671j(true);
            C11581q.this.mo31657k2().mo31678q(C11581q.this.mo23247j1(this.f21319a));
        }
    }

    /* renamed from: w3.q$i */
    class C11598i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21321a;

        C11598i(C8327s sVar) {
            this.f21321a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo31657k2().mo31679r(this.f21321a);
        }
    }

    /* renamed from: w3.q$i0 */
    class C11599i0 implements CompletionHandler {
        C11599i0(C11581q qVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.q$j */
    class C11600j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21323a;

        C11600j(C8327s sVar) {
            this.f21323a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31557P0(this.f21323a);
        }
    }

    /* renamed from: w3.q$j0 */
    class C11601j0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21325a;

        C11601j0(boolean z) {
            this.f21325a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31597k(this.f21325a);
        }
    }

    /* renamed from: w3.q$k */
    class C11602k implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21327a;

        C11602k(C8327s sVar) {
            this.f21327a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo31657k2().mo31679r(this.f21327a);
        }
    }

    /* renamed from: w3.q$k0 */
    class C11603k0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21329a;

        C11603k0(boolean z) {
            this.f21329a = z;
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("enableBleCfg --> onFailed: ");
            sb.append(str);
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31581c(this.f21329a);
        }
    }

    /* renamed from: w3.q$l */
    class C11604l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21331a;

        C11604l(C8327s sVar) {
            this.f21331a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo31657k2().mo31679r(this.f21331a);
        }
    }

    /* renamed from: w3.q$l0 */
    class C11605l0 implements WifiDeviceBase.C6080i {
        C11605l0() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11581q.this.f21287C.mo33158a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11581q.this.f21287C.mo33165h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
            C11581q.this.f21287C.mo33168k(l);
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C11581q.this.f21287C.mo33177t(CeilingbService.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.q$m */
    class C11606m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21334a;

        C11606m(C8327s sVar) {
            this.f21334a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo31657k2().mo31679r(this.f21334a);
        }
    }

    /* renamed from: w3.q$m0 */
    class C11607m0 implements CompletionHandler {
        C11607m0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.openBg --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo31657k2().mo31671j(true);
        }
    }

    /* renamed from: w3.q$n */
    class C11608n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21337a;

        C11608n(C8327s sVar) {
            this.f21337a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo31657k2().mo31679r(this.f21337a);
        }
    }

    /* renamed from: w3.q$n0 */
    class C11609n0 implements WifiDeviceBase.C6079h {
        C11609n0() {
        }

        /* renamed from: j */
        public void mo31495j(Long l) {
            C11581q.this.f21287C.mo33167j(l);
        }

        /* renamed from: l */
        public void mo31496l(Long l) {
            C11581q.this.f21287C.mo33169l(l);
        }

        /* renamed from: n */
        public void mo31497n(Long l) {
            C11581q.this.f21287C.mo33171n(l);
        }

        /* renamed from: o */
        public void mo31498o(WifiDeviceBase.Power power) {
            C11581q.this.f21287C.mo33178u(CeilingbService.BgPower.valueOf(power.toString()));
        }

        /* renamed from: p */
        public void mo31499p(WifiDeviceBase.Power power) {
            C11581q.this.f21287C.mo33179v(CeilingbService.MainPower.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.q$o */
    class C11610o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21340a;

        C11610o(C8327s sVar) {
            this.f21340a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31557P0(this.f21340a);
        }
    }

    /* renamed from: w3.q$o0 */
    static /* synthetic */ class C11611o0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f21342a;

        /* renamed from: b */
        static final /* synthetic */ int[] f21343b;

        /* renamed from: c */
        static final /* synthetic */ int[] f21344c;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.CeilingbService$BgPower[] r0 = com.yeelight.yeelib.device.xiaomi.CeilingbService.BgPower.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21344c = r0
                r1 = 1
                com.yeelight.yeelib.device.xiaomi.CeilingbService$BgPower r2 = com.yeelight.yeelib.device.xiaomi.CeilingbService.BgPower.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f21344c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.CeilingbService$BgPower r3 = com.yeelight.yeelib.device.xiaomi.CeilingbService.BgPower.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.yeelight.yeelib.device.xiaomi.CeilingbService$Power[] r2 = com.yeelight.yeelib.device.xiaomi.CeilingbService.Power.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f21343b = r2
                com.yeelight.yeelib.device.xiaomi.CeilingbService$Power r3 = com.yeelight.yeelib.device.xiaomi.CeilingbService.Power.on     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f21343b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.yeelight.yeelib.device.xiaomi.CeilingbService$Power r3 = com.yeelight.yeelib.device.xiaomi.CeilingbService.Power.off     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                com.yeelight.yeelib.device.xiaomi.CeilingbService$MainPower[] r2 = com.yeelight.yeelib.device.xiaomi.CeilingbService.MainPower.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f21342a = r2
                com.yeelight.yeelib.device.xiaomi.CeilingbService$MainPower r3 = com.yeelight.yeelib.device.xiaomi.CeilingbService.MainPower.on     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f21342a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.yeelight.yeelib.device.xiaomi.CeilingbService$MainPower r2 = com.yeelight.yeelib.device.xiaomi.CeilingbService.MainPower.off     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11581q.C11611o0.<clinit>():void");
        }
    }

    /* renamed from: w3.q$p */
    class C11612p implements CompletionHandler {
        C11612p(C11581q qVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.q$p0 */
    class C11613p0 implements CompletionHandler {
        C11613p0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.closeBg --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo31657k2().mo31671j(false);
        }
    }

    /* renamed from: w3.q$q */
    class C11614q implements CompletionHandler {
        C11614q() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31555O0(true);
        }
    }

    /* renamed from: w3.q$q0 */
    class C11615q0 implements CompletionHandler {
        C11615q0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.q$r */
    class C11616r implements CompletionHandler {
        C11616r(C11581q qVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.q$r0 */
    class C11617r0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21348a;

        C11617r0(long j) {
            this.f21348a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31600l0(this.f21348a);
        }
    }

    /* renamed from: w3.q$s */
    class C11618s implements CompletionHandler {
        C11618s() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31551M0(true);
            C11581q.this.mo31657k2().mo31677p(true);
        }
    }

    /* renamed from: w3.q$t */
    class C11619t implements CompletionHandler {
        C11619t() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.q$u */
    class C11620u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21352a;

        C11620u(long j) {
            this.f21352a = j;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31565T0(this.f21352a);
        }
    }

    /* renamed from: w3.q$v */
    class C11621v implements CompletionHandler {
        C11621v(C11581q qVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.q$w */
    class C11622w implements CompletionHandler {
        C11622w(C11581q qVar) {
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

    /* renamed from: w3.q$x */
    class C11623x implements CeilingbService.C7007y1 {
        C11623x() {
        }

        /* renamed from: a */
        public void mo33158a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11581q.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo33159b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11581q.this.mo23221d0().mo31611r(2) == null) {
                C11581q.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11581q.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo33160c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11581q.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo33161d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11581q.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo33162e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11581q.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo33163f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11581q.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo33164g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11581q.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo33165h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C11581q.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo33166i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C11581q.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C11581q.this.mo23221d0().mo31543I0(true);
                }
                C11581q.this.mo23221d0().mo31541H0(split[1]);
                C11581q.this.mo23221d0().mo31539G0(split[2]);
                C11581q.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C11581q.f21284Q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C11581q.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C11581q.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C11581q.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo33167j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgCtChanged: ");
            sb.append(l);
            C11581q.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: k */
        public void mo33168k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNLBrightChanged: ");
            sb.append(l);
            if (l.longValue() != 0) {
                C11581q.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
                C11581q.this.mo23221d0().mo31545J0(l.longValue());
                return;
            }
            C11581q.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: l */
        public void mo33169l(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgBrightChanged: ");
            sb.append(l);
            C11581q.this.mo31657k2().mo31672k(l.intValue());
        }

        /* renamed from: m */
        public void mo33170m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onMiBandSleepChanged: ");
            sb.append(l);
            C11581q.this.mo23221d0().mo31591h(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo33171n(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgRgbChanged: ");
            sb.append(l);
            C11581q.this.mo31657k2().mo31673l(l.intValue());
        }

        /* renamed from: o */
        public void mo33172o(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("smartSwitch: ");
            sb.append(l);
            C11581q.this.mo23221d0().mo31597k(l != null && l.longValue() == 1);
        }

        /* renamed from: p */
        public void mo33173p(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onTransIntervalDfltChanged: ");
            sb.append(l);
            C11581q.this.mo23221d0().mo31565T0(l == null ? 0 : l.longValue());
        }

        /* renamed from: q */
        public void mo33174q(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11581q.this.mo31657k2().mo31675n(C8308a.m19688b(str));
            }
        }

        /* renamed from: r */
        public void mo33175r(Long l) {
            if (l != null) {
                C11581q.this.mo23221d0().mo31598k0(l.longValue() == 1);
            }
        }

        /* renamed from: s */
        public void mo33176s(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgFlowingChanged: ");
            sb.append(l);
            C11581q.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: t */
        public void mo33177t(CeilingbService.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11611o0.f21343b[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11581q.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11581q.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: u */
        public void mo33178u(CeilingbService.BgPower bgPower) {
            C6092b bVar;
            StringBuilder sb = new StringBuilder();
            sb.append("onBgPowerChanged: ");
            sb.append(bgPower.name());
            int i = C11611o0.f21344c[bgPower.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C11581q.this.mo31657k2();
            } else if (i == 2) {
                bVar = C11581q.this.mo31657k2();
                z = false;
            } else {
                return;
            }
            bVar.mo31671j(z);
        }

        /* renamed from: v */
        public void mo33179v(CeilingbService.MainPower mainPower) {
            C6092b bVar;
            StringBuilder sb = new StringBuilder();
            sb.append("onMainPowerSwitched: ");
            sb.append(mainPower.name());
            int i = C11611o0.f21342a[mainPower.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C11581q.this.mo31657k2();
            } else if (i == 2) {
                bVar = C11581q.this.mo31657k2();
                z = false;
            } else {
                return;
            }
            bVar.mo31677p(z);
        }
    }

    /* renamed from: w3.q$y */
    class C11624y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21355a;

        C11624y(boolean z) {
            this.f21355a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31583d(this.f21355a);
        }
    }

    /* renamed from: w3.q$z */
    class C11625z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21357a;

        C11625z(int i) {
            this.f21357a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11581q.this.mo23221d0().mo31547K0(this.f21357a);
        }
    }

    public C11581q(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m29462r2(CeilingbService.MainPower mainPower, CeilingbService.Power power, CeilingbService.BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16) {
        CeilingbService.MainPower mainPower2 = mainPower;
        CeilingbService.Power power2 = power;
        CeilingbService.BgPower bgPower2 = bgPower;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == CeilingbService.Power.on);
        }
        if (mainPower2 != null) {
            mo31657k2().mo31677p(mainPower2 == CeilingbService.MainPower.on);
        }
        if (bgPower2 != null) {
            mo31657k2().mo31671j(bgPower2 == CeilingbService.BgPower.on);
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
        long j = 0;
        if (l9.longValue() == 0) {
            mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        } else {
            mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
            mo23221d0().mo31545J0(l9.longValue());
        }
        String[] split = str3.split("\\|");
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
        mo23221d0().mo31583d(l6 != null && l6.longValue() == 1);
        mo23221d0().mo31591h(l10 != null && l10.longValue() == 1);
        mo23221d0().mo31555O0(l7 != null && l7.longValue() == 1);
        if (!str.isEmpty()) {
            mo23221d0().mo31616t0(C8308a.m19688b(str));
        }
        if (!str2.isEmpty()) {
            mo31657k2().mo31675n(C8308a.m19688b(str2));
        }
        if (l13 != null) {
            mo31657k2().mo31676o(l13.longValue() != 0);
        }
        if (l12 != null) {
            mo23221d0().mo31618u0(l12.longValue() != 0);
        }
        if (l11 != null) {
            mo31657k2().mo31673l(l11.intValue());
        }
        if (l14 != null) {
            mo23221d0().mo31598k0(l14.longValue() == 1);
        }
        DeviceStatusBase d0 = mo23221d0();
        if (l15 == null || l15.longValue() != 1) {
            z = false;
        }
        d0.mo31597k(z);
        DeviceStatusBase d02 = mo23221d0();
        if (l16 != null) {
            j = l16.longValue();
        }
        d02.mo31565T0(j);
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11615q0());
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
            return R$drawable.icon_yeelight_device_badge_ceiling19_small;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -1462015182:
                if (T.equals("yeelink.light.ceiling19")) {
                    c = 0;
                    break;
                }
                break;
            case -1462015160:
                if (T.equals("yeelink.light.ceiling20")) {
                    c = 1;
                    break;
                }
                break;
            case -458141174:
                if (T.equals("yeelink.light.ceilb")) {
                    c = 2;
                    break;
                }
                break;
            case -458141173:
                if (T.equals("yeelink.light.ceilc")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_ceiling19_small;
            case 1:
                return R$drawable.icon_yeelight_device_badge_ceiling20_small;
            case 2:
                return R$drawable.icon_yeelight_device_badge_ceilingb_small;
            case 3:
                return R$drawable.icon_yeelight_device_badge_ceilingc_small;
            default:
                return R$drawable.icon_yeelight_device_badge_ceiling19_small;
        }
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_ceiling19_big;
        }
        String T = mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -1462015182:
                if (T.equals("yeelink.light.ceiling19")) {
                    c = 0;
                    break;
                }
                break;
            case -1462015160:
                if (T.equals("yeelink.light.ceiling20")) {
                    c = 1;
                    break;
                }
                break;
            case -458141174:
                if (T.equals("yeelink.light.ceilb")) {
                    c = 2;
                    break;
                }
                break;
            case -458141173:
                if (T.equals("yeelink.light.ceilc")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_ceiling19_big;
            case 1:
                return R$drawable.icon_yeelight_device_badge_ceiling20_big;
            case 2:
                return R$drawable.icon_yeelight_device_badge_ceilingb_big;
            case 3:
                return R$drawable.icon_yeelight_device_badge_ceilingc_big;
            default:
                return R$drawable.icon_yeelight_device_badge_ceiling19_big;
        }
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11605l0();
        this.f12431y = new C11609n0();
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
            mo31477F1().sendCmd(CeilingbService.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11624y(z));
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
            CeilingbService q2 = mo31477F1();
            CeilingbService.CmdKey cmdKey = CeilingbService.CmdKey.nighttime;
            q2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C11591e0(str, str2, i));
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
            mo31477F1().sendCmd(CeilingbService.CmdKey.cfg_init_power, String.valueOf(i), new C11625z(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(CeilingbService.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11614q());
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
        return mo42336s2(this.f21286B, this.f21287C);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21285A);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21284Q, "Invalid handler!");
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

    /* renamed from: X */
    public String mo23214X() {
        return "setDevPower";
    }

    /* renamed from: a2 */
    public boolean mo41882a2(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("enableMiBandSleep --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(CeilingbService.CmdKey.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11593f0(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23127O1()) {
            return true;
        }
        try {
            mo31477F1().setPower(CeilingbService.Power.off, new C11587c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11619t());
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
            mo31477F1().sendCmd(CeilingbService.CmdKey.nighttime, z ? "enable" : "disable", new C11585b0(z));
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
            mo31477F1().sendCmd(CeilingbService.CmdKey.pseudo_beacon, "4097|" + i, new C11599i0(this));
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
            CeilingbService q2 = mo31477F1();
            CeilingbService.CmdKey cmdKey = CeilingbService.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            q2.sendCmd(cmdKey, sb2.toString(), new C11589d0(z, str, str2, i));
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
            mo31477F1().setBgPower(CeilingbService.BgPower.off, new C11613p0());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23138Y1()) {
            return true;
        }
        try {
            mo31477F1().setPower(CeilingbService.Power.on, new C11618s());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo31658l2() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23134V1();
        }
        try {
            mo31477F1().setBgPower(CeilingbService.BgPower.on, new C11607m0());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23139Z1(mo23221d0().mo31554O(), i)) {
            return true;
        }
        try {
            mo31477F1().openWithMode(CeilingbService.MainPower.on, CeilingbService.Effect.smooth, Long.valueOf(mo23221d0().mo31554O()), Long.valueOf((long) i), new C11595g0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: m2 */
    public boolean mo31659m2(int i) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23136X1(mo23221d0().mo31554O(), i);
        }
        try {
            mo31477F1().openBgWithMode(CeilingbService.BgPower.on, CeilingbService.Effect.smooth, Long.valueOf(mo23221d0().mo31554O()), Long.valueOf((long) i), new C11597h0(i));
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
            mo31477F1().sendCmd(CeilingbService.CmdKey.cfg_bg_proact, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11583a0(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: o2 */
    public boolean mo31661o2(C8327s sVar) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23120H2(sVar)) {
            return true;
        }
        if (sVar.mo35455v()) {
            try {
                mo31477F1().setBgFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11598i(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setBgScene("off", 0L, 0L, new C11600j(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setBgScene2("bright", Long.valueOf((long) sVar.mo35439f()), new C11602k(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setBgScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11604l(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35417B()) {
            try {
                mo31477F1().setBgScene("color", Long.valueOf((long) (sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) sVar.mo35439f()), new C11606m(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (sVar.mo35456w()) {
            try {
                mo31477F1().setBgFlowScene("cf", Long.valueOf((long) sVar.mo35444k()), Long.valueOf((long) sVar.mo35445l()), sVar.mo35447n(), new C11608n(sVar));
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
                mo31477F1().setSceneBundle(b0.get(0).mo35345Z(), b0.get(1).mo35345Z(), new C11610o(sVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f21284Q;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23121I2(j)) {
            return true;
        }
        try {
            mo31477F1().setBright(Long.valueOf(j), new C11617r0(j));
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
    public CeilingbService mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice != null && (abstractDevice instanceof YeelightCeilingbDevice)) {
            return ((YeelightCeilingbDevice) abstractDevice).mDeviceService;
        }
        return null;
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23123K2(i)) {
            return true;
        }
        try {
            mo31477F1().setCt(Long.valueOf((long) i), new C11582a(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s2 */
    public boolean mo42336s2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof CeilingbService.C7007y1)) {
            AppUtils.m8300u(f21284Q, "Invalid handler or listener!");
        }
        if (mo31477F1() == null) {
            return true;
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (CeilingbService.C7007y1) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11612p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u */
    public void mo23237u(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("enableBleCfg --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(CeilingbService.CmdKey.cfg_ble_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11603k0(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11616r(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("enableFlexSwitch --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(CeilingbService.CmdKey.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11601j0(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21285A);
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
            if (jSONArray.length() != 22) {
                AppUtils.m8300u("BATCH_RPC", "CeilingbDevice, Invalid length of batch rpc result: " + str2);
            }
            m29462r2(CeilingbService.MainPower.valueOf(jSONArray.getString(0)), CeilingbService.Power.valueOf(jSONArray.getString(1)), CeilingbService.BgPower.valueOf(jSONArray.getString(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), jSONArray.getString(14), Long.valueOf(jSONArray.getLong(15)), Long.valueOf(jSONArray.getLong(16)), Long.valueOf(jSONArray.getLong(17)), Long.valueOf(jSONArray.getLong(18)), Long.valueOf(jSONArray.getLong(19)), Long.valueOf(jSONArray.getLong(20)), Long.valueOf(jSONArray.getLong(21)));
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
                mo31477F1().getProperties(new C11596h());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23124L2(sVar)) {
            return true;
        }
        if (sVar.mo35455v()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11584b(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11586c(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene2("bright", Long.valueOf((long) sVar.mo35439f()), new C11588d(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11590e(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C11592f(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (sVar.mo35459z()) {
            List<C8321m> b0 = ((C8312e) sVar).mo35348b0();
            if (b0.size() != 2) {
                return false;
            }
            try {
                mo31477F1().setSceneBundle(b0.get(0).mo35345Z(), b0.get(1).mo35345Z(), new C11594g(sVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str = f21284Q;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: y1 */
    public boolean mo23250y1(long j) {
        try {
            CeilingbService q2 = mo31477F1();
            CeilingbService.CmdKey cmdKey = CeilingbService.CmdKey.trans_default;
            q2.sendCmd(cmdKey, j + ",1", new C11620u(j));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("MainPower").getInternalName(), mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("BgPower").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("BgBright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("BgCt").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("BgFlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("NLBright").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty("MiBandSleep").getInternalName(), mo31477F1().getService().getProperty("BgRgb").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("BgFlowing").getInternalName(), mo31477F1().getService().getProperty("BgProact").getInternalName(), mo31477F1().getService().getProperty("SmartSwitch").getInternalName(), mo31477F1().getService().getProperty("TransIntervalDflt").getInternalName()};
    }
}
