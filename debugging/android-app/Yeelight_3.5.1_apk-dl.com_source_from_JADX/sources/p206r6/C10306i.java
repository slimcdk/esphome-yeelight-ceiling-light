package p206r6;

import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.model.message.C10029c;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.C10048i;
import org.fourthline.cling.model.message.header.C10051l;
import org.fourthline.cling.model.message.header.C10052m;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;

/* renamed from: r6.i */
public class C10306i extends C10029c<UpnpRequest> {
    public C10306i(UpnpHeader upnpHeader, int i) {
        super(new UpnpRequest(UpnpRequest.Method.MSEARCH), C10018f.m24804c("239.255.255.250"), 1900);
        mo40403j().mo40438l(UpnpHeader.Type.MAN, new C10051l(NotificationSubtype.DISCOVER.getHeaderString()));
        mo40403j().mo40438l(UpnpHeader.Type.MX, new C10052m(Integer.valueOf(i)));
        mo40403j().mo40438l(UpnpHeader.Type.ST, upnpHeader);
        mo40403j().mo40438l(UpnpHeader.Type.HOST, new C10048i());
    }
}
