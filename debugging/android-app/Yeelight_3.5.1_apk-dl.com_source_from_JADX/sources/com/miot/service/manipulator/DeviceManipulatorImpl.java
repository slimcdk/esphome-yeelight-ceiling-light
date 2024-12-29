package com.miot.service.manipulator;

import android.content.Context;
import com.miot.api.ICompletionHandler;
import com.miot.api.IDeviceManipulator;
import com.miot.api.IInvokeCompletionHandler;
import com.miot.api.IPropertyChangedListener;
import com.miot.api.IReadPropertyCompletionHandler;
import com.miot.common.device.invocation.ActionInfo;
import com.miot.common.device.invocation.PropertyInfo;
import com.miot.common.people.People;
import com.miot.common.utils.Logger;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.manipulator.subscribe.NotificationInfo;
import java.util.concurrent.ThreadPoolExecutor;

public class DeviceManipulatorImpl extends IDeviceManipulator.Stub {
    private static final String TAG = "DeviceManipulatorImpl";
    private Context mContext;
    private ThreadPoolExecutor mExecutor;

    public DeviceManipulatorImpl(Context context, ThreadPoolExecutor threadPoolExecutor) {
        this.mContext = context;
        this.mExecutor = threadPoolExecutor;
    }

    public void addPropertyChangedListener(People people, PropertyInfo propertyInfo, ICompletionHandler iCompletionHandler, IPropertyChangedListener iPropertyChangedListener) {
        if (propertyInfo.getProperties().size() == 0) {
            iCompletionHandler.onFailed(1004, "property is empty");
        }
        NotificationInfo notificationInfo = new NotificationInfo();
        notificationInfo.setPropertyInfo(propertyInfo);
        notificationInfo.setListener(iPropertyChangedListener);
        Logger.m7499d(TAG, String.format("addPropertyChangedListener: [%s].[%s]", new Object[]{propertyInfo.getInvokeInfo().getDeviceId(), propertyInfo.getServiceType()}));
        this.mExecutor.execute(new SubscribePropertyTask(people, notificationInfo, iCompletionHandler));
    }

    public void enableLanCtrl(boolean z) {
        ServiceManager.getInstance().getDeviceManipulator().enableLanCtrl(z);
    }

    public void invoke(People people, ActionInfo actionInfo, IInvokeCompletionHandler iInvokeCompletionHandler) {
        Logger.m7499d(TAG, String.format("invoke: [%s].[%s]", new Object[]{actionInfo.getInvokeInfo().getDeviceId(), actionInfo.getFriendlyName()}));
        this.mExecutor.execute(new InvokeActionTask(people, this.mContext, actionInfo, iInvokeCompletionHandler));
    }

    public boolean isLanCtrlEnabled() {
        return ServiceManager.getInstance().getDeviceManipulator().isLanCtrlEnabled();
    }

    public void readProperty(People people, PropertyInfo propertyInfo, IReadPropertyCompletionHandler iReadPropertyCompletionHandler) {
        Logger.m7499d(TAG, String.format("readProperty: [%s].[%s]", new Object[]{propertyInfo.getInvokeInfo().getDeviceId(), propertyInfo.getServiceType()}));
        this.mExecutor.execute(new GetPropertyTask(people, this.mContext, propertyInfo, iReadPropertyCompletionHandler));
    }

    public void removePropertyChangedListener(People people, PropertyInfo propertyInfo, ICompletionHandler iCompletionHandler) {
        if (propertyInfo.getProperties().size() == 0) {
            iCompletionHandler.onFailed(1004, "property is empty");
        }
        NotificationInfo notificationInfo = new NotificationInfo();
        notificationInfo.setPropertyInfo(propertyInfo);
        Logger.m7499d(TAG, String.format("removePropertyChangedListener: [%s].[%s]", new Object[]{propertyInfo.getInvokeInfo().getDeviceId(), propertyInfo.getServiceType()}));
        this.mExecutor.execute(new UnsubscribePropertyTask(people, notificationInfo, iCompletionHandler));
    }
}
