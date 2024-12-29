package com.xiaomi.mistatistic.sdk.network;

import android.os.SystemClock;
import com.xiaomi.mistatistic.sdk.controller.C4124g;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* renamed from: com.xiaomi.mistatistic.sdk.network.c */
public class C4178c extends HttpURLConnection {

    /* renamed from: a */
    private String f7174a = null;

    /* renamed from: b */
    private long f7175b = SystemClock.elapsedRealtime();

    /* renamed from: c */
    private long f7176c;

    /* renamed from: d */
    private long f7177d;

    /* renamed from: e */
    private int f7178e = -1;

    /* renamed from: f */
    private boolean f7179f = false;

    /* renamed from: g */
    private String f7180g = null;

    /* renamed from: h */
    private C4183f f7181h;

    /* renamed from: i */
    private C4182e f7182i;

    /* renamed from: j */
    private HttpURLConnection f7183j;

    public C4178c(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.f7183j = httpURLConnection;
    }

    /* renamed from: a */
    private boolean m11325a(String str) {
        return C4177b.m11320a(str) || C4177b.m11323d(str);
    }

    /* renamed from: c */
    private int m11326c() {
        C4182e eVar = this.f7182i;
        int i = 0;
        int a = eVar != null ? eVar.mo23265a() : 0;
        C4183f fVar = this.f7181h;
        if (fVar != null) {
            i = fVar.mo23275a();
        }
        return a + 1100 + i + getURL().toString().getBytes().length;
    }

    /* renamed from: d */
    private void m11327d() {
        String host = this.url.getHost();
        if (this.f7180g == null && host != null && !m11325a(host)) {
            C4176a.m11319a().execute(new Runnable() {
                public void run() {
                    C4178c.this.m11328e();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m11328e() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.f7180g     // Catch:{ all -> 0x004a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            boolean r0 = r4.f7179f     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x000e
            goto L_0x0048
        L_0x000e:
            java.net.URL r0 = r4.url     // Catch:{ all -> 0x004a }
            java.lang.String r0 = r0.getHost()     // Catch:{ all -> 0x004a }
            java.lang.String r1 = r4.f7180g     // Catch:{ all -> 0x004a }
            if (r1 != 0) goto L_0x0046
            if (r0 == 0) goto L_0x0046
            boolean r1 = r4.m11325a((java.lang.String) r0)     // Catch:{ all -> 0x004a }
            if (r1 != 0) goto L_0x0046
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ Exception -> 0x002b }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ Exception -> 0x002b }
            r4.f7180g = r0     // Catch:{ Exception -> 0x002b }
            goto L_0x0046
        L_0x002b:
            r0 = move-exception
            java.lang.String r1 = "MHC"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r2.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r3 = "can not get ip exception: "
            r2.append(r3)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x004a }
            r2.append(r0)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x004a }
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11184d(r1, r0)     // Catch:{ all -> 0x004a }
        L_0x0046:
            monitor-exit(r4)
            return
        L_0x0048:
            monitor-exit(r4)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.network.C4178c.m11328e():void");
    }

