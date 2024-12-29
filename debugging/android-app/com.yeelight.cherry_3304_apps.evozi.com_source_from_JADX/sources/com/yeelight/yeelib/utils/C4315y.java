package com.yeelight.yeelib.utils;

import android.content.Context;
import android.os.Vibrator;

/* renamed from: com.yeelight.yeelib.utils.y */
public class C4315y {

    /* renamed from: a */
    private static Vibrator f7509a;

    /* renamed from: a */
    public static void m12184a(Context context) {
        f7509a = (Vibrator) context.getSystemService("vibrator");
    }

    /* renamed from: b */
    public static void m12185b() {
        Vibrator vibrator = f7509a;
        if (vibrator != null && vibrator.hasVibrator()) {
            f7509a.vibrate(100);
        }
    }
}
