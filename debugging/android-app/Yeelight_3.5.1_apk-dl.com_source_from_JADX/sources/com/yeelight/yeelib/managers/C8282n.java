package com.yeelight.yeelib.managers;

import android.content.Context;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.managers.C8272e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import p051j4.C9209y;
import p051j4.C9210z;
import p232y3.C12048k;

/* renamed from: com.yeelight.yeelib.managers.n */
public class C8282n implements C8272e.C3063a {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String f14202m = "com.yeelight.yeelib.managers.n";

    /* renamed from: n */
    private static C8282n f14203n;

    /* renamed from: a */
    private Context f14204a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ServerSocket f14205b;

    /* renamed from: c */
    private Thread f14206c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ConcurrentHashMap<String, C8285c> f14207d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C9210z f14208e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C9209y f14209f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AudioManager f14210g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f14211h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f14212i;

    /* renamed from: j */
    private int f14213j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f14214k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Handler f14215l = new C8284b(Looper.getMainLooper());

    /* renamed from: com.yeelight.yeelib.managers.n$a */
    class C8283a implements Runnable {
        C8283a() {
        }

        public void run() {
            synchronized (new byte[]{1}) {
                try {
                    C8282n.this.m19572w();
                    String unused = C8282n.f14202m;
                    while (true) {
                        String unused2 = C8282n.f14202m;
                        Socket accept = C8282n.this.f14205b.accept();
                        C8285c cVar = new C8285c(C8282n.this, accept);
                        cVar.start();
                        String hostAddress = accept.getInetAddress().getHostAddress();
                        C8282n.this.f14207d.put(hostAddress, cVar);
                        String unused3 = C8282n.f14202m;
                        StringBuilder sb = new StringBuilder();
                        sb.append("WOW a device has connected!!!!! happy!!! - ");
                        sb.append(hostAddress);
                        if (C8282n.this.f14214k) {
                            if (C8282n.this.f14208e == null) {
                                String unused4 = C8282n.f14202m;
                                C9210z unused5 = C8282n.this.f14208e = new C9210z(C8282n.this.f14215l);
                                C8282n.this.f14208e.mo37296g();
                            }
                        } else if (C8282n.this.f14209f == null) {
                            String unused6 = C8282n.f14202m;
                            C9209y unused7 = C8282n.this.f14209f = new C9209y(C8282n.this.f14215l);
                            C8282n.this.f14209f.mo37292e();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (C8282n.this.f14205b != null && !C8282n.this.f14205b.isClosed()) {
                        try {
                            C8282n.this.f14205b.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.n$b */
    class C8284b extends Handler {

        /* renamed from: a */
        private int f14217a;

        /* renamed from: b */
        private int f14218b;

        /* renamed from: c */
        private int f14219c;

        C8284b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 100) {
                String obj = message.obj.toString();
                this.f14219c = message.arg1;
                double parseDouble = Double.parseDouble(obj);
                StringBuilder sb = new StringBuilder();
                sb.append("receive handler index ");
                sb.append(message.arg2);
                if (parseDouble < 80.0d) {
                    C8282n.this.mo35231y(SupportMenu.CATEGORY_MASK, -1);
                    return;
                }
                if (parseDouble > 100.0d) {
                    parseDouble = 100.0d;
                } else if (parseDouble < 80.0d) {
                    parseDouble = 80.0d;
                }
                int i2 = (int) (((parseDouble - 80.0d) / 20.0d) * 100.0d);
                this.f14217a = i2;
                if (i2 < 1) {
                    this.f14217a = 1;
                }
                if (Math.abs(this.f14217a - this.f14218b) > 15) {
                    this.f14218b = this.f14217a;
                } else {
                    this.f14217a = -1;
                }
                C8282n.this.mo35231y(this.f14219c, this.f14217a);
            } else if (i == 200) {
                Bundle data = message.getData();
                int i3 = data.getInt("base_mag");
                int i4 = data.getInt("beats");
                int i5 = data.getInt("color") & ViewCompat.MEASURED_SIZE_MASK;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("value ");
                sb2.append(i3);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("receive color ");
                sb3.append(i5);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("receive handler index ");
                sb4.append(message.arg2);
                if (i3 > 20) {
                    i3 = 20;
                } else if (i3 < 2) {
                    i3 = 2;
                }
                C8282n nVar = C8282n.this;
                int unused = nVar.f14212i = nVar.f14210g.getStreamVolume(3);
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Max volume: ");
                sb5.append(C8282n.this.f14211h);
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Current volume: ");
                sb6.append(C8282n.this.f14212i);
                int c = ((i3 * 5) * C8282n.this.f14212i) / C8282n.this.f14211h;
                this.f14217a = c;
                if (c == 0) {
                    this.f14217a = 1;
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append("brightness: ");
                sb7.append(this.f14217a);
                C8282n.this.mo35232z(i5, this.f14217a, i4);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.n$c */
    class C8285c extends Thread {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public PrintWriter f14221a;

        /* renamed from: b */
        private BufferedReader f14222b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f14223c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Queue<String> f14224d = new LinkedBlockingQueue();

        /* renamed from: e */
        private Thread f14225e = null;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public WifiDeviceBase f14226f;

        /* renamed from: g */
        private Socket f14227g;

        /* renamed from: com.yeelight.yeelib.managers.n$c$a */
        class C8286a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Socket f14228a;

            C8286a(C8282n nVar, Socket socket) {
                this.f14228a = socket;
            }

            public void run() {
                while (C8285c.this.f14223c) {
                    if (this.f14228a.isClosed()) {
                        boolean unused = C8285c.this.f14223c = false;
                        if (C8285c.this.f14226f != null) {
                            C8285c.this.f14226f.mo23221d0().mo31593i(false);
                            C8285c.this.f14226f.mo23167x0();
                        }
                    } else if (!C8285c.this.f14224d.isEmpty()) {
                        C8285c.this.f14221a.println((String) C8285c.this.f14224d.poll());
                        C8285c.this.f14221a.flush();
                    }
                }
            }
        }

        public C8285c(C8282n nVar, Socket socket) {
            this.f14222b = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.f14221a = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            this.f14223c = true;
            this.f14226f = YeelightDeviceManager.m7800o0().mo23298k0(socket.getInetAddress().getHostAddress());
            this.f14227g = socket;
            Thread thread = new Thread(new C8286a(nVar, socket));
            this.f14225e = thread;
            thread.start();
            WifiDeviceBase wifiDeviceBase = this.f14226f;
            if (wifiDeviceBase != null) {
                wifiDeviceBase.mo23221d0().mo31593i(true);
            }
        }

        /* renamed from: g */
        public synchronized void mo35235g(String str) {
            this.f14224d.add(str);
        }

        /* renamed from: h */
        public void mo35236h() {
            this.f14223c = false;
            WifiDeviceBase wifiDeviceBase = this.f14226f;
            if (wifiDeviceBase != null) {
                wifiDeviceBase.mo31474C1();
                this.f14226f.mo23221d0().mo31593i(false);
            }
            try {
                this.f14227g.close();
            } catch (IOException unused) {
            }
            interrupt();
        }

        public void run() {
            super.run();
            while (this.f14223c) {
                try {
                    String unused = C8282n.f14202m;
                    StringBuilder sb = new StringBuilder();
                    sb.append("get info from device=");
                    sb.append(this.f14222b.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                    this.f14223c = false;
                    WifiDeviceBase wifiDeviceBase = this.f14226f;
                    if (wifiDeviceBase != null) {
                        wifiDeviceBase.mo23221d0().mo31593i(false);
                        this.f14226f.mo23167x0();
                    }
                }
            }
        }

        public synchronized void start() {
            this.f14223c = true;
            super.start();
        }
    }

    private C8282n(Context context) {
        this.f14204a = context;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.f14210g = audioManager;
        this.f14211h = audioManager.getStreamMaxVolume(3);
        this.f14212i = this.f14210g.getStreamVolume(3);
        this.f14207d = new ConcurrentHashMap<>();
        C8272e.m19511b().mo35210j(this);
        m19550D();
    }

    /* renamed from: C */
    private void m19549C(WifiDeviceBase wifiDeviceBase) {
        StringBuilder sb = new StringBuilder();
        sb.append("StartMusicMode, device + ");
        sb.append(wifiDeviceBase.mo23221d0().mo31526A());
        sb.append(" , ip : ");
        sb.append(m19570t());
        sb.append(", port: ");
        sb.append(this.f14205b.getLocalPort());
        wifiDeviceBase.mo31476E1(m19570t(), this.f14205b.getLocalPort());
    }

    /* renamed from: D */
    private synchronized void m19550D() {
        Thread thread = this.f14206c;
        if (thread != null) {
            thread.interrupt();
        }
        Thread thread2 = new Thread(new C8283a());
        this.f14206c = thread2;
        thread2.start();
    }

    /* renamed from: E */
    private void m19551E() {
        for (C8285c next : this.f14207d.values()) {
            if (next != null) {
                next.mo35236h();
            }
        }
        this.f14207d.clear();
    }

    /* renamed from: F */
    private void m19552F(WifiDeviceBase wifiDeviceBase) {
        C8285c remove = this.f14207d.remove(((C12048k) wifiDeviceBase.mo23221d0()).mo42734Z0());
        if (remove != null) {
            remove.mo35236h();
        }
        if (this.f14207d.size() == 0) {
            C9210z zVar = this.f14208e;
            if (zVar != null) {
                zVar.mo37297h();
                this.f14208e = null;
            }
            C9209y yVar = this.f14209f;
            if (yVar != null) {
                yVar.mo37293f();
                this.f14209f = null;
            }
        }
        wifiDeviceBase.mo31474C1();
    }

    /* renamed from: q */
    private void m19567q(String str) {
        for (C8285c next : this.f14207d.values()) {
            if (next != null) {
                next.mo35235g(str);
            }
        }
    }

    /* renamed from: r */
    private void m19568r() {
        try {
            ServerSocket serverSocket = this.f14205b;
            if (serverSocket != null && !serverSocket.isClosed()) {
                this.f14205b.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            ServerSocket serverSocket2 = this.f14205b;
            if (serverSocket2 != null && !serverSocket2.isClosed()) {
                try {
                    this.f14205b.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: s */
    public static C8282n m19569s(Context context) {
        if (f14203n == null) {
            f14203n = new C8282n(context);
        }
        return f14203n;
    }

    /* renamed from: t */
    private String m19570t() {
        return m19571u(((WifiManager) C3108x.f4951e.getSystemService("wifi")).getConnectionInfo().getIpAddress());
    }

    /* renamed from: u */
    private String m19571u(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m19572w() {
        try {
            ServerSocket serverSocket = this.f14205b;
            if (serverSocket != null && !serverSocket.isClosed()) {
                this.f14205b.close();
            }
            String t = m19570t();
            StringBuilder sb = new StringBuilder();
            sb.append("ip = ");
            sb.append(t);
            this.f14205b = new ServerSocket(0, 1, InetAddress.getByName(t));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("server ip = ");
            sb2.append(this.f14205b.getInetAddress().toString());
            sb2.append(" port = ");
            sb2.append(this.f14205b.getLocalPort());
        } catch (Exception e) {
            e.printStackTrace();
            ServerSocket serverSocket2 = this.f14205b;
            if (serverSocket2 != null && !serverSocket2.isClosed()) {
                try {
                    this.f14205b.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: A */
    public void mo35228A(boolean z) {
        this.f14214k = z;
        if (z) {
            C9209y yVar = this.f14209f;
            if (yVar != null) {
                yVar.mo37293f();
                this.f14209f = null;
            }
            if (this.f14208e == null) {
                this.f14208e = new C9210z(this.f14215l);
            }
            this.f14208e.mo37296g();
            return;
        }
        C9210z zVar = this.f14208e;
        if (zVar != null) {
            zVar.mo37297h();
            this.f14208e = null;
        }
        if (this.f14209f == null) {
            this.f14209f = new C9209y(this.f14215l);
        }
        this.f14209f.mo37292e();
    }

    /* renamed from: B */
    public void mo35229B(WifiDeviceBase wifiDeviceBase, boolean z) {
        if (z) {
            m19549C(wifiDeviceBase);
        } else {
            m19552F(wifiDeviceBase);
        }
    }

    /* renamed from: I */
    public void mo23265I() {
        m19568r();
        for (WifiDeviceBase d0 : YeelightDeviceManager.m7800o0().mo23253B0()) {
            d0.mo23221d0().mo31593i(false);
        }
    }

    /* renamed from: i */
    public void mo23294i(int i) {
        m19551E();
        if (i == 1) {
            m19550D();
            return;
        }
        m19568r();
        m19551E();
    }

    /* renamed from: j */
    public void mo23296j() {
    }

    /* renamed from: v */
    public void mo23318v() {
    }

    /* renamed from: x */
    public void mo35230x() {
        m19550D();
    }

    /* renamed from: y */
    public void mo35231y(int i, int i2) {
        mo35232z(i, i2, 100);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x01c5  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35232z(int r21, int r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = 0
            java.lang.String r5 = "{\"id\":%id,\"method\":\"set_hsv\",\"params\":[%value, 100, %mode, %duration]}\r\n"
            r6 = 3
            r7 = -1
            java.lang.String r8 = "\"smooth\""
            java.lang.String r9 = "%mode"
            java.lang.String r12 = "Send cmd: "
            java.lang.String r13 = "%duration"
            java.lang.String r14 = "%value"
            java.lang.String r15 = "%id"
            java.lang.String r10 = ""
            if (r2 != r7) goto L_0x0083
            float[] r2 = new float[r6]
            android.graphics.Color.colorToHSV(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r6 = r0.f14213j
            int r6 = r6 + 1
            r0.f14213j = r6
            r1.append(r6)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r5.replace(r15, r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r2 = r2[r4]
            int r2 = (int) r2
            r5.append(r2)
            r5.append(r10)
            java.lang.String r2 = r5.toString()
            java.lang.String r1 = r1.replace(r14, r2)
            java.lang.String r1 = r1.replace(r9, r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            r5 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r3 = r3 * r5
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.replace(r13, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L_0x0078:
            r2.append(r12)
            r2.append(r1)
            r0.m19567q(r1)
            goto L_0x0261
        L_0x0083:
            java.lang.String r11 = "{\"id\":%id,\"method\":\"set_bright\",\"params\":[%value, \"smooth\", %duration]}\r\n"
            if (r1 != r7) goto L_0x00db
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r4 = r0.f14213j
            int r4 = r4 + 1
            r0.f14213j = r4
            r1.append(r4)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r11.replace(r15, r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r10)
            java.lang.String r2 = r4.toString()
            java.lang.String r1 = r1.replace(r14, r2)
            java.lang.String r1 = r1.replace(r9, r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            r5 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r3 = r3 * r5
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.replace(r13, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto L_0x0078
        L_0x00db:
            float[] r6 = new float[r6]
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            if (r1 != r7) goto L_0x0182
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r0.f14213j
            int r5 = r5 + 1
            r0.f14213j = r5
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "{\"id\":%id,\"method\":\"set_rgb\",\"params\":[%value, \"smooth\", %duration]}\r\n"
            java.lang.String r4 = r5.replace(r15, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r10)
            java.lang.String r1 = r5.toString()
            java.lang.String r1 = r4.replace(r14, r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            double r5 = (double) r3
            java.lang.Double.isNaN(r5)
            r7 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r5 = r5 * r7
            r4.append(r5)
            r4.append(r10)
            java.lang.String r3 = r4.toString()
            java.lang.String r1 = r1.replace(r13, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            r3.append(r1)
            r0.m19567q(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r0.f14213j
            int r3 = r3 + 1
            r0.f14213j = r3
            r1.append(r3)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r11.replace(r15, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            java.lang.String r1 = r1.replace(r14, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.replace(r13, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto L_0x0078
        L_0x0182:
            android.graphics.Color.colorToHSV(r1, r6)
            r1 = 200(0xc8, float:2.8E-43)
            r18 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            if (r3 != r1) goto L_0x01a3
            r1 = r5
            double r4 = (double) r3
            java.lang.Double.isNaN(r4)
            r16 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r4 = r4 * r16
            int r3 = (int) r4
            double r4 = (double) r2
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r18
        L_0x01a1:
            int r2 = (int) r4
            goto L_0x01c1
        L_0x01a3:
            r1 = r5
            r4 = 50
            if (r3 != r4) goto L_0x01ba
            double r3 = (double) r3
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r16
            int r3 = (int) r3
            double r4 = (double) r2
            r16 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r16
            goto L_0x01a1
        L_0x01ba:
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r18
            int r3 = (int) r3
        L_0x01c1:
            r4 = 100
            if (r2 <= r4) goto L_0x01c7
            r2 = 100
        L_0x01c7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r0.f14213j
            int r5 = r5 + 1
            r0.f14213j = r5
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = r1.replace(r15, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
            r5 = r6[r5]
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = r1.replace(r14, r4)
            java.lang.String r1 = r1.replace(r9, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = r1.replace(r13, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            r4.append(r1)
            r0.m19567q(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r4 = r0.f14213j
            int r4 = r4 + 1
            r0.f14213j = r4
            r1.append(r4)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r11.replace(r15, r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r10)
            java.lang.String r2 = r4.toString()
            java.lang.String r1 = r1.replace(r14, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.replace(r13, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto L_0x0078
        L_0x0261:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.C8282n.mo35232z(int, int, int):void");
    }
}
