package p164h.p165b.p166a.p170k.p171d;

import com.xiaomi.mipush.sdk.Constants;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.p170k.C4436a;
import p164h.p165b.p166a.p170k.p172e.C11483c;
import p164h.p165b.p166a.p170k.p172e.C11484d;
import p164h.p165b.p166a.p170k.p172e.C11485f;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.p243r.C11242c;

/* renamed from: h.b.a.k.d.e */
public class C11460e implements C11483c<C11459d> {

    /* renamed from: f */
    private static Logger f22795f = Logger.getLogger(C11483c.class.getName());

    /* renamed from: a */
    protected final C11459d f22796a;

    /* renamed from: b */
    protected C4436a f22797b;

    /* renamed from: c */
    protected C11484d f22798c;

    /* renamed from: d */
    protected InetSocketAddress f22799d;

    /* renamed from: e */
    protected MulticastSocket f22800e;

    public C11460e(C11459d dVar) {
        this.f22796a = dVar;
    }

    /* renamed from: U */
    public synchronized void mo36301U(InetAddress inetAddress, C4436a aVar, C11484d dVar) {
        this.f22797b = aVar;
        this.f22798c = dVar;
        try {
            Logger logger = f22795f;
            logger.info("Creating bound socket (for datagram input/output) on: " + inetAddress);
            this.f22799d = new InetSocketAddress(inetAddress, 0);
            MulticastSocket multicastSocket = new MulticastSocket(this.f22799d);
            this.f22800e = multicastSocket;
            multicastSocket.setTimeToLive(this.f22796a.mo36300b());
            this.f22800e.setReceiveBufferSize(262144);
        } catch (Exception e) {
            throw new C11485f("Could not initialize " + getClass().getSimpleName() + ": " + e);
        }
    }

    /* renamed from: a */
    public synchronized void mo36302a(C11242c cVar) {
        if (f22795f.isLoggable(Level.FINE)) {
            Logger logger = f22795f;
            logger.fine("Sending message from address: " + this.f22799d);
        }
        DatagramPacket a = this.f22798c.mo36307a(cVar);
        if (f22795f.isLoggable(Level.FINE)) {
            Logger logger2 = f22795f;
            logger2.fine("Sending UDP datagram packet to: " + cVar.mo35748u() + Constants.COLON_SEPARATOR + cVar.mo35749v());
        }
        mo36304c(a);
    }

    /* renamed from: b */
    public C11459d mo36303b() {
        return this.f22796a;
    }

    /* renamed from: c */
    public synchronized void mo36304c(DatagramPacket datagramPacket) {
        if (f22795f.isLoggable(Level.FINE)) {
            Logger logger = f22795f;
            logger.fine("Sending message from address: " + this.f22799d);
        }
        try {
            this.f22800e.send(datagramPacket);
        } catch (SocketException unused) {
            Logger logger2 = f22795f;
            logger2.fine("Socket closed, aborting datagram send to: " + datagramPacket.getAddress());
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            Logger logger3 = f22795f;
            Level level = Level.SEVERE;
            logger3.log(level, "Exception sending datagram to: " + datagramPacket.getAddress() + ": " + e2, e2);
        }
    }

    public void run() {
        Logger logger = f22795f;
        logger.fine("Entering blocking receiving loop, listening for UDP datagrams on: " + this.f22800e.getLocalAddress());
        while (true) {
            try {
                int a = mo36303b().mo36299a();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[a], a);
                this.f22800e.receive(datagramPacket);
                Logger logger2 = f22795f;
                logger2.fine("UDP datagram received from: " + datagramPacket.getAddress().getHostAddress() + Constants.COLON_SEPARATOR + datagramPacket.getPort() + " on: " + this.f22799d);
                this.f22797b.mo24451b(this.f22798c.mo36308b(this.f22799d.getAddress(), datagramPacket));
            } catch (SocketException unused) {
                f22795f.fine("Socket closed");
                try {
                    if (!this.f22800e.isClosed()) {
                        f22795f.fine("Closing unicast socket");
                        this.f22800e.close();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (C11221k e2) {
                Logger logger3 = f22795f;
                logger3.info("Could not read datagram: " + e2.getMessage());
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public synchronized void stop() {
        if (this.f22800e != null && !this.f22800e.isClosed()) {
            this.f22800e.close();
        }
    }
}
