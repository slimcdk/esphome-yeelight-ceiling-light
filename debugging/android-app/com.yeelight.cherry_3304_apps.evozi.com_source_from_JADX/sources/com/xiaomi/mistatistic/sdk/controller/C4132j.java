package com.xiaomi.mistatistic.sdk.controller;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.mistatistic.sdk.BuildSetting;
import com.xiaomi.mistatistic.sdk.CustomSettings;
import com.xiaomi.mistatistic.sdk.controller.C4115d;
import com.xiaomi.xmsf.push.service.C4952a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.j */
public abstract class C4132j {

    /* renamed from: com.xiaomi.mistatistic.sdk.controller.j$a */
    public static final class C4135a extends FilterInputStream {

        /* renamed from: a */
        private boolean f7085a;

        public C4135a(InputStream inputStream) {
            super(inputStream);
        }

        public int read(byte[] bArr, int i, int i2) {
            int read;
            if (!this.f7085a && (read = super.read(bArr, i, i2)) != -1) {
                return read;
            }
            this.f7085a = true;
            return -1;
        }
    }

    /* renamed from: com.xiaomi.mistatistic.sdk.controller.j$b */
    public interface C4136b {
        /* renamed from: a */
        void mo23019a(String str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m11186a(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9, java.io.File r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "--"
            java.lang.String r1 = ""
            java.lang.String r2 = "\r\n"
            boolean r3 = r10.exists()
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            java.lang.String r3 = r10.getName()
            java.net.URL r5 = new java.net.URL     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            android.content.Context r6 = com.xiaomi.mistatistic.sdk.controller.C4113c.m11105a()     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.lang.String r8 = com.xiaomi.mistatistic.sdk.controller.C4162q.m11288a((android.content.Context) r6, (java.lang.String) r8)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            r5.<init>(r8)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.net.URLConnection r8 = r5.openConnection()     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            r5 = 15000(0x3a98, float:2.102E-41)
            r8.setReadTimeout(r5)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            r5 = 10000(0x2710, float:1.4013E-41)
            r8.setConnectTimeout(r5)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            r5 = 1
            r8.setDoInput(r5)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            r8.setDoOutput(r5)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            r5 = 0
            r8.setUseCaches(r5)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.lang.String r6 = "POST"
            r8.setRequestMethod(r6)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.lang.String r6 = "Connection"
            java.lang.String r7 = "Keep-Alive"
            r8.setRequestProperty(r6, r7)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.lang.String r6 = "Content-Type"
            java.lang.String r7 = "multipart/form-data;boundary=*****"
            r8.setRequestProperty(r6, r7)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            if (r9 == 0) goto L_0x0073
            java.util.Set r9 = r9.entrySet()     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
        L_0x0057:
            boolean r6 = r9.hasNext()     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            if (r6 == 0) goto L_0x0073
            java.lang.Object r6 = r9.next()     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            r8.setRequestProperty(r7, r6)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            goto L_0x0057
        L_0x0073:
            int r9 = r3.length()     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            int r9 = r9 + 77
            long r6 = r10.length()     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            int r3 = (int) r6     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            int r9 = r9 + r3
            int r3 = r11.length()     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            int r9 = r9 + r3
            r8.setFixedLengthStreamingMode(r9)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.io.DataOutputStream r9 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.io.OutputStream r3 = r8.getOutputStream()     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            r9.<init>(r3)     // Catch:{ IOException -> 0x013f, all -> 0x0132 }
            java.lang.String r3 = "--*****\r\n"
            r9.writeBytes(r3)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            r3.<init>()     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            java.lang.String r6 = "Content-Disposition: form-data; name=\""
            r3.append(r6)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            r3.append(r11)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            java.lang.String r11 = "\";filename=\""
            r3.append(r11)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            java.lang.String r11 = r10.getName()     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            r3.append(r11)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            java.lang.String r11 = "\""
            r3.append(r11)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            r3.append(r2)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            java.lang.String r11 = r3.toString()     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            r9.writeBytes(r11)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            r9.writeBytes(r2)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            r11.<init>(r10)     // Catch:{ IOException -> 0x012f, all -> 0x012c }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
        L_0x00c9:
            int r3 = r11.read(r10)     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            r6 = -1
            if (r3 == r6) goto L_0x00d7
            r9.write(r10, r5, r3)     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            r9.flush()     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            goto L_0x00c9
        L_0x00d7:
            r9.writeBytes(r2)     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            r9.writeBytes(r0)     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            java.lang.String r10 = "*****"
            r9.writeBytes(r10)     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            r9.writeBytes(r0)     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            r9.writeBytes(r2)     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            r9.flush()     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            r10.<init>()     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            com.xiaomi.mistatistic.sdk.controller.j$a r3 = new com.xiaomi.mistatistic.sdk.controller.j$a     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            java.io.InputStream r8 = r8.getInputStream()     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            r3.<init>(r8)     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0128, all -> 0x0124 }
        L_0x0103:
            java.lang.String r8 = r0.readLine()     // Catch:{ IOException -> 0x0122, all -> 0x0120 }
            if (r8 == 0) goto L_0x010d
            r10.append(r8)     // Catch:{ IOException -> 0x0122, all -> 0x0120 }
            goto L_0x0103
        L_0x010d:
            java.lang.String r8 = r10.toString()     // Catch:{ IOException -> 0x0122, all -> 0x0120 }
            r11.close()     // Catch:{ IOException -> 0x011b }
            r9.close()     // Catch:{ IOException -> 0x011b }
            r0.close()     // Catch:{ IOException -> 0x011b }
            goto L_0x011f
        L_0x011b:
            r9 = move-exception
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11176a((java.lang.String) r1, (java.lang.Throwable) r9)
        L_0x011f:
            return r8
        L_0x0120:
            r8 = move-exception
            goto L_0x0126
        L_0x0122:
            r8 = move-exception
            goto L_0x012a
        L_0x0124:
            r8 = move-exception
            r0 = r4
        L_0x0126:
            r4 = r11
            goto L_0x0135
        L_0x0128:
            r8 = move-exception
            r0 = r4
        L_0x012a:
            r4 = r11
            goto L_0x0142
        L_0x012c:
            r8 = move-exception
            r0 = r4
            goto L_0x0135
        L_0x012f:
            r8 = move-exception
            r0 = r4
            goto L_0x0142
        L_0x0132:
            r8 = move-exception
            r9 = r4
            r0 = r9
        L_0x0135:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x0143 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x0143 }
            r10.<init>(r8)     // Catch:{ all -> 0x0143 }
            throw r10     // Catch:{ all -> 0x0143 }
        L_0x013f:
            r8 = move-exception
            r9 = r4
            r0 = r9
        L_0x0142:
            throw r8     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r8 = move-exception
            if (r4 == 0) goto L_0x014c
            r4.close()     // Catch:{ IOException -> 0x014a }
            goto L_0x014c
        L_0x014a:
            r9 = move-exception
            goto L_0x0157
        L_0x014c:
            if (r9 == 0) goto L_0x0151
            r9.close()     // Catch:{ IOException -> 0x014a }
        L_0x0151:
            if (r0 == 0) goto L_0x015a
            r0.close()     // Catch:{ IOException -> 0x014a }
            goto L_0x015a
        L_0x0157:
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11176a((java.lang.String) r1, (java.lang.Throwable) r9)
        L_0x015a:
            goto L_0x015c
        L_0x015b:
            throw r8
        L_0x015c:
            goto L_0x015b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.controller.C4132j.m11186a(java.lang.String, java.util.Map, java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m11187a(URL url) {
        StringBuilder sb = new StringBuilder();
        sb.append(url.getProtocol());
        sb.append("://");
        sb.append("10.0.0.172");
        sb.append(url.getPath());
        if (!TextUtils.isEmpty(url.getQuery())) {
            sb.append("?");
            sb.append(url.getQuery());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static HttpURLConnection m11188a(Context context, URL url) {
        URLConnection openConnection;
        if ("http".equals(url.getProtocol())) {
            if (m11198d(context)) {
                openConnection = url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80)));
                return (HttpURLConnection) openConnection;
            } else if (m11197c(context)) {
                String host = url.getHost();
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(m11187a(url)).openConnection();
                httpURLConnection.addRequestProperty("X-Online-Host", host);
                return httpURLConnection;
            }
        }
        openConnection = url.openConnection();
        return (HttpURLConnection) openConnection;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11189a(android.content.Context r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, com.xiaomi.mistatistic.sdk.controller.C4132j.C4136b r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00d0
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.lang.String r2 = com.xiaomi.mistatistic.sdk.controller.C4162q.m11288a((android.content.Context) r6, (java.lang.String) r7)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.net.HttpURLConnection r6 = m11188a(r6, r1)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            r1 = 10000(0x2710, float:1.4013E-41)
            r6.setConnectTimeout(r1)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            r1 = 15000(0x3a98, float:2.102E-41)
            r6.setReadTimeout(r1)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.lang.String r1 = "POST"
            r6.setRequestMethod(r1)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            m11191a((java.util.Map<java.lang.String, java.lang.String>) r8)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.lang.String r8 = m11195b((java.util.Map<java.lang.String, java.lang.String>) r8)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            if (r8 == 0) goto L_0x00a3
            r1 = 1
            r6.setDoOutput(r1)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            byte[] r8 = r8.getBytes()     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.io.OutputStream r2 = r6.getOutputStream()     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            int r3 = r8.length     // Catch:{ IOException -> 0x009f, all -> 0x009b }
            r4 = 0
            r2.write(r8, r4, r3)     // Catch:{ IOException -> 0x009f, all -> 0x009b }
            r2.flush()     // Catch:{ IOException -> 0x009f, all -> 0x009b }
            r2.close()     // Catch:{ IOException -> 0x009f, all -> 0x009b }
            int r8 = r6.getResponseCode()     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.lang.String r2 = "doHttpPost-"
            java.lang.String r3 = "url:%s,responseCode:%d"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            r5[r4] = r7     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            r5[r1] = r7     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.lang.String r7 = java.lang.String.format(r3, r5)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11178b(r2, r7)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            com.xiaomi.mistatistic.sdk.controller.j$a r1 = new com.xiaomi.mistatistic.sdk.controller.j$a     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            r1.<init>(r6)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            r8.<init>(r1)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            r7.<init>(r8)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.lang.String r6 = r7.readLine()     // Catch:{ IOException -> 0x0099, all -> 0x0097 }
            java.lang.StringBuffer r8 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x0099, all -> 0x0097 }
            r8.<init>()     // Catch:{ IOException -> 0x0099, all -> 0x0097 }
            java.lang.String r1 = "line.separator"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ IOException -> 0x0099, all -> 0x0097 }
        L_0x007f:
            if (r6 == 0) goto L_0x008c
            r8.append(r6)     // Catch:{ IOException -> 0x0099, all -> 0x0097 }
            r8.append(r1)     // Catch:{ IOException -> 0x0099, all -> 0x0097 }
            java.lang.String r6 = r7.readLine()     // Catch:{ IOException -> 0x0099, all -> 0x0097 }
            goto L_0x007f
        L_0x008c:
            java.lang.String r6 = r8.toString()     // Catch:{ IOException -> 0x0099, all -> 0x0097 }
            r9.mo23019a(r6)     // Catch:{ IOException -> 0x0099, all -> 0x0097 }
            r7.close()     // Catch:{ IOException -> 0x0099, all -> 0x0097 }
            return
        L_0x0097:
            r6 = move-exception
            goto L_0x00ad
        L_0x0099:
            r6 = move-exception
            goto L_0x00be
        L_0x009b:
            r6 = move-exception
            r7 = r0
            r0 = r2
            goto L_0x00ad
        L_0x009f:
            r6 = move-exception
            r7 = r0
            r0 = r2
            goto L_0x00be
        L_0x00a3:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            java.lang.String r7 = "nameValuePairs"
            r6.<init>(r7)     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
            throw r6     // Catch:{ IOException -> 0x00bc, all -> 0x00ab }
        L_0x00ab:
            r6 = move-exception
            r7 = r0
        L_0x00ad:
            java.lang.String r8 = "doHttpPost Throwable:"
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11176a((java.lang.String) r8, (java.lang.Throwable) r6)     // Catch:{ all -> 0x00c4 }
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00c4 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x00c4 }
            r8.<init>(r6)     // Catch:{ all -> 0x00c4 }
            throw r8     // Catch:{ all -> 0x00c4 }
        L_0x00bc:
            r6 = move-exception
            r7 = r0
        L_0x00be:
            java.lang.String r8 = "doHttpPost IOException:"
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11176a((java.lang.String) r8, (java.lang.Throwable) r6)     // Catch:{ all -> 0x00c4 }
            throw r6     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r6 = move-exception
            if (r0 == 0) goto L_0x00ca
            r0.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00ca:
            if (r7 == 0) goto L_0x00cf
            r7.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            throw r6
        L_0x00d0:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "url"
            r6.<init>(r7)
            goto L_0x00d9
        L_0x00d8:
            throw r6
        L_0x00d9:
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.controller.C4132j.m11189a(android.content.Context, java.lang.String, java.util.Map, com.xiaomi.mistatistic.sdk.controller.j$b):void");
    }

    /* renamed from: a */
    public static void m11190a(String str, Map<String, String> map, C4136b bVar) {
        if (!CustomSettings.isDataUploadingEnabled()) {
            C4130h.m11183d("upload is disabled.");
            bVar.mo23019a("");
            return;
        }
        C4130h.m11172a("Uploading to: " + str);
        if (map != null) {
            map.put("bc", BuildSetting.getMiuiBuildCode());
        }
        if (!CustomSettings.isUseSystemUploadingService()) {
            C4130h.m11172a("Uploading under app network");
            m11189a(C4113c.m11105a(), str, map, bVar);
        } else if (m11192a()) {
            try {
                C4130h.m11172a("Uploading via sys service, unmetered network connected");
                m11196b(C4113c.m11105a(), str, map, bVar);
            } catch (Exception e) {
                throw new IOException("exception thrown from IPC." + e.getMessage());
            }
        } else {
            bVar.mo23019a((String) null);
            C4130h.m11172a("Uploading via sys service, metered network connected, skip");
        }
    }

    /* renamed from: a */
    protected static void m11191a(Map<String, String> map) {
        try {
            StringBuilder sb = new StringBuilder();
            new HashMap();
            if (map != null) {
                ArrayList<String> arrayList = new ArrayList<>(map.keySet());
                C4130h.m11177b("mistats_NetworkUtils_keys:" + arrayList.toString());
                Collections.sort(arrayList);
                if (!arrayList.isEmpty()) {
                    for (String str : arrayList) {
                        sb.append(str + map.get(str));
                    }
                }
            }
            sb.append("mistats_sdkconfig_jafej!@#)(*e@!#");
            map.put("sign", C4162q.m11296b(sb.toString()).toLowerCase(Locale.getDefault()));
        } catch (Exception e) {
            C4130h.m11176a("sign exception:", (Throwable) e);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m11192a() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C4113c.m11105a().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (activeNetworkInfo.getType() == 1) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                return !connectivityManager.isActiveNetworkMetered();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r2 = r2.getActiveNetworkInfo();
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11193a(android.content.Context r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.controller.C4132j.m11193a(android.content.Context):boolean");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m11194b(android.content.Context r3) {
        /*
            java.lang.String r0 = ""
            boolean r1 = m11193a((android.content.Context) r3)
            if (r1 == 0) goto L_0x000b
            java.lang.String r3 = "WIFI"
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.controller.C4132j.m11194b(android.content.Context):java.lang.String");
    }

    /* renamed from: b */
    public static String m11195b(Map<String, String> map) {
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
                } catch (UnsupportedEncodingException unused) {
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static void m11196b(final Context context, final String str, final Map<String, String> map, final C4136b bVar) {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.xiaomi.xmsf", "com.xiaomi.xmsf.push.service.HttpService");
            if (!context.bindService(intent, new ServiceConnection() {
                /* access modifiers changed from: private */

                /* renamed from: e */
                public boolean f7081e = false;

                public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
                    C4115d.m11118a().mo23037a((C4115d.C4118a) new C4115d.C4118a() {
                        /* renamed from: a */
                        public void mo22986a() {
                            try {
                                bVar.mo23019a(C4952a.C4953a.m15893a(iBinder).mo26036a(C4162q.m11288a(context, str), map));
                                boolean unused = C41331.this.f7081e = true;
                                C4130h.m11172a("connected, do remote http post");
                                context.unbindService(this);
                            } catch (Throwable th) {
                                C4130h.m11176a("error while uploading the logs by IPC.", th);
                                bVar.mo23019a((String) null);
                                boolean unused2 = C41331.this.f7081e = true;
                            }
                        }
                    });
                }

                public void onServiceDisconnected(ComponentName componentName) {
                    C4130h.m11176a("error while perform IPC connection.", (Throwable) null);
                    if (!this.f7081e) {
                        bVar.mo23019a((String) null);
                        C4130h.m11172a("disconnected, remote http post hasn't not processed");
                    }
                }
            }, 1)) {
                C4130h.m11172a("failed to bind");
                bVar.mo23019a((String) null);
            }
        } catch (Exception e) {
            C4130h.m11176a("uploadDataThroughSystemService", (Throwable) e);
            bVar.mo23019a((String) null);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11197c(android.content.Context r8) {
        /*
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSimCountryIso()
            java.lang.String r1 = "CN"
            boolean r0 = r1.equalsIgnoreCase(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0016
            return r1
        L_0x0016:
            java.lang.String r0 = "connectivity"
            java.lang.Object r8 = r8.getSystemService(r0)     // Catch:{ Exception -> 0x0053 }
            android.net.ConnectivityManager r8 = (android.net.ConnectivityManager) r8     // Catch:{ Exception -> 0x0053 }
            if (r8 != 0) goto L_0x0021
            return r1
        L_0x0021:
            android.net.NetworkInfo r8 = r8.getActiveNetworkInfo()     // Catch:{  }
            if (r8 != 0) goto L_0x0028
            return r1
        L_0x0028:
            java.lang.String r2 = r8.getExtraInfo()
            boolean r8 = android.text.TextUtils.isEmpty(r2)
            if (r8 != 0) goto L_0x0053
            int r8 = r2.length()
            r0 = 3
            if (r8 >= r0) goto L_0x003a
            goto L_0x0053
        L_0x003a:
            java.lang.String r8 = "ctwap"
            boolean r8 = r2.contains(r8)
            if (r8 == 0) goto L_0x0043
            return r1
        L_0x0043:
            r3 = 1
            int r8 = r2.length()
            int r4 = r8 + -3
            r6 = 0
            r7 = 3
            java.lang.String r5 = "wap"
            boolean r8 = r2.regionMatches(r3, r4, r5, r6, r7)
            return r8
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.controller.C4132j.m11197c(android.content.Context):boolean");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11198d(android.content.Context r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.controller.C4132j.m11198d(android.content.Context):boolean");
    }
}
