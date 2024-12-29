package com.miot.common.abstractdevice;

import com.miot.common.device.Action;
import com.miot.common.device.Service;
import com.miot.common.property.Property;
import java.io.Serializable;

public abstract class AbstractService implements Serializable {
    private Service mService = null;

    public Action getAction(String str) {
        return this.mService.getAction(str);
    }

    public Property getProperty(String str) {
        return this.mService.getProperty(str);
    }

    public Service getService() {
        return this.mService;
    }

    public Action newAction(String str) {
        return (Action) this.mService.getAction(str).clone();
    }

    public Property newProperty(String str) {
        return (Property) this.mService.getProperty(str).clone();
    }

    public void setService(Service service) {
        this.mService = service;
    }
}
