package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
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

    @Deprecated
    public static File getLogFile(String str) {
        return null;
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (hasWritePermission(r4) != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setPushLog(android.content.Context r4) {
        /*
            com.xiaomi.channel.commonutils.logger.LoggerInterface r0 = sUserLogger
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            boolean r3 = sDisablePushLog
            if (r3 == 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            boolean r3 = hasWritePermission(r4)
            r2 = r0
            if (r3 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            com.xiaomi.push.di r0 = new com.xiaomi.push.di
            r3 = 0
            if (r2 == 0) goto L_0x001f
            com.xiaomi.channel.commonutils.logger.LoggerInterface r2 = sUserLogger
            goto L_0x0020
        L_0x001f:
            r2 = r3
        L_0x0020:
            if (r1 == 0) goto L_0x0026
            com.xiaomi.push.dj r3 = com.xiaomi.push.C4621dj.m13319a((android.content.Context) r4)
        L_0x0026:
            r0.<init>(r2, r3)
            com.xiaomi.channel.commonutils.logger.C4408b.m12473a((com.xiaomi.channel.commonutils.logger.LoggerInterface) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.Logger.setPushLog(android.content.Context):void");
    }

    @Deprecated
    public static void uploadLogFile(Context context, boolean z) {
    }
}
