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
import com.yeelight.yeelib.device.xiaomi.Ceiling10Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling10Device;
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

/* renamed from: com.yeelight.yeelib.c.m.g */
public class C6574g extends C6017a {

    /* renamed from: H */
    public static final String f13744H = "g";

    /* renamed from: A */
    CompletionHandler f13745A = new C6611u(this);

    /* renamed from: B */
    CompletionHandler f13746B = new C6612v(this);

    /* renamed from: G */
    Ceiling10Service.C7946z1 f13747G = new C6613w();

    /* renamed from: com.yeelight.yeelib.c.m.g$a */
    class C6575a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13748a;

        C6575a(int i) {
            this.f13748a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27707p0(this.f13748a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$a0 */
    class C6576a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13750a;

        C6576a0(boolean z) {
            this.f13750a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27640G0(this.f13750a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$b */
    class C6577b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13752a;

        C6577b(C9856y yVar) {
            this.f13752a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27654N0(this.f13752a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$b0 */
    class C6578b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13754a;

        /* renamed from: b */
        final /* synthetic */ String f13755b;

        /* renamed from: c */
        final /* synthetic */ String f13756c;

        /* renamed from: d */
        final /* synthetic */ int f13757d;

        C6578b0(boolean z, String str, String str2, int i) {
            this.f13754a = z;
            this.f13755b = str;
            this.f13756c = str2;
            this.f13757d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27640G0(this.f13754a);
            C6574g.this.mo23408d0().mo27638F0(this.f13755b);
            C6574g.this.mo23408d0().mo27636E0(this.f13756c);
            C6574g.this.mo23408d0().mo27634D0(this.f13757d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$c */
    class C6579c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13759a;

        C6579c(C9856y yVar) {
            this.f13759a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27654N0(this.f13759a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$c0 */
    class C6580c0 implements CompletionHandler {
        C6580c0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27648K0(false);
            C6574g.this.mo27591k2().mo27611p(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$d */
    class C6581d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13762a;

        C6581d(C9856y yVar) {
            this.f13762a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27654N0(this.f13762a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$d0 */
    class C6582d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f13764a;

        /* renamed from: b */
        final /* synthetic */ String f13765b;

        /* renamed from: c */
        final /* synthetic */ int f13766c;

        C6582d0(String str, String str2, int i) {
            this.f13764a = str;
            this.f13765b = str2;
            this.f13766c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27638F0(this.f13764a);
            C6574g.this.mo23408d0().mo27636E0(this.f13765b);
            C6574g.this.mo23408d0().mo27634D0(this.f13766c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$e */
    class C6583e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13768a;

        C6583e(C9856y yVar) {
            this.f13768a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27654N0(this.f13768a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$e0 */
    class C6584e0 implements CompletionHandler {
        C6584e0(C6574g gVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$f */
    class C6585f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13770a;

        C6585f(C9856y yVar) {
            this.f13770a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27654N0(this.f13770a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$f0 */
    class C6586f0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13772a;

        C6586f0(boolean z) {
            this.f13772a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27696k(this.f13772a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$g */
    class C6587g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13774a;

        C6587g(C9856y yVar) {
            this.f13774a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27654N0(this.f13774a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$g0 */
    class C6588g0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13776a;

        C6588g0(int i) {
            this.f13776a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27648K0(true);
            C6574g.this.mo27591k2().mo27611p(true);
            C6574g.this.mo23352w1(C6024e.C6028d.values()[this.f13776a]);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$h */
    class C6589h implements Ceiling10Service.C7928t1 {
        C6589h() {
        }

        /* renamed from: a */
        public void mo28267a(Ceiling10Service.C7940x1 x1Var, Ceiling10Service.C7943y1 y1Var, Ceiling10Service.C7942y0 y0Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            String str4 = "null";
            sb.append(y1Var != null ? y1Var.name() : str4);
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("main_power: ");
            sb2.append(x1Var != null ? x1Var.name() : str4);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bg_power: ");
            if (y0Var != null) {
                str4 = y0Var.name();
            }
            sb3.append(str4);
            sb3.toString();
            "bright: " + l;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("bg_bright: ");
            Long l16 = l2;
            sb4.append(l16);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("ct: ");
            Long l17 = l3;
            sb5.append(l17);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("bg_ct: ");
            Long l18 = l4;
            sb6.append(l18);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("lanMode: ");
            Long l19 = l6;
            sb7.append(l19);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("saveState: ");
            Long l20 = l7;
            sb8.append(l20);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("delayoff: ");
            Long l21 = l5;
            sb9.append(l21);
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
            "smartSwitch: " + l15;
            C6574g.this.m19778r2(x1Var, y1Var, y0Var, l, l16, l17, l18, l21, str5, str6, l19, l20, l8, l9, str3, l10, l11, l12, l13, l14, l15);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$h0 */
    class C6590h0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13779a;

        C6590h0(int i) {
            this.f13779a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openBgWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo27591k2().mo27605j(true);
            C6574g.this.mo27591k2().mo27612q(C6574g.this.mo23433j1(this.f13779a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$i */
    class C6591i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13781a;

        C6591i(C9856y yVar) {
            this.f13781a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo27591k2().mo27613r(this.f13781a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$i0 */
    class C6592i0 implements CompletionHandler {
        C6592i0(C6574g gVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$j */
    class C6593j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13783a;

        C6593j(C9856y yVar) {
            this.f13783a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27654N0(this.f13783a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$j0 */
    class C6594j0 implements C6006h.C6016j {
        C6594j0() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6574g.this.f13747G.mo28269a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6574g.this.f13747G.mo28276h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
            C6574g.this.f13747G.mo28279k(l);
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C6574g.this.f13747G.mo28288v(Ceiling10Service.C7943y1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$k */
    class C6595k implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13786a;

        C6595k(C9856y yVar) {
            this.f13786a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo27591k2().mo27613r(this.f13786a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$k0 */
    class C6596k0 implements C6006h.C6014h {
        C6596k0() {
        }

        /* renamed from: j */
        public void mo27578j(Long l) {
            C6574g.this.f13747G.mo28278j(l);
        }

        /* renamed from: l */
        public void mo27579l(Long l) {
            C6574g.this.f13747G.mo28280l(l);
        }

        /* renamed from: n */
        public void mo27580n(Long l) {
            C6574g.this.f13747G.mo28282n(l);
        }

        /* renamed from: o */
        public void mo27581o(C6006h.C6015i iVar) {
            C6574g.this.f13747G.mo28289w(Ceiling10Service.C7942y0.valueOf(iVar.toString()));
        }

        /* renamed from: p */
        public void mo27582p(C6006h.C6015i iVar) {
            C6574g.this.f13747G.mo28287u(Ceiling10Service.C7940x1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$l */
    class C6597l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13789a;

        C6597l(C9856y yVar) {
            this.f13789a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo27591k2().mo27613r(this.f13789a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$l0 */
    static /* synthetic */ class C6598l0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f13791a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13792b;

        /* renamed from: c */
        static final /* synthetic */ int[] f13793c;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y0[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7942y0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13793c = r0
                r1 = 1
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y0 r2 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7942y0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f13793c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y0 r3 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7942y0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y1[] r2 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7943y1.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f13792b = r2
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y1 r3 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7943y1.on     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f13792b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y1 r3 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7943y1.off     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$x1[] r2 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7940x1.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f13791a = r2
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$x1 r3 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7940x1.on     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f13791a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$x1 r2 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7940x1.off     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6574g.C6598l0.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$m */
    class C6599m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13794a;

        C6599m(C9856y yVar) {
            this.f13794a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo27591k2().mo27613r(this.f13794a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$m0 */
    class C6600m0 implements CompletionHandler {
        C6600m0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.openBg --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo27591k2().mo27605j(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$n */
    class C6601n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13797a;

        C6601n(C9856y yVar) {
            this.f13797a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo27591k2().mo27613r(this.f13797a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$n0 */
    class C6602n0 implements CompletionHandler {
        C6602n0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.closeBg --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo27591k2().mo27605j(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$o */
    class C6603o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13800a;

        C6603o(C9856y yVar) {
            this.f13800a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27654N0(this.f13800a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$o0 */
    class C6604o0 implements CompletionHandler {
        C6604o0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$p */
    class C6605p implements CompletionHandler {
        C6605p(C6574g gVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$p0 */
    class C6606p0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f13803a;

        C6606p0(long j) {
            this.f13803a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27697k0(this.f13803a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$q */
    class C6607q implements CompletionHandler {
        C6607q() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27652M0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$r */
    class C6608r implements CompletionHandler {
        C6608r(C6574g gVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$s */
    class C6609s implements CompletionHandler {
        C6609s() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27648K0(true);
            C6574g.this.mo27591k2().mo27611p(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$t */
    class C6610t implements CompletionHandler {
        C6610t() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$u */
    class C6611u implements CompletionHandler {
        C6611u(C6574g gVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$v */
    class C6612v implements CompletionHandler {
        C6612v(C6574g gVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$w */
    class C6613w implements Ceiling10Service.C7946z1 {
        C6613w() {
        }

        /* renamed from: a */
        public void mo28269a(Long l) {
            "onBrightChanged: " + l;
            C6574g.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28270b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6574g.this.mo23408d0().mo27710r(2) == null) {
                C6574g.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6574g.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28271c(Long l) {
            "onFlowingChanged: " + l;
            C6574g.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28272d(Long l) {
            "onSaveStateChanged: " + l;
            C6574g.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28273e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6574g.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28274f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6574g.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28275g(Long l) {
            "onLanModeChanged: " + l;
            C6574g.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28276h(Long l) {
            "onCtScaleChanged: " + l;
            C6574g.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28277i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6574g.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6574g.this.mo23408d0().mo27640G0(true);
                }
                C6574g.this.mo23408d0().mo27638F0(split[1]);
                C6574g.this.mo23408d0().mo27636E0(split[2]);
                C6574g.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C6574g.f13744H;
                "start = " + C6574g.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6574g.this.mo23408d0().mo27631C() + ", " + C6574g.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28278j(Long l) {
            "onBgCtChanged: " + l;
            C6574g.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: k */
        public void mo28279k(Long l) {
            "onNLBrightChanged: " + l;
            if (l.longValue() != 0) {
                C6574g.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
                C6574g.this.mo23408d0().mo27642H0(l.longValue());
                return;
            }
            C6574g.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: l */
        public void mo28280l(Long l) {
            "onBgBrightChanged: " + l;
            C6574g.this.mo27591k2().mo27606k(l.intValue());
        }

        /* renamed from: m */
        public void mo28281m(Long l) {
            "onMiBandSleepChanged: " + l;
            C6574g.this.mo23408d0().mo27690h(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo28282n(Long l) {
            "onBgRgbChanged: " + l;
            C6574g.this.mo27591k2().mo27607l(l.intValue());
        }

        /* renamed from: p */
        public void mo28283p(Long l) {
            "onSmartSwitchChanged: " + l;
            C6574g.this.mo23408d0().mo27696k(l != null && l.longValue() == 1);
        }

        /* renamed from: r */
        public void mo28284r(String str) {
            "onBgFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6574g.this.mo27591k2().mo27609n(C9827a.m23894b(str));
            }
        }

        /* renamed from: s */
        public void mo28285s(Long l) {
            if (l != null) {
                C6574g.this.mo23408d0().mo27695j0(l.longValue() == 1);
            }
        }

        /* renamed from: t */
        public void mo28286t(Long l) {
            "onBgFlowingChanged: " + l;
            C6574g.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: u */
        public void mo28287u(Ceiling10Service.C7940x1 x1Var) {
            C6018b bVar;
            "onMainPowerSwitched: " + x1Var.name();
            int i = C6598l0.f13791a[x1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C6574g.this.mo27591k2();
            } else if (i == 2) {
                bVar = C6574g.this.mo27591k2();
                z = false;
            } else {
                return;
            }
            bVar.mo27611p(z);
        }

        /* renamed from: v */
        public void mo28288v(Ceiling10Service.C7943y1 y1Var) {
            C6024e eVar;
            "onPowerSwitched: " + y1Var.name();
            int i = C6598l0.f13792b[y1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6574g.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6574g.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: w */
        public void mo28289w(Ceiling10Service.C7942y0 y0Var) {
            C6018b bVar;
            "onBgPowerChanged: " + y0Var.name();
            int i = C6598l0.f13793c[y0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C6574g.this.mo27591k2();
            } else if (i == 2) {
                bVar = C6574g.this.mo27591k2();
                z = false;
            } else {
                return;
            }
            bVar.mo27605j(z);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$x */
    class C6614x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13809a;

        C6614x(boolean z) {
            this.f13809a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27682d(this.f13809a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$y */
    class C6615y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13811a;

        C6615y(int i) {
            this.f13811a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27644I0(this.f13811a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.g$z */
    class C6616z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13813a;

        C6616z(boolean z) {
            this.f13813a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6574g.this.mo23408d0().mo27695j0(this.f13813a);
        }
    }

    public C6574g(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m19778r2(Ceiling10Service.C7940x1 x1Var, Ceiling10Service.C7943y1 y1Var, Ceiling10Service.C7942y0 y0Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15) {
        Ceiling10Service.C7940x1 x1Var2 = x1Var;
        Ceiling10Service.C7943y1 y1Var2 = y1Var;
        Ceiling10Service.C7942y0 y0Var2 = y0Var;
        boolean z = true;
        if (y1Var2 != null) {
            mo23408d0().mo27648K0(y1Var2 == Ceiling10Service.C7943y1.on);
        }
        if (x1Var2 != null) {
            mo27591k2().mo27611p(x1Var2 == Ceiling10Service.C7940x1.on);
        }
        if (y0Var2 != null) {
            mo27591k2().mo27605j(y0Var2 == Ceiling10Service.C7942y0.on);
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
            mo23408d0().mo27695j0(l14.longValue() == 1);
        }
        C6024e d0 = mo23408d0();
        if (l15 == null || l15.longValue() != 1) {
            z = false;
        }
        d0.mo27696k(z);
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C6604o0());
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
        return R$drawable.icon_yeelight_device_badge_nox_dl_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_nox_dl_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6594j0();
        this.f12724y = new C6596k0();
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
            mo27560F1().sendCmd(Ceiling10Service.C7945z0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6614x(z));
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
            mo27560F1().sendCmd(Ceiling10Service.C7945z0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C6582d0(str, str2, i));
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
            mo27560F1().sendCmd(Ceiling10Service.C7945z0.cfg_init_power, String.valueOf(i), new C6615y(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Ceiling10Service.C7945z0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6607q());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_ceiling10) : U;
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28266s2(this.f13746B, this.f13747G);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13745A);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13744H, "Invalid handler!");
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
            mo27560F1().sendCmd(Ceiling10Service.C7945z0.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6584e0(this));
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
            mo27560F1().setPower(Ceiling10Service.C7943y1.off, new C6580c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6610t());
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
            mo27560F1().sendCmd(Ceiling10Service.C7945z0.nighttime, z ? "enable" : "disable", new C6576a0(z));
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
            mo27560F1().sendCmd(Ceiling10Service.C7945z0.pseudo_beacon, "4097|" + i, new C6592i0(this));
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
            Ceiling10Service q2 = mo27560F1();
            Ceiling10Service.C7945z0 z0Var = Ceiling10Service.C7945z0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            q2.sendCmd(z0Var, sb.toString(), new C6578b0(z, str, str2, i));
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
            mo27560F1().setBgPower(Ceiling10Service.C7942y0.off, new C6602n0());
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
            mo27560F1().setPower(Ceiling10Service.C7943y1.on, new C6609s());
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
            mo27560F1().setBgPower(Ceiling10Service.C7942y0.on, new C6600m0());
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
            mo27560F1().openWithMode(Ceiling10Service.C7940x1.on, Ceiling10Service.C7871a1.smooth, 500L, Long.valueOf((long) i), new C6588g0(i));
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
            mo27560F1().openBgWithMode(Ceiling10Service.C7942y0.on, Ceiling10Service.C7871a1.smooth, 500L, Long.valueOf((long) i), new C6590h0(i));
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
            mo27560F1().sendCmd(Ceiling10Service.C7945z0.cfg_bg_proact, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6616z(z));
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
                mo27560F1().setBgFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6591i(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setBgScene("off", 0L, 0L, new C6593j(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setBgScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6595k(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setBgScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6597l(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31853B()) {
            try {
                mo27560F1().setBgScene("color", Long.valueOf((long) (yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) yVar.mo31874f()), new C6599m(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31891w()) {
            try {
                mo27560F1().setBgFlowScene("cf", Long.valueOf((long) yVar.mo31879k()), Long.valueOf((long) yVar.mo31880l()), yVar.mo31882n(), new C6601n(yVar));
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
                mo27560F1().setSceneBundle(a0.get(0).mo31742Y(), a0.get(1).mo31742Y(), new C6603o(yVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f13744H;
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
            mo27560F1().setBright(Long.valueOf(j), Ceiling10Service.C7871a1.smooth, 500L, new C6606p0(j));
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
    public Ceiling10Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightCeiling10Device) abstractDevice).mDeviceService;
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
            mo27560F1().setCt(Long.valueOf((long) i), Ceiling10Service.C7871a1.smooth, 500L, new C6575a(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s2 */
    public boolean mo28266s2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling10Service.C7946z1)) {
            C4308b.m12139r(f13744H, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Ceiling10Service.C7946z1) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6605p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6608r(this));
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
            mo27560F1().sendCmd(Ceiling10Service.C7945z0.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6586f0(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f13745A);
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
            if (jSONArray.length() != 21) {
                C4308b.m12139r("BATCH_RPC", "CeilingDevice, Invalid length of batch rpc result: " + str2);
            }
            m19778r2(Ceiling10Service.C7940x1.valueOf(jSONArray.getString(0)), Ceiling10Service.C7943y1.valueOf(jSONArray.getString(1)), Ceiling10Service.C7942y0.valueOf(jSONArray.getString(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), jSONArray.getString(14), Long.valueOf(jSONArray.getLong(15)), Long.valueOf(jSONArray.getLong(16)), Long.valueOf(jSONArray.getLong(17)), Long.valueOf(jSONArray.getLong(18)), Long.valueOf(jSONArray.getLong(19)), Long.valueOf(jSONArray.getLong(20)));
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
                mo27560F1().getProperties(new C6589h());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6577b(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6579c(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6581d(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6583e(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C6585f(yVar));
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
                mo27560F1().setSceneBundle(a0.get(0).mo31742Y(), a0.get(1).mo31742Y(), new C6587g(yVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str = f13744H;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("MainPower").getInternalName(), mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("BgPower").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("BgBright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("BgCt").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("BgFlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("NLBright").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("MiBandSleep").getInternalName(), mo27560F1().getService().getProperty("BgRgb").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("BgFlowing").getInternalName(), mo27560F1().getService().getProperty("BgProact").getInternalName(), mo27560F1().getService().getProperty("SmartSwitch").getInternalName()};
    }
}
