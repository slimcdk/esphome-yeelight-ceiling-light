package p164h.p165b.p166a.p168i.p255j;

import java.util.List;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11405h;
import p164h.p165b.p166a.p240h.C11218h;
import p164h.p165b.p166a.p240h.p242q.C11239d;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p246m.C11277c;
import p164h.p165b.p166a.p240h.p243r.p246m.C11282h;
import p164h.p165b.p166a.p240h.p248s.C11334n;

/* renamed from: h.b.a.i.j.i */
public class C11427i extends C11405h<C11282h, C11277c> {

    /* renamed from: f */
    private static final Logger f22728f = Logger.getLogger(C11427i.class.getName());

    /* renamed from: e */
    protected final C11239d f22729e;

    /* renamed from: h.b.a.i.j.i$a */
    class C11428a implements Runnable {
        C11428a() {
        }

        public void run() {
            C11427i.this.f22729e.mo35739V((C11252j) null);
        }
    }

    /* renamed from: h.b.a.i.j.i$b */
    class C11429b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11277c f22731a;

        C11429b(C11277c cVar) {
            this.f22731a = cVar;
        }

        public void run() {
            C11427i.this.f22729e.mo35739V((C11252j) this.f22731a.mo35776k());
        }
    }

    /* renamed from: h.b.a.i.j.i$c */
    class C11430c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11277c f22733a;

        C11430c(C11277c cVar) {
            this.f22733a = cVar;
        }

        public void run() {
            C11427i.this.f22729e.mo35739V((C11252j) this.f22733a.mo35776k());
        }
    }

    /* renamed from: h.b.a.i.j.i$d */
    class C11431d implements Runnable {
        C11431d() {
        }

        public void run() {
            C11427i.this.f22729e.mo35738T();
        }
    }

    /* renamed from: h.b.a.i.j.i$e */
    class C11432e implements Runnable {
        C11432e() {
        }

        public void run() {
            C11427i.this.f22729e.mo35739V((C11252j) null);
        }
    }

    public C11427i(C4423b bVar, C11239d dVar, List<C11218h> list) {
        super(bVar, new C11282h(dVar, dVar.mo35740X(list, bVar.getConfiguration().getNamespace()), bVar.getConfiguration().getEventSubscriptionHeaders((C11334n) dVar.mo35723N())));
        this.f22729e = dVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        mo36220h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0126, code lost:
        mo36173c().getRegistry().mo24420m(r5.f22729e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0133, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0123 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p164h.p165b.p166a.p240h.p243r.p246m.C11277c mo36176d() {
        /*
            r5 = this;
            h.b.a.h.r.d r0 = r5.mo36177e()
            h.b.a.h.r.m.h r0 = (p164h.p165b.p166a.p240h.p243r.p246m.C11282h) r0
            boolean r0 = r0.mo35840y()
            r1 = 0
            if (r0 != 0) goto L_0x0029
            java.util.logging.Logger r0 = f22728f
            java.lang.String r2 = "Subscription failed, no active local callback URLs available (network disabled?)"
            r0.fine(r2)
            h.b.a.b r0 = r5.mo36173c()
            h.b.a.c r0 = r0.getConfiguration()
            java.util.concurrent.Executor r0 = r0.getRegistryListenerExecutor()
            h.b.a.i.j.i$a r2 = new h.b.a.i.j.i$a
            r2.<init>()
            r0.execute(r2)
            return r1
        L_0x0029:
            java.util.logging.Logger r0 = f22728f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Sending subscription request: "
            r2.append(r3)
            h.b.a.h.r.d r3 = r5.mo36177e()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.fine(r2)
            h.b.a.b r0 = r5.mo36173c()     // Catch:{ all -> 0x0134 }
            h.b.a.j.d r0 = r0.getRegistry()     // Catch:{ all -> 0x0134 }
            h.b.a.h.q.d r2 = r5.f22729e     // Catch:{ all -> 0x0134 }
            r0.mo24431v(r2)     // Catch:{ all -> 0x0134 }
            h.b.a.b r0 = r5.mo36173c()     // Catch:{ b -> 0x0123 }
            h.b.a.k.a r0 = r0.getRouter()     // Catch:{ b -> 0x0123 }
            h.b.a.h.r.d r2 = r5.mo36177e()     // Catch:{ b -> 0x0123 }
            h.b.a.h.r.e r0 = r0.mo24453d(r2)     // Catch:{ b -> 0x0123 }
            if (r0 != 0) goto L_0x0073
            r5.mo36220h()     // Catch:{ all -> 0x0134 }
            h.b.a.b r0 = r5.mo36173c()
            h.b.a.j.d r0 = r0.getRegistry()
            h.b.a.h.q.d r2 = r5.f22729e
            r0.mo24420m(r2)
            return r1
        L_0x0073:
            h.b.a.h.r.m.c r1 = new h.b.a.h.r.m.c     // Catch:{ all -> 0x0134 }
            r1.<init>(r0)     // Catch:{ all -> 0x0134 }
            h.b.a.h.r.h r2 = r0.mo35776k()     // Catch:{ all -> 0x0134 }
            h.b.a.h.r.j r2 = (p164h.p165b.p166a.p240h.p243r.C11252j) r2     // Catch:{ all -> 0x0134 }
            boolean r2 = r2.mo35798f()     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x00af
            java.util.logging.Logger r0 = f22728f     // Catch:{ all -> 0x0134 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r2.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r3 = "Subscription failed, response was: "
            r2.append(r3)     // Catch:{ all -> 0x0134 }
            r2.append(r1)     // Catch:{ all -> 0x0134 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0134 }
            r0.fine(r2)     // Catch:{ all -> 0x0134 }
            h.b.a.b r0 = r5.mo36173c()     // Catch:{ all -> 0x0134 }
            h.b.a.c r0 = r0.getConfiguration()     // Catch:{ all -> 0x0134 }
            java.util.concurrent.Executor r0 = r0.getRegistryListenerExecutor()     // Catch:{ all -> 0x0134 }
            h.b.a.i.j.i$b r2 = new h.b.a.i.j.i$b     // Catch:{ all -> 0x0134 }
            r2.<init>(r1)     // Catch:{ all -> 0x0134 }
        L_0x00ab:
            r0.execute(r2)     // Catch:{ all -> 0x0134 }
            goto L_0x0115
        L_0x00af:
            boolean r2 = r1.mo35835w()     // Catch:{ all -> 0x0134 }
            if (r2 != 0) goto L_0x00ce
            java.util.logging.Logger r0 = f22728f     // Catch:{ all -> 0x0134 }
            java.lang.String r2 = "Subscription failed, invalid or missing (SID, Timeout) response headers"
            r0.severe(r2)     // Catch:{ all -> 0x0134 }
            h.b.a.b r0 = r5.mo36173c()     // Catch:{ all -> 0x0134 }
            h.b.a.c r0 = r0.getConfiguration()     // Catch:{ all -> 0x0134 }
            java.util.concurrent.Executor r0 = r0.getRegistryListenerExecutor()     // Catch:{ all -> 0x0134 }
            h.b.a.i.j.i$c r2 = new h.b.a.i.j.i$c     // Catch:{ all -> 0x0134 }
            r2.<init>(r1)     // Catch:{ all -> 0x0134 }
            goto L_0x00ab
        L_0x00ce:
            java.util.logging.Logger r2 = f22728f     // Catch:{ all -> 0x0134 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r3.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = "Subscription established, adding to registry, response was: "
            r3.append(r4)     // Catch:{ all -> 0x0134 }
            r3.append(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0134 }
            r2.fine(r0)     // Catch:{ all -> 0x0134 }
            h.b.a.h.q.d r0 = r5.f22729e     // Catch:{ all -> 0x0134 }
            java.lang.String r2 = r1.mo35834v()     // Catch:{ all -> 0x0134 }
            r0.mo35726Q(r2)     // Catch:{ all -> 0x0134 }
            h.b.a.h.q.d r0 = r5.f22729e     // Catch:{ all -> 0x0134 }
            int r2 = r1.mo35833u()     // Catch:{ all -> 0x0134 }
            r0.mo35725P(r2)     // Catch:{ all -> 0x0134 }
            h.b.a.b r0 = r5.mo36173c()     // Catch:{ all -> 0x0134 }
            h.b.a.j.d r0 = r0.getRegistry()     // Catch:{ all -> 0x0134 }
            h.b.a.h.q.d r2 = r5.f22729e     // Catch:{ all -> 0x0134 }
            r0.mo24400A(r2)     // Catch:{ all -> 0x0134 }
            h.b.a.b r0 = r5.mo36173c()     // Catch:{ all -> 0x0134 }
            h.b.a.c r0 = r0.getConfiguration()     // Catch:{ all -> 0x0134 }
            java.util.concurrent.Executor r0 = r0.getRegistryListenerExecutor()     // Catch:{ all -> 0x0134 }
            h.b.a.i.j.i$d r2 = new h.b.a.i.j.i$d     // Catch:{ all -> 0x0134 }
            r2.<init>()     // Catch:{ all -> 0x0134 }
            goto L_0x00ab
        L_0x0115:
            h.b.a.b r0 = r5.mo36173c()
            h.b.a.j.d r0 = r0.getRegistry()
            h.b.a.h.q.d r2 = r5.f22729e
            r0.mo24420m(r2)
            return r1
        L_0x0123:
            r5.mo36220h()     // Catch:{ all -> 0x0134 }
            h.b.a.b r0 = r5.mo36173c()
            h.b.a.j.d r0 = r0.getRegistry()
            h.b.a.h.q.d r2 = r5.f22729e
            r0.mo24420m(r2)
            return r1
        L_0x0134:
            r0 = move-exception
            h.b.a.b r1 = r5.mo36173c()
            h.b.a.j.d r1 = r1.getRegistry()
            h.b.a.h.q.d r2 = r5.f22729e
            r1.mo24420m(r2)
            goto L_0x0144
        L_0x0143:
            throw r0
        L_0x0144:
            goto L_0x0143
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p168i.p255j.C11427i.mo36176d():h.b.a.h.r.m.c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo36220h() {
        f22728f.fine("Subscription failed");
        mo36173c().getConfiguration().getRegistryListenerExecutor().execute(new C11432e());
    }
}
