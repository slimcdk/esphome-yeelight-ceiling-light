package p235y6;

import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.types.NotificationSubtype;
import p214t6.C10403c;

/* renamed from: y6.e */
public class C12094e extends C12093d {

    /* renamed from: e */
    private static final Logger f22151e = Logger.getLogger(C12093d.class.getName());

    public C12094e(C10010b bVar, C10403c cVar) {
        super(bVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42616b() {
        Logger logger = f22151e;
        logger.fine("Sending alive messages (" + mo42805g() + " times) for: " + mo42806h());
        super.mo42616b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public NotificationSubtype mo42807i() {
        return NotificationSubtype.ALIVE;
    }
}
