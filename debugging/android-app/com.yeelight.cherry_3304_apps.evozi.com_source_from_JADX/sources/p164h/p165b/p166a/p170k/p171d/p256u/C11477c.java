package p164h.p165b.p166a.p170k.p171d.p256u;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.p170k.p172e.C11481a;
import p164h.p165b.p166a.p170k.p172e.C11485f;
import p164h.p165b.p166a.p170k.p172e.C11490l;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11245f;
import p164h.p165b.p166a.p240h.p243r.C11246g;
import p164h.p165b.p166a.p240h.p243r.C11249i;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p247n.C11291d;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p211a.p212a.p213a.C10861f;
import p164h.p211a.p212a.p213a.C10862g;
import p164h.p211a.p212a.p216c.C10897i;
import p164h.p211a.p212a.p217d.C10938k;
import p164h.p211a.p212a.p228h.p232d0.C11108a;
import p164h.p257c.p259b.C11495a;
import p164h.p257c.p259b.C11497c;

/* renamed from: h.b.a.k.d.u.c */
public class C11477c extends C11481a<C11476b, C11480c> {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Logger f22833d = Logger.getLogger(C11490l.class.getName());

    /* renamed from: b */
    protected final C11476b f22834b;

    /* renamed from: c */
    protected final C10862g f22835c;

    /* renamed from: h.b.a.k.d.u.c$a */
    class C11478a extends C11108a {
        C11478a(C11477c cVar, ExecutorService executorService) {
            super(executorService);
        }

        /* access modifiers changed from: protected */
        /* renamed from: q0 */
        public void mo34263q0() {
        }
    }

    /* renamed from: h.b.a.k.d.u.c$b */
    class C11479b implements Callable<C11244e> {

        /* renamed from: a */
        final /* synthetic */ C11243d f22836a;

        /* renamed from: b */
        final /* synthetic */ C11480c f22837b;

        C11479b(C11243d dVar, C11480c cVar) {
            this.f22836a = dVar;
            this.f22837b = cVar;
        }

        /* renamed from: a */
        public C11244e call() {
            if (C11477c.f22833d.isLoggable(Level.FINE)) {
                Logger h = C11477c.f22833d;
                h.fine("Sending HTTP request: " + this.f22836a);
            }
            C11477c.this.f22835c.mo34255c1(this.f22837b);
            int d0 = this.f22837b.mo34321d0();
            if (d0 == 7) {
                try {
                    return this.f22837b.mo36366l0();
                } catch (Throwable th) {
                    Logger h2 = C11477c.f22833d;
                    Level level = Level.WARNING;
                    h2.log(level, "Error reading response: " + this.f22836a, C11495a.m30173a(th));
                    return null;
                }
            } else if (d0 == 11 || d0 == 9) {
                return null;
            } else {
                Logger h3 = C11477c.f22833d;
                h3.warning("Unhandled HTTP exchange status: " + d0);
                return null;
            }
        }
    }

    /* renamed from: h.b.a.k.d.u.c$c */
    public static class C11480c extends C10861f {

        /* renamed from: B */
        protected final C11476b f22839B;

        /* renamed from: C */
        protected final C11243d f22840C;

        public C11480c(C11476b bVar, C10862g gVar, C11243d dVar) {
            super(true);
            this.f22839B = bVar;
            this.f22840C = dVar;
            mo36365k0();
            mo36364j0();
            mo36363i0();
        }

