package p240z6;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.C10041d;
import org.fourthline.cling.model.message.header.C10060u;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.meta.C10068c;
import org.seamless.util.C10243a;
import p214t6.C10403c;
import p214t6.C10404d;
import p222v6.C10547a;
import p222v6.C10548b;
import p222v6.C10549c;
import p222v6.C10551e;
import p230x6.C12006c;

/* renamed from: z6.c */
public class C12199c extends C12006c<C10030d, C10031e> {

    /* renamed from: g */
    private static final Logger f22531g = Logger.getLogger(C12199c.class.getName());

    public C12199c(C10010b bVar, C10030d dVar) {
        super(bVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C10031e mo42604f() {
        if (!((C10030d) mo42599c()).mo40408o()) {
            Logger logger = f22531g;
            logger.fine("Ignoring message, missing HOST header: " + mo42599c());
            return new C10031e(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        URI e = ((UpnpRequest) ((C10030d) mo42599c()).mo40404k()).mo40417e();
        C10549c l = mo42600d().getRegistry().mo24947l(e);
        if (l != null || (l = mo43193l(e)) != null) {
            return mo43192k(e, l);
        }
        Logger logger2 = f22531g;
        logger2.fine("No local resource found: " + mo42599c());
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C10031e mo43192k(URI uri, C10549c cVar) {
        C10031e eVar;
        try {
            if (C10547a.class.isAssignableFrom(cVar.getClass())) {
                Logger logger = f22531g;
                logger.fine("Found local device matching relative request URI: " + uri);
                eVar = new C10031e(mo42600d().getConfiguration().getDeviceDescriptorBinderUDA10().mo38535b((C10403c) cVar.mo42211a(), mo42606h(), mo42600d().getConfiguration().getNamespace()), new C10041d(C10041d.f18539c));
            } else if (C10551e.class.isAssignableFrom(cVar.getClass())) {
                Logger logger2 = f22531g;
                logger2.fine("Found local service matching relative request URI: " + uri);
                eVar = new C10031e(mo42600d().getConfiguration().getServiceDescriptorBinderUDA10().mo38541b((C10404d) cVar.mo42211a()), new C10041d(C10041d.f18539c));
            } else if (C10548b.class.isAssignableFrom(cVar.getClass())) {
                Logger logger3 = f22531g;
                logger3.fine("Found local icon matching relative request URI: " + uri);
                C10068c cVar2 = (C10068c) cVar.mo42211a();
                eVar = new C10031e(cVar2.mo40518b(), cVar2.mo40522f());
            } else {
                Logger logger4 = f22531g;
                logger4.fine("Ignoring GET for found local resource: " + cVar);
                return null;
            }
        } catch (DescriptorBindingException e) {
            Logger logger5 = f22531g;
            logger5.warning("Error generating requested device/service descriptor: " + e.toString());
            logger5.log(Level.WARNING, "Exception root cause: ", C10243a.m25753a(e));
            eVar = new C10031e(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
        }
        eVar.mo40403j().mo40438l(UpnpHeader.Type.SERVER, new C10060u());
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C10549c mo43193l(URI uri) {
        return null;
    }
}
