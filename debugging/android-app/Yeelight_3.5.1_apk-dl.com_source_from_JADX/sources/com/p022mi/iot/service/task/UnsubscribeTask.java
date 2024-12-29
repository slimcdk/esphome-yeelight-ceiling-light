package com.p022mi.iot.service.task;

import android.os.RemoteException;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.exception.IotException;
import com.p022mi.iot.common.handler.CommonHandler;
import com.p022mi.iot.common.instance.Device;
import com.p022mi.iot.common.instance.Property;
import com.p022mi.iot.manager.handler.IControlHandler;
import com.p022mi.iot.runtime.CtrlRuntimeManager;
import com.p022mi.iot.service.push.subscribe.SpecNotificationManager;
import com.p022mi.iot.service.push.subscribe.SubscriptionInfo;
import java.util.List;

/* renamed from: com.mi.iot.service.task.UnsubscribeTask */
public class UnsubscribeTask implements Runnable {
    private static final String TAG = "UnsubscribeTask";
    private Device mDevice;
    private CommonHandler<List<Property>> mHandler = new CommonHandler<List<Property>>() {
        public void onFailed(IotError iotError) {
            try {
                UnsubscribeTask.this.mIHandler.onError(iotError);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void onSucceed(List<Property> list) {
            SubscriptionInfo subscription;
            if (list != null) {
                try {
                    if (list.size() > 0 && (subscription = SpecNotificationManager.getInstance().getSubscription(list.get(0).getPid())) != null) {
                        for (Property next : list) {
                            if (subscription.contain(next.getPid())) {
                                subscription.removeProperty(next.getPid());
                            }
                        }
                        if (subscription.isEmpty()) {
                            SpecNotificationManager.getInstance().removeSubscription(subscription);
                            String.format("remove did=%s subscribe", new Object[]{subscription.getTag()});
                        }
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return;
                }
            }
            UnsubscribeTask.this.mIHandler.onResult(list);
        }
    };
    /* access modifiers changed from: private */
    public IControlHandler mIHandler;
    private List<Property> mProperties;
    private int mVersion = 1;

    public UnsubscribeTask(Device device, List<Property> list, IControlHandler iControlHandler, int i) {
        this.mDevice = device;
        this.mProperties = list;
        this.mIHandler = iControlHandler;
        this.mVersion = i;
    }

    public void run() {
        try {
            CtrlRuntimeManager.getInstance().unsubscribe(this.mDevice, this.mProperties, this.mHandler, this.mVersion);
        } catch (IotException e) {
            e.printStackTrace();
        }
    }
}
