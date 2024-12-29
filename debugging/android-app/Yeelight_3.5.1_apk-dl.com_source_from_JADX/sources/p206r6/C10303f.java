package p206r6;

import org.fourthline.cling.model.C10017e;
import org.fourthline.cling.model.message.header.C10042d0;
import org.fourthline.cling.model.message.header.C10049j;
import org.fourthline.cling.model.message.header.C10058s;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import p214t6.C10403c;

/* renamed from: r6.f */
public class C10303f extends C10301d {
    public C10303f(C10017e eVar, C10403c cVar, NotificationSubtype notificationSubtype) {
        super(eVar, cVar, notificationSubtype);
        mo40403j().mo40438l(UpnpHeader.Type.NT, new C10058s());
        mo40403j().mo40438l(UpnpHeader.Type.USN, new C10042d0(cVar.mo40506p().mo42058b()));
        if ("true".equals(System.getProperty("org.fourthline.cling.network.announceMACAddress")) && eVar.mo40347b().mo40369b() != null) {
            mo40403j().mo40438l(UpnpHeader.Type.EXT_IFACE_MAC, new C10049j(eVar.mo40347b().mo40369b()));
        }
    }
}
