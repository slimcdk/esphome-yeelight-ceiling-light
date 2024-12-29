package p164h.p165b.p166a.p168i;

import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p240h.p243r.C11246g;
import p164h.p257c.p259b.C11495a;

/* renamed from: h.b.a.i.d */
public abstract class C11401d<M extends C11246g> implements Runnable {

    /* renamed from: c */
    private static final Logger f22677c = Logger.getLogger(C4423b.class.getName());

    /* renamed from: a */
    private final C4423b f22678a;

    /* renamed from: b */
    private M f22679b;

    protected C11401d(C4423b bVar, M m) {
        this.f22678a = bVar;
        this.f22679b = m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo36154b();

    /* renamed from: c */
    public M mo36155c() {
        return this.f22679b;
    }

    /* renamed from: d */
    public C4423b mo36156d() {
        return this.f22678a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo36157e() {
        return true;
    }

    public void run() {
        boolean z;
        try {
            z = mo36157e();
        } catch (InterruptedException unused) {
            Logger logger = f22677c;
            logger.info("Protocol wait before execution interrupted (on shutdown?): " + getClass().getSimpleName());
            z = false;
        }
        if (z) {
            try {
                mo36154b();
            } catch (Exception e) {
                Throwable a = C11495a.m30173a(e);
                if (a instanceof InterruptedException) {
                    Logger logger2 = f22677c;
                    Level level = Level.INFO;
                    logger2.log(level, "Interrupted protocol '" + getClass().getSimpleName() + "': " + e, a);
                    return;
                }
                throw new RuntimeException("Fatal error while executing protocol '" + getClass().getSimpleName() + "': " + e, e);
            }
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
