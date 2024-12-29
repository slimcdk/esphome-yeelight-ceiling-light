package p164h.p165b.p166a.p237f.p238d;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import p164h.p165b.p166a.p240h.p248s.C11323c;
import p164h.p165b.p166a.p240h.p248s.C11324d;
import p164h.p165b.p166a.p240h.p248s.C11326f;
import p164h.p165b.p166a.p240h.p248s.C11329i;
import p164h.p165b.p166a.p240h.p248s.C11330j;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p248s.C11340t;
import p164h.p165b.p166a.p240h.p252w.C11365e0;
import p164h.p165b.p166a.p240h.p252w.C11370h;
import p164h.p165b.p166a.p240h.p252w.C11372i;
import p164h.p165b.p166a.p240h.p252w.C11381l;

/* renamed from: h.b.a.f.d.d */
public class C11180d {

    /* renamed from: a */
    public C11365e0 f22154a;

    /* renamed from: b */
    public C11184h f22155b = new C11184h();

    /* renamed from: c */
    public URL f22156c;

    /* renamed from: d */
    public String f22157d;

    /* renamed from: e */
    public String f22158e;

    /* renamed from: f */
    public String f22159f;

    /* renamed from: g */
    public URI f22160g;

    /* renamed from: h */
    public String f22161h;

    /* renamed from: i */
    public String f22162i;

    /* renamed from: j */
    public String f22163j;

    /* renamed from: k */
    public URI f22164k;

    /* renamed from: l */
    public String f22165l;

    /* renamed from: m */
    public String f22166m;

    /* renamed from: n */
    public URI f22167n;

    /* renamed from: o */
    public List<C11372i> f22168o = new ArrayList();

    /* renamed from: p */
    public C11370h f22169p;

    /* renamed from: q */
    public List<C11181e> f22170q = new ArrayList();

    /* renamed from: r */
    public List<C11182f> f22171r = new ArrayList();

    /* renamed from: s */
    public List<C11180d> f22172s = new ArrayList();

    /* renamed from: a */
    public C11323c mo35535a(C11323c cVar) {
        return mo35536b(cVar, mo35539e(), this.f22156c);
    }

    /* renamed from: b */
    public C11323c mo35536b(C11323c cVar, C11340t tVar, URL url) {
        ArrayList arrayList = new ArrayList();
        for (C11180d b : this.f22172s) {
            arrayList.add(b.mo35536b(cVar, tVar, url));
        }
        return cVar.mo35876A(this.f22154a, tVar, mo35538d(), mo35537c(url), mo35540f(), mo35541g(cVar), arrayList);
    }

    /* renamed from: c */
    public C11324d mo35537c(URL url) {
        String str = this.f22158e;
        C11329i iVar = new C11329i(this.f22159f, this.f22160g);
        C11330j jVar = new C11330j(this.f22161h, this.f22162i, this.f22163j, this.f22164k);
        String str2 = this.f22165l;
        String str3 = this.f22166m;
        URI uri = this.f22167n;
        List<C11372i> list = this.f22168o;
        return new C11324d(url, str, iVar, jVar, str2, str3, uri, (C11372i[]) list.toArray(new C11372i[list.size()]), this.f22169p);
    }

    /* renamed from: d */
    public C11381l mo35538d() {
        return C11381l.m29829e(this.f22157d);
    }

    /* renamed from: e */
    public C11340t mo35539e() {
        C11184h hVar = this.f22155b;
        return new C11340t(hVar.f22191a, hVar.f22192b);
    }

    /* renamed from: f */
    public C11326f[] mo35540f() {
        C11326f[] fVarArr = new C11326f[this.f22170q.size()];
        int i = 0;
        for (C11181e a : this.f22170q) {
            fVarArr[i] = a.mo35542a();
            i++;
        }
        return fVarArr;
    }

    /* renamed from: g */
    public C11335o[] mo35541g(C11323c cVar) {
        C11335o[] C = cVar.mo35878C(this.f22171r.size());
        int i = 0;
        for (C11182f a : this.f22171r) {
            C[i] = a.mo35543a(cVar);
            i++;
        }
        return C;
    }
}
