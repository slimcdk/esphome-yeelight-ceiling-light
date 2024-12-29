package p164h.p165b.p166a.p240h.p248s;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.C11216f;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p252w.C11374j;

/* renamed from: h.b.a.h.s.p */
public class C11336p<S extends C11335o> {

    /* renamed from: e */
    private static final Logger f22508e = Logger.getLogger(C11336p.class.getName());

    /* renamed from: a */
    private final String f22509a;

    /* renamed from: b */
    private final C11339s f22510b;

    /* renamed from: c */
    private final C11338r f22511c;

    /* renamed from: d */
    private S f22512d;

    public C11336p(String str, C11339s sVar) {
        this(str, sVar, new C11338r());
    }

    public C11336p(String str, C11339s sVar, C11338r rVar) {
        this.f22509a = str;
        this.f22510b = sVar;
        this.f22511c = rVar;
    }

    /* renamed from: a */
    public C11338r mo35993a() {
        return this.f22511c;
    }

    /* renamed from: b */
    public String mo35994b() {
        return this.f22509a;
    }

    /* renamed from: c */
    public S mo35995c() {
        return this.f22512d;
    }

    /* renamed from: d */
    public C11339s mo35996d() {
        return this.f22510b;
    }

    /* renamed from: e */
    public boolean mo35997e() {
        return C11374j.C11375a.m29813d(mo35996d().mo36013d().mo36045e()) && mo35993a().mo36008b() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo35998f(S s) {
        if (this.f22512d == null) {
            this.f22512d = s;
            return;
        }
        throw new IllegalStateException("Final value has been set already, model is immutable");
    }

    /* renamed from: g */
    public List<C11222l> mo35999g() {
        ArrayList arrayList = new ArrayList();
        if (mo35994b() == null || mo35994b().length() == 0) {
            arrayList.add(new C11222l(C11336p.class, "name", "StateVariable without name of: " + mo35995c()));
        } else if (!C11216f.m29268e(mo35994b())) {
            Logger logger = f22508e;
            logger.warning("UPnP specification violation of: " + mo35995c().mo35983d());
            Logger logger2 = f22508e;
            logger2.warning("Invalid state variable name: " + this);
        }
        arrayList.addAll(mo35996d().mo36015f());
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(C11336p.class.getSimpleName());
        sb.append(", Name: ");
        sb.append(mo35994b());
        sb.append(", Type: ");
        sb.append(mo35996d().mo36013d().mo36044d());
        sb.append(")");
        if (!mo35993a().mo36009c()) {
            sb.append(" (No Events)");
        }
        if (mo35996d().mo36014e() != null) {
            sb.append(" Default Value: ");
            sb.append("'");
            sb.append(mo35996d().mo36014e());
            sb.append("'");
        }
        if (mo35996d().mo36012c() != null) {
            sb.append(" Allowed Values: ");
            for (String append : mo35996d().mo36012c()) {
                sb.append(append);
                sb.append("|");
            }
        }
        return sb.toString();
    }
}
