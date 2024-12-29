package p164h.p165b.p166a.p237f.p238d;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import p164h.p165b.p166a.p240h.p248s.C11320a;
import p164h.p165b.p166a.p240h.p248s.C11323c;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p248s.C11336p;
import p164h.p165b.p166a.p240h.p252w.C11396w;
import p164h.p165b.p166a.p240h.p252w.C11397x;

/* renamed from: h.b.a.f.d.f */
public class C11182f {

    /* renamed from: a */
    public C11397x f22178a;

    /* renamed from: b */
    public C11396w f22179b;

    /* renamed from: c */
    public URI f22180c;

    /* renamed from: d */
    public URI f22181d;

    /* renamed from: e */
    public URI f22182e;

    /* renamed from: f */
    public List<C11177a> f22183f = new ArrayList();

    /* renamed from: g */
    public List<C11183g> f22184g = new ArrayList();

    /* renamed from: a */
    public C11335o mo35543a(C11323c cVar) {
        return cVar.mo35877B(this.f22178a, this.f22179b, this.f22180c, this.f22181d, this.f22182e, mo35544b(), mo35545c());
    }

    /* renamed from: b */
    public C11320a[] mo35544b() {
        C11320a[] aVarArr = new C11320a[this.f22183f.size()];
        int i = 0;
        for (C11177a a : this.f22183f) {
            aVarArr[i] = a.mo35532a();
            i++;
        }
        return aVarArr;
    }

    /* renamed from: c */
    public C11336p[] mo35545c() {
        C11336p[] pVarArr = new C11336p[this.f22184g.size()];
        int i = 0;
        for (C11183g a : this.f22184g) {
            pVarArr[i] = a.mo35546a();
            i++;
        }
        return pVarArr;
    }
}
