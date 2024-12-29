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
import com.yeelight.yeelib.device.xiaomi.CtaService;
import com.yeelight.yeelib.device.xiaomi.YeelightCtaDevice;
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

/* renamed from: com.yeelight.yeelib.c.m.x */
public class C7425x extends C6006h {

    /* renamed from: G */
    public static final String f15025G = "x";

    /* renamed from: A */
    CompletionHandler f15026A = new C7433h(this);

    /* renamed from: B */
    CtaService.C8835q0 f15027B = new C7434i();

    /* renamed from: z */
    CompletionHandler f15028z = new C7432g(this);

    /* renamed from: com.yeelight.yeelib.c.m.x$a */
    class C7426a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15029a;

        C7426a(C9856y yVar) {
            this.f15029a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27654N0(this.f15029a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$b */
    class C7427b implements CompletionHandler {
        C7427b(C7425x xVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$c */
    class C7428c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f15031a;

        C7428c(boolean z) {
            this.f15031a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27652M0(this.f15031a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$d */
    class C7429d implements CompletionHandler {
        C7429d(C7425x xVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$e */
    class C7430e implements CompletionHandler {
        C7430e() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$f */
    class C7431f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f15034a;

        C7431f(int i) {
            this.f15034a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27648K0(true);
            C7425x xVar = C7425x.this;
            xVar.mo23352w1(xVar.mo23433j1(this.f15034a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$g */
    class C7432g implements CompletionHandler {
        C7432g(C7425x xVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$h */
    class C7433h implements CompletionHandler {
        C7433h(C7425x xVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$i */
    class C7434i implements CtaService.C8835q0 {
        C7434i() {
        }

        /* renamed from: a */
        public void mo28783a(Long l) {
            "onBrightChanged: " + l;
            C7425x.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28784b(Long l) {
            "onDelayOffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C7425x.this.mo23408d0().mo27710r(2) == null) {
                C7425x.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C7425x.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28785c(Long l) {
            "onFlowingChanged: " + l;
            C7425x.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28786d(Long l) {
            "onSaveStateChanged: " + l;
            C7425x.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28787e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C7425x.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28788f(Long l) {
            "onOnFromPowerChanged: " + l;
            C7425x.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28789g(Long l) {
            "onLanModeChanged: " + l;
            C7425x.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28790h(Long l) {
            "onCtChanged: " + l;
            C7425x.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28791i(CtaService.C8833p0 p0Var) {
            C6024e eVar;
            "onPowerChanged: " + p0Var.name();
            int i = C7440o.f15045a[p0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C7425x.this.mo23408d0();
            } else if (i == 2) {
                eVar = C7425x.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: q */
        public void mo28792q(Long l) {
            "onTransIntervalDfltChanged: " + l;
            if (l != null) {
                C7425x.this.mo23408d0().mo27662R0(l.longValue());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$j */
    class C7435j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f15037a;

        C7435j(boolean z) {
            this.f15037a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27682d(this.f15037a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$k */
    class C7436k implements CtaService.C8825l0 {
        C7436k() {
        }

        /* renamed from: a */
        public void mo28793a(CtaService.C8833p0 p0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8) {
            StringBuilder sb = new StringBuilder();
            sb.append("bright: ");
            Long l9 = l;
            sb.append(l);
            sb.toString();
            "lanMode: " + l5;
            "ct: " + l2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("power: ");
            sb2.append(p0Var == null ? "null" : p0Var.name());
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("delayoff: ");
            Long l10 = l3;
            sb3.append(l10);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("saveState: ");
            Long l11 = l4;
            sb4.append(l11);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("flowing : ");
            Long l12 = l8;
            sb5.append(l12);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("onFromPower : ");
            Long l13 = l7;
            sb6.append(l13);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("transIntervalDflt : ");
            Long l14 = l6;
            sb7.append(l14);
            sb7.toString();
            C7425x.this.m21913Z1(p0Var, l, l2, l10, l11, str, l5, l13, l12, l14);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$l */
    class C7437l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f15040a;

        C7437l(long j) {
            this.f15040a = j;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27662R0(this.f15040a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$m */
    class C7438m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f15042a;

        C7438m(int i) {
            this.f15042a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27644I0(this.f15042a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$n */
    class C7439n implements C6006h.C6016j {
        C7439n() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C7425x.this.f15027B.mo28783a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C7425x.this.f15027B.mo28790h(l);
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
            C7425x.this.f15027B.mo28791i(CtaService.C8833p0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$o */
    static /* synthetic */ class C7440o {

        /* renamed from: a */
        static final /* synthetic */ int[] f15045a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.CtaService$p0[] r0 = com.yeelight.yeelib.device.xiaomi.CtaService.C8833p0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15045a = r0
                com.yeelight.yeelib.device.xiaomi.CtaService$p0 r1 = com.yeelight.yeelib.device.xiaomi.CtaService.C8833p0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15045a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.CtaService$p0 r1 = com.yeelight.yeelib.device.xiaomi.CtaService.C8833p0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7425x.C7440o.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$p */
    class C7441p implements CompletionHandler {
        C7441p() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$q */
    class C7442q implements CompletionHandler {
        C7442q() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$r */
    class C7443r implements CompletionHandler {
        C7443r() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$s */
    class C7444s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f15049a;

        C7444s(long j) {
            this.f15049a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27697k0(this.f15049a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$t */
    class C7445t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f15051a;

        C7445t(int i) {
            this.f15051a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27707p0(this.f15051a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$u */
    class C7446u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15053a;

        C7446u(C9856y yVar) {
            this.f15053a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27654N0(this.f15053a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$v */
    class C7447v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15055a;

        C7447v(C9856y yVar) {
            this.f15055a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27654N0(this.f15055a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.x$w */
    class C7448w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15057a;

        C7448w(C9856y yVar) {
            this.f15057a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7425x.this.mo23408d0().mo27654N0(this.f15057a);
        }
    }

    public C7425x(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m21913Z1(CtaService.C8833p0 p0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8) {
        boolean z = true;
        if (p0Var != null) {
            mo23408d0().mo27648K0(p0Var == CtaService.C8833p0.on);
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
        if (l8 != null) {
            mo23408d0().mo27662R0(l8.longValue());
        }
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C7443r());
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
        this.f12723x = new C7439n();
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
            mo27560F1().sendCmd(CtaService.C8807c0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7435j(z));
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
            mo27560F1().sendCmd(CtaService.C8807c0.cfg_init_power, String.valueOf(i), new C7438m(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(CtaService.C8807c0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7428c(z));
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
        return mo28782a2(this.f15026A, this.f15027B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f15028z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f15025G, "Invalid handler!");
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
    public CtaService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCtaDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo28782a2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof CtaService.C8835q0)) {
            C4308b.m12139r(f15025G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (CtaService.C8835q0) obj2);
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
            mo27560F1().setPower(CtaService.C8833p0.off, new C7442q());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C7430e());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23324Y1()) {
            return true;
        }
        try {
            mo27560F1().setPower(CtaService.C8833p0.on, new C7441p());
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
            mo27560F1().openWithMode(CtaService.C8833p0.on, CtaService.C8809d0.smooth, Long.valueOf(mo23408d0().mo27653N()), Long.valueOf((long) i), new C7431f(i));
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
            mo27560F1().setBright(Long.valueOf(j), new C7444s(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23309J2(i)) {
            return true;
        }
        try {
            mo27560F1().setCt(Long.valueOf((long) i), new C7445t(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C7427b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C7429d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f15028z);
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
            m21913Z1(CtaService.C8833p0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)));
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
                mo27560F1().getProperties(new C7436k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7446u(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C7447v(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene2("bright", Long.valueOf((long) yVar.mo31874f()), new C7448w(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C7426a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f15025G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: y1 */
    public boolean mo23435y1(long j) {
        try {
            CtaService Y1 = mo27560F1();
            CtaService.C8807c0 c0Var = CtaService.C8807c0.trans_default;
            Y1.sendCmd(c0Var, j + ",1", new C7437l(j));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("TransIntervalDflt").getInternalName()};
    }
}
