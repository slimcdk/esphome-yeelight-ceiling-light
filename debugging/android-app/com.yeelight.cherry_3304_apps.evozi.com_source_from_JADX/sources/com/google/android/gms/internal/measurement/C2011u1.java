package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.u1 */
public final class C2011u1 {
    /* renamed from: a */
    private static C1965r1 m6039a(File file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        String valueOf = String.valueOf(readLine);
                        if (valueOf.length() != 0) {
                            "Invalid: ".concat(valueOf);
                        } else {
                            new String("Invalid: ");
                        }
                    } else {
                        String str = split[0];
                        String decode = Uri.decode(split[1]);
                        String decode2 = Uri.decode(split[2]);
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new HashMap());
                        }
                        ((Map) hashMap.get(str)).put(decode, decode2);
                    }
                } else {
                    String valueOf2 = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 7);
                    sb.append("Parsed ");
                    sb.append(valueOf2);
                    sb.toString();
                    C1965r1 r1Var = new C1965r1(hashMap);
                    bufferedReader.close();
                    return r1Var;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            C1966r2.m5881b(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public static C1840j2<C1965r1> m6040b(Context context) {
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        String str3 = Build.HARDWARE;
        boolean z = false;
        if ((str.equals("eng") || str.equals("userdebug")) && ((str3.equals("goldfish") || str3.equals("ranchu") || str3.equals("robolectric")) && (str2.contains("dev-keys") || str2.contains("test-keys")))) {
            z = true;
        }
        if (!z) {
            return C1840j2.m5277d();
        }
        if (C1823i1.m5238a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        C1840j2<File> c = m6041c(context);
        return c.mo11699b() ? C1840j2.m5276a(m6039a(c.mo11700c())) : C1840j2.m5277d();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4 = com.google.android.gms.internal.measurement.C1840j2.m5277d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        return r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0028 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.measurement.C1840j2<java.io.File> m6041c(android.content.Context r4) {
        /*
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0030 }
            java.io.File r1 = new java.io.File     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r2 = "phenotype_hermetic"
            r3 = 0
            java.io.File r4 = r4.getDir(r2, r3)     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r2 = "overrides.txt"
            r1.<init>(r4, r2)     // Catch:{ RuntimeException -> 0x0028 }
            boolean r4 = r1.exists()     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x0020
            com.google.android.gms.internal.measurement.j2 r4 = com.google.android.gms.internal.measurement.C1840j2.m5276a(r1)     // Catch:{ all -> 0x0030 }
            goto L_0x0024
        L_0x0020:
            com.google.android.gms.internal.measurement.j2 r4 = com.google.android.gms.internal.measurement.C1840j2.m5277d()     // Catch:{ all -> 0x0030 }
        L_0x0024:
            android.os.StrictMode.setThreadPolicy(r0)
            return r4
        L_0x0028:
            com.google.android.gms.internal.measurement.j2 r4 = com.google.android.gms.internal.measurement.C1840j2.m5277d()     // Catch:{ all -> 0x0030 }
            android.os.StrictMode.setThreadPolicy(r0)
            return r4
        L_0x0030:
            r4 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2011u1.m6041c(android.content.Context):com.google.android.gms.internal.measurement.j2");
    }
}
