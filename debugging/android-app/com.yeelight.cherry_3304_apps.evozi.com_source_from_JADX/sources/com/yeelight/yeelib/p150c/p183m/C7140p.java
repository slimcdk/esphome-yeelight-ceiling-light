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
import com.yeelight.yeelib.device.xiaomi.CeilingbService;
import com.yeelight.yeelib.device.xiaomi.YeelightCeilingbDevice;
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

/* renamed from: com.yeelight.yeelib.c.m.p */
public class C7140p extends C6017a {

    /* renamed from: H */
    public static final String f14599H = "p";

    /* renamed from: A */
    CompletionHandler f14600A = new C7180v(this);

    /* renamed from: B */
    CompletionHandler f14601B = new C7181w(this);

    /* renamed from: G */
    CeilingbService.C8418f2 f14602G = new C7182x();

    /* renamed from: com.yeelight.yeelib.c.m.p$a */
    class C7141a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14603a;

        C7141a(int i) {
            this.f14603a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27707p0(this.f14603a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$a0 */
    class C7142a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14605a;

        C7142a0(boolean z) {
            this.f14605a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27695j0(this.f14605a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$b */
    class C7143b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14607a;

        C7143b(C9856y yVar) {
            this.f14607a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27654N0(this.f14607a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$b0 */
    class C7144b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14609a;

        C7144b0(boolean z) {
            this.f14609a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27640G0(this.f14609a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$c */
    class C7145c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14611a;

        C7145c(C9856y yVar) {
            this.f14611a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27654N0(this.f14611a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$c0 */
    class C7146c0 implements CompletionHandler {
        C7146c0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27648K0(false);
            C7140p.this.mo27591k2().mo27611p(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$d */
    class C7147d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14614a;

        C7147d(C9856y yVar) {
            this.f14614a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27654N0(this.f14614a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$d0 */
    class C7148d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14616a;

        /* renamed from: b */
        final /* synthetic */ String f14617b;

        /* renamed from: c */
        final /* synthetic */ String f14618c;

        /* renamed from: d */
        final /* synthetic */ int f14619d;

        C7148d0(boolean z, String str, String str2, int i) {
            this.f14616a = z;
            this.f14617b = str;
            this.f14618c = str2;
            this.f14619d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27640G0(this.f14616a);
            C7140p.this.mo23408d0().mo27638F0(this.f14617b);
            C7140p.this.mo23408d0().mo27636E0(this.f14618c);
            C7140p.this.mo23408d0().mo27634D0(this.f14619d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$e */
    class C7149e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14621a;

        C7149e(C9856y yVar) {
            this.f14621a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27654N0(this.f14621a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$e0 */
    class C7150e0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f14623a;

        /* renamed from: b */
        final /* synthetic */ String f14624b;

        /* renamed from: c */
        final /* synthetic */ int f14625c;

        C7150e0(String str, String str2, int i) {
            this.f14623a = str;
            this.f14624b = str2;
            this.f14625c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27638F0(this.f14623a);
            C7140p.this.mo23408d0().mo27636E0(this.f14624b);
            C7140p.this.mo23408d0().mo27634D0(this.f14625c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$f */
    class C7151f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14627a;

        C7151f(C9856y yVar) {
            this.f14627a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27654N0(this.f14627a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$f0 */
    class C7152f0 implements CompletionHandler {
        C7152f0(C7140p pVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$g */
    class C7153g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14629a;

        C7153g(C9856y yVar) {
            this.f14629a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27654N0(this.f14629a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$g0 */
    class C7154g0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14631a;

        C7154g0(int i) {
            this.f14631a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27648K0(true);
            C7140p.this.mo27591k2().mo27611p(true);
            C7140p.this.mo23352w1(C6024e.C6028d.values()[this.f14631a]);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$h */
    class C7155h implements CeilingbService.C8475y1 {
        C7155h() {
        }

        /* renamed from: a */
        public void mo28592a(CeilingbService.C8410d2 d2Var, CeilingbService.C8414e2 e2Var, CeilingbService.C8405c1 c1Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, String str3, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17) {
            Long l18 = l8;
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            String str4 = "null";
            sb.append(e2Var != null ? e2Var.name() : str4);
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("main_power: ");
            sb2.append(d2Var != null ? d2Var.name() : str4);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bg_power: ");
            if (c1Var != null) {
                str4 = c1Var.name();
            }
            sb3.append(str4);
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("bright: ");
            Long l19 = l;
            sb4.append(l19);
            sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("bg_bright: ");
            Long l20 = l2;
            sb5.append(l20);
            sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("ct: ");
            Long l21 = l3;
            sb6.append(l21);
            sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("bg_ct: ");
            Long l22 = l4;
            sb7.append(l22);
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("lanMode: ");
            Long l23 = l6;
            sb8.append(l23);
            sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append("saveState: ");
            Long l24 = l7;
            sb9.append(l24);
            sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append("delayoff: ");
            Long l25 = l5;
            sb10.append(l25);
            sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("flowParams: ");
            String str5 = str;
            sb11.append(str5);
            sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append("bg_flowParams: ");
            String str6 = str2;
            sb12.append(str6);
            sb12.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append("nLBright: ");
            Long l26 = l10;
            sb13.append(l26);
            sb13.toString();
            "nightTimeInfo : " + str3;
            "miBandSleep : " + l11;
            "flowing : " + l13;
            "bg_flowing : " + l14;
            "onFromPower : " + l9;
            "bg_rgb: " + l12;
            "bg_proact: " + l15;
            "smartSwitch: " + l16;
            "transIntervalDflt: " + l18;
            "transIntervalDflt: " + l18;
            C7140p.this.m21094r2(d2Var, e2Var, c1Var, l19, l20, l21, l22, l25, str5, str6, l23, l24, l9, l26, str3, l11, l12, l13, l14, l15, l16, l8, l17);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$h0 */
    class C7156h0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14634a;

        C7156h0(int i) {
            this.f14634a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openBgWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo27591k2().mo27605j(true);
            C7140p.this.mo27591k2().mo27612q(C7140p.this.mo23433j1(this.f14634a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$i */
    class C7157i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14636a;

        C7157i(C9856y yVar) {
            this.f14636a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo27591k2().mo27613r(this.f14636a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$i0 */
    class C7158i0 implements CompletionHandler {
        C7158i0(C7140p pVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$j */
    class C7159j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14638a;

        C7159j(C9856y yVar) {
            this.f14638a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27654N0(this.f14638a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$j0 */
    class C7160j0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14640a;

        C7160j0(boolean z) {
            this.f14640a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27696k(this.f14640a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$k */
    class C7161k implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14642a;

        C7161k(C9856y yVar) {
            this.f14642a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo27591k2().mo27613r(this.f14642a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$k0 */
    class C7162k0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14644a;

        C7162k0(boolean z) {
            this.f14644a = z;
        }

        public void onFailed(int i, String str) {
            "enableBleCfg --> onFailed: " + str;
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27680c(this.f14644a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$l */
    class C7163l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14646a;

        C7163l(C9856y yVar) {
            this.f14646a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo27591k2().mo27613r(this.f14646a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$l0 */
    class C7164l0 implements C6006h.C6016j {
        C7164l0() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C7140p.this.f14602G.mo28594a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C7140p.this.f14602G.mo28601h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
            C7140p.this.f14602G.mo28604k(l);
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C7140p.this.f14602G.mo28608o(CeilingbService.C8414e2.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$m */
    class C7165m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14649a;

        C7165m(C9856y yVar) {
            this.f14649a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo27591k2().mo27613r(this.f14649a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$m0 */
    class C7166m0 implements CompletionHandler {
        C7166m0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.openBg --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo27591k2().mo27605j(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$n */
    class C7167n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14652a;

        C7167n(C9856y yVar) {
            this.f14652a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo27591k2().mo27613r(this.f14652a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$n0 */
    class C7168n0 implements C6006h.C6014h {
        C7168n0() {
        }

        /* renamed from: j */
        public void mo27578j(Long l) {
            C7140p.this.f14602G.mo28603j(l);
        }

        /* renamed from: l */
        public void mo27579l(Long l) {
            C7140p.this.f14602G.mo28605l(l);
        }

        /* renamed from: n */
        public void mo27580n(Long l) {
            C7140p.this.f14602G.mo28607n(l);
        }

        /* renamed from: o */
        public void mo27581o(C6006h.C6015i iVar) {
            C7140p.this.f14602G.mo28615v(CeilingbService.C8405c1.valueOf(iVar.toString()));
        }

        /* renamed from: p */
        public void mo27582p(C6006h.C6015i iVar) {
            C7140p.this.f14602G.mo28616w(CeilingbService.C8410d2.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$o */
    class C7169o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f14655a;

        C7169o(C9856y yVar) {
            this.f14655a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27654N0(this.f14655a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$o0 */
    static /* synthetic */ class C7170o0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14657a;

        /* renamed from: b */
        static final /* synthetic */ int[] f14658b;

        /* renamed from: c */
        static final /* synthetic */ int[] f14659c;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.CeilingbService$c1[] r0 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8405c1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14659c = r0
                r1 = 1
                com.yeelight.yeelib.device.xiaomi.CeilingbService$c1 r2 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8405c1.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f14659c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.CeilingbService$c1 r3 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8405c1.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.yeelight.yeelib.device.xiaomi.CeilingbService$e2[] r2 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8414e2.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f14658b = r2
                com.yeelight.yeelib.device.xiaomi.CeilingbService$e2 r3 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8414e2.on     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f14658b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.yeelight.yeelib.device.xiaomi.CeilingbService$e2 r3 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8414e2.off     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                com.yeelight.yeelib.device.xiaomi.CeilingbService$d2[] r2 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8410d2.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f14657a = r2
                com.yeelight.yeelib.device.xiaomi.CeilingbService$d2 r3 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8410d2.on     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f14657a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.yeelight.yeelib.device.xiaomi.CeilingbService$d2 r2 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8410d2.off     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C7140p.C7170o0.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$p */
    class C7171p implements CompletionHandler {
        C7171p(C7140p pVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$p0 */
    class C7172p0 implements CompletionHandler {
        C7172p0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.closeBg --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo27591k2().mo27605j(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$q */
    class C7173q implements CompletionHandler {
        C7173q() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27652M0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$q0 */
    class C7174q0 implements CompletionHandler {
        C7174q0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$r */
    class C7175r implements CompletionHandler {
        C7175r(C7140p pVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$r0 */
    class C7176r0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14663a;

        C7176r0(long j) {
            this.f14663a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27697k0(this.f14663a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$s */
    class C7177s implements CompletionHandler {
        C7177s() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27648K0(true);
            C7140p.this.mo27591k2().mo27611p(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$t */
    class C7178t implements CompletionHandler {
        C7178t() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$u */
    class C7179u implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f14667a;

        C7179u(long j) {
            this.f14667a = j;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27662R0(this.f14667a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$v */
    class C7180v implements CompletionHandler {
        C7180v(C7140p pVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$w */
    class C7181w implements CompletionHandler {
        C7181w(C7140p pVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$x */
    class C7182x implements CeilingbService.C8418f2 {
        C7182x() {
        }

        /* renamed from: a */
        public void mo28594a(Long l) {
            "onBrightChanged: " + l;
            C7140p.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28595b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C7140p.this.mo23408d0().mo27710r(2) == null) {
                C7140p.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C7140p.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28596c(Long l) {
            "onFlowingChanged: " + l;
            C7140p.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28597d(Long l) {
            "onSaveStateChanged: " + l;
            C7140p.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28598e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C7140p.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28599f(Long l) {
            "onOnFromPowerChanged: " + l;
            C7140p.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28600g(Long l) {
            "onLanModeChanged: " + l;
            C7140p.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28601h(Long l) {
            "onCtScaleChanged: " + l;
            C7140p.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28602i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C7140p.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C7140p.this.mo23408d0().mo27640G0(true);
                }
                C7140p.this.mo23408d0().mo27638F0(split[1]);
                C7140p.this.mo23408d0().mo27636E0(split[2]);
                C7140p.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C7140p.f14599H;
                "start = " + C7140p.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C7140p.this.mo23408d0().mo27631C() + ", " + C7140p.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28603j(Long l) {
            "onBgCtChanged: " + l;
            C7140p.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: k */
        public void mo28604k(Long l) {
            "onNLBrightChanged: " + l;
            if (l.longValue() != 0) {
                C7140p.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
                C7140p.this.mo23408d0().mo27642H0(l.longValue());
                return;
            }
            C7140p.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: l */
        public void mo28605l(Long l) {
            "onBgBrightChanged: " + l;
            C7140p.this.mo27591k2().mo27606k(l.intValue());
        }

        /* renamed from: m */
        public void mo28606m(Long l) {
            "onMiBandSleepChanged: " + l;
            C7140p.this.mo23408d0().mo27690h(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo28607n(Long l) {
            "onBgRgbChanged: " + l;
            C7140p.this.mo27591k2().mo27607l(l.intValue());
        }

        /* renamed from: o */
        public void mo28608o(CeilingbService.C8414e2 e2Var) {
            C6024e eVar;
            "onPowerSwitched: " + e2Var.name();
            int i = C7170o0.f14658b[e2Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C7140p.this.mo23408d0();
            } else if (i == 2) {
                eVar = C7140p.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }

        /* renamed from: p */
        public void mo28609p(Long l) {
            "smartSwitch: " + l;
            C7140p.this.mo23408d0().mo27696k(l != null && l.longValue() == 1);
        }

        /* renamed from: q */
        public void mo28610q(Long l) {
            "onTransIntervalDfltChanged: " + l;
            C7140p.this.mo23408d0().mo27662R0(l == null ? 0 : l.longValue());
        }

        /* renamed from: r */
        public void mo28611r(String str) {
            "onBgFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C7140p.this.mo27591k2().mo27609n(C9827a.m23894b(str));
            }
        }

        /* renamed from: s */
        public void mo28612s(Long l) {
            if (l != null) {
                C7140p.this.mo23408d0().mo27695j0(l.longValue() == 1);
            }
        }

        /* renamed from: t */
        public void mo28613t(Long l) {
            "onBgFlowingChanged: " + l;
            C7140p.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: u */
        public void mo28614u(Long l) {
            "onBleCfgChanged: " + l;
            C7140p.this.mo23408d0().mo27680c(l != null && l.longValue() == 1);
        }

        /* renamed from: v */
        public void mo28615v(CeilingbService.C8405c1 c1Var) {
            C6018b bVar;
            "onBgPowerChanged: " + c1Var.name();
            int i = C7170o0.f14659c[c1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C7140p.this.mo27591k2();
            } else if (i == 2) {
                bVar = C7140p.this.mo27591k2();
                z = false;
            } else {
                return;
            }
            bVar.mo27605j(z);
        }

        /* renamed from: w */
        public void mo28616w(CeilingbService.C8410d2 d2Var) {
            C6018b bVar;
            "onMainPowerSwitched: " + d2Var.name();
            int i = C7170o0.f14657a[d2Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C7140p.this.mo27591k2();
            } else if (i == 2) {
                bVar = C7140p.this.mo27591k2();
                z = false;
            } else {
                return;
            }
            bVar.mo27611p(z);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$y */
    class C7183y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f14670a;

        C7183y(boolean z) {
            this.f14670a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27682d(this.f14670a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.p$z */
    class C7184z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f14672a;

        C7184z(int i) {
            this.f14672a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C7140p.this.mo23408d0().mo27644I0(this.f14672a);
        }
    }

    public C7140p(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m21094r2(CeilingbService.C8410d2 d2Var, CeilingbService.C8414e2 e2Var, CeilingbService.C8405c1 c1Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17) {
        CeilingbService.C8410d2 d2Var2 = d2Var;
        CeilingbService.C8414e2 e2Var2 = e2Var;
        CeilingbService.C8405c1 c1Var2 = c1Var;
        boolean z = true;
        if (e2Var2 != null) {
            mo23408d0().mo27648K0(e2Var2 == CeilingbService.C8414e2.on);
        }
        if (d2Var2 != null) {
            mo27591k2().mo27611p(d2Var2 == CeilingbService.C8410d2.on);
        }
        if (c1Var2 != null) {
            mo27591k2().mo27605j(c1Var2 == CeilingbService.C8405c1.on);
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
        long j = 0;
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
        mo23408d0().mo27696k(l15 != null && l15.longValue() == 1);
        C6024e d0 = mo23408d0();
        if (l16 != null) {
            j = l16.longValue();
        }
        d0.mo27662R0(j);
        C6024e d02 = mo23408d0();
        if (l17 == null || l17.longValue() != 1) {
            z = false;
        }
        d02.mo27680c(z);
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        if (super.mo23300A1()) {
            return true;
        }
        try {
            mo27560F1().toggle(new C7174q0());
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
            return R$drawable.icon_yeelight_device_badge_ceiling19_small;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -1462015182:
                if (T.equals("yeelink.light.ceiling19")) {
                    c = 0;
                    break;
                }
                break;
            case -1462015160:
                if (T.equals("yeelink.light.ceiling20")) {
                    c = 1;
                    break;
                }
                break;
            case -458141174:
                if (T.equals("yeelink.light.ceilb")) {
                    c = 2;
                    break;
                }
                break;
            case -458141173:
                if (T.equals("yeelink.light.ceilc")) {
                    c = 3;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? R$drawable.icon_yeelight_device_badge_ceiling19_small : R$drawable.icon_yeelight_device_badge_ceilingc_small : R$drawable.icon_yeelight_device_badge_ceilingb_small : R$drawable.icon_yeelight_device_badge_ceiling20_small : R$drawable.icon_yeelight_device_badge_ceiling19_small;
    }

    /* renamed from: H */
    public int mo23306H() {
        if (mo23395T() == null) {
            return R$drawable.icon_yeelight_device_badge_ceiling19_big;
        }
        String T = mo23395T();
        char c = 65535;
        switch (T.hashCode()) {
            case -1462015182:
                if (T.equals("yeelink.light.ceiling19")) {
                    c = 0;
                    break;
                }
                break;
            case -1462015160:
                if (T.equals("yeelink.light.ceiling20")) {
                    c = 1;
                    break;
                }
                break;
            case -458141174:
                if (T.equals("yeelink.light.ceilb")) {
                    c = 2;
                    break;
                }
                break;
            case -458141173:
                if (T.equals("yeelink.light.ceilc")) {
                    c = 3;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? R$drawable.icon_yeelight_device_badge_ceiling19_big : R$drawable.icon_yeelight_device_badge_ceilingc_big : R$drawable.icon_yeelight_device_badge_ceilingb_big : R$drawable.icon_yeelight_device_badge_ceiling20_big : R$drawable.icon_yeelight_device_badge_ceiling19_big;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C7164l0();
        this.f12724y = new C7168n0();
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
            mo27560F1().sendCmd(CeilingbService.C8409d1.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7183y(z));
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
            mo27560F1().sendCmd(CeilingbService.C8409d1.nighttime, "set|" + str + "|" + str2 + "|" + i, new C7150e0(str, str2, i));
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
            mo27560F1().sendCmd(CeilingbService.C8409d1.cfg_init_power, String.valueOf(i), new C7184z(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(CeilingbService.C8409d1.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7173q());
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
        return mo28591s2(this.f14601B, this.f14602G);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f14600A);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f14599H, "Invalid handler!");
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
            mo27560F1().sendCmd(CeilingbService.C8409d1.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7152f0(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23313O1()) {
            return true;
        }
        try {
            mo27560F1().setPower(CeilingbService.C8414e2.off, new C7146c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C7178t());
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
            mo27560F1().sendCmd(CeilingbService.C8409d1.nighttime, z ? "enable" : "disable", new C7144b0(z));
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
            mo27560F1().sendCmd(CeilingbService.C8409d1.pseudo_beacon, "4097|" + i, new C7158i0(this));
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
            CeilingbService q2 = mo27560F1();
            CeilingbService.C8409d1 d1Var = CeilingbService.C8409d1.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            q2.sendCmd(d1Var, sb.toString(), new C7148d0(z, str, str2, i));
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
            mo27560F1().setBgPower(CeilingbService.C8405c1.off, new C7172p0());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23324Y1()) {
            return true;
        }
        try {
            mo27560F1().setPower(CeilingbService.C8414e2.on, new C7177s());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: l2 */
    public boolean mo27592l2() {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23320V1();
        }
        try {
            mo27560F1().setBgPower(CeilingbService.C8405c1.on, new C7166m0());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23325Z1(mo23408d0().mo27653N(), i)) {
            return true;
        }
        try {
            mo27560F1().openWithMode(CeilingbService.C8410d2.on, CeilingbService.C8413e1.smooth, Long.valueOf(mo23408d0().mo27653N()), Long.valueOf((long) i), new C7154g0(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: m2 */
    public boolean mo27593m2(int i) {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23322X1(mo23408d0().mo27653N(), i);
        }
        try {
            mo27560F1().openBgWithMode(CeilingbService.C8405c1.on, CeilingbService.C8413e1.smooth, Long.valueOf(mo23408d0().mo27653N()), Long.valueOf((long) i), new C7156h0(i));
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
            mo27560F1().sendCmd(CeilingbService.C8409d1.cfg_bg_proact, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7142a0(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: o2 */
    public boolean mo27595o2(C9856y yVar) {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23305G2(yVar)) {
            return true;
        }
        if (yVar.mo31890v()) {
            try {
                mo27560F1().setBgFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7157i(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setBgScene("off", 0L, 0L, new C7159j(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setBgScene2("bright", Long.valueOf((long) yVar.mo31874f()), new C7161k(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setBgScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C7163l(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31853B()) {
            try {
                mo27560F1().setBgScene("color", Long.valueOf((long) (yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) yVar.mo31874f()), new C7165m(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31891w()) {
            try {
                mo27560F1().setBgFlowScene("cf", Long.valueOf((long) yVar.mo31879k()), Long.valueOf((long) yVar.mo31880l()), yVar.mo31882n(), new C7167n(yVar));
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
                mo27560F1().setSceneBundle(a0.get(0).mo31742Y(), a0.get(1).mo31742Y(), new C7169o(yVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f14599H;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23307H2(j)) {
            return true;
        }
        try {
            mo27560F1().setBright(Long.valueOf(j), new C7176r0(j));
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
    public CeilingbService mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice != null && (abstractDevice instanceof YeelightCeilingbDevice)) {
            return ((YeelightCeilingbDevice) abstractDevice).mDeviceService;
        }
        return null;
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23309J2(i)) {
            return true;
        }
        try {
            mo27560F1().setCt(Long.valueOf((long) i), new C7141a(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s2 */
    public boolean mo28591s2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof CeilingbService.C8418f2)) {
            C4308b.m12139r(f14599H, "Invalid handler or listener!");
        }
        if (mo27560F1() == null) {
            return true;
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (CeilingbService.C8418f2) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C7171p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u */
    public void mo23423u(boolean z) {
        "enableBleCfg --> Invoke, enable : " + z;
        try {
            mo27560F1().sendCmd(CeilingbService.C8409d1.cfg_ble_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7162k0(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C7175r(this));
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
            mo27560F1().sendCmd(CeilingbService.C8409d1.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C7160j0(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f14600A);
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
            if (jSONArray.length() != 23) {
                C4308b.m12139r("BATCH_RPC", "CeilingbDevice, Invalid length of batch rpc result: " + str2);
            }
            m21094r2(CeilingbService.C8410d2.valueOf(jSONArray.getString(0)), CeilingbService.C8414e2.valueOf(jSONArray.getString(1)), CeilingbService.C8405c1.valueOf(jSONArray.getString(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), jSONArray.getString(14), Long.valueOf(jSONArray.getLong(15)), Long.valueOf(jSONArray.getLong(16)), Long.valueOf(jSONArray.getLong(17)), Long.valueOf(jSONArray.getLong(18)), Long.valueOf(jSONArray.getLong(19)), Long.valueOf(jSONArray.getLong(20)), Long.valueOf(jSONArray.getLong(21)), Long.valueOf(jSONArray.getLong(22)));
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
                mo27560F1().getProperties(new C7155h());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        C4191d dVar = this.f7243f;
        if (dVar != null && dVar.mo23310K2(yVar)) {
            return true;
        }
        if (yVar.mo31890v()) {
            try {
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C7143b(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C7145c(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene2("bright", Long.valueOf((long) yVar.mo31874f()), new C7147d(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C7149e(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C7151f(yVar));
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
                mo27560F1().setSceneBundle(a0.get(0).mo31742Y(), a0.get(1).mo31742Y(), new C7153g(yVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str = f14599H;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: y1 */
    public boolean mo23435y1(long j) {
        try {
            CeilingbService q2 = mo27560F1();
            CeilingbService.C8409d1 d1Var = CeilingbService.C8409d1.trans_default;
            q2.sendCmd(d1Var, j + ",1", new C7179u(j));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("MainPower").getInternalName(), mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("BgPower").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("BgBright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("BgCt").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("BgFlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("NLBright").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("MiBandSleep").getInternalName(), mo27560F1().getService().getProperty("BgRgb").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("BgFlowing").getInternalName(), mo27560F1().getService().getProperty("BgProact").getInternalName(), mo27560F1().getService().getProperty("SmartSwitch").getInternalName(), mo27560F1().getService().getProperty("TransIntervalDflt").getInternalName(), mo27560F1().getService().getProperty(CeilingbService.PROPERTY_BleCfg).getInternalName()};
    }
}
