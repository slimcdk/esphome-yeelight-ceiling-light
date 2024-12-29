package p154d.p198a.p199g;

import java.io.IOException;
import java.net.DatagramPacket;
import java.util.logging.Level;
import java.util.logging.Logger;
import p154d.p198a.p199g.p200r.C10677a;

/* renamed from: d.a.g.q */
class C10676q extends Thread {

    /* renamed from: b */
    static Logger f20459b = Logger.getLogger(C10676q.class.getName());

    /* renamed from: a */
    private final C10656l f20460a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C10676q(p154d.p198a.p199g.C10656l r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SocketListener("
            r0.append(r1)
            if (r3 == 0) goto L_0x0011
            java.lang.String r1 = r3.mo33731n0()
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
            r2.f20460a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10676q.<init>(d.a.g.l):void");
    }

    public void run() {
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8972], 8972);
            while (!this.f20460a.mo33713Y0() && !this.f20460a.mo33709S0()) {
                datagramPacket.setLength(8972);
                this.f20460a.mo33744w0().receive(datagramPacket);
                if (this.f20460a.mo33713Y0() || this.f20460a.mo33709S0() || this.f20460a.mo33719e1() || this.f20460a.isClosed()) {
                    break;
                }
                try {
                    if (!this.f20460a.mo33729m0().mo33676E(datagramPacket)) {
                        C10621c cVar = new C10621c(datagramPacket);
                        if (f20459b.isLoggable(Level.FINEST)) {
                            Logger logger = f20459b;
                            logger.finest(getName() + ".run() JmDNS in:" + cVar.mo33552y(true));
                        }
                        if (cVar.mo33573n()) {
                            if (datagramPacket.getPort() != C10677a.f20461a) {
                                this.f20460a.mo33747y0(cVar, datagramPacket.getAddress(), datagramPacket.getPort());
                            }
                            this.f20460a.mo33747y0(cVar, this.f20460a.mo33720f0(), C10677a.f20461a);
                        } else {
                            this.f20460a.mo33700B0(cVar);
                        }
                    }
                } catch (IOException e) {
                    Logger logger2 = f20459b;
                    Level level = Level.WARNING;
                    logger2.log(level, getName() + ".run() exception ", e);
                }
            }
        } catch (IOException e2) {
            if (!this.f20460a.mo33713Y0() && !this.f20460a.mo33709S0() && !this.f20460a.mo33719e1() && !this.f20460a.isClosed()) {
                Logger logger3 = f20459b;
                Level level2 = Level.WARNING;
                logger3.log(level2, getName() + ".run() exception ", e2);
                this.f20460a.mo33722i1();
            }
        }
        if (f20459b.isLoggable(Level.FINEST)) {
            Logger logger4 = f20459b;
            logger4.finest(getName() + ".run() exiting.");
        }
    }
}
