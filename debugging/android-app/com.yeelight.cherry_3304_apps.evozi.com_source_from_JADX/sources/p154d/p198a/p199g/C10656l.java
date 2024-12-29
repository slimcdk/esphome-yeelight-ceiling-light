package p154d.p198a.p199g;

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
import org.apache.commons.p271io.IOUtils;
import p154d.p198a.C10607a;
import p154d.p198a.C10612c;
import p154d.p198a.C10613d;
import p154d.p198a.C10615e;
import p154d.p198a.p199g.C10637h;
import p154d.p198a.p199g.C10648j;
import p154d.p198a.p199g.C10668m;
import p154d.p198a.p199g.p200r.C10677a;
import p154d.p198a.p199g.p200r.C10680d;
import p154d.p198a.p199g.p200r.C10681e;
import p154d.p198a.p199g.p200r.C10683g;
import p154d.p198a.p199g.p201s.C10686a;

/* renamed from: d.a.g.l */
public class C10656l extends C10607a implements C10645i, C10648j {

    /* renamed from: u */
    private static Logger f20375u = Logger.getLogger(C10656l.class.getName());

    /* renamed from: v */
    private static final Random f20376v = new Random();

    /* renamed from: a */
    private volatile InetAddress f20377a;

    /* renamed from: b */
    private volatile MulticastSocket f20378b;

    /* renamed from: c */
    private final List<C10624d> f20379c;

    /* renamed from: d */
    private final ConcurrentMap<String, List<C10668m.C10669a>> f20380d;

    /* renamed from: e */
    private final Set<C10668m.C10670b> f20381e;

    /* renamed from: f */
    private final C10617a f20382f;

    /* renamed from: g */
    private final ConcurrentMap<String, C10613d> f20383g;

    /* renamed from: h */
    private final ConcurrentMap<String, C10666j> f20384h;

    /* renamed from: i */
    private volatile C10607a.C10608a f20385i;

    /* renamed from: j */
    protected Thread f20386j;

    /* renamed from: k */
    private C10653k f20387k;

    /* renamed from: l */
    private Thread f20388l;

    /* renamed from: m */
    private int f20389m;

    /* renamed from: n */
    private long f20390n;

    /* renamed from: o */
    private final ExecutorService f20391o = Executors.newSingleThreadExecutor();

    /* renamed from: p */
    private final ReentrantLock f20392p = new ReentrantLock();

    /* renamed from: q */
    private C10621c f20393q;

    /* renamed from: r */
    private final ConcurrentMap<String, C10665i> f20394r;

    /* renamed from: s */
    private final String f20395s;

    /* renamed from: t */
    private final Object f20396t = new Object();

    /* renamed from: d.a.g.l$a */
    class C10657a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10668m.C10669a f20397a;

        /* renamed from: b */
        final /* synthetic */ C10612c f20398b;

        C10657a(C10668m.C10669a aVar, C10612c cVar) {
            this.f20397a = aVar;
            this.f20398b = cVar;
        }

