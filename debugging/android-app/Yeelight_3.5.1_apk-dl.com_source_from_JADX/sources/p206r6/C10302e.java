package p206r6;

import org.fourthline.cling.model.C10017e;
import org.fourthline.cling.model.message.header.C10043e;
import org.fourthline.cling.model.message.header.C10045f;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import p214t6.C10403c;

/* renamed from: r6.e */
public class C10302e extends C10301d {
    public C10302e(C10017e eVar, C10403c cVar, NotificationSubtype notificationSubtype) {
        super(eVar, cVar, notificationSubtype);
        mo40403j().mo40438l(UpnpHeader.Type.NT, new C10043e(cVar.mo40510t()));
        mo40403j().mo40438l(UpnpHeader.Type.USN, new C10045f(cVar.mo40506p().mo42058b(), cVar.mo40510t()));
    }
}
