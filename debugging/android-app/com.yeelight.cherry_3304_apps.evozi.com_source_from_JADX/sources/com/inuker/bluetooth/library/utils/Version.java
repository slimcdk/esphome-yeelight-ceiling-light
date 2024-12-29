package com.inuker.bluetooth.library.utils;

import android.os.Build;

public class Version {
    public static boolean isMarshmallow() {
        return Build.VERSION.SDK_INT >= 23;
    }
}
