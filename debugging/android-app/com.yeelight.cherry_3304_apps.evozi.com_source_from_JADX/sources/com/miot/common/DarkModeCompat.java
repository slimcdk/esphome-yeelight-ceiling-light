package com.miot.common;

import android.content.Context;

public class DarkModeCompat {
    private static final String TAG = "DarkModeCompat";

    public static boolean isDarkMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
