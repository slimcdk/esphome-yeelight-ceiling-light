package com.yeelight.yeelib.p150c.p179j;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.utils.C10538c;
import com.yeelight.yeelib.utils.C10539d;
import com.yeelight.yeelib.utils.C4308b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yeelight.yeelib.c.j.b */
public abstract class C6085b {

    /* renamed from: n */
    private static String f12937n = "b";

    /* renamed from: a */
    protected boolean f12938a = false;

    /* renamed from: b */
    volatile LinkedList<C6087b> f12939b;

    /* renamed from: c */
    volatile LinkedList<C6087b> f12940c;

    /* renamed from: d */
    volatile C6087b f12941d = null;

    /* renamed from: e */
    volatile int f12942e = 0;

    /* renamed from: f */
    volatile boolean f12943f = false;

    /* renamed from: g */
    final Lock f12944g = new ReentrantLock();

    /* renamed from: h */
    C5972a f12945h;

    /* renamed from: i */
    BluetoothManager f12946i = null;

    /* renamed from: j */
    BluetoothAdapter f12947j = null;

    /* renamed from: k */
    BluetoothGatt f12948k = null;

    /* renamed from: l */
    String f12949l;

    /* renamed from: m */
    protected C6091f f12950m;

    /* renamed from: com.yeelight.yeelib.c.j.b$a */
    static /* synthetic */ class C6086a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12951a;

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
                com.yeelight.yeelib.c.j.b$c[] r0 = com.yeelight.yeelib.p150c.p179j.C6085b.C6088c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12951a = r0
                com.yeelight.yeelib.c.j.b$c r1 = com.yeelight.yeelib.p150c.p179j.C6085b.C6088c.rd     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12951a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.c.j.b$c r1 = com.yeelight.yeelib.p150c.p179j.C6085b.C6088c.rdBlocking     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12951a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.c.j.b$c r1 = com.yeelight.yeelib.p150c.p179j.C6085b.C6088c.wr     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12951a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.c.j.b$c r1 = com.yeelight.yeelib.p150c.p179j.C6085b.C6088c.wrBlocking     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12951a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yeelight.yeelib.c.j.b$c r1 = com.yeelight.yeelib.p150c.p179j.C6085b.C6088c.nsBlocking     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p179j.C6085b.C6086a.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.j.b$b */
    public class C6087b {

        /* renamed from: a */
        public int f12952a;

        /* renamed from: b */
        public BluetoothGattCharacteristic f12953b;

        /* renamed from: c */
        public C6088c f12954c;

        /* renamed from: d */
        public volatile C6089d f12955d;

        /* renamed from: e */
        public int f12956e;

        /* renamed from: f */
        public int f12957f;

        /* renamed from: g */
        public boolean f12958g;

        /* renamed from: h */
        public String f12959h;

        /* renamed from: i */
        public byte[] f12960i;

        /* renamed from: j */
        public C6090e f12961j;

