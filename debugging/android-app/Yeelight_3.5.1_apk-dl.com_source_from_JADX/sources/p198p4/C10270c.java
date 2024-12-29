package p198p4;

import java.util.HashSet;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.C9241c;
import javax.jmdns.impl.C9248f;
import javax.jmdns.impl.C9250g;
import javax.jmdns.impl.C9259h;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.constants.C9245a;

/* renamed from: p4.c */
public class C10270c extends C10268a {

    /* renamed from: d */
    static Logger f19337d = Logger.getLogger(C10270c.class.getName());

    /* renamed from: b */
    private final C9241c f19338b;

    /* renamed from: c */
    private final boolean f19339c;

    public C10270c(JmDNSImpl jmDNSImpl, C9241c cVar, int i) {
        super(jmDNSImpl);
        this.f19338b = cVar;
        this.f19339c = i != C9245a.f17144a;
    }

    /* renamed from: g */
    public String mo41754g() {
        StringBuilder sb = new StringBuilder();
        sb.append("Responder(");
        sb.append(mo41753f() != null ? mo41753f().mo37444o0() : "");
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: h */
    public void mo41758h(Timer timer) {
        boolean z = true;
        for (C9250g gVar : this.f19338b.mo37629k()) {
            if (f19337d.isLoggable(Level.FINEST)) {
                Logger logger = f19337d;
                logger.finest(mo41754g() + "start() question=" + gVar);
            }
            z = gVar.mo37659z(mo41753f());
            if (!z) {
                break;
            }
        }
        int i = 0;
        int nextInt = (!z || this.f19338b.mo37633o()) ? (JmDNSImpl.m22322p0().nextInt(96) + 20) - this.f19338b.mo37581w() : 0;
        if (nextInt >= 0) {
            i = nextInt;
        }
        if (f19337d.isLoggable(Level.FINEST)) {
            Logger logger2 = f19337d;
            logger2.finest(mo41754g() + "start() Responder chosen delay=" + i);
        }
        if (!mo41753f().mo37413S0() && !mo41753f().mo37411N0()) {
            timer.schedule(this, (long) i);
        }
    }

    public void run() {
        mo41753f().mo37445o1(this.f19338b);
        HashSet<C9250g> hashSet = new HashSet<>();
        HashSet<C9259h> hashSet2 = new HashSet<>();
        if (mo41753f().mo37408L0()) {
            try {
                for (C9250g gVar : this.f19338b.mo37629k()) {
                    if (f19337d.isLoggable(Level.FINER)) {
                        Logger logger = f19337d;
                        logger.finer(mo41754g() + "run() JmDNS responding to: " + gVar);
                    }
                    if (this.f19339c) {
                        hashSet.add(gVar);
                    }
                    gVar.mo37656w(mo41753f(), hashSet2);
                }
                long currentTimeMillis = System.currentTimeMillis();
                for (C9259h hVar : this.f19338b.mo37621c()) {
                    if (hVar.mo37666G(currentTimeMillis)) {
                        hashSet2.remove(hVar);
                        if (f19337d.isLoggable(Level.FINER)) {
                            Logger logger2 = f19337d;
                            logger2.finer(mo41754g() + "JmDNS Responder Known Answer Removed");
                        }
                    }
                }
                if (!hashSet2.isEmpty()) {
                    if (f19337d.isLoggable(Level.FINER)) {
                        Logger logger3 = f19337d;
                        logger3.finer(mo41754g() + "run() JmDNS responding");
                    }
                    C9248f fVar = new C9248f(33792, !this.f19339c, this.f19338b.mo37582x());
                    fVar.mo37637s(this.f19338b.mo37624f());
                    for (C9250g gVar2 : hashSet) {
                        if (gVar2 != null) {
                            fVar = mo41752e(fVar, gVar2);
                        }
                    }
                    for (C9259h hVar2 : hashSet2) {
                        if (hVar2 != null) {
                            fVar = mo41749b(fVar, this.f19338b, hVar2);
                        }
                    }
                    if (!fVar.mo37630l()) {
                        mo41753f().mo37449q1(fVar);
                    }
                }
            } catch (Throwable th) {
                Logger logger4 = f19337d;
                Level level = Level.WARNING;
                logger4.log(level, mo41754g() + "run() exception ", th);
                mo41753f().close();
            }
        }
    }

    public String toString() {
        return super.toString() + " incomming: " + this.f19338b;
    }
}
