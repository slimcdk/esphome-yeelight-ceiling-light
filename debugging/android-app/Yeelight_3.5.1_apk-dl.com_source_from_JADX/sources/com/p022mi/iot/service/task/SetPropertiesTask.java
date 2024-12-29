package com.p022mi.iot.service.task;

import android.os.RemoteException;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.exception.IotException;
import com.p022mi.iot.common.handler.WritePropertyHandler;
import com.p022mi.iot.common.instance.Device;
import com.p022mi.iot.common.instance.Property;
import com.p022mi.iot.manager.handler.IControlHandler;
import com.p022mi.iot.runtime.CtrlRuntimeManager;
import com.p022mi.iot.runtime.wan.http.bean.PropertyBeen;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mi.iot.service.task.SetPropertiesTask */
public class SetPropertiesTask implements Runnable {
    private static final String TAG = "SetPropertiesTask";
    private WritePropertyHandler mCompletedHandler = new WritePropertyHandler() {
        public void onFailed(IotError iotError) {
            try {
                SetPropertiesTask.this.mHandler.onError(iotError);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void onSucceed(PropertyBeen propertyBeen) {
            List<PropertyBeen.PropertyBean> list;
            if (propertyBeen == null || (list = propertyBeen.propertyBeans) == null || list.isEmpty()) {
                onFailed(IotError.CLIENT_WRITE_PROPERTY_FAIL);
                return;
            }
            try {
                List<PropertyBeen.PropertyBean> list2 = propertyBeen.propertyBeans;
                for (Property property : SetPropertiesTask.this.mProperties) {
                    Iterator<PropertyBeen.PropertyBean> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        PropertyBeen.PropertyBean next = it.next();
                        if (property.getPid().equals(next.pid)) {
                            property.setWriteStatus(next.status);
                            break;
                        }
                    }
                }
                SetPropertiesTask.this.mHandler.onResult(SetPropertiesTask.this.mProperties);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    };
    private Device mDevice;
    /* access modifiers changed from: private */
    public IControlHandler mHandler;
    /* access modifiers changed from: private */
    public List<Property> mProperties;
    private int mVersion = 1;

    public SetPropertiesTask(Device device, List<Property> list, IControlHandler iControlHandler, int i) {
        this.mDevice = device;
        this.mProperties = list;
        this.mHandler = iControlHandler;
        this.mVersion = i;
    }

    public void run() {
        try {
            CtrlRuntimeManager.getInstance().setProperties(this.mDevice, this.mProperties, this.mCompletedHandler, this.mVersion);
        } catch (IotException e) {
            e.printStackTrace();
        }
    }
}
