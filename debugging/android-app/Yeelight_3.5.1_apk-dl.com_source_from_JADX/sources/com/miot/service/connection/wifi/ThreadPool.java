package com.miot.service.connection.wifi;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class ThreadPool {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE = 60;
    private static final int MAXIMUM_POOL_SIZE = 30;
    public static final Executor THREAD_POOL_EXECUTOR;
    private static final BlockingQueue<Runnable> sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        int i = availableProcessors + 1;
        CORE_POOL_SIZE = i;
        C29531 r8 = new ThreadFactory() {
            private final AtomicInteger mCount = new AtomicInteger(1);

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "AsyncTask #" + this.mCount.getAndIncrement());
            }
        };
        sThreadFactory = r8;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        sPoolWorkQueue = linkedBlockingQueue;
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(i, 30, 60, TimeUnit.SECONDS, linkedBlockingQueue, r8);
    }

    public static void execute(Runnable runnable) {
        THREAD_POOL_EXECUTOR.execute(runnable);
    }
}
