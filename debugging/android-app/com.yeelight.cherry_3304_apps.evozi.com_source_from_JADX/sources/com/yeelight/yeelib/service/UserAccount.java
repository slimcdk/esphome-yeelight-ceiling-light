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

@UpnpService(serviceId = @UpnpServiceId("UserAccount"), serviceType = @UpnpServiceType(value = "UserAccount", version = 1))
public class UserAccount {
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
        "Trying to fire property change event!, old value: " + str2 + ", new value: " + this.target;
        getPropertyChangeSupport().firePropertyChange("target", str2, this.target);
    }
}
