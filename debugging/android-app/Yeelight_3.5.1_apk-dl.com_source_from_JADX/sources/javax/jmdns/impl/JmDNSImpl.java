package javax.jmdns.impl;

import java.io.IOException;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.C9218a;
import javax.jmdns.C9224d;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.C9259h;
import javax.jmdns.impl.C9267i;
import javax.jmdns.impl.C9272j;
import javax.jmdns.impl.constants.C9245a;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSState;
import org.apache.commons.p194io.IOUtils;
import p198p4.C10268a;

public class JmDNSImpl extends C9218a implements DNSStatefulObject, C9267i {

    /* renamed from: u */
    private static Logger f17062u = Logger.getLogger(JmDNSImpl.class.getName());

    /* renamed from: v */
    private static final Random f17063v = new Random();

    /* renamed from: a */
    private volatile InetAddress f17064a;

    /* renamed from: b */
    private volatile MulticastSocket f17065b;

    /* renamed from: c */
    private final List<C9246d> f17066c;

    /* renamed from: d */
    private final ConcurrentMap<String, List<C9272j.C9273a>> f17067d;

    /* renamed from: e */
    private final Set<C9272j.C9274b> f17068e;

    /* renamed from: f */
    private final C9237a f17069f;

    /* renamed from: g */
    private final ConcurrentMap<String, ServiceInfo> f17070g;

    /* renamed from: h */
    private final ConcurrentMap<String, ServiceTypeEntry> f17071h;

    /* renamed from: i */
    private volatile C9218a.C9219a f17072i;

    /* renamed from: j */
    protected Thread f17073j;

    /* renamed from: k */
    private HostInfo f17074k;

    /* renamed from: l */
    private Thread f17075l;

    /* renamed from: m */
    private int f17076m;

    /* renamed from: n */
    private long f17077n;

    /* renamed from: o */
    private final ExecutorService f17078o = Executors.newSingleThreadExecutor();

    /* renamed from: p */
    private final ReentrantLock f17079p = new ReentrantLock();

    /* renamed from: q */
    private C9241c f17080q;

    /* renamed from: r */
    private final ConcurrentMap<String, C9235h> f17081r;

    /* renamed from: s */
    private final String f17082s;

    /* renamed from: t */
    private final Object f17083t = new Object();

    public enum Operation {
        Remove,
        Update,
        Add,
        RegisterServiceType,
        Noop
    }

    public static class ServiceTypeEntry extends AbstractMap<String, String> implements Cloneable {

        /* renamed from: a */
        private final Set<Map.Entry<String, String>> f17084a = new HashSet();

        /* renamed from: b */
        private final String f17085b;

        private static class SubTypeEntry implements Map.Entry<String, String>, Serializable, Cloneable {
            private static final long serialVersionUID = 9188503522395855322L;
            private final String _key;
            private final String _value;

            public SubTypeEntry(String str) {
                str = str == null ? "" : str;
                this._value = str;
                this._key = str.toLowerCase();
            }

            public SubTypeEntry clone() {
                return this;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return getKey().equals(entry.getKey()) && getValue().equals(entry.getValue());
            }

            public String getKey() {
                return this._key;
            }

            public String getValue() {
                return this._value;
            }

            public int hashCode() {
                String str = this._key;
                int i = 0;
                int hashCode = str == null ? 0 : str.hashCode();
                String str2 = this._value;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode ^ i;
            }

            public String setValue(String str) {
                throw new UnsupportedOperationException();
            }

            public String toString() {
                return this._key + "=" + this._value;
            }
        }

        public ServiceTypeEntry(String str) {
            this.f17085b = str;
        }

        /* renamed from: a */
        public boolean mo37463a(String str) {
            if (str == null || mo37465c(str)) {
                return false;
            }
            this.f17084a.add(new SubTypeEntry(str));
            return true;
        }

        /* renamed from: b */
        public ServiceTypeEntry clone() {
            ServiceTypeEntry serviceTypeEntry = new ServiceTypeEntry(mo37467d());
            for (Map.Entry<String, String> value : entrySet()) {
                serviceTypeEntry.mo37463a((String) value.getValue());
            }
            return serviceTypeEntry;
        }

        /* renamed from: c */
        public boolean mo37465c(String str) {
            return str != null && containsKey(str.toLowerCase());
        }

        /* renamed from: d */
        public String mo37467d() {
            return this.f17085b;
        }

        public Set<Map.Entry<String, String>> entrySet() {
            return this.f17084a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(200);
            if (isEmpty()) {
                sb.append("empty");
            } else {
                for (String append : values()) {
                    sb.append(append);
                    sb.append(", ");
                }
                sb.setLength(sb.length() - 2);
            }
            return sb.toString();
        }
    }

    /* renamed from: javax.jmdns.impl.JmDNSImpl$a */
    class C9228a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9272j.C9273a f17086a;

        /* renamed from: b */
        final /* synthetic */ ServiceEvent f17087b;

        C9228a(JmDNSImpl jmDNSImpl, C9272j.C9273a aVar, ServiceEvent serviceEvent) {
            this.f17086a = aVar;
            this.f17087b = serviceEvent;
        }

