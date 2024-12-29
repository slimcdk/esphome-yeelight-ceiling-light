package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.p103b.C1264a;
import com.google.android.datatransport.cct.p103b.C1266b;
import com.google.android.datatransport.cct.p103b.C1290j;
import com.google.android.datatransport.cct.p103b.C1291k;
import com.google.android.datatransport.cct.p103b.C1294l;
import com.google.android.datatransport.cct.p103b.C1296m;
import com.google.android.datatransport.cct.p103b.C1299o;
import com.google.android.datatransport.cct.p103b.C1303p;
import com.google.android.datatransport.runtime.backends.C1318g;
import com.google.android.datatransport.runtime.backends.C1320h;
import com.google.android.datatransport.runtime.backends.C1328n;
import com.google.android.datatransport.runtime.time.C1354a;
import com.google.firebase.p128f.C3177a;
import com.google.firebase.p128f.p130h.C3188d;
import com.miot.common.device.parser.xml.DddTag;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import p011c.p012a.p019b.p020a.C0459b;
import p011c.p012a.p019b.p020a.p021i.C0480g;
import p011c.p012a.p019b.p020a.p021i.C0481h;
import p011c.p012a.p019b.p020a.p021i.p022s.C0496a;
import p011c.p012a.p019b.p020a.p021i.p023t.C0498b;

/* renamed from: com.google.android.datatransport.cct.e */
final class C1306e implements C1328n {

    /* renamed from: a */
    private final C3177a f2386a;

    /* renamed from: b */
    private final ConnectivityManager f2387b;

    /* renamed from: c */
    final URL f2388c = m3446f(C1263a.f2264c);

    /* renamed from: d */
    private final C1354a f2389d;

    /* renamed from: e */
    private final C1354a f2390e;

    /* renamed from: f */
    private final int f2391f;

    /* renamed from: com.google.android.datatransport.cct.e$a */
    static final class C1307a {

        /* renamed from: a */
        final URL f2392a;

        /* renamed from: b */
        final C1290j f2393b;
        @Nullable

        /* renamed from: c */
        final String f2394c;

        C1307a(URL url, C1290j jVar, @Nullable String str) {
            this.f2392a = url;
            this.f2393b = jVar;
            this.f2394c = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1307a mo10204a(URL url) {
            return new C1307a(url, this.f2393b, this.f2394c);
        }
    }

    /* renamed from: com.google.android.datatransport.cct.e$b */
    static final class C1308b {

        /* renamed from: a */
        final int f2395a;
        @Nullable

        /* renamed from: b */
        final URL f2396b;

        /* renamed from: c */
        final long f2397c;

        C1308b(int i, @Nullable URL url, long j) {
            this.f2395a = i;
            this.f2396b = url;
            this.f2397c = j;
        }
    }

    C1306e(Context context, C1354a aVar, C1354a aVar2) {
        C3188d dVar = new C3188d();
        dVar.mo17761g(C1266b.f2270a);
        dVar.mo17762h(true);
        this.f2386a = dVar.mo17760f();
        this.f2387b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f2389d = aVar2;
        this.f2390e = aVar;
        this.f2391f = 40000;
    }

