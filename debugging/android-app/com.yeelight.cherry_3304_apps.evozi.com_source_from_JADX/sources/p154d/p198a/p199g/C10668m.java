package p154d.p198a.p199g;

import java.util.EventListener;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import p154d.p198a.C10612c;
import p154d.p198a.C10613d;
import p154d.p198a.C10615e;
import p154d.p198a.C10616f;

/* renamed from: d.a.g.m */
public class C10668m<T extends EventListener> {

    /* renamed from: a */
    private final T f20427a;

    /* renamed from: b */
    private final boolean f20428b;

    /* renamed from: d.a.g.m$a */
    public static class C10669a extends C10668m<C10615e> {

        /* renamed from: d */
        private static Logger f20429d = Logger.getLogger(C10669a.class.getName());

        /* renamed from: c */
        private final ConcurrentMap<String, C10613d> f20430c = new ConcurrentHashMap(32);

        public C10669a(C10615e eVar, boolean z) {
            super(eVar, z);
        }

        /* renamed from: c */
        private static final boolean m26300c(C10613d dVar, C10613d dVar2) {
            if (dVar == null || dVar2 == null || !dVar.equals(dVar2)) {
                return false;
            }
            byte[] w = dVar.mo33482w();
            byte[] w2 = dVar2.mo33482w();
            if (w.length != w2.length) {
                return false;
            }
            for (int i = 0; i < w.length; i++) {
                if (w[i] != w2[i]) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo33781d(C10612c cVar) {
            if (this.f20430c.putIfAbsent(cVar.mo33463d() + "." + cVar.mo33464e(), cVar.mo33461c().clone()) == null) {
                ((C10615e) mo33776a()).serviceAdded(cVar);
                C10613d c = cVar.mo33461c();
                if (c != null && c.mo33485z()) {
                    ((C10615e) mo33776a()).serviceResolved(cVar);
                    return;
                }
                return;
            }
            Logger logger = f20429d;
            logger.finer("Service Added called for a service already added: " + cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo33782e(C10612c cVar) {
            String str = cVar.mo33463d() + "." + cVar.mo33464e();
            ConcurrentMap<String, C10613d> concurrentMap = this.f20430c;
            if (concurrentMap.remove(str, concurrentMap.get(str))) {
                ((C10615e) mo33776a()).serviceRemoved(cVar);
                return;
            }
            f20429d.finer("Service Removed called for a service already removed: " + cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public synchronized void mo33783f(C10612c cVar) {
            C10615e eVar;
            C10613d c = cVar.mo33461c();
            if (c == null || !c.mo33485z()) {
                f20429d.warning("Service Resolved called for an unresolved event: " + cVar);
            } else {
                String str = cVar.mo33463d() + "." + cVar.mo33464e();
                C10613d dVar = (C10613d) this.f20430c.get(str);
                if (!m26300c(c, dVar)) {
                    if (dVar == null) {
                        if (this.f20430c.putIfAbsent(str, c.clone()) == null) {
                            eVar = (C10615e) mo33776a();
                        }
                    } else if (this.f20430c.replace(str, dVar, c.clone())) {
                        eVar = (C10615e) mo33776a();
                    }
                    eVar.serviceResolved(cVar);
                } else {
                    f20429d.finer("Service Resolved called for a service already resolved: " + cVar);
                }
            }
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder(2048);
            sb.append("[Status for ");
            sb.append(((C10615e) mo33776a()).toString());
            if (this.f20430c.isEmpty()) {
                str = " no type event ";
            } else {
                sb.append(" (");
                for (String str2 : this.f20430c.keySet()) {
                    sb.append(str2 + ", ");
                }
                str = ") ";
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: d.a.g.m$b */
    public static class C10670b extends C10668m<C10616f> {

        /* renamed from: d */
        private static Logger f20431d = Logger.getLogger(C10670b.class.getName());

        /* renamed from: c */
        private final ConcurrentMap<String, String> f20432c;

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo33784c(C10612c cVar) {
            if (this.f20432c.putIfAbsent(cVar.mo33464e(), cVar.mo33464e()) == null) {
                ((C10616f) mo33776a()).mo33487v(cVar);
                return;
            }
            Logger logger = f20431d;
            logger.finest("Service Type Added called for a service type already added: " + cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo33785d(C10612c cVar) {
            if (this.f20432c.putIfAbsent(cVar.mo33464e(), cVar.mo33464e()) == null) {
                ((C10616f) mo33776a()).mo33486d(cVar);
                return;
            }
            Logger logger = f20431d;
            logger.finest("Service Sub Type Added called for a service sub type already added: " + cVar);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder(2048);
            sb.append("[Status for ");
            sb.append(((C10616f) mo33776a()).toString());
            if (this.f20432c.isEmpty()) {
                str = " no type event ";
            } else {
                sb.append(" (");
                for (String str2 : this.f20432c.keySet()) {
                    sb.append(str2 + ", ");
                }
                str = ") ";
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    public C10668m(T t, boolean z) {
        this.f20427a = t;
        this.f20428b = z;
    }

    /* renamed from: a */
    public T mo33776a() {
        return this.f20427a;
    }

    /* renamed from: b */
    public boolean mo33777b() {
        return this.f20428b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10668m) && mo33776a().equals(((C10668m) obj).mo33776a());
    }

    public int hashCode() {
        return mo33776a().hashCode();
    }

    public String toString() {
        return "[Status for " + mo33776a().toString() + "]";
    }
}
