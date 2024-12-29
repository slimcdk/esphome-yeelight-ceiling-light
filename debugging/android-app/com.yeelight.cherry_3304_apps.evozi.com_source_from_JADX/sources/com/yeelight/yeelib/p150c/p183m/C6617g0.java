package com.yeelight.yeelib.p150c.p183m;

import androidx.core.view.ViewCompat;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.Lamp15Service;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp15Device;
import com.yeelight.yeelib.p150c.C4191d;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6017a;
import com.yeelight.yeelib.p150c.p151i.C6018b;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9834e;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p185d.C7565b;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.c.m.g0 */
public class C6617g0 extends C6017a {

    /* renamed from: H */
    public static final String f13815H = "g0";

    /* renamed from: A */
    CompletionHandler f13816A = new C6647t(this);

    /* renamed from: B */
    CompletionHandler f13817B = new C6648u(this);

    /* renamed from: G */
    Lamp15Service.C8956q1 f13818G = new C6649v();

    /* renamed from: com.yeelight.yeelib.c.m.g0$a */
    class C6618a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13819a;

        C6618a(int i) {
            this.f13819a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27707p0(this.f13819a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$a0 */
    class C6619a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13821a;

        C6619a0(int i) {
            this.f13821a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openBgWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo27591k2().mo27605j(true);
            C6617g0.this.mo27591k2().mo27612q(C6617g0.this.mo23433j1(this.f13821a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$b */
    class C6620b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13823a;

        C6620b(C9856y yVar) {
            this.f13823a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27654N0(this.f13823a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$b0 */
    class C6621b0 implements CompletionHandler {
        C6621b0(C6617g0 g0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$c */
    class C6622c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13825a;

        C6622c(C9856y yVar) {
            this.f13825a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27654N0(this.f13825a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$c0 */
    class C6623c0 implements CompletionHandler {
        C6623c0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27648K0(false);
            C6617g0.this.mo27591k2().mo27611p(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$d */
    class C6624d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13828a;

        C6624d(C9856y yVar) {
            this.f13828a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27654N0(this.f13828a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$d0 */
    class C6625d0 implements C6006h.C6016j {
        C6625d0() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6617g0.this.f13818G.mo28294a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6617g0.this.f13818G.mo28301h(l);
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
            C6617g0.this.f13818G.mo28304k(Lamp15Service.C8953p1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$e */
    class C6626e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13831a;

        C6626e(C9856y yVar) {
            this.f13831a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27654N0(this.f13831a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$e0 */
    class C6627e0 implements C6006h.C6014h {
        C6627e0() {
        }

        /* renamed from: j */
        public void mo27578j(Long l) {
            C6617g0.this.f13818G.mo28303j(l);
        }

        /* renamed from: l */
        public void mo27579l(Long l) {
            C6617g0.this.f13818G.mo28305l(l);
        }

        /* renamed from: n */
        public void mo27580n(Long l) {
            C6617g0.this.f13818G.mo28307n(l);
        }

        /* renamed from: o */
        public void mo27581o(C6006h.C6015i iVar) {
            C6617g0.this.f13818G.mo28302i(Lamp15Service.C8962t0.valueOf(iVar.toString()));
        }

        /* renamed from: p */
        public void mo27582p(C6006h.C6015i iVar) {
            C6617g0.this.f13818G.mo28306m(Lamp15Service.C8950o1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$f */
    class C6628f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13834a;

        C6628f(C9856y yVar) {
            this.f13834a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27654N0(this.f13834a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$f0 */
    static /* synthetic */ class C6629f0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f13836a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13837b;

        /* renamed from: c */
        static final /* synthetic */ int[] f13838c;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$t0[] r0 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8962t0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13838c = r0
                r1 = 1
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$t0 r2 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8962t0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f13838c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$t0 r3 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8962t0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$p1[] r2 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8953p1.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f13837b = r2
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$p1 r3 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8953p1.on     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f13837b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$p1 r3 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8953p1.off     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$o1[] r2 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8950o1.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f13836a = r2
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$o1 r3 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8950o1.on     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f13836a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$o1 r2 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8950o1.off     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6617g0.C6629f0.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$g */
    class C6630g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13839a;

        C6630g(C9856y yVar) {
            this.f13839a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo27591k2().mo27613r(this.f13839a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$g0 */
    class C6631g0 implements CompletionHandler {
        C6631g0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.openBg --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo27591k2().mo27605j(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$h */
    class C6632h implements Lamp15Service.C8941l1 {
        C6632h() {
        }

        /* renamed from: a */
        public void mo28292a(Lamp15Service.C8950o1 o1Var, Lamp15Service.C8953p1 p1Var, Lamp15Service.C8962t0 t0Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            String str3 = "null";
            sb.append(p1Var != null ? p1Var.name() : str3);
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("main_power: ");
            sb2.append(o1Var != null ? o1Var.name() : str3);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bg_power: ");
            if (t0Var != null) {
                str3 = t0Var.name();
            }
            sb3.append(str3);
            sb3.toString();
            "bright: " + l;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("bg_bright: ");
            Long l13 = l2;
            sb4.append(l13);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("ct: ");
            Long l14 = l3;
            sb5.append(l14);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("bg_ct: ");
            Long l15 = l4;
            sb6.append(l15);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("lanMode: ");
            Long l16 = l6;
            sb7.append(l16);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("saveState: ");
            Long l17 = l7;
            sb8.append(l17);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("delayoff: ");
            Long l18 = l5;
            sb9.append(l18);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("flowParams: ");
            String str4 = str;
            sb10.append(str4);
            sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("bg_flowParams: ");
            String str5 = str2;
            sb11.append(str5);
            sb11.toString();
            "flowing : " + l10;
            "bg_flowing : " + l11;
            "onFromPower : " + l8;
            "bg_rgb: " + l9;
            "bg_proact: " + l12;
            C6617g0.this.m19859r2(o1Var, p1Var, t0Var, l, l13, l14, l15, l18, str4, str5, l16, l17, l8, l9, l10, l11, l12);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$h0 */
    class C6633h0 implements CompletionHandler {
        C6633h0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.closeBg --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo27591k2().mo27605j(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$i */
    class C6634i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13844a;

        C6634i(C9856y yVar) {
            this.f13844a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27654N0(this.f13844a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$i0 */
    class C6635i0 implements CompletionHandler {
        C6635i0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$j */
    class C6636j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13847a;

        C6636j(C9856y yVar) {
            this.f13847a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo27591k2().mo27613r(this.f13847a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$j0 */
    class C6637j0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f13849a;

        C6637j0(long j) {
            this.f13849a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27697k0(this.f13849a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$k */
    class C6638k implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13851a;

        C6638k(C9856y yVar) {
            this.f13851a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo27591k2().mo27613r(this.f13851a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$l */
    class C6639l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13853a;

        C6639l(C9856y yVar) {
            this.f13853a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo27591k2().mo27613r(this.f13853a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$m */
    class C6640m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13855a;

        C6640m(C9856y yVar) {
            this.f13855a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo27591k2().mo27613r(this.f13855a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$n */
    class C6641n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13857a;

        C6641n(C9856y yVar) {
            this.f13857a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27654N0(this.f13857a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$o */
    class C6642o implements CompletionHandler {
        C6642o(C6617g0 g0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$p */
    class C6643p implements CompletionHandler {
        C6643p() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27652M0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$q */
    class C6644q implements CompletionHandler {
        C6644q(C6617g0 g0Var) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$r */
    class C6645r implements CompletionHandler {
        C6645r() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$s */
    class C6646s implements CompletionHandler {
        C6646s() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27648K0(true);
            C6617g0.this.mo27591k2().mo27611p(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$t */
    class C6647t implements CompletionHandler {
        C6647t(C6617g0 g0Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$u */
    class C6648u implements CompletionHandler {
        C6648u(C6617g0 g0Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$v */
    class C6649v implements Lamp15Service.C8956q1 {
        C6649v() {
        }

        /* renamed from: a */
        public void mo28294a(Long l) {
            "onBrightChanged: " + l;
            C6617g0.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28295b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6617g0.this.mo23408d0().mo27710r(2) == null) {
                C6617g0.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6617g0.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28296c(Long l) {
            "onFlowingChanged: " + l;
            C6617g0.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28297d(Long l) {
            "onSaveStateChanged: " + l;
            C6617g0.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28298e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6617g0.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28299f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6617g0.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28300g(Long l) {
            "onLanModeChanged: " + l;
            C6617g0.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28301h(Long l) {
            "onCtScaleChanged: " + l;
            C6617g0.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28302i(Lamp15Service.C8962t0 t0Var) {
            C6018b bVar;
            "onBgPowerChanged: " + t0Var.name();
            int i = C6629f0.f13838c[t0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C6617g0.this.mo27591k2();
            } else if (i == 2) {
                bVar = C6617g0.this.mo27591k2();
                z = false;
            } else {
                return;
            }
            bVar.mo27605j(z);
        }

        /* renamed from: j */
        public void mo28303j(Long l) {
            "onBgCtChanged: " + l;
            C6617g0.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: k */
        public void mo28304k(Lamp15Service.C8953p1 p1Var) {
            C6024e eVar;
            "onPowerSwitched: " + p1Var.name();
            int i = C6629f0.f13837b[p1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6617g0.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6617g0.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: l */
        public void mo28305l(Long l) {
            "onBgBrightChanged: " + l;
            C6617g0.this.mo27591k2().mo27606k(l.intValue());
        }

        /* renamed from: m */
        public void mo28306m(Lamp15Service.C8950o1 o1Var) {
            C6018b bVar;
            "onMainPowerSwitched: " + o1Var.name();
            int i = C6629f0.f13836a[o1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C6617g0.this.mo27591k2();
            } else if (i == 2) {
                bVar = C6617g0.this.mo27591k2();
                z = false;
            } else {
                return;
            }
            bVar.mo27611p(z);
        }

        /* renamed from: n */
        public void mo28307n(Long l) {
            "onBgRgbChanged: " + l;
            C6617g0.this.mo27591k2().mo27607l(l.intValue());
        }

        /* renamed from: r */
        public void mo28308r(String str) {
            "onBgFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6617g0.this.mo27591k2().mo27609n(C9827a.m23894b(str));
            }
        }

        /* renamed from: s */
        public void mo28309s(Long l) {
            if (l != null) {
                C6617g0.this.mo23408d0().mo27695j0(l.longValue() == 1);
            }
        }

        /* renamed from: t */
        public void mo28310t(Long l) {
            "onBgFlowingChanged: " + l;
            C6617g0.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$w */
    class C6650w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13863a;

        C6650w(boolean z) {
            this.f13863a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27682d(this.f13863a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$x */
    class C6651x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13865a;

        C6651x(int i) {
            this.f13865a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27644I0(this.f13865a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$y */
    class C6652y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13867a;

        C6652y(boolean z) {
            this.f13867a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27695j0(this.f13867a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g0$z */
    class C6653z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13869a;

        C6653z(int i) {
            this.f13869a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6617g0.this.mo23408d0().mo27648K0(true);
            C6617g0.this.mo27591k2().mo27611p(true);
            C6617g0.this.mo23352w1(C6024e.C6028d.values()[this.f13869a]);
        }
    }

    public C6617g0(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        C7565b bVar = C7565b.DEVICE_EVENT_OPEN;
        C7565b bVar2 = C7565b.DEVICE_EVENT_CLOSE;
        C7565b bVar3 = C7565b.DEVICE_EVENT_BRIGHT_CHANGE;
        C7563a aVar = C7563a.ON;
        C7563a aVar2 = C7563a.OFF;
        C7563a aVar3 = C7563a.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public void m19859r2(Lamp15Service.C8950o1 o1Var, Lamp15Service.C8953p1 p1Var, Lamp15Service.C8962t0 t0Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12) {
        Lamp15Service.C8950o1 o1Var2 = o1Var;
        Lamp15Service.C8953p1 p1Var2 = p1Var;
        Lamp15Service.C8962t0 t0Var2 = t0Var;
        boolean z = true;
        if (p1Var2 != null) {
            mo23408d0().mo27648K0(p1Var2 == Lamp15Service.C8953p1.on);
        }
        if (o1Var2 != null) {
            mo27591k2().mo27611p(o1Var2 == Lamp15Service.C8950o1.on);
        }
        if (t0Var2 != null) {
            mo27591k2().mo27605j(t0Var2 == Lamp15Service.C8962t0.on);
        }
        if (l3 != null) {
            mo23408d0().mo27707p0(l3.intValue());
        }
        if (l4 != null) {
            mo27591k2().mo27608m(l4.intValue());
        }
        if (l != null) {
            mo23408d0().mo27697k0(l.longValue());
        }
        if (l2 != null) {
            mo27591k2().mo27606k(l2.intValue());
        }
        if (l5 != null) {
            if (mo23408d0().mo27710r(2) == null) {
                mo23408d0().mo27676a(new C7554e(l5.intValue(), l5.intValue()));
            } else {
                mo23408d0().mo27670V0(l5.intValue());
            }
        }
        if (l8 != null) {
            mo23408d0().mo27644I0(l8.intValue());
        }
        mo23408d0().mo27682d(l6 != null && l6.longValue() == 1);
        mo23408d0().mo27652M0(l7 != null && l7.longValue() == 1);
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
        if (!str2.isEmpty()) {
            mo27591k2().mo27609n(C9827a.m23894b(str2));
        }
        if (l11 != null) {
            mo27591k2().mo27610o(l11.longValue() != 0);
        }
        if (l10 != null) {
            mo23408d0().mo27715t0(l10.longValue() != 0);
        }
        if (l9 != null) {
            mo27591k2().mo27607l(l9.intValue());
        }
        if (l12 != null) {
            C6024e d0 = mo23408d0();
            if (l12.longValue() != 1) {
                z = false;
            }
            d0.mo27695j0(z);
        }
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6635i0());
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
        return R$drawable.icon_yeelight_device_badge_lamp15_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_lamp15_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6625d0();
        this.f12724y = new C6627e0();
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
            mo27560F1().sendCmd(Lamp15Service.C8964u0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6650w(z));
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
            mo27560F1().sendCmd(Lamp15Service.C8964u0.cfg_init_power, String.valueOf(i), new C6651x(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Lamp15Service.C8964u0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6643p());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_ceiling) : U;
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28291s2(this.f13817B, this.f13818G);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13816A);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13815H, "Invalid handler!");
        }
        if (this.f7251n == null) {
            return true;
        }
        try {
            if (mo27560F1() == null) {
                return true;
            }
            mo27560F1().unsubscribeNotifications((CompletionHandler) obj);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: X */
    public String mo23401X() {
        return "setDevPower";
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
            mo27560F1().setPower(Lamp15Service.C8953p1.off, new C6623c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6645r());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: f2 */
    public boolean mo27737f2(int i) {
        "sendRemoteKey --> Invoke, enable : " + i;
        try {
            mo27560F1().sendCmd(Lamp15Service.C8964u0.pseudo_beacon, "4097|" + i, new C6621b0(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: i2 */
    public boolean mo27589i2() {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23312N1();
        }
        try {
            mo27560F1().setBgPower(Lamp15Service.C8962t0.off, new C6633h0());
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
            mo27560F1().setPower(Lamp15Service.C8953p1.on, new C6646s());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo27592l2() {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23318U1();
        }
        try {
            mo27560F1().setBgPower(Lamp15Service.C8962t0.on, new C6631g0());
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
            mo27560F1().openWithMode(Lamp15Service.C8950o1.on, Lamp15Service.C8966v0.smooth, 500L, Long.valueOf((long) i), new C6653z(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: m2 */
    public boolean mo27593m2(int i) {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23321W1(i);
        }
        try {
            mo27560F1().openBgWithMode(Lamp15Service.C8962t0.on, Lamp15Service.C8966v0.smooth, 500L, Long.valueOf((long) i), new C6619a0(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: n2 */
    public boolean mo27594n2(boolean z) {
        "setBgProact --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(Lamp15Service.C8964u0.cfg_bg_proact, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6652y(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: o2 */
    public boolean mo27595o2(C9856y yVar) {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23304F2(yVar)) {
            return true;
        }
        if (yVar.mo31890v()) {
            try {
                mo27560F1().setBgFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6630g(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setBgScene("off", 0L, 0L, new C6634i(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setBgScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6636j(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setBgScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6638k(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31853B()) {
            try {
                mo27560F1().setBgScene("color", Long.valueOf((long) (yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) yVar.mo31874f()), new C6639l(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31891w()) {
            try {
                mo27560F1().setBgFlowScene("cf", Long.valueOf((long) yVar.mo31879k()), Long.valueOf((long) yVar.mo31880l()), yVar.mo31882n(), new C6640m(yVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else if (yVar.mo31894z()) {
            List<C9849r> a0 = ((C9834e) yVar).mo31758a0();
            if (a0.size() != 2) {
                return false;
            }
            try {
                mo27560F1().setSceneBundle(a0.get(0).mo31742Y(), a0.get(1).mo31742Y(), new C6641n(yVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f13815H;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        if (super.mo23340p1(j)) {
            return true;
        }
        try {
            mo27560F1().setBright(Long.valueOf(j), Lamp15Service.C8966v0.smooth, 500L, new C6637j0(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        return false;
    }

    /* renamed from: q2 */
    public Lamp15Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice != null && (abstractDevice instanceof YeelightLamp15Device)) {
            return ((YeelightLamp15Device) abstractDevice).mDeviceService;
        }
        return null;
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
            mo27560F1().setCt(Long.valueOf((long) i), Lamp15Service.C8966v0.smooth, 500L, new C6618a(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s2 */
    public boolean mo28291s2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Lamp15Service.C8956q1)) {
            C4308b.m12139r(f13815H, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Lamp15Service.C8956q1) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6642o(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6644q(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f13816A);
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
                C4308b.m12139r("BATCH_RPC", "CeilingDevice, Invalid length of batch rpc result: " + str2);
            }
            m19859r2(Lamp15Service.C8950o1.valueOf(jSONArray.getString(0)), Lamp15Service.C8953p1.valueOf(jSONArray.getString(1)), Lamp15Service.C8962t0.valueOf(jSONArray.getString(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), Long.valueOf(jSONArray.getLong(14)), Long.valueOf(jSONArray.getLong(15)), Long.valueOf(jSONArray.getLong(16)));
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
                mo27560F1().getProperties(new C6632h());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6620b(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6622c(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6624d(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6626e(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31894z()) {
            List<C9849r> a0 = ((C9834e) yVar).mo31758a0();
            if (a0.size() != 2) {
                return false;
            }
            try {
                mo27560F1().setSceneBundle(a0.get(0).mo31742Y(), a0.get(1).mo31742Y(), new C6628f(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else {
            String str = f13815H;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("MainPower").getInternalName(), mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("BgPower").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("BgBright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("BgCt").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("BgFlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("BgRgb").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("BgFlowing").getInternalName(), mo27560F1().getService().getProperty("BgProact").getInternalName()};
    }
}