        public void run() {
            this.f17086a.mo37703f(this.f17087b);
        }
    }

    /* renamed from: javax.jmdns.impl.JmDNSImpl$b */
    class C9229b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9272j.C9274b f17088a;

        /* renamed from: b */
        final /* synthetic */ ServiceEvent f17089b;

        C9229b(JmDNSImpl jmDNSImpl, C9272j.C9274b bVar, ServiceEvent serviceEvent) {
            this.f17088a = bVar;
            this.f17089b = serviceEvent;
        }

        public void run() {
            this.f17088a.mo37704c(this.f17089b);
        }
    }

    /* renamed from: javax.jmdns.impl.JmDNSImpl$c */
    class C9230c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9272j.C9274b f17090a;

        /* renamed from: b */
        final /* synthetic */ ServiceEvent f17091b;

        C9230c(JmDNSImpl jmDNSImpl, C9272j.C9274b bVar, ServiceEvent serviceEvent) {
            this.f17090a = bVar;
            this.f17091b = serviceEvent;
        }

        public void run() {
            this.f17090a.mo37705d(this.f17091b);
        }
    }

    /* renamed from: javax.jmdns.impl.JmDNSImpl$d */
    class C9231d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9272j.C9273a f17092a;

        /* renamed from: b */
        final /* synthetic */ ServiceEvent f17093b;

        C9231d(JmDNSImpl jmDNSImpl, C9272j.C9273a aVar, ServiceEvent serviceEvent) {
            this.f17092a = aVar;
            this.f17093b = serviceEvent;
        }

        public void run() {
            this.f17092a.mo37701d(this.f17093b);
        }
    }

    /* renamed from: javax.jmdns.impl.JmDNSImpl$e */
    class C9232e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9272j.C9273a f17094a;

        /* renamed from: b */
        final /* synthetic */ ServiceEvent f17095b;

        C9232e(JmDNSImpl jmDNSImpl, C9272j.C9273a aVar, ServiceEvent serviceEvent) {
            this.f17094a = aVar;
            this.f17095b = serviceEvent;
        }

        public void run() {
            this.f17094a.mo37702e(this.f17095b);
        }
    }

    /* renamed from: javax.jmdns.impl.JmDNSImpl$f */
    class C9233f extends Thread {
        C9233f(String str) {
            super(str);
        }

        public void run() {
            JmDNSImpl.this.mo37403G();
        }
    }

    /* renamed from: javax.jmdns.impl.JmDNSImpl$g */
    static /* synthetic */ class C9234g {

        /* renamed from: a */
        static final /* synthetic */ int[] f17097a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                javax.jmdns.impl.JmDNSImpl$Operation[] r0 = javax.jmdns.impl.JmDNSImpl.Operation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17097a = r0
                javax.jmdns.impl.JmDNSImpl$Operation r1 = javax.jmdns.impl.JmDNSImpl.Operation.Add     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17097a     // Catch:{ NoSuchFieldError -> 0x001d }
                javax.jmdns.impl.JmDNSImpl$Operation r1 = javax.jmdns.impl.JmDNSImpl.Operation.Remove     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.JmDNSImpl.C9234g.<clinit>():void");
        }
    }

    /* renamed from: javax.jmdns.impl.JmDNSImpl$h */
    private static class C9235h implements C9224d {

        /* renamed from: a */
        private final ConcurrentMap<String, ServiceInfo> f17098a = new ConcurrentHashMap();

        /* renamed from: b */
        private final ConcurrentMap<String, ServiceEvent> f17099b = new ConcurrentHashMap();

        /* renamed from: c */
        private final String f17100c;

        public C9235h(String str) {
            this.f17100c = str;
        }

        public void serviceAdded(ServiceEvent serviceEvent) {
            ConcurrentMap<String, ServiceInfo> concurrentMap;
            String name;
            synchronized (this) {
                ServiceInfo info = serviceEvent.getInfo();
                if (info == null || !info.mo37336y()) {
                    info = ((JmDNSImpl) serviceEvent.getDNS()).mo37443n1(serviceEvent.getType(), serviceEvent.getName(), info != null ? info.mo37332t() : "", true);
                    if (info != null) {
                        concurrentMap = this.f17098a;
                        name = serviceEvent.getName();
                    } else {
                        this.f17099b.put(serviceEvent.getName(), serviceEvent);
                    }
                } else {
                    concurrentMap = this.f17098a;
                    name = serviceEvent.getName();
                }
                concurrentMap.put(name, info);
            }
        }

        public void serviceRemoved(ServiceEvent serviceEvent) {
            synchronized (this) {
                this.f17098a.remove(serviceEvent.getName());
                this.f17099b.remove(serviceEvent.getName());
            }
        }

        public void serviceResolved(ServiceEvent serviceEvent) {
            synchronized (this) {
                this.f17098a.put(serviceEvent.getName(), serviceEvent.getInfo());
                this.f17099b.remove(serviceEvent.getName());
            }
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\n\tType: ");
            stringBuffer.append(this.f17100c);
            if (this.f17098a.isEmpty()) {
                stringBuffer.append("\n\tNo services collected.");
            } else {
                stringBuffer.append("\n\tServices");
                for (String str : this.f17098a.keySet()) {
                    stringBuffer.append("\n\t\tService: ");
                    stringBuffer.append(str);
                    stringBuffer.append(": ");
                    stringBuffer.append(this.f17098a.get(str));
                }
            }
            if (this.f17099b.isEmpty()) {
                stringBuffer.append("\n\tNo event queued.");
            } else {
                stringBuffer.append("\n\tEvents");
                for (String str2 : this.f17099b.keySet()) {
                    stringBuffer.append("\n\t\tEvent: ");
                    stringBuffer.append(str2);
                    stringBuffer.append(": ");
                    stringBuffer.append(this.f17099b.get(str2));
                }
            }
            return stringBuffer.toString();
        }
    }

    public JmDNSImpl(InetAddress inetAddress, String str) {
        if (f17062u.isLoggable(Level.FINER)) {
            f17062u.finer("JmDNS instance created");
        }
        this.f17069f = new C9237a(100);
        this.f17066c = Collections.synchronizedList(new ArrayList());
        this.f17067d = new ConcurrentHashMap();
        this.f17068e = Collections.synchronizedSet(new HashSet());
        this.f17081r = new ConcurrentHashMap();
        this.f17070g = new ConcurrentHashMap(20);
        this.f17071h = new ConcurrentHashMap(20);
        HostInfo z = HostInfo.m22290z(inetAddress, this, str);
        this.f17074k = z;
        this.f17082s = str == null ? z.mo37390p() : str;
        m22321b1(mo37436k0());
        m22323t1(mo37455v0().values());
        mo37435k();
    }

    /* renamed from: I */
    private void m22317I(String str, C9224d dVar, boolean z) {
        C9272j.C9273a aVar = new C9272j.C9273a(dVar, z);
        String lowerCase = str.toLowerCase();
        List list = (List) this.f17067d.get(lowerCase);
        if (list == null) {
            if (this.f17067d.putIfAbsent(lowerCase, new LinkedList()) == null && this.f17081r.putIfAbsent(lowerCase, new C9235h(str)) == null) {
                m22317I(lowerCase, (C9224d) this.f17081r.get(lowerCase), true);
            }
            list = (List) this.f17067d.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                if (!list.contains(dVar)) {
                    list.add(aVar);
                }
            }
        }
        ArrayList<ServiceEvent> arrayList = new ArrayList<>();
        Iterator<C9240b> it = mo37419c0().mo37520c().iterator();
        while (it.hasNext()) {
            C9259h hVar = (C9259h) it.next();
            if (hVar.mo37558f() == DNSRecordType.TYPE_SRV && hVar.mo37553b().endsWith(lowerCase)) {
                arrayList.add(new ServiceEventImpl(this, hVar.mo37560h(), m22324u1(hVar.mo37560h(), hVar.mo37554c()), hVar.mo37660A()));
            }
        }
        for (ServiceEvent d : arrayList) {
            aVar.mo37701d(d);
        }
        mo37421d(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:5|6|7|9|10|(2:11|(1:32)(2:2f|28))|32|34|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        f17062u.log(java.util.logging.Level.WARNING, "closeMulticastSocket() Close socket exception ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f A[Catch:{ Exception -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0057 A[Catch:{ Exception -> 0x001e }, EDGE_INSN: B:35:0x0057->B:32:0x0057 ?: BREAK  
    EDGE_INSN: B:36:0x0057->B:32:0x0057 ?: BREAK  ] */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22318T() {
        /*
            r5 = this;
            java.util.logging.Logger r0 = f17062u
            java.util.logging.Level r1 = java.util.logging.Level.FINER
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L_0x0011
            java.util.logging.Logger r0 = f17062u
            java.lang.String r1 = "closeMulticastSocket()"
            r0.finer(r1)
        L_0x0011:
            java.net.MulticastSocket r0 = r5.f17065b
            if (r0 == 0) goto L_0x0065
            r0 = 0
            java.net.MulticastSocket r1 = r5.f17065b     // Catch:{ SocketException -> 0x0020 }
            java.net.InetAddress r2 = r5.f17064a     // Catch:{ SocketException -> 0x0020 }
            r1.leaveGroup(r2)     // Catch:{ SocketException -> 0x0020 }
            goto L_0x0020
        L_0x001e:
            r1 = move-exception
            goto L_0x005a
        L_0x0020:
            java.net.MulticastSocket r1 = r5.f17065b     // Catch:{ Exception -> 0x001e }
            r1.close()     // Catch:{ Exception -> 0x001e }
        L_0x0025:
            java.lang.Thread r1 = r5.f17075l     // Catch:{ Exception -> 0x001e }
            if (r1 == 0) goto L_0x0057
            boolean r1 = r1.isAlive()     // Catch:{ Exception -> 0x001e }
            if (r1 == 0) goto L_0x0057
            monitor-enter(r5)     // Catch:{ Exception -> 0x001e }
            java.lang.Thread r1 = r5.f17075l     // Catch:{ InterruptedException -> 0x0053 }
            if (r1 == 0) goto L_0x0053
            boolean r1 = r1.isAlive()     // Catch:{ InterruptedException -> 0x0053 }
            if (r1 == 0) goto L_0x0053
            java.util.logging.Logger r1 = f17062u     // Catch:{ InterruptedException -> 0x0053 }
            java.util.logging.Level r2 = java.util.logging.Level.FINER     // Catch:{ InterruptedException -> 0x0053 }
            boolean r1 = r1.isLoggable(r2)     // Catch:{ InterruptedException -> 0x0053 }
            if (r1 == 0) goto L_0x004b
            java.util.logging.Logger r1 = f17062u     // Catch:{ InterruptedException -> 0x0053 }
            java.lang.String r2 = "closeMulticastSocket(): waiting for jmDNS monitor"
            r1.finer(r2)     // Catch:{ InterruptedException -> 0x0053 }
        L_0x004b:
            r1 = 1000(0x3e8, double:4.94E-321)
            r5.wait(r1)     // Catch:{ InterruptedException -> 0x0053 }
            goto L_0x0053
        L_0x0051:
            r1 = move-exception
            goto L_0x0055
        L_0x0053:
            monitor-exit(r5)     // Catch:{ all -> 0x0051 }
            goto L_0x0025
        L_0x0055:
            monitor-exit(r5)     // Catch:{ all -> 0x0051 }
            throw r1     // Catch:{ Exception -> 0x001e }
        L_0x0057:
            r5.f17075l = r0     // Catch:{ Exception -> 0x001e }
            goto L_0x0063
        L_0x005a:
            java.util.logging.Logger r2 = f17062u
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r4 = "closeMulticastSocket() Close socket exception "
            r2.log(r3, r4, r1)
        L_0x0063:
            r5.f17065b = r0
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.JmDNSImpl.m22318T():void");
    }

    /* renamed from: W */
    private void m22319W() {
        if (f17062u.isLoggable(Level.FINER)) {
            f17062u.finer("disposeServiceCollectors()");
        }
        for (String str : this.f17081r.keySet()) {
            C9235h hVar = (C9235h) this.f17081r.get(str);
            if (hVar != null) {
                mo37337A(str, hVar);
                this.f17081r.remove(str, hVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (f17062u.isLoggable(java.util.logging.Level.FINER) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r3 = f17062u;
        r3.finer("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:" + r5 + " s.server=" + r7.mo37684R() + " " + r10.f17074k.mo37390p() + " equals:" + r7.mo37684R().equals(r10.f17074k.mo37390p()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a5, code lost:
        r11.mo37492G0(mo37402E0(r11.mo37324i()));
        r3 = true;
     */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22320Z0(javax.jmdns.impl.ServiceInfoImpl r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.mo37323h()
            long r1 = java.lang.System.currentTimeMillis()
        L_0x0008:
            r3 = 0
            javax.jmdns.impl.a r4 = r10.mo37419c0()
            java.lang.String r5 = r11.mo37323h()
            java.util.Collection r4 = r4.mo37525f(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0019:
            boolean r5 = r4.hasNext()
            r6 = 1
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r4.next()
            javax.jmdns.impl.b r5 = (javax.jmdns.impl.C9240b) r5
            javax.jmdns.impl.constants.DNSRecordType r7 = javax.jmdns.impl.constants.DNSRecordType.TYPE_SRV
            javax.jmdns.impl.constants.DNSRecordType r8 = r5.mo37558f()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0019
            boolean r7 = r5.mo37563j(r1)
            if (r7 != 0) goto L_0x0019
            r7 = r5
            javax.jmdns.impl.h$f r7 = (javax.jmdns.impl.C9259h.C9265f) r7
            int r8 = r7.mo37682P()
            int r9 = r11.mo37325j()
            if (r8 != r9) goto L_0x0055
            java.lang.String r8 = r7.mo37684R()
            javax.jmdns.impl.HostInfo r9 = r10.f17074k
            java.lang.String r9 = r9.mo37390p()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0019
        L_0x0055:
            java.util.logging.Logger r3 = f17062u
            java.util.logging.Level r4 = java.util.logging.Level.FINER
            boolean r3 = r3.isLoggable(r4)
            if (r3 == 0) goto L_0x00a5
            java.util.logging.Logger r3 = f17062u
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:"
            r4.append(r8)
            r4.append(r5)
            java.lang.String r5 = " s.server="
            r4.append(r5)
            java.lang.String r5 = r7.mo37684R()
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            javax.jmdns.impl.HostInfo r5 = r10.f17074k
            java.lang.String r5 = r5.mo37390p()
            r4.append(r5)
            java.lang.String r5 = " equals:"
            r4.append(r5)
            java.lang.String r5 = r7.mo37684R()
            javax.jmdns.impl.HostInfo r7 = r10.f17074k
            java.lang.String r7 = r7.mo37390p()
            boolean r5 = r5.equals(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.finer(r4)
        L_0x00a5:
            java.lang.String r3 = r11.mo37324i()
            java.lang.String r3 = r10.mo37402E0(r3)
            r11.mo37492G0(r3)
            r3 = 1
        L_0x00b1:
            java.util.concurrent.ConcurrentMap<java.lang.String, javax.jmdns.ServiceInfo> r4 = r10.f17070g
            java.lang.String r5 = r11.mo37323h()
            java.lang.Object r4 = r4.get(r5)
            javax.jmdns.ServiceInfo r4 = (javax.jmdns.ServiceInfo) r4
            if (r4 == 0) goto L_0x00cd
            if (r4 == r11) goto L_0x00cd
            java.lang.String r3 = r11.mo37324i()
            java.lang.String r3 = r10.mo37402E0(r3)
            r11.mo37492G0(r3)
            r3 = 1
        L_0x00cd:
            if (r3 != 0) goto L_0x0008
            java.lang.String r11 = r11.mo37323h()
            boolean r11 = r0.equals(r11)
            r11 = r11 ^ r6
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.JmDNSImpl.m22320Z0(javax.jmdns.impl.ServiceInfoImpl):boolean");
    }

    /* renamed from: b1 */
    private void m22321b1(HostInfo hostInfo) {
        if (this.f17064a == null) {
            this.f17064a = InetAddress.getByName(hostInfo.mo37388n() instanceof Inet6Address ? "FF02::FB" : "224.0.0.251");
        }
        if (this.f17065b != null) {
            m22318T();
        }
        this.f17065b = new MulticastSocket(C9245a.f17144a);
        if (!(hostInfo == null || hostInfo.mo37389o() == null)) {
            try {
                this.f17065b.setNetworkInterface(hostInfo.mo37389o());
            } catch (SocketException e) {
                if (f17062u.isLoggable(Level.FINE)) {
                    Logger logger = f17062u;
                    logger.fine("openMulticastSocket() Set network interface exception: " + e.getMessage());
                }
            }
        }
        this.f17065b.setTimeToLive(255);
        this.f17065b.joinGroup(this.f17064a);
    }

    /* renamed from: p0 */
    public static Random m22322p0() {
        return f17063v;
    }

    /* renamed from: t1 */
    private void m22323t1(Collection<? extends ServiceInfo> collection) {
        if (this.f17075l == null) {
            C9276l lVar = new C9276l(this);
            this.f17075l = lVar;
            lVar.start();
        }
        mo37438l();
        for (ServiceInfo serviceInfoImpl : collection) {
            try {
                mo37342z(new ServiceInfoImpl(serviceInfoImpl));
            } catch (Exception e) {
                f17062u.log(Level.WARNING, "start() Registration exception ", e);
            }
        }
    }

    /* renamed from: u1 */
    static String m22324u1(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    /* renamed from: y1 */
    private void m22325y1(ServiceInfo serviceInfo, long j) {
        synchronized (serviceInfo) {
            long j2 = j / 200;
            if (j2 < 1) {
                j2 = 1;
            }
            for (int i = 0; ((long) i) < j2 && !serviceInfo.mo37336y(); i++) {
                try {
                    serviceInfo.wait(200);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: A */
    public void mo37337A(String str, C9224d dVar) {
        String lowerCase = str.toLowerCase();
        List list = (List) this.f17067d.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                list.remove(new C9272j.C9273a(dVar, false));
                if (list.isEmpty()) {
                    this.f17067d.remove(lowerCase, list);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo37400A0(C9241c cVar) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        boolean z2 = false;
        for (C9259h hVar : cVar.mo37620b()) {
            mo37462z0(hVar, currentTimeMillis);
            if (DNSRecordType.TYPE_A.equals(hVar.mo37558f()) || DNSRecordType.TYPE_AAAA.equals(hVar.mo37558f())) {
                z |= hVar.mo37664E(this);
            } else {
                z2 |= hVar.mo37664E(this);
            }
        }
        if (z || z2) {
            mo37438l();
        }
    }

    /* renamed from: B */
    public void mo37338B(String str, String str2) {
        mo37441m1(str, str2, false, 6000);
    }

    /* renamed from: D */
    public void mo37339D() {
        if (f17062u.isLoggable(Level.FINER)) {
            f17062u.finer("unregisterAllServices()");
        }
        for (String str : this.f17070g.keySet()) {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) this.f17070g.get(str);
            if (serviceInfoImpl != null) {
                if (f17062u.isLoggable(Level.FINER)) {
                    Logger logger = f17062u;
                    logger.finer("Cancelling service info: " + serviceInfoImpl);
                }
                serviceInfoImpl.mo37498O();
            }
        }
        mo37430i();
        for (String str2 : this.f17070g.keySet()) {
            ServiceInfoImpl serviceInfoImpl2 = (ServiceInfoImpl) this.f17070g.get(str2);
            if (serviceInfoImpl2 != null) {
                if (f17062u.isLoggable(Level.FINER)) {
                    Logger logger2 = f17062u;
                    logger2.finer("Wait for service info cancel: " + serviceInfoImpl2);
                }
                serviceInfoImpl2.mo37500Q0(5000);
                this.f17070g.remove(str2, serviceInfoImpl2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo37401D0(ServiceEvent serviceEvent) {
        ArrayList<C9272j.C9273a> arrayList;
        List list = (List) this.f17067d.get(serviceEvent.getType().toLowerCase());
        if (list != null && !list.isEmpty() && serviceEvent.getInfo() != null && serviceEvent.getInfo().mo37336y()) {
            synchronized (list) {
                arrayList = new ArrayList<>(list);
            }
            for (C9272j.C9273a aVar : arrayList) {
                this.f17078o.submit(new C9228a(this, aVar, serviceEvent));
            }
        }
    }

    /* renamed from: E */
    public void mo37340E(ServiceInfo serviceInfo) {
        ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) this.f17070g.get(serviceInfo.mo37323h());
        if (serviceInfoImpl != null) {
            serviceInfoImpl.mo37498O();
            mo37430i();
            serviceInfoImpl.mo37500Q0(5000);
            this.f17070g.remove(serviceInfoImpl.mo37323h(), serviceInfoImpl);
            if (f17062u.isLoggable(Level.FINE)) {
                Logger logger = f17062u;
                logger.fine("unregisterService() JmDNS unregistered service as " + serviceInfoImpl);
                return;
            }
            return;
        }
        Logger logger2 = f17062u;
        logger2.warning("Removing unregistered service info: " + serviceInfo.mo37323h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public String mo37402E0(String str) {
        try {
            int lastIndexOf = str.lastIndexOf(40);
            int lastIndexOf2 = str.lastIndexOf(41);
            if (lastIndexOf < 0 || lastIndexOf >= lastIndexOf2) {
                return str + " (2)";
            }
            return str.substring(0, lastIndexOf) + "(" + (Integer.parseInt(str.substring(lastIndexOf + 1, lastIndexOf2)) + 1) + ")";
        } catch (NumberFormatException unused) {
            return str + " (2)";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo37403G() {
        Logger logger = f17062u;
        Level level = Level.FINER;
        if (logger.isLoggable(level)) {
            Logger logger2 = f17062u;
            logger2.finer(mo37444o0() + "recover() Cleanning up");
        }
        f17062u.warning("RECOVERING");
        mo37417a();
        ArrayList<ServiceInfo> arrayList = new ArrayList<>(mo37455v0().values());
        mo37339D();
        m22319W();
        mo37460x1(5000);
        mo37442n();
        m22318T();
        mo37419c0().clear();
        if (f17062u.isLoggable(level)) {
            Logger logger3 = f17062u;
            logger3.finer(mo37444o0() + "recover() All is clean");
        }
        if (mo37411N0()) {
            for (ServiceInfo serviceInfo : arrayList) {
                ((ServiceInfoImpl) serviceInfo).mo37516s0();
            }
            mo37429h1();
            try {
                m22321b1(mo37436k0());
                m22323t1(arrayList);
            } catch (Exception e) {
                Logger logger4 = f17062u;
                Level level2 = Level.WARNING;
                logger4.log(level2, mo37444o0() + "recover() Start services exception ", e);
            }
            Logger logger5 = f17062u;
            Level level3 = Level.WARNING;
            logger5.log(level3, mo37444o0() + "recover() We are back!");
            return;
        }
        Logger logger6 = f17062u;
        Level level4 = Level.WARNING;
        logger6.log(level4, mo37444o0() + "recover() Could not recover we are Down!");
        if (mo37422d0() != null) {
            mo37422d0().mo37343a(mo37424f0(), arrayList);
        }
    }

    /* renamed from: H */
    public void mo37404H(C9246d dVar, C9250g gVar) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f17066c.add(dVar);
        if (gVar != null) {
            for (C9240b bVar : mo37419c0().mo37525f(gVar.mo37554c().toLowerCase())) {
                if (gVar.mo37658y(bVar) && !bVar.mo37563j(currentTimeMillis)) {
                    dVar.mo37505a(mo37419c0(), currentTimeMillis, bVar);
                }
            }
        }
    }

    /* renamed from: H0 */
    public void mo37405H0() {
        this.f17079p.lock();
    }

    /* renamed from: J */
    public void mo37406J(C10268a aVar, DNSState dNSState) {
        this.f17074k.mo37380b(aVar, dNSState);
    }

    /* renamed from: J0 */
    public void mo37407J0() {
        this.f17079p.unlock();
    }

    /* renamed from: L0 */
    public boolean mo37408L0() {
        return this.f17074k.mo37392r();
    }

    /* renamed from: M0 */
    public boolean mo37409M0(C10268a aVar, DNSState dNSState) {
        return this.f17074k.mo37393s(aVar, dNSState);
    }

    /* renamed from: N */
    public boolean mo37410N() {
        return this.f17074k.mo37381c();
    }

    /* renamed from: N0 */
    public boolean mo37411N0() {
        return this.f17074k.mo37394t();
    }

    /* renamed from: P */
    public void mo37412P() {
        long currentTimeMillis = System.currentTimeMillis();
        for (C9240b next : mo37419c0().mo37520c()) {
            try {
                C9259h hVar = (C9259h) next;
                if (hVar.mo37563j(currentTimeMillis)) {
                    mo37456v1(currentTimeMillis, hVar, Operation.Remove);
                    mo37419c0().mo37529j(hVar);
                } else if (hVar.mo37666G(currentTimeMillis)) {
                    mo37439l1(hVar);
                }
            } catch (Exception e) {
                Logger logger = f17062u;
                Level level = Level.SEVERE;
                logger.log(level, mo37444o0() + ".Error while reaping records: " + next, e);
                f17062u.severe(toString());
            }
        }
    }

    /* renamed from: S0 */
    public boolean mo37413S0() {
        return this.f17074k.mo37396u();
    }

    /* renamed from: U0 */
    public boolean mo37414U0() {
        return this.f17074k.mo37398w();
    }

    /* renamed from: V */
    public boolean mo37415V() {
        return this.f17074k.mo37382d();
    }

    /* renamed from: V0 */
    public boolean mo37416V0() {
        return this.f17074k.mo37399x();
    }

    /* renamed from: a */
    public void mo37417a() {
        C9267i.C9270b.m22657a().mo37694b(mo37424f0()).mo37417a();
    }

    public boolean advanceState(C10268a aVar) {
        return this.f17074k.advanceState(aVar);
    }

    /* renamed from: c */
    public void mo37418c() {
        C9267i.C9270b.m22657a().mo37694b(mo37424f0()).mo37418c();
    }

    /* renamed from: c0 */
    public C9237a mo37419c0() {
        return this.f17069f;
    }

    public void close() {
        if (!mo37414U0()) {
            Logger logger = f17062u;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                Logger logger2 = f17062u;
                logger2.finer("Cancelling JmDNS: " + this);
            }
            if (mo37415V()) {
                f17062u.finer("Canceling the timer");
                mo37427h();
                mo37339D();
                m22319W();
                if (f17062u.isLoggable(level)) {
                    Logger logger3 = f17062u;
                    logger3.finer("Wait for JmDNS cancel: " + this);
                }
                mo37460x1(5000);
                f17062u.finer("Canceling the state timer");
                mo37418c();
                this.f17078o.shutdown();
                m22318T();
                if (this.f17073j != null) {
                    Runtime.getRuntime().removeShutdownHook(this.f17073j);
                }
                if (f17062u.isLoggable(level)) {
                    f17062u.finer("JmDNS closed.");
                }
            }
            advanceState((C10268a) null);
        }
    }

    /* renamed from: d */
    public void mo37421d(String str) {
        C9267i.C9270b.m22657a().mo37694b(mo37424f0()).mo37421d(str);
    }

    /* renamed from: d0 */
    public C9218a.C9219a mo37422d0() {
        return this.f17072i;
    }

    /* renamed from: f */
    public void mo37423f(C9241c cVar, int i) {
        C9267i.C9270b.m22657a().mo37694b(mo37424f0()).mo37423f(cVar, i);
    }

    /* renamed from: f0 */
    public JmDNSImpl mo37424f0() {
        return this;
    }

    /* renamed from: g0 */
    public InetAddress mo37425g0() {
        return this.f17064a;
    }

    /* renamed from: g1 */
    public void mo37426g1() {
        Logger logger = f17062u;
        logger.finer(mo37444o0() + "recover()");
        if (!mo37414U0() && !isClosed() && !mo37413S0() && !mo37411N0()) {
            synchronized (this.f17083t) {
                if (mo37410N()) {
                    Logger logger2 = f17062u;
                    logger2.finer(mo37444o0() + "recover() thread " + Thread.currentThread().getName());
                    StringBuilder sb = new StringBuilder();
                    sb.append(mo37444o0());
                    sb.append(".recover()");
                    new C9233f(sb.toString()).start();
                }
            }
        }
    }

    /* renamed from: h */
    public void mo37427h() {
        C9267i.C9270b.m22657a().mo37694b(mo37424f0()).mo37427h();
    }

    /* renamed from: h0 */
    public InetAddress mo37428h0() {
        return this.f17065b.getInterface();
    }

    /* renamed from: h1 */
    public boolean mo37429h1() {
        return this.f17074k.mo37373A();
    }

    /* renamed from: i */
    public void mo37430i() {
        C9267i.C9270b.m22657a().mo37694b(mo37424f0()).mo37430i();
    }

    /* renamed from: i1 */
    public boolean mo37431i1(String str) {
        String str2;
        String str3;
        boolean z;
        ServiceTypeEntry serviceTypeEntry;
        String str4;
        Map<ServiceInfo.Fields, String> U = ServiceInfoImpl.m22401U(str);
        String str5 = U.get(ServiceInfo.Fields.Domain);
        String str6 = U.get(ServiceInfo.Fields.Protocol);
        String str7 = U.get(ServiceInfo.Fields.Application);
        String str8 = U.get(ServiceInfo.Fields.Subtype);
        StringBuilder sb = new StringBuilder();
        if (str7.length() > 0) {
            str2 = "_" + str7 + ".";
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (str6.length() > 0) {
            str3 = "_" + str6 + ".";
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(str5);
        sb.append(".");
        String sb2 = sb.toString();
        String lowerCase = sb2.toLowerCase();
        if (f17062u.isLoggable(Level.FINE)) {
            Logger logger = f17062u;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(mo37444o0());
            sb3.append(".registering service type: ");
            sb3.append(str);
            sb3.append(" as: ");
            sb3.append(sb2);
            if (str8.length() > 0) {
                str4 = " subtype: " + str8;
            } else {
                str4 = "";
            }
            sb3.append(str4);
            logger.fine(sb3.toString());
        }
        boolean z2 = true;
        if (this.f17071h.containsKey(lowerCase) || str7.toLowerCase().equals("dns-sd") || str5.toLowerCase().endsWith("in-addr.arpa") || str5.toLowerCase().endsWith("ip6.arpa")) {
            z = false;
        } else {
            z = this.f17071h.putIfAbsent(lowerCase, new ServiceTypeEntry(sb2)) == null;
            if (z) {
                Set<C9272j.C9274b> set = this.f17068e;
                C9272j.C9274b[] bVarArr = (C9272j.C9274b[]) set.toArray(new C9272j.C9274b[set.size()]);
                ServiceEventImpl serviceEventImpl = new ServiceEventImpl(this, sb2, "", (ServiceInfo) null);
                for (C9272j.C9274b bVar : bVarArr) {
                    this.f17078o.submit(new C9229b(this, bVar, serviceEventImpl));
                }
            }
        }
        if (str8.length() <= 0 || (serviceTypeEntry = (ServiceTypeEntry) this.f17071h.get(lowerCase)) == null || serviceTypeEntry.mo37465c(str8)) {
            return z;
        }
        synchronized (serviceTypeEntry) {
            if (!serviceTypeEntry.mo37465c(str8)) {
                serviceTypeEntry.mo37463a(str8);
                Set<C9272j.C9274b> set2 = this.f17068e;
                C9272j.C9274b[] bVarArr2 = (C9272j.C9274b[]) set2.toArray(new C9272j.C9274b[set2.size()]);
                ServiceEventImpl serviceEventImpl2 = new ServiceEventImpl(this, "_" + str8 + "._sub." + sb2, "", (ServiceInfo) null);
                for (C9272j.C9274b cVar : bVarArr2) {
                    this.f17078o.submit(new C9230c(this, cVar, serviceEventImpl2));
                }
            } else {
                z2 = z;
            }
        }
        return z2;
    }

    public boolean isClosed() {
        return this.f17074k.mo37397v();
    }

    /* renamed from: j0 */
    public long mo37433j0() {
        return this.f17077n;
    }

    /* renamed from: j1 */
    public void mo37434j1(C10268a aVar) {
        this.f17074k.mo37374B(aVar);
    }

    /* renamed from: k */
    public void mo37435k() {
        C9267i.C9270b.m22657a().mo37694b(mo37424f0()).mo37435k();
    }

    /* renamed from: k0 */
    public HostInfo mo37436k0() {
        return this.f17074k;
    }

    /* renamed from: k1 */
    public void mo37437k1(C9246d dVar) {
        this.f17066c.remove(dVar);
    }

    /* renamed from: l */
    public void mo37438l() {
        C9267i.C9270b.m22657a().mo37694b(mo37424f0()).mo37438l();
    }

    /* renamed from: l1 */
    public void mo37439l1(C9259h hVar) {
        ServiceInfo A = hVar.mo37660A();
        if (this.f17081r.containsKey(A.mo37334w().toLowerCase())) {
            mo37421d(A.mo37334w());
        }
    }

    /* renamed from: m */
    public void mo37440m() {
        C9267i.C9270b.m22657a().mo37694b(mo37424f0()).mo37440m();
    }

    /* renamed from: m1 */
    public void mo37441m1(String str, String str2, boolean z, long j) {
        m22325y1(mo37443n1(str, str2, "", z), j);
    }

    /* renamed from: n */
    public void mo37442n() {
        C9267i.C9270b.m22657a().mo37694b(mo37424f0()).mo37442n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public ServiceInfoImpl mo37443n1(String str, String str2, String str3, boolean z) {
        mo37412P();
        String lowerCase = str.toLowerCase();
        mo37431i1(str);
        if (this.f17081r.putIfAbsent(lowerCase, new C9235h(str)) == null) {
            m22317I(lowerCase, (C9224d) this.f17081r.get(lowerCase), true);
        }
        ServiceInfoImpl r0 = mo37450r0(str, str2, str3, z);
        mo37448q(r0);
        return r0;
    }

    /* renamed from: o0 */
    public String mo37444o0() {
        return this.f17082s;
    }

    /* renamed from: o1 */
    public void mo37445o1(C9241c cVar) {
        mo37405H0();
        try {
            if (this.f17080q == cVar) {
                this.f17080q = null;
            }
        } finally {
            mo37407J0();
        }
    }

    /* renamed from: p */
    public void mo37446p() {
        C9267i.C9270b.m22657a().mo37694b(mo37424f0()).mo37446p();
    }

    /* renamed from: p1 */
    public boolean mo37447p1() {
        return this.f17074k.mo37375C();
    }

    /* renamed from: q */
    public void mo37448q(ServiceInfoImpl serviceInfoImpl) {
        C9267i.C9270b.m22657a().mo37694b(mo37424f0()).mo37448q(serviceInfoImpl);
    }

    /* renamed from: q1 */
    public void mo37449q1(C9248f fVar) {
        if (!fVar.mo37630l()) {
            byte[] y = fVar.mo37644y();
            DatagramPacket datagramPacket = new DatagramPacket(y, y.length, this.f17064a, C9245a.f17144a);
            Logger logger = f17062u;
            Level level = Level.FINEST;
            if (logger.isLoggable(level)) {
                try {
                    C9241c cVar = new C9241c(datagramPacket);
                    if (f17062u.isLoggable(level)) {
                        Logger logger2 = f17062u;
                        logger2.finest("send(" + mo37444o0() + ") JmDNS out:" + cVar.mo37583y(true));
                    }
                } catch (IOException e) {
                    Logger logger3 = f17062u;
                    String cls = JmDNSImpl.class.toString();
                    logger3.throwing(cls, "send(" + mo37444o0() + ") - JmDNS can not parse what it sends!!!", e);
                }
            }
            MulticastSocket multicastSocket = this.f17065b;
            if (multicastSocket != null && !multicastSocket.isClosed()) {
                multicastSocket.send(datagramPacket);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public ServiceInfoImpl mo37450r0(String str, String str2, String str3, boolean z) {
        ServiceInfoImpl serviceInfoImpl;
        ServiceInfoImpl serviceInfoImpl2;
        String str4;
        ServiceInfo B;
        ServiceInfo B2;
        ServiceInfo B3;
        ServiceInfo B4;
        boolean z2 = z;
        ServiceInfoImpl serviceInfoImpl3 = new ServiceInfoImpl(str, str2, str3, 0, 0, 0, z, (byte[]) null);
        C9237a c0 = mo37419c0();
        DNSRecordClass dNSRecordClass = DNSRecordClass.CLASS_ANY;
        C9240b e = c0.mo37523e(new C9259h.C9264e(str, dNSRecordClass, false, 0, serviceInfoImpl3.mo37330r()));
        if (!(e instanceof C9259h) || (serviceInfoImpl = (ServiceInfoImpl) ((C9259h) e).mo37661B(z2)) == null) {
            return serviceInfoImpl3;
        }
        Map<ServiceInfo.Fields, String> a0 = serviceInfoImpl.mo37506a0();
        byte[] bArr = null;
        C9240b d = mo37419c0().mo37522d(serviceInfoImpl3.mo37330r(), DNSRecordType.TYPE_SRV, dNSRecordClass);
        if (!(d instanceof C9259h) || (B4 = ((C9259h) d).mo37661B(z2)) == null) {
            serviceInfoImpl2 = serviceInfoImpl;
            str4 = "";
        } else {
            serviceInfoImpl2 = new ServiceInfoImpl(a0, B4.mo37325j(), B4.mo37335x(), B4.mo37326k(), z, (byte[]) null);
            bArr = B4.mo37333u();
            str4 = B4.mo37331s();
        }
        C9240b d2 = mo37419c0().mo37522d(str4, DNSRecordType.TYPE_A, dNSRecordClass);
        if ((d2 instanceof C9259h) && (B3 = ((C9259h) d2).mo37661B(z2)) != null) {
            for (Inet4Address E : B3.mo37321f()) {
                serviceInfoImpl2.mo37490E(E);
            }
            serviceInfoImpl2.mo37489D(B3.mo37333u());
        }
        C9240b d3 = mo37419c0().mo37522d(str4, DNSRecordType.TYPE_AAAA, DNSRecordClass.CLASS_ANY);
        if ((d3 instanceof C9259h) && (B2 = ((C9259h) d3).mo37661B(z2)) != null) {
            for (Inet6Address K : B2.mo37322g()) {
                serviceInfoImpl2.mo37494K(K);
            }
            serviceInfoImpl2.mo37489D(B2.mo37333u());
        }
        C9240b d4 = mo37419c0().mo37522d(serviceInfoImpl2.mo37330r(), DNSRecordType.TYPE_TXT, DNSRecordClass.CLASS_ANY);
        if ((d4 instanceof C9259h) && (B = ((C9259h) d4).mo37661B(z2)) != null) {
            serviceInfoImpl2.mo37489D(B.mo37333u());
        }
        if (serviceInfoImpl2.mo37333u().length == 0) {
            serviceInfoImpl2.mo37489D(bArr);
        }
        return serviceInfoImpl2.mo37336y() ? serviceInfoImpl2 : serviceInfoImpl3;
    }

    /* renamed from: r1 */
    public void mo37451r1(long j) {
        this.f17077n = j;
    }

    /* renamed from: s */
    public void mo37341s(String str, C9224d dVar) {
        m22317I(str, dVar, false);
    }

    /* renamed from: s1 */
    public void mo37452s1(int i) {
        this.f17076m = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(2048);
        sb.append("\t---- Local Host -----");
        sb.append("\n\t");
        sb.append(this.f17074k);
        sb.append("\n\t---- Services -----");
        for (String str : this.f17070g.keySet()) {
            sb.append("\n\t\tService: ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.f17070g.get(str));
        }
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append("\t---- Types ----");
        for (String str2 : this.f17071h.keySet()) {
            ServiceTypeEntry serviceTypeEntry = (ServiceTypeEntry) this.f17071h.get(str2);
            sb.append("\n\t\tType: ");
            sb.append(serviceTypeEntry.mo37467d());
            sb.append(": ");
            sb.append(serviceTypeEntry.isEmpty() ? "no subtypes" : serviceTypeEntry);
        }
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append(this.f17069f.toString());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append("\t---- Service Collectors ----");
        for (String str3 : this.f17081r.keySet()) {
            sb.append("\n\t\tService Collector: ");
            sb.append(str3);
            sb.append(": ");
            sb.append(this.f17081r.get(str3));
        }
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append("\t---- Service Listeners ----");
        for (String str4 : this.f17067d.keySet()) {
            sb.append("\n\t\tService Listener: ");
            sb.append(str4);
            sb.append(": ");
            sb.append(this.f17067d.get(str4));
        }
        return sb.toString();
    }

    /* renamed from: u0 */
    public Map<String, ServiceTypeEntry> mo37454u0() {
        return this.f17071h;
    }

    /* renamed from: v0 */
    public Map<String, ServiceInfo> mo37455v0() {
        return this.f17070g;
    }

    /* renamed from: v1 */
    public void mo37456v1(long j, C9259h hVar, Operation operation) {
        ArrayList<C9246d> arrayList;
        List<C9272j.C9273a> list;
        synchronized (this.f17066c) {
            arrayList = new ArrayList<>(this.f17066c);
        }
        for (C9246d a : arrayList) {
            a.mo37505a(mo37419c0(), j, hVar);
        }
        if (DNSRecordType.TYPE_PTR.equals(hVar.mo37558f())) {
            ServiceEvent z = hVar.mo37678z(this);
            if (z.getInfo() == null || !z.getInfo().mo37336y()) {
                ServiceInfoImpl r0 = mo37450r0(z.getType(), z.getName(), "", false);
                if (r0.mo37336y()) {
                    z = new ServiceEventImpl(this, z.getType(), z.getName(), r0);
                }
            }
            List list2 = (List) this.f17067d.get(z.getType().toLowerCase());
            if (list2 != null) {
                synchronized (list2) {
                    list = new ArrayList<>(list2);
                }
            } else {
                list = Collections.emptyList();
            }
            if (f17062u.isLoggable(Level.FINEST)) {
                Logger logger = f17062u;
                logger.finest(mo37444o0() + ".updating record for event: " + z + " list " + list + " operation: " + operation);
            }
            if (!list.isEmpty()) {
                int i = C9234g.f17097a[operation.ordinal()];
                if (i == 1) {
                    for (C9272j.C9273a aVar : list) {
                        if (aVar.mo37697b()) {
                            aVar.mo37701d(z);
                        } else {
                            this.f17078o.submit(new C9231d(this, aVar, z));
                        }
                    }
                } else if (i == 2) {
                    for (C9272j.C9273a aVar2 : list) {
                        if (aVar2.mo37697b()) {
                            aVar2.mo37702e(z);
                        } else {
                            this.f17078o.submit(new C9232e(this, aVar2, z));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: w0 */
    public MulticastSocket mo37457w0() {
        return this.f17065b;
    }

    /* renamed from: w1 */
    public boolean mo37458w1(long j) {
        return this.f17074k.mo37377E(j);
    }

    /* renamed from: x0 */
    public int mo37459x0() {
        return this.f17076m;
    }

    /* renamed from: x1 */
    public boolean mo37460x1(long j) {
        return this.f17074k.mo37378F(j);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo37461y0(C9241c cVar, InetAddress inetAddress, int i) {
        if (f17062u.isLoggable(Level.FINE)) {
            Logger logger = f17062u;
            logger.fine(mo37444o0() + ".handle query: " + cVar);
        }
        boolean z = false;
        long currentTimeMillis = System.currentTimeMillis() + 120;
        for (C9259h D : cVar.mo37620b()) {
            z |= D.mo37663D(this, currentTimeMillis);
        }
        mo37405H0();
        try {
            C9241c cVar2 = this.f17080q;
            if (cVar2 != null) {
                cVar2.mo37579u(cVar);
            } else {
                C9241c v = cVar.clone();
                if (cVar.mo37633o()) {
                    this.f17080q = v;
                }
                mo37423f(v, i);
            }
            mo37407J0();
            long currentTimeMillis2 = System.currentTimeMillis();
            for (C9259h z0 : cVar.mo37621c()) {
                mo37462z0(z0, currentTimeMillis2);
            }
            if (z) {
                mo37438l();
            }
        } catch (Throwable th) {
            mo37407J0();
            throw th;
        }
    }

    /* renamed from: z */
    public void mo37342z(ServiceInfo serviceInfo) {
        if (mo37414U0() || isClosed()) {
            throw new IllegalStateException("This DNS is closed.");
        }
        ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) serviceInfo;
        if (serviceInfoImpl.mo37502X() != null) {
            if (serviceInfoImpl.mo37502X() != this) {
                throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
            } else if (this.f17070g.get(serviceInfoImpl.mo37323h()) != null) {
                throw new IllegalStateException("A service information can only be registered once.");
            }
        }
        serviceInfoImpl.mo37491F0(this);
        mo37431i1(serviceInfoImpl.mo37507b0());
        serviceInfoImpl.mo37516s0();
        serviceInfoImpl.mo37495K0(this.f17074k.mo37390p());
        serviceInfoImpl.mo37490E(this.f17074k.mo37386l());
        serviceInfoImpl.mo37494K(this.f17074k.mo37387m());
        mo37458w1(6000);
        do {
            m22320Z0(serviceInfoImpl);
        } while (this.f17070g.putIfAbsent(serviceInfoImpl.mo37323h(), serviceInfoImpl) != null);
        mo37438l();
        serviceInfoImpl.mo37499P0(6000);
        if (f17062u.isLoggable(Level.FINE)) {
            Logger logger = f17062u;
            logger.fine("registerService() JmDNS registered service as " + serviceInfoImpl);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f4, code lost:
        if (r1 == false) goto L_0x00f6;
     */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37462z0(javax.jmdns.impl.C9259h r8, long r9) {
        /*
            r7 = this;
            javax.jmdns.impl.JmDNSImpl$Operation r0 = javax.jmdns.impl.JmDNSImpl.Operation.Noop
            boolean r1 = r8.mo37563j(r9)
            java.util.logging.Logger r2 = f17062u
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            boolean r2 = r2.isLoggable(r3)
            if (r2 == 0) goto L_0x002d
            java.util.logging.Logger r2 = f17062u
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r7.mo37444o0()
            r4.append(r5)
            java.lang.String r5 = " handle response: "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r2.fine(r4)
        L_0x002d:
            boolean r2 = r8.mo37568o()
            if (r2 != 0) goto L_0x00ff
            boolean r2 = r8.mo37562i()
            if (r2 != 0) goto L_0x00ff
            boolean r2 = r8.mo37569p()
            javax.jmdns.impl.a r4 = r7.mo37419c0()
            javax.jmdns.impl.b r4 = r4.mo37523e(r8)
            javax.jmdns.impl.h r4 = (javax.jmdns.impl.C9259h) r4
            java.util.logging.Logger r5 = f17062u
            boolean r3 = r5.isLoggable(r3)
            if (r3 == 0) goto L_0x006c
            java.util.logging.Logger r3 = f17062u
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r7.mo37444o0()
            r5.append(r6)
            java.lang.String r6 = " handle response cached record: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            r3.fine(r5)
        L_0x006c:
            if (r2 == 0) goto L_0x00ae
            javax.jmdns.impl.a r2 = r7.mo37419c0()
            java.lang.String r3 = r8.mo37553b()
            java.util.Collection r2 = r2.mo37525f(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x007e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00ae
            java.lang.Object r3 = r2.next()
            javax.jmdns.impl.b r3 = (javax.jmdns.impl.C9240b) r3
            javax.jmdns.impl.constants.DNSRecordType r5 = r8.mo37558f()
            javax.jmdns.impl.constants.DNSRecordType r6 = r3.mo37558f()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x007e
            javax.jmdns.impl.constants.DNSRecordClass r5 = r8.mo37556e()
            javax.jmdns.impl.constants.DNSRecordClass r6 = r3.mo37556e()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x007e
            if (r3 == r4) goto L_0x007e
            javax.jmdns.impl.h r3 = (javax.jmdns.impl.C9259h) r3
            r3.mo37671L(r9)
            goto L_0x007e
        L_0x00ae:
            if (r4 == 0) goto L_0x00f4
            if (r1 == 0) goto L_0x00c8
            int r0 = r8.mo37662C()
            if (r0 != 0) goto L_0x00be
            javax.jmdns.impl.JmDNSImpl$Operation r0 = javax.jmdns.impl.JmDNSImpl.Operation.Noop
            r4.mo37671L(r9)
            goto L_0x00ff
        L_0x00be:
            javax.jmdns.impl.JmDNSImpl$Operation r0 = javax.jmdns.impl.JmDNSImpl.Operation.Remove
            javax.jmdns.impl.a r2 = r7.mo37419c0()
            r2.mo37529j(r4)
            goto L_0x00ff
        L_0x00c8:
            boolean r2 = r8.mo37669J(r4)
            if (r2 == 0) goto L_0x00e4
            boolean r2 = r8.mo37572s(r4)
            if (r2 != 0) goto L_0x00df
            java.lang.String r2 = r8.mo37559g()
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x00df
            goto L_0x00e4
        L_0x00df:
            r4.mo37667H(r8)
            r8 = r4
            goto L_0x00ff
        L_0x00e4:
            boolean r0 = r8.mo37665F()
            if (r0 == 0) goto L_0x00f6
            javax.jmdns.impl.JmDNSImpl$Operation r0 = javax.jmdns.impl.JmDNSImpl.Operation.Update
            javax.jmdns.impl.a r2 = r7.mo37419c0()
            r2.mo37530k(r8, r4)
            goto L_0x00ff
        L_0x00f4:
            if (r1 != 0) goto L_0x00ff
        L_0x00f6:
            javax.jmdns.impl.JmDNSImpl$Operation r0 = javax.jmdns.impl.JmDNSImpl.Operation.Add
            javax.jmdns.impl.a r2 = r7.mo37419c0()
            r2.mo37519b(r8)
        L_0x00ff:
            javax.jmdns.impl.constants.DNSRecordType r2 = r8.mo37558f()
            javax.jmdns.impl.constants.DNSRecordType r3 = javax.jmdns.impl.constants.DNSRecordType.TYPE_PTR
            if (r2 != r3) goto L_0x012b
            boolean r2 = r8.mo37568o()
            if (r2 == 0) goto L_0x0119
            if (r1 != 0) goto L_0x0118
            javax.jmdns.impl.h$e r8 = (javax.jmdns.impl.C9259h.C9264e) r8
            java.lang.String r8 = r8.mo37681P()
            r7.mo37431i1(r8)
        L_0x0118:
            return
        L_0x0119:
            java.lang.String r1 = r8.mo37554c()
            boolean r1 = r7.mo37431i1(r1)
            r1 = r1 | 0
            if (r1 == 0) goto L_0x012b
            javax.jmdns.impl.JmDNSImpl$Operation r1 = javax.jmdns.impl.JmDNSImpl.Operation.Noop
            if (r0 != r1) goto L_0x012b
            javax.jmdns.impl.JmDNSImpl$Operation r0 = javax.jmdns.impl.JmDNSImpl.Operation.RegisterServiceType
        L_0x012b:
            javax.jmdns.impl.JmDNSImpl$Operation r1 = javax.jmdns.impl.JmDNSImpl.Operation.Noop
            if (r0 == r1) goto L_0x0132
            r7.mo37456v1(r9, r8, r0)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.JmDNSImpl.mo37462z0(javax.jmdns.impl.h, long):void");
    }
}
