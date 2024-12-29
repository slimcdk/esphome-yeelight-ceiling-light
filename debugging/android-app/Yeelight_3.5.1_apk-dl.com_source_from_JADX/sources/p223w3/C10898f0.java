package p223w3;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.view.View;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.miot.common.device.Device;
import com.telink.bluetooth.light.Opcode;
import com.telink.crypto.AES;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.authority.C6030a;
import com.yeelight.yeelib.authority.DeviceAuthorityBase;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.C6164e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.base.PrivateMeshDeviceBase;
import com.yeelight.yeelib.device.connections.ConnectionBase;
import com.yeelight.yeelib.managers.C3064h;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.MeshNetWork;
import com.yeelight.yeelib.utils.C8896a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import p051j4.C9186c;
import p051j4.C9202r;
import p144d3.C8936a;
import p149e3.C8964a;
import p149e3.C8965b;
import p211t3.C10388c;
import p227x3.C11979o;
import p232y3.C12036a;
import p232y3.C12041e;

/* renamed from: w3.f0 */
public class C10898f0 extends PrivateMeshDeviceBase {
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f20241Q = false;

    /* renamed from: R */
    private boolean f20242R = false;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public byte[] f20243S = new byte[8];
    /* access modifiers changed from: private */

    /* renamed from: T */
    public byte[] f20244T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C10913j f20245U = new C10913j();
    /* access modifiers changed from: private */

    /* renamed from: V */
    public byte[] f20246V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public byte[] f20247W;

    /* renamed from: X */
    private byte[] f20248X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public C10915k f20249Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public long f20250Z;

    /* renamed from: a0 */
    private Timer f20251a0;

    /* renamed from: b0 */
    private C10911h f20252b0;

    /* renamed from: c0 */
    private StringBuffer f20253c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public boolean f20254d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public ConnectionBase.C6140c f20255e0 = new C10907f();

    /* renamed from: w3.f0$a */
    class C10899a implements Runnable {
        C10899a() {
        }

        public void run() {
            boolean h = C10898f0.this.f12440x.mo42013h();
            StringBuilder sb = new StringBuilder();
            sb.append("enable notify res = ");
            sb.append(h);
            if (h) {
                C10898f0.this.f4759w.mo31412a(2);
            }
            if (C10898f0.this.f12440x.mo41996Q("CHAR_TELINK_NOTIFY", true)) {
                C10898f0.this.f12440x.mo41996Q("CHAR_GINGKO_NOTIFY", true);
            }
        }
    }

    /* renamed from: w3.f0$b */
    class C10900b implements Runnable {
        C10900b() {
        }

        public void run() {
            C10898f0.this.f12440x.mo42009d();
        }
    }

    /* renamed from: w3.f0$c */
    class C10901c implements Runnable {

        /* renamed from: w3.f0$c$a */
        class C10902a implements ConnectionBase.C6140c {
            C10902a() {
            }

            /* renamed from: a */
            public void mo31814a() {
            }

            public void onSuccess(byte[] bArr) {
                String str = C6081a.f12439y;
                StringBuilder sb = new StringBuilder();
                sb.append("ReadCharacteristic from callback value = ");
                sb.append(C8896a.m21230g(bArr));
                sb.append(" thread = ");
                sb.append(Thread.currentThread());
                if (bArr[0] == Opcode.BLE_GATT_OP_PAIR_ENC_FAIL.getValue() || bArr[0] == 0) {
                    if (C10898f0.this.f20241Q) {
                        C10898f0.this.f20245U.mo42264d(8, 0);
                    }
                    C8936a.m21302b("Login failed, encryption is not correct");
                    boolean unused = C10898f0.this.f12492B = false;
                    boolean unused2 = C10898f0.this.f20254d0 = false;
                    C10898f0.this.mo23221d0().mo31592h0(805306372);
                    if (C10898f0.this.f12493C != null) {
                        C10898f0.this.f12493C.mo31654i();
                        return;
                    }
                    return;
                }
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArr, 1, bArr2, 0, 16);
                System.arraycopy(bArr, 1, bArr3, 0, 8);
                try {
                    C10898f0 f0Var = C10898f0.this;
                    byte[] unused3 = f0Var.f20244T = f0Var.m27830n3(f0Var.f20246V, C10898f0.this.f20247W, C10898f0.this.f20243S, bArr3, bArr2);
                    C8936a.m21301a("Login success");
                    boolean unused4 = C10898f0.this.f12492B = true;
                    if (C10898f0.this.f20241Q) {
                        C10898f0.this.f20245U.mo42264d(4, 0);
                    }
                    C10898f0.this.mo23221d0().mo31592h0(536870916);
                    if (C10898f0.this.f12493C != null) {
                        C10898f0.this.f12493C.mo31653f();
                    } else {
                        C8936a.m21302b("Login success, but listener is null");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    boolean unused5 = C10898f0.this.f12492B = false;
                    boolean unused6 = C10898f0.this.f20254d0 = false;
                    if (C10898f0.this.f20241Q) {
                        C10898f0.this.mo23184F0(13);
                    }
                    if (C10898f0.this.f12493C != null) {
                        C10898f0.this.f12493C.mo31654i();
                    }
                }
            }
        }

        C10901c() {
        }

        public void run() {
            C10898f0.this.f12440x.mo42028w("CHAR_TELINK_PAIR", new C10902a());
        }
    }

    /* renamed from: w3.f0$d */
    class C10903d implements ConnectionBase.C6140c {

        /* renamed from: a */
        final /* synthetic */ byte[] f20260a;

        /* renamed from: b */
        final /* synthetic */ byte[] f20261b;

        /* renamed from: c */
        final /* synthetic */ byte[] f20262c;

        C10903d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.f20260a = bArr;
            this.f20261b = bArr2;
            this.f20262c = bArr3;
        }

        /* renamed from: a */
        public void mo31814a() {
            C10898f0.this.mo23221d0().mo31592h0(805306370);
        }

