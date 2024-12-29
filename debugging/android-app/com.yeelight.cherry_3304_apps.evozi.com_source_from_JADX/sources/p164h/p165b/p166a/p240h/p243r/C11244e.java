package p164h.p165b.p166a.p240h.p243r;

import p164h.p165b.p166a.p240h.p243r.C11246g;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p247n.C11291d;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p257c.p259b.C11497c;

/* renamed from: h.b.a.h.r.e */
public class C11244e extends C11246g<C11252j> {
    public C11244e(C11244e eVar) {
        super(eVar);
    }

    public C11244e(C11252j.C11253a aVar) {
        super(new C11252j(aVar));
    }

    public C11244e(C11252j jVar) {
        super(jVar);
    }

    public C11244e(String str) {
        super(new C11252j(C11252j.C11253a.OK), C11246g.C11247a.STRING, str);
    }

    public C11244e(String str, C11291d dVar) {
        this(str);
        mo35747j().mo35758l(C11296f0.C11297a.CONTENT_TYPE, dVar);
    }

    public C11244e(byte[] bArr) {
        super(new C11252j(C11252j.C11253a.OK), C11246g.C11247a.BYTES, bArr);
    }

    public C11244e(byte[] bArr, C11291d dVar) {
        this(bArr);
        mo35747j().mo35758l(C11296f0.C11297a.CONTENT_TYPE, dVar);
    }

    public C11244e(byte[] bArr, C11497c cVar) {
        this(bArr, new C11291d(cVar));
    }
}
