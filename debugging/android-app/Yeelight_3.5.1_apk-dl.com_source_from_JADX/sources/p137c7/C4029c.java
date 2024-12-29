package p137c7;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.client.C9870f;
import org.eclipse.jetty.client.C9871g;
import org.eclipse.jetty.http.C9895h;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.C10032f;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.C10041d;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.spi.InitializationException;
import org.seamless.util.C10243a;
import org.seamless.util.C10245c;
import p148d7.C8951a;
import p148d7.C8960j;
import p172i6.C9121a;
import p225w5.C11946h;

/* renamed from: c7.c */
public class C4029c extends C8951a<C4028b, C4032c> {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Logger f6856d = Logger.getLogger(C8960j.class.getName());

    /* renamed from: b */
    protected final C4028b f6857b;

    /* renamed from: c */
    protected final C9871g f6858c;

    /* renamed from: c7.c$a */
    class C4030a extends C9121a {
        C4030a(C4029c cVar, ExecutorService executorService) {
            super(executorService);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v0 */
        public void mo26548v0() {
        }
    }

    /* renamed from: c7.c$b */
    class C4031b implements Callable<C10031e> {

        /* renamed from: a */
        final /* synthetic */ C10030d f6859a;

        /* renamed from: b */
        final /* synthetic */ C4032c f6860b;

        C4031b(C10030d dVar, C4032c cVar) {
            this.f6859a = dVar;
            this.f6860b = cVar;
        }

        /* renamed from: a */
        public C10031e call() {
            if (C4029c.f6856d.isLoggable(Level.FINE)) {
                Logger h = C4029c.f6856d;
                h.fine("Sending HTTP request: " + this.f6859a);
            }
            C4029c.this.f6858c.mo39587h1(this.f6860b);
            int d0 = this.f6860b.mo39622d0();
            if (d0 == 7) {
                try {
                    return this.f6860b.mo26740l0();
                } catch (Throwable th) {
                    Logger h2 = C4029c.f6856d;
                    Level level = Level.WARNING;
                    h2.log(level, "Error reading response: " + this.f6859a, C10243a.m25753a(th));
                    return null;
                }
            } else if (d0 == 11 || d0 == 9) {
                return null;
            } else {
                Logger h3 = C4029c.f6856d;
                h3.warning("Unhandled HTTP exchange status: " + d0);
                return null;
            }
        }
    }

    /* renamed from: c7.c$c */
    public static class C4032c extends C9870f {

        /* renamed from: B */
        protected final C4028b f6862B;

        /* renamed from: C */
        protected final C10030d f6863C;

        public C4032c(C4028b bVar, C9871g gVar, C10030d dVar) {
            super(true);
            this.f6862B = bVar;
            this.f6863C = dVar;
            mo26739k0();
            mo26738j0();
            mo26737i0();
        }