        public void run() {
            this.f20397a.mo33783f(this.f20398b);
        }
    }

    /* renamed from: d.a.g.l$b */
    class C10658b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10668m.C10670b f20400a;

        /* renamed from: b */
        final /* synthetic */ C10612c f20401b;

        C10658b(C10668m.C10670b bVar, C10612c cVar) {
            this.f20400a = bVar;
            this.f20401b = cVar;
        }

        public void run() {
            this.f20400a.mo33784c(this.f20401b);
        }
    }

    /* renamed from: d.a.g.l$c */
    class C10659c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10668m.C10670b f20403a;

        /* renamed from: b */
        final /* synthetic */ C10612c f20404b;

        C10659c(C10668m.C10670b bVar, C10612c cVar) {
            this.f20403a = bVar;
            this.f20404b = cVar;
        }

        public void run() {
            this.f20403a.mo33785d(this.f20404b);
        }
    }

    /* renamed from: d.a.g.l$d */
    class C10660d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10668m.C10669a f20406a;

        /* renamed from: b */
        final /* synthetic */ C10612c f20407b;

        C10660d(C10668m.C10669a aVar, C10612c cVar) {
            this.f20406a = aVar;
            this.f20407b = cVar;
        }

        public void run() {
            this.f20406a.mo33781d(this.f20407b);
        }
    }

    /* renamed from: d.a.g.l$e */
    class C10661e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10668m.C10669a f20409a;

        /* renamed from: b */
        final /* synthetic */ C10612c f20410b;

        C10661e(C10668m.C10669a aVar, C10612c cVar) {
            this.f20409a = aVar;
            this.f20410b = cVar;
        }

        public void run() {
            this.f20409a.mo33782e(this.f20410b);
        }
    }

    /* renamed from: d.a.g.l$f */
    class C10662f extends Thread {
        C10662f(String str) {
            super(str);
        }

        public void run() {
            C10656l.this.mo33707R();
        }
    }

    /* renamed from: d.a.g.l$g */
    static /* synthetic */ class C10663g {

        /* renamed from: a */
        static final /* synthetic */ int[] f20413a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                d.a.g.l$h[] r0 = p154d.p198a.p199g.C10656l.C10664h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20413a = r0
                d.a.g.l$h r1 = p154d.p198a.p199g.C10656l.C10664h.Add     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20413a     // Catch:{ NoSuchFieldError -> 0x001d }
                d.a.g.l$h r1 = p154d.p198a.p199g.C10656l.C10664h.Remove     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10656l.C10663g.<clinit>():void");
        }
    }

    /* renamed from: d.a.g.l$h */
    public enum C10664h {
        Remove,
        Update,
        Add,
        RegisterServiceType,
        Noop
    }

    /* renamed from: d.a.g.l$i */
    private static class C10665i implements C10615e {

        /* renamed from: a */
        private final ConcurrentMap<String, C10613d> f20420a = new ConcurrentHashMap();

        /* renamed from: b */
        private final ConcurrentMap<String, C10612c> f20421b = new ConcurrentHashMap();

        /* renamed from: c */
        private final String f20422c;

        public C10665i(String str) {
            this.f20422c = str;
        }

        public void serviceAdded(C10612c cVar) {
            ConcurrentMap<String, C10613d> concurrentMap;
            String d;
            synchronized (this) {
                C10613d c = cVar.mo33461c();
                if (c == null || !c.mo33485z()) {
                    c = ((C10656l) cVar.mo33460b()).mo33734p1(cVar.mo33464e(), cVar.mo33463d(), c != null ? c.mo33481v() : "", true);
                    if (c != null) {
                        concurrentMap = this.f20420a;
                        d = cVar.mo33463d();
                    } else {
                        this.f20421b.put(cVar.mo33463d(), cVar);
                    }
                } else {
                    concurrentMap = this.f20420a;
                    d = cVar.mo33463d();
                }
                concurrentMap.put(d, c);
            }
        }

        public void serviceRemoved(C10612c cVar) {
            synchronized (this) {
                this.f20420a.remove(cVar.mo33463d());
                this.f20421b.remove(cVar.mo33463d());
            }
        }

        public void serviceResolved(C10612c cVar) {
            synchronized (this) {
                this.f20420a.put(cVar.mo33463d(), cVar.mo33461c());
                this.f20421b.remove(cVar.mo33463d());
            }
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\n\tType: ");
            stringBuffer.append(this.f20422c);
            if (this.f20420a.isEmpty()) {
                stringBuffer.append("\n\tNo services collected.");
            } else {
                stringBuffer.append("\n\tServices");
                for (String str : this.f20420a.keySet()) {
                    stringBuffer.append("\n\t\tService: ");
                    stringBuffer.append(str);
                    stringBuffer.append(": ");
                    stringBuffer.append(this.f20420a.get(str));
                }
            }
            if (this.f20421b.isEmpty()) {
                stringBuffer.append("\n\tNo event queued.");
            } else {
                stringBuffer.append("\n\tEvents");
                for (String str2 : this.f20421b.keySet()) {
                    stringBuffer.append("\n\t\tEvent: ");
                    stringBuffer.append(str2);
                    stringBuffer.append(": ");
                    stringBuffer.append(this.f20421b.get(str2));
                }
            }
            return stringBuffer.toString();
        }
    }

    /* renamed from: d.a.g.l$j */
    public static class C10666j extends AbstractMap<String, String> implements Cloneable {

        /* renamed from: a */
        private final Set<Map.Entry<String, String>> f20423a = new HashSet();

        /* renamed from: b */
        private final String f20424b;

        /* renamed from: d.a.g.l$j$a */
        private static class C10667a implements Map.Entry<String, String>, Serializable, Cloneable {

            /* renamed from: a */
            private final String f20425a;

            /* renamed from: b */
            private final String f20426b;

            public C10667a(String str) {
                str = str == null ? "" : str;
                this.f20426b = str;
                this.f20425a = str.toLowerCase();
            }

            /* renamed from: a */
            public C10667a mo33765a() {
                return this;
            }

            /* renamed from: b */
            public String getKey() {
                return this.f20425a;
            }

            /* renamed from: c */
            public String getValue() {
                return this.f20426b;
            }

            public /* bridge */ /* synthetic */ Object clone() {
                mo33765a();
                return this;
            }

            /* renamed from: d */
            public String mo33769d(String str) {
                throw new UnsupportedOperationException();
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return getKey().equals(entry.getKey()) && getValue().equals(entry.getValue());
            }

            public int hashCode() {
                String str = this.f20425a;
                int i = 0;
                int hashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f20426b;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode ^ i;
            }

            public /* bridge */ /* synthetic */ Object setValue(Object obj) {
                mo33769d((String) obj);
                throw null;
            }

            public String toString() {
                return this.f20425a + "=" + this.f20426b;
            }
        }

        public C10666j(String str) {
            this.f20424b = str;
        }

        /* renamed from: a */
        public boolean mo33758a(String str) {
            if (str == null || mo33760c(str)) {
                return false;
            }
            this.f20423a.add(new C10667a(str));
            return true;
        }

        /* renamed from: b */
        public C10666j clone() {
            C10666j jVar = new C10666j(mo33762d());
            for (Map.Entry<String, String> value : entrySet()) {
                jVar.mo33758a((String) value.getValue());
            }
            return jVar;
        }

        /* renamed from: c */
        public boolean mo33760c(String str) {
            return str != null && containsKey(str.toLowerCase());
        }

        /* renamed from: d */
        public String mo33762d() {
            return this.f20424b;
        }

        public Set<Map.Entry<String, String>> entrySet() {
            return this.f20423a;
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

    public C10656l(InetAddress inetAddress, String str) {
        if (f20375u.isLoggable(Level.FINER)) {
            f20375u.finer("JmDNS instance created");
        }
        this.f20382f = new C10617a(100);
        this.f20379c = Collections.synchronizedList(new ArrayList());
        this.f20380d = new ConcurrentHashMap();
        this.f20381e = Collections.synchronizedSet(new HashSet());
        this.f20394r = new ConcurrentHashMap();
        this.f20383g = new ConcurrentHashMap(20);
        this.f20384h = new ConcurrentHashMap(20);
        C10653k A = C10653k.m26181A(inetAddress, this, str);
        this.f20387k = A;
        this.f20395s = str == null ? A.mo33690q() : str;
        m26219h1(mo33729m0());
        m26221v1(mo33743v0().values());
        mo33660o();
    }

    /* renamed from: A1 */
    private void m26214A1(C10613d dVar, long j) {
        synchronized (dVar) {
            long j2 = j / 200;
            if (j2 < 1) {
                j2 = 1;
            }
            for (int i = 0; ((long) i) < j2 && !dVar.mo33485z(); i++) {
                try {
                    dVar.wait(200);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: T */
    private void m26215T(String str, C10615e eVar, boolean z) {
        C10668m.C10669a aVar = new C10668m.C10669a(eVar, z);
        String lowerCase = str.toLowerCase();
        List list = (List) this.f20380d.get(lowerCase);
        if (list == null) {
            if (this.f20380d.putIfAbsent(lowerCase, new LinkedList()) == null && this.f20394r.putIfAbsent(lowerCase, new C10665i(str)) == null) {
                m26215T(lowerCase, (C10615e) this.f20394r.get(lowerCase), true);
            }
            list = (List) this.f20380d.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                if (!list.contains(eVar)) {
                    list.add(aVar);
                }
            }
        }
        ArrayList<C10612c> arrayList = new ArrayList<>();
        Iterator<C10620b> it = mo33715c0().mo33489c().iterator();
        while (it.hasNext()) {
            C10637h hVar = (C10637h) it.next();
            if (hVar.mo33527f() == C10681e.TYPE_SRV && hVar.mo33522b().endsWith(lowerCase)) {
                arrayList.add(new C10672o(this, hVar.mo33529h(), m26222w1(hVar.mo33529h(), hVar.mo33523c()), hVar.mo33600A()));
            }
        }
        for (C10612c d : arrayList) {
            aVar.mo33781d(d);
        }
        mo33656g(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:5|6|7|9|10|(3:31|28|11)|32|34|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        f20375u.log(java.util.logging.Level.WARNING, "closeMulticastSocket() Close socket exception ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[Catch:{ Exception -> 0x001e }] */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26216Z() {
        /*
            r5 = this;
            java.util.logging.Logger r0 = f20375u
            java.util.logging.Level r1 = java.util.logging.Level.FINER
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L_0x0011
            java.util.logging.Logger r0 = f20375u
            java.lang.String r1 = "closeMulticastSocket()"
            r0.finer(r1)
        L_0x0011:
            java.net.MulticastSocket r0 = r5.f20378b
            if (r0 == 0) goto L_0x0069
            r0 = 0
            java.net.MulticastSocket r1 = r5.f20378b     // Catch:{ SocketException -> 0x0020 }
            java.net.InetAddress r2 = r5.f20377a     // Catch:{ SocketException -> 0x0020 }
            r1.leaveGroup(r2)     // Catch:{ SocketException -> 0x0020 }
            goto L_0x0020
        L_0x001e:
            r1 = move-exception
            goto L_0x005e
        L_0x0020:
            java.net.MulticastSocket r1 = r5.f20378b     // Catch:{ Exception -> 0x001e }
            r1.close()     // Catch:{ Exception -> 0x001e }
        L_0x0025:
            java.lang.Thread r1 = r5.f20388l     // Catch:{ Exception -> 0x001e }
            if (r1 == 0) goto L_0x005b
            java.lang.Thread r1 = r5.f20388l     // Catch:{ Exception -> 0x001e }
            boolean r1 = r1.isAlive()     // Catch:{ Exception -> 0x001e }
            if (r1 == 0) goto L_0x005b
            monitor-enter(r5)     // Catch:{ Exception -> 0x001e }
            java.lang.Thread r1 = r5.f20388l     // Catch:{ InterruptedException -> 0x0057 }
            if (r1 == 0) goto L_0x0057
            java.lang.Thread r1 = r5.f20388l     // Catch:{ InterruptedException -> 0x0057 }
            boolean r1 = r1.isAlive()     // Catch:{ InterruptedException -> 0x0057 }
            if (r1 == 0) goto L_0x0057
            java.util.logging.Logger r1 = f20375u     // Catch:{ InterruptedException -> 0x0057 }
            java.util.logging.Level r2 = java.util.logging.Level.FINER     // Catch:{ InterruptedException -> 0x0057 }
            boolean r1 = r1.isLoggable(r2)     // Catch:{ InterruptedException -> 0x0057 }
            if (r1 == 0) goto L_0x004f
            java.util.logging.Logger r1 = f20375u     // Catch:{ InterruptedException -> 0x0057 }
            java.lang.String r2 = "closeMulticastSocket(): waiting for jmDNS monitor"
            r1.finer(r2)     // Catch:{ InterruptedException -> 0x0057 }
        L_0x004f:
            r1 = 1000(0x3e8, double:4.94E-321)
            r5.wait(r1)     // Catch:{ InterruptedException -> 0x0057 }
            goto L_0x0057
        L_0x0055:
            r1 = move-exception
            goto L_0x0059
        L_0x0057:
            monitor-exit(r5)     // Catch:{ all -> 0x0055 }
            goto L_0x0025
        L_0x0059:
            monitor-exit(r5)     // Catch:{ all -> 0x0055 }
            throw r1     // Catch:{ Exception -> 0x001e }
        L_0x005b:
            r5.f20388l = r0     // Catch:{ Exception -> 0x001e }
            goto L_0x0067
        L_0x005e:
            java.util.logging.Logger r2 = f20375u
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r4 = "closeMulticastSocket() Close socket exception "
            r2.log(r3, r4, r1)
        L_0x0067:
            r5.f20378b = r0
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10656l.m26216Z():void");
    }

    /* renamed from: b0 */
    private void m26217b0() {
        if (f20375u.isLoggable(Level.FINER)) {
            f20375u.finer("disposeServiceCollectors()");
        }
        for (String str : this.f20394r.keySet()) {
            C10665i iVar = (C10665i) this.f20394r.get(str);
            if (iVar != null) {
                mo33452K(str, iVar);
                this.f20394r.remove(str, iVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (f20375u.isLoggable(java.util.logging.Level.FINER) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r3 = f20375u;
        r3.finer("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:" + r5 + " s.server=" + r7.mo33624R() + " " + r10.f20387k.mo33690q() + " equals:" + r7.mo33624R().equals(r10.f20387k.mo33690q()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a5, code lost:
        r11.mo33799M0(mo33702F0(r11.mo33473m()));
        r3 = true;
     */
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m26218g1(p154d.p198a.p199g.C10673p r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.mo33472l()
            long r1 = java.lang.System.currentTimeMillis()
        L_0x0008:
            r3 = 0
            d.a.g.a r4 = r10.mo33715c0()
            java.lang.String r5 = r11.mo33472l()
            java.util.Collection r4 = r4.mo33494f(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0019:
            boolean r5 = r4.hasNext()
            r6 = 1
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r4.next()
            d.a.g.b r5 = (p154d.p198a.p199g.C10620b) r5
            d.a.g.r.e r7 = p154d.p198a.p199g.p200r.C10681e.TYPE_SRV
            d.a.g.r.e r8 = r5.mo33527f()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0019
            boolean r7 = r5.mo33532j(r1)
            if (r7 != 0) goto L_0x0019
            r7 = r5
            d.a.g.h$f r7 = (p154d.p198a.p199g.C10637h.C10643f) r7
            int r8 = r7.mo33622P()
            int r9 = r11.mo33474o()
            if (r8 != r9) goto L_0x0055
            java.lang.String r8 = r7.mo33624R()
            d.a.g.k r9 = r10.f20387k
            java.lang.String r9 = r9.mo33690q()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0019
        L_0x0055:
            java.util.logging.Logger r3 = f20375u
            java.util.logging.Level r4 = java.util.logging.Level.FINER
            boolean r3 = r3.isLoggable(r4)
            if (r3 == 0) goto L_0x00a5
            java.util.logging.Logger r3 = f20375u
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:"
            r4.append(r8)
            r4.append(r5)
            java.lang.String r5 = " s.server="
            r4.append(r5)
            java.lang.String r5 = r7.mo33624R()
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            d.a.g.k r5 = r10.f20387k
            java.lang.String r5 = r5.mo33690q()
            r4.append(r5)
            java.lang.String r5 = " equals:"
            r4.append(r5)
            java.lang.String r5 = r7.mo33624R()
            d.a.g.k r7 = r10.f20387k
            java.lang.String r7 = r7.mo33690q()
            boolean r5 = r5.equals(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.finer(r4)
        L_0x00a5:
            java.lang.String r3 = r11.mo33473m()
            java.lang.String r3 = r10.mo33702F0(r3)
            r11.mo33799M0(r3)
            r3 = 1
        L_0x00b1:
            java.util.concurrent.ConcurrentMap<java.lang.String, d.a.d> r4 = r10.f20383g
            java.lang.String r5 = r11.mo33472l()
            java.lang.Object r4 = r4.get(r5)
            d.a.d r4 = (p154d.p198a.C10613d) r4
            if (r4 == 0) goto L_0x00cd
            if (r4 == r11) goto L_0x00cd
            java.lang.String r3 = r11.mo33473m()
            java.lang.String r3 = r10.mo33702F0(r3)
            r11.mo33799M0(r3)
            r3 = 1
        L_0x00cd:
            if (r3 != 0) goto L_0x0008
            java.lang.String r11 = r11.mo33472l()
            boolean r11 = r0.equals(r11)
            r11 = r11 ^ r6
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10656l.m26218g1(d.a.g.p):boolean");
    }

    /* renamed from: h1 */
    private void m26219h1(C10653k kVar) {
        if (this.f20377a == null) {
            this.f20377a = InetAddress.getByName(kVar.mo33688o() instanceof Inet6Address ? "FF02::FB" : "224.0.0.251");
        }
        if (this.f20378b != null) {
            m26216Z();
        }
        this.f20378b = new MulticastSocket(C10677a.f20461a);
        if (!(kVar == null || kVar.mo33689p() == null)) {
            try {
                this.f20378b.setNetworkInterface(kVar.mo33689p());
            } catch (SocketException e) {
                if (f20375u.isLoggable(Level.FINE)) {
                    Logger logger = f20375u;
                    logger.fine("openMulticastSocket() Set network interface exception: " + e.getMessage());
                }
            }
        }
        this.f20378b.setTimeToLive(255);
        this.f20378b.joinGroup(this.f20377a);
    }

    /* renamed from: o0 */
    public static Random m26220o0() {
        return f20376v;
    }

    /* renamed from: v1 */
    private void m26221v1(Collection<? extends C10613d> collection) {
        if (this.f20388l == null) {
            C10676q qVar = new C10676q(this);
            this.f20388l = qVar;
            qVar.start();
        }
        mo33661s();
        for (C10613d pVar : collection) {
            try {
                mo33451J(new C10673p(pVar));
            } catch (Exception e) {
                f20375u.log(Level.WARNING, "start() Registration exception ", e);
            }
        }
    }

    /* renamed from: w1 */
    static String m26222w1(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo33700B0(C10621c cVar) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        boolean z2 = false;
        for (C10637h hVar : cVar.mo33561b()) {
            mo33749z0(hVar, currentTimeMillis);
            if (C10681e.TYPE_A.equals(hVar.mo33527f()) || C10681e.TYPE_AAAA.equals(hVar.mo33527f())) {
                z |= hVar.mo33604E(this);
            } else {
                z2 |= hVar.mo33604E(this);
            }
        }
        if (z || z2) {
            mo33661s();
        }
    }

    /* renamed from: C */
    public void mo33652C() {
        C10648j.C10651b a = C10648j.C10651b.m26177a();
        mo33718e0();
        a.mo33671b(this).mo33652C();
    }

    /* renamed from: D */
    public void mo33653D(C10673p pVar) {
        C10648j.C10651b a = C10648j.C10651b.m26177a();
        mo33718e0();
        a.mo33671b(this).mo33653D(pVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo33701D0(C10612c cVar) {
        ArrayList<C10668m.C10669a> arrayList;
        List list = (List) this.f20380d.get(cVar.mo33464e().toLowerCase());
        if (list != null && !list.isEmpty() && cVar.mo33461c() != null && cVar.mo33461c().mo33485z()) {
            synchronized (list) {
                arrayList = new ArrayList<>(list);
            }
            for (C10668m.C10669a aVar : arrayList) {
                this.f20391o.submit(new C10657a(aVar, cVar));
            }
        }
    }

    /* renamed from: F */
    public void mo33450F(String str, C10615e eVar) {
        m26215T(str, eVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public String mo33702F0(String str) {
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

    /* renamed from: G0 */
    public void mo33703G0() {
        this.f20392p.lock();
    }

    /* renamed from: I0 */
    public void mo33704I0() {
        this.f20392p.unlock();
    }

    /* renamed from: J */
    public void mo33451J(C10613d dVar) {
        if (mo33719e1() || isClosed()) {
            throw new IllegalStateException("This DNS is closed.");
        }
        C10673p pVar = (C10673p) dVar;
        if (pVar.mo33806b0() != null) {
            if (pVar.mo33806b0() != this) {
                throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
            } else if (this.f20383g.get(pVar.mo33472l()) != null) {
                throw new IllegalStateException("A service information can only be registered once.");
            }
        }
        pVar.mo33798L0(this);
        mo33727k1(pVar.mo33812i0());
        pVar.mo33791C0();
        pVar.mo33802O0(this.f20387k.mo33690q());
        pVar.mo33792D(this.f20387k.mo33686m());
        pVar.mo33793E(this.f20387k.mo33687n());
        mo33748y1(6000);
        do {
            m26218g1(pVar);
        } while (this.f20383g.putIfAbsent(pVar.mo33472l(), pVar) != null);
        mo33661s();
        pVar.mo33804R0(6000);
        if (f20375u.isLoggable(Level.FINE)) {
            Logger logger = f20375u;
            logger.fine("registerService() JmDNS registered service as " + pVar);
        }
    }

    /* renamed from: J0 */
    public boolean mo33705J0() {
        return this.f20387k.mo33692s();
    }

    /* renamed from: K */
    public void mo33452K(String str, C10615e eVar) {
        String lowerCase = str.toLowerCase();
        List list = (List) this.f20380d.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                list.remove(new C10668m.C10669a(eVar, false));
                if (list.isEmpty()) {
                    this.f20380d.remove(lowerCase, list);
                }
            }
        }
    }

    /* renamed from: L */
    public void mo33453L(String str, String str2) {
        mo33733o1(str, str2, false, 6000);
    }

    /* renamed from: M */
    public void mo33454M() {
        if (f20375u.isLoggable(Level.FINER)) {
            f20375u.finer("unregisterAllServices()");
        }
        for (String str : this.f20383g.keySet()) {
            C10673p pVar = (C10673p) this.f20383g.get(str);
            if (pVar != null) {
                if (f20375u.isLoggable(Level.FINER)) {
                    Logger logger = f20375u;
                    logger.finer("Cancelling service info: " + pVar);
                }
                pVar.mo33800N();
            }
        }
        mo33659n();
        for (String str2 : this.f20383g.keySet()) {
            C10673p pVar2 = (C10673p) this.f20383g.get(str2);
            if (pVar2 != null) {
                if (f20375u.isLoggable(Level.FINER)) {
                    Logger logger2 = f20375u;
                    logger2.finer("Wait for service info cancel: " + pVar2);
                }
                pVar2.mo33805T0(5000);
                this.f20383g.remove(str2, pVar2);
            }
        }
    }

    /* renamed from: Q */
    public void mo33455Q(C10613d dVar) {
        C10673p pVar = (C10673p) this.f20383g.get(dVar.mo33472l());
        if (pVar != null) {
            pVar.mo33800N();
            mo33659n();
            pVar.mo33805T0(5000);
            this.f20383g.remove(pVar.mo33472l(), pVar);
            if (f20375u.isLoggable(Level.FINE)) {
                Logger logger = f20375u;
                logger.fine("unregisterService() JmDNS unregistered service as " + pVar);
                return;
            }
            return;
        }
        Logger logger2 = f20375u;
        logger2.warning("Removing unregistered service info: " + dVar.mo33472l());
    }

    /* renamed from: Q0 */
    public boolean mo33706Q0(C10686a aVar, C10683g gVar) {
        return this.f20387k.mo33693t(aVar, gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo33707R() {
        if (f20375u.isLoggable(Level.FINER)) {
            Logger logger = f20375u;
            logger.finer(mo33731n0() + "recover() Cleanning up");
        }
        f20375u.warning("RECOVERING");
        mo33654a();
        ArrayList<C10613d> arrayList = new ArrayList<>(mo33743v0().values());
        mo33454M();
        m26217b0();
        mo33750z1(5000);
        mo33663u();
        m26216Z();
        mo33715c0().clear();
        if (f20375u.isLoggable(Level.FINER)) {
            Logger logger2 = f20375u;
            logger2.finer(mo33731n0() + "recover() All is clean");
        }
        if (mo33709S0()) {
            for (C10613d dVar : arrayList) {
                ((C10673p) dVar).mo33791C0();
            }
            mo33725j1();
            try {
                m26219h1(mo33729m0());
                m26221v1(arrayList);
            } catch (Exception e) {
                Logger logger3 = f20375u;
                Level level = Level.WARNING;
                logger3.log(level, mo33731n0() + "recover() Start services exception ", e);
            }
            Logger logger4 = f20375u;
            Level level2 = Level.WARNING;
            logger4.log(level2, mo33731n0() + "recover() We are back!");
            return;
        }
        Logger logger5 = f20375u;
        Level level3 = Level.WARNING;
        logger5.log(level3, mo33731n0() + "recover() Could not recover we are Down!");
        if (mo33717d0() != null) {
            C10607a.C10608a d0 = mo33717d0();
            mo33718e0();
            d0.mo33456a(this, arrayList);
        }
    }

    /* renamed from: S */
    public void mo33708S(C10624d dVar, C10628g gVar) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f20379c.add(dVar);
        if (gVar != null) {
            for (C10620b bVar : mo33715c0().mo33494f(gVar.mo33523c().toLowerCase())) {
                if (gVar.mo33598y(bVar) && !bVar.mo33532j(currentTimeMillis)) {
                    dVar.mo33559a(mo33715c0(), currentTimeMillis, bVar);
                }
            }
        }
    }

    /* renamed from: S0 */
    public boolean mo33709S0() {
        return this.f20387k.mo33695u();
    }

    /* renamed from: V */
    public void mo33710V(C10686a aVar, C10683g gVar) {
        this.f20387k.mo33680b(aVar, gVar);
    }

    /* renamed from: W */
    public boolean mo33711W() {
        return this.f20387k.mo33681c();
    }

    /* renamed from: X */
    public void mo33712X() {
        long currentTimeMillis = System.currentTimeMillis();
        for (C10620b next : mo33715c0().mo33489c()) {
            try {
                C10637h hVar = (C10637h) next;
                if (hVar.mo33532j(currentTimeMillis)) {
                    mo33746x1(currentTimeMillis, hVar, C10664h.Remove);
                    mo33715c0().mo33498j(hVar);
                } else if (hVar.mo33606G(currentTimeMillis)) {
                    mo33732n1(hVar);
                }
            } catch (Exception e) {
                Logger logger = f20375u;
                Level level = Level.SEVERE;
                logger.log(level, mo33731n0() + ".Error while reaping records: " + next, e);
                f20375u.severe(toString());
            }
        }
    }

    /* renamed from: Y0 */
    public boolean mo33713Y0() {
        return this.f20387k.mo33696v();
    }

    /* renamed from: a */
    public void mo33654a() {
        C10648j.C10651b a = C10648j.C10651b.m26177a();
        mo33718e0();
        a.mo33671b(this).mo33654a();
    }

    /* renamed from: a0 */
    public boolean mo33714a0() {
        return this.f20387k.mo33682d();
    }

    /* renamed from: b */
    public void mo33655b() {
        C10648j.C10651b a = C10648j.C10651b.m26177a();
        mo33718e0();
        a.mo33671b(this).mo33655b();
    }

    /* renamed from: c0 */
    public C10617a mo33715c0() {
        return this.f20382f;
    }

    public void close() {
        if (!mo33719e1()) {
            if (f20375u.isLoggable(Level.FINER)) {
                Logger logger = f20375u;
                logger.finer("Cancelling JmDNS: " + this);
            }
            if (mo33714a0()) {
                f20375u.finer("Canceling the timer");
                mo33658i();
                mo33454M();
                m26217b0();
                if (f20375u.isLoggable(Level.FINER)) {
                    Logger logger2 = f20375u;
                    logger2.finer("Wait for JmDNS cancel: " + this);
                }
                mo33750z1(5000);
                f20375u.finer("Canceling the state timer");
                mo33655b();
                this.f20391o.shutdown();
                m26216Z();
                if (this.f20386j != null) {
                    Runtime.getRuntime().removeShutdownHook(this.f20386j);
                }
                if (f20375u.isLoggable(Level.FINER)) {
                    f20375u.finer("JmDNS closed.");
                }
            }
            mo33627j((C10686a) null);
        }
    }

    /* renamed from: d0 */
    public C10607a.C10608a mo33717d0() {
        return this.f20385i;
    }

    /* renamed from: e0 */
    public C10656l mo33718e0() {
        return this;
    }

    /* renamed from: e1 */
    public boolean mo33719e1() {
        return this.f20387k.mo33698x();
    }

    /* renamed from: f0 */
    public InetAddress mo33720f0() {
        return this.f20377a;
    }

    /* renamed from: f1 */
    public boolean mo33721f1() {
        return this.f20387k.mo33699y();
    }

    /* renamed from: g */
    public void mo33656g(String str) {
        C10648j.C10651b a = C10648j.C10651b.m26177a();
        mo33718e0();
        a.mo33671b(this).mo33656g(str);
    }

    /* renamed from: h */
    public void mo33657h(C10621c cVar, int i) {
        C10648j.C10651b a = C10648j.C10651b.m26177a();
        mo33718e0();
        a.mo33671b(this).mo33657h(cVar, i);
    }

    /* renamed from: i */
    public void mo33658i() {
        C10648j.C10651b a = C10648j.C10651b.m26177a();
        mo33718e0();
        a.mo33671b(this).mo33658i();
    }

    /* renamed from: i1 */
    public void mo33722i1() {
        Logger logger = f20375u;
        logger.finer(mo33731n0() + "recover()");
        if (!mo33719e1() && !isClosed() && !mo33713Y0() && !mo33709S0()) {
            synchronized (this.f20396t) {
                if (mo33711W()) {
                    Logger logger2 = f20375u;
                    logger2.finer(mo33731n0() + "recover() thread " + Thread.currentThread().getName());
                    StringBuilder sb = new StringBuilder();
                    sb.append(mo33731n0());
                    sb.append(".recover()");
                    new C10662f(sb.toString()).start();
                }
            }
        }
    }

    public boolean isClosed() {
        return this.f20387k.mo33697w();
    }

    /* renamed from: j */
    public boolean mo33627j(C10686a aVar) {
        return this.f20387k.mo33627j(aVar);
    }

    /* renamed from: j0 */
    public InetAddress mo33724j0() {
        return this.f20378b.getInterface();
    }

    /* renamed from: j1 */
    public boolean mo33725j1() {
        return this.f20387k.mo33673B();
    }

    /* renamed from: k0 */
    public long mo33726k0() {
        return this.f20390n;
    }

    /* renamed from: k1 */
    public boolean mo33727k1(String str) {
        String str2;
        String str3;
        boolean z;
        C10666j jVar;
        String str4;
        Map<C10613d.C10614a, String> Y = C10673p.m26319Y(str);
        String str5 = Y.get(C10613d.C10614a.Domain);
        String str6 = Y.get(C10613d.C10614a.Protocol);
        String str7 = Y.get(C10613d.C10614a.Application);
        String str8 = Y.get(C10613d.C10614a.Subtype);
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
        if (f20375u.isLoggable(Level.FINE)) {
            Logger logger = f20375u;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(mo33731n0());
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
        if (this.f20384h.containsKey(lowerCase) || str7.toLowerCase().equals("dns-sd") || str5.toLowerCase().endsWith("in-addr.arpa") || str5.toLowerCase().endsWith("ip6.arpa")) {
            z = false;
        } else {
            z = this.f20384h.putIfAbsent(lowerCase, new C10666j(sb2)) == null;
            if (z) {
                Set<C10668m.C10670b> set = this.f20381e;
                C10668m.C10670b[] bVarArr = (C10668m.C10670b[]) set.toArray(new C10668m.C10670b[set.size()]);
                C10672o oVar = new C10672o(this, sb2, "", (C10613d) null);
                for (C10668m.C10670b bVar : bVarArr) {
                    this.f20391o.submit(new C10658b(bVar, oVar));
                }
            }
        }
        if (str8.length() <= 0 || (jVar = (C10666j) this.f20384h.get(lowerCase)) == null || jVar.mo33760c(str8)) {
            return z;
        }
        synchronized (jVar) {
            if (!jVar.mo33760c(str8)) {
                jVar.mo33758a(str8);
                C10668m.C10670b[] bVarArr2 = (C10668m.C10670b[]) this.f20381e.toArray(new C10668m.C10670b[this.f20381e.size()]);
                C10672o oVar2 = new C10672o(this, "_" + str8 + "._sub." + sb2, "", (C10613d) null);
                for (C10668m.C10670b cVar : bVarArr2) {
                    this.f20391o.submit(new C10659c(cVar, oVar2));
                }
            } else {
                z2 = z;
            }
        }
        return z2;
    }

    /* renamed from: l1 */
    public void mo33728l1(C10686a aVar) {
        this.f20387k.mo33674C(aVar);
    }

    /* renamed from: m0 */
    public C10653k mo33729m0() {
        return this.f20387k;
    }

    /* renamed from: m1 */
    public void mo33730m1(C10624d dVar) {
        this.f20379c.remove(dVar);
    }

    /* renamed from: n */
    public void mo33659n() {
        C10648j.C10651b a = C10648j.C10651b.m26177a();
        mo33718e0();
        a.mo33671b(this).mo33659n();
    }

    /* renamed from: n0 */
    public String mo33731n0() {
        return this.f20395s;
    }

    /* renamed from: n1 */
    public void mo33732n1(C10637h hVar) {
        C10613d A = hVar.mo33600A();
        if (this.f20394r.containsKey(A.mo33483x().toLowerCase())) {
            mo33656g(A.mo33483x());
        }
    }

    /* renamed from: o */
    public void mo33660o() {
        C10648j.C10651b a = C10648j.C10651b.m26177a();
        mo33718e0();
        a.mo33671b(this).mo33660o();
    }

    /* renamed from: o1 */
    public void mo33733o1(String str, String str2, boolean z, long j) {
        m26214A1(mo33734p1(str, str2, "", z), j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public C10673p mo33734p1(String str, String str2, String str3, boolean z) {
        mo33712X();
        String lowerCase = str.toLowerCase();
        mo33727k1(str);
        if (this.f20394r.putIfAbsent(lowerCase, new C10665i(str)) == null) {
            m26215T(lowerCase, (C10615e) this.f20394r.get(lowerCase), true);
        }
        C10673p r0 = mo33736r0(str, str2, str3, z);
        mo33653D(r0);
        return r0;
    }

    /* renamed from: q1 */
    public void mo33735q1(C10621c cVar) {
        mo33703G0();
        try {
            if (this.f20393q == cVar) {
                this.f20393q = null;
            }
        } finally {
            mo33704I0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public C10673p mo33736r0(String str, String str2, String str3, boolean z) {
        C10673p pVar;
        String str4;
        C10613d B;
        C10613d B2;
        C10613d B3;
        C10613d B4;
        String str5 = str;
        C10673p pVar2 = new C10673p(str5, str2, str3, 0, 0, 0, z, (byte[]) null);
        C10620b e = mo33715c0().mo33492e(new C10637h.C10642e(str5, C10680d.CLASS_ANY, false, 0, pVar2.mo33479t()));
        if (!(e instanceof C10637h) || (pVar = (C10673p) ((C10637h) e).mo33601B(z)) == null) {
            return pVar2;
        }
        Map<C10613d.C10614a, String> h0 = pVar.mo33810h0();
        byte[] bArr = null;
        C10620b d = mo33715c0().mo33491d(pVar2.mo33479t(), C10681e.TYPE_SRV, C10680d.CLASS_ANY);
        if (!(d instanceof C10637h) || (B4 = ((C10637h) d).mo33601B(z)) == null) {
            str4 = "";
        } else {
            pVar = new C10673p(h0, B4.mo33474o(), B4.mo33484y(), B4.mo33475p(), z, (byte[]) null);
            bArr = B4.mo33482w();
            str4 = B4.mo33480u();
        }
        C10620b d2 = mo33715c0().mo33491d(str4, C10681e.TYPE_A, C10680d.CLASS_ANY);
        if ((d2 instanceof C10637h) && (B3 = ((C10637h) d2).mo33601B(z)) != null) {
            for (Inet4Address D : B3.mo33470f()) {
                pVar.mo33792D(D);
            }
            pVar.mo33790B(B3.mo33482w());
        }
        C10620b d3 = mo33715c0().mo33491d(str4, C10681e.TYPE_AAAA, C10680d.CLASS_ANY);
        if ((d3 instanceof C10637h) && (B2 = ((C10637h) d3).mo33601B(z)) != null) {
            for (Inet6Address E : B2.mo33471k()) {
                pVar.mo33793E(E);
            }
            pVar.mo33790B(B2.mo33482w());
        }
        C10620b d4 = mo33715c0().mo33491d(pVar.mo33479t(), C10681e.TYPE_TXT, C10680d.CLASS_ANY);
        if ((d4 instanceof C10637h) && (B = ((C10637h) d4).mo33601B(z)) != null) {
            pVar.mo33790B(B.mo33482w());
        }
        if (pVar.mo33482w().length == 0) {
            pVar.mo33790B(bArr);
        }
        return pVar.mo33485z() ? pVar : pVar2;
    }

    /* renamed from: r1 */
    public boolean mo33737r1() {
        return this.f20387k.mo33675D();
    }

    /* renamed from: s */
    public void mo33661s() {
        C10648j.C10651b a = C10648j.C10651b.m26177a();
        mo33718e0();
        a.mo33671b(this).mo33661s();
    }

    /* renamed from: s1 */
    public void mo33738s1(C10626f fVar) {
        if (!fVar.mo33571l()) {
            byte[] y = fVar.mo33585y();
            DatagramPacket datagramPacket = new DatagramPacket(y, y.length, this.f20377a, C10677a.f20461a);
            if (f20375u.isLoggable(Level.FINEST)) {
                try {
                    C10621c cVar = new C10621c(datagramPacket);
                    if (f20375u.isLoggable(Level.FINEST)) {
                        Logger logger = f20375u;
                        logger.finest("send(" + mo33731n0() + ") JmDNS out:" + cVar.mo33552y(true));
                    }
                } catch (IOException e) {
                    Logger logger2 = f20375u;
                    String cls = C10656l.class.toString();
                    logger2.throwing(cls, "send(" + mo33731n0() + ") - JmDNS can not parse what it sends!!!", e);
                }
            }
            MulticastSocket multicastSocket = this.f20378b;
            if (multicastSocket != null && !multicastSocket.isClosed()) {
                multicastSocket.send(datagramPacket);
            }
        }
    }

    /* renamed from: t */
    public void mo33662t() {
        C10648j.C10651b a = C10648j.C10651b.m26177a();
        mo33718e0();
        a.mo33671b(this).mo33662t();
    }

    /* renamed from: t1 */
    public void mo33739t1(long j) {
        this.f20390n = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(2048);
        sb.append("\t---- Local Host -----");
        sb.append("\n\t");
        sb.append(this.f20387k);
        sb.append("\n\t---- Services -----");
        for (String str : this.f20383g.keySet()) {
            sb.append("\n\t\tService: ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.f20383g.get(str));
        }
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append("\t---- Types ----");
        for (String str2 : this.f20384h.keySet()) {
            C10666j jVar = (C10666j) this.f20384h.get(str2);
            sb.append("\n\t\tType: ");
            sb.append(jVar.mo33762d());
            sb.append(": ");
            sb.append(jVar.isEmpty() ? "no subtypes" : jVar);
        }
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append(this.f20382f.toString());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append("\t---- Service Collectors ----");
        for (String str3 : this.f20394r.keySet()) {
            sb.append("\n\t\tService Collector: ");
            sb.append(str3);
            sb.append(": ");
            sb.append(this.f20394r.get(str3));
        }
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append("\t---- Service Listeners ----");
        for (String str4 : this.f20380d.keySet()) {
            sb.append("\n\t\tService Listener: ");
            sb.append(str4);
            sb.append(": ");
            sb.append(this.f20380d.get(str4));
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void mo33663u() {
        C10648j.C10651b a = C10648j.C10651b.m26177a();
        mo33718e0();
        a.mo33671b(this).mo33663u();
    }

    /* renamed from: u0 */
    public Map<String, C10666j> mo33741u0() {
        return this.f20384h;
    }

    /* renamed from: u1 */
    public void mo33742u1(int i) {
        this.f20389m = i;
    }

    /* renamed from: v0 */
    public Map<String, C10613d> mo33743v0() {
        return this.f20383g;
    }

    /* renamed from: w0 */
    public MulticastSocket mo33744w0() {
        return this.f20378b;
    }

    /* renamed from: x0 */
    public int mo33745x0() {
        return this.f20389m;
    }

    /* renamed from: x1 */
    public void mo33746x1(long j, C10637h hVar, C10664h hVar2) {
        ArrayList<C10624d> arrayList;
        List<C10668m.C10669a> list;
        synchronized (this.f20379c) {
            arrayList = new ArrayList<>(this.f20379c);
        }
        for (C10624d a : arrayList) {
            a.mo33559a(mo33715c0(), j, hVar);
        }
        if (C10681e.TYPE_PTR.equals(hVar.mo33527f())) {
            C10612c z = hVar.mo33618z(this);
            if (z.mo33461c() == null || !z.mo33461c().mo33485z()) {
                C10673p r0 = mo33736r0(z.mo33464e(), z.mo33463d(), "", false);
                if (r0.mo33485z()) {
                    z = new C10672o(this, z.mo33464e(), z.mo33463d(), r0);
                }
            }
            List list2 = (List) this.f20380d.get(z.mo33464e().toLowerCase());
            if (list2 != null) {
                synchronized (list2) {
                    list = new ArrayList<>(list2);
                }
            } else {
                list = Collections.emptyList();
            }
            if (f20375u.isLoggable(Level.FINEST)) {
                Logger logger = f20375u;
                logger.finest(mo33731n0() + ".updating record for event: " + z + " list " + list + " operation: " + hVar2);
            }
            if (!list.isEmpty()) {
                int i = C10663g.f20413a[hVar2.ordinal()];
                if (i == 1) {
                    for (C10668m.C10669a aVar : list) {
                        if (aVar.mo33777b()) {
                            aVar.mo33781d(z);
                        } else {
                            this.f20391o.submit(new C10660d(aVar, z));
                        }
                    }
                } else if (i == 2) {
                    for (C10668m.C10669a aVar2 : list) {
                        if (aVar2.mo33777b()) {
                            aVar2.mo33782e(z);
                        } else {
                            this.f20391o.submit(new C10661e(aVar2, z));
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo33747y0(C10621c cVar, InetAddress inetAddress, int i) {
        if (f20375u.isLoggable(Level.FINE)) {
            Logger logger = f20375u;
            logger.fine(mo33731n0() + ".handle query: " + cVar);
        }
        boolean z = false;
        long currentTimeMillis = System.currentTimeMillis() + 120;
        for (C10637h D : cVar.mo33561b()) {
            z |= D.mo33603D(this, currentTimeMillis);
        }
        mo33703G0();
        try {
            if (this.f20393q != null) {
                this.f20393q.mo33548u(cVar);
            } else {
                C10621c v = cVar.clone();
                if (cVar.mo33574o()) {
                    this.f20393q = v;
                }
                mo33657h(v, i);
            }
            mo33704I0();
            long currentTimeMillis2 = System.currentTimeMillis();
            for (C10637h z0 : cVar.mo33562c()) {
                mo33749z0(z0, currentTimeMillis2);
            }
            if (z) {
                mo33661s();
            }
        } catch (Throwable th) {
            mo33704I0();
            throw th;
        }
    }

    /* renamed from: y1 */
    public boolean mo33748y1(long j) {
        return this.f20387k.mo33677F(j);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f6, code lost:
        if (r1 == false) goto L_0x00f8;
     */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33749z0(p154d.p198a.p199g.C10637h r8, long r9) {
        /*
            r7 = this;
            d.a.g.l$h r0 = p154d.p198a.p199g.C10656l.C10664h.Noop
            boolean r1 = r8.mo33532j(r9)
            java.util.logging.Logger r2 = f20375u
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            boolean r2 = r2.isLoggable(r3)
            if (r2 == 0) goto L_0x002d
            java.util.logging.Logger r2 = f20375u
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r7.mo33731n0()
            r3.append(r4)
            java.lang.String r4 = " handle response: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2.fine(r3)
        L_0x002d:
            boolean r2 = r8.mo33537o()
            if (r2 != 0) goto L_0x0101
            boolean r2 = r8.mo33531i()
            if (r2 != 0) goto L_0x0101
            boolean r2 = r8.mo33538p()
            d.a.g.a r3 = r7.mo33715c0()
            d.a.g.b r3 = r3.mo33492e(r8)
            d.a.g.h r3 = (p154d.p198a.p199g.C10637h) r3
            java.util.logging.Logger r4 = f20375u
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            boolean r4 = r4.isLoggable(r5)
            if (r4 == 0) goto L_0x006e
            java.util.logging.Logger r4 = f20375u
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r7.mo33731n0()
            r5.append(r6)
            java.lang.String r6 = " handle response cached record: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.fine(r5)
        L_0x006e:
            if (r2 == 0) goto L_0x00b0
            d.a.g.a r2 = r7.mo33715c0()
            java.lang.String r4 = r8.mo33522b()
            java.util.Collection r2 = r2.mo33494f(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0080:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00b0
            java.lang.Object r4 = r2.next()
            d.a.g.b r4 = (p154d.p198a.p199g.C10620b) r4
            d.a.g.r.e r5 = r8.mo33527f()
            d.a.g.r.e r6 = r4.mo33527f()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0080
            d.a.g.r.d r5 = r8.mo33525e()
            d.a.g.r.d r6 = r4.mo33525e()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0080
            if (r4 == r3) goto L_0x0080
            d.a.g.h r4 = (p154d.p198a.p199g.C10637h) r4
            r4.mo33611L(r9)
            goto L_0x0080
        L_0x00b0:
            if (r3 == 0) goto L_0x00f6
            if (r1 == 0) goto L_0x00ca
            int r0 = r8.mo33602C()
            if (r0 != 0) goto L_0x00c0
            d.a.g.l$h r0 = p154d.p198a.p199g.C10656l.C10664h.Noop
            r3.mo33611L(r9)
            goto L_0x0101
        L_0x00c0:
            d.a.g.l$h r0 = p154d.p198a.p199g.C10656l.C10664h.Remove
            d.a.g.a r2 = r7.mo33715c0()
            r2.mo33498j(r3)
            goto L_0x0101
        L_0x00ca:
            boolean r2 = r8.mo33609J(r3)
            if (r2 == 0) goto L_0x00e6
            boolean r2 = r8.mo33541s(r3)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = r8.mo33528g()
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x00e1
            goto L_0x00e6
        L_0x00e1:
            r3.mo33607H(r8)
            r8 = r3
            goto L_0x0101
        L_0x00e6:
            boolean r0 = r8.mo33605F()
            if (r0 == 0) goto L_0x00f8
            d.a.g.l$h r0 = p154d.p198a.p199g.C10656l.C10664h.Update
            d.a.g.a r2 = r7.mo33715c0()
            r2.mo33499k(r8, r3)
            goto L_0x0101
        L_0x00f6:
            if (r1 != 0) goto L_0x0101
        L_0x00f8:
            d.a.g.l$h r0 = p154d.p198a.p199g.C10656l.C10664h.Add
            d.a.g.a r2 = r7.mo33715c0()
            r2.mo33488b(r8)
        L_0x0101:
            d.a.g.r.e r2 = r8.mo33527f()
            d.a.g.r.e r3 = p154d.p198a.p199g.p200r.C10681e.TYPE_PTR
            if (r2 != r3) goto L_0x012d
            boolean r2 = r8.mo33537o()
            if (r2 == 0) goto L_0x011b
            if (r1 != 0) goto L_0x011a
            d.a.g.h$e r8 = (p154d.p198a.p199g.C10637h.C10642e) r8
            java.lang.String r8 = r8.mo33621P()
            r7.mo33727k1(r8)
        L_0x011a:
            return
        L_0x011b:
            java.lang.String r1 = r8.mo33523c()
            boolean r1 = r7.mo33727k1(r1)
            r1 = r1 | 0
            if (r1 == 0) goto L_0x012d
            d.a.g.l$h r1 = p154d.p198a.p199g.C10656l.C10664h.Noop
            if (r0 != r1) goto L_0x012d
            d.a.g.l$h r0 = p154d.p198a.p199g.C10656l.C10664h.RegisterServiceType
        L_0x012d:
            d.a.g.l$h r1 = p154d.p198a.p199g.C10656l.C10664h.Noop
            if (r0 == r1) goto L_0x0134
            r7.mo33746x1(r9, r8, r0)
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10656l.mo33749z0(d.a.g.h, long):void");
    }

    /* renamed from: z1 */
    public boolean mo33750z1(long j) {
        return this.f20387k.mo33678G(j);
    }
}
