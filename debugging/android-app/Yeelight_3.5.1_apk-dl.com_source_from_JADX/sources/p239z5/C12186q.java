package p239z5;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import javax.servlet.http.C9279c;
import javax.servlet.http.C9281e;
import org.apache.commons.p194io.IOUtils;
import org.eclipse.jetty.http.C9894g;
import org.eclipse.jetty.http.C9895h;
import org.eclipse.jetty.http.C9904i;
import org.eclipse.jetty.http.C9907j;
import org.eclipse.jetty.http.C9908k;
import org.eclipse.jetty.http.C9914p;
import org.eclipse.jetty.http.C9916r;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.server.handler.C9943d;
import org.eclipse.jetty.server.handler.C9947f;
import org.eclipse.jetty.util.C9982f;
import org.eclipse.jetty.util.C9994m;
import org.eclipse.jetty.util.C9995n;
import org.eclipse.jetty.util.C9997p;
import p152e6.C9001b;
import p152e6.C9003c;
import p208s4.C10362n;
import p225w5.C11940d;
import p225w5.C11942e;

/* renamed from: z5.q */
public class C12186q implements C9279c {

    /* renamed from: k */
    private static final C9003c f22500k = C9001b.m21450a(C12186q.class);

    /* renamed from: a */
    private final C12151b f22501a;

    /* renamed from: b */
    private int f22502b = 200;

    /* renamed from: c */
    private String f22503c;

    /* renamed from: d */
    private Locale f22504d;

    /* renamed from: e */
    private String f22505e;

    /* renamed from: f */
    private C11942e.C11943a f22506f;

    /* renamed from: g */
    private String f22507g;

    /* renamed from: h */
    private String f22508h;

    /* renamed from: i */
    private volatile int f22509i;

    /* renamed from: j */
    private PrintWriter f22510j;

    public C12186q(C12151b bVar) {
        this.f22501a = bVar;
    }

