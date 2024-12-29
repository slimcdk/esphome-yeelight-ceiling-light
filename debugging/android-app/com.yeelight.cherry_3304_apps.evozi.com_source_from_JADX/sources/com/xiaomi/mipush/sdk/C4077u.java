package com.xiaomi.mipush.sdk;

import android.content.Context;

/* renamed from: com.xiaomi.mipush.sdk.u */
final class C4077u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f6955a;

    /* renamed from: a */
    final /* synthetic */ boolean f6956a;

    C4077u(Context context, boolean z) {
        this.f6955a = context;
        this.f6956a = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            r0 = 0
            android.content.Context r1 = r7.f6955a     // Catch:{ all -> 0x008f }
            java.lang.String r2 = ""
            java.util.HashMap r1 = com.xiaomi.mipush.sdk.C4033ac.m10794a(r1, r2)     // Catch:{ all -> 0x008f }
            boolean r2 = r7.f6956a     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r7.f6955a     // Catch:{ all -> 0x008f }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ all -> 0x008f }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x008f }
            goto L_0x0033
        L_0x0018:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r2.<init>()     // Catch:{ all -> 0x008f }
            android.content.Context r3 = r7.f6955a     // Catch:{ all -> 0x008f }
            java.io.File r3 = r3.getExternalFilesDir(r0)     // Catch:{ all -> 0x008f }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x008f }
            r2.append(r3)     // Catch:{ all -> 0x008f }
            java.lang.String r3 = com.xiaomi.push.C4606dm.f8413a     // Catch:{ all -> 0x008f }
            r2.append(r3)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008f }
        L_0x0033:
            java.io.File r3 = com.xiaomi.mipush.sdk.Logger.getLogFile(r2)     // Catch:{ all -> 0x008f }
            if (r3 != 0) goto L_0x003f
            java.lang.String r1 = "log file null"
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r1)     // Catch:{ all -> 0x008f }
            return
        L_0x003f:
            android.content.Context r4 = r7.f6955a     // Catch:{ all -> 0x008f }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x008f }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r6.<init>()     // Catch:{ all -> 0x008f }
            r6.append(r4)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = ".zip"
            r6.append(r4)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x008f }
            r5.<init>(r2, r4)     // Catch:{ all -> 0x008f }
            com.xiaomi.push.C4942y.m15886a((java.io.File) r5, (java.io.File) r3)     // Catch:{ all -> 0x008c }
            boolean r0 = r5.exists()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0086
            boolean r0 = r7.f6956a     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "https://api.xmpush.xiaomi.com/upload/xmsf_log?file="
            goto L_0x006d
        L_0x006b:
            java.lang.String r0 = "https://api.xmpush.xiaomi.com/upload/app_log?file="
        L_0x006d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r2.<init>()     // Catch:{ all -> 0x008c }
            r2.append(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x008c }
            r2.append(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "file"
            com.xiaomi.push.C4521az.m13361a(r0, r1, r5, r2)     // Catch:{ all -> 0x008c }
            goto L_0x0094
        L_0x0086:
            java.lang.String r0 = "zip log file failed"
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)     // Catch:{ all -> 0x008c }
            goto L_0x0094
        L_0x008c:
            r1 = move-exception
            r0 = r5
            goto L_0x0090
        L_0x008f:
            r1 = move-exception
        L_0x0090:
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r1)
            r5 = r0
        L_0x0094:
            if (r5 == 0) goto L_0x009f
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x009f
            r5.delete()
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C4077u.run():void");
    }
}
