package p214t6;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.meta.C10071f;
import org.fourthline.cling.model.meta.RemoteService;
import org.fourthline.cling.model.types.C10097r;
import org.fourthline.cling.model.types.C10098s;

/* renamed from: t6.i */
public class C10409i extends C10070e<C10407g, C10409i> {

    /* renamed from: g */
    private final URI f19492g;

    /* renamed from: h */
    private final URI f19493h;

    /* renamed from: i */
    private final URI f19494i;

    public C10409i(C10098s sVar, C10097r rVar, URI uri, URI uri2, URI uri3, C10066a<RemoteService>[] aVarArr, C10071f<RemoteService>[] fVarArr) {
        super(sVar, rVar, aVarArr, fVarArr);
        this.f19492g = uri;
        this.f19493h = uri2;
        this.f19494i = uri3;
        List<C10023k> q = mo42103q();
        if (q.size() > 0) {
            throw new ValidationException("Validation of device graph failed, call getErrors() on exception", q);
        }
    }

    /* renamed from: n */
    public URI mo42100n() {
        return this.f19493h;
    }

    /* renamed from: o */
    public URI mo42101o() {
        return this.f19492g;
    }

    /* renamed from: p */
    public URI mo42102p() {
        return this.f19494i;
    }

    /* renamed from: q */
    public List<C10023k> mo42103q() {
        Class<C10409i> cls = C10409i.class;
        ArrayList arrayList = new ArrayList();
        if (mo42101o() == null) {
            arrayList.add(new C10023k(cls, "descriptorURI", "Descriptor location (SCPDURL) is required"));
        }
        if (mo42100n() == null) {
            arrayList.add(new C10023k(cls, "controlURI", "Control URL is required"));
        }
        if (mo42102p() == null) {
            arrayList.add(new C10023k(cls, "eventSubscriptionURI", "Event subscription URL is required"));
        }
        return arrayList;
    }

    public String toString() {
        return "(" + C10409i.class.getSimpleName() + ") Descriptor: " + mo42101o();
    }
}
