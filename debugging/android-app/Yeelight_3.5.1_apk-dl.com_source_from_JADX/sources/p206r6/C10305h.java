package p206r6;

import org.fourthline.cling.model.C10017e;
import org.fourthline.cling.model.message.header.C10040c0;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import p214t6.C10403c;

/* renamed from: r6.h */
public class C10305h extends C10301d {
    public C10305h(C10017e eVar, C10403c cVar, NotificationSubtype notificationSubtype) {
        super(eVar, cVar, notificationSubtype);
        mo40403j().mo40438l(UpnpHeader.Type.NT, new C10040c0(cVar.mo40506p().mo42058b()));
        mo40403j().mo40438l(UpnpHeader.Type.USN, new C10040c0(cVar.mo40506p().mo42058b()));
    }
}
