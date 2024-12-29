package org.eclipse.jetty.client;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import javax.net.SocketFactory;
import org.eclipse.jetty.client.C9871g;
import org.eclipse.jetty.p195io.bio.C9921a;
import p147d6.C8941a;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11949j;

/* renamed from: org.eclipse.jetty.client.l */
class C9884l extends C8941a implements C9871g.C9873b {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C9003c f17979f = C9001b.m21450a(C9884l.class);

    /* renamed from: e */
    private final C9871g f17980e;

    /* renamed from: org.eclipse.jetty.client.l$a */
    class C9885a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9861a f17981a;

        /* renamed from: b */
        final /* synthetic */ HttpDestination f17982b;

        C9885a(C9884l lVar, C9861a aVar, HttpDestination httpDestination) {
            this.f17981a = aVar;
            this.f17982b = httpDestination;
        }

        public void run() {
            try {
                C11949j jVar = this.f17981a;
                while (true) {
                    C11949j c = jVar.mo39556c();
                    if (c != jVar) {
                        jVar = c;
                    } else {
                        try {
                            this.f17982b.mo39508r(this.f17981a, true);
                            return;
                        } catch (IOException e) {
                            C9884l.f17979f.mo36848c(e);
                            return;
                        }
                    }
                }
            } catch (IOException e2) {
                if (e2 instanceof InterruptedIOException) {
                    C9884l.f17979f.mo36849d(e2);
                } else {
                    C9884l.f17979f.mo36848c(e2);
                    this.f17982b.mo39505o(e2);
                }
                this.f17982b.mo39508r(this.f17981a, true);
            } catch (Throwable th) {
                try {
                    this.f17982b.mo39508r(this.f17981a, true);
                } catch (IOException e3) {
                    C9884l.f17979f.mo36848c(e3);
                }
                throw th;
            }
        }
    }

    C9884l(C9871g gVar) {
        this.f17980e = gVar;
    }

    /* renamed from: U */
    public void mo39594U(HttpDestination httpDestination) {
        Socket Q0 = httpDestination.mo39503m() ? this.f17980e.mo39574Y0().mo37070Q0() : SocketFactory.getDefault().createSocket();
        Q0.setSoTimeout(0);
        Q0.setTcpNoDelay(true);
        Q0.connect((httpDestination.mo39502l() ? httpDestination.mo39500j() : httpDestination.mo39496f()).mo39552c(), this.f17980e.mo39566R0());
        C9868d dVar = new C9868d(this.f17980e.mo39592r0(), this.f17980e.mo39572X(), new C9921a(Q0));
        dVar.mo39528s(httpDestination);
        httpDestination.mo39506p(dVar);
        this.f17980e.mo39575Z0().mo37186h0(new C9885a(this, dVar, httpDestination));
    }
}
