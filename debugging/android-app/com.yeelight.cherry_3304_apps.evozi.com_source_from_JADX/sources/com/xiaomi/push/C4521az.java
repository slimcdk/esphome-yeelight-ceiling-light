package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.miot.service.connection.wifi.WebShellActivity;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.xiaomi.push.az */
public class C4521az {

    /* renamed from: a */
    public static final Pattern f8196a = Pattern.compile("([^\\s;]+)(.*)");

    /* renamed from: b */
    public static final Pattern f8197b = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* renamed from: c */
    public static final Pattern f8198c = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* renamed from: com.xiaomi.push.az$a */
    public static final class C4522a extends FilterInputStream {

        /* renamed from: a */
        private boolean f8199a;

        public C4522a(InputStream inputStream) {
            super(inputStream);
        }

        public int read(byte[] bArr, int i, int i2) {
            int read;
            if (!this.f8199a && (read = super.read(bArr, i, i2)) != -1) {
                return read;
            }
            this.f8199a = true;
            return -1;
        }
    }

    /* renamed from: com.xiaomi.push.az$b */
    public static class C4523b {

        /* renamed from: a */
        public int f8200a;

        /* renamed from: a */
        public Map<String, String> f8201a;

        public String toString() {
            return String.format("resCode = %1$d, headers = %2$s", new Object[]{Integer.valueOf(this.f8200a), this.f8201a.toString()});
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m13351a(android.content.Context r2) {
        /*
            r0 = -1
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch:{ Exception -> 0x0018 }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ Exception -> 0x0018 }
            if (r2 != 0) goto L_0x000c
            return r0
        L_0x000c:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{  }
            if (r2 != 0) goto L_0x0013
            return r0
        L_0x0013:
            int r2 = r2.getType()
            return r2
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4521az.m13351a(android.content.Context):int");
    }

    /* renamed from: a */
    public static NetworkInfo m13352a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r6v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00eb, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ec, code lost:
        r6 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00eb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:20:0x0067] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.xiaomi.push.C4519ax m13353a(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, java.lang.String r8) {
        /*
            com.xiaomi.push.ax r0 = new com.xiaomi.push.ax
            r0.<init>()
            r1 = 0
            java.net.URL r2 = m13360a((java.lang.String) r5)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            java.net.HttpURLConnection r4 = m13358a((android.content.Context) r4, (java.net.URL) r2)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            r2 = 10000(0x2710, float:1.4013E-41)
            r4.setConnectTimeout(r2)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            r2 = 15000(0x3a98, float:2.102E-41)
            r4.setReadTimeout(r2)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            if (r6 != 0) goto L_0x001c
            java.lang.String r6 = "GET"
        L_0x001c:
            r4.setRequestMethod(r6)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            if (r7 == 0) goto L_0x003f
            java.util.Set r6 = r7.keySet()     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
        L_0x0029:
            boolean r2 = r6.hasNext()     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r6.next()     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            java.lang.Object r3 = r7.get(r2)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            r4.setRequestProperty(r2, r3)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            goto L_0x0029
        L_0x003f:
            boolean r6 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            r7 = 0
            r2 = 1
            if (r6 != 0) goto L_0x0067
            r4.setDoOutput(r2)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            byte[] r6 = r8.getBytes()     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            java.io.OutputStream r8 = r4.getOutputStream()     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            int r3 = r6.length     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            r8.write(r6, r7, r3)     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            r8.flush()     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            r8.close()     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            goto L_0x0067
        L_0x005d:
            r4 = move-exception
            r6 = r1
            r1 = r8
            goto L_0x00ed
        L_0x0062:
            r4 = move-exception
            r6 = r1
            r1 = r8
            goto L_0x00f9
        L_0x0067:
            int r6 = r4.getResponseCode()     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            r0.f8193a = r6     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            r6.<init>()     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            java.lang.String r8 = "Http POST Response Code: "
            r6.append(r8)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            int r8 = r0.f8193a     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            r6.append(r8)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            r6.toString()     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
        L_0x007f:
            java.lang.String r6 = r4.getHeaderFieldKey(r7)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            java.lang.String r8 = r4.getHeaderField(r7)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            if (r6 != 0) goto L_0x00e2
            if (r8 != 0) goto L_0x00e2
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException -> 0x009f, all -> 0x00eb }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x009f, all -> 0x00eb }
            com.xiaomi.push.az$a r8 = new com.xiaomi.push.az$a     // Catch:{ IOException -> 0x009f, all -> 0x00eb }
            java.io.InputStream r2 = r4.getInputStream()     // Catch:{ IOException -> 0x009f, all -> 0x00eb }
            r8.<init>(r2)     // Catch:{ IOException -> 0x009f, all -> 0x00eb }
            r7.<init>(r8)     // Catch:{ IOException -> 0x009f, all -> 0x00eb }
            r6.<init>(r7)     // Catch:{ IOException -> 0x009f, all -> 0x00eb }
            goto L_0x00b2
        L_0x009f:
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            com.xiaomi.push.az$a r8 = new com.xiaomi.push.az$a     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            java.io.InputStream r4 = r4.getErrorStream()     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            r8.<init>(r4)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            r7.<init>(r8)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
        L_0x00b2:
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r7.<init>()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.lang.String r8 = "line.separator"
            java.lang.String r8 = java.lang.System.getProperty(r8)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
        L_0x00c1:
            if (r4 == 0) goto L_0x00ce
            r7.append(r4)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r7.append(r8)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            goto L_0x00c1
        L_0x00ce:
            java.lang.String r4 = r7.toString()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r0.f8194a = r4     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r6.close()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r1)
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r1)
            return r0
        L_0x00de:
            r4 = move-exception
            goto L_0x00ed
        L_0x00e0:
            r4 = move-exception
            goto L_0x00f9
        L_0x00e2:
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.f8195a     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            r3.put(r6, r8)     // Catch:{ IOException -> 0x00f7, all -> 0x00eb }
            int r7 = r7 + 1
            int r7 = r7 + r2
            goto L_0x007f
        L_0x00eb:
            r4 = move-exception
            r6 = r1
        L_0x00ed:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x0120 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0120 }
            r5.<init>(r4)     // Catch:{ all -> 0x0120 }
            throw r5     // Catch:{ all -> 0x0120 }
        L_0x00f7:
            r4 = move-exception
            r6 = r1
        L_0x00f9:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0120 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
            r8.<init>()     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = "err while request "
            r8.append(r0)     // Catch:{ all -> 0x0120 }
            r8.append(r5)     // Catch:{ all -> 0x0120 }
            java.lang.String r5 = ":"
            r8.append(r5)     // Catch:{ all -> 0x0120 }
            java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0120 }
            java.lang.String r4 = r4.getSimpleName()     // Catch:{ all -> 0x0120 }
            r8.append(r4)     // Catch:{ all -> 0x0120 }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x0120 }
            r7.<init>(r4)     // Catch:{ all -> 0x0120 }
            throw r7     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r4 = move-exception
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r1)
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r6)
            goto L_0x0129
        L_0x0128:
            throw r4
        L_0x0129:
            goto L_0x0128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4521az.m13353a(android.content.Context, java.lang.String, java.lang.String, java.util.Map, java.lang.String):com.xiaomi.push.ax");
    }

    /* renamed from: a */
    public static C4519ax m13354a(Context context, String str, Map<String, String> map) {
        return m13353a(context, str, "POST", (Map<String, String>) null, m13362a(map));
    }

    /* renamed from: a */
    public static InputStream m13355a(Context context, URL url, boolean z, String str, String str2) {
        return m13356a(context, url, z, str, str2, (Map<String, String>) null, (C4523b) null);
    }

    /* renamed from: a */
    public static InputStream m13356a(Context context, URL url, boolean z, String str, String str2, Map<String, String> map, C4523b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("context");
        } else if (url != null) {
            URL url2 = !z ? new URL(m13360a(url.toString())) : url;
            try {
                HttpURLConnection.setFollowRedirects(true);
                HttpURLConnection a = m13358a(context, url2);
                a.setConnectTimeout(10000);
                a.setReadTimeout(15000);
                if (!TextUtils.isEmpty(str)) {
                    a.setRequestProperty("User-Agent", str);
                }
                if (str2 != null) {
                    a.setRequestProperty("Cookie", str2);
                }
                if (map != null) {
                    for (String next : map.keySet()) {
                        a.setRequestProperty(next, map.get(next));
                    }
                }
                if (bVar != null && (url.getProtocol().equals("http") || url.getProtocol().equals("https"))) {
                    bVar.f8200a = a.getResponseCode();
                    if (bVar.f8201a == null) {
                        bVar.f8201a = new HashMap();
                    }
                    int i = 0;
                    while (true) {
                        String headerFieldKey = a.getHeaderFieldKey(i);
                        String headerField = a.getHeaderField(i);
                        if (headerFieldKey == null && headerField == null) {
                            break;
                        }
                        if (!TextUtils.isEmpty(headerFieldKey)) {
                            if (!TextUtils.isEmpty(headerField)) {
                                bVar.f8201a.put(headerFieldKey, headerField);
                            }
                        }
                        i++;
                    }
                }
                return new C4522a(a.getInputStream());
            } catch (IOException e) {
                throw new IOException("IOException:" + e.getClass().getSimpleName());
            } catch (Throwable th) {
                throw new IOException(th.getMessage());
            }
        } else {
            throw new IllegalArgumentException(WebShellActivity.ARGS_KEY_URL);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13357a(android.content.Context r3) {
        /*
            java.lang.String r0 = ""
            boolean r1 = m13368d(r3)
            if (r1 == 0) goto L_0x000b
            java.lang.String r3 = "wifi"
            return r3
        L_0x000b:
            java.lang.String r1 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch:{ Exception -> 0x0048 }
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch:{ Exception -> 0x0048 }
            if (r3 != 0) goto L_0x0016
            return r0
        L_0x0016:
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()     // Catch:{  }
            if (r3 != 0) goto L_0x001d
            return r0
        L_0x001d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getTypeName()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.lang.String r2 = r3.getSubtypeName()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r3 = r3.getExtraInfo()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r3.toLowerCase()
            return r3
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4521az.m13357a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public static String m13358a(Context context, URL url) {
        return m13359a(context, url, false, (String) null, "UTF-8", (String) null);
    }

    /* renamed from: a */
    public static String m13359a(Context context, URL url, boolean z, String str, String str2, String str3) {
        InputStream inputStream;
        try {
            inputStream = m13355a(context, url, z, str, str3);
            try {
                StringBuilder sb = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (-1 != read) {
                        sb.append(cArr, 0, read);
                    } else {
                        C4942y.m15884a((Closeable) inputStream);
                        return sb.toString();
                    }
                }
            } catch (Throwable th) {
                th = th;
                C4942y.m15884a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C4942y.m15884a((Closeable) inputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m13360a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new String();
        return String.format("%s&key=%s", new Object[]{str, C4531be.m13428a(String.format("%sbe988a6134bc8254465424e5a70ef037", new Object[]{str}))});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13361a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, java.io.File r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "--"
            java.lang.String r1 = "\r\n"
            boolean r2 = r9.exists()
            r3 = 0
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            java.lang.String r2 = r9.getName()
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r4.<init>(r7)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.net.URLConnection r7 = r4.openConnection()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r4 = 15000(0x3a98, float:2.102E-41)
            r7.setReadTimeout(r4)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r4 = 10000(0x2710, float:1.4013E-41)
            r7.setConnectTimeout(r4)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r4 = 1
            r7.setDoInput(r4)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r7.setDoOutput(r4)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r4 = 0
            r7.setUseCaches(r4)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.String r5 = "POST"
            r7.setRequestMethod(r5)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.String r5 = "Connection"
            java.lang.String r6 = "Keep-Alive"
            r7.setRequestProperty(r5, r6)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.String r5 = "Content-Type"
            java.lang.String r6 = "multipart/form-data;boundary=*****"
            r7.setRequestProperty(r5, r6)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            if (r8 == 0) goto L_0x0069
            java.util.Set r8 = r8.entrySet()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
        L_0x004d:
            boolean r5 = r8.hasNext()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            if (r5 == 0) goto L_0x0069
            java.lang.Object r5 = r8.next()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r7.setRequestProperty(r6, r5)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            goto L_0x004d
        L_0x0069:
            int r8 = r2.length()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            int r8 = r8 + 77
            long r5 = r9.length()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            int r2 = (int) r5     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            int r8 = r8 + r2
            int r2 = r10.length()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            int r8 = r8 + r2
            r7.setFixedLengthStreamingMode(r8)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.io.DataOutputStream r8 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.io.OutputStream r2 = r7.getOutputStream()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r8.<init>(r2)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.String r2 = "--*****\r\n"
            r8.writeBytes(r2)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r2.<init>()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.String r5 = "Content-Disposition: form-data; name=\""
            r2.append(r5)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r2.append(r10)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.String r10 = "\";filename=\""
            r2.append(r10)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.String r10 = r9.getName()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r2.append(r10)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.String r10 = "\""
            r2.append(r10)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r2.append(r1)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.lang.String r10 = r2.toString()     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r8.writeBytes(r10)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r8.writeBytes(r1)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r10.<init>(r9)     // Catch:{ IOException -> 0x0126, all -> 0x011a }
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r9]     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
        L_0x00bf:
            int r2 = r10.read(r9)     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            r5 = -1
            if (r2 == r5) goto L_0x00cd
            r8.write(r9, r4, r2)     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            r8.flush()     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            goto L_0x00bf
        L_0x00cd:
            r8.writeBytes(r1)     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            r8.writeBytes(r0)     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            java.lang.String r9 = "*****"
            r8.writeBytes(r9)     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            r8.writeBytes(r0)     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            r8.writeBytes(r1)     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            r8.flush()     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            java.lang.StringBuffer r8 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            r8.<init>()     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            com.xiaomi.push.az$a r1 = new com.xiaomi.push.az$a     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            r1.<init>(r7)     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
        L_0x00f9:
            java.lang.String r7 = r9.readLine()     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            if (r7 == 0) goto L_0x0103
            r8.append(r7)     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            goto L_0x00f9
        L_0x0103:
            java.lang.String r7 = r8.toString()     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r10)
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r9)
            return r7
        L_0x010e:
            r7 = move-exception
            goto L_0x0114
        L_0x0110:
            r7 = move-exception
            goto L_0x0118
        L_0x0112:
            r7 = move-exception
            r9 = r3
        L_0x0114:
            r3 = r10
            goto L_0x011c
        L_0x0116:
            r7 = move-exception
            r9 = r3
        L_0x0118:
            r3 = r10
            goto L_0x0128
        L_0x011a:
            r7 = move-exception
            r9 = r3
        L_0x011c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0147 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0147 }
            r8.<init>(r7)     // Catch:{ all -> 0x0147 }
            throw r8     // Catch:{ all -> 0x0147 }
        L_0x0126:
            r7 = move-exception
            r9 = r3
        L_0x0128:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            r10.<init>()     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "IOException:"
            r10.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.Class r7 = r7.getClass()     // Catch:{ all -> 0x0147 }
            java.lang.String r7 = r7.getSimpleName()     // Catch:{ all -> 0x0147 }
            r10.append(r7)     // Catch:{ all -> 0x0147 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x0147 }
            r8.<init>(r7)     // Catch:{ all -> 0x0147 }
            throw r8     // Catch:{ all -> 0x0147 }
        L_0x0147:
            r7 = move-exception
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r3)
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r9)
            goto L_0x0150
        L_0x014f:
            throw r7
        L_0x0150:
            goto L_0x014f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4521az.m13361a(java.lang.String, java.util.Map, java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m13362a(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry next : map.entrySet()) {
            if (!(next.getKey() == null || next.getValue() == null)) {
                try {
                    stringBuffer.append(URLEncoder.encode((String) next.getKey(), "UTF-8"));
                    stringBuffer.append("=");
                    stringBuffer.append(URLEncoder.encode((String) next.getValue(), "UTF-8"));
                    stringBuffer.append("&");
                } catch (UnsupportedEncodingException e) {
                    "Failed to convert from params map to string: " + e.toString();
                    "map: " + map.toString();
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static HttpURLConnection m13363a(Context context, URL url) {
        return (HttpURLConnection) (("http".equals(url.getProtocol()) && m13351a(context)) ? url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80))) : url.openConnection());
    }

    /* renamed from: a */
    private static URL m13364a(String str) {
        return new URL(str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13365a(android.content.Context r3) {
        /*
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSimCountryIso()
            java.lang.String r1 = "CN"
            boolean r0 = r1.equalsIgnoreCase(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0016
            return r1
        L_0x0016:
            java.lang.String r0 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x0044 }
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch:{ Exception -> 0x0044 }
            if (r3 != 0) goto L_0x0021
            return r1
        L_0x0021:
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()     // Catch:{  }
            if (r3 != 0) goto L_0x0028
            return r1
        L_0x0028:
            java.lang.String r3 = r3.getExtraInfo()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0044
            int r0 = r3.length()
            r2 = 3
            if (r0 >= r2) goto L_0x003a
            goto L_0x0044
        L_0x003a:
            java.lang.String r0 = "ctwap"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x0044
            r3 = 1
            return r3
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4521az.m13365a(android.content.Context):boolean");
    }

    /* renamed from: b */
    public static boolean m13366b(Context context) {
        return m13351a(context) >= 0;
    }

    /* renamed from: c */
    public static boolean m13367c(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r2 = r2.getActiveNetworkInfo();
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13368d(android.content.Context r2) {
        /*
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch:{ Exception -> 0x001b }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ Exception -> 0x001b }
            if (r2 != 0) goto L_0x000c
            return r0
        L_0x000c:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{  }
            if (r2 != 0) goto L_0x0013
            return r0
        L_0x0013:
            int r2 = r2.getType()
            r1 = 1
            if (r1 != r2) goto L_0x001b
            r0 = 1
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4521az.m13368d(android.content.Context):boolean");
    }

    /* renamed from: e */
    public static boolean m13369e(Context context) {
        return m13370f(context) || m13371g(context) || m13372h(context);
    }

    /* renamed from: f */
    public static boolean m13370f(Context context) {
        NetworkInfo a = m13351a(context);
        return a != null && a.getType() == 0 && 13 == a.getSubtype();
    }

    /* renamed from: g */
    public static boolean m13371g(Context context) {
        NetworkInfo a = m13351a(context);
        if (a == null || a.getType() != 0) {
            return false;
        }
        String subtypeName = a.getSubtypeName();
        if (!"TD-SCDMA".equalsIgnoreCase(subtypeName) && !"CDMA2000".equalsIgnoreCase(subtypeName) && !"WCDMA".equalsIgnoreCase(subtypeName)) {
            switch (a.getSubtype()) {
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m13372h(Context context) {
        NetworkInfo a = m13351a(context);
        if (a == null || a.getType() != 0) {
            return false;
        }
        int subtype = a.getSubtype();
        return subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11;
    }
}
