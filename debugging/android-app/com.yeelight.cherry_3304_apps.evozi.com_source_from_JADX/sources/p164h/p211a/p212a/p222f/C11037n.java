package p164h.p211a.p212a.p222f;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Locale;
import java.util.Map;
import p154d.p155b.C10697a;
import p154d.p155b.C10701c;
import p154d.p155b.C10724j;
import p154d.p155b.C10727m;
import p154d.p155b.C10731q;
import p154d.p155b.C10735u;
import p154d.p155b.C10736v;
import p154d.p155b.C10737w;
import p154d.p155b.C10738x;
import p154d.p155b.C10740z;
import p154d.p155b.C4316d;
import p154d.p155b.p204f0.C10707a;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10713g;
import p164h.p211a.p212a.p215b.C10887b;
import p164h.p211a.p212a.p216c.C10895g;
import p164h.p211a.p212a.p216c.C10897i;
import p164h.p211a.p212a.p216c.C10910l;
import p164h.p211a.p212a.p216c.C10918r;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p217d.p219v.C10956c;
import p164h.p211a.p212a.p217d.p219v.C10957d;
import p164h.p211a.p212a.p222f.C11010b;
import p164h.p211a.p212a.p222f.C11018d;
import p164h.p211a.p212a.p222f.C11046u;
import p164h.p211a.p212a.p222f.p224w.C11052c;
import p164h.p211a.p212a.p228h.C11100b;
import p164h.p211a.p212a.p228h.C11104c;
import p164h.p211a.p212a.p228h.C11126j;
import p164h.p211a.p212a.p228h.C11128l;
import p164h.p211a.p212a.p228h.C11129m;
import p164h.p211a.p212a.p228h.C11130n;
import p164h.p211a.p212a.p228h.C11139s;
import p164h.p211a.p212a.p228h.C11140t;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.n */
public class C11037n implements C10709c {

    /* renamed from: P */
    private static final C11158c f21634P = C11156b.m29015a(C11037n.class);

    /* renamed from: A */
    private String f21635A;

    /* renamed from: B */
    private Object f21636B;

    /* renamed from: C */
    private String f21637C;

    /* renamed from: D */
    private boolean f21638D = false;

    /* renamed from: E */
    private String f21639E;

    /* renamed from: F */
    private Map<Object, C10713g> f21640F;

    /* renamed from: G */
    private String f21641G = "http";

    /* renamed from: H */
    private C11046u.C11047a f21642H;

    /* renamed from: I */
    private String f21643I;

    /* renamed from: J */
    private String f21644J;

    /* renamed from: K */
    private C10713g f21645K;

    /* renamed from: L */
    private C11045t f21646L;

    /* renamed from: M */
    private long f21647M;

    /* renamed from: N */
    private C10929e f21648N;

    /* renamed from: O */
    private C10918r f21649O;

    /* renamed from: a */
    protected final C11015c f21650a = new C11015c();

    /* renamed from: b */
    private boolean f21651b = true;

    /* renamed from: c */
    private volatile C11100b f21652c;

    /* renamed from: d */
    private C11018d f21653d;

    /* renamed from: e */
    private C11129m<String> f21654e;

    /* renamed from: f */
    private String f21655f;

    /* renamed from: g */
    protected C11010b f21656g;

    /* renamed from: h */
    private C11052c.C11054b f21657h;

    /* renamed from: i */
    private boolean f21658i;

    /* renamed from: j */
    private String f21659j;

    /* renamed from: k */
    private C11029g f21660k;

    /* renamed from: l */
    private boolean f21661l = false;

    /* renamed from: m */
    private C4316d f21662m;

    /* renamed from: n */
    private boolean f21663n = false;

    /* renamed from: o */
    private C10942n f21664o;

    /* renamed from: p */
    private boolean f21665p = false;

    /* renamed from: q */
    private int f21666q = 0;

    /* renamed from: r */
    private String f21667r;

    /* renamed from: s */
    private C11129m<String> f21668s;

    /* renamed from: t */
    private boolean f21669t;

    /* renamed from: u */
    private String f21670u;

    /* renamed from: v */
    private int f21671v;

    /* renamed from: w */
    private String f21672w = "HTTP/1.1";

    /* renamed from: x */
    private String f21673x;

    /* renamed from: y */
    private String f21674y;

    /* renamed from: z */
    private BufferedReader f21675z;

