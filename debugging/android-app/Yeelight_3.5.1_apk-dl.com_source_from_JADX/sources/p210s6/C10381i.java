package p210s6;

import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.C10060u;
import org.fourthline.cling.model.message.header.C10064y;
import org.fourthline.cling.model.message.header.C10065z;
import org.fourthline.cling.model.message.header.UpnpHeader;
import p200p6.C10276b;

/* renamed from: s6.i */
public class C10381i extends C10031e {
    public C10381i(UpnpResponse.Status status) {
        super(status);
    }

    public C10381i(C10276b bVar) {
        super(new UpnpResponse(UpnpResponse.Status.OK));
        mo40403j().mo40438l(UpnpHeader.Type.SERVER, new C10060u());
        mo40403j().mo40438l(UpnpHeader.Type.SID, new C10064y(bVar.mo41767K()));
        mo40403j().mo40438l(UpnpHeader.Type.TIMEOUT, new C10065z(bVar.mo41770p()));
    }
}
