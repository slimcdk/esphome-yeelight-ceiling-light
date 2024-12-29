package com.yeelight.yeelib.device.connections;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import com.telink.crypto.AES;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.base.PrivateMeshDeviceBase;
import com.yeelight.yeelib.device.connections.ConnectionBase;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.utils.AppUtils;
import com.yeelight.yeelib.utils.C8896a;
import java.util.List;
import java.util.UUID;
import p051j4.C9202r;
import p144d3.C8936a;
import p149e3.C8964a;
import p223w3.C10898f0;
import p227x3.C11979o;

/* renamed from: com.yeelight.yeelib.device.connections.b */
public class C6153b extends ConnectionBase {
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final String f12650w = "b";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public BluetoothGattCharacteristic f12651o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public BluetoothGattCharacteristic f12652p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public BluetoothGattCharacteristic f12653q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public BluetoothGattCharacteristic f12654r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public BluetoothGattCharacteristic f12655s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public BluetoothGattCharacteristic f12656t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C10898f0 f12657u;

    /* renamed from: v */
    private BluetoothGattCallback f12658v = new C6154a();

    /* renamed from: com.yeelight.yeelib.device.connections.b$a */
    class C6154a extends BluetoothGattCallback {

        /* renamed from: com.yeelight.yeelib.device.connections.b$a$a */
        class C6155a implements Runnable {
            C6155a() {
            }

