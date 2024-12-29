package p240z6;

import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.C10020h;
import org.fourthline.cling.model.message.UpnpResponse;
import p200p6.C10277c;
import p210s6.C10375c;
import p210s6.C10380h;
import p214t6.C10409i;
import p230x6.C12009f;

/* renamed from: z6.i */
public class C12209i extends C12009f<C10380h, C10375c> {

    /* renamed from: f */
    private static final Logger f22549f = Logger.getLogger(C12209i.class.getName());

    /* renamed from: e */
    protected final C10277c f22550e;

    /* renamed from: z6.i$a */
    class C12210a implements Runnable {
        C12210a() {
        }

        public void run() {
            C12209i.this.f22550e.mo41783R((UpnpResponse) null);
        }
    }

    /* renamed from: z6.i$b */
    class C12211b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10375c f22552a;

        C12211b(C10375c cVar) {
            this.f22552a = cVar;
        }

        public void run() {
            C12209i.this.f22550e.mo41783R((UpnpResponse) this.f22552a.mo40404k());
        }
    }

    /* renamed from: z6.i$c */
    class C12212c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10375c f22554a;

        C12212c(C10375c cVar) {
            this.f22554a = cVar;
        }

        public void run() {
            C12209i.this.f22550e.mo41783R((UpnpResponse) this.f22554a.mo40404k());
        }
    }

    /* renamed from: z6.i$d */
    class C12213d implements Runnable {
        C12213d() {
        }

        public void run() {
            C12209i.this.f22550e.mo41782P();
        }
    }

    /* renamed from: z6.i$e */
    class C12214e implements Runnable {
        C12214e() {
        }

        public void run() {
            C12209i.this.f22550e.mo41783R((UpnpResponse) null);
        }
    }

    public C12209i(C10010b bVar, C10277c cVar, List<C10020h> list) {
        super(bVar, new C10380h(cVar, cVar.mo41784T(list, bVar.getConfiguration().getNamespace()), bVar.getConfiguration().getEventSubscriptionHeaders((C10409i) cVar.mo41766J())));
        this.f22550e = cVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        mo43208h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0120, code lost:
        mo42617c().getRegistry().mo24921F(r5.f22550e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x012d, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x011d */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p210s6.C10375c mo42620d() {
        /*
            r5 = this;
            org.fourthline.cling.model.message.d r0 = r5.mo42621e()
            s6.h r0 = (p210s6.C10380h) r0
            boolean r0 = r0.mo41979y()
            r1 = 0
            if (r0 != 0) goto L_0x0029
            java.util.logging.Logger r0 = f22549f
            java.lang.String r2 = "Subscription failed, no active local callback URLs available (network disabled?)"
            r0.fine(r2)
            org.fourthline.cling.b r0 = r5.mo42617c()
            org.fourthline.cling.c r0 = r0.getConfiguration()
            java.util.concurrent.Executor r0 = r0.getRegistryListenerExecutor()
            z6.i$a r2 = new z6.i$a
            r2.<init>()
            r0.execute(r2)
            return r1
        L_0x0029:
            java.util.logging.Logger r0 = f22549f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Sending subscription request: "
            r2.append(r3)
            org.fourthline.cling.model.message.d r3 = r5.mo42621e()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.fine(r2)
            org.fourthline.cling.b r2 = r5.mo42617c()     // Catch:{ all -> 0x012e }
            a7.b r2 = r2.getRegistry()     // Catch:{ all -> 0x012e }
            p6.c r3 = r5.f22550e     // Catch:{ all -> 0x012e }
            r2.mo24919D(r3)     // Catch:{ all -> 0x012e }
            org.fourthline.cling.b r2 = r5.mo42617c()     // Catch:{ RouterException -> 0x011d }
            b7.a r2 = r2.getRouter()     // Catch:{ RouterException -> 0x011d }
            org.fourthline.cling.model.message.d r3 = r5.mo42621e()     // Catch:{ RouterException -> 0x011d }
            org.fourthline.cling.model.message.e r2 = r2.mo24969d(r3)     // Catch:{ RouterException -> 0x011d }
            if (r2 != 0) goto L_0x0073
            r5.mo43208h()     // Catch:{ all -> 0x012e }
            org.fourthline.cling.b r0 = r5.mo42617c()
            a7.b r0 = r0.getRegistry()
            p6.c r2 = r5.f22550e
            r0.mo24921F(r2)
            return r1
        L_0x0073:
            s6.c r1 = new s6.c     // Catch:{ all -> 0x012e }
            r1.<init>(r2)     // Catch:{ all -> 0x012e }
            org.fourthline.cling.model.message.g r3 = r2.mo40404k()     // Catch:{ all -> 0x012e }
            org.fourthline.cling.model.message.UpnpResponse r3 = (org.fourthline.cling.model.message.UpnpResponse) r3     // Catch:{ all -> 0x012e }
            boolean r3 = r3.mo40424f()     // Catch:{ all -> 0x012e }
            if (r3 == 0) goto L_0x00ad
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012e }
            r2.<init>()     // Catch:{ all -> 0x012e }
            java.lang.String r3 = "Subscription failed, response was: "
            r2.append(r3)     // Catch:{ all -> 0x012e }
            r2.append(r1)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x012e }
            r0.fine(r2)     // Catch:{ all -> 0x012e }
            org.fourthline.cling.b r0 = r5.mo42617c()     // Catch:{ all -> 0x012e }
            org.fourthline.cling.c r0 = r0.getConfiguration()     // Catch:{ all -> 0x012e }
            java.util.concurrent.Executor r0 = r0.getRegistryListenerExecutor()     // Catch:{ all -> 0x012e }
            z6.i$b r2 = new z6.i$b     // Catch:{ all -> 0x012e }
            r2.<init>(r1)     // Catch:{ all -> 0x012e }
        L_0x00a9:
            r0.execute(r2)     // Catch:{ all -> 0x012e }
            goto L_0x010f
        L_0x00ad:
            boolean r3 = r1.mo41974w()     // Catch:{ all -> 0x012e }
            if (r3 != 0) goto L_0x00ca
            java.lang.String r2 = "Subscription failed, invalid or missing (SID, Timeout) response headers"
            r0.severe(r2)     // Catch:{ all -> 0x012e }
            org.fourthline.cling.b r0 = r5.mo42617c()     // Catch:{ all -> 0x012e }
            org.fourthline.cling.c r0 = r0.getConfiguration()     // Catch:{ all -> 0x012e }
            java.util.concurrent.Executor r0 = r0.getRegistryListenerExecutor()     // Catch:{ all -> 0x012e }
            z6.i$c r2 = new z6.i$c     // Catch:{ all -> 0x012e }
            r2.<init>(r1)     // Catch:{ all -> 0x012e }
            goto L_0x00a9
        L_0x00ca:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012e }
            r3.<init>()     // Catch:{ all -> 0x012e }
            java.lang.String r4 = "Subscription established, adding to registry, response was: "
            r3.append(r4)     // Catch:{ all -> 0x012e }
            r3.append(r2)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x012e }
            r0.fine(r2)     // Catch:{ all -> 0x012e }
            p6.c r0 = r5.f22550e     // Catch:{ all -> 0x012e }
            java.lang.String r2 = r1.mo41973v()     // Catch:{ all -> 0x012e }
            r0.mo41769M(r2)     // Catch:{ all -> 0x012e }
            p6.c r0 = r5.f22550e     // Catch:{ all -> 0x012e }
            int r2 = r1.mo41972u()     // Catch:{ all -> 0x012e }
            r0.mo41768L(r2)     // Catch:{ all -> 0x012e }
            org.fourthline.cling.b r0 = r5.mo42617c()     // Catch:{ all -> 0x012e }
            a7.b r0 = r0.getRegistry()     // Catch:{ all -> 0x012e }
            p6.c r2 = r5.f22550e     // Catch:{ all -> 0x012e }
            r0.mo24950o(r2)     // Catch:{ all -> 0x012e }
            org.fourthline.cling.b r0 = r5.mo42617c()     // Catch:{ all -> 0x012e }
            org.fourthline.cling.c r0 = r0.getConfiguration()     // Catch:{ all -> 0x012e }
            java.util.concurrent.Executor r0 = r0.getRegistryListenerExecutor()     // Catch:{ all -> 0x012e }
            z6.i$d r2 = new z6.i$d     // Catch:{ all -> 0x012e }
            r2.<init>()     // Catch:{ all -> 0x012e }
            goto L_0x00a9
        L_0x010f:
            org.fourthline.cling.b r0 = r5.mo42617c()
            a7.b r0 = r0.getRegistry()
            p6.c r2 = r5.f22550e
            r0.mo24921F(r2)
            return r1
        L_0x011d:
            r5.mo43208h()     // Catch:{ all -> 0x012e }
            org.fourthline.cling.b r0 = r5.mo42617c()
            a7.b r0 = r0.getRegistry()
            p6.c r2 = r5.f22550e
            r0.mo24921F(r2)
            return r1
        L_0x012e:
            r0 = move-exception
            org.fourthline.cling.b r1 = r5.mo42617c()
            a7.b r1 = r1.getRegistry()
            p6.c r2 = r5.f22550e
            r1.mo24921F(r2)
            goto L_0x013e
        L_0x013d:
            throw r0
        L_0x013e:
            goto L_0x013d
        */
        throw new UnsupportedOperationException("Method not decompiled: p240z6.C12209i.mo42620d():s6.c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo43208h() {
        f22549f.fine("Subscription failed");
        mo42617c().getConfiguration().getRegistryListenerExecutor().execute(new C12214e());
    }
}
