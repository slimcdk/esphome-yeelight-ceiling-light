package p154d.p198a.p199g.p201s.p202d;

import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import p154d.p198a.p199g.C10626f;
import p154d.p198a.p199g.C10656l;
import p154d.p198a.p199g.p201s.C10686a;

/* renamed from: d.a.g.s.d.a */
public abstract class C10689a extends C10686a {

    /* renamed from: c */
    private static Logger f20590c = Logger.getLogger(C10689a.class.getName());

    /* renamed from: b */
    protected int f20591b = 0;

    public C10689a(C10656l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C10626f mo33852h(C10626f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C10626f mo33853i(C10626f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract String mo33854j();

    /* renamed from: k */
    public void mo33855k(Timer timer) {
        if (!mo33845f().mo33713Y0() && !mo33845f().mo33709S0()) {
            timer.schedule(this, 225, 225);
        }
    }

    public void run() {
        try {
            if (!mo33845f().mo33713Y0()) {
                if (!mo33845f().mo33709S0()) {
                    int i = this.f20591b;
                    this.f20591b = i + 1;
                    if (i < 3) {
                        if (f20590c.isLoggable(Level.FINER)) {
                            Logger logger = f20590c;
                            logger.finer(mo33846g() + ".run() JmDNS " + mo33854j());
                        }
                        C10626f i2 = mo33853i(new C10626f(0));
                        if (mo33845f().mo33705J0()) {
                            i2 = mo33852h(i2);
                        }
                        if (!i2.mo33571l()) {
                            mo33845f().mo33738s1(i2);
                            return;
                        }
                        return;
                    }
                }
            }
            cancel();
        } catch (Throwable th) {
            Logger logger2 = f20590c;
            Level level = Level.WARNING;
            logger2.log(level, mo33846g() + ".run() exception ", th);
            mo33845f().mo33722i1();
        }
    }

    public String toString() {
        return super.toString() + " count: " + this.f20591b;
    }
}
