package p206r6;

import java.net.URL;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.C10032f;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.C10040c0;
import org.fourthline.cling.model.message.header.C10042d0;
import org.fourthline.cling.model.message.header.C10045f;
import org.fourthline.cling.model.message.header.C10049j;
import org.fourthline.cling.model.message.header.C10050k;
import org.fourthline.cling.model.message.header.C10053n;
import org.fourthline.cling.model.message.header.C10055p;
import org.fourthline.cling.model.message.header.C10062w;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.C10094o;
import org.fourthline.cling.model.types.C10095p;
import org.fourthline.cling.model.types.C10105z;
import org.fourthline.cling.model.types.NotificationSubtype;

/* renamed from: r6.a */
public class C10298a extends C10028b<UpnpRequest> {
    public C10298a(C10028b<UpnpRequest> bVar) {
        super(bVar);
    }

    /* renamed from: A */
    public C10105z mo41838A() {
        C10032f j = mo40403j();
        UpnpHeader.Type type = UpnpHeader.Type.USN;
        UpnpHeader q = j.mo40443q(type, C10042d0.class);
        if (q != null) {
            return (C10105z) q.mo40449b();
        }
        UpnpHeader q2 = mo40403j().mo40443q(type, C10040c0.class);
        if (q2 != null) {
            return (C10105z) q2.mo40449b();
        }
        UpnpHeader q3 = mo40403j().mo40443q(type, C10045f.class);
        if (q3 != null) {
            return ((C10094o) q3.mo40449b()).mo40628b();
        }
        UpnpHeader q4 = mo40403j().mo40443q(type, C10062w.class);
        if (q4 != null) {
            return ((C10095p) q4.mo40449b()).mo40633b();
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo41839B() {
        C10055p pVar = (C10055p) mo40403j().mo40443q(UpnpHeader.Type.NTS, C10055p.class);
        return pVar != null && ((NotificationSubtype) pVar.mo40449b()).equals(NotificationSubtype.ALIVE);
    }

    /* renamed from: C */
    public boolean mo41840C() {
        C10055p pVar = (C10055p) mo40403j().mo40443q(UpnpHeader.Type.NTS, C10055p.class);
        return pVar != null && ((NotificationSubtype) pVar.mo40449b()).equals(NotificationSubtype.BYEBYE);
    }

    /* renamed from: x */
    public byte[] mo41841x() {
        C10049j jVar = (C10049j) mo40403j().mo40443q(UpnpHeader.Type.EXT_IFACE_MAC, C10049j.class);
        if (jVar != null) {
            return (byte[]) jVar.mo40449b();
        }
        return null;
    }

    /* renamed from: y */
    public URL mo41842y() {
        C10050k kVar = (C10050k) mo40403j().mo40443q(UpnpHeader.Type.LOCATION, C10050k.class);
        if (kVar != null) {
            return (URL) kVar.mo40449b();
        }
        return null;
    }

    /* renamed from: z */
    public Integer mo41843z() {
        C10053n nVar = (C10053n) mo40403j().mo40443q(UpnpHeader.Type.MAX_AGE, C10053n.class);
        if (nVar != null) {
            return (Integer) nVar.mo40449b();
        }
        return null;
    }
}
