package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.Ceiling6Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling6Device;
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

/* renamed from: com.yeelight.yeelib.c.m.m */
public class C7039m extends C6029f {

    /* renamed from: G */
    public static final String f14448G = "m";

    /* renamed from: A */
    CompletionHandler f14449A = new C7050h(this);

    /* renamed from: B */
    Ceiling6Service.C8294x0 f14450B = new C7051i();

    /* renamed from: z */
    CompletionHandler f14451z = new C7049g(this);

    /* renamed from: com.yeelight.yeelib.c.m.m$a */
    class C7040a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14452a;

        C7040a(C9856y yVar) {
            this.f14452a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27654N0(this.f14452a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$a0 */
    class C7041a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14454a;

        C7041a0(C9856y yVar) {
            this.f14454a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27654N0(this.f14454a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$b */
    class C7042b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14456a;

        C7042b(C9856y yVar) {
            this.f14456a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27654N0(this.f14456a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$b0 */
    class C7043b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14458a;

        C7043b0(C9856y yVar) {
            this.f14458a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27654N0(this.f14458a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$c */
    class C7044c implements CompletionHandler {
        C7044c(C7039m mVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$c0 */
    class C7045c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14460a;

        C7045c0(C9856y yVar) {
            this.f14460a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27654N0(this.f14460a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$d */
    class C7046d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14462a;

        C7046d(boolean z) {
            this.f14462a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27652M0(this.f14462a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$e */
    class C7047e implements CompletionHandler {
        C7047e(C7039m mVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$f */
    class C7048f implements CompletionHandler {
        C7048f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$g */
    class C7049g implements CompletionHandler {
        C7049g(C7039m mVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$h */
    class C7050h implements CompletionHandler {
        C7050h(C7039m mVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$i */
    class C7051i implements Ceiling6Service.C8294x0 {
        C7051i() {
        }

        /* renamed from: a */
        public void mo28534a(Long l) {
            "onBrightChanged: " + l;
            C7039m.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28535b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C7039m.this.mo23408d0().mo27710r(2) == null) {
                C7039m.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C7039m.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28536c(Long l) {
            "onFlowingChanged: " + l;
            C7039m.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28537d(Long l) {
            "onSaveStateChanged: " + l;
            C7039m.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28538e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C7039m.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28539f(Long l) {
            "onOnFromPowerChanged: " + l;
            C7039m.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28540g(Long l) {
            "onLanModeChanged: " + l;
            C7039m.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28541h(Long l) {
            "onCtScaleChanged: " + l;
            C7039m.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28542i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C7039m.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C7039m.this.mo23408d0().mo27640G0(true);
                }
                C7039m.this.mo23408d0().mo27638F0(split[1]);
                C7039m.this.mo23408d0().mo27636E0(split[2]);
                C7039m.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C7039m.f14448G;
                "start = " + C7039m.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C7039m.this.mo23408d0().mo27631C() + ", " + C7039m.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28543j(Ceiling6Service.C8292w0 w0Var) {
            C6024e eVar;
            "onPowerSwitched: " + w0Var.name();
            int i = C7064v.f14488a[w0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C7039m.this.mo23408d0();
            } else if (i == 2) {
                eVar = C7039m.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: k */
        public void mo28544k(Long l) {
            "onNLBrightChanged: " + l;
            if (l.longValue() != 0) {
                C7039m.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
                C7039m.this.mo23408d0().mo27642H0(l.longValue());
                return;
            }
            C7039m.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo28545m(Long l) {
            "c: " + l;
            C7039m.this.mo23408d0().mo27690h(l.longValue() == 1);
        }

        /* renamed from: p */
        public void mo28546p(Long l) {
            "deviceId:" + C7039m.this.mo23372G() + "       smartSwitch: " + l;
            C7039m.this.mo23408d0().mo27696k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$j */
    class C7052j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14466a;

        C7052j(boolean z) {
            this.f14466a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27682d(this.f14466a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$k */
    class C7053k implements Ceiling6Service.C8284s0 {
        C7053k() {
        }

        /* renamed from: a */
        public void mo28547a(Ceiling6Service.C8292w0 w0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10) {
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
            "deviceId:" + C7039m.this.mo23372G() + "       smartSwitch: " + l10;
            C7039m.this.m20803k2(w0Var, l, l11, l14, str3, l12, l13, l18, l15, str4, l16, l17, l10);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$l */
    class C7054l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14469a;

        C7054l(int i) {
            this.f14469a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27644I0(this.f14469a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$m */
    class C7055m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14471a;

        C7055m(boolean z) {
            this.f14471a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27640G0(this.f14471a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$n */
    class C7056n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14473a;

        /* renamed from: b */
        final /* synthetic */ String f14474b;

        /* renamed from: c */
        final /* synthetic */ String f14475c;

        /* renamed from: d */
        final /* synthetic */ int f14476d;

        C7056n(boolean z, String str, String str2, int i) {
            this.f14473a = z;
            this.f14474b = str;
            this.f14475c = str2;
            this.f14476d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27640G0(this.f14473a);
            C7039m.this.mo23408d0().mo27638F0(this.f14474b);
            C7039m.this.mo23408d0().mo27636E0(this.f14475c);
            C7039m.this.mo23408d0().mo27634D0(this.f14476d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$o */
    class C7057o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f14478a;

        /* renamed from: b */
        final /* synthetic */ String f14479b;

        /* renamed from: c */
        final /* synthetic */ int f14480c;

        C7057o(String str, String str2, int i) {
            this.f14478a = str;
            this.f14479b = str2;
            this.f14480c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27638F0(this.f14478a);
            C7039m.this.mo23408d0().mo27636E0(this.f14479b);
            C7039m.this.mo23408d0().mo27634D0(this.f14480c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$p */
    class C7058p implements CompletionHandler {
        C7058p(C7039m mVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$q */
    class C7059q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14482a;

        C7059q(int i) {
            this.f14482a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27648K0(true);
            C7039m mVar = C7039m.this;
            mVar.mo23352w1(mVar.mo23433j1(this.f14482a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$r */
    class C7060r implements CompletionHandler {
        C7060r(C7039m mVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$s */
    class C7061s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14484a;

        C7061s(boolean z) {
            this.f14484a = z;
        }

        public void onFailed(int i, String str) {
            "sendRemoteKey cfg_smart_switch --> onFailed code: " + i;
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27696k(this.f14484a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$t */
    class C7062t implements CompletionHandler {
        C7062t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$u */
    class C7063u implements C6006h.C6016j {
        C7063u() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C7039m.this.f14450B.mo28534a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C7039m.this.f14450B.mo28541h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
            C7039m.this.f14450B.mo28544k(l);
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C7039m.this.f14450B.mo28543j(Ceiling6Service.C8292w0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$v */
    static /* synthetic */ class C7064v {

        /* renamed from: a */
        static final /* synthetic */ int[] f14488a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$w0[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling6Service.C8292w0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14488a = r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$w0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling6Service.C8292w0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14488a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$w0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling6Service.C8292w0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7039m.C7064v.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$w */
    class C7065w implements CompletionHandler {
        C7065w() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$x */
    class C7066x implements CompletionHandler {
        C7066x() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$y */
    class C7067y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14491a;

        C7067y(long j) {
            this.f14491a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27697k0(this.f14491a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.m$z */
    class C7068z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14493a;

        C7068z(int i) {
            this.f14493a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7039m.this.mo23408d0().mo27707p0(this.f14493a);
        }
    }

    public C7039m(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m20803k2(Ceiling6Service.C8292w0 w0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10) {
        Ceiling6Service.C8292w0 w0Var2 = w0Var;
        boolean z = true;
        if (w0Var2 != null) {
            mo23408d0().mo27648K0(w0Var2 == Ceiling6Service.C8292w0.on);
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
        mo23408d0().mo27715t0(l9.longValue() != 0);
        C6024e d0 = mo23408d0();
        if (l10 == null || l10.longValue() != 1) {
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
            mo27560F1().toggle(new C7066x());
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
            return R$drawable.icon_yeelight_device_badge_cycle_small;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -1462015190:
                if (T.equals("yeelink.light.ceiling11")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015189:
                if (T.equals("yeelink.light.ceiling12")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015188:
                if (T.equals("yeelink.light.ceiling13")) {
                    c = 6;
                    break;
                }
                break;
            case -1462015187:
                if (T.equals("yeelink.light.ceiling14")) {
                    c = 7;
                    break;
                }
                break;
            case -1462015183:
                if (T.equals("yeelink.light.ceiling18")) {
                    c = 8;
                    break;
                }
                break;
            case -1462015156:
                if (T.equals("yeelink.light.ceiling24")) {
                    c = 9;
                    break;
                }
                break;
            case -1317475940:
                if (T.equals("yeelink.light.ceil26")) {
                    c = 10;
                    break;
                }
                break;
            case -1317475939:
                if (T.equals("yeelink.light.ceil27")) {
                    c = 12;
                    break;
                }
                break;
            case -1317475937:
                if (T.equals("yeelink.light.ceil29")) {
                    c = 13;
                    break;
                }
                break;
            case -1317475915:
                if (T.equals("yeelink.light.ceil30")) {
                    c = 14;
                    break;
                }
                break;
            case -1317475913:
                if (T.equals("yeelink.light.ceil32")) {
                    c = 15;
                    break;
                }
                break;
            case -1317475912:
                if (T.equals("yeelink.light.ceil33")) {
                    c = 16;
                    break;
                }
                break;
            case -458141175:
                if (T.equals("yeelink.light.ceila")) {
                    c = 11;
                    break;
                }
                break;
            case 922669548:
                if (T.equals("yeelink.light.ceiling6")) {
                    c = 0;
                    break;
                }
                break;
            case 922669549:
                if (T.equals("yeelink.light.ceiling7")) {
                    c = 2;
                    break;
                }
                break;
            case 922669550:
                if (T.equals("yeelink.light.ceiling8")) {
                    c = 3;
                    break;
                }
                break;
            case 922669551:
                if (T.equals("yeelink.light.ceiling9")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return R$drawable.icon_yeelight_device_badge_nox_pro_small;
            case 2:
                return R$drawable.icon_yeelight_device_badge_nox_small;
            case 3:
                return R$drawable.icon_yeelight_device_badge_nox_plus_small;
            case 4:
                return R$drawable.icon_yeelight_device_badge_ceiling11_small;
            case 5:
                return R$drawable.icon_yeelight_device_badge_ceiling12_small;
            case 6:
            case 7:
                return R$drawable.icon_yeelight_device_badge_ceiling13_small;
            case 8:
                return R$drawable.icon_yeelight_device_badge_ceiling18_small;
            case 9:
                return R$drawable.icon_yeelight_device_badge_ceiling24_small;
            case 10:
                return R$drawable.icon_yeelight_device_badge_ceiling26_small;
            case 11:
                return R$drawable.icon_yeelight_device_badge_luna_small;
            case 12:
                return R$drawable.icon_yeelight_device_badge_ceiling27_small;
            case 13:
                return R$drawable.icon_yeelight_device_badge_ceiling29_small;
            case 14:
                return R$drawable.icon_yeelight_device_badge_ceiling30_small;
            case 15:
                return R$drawable.icon_yeelight_device_badge_ceiling32_small;
            case 16:
                return R$drawable.icon_yeelight_device_badge_ceiling33_small;
            default:
                return R$drawable.icon_yeelight_device_badge_cycle_small;
        }
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_cycle_big;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -1462015190:
                if (T.equals("yeelink.light.ceiling11")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015189:
                if (T.equals("yeelink.light.ceiling12")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015188:
                if (T.equals("yeelink.light.ceiling13")) {
                    c = 6;
                    break;
                }
                break;
            case -1462015187:
                if (T.equals("yeelink.light.ceiling14")) {
                    c = 7;
                    break;
                }
                break;
            case -1462015183:
                if (T.equals("yeelink.light.ceiling18")) {
                    c = 8;
                    break;
                }
                break;
            case -1462015156:
                if (T.equals("yeelink.light.ceiling24")) {
                    c = 9;
                    break;
                }
                break;
            case -1317475940:
                if (T.equals("yeelink.light.ceil26")) {
                    c = 10;
                    break;
                }
                break;
            case -1317475939:
                if (T.equals("yeelink.light.ceil27")) {
                    c = 12;
                    break;
                }
                break;
            case -1317475937:
                if (T.equals("yeelink.light.ceil29")) {
                    c = 13;
                    break;
                }
                break;
            case -1317475915:
                if (T.equals("yeelink.light.ceil30")) {
                    c = 14;
                    break;
                }
                break;
            case -1317475913:
                if (T.equals("yeelink.light.ceil32")) {
                    c = 15;
                    break;
                }
                break;
            case -1317475912:
                if (T.equals("yeelink.light.ceil33")) {
                    c = 16;
                    break;
                }
                break;
            case -458141175:
                if (T.equals("yeelink.light.ceila")) {
                    c = 11;
                    break;
                }
                break;
            case 922669548:
                if (T.equals("yeelink.light.ceiling6")) {
                    c = 0;
                    break;
                }
                break;
            case 922669549:
                if (T.equals("yeelink.light.ceiling7")) {
                    c = 2;
                    break;
                }
                break;
            case 922669550:
                if (T.equals("yeelink.light.ceiling8")) {
                    c = 3;
                    break;
                }
                break;
            case 922669551:
                if (T.equals("yeelink.light.ceiling9")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return R$drawable.icon_yeelight_device_badge_nox_pro_big;
            case 2:
                return R$drawable.icon_yeelight_device_badge_nox_big;
            case 3:
                return R$drawable.icon_yeelight_device_badge_nox_plus_big;
            case 4:
                return R$drawable.icon_yeelight_device_badge_ceiling11_big;
            case 5:
                return R$drawable.icon_yeelight_device_badge_ceiling12_big;
            case 6:
            case 7:
                return R$drawable.icon_yeelight_device_badge_ceiling13_big;
            case 8:
                return R$drawable.icon_yeelight_device_badge_ceiling18_big;
            case 9:
                return R$drawable.icon_yeelight_device_badge_ceiling24_big;
            case 10:
                return R$drawable.icon_yeelight_device_badge_ceiling26_big;
            case 11:
                return R$drawable.icon_yeelight_device_badge_luna_big;
            case 12:
                return R$drawable.icon_yeelight_device_badge_ceiling27_big;
            case 13:
                return R$drawable.icon_yeelight_device_badge_ceiling29_big;
            case 14:
                return R$drawable.icon_yeelight_device_badge_ceiling30_big;
            case 15:
                return R$drawable.icon_yeelight_device_badge_ceiling32_big;
            case 16:
                return R$drawable.icon_yeelight_device_badge_ceiling33_big;
            default:
                return R$drawable.icon_yeelight_device_badge_cycle_big;
        }
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C7063u();
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
            mo27560F1().sendCmd(Ceiling6Service.C8260g0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7052j(z));
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
            mo27560F1().sendCmd(Ceiling6Service.C8260g0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C7057o(str, str2, i));
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
            mo27560F1().sendCmd(Ceiling6Service.C8260g0.cfg_init_power, String.valueOf(i), new C7054l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Ceiling6Service.C8260g0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7046d(z));
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
        return mo28533l2(this.f14449A, this.f14450B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14451z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14448G, "Invalid handler!");
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
            mo27560F1().sendCmd(Ceiling6Service.C8260g0.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7058p(this));
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
            mo27560F1().setPower(Ceiling6Service.C8292w0.off, new C7065w());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C7048f());
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
            mo27560F1().sendCmd(Ceiling6Service.C8260g0.nighttime, z ? "enable" : "disable", new C7055m(z));
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
            mo27560F1().sendCmd(Ceiling6Service.C8260g0.pseudo_beacon, "4097|" + i, new C7060r(this));
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
            Ceiling6Service j2 = mo27560F1();
            Ceiling6Service.C8260g0 g0Var = Ceiling6Service.C8260g0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(g0Var, sb.toString(), new C7056n(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Ceiling6Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeiling6Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Ceiling6Service.C8292w0.on, new C7062t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28533l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling6Service.C8294x0)) {
            C4308b.m12139r(f14448G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Ceiling6Service.C8294x0) obj2);
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
            mo27560F1().openWithMode(Ceiling6Service.C8292w0.on, Ceiling6Service.C8262h0.smooth, 500L, Long.valueOf((long) i), new C7059q(i));
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
            mo27560F1().setBright(Long.valueOf(j), Ceiling6Service.C8262h0.smooth, 500L, new C7067y(j));
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
            mo27560F1().setCt(Long.valueOf((long) i), Ceiling6Service.C8262h0.smooth, 500L, new C7068z(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C7044c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C7047e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
        try {
            mo27560F1().sendCmd(Ceiling6Service.C8260g0.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7061s(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14451z);
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
                C4308b.m12139r("BATCH_RPC", "Ceiling5Device, Invalid length of batch rpc result: " + str2);
            }
            Ceiling6Service.C8292w0 valueOf = Ceiling6Service.C8292w0.valueOf(jSONArray.getString(0));
            Long valueOf2 = Long.valueOf(jSONArray.getLong(1));
            Long valueOf3 = Long.valueOf(jSONArray.getLong(2));
            Long valueOf4 = Long.valueOf(jSONArray.getLong(3));
            String string = jSONArray.getString(4);
            Long valueOf5 = Long.valueOf(jSONArray.getLong(5));
            Long valueOf6 = Long.valueOf(jSONArray.getLong(6));
            Long valueOf7 = Long.valueOf(jSONArray.getLong(7));
            Long valueOf8 = Long.valueOf(jSONArray.getLong(8));
            String string2 = jSONArray.getString(9);
            Long valueOf9 = Long.valueOf(jSONArray.getLong(10));
            Long valueOf10 = Long.valueOf(jSONArray.getLong(11));
            Long valueOf11 = Long.valueOf(jSONArray.getLong(12));
            "deviceId:" + mo23372G() + "       smartSwitch: " + valueOf11;
            m20803k2(valueOf, valueOf2, valueOf3, valueOf4, string, valueOf5, valueOf6, valueOf7, valueOf8, string2, valueOf9, valueOf10, valueOf11);
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
                mo27560F1().getProperties(new C7053k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7041a0(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C7043b0(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C7045c0(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C7040a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C7042b(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f14448G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("NLBright").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("MiBandSleep").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("SmartSwitch").getInternalName()};
    }
}