    /* renamed from: c */
    static /* synthetic */ C1307a m3443c(C1307a aVar, C1308b bVar) {
        URL url = bVar.f2396b;
        if (url == null) {
            return null;
        }
        C0496a.m155a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.mo10204a(bVar.f2396b);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0112, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0113, code lost:
        if (r0 != null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        m3447g(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0118, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011c, code lost:
        if (r1 != null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011e, code lost:
        m3447g(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0121, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0135, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        m3447g(r14, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0139, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013d, code lost:
        if (r8 != null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        m3447g(r14, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0142, code lost:
        throw r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.datatransport.cct.C1306e.C1308b m3444d(com.google.android.datatransport.cct.C1306e.C1307a r14) {
        /*
            r13 = this;
            java.net.URL r0 = r14.f2392a
            java.lang.String r1 = "CctTransportBackend"
            java.lang.String r2 = "Making request to: %s"
            p011c.p012a.p019b.p020a.p021i.p022s.C0496a.m155a(r1, r2, r0)
            java.net.URL r0 = r14.f2392a
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r2 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r2)
            int r2 = r13.f2391f
            r0.setReadTimeout(r2)
            r2 = 1
            r0.setDoOutput(r2)
            r3 = 0
            r0.setInstanceFollowRedirects(r3)
            java.lang.String r4 = "POST"
            r0.setRequestMethod(r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "2.2.1"
            r2[r3] = r4
            java.lang.String r3 = "datatransport/%s android/"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "User-Agent"
            r0.setRequestProperty(r3, r2)
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r0.setRequestProperty(r2, r3)
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r0.setRequestProperty(r4, r5)
            java.lang.String r5 = "Accept-Encoding"
            r0.setRequestProperty(r5, r3)
            java.lang.String r5 = r14.f2394c
            if (r5 == 0) goto L_0x0055
            java.lang.String r6 = "X-Goog-Api-Key"
            r0.setRequestProperty(r6, r5)
        L_0x0055:
            r5 = 0
            r7 = 0
            java.io.OutputStream r8 = r0.getOutputStream()     // Catch:{ b -> 0x0145, IOException -> 0x0143 }
            java.util.zip.GZIPOutputStream r9 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x013a }
            r9.<init>(r8)     // Catch:{ all -> 0x013a }
            com.google.firebase.f.a r10 = r13.f2386a     // Catch:{ all -> 0x0133 }
            com.google.android.datatransport.cct.b.j r14 = r14.f2393b     // Catch:{ all -> 0x0133 }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ all -> 0x0133 }
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0133 }
            r12.<init>(r9)     // Catch:{ all -> 0x0133 }
            r11.<init>(r12)     // Catch:{ all -> 0x0133 }
            r10.mo17750a(r14, r11)     // Catch:{ all -> 0x0133 }
            m3447g(r7, r9)     // Catch:{ all -> 0x013a }
            if (r8 == 0) goto L_0x007a
            m3447g(r7, r8)     // Catch:{ b -> 0x0145, IOException -> 0x0143 }
        L_0x007a:
            int r14 = r0.getResponseCode()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Status Code: "
            r8.append(r9)
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            p011c.p012a.p019b.p020a.p021i.p022s.C0496a.m159e(r1, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Content-Type: "
            r8.append(r9)
            java.lang.String r4 = r0.getHeaderField(r4)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            p011c.p012a.p019b.p020a.p021i.p022s.C0496a.m159e(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Content-Encoding: "
            r4.append(r8)
            java.lang.String r8 = r0.getHeaderField(r2)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            p011c.p012a.p019b.p020a.p021i.p022s.C0496a.m159e(r1, r4)
            r1 = 302(0x12e, float:4.23E-43)
            if (r14 == r1) goto L_0x0122
            r1 = 301(0x12d, float:4.22E-43)
            if (r14 == r1) goto L_0x0122
            r1 = 307(0x133, float:4.3E-43)
            if (r14 != r1) goto L_0x00cf
            goto L_0x0122
        L_0x00cf:
            r1 = 200(0xc8, float:2.8E-43)
            if (r14 == r1) goto L_0x00d9
            com.google.android.datatransport.cct.e$b r0 = new com.google.android.datatransport.cct.e$b
            r0.<init>(r14, r7, r5)
            return r0
        L_0x00d9:
            java.io.InputStream r1 = r0.getInputStream()
            java.lang.String r0 = r0.getHeaderField(r2)     // Catch:{ all -> 0x0119 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x00ed
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0119 }
            r0.<init>(r1)     // Catch:{ all -> 0x0119 }
            goto L_0x00ee
        L_0x00ed:
            r0 = r1
        L_0x00ee:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0110 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0110 }
            r3.<init>(r0)     // Catch:{ all -> 0x0110 }
            r2.<init>(r3)     // Catch:{ all -> 0x0110 }
            com.google.android.datatransport.cct.b.n r2 = com.google.android.datatransport.cct.p103b.C1298n.m3428b(r2)     // Catch:{ all -> 0x0110 }
            long r2 = r2.mo10186a()     // Catch:{ all -> 0x0110 }
            com.google.android.datatransport.cct.e$b r4 = new com.google.android.datatransport.cct.e$b     // Catch:{ all -> 0x0110 }
            r4.<init>(r14, r7, r2)     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x010a
            m3447g(r7, r0)     // Catch:{ all -> 0x0119 }
        L_0x010a:
            if (r1 == 0) goto L_0x010f
            m3447g(r7, r1)
        L_0x010f:
            return r4
        L_0x0110:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r2 = move-exception
            if (r0 == 0) goto L_0x0118
            m3447g(r14, r0)     // Catch:{ all -> 0x0119 }
        L_0x0118:
            throw r2     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x011b }
        L_0x011b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0121
            m3447g(r14, r1)
        L_0x0121:
            throw r0
        L_0x0122:
            java.lang.String r1 = "Location"
            java.lang.String r0 = r0.getHeaderField(r1)
            com.google.android.datatransport.cct.e$b r1 = new com.google.android.datatransport.cct.e$b
            java.net.URL r2 = new java.net.URL
            r2.<init>(r0)
            r1.<init>(r14, r2, r5)
            return r1
        L_0x0133:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x0135 }
        L_0x0135:
            r0 = move-exception
            m3447g(r14, r9)     // Catch:{ all -> 0x013a }
            throw r0     // Catch:{ all -> 0x013a }
        L_0x013a:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x013c }
        L_0x013c:
            r0 = move-exception
            if (r8 == 0) goto L_0x0142
            m3447g(r14, r8)     // Catch:{ b -> 0x0145, IOException -> 0x0143 }
        L_0x0142:
            throw r0     // Catch:{ b -> 0x0145, IOException -> 0x0143 }
        L_0x0143:
            r14 = move-exception
            goto L_0x0146
        L_0x0145:
            r14 = move-exception
        L_0x0146:
            java.lang.String r0 = "Couldn't encode request, returning with 400"
            p011c.p012a.p019b.p020a.p021i.p022s.C0496a.m157c(r1, r0, r14)
            com.google.android.datatransport.cct.e$b r14 = new com.google.android.datatransport.cct.e$b
            r0 = 400(0x190, float:5.6E-43)
            r14.<init>(r0, r7, r5)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.C1306e.m3444d(com.google.android.datatransport.cct.e$a):com.google.android.datatransport.cct.e$b");
    }

    /* renamed from: f */
    private static URL m3446f(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: g */
    private static /* synthetic */ void m3447g(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable unused) {
            }
        } else {
            autoCloseable.close();
        }
    }

    /* renamed from: a */
    public C1320h mo10202a(C1318g gVar) {
        C1294l.C1295a aVar;
        HashMap hashMap = new HashMap();
        for (C0481h next : gVar.mo10206b()) {
            String j = next.mo8411j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            C0481h hVar = (C0481h) ((List) entry.getValue()).get(0);
            C1296m.C1297a a = C1296m.m3410a();
            a.mo10180d(C1303p.DEFAULT);
            a.mo10178b(this.f2390e.mo10267a());
            a.mo10185i(this.f2389d.mo10267a());
            C1291k.C1292a a2 = C1291k.m3389a();
            a2.mo10148b(C1291k.C1293b.ANDROID_FIREBASE);
            C1264a.C1265a a3 = C1264a.m3303a();
            a3.mo10124a(Integer.valueOf(hVar.mo8459g("sdk-version")));
            a3.mo10130g(hVar.mo8458b("model"));
            a3.mo10128e(hVar.mo8458b("hardware"));
            a3.mo10125b(hVar.mo8458b(DddTag.DEVICE));
            a3.mo10132i(hVar.mo8458b("product"));
            a3.mo10131h(hVar.mo8458b("os-uild"));
            a3.mo10129f(hVar.mo8458b(DddTag.DEVICE_MANUFACTURER));
            a3.mo10127d(hVar.mo8458b("fingerprint"));
            a2.mo10147a(a3.mo10126c());
            a.mo10179c(a2.mo10149c());
            try {
                a.mo10198a(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                a.mo10199j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (C0481h hVar2 : (List) entry.getValue()) {
                C0480g e = hVar2.mo8407e();
                C0459b b = e.mo8454b();
                if (b.equals(C0459b.m41b("proto"))) {
                    aVar = C1294l.m3396b(e.mo8453a());
                } else if (b.equals(C0459b.m41b("json"))) {
                    aVar = C1294l.m3395a(new String(e.mo8453a(), Charset.forName("UTF-8")));
                } else {
                    C0496a.m160f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b);
                }
                aVar.mo10160a(hVar2.mo8409f());
                aVar.mo10164e(hVar2.mo8412k());
                aVar.mo10165f(hVar2.mo8460h("tz-offset"));
                C1299o.C1300a a4 = C1299o.m3430a();
                a4.mo10196b(C1299o.C1302c.m3438a(hVar2.mo8459g("net-type")));
                a4.mo10195a(C1299o.C1301b.m3436a(hVar2.mo8459g("mobile-subtype")));
                aVar.mo10161b(a4.mo10197c());
                if (hVar2.mo8406d() != null) {
                    aVar.mo10162c(hVar2.mo8406d());
                }
                arrayList3.add(aVar.mo10163d());
            }
            a.mo10183g(arrayList3);
            arrayList2.add(a.mo10184h());
        }
        C1290j a5 = C1290j.m3387a(arrayList2);
        String str = null;
        URL url = this.f2388c;
        if (gVar.mo10207c() != null) {
            try {
                C1263a c = C1263a.m3298c(gVar.mo10207c());
                if (c.mo10114d() != null) {
                    str = c.mo10114d();
                }
                if (c.mo10115e() != null) {
                    url = m3446f(c.mo10115e());
                }
            } catch (IllegalArgumentException unused2) {
                return C1320h.m3470a();
            }
        }
        try {
            C1308b bVar = (C1308b) C0498b.m161a(5, new C1307a(url, a5, str), C1304c.m3440a(this), C1305d.m3441b());
            if (bVar.f2395a == 200) {
                return C1320h.m3471d(bVar.f2397c);
            }
            int i = bVar.f2395a;
            if (i < 500) {
                if (i != 404) {
                    return C1320h.m3470a();
                }
            }
            return C1320h.m3472e();
        } catch (IOException e2) {
            C0496a.m157c("CctTransportBackend", "Could not make request to the backend", e2);
            return C1320h.m3472e();
        }
    }

    /* renamed from: b */
    public C0481h mo10203b(C0481h hVar) {
        int i;
        C1299o.C1301b bVar;
        NetworkInfo activeNetworkInfo = this.f2387b.getActiveNetworkInfo();
        C0481h.C0482a l = hVar.mo8462l();
        l.mo8463a("sdk-version", Build.VERSION.SDK_INT);
        l.mo8465c("model", Build.MODEL);
        l.mo8465c("hardware", Build.HARDWARE);
        l.mo8465c(DddTag.DEVICE, Build.DEVICE);
        l.mo8465c("product", Build.PRODUCT);
        l.mo8465c("os-uild", Build.ID);
        l.mo8465c(DddTag.DEVICE_MANUFACTURER, Build.MANUFACTURER);
        l.mo8465c("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        l.mo8464b("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        l.mo8463a("net-type", activeNetworkInfo == null ? C1299o.C1302c.NONE.mo10201C() : activeNetworkInfo.getType());
        if (activeNetworkInfo == null) {
            bVar = C1299o.C1301b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            i = activeNetworkInfo.getSubtype();
            if (i == -1) {
                bVar = C1299o.C1301b.COMBINED;
            } else {
                if (C1299o.C1301b.m3436a(i) == null) {
                    i = 0;
                }
                l.mo8463a("mobile-subtype", i);
                return l.mo8414d();
            }
        }
        i = bVar.mo10200C();
        l.mo8463a("mobile-subtype", i);
        return l.mo8414d();
    }
}
