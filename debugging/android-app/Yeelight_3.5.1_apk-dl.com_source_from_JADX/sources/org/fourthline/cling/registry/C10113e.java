package org.fourthline.cling.registry;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: org.fourthline.cling.registry.e */
public class C10113e implements Runnable {

    /* renamed from: d */
    private static Logger f18668d = Logger.getLogger(C10113e.class.getName());

    /* renamed from: a */
    private final C3578b f18669a;

    /* renamed from: b */
    private final int f18670b;

    /* renamed from: c */
    private volatile boolean f18671c = false;

    public C10113e(C3578b bVar, int i) {
        this.f18669a = bVar;
        this.f18670b = i;
    }

    public void run() {
        this.f18671c = false;
        if (f18668d.isLoggable(Level.FINE)) {
            Logger logger = f18668d;
            logger.fine("Running registry maintenance loop every milliseconds: " + this.f18670b);
        }
        while (!this.f18671c) {
            try {
                this.f18669a.mo24933R();
                Thread.sleep((long) this.f18670b);
            } catch (InterruptedException unused) {
                this.f18671c = true;
            }
        }
        f18668d.fine("Stopped status on thread received, ending maintenance loop");
    }

    public void stop() {
        if (f18668d.isLoggable(Level.FINE)) {
            f18668d.fine("Setting stopped status on thread");
        }
        this.f18671c = true;
    }
}
