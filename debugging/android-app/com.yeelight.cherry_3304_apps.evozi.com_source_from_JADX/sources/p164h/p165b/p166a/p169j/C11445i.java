package p164h.p165b.p166a.p169j;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: h.b.a.j.i */
public class C11445i implements Runnable {

    /* renamed from: d */
    private static Logger f22760d = Logger.getLogger(C11445i.class.getName());

    /* renamed from: a */
    private final C4433e f22761a;

    /* renamed from: b */
    private final int f22762b;

    /* renamed from: c */
    private volatile boolean f22763c = false;

    public C11445i(C4433e eVar, int i) {
        this.f22761a = eVar;
        this.f22762b = i;
    }

    public void run() {
        this.f22763c = false;
        if (f22760d.isLoggable(Level.FINE)) {
            Logger logger = f22760d;
            logger.fine("Running registry maintenance loop every milliseconds: " + this.f22762b);
        }
        while (!this.f22763c) {
            try {
                this.f22761a.mo24445R();
                Thread.sleep((long) this.f22762b);
            } catch (InterruptedException unused) {
                this.f22763c = true;
            }
        }
        f22760d.fine("Stopped status on thread received, ending maintenance loop");
    }

    public void stop() {
        if (f22760d.isLoggable(Level.FINE)) {
            f22760d.fine("Setting stopped status on thread");
        }
        this.f22763c = true;
    }
}
