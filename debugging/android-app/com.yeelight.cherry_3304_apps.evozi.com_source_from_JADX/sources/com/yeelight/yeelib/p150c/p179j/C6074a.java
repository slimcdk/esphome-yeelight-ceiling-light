package com.yeelight.yeelib.p150c.p179j;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.yeelight.yeelib.device.models.C7636l0;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p179j.C6085b;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.utils.C10539d;
import com.yeelight.yeelib.utils.C4308b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;

/* renamed from: com.yeelight.yeelib.c.j.a */
public class C6074a extends C6085b {
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final String f12905x = "a";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public BluetoothGattService f12906o = null;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public BluetoothGattCharacteristic f12907p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public BluetoothGattCharacteristic f12908q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public BluetoothGattService f12909r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public BluetoothGattCharacteristic f12910s = null;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public BluetoothGattCharacteristic f12911t = null;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public BluetoothGattCharacteristic f12912u = null;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public BluetoothGattCharacteristic f12913v = null;

    /* renamed from: w */
    private BluetoothGattCallback f12914w = new C6075a();

    /* renamed from: com.yeelight.yeelib.c.j.a$a */
    class C6075a extends BluetoothGattCallback {

        /* renamed from: com.yeelight.yeelib.c.j.a$a$a */
        class C6076a implements Runnable {
            C6076a() {
            }

