package p164h.p211a.p212a.p222f.p224w;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.commons.p271io.FilenameUtils;
import p154d.p155b.C10724j;
import p154d.p155b.C10727m;
import p154d.p155b.C10728n;
import p154d.p155b.C10729o;
import p154d.p155b.C10736v;
import p154d.p155b.C10738x;
import p154d.p155b.C4316d;
import p154d.p155b.p204f0.C10711e;
import p164h.p211a.p212a.p216c.C10920t;
import p164h.p211a.p212a.p222f.C11010b;
import p164h.p211a.p212a.p222f.C11030h;
import p164h.p211a.p212a.p222f.C11032i;
import p164h.p211a.p212a.p222f.C11037n;
import p164h.p211a.p212a.p222f.C11040p;
import p164h.p211a.p212a.p228h.C11100b;
import p164h.p211a.p212a.p228h.C11104c;
import p164h.p211a.p212a.p228h.C11126j;
import p164h.p211a.p212a.p228h.C11137q;
import p164h.p211a.p212a.p228h.C11138r;
import p164h.p211a.p212a.p228h.C11139s;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p233x.C11152d;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;
import p164h.p211a.p212a.p228h.p235z.C11165e;

/* renamed from: h.a.a.f.w.c */
public class C11052c extends C11060h implements C11100b, C11040p.C11041a {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public static final C11158c f21710S = C11156b.m29015a(C11052c.class);

    /* renamed from: T */
    private static final ThreadLocal<C11054b> f21711T = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C11158c f21712A;

    /* renamed from: B */
    private boolean f21713B;

    /* renamed from: G */
    private int f21714G;

    /* renamed from: H */
    private int f21715H;

    /* renamed from: I */
    private boolean f21716I;

    /* renamed from: J */
    private Object f21717J;

    /* renamed from: K */
    private Object f21718K;

    /* renamed from: L */
    private Object f21719L;

    /* renamed from: M */
    private Object f21720M;

    /* renamed from: N */
    private Map<String, Object> f21721N;

    /* renamed from: O */
    private String[] f21722O;

    /* renamed from: P */
    private boolean f21723P;

    /* renamed from: Q */
    private boolean f21724Q;

    /* renamed from: R */
    private volatile int f21725R;

    /* renamed from: n */
    protected C11054b f21726n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C11104c f21727o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C11104c f21728p;

    /* renamed from: q */
    private final Map<String, String> f21729q;

    /* renamed from: r */
    private ClassLoader f21730r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f21731s;

    /* renamed from: t */
    private String f21732t;

    /* renamed from: u */
    private C11165e f21733u;

    /* renamed from: v */
    private C10920t f21734v;

    /* renamed from: w */
    private C11056e f21735w;

    /* renamed from: x */
    private String[] f21736x;

    /* renamed from: y */
    private Set<String> f21737y;

    /* renamed from: z */
    private EventListener[] f21738z;

    /* renamed from: h.a.a.f.w.c$a */
    private static class C11053a implements C11152d {

        /* renamed from: a */
        final ClassLoader f21739a;

        C11053a(ClassLoader classLoader) {
            this.f21739a = classLoader;
        }

        /* JADX WARNING: type inference failed for: r1v7, types: [h.a.a.f.w.c$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: k0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo34187k0(java.lang.Appendable r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.ClassLoader r0 = r5.f21739a
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.Appendable r0 = r6.append(r0)
                java.lang.String r1 = "\n"
                r0.append(r1)
                java.lang.ClassLoader r0 = r5.f21739a
                if (r0 == 0) goto L_0x004f
                java.lang.ClassLoader r0 = r0.getParent()
                if (r0 == 0) goto L_0x004f
                boolean r1 = r0 instanceof p164h.p211a.p212a.p228h.p233x.C11152d
                if (r1 != 0) goto L_0x0023
                h.a.a.f.w.c$a r1 = new h.a.a.f.w.c$a
                r1.<init>(r0)
                r0 = r1
            L_0x0023:
                java.lang.ClassLoader r1 = r5.f21739a
                boolean r2 = r1 instanceof java.net.URLClassLoader
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0044
                r2 = 2
                java.util.Collection[] r2 = new java.util.Collection[r2]
                java.net.URLClassLoader r1 = (java.net.URLClassLoader) r1
                java.net.URL[] r1 = r1.getURLs()
                java.util.List r1 = p164h.p211a.p212a.p228h.C11138r.m28927a(r1)
                r2[r3] = r1
                java.util.Set r0 = java.util.Collections.singleton(r0)
                r2[r4] = r0
                p164h.p211a.p212a.p228h.p233x.C11146b.m28976B0(r6, r7, r2)
                goto L_0x004f
            L_0x0044:
                java.util.Collection[] r1 = new java.util.Collection[r4]
                java.util.Set r0 = java.util.Collections.singleton(r0)
                r1[r3] = r0
                p164h.p211a.p212a.p228h.p233x.C11146b.m28976B0(r6, r7, r1)
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.p224w.C11052c.C11053a.mo34187k0(java.lang.Appendable, java.lang.String):void");
        }
    }

    /* renamed from: h.a.a.f.w.c$b */
    public class C11054b implements C10727m {
        protected C11054b() {
        }

        /* renamed from: a */
        public synchronized Object mo33958a(String str) {
            Object a;
            a = C11052c.this.mo34251a(str);
            if (a == null && C11052c.this.f21728p != null) {
                a = C11052c.this.f21728p.mo34251a(str);
            }
            return a;
        }

        /* renamed from: b */
        public synchronized Enumeration mo35079b() {
            HashSet hashSet;
            hashSet = new HashSet();
            if (C11052c.this.f21728p != null) {
                Enumeration<String> d = C11052c.this.f21728p.mo35285d();
                while (d.hasMoreElements()) {
                    hashSet.add(d.nextElement());
                }
            }
            Enumeration<String> d2 = C11052c.this.f21727o.mo35285d();
            while (d2.hasMoreElements()) {
                hashSet.add(d2.nextElement());
            }
            return Collections.enumeration(hashSet);
        }

