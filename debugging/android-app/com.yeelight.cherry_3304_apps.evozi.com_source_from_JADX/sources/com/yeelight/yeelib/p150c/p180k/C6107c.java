package com.yeelight.yeelib.p150c.p180k;

import android.os.Handler;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.device.models.C7618e;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p179j.C6085b;
import com.yeelight.yeelib.p150c.p179j.C6092c;
import com.yeelight.yeelib.p150c.p183m.C6459e0;
import com.yeelight.yeelib.p150c.p184n.C7558h;
import com.yeelight.yeelib.p150c.p184n.C7561k;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.utils.C10539d;
import com.yeelight.yeelib.utils.C10540e;
import java.util.List;

/* renamed from: com.yeelight.yeelib.c.k.c */
public class C6107c extends C6106b {

    /* renamed from: com.yeelight.yeelib.c.k.c$a */
    class C6108a implements Runnable {
        C6108a() {
        }

        public void run() {
            C6107c.this.mo27981q();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.k.c$b */
    class C6109b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9856y f13012a;

        C6109b(C9856y yVar) {
            this.f13012a = yVar;
        }

        public void run() {
            try {
                Thread.sleep(500);
            } catch (Exception unused) {
            }
            C6107c.this.mo27950L(this.f13012a.mo31881m(), this.f13012a.mo31878j());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.k.c$c */
    static /* synthetic */ class C6110c {

        /* renamed from: a */
        static final /* synthetic */ int[] f13014a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.yeelight.yeelib.c.i.e$d[] r0 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13014a = r0
                com.yeelight.yeelib.c.i.e$d r1 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13014a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.c.i.e$d r1 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR_HSV     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13014a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.c.i.e$d r1 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_FLOW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13014a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.c.i.e$d r1 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_SUNSHINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p180k.C6107c.C6110c.<clinit>():void");
        }
    }

    public C6107c(C5972a aVar) {
        this.f13010a = new C6092c(aVar);
        C6459e0 e0Var = (C6459e0) aVar;
    }

    /* renamed from: A */
    public void mo27939A() {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25716k(this.f13010a.mo27877j().split(Constants.COLON_SEPARATOR)).mo29066a()));
    }

    /* renamed from: B */
    public boolean mo27940B(int i) {
        C7618e C = C10540e.m25686C(i);
        "request ota cmd: " + C.mo29066a();
        return this.f13010a.mo27882x("CHAR_TELINK_OTA", C10539d.m25671b(C.mo29066a()));
    }

