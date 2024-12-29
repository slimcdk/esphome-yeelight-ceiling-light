package com.p022mi.iot.service.task;

import android.os.RemoteException;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.exception.IotException;
import com.p022mi.iot.common.handler.CommonHandler;
import com.p022mi.iot.common.instance.Device;
import com.p022mi.iot.manager.listener.IDeviceListener;
import com.p022mi.iot.runtime.CtrlRuntimeManager;
import java.util.List;

/* renamed from: com.mi.iot.service.task.GetDeviceListTask */
public class GetDeviceListTask implements Runnable {
    private static final String TAG = "GetThingsTask";
    /* access modifiers changed from: private */
    public IDeviceListener mIDeviceListener;
    private CommonHandler<List<Device>> mListener = new CommonHandler<List<Device>>() {
        public void onFailed(IotError iotError) {
            try {
                GetDeviceListTask.this.mIDeviceListener.onFailed(iotError);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void onSucceed(List<Device> list) {
            try {
                int size = list.size();
                if (size == 0) {
                    GetDeviceListTask.this.mIDeviceListener.onSucceed((Device) null, 0, 0);
                    return;
                }
                for (int i = 0; i < size; i++) {
                    GetDeviceListTask.this.mIDeviceListener.onSucceed(list.get(i), i, size);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    };
    private int mVersion = 1;

    public GetDeviceListTask(IDeviceListener iDeviceListener, int i) {
        this.mIDeviceListener = iDeviceListener;
        this.mVersion = i;
    }

    public void run() {
        try {
            CtrlRuntimeManager.getInstance().getDeviceList(this.mListener, this.mVersion);
        } catch (IotException e) {
            e.printStackTrace();
            this.mListener.onFailed(e.toIotError());
        }
    }
}
