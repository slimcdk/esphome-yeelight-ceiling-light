package com.yeelight.yeelib.p150c.p179j;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import com.telink.crypto.AES;
import com.yeelight.yeelib.device.models.C7636l0;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C6047m;
import com.yeelight.yeelib.p150c.p179j.C6085b;
import com.yeelight.yeelib.p150c.p183m.C6459e0;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.utils.C10539d;
import com.yeelight.yeelib.utils.C10556t;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;
import java.util.UUID;

/* renamed from: com.yeelight.yeelib.c.j.c */
public class C6092c extends C6085b {
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final String f12977w = "c";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public BluetoothGattCharacteristic f12978o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public BluetoothGattCharacteristic f12979p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public BluetoothGattCharacteristic f12980q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public BluetoothGattCharacteristic f12981r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public BluetoothGattCharacteristic f12982s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public BluetoothGattCharacteristic f12983t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C6459e0 f12984u;

    /* renamed from: v */
    private BluetoothGattCallback f12985v = new C6093a();

    /* renamed from: com.yeelight.yeelib.c.j.c$a */
    class C6093a extends BluetoothGattCallback {

        /* renamed from: com.yeelight.yeelib.c.j.c$a$a */
        class C6094a implements Runnable {
            C6094a() {
            }

            public void run() {
                C6092c.this.f12945h.mo27477F1();
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.c$a$b */
        class C6095b implements Runnable {
            C6095b() {
            }

            public void run() {
                C6092c.this.f12945h.mo27478G1();
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.c$a$c */
        class C6096c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f12989a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGatt f12990b;

            C6096c(int i, BluetoothGatt bluetoothGatt) {
                this.f12989a = i;
                this.f12990b = bluetoothGatt;
            }

            public void run() {
                boolean z;
                boolean z2 = false;
                if (this.f12989a == 0) {
                    List<BluetoothGattService> services = this.f12990b.getServices();
                    if (services.size() != 0) {
                        for (BluetoothGattService next : this.f12990b.getServices()) {
                            String unused = C6092c.f12977w;
                            "|-found service : " + next.getUuid().toString();
                            for (BluetoothGattCharacteristic uuid : next.getCharacteristics()) {
                                String unused2 = C6092c.f12977w;
                                "|----found characteristic : " + uuid.getUuid().toString();
                            }
                        }
                        z = false;
                        for (BluetoothGattService next2 : services) {
                            String unused3 = C6092c.f12977w;
                            "Found service: " + next2.getUuid().toString();
                            if (next2.getUuid().toString().equalsIgnoreCase("00010203-0405-0607-0809-0a0b0c0d1910") && next2.getCharacteristics().size() != 0) {
                                BluetoothGattCharacteristic unused4 = C6092c.this.f12980q = next2.getCharacteristic(UUID.fromString("00010203-0405-0607-0809-0a0b0c0d1912"));
                                BluetoothGattCharacteristic unused5 = C6092c.this.f12981r = next2.getCharacteristic(UUID.fromString("00010203-0405-0607-0809-0a0b0c0d1911"));
                                BluetoothGattCharacteristic unused6 = C6092c.this.f12982s = next2.getCharacteristic(UUID.fromString("00010203-0405-0607-0809-0a0b0c0d1914"));
                                BluetoothGattCharacteristic unused7 = C6092c.this.f12983t = next2.getCharacteristic(UUID.fromString("00010203-0405-0607-0809-0a0b0c0d1913"));
                                z2 = true;
                            } else if (next2.getUuid().toString().equalsIgnoreCase("0000fe87-0000-1000-8000-00805f9b34fb") && next2.getCharacteristics().size() != 0) {
                                BluetoothGattCharacteristic unused8 = C6092c.this.f12978o = next2.getCharacteristic(UUID.fromString("aa7d3f34-2d4f-41e0-807f-52fbf8cf7443"));
                                BluetoothGattCharacteristic unused9 = C6092c.this.f12979p = next2.getCharacteristic(UUID.fromString("8f65073d-9f57-4aaa-afea-397d19d5bbeb"));
                                z = true;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    z = false;
                }
                C6092c.this.f12945h.mo27483L1(z2, z);
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.c$a$d */
        class C6097d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ byte[] f12992a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGatt f12993b;

            /* renamed from: c */
            final /* synthetic */ BluetoothGattCharacteristic f12994c;

            C6097d(byte[] bArr, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f12992a = bArr;
                this.f12993b = bluetoothGatt;
                this.f12994c = bluetoothGattCharacteristic;
            }

            public void run() {
                String g = C10539d.m25676g(this.f12992a);
                "get msg:" + g + " from device : " + C6092c.this.f12945h.mo23372G() + "_" + C6092c.this.f12945h.mo23397U();
                C7636l0 l0Var = new C7636l0();
                this.f12993b.getDevice().getAddress();
                String lowerCase = this.f12994c.getUuid().toString().toLowerCase();
                if (!lowerCase.equals("f000ffc1-0451-4000-b000-000000000000")) {
                    if (lowerCase.equals("8f65073d-9f57-4aaa-afea-397d19d5bbeb") || lowerCase.equals("00010203-0405-0607-0809-0a0b0c0d1913")) {
                        l0Var.f15575a = g.substring(0, 4);
                    }
                    if (lowerCase.equals("00010203-0405-0607-0809-0a0b0c0d1913")) {
                        l0Var.f15576b = new String[]{g.substring(4, g.length())};
                        C6092c.this.f12945h.mo27481J1(l0Var);
                    } else if (lowerCase.equals("8f65073d-9f57-4aaa-afea-397d19d5bbeb")) {
                        l0Var.f15576b = new String[]{g.substring(4, g.length())};
                        C6092c.this.f12945h.mo27479H1(l0Var);
                    } else if (lowerCase.equals("00010203-0405-0607-0809-0a0b0c0d1911")) {
                        ((C6047m) C6092c.this.f12945h).mo27812c2(this.f12994c.getValue());
                    }
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.c$a$e */
        class C6098e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattCharacteristic f12996a;

            /* renamed from: b */
            final /* synthetic */ int f12997b;

            C6098e(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                this.f12996a = bluetoothGattCharacteristic;
                this.f12997b = i;
            }

            public void run() {
                C6092c.this.f12945h.mo27475D1(this.f12996a, this.f12997b);
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.c$a$f */
        class C6099f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattCharacteristic f12999a;

            /* renamed from: b */
            final /* synthetic */ int f13000b;

            C6099f(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                this.f12999a = bluetoothGattCharacteristic;
                this.f13000b = i;
            }

            public void run() {
                C6092c.this.f12945h.mo27476E1(this.f12999a, this.f13000b);
            }
        }

        /* renamed from: com.yeelight.yeelib.c.j.c$a$g */
        class C6100g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattDescriptor f13002a;

            /* renamed from: b */
            final /* synthetic */ int f13003b;

            C6100g(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
                this.f13002a = bluetoothGattDescriptor;
                this.f13003b = i;
            }

            public void run() {
                C6092c.this.f12945h.mo27480I1(this.f13002a, this.f13003b);
            }
        }

        C6093a() {
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (bluetoothGattCharacteristic.getUuid().toString().equalsIgnoreCase("00010203-0405-0607-0809-0a0b0c0d1911")) {
                byte[] f = C10556t.m25803f(C6092c.this.f12984u.mo28181l3());
                System.arraycopy(value, 0, f, 3, 5);
                byte[] a = AES.m10665a(C6092c.this.f12984u.mo28182m3(), f, value);
                String g = C10539d.m25676g(a);
                "Telink notify:" + g;
                if (a[7] == -37) {
                    "Get status notify device :" + ((a[4] << 8) + a[3]);
                } else {
                    "get msg:" + g + " from device : " + C6092c.this.f12945h.mo23372G() + ", and new addresss = " + C6092c.this.m18176M(a);
                }
                ((C6047m) C6092c.this.f12945h).mo27812c2(a);
                return;
            }
            C6092c.this.f12950m.mo27918b(new C6097d(value, bluetoothGatt, bluetoothGattCharacteristic));
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (C6092c.this.f12943f) {
                C6092c.this.m18177O(i);
            }
            if (C6092c.this.f12940c.size() > 0) {
                C6092c.this.f12944g.lock();
                int i2 = 0;
                while (true) {
                    if (i2 >= C6092c.this.f12940c.size()) {
                        break;
                    }
                    C6085b.C6087b bVar = C6092c.this.f12940c.get(i2);
                    if (bVar.f12953b == bluetoothGattCharacteristic) {
                        bVar.f12955d = C6085b.C6089d.done;
                        C6092c.this.f12940c.remove(i2);
                        break;
                    }
                    i2++;
                }
                C6092c.this.f12944g.unlock();
            }
            C6092c.this.f12950m.mo27918b(new C6098e(bluetoothGattCharacteristic, i));
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            "onCharacteristicWrite status = " + i;
            if (C6092c.this.f12943f) {
                C6092c.this.m18177O(i);
            }
            if (C6092c.this.f12940c.size() > 0) {
                C6092c.this.f12944g.lock();
                int i2 = 0;
                while (true) {
                    if (i2 >= C6092c.this.f12940c.size()) {
                        break;
                    }
                    C6085b.C6087b bVar = C6092c.this.f12940c.get(i2);
                    if (bVar.f12953b == bluetoothGattCharacteristic) {
                        bVar.f12955d = C6085b.C6089d.done;
                        C6092c.this.f12940c.remove(i2);
                        break;
                    }
                    i2++;
                }
                C6092c.this.f12944g.unlock();
            }
            C6092c.this.f12950m.mo27918b(new C6099f(bluetoothGattCharacteristic, i));
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            C6085b.C6091f fVar;
            Runnable bVar;
            String B;
            String str;
            "GingkoConnection, onConnectionStateChange, status: " + i + ", new state: " + i2;
            if (i2 != 0) {
                BluetoothGatt bluetoothGatt2 = C6092c.this.f12948k;
                if (bluetoothGatt2 == null) {
                    B = C6092c.f12977w;
                    str = "BluetoothGatt not created!!!!!! new state: " + i2;
                } else if (bluetoothGatt2 != bluetoothGatt) {
                    B = C6092c.f12977w;
                    str = "Invalid gatt!";
                }
                C4308b.m12139r(B, str);
            }
            if (i2 == 0) {
                C6092c.this.f12938a = false;
                fVar = C6092c.this.f12950m;
                bVar = new C6095b();
            } else if (i2 != 2) {
                try {
                    "New state not processed: " + i2;
                    return;
                } catch (NullPointerException e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                C6092c.this.f12938a = true;
                C6092c.this.mo27920L();
                fVar = C6092c.this.f12950m;
                bVar = new C6094a();
            }
            fVar.mo27918b(bVar);
        }

        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            boolean z = C6092c.this.f12943f;
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            "onDescriptorWrite status = " + i;
            boolean z = C6092c.this.f12943f;
            new Thread(new C6100g(bluetoothGattDescriptor, i)).start();
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            if (C6092c.this.f12945h.mo23299A() < 4) {
                C6092c.this.f12950m.mo27918b(new C6096c(i, bluetoothGatt));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.j.c$b */
    class C6101b extends Thread {
        C6101b() {
        }

        public void run() {
            while (true) {
                C6092c cVar = C6092c.this;
                if (cVar.f12938a) {
                    cVar.mo27906i();
                    try {
                        if (!(C6092c.this.f12941d == null || C6092c.this.f12941d.f12953b == null || (!C6092c.this.f12941d.f12953b.getUuid().toString().toLowerCase().equals("00010203-0405-0607-0809-0a0b0c0d1914") && !C6092c.this.f12941d.f12953b.getUuid().toString().toLowerCase().equals("00010203-0405-0607-0809-0a0b0c0d1912")))) {
                            String unused = C6092c.f12977w;
                            Thread.sleep(100);
                        }
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

    public C6092c(C5972a aVar) {
        this.f12945h = aVar;
        this.f12984u = (C6459e0) aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public int m18176M(byte[] bArr) {
        if (bArr.length >= 20 && (bArr[7] & 255) == 225) {
            return bArr[10] + (bArr[11] << 8);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m18177O(int i) {
        this.f12942e = i;
        this.f12943f = false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo27868A(java.lang.String r6, byte[] r7, java.lang.String r8) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -2020883305: goto L_0x002a;
                case -446670206: goto L_0x0020;
                case -433276299: goto L_0x0016;
                case 557023648: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "CHAR_GINGKO_NOTIFY"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "CHAR_OTA_NOTIFY"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "CHAR_GINGKO_CTRL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "CHAR_OTA_CTRL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0059
            if (r0 == r4) goto L_0x0056
            if (r0 == r3) goto L_0x0054
            if (r0 == r2) goto L_0x0054
            java.lang.String r7 = f12977w
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Invalid param: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.yeelight.yeelib.utils.C4308b.m12139r(r7, r6)
            return r1
        L_0x0054:
            r6 = 0
            goto L_0x005b
        L_0x0056:
            android.bluetooth.BluetoothGattCharacteristic r6 = r5.f12979p
            goto L_0x005b
        L_0x0059:
            android.bluetooth.BluetoothGattCharacteristic r6 = r5.f12978o
        L_0x005b:
            boolean r6 = r5.mo27923Q(r6, r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p179j.C6092c.mo27868A(java.lang.String, byte[], java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo27920L() {
        new C6101b().start();
    }

    /* renamed from: N */
    public boolean mo27921N(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, String str) {
        char c;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        C6085b.C6087b bVar = new C6085b.C6087b(this);
        bVar.f12955d = C6085b.C6089d.not_queued;
        bVar.f12953b = bluetoothGattCharacteristic;
        bVar.f12954c = C6085b.C6088c.nsBlocking;
        bVar.f12958g = z;
        bVar.f12959h = str;
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

    /* renamed from: P */
    public boolean mo27922P(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, String str, C6085b.C6090e eVar) {
        int i;
        C6085b.C6087b bVar = new C6085b.C6087b(this);
        bVar.f12955d = C6085b.C6089d.not_queued;
        bVar.f12953b = bluetoothGattCharacteristic;
        bVar.f12954c = C6085b.C6088c.wrBlocking;
        bVar.f12959h = str;
        bVar.f12960i = bArr;
        bVar.f12961j = eVar;
        mo27902a(bVar);
        boolean z = false;
        loop0:
        while (true) {
            i = -3;
            while (!z) {
                C6085b.C6089d l = mo27908l(bVar);
                if (l == C6085b.C6089d.done) {
                    z = true;
                    i = 0;
                } else if (l == C6085b.C6089d.timeout) {
                    i = -1;
                    z = true;
                } else if (l == C6085b.C6089d.failed) {
                    z = true;
                }
            }
            break loop0;
        }
        if (i == 0) {
            return true;
        }
        "writeCharacteristic, return false, ret code: " + i;
        return false;
    }

    /* renamed from: Q */
    public boolean mo27923Q(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, String str) {
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

    /* renamed from: e */
    public boolean mo27875e(String str) {
        BluetoothDevice remoteDevice;
        BluetoothManager bluetoothManager;
        BluetoothAdapter bluetoothAdapter = this.f12947j;
        if (!(bluetoothAdapter == null || str == null || (remoteDevice = bluetoothAdapter.getRemoteDevice(str)) == null || (bluetoothManager = this.f12946i) == null)) {
            int connectionState = bluetoothManager.getConnectionState(remoteDevice, 7);
            if (connectionState == 0) {
                String str2 = this.f12949l;
                if (str2 != null && str.equals(str2) && this.f12948k != null) {
                    return this.f12948k.connect();
                }
                if (remoteDevice == null) {
                    return false;
                }
                this.f12948k = remoteDevice.connectGatt(C4297y.f7456e, false, this.f12985v);
                this.f12949l = str;
                return true;
            }
            "###########Attempt to connect in state: " + connectionState;
            this.f12948k = remoteDevice.connectGatt(C4297y.f7456e, false, this.f12985v);
            this.f12949l = str;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo27878n(java.lang.String r4, com.yeelight.yeelib.p150c.p179j.C6085b.C6090e r5) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = -487189179(0xffffffffe2f61545, float:-2.2697158E21)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = -431358159(0xffffffffe649ff31, float:-2.3847578E23)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "CHAR_TELINK_OTA"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "CHAR_TELINK_PAIR"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            if (r4 == 0) goto L_0x0032
            if (r4 == r2) goto L_0x002b
            r4 = -3
            return r4
        L_0x002b:
            android.bluetooth.BluetoothGattCharacteristic r4 = r3.f12983t
        L_0x002d:
            int r4 = r3.mo27909m(r4, r5)
            return r4
        L_0x0032:
            android.bluetooth.BluetoothGattCharacteristic r4 = r3.f12982s
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p179j.C6092c.mo27878n(java.lang.String, com.yeelight.yeelib.c.j.b$e):int");
    }

    /* renamed from: q */
    public int mo27911q(C6085b.C6087b bVar) {
        "sendBlockingNotifySetting req: " + bVar.f12952a;
        bVar.f12955d = C6085b.C6089d.processing;
        if (bVar.f12953b == null) {
            return -1;
        }
        if (!mo27903b()) {
            return -2;
        }
        if (!this.f12948k.setCharacteristicNotification(bVar.f12953b, bVar.f12958g)) {
            return -3;
        }
        bVar.f12955d = C6085b.C6089d.done;
        this.f12943f = false;
        return -3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo27880v(java.lang.String r5, boolean r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " setCharacteristicNotification ("
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ") "
            r0.append(r1)
            r0.toString()
            int r0 = r5.hashCode()
            r1 = -81373452(0xfffffffffb2656f4, float:-8.636849E35)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0030
            r1 = 557023648(0x213381a0, float:6.0819116E-19)
            if (r0 == r1) goto L_0x0026
            goto L_0x003a
        L_0x0026:
            java.lang.String r0 = "CHAR_GINGKO_NOTIFY"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003a
            r5 = 0
            goto L_0x003b
        L_0x0030:
            java.lang.String r0 = "CHAR_TELINK_NOTIFY"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003a
            r5 = 1
            goto L_0x003b
        L_0x003a:
            r5 = -1
        L_0x003b:
            if (r5 == 0) goto L_0x0047
            if (r5 == r3) goto L_0x0040
            return r2
        L_0x0040:
            android.bluetooth.BluetoothGattCharacteristic r5 = r4.f12981r
        L_0x0042:
            boolean r5 = r4.mo27921N(r5, r6, r7)
            return r5
        L_0x0047:
            android.bluetooth.BluetoothGattCharacteristic r5 = r4.f12979p
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p179j.C6092c.mo27880v(java.lang.String, boolean, java.lang.String):boolean");
    }

    /* renamed from: x */
    public boolean mo27882x(String str, byte[] bArr) {
        return mo27883y(str, bArr, (String) null);
    }

    /* renamed from: y */
    public boolean mo27883y(String str, byte[] bArr, String str2) {
        return mo27884z(str, bArr, str2, (C6085b.C6090e) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo27884z(java.lang.String r6, byte[] r7, java.lang.String r8, com.yeelight.yeelib.p150c.p179j.C6085b.C6090e r9) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 0
            r2 = 1
            switch(r0) {
                case -2020883305: goto L_0x0050;
                case -487189179: goto L_0x0046;
                case -446670206: goto L_0x003c;
                case -433276299: goto L_0x0032;
                case -431358159: goto L_0x0028;
                case -81373452: goto L_0x001e;
                case 557023648: goto L_0x0014;
                case 593447278: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x005a
        L_0x000a:
            java.lang.String r0 = "CHAR_TELINK_COMMOND"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 4
            goto L_0x005b
        L_0x0014:
            java.lang.String r0 = "CHAR_GINGKO_NOTIFY"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 1
            goto L_0x005b
        L_0x001e:
            java.lang.String r0 = "CHAR_TELINK_NOTIFY"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 7
            goto L_0x005b
        L_0x0028:
            java.lang.String r0 = "CHAR_TELINK_OTA"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 5
            goto L_0x005b
        L_0x0032:
            java.lang.String r0 = "CHAR_OTA_NOTIFY"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 3
            goto L_0x005b
        L_0x003c:
            java.lang.String r0 = "CHAR_GINGKO_CTRL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 0
            goto L_0x005b
        L_0x0046:
            java.lang.String r0 = "CHAR_TELINK_PAIR"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 6
            goto L_0x005b
        L_0x0050:
            java.lang.String r0 = "CHAR_OTA_CTRL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 2
            goto L_0x005b
        L_0x005a:
            r0 = -1
        L_0x005b:
            java.lang.String r3 = "-"
            java.lang.String r4 = "write data = "
            switch(r0) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x00b8;
                case 2: goto L_0x00b6;
                case 3: goto L_0x00b6;
                case 4: goto L_0x009d;
                case 5: goto L_0x009a;
                case 6: goto L_0x007c;
                case 7: goto L_0x0079;
                default: goto L_0x0062;
            }
        L_0x0062:
            java.lang.String r7 = f12977w
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Invalid param: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.yeelight.yeelib.utils.C4308b.m12139r(r7, r6)
            return r1
        L_0x0079:
            android.bluetooth.BluetoothGattCharacteristic r6 = r5.f12981r
            goto L_0x00bd
        L_0x007c:
            android.bluetooth.BluetoothGattCharacteristic r6 = r5.f12982s
            r6.setWriteType(r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            java.lang.String r0 = com.telink.p149b.C3962a.m10649a(r7, r3)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.telink.p148a.C3961a.m10647a(r8)
            java.lang.String r8 = "CHAR_TELINK_PAIR WRITE"
            goto L_0x00bd
        L_0x009a:
            android.bluetooth.BluetoothGattCharacteristic r6 = r5.f12983t
            goto L_0x00bd
        L_0x009d:
            android.bluetooth.BluetoothGattCharacteristic r6 = r5.f12980q
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = com.telink.p149b.C3962a.m10649a(r7, r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.telink.p148a.C3961a.m10647a(r0)
            goto L_0x00bd
        L_0x00b6:
            r6 = 0
            goto L_0x00bd
        L_0x00b8:
            android.bluetooth.BluetoothGattCharacteristic r6 = r5.f12979p
            goto L_0x00bd
        L_0x00bb:
            android.bluetooth.BluetoothGattCharacteristic r6 = r5.f12978o
        L_0x00bd:
            boolean r6 = r5.mo27922P(r6, r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p179j.C6092c.mo27884z(java.lang.String, byte[], java.lang.String, com.yeelight.yeelib.c.j.b$e):boolean");
    }
}
