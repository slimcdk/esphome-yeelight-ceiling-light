package com.yeelight.yeelib.p150c.p183m;

import android.text.TextUtils;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7622g;
import com.yeelight.yeelib.device.xiaomi.CtService;
import com.yeelight.yeelib.device.xiaomi.YeelightCtDevice;
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

/* renamed from: com.yeelight.yeelib.c.m.w */
public class C7380w extends C6006h {

    /* renamed from: G */
    public static final String f14963G = "w";

    /* renamed from: A */
    CompletionHandler f14964A = new C7388h(this);

    /* renamed from: B */
    CtService.C8789n0 f14965B = new C7389i();

    /* renamed from: z */
    CompletionHandler f14966z = new C7387g(this);

    /* renamed from: com.yeelight.yeelib.c.m.w$a */
    class C7381a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14967a;

        C7381a(C9856y yVar) {
            this.f14967a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27654N0(this.f14967a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$b */
    class C7382b implements CompletionHandler {
        C7382b(C7380w wVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$c */
    class C7383c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14969a;

        C7383c(boolean z) {
            this.f14969a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27652M0(this.f14969a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$d */
    class C7384d implements CompletionHandler {
        C7384d(C7380w wVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$e */
    class C7385e implements CompletionHandler {
        C7385e() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$f */
    class C7386f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14972a;

        C7386f(int i) {
            this.f14972a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27648K0(true);
            C7380w wVar = C7380w.this;
            wVar.mo23352w1(wVar.mo23433j1(this.f14972a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$g */
    class C7387g implements CompletionHandler {
        C7387g(C7380w wVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$h */
    class C7388h implements CompletionHandler {
        C7388h(C7380w wVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$i */
    class C7389i implements CtService.C8789n0 {
        C7389i() {
        }

        /* renamed from: a */
        public void mo28758a(Long l) {
            "onBrightChanged: " + l;
            C7380w.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28759b(Long l) {
            "onDelayOffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C7380w.this.mo23408d0().mo27710r(2) == null) {
                C7380w.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C7380w.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28760c(Long l) {
            "onFlowingChanged: " + l;
            C7380w.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28761d(Long l) {
            "onSaveStateChanged: " + l;
            C7380w.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28762e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C7380w.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28763f(Long l) {
            "onOnFromPowerChanged: " + l;
            C7380w.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28764g(Long l) {
            "onLanModeChanged: " + l;
            C7380w.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28765h(Long l) {
            "onCtChanged: " + l;
            C7380w.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28766i(CtService.C8787m0 m0Var) {
            C6024e eVar;
            "onPowerChanged: " + m0Var.name();
            int i = C7394n.f14981a[m0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C7380w.this.mo23408d0();
            } else if (i == 2) {
                eVar = C7380w.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$j */
    class C7390j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14975a;

        C7390j(boolean z) {
            this.f14975a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27682d(this.f14975a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$k */
    class C7391k implements CtService.C8781j0 {
        C7391k() {
        }

        /* renamed from: a */
        public void mo28767a(CtService.C8787m0 m0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7) {
            StringBuilder sb = new StringBuilder();
            sb.append("bright: ");
            Long l8 = l;
            sb.append(l);
            sb.toString();
            "lanMode: " + l5;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ct: ");
            Long l9 = l2;
            sb2.append(l2);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("power: ");
            sb3.append(m0Var == null ? "null" : m0Var.name());
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("delayoff: ");
            Long l10 = l3;
            sb4.append(l10);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("saveState: ");
            Long l11 = l4;
            sb5.append(l11);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowing : ");
            Long l12 = l7;
            sb6.append(l12);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("onFromPower : ");
            Long l13 = l6;
            sb7.append(l13);
            sb7.toString();
            C7380w.this.m21815Z1(m0Var, l, l2, l10, l11, str, l5, l13, l12);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$l */
    class C7392l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14978a;

        C7392l(int i) {
            this.f14978a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27644I0(this.f14978a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$m */
    class C7393m implements C6006h.C6016j {
        C7393m() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C7380w.this.f14965B.mo28758a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C7380w.this.f14965B.mo28765h(l);
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
            C7380w.this.f14965B.mo28766i(CtService.C8787m0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$n */
    static /* synthetic */ class C7394n {

        /* renamed from: a */
        static final /* synthetic */ int[] f14981a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.CtService$m0[] r0 = com.yeelight.yeelib.device.xiaomi.CtService.C8787m0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14981a = r0
                com.yeelight.yeelib.device.xiaomi.CtService$m0 r1 = com.yeelight.yeelib.device.xiaomi.CtService.C8787m0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14981a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.CtService$m0 r1 = com.yeelight.yeelib.device.xiaomi.CtService.C8787m0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7380w.C7394n.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$o */
    class C7395o implements CompletionHandler {
        C7395o() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$p */
    class C7396p implements CompletionHandler {
        C7396p() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$q */
    class C7397q implements CompletionHandler {
        C7397q() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$r */
    class C7398r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14985a;

        C7398r(long j) {
            this.f14985a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27697k0(this.f14985a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$s */
    class C7399s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14987a;

        C7399s(int i) {
            this.f14987a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27707p0(this.f14987a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$t */
    class C7400t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14989a;

        C7400t(C9856y yVar) {
            this.f14989a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27654N0(this.f14989a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$u */
    class C7401u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14991a;

        C7401u(C9856y yVar) {
            this.f14991a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27654N0(this.f14991a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.w$v */
    class C7402v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14993a;

        C7402v(C9856y yVar) {
            this.f14993a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7380w.this.mo23408d0().mo27654N0(this.f14993a);
        }
    }

    public C7380w(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m21815Z1(CtService.C8787m0 m0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7) {
        boolean z = true;
        if (m0Var != null) {
            mo23408d0().mo27648K0(m0Var == CtService.C8787m0.on);
        }
        if (l != null) {
            mo23408d0().mo27697k0(l.longValue());
        }
        if (l6 != null) {
            mo23408d0().mo27644I0(l6.intValue());
        }
        if (l2 != null) {
            mo23408d0().mo27707p0(l2.intValue());
        }
        if (l3 != null) {
            if (mo23408d0().mo27710r(2) == null) {
                mo23408d0().mo27676a(new C7554e(l3.intValue(), l3.intValue()));
            } else {
                mo23408d0().mo27670V0(l3.intValue());
            }
        }
        mo23408d0().mo27652M0(l4 != null && l4.longValue() == 1);
        mo23408d0().mo27682d(l5 != null && l5.longValue() == 1);
        if (!TextUtils.isEmpty(str) && !"NULL".equalsIgnoreCase(str)) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
        C6024e d0 = mo23408d0();
        if (l7 == null || l7.longValue() == 0) {
            z = false;
        }
        d0.mo27715t0(z);
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C7397q());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: F */
    public int mo23303F() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_lemon_ct_small;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -948847038:
                if (T.equals("yeelink.light.panel3")) {
                    c = 3;
                    break;
                }
                break;
            case -845289553:
                if (T.equals("yeelink.light.strip4")) {
                    c = 2;
                    break;
                }
                break;
            case 1201756974:
                if (T.equals("yeelink.light.ct2")) {
                    c = 0;
                    break;
                }
                break;
            case 1201757021:
                if (T.equals("yeelink.light.cta")) {
                    c = 1;
                    break;
                }
                break;
        }
        return (c == 0 || c == 1) ? R$drawable.icon_yeelight_device_badge_lemon_ct_small : c != 2 ? c != 3 ? R$drawable.icon_yeelight_device_badge_lemon_ct_small : R$drawable.icon_yeelight_device_badge_panel_small : R$drawable.icon_yeelight_device_badge_stripe4_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_lemon_ct_big;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -948847038:
                if (T.equals("yeelink.light.panel3")) {
                    c = 3;
                    break;
                }
                break;
            case -845289553:
                if (T.equals("yeelink.light.strip4")) {
                    c = 2;
                    break;
                }
                break;
            case 1201756974:
                if (T.equals("yeelink.light.ct2")) {
                    c = 0;
                    break;
                }
                break;
            case 1201757021:
                if (T.equals("yeelink.light.cta")) {
                    c = 1;
                    break;
                }
                break;
        }
        return (c == 0 || c == 1) ? R$drawable.icon_yeelight_device_badge_lemon_ct_big : c != 2 ? c != 3 ? R$drawable.icon_yeelight_device_badge_lemon_ct_big : R$drawable.icon_yeelight_device_badge_panel_big : R$drawable.icon_yeelight_device_badge_stripe4_big;
    }

    /* renamed from: J0 */
    public void mo23378J0(C7622g gVar) {
        super.mo23378J0(gVar);
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C7393m();
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
            mo27560F1().sendCmd(CtService.C8763a0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7390j(z));
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
            mo27560F1().sendCmd(CtService.C8763a0.cfg_init_power, String.valueOf(i), new C7392l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(CtService.C8763a0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7383c(z));
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
        return mo28757a2(this.f14964A, this.f14965B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14966z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14963G, "Invalid handler!");
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
    public CtService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCtDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo28757a2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof CtService.C8789n0)) {
            C4308b.m12139r(f14963G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (CtService.C8789n0) obj2);
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
            mo27560F1().setPower(CtService.C8787m0.off, new C7396p());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C7385e());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(CtService.C8787m0.on, new C7395o());
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
            mo27560F1().openWithMode(CtService.C8787m0.on, CtService.C8765b0.smooth, 500L, Long.valueOf((long) i), new C7386f(i));
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
            mo27560F1().setBright(Long.valueOf(j), CtService.C8765b0.smooth, 500L, new C7398r(j));
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
            mo27560F1().setCt(Long.valueOf((long) i), CtService.C8765b0.smooth, 500L, new C7399s(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C7382b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C7384d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14966z);
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
                C4308b.m12139r("BATCH_RPC", "CtDevice, Invalid length of batch rpc result: " + str);
            }
            m21815Z1(CtService.C8787m0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)));
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
                mo27560F1().getProperties(new C7391k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7400t(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C7401u(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C7402v(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C7381a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f14963G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName()};
    }
}
