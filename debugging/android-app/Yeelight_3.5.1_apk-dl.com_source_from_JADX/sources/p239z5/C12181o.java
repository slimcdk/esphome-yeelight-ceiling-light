package p239z5;

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
import javax.servlet.DispatcherType;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestEvent;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9281e;
import javax.servlet.http.Cookie;
import org.eclipse.jetty.http.C9894g;
import org.eclipse.jetty.http.C9895h;
import org.eclipse.jetty.http.C9908k;
import org.eclipse.jetty.http.C9914p;
import org.eclipse.jetty.server.handler.C9943d;
import org.eclipse.jetty.util.C9978b;
import org.eclipse.jetty.util.C9979c;
import org.eclipse.jetty.util.C9991k;
import org.eclipse.jetty.util.C9997p;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;
import p152e6.C9001b;
import p152e6.C9003c;
import p208s4.C10349a;
import p208s4.C10351c;
import p208s4.C10356h;
import p208s4.C10359k;
import p208s4.C10361m;
import p208s4.C10365q;
import p208s4.C10366r;
import p208s4.C10368t;
import p221v5.C10546b;
import p225w5.C11940d;
import p225w5.C11950k;
import p229x5.C11985c;
import p229x5.C11986d;
import p239z5.C12151b;
import p239z5.C12159d;
import p239z5.C12193w;

/* renamed from: z5.o */
public class C12181o implements C9277a {

    /* renamed from: P */
    private static final C9003c f22437P = C9001b.m21450a(C12181o.class);

    /* renamed from: A */
    private String f22438A;

    /* renamed from: B */
    private Object f22439B;

    /* renamed from: C */
    private String f22440C;

    /* renamed from: D */
    private boolean f22441D = false;

    /* renamed from: E */
    private String f22442E;

    /* renamed from: F */
    private Map<Object, C9281e> f22443F;

    /* renamed from: G */
    private String f22444G = "http";

    /* renamed from: H */
    private C12193w.C12194a f22445H;

    /* renamed from: I */
    private String f22446I;

    /* renamed from: J */
    private String f22447J;

    /* renamed from: K */
    private C9281e f22448K;

    /* renamed from: L */
    private C12192v f22449L;

    /* renamed from: M */
    private long f22450M;

    /* renamed from: N */
    private C11940d f22451N;

    /* renamed from: O */
    private C9914p f22452O;

    /* renamed from: a */
    protected final C12156c f22453a = new C12156c();

    /* renamed from: b */
    private boolean f22454b = true;

    /* renamed from: c */
    private volatile C9978b f22455c;

    /* renamed from: d */
    private C12159d f22456d;

    /* renamed from: e */
    private MultiMap<String> f22457e;

    /* renamed from: f */
    private String f22458f;

    /* renamed from: g */
    protected C12151b f22459g;

    /* renamed from: h */
    private C9943d.C9945b f22460h;

    /* renamed from: i */
    private boolean f22461i;

    /* renamed from: j */
    private String f22462j;

    /* renamed from: k */
    private C12171g f22463k;

    /* renamed from: l */
    private boolean f22464l = false;

    /* renamed from: m */
    private DispatcherType f22465m;

    /* renamed from: n */
    private boolean f22466n = false;

    /* renamed from: o */
    private C11950k f22467o;

    /* renamed from: p */
    private boolean f22468p = false;

    /* renamed from: q */
    private int f22469q = 0;

    /* renamed from: r */
    private String f22470r;

    /* renamed from: s */
    private MultiMap<String> f22471s;

    /* renamed from: t */
    private boolean f22472t;

    /* renamed from: u */
    private String f22473u;

    /* renamed from: v */
    private int f22474v;

    /* renamed from: w */
    private String f22475w = "HTTP/1.1";

    /* renamed from: x */
    private String f22476x;

    /* renamed from: y */
    private String f22477y;

    /* renamed from: z */
    private BufferedReader f22478z;

    /* renamed from: z5.o$a */
    public static class C12182a implements C10366r {
        /* renamed from: A */
        public void mo41957A(ServletRequestEvent servletRequestEvent) {
        }

