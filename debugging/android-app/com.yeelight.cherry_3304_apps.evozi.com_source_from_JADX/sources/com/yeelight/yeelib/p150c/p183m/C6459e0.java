package com.yeelight.yeelib.p150c.p183m;

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
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.common.device.Device;
import com.telink.bluetooth.light.C3967a;
import com.telink.crypto.AES;
import com.telink.p148a.C3961a;
import com.telink.p149b.C3962a;
import com.telink.p149b.C3963b;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.models.C7636l0;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.C6000f;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6047m;
import com.yeelight.yeelib.p150c.p179j.C6085b;
import com.yeelight.yeelib.p150c.p180k.C6107c;
import com.yeelight.yeelib.p150c.p184n.C7549a;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p152f.C4214g;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9850s;
import com.yeelight.yeelib.p178b.C5968a;
import com.yeelight.yeelib.p178b.C5969b;
import com.yeelight.yeelib.utils.C10539d;
import com.yeelight.yeelib.utils.C10540e;
import com.yeelight.yeelib.utils.C10556t;
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

/* renamed from: com.yeelight.yeelib.c.m.e0 */
public class C6459e0 extends C6047m {
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f13560H = false;

    /* renamed from: I */
    private boolean f13561I = false;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public byte[] f13562J = new byte[8];
    /* access modifiers changed from: private */

    /* renamed from: K */
    public byte[] f13563K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C6474j f13564L = new C6474j();
    /* access modifiers changed from: private */

    /* renamed from: M */
    public byte[] f13565M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public byte[] f13566N;

    /* renamed from: O */
    private byte[] f13567O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C6476k f13568P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public long f13569Q;

    /* renamed from: R */
    private Timer f13570R;

    /* renamed from: S */
    private C6472h f13571S;

    /* renamed from: T */
    private StringBuffer f13572T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f13573U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C6085b.C6090e f13574V = new C6468f();

    /* renamed from: com.yeelight.yeelib.c.m.e0$a */
    class C6460a implements Runnable {
        C6460a() {
        }

