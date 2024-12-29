package org.eclipse.jetty.servlet;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Collections;
import java.util.Map;
import java.util.Stack;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import org.eclipse.jetty.server.handler.C9943d;
import org.eclipse.jetty.servlet.C9965c;
import org.eclipse.jetty.servlet.Holder;
import org.eclipse.jetty.util.C9990j;
import p152e6.C9001b;
import p152e6.C9003c;
import p208s4.C10355g;
import p208s4.C10357i;
import p208s4.C10358j;
import p208s4.C10359k;
import p208s4.C10363o;
import p208s4.C10364p;
import p208s4.C10368t;
import p208s4.C10371w;
import p234y5.C12079f;
import p234y5.C12083j;
import p239z5.C12181o;
import p239z5.C12193w;

public class ServletHolder extends Holder<C10357i> implements C12193w.C12194a, Comparable {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final C9003c f18299y = C9001b.m21450a(ServletHolder.class);

    /* renamed from: z */
    public static final Map<String, String> f18300z = Collections.emptyMap();

    /* renamed from: m */
    private int f18301m;

    /* renamed from: n */
    private boolean f18302n = false;

    /* renamed from: o */
    private String f18303o;

    /* renamed from: p */
    private String f18304p;

    /* renamed from: q */
    private C12083j f18305q;

    /* renamed from: r */
    private C12079f f18306r;

    /* renamed from: s */
    private C10363o f18307s;

    /* renamed from: t */
    private transient C10357i f18308t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public transient C9958a f18309u;

    /* renamed from: v */
    private transient long f18310v;

    /* renamed from: w */
    private transient boolean f18311w = true;

    /* renamed from: x */
    private transient UnavailableException f18312x;

    /* renamed from: org.eclipse.jetty.servlet.ServletHolder$a */
    protected class C9958a extends Holder<C10357i>.a implements C10358j {
        protected C9958a() {
            super();
        }

        public String getServletName() {
            return ServletHolder.this.getName();
        }
    }

    /* renamed from: org.eclipse.jetty.servlet.ServletHolder$b */
    public class C9959b extends Holder<C10357i>.b implements C10363o {

        /* renamed from: a */
        protected C10355g f18314a;

        public C9959b(ServletHolder servletHolder) {
            super(servletHolder);
        }

        /* renamed from: a */
        public C10355g mo40056a() {
            return this.f18314a;
        }
    }

    /* renamed from: org.eclipse.jetty.servlet.ServletHolder$c */
    private class C9960c implements C10357i {

        /* renamed from: a */
        Stack<C10357i> f18315a;

        private C9960c() {
            this.f18315a = new Stack<>();
        }

        public void destroy() {
            synchronized (this) {
                while (this.f18315a.size() > 0) {
                    try {
                        this.f18315a.pop().destroy();
                    } catch (Exception e) {
                        ServletHolder.f18299y.mo36856j(e);
                    }
                }
            }
        }

        public void init(C10358j jVar) {
            synchronized (this) {
                if (this.f18315a.size() == 0) {
                    try {
                        C10357i f1 = ServletHolder.this.mo40053f1();
                        f1.init(jVar);
                        this.f18315a.push(f1);
                    } catch (ServletException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw new ServletException((Throwable) e2);
                    }
                }
            }
        }

        public void service(C10364p pVar, C10368t tVar) {
            C10357i iVar;
            synchronized (this) {
                if (this.f18315a.size() > 0) {
                    iVar = this.f18315a.pop();
                } else {
                    try {
                        iVar = ServletHolder.this.mo40053f1();
                        iVar.init(ServletHolder.this.f18309u);
                    } catch (ServletException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw new ServletException((Throwable) e2);
                    }
                }
            }
            try {
                iVar.service(pVar, tVar);
                synchronized (this) {
                    this.f18315a.push(iVar);
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.f18315a.push(iVar);
                    throw th;
                }
            }
        }
    }

    public ServletHolder() {
        super(Holder.Source.EMBEDDED);
    }

    public ServletHolder(Holder.Source source) {
        super(source);
    }

