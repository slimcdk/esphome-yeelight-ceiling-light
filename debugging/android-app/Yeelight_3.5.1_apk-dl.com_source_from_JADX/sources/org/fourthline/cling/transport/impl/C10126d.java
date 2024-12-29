package org.fourthline.cling.transport.impl;

import com.xiaomi.mipush.sdk.Constants;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.message.C10029c;
import org.fourthline.cling.transport.spi.InitializationException;
import p132b7.C4003a;
import p148d7.C8953c;
import p148d7.C8954d;

/* renamed from: org.fourthline.cling.transport.impl.d */
public class C10126d implements C8953c<C10125c> {

    /* renamed from: f */
    private static Logger f18701f = Logger.getLogger(C8953c.class.getName());

    /* renamed from: a */
    protected final C10125c f18702a;

    /* renamed from: b */
    protected C4003a f18703b;

    /* renamed from: c */
    protected C8954d f18704c;

    /* renamed from: d */
    protected InetSocketAddress f18705d;

    /* renamed from: e */
    protected MulticastSocket f18706e;

    public C10126d(C10125c cVar) {
        this.f18702a = cVar;
    }

    /* renamed from: a */
    public synchronized void mo36787a(C10029c cVar) {
        Logger logger = f18701f;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            Logger logger2 = f18701f;
            logger2.fine("Sending message from address: " + this.f18705d);
        }
        DatagramPacket a = this.f18704c.mo36790a(cVar);
        if (f18701f.isLoggable(level)) {
            Logger logger3 = f18701f;
            logger3.fine("Sending UDP datagram packet to: " + cVar.mo40432u() + Constants.COLON_SEPARATOR + cVar.mo40433v());
        }
        mo40738c(a);
    }

    /* renamed from: b */
    public C10125c mo40737b() {
        return this.f18702a;
    }

    /* renamed from: c */
    public synchronized void mo40738c(DatagramPacket datagramPacket) {
        if (f18701f.isLoggable(Level.FINE)) {
            Logger logger = f18701f;
            logger.fine("Sending message from address: " + this.f18705d);
        }
        try {
            this.f18706e.send(datagramPacket);
        } catch (SocketException unused) {
            Logger logger2 = f18701f;
            logger2.fine("Socket closed, aborting datagram send to: " + datagramPacket.getAddress());
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            Logger logger3 = f18701f;
            Level level = Level.SEVERE;
            logger3.log(level, "Exception sending datagram to: " + datagramPacket.getAddress() + ": " + e2, e2);
        }
    }

    public void run() {
        Logger logger = f18701f;
        logger.fine("Entering blocking receiving loop, listening for UDP datagrams on: " + this.f18706e.getLocalAddress());
        while (true) {
            try {
                int a = mo40737b().mo40735a();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[a], a);
                this.f18706e.receive(datagramPacket);
                Logger logger2 = f18701f;
                logger2.fine("UDP datagram received from: " + datagramPacket.getAddress().getHostAddress() + Constants.COLON_SEPARATOR + datagramPacket.getPort() + " on: " + this.f18705d);
                this.f18703b.mo24967b(this.f18704c.mo36791b(this.f18705d.getAddress(), datagramPacket));
            } catch (SocketException unused) {
                f18701f.fine("Socket closed");
                try {
                    if (!this.f18706e.isClosed()) {
                        f18701f.fine("Closing unicast socket");
                        this.f18706e.close();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (UnsupportedDataException e2) {
                Logger logger3 = f18701f;
                logger3.info("Could not read datagram: " + e2.getMessage());
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public synchronized void stop() {
        MulticastSocket multicastSocket = this.f18706e;
        if (multicastSocket != null && !multicastSocket.isClosed()) {
            this.f18706e.close();
        }
    }

    /* renamed from: w */
    public synchronized void mo36789w(InetAddress inetAddress, C4003a aVar, C8954d dVar) {
        this.f18703b = aVar;
        this.f18704c = dVar;
        try {
            Logger logger = f18701f;
            logger.info("Creating bound socket (for datagram input/output) on: " + inetAddress);
            this.f18705d = new InetSocketAddress(inetAddress, 0);
            MulticastSocket multicastSocket = new MulticastSocket(this.f18705d);
            this.f18706e = multicastSocket;
            multicastSocket.setTimeToLive(this.f18702a.mo40736b());
            this.f18706e.setReceiveBufferSize(262144);
        } catch (Exception e) {
            throw new InitializationException("Could not initialize " + C10126d.class.getSimpleName() + ": " + e);
        }
    }
}
