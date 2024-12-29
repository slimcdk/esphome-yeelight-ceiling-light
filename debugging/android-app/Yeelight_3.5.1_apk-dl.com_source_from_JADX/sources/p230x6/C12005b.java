package p230x6;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.message.UpnpMessage;
import org.seamless.util.C10243a;

/* renamed from: x6.b */
public abstract class C12005b<M extends UpnpMessage> implements Runnable {

    /* renamed from: c */
    private static final Logger f21978c = Logger.getLogger(C10010b.class.getName());

    /* renamed from: a */
    private final C10010b f21979a;

    /* renamed from: b */
    private M f21980b;

    protected C12005b(C10010b bVar, M m) {
        this.f21979a = bVar;
        this.f21980b = m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo42598b();

    /* renamed from: c */
    public M mo42599c() {
        return this.f21980b;
    }

    /* renamed from: d */
    public C10010b mo42600d() {
        return this.f21979a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo42601e() {
        return true;
    }

    public void run() {
        boolean z;
        try {
            z = mo42601e();
        } catch (InterruptedException unused) {
            Logger logger = f21978c;
            logger.info("Protocol wait before execution interrupted (on shutdown?): " + getClass().getSimpleName());
            z = false;
        }
        if (z) {
            try {
                mo42598b();
            } catch (Exception e) {
                Throwable a = C10243a.m25753a(e);
                if (a instanceof InterruptedException) {
                    Logger logger2 = f21978c;
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
