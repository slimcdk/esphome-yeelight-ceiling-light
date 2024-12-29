package com.miot.service.manager.discovery;

import com.miot.api.IDeviceHandler;

public interface DeviceScan {
    void setHandler(IDeviceHandler iDeviceHandler);

    void start();

    void stop();
}