        /* renamed from: v */
        public void mo41958v(ServletRequestEvent servletRequestEvent) {
            C9991k kVar = (C9991k) servletRequestEvent.getServletRequest().mo40040a("org.eclipse.multiPartInputStream");
            if (kVar != null && ((C9943d.C9945b) servletRequestEvent.getServletRequest().mo40040a("org.eclipse.multiPartContext")) == servletRequestEvent.getServletContext()) {
                try {
                    kVar.mo40261a();
                } catch (MultiException e) {
                    servletRequestEvent.getServletContext().log("Errors deleting multipart tmp files", e);
                }
            }
        }
    }

    static {
        Collections.singleton(Locale.getDefault());
    }

    public C12181o() {
    }

    public C12181o(C12151b bVar) {
        mo43111k0(bVar);
    }

    /* renamed from: A */
    public C9978b mo43065A() {
        if (this.f22455c == null) {
            this.f22455c = new C9979c();
        }
        return this.f22455c;
    }

    /* renamed from: A0 */
    public void mo43066A0(String str) {
        this.f22444G = str;
    }

    /* renamed from: B */
    public String mo43067B() {
        C12159d dVar = this.f22456d;
        if (dVar instanceof C12159d.C12165f) {
            mo43109i0(((C12159d.C12165f) dVar).mo39903a(this));
        }
        C12159d dVar2 = this.f22456d;
        if (dVar2 instanceof C12159d.C12167h) {
            return ((C12159d.C12167h) dVar2).getAuthMethod();
        }
        return null;
    }

    /* renamed from: B0 */
    public void mo43068B0(String str) {
        this.f22446I = str;
    }

    /* renamed from: C */
    public C12159d mo43069C() {
        return this.f22456d;
    }

    /* renamed from: C0 */
    public void mo43070C0(int i) {
        this.f22474v = i;
    }

    /* renamed from: D */
    public String mo43071D() {
        return this.f22458f;
    }

    /* renamed from: D0 */
    public void mo43072D0(String str) {
        this.f22447J = str;
    }

    /* renamed from: E */
    public C12151b mo43073E() {
        return this.f22459g;
    }

    /* renamed from: E0 */
    public void mo43074E0(C9281e eVar) {
        this.f22448K = eVar;
    }

    /* renamed from: F */
    public int mo43075F() {
        return (int) this.f22459g.mo42995w().mo39801v(C9908k.f18086f);
    }

    /* renamed from: F0 */
    public void mo43076F0(C12192v vVar) {
        this.f22449L = vVar;
    }

    /* renamed from: G */
    public C9943d.C9945b mo43077G() {
        return this.f22460h;
    }

    /* renamed from: G0 */
    public void mo43078G0(long j) {
        this.f22450M = j;
    }

    /* renamed from: H */
    public DispatcherType mo43079H() {
        return this.f22465m;
    }

    /* renamed from: H0 */
    public void mo43080H0(C9914p pVar) {
        this.f22452O = pVar;
    }

    /* renamed from: I */
    public String mo43081I() {
        C11950k kVar = this.f22467o;
        if (kVar == null) {
            return null;
        }
        if (this.f22466n) {
            return kVar.mo39664m();
        }
        String q = kVar.mo39667q();
        if (q == null || q.indexOf(58) < 0) {
            return q;
        }
        return "[" + q + "]";
    }

    /* renamed from: I0 */
    public void mo43082I0(C12193w.C12194a aVar) {
        this.f22445H = aVar;
    }

    /* renamed from: J */
    public int mo43083J() {
        C11950k kVar = this.f22467o;
        if (kVar == null) {
            return 0;
        }
        return kVar.mo39654e();
    }

    /* renamed from: J0 */
    public boolean mo43084J0() {
        boolean z = this.f22461i;
        this.f22461i = false;
        return z;
    }

    /* renamed from: K */
    public MultiMap<String> mo43085K() {
        return this.f22471s;
    }

    /* renamed from: L */
    public String mo43086L() {
        return this.f22476x;
    }

    /* renamed from: M */
    public C12193w mo43087M() {
        C12159d dVar = this.f22456d;
        if (dVar instanceof C12159d.C12167h) {
            return ((C12159d.C12167h) dVar).getUserIdentity();
        }
        return null;
    }

    /* renamed from: N */
    public C12186q mo43088N() {
        return this.f22459g.f22357n;
    }

    /* renamed from: O */
    public StringBuilder mo43089O() {
        StringBuilder sb = new StringBuilder(48);
        String P = mo43090P();
        int Q = mo43091Q();
        sb.append(P);
        sb.append("://");
        sb.append(mo41952q());
        if (Q > 0 && ((P.equalsIgnoreCase("http") && Q != 80) || (P.equalsIgnoreCase("https") && Q != 443))) {
            sb.append(':');
            sb.append(Q);
        }
        return sb;
    }