        /* access modifiers changed from: protected */
        /* renamed from: i0 */
        public void mo26737i0() {
            C11946h hVar;
            if (mo26742n0().mo40407n()) {
                if (mo26742n0().mo40400g() == UpnpMessage.BodyType.STRING) {
                    if (C4029c.f6856d.isLoggable(Level.FINE)) {
                        Logger h = C4029c.f6856d;
                        h.fine("Writing textual request body: " + mo26742n0());
                    }
                    C10245c cVar = mo26742n0().mo40402i() != null ? (C10245c) mo26742n0().mo40402i().mo40449b() : C10041d.f18540d;
                    String h2 = mo26742n0().mo40401h() != null ? mo26742n0().mo40401h() : "UTF-8";
                    mo39609Q(cVar.toString());
                    try {
                        hVar = new C11946h(mo26742n0().mo40397c(), h2);
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException("Unsupported character encoding: " + h2, e);
                    }
                } else {
                    if (C4029c.f6856d.isLoggable(Level.FINE)) {
                        Logger h3 = C4029c.f6856d;
                        h3.fine("Writing binary request body: " + mo26742n0());
                    }
                    if (mo26742n0().mo40402i() != null) {
                        mo39609Q(((C10245c) mo26742n0().mo40402i().mo40449b()).toString());
                        hVar = new C11946h(mo26742n0().mo40399f());
                    } else {
                        throw new RuntimeException("Missing content type header in request message: " + this.f6863C);
                    }
                }
                mo39610R("Content-Length", String.valueOf(hVar.length()));
                mo39607O(hVar);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: j0 */
        public void mo26738j0() {
            C10032f j = mo26742n0().mo40403j();
            if (C4029c.f6856d.isLoggable(Level.FINE)) {
                Logger h = C4029c.f6856d;
                h.fine("Writing headers on HttpContentExchange: " + j.size());
            }
            UpnpHeader.Type type = UpnpHeader.Type.USER_AGENT;
            if (!j.mo40440n(type)) {
                mo39610R(type.getHttpName(), mo26741m0().mo36786d(mo26742n0().mo40405l(), mo26742n0().mo40406m()));
            }
            for (Map.Entry next : j.entrySet()) {
                for (String str : (List) next.getValue()) {
                    String str2 = (String) next.getKey();
                    if (C4029c.f6856d.isLoggable(Level.FINE)) {
                        Logger h2 = C4029c.f6856d;
                        h2.fine("Setting header '" + str2 + "': " + str);
                    }
                    mo39620c(str2, str);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k0 */
        public void mo26739k0() {
            UpnpRequest upnpRequest = (UpnpRequest) mo26742n0().mo40404k();
            if (C4029c.f6856d.isLoggable(Level.FINE)) {
                Logger h = C4029c.f6856d;
                h.fine("Preparing HTTP request message with method '" + upnpRequest.mo40415c() + "': " + mo26742n0());
            }
            mo39618a0(upnpRequest.mo40417e().toString());
            mo39606N(upnpRequest.mo40415c());
        }

        /* access modifiers changed from: protected */
        /* renamed from: l0 */
        public C10031e mo26740l0() {
            UpnpResponse upnpResponse = new UpnpResponse(mo39561f0(), UpnpResponse.Status.getByStatusCode(mo39561f0()).getStatusMsg());
            if (C4029c.f6856d.isLoggable(Level.FINE)) {
                Logger h = C4029c.f6856d;
                h.fine("Received response: " + upnpResponse);
            }
            C10031e eVar = new C10031e(upnpResponse);
            C10032f fVar = new C10032f();
            C9895h e0 = mo39560e0();
            for (String next : e0.mo39800u()) {
                for (String a : e0.mo39777A(next)) {
                    fVar.mo36963a(next, a);
                }
            }
            eVar.mo40413t(fVar);
            byte[] h0 = mo39564h0();
            if (h0 != null && h0.length > 0 && eVar.mo40409p()) {
                if (C4029c.f6856d.isLoggable(Level.FINE)) {
                    C4029c.f6856d.fine("Response contains textual entity body, converting then setting string on message");
                }
                try {
                    eVar.mo40412s(h0);
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("Unsupported character encoding: " + e, e);
                }
            } else if (h0 != null && h0.length > 0) {
                if (C4029c.f6856d.isLoggable(Level.FINE)) {
                    C4029c.f6856d.fine("Response contains binary entity body, setting bytes on message");
                }
                eVar.mo40411r(UpnpMessage.BodyType.BYTES, h0);
            } else if (C4029c.f6856d.isLoggable(Level.FINE)) {
                C4029c.f6856d.fine("Response did not contain entity body");
            }
            if (C4029c.f6856d.isLoggable(Level.FINE)) {
                Logger h2 = C4029c.f6856d;
                h2.fine("Response message complete: " + eVar);
            }
            return eVar;
        }

        /* renamed from: m0 */
        public C4028b mo26741m0() {
            return this.f6862B;
        }

        /* renamed from: n0 */
        public C10030d mo26742n0() {
            return this.f6863C;
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public void mo26743x(Throwable th) {
            Logger h = C4029c.f6856d;
            Level level = Level.WARNING;
            h.log(level, "HTTP connection failed: " + this.f6863C, C10243a.m25753a(th));
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public void mo26744y(Throwable th) {
            Logger h = C4029c.f6856d;
            Level level = Level.WARNING;
            h.log(level, "HTTP request failed: " + this.f6863C, C10243a.m25753a(th));
        }
    }

    public C4029c(C4028b bVar) {
        this.f6857b = bVar;
        f6856d.info("Starting Jetty HttpClient...");
        C9871g gVar = new C9871g();
        this.f6858c = gVar;
        gVar.mo39590l1(new C4030a(this, getConfiguration().mo36785c()));
        gVar.mo39591m1((long) ((bVar.mo36783a() + 5) * 1000));
        gVar.mo39588j1((bVar.mo36783a() + 5) * 1000);
        gVar.mo39589k1(bVar.mo26724e());
        try {
            gVar.start();
        } catch (Exception e) {
            throw new InitializationException("Could not start Jetty HTTP client: " + e, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo26728e(Throwable th) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26725b(C4032c cVar) {
        cVar.mo39623e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Callable<C10031e> mo26726c(C10030d dVar, C4032c cVar) {
        return new C4031b(dVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C4032c mo26727d(C10030d dVar) {
        return new C4032c(getConfiguration(), this.f6858c, dVar);
    }

    /* renamed from: k */
    public C4028b getConfiguration() {
        return this.f6857b;
    }

    public void stop() {
        try {
            this.f6858c.stop();
        } catch (Exception e) {
            Logger logger = f6856d;
            logger.info("Error stopping HTTP client: " + e);
        }
    }
}
