package com.inuker.bluetooth.library.receiver.listener;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public abstract class AbsBluetoothListener implements Handler.Callback {
    private static final int MSG_INVOKE = 1;
    private static final int MSG_SYNC_INVOKE = 2;
    private Handler mHandler;
    private Handler mSyncHandler;

    public AbsBluetoothListener() {
        if (Looper.myLooper() != null) {
            this.mHandler = new Handler(Looper.myLooper(), this);
            this.mSyncHandler = new Handler(Looper.getMainLooper(), this);
            return;
        }
        throw new IllegalStateException();
    }

    public boolean handleMessage(Message message) {
        Object[] objArr = (Object[]) message.obj;
        int i = message.what;
        if (i == 1) {
            onInvoke(objArr);
        } else if (i == 2) {
            onSyncInvoke(objArr);
        }
        return true;
    }

    public final void invoke(Object... objArr) {
        this.mHandler.obtainMessage(1, objArr).sendToTarget();
    }

    public final void invokeSync(Object... objArr) {
        this.mSyncHandler.obtainMessage(2, objArr).sendToTarget();
    }

    public abstract void onInvoke(Object... objArr);

    public abstract void onSyncInvoke(Object... objArr);
}
