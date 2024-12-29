package com.yeelight.yeelib.p150c;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.miot.common.device.Device;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.models.C7636l0;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p150c.p180k.C6106b;
import com.yeelight.yeelib.p150c.p181l.C6122c0;
import com.yeelight.yeelib.p150c.p183m.C6324c;
import com.yeelight.yeelib.p150c.p183m.C7186q;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.p152f.C9820v;
import com.yeelight.yeelib.p152f.C9821z;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p178b.C5969b;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p185d.C7565b;
import com.yeelight.yeelib.p186e.C9766a;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10551r;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;

/* renamed from: com.yeelight.yeelib.c.a */
public abstract class C5972a extends C4200i implements C9770e, C9766a {

    /* renamed from: y */
    public static final String f12657y = "a";
    /* access modifiers changed from: protected */

    /* renamed from: x */
    public C6106b f12658x;

    /* renamed from: com.yeelight.yeelib.c.a$a */
    class C5973a implements C9770e {

        /* renamed from: a */
        final /* synthetic */ C9856y f12659a;

        /* renamed from: com.yeelight.yeelib.c.a$a$a */
        class C5974a implements Runnable {
            C5974a() {
            }

            public void run() {
                try {
                    Thread.sleep(500);
                } catch (Exception unused) {
                }
                C5973a aVar = C5973a.this;
                C5972a.this.mo23355x1(aVar.f12659a);
            }
        }

        C5973a(C9856y yVar) {
            this.f12659a = yVar;
        }

