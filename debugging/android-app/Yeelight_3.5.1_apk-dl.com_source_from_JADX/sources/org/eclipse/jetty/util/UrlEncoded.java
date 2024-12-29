package org.eclipse.jetty.util;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.jetty.util.Utf8Appendable;
import p152e6.C9001b;
import p152e6.C9003c;

public class UrlEncoded extends MultiMap implements Cloneable {
    public static final String ENCODING = System.getProperty("org.eclipse.jetty.util.UrlEncoding.charset", "UTF-8");
    private static final C9003c LOG = C9001b.m21450a(UrlEncoded.class);

    public UrlEncoded() {
        super(6);
    }

    public UrlEncoded(String str) {
        super(6);
        decode(str, ENCODING);
    }

    public UrlEncoded(String str, String str2) {
        super(6);
        decode(str, str2);
    }

    public UrlEncoded(UrlEncoded urlEncoded) {
        super(urlEncoded);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ca, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void decode88591To(java.io.InputStream r7, org.eclipse.jetty.util.MultiMap r8, int r9, int r10) {
        /*
            monitor-enter(r8)
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ all -> 0x00cb }
            r0.<init>()     // Catch:{ all -> 0x00cb }
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = 0
        L_0x000a:
            int r5 = r7.read()     // Catch:{ all -> 0x00cb }
            if (r5 < 0) goto L_0x00a4
            char r5 = (char) r5     // Catch:{ all -> 0x00cb }
            r6 = 37
            if (r5 == r6) goto L_0x0076
            r6 = 38
            if (r5 == r6) goto L_0x0037
            r6 = 43
            if (r5 == r6) goto L_0x0031
            r6 = 61
            if (r5 == r6) goto L_0x0026
        L_0x0021:
            r0.append(r5)     // Catch:{ all -> 0x00cb }
            goto L_0x0094
        L_0x0026:
            if (r3 == 0) goto L_0x0029
            goto L_0x0021
        L_0x0029:
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x00cb }
            r0.setLength(r2)     // Catch:{ all -> 0x00cb }
            goto L_0x0094
        L_0x0031:
            r5 = 32
            r0.append(r5)     // Catch:{ all -> 0x00cb }
            goto L_0x0094
        L_0x0037:
            int r5 = r0.length()     // Catch:{ all -> 0x00cb }
            if (r5 != 0) goto L_0x0040
            java.lang.String r5 = ""
            goto L_0x0044
        L_0x0040:
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x00cb }
        L_0x0044:
            r0.setLength(r2)     // Catch:{ all -> 0x00cb }
            if (r3 == 0) goto L_0x004d
            r8.add(r3, r5)     // Catch:{ all -> 0x00cb }
            goto L_0x005a
        L_0x004d:
            if (r5 == 0) goto L_0x005a
            int r3 = r5.length()     // Catch:{ all -> 0x00cb }
            if (r3 <= 0) goto L_0x005a
            java.lang.String r3 = ""
            r8.add(r5, r3)     // Catch:{ all -> 0x00cb }
        L_0x005a:
            if (r10 <= 0) goto L_0x0074
            int r3 = r8.size()     // Catch:{ all -> 0x00cb }
            if (r3 <= r10) goto L_0x0074
            e6.c r7 = LOG     // Catch:{ all -> 0x00cb }
            java.lang.String r9 = "maxFormKeys limit exceeded keys>{}"
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00cb }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00cb }
            r0[r2] = r10     // Catch:{ all -> 0x00cb }
            r7.mo36847b(r9, r0)     // Catch:{ all -> 0x00cb }
            monitor-exit(r8)     // Catch:{ all -> 0x00cb }
            return
        L_0x0074:
            r3 = r1
            goto L_0x0094
        L_0x0076:
            int r5 = r7.read()     // Catch:{ all -> 0x00cb }
            int r6 = r7.read()     // Catch:{ all -> 0x00cb }
            if (r5 < 0) goto L_0x0094
            if (r6 >= 0) goto L_0x0083
            goto L_0x0094
        L_0x0083:
            byte r5 = (byte) r5     // Catch:{ all -> 0x00cb }
            byte r5 = org.eclipse.jetty.util.C9996o.m24715b(r5)     // Catch:{ all -> 0x00cb }
            int r5 = r5 << 4
            byte r6 = (byte) r6     // Catch:{ all -> 0x00cb }
            byte r6 = org.eclipse.jetty.util.C9996o.m24715b(r6)     // Catch:{ all -> 0x00cb }
            int r5 = r5 + r6
            char r5 = (char) r5     // Catch:{ all -> 0x00cb }
            r0.append(r5)     // Catch:{ all -> 0x00cb }
        L_0x0094:
            if (r9 < 0) goto L_0x000a
            int r4 = r4 + 1
            if (r4 > r9) goto L_0x009c
            goto L_0x000a
        L_0x009c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00cb }
            java.lang.String r9 = "Form too large"
            r7.<init>(r9)     // Catch:{ all -> 0x00cb }
            throw r7     // Catch:{ all -> 0x00cb }
        L_0x00a4:
            if (r3 == 0) goto L_0x00ba
            int r7 = r0.length()     // Catch:{ all -> 0x00cb }
            if (r7 != 0) goto L_0x00af
            java.lang.String r7 = ""
            goto L_0x00b3
        L_0x00af:
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x00cb }
        L_0x00b3:
            r0.setLength(r2)     // Catch:{ all -> 0x00cb }
            r8.add(r3, r7)     // Catch:{ all -> 0x00cb }
            goto L_0x00c9
        L_0x00ba:
            int r7 = r0.length()     // Catch:{ all -> 0x00cb }
            if (r7 <= 0) goto L_0x00c9
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x00cb }
            java.lang.String r9 = ""
            r8.add(r7, r9)     // Catch:{ all -> 0x00cb }
        L_0x00c9:
            monitor-exit(r8)     // Catch:{ all -> 0x00cb }
            return
        L_0x00cb:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00cb }
            goto L_0x00cf
        L_0x00ce:
            throw r7
        L_0x00cf:
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.UrlEncoded.decode88591To(java.io.InputStream, org.eclipse.jetty.util.MultiMap, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: org.eclipse.jetty.util.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.StringBuffer} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v41 */
    /* JADX WARNING: type inference failed for: r0v52 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x00b6, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0141, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0141, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0141, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r14 != '%') goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if ((r12 + 2) >= r3) goto L_0x00a4;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r0 != 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        r0 = new java.lang.StringBuffer(r3);
        r0.append(r1, r2, r13);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r13 = r0;
        r15 = new byte[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r14 < 0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r14 > 255) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if (r14 != '%') goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if ((r12 + 2) >= r3) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r15[r16] = (byte) org.eclipse.jetty.util.C9996o.m24717d(r1, (r2 + r12) + 1, 2, 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        r16 = r16 + 1;
        r12 = r12 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        LOG.mo36849d(r0);
        r0 = r16 + 1;
        r15[r16] = 37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        r0 = r16 + 1;
        r15[r16] = 37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0 = r16 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r14 != '+') goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0082, code lost:
        r15[r16] = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        r15[r16] = (byte) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0088, code lost:
        r12 = r12 + 1;
        r16 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
        if (r12 >= r3) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008f, code lost:
        r14 = r1.charAt(r2 + r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0096, code lost:
        r12 = r12 - 1;
        r13.append(new java.lang.String(r15, 0, r16, r4));
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a4, code lost:
        if (r0 == 0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fe, code lost:
        if (r12 != '%') goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0100, code lost:
        r13 = r9 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0102, code lost:
        if (r13 >= r3) goto L_0x0126;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0104, code lost:
        if (r0 != 0) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0106, code lost:
        r0 = new org.eclipse.jetty.util.C9998q(r3);
        r0.mo40274g().append(r1, r2, r4);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r0.mo40201a((byte) org.eclipse.jetty.util.C9996o.m24717d(r1, r4 + 1, 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x011c, code lost:
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x011e, code lost:
        r0.mo40274g().append('%');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0126, code lost:
        if (r0 == 0) goto L_0x0141;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String decodeString(java.lang.String r17, int r18, int r19, java.lang.String r20) {
        /*
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 16
            r0 = 0
            r6 = 32
            r7 = 43
            r8 = 255(0xff, float:3.57E-43)
            r9 = 0
            r10 = 2
            r11 = 37
            if (r4 == 0) goto L_0x00d9
            boolean r12 = org.eclipse.jetty.util.C9995n.m24708d(r20)
            if (r12 == 0) goto L_0x001f
            goto L_0x00d9
        L_0x001f:
            r12 = 0
        L_0x0020:
            if (r12 >= r3) goto L_0x00bc
            int r13 = r2 + r12
            char r14 = r1.charAt(r13)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            if (r14 < 0) goto L_0x00aa
            if (r14 <= r8) goto L_0x002e
            goto L_0x00aa
        L_0x002e:
            if (r14 != r7) goto L_0x003f
            if (r0 != 0) goto L_0x003a
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r0.<init>(r3)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r0.append(r1, r2, r13)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
        L_0x003a:
            r0.append(r6)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            goto L_0x00b6
        L_0x003f:
            if (r14 != r11) goto L_0x00a4
            int r15 = r12 + 2
            if (r15 >= r3) goto L_0x00a4
            if (r0 != 0) goto L_0x004f
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r0.<init>(r3)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r0.append(r1, r2, r13)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
        L_0x004f:
            r13 = r0
            byte[] r15 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r16 = 0
        L_0x0054:
            if (r14 < 0) goto L_0x0096
            if (r14 > r8) goto L_0x0096
            if (r14 != r11) goto L_0x007e
            int r0 = r12 + 2
            if (r0 >= r3) goto L_0x0079
            int r0 = r2 + r12
            int r0 = r0 + 1
            int r0 = org.eclipse.jetty.util.C9996o.m24717d(r1, r0, r10, r5)     // Catch:{ NumberFormatException -> 0x006e }
            byte r0 = (byte) r0     // Catch:{ NumberFormatException -> 0x006e }
            r15[r16] = r0     // Catch:{ NumberFormatException -> 0x006e }
            int r16 = r16 + 1
            int r12 = r12 + 3
            goto L_0x008c
        L_0x006e:
            r0 = move-exception
            e6.c r14 = LOG     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r14.mo36849d(r0)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            int r0 = r16 + 1
            r15[r16] = r11     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            goto L_0x0088
        L_0x0079:
            int r0 = r16 + 1
            r15[r16] = r11     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            goto L_0x0088
        L_0x007e:
            int r0 = r16 + 1
            if (r14 != r7) goto L_0x0085
            r15[r16] = r6     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            goto L_0x0088
        L_0x0085:
            byte r14 = (byte) r14     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r15[r16] = r14     // Catch:{ UnsupportedEncodingException -> 0x00ba }
        L_0x0088:
            int r12 = r12 + 1
            r16 = r0
        L_0x008c:
            if (r12 < r3) goto L_0x008f
            goto L_0x0096
        L_0x008f:
            int r0 = r2 + r12
            char r14 = r1.charAt(r0)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            goto L_0x0054
        L_0x0096:
            r0 = r16
            int r12 = r12 + -1
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r14.<init>(r15, r9, r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r13.append(r14)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r0 = r13
            goto L_0x00b6
        L_0x00a4:
            if (r0 == 0) goto L_0x00b6
        L_0x00a6:
            r0.append(r14)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            goto L_0x00b6
        L_0x00aa:
            if (r0 != 0) goto L_0x00a6
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r0.<init>(r3)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            int r13 = r13 + 1
            r0.append(r1, r2, r13)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
        L_0x00b6:
            int r12 = r12 + 1
            goto L_0x0020
        L_0x00ba:
            r0 = move-exception
            goto L_0x00d3
        L_0x00bc:
            if (r0 != 0) goto L_0x00ce
            if (r2 != 0) goto L_0x00c7
            int r0 = r17.length()     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            if (r0 != r3) goto L_0x00c7
            return r1
        L_0x00c7:
            int r0 = r2 + r3
            java.lang.String r0 = r1.substring(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            return r0
        L_0x00ce:
            java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            return r0
        L_0x00d3:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x00d9:
            if (r9 >= r3) goto L_0x0144
            int r4 = r2 + r9
            char r12 = r1.charAt(r4)
            if (r12 < 0) goto L_0x0129
            if (r12 <= r8) goto L_0x00e6
            goto L_0x0129
        L_0x00e6:
            if (r12 != r7) goto L_0x00fe
            if (r0 != 0) goto L_0x00f6
            org.eclipse.jetty.util.q r0 = new org.eclipse.jetty.util.q
            r0.<init>(r3)
            java.lang.StringBuffer r12 = r0.mo40274g()
            r12.append(r1, r2, r4)
        L_0x00f6:
            java.lang.StringBuffer r4 = r0.mo40274g()
            r4.append(r6)
            goto L_0x0141
        L_0x00fe:
            if (r12 != r11) goto L_0x0126
            int r13 = r9 + 2
            if (r13 >= r3) goto L_0x0126
            if (r0 != 0) goto L_0x0112
            org.eclipse.jetty.util.q r0 = new org.eclipse.jetty.util.q
            r0.<init>(r3)
            java.lang.StringBuffer r12 = r0.mo40274g()
            r12.append(r1, r2, r4)
        L_0x0112:
            int r4 = r4 + 1
            int r4 = org.eclipse.jetty.util.C9996o.m24717d(r1, r4, r10, r5)     // Catch:{ NumberFormatException -> 0x011e }
            byte r4 = (byte) r4     // Catch:{ NumberFormatException -> 0x011e }
            r0.mo40201a(r4)     // Catch:{ NumberFormatException -> 0x011e }
            r9 = r13
            goto L_0x0141
        L_0x011e:
            java.lang.StringBuffer r4 = r0.mo40274g()
            r4.append(r11)
            goto L_0x0141
        L_0x0126:
            if (r0 == 0) goto L_0x0141
            goto L_0x013a
        L_0x0129:
            if (r0 != 0) goto L_0x013a
            org.eclipse.jetty.util.q r0 = new org.eclipse.jetty.util.q
            r0.<init>(r3)
            java.lang.StringBuffer r12 = r0.mo40274g()
            int r4 = r4 + 1
            r12.append(r1, r2, r4)
            goto L_0x0141
        L_0x013a:
            java.lang.StringBuffer r4 = r0.mo40274g()
            r4.append(r12)
        L_0x0141:
            int r9 = r9 + 1
            goto L_0x00d9
        L_0x0144:
            if (r0 != 0) goto L_0x0156
            if (r2 != 0) goto L_0x014f
            int r0 = r17.length()
            if (r0 != r3) goto L_0x014f
            return r1
        L_0x014f:
            int r0 = r2 + r3
            java.lang.String r0 = r1.substring(r2, r0)
            return r0
        L_0x0156:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.UrlEncoded.decodeString(java.lang.String, int, int, java.lang.String):java.lang.String");
    }

    public static void decodeTo(InputStream inputStream, MultiMap multiMap, String str, int i, int i2) {
        if (str == null) {
            str = ENCODING;
        }
        if ("UTF-8".equalsIgnoreCase(str)) {
            decodeUtf8To(inputStream, multiMap, i, i2);
        } else if ("ISO-8859-1".equals(str)) {
            decode88591To(inputStream, multiMap, i, i2);
        } else if ("UTF-16".equalsIgnoreCase(str)) {
            decodeUtf16To(inputStream, multiMap, i, i2);
        } else {
            synchronized (multiMap) {
                C9983g gVar = new C9983g();
                String str2 = null;
                char c = 0;
                byte b = 0;
                int i3 = 0;
                while (true) {
                    int read = inputStream.read();
                    if (read > 0) {
                        char c2 = (char) read;
                        if (c2 == '%') {
                            c = 2;
                        } else if (c2 == '&') {
                            String byteArrayOutputStream = gVar.size() == 0 ? "" : gVar.toString(str);
                            gVar.mo40242c(0);
                            if (str2 != null) {
                                multiMap.add(str2, byteArrayOutputStream);
                            } else if (byteArrayOutputStream != null && byteArrayOutputStream.length() > 0) {
                                multiMap.add(byteArrayOutputStream, "");
                            }
                            str2 = null;
                        } else if (c2 != '+') {
                            if (c2 != '=') {
                                if (c == 2) {
                                    b = C9996o.m24715b((byte) read);
                                    c = 1;
                                } else if (c == 1) {
                                    gVar.write((b << 4) + C9996o.m24715b((byte) read));
                                    c = 0;
                                }
                            } else if (str2 == null) {
                                str2 = gVar.size() == 0 ? "" : gVar.toString(str);
                                gVar.mo40242c(0);
                            }
                            gVar.write(read);
                        } else {
                            gVar.write(32);
                        }
                        i3++;
                        if (i >= 0) {
                            if (i3 > i) {
                                throw new IllegalStateException("Form too large");
                            }
                        }
                    } else {
                        int size = gVar.size();
                        if (str2 != null) {
                            String byteArrayOutputStream2 = size == 0 ? "" : gVar.toString(str);
                            gVar.mo40242c(0);
                            multiMap.add(str2, byteArrayOutputStream2);
                        } else if (size > 0) {
                            multiMap.add(gVar.toString(str), "");
                        }
                    }
                }
            }
        }
    }

    public static void decodeTo(String str, MultiMap multiMap, String str2) {
        decodeTo(str, multiMap, str2, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00cc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void decodeTo(java.lang.String r9, org.eclipse.jetty.util.MultiMap r10, java.lang.String r11, int r12) {
        /*
            if (r11 != 0) goto L_0x0004
            java.lang.String r11 = ENCODING
        L_0x0004:
            monitor-enter(r10)
            r0 = -1
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = 0
            r5 = 0
        L_0x000b:
            int r6 = r9.length()     // Catch:{ all -> 0x00cd }
            r7 = 1
            if (r3 >= r6) goto L_0x0087
            char r6 = r9.charAt(r3)     // Catch:{ all -> 0x00cd }
            r8 = 37
            if (r6 == r8) goto L_0x0083
            r8 = 38
            if (r6 == r8) goto L_0x0040
            r8 = 43
            if (r6 == r8) goto L_0x0083
            r8 = 61
            if (r6 == r8) goto L_0x0027
            goto L_0x0084
        L_0x0027:
            if (r4 == 0) goto L_0x002a
            goto L_0x0084
        L_0x002a:
            if (r5 == 0) goto L_0x0036
            int r4 = r0 + 1
            int r0 = r3 - r0
            int r0 = r0 - r7
            java.lang.String r0 = decodeString(r9, r4, r0, r11)     // Catch:{ all -> 0x00cd }
            goto L_0x003c
        L_0x0036:
            int r0 = r0 + 1
            java.lang.String r0 = r9.substring(r0, r3)     // Catch:{ all -> 0x00cd }
        L_0x003c:
            r4 = r0
        L_0x003d:
            r0 = r3
            r5 = 0
            goto L_0x0084
        L_0x0040:
            int r6 = r3 - r0
            int r6 = r6 - r7
            if (r6 != 0) goto L_0x0048
            java.lang.String r0 = ""
            goto L_0x0055
        L_0x0048:
            int r0 = r0 + 1
            if (r5 == 0) goto L_0x0051
            java.lang.String r0 = decodeString(r9, r0, r6, r11)     // Catch:{ all -> 0x00cd }
            goto L_0x0055
        L_0x0051:
            java.lang.String r0 = r9.substring(r0, r3)     // Catch:{ all -> 0x00cd }
        L_0x0055:
            if (r4 == 0) goto L_0x005b
            r10.add(r4, r0)     // Catch:{ all -> 0x00cd }
            goto L_0x0068
        L_0x005b:
            if (r0 == 0) goto L_0x0068
            int r4 = r0.length()     // Catch:{ all -> 0x00cd }
            if (r4 <= 0) goto L_0x0068
            java.lang.String r4 = ""
            r10.add(r0, r4)     // Catch:{ all -> 0x00cd }
        L_0x0068:
            if (r12 <= 0) goto L_0x0081
            int r0 = r10.size()     // Catch:{ all -> 0x00cd }
            if (r0 <= r12) goto L_0x0081
            e6.c r9 = LOG     // Catch:{ all -> 0x00cd }
            java.lang.String r11 = "maxFormKeys limit exceeded keys>{}"
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x00cd }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00cd }
            r0[r2] = r12     // Catch:{ all -> 0x00cd }
            r9.mo36847b(r11, r0)     // Catch:{ all -> 0x00cd }
            monitor-exit(r10)     // Catch:{ all -> 0x00cd }
            return
        L_0x0081:
            r4 = r1
            goto L_0x003d
        L_0x0083:
            r5 = 1
        L_0x0084:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0087:
            if (r4 == 0) goto L_0x00a4
            int r12 = r9.length()     // Catch:{ all -> 0x00cd }
            int r12 = r12 - r0
            int r12 = r12 - r7
            if (r12 != 0) goto L_0x0094
            java.lang.String r9 = ""
            goto L_0x00a0
        L_0x0094:
            int r0 = r0 + r7
            if (r5 == 0) goto L_0x009c
            java.lang.String r9 = decodeString(r9, r0, r12, r11)     // Catch:{ all -> 0x00cd }
            goto L_0x00a0
        L_0x009c:
            java.lang.String r9 = r9.substring(r0)     // Catch:{ all -> 0x00cd }
        L_0x00a0:
            r10.add(r4, r9)     // Catch:{ all -> 0x00cd }
            goto L_0x00cb
        L_0x00a4:
            int r12 = r9.length()     // Catch:{ all -> 0x00cd }
            if (r0 >= r12) goto L_0x00cb
            if (r5 == 0) goto L_0x00b9
            int r12 = r0 + 1
            int r1 = r9.length()     // Catch:{ all -> 0x00cd }
            int r1 = r1 - r0
            int r1 = r1 - r7
            java.lang.String r9 = decodeString(r9, r12, r1, r11)     // Catch:{ all -> 0x00cd }
            goto L_0x00be
        L_0x00b9:
            int r0 = r0 + r7
            java.lang.String r9 = r9.substring(r0)     // Catch:{ all -> 0x00cd }
        L_0x00be:
            if (r9 == 0) goto L_0x00cb
            int r11 = r9.length()     // Catch:{ all -> 0x00cd }
            if (r11 <= 0) goto L_0x00cb
            java.lang.String r11 = ""
            r10.add(r9, r11)     // Catch:{ all -> 0x00cd }
        L_0x00cb:
            monitor-exit(r10)     // Catch:{ all -> 0x00cd }
            return
        L_0x00cd:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00cd }
            goto L_0x00d1
        L_0x00d0:
            throw r9
        L_0x00d1:
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.UrlEncoded.decodeTo(java.lang.String, org.eclipse.jetty.util.MultiMap, java.lang.String, int):void");
    }

    public static void decodeUtf16To(InputStream inputStream, MultiMap multiMap, int i, int i2) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-16");
        StringWriter stringWriter = new StringWriter(8192);
        C9985i.m24690e(inputStreamReader, stringWriter, (long) i);
        decodeTo(stringWriter.getBuffer().toString(), multiMap, ENCODING, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e0, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x000a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void decodeUtf8To(java.io.InputStream r9, org.eclipse.jetty.util.MultiMap r10, int r11, int r12) {
        /*
            monitor-enter(r10)
            org.eclipse.jetty.util.r r0 = new org.eclipse.jetty.util.r     // Catch:{ all -> 0x00e1 }
            r0.<init>()     // Catch:{ all -> 0x00e1 }
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = 0
        L_0x000a:
            int r5 = r9.read()     // Catch:{ all -> 0x00e1 }
            if (r5 < 0) goto L_0x00ba
            char r6 = (char) r5
            r7 = 37
            if (r6 == r7) goto L_0x007c
            r7 = 38
            if (r6 == r7) goto L_0x003a
            r7 = 43
            if (r6 == r7) goto L_0x0033
            r7 = 61
            if (r6 == r7) goto L_0x0027
        L_0x0021:
            byte r5 = (byte) r5
            r0.mo40201a(r5)     // Catch:{ NotUtf8Exception -> 0x009b }
            goto L_0x00aa
        L_0x0027:
            if (r3 == 0) goto L_0x002a
            goto L_0x0021
        L_0x002a:
            java.lang.String r3 = r0.toString()     // Catch:{ NotUtf8Exception -> 0x009b }
            r0.mo40205e()     // Catch:{ NotUtf8Exception -> 0x009b }
            goto L_0x00aa
        L_0x0033:
            r5 = 32
            r0.mo40201a(r5)     // Catch:{ NotUtf8Exception -> 0x009b }
            goto L_0x00aa
        L_0x003a:
            int r5 = r0.mo40276g()     // Catch:{ NotUtf8Exception -> 0x009b }
            if (r5 != 0) goto L_0x0043
            java.lang.String r5 = ""
            goto L_0x0047
        L_0x0043:
            java.lang.String r5 = r0.toString()     // Catch:{ NotUtf8Exception -> 0x009b }
        L_0x0047:
            r0.mo40205e()     // Catch:{ NotUtf8Exception -> 0x009b }
            if (r3 == 0) goto L_0x0050
            r10.add(r3, r5)     // Catch:{ NotUtf8Exception -> 0x009b }
            goto L_0x005d
        L_0x0050:
            if (r5 == 0) goto L_0x005d
            int r6 = r5.length()     // Catch:{ NotUtf8Exception -> 0x009b }
            if (r6 <= 0) goto L_0x005d
            java.lang.String r6 = ""
            r10.add(r5, r6)     // Catch:{ NotUtf8Exception -> 0x009b }
        L_0x005d:
            if (r12 <= 0) goto L_0x007a
            int r3 = r10.size()     // Catch:{ NotUtf8Exception -> 0x0077 }
            if (r3 <= r12) goto L_0x007a
            e6.c r3 = LOG     // Catch:{ NotUtf8Exception -> 0x0077 }
            java.lang.String r5 = "maxFormKeys limit exceeded keys>{}"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ NotUtf8Exception -> 0x0077 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch:{ NotUtf8Exception -> 0x0077 }
            r6[r2] = r7     // Catch:{ NotUtf8Exception -> 0x0077 }
            r3.mo36847b(r5, r6)     // Catch:{ NotUtf8Exception -> 0x0077 }
            monitor-exit(r10)     // Catch:{ all -> 0x00e1 }
            return
        L_0x0077:
            r5 = move-exception
            r3 = r1
            goto L_0x009c
        L_0x007a:
            r3 = r1
            goto L_0x00aa
        L_0x007c:
            int r5 = r9.read()     // Catch:{ NotUtf8Exception -> 0x009b }
            int r6 = r9.read()     // Catch:{ NotUtf8Exception -> 0x009b }
            if (r5 < 0) goto L_0x00aa
            if (r6 >= 0) goto L_0x0089
            goto L_0x00aa
        L_0x0089:
            byte r5 = (byte) r5     // Catch:{ NotUtf8Exception -> 0x009b }
            byte r5 = org.eclipse.jetty.util.C9996o.m24715b(r5)     // Catch:{ NotUtf8Exception -> 0x009b }
            int r5 = r5 << 4
            byte r6 = (byte) r6     // Catch:{ NotUtf8Exception -> 0x009b }
            byte r6 = org.eclipse.jetty.util.C9996o.m24715b(r6)     // Catch:{ NotUtf8Exception -> 0x009b }
            int r5 = r5 + r6
            byte r5 = (byte) r5     // Catch:{ NotUtf8Exception -> 0x009b }
            r0.mo40201a(r5)     // Catch:{ NotUtf8Exception -> 0x009b }
            goto L_0x00aa
        L_0x009b:
            r5 = move-exception
        L_0x009c:
            e6.c r6 = LOG     // Catch:{ all -> 0x00e1 }
            java.lang.String r7 = r5.toString()     // Catch:{ all -> 0x00e1 }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e1 }
            r6.mo36847b(r7, r8)     // Catch:{ all -> 0x00e1 }
            r6.mo36848c(r5)     // Catch:{ all -> 0x00e1 }
        L_0x00aa:
            if (r11 < 0) goto L_0x000a
            int r4 = r4 + 1
            if (r4 > r11) goto L_0x00b2
            goto L_0x000a
        L_0x00b2:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e1 }
            java.lang.String r11 = "Form too large"
            r9.<init>(r11)     // Catch:{ all -> 0x00e1 }
            throw r9     // Catch:{ all -> 0x00e1 }
        L_0x00ba:
            if (r3 == 0) goto L_0x00d0
            int r9 = r0.mo40276g()     // Catch:{ all -> 0x00e1 }
            if (r9 != 0) goto L_0x00c5
            java.lang.String r9 = ""
            goto L_0x00c9
        L_0x00c5:
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x00e1 }
        L_0x00c9:
            r0.mo40205e()     // Catch:{ all -> 0x00e1 }
            r10.add(r3, r9)     // Catch:{ all -> 0x00e1 }
            goto L_0x00df
        L_0x00d0:
            int r9 = r0.mo40276g()     // Catch:{ all -> 0x00e1 }
            if (r9 <= 0) goto L_0x00df
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x00e1 }
            java.lang.String r11 = ""
            r10.add(r9, r11)     // Catch:{ all -> 0x00e1 }
        L_0x00df:
            monitor-exit(r10)     // Catch:{ all -> 0x00e1 }
            return
        L_0x00e1:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00e1 }
            goto L_0x00e5
        L_0x00e4:
            throw r9
        L_0x00e5:
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.UrlEncoded.decodeUtf8To(java.io.InputStream, org.eclipse.jetty.util.MultiMap, int, int):void");
    }

    public static void decodeUtf8To(byte[] bArr, int i, int i2, MultiMap multiMap) {
        decodeUtf8To(bArr, i, i2, multiMap, new C9999r());
    }

    public static void decodeUtf8To(byte[] bArr, int i, int i2, MultiMap multiMap, C9999r rVar) {
        synchronized (multiMap) {
            int i3 = i2 + i;
            String str = null;
            while (i < i3) {
                try {
                    byte b = bArr[i];
                    char c = (char) (b & 255);
                    if (c != '%') {
                        if (c == '&') {
                            String rVar2 = rVar.mo40276g() == 0 ? "" : rVar.toString();
                            rVar.mo40205e();
                            if (str != null) {
                                multiMap.add(str, rVar2);
                            } else if (rVar2 != null && rVar2.length() > 0) {
                                multiMap.add(rVar2, "");
                            }
                            str = null;
                        } else if (c != '+') {
                            if (c == '=') {
                                if (str == null) {
                                    str = rVar.toString();
                                    rVar.mo40205e();
                                }
                            }
                            rVar.mo40201a(b);
                        } else {
                            rVar.mo40201a((byte) 32);
                        }
                    } else if (i + 2 < i3) {
                        int i4 = i + 1;
                        i = i4 + 1;
                        rVar.mo40201a((byte) ((C9996o.m24715b(bArr[i4]) << 4) + C9996o.m24715b(bArr[i])));
                    }
                } catch (Utf8Appendable.NotUtf8Exception e) {
                    C9003c cVar = LOG;
                    cVar.mo36847b(e.toString(), new Object[0]);
                    cVar.mo36848c(e);
                } finally {
                }
                i++;
            }
            if (str != null) {
                String rVar3 = rVar.mo40276g() == 0 ? "" : rVar.toString();
                rVar.mo40205e();
                multiMap.add(str, rVar3);
            } else if (rVar.mo40276g() > 0) {
                multiMap.add(rVar.toString(), "");
            }
        }
    }

    public static String encode(MultiMap multiMap, String str, boolean z) {
        if (str == null) {
            str = ENCODING;
        }
        StringBuilder sb = new StringBuilder(128);
        Iterator it = multiMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String obj = entry.getKey().toString();
            Object value = entry.getValue();
            int size = LazyList.size(value);
            if (size == 0) {
                sb.append(encodeString(obj, str));
                if (z) {
                    sb.append('=');
                }
            } else {
                for (int i = 0; i < size; i++) {
                    if (i > 0) {
                        sb.append('&');
                    }
                    Object obj2 = LazyList.get(value, i);
                    sb.append(encodeString(obj, str));
                    if (obj2 != null) {
                        String obj3 = obj2.toString();
                        if (obj3.length() > 0) {
                            sb.append('=');
                            sb.append(encodeString(obj3, str));
                        } else if (!z) {
                        }
                    } else if (!z) {
                    }
                    sb.append('=');
                }
            }
            if (it.hasNext()) {
                sb.append('&');
            }
        }
        return sb.toString();
    }

    public static String encodeString(String str) {
        return encodeString(str, ENCODING);
    }

    public static String encodeString(String str, String str2) {
        byte[] bArr;
        if (str2 == null) {
            str2 = ENCODING;
        }
        try {
            bArr = str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        byte[] bArr2 = new byte[(bArr.length * 3)];
        boolean z = true;
        int i = 0;
        for (byte b : bArr) {
            if (b == 32) {
                bArr2[i] = 43;
                i++;
            } else if ((b < 97 || b > 122) && ((b < 65 || b > 90) && (b < 48 || b > 57))) {
                int i2 = i + 1;
                bArr2[i] = 37;
                byte b2 = (byte) ((b & 240) >> 4);
                int i3 = i2 + 1;
                if (b2 >= 10) {
                    bArr2[i2] = (byte) ((b2 + 65) - 10);
                } else {
                    bArr2[i2] = (byte) (b2 + 48);
                }
                byte b3 = (byte) (b & ParameterInitDefType.CubemapSamplerInit);
                i = i3 + 1;
                if (b3 >= 10) {
                    bArr2[i3] = (byte) ((b3 + 65) - 10);
                } else {
                    bArr2[i3] = (byte) (b3 + 48);
                }
            } else {
                bArr2[i] = b;
                i++;
            }
            z = false;
        }
        if (z) {
            return str;
        }
        try {
            return new String(bArr2, 0, i, str2);
        } catch (UnsupportedEncodingException unused2) {
            return new String(bArr2, 0, i);
        }
    }

    public Object clone() {
        return new UrlEncoded(this);
    }

    public void decode(String str) {
        decodeTo(str, this, ENCODING, -1);
    }

    public void decode(String str, String str2) {
        decodeTo(str, this, str2, -1);
    }

    public String encode() {
        return encode(ENCODING, false);
    }

    public String encode(String str) {
        return encode(str, false);
    }

    public synchronized String encode(String str, boolean z) {
        return encode(this, str, z);
    }
}
