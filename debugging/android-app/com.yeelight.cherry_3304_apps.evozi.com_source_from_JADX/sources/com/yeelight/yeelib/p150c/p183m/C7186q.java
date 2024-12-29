package com.yeelight.yeelib.p150c.p183m;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.view.View;
import android.widget.Toast;
import com.miot.common.device.Device;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7610a;
import com.yeelight.yeelib.device.models.C7612b;
import com.yeelight.yeelib.device.models.C7614c;
import com.yeelight.yeelib.device.models.C7616d;
import com.yeelight.yeelib.device.models.C7618e;
import com.yeelight.yeelib.device.models.C7636l0;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p180k.C6102a;
import com.yeelight.yeelib.p150c.p184n.C7551c;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.p150c.p184n.C7558h;
import com.yeelight.yeelib.p150c.p184n.C7561k;
import com.yeelight.yeelib.p152f.C4214g;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p178b.C5968a;
import com.yeelight.yeelib.p178b.C5969b;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C10539d;
import com.yeelight.yeelib.utils.C10540e;
import com.yeelight.yeelib.utils.C10551r;
import com.yeelight.yeelib.utils.C4308b;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.c.m.q */
public class C7186q extends C5972a {

    /* renamed from: T */
    public static final String f14674T = "q";

    /* renamed from: A */
    private final byte[] f14675A;

    /* renamed from: B */
    public boolean f14676B;

    /* renamed from: G */
    public boolean f14677G;

    /* renamed from: H */
    private Timer f14678H;

    /* renamed from: I */
    private C7191e f14679I;

    /* renamed from: J */
    private int f14680J;

    /* renamed from: K */
    private C7197j f14681K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C7196i f14682L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C7192f f14683M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public String f14684N;

    /* renamed from: O */
    private StringBuffer f14685O;

    /* renamed from: P */
    private List<C7556g.C7557a> f14686P;

    /* renamed from: Q */
    private List<C7561k> f14687Q;

    /* renamed from: R */
    private C7193g f14688R;

    /* renamed from: S */
    public int f14689S;

    /* renamed from: z */
    private final byte[] f14690z;

    /* renamed from: com.yeelight.yeelib.c.m.q$a */
    class C7187a implements Runnable {
        C7187a() {
        }

