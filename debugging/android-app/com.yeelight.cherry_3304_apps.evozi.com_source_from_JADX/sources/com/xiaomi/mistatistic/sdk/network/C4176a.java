package com.xiaomi.mistatistic.sdk.network;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.mistatistic.sdk.network.a */
public class C4176a {

    /* renamed from: a */
    private static int f7166a = 2;

    /* renamed from: b */
    private static int f7167b = 2;

    /* renamed from: c */
    private static int f7168c = 2;

    /* renamed from: d */
    private static BlockingQueue<Runnable> f7169d = new LinkedBlockingQueue();

    /* renamed from: e */
    private static ThreadPoolExecutor f7170e = new ThreadPoolExecutor(f7166a, f7167b, (long) f7168c, TimeUnit.SECONDS, f7169d);

    /* renamed from: a */
    public static ThreadPoolExecutor m11319a() {
        return f7170e;
    }
}
