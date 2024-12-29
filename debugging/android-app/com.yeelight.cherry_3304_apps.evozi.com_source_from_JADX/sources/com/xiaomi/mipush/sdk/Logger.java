package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.push.C4498ai;
import java.io.File;

public class Logger {
    private static boolean sDisablePushLog = false;
    private static LoggerInterface sUserLogger;

    public static void disablePushFileLog(Context context) {
        sDisablePushLog = true;
        setPushLog(context);
    }

    public static void enablePushFileLog(Context context) {
        sDisablePushLog = false;
        setPushLog(context);
    }

    public static File getLogFile(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    for (int i = 0; i < listFiles.length; i++) {
                        if (listFiles[i].isFile() && !listFiles[i].getName().contains("lock") && listFiles[i].getName().contains("log")) {
                            return listFiles[i];
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (NullPointerException unused) {
            C3989b.m10681d("null pointer exception while retrieve file.");
        }
    }

    protected static LoggerInterface getUserLogger() {
        return sUserLogger;
    }

    private static boolean hasWritePermission(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String equals : strArr) {
                    if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(equals)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void setLogger(Context context, LoggerInterface loggerInterface) {
        sUserLogger = loggerInterface;
        setPushLog(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setPushLog(android.content.Context r5) {
        /*
            com.xiaomi.channel.commonutils.logger.LoggerInterface r0 = sUserLogger
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            boolean r3 = sDisablePushLog
            if (r3 == 0) goto L_0x000e
            goto L_0x0017
        L_0x000e:
            boolean r3 = hasWritePermission(r5)
            r1 = r0
            if (r3 == 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            com.xiaomi.push.dl r3 = new com.xiaomi.push.dl
            r4 = 0
            if (r1 != r2) goto L_0x0020
            com.xiaomi.channel.commonutils.logger.LoggerInterface r1 = sUserLogger
            goto L_0x0021
        L_0x0020:
            r1 = r4
        L_0x0021:
            if (r0 != r2) goto L_0x0028
            com.xiaomi.push.dm r4 = new com.xiaomi.push.dm
            r4.<init>(r5)
        L_0x0028:
            r3.<init>(r1, r4)
            com.xiaomi.channel.commonutils.logger.C3989b.m10674a((com.xiaomi.channel.commonutils.logger.LoggerInterface) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.Logger.setPushLog(android.content.Context):void");
    }

    public static void uploadLogFile(Context context, boolean z) {
        C4498ai.m13271a(context).mo24725a((Runnable) new C4077u(context, z));
    }
}
