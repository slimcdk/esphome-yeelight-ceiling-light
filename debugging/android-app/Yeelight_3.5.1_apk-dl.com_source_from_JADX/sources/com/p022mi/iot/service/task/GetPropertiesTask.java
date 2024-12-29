package com.p022mi.iot.service.task;

import android.os.RemoteException;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.exception.IotException;
import com.p022mi.iot.common.handler.CommonHandler;
import com.p022mi.iot.common.instance.Device;
import com.p022mi.iot.common.instance.Property;
import com.p022mi.iot.manager.handler.IControlHandler;
import com.p022mi.iot.runtime.CtrlRuntimeManager;
import java.util.List;

/* renamed from: com.mi.iot.service.task.GetPropertiesTask */
public class GetPropertiesTask implements Runnable {
    private static final String TAG = "GetPropertiesTask";
    private CommonHandler<List<Property>> mCommonHandler = new CommonHandler<List<Property>>() {
        public void onFailed(IotError iotError) {
            try {
                GetPropertiesTask.this.mHandler.onError(iotError);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void onSucceed(List<Property> list) {
            try {
                GetPropertiesTask.this.mHandler.onResult(list);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    };
    private Device mDevice;
    /* access modifiers changed from: private */
    public IControlHandler mHandler;
    private List<Property> mProperties;
    private int mVersion = 1;

    public GetPropertiesTask(Device device, List<Property> list, IControlHandler iControlHandler, int i) {
        this.mDevice = device;
        this.mProperties = list;
        this.mHandler = iControlHandler;
        this.mVersion = i;
    }

    public void run() {
        try {
            CtrlRuntimeManager.getInstance().getProperties(this.mDevice, this.mProperties, this.mCommonHandler, this.mVersion);
        } catch (IotException e) {
            e.printStackTrace();
        }
    }
}
