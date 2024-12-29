package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;
import java.net.URL;
import java.util.List;
import java.util.Map;

@WorkerThread
/* renamed from: com.google.android.gms.measurement.internal.i7 */
final class C2209i7 implements Runnable {

    /* renamed from: a */
    private final URL f4195a;

    /* renamed from: b */
    private final C2173f7 f4196b;

    /* renamed from: c */
    private final String f4197c;

    /* renamed from: d */
    private final Map<String, String> f4198d = null;

    /* renamed from: e */
    private final /* synthetic */ C2185g7 f4199e;

    public C2209i7(C2185g7 g7Var, String str, URL url, byte[] bArr, Map<String, String> map, C2173f7 f7Var) {
        this.f4199e = g7Var;
        C1609u.m4471g(str);
        C1609u.m4475k(url);
        C1609u.m4475k(f7Var);
        this.f4195a = url;
        this.f4196b = f7Var;
        this.f4197c = str;
    }

    /* renamed from: c */
    private final void m7132c(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.f4199e.mo12426a().mo13122y(new C2197h7(this, i, exc, bArr, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo12745b(int i, Exception exc, byte[] bArr, Map map) {
        this.f4196b.mo12653a(this.f4197c, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.g7 r0 = r7.f4199e
            r0.mo13107g()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.g7 r2 = r7.f4199e     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            java.net.URL r3 = r7.f4195a     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            java.net.HttpURLConnection r2 = r2.mo12684t(r3)     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f4198d     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            if (r3 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f4198d     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
        L_0x001d:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            r2.addRequestProperty(r5, r4)     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            goto L_0x001d
        L_0x0039:
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            com.google.android.gms.measurement.internal.g7 r4 = r7.f4199e     // Catch:{ IOException -> 0x0055, all -> 0x0050 }
            byte[] r4 = com.google.android.gms.measurement.internal.C2185g7.m7053v(r2)     // Catch:{ IOException -> 0x0055, all -> 0x0050 }
            if (r2 == 0) goto L_0x004c
            r2.disconnect()
        L_0x004c:
            r7.m7132c(r1, r0, r4, r3)
            return
        L_0x0050:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
            goto L_0x0063
        L_0x0055:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
            goto L_0x006f
        L_0x005a:
            r3 = move-exception
            r4 = r0
            goto L_0x0063
        L_0x005d:
            r3 = move-exception
            r4 = r0
            goto L_0x006f
        L_0x0060:
            r3 = move-exception
            r2 = r0
            r4 = r2
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.disconnect()
        L_0x0068:
            r7.m7132c(r1, r0, r0, r4)
            throw r3
        L_0x006c:
            r3 = move-exception
            r2 = r0
            r4 = r2
        L_0x006f:
            if (r2 == 0) goto L_0x0074
            r2.disconnect()
        L_0x0074:
            r7.m7132c(r1, r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2209i7.run():void");
    }
}
