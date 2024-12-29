package p206r6;

import java.net.URL;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.C10032f;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.C10040c0;
import org.fourthline.cling.model.message.header.C10042d0;
import org.fourthline.cling.model.message.header.C10045f;
import org.fourthline.cling.model.message.header.C10049j;
import org.fourthline.cling.model.message.header.C10050k;
import org.fourthline.cling.model.message.header.C10053n;
import org.fourthline.cling.model.message.header.C10062w;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.C10094o;
import org.fourthline.cling.model.types.C10095p;
import org.fourthline.cling.model.types.C10105z;

/* renamed from: r6.c */
public class C10300c extends C10028b<UpnpResponse> {
    public C10300c(C10028b<UpnpResponse> bVar) {
        super(bVar);
    }

    /* renamed from: A */
    public C10105z mo41847A() {
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
    public boolean mo41848B() {
        UpnpHeader p = mo40403j().mo40442p(UpnpHeader.Type.ST);
        UpnpHeader p2 = mo40403j().mo40442p(UpnpHeader.Type.USN);
        return (p == null || p.mo40449b() == null || p2 == null || p2.mo40449b() == null || mo40403j().mo40442p(UpnpHeader.Type.EXT) == null) ? false : true;
    }

    /* renamed from: x */
    public byte[] mo41849x() {
        C10049j jVar = (C10049j) mo40403j().mo40443q(UpnpHeader.Type.EXT_IFACE_MAC, C10049j.class);
        if (jVar != null) {
            return (byte[]) jVar.mo40449b();
        }
        return null;
    }

    /* renamed from: y */
    public URL mo41850y() {
        C10050k kVar = (C10050k) mo40403j().mo40443q(UpnpHeader.Type.LOCATION, C10050k.class);
        if (kVar != null) {
            return (URL) kVar.mo40449b();
        }
        return null;
    }

    /* renamed from: z */
    public Integer mo41851z() {
        C10053n nVar = (C10053n) mo40403j().mo40443q(UpnpHeader.Type.MAX_AGE, C10053n.class);
        if (nVar != null) {
            return (Integer) nVar.mo40449b();
        }
        return null;
    }
}
