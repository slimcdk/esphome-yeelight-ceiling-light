package p210s6;

import java.net.URL;
import java.util.List;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.header.C10037b;
import org.fourthline.cling.model.message.header.C10054o;
import org.fourthline.cling.model.message.header.C10064y;
import org.fourthline.cling.model.message.header.C10065z;
import org.fourthline.cling.model.message.header.UpnpHeader;
import p214t6.C10404d;

/* renamed from: s6.b */
public class C10374b extends C10030d {
    public C10374b(C10030d dVar, C10404d dVar2) {
        super(dVar);
    }

    /* renamed from: A */
    public String mo41968A() {
        C10064y yVar = (C10064y) mo40403j().mo40443q(UpnpHeader.Type.SID, C10064y.class);
        if (yVar != null) {
            return (String) yVar.mo40449b();
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo41969B() {
        return mo40403j().mo40443q(UpnpHeader.Type.NT, C10054o.class) != null;
    }

    /* renamed from: y */
    public List<URL> mo41970y() {
        C10037b bVar = (C10037b) mo40403j().mo40443q(UpnpHeader.Type.CALLBACK, C10037b.class);
        if (bVar != null) {
            return (List) bVar.mo40449b();
        }
        return null;
    }

    /* renamed from: z */
    public Integer mo41971z() {
        C10065z zVar = (C10065z) mo40403j().mo40443q(UpnpHeader.Type.TIMEOUT, C10065z.class);
        if (zVar != null) {
            return (Integer) zVar.mo40449b();
        }
        return null;
    }
}