    /* renamed from: h.a.a.f.n$a */
    public static class C11038a implements C10738x {
        /* renamed from: A */
        public void mo33979A(C10737w wVar) {
            C11130n nVar = (C11130n) wVar.mo33978b().mo33964a("org.eclipse.multiPartInputStream");
            if (nVar != null && ((C11052c.C11054b) wVar.mo33978b().mo33964a("org.eclipse.multiPartContext")) == wVar.mo33977a()) {
                try {
                    nVar.mo35405a();
                } catch (C11128l e) {
                    wVar.mo33977a().log("Errors deleting multipart tmp files", e);
                }
            }
        }

        /* renamed from: E */
        public void mo33980E(C10737w wVar) {
        }
    }

    static {
        Collections.singleton(Locale.getDefault());
    }

    public C11037n() {
    }

    public C11037n(C11010b bVar) {
        mo34965k0(bVar);
    }

    /* renamed from: A */
    public String mo34919A() {
        C11018d dVar = this.f21653d;
        if (dVar instanceof C11018d.C11023e) {
            mo34963i0(((C11018d.C11023e) dVar).mo34771J(this));
        }
        C11018d dVar2 = this.f21653d;
        if (dVar2 instanceof C11018d.C11025g) {
            return ((C11018d.C11025g) dVar2).mo34766c();
        }
        return null;
    }

    /* renamed from: A0 */
    public void mo34920A0(String str) {
        this.f21641G = str;
    }

    /* renamed from: B */
    public C11018d mo34921B() {
        return this.f21653d;
    }

    /* renamed from: B0 */
    public void mo34922B0(String str) {
        this.f21643I = str;
    }

    /* renamed from: C */
    public String mo34923C() {
        return this.f21655f;
    }

    /* renamed from: C0 */
    public void mo34924C0(int i) {
        this.f21671v = i;
    }

    /* renamed from: D */
    public C11010b mo34925D() {
        return this.f21656g;
    }

    /* renamed from: D0 */
    public void mo34926D0(String str) {
        this.f21644J = str;
    }

    /* renamed from: E */
    public int mo34927E() {
        return (int) this.f21656g.mo34850w().mo34477t(C10910l.f21154f);
    }

    /* renamed from: E0 */
    public void mo34928E0(C10713g gVar) {
        this.f21645K = gVar;
    }

    /* renamed from: F */
    public C11052c.C11054b mo34929F() {
        return this.f21657h;
    }

    /* renamed from: F0 */
    public void mo34930F0(C11045t tVar) {
        this.f21646L = tVar;
    }

    /* renamed from: G */
    public C4316d mo34931G() {
        return this.f21662m;
    }

    /* renamed from: G0 */
    public void mo34932G0(long j) {
        this.f21647M = j;
    }

    /* renamed from: H */
    public String mo34933H() {
        C10942n nVar = this.f21664o;
        if (nVar == null) {
            return null;
        }
        if (this.f21663n) {
            return nVar.mo34363m();
        }
        String q = nVar.mo34367q();
        if (q == null || q.indexOf(58) < 0) {
            return q;
        }
        return "[" + q + "]";
    }

    /* renamed from: H0 */
    public void mo34934H0(C10918r rVar) {
        this.f21649O = rVar;
    }

    /* renamed from: I */
    public int mo34935I() {
        C10942n nVar = this.f21664o;
        if (nVar == null) {
            return 0;
        }
        return nVar.mo34354f();
    }

    /* renamed from: I0 */
    public void mo34936I0(C11046u.C11047a aVar) {
        this.f21642H = aVar;
    }

    /* renamed from: J */
    public C11129m<String> mo34937J() {
        return this.f21668s;
    }

    /* renamed from: J0 */
    public boolean mo34938J0() {
        boolean z = this.f21658i;
        this.f21658i = false;
        return z;
    }

    /* renamed from: K */
    public String mo34939K() {
        return this.f21672w;
    }

    /* renamed from: L */
    public String mo34940L() {
        return this.f21673x;
    }

    /* renamed from: M */
    public C11046u mo34941M() {
        C11018d dVar = this.f21653d;
        if (dVar instanceof C11018d.C11025g) {
            return ((C11018d.C11025g) dVar).mo34765a();
        }
        return null;
    }

    /* renamed from: N */
    public C11039o mo34942N() {
        return this.f21656g.f21564n;
    }

