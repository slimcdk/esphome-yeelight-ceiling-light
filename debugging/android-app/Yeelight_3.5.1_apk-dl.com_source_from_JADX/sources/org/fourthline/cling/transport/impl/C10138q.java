package org.fourthline.cling.transport.impl;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLStreamHandlerFactory;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.C10032f;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.spi.InitializationException;
import p148d7.C8960j;
import p158f7.C9046b;
import p163g7.C9090c;

/* renamed from: org.fourthline.cling.transport.impl.q */
public class C10138q implements C8960j {

    /* renamed from: b */
    private static final Logger f18731b = Logger.getLogger(C8960j.class.getName());

    /* renamed from: a */
    protected final C10137p f18732a;

    public C10138q(C10137p pVar) {
        this.f18732a = pVar;
        if (C10018f.f18493b || C10018f.f18492a) {
            throw new InitializationException("This client does not work on Android. The design of HttpURLConnection is broken, we can not add additional 'permitted' HTTP methods. Read the Cling manual.");
        }
        Logger logger = f18731b;
        logger.fine("Using persistent HTTP stream client connections: " + pVar.mo40795e());
        System.setProperty("http.keepAlive", Boolean.toString(pVar.mo40795e()));
        if (System.getProperty("hackStreamHandlerProperty") == null) {
            logger.fine("Setting custom static URLStreamHandlerFactory to work around bad JDK defaults");
            try {
                URL.setURLStreamHandlerFactory((URLStreamHandlerFactory) Class.forName("org.fourthline.cling.transport.impl.f").newInstance());
                System.setProperty("hackStreamHandlerProperty", "alreadyWorkedAroundTheEvilJDK");
            } catch (Throwable unused) {
                throw new InitializationException("Failed to set modified URLStreamHandlerFactory in this environment. Can't use bundled default client based on HTTPURLConnection, see manual.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0128, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r0 = f18731b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0131, code lost:
        if (r0.isLoggable(java.util.logging.Level.FINE) != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0133, code lost:
        r0.fine("Could not read error stream: " + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0147, code lost:
        r3.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016d, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016e, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0171, code lost:
        r4.disconnect();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x0088, B:36:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ac A[SYNTHETIC, Splitter:B:21:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cc A[SYNTHETIC, Splitter:B:26:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0088=Splitter:B:13:0x0088, B:49:0x014d=Splitter:B:49:0x014d} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.fourthline.cling.model.message.C10031e mo36781a(org.fourthline.cling.model.message.C10030d r8) {
        /*
            r7 = this;
            java.lang.String r0 = "HTTP request failed: "
            org.fourthline.cling.model.message.g r1 = r8.mo40404k()
            org.fourthline.cling.model.message.UpnpRequest r1 = (org.fourthline.cling.model.message.UpnpRequest) r1
            java.util.logging.Logger r2 = f18731b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Preparing HTTP request message with method '"
            r3.append(r4)
            java.lang.String r4 = r1.mo40415c()
            r3.append(r4)
            java.lang.String r4 = "': "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2.fine(r3)
            java.net.URI r3 = r1.mo40417e()
            java.net.URL r3 = org.seamless.util.URIUtil.m25752e(r3)
            r4 = 0
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ ProtocolException -> 0x014b, IOException -> 0x00a8, Exception -> 0x0086, all -> 0x0083 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ ProtocolException -> 0x014b, IOException -> 0x00a8, Exception -> 0x0086, all -> 0x0083 }
            java.lang.String r1 = r1.mo40415c()     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            r3.setRequestMethod(r1)     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            org.fourthline.cling.transport.impl.p r1 = r7.f18732a     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            int r1 = r1.mo36783a()     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            int r1 = r1 * 1000
            r3.setReadTimeout(r1)     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            org.fourthline.cling.transport.impl.p r1 = r7.f18732a     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            int r1 = r1.mo36783a()     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            int r1 = r1 * 1000
            r3.setConnectTimeout(r1)     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            r7.mo40798d(r3, r8)     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            r7.mo40797c(r3, r8)     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            r1.<init>()     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            java.lang.String r5 = "Sending HTTP request: "
            r1.append(r5)     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            r1.append(r8)     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            java.lang.String r1 = r1.toString()     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            r2.fine(r1)     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            java.io.InputStream r1 = r3.getInputStream()     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            org.fourthline.cling.model.message.e r8 = r7.mo40799e(r3, r1)     // Catch:{ ProtocolException -> 0x0080, IOException -> 0x007e, Exception -> 0x007c }
            r3.disconnect()
            return r8
        L_0x007c:
            r1 = move-exception
            goto L_0x0088
        L_0x007e:
            r1 = move-exception
            goto L_0x00aa
        L_0x0080:
            r1 = move-exception
            goto L_0x014d
        L_0x0083:
            r8 = move-exception
            goto L_0x016f
        L_0x0086:
            r1 = move-exception
            r3 = r4
        L_0x0088:
            java.util.logging.Logger r2 = f18731b     // Catch:{ all -> 0x016d }
            java.util.logging.Level r5 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x016d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x016d }
            r6.<init>()     // Catch:{ all -> 0x016d }
            r6.append(r0)     // Catch:{ all -> 0x016d }
            r6.append(r8)     // Catch:{ all -> 0x016d }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x016d }
            java.lang.Throwable r0 = org.seamless.util.C10243a.m25753a(r1)     // Catch:{ all -> 0x016d }
            r2.log(r5, r8, r0)     // Catch:{ all -> 0x016d }
            if (r3 == 0) goto L_0x00a7
            r3.disconnect()
        L_0x00a7:
            return r4
        L_0x00a8:
            r1 = move-exception
            r3 = r4
        L_0x00aa:
            if (r3 != 0) goto L_0x00cc
            java.util.logging.Logger r2 = f18731b     // Catch:{ all -> 0x016d }
            java.util.logging.Level r5 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x016d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x016d }
            r6.<init>()     // Catch:{ all -> 0x016d }
            r6.append(r0)     // Catch:{ all -> 0x016d }
            r6.append(r8)     // Catch:{ all -> 0x016d }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x016d }
            java.lang.Throwable r0 = org.seamless.util.C10243a.m25753a(r1)     // Catch:{ all -> 0x016d }
            r2.log(r5, r8, r0)     // Catch:{ all -> 0x016d }
            if (r3 == 0) goto L_0x00cb
            r3.disconnect()
        L_0x00cb:
            return r4
        L_0x00cc:
            boolean r0 = r1 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x00fa
            java.util.logging.Logger r0 = f18731b     // Catch:{ all -> 0x016d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x016d }
            r1.<init>()     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "Timeout of "
            r1.append(r2)     // Catch:{ all -> 0x016d }
            org.fourthline.cling.transport.impl.p r2 = r7.mo40800f()     // Catch:{ all -> 0x016d }
            int r2 = r2.mo36783a()     // Catch:{ all -> 0x016d }
            r1.append(r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = " seconds while waiting for HTTP request to complete, aborting: "
            r1.append(r2)     // Catch:{ all -> 0x016d }
            r1.append(r8)     // Catch:{ all -> 0x016d }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x016d }
            r0.info(r8)     // Catch:{ all -> 0x016d }
            r3.disconnect()
            return r4
        L_0x00fa:
            java.util.logging.Logger r8 = f18731b     // Catch:{ all -> 0x016d }
            java.util.logging.Level r0 = java.util.logging.Level.FINE     // Catch:{ all -> 0x016d }
            boolean r0 = r8.isLoggable(r0)     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x011c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x016d }
            r0.<init>()     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "Exception occurred, trying to read the error stream: "
            r0.append(r2)     // Catch:{ all -> 0x016d }
            java.lang.Throwable r1 = org.seamless.util.C10243a.m25753a(r1)     // Catch:{ all -> 0x016d }
            r0.append(r1)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x016d }
            r8.fine(r0)     // Catch:{ all -> 0x016d }
        L_0x011c:
            java.io.InputStream r8 = r3.getErrorStream()     // Catch:{ Exception -> 0x0128 }
            org.fourthline.cling.model.message.e r8 = r7.mo40799e(r3, r8)     // Catch:{ Exception -> 0x0128 }
            r3.disconnect()
            return r8
        L_0x0128:
            r8 = move-exception
            java.util.logging.Logger r0 = f18731b     // Catch:{ all -> 0x016d }
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch:{ all -> 0x016d }
            boolean r1 = r0.isLoggable(r1)     // Catch:{ all -> 0x016d }
            if (r1 == 0) goto L_0x0147
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x016d }
            r1.<init>()     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "Could not read error stream: "
            r1.append(r2)     // Catch:{ all -> 0x016d }
            r1.append(r8)     // Catch:{ all -> 0x016d }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x016d }
            r0.fine(r8)     // Catch:{ all -> 0x016d }
        L_0x0147:
            r3.disconnect()
            return r4
        L_0x014b:
            r1 = move-exception
            r3 = r4
        L_0x014d:
            java.util.logging.Logger r2 = f18731b     // Catch:{ all -> 0x016d }
            java.util.logging.Level r5 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x016d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x016d }
            r6.<init>()     // Catch:{ all -> 0x016d }
            r6.append(r0)     // Catch:{ all -> 0x016d }
            r6.append(r8)     // Catch:{ all -> 0x016d }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x016d }
            java.lang.Throwable r0 = org.seamless.util.C10243a.m25753a(r1)     // Catch:{ all -> 0x016d }
            r2.log(r5, r8, r0)     // Catch:{ all -> 0x016d }
            if (r3 == 0) goto L_0x016c
            r3.disconnect()
        L_0x016c:
            return r4
        L_0x016d:
            r8 = move-exception
            r4 = r3
        L_0x016f:
            if (r4 == 0) goto L_0x0174
            r4.disconnect()
        L_0x0174:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.fourthline.cling.transport.impl.C10138q.mo36781a(org.fourthline.cling.model.message.d):org.fourthline.cling.model.message.e");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo40796b(HttpURLConnection httpURLConnection, C9046b bVar) {
        Logger logger = f18731b;
        logger.fine("Writing headers on HttpURLConnection: " + bVar.size());
        for (Map.Entry next : bVar.entrySet()) {
            for (String str : (List) next.getValue()) {
                String str2 = (String) next.getKey();
                Logger logger2 = f18731b;
                logger2.fine("Setting header '" + str2 + "': " + str);
                httpURLConnection.setRequestProperty(str2, str);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40797c(HttpURLConnection httpURLConnection, C10030d dVar) {
        if (dVar.mo40407n()) {
            httpURLConnection.setDoOutput(true);
            if (dVar.mo40400g().equals(UpnpMessage.BodyType.STRING)) {
                C9090c.m21808i(httpURLConnection.getOutputStream(), dVar.mo40397c());
            } else if (dVar.mo40400g().equals(UpnpMessage.BodyType.BYTES)) {
                C9090c.m21807h(httpURLConnection.getOutputStream(), dVar.mo40399f());
            }
            httpURLConnection.getOutputStream().flush();
            return;
        }
        httpURLConnection.setDoOutput(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo40798d(HttpURLConnection httpURLConnection, C10030d dVar) {
        httpURLConnection.setInstanceFollowRedirects(false);
        C10032f j = dVar.mo40403j();
        UpnpHeader.Type type = UpnpHeader.Type.USER_AGENT;
        if (!j.mo40440n(type)) {
            httpURLConnection.setRequestProperty(type.getHttpName(), mo40800f().mo36786d(dVar.mo40405l(), dVar.mo40406m()));
        }
        mo40796b(httpURLConnection, dVar.mo40403j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C10031e mo40799e(HttpURLConnection httpURLConnection, InputStream inputStream) {
        byte[] bArr = null;
        if (httpURLConnection.getResponseCode() == -1) {
            Logger logger = f18731b;
            logger.warning("Received an invalid HTTP response: " + httpURLConnection.getURL());
            logger.warning("Is your Cling-based server sending connection heartbeats with RemoteClientInfo#isRequestCancelled? This client can't handle heartbeats, read the manual.");
            return null;
        }
        UpnpResponse upnpResponse = new UpnpResponse(httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
        Logger logger2 = f18731b;
        logger2.fine("Received response: " + upnpResponse);
        C10031e eVar = new C10031e(upnpResponse);
        eVar.mo40413t(new C10032f((Map<String, List<String>>) httpURLConnection.getHeaderFields()));
        if (inputStream != null) {
            try {
                bArr = C9090c.m21802c(inputStream);
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
        if (bArr != null && bArr.length > 0 && eVar.mo40409p()) {
            logger2.fine("Response contains textual entity body, converting then setting string on message");
            eVar.mo40412s(bArr);
        } else if (bArr == null || bArr.length <= 0) {
            logger2.fine("Response did not contain entity body");
        } else {
            logger2.fine("Response contains binary entity body, setting bytes on message");
            eVar.mo40411r(UpnpMessage.BodyType.BYTES, bArr);
        }
        logger2.fine("Response message complete: " + eVar);
        return eVar;
    }

    /* renamed from: f */
    public C10137p mo40800f() {
        return this.f18732a;
    }

    public void stop() {
    }
}
