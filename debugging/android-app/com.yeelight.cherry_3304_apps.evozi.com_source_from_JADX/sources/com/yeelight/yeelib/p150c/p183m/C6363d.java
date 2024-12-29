package com.yeelight.yeelib.p150c.p183m;

import androidx.core.view.ViewCompat;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.BsLamp2Service;
import com.yeelight.yeelib.device.xiaomi.YeelightBsLamp2Device;
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

/* renamed from: com.yeelight.yeelib.c.m.d */
public class C6363d extends C6029f {

    /* renamed from: G */
    public static final String f13402G = "d";

    /* renamed from: A */
    CompletionHandler f13403A = new C6384n(this);

    /* renamed from: B */
    BsLamp2Service.C7706b1 f13404B = new C6385o();

    /* renamed from: z */
    CompletionHandler f13405z = new C6383m(this);

    /* renamed from: com.yeelight.yeelib.c.m.d$a */
    class C6364a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13406a;

        C6364a(C9856y yVar) {
            this.f13406a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27654N0(this.f13406a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$a0 */
    static /* synthetic */ class C6365a0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f13408a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$a1[] r0 = com.yeelight.yeelib.device.xiaomi.BsLamp2Service.C7703a1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13408a = r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$a1 r1 = com.yeelight.yeelib.device.xiaomi.BsLamp2Service.C7703a1.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13408a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$a1 r1 = com.yeelight.yeelib.device.xiaomi.BsLamp2Service.C7703a1.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6363d.C6365a0.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$b */
    class C6366b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13409a;

        C6366b(C9856y yVar) {
            this.f13409a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27654N0(this.f13409a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$b0 */
    class C6367b0 implements CompletionHandler {
        C6367b0() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$c */
    class C6368c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13412a;

        C6368c(C9856y yVar) {
            this.f13412a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27654N0(this.f13412a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$c0 */
    class C6369c0 implements CompletionHandler {
        C6369c0() {
        }

        public void onFailed(int i, String str) {
            String.format("BsLampDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$d */
    class C6370d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13415a;

        C6370d(C9856y yVar) {
            this.f13415a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27654N0(this.f13415a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$d0 */
    class C6371d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f13417a;

        C6371d0(long j) {
            this.f13417a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27697k0(this.f13417a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$e */
    class C6372e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13419a;

        C6372e(C9856y yVar) {
            this.f13419a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27654N0(this.f13419a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$e0 */
    class C6373e0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13421a;

        C6373e0(int i) {
            this.f13421a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27707p0(this.f13421a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$f */
    class C6374f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13423a;

        C6374f(C9856y yVar) {
            this.f13423a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27654N0(this.f13423a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$f0 */
    class C6375f0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13425a;

        C6375f0(int i) {
            this.f13425a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27699l0(this.f13425a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$g */
    class C6376g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13427a;

        C6376g(C9856y yVar) {
            this.f13427a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27654N0(this.f13427a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$g0 */
    class C6377g0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f13429a;

        /* renamed from: b */
        final /* synthetic */ int f13430b;

        C6377g0(int[] iArr, int i) {
            this.f13429a = iArr;
            this.f13430b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f13429a) {
                arrayList.add(new C7556g.C7557a(aVar, this.f13430b));
            }
            C6363d.this.mo23408d0().mo27701m0(arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$h */
    class C6378h implements CompletionHandler {
        C6378h(C6363d dVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$i */
    class C6379i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13432a;

        C6379i(boolean z) {
            this.f13432a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27652M0(this.f13432a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$j */
    class C6380j implements CompletionHandler {
        C6380j(C6363d dVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$k */
    class C6381k implements BsLamp2Service.C7748w0 {
        C6381k() {
        }

        /* renamed from: a */
        public void mo28138a(BsLamp2Service.C7703a1 a1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, String str2) {
            "mode: " + l6;
            StringBuilder sb = new StringBuilder();
            sb.append("rgb: ");
            Long l11 = l7;
            sb.append(l11);
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            Long l12 = l;
            sb2.append(l12);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("flowing: ");
            Long l13 = l5;
            sb3.append(l13);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("ct: ");
            Long l14 = l2;
            sb4.append(l14);
            sb4.toString();
            "power: " + a1Var.name();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("hue: ");
            Long l15 = l3;
            sb5.append(l15);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("sat: ");
            Long l16 = l4;
            sb6.append(l16);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("delayoff: ");
            Long l17 = l8;
            sb7.append(l17);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("flowParams: ");
            String str3 = str;
            sb8.append(str3);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("music_mode: ");
            Long l18 = l10;
            sb9.append(l18);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("nightTimeInfo : ");
            String str4 = str2;
            sb10.append(str4);
            sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("saveState: ");
            Long l19 = l9;
            sb11.append(l19);
            sb11.toString();
            C6363d.this.m19236k2(a1Var, l12, l14, l15, l16, l13, l6, l11, l17, str3, l19, l18, str4);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$l */
    class C6382l implements CompletionHandler {
        C6382l() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$m */
    class C6383m implements CompletionHandler {
        C6383m(C6363d dVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$n */
    class C6384n implements CompletionHandler {
        C6384n(C6363d dVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$o */
    class C6385o implements BsLamp2Service.C7706b1 {
        C6385o() {
        }

        /* renamed from: a */
        public void mo28140a(Long l) {
            "onBrightChanged: " + l;
            C6363d.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28141b(Long l) {
            "onDelayOffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6363d.this.mo23408d0().mo27710r(2) == null) {
                C6363d.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6363d.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28142c(Long l) {
            "onFlowingChanged: " + l;
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            C6024e d0 = C6363d.this.mo23408d0();
            if (i != 0) {
                d0.mo27630B0(C6024e.C6028d.DEVICE_MODE_FLOW);
            } else if (d0.mo27726z() == C6024e.C6028d.DEVICE_MODE_FLOW) {
                ((C7562l) C6363d.this.mo23408d0()).mo28967Z0();
            }
            C6363d.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28143d(Long l) {
            "onSaveStateChanged: " + l;
            C6363d.this.mo23408d0().mo27652M0(l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28144e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6363d.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: h */
        public void mo28145h(Long l) {
            "onCtScaleChanged: " + l;
            C6363d.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28146i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6363d.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6363d.this.mo23408d0().mo27640G0(true);
                }
                C6363d.this.mo23408d0().mo27638F0(split[1]);
                C6363d.this.mo23408d0().mo27636E0(split[2]);
                C6363d.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                "start = " + C6363d.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6363d.this.mo23408d0().mo27631C() + ", " + C6363d.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28147j(Long l) {
            "onRgbChanged: " + l;
            C6363d.this.mo23408d0().mo27699l0(l.intValue());
        }

        /* renamed from: k */
        public void mo28148k(Long l) {
            C6363d.this.mo23408d0().mo27705o0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo28149l(Long l) {
            C6024e d0;
            C6024e.C6028d dVar;
            "onColorModeChanged: " + l;
            if (l.longValue() == 1) {
                d0 = C6363d.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C6363d.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C6363d.this.mo23408d0();
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo27630B0(dVar);
        }

        /* renamed from: n */
        public void mo28150n(Long l) {
            C6363d.this.mo23408d0().mo27703n0((long) l.intValue());
        }

        /* renamed from: o */
        public void mo28151o(Long l) {
            "onMusicEnableChanged = " + l;
            C6363d.this.mo23408d0().mo27692i(l.longValue() == 1);
        }

        /* renamed from: p */
        public void mo28152p(BsLamp2Service.C7703a1 a1Var) {
            C6024e eVar;
            "onPowerChanged: " + a1Var.name();
            int i = C6365a0.f13408a[a1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6363d.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6363d.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$p */
    class C6386p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13437a;

        C6386p(boolean z) {
            this.f13437a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27682d(this.f13437a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$q */
    class C6387q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13439a;

        C6387q(int i) {
            this.f13439a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27644I0(this.f13439a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$r */
    class C6388r implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13441a;

        /* renamed from: b */
        final /* synthetic */ String f13442b;

        /* renamed from: c */
        final /* synthetic */ String f13443c;

        /* renamed from: d */
        final /* synthetic */ int f13444d;

        C6388r(boolean z, String str, String str2, int i) {
            this.f13441a = z;
            this.f13442b = str;
            this.f13443c = str2;
            this.f13444d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27640G0(this.f13441a);
            C6363d.this.mo23408d0().mo27638F0(this.f13442b);
            C6363d.this.mo23408d0().mo27636E0(this.f13443c);
            C6363d.this.mo23408d0().mo27634D0(this.f13444d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$s */
    class C6389s implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f13446a;

        /* renamed from: b */
        final /* synthetic */ String f13447b;

        /* renamed from: c */
        final /* synthetic */ int f13448c;

        C6389s(String str, String str2, int i) {
            this.f13446a = str;
            this.f13447b = str2;
            this.f13448c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27638F0(this.f13446a);
            C6363d.this.mo23408d0().mo27636E0(this.f13447b);
            C6363d.this.mo23408d0().mo27634D0(this.f13448c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$t */
    class C6390t implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13450a;

        C6390t(boolean z) {
            this.f13450a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27640G0(this.f13450a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$u */
    class C6391u implements CompletionHandler {
        C6391u() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27648K0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$v */
    class C6392v implements CompletionHandler {
        C6392v(C6363d dVar) {
        }

        public void onFailed(int i, String str) {
            "enableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$w */
    class C6393w implements CompletionHandler {
        C6393w(C6363d dVar) {
        }

        public void onFailed(int i, String str) {
            "disableMusicMode onFailed code = " + i + " msg = " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$x */
    class C6394x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13453a;

        C6394x(int i) {
            this.f13453a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6363d.this.mo23408d0().mo27648K0(true);
            C6363d dVar = C6363d.this;
            dVar.mo23352w1(dVar.mo23433j1(this.f13453a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$y */
    class C6395y implements CompletionHandler {
        C6395y(C6363d dVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.d$z */
    class C6396z implements C6006h.C6016j {
        C6396z() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6363d.this.f13404B.mo28140a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6363d.this.f13404B.mo28145h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
            C6363d.this.f13404B.mo28147j(l);
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
            C6363d.this.f13404B.mo28149l(l);
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C6363d.this.f13404B.mo28152p(BsLamp2Service.C7703a1.valueOf(iVar.toString()));
        }
    }

    public C6363d(String str, String str2, String str3, Device.Ownership ownership) {
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
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: k2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m19236k2(com.yeelight.yeelib.device.xiaomi.BsLamp2Service.C7703a1 r11, java.lang.Long r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.String r20, java.lang.Long r21, java.lang.Long r22, java.lang.String r23) {
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
            com.yeelight.yeelib.device.xiaomi.BsLamp2Service$a1 r5 = com.yeelight.yeelib.device.xiaomi.BsLamp2Service.C7703a1.on
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
            if (r22 == 0) goto L_0x0174
            long r6 = r22.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0174
            goto L_0x0175
        L_0x0174:
            r2 = 0
        L_0x0175:
            r0.mo27692i(r2)
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x0189
            com.yeelight.yeelib.c.i.e r0 = r10.mo23408d0()
            com.yeelight.yeelib.g.a r1 = com.yeelight.yeelib.p153g.C9827a.m23894b(r20)
            r0.mo27713s0(r1)
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6363d.m19236k2(com.yeelight.yeelib.device.xiaomi.BsLamp2Service$a1, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String):void");
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6369c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo27557C1() {
        try {
            mo27560F1().disableMusic(0L, new C6393w(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo27559E1(String str, int i) {
        try {
            mo27560F1().enableMusic(1L, str, Long.valueOf((long) i), new C6392v(this));
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
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6363d.mo23303F():int");
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
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6363d.mo23306H():int");
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6396z();
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
            mo27560F1().sendCmd(BsLamp2Service.C7724k0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6386p(z));
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
            mo27560F1().sendCmd(BsLamp2Service.C7724k0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C6389s(str, str2, i));
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
            mo27560F1().sendCmd(BsLamp2Service.C7724k0.cfg_init_power, String.valueOf(i), new C6387q(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(BsLamp2Service.C7724k0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6379i(z));
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
        return mo28137l2(this.f13403A, this.f13404B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13405z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13402G, "Invalid handler!");
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
            mo27560F1().setPower(BsLamp2Service.C7703a1.off, new C6367b0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6382l());
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
            mo27560F1().sendCmd(BsLamp2Service.C7724k0.nighttime, z ? "enable" : "disable", new C6390t(z));
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
            mo27560F1().sendCmd(BsLamp2Service.C7724k0.pseudo_beacon, "4097|" + i, new C6395y(this));
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
            BsLamp2Service j2 = mo27560F1();
            BsLamp2Service.C7724k0 k0Var = BsLamp2Service.C7724k0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            j2.sendCmd(k0Var, sb.toString(), new C6388r(z, str, str2, i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: j2 */
    public BsLamp2Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightBsLamp2Device) abstractDevice).mDeviceService;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (super.mo23334l1()) {
            return true;
        }
        try {
            mo27560F1().setPower(BsLamp2Service.C7703a1.on, new C6391u());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo28137l2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof BsLamp2Service.C7706b1)) {
            C4308b.m12139r(f13402G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (BsLamp2Service.C7706b1) obj2);
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
            mo27560F1().openWithMode(BsLamp2Service.C7703a1.on, BsLamp2Service.C7726l0.smooth, 500L, Long.valueOf((long) i), new C6394x(i));
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
                mo27560F1().setBright(Long.valueOf(j), BsLamp2Service.C7726l0.smooth, 500L, new C6371d0(j));
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
            mo27560F1().setRgb(Long.valueOf((long) i2), BsLamp2Service.C7726l0.smooth, 500L, new C6375f0(i2));
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
            mo27560F1().start_cf(0L, 0L, sb.toString(), new C6377g0(iArr, i));
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
            mo27560F1().setCt(Long.valueOf((long) i), BsLamp2Service.C7726l0.smooth, 500L, new C6373e0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6378h(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6380j(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f13405z);
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
            if (jSONArray.length() != 13) {
                C4308b.m12139r("BATCH_RPC", "BsLampDevice, Invalid length of batch rpc result: " + str2);
            }
            m19236k2(BsLamp2Service.C7703a1.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), jSONArray.getString(12));
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
                mo27560F1().getProperties(new C6381k());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6364a(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6366b(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6368c(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6370d(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31853B()) {
            try {
                mo27560F1().setScene("color", Long.valueOf((long) (yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) yVar.mo31874f()), new C6372e(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31891w()) {
            try {
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31879k()), Long.valueOf((long) yVar.mo31880l()), yVar.mo31882n(), new C6374f(yVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C6376g(yVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f13402G;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("Hue").getInternalName(), mo27560F1().getService().getProperty("Sat").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("ColorMode").getInternalName(), mo27560F1().getService().getProperty("Rgb").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("MusicEnable").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName()};
    }
}
