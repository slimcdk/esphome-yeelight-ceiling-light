package p218u6;

import java.net.InetAddress;
import org.fourthline.cling.model.message.C10027a;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10032f;

/* renamed from: u6.c */
public class C10542c extends C10540a {

    /* renamed from: b */
    protected final C10027a f19708b;

    /* renamed from: c */
    protected final C10032f f19709c;

    public C10542c() {
        this((C10030d) null);
    }

    public C10542c(C10027a aVar, C10032f fVar) {
        super(fVar);
        this.f19709c = new C10032f();
        this.f19708b = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10542c(C10030d dVar) {
        this(dVar != null ? dVar.mo40434u() : null, dVar != null ? dVar.mo40403j() : new C10032f());
    }

    /* renamed from: c */
    public C10027a mo42202c() {
        return this.f19708b;
    }

    /* renamed from: d */
    public C10032f mo42203d() {
        return this.f19709c;
    }

    /* renamed from: e */
    public InetAddress mo42204e() {
        return mo42202c().mo40428a();
    }

    public String toString() {
        return "(" + C10542c.class.getSimpleName() + ") Remote Address: " + mo42204e();
    }
}
