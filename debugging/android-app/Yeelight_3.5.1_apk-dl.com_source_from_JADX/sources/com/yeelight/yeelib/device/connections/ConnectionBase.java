package com.yeelight.yeelib.device.connections;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.utils.AppUtils;
import com.yeelight.yeelib.utils.C8896a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p051j4.C9185b;

public abstract class ConnectionBase {

    /* renamed from: n */
    private static String f12590n = "ConnectionBase";

    /* renamed from: a */
    protected boolean f12591a = false;

    /* renamed from: b */
    volatile LinkedList<C6139b> f12592b;

    /* renamed from: c */
    volatile LinkedList<C6139b> f12593c;

    /* renamed from: d */
    volatile C6139b f12594d = null;

    /* renamed from: e */
    volatile int f12595e = 0;

    /* renamed from: f */
    volatile boolean f12596f = false;

    /* renamed from: g */
    final Lock f12597g = new ReentrantLock();

    /* renamed from: h */
    C6081a f12598h;

    /* renamed from: i */
    BluetoothManager f12599i = null;

    /* renamed from: j */
    BluetoothAdapter f12600j = null;

    /* renamed from: k */
    BluetoothGatt f12601k = null;

    /* renamed from: l */
    String f12602l;

    /* renamed from: m */
    protected C6141d f12603m;

    public enum BleRequestOperation {
        wrBlocking,
        wr,
        rdBlocking,
        rd,
        nsBlocking
    }

    public enum BleRequestStatus {
        not_queued,
        queued,
        processing,
        timeout,
        done,
        no_such_request,
        failed
    }

    /* renamed from: com.yeelight.yeelib.device.connections.ConnectionBase$a */
    static /* synthetic */ class C6138a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12606a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.yeelight.yeelib.device.connections.ConnectionBase$BleRequestOperation[] r0 = com.yeelight.yeelib.device.connections.ConnectionBase.BleRequestOperation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12606a = r0
                com.yeelight.yeelib.device.connections.ConnectionBase$BleRequestOperation r1 = com.yeelight.yeelib.device.connections.ConnectionBase.BleRequestOperation.rd     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12606a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.connections.ConnectionBase$BleRequestOperation r1 = com.yeelight.yeelib.device.connections.ConnectionBase.BleRequestOperation.rdBlocking     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12606a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.device.connections.ConnectionBase$BleRequestOperation r1 = com.yeelight.yeelib.device.connections.ConnectionBase.BleRequestOperation.wr     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12606a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.device.connections.ConnectionBase$BleRequestOperation r1 = com.yeelight.yeelib.device.connections.ConnectionBase.BleRequestOperation.wrBlocking     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12606a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yeelight.yeelib.device.connections.ConnectionBase$BleRequestOperation r1 = com.yeelight.yeelib.device.connections.ConnectionBase.BleRequestOperation.nsBlocking     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.connections.ConnectionBase.C6138a.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.connections.ConnectionBase$b */
    public class C6139b {

        /* renamed from: a */
        public int f12607a;

        /* renamed from: b */
        public BluetoothGattCharacteristic f12608b;

        /* renamed from: c */
        public BleRequestOperation f12609c;

        /* renamed from: d */
        public volatile BleRequestStatus f12610d;

        /* renamed from: e */
        public int f12611e;

        /* renamed from: f */
        public int f12612f;

        /* renamed from: g */
        public boolean f12613g;

        /* renamed from: h */
        public String f12614h;

        /* renamed from: i */
        public byte[] f12615i;

        /* renamed from: j */
        public C6140c f12616j;

        public C6139b(ConnectionBase connectionBase) {
        }
    }

    /* renamed from: com.yeelight.yeelib.device.connections.ConnectionBase$c */
    public interface C6140c {
        /* renamed from: a */
        void mo31814a();

        void onSuccess(byte[] bArr);
    }

    /* renamed from: com.yeelight.yeelib.device.connections.ConnectionBase$d */
    class C6141d extends Thread {

        /* renamed from: a */
        public Handler f12617a;

        C6141d(ConnectionBase connectionBase) {
        }

        /* renamed from: b */
        public void mo31816b(Runnable runnable) {
            this.f12617a.post(runnable);
        }

        public void run() {
            Looper.prepare();
            this.f12617a = new Handler();
            Looper.loop();
        }
    }

    public ConnectionBase() {
        C6141d dVar = new C6141d(this);
        this.f12603m = dVar;
        dVar.start();
        mo31798k();
    }

    /* renamed from: A */
    public abstract boolean mo31787A(String str, byte[] bArr, String str2);

