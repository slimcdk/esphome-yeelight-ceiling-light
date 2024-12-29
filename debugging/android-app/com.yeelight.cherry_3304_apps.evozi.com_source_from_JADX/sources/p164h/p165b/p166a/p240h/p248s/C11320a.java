package p164h.p165b.p166a.p240h.p248s;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.C11216f;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.p248s.C11321b;
import p164h.p165b.p166a.p240h.p248s.C11335o;

/* renamed from: h.b.a.h.s.a */
public class C11320a<S extends C11335o> {

    /* renamed from: f */
    private static final Logger f22438f = Logger.getLogger(C11320a.class.getName());

    /* renamed from: a */
    private final String f22439a;

    /* renamed from: b */
    private final C11321b[] f22440b;

    /* renamed from: c */
    private final C11321b[] f22441c;

    /* renamed from: d */
    private final C11321b[] f22442d;

    /* renamed from: e */
    private S f22443e;

    public C11320a(String str, C11321b[] bVarArr) {
        this.f22439a = str;
        if (bVarArr != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C11321b bVar : bVarArr) {
                bVar.mo35873i(this);
                if (bVar.mo35868d().equals(C11321b.C11322a.IN)) {
                    arrayList.add(bVar);
                }
                if (bVar.mo35868d().equals(C11321b.C11322a.OUT)) {
                    arrayList2.add(bVar);
                }
            }
            this.f22440b = bVarArr;
            this.f22441c = (C11321b[]) arrayList.toArray(new C11321b[arrayList.size()]);
            this.f22442d = (C11321b[]) arrayList2.toArray(new C11321b[arrayList2.size()]);
            return;
        }
        this.f22440b = new C11321b[0];
        this.f22441c = new C11321b[0];
        this.f22442d = new C11321b[0];
    }

    /* renamed from: a */
    public C11321b[] mo35853a() {
        return this.f22440b;
    }

    /* renamed from: b */
    public C11321b<S> mo35854b(String str) {
        for (C11321b<S> bVar : mo35855c()) {
            if (bVar.mo35871g(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public C11321b<S>[] mo35855c() {
        return this.f22441c;
    }

    /* renamed from: d */
    public String mo35856d() {
        return this.f22439a;
    }

    /* renamed from: e */
    public C11321b<S> mo35857e(String str) {
        for (C11321b<S> bVar : mo35858f()) {
            if (bVar.mo35869e().equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public C11321b<S>[] mo35858f() {
        return this.f22442d;
    }

    /* renamed from: g */
    public S mo35859g() {
        return this.f22443e;
    }

    /* renamed from: h */
    public boolean mo35860h() {
        return mo35853a() != null && mo35853a().length > 0;
    }

    /* renamed from: i */
    public boolean mo35861i() {
        return mo35858f() != null && mo35858f().length > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo35862j(S s) {
        if (this.f22443e == null) {
            this.f22443e = s;
            return;
        }
        throw new IllegalStateException("Final value has been set already, model is immutable");
    }

    /* renamed from: k */
    public List<C11222l> mo35863k() {
        ArrayList arrayList = new ArrayList();
        if (mo35856d() == null || mo35856d().length() == 0) {
            arrayList.add(new C11222l(getClass(), "name", "Action without name of: " + mo35859g()));
        } else if (!C11216f.m29268e(mo35856d())) {
            f22438f.warning("UPnP specification violation of: " + mo35859g().mo35983d());
            f22438f.warning("Invalid action name: " + this);
        }
        for (C11321b bVar : mo35853a()) {
            if (mo35859g().mo35987h(bVar.mo35870f()) == null) {
                arrayList.add(new C11222l(getClass(), "arguments", "Action argument references an unknown state variable: " + bVar.mo35870f()));
            }
        }
        C11321b bVar2 = null;
        int i = 0;
        int i2 = 0;
        for (C11321b bVar3 : mo35853a()) {
            if (bVar3.mo35872h()) {
                if (bVar3.mo35868d() == C11321b.C11322a.IN) {
                    f22438f.warning("UPnP specification violation of :" + mo35859g().mo35983d());
                    f22438f.warning("Input argument can not have <retval/>");
                } else {
                    if (bVar2 != null) {
                        f22438f.warning("UPnP specification violation of: " + mo35859g().mo35983d());
                        f22438f.warning("Only one argument of action '" + mo35856d() + "' can be <retval/>");
                    }
                    i2 = i;
                    bVar2 = bVar3;
                }
            }
            i++;
        }
        if (bVar2 != null) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (mo35853a()[i3].mo35868d() == C11321b.C11322a.OUT) {
                    f22438f.warning("UPnP specification violation of: " + mo35859g().mo35983d());
                    f22438f.warning("Argument '" + bVar2.mo35869e() + "' of action '" + mo35856d() + "' is <retval/> but not the first OUT argument");
                }
            }
        }
        for (C11321b j : this.f22440b) {
            arrayList.addAll(j.mo35874j());
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(getClass().getSimpleName());
        sb.append(", Arguments: ");
        sb.append(mo35853a() != null ? Integer.valueOf(mo35853a().length) : "NO ARGS");
        sb.append(") ");
        sb.append(mo35856d());
        return sb.toString();
    }
}
