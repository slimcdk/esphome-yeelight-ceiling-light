package p164h.p165b.p166a.p170k.p171d;

import com.xiaomi.mipush.sdk.Constants;
import java.net.DatagramPacket;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.logging.Logger;
import p164h.p165b.p166a.p170k.C4436a;
import p164h.p165b.p166a.p170k.p172e.C11484d;
import p164h.p165b.p166a.p170k.p172e.C11485f;
import p164h.p165b.p166a.p170k.p172e.C11486g;
import p164h.p165b.p166a.p170k.p172e.C11487h;
import p164h.p165b.p166a.p240h.C11221k;

/* renamed from: h.b.a.k.d.j */
public class C11465j implements C11486g<C11464i> {

    /* renamed from: h */
    private static Logger f22806h = Logger.getLogger(C11486g.class.getName());

    /* renamed from: a */
    protected final C11464i f22807a;

    /* renamed from: b */
    protected C4436a f22808b;

    /* renamed from: c */
    protected C11487h f22809c;

    /* renamed from: d */
    protected C11484d f22810d;

    /* renamed from: e */
    protected NetworkInterface f22811e;

    /* renamed from: f */
    protected InetSocketAddress f22812f;

    /* renamed from: g */
    protected MulticastSocket f22813g;

    public C11465j(C11464i iVar) {
        this.f22807a = iVar;
    }

    /* renamed from: P */
    public synchronized void mo36315P(NetworkInterface networkInterface, C4436a aVar, C11487h hVar, C11484d dVar) {
        this.f22808b = aVar;
        this.f22809c = hVar;
        this.f22810d = dVar;
        this.f22811e = networkInterface;
        try {
            Logger logger = f22806h;
            logger.info("Creating wildcard socket (for receiving multicast datagrams) on port: " + this.f22807a.mo36314c());
            this.f22812f = new InetSocketAddress(this.f22807a.mo36312a(), this.f22807a.mo36314c());
            MulticastSocket multicastSocket = new MulticastSocket(this.f22807a.mo36314c());
            this.f22813g = multicastSocket;
            multicastSocket.setReuseAddress(true);
            this.f22813g.setReceiveBufferSize(32768);
            Logger logger2 = f22806h;
            logger2.info("Joining multicast group: " + this.f22812f + " on network interface: " + this.f22811e.getDisplayName());
            this.f22813g.joinGroup(this.f22812f, this.f22811e);
        } catch (Exception e) {
            throw new C11485f("Could not initialize " + getClass().getSimpleName() + ": " + e);
        }
    }

    /* renamed from: b */
    public C11464i mo36316b() {
        return this.f22807a;
    }

    public void run() {
        Logger logger = f22806h;
        logger.fine("Entering blocking receiving loop, listening for UDP datagrams on: " + this.f22813g.getLocalAddress());
        while (true) {
            try {
                int b = mo36316b().mo36313b();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[b], b);
                this.f22813g.receive(datagramPacket);
                InetAddress h = this.f22809c.mo35513h(this.f22811e, this.f22812f.getAddress() instanceof Inet6Address, datagramPacket.getAddress());
                Logger logger2 = f22806h;
                logger2.fine("UDP datagram received from: " + datagramPacket.getAddress().getHostAddress() + Constants.COLON_SEPARATOR + datagramPacket.getPort() + " on local interface: " + this.f22811e.getDisplayName() + " and address: " + h.getHostAddress());
                this.f22808b.mo24451b(this.f22810d.mo36308b(h, datagramPacket));
            } catch (SocketException unused) {
                f22806h.fine("Socket closed");
                try {
                    if (!this.f22813g.isClosed()) {
                        f22806h.fine("Closing multicast socket");
                        this.f22813g.close();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (C11221k e2) {
                Logger logger3 = f22806h;
                logger3.info("Could not read datagram: " + e2.getMessage());
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public synchronized void stop() {
        if (this.f22813g != null && !this.f22813g.isClosed()) {
            try {
                f22806h.fine("Leaving multicast group");
                this.f22813g.leaveGroup(this.f22812f, this.f22811e);
            } catch (Exception e) {
                Logger logger = f22806h;
                logger.fine("Could not leave multicast group: " + e);
            }
            this.f22813g.close();
        }
    }
}
