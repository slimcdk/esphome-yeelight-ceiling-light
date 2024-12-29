package p164h.p165b.p166a.p240h.p243r.p244k;

import p164h.p165b.p166a.p240h.p241p.C11230d;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11318y;
import p164h.p165b.p166a.p240h.p248s.C11320a;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p252w.C11386n;
import p164h.p165b.p166a.p240h.p252w.C11399z;

/* renamed from: h.b.a.h.r.k.d */
public class C11257d extends C11243d implements C11255b {

    /* renamed from: h */
    private final C11320a f22389h;

    /* renamed from: i */
    private final String f22390i;

    public C11257d(C11243d dVar, C11328h hVar) {
        super(dVar);
        C11318y yVar = (C11318y) mo35747j().mo35764q(C11296f0.C11297a.SOAPACTION, C11318y.class);
        if (yVar != null) {
            C11399z zVar = (C11399z) yVar.mo35845b();
            C11320a a = hVar.mo35980a(zVar.mo36145a());
            this.f22389h = a;
            if (a == null) {
                C11386n nVar = C11386n.INVALID_ACTION;
                throw new C11230d(nVar, "Service doesn't implement action: " + zVar.mo36145a());
            } else if ("QueryStateVariable".equals(zVar.mo36145a()) || hVar.mo35986g().mo36140d(zVar.mo36147c())) {
                this.f22390i = zVar.mo36149e();
            } else {
                throw new C11230d(C11386n.INVALID_ACTION, "Service doesn't support the requested service version");
            }
        } else {
            throw new C11230d(C11386n.INVALID_ACTION, "Missing SOAP action header");
        }
    }

    /* renamed from: d */
    public String mo35805d() {
        return this.f22390i;
    }

    /* renamed from: y */
    public C11320a mo35806y() {
        return this.f22389h;
    }
}
