package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.Ceiling2Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling2Device;
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

/* renamed from: com.yeelight.yeelib.c.m.j */
public class C6867j extends C6029f {

    /* renamed from: G */
    public static final String f14189G = "j";

    /* renamed from: A */
    CompletionHandler f14190A = new C6875g(this);

    /* renamed from: B */
    Ceiling2Service.C8115s0 f14191B = new C6876h();

    /* renamed from: z */
    CompletionHandler f14192z = new C6874f(this);

    /* renamed from: com.yeelight.yeelib.c.m.j$a */
    class C6868a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14193a;

        C6868a(C9856y yVar) {
            this.f14193a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27654N0(this.f14193a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$a0 */
    class C6869a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14195a;

        C6869a0(C9856y yVar) {
            this.f14195a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27654N0(this.f14195a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$b */
    class C6870b implements CompletionHandler {
        C6870b(C6867j jVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$c */
    class C6871c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14197a;

        C6871c(boolean z) {
            this.f14197a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27652M0(this.f14197a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$d */
    class C6872d implements CompletionHandler {
        C6872d(C6867j jVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$e */
    class C6873e implements CompletionHandler {
        C6873e() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$f */
    class C6874f implements CompletionHandler {
        C6874f(C6867j jVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$g */
    class C6875g implements CompletionHandler {
        C6875g(C6867j jVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$h */
    class C6876h implements Ceiling2Service.C8115s0 {
        C6876h() {
        }

        /* renamed from: a */
        public void mo28440a(Long l) {
            "onBrightChanged: " + l;
            C6867j.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28441b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6867j.this.mo23408d0().mo27710r(2) == null) {
                C6867j.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6867j.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28442c(Long l) {
            "onFlowingChanged: " + l;
            C6867j.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28443d(Long l) {
            "onSaveStateChanged: " + l;
            C6867j.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28444e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6867j.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28445f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6867j.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28446g(Long l) {
            "onLanModeChanged: " + l;
            C6867j.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28447h(Ceiling2Service.C8113r0 r0Var) {
            C6024e eVar;
            "onPowerSwitched: " + r0Var.name();
            int i = C6887s.f14220a[r0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6867j.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6867j.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: i */
        public void mo28448i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6867j.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6867j.this.mo23408d0().mo27640G0(true);
                }
                C6867j.this.mo23408d0().mo27638F0(split[1]);
                C6867j.this.mo23408d0().mo27636E0(split[2]);
                C6867j.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C6867j.f14189G;
                "start = " + C6867j.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6867j.this.mo23408d0().mo27631C() + ", " + C6867j.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: k */
        public void mo28449k(Long l) {
            "onNLBrightChanged: " + l;
            if (l.longValue() != 0) {
                C6867j.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
                C6867j.this.mo23408d0().mo27642H0(l.longValue());
                return;
            }
            C6867j.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo28450m(Long l) {
            "onMiBandSleepChanged: " + l;
            C6867j.this.mo23408d0().mo27690h(l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$i */
    class C6877i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14201a;

        C6877i(boolean z) {
            this.f14201a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27682d(this.f14201a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$j */
    class C6878j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14203a;

        C6878j(int i) {
            this.f14203a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27644I0(this.f14203a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$k */
    class C6879k implements Ceiling2Service.C8107o0 {
        C6879k() {
        }

        /* renamed from: a */
        public void mo28451a(Ceiling2Service.C8113r0 r0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, String str2, Long l7, Long l8) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(r0Var != null ? r0Var.name() : "null");
            sb.toString();
            "bright: " + l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lanMode: ");
            Long l9 = l3;
            sb2.append(l9);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("saveState: ");
            Long l10 = l4;
            sb3.append(l10);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("delayoff: ");
            Long l11 = l2;
            sb4.append(l11);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("flowParams: ");
            String str3 = str;
            sb5.append(str3);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("nLBright: ");
            Long l12 = l6;
            sb6.append(l12);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("nightTimeInfo : ");
            String str4 = str2;
            sb7.append(str4);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("miBandSleep : ");
            Long l13 = l7;
            sb8.append(l13);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("flowing : ");
            Long l14 = l8;
            sb9.append(l14);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("onFromPower : ");
            Long l15 = l5;
            sb10.append(l15);
            sb10.toString();
            C6867j.this.m20367k2(r0Var, l, l11, str3, l9, l10, l15, l12, str4, l13, l14);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$l */
    class C6880l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14206a;

        C6880l(boolean z) {
            this.f14206a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27640G0(this.f14206a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$m */
    class C6881m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14208a;

        /* renamed from: b */
        final /* synthetic */ String f14209b;

        /* renamed from: c */
        final /* synthetic */ String f14210c;

        /* renamed from: d */
        final /* synthetic */ int f14211d;

        C6881m(boolean z, String str, String str2, int i) {
            this.f14208a = z;
            this.f14209b = str;
            this.f14210c = str2;
            this.f14211d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27640G0(this.f14208a);
            C6867j.this.mo23408d0().mo27638F0(this.f14209b);
            C6867j.this.mo23408d0().mo27636E0(this.f14210c);
            C6867j.this.mo23408d0().mo27634D0(this.f14211d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$n */
    class C6882n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f14213a;

        /* renamed from: b */
        final /* synthetic */ String f14214b;

        /* renamed from: c */
        final /* synthetic */ int f14215c;

        C6882n(String str, String str2, int i) {
            this.f14213a = str;
            this.f14214b = str2;
            this.f14215c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27638F0(this.f14213a);
            C6867j.this.mo23408d0().mo27636E0(this.f14214b);
            C6867j.this.mo23408d0().mo27634D0(this.f14215c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$o */
    class C6883o implements CompletionHandler {
        C6883o(C6867j jVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$p */
    class C6884p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14217a;

        C6884p(int i) {
            this.f14217a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27648K0(true);
            C6867j jVar = C6867j.this;
            jVar.mo23352w1(jVar.mo23433j1(this.f14217a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$q */
    class C6885q implements CompletionHandler {
        C6885q(C6867j jVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$r */
    class C6886r implements C6006h.C6016j {
        C6886r() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6867j.this.f14191B.mo28440a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
            C6867j.this.f14191B.mo28449k(l);
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C6867j.this.f14191B.mo28447h(Ceiling2Service.C8113r0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$s */
    static /* synthetic */ class C6887s {

        /* renamed from: a */
        static final /* synthetic */ int[] f14220a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$r0[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling2Service.C8113r0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14220a = r0
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$r0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling2Service.C8113r0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14220a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$r0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling2Service.C8113r0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6867j.C6887s.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$t */
    class C6888t implements CompletionHandler {
        C6888t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$u */
    class C6889u implements CompletionHandler {
        C6889u() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$v */
    class C6890v implements CompletionHandler {
        C6890v() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$w */
    class C6891w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14224a;

        C6891w(long j) {
            this.f14224a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27697k0(this.f14224a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$x */
    class C6892x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14226a;

        C6892x(C9856y yVar) {
            this.f14226a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27654N0(this.f14226a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$y */
    class C6893y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14228a;

        C6893y(C9856y yVar) {
            this.f14228a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27654N0(this.f14228a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j$z */
    class C6894z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14230a;

        C6894z(C9856y yVar) {
            this.f14230a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6867j.this.mo23408d0().mo27654N0(this.f14230a);
        }
    }

    public C6867j(String str, String str2, Device.Ownership ownership) {
        super(str, str2, "yeelink.light.ceiling2", ownership);
        C7565b bVar = C7565b.DEVICE_EVENT_OPEN;
        C7565b bVar2 = C7565b.DEVICE_EVENT_CLOSE;
        C7565b bVar3 = C7565b.DEVICE_EVENT_BRIGHT_CHANGE;
        C7563a aVar = C7563a.ON;
        C7563a aVar2 = C7563a.OFF;
        C7563a aVar3 = C7563a.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public void m20367k2(Ceiling2Service.C8113r0 r0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, String str2, Long l7, Long l8) {
        Ceiling2Service.C8113r0 r0Var2 = r0Var;
        boolean z = true;
        if (r0Var2 != null) {
            mo23408d0().mo27648K0(r0Var2 == Ceiling2Service.C8113r0.on);
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
        if (l6.longValue() == 0) {
            mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        } else {
            mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
            mo23408d0().mo27642H0(l6.longValue());
        }
        if (l5 != null) {
            mo23408d0().mo27644I0(l5.intValue());
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
        mo23408d0().mo27682d(l3 != null && l3.longValue() == 1);
        mo23408d0().mo27690h(l7 != null && l7.longValue() == 1);
        mo23408d0().mo27652M0(l4 != null && l4.longValue() == 1);
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
            mo27560F1().toggle(new C6890v());
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
        return R$drawable.icon_yeelight_device_badge_luna_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_luna_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6886r();
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
            mo27560F1().sendCmd(Ceiling2Service.C8085d0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6877i(z));
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
            mo27560F1().sendCmd(Ceiling2Service.C8085d0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C6882n(str, str2, i));
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
            mo27560F1().sendCmd(Ceiling2Service.C8085d0.cfg_init_power, String.valueOf(i), new C6878j(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Ceiling2Service.C8085d0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6871c(z));
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
        return mo28439l2(this.f14190A, this.f14191B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14192z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14189G, "Invalid handler!");
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
            mo27560F1().sendCmd(Ceiling2Service.C8085d0.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6883o(this));
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
            mo27560F1().setPower(Ceiling2Service.C8113r0.off, new C6889u());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6873e());
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
            mo27560F1().sendCmd(Ceiling2Service.C8085d0.nighttime, z ? "enable" : "disable", new C6880l(z));
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
            mo27560F1().sendCmd(Ceiling2Service.C8085d0.pseudo_beacon, "4097|" + i, new C6885q(this));
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
            Ceiling2Service j2 = mo27560F1();
            Ceiling2Service.C8085d0 d0Var = Ceiling2Service.C8085d0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(d0Var, sb.toString(), new C6881m(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Ceiling2Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeiling2Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Ceiling2Service.C8113r0.on, new C6888t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28439l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling2Service.C8115s0)) {
            C4308b.m12139r(f14189G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Ceiling2Service.C8115s0) obj2);
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
            mo27560F1().openWithMode(Ceiling2Service.C8113r0.on, Ceiling2Service.C8087e0.smooth, 500L, Long.valueOf((long) i), new C6884p(i));
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
            mo27560F1().setBright(Long.valueOf(j), Ceiling2Service.C8087e0.smooth, 500L, new C6891w(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        C4308b.m12139r(f14189G, "should not be here! fix me!");
        return false;
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        C4308b.m12139r(f14189G, "should not be here! fix me!");
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6870b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6872d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14192z);
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
                C4308b.m12139r("BATCH_RPC", "Ceiling2Device, Invalid length of batch rpc result: " + str);
            }
            m20367k2(Ceiling2Service.C8113r0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), jSONArray.getString(3), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)));
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
                mo27560F1().getProperties(new C6879k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6892x(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6893y(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6894z(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6869a0(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C6868a(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f14189G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("NLBright").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("MiBandSleep").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName()};
    }
}
