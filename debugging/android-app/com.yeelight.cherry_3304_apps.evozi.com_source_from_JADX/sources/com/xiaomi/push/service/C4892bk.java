package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.C4743hq;

/* renamed from: com.xiaomi.push.service.bk */
final class C4892bk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f10105a;

    /* renamed from: a */
    final /* synthetic */ C4743hq f10106a;

    C4892bk(Context context, C4743hq hqVar) {
        this.f10105a = context;
        this.f10106a = hqVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a A[SYNTHETIC, Splitter:B:25:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            java.lang.Object r0 = com.xiaomi.push.service.C4891bj.f10104a
            monitor-enter(r0)
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            android.content.Context r3 = r5.f10105a     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            java.lang.String r4 = "tiny_data.lock"
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            com.xiaomi.push.C4942y.m15883a((java.io.File) r2)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            java.lang.String r4 = "rw"
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            java.nio.channels.FileChannel r2 = r3.getChannel()     // Catch:{ Exception -> 0x003e }
            java.nio.channels.FileLock r1 = r2.lock()     // Catch:{ Exception -> 0x003e }
            android.content.Context r2 = r5.f10105a     // Catch:{ Exception -> 0x003e }
            com.xiaomi.push.hq r4 = r5.f10106a     // Catch:{ Exception -> 0x003e }
            com.xiaomi.push.service.C4891bj.m15711c(r2, r4)     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x003a
            boolean r2 = r1.isValid()     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x003a
            r1.release()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r1)     // Catch:{ all -> 0x005b }
        L_0x003a:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r3)     // Catch:{ all -> 0x005b }
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
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r2)     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x003a
            boolean r2 = r1.isValid()     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x003a
            r1.release()     // Catch:{ IOException -> 0x0054 }
            goto L_0x003a
        L_0x0054:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r1)     // Catch:{ all -> 0x005b }
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
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r1)     // Catch:{ all -> 0x005b }
        L_0x006e:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r3)     // Catch:{ all -> 0x005b }
            throw r2     // Catch:{ all -> 0x005b }
        L_0x0072:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            goto L_0x0075
        L_0x0074:
            throw r1
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4892bk.run():void");
    }
}
