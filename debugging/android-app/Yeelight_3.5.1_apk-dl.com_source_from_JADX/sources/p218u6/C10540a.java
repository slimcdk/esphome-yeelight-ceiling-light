package p218u6;

import org.fourthline.cling.model.message.C10032f;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* renamed from: u6.a */
public class C10540a {

    /* renamed from: a */
    protected final C10032f f19707a;

    public C10540a(C10032f fVar) {
        this.f19707a = fVar;
    }

    /* renamed from: a */
    public C10032f mo42199a() {
        return this.f19707a;
    }

    /* renamed from: b */
    public String mo42200b() {
        return mo42199a().mo40444r(UpnpHeader.Type.USER_AGENT);
    }
}
