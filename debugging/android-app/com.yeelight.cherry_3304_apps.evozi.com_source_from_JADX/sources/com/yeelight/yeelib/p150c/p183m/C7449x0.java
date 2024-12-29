package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.MonobService;
import com.yeelight.yeelib.device.xiaomi.YeelightMonobDevice;
import com.yeelight.yeelib.p150c.C4191d;
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

/* renamed from: com.yeelight.yeelib.c.m.x0 */
public class C7449x0 extends C6006h {

    /* renamed from: G */
    public static final String f15059G = "x0";

    /* renamed from: A */
    CompletionHandler f15060A = new C7456g(this);

    /* renamed from: B */
    MonobService.C9339n0 f15061B = new C7457h();

    /* renamed from: z */
    CompletionHandler f15062z = new C7455f(this);

    /* renamed from: com.yeelight.yeelib.c.m.x0$a */
    class C7450a implements CompletionHandler {
        C7450a(C7449x0 x0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$b */
    class C7451b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f15063a;

        C7451b(boolean z) {
            this.f15063a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27652M0(this.f15063a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$c */
    class C7452c implements CompletionHandler {
        C7452c(C7449x0 x0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$d */
    class C7453d implements CompletionHandler {
        C7453d() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$e */
    class C7454e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f15066a;

        C7454e(int i) {
            this.f15066a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27648K0(true);
            C7449x0 x0Var = C7449x0.this;
            x0Var.mo23352w1(x0Var.mo23433j1(this.f15066a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$f */
    class C7455f implements CompletionHandler {
        C7455f(C7449x0 x0Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$g */
    class C7456g implements CompletionHandler {
        C7456g(C7449x0 x0Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$h */
    class C7457h implements MonobService.C9339n0 {
        C7457h() {
        }

        /* renamed from: a */
        public void mo28797a(Long l) {
            "onBrightChanged: " + l;
            C7449x0.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28798b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C7449x0.this.mo23408d0().mo27710r(2) == null) {
                C7449x0.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C7449x0.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28799c(Long l) {
            "onFlowingChanged: " + l;
            C7449x0.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28800d(Long l) {
            "onSaveStateChanged: " + l;
            C7449x0.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28801e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C7449x0.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28802f(Long l) {
            "onOnFromPowerChanged: " + l;
            C7449x0.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28803g(Long l) {
            "onLanModeChanged: " + l;
            C7449x0.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28804h(MonobService.C9337m0 m0Var) {
            C6024e eVar;
            "onPowerSwitched: " + m0Var.name();
            int i = C7463n.f15077a[m0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C7449x0.this.mo23408d0();
            } else if (i == 2) {
                eVar = C7449x0.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: q */
        public void mo28805q(Long l) {
            "onTransIntervalDfltChanged: " + l;
            C7449x0.this.mo23408d0().mo27662R0(l.longValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$i */
    class C7458i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f15069a;

        C7458i(boolean z) {
            this.f15069a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27682d(this.f15069a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$j */
    class C7459j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f15071a;

        C7459j(long j) {
            this.f15071a = j;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27662R0(this.f15071a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$k */
    class C7460k implements MonobService.C9329i0 {
        C7460k() {
        }

        /* renamed from: a */
        public void mo28806a(MonobService.C9337m0 m0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(m0Var != null ? m0Var.name() : "null");
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            Long l8 = l;
            sb2.append(l);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lanMode: ");
            Long l9 = l4;
            sb3.append(l9);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onFromPower: ");
            Long l10 = l6;
            sb4.append(l10);
            sb4.toString();
            "delayoff: " + l2;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("saveState: ");
            Long l11 = l3;
            sb5.append(l11);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowParams: ");
            String str2 = str;
            sb6.append(str2);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowing: ");
            Long l12 = l7;
            sb7.append(l12);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("transIntervalDflt: ");
            Long l13 = l5;
            sb8.append(l13);
            sb8.toString();
            C7449x0.this.m21964Z1(m0Var, l, l2, l11, str2, l9, l10, l12, l13);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$l */
    class C7461l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f15074a;

        C7461l(int i) {
            this.f15074a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27644I0(this.f15074a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$m */
    class C7462m implements C6006h.C6016j {
        C7462m() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C7449x0.this.f15061B.mo28797a(l);
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
            C7449x0.this.f15061B.mo28804h(MonobService.C9337m0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$n */
    static /* synthetic */ class C7463n {

        /* renamed from: a */
        static final /* synthetic */ int[] f15077a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.MonobService$m0[] r0 = com.yeelight.yeelib.device.xiaomi.MonobService.C9337m0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15077a = r0
                com.yeelight.yeelib.device.xiaomi.MonobService$m0 r1 = com.yeelight.yeelib.device.xiaomi.MonobService.C9337m0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15077a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.MonobService$m0 r1 = com.yeelight.yeelib.device.xiaomi.MonobService.C9337m0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7449x0.C7463n.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$o */
    class C7464o implements CompletionHandler {
        C7464o() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$p */
    class C7465p implements CompletionHandler {
        C7465p() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$q */
    class C7466q implements CompletionHandler {
        C7466q() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$r */
    class C7467r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f15081a;

        C7467r(long j) {
            this.f15081a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27697k0(this.f15081a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$s */
    class C7468s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15083a;

        C7468s(C9856y yVar) {
            this.f15083a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27654N0(this.f15083a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$t */
    class C7469t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15085a;

        C7469t(C9856y yVar) {
            this.f15085a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27654N0(this.f15085a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$u */
    class C7470u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15087a;

        C7470u(C9856y yVar) {
            this.f15087a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27654N0(this.f15087a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x0$v */
    class C7471v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15089a;

        C7471v(C9856y yVar) {
            this.f15089a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7449x0.this.mo23408d0().mo27654N0(this.f15089a);
        }
    }

    public C7449x0(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m21964Z1(MonobService.C9337m0 m0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7) {
        boolean z = true;
        if (m0Var != null) {
            mo23408d0().mo27648K0(m0Var == MonobService.C9337m0.on);
        }
        if (l != null) {
            mo23408d0().mo27697k0(l.longValue());
        }
        if (l2 != null) {
            if (mo23408d0().mo27710r(2) == null) {
                mo23408d0().mo27676a(new C7554e(l2.intValue(), l2.intValue()));
            } else {
                mo23408d0().mo27670V0(l2.intValue());
            }
        }
        if (l5 != null) {
            mo23408d0().mo27644I0(l5.intValue());
        }
        mo23408d0().mo27652M0(l3 != null && l3.longValue() == 1);
        mo23408d0().mo27682d(l4 != null && l4.longValue() == 1);
        C6024e d0 = mo23408d0();
        if (l6.longValue() == 0) {
            z = false;
        }
        d0.mo27715t0(z);
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
        if (l7 != null) {
            mo23408d0().mo27662R0(l7.longValue());
        }
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C7466q());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: F */
    public int mo23303F() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_mono4_small;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -948847040:
                if (T.equals("yeelink.light.panel1")) {
                    c = 2;
                    break;
                }
                break;
            case -448603202:
                if (T.equals("yeelink.light.mono4")) {
                    c = 0;
                    break;
                }
                break;
            case -448603201:
                if (T.equals("yeelink.light.mono5")) {
                    c = 1;
                    break;
                }
                break;
            case -448603157:
                if (T.equals("yeelink.light.monoa")) {
                    c = 3;
                    break;
                }
                break;
            case -448603156:
                if (T.equals("yeelink.light.monob")) {
                    c = 4;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? R$drawable.icon_yeelight_device_badge_mono4_small : R$drawable.icon_yeelight_device_badge_monob_small : R$drawable.icon_yeelight_device_badge_dolphin_small : R$drawable.icon_yeelight_device_badge_panel_small : R$drawable.icon_yeelight_device_badge_mono5_small : R$drawable.icon_yeelight_device_badge_mono4_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_mono4_big;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -948847040:
                if (T.equals("yeelink.light.panel1")) {
                    c = 2;
                    break;
                }
                break;
            case -448603202:
                if (T.equals("yeelink.light.mono4")) {
                    c = 0;
                    break;
                }
                break;
            case -448603201:
                if (T.equals("yeelink.light.mono5")) {
                    c = 1;
                    break;
                }
                break;
            case -448603157:
                if (T.equals("yeelink.light.monoa")) {
                    c = 3;
                    break;
                }
                break;
            case -448603156:
                if (T.equals("yeelink.light.monob")) {
                    c = 4;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? R$drawable.icon_yeelight_device_badge_mono4_big : R$drawable.icon_yeelight_device_badge_monob_big : R$drawable.icon_yeelight_device_badge_dolphin_big : R$drawable.icon_yeelight_device_badge_panel_big : R$drawable.icon_yeelight_device_badge_mono5_big : R$drawable.icon_yeelight_device_badge_mono4_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C7462m();
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
            mo27560F1().sendCmd(MonobService.C9313a0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7458i(z));
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
            mo27560F1().sendCmd(MonobService.C9313a0.cfg_init_power, String.valueOf(i), new C7461l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(MonobService.C9313a0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7451b(z));
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
        return mo28796a2(this.f15060A, this.f15061B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f15062z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f15059G, "Invalid handler!");
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
    public MonobService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightMonobDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo28796a2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof MonobService.C9339n0)) {
            C4308b.m12139r(f15059G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (MonobService.C9339n0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23313O1()) {
            return true;
        }
        try {
            mo27560F1().setPower(MonobService.C9337m0.off, new C7465p());
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
            mo27560F1().delCron(0L, new C7453d());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23324Y1()) {
            return true;
        }
        try {
            mo27560F1().setPower(MonobService.C9337m0.on, new C7464o());
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
            mo27560F1().openWithMode(MonobService.C9337m0.on, MonobService.C9315b0.smooth, Long.valueOf(mo23408d0().mo27653N()), Long.valueOf((long) i), new C7454e(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23307H2(j)) {
            return true;
        }
        try {
            mo27560F1().setBright(Long.valueOf(j), new C7467r(j));
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
            mo27560F1().setDefault(new C7450a(this));
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
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C7452c(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f15062z);
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
                C4308b.m12139r("BATCH_RPC", "Mono4Device, Invalid length of batch rpc result: " + str);
            }
            m21964Z1(MonobService.C9337m0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), jSONArray.getString(4), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)));
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
                mo27560F1().getProperties(new C7460k());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23310K2(yVar)) {
            return true;
        }
        if (yVar.mo31890v()) {
            try {
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7468s(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C7469t(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene2("bright", Long.valueOf((long) yVar.mo31874f()), new C7470u(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C7471v(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f15059G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: y1 */
    public boolean mo23435y1(long j) {
        try {
            MonobService Y1 = mo27560F1();
            MonobService.C9313a0 a0Var = MonobService.C9313a0.trans_default;
            Y1.sendCmd(a0Var, j + ",1", new C7459j(j));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("TransIntervalDflt").getInternalName()};
    }
}
