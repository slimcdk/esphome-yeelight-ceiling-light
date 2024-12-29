package com.yeelight.yeelib.p150c.p183m;

import androidx.core.view.ViewCompat;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.Lamp10Service;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp10Device;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.p150c.p184n.C7562l;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p185d.C7565b;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.c.m.f0 */
public class C6513f0 extends C6006h {

    /* renamed from: G */
    public static final String f13653G = "f0";

    /* renamed from: A */
    CompletionHandler f13654A = new C6533o(this);

    /* renamed from: B */
    Lamp10Service.C8871i1 f13655B = new C6534p();

    /* renamed from: z */
    CompletionHandler f13656z = new C6532n(this);

    /* renamed from: com.yeelight.yeelib.c.m.f0$a */
    class C6514a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13657a;

        C6514a(C9856y yVar) {
            this.f13657a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27654N0(this.f13657a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$a0 */
    class C6515a0 implements CompletionHandler {
        C6515a0() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$b */
    class C6516b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13660a;

        C6516b(C9856y yVar) {
            this.f13660a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27654N0(this.f13660a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$b0 */
    class C6517b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f13662a;

        C6517b0(long j) {
            this.f13662a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27697k0(this.f13662a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$c */
    class C6518c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13664a;

        C6518c(C9856y yVar) {
            this.f13664a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27654N0(this.f13664a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$c0 */
    class C6519c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13666a;

        C6519c0(int i) {
            this.f13666a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27707p0(this.f13666a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$d */
    class C6520d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13668a;

        C6520d(C9856y yVar) {
            this.f13668a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27654N0(this.f13668a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$d0 */
    class C6521d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13670a;

        C6521d0(int i) {
            this.f13670a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27699l0(this.f13670a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$e */
    class C6522e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13672a;

        C6522e(C9856y yVar) {
            this.f13672a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27654N0(this.f13672a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$e0 */
    class C6523e0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f13674a;

        /* renamed from: b */
        final /* synthetic */ int f13675b;

        C6523e0(int[] iArr, int i) {
            this.f13674a = iArr;
            this.f13675b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f13674a) {
                arrayList.add(new C7556g.C7557a(aVar, this.f13675b));
            }
            C6513f0.this.mo23408d0().mo27701m0(arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$f */
    class C6524f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13677a;

        C6524f(C9856y yVar) {
            this.f13677a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27654N0(this.f13677a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$g */
    class C6525g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13679a;

        C6525g(C9856y yVar) {
            this.f13679a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27654N0(this.f13679a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$h */
    class C6526h implements CompletionHandler {
        C6526h(C6513f0 f0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$i */
    class C6527i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13681a;

        C6527i(boolean z) {
            this.f13681a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27652M0(this.f13681a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$j */
    class C6528j implements CompletionHandler {
        C6528j(C6513f0 f0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$k */
    class C6529k implements Lamp10Service.C8850b1 {
        C6529k() {
        }

        /* renamed from: a */
        public void mo28229a(Lamp10Service.C8868h1 h1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13, String str2, String str3) {
            "power: " + h1Var.name();
            "bright: " + l;
            "ct: " + l2;
            "temperature: " + l3;
            "mode: " + l7;
            "rgb: " + l8;
            "lanMode: " + l11;
            "flowing: " + l6;
            "hue: " + l4;
            "sat: " + l5;
            "delayoff: " + l9;
            "saveState: " + l10;
            "flowParams: " + str;
            "music_mode: " + l13;
            "onFromPower: " + l12;
            "indicator: " + str2;
            "nightTimeInfo: " + str3;
            C6513f0.this.m19659Z1(h1Var, l, l2, l3, l4, l5, l6, l7, l8, l9, l10, str, l11, l12, l13, str2, str3);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$l */
    class C6530l implements CompletionHandler {
        C6530l() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$m */
    class C6531m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13685a;

        C6531m(int i) {
            this.f13685a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27648K0(true);
            C6513f0 f0Var = C6513f0.this;
            f0Var.mo23352w1(f0Var.mo23433j1(this.f13685a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$n */
    class C6532n implements CompletionHandler {
        C6532n(C6513f0 f0Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$o */
    class C6533o implements CompletionHandler {
        C6533o(C6513f0 f0Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$p */
    class C6534p implements Lamp10Service.C8871i1 {
        C6534p() {
        }

        /* renamed from: a */
        public void mo28231a(Long l) {
            "onBrightChanged: " + l;
            C6513f0.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28232b(Long l) {
            "onDelayOffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6513f0.this.mo23408d0().mo27710r(2) == null) {
                C6513f0.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6513f0.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28233c(Long l) {
            "onFlowingChanged: " + l;
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            C6024e d0 = C6513f0.this.mo23408d0();
            if (i != 0) {
                d0.mo27630B0(C6024e.C6028d.DEVICE_MODE_FLOW);
            } else if (d0.mo27726z() == C6024e.C6028d.DEVICE_MODE_FLOW) {
                ((C7562l) C6513f0.this.mo23408d0()).mo28967Z0();
            }
            C6513f0.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28234d(Long l) {
            "onSaveStateChanged: " + l;
            C6513f0.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28235e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6513f0.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28236f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6513f0.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28237g(Long l) {
            "onLanModeChanged: " + l;
            C6513f0.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28238h(Long l) {
            "onCtScaleChanged: " + l;
            C6513f0.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28239i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6513f0.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6513f0.this.mo23408d0().mo27640G0(true);
                }
                C6513f0.this.mo23408d0().mo27638F0(split[1]);
                C6513f0.this.mo23408d0().mo27636E0(split[2]);
                C6513f0.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C6513f0.f13653G;
                "start = " + C6513f0.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6513f0.this.mo23408d0().mo27631C() + ", " + C6513f0.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28240j(Long l) {
            "onRgbChanged: " + l;
            C6513f0.this.mo23408d0().mo27699l0(l.intValue());
        }

        /* renamed from: k */
        public void mo28241k(Long l) {
            C6513f0.this.mo23408d0().mo27705o0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo28242l(Long l) {
            C6024e d0;
            C6024e.C6028d dVar;
            "onColorModeChanged: " + l;
            if (l.longValue() == 1) {
                d0 = C6513f0.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C6513f0.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C6513f0.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo27630B0(dVar);
        }

        /* renamed from: m */
        public void mo28243m(String str) {
            "onIndicatorEnableChanged = " + str;
            if (str != null) {
                String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                if (split.length != 0) {
                    C6513f0.this.mo23408d0().mo27694j(TimerCodec.ENABLE.equals(split[0]));
                }
            }
        }

        /* renamed from: n */
        public void mo28244n(Long l) {
            C6513f0.this.mo23408d0().mo27703n0((long) l.intValue());
        }

        /* renamed from: o */
        public void mo28245o(Long l) {
            "onMusicEnableChanged = " + l;
            C6513f0.this.mo23408d0().mo27692i(l.longValue() == 1);
        }

        /* renamed from: p */
        public void mo28246p(Lamp10Service.C8868h1 h1Var) {
            C6024e eVar;
            "onPowerChanged: " + h1Var.name();
            int i = C6543y.f13701a[h1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6513f0.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6513f0.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$q */
    class C6535q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13688a;

        C6535q(boolean z) {
            this.f13688a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27682d(this.f13688a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$r */
    class C6536r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13690a;

        C6536r(int i) {
            this.f13690a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27644I0(this.f13690a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$s */
    class C6537s implements CompletionHandler {
        C6537s(C6513f0 f0Var) {
        }

        public void onFailed(int i, String str) {
            "enableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$t */
    class C6538t implements CompletionHandler {
        C6538t(C6513f0 f0Var) {
        }

        public void onFailed(int i, String str) {
            "disableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$u */
    class C6539u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13692a;

        /* renamed from: b */
        final /* synthetic */ String f13693b;

        /* renamed from: c */
        final /* synthetic */ String f13694c;

        /* renamed from: d */
        final /* synthetic */ int f13695d;

        C6539u(boolean z, String str, String str2, int i) {
            this.f13692a = z;
            this.f13693b = str;
            this.f13694c = str2;
            this.f13695d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27640G0(this.f13692a);
            C6513f0.this.mo23408d0().mo27638F0(this.f13693b);
            C6513f0.this.mo23408d0().mo27636E0(this.f13694c);
            C6513f0.this.mo23408d0().mo27634D0(this.f13695d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$v */
    class C6540v implements CompletionHandler {
        C6540v() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$w */
    class C6541w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13698a;

        C6541w(boolean z) {
            this.f13698a = z;
        }

        public void onFailed(int i, String str) {
            "enableTouchPanelIndicator onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27694j(this.f13698a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$x */
    class C6542x implements C6006h.C6016j {
        C6542x() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6513f0.this.f13655B.mo28231a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6513f0.this.f13655B.mo28238h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
            C6513f0.this.f13655B.mo28240j(l);
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
            C6513f0.this.f13655B.mo28242l(l);
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C6513f0.this.f13655B.mo28246p(Lamp10Service.C8868h1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$y */
    static /* synthetic */ class C6543y {

        /* renamed from: a */
        static final /* synthetic */ int[] f13701a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$h1[] r0 = com.yeelight.yeelib.device.xiaomi.Lamp10Service.C8868h1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13701a = r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$h1 r1 = com.yeelight.yeelib.device.xiaomi.Lamp10Service.C8868h1.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13701a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$h1 r1 = com.yeelight.yeelib.device.xiaomi.Lamp10Service.C8868h1.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6513f0.C6543y.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f0$z */
    class C6544z implements CompletionHandler {
        C6544z() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6513f0.this.mo23408d0().mo27648K0(false);
        }
    }

    public C6513f0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        C7565b bVar = C7565b.DEVICE_EVENT_OPEN;
        C7565b bVar2 = C7565b.DEVICE_EVENT_CLOSE;
        C7565b bVar3 = C7565b.DEVICE_EVENT_BRIGHT_CHANGE;
        C7563a aVar = C7563a.ON;
        C7563a aVar2 = C7563a.OFF;
        C7563a aVar3 = C7563a.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m19659Z1(com.yeelight.yeelib.device.xiaomi.Lamp10Service.C8868h1 r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.Long r20, java.lang.Long r21, java.lang.Long r22, java.lang.String r23, java.lang.Long r24, java.lang.Long r25, java.lang.Long r26, java.lang.String r27, java.lang.String r28) {
        /*
            r11 = this;
            r0 = r12
            r1 = r27
            r2 = 2
            r3 = 1
            if (r18 == 0) goto L_0x0017
            int r4 = r18.intValue()
            if (r4 != r3) goto L_0x0017
            com.yeelight.yeelib.c.i.e r4 = r11.mo23408d0()
            com.yeelight.yeelib.c.i.e$d r5 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_FLOW
        L_0x0013:
            r4.mo27630B0(r5)
            goto L_0x0032
        L_0x0017:
            if (r19 == 0) goto L_0x0032
            com.yeelight.yeelib.c.i.e r4 = r11.mo23408d0()
            int r5 = r19.intValue()
            if (r5 != r3) goto L_0x0026
            com.yeelight.yeelib.c.i.e$d r5 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR
            goto L_0x0013
        L_0x0026:
            int r5 = r19.intValue()
            if (r5 != r2) goto L_0x002f
            com.yeelight.yeelib.c.i.e$d r5 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_SUNSHINE
            goto L_0x0013
        L_0x002f:
            com.yeelight.yeelib.c.i.e$d r5 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR_HSV
            goto L_0x0013
        L_0x0032:
            r4 = 0
            if (r18 == 0) goto L_0x0049
            com.yeelight.yeelib.c.i.e r5 = r11.mo23408d0()
            long r6 = r18.longValue()
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0045
            r6 = 1
            goto L_0x0046
        L_0x0045:
            r6 = 0
        L_0x0046:
            r5.mo27715t0(r6)
        L_0x0049:
            if (r25 == 0) goto L_0x0056
            com.yeelight.yeelib.c.i.e r5 = r11.mo23408d0()
            int r6 = r25.intValue()
            r5.mo27644I0(r6)
        L_0x0056:
            if (r20 == 0) goto L_0x0063
            com.yeelight.yeelib.c.i.e r5 = r11.mo23408d0()
            int r6 = r20.intValue()
            r5.mo27699l0(r6)
        L_0x0063:
            if (r13 == 0) goto L_0x0070
            com.yeelight.yeelib.c.i.e r5 = r11.mo23408d0()
            long r6 = r13.longValue()
            r5.mo27697k0(r6)
        L_0x0070:
            if (r14 == 0) goto L_0x007d
            com.yeelight.yeelib.c.i.e r5 = r11.mo23408d0()
            int r6 = r14.intValue()
            r5.mo27707p0(r6)
        L_0x007d:
            if (r15 == 0) goto L_0x008a
            com.yeelight.yeelib.c.i.e r5 = r11.mo23408d0()
            int r6 = r15.intValue()
            r5.mo27658P0(r6)
        L_0x008a:
            if (r0 == 0) goto L_0x009a
            com.yeelight.yeelib.c.i.e r5 = r11.mo23408d0()
            com.yeelight.yeelib.device.xiaomi.Lamp10Service$h1 r6 = com.yeelight.yeelib.device.xiaomi.Lamp10Service.C8868h1.on
            if (r0 != r6) goto L_0x0096
            r0 = 1
            goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            r5.mo27648K0(r0)
        L_0x009a:
            if (r16 == 0) goto L_0x00a7
            com.yeelight.yeelib.c.i.e r0 = r11.mo23408d0()
            long r5 = r16.longValue()
            r0.mo27703n0(r5)
        L_0x00a7:
            if (r17 == 0) goto L_0x00b4
            com.yeelight.yeelib.c.i.e r0 = r11.mo23408d0()
            long r5 = r17.longValue()
            r0.mo27705o0(r5)
        L_0x00b4:
            if (r21 == 0) goto L_0x00e4
            com.yeelight.yeelib.c.i.e r0 = r11.mo23408d0()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.mo27710r(r5)
            if (r0 != 0) goto L_0x00d9
            com.yeelight.yeelib.c.i.e r0 = r11.mo23408d0()
            com.yeelight.yeelib.c.n.e r5 = new com.yeelight.yeelib.c.n.e
            int r6 = r21.intValue()
            int r7 = r21.intValue()
            r5.<init>(r6, r7)
            r0.mo27676a(r5)
            goto L_0x00e4
        L_0x00d9:
            com.yeelight.yeelib.c.i.e r0 = r11.mo23408d0()
            int r5 = r21.intValue()
            r0.mo27670V0(r5)
        L_0x00e4:
            com.yeelight.yeelib.c.i.e r0 = r11.mo23408d0()
            r5 = 1
            if (r22 == 0) goto L_0x00f6
            long r7 = r22.longValue()
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x00f6
            r7 = 1
            goto L_0x00f7
        L_0x00f6:
            r7 = 0
        L_0x00f7:
            r0.mo27652M0(r7)
            com.yeelight.yeelib.c.i.e r0 = r11.mo23408d0()
            if (r24 == 0) goto L_0x010a
            long r7 = r24.longValue()
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x010a
            r7 = 1
            goto L_0x010b
        L_0x010a:
            r7 = 0
        L_0x010b:
            r0.mo27682d(r7)
            com.yeelight.yeelib.c.i.e r0 = r11.mo23408d0()
            if (r26 == 0) goto L_0x011e
            long r7 = r26.longValue()
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x011e
            r5 = 1
            goto L_0x011f
        L_0x011e:
            r5 = 0
        L_0x011f:
            r0.mo27692i(r5)
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x0133
            com.yeelight.yeelib.c.i.e r0 = r11.mo23408d0()
            com.yeelight.yeelib.g.a r5 = com.yeelight.yeelib.p153g.C9827a.m23894b(r23)
            r0.mo27713s0(r5)
        L_0x0133:
            java.lang.String r0 = ","
            if (r1 == 0) goto L_0x014d
            java.lang.String[] r1 = r1.split(r0)
            int r5 = r1.length
            if (r5 == 0) goto L_0x014d
            com.yeelight.yeelib.c.i.e r5 = r11.mo23408d0()
            r1 = r1[r4]
            java.lang.String r6 = "1"
            boolean r1 = r6.equals(r1)
            r5.mo27694j(r1)
        L_0x014d:
            java.lang.String r1 = "\\|"
            r5 = r28
            java.lang.String[] r1 = r5.split(r1)
            int r5 = r1.length
            r6 = 4
            if (r5 != r6) goto L_0x01d2
            r5 = r1[r4]
            java.lang.String r6 = "disable"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x016b
            com.yeelight.yeelib.c.i.e r5 = r11.mo23408d0()
            r5.mo27640G0(r4)
            goto L_0x017c
        L_0x016b:
            r4 = r1[r4]
            java.lang.String r5 = "enable"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x017c
            com.yeelight.yeelib.c.i.e r4 = r11.mo23408d0()
            r4.mo27640G0(r3)
        L_0x017c:
            com.yeelight.yeelib.c.i.e r4 = r11.mo23408d0()
            r3 = r1[r3]
            r4.mo27638F0(r3)
            com.yeelight.yeelib.c.i.e r3 = r11.mo23408d0()
            r2 = r1[r2]
            r3.mo27636E0(r2)
            com.yeelight.yeelib.c.i.e r2 = r11.mo23408d0()
            r3 = 3
            r1 = r1[r3]
            int r1 = java.lang.Integer.parseInt(r1)
            r2.mo27634D0(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "start = "
            r1.append(r2)
            com.yeelight.yeelib.c.i.e r2 = r11.mo23408d0()
            java.lang.String r2 = r2.mo27633D()
            r1.append(r2)
            r1.append(r0)
            com.yeelight.yeelib.c.i.e r0 = r11.mo23408d0()
            java.lang.String r0 = r0.mo27631C()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            com.yeelight.yeelib.c.i.e r0 = r11.mo23408d0()
            int r0 = r0.mo27629B()
            r1.append(r0)
            r1.toString()
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6513f0.m19659Z1(com.yeelight.yeelib.device.xiaomi.Lamp10Service$h1, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String):void");
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6515a0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo27557C1() {
        try {
            mo27560F1().disableMusic(0L, new C6538t(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo27559E1(String str, int i) {
        try {
            mo27560F1().enableMusic(1L, str, Long.valueOf((long) i), new C6537s(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_lamp10_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_lamp10_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6542x();
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
            mo27560F1().sendCmd(Lamp10Service.C8881n0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6535q(z));
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
            mo27560F1().sendCmd(Lamp10Service.C8881n0.cfg_init_power, String.valueOf(i), new C6536r(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Lamp10Service.C8881n0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6527i(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_color) : super.mo23397U();
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28228a2(this.f13654A, this.f13655B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13656z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13653G, "Invalid handler!");
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
    public Lamp10Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightLamp10Device) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo28228a2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Lamp10Service.C8871i1)) {
            C4308b.m12139r(f13653G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Lamp10Service.C8871i1) obj2);
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
            mo27560F1().setPower(Lamp10Service.C8868h1.off, new C6544z());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6530l());
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
            Lamp10Service Y1 = mo27560F1();
            Lamp10Service.C8881n0 n0Var = Lamp10Service.C8881n0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            Y1.sendCmd(n0Var, sb.toString(), new C6539u(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: h1 */
    public void mo23432h1(boolean z) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(z ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
            sb.append(",10");
            mo27560F1().sendCmd(Lamp10Service.C8881n0.cfg_indicator, sb.toString(), new C6541w(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(Lamp10Service.C8868h1.on, new C6540v());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        boolean z = true;
        if (super.mo23336m1(i)) {
            return true;
        }
        if (mo27560F1() == null) {
            String str = f13653G;
            StringBuilder sb = new StringBuilder();
            sb.append("AbstractService is null! Device: ");
            sb.append(mo23372G());
            sb.append(", mi device is null? ");
            if (mo23393S() != null) {
                z = false;
            }
            sb.append(z);
            C4310h.m12146b(new C4308b.C4309a(str, sb.toString()));
            return false;
        }
        try {
            mo27560F1().openWithMode(Lamp10Service.C8868h1.on, Lamp10Service.C8883o0.smooth, 500L, Long.valueOf((long) i), new C6531m(i));
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
            mo27560F1().setBright(Long.valueOf(j), Lamp10Service.C8883o0.smooth, 500L, new C6517b0(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        int i2 = i & ViewCompat.MEASURED_SIZE_MASK;
        if (super.mo23341q1(i2)) {
            return true;
        }
        try {
            mo27560F1().setRgb(Long.valueOf((long) i2), Lamp10Service.C8883o0.smooth, 500L, new C6521d0(i2));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        if (i < 50) {
            i = 50;
        }
        if (i > 3600000) {
            i = 3600000;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(i);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(1);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(iArr[i3] & ViewCompat.MEASURED_SIZE_MASK);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(i2);
        }
        try {
            mo27560F1().start_cf(0L, 0L, sb.toString(), new C6523e0(iArr, i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        if (super.mo23345s1(i)) {
            return true;
        }
        try {
            mo27560F1().setCt(Long.valueOf((long) i), Lamp10Service.C8883o0.smooth, 500L, new C6519c0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6526h(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6528j(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f13656z);
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
            if (jSONArray.length() != 17) {
                C4308b.m12139r("BATCH_RPC", "ColorDevice, Invalid length of batch rpc result: " + str2);
            }
            m19659Z1(Lamp10Service.C8868h1.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)), jSONArray.getString(11), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), Long.valueOf(jSONArray.getLong(14)), jSONArray.getString(15), jSONArray.getString(16));
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
                mo27560F1().getProperties(new C6529k());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        boolean z = true;
        if (super.mo23355x1(yVar)) {
            return true;
        }
        if (mo27560F1() == null) {
            String str = f13653G;
            StringBuilder sb = new StringBuilder();
            sb.append("AbstractService is null! Device: ");
            sb.append(mo23372G());
            sb.append(", mi device is null? ");
            if (mo23393S() != null) {
                z = false;
            }
            sb.append(z);
            C4310h.m12146b(new C4308b.C4309a(str, sb.toString()));
            return false;
        } else if (yVar.mo31890v()) {
            try {
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6514a(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6516b(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6518c(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6520d(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31853B()) {
            try {
                mo27560F1().setScene("color", Long.valueOf((long) (yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) yVar.mo31874f()), new C6522e(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31891w()) {
            try {
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31879k()), Long.valueOf((long) yVar.mo31880l()), yVar.mo31882n(), new C6524f(yVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C6525g(yVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str2 = f13653G;
            C4308b.m12139r(str2, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("Temperature").getInternalName(), mo27560F1().getService().getProperty("Hue").getInternalName(), mo27560F1().getService().getProperty("Sat").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("ColorMode").getInternalName(), mo27560F1().getService().getProperty("Rgb").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("MusicEnable").getInternalName(), mo27560F1().getService().getProperty(Lamp10Service.PROPERTY_IndicatorEnable).getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName()};
    }
}
