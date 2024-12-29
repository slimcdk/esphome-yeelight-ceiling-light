package p206r6;

import org.fourthline.cling.model.C10017e;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.C10029c;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.C10046g;
import org.fourthline.cling.model.message.header.C10049j;
import org.fourthline.cling.model.message.header.C10050k;
import org.fourthline.cling.model.message.header.C10053n;
import org.fourthline.cling.model.message.header.C10060u;
import org.fourthline.cling.model.message.header.UpnpHeader;
import p214t6.C10403c;

/* renamed from: r6.j */
public class C10307j extends C10029c<UpnpResponse> {
    public C10307j(C10028b bVar, C10017e eVar, C10403c cVar) {
        super(new UpnpResponse(UpnpResponse.Status.OK), bVar.mo40430v(), bVar.mo40431w());
        mo40403j().mo40438l(UpnpHeader.Type.MAX_AGE, new C10053n(cVar.mo40506p().mo42057a()));
        mo40403j().mo40438l(UpnpHeader.Type.LOCATION, new C10050k(eVar.mo40348c()));
        mo40403j().mo40438l(UpnpHeader.Type.SERVER, new C10060u());
        mo40403j().mo40438l(UpnpHeader.Type.EXT, new C10046g());
        if ("true".equals(System.getProperty("org.fourthline.cling.network.announceMACAddress")) && eVar.mo40347b().mo40369b() != null) {
            mo40403j().mo40438l(UpnpHeader.Type.EXT_IFACE_MAC, new C10049j(eVar.mo40347b().mo40369b()));
        }
    }
}
