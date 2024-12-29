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
import com.yeelight.yeelib.device.models.C7622g;
import com.yeelight.yeelib.device.models.C7632k;
import com.yeelight.yeelib.device.xiaomi.Stripe2Service;
import com.yeelight.yeelib.device.xiaomi.YeelightStripe2Device;
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
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.c.m.f1 */
public class C6545f1 extends C6006h {

    /* renamed from: G */
    public static final String f13703G = C7403w0.class.getSimpleName();

    /* renamed from: A */
    CompletionHandler f13704A = new C6563p(this);

    /* renamed from: B */
    Stripe2Service.C9457c1 f13705B = new C6564q();

    /* renamed from: z */
    CompletionHandler f13706z = new C6562o(this);

    /* renamed from: com.yeelight.yeelib.c.m.f1$a */
    class C6546a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13707a;

        C6546a(C9856y yVar) {
            this.f13707a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27654N0(this.f13707a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$a0 */
    class C6547a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f13709a;

        /* renamed from: b */
        final /* synthetic */ int f13710b;

        C6547a0(int[] iArr, int i) {
            this.f13709a = iArr;
            this.f13710b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f13709a) {
                arrayList.add(new C7556g.C7557a(aVar, this.f13710b));
            }
            C6545f1.this.mo23408d0().mo27701m0(arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$b */
    class C6548b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13712a;

        C6548b(C9856y yVar) {
            this.f13712a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27654N0(this.f13712a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$b0 */
    class C6549b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13714a;

        C6549b0(C9856y yVar) {
            this.f13714a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27654N0(this.f13714a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$c */
    class C6550c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13716a;

        C6550c(C9856y yVar) {
            this.f13716a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27654N0(this.f13716a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$d */
    class C6551d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13718a;

        C6551d(C9856y yVar) {
            this.f13718a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27654N0(this.f13718a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$e */
    class C6552e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13720a;

        C6552e(C9856y yVar) {
            this.f13720a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27654N0(this.f13720a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$f */
    class C6553f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13722a;

        C6553f(boolean z) {
            this.f13722a = z;
        }

        public void onFailed(int i, String str) {
            "setLedIndicatorEnable --> onFailed: " + str;
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27721w0(this.f13722a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$g */
    class C6554g implements CompletionHandler {
        C6554g(C6545f1 f1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$h */
    class C6555h implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13724a;

        C6555h(boolean z) {
            this.f13724a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27652M0(this.f13724a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$i */
    class C6556i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13726a;

        C6556i(boolean z) {
            this.f13726a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27682d(this.f13726a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$j */
    class C6557j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13728a;

        C6557j(int i) {
            this.f13728a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27644I0(this.f13728a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$k */
    class C6558k implements Stripe2Service.C9495v0 {
        C6558k() {
        }

        /* renamed from: a */
        public void mo28249a(Stripe2Service.C9454b1 b1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, Long l11, Long l12) {
            Long l13 = l11;
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(b1Var != null ? b1Var.name() : "null");
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rgb: ");
            Long l14 = l6;
            sb2.append(l14);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bright: ");
            Long l15 = l;
            sb3.append(l15);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("mode: ");
            Long l16 = l5;
            sb4.append(l16);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("flowing: ");
            Long l17 = l4;
            sb5.append(l17);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("hue: ");
            Long l18 = l2;
            sb6.append(l18);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("sat: ");
            Long l19 = l3;
            sb7.append(l19);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("delayoff: ");
            Long l20 = l7;
            sb8.append(l20);
            sb8.toString();
            "musicEnable: " + l13;
            StringBuilder sb9 = new StringBuilder();
            sb9.append("lanMode: ");
            Long l21 = l9;
            sb9.append(l21);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("onFromPower: ");
            Long l22 = l10;
            sb10.append(l22);
            sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("saveState: ");
            Long l23 = l8;
            sb11.append(l23);
            sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append("flowParams: ");
            String str2 = str;
            sb12.append(str2);
            sb12.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append("indicatorOn: ");
            Long l24 = l12;
            sb13.append(l24);
            sb13.toString();
            "music_mode: " + l13;
            C6545f1.this.m19720Z1(b1Var, l15, l18, l19, l17, l16, l14, l20, l23, str2, l21, l22, l11, l24);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$l */
    class C6559l implements CompletionHandler {
        C6559l(C6545f1 f1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$m */
    class C6560m implements CompletionHandler {
        C6560m() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$n */
    class C6561n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13732a;

        C6561n(int i) {
            this.f13732a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27648K0(true);
            C6545f1 f1Var = C6545f1.this;
            f1Var.mo23352w1(f1Var.mo23433j1(this.f13732a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$o */
    class C6562o implements CompletionHandler {
        C6562o(C6545f1 f1Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$p */
    class C6563p implements CompletionHandler {
        C6563p(C6545f1 f1Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$q */
    class C6564q implements Stripe2Service.C9457c1 {
        C6564q() {
        }

        /* renamed from: a */
        public void mo28251a(Long l) {
            "onBrightChanged: " + l;
            C6545f1.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28252b(Long l) {
            "onDelayOffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6545f1.this.mo23408d0().mo27710r(2) == null) {
                C6545f1.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6545f1.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28253c(Long l) {
            "onFlowingChanged: " + l;
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            C6024e d0 = C6545f1.this.mo23408d0();
            if (i != 0) {
                d0.mo27630B0(C6024e.C6028d.DEVICE_MODE_FLOW);
            } else if (d0.mo27726z() == C6024e.C6028d.DEVICE_MODE_FLOW) {
                ((C7562l) C6545f1.this.mo23408d0()).mo28967Z0();
            }
            C6545f1.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28254d(Long l) {
            "onSaveStateChanged: " + l;
            C6545f1.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28255e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6545f1.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28256f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6545f1.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28257g(Long l) {
            "onLanModeChanged: " + l;
            C6545f1.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: i */
        public void mo28258i(Long l) {
            "onIndicatorOnChanged = " + l;
            C6545f1.this.mo23408d0().mo27721w0(l.longValue() == 1);
        }

        /* renamed from: j */
        public void mo28259j(Long l) {
            "onRgbChanged: " + l;
            C6545f1.this.mo23408d0().mo27699l0(l.intValue());
        }

        /* renamed from: k */
        public void mo28260k(Long l) {
            C6545f1.this.mo23408d0().mo27705o0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo28261l(Long l) {
            C6024e d0;
            C6024e.C6028d dVar;
            "onColorModeChanged: " + l;
            if (l.longValue() == 1) {
                d0 = C6545f1.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C6545f1.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C6545f1.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo27630B0(dVar);
        }

        /* renamed from: m */
        public void mo28262m(Stripe2Service.C9454b1 b1Var) {
            "onPowerChanged: " + b1Var.name();
            int i = C6568u.f13736a[b1Var.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    z = false;
                    C6545f1.this.mo23408d0().mo27648K0(false);
                } else {
                    return;
                }
            }
            C6545f1.this.mo23408d0().mo27648K0(z);
        }

        /* renamed from: n */
        public void mo28263n(Long l) {
            C6545f1.this.mo23408d0().mo27703n0((long) l.intValue());
        }

        /* renamed from: o */
        public void mo28264o(Long l) {
            "onMusicEnableChanged = " + l;
            C6545f1.this.mo23408d0().mo27692i(l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$r */
    class C6565r implements CompletionHandler {
        C6565r(C6545f1 f1Var) {
        }

        public void onFailed(int i, String str) {
            "enableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$s */
    class C6566s implements CompletionHandler {
        C6566s(C6545f1 f1Var) {
        }

        public void onFailed(int i, String str) {
            "disableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$t */
    class C6567t implements C6006h.C6016j {
        C6567t() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6545f1.this.f13705B.mo28251a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
            C6545f1.this.f13705B.mo28259j(l);
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
            C6545f1.this.f13705B.mo28261l(l);
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C6545f1.this.f13705B.mo28262m(Stripe2Service.C9454b1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$u */
    static /* synthetic */ class C6568u {

        /* renamed from: a */
        static final /* synthetic */ int[] f13736a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$b1[] r0 = com.yeelight.yeelib.device.xiaomi.Stripe2Service.C9454b1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13736a = r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$b1 r1 = com.yeelight.yeelib.device.xiaomi.Stripe2Service.C9454b1.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13736a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$b1 r1 = com.yeelight.yeelib.device.xiaomi.Stripe2Service.C9454b1.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6545f1.C6568u.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$v */
    class C6569v implements CompletionHandler {
        C6569v() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$w */
    class C6570w implements CompletionHandler {
        C6570w() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$x */
    class C6571x implements CompletionHandler {
        C6571x() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$y */
    class C6572y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f13740a;

        C6572y(long j) {
            this.f13740a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27697k0(this.f13740a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f1$z */
    class C6573z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13742a;

        C6573z(int i) {
            this.f13742a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6545f1.this.mo23408d0().mo27699l0(this.f13742a);
        }
    }

    public C6545f1(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        C7565b bVar = C7565b.DEVICE_EVENT_OPEN;
        C7565b bVar2 = C7565b.DEVICE_EVENT_CLOSE;
        C7565b bVar3 = C7565b.DEVICE_EVENT_BRIGHT_CHANGE;
        C7563a aVar = C7563a.ON;
        C7563a aVar2 = C7563a.OFF;
        C7563a aVar3 = C7563a.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m19720Z1(com.yeelight.yeelib.device.xiaomi.Stripe2Service.C9454b1 r11, java.lang.Long r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.String r20, java.lang.Long r21, java.lang.Long r22, java.lang.Long r23, java.lang.Long r24) {
        /*
            r10 = this;
            r0 = r11
            r1 = 2
            r2 = 1
            if (r15 == 0) goto L_0x0015
            int r3 = r15.intValue()
            if (r3 != r2) goto L_0x0015
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_FLOW
        L_0x0011:
            r3.mo27630B0(r4)
            goto L_0x0030
        L_0x0015:
            if (r16 == 0) goto L_0x0030
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            int r4 = r16.intValue()
            if (r4 != r2) goto L_0x0024
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR
            goto L_0x0011
        L_0x0024:
            int r4 = r16.intValue()
            if (r4 != r1) goto L_0x002d
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_SUNSHINE
            goto L_0x0011
        L_0x002d:
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR_HSV
            goto L_0x0011
        L_0x0030:
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            long r4 = r15.longValue()
            r6 = 0
            r8 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0041
            r4 = 1
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            r3.mo27715t0(r4)
            if (r17 == 0) goto L_0x0052
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            int r4 = r17.intValue()
            r3.mo27699l0(r4)
        L_0x0052:
            if (r12 == 0) goto L_0x005f
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            long r4 = r12.longValue()
            r3.mo27697k0(r4)
        L_0x005f:
            if (r0 == 0) goto L_0x006f
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            com.yeelight.yeelib.device.xiaomi.Stripe2Service$b1 r4 = com.yeelight.yeelib.device.xiaomi.Stripe2Service.C9454b1.on
            if (r0 != r4) goto L_0x006b
            r0 = 1
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            r3.mo27648K0(r0)
        L_0x006f:
            if (r13 == 0) goto L_0x007c
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            long r3 = r13.longValue()
            r0.mo27703n0(r3)
        L_0x007c:
            if (r14 == 0) goto L_0x0089
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            long r3 = r14.longValue()
            r0.mo27705o0(r3)
        L_0x0089:
            if (r22 == 0) goto L_0x0096
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            int r3 = r22.intValue()
            r0.mo27644I0(r3)
        L_0x0096:
            if (r18 == 0) goto L_0x00c6
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.mo27710r(r1)
            if (r0 != 0) goto L_0x00bb
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            com.yeelight.yeelib.c.n.e r1 = new com.yeelight.yeelib.c.n.e
            int r3 = r18.intValue()
            int r4 = r18.intValue()
            r1.<init>(r3, r4)
            r0.mo27676a(r1)
            goto L_0x00c6
        L_0x00bb:
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            int r1 = r18.intValue()
            r0.mo27670V0(r1)
        L_0x00c6:
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            r3 = 1
            if (r19 == 0) goto L_0x00d8
            long r5 = r19.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00d8
            r1 = 1
            goto L_0x00d9
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            r0.mo27652M0(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r21 == 0) goto L_0x00ec
            long r5 = r21.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00ec
            r1 = 1
            goto L_0x00ed
        L_0x00ec:
            r1 = 0
        L_0x00ed:
            r0.mo27682d(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r23 == 0) goto L_0x0100
            long r5 = r23.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0100
            r1 = 1
            goto L_0x0101
        L_0x0100:
            r1 = 0
        L_0x0101:
            r0.mo27692i(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r24 == 0) goto L_0x0113
            long r5 = r24.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r2 = 0
        L_0x0114:
            r0.mo27721w0(r2)
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x0128
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            com.yeelight.yeelib.g.a r1 = com.yeelight.yeelib.p153g.C9827a.m23894b(r20)
            r0.mo27713s0(r1)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6545f1.m19720Z1(com.yeelight.yeelib.device.xiaomi.Stripe2Service$b1, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long):void");
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6571x());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo27557C1() {
        try {
            mo27560F1().disableMusic(0L, new C6566s(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo27559E1(String str, int i) {
        try {
            mo27560F1().enableMusic(1L, str, Long.valueOf((long) i), new C6565r(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_pitaya_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_pitaya_big;
    }

    /* renamed from: J0 */
    public void mo23378J0(C7622g gVar) {
        super.mo23378J0(gVar);
        mo23388P0(C7632k.m22547h(this.f7238a, this));
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6567t();
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
            mo27560F1().sendCmd(Stripe2Service.C9471j0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6556i(z));
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
            mo27560F1().sendCmd(Stripe2Service.C9471j0.cfg_init_power, String.valueOf(i), new C6557j(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Stripe2Service.C9471j0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6555h(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_strip) : super.mo23397U();
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28248a2(this.f13704A, this.f13705B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13706z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13703G, "Invalid handler!");
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
    public Stripe2Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightStripe2Device) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo28248a2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Stripe2Service.C9457c1)) {
            C4308b.m12139r(f13703G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Stripe2Service.C9457c1) obj2);
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
            mo27560F1().setPower(Stripe2Service.C9454b1.off, new C6570w());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6560m());
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
            mo27560F1().setPower(Stripe2Service.C9454b1.on, new C6569v());
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
            mo27560F1().openWithMode(Stripe2Service.C9454b1.on, Stripe2Service.C9473k0.smooth, 500L, Long.valueOf((long) i), new C6561n(i));
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
            mo27560F1().setBright(Long.valueOf(j), Stripe2Service.C9473k0.smooth, 500L, new C6572y(j));
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
            mo27560F1().setRgb(Long.valueOf((long) i2), Stripe2Service.C9473k0.smooth, 500L, new C6573z(i2));
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
            mo27560F1().start_cf(0L, 0L, sb.toString(), new C6547a0(iArr, i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6554g(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6559l(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f13706z);
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        try {
            mo27560F1().setLEDIndicator(z ? Stripe2Service.C9451a1.on : Stripe2Service.C9451a1.off, new C6553f(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        String str2 = str;
        try {
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() != 14) {
                C4308b.m12139r("BATCH_RPC", "StripDevice, Invalid length of batch rpc result: " + str2);
            }
            Stripe2Service.C9454b1 valueOf = Stripe2Service.C9454b1.valueOf(jSONArray.getString(0));
            Long valueOf2 = Long.valueOf(jSONArray.getLong(1));
            Long valueOf3 = Long.valueOf(jSONArray.getLong(2));
            Long valueOf4 = Long.valueOf(jSONArray.getLong(3));
            Long valueOf5 = Long.valueOf(jSONArray.getLong(4));
            Long valueOf6 = Long.valueOf(jSONArray.getLong(5));
            Long valueOf7 = Long.valueOf(jSONArray.getLong(6));
            Long valueOf8 = Long.valueOf(jSONArray.getLong(7));
            Long valueOf9 = Long.valueOf(jSONArray.getLong(8));
            String string = jSONArray.getString(9);
            Long valueOf10 = Long.valueOf(jSONArray.getLong(10));
            long j = 0L;
            if (!jSONArray.getString(11).isEmpty()) {
                j = Long.valueOf(jSONArray.getLong(11));
            }
            m19720Z1(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, string, valueOf10, j, Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)));
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
        if (this.f7251n.getOwnership() != Device.Ownership.MINE && this.f7251n.getOwnership() != Device.Ownership.OTHERS) {
            return false;
        }
        try {
            mo27560F1().getProperties(new C6558k());
            return false;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        if (super.mo23355x1(yVar)) {
            return true;
        }
        if (yVar.mo31890v()) {
            try {
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6549b0(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6546a(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6548b(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6550c(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31853B()) {
            try {
                mo27560F1().setScene("color", Long.valueOf((long) (yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) yVar.mo31874f()), new C6551d(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31891w()) {
            try {
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31879k()), Long.valueOf((long) yVar.mo31880l()), yVar.mo31882n(), new C6552e(yVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str = f13703G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Hue").getInternalName(), mo27560F1().getService().getProperty("Sat").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("ColorMode").getInternalName(), mo27560F1().getService().getProperty("Rgb").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("MusicEnable").getInternalName(), mo27560F1().getService().getProperty("IndicatorOn").getInternalName()};
    }
}
