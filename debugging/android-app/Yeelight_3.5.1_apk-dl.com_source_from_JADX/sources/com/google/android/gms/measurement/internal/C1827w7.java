package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;
import java.net.URL;
import java.util.Map;

@WorkerThread
/* renamed from: com.google.android.gms.measurement.internal.w7 */
final class C1827w7 implements Runnable {

    /* renamed from: a */
    private final URL f2747a;

    /* renamed from: b */
    private final String f2748b;

    /* renamed from: c */
    final /* synthetic */ C1839x7 f2749c;

    /* renamed from: d */
    private final C1692l5 f2750d;

    public C1827w7(C1839x7 x7Var, String str, URL url, byte[] bArr, Map map, C1692l5 l5Var, byte[] bArr2) {
        this.f2749c = x7Var;
        C0917i.m1415f(str);
        C0917i.m1419j(url);
        C0917i.m1419j(l5Var);
        this.f2747a = url;
        this.f2750d = l5Var;
        this.f2748b = str;
    }

    /* renamed from: c */
    private final void m4812c(int i, Exception exc, byte[] bArr, Map map) {
        this.f2749c.f2143a.mo14227a().mo14310z(new C1815v7(this, i, exc, bArr, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo14623b(int i, Exception exc, byte[] bArr, Map map) {
        C1692l5 l5Var = this.f2750d;
        l5Var.f2268a.mo14388h(this.f2748b, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[SYNTHETIC, Splitter:B:26:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.x7 r0 = r9.f2749c
            r0.mo14232g()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.x7 r2 = r9.f2749c     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            java.net.URL r3 = r9.f2747a     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            if (r4 == 0) goto L_0x007c
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r3.setDefaultUseCaches(r0)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            com.google.android.gms.measurement.internal.n5 r4 = r2.f2143a     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r4.mo14402z()     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r2.mo14402z()     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r3.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x0079, all -> 0x0076 }
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ IOException -> 0x0073, all -> 0x0070 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0064 }
            r5.<init>()     // Catch:{ all -> 0x0064 }
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ all -> 0x0064 }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0062 }
        L_0x004a:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x0062 }
            if (r8 <= 0) goto L_0x0054
            r5.write(r7, r0, r8)     // Catch:{ all -> 0x0062 }
            goto L_0x004a
        L_0x0054:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x0062 }
            r6.close()     // Catch:{ IOException -> 0x006e, all -> 0x006c }
            r3.disconnect()
            r9.m4812c(r2, r1, r0, r4)
            return
        L_0x0062:
            r0 = move-exception
            goto L_0x0066
        L_0x0064:
            r0 = move-exception
            r6 = r1
        L_0x0066:
            if (r6 == 0) goto L_0x006b
            r6.close()     // Catch:{ IOException -> 0x006e, all -> 0x006c }
        L_0x006b:
            throw r0     // Catch:{ IOException -> 0x006e, all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            goto L_0x0089
        L_0x006e:
            r0 = move-exception
            goto L_0x0097
        L_0x0070:
            r0 = move-exception
            r4 = r1
            goto L_0x0089
        L_0x0073:
            r0 = move-exception
            r4 = r1
            goto L_0x0097
        L_0x0076:
            r2 = move-exception
            r4 = r1
            goto L_0x0087
        L_0x0079:
            r2 = move-exception
            r4 = r1
            goto L_0x0095
        L_0x007c:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            throw r2     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
        L_0x0084:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L_0x0087:
            r0 = r2
            r2 = 0
        L_0x0089:
            if (r3 == 0) goto L_0x008e
            r3.disconnect()
        L_0x008e:
            r9.m4812c(r2, r1, r1, r4)
            throw r0
        L_0x0092:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L_0x0095:
            r0 = r2
            r2 = 0
        L_0x0097:
            if (r3 == 0) goto L_0x009c
            r3.disconnect()
        L_0x009c:
            r9.m4812c(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1827w7.run():void");
    }
}
