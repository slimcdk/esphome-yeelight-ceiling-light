package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.Ceiling5Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling5Device;
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

/* renamed from: com.yeelight.yeelib.c.m.l */
public class C7008l extends C6029f {

    /* renamed from: G */
    public static final String f14401G = "l";

    /* renamed from: A */
    CompletionHandler f14402A = new C7019h(this);

    /* renamed from: B */
    Ceiling5Service.C8242v0 f14403B = new C7020i();

    /* renamed from: z */
    CompletionHandler f14404z = new C7018g(this);

    /* renamed from: com.yeelight.yeelib.c.m.l$a */
    class C7009a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14405a;

        C7009a(C9856y yVar) {
            this.f14405a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27654N0(this.f14405a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$a0 */
    class C7010a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14407a;

        C7010a0(C9856y yVar) {
            this.f14407a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27654N0(this.f14407a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$b */
    class C7011b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14409a;

        C7011b(C9856y yVar) {
            this.f14409a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27654N0(this.f14409a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$b0 */
    class C7012b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14411a;

        C7012b0(C9856y yVar) {
            this.f14411a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27654N0(this.f14411a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$c */
    class C7013c implements CompletionHandler {
        C7013c(C7008l lVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$c0 */
    class C7014c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14413a;

        C7014c0(C9856y yVar) {
            this.f14413a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27654N0(this.f14413a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$d */
    class C7015d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14415a;

        C7015d(boolean z) {
            this.f14415a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27652M0(this.f14415a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$e */
    class C7016e implements CompletionHandler {
        C7016e(C7008l lVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$f */
    class C7017f implements CompletionHandler {
        C7017f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$g */
    class C7018g implements CompletionHandler {
        C7018g(C7008l lVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$h */
    class C7019h implements CompletionHandler {
        C7019h(C7008l lVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$i */
    class C7020i implements Ceiling5Service.C8242v0 {
        C7020i() {
        }

        /* renamed from: a */
        public void mo28518a(Long l) {
            "onBrightChanged: " + l;
            C7008l.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28519b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C7008l.this.mo23408d0().mo27710r(2) == null) {
                C7008l.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C7008l.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28520c(Long l) {
            "onFlowingChanged: " + l;
            C7008l.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28521d(Long l) {
            "onSaveStateChanged: " + l;
            C7008l.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28522e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C7008l.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28523f(Long l) {
            "onOnFromPowerChanged: " + l;
            C7008l.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28524g(Ceiling5Service.C8240u0 u0Var) {
            C6024e eVar;
            "onPowerSwitched: " + u0Var.name();
            int i = C7033v.f14441a[u0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C7008l.this.mo23408d0();
            } else if (i == 2) {
                eVar = C7008l.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: h */
        public void mo28525h(Long l) {
            "onCtScaleChanged: " + l;
            C7008l.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28526i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C7008l.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C7008l.this.mo23408d0().mo27640G0(true);
                }
                C7008l.this.mo23408d0().mo27638F0(split[1]);
                C7008l.this.mo23408d0().mo27636E0(split[2]);
                C7008l.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C7008l.f14401G;
                "start = " + C7008l.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C7008l.this.mo23408d0().mo27631C() + ", " + C7008l.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: k */
        public void mo28527k(Long l) {
            "onNLBrightChanged: " + l;
            if (l.longValue() != 0) {
                C7008l.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
                C7008l.this.mo23408d0().mo27642H0(l.longValue());
                return;
            }
            C7008l.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo28528m(Long l) {
            "c: " + l;
            C7008l.this.mo23408d0().mo27690h(l.longValue() == 1);
        }

        /* renamed from: p */
        public void mo28529p(Long l) {
            "deviceId:" + C7008l.this.mo23372G() + "       smartSwitch: " + l;
            C7008l.this.mo23408d0().mo27696k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$j */
    class C7021j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14419a;

        C7021j(boolean z) {
            this.f14419a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27682d(this.f14419a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$k */
    class C7022k implements Ceiling5Service.C8232q0 {
        C7022k() {
        }

        /* renamed from: a */
        public void mo28530a(Ceiling5Service.C8240u0 u0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, String str2, Long l7, Long l8, Long l9) {
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
            sb3.append("saveState: ");
            Long l11 = l4;
            sb3.append(l11);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("delayoff: ");
            Long l12 = l3;
            sb4.append(l12);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("flowParams: ");
            String str3 = str;
            sb5.append(str3);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("nLBright: ");
            Long l13 = l6;
            sb6.append(l13);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("nightTimeInfo : ");
            String str4 = str2;
            sb7.append(str4);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("miBandSleep : ");
            Long l14 = l7;
            sb8.append(l14);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("flowing : ");
            Long l15 = l8;
            sb9.append(l15);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("onFromPower : ");
            Long l16 = l5;
            sb10.append(l16);
            sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("deviceId:");
            sb11.append(C7008l.this.mo23372G());
            sb11.append("       smartSwitch: ");
            Long l17 = l9;
            sb11.append(l17);
            sb11.toString();
            C7008l.this.m20708k2(u0Var, l, l10, l12, str3, l11, l16, l13, str4, l14, l15, l17);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$l */
    class C7023l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14422a;

        C7023l(int i) {
            this.f14422a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27644I0(this.f14422a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$m */
    class C7024m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14424a;

        C7024m(boolean z) {
            this.f14424a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27640G0(this.f14424a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$n */
    class C7025n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14426a;

        /* renamed from: b */
        final /* synthetic */ String f14427b;

        /* renamed from: c */
        final /* synthetic */ String f14428c;

        /* renamed from: d */
        final /* synthetic */ int f14429d;

        C7025n(boolean z, String str, String str2, int i) {
            this.f14426a = z;
            this.f14427b = str;
            this.f14428c = str2;
            this.f14429d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27640G0(this.f14426a);
            C7008l.this.mo23408d0().mo27638F0(this.f14427b);
            C7008l.this.mo23408d0().mo27636E0(this.f14428c);
            C7008l.this.mo23408d0().mo27634D0(this.f14429d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$o */
    class C7026o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f14431a;

        /* renamed from: b */
        final /* synthetic */ String f14432b;

        /* renamed from: c */
        final /* synthetic */ int f14433c;

        C7026o(String str, String str2, int i) {
            this.f14431a = str;
            this.f14432b = str2;
            this.f14433c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27638F0(this.f14431a);
            C7008l.this.mo23408d0().mo27636E0(this.f14432b);
            C7008l.this.mo23408d0().mo27634D0(this.f14433c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$p */
    class C7027p implements CompletionHandler {
        C7027p(C7008l lVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$q */
    class C7028q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14435a;

        C7028q(int i) {
            this.f14435a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27648K0(true);
            C7008l lVar = C7008l.this;
            lVar.mo23352w1(lVar.mo23433j1(this.f14435a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$r */
    class C7029r implements CompletionHandler {
        C7029r(C7008l lVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$s */
    class C7030s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14437a;

        C7030s(boolean z) {
            this.f14437a = z;
        }

        public void onFailed(int i, String str) {
            "sendRemoteKey cfg_smart_switch --> onFailed code: " + i;
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27696k(this.f14437a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$t */
    class C7031t implements CompletionHandler {
        C7031t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$u */
    class C7032u implements C6006h.C6016j {
        C7032u() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C7008l.this.f14403B.mo28518a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C7008l.this.f14403B.mo28525h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
            C7008l.this.f14403B.mo28527k(l);
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C7008l.this.f14403B.mo28524g(Ceiling5Service.C8240u0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$v */
    static /* synthetic */ class C7033v {

        /* renamed from: a */
        static final /* synthetic */ int[] f14441a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$u0[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling5Service.C8240u0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14441a = r0
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$u0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling5Service.C8240u0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14441a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$u0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling5Service.C8240u0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7008l.C7033v.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$w */
    class C7034w implements CompletionHandler {
        C7034w() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$x */
    class C7035x implements CompletionHandler {
        C7035x() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$y */
    class C7036y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14444a;

        C7036y(long j) {
            this.f14444a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27697k0(this.f14444a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.l$z */
    class C7037z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14446a;

        C7037z(int i) {
            this.f14446a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7008l.this.mo23408d0().mo27707p0(this.f14446a);
        }
    }

    public C7008l(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m20708k2(Ceiling5Service.C8240u0 u0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, String str2, Long l7, Long l8, Long l9) {
        Ceiling5Service.C8240u0 u0Var2 = u0Var;
        boolean z = true;
        if (u0Var2 != null) {
            mo23408d0().mo27648K0(u0Var2 == Ceiling5Service.C8240u0.on);
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
        mo23408d0().mo27690h(l7 != null && l7.longValue() == 1);
        mo23408d0().mo27652M0(l4 != null && l4.longValue() == 1);
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
        mo23408d0().mo27715t0(l8.longValue() != 0);
        C6024e d0 = mo23408d0();
        if (l9 == null || l9.longValue() != 1) {
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
            mo27560F1().toggle(new C7035x());
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
        int hashCode = T.hashCode();
        if (hashCode != 922669547) {
            switch (hashCode) {
                case -1462015159:
                    if (T.equals("yeelink.light.ceiling21")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1462015158:
                    if (T.equals("yeelink.light.ceiling22")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1462015157:
                    if (T.equals("yeelink.light.ceiling23")) {
                        c = 3;
                        break;
                    }
                    break;
            }
        } else if (T.equals("yeelink.light.ceiling5")) {
            c = 0;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? R$drawable.icon_yeelight_device_badge_cycle_small : R$drawable.icon_yeelight_device_badge_ceiling23_small : R$drawable.icon_yeelight_device_badge_ceiling22_small : R$drawable.icon_yeelight_device_badge_ceiling21_small : R$drawable.icon_yeelight_device_badge_cycle_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_cycle_big;
        }
        String T = mo23395T();
        char c = 65535;
        int hashCode = T.hashCode();
        if (hashCode != 922669547) {
            switch (hashCode) {
                case -1462015159:
                    if (T.equals("yeelink.light.ceiling21")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1462015158:
                    if (T.equals("yeelink.light.ceiling22")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1462015157:
                    if (T.equals("yeelink.light.ceiling23")) {
                        c = 3;
                        break;
                    }
                    break;
            }
        } else if (T.equals("yeelink.light.ceiling5")) {
            c = 0;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? R$drawable.icon_yeelight_device_badge_cycle_big : R$drawable.icon_yeelight_device_badge_ceiling23_big : R$drawable.icon_yeelight_device_badge_ceiling22_big : R$drawable.icon_yeelight_device_badge_ceiling21_big : R$drawable.icon_yeelight_device_badge_cycle_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C7032u();
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
            mo27560F1().sendCmd(Ceiling5Service.C8210f0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7021j(z));
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
            mo27560F1().sendCmd(Ceiling5Service.C8210f0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C7026o(str, str2, i));
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
            mo27560F1().sendCmd(Ceiling5Service.C8210f0.cfg_init_power, String.valueOf(i), new C7023l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Ceiling5Service.C8210f0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7015d(z));
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
        return mo28517l2(this.f14402A, this.f14403B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14404z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14401G, "Invalid handler!");
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
            mo27560F1().sendCmd(Ceiling5Service.C8210f0.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7027p(this));
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
            mo27560F1().setPower(Ceiling5Service.C8240u0.off, new C7034w());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C7017f());
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
            mo27560F1().sendCmd(Ceiling5Service.C8210f0.nighttime, z ? "enable" : "disable", new C7024m(z));
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
            mo27560F1().sendCmd(Ceiling5Service.C8210f0.pseudo_beacon, "4097|" + i, new C7029r(this));
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
            Ceiling5Service j2 = mo27560F1();
            Ceiling5Service.C8210f0 f0Var = Ceiling5Service.C8210f0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(f0Var, sb.toString(), new C7025n(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Ceiling5Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeiling5Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Ceiling5Service.C8240u0.on, new C7031t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28517l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling5Service.C8242v0)) {
            C4308b.m12139r(f14401G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Ceiling5Service.C8242v0) obj2);
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
            mo27560F1().openWithMode(Ceiling5Service.C8240u0.on, Ceiling5Service.C8212g0.smooth, 500L, Long.valueOf((long) i), new C7028q(i));
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
            mo27560F1().setBright(Long.valueOf(j), Ceiling5Service.C8212g0.smooth, 500L, new C7036y(j));
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
            mo27560F1().setCt(Long.valueOf((long) i), Ceiling5Service.C8212g0.smooth, 500L, new C7037z(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C7013c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C7016e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
        try {
            mo27560F1().sendCmd(Ceiling5Service.C8210f0.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7030s(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14404z);
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
                C4308b.m12139r("BATCH_RPC", "Ceiling5Device, Invalid length of batch rpc result: " + str2);
            }
            Ceiling5Service.C8240u0 valueOf = Ceiling5Service.C8240u0.valueOf(jSONArray.getString(0));
            Long valueOf2 = Long.valueOf(jSONArray.getLong(1));
            Long valueOf3 = Long.valueOf(jSONArray.getLong(2));
            Long valueOf4 = Long.valueOf(jSONArray.getLong(3));
            String string = jSONArray.getString(4);
            Long valueOf5 = Long.valueOf(jSONArray.getLong(5));
            Long valueOf6 = Long.valueOf(jSONArray.getLong(6));
            Long valueOf7 = Long.valueOf(jSONArray.getLong(7));
            String string2 = jSONArray.getString(8);
            Long valueOf8 = Long.valueOf(jSONArray.getLong(9));
            Long valueOf9 = Long.valueOf(jSONArray.getLong(10));
            Long valueOf10 = Long.valueOf(jSONArray.getLong(11));
            "deviceId:" + mo23372G() + "       smartSwitch: " + valueOf10;
            m20708k2(valueOf, valueOf2, valueOf3, valueOf4, string, valueOf5, valueOf6, valueOf7, string2, valueOf8, valueOf9, valueOf10);
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
                mo27560F1().getProperties(new C7022k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7010a0(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C7012b0(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C7014c0(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C7009a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C7011b(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f14401G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("NLBright").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("MiBandSleep").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("SmartSwitch").getInternalName()};
    }
}
