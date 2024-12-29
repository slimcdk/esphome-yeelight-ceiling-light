package p210s6;

import java.net.URL;
import java.util.Collection;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.C10041d;
import org.fourthline.cling.model.message.header.C10047h;
import org.fourthline.cling.model.message.header.C10054o;
import org.fourthline.cling.model.message.header.C10055p;
import org.fourthline.cling.model.message.header.C10064y;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.C10076b0;
import org.fourthline.cling.model.types.NotificationSubtype;
import p200p6.C10275a;
import p226w6.C11959d;

/* renamed from: s6.e */
public class C10377e extends C10030d {

    /* renamed from: h */
    private final Collection<C11959d> f19451h;

    public C10377e(C10275a aVar, URL url) {
        this(aVar, url, aVar.mo41772w(), aVar.mo41764C().values());
    }

    public C10377e(C10275a aVar, URL url, C10076b0 b0Var, Collection<C11959d> collection) {
        super(new UpnpRequest(UpnpRequest.Method.NOTIFY, url));
        mo40403j().mo40438l(UpnpHeader.Type.CONTENT_TYPE, new C10041d());
        mo40403j().mo40438l(UpnpHeader.Type.NT, new C10054o());
        mo40403j().mo40438l(UpnpHeader.Type.NTS, new C10055p(NotificationSubtype.PROPCHANGE));
        mo40403j().mo40438l(UpnpHeader.Type.SID, new C10064y(aVar.mo41767K()));
        mo40403j().mo40438l(UpnpHeader.Type.SEQ, new C10047h(b0Var.mo40572c().longValue()));
        this.f19451h = collection;
    }

    /* renamed from: y */
    public Collection<C11959d> mo41978y() {
        return this.f19451h;
    }
}
