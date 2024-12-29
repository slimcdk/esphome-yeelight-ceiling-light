package com.miot.common.utils;

import android.content.Context;
import android.os.Binder;

public class CallerUtil {
    public static String getCallerName(Context context) {
        return context.getPackageManager().getNameForUid(Binder.getCallingUid());
    }
}
