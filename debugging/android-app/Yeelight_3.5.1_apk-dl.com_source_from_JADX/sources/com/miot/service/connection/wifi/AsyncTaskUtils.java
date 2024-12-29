package com.miot.service.connection.wifi;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build;

@SuppressLint({"NewApi"})
public abstract class AsyncTaskUtils {
    public static <Params, Progress, Result> void exe(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        if (Build.VERSION.SDK_INT >= 11) {
            asyncTask.executeOnExecutor(ThreadPool.THREAD_POOL_EXECUTOR, paramsArr);
        } else {
            asyncTask.execute(paramsArr);
        }
    }
}
