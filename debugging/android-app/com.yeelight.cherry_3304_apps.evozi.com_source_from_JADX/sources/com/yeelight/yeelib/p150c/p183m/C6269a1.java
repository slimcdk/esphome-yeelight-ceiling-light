package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7622g;
import com.yeelight.yeelib.device.xiaomi.Panel3Service;
import com.yeelight.yeelib.device.xiaomi.YeelightPanel3Device;
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

/* renamed from: com.yeelight.yeelib.c.m.a1 */
public class C6269a1 extends C6029f {

    /* renamed from: G */
    public static final String f13269G = "a1";

    /* renamed from: A */
    CompletionHandler f13270A = new C6277h(this);

    /* renamed from: B */
    Panel3Service.C9433s0 f13271B = new C6278i();

    /* renamed from: z */
    CompletionHandler f13272z = new C6276g(this);

    /* renamed from: com.yeelight.yeelib.c.m.a1$a */
    class C6270a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13273a;

        C6270a(C9856y yVar) {
            this.f13273a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27654N0(this.f13273a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$b */
    class C6271b implements CompletionHandler {
        C6271b(C6269a1 a1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$c */
    class C6272c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13275a;

        C6272c(boolean z) {
            this.f13275a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27652M0(this.f13275a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$d */
    class C6273d implements CompletionHandler {
        C6273d(C6269a1 a1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$e */
    class C6274e implements CompletionHandler {
        C6274e() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$f */
    class C6275f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13278a;

        C6275f(int i) {
            this.f13278a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27648K0(true);
            C6269a1 a1Var = C6269a1.this;
            a1Var.mo23352w1(a1Var.mo23433j1(this.f13278a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$g */
    class C6276g implements CompletionHandler {
        C6276g(C6269a1 a1Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$h */
    class C6277h implements CompletionHandler {
        C6277h(C6269a1 a1Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$i */
    class C6278i implements Panel3Service.C9433s0 {
        C6278i() {
        }

        /* renamed from: a */
        public void mo28104a(Long l) {
            "onBrightChanged: " + l;
            C6269a1.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28105b(Long l) {
            "onDelayOffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6269a1.this.mo23408d0().mo27710r(2) == null) {
                C6269a1.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6269a1.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28106c(Long l) {
            "onFlowingChanged: " + l;
            C6269a1.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28107d(Long l) {
            "onSaveStateChanged: " + l;
            C6269a1.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28108e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6269a1.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28109f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6269a1.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28110g(Long l) {
            "onLanModeChanged: " + l;
            C6269a1.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28111h(Long l) {
            "onCtChanged: " + l;
            C6269a1.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28112i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6269a1.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6269a1.this.mo23408d0().mo27640G0(true);
                }
                C6269a1.this.mo23408d0().mo27638F0(split[1]);
                C6269a1.this.mo23408d0().mo27636E0(split[2]);
                C6269a1.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C6269a1.f13269G;
                "start = " + C6269a1.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6269a1.this.mo23408d0().mo27631C() + ", " + C6269a1.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28113j(Panel3Service.C9431r0 r0Var) {
            C6024e eVar;
            "onPowerChanged: " + r0Var.name();
            int i = C6286q.f13294a[r0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6269a1.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6269a1.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: p */
        public void mo28114p(Long l) {
            "onSmartSwitchChanged: " + l;
            C6269a1.this.mo23408d0().mo27696k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$j */
    class C6279j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13281a;

        C6279j(boolean z) {
            this.f13281a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27682d(this.f13281a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$k */
    class C6280k implements Panel3Service.C9423n0 {
        C6280k() {
        }

        /* renamed from: a */
        public void mo28115a(Panel3Service.C9431r0 r0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str2) {
            "bright: " + l;
            StringBuilder sb = new StringBuilder();
            sb.append("lanMode: ");
            Long l9 = l5;
            sb.append(l9);
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ct: ");
            Long l10 = l2;
            sb2.append(l10);
            sb2.toString();
            "power: " + r0Var.name();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("delayoff: ");
            Long l11 = l3;
            sb3.append(l11);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("saveState: ");
            Long l12 = l4;
            sb4.append(l12);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("flowing : ");
            Long l13 = l7;
            sb5.append(l13);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("onFromPower : ");
            Long l14 = l6;
            sb6.append(l14);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("smartSwitch : ");
            Long l15 = l8;
            sb7.append(l15);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("nightTimeInfo : ");
            String str3 = str2;
            sb8.append(str3);
            sb8.toString();
            C6269a1.this.m18885k2(r0Var, l, l10, l11, l12, str, l9, l14, l13, l15, str3);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$l */
    class C6281l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13284a;

        C6281l(int i) {
            this.f13284a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27644I0(this.f13284a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$m */
    class C6282m implements CompletionHandler {
        C6282m(C6269a1 a1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$n */
    class C6283n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13286a;

        C6283n(boolean z) {
            this.f13286a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27696k(this.f13286a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$o */
    class C6284o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13288a;

        /* renamed from: b */
        final /* synthetic */ String f13289b;

        /* renamed from: c */
        final /* synthetic */ String f13290c;

        /* renamed from: d */
        final /* synthetic */ int f13291d;

        C6284o(boolean z, String str, String str2, int i) {
            this.f13288a = z;
            this.f13289b = str;
            this.f13290c = str2;
            this.f13291d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27640G0(this.f13288a);
            C6269a1.this.mo23408d0().mo27638F0(this.f13289b);
            C6269a1.this.mo23408d0().mo27636E0(this.f13290c);
            C6269a1.this.mo23408d0().mo27634D0(this.f13291d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$p */
    class C6285p implements C6006h.C6016j {
        C6285p() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6269a1.this.f13271B.mo28104a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6269a1.this.f13271B.mo28111h(l);
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
            C6269a1.this.f13271B.mo28113j(Panel3Service.C9431r0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$q */
    static /* synthetic */ class C6286q {

        /* renamed from: a */
        static final /* synthetic */ int[] f13294a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Panel3Service$r0[] r0 = com.yeelight.yeelib.device.xiaomi.Panel3Service.C9431r0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13294a = r0
                com.yeelight.yeelib.device.xiaomi.Panel3Service$r0 r1 = com.yeelight.yeelib.device.xiaomi.Panel3Service.C9431r0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13294a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Panel3Service$r0 r1 = com.yeelight.yeelib.device.xiaomi.Panel3Service.C9431r0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6269a1.C6286q.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$r */
    class C6287r implements CompletionHandler {
        C6287r() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$s */
    class C6288s implements CompletionHandler {
        C6288s() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$t */
    class C6289t implements CompletionHandler {
        C6289t() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$u */
    class C6290u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f13298a;

        C6290u(long j) {
            this.f13298a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27697k0(this.f13298a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$v */
    class C6291v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13300a;

        C6291v(int i) {
            this.f13300a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27707p0(this.f13300a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$w */
    class C6292w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13302a;

        C6292w(C9856y yVar) {
            this.f13302a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27654N0(this.f13302a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$x */
    class C6293x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13304a;

        C6293x(C9856y yVar) {
            this.f13304a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27654N0(this.f13304a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a1$y */
    class C6294y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13306a;

        C6294y(C9856y yVar) {
            this.f13306a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6269a1.this.mo23408d0().mo27654N0(this.f13306a);
        }
    }

    public C6269a1(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m18885k2(Panel3Service.C9431r0 r0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, String str2) {
        if (r0Var != null) {
            mo23408d0().mo27648K0(r0Var == Panel3Service.C9431r0.on);
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
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
        mo23408d0().mo27715t0(l7.longValue() != 0);
        mo23408d0().mo27696k(l8 != null && l8.longValue() == 1);
        String[] split = str2.split("\\|");
        if (split.length == 4) {
            if (split[0].equals("disable")) {
                mo23408d0().mo27640G0(false);
            } else if (split[0].equals("enable")) {
                mo23408d0().mo27640G0(true);
            }
            mo23408d0().mo27638F0(split[1]);
            mo23408d0().mo27636E0(split[2]);
            mo23408d0().mo27634D0(Integer.parseInt(split[3]));
            "start = " + mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + mo23408d0().mo27631C() + ", " + mo23408d0().mo27629B();
        }
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6289t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: F */
    public int mo23303F() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_panel_small;
        }
        String T = mo23395T();
        if (T.hashCode() == -948847038 && T.equals("yeelink.light.panel3")) {
        }
        return R$drawable.icon_yeelight_device_badge_panel_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_panel_big;
        }
        String T = mo23395T();
        if (T.hashCode() == -948847038 && T.equals("yeelink.light.panel3")) {
        }
        return R$drawable.icon_yeelight_device_badge_panel_big;
    }

    /* renamed from: J0 */
    public void mo23378J0(C7622g gVar) {
        super.mo23378J0(gVar);
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6285p();
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
            mo27560F1().sendCmd(Panel3Service.C9403d0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6279j(z));
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
            mo27560F1().sendCmd(Panel3Service.C9403d0.cfg_init_power, String.valueOf(i), new C6281l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Panel3Service.C9403d0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6272c(z));
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
        return mo28103l2(this.f13270A, this.f13271B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13272z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13269G, "Invalid handler!");
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
            mo27560F1().setPower(Panel3Service.C9431r0.off, new C6288s());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6274e());
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
            mo27560F1().sendCmd(Panel3Service.C9403d0.pseudo_beacon, "4097|" + i, new C6282m(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g1 */
    public boolean mo23431g1(boolean z, String str, String str2, int i) {
        "enableNightTime --> Invoke, enable : " + z + ", startTime : " + str + " , endTime : " + str2 + " , delayTime : " + i;
        try {
            Panel3Service j2 = mo27560F1();
            Panel3Service.C9403d0 d0Var = Panel3Service.C9403d0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(d0Var, sb.toString(), new C6284o(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Panel3Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightPanel3Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Panel3Service.C9431r0.on, new C6287r());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28103l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Panel3Service.C9433s0)) {
            C4308b.m12139r(f13269G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Panel3Service.C9433s0) obj2);
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
            mo27560F1().openWithMode(Panel3Service.C9431r0.on, Panel3Service.C9405e0.smooth, 500L, Long.valueOf((long) i), new C6275f(i));
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
            mo27560F1().setBright(Long.valueOf(j), Panel3Service.C9405e0.smooth, 500L, new C6290u(j));
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
            mo27560F1().setCt(Long.valueOf((long) i), Panel3Service.C9405e0.smooth, 500L, new C6291v(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6271b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6273d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
        try {
            mo27560F1().sendCmd(Panel3Service.C9403d0.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6283n(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f13272z);
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 11) {
                C4308b.m12139r("BATCH_RPC", "CtDevice, Invalid length of batch rpc result: " + str);
            }
            m18885k2(Panel3Service.C9431r0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), jSONArray.getString(10));
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
                mo27560F1().getProperties(new C6280k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6292w(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6293x(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6294y(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6270a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f13269G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("SmartSwitch").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName()};
    }
}
