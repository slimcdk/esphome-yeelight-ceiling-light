package p164h.p211a.p212a.p222f.p226y;

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
import p154d.p155b.C10700b0;
import p154d.p155b.C10702c0;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10713g;
import p154d.p155b.p204f0.C10715i;
import p154d.p155b.p204f0.C10716j;
import p154d.p155b.p204f0.C10718l;
import p154d.p155b.p204f0.C10719m;
import p164h.p211a.p212a.p216c.C10895g;
import p164h.p211a.p212a.p222f.C11040p;
import p164h.p211a.p212a.p222f.C11044s;
import p164h.p211a.p212a.p222f.C11045t;
import p164h.p211a.p212a.p222f.p224w.C11052c;
import p164h.p211a.p212a.p228h.p231c0.C11105a;
import p164h.p211a.p212a.p228h.p231c0.C11106b;
import p164h.p211a.p212a.p228h.p233x.C11145a;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.y.c */
public abstract class C11064c extends C11145a implements C11045t {

    /* renamed from: A */
    public Set<C10702c0> f21775A;

    /* renamed from: B */
    protected final C11105a f21776B = new C11105a();

    /* renamed from: G */
    protected final C11106b f21777G = new C11106b();

    /* renamed from: H */
    private C10700b0 f21778H = new C11065a();

