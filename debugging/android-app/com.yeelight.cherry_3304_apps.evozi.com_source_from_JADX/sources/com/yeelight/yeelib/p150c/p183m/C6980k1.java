package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.YilaiCeilingDevice;
import com.yeelight.yeelib.device.xiaomi.YilaiCeilingService;
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

/* renamed from: com.yeelight.yeelib.c.m.k1 */
public class C6980k1 extends C6029f {

    /* renamed from: G */
    public static final String f14358G = "k1";

    /* renamed from: A */
    CompletionHandler f14359A = new C6988g(this);

    /* renamed from: B */
    YilaiCeilingService.C9748s0 f14360B = new C6989h();

    /* renamed from: z */
    CompletionHandler f14361z = new C6987f(this);

    /* renamed from: com.yeelight.yeelib.c.m.k1$a */
    class C6981a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14362a;

        C6981a(C9856y yVar) {
            this.f14362a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27654N0(this.f14362a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$a0 */
    class C6982a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14364a;

        C6982a0(C9856y yVar) {
            this.f14364a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27654N0(this.f14364a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$b */
    class C6983b implements CompletionHandler {
        C6983b(C6980k1 k1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$c */
    class C6984c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14366a;

        C6984c(boolean z) {
            this.f14366a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27652M0(this.f14366a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$d */
    class C6985d implements CompletionHandler {
        C6985d(C6980k1 k1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$e */
    class C6986e implements CompletionHandler {
        C6986e() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$f */
    class C6987f implements CompletionHandler {
        C6987f(C6980k1 k1Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$g */
    class C6988g implements CompletionHandler {
        C6988g(C6980k1 k1Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$h */
    class C6989h implements YilaiCeilingService.C9748s0 {
        C6989h() {
        }

        /* renamed from: a */
        public void mo28503a(Long l) {
            "onBrightChanged: " + l;
            C6980k1.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28504b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6980k1.this.mo23408d0().mo27710r(2) == null) {
                C6980k1.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6980k1.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28505c(Long l) {
            "onFlowingChanged: " + l;
            C6980k1.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28506d(Long l) {
            "onSaveStateChanged: " + l;
            C6980k1.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28507e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6980k1.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28508f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6980k1.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28509g(Long l) {
            "onLanModeChanged: " + l;
            C6980k1.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28510h(Long l) {
            "onCtScaleChanged: " + l;
            C6980k1.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28511i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6980k1.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6980k1.this.mo23408d0().mo27640G0(true);
                }
                C6980k1.this.mo23408d0().mo27638F0(split[1]);
                C6980k1.this.mo23408d0().mo27636E0(split[2]);
                C6980k1.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C6980k1.f14358G;
                "start = " + C6980k1.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6980k1.this.mo23408d0().mo27631C() + ", " + C6980k1.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28512j(YilaiCeilingService.C9746r0 r0Var) {
            C6024e eVar;
            "onPowerSwitched: " + r0Var.name();
            int i = C7000s.f14389a[r0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6980k1.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6980k1.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: m */
        public void mo28513m(Long l) {
            "c: " + l;
            C6980k1.this.mo23408d0().mo27690h(l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$i */
    class C6990i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14370a;

        C6990i(boolean z) {
            this.f14370a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27682d(this.f14370a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$j */
    class C6991j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14372a;

        C6991j(int i) {
            this.f14372a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27644I0(this.f14372a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$k */
    class C6992k implements YilaiCeilingService.C9740o0 {
        C6992k() {
        }

        /* renamed from: a */
        public void mo28514a(YilaiCeilingService.C9746r0 r0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, String str2, Long l8) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(r0Var != null ? r0Var.name() : "null");
            sb.toString();
            "bright: " + l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ct: ");
            Long l9 = l2;
            sb2.append(l9);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lanMode: ");
            Long l10 = l5;
            sb3.append(l10);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("saveState: ");
            Long l11 = l4;
            sb4.append(l11);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            Long l12 = l3;
            sb5.append(l12);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowParams: ");
            String str3 = str;
            sb6.append(str3);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("nightTimeInfo : ");
            String str4 = str2;
            sb7.append(str4);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("miBandSleep : ");
            Long l13 = l8;
            sb8.append(l13);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("flowing : ");
            Long l14 = l7;
            sb9.append(l14);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("onFromPower : ");
            Long l15 = l6;
            sb10.append(l15);
            sb10.toString();
            C6980k1.this.m20649k2(r0Var, l, l9, l12, str3, l10, l11, l15, str4, l13, l14);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$l */
    class C6993l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14375a;

        C6993l(boolean z) {
            this.f14375a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27640G0(this.f14375a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$m */
    class C6994m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14377a;

        /* renamed from: b */
        final /* synthetic */ String f14378b;

        /* renamed from: c */
        final /* synthetic */ String f14379c;

        /* renamed from: d */
        final /* synthetic */ int f14380d;

        C6994m(boolean z, String str, String str2, int i) {
            this.f14377a = z;
            this.f14378b = str;
            this.f14379c = str2;
            this.f14380d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27640G0(this.f14377a);
            C6980k1.this.mo23408d0().mo27638F0(this.f14378b);
            C6980k1.this.mo23408d0().mo27636E0(this.f14379c);
            C6980k1.this.mo23408d0().mo27634D0(this.f14380d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$n */
    class C6995n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f14382a;

        /* renamed from: b */
        final /* synthetic */ String f14383b;

        /* renamed from: c */
        final /* synthetic */ int f14384c;

        C6995n(String str, String str2, int i) {
            this.f14382a = str;
            this.f14383b = str2;
            this.f14384c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27638F0(this.f14382a);
            C6980k1.this.mo23408d0().mo27636E0(this.f14383b);
            C6980k1.this.mo23408d0().mo27634D0(this.f14384c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$o */
    class C6996o implements CompletionHandler {
        C6996o(C6980k1 k1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$p */
    class C6997p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14386a;

        C6997p(int i) {
            this.f14386a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27648K0(true);
            C6980k1 k1Var = C6980k1.this;
            k1Var.mo23352w1(k1Var.mo23433j1(this.f14386a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$q */
    class C6998q implements CompletionHandler {
        C6998q(C6980k1 k1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$r */
    class C6999r implements C6006h.C6016j {
        C6999r() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6980k1.this.f14360B.mo28503a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6980k1.this.f14360B.mo28510h(l);
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
            C6980k1.this.f14360B.mo28512j(YilaiCeilingService.C9746r0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$s */
    static /* synthetic */ class C7000s {

        /* renamed from: a */
        static final /* synthetic */ int[] f14389a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$r0[] r0 = com.yeelight.yeelib.device.xiaomi.YilaiCeilingService.C9746r0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14389a = r0
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$r0 r1 = com.yeelight.yeelib.device.xiaomi.YilaiCeilingService.C9746r0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14389a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$r0 r1 = com.yeelight.yeelib.device.xiaomi.YilaiCeilingService.C9746r0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6980k1.C7000s.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$t */
    class C7001t implements CompletionHandler {
        C7001t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$u */
    class C7002u implements CompletionHandler {
        C7002u() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$v */
    class C7003v implements CompletionHandler {
        C7003v() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$w */
    class C7004w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14393a;

        C7004w(long j) {
            this.f14393a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27697k0(this.f14393a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$x */
    class C7005x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14395a;

        C7005x(int i) {
            this.f14395a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27707p0(this.f14395a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$y */
    class C7006y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14397a;

        C7006y(C9856y yVar) {
            this.f14397a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27654N0(this.f14397a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k1$z */
    class C7007z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14399a;

        C7007z(C9856y yVar) {
            this.f14399a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6980k1.this.mo23408d0().mo27654N0(this.f14399a);
        }
    }

    public C6980k1(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m20649k2(YilaiCeilingService.C9746r0 r0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, String str2, Long l7, Long l8) {
        boolean z = true;
        if (r0Var != null) {
            mo23408d0().mo27648K0(r0Var == YilaiCeilingService.C9746r0.on);
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
        mo23408d0().mo27690h(l7 != null && l7.longValue() == 1);
        mo23408d0().mo27652M0(l5 != null && l5.longValue() == 1);
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
        C6024e d0 = mo23408d0();
        if (l8.longValue() == 0) {
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
            mo27560F1().toggle(new C7003v());
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
            return R$drawable.icon_yeelight_device_badge_kaiyue_480_small;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -888668266:
                if (T.equals("yilai.light.ceiling1")) {
                    c = 0;
                    break;
                }
                break;
            case -888668265:
                if (T.equals("yilai.light.ceiling2")) {
                    c = 1;
                    break;
                }
                break;
            case -888668264:
                if (T.equals("yilai.light.ceiling3")) {
                    c = 2;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? R$drawable.icon_yeelight_device_badge_kaiyue_480_small : R$drawable.icon_yeelight_device_badge_hefeng_pro_small : R$drawable.icon_yeelight_device_badge_hefeng_430_small : R$drawable.icon_yeelight_device_badge_kaiyue_480_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_kaiyue_480_big;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -888668266:
                if (T.equals("yilai.light.ceiling1")) {
                    c = 0;
                    break;
                }
                break;
            case -888668265:
                if (T.equals("yilai.light.ceiling2")) {
                    c = 1;
                    break;
                }
                break;
            case -888668264:
                if (T.equals("yilai.light.ceiling3")) {
                    c = 2;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? R$drawable.icon_yeelight_device_badge_kaiyue_480_big : R$drawable.icon_yeelight_device_badge_hefeng_pro_big : R$drawable.icon_yeelight_device_badge_hefeng_430_big : R$drawable.icon_yeelight_device_badge_kaiyue_480_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6999r();
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
            mo27560F1().sendCmd(YilaiCeilingService.C9718d0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6990i(z));
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
            mo27560F1().sendCmd(YilaiCeilingService.C9718d0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C6995n(str, str2, i));
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
            mo27560F1().sendCmd(YilaiCeilingService.C9718d0.cfg_init_power, String.valueOf(i), new C6991j(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(YilaiCeilingService.C9718d0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6984c(z));
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
        return mo28502l2(this.f14359A, this.f14360B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14361z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14358G, "Invalid handler!");
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
            mo27560F1().sendCmd(YilaiCeilingService.C9718d0.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6996o(this));
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
            mo27560F1().setPower(YilaiCeilingService.C9746r0.off, new C7002u());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6986e());
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
            mo27560F1().sendCmd(YilaiCeilingService.C9718d0.nighttime, z ? "enable" : "disable", new C6993l(z));
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
            mo27560F1().sendCmd(YilaiCeilingService.C9718d0.pseudo_beacon, "4097|" + i, new C6998q(this));
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
            YilaiCeilingService j2 = mo27560F1();
            YilaiCeilingService.C9718d0 d0Var = YilaiCeilingService.C9718d0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(d0Var, sb.toString(), new C6994m(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public YilaiCeilingService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YilaiCeilingDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(YilaiCeilingService.C9746r0.on, new C7001t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28502l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof YilaiCeilingService.C9748s0)) {
            C4308b.m12139r(f14358G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (YilaiCeilingService.C9748s0) obj2);
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
            mo27560F1().openWithMode(YilaiCeilingService.C9746r0.on, YilaiCeilingService.C9720e0.smooth, 500L, Long.valueOf((long) i), new C6997p(i));
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
            mo27560F1().setBright(Long.valueOf(j), YilaiCeilingService.C9720e0.smooth, 500L, new C7004w(j));
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
            mo27560F1().setCt(Long.valueOf((long) i), YilaiCeilingService.C9720e0.smooth, 500L, new C7005x(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6983b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6985d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14361z);
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
                C4308b.m12139r("BATCH_RPC", "CeilingDevice, Invalid length of batch rpc result: " + str);
            }
            m20649k2(YilaiCeilingService.C9746r0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), jSONArray.getString(4), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)));
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
                mo27560F1().getProperties(new C6992k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7006y(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C7007z(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6982a0(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6981a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f14358G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("MiBandSleep").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName()};
    }
}
