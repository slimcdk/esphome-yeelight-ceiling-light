package com.yeelight.yeelib.p150c.p183m;

import androidx.core.view.ViewCompat;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.BsLamp3Service;
import com.yeelight.yeelib.device.xiaomi.YeelightBsLamp3Device;
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

/* renamed from: com.yeelight.yeelib.c.m.e */
public class C6424e extends C6029f {

    /* renamed from: G */
    public static final String f13504G = "e";

    /* renamed from: A */
    CompletionHandler f13505A = new C6446n(this);

    /* renamed from: B */
    BsLamp3Service.C7772f1 f13506B = new C6447o();

    /* renamed from: z */
    CompletionHandler f13507z = new C6445m(this);

    /* renamed from: com.yeelight.yeelib.c.m.e$a */
    class C6425a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13508a;

        C6425a(C9856y yVar) {
            this.f13508a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27654N0(this.f13508a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$a0 */
    class C6426a0 implements C6006h.C6016j {
        C6426a0() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6424e.this.f13506B.mo28166a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6424e.this.f13506B.mo28173h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
            C6424e.this.f13506B.mo28175j(l);
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
            C6424e.this.f13506B.mo28177l(l);
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C6424e.this.f13506B.mo28178m(BsLamp3Service.C7769e1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$b */
    class C6427b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13511a;

        C6427b(C9856y yVar) {
            this.f13511a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27654N0(this.f13511a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$b0 */
    static /* synthetic */ class C6428b0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f13513a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$e1[] r0 = com.yeelight.yeelib.device.xiaomi.BsLamp3Service.C7769e1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13513a = r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$e1 r1 = com.yeelight.yeelib.device.xiaomi.BsLamp3Service.C7769e1.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13513a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$e1 r1 = com.yeelight.yeelib.device.xiaomi.BsLamp3Service.C7769e1.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6424e.C6428b0.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$c */
    class C6429c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13514a;

        C6429c(C9856y yVar) {
            this.f13514a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27654N0(this.f13514a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$c0 */
    class C6430c0 implements CompletionHandler {
        C6430c0() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$d */
    class C6431d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13517a;

        C6431d(C9856y yVar) {
            this.f13517a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27654N0(this.f13517a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$d0 */
    class C6432d0 implements CompletionHandler {
        C6432d0() {
        }

        public void onFailed(int i, String str) {
            String.format("BsLampDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$e */
    class C6433e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13520a;

        C6433e(C9856y yVar) {
            this.f13520a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27654N0(this.f13520a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$e0 */
    class C6434e0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f13522a;

        C6434e0(long j) {
            this.f13522a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27697k0(this.f13522a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$f */
    class C6435f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13524a;

        C6435f(C9856y yVar) {
            this.f13524a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27654N0(this.f13524a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$f0 */
    class C6436f0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13526a;

        C6436f0(int i) {
            this.f13526a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27707p0(this.f13526a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$g */
    class C6437g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13528a;

        C6437g(C9856y yVar) {
            this.f13528a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27654N0(this.f13528a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$g0 */
    class C6438g0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13530a;

        C6438g0(int i) {
            this.f13530a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27699l0(this.f13530a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$h */
    class C6439h implements CompletionHandler {
        C6439h(C6424e eVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$h0 */
    class C6440h0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f13532a;

        /* renamed from: b */
        final /* synthetic */ int f13533b;

        C6440h0(int[] iArr, int i) {
            this.f13532a = iArr;
            this.f13533b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f13532a) {
                arrayList.add(new C7556g.C7557a(aVar, this.f13533b));
            }
            C6424e.this.mo23408d0().mo27701m0(arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$i */
    class C6441i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13535a;

        C6441i(boolean z) {
            this.f13535a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27652M0(this.f13535a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$j */
    class C6442j implements CompletionHandler {
        C6442j(C6424e eVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$k */
    class C6443k implements BsLamp3Service.C7757a1 {
        C6443k() {
        }

        /* renamed from: a */
        public void mo28164a(BsLamp3Service.C7769e1 e1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, Long l11, String str2, Long l12) {
            "mode: " + l6;
            StringBuilder sb = new StringBuilder();
            sb.append("rgb: ");
            Long l13 = l7;
            sb.append(l13);
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            Long l14 = l;
            sb2.append(l14);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lanMode: ");
            Long l15 = l9;
            sb3.append(l15);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("flowing: ");
            Long l16 = l5;
            sb4.append(l16);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("ct: ");
            Long l17 = l2;
            sb5.append(l17);
            sb5.toString();
            "power: " + e1Var.name();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("hue: ");
            Long l18 = l3;
            sb6.append(l18);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("sat: ");
            Long l19 = l4;
            sb7.append(l19);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("delayoff: ");
            Long l20 = l8;
            sb8.append(l20);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("flowParams: ");
            String str3 = str;
            sb9.append(str3);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("music_mode: ");
            Long l21 = l11;
            sb10.append(l21);
            sb10.toString();
            "nightTimeInfo : " + str2;
            "saveState: " + l10;
            "knockEnable: " + l12;
            C6424e.this.m19384k2(e1Var, l14, l17, l18, l19, l16, l6, l13, l20, str3, l15, l10, l21, str2, l12);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$l */
    class C6444l implements CompletionHandler {
        C6444l() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$m */
    class C6445m implements CompletionHandler {
        C6445m(C6424e eVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$n */
    class C6446n implements CompletionHandler {
        C6446n(C6424e eVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$o */
    class C6447o implements BsLamp3Service.C7772f1 {
        C6447o() {
        }

        /* renamed from: a */
        public void mo28166a(Long l) {
            "onBrightChanged: " + l;
            C6424e.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28167b(Long l) {
            "onDelayOffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6424e.this.mo23408d0().mo27710r(2) == null) {
                C6424e.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6424e.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28168c(Long l) {
            "onFlowingChanged: " + l;
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            C6024e d0 = C6424e.this.mo23408d0();
            if (i != 0) {
                d0.mo27630B0(C6024e.C6028d.DEVICE_MODE_FLOW);
            } else if (d0.mo27726z() == C6024e.C6028d.DEVICE_MODE_FLOW) {
                ((C7562l) C6424e.this.mo23408d0()).mo28967Z0();
            }
            C6424e.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28169d(Long l) {
            "onSaveStateChanged: " + l;
            C6424e.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28170e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6424e.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28171f(Long l) {
            "onKnockEnableChanged =" + l;
            C6424e.this.mo23408d0().mo27684e(l != null && l.longValue() == 1);
        }

        /* renamed from: g */
        public void mo28172g(Long l) {
            "onLanModeChanged: " + l;
            C6424e.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28173h(Long l) {
            "onCtScaleChanged: " + l;
            C6424e.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28174i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6424e.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6424e.this.mo23408d0().mo27640G0(true);
                }
                C6424e.this.mo23408d0().mo27638F0(split[1]);
                C6424e.this.mo23408d0().mo27636E0(split[2]);
                C6424e.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                "start = " + C6424e.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6424e.this.mo23408d0().mo27631C() + ", " + C6424e.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28175j(Long l) {
            "onRgbChanged: " + l;
            C6424e.this.mo23408d0().mo27699l0(l.intValue());
        }

        /* renamed from: k */
        public void mo28176k(Long l) {
            C6424e.this.mo23408d0().mo27705o0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo28177l(Long l) {
            C6024e d0;
            C6024e.C6028d dVar;
            "onColorModeChanged: " + l;
            if (l.longValue() == 1) {
                d0 = C6424e.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C6424e.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C6424e.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo27630B0(dVar);
        }

        /* renamed from: m */
        public void mo28178m(BsLamp3Service.C7769e1 e1Var) {
            C6024e eVar;
            "onPowerChanged: " + e1Var.name();
            int i = C6428b0.f13513a[e1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6424e.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6424e.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: n */
        public void mo28179n(Long l) {
            C6424e.this.mo23408d0().mo27703n0((long) l.intValue());
        }

        /* renamed from: o */
        public void mo28180o(Long l) {
            "onMusicEnableChanged = " + l;
            C6424e.this.mo23408d0().mo27692i(l.longValue() == 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$p */
    class C6448p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13540a;

        C6448p(boolean z) {
            this.f13540a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27682d(this.f13540a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$q */
    class C6449q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13542a;

        C6449q(int i) {
            this.f13542a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27644I0(this.f13542a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$r */
    class C6450r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13544a;

        /* renamed from: b */
        final /* synthetic */ String f13545b;

        /* renamed from: c */
        final /* synthetic */ String f13546c;

        /* renamed from: d */
        final /* synthetic */ int f13547d;

        C6450r(boolean z, String str, String str2, int i) {
            this.f13544a = z;
            this.f13545b = str;
            this.f13546c = str2;
            this.f13547d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27640G0(this.f13544a);
            C6424e.this.mo23408d0().mo27638F0(this.f13545b);
            C6424e.this.mo23408d0().mo27636E0(this.f13546c);
            C6424e.this.mo23408d0().mo27634D0(this.f13547d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$s */
    class C6451s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13549a;

        C6451s(boolean z) {
            this.f13549a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27684e(this.f13549a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$t */
    class C6452t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f13551a;

        /* renamed from: b */
        final /* synthetic */ String f13552b;

        /* renamed from: c */
        final /* synthetic */ int f13553c;

        C6452t(String str, String str2, int i) {
            this.f13551a = str;
            this.f13552b = str2;
            this.f13553c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27638F0(this.f13551a);
            C6424e.this.mo23408d0().mo27636E0(this.f13552b);
            C6424e.this.mo23408d0().mo27634D0(this.f13553c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$u */
    class C6453u implements CompletionHandler {
        C6453u() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$v */
    class C6454v implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13556a;

        C6454v(boolean z) {
            this.f13556a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27640G0(this.f13556a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$w */
    class C6455w implements CompletionHandler {
        C6455w(C6424e eVar) {
        }

        public void onFailed(int i, String str) {
            "enableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$x */
    class C6456x implements CompletionHandler {
        C6456x(C6424e eVar) {
        }

        public void onFailed(int i, String str) {
            "disableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$y */
    class C6457y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13558a;

        C6457y(int i) {
            this.f13558a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6424e.this.mo23408d0().mo27648K0(true);
            C6424e eVar = C6424e.this;
            eVar.mo23352w1(eVar.mo23433j1(this.f13558a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e$z */
    class C6458z implements CompletionHandler {
        C6458z(C6424e eVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    public C6424e(String str, String str2, String str3, Device.Ownership ownership) {
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
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0193  */
    /* renamed from: k2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m19384k2(com.yeelight.yeelib.device.xiaomi.BsLamp3Service.C7769e1 r11, java.lang.Long r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.String r20, java.lang.Long r21, java.lang.Long r22, java.lang.Long r23, java.lang.String r24, java.lang.Long r25) {
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
            com.yeelight.yeelib.device.xiaomi.BsLamp3Service$e1 r5 = com.yeelight.yeelib.device.xiaomi.BsLamp3Service.C7769e1.on
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
            r4 = r24
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
            if (r22 == 0) goto L_0x0161
            long r6 = r22.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0161
            r1 = 1
            goto L_0x0162
        L_0x0161:
            r1 = 0
        L_0x0162:
            r0.mo27652M0(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r21 == 0) goto L_0x0175
            long r6 = r21.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0175
            r1 = 1
            goto L_0x0176
        L_0x0175:
            r1 = 0
        L_0x0176:
            r0.mo27682d(r1)
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r23 == 0) goto L_0x0189
            long r6 = r23.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0189
            r1 = 1
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            r0.mo27692i(r1)
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x019e
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            com.yeelight.yeelib.g.a r1 = com.yeelight.yeelib.p153g.C9827a.m23894b(r20)
            r0.mo27713s0(r1)
        L_0x019e:
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            if (r25 == 0) goto L_0x01ad
            long r6 = r25.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x01ad
            goto L_0x01ae
        L_0x01ad:
            r2 = 0
        L_0x01ae:
            r0.mo27684e(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6424e.m19384k2(com.yeelight.yeelib.device.xiaomi.BsLamp3Service$e1, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long):void");
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6432d0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo27557C1() {
        try {
            mo27560F1().disableMusic(0L, new C6456x(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo27559E1(String str, int i) {
        try {
            mo27560F1().enableMusic(1L, str, Long.valueOf((long) i), new C6455w(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b A[ADDED_TO_REGION] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo23303F() {
        /*
            r4 = this;
            java.lang.String r0 = r4.mo23395T()
            int r1 = r0.hashCode()
            r2 = -1063384685(0xffffffffc09e0993, float:-4.9386687)
            r3 = 1
            if (r1 == r2) goto L_0x001e
            r2 = 1623724663(0x60c81277, float:1.1533373E20)
            if (r1 == r2) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "yeelink.light.bslamp3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 0
            goto L_0x0029
        L_0x001e:
            java.lang.String r1 = "yeelink.light.lamp19"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = -1
        L_0x0029:
            if (r0 == 0) goto L_0x0030
            if (r0 == r3) goto L_0x0030
            int r0 = com.yeelight.yeelib.R$drawable.icon_yeelight_device_badge_cherry1s_small
            return r0
        L_0x0030:
            int r0 = com.yeelight.yeelib.R$drawable.icon_yeelight_device_badge_dysis_le_small
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6424e.mo23303F():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b A[ADDED_TO_REGION] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo23306H() {
        /*
            r4 = this;
            java.lang.String r0 = r4.mo23395T()
            int r1 = r0.hashCode()
            r2 = -1063384685(0xffffffffc09e0993, float:-4.9386687)
            r3 = 1
            if (r1 == r2) goto L_0x001e
            r2 = 1623724663(0x60c81277, float:1.1533373E20)
            if (r1 == r2) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "yeelink.light.bslamp3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 0
            goto L_0x0029
        L_0x001e:
            java.lang.String r1 = "yeelink.light.lamp19"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = -1
        L_0x0029:
            if (r0 == 0) goto L_0x0030
            if (r0 == r3) goto L_0x0030
            int r0 = com.yeelight.yeelib.R$drawable.icon_yeelight_device_badge_cherry1s_big
            return r0
        L_0x0030:
            int r0 = com.yeelight.yeelib.R$drawable.icon_yeelight_device_badge_dysis_le_big
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6424e.mo23306H():int");
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6426a0();
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
            mo27560F1().sendCmd(BsLamp3Service.C7786m0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6448p(z));
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
            mo27560F1().sendCmd(BsLamp3Service.C7786m0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C6452t(str, str2, i));
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
            mo27560F1().sendCmd(BsLamp3Service.C7786m0.cfg_init_power, String.valueOf(i), new C6449q(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(BsLamp3Service.C7786m0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6441i(z));
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
        return mo28163l2(this.f13505A, this.f13506B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13507z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13504G, "Invalid handler!");
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
        return false;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        if (super.mo23326b1()) {
            return true;
        }
        try {
            mo27560F1().setPower(BsLamp3Service.C7769e1.off, new C6430c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6444l());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: d1 */
    public void mo23429d1(boolean z) {
        "enableGestureSwitch --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(BsLamp3Service.C7786m0.knock_enable, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6451s(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f1 */
    public boolean mo23328f1(boolean z) {
        "enableNightTime --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(BsLamp3Service.C7786m0.nighttime, z ? "enable" : "disable", new C6454v(z));
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
            mo27560F1().sendCmd(BsLamp3Service.C7786m0.pseudo_beacon, "4097|" + i, new C6458z(this));
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
            BsLamp3Service j2 = mo27560F1();
            BsLamp3Service.C7786m0 m0Var = BsLamp3Service.C7786m0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(m0Var, sb.toString(), new C6450r(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public BsLamp3Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightBsLamp3Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(BsLamp3Service.C7769e1.on, new C6453u());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28163l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof BsLamp3Service.C7772f1)) {
            C4308b.m12139r(f13504G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (BsLamp3Service.C7772f1) obj2);
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
            mo27560F1().openWithMode(BsLamp3Service.C7769e1.on, BsLamp3Service.C7788n0.smooth, 500L, Long.valueOf((long) i), new C6457y(i));
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
                mo27560F1().setBright(Long.valueOf(j), BsLamp3Service.C7788n0.smooth, 500L, new C6434e0(j));
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
            mo27560F1().setRgb(Long.valueOf((long) i2), BsLamp3Service.C7788n0.smooth, 500L, new C6438g0(i2));
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
            mo27560F1().start_cf(0L, 0L, sb.toString(), new C6440h0(iArr, i));
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
            mo27560F1().setCt(Long.valueOf((long) i), BsLamp3Service.C7788n0.smooth, 500L, new C6436f0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6439h(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6442j(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f13507z);
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
            if (jSONArray.length() != 15) {
                C4308b.m12139r("BATCH_RPC", "BsLampDevice, Invalid length of batch rpc result: " + str2);
            }
            m19384k2(BsLamp3Service.C7769e1.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)), jSONArray.getString(13), Long.valueOf(jSONArray.getLong(14)));
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
                mo27560F1().getProperties(new C6443k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6425a(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6427b(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6429c(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6431d(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31853B()) {
            try {
                mo27560F1().setScene("color", Long.valueOf((long) (yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) yVar.mo31874f()), new C6433e(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31891w()) {
            try {
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31879k()), Long.valueOf((long) yVar.mo31880l()), yVar.mo31882n(), new C6435f(yVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C6437g(yVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f13504G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("Hue").getInternalName(), mo27560F1().getService().getProperty("Sat").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("ColorMode").getInternalName(), mo27560F1().getService().getProperty("Rgb").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("MusicEnable").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty(BsLamp3Service.PROPERTY_KnockEnable).getInternalName()};
    }
}
