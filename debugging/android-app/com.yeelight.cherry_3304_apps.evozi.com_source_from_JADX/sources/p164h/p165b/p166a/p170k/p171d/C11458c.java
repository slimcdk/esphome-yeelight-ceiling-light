package p164h.p165b.p166a.p170k.p171d;

import java.net.URI;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p154d.p155b.C10697a;
import p154d.p155b.C10699b;
import p154d.p155b.C10701c;
import p154d.p155b.C10731q;
import p154d.p155b.C10740z;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p164h.p165b.p166a.p168i.C4429b;
import p164h.p165b.p166a.p170k.p172e.C11493o;
import p164h.p165b.p166a.p240h.p243r.C11240a;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11245f;
import p164h.p165b.p166a.p240h.p243r.C11246g;
import p164h.p165b.p166a.p240h.p243r.C11249i;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p257c.p259b.p260f.C11510c;

/* renamed from: h.b.a.k.d.c */
public abstract class C11458c extends C11493o implements C10701c {

    /* renamed from: g */
    private static final Logger f22789g = Logger.getLogger(C11493o.class.getName());

    /* renamed from: d */
    protected final C10697a f22790d;

    /* renamed from: e */
    protected final C10709c f22791e;

    /* renamed from: f */
    protected C11244e f22792f;

    public C11458c(C4429b bVar, C10697a aVar, C10709c cVar) {
        super(bVar);
        this.f22790d = aVar;
        this.f22791e = cVar;
        aVar.mo33882c(this);
    }

    /* renamed from: H */
    public void mo33898H(C10699b bVar) {
    }

    /* renamed from: I */
    public void mo33899I(C10699b bVar) {
        if (f22789g.isLoggable(Level.FINER)) {
            Logger logger = f22789g;
            logger.finer("Asynchronous processing of HTTP request error: " + bVar.mo33893c());
        }
        mo36373C(bVar.mo33893c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo36293M() {
        try {
            this.f22790d.complete();
        } catch (IllegalStateException e) {
            Logger logger = f22789g;
            logger.info("Error calling servlet container's AsyncContext#complete() method: " + e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract C11240a mo36291N();

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public C10709c mo36294Q() {
        return this.f22791e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public C10711e mo36295R() {
        C10740z b = this.f22790d.mo33881b();
        if (b != null) {
            return (C10711e) b;
        }
        throw new IllegalStateException("Couldn't get response from asynchronous context, already timed out");
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public C11243d mo36296S() {
        String m = mo36294Q().mo33923m();
        String v = mo36294Q().mo33929v();
        if (f22789g.isLoggable(Level.FINER)) {
            Logger logger = f22789g;
            logger.finer("Processing HTTP request: " + m + " " + v);
        }
        try {
            C11243d dVar = new C11243d(C11249i.C11250a.m29432a(m), URI.create(v));
            if (!((C11249i) dVar.mo35776k()).mo35790d().equals(C11249i.C11250a.UNKNOWN)) {
                dVar.mo35752w(mo36291N());
                C11245f fVar = new C11245f();
                Enumeration<String> g = mo36294Q().mo33919g();
                while (g.hasMoreElements()) {
                    String nextElement = g.nextElement();
                    Enumeration<String> l = mo36294Q().mo33922l(nextElement);
                    while (l.hasMoreElements()) {
                        fVar.mo35754a(nextElement, l.nextElement());
                    }
                }
                dVar.mo35785t(fVar);
                C10731q qVar = null;
                try {
                    qVar = mo36294Q().mo33967d();
                    byte[] c = C11510c.m30228c(qVar);
                    if (f22789g.isLoggable(Level.FINER)) {
                        Logger logger2 = f22789g;
                        logger2.finer("Reading request body bytes: " + c.length);
                    }
                    if (c.length > 0 && dVar.mo35781p()) {
                        if (f22789g.isLoggable(Level.FINER)) {
                            f22789g.finer("Request contains textual entity body, converting then setting string on message");
                        }
                        dVar.mo35784s(c);
                    } else if (c.length > 0) {
                        if (f22789g.isLoggable(Level.FINER)) {
                            f22789g.finer("Request contains binary entity body, setting bytes on message");
                        }
                        dVar.mo35783r(C11246g.C11247a.BYTES, c);
                    } else if (f22789g.isLoggable(Level.FINER)) {
                        f22789g.finer("Request did not contain entity body");
                    }
                    return dVar;
                } finally {
                    if (qVar != null) {
                        qVar.close();
                    }
                }
            } else {
                throw new RuntimeException("Method not supported: " + m);
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid request URI: " + v, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo36297T(C11244e eVar) {
        if (f22789g.isLoggable(Level.FINER)) {
            Logger logger = f22789g;
            logger.finer("Sending HTTP response status: " + ((C11252j) eVar.mo35776k()).mo35796d());
        }
        mo36295R().mo33936m(((C11252j) eVar.mo35776k()).mo35796d());
        for (Map.Entry next : eVar.mo35747j().entrySet()) {
            for (String d : (List) next.getValue()) {
                mo36295R().mo33932d((String) next.getKey(), d);
            }
        }
        mo36295R().mo33930a("Date", System.currentTimeMillis());
        byte[] f = eVar.mo35779n() ? eVar.mo35772f() : null;
        int length = f != null ? f.length : -1;
        if (length > 0) {
            mo36295R().mo33889k(length);
            f22789g.finer("Response message has body, writing bytes to stream...");
            C11510c.m30233h(mo36295R().mo33888j(), f);
        }
    }

    /* renamed from: n */
    public void mo33900n(C10699b bVar) {
        if (f22789g.isLoggable(Level.FINER)) {
            Logger logger = f22789g;
            logger.finer("Asynchronous processing of HTTP request timed out: " + bVar.mo33891a());
        }
        mo36373C(new Exception("Asynchronous request timed out"));
    }

    public void run() {
        try {
            C11243d S = mo36296S();
            if (f22789g.isLoggable(Level.FINER)) {
                Logger logger = f22789g;
                logger.finer("Processing new request message: " + S);
            }
            C11244e g = mo36376g(S);
            this.f22792f = g;
            if (g != null) {
                if (f22789g.isLoggable(Level.FINER)) {
                    Logger logger2 = f22789g;
                    logger2.finer("Preparing HTTP response message: " + this.f22792f);
                }
                mo36297T(this.f22792f);
            } else {
                if (f22789g.isLoggable(Level.FINER)) {
                    f22789g.finer("Sending HTTP response status: 404");
                }
                mo36295R().mo33936m(404);
            }
        } catch (Throwable th) {
            mo36293M();
            throw th;
        }
        mo36293M();
    }

    /* renamed from: z */
    public void mo33901z(C10699b bVar) {
        if (f22789g.isLoggable(Level.FINER)) {
            Logger logger = f22789g;
            logger.finer("Completed asynchronous processing of HTTP request: " + bVar.mo33891a());
        }
        mo36374J(this.f22792f);
    }
}
