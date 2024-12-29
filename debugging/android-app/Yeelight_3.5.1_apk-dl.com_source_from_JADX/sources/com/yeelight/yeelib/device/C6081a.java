package com.yeelight.yeelib.device;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.miot.common.device.Device;
import com.yeelight.yeelib.authority.DeviceAuthorityBase;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C8301v;
import com.yeelight.yeelib.managers.C8302y;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import p051j4.C9197p;
import p211t3.C10387b;
import p215u3.C10507u;
import p223w3.C10689c;
import p223w3.C11627r;
import p227x3.C11979o;
import p232y3.C12043g;
import p237z3.C12141a;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.device.a */
public abstract class C6081a extends C3012e implements C12145e, C12141a {

    /* renamed from: y */
    public static final String f12439y = "a";
    /* access modifiers changed from: protected */

    /* renamed from: x */
    public C10387b f12440x;

    /* renamed from: com.yeelight.yeelib.device.a$a */
    class C6082a implements C12145e {

        /* renamed from: a */
        final /* synthetic */ C8327s f12441a;

        /* renamed from: com.yeelight.yeelib.device.a$a$a */
        class C6083a implements Runnable {
            C6083a() {
            }

            public void run() {
                try {
                    Thread.sleep(500);
                } catch (Exception unused) {
                }
                C6082a aVar = C6082a.this;
                C6081a.this.mo23168x1(aVar.f12441a);
            }
        }

