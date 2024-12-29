package p210s6;

import java.net.URL;
import java.util.List;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10032f;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.C10037b;
import org.fourthline.cling.model.message.header.C10054o;
import org.fourthline.cling.model.message.header.C10065z;
import org.fourthline.cling.model.message.header.UpnpHeader;
import p200p6.C10277c;

/* renamed from: s6.h */
public class C10380h extends C10030d {
    public C10380h(C10277c cVar, List<URL> list, C10032f fVar) {
        super(UpnpRequest.Method.SUBSCRIBE, cVar.mo41785U());
        mo40403j().mo40438l(UpnpHeader.Type.CALLBACK, new C10037b(list));
        mo40403j().mo40438l(UpnpHeader.Type.NT, new C10054o());
        mo40403j().mo40438l(UpnpHeader.Type.TIMEOUT, new C10065z(cVar.mo41765I()));
        if (fVar != null) {
            mo40403j().putAll(fVar);
        }
    }

    /* renamed from: y */
    public boolean mo41979y() {
        return ((List) ((C10037b) mo40403j().mo40443q(UpnpHeader.Type.CALLBACK, C10037b.class)).mo40449b()).size() > 0;
    }
}
