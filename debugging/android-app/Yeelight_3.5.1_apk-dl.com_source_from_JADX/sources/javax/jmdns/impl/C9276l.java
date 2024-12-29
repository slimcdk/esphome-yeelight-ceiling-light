package javax.jmdns.impl;

import java.io.IOException;
import java.net.DatagramPacket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.constants.C9245a;

/* renamed from: javax.jmdns.impl.l */
class C9276l extends Thread {

    /* renamed from: b */
    static Logger f17195b = Logger.getLogger(C9276l.class.getName());

    /* renamed from: a */
    private final JmDNSImpl f17196a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C9276l(javax.jmdns.impl.JmDNSImpl r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SocketListener("
            r0.append(r1)
            if (r3 == 0) goto L_0x0011
            java.lang.String r1 = r3.mo37444o0()
            goto L_0x0013
        L_0x0011:
            java.lang.String r1 = ""
        L_0x0013:
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r0 = 1
            r2.setDaemon(r0)
            r2.f17196a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.C9276l.<init>(javax.jmdns.impl.JmDNSImpl):void");
    }

    public void run() {
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8972], 8972);
            while (!this.f17196a.mo37413S0() && !this.f17196a.mo37411N0()) {
                datagramPacket.setLength(8972);
                this.f17196a.mo37457w0().receive(datagramPacket);
                if (this.f17196a.mo37413S0() || this.f17196a.mo37411N0() || this.f17196a.mo37414U0() || this.f17196a.isClosed()) {
                    break;
                }
                try {
                    if (!this.f17196a.mo37436k0().mo37376D(datagramPacket)) {
                        C9241c cVar = new C9241c(datagramPacket);
                        if (f17195b.isLoggable(Level.FINEST)) {
                            Logger logger = f17195b;
                            logger.finest(getName() + ".run() JmDNS in:" + cVar.mo37583y(true));
                        }
                        if (cVar.mo37632n()) {
                            int port = datagramPacket.getPort();
                            int i = C9245a.f17144a;
                            if (port != i) {
                                this.f17196a.mo37461y0(cVar, datagramPacket.getAddress(), datagramPacket.getPort());
                            }
                            JmDNSImpl jmDNSImpl = this.f17196a;
                            jmDNSImpl.mo37461y0(cVar, jmDNSImpl.mo37425g0(), i);
                        } else {
                            this.f17196a.mo37400A0(cVar);
                        }
                    }
                } catch (IOException e) {
                    Logger logger2 = f17195b;
                    Level level = Level.WARNING;
                    logger2.log(level, getName() + ".run() exception ", e);
                }
            }
        } catch (IOException e2) {
            if (!this.f17196a.mo37413S0() && !this.f17196a.mo37411N0() && !this.f17196a.mo37414U0() && !this.f17196a.isClosed()) {
                Logger logger3 = f17195b;
                Level level2 = Level.WARNING;
                logger3.log(level2, getName() + ".run() exception ", e2);
                this.f17196a.mo37426g1();
            }
        }
        if (f17195b.isLoggable(Level.FINEST)) {
            Logger logger4 = f17195b;
            logger4.finest(getName() + ".run() exiting.");
        }
    }
}