        public C6087b(C6085b bVar) {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.j.b$c */
    public enum C6088c {
        wrBlocking,
        wr,
        rdBlocking,
        rd,
        nsBlocking
    }

    /* renamed from: com.yeelight.yeelib.c.j.b$d */
    public enum C6089d {
        not_queued,
        queued,
        processing,
        timeout,
        done,
        no_such_request,
        failed
    }

    /* renamed from: com.yeelight.yeelib.c.j.b$e */
    public interface C6090e {
        /* renamed from: a */
        void mo27916a();

        void onSuccess(byte[] bArr);
    }

    /* renamed from: com.yeelight.yeelib.c.j.b$f */
    class C6091f extends Thread {

        /* renamed from: a */
        public Handler f12976a;

        C6091f(C6085b bVar) {
        }

        /* renamed from: b */
        public void mo27918b(Runnable runnable) {
            this.f12976a.post(runnable);
        }

        public void run() {
            Looper.prepare();
            this.f12976a = new Handler();
            Looper.loop();
        }
    }

    public C6085b() {
        C6091f fVar = new C6091f(this);
        this.f12950m = fVar;
        fVar.start();
        mo27907k();
    }

    /* renamed from: A */
    public abstract boolean mo27868A(String str, byte[] bArr, String str2);

    /* renamed from: a */
    public boolean mo27902a(C6087b bVar) {
        this.f12944g.lock();
        if (this.f12939b.peekLast() != null) {
            C6087b peek = this.f12939b.peek();
            int i = peek.f12952a;
            peek.f12952a = i + 1;
            bVar.f12952a = i;
        } else {
            bVar.f12952a = 0;
        }
        this.f12939b.add(bVar);
        BluetoothGattCharacteristic bluetoothGattCharacteristic = bVar.f12953b;
        if (bluetoothGattCharacteristic == null) {
            C4308b.m12139r("MSG_QUEUE", "characteristic == null, tag: " + bVar.f12959h);
        } else if (bluetoothGattCharacteristic.getValue() != null) {
            "data: " + C10539d.m25676g(bVar.f12953b.getValue());
        }
        this.f12944g.unlock();
        return true;
    }

    /* renamed from: b */
    public boolean mo27903b() {
        return (this.f12947j == null || this.f12948k == null || this.f12943f) ? false : true;
    }

    /* renamed from: c */
    public void mo27873c() {
        if (this.f12948k != null) {
            this.f12948k.close();
            this.f12948k = null;
        }
    }

    /* renamed from: d */
    public void mo27874d() {
        mo27875e(this.f12945h.mo23372G());
    }

    /* renamed from: e */
    public abstract boolean mo27875e(String str);

    /* renamed from: f */
    public void mo27904f() {
        mo27905g(this.f12945h.mo23372G());
    }

    /* renamed from: g */
    public void mo27905g(String str) {
        BluetoothAdapter bluetoothAdapter = this.f12947j;
        if (bluetoothAdapter != null) {
            int connectionState = this.f12946i.getConnectionState(bluetoothAdapter.getRemoteDevice(str), 7);
            BluetoothGatt bluetoothGatt = this.f12948k;
            if (bluetoothGatt == null) {
                return;
            }
            if (connectionState != 0) {
                bluetoothGatt.disconnect();
                return;
            }
            "Attempt to disconnect in state: " + connectionState;
        }
    }

    /* renamed from: h */
    public void mo27876h() {
        if (this.f12948k != null) {
            this.f12948k.discoverServices();
        }
    }

    /* renamed from: i */
    public void mo27906i() {
        this.f12944g.lock();
        if (this.f12941d != null) {
            try {
                this.f12941d.f12957f++;
                if (this.f12941d.f12957f > 150) {
                    this.f12941d.f12955d = C6089d.timeout;
                    this.f12941d = null;
                }
                Thread.sleep(10, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (!(this.f12939b == null || this.f12939b.size() == 0)) {
            "queue size: " + this.f12939b.size();
            C6087b removeFirst = this.f12939b.removeFirst();
            "request id: " + removeFirst.f12952a;
            "request operation: " + removeFirst.f12954c;
            "request tag: " + removeFirst.f12959h;
            BluetoothGattCharacteristic bluetoothGattCharacteristic = removeFirst.f12953b;
            if (bluetoothGattCharacteristic == null) {
                C4308b.m12139r("MSG_QUEUE", "characteristic == null, tag: " + removeFirst.f12959h);
            } else if (bluetoothGattCharacteristic.getValue() != null) {
                "data: " + C10539d.m25676g(removeFirst.f12953b.getValue());
            }
            int i = C6086a.f12951a[removeFirst.f12954c.ordinal()];
            if (i == 1) {
                "rdNonBlocking req: " + removeFirst.f12952a;
                this.f12940c.add(removeFirst);
                mo27914t(removeFirst);
            } else if (i == 2) {
                if (removeFirst.f12956e == 0) {
                    removeFirst.f12956e = 150;
                }
                "rdBlocking req: " + removeFirst.f12952a;
                removeFirst.f12957f = 0;
                this.f12941d = removeFirst;
                int r = mo27912r(removeFirst);
            } else if (i == 3) {
                "wrNonBlocking req: " + removeFirst.f12952a;
                this.f12940c.add(removeFirst);
                mo27915u(removeFirst);
            } else if (i == 4) {
                if (removeFirst.f12956e == 0) {
                    removeFirst.f12956e = 150;
                }
                "wrBlocking req: " + removeFirst.f12952a;
                this.f12941d = removeFirst;
                int s = mo27913s(removeFirst);
            } else if (i == 5) {
                if (removeFirst.f12956e == 0) {
                    removeFirst.f12956e = 150;
                }
                this.f12941d = removeFirst;
                int q = mo27911q(removeFirst);
            }
        }
        this.f12944g.unlock();
    }

    /* renamed from: j */
    public String mo27877j() {
        if (!C4308b.m12129h()) {
            return this.f12947j.getAddress();
        }
        String replace = C4308b.m12123b().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        return replace.length() > 12 ? replace.substring(0, 12) : replace;
    }

    /* renamed from: k */
    public boolean mo27907k() {
        if (this.f12946i == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) C4297y.f7456e.getSystemService("bluetooth");
            this.f12946i = bluetoothManager;
            if (bluetoothManager == null) {
                return false;
            }
        }
        BluetoothAdapter adapter = this.f12946i.getAdapter();
        this.f12947j = adapter;
        if (adapter == null) {
            return false;
        }
        this.f12939b = new LinkedList<>();
        this.f12940c = new LinkedList<>();
        return true;
    }

    /* renamed from: l */
    public C6089d mo27908l(C6087b bVar) {
        this.f12944g.lock();
        if (bVar == this.f12941d) {
            C6089d dVar = this.f12941d.f12955d;
            if (dVar == C6089d.done) {
                this.f12941d = null;
            }
            if (dVar == C6089d.timeout) {
                this.f12941d = null;
            }
            if (dVar == C6089d.failed) {
                this.f12941d = null;
            }
            this.f12944g.unlock();
            return dVar;
        }
        this.f12944g.unlock();
        return C6089d.no_such_request;
    }

    /* renamed from: m */
    public int mo27909m(BluetoothGattCharacteristic bluetoothGattCharacteristic, C6090e eVar) {
        C6089d l;
        C6087b bVar = new C6087b(this);
        bVar.f12955d = C6089d.not_queued;
        bVar.f12953b = bluetoothGattCharacteristic;
        bVar.f12954c = C6088c.rdBlocking;
        bVar.f12961j = eVar;
        mo27902a(bVar);
        do {
            l = mo27908l(bVar);
            if (l == C6089d.done) {
                return 0;
            }
            if (l == C6089d.timeout) {
                return -1;
            }
        } while (l != C6089d.failed);
        return -3;
    }

    /* renamed from: n */
    public abstract int mo27878n(String str, C6090e eVar);

    /* renamed from: o */
    public void mo27910o() {
        if (this.f12948k != null) {
            this.f12948k.readRemoteRssi();
        }
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

    /* renamed from: q */
    public int mo27911q(C6087b bVar) {
        BluetoothGattDescriptor descriptor;
        "sendBlockingNotifySetting req: " + bVar.f12952a;
        bVar.f12955d = C6089d.processing;
        if (bVar.f12953b == null) {
            bVar.f12955d = C6089d.failed;
            C4308b.m12139r(f12937n, "sendBlockingNotifySetting, request.characteristic == null, request tag: " + bVar.f12959h);
            return -4;
        } else if (!mo27903b()) {
            return -2;
        } else {
            if (!this.f12948k.setCharacteristicNotification(bVar.f12953b, bVar.f12958g) || (descriptor = bVar.f12953b.getDescriptor(C10538c.f20161a)) == null) {
                return -3;
            }
            if (bVar.f12958g) {
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            } else {
                descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
            }
            this.f12943f = true;
            this.f12948k.writeDescriptor(descriptor);
            int i = 0;
            while (this.f12943f) {
                i++;
                mo27881w(1);
                if (i > 150) {
                    this.f12943f = false;
                    bVar.f12955d = C6089d.timeout;
                    return -1;
                }
            }
            bVar.f12955d = C6089d.done;
            return this.f12942e;
        }
    }

    /* renamed from: r */
    public int mo27912r(C6087b bVar) {
        bVar.f12955d = C6089d.processing;
        if (bVar.f12953b == null) {
            bVar.f12955d = C6089d.failed;
            C4308b.m12139r(f12937n, "sendBlockingReadRequest, request.characteristic == null, request tag: " + bVar.f12959h);
            return -4;
        } else if (!mo27903b()) {
            bVar.f12955d = C6089d.failed;
            return -2;
        } else {
            this.f12943f = true;
            this.f12948k.readCharacteristic(bVar.f12953b);
            int i = 0;
            while (this.f12943f) {
                i++;
                mo27881w(1);
                if (i > 150) {
                    this.f12943f = false;
                    bVar.f12955d = C6089d.timeout;
                    C6090e eVar = bVar.f12961j;
                    if (eVar == null) {
                        return -1;
                    }
                    eVar.mo27916a();
                    return -1;
                }
            }
            bVar.f12955d = C6089d.done;
            if (bVar.f12961j != null) {
                "request callback from blocking READ, value = " + C10539d.m25676g(bVar.f12953b.getValue());
                bVar.f12961j.onSuccess(bVar.f12953b.getValue());
            }
            return this.f12942e;
        }
    }

    /* renamed from: s */
    public int mo27913s(C6087b bVar) {
        "sendBlockingWriteRequest req: " + bVar.f12952a;
        bVar.f12955d = C6089d.processing;
        if (bVar.f12953b == null) {
            bVar.f12955d = C6089d.failed;
            C4308b.m12139r(f12937n, "sendBlockingWriteRequest, request.characteristic == null, request tag: " + bVar.f12959h);
            return -4;
        } else if (!mo27903b()) {
            bVar.f12955d = C6089d.failed;
            return -2;
        } else {
            if (bVar.f12953b.getValue() != null) {
                "sendBlockingWriteRequest write now, data: " + C10539d.m25676g(bVar.f12953b.getValue());
            }
            this.f12943f = true;
            bVar.f12953b.setValue(bVar.f12960i);
            this.f12948k.writeCharacteristic(bVar.f12953b);
            int i = 0;
            while (this.f12943f) {
                i++;
                mo27881w(1);
                if (i > 150) {
                    this.f12943f = false;
                    bVar.f12955d = C6089d.timeout;
                    C6090e eVar = bVar.f12961j;
                    if (eVar == null) {
                        return -1;
                    }
                    eVar.mo27916a();
                    return -1;
                }
            }
            bVar.f12955d = C6089d.done;
            if (bVar.f12961j != null) {
                "request callback from blocking WRITING, value = " + C10539d.m25676g(bVar.f12953b.getValue());
                bVar.f12961j.onSuccess(bVar.f12953b.getValue());
            }
            return this.f12942e;
        }
    }

    /* renamed from: t */
    public int mo27914t(C6087b bVar) {
        bVar.f12955d = C6089d.processing;
        if (bVar.f12953b == null) {
            bVar.f12955d = C6089d.failed;
            String str = f12937n;
            C4308b.m12139r(str, "sendNonBlockingReadRequest, request.characteristic == null, request tag: " + bVar.f12959h);
            return -4;
        } else if (!mo27903b()) {
            bVar.f12955d = C6089d.failed;
            return -2;
        } else {
            this.f12948k.readCharacteristic(bVar.f12953b);
            return 0;
        }
    }

    /* renamed from: u */
    public int mo27915u(C6087b bVar) {
        "sendNonBlockingWriteRequest req: " + bVar.f12952a;
        bVar.f12955d = C6089d.processing;
        if (bVar.f12953b == null) {
            bVar.f12955d = C6089d.failed;
            C4308b.m12139r(f12937n, "sendNonBlockingWriteRequest, request.characteristic == null, request tag: " + bVar.f12959h);
            return -4;
        } else if (!mo27903b()) {
            bVar.f12955d = C6089d.failed;
            return -2;
        } else {
            if (bVar.f12953b.getValue() != null) {
                "sendNonBlockingWriteRequest write now, data: " + C10539d.m25676g(bVar.f12953b.getValue());
            }
            bVar.f12953b.setValue(bVar.f12960i);
            this.f12948k.writeCharacteristic(bVar.f12953b);
            return 0;
        }
    }

    /* renamed from: v */
    public abstract boolean mo27880v(String str, boolean z, String str2);

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
    public abstract boolean mo27882x(String str, byte[] bArr);

    /* renamed from: y */
    public abstract boolean mo27883y(String str, byte[] bArr, String str2);

    /* renamed from: z */
    public abstract boolean mo27884z(String str, byte[] bArr, String str2, C6090e eVar);
}
