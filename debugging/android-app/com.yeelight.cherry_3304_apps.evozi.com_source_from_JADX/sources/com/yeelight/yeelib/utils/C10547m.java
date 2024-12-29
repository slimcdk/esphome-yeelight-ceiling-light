package com.yeelight.yeelib.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Method;

/* renamed from: com.yeelight.yeelib.utils.m */
public class C10547m {
    /* renamed from: a */
    public static int m25751a(Activity activity, float f) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return (int) ((f * displayMetrics.density) + 0.5f);
    }

    /* renamed from: b */
    public static int m25752b(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static int m25753c(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: d */
    public static Point m25754d(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    /* renamed from: e */
    public static int m25755e(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: f */
    public static boolean m25756f(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = (float) displayMetrics.heightPixels;
        float f2 = (float) displayMetrics.widthPixels;
        return ((f > f2 ? 1 : (f == f2 ? 0 : -1)) > 0 ? (double) (f / f2) : (double) (f2 / f)) > 1.86d;
    }

    /* renamed from: g */
    public static int m25757g(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* renamed from: h */
    public static void m25758h(boolean z, Activity activity) {
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
            Window window = activity.getWindow();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z ? i : 0);
            objArr[1] = Integer.valueOf(i);
            method.invoke(window, objArr);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23 && z) {
            activity.getWindow().getDecorView().setSystemUiVisibility(9216);
        }
    }
}
