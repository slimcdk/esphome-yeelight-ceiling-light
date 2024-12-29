package com.inuker.bluetooth.library.utils;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public abstract class Task extends AsyncTask<Void, Void, Void> {
    private static Handler mHandler;

    public static void execute(Task task, Executor executor) {
        if (task != null) {
            task.execute(executor);
        }
    }

    public static void executeDelayed(Task task, Executor executor, long j) {
        if (task != null) {
            task.executeDelayed(executor, j);
        }
    }

    public static void executeDelayed(final FutureTask futureTask, final Executor executor, long j) {
        if (futureTask != null && executor != null) {
            getHandler().postDelayed(new Runnable() {
                public void run() {
                    executor.execute(futureTask);
                }
            }, j);
        }
    }

    private static Handler getHandler() {
        if (mHandler == null) {
            synchronized (Task.class) {
                if (mHandler == null) {
                    mHandler = new Handler(Looper.getMainLooper());
                }
            }
        }
        return mHandler;
    }

    /* access modifiers changed from: protected */
    public Void doInBackground(Void... voidArr) {
        doInBackground();
        return null;
    }

    public abstract void doInBackground();

    public void execute(final Executor executor) {
        getHandler().post(new Runnable() {
            public void run() {
                Task task = Task.this;
                Executor executor = executor;
                if (executor == null) {
                    executor = AsyncTask.THREAD_POOL_EXECUTOR;
                }
                task.executeOnExecutor(executor, new Void[0]);
            }
        });
    }

    public void executeDelayed(final Executor executor, long j) {
        getHandler().postDelayed(new Runnable() {
            public void run() {
                Task task = Task.this;
                Executor executor = executor;
                if (executor == null) {
                    executor = AsyncTask.THREAD_POOL_EXECUTOR;
                }
                task.executeOnExecutor(executor, new Void[0]);
            }
        }, j);
    }
}
