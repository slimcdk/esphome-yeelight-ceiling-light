package p164h.p165b.p166a.p168i;

import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p257c.p259b.C11495a;

/* renamed from: h.b.a.i.g */
public abstract class C11404g implements Runnable {

    /* renamed from: b */
    private static final Logger f22688b = Logger.getLogger(C4423b.class.getName());

    /* renamed from: a */
    private final C4423b f22689a;

    protected C11404g(C4423b bVar) {
        this.f22689a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo36172b();

    /* renamed from: c */
    public C4423b mo36173c() {
        return this.f22689a;
    }

    public void run() {
        try {
            mo36172b();
        } catch (Exception e) {
            Throwable a = C11495a.m30173a(e);
            if (a instanceof InterruptedException) {
                Logger logger = f22688b;
                Level level = Level.INFO;
                logger.log(level, "Interrupted protocol '" + getClass().getSimpleName() + "': " + e, a);
                return;
            }
            throw new RuntimeException("Fatal error while executing protocol '" + getClass().getSimpleName() + "': " + e, e);
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
