package com.yeelight.yeelib.p150c.p183m;

import androidx.core.view.ViewCompat;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.BsLampService;
import com.yeelight.yeelib.device.xiaomi.YeelightBsLampDevice;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6029f;
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
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.c.m.f */
public class C6478f extends C6029f {

    /* renamed from: G */
    public static final String f13599G = "f";

    /* renamed from: A */
    CompletionHandler f13600A = new C6500n(this);

    /* renamed from: B */
    BsLampService.C7824d1 f13601B = new C6501o();

    /* renamed from: z */
    CompletionHandler f13602z = new C6499m(this);

    /* renamed from: com.yeelight.yeelib.c.m.f$a */
    class C6479a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13603a;

        C6479a(C9856y yVar) {
            this.f13603a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27654N0(this.f13603a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$a0 */
    class C6480a0 implements C6006h.C6016j {
        C6480a0() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6478f.this.f13601B.mo28213a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6478f.this.f13601B.mo28219h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
            C6478f.this.f13601B.mo28221j(l);
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
            C6478f.this.f13601B.mo28223l(l);
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C6478f.this.f13601B.mo28218f(BsLampService.C7821c1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$b */
    class C6481b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13606a;

        C6481b(C9856y yVar) {
            this.f13606a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27654N0(this.f13606a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$b0 */
    static /* synthetic */ class C6482b0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f13608a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.BsLampService$c1[] r0 = com.yeelight.yeelib.device.xiaomi.BsLampService.C7821c1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13608a = r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$c1 r1 = com.yeelight.yeelib.device.xiaomi.BsLampService.C7821c1.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13608a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.BsLampService$c1 r1 = com.yeelight.yeelib.device.xiaomi.BsLampService.C7821c1.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6478f.C6482b0.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$c */
    class C6483c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13609a;

        C6483c(C9856y yVar) {
            this.f13609a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27654N0(this.f13609a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$c0 */
    class C6484c0 implements CompletionHandler {
        C6484c0() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$d */
    class C6485d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13612a;

        C6485d(C9856y yVar) {
            this.f13612a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27654N0(this.f13612a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$d0 */
    class C6486d0 implements CompletionHandler {
        C6486d0() {
        }

        public void onFailed(int i, String str) {
            String.format("BsLampDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$e */
    class C6487e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13615a;

        C6487e(C9856y yVar) {
            this.f13615a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27654N0(this.f13615a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$e0 */
    class C6488e0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f13617a;

        C6488e0(long j) {
            this.f13617a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27697k0(this.f13617a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$f */
    class C6489f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13619a;

        C6489f(C9856y yVar) {
            this.f13619a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27654N0(this.f13619a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$f0 */
    class C6490f0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13621a;

        C6490f0(int i) {
            this.f13621a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27707p0(this.f13621a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$g */
    class C6491g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13623a;

        C6491g(C9856y yVar) {
            this.f13623a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27654N0(this.f13623a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$g0 */
    class C6492g0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13625a;

        C6492g0(int i) {
            this.f13625a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27699l0(this.f13625a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$h */
    class C6493h implements CompletionHandler {
        C6493h(C6478f fVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$h0 */
    class C6494h0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f13627a;

        /* renamed from: b */
        final /* synthetic */ int f13628b;

        C6494h0(int[] iArr, int i) {
            this.f13627a = iArr;
            this.f13628b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f13627a) {
                arrayList.add(new C7556g.C7557a(aVar, this.f13628b));
            }
            C6478f.this.mo23408d0().mo27701m0(arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$i */
    class C6495i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13630a;

        C6495i(boolean z) {
            this.f13630a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27652M0(this.f13630a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$j */
    class C6496j implements CompletionHandler {
        C6496j(C6478f fVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$k */
    class C6497k implements BsLampService.C7866y0 {
        C6497k() {
        }

        /* renamed from: a */
        public void mo28211a(BsLampService.C7821c1 c1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, String str2, Long l11) {
            "mode: " + l6;
            StringBuilder sb = new StringBuilder();
            sb.append("rgb: ");
            Long l12 = l7;
            sb.append(l12);
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            Long l13 = l;
            sb2.append(l13);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("flowing: ");
            Long l14 = l5;
            sb3.append(l14);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("ct: ");
            Long l15 = l2;
            sb4.append(l15);
            sb4.toString();
            "power: " + c1Var.name();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("hue: ");
            Long l16 = l3;
            sb5.append(l16);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("sat: ");
            Long l17 = l4;
            sb6.append(l17);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("delayoff: ");
            Long l18 = l8;
            sb7.append(l18);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("flowParams: ");
            String str3 = str;
            sb8.append(str3);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("music_mode: ");
            Long l19 = l10;
            sb9.append(l19);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("nightTimeInfo : ");
            String str4 = str2;
            sb10.append(str4);
            sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("saveState: ");
            Long l20 = l9;
            sb11.append(l20);
            sb11.toString();
            C6478f.this.m19597k2(c1Var, l13, l15, l16, l17, l14, l6, l12, l18, str3, l20, l19, str4, l11);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$l */
    class C6498l implements CompletionHandler {
        C6498l() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$m */
    class C6499m implements CompletionHandler {
        C6499m(C6478f fVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$n */
    class C6500n implements CompletionHandler {
        C6500n(C6478f fVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$o */
    class C6501o implements BsLampService.C7824d1 {
        C6501o() {
        }

        /* renamed from: a */
        public void mo28213a(Long l) {
            "onBrightChanged: " + l;
            C6478f.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28214b(Long l) {
            "onDelayOffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6478f.this.mo23408d0().mo27710r(2) == null) {
                C6478f.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6478f.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28215c(Long l) {
            "onFlowingChanged: " + l;
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            C6024e d0 = C6478f.this.mo23408d0();
            if (i != 0) {
                d0.mo27630B0(C6024e.C6028d.DEVICE_MODE_FLOW);
            } else if (d0.mo27726z() == C6024e.C6028d.DEVICE_MODE_FLOW) {
                ((C7562l) C6478f.this.mo23408d0()).mo28967Z0();
            }
            C6478f.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28216d(Long l) {
            "onSaveStateChanged: " + l;
            C6478f.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28217e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6478f.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28218f(BsLampService.C7821c1 c1Var) {
            C6024e eVar;
            "onPowerChanged: " + c1Var.name();
            int i = C6482b0.f13608a[c1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6478f.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6478f.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: h */
        public void mo28219h(Long l) {
            "onCtScaleChanged: " + l;
            C6478f.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28220i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6478f.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6478f.this.mo23408d0().mo27640G0(true);
                }
                C6478f.this.mo23408d0().mo27638F0(split[1]);
                C6478f.this.mo23408d0().mo27636E0(split[2]);
                C6478f.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                "start = " + C6478f.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6478f.this.mo23408d0().mo27631C() + ", " + C6478f.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28221j(Long l) {
            "onRgbChanged: " + l;
            C6478f.this.mo23408d0().mo27699l0(l.intValue());
        }

        /* renamed from: k */
        public void mo28222k(Long l) {
            C6478f.this.mo23408d0().mo27705o0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo28223l(Long l) {
            C6024e d0;
            C6024e.C6028d dVar;
            "onColorModeChanged: " + l;
            if (l.longValue() == 1) {
                d0 = C6478f.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C6478f.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C6478f.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo27630B0(dVar);
        }

        /* renamed from: m */
        public void mo28224m(Long l) {
            "onMiBandSleepChanged =" + l;
            C6478f.this.mo23408d0().mo27690h(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo28225n(Long l) {
            C6478f.this.mo23408d0().mo27703n0((long) l.intValue());
        }

        /* renamed from: o */
        public void mo28226o(Long l) {
            "onMusicEnableChanged = " + l;
            C6478f.this.mo23408d0().mo27692i(l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$p */
    class C6502p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13635a;

        C6502p(boolean z) {
            this.f13635a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27682d(this.f13635a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$q */
    class C6503q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13637a;

        C6503q(int i) {
            this.f13637a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27644I0(this.f13637a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$r */
    class C6504r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13639a;

        /* renamed from: b */
        final /* synthetic */ String f13640b;

        /* renamed from: c */
        final /* synthetic */ String f13641c;

        /* renamed from: d */
        final /* synthetic */ int f13642d;

        C6504r(boolean z, String str, String str2, int i) {
            this.f13639a = z;
            this.f13640b = str;
            this.f13641c = str2;
            this.f13642d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27640G0(this.f13639a);
            C6478f.this.mo23408d0().mo27638F0(this.f13640b);
            C6478f.this.mo23408d0().mo27636E0(this.f13641c);
            C6478f.this.mo23408d0().mo27634D0(this.f13642d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$s */
    class C6505s implements CompletionHandler {
        C6505s(C6478f fVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$t */
    class C6506t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f13644a;

        /* renamed from: b */
        final /* synthetic */ String f13645b;

        /* renamed from: c */
        final /* synthetic */ int f13646c;

        C6506t(String str, String str2, int i) {
            this.f13644a = str;
            this.f13645b = str2;
            this.f13646c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27638F0(this.f13644a);
            C6478f.this.mo23408d0().mo27636E0(this.f13645b);
            C6478f.this.mo23408d0().mo27634D0(this.f13646c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$u */
    class C6507u implements CompletionHandler {
        C6507u() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$v */
    class C6508v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13649a;

        C6508v(boolean z) {
            this.f13649a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27640G0(this.f13649a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$w */
    class C6509w implements CompletionHandler {
        C6509w(C6478f fVar) {
        }

        public void onFailed(int i, String str) {
            "enableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$x */
    class C6510x implements CompletionHandler {
        C6510x(C6478f fVar) {
        }

        public void onFailed(int i, String str) {
            "disableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$y */
    class C6511y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13651a;

        C6511y(int i) {
            this.f13651a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6478f.this.mo23408d0().mo27648K0(true);
            C6478f fVar = C6478f.this;
            fVar.mo23352w1(fVar.mo23433j1(this.f13651a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.f$z */
    class C6512z implements CompletionHandler {
        C6512z(C6478f fVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    public C6478f(String str, String str2, String str3, Device.Ownership ownership) {
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
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: k2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m19597k2(com.yeelight.yeelib.device.xiaomi.BsLampService.C7821c1 r11, java.lang.Long r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.String r20, java.lang.Long r21, java.lang.Long r22, java.lang.String r23, java.lang.Long r24) {
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
            r3 = 0
            if (r16 == 0) goto L_0x0047
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            long r5 = r16.longValue()
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
            if (r18 == 0) goto L_0x0054
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            int r5 = r18.intValue()
            r4.mo27699l0(r5)
        L_0x0054:
            if (r12 == 0) goto L_0x0061
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            long r5 = r12.longValue()
            r4.mo27697k0(r5)
        L_0x0061:
            if (r13 == 0) goto L_0x006e
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            int r5 = r13.intValue()
            r4.mo27707p0(r5)
        L_0x006e:
            if (r0 == 0) goto L_0x007e
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            com.yeelight.yeelib.device.xiaomi.BsLampService$c1 r5 = com.yeelight.yeelib.device.xiaomi.BsLampService.C7821c1.on
            if (r0 != r5) goto L_0x007a
            r0 = 1
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r4.mo27648K0(r0)
        L_0x007e:
            if (r14 == 0) goto L_0x008b
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            long r4 = r14.longValue()
            r0.mo27703n0(r4)
        L_0x008b:
            if (r15 == 0) goto L_0x0098
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            long r4 = r15.longValue()
            r0.mo27705o0(r4)
        L_0x0098:
            if (r19 == 0) goto L_0x00c8
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.mo27710r(r4)
            if (r0 != 0) goto L_0x00bd
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            com.yeelight.yeelib.c.n.e r4 = new com.yeelight.yeelib.c.n.e
            int r5 = r19.intValue()
            int r6 = r19.intValue()
            r4.<init>(r5, r6)
            r0.mo27676a(r4)
            goto L_0x00c8
        L_0x00bd:
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            int r4 = r19.intValue()
            r0.mo27670V0(r4)
        L_0x00c8:
            java.lang.String r0 = "\\|"
            r4 = r23
            java.lang.String[] r0 = r4.split(r0)
            int r4 = r0.length
            r5 = 4
            if (r4 != r5) goto L_0x014f
            r4 = r0[r3]
            java.lang.String r5 = "disable"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00e6
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            r4.mo27640G0(r3)
            goto L_0x00f7
        L_0x00e6:
            r4 = r0[r3]
            java.lang.String r5 = "enable"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00f7
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            r4.mo27640G0(r2)
        L_0x00f7:
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            r5 = r0[r2]
            r4.mo27638F0(r5)
            com.yeelight.yeelib.c.i.e r4 = r10.mo23408d0()
            r1 = r0[r1]
            r4.mo27636E0(r1)
            com.yeelight.yeelib.c.i.e r1 = r10.mo23408d0()
            r4 = 3
            r0 = r0[r4]
            int r0 = java.lang.Integer.parseInt(r0)
            r1.mo27634D0(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "start = "
            r0.append(r1)
            com.yeelight.yeelib.c.i.e r1 = r10.mo23408d0()
            java.lang.String r1 = r1.mo27633D()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            com.yeelight.yeelib.c.i.e r1 = r10.mo23408d0()
            java.lang.String r1 = r1.mo27631C()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            com.yeelight.yeelib.c.i.e r1 = r10.mo23408d0()
            int r1 = r1.mo27629B()
            r0.append(r1)
            r0.toString()
        L_0x014f:
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            r4 = 1
            if (r21 == 0) goto L_0x0161
            long r6 = r21.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0161
            r1 = 1
            goto L_0x0162
        L_0x0161:
            r1 = 0
        L_0x0162:
            r0.mo27652M0(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r22 == 0) goto L_0x0175
            long r6 = r22.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0175
            r1 = 1
            goto L_0x0176
        L_0x0175:
            r1 = 0
        L_0x0176:
            r0.mo27692i(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r24 == 0) goto L_0x0188
            long r6 = r24.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0188
            goto L_0x0189
        L_0x0188:
            r2 = 0
        L_0x0189:
            r0.mo27690h(r2)
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x019d
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            com.yeelight.yeelib.g.a r1 = com.yeelight.yeelib.p153g.C9827a.m23894b(r20)
            r0.mo27713s0(r1)
        L_0x019d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6478f.m19597k2(com.yeelight.yeelib.device.xiaomi.BsLampService$c1, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long):void");
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6486d0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo27557C1() {
        try {
            mo27560F1().disableMusic(0L, new C6510x(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo27559E1(String str, int i) {
        try {
            mo27560F1().enableMusic(1L, str, Long.valueOf((long) i), new C6509w(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo23303F() {
        /*
            r3 = this;
            java.lang.String r0 = r3.mo23395T()
            int r1 = r0.hashCode()
            r2 = 1
            switch(r1) {
                case 1623724662: goto L_0x0017;
                case 1623724663: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0021
        L_0x000d:
            java.lang.String r1 = "yeelink.light.bslamp3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0017:
            java.lang.String r1 = "yeelink.light.bslamp2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0021
            r0 = 0
            goto L_0x0022
        L_0x0021:
            r0 = -1
        L_0x0022:
            if (r0 == 0) goto L_0x002c
            if (r0 == r2) goto L_0x0029
            int r0 = com.yeelight.yeelib.R$drawable.icon_yeelight_device_badge_cherry1s_small
            return r0
        L_0x0029:
            int r0 = com.yeelight.yeelib.R$drawable.icon_yeelight_device_badge_dysis_le_small
            return r0
        L_0x002c:
            int r0 = com.yeelight.yeelib.R$drawable.icon_yeelight_device_badge_dysis_small
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6478f.mo23303F():int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo23306H() {
        /*
            r3 = this;
            java.lang.String r0 = r3.mo23395T()
            int r1 = r0.hashCode()
            r2 = 1
            switch(r1) {
                case 1623724662: goto L_0x0017;
                case 1623724663: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0021
        L_0x000d:
            java.lang.String r1 = "yeelink.light.bslamp3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0017:
            java.lang.String r1 = "yeelink.light.bslamp2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0021
            r0 = 0
            goto L_0x0022
        L_0x0021:
            r0 = -1
        L_0x0022:
            if (r0 == 0) goto L_0x002c
            if (r0 == r2) goto L_0x0029
            int r0 = com.yeelight.yeelib.R$drawable.icon_yeelight_device_badge_cherry1s_big
            return r0
        L_0x0029:
            int r0 = com.yeelight.yeelib.R$drawable.icon_yeelight_device_badge_dysis_le_big
            return r0
        L_0x002c:
            int r0 = com.yeelight.yeelib.R$drawable.icon_yeelight_device_badge_dysis_big
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6478f.mo23306H():int");
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6480a0();
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
            mo27560F1().sendCmd(BsLampService.C7840l0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6502p(z));
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
            mo27560F1().sendCmd(BsLampService.C7840l0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C6506t(str, str2, i));
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
            mo27560F1().sendCmd(BsLampService.C7840l0.cfg_init_power, String.valueOf(i), new C6503q(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(BsLampService.C7840l0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6495i(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_bslamp) : super.mo23397U();
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28210l2(this.f13600A, this.f13601B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13602z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13599G, "Invalid handler!");
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
            mo27560F1().sendCmd(BsLampService.C7840l0.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6505s(this));
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
            mo27560F1().setPower(BsLampService.C7821c1.off, new C6484c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6498l());
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
            mo27560F1().sendCmd(BsLampService.C7840l0.nighttime, z ? "enable" : "disable", new C6508v(z));
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
            mo27560F1().sendCmd(BsLampService.C7840l0.pseudo_beacon, "4097|" + i, new C6512z(this));
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
            BsLampService j2 = mo27560F1();
            BsLampService.C7840l0 l0Var = BsLampService.C7840l0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(l0Var, sb.toString(), new C6504r(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public BsLampService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightBsLampDevice) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(BsLampService.C7821c1.on, new C6507u());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28210l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof BsLampService.C7824d1)) {
            C4308b.m12139r(f13599G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (BsLampService.C7824d1) obj2);
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
            mo27560F1().openWithMode(BsLampService.C7821c1.on, BsLampService.C7842m0.smooth, 500L, Long.valueOf((long) i), new C6511y(i));
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
        if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_FLOW) {
            List<C7556g.C7557a> o = mo23408d0().mo27704o();
            int[] iArr = new int[o.size()];
            for (int i = 0; i < o.size(); i++) {
                iArr[i] = o.get(i).mo28914a();
            }
            mo23343r1(o.get(0).mo28915b(), iArr, (int) j);
        } else {
            try {
                mo27560F1().setBright(Long.valueOf(j), BsLampService.C7842m0.smooth, 500L, new C6488e0(j));
            } catch (MiotException e) {
                e.printStackTrace();
            }
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
            mo27560F1().setRgb(Long.valueOf((long) i2), BsLampService.C7842m0.smooth, 500L, new C6492g0(i2));
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
            mo27560F1().start_cf(0L, 0L, sb.toString(), new C6494h0(iArr, i));
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
            mo27560F1().setCt(Long.valueOf((long) i), BsLampService.C7842m0.smooth, 500L, new C6490f0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6493h(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6496j(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f13602z);
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
                C4308b.m12139r("BATCH_RPC", "BsLampDevice, Invalid length of batch rpc result: " + str2);
            }
            m19597k2(BsLampService.C7821c1.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), jSONArray.getString(12), Long.valueOf(jSONArray.getLong(13)));
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
                mo27560F1().getProperties(new C6497k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6479a(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6481b(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6483c(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6485d(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31853B()) {
            try {
                mo27560F1().setScene("color", Long.valueOf((long) (yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) yVar.mo31874f()), new C6487e(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31891w()) {
            try {
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31879k()), Long.valueOf((long) yVar.mo31880l()), yVar.mo31882n(), new C6489f(yVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C6491g(yVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f13599G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("Hue").getInternalName(), mo27560F1().getService().getProperty("Sat").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("ColorMode").getInternalName(), mo27560F1().getService().getProperty("Rgb").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("MusicEnable").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("MiBandSleep").getInternalName()};
    }
}
