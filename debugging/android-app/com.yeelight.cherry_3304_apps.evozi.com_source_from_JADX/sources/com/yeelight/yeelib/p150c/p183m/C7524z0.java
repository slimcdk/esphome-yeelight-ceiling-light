package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.Panel1Service;
import com.yeelight.yeelib.device.xiaomi.YeelightPanel1Device;
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

/* renamed from: com.yeelight.yeelib.c.m.z0 */
public class C7524z0 extends C6029f {

    /* renamed from: G */
    public static final String f15160G = "z0";

    /* renamed from: A */
    CompletionHandler f15161A = new C7531g(this);

    /* renamed from: B */
    Panel1Service.C9387r0 f15162B = new C7532h();

    /* renamed from: z */
    CompletionHandler f15163z = new C7530f(this);

    /* renamed from: com.yeelight.yeelib.c.m.z0$a */
    class C7525a implements CompletionHandler {
        C7525a(C7524z0 z0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$b */
    class C7526b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f15164a;

        C7526b(boolean z) {
            this.f15164a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27652M0(this.f15164a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$c */
    class C7527c implements CompletionHandler {
        C7527c(C7524z0 z0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$d */
    class C7528d implements CompletionHandler {
        C7528d() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$e */
    class C7529e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f15167a;

        C7529e(int i) {
            this.f15167a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27648K0(true);
            C7524z0 z0Var = C7524z0.this;
            z0Var.mo23352w1(z0Var.mo23433j1(this.f15167a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$f */
    class C7530f implements CompletionHandler {
        C7530f(C7524z0 z0Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$g */
    class C7531g implements CompletionHandler {
        C7531g(C7524z0 z0Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$h */
    class C7532h implements Panel1Service.C9387r0 {
        C7532h() {
        }

        /* renamed from: a */
        public void mo28853a(Long l) {
            "onBrightChanged: " + l;
            C7524z0.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28854b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C7524z0.this.mo23408d0().mo27710r(2) == null) {
                C7524z0.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C7524z0.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28855c(Long l) {
            "onFlowingChanged: " + l;
            C7524z0.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28856d(Long l) {
            "onSaveStateChanged: " + l;
            C7524z0.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28857e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C7524z0.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28858f(Long l) {
            "onOnFromPowerChanged: " + l;
            C7524z0.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28859g(Long l) {
            "onLanModeChanged: " + l;
            C7524z0.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28860h(Panel1Service.C9385q0 q0Var) {
            C6024e eVar;
            "onPowerSwitched: " + q0Var.name();
            int i = C7540p.f15183a[q0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C7524z0.this.mo23408d0();
            } else if (i == 2) {
                eVar = C7524z0.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: i */
        public void mo28861i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C7524z0.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C7524z0.this.mo23408d0().mo27640G0(true);
                }
                C7524z0.this.mo23408d0().mo27638F0(split[1]);
                C7524z0.this.mo23408d0().mo27636E0(split[2]);
                C7524z0.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C7524z0.f15160G;
                "start = " + C7524z0.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C7524z0.this.mo23408d0().mo27631C() + ", " + C7524z0.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: p */
        public void mo28862p(Long l) {
            "onSmartSwitchChanged: " + l;
            C7524z0.this.mo23408d0().mo27696k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$i */
    class C7533i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f15170a;

        C7533i(boolean z) {
            this.f15170a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27682d(this.f15170a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$j */
    class C7534j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f15172a;

        C7534j(int i) {
            this.f15172a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27644I0(this.f15172a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$k */
    class C7535k implements Panel1Service.C9375l0 {
        C7535k() {
        }

        /* renamed from: a */
        public void mo28863a(Panel1Service.C9385q0 q0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(q0Var != null ? q0Var.name() : "null");
            sb.toString();
            "bright: " + l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("temperature: ");
            Long l9 = l2;
            sb2.append(l9);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lanMode: ");
            Long l10 = l5;
            sb3.append(l10);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onFromPower: ");
            Long l11 = l6;
            sb4.append(l11);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            Long l12 = l3;
            sb5.append(l12);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("saveState: ");
            Long l13 = l4;
            sb6.append(l13);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowParams: ");
            String str3 = str;
            sb7.append(str3);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("flowing: ");
            Long l14 = l7;
            sb8.append(l14);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("smartSwitch: ");
            Long l15 = l8;
            sb9.append(l15);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("nightTimeInfo: ");
            String str4 = str2;
            sb10.append(str4);
            sb10.toString();
            C7524z0.this.m22181k2(q0Var, l, l9, l12, l13, str3, l10, l11, l14, l15, str4);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$l */
    class C7536l implements CompletionHandler {
        C7536l(C7524z0 z0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$m */
    class C7537m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f15175a;

        C7537m(boolean z) {
            this.f15175a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27696k(this.f15175a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$n */
    class C7538n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f15177a;

        /* renamed from: b */
        final /* synthetic */ String f15178b;

        /* renamed from: c */
        final /* synthetic */ String f15179c;

        /* renamed from: d */
        final /* synthetic */ int f15180d;

        C7538n(boolean z, String str, String str2, int i) {
            this.f15177a = z;
            this.f15178b = str;
            this.f15179c = str2;
            this.f15180d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27640G0(this.f15177a);
            C7524z0.this.mo23408d0().mo27638F0(this.f15178b);
            C7524z0.this.mo23408d0().mo27636E0(this.f15179c);
            C7524z0.this.mo23408d0().mo27634D0(this.f15180d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$o */
    class C7539o implements C6006h.C6016j {
        C7539o() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C7524z0.this.f15162B.mo28853a(l);
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
            C7524z0.this.f15162B.mo28860h(Panel1Service.C9385q0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$p */
    static /* synthetic */ class C7540p {

        /* renamed from: a */
        static final /* synthetic */ int[] f15183a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Panel1Service$q0[] r0 = com.yeelight.yeelib.device.xiaomi.Panel1Service.C9385q0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15183a = r0
                com.yeelight.yeelib.device.xiaomi.Panel1Service$q0 r1 = com.yeelight.yeelib.device.xiaomi.Panel1Service.C9385q0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15183a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Panel1Service$q0 r1 = com.yeelight.yeelib.device.xiaomi.Panel1Service.C9385q0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7524z0.C7540p.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$q */
    class C7541q implements CompletionHandler {
        C7541q() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$r */
    class C7542r implements CompletionHandler {
        C7542r() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$s */
    class C7543s implements CompletionHandler {
        C7543s() {
        }

        public void onFailed(int i, String str) {
            String.format("Mono4Device.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$t */
    class C7544t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f15187a;

        C7544t(long j) {
            this.f15187a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27697k0(this.f15187a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$u */
    class C7545u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15189a;

        C7545u(C9856y yVar) {
            this.f15189a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27654N0(this.f15189a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$v */
    class C7546v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15191a;

        C7546v(C9856y yVar) {
            this.f15191a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27654N0(this.f15191a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$w */
    class C7547w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15193a;

        C7547w(C9856y yVar) {
            this.f15193a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27654N0(this.f15193a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.z0$x */
    class C7548x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f15195a;

        C7548x(C9856y yVar) {
            this.f15195a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7524z0.this.mo23408d0().mo27654N0(this.f15195a);
        }
    }

    public C7524z0(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m22181k2(Panel1Service.C9385q0 q0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, String str2) {
        if (q0Var != null) {
            mo23408d0().mo27648K0(q0Var == Panel1Service.C9385q0.on);
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
        mo23408d0().mo27715t0(l7.longValue() != 0);
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
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
            mo27560F1().toggle(new C7543s());
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
        if (T.hashCode() == -948847040 && T.equals("yeelink.light.panel1")) {
        }
        return R$drawable.icon_yeelight_device_badge_panel_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_panel_big;
        }
        String T = mo23395T();
        if (T.hashCode() == -948847040 && T.equals("yeelink.light.panel1")) {
        }
        return R$drawable.icon_yeelight_device_badge_panel_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C7539o();
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
            mo27560F1().sendCmd(Panel1Service.C9357c0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7533i(z));
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
            mo27560F1().sendCmd(Panel1Service.C9357c0.cfg_init_power, String.valueOf(i), new C7534j(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Panel1Service.C9357c0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7526b(z));
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
        return mo28852l2(this.f15161A, this.f15162B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f15163z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f15160G, "Invalid handler!");
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
            mo27560F1().setPower(Panel1Service.C9385q0.off, new C7542r());
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
            mo27560F1().delCron(0L, new C7528d());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: f2 */
    public boolean mo27737f2(int i) {
        "sendRemoteKey --> Invoke, enable : " + i;
        try {
            mo27560F1().sendCmd(Panel1Service.C9357c0.pseudo_beacon, "4097|" + i, new C7536l(this));
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
            Panel1Service j2 = mo27560F1();
            Panel1Service.C9357c0 c0Var = Panel1Service.C9357c0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(c0Var, sb.toString(), new C7538n(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Panel1Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightPanel1Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Panel1Service.C9385q0.on, new C7541q());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28852l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Panel1Service.C9387r0)) {
            C4308b.m12139r(f15160G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Panel1Service.C9387r0) obj2);
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
            mo27560F1().openWithMode(Panel1Service.C9385q0.on, Panel1Service.C9359d0.smooth, 500L, Long.valueOf((long) i), new C7529e(i));
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
            mo27560F1().setBright(Long.valueOf(j), Panel1Service.C9359d0.smooth, 500L, new C7544t(j));
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
            mo27560F1().setDefault(new C7525a(this));
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
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C7527c(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
        try {
            mo27560F1().sendCmd(Panel1Service.C9357c0.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7537m(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f15163z);
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
                C4308b.m12139r("BATCH_RPC", "Mono4Device, Invalid length of batch rpc result: " + str);
            }
            m22181k2(Panel1Service.C9385q0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), jSONArray.getString(10));
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
                mo27560F1().getProperties(new C7535k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7545u(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C7546v(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C7547w(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C7548x(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f15160G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Temperature").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("SmartSwitch").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName()};
    }
}
