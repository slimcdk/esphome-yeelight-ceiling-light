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
import com.yeelight.yeelib.device.xiaomi.Ceiling19Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling19Device;
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

/* renamed from: w3.h */
public class C10998h extends C6091a {

    /* renamed from: Q */
    public static final String f20410Q = "h";

    /* renamed from: A */
    CompletionHandler f20411A = new C11035u(this);

    /* renamed from: B */
    CompletionHandler f20412B = new C11036v(this);

    /* renamed from: C */
    Ceiling19Service.C6526u1 f20413C = new C11037w();

    /* renamed from: w3.h$a */
    class C10999a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20414a;

        C10999a(int i) {
            this.f20414a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31610q0(this.f20414a);
        }
    }

    /* renamed from: w3.h$a0 */
    class C11000a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20416a;

        C11000a0(boolean z) {
            this.f20416a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31543I0(this.f20416a);
        }
    }

    /* renamed from: w3.h$b */
    class C11001b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20418a;

        C11001b(C8327s sVar) {
            this.f20418a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31557P0(this.f20418a);
        }
    }

    /* renamed from: w3.h$b0 */
    class C11002b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20420a;

        /* renamed from: b */
        final /* synthetic */ String f20421b;

        /* renamed from: c */
        final /* synthetic */ String f20422c;

        /* renamed from: d */
        final /* synthetic */ int f20423d;

        C11002b0(boolean z, String str, String str2, int i) {
            this.f20420a = z;
            this.f20421b = str;
            this.f20422c = str2;
            this.f20423d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31543I0(this.f20420a);
            C10998h.this.mo23221d0().mo31541H0(this.f20421b);
            C10998h.this.mo23221d0().mo31539G0(this.f20422c);
            C10998h.this.mo23221d0().mo31537F0(this.f20423d);
        }
    }

    /* renamed from: w3.h$c */
    class C11003c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20425a;

        C11003c(C8327s sVar) {
            this.f20425a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31557P0(this.f20425a);
        }
    }

    /* renamed from: w3.h$c0 */
    class C11004c0 implements CompletionHandler {
        C11004c0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31551M0(false);
            C10998h.this.mo31657k2().mo31677p(false);
        }
    }

    /* renamed from: w3.h$d */
    class C11005d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20428a;

        C11005d(C8327s sVar) {
            this.f20428a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31557P0(this.f20428a);
        }
    }

    /* renamed from: w3.h$d0 */
    class C11006d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f20430a;

        /* renamed from: b */
        final /* synthetic */ String f20431b;

        /* renamed from: c */
        final /* synthetic */ int f20432c;

        C11006d0(String str, String str2, int i) {
            this.f20430a = str;
            this.f20431b = str2;
            this.f20432c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31541H0(this.f20430a);
            C10998h.this.mo23221d0().mo31539G0(this.f20431b);
            C10998h.this.mo23221d0().mo31537F0(this.f20432c);
        }
    }

    /* renamed from: w3.h$e */
    class C11007e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20434a;

        C11007e(C8327s sVar) {
            this.f20434a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31557P0(this.f20434a);
        }
    }

    /* renamed from: w3.h$e0 */
    class C11008e0 implements CompletionHandler {
        C11008e0(C10998h hVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.h$f */
    class C11009f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20436a;

        C11009f(C8327s sVar) {
            this.f20436a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31557P0(this.f20436a);
        }
    }

    /* renamed from: w3.h$f0 */
    class C11010f0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20438a;

        C11010f0(int i) {
            this.f20438a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31551M0(true);
            C10998h.this.mo31657k2().mo31677p(true);
            C10998h.this.mo23165w1(DeviceStatusBase.DeviceMode.values()[this.f20438a]);
        }
    }

    /* renamed from: w3.h$g */
    class C11011g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20440a;

        C11011g(C8327s sVar) {
            this.f20440a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31557P0(this.f20440a);
        }
    }

    /* renamed from: w3.h$g0 */
    class C11012g0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20442a;

        C11012g0(int i) {
            this.f20442a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openBgWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo31657k2().mo31671j(true);
            C10998h.this.mo31657k2().mo31678q(C10998h.this.mo23247j1(this.f20442a));
        }
    }

    /* renamed from: w3.h$h */
    class C11013h implements Ceiling19Service.C6514q1 {
        C11013h() {
        }

        /* renamed from: a */
        public void mo32421a(Ceiling19Service.MainPower mainPower, Ceiling19Service.Power power, Ceiling19Service.BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15) {
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
            Long l16 = l2;
            sb5.append(l16);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("ct: ");
            Long l17 = l3;
            sb6.append(l17);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("bg_ct: ");
            Long l18 = l4;
            sb7.append(l18);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("lanMode: ");
            Long l19 = l6;
            sb8.append(l19);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("saveState: ");
            Long l20 = l7;
            sb9.append(l20);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("delayoff: ");
            Long l21 = l5;
            sb10.append(l21);
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
            StringBuilder sb21 = new StringBuilder();
            sb21.append("smartSwitch: ");
            sb21.append(l15);
            C10998h.this.m28110r2(mainPower, power, bgPower, l, l16, l17, l18, l21, str5, str6, l19, l20, l8, l9, str3, l10, l11, l12, l13, l14, l15);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.h$h0 */
    class C11014h0 implements CompletionHandler {
        C11014h0(C10998h hVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.h$i */
    class C11015i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20445a;

        C11015i(C8327s sVar) {
            this.f20445a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo31657k2().mo31679r(this.f20445a);
        }
    }

    /* renamed from: w3.h$i0 */
    class C11016i0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20447a;

        C11016i0(boolean z) {
            this.f20447a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31597k(this.f20447a);
        }
    }

    /* renamed from: w3.h$j */
    class C11017j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20449a;

        C11017j(C8327s sVar) {
            this.f20449a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31557P0(this.f20449a);
        }
    }

    /* renamed from: w3.h$j0 */
    class C11018j0 implements WifiDeviceBase.C6080i {
        C11018j0() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C10998h.this.f20413C.mo32429a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C10998h.this.f20413C.mo32436h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
            C10998h.this.f20413C.mo32439k(l);
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C10998h.this.f20413C.mo32449u(Ceiling19Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.h$k */
    class C11019k implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20452a;

        C11019k(C8327s sVar) {
            this.f20452a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo31657k2().mo31679r(this.f20452a);
        }
    }

    /* renamed from: w3.h$k0 */
    class C11020k0 implements WifiDeviceBase.C6079h {
        C11020k0() {
        }

        /* renamed from: j */
        public void mo31495j(Long l) {
            C10998h.this.f20413C.mo32438j(l);
        }

        /* renamed from: l */
        public void mo31496l(Long l) {
            C10998h.this.f20413C.mo32440l(l);
        }

        /* renamed from: n */
        public void mo31497n(Long l) {
            C10998h.this.f20413C.mo32442n(l);
        }

        /* renamed from: o */
        public void mo31498o(WifiDeviceBase.Power power) {
            C10998h.this.f20413C.mo32448t(Ceiling19Service.BgPower.valueOf(power.toString()));
        }

        /* renamed from: p */
        public void mo31499p(WifiDeviceBase.Power power) {
            C10998h.this.f20413C.mo32444p(Ceiling19Service.MainPower.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.h$l */
    class C11021l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20455a;

        C11021l(C8327s sVar) {
            this.f20455a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo31657k2().mo31679r(this.f20455a);
        }
    }

    /* renamed from: w3.h$l0 */
    static /* synthetic */ class C11022l0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20457a;

        /* renamed from: b */
        static final /* synthetic */ int[] f20458b;

        /* renamed from: c */
        static final /* synthetic */ int[] f20459c;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$BgPower[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.BgPower.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20459c = r0
                r1 = 1
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$BgPower r2 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.BgPower.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f20459c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$BgPower r3 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.BgPower.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$Power[] r2 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.Power.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f20458b = r2
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$Power r3 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.Power.on     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f20458b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$Power r3 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.Power.off     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$MainPower[] r2 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.MainPower.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f20457a = r2
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$MainPower r3 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.MainPower.on     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f20457a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$MainPower r2 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.MainPower.off     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C10998h.C11022l0.<clinit>():void");
        }
    }

    /* renamed from: w3.h$m */
    class C11023m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20460a;

        C11023m(C8327s sVar) {
            this.f20460a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo31657k2().mo31679r(this.f20460a);
        }
    }

    /* renamed from: w3.h$m0 */
    class C11024m0 implements CompletionHandler {
        C11024m0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.openBg --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo31657k2().mo31671j(true);
        }
    }

    /* renamed from: w3.h$n */
    class C11025n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20463a;

        C11025n(C8327s sVar) {
            this.f20463a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo31657k2().mo31679r(this.f20463a);
        }
    }

    /* renamed from: w3.h$n0 */
    class C11026n0 implements CompletionHandler {
        C11026n0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.closeBg --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo31657k2().mo31671j(false);
        }
    }

    /* renamed from: w3.h$o */
    class C11027o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f20466a;

        C11027o(C8327s sVar) {
            this.f20466a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31557P0(this.f20466a);
        }
    }

    /* renamed from: w3.h$o0 */
    class C11028o0 implements CompletionHandler {
        C11028o0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.h$p */
    class C11029p implements CompletionHandler {
        C11029p(C10998h hVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.h$p0 */
    class C11030p0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f20469a;

        C11030p0(long j) {
            this.f20469a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31600l0(this.f20469a);
        }
    }

    /* renamed from: w3.h$q */
    class C11031q implements CompletionHandler {
        C11031q() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31555O0(true);
        }
    }

    /* renamed from: w3.h$r */
    class C11032r implements CompletionHandler {
        C11032r(C10998h hVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.h$s */
    class C11033s implements CompletionHandler {
        C11033s() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31551M0(true);
            C10998h.this.mo31657k2().mo31677p(true);
        }
    }

    /* renamed from: w3.h$t */
    class C11034t implements CompletionHandler {
        C11034t() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.h$u */
    class C11035u implements CompletionHandler {
        C11035u(C10998h hVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.h$v */
    class C11036v implements CompletionHandler {
        C11036v(C10998h hVar) {
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

    /* renamed from: w3.h$w */
    class C11037w implements Ceiling19Service.C6526u1 {
        C11037w() {
        }

        /* renamed from: a */
        public void mo32429a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C10998h.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo32430b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("ondelayoffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C10998h.this.mo23221d0().mo31611r(2) == null) {
                C10998h.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C10998h.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo32431c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C10998h.this.mo23221d0().mo31555O0(l != null && l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo32432d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            C10998h.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo32433e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C10998h.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo32434f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C10998h.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo32435g(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLanModeChanged: ");
            sb.append(l);
            C10998h.this.mo23221d0().mo31583d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo32436h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C10998h.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: i */
        public void mo32437i(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNightTimeInfoChanged: ");
            sb.append(str);
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C10998h.this.mo23221d0().mo31543I0(false);
                } else if (split[0].equals("enable")) {
                    C10998h.this.mo23221d0().mo31543I0(true);
                }
                C10998h.this.mo23221d0().mo31541H0(split[1]);
                C10998h.this.mo23221d0().mo31539G0(split[2]);
                C10998h.this.mo23221d0().mo31537F0(Integer.parseInt(split[3]));
                String str2 = C10998h.f20410Q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start = ");
                sb2.append(C10998h.this.mo23221d0().mo31534E());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(C10998h.this.mo23221d0().mo31532D());
                sb2.append(", ");
                sb2.append(C10998h.this.mo23221d0().mo31530C());
            }
        }

        /* renamed from: j */
        public void mo32438j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgCtChanged: ");
            sb.append(l);
            C10998h.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: k */
        public void mo32439k(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNLBrightChanged: ");
            sb.append(l);
            if (l.longValue() != 0) {
                C10998h.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT);
                C10998h.this.mo23221d0().mo31545J0(l.longValue());
                return;
            }
            C10998h.this.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: l */
        public void mo32440l(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgBrightChanged: ");
            sb.append(l);
            C10998h.this.mo31657k2().mo31672k(l.intValue());
        }

        /* renamed from: m */
        public void mo32441m(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onMiBandSleepChanged: ");
            sb.append(l);
            C10998h.this.mo23221d0().mo31591h(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo32442n(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgRgbChanged: ");
            sb.append(l);
            C10998h.this.mo31657k2().mo31673l(l.intValue());
        }

        /* renamed from: o */
        public void mo32443o(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("smartSwitch: ");
            sb.append(l);
            C10998h.this.mo23221d0().mo31597k(l != null && l.longValue() == 1);
        }

        /* renamed from: p */
        public void mo32444p(Ceiling19Service.MainPower mainPower) {
            C6092b bVar;
            StringBuilder sb = new StringBuilder();
            sb.append("onMainPowerSwitched: ");
            sb.append(mainPower.name());
            int i = C11022l0.f20457a[mainPower.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C10998h.this.mo31657k2();
            } else if (i == 2) {
                bVar = C10998h.this.mo31657k2();
                z = false;
            } else {
                return;
            }
            bVar.mo31677p(z);
        }

        /* renamed from: q */
        public void mo32445q(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C10998h.this.mo31657k2().mo31675n(C8308a.m19688b(str));
            }
        }

        /* renamed from: r */
        public void mo32446r(Long l) {
            if (l != null) {
                C10998h.this.mo23221d0().mo31598k0(l.longValue() == 1);
            }
        }

        /* renamed from: s */
        public void mo32447s(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBgFlowingChanged: ");
            sb.append(l);
            C10998h.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: t */
        public void mo32448t(Ceiling19Service.BgPower bgPower) {
            C6092b bVar;
            StringBuilder sb = new StringBuilder();
            sb.append("onBgPowerChanged: ");
            sb.append(bgPower.name());
            int i = C11022l0.f20459c[bgPower.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C10998h.this.mo31657k2();
            } else if (i == 2) {
                bVar = C10998h.this.mo31657k2();
                z = false;
            } else {
                return;
            }
            bVar.mo31671j(z);
        }

        /* renamed from: u */
        public void mo32449u(Ceiling19Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerSwitched: ");
            sb.append(power.name());
            int i = C11022l0.f20458b[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C10998h.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C10998h.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }
    }

    /* renamed from: w3.h$x */
    class C11038x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20475a;

        C11038x(boolean z) {
            this.f20475a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31583d(this.f20475a);
        }
    }

    /* renamed from: w3.h$y */
    class C11039y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f20477a;

        C11039y(int i) {
            this.f20477a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31547K0(this.f20477a);
        }
    }

    /* renamed from: w3.h$z */
    class C11040z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f20479a;

        C11040z(boolean z) {
            this.f20479a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C10998h.this.mo23221d0().mo31598k0(this.f20479a);
        }
    }

    public C10998h(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m28110r2(Ceiling19Service.MainPower mainPower, Ceiling19Service.Power power, Ceiling19Service.BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15) {
        Ceiling19Service.MainPower mainPower2 = mainPower;
        Ceiling19Service.Power power2 = power;
        Ceiling19Service.BgPower bgPower2 = bgPower;
        boolean z = true;
        if (power2 != null) {
            mo23221d0().mo31551M0(power2 == Ceiling19Service.Power.on);
        }
        if (mainPower2 != null) {
            mo31657k2().mo31677p(mainPower2 == Ceiling19Service.MainPower.on);
        }
        if (bgPower2 != null) {
            mo31657k2().mo31671j(bgPower2 == Ceiling19Service.BgPower.on);
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
            mo23221d0().mo31598k0(l14.longValue() == 1);
        }
        DeviceStatusBase d0 = mo23221d0();
        if (l15 == null || l15.longValue() != 1) {
            z = false;
        }
        d0.mo31597k(z);
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11028o0());
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
        this.f12430x = new C11018j0();
        this.f12431y = new C11020k0();
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
            mo31477F1().sendCmd(Ceiling19Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11038x(z));
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
            Ceiling19Service q2 = mo31477F1();
            Ceiling19Service.CmdKey cmdKey = Ceiling19Service.CmdKey.nighttime;
            q2.sendCmd(cmdKey, "set|" + str + "|" + str2 + "|" + i, new C11006d0(str, str2, i));
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
            mo31477F1().sendCmd(Ceiling19Service.CmdKey.cfg_init_power, String.valueOf(i), new C11039y(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Ceiling19Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11031q());
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
        return mo42288s2(this.f20412B, this.f20413C);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f20411A);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f20410Q, "Invalid handler!");
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
            mo31477F1().sendCmd(Ceiling19Service.CmdKey.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11008e0(this));
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
            mo31477F1().setPower(Ceiling19Service.Power.off, new C11004c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11034t());
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
            mo31477F1().sendCmd(Ceiling19Service.CmdKey.nighttime, z ? "enable" : "disable", new C11000a0(z));
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
            mo31477F1().sendCmd(Ceiling19Service.CmdKey.pseudo_beacon, "4097|" + i, new C11014h0(this));
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
            Ceiling19Service q2 = mo31477F1();
            Ceiling19Service.CmdKey cmdKey = Ceiling19Service.CmdKey.nighttime;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "enable" : "disable");
            sb2.append("|");
            sb2.append(str);
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i);
            q2.sendCmd(cmdKey, sb2.toString(), new C11002b0(z, str, str2, i));
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
            mo31477F1().setBgPower(Ceiling19Service.BgPower.off, new C11026n0());
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
            mo31477F1().setPower(Ceiling19Service.Power.on, new C11033s());
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
            mo31477F1().setBgPower(Ceiling19Service.BgPower.on, new C11024m0());
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
            mo31477F1().openWithMode(Ceiling19Service.MainPower.on, Ceiling19Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11010f0(i));
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
            mo31477F1().openBgWithMode(Ceiling19Service.BgPower.on, Ceiling19Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11012g0(i));
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
            mo31477F1().sendCmd(Ceiling19Service.CmdKey.cfg_bg_proact, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11040z(z));
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
                mo31477F1().setBgFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11015i(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setBgScene("off", 0L, 0L, new C11017j(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setBgScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11019k(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setBgScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11021l(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35417B()) {
            try {
                mo31477F1().setBgScene("color", Long.valueOf((long) (sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) sVar.mo35439f()), new C11023m(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (sVar.mo35456w()) {
            try {
                mo31477F1().setBgFlowScene("cf", Long.valueOf((long) sVar.mo35444k()), Long.valueOf((long) sVar.mo35445l()), sVar.mo35447n(), new C11025n(sVar));
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
                mo31477F1().setSceneBundle(b0.get(0).mo35345Z(), b0.get(1).mo35345Z(), new C11027o(sVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f20410Q;
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
            mo31477F1().setBright(Long.valueOf(j), Ceiling19Service.Effect.smooth, 500L, new C11030p0(j));
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
    public Ceiling19Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice != null && (abstractDevice instanceof YeelightCeiling19Device)) {
            return ((YeelightCeiling19Device) abstractDevice).mDeviceService;
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
            mo31477F1().setCt(Long.valueOf((long) i), Ceiling19Service.Effect.smooth, 500L, new C10999a(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s2 */
    public boolean mo42288s2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling19Service.C6526u1)) {
            AppUtils.m8300u(f20410Q, "Invalid handler or listener!");
        }
        if (mo31477F1() == null) {
            return true;
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Ceiling19Service.C6526u1) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11029p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11032r(this));
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
            mo31477F1().sendCmd(Ceiling19Service.CmdKey.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11016i0(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f20411A);
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
            if (jSONArray.length() != 21) {
                AppUtils.m8300u("BATCH_RPC", "CeilingDevice, Invalid length of batch rpc result: " + str2);
            }
            m28110r2(Ceiling19Service.MainPower.valueOf(jSONArray.getString(0)), Ceiling19Service.Power.valueOf(jSONArray.getString(1)), Ceiling19Service.BgPower.valueOf(jSONArray.getString(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), jSONArray.getString(14), Long.valueOf(jSONArray.getLong(15)), Long.valueOf(jSONArray.getLong(16)), Long.valueOf(jSONArray.getLong(17)), Long.valueOf(jSONArray.getLong(18)), Long.valueOf(jSONArray.getLong(19)), Long.valueOf(jSONArray.getLong(20)));
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
                mo31477F1().getProperties(new C11013h());
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
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11001b(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11003c(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11005d(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11007e(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35421F()) {
            try {
                mo31477F1().setNLScene("nightlight", Long.valueOf((long) sVar.mo35439f()), new C11009f(sVar));
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
                mo31477F1().setSceneBundle(b0.get(0).mo35345Z(), b0.get(1).mo35345Z(), new C11011g(sVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str = f20410Q;
            AppUtils.m8300u(str, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("MainPower").getInternalName(), mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("BgPower").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("BgBright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("BgCt").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("BgFlowParams").getInternalName(), mo31477F1().getService().getProperty("LanMode").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName(), mo31477F1().getService().getProperty("NLBright").getInternalName(), mo31477F1().getService().getProperty("NightTimeInfo").getInternalName(), mo31477F1().getService().getProperty("MiBandSleep").getInternalName(), mo31477F1().getService().getProperty("BgRgb").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("BgFlowing").getInternalName(), mo31477F1().getService().getProperty("BgProact").getInternalName(), mo31477F1().getService().getProperty("SmartSwitch").getInternalName()};
    }
}
