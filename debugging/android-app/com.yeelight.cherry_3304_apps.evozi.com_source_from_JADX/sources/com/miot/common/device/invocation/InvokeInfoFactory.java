package com.miot.common.device.invocation;

import com.miot.common.device.Service;

public class InvokeInfoFactory {
    public static InvokeInfo create(Service service) {
        InvokeInfo invokeInfo = new InvokeInfo();
        invokeInfo.setParentDeviceId(service.getParentDeviceId());
        invokeInfo.setDeviceId(service.getDeviceId());
        invokeInfo.setModel(service.getDeviceModel());
        invokeInfo.setToken(service.getToken());
        invokeInfo.setConnectionType(service.getConnectionType());
        invokeInfo.setConnectionInfo(service.getConnectionInfo());
        return invokeInfo;
    }
}
