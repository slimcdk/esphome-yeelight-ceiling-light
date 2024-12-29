package com.yeelight.yeelib.p150c.p183m;

import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.device.xiaomi.LampService;
import com.yeelight.yeelib.device.xiaomi.YeelightLampDevice;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p181l.p182n1.C6178a;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p150c.p184n.C7559i;
import com.yeelight.yeelib.p150c.p184n.C7560j;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p185d.C7565b;
import com.yeelight.yeelib.utils.C4308b;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.c.m.j0 */
public class C6895j0 extends C6006h implements C6178a {

    /* renamed from: G */
    public static final String f14232G = "j0";

    /* renamed from: A */
    CompletionHandler f14233A = new C6903h(this);

    /* renamed from: B */
    LampService.C9213z0 f14234B = new C6904i();

    /* renamed from: z */
    CompletionHandler f14235z = new C6902g(this);

    /* renamed from: com.yeelight.yeelib.c.m.j0$a */
    class C6896a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14236a;

        C6896a(C9856y yVar) {
            this.f14236a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27654N0(this.f14236a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$b */
    class C6897b implements CompletionHandler {
        C6897b(C6895j0 j0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$c */
    class C6898c implements CompletionHandler {
        C6898c() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$d */
    class C6899d implements CompletionHandler {
        C6899d(C6895j0 j0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$e */
    class C6900e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14239a;

        C6900e(boolean z) {
            this.f14239a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27652M0(this.f14239a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$f */
    class C6901f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14241a;

        C6901f(int i) {
            this.f14241a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27648K0(true);
            C6895j0 j0Var = C6895j0.this;
            j0Var.mo23352w1(j0Var.mo23433j1(this.f14241a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$g */
    class C6902g implements CompletionHandler {
        C6902g(C6895j0 j0Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$h */
    class C6903h implements CompletionHandler {
        C6903h(C6895j0 j0Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$i */
    class C6904i implements LampService.C9213z0 {
        C6904i() {
        }

        /* renamed from: a */
        public void mo28457a(Long l) {
            "onBrightChanged: " + l;
            C6895j0.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28458b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6895j0.this.mo23408d0().mo27710r(2) == null) {
                C6895j0.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6895j0.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28459c(Long l) {
            "onFlowingChanged: " + l;
            C6895j0.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28460d(Long l) {
            "onSaveStateChanged: " + l;
            C6895j0.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28461e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6895j0.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28462f(Long l) {
            "onOnFromPowerChanged: " + l.intValue();
            C6895j0.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28463g(LampService.C9211y0 y0Var) {
            C6024e eVar;
            "onPowerSwitched: " + y0Var.name();
            int i = C6913r.f14255a[y0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6895j0.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6895j0.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: h */
        public void mo28464h(Long l) {
            "onCtScaleChanged: " + l.intValue();
            C6895j0.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28465i(Long l) {
            "onKidModeChanged: " + l;
            C6895j0.this.mo23408d0().mo27717u0(l.longValue() == 1);
        }

        /* renamed from: j */
        public void mo28466j(Long l) {
            "onPdoBreakTimeChanged: " + l.intValue();
            if (C6895j0.this.mo23408d0().mo27710r(11) != null) {
                ((C7559i) C6895j0.this.mo23408d0().mo27710r(11)).mo28928f(l.intValue());
                C6895j0.this.mo23408d0().mo27672W0();
            }
        }

        /* renamed from: k */
        public void mo28467k(Long l) {
            "onPdoWorkTimeChanged: " + l.intValue();
            if (C6895j0.this.mo23408d0().mo27710r(11) != null) {
                ((C7559i) C6895j0.this.mo23408d0().mo27710r(11)).mo28932j(l.intValue());
                C6895j0.this.mo23408d0().mo27672W0();
            }
        }

        /* renamed from: l */
        public void mo28468l(Long l) {
            "onPdoStatusChanged: " + l.intValue();
            C6895j0.this.mo28048g();
            boolean z = true;
            if (C6895j0.this.mo23408d0().mo27710r(11) == null) {
                C6024e d0 = C6895j0.this.mo23408d0();
                if (l.longValue() != 1) {
                    z = false;
                }
                d0.mo27678b(11, new C7559i(z, 45, 15));
            } else {
                C7559i iVar = (C7559i) C6895j0.this.mo23408d0().mo27710r(11);
                if (l.longValue() != 1) {
                    z = false;
                }
                iVar.mo28929g(z);
            }
            C6895j0.this.mo23408d0().mo27672W0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$j */
    class C6905j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f14244a;

        C6905j(String str) {
            this.f14244a = str;
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.sendPomodoroCmd --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            if (Integer.valueOf(this.f14244a.split("\\|")[0]).intValue() == 0 && C6895j0.this.mo23408d0().mo27710r(11) != null) {
                ((C7559i) C6895j0.this.mo23408d0().mo27710r(11)).mo28929g(false);
                ((C7559i) C6895j0.this.mo23408d0().mo27710r(11)).mo28931i(0);
                ((C7559i) C6895j0.this.mo23408d0().mo27710r(11)).mo28930h(0);
                C6895j0.this.mo23408d0().mo27672W0();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$k */
    class C6906k implements LampService.C9201t0 {
        C6906k() {
        }

        /* renamed from: a */
        public void mo28469a(LampService.C9211y0 y0Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, Long l8, Long l9, Long l10, String str2, Long l11) {
            "bright: " + l;
            "ct: " + l2;
            "pdoBreakTime: " + l5;
            "pdoStatus: " + l3;
            "delayoff: " + l6;
            "pdoWorkTime: " + l4;
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(y0Var != null ? y0Var.name() : "null");
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kidMode: ");
            Long l12 = l7;
            sb2.append(l12);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("shortkey action: ");
            Long l13 = l10;
            sb3.append(l13);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("shortkey scene name: ");
            String str3 = str2;
            sb4.append(str3);
            sb4.toString();
            "flowing : " + l11;
            "onFromPower: " + l9;
            "saveState: " + l8;
            "flowParams: " + str;
            C6895j0.this.m20426a2(y0Var, l, l2, l3, l4, l5, l6, l12, str, l8, l9, l13, str3, l11);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$l */
    class C6907l implements LampService.C9183k0 {
        C6907l() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.getData --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed(String str) {
            "MangoDevice.getData, response: " + str;
            String[] split = str.split("\\|");
            boolean z = false;
            int intValue = Integer.valueOf(split[0]).intValue();
            int intValue2 = Integer.valueOf(split[1]).intValue();
            int i = intValue2 / 1000;
            int i2 = intValue2 % 1000;
            int intValue3 = Integer.valueOf(split[2]).intValue();
            int i3 = intValue3 / 10000;
            int i4 = intValue3 % 10000;
            "MangoDevice.getData, enabled: " + intValue + ", worktime : " + i + ", resttime : " + i2 + ", workremain : " + i3 + ", restRemain : " + i4;
            if (C6895j0.this.mo23408d0().mo27710r(11) != null) {
                C7559i iVar = (C7559i) C6895j0.this.mo23408d0().mo27710r(11);
                if (intValue == 1) {
                    z = true;
                }
                iVar.mo28929g(z);
                ((C7559i) C6895j0.this.mo23408d0().mo27710r(11)).mo28932j(i);
                ((C7559i) C6895j0.this.mo23408d0().mo27710r(11)).mo28928f(i2);
                ((C7559i) C6895j0.this.mo23408d0().mo27710r(11)).mo28931i(i3);
                ((C7559i) C6895j0.this.mo23408d0().mo27710r(11)).mo28930h(i4);
                C6895j0.this.mo23408d0().mo27672W0();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$m */
    class C6908m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14248a;

        C6908m(boolean z) {
            this.f14248a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27717u0(this.f14248a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$n */
    class C6909n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14250a;

        C6909n(boolean z) {
            this.f14250a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27682d(this.f14250a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$o */
    class C6910o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14252a;

        C6910o(int i) {
            this.f14252a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27644I0(this.f14252a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$p */
    class C6911p implements CompletionHandler {
        C6911p(C6895j0 j0Var) {
        }

        public void onFailed(int i, String str) {
            "setShortKeyCmd --> onFailed, i = " + i + " , s = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$q */
    class C6912q implements C6006h.C6016j {
        C6912q() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6895j0.this.f14234B.mo28457a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6895j0.this.f14234B.mo28464h(l);
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
            C6895j0.this.f14234B.mo28463g(LampService.C9211y0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$r */
    static /* synthetic */ class C6913r {

        /* renamed from: a */
        static final /* synthetic */ int[] f14255a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.LampService$y0[] r0 = com.yeelight.yeelib.device.xiaomi.LampService.C9211y0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14255a = r0
                com.yeelight.yeelib.device.xiaomi.LampService$y0 r1 = com.yeelight.yeelib.device.xiaomi.LampService.C9211y0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14255a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.LampService$y0 r1 = com.yeelight.yeelib.device.xiaomi.LampService.C9211y0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6895j0.C6913r.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$s */
    class C6914s implements CompletionHandler {
        C6914s() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.open --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$t */
    class C6915t implements CompletionHandler {
        C6915t() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$u */
    class C6916u implements CompletionHandler {
        C6916u() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$v */
    class C6917v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14259a;

        C6917v(long j) {
            this.f14259a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27697k0(this.f14259a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$w */
    class C6918w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14261a;

        C6918w(int i) {
            this.f14261a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27707p0(this.f14261a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$x */
    class C6919x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14263a;

        C6919x(C9856y yVar) {
            this.f14263a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27654N0(this.f14263a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$y */
    class C6920y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14265a;

        C6920y(C9856y yVar) {
            this.f14265a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27654N0(this.f14265a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.j0$z */
    class C6921z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14267a;

        C6921z(C9856y yVar) {
            this.f14267a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6895j0.this.mo23408d0().mo27654N0(this.f14267a);
        }
    }

    public C6895j0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        C7565b bVar = C7565b.DEVICE_EVENT_OPEN;
        C7565b bVar2 = C7565b.DEVICE_EVENT_CLOSE;
        C7565b bVar3 = C7565b.DEVICE_EVENT_BRIGHT_CHANGE;
        C7563a aVar = C7563a.ON;
        C7563a aVar2 = C7563a.OFF;
        C7563a aVar3 = C7563a.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public void m20426a2(LampService.C9211y0 y0Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, Long l8, Long l9, Long l10, String str2, Long l11) {
        String str3;
        int i;
        LampService.C9211y0 y0Var2 = y0Var;
        boolean z = true;
        if (y0Var2 != null) {
            mo23408d0().mo27648K0(y0Var2 == LampService.C9211y0.on);
        }
        if (l != null) {
            mo23408d0().mo27697k0(l.longValue());
        }
        if (l2 != null) {
            mo23408d0().mo27707p0(l2.intValue());
        }
        if (l9 != null) {
            mo23408d0().mo27644I0(l9.intValue());
        }
        if (l6 != null) {
            if (mo23408d0().mo27710r(2) == null) {
                mo23408d0().mo27676a(new C7554e(l6.intValue(), l6.intValue()));
            } else {
                mo23408d0().mo27670V0(l6.intValue());
            }
        }
        boolean z2 = l3 != null && l3.longValue() == 1;
        int i2 = 45;
        int intValue = l4 != null ? l4.intValue() : 45;
        int i3 = 15;
        int intValue2 = l5 != null ? l5.intValue() : 15;
        if (mo23408d0().mo27710r(11) == null) {
            C6024e d0 = mo23408d0();
            if (intValue != 0) {
                i2 = intValue;
            }
            if (intValue2 != 0) {
                i3 = intValue2;
            }
            d0.mo27678b(11, new C7559i(z2, i2, i3));
        } else {
            ((C7559i) mo23408d0().mo27710r(11)).mo28929g(z2);
            ((C7559i) mo23408d0().mo27710r(11)).mo28932j(intValue);
            ((C7559i) mo23408d0().mo27710r(11)).mo28928f(intValue2);
            mo23408d0().mo27672W0();
        }
        mo23408d0().mo27717u0(l7 != null && l7.longValue() == 1);
        if (mo23408d0().mo27710r(19) == null) {
            C6024e d02 = mo23408d0();
            if (l10 != null) {
                i = l10.intValue();
                str3 = str2;
            } else {
                str3 = str2;
                i = 0;
            }
            d02.mo27678b(19, new C7560j(i, str3));
        }
        mo23408d0().mo27652M0(l8 != null && l8.longValue() == 1);
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
        C6024e d03 = mo23408d0();
        if (l11.longValue() == 0) {
            z = false;
        }
        d03.mo27715t0(z);
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6916u());
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
        return R$drawable.icon_yeelight_device_badge_mango_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_mango_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6912q();
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
            mo27560F1().sendCmd(LampService.C9175g0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6909n(z));
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
            mo27560F1().sendCmd(LampService.C9175g0.cfg_kidmode, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6908m(z));
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
            mo27560F1().sendCmd(LampService.C9175g0.cfg_init_power, String.valueOf(i), new C6910o(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(LampService.C9175g0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6900e(z));
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
            mo27560F1().sendCmd(LampService.C9175g0.cfg_shortkey, str2, new C6911p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28456c2(this.f14233A, this.f14234B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14235z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14232G, "Invalid handler!");
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
    public LampService mo27560F1() {
        return ((YeelightLampDevice) this.f7251n).mDeviceService;
    }

    /* renamed from: Z1 */
    public boolean mo28454Z1(LampService.C9175g0 g0Var, String str) {
        try {
            mo27560F1().getData(g0Var, str, new C6907l());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo28046a(int i, int i2) {
        return mo28455b2(LampService.C9175g0.cfg_pomodoro, String.format("01|%03d%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        if (super.mo23326b1()) {
            return true;
        }
        try {
            mo27560F1().setPower(LampService.C9211y0.off, new C6915t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: b2 */
    public boolean mo28455b2(LampService.C9175g0 g0Var, String str) {
        "MangoDevice.sendPomodoroCmd --> Invoke, cmd: " + g0Var.name() + ", param: " + str;
        try {
            mo27560F1().sendCmd(g0Var, str, new C6905j(str));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo28047c() {
        return mo28455b2(LampService.C9175g0.cfg_pomodoro, "00");
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6898c());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: c2 */
    public boolean mo28456c2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof LampService.C9213z0)) {
            C4308b.m12139r(f14232G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (LampService.C9213z0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: g */
    public boolean mo28048g() {
        return mo28454Z1(LampService.C9175g0.cfg_pomodoro, "00");
    }

    /* renamed from: h */
    public boolean mo28049h(int i, int i2) {
        return mo28455b2(LampService.C9175g0.cfg_pomodoro, String.format("02|%03d%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(LampService.C9211y0.on, new C6914s());
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
            mo27560F1().openWithMode(LampService.C9211y0.on, LampService.C9177h0.smooth, 500L, Long.valueOf((long) i), new C6901f(i));
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
            mo27560F1().setBright(Long.valueOf(j), LampService.C9177h0.smooth, 500L, new C6917v(j));
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
            mo27560F1().setCt(Long.valueOf((long) i), LampService.C9177h0.smooth, 500L, new C6918w(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6899d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6897b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14235z);
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
                C4308b.m12139r("BATCH_RPC", "MangoDevice, Invalid length of batch rpc result: " + str2);
            }
            m20426a2(LampService.C9211y0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), jSONArray.getString(12), Long.valueOf(jSONArray.getLong(13)));
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
                mo27560F1().getProperties(new C6906k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6919x(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6920y(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6921z(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6896a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f14232G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("PdoStatus").getInternalName(), mo27560F1().getService().getProperty("PdoWorkTime").getInternalName(), mo27560F1().getService().getProperty("PdoBreakTime").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("KidMode").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("ShortKeyAction").getInternalName(), mo27560F1().getService().getProperty("ShortKeySceneName").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName()};
    }
}
