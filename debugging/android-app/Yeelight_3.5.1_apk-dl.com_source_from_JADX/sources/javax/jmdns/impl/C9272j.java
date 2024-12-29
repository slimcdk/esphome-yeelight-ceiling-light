package javax.jmdns.impl;

import java.util.EventListener;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import javax.jmdns.C9224d;
import javax.jmdns.C9225e;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;

/* renamed from: javax.jmdns.impl.j */
public class C9272j<T extends EventListener> {

    /* renamed from: a */
    private final T f17186a;

    /* renamed from: b */
    private final boolean f17187b;

    /* renamed from: javax.jmdns.impl.j$a */
    public static class C9273a extends C9272j<C9224d> {

        /* renamed from: d */
        private static Logger f17188d = Logger.getLogger(C9273a.class.getName());

        /* renamed from: c */
        private final ConcurrentMap<String, ServiceInfo> f17189c = new ConcurrentHashMap(32);

        public C9273a(C9224d dVar, boolean z) {
            super(dVar, z);
        }

        /* renamed from: c */
        private static final boolean m22663c(ServiceInfo serviceInfo, ServiceInfo serviceInfo2) {
            if (serviceInfo == null || serviceInfo2 == null || !serviceInfo.equals(serviceInfo2)) {
                return false;
            }
            byte[] u = serviceInfo.mo37333u();
            byte[] u2 = serviceInfo2.mo37333u();
            if (u.length != u2.length) {
                return false;
            }
            for (int i = 0; i < u.length; i++) {
                if (u[i] != u2[i]) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo37701d(ServiceEvent serviceEvent) {
            if (this.f17189c.putIfAbsent(serviceEvent.getName() + "." + serviceEvent.getType(), serviceEvent.getInfo().clone()) == null) {
                ((C9224d) mo37696a()).serviceAdded(serviceEvent);
                ServiceInfo info = serviceEvent.getInfo();
                if (info != null && info.mo37336y()) {
                    ((C9224d) mo37696a()).serviceResolved(serviceEvent);
                    return;
                }
                return;
            }
            Logger logger = f17188d;
            logger.finer("Service Added called for a service already added: " + serviceEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo37702e(ServiceEvent serviceEvent) {
            String str = serviceEvent.getName() + "." + serviceEvent.getType();
            ConcurrentMap<String, ServiceInfo> concurrentMap = this.f17189c;
            if (concurrentMap.remove(str, concurrentMap.get(str))) {
                ((C9224d) mo37696a()).serviceRemoved(serviceEvent);
                return;
            }
            f17188d.finer("Service Removed called for a service already removed: " + serviceEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public synchronized void mo37703f(ServiceEvent serviceEvent) {
            C9224d dVar;
            ServiceInfo info = serviceEvent.getInfo();
            if (info == null || !info.mo37336y()) {
                f17188d.warning("Service Resolved called for an unresolved event: " + serviceEvent);
            } else {
                String str = serviceEvent.getName() + "." + serviceEvent.getType();
                ServiceInfo serviceInfo = (ServiceInfo) this.f17189c.get(str);
                if (!m22663c(info, serviceInfo)) {
                    if (serviceInfo == null) {
                        if (this.f17189c.putIfAbsent(str, info.clone()) == null) {
                            dVar = (C9224d) mo37696a();
                        }
                    } else if (this.f17189c.replace(str, serviceInfo, info.clone())) {
                        dVar = (C9224d) mo37696a();
                    }
                    dVar.serviceResolved(serviceEvent);
                } else {
                    f17188d.finer("Service Resolved called for a service already resolved: " + serviceEvent);
                }
            }
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder(2048);
            sb.append("[Status for ");
            sb.append(((C9224d) mo37696a()).toString());
            if (this.f17189c.isEmpty()) {
                str = " no type event ";
            } else {
                sb.append(" (");
                for (String str2 : this.f17189c.keySet()) {
                    sb.append(str2 + ", ");
                }
                str = ") ";
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: javax.jmdns.impl.j$b */
    public static class C9274b extends C9272j<C9225e> {

        /* renamed from: d */
        private static Logger f17190d = Logger.getLogger(C9274b.class.getName());

        /* renamed from: c */
        private final ConcurrentMap<String, String> f17191c;

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo37704c(ServiceEvent serviceEvent) {
            if (this.f17191c.putIfAbsent(serviceEvent.getType(), serviceEvent.getType()) == null) {
                ((C9225e) mo37696a()).mo37347s(serviceEvent);
                return;
            }
            Logger logger = f17190d;
            logger.finest("Service Type Added called for a service type already added: " + serviceEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo37705d(ServiceEvent serviceEvent) {
            if (this.f17191c.putIfAbsent(serviceEvent.getType(), serviceEvent.getType()) == null) {
                ((C9225e) mo37696a()).mo37346c(serviceEvent);
                return;
            }
            Logger logger = f17190d;
            logger.finest("Service Sub Type Added called for a service sub type already added: " + serviceEvent);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder(2048);
            sb.append("[Status for ");
            sb.append(((C9225e) mo37696a()).toString());
            if (this.f17191c.isEmpty()) {
                str = " no type event ";
            } else {
                sb.append(" (");
                for (String str2 : this.f17191c.keySet()) {
                    sb.append(str2 + ", ");
                }
                str = ") ";
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    public C9272j(T t, boolean z) {
        this.f17186a = t;
        this.f17187b = z;
    }

    /* renamed from: a */
    public T mo37696a() {
        return this.f17186a;
    }

    /* renamed from: b */
    public boolean mo37697b() {
        return this.f17187b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9272j) && mo37696a().equals(((C9272j) obj).mo37696a());
    }

    public int hashCode() {
        return mo37696a().hashCode();
    }

    public String toString() {
        return "[Status for " + mo37696a().toString() + "]";
    }
}
