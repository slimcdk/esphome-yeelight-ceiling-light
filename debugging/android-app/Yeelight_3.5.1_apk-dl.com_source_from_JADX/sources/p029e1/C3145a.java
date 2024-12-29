package p029e1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e1.a */
public class C3145a {

    /* renamed from: a */
    private final String f5041a;

    /* renamed from: b */
    private final Map<String, String> f5042b;

    /* renamed from: c */
    private final Map<String, String> f5043c = new HashMap();

    public C3145a(String str, Map<String, String> map) {
        this.f5041a = str;
        this.f5042b = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x002c, code lost:
        if (r1.getValue() != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002e, code lost:
        r1 = (java.lang.String) r1.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0035, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0036, code lost:
        r2.append(r1);
        r0.append(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0044, code lost:
        if (r7.hasNext() == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        r1 = r7.next();
        r2 = new java.lang.StringBuilder();
        r2.append("&");
        r2.append((java.lang.String) r1.getKey());
        r2.append("=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0066, code lost:
        if (r1.getValue() == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006d, code lost:
        return r0.toString();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m8405a(java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r3 = "="
            r2.append(r3)
            java.lang.Object r4 = r1.getValue()
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0035
        L_0x002e:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0036
        L_0x0035:
            r1 = r5
        L_0x0036:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0069
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "&"
            r2.append(r4)
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            r2.append(r3)
            java.lang.Object r4 = r1.getValue()
            if (r4 == 0) goto L_0x0035
            goto L_0x002e
        L_0x0069:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p029e1.C3145a.m8405a(java.util.Map):java.lang.String");
    }

    /* renamed from: b */
    private String m8406b(String str, Map<String, String> map) {
        String a = m8405a(map);
        if (a.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                a = "&" + a;
            }
            return str + a;
        }
        return str + "?" + a;
    }

    /* renamed from: e */
    private String m8407e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p029e1.C3147c mo23633c() {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r5.f5041a     // Catch:{ all -> 0x0084 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.f5042b     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = r5.m8406b(r1, r2)     // Catch:{ all -> 0x0084 }
            y0.f r2 = p118y0.C3916f.m11190f()     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r3.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r4 = "GET Request URL: "
            r3.append(r4)     // Catch:{ all -> 0x0084 }
            r3.append(r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0084 }
            r2.mo26405i(r3)     // Catch:{ all -> 0x0084 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0084 }
            r2.<init>(r1)     // Catch:{ all -> 0x0084 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x0084 }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ all -> 0x0084 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch:{ all -> 0x0082 }
            r1.setConnectTimeout(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x0082 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.f5043c     // Catch:{ all -> 0x0082 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0082 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0082 }
        L_0x0043:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0082 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0082 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0082 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0082 }
            r1.addRequestProperty(r4, r3)     // Catch:{ all -> 0x0082 }
            goto L_0x0043
        L_0x005f:
            r1.connect()     // Catch:{ all -> 0x0082 }
            int r2 = r1.getResponseCode()     // Catch:{ all -> 0x0082 }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x0074
            java.lang.String r0 = r5.m8407e(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0074
        L_0x0071:
            r2 = move-exception
            r0 = r3
            goto L_0x0086
        L_0x0074:
            if (r3 == 0) goto L_0x0079
            r3.close()
        L_0x0079:
            r1.disconnect()
            e1.c r1 = new e1.c
            r1.<init>(r2, r0)
            return r1
        L_0x0082:
            r2 = move-exception
            goto L_0x0086
        L_0x0084:
            r2 = move-exception
            r1 = r0
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            r0.close()
        L_0x008b:
            if (r1 == 0) goto L_0x0090
            r1.disconnect()
        L_0x0090:
            goto L_0x0092
        L_0x0091:
            throw r2
        L_0x0092:
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: p029e1.C3145a.mo23633c():e1.c");
    }

    /* renamed from: d */
    public C3145a mo23634d(String str, String str2) {
        this.f5043c.put(str, str2);
        return this;
    }
}
