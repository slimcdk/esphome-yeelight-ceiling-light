package com.miot.service.manipulator.subscribe;

import com.miot.api.IPropertyChangedListener;
import com.miot.common.device.ConnectionType;
import com.miot.common.device.invocation.PropertyInfo;
import com.miot.common.property.Property;

public class NotificationInfo {
    private IPropertyChangedListener mListener;
    private PropertyInfo mPropertyInfo;

    public boolean containProperty(String str) {
        return this.mPropertyInfo.getProperty(str) != null;
    }

    public ConnectionType getConnectionType() {
        return this.mPropertyInfo.getInvokeInfo().getConnectionType();
    }

    public String getDeviceId() {
        return this.mPropertyInfo.getInvokeInfo().getDeviceId();
    }

    public IPropertyChangedListener getListener() {
        return this.mListener;
    }

    public Property getProperty(String str) {
        return this.mPropertyInfo.getProperty(str);
    }

    public PropertyInfo getPropertyInfo() {
        return this.mPropertyInfo;
    }

    public String getServiceType() {
        return this.mPropertyInfo.getServiceType();
    }

    public void setListener(IPropertyChangedListener iPropertyChangedListener) {
        this.mListener = iPropertyChangedListener;
    }

    public void setPropertyInfo(PropertyInfo propertyInfo) {
        this.mPropertyInfo = propertyInfo;
    }
}
