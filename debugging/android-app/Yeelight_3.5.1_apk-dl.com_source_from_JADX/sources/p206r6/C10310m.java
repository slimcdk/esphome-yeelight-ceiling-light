package p206r6;

import org.fourthline.cling.model.C10017e;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.header.C10061v;
import org.fourthline.cling.model.message.header.C10062w;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.C10098s;
import p214t6.C10403c;

/* renamed from: r6.m */
public class C10310m extends C10307j {
    public C10310m(C10028b bVar, C10017e eVar, C10403c cVar, C10098s sVar) {
        super(bVar, eVar, cVar);
        mo40403j().mo40438l(UpnpHeader.Type.ST, new C10061v(sVar));
        mo40403j().mo40438l(UpnpHeader.Type.USN, new C10062w(cVar.mo40506p().mo42058b(), sVar));
    }
}
