package p206r6;

import org.fourthline.cling.model.C10017e;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.header.C10042d0;
import org.fourthline.cling.model.message.header.C10058s;
import org.fourthline.cling.model.message.header.UpnpHeader;
import p214t6.C10403c;

/* renamed from: r6.l */
public class C10309l extends C10307j {
    public C10309l(C10028b bVar, C10017e eVar, C10403c cVar) {
        super(bVar, eVar, cVar);
        mo40403j().mo40438l(UpnpHeader.Type.ST, new C10058s());
        mo40403j().mo40438l(UpnpHeader.Type.USN, new C10042d0(cVar.mo40506p().mo42058b()));
    }
}
