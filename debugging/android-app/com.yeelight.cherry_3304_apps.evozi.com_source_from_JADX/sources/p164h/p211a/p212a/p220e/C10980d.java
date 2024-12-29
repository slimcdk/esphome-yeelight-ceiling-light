package p164h.p211a.p212a.p220e;

import p154d.p155b.C10727m;
import p164h.p211a.p212a.p220e.C10975a;
import p164h.p211a.p212a.p220e.p221o.C10993a;
import p164h.p211a.p212a.p220e.p221o.C10994b;
import p164h.p211a.p212a.p220e.p221o.C10998d;
import p164h.p211a.p212a.p220e.p221o.C11001e;
import p164h.p211a.p212a.p220e.p221o.C11007h;
import p164h.p211a.p212a.p222f.C11040p;

/* renamed from: h.a.a.e.d */
public class C10980d implements C10975a.C10977b {
    /* renamed from: a */
    public C10975a mo34721a(C11040p pVar, C10727m mVar, C10975a.C10976a aVar, C10982f fVar, C10983g gVar) {
        String c = aVar.mo34718c();
        return ("CLIENT_CERT".equalsIgnoreCase(c) || "CLIENT-CERT".equalsIgnoreCase(c)) ? new C10994b() : (c == null || "BASIC".equalsIgnoreCase(c)) ? new C10993a() : "DIGEST".equalsIgnoreCase(c) ? new C10998d() : "FORM".equalsIgnoreCase(c) ? new C11001e() : "SPNEGO".equalsIgnoreCase(c) ? new C11007h() : "NEGOTIATE".equalsIgnoreCase(c) ? new C11007h("NEGOTIATE") : null;
    }
}
