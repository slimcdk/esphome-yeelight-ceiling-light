package p202q4;

import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.C9248f;
import javax.jmdns.impl.JmDNSImpl;
import p198p4.C10268a;

/* renamed from: q4.a */
public abstract class C10280a extends C10268a {

    /* renamed from: c */
    private static Logger f19365c = Logger.getLogger(C10280a.class.getName());

    /* renamed from: b */
    protected int f19366b = 0;

    public C10280a(JmDNSImpl jmDNSImpl) {
        super(jmDNSImpl);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C9248f mo41789h(C9248f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C9248f mo41790i(C9248f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract String mo41791j();

    /* renamed from: k */
    public void mo41792k(Timer timer) {
        if (!mo41753f().mo37413S0() && !mo41753f().mo37411N0()) {
            timer.schedule(this, 225, 225);
        }
    }

    public void run() {
        try {
            if (!mo41753f().mo37413S0()) {
                if (!mo41753f().mo37411N0()) {
                    int i = this.f19366b;
                    this.f19366b = i + 1;
                    if (i < 3) {
                        if (f19365c.isLoggable(Level.FINER)) {
                            Logger logger = f19365c;
                            logger.finer(mo41754g() + ".run() JmDNS " + mo41791j());
                        }
                        C9248f i2 = mo41790i(new C9248f(0));
                        if (mo41753f().mo37408L0()) {
                            i2 = mo41789h(i2);
                        }
                        if (!i2.mo37630l()) {
                            mo41753f().mo37449q1(i2);
                            return;
                        }
                        return;
                    }
                }
            }
            cancel();
        } catch (Throwable th) {
            Logger logger2 = f19365c;
            Level level = Level.WARNING;
            logger2.log(level, mo41754g() + ".run() exception ", th);
            mo41753f().mo37426g1();
        }
    }

    public String toString() {
        return super.toString() + " count: " + this.f19366b;
    }
}
