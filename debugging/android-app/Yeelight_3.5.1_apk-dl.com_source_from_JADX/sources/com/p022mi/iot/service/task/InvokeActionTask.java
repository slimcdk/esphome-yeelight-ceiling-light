package com.p022mi.iot.service.task;

import android.os.RemoteException;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.exception.IotException;
import com.p022mi.iot.common.handler.CommonHandler;
import com.p022mi.iot.common.instance.Action;
import com.p022mi.iot.common.instance.Device;
import com.p022mi.iot.manager.handler.IInvokeHandler;
import com.p022mi.iot.runtime.CtrlRuntimeManager;

/* renamed from: com.mi.iot.service.task.InvokeActionTask */
public class InvokeActionTask implements Runnable {
    private static final String TAG = InvokeActionTask.class.getSimpleName();
    private Action mAction;
    private Device mDevice;
    /* access modifiers changed from: private */
    public IInvokeHandler mHandler;
    private int mVersion = 1;

    public InvokeActionTask(Device device, Action action, IInvokeHandler iInvokeHandler, int i) {
        this.mDevice = device;
        this.mAction = action;
        this.mHandler = iInvokeHandler;
        this.mVersion = i;
    }

    public void run() {
        try {
            CtrlRuntimeManager.getInstance().invokeAction(this.mDevice, this.mAction, new CommonHandler<Action>() {
                public void onFailed(IotError iotError) {
                    try {
                        InvokeActionTask.this.mHandler.onError(iotError);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }

                public void onSucceed(Action action) {
                    try {
                        InvokeActionTask.this.mHandler.onResult(action);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }, this.mVersion);
        } catch (IotException e) {
            e.printStackTrace();
        }
    }
}
