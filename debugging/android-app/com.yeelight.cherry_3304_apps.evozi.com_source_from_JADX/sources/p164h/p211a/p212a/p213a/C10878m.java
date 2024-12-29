package p164h.p211a.p212a.p213a;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import javax.net.SocketFactory;
import p164h.p211a.p212a.p213a.C10862g;
import p164h.p211a.p212a.p217d.C10941m;
import p164h.p211a.p212a.p217d.p218u.C10952a;
import p164h.p211a.p212a.p228h.p233x.C11145a;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.a.m */
class C10878m extends C11145a implements C10862g.C10864b {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C11158c f21048f = C11156b.m29015a(C10878m.class);

    /* renamed from: e */
    private final C10862g f21049e;

    /* renamed from: h.a.a.a.m$a */
    class C10879a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10852a f21050a;

        /* renamed from: b */
        final /* synthetic */ C10866h f21051b;

        C10879a(C10878m mVar, C10852a aVar, C10866h hVar) {
            this.f21050a = aVar;
            this.f21051b = hVar;
        }

        public void run() {
            try {
                C10941m mVar = this.f21050a;
                while (true) {
                    C10941m c = mVar.mo34225c();
                    if (c != mVar) {
                        mVar = c;
                    } else {
                        try {
                            this.f21051b.mo34282r(this.f21050a, true);
                            return;
                        } catch (IOException e) {
                            C10878m.f21048f.mo35487c(e);
                            return;
                        }
                    }
                }
            } catch (IOException e2) {
                if (e2 instanceof InterruptedIOException) {
                    C10878m.f21048f.mo35488d(e2);
                } else {
                    C10878m.f21048f.mo35487c(e2);
                    this.f21051b.mo34279o(e2);
                }
                this.f21051b.mo34282r(this.f21050a, true);
            } catch (Throwable th) {
                try {
                    this.f21051b.mo34282r(this.f21050a, true);
                } catch (IOException e3) {
                    C10878m.f21048f.mo35487c(e3);
                }
                throw th;
            }
        }
    }

    C10878m(C10862g gVar) {
        this.f21049e = gVar;
    }

    /* renamed from: T */
    public void mo34265T(C10866h hVar) {
        Socket L0 = hVar.mo34277m() ? this.f21049e.mo34242T0().mo35275L0() : SocketFactory.getDefault().createSocket();
        L0.setSoTimeout(0);
        L0.setTcpNoDelay(true);
        L0.connect((hVar.mo34276l() ? hVar.mo34274j() : hVar.mo34270f()).mo34221c(), this.f21049e.mo34235M0());
        C10859d dVar = new C10859d(this.f21049e.mo34261m0(), this.f21049e.mo34245W(), new C10952a(L0));
        dVar.mo34196s(hVar);
        hVar.mo34280p(dVar);
        this.f21049e.mo34243U0().mo35291e0(new C10879a(this, dVar, hVar));
    }
}
