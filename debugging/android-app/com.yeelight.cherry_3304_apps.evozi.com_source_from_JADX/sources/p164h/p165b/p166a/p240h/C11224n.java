package p164h.p165b.p166a.p240h;

import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.p252w.C11374j;
import p164h.p165b.p166a.p240h.p252w.C11391r;

/* renamed from: h.b.a.h.n */
public class C11224n {

    /* renamed from: c */
    private static final Logger f22313c = Logger.getLogger(C11224n.class.getName());

    /* renamed from: a */
    private final C11374j f22314a;

    /* renamed from: b */
    private final Object f22315b;

    public C11224n(C11374j jVar, Object obj) {
        this.f22314a = jVar;
        this.f22315b = obj instanceof String ? jVar.mo36049f((String) obj) : obj;
        if (!C11216f.f22294a) {
            if (mo35688a().mo36043c(mo35689b())) {
                mo35690c(toString());
                return;
            }
            throw new C11391r("Invalid value for " + mo35688a() + ": " + mo35689b());
        }
    }

    /* renamed from: a */
    public C11374j mo35688a() {
        return this.f22314a;
    }

    /* renamed from: b */
    public Object mo35689b() {
        return this.f22315b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo35690c(String str) {
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (!(codePointAt == 9 || codePointAt == 10 || codePointAt == 13 || ((codePointAt >= 32 && codePointAt <= 55295) || ((codePointAt >= 57344 && codePointAt <= 65533) || (codePointAt >= 65536 && codePointAt <= 1114111))))) {
                Logger logger = f22313c;
                logger.warning("Found invalid XML char code: " + codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    public String toString() {
        return mo35688a().mo36041a(mo35689b());
    }
}
