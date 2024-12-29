package p154d.p198a.p199g.p201s.p203e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p154d.p198a.C10613d;
import p154d.p198a.p199g.C10626f;
import p154d.p198a.p199g.C10645i;
import p154d.p198a.p199g.C10656l;
import p154d.p198a.p199g.C10673p;
import p154d.p198a.p199g.p200r.C10683g;
import p154d.p198a.p199g.p201s.C10686a;

/* renamed from: d.a.g.s.e.c */
public abstract class C10694c extends C10686a {

    /* renamed from: d */
    static Logger f20594d = Logger.getLogger(C10694c.class.getName());

    /* renamed from: e */
    private static int f20595e = 3600;

    /* renamed from: b */
    private final int f20596b;

    /* renamed from: c */
    private C10683g f20597c = null;

    public C10694c(C10656l lVar, int i) {
        super(lVar);
        this.f20596b = i;
    }

    /* renamed from: o */
    public static int m26433o() {
        return f20595e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo33869h(List<C10645i> list) {
        if (list != null) {
            for (C10645i next : list) {
                synchronized (next) {
                    next.mo33627j(this);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo33859i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo33870j(C10683g gVar) {
        synchronized (mo33845f()) {
            mo33845f().mo33710V(this, gVar);
        }
        Iterator<C10613d> it = mo33845f().mo33743v0().values().iterator();
        while (it.hasNext()) {
            ((C10673p) it.next()).mo33796G(this, gVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract C10626f mo33860k(C10626f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract C10626f mo33861l(C10673p pVar, C10626f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo33862m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract C10626f mo33863n();

    /* renamed from: p */
    public int mo33871p() {
        return this.f20596b;
    }

    /* renamed from: q */
    public abstract String mo33864q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C10683g mo33872r() {
        return this.f20597c;
    }

    public void run() {
        C10626f n = mo33863n();
        try {
            if (!mo33862m()) {
                cancel();
                return;
            }
            ArrayList arrayList = new ArrayList();
            synchronized (mo33845f()) {
                if (mo33845f().mo33706Q0(this, mo33872r())) {
                    Logger logger = f20594d;
                    logger.finer(mo33846g() + ".run() JmDNS " + mo33864q() + " " + mo33845f().mo33731n0());
                    arrayList.add(mo33845f());
                    n = mo33860k(n);
                }
            }
            Iterator<C10613d> it = mo33845f().mo33743v0().values().iterator();
            while (it.hasNext()) {
                C10673p pVar = (C10673p) it.next();
                synchronized (pVar) {
                    if (pVar.mo33815q0(this, mo33872r())) {
                        Logger logger2 = f20594d;
                        logger2.fine(mo33846g() + ".run() JmDNS " + mo33864q() + " " + pVar.mo33479t());
                        arrayList.add(pVar);
                        n = mo33861l(pVar, n);
                    }
                }
            }
            if (!n.mo33571l()) {
                Logger logger3 = f20594d;
                logger3.finer(mo33846g() + ".run() JmDNS " + mo33864q() + " #" + mo33872r());
                mo33845f().mo33738s1(n);
                mo33869h(arrayList);
                mo33859i();
                return;
            }
            mo33869h(arrayList);
            cancel();
        } catch (Throwable th) {
            Logger logger4 = f20594d;
            Level level = Level.WARNING;
            logger4.log(level, mo33846g() + ".run() exception ", th);
            mo33865s(th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo33865s(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo33874t() {
        synchronized (mo33845f()) {
            mo33845f().mo33728l1(this);
        }
        Iterator<C10613d> it = mo33845f().mo33743v0().values().iterator();
        while (it.hasNext()) {
            ((C10673p) it.next()).mo33794E0(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo33875u(C10683g gVar) {
        this.f20597c = gVar;
    }
}
