package p164h.p165b.p166a.p237f.p238d;

import java.util.List;
import p164h.p165b.p166a.p240h.p248s.C11336p;
import p164h.p165b.p166a.p240h.p248s.C11337q;
import p164h.p165b.p166a.p240h.p248s.C11338r;
import p164h.p165b.p166a.p240h.p248s.C11339s;
import p164h.p165b.p166a.p240h.p252w.C11374j;

/* renamed from: h.b.a.f.d.g */
public class C11183g {

    /* renamed from: a */
    public String f22185a;

    /* renamed from: b */
    public C11374j f22186b;

    /* renamed from: c */
    public String f22187c;

    /* renamed from: d */
    public List<String> f22188d;

    /* renamed from: e */
    public C11179c f22189e;

    /* renamed from: f */
    public C11338r f22190f;

    /* renamed from: a */
    public C11336p mo35546a() {
        String[] strArr;
        String str = this.f22185a;
        C11374j jVar = this.f22186b;
        String str2 = this.f22187c;
        List<String> list = this.f22188d;
        C11337q qVar = null;
        if (list == null || list.size() == 0) {
            strArr = null;
        } else {
            List<String> list2 = this.f22188d;
            strArr = (String[]) list2.toArray(new String[list2.size()]);
        }
        if (this.f22189e != null) {
            qVar = new C11337q(this.f22189e.f22151a.longValue(), this.f22189e.f22152b.longValue(), this.f22189e.f22153c.longValue());
        }
        return new C11336p(str, new C11339s(jVar, str2, strArr, qVar), this.f22190f);
    }
}