        public void onSuccess(byte[] bArr) {
            if (bArr[0] == Opcode.BLE_GATT_OP_PAIR_CONFIRM.getValue()) {
                try {
                    byte[] bArr2 = new byte[16];
                    for (int i = 0; i < 16; i++) {
                        bArr2[i] = (byte) ((this.f20260a[i] ^ this.f20261b[i]) ^ this.f20262c[i]);
                    }
                    byte[] d = C8964a.m21438d(AES.m12461b(C10898f0.this.f20244T, bArr2));
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(bArr, 1, bArr3, 0, 16);
                    if (!C8964a.m21437c(d, bArr3)) {
                        C10898f0.this.mo23221d0().mo31592h0(805306370);
                    } else {
                        C10898f0.this.mo23221d0().mo31592h0(536870914);
                    }
                } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
                    C10898f0.this.mo23221d0().mo31592h0(805306370);
                }
            } else {
                C10898f0.this.mo23221d0().mo31592h0(805306370);
            }
        }
    }

    /* renamed from: w3.f0$e */
    class C10904e implements Runnable {

        /* renamed from: w3.f0$e$a */
        class C10905a implements ConnectionBase.C6140c {

            /* renamed from: w3.f0$e$a$a */
            class C10906a implements Runnable {
                C10906a() {
                }

                public void run() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("read CHAR_TELINK_OTAin thread = ");
                    sb.append(Thread.currentThread().getName());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("OTA complete! total time: ");
                    sb2.append((System.currentTimeMillis() - C10898f0.this.f20250Z) / 1000);
                    sb2.append(C11641s.f21397C);
                    boolean unused = C10898f0.this.f20249Y.m27899l();
                    C10898f0.this.mo23184F0(9);
                }
            }

            C10905a() {
            }

            /* renamed from: a */
            public void mo31814a() {
            }

            public void onSuccess(byte[] bArr) {
                StringBuilder sb = new StringBuilder();
                sb.append("send last packet success in thread = ");
                sb.append(Thread.currentThread().getName());
                C10898f0.this.f20245U.mo42262b(new C10906a());
            }
        }

        C10904e() {
        }

        public void run() {
            boolean unused = C10898f0.this.f20249Y.m27899l();
            if (C10898f0.this.f20249Y.mo42276k()) {
                StringBuilder sb = new StringBuilder();
                sb.append("ota progress:");
                sb.append(C10898f0.this.f20249Y.mo42273h());
                sb.append(" in thread = ");
                sb.append(Thread.currentThread().getName());
                C10898f0.this.f12440x.mo41985F("CHAR_TELINK_OTA", C10898f0.this.f20249Y.mo42272g(), C10898f0.this.f20255e0);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("send last packet in thread = ");
            sb2.append(Thread.currentThread().getName());
            C10898f0.this.f12440x.mo41985F("CHAR_TELINK_OTA", C10898f0.this.f20249Y.mo42271f(), new C10905a());
        }
    }

    /* renamed from: w3.f0$f */
    class C10907f implements ConnectionBase.C6140c {

        /* renamed from: w3.f0$f$a */
        class C10908a implements Runnable {

            /* renamed from: w3.f0$f$a$a */
            class C10909a implements ConnectionBase.C6140c {
                C10909a() {
                }

                /* renamed from: a */
                public void mo31814a() {
                    boolean unused = C10898f0.this.m27833p3();
                }

                public void onSuccess(byte[] bArr) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("read success : ");
                    sb.append(C8964a.m21435a(bArr, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
                    boolean unused = C10898f0.this.m27833p3();
                }
            }

            C10908a() {
            }

            public void run() {
                C10898f0.this.f12440x.mo42028w("CHAR_TELINK_OTA", new C10909a());
            }
        }

        C10907f() {
        }

        /* renamed from: a */
        public void mo31814a() {
            boolean unused = C10898f0.this.m27833p3();
        }

        public void onSuccess(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("mOtaCallback success : ");
            sb.append(C8964a.m21435a(bArr, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
            if (C10898f0.this.f20249Y.mo42273h() % 17 == 0) {
                C10898f0.this.f20245U.mo42263c(new C10908a(), 180);
            } else {
                boolean unused = C10898f0.this.m27833p3();
            }
        }
    }

    /* renamed from: w3.f0$g */
    static /* synthetic */ class C10910g {

        /* renamed from: a */
        static final /* synthetic */ int[] f20270a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.yeelight.yeelib.device.models.BleMessage[] r0 = com.yeelight.yeelib.device.models.BleMessage.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20270a = r0
                com.yeelight.yeelib.device.models.BleMessage r1 = com.yeelight.yeelib.device.models.BleMessage.STATUSNOTIFITATION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20270a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.models.BleMessage r1 = com.yeelight.yeelib.device.models.BleMessage.VERSIONNOTIFICATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20270a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.device.models.BleMessage r1 = com.yeelight.yeelib.device.models.BleMessage.AUTHORIZATIONNOTIFICATION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20270a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.device.models.BleMessage r1 = com.yeelight.yeelib.device.models.BleMessage.LIGHTNAMENOTIFICATION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20270a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yeelight.yeelib.device.models.BleMessage r1 = com.yeelight.yeelib.device.models.BleMessage.DELAYTIMENOTIFICATION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20270a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.yeelight.yeelib.device.models.BleMessage r1 = com.yeelight.yeelib.device.models.BleMessage.BATTERYNOTIFICATION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f20270a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.yeelight.yeelib.device.models.BleMessage r1 = com.yeelight.yeelib.device.models.BleMessage.FACTORYNOTIFICATION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C10898f0.C10910g.<clinit>():void");
        }
    }

    /* renamed from: w3.f0$h */
    public class C10911h extends TimerTask {
        public C10911h() {
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectTask is running now! cur state: ");
            sb.append(C10898f0.this.f4751p);
            if (!(C10898f0.this.f4751p == 1 || C10898f0.this.f4751p == 0)) {
                if (C10898f0.this.f4751p == 2) {
                    C10898f0.this.mo23184F0(1);
                } else {
                    return;
                }
            }
            C10898f0.this.mo23151n();
        }
    }

    /* renamed from: w3.f0$i */
    class C10912i implements MessageQueue.IdleHandler {
        C10912i() {
        }

        public boolean queueIdle() {
            C10898f0.this.f12440x.mo42021p();
            C10898f0.this.f12440x.mo41984E("CHAR_GINGKO_CTRL", C8896a.m21225b(C9186c.m22094M().mo42537a()));
            return false;
        }
    }

    /* renamed from: w3.f0$j */
    class C10913j extends Thread {

        /* renamed from: a */
        public Handler f20273a;

        /* renamed from: w3.f0$j$a */
        class C10914a extends Handler {
            C10914a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    int g3 = C10898f0.this.f4751p;
                    if (g3 == 0) {
                        return;
                    }
                    if (g3 == 9 || g3 != 12) {
                        C10898f0.this.mo23156r();
                    } else {
                        C10898f0.this.mo23184F0(0);
                    }
                } else if (i == 2) {
                    C10898f0.this.mo23184F0(0);
                } else if (i == 3) {
                    C10898f0 f0Var = C10898f0.this;
                    C10915k unused = f0Var.f20249Y = new C10915k(f0Var, (C10899a) null);
                    File d = ((C3064h.C3070e) C3064h.m7982j().mo23393m(C10898f0.this.mo23208T())).mo23421d();
                    StringBuilder sb = new StringBuilder();
                    sb.append("ota file = ");
                    sb.append(d.getAbsolutePath());
                    try {
                        FileInputStream fileInputStream = new FileInputStream(d);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Fw file size = ");
                        sb2.append(fileInputStream.available());
                        byte[] bArr = new byte[fileInputStream.available()];
                        fileInputStream.read(bArr);
                        C10898f0.this.f20249Y.mo42277m(bArr);
                        fileInputStream.close();
                        long unused2 = C10898f0.this.f20250Z = System.currentTimeMillis();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    C10898f0 f0Var2 = C10898f0.this;
                    f0Var2.mo31638Y1(f0Var2.f12494z.getNetworkName(), C10898f0.this.f12494z.getPassword());
                } else if (i != 4) {
                    switch (i) {
                        case 8:
                            C10898f0.this.mo23184F0(13);
                            return;
                        case 9:
                            C10898f0.this.f12440x.mo41984E("CHAR_GINGKO_CTRL", C8896a.m21225b(C9186c.m22095N().mo42537a()));
                            return;
                        case 10:
                            C10898f0.this.mo23184F0(14);
                            return;
                        default:
                            return;
                    }
                } else {
                    boolean unused3 = C10898f0.this.m27833p3();
                }
            }
        }

        C10913j() {
        }

        /* renamed from: b */
        public void mo42262b(Runnable runnable) {
            Handler handler = this.f20273a;
            if (handler == null) {
                mo42263c(runnable, 1000);
            } else {
                handler.post(runnable);
            }
        }

        /* renamed from: c */
        public void mo42263c(Runnable runnable, int i) {
            Handler handler = this.f20273a;
            if (handler == null) {
                mo42263c(runnable, 1000);
            } else {
                handler.postDelayed(runnable, (long) i);
            }
        }

        /* renamed from: d */
        public void mo42264d(int i, int i2) {
            this.f20273a.sendEmptyMessageDelayed(i, (long) i2);
        }

        public void run() {
            Looper.prepare();
            this.f20273a = new C10914a();
            Looper.loop();
        }
    }

    /* renamed from: w3.f0$k */
    private class C10915k {

        /* renamed from: a */
        private int f20276a;

        /* renamed from: b */
        private int f20277b;

        /* renamed from: c */
        private byte[] f20278c;

        /* renamed from: d */
        private int f20279d;

        private C10915k(C10898f0 f0Var) {
            this.f20277b = -1;
        }

        /* synthetic */ C10915k(C10898f0 f0Var, C10899a aVar) {
            this(f0Var);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public boolean m27899l() {
            int floor = (int) Math.floor((double) ((((float) mo42273h()) / ((float) this.f20276a)) * 100.0f));
            if (floor == this.f20279d) {
                return false;
            }
            this.f20279d = floor;
            return true;
        }

        /* renamed from: b */
        public void mo42267b() {
            this.f20279d = 0;
            this.f20276a = 0;
            this.f20277b = -1;
            this.f20278c = null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo42268c(byte[] r10) {
            /*
                r9 = this;
                int r0 = r10.length
                r1 = 2
                int r0 = r0 - r1
                short[] r1 = new short[r1]
                r1 = {0, -24575} // fill-array
                r2 = 0
                r3 = 65535(0xffff, float:9.1834E-41)
                r4 = 0
                r5 = 65535(0xffff, float:9.1834E-41)
            L_0x0010:
                if (r4 >= r0) goto L_0x002a
                byte r6 = r10[r4]
                r7 = 0
            L_0x0015:
                r8 = 8
                if (r7 >= r8) goto L_0x0027
                int r8 = r5 >> 1
                r5 = r5 ^ r6
                r5 = r5 & 1
                short r5 = r1[r5]
                r5 = r5 & r3
                r5 = r5 ^ r8
                int r6 = r6 >> 1
                int r7 = r7 + 1
                goto L_0x0015
            L_0x0027:
                int r4 = r4 + 1
                goto L_0x0010
            L_0x002a:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C10898f0.C10915k.mo42268c(byte[]):int");
        }

        /* renamed from: d */
        public void mo42269d(byte[] bArr, int i) {
            int length = bArr.length - 2;
            bArr[length] = (byte) (i & 255);
            bArr[length + 1] = (byte) ((i >> 8) & 255);
        }

        /* renamed from: e */
        public void mo42270e(byte[] bArr, int i) {
            bArr[0] = (byte) (i & 255);
            bArr[1] = (byte) ((i >> 8) & 255);
        }

        /* renamed from: f */
        public byte[] mo42271f() {
            byte[] bArr = new byte[4];
            int h = mo42273h();
            mo42270e(bArr, h);
            int c = mo42268c(bArr);
            mo42269d(bArr, c);
            C8936a.m21301a("ota check packet ---> index : " + h + " crc : " + c + " content : " + C8964a.m21435a(bArr, Constants.COLON_SEPARATOR));
            return bArr;
        }

        /* renamed from: g */
        public byte[] mo42272g() {
            int h = mo42273h();
            byte[] i = mo42274i(h);
            this.f20277b = h;
            return i;
        }

        /* renamed from: h */
        public int mo42273h() {
            return this.f20277b + 1;
        }

        /* renamed from: i */
        public byte[] mo42274i(int i) {
            byte[] bArr = this.f20278c;
            int length = bArr.length;
            if (length > 16) {
                length = i + 1 == this.f20276a ? length - (i * 16) : 16;
            }
            int i2 = length + 4;
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i * 16, bArr2, 2, i2 - 4);
            mo42270e(bArr2, i);
            int c = mo42268c(bArr2);
            mo42269d(bArr2, c);
            C8936a.m21301a("ota packet ---> index : " + i + " total : " + this.f20276a + " crc : " + c + " content : " + C8964a.m21435a(bArr2, Constants.COLON_SEPARATOR));
            return bArr2;
        }

        /* renamed from: j */
        public int mo42275j() {
            return this.f20279d;
        }

        /* renamed from: k */
        public boolean mo42276k() {
            int i = this.f20276a;
            return i > 0 && this.f20277b + 1 < i;
        }

        /* renamed from: m */
        public void mo42277m(byte[] bArr) {
            mo42267b();
            this.f20278c = bArr;
            int length = bArr.length;
            int i = length % 16;
            int i2 = length / 16;
            if (i != 0) {
                i2 = (int) Math.floor((double) (i2 + 1));
            }
            this.f20276a = i2;
        }
    }

    public C10898f0(String str, String str2, Device.Ownership ownership, boolean z, String str3) {
        super(str, "yeelink.light.gingko", new C12036a(str3));
        this.f20245U.start();
        mo23199O0(ownership);
        mo23221d0().mo31549L0(z);
        mo23194L0(str2);
    }

    /* renamed from: k3 */
    private byte[] m27827k3(byte[] bArr) {
        new Random().nextBytes(bArr);
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public byte[] m27830n3(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[16];
        System.arraycopy(bArr4, 0, bArr6, 0, bArr4.length);
        byte[] bArr7 = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr7[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        byte[] b = AES.m12461b(bArr6, bArr7);
        byte[] bArr8 = new byte[16];
        System.arraycopy(bArr4, 0, bArr8, 0, bArr4.length);
        System.arraycopy(b, 8, bArr8, 8, 8);
        C8964a.m21439e(bArr8, 8, 15);
        if (!C8964a.m21437c(bArr8, bArr5)) {
            return null;
        }
        System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
        System.arraycopy(bArr4, 0, bArr6, 8, bArr4.length);
        byte[] b2 = AES.m12461b(bArr7, bArr6);
        C8964a.m21439e(b2, 0, b2.length - 1);
        return b2;
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public boolean m27833p3() {
        if (this.f4751p == 0) {
            return false;
        }
        this.f20245U.mo42263c(new C10904e(), 15);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public void mo31506C1() {
        C10388c cVar = new C10388c(this);
        this.f12440x = cVar;
        this.f4759w = new C6030a(cVar);
        mo23178B0(this);
        mo31518O1(this);
    }

    /* renamed from: D1 */
    public void mo31507D1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        C8936a.m21301a("characteristic = " + bluetoothGattCharacteristic.getUuid().toString() + " value = " + C8964a.m21436b(bluetoothGattCharacteristic.getValue()) + " hexStr = " + C8896a.m21230g(bluetoothGattCharacteristic.getValue()));
    }

    /* renamed from: E1 */
    public void mo31508E1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("characteristic: ");
        sb.append(bluetoothGattCharacteristic.getUuid().toString());
        sb.append(", write succeed status: ");
        sb.append(i);
        sb.append(" value = ");
        sb.append(C8964a.m21435a(bluetoothGattCharacteristic.getValue(), Constants.ACCEPT_TIME_SEPARATOR_SERVER));
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_gingko_small;
    }

    /* renamed from: F1 */
    public void mo31509F1() {
        this.f12440x.mo42012g();
        mo23184F0(3);
    }

    /* renamed from: G1 */
    public void mo31510G1() {
        this.f12492B = false;
        this.f20254d0 = false;
        if (this.f4751p == 9) {
            mo23184F0(1);
            this.f4759w.mo31416e(DeviceAuthorityBase.AuthState.AUTH_UNKNOWN);
            this.f20251a0 = new Timer();
            C10911h hVar = new C10911h();
            this.f20252b0 = hVar;
            this.f20251a0.schedule(hVar, 3000, 10000);
            return;
        }
        mo23184F0(0);
        this.f4759w.mo31416e(DeviceAuthorityBase.AuthState.AUTH_UNKNOWN);
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_gingko_big;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: H1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31511H1(p227x3.C11979o r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Gingko, onNotification "
            r0.append(r1)
            java.lang.String r1 = r12.f21861a
            java.lang.String r1 = com.yeelight.yeelib.device.models.BleMessage.parseMessage(r1)
            r0.append(r1)
            java.lang.String r1 = "  "
            r0.append(r1)
            byte[] r2 = r12.mo42548a()
            java.lang.String r2 = com.yeelight.yeelib.utils.C8896a.m21230g(r2)
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            byte[] r2 = r12.mo42548a()
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            byte[] r0 = r12.mo42548a()
            int[] r2 = p223w3.C10898f0.C10910g.f20270a
            java.lang.String r3 = r12.f21861a
            com.yeelight.yeelib.device.models.BleMessage r3 = com.yeelight.yeelib.device.models.BleMessage.parseBleMessage(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 4
            java.lang.String r4 = "value = "
            r5 = 10
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            switch(r2) {
                case 1: goto L_0x0189;
                case 2: goto L_0x0145;
                case 3: goto L_0x0123;
                case 4: goto L_0x00bd;
                case 5: goto L_0x009a;
                case 6: goto L_0x006c;
                case 7: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0265
        L_0x0053:
            byte r12 = r0[r6]
            if (r12 == r8) goto L_0x0265
            t3.b r12 = r11.f12440x
            x3.d r0 = p051j4.C9186c.m22107d()
            java.lang.String r0 = r0.mo42537a()
            byte[] r0 = com.yeelight.yeelib.utils.C8896a.m21225b(r0)
            java.lang.String r1 = "CHAR_GINGKO_CTRL"
            r12.mo41984E(r1, r0)
            goto L_0x0265
        L_0x006c:
            byte r12 = r0[r6]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = com.yeelight.yeelib.utils.C8896a.m21230g(r0)
            r1.append(r2)
            if (r12 == r7) goto L_0x0084
        L_0x007f:
            r11.mo23184F0(r5)
            goto L_0x0265
        L_0x0084:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.String r0 = com.yeelight.yeelib.utils.C8896a.m21230g(r0)
            r12.append(r0)
            w3.f0$j r12 = r11.f20245U
            r12.mo42264d(r3, r9)
            goto L_0x0265
        L_0x009a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.String r1 = com.yeelight.yeelib.utils.C8896a.m21230g(r0)
            r12.append(r1)
            byte r12 = r0[r6]
            y3.e r1 = new y3.e
            byte r0 = r0[r7]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.<init>(r0, r12)
            com.yeelight.yeelib.device.base.DeviceStatusBase r12 = r11.mo23221d0()
            r12.mo31577a(r1)
            goto L_0x0265
        L_0x00bd:
            byte r12 = r0[r8]
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r1 = r0[r7]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 13
            java.lang.String r3 = ""
            if (r12 != 0) goto L_0x00f7
            int r12 = r0.length
            r4 = 0
        L_0x00cd:
            if (r4 >= r12) goto L_0x00d8
            byte r5 = r0[r4]
            if (r5 <= 0) goto L_0x00d5
            r8 = 0
            goto L_0x00d8
        L_0x00d5:
            int r4 = r4 + 1
            goto L_0x00cd
        L_0x00d8:
            if (r8 == 0) goto L_0x00de
            r11.mo23198N0(r3)
            return
        L_0x00de:
            java.lang.StringBuffer r12 = new java.lang.StringBuffer
            r12.<init>()
            r11.f20253c0 = r12
            if (r1 > r2) goto L_0x00f0
            byte[] r12 = new byte[r1]
            java.lang.System.arraycopy(r0, r6, r12, r9, r1)
            java.lang.String r3 = com.yeelight.yeelib.utils.C8896a.m21230g(r12)
        L_0x00f0:
            java.lang.StringBuffer r12 = r11.f20253c0
            r12.append(r3)
            goto L_0x0265
        L_0x00f7:
            if (r12 != r8) goto L_0x0265
            java.lang.StringBuffer r12 = r11.f20253c0
            if (r12 != 0) goto L_0x00fe
            return
        L_0x00fe:
            if (r1 > r2) goto L_0x0109
            byte[] r12 = new byte[r1]
            java.lang.System.arraycopy(r0, r6, r12, r9, r1)
            java.lang.String r3 = com.yeelight.yeelib.utils.C8896a.m21230g(r12)
        L_0x0109:
            java.lang.StringBuffer r12 = r11.f20253c0
            r12.append(r3)
            java.lang.StringBuffer r12 = r11.f20253c0
            java.lang.String r12 = r12.toString()
            java.lang.String r12 = com.yeelight.yeelib.utils.C8896a.m21233j(r12)
            r0 = 0
            r11.f20253c0 = r0
            if (r12 != 0) goto L_0x011e
            return
        L_0x011e:
            r11.mo23198N0(r12)
            goto L_0x0265
        L_0x0123:
            byte r12 = r0[r9]
            if (r12 != r7) goto L_0x0130
            com.yeelight.yeelib.authority.DeviceAuthorityBase r12 = r11.f4759w
            com.yeelight.yeelib.authority.DeviceAuthorityBase$AuthState r0 = com.yeelight.yeelib.authority.DeviceAuthorityBase.AuthState.AUTH_SUC
        L_0x012b:
            r12.mo31416e(r0)
            goto L_0x0265
        L_0x0130:
            byte r12 = r0[r9]
            if (r12 != r8) goto L_0x0139
            com.yeelight.yeelib.authority.DeviceAuthorityBase r12 = r11.f4759w
            com.yeelight.yeelib.authority.DeviceAuthorityBase$AuthState r0 = com.yeelight.yeelib.authority.DeviceAuthorityBase.AuthState.AUTH_IP
            goto L_0x012b
        L_0x0139:
            com.yeelight.yeelib.authority.DeviceAuthorityBase r12 = r11.f4759w
            com.yeelight.yeelib.authority.DeviceAuthorityBase$AuthState r0 = com.yeelight.yeelib.authority.DeviceAuthorityBase.AuthState.AUTH_FAIL
            r12.mo31416e(r0)
            r11.mo23156r()
            goto L_0x0265
        L_0x0145:
            byte[] r12 = r12.mo42548a()
            r0 = 0
        L_0x014a:
            int r1 = r12.length
            if (r0 >= r1) goto L_0x015c
            byte r1 = r12[r0]
            if (r1 != 0) goto L_0x015a
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 != 0) goto L_0x0159
            int r1 = r1 - r8
            goto L_0x015d
        L_0x0159:
            r0 = r1
        L_0x015a:
            int r0 = r0 + r8
            goto L_0x014a
        L_0x015c:
            r1 = 0
        L_0x015d:
            if (r1 <= 0) goto L_0x0265
            byte[] r0 = new byte[r1]
            java.lang.System.arraycopy(r12, r9, r0, r9, r1)
            java.lang.String r12 = new java.lang.String
            r12.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onNotification, device firmware version: "
            r0.append(r1)
            r0.append(r12)
            x3.g r0 = new x3.g
            r0.<init>(r12)
            r11.mo23191J0(r0)
            boolean r12 = r11.f20242R
            if (r12 == 0) goto L_0x007f
            r11.f20242R = r9
            r11.mo23137Y0()
            goto L_0x0265
        L_0x0189:
            com.yeelight.yeelib.device.base.DeviceStatusBase r12 = r11.mo23221d0()
            byte r2 = r0[r9]
            if (r2 != r8) goto L_0x0193
            r2 = 1
            goto L_0x0194
        L_0x0193:
            r2 = 0
        L_0x0194:
            r12.mo31551M0(r2)
            byte r12 = r0[r9]
            if (r12 == r8) goto L_0x01b3
            com.yeelight.yeelib.device.base.DeviceStatusBase r12 = r11.mo23221d0()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Object r12 = r12.mo31611r(r2)
            y3.e r12 = (p232y3.C12041e) r12
            if (r12 == 0) goto L_0x01b3
            com.yeelight.yeelib.device.base.DeviceStatusBase r12 = r11.mo23221d0()
            r2 = -1
            r12.mo31573X0(r2)
        L_0x01b3:
            com.yeelight.yeelib.device.base.DeviceStatusBase r12 = r11.mo23221d0()
            byte r2 = r0[r8]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r9 = (long) r2
            r12.mo31600l0(r9)
            byte r12 = r0[r7]
            if (r12 != r7) goto L_0x01f2
            com.yeelight.yeelib.device.base.DeviceStatusBase r12 = r11.mo23221d0()
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r2 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE
            r12.mo31531C0(r2)
            com.yeelight.yeelib.device.base.DeviceStatusBase r12 = r11.mo23221d0()
            byte r2 = r0[r6]
            int r2 = r2 << 8
            byte r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r3
            r12.mo31610q0(r2)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "status notify, mode: sunshine,  value = "
            r12.append(r2)
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r11.mo23221d0()
            int r2 = r2.mo31607p()
        L_0x01ee:
            r12.append(r2)
            goto L_0x0223
        L_0x01f2:
            byte r12 = r0[r7]
            if (r12 != r6) goto L_0x0216
            com.yeelight.yeelib.device.base.DeviceStatusBase r12 = r11.mo23221d0()
            r1 = 6
            byte r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            r12.mo31600l0(r0)
            com.yeelight.yeelib.device.base.DeviceStatusBase r12 = r11.mo23221d0()
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r0 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW
            r12.mo31531C0(r0)
            int r12 = r11.f4751p
            if (r12 != r5) goto L_0x0215
            t3.b r12 = r11.f12440x
            r12.mo42019n()
        L_0x0215:
            return
        L_0x0216:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "get a illegal mode value -> "
            r12.append(r2)
            byte r2 = r0[r7]
            goto L_0x01ee
        L_0x0223:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "onNotification, device status, power: "
            r12.append(r2)
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r11.mo23221d0()
            boolean r2 = r2.mo31584d0()
            r12.append(r2)
            java.lang.String r2 = ", mode: "
            r12.append(r2)
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r11.mo23221d0()
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r2 = r2.mo31627z()
            r12.append(r2)
            r12.append(r1)
            byte r0 = r0[r8]
            r12.append(r0)
            int r12 = r11.f4751p
            if (r12 != r5) goto L_0x0265
            r12 = 11
            r11.mo23184F0(r12)
            android.os.MessageQueue r12 = android.os.Looper.myQueue()
            w3.f0$i r0 = new w3.f0$i
            r0.<init>()
            r12.addIdleHandler(r0)
        L_0x0265:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223w3.C10898f0.mo31511H1(x3.o):void");
    }

    /* renamed from: I1 */
    public void mo31512I1(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Gingko notification enabled !!!!!!! descriptor = ");
        sb.append(bluetoothGattDescriptor.getUuid().toString());
        if (bluetoothGattDescriptor.getCharacteristic().getUuid().toString().equals("8f65073d-9f57-4aaa-afea-397d19d5bbeb")) {
            this.f4759w.mo31412a(2);
        }
    }

    /* renamed from: J1 */
    public void mo31513J1(C11979o oVar) {
    }

    /* renamed from: L1 */
    public void mo31515L1(boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cherry Device, onServiceDiscovered! oad found ? ");
        sb.append(z);
        sb.append(", cherry found ? ");
        sb.append(z2);
        mo23184F0(4);
        if (!z2) {
            this.f20245U.mo42263c(new C10899a(), 100);
        } else if (this.f12440x.mo42013h()) {
            this.f12440x.mo41996Q("CHAR_TELINK_NOTIFY", true);
            this.f4759w.mo31415d();
        } else {
            mo23184F0(0);
        }
    }

    /* renamed from: M1 */
    public boolean mo31516M1() {
        return false;
    }

    /* renamed from: S1 */
    public boolean mo31522S1() {
        return false;
    }

    /* renamed from: T1 */
    public void mo31633T1() {
        if (this.f20254d0) {
            this.f20254d0 = false;
            this.f12440x.mo41984E("CHAR_TELINK_NOTIFY", new byte[]{0});
        }
    }

    /* renamed from: U */
    public String mo23210U() {
        String U = super.mo23210U();
        if (U != null && !U.isEmpty()) {
            return U;
        }
        return C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_gingko) + mo23202Q(mo23185G());
    }

    /* renamed from: U0 */
    public boolean mo23131U0() {
        super.mo23131U0();
        if (this.f12494z.getId() <= 0) {
            return true;
        }
        C6164e eVar = (C6164e) YeelightDeviceManager.m7794j0(this.f12494z.getNetworkName() + "_" + this.f12494z.getId());
        if (eVar == null) {
            return true;
        }
        eVar.mo31758P1();
        return true;
    }

    /* renamed from: X1 */
    public boolean mo31637X1() {
        return this.f20254d0;
    }

    /* renamed from: Y0 */
    public boolean mo23137Y0() {
        super.mo23137Y0();
        this.f20241Q = true;
        this.f20245U.mo42264d(3, 0);
        return true;
    }

    /* renamed from: Y1 */
    public void mo31638Y1(String str, String str2) {
        this.f20246V = Arrays.copyOf(C8965b.m21442c(str), 16);
        this.f20247W = C8965b.m21443d(str2, 16);
        StringBuilder sb = new StringBuilder();
        sb.append("Controller login:");
        sb.append(C8965b.m21440a(this.f20246V));
        sb.append(" , ");
        sb.append(C8965b.m21440a(this.f20247W));
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) (this.f20246V[i] ^ this.f20247W[i]);
        }
        byte[] k3 = m27827k3(this.f20243S);
        byte[] bArr2 = new byte[16];
        System.arraycopy(k3, 0, bArr2, 0, k3.length);
        try {
            byte[] b = AES.m12461b(bArr2, bArr);
            byte[] bArr3 = new byte[17];
            bArr3[0] = Opcode.BLE_GATT_OP_PAIR_ENC_REQ.getValue();
            System.arraycopy(k3, 0, bArr3, 1, k3.length);
            System.arraycopy(b, 8, bArr3, 9, 8);
            C8964a.m21439e(bArr3, 9, 16);
            this.f12440x.mo41984E("CHAR_TELINK_PAIR", bArr3);
            this.f20245U.mo42263c(new C10901c(), 200);
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            e.printStackTrace();
            mo23156r();
        }
    }

    /* renamed from: Z1 */
    public boolean mo31639Z1(int i) {
        if (!mo31636W1()) {
            mo31638Y1(this.f12494z.getNetworkName(), this.f12494z.getPassword());
            return false;
        }
        this.f12440x.mo41984E("CHAR_TELINK_COMMOND", C9202r.m22197a(mo42250l3(), Opcode.BLE_GATT_OP_CTRL_D0.getValue(), i, new byte[]{0, 0, 0}, this.f20244T));
        return false;
    }

    /* renamed from: a2 */
    public boolean mo31640a2(int i) {
        if (!mo31636W1()) {
            mo31638Y1(this.f12494z.getNetworkName(), this.f12494z.getPassword());
            return false;
        }
        this.f12440x.mo41984E("CHAR_TELINK_COMMOND", C9202r.m22197a(mo42250l3(), Opcode.BLE_GATT_OP_CTRL_D0.getValue(), i, new byte[]{1, 0, 0}, this.f20244T));
        return false;
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        boolean b1 = super.mo23140b1();
        if (!mo31635V1().getNetworkName().equals("yeelight_ms")) {
            C6164e eVar = (C6164e) YeelightDeviceManager.m7794j0(mo31635V1().getNetworkName() + "_" + mo31635V1().getId());
            StringBuilder sb = new StringBuilder();
            sb.append("close Network name = ");
            sb.append(mo31635V1().getNetworkName());
            sb.append(", device = ");
            sb.append(eVar);
            if (eVar != null) {
                eVar.mo23167x0();
            }
        }
        return b1;
    }

    /* renamed from: b2 */
    public boolean mo31641b2(int i) {
        if (!mo31636W1()) {
            mo31638Y1(this.f12494z.getNetworkName(), this.f12494z.getPassword());
        } else {
            this.f12440x.mo41984E("CHAR_TELINK_COMMOND", C9202r.m22197a(mo42250l3(), Opcode.BLE_GATT_OP_CTRL_D2.getValue(), SupportMenu.USER_MASK, new byte[]{(byte) i, 0, 0}, this.f20244T));
        }
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        this.f12440x.mo41993N(2, 0);
        if (((C12041e) mo23221d0().mo31611r(2)) != null) {
            mo23221d0().mo31573X0(-1);
        }
        return false;
    }

    /* renamed from: c2 */
    public void mo31642c2(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("device:");
        sb.append(mo23185G());
        sb.append(", getMeshNotification:");
        sb.append(C8964a.m21435a(bArr, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
        byte b = bArr[7];
        Opcode opcode = Opcode.BLE_GATT_OP_CTRL_DB;
        boolean z = false;
        if (b == opcode.getValue()) {
            int i = ((bArr[4] << 8) + bArr[3]) & 255;
            if (bArr[10] == 1) {
                z = true;
            }
            byte b2 = bArr[11] & 255;
            PrivateMeshDeviceBase.C6090a aVar = this.f12493C;
            if (aVar != null) {
                aVar.mo31651b(i, z, b2, opcode.getValue());
                return;
            }
            return;
        }
        byte b3 = bArr[7];
        Opcode opcode2 = Opcode.BLE_GATT_OP_CTRL_DC;
        if (b3 == opcode2.getValue()) {
            byte b4 = bArr[10] & 255;
            byte b5 = -1;
            if (bArr[11] == 0) {
                PrivateMeshDeviceBase.C6090a aVar2 = this.f12493C;
                if (aVar2 != null) {
                    aVar2.mo31652e(b4);
                }
            } else {
                boolean z2 = bArr[12] > 0;
                byte b6 = z2 ? bArr[12] & 255 : -1;
                PrivateMeshDeviceBase.C6090a aVar3 = this.f12493C;
                if (aVar3 != null) {
                    aVar3.mo31651b(b4, z2, b6, opcode2.getValue());
                }
            }
            if (bArr[14] != 0 || bArr[15] != 0 || bArr[16] != 0 || bArr[17] != 0) {
                byte b7 = bArr[14] & 255;
                if (bArr[15] == 0) {
                    PrivateMeshDeviceBase.C6090a aVar4 = this.f12493C;
                    if (aVar4 != null) {
                        aVar4.mo31652e(b7);
                        return;
                    }
                    return;
                }
                if (bArr[16] > 0) {
                    z = true;
                }
                if (z) {
                    b5 = bArr[16] & 255;
                }
                PrivateMeshDeviceBase.C6090a aVar5 = this.f12493C;
                if (aVar5 != null) {
                    aVar5.mo31651b(b7, z, b5, opcode2.getValue());
                }
            }
        }
    }

    /* renamed from: d2 */
    public void mo31643d2() {
        if (!this.f20254d0) {
            this.f20254d0 = true;
            StringBuilder sb = new StringBuilder();
            sb.append("open onLine status from : ");
            sb.append(mo23185G());
            this.f12440x.mo41984E("CHAR_TELINK_NOTIFY", new byte[]{1});
        }
    }

    /* renamed from: f1 */
    public boolean mo23142f1(boolean z) {
        return false;
    }

    /* renamed from: f2 */
    public void mo31644f2() {
        this.f12440x.mo41984E("CHAR_TELINK_COMMOND", C9202r.m22197a(mo42250l3(), Opcode.BLE_GATT_OP_CTRL_DA.getValue(), SupportMenu.USER_MASK, new byte[]{ParameterInitDefType.ExternalSamplerInit}, this.f20244T));
    }

    /* renamed from: g0 */
    public int mo23143g0() {
        C10915k kVar = this.f20249Y;
        if (kVar != null) {
            return kVar.mo42275j();
        }
        return 0;
    }

    /* renamed from: k2 */
    public void mo31649k2(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = null;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            if (b != 0) {
                int i3 = i + 1;
                byte b2 = bArr[i3] & 255;
                int i4 = i3 + 1;
                if (b2 == 9) {
                    int i5 = b - 1;
                    if (i5 <= 16 && i5 > 0) {
                        byte[] bArr3 = new byte[i5];
                        System.arraycopy(bArr, i4, bArr3, 0, i5);
                        bArr2 = bArr3;
                    } else {
                        return;
                    }
                } else if (b2 == 255 && (i2 = i2 + 1) == 2) {
                    int i6 = i4 + 1;
                    int i7 = i6 + 1;
                    int i8 = (bArr[i4] << 8) + bArr[i6];
                    if (i8 == 4354 || i8 == 25601) {
                        int i9 = i7 + 1;
                        int i10 = bArr[i7] + (bArr[i9] << 8);
                        int i11 = i9 + 1 + 4;
                        int i12 = i11 + 1;
                        int i13 = i12 + 1;
                        int i14 = bArr[i11] + (bArr[i12] << 8);
                        int i15 = i13 + 1;
                        byte b3 = 255 & bArr[i13];
                        int i16 = bArr[i15] + (bArr[i15 + 1] << 8);
                        this.f12491A.put("ADV_MESH_NAME", bArr2);
                        this.f12491A.put("ADV_MESH_ADDRESS", Integer.valueOf(i16));
                        this.f12491A.put("ADV_MESH_UUID", Integer.valueOf(i10));
                        this.f12491A.put("ADV_PRODUCT_UUID", Integer.valueOf(i14));
                        this.f12491A.put("ADV_STATUS", Integer.valueOf(b3));
                        try {
                            if ("yeelight_ms".equals(new String(bArr2, "utf-8")) && !"yeelight_ms".equals(mo31635V1().getNetworkName())) {
                                mo31647i2(new MeshNetWork());
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        return;
                    }
                }
                i += b + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        boolean l1 = super.mo23148l1();
        if (!mo31635V1().getNetworkName().equals("yeelight_ms")) {
            C6164e eVar = (C6164e) YeelightDeviceManager.m7794j0(mo31635V1().getNetworkName() + "_" + mo31635V1().getId());
            StringBuilder sb = new StringBuilder();
            sb.append("open Network name = ");
            sb.append(mo31635V1().getNetworkName());
            sb.append(", device = ");
            sb.append(eVar);
            if (eVar != null) {
                eVar.mo23167x0();
            }
        }
        return l1;
    }

    /* renamed from: l2 */
    public boolean mo31650l2(String str, String str2) {
        this.f12440x.mo41984E("CHAR_TELINK_PAIR", C9202r.m22198b(Opcode.BLE_GATT_OP_PAIR_NETWORK_NAME.getValue(), str, this.f20244T));
        this.f12440x.mo41984E("CHAR_TELINK_PAIR", C9202r.m22198b(Opcode.BLE_GATT_OP_PAIR_PASS.getValue(), str2, this.f20244T));
        byte[] bArr = {-64, -63, -62, -61, -60, -59, -58, -57, -40, -39, -38, -37, -36, -35, -34, -33};
        this.f12440x.mo41984E("CHAR_TELINK_PAIR", C9202r.m22199c(Opcode.BLE_GATT_OP_PAIR_LTK.getValue(), bArr, this.f20244T));
        return this.f12440x.mo42028w("CHAR_TELINK_PAIR", new C10903d(C8965b.m21443d(str, 16), C8965b.m21443d(str2, 16), bArr));
    }

    /* renamed from: l3 */
    public byte[] mo42250l3() {
        if (this.f20248X == null) {
            String[] split = mo23204R().split(Constants.COLON_SEPARATOR);
            int length = split.length;
            this.f20248X = new byte[length];
            for (int i = 0; i < length; i++) {
                this.f20248X[i] = (byte) (Integer.parseInt(split[i], 16) & 255);
            }
            C8964a.m21439e(this.f20248X, 0, length - 1);
        }
        return this.f20248X;
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        return false;
    }

    /* renamed from: m3 */
    public byte[] mo42251m3() {
        return this.f20244T;
    }

    /* renamed from: n */
    public void mo23151n() {
        C3064h.m7982j().mo23393m(mo23208T());
        StringBuilder sb = new StringBuilder();
        sb.append("Gingko device connect, device: ");
        sb.append(mo23185G());
        if (C3108x.m8223f().mo23540a()) {
            if (mo23113A() == 0 || mo23113A() == 1) {
                this.f20245U.mo42262b(new C10900b());
                mo23184F0(2);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Gingko Device, connect, state: ");
            sb2.append(mo23113A());
            sb2.append(", return!");
        }
    }

    /* renamed from: o3 */
    public void mo42252o3() {
        mo31638Y1(this.f12494z.getNetworkName(), "YEE_ERR");
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 1024) {
            DeviceDataProvider.m17615a0(this);
        }
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        return super.mo23154p1(j);
    }

    /* renamed from: q3 */
    public void mo42253q3(boolean z) {
        this.f20242R = z;
    }

    /* renamed from: r */
    public void mo23156r() {
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
        this.f12440x.mo41993N(1, i);
        if (((C12041e) mo23221d0().mo31611r(2)) == null) {
            return false;
        }
        mo23221d0().mo31573X0(i);
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        if (i == 0) {
            this.f12440x.mo42022q();
        } else if (i != 1) {
            int i2 = 2;
            if (i == 2) {
                this.f12440x.mo42021p();
            } else if (i == 7) {
                this.f12440x.mo41982C();
                MeshNetWork meshNetWork = this.f12494z;
                mo31647i2(new MeshNetWork());
                DeviceDataProvider.m17619c0(this.f4753r, 0);
                C6164e eVar = (C6164e) YeelightDeviceManager.m7794j0(meshNetWork.getNetworkName() + "_" + meshNetWork.getId());
                if (eVar != null) {
                    eVar.mo31758P1();
                }
                mo23198N0(C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_gingko) + mo23202Q(mo23185G()));
            } else if (i == 10 || i == 14) {
                C12041e eVar2 = (C12041e) obj;
                if (eVar2.mo42679c()) {
                    i2 = 1;
                }
                this.f12440x.mo41993N(Integer.valueOf(i2).intValue(), Integer.valueOf(eVar2.mo42678b()).intValue());
                mo23221d0().mo31577a(eVar2);
            }
        } else {
            String str = (String) obj;
            this.f12440x.mo42030z(str);
            StringBuilder sb = new StringBuilder();
            sb.append("rename to: ");
            sb.append(obj);
            sb.append(", length: ");
            sb.append(str.length());
        }
        return true;
    }

    /* renamed from: y0 */
    public void mo23169y0() {
        super.mo23169y0();
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }
}
