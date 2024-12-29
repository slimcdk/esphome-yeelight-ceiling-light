package p206r6;

import org.fourthline.cling.model.C10017e;
import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.model.message.C10029c;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.C10048i;
import org.fourthline.cling.model.message.header.C10050k;
import org.fourthline.cling.model.message.header.C10053n;
import org.fourthline.cling.model.message.header.C10055p;
import org.fourthline.cling.model.message.header.C10060u;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import p214t6.C10403c;

/* renamed from: r6.d */
public abstract class C10301d extends C10029c<UpnpRequest> {
    protected C10301d(C10017e eVar, C10403c cVar, NotificationSubtype notificationSubtype) {
        super(new UpnpRequest(UpnpRequest.Method.NOTIFY), C10018f.m24804c("239.255.255.250"), 1900);
        mo40403j().mo40438l(UpnpHeader.Type.MAX_AGE, new C10053n(cVar.mo40506p().mo42057a()));
        mo40403j().mo40438l(UpnpHeader.Type.LOCATION, new C10050k(eVar.mo40348c()));
        mo40403j().mo40438l(UpnpHeader.Type.SERVER, new C10060u());
        mo40403j().mo40438l(UpnpHeader.Type.HOST, new C10048i());
        mo40403j().mo40438l(UpnpHeader.Type.NTS, new C10055p(notificationSubtype));
    }
}