    /* renamed from: P */
    public String mo43090P() {
        return this.f22444G;
    }

    /* renamed from: Q */
    public int mo43091Q() {
        int e;
        C9914p pVar;
        if (this.f22474v <= 0) {
            if (this.f22446I == null) {
                mo41952q();
            }
            if (this.f22474v <= 0) {
                if (this.f22446I == null || (pVar = this.f22452O) == null) {
                    C11950k kVar = this.f22467o;
                    e = kVar == null ? 0 : kVar.mo39654e();
                } else {
                    e = pVar.mo39748k();
                }
                this.f22474v = e;
            }
        }
        int i = this.f22474v;
        return i <= 0 ? mo43090P().equalsIgnoreCase("https") ? 443 : 80 : i;
    }

    /* renamed from: R */
    public C10359k mo43092R() {
        return this.f22460h;
    }

    /* renamed from: S */
    public String mo43093S() {
        C12193w.C12194a aVar = this.f22445H;
        if (aVar != null) {
            return aVar.getName();
        }
        return null;
    }

    /* renamed from: T */
    public C10368t mo43094T() {
        return this.f22459g.mo42998z();
    }

    /* renamed from: U */
    public C12192v mo43095U() {
        return this.f22449L;
    }

    /* renamed from: V */
    public long mo43096V() {
        return this.f22450M;
    }

    /* renamed from: W */
    public C11940d mo43097W() {
        if (this.f22451N == null) {
            long j = this.f22450M;
            if (j > 0) {
                this.f22451N = C9895h.f18036e.mo42466g(j);
            }
        }
        return this.f22451N;
    }

    /* renamed from: X */
    public C12193w.C12194a mo43098X() {
        return this.f22445H;
    }

    /* renamed from: Y */
    public boolean mo43099Y() {
        return this.f22454b;
    }

    /* renamed from: Z */
    public boolean mo43100Z() {
        return this.f22468p;
    }

    /* renamed from: a */
    public Object mo40040a(String str) {
        if ("org.eclipse.jetty.io.EndPoint.maxIdleTime".equalsIgnoreCase(str)) {
            return new Long((long) mo43073E().mo42448g().mo39655f());
        }
        Object a = this.f22455c == null ? null : this.f22455c.mo39576a(str);
        return (a != null || !"org.eclipse.jetty.continuation".equals(str)) ? a : this.f22453a;
    }

    /* renamed from: a0 */
    public boolean mo43101a0() {
        return this.f22440C != null && this.f22441D;
    }