    /* renamed from: a */
    public boolean mo31788a(C6139b bVar) {
        this.f12597g.lock();
        if (this.f12592b.peekLast() != null) {
            C6139b peek = this.f12592b.peek();
            int i = peek.f12607a;
            peek.f12607a = i + 1;
            bVar.f12607a = i;
        } else {
            bVar.f12607a = 0;
        }
        this.f12592b.add(bVar);
        BluetoothGattCharacteristic bluetoothGattCharacteristic = bVar.f12608b;
        if (bluetoothGattCharacteristic == null) {
            AppUtils.m8300u("MSG_QUEUE", "characteristic == null, tag: " + bVar.f12614h);
        } else if (bluetoothGattCharacteristic.getValue() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("data: ");
            sb.append(C8896a.m21230g(bVar.f12608b.getValue()));
        }
        this.f12597g.unlock();
        return true;
    }

    /* renamed from: b */
    public boolean mo31789b() {
        return (this.f12600j == null || this.f12601k == null || this.f12596f) ? false : true;
    }

    /* renamed from: c */
    public void mo31790c() {
        if (this.f12601k != null) {
            this.f12601k.close();
            this.f12601k = null;
        }
    }

    /* renamed from: d */
    public void mo31791d() {
        mo31792e(this.f12598h.mo23185G());
    }

    /* renamed from: e */
    public abstract boolean mo31792e(String str);

    /* renamed from: f */
    public void mo31793f() {
        mo31794g(this.f12598h.mo23185G());
    }