    /* renamed from: C */
    public void mo27941C() {
        this.f13010a.mo27883y("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25702S().mo29066a()), "reset_device");
    }

    /* renamed from: D */
    public boolean mo27942D(C6024e.C6028d dVar, C4200i iVar) {
        if (dVar == C6024e.C6028d.DEVICE_MODE_FLOW) {
            this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25687D(iVar).mo29066a()));
            return false;
        }
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25688E(dVar, iVar).mo29066a()));
        return false;
    }

    /* renamed from: E */
    public void mo27943E(C7618e eVar) {
        mo27993X(eVar, (C6085b.C6090e) null);
    }

    /* renamed from: F */
    public void mo27944F(String str, byte[] bArr) {
        if (bArr != null) {
            "sendCommand:" + C10539d.m25676g(bArr);
            this.f13010a.mo27882x(str, bArr);
        }
    }

    /* renamed from: G */
    public void mo27945G(String str, byte[] bArr, C6085b.C6090e eVar) {
        if (bArr != null) {
            this.f13010a.mo27884z(str, bArr, (String) null, eVar);
        } else if (eVar != null) {
            eVar.mo27916a();
        }
    }

    /* renamed from: H */
    public boolean mo27946H(byte[] bArr) {
        return false;
    }

    /* renamed from: I */
    public void mo27947I(C7561k kVar) {
        this.f13010a.mo27883y("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25706a(kVar.mo28942d(), kVar.mo28943e(), 0, kVar.mo28945f(), kVar.mo28951l(), kVar.mo28955p()).mo29066a()), "setAwakeTime");
    }

    /* renamed from: J */
    public boolean mo27948J(int i) {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25727v(i).mo29066a()));
        return false;
    }

    /* renamed from: K */
    public boolean mo27949K(int i) {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25725t(i, -1).mo29066a()));
        return false;
    }

    /* renamed from: L */
    public boolean mo27950L(int i, int[] iArr) {
        "cherry: setColorFlow interval = " + (i / 1000);
        if (i < 1000) {
            i = 1000;
        }
        if (i > 600000) {
            i = 600000;
        }
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25700Q(iArr, i / 1000).mo29066a()));
        return false;
    }

    /* renamed from: M */
    public boolean mo27951M(int i) {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25693J(i, -1).mo29066a()));
        return false;
    }

    /* renamed from: N */
    public void mo27952N(int i, int i2) {
        this.f13010a.mo27883y("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25704U(i, i2).mo29066a()), "setDelay");
    }

    /* renamed from: O */
    public boolean mo27953O(C6024e.C6028d dVar) {
        int i = C6110c.f13014a[dVar.ordinal()];
        int i2 = 3;
        if (!(i == 1 || i == 2)) {
            i2 = i != 3 ? i != 4 ? 0 : 1 : 2;
        }
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25689F(i2).mo29066a()));
        return false;
    }

    /* renamed from: P */
    public void mo27954P(C7558h hVar) {
        this.f13010a.mo27883y("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25705V(hVar).mo29066a()), "setNightLight");
    }

    /* renamed from: Q */
    public boolean mo27955Q(String str, boolean z) {
        return this.f13010a.mo27880v(str, z, (String) null);
    }

    /* renamed from: R */
    public boolean mo27956R(C9856y yVar) {
        if (yVar.mo31893y()) {
            mo27948J(yVar.mo31874f());
            return false;
        } else if (yVar.mo31853B()) {
            mo27994Y(yVar.mo31875g(), yVar.mo31874f());
            return false;
        } else if (yVar.mo31855D()) {
            mo27995Z(yVar.mo31876h(), yVar.mo31874f());
            return false;
        } else if (!yVar.mo31891w()) {
            return false;
        } else {
            mo27948J(yVar.mo31874f());
            new Thread(new C6109b(yVar)).start();
            return false;
        }
    }

    /* renamed from: S */
    public void mo27957S(byte[] bArr) {
    }

    /* renamed from: T */
    public void mo27958T() {
        C7618e H = C10540e.m25691H();
        "request switch oad cmd: " + H.mo29066a();
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(H.mo29066a()));
    }

    /* renamed from: U */
    public boolean mo27959U(int i) {
        C7618e I = C10540e.m25692I(i);
        "sync id cmd: " + I.mo29066a();
        return this.f13010a.mo27882x("CHAR_OTA_CTRL", C10539d.m25671b(I.mo29066a()));
    }

    /* renamed from: V */
    public boolean mo27960V() {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25708c(this.f13010a.mo27877j().split(Constants.COLON_SEPARATOR)).mo29066a()));
        return true;
    }

    /* renamed from: W */
    public boolean mo27961W(int i) {
        C7618e h = C10540e.m25713h(i);
        "write flash cmd: " + h.mo29066a();
        return this.f13010a.mo27882x("CHAR_OTA_CTRL", C10539d.m25671b(h.mo29066a()));
    }

    /* renamed from: X */
    public void mo27993X(C7618e eVar, C6085b.C6090e eVar2) {
        new Throwable();
        this.f13010a.mo27884z("CHAR_GINGKO_CTRL", C10539d.m25671b(eVar.mo29066a()), (String) null, eVar2);
    }

    /* renamed from: Y */
    public boolean mo27994Y(int i, int i2) {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25725t(i, i2).mo29066a()));
        return false;
    }

    /* renamed from: Z */
    public boolean mo27995Z(int i, int i2) {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25693J(i, i2).mo29066a()));
        return false;
    }

    /* renamed from: a */
    public boolean mo27965a() {
        C7618e e = C10540e.m25710e();
        "check crc cmd: " + e.mo29066a();
        return this.f13010a.mo27882x("CHAR_OTA_CTRL", C10539d.m25671b(e.mo29066a()));
    }

    /* renamed from: b */
    public boolean mo27966b() {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25729x(false).mo29066a()));
        return true;
    }

    /* renamed from: c */
    public void mo27967c() {
        this.f13010a.mo27873c();
    }

    /* renamed from: d */
    public void mo27968d() {
        this.f13010a.mo27874d();
    }

    /* renamed from: e */
    public void mo27969e() {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25707b(6).mo29066a()));
    }

    /* renamed from: f */
    public void mo27970f() {
        this.f13010a.mo27904f();
    }

    /* renamed from: g */
    public void mo27971g() {
        this.f13010a.mo27876h();
    }

    /* renamed from: h */
    public boolean mo27972h() {
        return this.f13010a.mo27880v("CHAR_GINGKO_NOTIFY", true, "GingkoNotify");
    }

    /* renamed from: i */
    public boolean mo27973i() {
        return this.f13010a.mo27880v("CHAR_OTA_NOTIFY", true, "OtaNotify");
    }

    /* renamed from: j */
    public boolean mo27974j(int i) {
        C7618e g = C10540e.m25712g(i);
        "finish ota cmd: " + g.mo29066a();
        return this.f13010a.mo27882x("CHAR_OTA_CTRL", C10539d.m25671b(g.mo29066a()));
    }

    /* renamed from: k */
    public boolean mo27975k() {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25729x(true).mo29066a()));
        return true;
    }

    /* renamed from: l */
    public boolean mo27976l(byte[] bArr) {
        return this.f13010a.mo27883y("CHAR_TELINK_OTA", bArr, "ota_data");
    }

    /* renamed from: m */
    public void mo27977m() {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25720o(3).mo29066a()));
    }

    /* renamed from: n */
    public void mo27978n() {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25720o(2).mo29066a()));
    }

    /* renamed from: o */
    public void mo27979o() {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25720o(1).mo29066a()));
    }

    /* renamed from: p */
    public void mo27980p() {
        this.f13010a.mo27883y("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25695L().mo29066a()), "queryDelay");
    }

    /* renamed from: q */
    public void mo27981q() {
        this.f13010a.mo27883y("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25726u().mo29066a()), "queryDeviceName");
    }

    /* renamed from: r */
    public void mo27982r() {
        this.f13010a.mo27882x("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25728w().mo29066a()));
    }

    /* renamed from: s */
    public void mo27983s() {
        this.f13010a.mo27868A("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25722q().mo29066a()), "queryFirmware");
    }

    /* renamed from: t */
    public void mo27984t() {
        this.f13010a.mo27883y("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25698O().mo29066a()), "queryNightLight");
    }

    /* renamed from: u */
    public void mo27985u() {
        this.f13010a.mo27883y("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25684A().mo29066a()), "queryTimer");
    }

    /* renamed from: v */
    public void mo27986v() {
        this.f13010a.mo27883y("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25699P().mo29066a()), "queryWakeUp");
    }

    /* renamed from: w */
    public boolean mo27987w(String str, C6085b.C6090e eVar) {
        return this.f13010a.mo27878n(str, eVar) == 0;
    }

    /* renamed from: y */
    public void mo27988y() {
        this.f13010a.mo27879p();
    }

    /* renamed from: z */
    public void mo27989z(String str) {
        if (str == null) {
            str = "";
        }
        List<C7618e> y = C10540e.m25730y(str);
        if (y != null) {
            for (int i = 0; i < y.size(); i++) {
                this.f13010a.mo27883y("CHAR_GINGKO_CTRL", C10539d.m25671b(y.get(i).mo29066a()), "renameDeviceName");
            }
        }
        new Handler().postDelayed(new C6108a(), 100);
    }
}
