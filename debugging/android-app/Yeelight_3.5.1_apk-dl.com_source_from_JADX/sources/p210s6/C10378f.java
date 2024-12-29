package p210s6;

import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.C10041d;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* renamed from: s6.f */
public class C10378f extends C10031e {
    public C10378f() {
        super(new UpnpResponse(UpnpResponse.Status.OK));
        mo40403j().mo40438l(UpnpHeader.Type.CONTENT_TYPE, new C10041d());
    }

    public C10378f(UpnpResponse upnpResponse) {
        super(upnpResponse);
        mo40403j().mo40438l(UpnpHeader.Type.CONTENT_TYPE, new C10041d());
    }
}