    /* renamed from: O */
    public StringBuilder mo34943O() {
        StringBuilder sb = new StringBuilder(48);
        String P = mo34944P();
        int Q = mo34945Q();
        sb.append(P);
        sb.append("://");
        sb.append(mo33972q());
        if (Q > 0 && ((P.equalsIgnoreCase("http") && Q != 80) || (P.equalsIgnoreCase("https") && Q != 443))) {
            sb.append(':');
            sb.append(Q);
        }
        return sb;
    }

    /* renamed from: P */
    public String mo34944P() {
        return this.f21641G;
    }

    /* renamed from: Q */
    public int mo34945Q() {
        int f;
        C10918r rVar;
        if (this.f21671v <= 0) {
            if (this.f21643I == null) {
                mo33972q();
            }
            if (this.f21671v <= 0) {
                if (this.f21643I == null || (rVar = this.f21649O) == null) {
                    C10942n nVar = this.f21664o;
                    f = nVar == null ? 0 : nVar.mo34354f();
                } else {
                    f = rVar.mo34427k();
                }
                this.f21671v = f;
            }
        }
        int i = this.f21671v;
        return i <= 0 ? mo34944P().equalsIgnoreCase("https") ? 443 : 80 : i;
    }

    /* renamed from: R */
    public C10727m mo34946R() {
        return this.f21657h;
    }

    /* renamed from: S */
    public String mo34947S() {
        C11046u.C11047a aVar = this.f21642H;
        if (aVar != null) {
            return aVar.getName();
        }
        return null;
    }

    /* renamed from: T */
    public C10740z mo34948T() {
        return this.f21656g.mo34853z();
    }

    /* renamed from: U */
    public C11045t mo34949U() {
        return this.f21646L;
    }

    /* renamed from: V */
    public long mo34950V() {
        return this.f21647M;
    }

    /* renamed from: W */
    public C10929e mo34951W() {
        if (this.f21648N == null) {
            long j = this.f21647M;
            if (j > 0) {
                this.f21648N = C10897i.f21107e.mo34623g(j);
            }
        }
        return this.f21648N;
    }

    /* renamed from: X */
    public C11046u.C11047a mo34952X() {
        return this.f21642H;
    }

    /* renamed from: Y */
    public boolean mo34953Y() {
        return this.f21651b;
    }

    /* renamed from: Z */
    public boolean mo34954Z() {
        return this.f21665p;
    }

    /* renamed from: a */
    public Object mo33964a(String str) {
        if ("org.eclipse.jetty.io.EndPoint.maxIdleTime".equalsIgnoreCase(str)) {
            return new Long((long) mo34925D().mo34605g().mo34356g());
        }
        Object a = this.f21652c == null ? null : this.f21652c.mo34251a(str);
        return (a != null || !"org.eclipse.jetty.continuation".equals(str)) ? a : this.f21650a;
    }

    /* renamed from: a0 */
    public boolean mo34955a0() {
        return this.f21637C != null && this.f21638D;
    }

