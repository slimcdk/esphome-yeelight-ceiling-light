package com.google.p107ar.sceneform.rendering;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.ar.sceneform.rendering.ThreadPools */
public class ThreadPools {
    private static Executor mainExecutor;
    private static Executor threadPoolExecutor;

    /* renamed from: com.google.ar.sceneform.rendering.ThreadPools$a */
    class C2733a implements Executor {

        /* renamed from: a */
        private final Handler f5271a = new Handler(Looper.getMainLooper());

        C2733a() {
        }

        public void execute(Runnable runnable) {
            this.f5271a.post(runnable);
        }
    }

    private ThreadPools() {
    }

    public static Executor getMainExecutor() {
        if (mainExecutor == null) {
            mainExecutor = new C2733a();
        }
        return mainExecutor;
    }

    public static Executor getThreadPoolExecutor() {
        Executor executor = threadPoolExecutor;
        return executor == null ? AsyncTask.THREAD_POOL_EXECUTOR : executor;
    }

    public static void setMainExecutor(Executor executor) {
        mainExecutor = executor;
    }

    public static void setThreadPoolExecutor(Executor executor) {
        threadPoolExecutor = executor;
    }
}
