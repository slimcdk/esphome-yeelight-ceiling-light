package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4529bc;
import com.xiaomi.push.C4532bf;
import com.xiaomi.push.C4743hq;
import com.xiaomi.push.C4812p;
import java.util.Arrays;

/* renamed from: com.xiaomi.push.service.bj */
public class C4891bj {

    /* renamed from: a */
    public static final Object f10104a = new Object();

    /* renamed from: a */
    public static void m15707a(Context context, C4743hq hqVar) {
        if (C4890bi.m15706a(hqVar.mo25279e())) {
            C4498ai.m13271a(context).mo24725a((Runnable) new C4892bk(context, hqVar));
        }
    }

    /* renamed from: a */
    public static byte[] m15708a(Context context) {
        String a = C4812p.m15373a(context).mo25850a("mipush", "td_key", "");
        if (TextUtils.isEmpty(a)) {
            a = C4532bf.m13430a(20);
            C4812p.m15373a(context).mo25850a("mipush", "td_key", a);
        }
        return m15709a(a);
    }

    /* renamed from: a */
    private static byte[] m15709a(String str) {
        byte[] copyOf = Arrays.copyOf(C4529bc.m13418a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15711c(android.content.Context r7, com.xiaomi.push.C4743hq r8) {
        /*
            byte[] r0 = m15708a((android.content.Context) r7)
            r1 = 0
            byte[] r2 = com.xiaomi.push.C4776iw.m15225a(r8)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            byte[] r0 = com.xiaomi.push.C4722h.m14493b(r0, r2)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            java.lang.String r2 = "  ts:"
            if (r0 == 0) goto L_0x007f
            int r3 = r0.length     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            r4 = 1
            if (r3 >= r4) goto L_0x0017
            goto L_0x007f
        L_0x0017:
            int r3 = r0.length     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            r5 = 10240(0x2800, float:1.4349E-41)
            if (r3 <= r5) goto L_0x0045
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            r7.<init>()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            java.lang.String r0 = "TinyData write to cache file failed case too much data content item:"
            r7.append(r0)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            java.lang.String r0 = r8.mo25277d()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            r7.append(r0)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            r7.append(r2)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            r7.append(r2)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
        L_0x003b:
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r7)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r1)
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r1)
            return
        L_0x0045:
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            java.io.File r7 = r7.getFilesDir()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            java.lang.String r3 = "tiny_data.data"
            r2.<init>(r7, r3)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            r7.<init>(r3)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            int r2 = r0.length     // Catch:{ IOException -> 0x007a, Exception -> 0x0075, all -> 0x0070 }
            byte[] r2 = com.xiaomi.push.C4492ac.m13261a((int) r2)     // Catch:{ IOException -> 0x007a, Exception -> 0x0075, all -> 0x0070 }
            r7.write(r2)     // Catch:{ IOException -> 0x007a, Exception -> 0x0075, all -> 0x0070 }
            r7.write(r0)     // Catch:{ IOException -> 0x007a, Exception -> 0x0075, all -> 0x0070 }
            r7.flush()     // Catch:{ IOException -> 0x007a, Exception -> 0x0075, all -> 0x0070 }
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r1)
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r7)
            goto L_0x00da
        L_0x0070:
            r8 = move-exception
            r0 = r7
            r7 = r8
            goto L_0x00dc
        L_0x0075:
            r0 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
            goto L_0x00a4
        L_0x007a:
            r0 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
            goto L_0x00bc
        L_0x007f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            r7.<init>()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            java.lang.String r0 = "TinyData write to cache file failed case encryption fail item:"
            r7.append(r0)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            java.lang.String r0 = r8.mo25277d()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            r7.append(r0)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            r7.append(r2)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            r7.append(r2)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00a2, all -> 0x009f }
            goto L_0x003b
        L_0x009f:
            r7 = move-exception
            r0 = r1
            goto L_0x00dc
        L_0x00a2:
            r7 = move-exception
            r0 = r1
        L_0x00a4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            r2.<init>()     // Catch:{ all -> 0x00db }
            java.lang.String r3 = "TinyData write to cache file  failed item:"
            r2.append(r3)     // Catch:{ all -> 0x00db }
            java.lang.String r8 = r8.mo25277d()     // Catch:{ all -> 0x00db }
            r2.append(r8)     // Catch:{ all -> 0x00db }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x00db }
            goto L_0x00d1
        L_0x00ba:
            r7 = move-exception
            r0 = r1
        L_0x00bc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            r2.<init>()     // Catch:{ all -> 0x00db }
            java.lang.String r3 = "TinyData write to cache file failed cause io exception item:"
            r2.append(r3)     // Catch:{ all -> 0x00db }
            java.lang.String r8 = r8.mo25277d()     // Catch:{ all -> 0x00db }
            r2.append(r8)     // Catch:{ all -> 0x00db }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x00db }
        L_0x00d1:
            com.xiaomi.channel.commonutils.logger.C3989b.m10677a((java.lang.String) r8, (java.lang.Throwable) r7)     // Catch:{ all -> 0x00db }
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r1)
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r0)
        L_0x00da:
            return
        L_0x00db:
            r7 = move-exception
        L_0x00dc:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r1)
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r0)
            goto L_0x00e4
        L_0x00e3:
            throw r7
        L_0x00e4:
            goto L_0x00e3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4891bj.m15711c(android.content.Context, com.xiaomi.push.hq):void");
    }
}
