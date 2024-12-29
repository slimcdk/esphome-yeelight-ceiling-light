package p164h.p165b.p166a.p168i.p255j;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11405h;
import p164h.p165b.p166a.p170k.C11451b;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.p241p.C11229c;
import p164h.p165b.p166a.p240h.p241p.C11230d;
import p164h.p165b.p166a.p240h.p241p.C11232f;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.p244k.C11258e;
import p164h.p165b.p166a.p240h.p243r.p244k.C11259f;
import p164h.p165b.p166a.p240h.p252w.C11386n;
import p164h.p257c.p259b.C11495a;

/* renamed from: h.b.a.i.j.f */
public class C11421f extends C11405h<C11259f, C11258e> {

    /* renamed from: f */
    private static final Logger f22715f = Logger.getLogger(C11421f.class.getName());

    /* renamed from: e */
    protected final C11232f f22716e;

    public C11421f(C4423b bVar, C11232f fVar, URL url) {
        super(bVar, new C11259f(fVar, url));
        this.f22716e = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C11258e mo36176d() {
        return mo36212j((C11259f) mo36177e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo36210h(C11258e eVar) {
        try {
            Logger logger = f22715f;
            logger.fine("Received response for outgoing call, reading SOAP response body: " + eVar);
            mo36173c().getConfiguration().getSoapActionProcessor().mo24491a(eVar, this.f22716e);
        } catch (C11221k e) {
            Logger logger2 = f22715f;
            logger2.fine("Error reading SOAP body: " + e);
            f22715f.log(Level.FINE, "Exception root cause: ", C11495a.m30173a(e));
            C11386n nVar = C11386n.ACTION_FAILED;
            throw new C11230d(nVar, "Error reading SOAP response message. " + e.getMessage(), false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo36211i(C11258e eVar) {
        try {
            f22715f.fine("Received response with Internal Server Error, reading SOAP failure message");
            mo36173c().getConfiguration().getSoapActionProcessor().mo24491a(eVar, this.f22716e);
        } catch (C11221k e) {
            Logger logger = f22715f;
            logger.fine("Error reading SOAP body: " + e);
            f22715f.log(Level.FINE, "Exception root cause: ", C11495a.m30173a(e));
            C11386n nVar = C11386n.ACTION_FAILED;
            throw new C11230d(nVar, "Error reading SOAP response failure message. " + e.getMessage(), false);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d8  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p164h.p165b.p166a.p240h.p243r.p244k.C11258e mo36212j(p164h.p165b.p166a.p240h.p243r.p244k.C11259f r5) {
        /*
            r4 = this;
            h.b.a.h.p.f r0 = r4.f22716e
            h.b.a.h.s.a r0 = r0.mo35700a()
            h.b.a.h.s.o r0 = r0.mo35859g()
            h.b.a.h.s.c r0 = r0.mo35983d()
            java.util.logging.Logger r1 = f22715f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Sending outgoing action call '"
            r2.append(r3)
            h.b.a.h.p.f r3 = r4.f22716e
            h.b.a.h.s.a r3 = r3.mo35700a()
            java.lang.String r3 = r3.mo35856d()
            r2.append(r3)
            java.lang.String r3 = "' to remote service of: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.fine(r0)
            r0 = 0
            h.b.a.h.r.e r5 = r4.mo36213k(r5)     // Catch:{ d -> 0x00a8 }
            if (r5 != 0) goto L_0x0053
            java.util.logging.Logger r5 = f22715f     // Catch:{ d -> 0x00a8 }
            java.lang.String r1 = "No connection or no no response received, returning null"
            r5.fine(r1)     // Catch:{ d -> 0x00a8 }
            h.b.a.h.p.f r5 = r4.f22716e     // Catch:{ d -> 0x00a8 }
            h.b.a.h.p.d r1 = new h.b.a.h.p.d     // Catch:{ d -> 0x00a8 }
            h.b.a.h.w.n r2 = p164h.p165b.p166a.p240h.p252w.C11386n.ACTION_FAILED     // Catch:{ d -> 0x00a8 }
            java.lang.String r3 = "Connection error or no response received"
            r1.<init>((p164h.p165b.p166a.p240h.p252w.C11386n) r2, (java.lang.String) r3)     // Catch:{ d -> 0x00a8 }
            r5.mo35709j(r1)     // Catch:{ d -> 0x00a8 }
            return r0
        L_0x0053:
            h.b.a.h.r.k.e r1 = new h.b.a.h.r.k.e     // Catch:{ d -> 0x00a8 }
            r1.<init>((p164h.p165b.p166a.p240h.p243r.C11244e) r5)     // Catch:{ d -> 0x00a8 }
            boolean r5 = r1.mo35807u()     // Catch:{ d -> 0x00a5 }
            if (r5 != 0) goto L_0x006c
            boolean r5 = r1.mo35808v()     // Catch:{ d -> 0x00a5 }
            if (r5 == 0) goto L_0x0068
            r4.mo36211i(r1)     // Catch:{ d -> 0x00a5 }
            goto L_0x006b
        L_0x0068:
            r4.mo36210h(r1)     // Catch:{ d -> 0x00a5 }
        L_0x006b:
            return r1
        L_0x006c:
            java.util.logging.Logger r5 = f22715f     // Catch:{ d -> 0x00a5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ d -> 0x00a5 }
            r0.<init>()     // Catch:{ d -> 0x00a5 }
            java.lang.String r2 = "Response was a non-recoverable failure: "
            r0.append(r2)     // Catch:{ d -> 0x00a5 }
            r0.append(r1)     // Catch:{ d -> 0x00a5 }
            java.lang.String r0 = r0.toString()     // Catch:{ d -> 0x00a5 }
            r5.fine(r0)     // Catch:{ d -> 0x00a5 }
            h.b.a.h.p.d r5 = new h.b.a.h.p.d     // Catch:{ d -> 0x00a5 }
            h.b.a.h.w.n r0 = p164h.p165b.p166a.p240h.p252w.C11386n.ACTION_FAILED     // Catch:{ d -> 0x00a5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ d -> 0x00a5 }
            r2.<init>()     // Catch:{ d -> 0x00a5 }
            java.lang.String r3 = "Non-recoverable remote execution failure: "
            r2.append(r3)     // Catch:{ d -> 0x00a5 }
            h.b.a.h.r.h r3 = r1.mo35776k()     // Catch:{ d -> 0x00a5 }
            h.b.a.h.r.j r3 = (p164h.p165b.p166a.p240h.p243r.C11252j) r3     // Catch:{ d -> 0x00a5 }
            java.lang.String r3 = r3.mo35795c()     // Catch:{ d -> 0x00a5 }
            r2.append(r3)     // Catch:{ d -> 0x00a5 }
            java.lang.String r2 = r2.toString()     // Catch:{ d -> 0x00a5 }
            r5.<init>((p164h.p165b.p166a.p240h.p252w.C11386n) r0, (java.lang.String) r2)     // Catch:{ d -> 0x00a5 }
            throw r5     // Catch:{ d -> 0x00a5 }
        L_0x00a5:
            r5 = move-exception
            r0 = r1
            goto L_0x00a9
        L_0x00a8:
            r5 = move-exception
        L_0x00a9:
            java.util.logging.Logger r1 = f22715f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Remote action invocation failed, returning Internal Server Error message: "
            r2.append(r3)
            java.lang.String r3 = r5.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.fine(r2)
            h.b.a.h.p.f r1 = r4.f22716e
            r1.mo35709j(r5)
            if (r0 == 0) goto L_0x00d8
            h.b.a.h.r.h r5 = r0.mo35776k()
            h.b.a.h.r.j r5 = (p164h.p165b.p166a.p240h.p243r.C11252j) r5
            boolean r5 = r5.mo35798f()
            if (r5 != 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00d7:
            return r0
        L_0x00d8:
            h.b.a.h.r.k.e r5 = new h.b.a.h.r.k.e
            h.b.a.h.r.j r0 = new h.b.a.h.r.j
            h.b.a.h.r.j$a r1 = p164h.p165b.p166a.p240h.p243r.C11252j.C11253a.INTERNAL_SERVER_ERROR
            r0.<init>(r1)
            r5.<init>((p164h.p165b.p166a.p240h.p243r.C11252j) r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p168i.p255j.C11421f.mo36212j(h.b.a.h.r.k.f):h.b.a.h.r.k.e");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C11244e mo36213k(C11259f fVar) {
        try {
            Logger logger = f22715f;
            logger.fine("Writing SOAP request body of: " + fVar);
            mo36173c().getConfiguration().getSoapActionProcessor().mo24499c(fVar, this.f22716e);
            f22715f.fine("Sending SOAP body of message as stream to remote device");
            return mo36173c().getRouter().mo24453d(fVar);
        } catch (C11451b e) {
            Throwable a = C11495a.m30173a(e);
            if (a instanceof InterruptedException) {
                if (f22715f.isLoggable(Level.FINE)) {
                    Logger logger2 = f22715f;
                    logger2.fine("Sending action request message was interrupted: " + a);
                }
                throw new C11229c((InterruptedException) a);
            }
            throw e;
        } catch (C11221k e2) {
            if (f22715f.isLoggable(Level.FINE)) {
                Logger logger3 = f22715f;
                logger3.fine("Error writing SOAP body: " + e2);
                f22715f.log(Level.FINE, "Exception root cause: ", C11495a.m30173a(e2));
            }
            C11386n nVar = C11386n.ACTION_FAILED;
            throw new C11230d(nVar, "Error writing request message. " + e2.getMessage());
        }
    }
}
