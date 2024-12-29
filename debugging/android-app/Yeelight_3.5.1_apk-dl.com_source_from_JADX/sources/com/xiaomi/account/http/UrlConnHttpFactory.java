package com.xiaomi.account.http;

import android.text.TextUtils;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.Map;

public class UrlConnHttpFactory extends HttpFactory {

    private class HttpUrlConnClient implements HttpClient {
        private static final String BODY_STRING_SPLIT = "&";
        private static final String TAG = "HttpUrlConnClient";
        HttpClientConfig config;

        private HttpUrlConnClient(HttpClientConfig httpClientConfig) {
            this.config = httpClientConfig;
            CookieHandler.setDefault(new CookieManager());
            ((CookieManager) CookieHandler.getDefault()).setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ee A[SYNTHETIC, Splitter:B:36:0x00ee] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.xiaomi.account.http.Response excute(com.xiaomi.account.http.Request r6) {
            /*
                r5 = this;
                java.net.URL r0 = new java.net.URL
                java.lang.String r1 = r6.url
                r0.<init>(r1)
                java.net.URLConnection r0 = r0.openConnection()
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
                com.xiaomi.account.http.HttpClientConfig r1 = r5.config     // Catch:{ all -> 0x00fa }
                long r1 = r1.connectTimeoutMs     // Catch:{ all -> 0x00fa }
                int r2 = (int) r1     // Catch:{ all -> 0x00fa }
                r0.setConnectTimeout(r2)     // Catch:{ all -> 0x00fa }
                com.xiaomi.account.http.HttpClientConfig r1 = r5.config     // Catch:{ all -> 0x00fa }
                long r1 = r1.readTimeoutMs     // Catch:{ all -> 0x00fa }
                int r2 = (int) r1     // Catch:{ all -> 0x00fa }
                r0.setReadTimeout(r2)     // Catch:{ all -> 0x00fa }
                java.util.Map<java.lang.String, java.lang.String> r1 = r6.formBody     // Catch:{ all -> 0x00fa }
                if (r1 == 0) goto L_0x002e
                r1 = 1
                r0.setDoInput(r1)     // Catch:{ all -> 0x00fa }
                r0.setDoOutput(r1)     // Catch:{ all -> 0x00fa }
                java.lang.String r1 = "POST"
            L_0x002a:
                r0.setRequestMethod(r1)     // Catch:{ all -> 0x00fa }
                goto L_0x0031
            L_0x002e:
                java.lang.String r1 = "GET"
                goto L_0x002a
            L_0x0031:
                boolean r1 = r6.followRedirects     // Catch:{ all -> 0x00fa }
                r0.setInstanceFollowRedirects(r1)     // Catch:{ all -> 0x00fa }
                java.util.Map<java.lang.String, java.lang.String> r1 = r6.headers     // Catch:{ all -> 0x00fa }
                if (r1 == 0) goto L_0x005e
                java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x00fa }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00fa }
            L_0x0042:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00fa }
                if (r2 == 0) goto L_0x005e
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00fa }
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00fa }
                java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00fa }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00fa }
                java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00fa }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00fa }
                r0.setRequestProperty(r3, r2)     // Catch:{ all -> 0x00fa }
                goto L_0x0042
            L_0x005e:
                r0.connect()     // Catch:{ all -> 0x00fa }
                java.util.Map<java.lang.String, java.lang.String> r1 = r6.formBody     // Catch:{ all -> 0x00fa }
                if (r1 == 0) goto L_0x0087
                java.io.OutputStream r1 = r0.getOutputStream()     // Catch:{ all -> 0x00fa }
                java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ all -> 0x00fa }
                java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00fa }
                java.lang.String r4 = "UTF-8"
                r3.<init>(r1, r4)     // Catch:{ all -> 0x00fa }
                r2.<init>(r3)     // Catch:{ all -> 0x00fa }
                java.util.Map<java.lang.String, java.lang.String> r6 = r6.formBody     // Catch:{ all -> 0x00fa }
                java.lang.String r6 = com.xiaomi.account.http.UrlConnHttpFactory.joinToQuery(r6)     // Catch:{ all -> 0x00fa }
                r2.write(r6)     // Catch:{ all -> 0x00fa }
                r2.flush()     // Catch:{ all -> 0x00fa }
                r2.close()     // Catch:{ all -> 0x00fa }
                r1.close()     // Catch:{ all -> 0x00fa }
            L_0x0087:
                int r6 = r0.getResponseCode()     // Catch:{ all -> 0x00fa }
                com.xiaomi.account.http.Response$Builder r1 = new com.xiaomi.account.http.Response$Builder     // Catch:{ all -> 0x00fa }
                r1.<init>()     // Catch:{ all -> 0x00fa }
                com.xiaomi.account.http.Response$Builder r1 = r1.code(r6)     // Catch:{ all -> 0x00fa }
                java.lang.String r2 = "Location"
                java.lang.String r2 = r0.getHeaderField(r2)     // Catch:{ all -> 0x00fa }
                com.xiaomi.account.http.Response$Builder r1 = r1.location(r2)     // Catch:{ all -> 0x00fa }
                java.lang.String r2 = "Set-Cookie"
                java.lang.String r2 = r0.getHeaderField(r2)     // Catch:{ all -> 0x00fa }
                com.xiaomi.account.http.Response$Builder r1 = r1.setCookie(r2)     // Catch:{ all -> 0x00fa }
                java.util.Map r2 = r0.getHeaderFields()     // Catch:{ all -> 0x00fa }
                com.xiaomi.account.http.Response$Builder r1 = r1.headers(r2)     // Catch:{ all -> 0x00fa }
                r2 = 200(0xc8, float:2.8E-43)
                if (r6 != r2) goto L_0x00f2
                r6 = 0
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x00e9 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x00e9 }
                java.io.InputStream r4 = r0.getInputStream()     // Catch:{ all -> 0x00e9 }
                r3.<init>(r4)     // Catch:{ all -> 0x00e9 }
                r4 = 1024(0x400, float:1.435E-42)
                r2.<init>(r3, r4)     // Catch:{ all -> 0x00e9 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e7 }
                r6.<init>()     // Catch:{ all -> 0x00e7 }
            L_0x00ca:
                java.lang.String r3 = r2.readLine()     // Catch:{ all -> 0x00e7 }
                if (r3 == 0) goto L_0x00d4
                r6.append(r3)     // Catch:{ all -> 0x00e7 }
                goto L_0x00ca
            L_0x00d4:
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00e7 }
                com.xiaomi.account.http.Response$Builder r6 = r1.body(r6)     // Catch:{ all -> 0x00e7 }
                com.xiaomi.account.http.Response r6 = r6.build()     // Catch:{ all -> 0x00e7 }
                r2.close()     // Catch:{ all -> 0x00fa }
                r0.disconnect()
                return r6
            L_0x00e7:
                r6 = move-exception
                goto L_0x00ec
            L_0x00e9:
                r1 = move-exception
                r2 = r6
                r6 = r1
            L_0x00ec:
                if (r2 == 0) goto L_0x00f1
                r2.close()     // Catch:{ all -> 0x00fa }
            L_0x00f1:
                throw r6     // Catch:{ all -> 0x00fa }
            L_0x00f2:
                com.xiaomi.account.http.Response r6 = r1.build()     // Catch:{ all -> 0x00fa }
                r0.disconnect()
                return r6
            L_0x00fa:
                r6 = move-exception
                r0.disconnect()
                goto L_0x0100
            L_0x00ff:
                throw r6
            L_0x0100:
                goto L_0x00ff
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.account.http.UrlConnHttpFactory.HttpUrlConnClient.excute(com.xiaomi.account.http.Request):com.xiaomi.account.http.Response");
        }
    }

    public static String joinToQuery(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (z) {
                    z = false;
                } else {
                    sb.append("&");
                }
                sb.append(str);
                sb.append("=");
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public HttpClient createHttpClient(HttpClientConfig httpClientConfig) {
        return new HttpUrlConnClient(httpClientConfig);
    }
}
