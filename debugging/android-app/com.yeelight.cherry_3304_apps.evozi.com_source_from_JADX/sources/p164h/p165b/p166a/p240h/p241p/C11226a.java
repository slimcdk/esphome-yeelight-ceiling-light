package p164h.p165b.p166a.p240h.p241p;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.C11210a;
import p164h.p165b.p166a.p240h.C11220j;
import p164h.p165b.p166a.p240h.p248s.C11320a;
import p164h.p165b.p166a.p240h.p248s.C11321b;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p251v.C11353c;
import p164h.p165b.p166a.p240h.p252w.C11386n;
import p164h.p165b.p166a.p240h.p252w.C11391r;
import p164h.p257c.p259b.C11495a;

/* renamed from: h.b.a.h.p.a */
public abstract class C11226a implements C11231e {

    /* renamed from: b */
    private static Logger f22316b = Logger.getLogger(C11226a.class.getName());

    /* renamed from: a */
    protected Map<C11321b<C11328h>, C11353c> f22317a = new HashMap();

    /* renamed from: h.b.a.h.p.a$a */
    class C11227a implements C11210a {

        /* renamed from: a */
        final /* synthetic */ C11232f f22318a;

        C11227a(C11232f fVar) {
            this.f22318a = fVar;
        }

        /* renamed from: a */
        public void mo35614a(C11220j jVar) {
            C11226a.this.mo35693b(this.f22318a, jVar.mo35616b());
        }

        public String toString() {
            return "Action invocation: " + this.f22318a.mo35700a();
        }
    }

    protected C11226a() {
    }

    protected C11226a(Map<C11321b<C11328h>, C11353c> map) {
        this.f22317a = map;
    }

    /* renamed from: a */
    public void mo35692a(C11232f<C11328h> fVar) {
        C11230d dVar;
        Logger logger = f22316b;
        logger.fine("Invoking on local service: " + fVar);
        C11328h g = fVar.mo35700a().mo35859g();
        try {
            if (g.mo35950q() != null) {
                g.mo35950q().mo35618d(new C11227a(fVar));
                return;
            }
            throw new IllegalStateException("Service has no implementation factory, can't get service instance");
        } catch (C11230d e) {
            if (f22316b.isLoggable(Level.FINE)) {
                Logger logger2 = f22316b;
                logger2.fine("ActionException thrown by service, wrapping in invocation and returning: " + e);
                f22316b.log(Level.FINE, "Exception root cause: ", C11495a.m30173a(e));
            }
            fVar.mo35709j(e);
        } catch (InterruptedException e2) {
            if (f22316b.isLoggable(Level.FINE)) {
                Logger logger3 = f22316b;
                logger3.fine("InterruptedException thrown by service, wrapping in invocation and returning: " + e2);
                f22316b.log(Level.FINE, "Exception root cause: ", C11495a.m30173a(e2));
            }
            dVar = new C11229c(e2);
            fVar.mo35709j(dVar);
        } catch (Throwable th) {
            Throwable a = C11495a.m30173a(th);
            if (f22316b.isLoggable(Level.FINE)) {
                Logger logger4 = f22316b;
                logger4.fine("Execution has thrown, wrapping root cause in ActionException and returning: " + th);
                f22316b.log(Level.FINE, "Exception root cause: ", a);
            }
            dVar = new C11230d(C11386n.ACTION_FAILED, a.getMessage() != null ? a.getMessage() : a.toString(), a);
            fVar.mo35709j(dVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo35693b(C11232f<C11328h> fVar, Object obj);

    /* renamed from: c */
    public Map<C11321b<C11328h>, C11353c> mo35694c() {
        return this.f22317a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Object mo35695d(C11320a<C11328h> aVar, Object obj) {
        int length = aVar.mo35858f().length;
        Object[] objArr = new Object[length];
        Logger logger = f22316b;
        logger.fine("Attempting to retrieve output argument values using accessor: " + length);
        C11321b[] f = aVar.mo35858f();
        int length2 = f.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            C11321b bVar = f[i];
            Logger logger2 = f22316b;
            logger2.finer("Calling acccessor method for: " + bVar);
            C11353c cVar = mo35694c().get(bVar);
            if (cVar != null) {
                Logger logger3 = f22316b;
                logger3.fine("Calling accessor to read output argument value: " + cVar);
                objArr[i2] = cVar.mo36035b(obj);
                i++;
                i2++;
            } else {
                throw new IllegalStateException("No accessor bound for: " + bVar);
            }
        }
        if (length == 1) {
            return objArr[0];
        }
        if (length > 0) {
            return objArr;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo35696e(C11232f<C11328h> fVar, C11321b<C11328h> bVar, Object obj) {
        C11228b bVar2;
        C11328h g = fVar.mo35700a().mo35859g();
        if (obj != null) {
            try {
                if (g.mo35953t(obj)) {
                    f22316b.fine("Result of invocation matches convertible type, setting toString() single output argument value");
                    bVar2 = new C11228b(bVar, obj.toString());
                } else {
                    f22316b.fine("Result of invocation is Object, setting single output argument value");
                    bVar2 = new C11228b(bVar, obj);
                }
                fVar.mo35713n(bVar2);
            } catch (C11391r e) {
                C11386n nVar = C11386n.ARGUMENT_VALUE_INVALID;
                throw new C11230d(nVar, "Wrong type or invalid value for '" + bVar.mo35869e() + "': " + e.getMessage(), (Throwable) e);
            }
        } else {
            f22316b.fine("Result of invocation is null, not setting any output argument value(s)");
        }
    }
}
