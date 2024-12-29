package com.squareup.leakcanary;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import java.util.concurrent.Executor;

public final class AndroidWatchExecutor implements Executor {
    static final String LEAK_CANARY_THREAD_NAME = "LeakCanary-Heap-Dump";
    final Handler backgroundHandler;
    final long delayMillis;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    public AndroidWatchExecutor(int i) {
        HandlerThread handlerThread = new HandlerThread(LEAK_CANARY_THREAD_NAME);
        handlerThread.start();
        this.backgroundHandler = new Handler(handlerThread.getLooper());
        this.delayMillis = (long) i;
    }

    private boolean isOnMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void execute(final Runnable runnable) {
        if (isOnMainThread()) {
            executeDelayedAfterIdleUnsafe(runnable);
        } else {
            this.mainHandler.post(new Runnable() {
                public void run() {
                    AndroidWatchExecutor.this.executeDelayedAfterIdleUnsafe(runnable);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void executeDelayedAfterIdleUnsafe(final Runnable runnable) {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
            public boolean queueIdle() {
                AndroidWatchExecutor androidWatchExecutor = AndroidWatchExecutor.this;
                androidWatchExecutor.backgroundHandler.postDelayed(runnable, androidWatchExecutor.delayMillis);
                return false;
            }
        });
    }
}
