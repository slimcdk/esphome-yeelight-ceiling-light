package com.miot.common.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

public class DisplayUtils {
    static final String TAG = "DisplayUtils";

    public static int dip2px(Activity activity, float f) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return (int) ((f * displayMetrics.density) + 0.5f);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int dp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void overridingPendingAnim(Activity activity, int i, int i2) {
        if (activity != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("OverridePending:Activity=");
            sb.append(activity);
            activity.overridePendingTransition(i, i2);
        }
    }

    public static int px2dip(Activity activity, float f) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return (int) ((f / displayMetrics.density) + 0.5f);
    }

    public static int px2dip(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
