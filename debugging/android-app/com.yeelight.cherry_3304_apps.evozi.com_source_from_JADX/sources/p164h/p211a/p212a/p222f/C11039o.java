package p164h.p211a.p212a.p222f;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import org.apache.commons.p271io.IOUtils;
import p154d.p155b.C10732r;
import p154d.p155b.p204f0.C10711e;
import p154d.p155b.p204f0.C10713g;
import p164h.p211a.p212a.p216c.C10895g;
import p164h.p211a.p212a.p216c.C10897i;
import p164h.p211a.p212a.p216c.C10906j;
import p164h.p211a.p212a.p216c.C10909k;
import p164h.p211a.p212a.p216c.C10910l;
import p164h.p211a.p212a.p216c.C10915p;
import p164h.p211a.p212a.p216c.C10918r;
import p164h.p211a.p212a.p216c.C10920t;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10931f;
import p164h.p211a.p212a.p222f.p224w.C11052c;
import p164h.p211a.p212a.p222f.p224w.C11056e;
import p164h.p211a.p212a.p228h.C11118f;
import p164h.p211a.p212a.p228h.C11132o;
import p164h.p211a.p212a.p228h.C11137q;
import p164h.p211a.p212a.p228h.C11139s;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.o */
public class C11039o implements C10711e {

    /* renamed from: k */
    private static final C11158c f21676k = C11156b.m29015a(C11039o.class);

    /* renamed from: a */
    private final C11010b f21677a;

    /* renamed from: b */
    private int f21678b = 200;

    /* renamed from: c */
    private String f21679c;

    /* renamed from: d */
    private Locale f21680d;

    /* renamed from: e */
    private String f21681e;

    /* renamed from: f */
    private C10931f.C10932a f21682f;

    /* renamed from: g */
    private String f21683g;

    /* renamed from: h */
    private String f21684h;

    /* renamed from: i */
    private volatile int f21685i;

    /* renamed from: j */
    private PrintWriter f21686j;

    public C11039o(C11010b bVar) {
        this.f21677a = bVar;
    }