        C6082a(C8327s sVar) {
            this.f12441a = sVar;
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            if (i != -1) {
                if (i == 1) {
                    new Thread(new C6083a()).start();
                }
                C6081a.this.mo23213W0(this);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.a$b */
    class C6084b implements C12145e {

        /* renamed from: a */
        final /* synthetic */ C8327s f12444a;

        C6084b(C8327s sVar) {
            this.f12444a = sVar;
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            if (i != -1) {
                if (i == 4) {
                    C6081a.this.mo23168x1(this.f12444a);
                } else if (i == 8) {
                    return;
                }
                C6081a.this.mo23213W0(this);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.a$c */
    class C6085c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6093d f12446a;

        C6085c(C6093d dVar) {
            this.f12446a = dVar;
        }

        public void run() {
            this.f12446a.mo31683c(C6081a.this);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.a$d */
    class C6086d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6093d f12448a;

        C6086d(C6093d dVar) {
            this.f12448a = dVar;
        }

        public void run() {
            this.f12448a.mo31683c(C6081a.this);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.a$e */
    static /* synthetic */ class C6087e {

        /* renamed from: a */
        static final /* synthetic */ int[] f12450a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12451b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.yeelight.yeelib.authority.DeviceAuthorityBase$AuthState[] r0 = com.yeelight.yeelib.authority.DeviceAuthorityBase.AuthState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12451b = r0
                r1 = 1
                com.yeelight.yeelib.authority.DeviceAuthorityBase$AuthState r2 = com.yeelight.yeelib.authority.DeviceAuthorityBase.AuthState.AUTH_IP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f12451b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.authority.DeviceAuthorityBase$AuthState r3 = com.yeelight.yeelib.authority.DeviceAuthorityBase.AuthState.AUTH_SUC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f12451b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.authority.DeviceAuthorityBase$AuthState r4 = com.yeelight.yeelib.authority.DeviceAuthorityBase.AuthState.AUTH_FAIL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.yeelight.yeelib.interaction.ActionType[] r3 = com.yeelight.yeelib.interaction.ActionType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f12450a = r3
                com.yeelight.yeelib.interaction.ActionType r4 = com.yeelight.yeelib.interaction.ActionType.ON     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f12450a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.yeelight.yeelib.interaction.ActionType r3 = com.yeelight.yeelib.interaction.ActionType.OFF     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f12450a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.C6081a.C6087e.<clinit>():void");
        }
    }

    public C6081a(String str, String str2, DeviceStatusBase deviceStatusBase) {
        super(str, str2, deviceStatusBase);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
        mo23189I0("bluetooth");
        mo31506C1();
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        return mo23233q0() ? this.f4755t.mo23114A1() : mo23221d0().mo31584d0() ? mo23140b1() : mo23148l1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public abstract void mo31506C1();

    /* renamed from: D1 */
    public abstract void mo31507D1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    /* renamed from: E1 */
    public abstract void mo31508E1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    /* renamed from: F1 */
    public abstract void mo31509F1();

    /* renamed from: G1 */
    public abstract void mo31510G1();

    /* renamed from: H1 */
    public abstract void mo31511H1(C11979o oVar);

    /* renamed from: I1 */
    public abstract void mo31512I1(BluetoothGattDescriptor bluetoothGattDescriptor, int i);

    /* renamed from: J */
    public String mo23190J() {
        return "bluetooth";
    }

    /* renamed from: J1 */
    public abstract void mo31513J1(C11979o oVar);

    /* renamed from: K1 */
    public void mo31514K1(int i) {
        mo23221d0().mo31553N0(i);
    }

    /* renamed from: L1 */
    public abstract void mo31515L1(boolean z, boolean z2);

    /* renamed from: M1 */
    public abstract boolean mo31516M1();

    /* renamed from: N1 */
    public boolean mo31517N1() {
        this.f12440x.mo42033x();
        return true;
    }

    /* renamed from: O1 */
    public void mo31518O1(C12141a aVar) {
        this.f4759w.mo31414c(aVar);
    }

    /* renamed from: P1 */
    public boolean mo31519P1() {
        return this.f4759w.mo31415d();
    }

    /* renamed from: Q1 */
    public void mo31520Q1(C8327s sVar) {
        DeviceStatusBase.DeviceMode deviceMode;
        int p = sVar.mo35449p();
        if (p != 1) {
            if (p == 2) {
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR;
            } else if (p != 3 && p == 4) {
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW;
            }
            mo23165w1(deviceMode);
        }
        deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE;
        mo23165w1(deviceMode);
    }

    /* renamed from: R1 */
    public void mo31521R1(C12141a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Device from unregisterAuthListener is ");
        sb.append(getClass().getSimpleName());
        this.f4759w.mo31417f(aVar);
    }

    /* renamed from: S1 */
    public abstract boolean mo31522S1();

    /* renamed from: U0 */
    public boolean mo23131U0() {
        if (mo23145k0()) {
            this.f12440x.mo42001V();
            if (mo23197N().mo42510b() < 2238) {
                mo23156r();
            }
        }
        DeviceDataProvider.m17627i(this);
        return true;
    }

    /* renamed from: Y0 */
    public boolean mo23137Y0() {
        mo23184F0(8);
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        if (mo23233q0()) {
            return this.f4755t.mo23140b1();
        }
        if (mo23197N().mo42510b() < 2237) {
            mo23221d0().mo31551M0(false);
        }
        return this.f12440x.mo42007b();
    }

    /* renamed from: i1 */
    public String mo23144i1() {
        return this.f4736a;
    }

    /* renamed from: k0 */
    public boolean mo23145k0() {
        int i = this.f4751p;
        return i == 8 || i == 11 || i >= 13;
    }

    /* renamed from: k1 */
    public boolean mo23146k1() {
        C10689c cVar = this.f4755t;
        return cVar != null ? cVar.mo23146k1() : mo23221d0().mo31584d0();
    }

    /* renamed from: l0 */
    public boolean mo23147l0() {
        int i = this.f4751p;
        return i >= 1 && i <= 10;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (mo23233q0()) {
            return this.f4755t.mo23148l1();
        }
        if (mo23197N() != null && mo23197N().mo42510b() < 2237) {
            mo23221d0().mo31551M0(true);
        }
        return this.f12440x.mo42016k();
    }

    /* renamed from: m0 */
    public boolean mo23149m0() {
        return this.f4751p == 0;
    }

    /* renamed from: o1 */
    public boolean mo23152o1(DeviceStatusBase.DeviceMode deviceMode) {
        return mo23233q0() ? this.f4755t.mo23152o1(deviceMode) : this.f12440x.mo41983D(deviceMode, this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 1024) {
            DeviceDataProvider.m17615a0(this);
        }
        if ((this.f4742g & i) != 0) {
            C8301v.m19658b(mo23185G(), i & this.f4742g);
        }
    }

    /* renamed from: p0 */
    public boolean mo23153p0() {
        int i = this.f4751p;
        return i == 8 || i == 9 || i == 1;
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        if (mo23233q0()) {
            return this.f4755t.mo23154p1(j);
        }
        mo23221d0().mo31600l0(j);
        return this.f12440x.mo41989J((int) j);
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        if (mo23233q0()) {
            return this.f4755t.mo23155q1(i);
        }
        mo23221d0().mo31602m0(i);
        return this.f12440x.mo41990K(i);
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        if (mo23233q0()) {
            return this.f4755t.mo23157r1(i, iArr, i2);
        }
        ArrayList arrayList = new ArrayList();
        for (int aVar : iArr) {
            arrayList.add(new C12043g.C12044a(aVar, i));
        }
        mo23221d0().mo31604n0(arrayList);
        return this.f12440x.mo41991L(i, iArr);
    }

    /* renamed from: s */
    public boolean mo23158s(ActionType actionType) {
        int i = C6087e.f12450a[actionType.ordinal()];
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
        sb.append("BluetoothDeviceBase, notifyConnStateChanged, device: ");
        sb.append(mo23185G());
        sb.append(", state: ");
        sb.append(i);
        sb.append(" -> ");
        sb.append(i2);
        if (i2 == 0) {
            mo23183E0(-1);
            DeviceDataProvider.m17611X();
            if (mo23192K() != null) {
                for (C10507u c : mo23192K()) {
                    for (C6093d m : c.mo42176c()) {
                        m.mo31693m();
                    }
                }
            }
            if (AppUtils.f4979c && (this instanceof C11627r)) {
                C8302y.m19662f().mo35273k(mo23185G());
            }
            this.f12440x.mo42008c();
        } else if (i2 == 6) {
            mo23199O0(Device.Ownership.MINE);
            C8301v.m19657a(this);
        } else if (i2 == 10) {
            mo23167x0();
        } else if (i2 == 11) {
            DeviceDataProvider.m17615a0(this);
            for (C10507u c2 : mo23192K()) {
                for (C6093d cVar : c2.mo42176c()) {
                    new Thread(new C6085c(cVar)).start();
                }
            }
            for (C6093d dVar : mo23195M()) {
                new Thread(new C6086d(dVar)).start();
            }
            mo31522S1();
            mo31516M1();
            if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE) {
                this.f12440x.mo42018m();
            } else if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR || mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV) {
                this.f12440x.mo42020o();
            } else {
                if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW) {
                    this.f12440x.mo42020o();
                    this.f12440x.mo42018m();
                }
                if (AppUtils.f4979c && (this instanceof C11627r)) {
                    C8302y.m19662f().mo35272h(mo23185G());
                }
                C9197p.m22179l(mo23185G(), mo23208T());
            }
            this.f12440x.mo42019n();
            C8302y.m19662f().mo35272h(mo23185G());
            C9197p.m22179l(mo23185G(), mo23208T());
        }
        super.mo23235s0(i, i2);
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        if (mo23233q0()) {
            return this.f4755t.mo23159s1(i);
        }
        mo23221d0().mo31610q0(i);
        return this.f12440x.mo41992M(i);
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        if (mo23145k0() || mo23147l0()) {
            mo23156r();
        }
        mo31521R1((C12141a) null);
    }

    /* renamed from: w */
    public void mo30162w(DeviceAuthorityBase.AuthState authState) {
        int i;
        int i2 = C6087e.f12451b[authState.ordinal()];
        if (i2 == 1) {
            i = 5;
        } else if (i2 == 2) {
            mo23184F0(6);
            mo23169y0();
            return;
        } else if (i2 == 3) {
            i = 7;
        } else {
            return;
        }
        mo23184F0(i);
    }

    /* renamed from: w1 */
    public boolean mo23165w1(DeviceStatusBase.DeviceMode deviceMode) {
        return mo23233q0() ? this.f4755t.mo23165w1(deviceMode) : this.f12440x.mo41994O(deviceMode);
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        this.f12440x.mo42023r();
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        if (mo23233q0()) {
            return this.f4755t.mo23168x1(sVar);
        }
        if (!mo23146k1()) {
            mo23178B0(new C6082a(sVar));
            this.f12440x.mo42016k();
            return false;
        } else if (!mo23221d0().mo31557P0(sVar)) {
            return this.f12440x.mo41997R(sVar);
        } else {
            mo23178B0(new C6084b(sVar));
            mo31520Q1(sVar);
            return false;
        }
    }

    /* renamed from: y0 */
    public void mo23169y0() {
        this.f12440x.mo42024s();
    }
}
