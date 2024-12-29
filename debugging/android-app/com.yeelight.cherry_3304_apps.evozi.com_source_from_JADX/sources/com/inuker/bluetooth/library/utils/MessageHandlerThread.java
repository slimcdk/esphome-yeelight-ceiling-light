package com.inuker.bluetooth.library.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

public class MessageHandlerThread extends HandlerThread {
    private static final int DUR_TIME = 7200000;
    private static final int MSG_EMPTY_MSG = 1;
    /* access modifiers changed from: private */
    public Handler mHandler;

    public MessageHandlerThread(String str) {
        super(str);
    }

    public MessageHandlerThread(String str, int i) {
        super(str, i);
    }

    /* access modifiers changed from: package-private */
    public void init() {
        C33621 r0 = new Handler(getLooper()) {
            public void handleMessage(Message message) {
                MessageHandlerThread.this.mHandler.sendEmptyMessageDelayed(1, 7200000);
            }
        };
        this.mHandler = r0;
        r0.sendEmptyMessageDelayed(1, 7200000);
    }

    public void run() {
        try {
            if (Looper.myLooper() == null) {
                super.run();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(getName(), e);
        }
    }

    public synchronized void start() {
        super.start();
        init();
    }
}
