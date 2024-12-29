package p223w3;

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
import com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.authority.C6030a;
import com.yeelight.yeelib.authority.DeviceAuthorityBase;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.BleMessage;
import com.yeelight.yeelib.device.status.TimerModel;
import com.yeelight.yeelib.managers.C3064h;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.utils.AppUtils;
import com.yeelight.yeelib.utils.C8896a;
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
import p051j4.C9186c;
import p051j4.C9197p;
import p134c4.C4007b;
import p211t3.C10383a;
import p227x3.C11964a;
import p227x3.C11965b;
import p227x3.C11966c;
import p227x3.C11967d;
import p227x3.C11979o;
import p232y3.C12038c;
import p232y3.C12041e;
import p232y3.C12043g;
import p232y3.C12045h;

/* renamed from: w3.r */
public class C11627r extends C6081a {

    /* renamed from: c0 */
    public static final String f21359c0 = "r";

    /* renamed from: A */
    private final byte[] f21360A;

    /* renamed from: B */
    public boolean f21361B;

    /* renamed from: C */
    public boolean f21362C;

    /* renamed from: Q */
    private Timer f21363Q;

    /* renamed from: R */
    private C11632e f21364R;

    /* renamed from: S */
    private int f21365S;

    /* renamed from: T */
    private C11638j f21366T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C11637i f21367U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C11633f f21368V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public String f21369W;

    /* renamed from: X */
    private StringBuffer f21370X;

    /* renamed from: Y */
    private List<C12043g.C12044a> f21371Y;

    /* renamed from: Z */
    private List<TimerModel> f21372Z;

    /* renamed from: a0 */
    private C11634g f21373a0;

    /* renamed from: b0 */
    public int f21374b0;

    /* renamed from: z */
    private final byte[] f21375z;

    /* renamed from: w3.r$a */
    class C11628a implements Runnable {
        C11628a() {
        }

        public void run() {
            C11627r.this.f12440x.mo42009d();
        }
    }

    /* renamed from: w3.r$b */
    class C11629b implements Runnable {
        C11629b() {
        }

        public void run() {
            C11627r.this.f12440x.mo42013h();
        }
    }

    /* renamed from: w3.r$c */
    class C11630c implements C4007b<String> {
        C11630c(C11627r rVar) {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String str2 = C11627r.f21359c0;
            StringBuilder sb = new StringBuilder();
            sb.append("upgradeSuccess rst = ");
            sb.append(str);
        }

        public void onFailure(int i, String str) {
            String str2 = C11627r.f21359c0;
            StringBuilder sb = new StringBuilder();
            sb.append("ota finish log fail message = ");
            sb.append(str);
        }
    }

    /* renamed from: w3.r$d */
    class C11631d implements C4007b<String> {
        C11631d() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            try {
                String unused = C11627r.this.f21369W = new JSONObject(str).getString("transaction_id");
                C11627r.this.f12440x.mo42014i();
            } catch (JSONException e) {
                e.printStackTrace();
                C11627r.this.mo23184F0(10);
            }
        }

