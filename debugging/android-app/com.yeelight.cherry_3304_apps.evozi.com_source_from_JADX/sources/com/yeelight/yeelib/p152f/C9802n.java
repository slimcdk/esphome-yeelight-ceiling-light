package com.yeelight.yeelib.p152f;

import android.content.Context;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p184n.C7562l;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.utils.C10534a0;
import com.yeelight.yeelib.utils.C10563z;
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

/* renamed from: com.yeelight.yeelib.f.n */
public class C9802n implements C9784e.C4213a {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String f17726m = "com.yeelight.yeelib.f.n";

    /* renamed from: n */
    private static C9802n f17727n;

    /* renamed from: a */
    private Context f17728a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ServerSocket f17729b;

    /* renamed from: c */
    private Thread f17730c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ConcurrentHashMap<String, C9805c> f17731d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10534a0 f17732e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10563z f17733f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AudioManager f17734g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f17735h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f17736i;

    /* renamed from: j */
    private int f17737j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f17738k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Handler f17739l = new C9804b(Looper.getMainLooper());

    /* renamed from: com.yeelight.yeelib.f.n$a */
    class C9803a implements Runnable {
        C9803a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            com.yeelight.yeelib.p152f.C9802n.m23780g(r4.f17740a).close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bd, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r0.printStackTrace();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x009f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                r0 = 1
                byte[] r1 = new byte[r0]
                r2 = 0
                r1[r2] = r0
                monitor-enter(r1)
                com.yeelight.yeelib.f.n r0 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                r0.m23793w()     // Catch:{ Exception -> 0x009f }
                java.lang.String unused = com.yeelight.yeelib.p152f.C9802n.f17726m     // Catch:{ Exception -> 0x009f }
            L_0x000f:
                java.lang.String unused = com.yeelight.yeelib.p152f.C9802n.f17726m     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.f.n r0 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                java.net.ServerSocket r0 = r0.f17729b     // Catch:{ Exception -> 0x009f }
                java.net.Socket r0 = r0.accept()     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.f.n$c r2 = new com.yeelight.yeelib.f.n$c     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.f.n r3 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                r2.<init>(r3, r0)     // Catch:{ Exception -> 0x009f }
                r2.start()     // Catch:{ Exception -> 0x009f }
                java.net.InetAddress r0 = r0.getInetAddress()     // Catch:{ Exception -> 0x009f }
                java.lang.String r0 = r0.getHostAddress()     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.f.n r3 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                java.util.concurrent.ConcurrentHashMap r3 = r3.f17731d     // Catch:{ Exception -> 0x009f }
                r3.put(r0, r2)     // Catch:{ Exception -> 0x009f }
                java.lang.String unused = com.yeelight.yeelib.p152f.C9802n.f17726m     // Catch:{ Exception -> 0x009f }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f }
                r2.<init>()     // Catch:{ Exception -> 0x009f }
                java.lang.String r3 = "WOW a device has connected!!!!! happy!!! - "
                r2.append(r3)     // Catch:{ Exception -> 0x009f }
                r2.append(r0)     // Catch:{ Exception -> 0x009f }
                r2.toString()     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.f.n r0 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                boolean r0 = r0.f17738k     // Catch:{ Exception -> 0x009f }
                if (r0 == 0) goto L_0x0077
                com.yeelight.yeelib.f.n r0 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.utils.a0 r0 = r0.f17732e     // Catch:{ Exception -> 0x009f }
                if (r0 != 0) goto L_0x000f
                java.lang.String unused = com.yeelight.yeelib.p152f.C9802n.f17726m     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.f.n r0 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.utils.a0 r2 = new com.yeelight.yeelib.utils.a0     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.f.n r3 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                android.os.Handler r3 = r3.f17739l     // Catch:{ Exception -> 0x009f }
                r2.<init>(r3)     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.utils.C10534a0 unused = r0.f17732e = r2     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.f.n r0 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.utils.a0 r0 = r0.f17732e     // Catch:{ Exception -> 0x009f }
                r0.mo33364g()     // Catch:{ Exception -> 0x009f }
                goto L_0x000f
            L_0x0077:
                com.yeelight.yeelib.f.n r0 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.utils.z r0 = r0.f17733f     // Catch:{ Exception -> 0x009f }
                if (r0 != 0) goto L_0x000f
                java.lang.String unused = com.yeelight.yeelib.p152f.C9802n.f17726m     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.f.n r0 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.utils.z r2 = new com.yeelight.yeelib.utils.z     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.f.n r3 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                android.os.Handler r3 = r3.f17739l     // Catch:{ Exception -> 0x009f }
                r2.<init>(r3)     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.utils.C10563z unused = r0.f17733f = r2     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.f.n r0 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ Exception -> 0x009f }
                com.yeelight.yeelib.utils.z r0 = r0.f17733f     // Catch:{ Exception -> 0x009f }
                r0.mo33393e()     // Catch:{ Exception -> 0x009f }
                goto L_0x000f
            L_0x009d:
                r0 = move-exception
                goto L_0x00c3
            L_0x009f:
                com.yeelight.yeelib.f.n r0 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ all -> 0x009d }
                java.net.ServerSocket r0 = r0.f17729b     // Catch:{ all -> 0x009d }
                if (r0 == 0) goto L_0x00c1
                com.yeelight.yeelib.f.n r0 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ all -> 0x009d }
                java.net.ServerSocket r0 = r0.f17729b     // Catch:{ all -> 0x009d }
                boolean r0 = r0.isClosed()     // Catch:{ all -> 0x009d }
                if (r0 != 0) goto L_0x00c1
                com.yeelight.yeelib.f.n r0 = com.yeelight.yeelib.p152f.C9802n.this     // Catch:{ IOException -> 0x00bd }
                java.net.ServerSocket r0 = r0.f17729b     // Catch:{ IOException -> 0x00bd }
                r0.close()     // Catch:{ IOException -> 0x00bd }
                goto L_0x00c1
            L_0x00bd:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ all -> 0x009d }
            L_0x00c1:
                monitor-exit(r1)     // Catch:{ all -> 0x009d }
                return
            L_0x00c3:
                monitor-exit(r1)     // Catch:{ all -> 0x009d }
                goto L_0x00c6
            L_0x00c5:
                throw r0
            L_0x00c6:
                goto L_0x00c5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C9802n.C9803a.run():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.f.n$b */
    class C9804b extends Handler {

        /* renamed from: a */
        private int f17741a;

        /* renamed from: b */
        private int f17742b;

        /* renamed from: c */
        private int f17743c;

        C9804b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 100) {
                String obj = message.obj.toString();
                this.f17743c = message.arg1;
                double parseDouble = Double.parseDouble(obj);
                "receive handler index " + message.arg2;
                if (parseDouble < 80.0d) {
                    C9802n.this.mo31665y(SupportMenu.CATEGORY_MASK, -1);
                    return;
                }
                if (parseDouble > 100.0d) {
                    parseDouble = 100.0d;
                } else if (parseDouble < 80.0d) {
                    parseDouble = 80.0d;
                }
                int i2 = (int) (((parseDouble - 80.0d) / 20.0d) * 100.0d);
                this.f17741a = i2;
                if (i2 < 1) {
                    this.f17741a = 1;
                }
                if (Math.abs(this.f17741a - this.f17742b) > 15) {
                    this.f17742b = this.f17741a;
                } else {
                    this.f17741a = -1;
                }
                C9802n.this.mo31665y(this.f17743c, this.f17741a);
            } else if (i == 200) {
                Bundle data = message.getData();
                int i3 = data.getInt("base_mag");
                int i4 = data.getInt("beats");
                int i5 = data.getInt("color") & ViewCompat.MEASURED_SIZE_MASK;
                "value " + i3;
                "receive color " + i5;
                "receive handler index " + message.arg2;
                if (i3 > 20) {
                    i3 = 20;
                } else if (i3 < 2) {
                    i3 = 2;
                }
                C9802n nVar = C9802n.this;
                int unused = nVar.f17736i = nVar.f17734g.getStreamVolume(3);
                "Max volume: " + C9802n.this.f17735h;
                "Current volume: " + C9802n.this.f17736i;
                int c = ((i3 * 5) * C9802n.this.f17736i) / C9802n.this.f17735h;
                this.f17741a = c;
                if (c == 0) {
                    this.f17741a = 1;
                }
                "brightness: " + this.f17741a;
                C9802n.this.mo31666z(i5, this.f17741a, i4);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.n$c */
    class C9805c extends Thread {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public PrintWriter f17745a;

        /* renamed from: b */
        private BufferedReader f17746b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f17747c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Queue<String> f17748d = new LinkedBlockingQueue();

        /* renamed from: e */
        private Thread f17749e = null;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C6006h f17750f;

        /* renamed from: g */
        private Socket f17751g;

        /* renamed from: com.yeelight.yeelib.f.n$c$a */
        class C9806a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Socket f17752a;

            C9806a(C9802n nVar, Socket socket) {
                this.f17752a = socket;
            }

            public void run() {
                while (C9805c.this.f17747c) {
                    if (this.f17752a.isClosed()) {
                        boolean unused = C9805c.this.f17747c = false;
                        if (C9805c.this.f17750f != null) {
                            C9805c.this.f17750f.mo23408d0().mo27692i(false);
                            C9805c.this.f17750f.mo23354x0();
                        }
                    } else if (!C9805c.this.f17748d.isEmpty()) {
                        C9805c.this.f17745a.println((String) C9805c.this.f17748d.poll());
                        C9805c.this.f17745a.flush();
                    }
                }
            }
        }

        public C9805c(C9802n nVar, Socket socket) {
            this.f17746b = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.f17745a = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            this.f17747c = true;
            this.f17750f = C4257w.m11947l0().mo23671i0(socket.getInetAddress().getHostAddress());
            this.f17751g = socket;
            Thread thread = new Thread(new C9806a(nVar, socket));
            this.f17749e = thread;
            thread.start();
            C6006h hVar = this.f17750f;
            if (hVar != null) {
                hVar.mo23408d0().mo27692i(true);
            }
        }

        /* renamed from: g */
        public synchronized void mo31669g(String str) {
            this.f17748d.add(str);
        }

        /* renamed from: h */
        public void mo31670h() {
            this.f17747c = false;
            C6006h hVar = this.f17750f;
            if (hVar != null) {
                hVar.mo27557C1();
                this.f17750f.mo23408d0().mo27692i(false);
            }
            try {
                this.f17751g.close();
            } catch (IOException unused) {
            }
            interrupt();
        }

        public void run() {
            super.run();
            while (this.f17747c) {
                try {
                    String unused = C9802n.f17726m;
                    "get info from device=" + this.f17746b.readLine();
                } catch (Exception e) {
                    e.printStackTrace();
                    this.f17747c = false;
                    C6006h hVar = this.f17750f;
                    if (hVar != null) {
                        hVar.mo23408d0().mo27692i(false);
                        this.f17750f.mo23354x0();
                    }
                }
            }
        }

        public synchronized void start() {
            this.f17747c = true;
            super.start();
        }
    }

    private C9802n(Context context) {
        this.f17728a = context;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.f17734g = audioManager;
        this.f17735h = audioManager.getStreamMaxVolume(3);
        this.f17736i = this.f17734g.getStreamVolume(3);
        this.f17731d = new ConcurrentHashMap<>();
        C9784e.m23711b().mo31634j(this);
        m23771D();
    }

    /* renamed from: C */
    private void m23770C(C6006h hVar) {
        "StartMusicMode, device + " + hVar.mo23408d0().mo27627A() + " , ip : " + m23791t() + ", port: " + this.f17729b.getLocalPort();
        hVar.mo27559E1(m23791t(), this.f17729b.getLocalPort());
    }

    /* renamed from: D */
    private synchronized void m23771D() {
        if (this.f17730c != null) {
            this.f17730c.interrupt();
        }
        Thread thread = new Thread(new C9803a());
        this.f17730c = thread;
        thread.start();
    }

    /* renamed from: E */
    private void m23772E() {
        for (C9805c next : this.f17731d.values()) {
            if (next != null) {
                next.mo31670h();
            }
        }
        this.f17731d.clear();
    }

    /* renamed from: F */
    private void m23773F(C6006h hVar) {
        C9805c remove = this.f17731d.remove(((C7562l) hVar.mo23408d0()).mo28965X0());
        if (remove != null) {
            remove.mo31670h();
        }
        if (this.f17731d.size() == 0) {
            C10534a0 a0Var = this.f17732e;
            if (a0Var != null) {
                a0Var.mo33365h();
                this.f17732e = null;
            }
            C10563z zVar = this.f17733f;
            if (zVar != null) {
                zVar.mo33394f();
                this.f17733f = null;
            }
        }
        hVar.mo27557C1();
    }

    /* renamed from: q */
    private void m23788q(String str) {
        for (C9805c next : this.f17731d.values()) {
            if (next != null) {
                next.mo31669g(str);
            }
        }
    }

    /* renamed from: r */
    private void m23789r() {
        try {
            if (this.f17729b != null && !this.f17729b.isClosed()) {
                this.f17729b.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            ServerSocket serverSocket = this.f17729b;
            if (serverSocket != null && !serverSocket.isClosed()) {
                try {
                    this.f17729b.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: s */
    public static C9802n m23790s(Context context) {
        if (f17727n == null) {
            f17727n = new C9802n(context);
        }
        return f17727n;
    }

    /* renamed from: t */
    private String m23791t() {
        return m23792u(((WifiManager) C4297y.f7456e.getSystemService("wifi")).getConnectionInfo().getIpAddress());
    }

    /* renamed from: u */
    private String m23792u(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m23793w() {
        try {
            if (this.f17729b != null && !this.f17729b.isClosed()) {
                this.f17729b.close();
            }
            String t = m23791t();
            "ip = " + t;
            this.f17729b = new ServerSocket(0, 1, InetAddress.getByName(t));
            "server ip = " + this.f17729b.getInetAddress().toString() + " port = " + this.f17729b.getLocalPort();
        } catch (Exception e) {
            e.printStackTrace();
            ServerSocket serverSocket = this.f17729b;
            if (serverSocket != null && !serverSocket.isClosed()) {
                try {
                    this.f17729b.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: A */
    public void mo31662A(boolean z) {
        this.f17738k = z;
        if (z) {
            C10563z zVar = this.f17733f;
            if (zVar != null) {
                zVar.mo33394f();
                this.f17733f = null;
            }
            if (this.f17732e == null) {
                this.f17732e = new C10534a0(this.f17739l);
            }
            this.f17732e.mo33364g();
            return;
        }
        C10534a0 a0Var = this.f17732e;
        if (a0Var != null) {
            a0Var.mo33365h();
            this.f17732e = null;
        }
        if (this.f17733f == null) {
            this.f17733f = new C10563z(this.f17739l);
        }
        this.f17733f.mo33393e();
    }

    /* renamed from: B */
    public void mo31663B(C6006h hVar, boolean z) {
        if (z) {
            m23770C(hVar);
        } else {
            m23773F(hVar);
        }
    }

    /* renamed from: I */
    public void mo23487I() {
        m23789r();
        for (C6006h d0 : C4257w.m11947l0().mo23697y0()) {
            d0.mo23408d0().mo27692i(false);
        }
    }

    /* renamed from: h */
    public void mo23488h(int i) {
        m23772E();
        if (i == 1) {
            m23771D();
            return;
        }
        m23789r();
        m23772E();
    }

    /* renamed from: j */
    public void mo23489j() {
    }

    /* renamed from: v */
    public void mo23490v() {
    }

    /* renamed from: x */
    public void mo31664x() {
        m23771D();
    }

    /* renamed from: y */
    public void mo31665y(int i, int i2) {
        mo31666z(i, i2, 100);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x01cb  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31666z(int r21, int r22, int r23) {
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
            if (r2 != r7) goto L_0x0086
            float[] r2 = new float[r6]
            android.graphics.Color.colorToHSV(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r6 = r0.f17737j
            int r6 = r6 + 1
            r0.f17737j = r6
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
            r2.toString()
            r0.m23788q(r1)
            goto L_0x026a
        L_0x0086:
            java.lang.String r11 = "{\"id\":%id,\"method\":\"set_bright\",\"params\":[%value, \"smooth\", %duration]}\r\n"
            if (r1 != r7) goto L_0x00de
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r4 = r0.f17737j
            int r4 = r4 + 1
            r0.f17737j = r4
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
        L_0x00de:
            float[] r6 = new float[r6]
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            if (r1 != r7) goto L_0x0188
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r0.f17737j
            int r5 = r5 + 1
            r0.f17737j = r5
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
            r3.toString()
            r0.m23788q(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r0.f17737j
            int r3 = r3 + 1
            r0.f17737j = r3
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
        L_0x0188:
            android.graphics.Color.colorToHSV(r1, r6)
            r1 = 200(0xc8, float:2.8E-43)
            r18 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            if (r3 != r1) goto L_0x01a9
            r1 = r5
            double r4 = (double) r3
            java.lang.Double.isNaN(r4)
            r16 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r4 = r4 * r16
            int r3 = (int) r4
            double r4 = (double) r2
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r18
        L_0x01a7:
            int r2 = (int) r4
            goto L_0x01c7
        L_0x01a9:
            r1 = r5
            r4 = 50
            if (r3 != r4) goto L_0x01c0
            double r3 = (double) r3
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r16
            int r3 = (int) r3
            double r4 = (double) r2
            r16 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r16
            goto L_0x01a7
        L_0x01c0:
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r18
            int r3 = (int) r3
        L_0x01c7:
            r4 = 100
            if (r2 <= r4) goto L_0x01cd
            r2 = 100
        L_0x01cd:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r0.f17737j
            int r5 = r5 + 1
            r0.f17737j = r5
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
            r4.toString()
            r0.m23788q(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r4 = r0.f17737j
            int r4 = r4 + 1
            r0.f17737j = r4
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
        L_0x026a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C9802n.mo31666z(int, int, int):void");
    }
}
