package p206r6;

import org.fourthline.cling.model.C10017e;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.header.C10040c0;
import org.fourthline.cling.model.message.header.UpnpHeader;
import p214t6.C10403c;

/* renamed from: r6.n */
public class C10311n extends C10307j {
    public C10311n(C10028b bVar, C10017e eVar, C10403c cVar) {
        super(bVar, eVar, cVar);
        mo40403j().mo40438l(UpnpHeader.Type.ST, new C10040c0(cVar.mo40506p().mo42058b()));
        mo40403j().mo40438l(UpnpHeader.Type.USN, new C10040c0(cVar.mo40506p().mo42058b()));
    }
}
