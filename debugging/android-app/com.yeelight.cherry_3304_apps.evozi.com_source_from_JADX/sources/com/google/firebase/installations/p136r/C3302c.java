package com.google.firebase.installations.p136r;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.C1647a;
import com.google.android.gms.common.util.C1656j;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.installations.p136r.C3303d;
import com.google.firebase.installations.p136r.C3306e;
import com.google.firebase.p132h.C3198c;
import com.google.firebase.p138k.C3317h;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.r.c */
public class C3302c {

    /* renamed from: d */
    private static final Pattern f6399d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    private static final Charset f6400e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f6401a;

    /* renamed from: b */
    private final C3317h f6402b;

    /* renamed from: c */
    private final C3198c f6403c;

    public C3302c(@NonNull Context context, @Nullable C3317h hVar, @Nullable C3198c cVar) {
        this.f6401a = context;
        this.f6402b = hVar;
        this.f6403c = cVar;
    }

    /* renamed from: a */
    private static JSONObject m10264a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fid", str);
        jSONObject.put("appId", str2);
        jSONObject.put("authVersion", "FIS_v2");
        jSONObject.put("sdkVersion", "a:16.2.1");
        return jSONObject;
    }

    /* renamed from: b */
    private static JSONObject m10265b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdkVersion", "a:16.2.1");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("installation", jSONObject);
        return jSONObject2;
    }

    /* renamed from: e */
    private String m10266e() {
        try {
            byte[] a = C1647a.m4563a(this.f6401a, this.f6401a.getPackageName());
            if (a != null) {
                return C1656j.m4597b(a, false);
            }
            "Could not get fingerprint hash for package: " + this.f6401a.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            "No such package: " + this.f6401a.getPackageName();
            return null;
        }
    }

    /* renamed from: f */
    private HttpURLConnection m10267f(URL url, String str) {
        C3198c.C3199a a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.addRequestProperty("Content-Type", "application/json");
        httpURLConnection.addRequestProperty("Accept", "application/json");
        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.addRequestProperty("X-Android-Package", this.f6401a.getPackageName());
        C3198c cVar = this.f6403c;
        if (!(cVar == null || this.f6402b == null || (a = cVar.mo17781a("fire-installations-id")) == C3198c.C3199a.NONE)) {
            httpURLConnection.addRequestProperty("x-firebase-client", this.f6402b.mo17971a());
            httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a.mo17782a()));
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", m10266e());
        httpURLConnection.addRequestProperty("x-goog-api-key", str);
        return httpURLConnection;
    }

    @VisibleForTesting
    /* renamed from: g */
    static long m10268g(String str) {
        C1609u.m4466b(f6399d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: h */
    private C3303d m10269h(HttpURLConnection httpURLConnection) {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(httpURLConnection.getInputStream(), f6400e));
        C3306e.C3307a a = C3306e.m10287a();
        C3303d.C3304a a2 = C3303d.m10275a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.mo17952f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo17949c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo17950d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo17961c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo17962d(m10268g(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo17948b(a.mo17959a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        a2.mo17951e(C3303d.C3305b.OK);
        return a2.mo17947a();
    }

    /* renamed from: i */
    private C3306e m10270i(HttpURLConnection httpURLConnection) {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(httpURLConnection.getInputStream(), f6400e));
        C3306e.C3307a a = C3306e.m10287a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo17961c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo17962d(m10268g(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        a.mo17960b(C3306e.C3308b.OK);
        return a.mo17959a();
    }

    /* renamed from: j */
    private void m10271j(HttpURLConnection httpURLConnection, @NonNull String str, @NonNull String str2) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(m10264a(str, str2).toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
            } catch (JSONException e) {
                throw new IllegalStateException(e);
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        } else {
            throw new IOException("Cannot send CreateInstallation request to FIS. No OutputStream available.");
        }
    }

    /* renamed from: k */
    private void m10272k(HttpURLConnection httpURLConnection) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(m10265b().toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
            } catch (JSONException e) {
                throw new IllegalStateException(e);
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        } else {
            throw new IOException("Cannot send GenerateAuthToken request to FIS. No OutputStream available.");
        }
    }

    @NonNull
    /* renamed from: c */
    public C3303d mo17963c(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5) {
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations", new Object[]{str3})}));
        while (i <= 1) {
            HttpURLConnection f = m10267f(url, str);
            try {
                f.setRequestMethod("POST");
                f.setDoOutput(true);
                if (str5 != null) {
                    f.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                m10271j(f, str2, str4);
                int responseCode = f.getResponseCode();
                if (responseCode == 200) {
                    C3303d h = m10269h(f);
                    f.disconnect();
                    return h;
                } else if (responseCode == 429 || (responseCode >= 500 && responseCode < 600)) {
                    i++;
                    f.disconnect();
                } else {
                    C3303d.C3304a a = C3303d.m10275a();
                    a.mo17951e(C3303d.C3305b.BAD_CONFIG);
                    return a.mo17947a();
                }
            } finally {
                f.disconnect();
            }
        }
        throw new IOException();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0071=Splitter:B:19:0x0071, B:24:0x0088=Splitter:B:24:0x0088} */
    @androidx.annotation.NonNull
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.installations.p136r.C3306e mo17964d(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.NonNull java.lang.String r8, @androidx.annotation.NonNull java.lang.String r9) {
        /*
            r5 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r8
            r8 = 1
            r1[r8] = r7
            java.lang.String r7 = "projects/%s/installations/%s/authTokens:generate"
            java.lang.String r7 = java.lang.String.format(r7, r1)
            java.net.URL r1 = new java.net.URL
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "firebaseinstallations.googleapis.com"
            r3[r2] = r4
            java.lang.String r4 = "v1"
            r3[r8] = r4
            r3[r0] = r7
            java.lang.String r7 = "https://%s/%s/%s"
            java.lang.String r7 = java.lang.String.format(r7, r3)
            r1.<init>(r7)
        L_0x0027:
            if (r2 > r8) goto L_0x009e
            java.net.HttpURLConnection r7 = r5.m10267f(r1, r6)
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "Authorization"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r3.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = "FIS_v2 "
            r3.append(r4)     // Catch:{ all -> 0x0099 }
            r3.append(r9)     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0099 }
            r7.addRequestProperty(r0, r3)     // Catch:{ all -> 0x0099 }
            r5.m10272k(r7)     // Catch:{ all -> 0x0099 }
            int r0 = r7.getResponseCode()     // Catch:{ all -> 0x0099 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 != r3) goto L_0x005b
            com.google.firebase.installations.r.e r6 = r5.m10270i(r7)     // Catch:{ all -> 0x0099 }
            r7.disconnect()
            return r6
        L_0x005b:
            r3 = 401(0x191, float:5.62E-43)
            if (r0 == r3) goto L_0x0088
            r3 = 404(0x194, float:5.66E-43)
            if (r0 != r3) goto L_0x0064
            goto L_0x0088
        L_0x0064:
            r3 = 429(0x1ad, float:6.01E-43)
            if (r0 == r3) goto L_0x0082
            r3 = 500(0x1f4, float:7.0E-43)
            if (r0 < r3) goto L_0x0071
            r3 = 600(0x258, float:8.41E-43)
            if (r0 >= r3) goto L_0x0071
            goto L_0x0082
        L_0x0071:
            com.google.firebase.installations.r.e$a r6 = com.google.firebase.installations.p136r.C3306e.m10287a()     // Catch:{ all -> 0x0099 }
            com.google.firebase.installations.r.e$b r8 = com.google.firebase.installations.p136r.C3306e.C3308b.BAD_CONFIG     // Catch:{ all -> 0x0099 }
            r6.mo17960b(r8)     // Catch:{ all -> 0x0099 }
            com.google.firebase.installations.r.e r6 = r6.mo17959a()     // Catch:{ all -> 0x0099 }
            r7.disconnect()
            return r6
        L_0x0082:
            int r2 = r2 + 1
            r7.disconnect()
            goto L_0x0027
        L_0x0088:
            com.google.firebase.installations.r.e$a r6 = com.google.firebase.installations.p136r.C3306e.m10287a()     // Catch:{ all -> 0x0099 }
            com.google.firebase.installations.r.e$b r8 = com.google.firebase.installations.p136r.C3306e.C3308b.AUTH_ERROR     // Catch:{ all -> 0x0099 }
            r6.mo17960b(r8)     // Catch:{ all -> 0x0099 }
            com.google.firebase.installations.r.e r6 = r6.mo17959a()     // Catch:{ all -> 0x0099 }
            r7.disconnect()
            return r6
        L_0x0099:
            r6 = move-exception
            r7.disconnect()
            throw r6
        L_0x009e:
            java.io.IOException r6 = new java.io.IOException
            r6.<init>()
            goto L_0x00a5
        L_0x00a4:
            throw r6
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p136r.C3302c.mo17964d(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.google.firebase.installations.r.e");
    }
}
