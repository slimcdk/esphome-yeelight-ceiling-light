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

@UpnpService(serviceId = @UpnpServiceId("DeviceShaking"), serviceType = @UpnpServiceType(value = "DeviceShaking", version = 1))
public class DeviceShaking {
    private final PropertyChangeSupport mPropertyChangeSupport = new PropertyChangeSupport(this);
    @UpnpStateVariable(defaultValue = "0")
    private String status = TimerCodec.DISENABLE;
    @UpnpStateVariable(defaultValue = "0", sendEvents = true)
    private String target = TimerCodec.DISENABLE;

    public PropertyChangeSupport getPropertyChangeSupport() {
        return this.mPropertyChangeSupport;
    }

    @UpnpAction(out = {@UpnpOutputArgument(name = "ResultStatus")})
    public String getStatus() {
        return this.status;
    }

    @UpnpAction(out = {@UpnpOutputArgument(name = "RetTargetValue")})
    public String getTarget() {
        return this.target;
    }

    @UpnpAction
    public void setTarget(@UpnpInputArgument(name = "NewTargetValue") String str) {
        String str2 = this.target;
        this.target = str;
        this.status = str;
        getPropertyChangeSupport().firePropertyChange("target", str2, this.target);
    }
}
