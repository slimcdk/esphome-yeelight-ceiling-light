package com.yeelight.yeelib.managers;

import android.content.IntentFilter;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.miot.common.device.ConnectionInfo;
import com.yeelight.yeelib.device.LanDevice;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C8272e;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.p194io.FilenameUtils;

/* renamed from: com.yeelight.yeelib.managers.i */
public class C3072i implements C8272e.C3063a {

    /* renamed from: j */
    private static C3072i f4883j;

    /* renamed from: a */
    private long f4884a;

    /* renamed from: b */
    private long f4885b;

    /* renamed from: c */
    MulticastSocket f4886c;

    /* renamed from: d */
    private byte[] f4887d;

    /* renamed from: e */
    boolean f4888e;

    /* renamed from: f */
    private Thread f4889f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ConcurrentHashMap<String, LanDevice> f4890g;

    /* renamed from: h */
    Handler f4891h;

    /* renamed from: i */
    private Runnable f4892i;

    /* renamed from: com.yeelight.yeelib.managers.i$a */
    class C3073a extends Handler {
        C3073a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C3072i.this.m8045p();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.i$b */
    class C3074b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DatagramPacket f4894a;

        C3074b(DatagramPacket datagramPacket) {
            this.f4894a = datagramPacket;
        }

        public void run() {
            try {
                Thread.sleep(5000);
                C3072i.this.f4886c.send(this.f4894a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.i$c */
    class C3075c implements Runnable {
        C3075c() {
        }

        public void run() {
            C3072i iVar = C3072i.this;
            boolean z = true;
            while (true) {
                iVar.f4888e = z;
                while (C3072i.this.f4888e) {
                    DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
                    try {
                        C3072i.this.f4886c.receive(datagramPacket);
                        StringBuilder sb = new StringBuilder();
                        sb.append("mi device found, device id, = ");
                        sb.append(datagramPacket.getAddress().getHostAddress());
                        synchronized (C3072i.this.f4890g) {
                            LanDevice c = C3072i.this.m8044o(datagramPacket);
                            if (c != null && !C3072i.this.f4890g.containsKey(c.mo23185G())) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(" response socket detect new device , add into device map, device id = ");
                                sb2.append(c.mo23185G());
                                C3072i.this.f4890g.put(c.mo23185G(), c);
                                c.mo23130S1();
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        iVar = C3072i.this;
                        z = false;
                    }
                }
                return;
            }
        }
    }

    public C3072i() {
        this.f4887d = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        this.f4888e = false;
        this.f4890g = new ConcurrentHashMap<>();
        this.f4891h = new C3073a(Looper.getMainLooper());
        this.f4892i = new C3075c();
        this.f4890g = new ConcurrentHashMap<>();
        new IntentFilter().addAction("android.net.conn.CONNECTIVITY_CHANGE");
        C8272e.m19511b().mo35211k(this, false);
    }

    /* renamed from: f */
    private void m8041f() {
        try {
            for (LanDevice G : this.f4890g.values()) {
                WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(G.mo23185G());
                if (P0 != null) {
                    P0.mo23193K0((LanDevice) null);
                }
            }
            this.f4890g.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    public static C3072i m8042k() {
        if (f4883j == null) {
            f4883j = new C3072i();
        }
        return f4883j;
    }

    /* renamed from: n */
    private String m8043n(long j) {
        return String.valueOf((int) (j & 255)) + FilenameUtils.EXTENSION_SEPARATOR + String.valueOf((int) ((j >> 8) & 255)) + FilenameUtils.EXTENSION_SEPARATOR + String.valueOf((int) ((j >> 16) & 255)) + FilenameUtils.EXTENSION_SEPARATOR + String.valueOf((int) ((j >> 24) & 255));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public LanDevice m8044o(DatagramPacket datagramPacket) {
        byte[] data = datagramPacket.getData();
        InetAddress address = datagramPacket.getAddress();
        if (data[0] != 33 || data[1] != 49) {
            return null;
        }
        String valueOf = String.valueOf(Long.parseLong(String.format("%02x", new Object[]{Byte.valueOf(data[4])}) + String.format("%02x", new Object[]{Byte.valueOf(data[5])}) + String.format("%02x", new Object[]{Byte.valueOf(data[6])}) + String.format("%02x", new Object[]{Byte.valueOf(data[7])}) + String.format("%02x", new Object[]{Byte.valueOf(data[8])}) + String.format("%02x", new Object[]{Byte.valueOf(data[9])}) + String.format("%02x", new Object[]{Byte.valueOf(data[10])}) + String.format("%02x", new Object[]{Byte.valueOf(data[11])}), 16));
        if (YeelightDeviceManager.m7800o0().mo23274P0(valueOf) == null) {
            return null;
        }
        return new LanDevice(address, String.valueOf(valueOf));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m8045p() {
        mo23436l();
        try {
            MulticastSocket multicastSocket = new MulticastSocket();
            this.f4886c = multicastSocket;
            multicastSocket.setTimeToLive(4);
            byte[] m = mo23437m(-1, -1, this.f4887d, 32);
            StringBuilder sb = new StringBuilder();
            sb.append("send broadcast to: ");
            sb.append(mo23435h());
            new Thread(new C3074b(new DatagramPacket(m, m.length, mo23435h(), ConnectionInfo.DEFAULT_PORT))).start();
            Thread thread = this.f4889f;
            if (thread != null) {
                thread.interrupt();
            }
            m8046r();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r */
    private void m8046r() {
        Thread thread = new Thread(this.f4892i);
        this.f4889f = thread;
        thread.start();
    }

    /* renamed from: I */
    public void mo23265I() {
        mo23433e();
    }

    /* renamed from: d */
    public void mo23432d(LanDevice lanDevice) {
        YeelightDeviceManager.m7794j0(lanDevice.mo23185G()).mo23193K0(lanDevice);
    }

    /* renamed from: e */
    public void mo23433e() {
        Thread thread = this.f4889f;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            for (LanDevice next : this.f4890g.values()) {
                if (next.mo23129Q1() != null) {
                    next.mo23129Q1().close();
                }
            }
        } catch (IOException unused) {
        }
        m8041f();
    }

    /* renamed from: g */
    public List<LanDevice> mo23434g() {
        ArrayList<LanDevice> arrayList = new ArrayList<>();
        for (String str : this.f4890g.keySet()) {
            arrayList.add(this.f4890g.get(str));
        }
        for (LanDevice append : arrayList) {
            StringBuilder sb = new StringBuilder();
            sb.append("##### device: ");
            sb.append(append);
        }
        return arrayList;
    }

    /* renamed from: h */
    public InetAddress mo23435h() {
        try {
            return InetAddress.getByName(m8043n(this.f4884a | (this.f4885b ^ -1)));
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public void mo23294i(int i) {
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(" current in wifi network, connected SSID: ");
            sb.append(C8272e.m19511b().mo35202a());
            this.f4891h.sendEmptyMessageDelayed(1, 2000);
            return;
        }
        mo23433e();
    }

    /* renamed from: j */
    public void mo23296j() {
    }

    /* renamed from: l */
    public void mo23436l() {
        long j;
        StringBuilder sb = new StringBuilder();
        sb.append("application instance: ");
        sb.append(C3108x.f4951e);
        DhcpInfo dhcpInfo = ((WifiManager) C3108x.f4951e.getSystemService("wifi")).getDhcpInfo();
        if (dhcpInfo != null) {
            this.f4884a = (long) dhcpInfo.ipAddress;
            j = (long) dhcpInfo.gateway;
            this.f4885b = (long) dhcpInfo.netmask;
        } else {
            j = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ip: ");
        sb2.append(m8043n(this.f4884a));
        sb2.append(", gw: ");
        sb2.append(m8043n(j));
        sb2.append(", netmask: ");
        sb2.append(m8043n(this.f4885b));
    }

    /* renamed from: m */
    public byte[] mo23437m(long j, int i, byte[] bArr, int i2) {
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
    public void mo23438q() {
        if (C8272e.m19511b().mo35205e()) {
            m8045p();
        }
    }

    /* renamed from: s */
    public void mo23439s(String str) {
        C3010c j0 = YeelightDeviceManager.m7794j0(str);
        if (j0 != null) {
            j0.mo23193K0((LanDevice) null);
            this.f4890g.remove(str);
        }
    }

    /* renamed from: v */
    public void mo23318v() {
    }
}