        public void onFailure(int i, String str) {
            C11627r.this.mo23184F0(10);
        }
    }

    /* renamed from: w3.r$e */
    public class C11632e extends TimerTask {
        public C11632e() {
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectTask is running now! cur state: ");
            sb.append(C11627r.this.f4751p);
            if (!(C11627r.this.f4751p == 1 || C11627r.this.f4751p == 0)) {
                if (C11627r.this.f4751p == 2) {
                    C11627r.this.mo23184F0(1);
                } else {
                    return;
                }
            }
            C11627r.this.mo23151n();
        }
    }

    /* renamed from: w3.r$f */
    private class C11633f {

        /* renamed from: a */
        short f21380a;

        /* renamed from: b */
        int f21381b;

        /* renamed from: c */
        Character f21382c;

        /* renamed from: d */
        byte[] f21383d;

        private C11633f(C11627r rVar) {
            this.f21383d = new byte[4];
        }

        /* synthetic */ C11633f(C11627r rVar, C11628a aVar) {
            this(rVar);
        }
    }

    /* renamed from: w3.r$g */
    class C11634g extends Thread {

        /* renamed from: a */
        public Handler f21384a;

        /* renamed from: w3.r$g$a */
        class C11635a extends Handler {
            C11635a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    int h2 = C11627r.this.f4751p;
                    if (h2 == 0) {
                        return;
                    }
                    if (h2 == 9) {
                        C11627r.this.mo42349t2(true);
                    } else if (h2 != 12) {
                        C11627r.this.mo23156r();
                    } else {
                        C11627r.this.mo23184F0(0);
                    }
                } else if (i == 2) {
                    C11627r.this.mo23184F0(0);
                }
            }
        }

        C11634g() {
        }

        /* renamed from: b */
        public void mo42358b(Runnable runnable) {
            Handler handler = this.f21384a;
            if (handler == null) {
                mo42359c(runnable, 1000);
            } else {
                handler.post(runnable);
            }
        }

        /* renamed from: c */
        public void mo42359c(Runnable runnable, int i) {
            Handler handler = this.f21384a;
            if (handler == null) {
                mo42359c(runnable, 1000);
            } else {
                handler.postDelayed(runnable, (long) i);
            }
        }

        /* renamed from: d */
        public void mo42360d(int i) {
            this.f21384a.removeMessages(i);
        }

        /* renamed from: e */
        public void mo42361e(int i, int i2) {
            this.f21384a.sendEmptyMessageDelayed(i, (long) i2);
        }

        public void run() {
            Looper.prepare();
            this.f21384a = new C11635a();
            Looper.loop();
        }
    }

    /* renamed from: w3.r$h */
    private class C11636h implements Runnable {
        private C11636h() {
        }

        /* synthetic */ C11636h(C11627r rVar, C11628a aVar) {
            this();
        }

        public void run() {
            C11627r.this.f21367U.mo42366b();
            C11627r.this.f21362C = true;
            int i = C3064h.m7982j().mo23392i();
            StringBuilder sb = new StringBuilder();
            sb.append("get block interval from firmware manager -> ");
            sb.append(i);
            while (true) {
                C11627r rVar = C11627r.this;
                if (rVar.f21362C) {
                    try {
                        Thread.sleep((long) ((rVar.f21374b0 * 200) + 20));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int i2 = 0;
                    while (true) {
                        boolean z = i2 < 4;
                        C11627r rVar2 = C11627r.this;
                        if (z && rVar2.f21362C) {
                            rVar2.m29578B2();
                            try {
                                Thread.sleep((long) i);
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                            i2++;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: w3.r$i */
    private class C11637i {

        /* renamed from: a */
        int f21388a;

        /* renamed from: b */
        int f21389b;

        /* renamed from: c */
        short f21390c;

        /* renamed from: d */
        short f21391d;

        private C11637i() {
            this.f21388a = 0;
            this.f21389b = 0;
            this.f21390c = 0;
            this.f21391d = 0;
        }

        /* synthetic */ C11637i(C11627r rVar, C11628a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo42365a() {
            this.f21388a = 100;
            this.f21389b = 0;
            this.f21390c = 0;
            this.f21391d = (short) (C11627r.this.f21368V.f21381b / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo42366b() {
            StringBuilder sb = new StringBuilder();
            sb.append("############# OAD upgrade, progress reset, blocks total count: ");
            sb.append(this.f21391d);
            this.f21388a = 0;
            this.f21389b = 0;
            this.f21390c = 0;
            this.f21391d = (short) (C11627r.this.f21368V.f21381b / 4);
        }
    }

    /* renamed from: w3.r$j */
    public class C11638j {

        /* renamed from: a */
        public int f21393a = 0;

        /* renamed from: b */
        public int f21394b = 0;

        /* renamed from: c */
        public int f21395c = 1;

        public C11638j(C11627r rVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo42367a() {
            this.f21393a = 100;
            this.f21394b = 0;
            this.f21395c = 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo42368b() {
            this.f21393a = 0;
            this.f21394b = 0;
            this.f21395c = 1;
        }
    }

    /* renamed from: w3.r$k */
    class C11639k implements MessageQueue.IdleHandler {
        C11639k() {
        }

        public boolean queueIdle() {
            String str = C11627r.f21359c0;
            C11627r.this.f12440x.mo42021p();
            C11627r.this.f12440x.mo42025t();
            C11627r.this.f12440x.mo42026u();
            C11627r.this.mo42337A2();
            return false;
        }
    }

    public C11627r(String str, String str2, Device.Ownership ownership, boolean z) {
        this(str, str2, ownership, z, (String) null);
    }

    public C11627r(String str, String str2, Device.Ownership ownership, boolean z, String str3) {
        super(str, "yeelink.light.ble1", new C12038c(str3));
        this.f21375z = new byte[262144];
        this.f21360A = new byte[512];
        this.f21361B = false;
        this.f21362C = false;
        this.f21366T = new C11638j(this);
        this.f21367U = new C11637i(this, (C11628a) null);
        this.f21368V = new C11633f(this, (C11628a) null);
        this.f21371Y = new ArrayList();
        this.f21372Z = new ArrayList();
        C11634g gVar = new C11634g();
        this.f21373a0 = gVar;
        this.f21374b0 = 0;
        gVar.start();
        mo23199O0(ownership);
        mo23221d0().mo31549L0(z);
        mo23194L0(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public void m29578B2() {
        byte[] bArr = new byte[18];
        if (this.f21362C) {
            C11637i iVar = this.f21367U;
            if (iVar.f21390c < iVar.f21391d) {
                this.f21362C = true;
                StringBuilder sb = new StringBuilder();
                sb.append("oad upgrade, send block: ");
                sb.append(this.f21367U.f21390c);
                bArr[0] = m29602x2(this.f21367U.f21390c);
                bArr[1] = m29601w2(this.f21367U.f21390c);
                System.arraycopy(this.f21375z, this.f21367U.f21389b, bArr, 2, 16);
                if (this.f12440x.mo41987H(bArr)) {
                    C11637i iVar2 = this.f21367U;
                    short s = (short) (iVar2.f21390c + 1);
                    iVar2.f21390c = s;
                    int i = iVar2.f21389b + 16;
                    iVar2.f21389b = i;
                    this.f21374b0 = 0;
                    if (s % 100 == 0) {
                        iVar2.f21388a = (int) Math.ceil((double) ((((float) i) / (((float) this.f21368V.f21381b) * 4.0f)) * 100.0f));
                    }
                } else {
                    int i2 = this.f21374b0;
                    if (i2 < 3) {
                        int i3 = i2 + 1;
                        this.f21374b0 = i3;
                        try {
                            Thread.sleep((long) (i3 * 20));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        m29578B2();
                    } else {
                        this.f21374b0 = 0;
                        this.f21362C = false;
                    }
                }
                if (!this.f21362C) {
                    mo42341F2();
                    return;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("oad upgrade, all blocks done! blocks: ");
            sb2.append(this.f21367U.f21390c);
            this.f21362C = false;
            mo42346q2();
        }
    }

    /* renamed from: p2 */
    public static short m29599p2(byte b, byte b2) {
        return (short) ((b << 8) + (b2 & 255));
    }

    /* renamed from: v2 */
    private C11966c m29600v2() {
        return ((C12038c) mo23221d0()).mo42667Z0();
    }

    /* renamed from: w2 */
    public static byte m29601w2(short s) {
        return (byte) (s >> 8);
    }

    /* renamed from: x2 */
    public static byte m29602x2(short s) {
        return (byte) (s & 255);
    }

    /* renamed from: A2 */
    public boolean mo42337A2() {
        this.f12440x.mo41986G(C9186c.m22092K());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public void mo31506C1() {
        C10383a aVar = new C10383a(this);
        this.f12440x = aVar;
        this.f4759w = new C6030a(aVar);
        mo23178B0(this);
        mo31518O1(this);
    }

    /* renamed from: C2 */
    public boolean mo42338C2() {
        while (true) {
            C11638j jVar = this.f21366T;
            int i = jVar.f21395c;
            if (i > 32) {
                return this.f12440x.mo42006a();
            }
            byte[] bArr = new byte[18];
            bArr[0] = Byte.MIN_VALUE;
            bArr[1] = 3;
            System.arraycopy(this.f21375z, (((jVar.f21394b * 32) + i) - 1) * 16, bArr, 2, 16);
            System.arraycopy(bArr, 2, this.f21360A, (this.f21366T.f21395c - 1) * 16, 16);
            if (!this.f12440x.mo42017l(bArr)) {
                return false;
            }
            C11638j jVar2 = this.f21366T;
            jVar2.f21393a = (int) Math.ceil((double) (((((float) ((jVar2.f21394b * 32) + jVar2.f21395c)) * 1.0f) / ((float) this.f21365S)) * 100.0f));
            StringBuilder sb = new StringBuilder();
            sb.append("Mcu OTA update in progress......");
            sb.append(this.f21366T.f21393a);
            sb.append("%");
            try {
                Thread.sleep((long) 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f21366T.f21395c++;
        }
    }

    /* renamed from: D1 */
    public void mo31507D1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    /* renamed from: D2 */
    public boolean mo42339D2() {
        if (!mo42351y2()) {
            return false;
        }
        byte[] bArr = new byte[12];
        bArr[0] = m29602x2(this.f21368V.f21380a);
        bArr[1] = m29601w2(this.f21368V.f21380a);
        bArr[2] = m29602x2((short) this.f21368V.f21381b);
        bArr[3] = m29601w2((short) this.f21368V.f21381b);
        System.arraycopy(this.f21368V.f21383d, 0, bArr, 4, 4);
        this.f12440x.mo41998S(bArr);
        return true;
    }

    /* renamed from: E1 */
    public void mo31508E1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("characteristic: ");
        sb.append(bluetoothGattCharacteristic.getUuid().toString());
        sb.append(", write succeed status: ");
        sb.append(i);
        if (bluetoothGattCharacteristic.getUuid().toString().equals("f000ffc1-0451-4000-b000-000000000000")) {
            new Thread(new C11636h(this, (C11628a) null)).start();
        }
    }

    /* renamed from: E2 */
    public boolean mo42340E2() {
        boolean z2 = mo42352z2();
        StringBuilder sb = new StringBuilder();
        sb.append("start ota, load mcu file succeed? ");
        sb.append(z2);
        return z2 && this.f12440x.mo42000U(this.f21366T.f21394b);
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_cherry_small;
    }

    /* renamed from: F1 */
    public void mo31509F1() {
        if (this.f4751p == 2 && this.f4752q == 1) {
            this.f12440x.mo42029y();
        }
        this.f12440x.mo42012g();
        Timer timer = this.f21363Q;
        if (timer != null) {
            timer.cancel();
            this.f21363Q = null;
        }
        C11632e eVar = this.f21364R;
        if (eVar != null) {
            eVar.cancel();
            this.f21364R = null;
        }
        mo23184F0(3);
    }

    /* renamed from: F2 */
    public void mo42341F2() {
        this.f21362C = false;
        if (this.f4751p != 0) {
            mo23156r();
        }
        this.f21367U.mo42366b();
    }

    /* renamed from: G1 */
    public void mo31510G1() {
        this.f21373a0.mo42360d(1);
        if (this.f21361B) {
            mo42342G2();
        }
        if (this.f21362C) {
            mo42341F2();
        }
        if (this.f4751p == 9) {
            mo23184F0(1);
            this.f4759w.mo31416e(DeviceAuthorityBase.AuthState.AUTH_UNKNOWN);
            this.f21363Q = new Timer();
            C11632e eVar = new C11632e();
            this.f21364R = eVar;
            this.f21363Q.schedule(eVar, 3000, 10000);
            return;
        }
        mo23184F0(0);
        this.f4759w.mo31416e(DeviceAuthorityBase.AuthState.AUTH_UNKNOWN);
    }

    /* renamed from: G2 */
    public void mo42342G2() {
        this.f21361B = false;
        this.f21366T.mo42368b();
        mo23184F0(10);
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_cherry_big;
    }

    /* renamed from: H1 */
    public void mo31511H1(C11979o oVar) {
        TimerModel timerModel;
        MessageQueue myQueue;
        C11639k kVar;
        C11979o oVar2 = oVar;
        StringBuilder sb = new StringBuilder();
        sb.append("CherryDevice, onNotification ");
        sb.append(BleMessage.parseMessage(oVar2.f21861a));
        sb.append("  ");
        sb.append(C8896a.m21230g(oVar.mo42548a()));
        byte[] a = oVar.mo42548a();
        if (oVar2.f21861a.equals(BleMessage.AUTHORIZATIONNOTIFICATION.value)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onNotification, auth:");
            sb2.append(a[0] & 255);
            byte b = a[0] & 255;
            if (b != 3 || !mo23145k0()) {
                this.f4759w.mo31412a(b);
                return;
            }
            return;
        }
        if (oVar2.f21861a.equals(BleMessage.STATUSNOTIFITATION.value)) {
            mo23221d0().mo31551M0(a[0] == 1);
            if (!(a[0] == 1 || ((C12041e) mo23221d0().mo31611r(2)) == null)) {
                mo23221d0().mo31573X0(-1);
            }
            if (a[1] == 2) {
                mo23221d0().mo31600l0((long) (a[6] & 255));
                mo23221d0().mo31531C0(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
                mo23221d0().mo31610q0((a[7] << 8) + (a[8] & 255));
            } else if (a[1] == 1) {
                mo23221d0().mo31600l0((long) (a[6] & 255));
                mo23221d0().mo31531C0(DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR);
                mo23221d0().mo31602m0(Color.rgb(a[2] & 255, a[3] & 255, a[4] & 255));
            } else if (a[1] == 3) {
                mo23221d0().mo31600l0((long) (a[6] & 255));
                mo23221d0().mo31531C0(DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW);
                if (this.f4751p == 10) {
                    this.f21371Y.clear();
                    this.f12440x.mo42019n();
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onNotification, device status, power: ");
            sb3.append(mo23221d0().mo31584d0());
            sb3.append(", mode: ");
            sb3.append(mo23221d0().mo31627z());
            sb3.append("  ");
            sb3.append(a[1]);
            if (this.f4751p == 10) {
                mo23184F0(11);
                myQueue = Looper.myQueue();
                kVar = new C11639k();
            } else {
                return;
            }
        } else if (oVar2.f21861a.equals(BleMessage.COLORFLOWNOTIFICATION.value)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("color flow read notification! index: ");
            sb4.append(a[0] & 255);
            if (a[0] == 1) {
                mo23221d0().mo31610q0((a[9] << 8) + (a[10] & 255));
                return;
            } else if (a[0] == 2) {
                short e = C8896a.m21228e(a[11], a[12]);
                StringBuilder sb5 = new StringBuilder();
                sb5.append("cherry read color flow interval = ");
                int i = e * 1000;
                sb5.append(i);
                this.f21371Y.add(new C12043g.C12044a(Color.rgb(a[4] & 255, a[5] & 255, a[6] & 255), i));
                return;
            } else if (a[0] == 3) {
                mo23221d0().mo31602m0(Color.rgb(a[4] & 255, a[5] & 255, a[6] & 255));
                return;
            } else if (a[0] == -1 && this.f21371Y.size() != 0) {
                mo23221d0().mo31604n0(this.f21371Y);
                this.f21371Y.clear();
                if (this.f4751p == 10) {
                    mo23184F0(11);
                    myQueue = Looper.myQueue();
                    kVar = new C11639k();
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (oVar2.f21861a.equals(BleMessage.VERSIONNOTIFICATION.value)) {
            mo23191J0(C8896a.m21235l(a));
            StringBuilder sb6 = new StringBuilder();
            sb6.append("onNotification, device firmware version: ");
            sb6.append(mo23197N().mo42510b());
            if (!((C11965b) mo23197N()).mo42529w()) {
                mo23184F0(10);
                return;
            } else if (this.f21369W == null && !AppUtils.f4977a) {
                C9197p.m22168a(this, new C11631d());
                return;
            } else {
                this.f12440x.mo42014i();
                return;
            }
        } else {
            String str = "";
            if (oVar2.f21861a.equals(BleMessage.LIGHTNAMENOTIFICATION.value)) {
                byte b2 = a[1] & 255;
                int i2 = a[2] & 255;
                if (b2 == 0) {
                    this.f21370X = new StringBuffer();
                    if (i2 <= 13) {
                        byte[] bArr = new byte[i2];
                        System.arraycopy(a, 3, bArr, 0, i2);
                        str = C8896a.m21230g(bArr);
                    }
                    this.f21370X.append(str);
                    return;
                } else if (b2 == 1 && this.f21370X != null) {
                    if (i2 <= 13) {
                        byte[] bArr2 = new byte[i2];
                        System.arraycopy(a, 3, bArr2, 0, i2);
                        str = C8896a.m21230g(bArr2);
                    }
                    this.f21370X.append(str);
                    String j = C8896a.m21233j(this.f21370X.toString());
                    this.f21370X = null;
                    if (j != null) {
                        mo23198N0(j);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            } else if (oVar2.f21861a.equals(BleMessage.DELAYTIMENOTIFICATION.value)) {
                mo23221d0().mo31577a(new C12041e(a[1] & 255, (int) Math.ceil((double) (((float) C8896a.m21228e(a[3], a[4])) / 60.0f))));
                return;
            } else if (oVar2.f21861a.equals(BleMessage.NIGHTLIGHTNOTIFICATION.value)) {
                C12045h hVar = new C12045h(a[0] != 0, a[1] & 255, C8896a.m21224a(a[2]), C8896a.m21224a(a[3]), C8896a.m21224a(a[4]), C8896a.m21224a(a[5]));
                mo23221d0().mo31579b(3, hVar);
                mo23221d0().mo31543I0(hVar.mo42721e());
                return;
            } else if (oVar2.f21861a.equals(BleMessage.WAKEUPNOTIFICAION.value)) {
                mo23221d0().mo31579b(4, C8896a.m21234k(oVar.mo42548a()));
                return;
            } else if (oVar2.f21861a.equals(BleMessage.ALARMNOTIFICATION.value)) {
                if (oVar.mo42548a()[0] == -1) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 1; i3 < 6; i3++) {
                        Iterator<TimerModel> it = this.f21372Z.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                timerModel = null;
                                break;
                            }
                            timerModel = it.next();
                            if (timerModel.getSyncId() == i3) {
                                break;
                            }
                        }
                        if (timerModel == null) {
                            timerModel = new TimerModel();
                            timerModel.setSyncId(i3);
                        }
                        arrayList.add(timerModel);
                    }
                    mo23221d0().mo31579b(1, arrayList);
                    this.f21372Z.clear();
                    return;
                }
                this.f21372Z.add(C8896a.m21234k(oVar.mo42548a()));
                return;
            } else if (oVar2.f21861a.equals(BleMessage.COMMANDRESPONSE.value)) {
                String str2 = C8896a.m21229f(a[0]) + C8896a.m21229f(a[1]);
                if (!str2.equals(BleMessage.WAKEUPREAD.value) || a[2] != 2) {
                    BleMessage bleMessage = BleMessage.ADDBEACON;
                    if (str2.equals(bleMessage.value)) {
                        C12038c cVar = (C12038c) mo23221d0();
                        if ((a[2] & 255) == 1) {
                            cVar.mo42670c1(bleMessage.ordinal(), 0);
                            return;
                        } else {
                            cVar.mo42670c1(bleMessage.ordinal(), 1);
                            return;
                        }
                    } else {
                        BleMessage bleMessage2 = BleMessage.DELETEBEACON;
                        if (str2.equals(bleMessage2.value)) {
                            byte b3 = a[2] & 255;
                            C12038c cVar2 = (C12038c) mo23221d0();
                            if (b3 == 1) {
                                cVar2.mo42670c1(bleMessage2.ordinal(), 2);
                                return;
                            } else {
                                cVar2.mo42670c1(bleMessage2.ordinal(), 3);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else if (oVar2.f21861a.equals(BleMessage.BEACON_COMMAND_STATUS_OFF.value)) {
                m29600v2().mo42536e(false);
                return;
            } else if (oVar2.f21861a.equals(BleMessage.BEACON_COMMAND_STATUS_ON.value)) {
                m29600v2().mo42536e(true);
                return;
            } else if (oVar2.f21861a.equals(BleMessage.BEACON_COMMAND_READ_END.value)) {
                ((C12038c) mo23221d0()).mo42669b1();
                return;
            } else if (oVar2.f21861a.equals(BleMessage.ALLBEACONNOTIFICATION.value)) {
                StringBuffer stringBuffer = new StringBuffer(str);
                stringBuffer.append(C8896a.m21229f(a[7]));
                stringBuffer.append(Constants.COLON_SEPARATOR);
                stringBuffer.append(C8896a.m21229f(a[6]));
                stringBuffer.append(Constants.COLON_SEPARATOR);
                stringBuffer.append(C8896a.m21229f(a[5]));
                stringBuffer.append(Constants.COLON_SEPARATOR);
                stringBuffer.append(C8896a.m21229f(a[4]));
                stringBuffer.append(Constants.COLON_SEPARATOR);
                stringBuffer.append(C8896a.m21229f(a[3]));
                stringBuffer.append(Constants.COLON_SEPARATOR);
                stringBuffer.append(C8896a.m21229f(a[2]));
                stringBuffer.append("#");
                stringBuffer.append(C8896a.m21229f(a[0]));
                stringBuffer.append("#");
                stringBuffer.append(C8896a.m21229f(a[1]));
                ((C12038c) mo23221d0()).mo42671d1(stringBuffer.toString());
                return;
            } else if (oVar2.f21861a.equals(BleMessage.RECORDSNOTIFICATION1.value) || oVar2.f21861a.equals(BleMessage.RECORDSNOTIFICATION2.value) || oVar2.f21861a.equals(BleMessage.RECORDSNOTIFICATION3.value) || oVar2.f21861a.equals(BleMessage.RECORDSNOTIFICATION4.value) || oVar2.f21861a.equals(BleMessage.RECORDSNOTIFICATION5.value)) {
                oVar.mo42548a();
                return;
            } else {
                return;
            }
        }
        myQueue.addIdleHandler(kVar);
    }

    /* renamed from: H2 */
    public boolean mo42343H2() {
        super.mo23137Y0();
        return mo42339D2();
    }

    /* renamed from: I1 */
    public void mo31512I1(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        if (bluetoothGattDescriptor.getCharacteristic().getUuid().toString().equals("8f65073d-9f57-4aaa-afea-397d19d5bbeb")) {
            mo31519P1();
        } else if (bluetoothGattDescriptor.getCharacteristic().getUuid().toString().equals("f000fff2-0451-4000-b000-000000000000")) {
            mo23137Y0();
        }
    }

    /* renamed from: J1 */
    public void mo31513J1(C11979o oVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("CherryDevice, onOtaNotification: ");
        sb.append(BleMessage.parseMessage(oVar.f21861a));
        sb.append(MiotCloudImpl.COOKIE_PATH);
        sb.append(C8896a.m21230g(oVar.mo42548a()));
        byte[] a = oVar.mo42548a();
        if (oVar.f21861a.equals(BleMessage.REQUEST_OTA_RESP.value)) {
            if (((byte) (a[0] & 255)) == 1 && mo42340E2()) {
                this.f21361B = true;
                return;
            }
        } else if (oVar.f21861a.equals(BleMessage.SYNC_ID_RESP.value)) {
            short p2 = m29599p2(a[0], a[1]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sync id response: ");
            sb2.append(p2);
            sb2.append(", local index: ");
            sb2.append(this.f21366T.f21394b);
            if (p2 == this.f21366T.f21394b && this.f21361B) {
                this.f21366T.f21395c = 1;
                if (mo42338C2()) {
                    return;
                }
            }
        } else if (oVar.f21861a.equals(BleMessage.CHECK_CRC_RESP.value)) {
            short p22 = m29599p2(a[0], a[1]);
            short h = C8896a.m21231h(this.f21360A);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("local crc: ");
            sb3.append(h);
            sb3.append(", device: ");
            sb3.append(this);
            if (p22 == h && this.f21361B && this.f12440x.mo42002W(this.f21366T.f21394b)) {
                return;
            }
        } else if (oVar.f21861a.equals(BleMessage.WRITE_FLASH_RESP.value)) {
            short p23 = m29599p2(a[0], a[1]);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Package write to flash succeed, package id: ");
            sb4.append(p23);
            C11638j jVar = this.f21366T;
            int i = jVar.f21394b;
            if (p23 == i && this.f21361B) {
                if ((i * 32) + jVar.f21395c < this.f21365S) {
                    jVar.f21394b = i + 1;
                    jVar.f21395c = 1;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Trying to sync next package: ");
                    sb5.append(this.f21366T.f21394b);
                    if (this.f12440x.mo42000U(this.f21366T.f21394b)) {
                        return;
                    }
                } else if (this.f12440x.mo42015j(((C11965b) mo23197N()).mo42517n())) {
                    return;
                }
            }
        } else if (!oVar.f21861a.equals(BleMessage.FINISH_OTA_RESP.value)) {
            return;
        } else {
            if ((a[0] & 255) == 1) {
                mo42347r2();
                mo23197N().mo42514i();
                mo23228j0();
                if (!AppUtils.f4977a) {
                    C9197p.m22182o(this, new C11630c(this), this.f21369W);
                    this.f21369W = null;
                    return;
                }
                return;
            }
        }
        mo42342G2();
    }

    /* renamed from: L1 */
    public void mo31515L1(boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cherry Device, onServiceDiscovered! oad found ? ");
        sb.append(z);
        sb.append(", cherry found ? ");
        sb.append(z2);
        mo23184F0(4);
        if (!z || z2) {
            this.f21373a0.mo42359c(new C11629b(), 100);
        } else if (!mo42343H2()) {
            mo42349t2(true);
        }
    }

    /* renamed from: M1 */
    public boolean mo31516M1() {
        if (mo23197N().mo42510b() < 2232) {
            return false;
        }
        this.f12440x.mo41986G(C9186c.m22099R());
        return false;
    }

    /* renamed from: S1 */
    public boolean mo31522S1() {
        C11967d s = C9186c.m22122s();
        if (s == null) {
            return false;
        }
        this.f12440x.mo41986G(s);
        return false;
    }

    /* renamed from: U */
    public String mo23210U() {
        String U = super.mo23210U();
        if (U != null && !U.isEmpty()) {
            return U;
        }
        return C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_cherry) + mo23202Q(mo23185G());
    }

    /* renamed from: Y0 */
    public boolean mo23137Y0() {
        super.mo23137Y0();
        if (((C11965b) mo23197N()).mo42528v()) {
            this.f12440x.mo41999T();
            mo23184F0(9);
        } else if (((C11965b) mo23197N()).mo42530x()) {
            this.f12440x.mo41981B(((C11964a) mo23197N()).mo42518o() ? 2 : 1);
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        return false;
    }

    /* renamed from: f1 */
    public boolean mo23142f1(boolean z) {
        return false;
    }

    /* renamed from: g0 */
    public int mo23143g0() {
        if (this.f21362C) {
            double d = (double) this.f21367U.f21388a;
            Double.isNaN(d);
            return (int) Math.ceil(d * 0.8d);
        } else if (!this.f21361B) {
            return 0;
        } else {
            int i = this.f21367U.f21388a;
            if (i == 0) {
                return this.f21366T.f21393a;
            }
            double d2 = (double) i;
            Double.isNaN(d2);
            double d3 = (double) this.f21366T.f21393a;
            Double.isNaN(d3);
            return (int) Math.ceil((d2 * 0.8d) + (d3 * 0.2d));
        }
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        return false;
    }

    /* renamed from: n */
    public void mo23151n() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cherry device connect, device: ");
        sb.append(mo23185G());
        if (C3108x.m8223f().mo23540a()) {
            if (mo23113A() == 0 || mo23113A() == 1) {
                this.f21373a0.mo42358b(new C11628a());
                mo23184F0(2);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cherry Device, connect, state: ");
            sb2.append(mo23113A());
            sb2.append(", return!");
        }
    }

    /* renamed from: n2 */
    public boolean mo42344n2(String str) {
        return mo42345o2(str, 0);
    }

    /* renamed from: o2 */
    public boolean mo42345o2(String str, int i) {
        this.f12440x.mo41986G(C9186c.m22119p(str.split(Constants.COLON_SEPARATOR), "00", 1, 1, new Object[]{"00"}, i));
        this.f12440x.mo41986G(C9186c.m22116m(true));
        return false;
    }

    /* renamed from: q2 */
    public void mo42346q2() {
        this.f21362C = false;
        mo23184F0(9);
        this.f21367U.mo42365a();
    }

    /* renamed from: r */
    public void mo23156r() {
        mo42349t2(false);
    }

    /* renamed from: r2 */
    public void mo42347r2() {
        this.f21361B = false;
        this.f21366T.mo42367a();
        mo23184F0(10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23235s0(int i, int i2) {
        if (i2 != i) {
            this.f21373a0.mo42360d(1);
            if (!(i2 == 11 || i2 == 5 || i2 == 0 || i2 == 8)) {
                this.f21373a0.mo42361e(1, 20000);
            }
        }
        if (i2 == 11) {
            this.f21367U.mo42366b();
            this.f21366T.mo42368b();
        }
        super.mo23235s0(i, i2);
    }

    /* renamed from: s2 */
    public boolean mo42348s2(String str, String str2, String str3) {
        String[] split = str.split(Constants.COLON_SEPARATOR);
        String str4 = BleMessage.DELETEBEACON.value;
        Object[] objArr = new Object[16];
        Arrays.fill(objArr, "00");
        objArr[0] = str2;
        objArr[1] = str3;
        for (int i = 0; i < split.length; i++) {
            objArr[i + 2] = split[(split.length - 1) - i];
        }
        this.f12440x.mo41986G(new C11967d(str4, objArr));
        return false;
    }

    /* renamed from: t2 */
    public void mo42349t2(boolean z) {
        if (this.f4751p == 0) {
            AppUtils.m8300u(f21359c0, "No reason to be here, suicide!");
        }
        if (this.f4751p == 2) {
            mo23184F0(0);
            return;
        }
        mo23184F0(!z ? 12 : 9);
        this.f12440x.mo42011f();
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
        Intent intent;
        if (mo23233q0() || mo23234r0() || C3108x.m8223f().mo23546j()) {
            Class<?> cls = null;
            if (mo23230o0() && !mo23233q0()) {
                Class<BluetoothConnectNewActivity> cls2 = BluetoothConnectNewActivity.class;
                try {
                    int i = BluetoothConnectNewActivity.f9951e;
                    cls = cls2;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                intent = new Intent();
            } else if (mo23233q0()) {
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
            intent.putExtra("com.yeelight.cherry.device_id", mo23185G());
            view.getContext().startActivity(intent);
            return;
        }
        Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_bluetooth), 0).show();
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        this.f12440x.mo41993N(3, i);
        C12041e eVar = (C12041e) mo23221d0().mo31611r(2);
        if (eVar == null) {
            eVar = new C12041e(i, i);
        }
        eVar.mo42680d(true);
        eVar.mo42682f(i);
        eVar.mo42681e(i);
        mo23221d0().mo31577a(eVar);
        return true;
    }

    /* renamed from: u2 */
    public boolean mo42350u2(boolean z) {
        this.f12440x.mo41986G(C9186c.m22116m(z));
        return false;
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        if (!mo23145k0()) {
            return false;
        }
        int i2 = 4;
        switch (i) {
            case 0:
                this.f12440x.mo42022q();
                break;
            case 1:
                String str = (String) obj;
                this.f12440x.mo42030z(str);
                StringBuilder sb = new StringBuilder();
                sb.append("rename to: ");
                sb.append(obj);
                sb.append(", length: ");
                sb.append(str.length());
                break;
            case 2:
                this.f12440x.mo42021p();
                break;
            case 3:
                this.f12440x.mo42025t();
                break;
            case 4:
                this.f12440x.mo42027v();
                break;
            case 5:
                this.f12440x.mo42024s();
                break;
            case 7:
                this.f12440x.mo41982C();
                if (mo23197N().mo42510b() < 2238) {
                    mo23156r();
                    break;
                }
                break;
            case 8:
                this.f12440x.mo42026u();
                break;
            case 9:
                this.f12440x.mo41986G((C11967d) obj);
                break;
            case 10:
            case 14:
                C12041e eVar = (C12041e) obj;
                if (eVar.mo42679c()) {
                    i2 = 3;
                }
                this.f12440x.mo41993N(Integer.valueOf(i2).intValue(), Integer.valueOf(eVar.mo42678b()).intValue());
                mo23221d0().mo31577a(eVar);
                break;
            case 11:
                C12045h hVar = (C12045h) obj;
                this.f12440x.mo41995P(hVar);
                mo23221d0().mo31579b(3, hVar);
                break;
            case 12:
                this.f12440x.mo42010e();
                mo23221d0().mo31579b(4, (Object) null);
                break;
            case 13:
                this.f12440x.mo41988I((TimerModel) obj);
                break;
        }
        return false;
    }

    /* renamed from: y2 */
    public boolean mo42351y2() {
        C3064h.C3068c cVar = (C3064h.C3068c) C3064h.m7982j().mo23394n(mo23188I().mo31880a(), true);
        if (cVar == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(cVar.mo23406c());
            byte[] bArr = this.f21375z;
            int read = fileInputStream.read(bArr, 0, bArr.length);
            fileInputStream.close();
            C11633f fVar = this.f21368V;
            byte[] bArr2 = this.f21375z;
            fVar.f21380a = m29599p2(bArr2[5], bArr2[4]);
            C11633f fVar2 = this.f21368V;
            fVar2.f21381b = read / 4;
            fVar2.f21382c = Character.valueOf((fVar2.f21380a & 1) == 1 ? 'B' : 'A');
            System.arraycopy(this.f21375z, 8, this.f21368V.f21383d, 0, 4);
            StringBuilder sb = new StringBuilder();
            sb.append("ImageInfo, ver: ");
            sb.append(this.f21368V.f21380a);
            sb.append(", type: ");
            sb.append(this.f21368V.f21382c);
            sb.append(", len: ");
            sb.append(this.f21368V.f21381b);
            return this.f21368V.f21382c.equals('B') && this.f21368V.f21381b != 0;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }

    /* renamed from: z2 */
    public boolean mo42352z2() {
        C3064h.C3068c cVar = (C3064h.C3068c) C3064h.m7982j().mo23393m(mo23188I().mo31880a());
        if (cVar == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = ((C11964a) mo23197N()).mo42518o() ? new FileInputStream(cVar.mo23413i()) : new FileInputStream(cVar.mo23410f());
            byte[] bArr = this.f21375z;
            int read = fileInputStream.read(bArr, 0, bArr.length);
            fileInputStream.close();
            this.f21365S = (read / 16) + (read % 16 == 0 ? 0 : 1);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
