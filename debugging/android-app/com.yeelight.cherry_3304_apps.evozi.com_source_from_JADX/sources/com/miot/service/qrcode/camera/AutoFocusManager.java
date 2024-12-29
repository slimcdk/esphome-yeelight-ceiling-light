package com.miot.service.qrcode.camera;

import android.content.Context;
import android.hardware.Camera;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;

final class AutoFocusManager implements Camera.AutoFocusCallback {
    private static final long AUTO_FOCUS_INTERVAL_MS = 2000;
    private static final Collection<String> FOCUS_MODES_CALLING_AF;
    private static final String TAG = AutoFocusManager.class.getSimpleName();
    private final Camera camera;
    private boolean focusing;
    private AsyncTask<?, ?, ?> outstandingTask;
    private boolean stopped;
    private final boolean useAutoFocus;

    private final class AutoFocusTask extends AsyncTask<Object, Object, Object> {
        private AutoFocusTask() {
        }

        /* access modifiers changed from: protected */
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(AutoFocusManager.AUTO_FOCUS_INTERVAL_MS);
            } catch (InterruptedException unused) {
            }
            AutoFocusManager.this.start();
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        FOCUS_MODES_CALLING_AF = arrayList;
        arrayList.add("auto");
        FOCUS_MODES_CALLING_AF.add("macro");
    }

    AutoFocusManager(Context context, Camera camera2) {
        this.camera = camera2;
        String focusMode = camera2.getParameters().getFocusMode();
        this.useAutoFocus = FOCUS_MODES_CALLING_AF.contains(focusMode);
        "Current focus mode '" + focusMode + "'; use auto focus? " + this.useAutoFocus;
        start();
    }

    private synchronized void autoFocusAgainLater() {
        if (!this.stopped && this.outstandingTask == null) {
            AutoFocusTask autoFocusTask = new AutoFocusTask();
            try {
                autoFocusTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.outstandingTask = autoFocusTask;
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    private synchronized void cancelOutstandingTask() {
        if (this.outstandingTask != null) {
            if (this.outstandingTask.getStatus() != AsyncTask.Status.FINISHED) {
                this.outstandingTask.cancel(true);
            }
            this.outstandingTask = null;
        }
    }

    public synchronized void onAutoFocus(boolean z, Camera camera2) {
        this.focusing = false;
        autoFocusAgainLater();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void start() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.useAutoFocus     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001c
            r0 = 0
            r1.outstandingTask = r0     // Catch:{ all -> 0x001e }
            boolean r0 = r1.stopped     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            boolean r0 = r1.focusing     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            android.hardware.Camera r0 = r1.camera     // Catch:{ RuntimeException -> 0x0019 }
            r0.autoFocus(r1)     // Catch:{ RuntimeException -> 0x0019 }
            r0 = 1
            r1.focusing = r0     // Catch:{ RuntimeException -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r1.autoFocusAgainLater()     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r1)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.qrcode.camera.AutoFocusManager.start():void");
    }

    /* access modifiers changed from: package-private */
    public synchronized void stop() {
        this.stopped = true;
        if (this.useAutoFocus) {
            cancelOutstandingTask();
            try {
                this.camera.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }
}
