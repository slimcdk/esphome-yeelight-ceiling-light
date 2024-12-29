package p074n6;

import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.message.UpnpResponse;
import p193o6.C9792d;

/* renamed from: n6.a */
public abstract class C9738a implements Runnable {

    /* renamed from: a */
    protected final C9792d f17568a;

    /* renamed from: b */
    protected C9739b f17569b;

    protected C9738a(C9792d dVar) {
        this.f17568a = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo38916b(C9792d dVar, UpnpResponse upnpResponse) {
        ActionException c = dVar.mo38969c();
        String str = "Error: ";
        if (c != null) {
            str = str + c.getMessage();
        }
        if (upnpResponse == null) {
            return str;
        }
        return str + " (HTTP response was: " + upnpResponse.mo40421c() + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo38917c(C9792d dVar, UpnpResponse upnpResponse) {
        mo35278d(dVar, upnpResponse, mo38916b(dVar, upnpResponse));
    }

    /* renamed from: d */
    public abstract void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str);

    /* renamed from: e */
    public synchronized C9739b mo38918e() {
        return this.f17569b;
    }

    /* renamed from: f */
    public synchronized C9738a mo38919f(C9739b bVar) {
        this.f17569b = bVar;
        return this;
    }

    /* renamed from: g */
    public abstract void mo35279g(C9792d dVar);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r5.f17568a.mo38969c() != null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            o6.d r0 = r5.f17568a
            org.fourthline.cling.model.meta.a r0 = r0.mo38967a()
            org.fourthline.cling.model.meta.e r0 = r0.mo40477g()
            boolean r1 = r0 instanceof p214t6.C10404d
            r2 = 0
            if (r1 == 0) goto L_0x0029
            t6.d r0 = (p214t6.C10404d) r0
            o6.d r1 = r5.f17568a
            org.fourthline.cling.model.meta.a r1 = r1.mo38967a()
            o6.c r0 = r0.mo42074p(r1)
            o6.d r1 = r5.f17568a
            r0.mo38959a(r1)
            o6.d r0 = r5.f17568a
            org.fourthline.cling.model.action.ActionException r0 = r0.mo38969c()
            if (r0 == 0) goto L_0x007a
            goto L_0x005c
        L_0x0029:
            boolean r1 = r0 instanceof p214t6.C10409i
            if (r1 == 0) goto L_0x00a3
            n6.b r1 = r5.mo38918e()
            if (r1 == 0) goto L_0x009b
            t6.i r0 = (p214t6.C10409i) r0
            org.fourthline.cling.model.meta.b r1 = r0.mo40531d()     // Catch:{ IllegalArgumentException -> 0x0080 }
            t6.g r1 = (p214t6.C10407g) r1     // Catch:{ IllegalArgumentException -> 0x0080 }
            java.net.URI r3 = r0.mo42100n()     // Catch:{ IllegalArgumentException -> 0x0080 }
            java.net.URL r0 = r1.mo42094N(r3)     // Catch:{ IllegalArgumentException -> 0x0080 }
            n6.b r1 = r5.mo38918e()
            x6.a r1 = r1.getProtocolFactory()
            o6.d r3 = r5.f17568a
            z6.f r0 = r1.mo24904j(r3, r0)
            r0.run()
            org.fourthline.cling.model.message.e r0 = r0.mo42622f()
            q6.e r0 = (p204q6.C10289e) r0
            if (r0 != 0) goto L_0x0062
        L_0x005c:
            o6.d r0 = r5.f17568a
            r5.mo38917c(r0, r2)
            goto L_0x00a3
        L_0x0062:
            org.fourthline.cling.model.message.g r1 = r0.mo40404k()
            org.fourthline.cling.model.message.UpnpResponse r1 = (org.fourthline.cling.model.message.UpnpResponse) r1
            boolean r1 = r1.mo40424f()
            if (r1 == 0) goto L_0x007a
            o6.d r1 = r5.f17568a
            org.fourthline.cling.model.message.g r0 = r0.mo40404k()
            org.fourthline.cling.model.message.UpnpResponse r0 = (org.fourthline.cling.model.message.UpnpResponse) r0
            r5.mo38917c(r1, r0)
            goto L_0x00a3
        L_0x007a:
            o6.d r0 = r5.f17568a
            r5.mo35279g(r0)
            goto L_0x00a3
        L_0x0080:
            o6.d r1 = r5.f17568a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "bad control URL: "
            r3.append(r4)
            java.net.URI r0 = r0.mo42100n()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r5.mo35278d(r1, r2, r0)
            return
        L_0x009b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Callback must be executed through ControlPoint"
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p074n6.C9738a.run():void");
    }

    public String toString() {
        return "(ActionCallback) " + this.f17568a;
    }
}
