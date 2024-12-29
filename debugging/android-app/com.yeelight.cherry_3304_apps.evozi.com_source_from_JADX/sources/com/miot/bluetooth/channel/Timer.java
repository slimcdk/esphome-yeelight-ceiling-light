package com.miot.bluetooth.channel;

import android.os.Handler;
import android.os.Looper;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import java.util.concurrent.TimeoutException;

public class Timer {
    private TimerCallback mCallback;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public static abstract class TimerCallback implements Runnable {
        private String name;

        public TimerCallback(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }

        public abstract void onTimerCallback();

        public abstract void resetCallback();

        public final void run() {
            BluetoothLog.m10335e(String.format("%s: Timer expired!!!", new Object[]{this.name}));
            try {
                onTimerCallback();
            } catch (TimeoutException e) {
                BluetoothLog.m10336e((Throwable) e);
            }
            resetCallback();
        }
    }

    private Timer() {
    }

    public static Timer newInstance() {
        return new Timer();
    }

    public synchronized String getName() {
        return isRunning() ? this.mCallback.getName() : "";
    }

    public synchronized boolean isRunning() {
        return this.mCallback != null;
    }

    public synchronized void resetCallback() {
        this.mCallback = null;
    }

    public synchronized void start(TimerCallback timerCallback, long j) {
        this.mHandler.removeCallbacksAndMessages((Object) null);
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper);
        this.mHandler = handler;
        handler.postDelayed(timerCallback, j);
        this.mCallback = timerCallback;
    }

    public synchronized void stop() {
        this.mHandler.removeCallbacksAndMessages((Object) null);
        this.mCallback = null;
    }
}
