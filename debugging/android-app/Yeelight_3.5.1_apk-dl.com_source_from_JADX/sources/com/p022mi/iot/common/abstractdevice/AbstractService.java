package com.p022mi.iot.common.abstractdevice;

import com.p022mi.iot.common.instance.Action;
import com.p022mi.iot.common.instance.Property;
import com.p022mi.iot.common.instance.Service;
import java.io.Serializable;

/* renamed from: com.mi.iot.common.abstractdevice.AbstractService */
public abstract class AbstractService implements Serializable {
    private Service mService;

    public AbstractService() {
    }

    public AbstractService(Service service) {
        this.mService = service;
    }

    public Action getAction(int i) {
        return this.mService.getAction(i);
    }

    public Property getProperty(int i) {
        return this.mService.getProperty(i);
    }

    public Service getService() {
        return this.mService;
    }

    public Action newAction(int i) {
        return new Action(this.mService.getAction(i));
    }

    public Property newProperty(int i) {
        return new Property(this.mService.getProperty(i));
    }

    public void setService(Service service) {
        this.mService = service;
    }
}
