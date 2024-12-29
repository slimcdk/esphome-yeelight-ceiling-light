package p164h.p165b.p166a.p168i.p254i;

import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11401d;
import p164h.p165b.p166a.p168i.C11403f;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.C11223m;
import p164h.p165b.p166a.p240h.p243r.C11241b;
import p164h.p165b.p166a.p240h.p243r.C11249i;
import p164h.p165b.p166a.p240h.p243r.p245l.C11261a;
import p164h.p165b.p166a.p240h.p248s.C11332l;
import p164h.p165b.p166a.p240h.p248s.C11333m;
import p164h.p165b.p166a.p240h.p252w.C11365e0;

/* renamed from: h.b.a.i.i.a */
public class C11406a extends C11401d<C11261a> {

    /* renamed from: d */
    private static final Logger f22692d = Logger.getLogger(C11406a.class.getName());

    public C11406a(C4423b bVar, C11241b<C11249i> bVar2) {
        super(bVar, new C11261a(bVar2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36154b() {
        C11365e0 A = ((C11261a) mo36155c()).mo35810A();
        if (A == null) {
            Logger logger = f22692d;
            logger.fine("Ignoring notification message without UDN: " + mo36155c());
            return;
        }
        C11333m mVar = new C11333m((C11261a) mo36155c());
        Logger logger2 = f22692d;
        logger2.fine("Received device notification: " + mVar);
        try {
            C11332l lVar = new C11332l(mVar);
            if (((C11261a) mo36155c()).mo35811B()) {
                Logger logger3 = f22692d;
                logger3.fine("Received device ALIVE advertisement, descriptor location is: " + mVar.mo35973d());
                if (mVar.mo35973d() == null) {
                    Logger logger4 = f22692d;
                    logger4.finer("Ignoring message without location URL header: " + mo36155c());
                } else if (mVar.mo35921a() == null) {
                    Logger logger5 = f22692d;
                    logger5.finer("Ignoring message without max-age header: " + mo36155c());
                } else if (mo36156d().getRegistry().mo24406G(mVar)) {
                    Logger logger6 = f22692d;
                    logger6.finer("Remote device was already known: " + A);
                } else {
                    mo36156d().getConfiguration().getAsyncProtocolExecutor().execute(new C11403f(mo36156d(), lVar));
                }
            } else if (((C11261a) mo36155c()).mo35812C()) {
                f22692d.fine("Received device BYEBYE advertisement");
                if (mo36156d().getRegistry().mo24403D(lVar)) {
                    Logger logger7 = f22692d;
                    logger7.fine("Removed remote device from registry: " + lVar);
                }
            } else {
                Logger logger8 = f22692d;
                logger8.finer("Ignoring unknown notification message: " + mo36155c());
            }
        } catch (C11223m e) {
            Logger logger9 = f22692d;
            logger9.warning("Validation errors of device during discovery: " + mVar);
            for (C11222l lVar2 : e.mo35687a()) {
                f22692d.warning(lVar2.toString());
            }
        }
    }
}