    public ServletHolder(C10357i iVar) {
        super(Holder.Source.EMBEDDED);
        mo40054g1(iVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072 A[Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055, all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074 A[Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055, all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0090  */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24558Z0() {
        /*
            r5 = this;
            r0 = 0
            s4.i r1 = r5.f18308t     // Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055 }
            if (r1 != 0) goto L_0x000b
            s4.i r1 = r5.mo40053f1()     // Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055 }
            r5.f18308t = r1     // Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055 }
        L_0x000b:
            org.eclipse.jetty.servlet.ServletHolder$a r1 = r5.f18309u     // Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055 }
            if (r1 != 0) goto L_0x0016
            org.eclipse.jetty.servlet.ServletHolder$a r1 = new org.eclipse.jetty.servlet.ServletHolder$a     // Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055 }
            r1.<init>()     // Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055 }
            r5.f18309u = r1     // Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055 }
        L_0x0016:
            y5.f r1 = r5.f18306r     // Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055 }
            if (r1 == 0) goto L_0x0025
            z5.w r2 = r1.mo42757c()     // Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055 }
            y5.j r3 = r5.f18305q     // Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055 }
            java.lang.Object r1 = r1.mo42756b(r2, r3)     // Catch:{ UnavailableException -> 0x0080, ServletException -> 0x006a, Exception -> 0x0057, all -> 0x0055 }
            goto L_0x0026
        L_0x0025:
            r1 = r0
        L_0x0026:
            boolean r2 = r5.m24559b1()     // Catch:{ UnavailableException -> 0x0050, ServletException -> 0x004b, Exception -> 0x0046, all -> 0x0041 }
            if (r2 == 0) goto L_0x002f
            r5.mo40048X0()     // Catch:{ UnavailableException -> 0x0050, ServletException -> 0x004b, Exception -> 0x0046, all -> 0x0041 }
        L_0x002f:
            r5.mo40049Y0()     // Catch:{ UnavailableException -> 0x0050, ServletException -> 0x004b, Exception -> 0x0046, all -> 0x0041 }
            s4.i r2 = r5.f18308t     // Catch:{ UnavailableException -> 0x0050, ServletException -> 0x004b, Exception -> 0x0046, all -> 0x0041 }
            org.eclipse.jetty.servlet.ServletHolder$a r3 = r5.f18309u     // Catch:{ UnavailableException -> 0x0050, ServletException -> 0x004b, Exception -> 0x0046, all -> 0x0041 }
            r2.init(r3)     // Catch:{ UnavailableException -> 0x0050, ServletException -> 0x004b, Exception -> 0x0046, all -> 0x0041 }
            y5.f r0 = r5.f18306r
            if (r0 == 0) goto L_0x0040
            r0.mo42755a(r1)
        L_0x0040:
            return
        L_0x0041:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x008c
        L_0x0046:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x0059
        L_0x004b:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x006c
        L_0x0050:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x0082
        L_0x0055:
            r1 = move-exception
            goto L_0x008c
        L_0x0057:
            r1 = move-exception
            r2 = r0
        L_0x0059:
            r5.m24561d1(r1)     // Catch:{ all -> 0x008a }
            r5.f18308t = r0     // Catch:{ all -> 0x008a }
            r5.f18309u = r0     // Catch:{ all -> 0x008a }
            javax.servlet.ServletException r0 = new javax.servlet.ServletException     // Catch:{ all -> 0x008a }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x008a }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x008a }
            throw r0     // Catch:{ all -> 0x008a }
        L_0x006a:
            r1 = move-exception
            r2 = r0
        L_0x006c:
            java.lang.Throwable r3 = r1.getCause()     // Catch:{ all -> 0x008a }
            if (r3 != 0) goto L_0x0074
            r3 = r1
            goto L_0x0078
        L_0x0074:
            java.lang.Throwable r3 = r1.getCause()     // Catch:{ all -> 0x008a }
        L_0x0078:
            r5.m24561d1(r3)     // Catch:{ all -> 0x008a }
            r5.f18308t = r0     // Catch:{ all -> 0x008a }
            r5.f18309u = r0     // Catch:{ all -> 0x008a }
            throw r1     // Catch:{ all -> 0x008a }
        L_0x0080:
            r1 = move-exception
            r2 = r0
        L_0x0082:
            r5.m24562e1(r1)     // Catch:{ all -> 0x008a }
            r5.f18308t = r0     // Catch:{ all -> 0x008a }
            r5.f18309u = r0     // Catch:{ all -> 0x008a }
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r1 = move-exception
            r0 = r2
        L_0x008c:
            y5.f r2 = r5.f18306r
            if (r2 == 0) goto L_0x0093
            r2.mo42755a(r0)
        L_0x0093:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.servlet.ServletHolder.m24558Z0():void");
    }

    /* renamed from: b1 */
    private boolean m24559b1() {
        C10357i iVar = this.f18308t;
        boolean z = false;
        if (iVar == null) {
            return false;
        }
        for (Class cls = iVar.getClass(); cls != null && !z; cls = cls.getSuperclass()) {
            z = m24560c1(cls.getName());
        }
        return z;
    }

    /* renamed from: c1 */
    private boolean m24560c1(String str) {
        if (str == null) {
            return false;
        }
        return "org.apache.jasper.servlet.JspServlet".equals(str);
    }

    /* renamed from: d1 */
    private void m24561d1(Throwable th) {
        if (th instanceof UnavailableException) {
            m24562e1((UnavailableException) th);
            return;
        }
        C10359k h1 = this.f18294k.mo40093h1();
        if (h1 == null) {
            f18299y.mo36851f("unavailable", th);
        } else {
            h1.log("unavailable", th);
        }
        this.f18312x = new UnavailableException(String.valueOf(th), -1, th) {
            final /* synthetic */ Throwable val$e;

            {
                this.val$e = r4;
                initCause(r4);
            }
        };
        this.f18310v = -1;
    }

    /* renamed from: e1 */
    private void m24562e1(UnavailableException unavailableException) {
        if (this.f18312x != unavailableException || this.f18310v == 0) {
            this.f18294k.mo40093h1().log("unavailable", unavailableException);
            this.f18312x = unavailableException;
            long j = -1;
            this.f18310v = -1;
            if (!unavailableException.isPermanent()) {
                j = System.currentTimeMillis() + (this.f18312x.getUnavailableSeconds() > 0 ? (long) (this.f18312x.getUnavailableSeconds() * 1000) : 5000);
            }
            this.f18310v = j;
        }
    }

    /* renamed from: Q0 */
    public void mo40041Q0() {
        Class<? extends T> cls = this.f18288e;
        if (cls == null || !C10357i.class.isAssignableFrom(cls)) {
            throw new UnavailableException("Servlet " + this.f18288e + " is not a javax.servlet.Servlet");
        }
    }

    /* renamed from: R0 */
    public void mo40042R0(Object obj) {
        if (obj != null) {
            C10357i iVar = (C10357i) obj;
            iVar.destroy();
            mo40026G0().mo40088c1(iVar);
        }
    }

    /* renamed from: S0 */
    public String mo40043S0() {
        return this.f18303o;
    }

    /* renamed from: T0 */
    public C10363o mo40044T0() {
        if (this.f18307s == null) {
            this.f18307s = new C9959b(this);
        }
        return this.f18307s;
    }

    /* renamed from: U0 */
    public synchronized C10357i mo40045U0() {
        long j = this.f18310v;
        if (j != 0) {
            if (j < 0 || (j > 0 && System.currentTimeMillis() < this.f18310v)) {
                throw this.f18312x;
            }
            this.f18310v = 0;
            this.f18312x = null;
        }
        if (this.f18308t == null) {
            m24558Z0();
        }
        return this.f18308t;
    }

    /* renamed from: V0 */
    public C10357i mo40046V0() {
        return this.f18308t;
    }

    /* renamed from: W0 */
    public void mo40047W0(C12181o oVar, C10364p pVar, C10368t tVar) {
        if (this.f18288e != null) {
            C10357i iVar = this.f18308t;
            synchronized (this) {
                if (this.f18310v != 0 || !this.f18302n) {
                    iVar = mo40045U0();
                }
                if (iVar == null) {
                    throw new UnavailableException("Could not instantiate " + this.f18288e);
                }
            }
            Object obj = null;
            boolean Y = oVar.mo43099Y();
            try {
                String str = this.f18303o;
                if (str != null) {
                    pVar.mo41944b("org.apache.catalina.jsp_file", str);
                }
                C12079f fVar = this.f18306r;
                if (fVar != null) {
                    obj = fVar.mo42756b(oVar.mo43087M(), this.f18305q);
                }
                if (!mo40027H0()) {
                    oVar.mo43107g0(false);
                }
                C10355g a = ((C9959b) mo40044T0()).mo40056a();
                if (a != null) {
                    pVar.mo41944b("org.eclipse.multipartConfig", a);
                }
                iVar.service(pVar, tVar);
                oVar.mo43107g0(Y);
                C12079f fVar2 = this.f18306r;
                if (fVar2 != null) {
                    fVar2.mo42755a(obj);
                }
            } catch (UnavailableException e) {
                m24562e1(e);
                throw this.f18312x;
            } catch (Throwable th) {
                oVar.mo43107g0(Y);
                C12079f fVar3 = this.f18306r;
                if (fVar3 != null) {
                    fVar3.mo42755a((Object) null);
                }
                pVar.mo41944b("javax.servlet.error.servlet_name", getName());
                throw th;
            }
        } else {
            throw new UnavailableException("Servlet Not Initialized");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public void mo40048X0() {
        C9943d d = ((C9943d.C9945b) mo40026G0().mo40093h1()).mo39960d();
        d.mo39578b("org.apache.catalina.jsp_classpath", d.mo39941k1());
        mo40030K0("com.sun.appserv.jsp.classpath", C9990j.m24693a(d.mo39940j1().getParent()));
        if ("?".equals(getInitParameter("classpath"))) {
            String k1 = d.mo39941k1();
            C9003c cVar = f18299y;
            cVar.mo36850e("classpath=" + k1, new Object[0]);
            if (k1 != null) {
                mo40030K0("classpath", k1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y0 */
    public void mo40049Y0() {
        if (((C9959b) mo40044T0()).mo40056a() != null) {
            ((C9943d.C9945b) mo40026G0().mo40093h1()).mo39960d().mo39934e1(new C12181o.C12182a());
        }
    }

    /* renamed from: a1 */
    public boolean mo40050a1() {
        return this.f18311w;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof org.eclipse.jetty.servlet.ServletHolder
            r1 = 1
            if (r0 == 0) goto L_0x003d
            r0 = r7
            org.eclipse.jetty.servlet.ServletHolder r0 = (org.eclipse.jetty.servlet.ServletHolder) r0
            r2 = 0
            if (r0 != r6) goto L_0x000c
            return r2
        L_0x000c:
            int r3 = r0.f18301m
            int r4 = r6.f18301m
            if (r3 >= r4) goto L_0x0013
            return r1
        L_0x0013:
            r5 = -1
            if (r3 <= r4) goto L_0x0017
            return r5
        L_0x0017:
            java.lang.String r3 = r6.f18290g
            if (r3 == 0) goto L_0x0023
            java.lang.String r4 = r0.f18290g
            if (r4 == 0) goto L_0x0023
            int r2 = r3.compareTo(r4)
        L_0x0023:
            if (r2 != 0) goto L_0x002d
            java.lang.String r2 = r6.f18293j
            java.lang.String r0 = r0.f18293j
            int r2 = r2.compareTo(r0)
        L_0x002d:
            if (r2 != 0) goto L_0x003c
            int r0 = r6.hashCode()
            int r7 = r7.hashCode()
            if (r0 <= r7) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r1 = -1
        L_0x003b:
            r2 = r1
        L_0x003c:
            return r2
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.servlet.ServletHolder.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        return compareTo(obj) == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f1 */
    public C10357i mo40053f1() {
        try {
            C10359k h1 = mo40026G0().mo40093h1();
            return h1 == null ? (C10357i) mo40024E0().newInstance() : ((C9965c.C9966a) h1).mo40078j(mo40024E0());
        } catch (ServletException e) {
            Throwable rootCause = e.getRootCause();
            if (rootCause instanceof InstantiationException) {
                throw ((InstantiationException) rootCause);
            } else if (rootCause instanceof IllegalAccessException) {
                throw ((IllegalAccessException) rootCause);
            } else {
                throw e;
            }
        }
    }

    /* renamed from: g1 */
    public synchronized void mo40054g1(C10357i iVar) {
        if (iVar != null) {
            if (!(iVar instanceof C10371w)) {
                this.f18291h = true;
                this.f18308t = iVar;
                mo40029J0(iVar.getClass());
                if (getName() == null) {
                    mo40032M0(iVar.getClass().getName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + super.hashCode());
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        String str = this.f18293j;
        return str == null ? System.identityHashCode(this) : str.hashCode();
    }

    /* renamed from: u0 */
    public void mo26547u0() {
        String str;
        this.f18310v = 0;
        if (this.f18311w) {
            try {
                super.mo26547u0();
                try {
                    mo40041Q0();
                } catch (UnavailableException e) {
                    m24562e1(e);
                    if (!this.f18294k.mo40097m1()) {
                        throw e;
                    }
                }
                C12079f h = this.f18294k.mo40092h();
                this.f18306r = h;
                if (!(h == null || (str = this.f18304p) == null)) {
                    this.f18305q = h.mo42759e(str);
                }
                this.f18309u = new C9958a();
                Class<? extends T> cls = this.f18288e;
                if (cls != null && C10371w.class.isAssignableFrom(cls)) {
                    this.f18308t = new C9960c();
                }
                if (this.f18291h || this.f18302n) {
                    try {
                        m24558Z0();
                    } catch (Exception e2) {
                        if (this.f18294k.mo40097m1()) {
                            f18299y.mo36849d(e2);
                            return;
                        }
                        throw e2;
                    }
                }
            } catch (UnavailableException e3) {
                m24562e1(e3);
                throw e3;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004b  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26548v0() {
        /*
            r5 = this;
            s4.i r0 = r5.f18308t
            r1 = 0
            if (r0 == 0) goto L_0x0047
            y5.f r0 = r5.f18306r     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            if (r0 == 0) goto L_0x0014
            z5.w r2 = r0.mo42757c()     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            y5.j r3 = r5.f18305q     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            java.lang.Object r0 = r0.mo42756b(r2, r3)     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            s4.i r2 = r5.f18308t     // Catch:{ Exception -> 0x0027, all -> 0x0022 }
            r5.mo40042R0(r2)     // Catch:{ Exception -> 0x0027, all -> 0x0022 }
            y5.f r2 = r5.f18306r
            if (r2 == 0) goto L_0x0047
            r2.mo42755a(r0)
            goto L_0x0047
        L_0x0022:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x003f
        L_0x0027:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            goto L_0x003f
        L_0x002e:
            r0 = move-exception
            r2 = r1
        L_0x0030:
            e6.c r3 = f18299y     // Catch:{ all -> 0x003d }
            r3.mo36856j(r0)     // Catch:{ all -> 0x003d }
            y5.f r0 = r5.f18306r
            if (r0 == 0) goto L_0x0047
            r0.mo42755a(r2)
            goto L_0x0047
        L_0x003d:
            r0 = move-exception
            r1 = r2
        L_0x003f:
            y5.f r2 = r5.f18306r
            if (r2 == 0) goto L_0x0046
            r2.mo42755a(r1)
        L_0x0046:
            throw r0
        L_0x0047:
            boolean r0 = r5.f18291h
            if (r0 != 0) goto L_0x004d
            r5.f18308t = r1
        L_0x004d:
            r5.f18309u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.servlet.ServletHolder.mo26548v0():void");
    }
}
