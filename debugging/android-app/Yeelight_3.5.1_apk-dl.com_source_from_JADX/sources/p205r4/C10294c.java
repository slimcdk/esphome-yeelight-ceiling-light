package p205r4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.C9248f;
import javax.jmdns.impl.DNSStatefulObject;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.ServiceInfoImpl;
import javax.jmdns.impl.constants.DNSState;
import p198p4.C10268a;

/* renamed from: r4.c */
public abstract class C10294c extends C10268a {

    /* renamed from: d */
    static Logger f19375d = Logger.getLogger(C10294c.class.getName());

    /* renamed from: e */
    private static int f19376e = 3600;

    /* renamed from: b */
    private final int f19377b;

    /* renamed from: c */
    private DNSState f19378c = null;

    public C10294c(JmDNSImpl jmDNSImpl, int i) {
        super(jmDNSImpl);
        this.f19377b = i;
    }

    /* renamed from: o */
    public static int m25938o() {
        return f19376e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo41822h(List<DNSStatefulObject> list) {
        if (list != null) {
            for (DNSStatefulObject next : list) {
                synchronized (next) {
                    next.advanceState(this);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo41812i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo41823j(DNSState dNSState) {
        synchronized (mo41753f()) {
            mo41753f().mo37406J(this, dNSState);
        }
        Iterator<ServiceInfo> it = mo41753f().mo37455v0().values().iterator();
        while (it.hasNext()) {
            ((ServiceInfoImpl) it.next()).mo37497M(this, dNSState);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract C9248f mo41813k(C9248f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract C9248f mo41814l(ServiceInfoImpl serviceInfoImpl, C9248f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo41815m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract C9248f mo41816n();

    /* renamed from: q */
    public int mo41824q() {
        return this.f19377b;
    }

    /* renamed from: r */
    public abstract String mo41817r();

    public void run() {
        C9248f n = mo41816n();
        try {
            if (!mo41815m()) {
                cancel();
                return;
            }
            ArrayList arrayList = new ArrayList();
            synchronized (mo41753f()) {
                if (mo41753f().mo37409M0(this, mo41826s())) {
                    Logger logger = f19375d;
                    logger.finer(mo41754g() + ".run() JmDNS " + mo41817r() + " " + mo41753f().mo37444o0());
                    arrayList.add(mo41753f());
                    n = mo41813k(n);
                }
            }
            Iterator<ServiceInfo> it = mo41753f().mo37455v0().values().iterator();
            while (it.hasNext()) {
                ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) it.next();
                synchronized (serviceInfoImpl) {
                    if (serviceInfoImpl.mo37512l0(this, mo41826s())) {
                        Logger logger2 = f19375d;
                        logger2.fine(mo41754g() + ".run() JmDNS " + mo41817r() + " " + serviceInfoImpl.mo37330r());
                        arrayList.add(serviceInfoImpl);
                        n = mo41814l(serviceInfoImpl, n);
                    }
                }
            }
            if (!n.mo37630l()) {
                Logger logger3 = f19375d;
                logger3.finer(mo41754g() + ".run() JmDNS " + mo41817r() + " #" + mo41826s());
                mo41753f().mo37449q1(n);
                mo41822h(arrayList);
                mo41812i();
                return;
            }
            mo41822h(arrayList);
            cancel();
        } catch (Throwable th) {
            Logger logger4 = f19375d;
            Level level = Level.WARNING;
            logger4.log(level, mo41754g() + ".run() exception ", th);
            mo41818t(th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public DNSState mo41826s() {
        return this.f19378c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo41818t(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo41827u() {
        synchronized (mo41753f()) {
            mo41753f().mo37434j1(this);
        }
        Iterator<ServiceInfo> it = mo41753f().mo37455v0().values().iterator();
        while (it.hasNext()) {
            ((ServiceInfoImpl) it.next()).mo37517t0(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo41828v(DNSState dNSState) {
        this.f19378c = dNSState;
    }
}
