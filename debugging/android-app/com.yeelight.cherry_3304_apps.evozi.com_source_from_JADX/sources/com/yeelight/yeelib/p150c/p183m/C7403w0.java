package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.MonoService;
import com.yeelight.yeelib.device.xiaomi.YeelightMonoDevice;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p185d.C7565b;
import com.yeelight.yeelib.utils.C4308b;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.c.m.w0 */
public class C7403w0 extends C6006h {

    /* renamed from: G */
    public static final String f14995G = "w0";

    /* renamed from: A */
    CompletionHandler f14996A = new C7410g(this);

    /* renamed from: B */
    MonoService.C9298m0 f14997B = new C7411h();

    /* renamed from: z */
    CompletionHandler f14998z = new C7409f(this);

    /* renamed from: com.yeelight.yeelib.c.m.w0$a */
    class C7404a implements CompletionHandler {
        C7404a(C7403w0 w0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$b */
    class C7405b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14999a;

        C7405b(boolean z) {
            this.f14999a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27652M0(this.f14999a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$c */
    class C7406c implements CompletionHandler {
        C7406c(C7403w0 w0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$d */
    class C7407d implements CompletionHandler {
        C7407d() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$e */
    class C7408e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f15002a;

        C7408e(int i) {
            this.f15002a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27648K0(true);
            C7403w0 w0Var = C7403w0.this;
            w0Var.mo23352w1(w0Var.mo23433j1(this.f15002a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$f */
    class C7409f implements CompletionHandler {
        C7409f(C7403w0 w0Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$g */
    class C7410g implements CompletionHandler {
        C7410g(C7403w0 w0Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$h */
    class C7411h implements MonoService.C9298m0 {
        C7411h() {
        }

        /* renamed from: a */
        public void mo28771a(Long l) {
            "onBrightChanged: " + l;
            C7403w0.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28772b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C7403w0.this.mo23408d0().mo27710r(2) == null) {
                C7403w0.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C7403w0.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28773c(Long l) {
            "onFlowingChanged: " + l;
            C7403w0.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28774d(Long l) {
            "onSaveStateChanged: " + l;
            C7403w0.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28775e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C7403w0.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28776f(Long l) {
            "onOnFromPowerChanged: " + l;
            C7403w0.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28777g(Long l) {
            "onLanModeChanged: " + l;
            C7403w0.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28778h(MonoService.C9296l0 l0Var) {
            C6024e eVar;
            "onPowerSwitched: " + l0Var.name();
            int i = C7416m.f15011a[l0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C7403w0.this.mo23408d0();
            } else if (i == 2) {
                eVar = C7403w0.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$i */
    class C7412i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f15005a;

        C7412i(boolean z) {
            this.f15005a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27682d(this.f15005a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$j */
    class C7413j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f15007a;

        C7413j(int i) {
            this.f15007a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27644I0(this.f15007a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$k */
    class C7414k implements MonoService.C9288h0 {
        C7414k() {
        }

        /* renamed from: a */
        public void mo28779a(MonoService.C9296l0 l0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(l0Var != null ? l0Var.name() : "null");
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            Long l8 = l;
            sb2.append(l);
            sb2.toString();
            "temperature: " + l2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lanMode: ");
            Long l9 = l5;
            sb3.append(l9);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onFromPower: ");
            Long l10 = l6;
            sb4.append(l10);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            Long l11 = l3;
            sb5.append(l11);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("saveState: ");
            Long l12 = l4;
            sb6.append(l12);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowParams: ");
            String str2 = str;
            sb7.append(str2);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("flowing: ");
            Long l13 = l7;
            sb8.append(l13);
            sb8.toString();
            C7403w0.this.m21864Z1(l0Var, l, l2, l11, l12, str2, l9, l10, l13);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$l */
    class C7415l implements C6006h.C6016j {
        C7415l() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C7403w0.this.f14997B.mo28771a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C7403w0.this.f14997B.mo28778h(MonoService.C9296l0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$m */
    static /* synthetic */ class C7416m {

        /* renamed from: a */
        static final /* synthetic */ int[] f15011a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.MonoService$l0[] r0 = com.yeelight.yeelib.device.xiaomi.MonoService.C9296l0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15011a = r0
                com.yeelight.yeelib.device.xiaomi.MonoService$l0 r1 = com.yeelight.yeelib.device.xiaomi.MonoService.C9296l0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15011a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.MonoService$l0 r1 = com.yeelight.yeelib.device.xiaomi.MonoService.C9296l0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7403w0.C7416m.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$n */
    class C7417n implements CompletionHandler {
        C7417n() {
        }

        public void onFailed(int i, String str) {
            String.format("MonoDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$o */
    class C7418o implements CompletionHandler {
        C7418o() {
        }

        public void onFailed(int i, String str) {
            String.format("MonoDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$p */
    class C7419p implements CompletionHandler {
        C7419p() {
        }

        public void onFailed(int i, String str) {
            String.format("MonoDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$q */
    class C7420q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f15015a;

        C7420q(long j) {
            this.f15015a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27697k0(this.f15015a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$r */
    class C7421r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15017a;

        C7421r(C9856y yVar) {
            this.f15017a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27654N0(this.f15017a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$s */
    class C7422s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15019a;

        C7422s(C9856y yVar) {
            this.f15019a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27654N0(this.f15019a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$t */
    class C7423t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15021a;

        C7423t(C9856y yVar) {
            this.f15021a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27654N0(this.f15021a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w0$u */
    class C7424u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15023a;

        C7424u(C9856y yVar) {
            this.f15023a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7403w0.this.mo23408d0().mo27654N0(this.f15023a);
        }
    }

    public C7403w0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        C7565b bVar = C7565b.DEVICE_EVENT_OPEN;
        C7565b bVar2 = C7565b.DEVICE_EVENT_CLOSE;
        C7565b bVar3 = C7565b.DEVICE_EVENT_BRIGHT_CHANGE;
        C7563a aVar = C7563a.ON;
        C7563a aVar2 = C7563a.OFF;
        C7563a aVar3 = C7563a.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public void m21864Z1(MonoService.C9296l0 l0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7) {
        boolean z = true;
        if (l0Var != null) {
            mo23408d0().mo27648K0(l0Var == MonoService.C9296l0.on);
        }
        if (l != null) {
            mo23408d0().mo27697k0(l.longValue());
        }
        if (l2 != null) {
            mo23408d0().mo27658P0(l2.intValue());
        }
        if (l3 != null) {
            if (mo23408d0().mo27710r(2) == null) {
                mo23408d0().mo27676a(new C7554e(l3.intValue(), l3.intValue()));
            } else {
                mo23408d0().mo27670V0(l3.intValue());
            }
        }
        if (l6 != null) {
            mo23408d0().mo27644I0(l6.intValue());
        }
        mo23408d0().mo27652M0(l4 != null && l4.longValue() == 1);
        mo23408d0().mo27682d(l5 != null && l5.longValue() == 1);
        C6024e d0 = mo23408d0();
        if (l7.longValue() == 0) {
            z = false;
        }
        d0.mo27715t0(z);
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C7419p());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: F */
    public int mo23303F() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_dolphin_small;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -948847040:
                if (T.equals("yeelink.light.panel1")) {
                    c = 5;
                    break;
                }
                break;
            case -448603205:
                if (T.equals("yeelink.light.mono1")) {
                    c = 0;
                    break;
                }
                break;
            case -448603202:
                if (T.equals("yeelink.light.mono4")) {
                    c = 2;
                    break;
                }
                break;
            case -448603201:
                if (T.equals("yeelink.light.mono5")) {
                    c = 4;
                    break;
                }
                break;
            case -448603157:
                if (T.equals("yeelink.light.monoa")) {
                    c = 1;
                    break;
                }
                break;
            case -448603156:
                if (T.equals("yeelink.light.monob")) {
                    c = 3;
                    break;
                }
                break;
        }
        return (c == 0 || c == 1) ? R$drawable.icon_yeelight_device_badge_dolphin_small : (c == 2 || c == 3) ? R$drawable.icon_yeelight_device_badge_mono4_small : c != 4 ? c != 5 ? R$drawable.icon_yeelight_device_badge_dolphin_small : R$drawable.icon_yeelight_device_badge_panel_small : R$drawable.icon_yeelight_device_badge_mono5_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_dolphin_big;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -948847040:
                if (T.equals("yeelink.light.panel1")) {
                    c = 5;
                    break;
                }
                break;
            case -448603205:
                if (T.equals("yeelink.light.mono1")) {
                    c = 0;
                    break;
                }
                break;
            case -448603202:
                if (T.equals("yeelink.light.mono4")) {
                    c = 2;
                    break;
                }
                break;
            case -448603201:
                if (T.equals("yeelink.light.mono5")) {
                    c = 4;
                    break;
                }
                break;
            case -448603157:
                if (T.equals("yeelink.light.monoa")) {
                    c = 1;
                    break;
                }
                break;
            case -448603156:
                if (T.equals("yeelink.light.monob")) {
                    c = 3;
                    break;
                }
                break;
        }
        return (c == 0 || c == 1) ? R$drawable.icon_yeelight_device_badge_dolphin_big : (c == 2 || c == 3) ? R$drawable.icon_yeelight_device_badge_mono4_big : c != 4 ? c != 5 ? R$drawable.icon_yeelight_device_badge_dolphin_big : R$drawable.icon_yeelight_device_badge_panel_big : R$drawable.icon_yeelight_device_badge_mono5_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C7415l();
    }

    /* renamed from: M0 */
    public void mo23383M0(AbstractDevice abstractDevice) {
        super.mo23383M0(abstractDevice);
        if (abstractDevice.isOnline()) {
            mo27575U1();
        } else {
            mo27576V1();
        }
    }

    /* renamed from: M1 */
    public boolean mo27567M1(boolean z) {
        "setGeekMode --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(MonoService.C9311z.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7412i(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: R1 */
    public boolean mo27572R1(int i) {
        "setOnFromPower --> Invoke, value : " + i;
        try {
            mo27560F1().sendCmd(MonoService.C9311z.cfg_init_power, String.valueOf(i), new C7413j(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(MonoService.C9311z.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7405b(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_mono) : U;
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28770a2(this.f14996A, this.f14997B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14998z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14995G, "Invalid handler!");
        }
        if (this.f7251n == null) {
            return true;
        }
        try {
            mo27560F1().unsubscribeNotifications((CompletionHandler) obj);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: Y1 */
    public MonoService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightMonoDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo28770a2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof MonoService.C9298m0)) {
            C4308b.m12139r(f14995G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (MonoService.C9298m0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        if (super.mo23326b1()) {
            return true;
        }
        try {
            mo27560F1().setPower(MonoService.C9296l0.off, new C7418o());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        if (super.mo23327c1()) {
            return true;
        }
        try {
            mo27560F1().delCron(0L, new C7407d());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(MonoService.C9296l0.on, new C7417n());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        if (super.mo23336m1(i)) {
            return true;
        }
        try {
            mo27560F1().openWithMode(MonoService.C9296l0.on, MonoService.C9274a0.smooth, 500L, Long.valueOf((long) i), new C7408e(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        if (super.mo23340p1(j)) {
            return true;
        }
        try {
            mo27560F1().setBright(Long.valueOf(j), MonoService.C9274a0.smooth, 500L, new C7420q(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        return false;
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        if (super.mo23346t1()) {
            return true;
        }
        try {
            mo27560F1().setDefault(new C7404a(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        if (super.mo23348u1(i)) {
            return true;
        }
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C7406c(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14998z);
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 9) {
                C4308b.m12139r("BATCH_RPC", "MonoDevice, Invalid length of batch rpc result: " + str);
            }
            m21864Z1(MonoService.C9296l0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        boolean x = super.mo23353x(i, obj);
        if (i == 5) {
            mo23356y0();
        } else if (i == 7) {
            mo23317U0();
        } else if (i == 10) {
            C7554e eVar = (C7554e) obj;
            mo23348u1(eVar.mo28881b());
            mo23408d0().mo27676a(eVar);
        } else if (i == 14) {
            mo23327c1();
        }
        return x;
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        if (super.mo23354x0()) {
            return true;
        }
        if (this.f7251n.getOwnership() == Device.Ownership.MINE || this.f7251n.getOwnership() == Device.Ownership.OTHERS) {
            try {
                mo27560F1().getProperties(new C7414k());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        if (super.mo23355x1(yVar)) {
            return true;
        }
        if (yVar.mo31890v()) {
            try {
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7421r(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C7422s(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C7423t(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C7424u(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f14995G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Temperature").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName()};
    }
}
