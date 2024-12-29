package com.yeelight.yeelib.p150c;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.miot.api.CompletionHandler;
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.DeviceDefinition;
import com.miot.common.device.firmware.MiotFirmware;
import com.miot.common.exception.MiotException;
import com.miot.common.field.FieldList;
import com.miot.common.timer.Timer;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.models.C7640n0;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6017a;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7562l;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p152f.C9820v;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p178b.C5971c;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.DeviceOfflinePromptActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.c.h */
public abstract class C6006h extends C4200i implements C9770e {

    /* renamed from: x */
    protected C6016j f12723x;

    /* renamed from: y */
    protected C6014h f12724y;

    /* renamed from: com.yeelight.yeelib.c.h$a */
    class C6007a implements CompletionHandler {
        C6007a(C6006h hVar) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe when disclaim: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.h$b */
    class C6008b implements CompletionHandler {
        C6008b(C6006h hVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.h$c */
    class C6009c implements DeviceManager.QueryFirmwareHandler {
        C6009c() {
        }

        public void onFailed(int i, String str) {
            String.format("queryFirmware: Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed(MiotFirmware miotFirmware) {
            "queryFirmware:: onSucceed, device: " + C6006h.this.mo23397U();
            C6006h.this.mo23378J0(new C7640n0(miotFirmware));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.h$d */
    class C6010d implements CompletionHandler {
        C6010d() {
        }

        public void onFailed(int i, String str) {
            String.format("upgradeFirmware: onFailed,  code: %d %s", new Object[]{Integer.valueOf(i), str});
            if (C6006h.this.mo23384N() != null) {
                C6006h.this.mo23384N().mo29068k(false);
            }
        }

        public void onSucceed() {
            if (C6006h.this.mo23384N() != null) {
                C6006h.this.mo23384N().mo29068k(true);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.h$e */
    class C6011e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f12727a;

        C6011e(String str) {
            this.f12727a = str;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C6006h.this.mo23408d0().mo27632C0(this.f12727a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.h$f */
    class C6012f implements DeviceManager.TimerListener {
        C6012f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed(List<Timer> list) {
            ArrayList arrayList = new ArrayList();
            for (Timer yeelightTimer : list) {
                arrayList.add(new YeelightTimer(yeelightTimer));
            }
            C6006h.this.mo23408d0().mo27678b(1, arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.h$g */
    static /* synthetic */ class C6013g {

        /* renamed from: a */
        static final /* synthetic */ int[] f12730a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yeelight.yeelib.d.a[] r0 = com.yeelight.yeelib.p185d.C7563a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12730a = r0
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.ON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12730a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.OFF     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12730a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.C6006h.C6013g.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.h$h */
    public interface C6014h {
        /* renamed from: j */
        void mo27578j(Long l);

        /* renamed from: l */
        void mo27579l(Long l);

        /* renamed from: n */
        void mo27580n(Long l);

        /* renamed from: o */
        void mo27581o(C6015i iVar);

        /* renamed from: p */
        void mo27582p(C6015i iVar);
    }

    /* renamed from: com.yeelight.yeelib.c.h$i */
    public enum C6015i {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.c.h$j */
    public interface C6016j {
        /* renamed from: a */
        void mo27583a(Long l);

        /* renamed from: h */
        void mo27584h(Long l);

        /* renamed from: j */
        void mo27585j(Long l);

        /* renamed from: k */
        void mo27586k(Long l);

        /* renamed from: l */
        void mo27587l(Long l);

        /* renamed from: m */
        void mo27588m(C6015i iVar);
    }

    public C6006h(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str3, new C7562l(str2));
        mo23376I0("wifi");
        mo23386O0(ownership);
        mo23365B0(this);
        mo27565K1();
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23300A1();
        }
        return false;
    }

    /* renamed from: C1 */
    public boolean mo27557C1() {
        return false;
    }

    /* renamed from: D1 */
    public void mo27558D1() {
        mo27577W1(new C6007a(this));
        mo23319V0((C9768c) null);
        mo23400W0((C9770e) null);
        try {
            MiotManager.getDeviceManager().disclaimOwnership(this.f7251n, new C6008b(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: E1 */
    public boolean mo27559E1(String str, int i) {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23314P1(str, i);
        }
        return false;
    }

    /* renamed from: F1 */
    public abstract Object mo27560F1();

    /* renamed from: G */
    public String mo23372G() {
        if (this.f7251n == null && (mo23399W() == Device.Ownership.MINE || mo23399W() == Device.Ownership.OTHERS)) {
            return this.f7255r;
        }
        AbstractDevice abstractDevice = this.f7251n;
        return (abstractDevice == null || abstractDevice.getDeviceId() == null || this.f7251n.getDeviceId().isEmpty()) ? mo23389Q(mo23393S().getAddress()) : this.f7251n.getDeviceId();
    }

    /* renamed from: G1 */
    public String mo27561G1() {
        return "setFlowScene";
    }

    /* renamed from: H1 */
    public String mo27562H1() {
        return "setNLScene";
    }

    /* renamed from: I1 */
    public String mo27563I1() {
        return "setScene";
    }

    /* renamed from: J */
    public String mo23377J() {
        return "wifi";
    }

    /* renamed from: J1 */
    public String mo27564J1() {
        return "setSceneBundle";
    }

    /* renamed from: K0 */
    public void mo23380K0(C4191d dVar) {
        C4191d dVar2 = this.f7243f;
        if (dVar2 != null) {
            dVar2.mo23311L2();
        }
        if (dVar != null) {
            dVar.mo23302E2(this.f12723x);
            dVar.mo23301D2(this.f12724y);
        }
        super.mo23380K0(dVar);
    }

    /* renamed from: K1 */
    public abstract void mo27565K1();

    /* renamed from: L1 */
    public void mo27566L1() {
        try {
            MiotManager.getDeviceManager().queryTimerList(mo23372G(), new C6012f());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: M0 */
    public void mo23383M0(AbstractDevice abstractDevice) {
        super.mo23383M0(abstractDevice);
        this.f7261w = new C5971c();
        this.f7255r = abstractDevice.getDeviceId();
        mo23385N0(this.f7251n.getName());
        mo23386O0(this.f7251n.getOwnership());
        mo23408d0().mo27646J0(this.f7251n.isOnline());
        mo23371F0(mo23331k0() ? 11 : 0);
        ((C7562l) mo23408d0()).mo28968a1(abstractDevice.getDevice().getConnectionInfo().getHost());
    }

    /* renamed from: M1 */
    public abstract boolean mo27567M1(boolean z);

    /* renamed from: N1 */
    public boolean mo27568N1(boolean z) {
        return false;
    }

    /* renamed from: O1 */
    public boolean mo27569O1(boolean z) {
        return false;
    }

    /* renamed from: P1 */
    public void mo27570P1(boolean z) {
    }

    /* renamed from: Q1 */
    public boolean mo27571Q1(String str, String str2, int i) {
        return false;
    }

    /* renamed from: R */
    public String mo23391R() {
        return mo23393S().getAddress();
    }

    /* renamed from: R1 */
    public abstract boolean mo27572R1(int i);

    /* renamed from: S1 */
    public abstract boolean mo27573S1(boolean z);

    /* renamed from: T1 */
    public boolean mo27574T1(int i, int i2, int i3, String str) {
        return false;
    }

    /* renamed from: U0 */
    public boolean mo23317U0() {
        mo23342r();
        if (mo23393S() != null) {
            mo27558D1();
        }
        DeviceDataProvider.m22405i(this);
        return true;
    }

    /* renamed from: U1 */
    public abstract boolean mo27575U1();

    /* renamed from: V1 */
    public abstract boolean mo27576V1();

    /* renamed from: W1 */
    public abstract boolean mo27577W1(Object obj);

    /* renamed from: X */
    public String mo23401X() {
        return "setPower";
    }

    /* renamed from: Y0 */
    public boolean mo23323Y0() {
        mo23384N().mo29068k(true);
        try {
            MiotManager.getDeviceManager().startUpgradeFirmware(this.f7251n, new C6010d());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23326b1();
        }
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23327c1();
        }
        return false;
    }

    /* renamed from: f1 */
    public boolean mo23328f1(boolean z) {
        return false;
    }

    /* renamed from: g0 */
    public int mo23329g0() {
        return 0;
    }

    /* renamed from: i1 */
    public String mo23330i1() {
        return this.f7238a;
    }

    /* renamed from: k0 */
    public boolean mo23331k0() {
        AbstractDevice abstractDevice = this.f7251n;
        return abstractDevice != null && abstractDevice.isOnline() && (mo23399W() == Device.Ownership.MINE || mo23399W() == Device.Ownership.OTHERS);
    }

    /* renamed from: k1 */
    public boolean mo23332k1() {
        return super.mo23332k1();
    }

    /* renamed from: l0 */
    public boolean mo23333l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23334l1();
        }
        return false;
    }

    /* renamed from: m0 */
    public boolean mo23335m0() {
        return !mo23331k0();
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23336m1(i);
        }
        return false;
    }

    /* renamed from: n */
    public void mo23337n() {
    }

    /* renamed from: o0 */
    public boolean mo23416o0() {
        return mo23331k0();
    }

    /* renamed from: o1 */
    public boolean mo23338o1(C6024e.C6028d dVar) {
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 1024 && (mo23399W() == Device.Ownership.MINE || mo23399W() == Device.Ownership.OTHERS)) {
            DeviceDataProvider.m22393a0(this);
        }
        if ((this.f7244g & i) != 0) {
            C9820v.m23869b(mo23372G(), i & this.f7244g);
        }
    }

    /* renamed from: p0 */
    public boolean mo23339p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23340p1(j);
        }
        return false;
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23341q1(i);
        }
        return false;
    }

    /* renamed from: r */
    public void mo23342r() {
        mo23371F0(0);
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s */
    public boolean mo23344s(C7563a aVar) {
        "Wfifi device base, do action, action: " + aVar;
        int i = C6013g.f12730a[aVar.ordinal()];
        if (i == 1) {
            mo23334l1();
        } else if (i == 2) {
            mo23326b1();
        } else if (i == 3) {
            mo23340p1(0);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23421s0(int i, int i2) {
        "WifiDeviceBase, notifyConnStateChanged, " + i + " -> " + i2;
        if (i2 == 11 && (this.f7251n.getOwnership() == Device.Ownership.MINE || this.f7251n.getOwnership() == Device.Ownership.OTHERS)) {
            mo23354x0();
            mo23356y0();
            mo27566L1();
        }
        if (i2 == 11 && this.f7251n.getOwnership() == Device.Ownership.MINE) {
            C9820v.m23868a(this);
        } else if (i2 == 0) {
            mo23370E0(-1);
        }
        for (C9768c onConnectionStateChanged : this.f7242e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23345s1(i);
        }
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23346t1();
        }
        return false;
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
        if (!C9784e.m23711b().mo31628d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23331k0()) {
            Class<?> cls = null;
            try {
                cls = Class.forName(this instanceof C6017a ? "com.yeelight.cherry.ui.activity.ComboDeviceControlActivity" : "com.yeelight.cherry.ui.activity.DemoControlViewActivity");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (cls != null && mo23331k0()) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23372G());
                view.getContext().startActivity(intent);
            }
        } else {
            Intent intent2 = new Intent();
            intent2.setClass(view.getContext(), DeviceOfflinePromptActivity.class);
            intent2.putExtra("com.yeelight.cherry.device_id", this.f7255r);
            view.getContext().startActivity(intent2);
        }
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23348u1(i);
        }
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23352w1(C6024e.C6028d dVar) {
        mo23408d0().mo27630B0(dVar);
        return true;
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        if (i == 1) {
            FieldList fieldList = new FieldList();
            String str = (String) obj;
            fieldList.initField(DeviceDefinition.Name, str);
            try {
                MiotManager.getDeviceManager().modifyDevice(this.f7251n, fieldList, new C6011e(str));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        } else if (i == 6) {
            return mo23323Y0();
        } else {
            if (i == 8) {
                mo27566L1();
            }
        }
        return false;
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        C4191d dVar = this.f7243f;
        if (dVar != null) {
            return dVar.mo23354x0();
        }
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        C4191d dVar = this.f7243f;
        if (dVar == null) {
            return false;
        }
        dVar.mo23355x1(yVar);
        return true;
    }

    /* renamed from: y0 */
    public void mo23356y0() {
        "queryFirmware: " + mo23408d0().mo27627A();
        MiotFirmware miotFirmware = this.f7251n.getMiotFirmware();
        if (miotFirmware != null) {
            C7640n0 n0Var = new C7640n0(miotFirmware);
            mo23378J0(n0Var);
            n0Var.toString();
            return;
        }
        try {
            MiotManager.getDeviceManager().queryFirmwareInfo(this.f7251n, new C6009c());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }
}
