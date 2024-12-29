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
import com.yeelight.yeelib.device.xiaomi.Ceiling19Service;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling19Device;
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

/* renamed from: com.yeelight.yeelib.c.m.h */
public class C6684h extends C6017a {

    /* renamed from: H */
    public static final String f13912H = "h";

    /* renamed from: A */
    CompletionHandler f13913A = new C6721u(this);

    /* renamed from: B */
    CompletionHandler f13914B = new C6722v(this);

    /* renamed from: G */
    Ceiling19Service.C8024z1 f13915G = new C6723w();

    /* renamed from: com.yeelight.yeelib.c.m.h$a */
    class C6685a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13916a;

        C6685a(int i) {
            this.f13916a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27707p0(this.f13916a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$a0 */
    class C6686a0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13918a;

        C6686a0(boolean z) {
            this.f13918a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27640G0(this.f13918a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$b */
    class C6687b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13920a;

        C6687b(C9856y yVar) {
            this.f13920a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("set flow scene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27654N0(this.f13920a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$b0 */
    class C6688b0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13922a;

        /* renamed from: b */
        final /* synthetic */ String f13923b;

        /* renamed from: c */
        final /* synthetic */ String f13924c;

        /* renamed from: d */
        final /* synthetic */ int f13925d;

        C6688b0(boolean z, String str, String str2, int i) {
            this.f13922a = z;
            this.f13923b = str;
            this.f13924c = str2;
            this.f13925d = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27640G0(this.f13922a);
            C6684h.this.mo23408d0().mo27638F0(this.f13923b);
            C6684h.this.mo23408d0().mo27636E0(this.f13924c);
            C6684h.this.mo23408d0().mo27634D0(this.f13925d);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$c */
    class C6689c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13927a;

        C6689c(C9856y yVar) {
            this.f13927a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27654N0(this.f13927a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$c0 */
    class C6690c0 implements CompletionHandler {
        C6690c0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.close --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27648K0(false);
            C6684h.this.mo27591k2().mo27611p(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$d */
    class C6691d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13930a;

        C6691d(C9856y yVar) {
            this.f13930a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27654N0(this.f13930a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$d0 */
    class C6692d0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f13932a;

        /* renamed from: b */
        final /* synthetic */ String f13933b;

        /* renamed from: c */
        final /* synthetic */ int f13934c;

        C6692d0(String str, String str2, int i) {
            this.f13932a = str;
            this.f13933b = str2;
            this.f13934c = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27638F0(this.f13932a);
            C6684h.this.mo23408d0().mo27636E0(this.f13933b);
            C6684h.this.mo23408d0().mo27634D0(this.f13934c);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$e */
    class C6693e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13936a;

        C6693e(C9856y yVar) {
            this.f13936a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27654N0(this.f13936a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$e0 */
    class C6694e0 implements CompletionHandler {
        C6694e0(C6684h hVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$f */
    class C6695f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13938a;

        C6695f(C9856y yVar) {
            this.f13938a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27654N0(this.f13938a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$f0 */
    class C6696f0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13940a;

        C6696f0(int i) {
            this.f13940a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27648K0(true);
            C6684h.this.mo27591k2().mo27611p(true);
            C6684h.this.mo23352w1(C6024e.C6028d.values()[this.f13940a]);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$g */
    class C6697g implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13942a;

        C6697g(C9856y yVar) {
            this.f13942a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27654N0(this.f13942a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$g0 */
    class C6698g0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13944a;

        C6698g0(int i) {
            this.f13944a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openBgWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo27591k2().mo27605j(true);
            C6684h.this.mo27591k2().mo27612q(C6684h.this.mo23433j1(this.f13944a));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$h */
    class C6699h implements Ceiling19Service.C8006t1 {
        C6699h() {
        }

        /* renamed from: a */
        public void mo28331a(Ceiling19Service.C8018x1 x1Var, Ceiling19Service.C8021y1 y1Var, Ceiling19Service.C8020y0 y0Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15) {
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
            C6684h.this.m19992r2(x1Var, y1Var, y0Var, l, l16, l17, l18, l21, str5, str6, l19, l20, l8, l9, str3, l10, l11, l12, l13, l14, l15);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$h0 */
    class C6700h0 implements CompletionHandler {
        C6700h0(C6684h hVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$i */
    class C6701i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13947a;

        C6701i(C9856y yVar) {
            this.f13947a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo27591k2().mo27613r(this.f13947a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$i0 */
    class C6702i0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13949a;

        C6702i0(boolean z) {
            this.f13949a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27696k(this.f13949a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$j */
    class C6703j implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13951a;

        C6703j(C9856y yVar) {
            this.f13951a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27654N0(this.f13951a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$j0 */
    class C6704j0 implements C6006h.C6016j {
        C6704j0() {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
            C6684h.this.f13915G.mo28333a(l);
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
            C6684h.this.f13915G.mo28340h(l);
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
            C6684h.this.f13915G.mo28343k(l);
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
            C6684h.this.f13915G.mo28353u(Ceiling19Service.C8021y1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$k */
    class C6705k implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13954a;

        C6705k(C9856y yVar) {
            this.f13954a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo27591k2().mo27613r(this.f13954a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$k0 */
    class C6706k0 implements C6006h.C6014h {
        C6706k0() {
        }

        /* renamed from: j */
        public void mo27578j(Long l) {
            C6684h.this.f13915G.mo28342j(l);
        }

        /* renamed from: l */
        public void mo27579l(Long l) {
            C6684h.this.f13915G.mo28344l(l);
        }

        /* renamed from: n */
        public void mo27580n(Long l) {
            C6684h.this.f13915G.mo28346n(l);
        }

        /* renamed from: o */
        public void mo27581o(C6006h.C6015i iVar) {
            C6684h.this.f13915G.mo28349q(Ceiling19Service.C8020y0.valueOf(iVar.toString()));
        }

        /* renamed from: p */
        public void mo27582p(C6006h.C6015i iVar) {
            C6684h.this.f13915G.mo28347o(Ceiling19Service.C8018x1.valueOf(iVar.toString()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$l */
    class C6707l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13957a;

        C6707l(C9856y yVar) {
            this.f13957a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo27591k2().mo27613r(this.f13957a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$l0 */
    static /* synthetic */ class C6708l0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f13959a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13960b;

        /* renamed from: c */
        static final /* synthetic */ int[] f13961c;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y0[] r0 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8020y0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13961c = r0
                r1 = 1
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y0 r2 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8020y0.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f13961c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y0 r3 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8020y0.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y1[] r2 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8021y1.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f13960b = r2
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y1 r3 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8021y1.on     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f13960b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y1 r3 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8021y1.off     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$x1[] r2 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8018x1.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f13959a = r2
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$x1 r3 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8018x1.on     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f13959a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$x1 r2 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8018x1.off     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6684h.C6708l0.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$m */
    class C6709m implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13962a;

        C6709m(C9856y yVar) {
            this.f13962a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo27591k2().mo27613r(this.f13962a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$m0 */
    class C6710m0 implements CompletionHandler {
        C6710m0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.openBg --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo27591k2().mo27605j(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$n */
    class C6711n implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13965a;

        C6711n(C9856y yVar) {
            this.f13965a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo27591k2().mo27613r(this.f13965a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$n0 */
    class C6712n0 implements CompletionHandler {
        C6712n0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.closeBg --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo27591k2().mo27605j(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$o */
    class C6713o implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f13968a;

        C6713o(C9856y yVar) {
            this.f13968a = yVar;
        }

        public void onFailed(int i, String str) {
            String.format("setBgScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27654N0(this.f13968a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$o0 */
    class C6714o0 implements CompletionHandler {
        C6714o0() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27664S0();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$p */
    class C6715p implements CompletionHandler {
        C6715p(C6684h hVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$p0 */
    class C6716p0 implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f13971a;

        C6716p0(long j) {
            this.f13971a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27697k0(this.f13971a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$q */
    class C6717q implements CompletionHandler {
        C6717q() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27652M0(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$r */
    class C6718r implements CompletionHandler {
        C6718r(C6684h hVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$s */
    class C6719s implements CompletionHandler {
        C6719s() {
        }

        public void onFailed(int i, String str) {
            String.format("CeilingDevice.open --> onFailed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27648K0(true);
            C6684h.this.mo27591k2().mo27611p(true);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$t */
    class C6720t implements CompletionHandler {
        C6720t() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27670V0(-1);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$u */
    class C6721u implements CompletionHandler {
        C6721u(C6684h hVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$v */
    class C6722v implements CompletionHandler {
        C6722v(C6684h hVar) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, error: " + i + ", desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$w */
    class C6723w implements Ceiling19Service.C8024z1 {
        C6723w() {
        }

        /* renamed from: a */
        public void mo28333a(Long l) {
            "onBrightChanged: " + l;
            C6684h.this.mo23408d0().mo27697k0(l.longValue());
        }

        /* renamed from: b */
        public void mo28334b(Long l) {
            "ondelayoffChanged: " + String.valueOf(l);
            if (l == null) {
                return;
            }
            if (C6684h.this.mo23408d0().mo27710r(2) == null) {
                C6684h.this.mo23408d0().mo27676a(new C7554e(l.intValue(), l.intValue()));
            } else {
                C6684h.this.mo23408d0().mo27670V0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo28335c(Long l) {
            "onFlowingChanged: " + l;
            C6684h.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: d */
        public void mo28336d(Long l) {
            "onSaveStateChanged: " + l;
            C6684h.this.mo23408d0().mo27652M0(l != null && l.longValue() == 1);
        }

        /* renamed from: e */
        public void mo28337e(String str) {
            "onFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6684h.this.mo23408d0().mo27713s0(C9827a.m23894b(str));
            }
        }

        /* renamed from: f */
        public void mo28338f(Long l) {
            "onOnFromPowerChanged: " + l;
            C6684h.this.mo23408d0().mo27644I0(l.intValue());
        }

        /* renamed from: g */
        public void mo28339g(Long l) {
            "onLanModeChanged: " + l;
            C6684h.this.mo23408d0().mo27682d(l.longValue() == 1);
        }

        /* renamed from: h */
        public void mo28340h(Long l) {
            "onCtScaleChanged: " + l;
            C6684h.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: i */
        public void mo28341i(String str) {
            "onNightTimeInfoChanged: " + str;
            String[] split = str.split("\\|");
            if (split.length == 4) {
                if (split[0].equals("disable")) {
                    C6684h.this.mo23408d0().mo27640G0(false);
                } else if (split[0].equals("enable")) {
                    C6684h.this.mo23408d0().mo27640G0(true);
                }
                C6684h.this.mo23408d0().mo27638F0(split[1]);
                C6684h.this.mo23408d0().mo27636E0(split[2]);
                C6684h.this.mo23408d0().mo27634D0(Integer.parseInt(split[3]));
                String str2 = C6684h.f13912H;
                "start = " + C6684h.this.mo23408d0().mo27633D() + Constants.ACCEPT_TIME_SEPARATOR_SP + C6684h.this.mo23408d0().mo27631C() + ", " + C6684h.this.mo23408d0().mo27629B();
            }
        }

        /* renamed from: j */
        public void mo28342j(Long l) {
            "onBgCtChanged: " + l;
            C6684h.this.mo23408d0().mo27707p0(l.intValue());
        }

        /* renamed from: k */
        public void mo28343k(Long l) {
            "onNLBrightChanged: " + l;
            if (l.longValue() != 0) {
                C6684h.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT);
                C6684h.this.mo23408d0().mo27642H0(l.longValue());
                return;
            }
            C6684h.this.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        }

        /* renamed from: l */
        public void mo28344l(Long l) {
            "onBgBrightChanged: " + l;
            C6684h.this.mo27591k2().mo27606k(l.intValue());
        }

        /* renamed from: m */
        public void mo28345m(Long l) {
            "onMiBandSleepChanged: " + l;
            C6684h.this.mo23408d0().mo27690h(l.longValue() == 1);
        }

        /* renamed from: n */
        public void mo28346n(Long l) {
            "onBgRgbChanged: " + l;
            C6684h.this.mo27591k2().mo27607l(l.intValue());
        }

        /* renamed from: o */
        public void mo28347o(Ceiling19Service.C8018x1 x1Var) {
            C6018b bVar;
            "onMainPowerSwitched: " + x1Var.name();
            int i = C6708l0.f13959a[x1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C6684h.this.mo27591k2();
            } else if (i == 2) {
                bVar = C6684h.this.mo27591k2();
                z = false;
            } else {
                return;
            }
            bVar.mo27611p(z);
        }

        /* renamed from: p */
        public void mo28348p(Long l) {
            "smartSwitch: " + l;
            C6684h.this.mo23408d0().mo27696k(l != null && l.longValue() == 1);
        }

        /* renamed from: q */
        public void mo28349q(Ceiling19Service.C8020y0 y0Var) {
            C6018b bVar;
            "onBgPowerChanged: " + y0Var.name();
            int i = C6708l0.f13961c[y0Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar = C6684h.this.mo27591k2();
            } else if (i == 2) {
                bVar = C6684h.this.mo27591k2();
                z = false;
            } else {
                return;
            }
            bVar.mo27605j(z);
        }

        /* renamed from: r */
        public void mo28350r(String str) {
            "onBgFlowParamsChanged: " + str;
            if (!str.isEmpty()) {
                C6684h.this.mo27591k2().mo27609n(C9827a.m23894b(str));
            }
        }

        /* renamed from: s */
        public void mo28351s(Long l) {
            if (l != null) {
                C6684h.this.mo23408d0().mo27695j0(l.longValue() == 1);
            }
        }

        /* renamed from: t */
        public void mo28352t(Long l) {
            "onBgFlowingChanged: " + l;
            C6684h.this.mo23408d0().mo27715t0(l.longValue() != 0);
        }

        /* renamed from: u */
        public void mo28353u(Ceiling19Service.C8021y1 y1Var) {
            C6024e eVar;
            "onPowerSwitched: " + y1Var.name();
            int i = C6708l0.f13960b[y1Var.ordinal()];
            boolean z = true;
            if (i == 1) {
                eVar = C6684h.this.mo23408d0();
            } else if (i == 2) {
                eVar = C6684h.this.mo23408d0();
                z = false;
            } else {
                return;
            }
            eVar.mo27648K0(z);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$x */
    class C6724x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13977a;

        C6724x(boolean z) {
            this.f13977a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27682d(this.f13977a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$y */
    class C6725y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f13979a;

        C6725y(int i) {
            this.f13979a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27644I0(this.f13979a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.h$z */
    class C6726z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f13981a;

        C6726z(boolean z) {
            this.f13981a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6684h.this.mo23408d0().mo27695j0(this.f13981a);
        }
    }

    public C6684h(String str, String str2, String str3, Device.Ownership ownership) {
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
    public void m19992r2(Ceiling19Service.C8018x1 x1Var, Ceiling19Service.C8021y1 y1Var, Ceiling19Service.C8020y0 y0Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15) {
        Ceiling19Service.C8018x1 x1Var2 = x1Var;
        Ceiling19Service.C8021y1 y1Var2 = y1Var;
        Ceiling19Service.C8020y0 y0Var2 = y0Var;
        boolean z = true;
        if (y1Var2 != null) {
            mo23408d0().mo27648K0(y1Var2 == Ceiling19Service.C8021y1.on);
        }
        if (x1Var2 != null) {
            mo27591k2().mo27611p(x1Var2 == Ceiling19Service.C8018x1.on);
        }
        if (y0Var2 != null) {
            mo27591k2().mo27605j(y0Var2 == Ceiling19Service.C8020y0.on);
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
            mo27560F1().toggle(new C6714o0());
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
        this.f12723x = new C6704j0();
        this.f12724y = new C6706k0();
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
            mo27560F1().sendCmd(Ceiling19Service.C8023z0.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6724x(z));
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
            mo27560F1().sendCmd(Ceiling19Service.C8023z0.nighttime, "set|" + str + "|" + str2 + "|" + i, new C6692d0(str, str2, i));
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
            mo27560F1().sendCmd(Ceiling19Service.C8023z0.cfg_init_power, String.valueOf(i), new C6725y(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        try {
            mo27560F1().sendCmd(Ceiling19Service.C8023z0.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6717q());
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
        return mo28330s2(this.f13914B, this.f13915G);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13913A);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13912H, "Invalid handler!");
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
            mo27560F1().sendCmd(Ceiling19Service.C8023z0.miband_sleep, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6694e0(this));
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
            mo27560F1().setPower(Ceiling19Service.C8021y1.off, new C6690c0());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        try {
            mo27560F1().delCron(0L, new C6720t());
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
            mo27560F1().sendCmd(Ceiling19Service.C8023z0.nighttime, z ? "enable" : "disable", new C6686a0(z));
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
            mo27560F1().sendCmd(Ceiling19Service.C8023z0.pseudo_beacon, "4097|" + i, new C6700h0(this));
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
            Ceiling19Service q2 = mo27560F1();
            Ceiling19Service.C8023z0 z0Var = Ceiling19Service.C8023z0.nighttime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "enable" : "disable");
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i);
            q2.sendCmd(z0Var, sb.toString(), new C6688b0(z, str, str2, i));
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
            mo27560F1().setBgPower(Ceiling19Service.C8020y0.off, new C6712n0());
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
            mo27560F1().setPower(Ceiling19Service.C8021y1.on, new C6719s());
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
            mo27560F1().setBgPower(Ceiling19Service.C8020y0.on, new C6710m0());
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
            mo27560F1().openWithMode(Ceiling19Service.C8018x1.on, Ceiling19Service.C7949a1.smooth, 500L, Long.valueOf((long) i), new C6696f0(i));
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
            mo27560F1().openBgWithMode(Ceiling19Service.C8020y0.on, Ceiling19Service.C7949a1.smooth, 500L, Long.valueOf((long) i), new C6698g0(i));
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
            mo27560F1().sendCmd(Ceiling19Service.C8023z0.cfg_bg_proact, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6726z(z));
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
                mo27560F1().setBgFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6701i(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setBgScene("off", 0L, 0L, new C6703j(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setBgScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6705k(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setBgScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6707l(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31853B()) {
            try {
                mo27560F1().setBgScene("color", Long.valueOf((long) (yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) yVar.mo31874f()), new C6709m(yVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (yVar.mo31891w()) {
            try {
                mo27560F1().setBgFlowScene("cf", Long.valueOf((long) yVar.mo31879k()), Long.valueOf((long) yVar.mo31880l()), yVar.mo31882n(), new C6711n(yVar));
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
                mo27560F1().setSceneBundle(a0.get(0).mo31742Y(), a0.get(1).mo31742Y(), new C6713o(yVar));
            } catch (MiotException e7) {
                e7.printStackTrace();
            }
            return true;
        } else {
            String str = f13912H;
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
            mo27560F1().setBright(Long.valueOf(j), Ceiling19Service.C7949a1.smooth, 500L, new C6716p0(j));
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
    public Ceiling19Service mo27560F1() {
        AbstractDevice abstractDevice = this.f7251n;
        if (abstractDevice != null && (abstractDevice instanceof YeelightCeiling19Device)) {
            return ((YeelightCeiling19Device) abstractDevice).mDeviceService;
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
            mo27560F1().setCt(Long.valueOf((long) i), Ceiling19Service.C7949a1.smooth, 500L, new C6685a(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s2 */
    public boolean mo28330s2(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof Ceiling19Service.C8024z1)) {
            C4308b.m12139r(f13912H, "Invalid handler or listener!");
        }
        if (mo27560F1() == null) {
            return true;
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (Ceiling19Service.C8024z1) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        try {
            mo27560F1().setDefault(new C6715p(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        try {
            mo27560F1().addCron(0L, Long.valueOf((long) i), new C6718r(this));
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
            mo27560F1().sendCmd(Ceiling19Service.C8023z0.cfg_smart_switch, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C6702i0(z));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f13913A);
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
            m19992r2(Ceiling19Service.C8018x1.valueOf(jSONArray.getString(0)), Ceiling19Service.C8021y1.valueOf(jSONArray.getString(1)), Ceiling19Service.C8020y0.valueOf(jSONArray.getString(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), jSONArray.getString(8), jSONArray.getString(9), Long.valueOf(jSONArray.getLong(10)), Long.valueOf(jSONArray.getLong(11)), Long.valueOf(jSONArray.getLong(12)), Long.valueOf(jSONArray.getLong(13)), jSONArray.getString(14), Long.valueOf(jSONArray.getLong(15)), Long.valueOf(jSONArray.getLong(16)), Long.valueOf(jSONArray.getLong(17)), Long.valueOf(jSONArray.getLong(18)), Long.valueOf(jSONArray.getLong(19)), Long.valueOf(jSONArray.getLong(20)));
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
                mo27560F1().getProperties(new C6699h());
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
                mo27560F1().setFlowScene("cf", Long.valueOf((long) yVar.mo31871c().mo31724i()), Long.valueOf((long) yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g(), new C6687b(yVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (yVar.mo31858G()) {
            try {
                mo27560F1().setScene("off", 0L, 0L, new C6689c(yVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (yVar.mo31893y()) {
            try {
                mo27560F1().setScene("bright", Long.valueOf((long) yVar.mo31874f()), 500L, new C6691d(yVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (yVar.mo31855D()) {
            try {
                mo27560F1().setScene("ct", Long.valueOf((long) yVar.mo31876h()), Long.valueOf((long) yVar.mo31874f()), new C6693e(yVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (yVar.mo31857F()) {
            try {
                mo27560F1().setNLScene("nightlight", Long.valueOf((long) yVar.mo31874f()), new C6695f(yVar));
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
                mo27560F1().setSceneBundle(a0.get(0).mo31742Y(), a0.get(1).mo31742Y(), new C6697g(yVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str = f13912H;
            C4308b.m12139r(str, "invalid scene mode: " + yVar.mo31884p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[]{mo27560F1().getService().getProperty("MainPower").getInternalName(), mo27560F1().getService().getProperty("Power").getInternalName(), mo27560F1().getService().getProperty("BgPower").getInternalName(), mo27560F1().getService().getProperty("Bright").getInternalName(), mo27560F1().getService().getProperty("BgBright").getInternalName(), mo27560F1().getService().getProperty("Ct").getInternalName(), mo27560F1().getService().getProperty("BgCt").getInternalName(), mo27560F1().getService().getProperty("DelayOff").getInternalName(), mo27560F1().getService().getProperty("FlowParams").getInternalName(), mo27560F1().getService().getProperty("BgFlowParams").getInternalName(), mo27560F1().getService().getProperty("LanMode").getInternalName(), mo27560F1().getService().getProperty("SaveState").getInternalName(), mo27560F1().getService().getProperty("onFromPower").getInternalName(), mo27560F1().getService().getProperty("NLBright").getInternalName(), mo27560F1().getService().getProperty("NightTimeInfo").getInternalName(), mo27560F1().getService().getProperty("MiBandSleep").getInternalName(), mo27560F1().getService().getProperty("BgRgb").getInternalName(), mo27560F1().getService().getProperty("Flowing").getInternalName(), mo27560F1().getService().getProperty("BgFlowing").getInternalName(), mo27560F1().getService().getProperty("BgProact").getInternalName(), mo27560F1().getService().getProperty("SmartSwitch").getInternalName()};
    }
}