            public void run() {
                C6074a.this.f12945h.mo27477F1();
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.a$a$b */
        class C6077b implements Runnable {
            C6077b() {
            }

            public void run() {
                C6074a.this.f12945h.mo27478G1();
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.a$a$c */
        class C6078c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f12918a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGatt f12919b;

            C6078c(int i, BluetoothGatt bluetoothGatt) {
                this.f12918a = i;
                this.f12919b = bluetoothGatt;
            }

            public void run() {
                boolean z;
                boolean z2 = false;
                if (this.f12918a == 0) {
                    List<BluetoothGattService> services = this.f12919b.getServices();
                    if (services.size() != 0) {
                        for (BluetoothGattService next : this.f12919b.getServices()) {
                            String unused = C6074a.f12905x;
                            "|-found service : " + next.getUuid().toString();
                            for (BluetoothGattCharacteristic uuid : next.getCharacteristics()) {
                                String unused2 = C6074a.f12905x;
                                "|----found characteristic : " + uuid.getUuid().toString();
                            }
                        }
                        z = false;
                        for (BluetoothGattService next2 : services) {
                            String unused3 = C6074a.f12905x;
                            "Found service: " + next2.getUuid().toString();
                            if (next2.getUuid().toString().equalsIgnoreCase("f000ffc0-0451-4000-b000-000000000000") && next2.getCharacteristics().size() != 0) {
                                BluetoothGattService unused4 = C6074a.this.f12906o = next2;
                                z2 = true;
                            } else if (next2.getUuid().toString().equalsIgnoreCase("8E2F0CBD-1A66-4B53-ACE6-B494E25F87BD") && next2.getCharacteristics().size() != 0) {
                                BluetoothGattService unused5 = C6074a.this.f12909r = next2;
                                z = true;
                            }
                        }
                        String unused6 = C6074a.f12905x;
                        "mOadService is :" + C6074a.this.f12906o;
                        String unused7 = C6074a.f12905x;
                        "mYeelightService is :" + C6074a.this.f12909r;
                        if (C6074a.this.f12906o != null) {
                            C6074a aVar = C6074a.this;
                            BluetoothGattCharacteristic unused8 = aVar.f12907p = aVar.f12906o.getCharacteristic(UUID.fromString("f000ffc1-0451-4000-b000-000000000000"));
                            C6074a aVar2 = C6074a.this;
                            BluetoothGattCharacteristic unused9 = aVar2.f12908q = aVar2.f12906o.getCharacteristic(UUID.fromString("f000ffc2-0451-4000-b000-000000000000"));
                        }
                        if (C6074a.this.f12909r != null) {
                            C6074a aVar3 = C6074a.this;
                            BluetoothGattCharacteristic unused10 = aVar3.f12910s = aVar3.f12909r.getCharacteristic(UUID.fromString("aa7d3f34-2d4f-41e0-807f-52fbf8cf7443"));
                            C6074a aVar4 = C6074a.this;
                            BluetoothGattCharacteristic unused11 = aVar4.f12911t = aVar4.f12909r.getCharacteristic(UUID.fromString("8f65073d-9f57-4aaa-afea-397d19d5bbeb"));
                            C6074a aVar5 = C6074a.this;
                            BluetoothGattCharacteristic unused12 = aVar5.f12912u = aVar5.f12909r.getCharacteristic(UUID.fromString("f000fff1-0451-4000-b000-000000000000"));
                            C6074a aVar6 = C6074a.this;
                            BluetoothGattCharacteristic unused13 = aVar6.f12913v = aVar6.f12909r.getCharacteristic(UUID.fromString("f000fff2-0451-4000-b000-000000000000"));
                        }
                    } else {
                        return;
                    }
                } else {
                    z = false;
                }
                C6074a.this.f12945h.mo27483L1(z2, z);
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.a$a$d */
        class C6079d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ byte[] f12921a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGatt f12922b;

            /* renamed from: c */
            final /* synthetic */ BluetoothGattCharacteristic f12923c;

            C6079d(byte[] bArr, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f12921a = bArr;
                this.f12922b = bluetoothGatt;
                this.f12923c = bluetoothGattCharacteristic;
            }

            public void run() {
                String g = C10539d.m25676g(this.f12921a);
                "get msg:" + g + " from device : " + C6074a.this.f12945h.mo23372G() + "_" + C6074a.this.f12945h.mo23397U();
                C7636l0 l0Var = new C7636l0();
                this.f12922b.getDevice().getAddress();
                String lowerCase = this.f12923c.getUuid().toString().toLowerCase();
                if (!lowerCase.equals("f000ffc1-0451-4000-b000-000000000000")) {
                    if (lowerCase.equals("8f65073d-9f57-4aaa-afea-397d19d5bbeb") || lowerCase.equals("f000fff2-0451-4000-b000-000000000000")) {
                        l0Var.f15575a = g.substring(0, 4);
                    }
                    if (lowerCase.equals("f000fff2-0451-4000-b000-000000000000")) {
                        l0Var.f15576b = new String[]{g.substring(4, g.length())};
                        C6074a.this.f12945h.mo27481J1(l0Var);
                        return;
                    }
                    l0Var.f15576b = new String[]{g.substring(4, g.length())};
                    C6074a.this.f12945h.mo27479H1(l0Var);
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.a$a$e */
        class C6080e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattCharacteristic f12925a;

            /* renamed from: b */
            final /* synthetic */ int f12926b;

            C6080e(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                this.f12925a = bluetoothGattCharacteristic;
                this.f12926b = i;
            }

            public void run() {
                C6074a.this.f12945h.mo27475D1(this.f12925a, this.f12926b);
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.a$a$f */
        class C6081f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f12928a;

            C6081f(int i) {
                this.f12928a = i;
            }

            public void run() {
                C6074a.this.f12945h.mo27482K1(this.f12928a);
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.a$a$g */
        class C6082g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattCharacteristic f12930a;

            /* renamed from: b */
            final /* synthetic */ int f12931b;

            C6082g(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                this.f12930a = bluetoothGattCharacteristic;
                this.f12931b = i;
            }

            public void run() {
                C6074a.this.f12945h.mo27476E1(this.f12930a, this.f12931b);
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.a$a$h */
        class C6083h implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattDescriptor f12933a;

            /* renamed from: b */
            final /* synthetic */ int f12934b;

            C6083h(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
                this.f12933a = bluetoothGattDescriptor;
                this.f12934b = i;
            }

            public void run() {
                C6074a.this.f12945h.mo27480I1(this.f12933a, this.f12934b);
            }
        }

        C6075a() {
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            C6074a.this.f12950m.mo27918b(new C6079d(bluetoothGattCharacteristic.getValue(), bluetoothGatt, bluetoothGattCharacteristic));
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (C6074a.this.f12943f) {
                C6074a.this.m18119P(i);
            }
            if (C6074a.this.f12940c.size() > 0) {
                C6074a.this.f12944g.lock();
                int i2 = 0;
                while (true) {
                    if (i2 >= C6074a.this.f12940c.size()) {
                        break;
                    }
                    C6085b.C6087b bVar = C6074a.this.f12940c.get(i2);
                    if (bVar.f12953b == bluetoothGattCharacteristic) {
                        bVar.f12955d = C6085b.C6089d.done;
                        C6074a.this.f12940c.remove(i2);
                        break;
                    }
                    i2++;
                }
                C6074a.this.f12944g.unlock();
            }
            C6074a.this.f12950m.mo27918b(new C6080e(bluetoothGattCharacteristic, i));
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (C6074a.this.f12943f) {
                C6074a.this.m18119P(i);
            }
            if (C6074a.this.f12940c.size() > 0) {
                C6074a.this.f12944g.lock();
                int i2 = 0;
                while (true) {
                    if (i2 >= C6074a.this.f12940c.size()) {
                        break;
                    }
                    C6085b.C6087b bVar = C6074a.this.f12940c.get(i2);
                    if (bVar.f12953b == bluetoothGattCharacteristic) {
                        bVar.f12955d = C6085b.C6089d.done;
                        C6074a.this.f12940c.remove(i2);
                        break;
                    }
                    i2++;
                }
                C6074a.this.f12944g.unlock();
            }
            C6074a.this.f12950m.mo27918b(new C6082g(bluetoothGattCharacteristic, i));
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            C6085b.C6091f fVar;
            Runnable bVar;
            String B;
            String str;
            "CherryConnection, onConnectionStateChange, status: " + i + ", new state: " + i2;
            if (i2 != 0) {
                BluetoothGatt bluetoothGatt2 = C6074a.this.f12948k;
                if (bluetoothGatt2 == null) {
                    B = C6074a.f12905x;
                    str = "BluetoothGatt not created!!!!!! new state: " + i2;
                } else if (bluetoothGatt2 != bluetoothGatt) {
                    B = C6074a.f12905x;
                    str = "Invalid gatt!";
                }
                C4308b.m12139r(B, str);
            }
            if (i2 == 0) {
                C6074a.this.f12938a = false;
                fVar = C6074a.this.f12950m;
                bVar = new C6077b();
            } else if (i2 != 2) {
                try {
                    "New state not processed: " + i2;
                    return;
                } catch (NullPointerException e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                C6074a.this.f12938a = true;
                C6074a.this.mo27869N();
                fVar = C6074a.this.f12950m;
                bVar = new C6076a();
            }
            fVar.mo27918b(bVar);
        }

        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (C6074a.this.f12943f) {
                C6074a.this.m18119P(i);
            }
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (C6074a.this.f12943f) {
                C6074a.this.m18119P(i);
            }
            new Thread(new C6083h(bluetoothGattDescriptor, i)).start();
        }

        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            "onReadRemoteRssi, rssi: " + i;
            C6074a.this.f12950m.mo27918b(new C6081f(i));
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            if (C6074a.this.f12945h.mo23299A() < 4) {
                C6074a.this.f12950m.mo27918b(new C6078c(i, bluetoothGatt));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.j.a$b */
    class C6084b extends Thread {
        C6084b() {
        }

        public void run() {
            while (true) {
                C6074a aVar = C6074a.this;
                if (aVar.f12938a) {
                    aVar.mo27906i();
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C6074a(C5972a aVar) {
        this.f12945h = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m18119P(int i) {
        this.f12942e = i;
        this.f12943f = false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo27868A(java.lang.String r8, byte[] r9, java.lang.String r10) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = 0
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -2020883305: goto L_0x0040;
                case -1086447738: goto L_0x0036;
                case -433276299: goto L_0x002c;
                case 482083839: goto L_0x0022;
                case 1389847799: goto L_0x0018;
                case 1629829608: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "CHAR_CHERRY_CTRL"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 2
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "CHAR_OAD_BLOCK"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "CHAR_OAD_NOTIFY"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 0
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "CHAR_OTA_NOTIFY"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 5
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "CHAR_CHERRY_NOTIFY"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 3
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "CHAR_OTA_CTRL"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 4
            goto L_0x004b
        L_0x004a:
            r0 = -1
        L_0x004b:
            if (r0 == 0) goto L_0x007d
            if (r0 == r6) goto L_0x007a
            if (r0 == r5) goto L_0x0077
            if (r0 == r4) goto L_0x0074
            if (r0 == r3) goto L_0x0071
            if (r0 == r2) goto L_0x006e
            java.lang.String r9 = f12905x
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Invalid param: "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.yeelight.yeelib.utils.C4308b.m12139r(r9, r8)
            return r1
        L_0x006e:
            android.bluetooth.BluetoothGattCharacteristic r8 = r7.f12913v
            goto L_0x007f
        L_0x0071:
            android.bluetooth.BluetoothGattCharacteristic r8 = r7.f12912u
            goto L_0x007f
        L_0x0074:
            android.bluetooth.BluetoothGattCharacteristic r8 = r7.f12911t
            goto L_0x007f
        L_0x0077:
            android.bluetooth.BluetoothGattCharacteristic r8 = r7.f12910s
            goto L_0x007f
        L_0x007a:
            android.bluetooth.BluetoothGattCharacteristic r8 = r7.f12908q
            goto L_0x007f
        L_0x007d:
            android.bluetooth.BluetoothGattCharacteristic r8 = r7.f12907p
        L_0x007f:
            boolean r8 = r7.mo27872R(r8, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p179j.C6074a.mo27868A(java.lang.String, byte[], java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo27869N() {
        new C6084b().start();
    }

    /* renamed from: O */
    public boolean mo27870O(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, String str) {
        char c;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        C6085b.C6087b bVar = new C6085b.C6087b(this);
        bVar.f12955d = C6085b.C6089d.not_queued;
        bVar.f12953b = bluetoothGattCharacteristic;
        bVar.f12954c = C6085b.C6088c.nsBlocking;
        bVar.f12958g = z;
        mo27902a(bVar);
        boolean z2 = false;
        loop0:
        while (true) {
            c = 65533;
            while (!z2) {
                C6085b.C6089d l = mo27908l(bVar);
                if (l == C6085b.C6089d.done) {
                    z2 = true;
                    c = 0;
                } else if (l == C6085b.C6089d.timeout) {
                    z2 = true;
                }
            }
            break loop0;
        }
        return c == 0;
    }

    /* renamed from: Q */
    public boolean mo27871Q(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, String str) {
        C6085b.C6087b bVar = new C6085b.C6087b(this);
        bVar.f12955d = C6085b.C6089d.not_queued;
        bVar.f12953b = bluetoothGattCharacteristic;
        bVar.f12954c = C6085b.C6088c.wrBlocking;
        bVar.f12959h = str;
        bVar.f12960i = bArr;
        mo27902a(bVar);
        int i = -3;
        boolean z = false;
        while (!z) {
            C6085b.C6089d l = mo27908l(bVar);
            if (l == C6085b.C6089d.done) {
                i = 0;
            } else if (l == C6085b.C6089d.timeout) {
                i = -1;
            }
            z = true;
        }
        if (i == 0) {
            return true;
        }
        "writeCharacteristic, return false, ret code: " + i;
        return false;
    }

    /* renamed from: R */
    public boolean mo27872R(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, String str) {
        C6085b.C6087b bVar = new C6085b.C6087b(this);
        bVar.f12955d = C6085b.C6089d.not_queued;
        bVar.f12953b = bluetoothGattCharacteristic;
        bVar.f12954c = C6085b.C6088c.wr;
        bVar.f12959h = str;
        bVar.f12960i = bArr;
        "##########writeCharacteristicNonBlock, tag: " + str;
        mo27902a(bVar);
        return true;
    }

    /* renamed from: c */
    public void mo27873c() {
        BluetoothGatt bluetoothGatt = this.f12948k;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
            this.f12948k = null;
        }
    }

    /* renamed from: d */
    public void mo27874d() {
        mo27875e(this.f12945h.mo23372G());
    }

    /* renamed from: e */
    public boolean mo27875e(String str) {
        BluetoothAdapter bluetoothAdapter = this.f12947j;
        if (!(bluetoothAdapter == null || str == null)) {
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            int connectionState = this.f12946i.getConnectionState(remoteDevice, 7);
            mo27873c();
            if (connectionState == 0) {
                String str2 = this.f12949l;
                if (str2 != null && str.equals(str2) && this.f12948k != null) {
                    return this.f12948k.connect();
                }
                if (remoteDevice == null) {
                    return false;
                }
                this.f12948k = remoteDevice.connectGatt(C4297y.f7456e, false, this.f12914w);
                this.f12949l = str;
                return true;
            }
            "###########Attempt to connect in state: " + connectionState;
            this.f12948k = remoteDevice.connectGatt(C4297y.f7456e, false, this.f12914w);
            this.f12949l = str;
        }
        return false;
    }

    /* renamed from: h */
    public void mo27876h() {
        if (this.f12948k != null) {
            this.f12948k.discoverServices();
        }
    }

    /* renamed from: j */
    public String mo27877j() {
        return this.f12947j.getAddress();
    }

    /* renamed from: n */
    public int mo27878n(String str, C6085b.C6090e eVar) {
        return 0;
    }

    /* renamed from: p */
    public void mo27879p() {
        if (this.f12948k != null) {
            try {
                Method method = this.f12948k.getClass().getMethod("refresh", new Class[0]);
                if (method != null) {
                    method.invoke(this.f12948k, new Object[0]);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo27880v(java.lang.String r6, boolean r7, java.lang.String r8) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = -1086447738(0xffffffffbf3e1f86, float:-0.7426685)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x002b
            r1 = -433276299(0xffffffffe62cba75, float:-2.0392164E23)
            if (r0 == r1) goto L_0x0021
            r1 = 482083839(0x1cbc03ff, float:1.2441829E-21)
            if (r0 == r1) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.String r0 = "CHAR_OAD_NOTIFY"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0035
            r6 = 0
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "CHAR_OTA_NOTIFY"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0035
            r6 = 2
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "CHAR_CHERRY_NOTIFY"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0035
            r6 = 1
            goto L_0x0036
        L_0x0035:
            r6 = -1
        L_0x0036:
            if (r6 == 0) goto L_0x0047
            if (r6 == r4) goto L_0x0044
            if (r6 == r3) goto L_0x003d
            return r2
        L_0x003d:
            android.bluetooth.BluetoothGattCharacteristic r6 = r5.f12913v
        L_0x003f:
            boolean r6 = r5.mo27870O(r6, r7, r8)
            return r6
        L_0x0044:
            android.bluetooth.BluetoothGattCharacteristic r6 = r5.f12911t
            goto L_0x003f
        L_0x0047:
            android.bluetooth.BluetoothGattCharacteristic r6 = r5.f12907p
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p179j.C6074a.mo27880v(java.lang.String, boolean, java.lang.String):boolean");
    }

    /* renamed from: w */
    public void mo27881w(int i) {
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    public boolean mo27882x(String str, byte[] bArr) {
        return mo27883y(str, bArr, (String) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo27883y(java.lang.String r8, byte[] r9, java.lang.String r10) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = 0
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -2020883305: goto L_0x0040;
                case -1086447738: goto L_0x0036;
                case -433276299: goto L_0x002c;
                case 482083839: goto L_0x0022;
                case 1389847799: goto L_0x0018;
                case 1629829608: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "CHAR_CHERRY_CTRL"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 2
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "CHAR_OAD_BLOCK"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "CHAR_OAD_NOTIFY"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 0
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "CHAR_OTA_NOTIFY"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 5
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "CHAR_CHERRY_NOTIFY"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 3
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "CHAR_OTA_CTRL"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 4
            goto L_0x004b
        L_0x004a:
            r0 = -1
        L_0x004b:
            if (r0 == 0) goto L_0x007d
            if (r0 == r6) goto L_0x007a
            if (r0 == r5) goto L_0x0077
            if (r0 == r4) goto L_0x0074
            if (r0 == r3) goto L_0x0071
            if (r0 == r2) goto L_0x006e
            java.lang.String r9 = f12905x
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Invalid param: "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.yeelight.yeelib.utils.C4308b.m12139r(r9, r8)
            return r1
        L_0x006e:
            android.bluetooth.BluetoothGattCharacteristic r8 = r7.f12913v
            goto L_0x007f
        L_0x0071:
            android.bluetooth.BluetoothGattCharacteristic r8 = r7.f12912u
            goto L_0x007f
        L_0x0074:
            android.bluetooth.BluetoothGattCharacteristic r8 = r7.f12911t
            goto L_0x007f
        L_0x0077:
            android.bluetooth.BluetoothGattCharacteristic r8 = r7.f12910s
            goto L_0x007f
        L_0x007a:
            android.bluetooth.BluetoothGattCharacteristic r8 = r7.f12908q
            goto L_0x007f
        L_0x007d:
            android.bluetooth.BluetoothGattCharacteristic r8 = r7.f12907p
        L_0x007f:
            boolean r8 = r7.mo27871Q(r8, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p179j.C6074a.mo27883y(java.lang.String, byte[], java.lang.String):boolean");
    }

    /* renamed from: z */
    public boolean mo27884z(String str, byte[] bArr, String str2, C6085b.C6090e eVar) {
        return false;
    }
}
