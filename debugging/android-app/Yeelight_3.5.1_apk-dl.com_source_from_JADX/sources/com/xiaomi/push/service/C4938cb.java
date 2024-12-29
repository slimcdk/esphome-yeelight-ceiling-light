package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.C4764hn;

/* renamed from: com.xiaomi.push.service.cb */
final class C4938cb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f9651a;

    /* renamed from: a */
    final /* synthetic */ C4764hn f9652a;

    C4938cb(Context context, C4764hn hnVar) {
        this.f9651a = context;
        this.f9652a = hnVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a A[SYNTHETIC, Splitter:B:25:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            java.lang.Object r0 = com.xiaomi.push.service.C4937ca.f9649a
            monitor-enter(r0)
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            android.content.Context r3 = r5.f9651a     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            java.lang.String r4 = "tiny_data.lock"
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            com.xiaomi.push.C4506ab.m12830a((java.io.File) r2)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            java.lang.String r4 = "rw"
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            java.nio.channels.FileChannel r2 = r3.getChannel()     // Catch:{ Exception -> 0x003e }
            java.nio.channels.FileLock r1 = r2.lock()     // Catch:{ Exception -> 0x003e }
            android.content.Context r2 = r5.f9651a     // Catch:{ Exception -> 0x003e }
            com.xiaomi.push.hn r4 = r5.f9652a     // Catch:{ Exception -> 0x003e }
            com.xiaomi.push.service.C4937ca.m15508c(r2, r4)     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x003a
            boolean r2 = r1.isValid()     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x003a
            r1.release()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r1)     // Catch:{ all -> 0x005b }
        L_0x003a:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r3)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x003e:
            r2 = move-exception
            goto L_0x0045
        L_0x0040:
            r2 = move-exception
            r3 = r1
            goto L_0x005e
        L_0x0043:
            r2 = move-exception
            r3 = r1
        L_0x0045:
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r2)     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x003a
            boolean r2 = r1.isValid()     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x003a
            r1.release()     // Catch:{ IOException -> 0x0054 }
            goto L_0x003a
        L_0x0054:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r1)     // Catch:{ all -> 0x005b }
            goto L_0x003a
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x005b:
            r1 = move-exception
            goto L_0x0072
        L_0x005d:
            r2 = move-exception
        L_0x005e:
            if (r1 == 0) goto L_0x006e
            boolean r4 = r1.isValid()     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x006e
            r1.release()     // Catch:{ IOException -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r1)     // Catch:{ all -> 0x005b }
        L_0x006e:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r3)     // Catch:{ all -> 0x005b }
            throw r2     // Catch:{ all -> 0x005b }
        L_0x0072:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            goto L_0x0075
        L_0x0074:
            throw r1
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4938cb.run():void");
    }
}
