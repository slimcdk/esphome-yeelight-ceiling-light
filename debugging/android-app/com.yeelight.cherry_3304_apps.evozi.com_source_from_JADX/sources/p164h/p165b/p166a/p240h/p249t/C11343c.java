package p164h.p165b.p166a.p240h.p249t;

import java.net.InetAddress;
import p164h.p165b.p166a.p240h.p243r.C11240a;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11245f;

/* renamed from: h.b.a.h.t.c */
public class C11343c extends C11341a {

    /* renamed from: b */
    protected final C11240a f22528b;

    /* renamed from: c */
    protected final C11245f f22529c;

    public C11343c() {
        this((C11243d) null);
    }

    public C11343c(C11240a aVar, C11245f fVar) {
        super(fVar);
        this.f22529c = new C11245f();
        this.f22528b = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11343c(C11243d dVar) {
        this(dVar != null ? dVar.mo35750u() : null, dVar != null ? dVar.mo35747j() : new C11245f());
    }

    /* renamed from: c */
    public C11240a mo36022c() {
        return this.f22528b;
    }

    /* renamed from: d */
    public C11245f mo36023d() {
        return this.f22529c;
    }

    /* renamed from: e */
    public InetAddress mo36024e() {
        return mo36022c().mo35743a();
    }

    public String toString() {
        return "(" + C11343c.class.getSimpleName() + ") Remote Address: " + mo36024e();
    }
}
