package com.miot.service.manager.discovery;

import com.miot.common.device.ConnectionType;
import com.miot.common.device.Device;

public class MiotCacheDevice {
    private ConnectionType mConnectionType = ConnectionType.MIOT_WAN;
    private String mDeviceId;
    private String mModel;
    private Device.Ownership mOwnership = Device.Ownership.MINE;

    public MiotCacheDevice(String str, String str2) {
        this.mDeviceId = str;
        this.mModel = str2;
    }

    public ConnectionType getConnectionType() {
        return this.mConnectionType;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getModel() {
        return this.mModel;
    }

    public Device.Ownership getOwnership() {
        return this.mOwnership;
    }
}
