package p204q6;

import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.C10041d;
import org.fourthline.cling.model.message.header.C10046g;
import org.fourthline.cling.model.message.header.C10060u;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.meta.C10069d;

/* renamed from: q6.g */
public class C10291g extends C10031e implements C10287c {

    /* renamed from: g */
    private String f19374g;

    public C10291g(UpnpResponse.Status status) {
        this(status, (C10066a) null);
    }

    public C10291g(UpnpResponse.Status status, C10066a aVar) {
        super(new UpnpResponse(status));
        if (aVar != null) {
            this.f19374g = aVar instanceof C10069d ? "urn:schemas-upnp-org:control-1-0" : aVar.mo40477g().mo40534g().toString();
        }
        mo41810u();
    }

    public C10291g(C10066a aVar) {
        this(UpnpResponse.Status.OK, aVar);
    }

    /* renamed from: d */
    public String mo41806d() {
        return this.f19374g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo41810u() {
        mo40403j().mo40438l(UpnpHeader.Type.CONTENT_TYPE, new C10041d(C10041d.f18540d));
        mo40403j().mo40438l(UpnpHeader.Type.SERVER, new C10060u());
        mo40403j().mo40438l(UpnpHeader.Type.EXT, new C10046g());
    }
}
