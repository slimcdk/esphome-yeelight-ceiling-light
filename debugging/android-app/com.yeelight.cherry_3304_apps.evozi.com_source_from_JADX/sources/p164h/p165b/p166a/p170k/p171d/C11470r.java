package p164h.p165b.p166a.p170k.p171d;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLStreamHandlerFactory;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import p164h.p165b.p166a.p170k.p172e.C11485f;
import p164h.p165b.p166a.p170k.p172e.C11490l;
import p164h.p165b.p166a.p240h.C11216f;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11245f;
import p164h.p165b.p166a.p240h.p243r.C11246g;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p257c.p258a.C11494a;
import p164h.p257c.p259b.p260f.C11510c;

/* renamed from: h.b.a.k.d.r */
public class C11470r implements C11490l {

    /* renamed from: b */
    private static final Logger f22823b = Logger.getLogger(C11490l.class.getName());

    /* renamed from: a */
    protected final C11469q f22824a;

    public C11470r(C11469q qVar) {
        this.f22824a = qVar;
        if (C11216f.f22295b || C11216f.f22294a) {
            throw new C11485f("This client does not work on Android. The design of HttpURLConnection is broken, we can not add additional 'permitted' HTTP methods. Read the Cling manual.");
        }
        Logger logger = f22823b;
        logger.fine("Using persistent HTTP stream client connections: " + qVar.mo36333e());
        System.setProperty("http.keepAlive", Boolean.toString(qVar.mo36333e()));
        if (System.getProperty("hackStreamHandlerProperty") == null) {
            f22823b.fine("Setting custom static URLStreamHandlerFactory to work around bad JDK defaults");
            try {
                URL.setURLStreamHandlerFactory((URLStreamHandlerFactory) Class.forName("h.b.a.k.d.g").newInstance());
                System.setProperty("hackStreamHandlerProperty", "alreadyWorkedAroundTheEvilJDK");
            } catch (Throwable unused) {
                throw new C11485f("Failed to set modified URLStreamHandlerFactory in this environment. Can't use bundled default client based on HTTPURLConnection, see manual.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0132, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013b, code lost:
        if (f22823b.isLoggable(java.util.logging.Level.FINE) != false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013d, code lost:
        f22823b.fine("Could not read error stream: " + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0153, code lost:
        if (r2 != null) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0155, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0158, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017b, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017c, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017f, code lost:
        r3.disconnect();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:14:0x008c, B:38:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0 A[SYNTHETIC, Splitter:B:22:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d0 A[SYNTHETIC, Splitter:B:27:0x00d0] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x015b=Splitter:B:53:0x015b, B:14:0x008c=Splitter:B:14:0x008c} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p164h.p165b.p166a.p240h.p243r.C11244e mo36334a(p164h.p165b.p166a.p240h.p243r.C11243d r8) {
        /*
            r7 = this;
            java.lang.String r0 = "HTTP request failed: "
            h.b.a.h.r.h r1 = r8.mo35776k()
            h.b.a.h.r.i r1 = (p164h.p165b.p166a.p240h.p243r.C11249i) r1
            java.util.logging.Logger r2 = f22823b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Preparing HTTP request message with method '"
            r3.append(r4)
            java.lang.String r4 = r1.mo35789c()
            r3.append(r4)
            java.lang.String r4 = "': "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2.fine(r3)
            java.net.URI r2 = r1.mo35791e()
            java.net.URL r2 = p164h.p257c.p259b.C11500e.m30202e(r2)
            r3 = 0
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ ProtocolException -> 0x0159, IOException -> 0x00ac, Exception -> 0x008a, all -> 0x0087 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ ProtocolException -> 0x0159, IOException -> 0x00ac, Exception -> 0x008a, all -> 0x0087 }
            java.lang.String r1 = r1.mo35789c()     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            r2.setRequestMethod(r1)     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            h.b.a.k.d.q r1 = r7.f22824a     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            int r1 = r1.mo36370a()     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            int r1 = r1 * 1000
            r2.setReadTimeout(r1)     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            h.b.a.k.d.q r1 = r7.f22824a     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            int r1 = r1.mo36370a()     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            int r1 = r1 * 1000
            r2.setConnectTimeout(r1)     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            r7.mo36337d(r2, r8)     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            r7.mo36336c(r2, r8)     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            java.util.logging.Logger r1 = f22823b     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            r4.<init>()     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            java.lang.String r5 = "Sending HTTP request: "
            r4.append(r5)     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            r4.append(r8)     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            java.lang.String r4 = r4.toString()     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            r1.fine(r4)     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            h.b.a.h.r.e r8 = r7.mo36338e(r2, r1)     // Catch:{ ProtocolException -> 0x0084, IOException -> 0x0082, Exception -> 0x0080 }
            if (r2 == 0) goto L_0x007f
            r2.disconnect()
        L_0x007f:
            return r8
        L_0x0080:
            r1 = move-exception
            goto L_0x008c
        L_0x0082:
            r1 = move-exception
            goto L_0x00ae
        L_0x0084:
            r1 = move-exception
            goto L_0x015b
        L_0x0087:
            r8 = move-exception
            goto L_0x017d
        L_0x008a:
            r1 = move-exception
            r2 = r3
        L_0x008c:
            java.util.logging.Logger r4 = f22823b     // Catch:{ all -> 0x017b }
            java.util.logging.Level r5 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r6.<init>()     // Catch:{ all -> 0x017b }
            r6.append(r0)     // Catch:{ all -> 0x017b }
            r6.append(r8)     // Catch:{ all -> 0x017b }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x017b }
            java.lang.Throwable r0 = p164h.p257c.p259b.C11495a.m30173a(r1)     // Catch:{ all -> 0x017b }
            r4.log(r5, r8, r0)     // Catch:{ all -> 0x017b }
            if (r2 == 0) goto L_0x00ab
            r2.disconnect()
        L_0x00ab:
            return r3
        L_0x00ac:
            r1 = move-exception
            r2 = r3
        L_0x00ae:
            if (r2 != 0) goto L_0x00d0
            java.util.logging.Logger r4 = f22823b     // Catch:{ all -> 0x017b }
            java.util.logging.Level r5 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r6.<init>()     // Catch:{ all -> 0x017b }
            r6.append(r0)     // Catch:{ all -> 0x017b }
            r6.append(r8)     // Catch:{ all -> 0x017b }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x017b }
            java.lang.Throwable r0 = p164h.p257c.p259b.C11495a.m30173a(r1)     // Catch:{ all -> 0x017b }
            r4.log(r5, r8, r0)     // Catch:{ all -> 0x017b }
            if (r2 == 0) goto L_0x00cf
            r2.disconnect()
        L_0x00cf:
            return r3
        L_0x00d0:
            boolean r0 = r1 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x0100
            java.util.logging.Logger r0 = f22823b     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r1.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "Timeout of "
            r1.append(r4)     // Catch:{ all -> 0x017b }
            h.b.a.k.d.q r4 = r7.getConfiguration()     // Catch:{ all -> 0x017b }
            int r4 = r4.mo36370a()     // Catch:{ all -> 0x017b }
            r1.append(r4)     // Catch:{ all -> 0x017b }
            java.lang.String r4 = " seconds while waiting for HTTP request to complete, aborting: "
            r1.append(r4)     // Catch:{ all -> 0x017b }
            r1.append(r8)     // Catch:{ all -> 0x017b }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x017b }
            r0.info(r8)     // Catch:{ all -> 0x017b }
            if (r2 == 0) goto L_0x00ff
            r2.disconnect()
        L_0x00ff:
            return r3
        L_0x0100:
            java.util.logging.Logger r8 = f22823b     // Catch:{ all -> 0x017b }
            java.util.logging.Level r0 = java.util.logging.Level.FINE     // Catch:{ all -> 0x017b }
            boolean r8 = r8.isLoggable(r0)     // Catch:{ all -> 0x017b }
            if (r8 == 0) goto L_0x0124
            java.util.logging.Logger r8 = f22823b     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r0.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "Exception occurred, trying to read the error stream: "
            r0.append(r4)     // Catch:{ all -> 0x017b }
            java.lang.Throwable r1 = p164h.p257c.p259b.C11495a.m30173a(r1)     // Catch:{ all -> 0x017b }
            r0.append(r1)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x017b }
            r8.fine(r0)     // Catch:{ all -> 0x017b }
        L_0x0124:
            java.io.InputStream r8 = r2.getErrorStream()     // Catch:{ Exception -> 0x0132 }
            h.b.a.h.r.e r8 = r7.mo36338e(r2, r8)     // Catch:{ Exception -> 0x0132 }
            if (r2 == 0) goto L_0x0131
            r2.disconnect()
        L_0x0131:
            return r8
        L_0x0132:
            r8 = move-exception
            java.util.logging.Logger r0 = f22823b     // Catch:{ all -> 0x017b }
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch:{ all -> 0x017b }
            boolean r0 = r0.isLoggable(r1)     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x0153
            java.util.logging.Logger r0 = f22823b     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r1.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "Could not read error stream: "
            r1.append(r4)     // Catch:{ all -> 0x017b }
            r1.append(r8)     // Catch:{ all -> 0x017b }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x017b }
            r0.fine(r8)     // Catch:{ all -> 0x017b }
        L_0x0153:
            if (r2 == 0) goto L_0x0158
            r2.disconnect()
        L_0x0158:
            return r3
        L_0x0159:
            r1 = move-exception
            r2 = r3
        L_0x015b:
            java.util.logging.Logger r4 = f22823b     // Catch:{ all -> 0x017b }
            java.util.logging.Level r5 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r6.<init>()     // Catch:{ all -> 0x017b }
            r6.append(r0)     // Catch:{ all -> 0x017b }
            r6.append(r8)     // Catch:{ all -> 0x017b }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x017b }
            java.lang.Throwable r0 = p164h.p257c.p259b.C11495a.m30173a(r1)     // Catch:{ all -> 0x017b }
            r4.log(r5, r8, r0)     // Catch:{ all -> 0x017b }
            if (r2 == 0) goto L_0x017a
            r2.disconnect()
        L_0x017a:
            return r3
        L_0x017b:
            r8 = move-exception
            r3 = r2
        L_0x017d:
            if (r3 == 0) goto L_0x0182
            r3.disconnect()
        L_0x0182:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p170k.p171d.C11470r.mo36334a(h.b.a.h.r.d):h.b.a.h.r.e");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36335b(HttpURLConnection httpURLConnection, C11494a aVar) {
        Logger logger = f22823b;
        logger.fine("Writing headers on HttpURLConnection: " + aVar.size());
        for (Map.Entry next : aVar.entrySet()) {
            for (String str : (List) next.getValue()) {
                String str2 = (String) next.getKey();
                Logger logger2 = f22823b;
                logger2.fine("Setting header '" + str2 + "': " + str);
                httpURLConnection.setRequestProperty(str2, str);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo36336c(HttpURLConnection httpURLConnection, C11243d dVar) {
        if (dVar.mo35779n()) {
            httpURLConnection.setDoOutput(true);
            if (dVar.mo35773g().equals(C11246g.C11247a.STRING)) {
                C11510c.m30234i(httpURLConnection.getOutputStream(), dVar.mo35770c());
            } else if (dVar.mo35773g().equals(C11246g.C11247a.BYTES)) {
                C11510c.m30233h(httpURLConnection.getOutputStream(), dVar.mo35772f());
            }
            httpURLConnection.getOutputStream().flush();
            return;
        }
        httpURLConnection.setDoOutput(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo36337d(HttpURLConnection httpURLConnection, C11243d dVar) {
        httpURLConnection.setInstanceFollowRedirects(false);
        if (!dVar.mo35747j().mo35760n(C11296f0.C11297a.USER_AGENT)) {
            httpURLConnection.setRequestProperty(C11296f0.C11297a.USER_AGENT.mo35849c(), getConfiguration().mo35527d(dVar.mo35777l(), dVar.mo35778m()));
        }
        mo36335b(httpURLConnection, dVar.mo35747j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C11244e mo36338e(HttpURLConnection httpURLConnection, InputStream inputStream) {
        byte[] bArr = null;
        if (httpURLConnection.getResponseCode() == -1) {
            Logger logger = f22823b;
            logger.warning("Received an invalid HTTP response: " + httpURLConnection.getURL());
            f22823b.warning("Is your Cling-based server sending connection heartbeats with RemoteClientInfo#isRequestCancelled? This client can't handle heartbeats, read the manual.");
            return null;
        }
        C11252j jVar = new C11252j(httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
        Logger logger2 = f22823b;
        logger2.fine("Received response: " + jVar);
        C11244e eVar = new C11244e(jVar);
        eVar.mo35785t(new C11245f((Map<String, List<String>>) httpURLConnection.getHeaderFields()));
        if (inputStream != null) {
            try {
                bArr = C11510c.m30228c(inputStream);
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
        if (bArr != null && bArr.length > 0 && eVar.mo35781p()) {
            f22823b.fine("Response contains textual entity body, converting then setting string on message");
            eVar.mo35784s(bArr);
        } else if (bArr == null || bArr.length <= 0) {
            f22823b.fine("Response did not contain entity body");
        } else {
            f22823b.fine("Response contains binary entity body, setting bytes on message");
            eVar.mo35783r(C11246g.C11247a.BYTES, bArr);
        }
        Logger logger3 = f22823b;
        logger3.fine("Response message complete: " + eVar);
        return eVar;
    }

    /* renamed from: f */
    public C11469q getConfiguration() {
        return this.f22824a;
    }

    public void stop() {
    }
}
