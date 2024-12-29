package com.p022mi.iot.common.util;

import android.text.TextUtils;

/* renamed from: com.mi.iot.common.util.SpecUtil */
public class SpecUtil {
    private SpecUtil() {
    }

    public static String getDeviceId(String str) {
        return TextUtils.isEmpty(str) ? "" : str.split("\\.")[0];
    }
}
