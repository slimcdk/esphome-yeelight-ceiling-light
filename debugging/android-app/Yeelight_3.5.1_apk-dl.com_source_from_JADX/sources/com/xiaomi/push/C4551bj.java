package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.miot.service.connection.wifi.WebShellActivity;
import com.xiaomi.channel.commonutils.logger.C4408b;
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

/* renamed from: com.xiaomi.push.bj */
public class C4551bj {

    /* renamed from: a */
    public static final Pattern f7648a = Pattern.compile("([^\\s;]+)(.*)");

    /* renamed from: b */
    public static final Pattern f7649b = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* renamed from: c */
    public static final Pattern f7650c = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* renamed from: com.xiaomi.push.bj$a */
    public static final class C4552a extends FilterInputStream {

        /* renamed from: a */
        private boolean f7651a;

        public C4552a(InputStream inputStream) {
            super(inputStream);
        }

        public int read(byte[] bArr, int i, int i2) {
            int read;
            if (!this.f7651a && (read = super.read(bArr, i, i2)) != -1) {
                return read;
            }
            this.f7651a = true;
            return -1;
        }
    }

    /* renamed from: com.xiaomi.push.bj$b */
    public static class C4553b {

        /* renamed from: a */
        public int f7652a;

        /* renamed from: a */
        public Map<String, String> f7653a;

