package p164h.p211a.p212a.p228h.p234y;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: h.a.a.h.y.b */
public class C11156b {

    /* renamed from: a */
    protected static Properties f22094a = new Properties();

    /* renamed from: b */
    public static String f22095b;

    /* renamed from: c */
    public static boolean f22096c;

    /* renamed from: d */
    private static final ConcurrentMap<String, C11158c> f22097d = new ConcurrentHashMap();

    /* renamed from: e */
    private static C11158c f22098e;

    /* renamed from: f */
    private static boolean f22099f;

    /* renamed from: h.a.a.h.y.b$a */
    static class C11157a implements PrivilegedAction<Object> {
        C11157a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object run() {
            /*
                r7 = this;
                java.lang.Class<h.a.a.h.y.b> r0 = p164h.p211a.p212a.p228h.p234y.C11156b.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.lang.String r1 = "jetty-logging.properties"
                java.net.URL r0 = r0.getResource(r1)
                r1 = 0
                if (r0 == 0) goto L_0x0045
                java.io.InputStream r2 = r0.openStream()     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
                java.util.Properties r3 = p164h.p211a.p212a.p228h.p234y.C11156b.f22094a     // Catch:{ IOException -> 0x001f }
                r3.load(r2)     // Catch:{ IOException -> 0x001f }
            L_0x0018:
                p164h.p211a.p212a.p228h.C11121i.m28871a(r2)
                goto L_0x0045
            L_0x001c:
                r0 = move-exception
                r1 = r2
                goto L_0x0041
            L_0x001f:
                r3 = move-exception
                goto L_0x0025
            L_0x0021:
                r0 = move-exception
                goto L_0x0041
            L_0x0023:
                r3 = move-exception
                r2 = r1
            L_0x0025:
                java.io.PrintStream r4 = java.lang.System.err     // Catch:{ all -> 0x001c }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x001c }
                r5.<init>()     // Catch:{ all -> 0x001c }
                java.lang.String r6 = "Unable to load "
                r5.append(r6)     // Catch:{ all -> 0x001c }
                r5.append(r0)     // Catch:{ all -> 0x001c }
                java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x001c }
                r4.println(r0)     // Catch:{ all -> 0x001c }
                java.io.PrintStream r0 = java.lang.System.err     // Catch:{ all -> 0x001c }
                r3.printStackTrace(r0)     // Catch:{ all -> 0x001c }
                goto L_0x0018
            L_0x0041:
                p164h.p211a.p212a.p228h.C11121i.m28871a(r1)
                throw r0
            L_0x0045:
                java.util.Properties r0 = java.lang.System.getProperties()
                java.util.Enumeration r0 = r0.propertyNames()
            L_0x004d:
                boolean r2 = r0.hasMoreElements()
                if (r2 == 0) goto L_0x0065
                java.lang.Object r2 = r0.nextElement()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r3 = java.lang.System.getProperty(r2)
                if (r3 == 0) goto L_0x004d
                java.util.Properties r4 = p164h.p211a.p212a.p228h.p234y.C11156b.f22094a
                r4.setProperty(r2, r3)
                goto L_0x004d
            L_0x0065:
                java.util.Properties r0 = p164h.p211a.p212a.p228h.p234y.C11156b.f22094a
                java.lang.String r2 = "org.eclipse.jetty.util.log.class"
                java.lang.String r3 = "org.eclipse.jetty.util.log.Slf4jLog"
                java.lang.String r0 = r0.getProperty(r2, r3)
                p164h.p211a.p212a.p228h.p234y.C11156b.f22095b = r0
                java.util.Properties r0 = p164h.p211a.p212a.p228h.p234y.C11156b.f22094a
                java.lang.String r2 = "org.eclipse.jetty.util.log.IGNORED"
                java.lang.String r3 = "false"
                java.lang.String r0 = r0.getProperty(r2, r3)
                boolean r0 = java.lang.Boolean.parseBoolean(r0)
                p164h.p211a.p212a.p228h.p234y.C11156b.f22096c = r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p228h.p234y.C11156b.C11157a.run():java.lang.Object");
        }
    }

    static {
        AccessController.doPrivileged(new C11157a());
    }

    /* renamed from: a */
    public static C11158c m29015a(Class<?> cls) {
        return m29016b(cls.getName());
    }

    /* renamed from: b */
    public static C11158c m29016b(String str) {
        if (!m29021g()) {
            return null;
        }
        if (str == null) {
            return f22098e;
        }
        C11158c cVar = (C11158c) f22097d.get(str);
        return cVar == null ? f22098e.mo35482f(str) : cVar;
    }

    /* renamed from: c */
    public static Map<String, C11158c> m29017c() {
        return Collections.unmodifiableMap(f22097d);
    }

    /* renamed from: d */
    static ConcurrentMap<String, C11158c> m29018d() {
        return f22097d;
    }

    /* renamed from: e */
    public static C11158c m29019e() {
        m29021g();
        return f22098e;
    }

    /* renamed from: f */
    private static void m29020f(Throwable th) {
        if (th != null && f22096c) {
            th.printStackTrace();
        }
        if (f22098e == null) {
            C11159d dVar = new C11159d();
            f22098e = dVar;
            dVar.mo35489e("Logging to {} via {}", dVar, C11159d.class.getName());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0 = p164h.p211a.p212a.p228h.C11127k.m28893b(r0, f22095b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        if (f22098e == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        if (f22098e.getClass().equals(r0) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        r1 = (p164h.p211a.p212a.p228h.p234y.C11158c) r0.newInstance();
        f22098e = r1;
        r1.mo35489e("Logging to {} via {}", r1, r0.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        m29020f(r0);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m29021g() {
        /*
            java.lang.Class<h.a.a.h.y.b> r0 = p164h.p211a.p212a.p228h.p234y.C11156b.class
            h.a.a.h.y.c r1 = f22098e
            r2 = 1
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            monitor-enter(r0)
            boolean r1 = f22099f     // Catch:{ all -> 0x0053 }
            r3 = 0
            if (r1 == 0) goto L_0x0016
            h.a.a.h.y.c r1 = f22098e     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return r2
        L_0x0016:
            f22099f = r2     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = f22095b     // Catch:{ all -> 0x0048 }
            java.lang.Class r0 = p164h.p211a.p212a.p228h.C11127k.m28893b(r0, r1)     // Catch:{ all -> 0x0048 }
            h.a.a.h.y.c r1 = f22098e     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x002f
            h.a.a.h.y.c r1 = f22098e     // Catch:{ all -> 0x0048 }
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x004c
        L_0x002f:
            java.lang.Object r1 = r0.newInstance()     // Catch:{ all -> 0x0048 }
            h.a.a.h.y.c r1 = (p164h.p211a.p212a.p228h.p234y.C11158c) r1     // Catch:{ all -> 0x0048 }
            f22098e = r1     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = "Logging to {} via {}"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0048 }
            r5[r3] = r1     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0048 }
            r5[r2] = r0     // Catch:{ all -> 0x0048 }
            r1.mo35489e(r4, r5)     // Catch:{ all -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r0 = move-exception
            m29020f(r0)
        L_0x004c:
            h.a.a.h.y.c r0 = f22098e
            if (r0 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            return r2
        L_0x0053:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p228h.p234y.C11156b.m29021g():boolean");
    }
}
