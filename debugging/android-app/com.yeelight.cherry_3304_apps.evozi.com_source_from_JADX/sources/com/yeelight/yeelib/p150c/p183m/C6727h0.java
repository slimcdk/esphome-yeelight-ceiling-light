package com.yeelight.yeelib.p150c.p183m;

import android.text.TextUtils;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.device.xiaomi.Lamp7Service;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp7Device;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7552d;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p185d.C7565b;
import com.yeelight.yeelib.utils.C4308b;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.c.m.h0 */
public class C6727h0 extends C6006h {

    /* renamed from: H */
    public static final String f13983H = "h0";

    /* renamed from: A */
    CompletionHandler f13984A = new C6734g(this);

    /* renamed from: B */
    CompletionHandler f13985B = new C6735h(this);

    /* renamed from: G */
    Lamp7Service.C9111w0 f13986G = new C6736i();

    /* renamed from: z */
    public int f13987z;

    /* renamed from: com.yeelight.yeelib.c.m.h0$a */
    class C6728a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13988a;

        C6728a(C9856y yVar) {
            this.f13988a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27654N0(this.f13988a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$b */
    class C6729b implements CompletionHandler {
        C6729b(C6727h0 h0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$c */
    class C6730c implements CompletionHandler {
        C6730c() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$d */
    class C6731d implements CompletionHandler {
        C6731d(C6727h0 h0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$e */
    class C6732e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13991a;

        C6732e(boolean z) {
            this.f13991a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27652M0(this.f13991a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$f */
    class C6733f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13993a;

        C6733f(int i) {
            this.f13993a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27648K0(true);
            C6727h0 h0Var = C6727h0.this;
            h0Var.mo23352w1(h0Var.mo23433j1(this.f13993a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$g */
    class C6734g implements CompletionHandler {
        C6734g(C6727h0 h0Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$h */
    class C6735h implements CompletionHandler {
        C6735h(C6727h0 h0Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$i */
    class C6736i implements Lamp7Service.C9111w0 {
        C6736i() {
        }

        /* renamed from: a */
        public void mo28358a(Long l) {
            "onBrightChanged: " + l;
            C6727h0.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28359b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6727h0.this.mo23408d0().mo27710r(2) == null) {
                C6727h0.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6727h0.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28360c(Long l) {
            "onFlowingChanged: " + l;
            C6727h0.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28361d(Long l) {
            "onSaveStateChanged: " + l;
            C6727h0.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28362e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6727h0.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28363f(Long l) {
            "onOnFromPowerChanged: " + l.intValue();
            C6727h0.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28364g(Long l) {
            "onLanModeChanged: " + l;
            C6727h0.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28365h(Long l) {
            "onCtScaleChanged: " + l.intValue();
            C6727h0.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28366i(Long l) {
            "onKidModeChanged: " + l;
            C6727h0.this.mo23408d0().mo27719v0(l != null && l.longValue() == 1);
        }

        /* renamed from: j */
        public void mo28367j(Long l) {
            "onSensorPirEnableChanged: " + l;
            C6727h0.this.mo23408d0().mo27694j(l != null && l.longValue() == 1);
        }

        /* renamed from: k */
        public void mo28368k(String str) {
            "onDefaultPomodoroChanged: " + str;
            C6727h0.this.m20077f2(str);
        }

        /* renamed from: l */
        public void mo28369l(Lamp7Service.C9109v0 v0Var) {
            C6024e eVar;
            "onPowerSwitched: " + v0Var.name();
            int i = C6745r.f14008a[v0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6727h0.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6727h0.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$j */
    class C6737j implements Lamp7Service.C9101r0 {
        C6737j() {
        }

        /* renamed from: a */
        public void mo28370a(Lamp7Service.C9109v0 v0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, Long l9, String str2) {
            "bright: " + l;
            "ct: " + l2;
            "delayoff: " + l3;
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(v0Var != null ? v0Var.name() : "null");
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kidMode: ");
            Long l10 = l4;
            sb2.append(l10);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("flowing : ");
            Long l11 = l8;
            sb3.append(l11);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("lanMode: ");
            Long l12 = l5;
            sb4.append(l12);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("onFromPower: ");
            Long l13 = l7;
            sb5.append(l13);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("saveState: ");
            Long l14 = l6;
            sb6.append(l14);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowParams: ");
            String str3 = str;
            sb7.append(str3);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("sensorPirEnable: ");
            Long l15 = l9;
            sb8.append(l15);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("defaultPomodoro: ");
            String str4 = str2;
            sb9.append(str4);
            sb9.toString();
            C6727h0.this.m20075c2(v0Var, l, l2, l3, l10, str3, l12, l14, l13, l11, l15, str4);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$k */
    class C6738k implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7552d f13997a;

        C6738k(C7552d dVar) {
            this.f13997a = dVar;
        }

        public void onFailed(int i, String str) {
            "setDefaultSchedule onFailed code: " + i;
        }

        public void onSucceed() {
            C6727h0.this.m20076e2(this.f13997a.mo28877c());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$l */
    class C6739l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13999a;

        C6739l(boolean z) {
            this.f13999a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27719v0(this.f13999a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$m */
    class C6740m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14001a;

        C6740m(boolean z) {
            this.f14001a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27682d(this.f14001a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$n */
    class C6741n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14003a;

        C6741n(boolean z) {
            this.f14003a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27686f(this.f14003a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$o */
    class C6742o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14005a;

        C6742o(int i) {
            this.f14005a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27644I0(this.f14005a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$p */
    class C6743p implements CompletionHandler {
        C6743p(C6727h0 h0Var) {
        }

        public void onFailed(int i, String str) {
            "setShortKeyCmd --> onFailed, i = " + i + " , s = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$q */
    class C6744q implements C6006h.C6016j {
        C6744q() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6727h0.this.f13986G.mo28358a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6727h0.this.f13986G.mo28365h(l);
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
            C6727h0.this.f13986G.mo28369l(Lamp7Service.C9109v0.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$r */
    static /* synthetic */ class C6745r {

        /* renamed from: a */
        static final /* synthetic */ int[] f14008a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$v0[] r0 = com.yeelight.yeelib.device.xiaomi.Lamp7Service.C9109v0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14008a = r0
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$v0 r1 = com.yeelight.yeelib.device.xiaomi.Lamp7Service.C9109v0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14008a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$v0 r1 = com.yeelight.yeelib.device.xiaomi.Lamp7Service.C9109v0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6727h0.C6745r.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$s */
    class C6746s implements CompletionHandler {
        C6746s() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.open --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$t */
    class C6747t implements CompletionHandler {
        C6747t() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$u */
    class C6748u implements CompletionHandler {
        C6748u() {
        }

        public void onFailed(int i, String str) {
            String.format("MangoDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$v */
    class C6749v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14012a;

        C6749v(long j) {
            this.f14012a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27697k0(this.f14012a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$w */
    class C6750w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14014a;

        C6750w(int i) {
            this.f14014a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27707p0(this.f14014a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$x */
    class C6751x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14016a;

        C6751x(C9856y yVar) {
            this.f14016a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27654N0(this.f14016a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$y */
    class C6752y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14018a;

        C6752y(C9856y yVar) {
            this.f14018a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27654N0(this.f14018a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h0$z */
    class C6753z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14020a;

        C6753z(C9856y yVar) {
            this.f14020a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6727h0.this.mo23408d0().mo27654N0(this.f14020a);
        }
    }

    public C6727h0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        C7565b bVar = C7565b.DEVICE_EVENT_OPEN;
        C7565b bVar2 = C7565b.DEVICE_EVENT_CLOSE;
        C7565b bVar3 = C7565b.DEVICE_EVENT_BRIGHT_CHANGE;
        C7563a aVar = C7563a.ON;
        C7563a aVar2 = C7563a.OFF;
        C7563a aVar3 = C7563a.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public void m20075c2(Lamp7Service.C9109v0 v0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, Long l9, String str2) {
        Lamp7Service.C9109v0 v0Var2 = v0Var;
        boolean z = true;
        if (v0Var2 != null) {
            mo23408d0().mo27648K0(v0Var2 == Lamp7Service.C9109v0.on);
        }
        if (l != null) {
            mo23408d0().mo27697k0(l.longValue());
        }
        if (l2 != null) {
            mo23408d0().mo27707p0(l2.intValue());
        }
        if (l7 != null) {
            mo23408d0().mo27644I0(l7.intValue());
        }
        if (l3 != null) {
            if (mo23408d0().mo27710r(2) == null) {
                mo23408d0().mo27676a(new C7554e(l3.intValue(), l3.intValue()));
            } else {
                mo23408d0().mo27670V0(l3.intValue());
            }
        }
        mo23408d0().mo27719v0(l4 != null && l4.longValue() == 1);
        mo23408d0().mo27682d(l5 != null && l5.longValue() == 1);
        mo23408d0().mo27652M0(l6 != null && l6.longValue() == 1);
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
        mo23408d0().mo27715t0(l8.longValue() != 0);
        C6024e d0 = mo23408d0();
        if (l9 == null || l9.longValue() != 1) {
            z = false;
        }
        d0.mo27686f(z);
        m20077f2(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public void m20076e2(int i) {
        this.f13987z = i;
        mo23408d0().mo27689g0(4096);
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public void m20077f2(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            if (split.length >= 1 && !TextUtils.isEmpty(split[0])) {
                m20076e2(Integer.valueOf(split[0]).intValue());
            }
        }
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6748u());
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
            return R$drawable.icon_yeelight_device_badge_lamp7_small;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -449944724:
                if (T.equals("yeelink.light.lamp7")) {
                    c = 0;
                    break;
                }
                break;
            case -449944723:
                if (T.equals("yeelink.light.lamp8")) {
                    c = 1;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? R$drawable.icon_yeelight_device_badge_lamp7_small : R$drawable.icon_yeelight_device_badge_lamp8_small : R$drawable.icon_yeelight_device_badge_lamp7_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_lamp7_big;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -449944724:
                if (T.equals("yeelink.light.lamp7")) {
                    c = 0;
                    break;
                }
                break;
            case -449944723:
                if (T.equals("yeelink.light.lamp8")) {
                    c = 1;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? R$drawable.icon_yeelight_device_badge_lamp7_big : R$drawable.icon_yeelight_device_badge_lamp8_big : R$drawable.icon_yeelight_device_badge_lamp7_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6744q();
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
            mo27560F1().sendCmd(Lamp7Service.C9077f0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6740m(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: P1 */
    public void mo27570P1(boolean z) {
        "setKidModeSelect --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(Lamp7Service.C9077f0.kid_mode, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6739l(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: R1 */
    public boolean mo27572R1(int i) {
        "setOnFromPower --> Invoke, value : " + i;
        try {
            mo27560F1().sendCmd(Lamp7Service.C9077f0.cfg_init_power, String.valueOf(i), new C6742o(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Lamp7Service.C9077f0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6732e(z));
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
            mo27560F1().sendCmd(Lamp7Service.C9077f0.cfg_shortkey, str2, new C6743p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28357g2(this.f13985B, this.f13986G);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13984A);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13983H, "Invalid handler!");
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
    public Lamp7Service mo27560F1() {
        return ((YeelightLamp7Device) this.f7251n).mDeviceService;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        if (super.mo23326b1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Lamp7Service.C9109v0.off, new C6747t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: b2 */
    public int mo28355b2() {
        return this.f13987z;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6730c());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: d2 */
    public void mo28356d2(C7552d dVar) {
        if (dVar != null) {
            try {
                mo27560F1().setTime(Lamp7Service.C9077f0.pomodoro, "default", dVar.mo28875a(), new C6738k(dVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e1 */
    public void mo23430e1(boolean z) {
        "enableHumanInduction --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(Lamp7Service.C9077f0.sensor_pir_enable, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6741n(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g2 */
    public boolean mo28357g2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Lamp7Service.C9111w0)) {
            C4308b.m12139r(f13983H, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Lamp7Service.C9111w0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Lamp7Service.C9109v0.on, new C6746s());
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
            mo27560F1().openWithMode(Lamp7Service.C9109v0.on, Lamp7Service.C9079g0.smooth, 500L, Long.valueOf((long) i), new C6733f(i));
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
            mo27560F1().setBright(Long.valueOf(j), Lamp7Service.C9079g0.smooth, 500L, new C6749v(j));
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
            mo27560F1().setCt(Long.valueOf((long) i), Lamp7Service.C9079g0.smooth, 500L, new C6750w(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6731d(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6729b(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f13984A);
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
                C4308b.m12139r("BATCH_RPC", "MangoDevice, Invalid length of batch rpc result: " + str2);
            }
            m20075c2(Lamp7Service.C9109v0.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), jSONArray.getString(5), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)), jSONArray.getString(11));
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
                mo27560F1().getProperties(new C6737j());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6751x(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6752y(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6753z(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6728a(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else {
            String str = f13983H;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("KidMode").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty(Lamp7Service.PROPERTY_SensorPirEnable).getInternalName(), mo27560F1().getService().getProperty(Lamp7Service.PROPERTY_DefaultPomodoro).getInternalName()};
    }
}