    /* renamed from: A */
    public void mo34986A(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        } else if (!this.f21677a.mo34829H()) {
            this.f21678b = i;
            this.f21679c = str;
        }
    }

    /* renamed from: a */
    public void mo33930a(String str, long j) {
        if (!this.f21677a.mo34829H()) {
            this.f21677a.mo34822A().mo34460C(str, j);
        }
    }

    /* renamed from: b */
    public void mo33884b() {
        if (!mo33885g()) {
            this.f21677a.mo34843p().mo34393b();
            return;
        }
        throw new IllegalStateException("Committed");
    }

    /* renamed from: c */
    public void mo33931c(int i, String str) {
        if (!this.f21677a.mo34829H()) {
            if (mo33885g()) {
                C11158c cVar = f21676k;
                cVar.mo35486b("Committed before " + i + " " + str, new Object[0]);
            }
            mo33884b();
            this.f21683g = null;
            mo33935l("Expires", (String) null);
            mo33935l("Last-Modified", (String) null);
            mo33935l("Cache-Control", (String) null);
            mo33935l("Content-Type", (String) null);
            mo33935l("Content-Length", (String) null);
            this.f21685i = 0;
            mo34986A(i, str);
            if (str == null) {
                str = C10915p.m27535b(i);
            }
            if (i != 204 && i != 304 && i != 206 && i >= 200) {
                C11037n v = this.f21677a.mo34849v();
                C11052c.C11054b F = v.mo34929F();
                C11056e i1 = F != null ? F.mo35080c().mo35064i1() : null;
                if (i1 == null) {
                    i1 = (C11056e) this.f21677a.mo34842n().mo34807d().mo35459F0(C11056e.class);
                }
                if (i1 != null) {
                    v.mo33965b("javax.servlet.error.status_code", new Integer(i));
                    v.mo33965b("javax.servlet.error.message", str);
                    v.mo33965b("javax.servlet.error.request_uri", v.mo33929v());
                    v.mo33965b("javax.servlet.error.servlet_name", v.mo34947S());
                    i1.mo34757L((String) null, this.f21677a.mo34849v(), this.f21677a.mo34849v(), this);
                } else {
                    mo33935l("Cache-Control", "must-revalidate,no-cache,no-store");
                    mo33886h("text/html;charset=ISO-8859-1");
                    C11118f fVar = new C11118f(2048);
                    if (str != null) {
                        str = C11137q.m28923f(C11137q.m28923f(C11137q.m28923f(str, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
                    }
                    String v2 = v.mo33929v();
                    if (v2 != null) {
                        v2 = C11137q.m28923f(C11137q.m28923f(C11137q.m28923f(v2, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
                    }
                    fVar.write("<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html;charset=ISO-8859-1\"/>\n");
                    fVar.write("<title>Error ");
                    fVar.write(Integer.toString(i));
                    fVar.mo35348h(' ');
                    if (str == null) {
                        str = C10915p.m27535b(i);
                    }
                    fVar.write(str);
                    fVar.write("</title>\n</head>\n<body>\n<h2>HTTP ERROR: ");
                    fVar.write(Integer.toString(i));
                    fVar.write("</h2>\n<p>Problem accessing ");
                    fVar.write(v2);
                    fVar.write(". Reason:\n<pre>    ");
                    fVar.write(str);
                    fVar.write("</pre>");
                    fVar.write("</p>\n<hr /><i><small>Powered by Jetty://</small></i>");
                    for (int i2 = 0; i2 < 20; i2++) {
                        fVar.write("\n                                                ");
                    }
                    fVar.write("\n</body>\n</html>\n");
                    fVar.flush();
                    mo33889k(fVar.mo35347g());
                    fVar.mo35349j(mo33888j());
                    fVar.mo35343a();
                }
            } else if (i != 206) {
                this.f21677a.mo34850w().mo34465H(C10910l.f21157i);
                this.f21677a.mo34850w().mo34465H(C10910l.f21154f);
                this.f21683g = null;
                this.f21681e = null;
                this.f21682f = null;
            }
            mo34988p();
        }
    }

    /* renamed from: d */
    public void mo33932d(String str, String str2) {
        if (this.f21677a.mo34829H()) {
            if (str.startsWith("org.eclipse.jetty.server.include.")) {
                str = str.substring(33);
            } else {
                return;
            }
        }
        this.f21677a.mo34822A().mo34467d(str, str2);
        if ("Content-Length".equalsIgnoreCase(str)) {
            this.f21677a.f21562l.mo34409r(Long.parseLong(str2));
        }
    }

    /* renamed from: e */
    public void mo33933e(int i) {
        if (i == 102) {
            mo34998y();
        } else {
            mo33931c(i, (String) null);
        }
    }

    /* renamed from: f */
    public String mo33934f(String str) {
        return mo34989q(str);
    }

    /* renamed from: g */
    public boolean mo33885g() {
        return this.f21677a.mo34830I();
    }

    /* renamed from: h */
    public void mo33886h(String str) {
        StringBuilder sb;
        C10931f.C10932a d;
        StringBuilder sb2;
        String b;
        C10931f.C10932a d2;
        if (!mo33885g() && !this.f21677a.mo34829H()) {
            if (str == null) {
                if (this.f21680d == null) {
                    this.f21683g = null;
                }
                this.f21681e = null;
                this.f21682f = null;
                this.f21684h = null;
                this.f21677a.mo34822A().mo34465H(C10910l.f21157i);
                return;
            }
            int indexOf = str.indexOf(59);
            if (indexOf > 0) {
                String trim = str.substring(0, indexOf).trim();
                this.f21681e = trim;
                this.f21682f = C10920t.f21262c.mo34612b(trim);
                int i = indexOf + 1;
                int indexOf2 = str.indexOf("charset=", i);
                if (indexOf2 >= 0) {
                    int i2 = indexOf2 + 8;
                    int indexOf3 = str.indexOf(32, i2);
                    if (this.f21685i == 2) {
                        if ((indexOf2 != i || indexOf3 >= 0) && !(indexOf2 == indexOf + 2 && indexOf3 < 0 && str.charAt(i) == ' ')) {
                            if (indexOf3 < 0) {
                                str = str.substring(0, indexOf2);
                            } else {
                                sb = new StringBuilder();
                                sb.append(str.substring(0, indexOf2));
                                str = str.substring(indexOf3);
                            }
                            sb.append(str);
                            sb.append(";charset=");
                            sb.append(C11132o.m28907b(this.f21683g, ";= "));
                            str = sb.toString();
                            this.f21684h = str;
                            this.f21677a.mo34822A().mo34458A(C10910l.f21157i, this.f21684h);
                            return;
                        }
                        C10931f.C10932a aVar = this.f21682f;
                        if (aVar != null) {
                            d = aVar.mo34620d(this.f21683g);
                            if (d == null) {
                                sb2 = new StringBuilder();
                            }
                        } else {
                            sb2 = new StringBuilder();
                        }
                        sb2.append(this.f21681e);
                        sb2.append(";charset=");
                        b = this.f21683g;
                        sb2.append(b);
                        str = sb2.toString();
                        this.f21684h = str;
                        this.f21677a.mo34822A().mo34458A(C10910l.f21157i, this.f21684h);
                        return;
                    } else if ((indexOf2 != i || indexOf3 >= 0) && !(indexOf2 == indexOf + 2 && indexOf3 < 0 && str.charAt(i) == ' ')) {
                        this.f21683g = C11132o.m28909d(indexOf3 > 0 ? str.substring(i2, indexOf3) : str.substring(i2));
                        this.f21684h = str;
                        this.f21677a.mo34822A().mo34458A(C10910l.f21157i, this.f21684h);
                        return;
                    } else {
                        this.f21682f = C10920t.f21262c.mo34612b(this.f21681e);
                        String d3 = C11132o.m28909d(str.substring(i2));
                        this.f21683g = d3;
                        C10931f.C10932a aVar2 = this.f21682f;
                        if (!(aVar2 == null || (d2 = aVar2.mo34620d(d3)) == null)) {
                            this.f21684h = d2.toString();
                            this.f21677a.mo34822A().mo34459B(C10910l.f21157i, d2);
                            return;
                        }
                        this.f21684h = str;
                        this.f21677a.mo34822A().mo34458A(C10910l.f21157i, this.f21684h);
                        return;
                    }
                } else {
                    this.f21682f = null;
                    if (this.f21683g != null) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append(";charset=");
                        sb.append(C11132o.m28907b(this.f21683g, ";= "));
                        str = sb.toString();
                    }
                    this.f21684h = str;
                    this.f21677a.mo34822A().mo34458A(C10910l.f21157i, this.f21684h);
                    return;
                }
            } else {
                this.f21681e = str;
                C10931f.C10932a b2 = C10920t.f21262c.mo34612b(str);
                this.f21682f = b2;
                String str2 = this.f21683g;
                if (str2 == null) {
                    if (b2 != null) {
                        this.f21684h = b2.toString();
                        this.f21677a.mo34822A().mo34459B(C10910l.f21157i, this.f21682f);
                        return;
                    }
                    this.f21684h = str;
                    this.f21677a.mo34822A().mo34458A(C10910l.f21157i, this.f21684h);
                    return;
                } else if (b2 != null) {
                    d = b2.mo34620d(str2);
                    if (d == null) {
                        sb2 = new StringBuilder();
                        sb2.append(this.f21681e);
                        sb2.append(";charset=");
                        b = C11132o.m28907b(this.f21683g, ";= ");
                        sb2.append(b);
                        str = sb2.toString();
                        this.f21684h = str;
                        this.f21677a.mo34822A().mo34458A(C10910l.f21157i, this.f21684h);
                        return;
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(";charset=");
                    sb.append(C11132o.m28907b(this.f21683g, ";= "));
                    str = sb.toString();
                    this.f21684h = str;
                    this.f21677a.mo34822A().mo34458A(C10910l.f21157i, this.f21684h);
                    return;
                }
            }
            this.f21684h = d.toString();
            this.f21677a.mo34822A().mo34459B(C10910l.f21157i, d);
        }
    }

    /* renamed from: i */
    public PrintWriter mo33887i() {
        if (this.f21685i == 0 || this.f21685i == 2) {
            if (this.f21686j == null) {
                String str = this.f21683g;
                if (str == null) {
                    C10931f.C10932a aVar = this.f21682f;
                    if (aVar != null) {
                        str = C10920t.m27558a(aVar);
                    }
                    if (str == null) {
                        str = "ISO-8859-1";
                    }
                    mo34999z(str);
                }
                this.f21686j = this.f21677a.mo34848u(str);
            }
            this.f21685i = 2;
            return this.f21686j;
        }
        throw new IllegalStateException("STREAM");
    }

    /* renamed from: j */
    public C10732r mo33888j() {
        if (this.f21685i == 0 || this.f21685i == 1) {
            C10732r s = this.f21677a.mo34846s();
            this.f21685i = 1;
            return s;
        }
        throw new IllegalStateException("WRITER");
    }

    /* renamed from: k */
    public void mo33889k(int i) {
        if (!mo33885g() && !this.f21677a.mo34829H()) {
            long j = (long) i;
            this.f21677a.f21562l.mo34409r(j);
            if (i > 0) {
                this.f21677a.mo34822A().mo34462E("Content-Length", j);
                if (!this.f21677a.f21562l.mo34401i()) {
                    return;
                }
                if (this.f21685i == 2) {
                    this.f21686j.close();
                } else if (this.f21685i == 1) {
                    try {
                        mo33888j().close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public void mo33935l(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            mo33886h(str2);
            return;
        }
        if (this.f21677a.mo34829H()) {
            if (str.startsWith("org.eclipse.jetty.server.include.")) {
                str = str.substring(33);
            } else {
                return;
            }
        }
        this.f21677a.mo34822A().mo34484z(str, str2);
        if ("Content-Length".equalsIgnoreCase(str)) {
            this.f21677a.f21562l.mo34409r(str2 == null ? -1 : Long.parseLong(str2));
        }
    }

    /* renamed from: m */
    public void mo33936m(int i) {
        mo34986A(i, (String) null);
    }

    /* renamed from: n */
    public void mo33937n(String str) {
        if (!this.f21677a.mo34829H()) {
            if (str != null) {
                if (!C11139s.m28942k(str)) {
                    StringBuilder O = this.f21677a.mo34849v().mo34943O();
                    if (!str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                        String v = this.f21677a.mo34849v().mo33929v();
                        if (!v.endsWith(MiotCloudImpl.COOKIE_PATH)) {
                            v = C11139s.m28943l(v);
                        }
                        str = C11139s.m28935a(v, str);
                        if (str == null) {
                            throw new IllegalStateException("path cannot be above root");
                        } else if (!str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                            O.append(IOUtils.DIR_SEPARATOR_UNIX);
                        }
                    }
                    O.append(str);
                    str = O.toString();
                    C10918r rVar = new C10918r(str);
                    String e = rVar.mo34422e();
                    String b = C11139s.m28936b(e);
                    if (b == null) {
                        throw new IllegalArgumentException();
                    } else if (!b.equals(e)) {
                        StringBuilder O2 = this.f21677a.mo34849v().mo34943O();
                        O2.append(C11139s.m28940f(b));
                        if (rVar.mo34428l() != null) {
                            O2.append('?');
                            O2.append(rVar.mo34428l());
                        }
                        if (rVar.mo34423g() != null) {
                            O2.append('#');
                            O2.append(rVar.mo34423g());
                        }
                        str = O2.toString();
                    }
                }
                mo33884b();
                mo33935l("Location", str);
                mo33936m(302);
                mo34988p();
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: o */
    public void mo34987o(C10895g gVar) {
        this.f21677a.mo34822A().mo34470g(gVar);
    }

    /* renamed from: p */
    public void mo34988p() {
        this.f21677a.mo34838j();
    }

    /* renamed from: q */
    public String mo34989q(String str) {
        C10918r rVar;
        C11037n v = this.f21677a.mo34849v();
        C11045t U = v.mo34949U();
        if (U == null) {
            return str;
        }
        String str2 = "";
        if (!U.mo35030Y() || !C11139s.m28942k(str)) {
            rVar = null;
        } else {
            rVar = new C10918r(str);
            String i = rVar.mo34425i();
            if (i == null) {
                i = str2;
            }
            int k = rVar.mo34427k();
            if (k < 0) {
                k = "https".equalsIgnoreCase(rVar.mo34429n()) ? 443 : 80;
            }
            if (!v.mo33972q().equalsIgnoreCase(rVar.mo34424h()) || v.mo34945Q() != k || !i.startsWith(v.mo33917e())) {
                return str;
            }
        }
        String a0 = U.mo35031a0();
        if (a0 == null) {
            return str;
        }
        if (str == null) {
            return null;
        }
        if (v.mo34955a0()) {
            int indexOf = str.indexOf(a0);
            if (indexOf == -1) {
                return str;
            }
            int indexOf2 = str.indexOf("?", indexOf);
            if (indexOf2 < 0) {
                indexOf2 = str.indexOf("#", indexOf);
            }
            if (indexOf2 <= indexOf) {
                return str.substring(0, indexOf);
            }
            return str.substring(0, indexOf) + str.substring(indexOf2);
        }
        C10713g p = v.mo33925p(false);
        if (p == null || !U.mo35040x(p)) {
            return str;
        }
        String m = U.mo35036m(p);
        if (rVar == null) {
            rVar = new C10918r(str);
        }
        int indexOf3 = str.indexOf(a0);
        if (indexOf3 != -1) {
            int indexOf4 = str.indexOf("?", indexOf3);
            if (indexOf4 < 0) {
                indexOf4 = str.indexOf("#", indexOf3);
            }
            if (indexOf4 <= indexOf3) {
                return str.substring(0, indexOf3 + a0.length()) + m;
            }
            return str.substring(0, indexOf3 + a0.length()) + m + str.substring(indexOf4);
        }
        int indexOf5 = str.indexOf(63);
        if (indexOf5 < 0) {
            indexOf5 = str.indexOf(35);
        }
        if (indexOf5 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (("https".equalsIgnoreCase(rVar.mo34429n()) || "http".equalsIgnoreCase(rVar.mo34429n())) && rVar.mo34425i() == null) {
                str2 = MiotCloudImpl.COOKIE_PATH;
            }
            sb.append(str2);
            sb.append(a0);
            sb.append(m);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, indexOf5));
        if (("https".equalsIgnoreCase(rVar.mo34429n()) || "http".equalsIgnoreCase(rVar.mo34429n())) && rVar.mo34425i() == null) {
            str2 = MiotCloudImpl.COOKIE_PATH;
        }
        sb2.append(str2);
        sb2.append(a0);
        sb2.append(m);
        sb2.append(str.substring(indexOf5));
        return sb2.toString();
    }

    /* renamed from: r */
    public void mo34990r() {
        mo33884b();
        this.f21686j = null;
        this.f21685i = 0;
    }

    /* renamed from: s */
    public String mo34991s() {
        return this.f21679c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public String mo34992t() {
        return this.f21683g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1 ");
        sb.append(this.f21678b);
        sb.append(" ");
        String str = this.f21679c;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(System.getProperty("line.separator"));
        sb.append(this.f21677a.mo34822A().toString());
        return sb.toString();
    }

    /* renamed from: u */
    public int mo34994u() {
        return this.f21678b;
    }

    /* renamed from: v */
    public boolean mo34995v() {
        return this.f21685i == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo34996w() {
        this.f21678b = 200;
        this.f21679c = null;
        this.f21680d = null;
        this.f21681e = null;
        this.f21682f = null;
        this.f21683g = null;
        this.f21684h = null;
        this.f21686j = null;
        this.f21685i = 0;
    }

    /* renamed from: x */
    public void mo34997x() {
        C10929e eVar;
        String str;
        mo33884b();
        mo34990r();
        this.f21678b = 200;
        this.f21679c = null;
        C10897i A = this.f21677a.mo34822A();
        A.mo34471h();
        String v = this.f21677a.mo34850w().mo34480v(C10910l.f21155g);
        if (v != null) {
            String[] split = v.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            int i = 0;
            while (split != null && i < split.length) {
                C10931f.C10932a b = C10909k.f21149d.mo34612b(split[0].trim());
                if (b != null) {
                    int e = b.mo34621e();
                    if (e != 1) {
                        if (e != 5) {
                            if (e == 8) {
                                eVar = C10910l.f21155g;
                                str = "TE";
                            }
                        } else if ("HTTP/1.0".equalsIgnoreCase(this.f21677a.mo34849v().mo34939K())) {
                            eVar = C10910l.f21155g;
                            str = "keep-alive";
                        }
                        A.mo34458A(eVar, str);
                    } else {
                        A.mo34459B(C10910l.f21155g, C10909k.f21150e);
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: y */
    public void mo34998y() {
        if (this.f21677a.mo34828G() && !mo33885g()) {
            ((C10906j) this.f21677a.mo34843p()).mo34510I(102);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34999z(java.lang.String r6) {
        /*
            r5 = this;
            h.a.a.f.b r0 = r5.f21677a
            boolean r0 = r0.mo34829H()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            int r0 = r5.f21685i
            if (r0 != 0) goto L_0x0111
            boolean r0 = r5.mo33885g()
            if (r0 != 0) goto L_0x0111
            r0 = 0
            if (r6 != 0) goto L_0x003f
            java.lang.String r6 = r5.f21683g
            if (r6 == 0) goto L_0x0111
            r5.f21683g = r0
            h.a.a.d.f$a r6 = r5.f21682f
            if (r6 == 0) goto L_0x0027
            java.lang.String r6 = r6.toString()
        L_0x0024:
            r5.f21684h = r6
            goto L_0x002e
        L_0x0027:
            java.lang.String r6 = r5.f21681e
            if (r6 == 0) goto L_0x002c
            goto L_0x0024
        L_0x002c:
            r5.f21684h = r0
        L_0x002e:
            java.lang.String r6 = r5.f21684h
            if (r6 != 0) goto L_0x0104
            h.a.a.f.b r6 = r5.f21677a
            h.a.a.c.i r6 = r6.mo34822A()
            h.a.a.d.e r0 = p164h.p211a.p212a.p216c.C10910l.f21157i
            r6.mo34465H(r0)
            goto L_0x0111
        L_0x003f:
            r5.f21683g = r6
            java.lang.String r6 = r5.f21684h
            if (r6 == 0) goto L_0x0111
            r1 = 59
            int r6 = r6.indexOf(r1)
            java.lang.String r1 = ";charset="
            java.lang.String r2 = ";= "
            if (r6 >= 0) goto L_0x0091
            r5.f21684h = r0
            h.a.a.d.f$a r6 = r5.f21682f
            if (r6 == 0) goto L_0x0070
            java.lang.String r0 = r5.f21683g
            h.a.a.d.f$a r6 = r6.mo34620d(r0)
            if (r6 == 0) goto L_0x0070
            java.lang.String r0 = r6.toString()
            r5.f21684h = r0
            h.a.a.f.b r0 = r5.f21677a
            h.a.a.c.i r0 = r0.mo34822A()
            h.a.a.d.e r3 = p164h.p211a.p212a.p216c.C10910l.f21157i
            r0.mo34459B(r3, r6)
        L_0x0070:
            java.lang.String r6 = r5.f21684h
            if (r6 != 0) goto L_0x0111
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r5.f21681e
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = r5.f21683g
            java.lang.String r0 = p164h.p211a.p212a.p228h.C11132o.m28907b(r0, r2)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
        L_0x008e:
            r5.f21684h = r6
            goto L_0x0104
        L_0x0091:
            java.lang.String r0 = r5.f21684h
            java.lang.String r3 = "charset="
            int r6 = r0.indexOf(r3, r6)
            if (r6 >= 0) goto L_0x00b6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r5.f21684h
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = r5.f21683g
            java.lang.String r0 = p164h.p211a.p212a.p228h.C11132o.m28907b(r0, r2)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            goto L_0x008e
        L_0x00b6:
            int r6 = r6 + 8
            java.lang.String r0 = r5.f21684h
            java.lang.String r1 = " "
            int r0 = r0.indexOf(r1, r6)
            r1 = 0
            if (r0 >= 0) goto L_0x00df
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r5.f21684h
            java.lang.String r6 = r3.substring(r1, r6)
            r0.append(r6)
            java.lang.String r6 = r5.f21683g
            java.lang.String r6 = p164h.p211a.p212a.p228h.C11132o.m28907b(r6, r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            goto L_0x008e
        L_0x00df:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r5.f21684h
            java.lang.String r6 = r4.substring(r1, r6)
            r3.append(r6)
            java.lang.String r6 = r5.f21683g
            java.lang.String r6 = p164h.p211a.p212a.p228h.C11132o.m28907b(r6, r2)
            r3.append(r6)
            java.lang.String r6 = r5.f21684h
            java.lang.String r6 = r6.substring(r0)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            goto L_0x008e
        L_0x0104:
            h.a.a.f.b r6 = r5.f21677a
            h.a.a.c.i r6 = r6.mo34822A()
            h.a.a.d.e r0 = p164h.p211a.p212a.p216c.C10910l.f21157i
            java.lang.String r1 = r5.f21684h
            r6.mo34458A(r0, r1)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11039o.mo34999z(java.lang.String):void");
    }
}
