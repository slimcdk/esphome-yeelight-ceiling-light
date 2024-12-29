package com.xiaomi.push;

import android.os.Looper;

/* renamed from: com.xiaomi.push.ar */
public class C4526ar {
    /* renamed from: a */
    public static void m12889a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new RuntimeException("can't do this on ui thread");
        }
    }
}
