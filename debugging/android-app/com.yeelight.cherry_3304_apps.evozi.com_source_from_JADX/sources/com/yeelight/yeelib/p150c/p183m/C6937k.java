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
import com.yeelight.yeelib.device.xiaomi.Ceiling4Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling4Device;
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

/* renamed from: com.yeelight.yeelib.c.m.k */
public class C6937k extends C6017a {

    /* renamed from: H */
    public static final String f14289H = "k";

    /* renamed from: A */
    CompletionHandler f14290A = new C6973u(this);

    /* renamed from: B */
    CompletionHandler f14291B = new C6974v(this);

    /* renamed from: G */
    Ceiling4Service.C8194x1 f14292G = new C6975w();

    /* renamed from: com.yeelight.yeelib.c.m.k$a */
    class C6938a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14293a;

        C6938a(int i) {
            this.f14293a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27707p0(this.f14293a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$a0 */
    class C6939a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14295a;

        C6939a0(boolean z) {
            this.f14295a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27640G0(this.f14295a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$b */
    class C6940b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14297a;

        C6940b(C9856y yVar) {
            this.f14297a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27654N0(this.f14297a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$b0 */
    class C6941b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14299a;

        /* renamed from: b */
        final /* synthetic */ String f14300b;

        /* renamed from: c */
        final /* synthetic */ String f14301c;

        /* renamed from: d */
        final /* synthetic */ int f14302d;

        C6941b0(boolean z, String str, String str2, int i) {
            this.f14299a = z;
            this.f14300b = str;
            this.f14301c = str2;
            this.f14302d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27640G0(this.f14299a);
            C6937k.this.mo23408d0().mo27638F0(this.f14300b);
            C6937k.this.mo23408d0().mo27636E0(this.f14301c);
            C6937k.this.mo23408d0().mo27634D0(this.f14302d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$c */
    class C6942c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14304a;

        C6942c(C9856y yVar) {
            this.f14304a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27654N0(this.f14304a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$c0 */
    class C6943c0 implements CompletionHandler {
        C6943c0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27648K0(false);
            C6937k.this.mo27591k2().mo27611p(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$d */
    class C6944d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14307a;

        C6944d(C9856y yVar) {
            this.f14307a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27654N0(this.f14307a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$d0 */
    class C6945d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f14309a;

        /* renamed from: b */
        final /* synthetic */ String f14310b;

        /* renamed from: c */
        final /* synthetic */ int f14311c;

        C6945d0(String str, String str2, int i) {
            this.f14309a = str;
            this.f14310b = str2;
            this.f14311c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27638F0(this.f14309a);
            C6937k.this.mo23408d0().mo27636E0(this.f14310b);
            C6937k.this.mo23408d0().mo27634D0(this.f14311c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$e */
    class C6946e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14313a;

        C6946e(C9856y yVar) {
            this.f14313a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27654N0(this.f14313a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$e0 */
    class C6947e0 implements CompletionHandler {
        C6947e0(C6937k kVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$f */
    class C6948f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14315a;

        C6948f(C9856y yVar) {
            this.f14315a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27654N0(this.f14315a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$f0 */
    class C6949f0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14317a;

        C6949f0(int i) {
            this.f14317a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27648K0(true);
            C6937k.this.mo27591k2().mo27611p(true);
            C6937k.this.mo23352w1(C6024e.C6028d.values()[this.f14317a]);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$g */
    class C6950g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14319a;

        C6950g(C9856y yVar) {
            this.f14319a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27654N0(this.f14319a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$g0 */
    class C6951g0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14321a;

        C6951g0(int i) {
            this.f14321a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openBgWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo27591k2().mo27605j(true);
            C6937k.this.mo27591k2().mo27612q(C6937k.this.mo23433j1(this.f14321a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$h */
    class C6952h implements Ceiling4Service.C8179s1 {
        C6952h() {
        }

        /* renamed from: a */
        public void mo28479a(Ceiling4Service.C8188v1 v1Var, Ceiling4Service.C8191w1 w1Var, Ceiling4Service.C8193x0 x0Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            String str4 = "null";
            sb.append(w1Var != null ? w1Var.name() : str4);
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("main_power: ");
            sb2.append(v1Var != null ? v1Var.name() : str4);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bg_power: ");
            if (x0Var != null) {
                str4 = x0Var.name();
            }
            sb3.append(str4);
            sb3.toString();
            "bright: " + l;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("bg_bright: ");
            Long l15 = l2;
            sb4.append(l15);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("ct: ");
            Long l16 = l3;
            sb5.append(l16);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("bg_ct: ");
            Long l17 = l4;
            sb6.append(l17);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("lanMode: ");
            Long l18 = l6;
            sb7.append(l18);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("saveState: ");
            Long l19 = l7;
            sb8.append(l19);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("delayoff: ");
            Long l20 = l5;
            sb9.append(l20);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("flowParams: ");
            String str5 = str;
            sb10.append(str5);
            sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("bg_flowParams: ");
            String str6 = str2;
            sb11.append(str6);
            sb11.toString();
            "nLBright: " + l9;
            "nightTimeInfo : " + str3;
            "miBandSleep : " + l10;
            "flowing : " + l12;
            "bg_flowing : " + l13;
            "onFromPower : " + l8;
            "bg_rgb: " + l11;
            "bg_proact: " + l14;
            C6937k.this.m20536r2(v1Var, w1Var, x0Var, l, l15, l16, l17, l20, str5, str6, l18, l19, l8, l9, str3, l10, l11, l12, l13, l14);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$h0 */
    class C6953h0 implements CompletionHandler {
        C6953h0(C6937k kVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$i */
    class C6954i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14324a;

        C6954i(C9856y yVar) {
            this.f14324a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo27591k2().mo27613r(this.f14324a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$i0 */
    class C6955i0 implements C6006h.C6016j {
        C6955i0() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6937k.this.f14292G.mo28481a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6937k.this.f14292G.mo28488h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
            C6937k.this.f14292G.mo28491k(l);
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C6937k.this.f14292G.mo28495o(Ceiling4Service.C8191w1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$j */
    class C6956j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14327a;

        C6956j(C9856y yVar) {
            this.f14327a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27654N0(this.f14327a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$j0 */
    class C6957j0 implements C6006h.C6014h {
        C6957j0() {
        }

        /* renamed from: j */
        public void mo27578j(Long l) {
            C6937k.this.f14292G.mo28490j(l);
        }

        /* renamed from: l */
        public void mo27579l(Long l) {
            C6937k.this.f14292G.mo28492l(l);
        }

        /* renamed from: n */
        public void mo27580n(Long l) {
            C6937k.this.f14292G.mo28494n(l);
        }

        /* renamed from: o */
        public void mo27581o(C6006h.C6015i iVar) {
            C6937k.this.f14292G.mo28497q(Ceiling4Service.C8193x0.valueOf(iVar.toString()));
        }

        /* renamed from: p */
        public void mo27582p(C6006h.C6015i iVar) {
            C6937k.this.f14292G.mo28496p(Ceiling4Service.C8188v1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$k */
    class C6958k implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14330a;

        C6958k(C9856y yVar) {
            this.f14330a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo27591k2().mo27613r(this.f14330a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$k0 */
    static /* synthetic */ class C6959k0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14332a;

        /* renamed from: b */
        static final /* synthetic */ int[] f14333b;

        /* renamed from: c */
        static final /* synthetic */ int[] f14334c;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x0[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8193x0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14334c = r0
                r1 = 1
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x0 r2 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8193x0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f14334c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x0 r3 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8193x0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$w1[] r2 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8191w1.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f14333b = r2
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$w1 r3 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8191w1.on     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f14333b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$w1 r3 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8191w1.off     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$v1[] r2 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8188v1.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f14332a = r2
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$v1 r3 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8188v1.on     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f14332a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$v1 r2 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8188v1.off     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6937k.C6959k0.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$l */
    class C6960l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14335a;

        C6960l(C9856y yVar) {
            this.f14335a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo27591k2().mo27613r(this.f14335a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$l0 */
    class C6961l0 implements CompletionHandler {
        C6961l0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.openBg --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo27591k2().mo27605j(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$m */
    class C6962m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14338a;

        C6962m(C9856y yVar) {
            this.f14338a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo27591k2().mo27613r(this.f14338a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$m0 */
    class C6963m0 implements CompletionHandler {
        C6963m0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.closeBg --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo27591k2().mo27605j(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$n */
    class C6964n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14341a;

        C6964n(C9856y yVar) {
            this.f14341a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo27591k2().mo27613r(this.f14341a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$n0 */
    class C6965n0 implements CompletionHandler {
        C6965n0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$o */
    class C6966o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14344a;

        C6966o(C9856y yVar) {
            this.f14344a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27654N0(this.f14344a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$o0 */
    class C6967o0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14346a;

        C6967o0(long j) {
            this.f14346a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27697k0(this.f14346a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$p */
    class C6968p implements CompletionHandler {
        C6968p(C6937k kVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$q */
    class C6969q implements CompletionHandler {
        C6969q() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27652M0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$r */
    class C6970r implements CompletionHandler {
        C6970r(C6937k kVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$s */
    class C6971s implements CompletionHandler {
        C6971s() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27648K0(true);
            C6937k.this.mo27591k2().mo27611p(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$t */
    class C6972t implements CompletionHandler {
        C6972t() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$u */
    class C6973u implements CompletionHandler {
        C6973u(C6937k kVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$v */
    class C6974v implements CompletionHandler {
        C6974v(C6937k kVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$w */
    class C6975w implements Ceiling4Service.C8194x1 {
        C6975w() {
        }

        /* renamed from: a */
        public void mo28481a(Long l) {
            "onBrightChanged: " + l;
            C6937k.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28482b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6937k.this.mo23408d0().mo27710r(2) == null) {
                C6937k.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6937k.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28483c(Long l) {
            "onFlowingChanged: " + l;
            C6937k.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28484d(Long l) {
            "onSaveStateChanged: " + l;
            C6937k.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28485e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6937k.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28486f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6937k.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28487g(Long l) {
            "onLanModeChanged: " + l;
            C6937k.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28488h(Long l) {
            "onCtScaleChanged: " + l;
            C6937k.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28489i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6937k.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6937k.this.mo23408d0().mo27640G0(true);
                }
                C6937k.this.mo23408d0().mo27638F0(split[1]);
                C6937k.this.mo23408d0().mo27636E0(split[2]);
                C6937k.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C6937k.f14289H;
                "start = " + C6937k.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6937k.this.mo23408d0().mo27631C() + ", " + C6937k.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28490j(Long l) {
            "onBgCtChanged: " + l;
            C6937k.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: k */
        public void mo28491k(Long l) {
            "onNLBrightChanged: " + l;
            if (l.longValue() != 0) {
                C6937k.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
                C6937k.this.mo23408d0().mo27642H0(l.longValue());
                return;
            }
            C6937k.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: l */
        public void mo28492l(Long l) {
            "onBgBrightChanged: " + l;
            C6937k.this.mo27591k2().mo27606k(l.intValue());
        }

        /* renamed from: m */
        public void mo28493m(Long l) {
            "onMiBandSleepChanged: " + l;
            C6937k.this.mo23408d0().mo27690h(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo28494n(Long l) {
            "onBgRgbChanged: " + l;
            C6937k.this.mo27591k2().mo27607l(l.intValue());
        }

        /* renamed from: o */
        public void mo28495o(Ceiling4Service.C8191w1 w1Var) {
            C6024e eVar;
            "onPowerSwitched: " + w1Var.name();
            int i = C6959k0.f14333b[w1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6937k.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6937k.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: p */
        public void mo28496p(Ceiling4Service.C8188v1 v1Var) {
            C6018b bVar;
            "onMainPowerSwitched: " + v1Var.name();
            int i = C6959k0.f14332a[v1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C6937k.this.mo27591k2();
            } else if (i == 2) {
                bVar = C6937k.this.mo27591k2();
                z = false;
            } else {
                return;
            }
            bVar.mo27611p(z);
        }

        /* renamed from: q */
        public void mo28497q(Ceiling4Service.C8193x0 x0Var) {
            C6018b bVar;
            "onBgPowerChanged: " + x0Var.name();
            int i = C6959k0.f14334c[x0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C6937k.this.mo27591k2();
            } else if (i == 2) {
                bVar = C6937k.this.mo27591k2();
                z = false;
            } else {
                return;
            }
            bVar.mo27605j(z);
        }

        /* renamed from: r */
        public void mo28498r(String str) {
            "onBgFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6937k.this.mo27591k2().mo27609n(C9827a.m23894b(str));
            }
        }

        /* renamed from: s */
        public void mo28499s(Long l) {
            if (l != null) {
                C6937k.this.mo23408d0().mo27695j0(l.longValue() == 1);
            }
        }

        /* renamed from: t */
        public void mo28500t(Long l) {
            "onBgFlowingChanged: " + l;
            C6937k.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$x */
    class C6976x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14352a;

        C6976x(boolean z) {
            this.f14352a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27682d(this.f14352a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$y */
    class C6977y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14354a;

        C6977y(int i) {
            this.f14354a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27644I0(this.f14354a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.k$z */
    class C6978z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14356a;

        C6978z(boolean z) {
            this.f14356a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6937k.this.mo23408d0().mo27695j0(this.f14356a);
        }
    }

    public C6937k(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m20536r2(Ceiling4Service.C8188v1 v1Var, Ceiling4Service.C8191w1 w1Var, Ceiling4Service.C8193x0 x0Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14) {
        Ceiling4Service.C8188v1 v1Var2 = v1Var;
        Ceiling4Service.C8191w1 w1Var2 = w1Var;
        Ceiling4Service.C8193x0 x0Var2 = x0Var;
        boolean z = true;
        if (w1Var2 != null) {
            mo23408d0().mo27648K0(w1Var2 == Ceiling4Service.C8191w1.on);
        }
        if (v1Var2 != null) {
            mo27591k2().mo27611p(v1Var2 == Ceiling4Service.C8188v1.on);
        }
        if (x0Var2 != null) {
            mo27591k2().mo27605j(x0Var2 == Ceiling4Service.C8193x0.on);
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
        if (l9.longValue() == 0) {
            mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        } else {
            mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
            mo23408d0().mo27642H0(l9.longValue());
        }
        String[] split = str3.split("\\|");
        if (split.length == 4) {
            if (split[0].equals("disable")) {
                mo23408d0().mo27640G0(false);
            } else if (split[0].equals("enable")) {
                mo23408d0().mo27640G0(true);
            }
            mo23408d0().mo27638F0(split[1]);
            mo23408d0().mo27636E0(split[2]);
            mo23408d0().mo27634D0(Integer.parseInt(split[3]));
            "start = " + mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + mo23408d0().mo27631C() + ", " + mo23408d0().mo27629B();
        }
        mo23408d0().mo27682d(l6 != null && l6.longValue() == 1);
        mo23408d0().mo27690h(l10 != null && l10.longValue() == 1);
        mo23408d0().mo27652M0(l7 != null && l7.longValue() == 1);
        if (!str.isEmpty()) {
            mo23408d0().mo27713s0(C9827a.m23894b(str));
        }
        if (!str2.isEmpty()) {
            mo27591k2().mo27609n(C9827a.m23894b(str2));
        }
        if (l13 != null) {
            mo27591k2().mo27610o(l13.longValue() != 0);
        }
        if (l12 != null) {
            mo23408d0().mo27715t0(l12.longValue() != 0);
        }
        if (l11 != null) {
            mo27591k2().mo27607l(l11.intValue());
        }
        if (l14 != null) {
            C6024e d0 = mo23408d0();
            if (l14.longValue() != 1) {
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
            mo27560F1().toggle(new C6965n0());
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
            return R$drawable.icon_yeelight_device_badge_eos_pro_small;
        }
        String T = mo23395T();
        char c = 65535;
        int hashCode = T.hashCode();
        if (hashCode != -1462015182) {
            if (hashCode != -1462015160) {
                if (hashCode == 922669546 && T.equals("yeelink.light.ceiling4")) {
                    c = 0;
                }
            } else if (T.equals("yeelink.light.ceiling20")) {
                c = 2;
            }
        } else if (T.equals("yeelink.light.ceiling19")) {
            c = 1;
        }
        return c != 0 ? c != 1 ? c != 2 ? R$drawable.icon_yeelight_device_badge_eos_pro_small : R$drawable.icon_yeelight_device_badge_ceiling20_small : R$drawable.icon_yeelight_device_badge_ceiling19_small : R$drawable.icon_yeelight_device_badge_eos_pro_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_eos_pro_big;
        }
        String T = mo23395T();
        char c = 65535;
        int hashCode = T.hashCode();
        if (hashCode != -1462015182) {
            if (hashCode != -1462015160) {
                if (hashCode == 922669546 && T.equals("yeelink.light.ceiling4")) {
                    c = 0;
                }
            } else if (T.equals("yeelink.light.ceiling20")) {
                c = 2;
            }
        } else if (T.equals("yeelink.light.ceiling19")) {
            c = 1;
        }
        return c != 0 ? c != 1 ? c != 2 ? R$drawable.icon_yeelight_device_badge_eos_pro_big : R$drawable.icon_yeelight_device_badge_ceiling20_big : R$drawable.icon_yeelight_device_badge_ceiling19_big : R$drawable.icon_yeelight_device_badge_eos_pro_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6955i0();
        this.f12724y = new C6957j0();
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
            mo27560F1().sendCmd(Ceiling4Service.C8196y0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6976x(z));
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
            mo27560F1().sendCmd(Ceiling4Service.C8196y0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C6945d0(str, str2, i));
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
            mo27560F1().sendCmd(Ceiling4Service.C8196y0.cfg_init_power, String.valueOf(i), new C6977y(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Ceiling4Service.C8196y0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6969q());
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
        return mo28478s2(this.f14291B, this.f14292G);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14290A);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14289H, "Invalid handler!");
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

    /* renamed from: X */
    public String mo23401X() {
        return "setDevPower";
    }

    /* renamed from: a2 */
    public boolean mo27734a2(boolean z) {
        "enableMiBandSleep --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(Ceiling4Service.C8196y0.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6947e0(this));
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
            mo27560F1().setPower(Ceiling4Service.C8191w1.off, new C6943c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6972t());
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
            mo27560F1().sendCmd(Ceiling4Service.C8196y0.nighttime, z ? "enable" : "disable", new C6939a0(z));
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
            mo27560F1().sendCmd(Ceiling4Service.C8196y0.pseudo_beacon, "4097|" + i, new C6953h0(this));
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
            Ceiling4Service q2 = mo27560F1();
            Ceiling4Service.C8196y0 y0Var = Ceiling4Service.C8196y0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            q2.sendCmd(y0Var, sb.toString(), new C6941b0(z, str, str2, i));
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
            mo27560F1().setBgPower(Ceiling4Service.C8193x0.off, new C6963m0());
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
            mo27560F1().setPower(Ceiling4Service.C8191w1.on, new C6971s());
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
            mo27560F1().setBgPower(Ceiling4Service.C8193x0.on, new C6961l0());
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
            mo27560F1().openWithMode(Ceiling4Service.C8188v1.on, Ceiling4Service.C8198z0.smooth, 500L, Long.valueOf((long) i), new C6949f0(i));
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
            mo27560F1().openBgWithMode(Ceiling4Service.C8193x0.on, Ceiling4Service.C8198z0.smooth, 500L, Long.valueOf((long) i), new C6951g0(i));
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
            mo27560F1().sendCmd(Ceiling4Service.C8196y0.cfg_bg_proact, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6978z(z));
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
                mo27560F1().setBgFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6954i(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setBgScene("off", 0L, 0L, new C6956j(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setBgScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6958k(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setBgScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6960l(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31853B()) {
            try {
                mo27560F1().setBgScene("color", Long.valueOf((long) (yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) yVar.mo31874f()), new C6962m(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31891w()) {
            try {
                mo27560F1().setBgFlowScene("cf", Long.valueOf((long) yVar.mo31879k()), Long.valueOf((long) yVar.mo31880l()), yVar.mo31882n(), new C6964n(yVar));
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
                mo27560F1().setSceneBundle(a0.get(0).mo31742Y(), a0.get(1).mo31742Y(), new C6966o(yVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f14289H;
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
            mo27560F1().setBright(Long.valueOf(j), Ceiling4Service.C8198z0.smooth, 500L, new C6967o0(j));
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
    public Ceiling4Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice != null && (abstractDevice instanceof YeelightCeiling4Device)) {
            return ((YeelightCeiling4Device) abstractDevice).mDeviceService;
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
            mo27560F1().setCt(Long.valueOf((long) i), Ceiling4Service.C8198z0.smooth, 500L, new C6938a(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s2 */
    public boolean mo28478s2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling4Service.C8194x1)) {
            C4308b.m12139r(f14289H, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Ceiling4Service.C8194x1) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6968p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6970r(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14290A);
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
            if (jSONArray.length() != 20) {
                C4308b.m12139r("BATCH_RPC", "CeilingDevice, Invalid length of batch rpc result: " + str2);
            }
            m20536r2(Ceiling4Service.C8188v1.valueOf(jSONArray.getString(0)), Ceiling4Service.C8191w1.valueOf(jSONArray.getString(1)), Ceiling4Service.C8193x0.valueOf(jSONArray.getString(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), jSONArray.getString(14), Long.valueOf(jSONArray.getLong(15)), Long.valueOf(jSONArray.getLong(16)), Long.valueOf(jSONArray.getLong(17)), Long.valueOf(jSONArray.getLong(18)), Long.valueOf(jSONArray.getLong(19)));
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
                mo27560F1().getProperties(new C6952h());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6940b(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6942c(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6944d(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6946e(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C6948f(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31894z()) {
            List<C9849r> a0 = ((C9834e) yVar).mo31758a0();
            if (a0.size() != 2) {
                return false;
            }
            try {
                mo27560F1().setSceneBundle(a0.get(0).mo31742Y(), a0.get(1).mo31742Y(), new C6950g(yVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str = f14289H;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("MainPower").getInternalName(), mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("BgPower").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("BgBright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("BgCt").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("BgFlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("NLBright").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("MiBandSleep").getInternalName(), mo27560F1().getService().getProperty("BgRgb").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("BgFlowing").getInternalName(), mo27560F1().getService().getProperty("BgProact").getInternalName()};
    }
}
