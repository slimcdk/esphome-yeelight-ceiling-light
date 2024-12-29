package p164h.p165b.p166a.p168i.p254i;

import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11401d;
import p164h.p165b.p166a.p168i.C11403f;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.C11223m;
import p164h.p165b.p166a.p240h.p243r.C11241b;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p245l.C11263c;
import p164h.p165b.p166a.p240h.p248s.C11332l;
import p164h.p165b.p166a.p240h.p248s.C11333m;
import p164h.p165b.p166a.p240h.p252w.C11365e0;

/* renamed from: h.b.a.i.i.c */
public class C11408c extends C11401d<C11263c> {

    /* renamed from: d */
    private static final Logger f22696d = Logger.getLogger(C11408c.class.getName());

    public C11408c(C4423b bVar, C11241b<C11252j> bVar2) {
        super(bVar, new C11263c(bVar2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36154b() {
        if (!((C11263c) mo36155c()).mo35820B()) {
            Logger logger = f22696d;
            logger.fine("Ignoring invalid search response message: " + mo36155c());
            return;
        }
        C11365e0 A = ((C11263c) mo36155c()).mo35819A();
        if (A == null) {
            Logger logger2 = f22696d;
            logger2.fine("Ignoring search response message without UDN: " + mo36155c());
            return;
        }
        C11333m mVar = new C11333m((C11263c) mo36155c());
        Logger logger3 = f22696d;
        logger3.fine("Received device search response: " + mVar);
        if (mo36156d().getRegistry().mo24406G(mVar)) {
            Logger logger4 = f22696d;
            logger4.fine("Remote device was already known: " + A);
            return;
        }
        try {
            C11332l lVar = new C11332l(mVar);
            if (mVar.mo35973d() == null) {
                Logger logger5 = f22696d;
                logger5.finer("Ignoring message without location URL header: " + mo36155c());
            } else if (mVar.mo35921a() == null) {
                Logger logger6 = f22696d;
                logger6.finer("Ignoring message without max-age header: " + mo36155c());
            } else {
                mo36156d().getConfiguration().getAsyncProtocolExecutor().execute(new C11403f(mo36156d(), lVar));
            }
        } catch (C11223m e) {
            Logger logger7 = f22696d;
            logger7.warning("Validation errors of device during discovery: " + mVar);
            for (C11222l lVar2 : e.mo35687a()) {
                f22696d.warning(lVar2.toString());
            }
        }
    }
}
