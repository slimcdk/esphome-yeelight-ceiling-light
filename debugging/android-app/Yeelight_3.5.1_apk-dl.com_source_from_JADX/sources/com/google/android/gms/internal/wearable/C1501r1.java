package com.google.android.gms.internal.wearable;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.wearable.r1 */
public final class C1501r1 {

    /* renamed from: a */
    public static final int f1835a;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            String str = Build.VERSION.CODENAME;
            if (str.length() == 1 && str.charAt(0) >= 'S' && str.charAt(0) <= 'Z') {
                i = 33554432;
            }
        }
        f1835a = i;
    }

    /* renamed from: a */
    public static PendingIntent m3740a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, 0, intent, i2);
    }
}
