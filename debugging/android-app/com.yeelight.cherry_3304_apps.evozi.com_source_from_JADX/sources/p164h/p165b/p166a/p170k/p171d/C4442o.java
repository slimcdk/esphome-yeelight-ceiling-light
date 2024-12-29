package p164h.p165b.p166a.p170k.p171d;

import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import p164h.p165b.p166a.p170k.p172e.C4445j;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.p241p.C11232f;
import p164h.p165b.p166a.p240h.p243r.p244k.C11255b;
import p164h.p165b.p166a.p240h.p243r.p244k.C11256c;
import p164h.p257c.p261c.C11518d;

@Alternative
/* renamed from: h.b.a.k.d.o */
public class C4442o extends C4440m {

    /* renamed from: c */
    private static Logger f8013c = Logger.getLogger(C4445j.class.getName());

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo24494N(C11232f fVar, C11221k kVar, C11221k kVar2) {
        throw kVar;
    }

    /* renamed from: a */
    public void mo24491a(C11256c cVar, C11232f fVar) {
        try {
            super.mo24491a(cVar, fVar);
        } catch (C11221k e) {
            if (cVar.mo35802a()) {
                f8013c.warning("Trying to recover from invalid SOAP XML response: " + e);
                String c = C11518d.m30249c(mo24507i(cVar));
                if (c.endsWith("</s:Envelop")) {
                    c = c + "e>";
                }
                try {
                    cVar.mo35803b(c);
                    super.mo24491a(cVar, fVar);
                } catch (C11221k e2) {
                    mo24494N(fVar, e, e2);
                    throw null;
                }
            } else {
                throw e;
            }
        }
    }

    /* renamed from: b */
    public void mo24492b(C11255b bVar, C11232f fVar) {
        try {
            super.mo24492b(bVar, fVar);
        } catch (C11221k e) {
            if (bVar.mo35802a()) {
                Logger logger = f8013c;
                logger.warning("Trying to recover from invalid SOAP XML request: " + e);
                try {
                    bVar.mo35803b(C11518d.m30249c(mo24507i(bVar)));
                    super.mo24492b(bVar, fVar);
                } catch (C11221k e2) {
                    mo24494N(fVar, e, e2);
                    throw null;
                }
            } else {
                throw e;
            }
        }
    }
}