        /* renamed from: c */
        public C11052c mo35080c() {
            return C11052c.this;
        }

        /* renamed from: d */
        public String mo35081d(String str) {
            return C11052c.this.mo35052I(str);
        }

        /* renamed from: e */
        public String mo33959e() {
            return (C11052c.this.f21731s == null || !C11052c.this.f21731s.equals(MiotCloudImpl.COOKIE_PATH)) ? C11052c.this.f21731s : "";
        }

        /* renamed from: f */
        public Enumeration mo35082f() {
            return C11052c.this.mo35066k1();
        }

        /* renamed from: g */
        public C10724j mo35083g(String str) {
            String str2;
            if (str == null || !str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                return null;
            }
            try {
                int indexOf = str.indexOf(63);
                if (indexOf > 0) {
                    str2 = str.substring(indexOf + 1);
                    str = str.substring(0, indexOf);
                } else {
                    str2 = null;
                }
                return new C11030h(C11052c.this, C11139s.m28935a(mo33959e(), str), C11139s.m28936b(C11139s.m28938d(str)), str2);
            } catch (Exception e) {
                C11052c.f21710S.mo35488d(e);
                return null;
            }
        }

        /* renamed from: h */
        public void mo35084h(boolean z) {
        }

        public void log(String str, Throwable th) {
            C11052c.this.f21712A.mo35492h(str, th);
        }

        public String toString() {
            return "ServletContext@" + C11052c.this.toString();
        }
    }

    public C11052c() {
        this.f21731s = MiotCloudImpl.COOKIE_PATH;
        this.f21714G = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormKeys", 1000).intValue();
        this.f21715H = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormContentSize", 200000).intValue();
        this.f21716I = false;
        this.f21723P = false;
        this.f21724Q = true;
        this.f21726n = new C11054b();
        this.f21727o = new C11104c();
        this.f21728p = new C11104c();
        this.f21729q = new HashMap();
    }

    protected C11052c(C11054b bVar) {
        this.f21731s = MiotCloudImpl.COOKIE_PATH;
        this.f21714G = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormKeys", 1000).intValue();
        this.f21715H = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormContentSize", 200000).intValue();
        this.f21716I = false;
        this.f21723P = false;
        this.f21724Q = true;
        this.f21726n = bVar;
        this.f21727o = new C11104c();
        this.f21728p = new C11104c();
        this.f21729q = new HashMap();
    }

    /* renamed from: g1 */
    public static C11054b m28456g1() {
        return f21711T.get();
    }

    /* renamed from: r1 */
    private String m28457r1(String str) {
        if (str == null) {
            return null;
        }
        return str.endsWith(".") ? str.substring(0, str.length() - 1) : str;
    }

