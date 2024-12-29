package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.C1874c;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p014c0.C0612a;
import p014c0.C0621j;
import p070n1.C3377h;
import p077o1.C3502b;

/* renamed from: com.google.firebase.installations.remote.c */
public class C2450c {

    /* renamed from: d */
    private static final Pattern f4147d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    private static final Charset f4148e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f4149a;

    /* renamed from: b */
    private final C3502b<C3377h> f4150b;

    /* renamed from: c */
    private final C2451d f4151c = new C2451d();

    public C2450c(@NonNull Context context, @NonNull C3502b<C3377h> bVar) {
        this.f4149a = context;
        this.f4150b = bVar;
    }

    /* renamed from: a */
    private static String m6620a(@Nullable String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m6621b(@Nullable String str, @NonNull String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private static JSONObject m6622c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    private String m6623f() {
        try {
            Context context = this.f4149a;
            byte[] a = C0612a.m185a(context, context.getPackageName());
            if (a != null) {
                return C0621j.m219b(a, false);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get fingerprint hash for package: ");
            sb.append(this.f4149a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No such package: ");
            sb2.append(this.f4149a.getPackageName());
            return null;
        }
    }

    /* renamed from: g */
    private URL m6624g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m6625h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    private static boolean m6626i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    private static void m6627j() {
    }

    /* renamed from: k */
    private static void m6628k(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        if (!TextUtils.isEmpty(m6632o(httpURLConnection))) {
            m6620a(str, str2, str3);
        }
    }

    /* renamed from: l */
    private HttpURLConnection m6629l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f4149a.getPackageName());
            C3377h hVar = this.f4150b.get();
            if (hVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) C1874c.m4947a(hVar.mo19038a()));
                } catch (ExecutionException unused) {
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m6623f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    @VisibleForTesting
    /* renamed from: m */
    static long m6630m(String str) {
        C0917i.m1411b(f4147d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: n */
    private InstallationResponse m6631n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f4148e));
        TokenResult.C2443a a = TokenResult.m6594a();
        InstallationResponse.C2442a a2 = InstallationResponse.m6582a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.mo19106f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo19103c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo19104d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo19112c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo19113d(m6630m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo19102b(a.mo19110a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.mo19105e(InstallationResponse.ResponseCode.OK).mo19101a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    @androidx.annotation.Nullable
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m6632o(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f4148e
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.C2450c.m6632o(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: p */
    private TokenResult m6633p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f4148e));
        TokenResult.C2443a a = TokenResult.m6594a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo19112c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo19113d(m6630m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.mo19111b(TokenResult.ResponseCode.OK).mo19110a();
    }

    /* renamed from: q */
    private void m6634q(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2) {
        m6636s(httpURLConnection, m6625h(m6621b(str, str2)));
    }

    /* renamed from: r */
    private void m6635r(HttpURLConnection httpURLConnection) {
        m6636s(httpURLConnection, m6625h(m6622c()));
    }

    /* renamed from: s */
    private static void m6636s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    @NonNull
    /* renamed from: d */
    public InstallationResponse mo19120d(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5) {
        InstallationResponse n;
        if (this.f4151c.mo19122b()) {
            int i = 0;
            URL g = m6624g(String.format("projects/%s/installations", new Object[]{str3}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l = m6629l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.setDoOutput(true);
                    if (str5 != null) {
                        l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m6634q(l, str2, str4);
                    int responseCode = l.getResponseCode();
                    this.f4151c.mo19123f(responseCode);
                    if (m6626i(responseCode)) {
                        n = m6631n(l);
                    } else {
                        m6628k(l, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m6627j();
                            n = InstallationResponse.m6582a().mo19105e(InstallationResponse.ResponseCode.BAD_CONFIG).mo19101a();
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return n;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @NonNull
    /* renamed from: e */
    public TokenResult mo19121e(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        TokenResult p;
        TokenResult.C2443a b;
        if (this.f4151c.mo19122b()) {
            int i = 0;
            URL g = m6624g(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l = m6629l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l.setDoOutput(true);
                    m6635r(l);
                    int responseCode = l.getResponseCode();
                    this.f4151c.mo19123f(responseCode);
                    if (m6626i(responseCode)) {
                        p = m6633p(l);
                    } else {
                        m6628k(l, (String) null, str, str3);
                        if (responseCode == 401) {
                            b = TokenResult.m6594a().mo19111b(TokenResult.ResponseCode.AUTH_ERROR);
                        } else if (responseCode == 404) {
                            b = TokenResult.m6594a().mo19111b(TokenResult.ResponseCode.AUTH_ERROR);
                        } else if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m6627j();
                            b = TokenResult.m6594a().mo19111b(TokenResult.ResponseCode.BAD_CONFIG);
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                        p = b.mo19110a();
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return p;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }
}
