package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7622g;
import com.yeelight.yeelib.device.xiaomi.Stripe4Service;
import com.yeelight.yeelib.device.xiaomi.YeelightStripe4Device;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6029f;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p185d.C7565b;
import com.yeelight.yeelib.utils.C4308b;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.c.m.i1 */
public class C6842i1 extends C6029f {

    /* renamed from: G */
    public static final String f14155G = "i1";

    /* renamed from: A */
    CompletionHandler f14156A = new C6851i(this);

    /* renamed from: B */
    Stripe4Service.C9535p0 f14157B = new C6852j();

    /* renamed from: z */
    CompletionHandler f14158z = new C6850h(this);

    /* renamed from: com.yeelight.yeelib.c.m.i1$a */
    class C6843a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14159a;

        C6843a(C9856y yVar) {
            this.f14159a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27654N0(this.f14159a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$b */
    class C6844b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14161a;

        C6844b(C9856y yVar) {
            this.f14161a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27654N0(this.f14161a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$c */
    class C6845c implements CompletionHandler {
        C6845c(C6842i1 i1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$d */
    class C6846d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14163a;

        C6846d(boolean z) {
            this.f14163a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27652M0(this.f14163a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$e */
    class C6847e implements CompletionHandler {
        C6847e(C6842i1 i1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$f */
    class C6848f implements CompletionHandler {
        C6848f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$g */
    class C6849g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14166a;

        C6849g(int i) {
            this.f14166a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27648K0(true);
            C6842i1 i1Var = C6842i1.this;
            i1Var.mo23352w1(i1Var.mo23433j1(this.f14166a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$h */
    class C6850h implements CompletionHandler {
        C6850h(C6842i1 i1Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$i */
    class C6851i implements CompletionHandler {
        C6851i(C6842i1 i1Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$j */
    class C6852j implements Stripe4Service.C9535p0 {
        C6852j() {
        }

        /* renamed from: a */
        public void mo28426a(Long l) {
            "onBrightChanged: " + l;
            C6842i1.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28427b(Long l) {
            "onDelayOffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6842i1.this.mo23408d0().mo27710r(2) == null) {
                C6842i1.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6842i1.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28428c(Long l) {
            "onFlowingChanged: " + l;
            C6842i1.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28429d(Long l) {
            "onSaveStateChanged: " + l;
            C6842i1.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28430e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6842i1.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28431f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6842i1.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28432g(Long l) {
            "onLanModeChanged: " + l;
            C6842i1.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28433h(Long l) {
            "onCtChanged: " + l;
            C6842i1.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28434i(Stripe4Service.C9533o0 o0Var) {
            C6024e eVar;
            "onPowerChanged: " + o0Var.name();
            int i = C6858p.f14176a[o0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6842i1.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6842i1.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: p */
        public void mo28435p(Long l) {
            "onSmartSwitchChanged: " + l;
            C6842i1.this.mo23408d0().mo27696k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$k */
    class C6853k implements CompletionHandler {
        C6853k(C6842i1 i1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$l */
    class C6854l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14169a;

        C6854l(boolean z) {
            this.f14169a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27682d(this.f14169a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$m */
    class C6855m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14171a;

        C6855m(int i) {
            this.f14171a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27644I0(this.f14171a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$n */
    class C6856n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14173a;

        C6856n(boolean z) {
            this.f14173a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27696k(this.f14173a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$o */
    class C6857o implements C6006h.C6016j {
        C6857o() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6842i1.this.f14157B.mo28426a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6842i1.this.f14157B.mo28433h(l);
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
            C6842i1.this.f14157B.mo28434i(Stripe4Service.C9533o0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$p */
    static /* synthetic */ class C6858p {

        /* renamed from: a */
        static final /* synthetic */ int[] f14176a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$o0[] r0 = com.yeelight.yeelib.device.xiaomi.Stripe4Service.C9533o0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14176a = r0
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$o0 r1 = com.yeelight.yeelib.device.xiaomi.Stripe4Service.C9533o0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14176a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$o0 r1 = com.yeelight.yeelib.device.xiaomi.Stripe4Service.C9533o0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6842i1.C6858p.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$q */
    class C6859q implements Stripe4Service.C9525k0 {
        C6859q() {
        }

        /* renamed from: a */
        public void mo28436a(Stripe4Service.C9533o0 o0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8) {
            StringBuilder sb = new StringBuilder();
            sb.append("bright: ");
            Long l9 = l;
            sb.append(l);
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lanMode: ");
            Long l10 = l5;
            sb2.append(l10);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ct: ");
            Long l11 = l2;
            sb3.append(l11);
            sb3.toString();
            "power: " + o0Var.name();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("delayoff: ");
            Long l12 = l3;
            sb4.append(l12);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("saveState: ");
            Long l13 = l4;
            sb5.append(l13);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowing : ");
            Long l14 = l7;
            sb6.append(l14);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("onFromPower : ");
            Long l15 = l6;
            sb7.append(l15);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("smartSwitch : ");
            Long l16 = l8;
            sb8.append(l16);
            sb8.toString();
            C6842i1.this.m20314k2(o0Var, l, l11, l12, l13, str, l10, l15, l14, l16);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$r */
    class C6860r implements CompletionHandler {
        C6860r() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$s */
    class C6861s implements CompletionHandler {
        C6861s() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$t */
    class C6862t implements CompletionHandler {
        C6862t() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$u */
    class C6863u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14181a;

        C6863u(long j) {
            this.f14181a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27697k0(this.f14181a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$v */
    class C6864v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14183a;

        C6864v(int i) {
            this.f14183a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27707p0(this.f14183a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$w */
    class C6865w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14185a;

        C6865w(C9856y yVar) {
            this.f14185a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27654N0(this.f14185a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i1$x */
    class C6866x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14187a;

        C6866x(C9856y yVar) {
            this.f14187a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6842i1.this.mo23408d0().mo27654N0(this.f14187a);
        }
    }

    public C6842i1(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        C7565b bVar = C7565b.DEVICE_EVENT_OPEN;
        C7565b bVar2 = C7565b.DEVICE_EVENT_CLOSE;
        C7565b bVar3 = C7565b.DEVICE_EVENT_BRIGHT_CHANGE;
        C7563a aVar = C7563a.ON;
        C7563a aVar2 = C7563a.OFF;
        C7563a aVar3 = C7563a.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public void m20314k2(Stripe4Service.C9533o0 o0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8) {
        boolean z = true;
        if (o0Var != null) {
            mo23408d0().mo27648K0(o0Var == Stripe4Service.C9533o0.on);
        }
        if (l != null) {
            mo23408d0().mo27697k0(l.longValue());
        }
        if (l6 != null) {
            mo23408d0().mo27644I0(l6.intValue());
        }
        mo23408d0().mo27707p0(l2.intValue());
        if (l3 != null) {
            if (mo23408d0().mo27710r(2) == null) {
                mo23408d0().mo27676a(new C7554e(l3.intValue(), l3.intValue()));
            } else {
                mo23408d0().mo27670V0(l3.intValue());
            }
        }
        mo23408d0().mo27652M0(l4 != null && l4.longValue() == 1);
        mo23408d0().mo27682d(l5 != null && l5.longValue() == 1);
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
        mo23408d0().mo27715t0(l7.longValue() != 0);
        C6024e d0 = mo23408d0();
        if (l8 == null || l8.longValue() != 1) {
            z = false;
        }
        d0.mo27696k(z);
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6862t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: F */
    public int mo23303F() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_stripe4_small;
        }
        String T = mo23395T();
        if (T.hashCode() == -845289553 && T.equals("yeelink.light.strip4")) {
        }
        return R$drawable.icon_yeelight_device_badge_stripe4_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_stripe4_big;
        }
        String T = mo23395T();
        if (T.hashCode() == -845289553 && T.equals("yeelink.light.strip4")) {
        }
        return R$drawable.icon_yeelight_device_badge_stripe4_big;
    }

    /* renamed from: J0 */
    public void mo23378J0(C7622g gVar) {
        super.mo23378J0(gVar);
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6857o();
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
            mo27560F1().sendCmd(Stripe4Service.C9507b0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6854l(z));
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
            mo27560F1().sendCmd(Stripe4Service.C9507b0.cfg_init_power, String.valueOf(i), new C6855m(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Stripe4Service.C9507b0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6846d(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_color) : super.mo23397U();
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28425l2(this.f14156A, this.f14157B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14158z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14155G, "Invalid handler!");
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

    /* renamed from: a2 */
    public boolean mo27734a2(boolean z) {
        return false;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        if (super.mo23326b1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Stripe4Service.C9533o0.off, new C6861s());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6848f());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: f2 */
    public boolean mo27737f2(int i) {
        "sendRemoteKey --> Invoke, enable : " + i;
        try {
            mo27560F1().sendCmd(Stripe4Service.C9507b0.pseudo_beacon, "4097|" + i, new C6853k(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Stripe4Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightStripe4Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Stripe4Service.C9533o0.on, new C6860r());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28425l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Stripe4Service.C9535p0)) {
            C4308b.m12139r(f14155G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Stripe4Service.C9535p0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        if (super.mo23336m1(i)) {
            return true;
        }
        try {
            mo27560F1().openWithMode(Stripe4Service.C9533o0.on, Stripe4Service.C9509c0.smooth, 500L, Long.valueOf((long) i), new C6849g(i));
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
            mo27560F1().setBright(Long.valueOf(j), Stripe4Service.C9509c0.smooth, 500L, new C6863u(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        if (super.mo23345s1(i)) {
            return true;
        }
        try {
            mo27560F1().setCt(Long.valueOf((long) i), Stripe4Service.C9509c0.smooth, 500L, new C6864v(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6845c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6847e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
        try {
            mo27560F1().sendCmd(Stripe4Service.C9507b0.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6856n(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14158z);
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 10) {
                C4308b.m12139r("BATCH_RPC", "CtDevice, Invalid length of batch rpc result: " + str);
            }
            m20314k2(Stripe4Service.C9533o0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)));
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
                mo27560F1().getProperties(new C6859q());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6865w(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6866x(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6843a(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6844b(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f14155G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("SmartSwitch").getInternalName()};
    }
}
