package org.fourthline.cling.transport.impl;

import com.xiaomi.mipush.sdk.Constants;
import java.net.DatagramPacket;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.transport.spi.InitializationException;
import p132b7.C4003a;
import p148d7.C8954d;
import p148d7.C8956f;
import p148d7.C8957g;

/* renamed from: org.fourthline.cling.transport.impl.i */
public class C10132i implements C8956f<C10131h> {

    /* renamed from: h */
    private static Logger f18713h = Logger.getLogger(C8956f.class.getName());

    /* renamed from: a */
    protected final C10131h f18714a;

    /* renamed from: b */
    protected C4003a f18715b;

    /* renamed from: c */
    protected C8957g f18716c;

    /* renamed from: d */
    protected C8954d f18717d;

    /* renamed from: e */
    protected NetworkInterface f18718e;

    /* renamed from: f */
    protected InetSocketAddress f18719f;

    /* renamed from: g */
    protected MulticastSocket f18720g;

    public C10132i(C10131h hVar) {
        this.f18714a = hVar;
    }

    /* renamed from: b */
    public C10131h mo40757b() {
        return this.f18714a;
    }

    /* renamed from: p */
    public synchronized void mo36793p(NetworkInterface networkInterface, C4003a aVar, C8957g gVar, C8954d dVar) {
        this.f18715b = aVar;
        this.f18716c = gVar;
        this.f18717d = dVar;
        this.f18718e = networkInterface;
        try {
            Logger logger = f18713h;
            logger.info("Creating wildcard socket (for receiving multicast datagrams) on port: " + this.f18714a.mo40756c());
            this.f18719f = new InetSocketAddress(this.f18714a.mo40754a(), this.f18714a.mo40756c());
            MulticastSocket multicastSocket = new MulticastSocket(this.f18714a.mo40756c());
            this.f18720g = multicastSocket;
            multicastSocket.setReuseAddress(true);
            this.f18720g.setReceiveBufferSize(32768);
            Logger logger2 = f18713h;
            logger2.info("Joining multicast group: " + this.f18719f + " on network interface: " + this.f18718e.getDisplayName());
            this.f18720g.joinGroup(this.f18719f, this.f18718e);
        } catch (Exception e) {
            throw new InitializationException("Could not initialize " + C10132i.class.getSimpleName() + ": " + e);
        }
    }

    public void run() {
        Logger logger = f18713h;
        logger.fine("Entering blocking receiving loop, listening for UDP datagrams on: " + this.f18720g.getLocalAddress());
        while (true) {
            try {
                int b = mo40757b().mo40755b();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[b], b);
                this.f18720g.receive(datagramPacket);
                InetAddress h = this.f18716c.mo36802h(this.f18718e, this.f18719f.getAddress() instanceof Inet6Address, datagramPacket.getAddress());
                Logger logger2 = f18713h;
                logger2.fine("UDP datagram received from: " + datagramPacket.getAddress().getHostAddress() + Constants.COLON_SEPARATOR + datagramPacket.getPort() + " on local interface: " + this.f18718e.getDisplayName() + " and address: " + h.getHostAddress());
                this.f18715b.mo24967b(this.f18717d.mo36791b(h, datagramPacket));
            } catch (SocketException unused) {
                f18713h.fine("Socket closed");
                try {
                    if (!this.f18720g.isClosed()) {
                        f18713h.fine("Closing multicast socket");
                        this.f18720g.close();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (UnsupportedDataException e2) {
                Logger logger3 = f18713h;
                logger3.info("Could not read datagram: " + e2.getMessage());
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public synchronized void stop() {
        MulticastSocket multicastSocket = this.f18720g;
        if (multicastSocket != null && !multicastSocket.isClosed()) {
            try {
                f18713h.fine("Leaving multicast group");
                this.f18720g.leaveGroup(this.f18719f, this.f18718e);
            } catch (Exception e) {
                Logger logger = f18713h;
                logger.fine("Could not leave multicast group: " + e);
            }
            this.f18720g.close();
        }
    }
}
