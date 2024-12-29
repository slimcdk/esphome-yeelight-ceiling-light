package com.squareup.leakcanary;

import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;
import com.squareup.leakcanary.internal.FutureResult;
import com.squareup.leakcanary.internal.LeakCanaryInternals;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class AndroidHeapDumper implements HeapDumper {
    private static final String HEAPDUMP_FILE = "suspected_leak_heapdump.hprof";
    final Context context;
    final LeakDirectoryProvider leakDirectoryProvider;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    public AndroidHeapDumper(Context context2, LeakDirectoryProvider leakDirectoryProvider2) {
        this.leakDirectoryProvider = leakDirectoryProvider2;
        this.context = context2.getApplicationContext();
    }

    private void cancelToast(final Toast toast) {
        this.mainHandler.post(new Runnable() {
            public void run() {
                toast.cancel();
            }
        });
    }

    private void showToast(final FutureResult<Toast> futureResult) {
        this.mainHandler.post(new Runnable() {
            public void run() {
                final Toast toast = new Toast(AndroidHeapDumper.this.context);
                toast.setGravity(16, 0, 0);
                toast.setDuration(1);
                toast.setView(LayoutInflater.from(AndroidHeapDumper.this.context).inflate(C3940R.layout.leak_canary_heap_dump_toast, (ViewGroup) null));
                toast.show();
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
                    public boolean queueIdle() {
                        futureResult.set(toast);
                        return false;
                    }
                });
            }
        });
    }

    public void cleanup() {
        LeakCanaryInternals.executeOnFileIoThread(new Runnable() {
            public void run() {
                if (!AndroidHeapDumper.this.leakDirectoryProvider.isLeakStorageWritable()) {
                    CanaryLog.m10641d("Could not attempt cleanup, leak storage not writable.", new Object[0]);
                    return;
                }
                File heapDumpFile = AndroidHeapDumper.this.getHeapDumpFile();
                if (heapDumpFile.exists()) {
                    CanaryLog.m10641d("Previous analysis did not complete correctly, cleaning: %s", heapDumpFile);
                    if (!heapDumpFile.delete()) {
                        CanaryLog.m10641d("Could not delete file %s", heapDumpFile.getPath());
                    }
                }
            }
        });
    }

    public File dumpHeap() {
        if (!this.leakDirectoryProvider.isLeakStorageWritable()) {
            CanaryLog.m10641d("Could not write to leak storage to dump heap.", new Object[0]);
            this.leakDirectoryProvider.requestWritePermission();
        } else {
            File heapDumpFile = getHeapDumpFile();
            try {
                if (!heapDumpFile.createNewFile()) {
                    CanaryLog.m10641d("Could not dump heap, previous analysis still is in progress.", new Object[0]);
                } else {
                    FutureResult futureResult = new FutureResult();
                    showToast(futureResult);
                    if (!futureResult.wait(5, TimeUnit.SECONDS)) {
                        CanaryLog.m10641d("Did not dump heap, too much time waiting for Toast.", new Object[0]);
                    } else {
                        Toast toast = (Toast) futureResult.get();
                        try {
                            Debug.dumpHprofData(heapDumpFile.getAbsolutePath());
                            cancelToast(toast);
                            return heapDumpFile;
                        } catch (Exception e) {
                            cleanup();
                            CanaryLog.m10642d(e, "Could not perform heap dump", new Object[0]);
                        }
                    }
                }
            } catch (IOException e2) {
                cleanup();
                CanaryLog.m10642d(e2, "Could not check if heap dump file exists", new Object[0]);
            }
        }
        return HeapDumper.NO_DUMP;
    }

    /* access modifiers changed from: package-private */
    public File getHeapDumpFile() {
        return new File(this.leakDirectoryProvider.leakDirectory(), HEAPDUMP_FILE);
    }
}