        public String toString() {
            return String.format("resCode = %1$d, headers = %2$s", new Object[]{Integer.valueOf(this.f7652a), this.f7653a.toString()});
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m12985a(android.content.Context r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4551bj.m12985a(android.content.Context):int");
    }

    /* renamed from: a */
    public static NetworkInfo m12986a(Context context) {
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010a, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010b, code lost:
        r8 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00be */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:24:0x0082] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.xiaomi.push.C4549bh m12987a(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9, java.lang.String r10) {
        /*
            com.xiaomi.push.bh r0 = new com.xiaomi.push.bh
            r0.<init>()
            r1 = 0
            java.net.URL r2 = m12994a((java.lang.String) r7)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.net.HttpURLConnection r6 = m12992a((android.content.Context) r6, (java.net.URL) r2)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r2 = 10000(0x2710, float:1.4013E-41)
            r6.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r2 = 15000(0x3a98, float:2.102E-41)
            r6.setReadTimeout(r2)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            if (r8 != 0) goto L_0x001c
            java.lang.String r8 = "GET"
        L_0x001c:
            r6.setRequestMethod(r8)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r8 = 0
            if (r9 == 0) goto L_0x004e
            java.lang.String r2 = "gzip"
            java.lang.String r3 = "Content-Encoding"
            java.lang.Object r3 = r9.get(r3)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.util.Set r3 = r9.keySet()     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x0116, all -> 0x010a }
        L_0x0038:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            if (r4 == 0) goto L_0x004f
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.lang.Object r5 = r9.get(r4)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r6.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            goto L_0x0038
        L_0x004e:
            r2 = 0
        L_0x004f:
            boolean r9 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r3 = 1
            if (r9 != 0) goto L_0x0082
            r6.setDoOutput(r3)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            byte[] r9 = r10.getBytes()     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            if (r2 == 0) goto L_0x0069
            java.util.zip.GZIPOutputStream r10 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.io.OutputStream r2 = r6.getOutputStream()     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r10.<init>(r2)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            goto L_0x006d
        L_0x0069:
            java.io.OutputStream r10 = r6.getOutputStream()     // Catch:{ IOException -> 0x0116, all -> 0x010a }
        L_0x006d:
            int r2 = r9.length     // Catch:{ IOException -> 0x007d, all -> 0x0078 }
            r10.write(r9, r8, r2)     // Catch:{ IOException -> 0x007d, all -> 0x0078 }
            r10.flush()     // Catch:{ IOException -> 0x007d, all -> 0x0078 }
            r10.close()     // Catch:{ IOException -> 0x007d, all -> 0x0078 }
            goto L_0x0082
        L_0x0078:
            r6 = move-exception
            r8 = r1
            r1 = r10
            goto L_0x010c
        L_0x007d:
            r6 = move-exception
            r8 = r1
            r1 = r10
            goto L_0x0118
        L_0x0082:
            int r9 = r6.getResponseCode()     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r0.f7645a = r9     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r9.<init>()     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.lang.String r10 = "Http POST Response Code: "
            r9.append(r10)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            int r10 = r0.f7645a     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r9.append(r10)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r9)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
        L_0x009e:
            java.lang.String r9 = r6.getHeaderFieldKey(r8)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.lang.String r10 = r6.getHeaderField(r8)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            if (r9 != 0) goto L_0x0101
            if (r10 != 0) goto L_0x0101
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00be, all -> 0x010a }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00be, all -> 0x010a }
            com.xiaomi.push.bj$a r10 = new com.xiaomi.push.bj$a     // Catch:{ IOException -> 0x00be, all -> 0x010a }
            java.io.InputStream r2 = r6.getInputStream()     // Catch:{ IOException -> 0x00be, all -> 0x010a }
            r10.<init>(r2)     // Catch:{ IOException -> 0x00be, all -> 0x010a }
            r9.<init>(r10)     // Catch:{ IOException -> 0x00be, all -> 0x010a }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00be, all -> 0x010a }
            goto L_0x00d1
        L_0x00be:
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            com.xiaomi.push.bj$a r10 = new com.xiaomi.push.bj$a     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            java.io.InputStream r6 = r6.getErrorStream()     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r10.<init>(r6)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r9.<init>(r10)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r8.<init>(r9)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
        L_0x00d1:
            java.lang.String r6 = r8.readLine()     // Catch:{ IOException -> 0x00ff, all -> 0x00fd }
            java.lang.StringBuffer r9 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x00ff, all -> 0x00fd }
            r9.<init>()     // Catch:{ IOException -> 0x00ff, all -> 0x00fd }
            java.lang.String r10 = "line.separator"
            java.lang.String r10 = java.lang.System.getProperty(r10)     // Catch:{ IOException -> 0x00ff, all -> 0x00fd }
        L_0x00e0:
            if (r6 == 0) goto L_0x00ed
            r9.append(r6)     // Catch:{ IOException -> 0x00ff, all -> 0x00fd }
            r9.append(r10)     // Catch:{ IOException -> 0x00ff, all -> 0x00fd }
            java.lang.String r6 = r8.readLine()     // Catch:{ IOException -> 0x00ff, all -> 0x00fd }
            goto L_0x00e0
        L_0x00ed:
            java.lang.String r6 = r9.toString()     // Catch:{ IOException -> 0x00ff, all -> 0x00fd }
            r0.f7646a = r6     // Catch:{ IOException -> 0x00ff, all -> 0x00fd }
            r8.close()     // Catch:{ IOException -> 0x00ff, all -> 0x00fd }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r1)
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r1)
            return r0
        L_0x00fd:
            r6 = move-exception
            goto L_0x010c
        L_0x00ff:
            r6 = move-exception
            goto L_0x0118
        L_0x0101:
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.f7647a     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            r2.put(r9, r10)     // Catch:{ IOException -> 0x0116, all -> 0x010a }
            int r8 = r8 + 1
            int r8 = r8 + r3
            goto L_0x009e
        L_0x010a:
            r6 = move-exception
            r8 = r1
        L_0x010c:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x013f }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x013f }
            r7.<init>(r6)     // Catch:{ all -> 0x013f }
            throw r7     // Catch:{ all -> 0x013f }
        L_0x0116:
            r6 = move-exception
            r8 = r1
        L_0x0118:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x013f }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x013f }
            r10.<init>()     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "err while request "
            r10.append(r0)     // Catch:{ all -> 0x013f }
            r10.append(r7)     // Catch:{ all -> 0x013f }
            java.lang.String r7 = ":"
            r10.append(r7)     // Catch:{ all -> 0x013f }
            java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x013f }
            java.lang.String r6 = r6.getSimpleName()     // Catch:{ all -> 0x013f }
            r10.append(r6)     // Catch:{ all -> 0x013f }
            java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x013f }
            r9.<init>(r6)     // Catch:{ all -> 0x013f }
            throw r9     // Catch:{ all -> 0x013f }
        L_0x013f:
            r6 = move-exception
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r1)
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r8)
            goto L_0x0148
        L_0x0147:
            throw r6
        L_0x0148:
            goto L_0x0147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4551bj.m12987a(android.content.Context, java.lang.String, java.lang.String, java.util.Map, java.lang.String):com.xiaomi.push.bh");
    }

    /* renamed from: a */
    public static C4549bh m12988a(Context context, String str, Map<String, String> map) {
        return m12987a(context, str, "POST", (Map<String, String>) null, m12996a(map));
    }

    /* renamed from: a */
    public static InputStream m12989a(Context context, URL url, boolean z, String str, String str2) {
        return m12990a(context, url, z, str, str2, (Map<String, String>) null, (C4553b) null);
    }

    /* renamed from: a */
    public static InputStream m12990a(Context context, URL url, boolean z, String str, String str2, Map<String, String> map, C4553b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("context");
        } else if (url != null) {
            URL url2 = !z ? new URL(m12994a(url.toString())) : url;
            try {
                HttpURLConnection.setFollowRedirects(true);
                HttpURLConnection a = m12992a(context, url2);
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
                    bVar.f7652a = a.getResponseCode();
                    if (bVar.f7653a == null) {
                        bVar.f7653a = new HashMap();
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
                                bVar.f7653a.put(headerFieldKey, headerField);
                            }
                        }
                        i++;
                    }
                }
                return new C4552a(a.getInputStream());
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
    public static java.lang.String m12991a(android.content.Context r3) {
        /*
            java.lang.String r0 = ""
            boolean r1 = m13003e(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4551bj.m12991a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public static String m12992a(Context context, URL url) {
        return m12993a(context, url, false, (String) null, "UTF-8", (String) null);
    }

    /* renamed from: a */
    public static String m12993a(Context context, URL url, boolean z, String str, String str2, String str3) {
        InputStream inputStream;
        try {
            inputStream = m12989a(context, url, z, str, str3);
            try {
                StringBuilder sb = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (-1 != read) {
                        sb.append(cArr, 0, read);
                    } else {
                        C4506ab.m12831a((Closeable) inputStream);
                        return sb.toString();
                    }
                }
            } catch (Throwable th) {
                th = th;
                C4506ab.m12831a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C4506ab.m12831a((Closeable) inputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m12994a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new String();
        return String.format("%s&key=%s", new Object[]{str, C4560bo.m13038a(String.format("%sbe988a6134bc8254465424e5a70ef037", new Object[]{str}))});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m12995a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, java.io.File r9, java.lang.String r10) {
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
            com.xiaomi.push.bj$a r1 = new com.xiaomi.push.bj$a     // Catch:{ IOException -> 0x0116, all -> 0x0112 }
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
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r10)
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r9)
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
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r3)
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r9)
            goto L_0x0150
        L_0x014f:
            throw r7
        L_0x0150:
            goto L_0x014f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4551bj.m12995a(java.lang.String, java.util.Map, java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m12996a(Map<String, String> map) {
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
                    C4408b.m12464a("Failed to convert from params map to string: " + e);
                    C4408b.m12464a("map: " + map.toString());
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
    public static HttpURLConnection m12997a(Context context, URL url) {
        return (HttpURLConnection) (("http".equals(url.getProtocol()) && m12985a(context)) ? url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80))) : url.openConnection());
    }

