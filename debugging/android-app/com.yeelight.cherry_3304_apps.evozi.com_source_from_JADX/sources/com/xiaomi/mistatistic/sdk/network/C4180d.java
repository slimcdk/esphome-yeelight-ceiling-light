package com.xiaomi.mistatistic.sdk.network;

import android.os.SystemClock;
import com.xiaomi.mistatistic.sdk.controller.C4124g;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.xiaomi.mistatistic.sdk.network.d */
public class C4180d extends HttpsURLConnection {

    /* renamed from: a */
    private String f7185a = null;

    /* renamed from: b */
    private long f7186b;

    /* renamed from: c */
    private long f7187c;

    /* renamed from: d */
    private long f7188d;

    /* renamed from: e */
    private int f7189e = -1;

    /* renamed from: f */
    private boolean f7190f = false;

    /* renamed from: g */
    private String f7191g = null;

    /* renamed from: h */
    private HttpsURLConnection f7192h;

    public C4180d(HttpsURLConnection httpsURLConnection) {
        super(httpsURLConnection.getURL());
        this.f7192h = httpsURLConnection;
        this.f7186b = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    private boolean m11337a(String str) {
        return C4177b.m11320a(str) || C4177b.m11323d(str);
    }

    /* renamed from: c */
    private void m11338c() {
        String host = this.url.getHost();
        if (this.f7191g == null && host != null && !m11337a(host)) {
            C4176a.m11319a().execute(new Runnable() {
                public void run() {
                    C4180d.this.m11339d();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m11339d() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f7191g     // Catch:{ all -> 0x0035 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0033
            boolean r0 = r2.f7190f     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000e
            goto L_0x0033
        L_0x000e:
            java.net.URL r0 = r2.url     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = r0.getHost()     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r2.f7191g     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            boolean r1 = r2.m11337a((java.lang.String) r0)     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0031
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ Exception -> 0x002b }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ Exception -> 0x002b }
            r2.f7191g = r0     // Catch:{ Exception -> 0x002b }
            goto L_0x0031
        L_0x002b:
            r0 = move-exception
            java.lang.String r1 = "can not get ip exception:"
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11176a((java.lang.String) r1, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0035 }
        L_0x0031:
            monitor-exit(r2)
            return
        L_0x0033:
            monitor-exit(r2)
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.network.C4180d.m11339d():void");
    }

    /* renamed from: e */
    private int m11340e() {
        int i = this.f7189e;
        if (i != -1) {
            return i;
        }
        try {
            return this.f7192h.getResponseCode();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: f */
    private synchronized void m11341f() {
        if (this.f7187c == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f7187c = elapsedRealtime;
            this.f7186b = elapsedRealtime;
        }
    }

    /* renamed from: g */
    private synchronized void m11342g() {
        if (this.f7188d == 0 && this.f7187c != 0) {
            this.f7188d = SystemClock.elapsedRealtime() - this.f7187c;
        }
    }

    /* renamed from: a */
    public void mo23199a() {
        mo23203b();
    }

    /* renamed from: a */
    public void mo23200a(long j) {
        this.f7186b = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo23201a(Exception exc) {
        if (!this.f7190f) {
            this.f7190f = true;
            HttpEvent httpEvent = new HttpEvent(getURL().toString(), -1, m11340e(), exc.getClass().getSimpleName());
            httpEvent.setIp(this.f7191g);
            httpEvent.setRequestId(this.f7185a);
            C4124g.m11151a().mo23062a(httpEvent);
        }
    }

    public void addRequestProperty(String str, String str2) {
        this.f7192h.addRequestProperty(str, str2);
    }

    /* renamed from: b */
    public void mo23203b() {
        if (!this.f7190f) {
            this.f7190f = true;
            HttpEvent httpEvent = new HttpEvent(getURL().toString(), SystemClock.elapsedRealtime() - this.f7186b, 0, m11340e());
            httpEvent.setIp(this.f7191g);
            httpEvent.setFirstPacketCost(this.f7188d);
            httpEvent.setRequestId(this.f7185a);
            C4124g.m11151a().mo23062a(httpEvent);
        }
    }

    public void connect() {
        try {
            this.f7192h.connect();
        } catch (IOException e) {
            mo23201a((Exception) e);
            throw e;
        }
    }

    public void disconnect() {
        this.f7192h.disconnect();
        mo23203b();
    }

    public boolean getAllowUserInteraction() {
        return this.f7192h.getAllowUserInteraction();
    }

    public String getCipherSuite() {
        return this.f7192h.getCipherSuite();
    }

    public int getConnectTimeout() {
        return this.f7192h.getConnectTimeout();
    }

    public Object getContent() {
        return this.f7192h.getContent();
    }

    public Object getContent(Class[] clsArr) {
        try {
            return this.f7192h.getContent(clsArr);
        } catch (IOException e) {
            mo23201a((Exception) e);
            throw e;
        }
    }

    public String getContentEncoding() {
        return this.f7192h.getContentEncoding();
    }

    public int getContentLength() {
        return this.f7192h.getContentLength();
    }

    public String getContentType() {
        return this.f7192h.getContentType();
    }

    public long getDate() {
        return this.f7192h.getDate();
    }

    public boolean getDefaultUseCaches() {
        return this.f7192h.getDefaultUseCaches();
    }

    public boolean getDoInput() {
        return this.f7192h.getDoInput();
    }

    public boolean getDoOutput() {
        return this.f7192h.getDoOutput();
    }

    public InputStream getErrorStream() {
        return this.f7192h.getErrorStream();
    }

    public long getExpiration() {
        return this.f7192h.getExpiration();
    }

    public String getHeaderField(int i) {
        return this.f7192h.getHeaderField(i);
    }

    public String getHeaderField(String str) {
        return this.f7192h.getHeaderField(str);
    }

    public long getHeaderFieldDate(String str, long j) {
        return this.f7192h.getHeaderFieldDate(str, j);
    }

    public int getHeaderFieldInt(String str, int i) {
        return this.f7192h.getHeaderFieldInt(str, i);
    }

    public String getHeaderFieldKey(int i) {
        return this.f7192h.getHeaderFieldKey(i);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.f7192h.getHeaderFields();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f7192h.getHostnameVerifier();
    }

    public long getIfModifiedSince() {
        return this.f7192h.getIfModifiedSince();
    }

    public InputStream getInputStream() {
        try {
            m11341f();
            C4182e eVar = new C4182e(this, this.f7192h.getInputStream());
            m11342g();
            m11338c();
            return eVar;
        } catch (IOException e) {
            m11339d();
            mo23201a((Exception) e);
            throw e;
        }
    }

    public boolean getInstanceFollowRedirects() {
        return this.f7192h.getInstanceFollowRedirects();
    }

    public long getLastModified() {
        return this.f7192h.getLastModified();
    }

    public Certificate[] getLocalCertificates() {
        return this.f7192h.getLocalCertificates();
    }

    public Principal getLocalPrincipal() {
        return this.f7192h.getLocalPrincipal();
    }

    public OutputStream getOutputStream() {
        try {
            m11341f();
            C4183f fVar = new C4183f(this, this.f7192h.getOutputStream());
            m11342g();
            m11338c();
            return fVar;
        } catch (IOException e) {
            m11339d();
            mo23201a((Exception) e);
            throw e;
        }
    }

    public Principal getPeerPrincipal() {
        try {
            return this.f7192h.getPeerPrincipal();
        } catch (SSLPeerUnverifiedException e) {
            mo23201a((Exception) e);
            throw e;
        }
    }

    public Permission getPermission() {
        try {
            return this.f7192h.getPermission();
        } catch (IOException e) {
            mo23201a((Exception) e);
            throw e;
        }
    }

    public int getReadTimeout() {
        return this.f7192h.getReadTimeout();
    }

    public String getRequestMethod() {
        return this.f7192h.getRequestMethod();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.f7192h.getRequestProperties();
    }

    public String getRequestProperty(String str) {
        return this.f7192h.getRequestProperty(str);
    }

    public int getResponseCode() {
        try {
            m11341f();
            this.f7189e = this.f7192h.getResponseCode();
            m11342g();
            return this.f7189e;
        } catch (IOException e) {
            mo23201a((Exception) e);
            throw e;
        }
    }

    public String getResponseMessage() {
        try {
            return this.f7192h.getResponseMessage();
        } catch (IOException e) {
            mo23201a((Exception) e);
            throw e;
        }
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return this.f7192h.getSSLSocketFactory();
    }

    public Certificate[] getServerCertificates() {
        try {
            return this.f7192h.getServerCertificates();
        } catch (SSLPeerUnverifiedException e) {
            mo23201a((Exception) e);
            throw e;
        }
    }

    public URL getURL() {
        return this.f7192h.getURL();
    }

    public boolean getUseCaches() {
        return this.f7192h.getUseCaches();
    }

    public void setAllowUserInteraction(boolean z) {
        this.f7192h.setAllowUserInteraction(z);
    }

    public void setChunkedStreamingMode(int i) {
        this.f7192h.setChunkedStreamingMode(i);
    }

    public void setConnectTimeout(int i) {
        this.f7192h.setConnectTimeout(i);
    }

    public void setDefaultUseCaches(boolean z) {
        this.f7192h.setDefaultUseCaches(z);
    }

    public void setDoInput(boolean z) {
        this.f7192h.setDoInput(z);
    }

    public void setDoOutput(boolean z) {
        this.f7192h.setDoOutput(z);
    }

    public void setFixedLengthStreamingMode(int i) {
        this.f7192h.setFixedLengthStreamingMode(i);
    }

    public void setFixedLengthStreamingMode(long j) {
        try {
            this.f7192h.getClass().getMethod("setFixedLengthStreamingMode", new Class[]{Long.TYPE}).invoke(this.f7192h, new Object[]{Long.valueOf(j)});
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f7192h.setHostnameVerifier(hostnameVerifier);
    }

    public void setIfModifiedSince(long j) {
        this.f7192h.setIfModifiedSince(j);
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.f7192h.setInstanceFollowRedirects(z);
    }

    public void setReadTimeout(int i) {
        this.f7192h.setReadTimeout(i);
    }

    public void setRequestMethod(String str) {
        try {
            this.f7192h.setRequestMethod(str);
        } catch (ProtocolException e) {
            mo23201a((Exception) e);
            throw e;
        }
    }

    public void setRequestProperty(String str, String str2) {
        if ("x-mistats-header".equals(str)) {
            this.f7185a = str2;
        }
        this.f7192h.setRequestProperty(str, str2);
    }

    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f7192h.setSSLSocketFactory(sSLSocketFactory);
    }

    public void setUseCaches(boolean z) {
        this.f7192h.setUseCaches(z);
    }

    public String toString() {
        return this.f7192h.toString();
    }

    public boolean usingProxy() {
        return this.f7192h.usingProxy();
    }
}
