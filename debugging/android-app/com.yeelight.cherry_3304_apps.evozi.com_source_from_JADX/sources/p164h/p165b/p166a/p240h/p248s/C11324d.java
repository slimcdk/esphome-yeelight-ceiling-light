package p164h.p165b.p166a.p240h.p248s;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.p252w.C11370h;
import p164h.p165b.p166a.p240h.p252w.C11372i;

/* renamed from: h.b.a.h.s.d */
public class C11324d {

    /* renamed from: k */
    private static final Logger f22463k = Logger.getLogger(C11324d.class.getName());

    /* renamed from: a */
    private final URL f22464a;

    /* renamed from: b */
    private final String f22465b;

    /* renamed from: c */
    private final C11329i f22466c;

    /* renamed from: d */
    private final C11330j f22467d;

    /* renamed from: e */
    private final String f22468e;

    /* renamed from: f */
    private final String f22469f;

    /* renamed from: g */
    private final URI f22470g;

    /* renamed from: h */
    private final C11372i[] f22471h;

    /* renamed from: i */
    private final C11370h f22472i;

    /* renamed from: j */
    private final C11370h f22473j;

    public C11324d(String str, C11329i iVar, C11330j jVar) {
        this((URL) null, str, iVar, jVar, (String) null, (String) null, (URI) null);
    }

    public C11324d(URL url, String str, C11329i iVar, C11330j jVar, String str2, String str3, URI uri) {
        this(url, str, iVar, jVar, str2, str3, uri, (C11372i[]) null, (C11370h) null);
    }

    public C11324d(URL url, String str, C11329i iVar, C11330j jVar, String str2, String str3, URI uri, C11372i[] iVarArr, C11370h hVar) {
        this(url, str, iVar, jVar, str2, str3, uri, iVarArr, hVar, (C11370h) null);
    }

    public C11324d(URL url, String str, C11329i iVar, C11330j jVar, String str2, String str3, URI uri, C11372i[] iVarArr, C11370h hVar, C11370h hVar2) {
        this.f22464a = url;
        this.f22465b = str;
        this.f22466c = iVar == null ? new C11329i() : iVar;
        this.f22467d = jVar == null ? new C11330j() : jVar;
        this.f22468e = str2;
        this.f22469f = str3;
        this.f22470g = uri;
        this.f22471h = iVarArr == null ? new C11372i[0] : iVarArr;
        this.f22472i = hVar;
        this.f22473j = hVar2;
    }

    /* renamed from: a */
    public URL mo35910a() {
        return this.f22464a;
    }

    /* renamed from: b */
    public C11370h mo35911b() {
        return this.f22472i;
    }

    /* renamed from: c */
    public C11372i[] mo35912c() {
        return this.f22471h;
    }

    /* renamed from: d */
    public String mo35913d() {
        return this.f22465b;
    }

    /* renamed from: e */
    public C11329i mo35914e() {
        return this.f22466c;
    }

    /* renamed from: f */
    public C11330j mo35915f() {
        return this.f22467d;
    }

    /* renamed from: g */
    public URI mo35916g() {
        return this.f22470g;
    }

    /* renamed from: h */
    public C11370h mo35917h() {
        return this.f22473j;
    }

    /* renamed from: i */
    public String mo35918i() {
        return this.f22468e;
    }

    /* renamed from: j */
    public String mo35919j() {
        return this.f22469f;
    }

    /* renamed from: k */
    public List<C11222l> mo35920k() {
        Logger logger;
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        if (mo35919j() != null) {
            if (mo35919j().length() != 12) {
                logger = f22463k;
                sb = new StringBuilder();
                str = "UPnP specification violation, UPC must be 12 digits: ";
            } else {
                try {
                    Long.parseLong(mo35919j());
                } catch (NumberFormatException unused) {
                    logger = f22463k;
                    sb = new StringBuilder();
                    str = "UPnP specification violation, UPC must be 12 digits all-numeric: ";
                }
            }
            sb.append(str);
            sb.append(mo35919j());
            logger.fine(sb.toString());
        }
        return arrayList;
    }
}
