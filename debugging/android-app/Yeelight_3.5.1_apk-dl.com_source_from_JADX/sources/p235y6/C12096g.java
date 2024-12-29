package p235y6;

import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.message.header.UpnpHeader;
import p206r6.C10306i;
import p230x6.C12008e;

/* renamed from: y6.g */
public class C12096g extends C12008e {

    /* renamed from: e */
    private static final Logger f22153e = Logger.getLogger(C12096g.class.getName());

    /* renamed from: c */
    private final UpnpHeader f22154c;

    /* renamed from: d */
    private final int f22155d;

    public C12096g(C10010b bVar, UpnpHeader upnpHeader, int i) {
        super(bVar);
        if (UpnpHeader.Type.ST.isValidHeaderType(upnpHeader.getClass())) {
            this.f22154c = upnpHeader;
            this.f22155d = i;
            return;
        }
        throw new IllegalArgumentException("Given search target instance is not a valid header class for type ST: " + upnpHeader.getClass());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42616b() {
        Logger logger = f22153e;
        logger.fine("Executing search for target: " + this.f22154c.mo40448a() + " with MX seconds: " + mo42811f());
        C10306i iVar = new C10306i(this.f22154c, mo42811f());
        mo42812g(iVar);
        int i = 0;
        while (i < mo42810e()) {
            try {
                mo42617c().getRouter().mo24966a(iVar);
                Logger logger2 = f22153e;
                logger2.finer("Sleeping " + mo42809d() + " milliseconds");
                Thread.sleep((long) mo42809d());
                i++;
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* renamed from: d */
    public int mo42809d() {
        return 500;
    }

    /* renamed from: e */
    public int mo42810e() {
        return 5;
    }

    /* renamed from: f */
    public int mo42811f() {
        return this.f22155d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo42812g(C10306i iVar) {
    }
}