    /* renamed from: f */
    private int m11329f() {
        int i = this.f7178e;
        if (i != -1) {
            return i;
        }
        try {
            return this.f7183j.getResponseCode();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: g */
    private synchronized void m11330g() {
        if (this.f7176c == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f7176c = elapsedRealtime;
            this.f7175b = elapsedRealtime;
        }
    }

    /* renamed from: h */
    private synchronized void m11331h() {
        if (this.f7177d == 0 && this.f7176c != 0) {
            this.f7177d = SystemClock.elapsedRealtime() - this.f7176c;
        }
    }

    /* renamed from: a */
    public void mo23142a() {
        mo23146b();
    }

    /* renamed from: a */
    public void mo23143a(long j) {
        this.f7175b = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo23144a(Exception exc) {
        if (!this.f7179f) {
            this.f7179f = true;
            HttpEvent httpEvent = new HttpEvent(getURL().toString(), -1, m11329f(), exc.getClass().getSimpleName());
            httpEvent.setIp(this.f7180g);
            httpEvent.setRequestId(this.f7174a);
            C4124g.m11151a().mo23062a(httpEvent);
        }
    }

    public void addRequestProperty(String str, String str2) {
        this.f7183j.addRequestProperty(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo23146b() {
        if (!this.f7179f) {
            this.f7179f = true;
            HttpEvent httpEvent = new HttpEvent(getURL().toString(), SystemClock.elapsedRealtime() - this.f7175b, (long) m11326c(), m11329f());
            httpEvent.setIp(this.f7180g);
            httpEvent.setFirstPacketCost(this.f7177d);
            httpEvent.setRequestId(this.f7174a);
            C4124g.m11151a().mo23062a(httpEvent);
        }
    }

    public void connect() {
        try {
            this.f7183j.connect();
        } catch (IOException e) {
            mo23144a((Exception) e);
            throw e;
        }
    }

    public void disconnect() {
        this.f7183j.disconnect();
        mo23146b();
    }

    public boolean getAllowUserInteraction() {
        return this.f7183j.getAllowUserInteraction();
    }

    public int getConnectTimeout() {
        return this.f7183j.getConnectTimeout();
    }

    public Object getContent() {
        try {
            return this.f7183j.getContent();
        } catch (IOException e) {
            mo23144a((Exception) e);
            throw e;
        }
    }

    public Object getContent(Class[] clsArr) {
        try {
            return this.f7183j.getContent(clsArr);
        } catch (IOException e) {
            mo23144a((Exception) e);
            throw e;
        }
    }

    public String getContentEncoding() {
        return this.f7183j.getContentEncoding();
    }

    public int getContentLength() {
        return this.f7183j.getContentLength();
    }

    public String getContentType() {
        return this.f7183j.getContentType();
    }

    public long getDate() {
        return this.f7183j.getDate();
    }

    public boolean getDefaultUseCaches() {
        return this.f7183j.getDefaultUseCaches();
    }

    public boolean getDoInput() {
        return this.f7183j.getDoInput();
    }

    public boolean getDoOutput() {
        return this.f7183j.getDoOutput();
    }

    public InputStream getErrorStream() {
        return this.f7183j.getErrorStream();
    }

    public long getExpiration() {
        return this.f7183j.getExpiration();
    }

    public String getHeaderField(int i) {
        return this.f7183j.getHeaderField(i);
    }

    public String getHeaderField(String str) {
        return this.f7183j.getHeaderField(str);
    }

    public long getHeaderFieldDate(String str, long j) {
        return this.f7183j.getHeaderFieldDate(str, j);
    }

    public int getHeaderFieldInt(String str, int i) {
        return this.f7183j.getHeaderFieldInt(str, i);
    }

    public String getHeaderFieldKey(int i) {
        return this.f7183j.getHeaderFieldKey(i);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.f7183j.getHeaderFields();
    }

    public long getIfModifiedSince() {
        return this.f7183j.getIfModifiedSince();
    }

    public InputStream getInputStream() {
        try {
            m11330g();
            this.f7182i = new C4182e(this, this.f7183j.getInputStream());
            m11331h();
            m11327d();
            return this.f7182i;
        } catch (IOException e) {
            m11328e();
            mo23144a((Exception) e);
            throw e;
        }
    }

    public boolean getInstanceFollowRedirects() {
        return this.f7183j.getInstanceFollowRedirects();
    }

    public long getLastModified() {
        return this.f7183j.getLastModified();
    }

    public OutputStream getOutputStream() {
        try {
            m11330g();
            this.f7181h = new C4183f(this, this.f7183j.getOutputStream());
            m11331h();
            m11327d();
            return this.f7181h;
        } catch (IOException e) {
            m11328e();
            mo23144a((Exception) e);
            throw e;
        }
    }

    public Permission getPermission() {
        try {
            return this.f7183j.getPermission();
        } catch (ProtocolException e) {
            mo23144a((Exception) e);
            throw e;
        }
    }

    public int getReadTimeout() {
        return this.f7183j.getReadTimeout();
    }

    public String getRequestMethod() {
        return this.f7183j.getRequestMethod();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.f7183j.getRequestProperties();
    }

    public String getRequestProperty(String str) {
        return this.f7183j.getRequestProperty(str);
    }

    public int getResponseCode() {
        try {
            m11330g();
            this.f7178e = this.f7183j.getResponseCode();
            m11331h();
            return this.f7178e;
        } catch (ProtocolException e) {
            mo23144a((Exception) e);
            throw e;
        }
    }

    public String getResponseMessage() {
        try {
            return this.f7183j.getResponseMessage();
        } catch (ProtocolException e) {
            mo23144a((Exception) e);
            throw e;
        }
    }

    public URL getURL() {
        return this.f7183j.getURL();
    }

    public boolean getUseCaches() {
        return this.f7183j.getUseCaches();
    }

    public void setAllowUserInteraction(boolean z) {
        this.f7183j.setAllowUserInteraction(z);
    }

    public void setChunkedStreamingMode(int i) {
        this.f7183j.setChunkedStreamingMode(i);
    }

    public void setConnectTimeout(int i) {
        this.f7183j.setConnectTimeout(i);
    }

    public void setDefaultUseCaches(boolean z) {
        this.f7183j.setDefaultUseCaches(z);
    }

    public void setDoInput(boolean z) {
        this.f7183j.setDoInput(z);
    }

    public void setDoOutput(boolean z) {
        this.f7183j.setDoOutput(z);
    }

    public void setFixedLengthStreamingMode(int i) {
        this.f7183j.setFixedLengthStreamingMode(i);
    }

    public void setFixedLengthStreamingMode(long j) {
        try {
            this.f7183j.getClass().getDeclaredMethod("setFixedLengthStreamingMode", new Class[]{Long.TYPE}).invoke(this.f7183j, new Object[]{Long.valueOf(j)});
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public void setIfModifiedSince(long j) {
        this.f7183j.setIfModifiedSince(j);
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.f7183j.setInstanceFollowRedirects(z);
    }

    public void setReadTimeout(int i) {
        this.f7183j.setReadTimeout(i);
    }

    public void setRequestMethod(String str) {
        try {
            this.f7183j.setRequestMethod(str);
        } catch (ProtocolException e) {
            mo23144a((Exception) e);
            throw e;
        }
    }

    public void setRequestProperty(String str, String str2) {
        if ("x-mistats-header".equals(str)) {
            this.f7174a = str2;
        }
        this.f7183j.setRequestProperty(str, str2);
    }

    public void setUseCaches(boolean z) {
        this.f7183j.setUseCaches(z);
    }

    public String toString() {
        return this.f7183j.toString();
    }

    public boolean usingProxy() {
        return this.f7183j.usingProxy();
    }
}
