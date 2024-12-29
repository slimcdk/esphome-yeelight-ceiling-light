package miot.bluetooth.security.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.Error;

public abstract class AsyncCallback<R, E extends Error> {
    private static final int MSG_CACHE = 0;
    private static final int MSG_FAILURE = 2;
    private static final int MSG_SUCCESS = 1;
    private Handler mDispatcher;

    private static class Dispatcher<R, E extends Error> extends Handler {
        private AsyncCallback<R, E> mCallback;

        Dispatcher(AsyncCallback asyncCallback, Looper looper) {
            super(looper);
            this.mCallback = asyncCallback;
        }

        public void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 0) {
                    this.mCallback.onCache(message.obj);
                } else if (i == 1) {
                    this.mCallback.onSuccess(message.obj);
                } else if (i == 2) {
                    this.mCallback.onFailure((Error) message.obj);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public AsyncCallback() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            this.mDispatcher = new Dispatcher(this, Looper.getMainLooper());
        } else {
            this.mDispatcher = new Dispatcher(this, myLooper);
        }
    }

    public void onCache(R r) {
    }

    public abstract void onFailure(E e);

    public abstract void onSuccess(R r);

    public void sendCacheMessage(R r) {
        Handler handler = this.mDispatcher;
        handler.sendMessage(handler.obtainMessage(0, r));
    }

    public void sendFailureMessage(E e) {
        Handler handler = this.mDispatcher;
        handler.sendMessage(handler.obtainMessage(2, e));
    }

    public void sendSuccessMessage(R r) {
        Handler handler = this.mDispatcher;
        handler.sendMessage(handler.obtainMessage(1, r));
    }
}