        public void run() {
            C7186q.this.f12658x.mo27968d();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.q$b */
    class C7188b implements Runnable {
        C7188b() {
        }

        public void run() {
            boolean h = C7186q.this.f12658x.mo27972h();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.q$c */
    class C7189c implements C9874b<String> {
        C7189c(C7186q qVar) {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String str2 = C7186q.f14674T;
            "upgradeSuccess rst = " + str;
        }

        public void onFailure(int i, String str) {
            String str2 = C7186q.f14674T;
            "ota finish log fail message = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.q$d */
    class C7190d implements C9874b<String> {
        C7190d() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            try {
                String unused = C7186q.this.f14684N = new JSONObject(str).getString("transaction_id");
                C7186q.this.f12658x.mo27973i();
            } catch (JSONException e) {
                e.printStackTrace();
                C7186q.this.mo23371F0(10);
            }
        }

        public void onFailure(int i, String str) {
            C7186q.this.mo23371F0(10);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.q$e */
    public class C7191e extends TimerTask {
        public C7191e() {
        }

        public void run() {
            "ConnectTask is running now! cur state: " + C7186q.this.f7253p;
            if (!(C7186q.this.f7253p == 1 || C7186q.this.f7253p == 0)) {
                if (C7186q.this.f7253p == 2) {
                    C7186q.this.mo23371F0(1);
                } else {
                    return;
                }
            }
            C7186q.this.mo23337n();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.q$f */
    private class C7192f {

        /* renamed from: a */
        short f14695a;

        /* renamed from: b */
        int f14696b;

        /* renamed from: c */
        Character f14697c;

        /* renamed from: d */
        byte[] f14698d;

        private C7192f(C7186q qVar) {
            this.f14698d = new byte[4];
        }

        /* synthetic */ C7192f(C7186q qVar, C7187a aVar) {
            this(qVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.q$g */
    class C7193g extends Thread {

        /* renamed from: a */
        public Handler f14699a;

        /* renamed from: com.yeelight.yeelib.c.m.q$g$a */
        class C7194a extends Handler {
            C7194a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    int h2 = C7186q.this.f7253p;
                    if (h2 == 0) {
                        return;
                    }
                    if (h2 == 9) {
                        C7186q.this.mo28629t2(true);
                    } else if (h2 != 12) {
                        C7186q.this.mo23342r();
                    } else {
                        C7186q.this.mo23371F0(0);
                    }
                } else if (i == 2) {
                    C7186q.this.mo23371F0(0);
                }
            }
        }

        C7193g() {
        }

        /* renamed from: b */
        public void mo28638b(Runnable runnable) {
            Handler handler = this.f14699a;
            if (handler == null) {
                mo28639c(runnable, 1000);
            } else {
                handler.post(runnable);
            }
        }

        /* renamed from: c */
        public void mo28639c(Runnable runnable, int i) {
            Handler handler = this.f14699a;
            if (handler == null) {
                mo28639c(runnable, 1000);
            } else {
                handler.postDelayed(runnable, (long) i);
            }
        }

        /* renamed from: d */
        public void mo28640d(int i) {
            this.f14699a.removeMessages(i);
        }

        /* renamed from: e */
        public void mo28641e(int i, int i2) {
            this.f14699a.sendEmptyMessageDelayed(i, (long) i2);
        }

        public void run() {
            Looper.prepare();
            this.f14699a = new C7194a();
            Looper.loop();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.q$h */
    private class C7195h implements Runnable {
        private C7195h() {
        }

        /* synthetic */ C7195h(C7186q qVar, C7187a aVar) {
            this();
        }

        public void run() {
            C7186q.this.f14682L.mo28646b();
            C7186q.this.f14677G = true;
            int h = C4214g.m11665j().mo23493h();
            "get block interval from firmware manager -> " + h;
            while (true) {
                C7186q qVar = C7186q.this;
                if (qVar.f14677G) {
                    try {
                        Thread.sleep((long) ((qVar.f14689S * 200) + 20));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int i = 0;
                    while (true) {
                        boolean z = i < 4;
                        C7186q qVar2 = C7186q.this;
                        if (z && qVar2.f14677G) {
                            qVar2.m21212B2();
                            try {
                                Thread.sleep((long) h);
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                            i++;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.q$i */
    private class C7196i {

        /* renamed from: a */
        int f14703a;

        /* renamed from: b */
        int f14704b;

        /* renamed from: c */
        short f14705c;

        /* renamed from: d */
        short f14706d;

        private C7196i() {
            this.f14703a = 0;
            this.f14704b = 0;
            this.f14705c = 0;
            this.f14706d = 0;
        }

        /* synthetic */ C7196i(C7186q qVar, C7187a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo28645a() {
            this.f14703a = 100;
            this.f14704b = 0;
            this.f14705c = 0;
            this.f14706d = (short) (C7186q.this.f14683M.f14696b / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo28646b() {
            "############# OAD upgrade, progress reset, blocks total count: " + this.f14706d;
            this.f14703a = 0;
            this.f14704b = 0;
            this.f14705c = 0;
            this.f14706d = (short) (C7186q.this.f14683M.f14696b / 4);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.q$j */
    public class C7197j {

        /* renamed from: a */
        public int f14708a = 0;

        /* renamed from: b */
        public int f14709b = 0;

        /* renamed from: c */
        public int f14710c = 1;

        public C7197j(C7186q qVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo28647a() {
            this.f14708a = 100;
            this.f14709b = 0;
            this.f14710c = 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo28648b() {
            this.f14708a = 0;
            this.f14709b = 0;
            this.f14710c = 1;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.q$k */
    class C7198k implements MessageQueue.IdleHandler {
        C7198k() {
        }

        public boolean queueIdle() {
            String str = C7186q.f14674T;
            C7186q.this.f12658x.mo27980p();
            C7186q.this.f12658x.mo27984t();
            C7186q.this.f12658x.mo27985u();
            C7186q.this.mo28617A2();
            return false;
        }
    }

    public C7186q(String str, String str2, Device.Ownership ownership, boolean z) {
        this(str, str2, ownership, z, (String) null);
    }

    public C7186q(String str, String str2, Device.Ownership ownership, boolean z, String str3) {
        super(str, "yeelink.light.ble1", new C7551c(str3));
        this.f14690z = new byte[262144];
        this.f14675A = new byte[512];
        this.f14676B = false;
        this.f14677G = false;
        this.f14681K = new C7197j(this);
        this.f14682L = new C7196i(this, (C7187a) null);
        this.f14683M = new C7192f(this, (C7187a) null);
        this.f14686P = new ArrayList();
        this.f14687Q = new ArrayList();
        C7193g gVar = new C7193g();
        this.f14688R = gVar;
        this.f14689S = 0;
        gVar.start();
        mo23386O0(ownership);
        mo23408d0().mo27646J0(z);
        mo23381L0(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public void m21212B2() {
        byte[] bArr = new byte[18];
        if (this.f14677G) {
            C7196i iVar = this.f14682L;
            if (iVar.f14705c < iVar.f14706d) {
                this.f14677G = true;
                "oad upgrade, send block: " + this.f14682L.f14705c;
                bArr[0] = m21236x2(this.f14682L.f14705c);
                bArr[1] = m21235w2(this.f14682L.f14705c);
                System.arraycopy(this.f14690z, this.f14682L.f14704b, bArr, 2, 16);
                if (this.f12658x.mo27946H(bArr)) {
                    C7196i iVar2 = this.f14682L;
                    short s = (short) (iVar2.f14705c + 1);
                    iVar2.f14705c = s;
                    int i = iVar2.f14704b + 16;
                    iVar2.f14704b = i;
                    this.f14689S = 0;
                    if (s % 100 == 0) {
                        iVar2.f14703a = (int) Math.ceil((double) ((((float) i) / (((float) this.f14683M.f14696b) * 4.0f)) * 100.0f));
                    }
                } else {
                    int i2 = this.f14689S;
                    if (i2 < 3) {
                        int i3 = i2 + 1;
                        this.f14689S = i3;
                        try {
                            Thread.sleep((long) (i3 * 20));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        m21212B2();
                    } else {
                        this.f14689S = 0;
                        this.f14677G = false;
                    }
                }
                if (!this.f14677G) {
                    mo28621F2();
                    return;
                }
                return;
            }
            "oad upgrade, all blocks done! blocks: " + this.f14682L.f14705c;
            this.f14677G = false;
            mo28626q2();
        }
    }

    /* renamed from: p2 */
    public static short m21233p2(byte b, byte b2) {
        return (short) ((b << 8) + (b2 & 255));
    }

    /* renamed from: v2 */
    private C7616d m21234v2() {
        return ((C7551c) mo23408d0()).mo28870X0();
    }

    /* renamed from: w2 */
    public static byte m21235w2(short s) {
        return (byte) (s >> 8);
    }

    /* renamed from: x2 */
    public static byte m21236x2(short s) {
        return (byte) (s & 255);
    }

    /* renamed from: A2 */
    public boolean mo28617A2() {
        this.f12658x.mo27943E(C10540e.m25694K());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public void mo27474C1() {
        C6102a aVar = new C6102a(this);
        this.f12658x = aVar;
        this.f7261w = new C5968a(aVar);
        mo23365B0(this);
        mo27486O1(this);
    }

    /* renamed from: C2 */
    public boolean mo28618C2() {
        while (true) {
            C7197j jVar = this.f14681K;
            int i = jVar.f14710c;
            if (i > 32) {
                return this.f12658x.mo27965a();
            }
            byte[] bArr = new byte[18];
            bArr[0] = Byte.MIN_VALUE;
            bArr[1] = 3;
            System.arraycopy(this.f14690z, (((jVar.f14709b * 32) + i) - 1) * 16, bArr, 2, 16);
            System.arraycopy(bArr, 2, this.f14675A, (this.f14681K.f14710c - 1) * 16, 16);
            if (!this.f12658x.mo27976l(bArr)) {
                return false;
            }
            C7197j jVar2 = this.f14681K;
            jVar2.f14708a = (int) Math.ceil((double) (((((float) ((jVar2.f14709b * 32) + jVar2.f14710c)) * 1.0f) / ((float) this.f14680J)) * 100.0f));
            "Mcu OTA update in progress......" + this.f14681K.f14708a + "%";
            try {
                Thread.sleep((long) 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f14681K.f14710c++;
        }
    }

    /* renamed from: D1 */
    public void mo27475D1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    /* renamed from: D2 */
    public boolean mo28619D2() {
        if (!mo28631y2()) {
            return false;
        }
        byte[] bArr = new byte[12];
        bArr[0] = m21236x2(this.f14683M.f14695a);
        bArr[1] = m21235w2(this.f14683M.f14695a);
        bArr[2] = m21236x2((short) this.f14683M.f14696b);
        bArr[3] = m21235w2((short) this.f14683M.f14696b);
        System.arraycopy(this.f14683M.f14698d, 0, bArr, 4, 4);
        this.f12658x.mo27957S(bArr);
        return true;
    }

    /* renamed from: E1 */
    public void mo27476E1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        "characteristic: " + bluetoothGattCharacteristic.getUuid().toString() + ", write succeed status: " + i;
        if (bluetoothGattCharacteristic.getUuid().toString().equals("f000ffc1-0451-4000-b000-000000000000")) {
            new Thread(new C7195h(this, (C7187a) null)).start();
        }
    }

    /* renamed from: E2 */
    public boolean mo28620E2() {
        boolean z2 = mo28632z2();
        "start ota, load mcu file succeed? " + z2;
        return z2 && this.f12658x.mo27959U(this.f14681K.f14709b);
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_cherry_small;
    }

    /* renamed from: F1 */
    public void mo27477F1() {
        if (this.f7253p == 2 && this.f7254q == 1) {
            this.f12658x.mo27988y();
        }
        this.f12658x.mo27971g();
        Timer timer = this.f14678H;
        if (timer != null) {
            timer.cancel();
            this.f14678H = null;
        }
        C7191e eVar = this.f14679I;
        if (eVar != null) {
            eVar.cancel();
            this.f14679I = null;
        }
        mo23371F0(3);
    }

    /* renamed from: F2 */
    public void mo28621F2() {
        this.f14677G = false;
        if (this.f7253p != 0) {
            mo23342r();
        }
        this.f14682L.mo28646b();
    }

    /* renamed from: G1 */
    public void mo27478G1() {
        this.f14688R.mo28640d(1);
        if (this.f14676B) {
            mo28622G2();
        }
        if (this.f14677G) {
            mo28621F2();
        }
        if (this.f7253p == 9) {
            mo23371F0(1);
            this.f7261w.mo27472e(C5969b.C5970a.AUTH_UNKNOWN);
            this.f14678H = new Timer();
            C7191e eVar = new C7191e();
            this.f14679I = eVar;
            this.f14678H.schedule(eVar, 3000, 10000);
            return;
        }
        mo23371F0(0);
        this.f7261w.mo27472e(C5969b.C5970a.AUTH_UNKNOWN);
    }

    /* renamed from: G2 */
    public void mo28622G2() {
        this.f14676B = false;
        this.f14681K.mo28648b();
        mo23371F0(10);
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_cherry_big;
    }

    /* renamed from: H1 */
    public void mo27479H1(C7636l0 l0Var) {
        C7561k kVar;
        MessageQueue myQueue;
        C7198k kVar2;
        C7636l0 l0Var2 = l0Var;
        "CherryDevice, onNotification " + C7610a.m22470b(l0Var2.f15575a) + "  " + C10539d.m25676g(l0Var.mo29081a());
        byte[] a = l0Var.mo29081a();
        if (l0Var2.f15575a.equals(C7610a.AUTHORIZATIONNOTIFICATION.f15566a)) {
            "onNotification, auth:" + (a[0] & 255);
            byte b = a[0] & 255;
            if (b != 3 || !mo23331k0()) {
                this.f7261w.mo27468a(b);
                return;
            }
            return;
        }
        if (l0Var2.f15575a.equals(C7610a.STATUSNOTIFITATION.f15566a)) {
            mo23408d0().mo27648K0(a[0] == 1);
            if (!(a[0] == 1 || ((C7554e) mo23408d0().mo27710r(2)) == null)) {
                mo23408d0().mo27670V0(-1);
            }
            if (a[1] == 2) {
                mo23408d0().mo27697k0((long) (a[6] & 255));
                mo23408d0().mo27630B0(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
                mo23408d0().mo27707p0((a[7] << 8) + (a[8] & 255));
            } else if (a[1] == 1) {
                mo23408d0().mo27697k0((long) (a[6] & 255));
                mo23408d0().mo27630B0(C6024e.C6028d.DEVICE_MODE_COLOR);
                mo23408d0().mo27699l0(Color.rgb(a[2] & 255, a[3] & 255, a[4] & 255));
            } else if (a[1] == 3) {
                mo23408d0().mo27697k0((long) (a[6] & 255));
                mo23408d0().mo27630B0(C6024e.C6028d.DEVICE_MODE_FLOW);
                if (this.f7253p == 10) {
                    this.f14686P.clear();
                    this.f12658x.mo27978n();
                    return;
                }
                return;
            }
            "onNotification, device status, power: " + mo23408d0().mo27681c0() + ", mode: " + mo23408d0().mo27726z() + "  " + a[1];
            if (this.f7253p == 10) {
                mo23371F0(11);
                myQueue = Looper.myQueue();
                kVar2 = new C7198k();
            } else {
                return;
            }
        } else if (l0Var2.f15575a.equals(C7610a.COLORFLOWNOTIFICATION.f15566a)) {
            "color flow read notification! index: " + (a[0] & 255);
            if (a[0] == 1) {
                mo23408d0().mo27707p0((a[9] << 8) + (a[10] & 255));
                return;
            } else if (a[0] == 2) {
                short e = C10539d.m25674e(a[11], a[12]);
                StringBuilder sb = new StringBuilder();
                sb.append("cherry read color flow interval = ");
                int i = e * 1000;
                sb.append(i);
                sb.toString();
                this.f14686P.add(new C7556g.C7557a(Color.rgb(a[4] & 255, a[5] & 255, a[6] & 255), i));
                return;
            } else if (a[0] == 3) {
                mo23408d0().mo27699l0(Color.rgb(a[4] & 255, a[5] & 255, a[6] & 255));
                return;
            } else if (a[0] == -1 && this.f14686P.size() != 0) {
                mo23408d0().mo27701m0(this.f14686P);
                this.f14686P.clear();
                if (this.f7253p == 10) {
                    mo23371F0(11);
                    myQueue = Looper.myQueue();
                    kVar2 = new C7198k();
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (l0Var2.f15575a.equals(C7610a.VERSIONNOTIFICATION.f15566a)) {
            mo23378J0(C10539d.m25681l(a));
            "onNotification, device firmware version: " + mo23384N().mo29039b();
            if (!((C7614c) mo23384N()).mo29058w()) {
                mo23371F0(10);
                return;
            } else if (this.f14684N == null && !C4308b.f7482a) {
                C10551r.m25769a(this, new C7190d());
                return;
            } else {
                this.f12658x.mo27973i();
                return;
            }
        } else {
            String str = "";
            if (l0Var2.f15575a.equals(C7610a.LIGHTNAMENOTIFICATION.f15566a)) {
                byte b2 = a[1] & 255;
                int i2 = a[2] & 255;
                if (b2 == 0) {
                    this.f14685O = new StringBuffer();
                    if (i2 <= 13) {
                        byte[] bArr = new byte[i2];
                        System.arraycopy(a, 3, bArr, 0, i2);
                        str = C10539d.m25676g(bArr);
                    }
                    this.f14685O.append(str);
                    return;
                } else if (b2 == 1 && this.f14685O != null) {
                    if (i2 <= 13) {
                        byte[] bArr2 = new byte[i2];
                        System.arraycopy(a, 3, bArr2, 0, i2);
                        str = C10539d.m25676g(bArr2);
                    }
                    this.f14685O.append(str);
                    String j = C10539d.m25679j(this.f14685O.toString());
                    this.f14685O = null;
                    if (j != null) {
                        mo23385N0(j);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            } else if (l0Var2.f15575a.equals(C7610a.DELAYTIMENOTIFICATION.f15566a)) {
                mo23408d0().mo27676a(new C7554e(a[1] & 255, (int) Math.ceil((double) (((float) C10539d.m25674e(a[3], a[4])) / 60.0f))));
                return;
            } else if (l0Var2.f15575a.equals(C7610a.NIGHTLIGHTNOTIFICATION.f15566a)) {
                C7558h hVar = new C7558h(a[0] != 0, a[1] & 255, C10539d.m25670a(a[2]), C10539d.m25670a(a[3]), C10539d.m25670a(a[4]), C10539d.m25670a(a[5]));
                mo23408d0().mo27678b(3, hVar);
                mo23408d0().mo27640G0(hVar.mo28922e());
                return;
            } else if (l0Var2.f15575a.equals(C7610a.WAKEUPNOTIFICAION.f15566a)) {
                mo23408d0().mo27678b(4, C10539d.m25680k(l0Var.mo29081a()));
                return;
            } else if (l0Var2.f15575a.equals(C7610a.ALARMNOTIFICATION.f15566a)) {
                if (l0Var.mo29081a()[0] == -1) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 1; i3 < 6; i3++) {
                        Iterator<C7561k> it = this.f14687Q.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                kVar = null;
                                break;
                            }
                            kVar = it.next();
                            if (kVar.mo28954o() == i3) {
                                break;
                            }
                        }
                        if (kVar == null) {
                            kVar = new C7561k();
                            kVar.mo28938D(i3);
                        }
                        arrayList.add(kVar);
                    }
                    mo23408d0().mo27678b(1, arrayList);
                    this.f14687Q.clear();
                    return;
                }
                this.f14687Q.add(C10539d.m25680k(l0Var.mo29081a()));
                return;
            } else if (l0Var2.f15575a.equals(C7610a.COMMANDRESPONSE.f15566a)) {
                String str2 = C10539d.m25675f(a[0]) + C10539d.m25675f(a[1]);
                if (str2.equals(C7610a.WAKEUPREAD.f15566a) && a[2] == 2) {
                    return;
                }
                if (str2.equals(C7610a.ADDBEACON.f15566a)) {
                    C7551c cVar = (C7551c) mo23408d0();
                    if ((a[2] & 255) == 1) {
                        cVar.mo28873a1(C7610a.ADDBEACON.ordinal(), 0);
                        return;
                    } else {
                        cVar.mo28873a1(C7610a.ADDBEACON.ordinal(), 1);
                        return;
                    }
                } else if (str2.equals(C7610a.DELETEBEACON.f15566a)) {
                    byte b3 = a[2] & 255;
                    C7551c cVar2 = (C7551c) mo23408d0();
                    if (b3 == 1) {
                        cVar2.mo28873a1(C7610a.DELETEBEACON.ordinal(), 2);
                        return;
                    } else {
                        cVar2.mo28873a1(C7610a.DELETEBEACON.ordinal(), 3);
                        return;
                    }
                } else {
                    return;
                }
            } else if (l0Var2.f15575a.equals(C7610a.BEACON_COMMAND_STATUS_OFF.f15566a)) {
                m21234v2().mo29065e(false);
                return;
            } else if (l0Var2.f15575a.equals(C7610a.BEACON_COMMAND_STATUS_ON.f15566a)) {
                m21234v2().mo29065e(true);
                return;
            } else if (l0Var2.f15575a.equals(C7610a.BEACON_COMMAND_READ_END.f15566a)) {
                ((C7551c) mo23408d0()).mo28872Z0();
                return;
            } else if (l0Var2.f15575a.equals(C7610a.ALLBEACONNOTIFICATION.f15566a)) {
                StringBuffer stringBuffer = new StringBuffer(str);
                stringBuffer.append(C10539d.m25675f(a[7]));
                stringBuffer.append(Constants.COLON_SEPARATOR);
                stringBuffer.append(C10539d.m25675f(a[6]));
                stringBuffer.append(Constants.COLON_SEPARATOR);
                stringBuffer.append(C10539d.m25675f(a[5]));
                stringBuffer.append(Constants.COLON_SEPARATOR);
                stringBuffer.append(C10539d.m25675f(a[4]));
                stringBuffer.append(Constants.COLON_SEPARATOR);
                stringBuffer.append(C10539d.m25675f(a[3]));
                stringBuffer.append(Constants.COLON_SEPARATOR);
                stringBuffer.append(C10539d.m25675f(a[2]));
                stringBuffer.append("#");
                stringBuffer.append(C10539d.m25675f(a[0]));
                stringBuffer.append("#");
                stringBuffer.append(C10539d.m25675f(a[1]));
                ((C7551c) mo23408d0()).mo28874b1(stringBuffer.toString());
                return;
            } else if (l0Var2.f15575a.equals(C7610a.RECORDSNOTIFICATION1.f15566a) || l0Var2.f15575a.equals(C7610a.RECORDSNOTIFICATION2.f15566a) || l0Var2.f15575a.equals(C7610a.RECORDSNOTIFICATION3.f15566a) || l0Var2.f15575a.equals(C7610a.RECORDSNOTIFICATION4.f15566a) || l0Var2.f15575a.equals(C7610a.RECORDSNOTIFICATION5.f15566a)) {
                l0Var.mo29081a();
                return;
            } else {
                return;
            }
        }
        myQueue.addIdleHandler(kVar2);
    }

    /* renamed from: H2 */
    public boolean mo28623H2() {
        super.mo23323Y0();
        return mo28619D2();
    }

    /* renamed from: I1 */
    public void mo27480I1(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        if (bluetoothGattDescriptor.getCharacteristic().getUuid().toString().equals("8f65073d-9f57-4aaa-afea-397d19d5bbeb")) {
            mo27487P1();
        } else if (bluetoothGattDescriptor.getCharacteristic().getUuid().toString().equals("f000fff2-0451-4000-b000-000000000000")) {
            mo23323Y0();
        }
    }

    /* renamed from: J1 */
    public void mo27481J1(C7636l0 l0Var) {
        "CherryDevice, onOtaNotification: " + C7610a.m22470b(l0Var.f15575a) + MiotCloudImpl.COOKIE_PATH + C10539d.m25676g(l0Var.mo29081a());
        byte[] a = l0Var.mo29081a();
        if (l0Var.f15575a.equals(C7610a.REQUEST_OTA_RESP.f15566a)) {
            if (((byte) (a[0] & 255)) == 1 && mo28620E2()) {
                this.f14676B = true;
                return;
            }
        } else if (l0Var.f15575a.equals(C7610a.SYNC_ID_RESP.f15566a)) {
            short p2 = m21233p2(a[0], a[1]);
            "sync id response: " + p2 + ", local index: " + this.f14681K.f14709b;
            if (p2 == this.f14681K.f14709b && this.f14676B) {
                this.f14681K.f14710c = 1;
                if (mo28618C2()) {
                    return;
                }
            }
        } else if (l0Var.f15575a.equals(C7610a.CHECK_CRC_RESP.f15566a)) {
            short p22 = m21233p2(a[0], a[1]);
            short h = C10539d.m25677h(this.f14675A);
            "local crc: " + h + ", device: " + this;
            if (p22 == h && this.f14676B && this.f12658x.mo27961W(this.f14681K.f14709b)) {
                return;
            }
        } else if (l0Var.f15575a.equals(C7610a.WRITE_FLASH_RESP.f15566a)) {
            short p23 = m21233p2(a[0], a[1]);
            "Package write to flash succeed, package id: " + p23;
            C7197j jVar = this.f14681K;
            int i = jVar.f14709b;
            if (p23 == i && this.f14676B) {
                if ((i * 32) + jVar.f14710c < this.f14680J) {
                    jVar.f14709b = i + 1;
                    jVar.f14710c = 1;
                    "Trying to sync next package: " + this.f14681K.f14709b;
                    if (this.f12658x.mo27959U(this.f14681K.f14709b)) {
                        return;
                    }
                } else if (this.f12658x.mo27974j(((C7614c) mo23384N()).mo29046n())) {
                    return;
                }
            }
        } else if (!l0Var.f15575a.equals(C7610a.FINISH_OTA_RESP.f15566a)) {
            return;
        } else {
            if ((a[0] & 255) == 1) {
                mo28627r2();
                mo23384N().mo29043i();
                mo23414j0();
                if (!C4308b.f7482a) {
                    C10551r.m25783o(this, new C7189c(this), this.f14684N);
                    this.f14684N = null;
                    return;
                }
                return;
            }
        }
        mo28622G2();
    }

    /* renamed from: L1 */
    public void mo27483L1(boolean z, boolean z2) {
        "Cherry Device, onServiceDiscovered! oad found ? " + z + ", cherry found ? " + z2;
        mo23371F0(4);
        if (!z || z2) {
            this.f14688R.mo28639c(new C7188b(), 100);
        } else if (!mo28623H2()) {
            mo28629t2(true);
        }
    }

    /* renamed from: M1 */
    public boolean mo27484M1() {
        if (mo23384N().mo29039b() < 2232) {
            return false;
        }
        this.f12658x.mo27943E(C10540e.m25701R());
        return false;
    }

    /* renamed from: S1 */
    public boolean mo27490S1() {
        C7618e s = C10540e.m25724s();
        if (s == null) {
            return false;
        }
        this.f12658x.mo27943E(s);
        return false;
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        if (U != null && !U.isEmpty()) {
            return U;
        }
        return C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_cherry) + mo23389Q(mo23372G());
    }

    /* renamed from: Y0 */
    public boolean mo23323Y0() {
        super.mo23323Y0();
        if (((C7614c) mo23384N()).mo29057v()) {
            this.f12658x.mo27958T();
            mo23371F0(9);
        } else if (((C7614c) mo23384N()).mo29059x()) {
            this.f12658x.mo27940B(((C7612b) mo23384N()).mo29047o() ? 2 : 1);
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        return false;
    }

    /* renamed from: f1 */
    public boolean mo23328f1(boolean z) {
        return false;
    }

    /* renamed from: g0 */
    public int mo23329g0() {
        if (this.f14677G) {
            double d = (double) this.f14682L.f14703a;
            Double.isNaN(d);
            return (int) Math.ceil(d * 0.8d);
        } else if (!this.f14676B) {
            return 0;
        } else {
            int i = this.f14682L.f14703a;
            if (i == 0) {
                return this.f14681K.f14708a;
            }
            double d2 = (double) i;
            Double.isNaN(d2);
            double d3 = (double) this.f14681K.f14708a;
            Double.isNaN(d3);
            return (int) Math.ceil((d2 * 0.8d) + (d3 * 0.2d));
        }
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        return false;
    }

    /* renamed from: n */
    public void mo23337n() {
        "Cherry device connect, device: " + mo23372G();
        if (C4297y.m12064f().mo23730a()) {
            if (mo23299A() == 0 || mo23299A() == 1) {
                this.f14688R.mo28638b(new C7187a());
                mo23371F0(2);
                return;
            }
            "Cherry Device, connect, state: " + mo23299A() + ", return!";
        }
    }

    /* renamed from: n2 */
    public boolean mo28624n2(String str) {
        return mo28625o2(str, 0);
    }

    /* renamed from: o2 */
    public boolean mo28625o2(String str, int i) {
        this.f12658x.mo27943E(C10540e.m25721p(str.split(Constants.COLON_SEPARATOR), "00", 1, 1, new Object[]{"00"}, i));
        this.f12658x.mo27943E(C10540e.m25718m(true));
        return false;
    }

    /* renamed from: q2 */
    public void mo28626q2() {
        this.f14677G = false;
        mo23371F0(9);
        this.f14682L.mo28645a();
    }

    /* renamed from: r */
    public void mo23342r() {
        mo28629t2(false);
    }

    /* renamed from: r2 */
    public void mo28627r2() {
        this.f14676B = false;
        this.f14681K.mo28647a();
        mo23371F0(10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23421s0(int i, int i2) {
        if (i2 != i) {
            this.f14688R.mo28640d(1);
            if (!(i2 == 11 || i2 == 5 || i2 == 0 || i2 == 8)) {
                this.f14688R.mo28641e(1, 20000);
            }
        }
        if (i2 == 11) {
            this.f14682L.mo28646b();
            this.f14681K.mo28648b();
        }
        super.mo23421s0(i, i2);
    }

    /* renamed from: s2 */
    public boolean mo28628s2(String str, String str2, String str3) {
        String[] split = str.split(Constants.COLON_SEPARATOR);
        String str4 = C7610a.DELETEBEACON.f15566a;
        Object[] objArr = new Object[16];
        Arrays.fill(objArr, "00");
        objArr[0] = str2;
        objArr[1] = str3;
        for (int i = 0; i < split.length; i++) {
            objArr[i + 2] = split[(split.length - 1) - i];
        }
        this.f12658x.mo27943E(new C7618e(str4, objArr));
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        return false;
    }

    /* renamed from: t2 */
    public void mo28629t2(boolean z) {
        if (this.f7253p == 0) {
            C4308b.m12139r(f14674T, "No reason to be here, suicide!");
        }
        if (this.f7253p == 2) {
            mo23371F0(0);
            return;
        }
        mo23371F0(!z ? 12 : 9);
        this.f12658x.mo27970f();
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
        Intent intent;
        if (mo23419q0() || mo23420r0() || C4297y.m12064f().mo23736j()) {
            Class<?> cls = null;
            if (mo23416o0() && !mo23419q0()) {
                try {
                    cls = Class.forName("com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                intent = new Intent();
            } else if (mo23419q0()) {
                try {
                    cls = Class.forName("com.yeelight.cherry.ui.activity.UpnpDeviceControlActivity");
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                }
                intent = new Intent();
            } else {
                return;
            }
            intent.setClass(view.getContext(), cls);
            intent.putExtra("com.yeelight.cherry.device_id", mo23372G());
            view.getContext().startActivity(intent);
            return;
        }
        Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_bluetooth), 0).show();
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        this.f12658x.mo27952N(3, i);
        C7554e eVar = (C7554e) mo23408d0().mo27710r(2);
        if (eVar == null) {
            eVar = new C7554e(i, i);
        }
        eVar.mo28883d(true);
        eVar.mo28885f(i);
        eVar.mo28884e(i);
        mo23408d0().mo27676a(eVar);
        return true;
    }

    /* renamed from: u2 */
    public boolean mo28630u2(boolean z) {
        this.f12658x.mo27943E(C10540e.m25718m(z));
        return false;
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        if (!mo23331k0()) {
            return false;
        }
        int i2 = 4;
        switch (i) {
            case 0:
                this.f12658x.mo27981q();
                break;
            case 1:
                String str = (String) obj;
                this.f12658x.mo27989z(str);
                "rename to: " + obj + ", length: " + str.length();
                break;
            case 2:
                this.f12658x.mo27980p();
                break;
            case 3:
                this.f12658x.mo27984t();
                break;
            case 4:
                this.f12658x.mo27986v();
                break;
            case 5:
                this.f12658x.mo27983s();
                break;
            case 7:
                this.f12658x.mo27941C();
                if (mo23384N().mo29039b() < 2238) {
                    mo23342r();
                    break;
                }
                break;
            case 8:
                this.f12658x.mo27985u();
                break;
            case 9:
                this.f12658x.mo27943E((C7618e) obj);
                break;
            case 10:
            case 14:
                C7554e eVar = (C7554e) obj;
                if (eVar.mo28882c()) {
                    i2 = 3;
                }
                this.f12658x.mo27952N(Integer.valueOf(i2).intValue(), Integer.valueOf(eVar.mo28881b()).intValue());
                mo23408d0().mo27676a(eVar);
                break;
            case 11:
                C7558h hVar = (C7558h) obj;
                this.f12658x.mo27954P(hVar);
                mo23408d0().mo27678b(3, hVar);
                break;
            case 12:
                this.f12658x.mo27969e();
                mo23408d0().mo27678b(4, (Object) null);
                break;
            case 13:
                this.f12658x.mo27947I((C7561k) obj);
                break;
        }
        return false;
    }

    /* renamed from: y2 */
    public boolean mo28631y2() {
        C4214g.C4218c cVar = (C4214g.C4218c) C4214g.m11665j().mo23495n(mo23375I().mo29075a(), true);
        if (cVar == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(cVar.mo23507c());
            int read = fileInputStream.read(this.f14690z, 0, this.f14690z.length);
            fileInputStream.close();
            C7192f fVar = this.f14683M;
            byte[] bArr = this.f14690z;
            fVar.f14695a = m21233p2(bArr[5], bArr[4]);
            C7192f fVar2 = this.f14683M;
            fVar2.f14696b = read / 4;
            fVar2.f14697c = Character.valueOf((fVar2.f14695a & 1) == 1 ? 'B' : 'A');
            System.arraycopy(this.f14690z, 8, this.f14683M.f14698d, 0, 4);
            "ImageInfo, ver: " + this.f14683M.f14695a + ", type: " + this.f14683M.f14697c + ", len: " + this.f14683M.f14696b;
            return this.f14683M.f14697c.equals('B') && this.f14683M.f14696b != 0;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }

    /* renamed from: z2 */
    public boolean mo28632z2() {
        C4214g.C4218c cVar = (C4214g.C4218c) C4214g.m11665j().mo23494m(mo23375I().mo29075a());
        if (cVar == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = ((C7612b) mo23384N()).mo29047o() ? new FileInputStream(cVar.mo23514i()) : new FileInputStream(cVar.mo23511f());
            int read = fileInputStream.read(this.f14690z, 0, this.f14690z.length);
            fileInputStream.close();
            this.f14680J = (read / 16) + (read % 16 == 0 ? 0 : 1);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
