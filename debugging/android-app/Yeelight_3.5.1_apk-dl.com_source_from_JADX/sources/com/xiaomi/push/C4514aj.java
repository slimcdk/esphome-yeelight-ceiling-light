package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* renamed from: com.xiaomi.push.aj */
public class C4514aj {
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.String, java.nio.channels.FileLock] */
    /* renamed from: a */
    public static boolean m12852a(Context context, String str, long j) {
        RandomAccessFile randomAccessFile;
        if (Build.VERSION.SDK_INT >= 23 && !C4747h.m14134c(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return true;
        }
        ? r0 = 0;
        try {
            File file = new File(new File(context.getExternalFilesDir(r0), "/.vdevdir/"), "lcfp.lock");
            C4506ab.m12830a(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                FileLock lock = randomAccessFile.getChannel().lock();
                boolean b = m12853b(context, str, j);
                if (lock != null && lock.isValid()) {
                    try {
                        lock.release();
                    } catch (IOException unused) {
                    }
                }
                C4506ab.m12831a((Closeable) randomAccessFile);
                return b;
            } catch (IOException e) {
                e = e;
                try {
                    e.printStackTrace();
                    if (r0 != 0 && r0.isValid()) {
                        try {
                            r0.release();
                        } catch (IOException unused2) {
                        }
                    }
                    C4506ab.m12831a((Closeable) randomAccessFile);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    if (r0 != 0 && r0.isValid()) {
                        try {
                            r0.release();
                        } catch (IOException unused3) {
                        }
                    }
                    C4506ab.m12831a((Closeable) randomAccessFile);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            randomAccessFile = r0;
            e.printStackTrace();
            r0.release();
            C4506ab.m12831a((Closeable) randomAccessFile);
            return true;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = r0;
            r0.release();
            C4506ab.m12831a((Closeable) randomAccessFile);
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r1 = r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ad */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m12853b(android.content.Context r16, java.lang.String r17, long r18) {
        /*
            java.io.File r0 = new java.io.File
            r1 = 0
            r2 = r16
            java.io.File r3 = r2.getExternalFilesDir(r1)
            java.lang.String r4 = "/.vdevdir/"
            r0.<init>(r3, r4)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "lcfp"
            r3.<init>(r0, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = r17
            r6.append(r7)
            java.lang.String r8 = ":"
            r6.append(r8)
            java.lang.String r9 = r16.getPackageName()
            r6.append(r9)
            java.lang.String r9 = ","
            r6.append(r9)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            boolean r10 = r3.exists()
            r11 = 1
            if (r10 == 0) goto L_0x00ba
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            java.io.FileReader r12 = new java.io.FileReader     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            r12.<init>(r3)     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            r10.<init>(r12)     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
        L_0x0051:
            java.lang.String r12 = r10.readLine()     // Catch:{ Exception -> 0x00ad }
            if (r12 == 0) goto L_0x00b0
            java.lang.String[] r13 = r12.split(r8)     // Catch:{ Exception -> 0x00ad }
            int r14 = r13.length     // Catch:{ Exception -> 0x00ad }
            r15 = 2
            if (r14 == r15) goto L_0x0060
            goto L_0x0051
        L_0x0060:
            r14 = 0
            r1 = r13[r14]     // Catch:{ Exception -> 0x00ad }
            java.lang.String r14 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x00ad }
            boolean r1 = android.text.TextUtils.equals(r1, r14)     // Catch:{ Exception -> 0x00ad }
            if (r1 == 0) goto L_0x00a4
            r1 = r13[r11]     // Catch:{ Exception -> 0x00ad }
            java.lang.String[] r1 = r1.split(r9)     // Catch:{ Exception -> 0x00ad }
            int r12 = r1.length     // Catch:{ Exception -> 0x00ad }
            if (r12 == r15) goto L_0x0077
            goto L_0x00a7
        L_0x0077:
            r12 = r1[r11]     // Catch:{ Exception -> 0x00ad }
            long r12 = java.lang.Long.parseLong(r12)     // Catch:{ Exception -> 0x00ad }
            r14 = 0
            r1 = r1[r14]     // Catch:{ Exception -> 0x00ad }
            java.lang.String r14 = r16.getPackageName()     // Catch:{ Exception -> 0x00ad }
            boolean r1 = android.text.TextUtils.equals(r1, r14)     // Catch:{ Exception -> 0x00ad }
            if (r1 != 0) goto L_0x00a7
            long r12 = r4 - r12
            long r12 = java.lang.Math.abs(r12)     // Catch:{ Exception -> 0x00ad }
            float r1 = (float) r12
            r12 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r18
            float r12 = (float) r12
            r13 = 1063675494(0x3f666666, float:0.9)
            float r12 = r12 * r13
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a7
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r10)
            r0 = 0
            return r0
        L_0x00a4:
            r0.add(r12)     // Catch:{ Exception -> 0x00ad }
        L_0x00a7:
            r1 = 0
            goto L_0x0051
        L_0x00a9:
            r0 = move-exception
            r1 = 0
            goto L_0x00b6
        L_0x00ac:
            r10 = 0
        L_0x00ad:
            r0.clear()     // Catch:{ all -> 0x00b4 }
        L_0x00b0:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r10)
            goto L_0x00c1
        L_0x00b4:
            r0 = move-exception
            r1 = r10
        L_0x00b6:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r1)
            throw r0
        L_0x00ba:
            boolean r1 = com.xiaomi.push.C4506ab.m12830a((java.io.File) r3)
            if (r1 != 0) goto L_0x00c1
            return r11
        L_0x00c1:
            r0.add(r6)
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x00e8 }
        L_0x00d2:
            boolean r2 = r0.hasNext()     // Catch:{ IOException -> 0x00e8 }
            if (r2 == 0) goto L_0x00f6
            java.lang.Object r2 = r0.next()     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x00e8 }
            r1.write(r2)     // Catch:{ IOException -> 0x00e8 }
            r1.newLine()     // Catch:{ IOException -> 0x00e8 }
            r1.flush()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00d2
        L_0x00e8:
            r0 = move-exception
            goto L_0x00ef
        L_0x00ea:
            r0 = move-exception
            r1 = 0
            goto L_0x00fb
        L_0x00ed:
            r0 = move-exception
            r1 = 0
        L_0x00ef:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00fa }
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r0)     // Catch:{ all -> 0x00fa }
        L_0x00f6:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r1)
            return r11
        L_0x00fa:
            r0 = move-exception
        L_0x00fb:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r1)
            goto L_0x0100
        L_0x00ff:
            throw r0
        L_0x0100:
            goto L_0x00ff
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4514aj.m12853b(android.content.Context, java.lang.String, long):boolean");
    }
}
