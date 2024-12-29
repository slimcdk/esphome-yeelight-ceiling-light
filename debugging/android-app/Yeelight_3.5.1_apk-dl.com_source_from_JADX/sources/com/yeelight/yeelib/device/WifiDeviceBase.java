package com.yeelight.yeelib.device;

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
import com.yeelight.cherry.p141ui.activity.ComboDeviceControlActivity;
import com.yeelight.cherry.p141ui.activity.DemoControlViewActivity;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.authority.C6031b;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6091a;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.C8301v;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.p142ui.activity.DeviceOfflinePromptActivity;
import java.util.ArrayList;
import java.util.List;
import p227x3.C11981q;
import p232y3.C12048k;
import p237z3.C12143c;
import p237z3.C12145e;

public abstract class WifiDeviceBase extends C3012e implements C12145e {

    /* renamed from: x */
    protected C6080i f12430x;

    /* renamed from: y */
    protected C6079h f12431y;

    public enum Power {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.WifiDeviceBase$a */
    class C6072a implements CompletionHandler {
        C6072a(WifiDeviceBase wifiDeviceBase) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe when disclaim: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.device.WifiDeviceBase$b */
    class C6073b implements CompletionHandler {
        C6073b(WifiDeviceBase wifiDeviceBase) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.device.WifiDeviceBase$c */
    class C6074c implements DeviceManager.QueryFirmwareHandler {
        C6074c() {
        }

        public void onFailed(int i, String str) {
            String.format("queryFirmware: Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed(MiotFirmware miotFirmware) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryFirmware:: onSucceed, device: ");
            sb.append(WifiDeviceBase.this.mo23210U());
            WifiDeviceBase.this.mo23191J0(new C11981q(miotFirmware));
        }
    }

    /* renamed from: com.yeelight.yeelib.device.WifiDeviceBase$d */
    class C6075d implements CompletionHandler {
        C6075d() {
        }

        public void onFailed(int i, String str) {
            String.format("upgradeFirmware: onFailed,  code: %d %s", new Object[]{Integer.valueOf(i), str});
            if (WifiDeviceBase.this.mo23197N() != null) {
                WifiDeviceBase.this.mo23197N().mo42539k(false);
            }
        }