        public void onStatusChange(int i, C6024e eVar) {
            if (i != -1) {
                if (i == 1) {
                    new Thread(new C5974a()).start();
                }
                C5972a.this.mo23400W0(this);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.a$b */
    class C5975b implements C9770e {

        /* renamed from: a */
        final /* synthetic */ C9856y f12662a;

        C5975b(C9856y yVar) {
            this.f12662a = yVar;
        }

        public void onStatusChange(int i, C6024e eVar) {
            if (i != -1) {
                if (i == 4) {
                    C5972a.this.mo23355x1(this.f12662a);
                } else if (i == 8) {
                    return;
                }
                C5972a.this.mo23400W0(this);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.a$c */
    class C5976c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6038h f12664a;

        C5976c(C6038h hVar) {
            this.f12664a = hVar;
        }

        public void run() {
            this.f12664a.mo27773c(C5972a.this);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.a$d */
    class C5977d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6038h f12666a;

        C5977d(C6038h hVar) {
            this.f12666a = hVar;
        }

        public void run() {
            this.f12666a.mo27773c(C5972a.this);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.a$e */
    static /* synthetic */ class C5978e {

        /* renamed from: a */
        static final /* synthetic */ int[] f12668a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12669b;

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
                com.yeelight.yeelib.b.b$a[] r0 = com.yeelight.yeelib.p178b.C5969b.C5970a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12669b = r0
                r1 = 1
                com.yeelight.yeelib.b.b$a r2 = com.yeelight.yeelib.p178b.C5969b.C5970a.AUTH_IP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f12669b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.b.b$a r3 = com.yeelight.yeelib.p178b.C5969b.C5970a.AUTH_SUC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f12669b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.b.b$a r4 = com.yeelight.yeelib.p178b.C5969b.C5970a.AUTH_FAIL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.yeelight.yeelib.d.a[] r3 = com.yeelight.yeelib.p185d.C7563a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f12668a = r3
                com.yeelight.yeelib.d.a r4 = com.yeelight.yeelib.p185d.C7563a.ON     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f12668a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.yeelight.yeelib.d.a r3 = com.yeelight.yeelib.p185d.C7563a.OFF     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f12668a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.C5972a.C5978e.<clinit>():void");
        }
    }

    public C5972a(String str, String str2, C6024e eVar) {
        super(str, str2, eVar);
        C7565b bVar = C7565b.DEVICE_EVENT_OPEN;
        C7565b bVar2 = C7565b.DEVICE_EVENT_CLOSE;
        C7565b bVar3 = C7565b.DEVICE_EVENT_BRIGHT_CHANGE;
        C7563a aVar = C7563a.ON;
        C7563a aVar2 = C7563a.OFF;
        C7563a aVar3 = C7563a.BRIGHT;
        mo23376I0("bluetooth");
        mo27474C1();
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        return mo23419q0() ? this.f7257t.mo23300A1() : mo23408d0().mo27681c0() ? mo23326b1() : mo23334l1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public abstract void mo27474C1();

    /* renamed from: D1 */
    public abstract void mo27475D1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    /* renamed from: E1 */
    public abstract void mo27476E1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    /* renamed from: F1 */
    public abstract void mo27477F1();

    /* renamed from: G1 */
    public abstract void mo27478G1();

    /* renamed from: H1 */
    public abstract void mo27479H1(C7636l0 l0Var);

    /* renamed from: I1 */
    public abstract void mo27480I1(BluetoothGattDescriptor bluetoothGattDescriptor, int i);

    /* renamed from: J */
    public String mo23377J() {
        return "bluetooth";
    }

    /* renamed from: J1 */
    public abstract void mo27481J1(C7636l0 l0Var);

    /* renamed from: K1 */
    public void mo27482K1(int i) {
        mo23408d0().mo27650L0(i);
    }

    /* renamed from: L1 */
    public abstract void mo27483L1(boolean z, boolean z2);

    /* renamed from: M1 */
    public abstract boolean mo27484M1();

    /* renamed from: N1 */
    public boolean mo27485N1() {
        this.f12658x.mo27992x();
        return true;
    }

    /* renamed from: O1 */
    public void mo27486O1(C9766a aVar) {
        this.f7261w.mo27471c(aVar);
    }

    /* renamed from: P1 */
    public boolean mo27487P1() {
        return this.f7261w.mo27469d();
    }

    /* renamed from: Q1 */
    public void mo27488Q1(C9856y yVar) {
        C6024e.C6028d dVar;
        int p = yVar.mo31884p();
        if (p != 1) {
            if (p == 2) {
                dVar = C6024e.C6028d.DEVICE_MODE_COLOR;
            } else if (p != 3 && p == 4) {
                dVar = C6024e.C6028d.DEVICE_MODE_FLOW;
            }
            mo23352w1(dVar);
        }
        dVar = C6024e.C6028d.DEVICE_MODE_SUNSHINE;
        mo23352w1(dVar);
    }

    /* renamed from: R1 */
    public void mo27489R1(C9766a aVar) {
        "Device from unregisterAuthListener is " + getClass().getSimpleName();
        this.f7261w.mo27473f(aVar);
    }

    /* renamed from: S1 */
    public abstract boolean mo27490S1();

    /* renamed from: U0 */
    public boolean mo23317U0() {
        if (mo23331k0()) {
            this.f12658x.mo27960V();
            if (mo23384N().mo29039b() < 2238) {
                mo23342r();
            }
        }
        DeviceDataProvider.m22405i(this);
        return true;
    }

    /* renamed from: Y0 */
    public boolean mo23323Y0() {
        mo23371F0(8);
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        if (mo23419q0()) {
            return this.f7257t.mo23326b1();
        }
        if (mo23384N().mo29039b() < 2237) {
            mo23408d0().mo27648K0(false);
        }
        return this.f12658x.mo27966b();
    }

    /* renamed from: i1 */
    public String mo23330i1() {
        return this.f7238a;
    }

    /* renamed from: k0 */
    public boolean mo23331k0() {
        int i = this.f7253p;
        return i == 8 || i == 11 || i >= 13;
    }

    /* renamed from: k1 */
    public boolean mo23332k1() {
        C6324c cVar = this.f7257t;
        return cVar != null ? cVar.mo23332k1() : mo23408d0().mo27681c0();
    }

    /* renamed from: l0 */
    public boolean mo23333l0() {
        int i = this.f7253p;
        return i >= 1 && i <= 10;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        if (mo23419q0()) {
            return this.f7257t.mo23334l1();
        }
        if (mo23384N() != null && mo23384N().mo29039b() < 2237) {
            mo23408d0().mo27648K0(true);
        }
        return this.f12658x.mo27975k();
    }

    /* renamed from: m0 */
    public boolean mo23335m0() {
        return this.f7253p == 0;
    }

    /* renamed from: o1 */
    public boolean mo23338o1(C6024e.C6028d dVar) {
        return mo23419q0() ? this.f7257t.mo23338o1(dVar) : this.f12658x.mo27942D(dVar, this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 1024) {
            DeviceDataProvider.m22393a0(this);
        }
        if ((this.f7244g & i) != 0) {
            C9820v.m23869b(mo23372G(), i & this.f7244g);
        }
    }

    /* renamed from: p0 */
    public boolean mo23339p0() {
        int i = this.f7253p;
        return i == 8 || i == 9 || i == 1;
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        if (mo23419q0()) {
            return this.f7257t.mo23340p1(j);
        }
        mo23408d0().mo27697k0(j);
        return this.f12658x.mo27948J((int) j);
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        if (mo23419q0()) {
            return this.f7257t.mo23341q1(i);
        }
        mo23408d0().mo27699l0(i);
        return this.f12658x.mo27949K(i);
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        if (mo23419q0()) {
            return this.f7257t.mo23343r1(i, iArr, i2);
        }
        ArrayList arrayList = new ArrayList();
        for (int aVar : iArr) {
            arrayList.add(new C7556g.C7557a(aVar, i));
        }
        mo23408d0().mo27701m0(arrayList);
        return this.f12658x.mo27950L(i, iArr);
    }

    /* renamed from: s */
    public boolean mo23344s(C7563a aVar) {
        int i = C5978e.f12668a[aVar.ordinal()];
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
        "BluetoothDeviceBase, notifyConnStateChanged, device: " + mo23372G() + ", state: " + i + " -> " + i2;
        if (i2 == 0) {
            mo23370E0(-1);
            DeviceDataProvider.m22389X();
            if (mo23379K() != null) {
                for (C6122c0 c : mo23379K()) {
                    for (C6038h m : c.mo28007c()) {
                        m.mo27783m();
                    }
                }
            }
            if (C4308b.f7483b && (this instanceof C7186q)) {
                C9821z.m23873f().mo31705k(mo23372G());
            }
            this.f12658x.mo27967c();
        } else if (i2 == 6) {
            mo23386O0(Device.Ownership.MINE);
            C9820v.m23868a(this);
        } else if (i2 == 10) {
            mo23354x0();
        } else if (i2 == 11) {
            DeviceDataProvider.m22393a0(this);
            for (C6122c0 c2 : mo23379K()) {
                for (C6038h cVar : c2.mo28007c()) {
                    new Thread(new C5976c(cVar)).start();
                }
            }
            for (C6038h dVar : mo23382M()) {
                new Thread(new C5977d(dVar)).start();
            }
            mo27490S1();
            mo27484M1();
            if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_SUNSHINE) {
                this.f12658x.mo27977m();
            } else if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COLOR || mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COLOR_HSV) {
                this.f12658x.mo27979o();
            } else {
                if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_FLOW) {
                    this.f12658x.mo27979o();
                    this.f12658x.mo27977m();
                }
                if (C4308b.f7483b && (this instanceof C7186q)) {
                    C9821z.m23873f().mo31704i(mo23372G());
                }
                C10551r.m25780l(mo23372G(), mo23395T());
            }
            this.f12658x.mo27978n();
            C9821z.m23873f().mo31704i(mo23372G());
            C10551r.m25780l(mo23372G(), mo23395T());
        }
        super.mo23421s0(i, i2);
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        if (mo23419q0()) {
            return this.f7257t.mo23345s1(i);
        }
        mo23408d0().mo27707p0(i);
        return this.f12658x.mo27951M(i);
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        if (mo23331k0() || mo23333l0()) {
            mo23342r();
        }
        mo27489R1((C9766a) null);
    }

    /* renamed from: w */
    public void mo26106w(C5969b.C5970a aVar) {
        int i;
        int i2 = C5978e.f12669b[aVar.ordinal()];
        if (i2 == 1) {
            i = 5;
        } else if (i2 == 2) {
            mo23371F0(6);
            mo23356y0();
            return;
        } else if (i2 == 3) {
            i = 7;
        } else {
            return;
        }
        mo23371F0(i);
    }

    /* renamed from: w1 */
    public boolean mo23352w1(C6024e.C6028d dVar) {
        return mo23419q0() ? this.f7257t.mo23352w1(dVar) : this.f12658x.mo27953O(dVar);
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        this.f12658x.mo27982r();
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        if (mo23419q0()) {
            return this.f7257t.mo23355x1(yVar);
        }
        if (!mo23332k1()) {
            mo23365B0(new C5973a(yVar));
            this.f12658x.mo27975k();
            return false;
        } else if (!mo23408d0().mo27654N0(yVar)) {
            return this.f12658x.mo27956R(yVar);
        } else {
            mo23365B0(new C5975b(yVar));
            mo27488Q1(yVar);
            return false;
        }
    }

    /* renamed from: y0 */
    public void mo23356y0() {
        this.f12658x.mo27983s();
    }
}
