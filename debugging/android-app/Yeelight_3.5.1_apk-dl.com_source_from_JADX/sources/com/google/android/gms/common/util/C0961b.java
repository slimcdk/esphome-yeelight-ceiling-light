package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.b */
public class C0961b {
    @Nullable

    /* renamed from: a */
    private static String f1173a;

    /* renamed from: b */
    private static int f1174b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1589a() {
        /*
            java.lang.String r0 = f1173a
            if (r0 != 0) goto L_0x0058
            int r0 = f1174b
            if (r0 != 0) goto L_0x000e
            int r0 = android.os.Process.myPid()
            f1174b = r0
        L_0x000e:
            r1 = 0
            if (r0 > 0) goto L_0x0012
            goto L_0x0056
        L_0x0012:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            r2.<init>()     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            r2.append(r0)     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0048 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0048 }
            r4.<init>(r0)     // Catch:{ all -> 0x0048 }
            r3.<init>(r4)     // Catch:{ all -> 0x0048 }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x0053, all -> 0x0045 }
            com.google.android.gms.common.internal.C0917i.m1419j(r0)     // Catch:{ IOException -> 0x0053, all -> 0x0045 }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException -> 0x0053, all -> 0x0045 }
            goto L_0x0053
        L_0x0045:
            r0 = move-exception
            r1 = r3
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            throw r0     // Catch:{ IOException -> 0x0052, all -> 0x004d }
        L_0x004d:
            r0 = move-exception
        L_0x004e:
            com.google.android.gms.common.util.C0960a.m1588a(r1)
            throw r0
        L_0x0052:
            r3 = r1
        L_0x0053:
            com.google.android.gms.common.util.C0960a.m1588a(r3)
        L_0x0056:
            f1173a = r1
        L_0x0058:
            java.lang.String r0 = f1173a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C0961b.m1589a():java.lang.String");
    }
}
