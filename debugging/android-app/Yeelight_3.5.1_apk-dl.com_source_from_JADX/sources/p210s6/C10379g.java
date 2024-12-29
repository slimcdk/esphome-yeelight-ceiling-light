package p210s6;

import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10032f;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.C10064y;
import org.fourthline.cling.model.message.header.C10065z;
import org.fourthline.cling.model.message.header.UpnpHeader;
import p200p6.C10277c;

/* renamed from: s6.g */
public class C10379g extends C10030d {
    public C10379g(C10277c cVar, C10032f fVar) {
        super(UpnpRequest.Method.SUBSCRIBE, cVar.mo41785U());
        mo40403j().mo40438l(UpnpHeader.Type.SID, new C10064y(cVar.mo41767K()));
        mo40403j().mo40438l(UpnpHeader.Type.TIMEOUT, new C10065z(cVar.mo41765I()));
        if (fVar != null) {
            mo40403j().putAll(fVar);
        }
    }
}
