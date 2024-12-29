package p211t3;

import android.os.Handler;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.connections.C6142a;
import com.yeelight.yeelib.device.connections.ConnectionBase;
import com.yeelight.yeelib.device.status.TimerModel;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.C8896a;
import java.util.List;
import p051j4.C9186c;
import p227x3.C11967d;
import p232y3.C12045h;

/* renamed from: t3.a */
public class C10383a extends C10387b {

    /* renamed from: t3.a$a */
    class C10384a implements Runnable {
        C10384a() {
        }

        public void run() {
            C10383a.this.mo42022q();
        }
    }

    /* renamed from: t3.a$b */
    class C10385b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8327s f19453a;

        C10385b(C8327s sVar) {
            this.f19453a = sVar;
        }

        public void run() {
            try {
                Thread.sleep(500);
            } catch (Exception unused) {
            }
            C10383a.this.mo41991L(this.f19453a.mo35446m(), this.f19453a.mo35443j());
        }
    }

    /* renamed from: t3.a$c */
    static /* synthetic */ class C10386c {

        /* renamed from: a */
        static final /* synthetic */ int[] f19455a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode[] r0 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19455a = r0
                com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r1 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19455a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r1 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19455a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r1 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19455a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r1 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p211t3.C10383a.C10386c.<clinit>():void");
        }
    }

    public C10383a(C6081a aVar) {
        this.f19456a = new C6142a(aVar);
    }

    /* renamed from: A */
    public void mo41980A() {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22114k(this.f19456a.mo31797j().split(Constants.COLON_SEPARATOR)).mo42537a()));
    }

    /* renamed from: B */
    public boolean mo41981B(int i) {
        C11967d C = C9186c.m22084C(i);
        StringBuilder sb = new StringBuilder();
        sb.append("request ota cmd: ");
        sb.append(C.mo42537a());
        return this.f19456a.mo31811x("CHAR_OTA_CTRL", C8896a.m21225b(C.mo42537a()));
    }

    /* renamed from: C */
    public void mo41982C() {
        this.f19456a.mo31812y("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22100S().mo42537a()), "reset_device");
    }

    /* renamed from: D */
    public boolean mo41983D(DeviceStatusBase.DeviceMode deviceMode, C3012e eVar) {
        if (deviceMode == DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW) {
            this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22085D(eVar).mo42537a()));
            return false;
        }
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22086E(deviceMode, eVar).mo42537a()));
        return false;
    }

    /* renamed from: E */
    public void mo41984E(String str, byte[] bArr) {
    }

    /* renamed from: F */
    public void mo41985F(String str, byte[] bArr, ConnectionBase.C6140c cVar) {
    }

    /* renamed from: G */
    public void mo41986G(C11967d dVar) {
        mo42003X(dVar, (ConnectionBase.C6140c) null);
    }

    /* renamed from: H */
    public boolean mo41987H(byte[] bArr) {
        return this.f19456a.mo31812y("CHAR_OAD_BLOCK", bArr, "oad_data");
    }

    /* renamed from: I */
    public void mo41988I(TimerModel timerModel) {
        this.f19456a.mo31812y("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22104a(timerModel.getHour(), timerModel.getMinute(), 0, timerModel.getMode(), timerModel.getRepeatArray(), timerModel.isEnable()).mo42537a()), "setAwakeTime");
    }

    /* renamed from: J */
    public boolean mo41989J(int i) {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22115l(i).mo42537a()));
        return false;
    }

    /* renamed from: K */
    public boolean mo41990K(int i) {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22123t(i, -1).mo42537a()));
        return false;
    }

    /* renamed from: L */
    public boolean mo41991L(int i, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("cherry: setColorFlow interval = ");
        sb.append(i / 1000);
        if (i < 1000) {
            i = 1000;
        }
        if (i > 600000) {
            i = 600000;
        }
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22098Q(iArr, i / 1000).mo42537a()));
        return false;
    }

    /* renamed from: M */
    public boolean mo41992M(int i) {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22091J(i, -1).mo42537a()));
        return false;
    }

    /* renamed from: N */
    public void mo41993N(int i, int i2) {
        this.f19456a.mo31812y("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22101T(i, i2).mo42537a()), "setDelay");
    }

    /* renamed from: O */
    public boolean mo41994O(DeviceStatusBase.DeviceMode deviceMode) {
        int i = C10386c.f19455a[deviceMode.ordinal()];
        int i2 = 3;
        if (!(i == 1 || i == 2)) {
            i2 = i != 3 ? i != 4 ? 0 : 1 : 2;
        }
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22087F(i2).mo42537a()));
        return false;
    }

    /* renamed from: P */
    public void mo41995P(C12045h hVar) {
        this.f19456a.mo31812y("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22103V(hVar).mo42537a()), "setNightLight");
    }

    /* renamed from: Q */
    public boolean mo41996Q(String str, boolean z) {
        return false;
    }

    /* renamed from: R */
    public boolean mo41997R(C8327s sVar) {
        if (sVar.mo35458y()) {
            mo41989J(sVar.mo35439f());
            return false;
        } else if (sVar.mo35417B()) {
            mo42004Y(sVar.mo35440g(), sVar.mo35439f());
            return false;
        } else if (sVar.mo35419D()) {
            mo42005Z(sVar.mo35441h(), sVar.mo35439f());
            return false;
        } else if (!sVar.mo35456w()) {
            return false;
        } else {
            mo41989J(sVar.mo35439f());
            new Thread(new C10385b(sVar)).start();
            return false;
        }
    }

    /* renamed from: S */
    public void mo41998S(byte[] bArr) {
        this.f19456a.mo31811x("CHAR_OAD_NOTIFY", bArr);
    }

    /* renamed from: T */
    public void mo41999T() {
        C11967d H = C9186c.m22089H();
        StringBuilder sb = new StringBuilder();
        sb.append("request switch oad cmd: ");
        sb.append(H.mo42537a());
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(H.mo42537a()));
    }

    /* renamed from: U */
    public boolean mo42000U(int i) {
        C11967d I = C9186c.m22090I(i);
        StringBuilder sb = new StringBuilder();
        sb.append("sync id cmd: ");
        sb.append(I.mo42537a());
        return this.f19456a.mo31811x("CHAR_OTA_CTRL", C8896a.m21225b(I.mo42537a()));
    }

    /* renamed from: V */
    public boolean mo42001V() {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22106c(this.f19456a.mo31797j().split(Constants.COLON_SEPARATOR)).mo42537a()));
        return true;
    }

    /* renamed from: W */
    public boolean mo42002W(int i) {
        C11967d h = C9186c.m22111h(i);
        StringBuilder sb = new StringBuilder();
        sb.append("write flash cmd: ");
        sb.append(h.mo42537a());
        return this.f19456a.mo31811x("CHAR_OTA_CTRL", C8896a.m21225b(h.mo42537a()));
    }

    /* renamed from: X */
    public void mo42003X(C11967d dVar, ConnectionBase.C6140c cVar) {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(dVar.mo42537a()));
    }

    /* renamed from: Y */
    public boolean mo42004Y(int i, int i2) {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22123t(i, i2).mo42537a()));
        return false;
    }

    /* renamed from: Z */
    public boolean mo42005Z(int i, int i2) {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22091J(i, i2).mo42537a()));
        return false;
    }

    /* renamed from: a */
    public boolean mo42006a() {
        C11967d e = C9186c.m22108e();
        StringBuilder sb = new StringBuilder();
        sb.append("check crc cmd: ");
        sb.append(e.mo42537a());
        return this.f19456a.mo31811x("CHAR_OTA_CTRL", C8896a.m21225b(e.mo42537a()));
    }

    /* renamed from: b */
    public boolean mo42007b() {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22088G(false).mo42537a()));
        return true;
    }

    /* renamed from: c */
    public void mo42008c() {
        this.f19456a.mo31790c();
    }

    /* renamed from: d */
    public void mo42009d() {
        this.f19456a.mo31791d();
    }

    /* renamed from: e */
    public void mo42010e() {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22105b(6).mo42537a()));
    }

    /* renamed from: f */
    public void mo42011f() {
        this.f19456a.mo31793f();
    }

    /* renamed from: g */
    public void mo42012g() {
        this.f19456a.mo31795h();
    }

    /* renamed from: h */
    public boolean mo42013h() {
        return this.f19456a.mo31809v("CHAR_CHERRY_NOTIFY", true, "CherryNotify");
    }

    /* renamed from: i */
    public boolean mo42014i() {
        return this.f19456a.mo31809v("CHAR_OTA_NOTIFY", true, "OtaNotify");
    }

    /* renamed from: j */
    public boolean mo42015j(int i) {
        C11967d g = C9186c.m22110g(i);
        StringBuilder sb = new StringBuilder();
        sb.append("finish ota cmd: ");
        sb.append(g.mo42537a());
        return this.f19456a.mo31811x("CHAR_OTA_CTRL", C8896a.m21225b(g.mo42537a()));
    }

    /* renamed from: k */
    public boolean mo42016k() {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22088G(true).mo42537a()));
        return true;
    }

    /* renamed from: l */
    public boolean mo42017l(byte[] bArr) {
        return this.f19456a.mo31812y("CHAR_OTA_CTRL", bArr, "ota_data");
    }

    /* renamed from: m */
    public void mo42018m() {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22118o(3).mo42537a()));
    }

    /* renamed from: n */
    public void mo42019n() {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22118o(2).mo42537a()));
    }

    /* renamed from: o */
    public void mo42020o() {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22118o(1).mo42537a()));
    }

    /* renamed from: p */
    public void mo42021p() {
        this.f19456a.mo31812y("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22093L().mo42537a()), "queryDelay");
    }

    /* renamed from: q */
    public void mo42022q() {
        this.f19456a.mo31812y("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22124u().mo42537a()), "queryDeviceName");
    }

    /* renamed from: r */
    public void mo42023r() {
        this.f19456a.mo31811x("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22121r().mo42537a()));
    }

    /* renamed from: s */
    public void mo42024s() {
        this.f19456a.mo31787A("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22120q().mo42537a()), "queryFirmware");
    }

    /* renamed from: t */
    public void mo42025t() {
        this.f19456a.mo31812y("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22096O().mo42537a()), "queryNightLight");
    }

    /* renamed from: u */
    public void mo42026u() {
        this.f19456a.mo31812y("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22082A().mo42537a()), "queryTimer");
    }

    /* renamed from: v */
    public void mo42027v() {
        this.f19456a.mo31812y("CHAR_CHERRY_CTRL", C8896a.m21225b(C9186c.m22097P().mo42537a()), "queryWakeUp");
    }

    /* renamed from: w */
    public boolean mo42028w(String str, ConnectionBase.C6140c cVar) {
        return false;
    }

    /* renamed from: y */
    public void mo42029y() {
        this.f19456a.mo31803p();
    }

    /* renamed from: z */
    public void mo42030z(String str) {
        if (str == null) {
            str = "";
        }
        List<C11967d> y = C9186c.m22128y(str);
        if (y != null) {
            for (int i = 0; i < y.size(); i++) {
                this.f19456a.mo31812y("CHAR_CHERRY_CTRL", C8896a.m21225b(y.get(i).mo42537a()), "renameDeviceName");
            }
        }
        new Handler().postDelayed(new C10384a(), 100);
    }
}
