package com.p146mi.iot.service.task;

import android.os.RemoteException;
import com.miot.common.utils.Logger;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.exception.IotException;
import com.p146mi.iot.common.handler.CommonHandler;
import com.p146mi.iot.common.instance.Device;
import com.p146mi.iot.common.instance.Property;
import com.p146mi.iot.manager.handler.IControlHandler;
import com.p146mi.iot.manager.listener.IPropertiesChangedListener;
import com.p146mi.iot.runtime.CtrlRuntimeManager;
import com.p146mi.iot.service.push.subscribe.SpecNotificationManager;
import com.p146mi.iot.service.push.subscribe.SubscriptionInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mi.iot.service.task.SubscribeTask */
public class SubscribeTask implements Runnable {
    private static final String TAG = "SubscribeTask";
    private Device mDevice;
    private CommonHandler<List<Property>> mHandler = new CommonHandler<List<Property>>() {
        public void onFailed(IotError iotError) {
            try {
                SubscribeTask.this.mIHandler.onError(iotError);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void onSucceed(List<Property> list) {
            try {
                SubscribeTask.this.mInfo.clearProperty();
                SubscribeTask.this.mInfo.addProperties(list);
                SpecNotificationManager.getInstance().addSubscription(SubscribeTask.this.mInfo);
                SubscribeTask.this.mIHandler.onResult(list);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    };
    /* access modifiers changed from: private */
    public IControlHandler mIHandler;
    private IPropertiesChangedListener mIListener;
    /* access modifiers changed from: private */
    public SubscriptionInfo mInfo;
    private List<Property> mProperties = new ArrayList();
    private int mVersion = 1;

    public SubscribeTask(Device device, List<Property> list, IControlHandler iControlHandler, IPropertiesChangedListener iPropertiesChangedListener, int i) {
        this.mDevice = device;
        this.mProperties.addAll(list);
        this.mIHandler = iControlHandler;
        this.mIListener = iPropertiesChangedListener;
        SubscriptionInfo subscriptionInfo = new SubscriptionInfo();
        this.mInfo = subscriptionInfo;
        subscriptionInfo.addProperties(this.mProperties);
        this.mInfo.setListener(this.mIListener);
        this.mVersion = i;
    }

    public void run() {
        String tag = this.mInfo.getTag();
        SubscriptionInfo containSubscription = SpecNotificationManager.getInstance().containSubscription(tag);
        if (containSubscription != null) {
            containSubscription.addProperties(this.mProperties);
            containSubscription.setListener(this.mIListener);
            this.mHandler.onSucceed(this.mProperties);
            Logger.m10629d(TAG, String.format("did=%s, already sub", new Object[]{tag}));
            return;
        }
        try {
            CtrlRuntimeManager.getInstance().subscribe(this.mDevice, this.mProperties, this.mHandler, this.mVersion);
        } catch (IotException e) {
            e.printStackTrace();
        }
    }
}
