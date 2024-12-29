package org.fourthline.cling.transport.impl;

import java.net.URI;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import org.fourthline.cling.model.message.C10027a;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.C10032f;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import p148d7.C8963m;
import p163g7.C9090c;
import p208s4.C10349a;
import p208s4.C10350b;
import p208s4.C10351c;
import p208s4.C10361m;
import p208s4.C10368t;
import p230x6.C12004a;

/* renamed from: org.fourthline.cling.transport.impl.b */
public abstract class C10124b extends C8963m implements C10351c {

    /* renamed from: g */
    private static final Logger f18695g = Logger.getLogger(C8963m.class.getName());

    /* renamed from: d */
    protected final C10349a f18696d;

    /* renamed from: e */
    protected final C9277a f18697e;

    /* renamed from: f */
    protected C10031e f18698f;

    public C10124b(C12004a aVar, C10349a aVar2, C9277a aVar3) {
        super(aVar);
        this.f18696d = aVar2;
        this.f18697e = aVar3;
        aVar2.mo41930a(this);
    }

    /* renamed from: E */
    public void mo40720E(C10350b bVar) {
        Logger logger = f18695g;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Asynchronous processing of HTTP request error: " + bVar.mo41936c());
        }
        mo36809J(bVar.mo41936c());
    }

    /* renamed from: F */
    public void mo40721F(C10350b bVar) {
        Logger logger = f18695g;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Asynchronous processing of HTTP request timed out: " + bVar.mo41934a());
        }
        mo36809J(new Exception("Asynchronous request timed out"));
    }

    /* renamed from: H */
    public void mo40722H(C10350b bVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo40729L() {
        try {
            this.f18696d.complete();
        } catch (IllegalStateException e) {
            Logger logger = f18695g;
            logger.info("Error calling servlet container's AsyncContext#complete() method: " + e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public abstract C10027a mo40724M();

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public C9277a mo40730N() {
        return this.f18697e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public C9279c mo40731O() {
        C10368t d = this.f18696d.mo41933d();
        if (d != null) {
            return (C9279c) d;
        }
        throw new IllegalStateException("Couldn't get response from asynchronous context, already timed out");
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public C10030d mo40732P() {
        String l = mo40730N().mo37767l();
        String w = mo40730N().mo37774w();
        Logger logger = f18695g;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Processing HTTP request: " + l + " " + w);
        }
        try {
            C10030d dVar = new C10030d(UpnpRequest.Method.getByHttpName(l), URI.create(w));
            if (!((UpnpRequest) dVar.mo40404k()).mo40416d().equals(UpnpRequest.Method.UNKNOWN)) {
                dVar.mo40436w(mo40724M());
                C10032f fVar = new C10032f();
                Enumeration<String> f = mo40730N().mo37762f();
                while (f.hasMoreElements()) {
                    String nextElement = f.nextElement();
                    Enumeration<String> k = mo40730N().mo37766k(nextElement);
                    while (k.hasMoreElements()) {
                        fVar.mo36963a(nextElement, k.nextElement());
                    }
                }
                dVar.mo40413t(fVar);
                C10361m mVar = null;
                try {
                    mVar = mo40730N().mo41946d();
                    byte[] c = C9090c.m21802c(mVar);
                    Logger logger2 = f18695g;
                    Level level = Level.FINER;
                    if (logger2.isLoggable(level)) {
                        logger2.finer("Reading request body bytes: " + c.length);
                    }
                    if (c.length > 0 && dVar.mo40409p()) {
                        if (logger2.isLoggable(level)) {
                            logger2.finer("Request contains textual entity body, converting then setting string on message");
                        }
                        dVar.mo40412s(c);
                    } else if (c.length > 0) {
                        if (logger2.isLoggable(level)) {
                            logger2.finer("Request contains binary entity body, setting bytes on message");
                        }
                        dVar.mo40411r(UpnpMessage.BodyType.BYTES, c);
                    } else if (logger2.isLoggable(level)) {
                        logger2.finer("Request did not contain entity body");
                    }
                    return dVar;
                } finally {
                    if (mVar != null) {
                        mVar.close();
                    }
                }
            } else {
                throw new RuntimeException("Method not supported: " + l);
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid request URI: " + w, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo40733Q(C10031e eVar) {
        Logger logger = f18695g;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Sending HTTP response status: " + ((UpnpResponse) eVar.mo40404k()).mo40422d());
        }
        mo40731O().mo37782p(((UpnpResponse) eVar.mo40404k()).mo40422d());
        for (Map.Entry next : eVar.mo40403j().entrySet()) {
            for (String j : (List) next.getValue()) {
                mo40731O().mo37777j((String) next.getKey(), j);
            }
        }
        mo40731O().mo37775a("Date", System.currentTimeMillis());
        byte[] f = eVar.mo40407n() ? eVar.mo40399f() : null;
        int length = f != null ? f.length : -1;
        if (length > 0) {
            mo40731O().mo37798n(length);
            f18695g.finer("Response message has body, writing bytes to stream...");
            C9090c.m21807h(mo40731O().mo37797h(), f);
        }
    }

    public void run() {
        try {
            C10030d P = mo40732P();
            Logger logger = f18695g;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.finer("Processing new request message: " + P);
            }
            C10031e I = mo36808I(P);
            this.f18698f = I;
            if (I != null) {
                if (logger.isLoggable(level)) {
                    logger.finer("Preparing HTTP response message: " + this.f18698f);
                }
                mo40733Q(this.f18698f);
            } else {
                if (logger.isLoggable(level)) {
                    logger.finer("Sending HTTP response status: 404");
                }
                mo40731O().mo37782p(404);
            }
        } catch (Throwable th) {
            mo40729L();
            throw th;
        }
        mo40729L();
    }

    /* renamed from: x */
    public void mo40723x(C10350b bVar) {
        Logger logger = f18695g;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Completed asynchronous processing of HTTP request: " + bVar.mo41934a());
        }
        mo36810K(this.f18698f);
    }
}
