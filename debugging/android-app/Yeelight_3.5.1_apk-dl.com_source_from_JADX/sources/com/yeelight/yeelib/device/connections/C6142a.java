package com.yeelight.yeelib.device.connections;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.connections.ConnectionBase;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.utils.AppUtils;
import com.yeelight.yeelib.utils.C8896a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;
import p227x3.C11979o;

/* renamed from: com.yeelight.yeelib.device.connections.a */
public class C6142a extends ConnectionBase {
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final String f12618x = "a";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public BluetoothGattService f12619o = null;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public BluetoothGattCharacteristic f12620p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public BluetoothGattCharacteristic f12621q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public BluetoothGattService f12622r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public BluetoothGattCharacteristic f12623s = null;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public BluetoothGattCharacteristic f12624t = null;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public BluetoothGattCharacteristic f12625u = null;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public BluetoothGattCharacteristic f12626v = null;

    /* renamed from: w */
    private BluetoothGattCallback f12627w = new C6143a();

    /* renamed from: com.yeelight.yeelib.device.connections.a$a */
    class C6143a extends BluetoothGattCallback {

        /* renamed from: com.yeelight.yeelib.device.connections.a$a$a */
        class C6144a implements Runnable {
            C6144a() {
            }

            public void run() {
                C6142a.this.f12598h.mo31509F1();
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.a$a$b */
        class C6145b implements Runnable {
            C6145b() {
            }

            public void run() {
                C6142a.this.f12598h.mo31510G1();
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.a$a$c */
        class C6146c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f12631a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGatt f12632b;

            C6146c(int i, BluetoothGatt bluetoothGatt) {
                this.f12631a = i;
                this.f12632b = bluetoothGatt;
            }

            public void run() {
                boolean z;
                boolean z2 = false;
                if (this.f12631a == 0) {
                    List<BluetoothGattService> services = this.f12632b.getServices();
                    if (services.size() != 0) {
                        for (BluetoothGattService next : this.f12632b.getServices()) {
                            String unused = C6142a.f12618x;
                            StringBuilder sb = new StringBuilder();
                            sb.append("|-found service : ");
                            sb.append(next.getUuid().toString());
                            for (BluetoothGattCharacteristic uuid : next.getCharacteristics()) {
                                String unused2 = C6142a.f12618x;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("|----found characteristic : ");
                                sb2.append(uuid.getUuid().toString());
                            }
                        }
                        z = false;
                        for (BluetoothGattService next2 : services) {
                            String unused3 = C6142a.f12618x;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Found service: ");
                            sb3.append(next2.getUuid().toString());
                            if (next2.getUuid().toString().equalsIgnoreCase("f000ffc0-0451-4000-b000-000000000000") && next2.getCharacteristics().size() != 0) {
                                BluetoothGattService unused4 = C6142a.this.f12619o = next2;
                                z2 = true;
                            } else if (next2.getUuid().toString().equalsIgnoreCase("8E2F0CBD-1A66-4B53-ACE6-B494E25F87BD") && next2.getCharacteristics().size() != 0) {
                                BluetoothGattService unused5 = C6142a.this.f12622r = next2;
                                z = true;
                            }
                        }
                        String unused6 = C6142a.f12618x;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("mOadService is :");
                        sb4.append(C6142a.this.f12619o);
                        String unused7 = C6142a.f12618x;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("mYeelightService is :");
                        sb5.append(C6142a.this.f12622r);
                        if (C6142a.this.f12619o != null) {
                            C6142a aVar = C6142a.this;
                            BluetoothGattCharacteristic unused8 = aVar.f12620p = aVar.f12619o.getCharacteristic(UUID.fromString("f000ffc1-0451-4000-b000-000000000000"));
                            C6142a aVar2 = C6142a.this;
                            BluetoothGattCharacteristic unused9 = aVar2.f12621q = aVar2.f12619o.getCharacteristic(UUID.fromString("f000ffc2-0451-4000-b000-000000000000"));
                        }
                        if (C6142a.this.f12622r != null) {
                            C6142a aVar3 = C6142a.this;
                            BluetoothGattCharacteristic unused10 = aVar3.f12623s = aVar3.f12622r.getCharacteristic(UUID.fromString("aa7d3f34-2d4f-41e0-807f-52fbf8cf7443"));
                            C6142a aVar4 = C6142a.this;
                            BluetoothGattCharacteristic unused11 = aVar4.f12624t = aVar4.f12622r.getCharacteristic(UUID.fromString("8f65073d-9f57-4aaa-afea-397d19d5bbeb"));
                            C6142a aVar5 = C6142a.this;
                            BluetoothGattCharacteristic unused12 = aVar5.f12625u = aVar5.f12622r.getCharacteristic(UUID.fromString("f000fff1-0451-4000-b000-000000000000"));
                            C6142a aVar6 = C6142a.this;
                            BluetoothGattCharacteristic unused13 = aVar6.f12626v = aVar6.f12622r.getCharacteristic(UUID.fromString("f000fff2-0451-4000-b000-000000000000"));
                        }
                    } else {
                        return;
                    }
                } else {
                    z = false;
                }
                C6142a.this.f12598h.mo31515L1(z2, z);
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.a$a$d */
        class C6147d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ byte[] f12634a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGatt f12635b;

            /* renamed from: c */
            final /* synthetic */ BluetoothGattCharacteristic f12636c;

            C6147d(byte[] bArr, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f12634a = bArr;
                this.f12635b = bluetoothGatt;
                this.f12636c = bluetoothGattCharacteristic;
            }

            public void run() {
                String g = C8896a.m21230g(this.f12634a);
                StringBuilder sb = new StringBuilder();
                sb.append("get msg:");
                sb.append(g);
                sb.append(" from device : ");
                sb.append(C6142a.this.f12598h.mo23185G());
                sb.append("_");
                sb.append(C6142a.this.f12598h.mo23210U());
                C11979o oVar = new C11979o();
                this.f12635b.getDevice().getAddress();
                String lowerCase = this.f12636c.getUuid().toString().toLowerCase();
                if (!lowerCase.equals("f000ffc1-0451-4000-b000-000000000000")) {
                    if (lowerCase.equals("8f65073d-9f57-4aaa-afea-397d19d5bbeb") || lowerCase.equals("f000fff2-0451-4000-b000-000000000000")) {
                        oVar.f21861a = g.substring(0, 4);
                    }
                    if (lowerCase.equals("f000fff2-0451-4000-b000-000000000000")) {
                        oVar.f21862b = new String[]{g.substring(4, g.length())};
                        C6142a.this.f12598h.mo31513J1(oVar);
                        return;
                    }
                    oVar.f21862b = new String[]{g.substring(4, g.length())};
                    C6142a.this.f12598h.mo31511H1(oVar);
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.a$a$e */
        class C6148e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattCharacteristic f12638a;

            /* renamed from: b */
            final /* synthetic */ int f12639b;

            C6148e(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                this.f12638a = bluetoothGattCharacteristic;
                this.f12639b = i;
            }

            public void run() {
                C6142a.this.f12598h.mo31507D1(this.f12638a, this.f12639b);
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.a$a$f */
        class C6149f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f12641a;

            C6149f(int i) {
                this.f12641a = i;
            }

            public void run() {
                C6142a.this.f12598h.mo31514K1(this.f12641a);
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.a$a$g */
        class C6150g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattCharacteristic f12643a;

            /* renamed from: b */
            final /* synthetic */ int f12644b;

            C6150g(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                this.f12643a = bluetoothGattCharacteristic;
                this.f12644b = i;
            }

            public void run() {
                C6142a.this.f12598h.mo31508E1(this.f12643a, this.f12644b);
            }
        }

        /* renamed from: com.yeelight.yeelib.device.connections.a$a$h */
        class C6151h implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattDescriptor f12646a;

            /* renamed from: b */
            final /* synthetic */ int f12647b;

            C6151h(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
                this.f12646a = bluetoothGattDescriptor;
                this.f12647b = i;
            }

            public void run() {
                C6142a.this.f12598h.mo31512I1(this.f12646a, this.f12647b);
            }
        }

        C6143a() {
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            C6142a.this.f12603m.mo31816b(new C6147d(bluetoothGattCharacteristic.getValue(), bluetoothGatt, bluetoothGattCharacteristic));
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (C6142a.this.f12596f) {
                C6142a.this.m18183P(i);
            }
            if (C6142a.this.f12593c.size() > 0) {
                C6142a.this.f12597g.lock();
                int i2 = 0;
                while (true) {
                    if (i2 >= C6142a.this.f12593c.size()) {
                        break;
                    }
                    ConnectionBase.C6139b bVar = C6142a.this.f12593c.get(i2);
                    if (bVar.f12608b == bluetoothGattCharacteristic) {
                        bVar.f12610d = ConnectionBase.BleRequestStatus.done;
                        C6142a.this.f12593c.remove(i2);
                        break;
                    }
                    i2++;
                }
                C6142a.this.f12597g.unlock();
            }
            C6142a.this.f12603m.mo31816b(new C6148e(bluetoothGattCharacteristic, i));
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (C6142a.this.f12596f) {
                C6142a.this.m18183P(i);
            }
            if (C6142a.this.f12593c.size() > 0) {
                C6142a.this.f12597g.lock();
                int i2 = 0;
                while (true) {
                    if (i2 >= C6142a.this.f12593c.size()) {
                        break;
                    }
                    ConnectionBase.C6139b bVar = C6142a.this.f12593c.get(i2);
                    if (bVar.f12608b == bluetoothGattCharacteristic) {
                        bVar.f12610d = ConnectionBase.BleRequestStatus.done;
                        C6142a.this.f12593c.remove(i2);
                        break;
                    }
                    i2++;
                }
                C6142a.this.f12597g.unlock();
            }
            C6142a.this.f12603m.mo31816b(new C6150g(bluetoothGattCharacteristic, i));
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            ConnectionBase.C6141d dVar;
            Runnable bVar;
            String B;
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("CherryConnection, onConnectionStateChange, status: ");
            sb.append(i);
            sb.append(", new state: ");
            sb.append(i2);
            if (i2 != 0) {
                BluetoothGatt bluetoothGatt2 = C6142a.this.f12601k;
                if (bluetoothGatt2 == null) {
                    B = C6142a.f12618x;
                    str = "BluetoothGatt not created!!!!!! new state: " + i2;
                } else if (bluetoothGatt2 != bluetoothGatt) {
                    B = C6142a.f12618x;
                    str = "Invalid gatt!";
                }
                AppUtils.m8300u(B, str);
            }
            if (i2 == 0) {
                C6142a aVar = C6142a.this;
                aVar.f12591a = false;
                dVar = aVar.f12603m;
                bVar = new C6145b();
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
                C6142a aVar2 = C6142a.this;
                aVar2.f12591a = true;
                aVar2.mo31818N();
                dVar = C6142a.this.f12603m;
                bVar = new C6144a();
            }
            dVar.mo31816b(bVar);
        }

        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (C6142a.this.f12596f) {
                C6142a.this.m18183P(i);
            }
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (C6142a.this.f12596f) {
                C6142a.this.m18183P(i);
            }
            new Thread(new C6151h(bluetoothGattDescriptor, i)).start();
        }

        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReadRemoteRssi, rssi: ");
            sb.append(i);
            C6142a.this.f12603m.mo31816b(new C6149f(i));
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            if (C6142a.this.f12598h.mo23113A() < 4) {
                C6142a.this.f12603m.mo31816b(new C6146c(i, bluetoothGatt));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.connections.a$b */
    class C6152b extends Thread {
        C6152b() {
        }

        public void run() {
            while (true) {
                C6142a aVar = C6142a.this;
                if (aVar.f12591a) {
                    aVar.mo31796i();
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

    public C6142a(C6081a aVar) {
        this.f12598h = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m18183P(int i) {
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
            case -1086447738:
                if (str.equals("CHAR_CHERRY_NOTIFY")) {
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
            case 482083839:
                if (str.equals("CHAR_OAD_NOTIFY")) {
                    c = 3;
                    break;
                }
                break;
            case 1389847799:
                if (str.equals("CHAR_OAD_BLOCK")) {
                    c = 4;
                    break;
                }
                break;
            case 1629829608:
                if (str.equals("CHAR_CHERRY_CTRL")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bluetoothGattCharacteristic = this.f12625u;
                break;
            case 1:
                bluetoothGattCharacteristic = this.f12624t;
                break;
            case 2:
                bluetoothGattCharacteristic = this.f12626v;
                break;
            case 3:
                bluetoothGattCharacteristic = this.f12620p;
                break;
            case 4:
                bluetoothGattCharacteristic = this.f12621q;
                break;
            case 5:
                bluetoothGattCharacteristic = this.f12623s;
                break;
            default:
                String str3 = f12618x;
                AppUtils.m8300u(str3, "Invalid param: " + str);
                return false;
        }
        return mo31821R(bluetoothGattCharacteristic, bArr, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo31818N() {
        new C6152b().start();
    }

    /* renamed from: O */
    public boolean mo31819O(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, String str) {
        char c;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        ConnectionBase.C6139b bVar = new ConnectionBase.C6139b(this);
        bVar.f12610d = ConnectionBase.BleRequestStatus.not_queued;
        bVar.f12608b = bluetoothGattCharacteristic;
        bVar.f12609c = ConnectionBase.BleRequestOperation.nsBlocking;
        bVar.f12613g = z;
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

    /* renamed from: Q */
    public boolean mo31820Q(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, String str) {
        ConnectionBase.C6139b bVar = new ConnectionBase.C6139b(this);
        bVar.f12610d = ConnectionBase.BleRequestStatus.not_queued;
        bVar.f12608b = bluetoothGattCharacteristic;
        bVar.f12609c = ConnectionBase.BleRequestOperation.wrBlocking;
        bVar.f12614h = str;
        bVar.f12615i = bArr;
        mo31788a(bVar);
        int i = -3;
        boolean z = false;
        while (!z) {
            ConnectionBase.BleRequestStatus l = mo31799l(bVar);
            if (l == ConnectionBase.BleRequestStatus.done) {
                i = 0;
            } else if (l == ConnectionBase.BleRequestStatus.timeout) {
                i = -1;
            }
            z = true;
        }
        if (i == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("writeCharacteristic, return false, ret code: ");
        sb.append(i);
        return false;
    }

    /* renamed from: R */
    public boolean mo31821R(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, String str) {
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

    /* renamed from: c */
    public void mo31790c() {
        BluetoothGatt bluetoothGatt = this.f12601k;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
            this.f12601k = null;
        }
    }

    /* renamed from: d */
    public void mo31791d() {
        mo31792e(this.f12598h.mo23185G());
    }

    /* renamed from: e */
    public boolean mo31792e(String str) {
        BluetoothAdapter bluetoothAdapter = this.f12600j;
        if (!(bluetoothAdapter == null || str == null)) {
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            int connectionState = this.f12599i.getConnectionState(remoteDevice, 7);
            mo31790c();
            if (connectionState == 0) {
                String str2 = this.f12602l;
                if (str2 != null && str.equals(str2) && this.f12601k != null) {
                    return this.f12601k.connect();
                }
                if (remoteDevice == null) {
                    return false;
                }
                this.f12601k = remoteDevice.connectGatt(C3108x.f4951e, false, this.f12627w);
                this.f12602l = str;
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("###########Attempt to connect in state: ");
            sb.append(connectionState);
            this.f12601k = remoteDevice.connectGatt(C3108x.f4951e, false, this.f12627w);
            this.f12602l = str;
        }
        return false;
    }

    /* renamed from: h */
    public void mo31795h() {
        if (this.f12601k != null) {
            this.f12601k.discoverServices();
        }
    }

    /* renamed from: j */
    public String mo31797j() {
        return this.f12600j.getAddress();
    }

    /* renamed from: n */
    public int mo31801n(String str, ConnectionBase.C6140c cVar) {
        return 0;
    }

    /* renamed from: p */
    public void mo31803p() {
        if (this.f12601k != null) {
            try {
                Method method = this.f12601k.getClass().getMethod("refresh", new Class[0]);
                if (method != null) {
                    method.invoke(this.f12601k, new Object[0]);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: v */
    public boolean mo31809v(String str, boolean z, String str2) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1086447738:
                if (str.equals("CHAR_CHERRY_NOTIFY")) {
                    c = 0;
                    break;
                }
                break;
            case -433276299:
                if (str.equals("CHAR_OTA_NOTIFY")) {
                    c = 1;
                    break;
                }
                break;
            case 482083839:
                if (str.equals("CHAR_OAD_NOTIFY")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bluetoothGattCharacteristic = this.f12624t;
                break;
            case 1:
                bluetoothGattCharacteristic = this.f12626v;
                break;
            case 2:
                bluetoothGattCharacteristic = this.f12620p;
                break;
            default:
                return false;
        }
        return mo31819O(bluetoothGattCharacteristic, z, str2);
    }

    /* renamed from: w */
    public void mo31810w(int i) {
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
    public boolean mo31811x(String str, byte[] bArr) {
        return mo31812y(str, bArr, (String) null);
    }

    /* renamed from: y */
    public boolean mo31812y(String str, byte[] bArr, String str2) {
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
            case -1086447738:
                if (str.equals("CHAR_CHERRY_NOTIFY")) {
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
            case 482083839:
                if (str.equals("CHAR_OAD_NOTIFY")) {
                    c = 3;
                    break;
                }
                break;
            case 1389847799:
                if (str.equals("CHAR_OAD_BLOCK")) {
                    c = 4;
                    break;
                }
                break;
            case 1629829608:
                if (str.equals("CHAR_CHERRY_CTRL")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bluetoothGattCharacteristic = this.f12625u;
                break;
            case 1:
                bluetoothGattCharacteristic = this.f12624t;
                break;
            case 2:
                bluetoothGattCharacteristic = this.f12626v;
                break;
            case 3:
                bluetoothGattCharacteristic = this.f12620p;
                break;
            case 4:
                bluetoothGattCharacteristic = this.f12621q;
                break;
            case 5:
                bluetoothGattCharacteristic = this.f12623s;
                break;
            default:
                String str3 = f12618x;
                AppUtils.m8300u(str3, "Invalid param: " + str);
                return false;
        }
        return mo31820Q(bluetoothGattCharacteristic, bArr, str2);
    }

    /* renamed from: z */
    public boolean mo31813z(String str, byte[] bArr, String str2, ConnectionBase.C6140c cVar) {
        return false;
    }
}
