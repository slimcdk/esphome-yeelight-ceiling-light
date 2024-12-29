package p152e6;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: e6.b */
public class C9001b {

    /* renamed from: a */
    protected static Properties f16496a = new Properties();

    /* renamed from: b */
    public static String f16497b;

    /* renamed from: c */
    public static boolean f16498c;

    /* renamed from: d */
    private static final ConcurrentMap<String, C9003c> f16499d = new ConcurrentHashMap();

    /* renamed from: e */
    private static C9003c f16500e;

    /* renamed from: f */
    private static boolean f16501f;

    /* renamed from: e6.b$a */
    static class C9002a implements PrivilegedAction<Object> {
        C9002a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object run() {
            /*
                r7 = this;
                java.lang.Class<e6.b> r0 = p152e6.C9001b.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.lang.String r1 = "jetty-logging.properties"
                java.net.URL r0 = r0.getResource(r1)
                r1 = 0
                if (r0 == 0) goto L_0x0045
                java.io.InputStream r2 = r0.openStream()     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
                java.util.Properties r3 = p152e6.C9001b.f16496a     // Catch:{ IOException -> 0x001f }
                r3.load(r2)     // Catch:{ IOException -> 0x001f }
            L_0x0018:
                org.eclipse.jetty.util.C9985i.m24686a(r2)
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
                org.eclipse.jetty.util.C9985i.m24686a(r1)
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
                java.util.Properties r4 = p152e6.C9001b.f16496a
                r4.setProperty(r2, r3)
                goto L_0x004d
            L_0x0065:
                java.util.Properties r0 = p152e6.C9001b.f16496a
                java.lang.String r2 = "org.eclipse.jetty.util.log.class"
                java.lang.String r3 = "org.eclipse.jetty.util.log.Slf4jLog"
                java.lang.String r0 = r0.getProperty(r2, r3)
                p152e6.C9001b.f16497b = r0
                java.util.Properties r0 = p152e6.C9001b.f16496a
                java.lang.String r2 = "org.eclipse.jetty.util.log.IGNORED"
                java.lang.String r3 = "false"
                java.lang.String r0 = r0.getProperty(r2, r3)
                boolean r0 = java.lang.Boolean.parseBoolean(r0)
                p152e6.C9001b.f16498c = r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p152e6.C9001b.C9002a.run():java.lang.Object");
        }
    }

    static {
        AccessController.doPrivileged(new C9002a());
    }

    /* renamed from: a */
    public static C9003c m21450a(Class<?> cls) {
        return m21451b(cls.getName());
    }

    /* renamed from: b */
    public static C9003c m21451b(String str) {
        if (!m21456g()) {
            return null;
        }
        if (str == null) {
            return f16500e;
        }
        C9003c cVar = (C9003c) f16499d.get(str);
        return cVar == null ? f16500e.getLogger(str) : cVar;
    }

    /* renamed from: c */
    public static Map<String, C9003c> m21452c() {
        return Collections.unmodifiableMap(f16499d);
    }

    /* renamed from: d */
    static ConcurrentMap<String, C9003c> m21453d() {
        return f16499d;
    }

    /* renamed from: e */
    public static C9003c m21454e() {
        m21456g();
        return f16500e;
    }

    /* renamed from: f */
    private static void m21455f(Throwable th) {
        if (th != null && f16498c) {
            th.printStackTrace();
        }
        if (f16500e == null) {
            C9004d dVar = new C9004d();
            f16500e = dVar;
            dVar.mo36850e("Logging to {} via {}", dVar, C9004d.class.getName());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0 = org.eclipse.jetty.util.C9990j.m24694b(r0, f16497b);
        r1 = f16500e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        if (r1 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        if (r1.getClass().equals(r0) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        r1 = (p152e6.C9003c) r0.newInstance();
        f16500e = r1;
        r1.mo36850e("Logging to {} via {}", r1, r0.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        m21455f(r0);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m21456g() {
        /*
            java.lang.Class<e6.b> r0 = p152e6.C9001b.class
            e6.c r1 = f16500e
            r2 = 1
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            monitor-enter(r0)
            boolean r1 = f16501f     // Catch:{ all -> 0x0051 }
            r3 = 0
            if (r1 == 0) goto L_0x0016
            e6.c r1 = f16500e     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r2
        L_0x0016:
            f16501f = r2     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = f16497b     // Catch:{ all -> 0x0046 }
            java.lang.Class r0 = org.eclipse.jetty.util.C9990j.m24694b(r0, r1)     // Catch:{ all -> 0x0046 }
            e6.c r1 = f16500e     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x002d
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0046 }
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x004a
        L_0x002d:
            java.lang.Object r1 = r0.newInstance()     // Catch:{ all -> 0x0046 }
            e6.c r1 = (p152e6.C9003c) r1     // Catch:{ all -> 0x0046 }
            f16500e = r1     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "Logging to {} via {}"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0046 }
            r5[r3] = r1     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0046 }
            r5[r2] = r0     // Catch:{ all -> 0x0046 }
            r1.mo36850e(r4, r5)     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            m21455f(r0)
        L_0x004a:
            e6.c r0 = f16500e
            if (r0 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            return r2
        L_0x0051:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p152e6.C9001b.m21456g():boolean");
    }
}
