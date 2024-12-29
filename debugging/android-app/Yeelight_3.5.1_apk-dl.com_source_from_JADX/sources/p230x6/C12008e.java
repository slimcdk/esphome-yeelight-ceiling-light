package p230x6;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.seamless.util.C10243a;

/* renamed from: x6.e */
public abstract class C12008e implements Runnable {

    /* renamed from: b */
    private static final Logger f21989b = Logger.getLogger(C10010b.class.getName());

    /* renamed from: a */
    private final C10010b f21990a;

    protected C12008e(C10010b bVar) {
        this.f21990a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo42616b();

    /* renamed from: c */
    public C10010b mo42617c() {
        return this.f21990a;
    }

    public void run() {
        try {
            mo42616b();
        } catch (Exception e) {
            Throwable a = C10243a.m25753a(e);
            if (a instanceof InterruptedException) {
                Logger logger = f21989b;
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
