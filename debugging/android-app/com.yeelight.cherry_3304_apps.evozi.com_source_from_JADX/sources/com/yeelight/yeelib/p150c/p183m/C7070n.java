package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.CeilingDService;
import com.yeelight.yeelib.device.xiaomi.YeelightCeilingDDevice;
import com.yeelight.yeelib.p150c.C4191d;
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

/* renamed from: com.yeelight.yeelib.c.m.n */
public class C7070n extends C6029f {

    /* renamed from: G */
    public static final String f14495G = "n";

    /* renamed from: A */
    CompletionHandler f14496A = new C7082i(this);

    /* renamed from: B */
    CeilingDService.C8344x0 f14497B = new C7083j();

    /* renamed from: z */
    CompletionHandler f14498z = new C7081h(this);

    /* renamed from: com.yeelight.yeelib.c.m.n$a */
    class C7071a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14499a;

        C7071a(C9856y yVar) {
            this.f14499a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27654N0(this.f14499a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$a0 */
    class C7072a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14501a;

        C7072a0(C9856y yVar) {
            this.f14501a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27654N0(this.f14501a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$b */
    class C7073b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14503a;

        C7073b(C9856y yVar) {
            this.f14503a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27654N0(this.f14503a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$b0 */
    class C7074b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14505a;

        C7074b0(C9856y yVar) {
            this.f14505a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27654N0(this.f14505a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$c */
    class C7075c implements CompletionHandler {
        C7075c(C7070n nVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$c0 */
    class C7076c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14507a;

        C7076c0(C9856y yVar) {
            this.f14507a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27654N0(this.f14507a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$d */
    class C7077d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14509a;

        C7077d(boolean z) {
            this.f14509a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27652M0(this.f14509a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$e */
    class C7078e implements CompletionHandler {
        C7078e(C7070n nVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$f */
    class C7079f implements CompletionHandler {
        C7079f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$g */
    class C7080g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14512a;

        C7080g(long j) {
            this.f14512a = j;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27662R0(this.f14512a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$h */
    class C7081h implements CompletionHandler {
        C7081h(C7070n nVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$i */
    class C7082i implements CompletionHandler {
        C7082i(C7070n nVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$j */
    class C7083j implements CeilingDService.C8344x0 {
        C7083j() {
        }

        /* renamed from: a */
        public void mo28551a(Long l) {
            "onBrightChanged: " + l;
            C7070n.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28552b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C7070n.this.mo23408d0().mo27710r(2) == null) {
                C7070n.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C7070n.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28553c(Long l) {
            "onFlowingChanged: " + l;
            C7070n.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28554d(Long l) {
            "onSaveStateChanged: " + l;
            C7070n.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28555e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C7070n.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28556f(Long l) {
            "onOnFromPowerChanged: " + l;
            C7070n.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28557g(Long l) {
            "onLanModeChanged: " + l;
            C7070n.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28558h(Long l) {
            "onCtScaleChanged: " + l;
            C7070n.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28559i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C7070n.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C7070n.this.mo23408d0().mo27640G0(true);
                }
                C7070n.this.mo23408d0().mo27638F0(split[1]);
                C7070n.this.mo23408d0().mo27636E0(split[2]);
                C7070n.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C7070n.f14495G;
                "start = " + C7070n.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C7070n.this.mo23408d0().mo27631C() + ", " + C7070n.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28560j(CeilingDService.C8342w0 w0Var) {
            C6024e eVar;
            "onPowerSwitched: " + w0Var.name();
            int i = C7095v.f14535a[w0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C7070n.this.mo23408d0();
            } else if (i == 2) {
                eVar = C7070n.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: k */
        public void mo28561k(Long l) {
            "onNLBrightChanged: " + l;
            if (l.longValue() != 0) {
                C7070n.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
                C7070n.this.mo23408d0().mo27642H0(l.longValue());
                return;
            }
            C7070n.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo28562m(Long l) {
            "c: " + l;
            C7070n.this.mo23408d0().mo27690h(l.longValue() == 1);
        }

        /* renamed from: q */
        public void mo28563q(Long l) {
            "onTransIntervalDfltChanged: " + l;
            if (l != null) {
                C7070n.this.mo23408d0().mo27662R0(l.longValue());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$k */
    class C7084k implements CeilingDService.C8334s0 {
        C7084k() {
        }

        /* renamed from: a */
        public void mo28564a(CeilingDService.C8342w0 w0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(w0Var != null ? w0Var.name() : "null");
            sb.toString();
            "bright: " + l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ct: ");
            Long l11 = l2;
            sb2.append(l11);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lanMode: ");
            Long l12 = l4;
            sb3.append(l12);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("saveState: ");
            Long l13 = l5;
            sb4.append(l13);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            Long l14 = l3;
            sb5.append(l14);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowParams: ");
            String str3 = str;
            sb6.append(str3);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("nLBright: ");
            Long l15 = l7;
            sb7.append(l15);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("nightTimeInfo : ");
            String str4 = str2;
            sb8.append(str4);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("miBandSleep : ");
            Long l16 = l8;
            sb9.append(l16);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("flowing : ");
            Long l17 = l9;
            sb10.append(l17);
            sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("onFromPower : ");
            Long l18 = l6;
            sb11.append(l18);
            sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append("transIntervalDflt: ");
            Long l19 = l10;
            sb12.append(l19);
            sb12.toString();
            C7070n.this.m20899k2(w0Var, l, l11, l14, str3, l12, l13, l18, l15, str4, l16, l17, l19);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$l */
    class C7085l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14516a;

        C7085l(boolean z) {
            this.f14516a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27682d(this.f14516a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$m */
    class C7086m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14518a;

        C7086m(int i) {
            this.f14518a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27644I0(this.f14518a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$n */
    class C7087n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14520a;

        C7087n(boolean z) {
            this.f14520a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27640G0(this.f14520a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$o */
    class C7088o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14522a;

        /* renamed from: b */
        final /* synthetic */ String f14523b;

        /* renamed from: c */
        final /* synthetic */ String f14524c;

        /* renamed from: d */
        final /* synthetic */ int f14525d;

        C7088o(boolean z, String str, String str2, int i) {
            this.f14522a = z;
            this.f14523b = str;
            this.f14524c = str2;
            this.f14525d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27640G0(this.f14522a);
            C7070n.this.mo23408d0().mo27638F0(this.f14523b);
            C7070n.this.mo23408d0().mo27636E0(this.f14524c);
            C7070n.this.mo23408d0().mo27634D0(this.f14525d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$p */
    class C7089p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f14527a;

        /* renamed from: b */
        final /* synthetic */ String f14528b;

        /* renamed from: c */
        final /* synthetic */ int f14529c;

        C7089p(String str, String str2, int i) {
            this.f14527a = str;
            this.f14528b = str2;
            this.f14529c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27638F0(this.f14527a);
            C7070n.this.mo23408d0().mo27636E0(this.f14528b);
            C7070n.this.mo23408d0().mo27634D0(this.f14529c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$q */
    class C7090q implements CompletionHandler {
        C7090q(C7070n nVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$r */
    class C7091r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14531a;

        C7091r(int i) {
            this.f14531a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27648K0(true);
            C7070n nVar = C7070n.this;
            nVar.mo23352w1(nVar.mo23433j1(this.f14531a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$s */
    class C7092s implements CompletionHandler {
        C7092s(C7070n nVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$t */
    class C7093t implements CompletionHandler {
        C7093t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$u */
    class C7094u implements C6006h.C6016j {
        C7094u() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C7070n.this.f14497B.mo28551a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C7070n.this.f14497B.mo28558h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
            C7070n.this.f14497B.mo28561k(l);
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C7070n.this.f14497B.mo28560j(CeilingDService.C8342w0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$v */
    static /* synthetic */ class C7095v {

        /* renamed from: a */
        static final /* synthetic */ int[] f14535a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.CeilingDService$w0[] r0 = com.yeelight.yeelib.device.xiaomi.CeilingDService.C8342w0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14535a = r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$w0 r1 = com.yeelight.yeelib.device.xiaomi.CeilingDService.C8342w0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14535a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.CeilingDService$w0 r1 = com.yeelight.yeelib.device.xiaomi.CeilingDService.C8342w0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7070n.C7095v.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$w */
    class C7096w implements CompletionHandler {
        C7096w() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$x */
    class C7097x implements CompletionHandler {
        C7097x() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$y */
    class C7098y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14538a;

        C7098y(long j) {
            this.f14538a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27697k0(this.f14538a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.n$z */
    class C7099z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14540a;

        C7099z(int i) {
            this.f14540a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7070n.this.mo23408d0().mo27707p0(this.f14540a);
        }
    }

    public C7070n(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m20899k2(CeilingDService.C8342w0 w0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10) {
        CeilingDService.C8342w0 w0Var2 = w0Var;
        boolean z = true;
        if (w0Var2 != null) {
            mo23408d0().mo27648K0(w0Var2 == CeilingDService.C8342w0.on);
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
        if (l10 != null) {
            mo23408d0().mo27662R0(l10.longValue());
        }
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C7097x());
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
        return R$drawable.icon_yeelight_device_badge_ceilingc_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_ceilingc_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C7094u();
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
            mo27560F1().sendCmd(CeilingDService.C8310g0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7085l(z));
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
            mo27560F1().sendCmd(CeilingDService.C8310g0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C7089p(str, str2, i));
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
            mo27560F1().sendCmd(CeilingDService.C8310g0.cfg_init_power, String.valueOf(i), new C7086m(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(CeilingDService.C8310g0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7077d(z));
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
        return mo28550l2(this.f14496A, this.f14497B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14498z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14495G, "Invalid handler!");
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
            mo27560F1().sendCmd(CeilingDService.C8310g0.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7090q(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23313O1()) {
            return true;
        }
        try {
            mo27560F1().setPower(CeilingDService.C8342w0.off, new C7096w());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C7079f());
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
            mo27560F1().sendCmd(CeilingDService.C8310g0.nighttime, z ? "enable" : "disable", new C7087n(z));
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
            mo27560F1().sendCmd(CeilingDService.C8310g0.pseudo_beacon, "4097|" + i, new C7092s(this));
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
            CeilingDService j2 = mo27560F1();
            CeilingDService.C8310g0 g0Var = CeilingDService.C8310g0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(g0Var, sb.toString(), new C7088o(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public CeilingDService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeilingDDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23324Y1()) {
            return true;
        }
        try {
            mo27560F1().setPower(CeilingDService.C8342w0.on, new C7093t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28550l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof CeilingDService.C8344x0)) {
            C4308b.m12139r(f14495G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (CeilingDService.C8344x0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23325Z1(mo23408d0().mo27653N(), i)) {
            return true;
        }
        try {
            mo27560F1().openWithMode(CeilingDService.C8342w0.on, CeilingDService.C8312h0.smooth, Long.valueOf(mo23408d0().mo27653N()), Long.valueOf((long) i), new C7091r(i));
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
            mo27560F1().setBright(Long.valueOf(j), new C7098y(j));
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
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23309J2(i)) {
            return true;
        }
        try {
            mo27560F1().setCt(Long.valueOf((long) i), new C7099z(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C7075c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C7078e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14498z);
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
            if (jSONArray.length() != 13) {
                C4308b.m12139r("BATCH_RPC", "CeilingDDevice, Invalid length of batch rpc result: " + str2);
            }
            m20899k2(CeilingDService.C8342w0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), jSONArray.getString(4), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)));
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
                mo27560F1().getProperties(new C7084k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7072a0(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C7074b0(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C7076c0(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C7071a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C7073b(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f14495G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: y1 */
    public boolean mo23435y1(long j) {
        try {
            CeilingDService j2 = mo27560F1();
            CeilingDService.C8310g0 g0Var = CeilingDService.C8310g0.trans_default;
            j2.sendCmd(g0Var, j + ",1", new C7080g(j));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("NLBright").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("MiBandSleep").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("TransIntervalDflt").getInternalName()};
    }
}