        /* access modifiers changed from: protected */
        /* renamed from: i0 */
        public void mo36363i0() {
            C10938k kVar;
            if (mo36368n0().mo35779n()) {
                if (mo36368n0().mo35773g() == C11246g.C11247a.STRING) {
                    if (C11477c.f22833d.isLoggable(Level.FINE)) {
                        Logger h = C11477c.f22833d;
                        h.fine("Writing textual request body: " + mo36368n0());
                    }
                    C11497c cVar = mo36368n0().mo35775i() != null ? (C11497c) mo36368n0().mo35775i().mo35845b() : C11291d.f22401d;
                    String h2 = mo36368n0().mo35774h() != null ? mo36368n0().mo35774h() : "UTF-8";
                    mo34308Q(cVar.toString());
                    try {
                        kVar = new C10938k(mo36368n0().mo35770c(), h2);
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException("Unsupported character encoding: " + h2, e);
                    }
                } else {
                    if (C11477c.f22833d.isLoggable(Level.FINE)) {
                        Logger h3 = C11477c.f22833d;
                        h3.fine("Writing binary request body: " + mo36368n0());
                    }
                    if (mo36368n0().mo35775i() != null) {
                        mo34308Q(((C11497c) mo36368n0().mo35775i().mo35845b()).toString());
                        kVar = new C10938k(mo36368n0().mo35772f());
                    } else {
                        throw new RuntimeException("Missing content type header in request message: " + this.f22840C);
                    }
                }
                mo34309R("Content-Length", String.valueOf(kVar.length()));
                mo34306O(kVar);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: j0 */
        public void mo36364j0() {
            C11245f j = mo36368n0().mo35747j();
            if (C11477c.f22833d.isLoggable(Level.FINE)) {
                Logger h = C11477c.f22833d;
                h.fine("Writing headers on HttpContentExchange: " + j.size());
            }
            if (!j.mo35760n(C11296f0.C11297a.USER_AGENT)) {
                mo34309R(C11296f0.C11297a.USER_AGENT.mo35849c(), mo36367m0().mo35527d(mo36368n0().mo35777l(), mo36368n0().mo35778m()));
            }
            for (Map.Entry next : j.entrySet()) {
                for (String str : (List) next.getValue()) {
                    String str2 = (String) next.getKey();
                    if (C11477c.f22833d.isLoggable(Level.FINE)) {
                        Logger h2 = C11477c.f22833d;
                        h2.fine("Setting header '" + str2 + "': " + str);
                    }
                    mo34319c(str2, str);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k0 */
        public void mo36365k0() {
            C11249i iVar = (C11249i) mo36368n0().mo35776k();
            if (C11477c.f22833d.isLoggable(Level.FINE)) {
                Logger h = C11477c.f22833d;
                h.fine("Preparing HTTP request message with method '" + iVar.mo35789c() + "': " + mo36368n0());
            }
            mo34317a0(iVar.mo35791e().toString());
            mo34305N(iVar.mo35789c());
        }

        /* access modifiers changed from: protected */
        /* renamed from: l0 */
        public C11244e mo36366l0() {
            C11252j jVar = new C11252j(mo34230f0(), C11252j.C11253a.m29438a(mo34230f0()).mo35801c());
            if (C11477c.f22833d.isLoggable(Level.FINE)) {
                Logger h = C11477c.f22833d;
                h.fine("Received response: " + jVar);
            }
            C11244e eVar = new C11244e(jVar);
            C11245f fVar = new C11245f();
            C10897i e0 = mo34229e0();
            for (String next : e0.mo34476s()) {
                for (String a : e0.mo34483y(next)) {
                    fVar.mo35754a(next, a);
                }
            }
            eVar.mo35785t(fVar);
            byte[] h0 = mo34233h0();
            if (h0 != null && h0.length > 0 && eVar.mo35781p()) {
                if (C11477c.f22833d.isLoggable(Level.FINE)) {
                    C11477c.f22833d.fine("Response contains textual entity body, converting then setting string on message");
                }
                try {
                    eVar.mo35784s(h0);
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("Unsupported character encoding: " + e, e);
                }
            } else if (h0 != null && h0.length > 0) {
                if (C11477c.f22833d.isLoggable(Level.FINE)) {
                    C11477c.f22833d.fine("Response contains binary entity body, setting bytes on message");
                }
                eVar.mo35783r(C11246g.C11247a.BYTES, h0);
            } else if (C11477c.f22833d.isLoggable(Level.FINE)) {
                C11477c.f22833d.fine("Response did not contain entity body");
            }
            if (C11477c.f22833d.isLoggable(Level.FINE)) {
                Logger h2 = C11477c.f22833d;
                h2.fine("Response message complete: " + eVar);
            }
            return eVar;
        }

        /* renamed from: m0 */
        public C11476b mo36367m0() {
            return this.f22839B;
        }

        /* renamed from: n0 */
        public C11243d mo36368n0() {
            return this.f22840C;
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public void mo34291x(Throwable th) {
            Logger h = C11477c.f22833d;
            Level level = Level.WARNING;
            h.log(level, "HTTP connection failed: " + this.f22840C, C11495a.m30173a(th));
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public void mo34292y(Throwable th) {
            Logger h = C11477c.f22833d;
            Level level = Level.WARNING;
            h.log(level, "HTTP request failed: " + this.f22840C, C11495a.m30173a(th));
        }
    }

    public C11477c(C11476b bVar) {
        this.f22834b = bVar;
        f22833d.info("Starting Jetty HttpClient...");
        C10862g gVar = new C10862g();
        this.f22835c = gVar;
        gVar.mo34259g1(new C11478a(this, getConfiguration().mo36372c()));
        this.f22835c.mo34260h1((long) ((bVar.mo36370a() + 5) * 1000));
        this.f22835c.mo34257e1((bVar.mo36370a() + 5) * 1000);
        this.f22835c.mo34258f1(bVar.mo36352e());
        try {
            this.f22835c.start();
        } catch (Exception e) {
            throw new C11485f("Could not start Jetty HTTP client: " + e, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo36356e(Throwable th) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo36353b(C11480c cVar) {
        cVar.mo34322e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Callable<C11244e> mo36354c(C11243d dVar, C11480c cVar) {
        return new C11479b(dVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C11480c mo36355d(C11243d dVar) {
        return new C11480c(getConfiguration(), this.f22835c, dVar);
    }

    /* renamed from: k */
    public C11476b getConfiguration() {
        return this.f22834b;
    }

    public void stop() {
        try {
            this.f22835c.stop();
        } catch (Exception e) {
            Logger logger = f22833d;
            logger.info("Error stopping HTTP client: " + e);
        }
    }
}
