package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.device.xiaomi.Lamp9Service;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp9Device;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p185d.C7565b;
import com.yeelight.yeelib.utils.C4308b;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.c.m.i0 */
public class C6815i0 extends C6006h {

    /* renamed from: G */
    public static final String f14114G = "i0";

    /* renamed from: A */
    CompletionHandler f14115A = new C6824i(this);

    /* renamed from: B */
    Lamp9Service.C9156u0 f14116B = new C6825j();

    /* renamed from: z */
    CompletionHandler f14117z = new C6823h(this);

    /* renamed from: com.yeelight.yeelib.c.m.i0$a */
    class C6816a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14118a;

        C6816a(C9856y yVar) {
            this.f14118a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27654N0(this.f14118a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$b */
    class C6817b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14120a;

        C6817b(C9856y yVar) {
            this.f14120a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27654N0(this.f14120a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$c */
    class C6818c implements CompletionHandler {
        C6818c(C6815i0 i0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$d */
    class C6819d implements CompletionHandler {
        C6819d() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$e */
    class C6820e implements CompletionHandler {
        C6820e(C6815i0 i0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$f */
    class C6821f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14123a;

        C6821f(boolean z) {
            this.f14123a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27652M0(this.f14123a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$g */
    class C6822g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14125a;

        C6822g(int i) {
            this.f14125a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27648K0(true);
            C6815i0 i0Var = C6815i0.this;
            i0Var.mo23352w1(i0Var.mo23433j1(this.f14125a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$h */
    class C6823h implements CompletionHandler {
        C6823h(C6815i0 i0Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$i */
    class C6824i implements CompletionHandler {
        C6824i(C6815i0 i0Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$j */
    class C6825j implements Lamp9Service.C9156u0 {
        C6825j() {
        }

        /* renamed from: a */
        public void mo28411a(Long l) {
            "onBrightChanged: " + l;
            C6815i0.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28412b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6815i0.this.mo23408d0().mo27710r(2) == null) {
                C6815i0.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6815i0.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28413c(Long l) {
            "onFlowingChanged: " + l;
            C6815i0.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28414d(Long l) {
            "onSaveStateChanged: " + l;
            C6815i0.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28415e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6815i0.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28416f(Long l) {
            "onOnFromPowerChanged: " + l.intValue();
            C6815i0.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28417g(Long l) {
            "onLanModeChanged: " + l;
            C6815i0.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28418h(Long l) {
            "onCtScaleChanged: " + l.intValue();
            C6815i0.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28419i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6815i0.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6815i0.this.mo23408d0().mo27640G0(true);
                }
                C6815i0.this.mo23408d0().mo27638F0(split[1]);
                C6815i0.this.mo23408d0().mo27636E0(split[2]);
                C6815i0.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C6815i0.f14114G;
                "start = " + C6815i0.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6815i0.this.mo23408d0().mo27631C() + ", " + C6815i0.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28420j(Lamp9Service.C9154t0 t0Var) {
            C6024e eVar;
            "onPowerSwitched: " + t0Var.name();
            int i = C6833r.f14141a[t0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6815i0.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6815i0.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: k */
        public void mo28421k(Long l) {
            "onNLBrightChanged: " + l;
            if (l.longValue() != 0) {
                C6815i0.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
                C6815i0.this.mo23408d0().mo27642H0(l.longValue());
                return;
            }
            C6815i0.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$k */
    class C6826k implements Lamp9Service.C9148q0 {
        C6826k() {
        }

        /* renamed from: a */
        public void mo28422a(Lamp9Service.C9154t0 t0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8) {
            "bright: " + l;
            "ct: " + l2;
            "delayoff: " + l3;
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(t0Var != null ? t0Var.name() : "null");
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("flowing : ");
            Long l9 = l7;
            sb2.append(l9);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lanMode: ");
            Long l10 = l4;
            sb3.append(l10);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onFromPower: ");
            Long l11 = l6;
            sb4.append(l11);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("saveState: ");
            Long l12 = l5;
            sb5.append(l12);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowParams: ");
            String str3 = str;
            sb6.append(str3);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("nightTimeInfo: ");
            String str4 = str2;
            sb7.append(str4);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("nLBright: ");
            Long l13 = l8;
            sb8.append(l13);
            sb8.toString();
            C6815i0.this.m20258Z1(t0Var, l, l2, l3, str3, l10, l12, l11, l9, str4, l13);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$l */
    class C6827l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14129a;

        C6827l(boolean z) {
            this.f14129a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27717u0(this.f14129a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$m */
    class C6828m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14131a;

        C6828m(boolean z) {
            this.f14131a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27682d(this.f14131a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$n */
    class C6829n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14133a;

        C6829n(int i) {
            this.f14133a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27644I0(this.f14133a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$o */
    class C6830o implements CompletionHandler {
        C6830o(C6815i0 i0Var) {
        }

        public void onFailed(int i, String str) {
            "setShortKeyCmd --> onFailed, i = " + i + " , s = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$p */
    class C6831p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14135a;

        /* renamed from: b */
        final /* synthetic */ String f14136b;

        /* renamed from: c */
        final /* synthetic */ String f14137c;

        /* renamed from: d */
        final /* synthetic */ int f14138d;

        C6831p(boolean z, String str, String str2, int i) {
            this.f14135a = z;
            this.f14136b = str;
            this.f14137c = str2;
            this.f14138d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27640G0(this.f14135a);
            C6815i0.this.mo23408d0().mo27638F0(this.f14136b);
            C6815i0.this.mo23408d0().mo27636E0(this.f14137c);
            C6815i0.this.mo23408d0().mo27634D0(this.f14138d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$q */
    class C6832q implements C6006h.C6016j {
        C6832q() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6815i0.this.f14116B.mo28411a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6815i0.this.f14116B.mo28418h(l);
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
            C6815i0.this.f14116B.mo28420j(Lamp9Service.C9154t0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$r */
    static /* synthetic */ class C6833r {

        /* renamed from: a */
        static final /* synthetic */ int[] f14141a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$t0[] r0 = com.yeelight.yeelib.device.xiaomi.Lamp9Service.C9154t0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14141a = r0
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$t0 r1 = com.yeelight.yeelib.device.xiaomi.Lamp9Service.C9154t0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14141a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$t0 r1 = com.yeelight.yeelib.device.xiaomi.Lamp9Service.C9154t0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6815i0.C6833r.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$s */
    class C6834s implements CompletionHandler {
        C6834s() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.open --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$t */
    class C6835t implements CompletionHandler {
        C6835t() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$u */
    class C6836u implements CompletionHandler {
        C6836u() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$v */
    class C6837v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14145a;

        C6837v(long j) {
            this.f14145a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27697k0(this.f14145a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$w */
    class C6838w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14147a;

        C6838w(int i) {
            this.f14147a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27707p0(this.f14147a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$x */
    class C6839x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14149a;

        C6839x(C9856y yVar) {
            this.f14149a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27654N0(this.f14149a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$y */
    class C6840y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14151a;

        C6840y(C9856y yVar) {
            this.f14151a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27654N0(this.f14151a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.i0$z */
    class C6841z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14153a;

        C6841z(C9856y yVar) {
            this.f14153a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6815i0.this.mo23408d0().mo27654N0(this.f14153a);
        }
    }

    public C6815i0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        C7565b bVar = C7565b.DEVICE_EVENT_OPEN;
        C7565b bVar2 = C7565b.DEVICE_EVENT_CLOSE;
        C7565b bVar3 = C7565b.DEVICE_EVENT_BRIGHT_CHANGE;
        C7563a aVar = C7563a.ON;
        C7563a aVar2 = C7563a.OFF;
        C7563a aVar3 = C7563a.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public void m20258Z1(Lamp9Service.C9154t0 t0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8) {
        if (t0Var != null) {
            mo23408d0().mo27648K0(t0Var == Lamp9Service.C9154t0.on);
        }
        if (l != null) {
            mo23408d0().mo27697k0(l.longValue());
        }
        if (l2 != null) {
            mo23408d0().mo27707p0(l2.intValue());
        }
        if (l6 != null) {
            mo23408d0().mo27644I0(l6.intValue());
        }
        if (l3 != null) {
            if (mo23408d0().mo27710r(2) == null) {
                mo23408d0().mo27676a(new C7554e(l3.intValue(), l3.intValue()));
            } else {
                mo23408d0().mo27670V0(l3.intValue());
            }
        }
        mo23408d0().mo27682d(l4 != null && l4.longValue() == 1);
        mo23408d0().mo27652M0(l5 != null && l5.longValue() == 1);
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
        mo23408d0().mo27715t0(l7.longValue() != 0);
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
        if (l8.longValue() == 0) {
            mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
            return;
        }
        mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
        mo23408d0().mo27642H0(l8.longValue());
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6836u());
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
        return R$drawable.icon_yeelight_device_badge_lamp9_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_lamp9_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6832q();
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
            mo27560F1().sendCmd(Lamp9Service.C9124e0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6828m(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: O1 */
    public boolean mo27569O1(boolean z) {
        "setKidMode --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(Lamp9Service.C9124e0.cfg_kidmode, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6827l(z));
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
            mo27560F1().sendCmd(Lamp9Service.C9124e0.cfg_init_power, String.valueOf(i), new C6829n(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Lamp9Service.C9124e0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6821f(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: T1 */
    public boolean mo27574T1(int i, int i2, int i3, String str) {
        String str2;
        int b;
        "setShortKeyCmd --> Invoke, action : " + i;
        if (i == 0) {
            str2 = TimerCodec.DISENABLE;
        } else if (i == 1) {
            int i4 = 15;
            if (mo23408d0().mo27710r(2) != null && (b = ((C7554e) mo23408d0().mo27710r(2)).mo28881b()) > 0) {
                i4 = b;
            }
            str2 = String.format("1|%03d", new Object[]{Integer.valueOf(i4)});
        } else if (i != 2) {
            str2 = "";
        } else {
            str2 = String.format("2|%03d|%03d|%s", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2), str});
        }
        " param : " + str2;
        try {
            mo27560F1().sendCmd(Lamp9Service.C9124e0.cfg_shortkey, str2, new C6830o(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28410a2(this.f14115A, this.f14116B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14117z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14114G, "Invalid handler!");
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

    /* renamed from: Y1 */
    public Lamp9Service mo27560F1() {
        return ((YeelightLamp9Device) this.f7251n).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo28410a2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Lamp9Service.C9156u0)) {
            C4308b.m12139r(f14114G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Lamp9Service.C9156u0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        if (super.mo23326b1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Lamp9Service.C9154t0.off, new C6835t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6819d());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: g1 */
    public boolean mo23431g1(boolean z, String str, String str2, int i) {
        "enableNightTime --> Invoke, enable : " + z + ", startTime : " + str + " , endTime : " + str2 + " , delayTime : " + i;
        try {
            Lamp9Service Y1 = mo27560F1();
            Lamp9Service.C9124e0 e0Var = Lamp9Service.C9124e0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            Y1.sendCmd(e0Var, sb.toString(), new C6831p(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Lamp9Service.C9154t0.on, new C6834s());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        if (super.mo23336m1(i)) {
            return true;
        }
        try {
            mo27560F1().openWithMode(Lamp9Service.C9154t0.on, Lamp9Service.C9126f0.smooth, 500L, Long.valueOf((long) i), new C6822g(i));
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
            mo27560F1().setBright(Long.valueOf(j), Lamp9Service.C9126f0.smooth, 500L, new C6837v(j));
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
            mo27560F1().setCt(Long.valueOf((long) i), Lamp9Service.C9126f0.smooth, 500L, new C6838w(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6820e(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6818c(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14117z);
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
                C4308b.m12139r("BATCH_RPC", "MangoDevice, Invalid length of batch rpc result: " + str);
            }
            m20258Z1(Lamp9Service.C9154t0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), jSONArray.getString(4), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)));
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
                mo27560F1().getProperties(new C6826k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6839x(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6840y(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6841z(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6816a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C6817b(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f14114G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("NLBright").getInternalName()};
    }
}
