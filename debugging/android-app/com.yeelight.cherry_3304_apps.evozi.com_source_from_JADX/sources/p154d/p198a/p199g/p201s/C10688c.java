package p154d.p198a.p199g.p201s;

import java.util.HashSet;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import p154d.p198a.p199g.C10621c;
import p154d.p198a.p199g.C10626f;
import p154d.p198a.p199g.C10628g;
import p154d.p198a.p199g.C10637h;
import p154d.p198a.p199g.C10656l;
import p154d.p198a.p199g.p200r.C10677a;

/* renamed from: d.a.g.s.c */
public class C10688c extends C10686a {

    /* renamed from: d */
    static Logger f20587d = Logger.getLogger(C10688c.class.getName());

    /* renamed from: b */
    private final C10621c f20588b;

    /* renamed from: c */
    private final boolean f20589c;

    public C10688c(C10656l lVar, C10621c cVar, int i) {
        super(lVar);
        this.f20588b = cVar;
        this.f20589c = i != C10677a.f20461a;
    }

    /* renamed from: g */
    public String mo33846g() {
        StringBuilder sb = new StringBuilder();
        sb.append("Responder(");
        sb.append(mo33845f() != null ? mo33845f().mo33731n0() : "");
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: h */
    public void mo33850h(Timer timer) {
        boolean z = true;
        for (C10628g gVar : this.f20588b.mo33570k()) {
            if (f20587d.isLoggable(Level.FINEST)) {
                Logger logger = f20587d;
                logger.finest(mo33846g() + "start() question=" + gVar);
            }
            z = gVar.mo33599z(mo33845f());
            if (!z) {
                break;
            }
        }
        int i = 0;
        int nextInt = (!z || this.f20588b.mo33574o()) ? (C10656l.m26220o0().nextInt(96) + 20) - this.f20588b.mo33550w() : 0;
        if (nextInt >= 0) {
            i = nextInt;
        }
        if (f20587d.isLoggable(Level.FINEST)) {
            Logger logger2 = f20587d;
            logger2.finest(mo33846g() + "start() Responder chosen delay=" + i);
        }
        if (!mo33845f().mo33713Y0() && !mo33845f().mo33709S0()) {
            timer.schedule(this, (long) i);
        }
    }

    public void run() {
        mo33845f().mo33735q1(this.f20588b);
        HashSet<C10628g> hashSet = new HashSet<>();
        HashSet<C10637h> hashSet2 = new HashSet<>();
        if (mo33845f().mo33705J0()) {
            try {
                for (C10628g gVar : this.f20588b.mo33570k()) {
                    if (f20587d.isLoggable(Level.FINER)) {
                        Logger logger = f20587d;
                        logger.finer(mo33846g() + "run() JmDNS responding to: " + gVar);
                    }
                    if (this.f20589c) {
                        hashSet.add(gVar);
                    }
                    gVar.mo33596w(mo33845f(), hashSet2);
                }
                long currentTimeMillis = System.currentTimeMillis();
                for (C10637h hVar : this.f20588b.mo33562c()) {
                    if (hVar.mo33606G(currentTimeMillis)) {
                        hashSet2.remove(hVar);
                        if (f20587d.isLoggable(Level.FINER)) {
                            Logger logger2 = f20587d;
                            logger2.finer(mo33846g() + "JmDNS Responder Known Answer Removed");
                        }
                    }
                }
                if (!hashSet2.isEmpty()) {
                    if (f20587d.isLoggable(Level.FINER)) {
                        Logger logger3 = f20587d;
                        logger3.finer(mo33846g() + "run() JmDNS responding");
                    }
                    C10626f fVar = new C10626f(33792, !this.f20589c, this.f20588b.mo33551x());
                    fVar.mo33578s(this.f20588b.mo33565f());
                    for (C10628g gVar2 : hashSet) {
                        if (gVar2 != null) {
                            fVar = mo33844e(fVar, gVar2);
                        }
                    }
                    for (C10637h hVar2 : hashSet2) {
                        if (hVar2 != null) {
                            fVar = mo33841b(fVar, this.f20588b, hVar2);
                        }
                    }
                    if (!fVar.mo33571l()) {
                        mo33845f().mo33738s1(fVar);
                    }
                }
            } catch (Throwable th) {
                Logger logger4 = f20587d;
                Level level = Level.WARNING;
                logger4.log(level, mo33846g() + "run() exception ", th);
                mo33845f().close();
            }
        }
    }

    public String toString() {
        return super.toString() + " incomming: " + this.f20588b;
    }
}
