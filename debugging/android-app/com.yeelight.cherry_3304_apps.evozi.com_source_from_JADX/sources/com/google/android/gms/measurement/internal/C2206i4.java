package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;
import java.net.URL;
import java.util.Map;

@WorkerThread
/* renamed from: com.google.android.gms.measurement.internal.i4 */
final class C2206i4 implements Runnable {

    /* renamed from: a */
    private final URL f4185a;

    /* renamed from: b */
    private final byte[] f4186b;

    /* renamed from: c */
    private final C2182g4 f4187c;

    /* renamed from: d */
    private final String f4188d;

    /* renamed from: e */
    private final Map<String, String> f4189e;

    /* renamed from: f */
    private final /* synthetic */ C2158e4 f4190f;

    public C2206i4(C2158e4 e4Var, String str, URL url, byte[] bArr, Map<String, String> map, C2182g4 g4Var) {
        this.f4190f = e4Var;
        C1609u.m4471g(str);
        C1609u.m4475k(url);
        C1609u.m4475k(g4Var);
        this.f4185a = url;
        this.f4186b = bArr;
        this.f4187c = g4Var;
        this.f4188d = str;
        this.f4189e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d1 A[SYNTHETIC, Splitter:B:48:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010c A[SYNTHETIC, Splitter:B:61:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.e4 r1 = r13.f4190f
            r1.mo13107g()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.e4 r3 = r13.f4190f     // Catch:{ IOException -> 0x0105, all -> 0x00ca }
            java.net.URL r4 = r13.f4185a     // Catch:{ IOException -> 0x0105, all -> 0x00ca }
            java.net.HttpURLConnection r3 = r3.mo12651u(r4)     // Catch:{ IOException -> 0x0105, all -> 0x00ca }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f4189e     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            if (r4 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f4189e     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
        L_0x001f:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            goto L_0x001f
        L_0x003b:
            byte[] r4 = r13.f4186b     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            if (r4 == 0) goto L_0x0088
            com.google.android.gms.measurement.internal.e4 r4 = r13.f4190f     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.p9 r4 = r4.mo12778n()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            byte[] r5 = r13.f4186b     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            byte[] r4 = r4.mo12892W(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.e4 r5 = r13.f4190f     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo12427b()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo13104O()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r6 = "Uploading data. size"
            int r7 = r4.length     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r5.mo13131b(r6, r7)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            int r5 = r4.length     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r3.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r3.connect()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r5.write(r4)     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            r5.close()     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            goto L_0x0088
        L_0x007c:
            r4 = move-exception
            r10 = r1
            r2 = r4
            r1 = r5
            goto L_0x00ce
        L_0x0082:
            r4 = move-exception
            r10 = r1
            r8 = r4
            r1 = r5
            goto L_0x0109
        L_0x0088:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00bf, all -> 0x00ba }
            com.google.android.gms.measurement.internal.e4 r2 = r13.f4190f     // Catch:{ IOException -> 0x00b6, all -> 0x00b1 }
            byte[] r10 = com.google.android.gms.measurement.internal.C2158e4.m7003w(r3)     // Catch:{ IOException -> 0x00b6, all -> 0x00b1 }
            if (r3 == 0) goto L_0x009b
            r3.disconnect()
        L_0x009b:
            com.google.android.gms.measurement.internal.e4 r0 = r13.f4190f
            com.google.android.gms.measurement.internal.x4 r0 = r0.mo12426a()
            com.google.android.gms.measurement.internal.f4 r1 = new com.google.android.gms.measurement.internal.f4
            java.lang.String r6 = r13.f4188d
            com.google.android.gms.measurement.internal.g4 r7 = r13.f4187c
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x00ad:
            r0.mo13122y(r1)
            return
        L_0x00b1:
            r4 = move-exception
            r2 = r4
            r7 = r8
            r10 = r11
            goto L_0x00cf
        L_0x00b6:
            r4 = move-exception
            r7 = r8
            r10 = r11
            goto L_0x00c2
        L_0x00ba:
            r4 = move-exception
            r10 = r1
            r2 = r4
            r7 = r8
            goto L_0x00cf
        L_0x00bf:
            r4 = move-exception
            r10 = r1
            r7 = r8
        L_0x00c2:
            r8 = r4
            goto L_0x010a
        L_0x00c4:
            r4 = move-exception
            r10 = r1
            goto L_0x00cd
        L_0x00c7:
            r4 = move-exception
            r10 = r1
            goto L_0x0108
        L_0x00ca:
            r4 = move-exception
            r3 = r1
            r10 = r3
        L_0x00cd:
            r2 = r4
        L_0x00ce:
            r7 = 0
        L_0x00cf:
            if (r1 == 0) goto L_0x00e9
            r1.close()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00e9
        L_0x00d5:
            r1 = move-exception
            com.google.android.gms.measurement.internal.e4 r4 = r13.f4190f
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13096F()
            java.lang.String r5 = r13.f4188d
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r5)
            r4.mo13132c(r0, r5, r1)
        L_0x00e9:
            if (r3 == 0) goto L_0x00ee
            r3.disconnect()
        L_0x00ee:
            com.google.android.gms.measurement.internal.e4 r0 = r13.f4190f
            com.google.android.gms.measurement.internal.x4 r0 = r0.mo12426a()
            com.google.android.gms.measurement.internal.f4 r1 = new com.google.android.gms.measurement.internal.f4
            java.lang.String r5 = r13.f4188d
            com.google.android.gms.measurement.internal.g4 r6 = r13.f4187c
            r8 = 0
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo13122y(r1)
            throw r2
        L_0x0105:
            r4 = move-exception
            r3 = r1
            r10 = r3
        L_0x0108:
            r8 = r4
        L_0x0109:
            r7 = 0
        L_0x010a:
            if (r1 == 0) goto L_0x0124
            r1.close()     // Catch:{ IOException -> 0x0110 }
            goto L_0x0124
        L_0x0110:
            r1 = move-exception
            com.google.android.gms.measurement.internal.e4 r2 = r13.f4190f
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()
            java.lang.String r4 = r13.f4188d
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r4)
            r2.mo13132c(r0, r4, r1)
        L_0x0124:
            if (r3 == 0) goto L_0x0129
            r3.disconnect()
        L_0x0129:
            com.google.android.gms.measurement.internal.e4 r0 = r13.f4190f
            com.google.android.gms.measurement.internal.x4 r0 = r0.mo12426a()
            com.google.android.gms.measurement.internal.f4 r1 = new com.google.android.gms.measurement.internal.f4
            java.lang.String r5 = r13.f4188d
            com.google.android.gms.measurement.internal.g4 r6 = r13.f4187c
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2206i4.run():void");
    }
}
