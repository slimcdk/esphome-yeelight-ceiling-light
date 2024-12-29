package com.yeelight.yeelib.service;

import com.miot.service.manager.timer.TimerCodec;
import java.beans.PropertyChangeSupport;
import org.fourthline.cling.binding.annotations.UpnpAction;
import org.fourthline.cling.binding.annotations.UpnpInputArgument;
import org.fourthline.cling.binding.annotations.UpnpOutputArgument;
import org.fourthline.cling.binding.annotations.UpnpService;
import org.fourthline.cling.binding.annotations.UpnpServiceId;
import org.fourthline.cling.binding.annotations.UpnpServiceType;
import org.fourthline.cling.binding.annotations.UpnpStateVariable;

@UpnpService(serviceId = @UpnpServiceId("ShareDevice"), serviceType = @UpnpServiceType(value = "ShareDevice", version = 1))
public class ShareDevice {
    public static final String sDeviceIdChangeEventName = "DeviceIdChanged";
    public static final String sDeviceIdInputArgument = "NewDeviceIdValue";
    public static final String sDeviceIdOutputArgument = "RetDeviceIdValue";
    public static final String sGetDeviceIdActionName = "GetDeviceId";
    public static final String sGetShakingActionName = "GetShaking";
    public static final String sGetUserIdActionName = "GetUserId";
    public static final String sSetDeviceIdActionName = "SetDeviceId";
    public static final String sSetShakingActionName = "SetShaking";
    public static final String sSetUserIdActionName = "SetUserId";
    public static final String sShakingChangeEventName = "ShakingChanged";
    public static final String sShakingInputArgument = "NewShakingValue";
    public static final String sShakingOutputArgument = "RetShakingValue";
    public static final String sShareDeviceServiceID = "ShareDevice";
    public static final String sUserIdChangeEventName = "UserIdChanged";
    public static final String sUserIdInputArgument = "NewUserIdValue";
    public static final String sUserIdOutputArgument = "RetUserIdValue";
    @UpnpStateVariable(defaultValue = "0", sendEvents = true)
    private String deviceId = TimerCodec.DISENABLE;
    private final PropertyChangeSupport mPropertyChangeSupport = new PropertyChangeSupport(this);
    @UpnpStateVariable(defaultValue = "0", sendEvents = true)
    private String shaking = TimerCodec.DISENABLE;
    @UpnpStateVariable(defaultValue = "0", sendEvents = true)
    private String userId = TimerCodec.DISENABLE;

    @UpnpAction(out = {@UpnpOutputArgument(name = "RetDeviceIdValue")})
    public String getDeviceId() {
        return this.deviceId;
    }

    public PropertyChangeSupport getPropertyChangeSupport() {
        return this.mPropertyChangeSupport;
    }

    @UpnpAction(out = {@UpnpOutputArgument(name = "RetShakingValue")})
    public String getShaking() {
        return this.shaking;
    }

    @UpnpAction(out = {@UpnpOutputArgument(name = "RetUserIdValue")})
    public String getUserId() {
        return this.userId;
    }

    @UpnpAction
    public void setDeviceId(@UpnpInputArgument(name = "NewDeviceIdValue") String str) {
        String str2 = this.deviceId;
        this.deviceId = str;
        getPropertyChangeSupport().firePropertyChange("DeviceIdChanged", str2, this.deviceId);
    }

    @UpnpAction
    public void setShaking(@UpnpInputArgument(name = "NewShakingValue") String str) {
        String str2 = this.shaking;
        this.shaking = str;
        getPropertyChangeSupport().firePropertyChange(sShakingChangeEventName, str2, this.shaking);
    }

    @UpnpAction
    public void setUserId(@UpnpInputArgument(name = "NewUserIdValue") String str) {
        String str2 = this.userId;
        this.userId = str;
        getPropertyChangeSupport().firePropertyChange(sUserIdChangeEventName, str2, this.userId);
    }
}
