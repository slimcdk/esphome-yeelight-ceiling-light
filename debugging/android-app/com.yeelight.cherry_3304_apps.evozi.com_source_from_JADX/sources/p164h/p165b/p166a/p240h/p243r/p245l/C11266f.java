package p164h.p165b.p166a.p240h.p243r.p245l;

import p164h.p165b.p166a.p240h.C11215e;
import p164h.p165b.p166a.p240h.p243r.p247n.C11294e0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11303j;
import p164h.p165b.p166a.p240h.p243r.p247n.C11313t;
import p164h.p165b.p166a.p240h.p248s.C11327g;
import p164h.p165b.p166a.p240h.p252w.C11394u;

/* renamed from: h.b.a.h.r.l.f */
public class C11266f extends C11264d {
    public C11266f(C11215e eVar, C11327g gVar, C11394u uVar) {
        super(eVar, gVar, uVar);
        mo35747j().mo35758l(C11296f0.C11297a.NT, new C11313t());
        mo35747j().mo35758l(C11296f0.C11297a.USN, new C11294e0(gVar.mo35899p().mo35922b()));
        if ("true".equals(System.getProperty("org.fourthline.cling.network.announceMACAddress")) && eVar.mo35642b().mo35664b() != null) {
            mo35747j().mo35758l(C11296f0.C11297a.EXT_IFACE_MAC, new C11303j(eVar.mo35642b().mo35664b()));
        }
    }
}