    /* renamed from: b */
    public void mo33965b(String str, Object obj) {
        String str2 = null;
        Object a = this.f21652c == null ? null : this.f21652c.mo34251a(str);
        if (str.startsWith("org.eclipse.jetty.")) {
            if ("org.eclipse.jetty.server.Request.queryEncoding".equals(str)) {
                if (obj != null) {
                    str2 = obj.toString();
                }
                mo34974t0(str2);
            } else if ("org.eclipse.jetty.server.sendContent".equals(str)) {
                try {
                    ((C11010b.C11012b) mo34948T().mo33888j()).mo34857h(obj);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if ("org.eclipse.jetty.server.ResponseBuffer".equals(str)) {
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    synchronized (byteBuffer) {
                        ((C11010b.C11012b) mo34948T().mo33888j()).mo34858i(byteBuffer.isDirect() ? new C10956c(byteBuffer, true) : new C10957d(byteBuffer, true));
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } else if ("org.eclipse.jetty.io.EndPoint.maxIdleTime".equalsIgnoreCase(str)) {
                try {
                    mo34925D().mo34605g().mo34360j(Integer.valueOf(obj.toString()).intValue());
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
        if (this.f21652c == null) {
            this.f21652c = new C11104c();
        }
        this.f21652c.mo34253b(str, obj);
        if (this.f21636B != null) {
            C10735u uVar = new C10735u(this.f21657h, this, str, a == null ? obj : a);
            int q = C11126j.m28890q(this.f21636B);
            for (int i = 0; i < q; i++) {
                C10736v vVar = (C10736v) C11126j.m28884j(this.f21636B, i);
                if (vVar instanceof C10736v) {
                    if (a == null) {
                        vVar.mo33975q(uVar);
                    } else if (obj == null) {
                        vVar.mo33976u(uVar);
                    } else {
                        vVar.mo33974m(uVar);
                    }
                }
            }
        }
    }

    /* renamed from: b0 */
    public void mo34956b0(String str) {
        boolean z;
        StringBuilder sb;
        C11129m mVar = new C11129m();
        C11140t.m28947f(str, mVar, "UTF-8");
        if (!this.f21669t) {
            mo34980x();
        }
        C11129m<String> mVar2 = this.f21668s;
        if (mVar2 == null || mVar2.size() <= 0) {
            z = false;
        } else {
            z = false;
            for (Map.Entry next : this.f21668s.entrySet()) {
                String str2 = (String) next.getKey();
                if (mVar.containsKey(str2)) {
                    z = true;
                }
                Object value = next.getValue();
                for (int i = 0; i < C11126j.m28890q(value); i++) {
                    mVar.mo35384a(str2, C11126j.m28884j(value, i));
                }
            }
        }
        String str3 = this.f21674y;
        if (str3 != null && str3.length() > 0) {
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                C11129m mVar3 = new C11129m();
                C11140t.m28947f(this.f21674y, mVar3, mo34940L());
                C11129m mVar4 = new C11129m();
                C11140t.m28947f(str, mVar4, "UTF-8");
                for (Map.Entry entry : mVar3.entrySet()) {
                    String str4 = (String) entry.getKey();
                    if (!mVar4.containsKey(str4)) {
                        Object value2 = entry.getValue();
                        for (int i2 = 0; i2 < C11126j.m28890q(value2); i2++) {
                            sb2.append("&");
                            sb2.append(str4);
                            sb2.append("=");
                            sb2.append(C11126j.m28884j(value2, i2));
                        }
                    }
                }
                sb = new StringBuilder();
                sb.append(str);
                sb.append(sb2);
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append("&");
                sb.append(this.f21674y);
            }
            str = sb.toString();
        }
        mo34971q0(mVar);
        mo34976u0(str);
    }

    /* renamed from: c */
    public boolean mo33966c() {
        return this.f21656g.mo34826E(this);
    }

    /* renamed from: c0 */
    public C10713g mo34957c0(Object obj) {
        Map<Object, C10713g> map = this.f21640F;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    /* renamed from: d */
    public C10731q mo33967d() {
        int i = this.f21666q;
        if (i == 0 || i == 1) {
            this.f21666q = 1;
            return this.f21656g.mo34844q();
        }
        throw new IllegalStateException("READER");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo34958d0() {
        if (this.f21666q == 2) {
            try {
                BufferedReader bufferedReader = this.f21675z;
                while (bufferedReader.read() != -1) {
                    bufferedReader = this.f21675z;
                }
            } catch (Exception e) {
                f21634P.mo35488d(e);
                this.f21675z = null;
            }
        }
        mo34963i0(C11018d.f21600D);
        this.f21650a.mo34874t();
        this.f21651b = true;
        this.f21665p = false;
        if (this.f21657h == null) {
            if (this.f21652c != null) {
                this.f21652c.mo34249Z();
            }
            this.f21655f = null;
            this.f21659j = null;
            C11029g gVar = this.f21660k;
            if (gVar != null) {
                gVar.mo34897d();
            }
            this.f21661l = false;
            this.f21657h = null;
            this.f21643I = null;
            this.f21667r = null;
            this.f21670u = null;
            this.f21671v = 0;
            this.f21672w = "HTTP/1.1";
            this.f21673x = null;
            this.f21674y = null;
            this.f21637C = null;
            this.f21638D = false;
            this.f21645K = null;
            this.f21646L = null;
            this.f21639E = null;
            this.f21642H = null;
            this.f21641G = "http";
            this.f21644J = null;
            this.f21647M = 0;
            this.f21648N = null;
            this.f21649O = null;
            C11129m<String> mVar = this.f21654e;
            if (mVar != null) {
                mVar.clear();
            }
            this.f21668s = null;
            this.f21669t = false;
            this.f21666q = 0;
            Map<Object, C10713g> map = this.f21640F;
            if (map != null) {
                map.clear();
            }
            this.f21640F = null;
            return;
        }
        throw new IllegalStateException("Request in context!");
    }

    /* renamed from: e */
    public String mo33917e() {
        return this.f21659j;
    }

    /* renamed from: e0 */
    public void mo34959e0(String str) {
        Object a = this.f21652c == null ? null : this.f21652c.mo34251a(str);
        if (this.f21652c != null) {
            this.f21652c.mo34256e(str);
        }
        if (a != null && this.f21636B != null) {
            C10735u uVar = new C10735u(this.f21657h, this, str, a);
            int q = C11126j.m28890q(this.f21636B);
            for (int i = 0; i < q; i++) {
                C10736v vVar = (C10736v) C11126j.m28884j(this.f21636B, i);
                if (vVar instanceof C10736v) {
                    vVar.mo33976u(uVar);
                }
            }
        }
    }

    /* renamed from: f */
    public C10707a[] mo33918f() {
        if (this.f21661l) {
            C11029g gVar = this.f21660k;
            if (gVar == null) {
                return null;
            }
            return gVar.mo34895b();
        }
        this.f21661l = true;
        Enumeration<String> x = this.f21656g.mo34850w().mo34482x(C10910l.f21161m);
        if (x != null) {
            if (this.f21660k == null) {
                this.f21660k = new C11029g();
            }
            while (x.hasMoreElements()) {
                this.f21660k.mo34894a(x.nextElement());
            }
        }
        C11029g gVar2 = this.f21660k;
        if (gVar2 == null) {
            return null;
        }
        return gVar2.mo34895b();
    }

    /* renamed from: f0 */
    public void mo34960f0(EventListener eventListener) {
        this.f21636B = C11126j.m28888o(this.f21636B, eventListener);
    }

    /* renamed from: g */
    public Enumeration mo33919g() {
        return this.f21656g.mo34850w().mo34475r();
    }

    /* renamed from: g0 */
    public void mo34961g0(boolean z) {
        this.f21651b = z;
    }

    public String getContentType() {
        return this.f21656g.mo34850w().mo34480v(C10910l.f21157i);
    }

    /* renamed from: h */
    public String mo33920h() {
        return this.f21670u;
    }

    /* renamed from: h0 */
    public void mo34962h0(C11100b bVar) {
        this.f21652c = bVar;
    }

    /* renamed from: i */
    public String mo33969i() {
        String str = this.f21635A;
        if (str != null) {
            return str;
        }
        C10942n nVar = this.f21664o;
        if (nVar == null) {
            return null;
        }
        return nVar.mo34358i();
    }

    /* renamed from: i0 */
    public void mo34963i0(C11018d dVar) {
        this.f21653d = dVar;
    }

    /* renamed from: j */
    public C10724j mo33970j(String str) {
        if (str == null || this.f21657h == null) {
            return null;
        }
        String str2 = MiotCloudImpl.COOKIE_PATH;
        if (!str.startsWith(str2)) {
            String a = C11139s.m28935a(this.f21644J, this.f21670u);
            int lastIndexOf = a.lastIndexOf(str2);
            if (lastIndexOf > 1) {
                str2 = a.substring(0, lastIndexOf + 1);
            }
            str = C11139s.m28935a(str2, str);
        }
        return this.f21657h.mo35083g(str);
    }

    /* renamed from: j0 */
    public void mo34964j0(String str) {
        this.f21655f = str;
    }

    /* renamed from: k */
    public String mo33921k() {
        return this.f21637C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public final void mo34965k0(C11010b bVar) {
        this.f21656g = bVar;
        this.f21650a.mo34878w(bVar);
        this.f21664o = bVar.mo34605g();
        this.f21663n = bVar.mo34852y();
    }

    /* renamed from: l */
    public Enumeration mo33922l(String str) {
        Enumeration<String> w = this.f21656g.mo34850w().mo34481w(str);
        return w == null ? Collections.enumeration(Collections.EMPTY_LIST) : w;
    }

    /* renamed from: l0 */
    public void mo34966l0(C11052c.C11054b bVar) {
        this.f21658i = this.f21657h != bVar;
        this.f21657h = bVar;
    }

    /* renamed from: m */
    public String mo33923m() {
        return this.f21667r;
    }

    /* renamed from: m0 */
    public void mo34967m0(String str) {
        this.f21659j = str;
    }

    /* renamed from: n */
    public StringBuffer mo33924n() {
        StringBuffer stringBuffer = new StringBuffer(48);
        synchronized (stringBuffer) {
            String P = mo34944P();
            int Q = mo34945Q();
            stringBuffer.append(P);
            stringBuffer.append("://");
            stringBuffer.append(mo33972q());
            if (this.f21671v > 0 && ((P.equalsIgnoreCase("http") && Q != 80) || (P.equalsIgnoreCase("https") && Q != 443))) {
                stringBuffer.append(':');
                stringBuffer.append(this.f21671v);
            }
            stringBuffer.append(mo33929v());
        }
        return stringBuffer;
    }

    /* renamed from: n0 */
    public void mo34968n0(C4316d dVar) {
        this.f21662m = dVar;
    }

    /* renamed from: o */
    public String mo33971o(String str) {
        if (!this.f21669t) {
            mo34980x();
        }
        return (String) this.f21668s.mo35385b(str, 0);
    }

    /* renamed from: o0 */
    public void mo34969o0(boolean z) {
        this.f21665p = z;
    }

    /* renamed from: p */
    public C10713g mo33925p(boolean z) {
        C10713g gVar = this.f21645K;
        if (gVar != null) {
            C11045t tVar = this.f21646L;
            if (tVar == null || tVar.mo35040x(gVar)) {
                return this.f21645K;
            }
            this.f21645K = null;
        }
        if (!z) {
            return null;
        }
        C11045t tVar2 = this.f21646L;
        if (tVar2 != null) {
            C10713g f0 = tVar2.mo35034f0(this);
            this.f21645K = f0;
            C10895g w = this.f21646L.mo35039w(f0, mo33917e(), mo33966c());
            if (w != null) {
                this.f21656g.mo34853z().mo34987o(w);
            }
            return this.f21645K;
        }
        throw new IllegalStateException("No SessionManager");
    }

    /* renamed from: p0 */
    public void mo34970p0(String str) {
        this.f21667r = str;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073 A[Catch:{ IOException -> 0x0082 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo33972q() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f21643I
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            h.a.a.c.r r0 = r5.f21649O
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r0.mo34424h()
            r5.f21643I = r0
            h.a.a.c.r r0 = r5.f21649O
            int r0 = r0.mo34427k()
            r5.f21671v = r0
            java.lang.String r0 = r5.f21643I
            if (r0 == 0) goto L_0x001c
            return r0
        L_0x001c:
            h.a.a.f.b r0 = r5.f21656g
            h.a.a.c.i r0 = r0.mo34850w()
            h.a.a.d.e r1 = p164h.p211a.p212a.p216c.C10910l.f21153e
            h.a.a.d.e r0 = r0.mo34473n(r1)
            if (r0 == 0) goto L_0x009d
            int r1 = r0.mo34562S0()
        L_0x002e:
            int r2 = r1 + -1
            int r3 = r0.getIndex()
            if (r1 <= r3) goto L_0x0089
            byte r1 = r0.mo34606X(r2)
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r3 = 58
            if (r1 == r3) goto L_0x0047
            r3 = 93
            if (r1 == r3) goto L_0x0089
            r1 = r2
            goto L_0x002e
        L_0x0047:
            int r1 = r0.getIndex()
            int r3 = r0.getIndex()
            int r3 = r2 - r3
            h.a.a.d.e r1 = r0.mo34582i(r1, r3)
            java.lang.String r1 = p164h.p211a.p212a.p217d.C10934h.m27670f(r1)
            r5.f21643I = r1
            int r1 = r2 + 1
            r3 = 1
            int r4 = r0.mo34562S0()     // Catch:{ NumberFormatException -> 0x006f }
            int r4 = r4 - r2
            int r4 = r4 - r3
            h.a.a.d.e r0 = r0.mo34582i(r1, r4)     // Catch:{ NumberFormatException -> 0x006f }
            int r0 = p164h.p211a.p212a.p217d.C10934h.m27672h(r0)     // Catch:{ NumberFormatException -> 0x006f }
            r5.f21671v = r0     // Catch:{ NumberFormatException -> 0x006f }
            goto L_0x007f
        L_0x006f:
            h.a.a.f.b r0 = r5.f21656g     // Catch:{ IOException -> 0x0082 }
            if (r0 == 0) goto L_0x007f
            h.a.a.f.b r0 = r5.f21656g     // Catch:{ IOException -> 0x0082 }
            h.a.a.c.c r0 = r0.f21562l     // Catch:{ IOException -> 0x0082 }
            r1 = 400(0x190, float:5.6E-43)
            java.lang.String r2 = "Bad Host header"
            r4 = 0
            r0.mo34405m(r1, r2, r4, r3)     // Catch:{ IOException -> 0x0082 }
        L_0x007f:
            java.lang.String r0 = r5.f21643I
            return r0
        L_0x0082:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0089:
            java.lang.String r1 = r5.f21643I
            if (r1 == 0) goto L_0x0091
            int r1 = r5.f21671v
            if (r1 >= 0) goto L_0x009a
        L_0x0091:
            java.lang.String r0 = p164h.p211a.p212a.p217d.C10934h.m27670f(r0)
            r5.f21643I = r0
            r0 = 0
            r5.f21671v = r0
        L_0x009a:
            java.lang.String r0 = r5.f21643I
            return r0
        L_0x009d:
            h.a.a.f.b r0 = r5.f21656g
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = r5.mo34933H()
            r5.f21643I = r0
            int r0 = r5.mo34935I()
            r5.f21671v = r0
            java.lang.String r0 = r5.f21643I
            if (r0 == 0) goto L_0x00bc
            java.lang.String r1 = "0.0.0.0"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = r5.f21643I
            return r0
        L_0x00bc:
            java.net.InetAddress r0 = java.net.InetAddress.getLocalHost()     // Catch:{ UnknownHostException -> 0x00c7 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x00c7 }
            r5.f21643I = r0     // Catch:{ UnknownHostException -> 0x00c7 }
            goto L_0x00cd
        L_0x00c7:
            r0 = move-exception
            h.a.a.h.y.c r1 = f21634P
            r1.mo35488d(r0)
        L_0x00cd:
            java.lang.String r0 = r5.f21643I
            return r0
        L_0x00d0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No uri"
            r0.<init>(r1)
            goto L_0x00d9
        L_0x00d8:
            throw r0
        L_0x00d9:
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11037n.mo33972q():java.lang.String");
    }

    /* renamed from: q0 */
    public void mo34971q0(C11129m<String> mVar) {
        if (mVar == null) {
            mVar = this.f21654e;
        }
        this.f21668s = mVar;
        if (this.f21669t && mVar == null) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: r */
    public String mo33926r(String str) {
        return this.f21656g.mo34850w().mo34479u(str);
    }

    /* renamed from: r0 */
    public void mo34972r0(String str) {
        this.f21670u = str;
    }

    /* renamed from: s */
    public String mo33927s() {
        if (this.f21644J == null) {
            this.f21644J = "";
        }
        return this.f21644J;
    }

    /* renamed from: s0 */
    public void mo34973s0(String str) {
        this.f21672w = str;
    }

    /* renamed from: t */
    public String mo33928t() {
        C10918r rVar;
        if (this.f21674y == null && (rVar = this.f21649O) != null) {
            String str = this.f21673x;
            this.f21674y = str == null ? rVar.mo34428l() : rVar.mo34536m(str);
        }
        return this.f21674y;
    }

    /* renamed from: t0 */
    public void mo34974t0(String str) {
        this.f21673x = str;
        this.f21674y = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21665p ? "[" : "(");
        sb.append(mo33923m());
        sb.append(" ");
        sb.append(this.f21649O);
        sb.append(this.f21665p ? "]@" : ")@");
        sb.append(hashCode());
        sb.append(" ");
        sb.append(super.toString());
        return sb.toString();
    }

    /* renamed from: u */
    public C10697a mo33973u() {
        if (this.f21651b) {
            this.f21650a.mo34879x();
            return this.f21650a;
        }
        throw new IllegalStateException("!asyncSupported");
    }

    /* renamed from: u0 */
    public void mo34976u0(String str) {
        this.f21674y = str;
        this.f21673x = null;
    }

    /* renamed from: v */
    public String mo33929v() {
        C10918r rVar;
        if (this.f21639E == null && (rVar = this.f21649O) != null) {
            this.f21639E = rVar.mo34426j();
        }
        return this.f21639E;
    }

    /* renamed from: v0 */
    public void mo34977v0(String str) {
        this.f21635A = str;
    }

    /* renamed from: w */
    public void mo34978w(EventListener eventListener) {
        if (eventListener instanceof C10736v) {
            this.f21636B = C11126j.m28879b(this.f21636B, eventListener);
        }
        if (eventListener instanceof C10887b) {
            throw new IllegalArgumentException(eventListener.getClass().toString());
        } else if (eventListener instanceof C10701c) {
            throw new IllegalArgumentException(eventListener.getClass().toString());
        }
    }

    /* renamed from: w0 */
    public void mo34979w0(String str) {
    }

    /* renamed from: x */
    public void mo34980x() {
        int E;
        int i;
        int i2;
        if (this.f21654e == null) {
            this.f21654e = new C11129m<>(16);
        }
        if (!this.f21669t) {
            this.f21669t = true;
            try {
                if (this.f21649O != null && this.f21649O.mo34430o()) {
                    if (this.f21673x == null) {
                        this.f21649O.mo34419b(this.f21654e);
                    } else {
                        this.f21649O.mo34420c(this.f21654e, this.f21673x);
                    }
                }
            } catch (UnsupportedEncodingException e) {
                if (f21634P.mo35485a()) {
                    f21634P.mo35495k(e);
                } else {
                    f21634P.mo35486b(e.toString(), new Object[0]);
                }
            } catch (Throwable th) {
                if (this.f21668s == null) {
                    this.f21668s = this.f21654e;
                }
                throw th;
            }
            String C = mo34923C();
            String contentType = getContentType();
            if (contentType != null && contentType.length() > 0 && "application/x-www-form-urlencoded".equalsIgnoreCase(C10897i.m27442J(contentType, (Map<String, String>) null)) && this.f21666q == 0 && (("POST".equals(mo33923m()) || "PUT".equals(mo33923m())) && (E = mo34927E()) != 0)) {
                try {
                    if (this.f21657h != null) {
                        i2 = this.f21657h.mo35080c().mo35067l1();
                        i = this.f21657h.mo35080c().mo35068m1();
                    } else {
                        Number number = (Number) this.f21656g.mo34842n().mo34807d().mo34251a("org.eclipse.jetty.server.Request.maxFormContentSize");
                        i2 = number == null ? 200000 : number.intValue();
                        Number number2 = (Number) this.f21656g.mo34842n().mo34807d().mo34251a("org.eclipse.jetty.server.Request.maxFormKeys");
                        i = number2 == null ? 1000 : number2.intValue();
                    }
                    if (E > i2) {
                        if (i2 > 0) {
                            throw new IllegalStateException("Form too large" + E + ">" + i2);
                        }
                    }
                    C10731q d = mo33967d();
                    C11129m<String> mVar = this.f21654e;
                    if (E >= 0) {
                        i2 = -1;
                    }
                    C11140t.m28946e(d, mVar, C, i2, i);
                } catch (IOException e2) {
                    if (f21634P.mo35485a()) {
                        f21634P.mo35495k(e2);
                    } else {
                        f21634P.mo35486b(e2.toString(), new Object[0]);
                    }
                }
            }
            if (this.f21668s == null) {
                this.f21668s = this.f21654e;
            } else if (this.f21668s != this.f21654e) {
                for (Map.Entry next : this.f21654e.entrySet()) {
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    for (int i3 = 0; i3 < C11126j.m28890q(value); i3++) {
                        this.f21668s.mo35384a(str, C11126j.m28884j(value, i3));
                    }
                }
            }
            if (this.f21668s == null) {
                this.f21668s = this.f21654e;
            }
        } else if (this.f21668s == null) {
            this.f21668s = this.f21654e;
        }
    }

    /* renamed from: x0 */
    public void mo34981x0(String str) {
        this.f21639E = str;
    }

    /* renamed from: y */
    public C11015c mo34982y() {
        return this.f21650a;
    }

    /* renamed from: y0 */
    public void mo34983y0(String str) {
        this.f21637C = str;
    }

    /* renamed from: z */
    public C11100b mo34984z() {
        if (this.f21652c == null) {
            this.f21652c = new C11104c();
        }
        return this.f21652c;
    }

    /* renamed from: z0 */
    public void mo34985z0(boolean z) {
        this.f21638D = z;
    }
}