    /* renamed from: I */
    public String mo35052I(String str) {
        return this.f21729q.get(str);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: O0 */
    public void mo35053O0(java.lang.String r7, p164h.p211a.p212a.p222f.C11037n r8, p154d.p155b.p204f0.C10709c r9, p154d.p155b.p204f0.C10711e r10) {
        /*
            r6 = this;
            d.b.d r0 = r8.mo34931G()
            boolean r1 = r8.mo34938J0()
            if (r1 == 0) goto L_0x0047
            java.lang.Object r2 = r6.f21720M     // Catch:{ h -> 0x00c0 }
            r3 = 0
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r6.f21720M     // Catch:{ h -> 0x00c0 }
            int r2 = p164h.p211a.p212a.p228h.C11126j.m28890q(r2)     // Catch:{ h -> 0x00c0 }
            r4 = 0
        L_0x0016:
            if (r4 >= r2) goto L_0x0026
            java.lang.Object r5 = r6.f21720M     // Catch:{ h -> 0x00c0 }
            java.lang.Object r5 = p164h.p211a.p212a.p228h.C11126j.m28884j(r5, r4)     // Catch:{ h -> 0x00c0 }
            java.util.EventListener r5 = (java.util.EventListener) r5     // Catch:{ h -> 0x00c0 }
            r8.mo34978w(r5)     // Catch:{ h -> 0x00c0 }
            int r4 = r4 + 1
            goto L_0x0016
        L_0x0026:
            java.lang.Object r2 = r6.f21719L     // Catch:{ h -> 0x00c0 }
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r6.f21719L     // Catch:{ h -> 0x00c0 }
            int r2 = p164h.p211a.p212a.p228h.C11126j.m28890q(r2)     // Catch:{ h -> 0x00c0 }
            d.b.w r4 = new d.b.w     // Catch:{ h -> 0x00c0 }
            h.a.a.f.w.c$b r5 = r6.f21726n     // Catch:{ h -> 0x00c0 }
            r4.<init>(r5, r9)     // Catch:{ h -> 0x00c0 }
        L_0x0037:
            if (r3 >= r2) goto L_0x0047
            java.lang.Object r5 = r6.f21719L     // Catch:{ h -> 0x00c0 }
            java.lang.Object r5 = p164h.p211a.p212a.p228h.C11126j.m28884j(r5, r3)     // Catch:{ h -> 0x00c0 }
            d.b.x r5 = (p154d.p155b.C10738x) r5     // Catch:{ h -> 0x00c0 }
            r5.mo33980E(r4)     // Catch:{ h -> 0x00c0 }
            int r3 = r3 + 1
            goto L_0x0037
        L_0x0047:
            d.b.d r2 = p154d.p155b.C4316d.REQUEST     // Catch:{ h -> 0x00c0 }
            boolean r0 = r2.equals(r0)     // Catch:{ h -> 0x00c0 }
            if (r0 == 0) goto L_0x005e
            boolean r0 = r6.mo35071p1(r7)     // Catch:{ h -> 0x00c0 }
            if (r0 != 0) goto L_0x0056
            goto L_0x005e
        L_0x0056:
            h.a.a.c.h r7 = new h.a.a.c.h     // Catch:{ h -> 0x00c0 }
            r0 = 404(0x194, float:5.66E-43)
            r7.<init>(r0)     // Catch:{ h -> 0x00c0 }
            throw r7     // Catch:{ h -> 0x00c0 }
        L_0x005e:
            boolean r0 = r6.mo35099Q0()     // Catch:{ h -> 0x00c0 }
            if (r0 == 0) goto L_0x0068
            r6.mo35100R0(r7, r8, r9, r10)     // Catch:{ h -> 0x00c0 }
            goto L_0x0081
        L_0x0068:
            h.a.a.f.w.h r0 = r6.f21756l     // Catch:{ h -> 0x00c0 }
            if (r0 == 0) goto L_0x0078
            h.a.a.f.w.h r0 = r6.f21756l     // Catch:{ h -> 0x00c0 }
            h.a.a.f.i r2 = r6.f21753j     // Catch:{ h -> 0x00c0 }
            if (r0 != r2) goto L_0x0078
            h.a.a.f.w.h r0 = r6.f21756l     // Catch:{ h -> 0x00c0 }
            r0.mo35053O0(r7, r8, r9, r10)     // Catch:{ h -> 0x00c0 }
            goto L_0x0081
        L_0x0078:
            h.a.a.f.i r0 = r6.f21753j     // Catch:{ h -> 0x00c0 }
            if (r0 == 0) goto L_0x0081
            h.a.a.f.i r0 = r6.f21753j     // Catch:{ h -> 0x00c0 }
            r0.mo34757L(r7, r8, r9, r10)     // Catch:{ h -> 0x00c0 }
        L_0x0081:
            if (r1 == 0) goto L_0x0112
            java.lang.Object r7 = r6.f21719L
            if (r7 == 0) goto L_0x00a5
            d.b.w r7 = new d.b.w
            h.a.a.f.w.c$b r10 = r6.f21726n
            r7.<init>(r10, r9)
            java.lang.Object r9 = r6.f21719L
            int r9 = p164h.p211a.p212a.p228h.C11126j.m28890q(r9)
        L_0x0094:
            int r10 = r9 + -1
            if (r9 <= 0) goto L_0x00a5
            java.lang.Object r9 = r6.f21719L
            java.lang.Object r9 = p164h.p211a.p212a.p228h.C11126j.m28884j(r9, r10)
            d.b.x r9 = (p154d.p155b.C10738x) r9
            r9.mo33979A(r7)
            r9 = r10
            goto L_0x0094
        L_0x00a5:
            java.lang.Object r7 = r6.f21720M
            if (r7 == 0) goto L_0x0112
            int r7 = p164h.p211a.p212a.p228h.C11126j.m28890q(r7)
        L_0x00ad:
            int r9 = r7 + -1
            if (r7 <= 0) goto L_0x0112
            java.lang.Object r7 = r6.f21720M
            java.lang.Object r7 = p164h.p211a.p212a.p228h.C11126j.m28884j(r7, r9)
            java.util.EventListener r7 = (java.util.EventListener) r7
            r8.mo34960f0(r7)
            r7 = r9
            goto L_0x00ad
        L_0x00be:
            r7 = move-exception
            goto L_0x0113
        L_0x00c0:
            r7 = move-exception
            h.a.a.h.y.c r0 = f21710S     // Catch:{ all -> 0x00be }
            r0.mo35487c(r7)     // Catch:{ all -> 0x00be }
            r0 = 1
            r8.mo34969o0(r0)     // Catch:{ all -> 0x00be }
            int r0 = r7.mo34456b()     // Catch:{ all -> 0x00be }
            java.lang.String r7 = r7.mo34455a()     // Catch:{ all -> 0x00be }
            r10.mo33931c(r0, r7)     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x0112
            java.lang.Object r7 = r6.f21719L
            if (r7 == 0) goto L_0x00f9
            d.b.w r7 = new d.b.w
            h.a.a.f.w.c$b r10 = r6.f21726n
            r7.<init>(r10, r9)
            java.lang.Object r9 = r6.f21719L
            int r9 = p164h.p211a.p212a.p228h.C11126j.m28890q(r9)
        L_0x00e8:
            int r10 = r9 + -1
            if (r9 <= 0) goto L_0x00f9
            java.lang.Object r9 = r6.f21719L
            java.lang.Object r9 = p164h.p211a.p212a.p228h.C11126j.m28884j(r9, r10)
            d.b.x r9 = (p154d.p155b.C10738x) r9
            r9.mo33979A(r7)
            r9 = r10
            goto L_0x00e8
        L_0x00f9:
            java.lang.Object r7 = r6.f21720M
            if (r7 == 0) goto L_0x0112
            int r7 = p164h.p211a.p212a.p228h.C11126j.m28890q(r7)
        L_0x0101:
            int r9 = r7 + -1
            if (r7 <= 0) goto L_0x0112
            java.lang.Object r7 = r6.f21720M
            java.lang.Object r7 = p164h.p211a.p212a.p228h.C11126j.m28884j(r7, r9)
            java.util.EventListener r7 = (java.util.EventListener) r7
            r8.mo34960f0(r7)
            r7 = r9
            goto L_0x0101
        L_0x0112:
            return
        L_0x0113:
            if (r1 == 0) goto L_0x0150
            java.lang.Object r10 = r6.f21719L
            if (r10 == 0) goto L_0x0137
            d.b.w r10 = new d.b.w
            h.a.a.f.w.c$b r0 = r6.f21726n
            r10.<init>(r0, r9)
            java.lang.Object r9 = r6.f21719L
            int r9 = p164h.p211a.p212a.p228h.C11126j.m28890q(r9)
        L_0x0126:
            int r0 = r9 + -1
            if (r9 <= 0) goto L_0x0137
            java.lang.Object r9 = r6.f21719L
            java.lang.Object r9 = p164h.p211a.p212a.p228h.C11126j.m28884j(r9, r0)
            d.b.x r9 = (p154d.p155b.C10738x) r9
            r9.mo33979A(r10)
            r9 = r0
            goto L_0x0126
        L_0x0137:
            java.lang.Object r9 = r6.f21720M
            if (r9 == 0) goto L_0x0150
            int r9 = p164h.p211a.p212a.p228h.C11126j.m28890q(r9)
        L_0x013f:
            int r10 = r9 + -1
            if (r9 <= 0) goto L_0x0150
            java.lang.Object r9 = r6.f21720M
            java.lang.Object r9 = p164h.p211a.p212a.p228h.C11126j.m28884j(r9, r10)
            java.util.EventListener r9 = (java.util.EventListener) r9
            r8.mo34960f0(r9)
            r9 = r10
            goto L_0x013f
        L_0x0150:
            goto L_0x0152
        L_0x0151:
            throw r7
        L_0x0152:
            goto L_0x0151
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.p224w.C11052c.mo35053O0(java.lang.String, h.a.a.f.n, d.b.f0.c, d.b.f0.e):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00da A[Catch:{ all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd A[Catch:{ all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1 A[Catch:{ all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0119 A[Catch:{ all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011d A[Catch:{ all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35054P0(java.lang.String r18, p164h.p211a.p212a.p222f.C11037n r19, p154d.p155b.p204f0.C10709c r20, p154d.p155b.p204f0.C10711e r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            r0 = r20
            r3 = r21
            h.a.a.h.y.c r4 = f21710S
            boolean r4 = r4.mo35485a()
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 4
            r9 = 1
            if (r4 == 0) goto L_0x0032
            h.a.a.h.y.c r4 = f21710S
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r11 = r19.mo33917e()
            r10[r7] = r11
            java.lang.String r11 = r19.mo33927s()
            r10[r9] = r11
            java.lang.String r11 = r19.mo33920h()
            r10[r6] = r11
            r10[r5] = r1
            java.lang.String r11 = "scope {}|{}|{} @ {}"
            r4.mo35489e(r11, r10)
        L_0x0032:
            d.b.d r4 = r19.mo34931G()
            h.a.a.f.w.c$b r10 = r19.mo34929F()
            h.a.a.f.w.c$b r11 = r1.f21726n
            java.lang.String r12 = "/"
            if (r10 == r11) goto L_0x00a6
            d.b.d r11 = p154d.p155b.C4316d.REQUEST
            boolean r11 = r11.equals(r4)
            if (r11 != 0) goto L_0x0055
            d.b.d r11 = p154d.p155b.C4316d.ASYNC
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            r11 = r18
        L_0x0053:
            r14 = r11
            goto L_0x0092
        L_0x0055:
            boolean r11 = r1.f21716I
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = p164h.p211a.p212a.p228h.C11139s.m28937c(r18)
            goto L_0x0060
        L_0x005e:
            r11 = r18
        L_0x0060:
            boolean r14 = r1.mo35057a1(r11, r2, r3)
            if (r14 != 0) goto L_0x0067
            return
        L_0x0067:
            int r14 = r11.length()
            java.lang.String r15 = r1.f21731s
            int r15 = r15.length()
            if (r14 <= r15) goto L_0x0086
            java.lang.String r14 = r1.f21731s
            int r14 = r14.length()
            if (r14 <= r9) goto L_0x0053
            java.lang.String r14 = r1.f21731s
            int r14 = r14.length()
            java.lang.String r11 = r11.substring(r14)
            goto L_0x0053
        L_0x0086:
            java.lang.String r11 = r1.f21731s
            int r11 = r11.length()
            if (r11 != r9) goto L_0x0090
            r11 = r12
            goto L_0x0053
        L_0x0090:
            r11 = r12
            r14 = 0
        L_0x0092:
            java.lang.ClassLoader r15 = r1.f21730r
            if (r15 == 0) goto L_0x00a9
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r16 = r15.getContextClassLoader()
            java.lang.ClassLoader r5 = r1.f21730r
            r15.setContextClassLoader(r5)
            r5 = r16
            goto L_0x00ab
        L_0x00a6:
            r11 = r18
            r14 = r11
        L_0x00a9:
            r5 = 0
            r15 = 0
        L_0x00ab:
            java.lang.String r6 = r19.mo33917e()     // Catch:{ all -> 0x015d }
            java.lang.String r7 = r19.mo33927s()     // Catch:{ all -> 0x0157 }
            java.lang.String r8 = r19.mo33920h()     // Catch:{ all -> 0x0153 }
            h.a.a.f.w.c$b r13 = r1.f21726n     // Catch:{ all -> 0x0151 }
            r2.mo34966l0(r13)     // Catch:{ all -> 0x0151 }
            java.lang.ThreadLocal<h.a.a.f.w.c$b> r13 = f21711T     // Catch:{ all -> 0x0151 }
            h.a.a.f.w.c$b r9 = r1.f21726n     // Catch:{ all -> 0x0151 }
            r13.set(r9)     // Catch:{ all -> 0x0151 }
            d.b.d r9 = p154d.p155b.C4316d.INCLUDE     // Catch:{ all -> 0x0151 }
            boolean r4 = r9.equals(r4)     // Catch:{ all -> 0x0151 }
            if (r4 != 0) goto L_0x00e9
            boolean r4 = r11.startsWith(r12)     // Catch:{ all -> 0x0151 }
            if (r4 == 0) goto L_0x00e9
            java.lang.String r4 = r1.f21731s     // Catch:{ all -> 0x0151 }
            int r4 = r4.length()     // Catch:{ all -> 0x0151 }
            r9 = 1
            if (r4 != r9) goto L_0x00dd
            java.lang.String r4 = ""
            goto L_0x00df
        L_0x00dd:
            java.lang.String r4 = r1.f21731s     // Catch:{ all -> 0x0151 }
        L_0x00df:
            r2.mo34967m0(r4)     // Catch:{ all -> 0x0151 }
            r4 = 0
            r2.mo34926D0(r4)     // Catch:{ all -> 0x0151 }
            r2.mo34972r0(r14)     // Catch:{ all -> 0x0151 }
        L_0x00e9:
            h.a.a.h.y.c r4 = f21710S     // Catch:{ all -> 0x0151 }
            boolean r4 = r4.mo35485a()     // Catch:{ all -> 0x0151 }
            if (r4 == 0) goto L_0x0113
            h.a.a.h.y.c r4 = f21710S     // Catch:{ all -> 0x0151 }
            java.lang.String r9 = "context={}|{}|{} @ {}"
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x0151 }
            java.lang.String r13 = r19.mo33917e()     // Catch:{ all -> 0x0151 }
            r14 = 0
            r12[r14] = r13     // Catch:{ all -> 0x0151 }
            java.lang.String r13 = r19.mo33927s()     // Catch:{ all -> 0x0151 }
            r14 = 1
            r12[r14] = r13     // Catch:{ all -> 0x0151 }
            java.lang.String r13 = r19.mo33920h()     // Catch:{ all -> 0x0151 }
            r14 = 2
            r12[r14] = r13     // Catch:{ all -> 0x0151 }
            r13 = 3
            r12[r13] = r1     // Catch:{ all -> 0x0151 }
            r4.mo35489e(r9, r12)     // Catch:{ all -> 0x0151 }
        L_0x0113:
            boolean r4 = r17.mo35099Q0()     // Catch:{ all -> 0x0151 }
            if (r4 == 0) goto L_0x011d
            r1.mo35101S0(r11, r2, r0, r3)     // Catch:{ all -> 0x0151 }
            goto L_0x0134
        L_0x011d:
            h.a.a.f.w.h r4 = r1.f21756l     // Catch:{ all -> 0x0151 }
            if (r4 == 0) goto L_0x0127
            h.a.a.f.w.h r4 = r1.f21756l     // Catch:{ all -> 0x0151 }
            r4.mo35054P0(r11, r2, r0, r3)     // Catch:{ all -> 0x0151 }
            goto L_0x0134
        L_0x0127:
            h.a.a.f.w.h r4 = r1.f21755k     // Catch:{ all -> 0x0151 }
            if (r4 == 0) goto L_0x0131
            h.a.a.f.w.h r4 = r1.f21755k     // Catch:{ all -> 0x0151 }
            r4.mo35053O0(r11, r2, r0, r3)     // Catch:{ all -> 0x0151 }
            goto L_0x0134
        L_0x0131:
            r1.mo35053O0(r11, r2, r0, r3)     // Catch:{ all -> 0x0151 }
        L_0x0134:
            h.a.a.f.w.c$b r0 = r1.f21726n
            if (r10 == r0) goto L_0x0150
            java.lang.ClassLoader r0 = r1.f21730r
            if (r0 == 0) goto L_0x013f
            r15.setContextClassLoader(r5)
        L_0x013f:
            r2.mo34966l0(r10)
            java.lang.ThreadLocal<h.a.a.f.w.c$b> r0 = f21711T
            r0.set(r10)
            r2.mo34967m0(r6)
            r2.mo34926D0(r7)
            r2.mo34972r0(r8)
        L_0x0150:
            return
        L_0x0151:
            r0 = move-exception
            goto L_0x015b
        L_0x0153:
            r0 = move-exception
            r4 = 0
            r8 = r4
            goto L_0x015b
        L_0x0157:
            r0 = move-exception
            r4 = 0
            r7 = r4
            r8 = r7
        L_0x015b:
            r13 = r6
            goto L_0x0162
        L_0x015d:
            r0 = move-exception
            r4 = 0
            r7 = r4
            r8 = r7
            r13 = r8
        L_0x0162:
            h.a.a.f.w.c$b r3 = r1.f21726n
            if (r10 == r3) goto L_0x017e
            java.lang.ClassLoader r3 = r1.f21730r
            if (r3 == 0) goto L_0x016d
            r15.setContextClassLoader(r5)
        L_0x016d:
            r2.mo34966l0(r10)
            java.lang.ThreadLocal<h.a.a.f.w.c$b> r3 = f21711T
            r3.set(r10)
            r2.mo34967m0(r13)
            r2.mo34926D0(r7)
            r2.mo34972r0(r8)
        L_0x017e:
            goto L_0x0180
        L_0x017f:
            throw r0
        L_0x0180:
            goto L_0x017f
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.p224w.C11052c.mo35054P0(java.lang.String, h.a.a.f.n, d.b.f0.c, d.b.f0.e):void");
    }

    /* renamed from: Y0 */
    public void mo35055Y0(EventListener eventListener) {
        mo35076u1((EventListener[]) C11126j.m28881d(mo35065j1(), eventListener, EventListener.class));
    }

    /* renamed from: Z */
    public void mo34249Z() {
        Enumeration<String> d = this.f21727o.mo35285d();
        while (d.hasMoreElements()) {
            mo35058b1(d.nextElement(), (Object) null);
        }
        this.f21727o.mo34249Z();
    }

    /* renamed from: Z0 */
    public void mo35056Z0(C10729o oVar, C10728n nVar) {
        oVar.mo33961h(nVar);
        f21710S.mo35494j("started {}", this);
    }

    /* renamed from: a */
    public Object mo34251a(String str) {
        return this.f21727o.mo34251a(str);
    }

    /* renamed from: a1 */
    public boolean mo35057a1(String str, C11037n nVar, C10711e eVar) {
        String str2;
        String name;
        C4316d G = nVar.mo34931G();
        int i = this.f21725R;
        if (!(i == 0 || i == 2)) {
            if (i == 3) {
                nVar.mo34969o0(true);
                eVar.mo33933e(503);
            } else if (C4316d.REQUEST.equals(G) && nVar.mo34954Z()) {
                return false;
            } else {
                String[] strArr = this.f21736x;
                if (strArr != null && strArr.length > 0) {
                    String r1 = m28457r1(nVar.mo33972q());
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        String[] strArr2 = this.f21736x;
                        if (i2 >= strArr2.length) {
                            break;
                        }
                        String str3 = strArr2[i2];
                        if (str3 != null) {
                            if (str3.startsWith("*.")) {
                                z = str3.regionMatches(true, 2, r1, r1.indexOf(".") + 1, str3.length() - 2);
                            } else {
                                z = str3.equalsIgnoreCase(r1);
                            }
                        }
                        i2++;
                    }
                    if (!z) {
                        return false;
                    }
                }
                Set<String> set = this.f21737y;
                if (set != null && set.size() > 0 && ((name = C11010b.m28113o().mo34842n().getName()) == null || !this.f21737y.contains(name))) {
                    return false;
                }
                if (this.f21731s.length() > 1) {
                    if (!str.startsWith(this.f21731s)) {
                        return false;
                    }
                    if (str.length() > this.f21731s.length() && str.charAt(this.f21731s.length()) != '/') {
                        return false;
                    }
                    if (!this.f21713B && this.f21731s.length() == str.length()) {
                        nVar.mo34969o0(true);
                        if (nVar.mo33928t() != null) {
                            str2 = C11139s.m28935a(nVar.mo33929v(), MiotCloudImpl.COOKIE_PATH) + "?" + nVar.mo33928t();
                        } else {
                            str2 = C11139s.m28935a(nVar.mo33929v(), MiotCloudImpl.COOKIE_PATH);
                        }
                        eVar.mo33937n(str2);
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo34253b(String str, Object obj) {
        mo35058b1(str, obj);
        this.f21727o.mo34253b(str, obj);
    }

    /* renamed from: b1 */
    public void mo35058b1(String str, Object obj) {
        Map<String, Object> map = this.f21721N;
        if (map != null && map.containsKey(str)) {
            mo35077v1(str, obj);
        }
    }

    /* renamed from: c1 */
    public C11165e mo35059c1() {
        C11165e eVar = this.f21733u;
        if (eVar == null) {
            return null;
        }
        return eVar;
    }

    /* renamed from: d1 */
    public ClassLoader mo35060d1() {
        return this.f21730r;
    }

    /* renamed from: e */
    public void mo34256e(String str) {
        mo35058b1(str, (Object) null);
        this.f21727o.mo34256e(str);
    }

    /* renamed from: e1 */
    public String mo35061e1() {
        ClassLoader classLoader = this.f21730r;
        if (classLoader == null || !(classLoader instanceof URLClassLoader)) {
            return null;
        }
        URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < uRLs.length; i++) {
            try {
                File b = mo35072q1(uRLs[i]).mo35501b();
                if (b != null && b.exists()) {
                    if (sb.length() > 0) {
                        sb.append(File.pathSeparatorChar);
                    }
                    sb.append(b.getAbsolutePath());
                }
            } catch (IOException e) {
                f21710S.mo35487c(e);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: f1 */
    public String mo35062f1() {
        return this.f21731s;
    }

    /* renamed from: h1 */
    public String mo35063h1() {
        return this.f21732t;
    }

    /* renamed from: i */
    public void mo34901i(C11040p pVar) {
        if (this.f21735w != null) {
            C11040p d = mo34900d();
            if (!(d == null || d == pVar)) {
                d.mo35003Q0().mo35467f(this, this.f21735w, (Object) null, XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, true);
            }
            super.mo34901i(pVar);
            if (!(pVar == null || pVar == d)) {
                pVar.mo35003Q0().mo35467f(this, (Object) null, this.f21735w, XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, true);
            }
            this.f21735w.mo34901i(pVar);
            return;
        }
        super.mo34901i(pVar);
    }

    /* renamed from: i1 */
    public C11056e mo35064i1() {
        return this.f21735w;
    }

    /* renamed from: j1 */
    public EventListener[] mo35065j1() {
        return this.f21738z;
    }

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        mo35048E0(appendable);
        C11146b.m28976B0(appendable, str, Collections.singletonList(new C11053a(mo35060d1())), C11138r.m28927a(mo34903n()), mo35460G0(), this.f21729q.entrySet(), this.f21727o.mo35284c(), this.f21728p.mo35284c());
    }

    /* renamed from: k1 */
    public Enumeration mo35066k1() {
        return Collections.enumeration(this.f21729q.keySet());
    }

    /* renamed from: l1 */
    public int mo35067l1() {
        return this.f21715H;
    }

    /* renamed from: m1 */
    public int mo35068m1() {
        return this.f21714G;
    }

    /* renamed from: n1 */
    public C11054b mo35069n1() {
        return this.f21726n;
    }

    /* renamed from: o1 */
    public String[] mo35070o1() {
        return this.f21736x;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0085  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34262p0() {
        /*
            r6 = this;
            r0 = 0
            r6.f21725R = r0
            java.lang.String r0 = r6.f21731s
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = r6.mo35063h1()
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = r6.mo35062f1()
            goto L_0x0016
        L_0x0012:
            java.lang.String r0 = r6.mo35063h1()
        L_0x0016:
            h.a.a.h.y.c r0 = p164h.p211a.p212a.p228h.p234y.C11156b.m29016b(r0)
            r6.f21712A = r0
            r0 = 0
            java.lang.ClassLoader r1 = r6.f21730r     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0032
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0079 }
            java.lang.ClassLoader r2 = r1.getContextClassLoader()     // Catch:{ all -> 0x002f }
            java.lang.ClassLoader r3 = r6.f21730r     // Catch:{ all -> 0x0077 }
            r1.setContextClassLoader(r3)     // Catch:{ all -> 0x0077 }
            goto L_0x0034
        L_0x002f:
            r3 = move-exception
            r2 = r0
            goto L_0x007c
        L_0x0032:
            r1 = r0
            r2 = r1
        L_0x0034:
            h.a.a.c.t r3 = r6.f21734v     // Catch:{ all -> 0x0077 }
            if (r3 != 0) goto L_0x003f
            h.a.a.c.t r3 = new h.a.a.c.t     // Catch:{ all -> 0x0077 }
            r3.<init>()     // Catch:{ all -> 0x0077 }
            r6.f21734v = r3     // Catch:{ all -> 0x0077 }
        L_0x003f:
            java.lang.ThreadLocal<h.a.a.f.w.c$b> r3 = f21711T     // Catch:{ all -> 0x0077 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0077 }
            h.a.a.f.w.c$b r3 = (p164h.p211a.p212a.p222f.p224w.C11052c.C11054b) r3     // Catch:{ all -> 0x0077 }
            java.lang.ThreadLocal<h.a.a.f.w.c$b> r0 = f21711T     // Catch:{ all -> 0x0072 }
            h.a.a.f.w.c$b r4 = r6.f21726n     // Catch:{ all -> 0x0072 }
            r0.set(r4)     // Catch:{ all -> 0x0072 }
            r6.mo35078w1()     // Catch:{ all -> 0x0072 }
            monitor-enter(r6)     // Catch:{ all -> 0x0072 }
            boolean r0 = r6.f21723P     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0058
            r0 = 2
            goto L_0x005f
        L_0x0058:
            boolean r0 = r6.f21724Q     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 3
        L_0x005f:
            r6.f21725R = r0     // Catch:{ all -> 0x006f }
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            java.lang.ThreadLocal<h.a.a.f.w.c$b> r0 = f21711T
            r0.set(r3)
            java.lang.ClassLoader r0 = r6.f21730r
            if (r0 == 0) goto L_0x006e
            r1.setContextClassLoader(r2)
        L_0x006e:
            return
        L_0x006f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            r5 = r3
            r3 = r0
            r0 = r5
            goto L_0x007c
        L_0x0077:
            r3 = move-exception
            goto L_0x007c
        L_0x0079:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x007c:
            java.lang.ThreadLocal<h.a.a.f.w.c$b> r4 = f21711T
            r4.set(r0)
            java.lang.ClassLoader r0 = r6.f21730r
            if (r0 == 0) goto L_0x0088
            r1.setContextClassLoader(r2)
        L_0x0088:
            throw r3
        L_0x0089:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Null contextPath"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.p224w.C11052c.mo34262p0():void");
    }

    /* renamed from: p1 */
    public boolean mo35071p1(String str) {
        boolean z = false;
        if (str != null && this.f21722O != null) {
            while (str.startsWith("//")) {
                str = C11139s.m28937c(str);
            }
            int i = 0;
            while (!z) {
                String[] strArr = this.f21722O;
                if (i >= strArr.length) {
                    break;
                }
                boolean g = C11137q.m28924g(str, strArr[i]);
                i++;
                z = g;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34263q0() {
        /*
            r11 = this;
            java.lang.String r0 = "stopped {}"
            r1 = 0
            r11.f21725R = r1
            java.lang.ThreadLocal<h.a.a.f.w.c$b> r2 = f21711T
            java.lang.Object r2 = r2.get()
            h.a.a.f.w.c$b r2 = (p164h.p211a.p212a.p222f.p224w.C11052c.C11054b) r2
            java.lang.ThreadLocal<h.a.a.f.w.c$b> r3 = f21711T
            h.a.a.f.w.c$b r4 = r11.f21726n
            r3.set(r4)
            r3 = 1
            r4 = 0
            java.lang.ClassLoader r5 = r11.f21730r     // Catch:{ all -> 0x0091 }
            if (r5 == 0) goto L_0x002e
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0091 }
            java.lang.ClassLoader r6 = r5.getContextClassLoader()     // Catch:{ all -> 0x0028 }
            java.lang.ClassLoader r7 = r11.f21730r     // Catch:{ all -> 0x008f }
            r5.setContextClassLoader(r7)     // Catch:{ all -> 0x008f }
            goto L_0x0030
        L_0x0028:
            r6 = move-exception
            r10 = r6
            r6 = r4
            r4 = r10
            goto L_0x0095
        L_0x002e:
            r5 = r4
            r6 = r5
        L_0x0030:
            super.mo34263q0()     // Catch:{ all -> 0x008f }
            java.lang.Object r7 = r11.f21717J     // Catch:{ all -> 0x008f }
            if (r7 == 0) goto L_0x0055
            d.b.n r7 = new d.b.n     // Catch:{ all -> 0x008f }
            h.a.a.f.w.c$b r8 = r11.f21726n     // Catch:{ all -> 0x008f }
            r7.<init>(r8)     // Catch:{ all -> 0x008f }
            java.lang.Object r8 = r11.f21717J     // Catch:{ all -> 0x008f }
            int r8 = p164h.p211a.p212a.p228h.C11126j.m28890q(r8)     // Catch:{ all -> 0x008f }
        L_0x0044:
            int r9 = r8 + -1
            if (r8 <= 0) goto L_0x0055
            java.lang.Object r8 = r11.f21717J     // Catch:{ all -> 0x008f }
            java.lang.Object r8 = p164h.p211a.p212a.p228h.C11126j.m28884j(r8, r9)     // Catch:{ all -> 0x008f }
            d.b.o r8 = (p154d.p155b.C10729o) r8     // Catch:{ all -> 0x008f }
            r8.mo33962o(r7)     // Catch:{ all -> 0x008f }
            r8 = r9
            goto L_0x0044
        L_0x0055:
            h.a.a.f.w.e r7 = r11.f21735w     // Catch:{ all -> 0x008f }
            if (r7 == 0) goto L_0x005e
            h.a.a.f.w.e r7 = r11.f21735w     // Catch:{ all -> 0x008f }
            r7.stop()     // Catch:{ all -> 0x008f }
        L_0x005e:
            h.a.a.f.w.c$b r7 = r11.f21726n     // Catch:{ all -> 0x008f }
            java.util.Enumeration r7 = r7.mo35079b()     // Catch:{ all -> 0x008f }
        L_0x0064:
            boolean r8 = r7.hasMoreElements()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x0074
            java.lang.Object r8 = r7.nextElement()     // Catch:{ all -> 0x008f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x008f }
            r11.mo35058b1(r8, r4)     // Catch:{ all -> 0x008f }
            goto L_0x0064
        L_0x0074:
            h.a.a.h.y.c r4 = f21710S
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r11
            r4.mo35494j(r0, r3)
            java.lang.ThreadLocal<h.a.a.f.w.c$b> r0 = f21711T
            r0.set(r2)
            java.lang.ClassLoader r0 = r11.f21730r
            if (r0 == 0) goto L_0x0089
            r5.setContextClassLoader(r6)
        L_0x0089:
            h.a.a.h.c r0 = r11.f21728p
            r0.mo34249Z()
            return
        L_0x008f:
            r4 = move-exception
            goto L_0x0095
        L_0x0091:
            r5 = move-exception
            r6 = r4
            r4 = r5
            r5 = r6
        L_0x0095:
            h.a.a.h.y.c r7 = f21710S
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r11
            r7.mo35494j(r0, r3)
            java.lang.ThreadLocal<h.a.a.f.w.c$b> r0 = f21711T
            r0.set(r2)
            java.lang.ClassLoader r0 = r11.f21730r
            if (r0 == 0) goto L_0x00aa
            r5.setContextClassLoader(r6)
        L_0x00aa:
            goto L_0x00ac
        L_0x00ab:
            throw r4
        L_0x00ac:
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.p224w.C11052c.mo34263q0():void");
    }

    /* renamed from: q1 */
    public C11165e mo35072q1(URL url) {
        return C11165e.m29077g(url);
    }

    /* renamed from: s1 */
    public void mo35073s1(String str) {
        if (str == null || str.length() <= 1 || !str.endsWith(MiotCloudImpl.COOKIE_PATH)) {
            this.f21731s = str;
            if (mo34900d() == null) {
                return;
            }
            if (mo34900d().mo35449K() || mo34900d().mo35452j0()) {
                C11032i[] O = mo34900d().mo34902O(C11055d.class);
                int i = 0;
                while (O != null && i < O.length) {
                    ((C11055d) O[i]).mo35087P0();
                    i++;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ends with /");
    }

    /* renamed from: t1 */
    public void mo35074t1(C11056e eVar) {
        if (eVar != null) {
            eVar.mo34901i(mo34900d());
        }
        if (mo34900d() != null) {
            mo34900d().mo35003Q0().mo35467f(this, this.f21735w, eVar, "errorHandler", true);
        }
        this.f21735w = eVar;
    }

    public String toString() {
        String name;
        String[] o1 = mo35070o1();
        StringBuilder sb = new StringBuilder();
        Package packageR = getClass().getPackage();
        if (!(packageR == null || (name = packageR.getName()) == null || name.length() <= 0)) {
            for (String charAt : name.split("\\.")) {
                sb.append(charAt.charAt(0));
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            }
        }
        sb.append(getClass().getSimpleName());
        sb.append('{');
        sb.append(mo35062f1());
        sb.append(',');
        sb.append(mo35059c1());
        if (o1 != null && o1.length > 0) {
            sb.append(',');
            sb.append(o1[0]);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u1 */
    public void mo35076u1(EventListener[] eventListenerArr) {
        this.f21717J = null;
        this.f21718K = null;
        this.f21719L = null;
        this.f21720M = null;
        this.f21738z = eventListenerArr;
        int i = 0;
        while (eventListenerArr != null && i < eventListenerArr.length) {
            EventListener eventListener = this.f21738z[i];
            if (eventListener instanceof C10729o) {
                this.f21717J = C11126j.m28879b(this.f21717J, eventListener);
            }
            if (eventListener instanceof C10738x) {
                this.f21719L = C11126j.m28879b(this.f21719L, eventListener);
            }
            if (eventListener instanceof C10736v) {
                this.f21720M = C11126j.m28879b(this.f21720M, eventListener);
            }
            i++;
        }
    }

    /* renamed from: v1 */
    public void mo35077v1(String str, Object obj) {
        mo34900d().mo35003Q0().mo35467f(this, this.f21721N.put(str, obj), obj, str, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w1 */
    public void mo35078w1() {
        String str = this.f21729q.get("org.eclipse.jetty.server.context.ManagedAttributes");
        if (str != null) {
            this.f21721N = new HashMap();
            for (String put : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                this.f21721N.put(put, (Object) null);
            }
            Enumeration b = this.f21726n.mo35079b();
            while (b.hasMoreElements()) {
                String str2 = (String) b.nextElement();
                mo35058b1(str2, this.f21726n.mo33958a(str2));
            }
        }
        super.mo34262p0();
        C11056e eVar = this.f21735w;
        if (eVar != null) {
            eVar.start();
        }
        if (this.f21717J != null) {
            C10728n nVar = new C10728n(this.f21726n);
            for (int i = 0; i < C11126j.m28890q(this.f21717J); i++) {
                mo35056Z0((C10729o) C11126j.m28884j(this.f21717J, i), nVar);
            }
        }
    }

    /* renamed from: z */
    public void mo35021z(boolean z) {
        synchronized (this) {
            this.f21723P = z;
            this.f21725R = isRunning() ? this.f21723P ? 2 : this.f21724Q ? 1 : 3 : 0;
        }
    }
}
