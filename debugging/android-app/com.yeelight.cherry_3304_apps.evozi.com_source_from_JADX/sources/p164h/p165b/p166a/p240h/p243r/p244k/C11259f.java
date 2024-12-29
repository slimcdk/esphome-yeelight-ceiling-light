package p164h.p165b.p166a.p240h.p243r.p244k;

import java.net.URL;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.p241p.C11232f;
import p164h.p165b.p166a.p240h.p241p.C11235i;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11249i;
import p164h.p165b.p166a.p240h.p243r.p247n.C11291d;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11300g0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11318y;
import p164h.p165b.p166a.p240h.p248s.C11320a;
import p164h.p165b.p166a.p240h.p248s.C11331k;
import p164h.p165b.p166a.p240h.p252w.C11399z;

/* renamed from: h.b.a.h.r.k.f */
public class C11259f extends C11243d implements C11255b {

    /* renamed from: i */
    private static Logger f22391i = Logger.getLogger(C11259f.class.getName());

    /* renamed from: h */
    private final String f22392h;

    public C11259f(C11232f fVar, URL url) {
        this(fVar.mo35700a(), new C11249i(C11249i.C11250a.POST, url));
        if (fVar instanceof C11235i) {
            C11235i iVar = (C11235i) fVar;
            if (iVar.mo35719p() != null && iVar.mo35719p().mo36020b() != null) {
                mo35747j().mo35758l(C11296f0.C11297a.USER_AGENT, new C11300g0(iVar.mo35719p().mo36020b()));
            }
        } else if (fVar.mo35701b() != null) {
            mo35747j().putAll(fVar.mo35701b().mo36019a());
        }
    }

    public C11259f(C11320a aVar, C11249i iVar) {
        super(iVar);
        C11318y yVar;
        mo35747j().mo35758l(C11296f0.C11297a.CONTENT_TYPE, new C11291d(C11291d.f22401d));
        if (aVar instanceof C11331k) {
            f22391i.fine("Adding magic control SOAP action header for state variable query action");
            yVar = new C11318y(new C11399z("schemas-upnp-org", "control-1-0", (Integer) null, aVar.mo35856d()));
        } else {
            yVar = new C11318y(new C11399z(aVar.mo35859g().mo35986g(), aVar.mo35856d()));
        }
        this.f22392h = ((C11399z) yVar.mo35845b()).mo36149e();
        if (((C11249i) mo35776k()).mo35790d().equals(C11249i.C11250a.POST)) {
            mo35747j().mo35758l(C11296f0.C11297a.SOAPACTION, yVar);
            Logger logger = f22391i;
            logger.fine("Added SOAP action header: " + yVar);
            return;
        }
        throw new IllegalArgumentException("Can't send action with request method: " + ((C11249i) mo35776k()).mo35790d());
    }

    /* renamed from: d */
    public String mo35805d() {
        return this.f22392h;
    }
}
