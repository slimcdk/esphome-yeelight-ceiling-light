package p136c6;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9281e;
import javax.servlet.http.C9283g;
import javax.servlet.http.C9285i;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import org.eclipse.jetty.http.C9894g;
import org.eclipse.jetty.server.handler.C9943d;
import p147d6.C8941a;
import p152e6.C9003c;
import p167h6.C9095a;
import p167h6.C9096b;
import p208s4.C10370v;
import p239z5.C12187r;
import p239z5.C12191u;
import p239z5.C12192v;

/* renamed from: c6.c */
public abstract class C4015c extends C8941a implements C12192v {

    /* renamed from: R */
    static final C9003c f6802R = C4025g.f6851o;

    /* renamed from: A */
    public Set<SessionTrackingMode> f6803A;

    /* renamed from: B */
    protected final C9095a f6804B = new C9095a();

    /* renamed from: C */
    protected final C9096b f6805C = new C9096b();

    /* renamed from: Q */
    private C10370v f6806Q = new C4017b();

    /* renamed from: e */
    public Set<SessionTrackingMode> f6807e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new SessionTrackingMode[]{SessionTrackingMode.COOKIE, SessionTrackingMode.URL})));

    /* renamed from: f */
    private boolean f6808f = true;

    /* renamed from: g */
    protected int f6809g = -1;

    /* renamed from: h */
    protected C4025g f6810h;

    /* renamed from: i */
    protected boolean f6811i = false;

    /* renamed from: j */
    protected C12191u f6812j;

    /* renamed from: k */
    protected boolean f6813k = false;

    /* renamed from: l */
    protected boolean f6814l = true;

    /* renamed from: m */
    protected final List<C9283g> f6815m = new CopyOnWriteArrayList();

    /* renamed from: n */
    protected final List<C9285i> f6816n = new CopyOnWriteArrayList();

    /* renamed from: o */
    protected ClassLoader f6817o;

    /* renamed from: p */
    protected C9943d.C9945b f6818p;

    /* renamed from: q */
    protected String f6819q = "JSESSIONID";

    /* renamed from: r */
    protected String f6820r = "jsessionid";

    /* renamed from: s */
    protected String f6821s = (";" + this.f6820r + "=");

    /* renamed from: t */
    protected String f6822t;

    /* renamed from: u */
    protected String f6823u;

    /* renamed from: v */
    protected int f6824v = -1;

    /* renamed from: w */
    protected int f6825w;

    /* renamed from: x */
    protected boolean f6826x;

    /* renamed from: y */
    protected boolean f6827y;

    /* renamed from: z */
    protected String f6828z;

    /* renamed from: c6.c$a */
    static class C4016a {
        C4016a() {
        }
    }

    /* renamed from: c6.c$b */
    class C4017b implements C10370v {
        C4017b() {
        }

        /* renamed from: a */
        public int mo26681a() {
            return C4015c.this.f6824v;
        }

        /* renamed from: b */
        public boolean mo26682b() {
            return C4015c.this.f6811i;
        }

        /* renamed from: c */
        public boolean mo26683c() {
            return C4015c.this.f6813k;
        }

        public String getName() {
            return C4015c.this.f6819q;
        }
    }

    /* renamed from: c6.c$c */
    public interface C4018c extends C9281e {
        /* renamed from: c */
        C4013a mo26627c();
    }

    static {
        new C4016a();
    }

    public C4015c() {
        mo26669R0(this.f6807e);
    }

    /* renamed from: P0 */
    public static C9281e m11709P0(C9277a aVar, C9281e eVar, boolean z) {
        HashMap hashMap = new HashMap();
        Enumeration<String> f = eVar.mo26630f();
        while (f.hasMoreElements()) {
            String nextElement = f.nextElement();
            hashMap.put(nextElement, eVar.mo26625a(nextElement));
            eVar.mo26628d(nextElement);
        }
        eVar.mo26629e();
        C9281e p = aVar.mo37769p(true);
        if (z) {
            p.mo26626b("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated", Boolean.TRUE);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            p.mo26626b((String) entry.getKey(), entry.getValue());
        }
        return p;
    }

    /* renamed from: A */
    public boolean mo26655A(C9281e eVar) {
        return ((C4018c) eVar).mo26627c().mo26652z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public abstract void mo26656D0(C4013a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: E0 */
    public void mo26657E0(C4013a aVar, boolean z) {
        synchronized (this.f6812j) {
            this.f6812j.mo26687l(aVar);
            mo26656D0(aVar);
        }
        if (z) {
            this.f6804B.mo37112f();
            if (this.f6816n != null) {
                HttpSessionEvent httpSessionEvent = new HttpSessionEvent(aVar);
                for (C9285i j : this.f6816n) {
                    j.mo37791j(httpSessionEvent);
                }
            }
        }
    }

    /* renamed from: F0 */
    public void mo26658F0(C4013a aVar, String str, Object obj, Object obj2) {
        if (!this.f6815m.isEmpty()) {
            HttpSessionBindingEvent httpSessionBindingEvent = new HttpSessionBindingEvent(aVar, str, obj == null ? obj2 : obj);
            for (C9283g next : this.f6815m) {
                if (obj == null) {
                    next.mo37787k(httpSessionBindingEvent);
                } else if (obj2 == null) {
                    next.mo37786b(httpSessionBindingEvent);
                } else {
                    next.mo37788q(httpSessionBindingEvent);
                }
            }
        }
    }

    /* renamed from: G0 */
    public int mo26659G0() {
        return this.f6825w;
    }

    /* renamed from: H0 */
    public abstract C4013a mo26660H0(String str);

    /* renamed from: I0 */
    public C4025g mo26661I0() {
        return this.f6810h;
    }

    /* renamed from: J0 */
    public C12191u mo26662J0() {
        return this.f6812j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public abstract void mo26663K0();

    /* renamed from: L0 */
    public boolean mo26664L0() {
        return this.f6814l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public abstract C4013a mo26665M0(C9277a aVar);

    /* renamed from: N0 */
    public void mo26666N0(C4013a aVar, boolean z) {
        if (mo26667O0(aVar.mo26644s())) {
            this.f6804B.mo37108b();
            C9096b bVar = this.f6805C;
            double currentTimeMillis = (double) (System.currentTimeMillis() - aVar.mo26647u());
            Double.isNaN(currentTimeMillis);
            bVar.mo37121g(Math.round(currentTimeMillis / 1000.0d));
            this.f6812j.mo26685V(aVar);
            if (z) {
                this.f6812j.mo26690u(aVar.mo26644s());
            }
            if (z && this.f6816n != null) {
                HttpSessionEvent httpSessionEvent = new HttpSessionEvent(aVar);
                for (C9285i n : this.f6816n) {
                    n.mo37792n(httpSessionEvent);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public abstract boolean mo26667O0(String str);

    /* renamed from: Q0 */
    public void mo26668Q0(String str) {
        String str2 = null;
        this.f6820r = (str == null || "none".equals(str)) ? null : str;
        if (str != null && !"none".equals(str)) {
            str2 = ";" + this.f6820r + "=";
        }
        this.f6821s = str2;
    }

    /* renamed from: R0 */
    public void mo26669R0(Set<SessionTrackingMode> set) {
        HashSet hashSet = new HashSet(set);
        this.f6803A = hashSet;
        this.f6808f = hashSet.contains(SessionTrackingMode.COOKIE);
        this.f6803A.contains(SessionTrackingMode.URL);
    }

    /* renamed from: Z */
    public void mo26670Z(C4025g gVar) {
        this.f6810h = gVar;
    }

    /* renamed from: a0 */
    public boolean mo26671a0() {
        return this.f6827y;
    }

    /* renamed from: c0 */
    public String mo26672c0() {
        return this.f6821s;
    }

    /* renamed from: f0 */
    public C9281e mo26673f0(String str) {
        C4013a H0 = mo26660H0(mo26662J0().mo26689s0(str));
        if (H0 != null && !H0.mo26649w().equals(str)) {
            H0.mo26619A(true);
        }
        return H0;
    }

    /* renamed from: g0 */
    public C9894g mo26674g0(C9281e eVar, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        C4013a c = ((C4018c) eVar).mo26627c();
        if (!c.mo26631g(currentTimeMillis) || !mo26678p()) {
            return null;
        }
        if (!c.mo26651y() && (mo26679t0().mo26681a() <= 0 || mo26659G0() <= 0 || (currentTimeMillis - c.mo26645t()) / 1000 <= ((long) mo26659G0()))) {
            return null;
        }
        C9943d.C9945b bVar = this.f6818p;
        C9894g z2 = mo26680z(eVar, bVar == null ? MiotCloudImpl.COOKIE_PATH : bVar.mo39961e(), z);
        c.mo26637l();
        c.mo26619A(false);
        return z2;
    }

    /* renamed from: i0 */
    public C9281e mo26675i0(C9277a aVar) {
        C4013a M0 = mo26665M0(aVar);
        M0.mo26620B(this.f6809g);
        mo26657E0(M0, true);
        return M0;
    }

    /* renamed from: l0 */
    public void mo26676l0(C9281e eVar) {
        ((C4018c) eVar).mo26627c().mo26636k();
    }

    /* renamed from: n */
    public String mo26677n(C9281e eVar) {
        return ((C4018c) eVar).mo26627c().mo26649w();
    }

    /* renamed from: p */
    public boolean mo26678p() {
        return this.f6808f;
    }

    /* renamed from: t0 */
    public C10370v mo26679t0() {
        return this.f6806Q;
    }

    /* renamed from: u0 */
    public void mo26547u0() {
        String initParameter;
        this.f6818p = C9943d.m24416m1();
        this.f6817o = Thread.currentThread().getContextClassLoader();
        if (this.f6812j == null) {
            C12187r c = mo26661I0().mo39919c();
            synchronized (c) {
                C12191u Y0 = c.mo43172Y0();
                this.f6812j = Y0;
                if (Y0 == null) {
                    C4019d dVar = new C4019d();
                    this.f6812j = dVar;
                    c.mo43183j1(dVar);
                }
            }
        }
        if (!this.f6812j.mo36748n0()) {
            this.f6812j.start();
        }
        C9943d.C9945b bVar = this.f6818p;
        if (bVar != null) {
            String initParameter2 = bVar.getInitParameter("org.eclipse.jetty.servlet.SessionCookie");
            if (initParameter2 != null) {
                this.f6819q = initParameter2;
            }
            String initParameter3 = this.f6818p.getInitParameter("org.eclipse.jetty.servlet.SessionIdPathParameterName");
            if (initParameter3 != null) {
                mo26668Q0(initParameter3);
            }
            if (this.f6824v == -1 && (initParameter = this.f6818p.getInitParameter("org.eclipse.jetty.servlet.MaxAge")) != null) {
                this.f6824v = Integer.parseInt(initParameter.trim());
            }
            if (this.f6822t == null) {
                this.f6822t = this.f6818p.getInitParameter("org.eclipse.jetty.servlet.SessionDomain");
            }
            if (this.f6823u == null) {
                this.f6823u = this.f6818p.getInitParameter("org.eclipse.jetty.servlet.SessionPath");
            }
            String initParameter4 = this.f6818p.getInitParameter("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding");
            if (initParameter4 != null) {
                this.f6827y = Boolean.parseBoolean(initParameter4);
            }
        }
        super.mo26547u0();
    }

    /* renamed from: v0 */
    public void mo26548v0() {
        super.mo26548v0();
        mo26663K0();
        this.f6817o = null;
    }

    /* renamed from: z */
    public C9894g mo26680z(C9281e eVar, String str, boolean z) {
        C9894g gVar;
        if (!mo26678p()) {
            return null;
        }
        String str2 = this.f6823u;
        if (str2 != null) {
            str = str2;
        }
        if (str == null || str.length() == 0) {
            str = MiotCloudImpl.COOKIE_PATH;
        }
        String str3 = str;
        String n = mo26677n(eVar);
        if (this.f6828z == null) {
            gVar = new C9894g(this.f6819q, n, this.f6822t, str3, this.f6806Q.mo26681a(), this.f6806Q.mo26682b(), this.f6806Q.mo26683c() || (mo26664L0() && z));
        } else {
            gVar = new C9894g(this.f6819q, n, this.f6822t, str3, this.f6806Q.mo26681a(), this.f6806Q.mo26682b(), this.f6806Q.mo26683c() || (mo26664L0() && z), this.f6828z, 1);
        }
        return gVar;
    }
}
