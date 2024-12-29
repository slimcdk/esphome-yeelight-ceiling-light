package com.yeelight.yeelib.p152f;

import android.content.IntentFilter;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.miot.common.device.ConnectionInfo;
import com.yeelight.yeelib.p150c.C4191d;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C9784e;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.p271io.FilenameUtils;

/* renamed from: com.yeelight.yeelib.f.h */
public class C4222h implements C9784e.C4213a {

    /* renamed from: j */
    private static C4222h f7325j;

    /* renamed from: a */
    private long f7326a;

    /* renamed from: b */
    private long f7327b;

    /* renamed from: c */
    MulticastSocket f7328c;

    /* renamed from: d */
    private byte[] f7329d;

    /* renamed from: e */
    boolean f7330e;

    /* renamed from: f */
    private Thread f7331f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ConcurrentHashMap<String, C4191d> f7332g;

    /* renamed from: h */
    Handler f7333h;

    /* renamed from: i */
    private Runnable f7334i;

    /* renamed from: com.yeelight.yeelib.f.h$a */
    class C4223a extends Handler {
        C4223a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C4222h.this.m11728p();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.h$b */
    class C4224b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DatagramPacket f7336a;

        C4224b(DatagramPacket datagramPacket) {
            this.f7336a = datagramPacket;
        }

