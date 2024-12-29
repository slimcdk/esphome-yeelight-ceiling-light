package p214t6;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.fourthline.cling.model.C10019g;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.meta.C10067b;
import org.fourthline.cling.model.meta.C10068c;
import org.fourthline.cling.model.meta.C10071f;
import org.fourthline.cling.model.meta.LocalDevice;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.types.C10089j;
import org.fourthline.cling.model.types.C10097r;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.C10105z;
import p218u6.C10541b;
import p218u6.C10542c;
import p222v6.C10547a;
import p222v6.C10548b;
import p222v6.C10549c;
import p222v6.C10550d;
import p222v6.C10551e;
import p222v6.C10553g;

/* renamed from: t6.c */
public class C10403c extends C10067b<C10402b, C10403c, C10404d> {

    /* renamed from: j */
    private final C10541b f19477j = null;

    public C10403c(C10402b bVar, C10089j jVar, C10401a aVar, C10404d[] dVarArr) {
        super(bVar, jVar, aVar, (C10068c[]) null, dVarArr);
    }

    public C10403c(C10402b bVar, C10413m mVar, C10089j jVar, C10401a aVar, C10068c[] cVarArr, C10404d[] dVarArr, C10403c[] cVarArr2) {
        super(bVar, mVar, jVar, aVar, cVarArr, dVarArr, cVarArr2);
    }

    /* renamed from: F */
    public List<C10023k> mo40488F() {
        Class<C10403c> cls = C10403c.class;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo40488F());
        if (mo40514w()) {
            for (C10068c cVar : mo40505o()) {
                if (cVar.mo40523g().isAbsolute()) {
                    arrayList.add(new C10023k(cls, "icons", "Local icon URI can not be absolute: " + cVar.mo40523g()));
                }
                if (cVar.mo40523g().toString().contains("../")) {
                    arrayList.add(new C10023k(cls, "icons", "Local icon URI must not contain '../': " + cVar.mo40523g()));
                }
                if (cVar.mo40523g().toString().startsWith(MiotCloudImpl.COOKIE_PATH)) {
                    arrayList.add(new C10023k(cls, "icons", "Local icon URI must not start with '/': " + cVar.mo40523g()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: G */
    public C10403c mo40493e(C10105z zVar) {
        return (C10403c) mo40492d(zVar, this);
    }

    /* renamed from: H */
    public C10541b mo42064H() {
        return this.f19477j;
    }

    /* renamed from: I */
    public C10403c[] mo40504n() {
        D[] dArr = this.f18571g;
        return dArr != null ? (C10403c[]) dArr : new C10403c[0];
    }

    /* renamed from: J */
    public C10403c mo40508r() {
        if (mo40516z()) {
            return this;
        }
        C10403c cVar = this;
        while (cVar.mo40507q() != null) {
            cVar = (C10403c) cVar.mo40507q();
        }
        return cVar;
    }

    /* renamed from: K */
    public C10404d[] mo40509s() {
        S[] sArr = this.f18570f;
        return sArr != null ? (C10404d[]) sArr : new C10404d[0];
    }

    /* renamed from: L */
    public C10403c mo40483A(C10105z zVar, C10413m mVar, C10089j jVar, C10401a aVar, C10068c[] cVarArr, LocalService[] localServiceArr, List<C10403c> list) {
        C10403c[] cVarArr2;
        C10105z zVar2 = zVar;
        C10402b bVar = new C10402b(zVar, mo40506p().mo42057a());
        if (list.size() > 0) {
            cVarArr2 = (C10403c[]) list.toArray(new C10403c[list.size()]);
        } else {
            cVarArr2 = null;
        }
        return new C10403c(bVar, mVar, jVar, aVar, cVarArr, localServiceArr, cVarArr2);
    }

    /* renamed from: M */
    public C10404d mo40484B(C10098s sVar, C10097r rVar, URI uri, URI uri2, URI uri3, C10066a<LocalService>[] aVarArr, C10071f<LocalService>[] fVarArr) {
        return new C10404d(sVar, rVar, aVarArr, fVarArr);
    }

    /* renamed from: N */
    public C10404d[] mo40485C(int i) {
        return new C10404d[i];
    }

    /* renamed from: O */
    public LocalDevice[] mo40487E(Collection<C10403c> collection) {
        return (C10403c[]) collection.toArray(new C10403c[collection.size()]);
    }

    /* renamed from: a */
    public C10549c[] mo40489a(C10019g gVar) {
        ArrayList arrayList = new ArrayList();
        if (mo40516z()) {
            arrayList.add(new C10547a(gVar.mo40354d(this), this));
        }
        for (C10404d dVar : mo40509s()) {
            arrayList.add(new C10551e(gVar.mo40355e(dVar), dVar));
            arrayList.add(new C10550d(gVar.mo40353c(dVar), dVar));
            arrayList.add(new C10553g(gVar.mo40360j(dVar), dVar));
        }
        for (C10068c cVar : mo40505o()) {
            arrayList.add(new C10548b(gVar.mo40367q(this, cVar.mo40523g()), cVar));
        }
        if (mo40513v()) {
            for (C10403c a : mo40504n()) {
                arrayList.addAll(Arrays.asList(a.mo40489a(gVar)));
            }
        }
        return (C10549c[]) arrayList.toArray(new C10549c[arrayList.size()]);
    }

    /* renamed from: m */
    public C10401a mo40503m(C10542c cVar) {
        return mo42064H() != null ? mo42064H().mo42201a(cVar) : mo40502l();
    }
}
