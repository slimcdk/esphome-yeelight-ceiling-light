package p240z6;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionCancelledException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.transport.RouterException;
import org.seamless.util.C10243a;
import p193o6.C9792d;
import p204q6.C10289e;
import p204q6.C10290f;
import p230x6.C12009f;

/* renamed from: z6.f */
public class C12203f extends C12009f<C10290f, C10289e> {

    /* renamed from: f */
    private static final Logger f22536f = Logger.getLogger(C12203f.class.getName());

    /* renamed from: e */
    protected final C9792d f22537e;

    public C12203f(C10010b bVar, C9792d dVar, URL url) {
        super(bVar, new C10290f(dVar, url));
        this.f22537e = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C10289e mo42620d() {
        return mo43200j((C10290f) mo42621e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo43198h(C10289e eVar) {
        try {
            Logger logger = f22536f;
            logger.fine("Received response for outgoing call, reading SOAP response body: " + eVar);
            mo42617c().getConfiguration().getSoapActionProcessor().mo24995c(eVar, this.f22537e);
        } catch (UnsupportedDataException e) {
            Logger logger2 = f22536f;
            logger2.fine("Error reading SOAP body: " + e);
            logger2.log(Level.FINE, "Exception root cause: ", C10243a.m25753a(e));
            ErrorCode errorCode = ErrorCode.ACTION_FAILED;
            throw new ActionException(errorCode, "Error reading SOAP response message. " + e.getMessage(), false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo43199i(C10289e eVar) {
        try {
            f22536f.fine("Received response with Internal Server Error, reading SOAP failure message");
            mo42617c().getConfiguration().getSoapActionProcessor().mo24995c(eVar, this.f22537e);
        } catch (UnsupportedDataException e) {
            Logger logger = f22536f;
            logger.fine("Error reading SOAP body: " + e);
            logger.log(Level.FINE, "Exception root cause: ", C10243a.m25753a(e));
            ErrorCode errorCode = ErrorCode.ACTION_FAILED;
            throw new ActionException(errorCode, "Error reading SOAP response failure message. " + e.getMessage(), false);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d4  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p204q6.C10289e mo43200j(p204q6.C10290f r5) {
        /*
            r4 = this;
            o6.d r0 = r4.f22537e
            org.fourthline.cling.model.meta.a r0 = r0.mo38967a()
            org.fourthline.cling.model.meta.e r0 = r0.mo40477g()
            org.fourthline.cling.model.meta.b r0 = r0.mo40531d()
            java.util.logging.Logger r1 = f22536f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Sending outgoing action call '"
            r2.append(r3)
            o6.d r3 = r4.f22537e
            org.fourthline.cling.model.meta.a r3 = r3.mo38967a()
            java.lang.String r3 = r3.mo40474d()
            r2.append(r3)
            java.lang.String r3 = "' to remote service of: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.fine(r0)
            r0 = 0
            org.fourthline.cling.model.message.e r5 = r4.mo43201k(r5)     // Catch:{ ActionException -> 0x00a4 }
            if (r5 != 0) goto L_0x0051
            java.lang.String r5 = "No connection or no no response received, returning null"
            r1.fine(r5)     // Catch:{ ActionException -> 0x00a4 }
            o6.d r5 = r4.f22537e     // Catch:{ ActionException -> 0x00a4 }
            org.fourthline.cling.model.action.ActionException r1 = new org.fourthline.cling.model.action.ActionException     // Catch:{ ActionException -> 0x00a4 }
            org.fourthline.cling.model.types.ErrorCode r2 = org.fourthline.cling.model.types.ErrorCode.ACTION_FAILED     // Catch:{ ActionException -> 0x00a4 }
            java.lang.String r3 = "Connection error or no response received"
            r1.<init>((org.fourthline.cling.model.types.ErrorCode) r2, (java.lang.String) r3)     // Catch:{ ActionException -> 0x00a4 }
            r5.mo38976j(r1)     // Catch:{ ActionException -> 0x00a4 }
            return r0
        L_0x0051:
            q6.e r2 = new q6.e     // Catch:{ ActionException -> 0x00a4 }
            r2.<init>((org.fourthline.cling.model.message.C10031e) r5)     // Catch:{ ActionException -> 0x00a4 }
            boolean r5 = r2.mo41808u()     // Catch:{ ActionException -> 0x00a1 }
            if (r5 != 0) goto L_0x006a
            boolean r5 = r2.mo41809v()     // Catch:{ ActionException -> 0x00a1 }
            if (r5 == 0) goto L_0x0066
            r4.mo43199i(r2)     // Catch:{ ActionException -> 0x00a1 }
            goto L_0x0069
        L_0x0066:
            r4.mo43198h(r2)     // Catch:{ ActionException -> 0x00a1 }
        L_0x0069:
            return r2
        L_0x006a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ActionException -> 0x00a1 }
            r5.<init>()     // Catch:{ ActionException -> 0x00a1 }
            java.lang.String r0 = "Response was a non-recoverable failure: "
            r5.append(r0)     // Catch:{ ActionException -> 0x00a1 }
            r5.append(r2)     // Catch:{ ActionException -> 0x00a1 }
            java.lang.String r5 = r5.toString()     // Catch:{ ActionException -> 0x00a1 }
            r1.fine(r5)     // Catch:{ ActionException -> 0x00a1 }
            org.fourthline.cling.model.action.ActionException r5 = new org.fourthline.cling.model.action.ActionException     // Catch:{ ActionException -> 0x00a1 }
            org.fourthline.cling.model.types.ErrorCode r0 = org.fourthline.cling.model.types.ErrorCode.ACTION_FAILED     // Catch:{ ActionException -> 0x00a1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ActionException -> 0x00a1 }
            r1.<init>()     // Catch:{ ActionException -> 0x00a1 }
            java.lang.String r3 = "Non-recoverable remote execution failure: "
            r1.append(r3)     // Catch:{ ActionException -> 0x00a1 }
            org.fourthline.cling.model.message.g r3 = r2.mo40404k()     // Catch:{ ActionException -> 0x00a1 }
            org.fourthline.cling.model.message.UpnpResponse r3 = (org.fourthline.cling.model.message.UpnpResponse) r3     // Catch:{ ActionException -> 0x00a1 }
            java.lang.String r3 = r3.mo40421c()     // Catch:{ ActionException -> 0x00a1 }
            r1.append(r3)     // Catch:{ ActionException -> 0x00a1 }
            java.lang.String r1 = r1.toString()     // Catch:{ ActionException -> 0x00a1 }
            r5.<init>((org.fourthline.cling.model.types.ErrorCode) r0, (java.lang.String) r1)     // Catch:{ ActionException -> 0x00a1 }
            throw r5     // Catch:{ ActionException -> 0x00a1 }
        L_0x00a1:
            r5 = move-exception
            r0 = r2
            goto L_0x00a5
        L_0x00a4:
            r5 = move-exception
        L_0x00a5:
            java.util.logging.Logger r1 = f22536f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Remote action invocation failed, returning Internal Server Error message: "
            r2.append(r3)
            java.lang.String r3 = r5.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.fine(r2)
            o6.d r1 = r4.f22537e
            r1.mo38976j(r5)
            if (r0 == 0) goto L_0x00d4
            org.fourthline.cling.model.message.g r5 = r0.mo40404k()
            org.fourthline.cling.model.message.UpnpResponse r5 = (org.fourthline.cling.model.message.UpnpResponse) r5
            boolean r5 = r5.mo40424f()
            if (r5 != 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            return r0
        L_0x00d4:
            q6.e r5 = new q6.e
            org.fourthline.cling.model.message.UpnpResponse r0 = new org.fourthline.cling.model.message.UpnpResponse
            org.fourthline.cling.model.message.UpnpResponse$Status r1 = org.fourthline.cling.model.message.UpnpResponse.Status.INTERNAL_SERVER_ERROR
            r0.<init>(r1)
            r5.<init>((org.fourthline.cling.model.message.UpnpResponse) r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p240z6.C12203f.mo43200j(q6.f):q6.e");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C10031e mo43201k(C10290f fVar) {
        try {
            Logger logger = f22536f;
            logger.fine("Writing SOAP request body of: " + fVar);
            mo42617c().getConfiguration().getSoapActionProcessor().mo36804b(fVar, this.f22537e);
            logger.fine("Sending SOAP body of message as stream to remote device");
            return mo42617c().getRouter().mo24969d(fVar);
        } catch (RouterException e) {
            Throwable a = C10243a.m25753a(e);
            if (a instanceof InterruptedException) {
                Logger logger2 = f22536f;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine("Sending action request message was interrupted: " + a);
                }
                throw new ActionCancelledException((InterruptedException) a);
            }
            throw e;
        } catch (UnsupportedDataException e2) {
            Logger logger3 = f22536f;
            Level level = Level.FINE;
            if (logger3.isLoggable(level)) {
                logger3.fine("Error writing SOAP body: " + e2);
                logger3.log(level, "Exception root cause: ", C10243a.m25753a(e2));
            }
            ErrorCode errorCode = ErrorCode.ACTION_FAILED;
            throw new ActionException(errorCode, "Error writing request message. " + e2.getMessage());
        }
    }
}