        public void run() {
            try {
                Thread.sleep(5000);
                C4222h.this.f7328c.send(this.f7336a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.h$c */
    class C4225c implements Runnable {
        C4225c() {
        }

        public void run() {
            C4222h hVar = C4222h.this;
            boolean z = true;
            while (true) {
                hVar.f7330e = z;
                while (C4222h.this.f7330e) {
                    DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
                    try {
                        C4222h.this.f7328c.receive(datagramPacket);
                        "mi device found, device id, = " + datagramPacket.getAddress().getHostAddress();
                        synchronized (C4222h.this.f7332g) {
                            C4191d c = C4222h.this.m11727o(datagramPacket);
                            if (c != null && !C4222h.this.f7332g.containsKey(c.mo23372G())) {
                                " response socket detect new device , add into device map, device id = " + c.mo23372G();
                                C4222h.this.f7332g.put(c.mo23372G(), c);
                                c.mo23316S1();
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        hVar = C4222h.this;
                        z = false;
                    }
                }
                return;
            }
        }
    }

    public C4222h() {
        this.f7329d = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        this.f7330e = false;
        this.f7332g = new ConcurrentHashMap<>();
        this.f7333h = new C4223a(Looper.getMainLooper());
        this.f7334i = new C4225c();
        this.f7332g = new ConcurrentHashMap<>();
        new IntentFilter().addAction("android.net.conn.CONNECTIVITY_CHANGE");
        C9784e.m23711b().mo31635k(this, false);
    }

    /* renamed from: f */
    private void m11724f() {
        try {
            for (C4191d G : this.f7332g.values()) {
                C6006h L0 = C4257w.m11947l0().mo23651L0(G.mo23372G());
                if (L0 != null) {
                    L0.mo23380K0((C4191d) null);
                }
            }
            this.f7332g.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    public static C4222h m11725k() {
        if (f7325j == null) {
            f7325j = new C4222h();
        }
        return f7325j;
    }

    /* renamed from: n */
    private String m11726n(long j) {
        return String.valueOf((int) (j & 255)) + FilenameUtils.EXTENSION_SEPARATOR + String.valueOf((int) ((j >> 8) & 255)) + FilenameUtils.EXTENSION_SEPARATOR + String.valueOf((int) ((j >> 16) & 255)) + FilenameUtils.EXTENSION_SEPARATOR + String.valueOf((int) ((j >> 24) & 255));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public C4191d m11727o(DatagramPacket datagramPacket) {
        byte[] data = datagramPacket.getData();
        InetAddress address = datagramPacket.getAddress();
        if (data[0] != 33 || data[1] != 49) {
            return null;
        }
        String valueOf = String.valueOf(Long.parseLong(String.format("%02x", new Object[]{Byte.valueOf(data[4])}) + String.format("%02x", new Object[]{Byte.valueOf(data[5])}) + String.format("%02x", new Object[]{Byte.valueOf(data[6])}) + String.format("%02x", new Object[]{Byte.valueOf(data[7])}) + String.format("%02x", new Object[]{Byte.valueOf(data[8])}) + String.format("%02x", new Object[]{Byte.valueOf(data[9])}) + String.format("%02x", new Object[]{Byte.valueOf(data[10])}) + String.format("%02x", new Object[]{Byte.valueOf(data[11])}), 16));
        if (C4257w.m11947l0().mo23651L0(valueOf) == null) {
            return null;
        }
        return new C4191d(address, String.valueOf(valueOf));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m11728p() {
        mo23537l();
        try {
            MulticastSocket multicastSocket = new MulticastSocket();
            this.f7328c = multicastSocket;
            multicastSocket.setTimeToLive(4);
            byte[] m = mo23538m(-1, -1, this.f7329d, 32);
            "send broadcast to: " + mo23536i();
            new Thread(new C4224b(new DatagramPacket(m, m.length, mo23536i(), ConnectionInfo.DEFAULT_PORT))).start();
            if (this.f7331f != null) {
                this.f7331f.interrupt();
            }
            m11729r();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r */
    private void m11729r() {
        Thread thread = new Thread(this.f7334i);
        this.f7331f = thread;
        thread.start();
    }

    /* renamed from: I */
    public void mo23487I() {
        mo23534e();
    }

    /* renamed from: d */
    public void mo23533d(C4191d dVar) {
        C4257w.m11945h0(dVar.mo23372G()).mo23380K0(dVar);
    }

    /* renamed from: e */
    public void mo23534e() {
        Thread thread = this.f7331f;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            for (C4191d next : this.f7332g.values()) {
                if (next.mo23315Q1() != null) {
                    next.mo23315Q1().close();
                }
            }
        } catch (IOException unused) {
        }
        m11724f();
    }

    /* renamed from: g */
    public List<C4191d> mo23535g() {
        ArrayList<C4191d> arrayList = new ArrayList<>();
        for (String str : this.f7332g.keySet()) {
            arrayList.add(this.f7332g.get(str));
        }
        for (C4191d dVar : arrayList) {
            "##### device: " + dVar;
        }
        return arrayList;
    }

    /* renamed from: h */
    public void mo23488h(int i) {
        if (i == 1) {
            " current in wifi network, connected SSID: " + C9784e.m23711b().mo31626a();
            this.f7333h.sendEmptyMessageDelayed(1, 2000);
            return;
        }
        mo23534e();
    }

    /* renamed from: i */
    public InetAddress mo23536i() {
        try {
            return InetAddress.getByName(m11726n(this.f7326a | (this.f7327b ^ -1)));
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public void mo23489j() {
    }

    /* renamed from: l */
    public void mo23537l() {
        long j;
        "application instance: " + C4297y.f7456e;
        DhcpInfo dhcpInfo = ((WifiManager) C4297y.f7456e.getSystemService("wifi")).getDhcpInfo();
        if (dhcpInfo != null) {
            this.f7326a = (long) dhcpInfo.ipAddress;
            j = (long) dhcpInfo.gateway;
            this.f7327b = (long) dhcpInfo.netmask;
        } else {
            j = 0;
        }
        "ip: " + m11726n(this.f7326a) + ", gw: " + m11726n(j) + ", netmask: " + m11726n(this.f7327b);
    }

    /* renamed from: m */
    public byte[] mo23538m(long j, int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[32];
        int i3 = 0;
        bArr2[0] = 33;
        bArr2[1] = 49;
        bArr2[2] = (byte) (i2 >> 8);
        bArr2[3] = (byte) (i2 & 255);
        bArr2[4] = (byte) ((int) (j >> 56));
        bArr2[5] = (byte) ((int) (j >> 48));
        bArr2[6] = (byte) ((int) (j >> 40));
        bArr2[7] = (byte) ((int) (j >> 32));
        bArr2[8] = (byte) ((int) (j >> 24));
        bArr2[9] = (byte) ((int) (j >> 16));
        bArr2[10] = (byte) ((int) (j >> 8));
        bArr2[11] = (byte) ((int) (j & 255));
        bArr2[12] = (byte) (i >> 24);
        bArr2[13] = (byte) (i >> 16);
        bArr2[14] = (byte) (i >> 8);
        bArr2[15] = (byte) (i & 255);
        int i4 = 16;
        while (i3 < 16) {
            bArr2[i4] = bArr[i3];
            i3++;
            i4++;
        }
        return bArr2;
    }

    /* renamed from: q */
    public void mo23539q() {
        if (C9784e.m23711b().mo31629e()) {
            m11728p();
        }
    }

    /* renamed from: s */
    public void mo23540s(String str) {
        C4198d h0 = C4257w.m11945h0(str);
        if (h0 != null) {
            h0.mo23380K0((C4191d) null);
            this.f7332g.remove(str);
        }
    }

    /* renamed from: v */
    public void mo23490v() {
    }
}
