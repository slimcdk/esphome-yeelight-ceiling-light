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
import com.yeelight.yeelib.device.xiaomi.StripeService;
import com.yeelight.yeelib.device.xiaomi.YeelightStripeDevice;
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

/* renamed from: com.yeelight.yeelib.c.m.h1 */
public class C6754h1 extends C6006h {

    /* renamed from: G */
    public static final String f14022G = C7403w0.class.getSimpleName();

    /* renamed from: A */
    CompletionHandler f14023A = new C6774q(this);

    /* renamed from: B */
    StripeService.C9618f1 f14024B = new C6775r();

    /* renamed from: z */
    CompletionHandler f14025z = new C6773p(this);

    /* renamed from: com.yeelight.yeelib.c.m.h1$a */
    class C6755a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14026a;

        C6755a(C9856y yVar) {
            this.f14026a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27654N0(this.f14026a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$a0 */
    class C6756a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14028a;

        C6756a0(int i) {
            this.f14028a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27707p0(this.f14028a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$b */
    class C6757b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14030a;

        C6757b(C9856y yVar) {
            this.f14030a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27654N0(this.f14030a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$b0 */
    class C6758b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14032a;

        C6758b0(int i) {
            this.f14032a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27699l0(this.f14032a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$c */
    class C6759c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14034a;

        C6759c(C9856y yVar) {
            this.f14034a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27654N0(this.f14034a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$c0 */
    class C6760c0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f14036a;

        /* renamed from: b */
        final /* synthetic */ int f14037b;

        C6760c0(int[] iArr, int i) {
            this.f14036a = iArr;
            this.f14037b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f14036a) {
                arrayList.add(new C7556g.C7557a(aVar, this.f14037b));
            }
            C6754h1.this.mo23408d0().mo27701m0(arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$d */
    class C6761d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14039a;

        C6761d(C9856y yVar) {
            this.f14039a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27654N0(this.f14039a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$e */
    class C6762e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14041a;

        C6762e(C9856y yVar) {
            this.f14041a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27654N0(this.f14041a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$f */
    class C6763f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14043a;

        C6763f(C9856y yVar) {
            this.f14043a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27654N0(this.f14043a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$g */
    class C6764g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14045a;

        C6764g(boolean z) {
            this.f14045a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27721w0(this.f14045a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$h */
    class C6765h implements CompletionHandler {
        C6765h(C6754h1 h1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$i */
    class C6766i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14047a;

        C6766i(boolean z) {
            this.f14047a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27652M0(this.f14047a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$j */
    class C6767j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14049a;

        C6767j(boolean z) {
            this.f14049a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27682d(this.f14049a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$k */
    class C6768k implements StripeService.C9656y0 {
        C6768k() {
        }

        /* renamed from: a */
        public void mo28374a(StripeService.C9615e1 e1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, String str, Long l10, Long l11, Long l12, Long l13) {
            Long l14 = l12;
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(e1Var != null ? e1Var.name() : "null");
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ct: ");
            Long l15 = l2;
            sb2.append(l15);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("rgb: ");
            Long l16 = l7;
            sb3.append(l16);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("bright: ");
            Long l17 = l;
            sb4.append(l17);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("mode: ");
            Long l18 = l6;
            sb5.append(l18);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("flowing: ");
            Long l19 = l5;
            sb6.append(l19);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("hue: ");
            Long l20 = l3;
            sb7.append(l20);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("sat: ");
            Long l21 = l4;
            sb8.append(l21);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("delayoff: ");
            Long l22 = l8;
            sb9.append(l22);
            sb9.toString();
            "musicEnable: " + l14;
            StringBuilder sb10 = new StringBuilder();
            sb10.append("lanMode: ");
            Long l23 = l10;
            sb10.append(l23);
            sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("onFromPower: ");
            Long l24 = l11;
            sb11.append(l24);
            sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append("saveState: ");
            Long l25 = l9;
            sb12.append(l25);
            sb12.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append("flowParams: ");
            String str2 = str;
            sb13.append(str2);
            sb13.toString();
            StringBuilder sb14 = new StringBuilder();
            sb14.append("indicatorOn: ");
            Long l26 = l13;
            sb14.append(l26);
            sb14.toString();
            "music_mode: " + l14;
            C6754h1.this.m20136Z1(e1Var, l17, l15, l20, l21, l19, l18, l16, l22, l25, str2, l23, l24, l12, l26);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$l */
    class C6769l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14052a;

        C6769l(int i) {
            this.f14052a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27644I0(this.f14052a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$m */
    class C6770m implements CompletionHandler {
        C6770m(C6754h1 h1Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$n */
    class C6771n implements CompletionHandler {
        C6771n() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$o */
    class C6772o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14055a;

        C6772o(int i) {
            this.f14055a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27648K0(true);
            C6754h1 h1Var = C6754h1.this;
            h1Var.mo23352w1(h1Var.mo23433j1(this.f14055a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$p */
    class C6773p implements CompletionHandler {
        C6773p(C6754h1 h1Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$q */
    class C6774q implements CompletionHandler {
        C6774q(C6754h1 h1Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$r */
    class C6775r implements StripeService.C9618f1 {
        C6775r() {
        }

        /* renamed from: a */
        public void mo28376a(Long l) {
            "onBrightChanged: " + l;
            C6754h1.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28377b(Long l) {
            "onDelayOffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6754h1.this.mo23408d0().mo27710r(2) == null) {
                C6754h1.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6754h1.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28378c(Long l) {
            "onFlowingChanged: " + l;
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            C6024e d0 = C6754h1.this.mo23408d0();
            if (i != 0) {
                d0.mo27630B0(C6024e.C6028d.DEVICE_MODE_FLOW);
            } else if (d0.mo27726z() == C6024e.C6028d.DEVICE_MODE_FLOW) {
                ((C7562l) C6754h1.this.mo23408d0()).mo28967Z0();
            }
            C6754h1.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28379d(Long l) {
            "onSaveStateChanged: " + l;
            C6754h1.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28380e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6754h1.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28381f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6754h1.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28382g(Long l) {
            "onLanModeChanged: " + l;
            C6754h1.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28383h(Long l) {
            "onCtScaleChanged: " + l;
            C6754h1.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28384i(Long l) {
            "onIndicatorOnChanged = " + l;
            C6754h1.this.mo23408d0().mo27721w0(l.longValue() == 1);
        }

        /* renamed from: j */
        public void mo28385j(Long l) {
            "onRgbChanged: " + l;
            C6754h1.this.mo23408d0().mo27699l0(l.intValue());
        }

        /* renamed from: k */
        public void mo28386k(Long l) {
            C6754h1.this.mo23408d0().mo27705o0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo28387l(Long l) {
            C6024e d0;
            C6024e.C6028d dVar;
            "onColorModeChanged: " + l;
            if (l.longValue() == 1) {
                d0 = C6754h1.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C6754h1.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C6754h1.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo27630B0(dVar);
        }

        /* renamed from: m */
        public void mo28388m(StripeService.C9615e1 e1Var) {
            "onPowerChanged: " + e1Var.name();
            int i = C6780w.f14060a[e1Var.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    z = false;
                    C6754h1.this.mo23408d0().mo27648K0(false);
                } else {
                    return;
                }
            }
            C6754h1.this.mo23408d0().mo27648K0(z);
        }

        /* renamed from: n */
        public void mo28389n(Long l) {
            C6754h1.this.mo23408d0().mo27703n0((long) l.intValue());
        }

        /* renamed from: o */
        public void mo28390o(Long l) {
            "onMusicEnableChanged = " + l;
            C6754h1.this.mo23408d0().mo27692i(l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$s */
    class C6776s implements CompletionHandler {
        C6776s(C6754h1 h1Var) {
        }

        public void onFailed(int i, String str) {
            "enableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$t */
    class C6777t implements CompletionHandler {
        C6777t(C6754h1 h1Var) {
        }

        public void onFailed(int i, String str) {
            "disableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$u */
    class C6778u implements C6006h.C6016j {
        C6778u() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6754h1.this.f14024B.mo28376a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6754h1.this.f14024B.mo28383h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
            C6754h1.this.f14024B.mo28385j(l);
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
            C6754h1.this.f14024B.mo28387l(l);
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C6754h1.this.f14024B.mo28388m(StripeService.C9615e1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$v */
    class C6779v implements CompletionHandler {
        C6779v() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$w */
    static /* synthetic */ class C6780w {

        /* renamed from: a */
        static final /* synthetic */ int[] f14060a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.StripeService$e1[] r0 = com.yeelight.yeelib.device.xiaomi.StripeService.C9615e1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14060a = r0
                com.yeelight.yeelib.device.xiaomi.StripeService$e1 r1 = com.yeelight.yeelib.device.xiaomi.StripeService.C9615e1.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14060a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.StripeService$e1 r1 = com.yeelight.yeelib.device.xiaomi.StripeService.C9615e1.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6754h1.C6780w.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$x */
    class C6781x implements CompletionHandler {
        C6781x() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$y */
    class C6782y implements CompletionHandler {
        C6782y() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h1$z */
    class C6783z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14063a;

        C6783z(long j) {
            this.f14063a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6754h1.this.mo23408d0().mo27697k0(this.f14063a);
        }
    }

    public C6754h1(String str, String str2, String str3, Device.Ownership ownership) {
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
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m20136Z1(com.yeelight.yeelib.device.xiaomi.StripeService.C9615e1 r11, java.lang.Long r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.Long r20, java.lang.String r21, java.lang.Long r22, java.lang.Long r23, java.lang.Long r24, java.lang.Long r25) {
        /*
            r10 = this;
            r0 = r11
            r1 = 2
            r2 = 1
            if (r16 == 0) goto L_0x0015
            int r3 = r16.intValue()
            if (r3 != r2) goto L_0x0015
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_FLOW
        L_0x0011:
            r3.mo27630B0(r4)
            goto L_0x0030
        L_0x0015:
            if (r17 == 0) goto L_0x0030
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            int r4 = r17.intValue()
            if (r4 != r2) goto L_0x0024
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR
            goto L_0x0011
        L_0x0024:
            int r4 = r17.intValue()
            if (r4 != r1) goto L_0x002d
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_SUNSHINE
            goto L_0x0011
        L_0x002d:
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR_HSV
            goto L_0x0011
        L_0x0030:
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            long r4 = r16.longValue()
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
            if (r18 == 0) goto L_0x0052
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            int r4 = r18.intValue()
            r3.mo27699l0(r4)
        L_0x0052:
            if (r12 == 0) goto L_0x005f
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            long r4 = r12.longValue()
            r3.mo27697k0(r4)
        L_0x005f:
            if (r13 == 0) goto L_0x006c
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            int r4 = r13.intValue()
            r3.mo27707p0(r4)
        L_0x006c:
            if (r0 == 0) goto L_0x007c
            com.yeelight.yeelib.c.i.e r3 = r10.mo23408d0()
            com.yeelight.yeelib.device.xiaomi.StripeService$e1 r4 = com.yeelight.yeelib.device.xiaomi.StripeService.C9615e1.on
            if (r0 != r4) goto L_0x0078
            r0 = 1
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            r3.mo27648K0(r0)
        L_0x007c:
            if (r14 == 0) goto L_0x0089
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            long r3 = r14.longValue()
            r0.mo27703n0(r3)
        L_0x0089:
            if (r15 == 0) goto L_0x0096
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            long r3 = r15.longValue()
            r0.mo27705o0(r3)
        L_0x0096:
            if (r23 == 0) goto L_0x00a3
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            int r3 = r23.intValue()
            r0.mo27644I0(r3)
        L_0x00a3:
            if (r19 == 0) goto L_0x00d3
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.mo27710r(r1)
            if (r0 != 0) goto L_0x00c8
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            com.yeelight.yeelib.c.n.e r1 = new com.yeelight.yeelib.c.n.e
            int r3 = r19.intValue()
            int r4 = r19.intValue()
            r1.<init>(r3, r4)
            r0.mo27676a(r1)
            goto L_0x00d3
        L_0x00c8:
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            int r1 = r19.intValue()
            r0.mo27670V0(r1)
        L_0x00d3:
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            r3 = 1
            if (r20 == 0) goto L_0x00e5
            long r5 = r20.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00e5
            r1 = 1
            goto L_0x00e6
        L_0x00e5:
            r1 = 0
        L_0x00e6:
            r0.mo27652M0(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r22 == 0) goto L_0x00f9
            long r5 = r22.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00f9
            r1 = 1
            goto L_0x00fa
        L_0x00f9:
            r1 = 0
        L_0x00fa:
            r0.mo27682d(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r24 == 0) goto L_0x010d
            long r5 = r24.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x010d
            r1 = 1
            goto L_0x010e
        L_0x010d:
            r1 = 0
        L_0x010e:
            r0.mo27692i(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r25 == 0) goto L_0x0120
            long r5 = r25.longValue()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0120
            goto L_0x0121
        L_0x0120:
            r2 = 0
        L_0x0121:
            r0.mo27721w0(r2)
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x0135
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            com.yeelight.yeelib.g.a r1 = com.yeelight.yeelib.p153g.C9827a.m23894b(r21)
            r0.mo27713s0(r1)
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6754h1.m20136Z1(com.yeelight.yeelib.device.xiaomi.StripeService$e1, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long):void");
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6782y());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo27557C1() {
        try {
            mo27560F1().disableMusic(0L, new C6777t(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo27559E1(String str, int i) {
        try {
            mo27560F1().enableMusic(1L, str, Long.valueOf((long) i), new C6776s(this));
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

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6778u();
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
            mo27560F1().sendCmd(StripeService.C9630l0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6767j(z));
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
            mo27560F1().sendCmd(StripeService.C9630l0.cfg_init_power, String.valueOf(i), new C6769l(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(StripeService.C9630l0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6766i(z));
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
        return mo28373a2(this.f14023A, this.f14024B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14025z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14022G, "Invalid handler!");
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
    public StripeService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightStripeDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo28373a2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof StripeService.C9618f1)) {
            C4308b.m12139r(f14022G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (StripeService.C9618f1) obj2);
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
            mo27560F1().setPower(StripeService.C9615e1.off, new C6781x());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6771n());
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
            mo27560F1().setPower(StripeService.C9615e1.on, new C6779v());
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
            mo27560F1().openWithMode(StripeService.C9615e1.on, StripeService.C9632m0.smooth, 500L, Long.valueOf((long) i), new C6772o(i));
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
            mo27560F1().setBright(Long.valueOf(j), StripeService.C9632m0.smooth, 500L, new C6783z(j));
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
            mo27560F1().setRgb(Long.valueOf((long) i2), StripeService.C9632m0.smooth, 500L, new C6758b0(i2));
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
            mo27560F1().start_cf(0L, 0L, sb.toString(), new C6760c0(iArr, i));
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
            mo27560F1().setCt(Long.valueOf((long) i), StripeService.C9632m0.smooth, 500L, new C6756a0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6765h(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6770m(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14025z);
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        try {
            mo27560F1().setLEDIndicator(z ? StripeService.C9612d1.on : StripeService.C9612d1.off, new C6764g(z));
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
            if (jSONArray.length() != 15) {
                C4308b.m12139r("BATCH_RPC", "StripDevice, Invalid length of batch rpc result: " + str2);
            }
            m20136Z1(StripeService.C9615e1.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), jSONArray.getString(10), Long.valueOf(jSONArray.getLong(11)), !jSONArray.getString(12).isEmpty() ? Long.valueOf(jSONArray.getLong(12)) : 0L, Long.valueOf(jSONArray.getLong(13)), Long.valueOf(jSONArray.getLong(14)));
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
            mo27560F1().getProperties(new C6768k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6755a(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6757b(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6759c(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6761d(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31853B()) {
            try {
                mo27560F1().setScene("color", Long.valueOf((long) (yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) yVar.mo31874f()), new C6762e(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31891w()) {
            try {
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31879k()), Long.valueOf((long) yVar.mo31880l()), yVar.mo31882n(), new C6763f(yVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str = f14022G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("Hue").getInternalName(), mo27560F1().getService().getProperty("Sat").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("ColorMode").getInternalName(), mo27560F1().getService().getProperty("Rgb").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("MusicEnable").getInternalName(), mo27560F1().getService().getProperty("IndicatorOn").getInternalName()};
    }
}
