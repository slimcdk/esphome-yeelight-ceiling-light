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
    public static final Executor THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(CORE_POOL_SIZE, 30, 60, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory);
    private static final BlockingQueue<Runnable> sPoolWorkQueue = new LinkedBlockingQueue(128);
    private static final ThreadFactory sThreadFactory = new ThreadFactory() {
        private final AtomicInteger mCount = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.mCount.getAndIncrement());
        }
    };

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = availableProcessors + 1;
    }

    public static void execute(Runnable runnable) {
        THREAD_POOL_EXECUTOR.execute(runnable);
    }
}
