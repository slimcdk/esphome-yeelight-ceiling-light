package p183l6;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.meta.C10067b;
import org.fourthline.cling.model.meta.C10068c;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.types.C10087h;
import org.fourthline.cling.model.types.C10089j;
import org.fourthline.cling.model.types.C10105z;
import org.fourthline.cling.model.types.DLNADoc;
import p214t6.C10401a;
import p214t6.C10405e;
import p214t6.C10406f;
import p214t6.C10413m;

/* renamed from: l6.d */
public class C9538d {

    /* renamed from: a */
    public C10105z f17378a;

    /* renamed from: b */
    public C9542h f17379b = new C9542h();

    /* renamed from: c */
    public URL f17380c;

    /* renamed from: d */
    public String f17381d;

    /* renamed from: e */
    public String f17382e;

    /* renamed from: f */
    public String f17383f;

    /* renamed from: g */
    public URI f17384g;

    /* renamed from: h */
    public String f17385h;

    /* renamed from: i */
    public String f17386i;

    /* renamed from: j */
    public String f17387j;

    /* renamed from: k */
    public URI f17388k;

    /* renamed from: l */
    public String f17389l;

    /* renamed from: m */
    public String f17390m;

    /* renamed from: n */
    public URI f17391n;

    /* renamed from: o */
    public List<DLNADoc> f17392o = new ArrayList();

    /* renamed from: p */
    public C10087h f17393p;

    /* renamed from: q */
    public List<C9539e> f17394q = new ArrayList();

    /* renamed from: r */
    public List<C9540f> f17395r = new ArrayList();

    /* renamed from: s */
    public List<C9538d> f17396s = new ArrayList();

    /* renamed from: a */
    public C10067b mo38497a(C10067b bVar) {
        return mo38498b(bVar, mo38501e(), this.f17380c);
    }

    /* renamed from: b */
    public C10067b mo38498b(C10067b bVar, C10413m mVar, URL url) {
        ArrayList arrayList = new ArrayList();
        for (C9538d b : this.f17396s) {
            arrayList.add(b.mo38498b(bVar, mVar, url));
        }
        return bVar.mo40483A(this.f17378a, mVar, mo38500d(), mo38499c(url), mo38502f(), mo38503g(bVar), arrayList);
    }

    /* renamed from: c */
    public C10401a mo38499c(URL url) {
        String str = this.f17382e;
        C10405e eVar = new C10405e(this.f17383f, this.f17384g);
        C10406f fVar = new C10406f(this.f17385h, this.f17386i, this.f17387j, this.f17388k);
        String str2 = this.f17389l;
        String str3 = this.f17390m;
        URI uri = this.f17391n;
        List<DLNADoc> list = this.f17392o;
        return new C10401a(url, str, eVar, fVar, str2, str3, uri, (DLNADoc[]) list.toArray(new DLNADoc[list.size()]), this.f17393p);
    }

    /* renamed from: d */
    public C10089j mo38500d() {
        return C10089j.m25135e(this.f17381d);
    }

    /* renamed from: e */
    public C10413m mo38501e() {
        C9542h hVar = this.f17379b;
        return new C10413m(hVar.f17415a, hVar.f17416b);
    }

    /* renamed from: f */
    public C10068c[] mo38502f() {
        C10068c[] cVarArr = new C10068c[this.f17394q.size()];
        int i = 0;
        for (C9539e a : this.f17394q) {
            cVarArr[i] = a.mo38504a();
            i++;
        }
        return cVarArr;
    }

    /* renamed from: g */
    public C10070e[] mo38503g(C10067b bVar) {
        C10070e[] C = bVar.mo40485C(this.f17395r.size());
        int i = 0;
        for (C9540f a : this.f17395r) {
            C[i] = a.mo38505a(bVar);
            i++;
        }
        return C;
    }
}
