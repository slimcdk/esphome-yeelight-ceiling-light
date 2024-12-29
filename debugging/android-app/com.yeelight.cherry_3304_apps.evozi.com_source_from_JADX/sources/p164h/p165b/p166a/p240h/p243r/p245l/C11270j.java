package p164h.p165b.p166a.p240h.p243r.p245l;

import p164h.p165b.p166a.p240h.C11215e;
import p164h.p165b.p166a.p240h.p243r.C11241b;
import p164h.p165b.p166a.p240h.p243r.C11242c;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11299g;
import p164h.p165b.p166a.p240h.p243r.p247n.C11303j;
import p164h.p165b.p166a.p240h.p243r.p247n.C11305l;
import p164h.p165b.p166a.p240h.p243r.p247n.C11308o;
import p164h.p165b.p166a.p240h.p243r.p247n.C11315v;
import p164h.p165b.p166a.p240h.p248s.C11327g;

/* renamed from: h.b.a.h.r.l.j */
public class C11270j extends C11242c<C11252j> {
    public C11270j(C11241b bVar, C11215e eVar, C11327g gVar) {
        super(new C11252j(C11252j.C11253a.OK), bVar.mo35745v(), bVar.mo35746w());
        mo35747j().mo35758l(C11296f0.C11297a.MAX_AGE, new C11308o(gVar.mo35899p().mo35921a()));
        mo35747j().mo35758l(C11296f0.C11297a.f22410h, new C11305l(eVar.mo35643c()));
        mo35747j().mo35758l(C11296f0.C11297a.SERVER, new C11315v());
        mo35747j().mo35758l(C11296f0.C11297a.EXT, new C11299g());
        if ("true".equals(System.getProperty("org.fourthline.cling.network.announceMACAddress")) && eVar.mo35642b().mo35664b() != null) {
            mo35747j().mo35758l(C11296f0.C11297a.EXT_IFACE_MAC, new C11303j(eVar.mo35642b().mo35664b()));
        }
    }
}
