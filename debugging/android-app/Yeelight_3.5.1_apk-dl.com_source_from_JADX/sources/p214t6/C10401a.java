package p214t6;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.types.C10087h;
import org.fourthline.cling.model.types.DLNADoc;

/* renamed from: t6.a */
public class C10401a {

    /* renamed from: k */
    private static final Logger f19464k = Logger.getLogger(C10401a.class.getName());

    /* renamed from: a */
    private final URL f19465a;

    /* renamed from: b */
    private final String f19466b;

    /* renamed from: c */
    private final C10405e f19467c;

    /* renamed from: d */
    private final C10406f f19468d;

    /* renamed from: e */
    private final String f19469e;

    /* renamed from: f */
    private final String f19470f;

    /* renamed from: g */
    private final URI f19471g;

    /* renamed from: h */
    private final DLNADoc[] f19472h;

    /* renamed from: i */
    private final C10087h f19473i;

    /* renamed from: j */
    private final C10087h f19474j;

    public C10401a(String str, C10405e eVar, C10406f fVar) {
        this((URL) null, str, eVar, fVar, (String) null, (String) null, (URI) null);
    }

    public C10401a(URL url, String str, C10405e eVar, C10406f fVar, String str2, String str3, URI uri) {
        this(url, str, eVar, fVar, str2, str3, uri, (DLNADoc[]) null, (C10087h) null);
    }

    public C10401a(URL url, String str, C10405e eVar, C10406f fVar, String str2, String str3, URI uri, DLNADoc[] dLNADocArr, C10087h hVar) {
        this(url, str, eVar, fVar, str2, str3, uri, dLNADocArr, hVar, (C10087h) null);
    }

    public C10401a(URL url, String str, C10405e eVar, C10406f fVar, String str2, String str3, URI uri, DLNADoc[] dLNADocArr, C10087h hVar, C10087h hVar2) {
        this.f19465a = url;
        this.f19466b = str;
        this.f19467c = eVar == null ? new C10405e() : eVar;
        this.f19468d = fVar == null ? new C10406f() : fVar;
        this.f19469e = str2;
        this.f19470f = str3;
        this.f19471g = uri;
        this.f19472h = dLNADocArr == null ? new DLNADoc[0] : dLNADocArr;
        this.f19473i = hVar;
        this.f19474j = hVar2;
    }

    /* renamed from: a */
    public URL mo42046a() {
        return this.f19465a;
    }

    /* renamed from: b */
    public C10087h mo42047b() {
        return this.f19473i;
    }

    /* renamed from: c */
    public DLNADoc[] mo42048c() {
        return this.f19472h;
    }

    /* renamed from: d */
    public String mo42049d() {
        return this.f19466b;
    }

    /* renamed from: e */
    public C10405e mo42050e() {
        return this.f19467c;
    }

    /* renamed from: f */
    public C10406f mo42051f() {
        return this.f19468d;
    }

    /* renamed from: g */
    public URI mo42052g() {
        return this.f19471g;
    }

    /* renamed from: h */
    public C10087h mo42053h() {
        return this.f19474j;
    }

    /* renamed from: i */
    public String mo42054i() {
        return this.f19469e;
    }

    /* renamed from: j */
    public String mo42055j() {
        return this.f19470f;
    }

    /* renamed from: k */
    public List<C10023k> mo42056k() {
        Logger logger;
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        if (mo42055j() != null) {
            if (mo42055j().length() != 12) {
                logger = f19464k;
                sb = new StringBuilder();
                str = "UPnP specification violation, UPC must be 12 digits: ";
            } else {
                try {
                    Long.parseLong(mo42055j());
                } catch (NumberFormatException unused) {
                    logger = f19464k;
                    sb = new StringBuilder();
                    str = "UPnP specification violation, UPC must be 12 digits all-numeric: ";
                }
            }
            sb.append(str);
            sb.append(mo42055j());
            logger.fine(sb.toString());
        }
        return arrayList;
    }
}
