package p164h.p165b.p166a.p240h.p243r.p246m;

import java.net.URL;
import java.util.List;
import p164h.p165b.p166a.p240h.p242q.C11239d;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11245f;
import p164h.p165b.p166a.p240h.p243r.C11249i;
import p164h.p165b.p166a.p240h.p243r.p247n.C11286a0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11287b;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11309p;

/* renamed from: h.b.a.h.r.m.h */
public class C11282h extends C11243d {
    public C11282h(C11239d dVar, List<URL> list, C11245f fVar) {
        super(C11249i.C11250a.SUBSCRIBE, dVar.mo35741Y());
        mo35747j().mo35758l(C11296f0.C11297a.CALLBACK, new C11287b(list));
        mo35747j().mo35758l(C11296f0.C11297a.NT, new C11309p());
        mo35747j().mo35758l(C11296f0.C11297a.TIMEOUT, new C11286a0(dVar.mo35722M()));
        if (fVar != null) {
            mo35747j().putAll(fVar);
        }
    }

    /* renamed from: y */
    public boolean mo35840y() {
        return ((List) ((C11287b) mo35747j().mo35764q(C11296f0.C11297a.CALLBACK, C11287b.class)).mo35845b()).size() > 0;
    }
}
