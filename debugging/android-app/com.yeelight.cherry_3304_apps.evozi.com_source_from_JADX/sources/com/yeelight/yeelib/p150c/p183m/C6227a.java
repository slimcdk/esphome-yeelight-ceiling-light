package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.BhfLightService;
import com.yeelight.yeelib.device.xiaomi.YeelightBhfLightDevice;
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

/* renamed from: com.yeelight.yeelib.c.m.a */
public class C6227a extends C6029f {

    /* renamed from: G */
    public static final String f13199G = "a";

    /* renamed from: A */
    CompletionHandler f13200A = new C6237h(this);

    /* renamed from: B */
    BhfLightService.C7696v0 f13201B = new C6238i();

    /* renamed from: z */
    CompletionHandler f13202z = new C6236g(this);

    /* renamed from: com.yeelight.yeelib.c.m.a$a */
    class C6228a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13203a;

        C6228a(C9856y yVar) {
            this.f13203a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27654N0(this.f13203a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$a0 */
    class C6229a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13205a;

        C6229a0(C9856y yVar) {
            this.f13205a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27654N0(this.f13205a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$b */
    class C6230b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13207a;

        C6230b(C9856y yVar) {
            this.f13207a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27654N0(this.f13207a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$b0 */
    class C6231b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13209a;

        C6231b0(C9856y yVar) {
            this.f13209a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27654N0(this.f13209a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$c */
    class C6232c implements CompletionHandler {
        C6232c(C6227a aVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$d */
    class C6233d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13211a;

        C6233d(boolean z) {
            this.f13211a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27652M0(this.f13211a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$e */
    class C6234e implements CompletionHandler {
        C6234e(C6227a aVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$f */
    class C6235f implements CompletionHandler {
        C6235f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$g */
    class C6236g implements CompletionHandler {
        C6236g(C6227a aVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$h */
    class C6237h implements CompletionHandler {
        C6237h(C6227a aVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$i */
    class C6238i implements BhfLightService.C7696v0 {
        C6238i() {
        }

        /* renamed from: a */
        public void mo28087a(Long l) {
            "onBrightChanged: " + l;
            C6227a.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28088b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6227a.this.mo23408d0().mo27710r(2) == null) {
                C6227a.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6227a.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28089c(Long l) {
            "onFlowingChanged: " + l;
            C6227a.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28090d(Long l) {
            "onSaveStateChanged: " + l;
            C6227a.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28091e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6227a.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28092f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6227a.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28093g(Long l) {
            "onLanModeChanged: " + l;
            C6227a.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28094h(Long l) {
            "onCtScaleChanged: " + l;
            C6227a.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28095i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6227a.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6227a.this.mo23408d0().mo27640G0(true);
                }
                C6227a.this.mo23408d0().mo27638F0(split[1]);
                C6227a.this.mo23408d0().mo27636E0(split[2]);
                C6227a.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C6227a.f13199G;
                "start = " + C6227a.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6227a.this.mo23408d0().mo27631C() + ", " + C6227a.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: k */
        public void mo28096k(Long l) {
            "onNLBrightChanged: " + l;
            if (l.longValue() != 0) {
                C6227a.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
                C6227a.this.mo23408d0().mo27642H0(l.longValue());
                return;
            }
            C6227a.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo28097m(Long l) {
            "c: " + l;
            C6227a.this.mo23408d0().mo27690h(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo28098n(BhfLightService.C7694u0 u0Var) {
            C6024e eVar;
            "onPowerSwitched: " + u0Var.name();
            int i = C6250u.f13235a[u0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6227a.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6227a.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$j */
    class C6239j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13215a;

        C6239j(boolean z) {
            this.f13215a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27682d(this.f13215a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$k */
    class C6240k implements BhfLightService.C7688r0 {
        C6240k() {
        }

        /* renamed from: a */
        public void mo28099a(BhfLightService.C7694u0 u0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(u0Var != null ? u0Var.name() : "null");
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            Long l10 = l;
            sb2.append(l);
            sb2.toString();
            "ct: " + l2;
            "delayoff: " + l3;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("nLBright: ");
            Long l11 = l7;
            sb3.append(l11);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("nightTimeInfo : ");
            String str3 = str2;
            sb4.append(str3);
            sb4.toString();
            C6227a.this.m18775k2(u0Var, l, l2, l3, l11, str3);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$l */
    class C6241l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13218a;

        C6241l(int i) {
            this.f13218a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27644I0(this.f13218a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$m */
    class C6242m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13220a;

        C6242m(boolean z) {
            this.f13220a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27640G0(this.f13220a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$n */
    class C6243n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13222a;

        /* renamed from: b */
        final /* synthetic */ String f13223b;

        /* renamed from: c */
        final /* synthetic */ String f13224c;

        /* renamed from: d */
        final /* synthetic */ int f13225d;

        C6243n(boolean z, String str, String str2, int i) {
            this.f13222a = z;
            this.f13223b = str;
            this.f13224c = str2;
            this.f13225d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27640G0(this.f13222a);
            C6227a.this.mo23408d0().mo27638F0(this.f13223b);
            C6227a.this.mo23408d0().mo27636E0(this.f13224c);
            C6227a.this.mo23408d0().mo27634D0(this.f13225d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$o */
    class C6244o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f13227a;

        /* renamed from: b */
        final /* synthetic */ String f13228b;

        /* renamed from: c */
        final /* synthetic */ int f13229c;

        C6244o(String str, String str2, int i) {
            this.f13227a = str;
            this.f13228b = str2;
            this.f13229c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27638F0(this.f13227a);
            C6227a.this.mo23408d0().mo27636E0(this.f13228b);
            C6227a.this.mo23408d0().mo27634D0(this.f13229c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$p */
    class C6245p implements CompletionHandler {
        C6245p(C6227a aVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$q */
    class C6246q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13231a;

        C6246q(int i) {
            this.f13231a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27648K0(true);
            C6227a aVar = C6227a.this;
            aVar.mo23352w1(aVar.mo23433j1(this.f13231a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$r */
    class C6247r implements CompletionHandler {
        C6247r(C6227a aVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$s */
    class C6248s implements C6006h.C6016j {
        C6248s() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6227a.this.f13201B.mo28087a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6227a.this.f13201B.mo28094h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
            C6227a.this.f13201B.mo28096k(l);
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C6227a.this.f13201B.mo28098n(BhfLightService.C7694u0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$t */
    class C6249t implements CompletionHandler {
        C6249t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$u */
    static /* synthetic */ class C6250u {

        /* renamed from: a */
        static final /* synthetic */ int[] f13235a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.BhfLightService$u0[] r0 = com.yeelight.yeelib.device.xiaomi.BhfLightService.C7694u0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13235a = r0
                com.yeelight.yeelib.device.xiaomi.BhfLightService$u0 r1 = com.yeelight.yeelib.device.xiaomi.BhfLightService.C7694u0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13235a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.BhfLightService$u0 r1 = com.yeelight.yeelib.device.xiaomi.BhfLightService.C7694u0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6227a.C6250u.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$v */
    class C6251v implements CompletionHandler {
        C6251v() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$w */
    class C6252w implements CompletionHandler {
        C6252w() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$x */
    class C6253x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f13238a;

        C6253x(long j) {
            this.f13238a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27697k0(this.f13238a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$y */
    class C6254y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13240a;

        C6254y(int i) {
            this.f13240a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27707p0(this.f13240a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.a$z */
    class C6255z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13242a;

        C6255z(C9856y yVar) {
            this.f13242a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6227a.this.mo23408d0().mo27654N0(this.f13242a);
        }
    }

    public C6227a(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m18775k2(BhfLightService.C7694u0 u0Var, Long l, Long l2, Long l3, Long l4, String str) {
        if (u0Var != null) {
            mo23408d0().mo27648K0(u0Var == BhfLightService.C7694u0.on);
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
        if (l4.longValue() == 0) {
            mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        } else {
            mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
            mo23408d0().mo27642H0(l4.longValue());
        }
        String[] split = str.split("\\|");
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
            mo27560F1().toggle(new C6252w());
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
        return R$drawable.icon_yeelight_default_avata;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_default_avata;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6248s();
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
            mo27560F1().sendCmd(BhfLightService.C7664f0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6239j(z));
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
            mo27560F1().sendCmd(BhfLightService.C7664f0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C6244o(str, str2, i));
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
            mo27560F1().sendCmd(BhfLightService.C7664f0.cfg_init_power, String.valueOf(i), new C6241l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(BhfLightService.C7664f0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6233d(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_bhf) : U;
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28086l2(this.f13200A, this.f13201B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13202z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13199G, "Invalid handler!");
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
            mo27560F1().sendCmd(BhfLightService.C7664f0.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6245p(this));
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
            mo27560F1().setPower(BhfLightService.C7694u0.off, new C6251v());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6235f());
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
            mo27560F1().sendCmd(BhfLightService.C7664f0.nighttime, z ? "enable" : "disable", new C6242m(z));
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
            mo27560F1().sendCmd(BhfLightService.C7664f0.pseudo_beacon, "4097|" + i, new C6247r(this));
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
            BhfLightService j2 = mo27560F1();
            BhfLightService.C7664f0 f0Var = BhfLightService.C7664f0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(f0Var, sb.toString(), new C6243n(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public BhfLightService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightBhfLightDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(BhfLightService.C7694u0.on, new C6249t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28086l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof BhfLightService.C7696v0)) {
            C4308b.m12139r(f13199G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (BhfLightService.C7696v0) obj2);
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
            mo27560F1().openWithMode(BhfLightService.C7694u0.on, BhfLightService.C7666g0.smooth, 500L, Long.valueOf((long) i), new C6246q(i));
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
            mo27560F1().setBright(Long.valueOf(j), BhfLightService.C7666g0.smooth, 500L, new C6253x(j));
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
            mo27560F1().setCt(Long.valueOf((long) i), BhfLightService.C7666g0.smooth, 500L, new C6254y(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6232c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6234e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f13202z);
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 6) {
                C4308b.m12139r("BATCH_RPC", "CeilingDevice, Invalid length of batch rpc result: " + str);
            }
            m18775k2(BhfLightService.C7694u0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5));
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
                mo27560F1().getProperties(new C6240k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6255z(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6229a0(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6231b0(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6228a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C6230b(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f13199G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("NLBright").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName()};
    }
}
