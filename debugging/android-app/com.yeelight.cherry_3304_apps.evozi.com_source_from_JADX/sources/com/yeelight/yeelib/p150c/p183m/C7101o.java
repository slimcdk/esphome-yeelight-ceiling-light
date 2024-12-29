package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.CeilingService;
import com.yeelight.yeelib.device.xiaomi.YeelightCeilingDevice;
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

/* renamed from: com.yeelight.yeelib.c.m.o */
public class C7101o extends C6029f {

    /* renamed from: G */
    public static final String f14542G = "o";

    /* renamed from: A */
    CompletionHandler f14543A = new C7111h(this);

    /* renamed from: B */
    CeilingService.C8390v0 f14544B = new C7112i();

    /* renamed from: z */
    CompletionHandler f14545z = new C7110g(this);

    /* renamed from: com.yeelight.yeelib.c.m.o$a */
    class C7102a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14546a;

        C7102a(C9856y yVar) {
            this.f14546a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27654N0(this.f14546a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$a0 */
    class C7103a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14548a;

        C7103a0(C9856y yVar) {
            this.f14548a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27654N0(this.f14548a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$b */
    class C7104b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14550a;

        C7104b(C9856y yVar) {
            this.f14550a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27654N0(this.f14550a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$b0 */
    class C7105b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14552a;

        C7105b0(C9856y yVar) {
            this.f14552a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27654N0(this.f14552a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$c */
    class C7106c implements CompletionHandler {
        C7106c(C7101o oVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$d */
    class C7107d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14554a;

        C7107d(boolean z) {
            this.f14554a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27652M0(this.f14554a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$e */
    class C7108e implements CompletionHandler {
        C7108e(C7101o oVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$f */
    class C7109f implements CompletionHandler {
        C7109f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$g */
    class C7110g implements CompletionHandler {
        C7110g(C7101o oVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$h */
    class C7111h implements CompletionHandler {
        C7111h(C7101o oVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$i */
    class C7112i implements CeilingService.C8390v0 {
        C7112i() {
        }

        /* renamed from: a */
        public void mo28568a(Long l) {
            "onBrightChanged: " + l;
            C7101o.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28569b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C7101o.this.mo23408d0().mo27710r(2) == null) {
                C7101o.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C7101o.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28570c(Long l) {
            "onFlowingChanged: " + l;
            C7101o.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28571d(Long l) {
            "onSaveStateChanged: " + l;
            C7101o.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28572e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C7101o.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28573f(Long l) {
            "onOnFromPowerChanged: " + l;
            C7101o.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28574g(Long l) {
            "onLanModeChanged: " + l;
            C7101o.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28575h(Long l) {
            "onCtScaleChanged: " + l;
            C7101o.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28576i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C7101o.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C7101o.this.mo23408d0().mo27640G0(true);
                }
                C7101o.this.mo23408d0().mo27638F0(split[1]);
                C7101o.this.mo23408d0().mo27636E0(split[2]);
                C7101o.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C7101o.f14542G;
                "start = " + C7101o.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C7101o.this.mo23408d0().mo27631C() + ", " + C7101o.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28577j(CeilingService.C8388u0 u0Var) {
            C6024e eVar;
            "onPowerSwitched: " + u0Var.name();
            int i = C7124u.f14578a[u0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C7101o.this.mo23408d0();
            } else if (i == 2) {
                eVar = C7101o.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: k */
        public void mo28578k(Long l) {
            "onNLBrightChanged: " + l;
            if (l.longValue() != 0) {
                C7101o.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
                C7101o.this.mo23408d0().mo27642H0(l.longValue());
                return;
            }
            C7101o.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo28579m(Long l) {
            "c: " + l;
            C7101o.this.mo23408d0().mo27690h(l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$j */
    class C7113j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14558a;

        C7113j(boolean z) {
            this.f14558a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27682d(this.f14558a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$k */
    class C7114k implements CeilingService.C8382r0 {
        C7114k() {
        }

        /* renamed from: a */
        public void mo28580a(CeilingService.C8388u0 u0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(u0Var != null ? u0Var.name() : "null");
            sb.toString();
            "bright: " + l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ct: ");
            Long l10 = l2;
            sb2.append(l10);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lanMode: ");
            Long l11 = l4;
            sb3.append(l11);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("saveState: ");
            Long l12 = l5;
            sb4.append(l12);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            Long l13 = l3;
            sb5.append(l13);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowParams: ");
            String str3 = str;
            sb6.append(str3);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("nLBright: ");
            Long l14 = l7;
            sb7.append(l14);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("nightTimeInfo : ");
            String str4 = str2;
            sb8.append(str4);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("miBandSleep : ");
            Long l15 = l8;
            sb9.append(l15);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("flowing : ");
            Long l16 = l9;
            sb10.append(l16);
            sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("onFromPower : ");
            Long l17 = l6;
            sb11.append(l17);
            sb11.toString();
            C7101o.this.m20996k2(u0Var, l, l10, l13, str3, l11, l12, l17, l14, str4, l15, l16);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$l */
    class C7115l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14561a;

        C7115l(int i) {
            this.f14561a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27644I0(this.f14561a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$m */
    class C7116m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14563a;

        C7116m(boolean z) {
            this.f14563a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27640G0(this.f14563a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$n */
    class C7117n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14565a;

        /* renamed from: b */
        final /* synthetic */ String f14566b;

        /* renamed from: c */
        final /* synthetic */ String f14567c;

        /* renamed from: d */
        final /* synthetic */ int f14568d;

        C7117n(boolean z, String str, String str2, int i) {
            this.f14565a = z;
            this.f14566b = str;
            this.f14567c = str2;
            this.f14568d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27640G0(this.f14565a);
            C7101o.this.mo23408d0().mo27638F0(this.f14566b);
            C7101o.this.mo23408d0().mo27636E0(this.f14567c);
            C7101o.this.mo23408d0().mo27634D0(this.f14568d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$o */
    class C7118o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f14570a;

        /* renamed from: b */
        final /* synthetic */ String f14571b;

        /* renamed from: c */
        final /* synthetic */ int f14572c;

        C7118o(String str, String str2, int i) {
            this.f14570a = str;
            this.f14571b = str2;
            this.f14572c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27638F0(this.f14570a);
            C7101o.this.mo23408d0().mo27636E0(this.f14571b);
            C7101o.this.mo23408d0().mo27634D0(this.f14572c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$p */
    class C7119p implements CompletionHandler {
        C7119p(C7101o oVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$q */
    class C7120q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14574a;

        C7120q(int i) {
            this.f14574a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27648K0(true);
            C7101o oVar = C7101o.this;
            oVar.mo23352w1(oVar.mo23433j1(this.f14574a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$r */
    class C7121r implements CompletionHandler {
        C7121r(C7101o oVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$s */
    class C7122s implements C6006h.C6016j {
        C7122s() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C7101o.this.f14544B.mo28568a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C7101o.this.f14544B.mo28575h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
            C7101o.this.f14544B.mo28578k(l);
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C7101o.this.f14544B.mo28577j(CeilingService.C8388u0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$t */
    class C7123t implements CompletionHandler {
        C7123t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$u */
    static /* synthetic */ class C7124u {

        /* renamed from: a */
        static final /* synthetic */ int[] f14578a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.CeilingService$u0[] r0 = com.yeelight.yeelib.device.xiaomi.CeilingService.C8388u0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14578a = r0
                com.yeelight.yeelib.device.xiaomi.CeilingService$u0 r1 = com.yeelight.yeelib.device.xiaomi.CeilingService.C8388u0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14578a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.CeilingService$u0 r1 = com.yeelight.yeelib.device.xiaomi.CeilingService.C8388u0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7101o.C7124u.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$v */
    class C7125v implements CompletionHandler {
        C7125v() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$w */
    class C7126w implements CompletionHandler {
        C7126w() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$x */
    class C7127x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14581a;

        C7127x(long j) {
            this.f14581a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27697k0(this.f14581a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$y */
    class C7128y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14583a;

        C7128y(int i) {
            this.f14583a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27707p0(this.f14583a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.o$z */
    class C7129z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14585a;

        C7129z(C9856y yVar) {
            this.f14585a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7101o.this.mo23408d0().mo27654N0(this.f14585a);
        }
    }

    public C7101o(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m20996k2(CeilingService.C8388u0 u0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9) {
        CeilingService.C8388u0 u0Var2 = u0Var;
        boolean z = true;
        if (u0Var2 != null) {
            mo23408d0().mo27648K0(u0Var2 == CeilingService.C8388u0.on);
        }
        mo23408d0().mo27707p0(l2.intValue());
        if (l != null) {
            mo23408d0().mo27697k0(l.longValue());
        }
        if (l3 != null) {
            if (mo23408d0().mo27710r(2) == null) {
                mo23408d0().mo27676a(new C7554e(l3.intValue(), l3.intValue()));
            } else {
                mo23408d0().mo27670V0(l3.intValue());
            }
        }
        if (l7.longValue() == 0) {
            mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        } else {
            mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
            mo23408d0().mo27642H0(l7.longValue());
        }
        if (l6 != null) {
            mo23408d0().mo27644I0(l6.intValue());
        }
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
        mo23408d0().mo27682d(l4 != null && l4.longValue() == 1);
        mo23408d0().mo27690h(l8 != null && l8.longValue() == 1);
        mo23408d0().mo27652M0(l5 != null && l5.longValue() == 1);
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
        C6024e d0 = mo23408d0();
        if (l9.longValue() == 0) {
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
            mo27560F1().toggle(new C7126w());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo27557C1() {
        return false;
    }

    /* renamed from: E1 */
    public boolean mo27559E1(String str, int i) {
        return false;
    }

    /* renamed from: F */
    public int mo23303F() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_luna_small;
        }
        String T = mo23395T();
        char c = 65535;
        int hashCode = T.hashCode();
        if (hashCode != 922669543) {
            if (hashCode != 922669545) {
                switch (hashCode) {
                    case -1462015185:
                        if (T.equals("yeelink.light.ceiling16")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -1462015184:
                        if (T.equals("yeelink.light.ceiling17")) {
                            c = 8;
                            break;
                        }
                        break;
                    case -1462015183:
                        if (T.equals("yeelink.light.ceiling18")) {
                            c = 9;
                            break;
                        }
                        break;
                    default:
                        switch (hashCode) {
                            case -1462015159:
                                if (T.equals("yeelink.light.ceiling21")) {
                                    c = 10;
                                    break;
                                }
                                break;
                            case -1462015158:
                                if (T.equals("yeelink.light.ceiling22")) {
                                    c = 11;
                                    break;
                                }
                                break;
                            case -1462015157:
                                if (T.equals("yeelink.light.ceiling23")) {
                                    c = 12;
                                    break;
                                }
                                break;
                            case -1462015156:
                                if (T.equals("yeelink.light.ceiling24")) {
                                    c = 13;
                                    break;
                                }
                                break;
                            default:
                                switch (hashCode) {
                                    case -1317475915:
                                        if (T.equals("yeelink.light.ceil30")) {
                                            c = 14;
                                            break;
                                        }
                                        break;
                                    case -1317475914:
                                        if (T.equals("yeelink.light.ceil31")) {
                                            c = 15;
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 922669547:
                                                if (T.equals("yeelink.light.ceiling5")) {
                                                    c = 6;
                                                    break;
                                                }
                                                break;
                                            case 922669548:
                                                if (T.equals("yeelink.light.ceiling6")) {
                                                    c = 1;
                                                    break;
                                                }
                                                break;
                                            case 922669549:
                                                if (T.equals("yeelink.light.ceiling7")) {
                                                    c = 3;
                                                    break;
                                                }
                                                break;
                                            case 922669550:
                                                if (T.equals("yeelink.light.ceiling8")) {
                                                    c = 4;
                                                    break;
                                                }
                                                break;
                                            case 922669551:
                                                if (T.equals("yeelink.light.ceiling9")) {
                                                    c = 2;
                                                    break;
                                                }
                                                break;
                                        }
                                }
                        }
                }
            } else if (T.equals("yeelink.light.ceiling3")) {
                c = 5;
            }
        } else if (T.equals("yeelink.light.ceiling1")) {
            c = 0;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_luna_small;
            case 1:
            case 2:
                return R$drawable.icon_yeelight_device_badge_nox_pro_small;
            case 3:
                return R$drawable.icon_yeelight_device_badge_nox_small;
            case 4:
                return R$drawable.icon_yeelight_device_badge_nox_plus_small;
            case 5:
                return R$drawable.icon_yeelight_device_badge_eos_small;
            case 6:
                return R$drawable.icon_yeelight_device_badge_cycle_small;
            case 7:
                return R$drawable.icon_yeelight_device_badge_ceiling16_small;
            case 8:
                return R$drawable.icon_yeelight_device_badge_ceiling17_small;
            case 9:
                return R$drawable.icon_yeelight_device_badge_ceiling18_small;
            case 10:
                return R$drawable.icon_yeelight_device_badge_ceiling21_small;
            case 11:
                return R$drawable.icon_yeelight_device_badge_ceiling22_small;
            case 12:
                return R$drawable.icon_yeelight_device_badge_ceiling23_small;
            case 13:
                return R$drawable.icon_yeelight_device_badge_ceiling24_small;
            case 14:
                return R$drawable.icon_yeelight_device_badge_ceiling30_small;
            case 15:
                return R$drawable.icon_yeelight_device_badge_ceiling31_small;
            default:
                return R$drawable.icon_yeelight_device_badge_luna_small;
        }
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_luna_big;
        }
        String T = mo23395T();
        char c = 65535;
        int hashCode = T.hashCode();
        if (hashCode != 922669543) {
            if (hashCode != 922669545) {
                switch (hashCode) {
                    case -1462015185:
                        if (T.equals("yeelink.light.ceiling16")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -1462015184:
                        if (T.equals("yeelink.light.ceiling17")) {
                            c = 8;
                            break;
                        }
                        break;
                    case -1462015183:
                        if (T.equals("yeelink.light.ceiling18")) {
                            c = 9;
                            break;
                        }
                        break;
                    default:
                        switch (hashCode) {
                            case -1462015159:
                                if (T.equals("yeelink.light.ceiling21")) {
                                    c = 10;
                                    break;
                                }
                                break;
                            case -1462015158:
                                if (T.equals("yeelink.light.ceiling22")) {
                                    c = 11;
                                    break;
                                }
                                break;
                            case -1462015157:
                                if (T.equals("yeelink.light.ceiling23")) {
                                    c = 12;
                                    break;
                                }
                                break;
                            case -1462015156:
                                if (T.equals("yeelink.light.ceiling24")) {
                                    c = 13;
                                    break;
                                }
                                break;
                            default:
                                switch (hashCode) {
                                    case -1317475915:
                                        if (T.equals("yeelink.light.ceil30")) {
                                            c = 14;
                                            break;
                                        }
                                        break;
                                    case -1317475914:
                                        if (T.equals("yeelink.light.ceil31")) {
                                            c = 15;
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 922669547:
                                                if (T.equals("yeelink.light.ceiling5")) {
                                                    c = 6;
                                                    break;
                                                }
                                                break;
                                            case 922669548:
                                                if (T.equals("yeelink.light.ceiling6")) {
                                                    c = 1;
                                                    break;
                                                }
                                                break;
                                            case 922669549:
                                                if (T.equals("yeelink.light.ceiling7")) {
                                                    c = 3;
                                                    break;
                                                }
                                                break;
                                            case 922669550:
                                                if (T.equals("yeelink.light.ceiling8")) {
                                                    c = 4;
                                                    break;
                                                }
                                                break;
                                            case 922669551:
                                                if (T.equals("yeelink.light.ceiling9")) {
                                                    c = 2;
                                                    break;
                                                }
                                                break;
                                        }
                                }
                        }
                }
            } else if (T.equals("yeelink.light.ceiling3")) {
                c = 5;
            }
        } else if (T.equals("yeelink.light.ceiling1")) {
            c = 0;
        }
        switch (c) {
            case 0:
                return R$drawable.icon_yeelight_device_badge_luna_big;
            case 1:
            case 2:
                return R$drawable.icon_yeelight_device_badge_nox_pro_big;
            case 3:
                return R$drawable.icon_yeelight_device_badge_nox_big;
            case 4:
                return R$drawable.icon_yeelight_device_badge_nox_plus_big;
            case 5:
                return R$drawable.icon_yeelight_device_badge_eos_big;
            case 6:
                return R$drawable.icon_yeelight_device_badge_cycle_big;
            case 7:
                return R$drawable.icon_yeelight_device_badge_ceiling16_big;
            case 8:
                return R$drawable.icon_yeelight_device_badge_ceiling17_big;
            case 9:
                return R$drawable.icon_yeelight_device_badge_ceiling18_big;
            case 10:
                return R$drawable.icon_yeelight_device_badge_ceiling21_big;
            case 11:
                return R$drawable.icon_yeelight_device_badge_ceiling22_big;
            case 12:
                return R$drawable.icon_yeelight_device_badge_ceiling23_big;
            case 13:
                return R$drawable.icon_yeelight_device_badge_ceiling24_big;
            case 14:
                return R$drawable.icon_yeelight_device_badge_ceiling30_big;
            case 15:
                return R$drawable.icon_yeelight_device_badge_ceiling31_big;
            default:
                return R$drawable.icon_yeelight_device_badge_luna_big;
        }
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C7122s();
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
            mo27560F1().sendCmd(CeilingService.C8358f0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7113j(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: Q1 */
    public boolean mo27571Q1(String str, String str2, int i) {
        "setNightTime --> Invoke, startTime : " + str + " , endTime : " + str2 + " , delayTime : " + i;
        try {
            mo27560F1().sendCmd(CeilingService.C8358f0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C7118o(str, str2, i));
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
            mo27560F1().sendCmd(CeilingService.C8358f0.cfg_init_power, String.valueOf(i), new C7115l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(CeilingService.C8358f0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7107d(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_ceiling) : U;
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28567l2(this.f14543A, this.f14544B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14545z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14542G, "Invalid handler!");
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
        "enableMiBandSleep --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(CeilingService.C8358f0.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7119p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        if (super.mo23326b1()) {
            return true;
        }
        try {
            mo27560F1().setPower(CeilingService.C8388u0.off, new C7125v());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C7109f());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: f1 */
    public boolean mo23328f1(boolean z) {
        "enableNightTime --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(CeilingService.C8358f0.nighttime, z ? "enable" : "disable", new C7116m(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: f2 */
    public boolean mo27737f2(int i) {
        "sendRemoteKey --> Invoke, enable : " + i;
        try {
            mo27560F1().sendCmd(CeilingService.C8358f0.pseudo_beacon, "4097|" + i, new C7121r(this));
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
            CeilingService j2 = mo27560F1();
            CeilingService.C8358f0 f0Var = CeilingService.C8358f0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(f0Var, sb.toString(), new C7117n(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public CeilingService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeilingDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(CeilingService.C8388u0.on, new C7123t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28567l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof CeilingService.C8390v0)) {
            C4308b.m12139r(f14542G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (CeilingService.C8390v0) obj2);
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
            mo27560F1().openWithMode(CeilingService.C8388u0.on, CeilingService.C8360g0.smooth, 500L, Long.valueOf((long) i), new C7120q(i));
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
            mo27560F1().setBright(Long.valueOf(j), CeilingService.C8360g0.smooth, 500L, new C7127x(j));
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
        if (super.mo23345s1(i)) {
            return true;
        }
        try {
            mo27560F1().setCt(Long.valueOf((long) i), CeilingService.C8360g0.smooth, 500L, new C7128y(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C7106c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C7108e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14545z);
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        String str2 = str;
        try {
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() != 12) {
                C4308b.m12139r("BATCH_RPC", "CeilingDevice, Invalid length of batch rpc result: " + str2);
            }
            m20996k2(CeilingService.C8388u0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), jSONArray.getString(4), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)));
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
                mo27560F1().getProperties(new C7114k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7129z(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C7103a0(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C7105b0(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C7102a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C7104b(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f14542G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("NLBright").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("MiBandSleep").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName()};
    }
}
