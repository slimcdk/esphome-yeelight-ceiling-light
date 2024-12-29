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
import com.yeelight.yeelib.device.xiaomi.Color4Service;
import com.yeelight.yeelib.device.xiaomi.YeelightColor4Device;
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

/* renamed from: com.yeelight.yeelib.c.m.t */
public class C7260t extends C6006h {

    /* renamed from: G */
    public static final String f14794G = "t";

    /* renamed from: A */
    CompletionHandler f14795A = new C7277n(this);

    /* renamed from: B */
    Color4Service.C8606f1 f14796B = new C7278o();

    /* renamed from: z */
    CompletionHandler f14797z = new C7276m(this);

    /* renamed from: com.yeelight.yeelib.c.m.t$a */
    class C7261a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14798a;

        C7261a(C9856y yVar) {
            this.f14798a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27654N0(this.f14798a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$a0 */
    class C7262a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14800a;

        C7262a0(int i) {
            this.f14800a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27707p0(this.f14800a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$b */
    class C7263b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14802a;

        C7263b(C9856y yVar) {
            this.f14802a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27654N0(this.f14802a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$b0 */
    class C7264b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14804a;

        C7264b0(int i) {
            this.f14804a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27699l0(this.f14804a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$c */
    class C7265c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14806a;

        C7265c(C9856y yVar) {
            this.f14806a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27654N0(this.f14806a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$c0 */
    class C7266c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f14808a;

        /* renamed from: b */
        final /* synthetic */ int f14809b;

        C7266c0(int[] iArr, int i) {
            this.f14808a = iArr;
            this.f14809b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f14808a) {
                arrayList.add(new C7556g.C7557a(aVar, this.f14809b));
            }
            C7260t.this.mo23408d0().mo27701m0(arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$d */
    class C7267d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14811a;

        C7267d(C9856y yVar) {
            this.f14811a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27654N0(this.f14811a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$e */
    class C7268e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14813a;

        C7268e(C9856y yVar) {
            this.f14813a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27654N0(this.f14813a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$f */
    class C7269f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14815a;

        C7269f(C9856y yVar) {
            this.f14815a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27654N0(this.f14815a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$g */
    class C7270g implements CompletionHandler {
        C7270g(C7260t tVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$h */
    class C7271h implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14817a;

        C7271h(boolean z) {
            this.f14817a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27652M0(this.f14817a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$i */
    class C7272i implements CompletionHandler {
        C7272i(C7260t tVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$j */
    class C7273j implements CompletionHandler {
        C7273j() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$k */
    class C7274k implements Color4Service.C8642x0 {
        C7274k() {
        }

        /* renamed from: a */
        public void mo28687a(Color4Service.C8603e1 e1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13, Long l14) {
            "power: " + e1Var.name();
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
            "smartSwitch: " + l14;
            C7260t.this.m21511Z1(e1Var, l, l2, l3, l4, l5, l6, l7, l8, l9, l10, str, l11, l12, l13, l14);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$l */
    class C7275l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14821a;

        C7275l(int i) {
            this.f14821a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27648K0(true);
            C7260t tVar = C7260t.this;
            tVar.mo23352w1(tVar.mo23433j1(this.f14821a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$m */
    class C7276m implements CompletionHandler {
        C7276m(C7260t tVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$n */
    class C7277n implements CompletionHandler {
        C7277n(C7260t tVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$o */
    class C7278o implements Color4Service.C8606f1 {
        C7278o() {
        }

        /* renamed from: a */
        public void mo28689a(Long l) {
            "onBrightChanged: " + l;
            C7260t.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28690b(Long l) {
            "onDelayOffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C7260t.this.mo23408d0().mo27710r(2) == null) {
                C7260t.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C7260t.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28691c(Long l) {
            "onFlowingChanged: " + l;
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            C6024e d0 = C7260t.this.mo23408d0();
            if (i != 0) {
                d0.mo27630B0(C6024e.C6028d.DEVICE_MODE_FLOW);
            } else if (d0.mo27726z() == C6024e.C6028d.DEVICE_MODE_FLOW) {
                ((C7562l) C7260t.this.mo23408d0()).mo28967Z0();
            }
            C7260t.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28692d(Long l) {
            "onSaveStateChanged: " + l;
            C7260t.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28693e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C7260t.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28694f(Long l) {
            "onOnFromPowerChanged: " + l;
            C7260t.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28695g(Long l) {
            "onLanModeChanged: " + l;
            C7260t.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28696h(Long l) {
            "onCtScaleChanged: " + l;
            C7260t.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28697i(Color4Service.C8603e1 e1Var) {
            C6024e eVar;
            "onPowerChanged: " + e1Var.name();
            int i = C7286w.f14832a[e1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C7260t.this.mo23408d0();
            } else if (i == 2) {
                eVar = C7260t.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: j */
        public void mo28698j(Long l) {
            "onRgbChanged: " + l;
            C7260t.this.mo23408d0().mo27699l0(l.intValue());
        }

        /* renamed from: k */
        public void mo28699k(Long l) {
            C7260t.this.mo23408d0().mo27705o0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo28700l(Long l) {
            C6024e d0;
            C6024e.C6028d dVar;
            "onColorModeChanged: " + l;
            if (l.longValue() == 1) {
                d0 = C7260t.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C7260t.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C7260t.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo27630B0(dVar);
        }

        /* renamed from: n */
        public void mo28701n(Long l) {
            C7260t.this.mo23408d0().mo27703n0((long) l.intValue());
        }

        /* renamed from: o */
        public void mo28702o(Long l) {
            "onMusicEnableChanged = " + l;
            C7260t.this.mo23408d0().mo27692i(l.longValue() == 1);
        }

        /* renamed from: p */
        public void mo28703p(Long l) {
            "onSmartSwitchChanged = " + l;
            C7260t.this.mo23408d0().mo27696k(l != null && l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$p */
    class C7279p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14824a;

        C7279p(boolean z) {
            this.f14824a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27682d(this.f14824a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$q */
    class C7280q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14826a;

        C7280q(int i) {
            this.f14826a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27644I0(this.f14826a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$r */
    class C7281r implements CompletionHandler {
        C7281r(C7260t tVar) {
        }

        public void onFailed(int i, String str) {
            "enableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$s */
    class C7282s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14828a;

        C7282s(boolean z) {
            this.f14828a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27696k(this.f14828a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$t */
    class C7283t implements CompletionHandler {
        C7283t(C7260t tVar) {
        }

        public void onFailed(int i, String str) {
            "disableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$u */
    class C7284u implements C6006h.C6016j {
        C7284u() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C7260t.this.f14796B.mo28689a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C7260t.this.f14796B.mo28696h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
            C7260t.this.f14796B.mo28698j(l);
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
            C7260t.this.f14796B.mo28700l(l);
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C7260t.this.f14796B.mo28697i(Color4Service.C8603e1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$v */
    class C7285v implements CompletionHandler {
        C7285v() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$w */
    static /* synthetic */ class C7286w {

        /* renamed from: a */
        static final /* synthetic */ int[] f14832a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Color4Service$e1[] r0 = com.yeelight.yeelib.device.xiaomi.Color4Service.C8603e1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14832a = r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$e1 r1 = com.yeelight.yeelib.device.xiaomi.Color4Service.C8603e1.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14832a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Color4Service$e1 r1 = com.yeelight.yeelib.device.xiaomi.Color4Service.C8603e1.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7260t.C7286w.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$x */
    class C7287x implements CompletionHandler {
        C7287x() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$y */
    class C7288y implements CompletionHandler {
        C7288y() {
        }

        public void onFailed(int i, String str) {
            String.format("Color4Device.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.t$z */
    class C7289z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14835a;

        C7289z(long j) {
            this.f14835a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7260t.this.mo23408d0().mo27697k0(this.f14835a);
        }
    }

    public C7260t(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        C7565b bVar = C7565b.DEVICE_EVENT_OPEN;
        C7565b bVar2 = C7565b.DEVICE_EVENT_CLOSE;
        C7565b bVar3 = C7565b.DEVICE_EVENT_BRIGHT_CHANGE;
        C7563a aVar = C7563a.ON;
        C7563a aVar2 = C7563a.OFF;
        C7563a aVar3 = C7563a.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m21511Z1(com.yeelight.yeelib.device.xiaomi.Color4Service.C8603e1 r11, java.lang.Long r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.Long r20, java.lang.Long r21, java.lang.String r22, java.lang.Long r23, java.lang.Long r24, java.lang.Long r25, java.lang.Long r26) {
        /*
            r10 = this;
            r0 = r11
            r1 = 2
            r2 = 1
            if (r17 == 0) goto L_0x0015
            int r3 = r17.intValue()
            if (r3 != r2) goto L_0x0015
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_FLOW
        L_0x0011:
            r3.mo27630B0(r4)
            goto L_0x0030
        L_0x0015:
            if (r18 == 0) goto L_0x0030
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            int r4 = r18.intValue()
            if (r4 != r2) goto L_0x0024
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR
            goto L_0x0011
        L_0x0024:
            int r4 = r18.intValue()
            if (r4 != r1) goto L_0x002d
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_SUNSHINE
            goto L_0x0011
        L_0x002d:
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR_HSV
            goto L_0x0011
        L_0x0030:
            r3 = 0
            if (r17 == 0) goto L_0x0047
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            long r5 = r17.longValue()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0043
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            r4.mo27715t0(r5)
        L_0x0047:
            if (r24 == 0) goto L_0x0054
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            int r5 = r24.intValue()
            r4.mo27644I0(r5)
        L_0x0054:
            if (r19 == 0) goto L_0x0061
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            int r5 = r19.intValue()
            r4.mo27699l0(r5)
        L_0x0061:
            if (r12 == 0) goto L_0x006e
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            long r5 = r12.longValue()
            r4.mo27697k0(r5)
        L_0x006e:
            if (r13 == 0) goto L_0x007b
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            int r5 = r13.intValue()
            r4.mo27707p0(r5)
        L_0x007b:
            if (r14 == 0) goto L_0x0088
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            int r5 = r14.intValue()
            r4.mo27658P0(r5)
        L_0x0088:
            if (r0 == 0) goto L_0x0098
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            com.yeelight.yeelib.device.xiaomi.Color4Service$e1 r5 = com.yeelight.yeelib.device.xiaomi.Color4Service.C8603e1.on
            if (r0 != r5) goto L_0x0094
            r0 = 1
            goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            r4.mo27648K0(r0)
        L_0x0098:
            if (r15 == 0) goto L_0x00a5
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            long r4 = r15.longValue()
            r0.mo27703n0(r4)
        L_0x00a5:
            if (r16 == 0) goto L_0x00b2
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            long r4 = r16.longValue()
            r0.mo27705o0(r4)
        L_0x00b2:
            if (r20 == 0) goto L_0x00e2
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.mo27710r(r1)
            if (r0 != 0) goto L_0x00d7
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            com.yeelight.yeelib.c.n.e r1 = new com.yeelight.yeelib.c.n.e
            int r4 = r20.intValue()
            int r5 = r20.intValue()
            r1.<init>(r4, r5)
            r0.mo27676a(r1)
            goto L_0x00e2
        L_0x00d7:
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            int r1 = r20.intValue()
            r0.mo27670V0(r1)
        L_0x00e2:
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            r4 = 1
            if (r21 == 0) goto L_0x00f4
            long r6 = r21.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x00f4
            r1 = 1
            goto L_0x00f5
        L_0x00f4:
            r1 = 0
        L_0x00f5:
            r0.mo27652M0(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r23 == 0) goto L_0x0108
            long r6 = r23.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0108
            r1 = 1
            goto L_0x0109
        L_0x0108:
            r1 = 0
        L_0x0109:
            r0.mo27682d(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r25 == 0) goto L_0x011c
            long r6 = r25.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x011c
            r1 = 1
            goto L_0x011d
        L_0x011c:
            r1 = 0
        L_0x011d:
            r0.mo27692i(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r26 == 0) goto L_0x012f
            long r6 = r26.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            r2 = 0
        L_0x0130:
            r0.mo27696k(r2)
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x0144
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            com.yeelight.yeelib.g.a r1 = com.yeelight.yeelib.p153g.C9827a.m23894b(r22)
            r0.mo27713s0(r1)
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7260t.m21511Z1(com.yeelight.yeelib.device.xiaomi.Color4Service$e1, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long):void");
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C7288y());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo27557C1() {
        try {
            mo27560F1().disableMusic(0L, new C7283t(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo27559E1(String str, int i) {
        try {
            mo27560F1().enableMusic(1L, str, Long.valueOf((long) i), new C7281r(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_lemon_color_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_lemon_color_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C7284u();
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
            mo27560F1().sendCmd(Color4Service.C8618l0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7279p(z));
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
            mo27560F1().sendCmd(Color4Service.C8618l0.cfg_init_power, String.valueOf(i), new C7280q(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Color4Service.C8618l0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7271h(z));
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
        return mo28686a2(this.f14795A, this.f14796B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14797z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14794G, "Invalid handler!");
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
    public Color4Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightColor4Device) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo28686a2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Color4Service.C8606f1)) {
            C4308b.m12139r(f14794G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Color4Service.C8606f1) obj2);
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
            mo27560F1().setPower(Color4Service.C8603e1.off, new C7287x());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C7273j());
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
            mo27560F1().setPower(Color4Service.C8603e1.on, new C7285v());
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
            String str = f14794G;
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
            mo27560F1().openWithMode(Color4Service.C8603e1.on, Color4Service.C8620m0.smooth, 500L, Long.valueOf((long) i), new C7275l(i));
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
            mo27560F1().setBright(Long.valueOf(j), Color4Service.C8620m0.smooth, 500L, new C7289z(j));
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
            mo27560F1().setRgb(Long.valueOf((long) i2), Color4Service.C8620m0.smooth, 500L, new C7264b0(i2));
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
            mo27560F1().start_cf(0L, 0L, sb.toString(), new C7266c0(iArr, i));
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
            mo27560F1().setCt(Long.valueOf((long) i), Color4Service.C8620m0.smooth, 500L, new C7262a0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C7270g(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C7272i(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
        "enableFlexSwitch --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(Color4Service.C8618l0.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7282s(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14797z);
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
            if (jSONArray.length() != 16) {
                C4308b.m12139r("BATCH_RPC", "Color4Device, Invalid length of batch rpc result: " + str2);
            }
            m21511Z1(Color4Service.C8603e1.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)), jSONArray.getString(11), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), Long.valueOf(jSONArray.getLong(14)), Long.valueOf(jSONArray.getLong(15)));
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
                mo27560F1().getProperties(new C7274k());
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
            String str = f14794G;
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7261a(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C7263b(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C7265c(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C7267d(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31853B()) {
            try {
                mo27560F1().setScene("color", Long.valueOf((long) (yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) yVar.mo31874f()), new C7268e(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31891w()) {
            try {
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31879k()), Long.valueOf((long) yVar.mo31880l()), yVar.mo31882n(), new C7269f(yVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str2 = f14794G;
            C4308b.m12139r(str2, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("Temperature").getInternalName(), mo27560F1().getService().getProperty("Hue").getInternalName(), mo27560F1().getService().getProperty("Sat").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("ColorMode").getInternalName(), mo27560F1().getService().getProperty("Rgb").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("MusicEnable").getInternalName(), mo27560F1().getService().getProperty("SmartSwitch").getInternalName()};
    }
}
