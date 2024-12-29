package com.google.android.gms.internal.measurement;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.measurement.g6 */
public final /* synthetic */ class C1108g6 implements C1331u6 {

    /* renamed from: a */
    public final /* synthetic */ Context f1340a;

    public /* synthetic */ C1108g6(Context context) {
        this.f1340a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:60|61) */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x012e */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a A[Catch:{ all -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0136 A[Catch:{ all -> 0x013e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza() {
        /*
            r13 = this;
            android.content.Context r0 = r13.f1340a
            int r1 = com.google.android.gms.internal.measurement.C1252p6.f1519j
            java.lang.String r1 = android.os.Build.TYPE
            java.lang.String r2 = android.os.Build.TAGS
            java.lang.String r3 = "eng"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0019
            java.lang.String r3 = "userdebug"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0019
            goto L_0x002a
        L_0x0019:
            java.lang.String r1 = "dev-keys"
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x0030
            java.lang.String r1 = "test-keys"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            com.google.android.gms.internal.measurement.zzid r0 = com.google.android.gms.internal.measurement.zzid.zzc()
            goto L_0x013d
        L_0x0030:
            boolean r1 = com.google.android.gms.internal.measurement.C1283r5.m2682a()
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.isDeviceProtectedStorage()
            if (r1 != 0) goto L_0x0040
            android.content.Context r0 = r0.createDeviceProtectedStorageContext()
        L_0x0040:
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x013e }
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ RuntimeException -> 0x0060 }
            java.lang.String r4 = "phenotype_hermetic"
            java.io.File r0 = r0.getDir(r4, r2)     // Catch:{ RuntimeException -> 0x0060 }
            java.lang.String r4 = "overrides.txt"
            r3.<init>(r0, r4)     // Catch:{ RuntimeException -> 0x0060 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0060
            com.google.android.gms.internal.measurement.zzid r0 = com.google.android.gms.internal.measurement.zzid.zzd(r3)     // Catch:{ all -> 0x013e }
            goto L_0x0064
        L_0x0060:
            com.google.android.gms.internal.measurement.zzid r0 = com.google.android.gms.internal.measurement.zzid.zzc()     // Catch:{ all -> 0x013e }
        L_0x0064:
            boolean r3 = r0.zzb()     // Catch:{ all -> 0x013e }
            if (r3 == 0) goto L_0x0136
            java.lang.Object r0 = r0.zza()     // Catch:{ all -> 0x013e }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x013e }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x012f }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x012f }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x012f }
            r5.<init>(r0)     // Catch:{ IOException -> 0x012f }
            r4.<init>(r5)     // Catch:{ IOException -> 0x012f }
            r3.<init>(r4)     // Catch:{ IOException -> 0x012f }
            r4 = 1
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0113 }
            r5.<init>()     // Catch:{ all -> 0x0113 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0113 }
            r6.<init>()     // Catch:{ all -> 0x0113 }
        L_0x008a:
            java.lang.String r7 = r3.readLine()     // Catch:{ all -> 0x0113 }
            if (r7 == 0) goto L_0x00f5
            java.lang.String r8 = " "
            r9 = 3
            java.lang.String[] r8 = r7.split(r8, r9)     // Catch:{ all -> 0x0113 }
            int r10 = r8.length     // Catch:{ all -> 0x0113 }
            if (r10 == r9) goto L_0x00a8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0113 }
            r8.<init>()     // Catch:{ all -> 0x0113 }
            java.lang.String r9 = "Invalid: "
            r8.append(r9)     // Catch:{ all -> 0x0113 }
            r8.append(r7)     // Catch:{ all -> 0x0113 }
            goto L_0x008a
        L_0x00a8:
            r7 = r8[r2]     // Catch:{ all -> 0x0113 }
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0113 }
            r9.<init>(r7)     // Catch:{ all -> 0x0113 }
            r7 = r8[r4]     // Catch:{ all -> 0x0113 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0113 }
            r10.<init>(r7)     // Catch:{ all -> 0x0113 }
            java.lang.String r7 = android.net.Uri.decode(r10)     // Catch:{ all -> 0x0113 }
            r10 = 2
            r11 = r8[r10]     // Catch:{ all -> 0x0113 }
            java.lang.Object r11 = r6.get(r11)     // Catch:{ all -> 0x0113 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0113 }
            if (r11 != 0) goto L_0x00dd
            r8 = r8[r10]     // Catch:{ all -> 0x0113 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0113 }
            r10.<init>(r8)     // Catch:{ all -> 0x0113 }
            java.lang.String r11 = android.net.Uri.decode(r10)     // Catch:{ all -> 0x0113 }
            int r8 = r11.length()     // Catch:{ all -> 0x0113 }
            r12 = 1024(0x400, float:1.435E-42)
            if (r8 < r12) goto L_0x00da
            if (r11 != r10) goto L_0x00dd
        L_0x00da:
            r6.put(r10, r11)     // Catch:{ all -> 0x0113 }
        L_0x00dd:
            boolean r8 = r5.containsKey(r9)     // Catch:{ all -> 0x0113 }
            if (r8 != 0) goto L_0x00eb
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0113 }
            r8.<init>()     // Catch:{ all -> 0x0113 }
            r5.put(r9, r8)     // Catch:{ all -> 0x0113 }
        L_0x00eb:
            java.lang.Object r8 = r5.get(r9)     // Catch:{ all -> 0x0113 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x0113 }
            r8.put(r7, r11)     // Catch:{ all -> 0x0113 }
            goto L_0x008a
        L_0x00f5:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0113 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0113 }
            r6.<init>()     // Catch:{ all -> 0x0113 }
            java.lang.String r7 = "Parsed "
            r6.append(r7)     // Catch:{ all -> 0x0113 }
            r6.append(r0)     // Catch:{ all -> 0x0113 }
            com.google.android.gms.internal.measurement.x5 r0 = new com.google.android.gms.internal.measurement.x5     // Catch:{ all -> 0x0113 }
            r0.<init>(r5)     // Catch:{ all -> 0x0113 }
            r3.close()     // Catch:{ IOException -> 0x012f }
            com.google.android.gms.internal.measurement.zzid r0 = com.google.android.gms.internal.measurement.zzid.zzd(r0)     // Catch:{ all -> 0x013e }
            goto L_0x013a
        L_0x0113:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0118 }
            goto L_0x012e
        L_0x0118:
            r3 = move-exception
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x012e }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r5[r2] = r6     // Catch:{ Exception -> 0x012e }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r5 = r6.getDeclaredMethod(r7, r5)     // Catch:{ Exception -> 0x012e }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x012e }
            r4[r2] = r3     // Catch:{ Exception -> 0x012e }
            r5.invoke(r0, r4)     // Catch:{ Exception -> 0x012e }
        L_0x012e:
            throw r0     // Catch:{ IOException -> 0x012f }
        L_0x012f:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x013e }
            r2.<init>(r0)     // Catch:{ all -> 0x013e }
            throw r2     // Catch:{ all -> 0x013e }
        L_0x0136:
            com.google.android.gms.internal.measurement.zzid r0 = com.google.android.gms.internal.measurement.zzid.zzc()     // Catch:{ all -> 0x013e }
        L_0x013a:
            android.os.StrictMode.setThreadPolicy(r1)
        L_0x013d:
            return r0
        L_0x013e:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)
            goto L_0x0144
        L_0x0143:
            throw r0
        L_0x0144:
            goto L_0x0143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1108g6.zza():java.lang.Object");
    }
}