            public void run() {
                C6153b.this.f12598h.mo31509F1();
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.b$a$b */
        class C6156b implements Runnable {
            C6156b() {
            }

            public void run() {
                C6153b.this.f12598h.mo31510G1();
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.b$a$c */
        class C6157c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f12662a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGatt f12663b;

            C6157c(int i, BluetoothGatt bluetoothGatt) {
                this.f12662a = i;
                this.f12663b = bluetoothGatt;
            }

            public void run() {
                boolean z;
                boolean z2 = false;
                if (this.f12662a == 0) {
                    List<BluetoothGattService> services = this.f12663b.getServices();
                    if (services.size() != 0) {
                        for (BluetoothGattService next : this.f12663b.getServices()) {
                            String unused = C6153b.f12650w;
                            StringBuilder sb = new StringBuilder();
                            sb.append("|-found service : ");
                            sb.append(next.getUuid().toString());
                            for (BluetoothGattCharacteristic uuid : next.getCharacteristics()) {
                                String unused2 = C6153b.f12650w;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("|----found characteristic : ");
                                sb2.append(uuid.getUuid().toString());
                            }
                        }
                        z = false;
                        for (BluetoothGattService next2 : services) {
                            String unused3 = C6153b.f12650w;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Found service: ");
                            sb3.append(next2.getUuid().toString());
                            if (next2.getUuid().toString().equalsIgnoreCase("00010203-0405-0607-0809-0a0b0c0d1910") && next2.getCharacteristics().size() != 0) {
                                BluetoothGattCharacteristic unused4 = C6153b.this.f12653q = next2.getCharacteristic(UUID.fromString("00010203-0405-0607-0809-0a0b0c0d1912"));
                                BluetoothGattCharacteristic unused5 = C6153b.this.f12654r = next2.getCharacteristic(UUID.fromString("00010203-0405-0607-0809-0a0b0c0d1911"));
                                BluetoothGattCharacteristic unused6 = C6153b.this.f12655s = next2.getCharacteristic(UUID.fromString("00010203-0405-0607-0809-0a0b0c0d1914"));
                                BluetoothGattCharacteristic unused7 = C6153b.this.f12656t = next2.getCharacteristic(UUID.fromString("00010203-0405-0607-0809-0a0b0c0d1913"));
                                z2 = true;
                            } else if (next2.getUuid().toString().equalsIgnoreCase("0000fe87-0000-1000-8000-00805f9b34fb") && next2.getCharacteristics().size() != 0) {
                                BluetoothGattCharacteristic unused8 = C6153b.this.f12651o = next2.getCharacteristic(UUID.fromString("aa7d3f34-2d4f-41e0-807f-52fbf8cf7443"));
                                BluetoothGattCharacteristic unused9 = C6153b.this.f12652p = next2.getCharacteristic(UUID.fromString("8f65073d-9f57-4aaa-afea-397d19d5bbeb"));
                                z = true;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    z = false;
                }
                C6153b.this.f12598h.mo31515L1(z2, z);
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.b$a$d */
        class C6158d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ byte[] f12665a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGatt f12666b;

            /* renamed from: c */
            final /* synthetic */ BluetoothGattCharacteristic f12667c;

            C6158d(byte[] bArr, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f12665a = bArr;
                this.f12666b = bluetoothGatt;
                this.f12667c = bluetoothGattCharacteristic;
            }

            public void run() {
                String g = C8896a.m21230g(this.f12665a);
                StringBuilder sb = new StringBuilder();
                sb.append("get msg:");
                sb.append(g);
                sb.append(" from device : ");
                sb.append(C6153b.this.f12598h.mo23185G());
                sb.append("_");
                sb.append(C6153b.this.f12598h.mo23210U());
                C11979o oVar = new C11979o();
                this.f12666b.getDevice().getAddress();
                String lowerCase = this.f12667c.getUuid().toString().toLowerCase();
                if (!lowerCase.equals("f000ffc1-0451-4000-b000-000000000000")) {
                    if (lowerCase.equals("8f65073d-9f57-4aaa-afea-397d19d5bbeb") || lowerCase.equals("00010203-0405-0607-0809-0a0b0c0d1913")) {
                        oVar.f21861a = g.substring(0, 4);
                    }
                    if (lowerCase.equals("00010203-0405-0607-0809-0a0b0c0d1913")) {
                        oVar.f21862b = new String[]{g.substring(4, g.length())};
                        C6153b.this.f12598h.mo31513J1(oVar);
                    } else if (lowerCase.equals("8f65073d-9f57-4aaa-afea-397d19d5bbeb")) {
                        oVar.f21862b = new String[]{g.substring(4, g.length())};
                        C6153b.this.f12598h.mo31511H1(oVar);
                    } else if (lowerCase.equals("00010203-0405-0607-0809-0a0b0c0d1911")) {
                        ((PrivateMeshDeviceBase) C6153b.this.f12598h).mo31642c2(this.f12667c.getValue());
                    }
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.b$a$e */
        class C6159e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattCharacteristic f12669a;

            /* renamed from: b */
            final /* synthetic */ int f12670b;

            C6159e(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                this.f12669a = bluetoothGattCharacteristic;
                this.f12670b = i;
            }

            public void run() {
                C6153b.this.f12598h.mo31507D1(this.f12669a, this.f12670b);
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.b$a$f */
        class C6160f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattCharacteristic f12672a;

            /* renamed from: b */
            final /* synthetic */ int f12673b;

            C6160f(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                this.f12672a = bluetoothGattCharacteristic;
                this.f12673b = i;
            }

            public void run() {
                C6153b.this.f12598h.mo31508E1(this.f12672a, this.f12673b);
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.b$a$g */
        class C6161g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattDescriptor f12675a;

            /* renamed from: b */
            final /* synthetic */ int f12676b;

            C6161g(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
                this.f12675a = bluetoothGattDescriptor;
                this.f12676b = i;
            }

            public void run() {
                C6153b.this.f12598h.mo31512I1(this.f12675a, this.f12676b);
            }
        }

        C6154a() {
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (bluetoothGattCharacteristic.getUuid().toString().equalsIgnoreCase("00010203-0405-0607-0809-0a0b0c0d1911")) {
                byte[] f = C9202r.m22202f(C6153b.this.f12657u.mo42250l3());
                System.arraycopy(value, 0, f, 3, 5);
                byte[] a = AES.m12460a(C6153b.this.f12657u.mo42251m3(), f, value);
                String g = C8896a.m21230g(a);
                StringBuilder sb = new StringBuilder();
                sb.append("Telink notify:");
                sb.append(g);
                if (a[7] == -37) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Get status notify device :");
                    sb2.append((a[4] << 8) + a[3]);
                } else {
                    int J = C6153b.this.m18211M(a);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("get msg:");
                    sb3.append(g);
                    sb3.append(" from device : ");
                    sb3.append(C6153b.this.f12598h.mo23185G());
                    sb3.append(", and new addresss = ");
                    sb3.append(J);
                }
                ((PrivateMeshDeviceBase) C6153b.this.f12598h).mo31642c2(a);
                return;
            }
            C6153b.this.f12603m.mo31816b(new C6158d(value, bluetoothGatt, bluetoothGattCharacteristic));
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (C6153b.this.f12596f) {
                C6153b.this.m18212O(i);
            }
            if (C6153b.this.f12593c.size() > 0) {
                C6153b.this.f12597g.lock();
                int i2 = 0;
                while (true) {
                    if (i2 >= C6153b.this.f12593c.size()) {
                        break;
                    }
                    ConnectionBase.C6139b bVar = C6153b.this.f12593c.get(i2);
                    if (bVar.f12608b == bluetoothGattCharacteristic) {
                        bVar.f12610d = ConnectionBase.BleRequestStatus.done;
                        C6153b.this.f12593c.remove(i2);
                        break;
                    }
                    i2++;
                }
                C6153b.this.f12597g.unlock();
            }
            C6153b.this.f12603m.mo31816b(new C6159e(bluetoothGattCharacteristic, i));
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCharacteristicWrite status = ");
            sb.append(i);
            if (C6153b.this.f12596f) {
                C6153b.this.m18212O(i);
            }
            if (C6153b.this.f12593c.size() > 0) {
                C6153b.this.f12597g.lock();
                int i2 = 0;
                while (true) {
                    if (i2 >= C6153b.this.f12593c.size()) {
                        break;
                    }
                    ConnectionBase.C6139b bVar = C6153b.this.f12593c.get(i2);
                    if (bVar.f12608b == bluetoothGattCharacteristic) {
                        bVar.f12610d = ConnectionBase.BleRequestStatus.done;
                        C6153b.this.f12593c.remove(i2);
                        break;
                    }
                    i2++;
                }
                C6153b.this.f12597g.unlock();
            }
            C6153b.this.f12603m.mo31816b(new C6160f(bluetoothGattCharacteristic, i));
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            ConnectionBase.C6141d dVar;
            Runnable bVar;
            String B;
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("GingkoConnection, onConnectionStateChange, status: ");
            sb.append(i);
            sb.append(", new state: ");
            sb.append(i2);
            if (i2 != 0) {
                BluetoothGatt bluetoothGatt2 = C6153b.this.f12601k;
                if (bluetoothGatt2 == null) {
                    B = C6153b.f12650w;
                    str = "BluetoothGatt not created!!!!!! new state: " + i2;
                } else if (bluetoothGatt2 != bluetoothGatt) {
                    B = C6153b.f12650w;
                    str = "Invalid gatt!";
                }
                AppUtils.m8300u(B, str);
            }
            if (i2 == 0) {
                C6153b bVar2 = C6153b.this;
                bVar2.f12591a = false;
                dVar = bVar2.f12603m;
                bVar = new C6156b();
            } else if (i2 != 2) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("New state not processed: ");
                    sb2.append(i2);
                    return;
                } catch (NullPointerException e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                C6153b bVar3 = C6153b.this;
                bVar3.f12591a = true;
                bVar3.mo31839L();
                dVar = C6153b.this.f12603m;
                bVar = new C6155a();
            }
            dVar.mo31816b(bVar);
        }

        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            boolean z = C6153b.this.f12596f;
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDescriptorWrite status = ");
            sb.append(i);
            boolean z = C6153b.this.f12596f;
            new Thread(new C6161g(bluetoothGattDescriptor, i)).start();
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            if (C6153b.this.f12598h.mo23113A() < 4) {
                C6153b.this.f12603m.mo31816b(new C6157c(i, bluetoothGatt));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.connections.b$b */
    class C6162b extends Thread {
        C6162b() {
        }

        public void run() {
            while (true) {
                C6153b bVar = C6153b.this;
                if (bVar.f12591a) {
                    bVar.mo31796i();
                    try {
                        if (!(C6153b.this.f12594d == null || C6153b.this.f12594d.f12608b == null || (!C6153b.this.f12594d.f12608b.getUuid().toString().toLowerCase().equals("00010203-0405-0607-0809-0a0b0c0d1914") && !C6153b.this.f12594d.f12608b.getUuid().toString().toLowerCase().equals("00010203-0405-0607-0809-0a0b0c0d1912")))) {
                            String unused = C6153b.f12650w;
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

    public C6153b(C6081a aVar) {
        this.f12598h = aVar;
        this.f12657u = (C10898f0) aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public int m18211M(byte[] bArr) {
        if (bArr.length >= 20 && (bArr[7] & 255) == 225) {
            return bArr[10] + (bArr[11] << 8);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m18212O(int i) {
        this.f12595e = i;
        this.f12596f = false;
    }

    /* renamed from: A */
    public boolean mo31787A(String str, byte[] bArr, String str2) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2020883305:
                if (str.equals("CHAR_OTA_CTRL")) {
                    c = 0;
                    break;
                }
                break;
            case -446670206:
                if (str.equals("CHAR_GINGKO_CTRL")) {
                    c = 1;
                    break;
                }
                break;
            case -433276299:
                if (str.equals("CHAR_OTA_NOTIFY")) {
                    c = 2;
                    break;
                }
                break;
            case 557023648:
                if (str.equals("CHAR_GINGKO_NOTIFY")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
                bluetoothGattCharacteristic = null;
                break;
            case 1:
                bluetoothGattCharacteristic = this.f12651o;
                break;
            case 3:
                bluetoothGattCharacteristic = this.f12652p;
                break;
            default:
                String str3 = f12650w;
                AppUtils.m8300u(str3, "Invalid param: " + str);
                return false;
        }
        return mo31842Q(bluetoothGattCharacteristic, bArr, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo31839L() {
        new C6162b().start();
    }

    /* renamed from: N */
    public boolean mo31840N(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, String str) {
        char c;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        ConnectionBase.C6139b bVar = new ConnectionBase.C6139b(this);
        bVar.f12610d = ConnectionBase.BleRequestStatus.not_queued;
        bVar.f12608b = bluetoothGattCharacteristic;
        bVar.f12609c = ConnectionBase.BleRequestOperation.nsBlocking;
        bVar.f12613g = z;
        bVar.f12614h = str;
        mo31788a(bVar);
        boolean z2 = false;
        loop0:
        while (true) {
            c = 65533;
            while (!z2) {
                ConnectionBase.BleRequestStatus l = mo31799l(bVar);
                if (l == ConnectionBase.BleRequestStatus.done) {
                    z2 = true;
                    c = 0;
                } else if (l == ConnectionBase.BleRequestStatus.timeout) {
                    z2 = true;
                }
            }
            break loop0;
        }
        return c == 0;
    }

    /* renamed from: P */
    public boolean mo31841P(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, String str, ConnectionBase.C6140c cVar) {
        int i;
        ConnectionBase.C6139b bVar = new ConnectionBase.C6139b(this);
        bVar.f12610d = ConnectionBase.BleRequestStatus.not_queued;
        bVar.f12608b = bluetoothGattCharacteristic;
        bVar.f12609c = ConnectionBase.BleRequestOperation.wrBlocking;
        bVar.f12614h = str;
        bVar.f12615i = bArr;
        bVar.f12616j = cVar;
        mo31788a(bVar);
        boolean z = false;
        loop0:
        while (true) {
            i = -3;
            while (!z) {
                ConnectionBase.BleRequestStatus l = mo31799l(bVar);
                if (l == ConnectionBase.BleRequestStatus.done) {
                    z = true;
                    i = 0;
                } else if (l == ConnectionBase.BleRequestStatus.timeout) {
                    i = -1;
                    z = true;
                } else if (l == ConnectionBase.BleRequestStatus.failed) {
                    z = true;
                }
            }
            break loop0;
        }
        if (i == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("writeCharacteristic, return false, ret code: ");
        sb.append(i);
        return false;
    }

    /* renamed from: Q */
    public boolean mo31842Q(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, String str) {
        ConnectionBase.C6139b bVar = new ConnectionBase.C6139b(this);
        bVar.f12610d = ConnectionBase.BleRequestStatus.not_queued;
        bVar.f12608b = bluetoothGattCharacteristic;
        bVar.f12609c = ConnectionBase.BleRequestOperation.wr;
        bVar.f12614h = str;
        bVar.f12615i = bArr;
        StringBuilder sb = new StringBuilder();
        sb.append("##########writeCharacteristicNonBlock, tag: ");
        sb.append(str);
        mo31788a(bVar);
        return true;
    }

    /* renamed from: e */
    public boolean mo31792e(String str) {
        BluetoothDevice remoteDevice;
        BluetoothManager bluetoothManager;
        BluetoothAdapter bluetoothAdapter = this.f12600j;
        if (!(bluetoothAdapter == null || str == null || (remoteDevice = bluetoothAdapter.getRemoteDevice(str)) == null || (bluetoothManager = this.f12599i) == null)) {
            int connectionState = bluetoothManager.getConnectionState(remoteDevice, 7);
            if (connectionState == 0) {
                String str2 = this.f12602l;
                if (str2 != null && str.equals(str2) && this.f12601k != null) {
                    return this.f12601k.connect();
                }
                this.f12601k = remoteDevice.connectGatt(C3108x.f4951e, false, this.f12658v);
                this.f12602l = str;
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("###########Attempt to connect in state: ");
            sb.append(connectionState);
            this.f12601k = remoteDevice.connectGatt(C3108x.f4951e, false, this.f12658v);
            this.f12602l = str;
        }
        return false;
    }

    /* renamed from: n */
    public int mo31801n(String str, ConnectionBase.C6140c cVar) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        str.hashCode();
        if (str.equals("CHAR_TELINK_PAIR")) {
            bluetoothGattCharacteristic = this.f12655s;
        } else if (!str.equals("CHAR_TELINK_OTA")) {
            return -3;
        } else {
            bluetoothGattCharacteristic = this.f12656t;
        }
        return mo31800m(bluetoothGattCharacteristic, cVar);
    }

    /* renamed from: q */
    public int mo31804q(ConnectionBase.C6139b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendBlockingNotifySetting req: ");
        sb.append(bVar.f12607a);
        bVar.f12610d = ConnectionBase.BleRequestStatus.processing;
        if (bVar.f12608b == null) {
            return -1;
        }
        if (!mo31789b()) {
            return -2;
        }
        if (!this.f12601k.setCharacteristicNotification(bVar.f12608b, bVar.f12613g)) {
            return -3;
        }
        bVar.f12610d = ConnectionBase.BleRequestStatus.done;
        this.f12596f = false;
        return -3;
    }

    /* renamed from: v */
    public boolean mo31809v(String str, boolean z, String str2) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        StringBuilder sb = new StringBuilder();
        sb.append(" setCharacteristicNotification (");
        sb.append(str);
        sb.append(") ");
        str.hashCode();
        if (str.equals("CHAR_TELINK_NOTIFY")) {
            bluetoothGattCharacteristic = this.f12654r;
        } else if (!str.equals("CHAR_GINGKO_NOTIFY")) {
            return false;
        } else {
            bluetoothGattCharacteristic = this.f12652p;
        }
        return mo31840N(bluetoothGattCharacteristic, z, str2);
    }

    /* renamed from: x */
    public boolean mo31811x(String str, byte[] bArr) {
        return mo31812y(str, bArr, (String) null);
    }

    /* renamed from: y */
    public boolean mo31812y(String str, byte[] bArr, String str2) {
        return mo31813z(str, bArr, str2, (ConnectionBase.C6140c) null);
    }

    /* renamed from: z */
    public boolean mo31813z(String str, byte[] bArr, String str2, ConnectionBase.C6140c cVar) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2020883305:
                if (str.equals("CHAR_OTA_CTRL")) {
                    c = 0;
                    break;
                }
                break;
            case -487189179:
                if (str.equals("CHAR_TELINK_PAIR")) {
                    c = 1;
                    break;
                }
                break;
            case -446670206:
                if (str.equals("CHAR_GINGKO_CTRL")) {
                    c = 2;
                    break;
                }
                break;
            case -433276299:
                if (str.equals("CHAR_OTA_NOTIFY")) {
                    c = 3;
                    break;
                }
                break;
            case -431358159:
                if (str.equals("CHAR_TELINK_OTA")) {
                    c = 4;
                    break;
                }
                break;
            case -81373452:
                if (str.equals("CHAR_TELINK_NOTIFY")) {
                    c = 5;
                    break;
                }
                break;
            case 557023648:
                if (str.equals("CHAR_GINGKO_NOTIFY")) {
                    c = 6;
                    break;
                }
                break;
            case 593447278:
                if (str.equals("CHAR_TELINK_COMMOND")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 3:
                bluetoothGattCharacteristic = null;
                break;
            case 1:
                bluetoothGattCharacteristic = this.f12655s;
                bluetoothGattCharacteristic.setWriteType(1);
                C8936a.m21301a("write data = " + C8964a.m21435a(bArr, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
                str2 = "CHAR_TELINK_PAIR WRITE";
                break;
            case 2:
                bluetoothGattCharacteristic = this.f12651o;
                break;
            case 4:
                bluetoothGattCharacteristic = this.f12656t;
                break;
            case 5:
                bluetoothGattCharacteristic = this.f12654r;
                break;
            case 6:
                bluetoothGattCharacteristic = this.f12652p;
                break;
            case 7:
                bluetoothGattCharacteristic = this.f12653q;
                C8936a.m21301a("write data = " + C8964a.m21435a(bArr, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
                break;
            default:
                String str3 = f12650w;
                AppUtils.m8300u(str3, "Invalid param: " + str);
                return false;
        }
        return mo31841P(bluetoothGattCharacteristic, bArr, str2, cVar);
    }
}