        public void onSucceed() {
            if (WifiDeviceBase.this.mo23197N() != null) {
                WifiDeviceBase.this.mo23197N().mo42539k(true);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.WifiDeviceBase$e */
    class C6076e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f12435a;

        C6076e(String str) {
            this.f12435a = str;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            WifiDeviceBase.this.mo23221d0().mo31533D0(this.f12435a);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.WifiDeviceBase$f */
    class C6077f implements DeviceManager.TimerListener {
        C6077f() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed(List<Timer> list) {
            ArrayList arrayList = new ArrayList();
            for (Timer yeelightTimer : list) {
                arrayList.add(new YeelightTimer(yeelightTimer));
            }
            WifiDeviceBase.this.mo23221d0().mo31579b(1, arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.WifiDeviceBase$g */
    static /* synthetic */ class C6078g {

        /* renamed from: a */
        static final /* synthetic */ int[] f12438a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yeelight.yeelib.interaction.ActionType[] r0 = com.yeelight.yeelib.interaction.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12438a = r0
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.ON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12438a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.OFF     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12438a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.WifiDeviceBase.C6078g.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.WifiDeviceBase$h */
    public interface C6079h {
        /* renamed from: j */
        void mo31495j(Long l);

        /* renamed from: l */
        void mo31496l(Long l);

        /* renamed from: n */
        void mo31497n(Long l);

        /* renamed from: o */
        void mo31498o(Power power);

        /* renamed from: p */
        void mo31499p(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.WifiDeviceBase$i */
    public interface C6080i {
        /* renamed from: a */
        void mo31500a(Long l);

        /* renamed from: h */
        void mo31501h(Long l);

        /* renamed from: j */
        void mo31502j(Long l);

        /* renamed from: k */
        void mo31503k(Long l);

        /* renamed from: l */
        void mo31504l(Long l);

        /* renamed from: m */
        void mo31505m(Power power);
    }

    public WifiDeviceBase(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str3, new C12048k(str2));
        mo23189I0("wifi");
        mo23199O0(ownership);
        mo23178B0(this);
        mo31482K1();
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23114A1();
        }
        return false;
    }

    /* renamed from: C1 */
    public boolean mo31474C1() {
        return false;
    }

    /* renamed from: D1 */
    public void mo31475D1() {
        mo31494W1(new C6072a(this));
        mo23133V0((C12143c) null);
        mo23213W0((C12145e) null);
        try {
            MiotManager.getDeviceManager().disclaimOwnership(this.f4749n, new C6073b(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: E1 */
    public boolean mo31476E1(String str, int i) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23128P1(str, i);
        }
        return false;
    }

    /* renamed from: F1 */
    public abstract Object mo31477F1();

    /* renamed from: G */
    public String mo23185G() {
        if (this.f4749n == null && (mo23212W() == Device.Ownership.MINE || mo23212W() == Device.Ownership.OTHERS)) {
            return this.f4753r;
        }
        AbstractDevice abstractDevice = this.f4749n;
        return (abstractDevice == null || abstractDevice.getDeviceId() == null || this.f4749n.getDeviceId().isEmpty()) ? mo23202Q(mo23206S().getAddress()) : this.f4749n.getDeviceId();
    }

    /* renamed from: G1 */
    public String mo31478G1() {
        return "setFlowScene";
    }

    /* renamed from: H1 */
    public String mo31479H1() {
        return "setNLScene";
    }

    /* renamed from: I1 */
    public String mo31480I1() {
        return "setScene";
    }

    /* renamed from: J */
    public String mo23190J() {
        return "wifi";
    }

    /* renamed from: J1 */
    public String mo31481J1() {
        return "setSceneBundle";
    }

    /* renamed from: K0 */
    public void mo23193K0(LanDevice lanDevice) {
        LanDevice lanDevice2 = this.f4741f;
        if (lanDevice2 != null) {
            lanDevice2.mo23125M2();
        }
        if (lanDevice != null) {
            lanDevice.mo23117F2(this.f12430x);
            lanDevice.mo23115E2(this.f12431y);
        }
        super.mo23193K0(lanDevice);
    }

    /* renamed from: K1 */
    public abstract void mo31482K1();

    /* renamed from: L1 */
    public void mo31483L1() {
        try {
            MiotManager.getDeviceManager().queryTimerList(mo23185G(), new C6077f());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: M0 */
    public void mo23196M0(AbstractDevice abstractDevice) {
        super.mo23196M0(abstractDevice);
        this.f4759w = new C6031b();
        this.f4753r = abstractDevice.getDeviceId();
        mo23198N0(this.f4749n.getName());
        mo23199O0(this.f4749n.getOwnership());
        mo23221d0().mo31549L0(this.f4749n.isOnline());
        mo23184F0(mo23145k0() ? 11 : 0);
        ((C12048k) mo23221d0()).mo42737c1(abstractDevice.getDevice().getConnectionInfo().getHost());
    }

    /* renamed from: M1 */
    public abstract boolean mo31484M1(boolean z);

    /* renamed from: N1 */
    public boolean mo31485N1(boolean z) {
        return false;
    }

    /* renamed from: O1 */
    public boolean mo31486O1(boolean z) {
        return false;
    }

    /* renamed from: P1 */
    public void mo31487P1(boolean z) {
    }

    /* renamed from: Q1 */
    public boolean mo31488Q1(String str, String str2, int i) {
        return false;
    }

    /* renamed from: R */
    public String mo23204R() {
        return mo23206S().getAddress();
    }

    /* renamed from: R1 */
    public abstract boolean mo31489R1(int i);

    /* renamed from: S1 */
    public abstract boolean mo31490S1(boolean z);

    /* renamed from: T1 */
    public boolean mo31491T1(int i, int i2, int i3, String str) {
        return false;
    }

    /* renamed from: U0 */
    public boolean mo23131U0() {
        mo23156r();
        if (mo23206S() != null) {
            mo31475D1();
        }
        DeviceDataProvider.m17627i(this);
        return true;
    }

    /* renamed from: U1 */
    public abstract boolean mo31492U1();

    /* renamed from: V1 */
    public abstract boolean mo31493V1();

    /* renamed from: W1 */
    public abstract boolean mo31494W1(Object obj);

    /* renamed from: X */
    public String mo23214X() {
        return "setPower";
    }

    /* renamed from: Y0 */
    public boolean mo23137Y0() {
        mo23197N().mo42539k(true);
        try {
            MiotManager.getDeviceManager().startUpgradeFirmware(this.f4749n, new C6075d());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23140b1();
        }
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23141c1();
        }
        return false;
    }

    /* renamed from: f1 */
    public boolean mo23142f1(boolean z) {
        return false;
    }

    /* renamed from: g0 */
    public int mo23143g0() {
        return 0;
    }

    /* renamed from: i1 */
    public String mo23144i1() {
        return this.f4736a;
    }

    /* renamed from: k0 */
    public boolean mo23145k0() {
        AbstractDevice abstractDevice = this.f4749n;
        return abstractDevice != null && abstractDevice.isOnline() && (mo23212W() == Device.Ownership.MINE || mo23212W() == Device.Ownership.OTHERS);
    }

    /* renamed from: k1 */
    public boolean mo23146k1() {
        return super.mo23146k1();
    }

    /* renamed from: l0 */
    public boolean mo23147l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23148l1();
        }
        return false;
    }

    /* renamed from: m0 */
    public boolean mo23149m0() {
        return !mo23145k0();
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23150m1(i);
        }
        return false;
    }

    /* renamed from: n */
    public void mo23151n() {
    }

    /* renamed from: o0 */
    public boolean mo23230o0() {
        return mo23145k0();
    }

    /* renamed from: o1 */
    public boolean mo23152o1(DeviceStatusBase.DeviceMode deviceMode) {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 1024 && (mo23212W() == Device.Ownership.MINE || mo23212W() == Device.Ownership.OTHERS)) {
            DeviceDataProvider.m17615a0(this);
        }
        if ((this.f4742g & i) != 0) {
            C8301v.m19658b(mo23185G(), i & this.f4742g);
        }
    }

    /* renamed from: p0 */
    public boolean mo23153p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23154p1(j);
        }
        return false;
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23155q1(i);
        }
        return false;
    }

    /* renamed from: r */
    public void mo23156r() {
        mo23184F0(0);
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s */
    public boolean mo23158s(ActionType actionType) {
        StringBuilder sb = new StringBuilder();
        sb.append("Wfifi device base, do action, action: ");
        sb.append(actionType);
        int i = C6078g.f12438a[actionType.ordinal()];
        if (i == 1) {
            mo23148l1();
        } else if (i == 2) {
            mo23140b1();
        } else if (i == 3) {
            mo23154p1(0);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23235s0(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("WifiDeviceBase, notifyConnStateChanged, ");
        sb.append(i);
        sb.append(" -> ");
        sb.append(i2);
        if (i2 == 11 && (this.f4749n.getOwnership() == Device.Ownership.MINE || this.f4749n.getOwnership() == Device.Ownership.OTHERS)) {
            mo23167x0();
            mo23169y0();
            mo31483L1();
        }
        if (i2 == 11 && this.f4749n.getOwnership() == Device.Ownership.MINE) {
            C8301v.m19657a(this);
        } else if (i2 == 0) {
            mo23183E0(-1);
        }
        for (C12143c onConnectionStateChanged : this.f4740e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23159s1(i);
        }
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23160t1();
        }
        return false;
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
        Class cls;
        if (!C8272e.m19511b().mo35204d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23145k0()) {
            Class cls2 = null;
            try {
                if (this instanceof C6091a) {
                    cls = ComboDeviceControlActivity.class;
                    int i = ComboDeviceControlActivity.f10016l;
                } else {
                    cls = DemoControlViewActivity.class;
                    int i2 = DemoControlViewActivity.f10265p;
                }
                cls2 = cls;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (cls2 != null && mo23145k0()) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), cls2);
                intent.putExtra("com.yeelight.cherry.device_id", mo23185G());
                view.getContext().startActivity(intent);
            }
        } else {
            Intent intent2 = new Intent();
            intent2.setClass(view.getContext(), DeviceOfflinePromptActivity.class);
            intent2.putExtra("com.yeelight.cherry.device_id", this.f4753r);
            view.getContext().startActivity(intent2);
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23162u1(i);
        }
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23165w1(DeviceStatusBase.DeviceMode deviceMode) {
        mo23221d0().mo31531C0(deviceMode);
        return true;
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        if (i == 1) {
            FieldList fieldList = new FieldList();
            String str = (String) obj;
            fieldList.initField(DeviceDefinition.Name, str);
            try {
                MiotManager.getDeviceManager().modifyDevice(this.f4749n, fieldList, new C6076e(str));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        } else if (i == 6) {
            return mo23137Y0();
        } else {
            if (i == 8) {
                mo31483L1();
            }
        }
        return false;
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice != null) {
            return lanDevice.mo23167x0();
        }
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        LanDevice lanDevice = this.f4741f;
        if (lanDevice == null) {
            return false;
        }
        lanDevice.mo23168x1(sVar);
        return true;
    }

    /* renamed from: y0 */
    public void mo23169y0() {
        StringBuilder sb = new StringBuilder();
        sb.append("queryFirmware: ");
        sb.append(mo23221d0().mo31526A());
        MiotFirmware miotFirmware = this.f4749n.getMiotFirmware();
        if (miotFirmware != null) {
            mo23191J0(new C11981q(miotFirmware));
            return;
        }
        try {
            MiotManager.getDeviceManager().queryFirmwareInfo(this.f4749n, new C6074c());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }
}
