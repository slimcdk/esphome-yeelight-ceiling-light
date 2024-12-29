package p164h.p165b.p166a.p240h.p241p;

import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p248s.C11331k;
import p164h.p165b.p166a.p240h.p248s.C11336p;
import p164h.p165b.p166a.p240h.p251v.C11353c;
import p164h.p165b.p166a.p240h.p252w.C11386n;

/* renamed from: h.b.a.h.p.h */
public class C11234h extends C11226a {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo35693b(C11232f<C11328h> fVar, Object obj) {
        if (!(fVar.mo35700a() instanceof C11331k)) {
            throw new IllegalStateException("This class can only execute QueryStateVariableAction's, not: " + fVar.mo35700a());
        } else if (!fVar.mo35700a().mo35859g().mo35955u()) {
            fVar.mo35709j(new C11230d(C11386n.INVALID_ACTION, "This service does not support querying state variables"));
        } else {
            mo35718f(fVar, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo35718f(C11232f<C11328h> fVar, Object obj) {
        C11328h g = fVar.mo35700a().mo35859g();
        String nVar = fVar.mo35703d("varName").toString();
        C11336p h = g.mo35987h(nVar);
        if (h != null) {
            C11353c n = g.mo35947n(h.mo35994b());
            if (n != null) {
                try {
                    mo35696e(fVar, fVar.mo35700a().mo35857e("return"), n.mo36039c(h, obj).toString());
                } catch (Exception e) {
                    throw new C11230d(C11386n.ACTION_FAILED, e.getMessage());
                }
            } else {
                C11386n nVar2 = C11386n.ARGUMENT_VALUE_INVALID;
                throw new C11230d(nVar2, "No accessor for state variable, can't read state: " + nVar);
            }
        } else {
            C11386n nVar3 = C11386n.ARGUMENT_VALUE_INVALID;
            throw new C11230d(nVar3, "No state variable found: " + nVar);
        }
    }
}
