package p164h.p165b.p166a.p240h.p248s;

import com.miot.common.device.parser.xml.DddTag;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.C11216f;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p252w.C11374j;

/* renamed from: h.b.a.h.s.b */
public class C11321b<S extends C11335o> {

    /* renamed from: g */
    private static final Logger f22444g = Logger.getLogger(C11321b.class.getName());

    /* renamed from: a */
    private final String f22445a;

    /* renamed from: b */
    private final String[] f22446b;

    /* renamed from: c */
    private final String f22447c;

    /* renamed from: d */
    private final C11322a f22448d;

    /* renamed from: e */
    private final boolean f22449e;

    /* renamed from: f */
    private C11320a<S> f22450f;

    /* renamed from: h.b.a.h.s.b$a */
    public enum C11322a {
        IN,
        OUT
    }

    public C11321b(String str, String str2, C11322a aVar) {
        this(str, new String[0], str2, aVar, false);
    }

    public C11321b(String str, String str2, C11322a aVar, boolean z) {
        this(str, new String[0], str2, aVar, z);
    }

    public C11321b(String str, String[] strArr, String str2, C11322a aVar) {
        this(str, strArr, str2, aVar, false);
    }

    public C11321b(String str, String[] strArr, String str2, C11322a aVar, boolean z) {
        this.f22445a = str;
        this.f22446b = strArr;
        this.f22447c = str2;
        this.f22448d = aVar;
        this.f22449e = z;
    }

    /* renamed from: a */
    public C11320a<S> mo35865a() {
        return this.f22450f;
    }

    /* renamed from: b */
    public String[] mo35866b() {
        return this.f22446b;
    }

    /* renamed from: c */
    public C11374j mo35867c() {
        return mo35865a().mo35859g().mo35982c(this);
    }

    /* renamed from: d */
    public C11322a mo35868d() {
        return this.f22448d;
    }

    /* renamed from: e */
    public String mo35869e() {
        return this.f22445a;
    }

    /* renamed from: f */
    public String mo35870f() {
        return this.f22447c;
    }

    /* renamed from: g */
    public boolean mo35871g(String str) {
        if (mo35869e().equalsIgnoreCase(str)) {
            return true;
        }
        for (String equalsIgnoreCase : this.f22446b) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo35872h() {
        return this.f22449e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo35873i(C11320a<S> aVar) {
        if (this.f22450f == null) {
            this.f22450f = aVar;
            return;
        }
        throw new IllegalStateException("Final value has been set already, model is immutable");
    }

    /* renamed from: j */
    public List<C11222l> mo35874j() {
        Logger logger;
        StringBuilder sb;
        String str;
        Class<C11321b> cls = C11321b.class;
        ArrayList arrayList = new ArrayList();
        if (mo35869e() == null || mo35869e().length() == 0) {
            arrayList.add(new C11222l(cls, "name", "Argument without name of: " + mo35865a()));
        } else {
            if (!C11216f.m29268e(mo35869e())) {
                Logger logger2 = f22444g;
                logger2.warning("UPnP specification violation of: " + mo35865a().mo35859g().mo35983d());
                logger = f22444g;
                sb = new StringBuilder();
                str = "Invalid argument name: ";
            } else if (mo35869e().length() > 32) {
                Logger logger3 = f22444g;
                logger3.warning("UPnP specification violation of: " + mo35865a().mo35859g().mo35983d());
                logger = f22444g;
                sb = new StringBuilder();
                str = "Argument name should be less than 32 characters: ";
            }
            sb.append(str);
            sb.append(this);
            logger.warning(sb.toString());
        }
        if (mo35868d() == null) {
            arrayList.add(new C11222l(cls, DddTag.ARGS_ARG_DIRECTION, "Argument '" + mo35869e() + "' requires a direction, either IN or OUT"));
        }
        if (mo35872h() && mo35868d() != C11322a.OUT) {
            arrayList.add(new C11222l(cls, DddTag.ARGS_ARG_DIRECTION, "Return value argument '" + mo35869e() + "' must be direction OUT"));
        }
        return arrayList;
    }

    public String toString() {
        return "(" + C11321b.class.getSimpleName() + ", " + mo35868d() + ") " + mo35869e();
    }
}
