package p206r6;

import org.fourthline.cling.model.C10017e;
import org.fourthline.cling.model.message.header.C10061v;
import org.fourthline.cling.model.message.header.C10062w;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.NotificationSubtype;
import p214t6.C10403c;

/* renamed from: r6.g */
public class C10304g extends C10301d {
    public C10304g(C10017e eVar, C10403c cVar, NotificationSubtype notificationSubtype, C10098s sVar) {
        super(eVar, cVar, notificationSubtype);
        mo40403j().mo40438l(UpnpHeader.Type.NT, new C10061v(sVar));
        mo40403j().mo40438l(UpnpHeader.Type.USN, new C10062w(cVar.mo40506p().mo42058b(), sVar));
    }
}
