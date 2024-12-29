package p206r6;

import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.C10051l;
import org.fourthline.cling.model.message.header.C10052m;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;

/* renamed from: r6.b */
public class C10299b extends C10028b<UpnpRequest> {
    public C10299b(C10028b<UpnpRequest> bVar) {
        super(bVar);
    }

    /* renamed from: x */
    public Integer mo41844x() {
        C10052m mVar = (C10052m) mo40403j().mo40443q(UpnpHeader.Type.MX, C10052m.class);
        if (mVar != null) {
            return (Integer) mVar.mo40449b();
        }
        return null;
    }

    /* renamed from: y */
    public UpnpHeader mo41845y() {
        return mo40403j().mo40442p(UpnpHeader.Type.ST);
    }

    /* renamed from: z */
    public boolean mo41846z() {
        C10051l lVar = (C10051l) mo40403j().mo40443q(UpnpHeader.Type.MAN, C10051l.class);
        return lVar != null && ((String) lVar.mo40449b()).equals(NotificationSubtype.DISCOVER.getHeaderString());
    }
}