    /* renamed from: a */
    private static URL m12998a(String str) {
        return new URL(str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m12999a(android.content.Context r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4551bj.m12999a(android.content.Context):boolean");
    }

    /* renamed from: b */
    public static boolean m13000b(Context context) {
        return m12985a(context) >= 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13001c(android.content.Context r4) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r1 = 0
            if (r0 == 0) goto L_0x0027
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L_0x0022
            android.net.Network r2 = r0.getActiveNetwork()     // Catch:{ Exception -> 0x0027 }
            android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r2)     // Catch:{ Exception -> 0x0027 }
            if (r0 == 0) goto L_0x0027
            r2 = 16
            boolean r0 = r0.hasCapability(r2)     // Catch:{ Exception -> 0x0027 }
            goto L_0x0028
        L_0x0022:
            boolean r0 = m13000b(r4)
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            boolean r4 = m13002d(r4)
            if (r4 == 0) goto L_0x0031
            r1 = 1
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4551bj.m13001c(android.content.Context):boolean");
    }

    /* renamed from: d */
    public static boolean m13002d(Context context) {
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
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13003e(android.content.Context r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4551bj.m13003e(android.content.Context):boolean");
    }

    /* renamed from: f */
    public static boolean m13004f(Context context) {
        NetworkInfo a = m12985a(context);
        return a != null && a.getType() == 0 && 20 == a.getSubtype();
    }

    /* renamed from: g */
    public static boolean m13005g(Context context) {
        NetworkInfo a = m12985a(context);
        return a != null && a.getType() == 0 && 13 == a.getSubtype();
    }

    /* renamed from: h */
    public static boolean m13006h(Context context) {
        NetworkInfo a = m12985a(context);
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

    /* renamed from: i */
    public static boolean m13007i(Context context) {
        NetworkInfo a = m12985a(context);
        if (a == null || a.getType() != 0) {
            return false;
        }
        int subtype = a.getSubtype();
        return subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11;
    }
}