        public void run() {
            boolean h = C6459e0.this.f12658x.mo27972h();
            "enable notify res = " + h;
            if (h) {
                C6459e0.this.f7261w.mo27468a(2);
            }
            if (C6459e0.this.f12658x.mo27955Q("CHAR_TELINK_NOTIFY", true)) {
                C6459e0.this.f12658x.mo27955Q("CHAR_GINGKO_NOTIFY", true);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e0$b */
    class C6461b implements Runnable {
        C6461b() {
        }

        public void run() {
            C6459e0.this.f12658x.mo27968d();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e0$c */
    class C6462c implements Runnable {

        /* renamed from: com.yeelight.yeelib.c.m.e0$c$a */
        class C6463a implements C6085b.C6090e {
            C6463a() {
            }

            /* renamed from: a */
            public void mo27916a() {
            }

            public void onSuccess(byte[] bArr) {
                String str = C5972a.f12657y;
                "ReadCharacteristic from callback value = " + C10539d.m25676g(bArr) + " thread = " + Thread.currentThread();
                if (bArr[0] == C3967a.BLE_GATT_OP_PAIR_ENC_FAIL.mo22535a() || bArr[0] == 0) {
                    if (C6459e0.this.f13560H) {
                        C6459e0.this.f13564L.mo28195d(8, 0);
                    }
                    C3961a.m10648b("Login failed, encryption is not correct");
                    boolean unused = C6459e0.this.f12856B = false;
                    boolean unused2 = C6459e0.this.f13573U = false;
                    C6459e0.this.mo23408d0().mo27689g0(805306372);
                    if (C6459e0.this.f12857G != null) {
                        C6459e0.this.f12857G.mo27545i();
                        return;
                    }
                    return;
                }
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArr, 1, bArr2, 0, 16);
                System.arraycopy(bArr, 1, bArr3, 0, 8);
                try {
                    byte[] unused3 = C6459e0.this.f13563K = C6459e0.this.m19486n3(C6459e0.this.f13565M, C6459e0.this.f13566N, C6459e0.this.f13562J, bArr3, bArr2);
                    C3961a.m10647a("Login success");
                    boolean unused4 = C6459e0.this.f12856B = true;
                    if (C6459e0.this.f13560H) {
                        C6459e0.this.f13564L.mo28195d(4, 0);
                    }
                    C6459e0.this.mo23408d0().mo27689g0(536870916);
                    if (C6459e0.this.f12857G != null) {
                        C6459e0.this.f12857G.mo27541f();
                    } else {
                        C3961a.m10648b("Login success, but listener is null");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    boolean unused5 = C6459e0.this.f12856B = false;
                    boolean unused6 = C6459e0.this.f13573U = false;
                    if (C6459e0.this.f13560H) {
                        C6459e0.this.mo23371F0(13);
                    }
                    if (C6459e0.this.f12857G != null) {
                        C6459e0.this.f12857G.mo27545i();
                    }
                }
            }
        }

        C6462c() {
        }

        public void run() {
            C6459e0.this.f12658x.mo27987w("CHAR_TELINK_PAIR", new C6463a());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e0$d */
    class C6464d implements C6085b.C6090e {

        /* renamed from: a */
        final /* synthetic */ byte[] f13579a;

        /* renamed from: b */
        final /* synthetic */ byte[] f13580b;

        /* renamed from: c */
        final /* synthetic */ byte[] f13581c;

        C6464d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.f13579a = bArr;
            this.f13580b = bArr2;
            this.f13581c = bArr3;
        }

        /* renamed from: a */
        public void mo27916a() {
            C6459e0.this.mo23408d0().mo27689g0(805306370);
        }

        public void onSuccess(byte[] bArr) {
            if (bArr[0] == C3967a.BLE_GATT_OP_PAIR_CONFIRM.mo22535a()) {
                try {
                    byte[] bArr2 = new byte[16];
                    for (int i = 0; i < 16; i++) {
                        bArr2[i] = (byte) ((this.f13579a[i] ^ this.f13580b[i]) ^ this.f13581c[i]);
                    }
                    byte[] d = C3962a.m10652d(AES.m10666b(C6459e0.this.f13563K, bArr2));
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(bArr, 1, bArr3, 0, 16);
                    if (!C3962a.m10651c(d, bArr3)) {
                        C6459e0.this.mo23408d0().mo27689g0(805306370);
                    } else {
                        C6459e0.this.mo23408d0().mo27689g0(536870914);
                    }
                } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
                    C6459e0.this.mo23408d0().mo27689g0(805306370);
                }
            } else {
                C6459e0.this.mo23408d0().mo27689g0(805306370);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e0$e */
    class C6465e implements Runnable {

        /* renamed from: com.yeelight.yeelib.c.m.e0$e$a */
        class C6466a implements C6085b.C6090e {

            /* renamed from: com.yeelight.yeelib.c.m.e0$e$a$a */
            class C6467a implements Runnable {
                C6467a() {
                }

                public void run() {
                    "read CHAR_TELINK_OTAin thread = " + Thread.currentThread().getName();
                    "OTA complete! total time: " + ((System.currentTimeMillis() - C6459e0.this.f13569Q) / 1000) + C7230s.f14753G;
                    boolean unused = C6459e0.this.f13568P.m19557l();
                    C6459e0.this.mo23371F0(9);
                }
            }

            C6466a() {
            }

            /* renamed from: a */
            public void mo27916a() {
            }

            public void onSuccess(byte[] bArr) {
                "send last packet success in thread = " + Thread.currentThread().getName();
                C6459e0.this.f13564L.mo28193b(new C6467a());
            }
        }

        C6465e() {
        }

        public void run() {
            boolean unused = C6459e0.this.f13568P.m19557l();
            if (C6459e0.this.f13568P.mo28207k()) {
                "ota progress:" + C6459e0.this.f13568P.mo28204h() + " in thread = " + Thread.currentThread().getName();
                C6459e0.this.f12658x.mo27945G("CHAR_TELINK_OTA", C6459e0.this.f13568P.mo28203g(), C6459e0.this.f13574V);
                return;
            }
            "send last packet in thread = " + Thread.currentThread().getName();
            C6459e0.this.f12658x.mo27945G("CHAR_TELINK_OTA", C6459e0.this.f13568P.mo28202f(), new C6466a());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e0$f */
    class C6468f implements C6085b.C6090e {

        /* renamed from: com.yeelight.yeelib.c.m.e0$f$a */
        class C6469a implements Runnable {

            /* renamed from: com.yeelight.yeelib.c.m.e0$f$a$a */
            class C6470a implements C6085b.C6090e {
                C6470a() {
                }

                /* renamed from: a */
                public void mo27916a() {
                    boolean unused = C6459e0.this.m19489p3();
                }

                public void onSuccess(byte[] bArr) {
                    "read success : " + C3962a.m10649a(bArr, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    boolean unused = C6459e0.this.m19489p3();
                }
            }

            C6469a() {
            }

            public void run() {
                C6459e0.this.f12658x.mo27987w("CHAR_TELINK_OTA", new C6470a());
            }
        }

        C6468f() {
        }

        /* renamed from: a */
        public void mo27916a() {
            boolean unused = C6459e0.this.m19489p3();
        }

        public void onSuccess(byte[] bArr) {
            "mOtaCallback success : " + C3962a.m10649a(bArr, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (C6459e0.this.f13568P.mo28204h() % 17 == 0) {
                C6459e0.this.f13564L.mo28194c(new C6469a(), 180);
            } else {
                boolean unused = C6459e0.this.m19489p3();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e0$g */
    static /* synthetic */ class C6471g {

        /* renamed from: a */
        static final /* synthetic */ int[] f13589a;

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
                com.yeelight.yeelib.device.models.a[] r0 = com.yeelight.yeelib.device.models.C7610a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13589a = r0
                com.yeelight.yeelib.device.models.a r1 = com.yeelight.yeelib.device.models.C7610a.STATUSNOTIFITATION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13589a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.models.a r1 = com.yeelight.yeelib.device.models.C7610a.VERSIONNOTIFICATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13589a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.device.models.a r1 = com.yeelight.yeelib.device.models.C7610a.AUTHORIZATIONNOTIFICATION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13589a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.device.models.a r1 = com.yeelight.yeelib.device.models.C7610a.LIGHTNAMENOTIFICATION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13589a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yeelight.yeelib.device.models.a r1 = com.yeelight.yeelib.device.models.C7610a.DELAYTIMENOTIFICATION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f13589a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.yeelight.yeelib.device.models.a r1 = com.yeelight.yeelib.device.models.C7610a.BATTERYNOTIFICATION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f13589a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.yeelight.yeelib.device.models.a r1 = com.yeelight.yeelib.device.models.C7610a.FACTORYNOTIFICATION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6459e0.C6471g.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e0$h */
    public class C6472h extends TimerTask {
        public C6472h() {
        }

        public void run() {
            "ConnectTask is running now! cur state: " + C6459e0.this.f7253p;
            if (!(C6459e0.this.f7253p == 1 || C6459e0.this.f7253p == 0)) {
                if (C6459e0.this.f7253p == 2) {
                    C6459e0.this.mo23371F0(1);
                } else {
                    return;
                }
            }
            C6459e0.this.mo23337n();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e0$i */
    class C6473i implements MessageQueue.IdleHandler {
        C6473i() {
        }

        public boolean queueIdle() {
            C6459e0.this.f12658x.mo27980p();
            C6459e0.this.f12658x.mo27944F("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25696M().mo29066a()));
            return false;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e0$j */
    class C6474j extends Thread {

        /* renamed from: a */
        public Handler f13592a;

        /* renamed from: com.yeelight.yeelib.c.m.e0$j$a */
        class C6475a extends Handler {
            C6475a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    int g3 = C6459e0.this.f7253p;
                    if (g3 == 0) {
                        return;
                    }
                    if (g3 == 9 || g3 != 12) {
                        C6459e0.this.mo23342r();
                    } else {
                        C6459e0.this.mo23371F0(0);
                    }
                } else if (i == 2) {
                    C6459e0.this.mo23371F0(0);
                } else if (i == 3) {
                    C6459e0 e0Var = C6459e0.this;
                    C6476k unused = e0Var.f13568P = new C6476k(e0Var, (C6460a) null);
                    File d = ((C4214g.C4220e) C4214g.m11665j().mo23494m(C6459e0.this.mo23395T())).mo23522d();
                    "ota file = " + d.getAbsolutePath();
                    try {
                        FileInputStream fileInputStream = new FileInputStream(d);
                        "Fw file size = " + fileInputStream.available();
                        byte[] bArr = new byte[fileInputStream.available()];
                        fileInputStream.read(bArr);
                        C6459e0.this.f13568P.mo28208m(bArr);
                        fileInputStream.close();
                        long unused2 = C6459e0.this.f13569Q = System.currentTimeMillis();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    C6459e0 e0Var2 = C6459e0.this;
                    e0Var2.mo27808Y1(e0Var2.f12858z.mo31822c(), C6459e0.this.f12858z.mo31823d());
                } else if (i != 4) {
                    switch (i) {
                        case 8:
                            C6459e0.this.mo23371F0(13);
                            return;
                        case 9:
                            C6459e0.this.f12658x.mo27944F("CHAR_GINGKO_CTRL", C10539d.m25671b(C10540e.m25697N().mo29066a()));
                            return;
                        case 10:
                            C6459e0.this.mo23371F0(14);
                            return;
                        default:
                            return;
                    }
                } else {
                    boolean unused3 = C6459e0.this.m19489p3();
                }
            }
        }

        C6474j() {
        }

        /* renamed from: b */
        public void mo28193b(Runnable runnable) {
            Handler handler = this.f13592a;
            if (handler == null) {
                mo28194c(runnable, 1000);
            } else {
                handler.post(runnable);
            }
        }

        /* renamed from: c */
        public void mo28194c(Runnable runnable, int i) {
            Handler handler = this.f13592a;
            if (handler == null) {
                mo28194c(runnable, 1000);
            } else {
                handler.postDelayed(runnable, (long) i);
            }
        }

        /* renamed from: d */
        public void mo28195d(int i, int i2) {
            this.f13592a.sendEmptyMessageDelayed(i, (long) i2);
        }

        public void run() {
            Looper.prepare();
            this.f13592a = new C6475a();
            Looper.loop();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.e0$k */
    private class C6476k {

        /* renamed from: a */
        private int f13595a;

        /* renamed from: b */
        private int f13596b;

        /* renamed from: c */
        private byte[] f13597c;

        /* renamed from: d */
        private int f13598d;

        private C6476k(C6459e0 e0Var) {
            this.f13596b = -1;
        }

        /* synthetic */ C6476k(C6459e0 e0Var, C6460a aVar) {
            this(e0Var);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public boolean m19557l() {
            int floor = (int) Math.floor((double) ((((float) mo28204h()) / ((float) this.f13595a)) * 100.0f));
            if (floor == this.f13598d) {
                return false;
            }
            this.f13598d = floor;
            return true;
        }

        /* renamed from: b */
        public void mo28198b() {
            this.f13598d = 0;
            this.f13595a = 0;
            this.f13596b = -1;
            this.f13597c = null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo28199c(byte[] r10) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6459e0.C6476k.mo28199c(byte[]):int");
        }

        /* renamed from: d */
        public void mo28200d(byte[] bArr, int i) {
            int length = bArr.length - 2;
            bArr[length] = (byte) (i & 255);
            bArr[length + 1] = (byte) ((i >> 8) & 255);
        }

        /* renamed from: e */
        public void mo28201e(byte[] bArr, int i) {
            bArr[0] = (byte) (i & 255);
            bArr[1] = (byte) ((i >> 8) & 255);
        }

        /* renamed from: f */
        public byte[] mo28202f() {
            byte[] bArr = new byte[4];
            int h = mo28204h();
            mo28201e(bArr, h);
            int c = mo28199c(bArr);
            mo28200d(bArr, c);
            C3961a.m10647a("ota check packet ---> index : " + h + " crc : " + c + " content : " + C3962a.m10649a(bArr, Constants.COLON_SEPARATOR));
            return bArr;
        }

        /* renamed from: g */
        public byte[] mo28203g() {
            int h = mo28204h();
            byte[] i = mo28205i(h);
            this.f13596b = h;
            return i;
        }

        /* renamed from: h */
        public int mo28204h() {
            return this.f13596b + 1;
        }

        /* renamed from: i */
        public byte[] mo28205i(int i) {
            int length = this.f13597c.length;
            if (length > 16) {
                length = i + 1 == this.f13595a ? length - (i * 16) : 16;
            }
            int i2 = length + 4;
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f13597c, i * 16, bArr, 2, i2 - 4);
            mo28201e(bArr, i);
            int c = mo28199c(bArr);
            mo28200d(bArr, c);
            C3961a.m10647a("ota packet ---> index : " + i + " total : " + this.f13595a + " crc : " + c + " content : " + C3962a.m10649a(bArr, Constants.COLON_SEPARATOR));
            return bArr;
        }

        /* renamed from: j */
        public int mo28206j() {
            return this.f13598d;
        }

        /* renamed from: k */
        public boolean mo28207k() {
            int i = this.f13595a;
            return i > 0 && this.f13596b + 1 < i;
        }

        /* renamed from: m */
        public void mo28208m(byte[] bArr) {
            mo28198b();
            this.f13597c = bArr;
            int length = bArr.length;
            int i = length % 16;
            int i2 = length / 16;
            if (i != 0) {
                i2 = (int) Math.floor((double) (i2 + 1));
            }
            this.f13595a = i2;
        }
    }

    public C6459e0(String str, String str2, Device.Ownership ownership, boolean z, String str3) {
        super(str, "yeelink.light.gingko", new C7549a(str3));
        this.f13564L.start();
        mo23386O0(ownership);
        mo23408d0().mo27646J0(z);
        mo23381L0(str2);
    }

    /* renamed from: k3 */
    private byte[] m19483k3(byte[] bArr) {
        new Random().nextBytes(bArr);
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public byte[] m19486n3(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[16];
        System.arraycopy(bArr4, 0, bArr6, 0, bArr4.length);
        byte[] bArr7 = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr7[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        byte[] b = AES.m10666b(bArr6, bArr7);
        byte[] bArr8 = new byte[16];
        System.arraycopy(bArr4, 0, bArr8, 0, bArr4.length);
        System.arraycopy(b, 8, bArr8, 8, 8);
        C3962a.m10653e(bArr8, 8, 15);
        if (!C3962a.m10651c(bArr8, bArr5)) {
            return null;
        }
        System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
        System.arraycopy(bArr4, 0, bArr6, 8, bArr4.length);
        byte[] b2 = AES.m10666b(bArr7, bArr6);
        C3962a.m10653e(b2, 0, b2.length - 1);
        return b2;
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public boolean m19489p3() {
        if (this.f7253p == 0) {
            return false;
        }
        this.f13564L.mo28194c(new C6465e(), 15);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public void mo27474C1() {
        C6107c cVar = new C6107c(this);
        this.f12658x = cVar;
        this.f7261w = new C5968a(cVar);
        mo23365B0(this);
        mo27486O1(this);
    }

    /* renamed from: D1 */
    public void mo27475D1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        C3961a.m10647a("characteristic = " + bluetoothGattCharacteristic.getUuid().toString() + " value = " + C3962a.m10650b(bluetoothGattCharacteristic.getValue()) + " hexStr = " + C10539d.m25676g(bluetoothGattCharacteristic.getValue()));
    }

    /* renamed from: E1 */
    public void mo27476E1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        "characteristic: " + bluetoothGattCharacteristic.getUuid().toString() + ", write succeed status: " + i + " value = " + C3962a.m10649a(bluetoothGattCharacteristic.getValue(), Constants.ACCEPT_TIME_SEPARATOR_SERVER);
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_gingko_small;
    }

    /* renamed from: F1 */
    public void mo27477F1() {
        this.f12658x.mo27971g();
        mo23371F0(3);
    }

    /* renamed from: G1 */
    public void mo27478G1() {
        this.f12856B = false;
        this.f13573U = false;
        if (this.f7253p == 9) {
            mo23371F0(1);
            this.f7261w.mo27472e(C5969b.C5970a.AUTH_UNKNOWN);
            this.f13570R = new Timer();
            C6472h hVar = new C6472h();
            this.f13571S = hVar;
            this.f13570R.schedule(hVar, 3000, 10000);
            return;
        }
        mo23371F0(0);
        this.f7261w.mo27472e(C5969b.C5970a.AUTH_UNKNOWN);
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_gingko_big;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: H1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27479H1(com.yeelight.yeelib.device.models.C7636l0 r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Gingko, onNotification "
            r0.append(r1)
            java.lang.String r1 = r12.f15575a
            java.lang.String r1 = com.yeelight.yeelib.device.models.C7610a.m22470b(r1)
            r0.append(r1)
            java.lang.String r1 = "  "
            r0.append(r1)
            byte[] r2 = r12.mo29081a()
            java.lang.String r2 = com.yeelight.yeelib.utils.C10539d.m25676g(r2)
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            byte[] r2 = r12.mo29081a()
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            r0.toString()
            byte[] r0 = r12.mo29081a()
            int[] r2 = com.yeelight.yeelib.p150c.p183m.C6459e0.C6471g.f13589a
            java.lang.String r3 = r12.f15575a
            com.yeelight.yeelib.device.models.a r3 = com.yeelight.yeelib.device.models.C7610a.m22469a(r3)
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
                case 1: goto L_0x0198;
                case 2: goto L_0x0151;
                case 3: goto L_0x012f;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00a3;
                case 6: goto L_0x006f;
                case 7: goto L_0x0056;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x027a
        L_0x0056:
            byte r12 = r0[r6]
            if (r12 == r8) goto L_0x027a
            com.yeelight.yeelib.c.k.b r12 = r11.f12658x
            com.yeelight.yeelib.device.models.e r0 = com.yeelight.yeelib.utils.C10540e.m25709d()
            java.lang.String r0 = r0.mo29066a()
            byte[] r0 = com.yeelight.yeelib.utils.C10539d.m25671b(r0)
            java.lang.String r1 = "CHAR_GINGKO_CTRL"
            r12.mo27944F(r1, r0)
            goto L_0x027a
        L_0x006f:
            byte r12 = r0[r6]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = com.yeelight.yeelib.utils.C10539d.m25676g(r0)
            r1.append(r2)
            r1.toString()
            if (r12 == r7) goto L_0x008a
        L_0x0085:
            r11.mo23371F0(r5)
            goto L_0x027a
        L_0x008a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.String r0 = com.yeelight.yeelib.utils.C10539d.m25676g(r0)
            r12.append(r0)
            r12.toString()
            com.yeelight.yeelib.c.m.e0$j r12 = r11.f13564L
            r12.mo28195d(r3, r9)
            goto L_0x027a
        L_0x00a3:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.String r1 = com.yeelight.yeelib.utils.C10539d.m25676g(r0)
            r12.append(r1)
            r12.toString()
            byte r12 = r0[r6]
            com.yeelight.yeelib.c.n.e r1 = new com.yeelight.yeelib.c.n.e
            byte r0 = r0[r7]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.<init>(r0, r12)
            com.yeelight.yeelib.c.i.e r12 = r11.mo23408d0()
            r12.mo27676a(r1)
            goto L_0x027a
        L_0x00c9:
            byte r12 = r0[r8]
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r1 = r0[r7]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 13
            java.lang.String r3 = ""
            if (r12 != 0) goto L_0x0103
            int r12 = r0.length
            r4 = 0
        L_0x00d9:
            if (r4 >= r12) goto L_0x00e4
            byte r5 = r0[r4]
            if (r5 <= 0) goto L_0x00e1
            r8 = 0
            goto L_0x00e4
        L_0x00e1:
            int r4 = r4 + 1
            goto L_0x00d9
        L_0x00e4:
            if (r8 == 0) goto L_0x00ea
            r11.mo23385N0(r3)
            return
        L_0x00ea:
            java.lang.StringBuffer r12 = new java.lang.StringBuffer
            r12.<init>()
            r11.f13572T = r12
            if (r1 > r2) goto L_0x00fc
            byte[] r12 = new byte[r1]
            java.lang.System.arraycopy(r0, r6, r12, r9, r1)
            java.lang.String r3 = com.yeelight.yeelib.utils.C10539d.m25676g(r12)
        L_0x00fc:
            java.lang.StringBuffer r12 = r11.f13572T
            r12.append(r3)
            goto L_0x027a
        L_0x0103:
            if (r12 != r8) goto L_0x027a
            java.lang.StringBuffer r12 = r11.f13572T
            if (r12 != 0) goto L_0x010a
            return
        L_0x010a:
            if (r1 > r2) goto L_0x0115
            byte[] r12 = new byte[r1]
            java.lang.System.arraycopy(r0, r6, r12, r9, r1)
            java.lang.String r3 = com.yeelight.yeelib.utils.C10539d.m25676g(r12)
        L_0x0115:
            java.lang.StringBuffer r12 = r11.f13572T
            r12.append(r3)
            java.lang.StringBuffer r12 = r11.f13572T
            java.lang.String r12 = r12.toString()
            java.lang.String r12 = com.yeelight.yeelib.utils.C10539d.m25679j(r12)
            r0 = 0
            r11.f13572T = r0
            if (r12 != 0) goto L_0x012a
            return
        L_0x012a:
            r11.mo23385N0(r12)
            goto L_0x027a
        L_0x012f:
            byte r12 = r0[r9]
            if (r12 != r7) goto L_0x013c
            com.yeelight.yeelib.b.b r12 = r11.f7261w
            com.yeelight.yeelib.b.b$a r0 = com.yeelight.yeelib.p178b.C5969b.C5970a.AUTH_SUC
        L_0x0137:
            r12.mo27472e(r0)
            goto L_0x027a
        L_0x013c:
            byte r12 = r0[r9]
            if (r12 != r8) goto L_0x0145
            com.yeelight.yeelib.b.b r12 = r11.f7261w
            com.yeelight.yeelib.b.b$a r0 = com.yeelight.yeelib.p178b.C5969b.C5970a.AUTH_IP
            goto L_0x0137
        L_0x0145:
            com.yeelight.yeelib.b.b r12 = r11.f7261w
            com.yeelight.yeelib.b.b$a r0 = com.yeelight.yeelib.p178b.C5969b.C5970a.AUTH_FAIL
            r12.mo27472e(r0)
            r11.mo23342r()
            goto L_0x027a
        L_0x0151:
            byte[] r12 = r12.mo29081a()
            r0 = 0
        L_0x0156:
            int r1 = r12.length
            if (r0 >= r1) goto L_0x0168
            byte r1 = r12[r0]
            if (r1 != 0) goto L_0x0166
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 != 0) goto L_0x0165
            int r1 = r1 - r8
            goto L_0x0169
        L_0x0165:
            r0 = r1
        L_0x0166:
            int r0 = r0 + r8
            goto L_0x0156
        L_0x0168:
            r1 = 0
        L_0x0169:
            if (r1 <= 0) goto L_0x027a
            byte[] r0 = new byte[r1]
            java.lang.System.arraycopy(r12, r9, r0, r9, r1)
            java.lang.String r12 = new java.lang.String
            r12.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onNotification, device firmware version: "
            r0.append(r1)
            r0.append(r12)
            r0.toString()
            com.yeelight.yeelib.device.models.h r0 = new com.yeelight.yeelib.device.models.h
            r0.<init>(r12)
            r11.mo23378J0(r0)
            boolean r12 = r11.f13561I
            if (r12 == 0) goto L_0x0085
            r11.f13561I = r9
            r11.mo23323Y0()
            goto L_0x027a
        L_0x0198:
            com.yeelight.yeelib.c.i.e r12 = r11.mo23408d0()
            byte r2 = r0[r9]
            if (r2 != r8) goto L_0x01a2
            r2 = 1
            goto L_0x01a3
        L_0x01a2:
            r2 = 0
        L_0x01a3:
            r12.mo27648K0(r2)
            byte r12 = r0[r9]
            if (r12 == r8) goto L_0x01c2
            com.yeelight.yeelib.c.i.e r12 = r11.mo23408d0()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Object r12 = r12.mo27710r(r2)
            com.yeelight.yeelib.c.n.e r12 = (com.yeelight.yeelib.p150c.p184n.C7554e) r12
            if (r12 == 0) goto L_0x01c2
            com.yeelight.yeelib.c.i.e r12 = r11.mo23408d0()
            r2 = -1
            r12.mo27670V0(r2)
        L_0x01c2:
            com.yeelight.yeelib.c.i.e r12 = r11.mo23408d0()
            byte r2 = r0[r8]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r9 = (long) r2
            r12.mo27697k0(r9)
            byte r12 = r0[r7]
            if (r12 != r7) goto L_0x0204
            com.yeelight.yeelib.c.i.e r12 = r11.mo23408d0()
            com.yeelight.yeelib.c.i.e$d r2 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_SUNSHINE
            r12.mo27630B0(r2)
            com.yeelight.yeelib.c.i.e r12 = r11.mo23408d0()
            byte r2 = r0[r6]
            int r2 = r2 << 8
            byte r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r3
            r12.mo27707p0(r2)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "status notify, mode: sunshine,  value = "
            r12.append(r2)
            com.yeelight.yeelib.c.i.e r2 = r11.mo23408d0()
            int r2 = r2.mo27706p()
        L_0x01fd:
            r12.append(r2)
            r12.toString()
            goto L_0x0235
        L_0x0204:
            byte r12 = r0[r7]
            if (r12 != r6) goto L_0x0228
            com.yeelight.yeelib.c.i.e r12 = r11.mo23408d0()
            r1 = 6
            byte r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            r12.mo27697k0(r0)
            com.yeelight.yeelib.c.i.e r12 = r11.mo23408d0()
            com.yeelight.yeelib.c.i.e$d r0 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_FLOW
            r12.mo27630B0(r0)
            int r12 = r11.f7253p
            if (r12 != r5) goto L_0x0227
            com.yeelight.yeelib.c.k.b r12 = r11.f12658x
            r12.mo27978n()
        L_0x0227:
            return
        L_0x0228:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "get a illegal mode value -> "
            r12.append(r2)
            byte r2 = r0[r7]
            goto L_0x01fd
        L_0x0235:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "onNotification, device status, power: "
            r12.append(r2)
            com.yeelight.yeelib.c.i.e r2 = r11.mo23408d0()
            boolean r2 = r2.mo27681c0()
            r12.append(r2)
            java.lang.String r2 = ", mode: "
            r12.append(r2)
            com.yeelight.yeelib.c.i.e r2 = r11.mo23408d0()
            com.yeelight.yeelib.c.i.e$d r2 = r2.mo27726z()
            r12.append(r2)
            r12.append(r1)
            byte r0 = r0[r8]
            r12.append(r0)
            r12.toString()
            int r12 = r11.f7253p
            if (r12 != r5) goto L_0x027a
            r12 = 11
            r11.mo23371F0(r12)
            android.os.MessageQueue r12 = android.os.Looper.myQueue()
            com.yeelight.yeelib.c.m.e0$i r0 = new com.yeelight.yeelib.c.m.e0$i
            r0.<init>()
            r12.addIdleHandler(r0)
        L_0x027a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p183m.C6459e0.mo27479H1(com.yeelight.yeelib.device.models.l0):void");
    }

    /* renamed from: I1 */
    public void mo27480I1(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        "Gingko notification enabled !!!!!!! descriptor = " + bluetoothGattDescriptor.getUuid().toString();
        if (bluetoothGattDescriptor.getCharacteristic().getUuid().toString().equals("8f65073d-9f57-4aaa-afea-397d19d5bbeb")) {
            this.f7261w.mo27468a(2);
        }
    }

    /* renamed from: J1 */
    public void mo27481J1(C7636l0 l0Var) {
    }

    /* renamed from: L1 */
    public void mo27483L1(boolean z, boolean z2) {
        "Cherry Device, onServiceDiscovered! oad found ? " + z + ", cherry found ? " + z2;
        mo23371F0(4);
        if (!z2) {
            this.f13564L.mo28194c(new C6460a(), 100);
        } else if (this.f12658x.mo27972h()) {
            this.f12658x.mo27955Q("CHAR_TELINK_NOTIFY", true);
            this.f7261w.mo27469d();
        } else {
            mo23371F0(0);
        }
    }

    /* renamed from: M1 */
    public boolean mo27484M1() {
        return false;
    }

    /* renamed from: S1 */
    public boolean mo27490S1() {
        return false;
    }

    /* renamed from: T1 */
    public void mo27803T1() {
        if (this.f13573U) {
            this.f13573U = false;
            this.f12658x.mo27944F("CHAR_TELINK_NOTIFY", new byte[]{0});
        }
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        if (U != null && !U.isEmpty()) {
            return U;
        }
        return C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_gingko) + mo23389Q(mo23372G());
    }

    /* renamed from: U0 */
    public boolean mo23317U0() {
        super.mo23317U0();
        if (this.f12858z.mo31820a() <= 0) {
            return true;
        }
        C6000f fVar = (C6000f) C4257w.m11945h0(this.f12858z.mo31822c() + "_" + this.f12858z.mo31820a());
        if (fVar == null) {
            return true;
        }
        fVar.mo27503P1();
        return true;
    }

    /* renamed from: X1 */
    public boolean mo27807X1() {
        return this.f13573U;
    }

    /* renamed from: Y0 */
    public boolean mo23323Y0() {
        super.mo23323Y0();
        this.f13560H = true;
        this.f13564L.mo28195d(3, 0);
        return true;
    }

    /* renamed from: Y1 */
    public void mo27808Y1(String str, String str2) {
        this.f13565M = Arrays.copyOf(C3963b.m10656c(str), 16);
        this.f13566N = C3963b.m10657d(str2, 16);
        "Controller login:" + C3963b.m10654a(this.f13565M) + " , " + C3963b.m10654a(this.f13566N);
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) (this.f13565M[i] ^ this.f13566N[i]);
        }
        byte[] bArr2 = this.f13562J;
        m19483k3(bArr2);
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        try {
            byte[] b = AES.m10666b(bArr3, bArr);
            byte[] bArr4 = new byte[17];
            bArr4[0] = C3967a.BLE_GATT_OP_PAIR_ENC_REQ.mo22535a();
            System.arraycopy(bArr2, 0, bArr4, 1, bArr2.length);
            System.arraycopy(b, 8, bArr4, 9, 8);
            C3962a.m10653e(bArr4, 9, 16);
            this.f12658x.mo27944F("CHAR_TELINK_PAIR", bArr4);
            this.f13564L.mo28194c(new C6462c(), 200);
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            e.printStackTrace();
            mo23342r();
        }
    }

    /* renamed from: Z1 */
    public boolean mo27809Z1(int i) {
        if (!mo27806W1()) {
            mo27808Y1(this.f12858z.mo31822c(), this.f12858z.mo31823d());
            return false;
        }
        this.f12658x.mo27944F("CHAR_TELINK_COMMOND", C10556t.m25798a(mo28181l3(), C3967a.BLE_GATT_OP_CTRL_D0.mo22535a(), i, new byte[]{0, 0, 0}, this.f13563K));
        return false;
    }

    /* renamed from: a2 */
    public boolean mo27810a2(int i) {
        if (!mo27806W1()) {
            mo27808Y1(this.f12858z.mo31822c(), this.f12858z.mo31823d());
            return false;
        }
        this.f12658x.mo27944F("CHAR_TELINK_COMMOND", C10556t.m25798a(mo28181l3(), C3967a.BLE_GATT_OP_CTRL_D0.mo22535a(), i, new byte[]{1, 0, 0}, this.f13563K));
        return false;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        boolean b1 = super.mo23326b1();
        if (!mo27805V1().mo31822c().equals("yeelight_ms")) {
            C6000f fVar = (C6000f) C4257w.m11945h0(mo27805V1().mo31822c() + "_" + mo27805V1().mo31820a());
            "close Network name = " + mo27805V1().mo31822c() + ", device = " + fVar;
            if (fVar != null) {
                fVar.mo23354x0();
            }
        }
        return b1;
    }

    /* renamed from: b2 */
    public boolean mo27811b2(int i) {
        if (!mo27806W1()) {
            mo27808Y1(this.f12858z.mo31822c(), this.f12858z.mo31823d());
        } else {
            this.f12658x.mo27944F("CHAR_TELINK_COMMOND", C10556t.m25798a(mo28181l3(), C3967a.BLE_GATT_OP_CTRL_D2.mo22535a(), SupportMenu.USER_MASK, new byte[]{(byte) i, 0, 0}, this.f13563K));
        }
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        this.f12658x.mo27952N(2, 0);
        if (((C7554e) mo23408d0().mo27710r(2)) != null) {
            mo23408d0().mo27670V0(-1);
        }
        return false;
    }

    /* renamed from: c2 */
    public void mo27812c2(byte[] bArr) {
        "device:" + mo23372G() + ", getMeshNotification:" + C3962a.m10649a(bArr, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        boolean z = false;
        if (bArr[7] == C3967a.BLE_GATT_OP_CTRL_DB.mo22535a()) {
            int i = ((bArr[4] << 8) + bArr[3]) & 255;
            if (bArr[10] == 1) {
                z = true;
            }
            byte b = bArr[11] & 255;
            C6047m.C6048a aVar = this.f12857G;
            if (aVar != null) {
                aVar.mo27538b(i, z, b, C3967a.BLE_GATT_OP_CTRL_DB.mo22535a());
            }
        } else if (bArr[7] == C3967a.BLE_GATT_OP_CTRL_DC.mo22535a()) {
            byte b2 = bArr[10] & 255;
            byte b3 = -1;
            if (bArr[11] == 0) {
                C6047m.C6048a aVar2 = this.f12857G;
                if (aVar2 != null) {
                    aVar2.mo27540e(b2);
                }
            } else {
                boolean z2 = bArr[12] > 0;
                byte b4 = z2 ? bArr[12] & 255 : -1;
                C6047m.C6048a aVar3 = this.f12857G;
                if (aVar3 != null) {
                    aVar3.mo27538b(b2, z2, b4, C3967a.BLE_GATT_OP_CTRL_DC.mo22535a());
                }
            }
            if (bArr[14] != 0 || bArr[15] != 0 || bArr[16] != 0 || bArr[17] != 0) {
                byte b5 = bArr[14] & 255;
                if (bArr[15] == 0) {
                    C6047m.C6048a aVar4 = this.f12857G;
                    if (aVar4 != null) {
                        aVar4.mo27540e(b5);
                        return;
                    }
                    return;
                }
                if (bArr[16] > 0) {
                    z = true;
                }
                if (z) {
                    b3 = bArr[16] & 255;
                }
                C6047m.C6048a aVar5 = this.f12857G;
                if (aVar5 != null) {
                    aVar5.mo27538b(b5, z, b3, C3967a.BLE_GATT_OP_CTRL_DC.mo22535a());
                }
            }
        }
    }

    /* renamed from: d2 */
    public void mo27813d2() {
        if (!this.f13573U) {
            this.f13573U = true;
            "open onLine status from : " + mo23372G();
            this.f12658x.mo27944F("CHAR_TELINK_NOTIFY", new byte[]{1});
        }
    }

    /* renamed from: f1 */
    public boolean mo23328f1(boolean z) {
        return false;
    }

    /* renamed from: f2 */
    public void mo27814f2() {
        this.f12658x.mo27944F("CHAR_TELINK_COMMOND", C10556t.m25798a(mo28181l3(), C3967a.BLE_GATT_OP_CTRL_DA.mo22535a(), SupportMenu.USER_MASK, new byte[]{ParameterInitDefType.ExternalSamplerInit}, this.f13563K));
    }

    /* renamed from: g0 */
    public int mo23329g0() {
        C6476k kVar = this.f13568P;
        if (kVar != null) {
            return kVar.mo28206j();
        }
        return 0;
    }

    /* renamed from: k2 */
    public void mo27819k2(byte[] bArr) {
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
                        this.f12855A.put("ADV_MESH_NAME", bArr2);
                        this.f12855A.put("ADV_MESH_ADDRESS", Integer.valueOf(i16));
                        this.f12855A.put("ADV_MESH_UUID", Integer.valueOf(i10));
                        this.f12855A.put("ADV_PRODUCT_UUID", Integer.valueOf(i14));
                        this.f12855A.put("ADV_STATUS", Integer.valueOf(b3));
                        try {
                            if ("yeelight_ms".equals(new String(bArr2, "utf-8")) && !"yeelight_ms".equals(mo27805V1().mo31822c())) {
                                mo27817i2(new C9850s());
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
    public boolean mo23334l1() {
        boolean l1 = super.mo23334l1();
        if (!mo27805V1().mo31822c().equals("yeelight_ms")) {
            C6000f fVar = (C6000f) C4257w.m11945h0(mo27805V1().mo31822c() + "_" + mo27805V1().mo31820a());
            "open Network name = " + mo27805V1().mo31822c() + ", device = " + fVar;
            if (fVar != null) {
                fVar.mo23354x0();
            }
        }
        return l1;
    }

    /* renamed from: l2 */
    public boolean mo27820l2(String str, String str2) {
        this.f12658x.mo27944F("CHAR_TELINK_PAIR", C10556t.m25799b(C3967a.BLE_GATT_OP_PAIR_NETWORK_NAME.mo22535a(), str, this.f13563K));
        this.f12658x.mo27944F("CHAR_TELINK_PAIR", C10556t.m25799b(C3967a.BLE_GATT_OP_PAIR_PASS.mo22535a(), str2, this.f13563K));
        byte[] bArr = {-64, -63, -62, -61, -60, -59, -58, -57, -40, -39, -38, -37, -36, -35, -34, -33};
        this.f12658x.mo27944F("CHAR_TELINK_PAIR", C10556t.m25800c(C3967a.BLE_GATT_OP_PAIR_LTK.mo22535a(), bArr, this.f13563K));
        return this.f12658x.mo27987w("CHAR_TELINK_PAIR", new C6464d(C3963b.m10657d(str, 16), C3963b.m10657d(str2, 16), bArr));
    }

    /* renamed from: l3 */
    public byte[] mo28181l3() {
        if (this.f13567O == null) {
            String[] split = mo23391R().split(Constants.COLON_SEPARATOR);
            int length = split.length;
            this.f13567O = new byte[length];
            for (int i = 0; i < length; i++) {
                this.f13567O[i] = (byte) (Integer.parseInt(split[i], 16) & 255);
            }
            C3962a.m10653e(this.f13567O, 0, length - 1);
        }
        return this.f13567O;
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        return false;
    }

    /* renamed from: m3 */
    public byte[] mo28182m3() {
        return this.f13563K;
    }

    /* renamed from: n */
    public void mo23337n() {
        C4214g.m11665j().mo23494m(mo23395T());
        "Gingko device connect, device: " + mo23372G();
        if (C4297y.m12064f().mo23730a()) {
            if (mo23299A() == 0 || mo23299A() == 1) {
                this.f13564L.mo28193b(new C6461b());
                mo23371F0(2);
                return;
            }
            "Gingko Device, connect, state: " + mo23299A() + ", return!";
        }
    }

    /* renamed from: o3 */
    public void mo28183o3() {
        mo27808Y1(this.f12858z.mo31822c(), "YEE_ERR");
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 1024) {
            DeviceDataProvider.m22393a0(this);
        }
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        return super.mo23340p1(j);
    }

    /* renamed from: q3 */
    public void mo28184q3(boolean z) {
        this.f13561I = z;
    }

    /* renamed from: r */
    public void mo23342r() {
        this.f12658x.mo27970f();
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        return false;
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
        this.f12658x.mo27952N(1, i);
        if (((C7554e) mo23408d0().mo27710r(2)) == null) {
            return false;
        }
        mo23408d0().mo27670V0(i);
        return false;
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
        if (i == 0) {
            this.f12658x.mo27981q();
        } else if (i != 1) {
            int i2 = 2;
            if (i == 2) {
                this.f12658x.mo27980p();
            } else if (i == 7) {
                this.f12658x.mo27941C();
                C9850s sVar = this.f12858z;
                mo27817i2(new C9850s());
                DeviceDataProvider.m22397c0(this.f7255r, 0);
                C6000f fVar = (C6000f) C4257w.m11945h0(sVar.mo31822c() + "_" + sVar.mo31820a());
                if (fVar != null) {
                    fVar.mo27503P1();
                }
                mo23385N0(C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_gingko) + mo23389Q(mo23372G()));
            } else if (i == 10 || i == 14) {
                C7554e eVar = (C7554e) obj;
                if (eVar.mo28882c()) {
                    i2 = 1;
                }
                this.f12658x.mo27952N(Integer.valueOf(i2).intValue(), Integer.valueOf(eVar.mo28881b()).intValue());
                mo23408d0().mo27676a(eVar);
            }
        } else {
            String str = (String) obj;
            this.f12658x.mo27989z(str);
            "rename to: " + obj + ", length: " + str.length();
        }
        return true;
    }

    /* renamed from: y0 */
    public void mo23356y0() {
        super.mo23356y0();
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }
}
