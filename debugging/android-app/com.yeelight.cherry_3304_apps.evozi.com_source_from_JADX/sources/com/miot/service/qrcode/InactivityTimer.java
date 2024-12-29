package com.miot.service.qrcode;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;

final class InactivityTimer {
    private static final long INACTIVITY_DELAY_MS = 300000;
    /* access modifiers changed from: private */
    public static final String TAG = "InactivityTimer";
    /* access modifiers changed from: private */
    public final Activity activity;
    private AsyncTask<Object, Object, Object> inactivityTask;
    private final BroadcastReceiver powerStatusReceiver = new PowerStatusReceiver();
    private boolean registered = false;

    private final class InactivityAsyncTask extends AsyncTask<Object, Object, Object> {
        private InactivityAsyncTask() {
        }

        /* access modifiers changed from: protected */
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(300000);
                String unused = InactivityTimer.TAG;
                InactivityTimer.this.activity.finish();
                return null;
            } catch (InterruptedException unused2) {
                return null;
            }
        }
    }

    private final class PowerStatusReceiver extends BroadcastReceiver {
        private PowerStatusReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("plugged", -1) <= 0) {
                    InactivityTimer.this.onActivity();
                } else {
                    InactivityTimer.this.cancel();
                }
            }
        }
    }

    InactivityTimer(Activity activity2) {
        this.activity = activity2;
        onActivity();
    }

    /* access modifiers changed from: private */
    public synchronized void cancel() {
        AsyncTask<Object, Object, Object> asyncTask = this.inactivityTask;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.inactivityTask = null;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void onActivity() {
        cancel();
        InactivityAsyncTask inactivityAsyncTask = new InactivityAsyncTask();
        this.inactivityTask = inactivityAsyncTask;
        inactivityAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    }

    public synchronized void onPause() {
        cancel();
        if (this.registered) {
            this.activity.unregisterReceiver(this.powerStatusReceiver);
            this.registered = false;
        }
    }

    public synchronized void onResume() {
        if (!this.registered) {
            this.activity.registerReceiver(this.powerStatusReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.registered = true;
        }
        onActivity();
    }

    /* access modifiers changed from: package-private */
    public void shutdown() {
        cancel();
    }
}
