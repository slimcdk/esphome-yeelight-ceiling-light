package com.miot.service.view;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@TargetApi(19)
public class TitleBarUtil {
    public static boolean TRANSLUCENT_STATUS_ENABLED = false;

    public static void enableTranslucentStatus(Activity activity) {
        if (activity != null) {
            TRANSLUCENT_STATUS_ENABLED = translucent(activity.getWindow(), true);
        }
    }

    public static void enableTranslucentStatus(Window window) {
        if (window != null) {
            TRANSLUCENT_STATUS_ENABLED = translucent(window, true);
        }
    }

    public static void enableWhiteTranslucentStatus(Activity activity) {
        if (activity != null) {
            TRANSLUCENT_STATUS_ENABLED = translucent(activity.getWindow(), false);
        }
    }

    public static void enableWhiteTranslucentStatus(Window window) {
        if (window != null) {
            TRANSLUCENT_STATUS_ENABLED = translucent(window, false);
        }
    }

    public static int getStatusHeight(Context context) {
        int i;
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            i = context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            i = -1;
        }
        return i == -1 ? (int) TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics()) : i;
    }

    private static boolean setFlymeStatusBarLightMode(Window window, boolean z) {
        if (window == null) {
            return false;
        }
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i = declaredField.getInt((Object) null);
            int i2 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z ? i2 | i : (i ^ -1) & i2);
            window.setAttributes(attributes);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean setMIUIStatusBarLightMode(Window window, boolean z) {
        if (window == null) {
            return false;
        }
        Class<?> cls = window.getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_TRANSPARENT").getInt(cls2);
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
            if (z) {
                int i3 = i2 | i;
                method.invoke(window, new Object[]{Integer.valueOf(i3), Integer.valueOf(i3)});
            } else {
                method.invoke(window, new Object[]{Integer.valueOf(i), Integer.valueOf(i2 | i)});
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setTitleBarPadding(int i, View view) {
        if (TRANSLUCENT_STATUS_ENABLED && view != null) {
            if (view.getLayoutParams().height >= 0) {
                view.getLayoutParams().height += i;
            }
            view.setPadding(0, i, 0, 0);
            view.setLayoutParams(view.getLayoutParams());
        }
    }

    public static void setTitleBarPadding(View view) {
        if (view != null) {
            setTitleBarPadding(getStatusHeight(view.getContext()), view);
        }
    }

    private static boolean translucent(Window window, boolean z) {
        if (Build.BRAND.equalsIgnoreCase("htc") && Build.MODEL.contains("M8w")) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT < 19 || !setMIUIStatusBarLightMode(window, z)) {
                if (Build.VERSION.SDK_INT >= 19 && setFlymeStatusBarLightMode(window, z)) {
                    window.setFlags(67108864, 67108864);
                    return true;
                } else if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
                    window.addFlags(67108864);
                    return true;
                } else if (Build.VERSION.SDK_INT < 21) {
                    return false;
                } else {
                    window.clearFlags(67108864);
                    if (Build.VERSION.SDK_INT < 23 || !z) {
                        window.getDecorView().setSystemUiVisibility(1280);
                    } else {
                        window.getDecorView().setSystemUiVisibility(9472);
                    }
                    window.addFlags(Integer.MIN_VALUE);
                    if (!z || (!Build.BRAND.equalsIgnoreCase("oppo") && !Build.BRAND.equalsIgnoreCase("vivo"))) {
                        window.setStatusBarColor(0);
                        return true;
                    }
                    window.setStatusBarColor(33554431);
                    return true;
                }
            } else if (z) {
                window.setFlags(67108864, 67108864);
                window.addFlags(Integer.MIN_VALUE);
                window.getDecorView().setSystemUiVisibility(8192);
                return true;
            } else {
                window.setFlags(67108864, 67108864);
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & -8193);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