    /* renamed from: b */
    public void mo41944b(String str, Object obj) {
        String str2 = null;
        Object a = this.f22455c == null ? null : this.f22455c.mo39576a(str);
        if (str.startsWith("org.eclipse.jetty.")) {
            if ("org.eclipse.jetty.server.Request.queryEncoding".equals(str)) {
                if (obj != null) {
                    str2 = obj.toString();
                }
                mo43120t0(str2);
            } else if ("org.eclipse.jetty.server.sendContent".equals(str)) {
                try {
                    ((C12151b.C12153b) mo43094T().mo37797h()).mo43002i(obj);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if ("org.eclipse.jetty.server.ResponseBuffer".equals(str)) {
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    synchronized (byteBuffer) {
                        ((C12151b.C12153b) mo43094T().mo37797h()).mo43003k(byteBuffer.isDirect() ? new C11985c(byteBuffer, true) : new C11986d(byteBuffer, true));
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } else if ("org.eclipse.jetty.io.EndPoint.maxIdleTime".equalsIgnoreCase(str)) {
                try {
                    mo43073E().mo42448g().mo39659i(Integer.valueOf(obj.toString()).intValue());
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
        if (this.f22455c == null) {
            this.f22455c = new C9979c();
        }
        this.f22455c.mo39578b(str, obj);
        if (this.f22439B != null) {
            ServletRequestAttributeEvent servletRequestAttributeEvent = new ServletRequestAttributeEvent(this.f22460h, this, str, a == null ? obj : a);
            int size = LazyList.size(this.f22439B);
            for (int i = 0; i < size; i++) {
                C10365q qVar = (C10365q) LazyList.get(this.f22439B, i);
                if (qVar instanceof C10365q) {
                    if (a == null) {
                        qVar.mo41955o(servletRequestAttributeEvent);
                    } else if (obj == null) {
                        qVar.mo41956r(servletRequestAttributeEvent);
                    } else {
                        qVar.mo41954l(servletRequestAttributeEvent);
                    }
                }
            }
        }
    }

    /* renamed from: b0 */
    public void mo43102b0(String str) {
        boolean z;
        StringBuilder sb;
        MultiMap multiMap = new MultiMap();
        UrlEncoded.decodeTo(str, multiMap, "UTF-8");
        if (!this.f22472t) {
            mo43127y();
        }
        MultiMap<String> multiMap2 = this.f22471s;
        if (multiMap2 == null || multiMap2.size() <= 0) {
            z = false;
        } else {
            z = false;
            for (Map.Entry next : this.f22471s.entrySet()) {
                String str2 = (String) next.getKey();
                if (multiMap.containsKey(str2)) {
                    z = true;
                }
                Object value = next.getValue();
                for (int i = 0; i < LazyList.size(value); i++) {
                    multiMap.add(str2, LazyList.get(value, i));
                }
            }
        }
        String str3 = this.f22477y;
        if (str3 != null && str3.length() > 0) {
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                MultiMap multiMap3 = new MultiMap();
                UrlEncoded.decodeTo(this.f22477y, multiMap3, mo43086L());
                MultiMap multiMap4 = new MultiMap();
                UrlEncoded.decodeTo(str, multiMap4, "UTF-8");
                for (Map.Entry entry : multiMap3.entrySet()) {
                    String str4 = (String) entry.getKey();
                    if (!multiMap4.containsKey(str4)) {
                        Object value2 = entry.getValue();
                        for (int i2 = 0; i2 < LazyList.size(value2); i2++) {
                            sb2.append("&");
                            sb2.append(str4);
                            sb2.append("=");
                            sb2.append(LazyList.get(value2, i2));
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
                sb.append(this.f22477y);
            }
            str = sb.toString();
        }
        mo43117q0(multiMap);
        mo43122u0(str);
    }

    /* renamed from: c */
    public boolean mo41945c() {
        return this.f22459g.mo42971G(this);
    }

    /* renamed from: c0 */
    public C9281e mo43103c0(Object obj) {
        Map<Object, C9281e> map = this.f22443F;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    /* renamed from: d */
    public C10361m mo41946d() {
        int i = this.f22469q;
        if (i == 0 || i == 1) {
            this.f22469q = 1;
            return this.f22459g.mo42989q();
        }
        throw new IllegalStateException("READER");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo43104d0() {
        if (this.f22469q == 2) {
            try {
                BufferedReader bufferedReader = this.f22478z;
                while (bufferedReader.read() != -1) {
                    bufferedReader = this.f22478z;
                }
            } catch (Exception e) {
                f22437P.mo36849d(e);
                this.f22478z = null;
            }
        }
        mo43109i0(C12159d.f22393N);
        this.f22453a.mo43024w();
        this.f22454b = true;
        this.f22468p = false;
        if (this.f22460h == null) {
            if (this.f22455c != null) {
                this.f22455c.mo39579b0();
            }
            this.f22458f = null;
            this.f22462j = null;
            C12171g gVar = this.f22463k;
            if (gVar != null) {
                gVar.mo43041d();
            }
            this.f22464l = false;
            this.f22460h = null;
            this.f22446I = null;
            this.f22470r = null;
            this.f22473u = null;
            this.f22474v = 0;
            this.f22475w = "HTTP/1.1";
            this.f22476x = null;
            this.f22477y = null;
            this.f22440C = null;
            this.f22441D = false;
            this.f22448K = null;
            this.f22449L = null;
            this.f22442E = null;
            this.f22445H = null;
            this.f22444G = "http";
            this.f22447J = null;
            this.f22450M = 0;
            this.f22451N = null;
            this.f22452O = null;
            MultiMap<String> multiMap = this.f22457e;
            if (multiMap != null) {
                multiMap.clear();
            }
            this.f22471s = null;
            this.f22472t = false;
            this.f22469q = 0;
            Map<Object, C9281e> map = this.f22443F;
            if (map != null) {
                map.clear();
            }
            this.f22443F = null;
            return;
        }
        throw new IllegalStateException("Request in context!");
    }

    /* renamed from: e */
    public String mo37761e() {
        return this.f22462j;
    }

    /* renamed from: e0 */
    public void mo43105e0(String str) {
        Object a = this.f22455c == null ? null : this.f22455c.mo39576a(str);
        if (this.f22455c != null) {
            this.f22455c.mo39582d(str);
        }
        if (a != null && this.f22439B != null) {
            ServletRequestAttributeEvent servletRequestAttributeEvent = new ServletRequestAttributeEvent(this.f22460h, this, str, a);
            int size = LazyList.size(this.f22439B);
            for (int i = 0; i < size; i++) {
                C10365q qVar = (C10365q) LazyList.get(this.f22439B, i);
                if (qVar instanceof C10365q) {
                    qVar.mo41956r(servletRequestAttributeEvent);
                }
            }
        }
    }

    /* renamed from: f */
    public Enumeration mo37762f() {
        return this.f22459g.mo42995w().mo39798t();
    }

    /* renamed from: f0 */
    public void mo43106f0(EventListener eventListener) {
        this.f22439B = LazyList.remove(this.f22439B, (Object) eventListener);
    }

    /* renamed from: g */
    public String mo37763g() {
        return this.f22473u;
    }

    /* renamed from: g0 */
    public void mo43107g0(boolean z) {
        this.f22454b = z;
    }

    public String getContentType() {
        return this.f22459g.mo42995w().mo39803x(C9908k.f18090j);
    }

    public Cookie[] getCookies() {
        if (this.f22464l) {
            C12171g gVar = this.f22463k;
            if (gVar == null) {
                return null;
            }
            return gVar.mo43039b();
        }
        this.f22464l = true;
        Enumeration<String> z = this.f22459g.mo42995w().mo39805z(C9908k.f18095o);
        if (z != null) {
            if (this.f22463k == null) {
                this.f22463k = new C12171g();
            }
            while (z.hasMoreElements()) {
                this.f22463k.mo43038a(z.nextElement());
            }
        }
        C12171g gVar2 = this.f22463k;
        if (gVar2 == null) {
            return null;
        }
        return gVar2.mo43039b();
    }

    /* renamed from: h */
    public String mo41948h() {
        String str = this.f22438A;
        if (str != null) {
            return str;
        }
        C11950k kVar = this.f22467o;
        if (kVar == null) {
            return null;
        }
        return kVar.mo39658h();
    }

    /* renamed from: h0 */
    public void mo43108h0(C9978b bVar) {
        this.f22455c = bVar;
    }

    /* renamed from: i */
    public C10356h mo41949i(String str) {
        if (str == null || this.f22460h == null) {
            return null;
        }
        String str2 = MiotCloudImpl.COOKIE_PATH;
        if (!str.startsWith(str2)) {
            String a = C9997p.m24723a(this.f22447J, this.f22473u);
            int lastIndexOf = a.lastIndexOf(str2);
            if (lastIndexOf > 1) {
                str2 = a.substring(0, lastIndexOf + 1);
            }
            str = C9997p.m24723a(str2, str);
        }
        return this.f22460h.mo39963g(str);
    }

    /* renamed from: i0 */
    public void mo43109i0(C12159d dVar) {
        this.f22456d = dVar;
    }

    /* renamed from: j */
    public String mo37765j() {
        return this.f22440C;
    }

    /* renamed from: j0 */
    public void mo43110j0(String str) {
        this.f22458f = str;
    }

    /* renamed from: k */
    public Enumeration mo37766k(String str) {
        Enumeration<String> y = this.f22459g.mo42995w().mo39804y(str);
        return y == null ? Collections.enumeration(Collections.EMPTY_LIST) : y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public final void mo43111k0(C12151b bVar) {
        this.f22459g = bVar;
        this.f22453a.mo43027z(bVar);
        this.f22467o = bVar.mo42448g();
        this.f22466n = bVar.mo42997y();
    }

    /* renamed from: l */
    public String mo37767l() {
        return this.f22470r;
    }

    /* renamed from: l0 */
    public void mo43112l0(C9943d.C9945b bVar) {
        this.f22461i = this.f22460h != bVar;
        this.f22460h = bVar;
    }

    /* renamed from: m */
    public String mo41950m() {
        return this.f22475w;
    }

    /* renamed from: m0 */
    public void mo43113m0(String str) {
        this.f22462j = str;
    }

    /* renamed from: n */
    public StringBuffer mo37768n() {
        StringBuffer stringBuffer = new StringBuffer(48);
        synchronized (stringBuffer) {
            String P = mo43090P();
            int Q = mo43091Q();
            stringBuffer.append(P);
            stringBuffer.append("://");
            stringBuffer.append(mo41952q());
            if (this.f22474v > 0 && ((P.equalsIgnoreCase("http") && Q != 80) || (P.equalsIgnoreCase("https") && Q != 443))) {
                stringBuffer.append(':');
                stringBuffer.append(this.f22474v);
            }
            stringBuffer.append(mo37774w());
        }
        return stringBuffer;
    }

    /* renamed from: n0 */
    public void mo43114n0(DispatcherType dispatcherType) {
        this.f22465m = dispatcherType;
    }

    /* renamed from: o */
    public String mo41951o(String str) {
        if (!this.f22472t) {
            mo43127y();
        }
        return (String) this.f22471s.getValue(str, 0);
    }

    /* renamed from: o0 */
    public void mo43115o0(boolean z) {
        this.f22468p = z;
    }

    /* renamed from: p */
    public C9281e mo37769p(boolean z) {
        C9281e eVar = this.f22448K;
        if (eVar != null) {
            C12192v vVar = this.f22449L;
            if (vVar == null || vVar.mo26655A(eVar)) {
                return this.f22448K;
            }
            this.f22448K = null;
        }
        if (!z) {
            return null;
        }
        C12192v vVar2 = this.f22449L;
        if (vVar2 != null) {
            C9281e i0 = vVar2.mo26675i0(this);
            this.f22448K = i0;
            C9894g z2 = this.f22449L.mo26680z(i0, mo37761e(), mo41945c());
            if (z2 != null) {
                this.f22459g.mo42998z().mo43158r(z2);
            }
            return this.f22448K;
        }
        throw new IllegalStateException("No SessionManager");
    }

    /* renamed from: p0 */
    public void mo43116p0(String str) {
        this.f22470r = str;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073 A[Catch:{ IOException -> 0x0080 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo41952q() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f22446I
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            org.eclipse.jetty.http.p r0 = r5.f22452O
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = r0.mo39745h()
            r5.f22446I = r0
            org.eclipse.jetty.http.p r0 = r5.f22452O
            int r0 = r0.mo39748k()
            r5.f22474v = r0
            java.lang.String r0 = r5.f22446I
            if (r0 == 0) goto L_0x001c
            return r0
        L_0x001c:
            z5.b r0 = r5.f22459g
            org.eclipse.jetty.http.h r0 = r0.mo42995w()
            w5.d r1 = org.eclipse.jetty.http.C9908k.f18085e
            w5.d r0 = r0.mo39795o(r1)
            if (r0 == 0) goto L_0x009b
            int r1 = r0.mo42416U0()
        L_0x002e:
            int r2 = r1 + -1
            int r3 = r0.mo42409L0()
            if (r1 <= r3) goto L_0x0087
            byte r1 = r0.mo42449W(r2)
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r3 = 58
            if (r1 == r3) goto L_0x0047
            r3 = 93
            if (r1 == r3) goto L_0x0087
            r1 = r2
            goto L_0x002e
        L_0x0047:
            int r1 = r0.mo42409L0()
            int r3 = r0.mo42409L0()
            int r3 = r2 - r3
            w5.d r1 = r0.mo42445z(r1, r3)
            java.lang.String r1 = p225w5.C11945g.m30568f(r1)
            r5.f22446I = r1
            int r1 = r2 + 1
            r3 = 1
            int r4 = r0.mo42416U0()     // Catch:{ NumberFormatException -> 0x006f }
            int r4 = r4 - r2
            int r4 = r4 - r3
            w5.d r0 = r0.mo42445z(r1, r4)     // Catch:{ NumberFormatException -> 0x006f }
            int r0 = p225w5.C11945g.m30570h(r0)     // Catch:{ NumberFormatException -> 0x006f }
            r5.f22474v = r0     // Catch:{ NumberFormatException -> 0x006f }
            goto L_0x007d
        L_0x006f:
            z5.b r0 = r5.f22459g     // Catch:{ IOException -> 0x0080 }
            if (r0 == 0) goto L_0x007d
            org.eclipse.jetty.http.c r0 = r0.f22355l     // Catch:{ IOException -> 0x0080 }
            r1 = 400(0x190, float:5.6E-43)
            java.lang.String r2 = "Bad Host header"
            r4 = 0
            r0.mo39727o(r1, r2, r4, r3)     // Catch:{ IOException -> 0x0080 }
        L_0x007d:
            java.lang.String r0 = r5.f22446I
            return r0
        L_0x0080:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0087:
            java.lang.String r1 = r5.f22446I
            if (r1 == 0) goto L_0x008f
            int r1 = r5.f22474v
            if (r1 >= 0) goto L_0x0098
        L_0x008f:
            java.lang.String r0 = p225w5.C11945g.m30568f(r0)
            r5.f22446I = r0
            r0 = 0
            r5.f22474v = r0
        L_0x0098:
            java.lang.String r0 = r5.f22446I
            return r0
        L_0x009b:
            z5.b r0 = r5.f22459g
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = r5.mo43081I()
            r5.f22446I = r0
            int r0 = r5.mo43083J()
            r5.f22474v = r0
            java.lang.String r0 = r5.f22446I
            if (r0 == 0) goto L_0x00ba
            java.lang.String r1 = "0.0.0.0"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ba
            java.lang.String r0 = r5.f22446I
            return r0
        L_0x00ba:
            java.net.InetAddress r0 = java.net.InetAddress.getLocalHost()     // Catch:{ UnknownHostException -> 0x00c5 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x00c5 }
            r5.f22446I = r0     // Catch:{ UnknownHostException -> 0x00c5 }
            goto L_0x00cb
        L_0x00c5:
            r0 = move-exception
            e6.c r1 = f22437P
            r1.mo36849d(r0)
        L_0x00cb:
            java.lang.String r0 = r5.f22446I
            return r0
        L_0x00ce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No uri"
            r0.<init>(r1)
            goto L_0x00d7
        L_0x00d6:
            throw r0
        L_0x00d7:
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12181o.mo41952q():java.lang.String");
    }

    /* renamed from: q0 */
    public void mo43117q0(MultiMap<String> multiMap) {
        if (multiMap == null) {
            multiMap = this.f22457e;
        }
        this.f22471s = multiMap;
        if (this.f22472t && multiMap == null) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: r */
    public String mo37770r(String str) {
        return this.f22459g.mo42995w().mo39802w(str);
    }

    /* renamed from: r0 */
    public void mo43118r0(String str) {
        this.f22473u = str;
    }

    /* renamed from: s */
    public String mo37771s() {
        if (this.f22447J == null) {
            this.f22447J = "";
        }
        return this.f22447J;
    }

    /* renamed from: s0 */
    public void mo43119s0(String str) {
        this.f22475w = str;
    }

    /* renamed from: t */
    public long mo37772t(String str) {
        return this.f22459g.mo42995w().mo39796p(str);
    }

    /* renamed from: t0 */
    public void mo43120t0(String str) {
        this.f22476x = str;
        this.f22477y = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22468p ? "[" : "(");
        sb.append(mo37767l());
        sb.append(" ");
        sb.append(this.f22452O);
        sb.append(this.f22468p ? "]@" : ")@");
        sb.append(hashCode());
        sb.append(" ");
        sb.append(super.toString());
        return sb.toString();
    }

    /* renamed from: u */
    public String mo37773u() {
        C9914p pVar;
        if (this.f22477y == null && (pVar = this.f22452O) != null) {
            String str = this.f22476x;
            this.f22477y = str == null ? pVar.mo39749l() : pVar.mo39856m(str);
        }
        return this.f22477y;
    }

    /* renamed from: u0 */
    public void mo43122u0(String str) {
        this.f22477y = str;
        this.f22476x = null;
    }

    /* renamed from: v */
    public C10349a mo41953v() {
        if (this.f22454b) {
            this.f22453a.mo43004A();
            return this.f22453a;
        }
        throw new IllegalStateException("!asyncSupported");
    }

    /* renamed from: v0 */
    public void mo43123v0(String str) {
        this.f22438A = str;
    }

    /* renamed from: w */
    public String mo37774w() {
        C9914p pVar;
        if (this.f22442E == null && (pVar = this.f22452O) != null) {
            this.f22442E = pVar.mo39747j();
        }
        return this.f22442E;
    }

    /* renamed from: w0 */
    public void mo43124w0(String str) {
    }

    /* renamed from: x */
    public void mo43125x(EventListener eventListener) {
        if (eventListener instanceof C10365q) {
            this.f22439B = LazyList.add(this.f22439B, eventListener);
        }
        if (eventListener instanceof C10546b) {
            throw new IllegalArgumentException(eventListener.getClass().toString());
        } else if (eventListener instanceof C10351c) {
            throw new IllegalArgumentException(eventListener.getClass().toString());
        }
    }

    /* renamed from: x0 */
    public void mo43126x0(String str) {
        this.f22442E = str;
    }

    /* renamed from: y */
    public void mo43127y() {
        int F;
        int i;
        int i2;
        if (this.f22457e == null) {
            this.f22457e = new MultiMap<>(16);
        }
        if (!this.f22472t) {
            this.f22472t = true;
            try {
                C9914p pVar = this.f22452O;
                if (pVar != null && pVar.mo39751o()) {
                    String str = this.f22476x;
                    if (str == null) {
                        this.f22452O.mo39740b(this.f22457e);
                    } else {
                        this.f22452O.mo39741c(this.f22457e, str);
                    }
                }
            } catch (UnsupportedEncodingException e) {
                C9003c cVar = f22437P;
                if (cVar.mo36846a()) {
                    cVar.mo36856j(e);
                } else {
                    cVar.mo36847b(e.toString(), new Object[0]);
                }
            } catch (Throwable th) {
                if (this.f22471s == null) {
                    this.f22471s = this.f22457e;
                }
                throw th;
            }
            String D = mo43071D();
            String contentType = getContentType();
            if (contentType != null && contentType.length() > 0 && "application/x-www-form-urlencoded".equalsIgnoreCase(C9895h.m24166L(contentType, (Map<String, String>) null)) && this.f22469q == 0 && (("POST".equals(mo37767l()) || "PUT".equals(mo37767l())) && (F = mo43075F()) != 0)) {
                try {
                    C9943d.C9945b bVar = this.f22460h;
                    if (bVar != null) {
                        i2 = bVar.mo39960d().mo39947r1();
                        i = this.f22460h.mo39960d().mo39948s1();
                    } else {
                        Number number = (Number) this.f22459g.mo42987n().mo42940c().mo39576a("org.eclipse.jetty.server.Request.maxFormContentSize");
                        i2 = number == null ? 200000 : number.intValue();
                        Number number2 = (Number) this.f22459g.mo42987n().mo42940c().mo39576a("org.eclipse.jetty.server.Request.maxFormKeys");
                        i = number2 == null ? 1000 : number2.intValue();
                    }
                    if (F > i2) {
                        if (i2 > 0) {
                            throw new IllegalStateException("Form too large" + F + ">" + i2);
                        }
                    }
                    C10361m d = mo41946d();
                    MultiMap<String> multiMap = this.f22457e;
                    if (F >= 0) {
                        i2 = -1;
                    }
                    UrlEncoded.decodeTo(d, multiMap, D, i2, i);
                } catch (IOException e2) {
                    C9003c cVar2 = f22437P;
                    if (cVar2.mo36846a()) {
                        cVar2.mo36856j(e2);
                    } else {
                        cVar2.mo36847b(e2.toString(), new Object[0]);
                    }
                }
            }
            MultiMap<String> multiMap2 = this.f22471s;
            if (multiMap2 == null) {
                this.f22471s = this.f22457e;
            } else {
                MultiMap<String> multiMap3 = this.f22457e;
                if (multiMap2 != multiMap3) {
                    for (Map.Entry next : multiMap3.entrySet()) {
                        String str2 = (String) next.getKey();
                        Object value = next.getValue();
                        for (int i3 = 0; i3 < LazyList.size(value); i3++) {
                            this.f22471s.add(str2, LazyList.get(value, i3));
                        }
                    }
                }
            }
            if (this.f22471s == null) {
                this.f22471s = this.f22457e;
            }
        } else if (this.f22471s == null) {
            this.f22471s = this.f22457e;
        }
    }

    /* renamed from: y0 */
    public void mo43128y0(String str) {
        this.f22440C = str;
    }

    /* renamed from: z */
    public C12156c mo43129z() {
        return this.f22453a;
    }

    /* renamed from: z0 */
    public void mo43130z0(boolean z) {
        this.f22441D = z;
    }
}
