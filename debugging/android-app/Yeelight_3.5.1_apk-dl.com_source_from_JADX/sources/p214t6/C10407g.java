package p214t6;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.fourthline.cling.model.C10019g;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.meta.C10067b;
import org.fourthline.cling.model.meta.C10068c;
import org.fourthline.cling.model.meta.C10071f;
import org.fourthline.cling.model.meta.RemoteDevice;
import org.fourthline.cling.model.meta.RemoteService;
import org.fourthline.cling.model.types.C10089j;
import org.fourthline.cling.model.types.C10097r;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.C10105z;
import org.seamless.util.URIUtil;
import p222v6.C10549c;
import p222v6.C10552f;

/* renamed from: t6.g */
public class C10407g extends C10067b<C10408h, C10407g, C10409i> {
    public C10407g(C10408h hVar) {
        super(hVar);
    }

    public C10407g(C10408h hVar, C10413m mVar, C10089j jVar, C10401a aVar, C10068c[] cVarArr, C10409i[] iVarArr, C10407g[] gVarArr) {
        super(hVar, mVar, jVar, aVar, cVarArr, iVarArr, gVarArr);
    }

    /* renamed from: G */
    public C10407g mo40493e(C10105z zVar) {
        return (C10407g) mo40492d(zVar, this);
    }

    /* renamed from: H */
    public C10407g[] mo40504n() {
        D[] dArr = this.f18571g;
        return dArr != null ? (C10407g[]) dArr : new C10407g[0];
    }

    /* renamed from: I */
    public C10407g mo40508r() {
        if (mo40516z()) {
            return this;
        }
        C10407g gVar = this;
        while (gVar.mo40507q() != null) {
            gVar = (C10407g) gVar.mo40507q();
        }
        return gVar;
    }

    /* renamed from: J */
    public C10409i[] mo40509s() {
        S[] sArr = this.f18570f;
        return sArr != null ? (C10409i[]) sArr : new C10409i[0];
    }

    /* renamed from: K */
    public C10407g mo40483A(C10105z zVar, C10413m mVar, C10089j jVar, C10401a aVar, C10068c[] cVarArr, RemoteService[] remoteServiceArr, List<C10407g> list) {
        C10407g[] gVarArr;
        C10105z zVar2 = zVar;
        C10408h hVar = new C10408h(zVar, (C10408h) mo40506p());
        if (list.size() > 0) {
            gVarArr = (C10407g[]) list.toArray(new C10407g[list.size()]);
        } else {
            gVarArr = null;
        }
        return new C10407g(hVar, mVar, jVar, aVar, cVarArr, remoteServiceArr, gVarArr);
    }

    /* renamed from: L */
    public C10409i mo40484B(C10098s sVar, C10097r rVar, URI uri, URI uri2, URI uri3, C10066a<RemoteService>[] aVarArr, C10071f<RemoteService>[] fVarArr) {
        return new C10409i(sVar, rVar, uri, uri2, uri3, aVarArr, fVarArr);
    }

    /* renamed from: M */
    public C10409i[] mo40485C(int i) {
        return new C10409i[i];
    }

    /* renamed from: N */
    public URL mo42094N(URI uri) {
        return URIUtil.m25749b((mo40502l() == null || mo40502l().mo42046a() == null) ? ((C10408h) mo40506p()).mo42097d() : mo40502l().mo42046a(), uri);
    }

    /* renamed from: O */
    public RemoteDevice[] mo40487E(Collection<C10407g> collection) {
        return (C10407g[]) collection.toArray(new C10407g[collection.size()]);
    }

    /* renamed from: P */
    public RemoteService[] mo42096P(Collection<C10409i> collection) {
        return (C10409i[]) collection.toArray(new C10409i[collection.size()]);
    }

    /* renamed from: a */
    public C10549c[] mo40489a(C10019g gVar) {
        ArrayList arrayList = new ArrayList();
        for (C10409i iVar : mo40509s()) {
            if (iVar != null) {
                arrayList.add(new C10552f(gVar.mo40358h(iVar), iVar));
            }
        }
        if (mo40513v()) {
            for (C10407g gVar2 : mo40504n()) {
                if (gVar2 != null) {
                    arrayList.addAll(Arrays.asList(gVar2.mo40489a(gVar)));
                }
            }
        }
        return (C10549c[]) arrayList.toArray(new C10549c[arrayList.size()]);
    }
}
