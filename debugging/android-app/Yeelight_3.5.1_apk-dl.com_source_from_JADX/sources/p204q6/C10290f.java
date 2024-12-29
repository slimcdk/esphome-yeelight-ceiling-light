package p204q6;

import java.net.URL;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.C10041d;
import org.fourthline.cling.model.message.header.C10044e0;
import org.fourthline.cling.model.message.header.C10063x;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.meta.C10069d;
import org.fourthline.cling.model.types.C10100u;
import p193o6.C9792d;
import p193o6.C9795g;

/* renamed from: q6.f */
public class C10290f extends C10030d implements C10286b {

    /* renamed from: i */
    private static Logger f19372i = Logger.getLogger(C10290f.class.getName());

    /* renamed from: h */
    private final String f19373h;

    public C10290f(C9792d dVar, URL url) {
        this(dVar.mo38967a(), new UpnpRequest(UpnpRequest.Method.POST, url));
        if (dVar instanceof C9795g) {
            C9795g gVar = (C9795g) dVar;
            if (gVar.mo38986p() != null && gVar.mo38986p().mo42200b() != null) {
                mo40403j().mo40438l(UpnpHeader.Type.USER_AGENT, new C10044e0(gVar.mo38986p().mo42200b()));
            }
        } else if (dVar.mo38968b() != null) {
            mo40403j().putAll(dVar.mo38968b().mo42199a());
        }
    }

    public C10290f(C10066a aVar, UpnpRequest upnpRequest) {
        super(upnpRequest);
        C10063x xVar;
        mo40403j().mo40438l(UpnpHeader.Type.CONTENT_TYPE, new C10041d(C10041d.f18540d));
        if (aVar instanceof C10069d) {
            f19372i.fine("Adding magic control SOAP action header for state variable query action");
            xVar = new C10063x(new C10100u("schemas-upnp-org", "control-1-0", (Integer) null, aVar.mo40474d()));
        } else {
            xVar = new C10063x(new C10100u(aVar.mo40477g().mo40534g(), aVar.mo40474d()));
        }
        this.f19373h = ((C10100u) xVar.mo40449b()).mo40655e();
        if (((UpnpRequest) mo40404k()).mo40416d().equals(UpnpRequest.Method.POST)) {
            mo40403j().mo40438l(UpnpHeader.Type.SOAPACTION, xVar);
            Logger logger = f19372i;
            logger.fine("Added SOAP action header: " + xVar);
            return;
        }
        throw new IllegalArgumentException("Can't send action with request method: " + ((UpnpRequest) mo40404k()).mo40416d());
    }

    /* renamed from: d */
    public String mo41806d() {
        return this.f19373h;
    }
}
