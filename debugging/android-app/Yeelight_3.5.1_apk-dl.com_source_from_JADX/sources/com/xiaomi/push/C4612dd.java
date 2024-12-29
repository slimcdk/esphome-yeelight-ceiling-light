package com.xiaomi.push;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.push.dd */
public class C4612dd {

    /* renamed from: a */
    private static ThreadPoolExecutor f7778a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a */
    public static void m13289a(Context context) {
    }
}
