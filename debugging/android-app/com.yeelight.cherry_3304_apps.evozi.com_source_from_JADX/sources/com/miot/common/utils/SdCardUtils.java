package com.miot.common.utils;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;

public class SdCardUtils {
    private static final String WRITE_PERMISSION = "android.permission.WRITE_EXTERNAL_STORAGE";

    public static long getSDCardAvailableBytes() {
        if (isSDCardBusy()) {
            return 0;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
    }

    private static boolean hasWritePermission(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String equals : strArr) {
                    if (TextUtils.equals(WRITE_PERMISSION, equals)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isSDCardBusy() {
        return !Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isSDCardFull() {
        return getSDCardAvailableBytes() <= 102400;
    }

    public static boolean isSDCardUnavailable() {
        return Environment.getExternalStorageState().equals("removed");
    }

    public static boolean isSDCardUseful() {
        return !isSDCardBusy() && !isSDCardFull() && !isSDCardUnavailable();
    }
}
