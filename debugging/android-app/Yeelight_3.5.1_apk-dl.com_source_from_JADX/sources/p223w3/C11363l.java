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
import com.yeelight.yeelib.device.xiaomi.Ceiling4Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling4Device;
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

/* renamed from: w3.l */
public class C11363l extends C6091a {

    /* renamed from: Q */
    public static final String f20954Q = "l";

    /* renamed from: A */
    CompletionHandler f20955A = new C11399u(this);

    /* renamed from: B */
    CompletionHandler f20956B = new C11400v(this);

    /* renamed from: C */
    Ceiling4Service.C6734s1 f20957C = new C11401w();

    /* renamed from: w3.l$a */
    class C11364a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20958a;

        C11364a(int i) {
            this.f20958a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31610q0(this.f20958a);
        }
    }

    /* renamed from: w3.l$a0 */
    class C11365a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20960a;

        C11365a0(boolean z) {
            this.f20960a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31543I0(this.f20960a);
        }
    }

    /* renamed from: w3.l$b */
    class C11366b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20962a;

        C11366b(C8327s sVar) {
            this.f20962a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31557P0(this.f20962a);
        }
    }

    /* renamed from: w3.l$b0 */
    class C11367b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20964a;

        /* renamed from: b */
        final /* synthetic */ String f20965b;

        /* renamed from: c */
        final /* synthetic */ String f20966c;

        /* renamed from: d */
        final /* synthetic */ int f20967d;

        C11367b0(boolean z, String str, String str2, int i) {
            this.f20964a = z;
            this.f20965b = str;
            this.f20966c = str2;
            this.f20967d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31543I0(this.f20964a);
            C11363l.this.mo23221d0().mo31541H0(this.f20965b);
            C11363l.this.mo23221d0().mo31539G0(this.f20966c);
            C11363l.this.mo23221d0().mo31537F0(this.f20967d);
        }
    }

    /* renamed from: w3.l$c */
    class C11368c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20969a;

        C11368c(C8327s sVar) {
            this.f20969a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31557P0(this.f20969a);
        }
    }

    /* renamed from: w3.l$c0 */
    class C11369c0 implements CompletionHandler {
        C11369c0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31551M0(false);
            C11363l.this.mo31657k2().mo31677p(false);
        }
    }

    /* renamed from: w3.l$d */
    class C11370d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20972a;

        C11370d(C8327s sVar) {
            this.f20972a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31557P0(this.f20972a);
        }
    }

    /* renamed from: w3.l$d0 */
    class C11371d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f20974a;

        /* renamed from: b */
        final /* synthetic */ String f20975b;

        /* renamed from: c */
        final /* synthetic */ int f20976c;

        C11371d0(String str, String str2, int i) {
            this.f20974a = str;
            this.f20975b = str2;
            this.f20976c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31541H0(this.f20974a);
            C11363l.this.mo23221d0().mo31539G0(this.f20975b);
            C11363l.this.mo23221d0().mo31537F0(this.f20976c);
        }
    }

    /* renamed from: w3.l$e */
    class C11372e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20978a;

        C11372e(C8327s sVar) {
            this.f20978a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31557P0(this.f20978a);
        }
    }

    /* renamed from: w3.l$e0 */
    class C11373e0 implements CompletionHandler {
        C11373e0(C11363l lVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.l$f */
    class C11374f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20980a;

        C11374f(C8327s sVar) {
            this.f20980a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31557P0(this.f20980a);
        }
    }

    /* renamed from: w3.l$f0 */
    class C11375f0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20982a;

        C11375f0(int i) {
            this.f20982a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31551M0(true);
            C11363l.this.mo31657k2().mo31677p(true);
            C11363l.this.mo23165w1(DeviceStatusBase.DeviceMode.values()[this.f20982a]);
        }
    }

    /* renamed from: w3.l$g */
    class C11376g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20984a;

        C11376g(C8327s sVar) {
            this.f20984a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31557P0(this.f20984a);
        }
    }

    /* renamed from: w3.l$g0 */
    class C11377g0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20986a;

        C11377g0(int i) {
            this.f20986a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openBgWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo31657k2().mo31671j(true);
            C11363l.this.mo31657k2().mo31678q(C11363l.this.mo23247j1(this.f20986a));
        }
    }

    /* renamed from: w3.l$h */
    class C11378h implements Ceiling4Service.C6725p1 {
        C11378h() {
        }

        /* renamed from: a */
        public void mo32748a(Ceiling4Service.MainPower mainPower, Ceiling4Service.Power power, Ceiling4Service.BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14) {
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
            Long l15 = l2;
            sb5.append(l15);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("ct: ");
            Long l16 = l3;
            sb6.append(l16);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("bg_ct: ");
            Long l17 = l4;
            sb7.append(l17);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("lanMode: ");
            Long l18 = l6;
            sb8.append(l18);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("saveState: ");
            Long l19 = l7;
            sb9.append(l19);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("delayoff: ");
            Long l20 = l5;
            sb10.append(l20);
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
            sb13.append(l9);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("nightTimeInfo : ");
            sb14.append(str3);
            StringBuilder sb15 = new StringBuilder();
            sb15.append("miBandSleep : ");
            sb15.append(l10);
            StringBuilder sb16 = new StringBuilder();
            sb16.append("flowing : ");
            sb16.append(l12);
            StringBuilder sb17 = new StringBuilder();
            sb17.append("bg_flowing : ");
            sb17.append(l13);
            StringBuilder sb18 = new StringBuilder();
            sb18.append("onFromPower : ");
            sb18.append(l8);
            StringBuilder sb19 = new StringBuilder();
            sb19.append("bg_rgb: ");
            sb19.append(l11);
            StringBuilder sb20 = new StringBuilder();
            sb20.append("bg_proact: ");
            sb20.append(l14);
            C11363l.this.m28860r2(mainPower, power, bgPower, l, l15, l16, l17, l20, str5, str6, l18, l19, l8, l9, str3, l10, l11, l12, l13, l14);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.l$h0 */
    class C11379h0 implements CompletionHandler {
        C11379h0(C11363l lVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.l$i */
    class C11380i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20989a;

        C11380i(C8327s sVar) {
            this.f20989a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo31657k2().mo31679r(this.f20989a);
        }
    }

    /* renamed from: w3.l$i0 */
    class C11381i0 implements WifiDeviceBase.C6080i {
        C11381i0() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11363l.this.f20957C.mo32754a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11363l.this.f20957C.mo32761h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
            C11363l.this.f20957C.mo32764k(l);
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C11363l.this.f20957C.mo32768o(Ceiling4Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.l$j */
    class C11382j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20992a;

        C11382j(C8327s sVar) {
            this.f20992a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31557P0(this.f20992a);
        }
    }

    /* renamed from: w3.l$j0 */
    class C11383j0 implements WifiDeviceBase.C6079h {
        C11383j0() {
        }

        /* renamed from: j */
        public void mo31495j(Long l) {
            C11363l.this.f20957C.mo32763j(l);
        }

        /* renamed from: l */
        public void mo31496l(Long l) {
            C11363l.this.f20957C.mo32765l(l);
        }

        /* renamed from: n */
        public void mo31497n(Long l) {
            C11363l.this.f20957C.mo32767n(l);
        }

        /* renamed from: o */
        public void mo31498o(WifiDeviceBase.Power power) {
            C11363l.this.f20957C.mo32773t(Ceiling4Service.BgPower.valueOf(power.toString()));
        }

        /* renamed from: p */
        public void mo31499p(WifiDeviceBase.Power power) {
            C11363l.this.f20957C.mo32769p(Ceiling4Service.MainPower.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.l$k */
    class C11384k implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20995a;

        C11384k(C8327s sVar) {
            this.f20995a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo31657k2().mo31679r(this.f20995a);
        }
    }

    /* renamed from: w3.l$k0 */
    static /* synthetic */ class C11385k0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20997a;

        /* renamed from: b */
        static final /* synthetic */ int[] f20998b;

        /* renamed from: c */
        static final /* synthetic */ int[] f20999c;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$BgPower[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.BgPower.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20999c = r0
                r1 = 1
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$BgPower r2 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.BgPower.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f20999c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$BgPower r3 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.BgPower.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$Power[] r2 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.Power.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f20998b = r2
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$Power r3 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.Power.on     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f20998b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$Power r3 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.Power.off     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$MainPower[] r2 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.MainPower.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f20997a = r2
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$MainPower r3 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.MainPower.on     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f20997a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$MainPower r2 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.MainPower.off     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11363l.C11385k0.<clinit>():void");
        }
    }

    /* renamed from: w3.l$l */
    class C11386l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21000a;

        C11386l(C8327s sVar) {
            this.f21000a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo31657k2().mo31679r(this.f21000a);
        }
    }

    /* renamed from: w3.l$l0 */
    class C11387l0 implements CompletionHandler {
        C11387l0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.openBg --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo31657k2().mo31671j(true);
        }
    }

    /* renamed from: w3.l$m */
    class C11388m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21003a;

        C11388m(C8327s sVar) {
            this.f21003a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo31657k2().mo31679r(this.f21003a);
        }
    }

    /* renamed from: w3.l$m0 */
    class C11389m0 implements CompletionHandler {
        C11389m0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.closeBg --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo31657k2().mo31671j(false);
        }
    }

    /* renamed from: w3.l$n */
    class C11390n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21006a;

        C11390n(C8327s sVar) {
            this.f21006a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo31657k2().mo31679r(this.f21006a);
        }
    }

    /* renamed from: w3.l$n0 */
    class C11391n0 implements CompletionHandler {
        C11391n0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.l$o */
    class C11392o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21009a;

        C11392o(C8327s sVar) {
            this.f21009a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31557P0(this.f21009a);
        }
    }

    /* renamed from: w3.l$o0 */
    class C11393o0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21011a;

        C11393o0(long j) {
            this.f21011a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31600l0(this.f21011a);
        }
    }

    /* renamed from: w3.l$p */
    class C11394p implements CompletionHandler {
        C11394p(C11363l lVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.l$q */
    class C11395q implements CompletionHandler {
        C11395q() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31555O0(true);
        }
    }

    /* renamed from: w3.l$r */
    class C11396r implements CompletionHandler {
        C11396r(C11363l lVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.l$s */
    class C11397s implements CompletionHandler {
        C11397s() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31551M0(true);
            C11363l.this.mo31657k2().mo31677p(true);
        }
    }

    /* renamed from: w3.l$t */
    class C11398t implements CompletionHandler {
        C11398t() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.l$u */
    class C11399u implements CompletionHandler {
        C11399u(C11363l lVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.l$v */
    class C11400v implements CompletionHandler {
        C11400v(C11363l lVar) {
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

    /* renamed from: w3.l$w */
    class C11401w implements Ceiling4Service.C6734s1 {
        C11401w() {
        }

        /* renamed from: a */
        public void mo32754a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11363l.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo32755b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11363l.this.mo23221d0().mo31611r(2) == null) {
                C11363l.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11363l.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo32756c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11363l.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo32757d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C11363l.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo32758e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11363l.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo32759f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11363l.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo32760g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C11363l.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo32761h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C11363l.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo32762i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C11363l.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C11363l.this.mo23221d0().mo31543I0(true);
                }
                C11363l.this.mo23221d0().mo31541H0(split[1]);
                C11363l.this.mo23221d0().mo31539G0(split[2]);
                C11363l.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C11363l.f20954Q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C11363l.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C11363l.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C11363l.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo32763j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgCtChanged: ");
            sb.append(l);
            C11363l.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: k */
        public void mo32764k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNLBrightChanged: ");
            sb.append(l);
            if (l.longValue() != 0) {
                C11363l.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
                C11363l.this.mo23221d0().mo31545J0(l.longValue());
                return;
            }
            C11363l.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: l */
        public void mo32765l(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgBrightChanged: ");
            sb.append(l);
            C11363l.this.mo31657k2().mo31672k(l.intValue());
        }

        /* renamed from: m */
        public void mo32766m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onMiBandSleepChanged: ");
            sb.append(l);
            C11363l.this.mo23221d0().mo31591h(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo32767n(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgRgbChanged: ");
            sb.append(l);
            C11363l.this.mo31657k2().mo31673l(l.intValue());
        }

        /* renamed from: o */
        public void mo32768o(Ceiling4Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11385k0.f20998b[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11363l.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11363l.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: p */
        public void mo32769p(Ceiling4Service.MainPower mainPower) {
            C6092b bVar;
            StringBuilder sb = new StringBuilder();
            sb.append("onMainPowerSwitched: ");
            sb.append(mainPower.name());
            int i = C11385k0.f20997a[mainPower.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C11363l.this.mo31657k2();
            } else if (i == 2) {
                bVar = C11363l.this.mo31657k2();
                z = false;
            } else {
                return;
            }
            bVar.mo31677p(z);
        }

        /* renamed from: q */
        public void mo32770q(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11363l.this.mo31657k2().mo31675n(C8308a.m19688b(str));
            }
        }

        /* renamed from: r */
        public void mo32771r(Long l) {
            if (l != null) {
                C11363l.this.mo23221d0().mo31598k0(l.longValue() == 1);
            }
        }

        /* renamed from: s */
        public void mo32772s(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgFlowingChanged: ");
            sb.append(l);
            C11363l.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: t */
        public void mo32773t(Ceiling4Service.BgPower bgPower) {
            C6092b bVar;
            StringBuilder sb = new StringBuilder();
            sb.append("onBgPowerChanged: ");
            sb.append(bgPower.name());
            int i = C11385k0.f20999c[bgPower.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C11363l.this.mo31657k2();
            } else if (i == 2) {
                bVar = C11363l.this.mo31657k2();
                z = false;
            } else {
                return;
            }
            bVar.mo31671j(z);
        }
    }

    /* renamed from: w3.l$x */
    class C11402x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21017a;

        C11402x(boolean z) {
            this.f21017a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31583d(this.f21017a);
        }
    }

    /* renamed from: w3.l$y */
    class C11403y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21019a;

        C11403y(int i) {
            this.f21019a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31547K0(this.f21019a);
        }
    }

    /* renamed from: w3.l$z */
    class C11404z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21021a;

        C11404z(boolean z) {
            this.f21021a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11363l.this.mo23221d0().mo31598k0(this.f21021a);
        }
    }

    public C11363l(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m28860r2(Ceiling4Service.MainPower mainPower, Ceiling4Service.Power power, Ceiling4Service.BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14) {
        Ceiling4Service.MainPower mainPower2 = mainPower;
        Ceiling4Service.Power power2 = power;
        Ceiling4Service.BgPower bgPower2 = bgPower;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == Ceiling4Service.Power.on);
        }
        if (mainPower2 != null) {
            mo31657k2().mo31677p(mainPower2 == Ceiling4Service.MainPower.on);
        }
        if (bgPower2 != null) {
            mo31657k2().mo31671j(bgPower2 == Ceiling4Service.BgPower.on);
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
            DeviceStatusBase d0 = mo23221d0();
            if (l14.longValue() != 1) {
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
            mo31477F1().toggle(new C11391n0());
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
            return R$drawable.icon_yeelight_device_badge_eos_pro_small;
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
            case 922669546:
                if (T.equals("yeelink.light.ceiling4")) {
                    c = 2;
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
                return R$drawable.icon_yeelight_device_badge_eos_pro_small;
            default:
                return R$drawable.icon_yeelight_device_badge_eos_pro_small;
        }
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_eos_pro_big;
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
            case 922669546:
                if (T.equals("yeelink.light.ceiling4")) {
                    c = 2;
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
                return R$drawable.icon_yeelight_device_badge_eos_pro_big;
            default:
                return R$drawable.icon_yeelight_device_badge_eos_pro_big;
        }
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11381i0();
        this.f12431y = new C11383j0();
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
            mo31477F1().sendCmd(Ceiling4Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11402x(z));
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
            Ceiling4Service q2 = mo31477F1();
            Ceiling4Service.CmdKey cmdKey = Ceiling4Service.CmdKey.nighttime;
            q2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C11371d0(str, str2, i));
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
            mo31477F1().sendCmd(Ceiling4Service.CmdKey.cfg_init_power, String.valueOf(i), new C11403y(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Ceiling4Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11395q());
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
        return mo42316s2(this.f20956B, this.f20957C);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20955A);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20954Q, "Invalid handler!");
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
            mo31477F1().sendCmd(Ceiling4Service.CmdKey.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11373e0(this));
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
            mo31477F1().setPower(Ceiling4Service.Power.off, new C11369c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11398t());
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
            mo31477F1().sendCmd(Ceiling4Service.CmdKey.nighttime, z ? "enable" : "disable", new C11365a0(z));
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
            mo31477F1().sendCmd(Ceiling4Service.CmdKey.pseudo_beacon, "4097|" + i, new C11379h0(this));
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
            Ceiling4Service q2 = mo31477F1();
            Ceiling4Service.CmdKey cmdKey = Ceiling4Service.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            q2.sendCmd(cmdKey, sb2.toString(), new C11367b0(z, str, str2, i));
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
            mo31477F1().setBgPower(Ceiling4Service.BgPower.off, new C11389m0());
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
            mo31477F1().setPower(Ceiling4Service.Power.on, new C11397s());
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
            mo31477F1().setBgPower(Ceiling4Service.BgPower.on, new C11387l0());
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
            mo31477F1().openWithMode(Ceiling4Service.MainPower.on, Ceiling4Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11375f0(i));
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
            mo31477F1().openBgWithMode(Ceiling4Service.BgPower.on, Ceiling4Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11377g0(i));
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
            mo31477F1().sendCmd(Ceiling4Service.CmdKey.cfg_bg_proact, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11404z(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: o2 */
    public boolean mo31661o2(C8327s sVar) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null && lanDevice.mo23118G2(sVar)) {
            return true;
        }
        if (sVar.mo35455v()) {
            try {
                mo31477F1().setBgFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11380i(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setBgScene("off", 0L, 0L, new C11382j(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setBgScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11384k(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setBgScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11386l(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35417B()) {
            try {
                mo31477F1().setBgScene("color", Long.valueOf((long) (sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) sVar.mo35439f()), new C11388m(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (sVar.mo35456w()) {
            try {
                mo31477F1().setBgFlowScene("cf", Long.valueOf((long) sVar.mo35444k()), Long.valueOf((long) sVar.mo35445l()), sVar.mo35447n(), new C11390n(sVar));
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
                mo31477F1().setSceneBundle(b0.get(0).mo35345Z(), b0.get(1).mo35345Z(), new C11392o(sVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f20954Q;
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
            mo31477F1().setBright(Long.valueOf(j), Ceiling4Service.Effect.smooth, 500L, new C11393o0(j));
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
    public Ceiling4Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice != null && (abstractDevice instanceof YeelightCeiling4Device)) {
            return ((YeelightCeiling4Device) abstractDevice).mDeviceService;
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
            mo31477F1().setCt(Long.valueOf((long) i), Ceiling4Service.Effect.smooth, 500L, new C11364a(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s2 */
    public boolean mo42316s2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling4Service.C6734s1)) {
            AppUtils.m8300u(f20954Q, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Ceiling4Service.C6734s1) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11394p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11396r(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20955A);
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
            if (jSONArray.length() != 20) {
                AppUtils.m8300u("BATCH_RPC", "CeilingDevice, Invalid length of batch rpc result: " + str2);
            }
            m28860r2(Ceiling4Service.MainPower.valueOf(jSONArray.getString(0)), Ceiling4Service.Power.valueOf(jSONArray.getString(1)), Ceiling4Service.BgPower.valueOf(jSONArray.getString(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), jSONArray.getString(14), Long.valueOf(jSONArray.getLong(15)), Long.valueOf(jSONArray.getLong(16)), Long.valueOf(jSONArray.getLong(17)), Long.valueOf(jSONArray.getLong(18)), Long.valueOf(jSONArray.getLong(19)));
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
                mo31477F1().getProperties(new C11378h());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11366b(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11368c(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11370d(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11372e(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C11374f(sVar));
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
                mo31477F1().setSceneBundle(b0.get(0).mo35345Z(), b0.get(1).mo35345Z(), new C11376g(sVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str = f20954Q;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("MainPower").getInternalName(), mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("BgPower").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("BgBright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("BgCt").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("BgFlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("NLBright").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty("MiBandSleep").getInternalName(), mo31477F1().getService().getProperty("BgRgb").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("BgFlowing").getInternalName(), mo31477F1().getService().getProperty("BgProact").getInternalName()};
    }
}