    /* renamed from: g */
    public void mo31794g(String str) {
        BluetoothAdapter bluetoothAdapter = this.f12600j;
        if (bluetoothAdapter != null) {
            int connectionState = this.f12599i.getConnectionState(bluetoothAdapter.getRemoteDevice(str), 7);
            BluetoothGatt bluetoothGatt = this.f12601k;
            if (bluetoothGatt == null) {
                return;
            }
            if (connectionState != 0) {
                bluetoothGatt.disconnect();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Attempt to disconnect in state: ");
            sb.append(connectionState);
        }
    }

    /* renamed from: h */
    public void mo31795h() {
        if (this.f12601k != null) {
            this.f12601k.discoverServices();
        }
    }

    /* renamed from: i */
    public void mo31796i() {
        this.f12597g.lock();
        if (this.f12594d != null) {
            try {
                this.f12594d.f12612f++;
                if (this.f12594d.f12612f > 150) {
                    this.f12594d.f12610d = BleRequestStatus.timeout;
                    this.f12594d = null;
                }
                Thread.sleep(10, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (!(this.f12592b == null || this.f12592b.size() == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("queue size: ");
            sb.append(this.f12592b.size());
            C6139b removeFirst = this.f12592b.removeFirst();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("request id: ");
            sb2.append(removeFirst.f12607a);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("request operation: ");
            sb3.append(removeFirst.f12609c);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("request tag: ");
            sb4.append(removeFirst.f12614h);
            BluetoothGattCharacteristic bluetoothGattCharacteristic = removeFirst.f12608b;
            if (bluetoothGattCharacteristic == null) {
                AppUtils.m8300u("MSG_QUEUE", "characteristic == null, tag: " + removeFirst.f12614h);
            } else if (bluetoothGattCharacteristic.getValue() != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("data: ");
                sb5.append(C8896a.m21230g(removeFirst.f12608b.getValue()));
            }
            int i = C6138a.f12606a[removeFirst.f12609c.ordinal()];
            if (i == 1) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("rdNonBlocking req: ");
                sb6.append(removeFirst.f12607a);
                this.f12593c.add(removeFirst);
                mo31807t(removeFirst);
            } else if (i == 2) {
                if (removeFirst.f12611e == 0) {
                    removeFirst.f12611e = 150;
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append("rdBlocking req: ");
                sb7.append(removeFirst.f12607a);
                removeFirst.f12612f = 0;
                this.f12594d = removeFirst;
                int r = mo31805r(removeFirst);
            } else if (i == 3) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("wrNonBlocking req: ");
                sb8.append(removeFirst.f12607a);
                this.f12593c.add(removeFirst);
                mo31808u(removeFirst);
            } else if (i == 4) {
                if (removeFirst.f12611e == 0) {
                    removeFirst.f12611e = 150;
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append("wrBlocking req: ");
                sb9.append(removeFirst.f12607a);
                this.f12594d = removeFirst;
                int s = mo31806s(removeFirst);
            } else if (i == 5) {
                if (removeFirst.f12611e == 0) {
                    removeFirst.f12611e = 150;
                }
                this.f12594d = removeFirst;
                int q = mo31804q(removeFirst);
            }
        }
        this.f12597g.unlock();
    }

    /* renamed from: j */
    public String mo31797j() {
        if (!AppUtils.m8288i()) {
            return this.f12600j.getAddress();
        }
        String replace = AppUtils.m8281b().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        return replace.length() > 12 ? replace.substring(0, 12) : replace;
    }

    /* renamed from: k */
    public boolean mo31798k() {
        if (this.f12599i == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) C3108x.f4951e.getSystemService("bluetooth");
            this.f12599i = bluetoothManager;
            if (bluetoothManager == null) {
                return false;
            }
        }
        BluetoothAdapter adapter = this.f12599i.getAdapter();
        this.f12600j = adapter;
        if (adapter == null) {
            return false;
        }
        this.f12592b = new LinkedList<>();
        this.f12593c = new LinkedList<>();
        return true;
    }

    /* renamed from: l */
    public BleRequestStatus mo31799l(C6139b bVar) {
        this.f12597g.lock();
        if (bVar == this.f12594d) {
            BleRequestStatus bleRequestStatus = this.f12594d.f12610d;
            if (bleRequestStatus == BleRequestStatus.done) {
                this.f12594d = null;
            }
            if (bleRequestStatus == BleRequestStatus.timeout) {
                this.f12594d = null;
            }
            if (bleRequestStatus == BleRequestStatus.failed) {
                this.f12594d = null;
            }
            this.f12597g.unlock();
            return bleRequestStatus;
        }
        this.f12597g.unlock();
        return BleRequestStatus.no_such_request;
    }

    /* renamed from: m */
    public int mo31800m(BluetoothGattCharacteristic bluetoothGattCharacteristic, C6140c cVar) {
        BleRequestStatus l;
        C6139b bVar = new C6139b(this);
        bVar.f12610d = BleRequestStatus.not_queued;
        bVar.f12608b = bluetoothGattCharacteristic;
        bVar.f12609c = BleRequestOperation.rdBlocking;
        bVar.f12616j = cVar;
        mo31788a(bVar);
        do {
            l = mo31799l(bVar);
            if (l == BleRequestStatus.done) {
                return 0;
            }
            if (l == BleRequestStatus.timeout) {
                return -1;
            }
        } while (l != BleRequestStatus.failed);
        return -3;
    }

    /* renamed from: n */
    public abstract int mo31801n(String str, C6140c cVar);

    /* renamed from: o */
    public void mo31802o() {
        if (this.f12601k != null) {
            this.f12601k.readRemoteRssi();
        }
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

    /* renamed from: q */
    public int mo31804q(C6139b bVar) {
        BluetoothGattDescriptor descriptor;
        StringBuilder sb = new StringBuilder();
        sb.append("sendBlockingNotifySetting req: ");
        sb.append(bVar.f12607a);
        bVar.f12610d = BleRequestStatus.processing;
        if (bVar.f12608b == null) {
            bVar.f12610d = BleRequestStatus.failed;
            String str = f12590n;
            AppUtils.m8300u(str, "sendBlockingNotifySetting, request.characteristic == null, request tag: " + bVar.f12614h);
            return -4;
        } else if (!mo31789b()) {
            return -2;
        } else {
            if (!this.f12601k.setCharacteristicNotification(bVar.f12608b, bVar.f12613g) || (descriptor = bVar.f12608b.getDescriptor(C9185b.f17008a)) == null) {
                return -3;
            }
            if (bVar.f12613g) {
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            } else {
                descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
            }
            this.f12596f = true;
            this.f12601k.writeDescriptor(descriptor);
            int i = 0;
            while (this.f12596f) {
                i++;
                mo31810w(1);
                if (i > 150) {
                    this.f12596f = false;
                    bVar.f12610d = BleRequestStatus.timeout;
                    return -1;
                }
            }
            bVar.f12610d = BleRequestStatus.done;
            return this.f12595e;
        }
    }

    /* renamed from: r */
    public int mo31805r(C6139b bVar) {
        bVar.f12610d = BleRequestStatus.processing;
        if (bVar.f12608b == null) {
            bVar.f12610d = BleRequestStatus.failed;
            String str = f12590n;
            AppUtils.m8300u(str, "sendBlockingReadRequest, request.characteristic == null, request tag: " + bVar.f12614h);
            return -4;
        } else if (!mo31789b()) {
            bVar.f12610d = BleRequestStatus.failed;
            return -2;
        } else {
            this.f12596f = true;
            this.f12601k.readCharacteristic(bVar.f12608b);
            int i = 0;
            while (this.f12596f) {
                i++;
                mo31810w(1);
                if (i > 150) {
                    this.f12596f = false;
                    bVar.f12610d = BleRequestStatus.timeout;
                    C6140c cVar = bVar.f12616j;
                    if (cVar == null) {
                        return -1;
                    }
                    cVar.mo31814a();
                    return -1;
                }
            }
            bVar.f12610d = BleRequestStatus.done;
            if (bVar.f12616j != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("request callback from blocking READ, value = ");
                sb.append(C8896a.m21230g(bVar.f12608b.getValue()));
                bVar.f12616j.onSuccess(bVar.f12608b.getValue());
            }
            return this.f12595e;
        }
    }

    /* renamed from: s */
    public int mo31806s(C6139b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendBlockingWriteRequest req: ");
        sb.append(bVar.f12607a);
        bVar.f12610d = BleRequestStatus.processing;
        if (bVar.f12608b == null) {
            bVar.f12610d = BleRequestStatus.failed;
            String str = f12590n;
            AppUtils.m8300u(str, "sendBlockingWriteRequest, request.characteristic == null, request tag: " + bVar.f12614h);
            return -4;
        } else if (!mo31789b()) {
            bVar.f12610d = BleRequestStatus.failed;
            return -2;
        } else {
            if (bVar.f12608b.getValue() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("sendBlockingWriteRequest write now, data: ");
                sb2.append(C8896a.m21230g(bVar.f12608b.getValue()));
            }
            this.f12596f = true;
            bVar.f12608b.setValue(bVar.f12615i);
            this.f12601k.writeCharacteristic(bVar.f12608b);
            int i = 0;
            while (this.f12596f) {
                i++;
                mo31810w(1);
                if (i > 150) {
                    this.f12596f = false;
                    bVar.f12610d = BleRequestStatus.timeout;
                    C6140c cVar = bVar.f12616j;
                    if (cVar == null) {
                        return -1;
                    }
                    cVar.mo31814a();
                    return -1;
                }
            }
            bVar.f12610d = BleRequestStatus.done;
            if (bVar.f12616j != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("request callback from blocking WRITING, value = ");
                sb3.append(C8896a.m21230g(bVar.f12608b.getValue()));
                bVar.f12616j.onSuccess(bVar.f12608b.getValue());
            }
            return this.f12595e;
        }
    }

    /* renamed from: t */
    public int mo31807t(C6139b bVar) {
        bVar.f12610d = BleRequestStatus.processing;
        if (bVar.f12608b == null) {
            bVar.f12610d = BleRequestStatus.failed;
            String str = f12590n;
            AppUtils.m8300u(str, "sendNonBlockingReadRequest, request.characteristic == null, request tag: " + bVar.f12614h);
            return -4;
        } else if (!mo31789b()) {
            bVar.f12610d = BleRequestStatus.failed;
            return -2;
        } else {
            this.f12601k.readCharacteristic(bVar.f12608b);
            return 0;
        }
    }

    /* renamed from: u */
    public int mo31808u(C6139b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendNonBlockingWriteRequest req: ");
        sb.append(bVar.f12607a);
        bVar.f12610d = BleRequestStatus.processing;
        if (bVar.f12608b == null) {
            bVar.f12610d = BleRequestStatus.failed;
            String str = f12590n;
            AppUtils.m8300u(str, "sendNonBlockingWriteRequest, request.characteristic == null, request tag: " + bVar.f12614h);
            return -4;
        } else if (!mo31789b()) {
            bVar.f12610d = BleRequestStatus.failed;
            return -2;
        } else {
            if (bVar.f12608b.getValue() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("sendNonBlockingWriteRequest write now, data: ");
                sb2.append(C8896a.m21230g(bVar.f12608b.getValue()));
            }
            bVar.f12608b.setValue(bVar.f12615i);
            this.f12601k.writeCharacteristic(bVar.f12608b);
            return 0;
        }
    }

    /* renamed from: v */
    public abstract boolean mo31809v(String str, boolean z, String str2);

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
    public abstract boolean mo31811x(String str, byte[] bArr);

    /* renamed from: y */
    public abstract boolean mo31812y(String str, byte[] bArr, String str2);

    /* renamed from: z */
    public abstract boolean mo31813z(String str, byte[] bArr, String str2, C6140c cVar);
}
