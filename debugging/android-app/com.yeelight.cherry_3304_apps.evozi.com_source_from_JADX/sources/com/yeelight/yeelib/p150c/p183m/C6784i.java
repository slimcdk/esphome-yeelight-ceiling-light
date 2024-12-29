package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.Ceiling29Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling29Device;
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

/* renamed from: com.yeelight.yeelib.c.m.i */
public class C6784i extends C6029f {

    /* renamed from: G */
    public static final String f14065G = "i";

    /* renamed from: A */
    CompletionHandler f14066A = new C6797i(this);

    /* renamed from: B */
    Ceiling29Service.C8027a1 f14067B = new C6798j();

    /* renamed from: z */
    CompletionHandler f14068z = new C6796h(this);

    /* renamed from: com.yeelight.yeelib.c.m.i$a */
    class C6785a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14069a;

        C6785a(C9856y yVar) {
            this.f14069a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27654N0(this.f14069a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$a0 */
    class C6786a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14071a;

        C6786a0(int i) {
            this.f14071a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27707p0(this.f14071a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$b */
    class C6787b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14073a;

        C6787b(C9856y yVar) {
            this.f14073a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27654N0(this.f14073a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$b0 */
    class C6788b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14075a;

        C6788b0(C9856y yVar) {
            this.f14075a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27654N0(this.f14075a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$c */
    class C6789c implements CompletionHandler {
        C6789c(C6784i iVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$c0 */
    class C6790c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14077a;

        C6790c0(C9856y yVar) {
            this.f14077a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27654N0(this.f14077a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$d */
    class C6791d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14079a;

        C6791d(boolean z) {
            this.f14079a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27652M0(this.f14079a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$d0 */
    class C6792d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14081a;

        C6792d0(C9856y yVar) {
            this.f14081a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27654N0(this.f14081a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$e */
    class C6793e implements CompletionHandler {
        C6793e(C6784i iVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$f */
    class C6794f implements CompletionHandler {
        C6794f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$g */
    class C6795g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14084a;

        C6795g(long j) {
            this.f14084a = j;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27662R0(this.f14084a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$h */
    class C6796h implements CompletionHandler {
        C6796h(C6784i iVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$i */
    class C6797i implements CompletionHandler {
        C6797i(C6784i iVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$j */
    class C6798j implements Ceiling29Service.C8027a1 {
        C6798j() {
        }

        /* renamed from: a */
        public void mo28393a(Long l) {
            "onBrightChanged: " + l;
            C6784i.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28394b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6784i.this.mo23408d0().mo27710r(2) == null) {
                C6784i.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6784i.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28395c(Long l) {
            "onFlowingChanged: " + l;
            C6784i.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28396d(Long l) {
            "onSaveStateChanged: " + l;
            C6784i.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28397e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6784i.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28398f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6784i.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28399g(Long l) {
            "onLanModeChanged: " + l;
            C6784i.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28400h(Long l) {
            "onCtScaleChanged: " + l;
            C6784i.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28401i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6784i.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6784i.this.mo23408d0().mo27640G0(true);
                }
                C6784i.this.mo23408d0().mo27638F0(split[1]);
                C6784i.this.mo23408d0().mo27636E0(split[2]);
                C6784i.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C6784i.f14065G;
                "start = " + C6784i.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6784i.this.mo23408d0().mo27631C() + ", " + C6784i.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: k */
        public void mo28402k(Long l) {
            "onNLBrightChanged: " + l;
            if (l.longValue() != 0) {
                C6784i.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
                C6784i.this.mo23408d0().mo27642H0(l.longValue());
                return;
            }
            C6784i.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: m */
        public void mo28403m(Long l) {
            "c: " + l;
            C6784i.this.mo23408d0().mo27690h(l.longValue() == 1);
        }

        /* renamed from: p */
        public void mo28404p(Long l) {
            "deviceId:" + C6784i.this.mo23372G() + "       smartSwitch: " + l;
            C6784i.this.mo23408d0().mo27696k(l != null && l.longValue() == 1);
        }

        /* renamed from: q */
        public void mo28405q(Long l) {
            "onTransIntervalDfltChanged: " + l;
            C6784i.this.mo23408d0().mo27662R0(l == null ? 0 : l.longValue());
        }

        /* renamed from: r */
        public void mo28406r(Ceiling29Service.C8077z0 z0Var) {
            C6024e eVar;
            "onPowerSwitched: " + z0Var.name();
            int i = C6811w.f14109a[z0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6784i.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6784i.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$k */
    class C6799k implements Ceiling29Service.C8067u0 {
        C6799k() {
        }

        /* renamed from: a */
        public void mo28407a(Ceiling29Service.C8077z0 z0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, Long l8, String str2, Long l9, Long l10, Long l11) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(z0Var != null ? z0Var.name() : "null");
            sb.toString();
            "bright: " + l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ct: ");
            Long l12 = l2;
            sb2.append(l12);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lanMode: ");
            Long l13 = l4;
            sb3.append(l13);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("saveState: ");
            Long l14 = l5;
            sb4.append(l14);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("delayoff: ");
            Long l15 = l3;
            sb5.append(l15);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowParams: ");
            String str3 = str;
            sb6.append(str3);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("nLBright: ");
            Long l16 = l8;
            sb7.append(l16);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("nightTimeInfo : ");
            String str4 = str2;
            sb8.append(str4);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("miBandSleep : ");
            Long l17 = l9;
            sb9.append(l17);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("flowing : ");
            Long l18 = l10;
            sb10.append(l18);
            sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("onFromPower : ");
            Long l19 = l7;
            sb11.append(l19);
            sb11.toString();
            "deviceId:" + C6784i.this.mo23372G() + "       smartSwitch: " + l11;
            "transIntervalDflt : " + l6;
            C6784i.this.m20194k2(z0Var, l, l12, l15, str3, l13, l14, l19, l16, str4, l17, l18, l11, l6);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$l */
    class C6800l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14088a;

        C6800l(boolean z) {
            this.f14088a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27682d(this.f14088a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$m */
    class C6801m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14090a;

        C6801m(int i) {
            this.f14090a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27644I0(this.f14090a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$n */
    class C6802n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14092a;

        C6802n(boolean z) {
            this.f14092a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27640G0(this.f14092a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$o */
    class C6803o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14094a;

        /* renamed from: b */
        final /* synthetic */ String f14095b;

        /* renamed from: c */
        final /* synthetic */ String f14096c;

        /* renamed from: d */
        final /* synthetic */ int f14097d;

        C6803o(boolean z, String str, String str2, int i) {
            this.f14094a = z;
            this.f14095b = str;
            this.f14096c = str2;
            this.f14097d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27640G0(this.f14094a);
            C6784i.this.mo23408d0().mo27638F0(this.f14095b);
            C6784i.this.mo23408d0().mo27636E0(this.f14096c);
            C6784i.this.mo23408d0().mo27634D0(this.f14097d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$p */
    class C6804p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f14099a;

        /* renamed from: b */
        final /* synthetic */ String f14100b;

        /* renamed from: c */
        final /* synthetic */ int f14101c;

        C6804p(String str, String str2, int i) {
            this.f14099a = str;
            this.f14100b = str2;
            this.f14101c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27638F0(this.f14099a);
            C6784i.this.mo23408d0().mo27636E0(this.f14100b);
            C6784i.this.mo23408d0().mo27634D0(this.f14101c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$q */
    class C6805q implements CompletionHandler {
        C6805q(C6784i iVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$r */
    class C6806r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14103a;

        C6806r(int i) {
            this.f14103a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27648K0(true);
            C6784i iVar = C6784i.this;
            iVar.mo23352w1(iVar.mo23433j1(this.f14103a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$s */
    class C6807s implements CompletionHandler {
        C6807s(C6784i iVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$t */
    class C6808t implements CompletionHandler {
        C6808t() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$u */
    class C6809u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14106a;

        C6809u(boolean z) {
            this.f14106a = z;
        }

        public void onFailed(int i, String str) {
            "sendRemoteKey cfg_smart_switch --> onFailed code: " + i;
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27696k(this.f14106a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$v */
    class C6810v implements C6006h.C6016j {
        C6810v() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6784i.this.f14067B.mo28393a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6784i.this.f14067B.mo28400h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
            C6784i.this.f14067B.mo28402k(l);
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C6784i.this.f14067B.mo28406r(Ceiling29Service.C8077z0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$w */
    static /* synthetic */ class C6811w {

        /* renamed from: a */
        static final /* synthetic */ int[] f14109a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling29Service$z0[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling29Service.C8077z0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14109a = r0
                com.yeelight.yeelib.device.xiaomi.Ceiling29Service$z0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling29Service.C8077z0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14109a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling29Service$z0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling29Service.C8077z0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6784i.C6811w.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$x */
    class C6812x implements CompletionHandler {
        C6812x() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$y */
    class C6813y implements CompletionHandler {
        C6813y() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i$z */
    class C6814z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14112a;

        C6814z(long j) {
            this.f14112a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6784i.this.mo23408d0().mo27697k0(this.f14112a);
        }
    }

    public C6784i(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m20194k2(Ceiling29Service.C8077z0 z0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10, Long l11) {
        Ceiling29Service.C8077z0 z0Var2 = z0Var;
        boolean z = true;
        if (z0Var2 != null) {
            mo23408d0().mo27648K0(z0Var2 == Ceiling29Service.C8077z0.on);
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
        long j = 0;
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
        C6024e d02 = mo23408d0();
        if (l11 != null) {
            j = l11.longValue();
        }
        d02.mo27662R0(j);
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6813y());
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
        switch (hashCode) {
            case -1462015190:
                if (T.equals("yeelink.light.ceiling11")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015189:
                if (T.equals("yeelink.light.ceiling12")) {
                    c = 6;
                    break;
                }
                break;
            case -1462015188:
                if (T.equals("yeelink.light.ceiling13")) {
                    c = 7;
                    break;
                }
                break;
            case -1462015187:
                if (T.equals("yeelink.light.ceiling14")) {
                    c = 8;
                    break;
                }
                break;
            default:
                switch (hashCode) {
                    case -1462015183:
                        if (T.equals("yeelink.light.ceiling18")) {
                            c = 9;
                            break;
                        }
                        break;
                    case -1317475937:
                        if (T.equals("yeelink.light.ceil29")) {
                            c = 17;
                            break;
                        }
                        break;
                    case -1317475915:
                        if (T.equals("yeelink.light.ceil30")) {
                            c = 18;
                            break;
                        }
                        break;
                    case -458141175:
                        if (T.equals("yeelink.light.ceila")) {
                            c = 15;
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
                                    case -1317475940:
                                        if (T.equals("yeelink.light.ceil26")) {
                                            c = 14;
                                            break;
                                        }
                                        break;
                                    case -1317475939:
                                        if (T.equals("yeelink.light.ceil27")) {
                                            c = 16;
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 922669547:
                                                if (T.equals("yeelink.light.ceiling5")) {
                                                    c = 4;
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
                                }
                        }
                }
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
                return R$drawable.icon_yeelight_device_badge_cycle_small;
            case 5:
                return R$drawable.icon_yeelight_device_badge_ceiling11_small;
            case 6:
                return R$drawable.icon_yeelight_device_badge_ceiling12_small;
            case 7:
            case 8:
                return R$drawable.icon_yeelight_device_badge_ceiling13_small;
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
                return R$drawable.icon_yeelight_device_badge_ceiling26_small;
            case 15:
                return R$drawable.icon_yeelight_device_badge_luna_small;
            case 16:
                return R$drawable.icon_yeelight_device_badge_ceiling27_small;
            case 17:
                return R$drawable.icon_yeelight_device_badge_ceiling29_small;
            case 18:
                return R$drawable.icon_yeelight_device_badge_ceiling30_small;
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
        int hashCode = T.hashCode();
        switch (hashCode) {
            case -1462015190:
                if (T.equals("yeelink.light.ceiling11")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015189:
                if (T.equals("yeelink.light.ceiling12")) {
                    c = 6;
                    break;
                }
                break;
            case -1462015188:
                if (T.equals("yeelink.light.ceiling13")) {
                    c = 7;
                    break;
                }
                break;
            case -1462015187:
                if (T.equals("yeelink.light.ceiling14")) {
                    c = 8;
                    break;
                }
                break;
            default:
                switch (hashCode) {
                    case -1462015183:
                        if (T.equals("yeelink.light.ceiling18")) {
                            c = 9;
                            break;
                        }
                        break;
                    case -1317475937:
                        if (T.equals("yeelink.light.ceil29")) {
                            c = 17;
                            break;
                        }
                        break;
                    case -1317475915:
                        if (T.equals("yeelink.light.ceil30")) {
                            c = 18;
                            break;
                        }
                        break;
                    case -458141175:
                        if (T.equals("yeelink.light.ceila")) {
                            c = 15;
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
                                    case -1317475940:
                                        if (T.equals("yeelink.light.ceil26")) {
                                            c = 14;
                                            break;
                                        }
                                        break;
                                    case -1317475939:
                                        if (T.equals("yeelink.light.ceil27")) {
                                            c = 16;
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 922669547:
                                                if (T.equals("yeelink.light.ceiling5")) {
                                                    c = 4;
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
                                }
                        }
                }
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
                return R$drawable.icon_yeelight_device_badge_cycle_big;
            case 5:
                return R$drawable.icon_yeelight_device_badge_ceiling11_big;
            case 6:
                return R$drawable.icon_yeelight_device_badge_ceiling12_big;
            case 7:
            case 8:
                return R$drawable.icon_yeelight_device_badge_ceiling13_big;
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
                return R$drawable.icon_yeelight_device_badge_ceiling26_big;
            case 15:
                return R$drawable.icon_yeelight_device_badge_luna_big;
            case 16:
                return R$drawable.icon_yeelight_device_badge_ceiling27_big;
            case 17:
                return R$drawable.icon_yeelight_device_badge_ceiling29_big;
            case 18:
                return R$drawable.icon_yeelight_device_badge_ceiling30_big;
            default:
                return R$drawable.icon_yeelight_device_badge_cycle_big;
        }
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6810v();
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
            mo27560F1().sendCmd(Ceiling29Service.C8043i0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6800l(z));
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
            mo27560F1().sendCmd(Ceiling29Service.C8043i0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C6804p(str, str2, i));
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
            mo27560F1().sendCmd(Ceiling29Service.C8043i0.cfg_init_power, String.valueOf(i), new C6801m(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Ceiling29Service.C8043i0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6791d(z));
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
        return mo28392l2(this.f14066A, this.f14067B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14068z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14065G, "Invalid handler!");
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
            mo27560F1().sendCmd(Ceiling29Service.C8043i0.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6805q(this));
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
            mo27560F1().setPower(Ceiling29Service.C8077z0.off, new C6812x());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6794f());
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
            mo27560F1().sendCmd(Ceiling29Service.C8043i0.nighttime, z ? "enable" : "disable", new C6802n(z));
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
            mo27560F1().sendCmd(Ceiling29Service.C8043i0.pseudo_beacon, "4097|" + i, new C6807s(this));
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
            Ceiling29Service j2 = mo27560F1();
            Ceiling29Service.C8043i0 i0Var = Ceiling29Service.C8043i0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(i0Var, sb.toString(), new C6803o(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public Ceiling29Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeiling29Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23324Y1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Ceiling29Service.C8077z0.on, new C6808t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28392l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling29Service.C8027a1)) {
            C4308b.m12139r(f14065G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Ceiling29Service.C8027a1) obj2);
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
            mo27560F1().openWithMode(Ceiling29Service.C8077z0.on, Ceiling29Service.C8045j0.smooth, Long.valueOf(mo23408d0().mo27653N()), Long.valueOf((long) i), new C6806r(i));
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
            mo27560F1().setBright(Long.valueOf(j), new C6814z(j));
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
            mo27560F1().setCt(Long.valueOf((long) i), new C6786a0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6789c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6793e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
        try {
            mo27560F1().sendCmd(Ceiling29Service.C8043i0.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6809u(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14068z);
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
            if (jSONArray.length() != 14) {
                C4308b.m12139r("BATCH_RPC", "Ceiling5Device, Invalid length of batch rpc result: " + str2);
            }
            Ceiling29Service.C8077z0 valueOf = Ceiling29Service.C8077z0.valueOf(jSONArray.getString(0));
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
            m20194k2(valueOf, valueOf2, valueOf3, valueOf4, string, valueOf5, valueOf6, valueOf7, valueOf8, string2, valueOf9, valueOf10, valueOf11, Long.valueOf(jSONArray.getLong(13)));
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
                mo27560F1().getProperties(new C6799k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6788b0(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6790c0(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6792d0(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6785a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C6787b(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f14065G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: y1 */
    public boolean mo23435y1(long j) {
        try {
            Ceiling29Service j2 = mo27560F1();
            Ceiling29Service.C8043i0 i0Var = Ceiling29Service.C8043i0.trans_default;
            j2.sendCmd(i0Var, j + ",1", new C6795g(j));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("NLBright").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("MiBandSleep").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("SmartSwitch").getInternalName(), mo27560F1().getService().getProperty("TransIntervalDflt").getInternalName()};
    }
}