    /* renamed from: z */
    public static C12186q m31860z(C9279c cVar) {
        return cVar instanceof C12186q ? (C12186q) cVar : C12151b.m31593o().mo42998z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public String mo43148A() {
        return this.f22507g;
    }

    /* renamed from: B */
    public int mo43149B() {
        return this.f22502b;
    }

    /* renamed from: C */
    public boolean mo43150C() {
        return this.f22509i == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo43151D() {
        this.f22502b = 200;
        this.f22503c = null;
        this.f22504d = null;
        this.f22505e = null;
        this.f22506f = null;
        this.f22507g = null;
        this.f22508h = null;
        this.f22510j = null;
        this.f22509i = 0;
    }

    /* renamed from: E */
    public void mo43152E() {
        C11940d dVar;
        String str;
        mo39905b();
        mo43163v();
        this.f22502b = 200;
        this.f22503c = null;
        C9895h A = this.f22501a.mo42965A();
        A.mo39792h();
        String x = this.f22501a.mo42995w().mo39803x(C9908k.f18087g);
        if (x != null) {
            String[] split = x.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            int i = 0;
            while (split != null && i < split.length) {
                C11942e.C11943a b = C9907j.f18080d.mo42455b(split[0].trim());
                if (b != null) {
                    int e = b.mo42464e();
                    if (e != 1) {
                        if (e != 5) {
                            if (e == 8) {
                                dVar = C9908k.f18087g;
                                str = "TE";
                            }
                        } else if ("HTTP/1.0".equalsIgnoreCase(this.f22501a.mo42994v().mo41950m())) {
                            dVar = C9908k.f18087g;
                            str = "keep-alive";
                        }
                        A.mo39779C(dVar, str);
                    } else {
                        A.mo39780D(C9908k.f18087g, C9907j.f18081e);
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: F */
    public void mo43153F(boolean z) {
        if (!z) {
            mo43152E();
            return;
        }
        C9895h A = this.f22501a.mo42965A();
        ArrayList arrayList = new ArrayList(5);
        Enumeration<String> y = A.mo39804y("Set-Cookie");
        while (y.hasMoreElements()) {
            arrayList.add(y.nextElement());
        }
        mo43152E();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A.mo39788d("Set-Cookie", (String) it.next());
        }
    }

    /* renamed from: G */
    public void mo43154G() {
        if (this.f22501a.mo42973I() && !mo39908g()) {
            ((C9904i) this.f22501a.mo42988p()).mo39832K(102);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43155H(java.lang.String r6) {
        /*
            r5 = this;
            z5.b r0 = r5.f22501a
            boolean r0 = r0.mo42974J()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            int r0 = r5.f22509i
            if (r0 != 0) goto L_0x0111
            boolean r0 = r5.mo39908g()
            if (r0 != 0) goto L_0x0111
            r0 = 0
            if (r6 != 0) goto L_0x003f
            java.lang.String r6 = r5.f22507g
            if (r6 == 0) goto L_0x0111
            r5.f22507g = r0
            w5.e$a r6 = r5.f22506f
            if (r6 == 0) goto L_0x0027
            java.lang.String r6 = r6.toString()
        L_0x0024:
            r5.f22508h = r6
            goto L_0x002e
        L_0x0027:
            java.lang.String r6 = r5.f22505e
            if (r6 == 0) goto L_0x002c
            goto L_0x0024
        L_0x002c:
            r5.f22508h = r0
        L_0x002e:
            java.lang.String r6 = r5.f22508h
            if (r6 != 0) goto L_0x0104
            z5.b r6 = r5.f22501a
            org.eclipse.jetty.http.h r6 = r6.mo42965A()
            w5.d r0 = org.eclipse.jetty.http.C9908k.f18090j
            r6.mo39786J(r0)
            goto L_0x0111
        L_0x003f:
            r5.f22507g = r6
            java.lang.String r6 = r5.f22508h
            if (r6 == 0) goto L_0x0111
            r1 = 59
            int r6 = r6.indexOf(r1)
            java.lang.String r1 = ";charset="
            java.lang.String r2 = ";= "
            if (r6 >= 0) goto L_0x0091
            r5.f22508h = r0
            w5.e$a r6 = r5.f22506f
            if (r6 == 0) goto L_0x0070
            java.lang.String r0 = r5.f22507g
            w5.e$a r6 = r6.mo42463d(r0)
            if (r6 == 0) goto L_0x0070
            java.lang.String r0 = r6.toString()
            r5.f22508h = r0
            z5.b r0 = r5.f22501a
            org.eclipse.jetty.http.h r0 = r0.mo42965A()
            w5.d r3 = org.eclipse.jetty.http.C9908k.f18090j
            r0.mo39780D(r3, r6)
        L_0x0070:
            java.lang.String r6 = r5.f22508h
            if (r6 != 0) goto L_0x0111
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r5.f22505e
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = r5.f22507g
            java.lang.String r0 = org.eclipse.jetty.util.C9994m.m24702b(r0, r2)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
        L_0x008e:
            r5.f22508h = r6
            goto L_0x0104
        L_0x0091:
            java.lang.String r0 = r5.f22508h
            java.lang.String r3 = "charset="
            int r6 = r0.indexOf(r3, r6)
            if (r6 >= 0) goto L_0x00b6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r5.f22508h
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = r5.f22507g
            java.lang.String r0 = org.eclipse.jetty.util.C9994m.m24702b(r0, r2)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            goto L_0x008e
        L_0x00b6:
            int r6 = r6 + 8
            java.lang.String r0 = r5.f22508h
            java.lang.String r1 = " "
            int r0 = r0.indexOf(r1, r6)
            r1 = 0
            if (r0 >= 0) goto L_0x00df
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r5.f22508h
            java.lang.String r6 = r3.substring(r1, r6)
            r0.append(r6)
            java.lang.String r6 = r5.f22507g
            java.lang.String r6 = org.eclipse.jetty.util.C9994m.m24702b(r6, r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            goto L_0x008e
        L_0x00df:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r5.f22508h
            java.lang.String r6 = r4.substring(r1, r6)
            r3.append(r6)
            java.lang.String r6 = r5.f22507g
            java.lang.String r6 = org.eclipse.jetty.util.C9994m.m24702b(r6, r2)
            r3.append(r6)
            java.lang.String r6 = r5.f22508h
            java.lang.String r6 = r6.substring(r0)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            goto L_0x008e
        L_0x0104:
            z5.b r6 = r5.f22501a
            org.eclipse.jetty.http.h r6 = r6.mo42965A()
            w5.d r0 = org.eclipse.jetty.http.C9908k.f18090j
            java.lang.String r1 = r5.f22508h
            r6.mo39779C(r0, r1)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12186q.mo43155H(java.lang.String):void");
    }

    /* renamed from: I */
    public void mo43156I(long j) {
        if (!mo39908g() && !this.f22501a.mo42974J()) {
            this.f22501a.f22355l.mo39730r(j);
            this.f22501a.mo42965A().mo39783G("Content-Length", j);
        }
    }

    /* renamed from: J */
    public void mo43157J(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        } else if (!this.f22501a.mo42974J()) {
            this.f22502b = i;
            this.f22503c = str;
        }
    }

    /* renamed from: a */
    public void mo37775a(String str, long j) {
        if (!this.f22501a.mo42974J()) {
            this.f22501a.mo42965A().mo39781E(str, j);
        }
    }

    /* renamed from: b */
    public void mo39905b() {
        if (!mo39908g()) {
            this.f22501a.mo42988p().mo39714b();
            return;
        }
        throw new IllegalStateException("Committed");
    }

    /* renamed from: c */
    public void mo39906c(String str) {
        StringBuilder sb;
        C11942e.C11943a d;
        StringBuilder sb2;
        String b;
        C11942e.C11943a d2;
        if (!mo39908g() && !this.f22501a.mo42974J()) {
            if (str == null) {
                if (this.f22504d == null) {
                    this.f22507g = null;
                }
                this.f22505e = null;
                this.f22506f = null;
                this.f22508h = null;
                this.f22501a.mo42965A().mo39786J(C9908k.f18090j);
                return;
            }
            int indexOf = str.indexOf(59);
            if (indexOf > 0) {
                String trim = str.substring(0, indexOf).trim();
                this.f22505e = trim;
                C11942e eVar = C9916r.f18145d;
                this.f22506f = eVar.mo42455b(trim);
                int i = indexOf + 1;
                int indexOf2 = str.indexOf("charset=", i);
                if (indexOf2 >= 0) {
                    int i2 = indexOf2 + 8;
                    int indexOf3 = str.indexOf(32, i2);
                    if (this.f22509i == 2) {
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
                            sb.append(C9994m.m24702b(this.f22507g, ";= "));
                            str = sb.toString();
                            this.f22508h = str;
                            this.f22501a.mo42965A().mo39779C(C9908k.f18090j, this.f22508h);
                            return;
                        }
                        C11942e.C11943a aVar = this.f22506f;
                        if (aVar != null) {
                            d = aVar.mo42463d(this.f22507g);
                            if (d == null) {
                                sb2 = new StringBuilder();
                            }
                        } else {
                            sb2 = new StringBuilder();
                        }
                        sb2.append(this.f22505e);
                        sb2.append(";charset=");
                        b = this.f22507g;
                        sb2.append(b);
                        str = sb2.toString();
                        this.f22508h = str;
                        this.f22501a.mo42965A().mo39779C(C9908k.f18090j, this.f22508h);
                        return;
                    } else if ((indexOf2 != i || indexOf3 >= 0) && !(indexOf2 == indexOf + 2 && indexOf3 < 0 && str.charAt(i) == ' ')) {
                        this.f22507g = C9994m.m24704d(indexOf3 > 0 ? str.substring(i2, indexOf3) : str.substring(i2));
                        this.f22508h = str;
                        this.f22501a.mo42965A().mo39779C(C9908k.f18090j, this.f22508h);
                        return;
                    } else {
                        this.f22506f = eVar.mo42455b(this.f22505e);
                        String d3 = C9994m.m24704d(str.substring(i2));
                        this.f22507g = d3;
                        C11942e.C11943a aVar2 = this.f22506f;
                        if (!(aVar2 == null || (d2 = aVar2.mo42463d(d3)) == null)) {
                            this.f22508h = d2.toString();
                            this.f22501a.mo42965A().mo39780D(C9908k.f18090j, d2);
                            return;
                        }
                        this.f22508h = str;
                        this.f22501a.mo42965A().mo39779C(C9908k.f18090j, this.f22508h);
                        return;
                    }
                } else {
                    this.f22506f = null;
                    if (this.f22507g != null) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append(";charset=");
                        sb.append(C9994m.m24702b(this.f22507g, ";= "));
                        str = sb.toString();
                    }
                    this.f22508h = str;
                    this.f22501a.mo42965A().mo39779C(C9908k.f18090j, this.f22508h);
                    return;
                }
            } else {
                this.f22505e = str;
                C11942e.C11943a b2 = C9916r.f18145d.mo42455b(str);
                this.f22506f = b2;
                String str2 = this.f22507g;
                if (str2 == null) {
                    if (b2 != null) {
                        this.f22508h = b2.toString();
                        this.f22501a.mo42965A().mo39780D(C9908k.f18090j, this.f22506f);
                        return;
                    }
                    this.f22508h = str;
                    this.f22501a.mo42965A().mo39779C(C9908k.f18090j, this.f22508h);
                    return;
                } else if (b2 != null) {
                    d = b2.mo42463d(str2);
                    if (d == null) {
                        sb2 = new StringBuilder();
                        sb2.append(this.f22505e);
                        sb2.append(";charset=");
                        b = C9994m.m24702b(this.f22507g, ";= ");
                        sb2.append(b);
                        str = sb2.toString();
                        this.f22508h = str;
                        this.f22501a.mo42965A().mo39779C(C9908k.f18090j, this.f22508h);
                        return;
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(";charset=");
                    sb.append(C9994m.m24702b(this.f22507g, ";= "));
                    str = sb.toString();
                    this.f22508h = str;
                    this.f22501a.mo42965A().mo39779C(C9908k.f18090j, this.f22508h);
                    return;
                }
            }
            this.f22508h = d.toString();
            this.f22501a.mo42965A().mo39780D(C9908k.f18090j, d);
        }
    }

    /* renamed from: d */
    public void mo37776d(int i, String str) {
        if (!this.f22501a.mo42974J()) {
            if (mo39908g()) {
                C9003c cVar = f22500k;
                cVar.mo36847b("Committed before " + i + " " + str, new Object[0]);
            }
            mo39905b();
            this.f22507g = null;
            mo37781o("Expires", (String) null);
            mo37781o("Last-Modified", (String) null);
            mo37781o("Cache-Control", (String) null);
            mo37781o("Content-Type", (String) null);
            mo37781o("Content-Length", (String) null);
            this.f22509i = 0;
            mo43157J(i, str);
            if (str == null) {
                str = HttpStatus.m24064b(i);
            }
            if (i != 204 && i != 304 && i != 206 && i >= 200) {
                C12181o v = this.f22501a.mo42994v();
                C9943d.C9945b G = v.mo43077G();
                C9947f o1 = G != null ? G.mo39960d().mo39944o1() : null;
                if (o1 == null) {
                    o1 = (C9947f) this.f22501a.mo42987n().mo42940c().mo36758K0(C9947f.class);
                }
                if (o1 != null) {
                    v.mo41944b("javax.servlet.error.status_code", new Integer(i));
                    v.mo41944b("javax.servlet.error.message", str);
                    v.mo41944b("javax.servlet.error.request_uri", v.mo37774w());
                    v.mo41944b("javax.servlet.error.servlet_name", v.mo43093S());
                    o1.mo39972q((String) null, this.f22501a.mo42994v(), this.f22501a.mo42994v(), this);
                } else {
                    mo37781o("Cache-Control", "must-revalidate,no-cache,no-store");
                    mo39906c("text/html;charset=ISO-8859-1");
                    C9982f fVar = new C9982f(2048);
                    if (str != null) {
                        str = C9995n.m24710f(C9995n.m24710f(C9995n.m24710f(str, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
                    }
                    String w = v.mo37774w();
                    if (w != null) {
                        w = C9995n.m24710f(C9995n.m24710f(C9995n.m24710f(w, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
                    }
                    fVar.write("<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html;charset=ISO-8859-1\"/>\n");
                    fVar.write("<title>Error ");
                    fVar.write(Integer.toString(i));
                    fVar.mo40234f(' ');
                    if (str == null) {
                        str = HttpStatus.m24064b(i);
                    }
                    fVar.write(str);
                    fVar.write("</title>\n</head>\n<body>\n<h2>HTTP ERROR: ");
                    fVar.write(Integer.toString(i));
                    fVar.write("</h2>\n<p>Problem accessing ");
                    fVar.write(w);
                    fVar.write(". Reason:\n<pre>    ");
                    fVar.write(str);
                    fVar.write("</pre>");
                    fVar.write("</p>\n<hr /><i><small>Powered by Jetty://</small></i>");
                    for (int i2 = 0; i2 < 20; i2++) {
                        fVar.write("\n                                                ");
                    }
                    fVar.write("\n</body>\n</html>\n");
                    fVar.flush();
                    mo37798n(fVar.mo40233d());
                    fVar.mo40236i(mo37797h());
                    fVar.mo40230a();
                }
            } else if (i != 206) {
                this.f22501a.mo42995w().mo39786J(C9908k.f18090j);
                this.f22501a.mo42995w().mo39786J(C9908k.f18086f);
                this.f22507g = null;
                this.f22505e = null;
                this.f22506f = null;
            }
            mo43159s();
        }
    }

    /* renamed from: e */
    public int mo39907e() {
        return this.f22501a.mo42988p().mo39734u();
    }

    /* renamed from: f */
    public PrintWriter mo37796f() {
        if (this.f22509i == 0 || this.f22509i == 2) {
            if (this.f22510j == null) {
                String str = this.f22507g;
                if (str == null) {
                    C11942e.C11943a aVar = this.f22506f;
                    if (aVar != null) {
                        str = C9916r.m24281a(aVar);
                    }
                    if (str == null) {
                        str = "ISO-8859-1";
                    }
                    mo43155H(str);
                }
                this.f22510j = this.f22501a.mo42993u(str);
            }
            this.f22509i = 2;
            return this.f22510j;
        }
        throw new IllegalStateException("STREAM");
    }

    /* renamed from: g */
    public boolean mo39908g() {
        return this.f22501a.mo42975K();
    }

    public String getContentType() {
        return this.f22508h;
    }

    /* renamed from: h */
    public C10362n mo37797h() {
        if (this.f22509i == 0 || this.f22509i == 1) {
            C10362n s = this.f22501a.mo42991s();
            this.f22509i = 1;
            return s;
        }
        throw new IllegalStateException("WRITER");
    }

    /* renamed from: i */
    public String mo39910i() {
        if (this.f22507g == null) {
            this.f22507g = "ISO-8859-1";
        }
        return this.f22507g;
    }

    /* renamed from: j */
    public void mo37777j(String str, String str2) {
        if (this.f22501a.mo42974J()) {
            if (str.startsWith("org.eclipse.jetty.server.include.")) {
                str = str.substring(33);
            } else {
                return;
            }
        }
        this.f22501a.mo42965A().mo39788d(str, str2);
        if ("Content-Length".equalsIgnoreCase(str)) {
            this.f22501a.f22355l.mo39730r(Long.parseLong(str2));
        }
    }

    /* renamed from: k */
    public void mo37778k(int i) {
        if (i == 102) {
            mo43154G();
        } else {
            mo37776d(i, (String) null);
        }
    }

    /* renamed from: l */
    public String mo37779l(String str) {
        return mo43160t(str);
    }

    /* renamed from: m */
    public boolean mo37780m(String str) {
        return this.f22501a.mo42965A().mo39793i(str);
    }

    /* renamed from: n */
    public void mo37798n(int i) {
        if (!mo39908g() && !this.f22501a.mo42974J()) {
            long j = (long) i;
            this.f22501a.f22355l.mo39730r(j);
            if (i > 0) {
                this.f22501a.mo42965A().mo39783G("Content-Length", j);
                if (!this.f22501a.f22355l.mo39723j()) {
                    return;
                }
                if (this.f22509i == 2) {
                    this.f22510j.close();
                } else if (this.f22509i == 1) {
                    try {
                        mo37797h().close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public void mo37781o(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            mo39906c(str2);
            return;
        }
        if (this.f22501a.mo42974J()) {
            if (str.startsWith("org.eclipse.jetty.server.include.")) {
                str = str.substring(33);
            } else {
                return;
            }
        }
        this.f22501a.mo42965A().mo39778B(str, str2);
        if ("Content-Length".equalsIgnoreCase(str)) {
            this.f22501a.f22355l.mo39730r(str2 == null ? -1 : Long.parseLong(str2));
        }
    }

    /* renamed from: p */
    public void mo37782p(int i) {
        mo43157J(i, (String) null);
    }

    /* renamed from: q */
    public void mo37783q(String str) {
        if (!this.f22501a.mo42974J()) {
            if (str != null) {
                if (!C9997p.m24730h(str)) {
                    StringBuilder O = this.f22501a.mo42994v().mo43089O();
                    if (!str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                        String w = this.f22501a.mo42994v().mo37774w();
                        if (!w.endsWith(MiotCloudImpl.COOKIE_PATH)) {
                            w = C9997p.m24731i(w);
                        }
                        str = C9997p.m24723a(w, str);
                        if (str == null) {
                            throw new IllegalStateException("path cannot be above root");
                        } else if (!str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                            O.append(IOUtils.DIR_SEPARATOR_UNIX);
                        }
                    }
                    O.append(str);
                    str = O.toString();
                    C9914p pVar = new C9914p(str);
                    String e = pVar.mo39743e();
                    String b = C9997p.m24724b(e);
                    if (b == null) {
                        throw new IllegalArgumentException();
                    } else if (!b.equals(e)) {
                        StringBuilder O2 = this.f22501a.mo42994v().mo43089O();
                        O2.append(C9997p.m24728f(b));
                        if (pVar.mo39749l() != null) {
                            O2.append('?');
                            O2.append(pVar.mo39749l());
                        }
                        if (pVar.mo39744g() != null) {
                            O2.append('#');
                            O2.append(pVar.mo39744g());
                        }
                        str = O2.toString();
                    }
                }
                mo39905b();
                mo37781o("Location", str);
                mo37782p(302);
                mo43159s();
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: r */
    public void mo43158r(C9894g gVar) {
        this.f22501a.mo42965A().mo39791g(gVar);
    }

    /* renamed from: s */
    public void mo43159s() {
        this.f22501a.mo42983j();
    }

    /* renamed from: t */
    public String mo43160t(String str) {
        C9914p pVar;
        C12181o v = this.f22501a.mo42994v();
        C12192v U = v.mo43095U();
        if (U == null) {
            return str;
        }
        String str2 = "";
        if (!U.mo26671a0() || !C9997p.m24730h(str)) {
            pVar = null;
        } else {
            pVar = new C9914p(str);
            String i = pVar.mo39746i();
            if (i == null) {
                i = str2;
            }
            int k = pVar.mo39748k();
            if (k < 0) {
                k = "https".equalsIgnoreCase(pVar.mo39750n()) ? 443 : 80;
            }
            if (!v.mo41952q().equalsIgnoreCase(pVar.mo39745h()) || v.mo43091Q() != k || !i.startsWith(v.mo37761e())) {
                return str;
            }
        }
        String c0 = U.mo26672c0();
        if (c0 == null) {
            return str;
        }
        if (str == null) {
            return null;
        }
        if (v.mo43101a0()) {
            int indexOf = str.indexOf(c0);
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
        C9281e p = v.mo37769p(false);
        if (p == null || !U.mo26655A(p)) {
            return str;
        }
        String n = U.mo26677n(p);
        if (pVar == null) {
            pVar = new C9914p(str);
        }
        int indexOf3 = str.indexOf(c0);
        if (indexOf3 != -1) {
            int indexOf4 = str.indexOf("?", indexOf3);
            if (indexOf4 < 0) {
                indexOf4 = str.indexOf("#", indexOf3);
            }
            if (indexOf4 <= indexOf3) {
                return str.substring(0, indexOf3 + c0.length()) + n;
            }
            return str.substring(0, indexOf3 + c0.length()) + n + str.substring(indexOf4);
        }
        int indexOf5 = str.indexOf(63);
        if (indexOf5 < 0) {
            indexOf5 = str.indexOf(35);
        }
        if (indexOf5 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (("https".equalsIgnoreCase(pVar.mo39750n()) || "http".equalsIgnoreCase(pVar.mo39750n())) && pVar.mo39746i() == null) {
                str2 = MiotCloudImpl.COOKIE_PATH;
            }
            sb.append(str2);
            sb.append(c0);
            sb.append(n);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, indexOf5));
        if (("https".equalsIgnoreCase(pVar.mo39750n()) || "http".equalsIgnoreCase(pVar.mo39750n())) && pVar.mo39746i() == null) {
            str2 = MiotCloudImpl.COOKIE_PATH;
        }
        sb2.append(str2);
        sb2.append(c0);
        sb2.append(n);
        sb2.append(str.substring(indexOf5));
        return sb2.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1 ");
        sb.append(this.f22502b);
        sb.append(" ");
        String str = this.f22503c;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(System.getProperty("line.separator"));
        sb.append(this.f22501a.mo42965A().toString());
        return sb.toString();
    }

    /* renamed from: u */
    public void mo43162u() {
        this.f22501a.mo42986m();
    }

    /* renamed from: v */
    public void mo43163v() {
        mo39905b();
        this.f22510j = null;
        this.f22509i = 0;
    }

    /* renamed from: w */
    public long mo43164w() {
        C12151b bVar = this.f22501a;
        if (bVar == null || bVar.mo42988p() == null) {
            return -1;
        }
        return this.f22501a.mo42988p().mo39733t();
    }

    /* renamed from: x */
    public C9895h mo43165x() {
        return this.f22501a.mo42965A();
    }

    /* renamed from: y */
    public String mo43166y() {
        return this.f22503c;
    }
}