    /* renamed from: e */
    public Set<C10702c0> f21779e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C10702c0[]{C10702c0.COOKIE, C10702c0.URL})));

    /* renamed from: f */
    private boolean f21780f = true;

    /* renamed from: g */
    protected int f21781g = -1;

    /* renamed from: h */
    protected C11073g f21782h;

    /* renamed from: i */
    protected boolean f21783i = false;

    /* renamed from: j */
    protected C11044s f21784j;

    /* renamed from: k */
    protected boolean f21785k = false;

    /* renamed from: l */
    protected boolean f21786l = true;

    /* renamed from: m */
    protected final List<C10715i> f21787m = new CopyOnWriteArrayList();

    /* renamed from: n */
    protected final List<C10719m> f21788n = new CopyOnWriteArrayList();

    /* renamed from: o */
    protected ClassLoader f21789o;

    /* renamed from: p */
    protected C11052c.C11054b f21790p;

    /* renamed from: q */
    protected String f21791q = "JSESSIONID";

    /* renamed from: r */
    protected String f21792r = "jsessionid";

    /* renamed from: s */
    protected String f21793s = (";" + this.f21792r + "=");

    /* renamed from: t */
    protected String f21794t;

    /* renamed from: u */
    protected String f21795u;

    /* renamed from: v */
    protected int f21796v = -1;

    /* renamed from: w */
    protected int f21797w;

    /* renamed from: x */
    protected boolean f21798x;

    /* renamed from: y */
    protected boolean f21799y;

    /* renamed from: z */
    protected String f21800z;

    /* renamed from: h.a.a.f.y.c$a */
    class C11065a implements C10700b0 {
        C11065a() {
        }

        /* renamed from: a */
        public int mo33894a() {
            return C11064c.this.f21796v;
        }

        /* renamed from: b */
        public boolean mo33895b() {
            return C11064c.this.f21783i;
        }

        /* renamed from: c */
        public boolean mo33896c() {
            return C11064c.this.f21785k;
        }

        public String getName() {
            return C11064c.this.f21791q;
        }
    }

    /* renamed from: h.a.a.f.y.c$b */
    public interface C11066b extends C10713g {
        /* renamed from: c */
        C11062a mo35109c();
    }

    static {
        C11158c cVar = C11073g.f21823o;
    }

    public C11064c() {
        mo35143M0(this.f21779e);
    }

    /* renamed from: K0 */
    public static C10713g m28576K0(C10709c cVar, C10713g gVar, boolean z) {
        HashMap hashMap = new HashMap();
        Enumeration<String> g = gVar.mo33942g();
        while (g.hasMoreElements()) {
            String nextElement = g.nextElement();
            hashMap.put(nextElement, gVar.mo33938a(nextElement));
            gVar.mo33940e(nextElement);
        }
        gVar.mo33941f();
        C10713g p = cVar.mo33925p(true);
        if (z) {
            p.mo33939b("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated", Boolean.TRUE);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            p.mo33939b((String) entry.getKey(), entry.getValue());
        }
        return p;
    }

    /* renamed from: A0 */
    public void mo35132A0(C11062a aVar, String str, Object obj, Object obj2) {
        if (!this.f21787m.isEmpty()) {
            C10716j jVar = new C10716j(aVar, str, obj == null ? obj2 : obj);
            for (C10715i next : this.f21787m) {
                if (obj == null) {
                    next.mo33947l(jVar);
                } else if (obj2 == null) {
                    next.mo33946b(jVar);
                } else {
                    next.mo33948r(jVar);
                }
            }
        }
    }

    /* renamed from: B0 */
    public int mo35133B0() {
        return this.f21797w;
    }

    /* renamed from: C0 */
    public abstract C11062a mo35134C0(String str);

    /* renamed from: D0 */
    public C11073g mo35135D0() {
        return this.f21782h;
    }

    /* renamed from: E0 */
    public C11044s mo35136E0() {
        return this.f21784j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public abstract void mo35137F0();

    /* renamed from: G0 */
    public boolean mo35138G0() {
        return this.f21786l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public abstract C11062a mo35139H0(C10709c cVar);

    /* renamed from: I0 */
    public void mo35140I0(C11062a aVar, boolean z) {
        if (mo35141J0(aVar.mo35122s())) {
            this.f21776B.mo35288b();
            C11106b bVar = this.f21777G;
            double currentTimeMillis = (double) (System.currentTimeMillis() - aVar.mo35125u());
            Double.isNaN(currentTimeMillis);
            bVar.mo35290a(Math.round(currentTimeMillis / 1000.0d));
            this.f21784j.mo35022U(aVar);
            if (z) {
                this.f21784j.mo35028s(aVar.mo35122s());
            }
            if (z && this.f21788n != null) {
                C10718l lVar = new C10718l(aVar);
                for (C10719m p : this.f21788n) {
                    p.mo33953p(lVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public abstract boolean mo35141J0(String str);

    /* renamed from: L0 */
    public void mo35142L0(String str) {
        String str2 = null;
        this.f21792r = (str == null || "none".equals(str)) ? null : str;
        if (str != null && !"none".equals(str)) {
            str2 = ";" + this.f21792r + "=";
        }
        this.f21793s = str2;
    }

    /* renamed from: M0 */
    public void mo35143M0(Set<C10702c0> set) {
        HashSet hashSet = new HashSet(set);
        this.f21775A = hashSet;
        this.f21780f = hashSet.contains(C10702c0.COOKIE);
        this.f21775A.contains(C10702c0.URL);
    }

    /* renamed from: P */
    public void mo35029P(C11073g gVar) {
        this.f21782h = gVar;
    }

    /* renamed from: Y */
    public boolean mo35030Y() {
        return this.f21799y;
    }

    /* renamed from: a0 */
    public String mo35031a0() {
        return this.f21793s;
    }

    /* renamed from: c0 */
    public C10713g mo35032c0(String str) {
        C11062a C0 = mo35134C0(mo35136E0().mo35027n0(str));
        if (C0 != null && !C0.mo35127w().equals(str)) {
            C0.mo35103A(true);
        }
        return C0;
    }

    /* renamed from: d0 */
    public C10895g mo35033d0(C10713g gVar, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        C11062a c = ((C11066b) gVar).mo35109c();
        if (!c.mo35110d(currentTimeMillis) || !mo35037o()) {
            return null;
        }
        if (!c.mo35129y() && (mo35038o0().mo33894a() <= 0 || mo35133B0() <= 0 || (currentTimeMillis - c.mo35123t()) / 1000 <= ((long) mo35133B0()))) {
            return null;
        }
        C11052c.C11054b bVar = this.f21790p;
        C10895g w = mo35039w(gVar, bVar == null ? MiotCloudImpl.COOKIE_PATH : bVar.mo33959e(), z);
        c.mo35115l();
        c.mo35103A(false);
        return w;
    }

    /* renamed from: f0 */
    public C10713g mo35034f0(C10709c cVar) {
        C11062a H0 = mo35139H0(cVar);
        H0.mo35104B(this.f21781g);
        mo35145z0(H0, true);
        return H0;
    }

    /* renamed from: i0 */
    public void mo35035i0(C10713g gVar) {
        ((C11066b) gVar).mo35109c().mo35114k();
    }

    /* renamed from: m */
    public String mo35036m(C10713g gVar) {
        return ((C11066b) gVar).mo35109c().mo35127w();
    }

    /* renamed from: o */
    public boolean mo35037o() {
        return this.f21780f;
    }

    /* renamed from: o0 */
    public C10700b0 mo35038o0() {
        return this.f21778H;
    }

    /* renamed from: p0 */
    public void mo34262p0() {
        String d;
        this.f21790p = C11052c.m28456g1();
        this.f21789o = Thread.currentThread().getContextClassLoader();
        if (this.f21784j == null) {
            C11040p d2 = mo35135D0().mo34900d();
            synchronized (d2) {
                C11044s T0 = d2.mo35006T0();
                this.f21784j = T0;
                if (T0 == null) {
                    C11067d dVar = new C11067d();
                    this.f21784j = dVar;
                    d2.mo35017e1(dVar);
                }
            }
        }
        if (!this.f21784j.mo35452j0()) {
            this.f21784j.start();
        }
        C11052c.C11054b bVar = this.f21790p;
        if (bVar != null) {
            String d3 = bVar.mo35081d("org.eclipse.jetty.servlet.SessionCookie");
            if (d3 != null) {
                this.f21791q = d3;
            }
            String d4 = this.f21790p.mo35081d("org.eclipse.jetty.servlet.SessionIdPathParameterName");
            if (d4 != null) {
                mo35142L0(d4);
            }
            if (this.f21796v == -1 && (d = this.f21790p.mo35081d("org.eclipse.jetty.servlet.MaxAge")) != null) {
                this.f21796v = Integer.parseInt(d.trim());
            }
            if (this.f21794t == null) {
                this.f21794t = this.f21790p.mo35081d("org.eclipse.jetty.servlet.SessionDomain");
            }
            if (this.f21795u == null) {
                this.f21795u = this.f21790p.mo35081d("org.eclipse.jetty.servlet.SessionPath");
            }
            String d5 = this.f21790p.mo35081d("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding");
            if (d5 != null) {
                this.f21799y = Boolean.parseBoolean(d5);
            }
        }
        super.mo34262p0();
    }

    /* renamed from: q0 */
    public void mo34263q0() {
        super.mo34263q0();
        mo35137F0();
        this.f21789o = null;
    }

    /* renamed from: w */
    public C10895g mo35039w(C10713g gVar, String str, boolean z) {
        C10895g gVar2;
        if (!mo35037o()) {
            return null;
        }
        String str2 = this.f21795u;
        if (str2 != null) {
            str = str2;
        }
        if (str == null || str.length() == 0) {
            str = MiotCloudImpl.COOKIE_PATH;
        }
        String str3 = str;
        String m = mo35036m(gVar);
        if (this.f21800z == null) {
            gVar2 = new C10895g(this.f21791q, m, this.f21794t, str3, this.f21778H.mo33894a(), this.f21778H.mo33895b(), this.f21778H.mo33896c() || (mo35138G0() && z));
        } else {
            gVar2 = new C10895g(this.f21791q, m, this.f21794t, str3, this.f21778H.mo33894a(), this.f21778H.mo33895b(), this.f21778H.mo33896c() || (mo35138G0() && z), this.f21800z, 1);
        }
        return gVar2;
    }

    /* renamed from: x */
    public boolean mo35040x(C10713g gVar) {
        return ((C11066b) gVar).mo35109c().mo35130z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public abstract void mo35144y0(C11062a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public void mo35145z0(C11062a aVar, boolean z) {
        synchronized (this.f21784j) {
            this.f21784j.mo35025k(aVar);
            mo35144y0(aVar);
        }
        if (z) {
            this.f21776B.mo35289c();
            if (this.f21788n != null) {
                C10718l lVar = new C10718l(aVar);
                for (C10719m j : this.f21788n) {
                    j.mo33952j(lVar);
                }
            }
        }
    }
}
