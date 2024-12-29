package p235y6;

import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.types.NotificationSubtype;
import p214t6.C10403c;

/* renamed from: y6.f */
public class C12095f extends C12093d {

    /* renamed from: e */
    private static final Logger f22152e = Logger.getLogger(C12093d.class.getName());

    public C12095f(C10010b bVar, C10403c cVar) {
        super(bVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42616b() {
        Logger logger = f22152e;
        logger.fine("Sending byebye messages (" + mo42805g() + " times) for: " + mo42806h());
        super.mo42616b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public NotificationSubtype mo42807i() {
        return NotificationSubtype.BYEBYE;
    }
}
